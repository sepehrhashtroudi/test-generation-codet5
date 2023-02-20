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

import com.google.javascript.jscomp.DataFlowAnalysis.FlowState;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.rhino.InputId;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

import junit.framework.TestCase;

/**
 * Tests for {@link LiveVariablesAnalysis}. Test cases are snippets of a
 * function and assertions are made at the instruction labeled with {@code X}.
 *
 */
public class LiveVariableAnalysisTest extends TestCase {

  private LiveVariablesAnalysis liveness = null;

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  private void assertLiveBeforeX(String src, String var) {
    FlowState<LiveVariablesAnalysis.LiveVariableLattice> state =
        getFlowStateAtX(src);
    assertNotNull(src + " should contain a label 'X:'", state);
    assertTrue("Variable" + var + " should be live before X", state.getIn()
        .isLive(liveness.getVarIndex(var)));
  }

  private void assertLiveAfterX(String src, String var) {
    FlowState<LiveVariablesAnalysis.LiveVariableLattice> state =
        getFlowStateAtX(src);
    assertTrue("Label X should be in the input program.", state != null);
    assertTrue("Variable" + var + " should be live after X", state.getOut()
        .isLive(liveness.getVarIndex(var)));
  }

  private void assertNotLiveAfterX(String src, String var) {
    FlowState<LiveVariablesAnalysis.LiveVariableLattice> state =
        getFlowStateAtX(src);
    assertTrue("Label X should be in the input program.", state != null);
    assertTrue("Variable" + var + " should not be live after X", !state
        .getOut().isLive(liveness.getVarIndex(var)));
  }

  private void assertNotLiveBeforeX(String src, String var) {
    FlowState<LiveVariablesAnalysis.LiveVariableLattice> state =
        getFlowStateAtX(src);
    assertTrue("Label X should be in the input program.", state != null);
    assertTrue("Variable" + var + " should not be live before X", !state
        .getIn().isLive(liveness.getVarIndex(var)));
  }

  private FlowState<LiveVariablesAnalysis.LiveVariableLattice> getFlowStateAtX(
      String src) {
    liveness = computeLiveness(src);
    return getFlowStateAtX(liveness.getCfg().getEntry().getValue(), liveness
        .getCfg());
  }

  private FlowState<LiveVariablesAnalysis.LiveVariableLattice> getFlowStateAtX(
      Node node, ControlFlowGraph<Node> cfg) {
    if (node.isLabel()) {
      if (node.getFirstChild().getString().equals("X")) {
        return cfg.getNode(node.getLastChild()).getAnnotation();
      }
    }
    for (Node c = node.getFirstChild(); c != null; c = c.getNext()) {
      FlowState<LiveVariablesAnalysis.LiveVariableLattice> state =
          getFlowStateAtX(c, cfg);
      if (state != null) {
        return state;
      }
    }
    return null;
  }

  private static void assertEscaped(String src, String name) {
    for (Var var : computeLiveness(src).getEscapedLocals()) {
      if (var.name.equals(name)) {
        return;
      }
    }
    fail("Variable " + name + " should be in the escaped local list.");
  }

  private static void assertNotEscaped(String src, String name) {
    for (Var var : computeLiveness(src).getEscapedLocals()) {
      assertFalse(var.name.equals(name));
    }
  }

  private static LiveVariablesAnalysis computeLiveness(String src) {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.setCodingConvention(new GoogleCodingConvention());
    compiler.initOptions(options);
    src = "function _FUNCTION(param1, param2){" + src + "}";
    Node n = compiler.parseTestCode(src).removeFirstChild();
    Node script = new Node(Token.SCRIPT, n);
    script.setInputId(new InputId("test"));
    assertEquals(0, compiler.getErrorCount());
    Scope scope = new SyntacticScopeCreator(compiler).createScope(
        n, Scope.createGlobalScope(script));
    ControlFlowAnalysis cfa = new ControlFlowAnalysis(compiler, false, true);
    cfa.process(null, n);
    ControlFlowGraph<Node> cfg = cfa.getCfg();
    LiveVariablesAnalysis analysis =
        new LiveVariablesAnalysis(cfg, scope, compiler);
    analysis.analyze();
    return analysis;
  }
}
