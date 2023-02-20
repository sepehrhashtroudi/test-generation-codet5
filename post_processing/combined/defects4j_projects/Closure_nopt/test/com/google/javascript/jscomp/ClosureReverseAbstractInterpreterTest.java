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

import com.google.javascript.jscomp.type.ClosureReverseAbstractInterpreter;
import com.google.javascript.jscomp.type.FlowScope;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.testing.Asserts;

public class ClosureReverseAbstractInterpreterTest extends
    CompilerTypeTestCase {

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  private void testClosureFunction(String function, JSType type,
      JSType trueType, JSType falseType) {
    // function(a) where a : type
    Node n = compiler.parseTestCode("var a; " + function + "(a)");
    Node call = n.getLastChild().getLastChild();
    Node name = call.getLastChild();

    Scope scope = new SyntacticScopeCreator(compiler).createScope(n, null);
    FlowScope flowScope = LinkedFlowScope.createEntryLattice(scope);

    assertEquals(Token.CALL, call.getType());
    assertEquals(Token.NAME, name.getType());

    GoogleCodingConvention convention = new GoogleCodingConvention();
    flowScope.inferSlotType("a", type);
    ClosureReverseAbstractInterpreter rai =
        new ClosureReverseAbstractInterpreter(convention, registry);

    // trueScope
    Asserts.assertTypeEquals(
        trueType,
        rai.getPreciserScopeKnowingConditionOutcome(call, flowScope, true)
        .getSlot("a").getType());

    // falseScope
    Asserts.assertTypeEquals(
        falseType,
        rai.getPreciserScopeKnowingConditionOutcome(call, flowScope, false)
        .getSlot("a").getType());
  }
}
