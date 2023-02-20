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

import com.google.common.collect.Maps;

import com.google.javascript.jscomp.CompilerOptions.LanguageMode;
import com.google.javascript.rhino.Node;

import java.util.Map;

/**
 * Unit test for AmbiguateProperties Compiler pass.
 *
 */
public class AmbiguatePropertiesTest extends CompilerTestCase {
  private AmbiguateProperties lastPass;

  private static final String EXTERNS =
      "Function.prototype.call=function(){};" +
      "Function.prototype.inherits=function(){};" +
      "prop.toString;" +
      "var google = { gears: { factory: {}, workerPool: {} } };";

  public AmbiguatePropertiesTest() {
    super(EXTERNS);
    enableNormalize();
    enableTypeCheck(CheckLevel.WARNING);
    enableClosurePass();
  }

  @Override
  public CompilerPass getProcessor(final Compiler compiler) {
    return new CompilerPass() {
      @Override
      public void process(Node externs, Node root) {
        lastPass = new AmbiguateProperties(compiler, new char[]{'$'});
        lastPass.process(externs, root);
      }
    };
  }

  @Override
  protected int getNumRepetitions() {
    return 1;
  }

  @Override
  protected CompilerOptions getOptions() {
    // no missing properties check
    CompilerOptions options = new CompilerOptions();
    options.setLanguageIn(LanguageMode.ECMASCRIPT5);
    return options;
  }

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  
}
