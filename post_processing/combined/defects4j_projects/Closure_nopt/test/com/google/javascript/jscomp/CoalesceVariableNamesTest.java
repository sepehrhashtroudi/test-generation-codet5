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

import com.google.javascript.rhino.Node;

/**
 * Unit tests for {@link CoalesceVariableNames}
 *
 */
public class CoalesceVariableNamesTest extends CompilerTestCase {
  // The spacing in this file is not exactly standard but it greatly helps
  // picking out which variable names are merged.

  private boolean usePseudoName = false;

  @Override
  protected int getNumRepetitions() {
   return 1;
  }

  @Override
  public void setUp() {
    super.enableLineNumberCheck(true);
    usePseudoName = false;
  }

  @Override
  public CompilerPass getProcessor(final Compiler compiler) {
    return new CompilerPass() {
      @Override
      public void process(Node externs, Node js) {
        NodeTraversal.traverse(compiler, js,
            new CoalesceVariableNames(compiler, usePseudoName));
      }
    };
  }

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  // Sometimes live range can be cross even within a VAR declaration.
  

  

  

  

  

  

  private void inFunction(String src) {
    inFunction(src, src);
  }

  private void inFunction(String src, String expected) {
    test("function FUNC(){" + src + "}",
         "function FUNC(){" + expected + "}");
  }

  private void test(String src) {
    test(src, src);
  }
}
