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
package org.apache.commons.lang3.text;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

/**
 * Tokenizes a string based based on delimiters (separators)
 * and supporting quoting and ignored character concepts.
 * <p>
 * This class can split a String into many smaller strings. It aims
 * to do a similar job to {@link java.util.StringTokenizer StringTokenizer},
 * however it offers much more control and flexibility including implementing
 * the <code>ListIterator</code> interface. By default, it is set up
 * like <code>StringTokenizer</code>.
 * <p>
 * The input String is split into a number of <i>tokens</i>.
 * Each token is separated from the next String by a <i>delimiter</i>.
 * One or more delimiter characters must be specified.
 * <p>
 * Each token may be surrounded by quotes.
 * The <i>quote</i> matcher specifies the quote character(s).
 * A quote may be escaped within a quoted section by duplicating itself.
 * <p>
 * Between each token and the delimiter are potentially characters that need trimming.
 * The <i>trimmer</i> matcher specifies these characters.
 * One usage might be to trim whitespace characters.
 * <p>
 * At any point outside the quotes there might potentially be invalid characters.
 * The <i>ignored</i> matcher specifies these characters to be removed.
 * One usage might be to remove new line characters.
 * <p>
 * Empty tokens may be removed or returned as null.
 * <pre>
 * "a,b,c"         - Three tokens "a","b","c"   (comma delimiter)
 * " a, b , c "    - Three tokens "a","b","c"   (default CSV processing trims whitespace)
 * "a, ", b ,", c" - Three tokens "a, " , " b ", ", c" (quoted text untouched)
 * </pre>
 * <p>
 *
 * This tokenizer has the following properties and options:
 *
 * <table>
 *  <tr>
 *   <th>Property</th><th>Type</th><th>Default</th>
 *  </tr>
 *  <tr>
 *   <td>delim</td><td>CharSetMatcher</td><td>{ \t\n\r\f}</td>
 *  </tr>
 *  <tr>
 *   <td>quote</td><td>NoneMatcher</td><td>{}</td>
 *  </tr>
 *  <tr>
 *   <td>ignore</td><td>NoneMatcher</td><td>{}</td>
 *  </tr>
 *  <tr>
 *   <td>emptyTokenAsNull</td><td>boolean</td><td>false</td>
 *  </tr>
 *  <tr>
 *   <td>ignoreEmptyTokens</td><td>boolean</td><td>true</td>
 *  </tr>
 * </table>
 *
 * @since 2.2
 * @version $Id$
 */
public class StrTokenizer implements ListIterator<String>, Cloneable {public static class __CLR4_1_2ckyckyl3lqxsoz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492827633L,8589935092L,16663,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final StrTokenizer CSV_TOKENIZER_PROTOTYPE;
    private static final StrTokenizer TSV_TOKENIZER_PROTOTYPE;
    static {try{__CLR4_1_2ckyckyl3lqxsoz.R.inc(16306);
        __CLR4_1_2ckyckyl3lqxsoz.R.inc(16307);CSV_TOKENIZER_PROTOTYPE = new StrTokenizer();
        __CLR4_1_2ckyckyl3lqxsoz.R.inc(16308);CSV_TOKENIZER_PROTOTYPE.setDelimiterMatcher(StrMatcher.commaMatcher());
        __CLR4_1_2ckyckyl3lqxsoz.R.inc(16309);CSV_TOKENIZER_PROTOTYPE.setQuoteMatcher(StrMatcher.doubleQuoteMatcher());
        __CLR4_1_2ckyckyl3lqxsoz.R.inc(16310);CSV_TOKENIZER_PROTOTYPE.setIgnoredMatcher(StrMatcher.noneMatcher());
        __CLR4_1_2ckyckyl3lqxsoz.R.inc(16311);CSV_TOKENIZER_PROTOTYPE.setTrimmerMatcher(StrMatcher.trimMatcher());
        __CLR4_1_2ckyckyl3lqxsoz.R.inc(16312);CSV_TOKENIZER_PROTOTYPE.setEmptyTokenAsNull(false);
        __CLR4_1_2ckyckyl3lqxsoz.R.inc(16313);CSV_TOKENIZER_PROTOTYPE.setIgnoreEmptyTokens(false);

        __CLR4_1_2ckyckyl3lqxsoz.R.inc(16314);TSV_TOKENIZER_PROTOTYPE = new StrTokenizer();
        __CLR4_1_2ckyckyl3lqxsoz.R.inc(16315);TSV_TOKENIZER_PROTOTYPE.setDelimiterMatcher(StrMatcher.tabMatcher());
        __CLR4_1_2ckyckyl3lqxsoz.R.inc(16316);TSV_TOKENIZER_PROTOTYPE.setQuoteMatcher(StrMatcher.doubleQuoteMatcher());
        __CLR4_1_2ckyckyl3lqxsoz.R.inc(16317);TSV_TOKENIZER_PROTOTYPE.setIgnoredMatcher(StrMatcher.noneMatcher());
        __CLR4_1_2ckyckyl3lqxsoz.R.inc(16318);TSV_TOKENIZER_PROTOTYPE.setTrimmerMatcher(StrMatcher.trimMatcher());
        __CLR4_1_2ckyckyl3lqxsoz.R.inc(16319);TSV_TOKENIZER_PROTOTYPE.setEmptyTokenAsNull(false);
        __CLR4_1_2ckyckyl3lqxsoz.R.inc(16320);TSV_TOKENIZER_PROTOTYPE.setIgnoreEmptyTokens(false);
    }finally{__CLR4_1_2ckyckyl3lqxsoz.R.flushNeeded();}}

    /** The text to work on. */
    private char chars[];
    /** The parsed tokens */
    private String tokens[];
    /** The current iteration position */
    private int tokenPos;

    /** The delimiter matcher */
    private StrMatcher delimMatcher = StrMatcher.splitMatcher();
    /** The quote matcher */
    private StrMatcher quoteMatcher = StrMatcher.noneMatcher();
    /** The ignored matcher */
    private StrMatcher ignoredMatcher = StrMatcher.noneMatcher();
    /** The trimmer matcher */
    private StrMatcher trimmerMatcher = StrMatcher.noneMatcher();

    /** Whether to return empty tokens as null */
    private boolean emptyAsNull = false;
    /** Whether to ignore empty tokens */
    private boolean ignoreEmptyTokens = true;

    //-----------------------------------------------------------------------

    /**
     * Returns a clone of <code>CSV_TOKENIZER_PROTOTYPE</code>.
     * 
     * @return a clone of <code>CSV_TOKENIZER_PROTOTYPE</code>.
     */
    private static StrTokenizer getCSVClone() {try{__CLR4_1_2ckyckyl3lqxsoz.R.inc(16321);
        __CLR4_1_2ckyckyl3lqxsoz.R.inc(16322);return (StrTokenizer) CSV_TOKENIZER_PROTOTYPE.clone();
    }finally{__CLR4_1_2ckyckyl3lqxsoz.R.flushNeeded();}}

    /**
     * Gets a new tokenizer instance which parses Comma Separated Value strings
     * initializing it with the given input.  The default for CSV processing
     * will be trim whitespace from both ends (which can be overridden with
     * the setTrimmer method).
     * <p>
     * You must call a "reset" method to set the string which you want to parse.
     * @return a new tokenizer instance which parses Comma Separated Value strings
     */
    public static StrTokenizer getCSVInstance() {try{__CLR4_1_2ckyckyl3lqxsoz.R.inc(16323);
        __CLR4_1_2ckyckyl3lqxsoz.R.inc(16324);return getCSVClone();
    }finally{__CLR4_1_2ckyckyl3lqxsoz.R.flushNeeded();}}

    /**
     * Gets a new tokenizer instance which parses Comma Separated Value strings
     * initializing it with the given input.  The default for CSV processing
     * will be trim whitespace from both ends (which can be overridden with
     * the setTrimmer method).
     *
     * @param input  the text to parse
     * @return a new tokenizer instance which parses Comma Separated Value strings
     */
    public static StrTokenizer getCSVInstance(final String input) {try{__CLR4_1_2ckyckyl3lqxsoz.R.inc(16325);
        __CLR4_1_2ckyckyl3lqxsoz.R.inc(16326);final StrTokenizer tok = getCSVClone();
        __CLR4_1_2ckyckyl3lqxsoz.R.inc(16327);tok.reset(input);
        __CLR4_1_2ckyckyl3lqxsoz.R.inc(16328);return tok;
    }finally{__CLR4_1_2ckyckyl3lqxsoz.R.flushNeeded();}}

