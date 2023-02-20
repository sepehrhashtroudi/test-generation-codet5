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
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

import org.junit.Test;

/**
 * Unit tests {@link org.apache.commons.lang3.StringUtils} - Substring methods
 *
 * @version $Id$
 */
public class StringUtilsSubstringTest  {
    private static final String FOO = "foo";
    private static final String BAR = "bar";
    private static final String BAZ = "baz";
    private static final String FOOBAR = "foobar";
    private static final String SENTENCE = "foo bar baz";

    //-----------------------------------------------------------------------

@Test
public void testCountMatches83() { 
     assertEquals(0, StringUtils.countMatches(null, null)); 
     assertEquals(0, StringUtils.countMatches(null, "")); 
     assertEquals(0, StringUtils.countMatches(null, "a")); 
     assertEquals(0, StringUtils.countMatches("", null)); 
     assertEquals(0, StringUtils.countMatches("", "")); 
     assertEquals(0, StringUtils.countMatches("", "a")); 
     assertEquals(0, StringUtils.countMatches("hello", null)); 
     assertEquals(0, StringUtils.countMatches("hello", "a")); 
     assertEquals(1, StringUtils.countMatches("hello", "b")); 
     assertEquals(1, StringUtils.countMatches("hello", "c")); 
     assertEquals(3, StringUtils.countMatches("hello", "abc")); 
     assertEquals(4, StringUtils.countMatches("hello", "ab")); 
     assertEquals(4, StringUtils.countMatches("hello", "abc")); 
     assertEquals(-1, StringUtils.countMatches("hello", "z")); 
 }
@Test
public void testCountMatches_StringString407() { 
     assertEquals(0, StringUtils.countMatches(null, null)); 
     assertEquals(0, StringUtils.countMatches(null, "")); 
     assertEquals(0, StringUtils.countMatches(null, "a")); 
     assertEquals(0, StringUtils.countMatches("", null)); 
     assertEquals(0, StringUtils.countMatches("", "")); 
     assertEquals(0, StringUtils.countMatches("", "a")); 
     assertEquals(0, StringUtils.countMatches("zzabyycdxx", null)); 
     assertEquals(0, StringUtils.countMatches("zzabyycdxx", "")); 
     assertEquals(3, StringUtils.countMatches("zzabyycdxx", "a")); 
     assertEquals(3, StringUtils.countMatches("zzabyycdxx", "b")); 
     assertEquals(0, StringUtils.countMatches("ab", "z")); 
 }
@Test
public void testCountMatches_StringString408() { 
     assertEquals(0, StringUtils.countMatches(null, null)); 
     assertEquals(0, StringUtils.countMatches(null, "")); 
     assertEquals(0, StringUtils.countMatches(null, "a")); 
     assertEquals(0, StringUtils.countMatches("", null)); 
     assertEquals(0, StringUtils.countMatches("", "")); 
     assertEquals(0, StringUtils.countMatches("", "a")); 
     assertEquals(0, StringUtils.countMatches("hello", null)); 
     assertEquals(0, StringUtils.countMatches("hello", "a")); 
     assertEquals(1, StringUtils.countMatches("hello", "b")); 
     assertEquals(1, StringUtils.countMatches("hello", "c")); 
     assertEquals(3, StringUtils.countMatches("hello", "abc")); 
     assertEquals(4, StringUtils.countMatches("hello", "ab")); 
     assertEquals(4, StringUtils.countMatches("hello", "abc")); 
     assertEquals(-1, StringUtils.countMatches("hello", "z")); 
 }
    
    
    
           
    
    
    
    
    
    
    //-----------------------------------------------------------------------
    
    
    

    
    
            
        
    //-----------------------------------------------------------------------
    
            
    

   /**
     * Tests the substringsBetween method that returns an String Array of substrings.
     */
    

    //-----------------------------------------------------------------------
    

}
