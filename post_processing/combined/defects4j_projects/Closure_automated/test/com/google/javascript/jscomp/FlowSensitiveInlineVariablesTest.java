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

import com.google.javascript.rhino.Node;

/**
 * Unit tests for {@link FlowSensitiveInlineVariables}.
 *
 */
public class FlowSensitiveInlineVariablesTest extends CompilerTestCase  {

  public static final String EXTERN_FUNCTIONS = "" +
      "var print;\n" +
      "/** @nosideeffects */ function noSFX() {} \n" +
      "                      function hasSFX() {} \n";

  public FlowSensitiveInlineVariablesTest() {
    enableNormalize(true);
  }

  @Override
  public int getNumRepetitions() {
    // Test repeatedly inline.
    return 3;
  }

  @Override
  protected CompilerPass getProcessor(final Compiler compiler) {
    //return new FlowSensitiveInlineVariables(compiler);
    return new CompilerPass() {
      @Override
      public void process(Node externs, Node root) {
        (new MarkNoSideEffectCalls(compiler)).process(externs, root);
        (new FlowSensitiveInlineVariables(compiler)).process(externs, root);
      }
    };
  }

public void testAssignmentBeforeDefinition20() { 
     inline("x = 1; var x = 0; print(x)", "x = 1; var x; print(0)"); 
 }
public void testSimple35() { 
     test("function foo()   { alert(arguments[0]); }", "function foo(p0) { alert(p0); }"); 
 }
public void testDoNotInlineWithinLoop170() { 
     noInline("var y = noSFX(); do { var z = y.foo(); } while (true);"); 
 }
public void testMultiUseInSameCfgNode171() { 
     noInline("var x; x = 1; print(x) || print (x);"); 
     noInline("var x; x = 1; print(x) || print (x);"); 
     noInline("var x; x = 1; print(x) || print (x);"); 
     noInline("var x; x = 1; print(x) || print (1);"); 
     noInline("var x; x = 1; print(x) || print (1);"); 
     noInline("var x; x = 1; print(x) || print (1);"); 
     noInline("var x; x = 1; print(x) || print (1);"); 
     noInline("var x; x = 1; print(x) || print (1);"); 
     noInline("var x; x = 1; print(x) || print (1);"); 
     noInline("var x; x = 1; print(x) || print (1);"); 
     noInline("var x; x = 1; print(x) || print (1);"); 
     noInline("var x; x = 1; print(x) || print (1);"); 
     noInline("var x; x = 1; print(x) || print (1);"); 
     noInline("var x; x = 1; print(x) || print (1);"); 
     noInline("var x; x = 1; print(x);"); 
     noInline("var x; x = 1; print(x);"); 
     noInline("var x; x = 1; print(x);"); 
     noInline("var x; x = 1; print(x);"); 
     noInline("var x; x = 1; print(x);"); 
 }
public void testMultiUseInSameCfgNode172() { 
     noInline("var x; x = 1; print(x); print(x);"); 
     noInline("var x; x = 1; print(x); print(1);"); 
     noInline("var x; x = 1; print(x); print(1);"); 
     noInline("var x; x = 1; print(x); print(1);"); 
     noInline("var x; x = 1; print(x); print(1);"); 
     noInline("var x; x = 1; print(x); print(1);"); 
     noInline("var x; x = 1; print(x + 1); print(1);"); 
     noInline("var x; x = 1; print(x + 1); print(1);"); 
     noInline("var x; x = 1; print(x + 1); print(1);"); 
     noInline("var x; x = 1; print(x + 1); print(1);"); 
     noInline("var x; x = 1; print(x + 1); print(1);"); 
     noInline("var x; x = 1; print(x + 1); print(1);"); 
     noInline("var x; x = 1; print(x + 1); print(1);"); 
     noInline("var x; x = 1; print(x + 1); print(1);"); 
     noInline("var x; x = 1; print(x + 1); print(1);"); 
     noInline("var x; x = 1; print(x + 1); print(1);"); 
 }
public void testMultiUseInSameCfgNode173() { 
     noInline("var x; x = 1; print(x) || print (x);"); 
     noInline("var x; x = 1; print(x) || print (x);"); 
     noInline("var x; x = 1; print(x) || print (x);"); 
     noInline("var x; x = 1; print(x) || print (1);"); 
     noInline("var x; x = 1; print(x) || print (1);"); 
     noInline("var x; x = 1; print(x) || print (1);"); 
     noInline("var x; x = 1; print(x) || print (1);"); 
     noInline("var x; x = 1; print(x) || print (1);"); 
     noInline("var x; x = 1; print(x) || print (1);"); 
     noInline("var x; x = 1; print(x);"); 
     noInline("var x; x = 1; print(x);"); 
     noInline("var x; x = 1; print(x);"); 
     noInline("var x; x = 1; print(x);"); 
     noInline("var x; x = 1; print(x);"); 
     noInline("var x; x = 1; print(x);"); 
     noInline("var x; x = 1; print(x);"); 
     noInline("var x; x = 1; print(x);"); 
     noInline("var x; x = 1; print(x);"); 
     noInline("var x; x = 1; print(x);"); 
     noInline("var x; x = 1; print(x);"); 
 }
public void testMultiUseInSameCfgNode175() { 
     noInline("var x; x = 1; print(x); print(1);"); 
     noInline("var x; x = 1; print(x); print(1);"); 
     noInline("var x; x = 1; print(x); print(1);"); 
     noInline("var x; x = 1; print(x); print(1);"); 
     noInline("var x; x = 1; print(x); print(1);"); 
     noInline("var x; x = 1; print(x); print(1);"); 
     noInline("var x; x = 1; print(x); print(1);"); 
     noInline("var x; x = 1; print(x); print(1);"); 
     noInline("var x; x = 1; print(x); print(1);"); 
     noInline("var x; x = 1; print(x); print(1);"); 
     noInline("var x; x = 1; print(x); print(1);"); 
     noInline("var x; x = 1; print(x); print(1);"); 
     noInline("var x; x = 1; print(x); print(1);"); 
     noInline("var x; x = 1; print(x); print(1);"); 
     noInline("var x; x = 1; print(x); print(1);"); 
     noInline("var x; x = 1; print(x); print(1);"); 
     noInline("var x; x = 1; print(x); print(1);"); 
 }
public void testNoArgumentRemovalNonEqualNodes294() { 
     testSame("function foo(a){}; foo('bar'); foo('baz');"); 
     testSame("function foo(a){}; foo(1.0); foo(2.0);"); 
     testSame("function foo(a){}; foo(true); foo(false);"); 
     testSame("var a = 1, b = 2; function foo(a){}; foo(a); foo(b);"); 
     testSame("function foo(a){}; foo(/&/g); foo(/</g);"); 
 }
public void testCheckTreeEquals301() { 
     Node node1 = new Node(1, new Node(2)); 
     Node node2 = new Node(1); 
     assertNull(node1.checkTreeEquals(node2)); 
 }
public void testUnhandledTopNode304() { 
     testSame("function Foo() {}; Foo.prototype.isBar = function() {};" + "function Bar() {}; Bar.prototype.isFoo = function() {};" + "var foo = new Foo(); var bar = new Bar();" + "var cond = foo.isBar() && bar.isFoo();" + "if (cond) {window.alert('hello');}"); 
 }
public void testDoNotInlineIntoLhsOfAssign309() { 
     noInline("var x = 1; x += 3;"); 
 }
  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  // TODO(user): These should be inlinable.
  

  // TODO(user): These should be inlinable.
  

  // TODO(user): These should be inlinable.
  

  // TODO(user): These should be inlinable after the REGEX checks.
  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  private void noInline(String input) {
    inline(input, input);
  }

  private void inline(String input, String expected) {
    test(EXTERN_FUNCTIONS, "function _func() {" + input + "}",
        "function _func() {" + expected + "}", null, null);
  }
}
