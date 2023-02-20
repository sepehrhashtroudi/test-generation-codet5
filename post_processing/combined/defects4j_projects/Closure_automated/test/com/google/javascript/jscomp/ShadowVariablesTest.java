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

/**
 * Unit tests for {@link ShadowVariables}.
 *
 *
 */
public class ShadowVariablesTest extends CompilerTestCase{
  // Use pseudo names to make test easier to read.
  private boolean generatePseudoNames = false;
  @Override
  protected CompilerPass getProcessor(Compiler compiler) {
      return new RenameVars(
          compiler, "", false, false,
          generatePseudoNames, true, null, null, null);
  }

  @Override
  protected int getNumRepetitions() {
    return 1;
  }

  @Override
  protected void setUp() throws Exception {
    super.setUp();
    generatePseudoNames = false;
  }

  

  

  /**
   * If we have a choice, pick out the most used variable to shadow.
   */
  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  
}
