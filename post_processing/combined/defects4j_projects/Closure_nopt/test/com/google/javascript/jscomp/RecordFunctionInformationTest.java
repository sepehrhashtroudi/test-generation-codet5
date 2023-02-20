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

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.javascript.rhino.Node;

import junit.framework.TestCase;

/**
 * Tests for {@link RecordFunctionInformation}
 *
 */
public class RecordFunctionInformationTest extends TestCase {

  

  

  


  private void test(String js, FunctionInformationMap expected) {
    Compiler compiler = new Compiler();
    compiler.init(ImmutableList.of(SourceFile.fromCode("externs", "")),
                  ImmutableList.of(SourceFile.fromCode("testcode", js)),
                  new CompilerOptions());
    test(compiler, expected);
  }

  private void test(JSModule[] modules, FunctionInformationMap expected) {
    test(compilerFor(modules), expected);
  }

  private void test(Compiler compiler, FunctionInformationMap expected) {
    Node root = root(compiler);
    test(compiler, externs(root), main(root), expected);
  }

  private void test(Compiler compiler, Node externsRoot, Node mainRoot,
      FunctionInformationMap expected) {
    FunctionNames functionNames = new FunctionNames(compiler);
    functionNames.process(externsRoot, mainRoot);

    RecordFunctionInformation processor =
        new RecordFunctionInformation(compiler, functionNames);
    processor.process(externsRoot, mainRoot);
    FunctionInformationMap result = processor.getMap();
    assertEquals(expected, result);
  }

  private Compiler compilerFor(JSModule[] modules) {
      Compiler compiler = new Compiler();
      compiler.initModules(
          ImmutableList.of(SourceFile.fromCode("externs", "")),
          Lists.newArrayList(modules),
          new CompilerOptions());
      return compiler;
  }

  private Node root(Compiler compiler) {
    return compiler.parseInputs();
  }

  private Node externs(Node root) {
    return root.getFirstChild();
  }

  private Node main(Node root) {
    return root.getFirstChild().getNext();
  }
}
