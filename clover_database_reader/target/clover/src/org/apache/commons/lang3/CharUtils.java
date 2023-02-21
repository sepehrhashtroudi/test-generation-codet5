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

/**
 * <p>Operations on char primitives and Character objects.</p>
 *
 * <p>This class tries to handle {@code null} input gracefully.
 * An exception will not be thrown for a {@code null} input.
 * Each method documents its behaviour in more detail.</p>
 * 
 * <p>#ThreadSafe#</p>
 * @since 2.1
 * @version $Id$
 */
public class CharUtils {public static class __CLR4_1_22ha2hal3lqxrpf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492827633L,8589935092L,3325,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    private static final String[] CHAR_STRING_ARRAY = new String[128];
    
    /**
     * {@code \u000a} linefeed LF ('\n').
     * 
     * @see <a href="http://docs.oracle.com/javase/specs/jls/se7/html/jls-3.html#jls-3.10.6">JLF: Escape Sequences
     *      for Character and String Literals</a>
     * @since 2.2
     */
    public static final char LF = '\n';

    /**
     * {@code \u000d} carriage return CR ('\r').
     * 
     * @see <a href="http://docs.oracle.com/javase/specs/jls/se7/html/jls-3.html#jls-3.10.6">JLF: Escape Sequences
     *      for Character and String Literals</a>
     * @since 2.2
     */
    public static final char CR = '\r';
    

    static {try{__CLR4_1_22ha2hal3lqxrpf.R.inc(3214);
        __CLR4_1_22ha2hal3lqxrpf.R.inc(3215);for (char c = 0; (((c < CHAR_STRING_ARRAY.length)&&(__CLR4_1_22ha2hal3lqxrpf.R.iget(3216)!=0|true))||(__CLR4_1_22ha2hal3lqxrpf.R.iget(3217)==0&false)); c++) {{
            __CLR4_1_22ha2hal3lqxrpf.R.inc(3218);CHAR_STRING_ARRAY[c] = String.valueOf(c);
        }
    }}finally{__CLR4_1_22ha2hal3lqxrpf.R.flushNeeded();}}

