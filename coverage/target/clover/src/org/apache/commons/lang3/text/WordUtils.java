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

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.SystemUtils;

/**
 * <p>Operations on Strings that contain words.</p>
 * 
 * <p>This class tries to handle <code>null</code> input gracefully.
 * An exception will not be thrown for a <code>null</code> input.
 * Each method documents its behaviour in more detail.</p>
 * 
 * @since 2.0
 * @version $Id$
 */
public class WordUtils {public static class __CLR4_1_2cuvcuvl3lqxspe{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492827633L,8589935092L,16852,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * <p><code>WordUtils</code> instances should NOT be constructed in
     * standard programming. Instead, the class should be used as
     * <code>WordUtils.wrap("foo bar", 20);</code>.</p>
     *
     * <p>This constructor is public to permit tools that require a JavaBean
     * instance to operate.</p>
     */
    public WordUtils() {
      super();__CLR4_1_2cuvcuvl3lqxspe.R.inc(16664);try{__CLR4_1_2cuvcuvl3lqxspe.R.inc(16663);
    }finally{__CLR4_1_2cuvcuvl3lqxspe.R.flushNeeded();}}

    // Wrapping
    //--------------------------------------------------------------------------
    /**
     * <p>Wraps a single line of text, identifying words by <code>' '</code>.</p>
     * 
     * <p>New lines will be separated by the system property line separator.
     * Very long words, such as URLs will <i>not</i> be wrapped.</p>
     * 
     * <p>Leading spaces on a new line are stripped.
     * Trailing spaces are not stripped.</p>
     *
     * <pre>
     * WordUtils.wrap(null, *) = null
     * WordUtils.wrap("", *) = ""
     * </pre>
     *
     * @param str  the String to be word wrapped, may be null
     * @param wrapLength  the column to wrap the words at, less than 1 is treated as 1
     * @return a line with newlines inserted, <code>null</code> if null input
     */
    public static String wrap(final String str, final int wrapLength) {try{__CLR4_1_2cuvcuvl3lqxspe.R.inc(16665);
        __CLR4_1_2cuvcuvl3lqxspe.R.inc(16666);return wrap(str, wrapLength, null, false);
    }finally{__CLR4_1_2cuvcuvl3lqxspe.R.flushNeeded();}}
    
