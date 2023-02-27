/* $$ This file has been instrumented by Clover 4.1.2#20161011084623935 $$ *//*
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

import java.io.UnsupportedEncodingException;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

/**
 * <p>Operations on {@link java.lang.String} that are
 * {@code null} safe.</p>
 *
 * <ul>
 *  <li><b>IsEmpty/IsBlank</b>
 *      - checks if a String contains text</li>
 *  <li><b>Trim/Strip</b>
 *      - removes leading and trailing whitespace</li>
 *  <li><b>Equals</b>
 *      - compares two strings null-safe</li>
 *  <li><b>startsWith</b>
 *      - check if a String starts with a prefix null-safe</li>
 *  <li><b>endsWith</b>
 *      - check if a String ends with a suffix null-safe</li>
 *  <li><b>IndexOf/LastIndexOf/Contains</b>
 *      - null-safe index-of checks
 *  <li><b>IndexOfAny/LastIndexOfAny/IndexOfAnyBut/LastIndexOfAnyBut</b>
 *      - index-of any of a set of Strings</li>
 *  <li><b>ContainsOnly/ContainsNone/ContainsAny</b>
 *      - does String contains only/none/any of these characters</li>
 *  <li><b>Substring/Left/Right/Mid</b>
 *      - null-safe substring extractions</li>
 *  <li><b>SubstringBefore/SubstringAfter/SubstringBetween</b>
 *      - substring extraction relative to other strings</li>
 *  <li><b>Split/Join</b>
 *      - splits a String into an array of substrings and vice versa</li>
 *  <li><b>Remove/Delete</b>
 *      - removes part of a String</li>
 *  <li><b>Replace/Overlay</b>
 *      - Searches a String and replaces one String with another</li>
 *  <li><b>Chomp/Chop</b>
 *      - removes the last part of a String</li>
 *  <li><b>AppendIfMissing</b>
 *      - appends a suffix to the end of the String if not present</li>
 *  <li><b>PrependIfMissing</b>
 *      - prepends a prefix to the start of the String if not present</li>
 *  <li><b>LeftPad/RightPad/Center/Repeat</b>
 *      - pads a String</li>
 *  <li><b>UpperCase/LowerCase/SwapCase/Capitalize/Uncapitalize</b>
 *      - changes the case of a String</li>
 *  <li><b>CountMatches</b>
 *      - counts the number of occurrences of one String in another</li>
 *  <li><b>IsAlpha/IsNumeric/IsWhitespace/IsAsciiPrintable</b>
 *      - checks the characters in a String</li>
 *  <li><b>DefaultString</b>
 *      - protects against a null input String</li>
 *  <li><b>Reverse/ReverseDelimited</b>
 *      - reverses a String</li>
 *  <li><b>Abbreviate</b>
 *      - abbreviates a string using ellipsis</li>
 *  <li><b>Difference</b>
 *      - compares Strings and reports on their differences</li>
 *  <li><b>LevenshteinDistance</b>
 *      - the number of changes needed to change one String into another</li>
 * </ul>
 *
 * <p>The {@code StringUtils} class defines certain words related to
 * String handling.</p>
 *
 * <ul>
 *  <li>null - {@code null}</li>
 *  <li>empty - a zero-length string ({@code ""})</li>
 *  <li>space - the space character ({@code ' '}, char 32)</li>
 *  <li>whitespace - the characters defined by {@link Character#isWhitespace(char)}</li>
 *  <li>trim - the characters &lt;= 32 as in {@link String#trim()}</li>
 * </ul>
 *
 * <p>{@code StringUtils} handles {@code null} input Strings quietly.
 * That is to say that a {@code null} input will return {@code null}.
 * Where a {@code boolean} or {@code int} is being returned
 * details vary by method.</p>
 *
 * <p>A side effect of the {@code null} handling is that a
 * {@code NullPointerException} should be considered a bug in
 * {@code StringUtils}.</p>
 *
 * <p>Methods in this class give sample code to explain their operation.
 * The symbol {@code *} is used to indicate any input including {@code null}.</p>
 *
 * <p>#ThreadSafe#</p>
 * @see java.lang.String
 * @since 1.0
 * @version $Id$
 */
