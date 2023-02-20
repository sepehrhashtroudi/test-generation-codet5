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

import static com.google.javascript.jscomp.parsing.JsDocToken.ANNOTATION;
import static com.google.javascript.jscomp.parsing.JsDocToken.BANG;
import static com.google.javascript.jscomp.parsing.JsDocToken.COLON;
import static com.google.javascript.jscomp.parsing.JsDocToken.COMMA;
import static com.google.javascript.jscomp.parsing.JsDocToken.ELLIPSIS;
import static com.google.javascript.jscomp.parsing.JsDocToken.EOC;
import static com.google.javascript.jscomp.parsing.JsDocToken.EOF;
import static com.google.javascript.jscomp.parsing.JsDocToken.EOL;
import static com.google.javascript.jscomp.parsing.JsDocToken.EQUALS;
import static com.google.javascript.jscomp.parsing.JsDocToken.GT;
import static com.google.javascript.jscomp.parsing.JsDocToken.LB;
import static com.google.javascript.jscomp.parsing.JsDocToken.LC;
import static com.google.javascript.jscomp.parsing.JsDocToken.LP;
import static com.google.javascript.jscomp.parsing.JsDocToken.LT;
import static com.google.javascript.jscomp.parsing.JsDocToken.PIPE;
import static com.google.javascript.jscomp.parsing.JsDocToken.QMARK;
import static com.google.javascript.jscomp.parsing.JsDocToken.RB;
import static com.google.javascript.jscomp.parsing.JsDocToken.RC;
import static com.google.javascript.jscomp.parsing.JsDocToken.RP;
import static com.google.javascript.jscomp.parsing.JsDocToken.STAR;
import static com.google.javascript.jscomp.parsing.JsDocToken.STRING;

import com.google.common.collect.ImmutableList;

import junit.framework.TestCase;

import java.util.List;

/**
 * Tests for {@link JsDocTokenStream}.
 */
public class JsDocTokenStreamTest extends TestCase {

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  private void testJSDocTokenStream(String comment, List<JsDocToken> tokens,
      List<String> strings) {
    JsDocTokenStream stream = new JsDocTokenStream(comment, 0);
    int stringsIndex = 0;
    for (JsDocToken token : tokens) {
      JsDocToken readToken = stream.getJsDocToken();

      // token equality
      if (token != readToken) {
        assertEquals(token, readToken);
      }

      // string equality
      if (token == ANNOTATION || token == STRING) {
        assertEquals(strings.get(stringsIndex++), stream.getString());
      }
    }
  }
}
