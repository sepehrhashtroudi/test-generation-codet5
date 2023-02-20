/*
 * Copyright 2009 The Closure Compiler Authors.
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
 * Tests for {@link FunctionRewriter}
 *
 */
public class FunctionRewriterTest extends CompilerTestCase {

  private static final String RETURNARG_HELPER =
      "function JSCompiler_returnArg(JSCompiler_returnArg_value){" +
      "  return function() { return JSCompiler_returnArg_value }" +
      "}";
  private static final String GET_HELPER =
      "function JSCompiler_get(JSCompiler_get_name){" +
      "  return function() { return this[JSCompiler_get_name] }" +
      "}";
  private static final String SET_HELPER =
      "function JSCompiler_set(JSCompiler_set_name) {" +
      "  return function(JSCompiler_set_value){" +
      "    this[JSCompiler_set_name]=JSCompiler_set_value" +
      "  }" +
      "}";
  private static final String EMPTY_HELPER =
    "function JSCompiler_emptyFn() {" +
    "  return function(){}" +
    "}";
  private static final String IDENTITY_HELPER =
    "function JSCompiler_identityFn() {" +
    "  return function(JSCompiler_identityFn_value) {" +
    "      return JSCompiler_identityFn_value" +
    "  }" +
    "}";

  @Override
  protected void setUp() {
    super.enableLineNumberCheck(false);
  }

  @Override
  protected FunctionRewriter getProcessor(Compiler compiler) {
    return new FunctionRewriter(compiler);
  }

  @Override
  protected int getNumRepetitions() {
    // Pass reaches steady state after just 1 iteration
    return 1;
  }

  

  

  

  

  

  

  

  

  

  

  

  



  

  

  

  private void checkCompilesTo(String src,
                               String expectedHdr,
                               String expectedBody,
                               int repetitions) {
    StringBuilder srcBuffer = new StringBuilder();
    StringBuilder expectedBuffer = new StringBuilder();

    expectedBuffer.append(expectedHdr);

    for (int idx = 0; idx < repetitions; idx++) {
      if (idx != 0) {
        srcBuffer.append(";");
        expectedBuffer.append(";");
      }
      srcBuffer.append(src);
      expectedBuffer.append(expectedBody);
    }
    test(srcBuffer.toString(), expectedBuffer.toString());
  }

  private void checkCompilesToSame(String src, int repetitions) {
    checkCompilesTo(src, "", src, repetitions);
  }
}
