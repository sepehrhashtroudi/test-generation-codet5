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

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.javascript.rhino.Node;

import junit.framework.TestCase;

import java.util.List;

/**
 * Unit tests for {@link AstParallelizer}.
 *
 */
public class AstParallelizerTest extends TestCase {

  private static final String HOLDER = AstParallelizer.TEMP_NAME;

  

  


  

  // TODO(johnlenz): This test is invalid it relies on allowing
  // nameless function statements, which does not parse.
  

  // TODO(johnlenz): This test is invalid it relies on allowing
  // nameless function statements, which does not parse.
  

  // TODO(johnlenz): This test is invalid it relies on allowing
  // nameless function statements, which does not parse.
  

  // TODO(johnlenz): This test is invalid it relies on allowing
  // nameless function statements, which does not parse.
  

  

  /**
   * Splits at function level with {@link AstParallelizer#split()}, verify the
   * output matches what is expected and then verify
   * {@link AstParallelizer#join()} can reverse the whole process.
   */
  private void splitFunctions(String input, String ... output) {
    Compiler compiler = new Compiler();
    Node original = compiler.parseTestCode(input);
    Node root = original.cloneTree();
    AstParallelizer parallelizer =
      AstParallelizer.createNewFunctionLevelAstParallelizer(root, true);
    List<Node> forest = parallelizer.split();
    assertEquals(output.length, forest.size());
    int i = 0;
    for (Node n : forest) {
      Node tree = compiler.parseTestCode(output[i++]);
      assertEquals(compiler.toSource(tree), compiler.toSource(n));
    }

    parallelizer.join();
    assertTrue(original.isEquivalentTo(root));
  }

  private void splitFiles(String[] input) {
    Compiler compiler = new Compiler();
    List<SourceFile> files = Lists.newArrayList();

    for (int i = 0; i < input.length; i ++) {
      files.add(SourceFile.fromCode("file" + i, input[i]));
    }

    compiler.init(
        ImmutableList.<SourceFile>of(), files, new CompilerOptions());
    compiler.parse();
    Node original = compiler.getRoot();
    Node root = original.cloneTree();

    AstParallelizer parallelizer =
      AstParallelizer.createNewFileLevelAstParallelizer(root);
    List<Node> forest = parallelizer.split();
    assertEquals(input.length, forest.size());
    int i = 0;
    for (Node n : forest) {
      Node tree = compiler.parseTestCode(input[i++]);
      assertEquals(compiler.toSource(tree), compiler.toSource(n));
    }

    parallelizer.join();
    assertTrue(original.isEquivalentTo(root));
  }
}
