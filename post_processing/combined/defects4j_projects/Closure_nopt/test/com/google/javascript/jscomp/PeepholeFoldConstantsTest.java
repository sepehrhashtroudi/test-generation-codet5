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

import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.javascript.rhino.Node;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Tests for {@link PeepholeFoldConstants} in isolation. Tests for
 * the interaction of multiple peephole passes are in
 * {@link PeepholeIntegrationTest}.
 */
public class PeepholeFoldConstantsTest extends CompilerTestCase {

  private boolean late;

  // TODO(user): Remove this when we no longer need to do string comparison.
  private PeepholeFoldConstantsTest(boolean compareAsTree) {
    super("", compareAsTree);
  }

  public PeepholeFoldConstantsTest() {
    super("");
  }

  @Override
  public void setUp() {
    late = false;
    enableLineNumberCheck(true);
  }

  @Override
  public CompilerPass getProcessor(final Compiler compiler) {
    CompilerPass peepholePass = new PeepholeOptimizationsPass(compiler,
          new PeepholeFoldConstants(late));
    return peepholePass;
  }

  @Override
  protected int getNumRepetitions() {
    // Reduce this to 1 if we get better expression evaluators.
    return 2;
  }

  private void foldSame(String js) {
    testSame(js);
  }

  private void fold(String js, String expected) {
    test(js, expected);
  }

  private void fold(String js, String expected, DiagnosticType warning) {
    test(js, expected, null, warning);
  }

  // TODO(user): This is same as fold() except it uses string comparison. Any
  // test that needs tell us where a folding is constructing an invalid AST.
  private void assertResultString(String js, String expected) {
    PeepholeFoldConstantsTest scTest = new PeepholeFoldConstantsTest(false);

    scTest.test(js, expected);
  }

public void testTryReduceOperandsForOp2768() throws Exception { }
public void testTryFoldCtorCall2924() { }
  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  // ===, !== comparison tests
  

  

  

  

  

  

  

  

  

  

  

 

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  private static final List<String> LITERAL_OPERANDS =
      ImmutableList.of(
          "null",
          "undefined",
          "void 0",
          "true",
          "false",
          "!0",
          "!1",
          "0",
          "1",
          "''",
          "'123'",
          "'abc'",
          "'def'",
          "NaN",
          "Infinity",
          // TODO(nicksantos): Add more literals
          "-Infinity"
          //"({})",
          // "[]"
          //"[0]",
          //"Object",
          //"(function() {})"
          );

  

  

  

  private String join(String operandA, String op, String operandB) {
    return operandA + " " + op + " " + operandB;
  }

  private void assertSameResultsOrUncollapsed(String exprA, String exprB) {
    String resultA = process(exprA);
    String resultB = process(exprB);  // TODO: why is nothing done with this?
    if (resultA.equals(print(exprA))) {
      foldSame(exprA);
      foldSame(exprB);
    } else {
      assertSameResults(exprA, exprB);
    }
  }

  private void assertSameResults(String exprA, String exprB) {
    assertEquals(
        "Expressions did not fold the same\nexprA: " +
        exprA + "\nexprB: " + exprB,
        process(exprA), process(exprB));
  }

  private void assertNotSameResults(String exprA, String exprB) {
    assertFalse(
        "Expressions folded the same\nexprA: " +
        exprA + "\nexprB: " + exprB,
        process(exprA).equals(process(exprB)));
  }

  private String process(String js) {
    return printHelper(js, true);
  }

  private String print(String js) {
    return printHelper(js, false);
  }

  private String printHelper(String js, boolean runProcessor) {
    Compiler compiler = createCompiler();
    CompilerOptions options = getOptions();
    compiler.init(
        ImmutableList.<SourceFile>of(),
        ImmutableList.of(SourceFile.fromCode("testcode", js)),
        options);
    Node root = compiler.parseInputs();
    assertTrue("Unexpected parse error(s): " +
        Joiner.on("\n").join(compiler.getErrors()) +
        "\nEXPR: " + js,
        root != null);
    Node externsRoot = root.getFirstChild();
    Node mainRoot = externsRoot.getNext();
    if (runProcessor) {
      getProcessor(compiler).process(externsRoot, mainRoot);
    }
    return compiler.toSource(mainRoot);
  }
}