    /**
     * Gets a new tokenizer instance which parses Comma Separated Value strings
     * initializing it with the given input.  The default for CSV processing
     * will be trim whitespace from both ends (which can be overridden with
     * the setTrimmer method).
     *
     * @param input  the text to parse
     * @return a new tokenizer instance which parses Comma Separated Value strings
     */
    public static StrTokenizer getCSVInstance(final char[] input) {try{__CLR4_1_2ckyckyl3lqxsoz.R.inc(16329);
        __CLR4_1_2ckyckyl3lqxsoz.R.inc(16330);final StrTokenizer tok = getCSVClone();
        __CLR4_1_2ckyckyl3lqxsoz.R.inc(16331);tok.reset(input);
        __CLR4_1_2ckyckyl3lqxsoz.R.inc(16332);return tok;
    }finally{__CLR4_1_2ckyckyl3lqxsoz.R.flushNeeded();}}

    /**
     * Returns a clone of <code>TSV_TOKENIZER_PROTOTYPE</code>.
     * 
     * @return a clone of <code>TSV_TOKENIZER_PROTOTYPE</code>.
     */
    private static StrTokenizer getTSVClone() {try{__CLR4_1_2ckyckyl3lqxsoz.R.inc(16333);
        __CLR4_1_2ckyckyl3lqxsoz.R.inc(16334);return (StrTokenizer) TSV_TOKENIZER_PROTOTYPE.clone();
    }finally{__CLR4_1_2ckyckyl3lqxsoz.R.flushNeeded();}}


    /**
     * Gets a new tokenizer instance which parses Tab Separated Value strings.
     * The default for CSV processing will be trim whitespace from both ends
     * (which can be overridden with the setTrimmer method).
     * <p>
     * You must call a "reset" method to set the string which you want to parse.
     * @return a new tokenizer instance which parses Tab Separated Value strings.
     */
    public static StrTokenizer getTSVInstance() {try{__CLR4_1_2ckyckyl3lqxsoz.R.inc(16335);
        __CLR4_1_2ckyckyl3lqxsoz.R.inc(16336);return getTSVClone();
    }finally{__CLR4_1_2ckyckyl3lqxsoz.R.flushNeeded();}}

    /**
     * Gets a new tokenizer instance which parses Tab Separated Value strings.
     * The default for CSV processing will be trim whitespace from both ends
     * (which can be overridden with the setTrimmer method).
     * @param input  the string to parse
     * @return a new tokenizer instance which parses Tab Separated Value strings.
     */
    public static StrTokenizer getTSVInstance(final String input) {try{__CLR4_1_2ckyckyl3lqxsoz.R.inc(16337);
        __CLR4_1_2ckyckyl3lqxsoz.R.inc(16338);final StrTokenizer tok = getTSVClone();
        __CLR4_1_2ckyckyl3lqxsoz.R.inc(16339);tok.reset(input);
        __CLR4_1_2ckyckyl3lqxsoz.R.inc(16340);return tok;
    }finally{__CLR4_1_2ckyckyl3lqxsoz.R.flushNeeded();}}

