/*
 * Copyright 2004 The Closure Compiler Authors.
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
 * Tests for the interaction between multiple peephole passes.
 */
public class PeepholeIntegrationTest extends CompilerTestCase {

  private boolean late = true;

  // TODO(user): Remove this when we no longer need to do string comparison.
  private PeepholeIntegrationTest(boolean compareAsTree) {
    super("", compareAsTree);
  }

  public PeepholeIntegrationTest() {
    super("");
  }

  @Override
  public void setUp() throws Exception {
    super.setUp();
    this.late = false;
    enableLineNumberCheck(true);

    // TODO(nicksantos): Turn this on. There are some normalizations
    // that cause weirdness here.
    disableNormalize();
  }

  @Override
  public CompilerPass getProcessor(final Compiler compiler) {
    PeepholeOptimizationsPass peepholePass =
      new PeepholeOptimizationsPass(compiler,
        new PeepholeSubstituteAlternateSyntax(late),
        new PeepholeRemoveDeadCode(),
        new PeepholeFoldConstants(late)
      );

    return peepholePass;
  }

  @Override
  protected int getNumRepetitions() {
    // Reduce this to 2 if we get better expression evaluators.
    return 4;
  }

  private void foldSame(String js) {
    testSame(js);
  }

  private void fold(String js, String expected) {
    test(js, expected);
  }

  // TODO(user): This is same as fold() except it uses string comparison. Any
  // test that needs tell us where a folding is constructing an invalid AST.
  private void assertResultString(String js, String expected) {
    PeepholeIntegrationTest scTest = new PeepholeIntegrationTest(false);

    scTest.disableNormalize();

    scTest.test(js, expected);
  }

  

  /** Check that removing blocks with 1 child works */
  

  

  /** Test a particularly hairy edge case. */
  

  /** Try to minimize returns */
  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  
}
