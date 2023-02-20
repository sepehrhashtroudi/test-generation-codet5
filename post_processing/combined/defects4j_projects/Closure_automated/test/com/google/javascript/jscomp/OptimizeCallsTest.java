/*
 * Copyright 2011 The Closure Compiler Authors.
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

import com.google.javascript.rhino.Node;

/**
 * Unit tests for {#link {@link OptimizeCalls}
 *
 */
public class OptimizeCallsTest extends CompilerTestCase {

  @Override
  protected CompilerPass getProcessor(final Compiler compiler) {
    final OptimizeCalls passes = new OptimizeCalls(compiler);
    passes.addPass(new OptimizeReturns(compiler));
    passes.addPass(new OptimizeParameters(compiler));
    passes.addPass(new RemoveUnusedVars(compiler, true, false, true));
    return new CompilerPass() {

      @Override
      public void process(Node externs, Node root) {
        new PureFunctionIdentifier(compiler,
          new SimpleDefinitionFinder(compiler)).process(externs, root);
        passes.process(externs, root);
      }
    };
  }

  

  

  
}
