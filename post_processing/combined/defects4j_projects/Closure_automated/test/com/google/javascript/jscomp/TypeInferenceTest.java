/*
 * Copyright 2008 The Closure Compiler Authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.javascript.jscomp;

import static com.google.javascript.rhino.jstype.JSTypeNative.ALL_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.ARRAY_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.BOOLEAN_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.CHECKED_UNKNOWN_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.FUNCTION_INSTANCE_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.NO_RESOLVED_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.NULL_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_OBJECT_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.OBJECT_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.STRING_OBJECT_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.STRING_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.VOID_TYPE;

import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.google.javascript.jscomp.CodingConvention.AssertionFunctionSpec;
import com.google.javascript.jscomp.CompilerOptions.LanguageMode;
import com.google.javascript.jscomp.DataFlowAnalysis.BranchedFlowState;
import com.google.javascript.jscomp.type.FlowScope;
import com.google.javascript.jscomp.type.ReverseAbstractInterpreter;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.EnumType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.jstype.StaticSlot;
import com.google.javascript.rhino.testing.Asserts;

import junit.framework.TestCase;

import java.util.Map;

/**
 * Tests {@link TypeInference}.
 *
 */
public class TypeInferenceTest extends TestCase {

  private Compiler compiler;
  private JSTypeRegistry registry;
  private Map<String, JSType> assumptions;
  private JSType assumedThisType;
  private FlowScope returnScope;
  private static final Map<String, AssertionFunctionSpec>
      ASSERTION_FUNCTION_MAP = Maps.newHashMap();
  static {
    for (AssertionFunctionSpec func :
        new ClosureCodingConvention().getAssertionFunctions()) {
      ASSERTION_FUNCTION_MAP.put(func.getFunctionName(), func);
    }
  }

  @Override
  public void setUp() {
    compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.setClosurePass(true);
    options.setLanguageIn(LanguageMode.ECMASCRIPT5);
    compiler.initOptions(options);
    registry = compiler.getTypeRegistry();
    assumptions = Maps.newHashMap();
    returnScope = null;
  }

  private void assumingThisType(JSType type) {
    assumedThisType = type;
  }

  private void assuming(String name, JSType type) {
    assumptions.put(name, type);
  }

  private void assuming(String name, JSTypeNative type) {
    assuming(name, registry.getNativeType(type));
  }

  private void inFunction(String js) {
    // Parse the body of the function.
    String thisBlock = assumedThisType == null
        ? ""
        : "/** @this {" + assumedThisType + "} */";
    Node root = compiler.parseTestCode(
        "(" + thisBlock + " function() {" + js + "});");
    assertEquals("parsing error: " +
        Joiner.on(", ").join(compiler.getErrors()),
        0, compiler.getErrorCount());

    Node n = root.getFirstChild().getFirstChild();
    // Create the scope with the assumptions.
    TypedScopeCreator scopeCreator = new TypedScopeCreator(compiler);
    Scope assumedScope = scopeCreator.createScope(
        n, scopeCreator.createScope(root, null));
    for (Map.Entry<String,JSType> entry : assumptions.entrySet()) {
      assumedScope.declare(entry.getKey(), null, entry.getValue(), null, false);
    }
    // Create the control graph.
    ControlFlowAnalysis cfa = new ControlFlowAnalysis(compiler, false, false);
    cfa.process(null, n);
    ControlFlowGraph<Node> cfg = cfa.getCfg();
    // Create a simple reverse abstract interpreter.
    ReverseAbstractInterpreter rai = compiler.getReverseAbstractInterpreter();
    // Do the type inference by data-flow analysis.
    TypeInference dfa = new TypeInference(compiler, cfg, rai, assumedScope,
        ASSERTION_FUNCTION_MAP);
    dfa.analyze();
    // Get the scope of the implicit return.
    BranchedFlowState<FlowScope> rtnState =
        cfg.getImplicitReturn().getAnnotation();
    returnScope = rtnState.getIn();
  }

  private JSType getType(String name) {
    assertTrue("The return scope should not be null.", returnScope != null);
    StaticSlot<JSType> var = returnScope.getSlot(name);
    assertTrue("The variable " + name + " is missing from the scope.",
        var != null);
    return var.getType();
  }

  private void verify(String name, JSType type) {
    Asserts.assertTypeEquals("Mismatch for " + name, type, getType(name));
  }

  private void verify(String name, JSTypeNative type) {
    verify(name, registry.getNativeType(type));
  }

  private void verifySubtypeOf(String name, JSType type) {
    JSType varType = getType(name);
    assertTrue("The variable " + name + " is missing a type.", varType != null);
    assertTrue("The type " + varType + " of variable " + name +
        " is not a subtype of " + type +".",  varType.isSubtype(type));
  }

  private void verifySubtypeOf(String name, JSTypeNative type) {
    verifySubtypeOf(name, registry.getNativeType(type));
  }

  private EnumType createEnumType(String name, JSTypeNative elemType) {
    return createEnumType(name, registry.getNativeType(elemType));
  }

  private EnumType createEnumType(String name, JSType elemType) {
    return registry.createEnumType(name, null, elemType);
  }

  private JSType createUndefinableType(JSTypeNative type) {
    return registry.createUnionType(
        registry.getNativeType(type), registry.getNativeType(VOID_TYPE));
  }

  private JSType createNullableType(JSTypeNative type) {
    return createNullableType(registry.getNativeType(type));
  }

  private JSType createNullableType(JSType type) {
    return registry.createNullableType(type);
  }

  private JSType createUnionType(JSTypeNative type1, JSTypeNative type2) {
    return registry.createUnionType(
        registry.getNativeType(type1), registry.getNativeType(type2));
  }

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  private ObjectType getNativeObjectType(JSTypeNative t) {
    return registry.getNativeObjectType(t);
  }

  private JSType getNativeType(JSTypeNative t) {
    return registry.getNativeType(t);
  }

  private JSType parameterize(ObjectType objType, JSType t) {
    return registry.createParameterizedType(objType, t);
  }
}
