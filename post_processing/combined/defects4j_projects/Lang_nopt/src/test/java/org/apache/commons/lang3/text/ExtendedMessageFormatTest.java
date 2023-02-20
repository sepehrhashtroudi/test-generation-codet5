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
import org.junit.Before;
import static org.junit.Assert.*;
import static org.apache.commons.lang3.JavaVersion.JAVA_1_4;

import java.text.ChoiceFormat;
import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.Format;
import java.text.MessageFormat;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;

import org.apache.commons.lang3.SystemUtils;

/**
 * Test case for {@link ExtendedMessageFormat}.
 *
 * @since 2.4
 * @version $Id$
 */
public class ExtendedMessageFormatTest {

    private final Map<String, FormatFactory> registry = new HashMap<String, FormatFactory>();

    @Before
    public void setUp() throws Exception {
        registry.put("lower", new LowerCaseFormatFactory());
        registry.put("upper", new UpperCaseFormatFactory());
    }

    /**
     * Test extended formats.
     */
@Test
public void testHashCode176() { ExtendedMessageFormat f1 = new ExtendedMessageFormat("{0}{1}{2}{3}"); ExtendedMessageFormat f2 = new ExtendedMessageFormat("{0}{1}{2}{3}"); ExtendedMessageFormat f3 = new ExtendedMessageFormat("{0}{1}{2}{3}"); ExtendedMessageFormat f4 = new ExtendedMessageFormat("{0}{1}{2}{3}"); assertEquals(f1.hashCode(), f2.hashCode()); assertEquals(f1.hashCode(), f3.hashCode()); assertEquals(f1.hashCode(), f4.hashCode()); }
@Test
public void testEquals188() { ExtendedMessageFormat f1 = new ExtendedMessageFormat("Hello {0}", Locale.ENGLISH); ExtendedMessageFormat f2 = new ExtendedMessageFormat("Hello {1}", Locale.ENGLISH); ExtendedMessageFormat f3 = new ExtendedMessageFormat("Hello {2}", Locale.ENGLISH); assertTrue(f1.equals(f2)); assertTrue(f1.equals(f3)); assertFalse(f1.equals(null)); }
@Test
public void testHashCode194() { ExtendedMessageFormat f1 = new ExtendedMessageFormat("{0}{1}{2}{3}"); ExtendedMessageFormat f2 = new ExtendedMessageFormat("{0}{1}{2}{3}"); ExtendedMessageFormat f3 = new ExtendedMessageFormat("{0}{1}{2}{3}"); assertEquals(f1.hashCode(), f2.hashCode()); assertEquals(f1.hashCode(), f3.hashCode()); }
@Test
public void testEquals225() { ExtendedMessageFormat f1 = new ExtendedMessageFormat("Hello {0}", Locale.ENGLISH); ExtendedMessageFormat f2 = new ExtendedMessageFormat("Hello {1}", Locale.ENGLISH); ExtendedMessageFormat f3 = new ExtendedMessageFormat("Hello {2}", Locale.ENGLISH); assertEquals(f1, f2); assertEquals(f1.hashCode(), f2.hashCode()); assertNotEquals(f1, null); assertNotEquals(f1.hashCode(), f3.hashCode()); }
    

    /**
     * Test Bug LANG-477 - out of memory error with escaped quote
     */
    

