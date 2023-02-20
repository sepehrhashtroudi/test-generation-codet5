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

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.google.javascript.jscomp.AbstractCompiler.LifeCycleStage;
import com.google.javascript.jscomp.FunctionInjector.CanInlineResult;
import com.google.javascript.jscomp.FunctionInjector.InliningMode;
import com.google.javascript.jscomp.NodeTraversal.Callback;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

import junit.framework.TestCase;

import java.util.List;
import java.util.Set;

/**
 * Inline function tests.
 * @author johnlenz@google.com (John Lenz)
 */

public class FunctionInjectorTest extends TestCase {
  static final InliningMode INLINE_DIRECT = InliningMode.DIRECT;
  static final InliningMode INLINE_BLOCK = InliningMode.BLOCK;
  private boolean assumeStrictThis = false;
  private boolean assumeMinimumCapture = false;

  @Override
  protected void setUp() throws Exception {
    super.setUp();
    assumeStrictThis = false;
  }

  private FunctionInjector getInjector() {
    Compiler compiler = new Compiler();
    return new FunctionInjector(
        compiler, compiler.getUniqueNameIdSupplier(), true,
        assumeStrictThis, assumeMinimumCapture);
  }

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

// TODO(nicksantos): Re-enable with side-effect detection.
//   public void testCanInlineReferenceToFunction13() {
//     // ... if foo is side-effect free we can inline here.
//     helperCanInlineReferenceToFunction(true,
//         "/** @nosideeffects */ function foo(){return true;};" +
//         "var x; x=x+foo();", "foo", INLINE_BLOCK);
//   }

  

  

  // TODO(johnlenz): remove this constant once this has been proven in
  // production code.
  static final CanInlineResult NEW_VARS_IN_GLOBAL_SCOPE =
      CanInlineResult.YES;

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

 

  

  

  

  

  

  

  

// TODO(nicksantos): Re-enable with side-effect detection.
//   public void testCanInlineReferenceToFunctionInExpression11() {
//     helperCanInlineReferenceToFunction(true,
//         "/** @nosideeffects */ function foo(a){return true;}; " +
//         "function x() {var b; b += 1 + foo(1) }",
//         "foo", INLINE_BLOCK);
//   }

  

  

  

  

// TODO(nicksantos): Re-enable with side-effect detection.
//   public void testCanInlineReferenceToFunctionInExpression15() {
//     // ... foo can be inlined as it is side-effect free.
//     helperCanInlineReferenceToFunction(true,
//         "var a = {}, b = {}, c;" +
//         "a.test = 'a';" +
//         "b.test = 'b';" +
//         "c = a;" +
//         "/** @nosideeffects */ function foo(){return 'foo'};" +
//         "c.test=foo();",
//         "foo", INLINE_BLOCK);
//   }

//   public void testCanInlineReferenceToFunctionInExpression16() {
//     // ... foo can not be inlined because of possible side-effects of x()
//     helperCanInlineReferenceToFunction(false,
//         "var a = {}, b = {}, c;" +
//         "a.test = 'a';" +
//         "b.test = 'b';" +
//         "c = a;" +
//         "function x(){return c};" +
//         "/** @nosideeffects */ function foo(){return 'foo'};" +
//         "x().test=foo();",
//         "foo", INLINE_BLOCK);
//   }

//   public void testCanInlineReferenceToFunctionInExpression17() {
//     // ... foo can be inlined because of x() is side-effect free.
//     helperCanInlineReferenceToFunction(true,
//         "var a = {}, b = {}, c;" +
//         "a.test = 'a';" +
//         "b.test = 'b';" +
//         "c = a;" +
//         "/** @nosideeffects */ function x(){return c};" +
//         "/** @nosideeffects */ function foo(){return 'foo'};" +
//         "x().test=foo();",
//         "foo", INLINE_BLOCK);
//   }

  

  

  

// TODO(nicksantos): Re-enable with side-effect detection.
//   public void testCanInlineReferenceToFunctionInExpression20() {
//     helperCanInlineReferenceToFunction(true,
//         "/** @nosideeffects */ function foo(){return a;}; " +
//         "function x() {1 + _g(foo()) }",
//         "foo", INLINE_BLOCK);
//   }

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

// TODO(nicksantos): Re-enable with side-effect detection.
//   public void testInlineReferenceInExpression10() {
//     // Call in assignment expression.
//     helperInlineReferenceToFunction(
//         "/** @nosideeffects */ function foo(a){return true;}; " +
//         "function x() {var b; b += 1 + foo(1) }",
//         "function foo(a){return true;}; " +
//         "function x() {var b;" +
//         "{var JSCompiler_inline_result$$0; " +
//         "JSCompiler_inline_result$$0=true;}" +
//         "b += 1 + JSCompiler_inline_result$$0 }",
//         "foo", INLINE_BLOCK);
//   }

  

  

  

  

  

  

  


  

// TODO(nicksantos): Re-enable with side-effect detection.
//   public void testInlineWithinCalls2() {
//     helperInlineReferenceToFunction(
//         "/** @nosideeffects */ function foo(){return true;}; " +
//         "function x() {1 + _g(foo()) }",
//         "function foo(){return true;}; " +
//         "function x() { {var JSCompiler_inline_result$$0; " +
//         "JSCompiler_inline_result$$0=true;}" +
//         "1 + _g(JSCompiler_inline_result$$0) }",
//         "foo", INLINE_BLOCK, true);
//   }

  

  

