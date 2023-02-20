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
import com.google.javascript.jscomp.graph.LinkedDirectedGraph;
import com.google.javascript.jscomp.graph.LinkedUndirectedGraph;
import com.google.javascript.jscomp.graph.Annotatable;
import com.google.javascript.jscomp.graph.Annotation;
import com.google.javascript.jscomp.graph.GraphNode;
import com.google.javascript.jscomp.graph.SubGraph;
import com.google.javascript.jscomp.graph.DiGraph;
import com.google.javascript.jscomp.graph.Graph.GraphEdge;
import com.google.javascript.jscomp.graph.UndiGraph;

import junit.framework.TestCase;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Tests for the graph data structure.
 *
 */
public class GraphTest extends TestCase {

  

  

  

  

  

  

  

  

  

  

  private static void checkAnnotations(
      Graph<String, String> graph, Annotatable a, Annotatable b) {
    final Annotation A = new Annotation() {};
    final Annotation B = new Annotation() {};

    // Initially null.
    assertNull(a.getAnnotation());
    assertNull(b.getAnnotation());

    // Test basic setting.
    a.setAnnotation(A);
    b.setAnnotation(B);
    assertSame(A, a.getAnnotation());
    assertSame(B, b.getAnnotation());

    // Test clearing.
    graph.clearEdgeAnnotations();
    graph.clearNodeAnnotations();
    assertNull(a.getAnnotation());
    assertNull(b.getAnnotation());

    a.setAnnotation(A);
    b.setAnnotation(B);
    // Pushing clears.
    graph.pushEdgeAnnotations();
    graph.pushNodeAnnotations();
    assertNull(a.getAnnotation());
    assertNull(b.getAnnotation());
    a.setAnnotation(B);
    b.setAnnotation(B);
    graph.pushEdgeAnnotations();
    graph.pushNodeAnnotations();
    a.setAnnotation(B);
    b.setAnnotation(A);

    // Test restoring then restoring old values with pop.
    assertSame(B, a.getAnnotation());
    assertSame(A, b.getAnnotation());
    graph.popEdgeAnnotations();
    graph.popNodeAnnotations();
    assertSame(B, a.getAnnotation());
    assertSame(B, b.getAnnotation());
    graph.popEdgeAnnotations();
    graph.popNodeAnnotations();
    assertSame(A, a.getAnnotation());
    assertSame(B, b.getAnnotation());
  }

  

  

  

  

  

  private <T extends GraphNode<String, String>> void assertListCount(
      List<T> list, String target, int count) {
    for (GraphNode<String, String> node : list) {
      if (node.getValue().equals(target)) {
        count--;
      }
    }
    assertTrue(count == 0);
  }

  private <T extends GraphNode<String, String>> void assertSetEquals(
      List<T> list, String ... targets) {
    Set<String> set = new HashSet<String>();
    for (GraphNode<String, String> node : list) {
      set.add(node.getValue());
    }
    Set<String> otherSet = new HashSet<String>();
    for (String target : targets) {
      otherSet.add(target);
    }
    assertTrue(otherSet.equals(set));
  }
}