    /**
     * Test extended and built in formats.
     */
    

//    /**
//     * Test extended formats with choice format.
//     *
//     * NOTE: FAILING - currently sub-formats not supported
//     */
//    public void testExtendedWithChoiceFormat() {
//        String pattern = "Choice: {0,choice,1.0#{1,lower}|2.0#{1,upper}}";
//        ExtendedMessageFormat emf = new ExtendedMessageFormat(pattern, registry);
//        assertPatterns(null, pattern, emf.toPattern());
//        try {
//            assertEquals("one", emf.format(new Object[] {Integer.valueOf(1), "ONE"}));
//            assertEquals("TWO", emf.format(new Object[] {Integer.valueOf(2), "two"}));
//        } catch (IllegalArgumentException e) {
//            // currently sub-formats not supported
//        }
//    }

//    /**
//     * Test mixed extended and built-in formats with choice format.
//     *
//     * NOTE: FAILING - currently sub-formats not supported
//     */
//    public void testExtendedAndBuiltInWithChoiceFormat() {
//        String pattern = "Choice: {0,choice,1.0#{0} {1,lower} {2,number}|2.0#{0} {1,upper} {2,number,currency}}";
//        Object[] lowArgs  = new Object[] {Integer.valueOf(1), "Low",  Double.valueOf("1234.56")};
//        Object[] highArgs = new Object[] {Integer.valueOf(2), "High", Double.valueOf("9876.54")};
//        Locale[] availableLocales = ChoiceFormat.getAvailableLocales();
//        Locale[] testLocales = new Locale[availableLocales.length + 1];
//        testLocales[0] = null;
//        System.arraycopy(availableLocales, 0, testLocales, 1, availableLocales.length);
//        for (int i = 0; i < testLocales.length; i++) {
//            NumberFormat nf = null;
//            NumberFormat cf = null;
//            ExtendedMessageFormat emf = null;
//            if (testLocales[i] == null) {
//                nf = NumberFormat.getNumberInstance();
//                cf = NumberFormat.getCurrencyInstance();
//                emf = new ExtendedMessageFormat(pattern, registry);
//            } else {
//                nf = NumberFormat.getNumberInstance(testLocales[i]);
//                cf = NumberFormat.getCurrencyInstance(testLocales[i]);
//                emf = new ExtendedMessageFormat(pattern, testLocales[i], registry);
//            }
//            assertPatterns(null, pattern, emf.toPattern());
//            try {
//                String lowExpected = lowArgs[0] + " low "    + nf.format(lowArgs[2]);
//                String highExpected = highArgs[0] + " HIGH "  + cf.format(highArgs[2]);
//                assertEquals(lowExpected,  emf.format(lowArgs));
//                assertEquals(highExpected, emf.format(highArgs));
//            } catch (IllegalArgumentException e) {
//                // currently sub-formats not supported
//            }
//        }
//    }

    /**
     * Test the built in choice format.
     */
    

    /**
     * Test the built in date/time formats
     */
    

    

    /**
     * Test the built in number formats.
     */
    

    /**
     * Test equals() and hashcode.
     */
    

    /**
     * Test a built in format for the specified Locales, plus <code>null</code> Locale.
     * @param pattern MessageFormat pattern
     * @param args MessageFormat arguments
     * @param locales to test
     */
    private void checkBuiltInFormat(final String pattern, final Object[] args, final Locale[] locales) {
        checkBuiltInFormat(pattern, null, args, locales);
    }

    /**
     * Test a built in format for the specified Locales, plus <code>null</code> Locale.
     * @param pattern MessageFormat pattern
     * @param registry FormatFactory registry to use
     * @param args MessageFormat arguments
     * @param locales to test
     */
    private void checkBuiltInFormat(final String pattern, final Map<String, ?> registry, final Object[] args, final Locale[] locales) {
        checkBuiltInFormat(pattern, registry, args, (Locale) null);
        for (final Locale locale : locales) {
            checkBuiltInFormat(pattern, registry, args, locale);
        }
    }