  /**
   * Test case
   *
   * var a = {}, b = {}
   * a.test = "a", b.test = "b"
   * c = a;
   * foo() { c=b; return "a" }
   * c.teste
   *
   */

  public void helperCanInlineReferenceToFunction(
      final CanInlineResult expectedResult,
      final String code,
      final String fnName,
      final InliningMode mode) {
    helperCanInlineReferenceToFunction(
        expectedResult, code, fnName, mode, false);
  }

  public void helperCanInlineReferenceToFunction(
      final CanInlineResult expectedResult,
      final String code,
      final String fnName,
      final InliningMode mode,
      boolean allowDecomposition) {
    final Compiler compiler = new Compiler();
    final FunctionInjector injector = new FunctionInjector(
        compiler, compiler.getUniqueNameIdSupplier(), allowDecomposition,
        assumeStrictThis,
        assumeMinimumCapture);
    final Node tree = parse(compiler, code);

    Node externsRoot = new Node(Token.EMPTY);
    Node mainRoot = tree;

    final Node fnNode = findFunction(tree, fnName);
    final Set<String> unsafe =
        FunctionArgumentInjector.findModifiedParameters(fnNode);

    // can-inline tester
    Method tester = new Method() {
      @Override
      public boolean call(NodeTraversal t, Node n, Node parent) {
        CanInlineResult result = injector.canInlineReferenceToFunction(
            t, n, fnNode, unsafe, mode,
            NodeUtil.referencesThis(fnNode),
            NodeUtil.containsFunction(NodeUtil.getFunctionBody(fnNode)));
        assertEquals(expectedResult, result);
        return true;
      }
    };

    compiler.resetUniqueNameId();
    TestCallback test = new TestCallback(fnName, tester);
    NodeTraversal.traverse(compiler, tree, test);
  }

  public void helperInlineReferenceToFunction(
      String code, final String expectedResult,
      final String fnName, final InliningMode mode) {
    helperInlineReferenceToFunction(
        code, expectedResult, fnName, mode, false);
  }

  private void validateSourceInfo(Compiler compiler, Node subtree) {
    (new LineNumberCheck(compiler)).setCheckSubTree(subtree);
    // Source information problems are reported as compiler errors.
    if (compiler.getErrorCount() != 0) {
      String msg = "Error encountered: ";
      for (JSError err : compiler.getErrors()) {
        msg += err.toString() + "\n";
      }
      assertTrue(msg, compiler.getErrorCount() == 0);
    }
  }

