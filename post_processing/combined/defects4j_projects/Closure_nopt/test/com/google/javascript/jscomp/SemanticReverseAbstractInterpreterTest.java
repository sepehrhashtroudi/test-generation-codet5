/*
 * Copyright 2007 The Closure Compiler Authors.
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

import com.google.common.collect.Sets;
import com.google.javascript.jscomp.type.FlowScope;
import com.google.javascript.jscomp.type.ReverseAbstractInterpreter;
import com.google.javascript.jscomp.type.SemanticReverseAbstractInterpreter;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.JSType;

import java.util.Arrays;
import java.util.Collection;

public class SemanticReverseAbstractInterpreterTest
    extends CompilerTypeTestCase {
  private CodingConvention codingConvention = new GoogleCodingConvention();
  private ReverseAbstractInterpreter interpreter;
  private Scope functionScope;

  @Override
  protected void setUp() throws Exception {
    super.setUp();

    interpreter = new SemanticReverseAbstractInterpreter(
        codingConvention, registry);
  }

  public FlowScope newScope() {
    Scope globalScope = Scope.createGlobalScope(new Node(Token.EMPTY));
    functionScope = new Scope(globalScope, new Node(Token.EMPTY));
    return LinkedFlowScope.createEntryLattice(functionScope);
  }

  /**
   * Tests reverse interpretation of a NAME expression.
   */
  

  /**
   * Tests reverse interpretation of a NOT(NAME) expression.
   */
  

  /**
   * Tests reverse interpretation of a ASSIGN expression.
   */
  

  /**
   * Tests reverse interpretation of a SHEQ(NAME, NUMBER) expression.
   */
  

  /**
   * Tests reverse interpretation of a SHEQ(NUMBER, NAME) expression.
   */
  

  /**
   * Tests reverse interpretation of a SHEQ(NAME, NAME) expression.
   */
  

  

  

  

  /**
   * Tests reverse interpretation of a SHNE(NAME, NUMBER) expression.
   */
  

  /**
   * Tests reverse interpretation of a SHNE(NUMBER, NAME) expression.
   */
  

  /**
   * Tests reverse interpretation of a SHNE(NAME, NAME) expression.
   */
  

  

  

  

  /**
   * Tests reverse interpretation of a EQ(NAME, NULL) expression.
   */
  

  /**
   * Tests reverse interpretation of a NE(NULL, NAME) expression.
   */
  

  /**
   * Tests reverse interpretation of a EQ(NAME, NULL) expression.
   */
  

  /**
   * Tests reverse interpretation of two undefineds.
   */
  

  /**
   * Tests reverse interpretation of a COMPARE(NAME, NUMBER) expression,
   * where COMPARE can be LE, LT, GE or GT.
   */
  

  /**
   * Tests reverse interpretation of a COMPARE(NAME, NAME) expression,
   * where COMPARE can be LE, LT, GE or GT.
   */
  

  /**
   * Tests reverse interpretation of a COMPARE(NUMBER-untyped, NAME) expression,
   * where COMPARE can be LE, LT, GE or GT.
   */
  

  

  

  

  

  

  

  

  

  

  private void testBinop(FlowScope blind, int binop, Node left, Node right,
      Collection<TypedName> trueOutcome,
      Collection<TypedName> falseOutcome) {
    Node condition = new Node(binop);
    condition.addChildToBack(left);
    condition.addChildToBack(right);

    // true outcome.
    FlowScope informedTrue = interpreter.
        getPreciserScopeKnowingConditionOutcome(condition, blind, true);
    for (TypedName p : trueOutcome) {
      assertTypeEquals(p.name, p.type, getVarType(informedTrue, p.name));
    }

    // false outcome.
    FlowScope informedFalse = interpreter.
        getPreciserScopeKnowingConditionOutcome(condition, blind, false);
    for (TypedName p : falseOutcome) {
      assertTypeEquals(p.type, getVarType(informedFalse, p.name));
    }
  }

  private Node createNull() {
    Node n = new Node(Token.NULL);
    n.setJSType(NULL_TYPE);
    return n;
  }

  private Node createNumber(int n) {
    Node number = createUntypedNumber(n);
    number.setJSType(NUMBER_TYPE);
    return number;
  }

  private Node createUntypedNumber(int n) {
    return Node.newNumber(n);
  }

  private JSType getVarType(FlowScope scope, String name) {
    return scope.getSlot(name).getType();
  }

  private Node createVar(FlowScope scope, String name, JSType type) {
    Node n = Node.newString(Token.NAME, name);
    functionScope.declare(name, n, null, null);
    ((LinkedFlowScope) scope).inferSlotType(name, type);
    n.setJSType(type);
    return n;
  }

  private static class TypedName {
    private final String name;
    private final JSType type;

    private TypedName(String name, JSType type) {
      this.name = name;
      this.type = type;
    }
  }
}
