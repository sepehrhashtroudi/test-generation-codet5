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

import org.junit.After;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.apache.commons.lang3.mutable.MutableObject;

/**
 * Test class for StrSubstitutor.
 *
 * @version $Id$
 */
public class StrSubstitutorTest {

    private Map<String, String> values;

    @Before
    public void setUp() throws Exception {
        values = new HashMap<String, String>();
        values.put("animal", "quick brown fox");
        values.put("target", "lazy dog");
    }

    @After
    public void tearDown() throws Exception {
        values = null;
    }

    //-----------------------------------------------------------------------
    /**
     * Tests simple key replace.
     */
    

    /**
     * Tests simple key replace.
     */
    

    /**
     * Tests replace with no variables.
     */
    

    /**
     * Tests replace with null.
     */
    

    /**
     * Tests replace with null.
     */
    

    /**
     * Tests key replace changing map after initialization (not recommended).
     */
    

    /**
     * Tests unknown key replace.
     */
    

    /**
     * Tests adjacent keys.
     */
    

    /**
     * Tests adjacent keys.
     */
    

    /**
     * Tests simple recursive replace.
     */
    

    /**
     * Tests escaping.
     */
    

    /**
     * Tests escaping.
     */
    

    /**
     * Tests complex escaping.
     */
    

    /**
     * Tests when no prefix or suffix.
     */
    

    /**
     * Tests when no incomplete prefix.
     */
    

    /**
     * Tests when prefix but no suffix.
     */
    

    /**
     * Tests when suffix but no prefix.
     */
    

    /**
     * Tests when no variable name.
     */
    

    /**
     * Tests replace creates output same as input.
     */
    

    /**
     * Tests a cyclic replace operation.
     * The cycle should be detected and cause an exception to be thrown.
     */
    

    /**
     * Tests interpolation with weird boundary patterns.
     */
    

    /**
     * Tests simple key replace.
     */
    

    /**
     * Tests whether a variable can be replaced in a variable name.
     */
    

    /**
     * Tests whether substitution in variable names is disabled per default.
     */
    

    /**
     * Tests complex and recursive substitution in variable names.
     */
    

    //-----------------------------------------------------------------------
    /**
     * Tests protected.
     */
    

    //-----------------------------------------------------------------------
    /**
     * Tests constructor.
     */
    

    /**
     * Tests constructor.
     */
    

    /**
     * Tests constructor.
     */
    

    //-----------------------------------------------------------------------
    /**
     * Tests get set.
     */
    

    /**
     * Tests get set.
     */
    

    /**
     * Tests get set.
     */
    

    //-----------------------------------------------------------------------
    /**
     * Tests static.
     */
    

    /**
     * Tests static.
     */
    

    /**
     * Tests interpolation with system properties.
     */
    

    /**
     * Test the replace of a properties object
     */
    
    
    

    //-----------------------------------------------------------------------
    private void doTestReplace(final String expectedResult, final String replaceTemplate, final boolean substring) {
        final String expectedShortResult = expectedResult.substring(1, expectedResult.length() - 1);
        final StrSubstitutor sub = new StrSubstitutor(values);

        // replace using String
        assertEquals(expectedResult, sub.replace(replaceTemplate));
        if (substring) {
            assertEquals(expectedShortResult, sub.replace(replaceTemplate, 1, replaceTemplate.length() - 2));
        }

        // replace using char[]
        final char[] chars = replaceTemplate.toCharArray();
        assertEquals(expectedResult, sub.replace(chars));
        if (substring) {
            assertEquals(expectedShortResult, sub.replace(chars, 1, chars.length - 2));
        }

        // replace using StringBuffer
        StringBuffer buf = new StringBuffer(replaceTemplate);
        assertEquals(expectedResult, sub.replace(buf));
        if (substring) {
            assertEquals(expectedShortResult, sub.replace(buf, 1, buf.length() - 2));
        }

        // replace using StringBuilder
        StringBuilder builder = new StringBuilder(replaceTemplate);
        assertEquals(expectedResult, sub.replace(builder));
        if (substring) {
            assertEquals(expectedShortResult, sub.replace(builder, 1, builder.length() - 2));
        }
        
        // replace using StrBuilder
        StrBuilder bld = new StrBuilder(replaceTemplate);
        assertEquals(expectedResult, sub.replace(bld));
        if (substring) {
            assertEquals(expectedShortResult, sub.replace(bld, 1, bld.length() - 2));
        }

        // replace using object
        final MutableObject<String> obj = new MutableObject<String>(replaceTemplate);  // toString returns template
        assertEquals(expectedResult, sub.replace(obj));

        // replace in StringBuffer
        buf = new StringBuffer(replaceTemplate);
        assertTrue(sub.replaceIn(buf));
        assertEquals(expectedResult, buf.toString());
        if (substring) {
            buf = new StringBuffer(replaceTemplate);
            assertTrue(sub.replaceIn(buf, 1, buf.length() - 2));
            assertEquals(expectedResult, buf.toString());  // expect full result as remainder is untouched
        }

        // replace in StringBuilder
        builder = new StringBuilder(replaceTemplate);
        assertTrue(sub.replaceIn(builder));
        assertEquals(expectedResult, builder.toString());
        if (substring) {
        	builder = new StringBuilder(replaceTemplate);
            assertTrue(sub.replaceIn(builder, 1, builder.length() - 2));
            assertEquals(expectedResult, builder.toString());  // expect full result as remainder is untouched
        }
        
        // replace in StrBuilder
        bld = new StrBuilder(replaceTemplate);
        assertTrue(sub.replaceIn(bld));
        assertEquals(expectedResult, bld.toString());
        if (substring) {
            bld = new StrBuilder(replaceTemplate);
            assertTrue(sub.replaceIn(bld, 1, bld.length() - 2));
            assertEquals(expectedResult, bld.toString());  // expect full result as remainder is untouched
        }
    }

    private void doTestNoReplace(final String replaceTemplate) {
        final StrSubstitutor sub = new StrSubstitutor(values);

        if (replaceTemplate == null) {
            assertEquals(null, sub.replace((String) null));
            assertEquals(null, sub.replace((String) null, 0, 100));
            assertEquals(null, sub.replace((char[]) null));
            assertEquals(null, sub.replace((char[]) null, 0, 100));
            assertEquals(null, sub.replace((StringBuffer) null));
            assertEquals(null, sub.replace((StringBuffer) null, 0, 100));
            assertEquals(null, sub.replace((StrBuilder) null));
            assertEquals(null, sub.replace((StrBuilder) null, 0, 100));
            assertEquals(null, sub.replace((Object) null));
            assertFalse(sub.replaceIn((StringBuffer) null));
            assertFalse(sub.replaceIn((StringBuffer) null, 0, 100));
            assertFalse(sub.replaceIn((StrBuilder) null));
            assertFalse(sub.replaceIn((StrBuilder) null, 0, 100));
        } else {
            assertEquals(replaceTemplate, sub.replace(replaceTemplate));
            final StrBuilder bld = new StrBuilder(replaceTemplate);
            assertFalse(sub.replaceIn(bld));
            assertEquals(replaceTemplate, bld.toString());
        }
    }

}
