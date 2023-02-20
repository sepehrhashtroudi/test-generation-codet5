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
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

import org.apache.commons.lang3.SystemUtils;

/**
 * Unit tests for {@link org.apache.commons.lang3.text.StrBuilder}.
 *
 * @version $Id$
 */
public class StrBuilderAppendInsertTest {

    /** The system line separator. */
    private static final String SEP = SystemUtils.LINE_SEPARATOR;

    /** Test subclass of Object, with a toString method. */
    private static final Object FOO = new Object() {
        @Override
        public String toString() {
            return "foo";
        }
    };

    //-----------------------------------------------------------------------
@Test
public void testAppendln_float23() { 
     final StrBuilder sb = new StrBuilder(); 
     sb.appendln(0f); 
     assertEquals("0" + SEP, sb.toString()); 
     sb.clear(); 
     sb.appendln(1f); 
     assertEquals("01" + SEP, sb.toString()); 
     sb.clear(); 
     sb.appendln(2.3f); 
     assertEquals("012.3" + SEP, sb.toString()); 
 }
@Test
public void testAppendln_String_Objectarray72() { 
     final int[] count = new int[2]; 
     final StrBuilder sb = new StrBuilder() { 
  
         @Override 
         public StrBuilder append(final String str, final int startIndex, final int length) { 
             count[0]++; 
             return super.append(str, startIndex, length); 
         } 
  
         @Override 
         public StrBuilder appendNewLine() { 
             count[1]++; 
             return super.appendNewLine(); 
         } 
     }; 
     sb.appendln("foo", 0, 3); 
     assertEquals("foo" + SEP, sb.toString()); 
     assertEquals(1, count[0]); 
     assertEquals(1, count[1]); 
 }
@Test
public void testGetSetNullText90() { 
     final StrBuilder sb = new StrBuilder(); 
     assertEquals(null, sb.getNullText()); 
     sb.setNullText("null"); 
     assertEquals("null", sb.getNullText()); 
     sb.setNullText(""); 
     assertEquals(null, sb.getNullText()); 
     sb.setNullText("NULL"); 
     assertEquals("NULL", sb.getNullText()); 
     sb.setNullText((String) null); 
     assertEquals(null, sb.getNullText()); 
 }
@Test
public void testAppendln_long211() { 
     final int[] count = new int[2]; 
     final StrBuilder sb = new StrBuilder() { 
  
         @Override 
         public StrBuilder append(final long value) { 
             count[0]++; 
             return super.append(value); 
         } 
  
         @Override 
         public StrBuilder appendNewLine() { 
             count[1]++; 
             return super.appendNewLine(); 
         } 
     }; 
     sb.appendln(123L); 
     assertEquals("123" + SEP, sb.toString()); 
     assertEquals(1, count[0]); 
     assertEquals(1, count[1]); 
 }
@Test
public void testAppendln_double212() { 
     final StrBuilder sb = new StrBuilder(); 
     sb.appendln(0d); 
     assertEquals("0" + SEP, sb.toString()); 
     sb.clear(); 
     sb.appendln(1d); 
     assertEquals("01" + SEP, sb.toString()); 
     sb.clear(); 
     sb.appendln(2.3d); 
     assertEquals("012.3" + SEP, sb.toString()); 
 }
@Test
public void testAppendln_int213() { 
     final int[] count = new int[2]; 
     final StrBuilder sb = new StrBuilder() { 
  
         @Override 
         public StrBuilder append(final int value) { 
             count[0]++; 
             return super.append(value); 
         } 
  
         @Override 
         public StrBuilder appendNewLine() { 
             count[1]++; 
             return super.appendNewLine(); 
         } 
     }; 
     sb.appendln(count[0]); 
     assertEquals("" + SEP, sb.toString()); 
     assertEquals(1, count[0]); 
     assertEquals(1, count[1]); 
 }
@Test
public void testAppendln_int214() { 
     final StrBuilder sb = new StrBuilder(); 
     sb.appendln(1); 
     assertEquals("1" + SEP, sb.toString()); 
     sb.clear(); 
     sb.appendln(0); 
     assertEquals("0" + SEP, sb.toString()); 
     sb.clear(); 
     sb.appendln(1); 
     assertEquals("01" + SEP, sb.toString()); 
     sb.clear(); 
     sb.appendln(2); 
     assertEquals("012" + SEP, sb.toString()); 
     sb.clear(); 
     sb.appendln(3); 
     assertEquals("012", sb.toString()); 
     sb.clear(); 
     sb.appendln(4); 
     assertEquals("012", sb.toString()); 
     sb.clear(); 
     sb.appendln(5); 
     assertEquals("012", sb.toString()); 
 }
@Test
public void testAppendln_long215() { 
     final int[] count = new int[2]; 
     final StrBuilder sb = new StrBuilder() { 
  
         @Override 
         public StrBuilder append(final long l) { 
             count[0]++; 
             return super.append(l); 
         } 
  
         @Override 
         public StrBuilder appendNewLine() { 
             count[1]++; 
             return super.appendNewLine(); 
         } 
     }; 
     sb.appendln(123L); 
     assertEquals("123" + SEP, sb.toString()); 
     assertEquals(1, count[0]); 
     assertEquals(1, count[1]); 
 }
@Test
public void testAppendWithSeparators_Iterator377() { 
     final StrBuilder sb = new StrBuilder(); 
     sb.appendWithSeparators((Iterator<?>) null, ","); 
     assertEquals("", sb.toString()); 
     sb.clear(); 
     sb.appendWithSeparators(Collections.EMPTY_LIST.iterator(), ","); 
     assertEquals("", sb.toString()); 
     sb.clear(); 
     sb.appendWithSeparators(Arrays.asList(new Object[] { "foo", "bar", "baz" }).iterator(), ","); 
     assertEquals("foo,bar,baz", sb.toString()); 
     sb.clear(); 
     sb.appendWithSeparators(Arrays.asList(new Object[] { "foo", "bar", "baz" }).iterator(), null); 
     assertEquals("foobarbaz", sb.toString()); 
     sb.clear(); 
     sb.appendWithSeparators(Arrays.asList(new Object[] { "foo", null, "baz" }).iterator(), ","); 
     assertEquals("foo,,baz", sb.toString()); 
 }
@Test
public void testAppendWithNullText418() { 
     final StrBuilder sb = new StrBuilder(); 
     sb.setNullText("NULL"); 
     assertEquals("", sb.toString()); 
     sb.appendNull(); 
     assertEquals("NULL", sb.toString()); 
     sb.append((Object) null); 
     assertEquals("NULLNULL", sb.toString()); 
     sb.append(FOO); 
     assertEquals("NULLNULLfoo", sb.toString()); 
     sb.append((String) null); 
     assertEquals("NULLNULLfooNULL", sb.toString()); 
     sb.append(""); 
     assertEquals("NULLNULLfooNULL", sb.toString()); 
     sb.append("bar"); 
     assertEquals("NULLNULLfooNULLbar", sb.toString()); 
     sb.append((StringBuffer) null); 
     assertEquals("NULLNULLfooNULLbarNULL", sb.toString()); 
     sb.append(new StringBuffer("baz")); 
     assertEquals("NULLNULLfooNULLbarNULLbaz", sb.toString()); 
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
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    // See: http://issues.apache.org/jira/browse/LANG-299
    

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
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    
}
