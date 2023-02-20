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

import com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback;
import com.google.javascript.rhino.Node;
import junit.framework.TestCase;

/**
 * Tests for {@link MustBeReachingVariableDef}.
 *
 */
public class MustBeReachingVariableDefTest extends TestCase {

  private MustBeReachingVariableDef defUse = null;
  private Node def = null;
  private Node use = null;

  public static final String EXTERNS = "var goog = {}";

public void testAnnotatedLinkedDirectedGraphEdge3805() { final String node1 = "node1"; final String node2 = "node2"; final String node3 = "node3"; final String node4 = "node4"; final String node5 = "node5"; final String node6 = "node6"; final String node7 = "node7"; final String node8 = "node8"; final String node9 = "node9"; final String node10 = "node10"; final String node11 = "node11"; final String node12 = "node12"; final String node13 = "node13"; final String node14 = "node14"; final String node15 = "node15";
}

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  /**
   * The use of x at U: is the definition of x at D:.
   */
  private void assertMatch(String src) {
    computeDefUse(src);
    assertSame(def, defUse.getDefNode("x", use));
  }

  /**
   * The use of x at U: is not the definition of x at D:.
   */
  private void assertNotMatch(String src) {
    computeDefUse(src);
    assertNotSame(def, defUse.getDefNode("x", use));
  }

  /**
   * Computes reaching definition on given source.
   */
  private void computeDefUse(String src) {
    Compiler compiler = new Compiler();
    src = "function _FUNCTION(param1, param2){" + src + "}";
    Node externs = compiler.parseTestCode(EXTERNS);
    Node root = compiler.parseTestCode(src).getFirstChild();
    assertEquals(0, compiler.getErrorCount());
    Scope scope = new SyntacticScopeCreator(compiler).createScope(root, null);
    ControlFlowAnalysis cfa = new ControlFlowAnalysis(compiler, false, true);
    cfa.process(null, root);
    ControlFlowGraph<Node> cfg = cfa.getCfg();
    defUse = new MustBeReachingVariableDef(cfg, scope, compiler);
    defUse.analyze();
    def = null;
    use = null;
    new NodeTraversal(compiler,new LabelFinder()).traverse(root);
    assertNotNull("Code should have an instruction labeled D", def);
    assertNotNull("Code should have an instruction labeled U", use);
  }

  /**
   * Finds the D: and U: label and store which node they point to.
   */
  private class LabelFinder extends AbstractPostOrderCallback {
    @Override
    public void visit(NodeTraversal t, Node n, Node parent) {
      if (n.isLabel()) {
        if (n.getFirstChild().getString().equals("D")) {
          def = n.getLastChild();
        } else if (n.getFirstChild().getString().equals("U")) {
          use = n.getLastChild();
        }
      }
    }
  }
}
