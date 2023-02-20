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

import com.google.common.collect.ImmutableSet;
import com.google.javascript.jscomp.NodeTraversal.AbstractNodeTypePruningCallback;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Tests for {@link NodeTraversal}.
 */
public class NodeTraversalTest extends TestCase {
  

  

  /**
   * Concrete implementation of AbstractPrunedCallback to test the
   * AbstractNodeTypePruningCallback shouldTraverse method.
   */
  static class PruningCallback extends AbstractNodeTypePruningCallback {
    public PruningCallback(Set<Integer> nodeTypes, boolean include) {
      super(nodeTypes, include);
    }

    @Override
    public void visit(NodeTraversal t, Node n, Node parent) {
      throw new UnsupportedOperationException();
    }
  }

  

  


  

  


  // Helper class used to test getCurrentNode
  private static class ExpectNodeOnEnterScope implements
      NodeTraversal.ScopedCallback {
    private Node node;
    private Node scopeRoot;
    private boolean entered = false;

    private void expect(Node node, Node scopeRoot) {
      this.node = node;
      this.scopeRoot = scopeRoot;
      entered = false;
    }

    private void assertEntered() {
      assertTrue(entered);
    }

    @Override
    public void enterScope(NodeTraversal t) {
      assertEquals(node, t.getCurrentNode());
      assertEquals(scopeRoot, t.getScopeRoot());
      entered = true;
    }

    @Override
    public void exitScope(NodeTraversal t) {
    }

    @Override
    public boolean shouldTraverse(NodeTraversal t, Node n, Node parent) {
      return true;
    }

    @Override
    public void visit(NodeTraversal t, Node n, Node parent) {
    }
  }

  private static Node parse(Compiler compiler, String js) {
    Node n = compiler.parseTestCode(js);
    assertEquals(0, compiler.getErrorCount());
    return n;
  }
}