    /**
     * Create an ExtendedMessageFormat for the specified pattern and locale and check the
     * formated output matches the expected result for the parameters.
     * @param pattern string
     * @param registry map
     * @param args Object[]
     * @param locale Locale
     */
    private void checkBuiltInFormat(final String pattern, final Map<String, ?> registry, final Object[] args, final Locale locale) {
        final StringBuilder buffer = new StringBuilder();
        buffer.append("Pattern=[");
        buffer.append(pattern);
        buffer.append("], locale=[");
        buffer.append(locale);
        buffer.append("]");
        final MessageFormat mf = createMessageFormat(pattern, locale);
        // System.out.println(buffer + ", result=[" + mf.format(args) +"]");
        ExtendedMessageFormat emf = null;
        if (locale == null) {
            emf = new ExtendedMessageFormat(pattern);
        } else {
            emf = new ExtendedMessageFormat(pattern, locale);
        }
        assertEquals("format "    + buffer.toString(), mf.format(args), emf.format(args));
        assertPatternsEqual("toPattern " + buffer.toString(), mf.toPattern(),  emf.toPattern());
    }

    //can't trust what MessageFormat does with toPattern() pre 1.4:
    private void assertPatternsEqual(final String message, final String expected, final String actual) {
        if (SystemUtils.isJavaVersionAtLeast(JAVA_1_4)) {
            assertEquals(message, expected, actual);
        }
    }

    /**
     * Replace MessageFormat(String, Locale) constructor (not available until JDK 1.4).
     * @param pattern string
     * @param locale Locale
     * @return MessageFormat
     */
    private MessageFormat createMessageFormat(final String pattern, final Locale locale) {
        final MessageFormat result = new MessageFormat(pattern);
        if (locale != null) {
            result.setLocale(locale);
            result.applyPattern(pattern);
        }
        return result;
    }

    // ------------------------ Test Formats ------------------------

    /**
     * {@link Format} implementation which converts to lower case.
     */
    private static class LowerCaseFormat extends Format {
        @Override
        public StringBuffer format(final Object obj, final StringBuffer toAppendTo, final FieldPosition pos) {
            return toAppendTo.append(((String)obj).toLowerCase());
        }
        @Override
        public Object parseObject(final String source, final ParsePosition pos) {throw new UnsupportedOperationException();}
    }

    /**
     * {@link Format} implementation which converts to upper case.
     */
    private static class UpperCaseFormat extends Format {
        @Override
        public StringBuffer format(final Object obj, final StringBuffer toAppendTo, final FieldPosition pos) {
            return toAppendTo.append(((String)obj).toUpperCase());
        }
        @Override
        public Object parseObject(final String source, final ParsePosition pos) {throw new UnsupportedOperationException();}
    }


    // ------------------------ Test Format Factories ---------------
    /**
     * {@link FormatFactory} implementation for lower case format.
     */
    private static class LowerCaseFormatFactory implements FormatFactory {
        private static final Format LOWER_INSTANCE = new LowerCaseFormat();
        @Override
        public Format getFormat(final String name, final String arguments, final Locale locale) {
            return LOWER_INSTANCE;
        }
    }
    /**
     * {@link FormatFactory} implementation for upper case format.
     */
    private static class UpperCaseFormatFactory implements FormatFactory {
        private static final Format UPPER_INSTANCE = new UpperCaseFormat();
        @Override
        public Format getFormat(final String name, final String arguments, final Locale locale) {
            return UPPER_INSTANCE;
        }
    }
    /**
     * {@link FormatFactory} implementation to override date format "short" to "default".
     */
    private static class OverrideShortDateFormatFactory implements FormatFactory {
        @Override
        public Format getFormat(final String name, final String arguments, final Locale locale) {
            return !"short".equals(arguments) ? null
                    : locale == null ? DateFormat
                            .getDateInstance(DateFormat.DEFAULT) : DateFormat
                            .getDateInstance(DateFormat.DEFAULT, locale);
        }
    }

    /**
     * Alternative ExtendedMessageFormat impl.
     */
    private static class OtherExtendedMessageFormat extends ExtendedMessageFormat {
        public OtherExtendedMessageFormat(final String pattern, final Locale locale,
                final Map<String, ? extends FormatFactory> registry) {
            super(pattern, locale, registry);
        }
        
    }

}
