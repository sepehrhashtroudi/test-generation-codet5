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

import com.google.common.collect.Lists;
import com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback;
import com.google.javascript.rhino.Node;
import junit.framework.TestCase;

import java.util.Collection;
import java.util.List;

/**
 * Tests for {@link MaybeReachingVariableUse}.
 *
 */
public class MaybeReachingVariableUseTest extends TestCase {

  private MaybeReachingVariableUse useDef = null;
  private Node def = null;
  private List<Node> uses = null;

  /*
   * The test cases consist of a short code snippet that has an instruction
   * labeled with D and one or more with label starting with U. When assertMatch
   * is called, the test suite verifies that all the uses with label starting
   * with U is reachable to the definition label at D.
   */

  

  

  

  

  

  

  

  

  

  

  

  /**
   * The def of x at D: may be used by the read of x at U:.
   */
  private void assertMatch(String src) {
    computeUseDef(src);
    Collection<Node> result = useDef.getUses("x", def);
    assertTrue(result.size() == uses.size());
    assertTrue(result.containsAll(uses));
  }

  /**
   * The def of x at D: is not used by the read of x at U:.
   */
  private void assertNotMatch(String src) {
    computeUseDef(src);
    assertFalse(useDef.getUses("x", def).contains(uses));
  }

  /**
   * Computes reaching use on given source.
   */
  private void computeUseDef(String src) {
    Compiler compiler = new Compiler();
    src = "function _FUNCTION(param1, param2){" + src + "}";
    Node n = compiler.parseTestCode(src).getFirstChild();
    assertEquals(0, compiler.getErrorCount());
    Scope scope = new SyntacticScopeCreator(compiler).createScope(n, null);
    ControlFlowAnalysis cfa = new ControlFlowAnalysis(compiler, false, true);
    cfa.process(null, n);
    ControlFlowGraph<Node> cfg = cfa.getCfg();
    useDef = new MaybeReachingVariableUse(cfg, scope, compiler);
    useDef.analyze();
    def = null;
    uses = Lists.newArrayList();
    new NodeTraversal(compiler,new LabelFinder()).traverse(n);
    assertNotNull("Code should have an instruction labeled D", def);
    assertFalse("Code should have an instruction labeled starting withing U",
        uses.isEmpty());
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
        } else if (n.getFirstChild().getString().startsWith("U")) {
          uses.add(n.getLastChild());
        }
      }
    }
  }
}
