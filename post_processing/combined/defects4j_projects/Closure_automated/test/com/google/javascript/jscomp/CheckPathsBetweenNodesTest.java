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

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.javascript.jscomp.graph.LinkedDirectedGraph;
import com.google.javascript.jscomp.graph.DiGraph;
import com.google.javascript.jscomp.graph.DiGraph.DiGraphEdge;
import com.google.javascript.jscomp.graph.DiGraph.DiGraphNode;

import junit.framework.TestCase;

/**
 * Tests for {@link CheckPathsBetweenNodes}.
 *
 */
public class CheckPathsBetweenNodesTest extends TestCase {

  /**
   * Predicate satisfied by strings with a given prefix.
   */
  private static class PrefixPredicate implements Predicate<String> {
    String prefix;

    PrefixPredicate(String prefix) {
      this.prefix = prefix;
    }

    @Override
    public boolean apply(String input) {
      return input.startsWith(prefix);
    }
  }

  private static final Predicate<String> FALSE = Predicates.alwaysFalse();

  private static final Predicate<DiGraphEdge<String, String>> ALL_EDGE =
      Predicates.alwaysTrue();

  private static final Predicate<DiGraphEdge<String, String>> NO_EDGE =
    Predicates.alwaysFalse();

  /** Tests straight-line graphs. */
public void testSomePath2358() { 
     DiGraph<String, String> g = LinkedDirectedGraph.create(); 
     g.createDirectedGraphNode("a"); 
     g.createDirectedGraphNode("b"); 
     assertFalse(createTest(g, "a", "b", Predicates.equalTo("b"), ALL_EDGE).somePathsSatisfyPredicate()); 
     assertFalse(createTest(g, "a", "b", Predicates.equalTo("d"), ALL_EDGE).somePathsSatisfyPredicate()); 
     assertTrue(createTest(g, "a", "b", Predicates.equalTo("a"), ALL_EDGE).somePathsSatisfyPredicate()); 
 }
public void testNonInclusive359() { 
     DiGraph<String, String> g = LinkedDirectedGraph.create(); 
     g.createDirectedGraphNode("a"); 
     g.createDirectedGraphNode("b"); 
     g.createDirectedGraphNode("c"); 
     g.connect("a", "-", "b"); 
     g.connect("b", "-", "c"); 
     assertFalse(createNonInclusiveTest(g, "a", "b", Predicates.equalTo("a"), ALL_EDGE).somePathsSatisfyPredicate()); 
     assertFalse(createNonInclusiveTest(g, "a", "b", Predicates.equalTo("b"), ALL_EDGE).somePathsSatisfyPredicate()); 
     assertTrue(createNonInclusiveTest(g, "a", "c", Predicates.equalTo("b"), ALL_EDGE).somePathsSatisfyPredicate()); 
 }
public void testNonInclusive360() { 
     DiGraph<String, String> g = LinkedDirectedGraph.create(); 
     g.createDirectedGraphNode("a"); 
     g.createDirectedGraphNode("b"); 
     g.createDirectedGraphNode("c"); 
     g.connect("a", "-", "b"); 
     g.connect("b", "-", "c"); 
     assertFalse(createNonInclusiveTest(g, "a", "b", Predicates.equalTo("a"), ALL_EDGE).somePathsSatisfyPredicate()); 
     assertFalse(createNonInclusiveTest(g, "a", "b", Predicates.equalTo("b"), ALL_EDGE).somePathsSatisfyPredicate()); 
     assertTrue(createNonInclusiveTest(g, "a", "c", Predicates.equalTo("d"), ALL_EDGE).somePathsSatisfyPredicate()); 
 }
  

  /**
   * Tests a graph where some paths between the nodes are valid and others
   * are invalid.
   */
  

  /** Tests a graph with many valid paths. */
  

  /** Tests a graph with some cycles. */
  

  /**
   * Tests another graph with cycles. The topology of this graph was inspired
   * by a control flow graph that was being incorrectly analyzed by an early
   * version of CheckPathsBetweenNodes.
   */
  

  /**
   * Tests another graph with cycles. The topology of this graph was inspired
   * by a control flow graph that was being incorrectly analyzed by an early
   * version of CheckPathsBetweenNodes.
   */
  


  /**
   * Much of the tests are done by testing all paths. We quickly verified
   * that some paths are indeed correct for the some path case.
   */
  

  

  

  

  private static <N, E> void assertGood(CheckPathsBetweenNodes<N, E> test) {
    assertTrue(test.allPathsSatisfyPredicate());
  }

  private static <N, E> void assertBad(CheckPathsBetweenNodes<N, E> test) {
    assertFalse(test.allPathsSatisfyPredicate());
  }

  private static CheckPathsBetweenNodes<String, String> createTest(
      DiGraph<String, String> graph,
      String entry,
      String exit,
      Predicate<String> nodePredicate,
      Predicate<DiGraphEdge<String, String>> edgePredicate) {
    return new CheckPathsBetweenNodes<String, String>(graph,
        graph.getDirectedGraphNode(entry), graph.getDirectedGraphNode(exit),
        nodePredicate, edgePredicate);
  }

  private static CheckPathsBetweenNodes<String, String>
      createNonInclusiveTest(
        DiGraph<String, String> graph,
        String entry,
        String exit,
        Predicate<String> nodePredicate,
        Predicate<DiGraphEdge<String, String>> edgePredicate) {
    return new CheckPathsBetweenNodes<String, String>(graph,
        graph.getDirectedGraphNode(entry), graph.getDirectedGraphNode(exit),
        nodePredicate, edgePredicate, false);
  }

  private static Predicate<DiGraphEdge<String, String>>
      edgeIs(final Object val) {
    return new Predicate<DiGraphEdge<String, String>>() {
      @Override
      public boolean apply(DiGraphEdge<String, String> input) {
        return input.getValue().equals(val);
      }
    };
  }

  private static class CountingPredicate<T> implements Predicate<T> {

    private int count = 0;
    private final Predicate<T> delegate;

    private CountingPredicate(Predicate<T> delegate) {
      this.delegate = delegate;
    }
    @Override
    public boolean apply(T input) {
      count ++;
      return delegate.apply(input);
    }

  }
}
