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
 * <p>Operations on {@code CharSet} instances.</p>
 *
 * <p>This class handles {@code null} input gracefully.
 * An exception will not be thrown for a {@code null} input.
 * Each method documents its behaviour in more detail.</p>
 * 
 * <p>#ThreadSafe#</p>
 * @see CharSet
 * @since 1.0
 * @version $Id$
 */
public class CharSetUtils {public static class __CLR4_1_22eu2eul3lqxrot{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492827633L,8589935092L,3214,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * <p>CharSetUtils instances should NOT be constructed in standard programming.
     * Instead, the class should be used as {@code CharSetUtils.evaluateSet(null);}.</p>
     *
     * <p>This constructor is public to permit tools that require a JavaBean instance
     * to operate.</p>
     */
    public CharSetUtils() {
      super();__CLR4_1_22eu2eul3lqxrot.R.inc(3127);try{__CLR4_1_22eu2eul3lqxrot.R.inc(3126);
    }finally{__CLR4_1_22eu2eul3lqxrot.R.flushNeeded();}}

    // Squeeze
    //-----------------------------------------------------------------------
    /**
     * <p>Squeezes any repetitions of a character that is mentioned in the
     * supplied set.</p>
     *
     * <pre>
     * CharSetUtils.squeeze(null, *)        = null
     * CharSetUtils.squeeze("", *)          = ""
     * CharSetUtils.squeeze(*, null)        = *
     * CharSetUtils.squeeze(*, "")          = *
     * CharSetUtils.squeeze("hello", "k-p") = "helo"
     * CharSetUtils.squeeze("hello", "a-e") = "hello"
     * </pre>
     *
     * @see CharSet#getInstance(java.lang.String...) for set-syntax.
     * @param str  the string to squeeze, may be null
     * @param set  the character set to use for manipulation, may be null
     * @return the modified String, {@code null} if null string input
     */
    public static String squeeze(final String str, final String... set) {try{__CLR4_1_22eu2eul3lqxrot.R.inc(3128);
        __CLR4_1_22eu2eul3lqxrot.R.inc(3129);if ((((StringUtils.isEmpty(str) || deepEmpty(set))&&(__CLR4_1_22eu2eul3lqxrot.R.iget(3130)!=0|true))||(__CLR4_1_22eu2eul3lqxrot.R.iget(3131)==0&false))) {{
            __CLR4_1_22eu2eul3lqxrot.R.inc(3132);return str;
        }
        }__CLR4_1_22eu2eul3lqxrot.R.inc(3133);final CharSet chars = CharSet.getInstance(set);
        __CLR4_1_22eu2eul3lqxrot.R.inc(3134);final StringBuilder buffer = new StringBuilder(str.length());
        __CLR4_1_22eu2eul3lqxrot.R.inc(3135);final char[] chrs = str.toCharArray();
        __CLR4_1_22eu2eul3lqxrot.R.inc(3136);final int sz = chrs.length;
        __CLR4_1_22eu2eul3lqxrot.R.inc(3137);char lastChar = ' ';
        __CLR4_1_22eu2eul3lqxrot.R.inc(3138);char ch = ' ';
        __CLR4_1_22eu2eul3lqxrot.R.inc(3139);for (int i = 0; (((i < sz)&&(__CLR4_1_22eu2eul3lqxrot.R.iget(3140)!=0|true))||(__CLR4_1_22eu2eul3lqxrot.R.iget(3141)==0&false)); i++) {{
            __CLR4_1_22eu2eul3lqxrot.R.inc(3142);ch = chrs[i];
            // Compare with contains() last for performance.
            __CLR4_1_22eu2eul3lqxrot.R.inc(3143);if ((((ch == lastChar && i != 0 && chars.contains(ch))&&(__CLR4_1_22eu2eul3lqxrot.R.iget(3144)!=0|true))||(__CLR4_1_22eu2eul3lqxrot.R.iget(3145)==0&false))) {{
                __CLR4_1_22eu2eul3lqxrot.R.inc(3146);continue;
            }
            }__CLR4_1_22eu2eul3lqxrot.R.inc(3147);buffer.append(ch);
            __CLR4_1_22eu2eul3lqxrot.R.inc(3148);lastChar = ch;
        }
        }__CLR4_1_22eu2eul3lqxrot.R.inc(3149);return buffer.toString();
    }finally{__CLR4_1_22eu2eul3lqxrot.R.flushNeeded();}}

