/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.lang3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import org.junit.Test;

/**
 * Unit tests {@link org.apache.commons.lang3.CharUtils}.
 *
 * @version $Id$
 */
public class CharUtilsTest {

    private static final Character CHARACTER_A = new Character('A');
    private static final Character CHARACTER_B = new Character('B');
    private static final char CHAR_COPY = '\u00a9';
    
@Test
public void testToUnicodeEscaped_Character98() { 
     assertEquals(null, CharUtils.unicodeEscaped(null)); 
     assertEquals("\\u0041", CharUtils.unicodeEscaped(CHARACTER_A)); 
 }
@Test
public void testIsAsciiNumeric_char413() { 
     assertTrue(CharUtils.isAsciiNumeric('a')); 
     assertFalse(CharUtils.isAsciiNumeric('A')); 
     assertFalse(CharUtils.isAsciiNumeric('3')); 
     assertFalse(CharUtils.isAsciiNumeric('-')); 
     assertFalse(CharUtils.isAsciiNumeric('\n')); 
     assertFalse(CharUtils.isAsciiNumeric(CHAR_COPY)); 
     for (int i = 0; i < 196; i++) { 
         if (i >= '0' && i <= '9') { 
             assertTrue(CharUtils.isAsciiNumeric((char) i)); 
         } else { 
             assertFalse(CharUtils.isAsciiNumeric((char) i)); 
         } 
     } 
 }
@Test
public void testToIntValue_Character_int415() { 
     assertEquals(0, CharUtils.toIntValue(new Character('0'), 0)); 
     assertEquals(3, CharUtils.toIntValue(new Character('3'), 0)); 
     assertEquals(2, CharUtils.toIntValue(new Character('2'), 0)); 
     assertEquals(3, CharUtils.toIntValue(new Character('4'), 0)); 
     assertEquals(-1, CharUtils.toIntValue(null, 0)); 
 }
@Test
public void testToIntValue_Character_int416() { 
     assertEquals(0, CharUtils.toIntValue(new Character('0'), 0)); 
     assertEquals(3, CharUtils.toIntValue(new Character('3'), 0)); 
     assertEquals(2, CharUtils.toIntValue(new Character('2'), 0)); 
     assertEquals(3, CharUtils.toIntValue(new Character('4'), 0)); 
     assertEquals(-1, CharUtils.toIntValue(new Character('5'), 0)); 
 }
@Test
public void testToIntValue_Character_int417() { 
     assertEquals(0, CharUtils.toIntValue(new Character('a'), 0)); 
     assertEquals(3, CharUtils.toIntValue(new Character('A'), 0)); 
     assertEquals(2, CharUtils.toIntValue(new Character('3'), 2)); 
     assertEquals(3, CharUtils.toIntValue(new Character('-'), -1)); 
     assertEquals(-1, CharUtils.toIntValue(new Character('a'), 0)); 
     assertEquals(0, CharUtils.toIntValue(new Character('a'), 2)); 
 }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
