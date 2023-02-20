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

import com.google.javascript.rhino.Node;

/**
 * Tests for PeepholeRemoveDeadCodeTest in isolation. Tests for the interaction
 * of multiple peephole passes are in PeepholeIntegrationTest.
 */
public class PeepholeRemoveDeadCodeTest extends CompilerTestCase {

  private static final String MATH =
      "/** @const */ var Math = {};" +
      "/** @nosideeffects */ Math.random = function(){};" +
      "/** @nosideeffects */ Math.sin = function(){};";

  public PeepholeRemoveDeadCodeTest() {
    super(MATH);
  }

  @Override
  public void setUp() throws Exception {
    super.setUp();
    enableLineNumberCheck(true);
  }

  @Override
  public CompilerPass getProcessor(final Compiler compiler) {
    return new CompilerPass() {
      @Override
      public void process(Node externs, Node root) {
        SimpleDefinitionFinder definitionFinder =
            new SimpleDefinitionFinder(compiler);
        definitionFinder.process(externs, root);
        new PureFunctionIdentifier(compiler, definitionFinder)
            .process(externs, root);
        PeepholeOptimizationsPass peepholePass =
            new PeepholeOptimizationsPass(
                compiler, new PeepholeRemoveDeadCode());
        peepholePass.process(externs, root);
      }
    };
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

public void testConstantConditionWithSideEffect136() { 
     fold("if (b=true) x=1;", "b=true;x=1"); 
     fold("if (b=/ab/) x=1;", "b=/ab/;x=1"); 
     fold("if (b=/ab/){ x=1; } else { x=2; }", "b=/ab/;x=1"); 
     fold("var b;b=/ab/;if(b)x=1;", "var b;b=/ab/;x=1"); 
     foldSame("var b;b=f();if(b)x=1;"); 
     fold("var b=/ab/;if(b)x=1;", "var b=/ab/;x=1"); 
     foldSame("var b=f();if(b)x=1;"); 
     foldSame("b=b++;if(b)x=b;"); 
     fold("(b=0,b=1);if(b)x=b;", "b=0,b=1;if(b)x=b;"); 
     fold("b=1;if(foo,b)x=b;", "b=1;x=b;"); 
     foldSame("b=1;if(foo=1,b)x=b;"); 
 }
public void testRemoveNamespaceGet260() { 
     test("var a = {};a.b=1;a.b", "var a = {};a.b=1"); 
 }
public void testHook310() { 
     fold("true ? a() : b()", "a()"); 
     fold("false ? a() : b()", "b()"); 
     fold("a() ? b() : true", "a() && b()"); 
     fold("(a = true) ? b() : c()", "a = true, b()"); 
     fold("(a = false) ? b() : c()", "a = false, c()"); 
     fold("do {f()} while((a = true) ? b() : c())", "do {f()} while((a = true) , b())"); 
     fold("do {f()} while((a = false) ? b() : c())", "do {f()} while((a = false) , c())"); 
     fold("var x = (true) ? 1 : 0", "var x=1"); 
     fold("var y = (true) ? ((false) ? 12 : (cond ? 1 : 2)) : 13", "var y=cond?1:2"); 
     foldSame("var z=x?void 0:y()"); 
     foldSame("z=x?void 0:y()"); 
     foldSame("z*=x?void 0:y()"); 
     foldSame("var z=x?y():void 0"); 
     foldSame("(w?x:void 0).y=z"); 
     foldSame("(w?x:void 0).y+=z"); 
     fold("y = (x ? void 0 : void 0)", "y = void 0"); 
     fold("y = (x ? f() : f())", "y = f()"); 
 }
  

  /** Try to remove spurious blocks with multiple children */
  

  

  

  

  

  

  

  

  

  

  


  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  // TODO(johnlenz): Consider adding a post optimization pass to
  // convert OR into HOOK to save parentheses when the operator
  // precedents would require them.
  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  
}
