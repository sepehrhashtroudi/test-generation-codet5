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

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

import junit.framework.TestCase;

public class DotFormatterTest extends TestCase {
  /**
   * Tests that keys are assigned sequentially.
   */
  

  /**
   * Tests that keys are assigned once per node.
   */
  

  /**
   * Tests the formatting (simple tree).
   */
  

  /**
   * Tests the formatting (3 element tree).
   */
  

  private void test(String expected, Node ast) {
    try {
      assertEquals(expected, DotFormatter.toDot(ast));
    } catch (java.io.IOException e) {
      fail("Tests failed with IOExceptions");
    }
  }
}
