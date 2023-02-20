/*
 * Copyright 2005 The Closure Compiler Authors.
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

public class RenamePrototypesTest extends CompilerTestCase {

  private static final String EXTERNS = "var js_version;js_version.toString;";
  private VariableMap prevUsedRenameMap;
  private RenamePrototypes renamePrototypes;

  public RenamePrototypesTest() {
    super(EXTERNS);
    enableNormalize();
  }

  @Override
  public CompilerPass getProcessor(Compiler compiler) {
    return renamePrototypes =
        new RenamePrototypes(compiler, true, null, prevUsedRenameMap);
  }

  @Override
  protected void tearDown() throws Exception {
    super.tearDown();

    prevUsedRenameMap = null;
  }

  @Override
  protected int getNumRepetitions() {
    // The RenamePrototypes pass should only be run once over a parse tree.
    return 1;
  }

  

  

  

  /**
   * Test renaming private properties (end with underscores) and test to make
   * sure we don't rename other properties.
   */
  

  /**
   * Tests a potential tricky interaction between prototype renaming and
   * property renaming.
   */
  

  

  

  

  

  

  

  

  public void testStable(String input1, String expected1,
                         String input2, String expected2) {
    test(input1, expected1);
    prevUsedRenameMap = renamePrototypes.getPropertyMap();
    test(input2, expected2);
  }
}
