/*
 * Copyright 2004 The Closure Compiler Authors.
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
 * Tests for {@link PeepholeSubstituteAlternateSyntax} in isolation.
 * Tests for the interaction of multiple peephole passes are in
 * PeepholeIntegrationTest.
 */
public class PeepholeSubstituteAlternateSyntaxTest extends CompilerTestCase {

  // Externs for built-in constructors
  // Needed for testFoldLiteralObjectConstructors(),
  // testFoldLiteralArrayConstructors() and testFoldRegExp...()
  private static final String FOLD_CONSTANTS_TEST_EXTERNS =
      "var Object = function f(){};\n" +
      "var RegExp = function f(a){};\n" +
      "var Array = function f(a){};\n";

  private boolean late = true;

  // TODO(user): Remove this when we no longer need to do string comparison.
  private PeepholeSubstituteAlternateSyntaxTest(boolean compareAsTree) {
    super(FOLD_CONSTANTS_TEST_EXTERNS, compareAsTree);
  }

  public PeepholeSubstituteAlternateSyntaxTest() {
    super(FOLD_CONSTANTS_TEST_EXTERNS);
  }

  @Override
  public void setUp() throws Exception {
    late = true;
    super.setUp();
    enableLineNumberCheck(true);
    disableNormalize();
  }

  @Override
  public CompilerPass getProcessor(final Compiler compiler) {
    CompilerPass peepholePass =
      new PeepholeOptimizationsPass(compiler,
          new PeepholeSubstituteAlternateSyntax(late))
      .setRetraverseOnChange(false);

    return peepholePass;
  }

  @Override
  protected int getNumRepetitions() {
    return 1;
  }

  private void foldSame(String js) {
    testSame(js);
  }

  private void fold(String js, String expected) {
    test(js, expected);
  }

  void assertResultString(String js, String expected) {
    assertResultString(js, expected, false);
  }

  // TODO(user): This is same as fold() except it uses string comparison. Any
  // test that needs tell us where a folding is constructing an invalid AST.
  void assertResultString(String js, String expected, boolean normalize) {
    PeepholeSubstituteAlternateSyntaxTest scTest
        = new PeepholeSubstituteAlternateSyntaxTest(false);

    if (normalize) {
      scTest.enableNormalize();
    } else {
      scTest.disableNormalize();
    }

    scTest.test(js, expected);
  }

  /** Check that removing blocks with 1 child works */
public void testFoldRegExpConstructor337() { 
     enableNormalize(); 
     fold("x = new RegExp", "x = RegExp()"); 
     fold("x = new RegExp(\"\")", "x = RegExp(\"\")"); 
     fold("x = new RegExp(\"\", \"i\")", "x = RegExp(\"\",\"i\")"); 
     testSame("x = RegExp(\"foobar\", \"bogus\")", PeepholeSubstituteAlternateSyntax.INVALID_REGULAR_EXPRESSION_FLAGS); 
     fold("x = new RegExp(\"foobar\")", "x = /foobar/"); 
     fold("x = RegExp(\"foobar\")", "x = /foobar/"); 
     fold("x = new RegExp(\"foobar\", \"i\")", "x = /foobar/i"); 
     fold("x = new RegExp(\"\\\\.\", \"i\")", "x = /\\./i"); 
     fold("x = new RegExp(\"/\", \"\")", "x = /\\//"); 
     fold("x = new RegExp(\"[/]\", \"\")", "x = /[/]/"); 
     fold("x = new RegExp(\"///\", \"\")", "x = /\\/\\/\\//"); 
     fold("x = new RegExp(\"\\\\\\/\", \"\")", "x = /\\//"); 
     fold("x = new RegExp(\"\\n\")", "x = /\\n/"); 
     fold("x = new RegExp('\\\\\\r')", "x = /\\r/"); 
     String longRegexp = ""; 
     for (int i = 0; i < 200; i++) longRegexp += "x"; 
     foldSame("x = RegExp(\"" + longRegexp + "\")"); 
     disableNormalize(); 
     foldSame("x = new RegExp(\"foobar\")"); 
 }
public void testFoldRegExpConstructor338() { 
     enableNormalize(); 
     fold("x = new RegExp", "x = RegExp()"); 
     fold("x = new RegExp(\"\")", "x = RegExp(\"\")"); 
     fold("x = new RegExp(\"\", \"i\")", "x = RegExp(\"\",\"i\")"); 
     testSame("x = RegExp(\"foobar\", \"bogus\")", PeepholeSubstituteAlternateSyntax.INVALID_REGULAR_EXPRESSION_FLAGS); 
     fold("x = new RegExp(\"foobar\")", "x = /foobar/"); 
     fold("x = RegExp(\"foobar\", \"i\")", "x = /foobar/i"); 
     fold("x = new RegExp(\"\\\\.\", \"i\")", "x = /\\./i"); 
     fold("x = new RegExp(\"/\", \"\")", "x = /\\//"); 
     fold("x = new RegExp(\"[/]\", \"\")", "x = /[/]/"); 
     fold("x = new RegExp(\"///\", \"\")", "x = /\\/\\/\\//"); 
     fold("x = new RegExp(\"\\\\\\/\", \"\")", "x = /\\//"); 
     fold("x = new RegExp(\"\\n\")", "x = /\\n/"); 
     fold("x = new RegExp('\\\\\\r')", "x = /\\r/"); 
     String longRegexp = ""; 
     for (int i = 0; i < 200; i++) longRegexp += "x"; 
     foldSame("x = RegExp(\"" + longRegexp + "\")"); 
     disableNormalize(); 
     foldSame("x = new RegExp(\"foobar\")"); 
 }
public void testFoldReturns341() { 
     fold("function f(){if(x)return 1;else return 2}", "function f(){return x?1:2}"); 
     fold("function f(){if(x)return 1;return 2}", "function f(){return x?1:2}"); 
     fold("function f(){if(x)return;return 2}", "function f(){return x?void 0:2}"); 
     fold("function f(){if(x)return 1+x;else return 2-x}", "function f(){return x?1+x:2-x}"); 
     fold("function f(){if(x)return 1+x;return 2-x}", "function f(){return x?1+x:2-x}"); 
     fold("function f(){if(x)return y += 1;else return y += 2}", "function f(){return x?(y+=1):(y+=2)}"); 
     fold("function f(){if(x)return;else return 2-x}", "function f(){if(x);else return 2-x}"); 
     fold("function f(){if(x)return;return 2-x}", "function f(){return x?void 0:2-x}"); 
     fold("function f(){if(x)return x;else return}", "function f(){if(x)return x;{}}"); 
     fold("function f(){if(x)return x;return}", "function f(){if(x)return x}"); 
     foldSame("function f(){for(var x in y) { return x.y; } return k}"); 
 }
  

  /** Try to minimize returns */
  

  

  

  


  /** Try to minimize assignments */
  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  


  

  

  

  

  
  

  

  

  

  

  

  

  

  

  

  


  

  

  

  

  

  

  

  

  private static class StringCompareTestCase extends CompilerTestCase {

    StringCompareTestCase() {
      super("", false);
    }

    @Override
    protected CompilerPass getProcessor(Compiler compiler) {
      CompilerPass peepholePass =
        new PeepholeOptimizationsPass(compiler,
            new PeepholeSubstituteAlternateSyntax(false));
      return peepholePass;
    }

    


  }
}
