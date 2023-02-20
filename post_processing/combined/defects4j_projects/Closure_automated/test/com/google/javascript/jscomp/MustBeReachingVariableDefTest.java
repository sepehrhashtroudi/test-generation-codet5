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

public void testExpressionVariableReassignment390() { 
     assertMatch("var a,b; D: var x = a + b; U:x"); 
     assertNotMatch("var a,b,c; D: var x = a + b; a = 1; U:x"); 
     assertMatch("var a,b,c; D: var x = a + b; c = 1; U:x"); 
     assertMatch("var a,b,c; D: var x = a + b; c = 1; U:x"); 
     assertNotMatch("var a,b,c; D: var x = a + b; c ? a = 1 : 0; U:x"); 
 }
public void testMergesWithOneDefinition391() { 
     assertNotMatch("var x,y; while(y) { if (y) { print(x) } else { D: x = 1 } } U:x"); 
 }
public void testExpressionVariableReassignment392() { 
     assertMatch("var a,b; D: var x = a + b; U:x"); 
     assertNotMatch("var a,b,c; D: var x = a + b; a = 1; U:x"); 
     assertNotMatch("var a,b,c; D: var x = a + b; c = 1; U:x"); 
     assertMatch("var a,b,c; D: var x = a + b; c = 1; U:x"); 
     assertNotMatch("var a,b,c; D: var x = a + b; c ? a = 1 : 0; U:x"); 
 }
public void testExpressionVariableReassignment394() { 
     assertMatch("var a,b; D: var x = a + b; U:x"); 
     assertNotMatch("var a,b,c; D: var x = a + b; a = 1; U:x"); 
     assertNotMatch("var a,b,c; D: var x = a + b; f(b = 1); U:x"); 
     assertMatch("var a,b,c; D: var x = a + b; c = 1; U:x"); 
     assertNotMatch("var a,b,c; D: var x = a + b; c ? a = 1 : 0; U:x"); 
 }
public void testArgumentsObjectModifications397() { 
     computeDefUse("D: param1 = 1; arguments[0] = 2; U: param1"); 
     assertNotSame(def, defUse.getDefNode("param1", use)); 
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
