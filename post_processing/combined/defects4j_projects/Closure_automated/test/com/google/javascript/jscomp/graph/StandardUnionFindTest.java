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

package com.google.javascript.jscomp.graph;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.ImmutableSet;

import junit.framework.Assert;
import junit.framework.TestCase;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/**
 * Unit test for the {@link StandardUnionFind} data structure.
 *
 */
public class StandardUnionFindTest extends TestCase {
  private StandardUnionFind<String> union;

  @Override protected void setUp() {
    union = new StandardUnionFind<String>();
  }

  

  

  

  

  

  

  

  

  

  

  

  

  

  /**
   * Asserts that {@code actual} contains precisely the elements
   * {@code expected}, in any order.  Both collections may contain
   * duplicates, and this method will only pass if the quantities are
   * exactly the same.
   */
  private static void assertContentsAnyOrder(
      String message, Iterable<?> actual, Object... expected) {
    Assert.assertEquals(message,
        HashMultiset.create(Arrays.asList(expected)),
        HashMultiset.create(actual));
  }

  /**
   * Variant of {@link #assertContentsAnyOrder(String,Iterable,Object...)}
   * using a generic message.
   */
  private static void assertContentsAnyOrder(
      Iterable<?> actual, Object... expected) {
    assertContentsAnyOrder((String) null, actual, expected);
  }
}