//@Immutable
@java.lang.SuppressWarnings({"fallthrough"}) public class StringUtils {public static class __CLR4_1_24d04d0l3lqxs2i{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492827633L,8589935092L,8146,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    // Performance testing notes (JDK 1.4, Jul03, scolebourne)
    // Whitespace:
    // Character.isWhitespace() is faster than WHITESPACE.indexOf()
    // where WHITESPACE is a string of all whitespace characters
    //
    // Character access:
    // String.charAt(n) versus toCharArray(), then array[n]
    // String.charAt(n) is about 15% worse for a 10K string
    // They are about equal for a length 50 string
    // String.charAt(n) is about 4 times better for a length 3 string
    // String.charAt(n) is best bet overall
    //
    // Append:
    // String.concat about twice as fast as StringBuffer.append
    // (not sure who tested this)

    /**
     * A String for a space character.
     * 
     * @since 3.2
     */
    public static final String SPACE = " ";

    /**
     * The empty String {@code ""}.
     * @since 2.0
     */
    public static final String EMPTY = "";

    /**
     * A String for linefeed LF ("\n").
     * 
     * @see <a href="http://docs.oracle.com/javase/specs/jls/se7/html/jls-3.html#jls-3.10.6">JLF: Escape Sequences
     *      for Character and String Literals</a>
     * @since 3.2
     */
    public static final String LF = "\n";

    /**
     * A String for carriage return CR ("\r").
     * 
     * @see <a href="http://docs.oracle.com/javase/specs/jls/se7/html/jls-3.html#jls-3.10.6">JLF: Escape Sequences
     *      for Character and String Literals</a>
     * @since 3.2
     */
    public static final String CR = "\r";
    
    /**
     * Represents a failed index search.
     * @since 2.1
     */
    public static final int INDEX_NOT_FOUND = -1;

    /**
     * <p>The maximum size to which the padding constant(s) can expand.</p>
     */
    private static final int PAD_LIMIT = 8192;

    /**
     * A regex pattern for recognizing blocks of whitespace characters.
     * The apparent convolutedness of the pattern serves the purpose of
     * ignoring "blocks" consisting of only a single space:  the pattern
     * is used only to normalize whitespace, condensing "blocks" down to a
     * single space, thus matching the same would likely cause a great
     * many noop replacements.
     */
    private static final Pattern WHITESPACE_PATTERN = Pattern.compile("(?: \\s|[\\s&&[^ ]])\\s*");

    /**
     * <p>{@code StringUtils} instances should NOT be constructed in
     * standard programming. Instead, the class should be used as
     * {@code StringUtils.trim(" foo ");}.</p>
     *
     * <p>This constructor is public to permit tools that require a JavaBean
     * instance to operate.</p>
     */
    public StringUtils() {
        super();__CLR4_1_24d04d0l3lqxs2i.R.inc(5653);try{__CLR4_1_24d04d0l3lqxs2i.R.inc(5652);
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    // Empty checks
    //-----------------------------------------------------------------------
    /**
     * <p>Checks if a CharSequence is empty ("") or null.</p>
     *
     * <pre>
     * StringUtils.isEmpty(null)      = true
     * StringUtils.isEmpty("")        = true
     * StringUtils.isEmpty(" ")       = false
     * StringUtils.isEmpty("bob")     = false
     * StringUtils.isEmpty("  bob  ") = false
     * </pre>
     *
     * <p>NOTE: This method changed in Lang version 2.0.
     * It no longer trims the CharSequence.
     * That functionality is available in isBlank().</p>
     *
     * @param cs  the CharSequence to check, may be null
     * @return {@code true} if the CharSequence is empty or null
     * @since 3.0 Changed signature from isEmpty(String) to isEmpty(CharSequence)
     */
    public static boolean isEmpty(final CharSequence cs) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(5654);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(5655);return cs == null || cs.length() == 0;
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>Checks if a CharSequence is not empty ("") and not null.</p>
     *
     * <pre>
     * StringUtils.isNotEmpty(null)      = false
     * StringUtils.isNotEmpty("")        = false
     * StringUtils.isNotEmpty(" ")       = true
     * StringUtils.isNotEmpty("bob")     = true
     * StringUtils.isNotEmpty("  bob  ") = true
     * </pre>
     *
     * @param cs  the CharSequence to check, may be null
     * @return {@code true} if the CharSequence is not empty and not null
     * @since 3.0 Changed signature from isNotEmpty(String) to isNotEmpty(CharSequence)
     */
    public static boolean isNotEmpty(final CharSequence cs) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(5656);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(5657);return !StringUtils.isEmpty(cs);
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>Checks if a CharSequence is whitespace, empty ("") or null.</p>
     *
     * <pre>
     * StringUtils.isBlank(null)      = true
     * StringUtils.isBlank("")        = true
     * StringUtils.isBlank(" ")       = true
     * StringUtils.isBlank("bob")     = false
     * StringUtils.isBlank("  bob  ") = false
     * </pre>
     *
     * @param cs  the CharSequence to check, may be null
     * @return {@code true} if the CharSequence is null, empty or whitespace
     * @since 2.0
     * @since 3.0 Changed signature from isBlank(String) to isBlank(CharSequence)
     */
    public static boolean isBlank(final CharSequence cs) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(5658);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(5659);int strLen;
        __CLR4_1_24d04d0l3lqxs2i.R.inc(5660);if (cs == null || (strLen = cs.length()) == 0) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(5663);return true;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(5664);for (int i = 0; (((i < strLen)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(5665)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(5666)==0&false)); i++) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(5667);if ((((Character.isWhitespace(cs.charAt(i)) == false)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(5668)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(5669)==0&false))) {{
                __CLR4_1_24d04d0l3lqxs2i.R.inc(5670);return false;
            }
        }}
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(5671);return true;
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>Checks if a CharSequence is not empty (""), not null and not whitespace only.</p>
     *
     * <pre>
     * StringUtils.isNotBlank(null)      = false
     * StringUtils.isNotBlank("")        = false
     * StringUtils.isNotBlank(" ")       = false
     * StringUtils.isNotBlank("bob")     = true
     * StringUtils.isNotBlank("  bob  ") = true
     * </pre>
     *
     * @param cs  the CharSequence to check, may be null
     * @return {@code true} if the CharSequence is
     *  not empty and not null and not whitespace
     * @since 2.0
     * @since 3.0 Changed signature from isNotBlank(String) to isNotBlank(CharSequence)
     */
    public static boolean isNotBlank(final CharSequence cs) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(5672);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(5673);return !StringUtils.isBlank(cs);
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    // Trim
    //-----------------------------------------------------------------------
    /**
     * <p>Removes control characters (char &lt;= 32) from both
     * ends of this String, handling {@code null} by returning
     * {@code null}.</p>
     *
     * <p>The String is trimmed using {@link String#trim()}.
     * Trim removes start and end characters &lt;= 32.
     * To strip whitespace use {@link #strip(String)}.</p>
     *
     * <p>To trim your choice of characters, use the
     * {@link #strip(String, String)} methods.</p>
     *
     * <pre>
     * StringUtils.trim(null)          = null
     * StringUtils.trim("")            = ""
     * StringUtils.trim("     ")       = ""
     * StringUtils.trim("abc")         = "abc"
     * StringUtils.trim("    abc    ") = "abc"
     * </pre>
     *
     * @param str  the String to be trimmed, may be null
     * @return the trimmed string, {@code null} if null String input
     */
    public static String trim(final String str) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(5674);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(5675);return (((str == null )&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(5676)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(5677)==0&false))? null : str.trim();
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>Removes control characters (char &lt;= 32) from both
     * ends of this String returning {@code null} if the String is
     * empty ("") after the trim or if it is {@code null}.
     *
     * <p>The String is trimmed using {@link String#trim()}.
     * Trim removes start and end characters &lt;= 32.
     * To strip whitespace use {@link #stripToNull(String)}.</p>
     *
     * <pre>
     * StringUtils.trimToNull(null)          = null
     * StringUtils.trimToNull("")            = null
     * StringUtils.trimToNull("     ")       = null
     * StringUtils.trimToNull("abc")         = "abc"
     * StringUtils.trimToNull("    abc    ") = "abc"
     * </pre>
     *
     * @param str  the String to be trimmed, may be null
     * @return the trimmed String,
     *  {@code null} if only chars &lt;= 32, empty or null String input
     * @since 2.0
     */
    public static String trimToNull(final String str) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(5678);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(5679);final String ts = trim(str);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(5680);return (((isEmpty(ts) )&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(5681)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(5682)==0&false))? null : ts;
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>Removes control characters (char &lt;= 32) from both
     * ends of this String returning an empty String ("") if the String
     * is empty ("") after the trim or if it is {@code null}.
     *
     * <p>The String is trimmed using {@link String#trim()}.
     * Trim removes start and end characters &lt;= 32.
     * To strip whitespace use {@link #stripToEmpty(String)}.</p>
     *
     * <pre>
     * StringUtils.trimToEmpty(null)          = ""
     * StringUtils.trimToEmpty("")            = ""
     * StringUtils.trimToEmpty("     ")       = ""
     * StringUtils.trimToEmpty("abc")         = "abc"
     * StringUtils.trimToEmpty("    abc    ") = "abc"
     * </pre>
     *
     * @param str  the String to be trimmed, may be null
     * @return the trimmed String, or an empty String if {@code null} input
     * @since 2.0
     */
    public static String trimToEmpty(final String str) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(5683);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(5684);return (((str == null )&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(5685)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(5686)==0&false))? EMPTY : str.trim();
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    // Stripping
    //-----------------------------------------------------------------------
    /**
     * <p>Strips whitespace from the start and end of a String.</p>
     *
     * <p>This is similar to {@link #trim(String)} but removes whitespace.
     * Whitespace is defined by {@link Character#isWhitespace(char)}.</p>
     *
     * <p>A {@code null} input String returns {@code null}.</p>
     *
     * <pre>
     * StringUtils.strip(null)     = null
     * StringUtils.strip("")       = ""
     * StringUtils.strip("   ")    = ""
     * StringUtils.strip("abc")    = "abc"
     * StringUtils.strip("  abc")  = "abc"
     * StringUtils.strip("abc  ")  = "abc"
     * StringUtils.strip(" abc ")  = "abc"
     * StringUtils.strip(" ab c ") = "ab c"
     * </pre>
     *
     * @param str  the String to remove whitespace from, may be null
     * @return the stripped String, {@code null} if null String input
     */
    public static String strip(final String str) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(5687);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(5688);return strip(str, null);
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>Strips whitespace from the start and end of a String  returning
     * {@code null} if the String is empty ("") after the strip.</p>
     *
     * <p>This is similar to {@link #trimToNull(String)} but removes whitespace.
     * Whitespace is defined by {@link Character#isWhitespace(char)}.</p>
     *
     * <pre>
     * StringUtils.stripToNull(null)     = null
     * StringUtils.stripToNull("")       = null
     * StringUtils.stripToNull("   ")    = null
     * StringUtils.stripToNull("abc")    = "abc"
     * StringUtils.stripToNull("  abc")  = "abc"
     * StringUtils.stripToNull("abc  ")  = "abc"
     * StringUtils.stripToNull(" abc ")  = "abc"
     * StringUtils.stripToNull(" ab c ") = "ab c"
     * </pre>
     *
     * @param str  the String to be stripped, may be null
     * @return the stripped String,
     *  {@code null} if whitespace, empty or null String input
     * @since 2.0
     */
    public static String stripToNull(String str) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(5689);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(5690);if ((((str == null)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(5691)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(5692)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(5693);return null;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(5694);str = strip(str, null);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(5695);return (((str.length() == 0 )&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(5696)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(5697)==0&false))? null : str;
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>Strips whitespace from the start and end of a String  returning
     * an empty String if {@code null} input.</p>
     *
     * <p>This is similar to {@link #trimToEmpty(String)} but removes whitespace.
     * Whitespace is defined by {@link Character#isWhitespace(char)}.</p>
     *
     * <pre>
     * StringUtils.stripToEmpty(null)     = ""
     * StringUtils.stripToEmpty("")       = ""
     * StringUtils.stripToEmpty("   ")    = ""
     * StringUtils.stripToEmpty("abc")    = "abc"
     * StringUtils.stripToEmpty("  abc")  = "abc"
     * StringUtils.stripToEmpty("abc  ")  = "abc"
     * StringUtils.stripToEmpty(" abc ")  = "abc"
     * StringUtils.stripToEmpty(" ab c ") = "ab c"
     * </pre>
     *
     * @param str  the String to be stripped, may be null
     * @return the trimmed String, or an empty String if {@code null} input
     * @since 2.0
     */
    public static String stripToEmpty(final String str) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(5698);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(5699);return (((str == null )&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(5700)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(5701)==0&false))? EMPTY : strip(str, null);
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>Strips any of a set of characters from the start and end of a String.
     * This is similar to {@link String#trim()} but allows the characters
     * to be stripped to be controlled.</p>
     *
     * <p>A {@code null} input String returns {@code null}.
     * An empty string ("") input returns the empty string.</p>
     *
     * <p>If the stripChars String is {@code null}, whitespace is
     * stripped as defined by {@link Character#isWhitespace(char)}.
     * Alternatively use {@link #strip(String)}.</p>
     *
     * <pre>
     * StringUtils.strip(null, *)          = null
     * StringUtils.strip("", *)            = ""
     * StringUtils.strip("abc", null)      = "abc"
     * StringUtils.strip("  abc", null)    = "abc"
     * StringUtils.strip("abc  ", null)    = "abc"
     * StringUtils.strip(" abc ", null)    = "abc"
     * StringUtils.strip("  abcyx", "xyz") = "  abc"
     * </pre>
     *
     * @param str  the String to remove characters from, may be null
     * @param stripChars  the characters to remove, null treated as whitespace
     * @return the stripped String, {@code null} if null String input
     */
    public static String strip(String str, final String stripChars) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(5702);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(5703);if ((((isEmpty(str))&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(5704)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(5705)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(5706);return str;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(5707);str = stripStart(str, stripChars);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(5708);return stripEnd(str, stripChars);
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>Strips any of a set of characters from the start of a String.</p>
     *
     * <p>A {@code null} input String returns {@code null}.
     * An empty string ("") input returns the empty string.</p>
     *
     * <p>If the stripChars String is {@code null}, whitespace is
     * stripped as defined by {@link Character#isWhitespace(char)}.</p>
     *
     * <pre>
     * StringUtils.stripStart(null, *)          = null
     * StringUtils.stripStart("", *)            = ""
     * StringUtils.stripStart("abc", "")        = "abc"
     * StringUtils.stripStart("abc", null)      = "abc"
     * StringUtils.stripStart("  abc", null)    = "abc"
     * StringUtils.stripStart("abc  ", null)    = "abc  "
     * StringUtils.stripStart(" abc ", null)    = "abc "
     * StringUtils.stripStart("yxabc  ", "xyz") = "abc  "
     * </pre>
     *
     * @param str  the String to remove characters from, may be null
     * @param stripChars  the characters to remove, null treated as whitespace
     * @return the stripped String, {@code null} if null String input
     */
    public static String stripStart(final String str, final String stripChars) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(5709);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(5710);int strLen;
        __CLR4_1_24d04d0l3lqxs2i.R.inc(5711);if (str == null || (strLen = str.length()) == 0) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(5714);return str;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(5715);int start = 0;
        __CLR4_1_24d04d0l3lqxs2i.R.inc(5716);if ((((stripChars == null)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(5717)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(5718)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(5719);while ((((start != strLen && Character.isWhitespace(str.charAt(start)))&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(5720)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(5721)==0&false))) {{
                __CLR4_1_24d04d0l3lqxs2i.R.inc(5722);start++;
            }
        }} }else {__CLR4_1_24d04d0l3lqxs2i.R.inc(5723);if ((((stripChars.length() == 0)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(5724)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(5725)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(5726);return str;
        } }else {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(5727);while ((((start != strLen && stripChars.indexOf(str.charAt(start)) != INDEX_NOT_FOUND)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(5728)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(5729)==0&false))) {{
                __CLR4_1_24d04d0l3lqxs2i.R.inc(5730);start++;
            }
        }}
        }}__CLR4_1_24d04d0l3lqxs2i.R.inc(5731);return str.substring(start);
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>Strips any of a set of characters from the end of a String.</p>
     *
     * <p>A {@code null} input String returns {@code null}.
     * An empty string ("") input returns the empty string.</p>
     *
     * <p>If the stripChars String is {@code null}, whitespace is
     * stripped as defined by {@link Character#isWhitespace(char)}.</p>
     *
     * <pre>
     * StringUtils.stripEnd(null, *)          = null
     * StringUtils.stripEnd("", *)            = ""
     * StringUtils.stripEnd("abc", "")        = "abc"
     * StringUtils.stripEnd("abc", null)      = "abc"
     * StringUtils.stripEnd("  abc", null)    = "  abc"
     * StringUtils.stripEnd("abc  ", null)    = "abc"
     * StringUtils.stripEnd(" abc ", null)    = " abc"
     * StringUtils.stripEnd("  abcyx", "xyz") = "  abc"
     * StringUtils.stripEnd("120.00", ".0")   = "12"
     * </pre>
     *
     * @param str  the String to remove characters from, may be null
     * @param stripChars  the set of characters to remove, null treated as whitespace
     * @return the stripped String, {@code null} if null String input
     */
    public static String stripEnd(final String str, final String stripChars) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(5732);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(5733);int end;
        __CLR4_1_24d04d0l3lqxs2i.R.inc(5734);if (str == null || (end = str.length()) == 0) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(5737);return str;
        }

        }__CLR4_1_24d04d0l3lqxs2i.R.inc(5738);if ((((stripChars == null)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(5739)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(5740)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(5741);while ((((end != 0 && Character.isWhitespace(str.charAt(end - 1)))&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(5742)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(5743)==0&false))) {{
                __CLR4_1_24d04d0l3lqxs2i.R.inc(5744);end--;
            }
        }} }else {__CLR4_1_24d04d0l3lqxs2i.R.inc(5745);if ((((stripChars.length() == 0)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(5746)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(5747)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(5748);return str;
        } }else {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(5749);while ((((end != 0 && stripChars.indexOf(str.charAt(end - 1)) != INDEX_NOT_FOUND)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(5750)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(5751)==0&false))) {{
                __CLR4_1_24d04d0l3lqxs2i.R.inc(5752);end--;
            }
        }}
        }}__CLR4_1_24d04d0l3lqxs2i.R.inc(5753);return str.substring(0, end);
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    // StripAll
    //-----------------------------------------------------------------------
    /**
     * <p>Strips whitespace from the start and end of every String in an array.
     * Whitespace is defined by {@link Character#isWhitespace(char)}.</p>
     *
     * <p>A new array is returned each time, except for length zero.
     * A {@code null} array will return {@code null}.
     * An empty array will return itself.
     * A {@code null} array entry will be ignored.</p>
     *
     * <pre>
     * StringUtils.stripAll(null)             = null
     * StringUtils.stripAll([])               = []
     * StringUtils.stripAll(["abc", "  abc"]) = ["abc", "abc"]
     * StringUtils.stripAll(["abc  ", null])  = ["abc", null]
     * </pre>
     *
     * @param strs  the array to remove whitespace from, may be null
     * @return the stripped Strings, {@code null} if null array input
     */
    public static String[] stripAll(final String... strs) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(5754);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(5755);return stripAll(strs, null);
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>Strips any of a set of characters from the start and end of every
     * String in an array.</p>
     * Whitespace is defined by {@link Character#isWhitespace(char)}.</p>
     *
     * <p>A new array is returned each time, except for length zero.
     * A {@code null} array will return {@code null}.
     * An empty array will return itself.
     * A {@code null} array entry will be ignored.
     * A {@code null} stripChars will strip whitespace as defined by
     * {@link Character#isWhitespace(char)}.</p>
     *
     * <pre>
     * StringUtils.stripAll(null, *)                = null
     * StringUtils.stripAll([], *)                  = []
     * StringUtils.stripAll(["abc", "  abc"], null) = ["abc", "abc"]
     * StringUtils.stripAll(["abc  ", null], null)  = ["abc", null]
     * StringUtils.stripAll(["abc  ", null], "yz")  = ["abc  ", null]
     * StringUtils.stripAll(["yabcz", null], "yz")  = ["abc", null]
     * </pre>
     *
     * @param strs  the array to remove characters from, may be null
     * @param stripChars  the characters to remove, null treated as whitespace
     * @return the stripped Strings, {@code null} if null array input
     */
    public static String[] stripAll(final String[] strs, final String stripChars) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(5756);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(5757);int strsLen;
        __CLR4_1_24d04d0l3lqxs2i.R.inc(5758);if (strs == null || (strsLen = strs.length) == 0) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(5761);return strs;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(5762);final String[] newArr = new String[strsLen];
        __CLR4_1_24d04d0l3lqxs2i.R.inc(5763);for (int i = 0; (((i < strsLen)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(5764)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(5765)==0&false)); i++) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(5766);newArr[i] = strip(strs[i], stripChars);
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(5767);return newArr;
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>Removes diacritics (~= accents) from a string. The case will not be altered.</p>
     * <p>For instance, '&agrave;' will be replaced by 'a'.</p>
     * <p>Note that ligatures will be left as is.</p>
     *
     * <pre>
     * StringUtils.stripAccents(null)                = null
     * StringUtils.stripAccents("")                  = ""
     * StringUtils.stripAccents("control")           = "control"
     * StringUtils.stripAccents("&eacute;clair")     = "eclair"
     * </pre>
     *
     * @param input String to be stripped
     * @return input text with diacritics removed
     *
     * @since 3.0
     */
    // See also Lucene's ASCIIFoldingFilter (Lucene 2.9) that replaces accented characters by their unaccented equivalent (and uncommitted bug fix: https://issues.apache.org/jira/browse/LUCENE-1343?focusedCommentId=12858907&page=com.atlassian.jira.plugin.system.issuetabpanels%3Acomment-tabpanel#action_12858907).
    public static String stripAccents(final String input) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(5768);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(5769);if((((input == null)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(5770)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(5771)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(5772);return null;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(5773);final Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");//$NON-NLS-1$
        __CLR4_1_24d04d0l3lqxs2i.R.inc(5774);final String decomposed = Normalizer.normalize(input, Normalizer.Form.NFD);
        // Note that this doesn't correctly remove ligatures...
        __CLR4_1_24d04d0l3lqxs2i.R.inc(5775);return pattern.matcher(decomposed).replaceAll("");//$NON-NLS-1$
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    // Equals
    //-----------------------------------------------------------------------
    /**
     * <p>Compares two CharSequences, returning {@code true} if they represent
     * equal sequences of characters.</p>
     *
     * <p>{@code null}s are handled without exceptions. Two {@code null}
     * references are considered to be equal. The comparison is case sensitive.</p>
     *
     * <pre>
     * StringUtils.equals(null, null)   = true
     * StringUtils.equals(null, "abc")  = false
     * StringUtils.equals("abc", null)  = false
     * StringUtils.equals("abc", "abc") = true
     * StringUtils.equals("abc", "ABC") = false
     * </pre>
     *
     * @see Object#equals(Object)
     * @param cs1  the first CharSequence, may be {@code null}
     * @param cs2  the second CharSequence, may be {@code null}
     * @return {@code true} if the CharSequences are equal (case-sensitive), or both {@code null}
     * @since 3.0 Changed signature from equals(String, String) to equals(CharSequence, CharSequence)
     */
    public static boolean equals(final CharSequence cs1, final CharSequence cs2) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(5776);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(5777);if ((((cs1 == cs2)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(5778)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(5779)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(5780);return true;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(5781);if ((((cs1 == null || cs2 == null)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(5782)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(5783)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(5784);return false;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(5785);if ((((cs1 instanceof String && cs2 instanceof String)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(5786)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(5787)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(5788);return cs1.equals(cs2);
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(5789);return CharSequenceUtils.regionMatches(cs1, false, 0, cs2, 0, Math.max(cs1.length(), cs2.length()));
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>Compares two CharSequences, returning {@code true} if they represent
     * equal sequences of characters, ignoring case.</p>
     *
     * <p>{@code null}s are handled without exceptions. Two {@code null}
     * references are considered equal. Comparison is case insensitive.</p>
     *
     * <pre>
     * StringUtils.equalsIgnoreCase(null, null)   = true
     * StringUtils.equalsIgnoreCase(null, "abc")  = false
     * StringUtils.equalsIgnoreCase("abc", null)  = false
     * StringUtils.equalsIgnoreCase("abc", "abc") = true
     * StringUtils.equalsIgnoreCase("abc", "ABC") = true
     * </pre>
     *
     * @param str1  the first CharSequence, may be null
     * @param str2  the second CharSequence, may be null
     * @return {@code true} if the CharSequence are equal, case insensitive, or
     *  both {@code null}
     * @since 3.0 Changed signature from equalsIgnoreCase(String, String) to equalsIgnoreCase(CharSequence, CharSequence)
     */
    public static boolean equalsIgnoreCase(final CharSequence str1, final CharSequence str2) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(5790);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(5791);if ((((str1 == null || str2 == null)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(5792)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(5793)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(5794);return str1 == str2;
        } }else {__CLR4_1_24d04d0l3lqxs2i.R.inc(5795);if ((((str1 == str2)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(5796)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(5797)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(5798);return true;
        } }else {__CLR4_1_24d04d0l3lqxs2i.R.inc(5799);if ((((str1.length() != str2.length())&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(5800)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(5801)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(5802);return false;
        } }else {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(5803);return CharSequenceUtils.regionMatches(str1, true, 0, str2, 0, str1.length());
        }
    }}}}finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    // IndexOf
    //-----------------------------------------------------------------------
    /**
     * <p>Finds the first index within a CharSequence, handling {@code null}.
     * This method uses {@link String#indexOf(int, int)} if possible.</p>
     *
     * <p>A {@code null} or empty ("") CharSequence will return {@code INDEX_NOT_FOUND (-1)}.</p>
     *
     * <pre>
     * StringUtils.indexOf(null, *)         = -1
     * StringUtils.indexOf("", *)           = -1
     * StringUtils.indexOf("aabaabaa", 'a') = 0
     * StringUtils.indexOf("aabaabaa", 'b') = 2
     * </pre>
     *
     * @param seq  the CharSequence to check, may be null
     * @param searchChar  the character to find
     * @return the first index of the search character,
     *  -1 if no match or {@code null} string input
     * @since 2.0
     * @since 3.0 Changed signature from indexOf(String, int) to indexOf(CharSequence, int)
     */
    public static int indexOf(final CharSequence seq, final int searchChar) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(5804);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(5805);if ((((isEmpty(seq))&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(5806)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(5807)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(5808);return INDEX_NOT_FOUND;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(5809);return CharSequenceUtils.indexOf(seq, searchChar, 0);
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>Finds the first index within a CharSequence from a start position,
     * handling {@code null}.
     * This method uses {@link String#indexOf(int, int)} if possible.</p>
     *
     * <p>A {@code null} or empty ("") CharSequence will return {@code (INDEX_NOT_FOUND) -1}.
     * A negative start position is treated as zero.
     * A start position greater than the string length returns {@code -1}.</p>
     *
     * <pre>
     * StringUtils.indexOf(null, *, *)          = -1
     * StringUtils.indexOf("", *, *)            = -1
     * StringUtils.indexOf("aabaabaa", 'b', 0)  = 2
     * StringUtils.indexOf("aabaabaa", 'b', 3)  = 5
     * StringUtils.indexOf("aabaabaa", 'b', 9)  = -1
     * StringUtils.indexOf("aabaabaa", 'b', -1) = 2
     * </pre>
     *
     * @param seq  the CharSequence to check, may be null
     * @param searchChar  the character to find
     * @param startPos  the start position, negative treated as zero
     * @return the first index of the search character,
     *  -1 if no match or {@code null} string input
     * @since 2.0
     * @since 3.0 Changed signature from indexOf(String, int, int) to indexOf(CharSequence, int, int)
     */
    public static int indexOf(final CharSequence seq, final int searchChar, final int startPos) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(5810);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(5811);if ((((isEmpty(seq))&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(5812)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(5813)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(5814);return INDEX_NOT_FOUND;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(5815);return CharSequenceUtils.indexOf(seq, searchChar, startPos);
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>Finds the first index within a CharSequence, handling {@code null}.
     * This method uses {@link String#indexOf(String, int)} if possible.</p>
     *
     * <p>A {@code null} CharSequence will return {@code -1}.</p>
     *
     * <pre>
     * StringUtils.indexOf(null, *)          = -1
     * StringUtils.indexOf(*, null)          = -1
     * StringUtils.indexOf("", "")           = 0
     * StringUtils.indexOf("", *)            = -1 (except when * = "")
     * StringUtils.indexOf("aabaabaa", "a")  = 0
     * StringUtils.indexOf("aabaabaa", "b")  = 2
     * StringUtils.indexOf("aabaabaa", "ab") = 1
     * StringUtils.indexOf("aabaabaa", "")   = 0
     * </pre>
     *
     * @param seq  the CharSequence to check, may be null
     * @param searchSeq  the CharSequence to find, may be null
     * @return the first index of the search CharSequence,
     *  -1 if no match or {@code null} string input
     * @since 2.0
     * @since 3.0 Changed signature from indexOf(String, String) to indexOf(CharSequence, CharSequence)
     */
    public static int indexOf(final CharSequence seq, final CharSequence searchSeq) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(5816);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(5817);if ((((seq == null || searchSeq == null)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(5818)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(5819)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(5820);return INDEX_NOT_FOUND;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(5821);return CharSequenceUtils.indexOf(seq, searchSeq, 0);
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>Finds the first index within a CharSequence, handling {@code null}.
     * This method uses {@link String#indexOf(String, int)} if possible.</p>
     *
     * <p>A {@code null} CharSequence will return {@code -1}.
     * A negative start position is treated as zero.
     * An empty ("") search CharSequence always matches.
     * A start position greater than the string length only matches
     * an empty search CharSequence.</p>
     *
     * <pre>
     * StringUtils.indexOf(null, *, *)          = -1
     * StringUtils.indexOf(*, null, *)          = -1
     * StringUtils.indexOf("", "", 0)           = 0
     * StringUtils.indexOf("", *, 0)            = -1 (except when * = "")
     * StringUtils.indexOf("aabaabaa", "a", 0)  = 0
     * StringUtils.indexOf("aabaabaa", "b", 0)  = 2
     * StringUtils.indexOf("aabaabaa", "ab", 0) = 1
     * StringUtils.indexOf("aabaabaa", "b", 3)  = 5
     * StringUtils.indexOf("aabaabaa", "b", 9)  = -1
     * StringUtils.indexOf("aabaabaa", "b", -1) = 2
     * StringUtils.indexOf("aabaabaa", "", 2)   = 2
     * StringUtils.indexOf("abc", "", 9)        = 3
     * </pre>
     *
     * @param seq  the CharSequence to check, may be null
     * @param searchSeq  the CharSequence to find, may be null
     * @param startPos  the start position, negative treated as zero
     * @return the first index of the search CharSequence,
     *  -1 if no match or {@code null} string input
     * @since 2.0
     * @since 3.0 Changed signature from indexOf(String, String, int) to indexOf(CharSequence, CharSequence, int)
     */
    public static int indexOf(final CharSequence seq, final CharSequence searchSeq, final int startPos) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(5822);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(5823);if ((((seq == null || searchSeq == null)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(5824)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(5825)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(5826);return INDEX_NOT_FOUND;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(5827);return CharSequenceUtils.indexOf(seq, searchSeq, startPos);
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>Finds the n-th index within a CharSequence, handling {@code null}.
     * This method uses {@link String#indexOf(String)} if possible.</p>
     *
     * <p>A {@code null} CharSequence will return {@code -1}.</p>
     *
     * <pre>
     * StringUtils.ordinalIndexOf(null, *, *)          = -1
     * StringUtils.ordinalIndexOf(*, null, *)          = -1
     * StringUtils.ordinalIndexOf("", "", *)           = 0
     * StringUtils.ordinalIndexOf("aabaabaa", "a", 1)  = 0
     * StringUtils.ordinalIndexOf("aabaabaa", "a", 2)  = 1
     * StringUtils.ordinalIndexOf("aabaabaa", "b", 1)  = 2
     * StringUtils.ordinalIndexOf("aabaabaa", "b", 2)  = 5
     * StringUtils.ordinalIndexOf("aabaabaa", "ab", 1) = 1
     * StringUtils.ordinalIndexOf("aabaabaa", "ab", 2) = 4
     * StringUtils.ordinalIndexOf("aabaabaa", "", 1)   = 0
     * StringUtils.ordinalIndexOf("aabaabaa", "", 2)   = 0
     * </pre>
     *
     * <p>Note that 'head(CharSequence str, int n)' may be implemented as: </p>
     *
     * <pre>
     *   str.substring(0, lastOrdinalIndexOf(str, "\n", n))
     * </pre>
     *
     * @param str  the CharSequence to check, may be null
     * @param searchStr  the CharSequence to find, may be null
     * @param ordinal  the n-th {@code searchStr} to find
     * @return the n-th index of the search CharSequence,
     *  {@code -1} ({@code INDEX_NOT_FOUND}) if no match or {@code null} string input
     * @since 2.1
     * @since 3.0 Changed signature from ordinalIndexOf(String, String, int) to ordinalIndexOf(CharSequence, CharSequence, int)
     */
    public static int ordinalIndexOf(final CharSequence str, final CharSequence searchStr, final int ordinal) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(5828);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(5829);return ordinalIndexOf(str, searchStr, ordinal, false);
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>Finds the n-th index within a String, handling {@code null}.
     * This method uses {@link String#indexOf(String)} if possible.</p>
     *
     * <p>A {@code null} CharSequence will return {@code -1}.</p>
     *
     * @param str  the CharSequence to check, may be null
     * @param searchStr  the CharSequence to find, may be null
     * @param ordinal  the n-th {@code searchStr} to find
     * @param lastIndex true if lastOrdinalIndexOf() otherwise false if ordinalIndexOf()
     * @return the n-th index of the search CharSequence,
     *  {@code -1} ({@code INDEX_NOT_FOUND}) if no match or {@code null} string input
     */
    // Shared code between ordinalIndexOf(String,String,int) and lastOrdinalIndexOf(String,String,int)
    private static int ordinalIndexOf(final CharSequence str, final CharSequence searchStr, final int ordinal, final boolean lastIndex) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(5830);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(5831);if ((((str == null || searchStr == null || ordinal <= 0)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(5832)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(5833)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(5834);return INDEX_NOT_FOUND;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(5835);if ((((searchStr.length() == 0)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(5836)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(5837)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(5838);return (((lastIndex )&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(5839)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(5840)==0&false))? str.length() : 0;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(5841);int found = 0;
        __CLR4_1_24d04d0l3lqxs2i.R.inc(5842);int index = (((lastIndex )&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(5843)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(5844)==0&false))? str.length() : INDEX_NOT_FOUND;
        __CLR4_1_24d04d0l3lqxs2i.R.inc(5845);do {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(5846);if ((((lastIndex)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(5847)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(5848)==0&false))) {{
                __CLR4_1_24d04d0l3lqxs2i.R.inc(5849);index = CharSequenceUtils.lastIndexOf(str, searchStr, index - 1);
            } }else {{
                __CLR4_1_24d04d0l3lqxs2i.R.inc(5850);index = CharSequenceUtils.indexOf(str, searchStr, index + 1);
            }
            }__CLR4_1_24d04d0l3lqxs2i.R.inc(5851);if ((((index < 0)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(5852)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(5853)==0&false))) {{
                __CLR4_1_24d04d0l3lqxs2i.R.inc(5854);return index;
            }
            }__CLR4_1_24d04d0l3lqxs2i.R.inc(5855);found++;
        } }while ((((found < ordinal)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(5856)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(5857)==0&false)));
        __CLR4_1_24d04d0l3lqxs2i.R.inc(5858);return index;
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>Case in-sensitive find of the first index within a CharSequence.</p>
     *
     * <p>A {@code null} CharSequence will return {@code -1}.
     * A negative start position is treated as zero.
     * An empty ("") search CharSequence always matches.
     * A start position greater than the string length only matches
     * an empty search CharSequence.</p>
     *
     * <pre>
     * StringUtils.indexOfIgnoreCase(null, *)          = -1
     * StringUtils.indexOfIgnoreCase(*, null)          = -1
     * StringUtils.indexOfIgnoreCase("", "")           = 0
     * StringUtils.indexOfIgnoreCase("aabaabaa", "a")  = 0
     * StringUtils.indexOfIgnoreCase("aabaabaa", "b")  = 2
     * StringUtils.indexOfIgnoreCase("aabaabaa", "ab") = 1
     * </pre>
     *
     * @param str  the CharSequence to check, may be null
     * @param searchStr  the CharSequence to find, may be null
     * @return the first index of the search CharSequence,
     *  -1 if no match or {@code null} string input
     * @since 2.5
     * @since 3.0 Changed signature from indexOfIgnoreCase(String, String) to indexOfIgnoreCase(CharSequence, CharSequence)
     */
    public static int indexOfIgnoreCase(final CharSequence str, final CharSequence searchStr) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(5859);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(5860);return indexOfIgnoreCase(str, searchStr, 0);
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>Case in-sensitive find of the first index within a CharSequence
     * from the specified position.</p>
     *
     * <p>A {@code null} CharSequence will return {@code -1}.
     * A negative start position is treated as zero.
     * An empty ("") search CharSequence always matches.
     * A start position greater than the string length only matches
     * an empty search CharSequence.</p>
     *
     * <pre>
     * StringUtils.indexOfIgnoreCase(null, *, *)          = -1
     * StringUtils.indexOfIgnoreCase(*, null, *)          = -1
     * StringUtils.indexOfIgnoreCase("", "", 0)           = 0
     * StringUtils.indexOfIgnoreCase("aabaabaa", "A", 0)  = 0
     * StringUtils.indexOfIgnoreCase("aabaabaa", "B", 0)  = 2
     * StringUtils.indexOfIgnoreCase("aabaabaa", "AB", 0) = 1
     * StringUtils.indexOfIgnoreCase("aabaabaa", "B", 3)  = 5
     * StringUtils.indexOfIgnoreCase("aabaabaa", "B", 9)  = -1
     * StringUtils.indexOfIgnoreCase("aabaabaa", "B", -1) = 2
     * StringUtils.indexOfIgnoreCase("aabaabaa", "", 2)   = 2
     * StringUtils.indexOfIgnoreCase("abc", "", 9)        = 3
     * </pre>
     *
     * @param str  the CharSequence to check, may be null
     * @param searchStr  the CharSequence to find, may be null
     * @param startPos  the start position, negative treated as zero
     * @return the first index of the search CharSequence,
     *  -1 if no match or {@code null} string input
     * @since 2.5
     * @since 3.0 Changed signature from indexOfIgnoreCase(String, String, int) to indexOfIgnoreCase(CharSequence, CharSequence, int)
     */
    public static int indexOfIgnoreCase(final CharSequence str, final CharSequence searchStr, int startPos) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(5861);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(5862);if ((((str == null || searchStr == null)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(5863)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(5864)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(5865);return INDEX_NOT_FOUND;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(5866);if ((((startPos < 0)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(5867)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(5868)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(5869);startPos = 0;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(5870);final int endLimit = str.length() - searchStr.length() + 1;
        __CLR4_1_24d04d0l3lqxs2i.R.inc(5871);if ((((startPos > endLimit)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(5872)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(5873)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(5874);return INDEX_NOT_FOUND;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(5875);if ((((searchStr.length() == 0)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(5876)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(5877)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(5878);return startPos;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(5879);for (int i = startPos; (((i < endLimit)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(5880)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(5881)==0&false)); i++) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(5882);if ((((CharSequenceUtils.regionMatches(str, true, i, searchStr, 0, searchStr.length()))&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(5883)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(5884)==0&false))) {{
                __CLR4_1_24d04d0l3lqxs2i.R.inc(5885);return i;
            }
        }}
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(5886);return INDEX_NOT_FOUND;
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    // LastIndexOf
    //-----------------------------------------------------------------------
    /**
     * <p>Finds the last index within a CharSequence, handling {@code null}.
     * This method uses {@link String#lastIndexOf(int)} if possible.</p>
     *
     * <p>A {@code null} or empty ("") CharSequence will return {@code -1}.</p>
     *
     * <pre>
     * StringUtils.lastIndexOf(null, *)         = -1
     * StringUtils.lastIndexOf("", *)           = -1
     * StringUtils.lastIndexOf("aabaabaa", 'a') = 7
     * StringUtils.lastIndexOf("aabaabaa", 'b') = 5
     * </pre>
     *
     * @param seq  the CharSequence to check, may be null
     * @param searchChar  the character to find
     * @return the last index of the search character,
     *  -1 if no match or {@code null} string input
     * @since 2.0
     * @since 3.0 Changed signature from lastIndexOf(String, int) to lastIndexOf(CharSequence, int)
     */
    public static int lastIndexOf(final CharSequence seq, final int searchChar) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(5887);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(5888);if ((((isEmpty(seq))&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(5889)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(5890)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(5891);return INDEX_NOT_FOUND;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(5892);return CharSequenceUtils.lastIndexOf(seq, searchChar, seq.length());
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>Finds the last index within a CharSequence from a start position,
     * handling {@code null}.
     * This method uses {@link String#lastIndexOf(int, int)} if possible.</p>
     *
     * <p>A {@code null} or empty ("") CharSequence will return {@code -1}.
     * A negative start position returns {@code -1}.
     * A start position greater than the string length searches the whole string.</p>
     *
     * <pre>
     * StringUtils.lastIndexOf(null, *, *)          = -1
     * StringUtils.lastIndexOf("", *,  *)           = -1
     * StringUtils.lastIndexOf("aabaabaa", 'b', 8)  = 5
     * StringUtils.lastIndexOf("aabaabaa", 'b', 4)  = 2
     * StringUtils.lastIndexOf("aabaabaa", 'b', 0)  = -1
     * StringUtils.lastIndexOf("aabaabaa", 'b', 9)  = 5
     * StringUtils.lastIndexOf("aabaabaa", 'b', -1) = -1
     * StringUtils.lastIndexOf("aabaabaa", 'a', 0)  = 0
     * </pre>
     *
     * @param seq  the CharSequence to check, may be null
     * @param searchChar  the character to find
     * @param startPos  the start position
     * @return the last index of the search character,
     *  -1 if no match or {@code null} string input
     * @since 2.0
     * @since 3.0 Changed signature from lastIndexOf(String, int, int) to lastIndexOf(CharSequence, int, int)
     */
    public static int lastIndexOf(final CharSequence seq, final int searchChar, final int startPos) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(5893);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(5894);if ((((isEmpty(seq))&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(5895)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(5896)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(5897);return INDEX_NOT_FOUND;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(5898);return CharSequenceUtils.lastIndexOf(seq, searchChar, startPos);
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>Finds the last index within a CharSequence, handling {@code null}.
     * This method uses {@link String#lastIndexOf(String)} if possible.</p>
     *
     * <p>A {@code null} CharSequence will return {@code -1}.</p>
     *
     * <pre>
     * StringUtils.lastIndexOf(null, *)          = -1
     * StringUtils.lastIndexOf(*, null)          = -1
     * StringUtils.lastIndexOf("", "")           = 0
     * StringUtils.lastIndexOf("aabaabaa", "a")  = 7
     * StringUtils.lastIndexOf("aabaabaa", "b")  = 5
     * StringUtils.lastIndexOf("aabaabaa", "ab") = 4
     * StringUtils.lastIndexOf("aabaabaa", "")   = 8
     * </pre>
     *
     * @param seq  the CharSequence to check, may be null
     * @param searchSeq  the CharSequence to find, may be null
     * @return the last index of the search String,
     *  -1 if no match or {@code null} string input
     * @since 2.0
     * @since 3.0 Changed signature from lastIndexOf(String, String) to lastIndexOf(CharSequence, CharSequence)
     */
    public static int lastIndexOf(final CharSequence seq, final CharSequence searchSeq) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(5899);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(5900);if ((((seq == null || searchSeq == null)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(5901)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(5902)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(5903);return INDEX_NOT_FOUND;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(5904);return CharSequenceUtils.lastIndexOf(seq, searchSeq, seq.length());
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>Finds the n-th last index within a String, handling {@code null}.
     * This method uses {@link String#lastIndexOf(String)}.</p>
     *
     * <p>A {@code null} String will return {@code -1}.</p>
     *
     * <pre>
     * StringUtils.lastOrdinalIndexOf(null, *, *)          = -1
     * StringUtils.lastOrdinalIndexOf(*, null, *)          = -1
     * StringUtils.lastOrdinalIndexOf("", "", *)           = 0
     * StringUtils.lastOrdinalIndexOf("aabaabaa", "a", 1)  = 7
     * StringUtils.lastOrdinalIndexOf("aabaabaa", "a", 2)  = 6
     * StringUtils.lastOrdinalIndexOf("aabaabaa", "b", 1)  = 5
     * StringUtils.lastOrdinalIndexOf("aabaabaa", "b", 2)  = 2
     * StringUtils.lastOrdinalIndexOf("aabaabaa", "ab", 1) = 4
     * StringUtils.lastOrdinalIndexOf("aabaabaa", "ab", 2) = 1
     * StringUtils.lastOrdinalIndexOf("aabaabaa", "", 1)   = 8
     * StringUtils.lastOrdinalIndexOf("aabaabaa", "", 2)   = 8
     * </pre>
     *
     * <p>Note that 'tail(CharSequence str, int n)' may be implemented as: </p>
     *
     * <pre>
     *   str.substring(lastOrdinalIndexOf(str, "\n", n) + 1)
     * </pre>
     *
     * @param str  the CharSequence to check, may be null
     * @param searchStr  the CharSequence to find, may be null
     * @param ordinal  the n-th last {@code searchStr} to find
     * @return the n-th last index of the search CharSequence,
     *  {@code -1} ({@code INDEX_NOT_FOUND}) if no match or {@code null} string input
     * @since 2.5
     * @since 3.0 Changed signature from lastOrdinalIndexOf(String, String, int) to lastOrdinalIndexOf(CharSequence, CharSequence, int)
     */
    public static int lastOrdinalIndexOf(final CharSequence str, final CharSequence searchStr, final int ordinal) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(5905);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(5906);return ordinalIndexOf(str, searchStr, ordinal, true);
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>Finds the first index within a CharSequence, handling {@code null}.
     * This method uses {@link String#lastIndexOf(String, int)} if possible.</p>
     *
     * <p>A {@code null} CharSequence will return {@code -1}.
     * A negative start position returns {@code -1}.
     * An empty ("") search CharSequence always matches unless the start position is negative.
     * A start position greater than the string length searches the whole string.</p>
     *
     * <pre>
     * StringUtils.lastIndexOf(null, *, *)          = -1
     * StringUtils.lastIndexOf(*, null, *)          = -1
     * StringUtils.lastIndexOf("aabaabaa", "a", 8)  = 7
     * StringUtils.lastIndexOf("aabaabaa", "b", 8)  = 5
     * StringUtils.lastIndexOf("aabaabaa", "ab", 8) = 4
     * StringUtils.lastIndexOf("aabaabaa", "b", 9)  = 5
     * StringUtils.lastIndexOf("aabaabaa", "b", -1) = -1
     * StringUtils.lastIndexOf("aabaabaa", "a", 0)  = 0
     * StringUtils.lastIndexOf("aabaabaa", "b", 0)  = -1
     * </pre>
     *
     * @param seq  the CharSequence to check, may be null
     * @param searchSeq  the CharSequence to find, may be null
     * @param startPos  the start position, negative treated as zero
     * @return the first index of the search CharSequence,
     *  -1 if no match or {@code null} string input
     * @since 2.0
     * @since 3.0 Changed signature from lastIndexOf(String, String, int) to lastIndexOf(CharSequence, CharSequence, int)
     */
    public static int lastIndexOf(final CharSequence seq, final CharSequence searchSeq, final int startPos) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(5907);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(5908);if ((((seq == null || searchSeq == null)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(5909)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(5910)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(5911);return INDEX_NOT_FOUND;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(5912);return CharSequenceUtils.lastIndexOf(seq, searchSeq, startPos);
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>Case in-sensitive find of the last index within a CharSequence.</p>
     *
     * <p>A {@code null} CharSequence will return {@code -1}.
     * A negative start position returns {@code -1}.
     * An empty ("") search CharSequence always matches unless the start position is negative.
     * A start position greater than the string length searches the whole string.</p>
     *
     * <pre>
     * StringUtils.lastIndexOfIgnoreCase(null, *)          = -1
     * StringUtils.lastIndexOfIgnoreCase(*, null)          = -1
     * StringUtils.lastIndexOfIgnoreCase("aabaabaa", "A")  = 7
     * StringUtils.lastIndexOfIgnoreCase("aabaabaa", "B")  = 5
     * StringUtils.lastIndexOfIgnoreCase("aabaabaa", "AB") = 4
     * </pre>
     *
     * @param str  the CharSequence to check, may be null
     * @param searchStr  the CharSequence to find, may be null
     * @return the first index of the search CharSequence,
     *  -1 if no match or {@code null} string input
     * @since 2.5
     * @since 3.0 Changed signature from lastIndexOfIgnoreCase(String, String) to lastIndexOfIgnoreCase(CharSequence, CharSequence)
     */
    public static int lastIndexOfIgnoreCase(final CharSequence str, final CharSequence searchStr) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(5913);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(5914);if ((((str == null || searchStr == null)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(5915)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(5916)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(5917);return INDEX_NOT_FOUND;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(5918);return lastIndexOfIgnoreCase(str, searchStr, str.length());
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>Case in-sensitive find of the last index within a CharSequence
     * from the specified position.</p>
     *
     * <p>A {@code null} CharSequence will return {@code -1}.
     * A negative start position returns {@code -1}.
     * An empty ("") search CharSequence always matches unless the start position is negative.
     * A start position greater than the string length searches the whole string.</p>
     *
     * <pre>
     * StringUtils.lastIndexOfIgnoreCase(null, *, *)          = -1
     * StringUtils.lastIndexOfIgnoreCase(*, null, *)          = -1
     * StringUtils.lastIndexOfIgnoreCase("aabaabaa", "A", 8)  = 7
     * StringUtils.lastIndexOfIgnoreCase("aabaabaa", "B", 8)  = 5
     * StringUtils.lastIndexOfIgnoreCase("aabaabaa", "AB", 8) = 4
     * StringUtils.lastIndexOfIgnoreCase("aabaabaa", "B", 9)  = 5
     * StringUtils.lastIndexOfIgnoreCase("aabaabaa", "B", -1) = -1
     * StringUtils.lastIndexOfIgnoreCase("aabaabaa", "A", 0)  = 0
     * StringUtils.lastIndexOfIgnoreCase("aabaabaa", "B", 0)  = -1
     * </pre>
     *
     * @param str  the CharSequence to check, may be null
     * @param searchStr  the CharSequence to find, may be null
     * @param startPos  the start position
     * @return the first index of the search CharSequence,
     *  -1 if no match or {@code null} input
     * @since 2.5
     * @since 3.0 Changed signature from lastIndexOfIgnoreCase(String, String, int) to lastIndexOfIgnoreCase(CharSequence, CharSequence, int)
     */
    public static int lastIndexOfIgnoreCase(final CharSequence str, final CharSequence searchStr, int startPos) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(5919);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(5920);if ((((str == null || searchStr == null)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(5921)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(5922)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(5923);return INDEX_NOT_FOUND;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(5924);if ((((startPos > str.length() - searchStr.length())&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(5925)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(5926)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(5927);startPos = str.length() - searchStr.length();
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(5928);if ((((startPos < 0)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(5929)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(5930)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(5931);return INDEX_NOT_FOUND;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(5932);if ((((searchStr.length() == 0)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(5933)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(5934)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(5935);return startPos;
        }

        }__CLR4_1_24d04d0l3lqxs2i.R.inc(5936);for (int i = startPos; (((i >= 0)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(5937)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(5938)==0&false)); i--) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(5939);if ((((CharSequenceUtils.regionMatches(str, true, i, searchStr, 0, searchStr.length()))&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(5940)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(5941)==0&false))) {{
                __CLR4_1_24d04d0l3lqxs2i.R.inc(5942);return i;
            }
        }}
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(5943);return INDEX_NOT_FOUND;
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    // Contains
    //-----------------------------------------------------------------------
    /**
     * <p>Checks if CharSequence contains a search character, handling {@code null}.
     * This method uses {@link String#indexOf(int)} if possible.</p>
     *
     * <p>A {@code null} or empty ("") CharSequence will return {@code false}.</p>
     *
     * <pre>
     * StringUtils.contains(null, *)    = false
     * StringUtils.contains("", *)      = false
     * StringUtils.contains("abc", 'a') = true
     * StringUtils.contains("abc", 'z') = false
     * </pre>
     *
     * @param seq  the CharSequence to check, may be null
     * @param searchChar  the character to find
     * @return true if the CharSequence contains the search character,
     *  false if not or {@code null} string input
     * @since 2.0
     * @since 3.0 Changed signature from contains(String, int) to contains(CharSequence, int)
     */
    public static boolean contains(final CharSequence seq, final int searchChar) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(5944);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(5945);if ((((isEmpty(seq))&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(5946)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(5947)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(5948);return false;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(5949);return CharSequenceUtils.indexOf(seq, searchChar, 0) >= 0;
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>Checks if CharSequence contains a search CharSequence, handling {@code null}.
     * This method uses {@link String#indexOf(String)} if possible.</p>
     *
     * <p>A {@code null} CharSequence will return {@code false}.</p>
     *
     * <pre>
     * StringUtils.contains(null, *)     = false
     * StringUtils.contains(*, null)     = false
     * StringUtils.contains("", "")      = true
     * StringUtils.contains("abc", "")   = true
     * StringUtils.contains("abc", "a")  = true
     * StringUtils.contains("abc", "z")  = false
     * </pre>
     *
     * @param seq  the CharSequence to check, may be null
     * @param searchSeq  the CharSequence to find, may be null
     * @return true if the CharSequence contains the search CharSequence,
     *  false if not or {@code null} string input
     * @since 2.0
     * @since 3.0 Changed signature from contains(String, String) to contains(CharSequence, CharSequence)
     */
    public static boolean contains(final CharSequence seq, final CharSequence searchSeq) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(5950);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(5951);if ((((seq == null || searchSeq == null)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(5952)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(5953)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(5954);return false;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(5955);return CharSequenceUtils.indexOf(seq, searchSeq, 0) >= 0;
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>Checks if CharSequence contains a search CharSequence irrespective of case,
     * handling {@code null}. Case-insensitivity is defined as by
     * {@link String#equalsIgnoreCase(String)}.
     *
     * <p>A {@code null} CharSequence will return {@code false}.</p>
     *
     * <pre>
     * StringUtils.contains(null, *) = false
     * StringUtils.contains(*, null) = false
     * StringUtils.contains("", "") = true
     * StringUtils.contains("abc", "") = true
     * StringUtils.contains("abc", "a") = true
     * StringUtils.contains("abc", "z") = false
     * StringUtils.contains("abc", "A") = true
     * StringUtils.contains("abc", "Z") = false
     * </pre>
     *
     * @param str  the CharSequence to check, may be null
     * @param searchStr  the CharSequence to find, may be null
     * @return true if the CharSequence contains the search CharSequence irrespective of
     * case or false if not or {@code null} string input
     * @since 3.0 Changed signature from containsIgnoreCase(String, String) to containsIgnoreCase(CharSequence, CharSequence)
     */
    public static boolean containsIgnoreCase(final CharSequence str, final CharSequence searchStr) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(5956);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(5957);if ((((str == null || searchStr == null)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(5958)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(5959)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(5960);return false;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(5961);final int len = searchStr.length();
        __CLR4_1_24d04d0l3lqxs2i.R.inc(5962);final int max = str.length() - len;
        __CLR4_1_24d04d0l3lqxs2i.R.inc(5963);for (int i = 0; (((i <= max)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(5964)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(5965)==0&false)); i++) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(5966);if ((((CharSequenceUtils.regionMatches(str, true, i, searchStr, 0, len))&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(5967)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(5968)==0&false))) {{
                __CLR4_1_24d04d0l3lqxs2i.R.inc(5969);return true;
            }
        }}
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(5970);return false;
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * Check whether the given CharSequence contains any whitespace characters.
     * @param seq the CharSequence to check (may be {@code null})
     * @return {@code true} if the CharSequence is not empty and
     * contains at least 1 whitespace character
     * @see java.lang.Character#isWhitespace
     * @since 3.0
     */
    // From org.springframework.util.StringUtils, under Apache License 2.0
    public static boolean containsWhitespace(final CharSequence seq) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(5971);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(5972);if ((((isEmpty(seq))&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(5973)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(5974)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(5975);return false;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(5976);final int strLen = seq.length();
        __CLR4_1_24d04d0l3lqxs2i.R.inc(5977);for (int i = 0; (((i < strLen)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(5978)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(5979)==0&false)); i++) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(5980);if ((((Character.isWhitespace(seq.charAt(i)))&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(5981)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(5982)==0&false))) {{
                __CLR4_1_24d04d0l3lqxs2i.R.inc(5983);return true;
            }
        }}
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(5984);return false;
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    // IndexOfAny chars
    //-----------------------------------------------------------------------
    /**
     * <p>Search a CharSequence to find the first index of any
     * character in the given set of characters.</p>
     *
     * <p>A {@code null} String will return {@code -1}.
     * A {@code null} or zero length search array will return {@code -1}.</p>
     *
     * <pre>
     * StringUtils.indexOfAny(null, *)                = -1
     * StringUtils.indexOfAny("", *)                  = -1
     * StringUtils.indexOfAny(*, null)                = -1
     * StringUtils.indexOfAny(*, [])                  = -1
     * StringUtils.indexOfAny("zzabyycdxx",['z','a']) = 0
     * StringUtils.indexOfAny("zzabyycdxx",['b','y']) = 3
     * StringUtils.indexOfAny("aba", ['z'])           = -1
     * </pre>
     *
     * @param cs  the CharSequence to check, may be null
     * @param searchChars  the chars to search for, may be null
     * @return the index of any of the chars, -1 if no match or null input
     * @since 2.0
     * @since 3.0 Changed signature from indexOfAny(String, char[]) to indexOfAny(CharSequence, char...)
     */
    public static int indexOfAny(final CharSequence cs, final char... searchChars) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(5985);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(5986);if ((((isEmpty(cs) || ArrayUtils.isEmpty(searchChars))&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(5987)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(5988)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(5989);return INDEX_NOT_FOUND;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(5990);final int csLen = cs.length();
        __CLR4_1_24d04d0l3lqxs2i.R.inc(5991);final int csLast = csLen - 1;
        __CLR4_1_24d04d0l3lqxs2i.R.inc(5992);final int searchLen = searchChars.length;
        __CLR4_1_24d04d0l3lqxs2i.R.inc(5993);final int searchLast = searchLen - 1;
        __CLR4_1_24d04d0l3lqxs2i.R.inc(5994);for (int i = 0; (((i < csLen)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(5995)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(5996)==0&false)); i++) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(5997);final char ch = cs.charAt(i);
            __CLR4_1_24d04d0l3lqxs2i.R.inc(5998);for (int j = 0; (((j < searchLen)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(5999)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6000)==0&false)); j++) {{
                __CLR4_1_24d04d0l3lqxs2i.R.inc(6001);if ((((searchChars[j] == ch)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6002)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6003)==0&false))) {{
                    __CLR4_1_24d04d0l3lqxs2i.R.inc(6004);if ((((i < csLast && j < searchLast && Character.isHighSurrogate(ch))&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6005)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6006)==0&false))) {{
                        // ch is a supplementary character
                        __CLR4_1_24d04d0l3lqxs2i.R.inc(6007);if ((((searchChars[j + 1] == cs.charAt(i + 1))&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6008)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6009)==0&false))) {{
                            __CLR4_1_24d04d0l3lqxs2i.R.inc(6010);return i;
                        }
                    }} }else {{
                        __CLR4_1_24d04d0l3lqxs2i.R.inc(6011);return i;
                    }
                }}
            }}
        }}
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6012);return INDEX_NOT_FOUND;
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>Search a CharSequence to find the first index of any
     * character in the given set of characters.</p>
     *
     * <p>A {@code null} String will return {@code -1}.
     * A {@code null} search string will return {@code -1}.</p>
     *
     * <pre>
     * StringUtils.indexOfAny(null, *)            = -1
     * StringUtils.indexOfAny("", *)              = -1
     * StringUtils.indexOfAny(*, null)            = -1
     * StringUtils.indexOfAny(*, "")              = -1
     * StringUtils.indexOfAny("zzabyycdxx", "za") = 0
     * StringUtils.indexOfAny("zzabyycdxx", "by") = 3
     * StringUtils.indexOfAny("aba","z")          = -1
     * </pre>
     *
     * @param cs  the CharSequence to check, may be null
     * @param searchChars  the chars to search for, may be null
     * @return the index of any of the chars, -1 if no match or null input
     * @since 2.0
     * @since 3.0 Changed signature from indexOfAny(String, String) to indexOfAny(CharSequence, String)
     */
    public static int indexOfAny(final CharSequence cs, final String searchChars) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(6013);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6014);if ((((isEmpty(cs) || isEmpty(searchChars))&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6015)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6016)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6017);return INDEX_NOT_FOUND;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6018);return indexOfAny(cs, searchChars.toCharArray());
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    // ContainsAny
    //-----------------------------------------------------------------------
    /**
     * <p>Checks if the CharSequence contains any character in the given
     * set of characters.</p>
     *
     * <p>A {@code null} CharSequence will return {@code false}.
     * A {@code null} or zero length search array will return {@code false}.</p>
     *
     * <pre>
     * StringUtils.containsAny(null, *)                = false
     * StringUtils.containsAny("", *)                  = false
     * StringUtils.containsAny(*, null)                = false
     * StringUtils.containsAny(*, [])                  = false
     * StringUtils.containsAny("zzabyycdxx",['z','a']) = true
     * StringUtils.containsAny("zzabyycdxx",['b','y']) = true
     * StringUtils.containsAny("aba", ['z'])           = false
     * </pre>
     *
     * @param cs  the CharSequence to check, may be null
     * @param searchChars  the chars to search for, may be null
     * @return the {@code true} if any of the chars are found,
     * {@code false} if no match or null input
     * @since 2.4
     * @since 3.0 Changed signature from containsAny(String, char[]) to containsAny(CharSequence, char...)
     */
    public static boolean containsAny(final CharSequence cs, final char... searchChars) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(6019);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6020);if ((((isEmpty(cs) || ArrayUtils.isEmpty(searchChars))&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6021)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6022)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6023);return false;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6024);final int csLength = cs.length();
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6025);final int searchLength = searchChars.length;
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6026);final int csLast = csLength - 1;
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6027);final int searchLast = searchLength - 1;
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6028);for (int i = 0; (((i < csLength)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6029)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6030)==0&false)); i++) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6031);final char ch = cs.charAt(i);
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6032);for (int j = 0; (((j < searchLength)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6033)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6034)==0&false)); j++) {{
                __CLR4_1_24d04d0l3lqxs2i.R.inc(6035);if ((((searchChars[j] == ch)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6036)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6037)==0&false))) {{
                    __CLR4_1_24d04d0l3lqxs2i.R.inc(6038);if ((((Character.isHighSurrogate(ch))&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6039)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6040)==0&false))) {{
                        __CLR4_1_24d04d0l3lqxs2i.R.inc(6041);if ((((j == searchLast)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6042)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6043)==0&false))) {{
                            // missing low surrogate, fine, like String.indexOf(String)
                            __CLR4_1_24d04d0l3lqxs2i.R.inc(6044);return true;
                        }
                        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6045);if ((((i < csLast && searchChars[j + 1] == cs.charAt(i + 1))&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6046)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6047)==0&false))) {{
                            __CLR4_1_24d04d0l3lqxs2i.R.inc(6048);return true;
                        }
                    }} }else {{
                        // ch is in the Basic Multilingual Plane
                        __CLR4_1_24d04d0l3lqxs2i.R.inc(6049);return true;
                    }
                }}
            }}
        }}
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6050);return false;
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>
     * Checks if the CharSequence contains any character in the given set of characters.
     * </p>
     *
     * <p>
     * A {@code null} CharSequence will return {@code false}. A {@code null} search CharSequence will return
     * {@code false}.
     * </p>
     *
     * <pre>
     * StringUtils.containsAny(null, *)            = false
     * StringUtils.containsAny("", *)              = false
     * StringUtils.containsAny(*, null)            = false
     * StringUtils.containsAny(*, "")              = false
     * StringUtils.containsAny("zzabyycdxx", "za") = true
     * StringUtils.containsAny("zzabyycdxx", "by") = true
     * StringUtils.containsAny("aba","z")          = false
     * </pre>
     *
     * @param cs
     *            the CharSequence to check, may be null
     * @param searchChars
     *            the chars to search for, may be null
     * @return the {@code true} if any of the chars are found, {@code false} if no match or null input
     * @since 2.4
     * @since 3.0 Changed signature from containsAny(String, String) to containsAny(CharSequence, CharSequence)
     */
    public static boolean containsAny(final CharSequence cs, final CharSequence searchChars) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(6051);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6052);if ((((searchChars == null)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6053)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6054)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6055);return false;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6056);return containsAny(cs, CharSequenceUtils.toCharArray(searchChars));
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    // IndexOfAnyBut chars
    //-----------------------------------------------------------------------
    /**
     * <p>Searches a CharSequence to find the first index of any
     * character not in the given set of characters.</p>
     *
     * <p>A {@code null} CharSequence will return {@code -1}.
     * A {@code null} or zero length search array will return {@code -1}.</p>
     *
     * <pre>
     * StringUtils.indexOfAnyBut(null, *)                              = -1
     * StringUtils.indexOfAnyBut("", *)                                = -1
     * StringUtils.indexOfAnyBut(*, null)                              = -1
     * StringUtils.indexOfAnyBut(*, [])                                = -1
     * StringUtils.indexOfAnyBut("zzabyycdxx", new char[] {'z', 'a'} ) = 3
     * StringUtils.indexOfAnyBut("aba", new char[] {'z'} )             = 0
     * StringUtils.indexOfAnyBut("aba", new char[] {'a', 'b'} )        = -1

     * </pre>
     *
     * @param cs  the CharSequence to check, may be null
     * @param searchChars  the chars to search for, may be null
     * @return the index of any of the chars, -1 if no match or null input
     * @since 2.0
     * @since 3.0 Changed signature from indexOfAnyBut(String, char[]) to indexOfAnyBut(CharSequence, char...)
     */
    public static int indexOfAnyBut(final CharSequence cs, final char... searchChars) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(6057);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6058);if ((((isEmpty(cs) || ArrayUtils.isEmpty(searchChars))&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6059)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6060)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6061);return INDEX_NOT_FOUND;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6062);final int csLen = cs.length();
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6063);final int csLast = csLen - 1;
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6064);final int searchLen = searchChars.length;
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6065);final int searchLast = searchLen - 1;
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6066);outer:
        for (int i = 0; (((i < csLen)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6067)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6068)==0&false)); i++) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6069);final char ch = cs.charAt(i);
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6070);for (int j = 0; (((j < searchLen)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6071)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6072)==0&false)); j++) {{
                __CLR4_1_24d04d0l3lqxs2i.R.inc(6073);if ((((searchChars[j] == ch)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6074)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6075)==0&false))) {{
                    __CLR4_1_24d04d0l3lqxs2i.R.inc(6076);if ((((i < csLast && j < searchLast && Character.isHighSurrogate(ch))&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6077)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6078)==0&false))) {{
                        __CLR4_1_24d04d0l3lqxs2i.R.inc(6079);if ((((searchChars[j + 1] == cs.charAt(i + 1))&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6080)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6081)==0&false))) {{
                            __CLR4_1_24d04d0l3lqxs2i.R.inc(6082);continue outer;
                        }
                    }} }else {{
                        __CLR4_1_24d04d0l3lqxs2i.R.inc(6083);continue outer;
                    }
                }}
            }}
            }__CLR4_1_24d04d0l3lqxs2i.R.inc(6084);return i;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6085);return INDEX_NOT_FOUND;
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>Search a CharSequence to find the first index of any
     * character not in the given set of characters.</p>
     *
     * <p>A {@code null} CharSequence will return {@code -1}.
     * A {@code null} or empty search string will return {@code -1}.</p>
     *
     * <pre>
     * StringUtils.indexOfAnyBut(null, *)            = -1
     * StringUtils.indexOfAnyBut("", *)              = -1
     * StringUtils.indexOfAnyBut(*, null)            = -1
     * StringUtils.indexOfAnyBut(*, "")              = -1
     * StringUtils.indexOfAnyBut("zzabyycdxx", "za") = 3
     * StringUtils.indexOfAnyBut("zzabyycdxx", "")   = -1
     * StringUtils.indexOfAnyBut("aba","ab")         = -1
     * </pre>
     *
     * @param seq  the CharSequence to check, may be null
     * @param searchChars  the chars to search for, may be null
     * @return the index of any of the chars, -1 if no match or null input
     * @since 2.0
     * @since 3.0 Changed signature from indexOfAnyBut(String, String) to indexOfAnyBut(CharSequence, CharSequence)
     */
    public static int indexOfAnyBut(final CharSequence seq, final CharSequence searchChars) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(6086);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6087);if ((((isEmpty(seq) || isEmpty(searchChars))&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6088)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6089)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6090);return INDEX_NOT_FOUND;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6091);final int strLen = seq.length();
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6092);for (int i = 0; (((i < strLen)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6093)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6094)==0&false)); i++) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6095);final char ch = seq.charAt(i);
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6096);final boolean chFound = CharSequenceUtils.indexOf(searchChars, ch, 0) >= 0;
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6097);if ((((i + 1 < strLen && Character.isHighSurrogate(ch))&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6098)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6099)==0&false))) {{
                __CLR4_1_24d04d0l3lqxs2i.R.inc(6100);final char ch2 = seq.charAt(i + 1);
                __CLR4_1_24d04d0l3lqxs2i.R.inc(6101);if ((((chFound && CharSequenceUtils.indexOf(searchChars, ch2, 0) < 0)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6102)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6103)==0&false))) {{
                    __CLR4_1_24d04d0l3lqxs2i.R.inc(6104);return i;
                }
            }} }else {{
                __CLR4_1_24d04d0l3lqxs2i.R.inc(6105);if ((((!chFound)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6106)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6107)==0&false))) {{
                    __CLR4_1_24d04d0l3lqxs2i.R.inc(6108);return i;
                }
            }}
        }}
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6109);return INDEX_NOT_FOUND;
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    // ContainsOnly
    //-----------------------------------------------------------------------
    /**
     * <p>Checks if the CharSequence contains only certain characters.</p>
     *
     * <p>A {@code null} CharSequence will return {@code false}.
     * A {@code null} valid character array will return {@code false}.
     * An empty CharSequence (length()=0) always returns {@code true}.</p>
     *
     * <pre>
     * StringUtils.containsOnly(null, *)       = false
     * StringUtils.containsOnly(*, null)       = false
     * StringUtils.containsOnly("", *)         = true
     * StringUtils.containsOnly("ab", '')      = false
     * StringUtils.containsOnly("abab", 'abc') = true
     * StringUtils.containsOnly("ab1", 'abc')  = false
     * StringUtils.containsOnly("abz", 'abc')  = false
     * </pre>
     *
     * @param cs  the String to check, may be null
     * @param valid  an array of valid chars, may be null
     * @return true if it only contains valid chars and is non-null
     * @since 3.0 Changed signature from containsOnly(String, char[]) to containsOnly(CharSequence, char...)
     */
    public static boolean containsOnly(final CharSequence cs, final char... valid) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(6110);
        // All these pre-checks are to maintain API with an older version
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6111);if ((((valid == null || cs == null)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6112)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6113)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6114);return false;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6115);if ((((cs.length() == 0)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6116)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6117)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6118);return true;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6119);if ((((valid.length == 0)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6120)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6121)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6122);return false;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6123);return indexOfAnyBut(cs, valid) == INDEX_NOT_FOUND;
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>Checks if the CharSequence contains only certain characters.</p>
     *
     * <p>A {@code null} CharSequence will return {@code false}.
     * A {@code null} valid character String will return {@code false}.
     * An empty String (length()=0) always returns {@code true}.</p>
     *
     * <pre>
     * StringUtils.containsOnly(null, *)       = false
     * StringUtils.containsOnly(*, null)       = false
     * StringUtils.containsOnly("", *)         = true
     * StringUtils.containsOnly("ab", "")      = false
     * StringUtils.containsOnly("abab", "abc") = true
     * StringUtils.containsOnly("ab1", "abc")  = false
     * StringUtils.containsOnly("abz", "abc")  = false
     * </pre>
     *
     * @param cs  the CharSequence to check, may be null
     * @param validChars  a String of valid chars, may be null
     * @return true if it only contains valid chars and is non-null
     * @since 2.0
     * @since 3.0 Changed signature from containsOnly(String, String) to containsOnly(CharSequence, String)
     */
    public static boolean containsOnly(final CharSequence cs, final String validChars) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(6124);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6125);if ((((cs == null || validChars == null)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6126)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6127)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6128);return false;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6129);return containsOnly(cs, validChars.toCharArray());
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    // ContainsNone
    //-----------------------------------------------------------------------
    /**
     * <p>Checks that the CharSequence does not contain certain characters.</p>
     *
     * <p>A {@code null} CharSequence will return {@code true}.
     * A {@code null} invalid character array will return {@code true}.
     * An empty CharSequence (length()=0) always returns true.</p>
     *
     * <pre>
     * StringUtils.containsNone(null, *)       = true
     * StringUtils.containsNone(*, null)       = true
     * StringUtils.containsNone("", *)         = true
     * StringUtils.containsNone("ab", '')      = true
     * StringUtils.containsNone("abab", 'xyz') = true
     * StringUtils.containsNone("ab1", 'xyz')  = true
     * StringUtils.containsNone("abz", 'xyz')  = false
     * </pre>
     *
     * @param cs  the CharSequence to check, may be null
     * @param searchChars  an array of invalid chars, may be null
     * @return true if it contains none of the invalid chars, or is null
     * @since 2.0
     * @since 3.0 Changed signature from containsNone(String, char[]) to containsNone(CharSequence, char...)
     */
    public static boolean containsNone(final CharSequence cs, final char... searchChars) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(6130);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6131);if ((((cs == null || searchChars == null)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6132)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6133)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6134);return true;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6135);final int csLen = cs.length();
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6136);final int csLast = csLen - 1;
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6137);final int searchLen = searchChars.length;
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6138);final int searchLast = searchLen - 1;
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6139);for (int i = 0; (((i < csLen)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6140)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6141)==0&false)); i++) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6142);final char ch = cs.charAt(i);
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6143);for (int j = 0; (((j < searchLen)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6144)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6145)==0&false)); j++) {{
                __CLR4_1_24d04d0l3lqxs2i.R.inc(6146);if ((((searchChars[j] == ch)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6147)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6148)==0&false))) {{
                    __CLR4_1_24d04d0l3lqxs2i.R.inc(6149);if ((((Character.isHighSurrogate(ch))&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6150)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6151)==0&false))) {{
                        __CLR4_1_24d04d0l3lqxs2i.R.inc(6152);if ((((j == searchLast)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6153)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6154)==0&false))) {{
                            // missing low surrogate, fine, like String.indexOf(String)
                            __CLR4_1_24d04d0l3lqxs2i.R.inc(6155);return false;
                        }
                        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6156);if ((((i < csLast && searchChars[j + 1] == cs.charAt(i + 1))&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6157)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6158)==0&false))) {{
                            __CLR4_1_24d04d0l3lqxs2i.R.inc(6159);return false;
                        }
                    }} }else {{
                        // ch is in the Basic Multilingual Plane
                        __CLR4_1_24d04d0l3lqxs2i.R.inc(6160);return false;
                    }
                }}
            }}
        }}
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6161);return true;
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>Checks that the CharSequence does not contain certain characters.</p>
     *
     * <p>A {@code null} CharSequence will return {@code true}.
     * A {@code null} invalid character array will return {@code true}.
     * An empty String ("") always returns true.</p>
     *
     * <pre>
     * StringUtils.containsNone(null, *)       = true
     * StringUtils.containsNone(*, null)       = true
     * StringUtils.containsNone("", *)         = true
     * StringUtils.containsNone("ab", "")      = true
     * StringUtils.containsNone("abab", "xyz") = true
     * StringUtils.containsNone("ab1", "xyz")  = true
     * StringUtils.containsNone("abz", "xyz")  = false
     * </pre>
     *
     * @param cs  the CharSequence to check, may be null
     * @param invalidChars  a String of invalid chars, may be null
     * @return true if it contains none of the invalid chars, or is null
     * @since 2.0
     * @since 3.0 Changed signature from containsNone(String, String) to containsNone(CharSequence, String)
     */
    public static boolean containsNone(final CharSequence cs, final String invalidChars) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(6162);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6163);if ((((cs == null || invalidChars == null)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6164)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6165)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6166);return true;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6167);return containsNone(cs, invalidChars.toCharArray());
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    // IndexOfAny strings
    //-----------------------------------------------------------------------
    /**
     * <p>Find the first index of any of a set of potential substrings.</p>
     *
     * <p>A {@code null} CharSequence will return {@code -1}.
     * A {@code null} or zero length search array will return {@code -1}.
     * A {@code null} search array entry will be ignored, but a search
     * array containing "" will return {@code 0} if {@code str} is not
     * null. This method uses {@link String#indexOf(String)} if possible.</p>
     *
     * <pre>
     * StringUtils.indexOfAny(null, *)                     = -1
     * StringUtils.indexOfAny(*, null)                     = -1
     * StringUtils.indexOfAny(*, [])                       = -1
     * StringUtils.indexOfAny("zzabyycdxx", ["ab","cd"])   = 2
     * StringUtils.indexOfAny("zzabyycdxx", ["cd","ab"])   = 2
     * StringUtils.indexOfAny("zzabyycdxx", ["mn","op"])   = -1
     * StringUtils.indexOfAny("zzabyycdxx", ["zab","aby"]) = 1
     * StringUtils.indexOfAny("zzabyycdxx", [""])          = 0
     * StringUtils.indexOfAny("", [""])                    = 0
     * StringUtils.indexOfAny("", ["a"])                   = -1
     * </pre>
     *
     * @param str  the CharSequence to check, may be null
     * @param searchStrs  the CharSequences to search for, may be null
     * @return the first index of any of the searchStrs in str, -1 if no match
     * @since 3.0 Changed signature from indexOfAny(String, String[]) to indexOfAny(CharSequence, CharSequence...)
     */
    public static int indexOfAny(final CharSequence str, final CharSequence... searchStrs) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(6168);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6169);if ((((str == null || searchStrs == null)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6170)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6171)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6172);return INDEX_NOT_FOUND;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6173);final int sz = searchStrs.length;

        // String's can't have a MAX_VALUEth index.
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6174);int ret = Integer.MAX_VALUE;

        __CLR4_1_24d04d0l3lqxs2i.R.inc(6175);int tmp = 0;
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6176);for (int i = 0; (((i < sz)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6177)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6178)==0&false)); i++) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6179);final CharSequence search = searchStrs[i];
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6180);if ((((search == null)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6181)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6182)==0&false))) {{
                __CLR4_1_24d04d0l3lqxs2i.R.inc(6183);continue;
            }
            }__CLR4_1_24d04d0l3lqxs2i.R.inc(6184);tmp = CharSequenceUtils.indexOf(str, search, 0);
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6185);if ((((tmp == INDEX_NOT_FOUND)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6186)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6187)==0&false))) {{
                __CLR4_1_24d04d0l3lqxs2i.R.inc(6188);continue;
            }

            }__CLR4_1_24d04d0l3lqxs2i.R.inc(6189);if ((((tmp < ret)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6190)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6191)==0&false))) {{
                __CLR4_1_24d04d0l3lqxs2i.R.inc(6192);ret = tmp;
            }
        }}

        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6193);return (((ret == Integer.MAX_VALUE )&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6194)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6195)==0&false))? INDEX_NOT_FOUND : ret;
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>Find the latest index of any of a set of potential substrings.</p>
     *
     * <p>A {@code null} CharSequence will return {@code -1}.
     * A {@code null} search array will return {@code -1}.
     * A {@code null} or zero length search array entry will be ignored,
     * but a search array containing "" will return the length of {@code str}
     * if {@code str} is not null. This method uses {@link String#indexOf(String)} if possible</p>
     *
     * <pre>
     * StringUtils.lastIndexOfAny(null, *)                   = -1
     * StringUtils.lastIndexOfAny(*, null)                   = -1
     * StringUtils.lastIndexOfAny(*, [])                     = -1
     * StringUtils.lastIndexOfAny(*, [null])                 = -1
     * StringUtils.lastIndexOfAny("zzabyycdxx", ["ab","cd"]) = 6
     * StringUtils.lastIndexOfAny("zzabyycdxx", ["cd","ab"]) = 6
     * StringUtils.lastIndexOfAny("zzabyycdxx", ["mn","op"]) = -1
     * StringUtils.lastIndexOfAny("zzabyycdxx", ["mn","op"]) = -1
     * StringUtils.lastIndexOfAny("zzabyycdxx", ["mn",""])   = 10
     * </pre>
     *
     * @param str  the CharSequence to check, may be null
     * @param searchStrs  the CharSequences to search for, may be null
     * @return the last index of any of the CharSequences, -1 if no match
     * @since 3.0 Changed signature from lastIndexOfAny(String, String[]) to lastIndexOfAny(CharSequence, CharSequence)
     */
    public static int lastIndexOfAny(final CharSequence str, final CharSequence... searchStrs) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(6196);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6197);if ((((str == null || searchStrs == null)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6198)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6199)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6200);return INDEX_NOT_FOUND;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6201);final int sz = searchStrs.length;
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6202);int ret = INDEX_NOT_FOUND;
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6203);int tmp = 0;
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6204);for (int i = 0; (((i < sz)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6205)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6206)==0&false)); i++) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6207);final CharSequence search = searchStrs[i];
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6208);if ((((search == null)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6209)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6210)==0&false))) {{
                __CLR4_1_24d04d0l3lqxs2i.R.inc(6211);continue;
            }
            }__CLR4_1_24d04d0l3lqxs2i.R.inc(6212);tmp = CharSequenceUtils.lastIndexOf(str, search, str.length());
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6213);if ((((tmp > ret)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6214)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6215)==0&false))) {{
                __CLR4_1_24d04d0l3lqxs2i.R.inc(6216);ret = tmp;
            }
        }}
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6217);return ret;
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    // Substring
    //-----------------------------------------------------------------------
    /**
     * <p>Gets a substring from the specified String avoiding exceptions.</p>
     *
     * <p>A negative start position can be used to start {@code n}
     * characters from the end of the String.</p>
     *
     * <p>A {@code null} String will return {@code null}.
     * An empty ("") String will return "".</p>
     *
     * <pre>
     * StringUtils.substring(null, *)   = null
     * StringUtils.substring("", *)     = ""
     * StringUtils.substring("abc", 0)  = "abc"
     * StringUtils.substring("abc", 2)  = "c"
     * StringUtils.substring("abc", 4)  = ""
     * StringUtils.substring("abc", -2) = "bc"
     * StringUtils.substring("abc", -4) = "abc"
     * </pre>
     *
     * @param str  the String to get the substring from, may be null
     * @param start  the position to start from, negative means
     *  count back from the end of the String by this many characters
     * @return substring from start position, {@code null} if null String input
     */
    public static String substring(final String str, int start) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(6218);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6219);if ((((str == null)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6220)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6221)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6222);return null;
        }

        // handle negatives, which means last n characters
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6223);if ((((start < 0)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6224)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6225)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6226);start = str.length() + start; // remember start is negative
        }

        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6227);if ((((start < 0)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6228)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6229)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6230);start = 0;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6231);if ((((start > str.length())&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6232)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6233)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6234);return EMPTY;
        }

        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6235);return str.substring(start);
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>Gets a substring from the specified String avoiding exceptions.</p>
     *
     * <p>A negative start position can be used to start/end {@code n}
     * characters from the end of the String.</p>
     *
     * <p>The returned substring starts with the character in the {@code start}
     * position and ends before the {@code end} position. All position counting is
     * zero-based -- i.e., to start at the beginning of the string use
     * {@code start = 0}. Negative start and end positions can be used to
     * specify offsets relative to the end of the String.</p>
     *
     * <p>If {@code start} is not strictly to the left of {@code end}, ""
     * is returned.</p>
     *
     * <pre>
     * StringUtils.substring(null, *, *)    = null
     * StringUtils.substring("", * ,  *)    = "";
     * StringUtils.substring("abc", 0, 2)   = "ab"
     * StringUtils.substring("abc", 2, 0)   = ""
     * StringUtils.substring("abc", 2, 4)   = "c"
     * StringUtils.substring("abc", 4, 6)   = ""
     * StringUtils.substring("abc", 2, 2)   = ""
     * StringUtils.substring("abc", -2, -1) = "b"
     * StringUtils.substring("abc", -4, 2)  = "ab"
     * </pre>
     *
     * @param str  the String to get the substring from, may be null
     * @param start  the position to start from, negative means
     *  count back from the end of the String by this many characters
     * @param end  the position to end at (exclusive), negative means
     *  count back from the end of the String by this many characters
     * @return substring from start position to end position,
     *  {@code null} if null String input
     */
    public static String substring(final String str, int start, int end) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(6236);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6237);if ((((str == null)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6238)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6239)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6240);return null;
        }

        // handle negatives
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6241);if ((((end < 0)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6242)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6243)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6244);end = str.length() + end; // remember end is negative
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6245);if ((((start < 0)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6246)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6247)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6248);start = str.length() + start; // remember start is negative
        }

        // check length next
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6249);if ((((end > str.length())&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6250)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6251)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6252);end = str.length();
        }

        // if start is greater than end, return ""
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6253);if ((((start > end)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6254)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6255)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6256);return EMPTY;
        }

        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6257);if ((((start < 0)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6258)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6259)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6260);start = 0;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6261);if ((((end < 0)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6262)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6263)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6264);end = 0;
        }

        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6265);return str.substring(start, end);
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    // Left/Right/Mid
    //-----------------------------------------------------------------------
    /**
     * <p>Gets the leftmost {@code len} characters of a String.</p>
     *
     * <p>If {@code len} characters are not available, or the
     * String is {@code null}, the String will be returned without
     * an exception. An empty String is returned if len is negative.</p>
     *
     * <pre>
     * StringUtils.left(null, *)    = null
     * StringUtils.left(*, -ve)     = ""
     * StringUtils.left("", *)      = ""
     * StringUtils.left("abc", 0)   = ""
     * StringUtils.left("abc", 2)   = "ab"
     * StringUtils.left("abc", 4)   = "abc"
     * </pre>
     *
     * @param str  the String to get the leftmost characters from, may be null
     * @param len  the length of the required String
     * @return the leftmost characters, {@code null} if null String input
     */
    public static String left(final String str, final int len) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(6266);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6267);if ((((str == null)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6268)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6269)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6270);return null;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6271);if ((((len < 0)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6272)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6273)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6274);return EMPTY;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6275);if ((((str.length() <= len)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6276)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6277)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6278);return str;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6279);return str.substring(0, len);
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>Gets the rightmost {@code len} characters of a String.</p>
     *
     * <p>If {@code len} characters are not available, or the String
     * is {@code null}, the String will be returned without an
     * an exception. An empty String is returned if len is negative.</p>
     *
     * <pre>
     * StringUtils.right(null, *)    = null
     * StringUtils.right(*, -ve)     = ""
     * StringUtils.right("", *)      = ""
     * StringUtils.right("abc", 0)   = ""
     * StringUtils.right("abc", 2)   = "bc"
     * StringUtils.right("abc", 4)   = "abc"
     * </pre>
     *
     * @param str  the String to get the rightmost characters from, may be null
     * @param len  the length of the required String
     * @return the rightmost characters, {@code null} if null String input
     */
    public static String right(final String str, final int len) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(6280);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6281);if ((((str == null)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6282)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6283)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6284);return null;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6285);if ((((len < 0)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6286)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6287)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6288);return EMPTY;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6289);if ((((str.length() <= len)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6290)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6291)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6292);return str;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6293);return str.substring(str.length() - len);
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>Gets {@code len} characters from the middle of a String.</p>
     *
     * <p>If {@code len} characters are not available, the remainder
     * of the String will be returned without an exception. If the
     * String is {@code null}, {@code null} will be returned.
     * An empty String is returned if len is negative or exceeds the
     * length of {@code str}.</p>
     *
     * <pre>
     * StringUtils.mid(null, *, *)    = null
     * StringUtils.mid(*, *, -ve)     = ""
     * StringUtils.mid("", 0, *)      = ""
     * StringUtils.mid("abc", 0, 2)   = "ab"
     * StringUtils.mid("abc", 0, 4)   = "abc"
     * StringUtils.mid("abc", 2, 4)   = "c"
     * StringUtils.mid("abc", 4, 2)   = ""
     * StringUtils.mid("abc", -2, 2)  = "ab"
     * </pre>
     *
     * @param str  the String to get the characters from, may be null
     * @param pos  the position to start from, negative treated as zero
     * @param len  the length of the required String
     * @return the middle characters, {@code null} if null String input
     */
    public static String mid(final String str, int pos, final int len) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(6294);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6295);if ((((str == null)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6296)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6297)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6298);return null;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6299);if ((((len < 0 || pos > str.length())&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6300)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6301)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6302);return EMPTY;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6303);if ((((pos < 0)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6304)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6305)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6306);pos = 0;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6307);if ((((str.length() <= pos + len)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6308)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6309)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6310);return str.substring(pos);
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6311);return str.substring(pos, pos + len);
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    // SubStringAfter/SubStringBefore
    //-----------------------------------------------------------------------
    /**
     * <p>Gets the substring before the first occurrence of a separator.
     * The separator is not returned.</p>
     *
     * <p>A {@code null} string input will return {@code null}.
     * An empty ("") string input will return the empty string.
     * A {@code null} separator will return the input string.</p>
     *
     * <p>If nothing is found, the string input is returned.</p>
     *
     * <pre>
     * StringUtils.substringBefore(null, *)      = null
     * StringUtils.substringBefore("", *)        = ""
     * StringUtils.substringBefore("abc", "a")   = ""
     * StringUtils.substringBefore("abcba", "b") = "a"
     * StringUtils.substringBefore("abc", "c")   = "ab"
     * StringUtils.substringBefore("abc", "d")   = "abc"
     * StringUtils.substringBefore("abc", "")    = ""
     * StringUtils.substringBefore("abc", null)  = "abc"
     * </pre>
     *
     * @param str  the String to get a substring from, may be null
     * @param separator  the String to search for, may be null
     * @return the substring before the first occurrence of the separator,
     *  {@code null} if null String input
     * @since 2.0
     */
    public static String substringBefore(final String str, final String separator) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(6312);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6313);if ((((isEmpty(str) || separator == null)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6314)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6315)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6316);return str;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6317);if ((((separator.length() == 0)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6318)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6319)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6320);return EMPTY;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6321);final int pos = str.indexOf(separator);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6322);if ((((pos == INDEX_NOT_FOUND)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6323)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6324)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6325);return str;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6326);return str.substring(0, pos);
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>Gets the substring after the first occurrence of a separator.
     * The separator is not returned.</p>
     *
     * <p>A {@code null} string input will return {@code null}.
     * An empty ("") string input will return the empty string.
     * A {@code null} separator will return the empty string if the
     * input string is not {@code null}.</p>
     *
     * <p>If nothing is found, the empty string is returned.</p>
     *
     * <pre>
     * StringUtils.substringAfter(null, *)      = null
     * StringUtils.substringAfter("", *)        = ""
     * StringUtils.substringAfter(*, null)      = ""
     * StringUtils.substringAfter("abc", "a")   = "bc"
     * StringUtils.substringAfter("abcba", "b") = "cba"
     * StringUtils.substringAfter("abc", "c")   = ""
     * StringUtils.substringAfter("abc", "d")   = ""
     * StringUtils.substringAfter("abc", "")    = "abc"
     * </pre>
     *
     * @param str  the String to get a substring from, may be null
     * @param separator  the String to search for, may be null
     * @return the substring after the first occurrence of the separator,
     *  {@code null} if null String input
     * @since 2.0
     */
    public static String substringAfter(final String str, final String separator) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(6327);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6328);if ((((isEmpty(str))&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6329)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6330)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6331);return str;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6332);if ((((separator == null)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6333)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6334)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6335);return EMPTY;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6336);final int pos = str.indexOf(separator);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6337);if ((((pos == INDEX_NOT_FOUND)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6338)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6339)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6340);return EMPTY;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6341);return str.substring(pos + separator.length());
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>Gets the substring before the last occurrence of a separator.
     * The separator is not returned.</p>
     *
     * <p>A {@code null} string input will return {@code null}.
     * An empty ("") string input will return the empty string.
     * An empty or {@code null} separator will return the input string.</p>
     *
     * <p>If nothing is found, the string input is returned.</p>
     *
     * <pre>
     * StringUtils.substringBeforeLast(null, *)      = null
     * StringUtils.substringBeforeLast("", *)        = ""
     * StringUtils.substringBeforeLast("abcba", "b") = "abc"
     * StringUtils.substringBeforeLast("abc", "c")   = "ab"
     * StringUtils.substringBeforeLast("a", "a")     = ""
     * StringUtils.substringBeforeLast("a", "z")     = "a"
     * StringUtils.substringBeforeLast("a", null)    = "a"
     * StringUtils.substringBeforeLast("a", "")      = "a"
     * </pre>
     *
     * @param str  the String to get a substring from, may be null
     * @param separator  the String to search for, may be null
     * @return the substring before the last occurrence of the separator,
     *  {@code null} if null String input
     * @since 2.0
     */
    public static String substringBeforeLast(final String str, final String separator) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(6342);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6343);if ((((isEmpty(str) || isEmpty(separator))&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6344)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6345)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6346);return str;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6347);final int pos = str.lastIndexOf(separator);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6348);if ((((pos == INDEX_NOT_FOUND)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6349)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6350)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6351);return str;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6352);return str.substring(0, pos);
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>Gets the substring after the last occurrence of a separator.
     * The separator is not returned.</p>
     *
     * <p>A {@code null} string input will return {@code null}.
     * An empty ("") string input will return the empty string.
     * An empty or {@code null} separator will return the empty string if
     * the input string is not {@code null}.</p>
     *
     * <p>If nothing is found, the empty string is returned.</p>
     *
     * <pre>
     * StringUtils.substringAfterLast(null, *)      = null
     * StringUtils.substringAfterLast("", *)        = ""
     * StringUtils.substringAfterLast(*, "")        = ""
     * StringUtils.substringAfterLast(*, null)      = ""
     * StringUtils.substringAfterLast("abc", "a")   = "bc"
     * StringUtils.substringAfterLast("abcba", "b") = "a"
     * StringUtils.substringAfterLast("abc", "c")   = ""
     * StringUtils.substringAfterLast("a", "a")     = ""
     * StringUtils.substringAfterLast("a", "z")     = ""
     * </pre>
     *
     * @param str  the String to get a substring from, may be null
     * @param separator  the String to search for, may be null
     * @return the substring after the last occurrence of the separator,
     *  {@code null} if null String input
     * @since 2.0
     */
    public static String substringAfterLast(final String str, final String separator) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(6353);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6354);if ((((isEmpty(str))&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6355)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6356)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6357);return str;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6358);if ((((isEmpty(separator))&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6359)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6360)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6361);return EMPTY;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6362);final int pos = str.lastIndexOf(separator);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6363);if ((((pos == INDEX_NOT_FOUND || pos == str.length() - separator.length())&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6364)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6365)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6366);return EMPTY;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6367);return str.substring(pos + separator.length());
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    // Substring between
    //-----------------------------------------------------------------------
    /**
     * <p>Gets the String that is nested in between two instances of the
     * same String.</p>
     *
     * <p>A {@code null} input String returns {@code null}.
     * A {@code null} tag returns {@code null}.</p>
     *
     * <pre>
     * StringUtils.substringBetween(null, *)            = null
     * StringUtils.substringBetween("", "")             = ""
     * StringUtils.substringBetween("", "tag")          = null
     * StringUtils.substringBetween("tagabctag", null)  = null
     * StringUtils.substringBetween("tagabctag", "")    = ""
     * StringUtils.substringBetween("tagabctag", "tag") = "abc"
     * </pre>
     *
     * @param str  the String containing the substring, may be null
     * @param tag  the String before and after the substring, may be null
     * @return the substring, {@code null} if no match
     * @since 2.0
     */
    public static String substringBetween(final String str, final String tag) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(6368);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6369);return substringBetween(str, tag, tag);
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>Gets the String that is nested in between two Strings.
     * Only the first match is returned.</p>
     *
     * <p>A {@code null} input String returns {@code null}.
     * A {@code null} open/close returns {@code null} (no match).
     * An empty ("") open and close returns an empty string.</p>
     *
     * <pre>
     * StringUtils.substringBetween("wx[b]yz", "[", "]") = "b"
     * StringUtils.substringBetween(null, *, *)          = null
     * StringUtils.substringBetween(*, null, *)          = null
     * StringUtils.substringBetween(*, *, null)          = null
     * StringUtils.substringBetween("", "", "")          = ""
     * StringUtils.substringBetween("", "", "]")         = null
     * StringUtils.substringBetween("", "[", "]")        = null
     * StringUtils.substringBetween("yabcz", "", "")     = ""
     * StringUtils.substringBetween("yabcz", "y", "z")   = "abc"
     * StringUtils.substringBetween("yabczyabcz", "y", "z")   = "abc"
     * </pre>
     *
     * @param str  the String containing the substring, may be null
     * @param open  the String before the substring, may be null
     * @param close  the String after the substring, may be null
     * @return the substring, {@code null} if no match
     * @since 2.0
     */
    public static String substringBetween(final String str, final String open, final String close) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(6370);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6371);if ((((str == null || open == null || close == null)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6372)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6373)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6374);return null;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6375);final int start = str.indexOf(open);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6376);if ((((start != INDEX_NOT_FOUND)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6377)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6378)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6379);final int end = str.indexOf(close, start + open.length());
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6380);if ((((end != INDEX_NOT_FOUND)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6381)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6382)==0&false))) {{
                __CLR4_1_24d04d0l3lqxs2i.R.inc(6383);return str.substring(start + open.length(), end);
            }
        }}
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6384);return null;
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>Searches a String for substrings delimited by a start and end tag,
     * returning all matching substrings in an array.</p>
     *
     * <p>A {@code null} input String returns {@code null}.
     * A {@code null} open/close returns {@code null} (no match).
     * An empty ("") open/close returns {@code null} (no match).</p>
     *
     * <pre>
     * StringUtils.substringsBetween("[a][b][c]", "[", "]") = ["a","b","c"]
     * StringUtils.substringsBetween(null, *, *)            = null
     * StringUtils.substringsBetween(*, null, *)            = null
     * StringUtils.substringsBetween(*, *, null)            = null
     * StringUtils.substringsBetween("", "[", "]")          = []
     * </pre>
     *
     * @param str  the String containing the substrings, null returns null, empty returns empty
     * @param open  the String identifying the start of the substring, empty returns null
     * @param close  the String identifying the end of the substring, empty returns null
     * @return a String Array of substrings, or {@code null} if no match
     * @since 2.3
     */
    public static String[] substringsBetween(final String str, final String open, final String close) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(6385);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6386);if ((((str == null || isEmpty(open) || isEmpty(close))&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6387)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6388)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6389);return null;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6390);final int strLen = str.length();
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6391);if ((((strLen == 0)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6392)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6393)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6394);return ArrayUtils.EMPTY_STRING_ARRAY;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6395);final int closeLen = close.length();
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6396);final int openLen = open.length();
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6397);final List<String> list = new ArrayList<String>();
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6398);int pos = 0;
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6399);while ((((pos < strLen - closeLen)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6400)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6401)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6402);int start = str.indexOf(open, pos);
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6403);if ((((start < 0)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6404)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6405)==0&false))) {{
                __CLR4_1_24d04d0l3lqxs2i.R.inc(6406);break;
            }
            }__CLR4_1_24d04d0l3lqxs2i.R.inc(6407);start += openLen;
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6408);final int end = str.indexOf(close, start);
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6409);if ((((end < 0)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6410)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6411)==0&false))) {{
                __CLR4_1_24d04d0l3lqxs2i.R.inc(6412);break;
            }
            }__CLR4_1_24d04d0l3lqxs2i.R.inc(6413);list.add(str.substring(start, end));
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6414);pos = end + closeLen;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6415);if ((((list.isEmpty())&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6416)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6417)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6418);return null;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6419);return list.toArray(new String [list.size()]);
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    // Nested extraction
    //-----------------------------------------------------------------------

    // Splitting
    //-----------------------------------------------------------------------
    /**
     * <p>Splits the provided text into an array, using whitespace as the
     * separator.
     * Whitespace is defined by {@link Character#isWhitespace(char)}.</p>
     *
     * <p>The separator is not included in the returned String array.
     * Adjacent separators are treated as one separator.
     * For more control over the split use the StrTokenizer class.</p>
     *
     * <p>A {@code null} input String returns {@code null}.</p>
     *
     * <pre>
     * StringUtils.split(null)       = null
     * StringUtils.split("")         = []
     * StringUtils.split("abc def")  = ["abc", "def"]
     * StringUtils.split("abc  def") = ["abc", "def"]
     * StringUtils.split(" abc ")    = ["abc"]
     * </pre>
     *
     * @param str  the String to parse, may be null
     * @return an array of parsed Strings, {@code null} if null String input
     */
    public static String[] split(final String str) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(6420);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6421);return split(str, null, -1);
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>Splits the provided text into an array, separator specified.
     * This is an alternative to using StringTokenizer.</p>
     *
     * <p>The separator is not included in the returned String array.
     * Adjacent separators are treated as one separator.
     * For more control over the split use the StrTokenizer class.</p>
     *
     * <p>A {@code null} input String returns {@code null}.</p>
     *
     * <pre>
     * StringUtils.split(null, *)         = null
     * StringUtils.split("", *)           = []
     * StringUtils.split("a.b.c", '.')    = ["a", "b", "c"]
     * StringUtils.split("a..b.c", '.')   = ["a", "b", "c"]
     * StringUtils.split("a:b:c", '.')    = ["a:b:c"]
     * StringUtils.split("a b c", ' ')    = ["a", "b", "c"]
     * </pre>
     *
     * @param str  the String to parse, may be null
     * @param separatorChar  the character used as the delimiter
     * @return an array of parsed Strings, {@code null} if null String input
     * @since 2.0
     */
    public static String[] split(final String str, final char separatorChar) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(6422);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6423);return splitWorker(str, separatorChar, false);
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>Splits the provided text into an array, separators specified.
     * This is an alternative to using StringTokenizer.</p>
     *
     * <p>The separator is not included in the returned String array.
     * Adjacent separators are treated as one separator.
     * For more control over the split use the StrTokenizer class.</p>
     *
     * <p>A {@code null} input String returns {@code null}.
     * A {@code null} separatorChars splits on whitespace.</p>
     *
     * <pre>
     * StringUtils.split(null, *)         = null
     * StringUtils.split("", *)           = []
     * StringUtils.split("abc def", null) = ["abc", "def"]
     * StringUtils.split("abc def", " ")  = ["abc", "def"]
     * StringUtils.split("abc  def", " ") = ["abc", "def"]
     * StringUtils.split("ab:cd:ef", ":") = ["ab", "cd", "ef"]
     * </pre>
     *
     * @param str  the String to parse, may be null
     * @param separatorChars  the characters used as the delimiters,
     *  {@code null} splits on whitespace
     * @return an array of parsed Strings, {@code null} if null String input
     */
    public static String[] split(final String str, final String separatorChars) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(6424);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6425);return splitWorker(str, separatorChars, -1, false);
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>Splits the provided text into an array with a maximum length,
     * separators specified.</p>
     *
     * <p>The separator is not included in the returned String array.
     * Adjacent separators are treated as one separator.</p>
     *
     * <p>A {@code null} input String returns {@code null}.
     * A {@code null} separatorChars splits on whitespace.</p>
     *
     * <p>If more than {@code max} delimited substrings are found, the last
     * returned string includes all characters after the first {@code max - 1}
     * returned strings (including separator characters).</p>
     *
     * <pre>
     * StringUtils.split(null, *, *)            = null
     * StringUtils.split("", *, *)              = []
     * StringUtils.split("ab cd ef", null, 0)   = ["ab", "cd", "ef"]
     * StringUtils.split("ab   cd ef", null, 0) = ["ab", "cd", "ef"]
     * StringUtils.split("ab:cd:ef", ":", 0)    = ["ab", "cd", "ef"]
     * StringUtils.split("ab:cd:ef", ":", 2)    = ["ab", "cd:ef"]
     * </pre>
     *
     * @param str  the String to parse, may be null
     * @param separatorChars  the characters used as the delimiters,
     *  {@code null} splits on whitespace
     * @param max  the maximum number of elements to include in the
     *  array. A zero or negative value implies no limit
     * @return an array of parsed Strings, {@code null} if null String input
     */
    public static String[] split(final String str, final String separatorChars, final int max) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(6426);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6427);return splitWorker(str, separatorChars, max, false);
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>Splits the provided text into an array, separator string specified.</p>
     *
     * <p>The separator(s) will not be included in the returned String array.
     * Adjacent separators are treated as one separator.</p>
     *
     * <p>A {@code null} input String returns {@code null}.
     * A {@code null} separator splits on whitespace.</p>
     *
     * <pre>
     * StringUtils.splitByWholeSeparator(null, *)               = null
     * StringUtils.splitByWholeSeparator("", *)                 = []
     * StringUtils.splitByWholeSeparator("ab de fg", null)      = ["ab", "de", "fg"]
     * StringUtils.splitByWholeSeparator("ab   de fg", null)    = ["ab", "de", "fg"]
     * StringUtils.splitByWholeSeparator("ab:cd:ef", ":")       = ["ab", "cd", "ef"]
     * StringUtils.splitByWholeSeparator("ab-!-cd-!-ef", "-!-") = ["ab", "cd", "ef"]
     * </pre>
     *
     * @param str  the String to parse, may be null
     * @param separator  String containing the String to be used as a delimiter,
     *  {@code null} splits on whitespace
     * @return an array of parsed Strings, {@code null} if null String was input
     */
    public static String[] splitByWholeSeparator(final String str, final String separator) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(6428);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6429);return splitByWholeSeparatorWorker( str, separator, -1, false ) ;
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>Splits the provided text into an array, separator string specified.
     * Returns a maximum of {@code max} substrings.</p>
     *
     * <p>The separator(s) will not be included in the returned String array.
     * Adjacent separators are treated as one separator.</p>
     *
     * <p>A {@code null} input String returns {@code null}.
     * A {@code null} separator splits on whitespace.</p>
     *
     * <pre>
     * StringUtils.splitByWholeSeparator(null, *, *)               = null
     * StringUtils.splitByWholeSeparator("", *, *)                 = []
     * StringUtils.splitByWholeSeparator("ab de fg", null, 0)      = ["ab", "de", "fg"]
     * StringUtils.splitByWholeSeparator("ab   de fg", null, 0)    = ["ab", "de", "fg"]
     * StringUtils.splitByWholeSeparator("ab:cd:ef", ":", 2)       = ["ab", "cd:ef"]
     * StringUtils.splitByWholeSeparator("ab-!-cd-!-ef", "-!-", 5) = ["ab", "cd", "ef"]
     * StringUtils.splitByWholeSeparator("ab-!-cd-!-ef", "-!-", 2) = ["ab", "cd-!-ef"]
     * </pre>
     *
     * @param str  the String to parse, may be null
     * @param separator  String containing the String to be used as a delimiter,
     *  {@code null} splits on whitespace
     * @param max  the maximum number of elements to include in the returned
     *  array. A zero or negative value implies no limit.
     * @return an array of parsed Strings, {@code null} if null String was input
     */
    public static String[] splitByWholeSeparator( final String str, final String separator, final int max ) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(6430);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6431);return splitByWholeSeparatorWorker(str, separator, max, false);
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>Splits the provided text into an array, separator string specified. </p>
     *
     * <p>The separator is not included in the returned String array.
     * Adjacent separators are treated as separators for empty tokens.
     * For more control over the split use the StrTokenizer class.</p>
     *
     * <p>A {@code null} input String returns {@code null}.
     * A {@code null} separator splits on whitespace.</p>
     *
     * <pre>
     * StringUtils.splitByWholeSeparatorPreserveAllTokens(null, *)               = null
     * StringUtils.splitByWholeSeparatorPreserveAllTokens("", *)                 = []
     * StringUtils.splitByWholeSeparatorPreserveAllTokens("ab de fg", null)      = ["ab", "de", "fg"]
     * StringUtils.splitByWholeSeparatorPreserveAllTokens("ab   de fg", null)    = ["ab", "", "", "de", "fg"]
     * StringUtils.splitByWholeSeparatorPreserveAllTokens("ab:cd:ef", ":")       = ["ab", "cd", "ef"]
     * StringUtils.splitByWholeSeparatorPreserveAllTokens("ab-!-cd-!-ef", "-!-") = ["ab", "cd", "ef"]
     * </pre>
     *
     * @param str  the String to parse, may be null
     * @param separator  String containing the String to be used as a delimiter,
     *  {@code null} splits on whitespace
     * @return an array of parsed Strings, {@code null} if null String was input
     * @since 2.4
     */
    public static String[] splitByWholeSeparatorPreserveAllTokens(final String str, final String separator) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(6432);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6433);return splitByWholeSeparatorWorker(str, separator, -1, true);
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>Splits the provided text into an array, separator string specified.
     * Returns a maximum of {@code max} substrings.</p>
     *
     * <p>The separator is not included in the returned String array.
     * Adjacent separators are treated as separators for empty tokens.
     * For more control over the split use the StrTokenizer class.</p>
     *
     * <p>A {@code null} input String returns {@code null}.
     * A {@code null} separator splits on whitespace.</p>
     *
     * <pre>
     * StringUtils.splitByWholeSeparatorPreserveAllTokens(null, *, *)               = null
     * StringUtils.splitByWholeSeparatorPreserveAllTokens("", *, *)                 = []
     * StringUtils.splitByWholeSeparatorPreserveAllTokens("ab de fg", null, 0)      = ["ab", "de", "fg"]
     * StringUtils.splitByWholeSeparatorPreserveAllTokens("ab   de fg", null, 0)    = ["ab", "", "", "de", "fg"]
     * StringUtils.splitByWholeSeparatorPreserveAllTokens("ab:cd:ef", ":", 2)       = ["ab", "cd:ef"]
     * StringUtils.splitByWholeSeparatorPreserveAllTokens("ab-!-cd-!-ef", "-!-", 5) = ["ab", "cd", "ef"]
     * StringUtils.splitByWholeSeparatorPreserveAllTokens("ab-!-cd-!-ef", "-!-", 2) = ["ab", "cd-!-ef"]
     * </pre>
     *
     * @param str  the String to parse, may be null
     * @param separator  String containing the String to be used as a delimiter,
     *  {@code null} splits on whitespace
     * @param max  the maximum number of elements to include in the returned
     *  array. A zero or negative value implies no limit.
     * @return an array of parsed Strings, {@code null} if null String was input
     * @since 2.4
     */
    public static String[] splitByWholeSeparatorPreserveAllTokens(final String str, final String separator, final int max) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(6434);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6435);return splitByWholeSeparatorWorker(str, separator, max, true);
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * Performs the logic for the {@code splitByWholeSeparatorPreserveAllTokens} methods.
     *
     * @param str  the String to parse, may be {@code null}
     * @param separator  String containing the String to be used as a delimiter,
     *  {@code null} splits on whitespace
     * @param max  the maximum number of elements to include in the returned
     *  array. A zero or negative value implies no limit.
     * @param preserveAllTokens if {@code true}, adjacent separators are
     * treated as empty token separators; if {@code false}, adjacent
     * separators are treated as one separator.
     * @return an array of parsed Strings, {@code null} if null String input
     * @since 2.4
     */
    private static String[] splitByWholeSeparatorWorker(
            final String str, final String separator, final int max, final boolean preserveAllTokens) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(6436);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6437);if ((((str == null)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6438)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6439)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6440);return null;
        }

        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6441);final int len = str.length();

        __CLR4_1_24d04d0l3lqxs2i.R.inc(6442);if ((((len == 0)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6443)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6444)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6445);return ArrayUtils.EMPTY_STRING_ARRAY;
        }

        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6446);if ((((separator == null || EMPTY.equals(separator))&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6447)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6448)==0&false))) {{
            // Split on whitespace.
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6449);return splitWorker(str, null, max, preserveAllTokens);
        }

        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6450);final int separatorLength = separator.length();

        __CLR4_1_24d04d0l3lqxs2i.R.inc(6451);final ArrayList<String> substrings = new ArrayList<String>();
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6452);int numberOfSubstrings = 0;
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6453);int beg = 0;
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6454);int end = 0;
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6455);while ((((end < len)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6456)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6457)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6458);end = str.indexOf(separator, beg);

            __CLR4_1_24d04d0l3lqxs2i.R.inc(6459);if ((((end > -1)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6460)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6461)==0&false))) {{
                __CLR4_1_24d04d0l3lqxs2i.R.inc(6462);if ((((end > beg)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6463)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6464)==0&false))) {{
                    __CLR4_1_24d04d0l3lqxs2i.R.inc(6465);numberOfSubstrings += 1;

                    __CLR4_1_24d04d0l3lqxs2i.R.inc(6466);if ((((numberOfSubstrings == max)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6467)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6468)==0&false))) {{
                        __CLR4_1_24d04d0l3lqxs2i.R.inc(6469);end = len;
                        __CLR4_1_24d04d0l3lqxs2i.R.inc(6470);substrings.add(str.substring(beg));
                    } }else {{
                        // The following is OK, because String.substring( beg, end ) excludes
                        // the character at the position 'end'.
                        __CLR4_1_24d04d0l3lqxs2i.R.inc(6471);substrings.add(str.substring(beg, end));

                        // Set the starting point for the next search.
                        // The following is equivalent to beg = end + (separatorLength - 1) + 1,
                        // which is the right calculation:
                        __CLR4_1_24d04d0l3lqxs2i.R.inc(6472);beg = end + separatorLength;
                    }
                }} }else {{
                    // We found a consecutive occurrence of the separator, so skip it.
                    __CLR4_1_24d04d0l3lqxs2i.R.inc(6473);if ((((preserveAllTokens)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6474)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6475)==0&false))) {{
                        __CLR4_1_24d04d0l3lqxs2i.R.inc(6476);numberOfSubstrings += 1;
                        __CLR4_1_24d04d0l3lqxs2i.R.inc(6477);if ((((numberOfSubstrings == max)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6478)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6479)==0&false))) {{
                            __CLR4_1_24d04d0l3lqxs2i.R.inc(6480);end = len;
                            __CLR4_1_24d04d0l3lqxs2i.R.inc(6481);substrings.add(str.substring(beg));
                        } }else {{
                            __CLR4_1_24d04d0l3lqxs2i.R.inc(6482);substrings.add(EMPTY);
                        }
                    }}
                    }__CLR4_1_24d04d0l3lqxs2i.R.inc(6483);beg = end + separatorLength;
                }
            }} }else {{
                // String.substring( beg ) goes from 'beg' to the end of the String.
                __CLR4_1_24d04d0l3lqxs2i.R.inc(6484);substrings.add(str.substring(beg));
                __CLR4_1_24d04d0l3lqxs2i.R.inc(6485);end = len;
            }
        }}

        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6486);return substrings.toArray(new String[substrings.size()]);
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    // -----------------------------------------------------------------------
    /**
     * <p>Splits the provided text into an array, using whitespace as the
     * separator, preserving all tokens, including empty tokens created by
     * adjacent separators. This is an alternative to using StringTokenizer.
     * Whitespace is defined by {@link Character#isWhitespace(char)}.</p>
     *
     * <p>The separator is not included in the returned String array.
     * Adjacent separators are treated as separators for empty tokens.
     * For more control over the split use the StrTokenizer class.</p>
     *
     * <p>A {@code null} input String returns {@code null}.</p>
     *
     * <pre>
     * StringUtils.splitPreserveAllTokens(null)       = null
     * StringUtils.splitPreserveAllTokens("")         = []
     * StringUtils.splitPreserveAllTokens("abc def")  = ["abc", "def"]
     * StringUtils.splitPreserveAllTokens("abc  def") = ["abc", "", "def"]
     * StringUtils.splitPreserveAllTokens(" abc ")    = ["", "abc", ""]
     * </pre>
     *
     * @param str  the String to parse, may be {@code null}
     * @return an array of parsed Strings, {@code null} if null String input
     * @since 2.1
     */
    public static String[] splitPreserveAllTokens(final String str) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(6487);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6488);return splitWorker(str, null, -1, true);
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>Splits the provided text into an array, separator specified,
     * preserving all tokens, including empty tokens created by adjacent
     * separators. This is an alternative to using StringTokenizer.</p>
     *
     * <p>The separator is not included in the returned String array.
     * Adjacent separators are treated as separators for empty tokens.
     * For more control over the split use the StrTokenizer class.</p>
     *
     * <p>A {@code null} input String returns {@code null}.</p>
     *
     * <pre>
     * StringUtils.splitPreserveAllTokens(null, *)         = null
     * StringUtils.splitPreserveAllTokens("", *)           = []
     * StringUtils.splitPreserveAllTokens("a.b.c", '.')    = ["a", "b", "c"]
     * StringUtils.splitPreserveAllTokens("a..b.c", '.')   = ["a", "", "b", "c"]
     * StringUtils.splitPreserveAllTokens("a:b:c", '.')    = ["a:b:c"]
     * StringUtils.splitPreserveAllTokens("a\tb\nc", null) = ["a", "b", "c"]
     * StringUtils.splitPreserveAllTokens("a b c", ' ')    = ["a", "b", "c"]
     * StringUtils.splitPreserveAllTokens("a b c ", ' ')   = ["a", "b", "c", ""]
     * StringUtils.splitPreserveAllTokens("a b c  ", ' ')   = ["a", "b", "c", "", ""]
     * StringUtils.splitPreserveAllTokens(" a b c", ' ')   = ["", a", "b", "c"]
     * StringUtils.splitPreserveAllTokens("  a b c", ' ')  = ["", "", a", "b", "c"]
     * StringUtils.splitPreserveAllTokens(" a b c ", ' ')  = ["", a", "b", "c", ""]
     * </pre>
     *
     * @param str  the String to parse, may be {@code null}
     * @param separatorChar  the character used as the delimiter,
     *  {@code null} splits on whitespace
     * @return an array of parsed Strings, {@code null} if null String input
     * @since 2.1
     */
    public static String[] splitPreserveAllTokens(final String str, final char separatorChar) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(6489);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6490);return splitWorker(str, separatorChar, true);
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * Performs the logic for the {@code split} and
     * {@code splitPreserveAllTokens} methods that do not return a
     * maximum array length.
     *
     * @param str  the String to parse, may be {@code null}
     * @param separatorChar the separate character
     * @param preserveAllTokens if {@code true}, adjacent separators are
     * treated as empty token separators; if {@code false}, adjacent
     * separators are treated as one separator.
     * @return an array of parsed Strings, {@code null} if null String input
     */
    private static String[] splitWorker(final String str, final char separatorChar, final boolean preserveAllTokens) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(6491);
        // Performance tuned for 2.0 (JDK1.4)

        __CLR4_1_24d04d0l3lqxs2i.R.inc(6492);if ((((str == null)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6493)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6494)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6495);return null;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6496);final int len = str.length();
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6497);if ((((len == 0)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6498)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6499)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6500);return ArrayUtils.EMPTY_STRING_ARRAY;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6501);final List<String> list = new ArrayList<String>();
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6502);int i = 0, start = 0;
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6503);boolean match = false;
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6504);boolean lastMatch = false;
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6505);while ((((i < len)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6506)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6507)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6508);if ((((str.charAt(i) == separatorChar)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6509)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6510)==0&false))) {{
                __CLR4_1_24d04d0l3lqxs2i.R.inc(6511);if ((((match || preserveAllTokens)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6512)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6513)==0&false))) {{
                    __CLR4_1_24d04d0l3lqxs2i.R.inc(6514);list.add(str.substring(start, i));
                    __CLR4_1_24d04d0l3lqxs2i.R.inc(6515);match = false;
                    __CLR4_1_24d04d0l3lqxs2i.R.inc(6516);lastMatch = true;
                }
                }__CLR4_1_24d04d0l3lqxs2i.R.inc(6517);start = ++i;
                __CLR4_1_24d04d0l3lqxs2i.R.inc(6518);continue;
            }
            }__CLR4_1_24d04d0l3lqxs2i.R.inc(6519);lastMatch = false;
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6520);match = true;
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6521);i++;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6522);if ((((match || preserveAllTokens && lastMatch)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6523)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6524)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6525);list.add(str.substring(start, i));
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6526);return list.toArray(new String[list.size()]);
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>Splits the provided text into an array, separators specified,
     * preserving all tokens, including empty tokens created by adjacent
     * separators. This is an alternative to using StringTokenizer.</p>
     *
     * <p>The separator is not included in the returned String array.
     * Adjacent separators are treated as separators for empty tokens.
     * For more control over the split use the StrTokenizer class.</p>
     *
     * <p>A {@code null} input String returns {@code null}.
     * A {@code null} separatorChars splits on whitespace.</p>
     *
     * <pre>
     * StringUtils.splitPreserveAllTokens(null, *)           = null
     * StringUtils.splitPreserveAllTokens("", *)             = []
     * StringUtils.splitPreserveAllTokens("abc def", null)   = ["abc", "def"]
     * StringUtils.splitPreserveAllTokens("abc def", " ")    = ["abc", "def"]
     * StringUtils.splitPreserveAllTokens("abc  def", " ")   = ["abc", "", def"]
     * StringUtils.splitPreserveAllTokens("ab:cd:ef", ":")   = ["ab", "cd", "ef"]
     * StringUtils.splitPreserveAllTokens("ab:cd:ef:", ":")  = ["ab", "cd", "ef", ""]
     * StringUtils.splitPreserveAllTokens("ab:cd:ef::", ":") = ["ab", "cd", "ef", "", ""]
     * StringUtils.splitPreserveAllTokens("ab::cd:ef", ":")  = ["ab", "", cd", "ef"]
     * StringUtils.splitPreserveAllTokens(":cd:ef", ":")     = ["", cd", "ef"]
     * StringUtils.splitPreserveAllTokens("::cd:ef", ":")    = ["", "", cd", "ef"]
     * StringUtils.splitPreserveAllTokens(":cd:ef:", ":")    = ["", cd", "ef", ""]
     * </pre>
     *
     * @param str  the String to parse, may be {@code null}
     * @param separatorChars  the characters used as the delimiters,
     *  {@code null} splits on whitespace
     * @return an array of parsed Strings, {@code null} if null String input
     * @since 2.1
     */
    public static String[] splitPreserveAllTokens(final String str, final String separatorChars) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(6527);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6528);return splitWorker(str, separatorChars, -1, true);
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>Splits the provided text into an array with a maximum length,
     * separators specified, preserving all tokens, including empty tokens
     * created by adjacent separators.</p>
     *
     * <p>The separator is not included in the returned String array.
     * Adjacent separators are treated as separators for empty tokens.
     * Adjacent separators are treated as one separator.</p>
     *
     * <p>A {@code null} input String returns {@code null}.
     * A {@code null} separatorChars splits on whitespace.</p>
     *
     * <p>If more than {@code max} delimited substrings are found, the last
     * returned string includes all characters after the first {@code max - 1}
     * returned strings (including separator characters).</p>
     *
     * <pre>
     * StringUtils.splitPreserveAllTokens(null, *, *)            = null
     * StringUtils.splitPreserveAllTokens("", *, *)              = []
     * StringUtils.splitPreserveAllTokens("ab de fg", null, 0)   = ["ab", "cd", "ef"]
     * StringUtils.splitPreserveAllTokens("ab   de fg", null, 0) = ["ab", "cd", "ef"]
     * StringUtils.splitPreserveAllTokens("ab:cd:ef", ":", 0)    = ["ab", "cd", "ef"]
     * StringUtils.splitPreserveAllTokens("ab:cd:ef", ":", 2)    = ["ab", "cd:ef"]
     * StringUtils.splitPreserveAllTokens("ab   de fg", null, 2) = ["ab", "  de fg"]
     * StringUtils.splitPreserveAllTokens("ab   de fg", null, 3) = ["ab", "", " de fg"]
     * StringUtils.splitPreserveAllTokens("ab   de fg", null, 4) = ["ab", "", "", "de fg"]
     * </pre>
     *
     * @param str  the String to parse, may be {@code null}
     * @param separatorChars  the characters used as the delimiters,
     *  {@code null} splits on whitespace
     * @param max  the maximum number of elements to include in the
     *  array. A zero or negative value implies no limit
     * @return an array of parsed Strings, {@code null} if null String input
     * @since 2.1
     */
    public static String[] splitPreserveAllTokens(final String str, final String separatorChars, final int max) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(6529);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6530);return splitWorker(str, separatorChars, max, true);
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * Performs the logic for the {@code split} and
     * {@code splitPreserveAllTokens} methods that return a maximum array
     * length.
     *
     * @param str  the String to parse, may be {@code null}
     * @param separatorChars the separate character
     * @param max  the maximum number of elements to include in the
     *  array. A zero or negative value implies no limit.
     * @param preserveAllTokens if {@code true}, adjacent separators are
     * treated as empty token separators; if {@code false}, adjacent
     * separators are treated as one separator.
     * @return an array of parsed Strings, {@code null} if null String input
     */
    private static String[] splitWorker(final String str, final String separatorChars, final int max, final boolean preserveAllTokens) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(6531);
        // Performance tuned for 2.0 (JDK1.4)
        // Direct code is quicker than StringTokenizer.
        // Also, StringTokenizer uses isSpace() not isWhitespace()

        __CLR4_1_24d04d0l3lqxs2i.R.inc(6532);if ((((str == null)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6533)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6534)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6535);return null;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6536);final int len = str.length();
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6537);if ((((len == 0)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6538)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6539)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6540);return ArrayUtils.EMPTY_STRING_ARRAY;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6541);final List<String> list = new ArrayList<String>();
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6542);int sizePlus1 = 1;
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6543);int i = 0, start = 0;
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6544);boolean match = false;
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6545);boolean lastMatch = false;
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6546);if ((((separatorChars == null)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6547)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6548)==0&false))) {{
            // Null separator means use whitespace
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6549);while ((((i < len)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6550)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6551)==0&false))) {{
                __CLR4_1_24d04d0l3lqxs2i.R.inc(6552);if ((((Character.isWhitespace(str.charAt(i)))&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6553)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6554)==0&false))) {{
                    __CLR4_1_24d04d0l3lqxs2i.R.inc(6555);if ((((match || preserveAllTokens)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6556)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6557)==0&false))) {{
                        __CLR4_1_24d04d0l3lqxs2i.R.inc(6558);lastMatch = true;
                        __CLR4_1_24d04d0l3lqxs2i.R.inc(6559);if ((((sizePlus1++ == max)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6560)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6561)==0&false))) {{
                            __CLR4_1_24d04d0l3lqxs2i.R.inc(6562);i = len;
                            __CLR4_1_24d04d0l3lqxs2i.R.inc(6563);lastMatch = false;
                        }
                        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6564);list.add(str.substring(start, i));
                        __CLR4_1_24d04d0l3lqxs2i.R.inc(6565);match = false;
                    }
                    }__CLR4_1_24d04d0l3lqxs2i.R.inc(6566);start = ++i;
                    __CLR4_1_24d04d0l3lqxs2i.R.inc(6567);continue;
                }
                }__CLR4_1_24d04d0l3lqxs2i.R.inc(6568);lastMatch = false;
                __CLR4_1_24d04d0l3lqxs2i.R.inc(6569);match = true;
                __CLR4_1_24d04d0l3lqxs2i.R.inc(6570);i++;
            }
        }} }else {__CLR4_1_24d04d0l3lqxs2i.R.inc(6571);if ((((separatorChars.length() == 1)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6572)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6573)==0&false))) {{
            // Optimise 1 character case
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6574);final char sep = separatorChars.charAt(0);
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6575);while ((((i < len)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6576)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6577)==0&false))) {{
                __CLR4_1_24d04d0l3lqxs2i.R.inc(6578);if ((((str.charAt(i) == sep)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6579)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6580)==0&false))) {{
                    __CLR4_1_24d04d0l3lqxs2i.R.inc(6581);if ((((match || preserveAllTokens)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6582)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6583)==0&false))) {{
                        __CLR4_1_24d04d0l3lqxs2i.R.inc(6584);lastMatch = true;
                        __CLR4_1_24d04d0l3lqxs2i.R.inc(6585);if ((((sizePlus1++ == max)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6586)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6587)==0&false))) {{
                            __CLR4_1_24d04d0l3lqxs2i.R.inc(6588);i = len;
                            __CLR4_1_24d04d0l3lqxs2i.R.inc(6589);lastMatch = false;
                        }
                        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6590);list.add(str.substring(start, i));
                        __CLR4_1_24d04d0l3lqxs2i.R.inc(6591);match = false;
                    }
                    }__CLR4_1_24d04d0l3lqxs2i.R.inc(6592);start = ++i;
                    __CLR4_1_24d04d0l3lqxs2i.R.inc(6593);continue;
                }
                }__CLR4_1_24d04d0l3lqxs2i.R.inc(6594);lastMatch = false;
                __CLR4_1_24d04d0l3lqxs2i.R.inc(6595);match = true;
                __CLR4_1_24d04d0l3lqxs2i.R.inc(6596);i++;
            }
        }} }else {{
            // standard case
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6597);while ((((i < len)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6598)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6599)==0&false))) {{
                __CLR4_1_24d04d0l3lqxs2i.R.inc(6600);if ((((separatorChars.indexOf(str.charAt(i)) >= 0)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6601)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6602)==0&false))) {{
                    __CLR4_1_24d04d0l3lqxs2i.R.inc(6603);if ((((match || preserveAllTokens)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6604)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6605)==0&false))) {{
                        __CLR4_1_24d04d0l3lqxs2i.R.inc(6606);lastMatch = true;
                        __CLR4_1_24d04d0l3lqxs2i.R.inc(6607);if ((((sizePlus1++ == max)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6608)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6609)==0&false))) {{
                            __CLR4_1_24d04d0l3lqxs2i.R.inc(6610);i = len;
                            __CLR4_1_24d04d0l3lqxs2i.R.inc(6611);lastMatch = false;
                        }
                        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6612);list.add(str.substring(start, i));
                        __CLR4_1_24d04d0l3lqxs2i.R.inc(6613);match = false;
                    }
                    }__CLR4_1_24d04d0l3lqxs2i.R.inc(6614);start = ++i;
                    __CLR4_1_24d04d0l3lqxs2i.R.inc(6615);continue;
                }
                }__CLR4_1_24d04d0l3lqxs2i.R.inc(6616);lastMatch = false;
                __CLR4_1_24d04d0l3lqxs2i.R.inc(6617);match = true;
                __CLR4_1_24d04d0l3lqxs2i.R.inc(6618);i++;
            }
        }}
        }}__CLR4_1_24d04d0l3lqxs2i.R.inc(6619);if ((((match || preserveAllTokens && lastMatch)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6620)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6621)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6622);list.add(str.substring(start, i));
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6623);return list.toArray(new String[list.size()]);
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>Splits a String by Character type as returned by
     * {@code java.lang.Character.getType(char)}. Groups of contiguous
     * characters of the same type are returned as complete tokens.
     * <pre>
     * StringUtils.splitByCharacterType(null)         = null
     * StringUtils.splitByCharacterType("")           = []
     * StringUtils.splitByCharacterType("ab de fg")   = ["ab", " ", "de", " ", "fg"]
     * StringUtils.splitByCharacterType("ab   de fg") = ["ab", "   ", "de", " ", "fg"]
     * StringUtils.splitByCharacterType("ab:cd:ef")   = ["ab", ":", "cd", ":", "ef"]
     * StringUtils.splitByCharacterType("number5")    = ["number", "5"]
     * StringUtils.splitByCharacterType("fooBar")     = ["foo", "B", "ar"]
     * StringUtils.splitByCharacterType("foo200Bar")  = ["foo", "200", "B", "ar"]
     * StringUtils.splitByCharacterType("ASFRules")   = ["ASFR", "ules"]
     * </pre>
     * @param str the String to split, may be {@code null}
     * @return an array of parsed Strings, {@code null} if null String input
     * @since 2.4
     */
    public static String[] splitByCharacterType(final String str) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(6624);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6625);return splitByCharacterType(str, false);
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>Splits a String by Character type as returned by
     * {@code java.lang.Character.getType(char)}. Groups of contiguous
     * characters of the same type are returned as complete tokens, with the
     * following exception: the character of type
     * {@code Character.UPPERCASE_LETTER}, if any, immediately
     * preceding a token of type {@code Character.LOWERCASE_LETTER}
     * will belong to the following token rather than to the preceding, if any,
     * {@code Character.UPPERCASE_LETTER} token.
     * <pre>
     * StringUtils.splitByCharacterTypeCamelCase(null)         = null
     * StringUtils.splitByCharacterTypeCamelCase("")           = []
     * StringUtils.splitByCharacterTypeCamelCase("ab de fg")   = ["ab", " ", "de", " ", "fg"]
     * StringUtils.splitByCharacterTypeCamelCase("ab   de fg") = ["ab", "   ", "de", " ", "fg"]
     * StringUtils.splitByCharacterTypeCamelCase("ab:cd:ef")   = ["ab", ":", "cd", ":", "ef"]
     * StringUtils.splitByCharacterTypeCamelCase("number5")    = ["number", "5"]
     * StringUtils.splitByCharacterTypeCamelCase("fooBar")     = ["foo", "Bar"]
     * StringUtils.splitByCharacterTypeCamelCase("foo200Bar")  = ["foo", "200", "Bar"]
     * StringUtils.splitByCharacterTypeCamelCase("ASFRules")   = ["ASF", "Rules"]
     * </pre>
     * @param str the String to split, may be {@code null}
     * @return an array of parsed Strings, {@code null} if null String input
     * @since 2.4
     */
    public static String[] splitByCharacterTypeCamelCase(final String str) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(6626);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6627);return splitByCharacterType(str, true);
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>Splits a String by Character type as returned by
     * {@code java.lang.Character.getType(char)}. Groups of contiguous
     * characters of the same type are returned as complete tokens, with the
     * following exception: if {@code camelCase} is {@code true},
     * the character of type {@code Character.UPPERCASE_LETTER}, if any,
     * immediately preceding a token of type {@code Character.LOWERCASE_LETTER}
     * will belong to the following token rather than to the preceding, if any,
     * {@code Character.UPPERCASE_LETTER} token.
     * @param str the String to split, may be {@code null}
     * @param camelCase whether to use so-called "camel-case" for letter types
     * @return an array of parsed Strings, {@code null} if null String input
     * @since 2.4
     */
    private static String[] splitByCharacterType(final String str, final boolean camelCase) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(6628);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6629);if ((((str == null)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6630)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6631)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6632);return null;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6633);if ((((str.length() == 0)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6634)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6635)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6636);return ArrayUtils.EMPTY_STRING_ARRAY;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6637);final char[] c = str.toCharArray();
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6638);final List<String> list = new ArrayList<String>();
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6639);int tokenStart = 0;
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6640);int currentType = Character.getType(c[tokenStart]);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6641);for (int pos = tokenStart + 1; (((pos < c.length)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6642)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6643)==0&false)); pos++) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6644);final int type = Character.getType(c[pos]);
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6645);if ((((type == currentType)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6646)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6647)==0&false))) {{
                __CLR4_1_24d04d0l3lqxs2i.R.inc(6648);continue;
            }
            }__CLR4_1_24d04d0l3lqxs2i.R.inc(6649);if ((((camelCase && type == Character.LOWERCASE_LETTER && currentType == Character.UPPERCASE_LETTER)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6650)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6651)==0&false))) {{
                __CLR4_1_24d04d0l3lqxs2i.R.inc(6652);final int newTokenStart = pos - 1;
                __CLR4_1_24d04d0l3lqxs2i.R.inc(6653);if ((((newTokenStart != tokenStart)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6654)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6655)==0&false))) {{
                    __CLR4_1_24d04d0l3lqxs2i.R.inc(6656);list.add(new String(c, tokenStart, newTokenStart - tokenStart));
                    __CLR4_1_24d04d0l3lqxs2i.R.inc(6657);tokenStart = newTokenStart;
                }
            }} }else {{
                __CLR4_1_24d04d0l3lqxs2i.R.inc(6658);list.add(new String(c, tokenStart, pos - tokenStart));
                __CLR4_1_24d04d0l3lqxs2i.R.inc(6659);tokenStart = pos;
            }
            }__CLR4_1_24d04d0l3lqxs2i.R.inc(6660);currentType = type;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6661);list.add(new String(c, tokenStart, c.length - tokenStart));
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6662);return list.toArray(new String[list.size()]);
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    // Joining
    //-----------------------------------------------------------------------
    /**
     * <p>Joins the elements of the provided array into a single String
     * containing the provided list of elements.</p>
     *
     * <p>No separator is added to the joined String.
     * Null objects or empty strings within the array are represented by
     * empty strings.</p>
     *
     * <pre>
     * StringUtils.join(null)            = null
     * StringUtils.join([])              = ""
     * StringUtils.join([null])          = ""
     * StringUtils.join(["a", "b", "c"]) = "abc"
     * StringUtils.join([null, "", "a"]) = "a"
     * </pre>
     *
     * @param <T> the specific type of values to join together
     * @param elements  the values to join together, may be null
     * @return the joined String, {@code null} if null array input
     * @since 2.0
     * @since 3.0 Changed signature to use varargs
     */
    public static <T> String join(final T... elements) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(6663);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6664);return join(elements, null);
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>Joins the elements of the provided array into a single String
     * containing the provided list of elements.</p>
     *
     * <p>No delimiter is added before or after the list.
     * Null objects or empty strings within the array are represented by
     * empty strings.</p>
     *
     * <pre>
     * StringUtils.join(null, *)               = null
     * StringUtils.join([], *)                 = ""
     * StringUtils.join([null], *)             = ""
     * StringUtils.join(["a", "b", "c"], ';')  = "a;b;c"
     * StringUtils.join(["a", "b", "c"], null) = "abc"
     * StringUtils.join([null, "", "a"], ';')  = ";;a"
     * </pre>
     *
     * @param array  the array of values to join together, may be null
     * @param separator  the separator character to use
     * @return the joined String, {@code null} if null array input
     * @since 2.0
     */
    public static String join(final Object[] array, final char separator) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(6665);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6666);if ((((array == null)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6667)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6668)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6669);return null;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6670);return join(array, separator, 0, array.length);
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>
     * Joins the elements of the provided array into a single String containing the provided list of elements.
     * </p>
     * 
     * <p>
     * No delimiter is added before or after the list. Null objects or empty strings within the array are represented
     * by empty strings.
     * </p>
     * 
     * <pre>
     * StringUtils.join(null, *)               = null
     * StringUtils.join([], *)                 = ""
     * StringUtils.join([null], *)             = ""
     * StringUtils.join([1, 2, 3], ';')  = "1;2;3"
     * StringUtils.join([1, 2, 3], null) = "123"
     * </pre>
     * 
     * @param array
     *            the array of values to join together, may be null
     * @param separator
     *            the separator character to use
     * @return the joined String, {@code null} if null array input
     * @since 3.2
     */
    public static String join(final long[] array, final char separator) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(6671);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6672);if ((((array == null)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6673)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6674)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6675);return null;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6676);return join(array, separator, 0, array.length);
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>
     * Joins the elements of the provided array into a single String containing the provided list of elements.
     * </p>
     * 
     * <p>
     * No delimiter is added before or after the list. Null objects or empty strings within the array are represented
     * by empty strings.
     * </p>
     * 
     * <pre>
     * StringUtils.join(null, *)               = null
     * StringUtils.join([], *)                 = ""
     * StringUtils.join([null], *)             = ""
     * StringUtils.join([1, 2, 3], ';')  = "1;2;3"
     * StringUtils.join([1, 2, 3], null) = "123"
     * </pre>
     * 
     * @param array
     *            the array of values to join together, may be null
     * @param separator
     *            the separator character to use
     * @return the joined String, {@code null} if null array input
     * @since 3.2
     */
    public static String join(final int[] array, final char separator) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(6677);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6678);if ((((array == null)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6679)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6680)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6681);return null;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6682);return join(array, separator, 0, array.length);
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>
     * Joins the elements of the provided array into a single String containing the provided list of elements.
     * </p>
     * 
     * <p>
     * No delimiter is added before or after the list. Null objects or empty strings within the array are represented
     * by empty strings.
     * </p>
     * 
     * <pre>
     * StringUtils.join(null, *)               = null
     * StringUtils.join([], *)                 = ""
     * StringUtils.join([null], *)             = ""
     * StringUtils.join([1, 2, 3], ';')  = "1;2;3"
     * StringUtils.join([1, 2, 3], null) = "123"
     * </pre>
     * 
     * @param array
     *            the array of values to join together, may be null
     * @param separator
     *            the separator character to use
     * @return the joined String, {@code null} if null array input
     * @since 3.2
     */
    public static String join(final short[] array, final char separator) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(6683);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6684);if ((((array == null)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6685)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6686)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6687);return null;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6688);return join(array, separator, 0, array.length);
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>
     * Joins the elements of the provided array into a single String containing the provided list of elements.
     * </p>
     * 
     * <p>
     * No delimiter is added before or after the list. Null objects or empty strings within the array are represented
     * by empty strings.
     * </p>
     * 
     * <pre>
     * StringUtils.join(null, *)               = null
     * StringUtils.join([], *)                 = ""
     * StringUtils.join([null], *)             = ""
     * StringUtils.join([1, 2, 3], ';')  = "1;2;3"
     * StringUtils.join([1, 2, 3], null) = "123"
     * </pre>
     * 
     * @param array
     *            the array of values to join together, may be null
     * @param separator
     *            the separator character to use
     * @return the joined String, {@code null} if null array input
     * @since 3.2
     */
    public static String join(final byte[] array, final char separator) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(6689);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6690);if ((((array == null)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6691)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6692)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6693);return null;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6694);return join(array, separator, 0, array.length);
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>
     * Joins the elements of the provided array into a single String containing the provided list of elements.
     * </p>
     * 
     * <p>
     * No delimiter is added before or after the list. Null objects or empty strings within the array are represented
     * by empty strings.
     * </p>
     * 
     * <pre>
     * StringUtils.join(null, *)               = null
     * StringUtils.join([], *)                 = ""
     * StringUtils.join([null], *)             = ""
     * StringUtils.join([1, 2, 3], ';')  = "1;2;3"
     * StringUtils.join([1, 2, 3], null) = "123"
     * </pre>
     * 
     * @param array
     *            the array of values to join together, may be null
     * @param separator
     *            the separator character to use
     * @return the joined String, {@code null} if null array input
     * @since 3.2
     */
    public static String join(final char[] array, final char separator) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(6695);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6696);if ((((array == null)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6697)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6698)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6699);return null;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6700);return join(array, separator, 0, array.length);
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>
     * Joins the elements of the provided array into a single String containing the provided list of elements.
     * </p>
     * 
     * <p>
     * No delimiter is added before or after the list. Null objects or empty strings within the array are represented
     * by empty strings.
     * </p>
     * 
     * <pre>
     * StringUtils.join(null, *)               = null
     * StringUtils.join([], *)                 = ""
     * StringUtils.join([null], *)             = ""
     * StringUtils.join([1, 2, 3], ';')  = "1;2;3"
     * StringUtils.join([1, 2, 3], null) = "123"
     * </pre>
     * 
     * @param array
     *            the array of values to join together, may be null
     * @param separator
     *            the separator character to use
     * @return the joined String, {@code null} if null array input
     * @since 3.2
     */
    public static String join(final float[] array, final char separator) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(6701);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6702);if ((((array == null)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6703)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6704)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6705);return null;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6706);return join(array, separator, 0, array.length);
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>
     * Joins the elements of the provided array into a single String containing the provided list of elements.
     * </p>
     * 
     * <p>
     * No delimiter is added before or after the list. Null objects or empty strings within the array are represented
     * by empty strings.
     * </p>
     * 
     * <pre>
     * StringUtils.join(null, *)               = null
     * StringUtils.join([], *)                 = ""
     * StringUtils.join([null], *)             = ""
     * StringUtils.join([1, 2, 3], ';')  = "1;2;3"
     * StringUtils.join([1, 2, 3], null) = "123"
     * </pre>
     * 
     * @param array
     *            the array of values to join together, may be null
     * @param separator
     *            the separator character to use
     * @return the joined String, {@code null} if null array input
     * @since 3.2
     */
    public static String join(final double[] array, final char separator) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(6707);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6708);if ((((array == null)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6709)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6710)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6711);return null;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6712);return join(array, separator, 0, array.length);
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}


    /**
     * <p>Joins the elements of the provided array into a single String
     * containing the provided list of elements.</p>
     *
     * <p>No delimiter is added before or after the list.
     * Null objects or empty strings within the array are represented by
     * empty strings.</p>
     *
     * <pre>
     * StringUtils.join(null, *)               = null
     * StringUtils.join([], *)                 = ""
     * StringUtils.join([null], *)             = ""
     * StringUtils.join(["a", "b", "c"], ';')  = "a;b;c"
     * StringUtils.join(["a", "b", "c"], null) = "abc"
     * StringUtils.join([null, "", "a"], ';')  = ";;a"
     * </pre>
     *
     * @param array  the array of values to join together, may be null
     * @param separator  the separator character to use
     * @param startIndex the first index to start joining from.  It is
     * an error to pass in an end index past the end of the array
     * @param endIndex the index to stop joining from (exclusive). It is
     * an error to pass in an end index past the end of the array
     * @return the joined String, {@code null} if null array input
     * @since 2.0
     */
    public static String join(final Object[] array, final char separator, final int startIndex, final int endIndex) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(6713);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6714);if ((((array == null)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6715)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6716)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6717);return null;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6718);final int noOfItems = endIndex - startIndex;
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6719);if ((((noOfItems <= 0)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6720)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6721)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6722);return EMPTY;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6723);final StringBuilder buf = new StringBuilder(noOfItems * 16);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6724);for (int i = startIndex; (((i < endIndex)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6725)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6726)==0&false)); i++) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6727);if ((((i > startIndex)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6728)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6729)==0&false))) {{
                __CLR4_1_24d04d0l3lqxs2i.R.inc(6730);buf.append(separator);
            }
            }__CLR4_1_24d04d0l3lqxs2i.R.inc(6731);if ((((array[i] != null)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6732)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6733)==0&false))) {{
                __CLR4_1_24d04d0l3lqxs2i.R.inc(6734);buf.append(array[i]);
            }
        }}
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6735);return buf.toString();
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>
     * Joins the elements of the provided array into a single String containing the provided list of elements.
     * </p>
     * 
     * <p>
     * No delimiter is added before or after the list. Null objects or empty strings within the array are represented
     * by empty strings.
     * </p>
     * 
     * <pre>
     * StringUtils.join(null, *)               = null
     * StringUtils.join([], *)                 = ""
     * StringUtils.join([null], *)             = ""
     * StringUtils.join([1, 2, 3], ';')  = "1;2;3"
     * StringUtils.join([1, 2, 3], null) = "123"
     * </pre>
     * 
     * @param array
     *            the array of values to join together, may be null
     * @param separator
     *            the separator character to use
     * @param startIndex
     *            the first index to start joining from. It is an error to pass in an end index past the end of the
     *            array
     * @param endIndex
     *            the index to stop joining from (exclusive). It is an error to pass in an end index past the end of
     *            the array
     * @return the joined String, {@code null} if null array input
     * @since 3.2
     */
    public static String join(final long[] array, final char separator, final int startIndex, final int endIndex) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(6736);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6737);if ((((array == null)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6738)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6739)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6740);return null;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6741);final int noOfItems = endIndex - startIndex;
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6742);if ((((noOfItems <= 0)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6743)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6744)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6745);return EMPTY;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6746);final StringBuilder buf = new StringBuilder(noOfItems * 16);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6747);for (int i = startIndex; (((i < endIndex)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6748)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6749)==0&false)); i++) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6750);if ((((i > startIndex)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6751)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6752)==0&false))) {{
                __CLR4_1_24d04d0l3lqxs2i.R.inc(6753);buf.append(separator);
            }
            }__CLR4_1_24d04d0l3lqxs2i.R.inc(6754);buf.append(array[i]);
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6755);return buf.toString();
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>
     * Joins the elements of the provided array into a single String containing the provided list of elements.
     * </p>
     * 
     * <p>
     * No delimiter is added before or after the list. Null objects or empty strings within the array are represented
     * by empty strings.
     * </p>
     * 
     * <pre>
     * StringUtils.join(null, *)               = null
     * StringUtils.join([], *)                 = ""
     * StringUtils.join([null], *)             = ""
     * StringUtils.join([1, 2, 3], ';')  = "1;2;3"
     * StringUtils.join([1, 2, 3], null) = "123"
     * </pre>
     * 
     * @param array
     *            the array of values to join together, may be null
     * @param separator
     *            the separator character to use
     * @param startIndex
     *            the first index to start joining from. It is an error to pass in an end index past the end of the
     *            array
     * @param endIndex
     *            the index to stop joining from (exclusive). It is an error to pass in an end index past the end of
     *            the array
     * @return the joined String, {@code null} if null array input
     * @since 3.2
     */
    public static String join(final int[] array, final char separator, final int startIndex, final int endIndex) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(6756);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6757);if ((((array == null)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6758)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6759)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6760);return null;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6761);final int noOfItems = endIndex - startIndex;
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6762);if ((((noOfItems <= 0)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6763)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6764)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6765);return EMPTY;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6766);final StringBuilder buf = new StringBuilder(noOfItems * 16);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6767);for (int i = startIndex; (((i < endIndex)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6768)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6769)==0&false)); i++) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6770);if ((((i > startIndex)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6771)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6772)==0&false))) {{
                __CLR4_1_24d04d0l3lqxs2i.R.inc(6773);buf.append(separator);
            }
            }__CLR4_1_24d04d0l3lqxs2i.R.inc(6774);buf.append(array[i]);
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6775);return buf.toString();
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>
     * Joins the elements of the provided array into a single String containing the provided list of elements.
     * </p>
     * 
     * <p>
     * No delimiter is added before or after the list. Null objects or empty strings within the array are represented
     * by empty strings.
     * </p>
     * 
     * <pre>
     * StringUtils.join(null, *)               = null
     * StringUtils.join([], *)                 = ""
     * StringUtils.join([null], *)             = ""
     * StringUtils.join([1, 2, 3], ';')  = "1;2;3"
     * StringUtils.join([1, 2, 3], null) = "123"
     * </pre>
     * 
     * @param array
     *            the array of values to join together, may be null
     * @param separator
     *            the separator character to use
     * @param startIndex
     *            the first index to start joining from. It is an error to pass in an end index past the end of the
     *            array
     * @param endIndex
     *            the index to stop joining from (exclusive). It is an error to pass in an end index past the end of
     *            the array
     * @return the joined String, {@code null} if null array input
     * @since 3.2
     */
    public static String join(final byte[] array, final char separator, final int startIndex, final int endIndex) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(6776);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6777);if ((((array == null)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6778)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6779)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6780);return null;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6781);final int noOfItems = endIndex - startIndex;
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6782);if ((((noOfItems <= 0)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6783)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6784)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6785);return EMPTY;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6786);final StringBuilder buf = new StringBuilder(noOfItems * 16);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6787);for (int i = startIndex; (((i < endIndex)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6788)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6789)==0&false)); i++) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6790);if ((((i > startIndex)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6791)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6792)==0&false))) {{
                __CLR4_1_24d04d0l3lqxs2i.R.inc(6793);buf.append(separator);
            }
            }__CLR4_1_24d04d0l3lqxs2i.R.inc(6794);buf.append(array[i]);
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6795);return buf.toString();
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>
     * Joins the elements of the provided array into a single String containing the provided list of elements.
     * </p>
     * 
     * <p>
     * No delimiter is added before or after the list. Null objects or empty strings within the array are represented
     * by empty strings.
     * </p>
     * 
     * <pre>
     * StringUtils.join(null, *)               = null
     * StringUtils.join([], *)                 = ""
     * StringUtils.join([null], *)             = ""
     * StringUtils.join([1, 2, 3], ';')  = "1;2;3"
     * StringUtils.join([1, 2, 3], null) = "123"
     * </pre>
     * 
     * @param array
     *            the array of values to join together, may be null
     * @param separator
     *            the separator character to use
     * @param startIndex
     *            the first index to start joining from. It is an error to pass in an end index past the end of the
     *            array
     * @param endIndex
     *            the index to stop joining from (exclusive). It is an error to pass in an end index past the end of
     *            the array
     * @return the joined String, {@code null} if null array input
     * @since 3.2
     */
    public static String join(final short[] array, final char separator, final int startIndex, final int endIndex) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(6796);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6797);if ((((array == null)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6798)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6799)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6800);return null;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6801);final int noOfItems = endIndex - startIndex;
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6802);if ((((noOfItems <= 0)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6803)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6804)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6805);return EMPTY;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6806);final StringBuilder buf = new StringBuilder(noOfItems * 16);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6807);for (int i = startIndex; (((i < endIndex)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6808)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6809)==0&false)); i++) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6810);if ((((i > startIndex)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6811)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6812)==0&false))) {{
                __CLR4_1_24d04d0l3lqxs2i.R.inc(6813);buf.append(separator);
            }
            }__CLR4_1_24d04d0l3lqxs2i.R.inc(6814);buf.append(array[i]);
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6815);return buf.toString();
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>
     * Joins the elements of the provided array into a single String containing the provided list of elements.
     * </p>
     * 
     * <p>
     * No delimiter is added before or after the list. Null objects or empty strings within the array are represented
     * by empty strings.
     * </p>
     * 
     * <pre>
     * StringUtils.join(null, *)               = null
     * StringUtils.join([], *)                 = ""
     * StringUtils.join([null], *)             = ""
     * StringUtils.join([1, 2, 3], ';')  = "1;2;3"
     * StringUtils.join([1, 2, 3], null) = "123"
     * </pre>
     * 
     * @param array
     *            the array of values to join together, may be null
     * @param separator
     *            the separator character to use
     * @param startIndex
     *            the first index to start joining from. It is an error to pass in an end index past the end of the
     *            array
     * @param endIndex
     *            the index to stop joining from (exclusive). It is an error to pass in an end index past the end of
     *            the array
     * @return the joined String, {@code null} if null array input
     * @since 3.2
     */
    public static String join(final char[] array, final char separator, final int startIndex, final int endIndex) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(6816);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6817);if ((((array == null)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6818)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6819)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6820);return null;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6821);final int noOfItems = endIndex - startIndex;
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6822);if ((((noOfItems <= 0)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6823)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6824)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6825);return EMPTY;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6826);final StringBuilder buf = new StringBuilder(noOfItems * 16);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6827);for (int i = startIndex; (((i < endIndex)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6828)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6829)==0&false)); i++) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6830);if ((((i > startIndex)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6831)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6832)==0&false))) {{
                __CLR4_1_24d04d0l3lqxs2i.R.inc(6833);buf.append(separator);
            }
            }__CLR4_1_24d04d0l3lqxs2i.R.inc(6834);buf.append(array[i]);
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6835);return buf.toString();
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>
     * Joins the elements of the provided array into a single String containing the provided list of elements.
     * </p>
     * 
     * <p>
     * No delimiter is added before or after the list. Null objects or empty strings within the array are represented
     * by empty strings.
     * </p>
     * 
     * <pre>
     * StringUtils.join(null, *)               = null
     * StringUtils.join([], *)                 = ""
     * StringUtils.join([null], *)             = ""
     * StringUtils.join([1, 2, 3], ';')  = "1;2;3"
     * StringUtils.join([1, 2, 3], null) = "123"
     * </pre>
     * 
     * @param array
     *            the array of values to join together, may be null
     * @param separator
     *            the separator character to use
     * @param startIndex
     *            the first index to start joining from. It is an error to pass in an end index past the end of the
     *            array
     * @param endIndex
     *            the index to stop joining from (exclusive). It is an error to pass in an end index past the end of
     *            the array
     * @return the joined String, {@code null} if null array input
     * @since 3.2
     */
    public static String join(final double[] array, final char separator, final int startIndex, final int endIndex) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(6836);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6837);if ((((array == null)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6838)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6839)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6840);return null;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6841);final int noOfItems = endIndex - startIndex;
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6842);if ((((noOfItems <= 0)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6843)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6844)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6845);return EMPTY;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6846);final StringBuilder buf = new StringBuilder(noOfItems * 16);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6847);for (int i = startIndex; (((i < endIndex)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6848)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6849)==0&false)); i++) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6850);if ((((i > startIndex)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6851)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6852)==0&false))) {{
                __CLR4_1_24d04d0l3lqxs2i.R.inc(6853);buf.append(separator);
            }
            }__CLR4_1_24d04d0l3lqxs2i.R.inc(6854);buf.append(array[i]);
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6855);return buf.toString();
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>
     * Joins the elements of the provided array into a single String containing the provided list of elements.
     * </p>
     * 
     * <p>
     * No delimiter is added before or after the list. Null objects or empty strings within the array are represented
     * by empty strings.
     * </p>
     * 
     * <pre>
     * StringUtils.join(null, *)               = null
     * StringUtils.join([], *)                 = ""
     * StringUtils.join([null], *)             = ""
     * StringUtils.join([1, 2, 3], ';')  = "1;2;3"
     * StringUtils.join([1, 2, 3], null) = "123"
     * </pre>
     * 
     * @param array
     *            the array of values to join together, may be null
     * @param separator
     *            the separator character to use
     * @param startIndex
     *            the first index to start joining from. It is an error to pass in an end index past the end of the
     *            array
     * @param endIndex
     *            the index to stop joining from (exclusive). It is an error to pass in an end index past the end of
     *            the array
     * @return the joined String, {@code null} if null array input
     * @since 3.2
     */
    public static String join(final float[] array, final char separator, final int startIndex, final int endIndex) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(6856);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6857);if ((((array == null)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6858)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6859)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6860);return null;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6861);final int noOfItems = endIndex - startIndex;
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6862);if ((((noOfItems <= 0)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6863)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6864)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6865);return EMPTY;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6866);final StringBuilder buf = new StringBuilder(noOfItems * 16);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6867);for (int i = startIndex; (((i < endIndex)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6868)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6869)==0&false)); i++) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6870);if ((((i > startIndex)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6871)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6872)==0&false))) {{
                __CLR4_1_24d04d0l3lqxs2i.R.inc(6873);buf.append(separator);
            }
            }__CLR4_1_24d04d0l3lqxs2i.R.inc(6874);buf.append(array[i]);
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6875);return buf.toString();
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}


    /**
     * <p>Joins the elements of the provided array into a single String
     * containing the provided list of elements.</p>
     *
     * <p>No delimiter is added before or after the list.
     * A {@code null} separator is the same as an empty String ("").
     * Null objects or empty strings within the array are represented by
     * empty strings.</p>
     *
     * <pre>
     * StringUtils.join(null, *)                = null
     * StringUtils.join([], *)                  = ""
     * StringUtils.join([null], *)              = ""
     * StringUtils.join(["a", "b", "c"], "--")  = "a--b--c"
     * StringUtils.join(["a", "b", "c"], null)  = "abc"
     * StringUtils.join(["a", "b", "c"], "")    = "abc"
     * StringUtils.join([null, "", "a"], ',')   = ",,a"
     * </pre>
     *
     * @param array  the array of values to join together, may be null
     * @param separator  the separator character to use, null treated as ""
     * @return the joined String, {@code null} if null array input
     */
    public static String join(final Object[] array, final String separator) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(6876);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6877);if ((((array == null)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6878)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6879)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6880);return null;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6881);return join(array, separator, 0, array.length);
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>Joins the elements of the provided array into a single String
     * containing the provided list of elements.</p>
     *
     * <p>No delimiter is added before or after the list.
     * A {@code null} separator is the same as an empty String ("").
     * Null objects or empty strings within the array are represented by
     * empty strings.</p>
     *
     * <pre>
     * StringUtils.join(null, *, *, *)                = null
     * StringUtils.join([], *, *, *)                  = ""
     * StringUtils.join([null], *, *, *)              = ""
     * StringUtils.join(["a", "b", "c"], "--", 0, 3)  = "a--b--c"
     * StringUtils.join(["a", "b", "c"], "--", 1, 3)  = "b--c"
     * StringUtils.join(["a", "b", "c"], "--", 2, 3)  = "c"
     * StringUtils.join(["a", "b", "c"], "--", 2, 2)  = ""
     * StringUtils.join(["a", "b", "c"], null, 0, 3)  = "abc"
     * StringUtils.join(["a", "b", "c"], "", 0, 3)    = "abc"
     * StringUtils.join([null, "", "a"], ',', 0, 3)   = ",,a"
     * </pre>
     *
     * @param array  the array of values to join together, may be null
     * @param separator  the separator character to use, null treated as ""
     * @param startIndex the first index to start joining from.
     * @param endIndex the index to stop joining from (exclusive).
     * @return the joined String, {@code null} if null array input; or the empty string
     * if {@code endIndex - startIndex <= 0}. The number of joined entries is given by
     * {@code endIndex - startIndex}
     * @throws ArrayIndexOutOfBoundsException ife<br/>
     * {@code startIndex < 0} or <br/>
     * {@code startIndex >= array.length()} or <br/>
     * {@code endIndex < 0} or <br/>
     * {@code endIndex > array.length()} 
     */
    public static String join(final Object[] array, String separator, final int startIndex, final int endIndex) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(6882);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6883);if ((((array == null)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6884)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6885)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6886);return null;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6887);if ((((separator == null)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6888)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6889)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6890);separator = EMPTY;
        }

        // endIndex - startIndex > 0:   Len = NofStrings *(len(firstString) + len(separator))
        //           (Assuming that all Strings are roughly equally long)
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6891);final int noOfItems = endIndex - startIndex;
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6892);if ((((noOfItems <= 0)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6893)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6894)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6895);return EMPTY;
        }

        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6896);final StringBuilder buf = new StringBuilder(noOfItems * 16);

        __CLR4_1_24d04d0l3lqxs2i.R.inc(6897);for (int i = startIndex; (((i < endIndex)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6898)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6899)==0&false)); i++) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6900);if ((((i > startIndex)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6901)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6902)==0&false))) {{
                __CLR4_1_24d04d0l3lqxs2i.R.inc(6903);buf.append(separator);
            }
            }__CLR4_1_24d04d0l3lqxs2i.R.inc(6904);if ((((array[i] != null)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6905)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6906)==0&false))) {{
                __CLR4_1_24d04d0l3lqxs2i.R.inc(6907);buf.append(array[i]);
            }
        }}
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6908);return buf.toString();
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>Joins the elements of the provided {@code Iterator} into
     * a single String containing the provided elements.</p>
     *
     * <p>No delimiter is added before or after the list. Null objects or empty
     * strings within the iteration are represented by empty strings.</p>
     *
     * <p>See the examples here: {@link #join(Object[],char)}. </p>
     *
     * @param iterator  the {@code Iterator} of values to join together, may be null
     * @param separator  the separator character to use
     * @return the joined String, {@code null} if null iterator input
     * @since 2.0
     */
    public static String join(final Iterator<?> iterator, final char separator) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(6909);

        // handle null, zero and one elements before building a buffer
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6910);if ((((iterator == null)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6911)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6912)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6913);return null;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6914);if ((((!iterator.hasNext())&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6915)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6916)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6917);return EMPTY;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6918);final Object first = iterator.next();
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6919);if ((((!iterator.hasNext())&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6920)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6921)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6922);return ObjectUtils.toString(first);
        }

        // two or more elements
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6923);final StringBuilder buf = new StringBuilder(256); // Java default is 16, probably too small
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6924);if ((((first != null)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6925)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6926)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6927);buf.append(first);
        }

        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6928);while ((((iterator.hasNext())&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6929)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6930)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6931);buf.append(separator);
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6932);final Object obj = iterator.next();
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6933);if ((((obj != null)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6934)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6935)==0&false))) {{
                __CLR4_1_24d04d0l3lqxs2i.R.inc(6936);buf.append(obj);
            }
        }}

        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6937);return buf.toString();
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>Joins the elements of the provided {@code Iterator} into
     * a single String containing the provided elements.</p>
     *
     * <p>No delimiter is added before or after the list.
     * A {@code null} separator is the same as an empty String ("").</p>
     *
     * <p>See the examples here: {@link #join(Object[],String)}. </p>
     *
     * @param iterator  the {@code Iterator} of values to join together, may be null
     * @param separator  the separator character to use, null treated as ""
     * @return the joined String, {@code null} if null iterator input
     */
    public static String join(final Iterator<?> iterator, final String separator) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(6938);

        // handle null, zero and one elements before building a buffer
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6939);if ((((iterator == null)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6940)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6941)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6942);return null;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6943);if ((((!iterator.hasNext())&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6944)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6945)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6946);return EMPTY;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6947);final Object first = iterator.next();
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6948);if ((((!iterator.hasNext())&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6949)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6950)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6951);return ObjectUtils.toString(first);
        }

        // two or more elements
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6952);final StringBuilder buf = new StringBuilder(256); // Java default is 16, probably too small
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6953);if ((((first != null)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6954)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6955)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6956);buf.append(first);
        }

        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6957);while ((((iterator.hasNext())&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6958)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6959)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6960);if ((((separator != null)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6961)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6962)==0&false))) {{
                __CLR4_1_24d04d0l3lqxs2i.R.inc(6963);buf.append(separator);
            }
            }__CLR4_1_24d04d0l3lqxs2i.R.inc(6964);final Object obj = iterator.next();
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6965);if ((((obj != null)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6966)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6967)==0&false))) {{
                __CLR4_1_24d04d0l3lqxs2i.R.inc(6968);buf.append(obj);
            }
        }}
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6969);return buf.toString();
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>Joins the elements of the provided {@code Iterable} into
     * a single String containing the provided elements.</p>
     *
     * <p>No delimiter is added before or after the list. Null objects or empty
     * strings within the iteration are represented by empty strings.</p>
     *
     * <p>See the examples here: {@link #join(Object[],char)}. </p>
     *
     * @param iterable  the {@code Iterable} providing the values to join together, may be null
     * @param separator  the separator character to use
     * @return the joined String, {@code null} if null iterator input
     * @since 2.3
     */
    public static String join(final Iterable<?> iterable, final char separator) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(6970);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6971);if ((((iterable == null)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6972)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6973)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6974);return null;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6975);return join(iterable.iterator(), separator);
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>Joins the elements of the provided {@code Iterable} into
     * a single String containing the provided elements.</p>
     *
     * <p>No delimiter is added before or after the list.
     * A {@code null} separator is the same as an empty String ("").</p>
     *
     * <p>See the examples here: {@link #join(Object[],String)}. </p>
     *
     * @param iterable  the {@code Iterable} providing the values to join together, may be null
     * @param separator  the separator character to use, null treated as ""
     * @return the joined String, {@code null} if null iterator input
     * @since 2.3
     */
    public static String join(final Iterable<?> iterable, final String separator) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(6976);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6977);if ((((iterable == null)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6978)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6979)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6980);return null;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6981);return join(iterable.iterator(), separator);
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    // Delete
    //-----------------------------------------------------------------------
    /**
     * <p>Deletes all whitespaces from a String as defined by
     * {@link Character#isWhitespace(char)}.</p>
     *
     * <pre>
     * StringUtils.deleteWhitespace(null)         = null
     * StringUtils.deleteWhitespace("")           = ""
     * StringUtils.deleteWhitespace("abc")        = "abc"
     * StringUtils.deleteWhitespace("   ab  c  ") = "abc"
     * </pre>
     *
     * @param str  the String to delete whitespace from, may be null
     * @return the String without whitespaces, {@code null} if null String input
     */
    public static String deleteWhitespace(final String str) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(6982);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6983);if ((((isEmpty(str))&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6984)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6985)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6986);return str;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6987);final int sz = str.length();
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6988);final char[] chs = new char[sz];
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6989);int count = 0;
        __CLR4_1_24d04d0l3lqxs2i.R.inc(6990);for (int i = 0; (((i < sz)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6991)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6992)==0&false)); i++) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(6993);if ((((!Character.isWhitespace(str.charAt(i)))&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6994)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6995)==0&false))) {{
                __CLR4_1_24d04d0l3lqxs2i.R.inc(6996);chs[count++] = str.charAt(i);
            }
        }}
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(6997);if ((((count == sz)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(6998)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(6999)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7000);return str;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7001);return new String(chs, 0, count);
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    // Remove
    //-----------------------------------------------------------------------
    /**
     * <p>Removes a substring only if it is at the beginning of a source string,
     * otherwise returns the source string.</p>
     *
     * <p>A {@code null} source string will return {@code null}.
     * An empty ("") source string will return the empty string.
     * A {@code null} search string will return the source string.</p>
     *
     * <pre>
     * StringUtils.removeStart(null, *)      = null
     * StringUtils.removeStart("", *)        = ""
     * StringUtils.removeStart(*, null)      = *
     * StringUtils.removeStart("www.domain.com", "www.")   = "domain.com"
     * StringUtils.removeStart("domain.com", "www.")       = "domain.com"
     * StringUtils.removeStart("www.domain.com", "domain") = "www.domain.com"
     * StringUtils.removeStart("abc", "")    = "abc"
     * </pre>
     *
     * @param str  the source String to search, may be null
     * @param remove  the String to search for and remove, may be null
     * @return the substring with the string removed if found,
     *  {@code null} if null String input
     * @since 2.1
     */
    public static String removeStart(final String str, final String remove) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(7002);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7003);if ((((isEmpty(str) || isEmpty(remove))&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7004)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7005)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7006);return str;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7007);if ((((str.startsWith(remove))&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7008)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7009)==0&false))){{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7010);return str.substring(remove.length());
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7011);return str;
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>Case insensitive removal of a substring if it is at the beginning of a source string,
     * otherwise returns the source string.</p>
     *
     * <p>A {@code null} source string will return {@code null}.
     * An empty ("") source string will return the empty string.
     * A {@code null} search string will return the source string.</p>
     *
     * <pre>
     * StringUtils.removeStartIgnoreCase(null, *)      = null
     * StringUtils.removeStartIgnoreCase("", *)        = ""
     * StringUtils.removeStartIgnoreCase(*, null)      = *
     * StringUtils.removeStartIgnoreCase("www.domain.com", "www.")   = "domain.com"
     * StringUtils.removeStartIgnoreCase("www.domain.com", "WWW.")   = "domain.com"
     * StringUtils.removeStartIgnoreCase("domain.com", "www.")       = "domain.com"
     * StringUtils.removeStartIgnoreCase("www.domain.com", "domain") = "www.domain.com"
     * StringUtils.removeStartIgnoreCase("abc", "")    = "abc"
     * </pre>
     *
     * @param str  the source String to search, may be null
     * @param remove  the String to search for (case insensitive) and remove, may be null
     * @return the substring with the string removed if found,
     *  {@code null} if null String input
     * @since 2.4
     */
    public static String removeStartIgnoreCase(final String str, final String remove) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(7012);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7013);if ((((isEmpty(str) || isEmpty(remove))&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7014)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7015)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7016);return str;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7017);if ((((startsWithIgnoreCase(str, remove))&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7018)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7019)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7020);return str.substring(remove.length());
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7021);return str;
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>Removes a substring only if it is at the end of a source string,
     * otherwise returns the source string.</p>
     *
     * <p>A {@code null} source string will return {@code null}.
     * An empty ("") source string will return the empty string.
     * A {@code null} search string will return the source string.</p>
     *
     * <pre>
     * StringUtils.removeEnd(null, *)      = null
     * StringUtils.removeEnd("", *)        = ""
     * StringUtils.removeEnd(*, null)      = *
     * StringUtils.removeEnd("www.domain.com", ".com.")  = "www.domain.com"
     * StringUtils.removeEnd("www.domain.com", ".com")   = "www.domain"
     * StringUtils.removeEnd("www.domain.com", "domain") = "www.domain.com"
     * StringUtils.removeEnd("abc", "")    = "abc"
     * </pre>
     *
     * @param str  the source String to search, may be null
     * @param remove  the String to search for and remove, may be null
     * @return the substring with the string removed if found,
     *  {@code null} if null String input
     * @since 2.1
     */
    public static String removeEnd(final String str, final String remove) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(7022);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7023);if ((((isEmpty(str) || isEmpty(remove))&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7024)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7025)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7026);return str;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7027);if ((((str.endsWith(remove))&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7028)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7029)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7030);return str.substring(0, str.length() - remove.length());
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7031);return str;
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>Case insensitive removal of a substring if it is at the end of a source string,
     * otherwise returns the source string.</p>
     *
     * <p>A {@code null} source string will return {@code null}.
     * An empty ("") source string will return the empty string.
     * A {@code null} search string will return the source string.</p>
     *
     * <pre>
     * StringUtils.removeEndIgnoreCase(null, *)      = null
     * StringUtils.removeEndIgnoreCase("", *)        = ""
     * StringUtils.removeEndIgnoreCase(*, null)      = *
     * StringUtils.removeEndIgnoreCase("www.domain.com", ".com.")  = "www.domain.com"
     * StringUtils.removeEndIgnoreCase("www.domain.com", ".com")   = "www.domain"
     * StringUtils.removeEndIgnoreCase("www.domain.com", "domain") = "www.domain.com"
     * StringUtils.removeEndIgnoreCase("abc", "")    = "abc"
     * StringUtils.removeEndIgnoreCase("www.domain.com", ".COM") = "www.domain")
     * StringUtils.removeEndIgnoreCase("www.domain.COM", ".com") = "www.domain")
     * </pre>
     *
     * @param str  the source String to search, may be null
     * @param remove  the String to search for (case insensitive) and remove, may be null
     * @return the substring with the string removed if found,
     *  {@code null} if null String input
     * @since 2.4
     */
    public static String removeEndIgnoreCase(final String str, final String remove) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(7032);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7033);if ((((isEmpty(str) || isEmpty(remove))&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7034)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7035)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7036);return str;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7037);if ((((endsWithIgnoreCase(str, remove))&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7038)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7039)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7040);return str.substring(0, str.length() - remove.length());
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7041);return str;
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>Removes all occurrences of a substring from within the source string.</p>
     *
     * <p>A {@code null} source string will return {@code null}.
     * An empty ("") source string will return the empty string.
     * A {@code null} remove string will return the source string.
     * An empty ("") remove string will return the source string.</p>
     *
     * <pre>
     * StringUtils.remove(null, *)        = null
     * StringUtils.remove("", *)          = ""
     * StringUtils.remove(*, null)        = *
     * StringUtils.remove(*, "")          = *
     * StringUtils.remove("queued", "ue") = "qd"
     * StringUtils.remove("queued", "zz") = "queued"
     * </pre>
     *
     * @param str  the source String to search, may be null
     * @param remove  the String to search for and remove, may be null
     * @return the substring with the string removed if found,
     *  {@code null} if null String input
     * @since 2.1
     */
    public static String remove(final String str, final String remove) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(7042);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7043);if ((((isEmpty(str) || isEmpty(remove))&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7044)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7045)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7046);return str;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7047);return replace(str, remove, EMPTY, -1);
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>Removes all occurrences of a character from within the source string.</p>
     *
     * <p>A {@code null} source string will return {@code null}.
     * An empty ("") source string will return the empty string.</p>
     *
     * <pre>
     * StringUtils.remove(null, *)       = null
     * StringUtils.remove("", *)         = ""
     * StringUtils.remove("queued", 'u') = "qeed"
     * StringUtils.remove("queued", 'z') = "queued"
     * </pre>
     *
     * @param str  the source String to search, may be null
     * @param remove  the char to search for and remove, may be null
     * @return the substring with the char removed if found,
     *  {@code null} if null String input
     * @since 2.1
     */
    public static String remove(final String str, final char remove) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(7048);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7049);if ((((isEmpty(str) || str.indexOf(remove) == INDEX_NOT_FOUND)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7050)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7051)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7052);return str;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7053);final char[] chars = str.toCharArray();
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7054);int pos = 0;
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7055);for (int i = 0; (((i < chars.length)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7056)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7057)==0&false)); i++) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7058);if ((((chars[i] != remove)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7059)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7060)==0&false))) {{
                __CLR4_1_24d04d0l3lqxs2i.R.inc(7061);chars[pos++] = chars[i];
            }
        }}
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7062);return new String(chars, 0, pos);
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    // Replacing
    //-----------------------------------------------------------------------
    /**
     * <p>Replaces a String with another String inside a larger String, once.</p>
     *
     * <p>A {@code null} reference passed to this method is a no-op.</p>
     *
     * <pre>
     * StringUtils.replaceOnce(null, *, *)        = null
     * StringUtils.replaceOnce("", *, *)          = ""
     * StringUtils.replaceOnce("any", null, *)    = "any"
     * StringUtils.replaceOnce("any", *, null)    = "any"
     * StringUtils.replaceOnce("any", "", *)      = "any"
     * StringUtils.replaceOnce("aba", "a", null)  = "aba"
     * StringUtils.replaceOnce("aba", "a", "")    = "ba"
     * StringUtils.replaceOnce("aba", "a", "z")   = "zba"
     * </pre>
     *
     * @see #replace(String text, String searchString, String replacement, int max)
     * @param text  text to search and replace in, may be null
     * @param searchString  the String to search for, may be null
     * @param replacement  the String to replace with, may be null
     * @return the text with any replacements processed,
     *  {@code null} if null String input
     */
    public static String replaceOnce(final String text, final String searchString, final String replacement) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(7063);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7064);return replace(text, searchString, replacement, 1);
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * Replaces each substring of the source String that matches the given regular expression with the given
     * replacement using the {@link Pattern#DOTALL} option. DOTALL is also know as single-line mode in Perl. This call
     * is also equivalent to:
     * <ul>
     * <li>{@code source.replaceAll(&quot;(?s)&quot; + regex, replacement)}</li>
     * <li>{@code Pattern.compile(regex, Pattern.DOTALL).matcher(source).replaceAll(replacement)}</li>
     * </ul>
     * 
     * @param source
     *            the source string
     * @param regex
     *            the regular expression to which this string is to be matched
     * @param replacement
     *            the string to be substituted for each match
     * @return The resulting {@code String}
     * @see String#replaceAll(String, String)
     * @see Pattern#DOTALL
     * @since 3.2
     */
    public static String replacePattern(final String source, final String regex, final String replacement) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(7065);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7066);return Pattern.compile(regex, Pattern.DOTALL).matcher(source).replaceAll(replacement);
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * Removes each substring of the source String that matches the given regular expression using the DOTALL option.
     * 
     * @param source
     *            the source string
     * @param regex
     *            the regular expression to which this string is to be matched
     * @return The resulting {@code String}
     * @see String#replaceAll(String, String)
     * @see Pattern#DOTALL
     * @since 3.2
     */
    public static String removePattern(final String source, final String regex) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(7067);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7068);return replacePattern(source, regex, StringUtils.EMPTY);
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>Replaces all occurrences of a String within another String.</p>
     *
     * <p>A {@code null} reference passed to this method is a no-op.</p>
     *
     * <pre>
     * StringUtils.replace(null, *, *)        = null
     * StringUtils.replace("", *, *)          = ""
     * StringUtils.replace("any", null, *)    = "any"
     * StringUtils.replace("any", *, null)    = "any"
     * StringUtils.replace("any", "", *)      = "any"
     * StringUtils.replace("aba", "a", null)  = "aba"
     * StringUtils.replace("aba", "a", "")    = "b"
     * StringUtils.replace("aba", "a", "z")   = "zbz"
     * </pre>
     *
     * @see #replace(String text, String searchString, String replacement, int max)
     * @param text  text to search and replace in, may be null
     * @param searchString  the String to search for, may be null
     * @param replacement  the String to replace it with, may be null
     * @return the text with any replacements processed,
     *  {@code null} if null String input
     */
    public static String replace(final String text, final String searchString, final String replacement) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(7069);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7070);return replace(text, searchString, replacement, -1);
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>Replaces a String with another String inside a larger String,
     * for the first {@code max} values of the search String.</p>
     *
     * <p>A {@code null} reference passed to this method is a no-op.</p>
     *
     * <pre>
     * StringUtils.replace(null, *, *, *)         = null
     * StringUtils.replace("", *, *, *)           = ""
     * StringUtils.replace("any", null, *, *)     = "any"
     * StringUtils.replace("any", *, null, *)     = "any"
     * StringUtils.replace("any", "", *, *)       = "any"
     * StringUtils.replace("any", *, *, 0)        = "any"
     * StringUtils.replace("abaa", "a", null, -1) = "abaa"
     * StringUtils.replace("abaa", "a", "", -1)   = "b"
     * StringUtils.replace("abaa", "a", "z", 0)   = "abaa"
     * StringUtils.replace("abaa", "a", "z", 1)   = "zbaa"
     * StringUtils.replace("abaa", "a", "z", 2)   = "zbza"
     * StringUtils.replace("abaa", "a", "z", -1)  = "zbzz"
     * </pre>
     *
     * @param text  text to search and replace in, may be null
     * @param searchString  the String to search for, may be null
     * @param replacement  the String to replace it with, may be null
     * @param max  maximum number of values to replace, or {@code -1} if no maximum
     * @return the text with any replacements processed,
     *  {@code null} if null String input
     */
    public static String replace(final String text, final String searchString, final String replacement, int max) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(7071);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7072);if ((((isEmpty(text) || isEmpty(searchString) || replacement == null || max == 0)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7073)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7074)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7075);return text;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7076);int start = 0;
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7077);int end = text.indexOf(searchString, start);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7078);if ((((end == INDEX_NOT_FOUND)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7079)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7080)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7081);return text;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7082);final int replLength = searchString.length();
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7083);int increase = replacement.length() - replLength;
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7084);increase = (((increase < 0 )&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7085)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7086)==0&false))? 0 : increase;
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7087);increase *= (((max < 0 )&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7088)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7089)==0&false))? 16 : (((max > 64 )&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7090)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7091)==0&false))? 64 : max;
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7092);final StringBuilder buf = new StringBuilder(text.length() + increase);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7093);while ((((end != INDEX_NOT_FOUND)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7094)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7095)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7096);buf.append(text.substring(start, end)).append(replacement);
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7097);start = end + replLength;
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7098);if ((((--max == 0)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7099)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7100)==0&false))) {{
                __CLR4_1_24d04d0l3lqxs2i.R.inc(7101);break;
            }
            }__CLR4_1_24d04d0l3lqxs2i.R.inc(7102);end = text.indexOf(searchString, start);
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7103);buf.append(text.substring(start));
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7104);return buf.toString();
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>
     * Replaces all occurrences of Strings within another String.
     * </p>
     *
     * <p>
     * A {@code null} reference passed to this method is a no-op, or if
     * any "search string" or "string to replace" is null, that replace will be
     * ignored. This will not repeat. For repeating replaces, call the
     * overloaded method.
     * </p>
     *
     * <pre>
     *  StringUtils.replaceEach(null, *, *)        = null
     *  StringUtils.replaceEach("", *, *)          = ""
     *  StringUtils.replaceEach("aba", null, null) = "aba"
     *  StringUtils.replaceEach("aba", new String[0], null) = "aba"
     *  StringUtils.replaceEach("aba", null, new String[0]) = "aba"
     *  StringUtils.replaceEach("aba", new String[]{"a"}, null)  = "aba"
     *  StringUtils.replaceEach("aba", new String[]{"a"}, new String[]{""})  = "b"
     *  StringUtils.replaceEach("aba", new String[]{null}, new String[]{"a"})  = "aba"
     *  StringUtils.replaceEach("abcde", new String[]{"ab", "d"}, new String[]{"w", "t"})  = "wcte"
     *  (example of how it does not repeat)
     *  StringUtils.replaceEach("abcde", new String[]{"ab", "d"}, new String[]{"d", "t"})  = "dcte"
     * </pre>
     *
     * @param text
     *            text to search and replace in, no-op if null
     * @param searchList
     *            the Strings to search for, no-op if null
     * @param replacementList
     *            the Strings to replace them with, no-op if null
     * @return the text with any replacements processed, {@code null} if
     *         null String input
     * @throws IllegalArgumentException
     *             if the lengths of the arrays are not the same (null is ok,
     *             and/or size 0)
     * @since 2.4
     */
    public static String replaceEach(final String text, final String[] searchList, final String[] replacementList) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(7105);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7106);return replaceEach(text, searchList, replacementList, false, 0);
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>
     * Replaces all occurrences of Strings within another String.
     * </p>
     *
     * <p>
     * A {@code null} reference passed to this method is a no-op, or if
     * any "search string" or "string to replace" is null, that replace will be
     * ignored. 
     * </p>
     *
     * <pre>
     *  StringUtils.replaceEach(null, *, *, *) = null
     *  StringUtils.replaceEach("", *, *, *) = ""
     *  StringUtils.replaceEach("aba", null, null, *) = "aba"
     *  StringUtils.replaceEach("aba", new String[0], null, *) = "aba"
     *  StringUtils.replaceEach("aba", null, new String[0], *) = "aba"
     *  StringUtils.replaceEach("aba", new String[]{"a"}, null, *) = "aba"
     *  StringUtils.replaceEach("aba", new String[]{"a"}, new String[]{""}, *) = "b"
     *  StringUtils.replaceEach("aba", new String[]{null}, new String[]{"a"}, *) = "aba"
     *  StringUtils.replaceEach("abcde", new String[]{"ab", "d"}, new String[]{"w", "t"}, *) = "wcte"
     *  (example of how it repeats)
     *  StringUtils.replaceEach("abcde", new String[]{"ab", "d"}, new String[]{"d", "t"}, false) = "dcte"
     *  StringUtils.replaceEach("abcde", new String[]{"ab", "d"}, new String[]{"d", "t"}, true) = "tcte"
     *  StringUtils.replaceEach("abcde", new String[]{"ab", "d"}, new String[]{"d", "ab"}, true) = IllegalStateException
     *  StringUtils.replaceEach("abcde", new String[]{"ab", "d"}, new String[]{"d", "ab"}, false) = "dcabe"
     * </pre>
     *
     * @param text
     *            text to search and replace in, no-op if null
     * @param searchList
     *            the Strings to search for, no-op if null
     * @param replacementList
     *            the Strings to replace them with, no-op if null
     * @return the text with any replacements processed, {@code null} if
     *         null String input
     * @throws IllegalStateException
     *             if the search is repeating and there is an endless loop due
     *             to outputs of one being inputs to another
     * @throws IllegalArgumentException
     *             if the lengths of the arrays are not the same (null is ok,
     *             and/or size 0)
     * @since 2.4
     */
    public static String replaceEachRepeatedly(final String text, final String[] searchList, final String[] replacementList) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(7107);
        // timeToLive should be 0 if not used or nothing to replace, else it's
        // the length of the replace array
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7108);final int timeToLive = (((searchList == null )&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7109)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7110)==0&false))? 0 : searchList.length;
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7111);return replaceEach(text, searchList, replacementList, true, timeToLive);
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>
     * Replaces all occurrences of Strings within another String.
     * </p>
     *
     * <p>
     * A {@code null} reference passed to this method is a no-op, or if
     * any "search string" or "string to replace" is null, that replace will be
     * ignored.
     * </p>
     *
     * <pre>
     *  StringUtils.replaceEach(null, *, *, *) = null
     *  StringUtils.replaceEach("", *, *, *) = ""
     *  StringUtils.replaceEach("aba", null, null, *) = "aba"
     *  StringUtils.replaceEach("aba", new String[0], null, *) = "aba"
     *  StringUtils.replaceEach("aba", null, new String[0], *) = "aba"
     *  StringUtils.replaceEach("aba", new String[]{"a"}, null, *) = "aba"
     *  StringUtils.replaceEach("aba", new String[]{"a"}, new String[]{""}, *) = "b"
     *  StringUtils.replaceEach("aba", new String[]{null}, new String[]{"a"}, *) = "aba"
     *  StringUtils.replaceEach("abcde", new String[]{"ab", "d"}, new String[]{"w", "t"}, *) = "wcte"
     *  (example of how it repeats)
     *  StringUtils.replaceEach("abcde", new String[]{"ab", "d"}, new String[]{"d", "t"}, false) = "dcte"
     *  StringUtils.replaceEach("abcde", new String[]{"ab", "d"}, new String[]{"d", "t"}, true) = "tcte"
     *  StringUtils.replaceEach("abcde", new String[]{"ab", "d"}, new String[]{"d", "ab"}, *) = IllegalStateException
     * </pre>
     *
     * @param text
     *            text to search and replace in, no-op if null
     * @param searchList
     *            the Strings to search for, no-op if null
     * @param replacementList
     *            the Strings to replace them with, no-op if null
     * @param repeat if true, then replace repeatedly
     *       until there are no more possible replacements or timeToLive < 0
     * @param timeToLive
     *            if less than 0 then there is a circular reference and endless
     *            loop
     * @return the text with any replacements processed, {@code null} if
     *         null String input
     * @throws IllegalStateException
     *             if the search is repeating and there is an endless loop due
     *             to outputs of one being inputs to another
     * @throws IllegalArgumentException
     *             if the lengths of the arrays are not the same (null is ok,
     *             and/or size 0)
     * @since 2.4
     */
    private static String replaceEach(
            final String text, final String[] searchList, final String[] replacementList, final boolean repeat, final int timeToLive) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(7112);

        // mchyzer Performance note: This creates very few new objects (one major goal)
        // let me know if there are performance requests, we can create a harness to measure

        __CLR4_1_24d04d0l3lqxs2i.R.inc(7113);if ((((text == null || text.length() == 0 || searchList == null ||
                searchList.length == 0 || replacementList == null || replacementList.length == 0)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7114)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7115)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7116);return text;
        }

        // if recursing, this shouldn't be less than 0
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7117);if ((((timeToLive < 0)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7118)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7119)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7120);throw new IllegalStateException("Aborting to protect against StackOverflowError - " +
                                            "output of one loop is the input of another");
        }

        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7121);final int searchLength = searchList.length;
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7122);final int replacementLength = replacementList.length;

        // make sure lengths are ok, these need to be equal
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7123);if ((((searchLength != replacementLength)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7124)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7125)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7126);throw new IllegalArgumentException("Search and Replace array lengths don't match: "
                + searchLength
                + " vs "
                + replacementLength);
        }

        // keep track of which still have matches
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7127);final boolean[] noMoreMatchesForReplIndex = new boolean[searchLength];

        // index on index that the match was found
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7128);int textIndex = -1;
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7129);int replaceIndex = -1;
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7130);int tempIndex = -1;

        // index of replace array that will replace the search string found
        // NOTE: logic duplicated below START
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7131);for (int i = 0; (((i < searchLength)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7132)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7133)==0&false)); i++) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7134);if ((((noMoreMatchesForReplIndex[i] || searchList[i] == null ||
                    searchList[i].length() == 0 || replacementList[i] == null)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7135)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7136)==0&false))) {{
                __CLR4_1_24d04d0l3lqxs2i.R.inc(7137);continue;
            }
            }__CLR4_1_24d04d0l3lqxs2i.R.inc(7138);tempIndex = text.indexOf(searchList[i]);

            // see if we need to keep searching for this
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7139);if ((((tempIndex == -1)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7140)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7141)==0&false))) {{
                __CLR4_1_24d04d0l3lqxs2i.R.inc(7142);noMoreMatchesForReplIndex[i] = true;
            } }else {{
                __CLR4_1_24d04d0l3lqxs2i.R.inc(7143);if ((((textIndex == -1 || tempIndex < textIndex)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7144)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7145)==0&false))) {{
                    __CLR4_1_24d04d0l3lqxs2i.R.inc(7146);textIndex = tempIndex;
                    __CLR4_1_24d04d0l3lqxs2i.R.inc(7147);replaceIndex = i;
                }
            }}
        }}
        // NOTE: logic mostly below END

        // no search strings found, we are done
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7148);if ((((textIndex == -1)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7149)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7150)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7151);return text;
        }

        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7152);int start = 0;

        // get a good guess on the size of the result buffer so it doesn't have to double if it goes over a bit
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7153);int increase = 0;

        // count the replacement text elements that are larger than their corresponding text being replaced
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7154);for (int i = 0; (((i < searchList.length)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7155)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7156)==0&false)); i++) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7157);if ((((searchList[i] == null || replacementList[i] == null)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7158)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7159)==0&false))) {{
                __CLR4_1_24d04d0l3lqxs2i.R.inc(7160);continue;
            }
            }__CLR4_1_24d04d0l3lqxs2i.R.inc(7161);final int greater = replacementList[i].length() - searchList[i].length();
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7162);if ((((greater > 0)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7163)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7164)==0&false))) {{
                __CLR4_1_24d04d0l3lqxs2i.R.inc(7165);increase += 3 * greater; // assume 3 matches
            }
        }}
        // have upper-bound at 20% increase, then let Java take over
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7166);increase = Math.min(increase, text.length() / 5);

        __CLR4_1_24d04d0l3lqxs2i.R.inc(7167);final StringBuilder buf = new StringBuilder(text.length() + increase);

        __CLR4_1_24d04d0l3lqxs2i.R.inc(7168);while ((((textIndex != -1)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7169)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7170)==0&false))) {{

            __CLR4_1_24d04d0l3lqxs2i.R.inc(7171);for (int i = start; (((i < textIndex)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7172)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7173)==0&false)); i++) {{
                __CLR4_1_24d04d0l3lqxs2i.R.inc(7174);buf.append(text.charAt(i));
            }
            }__CLR4_1_24d04d0l3lqxs2i.R.inc(7175);buf.append(replacementList[replaceIndex]);

            __CLR4_1_24d04d0l3lqxs2i.R.inc(7176);start = textIndex + searchList[replaceIndex].length();

            __CLR4_1_24d04d0l3lqxs2i.R.inc(7177);textIndex = -1;
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7178);replaceIndex = -1;
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7179);tempIndex = -1;
            // find the next earliest match
            // NOTE: logic mostly duplicated above START
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7180);for (int i = 0; (((i < searchLength)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7181)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7182)==0&false)); i++) {{
                __CLR4_1_24d04d0l3lqxs2i.R.inc(7183);if ((((noMoreMatchesForReplIndex[i] || searchList[i] == null ||
                        searchList[i].length() == 0 || replacementList[i] == null)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7184)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7185)==0&false))) {{
                    __CLR4_1_24d04d0l3lqxs2i.R.inc(7186);continue;
                }
                }__CLR4_1_24d04d0l3lqxs2i.R.inc(7187);tempIndex = text.indexOf(searchList[i], start);

                // see if we need to keep searching for this
                __CLR4_1_24d04d0l3lqxs2i.R.inc(7188);if ((((tempIndex == -1)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7189)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7190)==0&false))) {{
                    __CLR4_1_24d04d0l3lqxs2i.R.inc(7191);noMoreMatchesForReplIndex[i] = true;
                } }else {{
                    __CLR4_1_24d04d0l3lqxs2i.R.inc(7192);if ((((textIndex == -1 || tempIndex < textIndex)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7193)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7194)==0&false))) {{
                        __CLR4_1_24d04d0l3lqxs2i.R.inc(7195);textIndex = tempIndex;
                        __CLR4_1_24d04d0l3lqxs2i.R.inc(7196);replaceIndex = i;
                    }
                }}
            }}
            // NOTE: logic duplicated above END

        }}
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7197);final int textLength = text.length();
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7198);for (int i = start; (((i < textLength)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7199)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7200)==0&false)); i++) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7201);buf.append(text.charAt(i));
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7202);final String result = buf.toString();
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7203);if ((((!repeat)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7204)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7205)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7206);return result;
        }

        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7207);return replaceEach(result, searchList, replacementList, repeat, timeToLive - 1);
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    // Replace, character based
    //-----------------------------------------------------------------------
    /**
     * <p>Replaces all occurrences of a character in a String with another.
     * This is a null-safe version of {@link String#replace(char, char)}.</p>
     *
     * <p>A {@code null} string input returns {@code null}.
     * An empty ("") string input returns an empty string.</p>
     *
     * <pre>
     * StringUtils.replaceChars(null, *, *)        = null
     * StringUtils.replaceChars("", *, *)          = ""
     * StringUtils.replaceChars("abcba", 'b', 'y') = "aycya"
     * StringUtils.replaceChars("abcba", 'z', 'y') = "abcba"
     * </pre>
     *
     * @param str  String to replace characters in, may be null
     * @param searchChar  the character to search for, may be null
     * @param replaceChar  the character to replace, may be null
     * @return modified String, {@code null} if null string input
     * @since 2.0
     */
    public static String replaceChars(final String str, final char searchChar, final char replaceChar) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(7208);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7209);if ((((str == null)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7210)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7211)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7212);return null;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7213);return str.replace(searchChar, replaceChar);
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>Replaces multiple characters in a String in one go.
     * This method can also be used to delete characters.</p>
     *
     * <p>For example:<br />
     * <code>replaceChars(&quot;hello&quot;, &quot;ho&quot;, &quot;jy&quot;) = jelly</code>.</p>
     *
     * <p>A {@code null} string input returns {@code null}.
     * An empty ("") string input returns an empty string.
     * A null or empty set of search characters returns the input string.</p>
     *
     * <p>The length of the search characters should normally equal the length
     * of the replace characters.
     * If the search characters is longer, then the extra search characters
     * are deleted.
     * If the search characters is shorter, then the extra replace characters
     * are ignored.</p>
     *
     * <pre>
     * StringUtils.replaceChars(null, *, *)           = null
     * StringUtils.replaceChars("", *, *)             = ""
     * StringUtils.replaceChars("abc", null, *)       = "abc"
     * StringUtils.replaceChars("abc", "", *)         = "abc"
     * StringUtils.replaceChars("abc", "b", null)     = "ac"
     * StringUtils.replaceChars("abc", "b", "")       = "ac"
     * StringUtils.replaceChars("abcba", "bc", "yz")  = "ayzya"
     * StringUtils.replaceChars("abcba", "bc", "y")   = "ayya"
     * StringUtils.replaceChars("abcba", "bc", "yzx") = "ayzya"
     * </pre>
     *
     * @param str  String to replace characters in, may be null
     * @param searchChars  a set of characters to search for, may be null
     * @param replaceChars  a set of characters to replace, may be null
     * @return modified String, {@code null} if null string input
     * @since 2.0
     */
    public static String replaceChars(final String str, final String searchChars, String replaceChars) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(7214);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7215);if ((((isEmpty(str) || isEmpty(searchChars))&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7216)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7217)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7218);return str;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7219);if ((((replaceChars == null)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7220)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7221)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7222);replaceChars = EMPTY;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7223);boolean modified = false;
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7224);final int replaceCharsLength = replaceChars.length();
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7225);final int strLength = str.length();
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7226);final StringBuilder buf = new StringBuilder(strLength);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7227);for (int i = 0; (((i < strLength)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7228)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7229)==0&false)); i++) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7230);final char ch = str.charAt(i);
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7231);final int index = searchChars.indexOf(ch);
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7232);if ((((index >= 0)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7233)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7234)==0&false))) {{
                __CLR4_1_24d04d0l3lqxs2i.R.inc(7235);modified = true;
                __CLR4_1_24d04d0l3lqxs2i.R.inc(7236);if ((((index < replaceCharsLength)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7237)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7238)==0&false))) {{
                    __CLR4_1_24d04d0l3lqxs2i.R.inc(7239);buf.append(replaceChars.charAt(index));
                }
            }} }else {{
                __CLR4_1_24d04d0l3lqxs2i.R.inc(7240);buf.append(ch);
            }
        }}
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7241);if ((((modified)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7242)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7243)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7244);return buf.toString();
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7245);return str;
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    // Overlay
    //-----------------------------------------------------------------------
    /**
     * <p>Overlays part of a String with another String.</p>
     *
     * <p>A {@code null} string input returns {@code null}.
     * A negative index is treated as zero.
     * An index greater than the string length is treated as the string length.
     * The start index is always the smaller of the two indices.</p>
     *
     * <pre>
     * StringUtils.overlay(null, *, *, *)            = null
     * StringUtils.overlay("", "abc", 0, 0)          = "abc"
     * StringUtils.overlay("abcdef", null, 2, 4)     = "abef"
     * StringUtils.overlay("abcdef", "", 2, 4)       = "abef"
     * StringUtils.overlay("abcdef", "", 4, 2)       = "abef"
     * StringUtils.overlay("abcdef", "zzzz", 2, 4)   = "abzzzzef"
     * StringUtils.overlay("abcdef", "zzzz", 4, 2)   = "abzzzzef"
     * StringUtils.overlay("abcdef", "zzzz", -1, 4)  = "zzzzef"
     * StringUtils.overlay("abcdef", "zzzz", 2, 8)   = "abzzzz"
     * StringUtils.overlay("abcdef", "zzzz", -2, -3) = "zzzzabcdef"
     * StringUtils.overlay("abcdef", "zzzz", 8, 10)  = "abcdefzzzz"
     * </pre>
     *
     * @param str  the String to do overlaying in, may be null
     * @param overlay  the String to overlay, may be null
     * @param start  the position to start overlaying at
     * @param end  the position to stop overlaying before
     * @return overlayed String, {@code null} if null String input
     * @since 2.0
     */
    public static String overlay(final String str, String overlay, int start, int end) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(7246);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7247);if ((((str == null)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7248)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7249)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7250);return null;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7251);if ((((overlay == null)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7252)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7253)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7254);overlay = EMPTY;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7255);final int len = str.length();
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7256);if ((((start < 0)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7257)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7258)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7259);start = 0;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7260);if ((((start > len)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7261)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7262)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7263);start = len;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7264);if ((((end < 0)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7265)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7266)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7267);end = 0;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7268);if ((((end > len)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7269)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7270)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7271);end = len;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7272);if ((((start > end)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7273)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7274)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7275);final int temp = start;
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7276);start = end;
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7277);end = temp;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7278);return new StringBuilder(len + start - end + overlay.length() + 1)
            .append(str.substring(0, start))
            .append(overlay)
            .append(str.substring(end))
            .toString();
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    // Chomping
    //-----------------------------------------------------------------------
    /**
     * <p>Removes one newline from end of a String if it's there,
     * otherwise leave it alone.  A newline is &quot;{@code \n}&quot;,
     * &quot;{@code \r}&quot;, or &quot;{@code \r\n}&quot;.</p>
     *
     * <p>NOTE: This method changed in 2.0.
     * It now more closely matches Perl chomp.</p>
     *
     * <pre>
     * StringUtils.chomp(null)          = null
     * StringUtils.chomp("")            = ""
     * StringUtils.chomp("abc \r")      = "abc "
     * StringUtils.chomp("abc\n")       = "abc"
     * StringUtils.chomp("abc\r\n")     = "abc"
     * StringUtils.chomp("abc\r\n\r\n") = "abc\r\n"
     * StringUtils.chomp("abc\n\r")     = "abc\n"
     * StringUtils.chomp("abc\n\rabc")  = "abc\n\rabc"
     * StringUtils.chomp("\r")          = ""
     * StringUtils.chomp("\n")          = ""
     * StringUtils.chomp("\r\n")        = ""
     * </pre>
     *
     * @param str  the String to chomp a newline from, may be null
     * @return String without newline, {@code null} if null String input
     */
    public static String chomp(final String str) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(7279);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7280);if ((((isEmpty(str))&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7281)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7282)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7283);return str;
        }

        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7284);if ((((str.length() == 1)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7285)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7286)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7287);final char ch = str.charAt(0);
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7288);if ((((ch == CharUtils.CR || ch == CharUtils.LF)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7289)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7290)==0&false))) {{
                __CLR4_1_24d04d0l3lqxs2i.R.inc(7291);return EMPTY;
            }
            }__CLR4_1_24d04d0l3lqxs2i.R.inc(7292);return str;
        }

        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7293);int lastIdx = str.length() - 1;
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7294);final char last = str.charAt(lastIdx);

        __CLR4_1_24d04d0l3lqxs2i.R.inc(7295);if ((((last == CharUtils.LF)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7296)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7297)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7298);if ((((str.charAt(lastIdx - 1) == CharUtils.CR)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7299)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7300)==0&false))) {{
                __CLR4_1_24d04d0l3lqxs2i.R.inc(7301);lastIdx--;
            }
        }} }else {__CLR4_1_24d04d0l3lqxs2i.R.inc(7302);if ((((last != CharUtils.CR)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7303)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7304)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7305);lastIdx++;
        }
        }}__CLR4_1_24d04d0l3lqxs2i.R.inc(7306);return str.substring(0, lastIdx);
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>Removes {@code separator} from the end of
     * {@code str} if it's there, otherwise leave it alone.</p>
     *
     * <p>NOTE: This method changed in version 2.0.
     * It now more closely matches Perl chomp.
     * For the previous behavior, use {@link #substringBeforeLast(String, String)}.
     * This method uses {@link String#endsWith(String)}.</p>
     *
     * <pre>
     * StringUtils.chomp(null, *)         = null
     * StringUtils.chomp("", *)           = ""
     * StringUtils.chomp("foobar", "bar") = "foo"
     * StringUtils.chomp("foobar", "baz") = "foobar"
     * StringUtils.chomp("foo", "foo")    = ""
     * StringUtils.chomp("foo ", "foo")   = "foo "
     * StringUtils.chomp(" foo", "foo")   = " "
     * StringUtils.chomp("foo", "foooo")  = "foo"
     * StringUtils.chomp("foo", "")       = "foo"
     * StringUtils.chomp("foo", null)     = "foo"
     * </pre>
     *
     * @param str  the String to chomp from, may be null
     * @param separator  separator String, may be null
     * @return String without trailing separator, {@code null} if null String input
     * @deprecated This feature will be removed in Lang 4.0, use {@link StringUtils#removeEnd(String, String)} instead
     */
    @Deprecated
    public static String chomp(final String str, final String separator) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(7307);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7308);return removeEnd(str,separator);
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    // Chopping
    //-----------------------------------------------------------------------
    /**
     * <p>Remove the last character from a String.</p>
     *
     * <p>If the String ends in {@code \r\n}, then remove both
     * of them.</p>
     *
     * <pre>
     * StringUtils.chop(null)          = null
     * StringUtils.chop("")            = ""
     * StringUtils.chop("abc \r")      = "abc "
     * StringUtils.chop("abc\n")       = "abc"
     * StringUtils.chop("abc\r\n")     = "abc"
     * StringUtils.chop("abc")         = "ab"
     * StringUtils.chop("abc\nabc")    = "abc\nab"
     * StringUtils.chop("a")           = ""
     * StringUtils.chop("\r")          = ""
     * StringUtils.chop("\n")          = ""
     * StringUtils.chop("\r\n")        = ""
     * </pre>
     *
     * @param str  the String to chop last character from, may be null
     * @return String without last character, {@code null} if null String input
     */
    public static String chop(final String str) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(7309);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7310);if ((((str == null)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7311)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7312)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7313);return null;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7314);final int strLen = str.length();
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7315);if ((((strLen < 2)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7316)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7317)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7318);return EMPTY;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7319);final int lastIdx = strLen - 1;
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7320);final String ret = str.substring(0, lastIdx);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7321);final char last = str.charAt(lastIdx);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7322);if ((((last == CharUtils.LF && ret.charAt(lastIdx - 1) == CharUtils.CR)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7323)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7324)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7325);return ret.substring(0, lastIdx - 1);
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7326);return ret;
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    // Conversion
    //-----------------------------------------------------------------------

    // Padding
    //-----------------------------------------------------------------------
    /**
     * <p>Repeat a String {@code repeat} times to form a
     * new String.</p>
     *
     * <pre>
     * StringUtils.repeat(null, 2) = null
     * StringUtils.repeat("", 0)   = ""
     * StringUtils.repeat("", 2)   = ""
     * StringUtils.repeat("a", 3)  = "aaa"
     * StringUtils.repeat("ab", 2) = "abab"
     * StringUtils.repeat("a", -2) = ""
     * </pre>
     *
     * @param str  the String to repeat, may be null
     * @param repeat  number of times to repeat str, negative treated as zero
     * @return a new String consisting of the original String repeated,
     *  {@code null} if null String input
     */
    public static String repeat(final String str, final int repeat) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(7327);
        // Performance tuned for 2.0 (JDK1.4)

        __CLR4_1_24d04d0l3lqxs2i.R.inc(7328);if ((((str == null)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7329)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7330)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7331);return null;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7332);if ((((repeat <= 0)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7333)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7334)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7335);return EMPTY;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7336);final int inputLength = str.length();
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7337);if ((((repeat == 1 || inputLength == 0)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7338)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7339)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7340);return str;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7341);if ((((inputLength == 1 && repeat <= PAD_LIMIT)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7342)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7343)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7344);return repeat(str.charAt(0), repeat);
        }

        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7345);final int outputLength = inputLength * repeat;
        boolean __CLB4_1_2_bool0=false;__CLR4_1_24d04d0l3lqxs2i.R.inc(7346);switch (inputLength) {
            case 1 :if (!__CLB4_1_2_bool0) {__CLR4_1_24d04d0l3lqxs2i.R.inc(7347);__CLB4_1_2_bool0=true;}
                __CLR4_1_24d04d0l3lqxs2i.R.inc(7348);return repeat(str.charAt(0), repeat);
            case 2 :if (!__CLB4_1_2_bool0) {__CLR4_1_24d04d0l3lqxs2i.R.inc(7349);__CLB4_1_2_bool0=true;}
                __CLR4_1_24d04d0l3lqxs2i.R.inc(7350);final char ch0 = str.charAt(0);
                __CLR4_1_24d04d0l3lqxs2i.R.inc(7351);final char ch1 = str.charAt(1);
                __CLR4_1_24d04d0l3lqxs2i.R.inc(7352);final char[] output2 = new char[outputLength];
                __CLR4_1_24d04d0l3lqxs2i.R.inc(7353);for (int i = repeat * 2 - 2; (((i >= 0)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7354)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7355)==0&false)); i--, i--) {{
                    __CLR4_1_24d04d0l3lqxs2i.R.inc(7356);output2[i] = ch0;
                    __CLR4_1_24d04d0l3lqxs2i.R.inc(7357);output2[i + 1] = ch1;
                }
                }__CLR4_1_24d04d0l3lqxs2i.R.inc(7358);return new String(output2);
            default :if (!__CLB4_1_2_bool0) {__CLR4_1_24d04d0l3lqxs2i.R.inc(7359);__CLB4_1_2_bool0=true;}
                __CLR4_1_24d04d0l3lqxs2i.R.inc(7360);final StringBuilder buf = new StringBuilder(outputLength);
                __CLR4_1_24d04d0l3lqxs2i.R.inc(7361);for (int i = 0; (((i < repeat)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7362)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7363)==0&false)); i++) {{
                    __CLR4_1_24d04d0l3lqxs2i.R.inc(7364);buf.append(str);
                }
                }__CLR4_1_24d04d0l3lqxs2i.R.inc(7365);return buf.toString();
        }
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>Repeat a String {@code repeat} times to form a
     * new String, with a String separator injected each time. </p>
     *
     * <pre>
     * StringUtils.repeat(null, null, 2) = null
     * StringUtils.repeat(null, "x", 2)  = null
     * StringUtils.repeat("", null, 0)   = ""
     * StringUtils.repeat("", "", 2)     = ""
     * StringUtils.repeat("", "x", 3)    = "xxx"
     * StringUtils.repeat("?", ", ", 3)  = "?, ?, ?"
     * </pre>
     *
     * @param str        the String to repeat, may be null
     * @param separator  the String to inject, may be null
     * @param repeat     number of times to repeat str, negative treated as zero
     * @return a new String consisting of the original String repeated,
     *  {@code null} if null String input
     * @since 2.5
     */
    public static String repeat(final String str, final String separator, final int repeat) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(7366);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7367);if((((str == null || separator == null)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7368)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7369)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7370);return repeat(str, repeat);
        } }else {{
            // given that repeat(String, int) is quite optimized, better to rely on it than try and splice this into it
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7371);final String result = repeat(str + separator, repeat);
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7372);return removeEnd(result, separator);
        }
    }}finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>Returns padding using the specified delimiter repeated
     * to a given length.</p>
     *
     * <pre>
     * StringUtils.repeat('e', 0)  = ""
     * StringUtils.repeat('e', 3)  = "eee"
     * StringUtils.repeat('e', -2) = ""
     * </pre>
     *
     * <p>Note: this method doesn't not support padding with
     * <a href="http://www.unicode.org/glossary/#supplementary_character">Unicode Supplementary Characters</a>
     * as they require a pair of {@code char}s to be represented.
     * If you are needing to support full I18N of your applications
     * consider using {@link #repeat(String, int)} instead.
     * </p>
     *
     * @param ch  character to repeat
     * @param repeat  number of times to repeat char, negative treated as zero
     * @return String with repeated character
     * @see #repeat(String, int)
     */
    public static String repeat(final char ch, final int repeat) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(7373);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7374);final char[] buf = new char[repeat];
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7375);for (int i = repeat - 1; (((i >= 0)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7376)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7377)==0&false)); i--) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7378);buf[i] = ch;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7379);return new String(buf);
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>Right pad a String with spaces (' ').</p>
     *
     * <p>The String is padded to the size of {@code size}.</p>
     *
     * <pre>
     * StringUtils.rightPad(null, *)   = null
     * StringUtils.rightPad("", 3)     = "   "
     * StringUtils.rightPad("bat", 3)  = "bat"
     * StringUtils.rightPad("bat", 5)  = "bat  "
     * StringUtils.rightPad("bat", 1)  = "bat"
     * StringUtils.rightPad("bat", -1) = "bat"
     * </pre>
     *
     * @param str  the String to pad out, may be null
     * @param size  the size to pad to
     * @return right padded String or original String if no padding is necessary,
     *  {@code null} if null String input
     */
    public static String rightPad(final String str, final int size) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(7380);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7381);return rightPad(str, size, ' ');
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>Right pad a String with a specified character.</p>
     *
     * <p>The String is padded to the size of {@code size}.</p>
     *
     * <pre>
     * StringUtils.rightPad(null, *, *)     = null
     * StringUtils.rightPad("", 3, 'z')     = "zzz"
     * StringUtils.rightPad("bat", 3, 'z')  = "bat"
     * StringUtils.rightPad("bat", 5, 'z')  = "batzz"
     * StringUtils.rightPad("bat", 1, 'z')  = "bat"
     * StringUtils.rightPad("bat", -1, 'z') = "bat"
     * </pre>
     *
     * @param str  the String to pad out, may be null
     * @param size  the size to pad to
     * @param padChar  the character to pad with
     * @return right padded String or original String if no padding is necessary,
     *  {@code null} if null String input
     * @since 2.0
     */
    public static String rightPad(final String str, final int size, final char padChar) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(7382);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7383);if ((((str == null)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7384)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7385)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7386);return null;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7387);final int pads = size - str.length();
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7388);if ((((pads <= 0)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7389)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7390)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7391);return str; // returns original String when possible
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7392);if ((((pads > PAD_LIMIT)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7393)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7394)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7395);return rightPad(str, size, String.valueOf(padChar));
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7396);return str.concat(repeat(padChar, pads));
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>Right pad a String with a specified String.</p>
     *
     * <p>The String is padded to the size of {@code size}.</p>
     *
     * <pre>
     * StringUtils.rightPad(null, *, *)      = null
     * StringUtils.rightPad("", 3, "z")      = "zzz"
     * StringUtils.rightPad("bat", 3, "yz")  = "bat"
     * StringUtils.rightPad("bat", 5, "yz")  = "batyz"
     * StringUtils.rightPad("bat", 8, "yz")  = "batyzyzy"
     * StringUtils.rightPad("bat", 1, "yz")  = "bat"
     * StringUtils.rightPad("bat", -1, "yz") = "bat"
     * StringUtils.rightPad("bat", 5, null)  = "bat  "
     * StringUtils.rightPad("bat", 5, "")    = "bat  "
     * </pre>
     *
     * @param str  the String to pad out, may be null
     * @param size  the size to pad to
     * @param padStr  the String to pad with, null or empty treated as single space
     * @return right padded String or original String if no padding is necessary,
     *  {@code null} if null String input
     */
    public static String rightPad(final String str, final int size, String padStr) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(7397);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7398);if ((((str == null)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7399)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7400)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7401);return null;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7402);if ((((isEmpty(padStr))&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7403)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7404)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7405);padStr = SPACE;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7406);final int padLen = padStr.length();
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7407);final int strLen = str.length();
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7408);final int pads = size - strLen;
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7409);if ((((pads <= 0)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7410)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7411)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7412);return str; // returns original String when possible
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7413);if ((((padLen == 1 && pads <= PAD_LIMIT)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7414)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7415)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7416);return rightPad(str, size, padStr.charAt(0));
        }

        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7417);if ((((pads == padLen)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7418)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7419)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7420);return str.concat(padStr);
        } }else {__CLR4_1_24d04d0l3lqxs2i.R.inc(7421);if ((((pads < padLen)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7422)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7423)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7424);return str.concat(padStr.substring(0, pads));
        } }else {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7425);final char[] padding = new char[pads];
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7426);final char[] padChars = padStr.toCharArray();
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7427);for (int i = 0; (((i < pads)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7428)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7429)==0&false)); i++) {{
                __CLR4_1_24d04d0l3lqxs2i.R.inc(7430);padding[i] = padChars[i % padLen];
            }
            }__CLR4_1_24d04d0l3lqxs2i.R.inc(7431);return str.concat(new String(padding));
        }
    }}}finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>Left pad a String with spaces (' ').</p>
     *
     * <p>The String is padded to the size of {@code size}.</p>
     *
     * <pre>
     * StringUtils.leftPad(null, *)   = null
     * StringUtils.leftPad("", 3)     = "   "
     * StringUtils.leftPad("bat", 3)  = "bat"
     * StringUtils.leftPad("bat", 5)  = "  bat"
     * StringUtils.leftPad("bat", 1)  = "bat"
     * StringUtils.leftPad("bat", -1) = "bat"
     * </pre>
     *
     * @param str  the String to pad out, may be null
     * @param size  the size to pad to
     * @return left padded String or original String if no padding is necessary,
     *  {@code null} if null String input
     */
    public static String leftPad(final String str, final int size) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(7432);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7433);return leftPad(str, size, ' ');
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>Left pad a String with a specified character.</p>
     *
     * <p>Pad to a size of {@code size}.</p>
     *
     * <pre>
     * StringUtils.leftPad(null, *, *)     = null
     * StringUtils.leftPad("", 3, 'z')     = "zzz"
     * StringUtils.leftPad("bat", 3, 'z')  = "bat"
     * StringUtils.leftPad("bat", 5, 'z')  = "zzbat"
     * StringUtils.leftPad("bat", 1, 'z')  = "bat"
     * StringUtils.leftPad("bat", -1, 'z') = "bat"
     * </pre>
     *
     * @param str  the String to pad out, may be null
     * @param size  the size to pad to
     * @param padChar  the character to pad with
     * @return left padded String or original String if no padding is necessary,
     *  {@code null} if null String input
     * @since 2.0
     */
    public static String leftPad(final String str, final int size, final char padChar) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(7434);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7435);if ((((str == null)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7436)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7437)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7438);return null;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7439);final int pads = size - str.length();
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7440);if ((((pads <= 0)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7441)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7442)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7443);return str; // returns original String when possible
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7444);if ((((pads > PAD_LIMIT)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7445)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7446)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7447);return leftPad(str, size, String.valueOf(padChar));
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7448);return repeat(padChar, pads).concat(str);
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>Left pad a String with a specified String.</p>
     *
     * <p>Pad to a size of {@code size}.</p>
     *
     * <pre>
     * StringUtils.leftPad(null, *, *)      = null
     * StringUtils.leftPad("", 3, "z")      = "zzz"
     * StringUtils.leftPad("bat", 3, "yz")  = "bat"
     * StringUtils.leftPad("bat", 5, "yz")  = "yzbat"
     * StringUtils.leftPad("bat", 8, "yz")  = "yzyzybat"
     * StringUtils.leftPad("bat", 1, "yz")  = "bat"
     * StringUtils.leftPad("bat", -1, "yz") = "bat"
     * StringUtils.leftPad("bat", 5, null)  = "  bat"
     * StringUtils.leftPad("bat", 5, "")    = "  bat"
     * </pre>
     *
     * @param str  the String to pad out, may be null
     * @param size  the size to pad to
     * @param padStr  the String to pad with, null or empty treated as single space
     * @return left padded String or original String if no padding is necessary,
     *  {@code null} if null String input
     */
    public static String leftPad(final String str, final int size, String padStr) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(7449);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7450);if ((((str == null)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7451)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7452)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7453);return null;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7454);if ((((isEmpty(padStr))&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7455)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7456)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7457);padStr = SPACE;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7458);final int padLen = padStr.length();
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7459);final int strLen = str.length();
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7460);final int pads = size - strLen;
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7461);if ((((pads <= 0)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7462)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7463)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7464);return str; // returns original String when possible
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7465);if ((((padLen == 1 && pads <= PAD_LIMIT)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7466)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7467)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7468);return leftPad(str, size, padStr.charAt(0));
        }

        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7469);if ((((pads == padLen)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7470)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7471)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7472);return padStr.concat(str);
        } }else {__CLR4_1_24d04d0l3lqxs2i.R.inc(7473);if ((((pads < padLen)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7474)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7475)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7476);return padStr.substring(0, pads).concat(str);
        } }else {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7477);final char[] padding = new char[pads];
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7478);final char[] padChars = padStr.toCharArray();
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7479);for (int i = 0; (((i < pads)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7480)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7481)==0&false)); i++) {{
                __CLR4_1_24d04d0l3lqxs2i.R.inc(7482);padding[i] = padChars[i % padLen];
            }
            }__CLR4_1_24d04d0l3lqxs2i.R.inc(7483);return new String(padding).concat(str);
        }
    }}}finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * Gets a CharSequence length or {@code 0} if the CharSequence is
     * {@code null}.
     *
     * @param cs
     *            a CharSequence or {@code null}
     * @return CharSequence length or {@code 0} if the CharSequence is
     *         {@code null}.
     * @since 2.4
     * @since 3.0 Changed signature from length(String) to length(CharSequence)
     */
    public static int length(final CharSequence cs) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(7484);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7485);return (((cs == null )&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7486)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7487)==0&false))? 0 : cs.length();
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    // Centering
    //-----------------------------------------------------------------------
    /**
     * <p>Centers a String in a larger String of size {@code size}
     * using the space character (' ').<p>
     *
     * <p>If the size is less than the String length, the String is returned.
     * A {@code null} String returns {@code null}.
     * A negative size is treated as zero.</p>
     *
     * <p>Equivalent to {@code center(str, size, " ")}.</p>
     *
     * <pre>
     * StringUtils.center(null, *)   = null
     * StringUtils.center("", 4)     = "    "
     * StringUtils.center("ab", -1)  = "ab"
     * StringUtils.center("ab", 4)   = " ab "
     * StringUtils.center("abcd", 2) = "abcd"
     * StringUtils.center("a", 4)    = " a  "
     * </pre>
     *
     * @param str  the String to center, may be null
     * @param size  the int size of new String, negative treated as zero
     * @return centered String, {@code null} if null String input
     */
    public static String center(final String str, final int size) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(7488);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7489);return center(str, size, ' ');
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>Centers a String in a larger String of size {@code size}.
     * Uses a supplied character as the value to pad the String with.</p>
     *
     * <p>If the size is less than the String length, the String is returned.
     * A {@code null} String returns {@code null}.
     * A negative size is treated as zero.</p>
     *
     * <pre>
     * StringUtils.center(null, *, *)     = null
     * StringUtils.center("", 4, ' ')     = "    "
     * StringUtils.center("ab", -1, ' ')  = "ab"
     * StringUtils.center("ab", 4, ' ')   = " ab "
     * StringUtils.center("abcd", 2, ' ') = "abcd"
     * StringUtils.center("a", 4, ' ')    = " a  "
     * StringUtils.center("a", 4, 'y')    = "yayy"
     * </pre>
     *
     * @param str  the String to center, may be null
     * @param size  the int size of new String, negative treated as zero
     * @param padChar  the character to pad the new String with
     * @return centered String, {@code null} if null String input
     * @since 2.0
     */
    public static String center(String str, final int size, final char padChar) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(7490);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7491);if ((((str == null || size <= 0)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7492)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7493)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7494);return str;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7495);final int strLen = str.length();
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7496);final int pads = size - strLen;
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7497);if ((((pads <= 0)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7498)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7499)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7500);return str;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7501);str = leftPad(str, strLen + pads / 2, padChar);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7502);str = rightPad(str, size, padChar);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7503);return str;
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>Centers a String in a larger String of size {@code size}.
     * Uses a supplied String as the value to pad the String with.</p>
     *
     * <p>If the size is less than the String length, the String is returned.
     * A {@code null} String returns {@code null}.
     * A negative size is treated as zero.</p>
     *
     * <pre>
     * StringUtils.center(null, *, *)     = null
     * StringUtils.center("", 4, " ")     = "    "
     * StringUtils.center("ab", -1, " ")  = "ab"
     * StringUtils.center("ab", 4, " ")   = " ab "
     * StringUtils.center("abcd", 2, " ") = "abcd"
     * StringUtils.center("a", 4, " ")    = " a  "
     * StringUtils.center("a", 4, "yz")   = "yayz"
     * StringUtils.center("abc", 7, null) = "  abc  "
     * StringUtils.center("abc", 7, "")   = "  abc  "
     * </pre>
     *
     * @param str  the String to center, may be null
     * @param size  the int size of new String, negative treated as zero
     * @param padStr  the String to pad the new String with, must not be null or empty
     * @return centered String, {@code null} if null String input
     * @throws IllegalArgumentException if padStr is {@code null} or empty
     */
    public static String center(String str, final int size, String padStr) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(7504);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7505);if ((((str == null || size <= 0)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7506)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7507)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7508);return str;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7509);if ((((isEmpty(padStr))&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7510)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7511)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7512);padStr = SPACE;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7513);final int strLen = str.length();
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7514);final int pads = size - strLen;
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7515);if ((((pads <= 0)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7516)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7517)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7518);return str;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7519);str = leftPad(str, strLen + pads / 2, padStr);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7520);str = rightPad(str, size, padStr);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7521);return str;
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    // Case conversion
    //-----------------------------------------------------------------------
    /**
     * <p>Converts a String to upper case as per {@link String#toUpperCase()}.</p>
     *
     * <p>A {@code null} input String returns {@code null}.</p>
     *
     * <pre>
     * StringUtils.upperCase(null)  = null
     * StringUtils.upperCase("")    = ""
     * StringUtils.upperCase("aBc") = "ABC"
     * </pre>
     *
     * <p><strong>Note:</strong> As described in the documentation for {@link String#toUpperCase()},
     * the result of this method is affected by the current locale.
     * For platform-independent case transformations, the method {@link #lowerCase(String, Locale)}
     * should be used with a specific locale (e.g. {@link Locale#ENGLISH}).</p>
     *
     * @param str  the String to upper case, may be null
     * @return the upper cased String, {@code null} if null String input
     */
    public static String upperCase(final String str) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(7522);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7523);if ((((str == null)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7524)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7525)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7526);return null;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7527);return str.toUpperCase();
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>Converts a String to upper case as per {@link String#toUpperCase(Locale)}.</p>
     *
     * <p>A {@code null} input String returns {@code null}.</p>
     *
     * <pre>
     * StringUtils.upperCase(null, Locale.ENGLISH)  = null
     * StringUtils.upperCase("", Locale.ENGLISH)    = ""
     * StringUtils.upperCase("aBc", Locale.ENGLISH) = "ABC"
     * </pre>
     *
     * @param str  the String to upper case, may be null
     * @param locale  the locale that defines the case transformation rules, must not be null
     * @return the upper cased String, {@code null} if null String input
     * @since 2.5
     */
    public static String upperCase(final String str, final Locale locale) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(7528);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7529);if ((((str == null)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7530)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7531)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7532);return null;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7533);return str.toUpperCase(locale);
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>Converts a String to lower case as per {@link String#toLowerCase()}.</p>
     *
     * <p>A {@code null} input String returns {@code null}.</p>
     *
     * <pre>
     * StringUtils.lowerCase(null)  = null
     * StringUtils.lowerCase("")    = ""
     * StringUtils.lowerCase("aBc") = "abc"
     * </pre>
     *
     * <p><strong>Note:</strong> As described in the documentation for {@link String#toLowerCase()},
     * the result of this method is affected by the current locale.
     * For platform-independent case transformations, the method {@link #lowerCase(String, Locale)}
     * should be used with a specific locale (e.g. {@link Locale#ENGLISH}).</p>
     *
     * @param str  the String to lower case, may be null
     * @return the lower cased String, {@code null} if null String input
     */
    public static String lowerCase(final String str) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(7534);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7535);if ((((str == null)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7536)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7537)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7538);return null;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7539);return str.toLowerCase();
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>Converts a String to lower case as per {@link String#toLowerCase(Locale)}.</p>
     *
     * <p>A {@code null} input String returns {@code null}.</p>
     *
     * <pre>
     * StringUtils.lowerCase(null, Locale.ENGLISH)  = null
     * StringUtils.lowerCase("", Locale.ENGLISH)    = ""
     * StringUtils.lowerCase("aBc", Locale.ENGLISH) = "abc"
     * </pre>
     *
     * @param str  the String to lower case, may be null
     * @param locale  the locale that defines the case transformation rules, must not be null
     * @return the lower cased String, {@code null} if null String input
     * @since 2.5
     */
    public static String lowerCase(final String str, final Locale locale) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(7540);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7541);if ((((str == null)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7542)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7543)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7544);return null;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7545);return str.toLowerCase(locale);
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>Capitalizes a String changing the first letter to title case as
     * per {@link Character#toTitleCase(char)}. No other letters are changed.</p>
     *
     * <p>For a word based algorithm, see {@link org.apache.commons.lang3.text.WordUtils#capitalize(String)}.
     * A {@code null} input String returns {@code null}.</p>
     *
     * <pre>
     * StringUtils.capitalize(null)  = null
     * StringUtils.capitalize("")    = ""
     * StringUtils.capitalize("cat") = "Cat"
     * StringUtils.capitalize("cAt") = "CAt"
     * </pre>
     *
     * @param str the String to capitalize, may be null
     * @return the capitalized String, {@code null} if null String input
     * @see org.apache.commons.lang3.text.WordUtils#capitalize(String)
     * @see #uncapitalize(String)
     * @since 2.0
     */
    public static String capitalize(final String str) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(7546);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7547);int strLen;
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7548);if (str == null || (strLen = str.length()) == 0) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7551);return str;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7552);return new StringBuilder(strLen)
            .append(Character.toTitleCase(str.charAt(0)))
            .append(str.substring(1))
            .toString();
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>Uncapitalizes a String changing the first letter to title case as
     * per {@link Character#toLowerCase(char)}. No other letters are changed.</p>
     *
     * <p>For a word based algorithm, see {@link org.apache.commons.lang3.text.WordUtils#uncapitalize(String)}.
     * A {@code null} input String returns {@code null}.</p>
     *
     * <pre>
     * StringUtils.uncapitalize(null)  = null
     * StringUtils.uncapitalize("")    = ""
     * StringUtils.uncapitalize("Cat") = "cat"
     * StringUtils.uncapitalize("CAT") = "cAT"
     * </pre>
     *
     * @param str the String to uncapitalize, may be null
     * @return the uncapitalized String, {@code null} if null String input
     * @see org.apache.commons.lang3.text.WordUtils#uncapitalize(String)
     * @see #capitalize(String)
     * @since 2.0
     */
    public static String uncapitalize(final String str) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(7553);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7554);int strLen;
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7555);if (str == null || (strLen = str.length()) == 0) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7558);return str;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7559);return new StringBuilder(strLen)
            .append(Character.toLowerCase(str.charAt(0)))
            .append(str.substring(1))
            .toString();
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>Swaps the case of a String changing upper and title case to
     * lower case, and lower case to upper case.</p>
     *
     * <ul>
     *  <li>Upper case character converts to Lower case</li>
     *  <li>Title case character converts to Lower case</li>
     *  <li>Lower case character converts to Upper case</li>
     * </ul>
     *
     * <p>For a word based algorithm, see {@link org.apache.commons.lang3.text.WordUtils#swapCase(String)}.
     * A {@code null} input String returns {@code null}.</p>
     *
     * <pre>
     * StringUtils.swapCase(null)                 = null
     * StringUtils.swapCase("")                   = ""
     * StringUtils.swapCase("The dog has a BONE") = "tHE DOG HAS A bone"
     * </pre>
     *
     * <p>NOTE: This method changed in Lang version 2.0.
     * It no longer performs a word based algorithm.
     * If you only use ASCII, you will notice no change.
     * That functionality is available in org.apache.commons.lang3.text.WordUtils.</p>
     *
     * @param str  the String to swap case, may be null
     * @return the changed String, {@code null} if null String input
     */
    public static String swapCase(final String str) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(7560);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7561);if ((((StringUtils.isEmpty(str))&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7562)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7563)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7564);return str;
        }

        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7565);final char[] buffer = str.toCharArray();

        __CLR4_1_24d04d0l3lqxs2i.R.inc(7566);for (int i = 0; (((i < buffer.length)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7567)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7568)==0&false)); i++) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7569);final char ch = buffer[i];
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7570);if ((((Character.isUpperCase(ch))&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7571)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7572)==0&false))) {{
                __CLR4_1_24d04d0l3lqxs2i.R.inc(7573);buffer[i] = Character.toLowerCase(ch);
            } }else {__CLR4_1_24d04d0l3lqxs2i.R.inc(7574);if ((((Character.isTitleCase(ch))&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7575)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7576)==0&false))) {{
                __CLR4_1_24d04d0l3lqxs2i.R.inc(7577);buffer[i] = Character.toLowerCase(ch);
            } }else {__CLR4_1_24d04d0l3lqxs2i.R.inc(7578);if ((((Character.isLowerCase(ch))&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7579)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7580)==0&false))) {{
                __CLR4_1_24d04d0l3lqxs2i.R.inc(7581);buffer[i] = Character.toUpperCase(ch);
            }
        }}}}
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7582);return new String(buffer);
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    // Count matches
    //-----------------------------------------------------------------------
    /**
     * <p>Counts how many times the substring appears in the larger string.</p>
     *
     * <p>A {@code null} or empty ("") String input returns {@code 0}.</p>
     *
     * <pre>
     * StringUtils.countMatches(null, *)       = 0
     * StringUtils.countMatches("", *)         = 0
     * StringUtils.countMatches("abba", null)  = 0
     * StringUtils.countMatches("abba", "")    = 0
     * StringUtils.countMatches("abba", "a")   = 2
     * StringUtils.countMatches("abba", "ab")  = 1
     * StringUtils.countMatches("abba", "xxx") = 0
     * </pre>
     *
     * @param str  the CharSequence to check, may be null
     * @param sub  the substring to count, may be null
     * @return the number of occurrences, 0 if either CharSequence is {@code null}
     * @since 3.0 Changed signature from countMatches(String, String) to countMatches(CharSequence, CharSequence)
     */
    public static int countMatches(final CharSequence str, final CharSequence sub) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(7583);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7584);if ((((isEmpty(str) || isEmpty(sub))&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7585)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7586)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7587);return 0;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7588);int count = 0;
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7589);int idx = 0;
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7590);while ((idx = CharSequenceUtils.indexOf(str, sub, idx)) != INDEX_NOT_FOUND) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7593);count++;
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7594);idx += sub.length();
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7595);return count;
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    // Character Tests
    //-----------------------------------------------------------------------
    /**
     * <p>Checks if the CharSequence contains only Unicode letters.</p>
     *
     * <p>{@code null} will return {@code false}.
     * An empty CharSequence (length()=0) will return {@code false}.</p>
     *
     * <pre>
     * StringUtils.isAlpha(null)   = false
     * StringUtils.isAlpha("")     = false
     * StringUtils.isAlpha("  ")   = false
     * StringUtils.isAlpha("abc")  = true
     * StringUtils.isAlpha("ab2c") = false
     * StringUtils.isAlpha("ab-c") = false
     * </pre>
     *
     * @param cs  the CharSequence to check, may be null
     * @return {@code true} if only contains letters, and is non-null
     * @since 3.0 Changed signature from isAlpha(String) to isAlpha(CharSequence)
     * @since 3.0 Changed "" to return false and not true
     */
    public static boolean isAlpha(final CharSequence cs) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(7596);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7597);if ((((cs == null || cs.length() == 0)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7598)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7599)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7600);return false;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7601);final int sz = cs.length();
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7602);for (int i = 0; (((i < sz)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7603)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7604)==0&false)); i++) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7605);if ((((Character.isLetter(cs.charAt(i)) == false)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7606)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7607)==0&false))) {{
                __CLR4_1_24d04d0l3lqxs2i.R.inc(7608);return false;
            }
        }}
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7609);return true;
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>Checks if the CharSequence contains only Unicode letters and
     * space (' ').</p>
     *
     * <p>{@code null} will return {@code false}
     * An empty CharSequence (length()=0) will return {@code true}.</p>
     *
     * <pre>
     * StringUtils.isAlphaSpace(null)   = false
     * StringUtils.isAlphaSpace("")     = true
     * StringUtils.isAlphaSpace("  ")   = true
     * StringUtils.isAlphaSpace("abc")  = true
     * StringUtils.isAlphaSpace("ab c") = true
     * StringUtils.isAlphaSpace("ab2c") = false
     * StringUtils.isAlphaSpace("ab-c") = false
     * </pre>
     *
     * @param cs  the CharSequence to check, may be null
     * @return {@code true} if only contains letters and space,
     *  and is non-null
     * @since 3.0 Changed signature from isAlphaSpace(String) to isAlphaSpace(CharSequence)
     */
    public static boolean isAlphaSpace(final CharSequence cs) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(7610);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7611);if ((((cs == null)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7612)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7613)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7614);return false;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7615);final int sz = cs.length();
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7616);for (int i = 0; (((i < sz)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7617)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7618)==0&false)); i++) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7619);if ((((Character.isLetter(cs.charAt(i)) == false && cs.charAt(i) != ' ')&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7620)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7621)==0&false))) {{
                __CLR4_1_24d04d0l3lqxs2i.R.inc(7622);return false;
            }
        }}
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7623);return true;
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>Checks if the CharSequence contains only Unicode letters or digits.</p>
     *
     * <p>{@code null} will return {@code false}.
     * An empty CharSequence (length()=0) will return {@code false}.</p>
     *
     * <pre>
     * StringUtils.isAlphanumeric(null)   = false
     * StringUtils.isAlphanumeric("")     = false
     * StringUtils.isAlphanumeric("  ")   = false
     * StringUtils.isAlphanumeric("abc")  = true
     * StringUtils.isAlphanumeric("ab c") = false
     * StringUtils.isAlphanumeric("ab2c") = true
     * StringUtils.isAlphanumeric("ab-c") = false
     * </pre>
     *
     * @param cs  the CharSequence to check, may be null
     * @return {@code true} if only contains letters or digits,
     *  and is non-null
     * @since 3.0 Changed signature from isAlphanumeric(String) to isAlphanumeric(CharSequence)
     * @since 3.0 Changed "" to return false and not true
     */
    public static boolean isAlphanumeric(final CharSequence cs) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(7624);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7625);if ((((cs == null || cs.length() == 0)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7626)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7627)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7628);return false;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7629);final int sz = cs.length();
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7630);for (int i = 0; (((i < sz)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7631)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7632)==0&false)); i++) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7633);if ((((Character.isLetterOrDigit(cs.charAt(i)) == false)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7634)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7635)==0&false))) {{
                __CLR4_1_24d04d0l3lqxs2i.R.inc(7636);return false;
            }
        }}
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7637);return true;
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>Checks if the CharSequence contains only Unicode letters, digits
     * or space ({@code ' '}).</p>
     *
     * <p>{@code null} will return {@code false}.
     * An empty CharSequence (length()=0) will return {@code true}.</p>
     *
     * <pre>
     * StringUtils.isAlphanumericSpace(null)   = false
     * StringUtils.isAlphanumericSpace("")     = true
     * StringUtils.isAlphanumericSpace("  ")   = true
     * StringUtils.isAlphanumericSpace("abc")  = true
     * StringUtils.isAlphanumericSpace("ab c") = true
     * StringUtils.isAlphanumericSpace("ab2c") = true
     * StringUtils.isAlphanumericSpace("ab-c") = false
     * </pre>
     *
     * @param cs  the CharSequence to check, may be null
     * @return {@code true} if only contains letters, digits or space,
     *  and is non-null
     * @since 3.0 Changed signature from isAlphanumericSpace(String) to isAlphanumericSpace(CharSequence)
     */
    public static boolean isAlphanumericSpace(final CharSequence cs) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(7638);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7639);if ((((cs == null)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7640)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7641)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7642);return false;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7643);final int sz = cs.length();
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7644);for (int i = 0; (((i < sz)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7645)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7646)==0&false)); i++) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7647);if ((((Character.isLetterOrDigit(cs.charAt(i)) == false && cs.charAt(i) != ' ')&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7648)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7649)==0&false))) {{
                __CLR4_1_24d04d0l3lqxs2i.R.inc(7650);return false;
            }
        }}
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7651);return true;
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>Checks if the CharSequence contains only ASCII printable characters.</p>
     *
     * <p>{@code null} will return {@code false}.
     * An empty CharSequence (length()=0) will return {@code true}.</p>
     *
     * <pre>
     * StringUtils.isAsciiPrintable(null)     = false
     * StringUtils.isAsciiPrintable("")       = true
     * StringUtils.isAsciiPrintable(" ")      = true
     * StringUtils.isAsciiPrintable("Ceki")   = true
     * StringUtils.isAsciiPrintable("ab2c")   = true
     * StringUtils.isAsciiPrintable("!ab-c~") = true
     * StringUtils.isAsciiPrintable(" ") = true
     * StringUtils.isAsciiPrintable("!") = true
     * StringUtils.isAsciiPrintable("~") = true
     * StringUtils.isAsciiPrintable("") = false
     * StringUtils.isAsciiPrintable("Ceki G\u00fclc\u00fc") = false
     * </pre>
     *
     * @param cs the CharSequence to check, may be null
     * @return {@code true} if every character is in the range
     *  32 thru 126
     * @since 2.1
     * @since 3.0 Changed signature from isAsciiPrintable(String) to isAsciiPrintable(CharSequence)
     */
    public static boolean isAsciiPrintable(final CharSequence cs) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(7652);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7653);if ((((cs == null)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7654)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7655)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7656);return false;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7657);final int sz = cs.length();
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7658);for (int i = 0; (((i < sz)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7659)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7660)==0&false)); i++) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7661);if ((((CharUtils.isAsciiPrintable(cs.charAt(i)) == false)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7662)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7663)==0&false))) {{
                __CLR4_1_24d04d0l3lqxs2i.R.inc(7664);return false;
            }
        }}
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7665);return true;
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>Checks if the CharSequence contains only Unicode digits.
     * A decimal point is not a Unicode digit and returns false.</p>
     *
     * <p>{@code null} will return {@code false}.
     * An empty CharSequence (length()=0) will return {@code false}.</p>
     *
     * <p>Note that the method does not allow for a leading sign, either positive or negative.
     * Also, if a String passes the numeric test, it may still generate a NumberFormatException
     * when parsed by Integer.parseInt or Long.parseLong, e.g. if the value is outside the range
     * for int or long respectively.</p>
     *
     * <pre>
     * StringUtils.isNumeric(null)   = false
     * StringUtils.isNumeric("")     = false
     * StringUtils.isNumeric("  ")   = false
     * StringUtils.isNumeric("123")  = true
     * StringUtils.isNumeric("12 3") = false
     * StringUtils.isNumeric("ab2c") = false
     * StringUtils.isNumeric("12-3") = false
     * StringUtils.isNumeric("12.3") = false
     * StringUtils.isNumeric("-123") = false
     * StringUtils.isNumeric("+123") = false
     * </pre>
     *
     * @param cs  the CharSequence to check, may be null
     * @return {@code true} if only contains digits, and is non-null
     * @since 3.0 Changed signature from isNumeric(String) to isNumeric(CharSequence)
     * @since 3.0 Changed "" to return false and not true
     */
    public static boolean isNumeric(final CharSequence cs) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(7666);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7667);if ((((cs == null || cs.length() == 0)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7668)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7669)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7670);return false;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7671);final int sz = cs.length();
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7672);for (int i = 0; (((i < sz)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7673)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7674)==0&false)); i++) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7675);if ((((Character.isDigit(cs.charAt(i)) == false)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7676)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7677)==0&false))) {{
                __CLR4_1_24d04d0l3lqxs2i.R.inc(7678);return false;
            }
        }}
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7679);return true;
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>Checks if the CharSequence contains only Unicode digits or space
     * ({@code ' '}).
     * A decimal point is not a Unicode digit and returns false.</p>
     *
     * <p>{@code null} will return {@code false}.
     * An empty CharSequence (length()=0) will return {@code true}.</p>
     *
     * <pre>
     * StringUtils.isNumericSpace(null)   = false
     * StringUtils.isNumericSpace("")     = true
     * StringUtils.isNumericSpace("  ")   = true
     * StringUtils.isNumericSpace("123")  = true
     * StringUtils.isNumericSpace("12 3") = true
     * StringUtils.isNumericSpace("ab2c") = false
     * StringUtils.isNumericSpace("12-3") = false
     * StringUtils.isNumericSpace("12.3") = false
     * </pre>
     *
     * @param cs  the CharSequence to check, may be null
     * @return {@code true} if only contains digits or space,
     *  and is non-null
     * @since 3.0 Changed signature from isNumericSpace(String) to isNumericSpace(CharSequence)
     */
    public static boolean isNumericSpace(final CharSequence cs) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(7680);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7681);if ((((cs == null)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7682)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7683)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7684);return false;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7685);final int sz = cs.length();
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7686);for (int i = 0; (((i < sz)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7687)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7688)==0&false)); i++) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7689);if ((((Character.isDigit(cs.charAt(i)) == false && cs.charAt(i) != ' ')&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7690)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7691)==0&false))) {{
                __CLR4_1_24d04d0l3lqxs2i.R.inc(7692);return false;
            }
        }}
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7693);return true;
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>Checks if the CharSequence contains only whitespace.</p>
     *
     * <p>{@code null} will return {@code false}.
     * An empty CharSequence (length()=0) will return {@code true}.</p>
     *
     * <pre>
     * StringUtils.isWhitespace(null)   = false
     * StringUtils.isWhitespace("")     = true
     * StringUtils.isWhitespace("  ")   = true
     * StringUtils.isWhitespace("abc")  = false
     * StringUtils.isWhitespace("ab2c") = false
     * StringUtils.isWhitespace("ab-c") = false
     * </pre>
     *
     * @param cs  the CharSequence to check, may be null
     * @return {@code true} if only contains whitespace, and is non-null
     * @since 2.0
     * @since 3.0 Changed signature from isWhitespace(String) to isWhitespace(CharSequence)
     */
    public static boolean isWhitespace(final CharSequence cs) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(7694);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7695);if ((((cs == null)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7696)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7697)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7698);return false;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7699);final int sz = cs.length();
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7700);for (int i = 0; (((i < sz)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7701)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7702)==0&false)); i++) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7703);if ((((Character.isWhitespace(cs.charAt(i)) == false)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7704)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7705)==0&false))) {{
                __CLR4_1_24d04d0l3lqxs2i.R.inc(7706);return false;
            }
        }}
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7707);return true;
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>Checks if the CharSequence contains only lowercase characters.</p>
     *
     * <p>{@code null} will return {@code false}.
     * An empty CharSequence (length()=0) will return {@code false}.</p>
     *
     * <pre>
     * StringUtils.isAllLowerCase(null)   = false
     * StringUtils.isAllLowerCase("")     = false
     * StringUtils.isAllLowerCase("  ")   = false
     * StringUtils.isAllLowerCase("abc")  = true
     * StringUtils.isAllLowerCase("abC") = false
     * </pre>
     *
     * @param cs  the CharSequence to check, may be null
     * @return {@code true} if only contains lowercase characters, and is non-null
     * @since 2.5
     * @since 3.0 Changed signature from isAllLowerCase(String) to isAllLowerCase(CharSequence)
     */
    public static boolean isAllLowerCase(final CharSequence cs) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(7708);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7709);if ((((cs == null || isEmpty(cs))&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7710)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7711)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7712);return false;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7713);final int sz = cs.length();
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7714);for (int i = 0; (((i < sz)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7715)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7716)==0&false)); i++) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7717);if ((((Character.isLowerCase(cs.charAt(i)) == false)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7718)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7719)==0&false))) {{
                __CLR4_1_24d04d0l3lqxs2i.R.inc(7720);return false;
            }
        }}
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7721);return true;
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>Checks if the CharSequence contains only uppercase characters.</p>
     *
     * <p>{@code null} will return {@code false}.
     * An empty String (length()=0) will return {@code false}.</p>
     *
     * <pre>
     * StringUtils.isAllUpperCase(null)   = false
     * StringUtils.isAllUpperCase("")     = false
     * StringUtils.isAllUpperCase("  ")   = false
     * StringUtils.isAllUpperCase("ABC")  = true
     * StringUtils.isAllUpperCase("aBC") = false
     * </pre>
     *
     * @param cs the CharSequence to check, may be null
     * @return {@code true} if only contains uppercase characters, and is non-null
     * @since 2.5
     * @since 3.0 Changed signature from isAllUpperCase(String) to isAllUpperCase(CharSequence)
     */
    public static boolean isAllUpperCase(final CharSequence cs) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(7722);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7723);if ((((cs == null || isEmpty(cs))&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7724)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7725)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7726);return false;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7727);final int sz = cs.length();
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7728);for (int i = 0; (((i < sz)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7729)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7730)==0&false)); i++) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7731);if ((((Character.isUpperCase(cs.charAt(i)) == false)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7732)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7733)==0&false))) {{
                __CLR4_1_24d04d0l3lqxs2i.R.inc(7734);return false;
            }
        }}
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7735);return true;
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    // Defaults
    //-----------------------------------------------------------------------
    /**
     * <p>Returns either the passed in String,
     * or if the String is {@code null}, an empty String ("").</p>
     *
     * <pre>
     * StringUtils.defaultString(null)  = ""
     * StringUtils.defaultString("")    = ""
     * StringUtils.defaultString("bat") = "bat"
     * </pre>
     *
     * @see ObjectUtils#toString(Object)
     * @see String#valueOf(Object)
     * @param str  the String to check, may be null
     * @return the passed in String, or the empty String if it
     *  was {@code null}
     */
    public static String defaultString(final String str) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(7736);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7737);return (((str == null )&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7738)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7739)==0&false))? EMPTY : str;
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>Returns either the passed in String, or if the String is
     * {@code null}, the value of {@code defaultStr}.</p>
     *
     * <pre>
     * StringUtils.defaultString(null, "NULL")  = "NULL"
     * StringUtils.defaultString("", "NULL")    = ""
     * StringUtils.defaultString("bat", "NULL") = "bat"
     * </pre>
     *
     * @see ObjectUtils#toString(Object,String)
     * @see String#valueOf(Object)
     * @param str  the String to check, may be null
     * @param defaultStr  the default String to return
     *  if the input is {@code null}, may be null
     * @return the passed in String, or the default if it was {@code null}
     */
    public static String defaultString(final String str, final String defaultStr) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(7740);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7741);return (((str == null )&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7742)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7743)==0&false))? defaultStr : str;
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>Returns either the passed in CharSequence, or if the CharSequence is
     * whitespace, empty ("") or {@code null}, the value of {@code defaultStr}.</p>
     *
     * <pre>
     * StringUtils.defaultIfBlank(null, "NULL")  = "NULL"
     * StringUtils.defaultIfBlank("", "NULL")    = "NULL"
     * StringUtils.defaultIfBlank(" ", "NULL")   = "NULL"
     * StringUtils.defaultIfBlank("bat", "NULL") = "bat"
     * StringUtils.defaultIfBlank("", null)      = null
     * </pre>
     * @param <T> the specific kind of CharSequence
     * @param str the CharSequence to check, may be null
     * @param defaultStr  the default CharSequence to return
     *  if the input is whitespace, empty ("") or {@code null}, may be null
     * @return the passed in CharSequence, or the default
     * @see StringUtils#defaultString(String, String)
     */
    public static <T extends CharSequence> T defaultIfBlank(final T str, final T defaultStr) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(7744);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7745);return (((StringUtils.isBlank(str) )&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7746)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7747)==0&false))? defaultStr : str;
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>Returns either the passed in CharSequence, or if the CharSequence is
     * empty or {@code null}, the value of {@code defaultStr}.</p>
     *
     * <pre>
     * StringUtils.defaultIfEmpty(null, "NULL")  = "NULL"
     * StringUtils.defaultIfEmpty("", "NULL")    = "NULL"
     * StringUtils.defaultIfEmpty(" ", "NULL")   = " "
     * StringUtils.defaultIfEmpty("bat", "NULL") = "bat"
     * StringUtils.defaultIfEmpty("", null)      = null
     * </pre>
     * @param <T> the specific kind of CharSequence
     * @param str  the CharSequence to check, may be null
     * @param defaultStr  the default CharSequence to return
     *  if the input is empty ("") or {@code null}, may be null
     * @return the passed in CharSequence, or the default
     * @see StringUtils#defaultString(String, String)
     */
    public static <T extends CharSequence> T defaultIfEmpty(final T str, final T defaultStr) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(7748);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7749);return (((StringUtils.isEmpty(str) )&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7750)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7751)==0&false))? defaultStr : str;
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    // Reversing
    //-----------------------------------------------------------------------
    /**
     * <p>Reverses a String as per {@link StringBuilder#reverse()}.</p>
     *
     * <p>A {@code null} String returns {@code null}.</p>
     *
     * <pre>
     * StringUtils.reverse(null)  = null
     * StringUtils.reverse("")    = ""
     * StringUtils.reverse("bat") = "tab"
     * </pre>
     *
     * @param str  the String to reverse, may be null
     * @return the reversed String, {@code null} if null String input
     */
    public static String reverse(final String str) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(7752);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7753);if ((((str == null)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7754)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7755)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7756);return null;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7757);return new StringBuilder(str).reverse().toString();
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>Reverses a String that is delimited by a specific character.</p>
     *
     * <p>The Strings between the delimiters are not reversed.
     * Thus java.lang.String becomes String.lang.java (if the delimiter
     * is {@code '.'}).</p>
     *
     * <pre>
     * StringUtils.reverseDelimited(null, *)      = null
     * StringUtils.reverseDelimited("", *)        = ""
     * StringUtils.reverseDelimited("a.b.c", 'x') = "a.b.c"
     * StringUtils.reverseDelimited("a.b.c", ".") = "c.b.a"
     * </pre>
     *
     * @param str  the String to reverse, may be null
     * @param separatorChar  the separator character to use
     * @return the reversed String, {@code null} if null String input
     * @since 2.0
     */
    public static String reverseDelimited(final String str, final char separatorChar) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(7758);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7759);if ((((str == null)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7760)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7761)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7762);return null;
        }
        // could implement manually, but simple way is to reuse other,
        // probably slower, methods.
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7763);final String[] strs = split(str, separatorChar);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7764);ArrayUtils.reverse(strs);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7765);return join(strs, separatorChar);
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    // Abbreviating
    //-----------------------------------------------------------------------
    /**
     * <p>Abbreviates a String using ellipses. This will turn
     * "Now is the time for all good men" into "Now is the time for..."</p>
     *
     * <p>Specifically:
     * <ul>
     *   <li>If {@code str} is less than {@code maxWidth} characters
     *       long, return it.</li>
     *   <li>Else abbreviate it to {@code (substring(str, 0, max-3) + "...")}.</li>
     *   <li>If {@code maxWidth} is less than {@code 4}, throw an
     *       {@code IllegalArgumentException}.</li>
     *   <li>In no case will it return a String of length greater than
     *       {@code maxWidth}.</li>
     * </ul>
     * </p>
     *
     * <pre>
     * StringUtils.abbreviate(null, *)      = null
     * StringUtils.abbreviate("", 4)        = ""
     * StringUtils.abbreviate("abcdefg", 6) = "abc..."
     * StringUtils.abbreviate("abcdefg", 7) = "abcdefg"
     * StringUtils.abbreviate("abcdefg", 8) = "abcdefg"
     * StringUtils.abbreviate("abcdefg", 4) = "a..."
     * StringUtils.abbreviate("abcdefg", 3) = IllegalArgumentException
     * </pre>
     *
     * @param str  the String to check, may be null
     * @param maxWidth  maximum length of result String, must be at least 4
     * @return abbreviated String, {@code null} if null String input
     * @throws IllegalArgumentException if the width is too small
     * @since 2.0
     */
    public static String abbreviate(final String str, final int maxWidth) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(7766);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7767);return abbreviate(str, 0, maxWidth);
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>Abbreviates a String using ellipses. This will turn
     * "Now is the time for all good men" into "...is the time for..."</p>
     *
     * <p>Works like {@code abbreviate(String, int)}, but allows you to specify
     * a "left edge" offset.  Note that this left edge is not necessarily going to
     * be the leftmost character in the result, or the first character following the
     * ellipses, but it will appear somewhere in the result.
     *
     * <p>In no case will it return a String of length greater than
     * {@code maxWidth}.</p>
     *
     * <pre>
     * StringUtils.abbreviate(null, *, *)                = null
     * StringUtils.abbreviate("", 0, 4)                  = ""
     * StringUtils.abbreviate("abcdefghijklmno", -1, 10) = "abcdefg..."
     * StringUtils.abbreviate("abcdefghijklmno", 0, 10)  = "abcdefg..."
     * StringUtils.abbreviate("abcdefghijklmno", 1, 10)  = "abcdefg..."
     * StringUtils.abbreviate("abcdefghijklmno", 4, 10)  = "abcdefg..."
     * StringUtils.abbreviate("abcdefghijklmno", 5, 10)  = "...fghi..."
     * StringUtils.abbreviate("abcdefghijklmno", 6, 10)  = "...ghij..."
     * StringUtils.abbreviate("abcdefghijklmno", 8, 10)  = "...ijklmno"
     * StringUtils.abbreviate("abcdefghijklmno", 10, 10) = "...ijklmno"
     * StringUtils.abbreviate("abcdefghijklmno", 12, 10) = "...ijklmno"
     * StringUtils.abbreviate("abcdefghij", 0, 3)        = IllegalArgumentException
     * StringUtils.abbreviate("abcdefghij", 5, 6)        = IllegalArgumentException
     * </pre>
     *
     * @param str  the String to check, may be null
     * @param offset  left edge of source String
     * @param maxWidth  maximum length of result String, must be at least 4
     * @return abbreviated String, {@code null} if null String input
     * @throws IllegalArgumentException if the width is too small
     * @since 2.0
     */
    public static String abbreviate(final String str, int offset, final int maxWidth) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(7768);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7769);if ((((str == null)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7770)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7771)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7772);return null;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7773);if ((((maxWidth < 4)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7774)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7775)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7776);throw new IllegalArgumentException("Minimum abbreviation width is 4");
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7777);if ((((str.length() <= maxWidth)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7778)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7779)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7780);return str;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7781);if ((((offset > str.length())&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7782)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7783)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7784);offset = str.length();
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7785);if ((((str.length() - offset < maxWidth - 3)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7786)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7787)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7788);offset = str.length() - (maxWidth - 3);
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7789);final String abrevMarker = "...";
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7790);if ((((offset <= 4)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7791)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7792)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7793);return str.substring(0, maxWidth - 3) + abrevMarker;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7794);if ((((maxWidth < 7)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7795)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7796)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7797);throw new IllegalArgumentException("Minimum abbreviation width with offset is 7");
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7798);if ((((offset + maxWidth - 3 < str.length())&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7799)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7800)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7801);return abrevMarker + abbreviate(str.substring(offset), maxWidth - 3);
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7802);return abrevMarker + str.substring(str.length() - (maxWidth - 3));
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>Abbreviates a String to the length passed, replacing the middle characters with the supplied
     * replacement String.</p>
     *
     * <p>This abbreviation only occurs if the following criteria is met:
     * <ul>
     * <li>Neither the String for abbreviation nor the replacement String are null or empty </li>
     * <li>The length to truncate to is less than the length of the supplied String</li>
     * <li>The length to truncate to is greater than 0</li>
     * <li>The abbreviated String will have enough room for the length supplied replacement String
     * and the first and last characters of the supplied String for abbreviation</li>
     * </ul>
     * Otherwise, the returned String will be the same as the supplied String for abbreviation.
     * </p>
     *
     * <pre>
     * StringUtils.abbreviateMiddle(null, null, 0)      = null
     * StringUtils.abbreviateMiddle("abc", null, 0)      = "abc"
     * StringUtils.abbreviateMiddle("abc", ".", 0)      = "abc"
     * StringUtils.abbreviateMiddle("abc", ".", 3)      = "abc"
     * StringUtils.abbreviateMiddle("abcdef", ".", 4)     = "ab.f"
     * </pre>
     *
     * @param str  the String to abbreviate, may be null
     * @param middle the String to replace the middle characters with, may be null
     * @param length the length to abbreviate {@code str} to.
     * @return the abbreviated String if the above criteria is met, or the original String supplied for abbreviation.
     * @since 2.5
     */
    public static String abbreviateMiddle(final String str, final String middle, final int length) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(7803);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7804);if ((((isEmpty(str) || isEmpty(middle))&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7805)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7806)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7807);return str;
        }

        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7808);if ((((length >= str.length() || length < middle.length()+2)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7809)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7810)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7811);return str;
        }

        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7812);final int targetSting = length-middle.length();
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7813);final int startOffset = targetSting/2+targetSting%2;
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7814);final int endOffset = str.length()-targetSting/2;

        __CLR4_1_24d04d0l3lqxs2i.R.inc(7815);final StringBuilder builder = new StringBuilder(length);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7816);builder.append(str.substring(0,startOffset));
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7817);builder.append(middle);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7818);builder.append(str.substring(endOffset));

        __CLR4_1_24d04d0l3lqxs2i.R.inc(7819);return builder.toString();
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    // Difference
    //-----------------------------------------------------------------------
    /**
     * <p>Compares two Strings, and returns the portion where they differ.
     * More precisely, return the remainder of the second String,
     * starting from where it's different from the first. This means that 
     * the difference between "abc" and "ab" is the empty String and not "c". </p>
     *
     * <p>For example,
     * {@code difference("i am a machine", "i am a robot") -> "robot"}.</p>
     *
     * <pre>
     * StringUtils.difference(null, null) = null
     * StringUtils.difference("", "") = ""
     * StringUtils.difference("", "abc") = "abc"
     * StringUtils.difference("abc", "") = ""
     * StringUtils.difference("abc", "abc") = ""
     * StringUtils.difference("abc", "ab") = ""
     * StringUtils.difference("ab", "abxyz") = "xyz"
     * StringUtils.difference("abcde", "abxyz") = "xyz"
     * StringUtils.difference("abcde", "xyz") = "xyz"
     * </pre>
     *
     * @param str1  the first String, may be null
     * @param str2  the second String, may be null
     * @return the portion of str2 where it differs from str1; returns the
     * empty String if they are equal
     * @see #indexOfDifference(CharSequence,CharSequence)
     * @since 2.0
     */
    public static String difference(final String str1, final String str2) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(7820);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7821);if ((((str1 == null)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7822)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7823)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7824);return str2;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7825);if ((((str2 == null)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7826)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7827)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7828);return str1;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7829);final int at = indexOfDifference(str1, str2);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7830);if ((((at == INDEX_NOT_FOUND)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7831)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7832)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7833);return EMPTY;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7834);return str2.substring(at);
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>Compares two CharSequences, and returns the index at which the
     * CharSequences begin to differ.</p>
     *
     * <p>For example,
     * {@code indexOfDifference("i am a machine", "i am a robot") -> 7}</p>
     *
     * <pre>
     * StringUtils.indexOfDifference(null, null) = -1
     * StringUtils.indexOfDifference("", "") = -1
     * StringUtils.indexOfDifference("", "abc") = 0
     * StringUtils.indexOfDifference("abc", "") = 0
     * StringUtils.indexOfDifference("abc", "abc") = -1
     * StringUtils.indexOfDifference("ab", "abxyz") = 2
     * StringUtils.indexOfDifference("abcde", "abxyz") = 2
     * StringUtils.indexOfDifference("abcde", "xyz") = 0
     * </pre>
     *
     * @param cs1  the first CharSequence, may be null
     * @param cs2  the second CharSequence, may be null
     * @return the index where cs1 and cs2 begin to differ; -1 if they are equal
     * @since 2.0
     * @since 3.0 Changed signature from indexOfDifference(String, String) to
     * indexOfDifference(CharSequence, CharSequence)
     */
    public static int indexOfDifference(final CharSequence cs1, final CharSequence cs2) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(7835);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7836);if ((((cs1 == cs2)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7837)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7838)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7839);return INDEX_NOT_FOUND;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7840);if ((((cs1 == null || cs2 == null)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7841)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7842)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7843);return 0;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7844);int i;
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7845);for (i = 0; (((i < cs1.length() && i < cs2.length())&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7846)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7847)==0&false)); ++i) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7848);if ((((cs1.charAt(i) != cs2.charAt(i))&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7849)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7850)==0&false))) {{
                __CLR4_1_24d04d0l3lqxs2i.R.inc(7851);break;
            }
        }}
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7852);if ((((i < cs2.length() || i < cs1.length())&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7853)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7854)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7855);return i;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7856);return INDEX_NOT_FOUND;
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>Compares all CharSequences in an array and returns the index at which the
     * CharSequences begin to differ.</p>
     *
     * <p>For example,
     * <code>indexOfDifference(new String[] {"i am a machine", "i am a robot"}) -> 7</code></p>
     *
     * <pre>
     * StringUtils.indexOfDifference(null) = -1
     * StringUtils.indexOfDifference(new String[] {}) = -1
     * StringUtils.indexOfDifference(new String[] {"abc"}) = -1
     * StringUtils.indexOfDifference(new String[] {null, null}) = -1
     * StringUtils.indexOfDifference(new String[] {"", ""}) = -1
     * StringUtils.indexOfDifference(new String[] {"", null}) = 0
     * StringUtils.indexOfDifference(new String[] {"abc", null, null}) = 0
     * StringUtils.indexOfDifference(new String[] {null, null, "abc"}) = 0
     * StringUtils.indexOfDifference(new String[] {"", "abc"}) = 0
     * StringUtils.indexOfDifference(new String[] {"abc", ""}) = 0
     * StringUtils.indexOfDifference(new String[] {"abc", "abc"}) = -1
     * StringUtils.indexOfDifference(new String[] {"abc", "a"}) = 1
     * StringUtils.indexOfDifference(new String[] {"ab", "abxyz"}) = 2
     * StringUtils.indexOfDifference(new String[] {"abcde", "abxyz"}) = 2
     * StringUtils.indexOfDifference(new String[] {"abcde", "xyz"}) = 0
     * StringUtils.indexOfDifference(new String[] {"xyz", "abcde"}) = 0
     * StringUtils.indexOfDifference(new String[] {"i am a machine", "i am a robot"}) = 7
     * </pre>
     *
     * @param css  array of CharSequences, entries may be null
     * @return the index where the strings begin to differ; -1 if they are all equal
     * @since 2.4
     * @since 3.0 Changed signature from indexOfDifference(String...) to indexOfDifference(CharSequence...)
     */
    public static int indexOfDifference(final CharSequence... css) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(7857);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7858);if ((((css == null || css.length <= 1)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7859)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7860)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7861);return INDEX_NOT_FOUND;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7862);boolean anyStringNull = false;
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7863);boolean allStringsNull = true;
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7864);final int arrayLen = css.length;
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7865);int shortestStrLen = Integer.MAX_VALUE;
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7866);int longestStrLen = 0;

        // find the min and max string lengths; this avoids checking to make
        // sure we are not exceeding the length of the string each time through
        // the bottom loop.
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7867);for (int i = 0; (((i < arrayLen)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7868)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7869)==0&false)); i++) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7870);if ((((css[i] == null)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7871)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7872)==0&false))) {{
                __CLR4_1_24d04d0l3lqxs2i.R.inc(7873);anyStringNull = true;
                __CLR4_1_24d04d0l3lqxs2i.R.inc(7874);shortestStrLen = 0;
            } }else {{
                __CLR4_1_24d04d0l3lqxs2i.R.inc(7875);allStringsNull = false;
                __CLR4_1_24d04d0l3lqxs2i.R.inc(7876);shortestStrLen = Math.min(css[i].length(), shortestStrLen);
                __CLR4_1_24d04d0l3lqxs2i.R.inc(7877);longestStrLen = Math.max(css[i].length(), longestStrLen);
            }
        }}

        // handle lists containing all nulls or all empty strings
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7878);if ((((allStringsNull || longestStrLen == 0 && !anyStringNull)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7879)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7880)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7881);return INDEX_NOT_FOUND;
        }

        // handle lists containing some nulls or some empty strings
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7882);if ((((shortestStrLen == 0)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7883)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7884)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7885);return 0;
        }

        // find the position with the first difference across all strings
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7886);int firstDiff = -1;
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7887);for (int stringPos = 0; (((stringPos < shortestStrLen)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7888)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7889)==0&false)); stringPos++) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7890);final char comparisonChar = css[0].charAt(stringPos);
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7891);for (int arrayPos = 1; (((arrayPos < arrayLen)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7892)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7893)==0&false)); arrayPos++) {{
                __CLR4_1_24d04d0l3lqxs2i.R.inc(7894);if ((((css[arrayPos].charAt(stringPos) != comparisonChar)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7895)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7896)==0&false))) {{
                    __CLR4_1_24d04d0l3lqxs2i.R.inc(7897);firstDiff = stringPos;
                    __CLR4_1_24d04d0l3lqxs2i.R.inc(7898);break;
                }
            }}
            }__CLR4_1_24d04d0l3lqxs2i.R.inc(7899);if ((((firstDiff != -1)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7900)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7901)==0&false))) {{
                __CLR4_1_24d04d0l3lqxs2i.R.inc(7902);break;
            }
        }}

        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7903);if ((((firstDiff == -1 && shortestStrLen != longestStrLen)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7904)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7905)==0&false))) {{
            // we compared all of the characters up to the length of the
            // shortest string and didn't find a match, but the string lengths
            // vary, so return the length of the shortest string.
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7906);return shortestStrLen;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7907);return firstDiff;
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>Compares all Strings in an array and returns the initial sequence of
     * characters that is common to all of them.</p>
     *
     * <p>For example,
     * <code>getCommonPrefix(new String[] {"i am a machine", "i am a robot"}) -> "i am a "</code></p>
     *
     * <pre>
     * StringUtils.getCommonPrefix(null) = ""
     * StringUtils.getCommonPrefix(new String[] {}) = ""
     * StringUtils.getCommonPrefix(new String[] {"abc"}) = "abc"
     * StringUtils.getCommonPrefix(new String[] {null, null}) = ""
     * StringUtils.getCommonPrefix(new String[] {"", ""}) = ""
     * StringUtils.getCommonPrefix(new String[] {"", null}) = ""
     * StringUtils.getCommonPrefix(new String[] {"abc", null, null}) = ""
     * StringUtils.getCommonPrefix(new String[] {null, null, "abc"}) = ""
     * StringUtils.getCommonPrefix(new String[] {"", "abc"}) = ""
     * StringUtils.getCommonPrefix(new String[] {"abc", ""}) = ""
     * StringUtils.getCommonPrefix(new String[] {"abc", "abc"}) = "abc"
     * StringUtils.getCommonPrefix(new String[] {"abc", "a"}) = "a"
     * StringUtils.getCommonPrefix(new String[] {"ab", "abxyz"}) = "ab"
     * StringUtils.getCommonPrefix(new String[] {"abcde", "abxyz"}) = "ab"
     * StringUtils.getCommonPrefix(new String[] {"abcde", "xyz"}) = ""
     * StringUtils.getCommonPrefix(new String[] {"xyz", "abcde"}) = ""
     * StringUtils.getCommonPrefix(new String[] {"i am a machine", "i am a robot"}) = "i am a "
     * </pre>
     *
     * @param strs  array of String objects, entries may be null
     * @return the initial sequence of characters that are common to all Strings
     * in the array; empty String if the array is null, the elements are all null
     * or if there is no common prefix.
     * @since 2.4
     */
    public static String getCommonPrefix(final String... strs) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(7908);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7909);if ((((strs == null || strs.length == 0)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7910)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7911)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7912);return EMPTY;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7913);final int smallestIndexOfDiff = indexOfDifference(strs);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7914);if ((((smallestIndexOfDiff == INDEX_NOT_FOUND)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7915)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7916)==0&false))) {{
            // all strings were identical
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7917);if ((((strs[0] == null)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7918)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7919)==0&false))) {{
                __CLR4_1_24d04d0l3lqxs2i.R.inc(7920);return EMPTY;
            }
            }__CLR4_1_24d04d0l3lqxs2i.R.inc(7921);return strs[0];
        } }else {__CLR4_1_24d04d0l3lqxs2i.R.inc(7922);if ((((smallestIndexOfDiff == 0)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7923)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7924)==0&false))) {{
            // there were no common initial characters
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7925);return EMPTY;
        } }else {{
            // we found a common initial character sequence
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7926);return strs[0].substring(0, smallestIndexOfDiff);
        }
    }}}finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    // Misc
    //-----------------------------------------------------------------------
    /**
     * <p>Find the Levenshtein distance between two Strings.</p>
     *
     * <p>This is the number of changes needed to change one String into
     * another, where each change is a single character modification (deletion,
     * insertion or substitution).</p>
     *
     * <p>The previous implementation of the Levenshtein distance algorithm
     * was from <a href="http://www.merriampark.com/ld.htm">http://www.merriampark.com/ld.htm</a></p>
     *
     * <p>Chas Emerick has written an implementation in Java, which avoids an OutOfMemoryError
     * which can occur when my Java implementation is used with very large strings.<br>
     * This implementation of the Levenshtein distance algorithm
     * is from <a href="http://www.merriampark.com/ldjava.htm">http://www.merriampark.com/ldjava.htm</a></p>
     *
     * <pre>
     * StringUtils.getLevenshteinDistance(null, *)             = IllegalArgumentException
     * StringUtils.getLevenshteinDistance(*, null)             = IllegalArgumentException
     * StringUtils.getLevenshteinDistance("","")               = 0
     * StringUtils.getLevenshteinDistance("","a")              = 1
     * StringUtils.getLevenshteinDistance("aaapppp", "")       = 7
     * StringUtils.getLevenshteinDistance("frog", "fog")       = 1
     * StringUtils.getLevenshteinDistance("fly", "ant")        = 3
     * StringUtils.getLevenshteinDistance("elephant", "hippo") = 7
     * StringUtils.getLevenshteinDistance("hippo", "elephant") = 7
     * StringUtils.getLevenshteinDistance("hippo", "zzzzzzzz") = 8
     * StringUtils.getLevenshteinDistance("hello", "hallo")    = 1
     * </pre>
     *
     * @param s  the first String, must not be null
     * @param t  the second String, must not be null
     * @return result distance
     * @throws IllegalArgumentException if either String input {@code null}
     * @since 3.0 Changed signature from getLevenshteinDistance(String, String) to
     * getLevenshteinDistance(CharSequence, CharSequence)
     */
    public static int getLevenshteinDistance(CharSequence s, CharSequence t) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(7927);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7928);if ((((s == null || t == null)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7929)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7930)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7931);throw new IllegalArgumentException("Strings must not be null");
        }

        /*
           The difference between this impl. and the previous is that, rather
           than creating and retaining a matrix of size s.length() + 1 by t.length() + 1,
           we maintain two single-dimensional arrays of length s.length() + 1.  The first, d,
           is the 'current working' distance array that maintains the newest distance cost
           counts as we iterate through the characters of String s.  Each time we increment
           the index of String t we are comparing, d is copied to p, the second int[].  Doing so
           allows us to retain the previous cost counts as required by the algorithm (taking
           the minimum of the cost count to the left, up one, and diagonally up and to the left
           of the current cost count being calculated).  (Note that the arrays aren't really
           copied anymore, just switched...this is clearly much better than cloning an array
           or doing a System.arraycopy() each time  through the outer loop.)

           Effectively, the difference between the two implementations is this one does not
           cause an out of memory condition when calculating the LD over two very large strings.
         */

        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7932);int n = s.length(); // length of s
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7933);int m = t.length(); // length of t

        __CLR4_1_24d04d0l3lqxs2i.R.inc(7934);if ((((n == 0)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7935)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7936)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7937);return m;
        } }else {__CLR4_1_24d04d0l3lqxs2i.R.inc(7938);if ((((m == 0)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7939)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7940)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7941);return n;
        }

        }}__CLR4_1_24d04d0l3lqxs2i.R.inc(7942);if ((((n > m)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7943)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7944)==0&false))) {{
            // swap the input strings to consume less memory
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7945);final CharSequence tmp = s;
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7946);s = t;
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7947);t = tmp;
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7948);n = m;
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7949);m = t.length();
        }

        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7950);int p[] = new int[n + 1]; //'previous' cost array, horizontally
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7951);int d[] = new int[n + 1]; // cost array, horizontally
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7952);int _d[]; //placeholder to assist in swapping p and d

        // indexes into strings s and t
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7953);int i; // iterates through s
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7954);int j; // iterates through t

        __CLR4_1_24d04d0l3lqxs2i.R.inc(7955);char t_j; // jth character of t

        __CLR4_1_24d04d0l3lqxs2i.R.inc(7956);int cost; // cost

        __CLR4_1_24d04d0l3lqxs2i.R.inc(7957);for (i = 0; (((i <= n)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7958)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7959)==0&false)); i++) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7960);p[i] = i;
        }

        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7961);for (j = 1; (((j <= m)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7962)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7963)==0&false)); j++) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7964);t_j = t.charAt(j - 1);
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7965);d[0] = j;

            __CLR4_1_24d04d0l3lqxs2i.R.inc(7966);for (i = 1; (((i <= n)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7967)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7968)==0&false)); i++) {{
                __CLR4_1_24d04d0l3lqxs2i.R.inc(7969);cost = (((s.charAt(i - 1) == t_j )&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7970)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7971)==0&false))? 0 : 1;
                // minimum of cell to the left+1, to the top+1, diagonally left and up +cost
                __CLR4_1_24d04d0l3lqxs2i.R.inc(7972);d[i] = Math.min(Math.min(d[i - 1] + 1, p[i] + 1), p[i - 1] + cost);
            }

            // copy current distance counts to 'previous row' distance counts
            }__CLR4_1_24d04d0l3lqxs2i.R.inc(7973);_d = p;
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7974);p = d;
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7975);d = _d;
        }

        // our last action in the above loop was to switch d and p, so p now
        // actually has the most recent cost counts
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7976);return p[n];
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>Find the Levenshtein distance between two Strings if it's less than or equal to a given 
     * threshold.</p>
     *
     * <p>This is the number of changes needed to change one String into
     * another, where each change is a single character modification (deletion,
     * insertion or substitution).</p>
     *
     * <p>This implementation follows from Algorithms on Strings, Trees and Sequences by Dan Gusfield
     * and Chas Emerick's implementation of the Levenshtein distance algorithm from
     * <a href="http://www.merriampark.com/ld.htm">http://www.merriampark.com/ld.htm</a></p>
     *
     * <pre>
     * StringUtils.getLevenshteinDistance(null, *, *)             = IllegalArgumentException
     * StringUtils.getLevenshteinDistance(*, null, *)             = IllegalArgumentException
     * StringUtils.getLevenshteinDistance(*, *, -1)               = IllegalArgumentException
     * StringUtils.getLevenshteinDistance("","", 0)               = 0
     * StringUtils.getLevenshteinDistance("aaapppp", "", 8)       = 7
     * StringUtils.getLevenshteinDistance("aaapppp", "", 7)       = 7
     * StringUtils.getLevenshteinDistance("aaapppp", "", 6))      = -1
     * StringUtils.getLevenshteinDistance("elephant", "hippo", 7) = 7
     * StringUtils.getLevenshteinDistance("elephant", "hippo", 6) = -1
     * StringUtils.getLevenshteinDistance("hippo", "elephant", 7) = 7
     * StringUtils.getLevenshteinDistance("hippo", "elephant", 6) = -1
     * </pre>
     *
     * @param s  the first String, must not be null
     * @param t  the second String, must not be null
     * @param threshold the target threshold, must not be negative
     * @return result distance, or {@code -1} if the distance would be greater than the threshold
     * @throws IllegalArgumentException if either String input {@code null} or negative threshold
     */
    public static int getLevenshteinDistance(CharSequence s, CharSequence t, final int threshold) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(7977);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7978);if ((((s == null || t == null)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7979)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7980)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7981);throw new IllegalArgumentException("Strings must not be null");
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7982);if ((((threshold < 0)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7983)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7984)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7985);throw new IllegalArgumentException("Threshold must not be negative");
        }

        /*
        This implementation only computes the distance if it's less than or equal to the
        threshold value, returning -1 if it's greater.  The advantage is performance: unbounded
        distance is O(nm), but a bound of k allows us to reduce it to O(km) time by only 
        computing a diagonal stripe of width 2k + 1 of the cost table.
        It is also possible to use this to compute the unbounded Levenshtein distance by starting
        the threshold at 1 and doubling each time until the distance is found; this is O(dm), where
        d is the distance.
        
        One subtlety comes from needing to ignore entries on the border of our stripe
        eg.
        p[] = |#|#|#|*
        d[] =  *|#|#|#|
        We must ignore the entry to the left of the leftmost member
        We must ignore the entry above the rightmost member
        
        Another subtlety comes from our stripe running off the matrix if the strings aren't
        of the same size.  Since string s is always swapped to be the shorter of the two, 
        the stripe will always run off to the upper right instead of the lower left of the matrix.
        
        As a concrete example, suppose s is of length 5, t is of length 7, and our threshold is 1.
        In this case we're going to walk a stripe of length 3.  The matrix would look like so:
        
           1 2 3 4 5
        1 |#|#| | | |
        2 |#|#|#| | |
        3 | |#|#|#| |
        4 | | |#|#|#|
        5 | | | |#|#|
        6 | | | | |#|
        7 | | | | | |

        Note how the stripe leads off the table as there is no possible way to turn a string of length 5
        into one of length 7 in edit distance of 1.
        
        Additionally, this implementation decreases memory usage by using two 
        single-dimensional arrays and swapping them back and forth instead of allocating
        an entire n by m matrix.  This requires a few minor changes, such as immediately returning 
        when it's detected that the stripe has run off the matrix and initially filling the arrays with
        large values so that entries we don't compute are ignored.

        See Algorithms on Strings, Trees and Sequences by Dan Gusfield for some discussion.
         */

        }__CLR4_1_24d04d0l3lqxs2i.R.inc(7986);int n = s.length(); // length of s
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7987);int m = t.length(); // length of t

        // if one string is empty, the edit distance is necessarily the length of the other
        __CLR4_1_24d04d0l3lqxs2i.R.inc(7988);if ((((n == 0)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7989)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7990)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7991);return (((m <= threshold )&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7992)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7993)==0&false))? m : -1;
        } }else {__CLR4_1_24d04d0l3lqxs2i.R.inc(7994);if ((((m == 0)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7995)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7996)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(7997);return (((n <= threshold )&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(7998)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(7999)==0&false))? n : -1;
        }

        }}__CLR4_1_24d04d0l3lqxs2i.R.inc(8000);if ((((n > m)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(8001)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(8002)==0&false))) {{
            // swap the two strings to consume less memory
            __CLR4_1_24d04d0l3lqxs2i.R.inc(8003);final CharSequence tmp = s;
            __CLR4_1_24d04d0l3lqxs2i.R.inc(8004);s = t;
            __CLR4_1_24d04d0l3lqxs2i.R.inc(8005);t = tmp;
            __CLR4_1_24d04d0l3lqxs2i.R.inc(8006);n = m;
            __CLR4_1_24d04d0l3lqxs2i.R.inc(8007);m = t.length();
        }

        }__CLR4_1_24d04d0l3lqxs2i.R.inc(8008);int p[] = new int[n + 1]; // 'previous' cost array, horizontally
        __CLR4_1_24d04d0l3lqxs2i.R.inc(8009);int d[] = new int[n + 1]; // cost array, horizontally
        __CLR4_1_24d04d0l3lqxs2i.R.inc(8010);int _d[]; // placeholder to assist in swapping p and d

        // fill in starting table values
        __CLR4_1_24d04d0l3lqxs2i.R.inc(8011);final int boundary = Math.min(n, threshold) + 1;
        __CLR4_1_24d04d0l3lqxs2i.R.inc(8012);for (int i = 0; (((i < boundary)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(8013)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(8014)==0&false)); i++) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(8015);p[i] = i;
        }
        // these fills ensure that the value above the rightmost entry of our 
        // stripe will be ignored in following loop iterations
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(8016);Arrays.fill(p, boundary, p.length, Integer.MAX_VALUE);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(8017);Arrays.fill(d, Integer.MAX_VALUE);

        // iterates through t
        __CLR4_1_24d04d0l3lqxs2i.R.inc(8018);for (int j = 1; (((j <= m)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(8019)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(8020)==0&false)); j++) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(8021);final char t_j = t.charAt(j - 1); // jth character of t
            __CLR4_1_24d04d0l3lqxs2i.R.inc(8022);d[0] = j;

            // compute stripe indices, constrain to array size
            __CLR4_1_24d04d0l3lqxs2i.R.inc(8023);final int min = Math.max(1, j - threshold);
            __CLR4_1_24d04d0l3lqxs2i.R.inc(8024);final int max = Math.min(n, j + threshold);

            // the stripe may lead off of the table if s and t are of different sizes
            __CLR4_1_24d04d0l3lqxs2i.R.inc(8025);if ((((min > max)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(8026)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(8027)==0&false))) {{
                __CLR4_1_24d04d0l3lqxs2i.R.inc(8028);return -1;
            }

            // ignore entry left of leftmost
            }__CLR4_1_24d04d0l3lqxs2i.R.inc(8029);if ((((min > 1)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(8030)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(8031)==0&false))) {{
                __CLR4_1_24d04d0l3lqxs2i.R.inc(8032);d[min - 1] = Integer.MAX_VALUE;
            }

            // iterates through [min, max] in s
            }__CLR4_1_24d04d0l3lqxs2i.R.inc(8033);for (int i = min; (((i <= max)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(8034)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(8035)==0&false)); i++) {{
                __CLR4_1_24d04d0l3lqxs2i.R.inc(8036);if ((((s.charAt(i - 1) == t_j)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(8037)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(8038)==0&false))) {{
                    // diagonally left and up
                    __CLR4_1_24d04d0l3lqxs2i.R.inc(8039);d[i] = p[i - 1];
                } }else {{
                    // 1 + minimum of cell to the left, to the top, diagonally left and up
                    __CLR4_1_24d04d0l3lqxs2i.R.inc(8040);d[i] = 1 + Math.min(Math.min(d[i - 1], p[i]), p[i - 1]);
                }
            }}

            // copy current distance counts to 'previous row' distance counts
            }__CLR4_1_24d04d0l3lqxs2i.R.inc(8041);_d = p;
            __CLR4_1_24d04d0l3lqxs2i.R.inc(8042);p = d;
            __CLR4_1_24d04d0l3lqxs2i.R.inc(8043);d = _d;
        }

        // if p[n] is greater than the threshold, there's no guarantee on it being the correct
        // distance
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(8044);if ((((p[n] <= threshold)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(8045)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(8046)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(8047);return p[n];
        } }else {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(8048);return -1;
        }
    }}finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    // startsWith
    //-----------------------------------------------------------------------

    /**
     * <p>Check if a CharSequence starts with a specified prefix.</p>
     *
     * <p>{@code null}s are handled without exceptions. Two {@code null}
     * references are considered to be equal. The comparison is case sensitive.</p>
     *
     * <pre>
     * StringUtils.startsWith(null, null)      = true
     * StringUtils.startsWith(null, "abc")     = false
     * StringUtils.startsWith("abcdef", null)  = false
     * StringUtils.startsWith("abcdef", "abc") = true
     * StringUtils.startsWith("ABCDEF", "abc") = false
     * </pre>
     *
     * @see java.lang.String#startsWith(String)
     * @param str  the CharSequence to check, may be null
     * @param prefix the prefix to find, may be null
     * @return {@code true} if the CharSequence starts with the prefix, case sensitive, or
     *  both {@code null}
     * @since 2.4
     * @since 3.0 Changed signature from startsWith(String, String) to startsWith(CharSequence, CharSequence)
     */
    public static boolean startsWith(final CharSequence str, final CharSequence prefix) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(8049);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(8050);return startsWith(str, prefix, false);
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>Case insensitive check if a CharSequence starts with a specified prefix.</p>
     *
     * <p>{@code null}s are handled without exceptions. Two {@code null}
     * references are considered to be equal. The comparison is case insensitive.</p>
     *
     * <pre>
     * StringUtils.startsWithIgnoreCase(null, null)      = true
     * StringUtils.startsWithIgnoreCase(null, "abc")     = false
     * StringUtils.startsWithIgnoreCase("abcdef", null)  = false
     * StringUtils.startsWithIgnoreCase("abcdef", "abc") = true
     * StringUtils.startsWithIgnoreCase("ABCDEF", "abc") = true
     * </pre>
     *
     * @see java.lang.String#startsWith(String)
     * @param str  the CharSequence to check, may be null
     * @param prefix the prefix to find, may be null
     * @return {@code true} if the CharSequence starts with the prefix, case insensitive, or
     *  both {@code null}
     * @since 2.4
     * @since 3.0 Changed signature from startsWithIgnoreCase(String, String) to startsWithIgnoreCase(CharSequence, CharSequence)
     */
    public static boolean startsWithIgnoreCase(final CharSequence str, final CharSequence prefix) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(8051);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(8052);return startsWith(str, prefix, true);
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>Check if a CharSequence starts with a specified prefix (optionally case insensitive).</p>
     *
     * @see java.lang.String#startsWith(String)
     * @param str  the CharSequence to check, may be null
     * @param prefix the prefix to find, may be null
     * @param ignoreCase indicates whether the compare should ignore case
     *  (case insensitive) or not.
     * @return {@code true} if the CharSequence starts with the prefix or
     *  both {@code null}
     */
    private static boolean startsWith(final CharSequence str, final CharSequence prefix, final boolean ignoreCase) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(8053);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(8054);if ((((str == null || prefix == null)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(8055)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(8056)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(8057);return str == null && prefix == null;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(8058);if ((((prefix.length() > str.length())&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(8059)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(8060)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(8061);return false;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(8062);return CharSequenceUtils.regionMatches(str, ignoreCase, 0, prefix, 0, prefix.length());
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>Check if a CharSequence starts with any of an array of specified strings.</p>
     *
     * <pre>
     * StringUtils.startsWithAny(null, null)      = false
     * StringUtils.startsWithAny(null, new String[] {"abc"})  = false
     * StringUtils.startsWithAny("abcxyz", null)     = false
     * StringUtils.startsWithAny("abcxyz", new String[] {""}) = false
     * StringUtils.startsWithAny("abcxyz", new String[] {"abc"}) = true
     * StringUtils.startsWithAny("abcxyz", new String[] {null, "xyz", "abc"}) = true
     * </pre>
     *
     * @param string  the CharSequence to check, may be null
     * @param searchStrings the CharSequences to find, may be null or empty
     * @return {@code true} if the CharSequence starts with any of the the prefixes, case insensitive, or
     *  both {@code null}
     * @since 2.5
     * @since 3.0 Changed signature from startsWithAny(String, String[]) to startsWithAny(CharSequence, CharSequence...)
     */
    public static boolean startsWithAny(final CharSequence string, final CharSequence... searchStrings) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(8063);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(8064);if ((((isEmpty(string) || ArrayUtils.isEmpty(searchStrings))&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(8065)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(8066)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(8067);return false;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(8068);for (final CharSequence searchString : searchStrings) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(8069);if ((((StringUtils.startsWith(string, searchString))&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(8070)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(8071)==0&false))) {{
                __CLR4_1_24d04d0l3lqxs2i.R.inc(8072);return true;
            }
        }}
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(8073);return false;
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    // endsWith
    //-----------------------------------------------------------------------

    /**
     * <p>Check if a CharSequence ends with a specified suffix.</p>
     *
     * <p>{@code null}s are handled without exceptions. Two {@code null}
     * references are considered to be equal. The comparison is case sensitive.</p>
     *
     * <pre>
     * StringUtils.endsWith(null, null)      = true
     * StringUtils.endsWith(null, "def")     = false
     * StringUtils.endsWith("abcdef", null)  = false
     * StringUtils.endsWith("abcdef", "def") = true
     * StringUtils.endsWith("ABCDEF", "def") = false
     * StringUtils.endsWith("ABCDEF", "cde") = false
     * </pre>
     *
     * @see java.lang.String#endsWith(String)
     * @param str  the CharSequence to check, may be null
     * @param suffix the suffix to find, may be null
     * @return {@code true} if the CharSequence ends with the suffix, case sensitive, or
     *  both {@code null}
     * @since 2.4
     * @since 3.0 Changed signature from endsWith(String, String) to endsWith(CharSequence, CharSequence)
     */
    public static boolean endsWith(final CharSequence str, final CharSequence suffix) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(8074);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(8075);return endsWith(str, suffix, false);
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>Case insensitive check if a CharSequence ends with a specified suffix.</p>
     *
     * <p>{@code null}s are handled without exceptions. Two {@code null}
     * references are considered to be equal. The comparison is case insensitive.</p>
     *
     * <pre>
     * StringUtils.endsWithIgnoreCase(null, null)      = true
     * StringUtils.endsWithIgnoreCase(null, "def")     = false
     * StringUtils.endsWithIgnoreCase("abcdef", null)  = false
     * StringUtils.endsWithIgnoreCase("abcdef", "def") = true
     * StringUtils.endsWithIgnoreCase("ABCDEF", "def") = true
     * StringUtils.endsWithIgnoreCase("ABCDEF", "cde") = false
     * </pre>
     *
     * @see java.lang.String#endsWith(String)
     * @param str  the CharSequence to check, may be null
     * @param suffix the suffix to find, may be null
     * @return {@code true} if the CharSequence ends with the suffix, case insensitive, or
     *  both {@code null}
     * @since 2.4
     * @since 3.0 Changed signature from endsWithIgnoreCase(String, String) to endsWithIgnoreCase(CharSequence, CharSequence)
     */
    public static boolean endsWithIgnoreCase(final CharSequence str, final CharSequence suffix) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(8076);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(8077);return endsWith(str, suffix, true);
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>Check if a CharSequence ends with a specified suffix (optionally case insensitive).</p>
     *
     * @see java.lang.String#endsWith(String)
     * @param str  the CharSequence to check, may be null
     * @param suffix the suffix to find, may be null
     * @param ignoreCase indicates whether the compare should ignore case
     *  (case insensitive) or not.
     * @return {@code true} if the CharSequence starts with the prefix or
     *  both {@code null}
     */
    private static boolean endsWith(final CharSequence str, final CharSequence suffix, final boolean ignoreCase) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(8078);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(8079);if ((((str == null || suffix == null)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(8080)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(8081)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(8082);return str == null && suffix == null;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(8083);if ((((suffix.length() > str.length())&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(8084)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(8085)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(8086);return false;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(8087);final int strOffset = str.length() - suffix.length();
        __CLR4_1_24d04d0l3lqxs2i.R.inc(8088);return CharSequenceUtils.regionMatches(str, ignoreCase, strOffset, suffix, 0, suffix.length());
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>
     * Similar to <a
     * href="http://www.w3.org/TR/xpath/#function-normalize-space">http://www.w3.org/TR/xpath/#function-normalize
     * -space</a>
     * </p>
     * <p>
     * The function returns the argument string with whitespace normalized by using
     * <code>{@link #trim(String)}</code> to remove leading and trailing whitespace
     * and then replacing sequences of whitespace characters by a single space.
     * </p>
     * In XML Whitespace characters are the same as those allowed by the <a
     * href="http://www.w3.org/TR/REC-xml/#NT-S">S</a> production, which is S ::= (#x20 | #x9 | #xD | #xA)+
     * <p>
     * Java's regexp pattern \s defines whitespace as [ \t\n\x0B\f\r]
     * <p>
     * For reference:
     * <ul>
     * <li>\x0B = vertical tab</li>
     * <li>\f = #xC = form feed</li>
     * <li>#x20 = space</li>
     * <li>#x9 = \t</li>
     * <li>#xA = \n</li>
     * <li>#xD = \r</li>
     * </ul>
     * </p>
     * <p>
     * The difference is that Java's whitespace includes vertical tab and form feed, which this functional will also
     * normalize. Additionally <code>{@link #trim(String)}</code> removes control characters (char &lt;= 32) from both
     * ends of this String.
     * </p>
     *
     * @see Pattern
     * @see #trim(String)
     * @see <a
     *      href="http://www.w3.org/TR/xpath/#function-normalize-space">http://www.w3.org/TR/xpath/#function-normalize-space</a>
     * @param str the source String to normalize whitespaces from, may be null
     * @return the modified string with whitespace normalized, {@code null} if null String input
     *
     * @since 3.0
     */
    public static String normalizeSpace(final String str) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(8089);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(8090);if ((((str == null)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(8091)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(8092)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(8093);return null;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(8094);return WHITESPACE_PATTERN.matcher(trim(str)).replaceAll(SPACE);
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * <p>Check if a CharSequence ends with any of an array of specified strings.</p>
     *
     * <pre>
     * StringUtils.endsWithAny(null, null)      = false
     * StringUtils.endsWithAny(null, new String[] {"abc"})  = false
     * StringUtils.endsWithAny("abcxyz", null)     = false
     * StringUtils.endsWithAny("abcxyz", new String[] {""}) = true
     * StringUtils.endsWithAny("abcxyz", new String[] {"xyz"}) = true
     * StringUtils.endsWithAny("abcxyz", new String[] {null, "xyz", "abc"}) = true
     * </pre>
     *
     * @param string  the CharSequence to check, may be null
     * @param searchStrings the CharSequences to find, may be null or empty
     * @return {@code true} if the CharSequence ends with any of the the prefixes, case insensitive, or
     *  both {@code null}
     * @since 3.0
     */
    public static boolean endsWithAny(final CharSequence string, final CharSequence... searchStrings) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(8095);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(8096);if ((((isEmpty(string) || ArrayUtils.isEmpty(searchStrings))&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(8097)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(8098)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(8099);return false;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(8100);for (final CharSequence searchString : searchStrings) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(8101);if ((((StringUtils.endsWith(string, searchString))&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(8102)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(8103)==0&false))) {{
                __CLR4_1_24d04d0l3lqxs2i.R.inc(8104);return true;
            }
        }}
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(8105);return false;
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * Appends the suffix to the end of the string if the string does not
     * already end in the suffix.
     *
     * @param str The string.
     * @param suffix The suffix to append to the end of the string.
     * @param ignoreCase Indicates whether the compare should ignore case.
     * @param suffixes Additional suffixes that are valid terminators (optional).
     *
     * @return A new String if suffix was appened, the same string otherwise.
     */
    private static String appendIfMissing(final String str, final CharSequence suffix, final boolean ignoreCase, final CharSequence... suffixes) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(8106);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(8107);if ((((str == null || isEmpty(suffix) || endsWith(str, suffix, ignoreCase))&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(8108)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(8109)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(8110);return str;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(8111);if ((((suffixes != null && suffixes.length > 0)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(8112)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(8113)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(8114);for (final CharSequence s : suffixes) {{
                __CLR4_1_24d04d0l3lqxs2i.R.inc(8115);if ((((endsWith(str, s, ignoreCase))&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(8116)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(8117)==0&false))) {{
                    __CLR4_1_24d04d0l3lqxs2i.R.inc(8118);return str;
                }
            }}
        }}
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(8119);return str + suffix.toString();
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * Appends the suffix to the end of the string if the string does not
     * already end with any the suffixes.
     *
     * <pre>
     * StringUtils.appendIfMissing(null, null) = null
     * StringUtils.appendIfMissing("abc", null) = "abc"
     * StringUtils.appendIfMissing("", "xyz") = "xyz"
     * StringUtils.appendIfMissing("abc", "xyz") = "abcxyz"
     * StringUtils.appendIfMissing("abcxyz", "xyz") = "abcxyz"
     * StringUtils.appendIfMissing("abcXYZ", "xyz") = "abcXYZxyz"
     * </pre>
     * <p>With additional suffixes,</p>
     * <pre>
     * StringUtils.appendIfMissing(null, null, null) = null
     * StringUtils.appendIfMissing("abc", null, null) = "abc"
     * StringUtils.appendIfMissing("", "xyz", null) = "xyz"
     * StringUtils.appendIfMissing("abc", "xyz", new CharSequence[]{null}) = "abcxyz"
     * StringUtils.appendIfMissing("abc", "xyz", "") = "abc"
     * StringUtils.appendIfMissing("abc", "xyz", "mno") = "abcxyz"
     * StringUtils.appendIfMissing("abcxyz", "xyz", "mno") = "abcxyz"
     * StringUtils.appendIfMissing("abcmno", "xyz", "mno") = "abcmno"
     * StringUtils.appendIfMissing("abcXYZ", "xyz", "mno") = "abcXYZxyz"
     * StringUtils.appendIfMissing("abcMNO", "xyz", "mno") = "abcMNOxyz"
     * </pre>
     *
     * @param str The string.
     * @param suffix The suffix to append to the end of the string.
     * @param suffixes Additional suffixes that are valid terminators.
     *
     * @return A new String if suffix was appened, the same string otherwise.
     *
     * @since 3.2
     */
    public static String appendIfMissing(final String str, final CharSequence suffix, final CharSequence... suffixes) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(8120);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(8121);return appendIfMissing(str, suffix, false, suffixes);
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * Appends the suffix to the end of the string if the string does not
     * already end, case insensitive, with any of the suffixes.
     *
     * <pre>
     * StringUtils.appendIfMissingIgnoreCase(null, null) = null
     * StringUtils.appendIfMissingIgnoreCase("abc", null) = "abc"
     * StringUtils.appendIfMissingIgnoreCase("", "xyz") = "xyz"
     * StringUtils.appendIfMissingIgnoreCase("abc", "xyz") = "abcxyz"
     * StringUtils.appendIfMissingIgnoreCase("abcxyz", "xyz") = "abcxyz"
     * StringUtils.appendIfMissingIgnoreCase("abcXYZ", "xyz") = "abcXYZ"
     * </pre>
     * <p>With additional suffixes,</p>
     * <pre>
     * StringUtils.appendIfMissingIgnoreCase(null, null, null) = null
     * StringUtils.appendIfMissingIgnoreCase("abc", null, null) = "abc"
     * StringUtils.appendIfMissingIgnoreCase("", "xyz", null) = "xyz"
     * StringUtils.appendIfMissingIgnoreCase("abc", "xyz", new CharSequence[]{null}) = "abcxyz"
     * StringUtils.appendIfMissingIgnoreCase("abc", "xyz", "") = "abc"
     * StringUtils.appendIfMissingIgnoreCase("abc", "xyz", "mno") = "axyz"
     * StringUtils.appendIfMissingIgnoreCase("abcxyz", "xyz", "mno") = "abcxyz"
     * StringUtils.appendIfMissingIgnoreCase("abcmno", "xyz", "mno") = "abcmno"
     * StringUtils.appendIfMissingIgnoreCase("abcXYZ", "xyz", "mno") = "abcXYZ"
     * StringUtils.appendIfMissingIgnoreCase("abcMNO", "xyz", "mno") = "abcMNO"
     * </pre>
     *
     * @param str The string.
     * @param suffix The suffix to append to the end of the string.
     * @param suffixes Additional suffixes that are valid terminators.
     *
     * @return A new String if suffix was appened, the same string otherwise.
     *
     * @since 3.2
     */
    public static String appendIfMissingIgnoreCase(final String str, final CharSequence suffix, final CharSequence... suffixes) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(8122);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(8123);return appendIfMissing(str, suffix, true, suffixes);
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * Prepends the prefix to the start of the string if the string does not
     * already start with any of the prefixes.
     *
     * @param str The string.
     * @param prefix The prefix to prepend to the start of the string.
     * @param ignoreCase Indicates whether the compare should ignore case.
     * @param prefixes Additional prefixes that are valid (optional).
     *
     * @return A new String if prefix was prepended, the same string otherwise.
     */
    private static String prependIfMissing(final String str, final CharSequence prefix, final boolean ignoreCase, final CharSequence... prefixes) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(8124);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(8125);if ((((str == null || isEmpty(prefix) || startsWith(str, prefix, ignoreCase))&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(8126)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(8127)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(8128);return str;
        }
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(8129);if ((((prefixes != null && prefixes.length > 0)&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(8130)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(8131)==0&false))) {{
            __CLR4_1_24d04d0l3lqxs2i.R.inc(8132);for (final CharSequence p : prefixes) {{
                __CLR4_1_24d04d0l3lqxs2i.R.inc(8133);if ((((startsWith(str, p, ignoreCase))&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(8134)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(8135)==0&false))) {{
                    __CLR4_1_24d04d0l3lqxs2i.R.inc(8136);return str;
                }
            }}
        }}
        }__CLR4_1_24d04d0l3lqxs2i.R.inc(8137);return prefix.toString() + str;
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * Prepends the prefix to the start of the string if the string does not
     * already start with any of the prefixes.
     *
     * <pre>
     * StringUtils.prependIfMissing(null, null) = null
     * StringUtils.prependIfMissing("abc", null) = "abc"
     * StringUtils.prependIfMissing("", "xyz") = "xyz"
     * StringUtils.prependIfMissing("abc", "xyz") = "xyzabc"
     * StringUtils.prependIfMissing("xyzabc", "xyz") = "xyzabc"
     * StringUtils.prependIfMissing("XYZabc", "xyz") = "xyzXYZabc"
     * </pre>
     * <p>With additional prefixes,</p>
     * <pre>
     * StringUtils.prependIfMissing(null, null, null) = null
     * StringUtils.prependIfMissing("abc", null, null) = "abc"
     * StringUtils.prependIfMissing("", "xyz", null) = "xyz"
     * StringUtils.prependIfMissing("abc", "xyz", new CharSequence[]{null}) = "xyzabc"
     * StringUtils.prependIfMissing("abc", "xyz", "") = "abc"
     * StringUtils.prependIfMissing("abc", "xyz", "mno") = "xyzabc"
     * StringUtils.prependIfMissing("xyzabc", "xyz", "mno") = "xyzabc"
     * StringUtils.prependIfMissing("mnoabc", "xyz", "mno") = "mnoabc"
     * StringUtils.prependIfMissing("XYZabc", "xyz", "mno") = "xyzXYZabc"
     * StringUtils.prependIfMissing("MNOabc", "xyz", "mno") = "xyzMNOabc"
     * </pre>
     *
     * @param str The string.
     * @param prefix The prefix to prepend to the start of the string.
     * @param prefixes Additional prefixes that are valid.
     *
     * @return A new String if prefix was prepended, the same string otherwise.
     *
     * @since 3.2
     */
    public static String prependIfMissing(final String str, final CharSequence prefix, final CharSequence... prefixes) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(8138);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(8139);return prependIfMissing(str, prefix, false, prefixes);
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * Prepends the prefix to the start of the string if the string does not
     * already start, case insensitive, with any of the prefixes.
     *
     * <pre>
     * StringUtils.prependIfMissingIgnoreCase(null, null) = null
     * StringUtils.prependIfMissingIgnoreCase("abc", null) = "abc"
     * StringUtils.prependIfMissingIgnoreCase("", "xyz") = "xyz"
     * StringUtils.prependIfMissingIgnoreCase("abc", "xyz") = "xyzabc"
     * StringUtils.prependIfMissingIgnoreCase("xyzabc", "xyz") = "xyzabc"
     * StringUtils.prependIfMissingIgnoreCase("XYZabc", "xyz") = "XYZabc"
     * </pre>
     * <p>With additional prefixes,</p>
     * <pre>
     * StringUtils.prependIfMissingIgnoreCase(null, null, null) = null
     * StringUtils.prependIfMissingIgnoreCase("abc", null, null) = "abc"
     * StringUtils.prependIfMissingIgnoreCase("", "xyz", null) = "xyz"
     * StringUtils.prependIfMissingIgnoreCase("abc", "xyz", new CharSequence[]{null}) = "xyzabc"
     * StringUtils.prependIfMissingIgnoreCase("abc", "xyz", "") = "abc"
     * StringUtils.prependIfMissingIgnoreCase("abc", "xyz", "mno") = "xyzabc"
     * StringUtils.prependIfMissingIgnoreCase("xyzabc", "xyz", "mno") = "xyzabc"
     * StringUtils.prependIfMissingIgnoreCase("mnoabc", "xyz", "mno") = "mnoabc"
     * StringUtils.prependIfMissingIgnoreCase("XYZabc", "xyz", "mno") = "XYZabc"
     * StringUtils.prependIfMissingIgnoreCase("MNOabc", "xyz", "mno") = "MNOabc"
     * </pre>
     *
     * @param str The string.
     * @param prefix The prefix to prepend to the start of the string.
     * @param prefixes Additional prefixes that are valid (optional).
     *
     * @return A new String if prefix was prepended, the same string otherwise.
     *
     * @since 3.2
     */
    public static String prependIfMissingIgnoreCase(final String str, final CharSequence prefix, final CharSequence... prefixes) {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(8140);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(8141);return prependIfMissing(str, prefix, true, prefixes);
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

    /**
     * Converts a <code>byte[]</code> to a String using the specified character encoding.
     * 
     * @param bytes
     *            the byte array to read from
     * @param charsetName
     *            the encoding to use, if null then use the platform default
     * @return a new String
     * @throws UnsupportedEncodingException
     *             If the named charset is not supported
     * @throws NullPointerException
     *             if the input is null
     * @since 3.1
     */
    public static String toString(final byte[] bytes, final String charsetName) throws UnsupportedEncodingException {try{__CLR4_1_24d04d0l3lqxs2i.R.inc(8142);
        __CLR4_1_24d04d0l3lqxs2i.R.inc(8143);return (((charsetName == null )&&(__CLR4_1_24d04d0l3lqxs2i.R.iget(8144)!=0|true))||(__CLR4_1_24d04d0l3lqxs2i.R.iget(8145)==0&false))? new String(bytes) : new String(bytes, charsetName);
    }finally{__CLR4_1_24d04d0l3lqxs2i.R.flushNeeded();}}

}
