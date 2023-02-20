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

import com.google.javascript.jscomp.graph.FixedPointGraphTraversal;
import com.google.javascript.jscomp.graph.LinkedDirectedGraph;
import com.google.javascript.jscomp.graph.FixedPointGraphTraversal.EdgeCallback;
import com.google.javascript.jscomp.graph.DiGraph;

import junit.framework.TestCase;

/**
 * Test for FixedPointGraphTraversal.
 * @author nicksantos@google.com (Nick Santos)
 */
public class FixedPointGraphTraversalTest extends TestCase {

  // The maximum value of a counter that counts as a "change"
  // to the state of the graph, for the purposes of fixed-point
  // computation.
  private int maxChange = 0;

  private class Counter {
    int value = 0;
  }

  private class CounterIncrementer implements EdgeCallback<Counter, String> {
    @Override
    public boolean traverseEdge(Counter source, String e, Counter dest) {
      dest.value++;
      return dest.value <= maxChange;
    }
  }

  private DiGraph<Counter, String> graph;

  private Counter A, B, C, D, E;
  private CounterIncrementer callback = new CounterIncrementer();
  private FixedPointGraphTraversal<Counter, String> traversal =
      new FixedPointGraphTraversal<Counter, String>(callback);

  // Create a new graph of the following form:
  //
  //     A
  //    / \
  //   |   B
  //  / \ /
  // C   D
  //  \ /
  //   E
  //
  // with all edges pointing downwards, and an "up-edge" from E to D.
  @Override
  public void setUp() {
    A = new Counter();
    B = new Counter();
    C = new Counter();
    D = new Counter();
    E = new Counter();

    graph = LinkedDirectedGraph.create();
    graph.createDirectedGraphNode(A);
    graph.createDirectedGraphNode(B);
    graph.createDirectedGraphNode(C);
    graph.createDirectedGraphNode(D);
    graph.createDirectedGraphNode(E);

    graph.connect(A, "->", B);
    graph.connect(A, "->", C);
    graph.connect(A, "->", D);
    graph.connect(B, "->", D);
    graph.connect(C, "->", E);
    graph.connect(D, "->", E);
    graph.connect(E, "->", D);
  }

  

  

  

  

  

  

  

  

  
}