    /**
     * <p>Wraps a single line of text, identifying words by <code>' '</code>.</p>
     * 
     * <p>Leading spaces on a new line are stripped.
     * Trailing spaces are not stripped.</p>
     * 
     * <pre>
     * WordUtils.wrap(null, *, *, *) = null
     * WordUtils.wrap("", *, *, *) = ""
     * </pre>
     *
     * @param str  the String to be word wrapped, may be null
     * @param wrapLength  the column to wrap the words at, less than 1 is treated as 1
     * @param newLineStr  the string to insert for a new line, 
     *  <code>null</code> uses the system property line separator
     * @param wrapLongWords  true if long words (such as URLs) should be wrapped
     * @return a line with newlines inserted, <code>null</code> if null input
     */
    public static String wrap(final String str, int wrapLength, String newLineStr, final boolean wrapLongWords) {try{__CLR4_1_2cuvcuvl3lqxspe.R.inc(16667);
        __CLR4_1_2cuvcuvl3lqxspe.R.inc(16668);if ((((str == null)&&(__CLR4_1_2cuvcuvl3lqxspe.R.iget(16669)!=0|true))||(__CLR4_1_2cuvcuvl3lqxspe.R.iget(16670)==0&false))) {{
            __CLR4_1_2cuvcuvl3lqxspe.R.inc(16671);return null;
        }
        }__CLR4_1_2cuvcuvl3lqxspe.R.inc(16672);if ((((newLineStr == null)&&(__CLR4_1_2cuvcuvl3lqxspe.R.iget(16673)!=0|true))||(__CLR4_1_2cuvcuvl3lqxspe.R.iget(16674)==0&false))) {{
            __CLR4_1_2cuvcuvl3lqxspe.R.inc(16675);newLineStr = SystemUtils.LINE_SEPARATOR;
        }
        }__CLR4_1_2cuvcuvl3lqxspe.R.inc(16676);if ((((wrapLength < 1)&&(__CLR4_1_2cuvcuvl3lqxspe.R.iget(16677)!=0|true))||(__CLR4_1_2cuvcuvl3lqxspe.R.iget(16678)==0&false))) {{
            __CLR4_1_2cuvcuvl3lqxspe.R.inc(16679);wrapLength = 1;
        }
        }__CLR4_1_2cuvcuvl3lqxspe.R.inc(16680);final int inputLineLength = str.length();
        __CLR4_1_2cuvcuvl3lqxspe.R.inc(16681);int offset = 0;
        __CLR4_1_2cuvcuvl3lqxspe.R.inc(16682);final StringBuilder wrappedLine = new StringBuilder(inputLineLength + 32);
        
        __CLR4_1_2cuvcuvl3lqxspe.R.inc(16683);while ((((inputLineLength - offset > wrapLength)&&(__CLR4_1_2cuvcuvl3lqxspe.R.iget(16684)!=0|true))||(__CLR4_1_2cuvcuvl3lqxspe.R.iget(16685)==0&false))) {{
            __CLR4_1_2cuvcuvl3lqxspe.R.inc(16686);if ((((str.charAt(offset) == ' ')&&(__CLR4_1_2cuvcuvl3lqxspe.R.iget(16687)!=0|true))||(__CLR4_1_2cuvcuvl3lqxspe.R.iget(16688)==0&false))) {{
                __CLR4_1_2cuvcuvl3lqxspe.R.inc(16689);offset++;
                __CLR4_1_2cuvcuvl3lqxspe.R.inc(16690);continue;
            }
            }__CLR4_1_2cuvcuvl3lqxspe.R.inc(16691);int spaceToWrapAt = str.lastIndexOf(' ', wrapLength + offset);

            __CLR4_1_2cuvcuvl3lqxspe.R.inc(16692);if ((((spaceToWrapAt >= offset)&&(__CLR4_1_2cuvcuvl3lqxspe.R.iget(16693)!=0|true))||(__CLR4_1_2cuvcuvl3lqxspe.R.iget(16694)==0&false))) {{
                // normal case
                __CLR4_1_2cuvcuvl3lqxspe.R.inc(16695);wrappedLine.append(str.substring(offset, spaceToWrapAt));
                __CLR4_1_2cuvcuvl3lqxspe.R.inc(16696);wrappedLine.append(newLineStr);
                __CLR4_1_2cuvcuvl3lqxspe.R.inc(16697);offset = spaceToWrapAt + 1;
                
            } }else {{
                // really long word or URL
                __CLR4_1_2cuvcuvl3lqxspe.R.inc(16698);if ((((wrapLongWords)&&(__CLR4_1_2cuvcuvl3lqxspe.R.iget(16699)!=0|true))||(__CLR4_1_2cuvcuvl3lqxspe.R.iget(16700)==0&false))) {{
                    // wrap really long word one line at a time
                    __CLR4_1_2cuvcuvl3lqxspe.R.inc(16701);wrappedLine.append(str.substring(offset, wrapLength + offset));
                    __CLR4_1_2cuvcuvl3lqxspe.R.inc(16702);wrappedLine.append(newLineStr);
                    __CLR4_1_2cuvcuvl3lqxspe.R.inc(16703);offset += wrapLength;
                } }else {{
                    // do not wrap really long word, just extend beyond limit
                    __CLR4_1_2cuvcuvl3lqxspe.R.inc(16704);spaceToWrapAt = str.indexOf(' ', wrapLength + offset);
                    __CLR4_1_2cuvcuvl3lqxspe.R.inc(16705);if ((((spaceToWrapAt >= 0)&&(__CLR4_1_2cuvcuvl3lqxspe.R.iget(16706)!=0|true))||(__CLR4_1_2cuvcuvl3lqxspe.R.iget(16707)==0&false))) {{
                        __CLR4_1_2cuvcuvl3lqxspe.R.inc(16708);wrappedLine.append(str.substring(offset, spaceToWrapAt));
                        __CLR4_1_2cuvcuvl3lqxspe.R.inc(16709);wrappedLine.append(newLineStr);
                        __CLR4_1_2cuvcuvl3lqxspe.R.inc(16710);offset = spaceToWrapAt + 1;
                    } }else {{
                        __CLR4_1_2cuvcuvl3lqxspe.R.inc(16711);wrappedLine.append(str.substring(offset));
                        __CLR4_1_2cuvcuvl3lqxspe.R.inc(16712);offset = inputLineLength;
                    }
                }}
            }}
        }}

        // Whatever is left in line is short enough to just pass through
        }__CLR4_1_2cuvcuvl3lqxspe.R.inc(16713);wrappedLine.append(str.substring(offset));

        __CLR4_1_2cuvcuvl3lqxspe.R.inc(16714);return wrappedLine.toString();
    }finally{__CLR4_1_2cuvcuvl3lqxspe.R.flushNeeded();}}

