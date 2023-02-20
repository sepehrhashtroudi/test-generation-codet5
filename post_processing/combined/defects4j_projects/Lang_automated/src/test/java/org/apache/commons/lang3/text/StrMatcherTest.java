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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit tests for {@link org.apache.commons.lang3.text.StrMatcher}.
 *
 * @version $Id$
 */
public class StrMatcherTest  {

    private static final char[] BUFFER1 = "0,1\t2 3\n\r\f\u0000'\"".toCharArray();

    private static final char[] BUFFER2 = "abcdef".toCharArray();


    //-----------------------------------------------------------------------
@Test
public void testCharSetMatcher_String509() { 
     final StrMatcher matcher = StrMatcher.charSetMatcher("ace".toCharArray()); 
     assertEquals(1, matcher.isMatch(BUFFER2, 0)); 
     assertEquals(0, matcher.isMatch(BUFFER2, 1)); 
     assertEquals(1, matcher.isMatch(BUFFER2, 2)); 
     assertEquals(0, matcher.isMatch(BUFFER2, 3)); 
     assertEquals(1, matcher.isMatch(BUFFER2, 4)); 
     assertEquals(0, matcher.isMatch(BUFFER2, 5)); 
     assertSame(StrMatcher.noneMatcher(), StrMatcher.charSetMatcher(new char[0])); 
     assertSame(StrMatcher.noneMatcher(), StrMatcher.charSetMatcher((String) null)); 
 }
@Test
public void testCharSetMatcher_charArray510() { 
     final StrMatcher matcher = StrMatcher.charSetMatcher("ace".toCharArray()); 
     assertEquals(1, matcher.isMatch(BUFFER2, 0)); 
     assertEquals(0, matcher.isMatch(BUFFER2, 1)); 
     assertEquals(1, matcher.isMatch(BUFFER2, 2)); 
     assertEquals(0, matcher.isMatch(BUFFER2, 3)); 
     assertEquals(1, matcher.isMatch(BUFFER2, 4)); 
     assertEquals(0, matcher.isMatch(BUFFER2, 5)); 
     assertSame(StrMatcher.noneMatcher(), StrMatcher.charSetMatcher(new char[0])); 
     assertSame(StrMatcher.noneMatcher(), StrMatcher.charSetMatcher((char[]) null)); 
     assertTrue(StrMatcher.charSetMatcher("a".toCharArray()) instanceof StrMatcher.CharMatcher); 
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
    

}