  public void helperInlineReferenceToFunction(
      String code, final String expectedResult,
      final String fnName, final InliningMode mode,
      final boolean decompose) {
    final Compiler compiler = new Compiler();
    final FunctionInjector injector = new FunctionInjector(
        compiler, compiler.getUniqueNameIdSupplier(), decompose,
        assumeStrictThis,
        assumeMinimumCapture);

    List<SourceFile> externsInputs = Lists.newArrayList(
        SourceFile.fromCode("externs", ""));

    CompilerOptions options = new CompilerOptions();
    options.setCodingConvention(new GoogleCodingConvention());
    compiler.init(externsInputs, Lists.newArrayList(
        SourceFile.fromCode("code", code)), options);
    Node parseRoot = compiler.parseInputs();
    Node externsRoot = parseRoot.getFirstChild();
    final Node tree = parseRoot.getLastChild();
    assertNotNull(tree);
    assertTrue(tree != externsRoot);

    final Node expectedRoot = parseExpected(new Compiler(), expectedResult);

    Node mainRoot = tree;
    MarkNoSideEffectCalls mark = new MarkNoSideEffectCalls(compiler);
    mark.process(externsRoot, mainRoot);

    Normalize normalize = new Normalize(compiler, false);
    normalize.process(externsRoot, mainRoot);
    compiler.setLifeCycleStage(LifeCycleStage.NORMALIZED);

    final Node fnNode = findFunction(tree, fnName);
    assertNotNull(fnNode);
    final Set<String> unsafe =
        FunctionArgumentInjector.findModifiedParameters(fnNode);
    assertNotNull(fnNode);

    // inline tester
    Method tester = new Method() {
      @Override
      public boolean call(NodeTraversal t, Node n, Node parent) {

        CanInlineResult canInline = injector.canInlineReferenceToFunction(
            t, n, fnNode, unsafe, mode,
            NodeUtil.referencesThis(fnNode),
            NodeUtil.containsFunction(NodeUtil.getFunctionBody(fnNode)));
        assertTrue("canInlineReferenceToFunction should not be CAN_NOT_INLINE",
            CanInlineResult.NO != canInline);
        if (decompose) {
          assertTrue("canInlineReferenceToFunction " +
              "should be CAN_INLINE_AFTER_DECOMPOSITION",
              CanInlineResult.AFTER_PREPARATION == canInline);

          Set<String> knownConstants = Sets.newHashSet();
          ExpressionDecomposer decomposer = new ExpressionDecomposer(
              compiler, compiler.getUniqueNameIdSupplier(), knownConstants);
          injector.setKnownConstants(knownConstants);
          injector.maybePrepareCall(n);

          assertTrue("canInlineReferenceToFunction " +
              "should be CAN_INLINE",
              CanInlineResult.YES != canInline);
        }

        Node result = injector.inline(
            t, n, fnName, fnNode, mode);
        validateSourceInfo(compiler, result);
        String explanation = expectedRoot.checkTreeEquals(tree.getFirstChild());
        assertNull("\nExpected: " + toSource(expectedRoot) +
            "\nResult: " + toSource(tree.getFirstChild()) +
            "\n" + explanation, explanation);
        return true;
      }
    };

    compiler.resetUniqueNameId();
    TestCallback test = new TestCallback(fnName, tester);
    NodeTraversal.traverse(compiler, tree, test);
  }

  interface Method {
    boolean call(NodeTraversal t, Node n, Node parent);
  }

  class TestCallback implements Callback {

    private final String callname;
    private final Method method;
    private boolean complete = false;

    TestCallback(String callname, Method method) {
      this.callname = callname;
      this.method = method;
    }

    @Override
    public boolean shouldTraverse(
        NodeTraversal nodeTraversal, Node n, Node parent) {
      return !complete;
    }

    @Override
    public void visit(NodeTraversal t, Node n, Node parent) {
      if (n.isCall()) {
        Node callee;
        if (NodeUtil.isGet(n.getFirstChild())) {
          callee = n.getFirstChild().getFirstChild();
        } else {
          callee = n.getFirstChild();
        }

        if (callee.isName() &&
            callee.getString().equals(callname)) {
          complete = method.call(t, n, parent);
        }
      }

      if (parent == null) {
        assertTrue(complete);
      }
    }
  }

  private static Node findFunction(Node n, String name) {
    if (n.isFunction()) {
      if (n.getFirstChild().getString().equals(name)) {
        return n;
      }
    }

    for (Node c : n.children()) {
      Node result = findFunction(c, name);
      if (result != null) {
        return result;
      }
    }

    return null;
  }

  private static Node prep(String js) {
    Compiler compiler = new Compiler();
    Node n = compiler.parseTestCode(js);
    assertEquals(0, compiler.getErrorCount());
    return n.getFirstChild();
  }

  private static Node parse(Compiler compiler, String js) {
    Node n = compiler.parseTestCode(js);
    assertEquals(0, compiler.getErrorCount());
    return n;
  }

  private static Node parseExpected(Compiler compiler, String js) {
    Node n = compiler.parseTestCode(js);
    String message = "Unexpected errors: ";
    JSError[] errs = compiler.getErrors();
    for (int i = 0; i < errs.length; i++){
      message += "\n" + errs[i].toString();
    }
    assertEquals(message, 0, compiler.getErrorCount());
    return n;
  }

  private static String toSource(Node n) {
    return new CodePrinter.Builder(n)
        .setPrettyPrint(false)
        .setLineBreak(false)
        .setSourceMap(null)
        .build();
  }

}
