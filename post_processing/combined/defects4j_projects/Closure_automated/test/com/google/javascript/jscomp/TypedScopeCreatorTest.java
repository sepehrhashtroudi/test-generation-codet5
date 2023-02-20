/*
 * Copyright 2009 The Closure Compiler Authors.
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

import static com.google.javascript.jscomp.TypedScopeCreator.CTOR_INITIALIZER;
import static com.google.javascript.jscomp.TypedScopeCreator.IFACE_INITIALIZER;
import static com.google.javascript.rhino.jstype.JSTypeNative.BOOLEAN_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.OBJECT_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.STRING_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.UNKNOWN_TYPE;

import com.google.common.base.Predicate;
import com.google.common.collect.Lists;
import com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback;
import com.google.javascript.jscomp.NodeTraversal.Callback;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.EnumType;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.jstype.ObjectType;
import com.google.javascript.rhino.testing.Asserts;

import java.util.Deque;

/**
 * Tests for {@link TypedScopeCreator} and {@link TypeInference}. Admittedly,
 * the name is a bit of a misnomer.
 * @author nicksantos@google.com (Nick Santos)
 */
public class TypedScopeCreatorTest extends CompilerTestCase {

  private JSTypeRegistry registry;
  private Scope globalScope;
  private Scope lastLocalScope;

  @Override
  public int getNumRepetitions() {
    return 1;
  }

  private final Callback callback = new AbstractPostOrderCallback() {
    @Override
    public void visit(NodeTraversal t, Node n, Node parent) {
      Scope s = t.getScope();
      if (s.isGlobal()) {
        globalScope = s;
      } else {
        lastLocalScope = s;
      }
    }
  };

  @Override
  public CompilerPass getProcessor(final Compiler compiler) {
    registry = compiler.getTypeRegistry();
    return new CompilerPass() {
      @Override
      public void process(Node externs, Node root) {
        MemoizedScopeCreator scopeCreator =
            new MemoizedScopeCreator(new TypedScopeCreator(compiler));
        Scope topScope = scopeCreator.createScope(root.getParent(), null);
        (new TypeInferencePass(
            compiler, compiler.getReverseAbstractInterpreter(),
            topScope, scopeCreator)).process(externs, root);
        NodeTraversal t = new NodeTraversal(
            compiler, callback, scopeCreator);
        t.traverseRoots(Lists.newArrayList(externs, root));
      }
    };
  }

public void testNamespacedConstructorAlias21() { 
     testSame("var goog = {};" + "/** @constructor */ goog.Foo = function() {};" + "/** @constructor */ goog.FooAlias = goog.Foo;"); 
     assertEquals("goog.Foo", registry.getType("goog.FooAlias").toString()); 
     Asserts.assertTypeEquals(registry.getType("goog.Foo"), registry.getType("goog.FooAlias")); 
 }
public void testTemplateType7b52() { 
     testSame("var goog = {};\n" + "goog.array = {};\n" + "/**\n" + " * @param {Array.<T>} arr\n" + " * @param {function(this:S, !T, number, !Array.<T>):boolean} f\n" + " * @param {!S=} opt_obj\n" + " * @return {!Array.<T>}\n" + " * @template T,S\n" + " */\n" + "goog.array.filter = function(arr, f, opt_obj) {\n" + "  var res = [];\n" + "  for (var i = 0; i < arr.length; i++) {\n" + "     if (f.call(opt_obj, arr[i], i, arr)) {\n" + "        res.push(val);\n" + "     }\n" + "  }\n" + "  return res;\n" + "}" + "/** @constructor */\n" + "function Foo() {}\n" + "/** @type {Array.<string>} */\n" + "var arr = [];\n" + "var result = goog.array.filter(arr," + "  function(a,b,c) {var self=this;}, new Foo());"); 
     assertEquals("Foo", findNameType("self", lastLocalScope).toString()); 
     assertEquals("string", findNameType("a", lastLocalScope).toString()); 
     assertEquals("number", findNameType("b", lastLocalScope).toString()); 
     assertEquals("Array.<string>", findNameType("c", lastLocalScope).toString()); 
     assertEquals("Array.<string>", findNameType("result", globalScope).toString()); 
 }
public void testCollectedFunctionStub176() { 
     testSame("/** @constructor */ function f() { " + "  /** @return {number} */ this.foo;" + "}" + "var x = new f();"); 
     ObjectType x = (ObjectType) findNameType("x", globalScope); 
     assertEquals("f", x.toString()); 
     assertTrue(x.hasProperty("foo")); 
     assertEquals("function (this:f): number", x.getPropertyType("foo").toString()); 
     assertFalse(x.isPropertyTypeInferred("foo")); 
 }
public void testNamespacedEnum177() { 
     testSame("var goog = {}; goog.ui = {};" + "/** @constructor */goog.ui.Zippy = function() {};" + "/** @enum{string} */goog.ui.Zippy.EventType = { TOGGLE: 'toggle' };" + "var x = goog.ui.Zippy.EventType;" + "var y = goog.ui.Zippy.EventType.TOGGLE;"); 
     ObjectType x = (ObjectType) findNameType("x", globalScope); 
     assertTrue(x.isEnumType()); 
     assertTrue(x.hasProperty("TOGGLE")); 
     assertEquals("enum{goog.ui.Zippy.EventType}", x.getReferenceName()); 
     ObjectType y = (ObjectType) findNameType("y", globalScope); 
     assertTrue(y.isSubtype(getNativeType(STRING_TYPE))); 
     assertTrue(y.isEnumElementType()); 
     assertEquals("goog.ui.Zippy.EventType", y.getReferenceName()); 
 }
public void testGlobalQualifiedNameInLocalScope178() { 
     testSame("var ns = {}; " + "(function() { " + "    /** @param {number} x */ ns.foo = function(x) {}; })();" + "(function() { ns.foo(3); })();"); 
     assertNotNull(globalScope.getVar("ns.foo")); 
     assertEquals("function (number): undefined", globalScope.getVar("ns.foo").getType().toString()); 
 }
  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  // TODO(johnlenz): A syntax for stubs using object literals?

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  


  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  private JSType findNameType(final String name, Scope scope) {
    return findTypeOnMatchedNode(new Predicate<Node>() {
      @Override public boolean apply(Node n) {
        return name.equals(n.getQualifiedName());
      }
    }, scope);
  }

  private String findNameTypeStr(final String name, Scope scope) {
    return findNameType(name, scope).toString();
  }

  private JSType findTokenType(final int type, Scope scope) {
    return findTypeOnMatchedNode(new Predicate<Node>() {
      @Override public boolean apply(Node n) {
        return type == n.getType();
      }
    }, scope);
  }

  private JSType findTypeOnMatchedNode(Predicate<Node> matcher, Scope scope) {
    Node root = scope.getRootNode();
    Deque<Node> queue = Lists.newLinkedList();
    queue.push(root);
    while (!queue.isEmpty()) {
      Node current = queue.pop();
      if (matcher.apply(current) &&
          current.getJSType() != null) {
        return current.getJSType();
      }

      for (Node child : current.children()) {
        queue.push(child);
      }
    }
    return null;
  }

  private JSType getNativeType(JSTypeNative type) {
    return registry.getNativeType(type);
  }

  private ObjectType getNativeObjectType(JSTypeNative type) {
    return (ObjectType) registry.getNativeType(type);
  }
}
