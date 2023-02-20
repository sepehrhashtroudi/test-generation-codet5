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

import com.google.common.collect.ImmutableSet;
import com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback;
import com.google.javascript.jscomp.SpecializeModule.SpecializationState;
import com.google.javascript.rhino.Node;

/**
 * Tests for {@link SpecializeModule}.
 *
 * @author dcc@google.com (Devin Coughlin)
 */
public class SpecializeModuleTest extends CompilerTestCase {

  private static final String SHARED_EXTERNS = "var alert = function() {}";

  public SpecializeModuleTest() {
    super(SHARED_EXTERNS);
  }

  private PassFactory inlineFunctions =
      new PassFactory("inlineFunctions", true) {
    @Override
    protected CompilerPass create(AbstractCompiler compiler) {
      return new InlineFunctions(compiler,
          compiler.getUniqueNameIdSupplier(), true, false, true, true, true);
    }
  };

  private PassFactory removeUnusedPrototypeProperties =
    new PassFactory("removeUnusedPrototypeProperties", true) {
    @Override
    protected CompilerPass create(AbstractCompiler compiler) {
      return new RemoveUnusedPrototypeProperties(compiler, false, false);
    }
  };

  private PassFactory devirtualizePrototypeMethods =
    new PassFactory("devirtualizePrototypeMethods", true) {
    @Override
    protected CompilerPass create(AbstractCompiler compiler) {
      return new DevirtualizePrototypeMethods(compiler);
    }
  };

  @Override
  protected CompilerPass getProcessor(final Compiler compiler) {
    final SpecializeModule specializeModule = new SpecializeModule(compiler,
        devirtualizePrototypeMethods, inlineFunctions,
        removeUnusedPrototypeProperties);

    return new CompilerPass() {
      @Override
      public void process(Node externs, Node root) {
        specializeModule.process(externs, root);

        /* Make sure variables are declared before used */
        new VarCheck(compiler).process(externs, root);
      }
    };
  }

  @Override
  public void setUp() throws Exception {
    super.setUp();

    enableNormalize();
  }

  

  

  

  

  

  

  

  

  

  

  

  

  /**
   * Tests for {@link SpecializeModule.SpecializationState}.
   */
  public static class SpecializeModuleSpecializationStateTest
      extends CompilerTestCase {

    Compiler lastCompiler;

    SpecializationState lastState;

    @Override
    public CompilerPass getProcessor(final Compiler compiler) {
      lastCompiler = compiler;

      return new CompilerPass() {

        @Override
        public void process(Node externs, Node root) {
          SimpleDefinitionFinder defFinder =
              new SimpleDefinitionFinder(compiler);

          defFinder.process(externs, root);

          SimpleFunctionAliasAnalysis functionAliasAnalysis =
              new SimpleFunctionAliasAnalysis();

          functionAliasAnalysis.analyze(defFinder);

          lastState = new SpecializationState(functionAliasAnalysis);
        }
      };
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
}