    // Capitalizing
    //-----------------------------------------------------------------------
    /**
     * <p>Capitalizes all the whitespace separated words in a String.
     * Only the first letter of each word is changed. To convert the 
     * rest of each word to lowercase at the same time, 
     * use {@link #capitalizeFully(String)}.</p>
     *
     * <p>Whitespace is defined by {@link Character#isWhitespace(char)}.
     * A <code>null</code> input String returns <code>null</code>.
     * Capitalization uses the Unicode title case, normally equivalent to
     * upper case.</p>
     *
     * <pre>
     * WordUtils.capitalize(null)        = null
     * WordUtils.capitalize("")          = ""
     * WordUtils.capitalize("i am FINE") = "I Am FINE"
     * </pre>
     * 
     * @param str  the String to capitalize, may be null
     * @return capitalized String, <code>null</code> if null String input
     * @see #uncapitalize(String)
     * @see #capitalizeFully(String)
     */
    public static String capitalize(final String str) {try{__CLR4_1_2cuvcuvl3lqxspe.R.inc(16715);
        __CLR4_1_2cuvcuvl3lqxspe.R.inc(16716);return capitalize(str, null);
    }finally{__CLR4_1_2cuvcuvl3lqxspe.R.flushNeeded();}}

    /**
     * <p>Capitalizes all the delimiter separated words in a String.
     * Only the first letter of each word is changed. To convert the 
     * rest of each word to lowercase at the same time, 
     * use {@link #capitalizeFully(String, char[])}.</p>
     *
     * <p>The delimiters represent a set of characters understood to separate words.
     * The first string character and the first non-delimiter character after a
     * delimiter will be capitalized. </p>
     *
     * <p>A <code>null</code> input String returns <code>null</code>.
     * Capitalization uses the Unicode title case, normally equivalent to
     * upper case.</p>
     *
     * <pre>
     * WordUtils.capitalize(null, *)            = null
     * WordUtils.capitalize("", *)              = ""
     * WordUtils.capitalize(*, new char[0])     = *
     * WordUtils.capitalize("i am fine", null)  = "I Am Fine"
     * WordUtils.capitalize("i aM.fine", {'.'}) = "I aM.Fine"
     * </pre>
     * 
     * @param str  the String to capitalize, may be null
     * @param delimiters  set of characters to determine capitalization, null means whitespace
     * @return capitalized String, <code>null</code> if null String input
     * @see #uncapitalize(String)
     * @see #capitalizeFully(String)
     * @since 2.1
     */
    public static String capitalize(final String str, final char... delimiters) {try{__CLR4_1_2cuvcuvl3lqxspe.R.inc(16717);
        __CLR4_1_2cuvcuvl3lqxspe.R.inc(16718);final int delimLen = (((delimiters == null )&&(__CLR4_1_2cuvcuvl3lqxspe.R.iget(16719)!=0|true))||(__CLR4_1_2cuvcuvl3lqxspe.R.iget(16720)==0&false))? -1 : delimiters.length;
        __CLR4_1_2cuvcuvl3lqxspe.R.inc(16721);if ((((StringUtils.isEmpty(str) || delimLen == 0)&&(__CLR4_1_2cuvcuvl3lqxspe.R.iget(16722)!=0|true))||(__CLR4_1_2cuvcuvl3lqxspe.R.iget(16723)==0&false))) {{
            __CLR4_1_2cuvcuvl3lqxspe.R.inc(16724);return str;
        }
        }__CLR4_1_2cuvcuvl3lqxspe.R.inc(16725);final char[] buffer = str.toCharArray();
        __CLR4_1_2cuvcuvl3lqxspe.R.inc(16726);boolean capitalizeNext = true;
        __CLR4_1_2cuvcuvl3lqxspe.R.inc(16727);for (int i = 0; (((i < buffer.length)&&(__CLR4_1_2cuvcuvl3lqxspe.R.iget(16728)!=0|true))||(__CLR4_1_2cuvcuvl3lqxspe.R.iget(16729)==0&false)); i++) {{
            __CLR4_1_2cuvcuvl3lqxspe.R.inc(16730);final char ch = buffer[i];
            __CLR4_1_2cuvcuvl3lqxspe.R.inc(16731);if ((((isDelimiter(ch, delimiters))&&(__CLR4_1_2cuvcuvl3lqxspe.R.iget(16732)!=0|true))||(__CLR4_1_2cuvcuvl3lqxspe.R.iget(16733)==0&false))) {{
                __CLR4_1_2cuvcuvl3lqxspe.R.inc(16734);capitalizeNext = true;
            } }else {__CLR4_1_2cuvcuvl3lqxspe.R.inc(16735);if ((((capitalizeNext)&&(__CLR4_1_2cuvcuvl3lqxspe.R.iget(16736)!=0|true))||(__CLR4_1_2cuvcuvl3lqxspe.R.iget(16737)==0&false))) {{
                __CLR4_1_2cuvcuvl3lqxspe.R.inc(16738);buffer[i] = Character.toTitleCase(ch);
                __CLR4_1_2cuvcuvl3lqxspe.R.inc(16739);capitalizeNext = false;
            }
        }}}
        }__CLR4_1_2cuvcuvl3lqxspe.R.inc(16740);return new String(buffer);
    }finally{__CLR4_1_2cuvcuvl3lqxspe.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * <p>Converts all the whitespace separated words in a String into capitalized words, 
     * that is each word is made up of a titlecase character and then a series of 
     * lowercase characters.  </p>
     *
     * <p>Whitespace is defined by {@link Character#isWhitespace(char)}.
     * A <code>null</code> input String returns <code>null</code>.
     * Capitalization uses the Unicode title case, normally equivalent to
     * upper case.</p>
     *
     * <pre>
     * WordUtils.capitalizeFully(null)        = null
     * WordUtils.capitalizeFully("")          = ""
     * WordUtils.capitalizeFully("i am FINE") = "I Am Fine"
     * </pre>
     * 
     * @param str  the String to capitalize, may be null
     * @return capitalized String, <code>null</code> if null String input
     */
    public static String capitalizeFully(final String str) {try{__CLR4_1_2cuvcuvl3lqxspe.R.inc(16741);
        __CLR4_1_2cuvcuvl3lqxspe.R.inc(16742);return capitalizeFully(str, null);
    }finally{__CLR4_1_2cuvcuvl3lqxspe.R.flushNeeded();}}

    /**
     * <p>Converts all the delimiter separated words in a String into capitalized words, 
     * that is each word is made up of a titlecase character and then a series of 
     * lowercase characters. </p>
     *
     * <p>The delimiters represent a set of characters understood to separate words.
     * The first string character and the first non-delimiter character after a
     * delimiter will be capitalized. </p>
     *
     * <p>A <code>null</code> input String returns <code>null</code>.
     * Capitalization uses the Unicode title case, normally equivalent to
     * upper case.</p>
     *
     * <pre>
     * WordUtils.capitalizeFully(null, *)            = null
     * WordUtils.capitalizeFully("", *)              = ""
     * WordUtils.capitalizeFully(*, null)            = *
     * WordUtils.capitalizeFully(*, new char[0])     = *
     * WordUtils.capitalizeFully("i aM.fine", {'.'}) = "I am.Fine"
     * </pre>
     * 
     * @param str  the String to capitalize, may be null
     * @param delimiters  set of characters to determine capitalization, null means whitespace
     * @return capitalized String, <code>null</code> if null String input
     * @since 2.1
     */
    public static String capitalizeFully(String str, final char... delimiters) {try{__CLR4_1_2cuvcuvl3lqxspe.R.inc(16743);
        __CLR4_1_2cuvcuvl3lqxspe.R.inc(16744);final int delimLen = (((delimiters == null )&&(__CLR4_1_2cuvcuvl3lqxspe.R.iget(16745)!=0|true))||(__CLR4_1_2cuvcuvl3lqxspe.R.iget(16746)==0&false))? -1 : delimiters.length;
        __CLR4_1_2cuvcuvl3lqxspe.R.inc(16747);if ((((StringUtils.isEmpty(str) || delimLen == 0)&&(__CLR4_1_2cuvcuvl3lqxspe.R.iget(16748)!=0|true))||(__CLR4_1_2cuvcuvl3lqxspe.R.iget(16749)==0&false))) {{
            __CLR4_1_2cuvcuvl3lqxspe.R.inc(16750);return str;
        }
        }__CLR4_1_2cuvcuvl3lqxspe.R.inc(16751);str = str.toLowerCase();
        __CLR4_1_2cuvcuvl3lqxspe.R.inc(16752);return capitalize(str, delimiters);
    }finally{__CLR4_1_2cuvcuvl3lqxspe.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * <p>Uncapitalizes all the whitespace separated words in a String.
     * Only the first letter of each word is changed.</p>
     *
     * <p>Whitespace is defined by {@link Character#isWhitespace(char)}.
     * A <code>null</code> input String returns <code>null</code>.</p>
     *
     * <pre>
     * WordUtils.uncapitalize(null)        = null
     * WordUtils.uncapitalize("")          = ""
     * WordUtils.uncapitalize("I Am FINE") = "i am fINE"
     * </pre>
     * 
     * @param str  the String to uncapitalize, may be null
     * @return uncapitalized String, <code>null</code> if null String input
     * @see #capitalize(String)
     */
    public static String uncapitalize(final String str) {try{__CLR4_1_2cuvcuvl3lqxspe.R.inc(16753);
        __CLR4_1_2cuvcuvl3lqxspe.R.inc(16754);return uncapitalize(str, null);
    }finally{__CLR4_1_2cuvcuvl3lqxspe.R.flushNeeded();}}

    /**
     * <p>Uncapitalizes all the whitespace separated words in a String.
     * Only the first letter of each word is changed.</p>
     *
     * <p>The delimiters represent a set of characters understood to separate words.
     * The first string character and the first non-delimiter character after a
     * delimiter will be uncapitalized. </p>
     *
     * <p>Whitespace is defined by {@link Character#isWhitespace(char)}.
     * A <code>null</code> input String returns <code>null</code>.</p>
     *
     * <pre>
     * WordUtils.uncapitalize(null, *)            = null
     * WordUtils.uncapitalize("", *)              = ""
     * WordUtils.uncapitalize(*, null)            = *
     * WordUtils.uncapitalize(*, new char[0])     = *
     * WordUtils.uncapitalize("I AM.FINE", {'.'}) = "i AM.fINE"
     * </pre>
     * 
     * @param str  the String to uncapitalize, may be null
     * @param delimiters  set of characters to determine uncapitalization, null means whitespace
     * @return uncapitalized String, <code>null</code> if null String input
     * @see #capitalize(String)
     * @since 2.1
     */
    public static String uncapitalize(final String str, final char... delimiters) {try{__CLR4_1_2cuvcuvl3lqxspe.R.inc(16755);
        __CLR4_1_2cuvcuvl3lqxspe.R.inc(16756);final int delimLen = (((delimiters == null )&&(__CLR4_1_2cuvcuvl3lqxspe.R.iget(16757)!=0|true))||(__CLR4_1_2cuvcuvl3lqxspe.R.iget(16758)==0&false))? -1 : delimiters.length;
        __CLR4_1_2cuvcuvl3lqxspe.R.inc(16759);if ((((StringUtils.isEmpty(str) || delimLen == 0)&&(__CLR4_1_2cuvcuvl3lqxspe.R.iget(16760)!=0|true))||(__CLR4_1_2cuvcuvl3lqxspe.R.iget(16761)==0&false))) {{
            __CLR4_1_2cuvcuvl3lqxspe.R.inc(16762);return str;
        }
        }__CLR4_1_2cuvcuvl3lqxspe.R.inc(16763);final char[] buffer = str.toCharArray();
        __CLR4_1_2cuvcuvl3lqxspe.R.inc(16764);boolean uncapitalizeNext = true;
        __CLR4_1_2cuvcuvl3lqxspe.R.inc(16765);for (int i = 0; (((i < buffer.length)&&(__CLR4_1_2cuvcuvl3lqxspe.R.iget(16766)!=0|true))||(__CLR4_1_2cuvcuvl3lqxspe.R.iget(16767)==0&false)); i++) {{
            __CLR4_1_2cuvcuvl3lqxspe.R.inc(16768);final char ch = buffer[i];
            __CLR4_1_2cuvcuvl3lqxspe.R.inc(16769);if ((((isDelimiter(ch, delimiters))&&(__CLR4_1_2cuvcuvl3lqxspe.R.iget(16770)!=0|true))||(__CLR4_1_2cuvcuvl3lqxspe.R.iget(16771)==0&false))) {{
                __CLR4_1_2cuvcuvl3lqxspe.R.inc(16772);uncapitalizeNext = true;
            } }else {__CLR4_1_2cuvcuvl3lqxspe.R.inc(16773);if ((((uncapitalizeNext)&&(__CLR4_1_2cuvcuvl3lqxspe.R.iget(16774)!=0|true))||(__CLR4_1_2cuvcuvl3lqxspe.R.iget(16775)==0&false))) {{
                __CLR4_1_2cuvcuvl3lqxspe.R.inc(16776);buffer[i] = Character.toLowerCase(ch);
                __CLR4_1_2cuvcuvl3lqxspe.R.inc(16777);uncapitalizeNext = false;
            }
        }}}
        }__CLR4_1_2cuvcuvl3lqxspe.R.inc(16778);return new String(buffer);
    }finally{__CLR4_1_2cuvcuvl3lqxspe.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * <p>Swaps the case of a String using a word based algorithm.</p>
     * 
     * <ul>
     *  <li>Upper case character converts to Lower case</li>
     *  <li>Title case character converts to Lower case</li>
     *  <li>Lower case character after Whitespace or at start converts to Title case</li>
     *  <li>Other Lower case character converts to Upper case</li>
     * </ul>
     * 
     * <p>Whitespace is defined by {@link Character#isWhitespace(char)}.
     * A <code>null</code> input String returns <code>null</code>.</p>
     * 
     * <pre>
     * StringUtils.swapCase(null)                 = null
     * StringUtils.swapCase("")                   = ""
     * StringUtils.swapCase("The dog has a BONE") = "tHE DOG HAS A bone"
     * </pre>
     * 
     * @param str  the String to swap case, may be null
     * @return the changed String, <code>null</code> if null String input
     */
    public static String swapCase(final String str) {try{__CLR4_1_2cuvcuvl3lqxspe.R.inc(16779);
        __CLR4_1_2cuvcuvl3lqxspe.R.inc(16780);if ((((StringUtils.isEmpty(str))&&(__CLR4_1_2cuvcuvl3lqxspe.R.iget(16781)!=0|true))||(__CLR4_1_2cuvcuvl3lqxspe.R.iget(16782)==0&false))) {{
            __CLR4_1_2cuvcuvl3lqxspe.R.inc(16783);return str;
        }
        }__CLR4_1_2cuvcuvl3lqxspe.R.inc(16784);final char[] buffer = str.toCharArray();

        __CLR4_1_2cuvcuvl3lqxspe.R.inc(16785);boolean whitespace = true;

        __CLR4_1_2cuvcuvl3lqxspe.R.inc(16786);for (int i = 0; (((i < buffer.length)&&(__CLR4_1_2cuvcuvl3lqxspe.R.iget(16787)!=0|true))||(__CLR4_1_2cuvcuvl3lqxspe.R.iget(16788)==0&false)); i++) {{
            __CLR4_1_2cuvcuvl3lqxspe.R.inc(16789);final char ch = buffer[i];
            __CLR4_1_2cuvcuvl3lqxspe.R.inc(16790);if ((((Character.isUpperCase(ch))&&(__CLR4_1_2cuvcuvl3lqxspe.R.iget(16791)!=0|true))||(__CLR4_1_2cuvcuvl3lqxspe.R.iget(16792)==0&false))) {{
                __CLR4_1_2cuvcuvl3lqxspe.R.inc(16793);buffer[i] = Character.toLowerCase(ch);
                __CLR4_1_2cuvcuvl3lqxspe.R.inc(16794);whitespace = false;
            } }else {__CLR4_1_2cuvcuvl3lqxspe.R.inc(16795);if ((((Character.isTitleCase(ch))&&(__CLR4_1_2cuvcuvl3lqxspe.R.iget(16796)!=0|true))||(__CLR4_1_2cuvcuvl3lqxspe.R.iget(16797)==0&false))) {{
                __CLR4_1_2cuvcuvl3lqxspe.R.inc(16798);buffer[i] = Character.toLowerCase(ch);
                __CLR4_1_2cuvcuvl3lqxspe.R.inc(16799);whitespace = false;
            } }else {__CLR4_1_2cuvcuvl3lqxspe.R.inc(16800);if ((((Character.isLowerCase(ch))&&(__CLR4_1_2cuvcuvl3lqxspe.R.iget(16801)!=0|true))||(__CLR4_1_2cuvcuvl3lqxspe.R.iget(16802)==0&false))) {{
                __CLR4_1_2cuvcuvl3lqxspe.R.inc(16803);if ((((whitespace)&&(__CLR4_1_2cuvcuvl3lqxspe.R.iget(16804)!=0|true))||(__CLR4_1_2cuvcuvl3lqxspe.R.iget(16805)==0&false))) {{
                    __CLR4_1_2cuvcuvl3lqxspe.R.inc(16806);buffer[i] = Character.toTitleCase(ch);
                    __CLR4_1_2cuvcuvl3lqxspe.R.inc(16807);whitespace = false;
                } }else {{
                    __CLR4_1_2cuvcuvl3lqxspe.R.inc(16808);buffer[i] = Character.toUpperCase(ch);
                }
            }} }else {{
                __CLR4_1_2cuvcuvl3lqxspe.R.inc(16809);whitespace = Character.isWhitespace(ch);
            }
        }}}}
        }__CLR4_1_2cuvcuvl3lqxspe.R.inc(16810);return new String(buffer);
    }finally{__CLR4_1_2cuvcuvl3lqxspe.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * <p>Extracts the initial letters from each word in the String.</p>
     * 
     * <p>The first letter of the string and all first letters after
     * whitespace are returned as a new string.
     * Their case is not changed.</p>
     *
     * <p>Whitespace is defined by {@link Character#isWhitespace(char)}.
     * A <code>null</code> input String returns <code>null</code>.</p>
     *
     * <pre>
     * WordUtils.initials(null)             = null
     * WordUtils.initials("")               = ""
     * WordUtils.initials("Ben John Lee")   = "BJL"
     * WordUtils.initials("Ben J.Lee")      = "BJ"
     * </pre>
     *
     * @param str  the String to get initials from, may be null
     * @return String of initial letters, <code>null</code> if null String input
     * @see #initials(String,char[])
     * @since 2.2
     */
    public static String initials(final String str) {try{__CLR4_1_2cuvcuvl3lqxspe.R.inc(16811);
        __CLR4_1_2cuvcuvl3lqxspe.R.inc(16812);return initials(str, null);
    }finally{__CLR4_1_2cuvcuvl3lqxspe.R.flushNeeded();}}

    /**
     * <p>Extracts the initial letters from each word in the String.</p>
     * 
     * <p>The first letter of the string and all first letters after the
     * defined delimiters are returned as a new string.
     * Their case is not changed.</p>
     *
     * <p>If the delimiters array is null, then Whitespace is used.
     * Whitespace is defined by {@link Character#isWhitespace(char)}.
     * A <code>null</code> input String returns <code>null</code>.
     * An empty delimiter array returns an empty String.</p>
     *
     * <pre>
     * WordUtils.initials(null, *)                = null
     * WordUtils.initials("", *)                  = ""
     * WordUtils.initials("Ben John Lee", null)   = "BJL"
     * WordUtils.initials("Ben J.Lee", null)      = "BJ"
     * WordUtils.initials("Ben J.Lee", [' ','.']) = "BJL"
     * WordUtils.initials(*, new char[0])         = ""
     * </pre>
     * 
     * @param str  the String to get initials from, may be null
     * @param delimiters  set of characters to determine words, null means whitespace
     * @return String of initial letters, <code>null</code> if null String input
     * @see #initials(String)
     * @since 2.2
     */
    public static String initials(final String str, final char... delimiters) {try{__CLR4_1_2cuvcuvl3lqxspe.R.inc(16813);
        __CLR4_1_2cuvcuvl3lqxspe.R.inc(16814);if ((((StringUtils.isEmpty(str))&&(__CLR4_1_2cuvcuvl3lqxspe.R.iget(16815)!=0|true))||(__CLR4_1_2cuvcuvl3lqxspe.R.iget(16816)==0&false))) {{
            __CLR4_1_2cuvcuvl3lqxspe.R.inc(16817);return str;
        }
        }__CLR4_1_2cuvcuvl3lqxspe.R.inc(16818);if ((((delimiters != null && delimiters.length == 0)&&(__CLR4_1_2cuvcuvl3lqxspe.R.iget(16819)!=0|true))||(__CLR4_1_2cuvcuvl3lqxspe.R.iget(16820)==0&false))) {{
            __CLR4_1_2cuvcuvl3lqxspe.R.inc(16821);return "";
        }
        }__CLR4_1_2cuvcuvl3lqxspe.R.inc(16822);final int strLen = str.length();
        __CLR4_1_2cuvcuvl3lqxspe.R.inc(16823);final char[] buf = new char[strLen / 2 + 1];
        __CLR4_1_2cuvcuvl3lqxspe.R.inc(16824);int count = 0;
        __CLR4_1_2cuvcuvl3lqxspe.R.inc(16825);boolean lastWasGap = true;
        __CLR4_1_2cuvcuvl3lqxspe.R.inc(16826);for (int i = 0; (((i < strLen)&&(__CLR4_1_2cuvcuvl3lqxspe.R.iget(16827)!=0|true))||(__CLR4_1_2cuvcuvl3lqxspe.R.iget(16828)==0&false)); i++) {{
            __CLR4_1_2cuvcuvl3lqxspe.R.inc(16829);final char ch = str.charAt(i);

            __CLR4_1_2cuvcuvl3lqxspe.R.inc(16830);if ((((isDelimiter(ch, delimiters))&&(__CLR4_1_2cuvcuvl3lqxspe.R.iget(16831)!=0|true))||(__CLR4_1_2cuvcuvl3lqxspe.R.iget(16832)==0&false))) {{
                __CLR4_1_2cuvcuvl3lqxspe.R.inc(16833);lastWasGap = true;
            } }else {__CLR4_1_2cuvcuvl3lqxspe.R.inc(16834);if ((((lastWasGap)&&(__CLR4_1_2cuvcuvl3lqxspe.R.iget(16835)!=0|true))||(__CLR4_1_2cuvcuvl3lqxspe.R.iget(16836)==0&false))) {{
                __CLR4_1_2cuvcuvl3lqxspe.R.inc(16837);buf[count++] = ch;
                __CLR4_1_2cuvcuvl3lqxspe.R.inc(16838);lastWasGap = false;
            } }else {{
                __CLR4_1_2cuvcuvl3lqxspe.R.inc(16839);continue; // ignore ch
            }
        }}}
        }__CLR4_1_2cuvcuvl3lqxspe.R.inc(16840);return new String(buf, 0, count);
    }finally{__CLR4_1_2cuvcuvl3lqxspe.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Is the character a delimiter.
     *
     * @param ch  the character to check
     * @param delimiters  the delimiters
     * @return true if it is a delimiter
     */
    private static boolean isDelimiter(final char ch, final char[] delimiters) {try{__CLR4_1_2cuvcuvl3lqxspe.R.inc(16841);
        __CLR4_1_2cuvcuvl3lqxspe.R.inc(16842);if ((((delimiters == null)&&(__CLR4_1_2cuvcuvl3lqxspe.R.iget(16843)!=0|true))||(__CLR4_1_2cuvcuvl3lqxspe.R.iget(16844)==0&false))) {{
            __CLR4_1_2cuvcuvl3lqxspe.R.inc(16845);return Character.isWhitespace(ch);
        }
        }__CLR4_1_2cuvcuvl3lqxspe.R.inc(16846);for (final char delimiter : delimiters) {{
            __CLR4_1_2cuvcuvl3lqxspe.R.inc(16847);if ((((ch == delimiter)&&(__CLR4_1_2cuvcuvl3lqxspe.R.iget(16848)!=0|true))||(__CLR4_1_2cuvcuvl3lqxspe.R.iget(16849)==0&false))) {{
                __CLR4_1_2cuvcuvl3lqxspe.R.inc(16850);return true;
            }
        }}
        }__CLR4_1_2cuvcuvl3lqxspe.R.inc(16851);return false;
    }finally{__CLR4_1_2cuvcuvl3lqxspe.R.flushNeeded();}}

}
