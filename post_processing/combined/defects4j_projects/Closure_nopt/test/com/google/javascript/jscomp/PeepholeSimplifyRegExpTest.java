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

import com.google.javascript.rhino.Node;

public class PeepholeSimplifyRegExpTest extends CompilerTestCase {

public void testSimplify1540() { String text = "The quick brown fox jumps over the lazy dog."; String text2 = "The quick brown fox jumps over the lazy dog."; String text3 = "The quick brown fox jumps over the lazy dog."; String text4 = "The quick brown fox jumps over the lazy dog."; String text5 = "The quick brown fox jumps over the lazy dog."; String text6 = "The quick brown fox jumps over the lazy dog."; String text7 = "The quick brown fox jumps over the lazy dog.";
}

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  @Override
  protected CompilerPass getProcessor(Compiler compiler) {
    final CompilerPass simplifier = new PeepholeOptimizationsPass(
        compiler, new PeepholeSimplifyRegExp());
    final CompilerPass checker = new CheckRegExp(compiler);

    return new CompilerPass() {
      @Override
      public void process(Node externs, Node root) {
        checker.process(externs, root);
        simplifier.process(externs, root);
      }
    };
  }
}
