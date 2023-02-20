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
 * Test for the control structure verification.
 *
 */
public class ControlStructureCheckTest extends CompilerTestCase {
  // Rhino parse error message text
  final String UNLABELED_BREAK =
    "unlabelled break must be inside loop or switch";

  final String UNEXPECTED_CONTINUE = "continue must be inside loop";

  final String UNEXPECTED_LABLED_CONTINUE =
    "continue can only use labeles of iteration statements";

  final String UNDEFINED_LABEL = "undefined label";

  @Override
  public CompilerPass getProcessor(Compiler compiler) {
    return new ControlStructureCheck(compiler);
  }

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  private void assertNoError(String js) {
    testSame(js);
  }

  private void assertInvalidBreak(String js) {
    testParseError(js, UNLABELED_BREAK);
  }

  private void assertInvalidContinue(String js) {
    testParseError(js, UNEXPECTED_CONTINUE);
  }

  private void assertInvalidLabeledContinue(String js) {
    testParseError(js, UNEXPECTED_LABLED_CONTINUE);
  }

  private void assertUndefinedLabel(String js) {
    testParseError(js, UNDEFINED_LABEL);
  }

  private void testParseError(String js, String errorText) {
    Compiler compiler = new Compiler();
    compiler.parseTestCode(js);
    assertTrue(compiler.getErrorCount() == 1);
    String msg = compiler.getErrors()[0].toString();
    assertTrue(msg.contains(errorText));
  }
}
