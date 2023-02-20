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

package com.google.javascript.jscomp.parsing;

import com.google.common.collect.Sets;
import com.google.javascript.jscomp.SourceFile;
import com.google.javascript.jscomp.parsing.Config.LanguageMode;
import com.google.javascript.jscomp.testing.TestErrorReporter;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.head.CompilerEnvirons;
import com.google.javascript.rhino.head.Parser;
import com.google.javascript.rhino.head.ast.AstRoot;
import com.google.javascript.rhino.testing.BaseJSTypeTestCase;

/**
 * Tests {@link IRFactory}.
 */
public class IRFactoryTest extends BaseJSTypeTestCase {

  private LanguageMode mode = LanguageMode.ECMASCRIPT3;

  @Override
  protected void setUp() throws Exception {
    super.setUp();
    mode = LanguageMode.ECMASCRIPT3;
  }

public void testScript2403() { }
public void validateTypeAnnotations() { }
  

  

  

  

  

  

  

  

  

  

  

  // The old and new parser produce different results now with labels, and
  // named breaks and continues, so disable these tests.
  

  

  

  

  

  

  

  

  

  

  

  

  

  

   

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  final String INVALID_ASSIGNMENT_TARGET = "invalid assignment target";
  final String INVALID_INCREMENT_TARGET = "invalid increment target";
  final String INVALID_DECREMENT_TARGET = "invalid decrement target";

  final String INVALID_INC_OPERAND = "Invalid increment operand";
  final String INVALID_DEC_OPERAND = "Invalid decrement operand";

  

  private void testNoParseError(String string) {
    testParseError(string, (String)null);
  }

  private void testParseError(String string, String error) {
    testParseError(string, error == null ? null : new String[] { error });
  }

  private void testParseError(String string, String[] errors) {
    Node root = newParse(string, new TestErrorReporter(errors, null));
    assertTrue("unexpected warnings reported",
        errorReporter.hasEncounteredAllWarnings());
    assertTrue("expected error were not reported",
        errorReporter.hasEncounteredAllErrors());
  }

  private void assertMarkerPosition(Node n, int lineno, int charno) {
    int count = 0;
    for (JSDocInfo.Marker marker : n.getJSDocInfo().getMarkers()) {
      assertEquals(lineno, marker.getAnnotation().getStartLine());
      assertEquals(charno, marker.getAnnotation().getPositionOnStartLine());
      count++;
    }
    assertEquals(1, count);
  }

  private void assertNodePosition(int lineno, int charno, Node n) {
    assertEquals("Line number", lineno, n.getLineno());
    assertEquals("Column position", charno, n.getCharno());
  }

  private void assertNodePosition(int lineno, int charno, int length, Node n) {
    assertEquals("Line number", lineno, n.getLineno());
    assertEquals("Column position", charno, n.getCharno());
    assertEquals("Length", length, n.getLength());
  }


  private void testNewParser(String code, String expected) {
    String actual = newParse(code).toStringTree();
    assertEquals(expected, actual);
  }

  private Node newParse(String string) {
    return newParse(string, new TestErrorReporter(null, null));
  }

  private Node newParse(String string, TestErrorReporter errorReporter) {
    CompilerEnvirons environment = new CompilerEnvirons();

    environment.setRecordingComments(true);
    environment.setRecordingLocalJsDocComments(true);

    Parser p = new Parser(environment);
    AstRoot script = p.parse(string, null, 1);

    Config config = ParserRunner.createConfig(true, mode, false);
    Node root = IRFactory.transformTree(
        script, SourceFile.fromCode("FileName.js", string), string, config, errorReporter);

    return root;
  }
}
