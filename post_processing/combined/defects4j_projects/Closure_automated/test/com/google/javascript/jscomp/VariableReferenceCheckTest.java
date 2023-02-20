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
 * Test that warnings are generated in appropriate cases and appropriate
 * cases only by VariableReferenceCheck
 *
 */
public class VariableReferenceCheckTest extends CompilerTestCase {

  private static final String VARIABLE_RUN =
      "var a = 1; var b = 2; var c = a + b, d = c;";

  private boolean enableAmbiguousFunctionCheck = false;

  @Override
  public CompilerOptions getOptions() {
    CompilerOptions options = super.getOptions();
    if (enableAmbiguousFunctionCheck) {
      options.setWarningLevel(
          DiagnosticGroups.AMBIGUOUS_FUNCTION_DECL, CheckLevel.WARNING);
    }
    return options;
  }

  @Override
  public CompilerPass getProcessor(Compiler compiler) {
    // Treats bad reads as errors, and reports bad write warnings.
    return new VariableReferenceCheck(compiler, CheckLevel.WARNING);
  }

  @Override
  public void setUp() throws Exception {
    super.setUp();
    enableAmbiguousFunctionCheck = false;
  }

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  /**
   * Expects the JS to generate one bad-read error.
   */
  private void assertRedeclare(String js) {
    testSame(js, VariableReferenceCheck.REDECLARED_VARIABLE);
  }

  /**
   * Expects the JS to generate one bad-write warning.
   */
  private void assertUndeclared(String js) {
    testSame(js, VariableReferenceCheck.UNDECLARED_REFERENCE);
  }

  /**
   * Expects the JS to generate one bad-write warning.
   */
  private void assertAmbiguous(String js) {
    testSame(js, VariableReferenceCheck.AMBIGUOUS_FUNCTION_DECL);
  }


  /**
   * Expects the JS to generate no errors or warnings.
   */
  private void assertNoWarning(String js) {
    testSame(js);
  }
}
