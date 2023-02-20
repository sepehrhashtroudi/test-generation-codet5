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
 * Ensures that the InlineVariables pass in constants-only mode
 * is functionally equivalent to the old InlineVariablesConstants pass.
 */
public class InlineVariablesConstantsTest extends CompilerTestCase {

  private boolean inlineAllStrings = false;

  public InlineVariablesConstantsTest() {
    enableNormalize();
  }

  @Override
  protected CompilerPass getProcessor(final Compiler compiler) {
    return new InlineVariables(
        compiler, InlineVariables.Mode.CONSTANTS_ONLY, inlineAllStrings);
  }

  @Override
  public void tearDown() {
    inlineAllStrings = false;
  }

  

  

  

  

  

  

  

  

  

// TODO(nicksantos): enable this again once we allow constant aliasing.
//  public void testInlineConstantAlias() {
//    test("var XXX = new Foo(); var YYY = XXX; bar(YYY)",
//         "var XXX = new Foo(); bar(XXX)");
//  }

  
}