    // ContainsAny
    //-----------------------------------------------------------------------
    /**
     * <p>Takes an argument in set-syntax, see evaluateSet,
     * and identifies whether any of the characters are present in the specified string.</p>
     *
     * <pre>
     * CharSetUtils.containsAny(null, *)        = false
     * CharSetUtils.containsAny("", *)          = false
     * CharSetUtils.containsAny(*, null)        = false
     * CharSetUtils.containsAny(*, "")          = false
     * CharSetUtils.containsAny("hello", "k-p") = true
     * CharSetUtils.containsAny("hello", "a-d") = false
     * </pre>
     *
     * @see CharSet#getInstance(java.lang.String...) for set-syntax.
     * @param str  String to look for characters in, may be null
     * @param set  String[] set of characters to identify, may be null
     * @return whether or not the characters in the set are in the primary string
     */
    public static boolean containsAny(final String str, final String... set) {try{__CLR4_1_22eu2eul3lqxrot.R.inc(3150);
        __CLR4_1_22eu2eul3lqxrot.R.inc(3151);if ((((StringUtils.isEmpty(str) || deepEmpty(set))&&(__CLR4_1_22eu2eul3lqxrot.R.iget(3152)!=0|true))||(__CLR4_1_22eu2eul3lqxrot.R.iget(3153)==0&false))) {{
            __CLR4_1_22eu2eul3lqxrot.R.inc(3154);return false;
        }
        }__CLR4_1_22eu2eul3lqxrot.R.inc(3155);final CharSet chars = CharSet.getInstance(set);
        __CLR4_1_22eu2eul3lqxrot.R.inc(3156);for (final char c : str.toCharArray()) {{
            __CLR4_1_22eu2eul3lqxrot.R.inc(3157);if ((((chars.contains(c))&&(__CLR4_1_22eu2eul3lqxrot.R.iget(3158)!=0|true))||(__CLR4_1_22eu2eul3lqxrot.R.iget(3159)==0&false))) {{
                __CLR4_1_22eu2eul3lqxrot.R.inc(3160);return true;
            }
        }}
        }__CLR4_1_22eu2eul3lqxrot.R.inc(3161);return false;
    }finally{__CLR4_1_22eu2eul3lqxrot.R.flushNeeded();}}

    // Count
    //-----------------------------------------------------------------------
    /**
     * <p>Takes an argument in set-syntax, see evaluateSet,
     * and returns the number of characters present in the specified string.</p>
     *
     * <pre>
     * CharSetUtils.count(null, *)        = 0
     * CharSetUtils.count("", *)          = 0
     * CharSetUtils.count(*, null)        = 0
     * CharSetUtils.count(*, "")          = 0
     * CharSetUtils.count("hello", "k-p") = 3
     * CharSetUtils.count("hello", "a-e") = 1
     * </pre>
     *
     * @see CharSet#getInstance(java.lang.String...) for set-syntax.
     * @param str  String to count characters in, may be null
     * @param set  String[] set of characters to count, may be null
     * @return the character count, zero if null string input
     */
    public static int count(final String str, final String... set) {try{__CLR4_1_22eu2eul3lqxrot.R.inc(3162);
        __CLR4_1_22eu2eul3lqxrot.R.inc(3163);if ((((StringUtils.isEmpty(str) || deepEmpty(set))&&(__CLR4_1_22eu2eul3lqxrot.R.iget(3164)!=0|true))||(__CLR4_1_22eu2eul3lqxrot.R.iget(3165)==0&false))) {{
            __CLR4_1_22eu2eul3lqxrot.R.inc(3166);return 0;
        }
        }__CLR4_1_22eu2eul3lqxrot.R.inc(3167);final CharSet chars = CharSet.getInstance(set);
        __CLR4_1_22eu2eul3lqxrot.R.inc(3168);int count = 0;
        __CLR4_1_22eu2eul3lqxrot.R.inc(3169);for (final char c : str.toCharArray()) {{
            __CLR4_1_22eu2eul3lqxrot.R.inc(3170);if ((((chars.contains(c))&&(__CLR4_1_22eu2eul3lqxrot.R.iget(3171)!=0|true))||(__CLR4_1_22eu2eul3lqxrot.R.iget(3172)==0&false))) {{
                __CLR4_1_22eu2eul3lqxrot.R.inc(3173);count++;
            }
        }}
        }__CLR4_1_22eu2eul3lqxrot.R.inc(3174);return count;
    }finally{__CLR4_1_22eu2eul3lqxrot.R.flushNeeded();}}

