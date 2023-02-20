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

import java.util.List;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;

/**
 * Unit tests for {@link ProcessCommonJSModules}
 */
public class ProcessCommonJSModulesTest extends CompilerTestCase {

  public ProcessCommonJSModulesTest() {
  }

  @Override
  protected CompilerPass getProcessor(Compiler compiler) {
    return new ProcessCommonJSModules(compiler, "foo/bar/", false);
  }

  @Override
  protected int getNumRepetitions() {
    return 1;
  }

  

  

  

  

  

  

  

  private void assertSortedInputs(
      List<SourceFile> expected, List<SourceFile> shuffled)
      throws Exception {
    Compiler compiler = new Compiler(System.err);
    compiler.initCompilerOptionsIfTesting();
    compiler.getOptions().setProcessCommonJSModules(true);
    compiler.getOptions().dependencyOptions.setEntryPoints(
        Lists.newArrayList(ProcessCommonJSModules.toModuleName("a")));
    compiler.compile(Lists.newArrayList(SourceFile.fromCode("externs.js", "")),
        shuffled, compiler.getOptions());

    List<SourceFile> result = Lists.newArrayList();
    for (JSModule m : compiler.getModuleGraph().getAllModules()) {
      for (CompilerInput i : m.getInputs()) {
        result.add(i.getSourceFile());
      }
    }

    assertEquals(expected, result);
  }
}
