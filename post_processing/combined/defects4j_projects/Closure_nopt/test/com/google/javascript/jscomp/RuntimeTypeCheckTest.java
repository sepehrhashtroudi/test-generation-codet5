/*
 * Copyright 2010 The Closure Compiler Authors.
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

import com.google.common.collect.Lists;
import com.google.javascript.rhino.Node;

/**
 * Tests for {@link RuntimeTypeCheck}.
 *
 */
public class RuntimeTypeCheckTest extends CompilerTestCase {

  public RuntimeTypeCheckTest() {
    super("/** @const */ var undefined;");
    enableTypeCheck(CheckLevel.WARNING);
  }

  @Override
  protected void setUp() {
    super.enableLineNumberCheck(false);
    enableNormalize();
  }

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  private void testChecks(String js, String expected) {
    Compiler compiler = new Compiler();
    compiler.init(Lists.<SourceFile>newArrayList(),
                  Lists.<SourceFile>newArrayList(),
                  new CompilerOptions());
    Node base = compiler.loadLibraryCode("base");
    Node typeCheck = compiler.loadLibraryCode("runtime_type_check");
    test(js,
         compiler.toSource(base) + ";"
         + compiler.toSource(typeCheck) + ";"
         + expected);
  }

  @Override
  protected CompilerPass getProcessor(final Compiler compiler) {
    return new RuntimeTypeCheck(compiler, null);
  }

  @Override
  protected int getNumRepetitions() {
    return 1;
  }
}