    // Keep
    //-----------------------------------------------------------------------
    /**
     * <p>Takes an argument in set-syntax, see evaluateSet,
     * and keeps any of characters present in the specified string.</p>
     *
     * <pre>
     * CharSetUtils.keep(null, *)        = null
     * CharSetUtils.keep("", *)          = ""
     * CharSetUtils.keep(*, null)        = ""
     * CharSetUtils.keep(*, "")          = ""
     * CharSetUtils.keep("hello", "hl")  = "hll"
     * CharSetUtils.keep("hello", "le")  = "ell"
     * </pre>
     *
     * @see CharSet#getInstance(java.lang.String...) for set-syntax.
     * @param str  String to keep characters from, may be null
     * @param set  String[] set of characters to keep, may be null
     * @return the modified String, {@code null} if null string input
     * @since 2.0
     */
    public static String keep(final String str, final String... set) {try{__CLR4_1_22eu2eul3lqxrot.R.inc(3175);
        __CLR4_1_22eu2eul3lqxrot.R.inc(3176);if ((((str == null)&&(__CLR4_1_22eu2eul3lqxrot.R.iget(3177)!=0|true))||(__CLR4_1_22eu2eul3lqxrot.R.iget(3178)==0&false))) {{
            __CLR4_1_22eu2eul3lqxrot.R.inc(3179);return null;
        }
        }__CLR4_1_22eu2eul3lqxrot.R.inc(3180);if ((((str.length() == 0 || deepEmpty(set))&&(__CLR4_1_22eu2eul3lqxrot.R.iget(3181)!=0|true))||(__CLR4_1_22eu2eul3lqxrot.R.iget(3182)==0&false))) {{
            __CLR4_1_22eu2eul3lqxrot.R.inc(3183);return StringUtils.EMPTY;
        }
        }__CLR4_1_22eu2eul3lqxrot.R.inc(3184);return modify(str, set, true);
    }finally{__CLR4_1_22eu2eul3lqxrot.R.flushNeeded();}}

