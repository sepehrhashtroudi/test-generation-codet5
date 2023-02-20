/*
 * Copyright 2010 The Closure Compiler Authors.
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

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

import java.util.List;
import java.util.Set;

/**
 * Unit tests for PeepholeOptimizationsPass.
 *
 */
public class PeepholeOptimizationsPassTest extends CompilerTestCase {

  private ImmutableList<AbstractPeepholeOptimization> currentPeepholePasses;

  @Override
  public void setUp() throws Exception {
    super.setUp();
    super.enableLineNumberCheck(true);
  }

  @Override
  public CompilerPass getProcessor(final Compiler compiler) {
    return new PeepholeOptimizationsPass(compiler,
        currentPeepholePasses.toArray(
            new AbstractPeepholeOptimization[currentPeepholePasses.size()]));
  }

  @Override
  protected int getNumRepetitions() {
    // Our tests do not require multiple passes to reach a fixed-point.
    return 1;
  }

  /**
   * PeepholeOptimizationsPass should handle the case when no peephole
   * optimizations are turned on.
   */
public void testOptimizationsRemoveParentAfterRemoveChild1() { 
     currentPeepholePasses = ImmutableList.<AbstractPeepholeOptimization>of(new RemoveNodesNamedXOptimization(), new RemoveParentVarsForNodesNamedX()); 
     test("var x,y; var z;", "var y; var z;"); 
 }
  

  

  /**
   * A peephole optimization that, given a subtree consisting of a VAR node,
   * removes children of that node named "x".
   */
  private static class RemoveNodesNamedXUnderVarOptimization
      extends AbstractPeepholeOptimization {
    @Override
    public Node optimizeSubtree(Node node) {
      if (node.isVar()) {
        Set<Node> nodesToRemove = Sets.newHashSet();

        for (Node child : node.children()) {
          if ("x".equals(child.getString())) {
            nodesToRemove.add(child);
          }
        }

        for (Node childToRemove : nodesToRemove) {
          node.removeChild(childToRemove);
          reportCodeChange();
        }
      }

      return node;
    }
  }

  /**
   * A peephole optimization that, given a subtree consisting of a name node
   * named "x" removes that node.
   */
  private static class RemoveNodesNamedXOptimization
      extends AbstractPeepholeOptimization {
    @Override
    public Node optimizeSubtree(Node node) {
      if (node.isName() && "x".equals(node.getString())) {
        node.getParent().removeChild(node);
        reportCodeChange();

        return null;
      }

      return node;
    }
  }

  /**
   * A peephole optimization that, given a subtree consisting of a name node
   * named "x" whose parent is a VAR node, removes the parent VAR node.
   */
  private static class RemoveParentVarsForNodesNamedX
      extends AbstractPeepholeOptimization {
    @Override
    public Node optimizeSubtree(Node node) {
      if (node.isName() && "x".equals(node.getString())) {
        Node parent = node.getParent();
        if (parent.isVar()) {
          parent.getParent().removeChild(parent);
          reportCodeChange();
          return null;
        }
      }
      return node;
    }
  }

  /**
   * A peephole optimization that, given a subtree consisting of a name node
   * named "y", replaces it with a name node named "x";
   */
  private static class RenameYToX extends AbstractPeepholeOptimization {
    @Override
    public Node optimizeSubtree(Node node) {
      if (node.isName() && "y".equals(node.getString())) {
        Node replacement = Node.newString(Token.NAME, "x");

        node.getParent().replaceChild(node, replacement);
        reportCodeChange();

        return replacement;
      }
      return node;
    }
  }

  

  

  

  /**
   * Test the case where the first peephole optimization removes a node and the
   * second wants to remove (the now nonexistent) parent of that node.
   */
  

  
}
