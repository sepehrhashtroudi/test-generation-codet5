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

package org.apache.commons.lang3.text;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.Reader;
import java.io.Writer;
import java.util.Arrays;

import org.apache.commons.lang3.ArrayUtils;

/**
 * Unit tests for {@link org.apache.commons.lang3.text.StrBuilder}.
 * 
 * @version $Id$
 */
public class StrBuilderTest {

    //-----------------------------------------------------------------------
@Test
public void testReplaceAll_char_char13() { 
     StrBuilder sb = new StrBuilder("abcbccba"); 
     sb.replaceAll('x', 'y'); 
     assertEquals("abcbccba", sb.toString()); 
     sb.replaceAll('a', 'd'); 
     assertEquals("dbcbccba", sb.toString()); 
     sb.replaceAll('b', 'e'); 
     assertEquals("decbccba", sb.toString()); 
     sb.replaceAll('c', 'f'); 
     assertEquals("defbccba", sb.toString()); 
     sb.replaceAll('d', 'd'); 
     assertEquals("defbccba", sb.toString()); 
 }
@Test
public void testLeftString16() { 
     final StrBuilder sb = new StrBuilder("left right"); 
     assertEquals("left right", sb.leftString(5)); 
     assertEquals("", sb.leftString(0)); 
     assertEquals("", sb.leftString(-5)); 
     assertEquals("left right", sb.leftString(15)); 
 }
@Test
public void testReplaceFirst_char_char17() { 
     final StrBuilder sb = new StrBuilder("abcbccba"); 
     sb.replaceFirst('x', 'y'); 
     assertEquals("abcbccba", sb.toString()); 
     sb.replaceFirst('a', 'd'); 
     assertEquals("dbcbccba", sb.toString()); 
     sb.replaceFirst('b', 'e'); 
     assertEquals("decbccba", sb.toString()); 
     sb.replaceFirst('c', 'f'); 
     assertEquals("defbccba", sb.toString()); 
     sb.replaceFirst('d', 'd'); 
     assertEquals("defbccba", sb.toString()); 
 }
@Test
public void testLastIndexOf_String28() { 
     final StrBuilder sb = new StrBuilder("abab"); 
     assertEquals(2, sb.lastIndexOf("a")); 
     assertEquals("abab".lastIndexOf("a"), sb.lastIndexOf("a")); 
     assertEquals(2, sb.lastIndexOf("ab")); 
     assertEquals("abab".lastIndexOf("ab"), sb.lastIndexOf("ab")); 
     assertEquals(3, sb.lastIndexOf("b")); 
     assertEquals("abab".lastIndexOf("b"), sb.lastIndexOf("b")); 
     assertEquals(1, sb.lastIndexOf("ba")); 
     assertEquals("abab".lastIndexOf("ba"), sb.lastIndexOf("ba")); 
     assertEquals(-1, sb.lastIndexOf("z")); 
     assertEquals(-1, sb.lastIndexOf((String) null)); 
 }
@Test
public void testMidString59() { 
     final StrBuilder sb = new StrBuilder("hello goodbye"); 
     assertEquals("hello", sb.midString(0, 5)); 
     assertEquals("hello goodbye".indexOf("goodbye"), sb.midString(0, 6)); 
     assertEquals("goodbye", sb.midString(6, 13)); 
     assertEquals("hello goodbye".indexOf("goodbye"), sb.midString(6, 13)); 
     assertEquals("goodbye", sb.midString(6, 20)); 
     assertEquals("hello goodbye".indexOf("goodbye"), sb.midString(6, 20)); 
     assertEquals("goodbye", sb.midString(6, 20)); 
     assertEquals("hello goodbye".indexOf("goodbye"), sb.midString(6, 20)); 
     assertEquals("goodbye", sb.midString(6, 20)); 
     assertEquals("hello goodbye".indexOf("goodbye"), sb.midString(6, 20)); 
 }
@Test
public void testReplaceAll_String_String63() { 
     StrBuilder sb = new StrBuilder("abcbccba"); 
     sb.replaceAll((String) null, null); 
     assertEquals("abcbccba", sb.toString()); 
     sb.replaceAll((String) null, "anything"); 
     assertEquals("abcbccba", sb.toString()); 
     sb.replaceAll("", null); 
     assertEquals("abcbccba", sb.toString()); 
     sb.replaceAll("", "anything"); 
     assertEquals("abcbccba", sb.toString()); 
     sb.replaceAll("x", "y"); 
     assertEquals("abcbccba", sb.toString()); 
     sb.replaceAll("a", "d"); 
     assertEquals("dbcbccbd", sb.toString()); 
     sb.replaceAll("d", null); 
     assertEquals("bcbccb", sb.toString()); 
     sb.replaceAll("cb", "-"); 
     assertEquals("b-c-", sb.toString()); 
     sb = new StrBuilder("abcba"); 
     sb.replaceAll("b", "xbx"); 
     assertEquals("axbxcxbxa", sb.toString()); 
     sb = new StrBuilder("bb"); 
     sb.replaceAll("b", "xbx"); 
     assertEquals("xbxxbx", sb.toString()); 
 }
@Test
public void testDeleteIntInt179() { 
     StrBuilder sb = new StrBuilder("abc"); 
     sb.delete(0, 1); 
     assertEquals("bc", sb.toString()); 
     sb.delete(1, 2); 
     assertEquals("b", sb.toString()); 
     sb.delete(0, 1); 
     assertEquals("", sb.toString()); 
     sb.delete(0, 1000); 
     assertEquals("", sb.toString()); 
     try { 
         sb.delete(1, 2); 
         fail("Expected IndexOutOfBoundsException"); 
     } catch (final IndexOutOfBoundsException e) { 
     } 
     try { 
         sb.delete(-1, 1); 
         fail("Expected IndexOutOfBoundsException"); 
     } catch (final IndexOutOfBoundsException e) { 
     } 
     sb = new StrBuilder("anything"); 
     try { 
         sb.delete(2, 1); 
         fail("Expected IndexOutOfBoundsException"); 
     } catch (final IndexOutOfBoundsException e) { 
     } 
 }
@Test
public void testReplaceAll_StrMatcher_String185() { 
     StrBuilder sb = new StrBuilder("abcbccba"); 
     sb.replaceAll((StrMatcher) null, null); 
     assertEquals("abcbccba", sb.toString()); 
     sb.replaceAll((StrMatcher) null, "anything"); 
     assertEquals("abcbccba", sb.toString()); 
     sb.replaceAll("", null); 
     assertEquals("abcbccba", sb.toString()); 
     sb.replaceAll("", "anything"); 
     assertEquals("abcbccba", sb.toString()); 
     sb.replaceAll("x", "y"); 
     assertEquals("abcbccba", sb.toString()); 
     sb.replaceAll("a", "d"); 
     assertEquals("dbcbccbd", sb.toString()); 
     sb.replaceAll("d", null); 
     assertEquals("bcbccb", sb.toString()); 
     sb.replaceAll("cb", "-"); 
     assertEquals("b-c-", sb.toString()); 
     sb = new StrBuilder("abcba"); 
     sb.replaceAll("b", "xbx"); 
     assertEquals("axbxcxbxa", sb.toString()); 
     sb = new StrBuilder("bb"); 
     sb.replaceAll("b", "xbx"); 
     assertEquals("xbxxbx", sb.toString()); 
 }
@Test
public void testLeftString198() { 
     final StrBuilder sb = new StrBuilder(); 
     assertEquals("", sb.leftString(5)); 
     assertEquals("", sb.leftString(0)); 
     assertEquals("", sb.leftString(-5)); 
     assertEquals("", sb.leftString(15)); 
 }
@Test
public void testLeftString199() { 
     final StrBuilder sb = new StrBuilder("left right"); 
     assertEquals("right", sb.leftString(5)); 
     assertEquals("", sb.leftString(0)); 
     assertEquals("", sb.leftString(-5)); 
     assertEquals("left right", sb.leftString(15)); 
 }
@Test
public void testIndexOfLang294354() { 
     final StrBuilder sb = new StrBuilder("onetwothree"); 
     sb.deleteAll("three"); 
     assertEquals(-1, sb.indexOf("three")); 
 }
@Test
public void testCapacityAndLength385() { 
     final StrBuilder sb = new StrBuilder(); 
     assertEquals(32, sb.capacity()); 
     assertEquals(0, sb.length()); 
     assertEquals(0, sb.size()); 
     assertTrue(sb.isEmpty()); 
     sb.minimizeCapacity(); 
     assertEquals(0, sb.capacity()); 
     assertEquals(0, sb.length()); 
     assertEquals(0, sb.size()); 
     assertTrue(sb.isEmpty()); 
     sb.ensureCapacity(32); 
     assertTrue(sb.capacity() >= 32); 
     assertEquals(0, sb.length()); 
     assertEquals(0, sb.size()); 
     assertTrue(sb.isEmpty()); 
     sb.append("foo"); 
     assertTrue(sb.capacity() >= 32); 
     assertEquals(3, sb.length()); 
     assertEquals(3, sb.size()); 
     assertTrue(sb.isEmpty() == false); 
     sb.clear(); 
     assertTrue(sb.capacity() >= 32); 
     assertEquals(0, sb.length()); 
     assertEquals(0, sb.size()); 
     assertTrue(sb.isEmpty()); 
     sb.append("123456789012345678901234567890123"); 
     assertTrue(sb.capacity() > 32); 
     assertEquals(33, sb.length()); 
     assertEquals(33, sb.size()); 
     assertTrue(sb.isEmpty() == false); 
     sb.ensureCapacity(16); 
     assertTrue(sb.capacity() > 16); 
     assertEquals(33, sb.length()); 
     assertEquals(33, sb.size()); 
     assertTrue(sb.isEmpty() == false); 
     sb.minimizeCapacity(); 
     assertEquals(33, sb.capacity()); 
     assertEquals(33, sb.length());
}

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    // -----------------------------------------------------------------------
    

    

    // -----------------------------------------------------------------------
    

    

    // -----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    

    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    
    
    

    // -----------------------------------------------------------------------
    

    

    

    // -----------------------------------------------------------------------
    

    

    

    // -----------------------------------------------------------------------
    

    

    

    

    // -----------------------------------------------------------------------
    

    

    

    

    // -----------------------------------------------------------------------
    

    

    

    

    static final StrMatcher A_NUMBER_MATCHER = new StrMatcher() {
        @Override
        public int isMatch(final char[] buffer, int pos, final int bufferStart, final int bufferEnd) {
            if (buffer[pos] == 'A') {
                pos++;
                if (pos < bufferEnd && buffer[pos] >= '0' && buffer[pos] <= '9') {
                    return 2;
                }
            }
            return 0;
        }
    };

    //-----------------------------------------------------------------------
    

    // -----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    

}