    /**
     * <p>{@code CharUtils} instances should NOT be constructed in standard programming.
     * Instead, the class should be used as {@code CharUtils.toString('c');}.</p>
     *
     * <p>This constructor is public to permit tools that require a JavaBean instance
     * to operate.</p>
     */
    public CharUtils() {
      super();__CLR4_1_22ha2hal3lqxrpf.R.inc(3220);try{__CLR4_1_22ha2hal3lqxrpf.R.inc(3219);
    }finally{__CLR4_1_22ha2hal3lqxrpf.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * <p>Converts the character to a Character.</p>
     * 
     * <p>For ASCII 7 bit characters, this uses a cache that will return the
     * same Character object each time.</p>
     *
     * <pre>
     *   CharUtils.toCharacterObject(' ')  = ' '
     *   CharUtils.toCharacterObject('A')  = 'A'
     * </pre>
     *
     * @deprecated Java 5 introduced {@link Character#valueOf(char)} which caches chars 0 through 127.
     * @param ch  the character to convert
     * @return a Character of the specified character
     */
    @Deprecated
    public static Character toCharacterObject(final char ch) {try{__CLR4_1_22ha2hal3lqxrpf.R.inc(3221);
        __CLR4_1_22ha2hal3lqxrpf.R.inc(3222);return Character.valueOf(ch);
    }finally{__CLR4_1_22ha2hal3lqxrpf.R.flushNeeded();}}
    
    /**
     * <p>Converts the String to a Character using the first character, returning
     * null for empty Strings.</p>
     * 
     * <p>For ASCII 7 bit characters, this uses a cache that will return the
     * same Character object each time.</p>
     * 
     * <pre>
     *   CharUtils.toCharacterObject(null) = null
     *   CharUtils.toCharacterObject("")   = null
     *   CharUtils.toCharacterObject("A")  = 'A'
     *   CharUtils.toCharacterObject("BA") = 'B'
     * </pre>
     *
     * @param str  the character to convert
     * @return the Character value of the first letter of the String
     */
    public static Character toCharacterObject(final String str) {try{__CLR4_1_22ha2hal3lqxrpf.R.inc(3223);
        __CLR4_1_22ha2hal3lqxrpf.R.inc(3224);if ((((StringUtils.isEmpty(str))&&(__CLR4_1_22ha2hal3lqxrpf.R.iget(3225)!=0|true))||(__CLR4_1_22ha2hal3lqxrpf.R.iget(3226)==0&false))) {{
            __CLR4_1_22ha2hal3lqxrpf.R.inc(3227);return null;
        }
        }__CLR4_1_22ha2hal3lqxrpf.R.inc(3228);return Character.valueOf(str.charAt(0));
    }finally{__CLR4_1_22ha2hal3lqxrpf.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    /**
     * <p>Converts the Character to a char throwing an exception for {@code null}.</p>
     * 
     * <pre>
     *   CharUtils.toChar(' ')  = ' '
     *   CharUtils.toChar('A')  = 'A'
     *   CharUtils.toChar(null) throws IllegalArgumentException
     * </pre>
     *
     * @param ch  the character to convert
     * @return the char value of the Character
     * @throws IllegalArgumentException if the Character is null
     */
    public static char toChar(final Character ch) {try{__CLR4_1_22ha2hal3lqxrpf.R.inc(3229);
        __CLR4_1_22ha2hal3lqxrpf.R.inc(3230);if ((((ch == null)&&(__CLR4_1_22ha2hal3lqxrpf.R.iget(3231)!=0|true))||(__CLR4_1_22ha2hal3lqxrpf.R.iget(3232)==0&false))) {{
            __CLR4_1_22ha2hal3lqxrpf.R.inc(3233);throw new IllegalArgumentException("The Character must not be null");
        }
        }__CLR4_1_22ha2hal3lqxrpf.R.inc(3234);return ch.charValue();
    }finally{__CLR4_1_22ha2hal3lqxrpf.R.flushNeeded();}}
    
    /**
     * <p>Converts the Character to a char handling {@code null}.</p>
     * 
     * <pre>
     *   CharUtils.toChar(null, 'X') = 'X'
     *   CharUtils.toChar(' ', 'X')  = ' '
     *   CharUtils.toChar('A', 'X')  = 'A'
     * </pre>
     *
     * @param ch  the character to convert
     * @param defaultValue  the value to use if the  Character is null
     * @return the char value of the Character or the default if null
     */
    public static char toChar(final Character ch, final char defaultValue) {try{__CLR4_1_22ha2hal3lqxrpf.R.inc(3235);
        __CLR4_1_22ha2hal3lqxrpf.R.inc(3236);if ((((ch == null)&&(__CLR4_1_22ha2hal3lqxrpf.R.iget(3237)!=0|true))||(__CLR4_1_22ha2hal3lqxrpf.R.iget(3238)==0&false))) {{
            __CLR4_1_22ha2hal3lqxrpf.R.inc(3239);return defaultValue;
        }
        }__CLR4_1_22ha2hal3lqxrpf.R.inc(3240);return ch.charValue();
    }finally{__CLR4_1_22ha2hal3lqxrpf.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    /**
     * <p>Converts the String to a char using the first character, throwing
     * an exception on empty Strings.</p>
     * 
     * <pre>
     *   CharUtils.toChar("A")  = 'A'
     *   CharUtils.toChar("BA") = 'B'
     *   CharUtils.toChar(null) throws IllegalArgumentException
     *   CharUtils.toChar("")   throws IllegalArgumentException
     * </pre>
     *
     * @param str  the character to convert
     * @return the char value of the first letter of the String
     * @throws IllegalArgumentException if the String is empty
     */
    public static char toChar(final String str) {try{__CLR4_1_22ha2hal3lqxrpf.R.inc(3241);
        __CLR4_1_22ha2hal3lqxrpf.R.inc(3242);if ((((StringUtils.isEmpty(str))&&(__CLR4_1_22ha2hal3lqxrpf.R.iget(3243)!=0|true))||(__CLR4_1_22ha2hal3lqxrpf.R.iget(3244)==0&false))) {{
            __CLR4_1_22ha2hal3lqxrpf.R.inc(3245);throw new IllegalArgumentException("The String must not be empty");
        }
        }__CLR4_1_22ha2hal3lqxrpf.R.inc(3246);return str.charAt(0);
    }finally{__CLR4_1_22ha2hal3lqxrpf.R.flushNeeded();}}
    
    /**
     * <p>Converts the String to a char using the first character, defaulting
     * the value on empty Strings.</p>
     * 
     * <pre>
     *   CharUtils.toChar(null, 'X') = 'X'
     *   CharUtils.toChar("", 'X')   = 'X'
     *   CharUtils.toChar("A", 'X')  = 'A'
     *   CharUtils.toChar("BA", 'X') = 'B'
     * </pre>
     *
     * @param str  the character to convert
     * @param defaultValue  the value to use if the  Character is null
     * @return the char value of the first letter of the String or the default if null
     */
    public static char toChar(final String str, final char defaultValue) {try{__CLR4_1_22ha2hal3lqxrpf.R.inc(3247);
        __CLR4_1_22ha2hal3lqxrpf.R.inc(3248);if ((((StringUtils.isEmpty(str))&&(__CLR4_1_22ha2hal3lqxrpf.R.iget(3249)!=0|true))||(__CLR4_1_22ha2hal3lqxrpf.R.iget(3250)==0&false))) {{
            __CLR4_1_22ha2hal3lqxrpf.R.inc(3251);return defaultValue;
        }
        }__CLR4_1_22ha2hal3lqxrpf.R.inc(3252);return str.charAt(0);
    }finally{__CLR4_1_22ha2hal3lqxrpf.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    /**
     * <p>Converts the character to the Integer it represents, throwing an
     * exception if the character is not numeric.</p>
     * 
     * <p>This method coverts the char '1' to the int 1 and so on.</p>
     *
     * <pre>
     *   CharUtils.toIntValue('3')  = 3
     *   CharUtils.toIntValue('A')  throws IllegalArgumentException
     * </pre>
     *
     * @param ch  the character to convert
     * @return the int value of the character
     * @throws IllegalArgumentException if the character is not ASCII numeric
     */
    public static int toIntValue(final char ch) {try{__CLR4_1_22ha2hal3lqxrpf.R.inc(3253);
        __CLR4_1_22ha2hal3lqxrpf.R.inc(3254);if ((((isAsciiNumeric(ch) == false)&&(__CLR4_1_22ha2hal3lqxrpf.R.iget(3255)!=0|true))||(__CLR4_1_22ha2hal3lqxrpf.R.iget(3256)==0&false))) {{
            __CLR4_1_22ha2hal3lqxrpf.R.inc(3257);throw new IllegalArgumentException("The character " + ch + " is not in the range '0' - '9'");
        }
        }__CLR4_1_22ha2hal3lqxrpf.R.inc(3258);return ch - 48;
    }finally{__CLR4_1_22ha2hal3lqxrpf.R.flushNeeded();}}
    
    /**
     * <p>Converts the character to the Integer it represents, throwing an
     * exception if the character is not numeric.</p>
     * 
     * <p>This method coverts the char '1' to the int 1 and so on.</p>
     *
     * <pre>
     *   CharUtils.toIntValue('3', -1)  = 3
     *   CharUtils.toIntValue('A', -1)  = -1
     * </pre>
     *
     * @param ch  the character to convert
     * @param defaultValue  the default value to use if the character is not numeric
     * @return the int value of the character
     */
    public static int toIntValue(final char ch, final int defaultValue) {try{__CLR4_1_22ha2hal3lqxrpf.R.inc(3259);
        __CLR4_1_22ha2hal3lqxrpf.R.inc(3260);if ((((isAsciiNumeric(ch) == false)&&(__CLR4_1_22ha2hal3lqxrpf.R.iget(3261)!=0|true))||(__CLR4_1_22ha2hal3lqxrpf.R.iget(3262)==0&false))) {{
            __CLR4_1_22ha2hal3lqxrpf.R.inc(3263);return defaultValue;
        }
        }__CLR4_1_22ha2hal3lqxrpf.R.inc(3264);return ch - 48;
    }finally{__CLR4_1_22ha2hal3lqxrpf.R.flushNeeded();}}
    
    /**
     * <p>Converts the character to the Integer it represents, throwing an
     * exception if the character is not numeric.</p>
     * 
     * <p>This method coverts the char '1' to the int 1 and so on.</p>
     *
     * <pre>
     *   CharUtils.toIntValue('3')  = 3
     *   CharUtils.toIntValue(null) throws IllegalArgumentException
     *   CharUtils.toIntValue('A')  throws IllegalArgumentException
     * </pre>
     *
     * @param ch  the character to convert, not null
     * @return the int value of the character
     * @throws IllegalArgumentException if the Character is not ASCII numeric or is null
     */
    public static int toIntValue(final Character ch) {try{__CLR4_1_22ha2hal3lqxrpf.R.inc(3265);
        __CLR4_1_22ha2hal3lqxrpf.R.inc(3266);if ((((ch == null)&&(__CLR4_1_22ha2hal3lqxrpf.R.iget(3267)!=0|true))||(__CLR4_1_22ha2hal3lqxrpf.R.iget(3268)==0&false))) {{
            __CLR4_1_22ha2hal3lqxrpf.R.inc(3269);throw new IllegalArgumentException("The character must not be null");
        }
        }__CLR4_1_22ha2hal3lqxrpf.R.inc(3270);return toIntValue(ch.charValue());
    }finally{__CLR4_1_22ha2hal3lqxrpf.R.flushNeeded();}}
    
    /**
     * <p>Converts the character to the Integer it represents, throwing an
     * exception if the character is not numeric.</p>
     * 
     * <p>This method coverts the char '1' to the int 1 and so on.</p>
     *
     * <pre>
     *   CharUtils.toIntValue(null, -1) = -1
     *   CharUtils.toIntValue('3', -1)  = 3
     *   CharUtils.toIntValue('A', -1)  = -1
     * </pre>
     *
     * @param ch  the character to convert
     * @param defaultValue  the default value to use if the character is not numeric
     * @return the int value of the character
     */
    public static int toIntValue(final Character ch, final int defaultValue) {try{__CLR4_1_22ha2hal3lqxrpf.R.inc(3271);
        __CLR4_1_22ha2hal3lqxrpf.R.inc(3272);if ((((ch == null)&&(__CLR4_1_22ha2hal3lqxrpf.R.iget(3273)!=0|true))||(__CLR4_1_22ha2hal3lqxrpf.R.iget(3274)==0&false))) {{
            __CLR4_1_22ha2hal3lqxrpf.R.inc(3275);return defaultValue;
        }
        }__CLR4_1_22ha2hal3lqxrpf.R.inc(3276);return toIntValue(ch.charValue(), defaultValue);
    }finally{__CLR4_1_22ha2hal3lqxrpf.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    /**
     * <p>Converts the character to a String that contains the one character.</p>
     * 
     * <p>For ASCII 7 bit characters, this uses a cache that will return the
     * same String object each time.</p>
     *
     * <pre>
     *   CharUtils.toString(' ')  = " "
     *   CharUtils.toString('A')  = "A"
     * </pre>
     *
     * @param ch  the character to convert
     * @return a String containing the one specified character
     */
    public static String toString(final char ch) {try{__CLR4_1_22ha2hal3lqxrpf.R.inc(3277);
        __CLR4_1_22ha2hal3lqxrpf.R.inc(3278);if ((((ch < 128)&&(__CLR4_1_22ha2hal3lqxrpf.R.iget(3279)!=0|true))||(__CLR4_1_22ha2hal3lqxrpf.R.iget(3280)==0&false))) {{
            __CLR4_1_22ha2hal3lqxrpf.R.inc(3281);return CHAR_STRING_ARRAY[ch];
        }
        }__CLR4_1_22ha2hal3lqxrpf.R.inc(3282);return new String(new char[] {ch});
    }finally{__CLR4_1_22ha2hal3lqxrpf.R.flushNeeded();}}
    
    /**
     * <p>Converts the character to a String that contains the one character.</p>
     * 
     * <p>For ASCII 7 bit characters, this uses a cache that will return the
     * same String object each time.</p>
     * 
     * <p>If {@code null} is passed in, {@code null} will be returned.</p>
     *
     * <pre>
     *   CharUtils.toString(null) = null
     *   CharUtils.toString(' ')  = " "
     *   CharUtils.toString('A')  = "A"
     * </pre>
     *
     * @param ch  the character to convert
     * @return a String containing the one specified character
     */
    public static String toString(final Character ch) {try{__CLR4_1_22ha2hal3lqxrpf.R.inc(3283);
        __CLR4_1_22ha2hal3lqxrpf.R.inc(3284);if ((((ch == null)&&(__CLR4_1_22ha2hal3lqxrpf.R.iget(3285)!=0|true))||(__CLR4_1_22ha2hal3lqxrpf.R.iget(3286)==0&false))) {{
            __CLR4_1_22ha2hal3lqxrpf.R.inc(3287);return null;
        }
        }__CLR4_1_22ha2hal3lqxrpf.R.inc(3288);return toString(ch.charValue());
    }finally{__CLR4_1_22ha2hal3lqxrpf.R.flushNeeded();}}
    
    //--------------------------------------------------------------------------
    /**
     * <p>Converts the string to the Unicode format ' '.</p>
     * 
     * <p>This format is the Java source code format.</p>
     *
     * <pre>
     *   CharUtils.unicodeEscaped(' ') = " "
     *   CharUtils.unicodeEscaped('A') = "A"
     * </pre>
     * 
     * @param ch  the character to convert
     * @return the escaped Unicode string
     */
    public static String unicodeEscaped(final char ch) {try{__CLR4_1_22ha2hal3lqxrpf.R.inc(3289);
        __CLR4_1_22ha2hal3lqxrpf.R.inc(3290);if ((((ch < 0x10)&&(__CLR4_1_22ha2hal3lqxrpf.R.iget(3291)!=0|true))||(__CLR4_1_22ha2hal3lqxrpf.R.iget(3292)==0&false))) {{
            __CLR4_1_22ha2hal3lqxrpf.R.inc(3293);return "\\u000" + Integer.toHexString(ch);
        } }else {__CLR4_1_22ha2hal3lqxrpf.R.inc(3294);if ((((ch < 0x100)&&(__CLR4_1_22ha2hal3lqxrpf.R.iget(3295)!=0|true))||(__CLR4_1_22ha2hal3lqxrpf.R.iget(3296)==0&false))) {{
            __CLR4_1_22ha2hal3lqxrpf.R.inc(3297);return "\\u00" + Integer.toHexString(ch);
        } }else {__CLR4_1_22ha2hal3lqxrpf.R.inc(3298);if ((((ch < 0x1000)&&(__CLR4_1_22ha2hal3lqxrpf.R.iget(3299)!=0|true))||(__CLR4_1_22ha2hal3lqxrpf.R.iget(3300)==0&false))) {{
            __CLR4_1_22ha2hal3lqxrpf.R.inc(3301);return "\\u0" + Integer.toHexString(ch);
        }
        }}}__CLR4_1_22ha2hal3lqxrpf.R.inc(3302);return "\\u" + Integer.toHexString(ch);
    }finally{__CLR4_1_22ha2hal3lqxrpf.R.flushNeeded();}}
    
    /**
     * <p>Converts the string to the Unicode format ' '.</p>
     * 
     * <p>This format is the Java source code format.</p>
     * 
     * <p>If {@code null} is passed in, {@code null} will be returned.</p>
     *
     * <pre>
     *   CharUtils.unicodeEscaped(null) = null
     *   CharUtils.unicodeEscaped(' ')  = " "
     *   CharUtils.unicodeEscaped('A')  = "A"
     * </pre>
     * 
     * @param ch  the character to convert, may be null
     * @return the escaped Unicode string, null if null input
     */
    public static String unicodeEscaped(final Character ch) {try{__CLR4_1_22ha2hal3lqxrpf.R.inc(3303);
        __CLR4_1_22ha2hal3lqxrpf.R.inc(3304);if ((((ch == null)&&(__CLR4_1_22ha2hal3lqxrpf.R.iget(3305)!=0|true))||(__CLR4_1_22ha2hal3lqxrpf.R.iget(3306)==0&false))) {{
            __CLR4_1_22ha2hal3lqxrpf.R.inc(3307);return null;
        }
        }__CLR4_1_22ha2hal3lqxrpf.R.inc(3308);return unicodeEscaped(ch.charValue());
    }finally{__CLR4_1_22ha2hal3lqxrpf.R.flushNeeded();}}
    
    //--------------------------------------------------------------------------
    /**
     * <p>Checks whether the character is ASCII 7 bit.</p>
     *
     * <pre>
     *   CharUtils.isAscii('a')  = true
     *   CharUtils.isAscii('A')  = true
     *   CharUtils.isAscii('3')  = true
     *   CharUtils.isAscii('-')  = true
     *   CharUtils.isAscii('\n') = true
     *   CharUtils.isAscii('&copy;') = false
     * </pre>
     * 
     * @param ch  the character to check
     * @return true if less than 128
     */
    public static boolean isAscii(final char ch) {try{__CLR4_1_22ha2hal3lqxrpf.R.inc(3309);
        __CLR4_1_22ha2hal3lqxrpf.R.inc(3310);return ch < 128;
    }finally{__CLR4_1_22ha2hal3lqxrpf.R.flushNeeded();}}
    
    /**
     * <p>Checks whether the character is ASCII 7 bit printable.</p>
     *
     * <pre>
     *   CharUtils.isAsciiPrintable('a')  = true
     *   CharUtils.isAsciiPrintable('A')  = true
     *   CharUtils.isAsciiPrintable('3')  = true
     *   CharUtils.isAsciiPrintable('-')  = true
     *   CharUtils.isAsciiPrintable('\n') = false
     *   CharUtils.isAsciiPrintable('&copy;') = false
     * </pre>
     * 
     * @param ch  the character to check
     * @return true if between 32 and 126 inclusive
     */
    public static boolean isAsciiPrintable(final char ch) {try{__CLR4_1_22ha2hal3lqxrpf.R.inc(3311);
        __CLR4_1_22ha2hal3lqxrpf.R.inc(3312);return ch >= 32 && ch < 127;
    }finally{__CLR4_1_22ha2hal3lqxrpf.R.flushNeeded();}}
    
    /**
     * <p>Checks whether the character is ASCII 7 bit control.</p>
     *
     * <pre>
     *   CharUtils.isAsciiControl('a')  = false
     *   CharUtils.isAsciiControl('A')  = false
     *   CharUtils.isAsciiControl('3')  = false
     *   CharUtils.isAsciiControl('-')  = false
     *   CharUtils.isAsciiControl('\n') = true
     *   CharUtils.isAsciiControl('&copy;') = false
     * </pre>
     * 
     * @param ch  the character to check
     * @return true if less than 32 or equals 127
     */
    public static boolean isAsciiControl(final char ch) {try{__CLR4_1_22ha2hal3lqxrpf.R.inc(3313);
        __CLR4_1_22ha2hal3lqxrpf.R.inc(3314);return ch < 32 || ch == 127;
    }finally{__CLR4_1_22ha2hal3lqxrpf.R.flushNeeded();}}
    
    /**
     * <p>Checks whether the character is ASCII 7 bit alphabetic.</p>
     *
     * <pre>
     *   CharUtils.isAsciiAlpha('a')  = true
     *   CharUtils.isAsciiAlpha('A')  = true
     *   CharUtils.isAsciiAlpha('3')  = false
     *   CharUtils.isAsciiAlpha('-')  = false
     *   CharUtils.isAsciiAlpha('\n') = false
     *   CharUtils.isAsciiAlpha('&copy;') = false
     * </pre>
     * 
     * @param ch  the character to check
     * @return true if between 65 and 90 or 97 and 122 inclusive
     */
    public static boolean isAsciiAlpha(final char ch) {try{__CLR4_1_22ha2hal3lqxrpf.R.inc(3315);
        __CLR4_1_22ha2hal3lqxrpf.R.inc(3316);return (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z');
    }finally{__CLR4_1_22ha2hal3lqxrpf.R.flushNeeded();}}
    
    /**
     * <p>Checks whether the character is ASCII 7 bit alphabetic upper case.</p>
     *
     * <pre>
     *   CharUtils.isAsciiAlphaUpper('a')  = false
     *   CharUtils.isAsciiAlphaUpper('A')  = true
     *   CharUtils.isAsciiAlphaUpper('3')  = false
     *   CharUtils.isAsciiAlphaUpper('-')  = false
     *   CharUtils.isAsciiAlphaUpper('\n') = false
     *   CharUtils.isAsciiAlphaUpper('&copy;') = false
     * </pre>
     * 
     * @param ch  the character to check
     * @return true if between 65 and 90 inclusive
     */
    public static boolean isAsciiAlphaUpper(final char ch) {try{__CLR4_1_22ha2hal3lqxrpf.R.inc(3317);
        __CLR4_1_22ha2hal3lqxrpf.R.inc(3318);return ch >= 'A' && ch <= 'Z';
    }finally{__CLR4_1_22ha2hal3lqxrpf.R.flushNeeded();}}
    
    /**
     * <p>Checks whether the character is ASCII 7 bit alphabetic lower case.</p>
     *
     * <pre>
     *   CharUtils.isAsciiAlphaLower('a')  = true
     *   CharUtils.isAsciiAlphaLower('A')  = false
     *   CharUtils.isAsciiAlphaLower('3')  = false
     *   CharUtils.isAsciiAlphaLower('-')  = false
     *   CharUtils.isAsciiAlphaLower('\n') = false
     *   CharUtils.isAsciiAlphaLower('&copy;') = false
     * </pre>
     * 
     * @param ch  the character to check
     * @return true if between 97 and 122 inclusive
     */
    public static boolean isAsciiAlphaLower(final char ch) {try{__CLR4_1_22ha2hal3lqxrpf.R.inc(3319);
        __CLR4_1_22ha2hal3lqxrpf.R.inc(3320);return ch >= 'a' && ch <= 'z';
    }finally{__CLR4_1_22ha2hal3lqxrpf.R.flushNeeded();}}
    
    /**
     * <p>Checks whether the character is ASCII 7 bit numeric.</p>
     *
     * <pre>
     *   CharUtils.isAsciiNumeric('a')  = false
     *   CharUtils.isAsciiNumeric('A')  = false
     *   CharUtils.isAsciiNumeric('3')  = true
     *   CharUtils.isAsciiNumeric('-')  = false
     *   CharUtils.isAsciiNumeric('\n') = false
     *   CharUtils.isAsciiNumeric('&copy;') = false
     * </pre>
     * 
     * @param ch  the character to check
     * @return true if between 48 and 57 inclusive
     */
    public static boolean isAsciiNumeric(final char ch) {try{__CLR4_1_22ha2hal3lqxrpf.R.inc(3321);
        __CLR4_1_22ha2hal3lqxrpf.R.inc(3322);return ch >= '0' && ch <= '9';
    }finally{__CLR4_1_22ha2hal3lqxrpf.R.flushNeeded();}}
    
    /**
     * <p>Checks whether the character is ASCII 7 bit numeric.</p>
     *
     * <pre>
     *   CharUtils.isAsciiAlphanumeric('a')  = true
     *   CharUtils.isAsciiAlphanumeric('A')  = true
     *   CharUtils.isAsciiAlphanumeric('3')  = true
     *   CharUtils.isAsciiAlphanumeric('-')  = false
     *   CharUtils.isAsciiAlphanumeric('\n') = false
     *   CharUtils.isAsciiAlphanumeric('&copy;') = false
     * </pre>
     * 
     * @param ch  the character to check
     * @return true if between 48 and 57 or 65 and 90 or 97 and 122 inclusive
     */
    public static boolean isAsciiAlphanumeric(final char ch) {try{__CLR4_1_22ha2hal3lqxrpf.R.inc(3323);
        __CLR4_1_22ha2hal3lqxrpf.R.inc(3324);return (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9');
    }finally{__CLR4_1_22ha2hal3lqxrpf.R.flushNeeded();}}
    
}
