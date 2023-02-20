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

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;

/**
 * {@link RenameProperties} tests.
 *
 */
public class RenamePropertiesTest extends CompilerTestCase {

  private static final String EXTERNS =
      "var window;" +
      "prop.toString;" +
      "var google = { gears: { factory: {}, workerPool: {} } };";

  private RenameProperties renameProperties;

  private static boolean generatePseudoNames = false;

  private static boolean useAffinity = false;

  private VariableMap prevUsedPropertyMap = null;


  public RenamePropertiesTest() {
    super(EXTERNS);
    enableNormalize();
  }

  @Override
  protected void tearDown() throws Exception {
    super.tearDown();

    prevUsedPropertyMap = null;
    useAffinity = false;
  }

  @Override protected int getNumRepetitions() {
    // The RenameProperties pass should only be run once over a parse tree.
    return 1;
  }

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  private void testStableRenaming(String input1, String expected1,
                                  String input2, String expected2) {
    test(input1, expected1);
    prevUsedPropertyMap = renameProperties.getPropertyMap();
    test(input2, expected2);
  }

  private Compiler compileModules(String externs, JSModule[] modules) {
    SourceFile externsInput = SourceFile.fromCode("externs", externs);

    CompilerOptions options = new CompilerOptions();
    options.propertyRenaming = PropertyRenamingPolicy.ALL_UNQUOTED;

    Compiler compiler = new Compiler();
    compiler.compileModules(
        ImmutableList.of(externsInput), Lists.newArrayList(modules), options);
    return compiler;
  }

  @Override
  public CompilerPass getProcessor(Compiler compiler) {
    return renameProperties =
        new RenameProperties(compiler, useAffinity, generatePseudoNames,
                             prevUsedPropertyMap);
  }
}
