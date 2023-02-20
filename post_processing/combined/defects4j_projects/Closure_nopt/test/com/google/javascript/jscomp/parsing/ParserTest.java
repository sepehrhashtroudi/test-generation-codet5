/*
 * Copyright 2007 The Closure Compiler Authors.
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

package com.google.javascript.jscomp.parsing;

import com.google.common.collect.ImmutableList;
import com.google.javascript.jscomp.parsing.Config.LanguageMode;
import com.google.javascript.jscomp.testing.TestErrorReporter;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.head.ScriptRuntime;
import com.google.javascript.rhino.jstype.SimpleSourceFile;
import com.google.javascript.rhino.jstype.StaticSourceFile;
import com.google.javascript.rhino.testing.BaseJSTypeTestCase;

import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

public class ParserTest extends BaseJSTypeTestCase {
  private static final String SUSPICIOUS_COMMENT_WARNING =
      IRFactory.SUSPICIOUS_COMMENT_WARNING;

  private static final String TRAILING_COMMA_MESSAGE =
      ScriptRuntime.getMessage0("msg.extra.trailing.comma");

  private static final String BAD_PROPERTY_MESSAGE =
      ScriptRuntime.getMessage0("msg.bad.prop");

  private static final String MISSING_GT_MESSAGE =
      "Bad type annotation. " +
      com.google.javascript.rhino.ScriptRuntime.getMessage0(
          "msg.jsdoc.missing.gt");

  private static final String MISPLACED_TYPE_ANNOTATION =
      IRFactory.MISPLACED_TYPE_ANNOTATION;

  private Config.LanguageMode mode;
  private boolean isIdeMode = false;

  @Override
  protected void setUp() throws Exception {
    super.setUp();
    mode = LanguageMode.ECMASCRIPT3;
    isIdeMode = false;
  }

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  private void testLinenoCharnoBinop(String binop) {
    Node op = parse("var a = 89 " + binop + " 76").getFirstChild().
        getFirstChild().getFirstChild();

    assertEquals(1, op.getLineno());
    assertEquals(8, op.getCharno());
  }

  

  

  

  

  

  /**
   * Tests that a JSDoc comment in an unexpected place of the code does not
   * propagate to following code due to {@link JSDocInfo} aggregation.
   */
  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  private void assertNodeEquality(Node expected, Node found) {
    String message = expected.checkTreeEquals(found);
    if (message != null) {
      fail(message);
    }
  }

  

  private Node createScript(Node n) {
    Node script = new Node(Token.SCRIPT);
    script.addChildToBack(n);
    return script;
  }

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  /**
   * Verify that the given code has the given parse errors.
   * @return If in IDE mode, returns a partial tree.
   */
  private Node parseError(String string, String... errors) {
    TestErrorReporter testErrorReporter = new TestErrorReporter(errors, null);
    Node script = null;
    try {
      StaticSourceFile file = new SimpleSourceFile("input", false);
      script = ParserRunner.parse(
          file, string, ParserRunner.createConfig(isIdeMode, mode, false),
          testErrorReporter, Logger.getAnonymousLogger()).ast;
    } catch (IOException e) {
      throw new RuntimeException(e);
    }

    // verifying that all warnings were seen
    assertTrue(testErrorReporter.hasEncounteredAllErrors());
    assertTrue(testErrorReporter.hasEncounteredAllWarnings());

    return script;
  }

  private Node parse(String string, String... warnings) {
    TestErrorReporter testErrorReporter = new TestErrorReporter(null, warnings);
    Node script = null;
    try {
      StaticSourceFile file = new SimpleSourceFile("input", false);
      script = ParserRunner.parse(
          file, string, ParserRunner.createConfig(true, mode, false),
          testErrorReporter, Logger.getAnonymousLogger()).ast;
    } catch (IOException e) {
      throw new RuntimeException(e);
    }

    // verifying that all warnings were seen
    assertTrue(testErrorReporter.hasEncounteredAllErrors());
    assertTrue(testErrorReporter.hasEncounteredAllWarnings());

    return script;
  }

  private static class ParserResult {
    private final String code;
    private final Node node;

    private ParserResult(String code, Node node) {
      this.code = code;
      this.node = node;
    }
  }
}
