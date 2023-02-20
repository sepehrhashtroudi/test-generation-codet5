/*
 * Copyright 2011 The Closure Compiler Authors.
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

package com.google.javascript.jscomp.regex;

import java.util.BitSet;
import java.util.Random;

import com.google.javascript.jscomp.regex.CharRanges;

import junit.framework.TestCase;

public class CharRangesTest extends TestCase {

  static final long SEED = Long.parseLong(System.getProperty(
      "junit.random.seed", "" + System.currentTimeMillis()));

public void containsAll() { CharRanges one = CharRanges.withMembers(0, 1); CharRanges two = CharRanges.withMembers(2, 3); CharRanges three = CharRanges.withMembers(3, 4); CharRanges four = CharRanges.withMembers(4, 5); assertTrue(one.containsAll(two)); assertTrue(two.containsAll(one)); assertTrue(one.containsAll(two)); assertFalse(one.containsAll(three)); assertFalse(one.containsAll(four)); }
public void containsAll() { CharRanges one = CharRanges.withMembers(0, 1); CharRanges two = CharRanges.withMembers(2, 3); CharRanges three = CharRanges.withMembers(3, 4); CharRanges four = CharRanges.withMembers(4, 5); assertTrue(one.containsAll(two)); assertTrue(two.containsAll(one)); assertTrue(one.containsAll(two)); assertTrue(two.containsAll(three)); assertTrue(three.containsAll(four)); }
public void testEquals1640() { CharRanges r1 = CharRanges.withMembers(3,7); CharRanges r2 = CharRanges.withMembers(3,7); assertTrue(r1.equals(r2)); assertTrue(r2.equals(r1)); }
public void containsAll() { CharRanges one = CharRanges.withMembers(0, 1); CharRanges two = CharRanges.withMembers(2, 3); CharRanges three = CharRanges.withMembers(3, 4); assertTrue(one.containsAll(two)); assertTrue(two.containsAll(one)); assertTrue(one.containsAll(two)); assertFalse(one.containsAll(three)); }
public void containsAll() { CharRanges one=CharRanges.withMembers(0, 1); CharRanges two=CharRanges.withMembers(2, 3); CharRanges three=CharRanges.withMembers(3, 4); CharRanges four=CharRanges.withMembers(4, 5); CharRanges five=CharRanges.withMembers(5, 6); assertTrue(one.containsAll(one)); assertTrue(one.containsAll(two)); assertTrue(one.containsAll(three)); assertFalse(one.containsAll(four)); assertFalse(one.containsAll(five)); }
public void equals() { CharRanges r1 = CharRanges.withMembers(1,2); CharRanges r2 = CharRanges.withMembers(1,2); assertTrue(r1.equals(r2)); assertTrue(r2.equals(r1)); }
public void containsAll() { CharRanges one=CharRanges.withMembers(0, 1); CharRanges two=CharRanges.withMembers(2, 3); CharRanges three=CharRanges.withMembers(3, 4); CharRanges four=CharRanges.withMembers(4, 5); CharRanges five=CharRanges.withMembers(5, 6); assertTrue(one.containsAll(two)); assertTrue(two.containsAll(three)); assertTrue(three.containsAll(four)); assertTrue(four.containsAll(five)); }
public void containsAll() { CharRanges one=CharRanges.withMembers(0, 1); CharRanges two=CharRanges.withMembers(2, 3); CharRanges three=CharRanges.withMembers(3, 4); CharRanges four=CharRanges.withMembers(4, 5); assertTrue(one.containsAll(two)); assertTrue(two.containsAll(three)); assertFalse(one.containsAll(four)); }
public void containsAll() { CharRanges one=CharRanges.withMembers(0, 1); CharRanges two=CharRanges.withMembers(2, 3); CharRanges three=CharRanges.withMembers(3, 4); assertTrue(one.containsAll(two)); assertTrue(two.containsAll(one)); assertTrue(one.containsAll(two)); assertFalse(one.containsAll(three)); }
public void testEquals1643() { CharRanges r1 = CharRanges.withMembers(3,7); CharRanges r2 = CharRanges.withMembers(3,7); assertTrue(r1.equals(r2)); }
public void toStringTest() { CharRanges r = CharRanges.withMembers(0, 1); assertEquals("0x0", r.toString()); assertEquals("0x1", r.toString()); assertEquals("0x2", r.toString()); assertEquals("0x3", r.toString()); assertEquals("0x4", r.toString()); assertEquals("0x5", r.toString()); assertEquals("0x6", r.toString()); assertEquals("0x7", r.toString()); assertEquals("0x8", r.toString()); assertEquals("0x9", r.toString()); assertEquals("0x10", r.toString()); }
public void testLine1645() { int[] lines = new int[8]; for (int i = 0; i < lines.length; i++) { lines[i] = i; } CharRanges ranges = CharRanges.withRanges(8, 8); assertEquals(8, ranges.start(0)); assertEquals(8, ranges.end(0)); assertEquals("", ranges.toString()); }
public void testLine1646() { CharRanges r1 = CharRanges.withRanges(0,10); assertEquals(0, r1.start(0)); assertEquals(10, r1.end(0)); assertEquals("", r1.toString()); }
  

  

  

  

  

  

  
}
