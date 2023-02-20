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

/**
 * Unit tests for {#link {@link PeepholeReplaceKnownMethods}
 *
 */
public class PeepholeReplaceKnownMethodsTest extends CompilerTestCase {

  private boolean late = true;

  public PeepholeReplaceKnownMethodsTest() {
    super("");
  }

  @Override
  public void setUp() {
    enableLineNumberCheck(true);
  }

  @Override
  public CompilerPass getProcessor(final Compiler compiler) {
    CompilerPass peepholePass = new PeepholeOptimizationsPass(compiler,
          new PeepholeReplaceKnownMethods(late));
    return peepholePass;
  }

public void testFoldStringCharAt8() { 
     fold("x = 'abcde'.charCodeAt(0)", "x = 97"); 
     fold("x = 'abcde'.charCodeAt(1)", "x = 98"); 
     fold("x = 'abcde'.charCodeAt(2)", "x = 99"); 
     fold("x = 'abcde'.charCodeAt(3)", "x = 100"); 
     fold("x = 'abcde'.charCodeAt(4)", "x = 101"); 
     foldSame("x = 'abcde'.charCodeAt(5)"); 
     foldSame("x = 'abcde'.charCodeAt(-1)"); 
     foldSame("x = 'abcde'.charCodeAt(y)"); 
     foldSame("x = 'abcde'.charCodeAt()"); 
     foldSame("x = 'abcde'.charCodeAt(0, ++z)"); 
     foldSame("x = 'abcde'.charCodeAt(null)"); 
     foldSame("x = 'abcde'.charCodeAt(true)"); 
     fold("x = '\\ud834\udd1e'.charCodeAt(0)", "x = 55348"); 
     fold("x = '\\ud834\udd1e'.charCodeAt(1)", "x = 56606"); 
 }
public void testFoldStringCharAt111() { 
     fold("x = 'abcde'.charAt(0)", "x = 97"); 
     fold("x = 'abcde'.charAt(1)", "x = 98"); 
     fold("x = 'abcde'.charAt(2)", "x = 99"); 
     fold("x = 'abcde'.charAt(3)", "x = 100"); 
     fold("x = 'abcde'.charAt(4)", "x = 101"); 
     foldSame("x = 'abcde'.charAt(5)"); 
     foldSame("x = 'abcde'.charAt(-1)"); 
     foldSame("x = 'abcde'.charAt(y)"); 
     foldSame("x = 'abcde'.charAt()"); 
     foldSame("x = 'abcde'.charAt(0, ++z)"); 
     foldSame("x = 'abcde'.charAt(null)"); 
     foldSame("x = 'abcde'.charAt(true)"); 
     fold("x = '\\ud834\udd1e'.charAt(0)", "x = 55348"); 
     fold("x = '\\ud834\udd1e'.charAt(1)", "x = 56606"); 
 }
  

  

  

  

  

  

  

  

  

  

  

  

  

  

  @Override
  protected int getNumRepetitions() {
    // Reduce this to 2 if we get better expression evaluators.
    return 2;
  }

  private void foldSame(String js) {
    testSame(js);
  }

  private void fold(String js, String expected) {
    test(js, expected);
  }
}
