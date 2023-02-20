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

import com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback;
import com.google.javascript.rhino.Node;

/**
 * Tests for {@link SimpleFunctionAliasAnalysis}.
 *
 * @author dcc@google.com (Devin Coughlin)
 */
public class SimpleFunctionAliasAnalysisTest extends CompilerTestCase {

  private SimpleFunctionAliasAnalysis analysis;

  private Compiler lastCompiler;

  @Override
  protected CompilerPass getProcessor(final Compiler compiler) {
      return new CompilerPass() {

        @Override
        public void process(Node externs, Node root) {
          SimpleDefinitionFinder finder = new SimpleDefinitionFinder(compiler);
          finder.process(externs, root);

          analysis = new SimpleFunctionAliasAnalysis();

          analysis.analyze(finder);

          lastCompiler = compiler;
        }
      };
  }

public void testSimpleDefinitionFinder329() { 
     String defs = "/** @constructor */ function Foo() {}\n" + "Foo.prototype.a = function() { return this; };" + "/** @constructor */ function Bar() {}\n" + "Bar.prototype.a = function() {};"; 
     testSame(defs + "var o = new Foo; o.a(); o.a();"); 
     testSame(defs + "var o = new Bar; o.a(); o.a();"); 
 }
  

  

  private void assertFunctionAliased(boolean aliasStatus,
      String functionName) {
    Node function = findFunction(functionName);

    assertEquals(aliasStatus, analysis.isAliased(function));
  }

  private void assertFunctionExposedToCallOrApply(boolean exposure,
      String functionName) {
    Node function = findFunction(functionName);

    assertEquals(exposure, analysis.isExposedToCallOrApply(function));
  }

  private void compileAndRun(String source) {
    testSame(source, source, null);
  }

  private Node findFunction(String name) {
    FunctionFinder f = new FunctionFinder(name);
    new NodeTraversal(lastCompiler, f).traverse(lastCompiler.jsRoot);
    assertNotNull("Couldn't find " + name, f.found);
    return f.found;
  }

  /**
   * Quick Traversal to find a given function in the AST.
   */
  private class FunctionFinder extends AbstractPostOrderCallback {
    Node found = null;
    final String target;

    FunctionFinder(String target) {
      this.target = target;
    }

    @Override
    public void visit(NodeTraversal t, Node n, Node parent) {
      if (n.isFunction()
          && target.equals(NodeUtil.getFunctionName(n))) {
        found = n;
      }
    }
  }
}
