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

package com.google.javascript.jscomp.deps;

import com.google.common.collect.Lists;
import com.google.javascript.jscomp.ErrorManager;
import com.google.javascript.jscomp.PrintStreamErrorManager;
import com.google.javascript.jscomp.deps.JsFunctionParser.SymbolInfo;

import junit.framework.TestCase;

import java.util.Collection;
import java.util.Iterator;

/**
 * Tests for {@link JsFunctionParser}
 *
 * @author agrieve@google.com (Andrew Grieve)
 * @author ielashi@google.com (Islam El-Ashi)
 */
public class JsFunctionParserTest extends TestCase {
  private static final String SRC_PATH = "a";
  private JsFunctionParser parser;
  private ErrorManager errorManager;
  private Collection<String> functions = Lists.newArrayList(
      "goog.require", "goog.provide");

  @Override
  public void setUp() {
    errorManager = new PrintStreamErrorManager(System.err);
    parser = new JsFunctionParser(functions, errorManager);
    parser.setShortcutMode(true);
  }

  /**
   * Tests:
   *  -Parsing of comments,
   *  -Parsing of different styles of quotes,
   *  -Correct recording of what was parsed.
   */
  

  

  

  

  
}