    /**
     * Gets a new tokenizer instance which parses Tab Separated Value strings.
     * The default for CSV processing will be trim whitespace from both ends
     * (which can be overridden with the setTrimmer method).
     * @param input  the string to parse
     * @return a new tokenizer instance which parses Tab Separated Value strings.
     */
    public static StrTokenizer getTSVInstance(final char[] input) {try{__CLR4_1_2ckyckyl3lqxsoz.R.inc(16341);
        __CLR4_1_2ckyckyl3lqxsoz.R.inc(16342);final StrTokenizer tok = getTSVClone();
        __CLR4_1_2ckyckyl3lqxsoz.R.inc(16343);tok.reset(input);
        __CLR4_1_2ckyckyl3lqxsoz.R.inc(16344);return tok;
    }finally{__CLR4_1_2ckyckyl3lqxsoz.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Constructs a tokenizer splitting on space, tab, newline and formfeed
     * as per StringTokenizer, but with no text to tokenize.
     * <p>
     * This constructor is normally used with {@link #reset(String)}.
     */
    public StrTokenizer() {
        super();__CLR4_1_2ckyckyl3lqxsoz.R.inc(16346);try{__CLR4_1_2ckyckyl3lqxsoz.R.inc(16345);
        __CLR4_1_2ckyckyl3lqxsoz.R.inc(16347);this.chars = null;
    }finally{__CLR4_1_2ckyckyl3lqxsoz.R.flushNeeded();}}

    /**
     * Constructs a tokenizer splitting on space, tab, newline and formfeed
     * as per StringTokenizer.
     *
     * @param input  the string which is to be parsed
     */
    public StrTokenizer(final String input) {
        super();__CLR4_1_2ckyckyl3lqxsoz.R.inc(16349);try{__CLR4_1_2ckyckyl3lqxsoz.R.inc(16348);
        __CLR4_1_2ckyckyl3lqxsoz.R.inc(16350);if ((((input != null)&&(__CLR4_1_2ckyckyl3lqxsoz.R.iget(16351)!=0|true))||(__CLR4_1_2ckyckyl3lqxsoz.R.iget(16352)==0&false))) {{
            __CLR4_1_2ckyckyl3lqxsoz.R.inc(16353);chars = input.toCharArray();
        } }else {{
            __CLR4_1_2ckyckyl3lqxsoz.R.inc(16354);chars = null;
        }
    }}finally{__CLR4_1_2ckyckyl3lqxsoz.R.flushNeeded();}}

    /**
     * Constructs a tokenizer splitting on the specified delimiter character.
     *
     * @param input  the string which is to be parsed
     * @param delim  the field delimiter character
     */
    public StrTokenizer(final String input, final char delim) {
        this(input);__CLR4_1_2ckyckyl3lqxsoz.R.inc(16356);try{__CLR4_1_2ckyckyl3lqxsoz.R.inc(16355);
        __CLR4_1_2ckyckyl3lqxsoz.R.inc(16357);setDelimiterChar(delim);
    }finally{__CLR4_1_2ckyckyl3lqxsoz.R.flushNeeded();}}

    /**
     * Constructs a tokenizer splitting on the specified delimiter string.
     *
     * @param input  the string which is to be parsed
     * @param delim  the field delimiter string
     */
    public StrTokenizer(final String input, final String delim) {
        this(input);__CLR4_1_2ckyckyl3lqxsoz.R.inc(16359);try{__CLR4_1_2ckyckyl3lqxsoz.R.inc(16358);
        __CLR4_1_2ckyckyl3lqxsoz.R.inc(16360);setDelimiterString(delim);
    }finally{__CLR4_1_2ckyckyl3lqxsoz.R.flushNeeded();}}

    /**
     * Constructs a tokenizer splitting using the specified delimiter matcher.
     *
     * @param input  the string which is to be parsed
     * @param delim  the field delimiter matcher
     */
    public StrTokenizer(final String input, final StrMatcher delim) {
        this(input);__CLR4_1_2ckyckyl3lqxsoz.R.inc(16362);try{__CLR4_1_2ckyckyl3lqxsoz.R.inc(16361);
        __CLR4_1_2ckyckyl3lqxsoz.R.inc(16363);setDelimiterMatcher(delim);
    }finally{__CLR4_1_2ckyckyl3lqxsoz.R.flushNeeded();}}

    /**
     * Constructs a tokenizer splitting on the specified delimiter character
     * and handling quotes using the specified quote character.
     *
     * @param input  the string which is to be parsed
     * @param delim  the field delimiter character
     * @param quote  the field quoted string character
     */
    public StrTokenizer(final String input, final char delim, final char quote) {
        this(input, delim);__CLR4_1_2ckyckyl3lqxsoz.R.inc(16365);try{__CLR4_1_2ckyckyl3lqxsoz.R.inc(16364);
        __CLR4_1_2ckyckyl3lqxsoz.R.inc(16366);setQuoteChar(quote);
    }finally{__CLR4_1_2ckyckyl3lqxsoz.R.flushNeeded();}}

    /**
     * Constructs a tokenizer splitting using the specified delimiter matcher
     * and handling quotes using the specified quote matcher.
     *
     * @param input  the string which is to be parsed
     * @param delim  the field delimiter matcher
     * @param quote  the field quoted string matcher
     */
    public StrTokenizer(final String input, final StrMatcher delim, final StrMatcher quote) {
        this(input, delim);__CLR4_1_2ckyckyl3lqxsoz.R.inc(16368);try{__CLR4_1_2ckyckyl3lqxsoz.R.inc(16367);
        __CLR4_1_2ckyckyl3lqxsoz.R.inc(16369);setQuoteMatcher(quote);
    }finally{__CLR4_1_2ckyckyl3lqxsoz.R.flushNeeded();}}

    /**
     * Constructs a tokenizer splitting on space, tab, newline and formfeed
     * as per StringTokenizer.
     *
     * @param input  the string which is to be parsed, not cloned
     */
    public StrTokenizer(final char[] input) {
        super();__CLR4_1_2ckyckyl3lqxsoz.R.inc(16371);try{__CLR4_1_2ckyckyl3lqxsoz.R.inc(16370);
        __CLR4_1_2ckyckyl3lqxsoz.R.inc(16372);this.chars = ArrayUtils.clone(input);
    }finally{__CLR4_1_2ckyckyl3lqxsoz.R.flushNeeded();}}

    /**
     * Constructs a tokenizer splitting on the specified character.
     *
     * @param input  the string which is to be parsed, not cloned
     * @param delim the field delimiter character
     */
    public StrTokenizer(final char[] input, final char delim) {
        this(input);__CLR4_1_2ckyckyl3lqxsoz.R.inc(16374);try{__CLR4_1_2ckyckyl3lqxsoz.R.inc(16373);
        __CLR4_1_2ckyckyl3lqxsoz.R.inc(16375);setDelimiterChar(delim);
    }finally{__CLR4_1_2ckyckyl3lqxsoz.R.flushNeeded();}}

    /**
     * Constructs a tokenizer splitting on the specified string.
     *
     * @param input  the string which is to be parsed, not cloned
     * @param delim the field delimiter string
     */
    public StrTokenizer(final char[] input, final String delim) {
        this(input);__CLR4_1_2ckyckyl3lqxsoz.R.inc(16377);try{__CLR4_1_2ckyckyl3lqxsoz.R.inc(16376);
        __CLR4_1_2ckyckyl3lqxsoz.R.inc(16378);setDelimiterString(delim);
    }finally{__CLR4_1_2ckyckyl3lqxsoz.R.flushNeeded();}}

    /**
     * Constructs a tokenizer splitting using the specified delimiter matcher.
     *
     * @param input  the string which is to be parsed, not cloned
     * @param delim  the field delimiter matcher
     */
    public StrTokenizer(final char[] input, final StrMatcher delim) {
        this(input);__CLR4_1_2ckyckyl3lqxsoz.R.inc(16380);try{__CLR4_1_2ckyckyl3lqxsoz.R.inc(16379);
        __CLR4_1_2ckyckyl3lqxsoz.R.inc(16381);setDelimiterMatcher(delim);
    }finally{__CLR4_1_2ckyckyl3lqxsoz.R.flushNeeded();}}

    /**
     * Constructs a tokenizer splitting on the specified delimiter character
     * and handling quotes using the specified quote character.
     *
     * @param input  the string which is to be parsed, not cloned
     * @param delim  the field delimiter character
     * @param quote  the field quoted string character
     */
    public StrTokenizer(final char[] input, final char delim, final char quote) {
        this(input, delim);__CLR4_1_2ckyckyl3lqxsoz.R.inc(16383);try{__CLR4_1_2ckyckyl3lqxsoz.R.inc(16382);
        __CLR4_1_2ckyckyl3lqxsoz.R.inc(16384);setQuoteChar(quote);
    }finally{__CLR4_1_2ckyckyl3lqxsoz.R.flushNeeded();}}

    /**
     * Constructs a tokenizer splitting using the specified delimiter matcher
     * and handling quotes using the specified quote matcher.
     *
     * @param input  the string which is to be parsed, not cloned
     * @param delim  the field delimiter character
     * @param quote  the field quoted string character
     */
    public StrTokenizer(final char[] input, final StrMatcher delim, final StrMatcher quote) {
        this(input, delim);__CLR4_1_2ckyckyl3lqxsoz.R.inc(16386);try{__CLR4_1_2ckyckyl3lqxsoz.R.inc(16385);
        __CLR4_1_2ckyckyl3lqxsoz.R.inc(16387);setQuoteMatcher(quote);
    }finally{__CLR4_1_2ckyckyl3lqxsoz.R.flushNeeded();}}

    // API
    //-----------------------------------------------------------------------
    /**
     * Gets the number of tokens found in the String.
     *
     * @return the number of matched tokens
     */
    public int size() {try{__CLR4_1_2ckyckyl3lqxsoz.R.inc(16388);
        __CLR4_1_2ckyckyl3lqxsoz.R.inc(16389);checkTokenized();
        __CLR4_1_2ckyckyl3lqxsoz.R.inc(16390);return tokens.length;
    }finally{__CLR4_1_2ckyckyl3lqxsoz.R.flushNeeded();}}

    /**
     * Gets the next token from the String.
     * Equivalent to {@link #next()} except it returns null rather than
     * throwing {@link NoSuchElementException} when no tokens remain.
     *
     * @return the next sequential token, or null when no more tokens are found
     */
    public String nextToken() {try{__CLR4_1_2ckyckyl3lqxsoz.R.inc(16391);
        __CLR4_1_2ckyckyl3lqxsoz.R.inc(16392);if ((((hasNext())&&(__CLR4_1_2ckyckyl3lqxsoz.R.iget(16393)!=0|true))||(__CLR4_1_2ckyckyl3lqxsoz.R.iget(16394)==0&false))) {{
            __CLR4_1_2ckyckyl3lqxsoz.R.inc(16395);return tokens[tokenPos++];
        }
        }__CLR4_1_2ckyckyl3lqxsoz.R.inc(16396);return null;
    }finally{__CLR4_1_2ckyckyl3lqxsoz.R.flushNeeded();}}

    /**
     * Gets the previous token from the String.
     *
     * @return the previous sequential token, or null when no more tokens are found
     */
    public String previousToken() {try{__CLR4_1_2ckyckyl3lqxsoz.R.inc(16397);
        __CLR4_1_2ckyckyl3lqxsoz.R.inc(16398);if ((((hasPrevious())&&(__CLR4_1_2ckyckyl3lqxsoz.R.iget(16399)!=0|true))||(__CLR4_1_2ckyckyl3lqxsoz.R.iget(16400)==0&false))) {{
            __CLR4_1_2ckyckyl3lqxsoz.R.inc(16401);return tokens[--tokenPos];
        }
        }__CLR4_1_2ckyckyl3lqxsoz.R.inc(16402);return null;
    }finally{__CLR4_1_2ckyckyl3lqxsoz.R.flushNeeded();}}

    /**
     * Gets a copy of the full token list as an independent modifiable array.
     *
     * @return the tokens as a String array
     */
    public String[] getTokenArray() {try{__CLR4_1_2ckyckyl3lqxsoz.R.inc(16403);
        __CLR4_1_2ckyckyl3lqxsoz.R.inc(16404);checkTokenized();
        __CLR4_1_2ckyckyl3lqxsoz.R.inc(16405);return tokens.clone();
    }finally{__CLR4_1_2ckyckyl3lqxsoz.R.flushNeeded();}}

    /**
     * Gets a copy of the full token list as an independent modifiable list.
     *
     * @return the tokens as a String array
     */
    public List<String> getTokenList() {try{__CLR4_1_2ckyckyl3lqxsoz.R.inc(16406);
        __CLR4_1_2ckyckyl3lqxsoz.R.inc(16407);checkTokenized();
        __CLR4_1_2ckyckyl3lqxsoz.R.inc(16408);final List<String> list = new ArrayList<String>(tokens.length);
        __CLR4_1_2ckyckyl3lqxsoz.R.inc(16409);for (final String element : tokens) {{
            __CLR4_1_2ckyckyl3lqxsoz.R.inc(16410);list.add(element);
        }
        }__CLR4_1_2ckyckyl3lqxsoz.R.inc(16411);return list;
    }finally{__CLR4_1_2ckyckyl3lqxsoz.R.flushNeeded();}}

    /**
     * Resets this tokenizer, forgetting all parsing and iteration already completed.
     * <p>
     * This method allows the same tokenizer to be reused for the same String.
     *
     * @return this, to enable chaining
     */
    public StrTokenizer reset() {try{__CLR4_1_2ckyckyl3lqxsoz.R.inc(16412);
        __CLR4_1_2ckyckyl3lqxsoz.R.inc(16413);tokenPos = 0;
        __CLR4_1_2ckyckyl3lqxsoz.R.inc(16414);tokens = null;
        __CLR4_1_2ckyckyl3lqxsoz.R.inc(16415);return this;
    }finally{__CLR4_1_2ckyckyl3lqxsoz.R.flushNeeded();}}

    /**
     * Reset this tokenizer, giving it a new input string to parse.
     * In this manner you can re-use a tokenizer with the same settings
     * on multiple input lines.
     *
     * @param input  the new string to tokenize, null sets no text to parse
     * @return this, to enable chaining
     */
    public StrTokenizer reset(final String input) {try{__CLR4_1_2ckyckyl3lqxsoz.R.inc(16416);
        __CLR4_1_2ckyckyl3lqxsoz.R.inc(16417);reset();
        __CLR4_1_2ckyckyl3lqxsoz.R.inc(16418);if ((((input != null)&&(__CLR4_1_2ckyckyl3lqxsoz.R.iget(16419)!=0|true))||(__CLR4_1_2ckyckyl3lqxsoz.R.iget(16420)==0&false))) {{
            __CLR4_1_2ckyckyl3lqxsoz.R.inc(16421);this.chars = input.toCharArray();
        } }else {{
            __CLR4_1_2ckyckyl3lqxsoz.R.inc(16422);this.chars = null;
        }
        }__CLR4_1_2ckyckyl3lqxsoz.R.inc(16423);return this;
    }finally{__CLR4_1_2ckyckyl3lqxsoz.R.flushNeeded();}}

    /**
     * Reset this tokenizer, giving it a new input string to parse.
     * In this manner you can re-use a tokenizer with the same settings
     * on multiple input lines.
     *
     * @param input  the new character array to tokenize, not cloned, null sets no text to parse
     * @return this, to enable chaining
     */
    public StrTokenizer reset(final char[] input) {try{__CLR4_1_2ckyckyl3lqxsoz.R.inc(16424);
        __CLR4_1_2ckyckyl3lqxsoz.R.inc(16425);reset();
        __CLR4_1_2ckyckyl3lqxsoz.R.inc(16426);this.chars = ArrayUtils.clone(input);
        __CLR4_1_2ckyckyl3lqxsoz.R.inc(16427);return this;
    }finally{__CLR4_1_2ckyckyl3lqxsoz.R.flushNeeded();}}

    // ListIterator
    //-----------------------------------------------------------------------
    /**
     * Checks whether there are any more tokens.
     *
     * @return true if there are more tokens
     */
    @Override
    public boolean hasNext() {try{__CLR4_1_2ckyckyl3lqxsoz.R.inc(16428);
        __CLR4_1_2ckyckyl3lqxsoz.R.inc(16429);checkTokenized();
        __CLR4_1_2ckyckyl3lqxsoz.R.inc(16430);return tokenPos < tokens.length;
    }finally{__CLR4_1_2ckyckyl3lqxsoz.R.flushNeeded();}}

    /**
     * Gets the next token.
     *
     * @return the next String token
     * @throws NoSuchElementException if there are no more elements
     */
    @Override
    public String next() {try{__CLR4_1_2ckyckyl3lqxsoz.R.inc(16431);
        __CLR4_1_2ckyckyl3lqxsoz.R.inc(16432);if ((((hasNext())&&(__CLR4_1_2ckyckyl3lqxsoz.R.iget(16433)!=0|true))||(__CLR4_1_2ckyckyl3lqxsoz.R.iget(16434)==0&false))) {{
            __CLR4_1_2ckyckyl3lqxsoz.R.inc(16435);return tokens[tokenPos++];
        }
        }__CLR4_1_2ckyckyl3lqxsoz.R.inc(16436);throw new NoSuchElementException();
    }finally{__CLR4_1_2ckyckyl3lqxsoz.R.flushNeeded();}}

    /**
     * Gets the index of the next token to return.
     *
     * @return the next token index
     */
    @Override
    public int nextIndex() {try{__CLR4_1_2ckyckyl3lqxsoz.R.inc(16437);
        __CLR4_1_2ckyckyl3lqxsoz.R.inc(16438);return tokenPos;
    }finally{__CLR4_1_2ckyckyl3lqxsoz.R.flushNeeded();}}

    /**
     * Checks whether there are any previous tokens that can be iterated to.
     *
     * @return true if there are previous tokens
     */
    @Override
    public boolean hasPrevious() {try{__CLR4_1_2ckyckyl3lqxsoz.R.inc(16439);
        __CLR4_1_2ckyckyl3lqxsoz.R.inc(16440);checkTokenized();
        __CLR4_1_2ckyckyl3lqxsoz.R.inc(16441);return tokenPos > 0;
    }finally{__CLR4_1_2ckyckyl3lqxsoz.R.flushNeeded();}}

    /**
     * Gets the token previous to the last returned token.
     *
     * @return the previous token
     */
    @Override
    public String previous() {try{__CLR4_1_2ckyckyl3lqxsoz.R.inc(16442);
        __CLR4_1_2ckyckyl3lqxsoz.R.inc(16443);if ((((hasPrevious())&&(__CLR4_1_2ckyckyl3lqxsoz.R.iget(16444)!=0|true))||(__CLR4_1_2ckyckyl3lqxsoz.R.iget(16445)==0&false))) {{
            __CLR4_1_2ckyckyl3lqxsoz.R.inc(16446);return tokens[--tokenPos];
        }
        }__CLR4_1_2ckyckyl3lqxsoz.R.inc(16447);throw new NoSuchElementException();
    }finally{__CLR4_1_2ckyckyl3lqxsoz.R.flushNeeded();}}

    /**
     * Gets the index of the previous token.
     *
     * @return the previous token index
     */
    @Override
    public int previousIndex() {try{__CLR4_1_2ckyckyl3lqxsoz.R.inc(16448);
        __CLR4_1_2ckyckyl3lqxsoz.R.inc(16449);return tokenPos - 1;
    }finally{__CLR4_1_2ckyckyl3lqxsoz.R.flushNeeded();}}

    /**
     * Unsupported ListIterator operation.
     *
     * @throws UnsupportedOperationException always
     */
    @Override
    public void remove() {try{__CLR4_1_2ckyckyl3lqxsoz.R.inc(16450);
        __CLR4_1_2ckyckyl3lqxsoz.R.inc(16451);throw new UnsupportedOperationException("remove() is unsupported");
    }finally{__CLR4_1_2ckyckyl3lqxsoz.R.flushNeeded();}}

    /**
     * Unsupported ListIterator operation.
     * @param obj this parameter ignored.
     * @throws UnsupportedOperationException always
     */
    @Override
    public void set(final String obj) {try{__CLR4_1_2ckyckyl3lqxsoz.R.inc(16452);
        __CLR4_1_2ckyckyl3lqxsoz.R.inc(16453);throw new UnsupportedOperationException("set() is unsupported");
    }finally{__CLR4_1_2ckyckyl3lqxsoz.R.flushNeeded();}}

    /**
     * Unsupported ListIterator operation.
     * @param obj this parameter ignored.
     * @throws UnsupportedOperationException always
     */
    @Override
    public void add(final String obj) {try{__CLR4_1_2ckyckyl3lqxsoz.R.inc(16454);
        __CLR4_1_2ckyckyl3lqxsoz.R.inc(16455);throw new UnsupportedOperationException("add() is unsupported");
    }finally{__CLR4_1_2ckyckyl3lqxsoz.R.flushNeeded();}}

    // Implementation
    //-----------------------------------------------------------------------
    /**
     * Checks if tokenization has been done, and if not then do it.
     */
    private void checkTokenized() {try{__CLR4_1_2ckyckyl3lqxsoz.R.inc(16456);
        __CLR4_1_2ckyckyl3lqxsoz.R.inc(16457);if ((((tokens == null)&&(__CLR4_1_2ckyckyl3lqxsoz.R.iget(16458)!=0|true))||(__CLR4_1_2ckyckyl3lqxsoz.R.iget(16459)==0&false))) {{
            __CLR4_1_2ckyckyl3lqxsoz.R.inc(16460);if ((((chars == null)&&(__CLR4_1_2ckyckyl3lqxsoz.R.iget(16461)!=0|true))||(__CLR4_1_2ckyckyl3lqxsoz.R.iget(16462)==0&false))) {{
                // still call tokenize as subclass may do some work
                __CLR4_1_2ckyckyl3lqxsoz.R.inc(16463);final List<String> split = tokenize(null, 0, 0);
                __CLR4_1_2ckyckyl3lqxsoz.R.inc(16464);tokens = split.toArray(new String[split.size()]);
            } }else {{
                __CLR4_1_2ckyckyl3lqxsoz.R.inc(16465);final List<String> split = tokenize(chars, 0, chars.length);
                __CLR4_1_2ckyckyl3lqxsoz.R.inc(16466);tokens = split.toArray(new String[split.size()]);
            }
        }}
    }}finally{__CLR4_1_2ckyckyl3lqxsoz.R.flushNeeded();}}

    /**
     * Internal method to performs the tokenization.
     * <p>
     * Most users of this class do not need to call this method. This method
     * will be called automatically by other (public) methods when required.
     * <p>
     * This method exists to allow subclasses to add code before or after the
     * tokenization. For example, a subclass could alter the character array,
     * offset or count to be parsed, or call the tokenizer multiple times on
     * multiple strings. It is also be possible to filter the results.
     * <p>
     * <code>StrTokenizer</code> will always pass a zero offset and a count
     * equal to the length of the array to this method, however a subclass
     * may pass other values, or even an entirely different array.
     * 
     * @param chars  the character array being tokenized, may be null
     * @param offset  the start position within the character array, must be valid
     * @param count  the number of characters to tokenize, must be valid
     * @return the modifiable list of String tokens, unmodifiable if null array or zero count
     */
    protected List<String> tokenize(final char[] chars, final int offset, final int count) {try{__CLR4_1_2ckyckyl3lqxsoz.R.inc(16467);
        __CLR4_1_2ckyckyl3lqxsoz.R.inc(16468);if ((((chars == null || count == 0)&&(__CLR4_1_2ckyckyl3lqxsoz.R.iget(16469)!=0|true))||(__CLR4_1_2ckyckyl3lqxsoz.R.iget(16470)==0&false))) {{
            __CLR4_1_2ckyckyl3lqxsoz.R.inc(16471);return Collections.emptyList();
        }
        }__CLR4_1_2ckyckyl3lqxsoz.R.inc(16472);final StrBuilder buf = new StrBuilder();
        __CLR4_1_2ckyckyl3lqxsoz.R.inc(16473);final List<String> tokens = new ArrayList<String>();
        __CLR4_1_2ckyckyl3lqxsoz.R.inc(16474);int pos = offset;
        
        // loop around the entire buffer
        __CLR4_1_2ckyckyl3lqxsoz.R.inc(16475);while ((((pos >= 0 && pos < count)&&(__CLR4_1_2ckyckyl3lqxsoz.R.iget(16476)!=0|true))||(__CLR4_1_2ckyckyl3lqxsoz.R.iget(16477)==0&false))) {{
            // find next token
            __CLR4_1_2ckyckyl3lqxsoz.R.inc(16478);pos = readNextToken(chars, pos, count, buf, tokens);
            
            // handle case where end of string is a delimiter
            __CLR4_1_2ckyckyl3lqxsoz.R.inc(16479);if ((((pos >= count)&&(__CLR4_1_2ckyckyl3lqxsoz.R.iget(16480)!=0|true))||(__CLR4_1_2ckyckyl3lqxsoz.R.iget(16481)==0&false))) {{
                __CLR4_1_2ckyckyl3lqxsoz.R.inc(16482);addToken(tokens, "");
            }
        }}
        }__CLR4_1_2ckyckyl3lqxsoz.R.inc(16483);return tokens;
    }finally{__CLR4_1_2ckyckyl3lqxsoz.R.flushNeeded();}}

    /**
     * Adds a token to a list, paying attention to the parameters we've set.
     *
     * @param list  the list to add to
     * @param tok  the token to add
     */
    private void addToken(final List<String> list, String tok) {try{__CLR4_1_2ckyckyl3lqxsoz.R.inc(16484);
        __CLR4_1_2ckyckyl3lqxsoz.R.inc(16485);if ((((StringUtils.isEmpty(tok))&&(__CLR4_1_2ckyckyl3lqxsoz.R.iget(16486)!=0|true))||(__CLR4_1_2ckyckyl3lqxsoz.R.iget(16487)==0&false))) {{
            __CLR4_1_2ckyckyl3lqxsoz.R.inc(16488);if ((((isIgnoreEmptyTokens())&&(__CLR4_1_2ckyckyl3lqxsoz.R.iget(16489)!=0|true))||(__CLR4_1_2ckyckyl3lqxsoz.R.iget(16490)==0&false))) {{
                __CLR4_1_2ckyckyl3lqxsoz.R.inc(16491);return;
            }
            }__CLR4_1_2ckyckyl3lqxsoz.R.inc(16492);if ((((isEmptyTokenAsNull())&&(__CLR4_1_2ckyckyl3lqxsoz.R.iget(16493)!=0|true))||(__CLR4_1_2ckyckyl3lqxsoz.R.iget(16494)==0&false))) {{
                __CLR4_1_2ckyckyl3lqxsoz.R.inc(16495);tok = null;
            }
        }}
        }__CLR4_1_2ckyckyl3lqxsoz.R.inc(16496);list.add(tok);
    }finally{__CLR4_1_2ckyckyl3lqxsoz.R.flushNeeded();}}

    /**
     * Reads character by character through the String to get the next token.
     *
     * @param chars  the character array being tokenized
     * @param start  the first character of field
     * @param len  the length of the character array being tokenized
     * @param workArea  a temporary work area
     * @param tokens  the list of parsed tokens
     * @return the starting position of the next field (the character
     *  immediately after the delimiter), or -1 if end of string found
     */
    private int readNextToken(final char[] chars, int start, final int len, final StrBuilder workArea, final List<String> tokens) {try{__CLR4_1_2ckyckyl3lqxsoz.R.inc(16497);
        // skip all leading whitespace, unless it is the
        // field delimiter or the quote character
        __CLR4_1_2ckyckyl3lqxsoz.R.inc(16498);while ((((start < len)&&(__CLR4_1_2ckyckyl3lqxsoz.R.iget(16499)!=0|true))||(__CLR4_1_2ckyckyl3lqxsoz.R.iget(16500)==0&false))) {{
            __CLR4_1_2ckyckyl3lqxsoz.R.inc(16501);final int removeLen = Math.max(
                    getIgnoredMatcher().isMatch(chars, start, start, len),
                    getTrimmerMatcher().isMatch(chars, start, start, len));
            __CLR4_1_2ckyckyl3lqxsoz.R.inc(16502);if ((((removeLen == 0 ||
                getDelimiterMatcher().isMatch(chars, start, start, len) > 0 ||
                getQuoteMatcher().isMatch(chars, start, start, len) > 0)&&(__CLR4_1_2ckyckyl3lqxsoz.R.iget(16503)!=0|true))||(__CLR4_1_2ckyckyl3lqxsoz.R.iget(16504)==0&false))) {{
                __CLR4_1_2ckyckyl3lqxsoz.R.inc(16505);break;
            }
            }__CLR4_1_2ckyckyl3lqxsoz.R.inc(16506);start += removeLen;
        }
        
        // handle reaching end
        }__CLR4_1_2ckyckyl3lqxsoz.R.inc(16507);if ((((start >= len)&&(__CLR4_1_2ckyckyl3lqxsoz.R.iget(16508)!=0|true))||(__CLR4_1_2ckyckyl3lqxsoz.R.iget(16509)==0&false))) {{
            __CLR4_1_2ckyckyl3lqxsoz.R.inc(16510);addToken(tokens, "");
            __CLR4_1_2ckyckyl3lqxsoz.R.inc(16511);return -1;
        }
        
        // handle empty token
        }__CLR4_1_2ckyckyl3lqxsoz.R.inc(16512);final int delimLen = getDelimiterMatcher().isMatch(chars, start, start, len);
        __CLR4_1_2ckyckyl3lqxsoz.R.inc(16513);if ((((delimLen > 0)&&(__CLR4_1_2ckyckyl3lqxsoz.R.iget(16514)!=0|true))||(__CLR4_1_2ckyckyl3lqxsoz.R.iget(16515)==0&false))) {{
            __CLR4_1_2ckyckyl3lqxsoz.R.inc(16516);addToken(tokens, "");
            __CLR4_1_2ckyckyl3lqxsoz.R.inc(16517);return start + delimLen;
        }
        
        // handle found token
        }__CLR4_1_2ckyckyl3lqxsoz.R.inc(16518);final int quoteLen = getQuoteMatcher().isMatch(chars, start, start, len);
        __CLR4_1_2ckyckyl3lqxsoz.R.inc(16519);if ((((quoteLen > 0)&&(__CLR4_1_2ckyckyl3lqxsoz.R.iget(16520)!=0|true))||(__CLR4_1_2ckyckyl3lqxsoz.R.iget(16521)==0&false))) {{
            __CLR4_1_2ckyckyl3lqxsoz.R.inc(16522);return readWithQuotes(chars, start + quoteLen, len, workArea, tokens, start, quoteLen);
        }
        }__CLR4_1_2ckyckyl3lqxsoz.R.inc(16523);return readWithQuotes(chars, start, len, workArea, tokens, 0, 0);
    }finally{__CLR4_1_2ckyckyl3lqxsoz.R.flushNeeded();}}

    /**
     * Reads a possibly quoted string token.
     *
     * @param chars  the character array being tokenized
     * @param start  the first character of field
     * @param len  the length of the character array being tokenized
     * @param workArea  a temporary work area
     * @param tokens  the list of parsed tokens
     * @param quoteStart  the start position of the matched quote, 0 if no quoting
     * @param quoteLen  the length of the matched quote, 0 if no quoting
     * @return the starting position of the next field (the character
     *  immediately after the delimiter, or if end of string found,
     *  then the length of string
     */
    private int readWithQuotes(final char[] chars, final int start, final int len, final StrBuilder workArea, 
                               final List<String> tokens, final int quoteStart, final int quoteLen) {try{__CLR4_1_2ckyckyl3lqxsoz.R.inc(16524);
        // Loop until we've found the end of the quoted
        // string or the end of the input
        __CLR4_1_2ckyckyl3lqxsoz.R.inc(16525);workArea.clear();
        __CLR4_1_2ckyckyl3lqxsoz.R.inc(16526);int pos = start;
        __CLR4_1_2ckyckyl3lqxsoz.R.inc(16527);boolean quoting = quoteLen > 0;
        __CLR4_1_2ckyckyl3lqxsoz.R.inc(16528);int trimStart = 0;
        
        __CLR4_1_2ckyckyl3lqxsoz.R.inc(16529);while ((((pos < len)&&(__CLR4_1_2ckyckyl3lqxsoz.R.iget(16530)!=0|true))||(__CLR4_1_2ckyckyl3lqxsoz.R.iget(16531)==0&false))) {{
            // quoting mode can occur several times throughout a string
            // we must switch between quoting and non-quoting until we
            // encounter a non-quoted delimiter, or end of string
            __CLR4_1_2ckyckyl3lqxsoz.R.inc(16532);if ((((quoting)&&(__CLR4_1_2ckyckyl3lqxsoz.R.iget(16533)!=0|true))||(__CLR4_1_2ckyckyl3lqxsoz.R.iget(16534)==0&false))) {{
                // In quoting mode
                
                // If we've found a quote character, see if it's
                // followed by a second quote.  If so, then we need
                // to actually put the quote character into the token
                // rather than end the token.
                __CLR4_1_2ckyckyl3lqxsoz.R.inc(16535);if ((((isQuote(chars, pos, len, quoteStart, quoteLen))&&(__CLR4_1_2ckyckyl3lqxsoz.R.iget(16536)!=0|true))||(__CLR4_1_2ckyckyl3lqxsoz.R.iget(16537)==0&false))) {{
                    __CLR4_1_2ckyckyl3lqxsoz.R.inc(16538);if ((((isQuote(chars, pos + quoteLen, len, quoteStart, quoteLen))&&(__CLR4_1_2ckyckyl3lqxsoz.R.iget(16539)!=0|true))||(__CLR4_1_2ckyckyl3lqxsoz.R.iget(16540)==0&false))) {{
                        // matched pair of quotes, thus an escaped quote
                        __CLR4_1_2ckyckyl3lqxsoz.R.inc(16541);workArea.append(chars, pos, quoteLen);
                        __CLR4_1_2ckyckyl3lqxsoz.R.inc(16542);pos += quoteLen * 2;
                        __CLR4_1_2ckyckyl3lqxsoz.R.inc(16543);trimStart = workArea.size();
                        __CLR4_1_2ckyckyl3lqxsoz.R.inc(16544);continue;
                    }
                    
                    // end of quoting
                    }__CLR4_1_2ckyckyl3lqxsoz.R.inc(16545);quoting = false;
                    __CLR4_1_2ckyckyl3lqxsoz.R.inc(16546);pos += quoteLen;
                    __CLR4_1_2ckyckyl3lqxsoz.R.inc(16547);continue;
                }
                
                // copy regular character from inside quotes
                }__CLR4_1_2ckyckyl3lqxsoz.R.inc(16548);workArea.append(chars[pos++]);
                __CLR4_1_2ckyckyl3lqxsoz.R.inc(16549);trimStart = workArea.size();
                
            } }else {{
                // Not in quoting mode
                
                // check for delimiter, and thus end of token
                __CLR4_1_2ckyckyl3lqxsoz.R.inc(16550);final int delimLen = getDelimiterMatcher().isMatch(chars, pos, start, len);
                __CLR4_1_2ckyckyl3lqxsoz.R.inc(16551);if ((((delimLen > 0)&&(__CLR4_1_2ckyckyl3lqxsoz.R.iget(16552)!=0|true))||(__CLR4_1_2ckyckyl3lqxsoz.R.iget(16553)==0&false))) {{
                    // return condition when end of token found
                    __CLR4_1_2ckyckyl3lqxsoz.R.inc(16554);addToken(tokens, workArea.substring(0, trimStart));
                    __CLR4_1_2ckyckyl3lqxsoz.R.inc(16555);return pos + delimLen;
                }
                
                // check for quote, and thus back into quoting mode
                }__CLR4_1_2ckyckyl3lqxsoz.R.inc(16556);if ((((quoteLen > 0 && isQuote(chars, pos, len, quoteStart, quoteLen))&&(__CLR4_1_2ckyckyl3lqxsoz.R.iget(16557)!=0|true))||(__CLR4_1_2ckyckyl3lqxsoz.R.iget(16558)==0&false))) {{
                    __CLR4_1_2ckyckyl3lqxsoz.R.inc(16559);quoting = true;
                    __CLR4_1_2ckyckyl3lqxsoz.R.inc(16560);pos += quoteLen;
                    __CLR4_1_2ckyckyl3lqxsoz.R.inc(16561);continue;
                }
                
                // check for ignored (outside quotes), and ignore
                }__CLR4_1_2ckyckyl3lqxsoz.R.inc(16562);final int ignoredLen = getIgnoredMatcher().isMatch(chars, pos, start, len);
                __CLR4_1_2ckyckyl3lqxsoz.R.inc(16563);if ((((ignoredLen > 0)&&(__CLR4_1_2ckyckyl3lqxsoz.R.iget(16564)!=0|true))||(__CLR4_1_2ckyckyl3lqxsoz.R.iget(16565)==0&false))) {{
                    __CLR4_1_2ckyckyl3lqxsoz.R.inc(16566);pos += ignoredLen;
                    __CLR4_1_2ckyckyl3lqxsoz.R.inc(16567);continue;
                }
                
                // check for trimmed character
                // don't yet know if its at the end, so copy to workArea
                // use trimStart to keep track of trim at the end
                }__CLR4_1_2ckyckyl3lqxsoz.R.inc(16568);final int trimmedLen = getTrimmerMatcher().isMatch(chars, pos, start, len);
                __CLR4_1_2ckyckyl3lqxsoz.R.inc(16569);if ((((trimmedLen > 0)&&(__CLR4_1_2ckyckyl3lqxsoz.R.iget(16570)!=0|true))||(__CLR4_1_2ckyckyl3lqxsoz.R.iget(16571)==0&false))) {{
                    __CLR4_1_2ckyckyl3lqxsoz.R.inc(16572);workArea.append(chars, pos, trimmedLen);
                    __CLR4_1_2ckyckyl3lqxsoz.R.inc(16573);pos += trimmedLen;
                    __CLR4_1_2ckyckyl3lqxsoz.R.inc(16574);continue;
                }
                
                // copy regular character from outside quotes
                }__CLR4_1_2ckyckyl3lqxsoz.R.inc(16575);workArea.append(chars[pos++]);
                __CLR4_1_2ckyckyl3lqxsoz.R.inc(16576);trimStart = workArea.size();
            }
        }}
        
        // return condition when end of string found
        }__CLR4_1_2ckyckyl3lqxsoz.R.inc(16577);addToken(tokens, workArea.substring(0, trimStart));
        __CLR4_1_2ckyckyl3lqxsoz.R.inc(16578);return -1;
    }finally{__CLR4_1_2ckyckyl3lqxsoz.R.flushNeeded();}}

    /**
     * Checks if the characters at the index specified match the quote
     * already matched in readNextToken().
     *
     * @param chars  the character array being tokenized
     * @param pos  the position to check for a quote
     * @param len  the length of the character array being tokenized
     * @param quoteStart  the start position of the matched quote, 0 if no quoting
     * @param quoteLen  the length of the matched quote, 0 if no quoting
     * @return true if a quote is matched
     */
    private boolean isQuote(final char[] chars, final int pos, final int len, final int quoteStart, final int quoteLen) {try{__CLR4_1_2ckyckyl3lqxsoz.R.inc(16579);
        __CLR4_1_2ckyckyl3lqxsoz.R.inc(16580);for (int i = 0; (((i < quoteLen)&&(__CLR4_1_2ckyckyl3lqxsoz.R.iget(16581)!=0|true))||(__CLR4_1_2ckyckyl3lqxsoz.R.iget(16582)==0&false)); i++) {{
            __CLR4_1_2ckyckyl3lqxsoz.R.inc(16583);if ((((pos + i >= len || chars[pos + i] != chars[quoteStart + i])&&(__CLR4_1_2ckyckyl3lqxsoz.R.iget(16584)!=0|true))||(__CLR4_1_2ckyckyl3lqxsoz.R.iget(16585)==0&false))) {{
                __CLR4_1_2ckyckyl3lqxsoz.R.inc(16586);return false;
            }
        }}
        }__CLR4_1_2ckyckyl3lqxsoz.R.inc(16587);return true;
    }finally{__CLR4_1_2ckyckyl3lqxsoz.R.flushNeeded();}}

    // Delimiter
    //-----------------------------------------------------------------------
    /**
     * Gets the field delimiter matcher.
     *
     * @return the delimiter matcher in use
     */
    public StrMatcher getDelimiterMatcher() {try{__CLR4_1_2ckyckyl3lqxsoz.R.inc(16588);
        __CLR4_1_2ckyckyl3lqxsoz.R.inc(16589);return this.delimMatcher;
    }finally{__CLR4_1_2ckyckyl3lqxsoz.R.flushNeeded();}}

    /**
     * Sets the field delimiter matcher.
     * <p>
     * The delimitier is used to separate one token from another.
     *
     * @param delim  the delimiter matcher to use
     * @return this, to enable chaining
     */
    public StrTokenizer setDelimiterMatcher(final StrMatcher delim) {try{__CLR4_1_2ckyckyl3lqxsoz.R.inc(16590);
        __CLR4_1_2ckyckyl3lqxsoz.R.inc(16591);if ((((delim == null)&&(__CLR4_1_2ckyckyl3lqxsoz.R.iget(16592)!=0|true))||(__CLR4_1_2ckyckyl3lqxsoz.R.iget(16593)==0&false))) {{
            __CLR4_1_2ckyckyl3lqxsoz.R.inc(16594);this.delimMatcher = StrMatcher.noneMatcher();
        } }else {{
            __CLR4_1_2ckyckyl3lqxsoz.R.inc(16595);this.delimMatcher = delim;
        }
        }__CLR4_1_2ckyckyl3lqxsoz.R.inc(16596);return this;
    }finally{__CLR4_1_2ckyckyl3lqxsoz.R.flushNeeded();}}

    /**
     * Sets the field delimiter character.
     *
     * @param delim  the delimiter character to use
     * @return this, to enable chaining
     */
    public StrTokenizer setDelimiterChar(final char delim) {try{__CLR4_1_2ckyckyl3lqxsoz.R.inc(16597);
        __CLR4_1_2ckyckyl3lqxsoz.R.inc(16598);return setDelimiterMatcher(StrMatcher.charMatcher(delim));
    }finally{__CLR4_1_2ckyckyl3lqxsoz.R.flushNeeded();}}

    /**
     * Sets the field delimiter string.
     *
     * @param delim  the delimiter string to use
     * @return this, to enable chaining
     */
    public StrTokenizer setDelimiterString(final String delim) {try{__CLR4_1_2ckyckyl3lqxsoz.R.inc(16599);
        __CLR4_1_2ckyckyl3lqxsoz.R.inc(16600);return setDelimiterMatcher(StrMatcher.stringMatcher(delim));
    }finally{__CLR4_1_2ckyckyl3lqxsoz.R.flushNeeded();}}

    // Quote
    //-----------------------------------------------------------------------
    /**
     * Gets the quote matcher currently in use.
     * <p>
     * The quote character is used to wrap data between the tokens.
     * This enables delimiters to be entered as data.
     * The default value is '"' (double quote).
     *
     * @return the quote matcher in use
     */
    public StrMatcher getQuoteMatcher() {try{__CLR4_1_2ckyckyl3lqxsoz.R.inc(16601);
        __CLR4_1_2ckyckyl3lqxsoz.R.inc(16602);return quoteMatcher;
    }finally{__CLR4_1_2ckyckyl3lqxsoz.R.flushNeeded();}}

    /**
     * Set the quote matcher to use.
     * <p>
     * The quote character is used to wrap data between the tokens.
     * This enables delimiters to be entered as data.
     *
     * @param quote  the quote matcher to use, null ignored
     * @return this, to enable chaining
     */
    public StrTokenizer setQuoteMatcher(final StrMatcher quote) {try{__CLR4_1_2ckyckyl3lqxsoz.R.inc(16603);
        __CLR4_1_2ckyckyl3lqxsoz.R.inc(16604);if ((((quote != null)&&(__CLR4_1_2ckyckyl3lqxsoz.R.iget(16605)!=0|true))||(__CLR4_1_2ckyckyl3lqxsoz.R.iget(16606)==0&false))) {{
            __CLR4_1_2ckyckyl3lqxsoz.R.inc(16607);this.quoteMatcher = quote;
        }
        }__CLR4_1_2ckyckyl3lqxsoz.R.inc(16608);return this;
    }finally{__CLR4_1_2ckyckyl3lqxsoz.R.flushNeeded();}}

    /**
     * Sets the quote character to use.
     * <p>
     * The quote character is used to wrap data between the tokens.
     * This enables delimiters to be entered as data.
     *
     * @param quote  the quote character to use
     * @return this, to enable chaining
     */
    public StrTokenizer setQuoteChar(final char quote) {try{__CLR4_1_2ckyckyl3lqxsoz.R.inc(16609);
        __CLR4_1_2ckyckyl3lqxsoz.R.inc(16610);return setQuoteMatcher(StrMatcher.charMatcher(quote));
    }finally{__CLR4_1_2ckyckyl3lqxsoz.R.flushNeeded();}}

    // Ignored
    //-----------------------------------------------------------------------
    /**
     * Gets the ignored character matcher.
     * <p>
     * These characters are ignored when parsing the String, unless they are
     * within a quoted region.
     * The default value is not to ignore anything.
     *
     * @return the ignored matcher in use
     */
    public StrMatcher getIgnoredMatcher() {try{__CLR4_1_2ckyckyl3lqxsoz.R.inc(16611);
        __CLR4_1_2ckyckyl3lqxsoz.R.inc(16612);return ignoredMatcher;
    }finally{__CLR4_1_2ckyckyl3lqxsoz.R.flushNeeded();}}

    /**
     * Set the matcher for characters to ignore.
     * <p>
     * These characters are ignored when parsing the String, unless they are
     * within a quoted region.
     *
     * @param ignored  the ignored matcher to use, null ignored
     * @return this, to enable chaining
     */
    public StrTokenizer setIgnoredMatcher(final StrMatcher ignored) {try{__CLR4_1_2ckyckyl3lqxsoz.R.inc(16613);
        __CLR4_1_2ckyckyl3lqxsoz.R.inc(16614);if ((((ignored != null)&&(__CLR4_1_2ckyckyl3lqxsoz.R.iget(16615)!=0|true))||(__CLR4_1_2ckyckyl3lqxsoz.R.iget(16616)==0&false))) {{
            __CLR4_1_2ckyckyl3lqxsoz.R.inc(16617);this.ignoredMatcher = ignored;
        }
        }__CLR4_1_2ckyckyl3lqxsoz.R.inc(16618);return this;
    }finally{__CLR4_1_2ckyckyl3lqxsoz.R.flushNeeded();}}

    /**
     * Set the character to ignore.
     * <p>
     * This character is ignored when parsing the String, unless it is
     * within a quoted region.
     *
     * @param ignored  the ignored character to use
     * @return this, to enable chaining
     */
    public StrTokenizer setIgnoredChar(final char ignored) {try{__CLR4_1_2ckyckyl3lqxsoz.R.inc(16619);
        __CLR4_1_2ckyckyl3lqxsoz.R.inc(16620);return setIgnoredMatcher(StrMatcher.charMatcher(ignored));
    }finally{__CLR4_1_2ckyckyl3lqxsoz.R.flushNeeded();}}

    // Trimmer
    //-----------------------------------------------------------------------
    /**
     * Gets the trimmer character matcher.
     * <p>
     * These characters are trimmed off on each side of the delimiter
     * until the token or quote is found.
     * The default value is not to trim anything.
     *
     * @return the trimmer matcher in use
     */
    public StrMatcher getTrimmerMatcher() {try{__CLR4_1_2ckyckyl3lqxsoz.R.inc(16621);
        __CLR4_1_2ckyckyl3lqxsoz.R.inc(16622);return trimmerMatcher;
    }finally{__CLR4_1_2ckyckyl3lqxsoz.R.flushNeeded();}}

    /**
     * Sets the matcher for characters to trim.
     * <p>
     * These characters are trimmed off on each side of the delimiter
     * until the token or quote is found.
     *
     * @param trimmer  the trimmer matcher to use, null ignored
     * @return this, to enable chaining
     */
    public StrTokenizer setTrimmerMatcher(final StrMatcher trimmer) {try{__CLR4_1_2ckyckyl3lqxsoz.R.inc(16623);
        __CLR4_1_2ckyckyl3lqxsoz.R.inc(16624);if ((((trimmer != null)&&(__CLR4_1_2ckyckyl3lqxsoz.R.iget(16625)!=0|true))||(__CLR4_1_2ckyckyl3lqxsoz.R.iget(16626)==0&false))) {{
            __CLR4_1_2ckyckyl3lqxsoz.R.inc(16627);this.trimmerMatcher = trimmer;
        }
        }__CLR4_1_2ckyckyl3lqxsoz.R.inc(16628);return this;
    }finally{__CLR4_1_2ckyckyl3lqxsoz.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets whether the tokenizer currently returns empty tokens as null.
     * The default for this property is false.
     *
     * @return true if empty tokens are returned as null
     */
    public boolean isEmptyTokenAsNull() {try{__CLR4_1_2ckyckyl3lqxsoz.R.inc(16629);
        __CLR4_1_2ckyckyl3lqxsoz.R.inc(16630);return this.emptyAsNull;
    }finally{__CLR4_1_2ckyckyl3lqxsoz.R.flushNeeded();}}

    /**
     * Sets whether the tokenizer should return empty tokens as null.
     * The default for this property is false.
     *
     * @param emptyAsNull  whether empty tokens are returned as null
     * @return this, to enable chaining
     */
    public StrTokenizer setEmptyTokenAsNull(final boolean emptyAsNull) {try{__CLR4_1_2ckyckyl3lqxsoz.R.inc(16631);
        __CLR4_1_2ckyckyl3lqxsoz.R.inc(16632);this.emptyAsNull = emptyAsNull;
        __CLR4_1_2ckyckyl3lqxsoz.R.inc(16633);return this;
    }finally{__CLR4_1_2ckyckyl3lqxsoz.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets whether the tokenizer currently ignores empty tokens.
     * The default for this property is true.
     *
     * @return true if empty tokens are not returned
     */
    public boolean isIgnoreEmptyTokens() {try{__CLR4_1_2ckyckyl3lqxsoz.R.inc(16634);
        __CLR4_1_2ckyckyl3lqxsoz.R.inc(16635);return ignoreEmptyTokens;
    }finally{__CLR4_1_2ckyckyl3lqxsoz.R.flushNeeded();}}

    /**
     * Sets whether the tokenizer should ignore and not return empty tokens.
     * The default for this property is true.
     *
     * @param ignoreEmptyTokens  whether empty tokens are not returned
     * @return this, to enable chaining
     */
    public StrTokenizer setIgnoreEmptyTokens(final boolean ignoreEmptyTokens) {try{__CLR4_1_2ckyckyl3lqxsoz.R.inc(16636);
        __CLR4_1_2ckyckyl3lqxsoz.R.inc(16637);this.ignoreEmptyTokens = ignoreEmptyTokens;
        __CLR4_1_2ckyckyl3lqxsoz.R.inc(16638);return this;
    }finally{__CLR4_1_2ckyckyl3lqxsoz.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets the String content that the tokenizer is parsing.
     *
     * @return the string content being parsed
     */
    public String getContent() {try{__CLR4_1_2ckyckyl3lqxsoz.R.inc(16639);
        __CLR4_1_2ckyckyl3lqxsoz.R.inc(16640);if ((((chars == null)&&(__CLR4_1_2ckyckyl3lqxsoz.R.iget(16641)!=0|true))||(__CLR4_1_2ckyckyl3lqxsoz.R.iget(16642)==0&false))) {{
            __CLR4_1_2ckyckyl3lqxsoz.R.inc(16643);return null;
        }
        }__CLR4_1_2ckyckyl3lqxsoz.R.inc(16644);return new String(chars);
    }finally{__CLR4_1_2ckyckyl3lqxsoz.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Creates a new instance of this Tokenizer. The new instance is reset so
     * that it will be at the start of the token list.
     * If a {@link CloneNotSupportedException} is caught, return <code>null</code>.
     * 
     * @return a new instance of this Tokenizer which has been reset.
     */
    @Override
    public Object clone() {try{__CLR4_1_2ckyckyl3lqxsoz.R.inc(16645);
        __CLR4_1_2ckyckyl3lqxsoz.R.inc(16646);try {
            __CLR4_1_2ckyckyl3lqxsoz.R.inc(16647);return cloneReset();
        } catch (final CloneNotSupportedException ex) {
            __CLR4_1_2ckyckyl3lqxsoz.R.inc(16648);return null;
        }
    }finally{__CLR4_1_2ckyckyl3lqxsoz.R.flushNeeded();}}

    /**
     * Creates a new instance of this Tokenizer. The new instance is reset so that
     * it will be at the start of the token list.
     * 
     * @return a new instance of this Tokenizer which has been reset.
     * @throws CloneNotSupportedException if there is a problem cloning
     */
    Object cloneReset() throws CloneNotSupportedException {try{__CLR4_1_2ckyckyl3lqxsoz.R.inc(16649);
        // this method exists to enable 100% test coverage
        __CLR4_1_2ckyckyl3lqxsoz.R.inc(16650);final StrTokenizer cloned = (StrTokenizer) super.clone();
        __CLR4_1_2ckyckyl3lqxsoz.R.inc(16651);if ((((cloned.chars != null)&&(__CLR4_1_2ckyckyl3lqxsoz.R.iget(16652)!=0|true))||(__CLR4_1_2ckyckyl3lqxsoz.R.iget(16653)==0&false))) {{
            __CLR4_1_2ckyckyl3lqxsoz.R.inc(16654);cloned.chars = cloned.chars.clone();
        }
        }__CLR4_1_2ckyckyl3lqxsoz.R.inc(16655);cloned.reset();
        __CLR4_1_2ckyckyl3lqxsoz.R.inc(16656);return cloned;
    }finally{__CLR4_1_2ckyckyl3lqxsoz.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets the String content that the tokenizer is parsing.
     *
     * @return the string content being parsed
     */
    @Override
    public String toString() {try{__CLR4_1_2ckyckyl3lqxsoz.R.inc(16657);
        __CLR4_1_2ckyckyl3lqxsoz.R.inc(16658);if ((((tokens == null)&&(__CLR4_1_2ckyckyl3lqxsoz.R.iget(16659)!=0|true))||(__CLR4_1_2ckyckyl3lqxsoz.R.iget(16660)==0&false))) {{
            __CLR4_1_2ckyckyl3lqxsoz.R.inc(16661);return "StrTokenizer[not tokenized yet]";
        }
        }__CLR4_1_2ckyckyl3lqxsoz.R.inc(16662);return "StrTokenizer" + getTokenList();
    }finally{__CLR4_1_2ckyckyl3lqxsoz.R.flushNeeded();}}

}