    // Delete
    //-----------------------------------------------------------------------
    /**
     * <p>Takes an argument in set-syntax, see evaluateSet,
     * and deletes any of characters present in the specified string.</p>
     *
     * <pre>
     * CharSetUtils.delete(null, *)        = null
     * CharSetUtils.delete("", *)          = ""
     * CharSetUtils.delete(*, null)        = *
     * CharSetUtils.delete(*, "")          = *
     * CharSetUtils.delete("hello", "hl")  = "eo"
     * CharSetUtils.delete("hello", "le")  = "ho"
     * </pre>
     *
     * @see CharSet#getInstance(java.lang.String...) for set-syntax.
     * @param str  String to delete characters from, may be null
     * @param set  String[] set of characters to delete, may be null
     * @return the modified String, {@code null} if null string input
     */
    public static String delete(final String str, final String... set) {try{__CLR4_1_22eu2eul3lqxrot.R.inc(3185);
        __CLR4_1_22eu2eul3lqxrot.R.inc(3186);if ((((StringUtils.isEmpty(str) || deepEmpty(set))&&(__CLR4_1_22eu2eul3lqxrot.R.iget(3187)!=0|true))||(__CLR4_1_22eu2eul3lqxrot.R.iget(3188)==0&false))) {{
            __CLR4_1_22eu2eul3lqxrot.R.inc(3189);return str;
        }
        }__CLR4_1_22eu2eul3lqxrot.R.inc(3190);return modify(str, set, false);
    }finally{__CLR4_1_22eu2eul3lqxrot.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Implementation of delete and keep
     *
     * @param str String to modify characters within
     * @param set String[] set of characters to modify
     * @param expect whether to evaluate on match, or non-match
     * @return the modified String, not null
     */
    private static String modify(final String str, final String[] set, final boolean expect) {try{__CLR4_1_22eu2eul3lqxrot.R.inc(3191);
        __CLR4_1_22eu2eul3lqxrot.R.inc(3192);final CharSet chars = CharSet.getInstance(set);
        __CLR4_1_22eu2eul3lqxrot.R.inc(3193);final StringBuilder buffer = new StringBuilder(str.length());
        __CLR4_1_22eu2eul3lqxrot.R.inc(3194);final char[] chrs = str.toCharArray();
        __CLR4_1_22eu2eul3lqxrot.R.inc(3195);final int sz = chrs.length;
        __CLR4_1_22eu2eul3lqxrot.R.inc(3196);for(int i=0; (((i<sz)&&(__CLR4_1_22eu2eul3lqxrot.R.iget(3197)!=0|true))||(__CLR4_1_22eu2eul3lqxrot.R.iget(3198)==0&false)); i++) {{
            __CLR4_1_22eu2eul3lqxrot.R.inc(3199);if((((chars.contains(chrs[i]) == expect)&&(__CLR4_1_22eu2eul3lqxrot.R.iget(3200)!=0|true))||(__CLR4_1_22eu2eul3lqxrot.R.iget(3201)==0&false))) {{
                __CLR4_1_22eu2eul3lqxrot.R.inc(3202);buffer.append(chrs[i]);
            }
        }}
        }__CLR4_1_22eu2eul3lqxrot.R.inc(3203);return buffer.toString();
    }finally{__CLR4_1_22eu2eul3lqxrot.R.flushNeeded();}}

    /** 
     * Determines whether or not all the Strings in an array are 
     * empty or not.
     *
     * @param strings String[] whose elements are being checked for emptiness
     * @return whether or not the String is empty
     */
    private static boolean deepEmpty(final String[] strings) {try{__CLR4_1_22eu2eul3lqxrot.R.inc(3204);
        __CLR4_1_22eu2eul3lqxrot.R.inc(3205);if ((((strings != null)&&(__CLR4_1_22eu2eul3lqxrot.R.iget(3206)!=0|true))||(__CLR4_1_22eu2eul3lqxrot.R.iget(3207)==0&false))) {{
            __CLR4_1_22eu2eul3lqxrot.R.inc(3208);for (final String s : strings) {{
                __CLR4_1_22eu2eul3lqxrot.R.inc(3209);if ((((StringUtils.isNotEmpty(s))&&(__CLR4_1_22eu2eul3lqxrot.R.iget(3210)!=0|true))||(__CLR4_1_22eu2eul3lqxrot.R.iget(3211)==0&false))) {{
                    __CLR4_1_22eu2eul3lqxrot.R.inc(3212);return false;
                }
            }}
        }}
        }__CLR4_1_22eu2eul3lqxrot.R.inc(3213);return true;
    }finally{__CLR4_1_22eu2eul3lqxrot.R.flushNeeded();}}
}
