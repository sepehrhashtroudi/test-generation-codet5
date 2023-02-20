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
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.StringWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.text.translate.CharSequenceTranslator;
import org.apache.commons.lang3.text.translate.NumericEntityEscaper;
import org.junit.Test;

/**
 * Unit tests for {@link StringEscapeUtils}.
 *
 * @version $Id$
 */
public class StringEscapeUtilsTest {
    private final static String FOO = "foo";

    
    
    

    /**
     * Tests https://issues.apache.org/jira/browse/LANG-421
     */
    
    
    private void assertEscapeJava(final String escaped, final String original) throws IOException {
        assertEscapeJava(null, escaped, original);
    }

    private void assertEscapeJava(String message, final String expected, final String original) throws IOException {
        final String converted = StringEscapeUtils.escapeJava(original);
        message = "escapeJava(String) failed" + (message == null ? "" : (": " + message));
        assertEquals(message, expected, converted);

        final StringWriter writer = new StringWriter();
        StringEscapeUtils.ESCAPE_JAVA.translate(original, writer);
        assertEquals(expected, writer.toString());
    }

    

    private void assertUnescapeJava(final String unescaped, final String original) throws IOException {
        assertUnescapeJava(null, unescaped, original);
    }

    private void assertUnescapeJava(final String message, final String unescaped, final String original) throws IOException {
        final String expected = unescaped;
        final String actual = StringEscapeUtils.unescapeJava(original);

        assertEquals("unescape(String) failed" +
                (message == null ? "" : (": " + message)) +
                ": expected '" + StringEscapeUtils.escapeJava(expected) +
                // we escape this so we can see it in the error message
                "' actual '" + StringEscapeUtils.escapeJava(actual) + "'",
                expected, actual);

        final StringWriter writer = new StringWriter();
        StringEscapeUtils.UNESCAPE_JAVA.translate(original, writer);
        assertEquals(unescaped, writer.toString());

    }

    


    // HTML and XML
    //--------------------------------------------------------------

    private static final String[][] HTML_ESCAPES = {
        {"no escaping", "plain text", "plain text"},
        {"no escaping", "plain text", "plain text"},
        {"empty string", "", ""},
        {"null", null, null},
        {"ampersand", "bread &amp; butter", "bread & butter"},
        {"quotes", "&quot;bread&quot; &amp; butter", "\"bread\" & butter"},
        {"final character only", "greater than &gt;", "greater than >"},
        {"first character only", "&lt; less than", "< less than"},
        {"apostrophe", "Huntington's chorea", "Huntington's chorea"},
        {"languages", "English,Fran&ccedil;ais,\u65E5\u672C\u8A9E (nihongo)", "English,Fran\u00E7ais,\u65E5\u672C\u8A9E (nihongo)"},
        {"8-bit ascii shouldn't number-escape", "\u0080\u009F", "\u0080\u009F"},
    };

    

    

    

    

    

    

    /**
     * Tests Supplementary characters. 
     * <p>
     * From http://www.w3.org/International/questions/qa-escapes
     * </p>
     * <blockquote>
     * Supplementary characters are those Unicode characters that have code points higher than the characters in
     * the Basic Multilingual Plane (BMP). In UTF-16 a supplementary character is encoded using two 16-bit surrogate code points from the
     * BMP. Because of this, some people think that supplementary characters need to be represented using two escapes, but this is incorrect
     * - you must use the single, code point value for that character. For example, use &#x233B4; rather than &#xD84C;&#xDFB4;.
     * </blockquote>
     * @see <a href="http://www.w3.org/International/questions/qa-escapes">Using character escapes in markup and CSS</a>
     * @see <a href="https://issues.apache.org/jira/browse/LANG-728">LANG-728</a>
     */
    
    
    
    
    /**
     * Reverse of the above.
     *
     * @see <a href="https://issues.apache.org/jira/browse/LANG-729">LANG-729</a>
     */
    
        
    // Tests issue #38569
    // http://issues.apache.org/bugzilla/show_bug.cgi?id=38569
    

    

    

    

    private void checkCsvEscapeWriter(final String expected, final String value) {
        try {
            final StringWriter writer = new StringWriter();
            StringEscapeUtils.ESCAPE_CSV.translate(value, writer);
            assertEquals(expected, writer.toString());
        } catch (final IOException e) {
            fail("Threw: " + e);
        }
    }

    

    

    private void checkCsvUnescapeWriter(final String expected, final String value) {
        try {
            final StringWriter writer = new StringWriter();
            StringEscapeUtils.UNESCAPE_CSV.translate(value, writer);
            assertEquals(expected, writer.toString());
        } catch (final IOException e) {
            fail("Threw: " + e);
        }
    }

    /**
     * Tests // https://issues.apache.org/jira/browse/LANG-480
     * 
     * @throws java.io.UnsupportedEncodingException
     */
    

    /**
     * Tests https://issues.apache.org/jira/browse/LANG-339
     */
    

    /**
     * Tests https://issues.apache.org/jira/browse/LANG-708
     * 
     * @throws IOException
     *             if an I/O error occurs
     */
    

    /**
     * Tests https://issues.apache.org/jira/browse/LANG-720
     */
    

    

}
