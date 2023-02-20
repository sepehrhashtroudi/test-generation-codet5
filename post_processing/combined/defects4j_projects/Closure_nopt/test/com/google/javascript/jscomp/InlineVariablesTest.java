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
 * Verifies that valid candidates for inlining are inlined, but
 * that no dangerous inlining occurs.
 *
 * @author kushal@google.com (Kushal Dave)
 */
public class InlineVariablesTest extends CompilerTestCase {

  private boolean inlineAllStrings = false;
  private boolean inlineLocalsOnly = false;

  public InlineVariablesTest() {
    enableNormalize();
  }

  @Override
  public void setUp() {
    super.enableLineNumberCheck(true);
  }

  @Override
  protected CompilerPass getProcessor(final Compiler compiler) {
    return new InlineVariables(
        compiler,
        (inlineLocalsOnly)
            ? InlineVariables.Mode.LOCALS_ONLY
            : InlineVariables.Mode.ALL,
        inlineAllStrings);
  }

  @Override
  public void tearDown() {
    inlineAllStrings = false;
    inlineLocalsOnly = false;
  }

  // Test respect for scopes and blocks

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  


  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  // Test movement of constant values

  

  


  // Test tricky declarations and references

  

  

  // Test movement of values that have (may) side effects

  

  


  // Test movement of values that are complex but lack side effects

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  // Make sure that we still inline constants that are not provably
  // written before they're read.
  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  
}
