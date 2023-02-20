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

package com.google.javascript.jscomp;

import com.google.javascript.jscomp.BasicErrorManager.ErrorWithLevel;
import com.google.javascript.jscomp.BasicErrorManager.LeveledJSErrorComparator;
import com.google.javascript.jscomp.CheckLevel;

import junit.framework.TestCase;

/**
 * Tests {@link BasicErrorManager}.
 *
 */
public class BasicErrorManagerTest extends TestCase {
  private static final String NULL_SOURCE = null;

  private LeveledJSErrorComparator comparator = new LeveledJSErrorComparator();

  static final CheckLevel E = CheckLevel.ERROR;

  private static final DiagnosticType FOO_TYPE =
      DiagnosticType.error("TEST_FOO", "Foo");

  private static final DiagnosticType JOO_TYPE =
      DiagnosticType.error("TEST_JOO", "Joo");

  

  

  

  

  

  

  

  

  

  private ErrorWithLevel error(JSError e) {
    return new ErrorWithLevel(e, CheckLevel.ERROR);
  }

  private ErrorWithLevel warning(JSError e) {
    return new ErrorWithLevel(e, CheckLevel.WARNING);
  }

  private void assertSmaller(ErrorWithLevel p1, ErrorWithLevel p2) {
    int p1p2 = comparator.compare(p1, p2);
    assertTrue(Integer.toString(p1p2), p1p2 < 0);
    int p2p1 = comparator.compare(p2, p1);
    assertTrue(Integer.toString(p2p1), p2p1 > 0);
  }
}
