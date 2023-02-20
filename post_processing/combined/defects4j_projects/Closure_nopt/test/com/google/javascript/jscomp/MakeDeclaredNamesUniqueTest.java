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

import com.google.common.collect.Lists;
import com.google.javascript.jscomp.MakeDeclaredNamesUnique.InlineRenamer;
import com.google.javascript.rhino.Node;

/**
 * @author johnlenz@google.com (John Lenz)
 */
public class MakeDeclaredNamesUniqueTest extends CompilerTestCase {

  private boolean useDefaultRenamer = false;
  private boolean invert = false;
  private boolean removeConst = false;
  private final String localNamePrefix = "unique_";

  @Override
  public CompilerPass getProcessor(final Compiler compiler) {
    if (!invert) {
      return new CompilerPass() {
        @Override
        public void process(Node externs, Node root) {
          compiler.resetUniqueNameId();
          MakeDeclaredNamesUnique renamer = null;
          if (useDefaultRenamer) {
            renamer = new MakeDeclaredNamesUnique();
          } else {
            renamer = new MakeDeclaredNamesUnique(
                new InlineRenamer(
                    compiler.getUniqueNameIdSupplier(),
                    localNamePrefix,
                    removeConst));
          }
          NodeTraversal.traverseRoots(
              compiler, Lists.newArrayList(externs, root), renamer);
        }
      };
    } else {
      return MakeDeclaredNamesUnique.getContextualRenameInverter(compiler);
    }
  }

  @Override
  protected int getNumRepetitions() {
    // The normalize pass is only run once.
    return 1;
  }

  @Override
  public void setUp() {
    removeConst = false;
    invert = false;
    useDefaultRenamer = false;
  }

  private void testWithInversion(String original, String expected) {
    invert = false;
    test(original, expected);
    invert = true;
    test(expected, original);
    invert = false;
  }

  private void testSameWithInversion(String externs, String original) {
    invert = false;
    testSame(externs, original, null);
    invert = true;
    testSame(externs, original, null);
    invert = false;
  }

  private void testSameWithInversion(String original) {
    testSameWithInversion("", original);
  }

  private String wrapInFunction(String s) {
    return "function f(){" + s + "}";
  }

  private void testInFunction(String original, String expected) {
    test(wrapInFunction(original), wrapInFunction(expected));
  }

  

  

  



  

  

  

  

  

  

  

  

  

  
}
