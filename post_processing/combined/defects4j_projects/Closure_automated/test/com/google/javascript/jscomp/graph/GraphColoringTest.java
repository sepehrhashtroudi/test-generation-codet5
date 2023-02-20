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

package com.google.javascript.jscomp.graph;

import com.google.javascript.jscomp.graph.Graph;
import com.google.javascript.jscomp.graph.GraphColoring;
import com.google.javascript.jscomp.graph.LinkedUndirectedGraph;
import com.google.javascript.jscomp.graph.GraphNode;
import com.google.javascript.jscomp.graph.Graph.GraphEdge;
import com.google.javascript.jscomp.graph.GraphColoring.Color;
import com.google.javascript.jscomp.graph.GraphColoring.GreedyGraphColoring;

import junit.framework.TestCase;

import java.util.Comparator;

/**
 * Tests for {@link GraphColoring}.
 *
 */
public class GraphColoringTest extends TestCase {

  

  

  

  

  

  

  

  /**
   * Validate that each node has been colored and connected nodes have different
   * coloring.
   */
  private static <N, E> void validateColoring(Graph<N, E> graph) {
    for (GraphNode<N, E> node : graph.getNodes()) {
      assertTrue(node.getAnnotation() != null);
    }
    for (GraphEdge<N, E> edge : graph.getEdges()) {
      Color c1 = edge.getNodeA().getAnnotation();
      Color c2 = edge.getNodeB().getAnnotation();
      assertTrue(c1 != null);
      assertTrue(c2 != null);
      assertTrue(!c1.equals(c2));
    }
  }
}
