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


/**
 * Inline function tests.
 * @author johnlenz@google.com (john lenz)
 */
public class InlineFunctionsTest extends CompilerTestCase {
  boolean allowGlobalFunctionInlining = true;
  boolean allowBlockInlining = true;
  final boolean allowExpressionDecomposition = true;
  final boolean allowFunctionExpressionInlining = true;
  final boolean allowLocalFunctionInlining = true;
  boolean assumeStrictThis = false;
  boolean assumeMinimumCapture = false;

  public InlineFunctionsTest() {
    this.enableNormalize();
    this.enableMarkNoSideEffects();
  }

  @Override
  protected void setUp() throws Exception {
    super.setUp();
    super.enableLineNumberCheck(true);
    allowGlobalFunctionInlining = true;
    allowBlockInlining = true;
    assumeStrictThis = false;
    assumeMinimumCapture = false;
  }

  @Override
  protected CompilerPass getProcessor(Compiler compiler) {
    compiler.resetUniqueNameId();
    return new InlineFunctions(
        compiler,
        compiler.getUniqueNameIdSupplier(),
        allowGlobalFunctionInlining,
        allowLocalFunctionInlining,
        allowBlockInlining,
        assumeStrictThis,
        assumeMinimumCapture);
  }

  /**
   * Returns the number of times the pass should be run before results are
   * verified.
   */
  @Override
  protected int getNumRepetitions() {
    // Some inlining can only be done in multiple passes.
    return 3;
  }

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  // Test redefinition of parameter name.
  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  // http://en.wikipedia.org/wiki/Fixed_point_combinator#Y_combinator
  

  

  

  

  

  

  

  private static class StringCompare extends CompilerTestCase {
    private boolean allowGlobalFunctionInlining = true;

    StringCompare() {
      super("", false);
      this.enableNormalize();
      this.enableMarkNoSideEffects();
    }

    @Override
    public void setUp() throws Exception {
      super.setUp();
      super.enableLineNumberCheck(true);
      allowGlobalFunctionInlining = true;
    }

    @Override
    protected CompilerPass getProcessor(Compiler compiler) {
      compiler.resetUniqueNameId();
      return new InlineFunctions(
          compiler,
          compiler.getUniqueNameIdSupplier(),
          allowGlobalFunctionInlining,
          true,  // allowLocalFunctionInlining
          true,  // allowBlockInlining
          true,  // assumeStrictThis
          true); // assumeMinimumCapture
    }

    
  }

  

  

  

  

  

  


  

  

  // Inline a single reference function into deeper modules
  

  // Inline a single reference function into shallow modules, only if it
  // is cheaper than the call itself.
  

  // Inline a multi-reference functions into shallow modules, only if it
  // is cheaper than the call itself.
  
  
  

}
