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

import com.google.common.base.Charsets;
import com.google.common.collect.ImmutableMap;

import junit.framework.TestCase;

import java.text.ParseException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Tests for {@link VariableMap}.
 *
 */
public class VariableMapTest extends TestCase {

  

  

  public void assertMapsEquals(
      Map<String, String> expected, Map<String, String> result) {
    assertEquals(expected.size(), result.size());
    for (String key : expected.keySet()) {
      assertEquals(expected.get(key), result.get(key));
    }
  }

  

  

  

  

  

  private void assertEqual(byte[] bytes1, byte[] bytes2) {
    if (bytes1 != bytes2) {
      assertEquals("length differs.", bytes1.length, bytes2.length);
      for (int i = 0; i < bytes1.length; i++) {
        assertEquals("byte " + i + "differs.", bytes1[i], bytes2[i]);
      }
    }
  }
}
