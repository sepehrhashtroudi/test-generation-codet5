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

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.javascript.jscomp.CallGraph.Callsite;
import com.google.javascript.jscomp.CallGraph.Function;
import com.google.javascript.jscomp.graph.FixedPointGraphTraversal;
import com.google.javascript.jscomp.graph.FixedPointGraphTraversal.EdgeCallback;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

import java.util.Collection;
import java.util.List;
import java.util.Set;

/**
 * Tests for CallGraph.
 *
 * @author dcc@google.com (Devin Coughlin)
 */
public class CallGraphTest extends CompilerTestCase {

  private CallGraph currentProcessor;

  private boolean createForwardCallGraph;
  private boolean createBackwardCallGraph;

  @Override
  protected CompilerPass getProcessor(Compiler compiler) {
    // We store the new callgraph so it can be tested later
    currentProcessor = new CallGraph(compiler, createForwardCallGraph,
        createBackwardCallGraph);

    return currentProcessor;
  }

  static final String SHARED_EXTERNS =
      "var ExternalFunction = function(a) {}\n" +
      "var externalnamespace = {}\n" +
      "externalnamespace.prop = function(){};\n";

public void testCallsiteHasUnknownTarget156() { 
     String source = "var A = externalnamespace.prop;\n" + "function B(){A();};\n" + "B();\n"; 
     CallGraph callgraph = compileAndRunBackward(source); 
     Function mainFunction = callgraph.getMainFunction(); 
     Function functionB = callgraph.getUniqueFunctionWithName("B"); 
     Callsite callInMain = mainFunction.getCallsitesInFunction().iterator().next(); 
     assertFalse(callInMain.hasUnknownTarget()); 
     assertEquals("B", callInMain.getAstNode().getFirstChild().getString()); 
 }
public void testCallsiteHasUnknownTarget159() { 
     String source = "var A = externalnamespace.prop;\n" + "function B(){A();};\n" + "B();\n"; 
     CallGraph callgraph = compileAndRunForward(source); 
     Function mainFunction = callgraph.getMainFunction(); 
     Function functionB = callgraph.getUniqueFunctionWithName("B"); 
     Callsite callInMain = mainFunction.getCallsitesInFunction().iterator().next(); 
     assertFalse(callInMain.hasUnknownTarget()); 
     assertEquals("B", callInMain.getAstNode().getFirstChild().getString()); 
     Callsite callInB = functionB.getCallsitesInFunction().iterator().next(); 
     assertTrue(callInB.hasUnknownTarget()); 
     assertEquals(0, callInB.getPossibleTargets().size()); 
 }
public void testCallsiteHasUnknownTarget160() { 
     String source = "var A = externalnamespace.prop;\n" + "function B(){A();};\n" + "B();\n"; 
     CallGraph callgraph = compileAndRunBackward(source); 
     Function mainFunction = callgraph.getMainFunction(); 
     Function functionB = callgraph.getUniqueFunctionWithName("B"); 
     Callsite callInMain = mainFunction.getCallsitesInFunction().iterator().next(); 
     assertFalse(callInMain.hasUnknownTarget()); 
     assertEquals("B", callInMain.getAstNode().getFirstChild().getString()); 
     Callsite callInB = functionB.getCallsitesInFunction().iterator().next(); 
     assertTrue(callInB.hasUnknownTarget()); 
     assertEquals(0, callInB.getPossibleTargets().size()); 
 }
public void testGetAllFunctionsContainsGlobalSite167() { 
     String source = "var A = externalnamespace.prop;\n" + "function B(){A();};\n" + "B();\n"; 
     CallGraph callgraph = compileAndRunBackward(source); 
     Collection<CallGraph.Function> allFunctions = callgraph.getAllFunctions(); 
     assertEquals(2, allFunctions.size()); 
     assertTrue(allFunctions.contains(callgraph.getUniqueFunctionWithName("A"))); 
     assertTrue(allFunctions.contains(callgraph.getUniqueFunctionWithName("B"))); 
 }
public void testStatement168() { 
     test("/**\n" + " * @fileoverview\n" + " * @notypecheck\n" + " */ \n" + "/** @constructor */" + "function e(){}" + "var x = e.prototype.method1 = function(){};" + "var y = new e; x()", "function e(){}" + "var x = function(){};" + "var y = new e; x()"); 
 }
  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  /**
   * Test getting a backward directed graph on a backward call graph
   * and propagating over it.
   */
  

  /**
   * Test getting a backward directed graph on a forward call graph
   * and propagating over it.
   */
  

  /**
   * Test getting a forward directed graph on a forward call graph
   * and propagating over it.
   */
  

  /**
   * Test getting a backward directed graph on a forward call graph
   * and propagating over it.
   */
  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  /**
   * Helper function that, given a collection of callsites, returns a
   * collection of the names of the target expression nodes, e.g.
   * if the callsites are [A(), B.b()], the collection returned is
   * ["A", "B"].
   *
   * This makes it easier to test methods that return collections of callsites.
   *
   * An exception is thrown if the callsite target is not a simple name
   * (e.g. "a.bar()").
   */
  private List<String> getCallsiteTargetNames(Collection<Callsite>
      callsites) {
    List<String> result = Lists.newArrayList();

    for (Callsite callsite : callsites) {
      Node targetExpressionNode = callsite.getAstNode().getFirstChild();
      if (targetExpressionNode.isName()) {
        result.add(targetExpressionNode.getString());
      } else {
        throw new IllegalStateException("Called getCallsiteTargetNames() on " +
            "a complex callsite.");
      }
    }

    return result;
  }

  private void assertFunctionAliased(boolean aliased, String name) {
    Function function = currentProcessor.getUniqueFunctionWithName(name);

    assertEquals(aliased, function.isAliased());
  }

  private CallGraph compileAndRunBackward(String js) {
    return compileAndRun(SHARED_EXTERNS, js, false, true);
  }

  private CallGraph compileAndRunForward(String js) {
    return compileAndRun(SHARED_EXTERNS, js, true, false);
  }

  private CallGraph compileAndRun(String externs,
      String js,
      boolean forward,
      boolean backward) {

    createBackwardCallGraph = backward;
    createForwardCallGraph = forward;

    testSame(externs, js, null);

    return currentProcessor;
  }
}
