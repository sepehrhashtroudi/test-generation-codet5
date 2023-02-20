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
public void testReplaceImpl241() { StrBuilder builder = new StrBuilder(); builder.setLength(4); builder.append("ab"); builder.append("cd"); builder.append("e"); builder.append("f"); builder.append("g"); builder.append("h"); builder.append("i"); builder.append("j"); builder.append("k"); builder.append("l"); String str = builder.toString(); System.out.println(str); assertEquals("ab", str); assertEquals("cd", str); assertEquals("e", str); assertEquals("f", str); assertEquals("g", str); assertEquals("h", str); }
@Test
public void replaceImpl() { StrBuilder builder = new StrBuilder(); StringBuilder sb = new StringBuilder(); StringBuilder sb1 = new StringBuilder(); sb1.append("Hello"); sb1.append("World"); sb1.append("!"); sb1.append("!"); StringBuilder sb2 = new StringBuilder(); sb2.append("Hello"); sb2.append("World"); sb2.append("!"); sb2.append("!"); sb2.append("!"); sb2.append("!"); StringBuilder sb3 = new StringBuilder(); sb3.append("Hello"); sb3.append("World"); sb3.append("!"); sb3.append("!"); sb3.append("!");
}

@Test
public void deleteImpl() { StringBuilder sb = new StringBuilder(); StringBuilder sb1 = new StringBuilder(); for (int i = 0; i < 10; i++) { sb1.append("a"); } sb1.append("b"); sb1.append("c"); sb1.append("d"); sb1.append("e"); sb1.append("f"); sb1.append("g"); sb1.append("h"); sb1.append("i"); sb1.append("j"); sb1.append("k"); sb1.append("l"); sb1.append("m"); sb1.append("n"); sb1.append("o"); sb1.append("o");
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
