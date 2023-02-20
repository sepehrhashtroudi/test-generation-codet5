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

import com.google.javascript.jscomp.CheckLevel;

/**
 * Tests for {@link CheckMissingReturn}.
 *
 */
public class CheckMissingReturnTest extends CompilerTestCase {

  public CheckMissingReturnTest() {
    enableTypeCheck(CheckLevel.OFF);
  }

  @Override
  protected CompilerPass getProcessor(final Compiler compiler) {
    return new CombinedCompilerPass(compiler,
        new CheckMissingReturn(compiler, CheckLevel.ERROR));
  }

  

  

  

  

  

  

  

  private static String createFunction(String returnType, String body) {
    return "/** @return {" + returnType + "} */ function foo() {" + body + "}";
  }

  private void testMissing(String returnType, String body) {
    String js = createFunction(returnType, body);
    test(js, js, CheckMissingReturn.MISSING_RETURN_STATEMENT);
  }

  private void testNotMissing(String returnType, String body) {
    testSame(createFunction(returnType, body));
  }

  /** Creates function with return type {number} */
  private void testNotMissing(String body) {
    testNotMissing("number", body);
  }

  /** Creates function with return type {number} */
  private void testMissing(String body) {
    testMissing("number", body);
  }
}
