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
 * <p>Operations on {@link java.lang.CharSequence} that are
 * {@code null} safe.</p>
 *
 * @see java.lang.CharSequence
 * @since 3.0
 * @version $Id$
 */
public class CharSequenceUtils {public static class __CLR4_1_22a52a5l3lqxro2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492827633L,8589935092L,3045,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * <p>{@code CharSequenceUtils} instances should NOT be constructed in
     * standard programming. </p>
     *
     * <p>This constructor is public to permit tools that require a JavaBean
     * instance to operate.</p>
     */
    public CharSequenceUtils() {
        super();__CLR4_1_22a52a5l3lqxro2.R.inc(2958);try{__CLR4_1_22a52a5l3lqxro2.R.inc(2957);
    }finally{__CLR4_1_22a52a5l3lqxro2.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * <p>Returns a new {@code CharSequence} that is a subsequence of this
     * sequence starting with the {@code char} value at the specified index.</p>
     *
     * <p>This provides the {@code CharSequence} equivalent to {@link String#substring(int)}.
     * The length (in {@code char}) of the returned sequence is {@code length() - start},
     * so if {@code start == end} then an empty sequence is returned.</p>
     *
     * @param cs  the specified subsequence, null returns null
     * @param start  the start index, inclusive, valid
     * @return a new subsequence, may be null
     * @throws IndexOutOfBoundsException if {@code start} is negative or if 
     *  {@code start} is greater than {@code length()}
     */
    public static CharSequence subSequence(final CharSequence cs, final int start) {try{__CLR4_1_22a52a5l3lqxro2.R.inc(2959);
        __CLR4_1_22a52a5l3lqxro2.R.inc(2960);return (((cs == null )&&(__CLR4_1_22a52a5l3lqxro2.R.iget(2961)!=0|true))||(__CLR4_1_22a52a5l3lqxro2.R.iget(2962)==0&false))? null : cs.subSequence(start, cs.length());
    }finally{__CLR4_1_22a52a5l3lqxro2.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * <p>Finds the first index in the {@code CharSequence} that matches the
     * specified character.</p>
     *
     * @param cs  the {@code CharSequence} to be processed, not null
     * @param searchChar  the char to be searched for
     * @param start  the start index, negative starts at the string start
     * @return the index where the search char was found, -1 if not found
     */
    static int indexOf(final CharSequence cs, final int searchChar, int start) {try{__CLR4_1_22a52a5l3lqxro2.R.inc(2963);
        __CLR4_1_22a52a5l3lqxro2.R.inc(2964);if ((((cs instanceof String)&&(__CLR4_1_22a52a5l3lqxro2.R.iget(2965)!=0|true))||(__CLR4_1_22a52a5l3lqxro2.R.iget(2966)==0&false))) {{
            __CLR4_1_22a52a5l3lqxro2.R.inc(2967);return ((String) cs).indexOf(searchChar, start);
        } }else {{
            __CLR4_1_22a52a5l3lqxro2.R.inc(2968);final int sz = cs.length();
            __CLR4_1_22a52a5l3lqxro2.R.inc(2969);if ((((start < 0)&&(__CLR4_1_22a52a5l3lqxro2.R.iget(2970)!=0|true))||(__CLR4_1_22a52a5l3lqxro2.R.iget(2971)==0&false))) {{
                __CLR4_1_22a52a5l3lqxro2.R.inc(2972);start = 0;
            }
            }__CLR4_1_22a52a5l3lqxro2.R.inc(2973);for (int i = start; (((i < sz)&&(__CLR4_1_22a52a5l3lqxro2.R.iget(2974)!=0|true))||(__CLR4_1_22a52a5l3lqxro2.R.iget(2975)==0&false)); i++) {{
                __CLR4_1_22a52a5l3lqxro2.R.inc(2976);if ((((cs.charAt(i) == searchChar)&&(__CLR4_1_22a52a5l3lqxro2.R.iget(2977)!=0|true))||(__CLR4_1_22a52a5l3lqxro2.R.iget(2978)==0&false))) {{
                    __CLR4_1_22a52a5l3lqxro2.R.inc(2979);return i;
                }
            }}
            }__CLR4_1_22a52a5l3lqxro2.R.inc(2980);return -1;
        }
    }}finally{__CLR4_1_22a52a5l3lqxro2.R.flushNeeded();}}

    /**
     * Used by the indexOf(CharSequence methods) as a green implementation of indexOf.
     *
     * @param cs the {@code CharSequence} to be processed
     * @param searchChar the {@code CharSequence} to be searched for
     * @param start the start index
     * @return the index where the search sequence was found
     */
    static int indexOf(final CharSequence cs, final CharSequence searchChar, final int start) {try{__CLR4_1_22a52a5l3lqxro2.R.inc(2981);
        __CLR4_1_22a52a5l3lqxro2.R.inc(2982);return cs.toString().indexOf(searchChar.toString(), start);
//        if (cs instanceof String && searchChar instanceof String) {
//            // TODO: Do we assume searchChar is usually relatively small;
//            //       If so then calling toString() on it is better than reverting to
//            //       the green implementation in the else block
//            return ((String) cs).indexOf((String) searchChar, start);
//        } else {
//            // TODO: Implement rather than convert to String
//            return cs.toString().indexOf(searchChar.toString(), start);
//        }
    }finally{__CLR4_1_22a52a5l3lqxro2.R.flushNeeded();}}

    /**
     * <p>Finds the last index in the {@code CharSequence} that matches the
     * specified character.</p>
     *
     * @param cs  the {@code CharSequence} to be processed
     * @param searchChar  the char to be searched for
     * @param start  the start index, negative returns -1, beyond length starts at end
     * @return the index where the search char was found, -1 if not found
     */
    static int lastIndexOf(final CharSequence cs, final int searchChar, int start) {try{__CLR4_1_22a52a5l3lqxro2.R.inc(2983);
        __CLR4_1_22a52a5l3lqxro2.R.inc(2984);if ((((cs instanceof String)&&(__CLR4_1_22a52a5l3lqxro2.R.iget(2985)!=0|true))||(__CLR4_1_22a52a5l3lqxro2.R.iget(2986)==0&false))) {{
            __CLR4_1_22a52a5l3lqxro2.R.inc(2987);return ((String) cs).lastIndexOf(searchChar, start);
        } }else {{
            __CLR4_1_22a52a5l3lqxro2.R.inc(2988);final int sz = cs.length();
            __CLR4_1_22a52a5l3lqxro2.R.inc(2989);if ((((start < 0)&&(__CLR4_1_22a52a5l3lqxro2.R.iget(2990)!=0|true))||(__CLR4_1_22a52a5l3lqxro2.R.iget(2991)==0&false))) {{
                __CLR4_1_22a52a5l3lqxro2.R.inc(2992);return -1;
            }
            }__CLR4_1_22a52a5l3lqxro2.R.inc(2993);if ((((start >= sz)&&(__CLR4_1_22a52a5l3lqxro2.R.iget(2994)!=0|true))||(__CLR4_1_22a52a5l3lqxro2.R.iget(2995)==0&false))) {{
                __CLR4_1_22a52a5l3lqxro2.R.inc(2996);start = sz - 1;
            }
            }__CLR4_1_22a52a5l3lqxro2.R.inc(2997);for (int i = start; (((i >= 0)&&(__CLR4_1_22a52a5l3lqxro2.R.iget(2998)!=0|true))||(__CLR4_1_22a52a5l3lqxro2.R.iget(2999)==0&false)); --i) {{
                __CLR4_1_22a52a5l3lqxro2.R.inc(3000);if ((((cs.charAt(i) == searchChar)&&(__CLR4_1_22a52a5l3lqxro2.R.iget(3001)!=0|true))||(__CLR4_1_22a52a5l3lqxro2.R.iget(3002)==0&false))) {{
                    __CLR4_1_22a52a5l3lqxro2.R.inc(3003);return i;
                }
            }}
            }__CLR4_1_22a52a5l3lqxro2.R.inc(3004);return -1;
        }
    }}finally{__CLR4_1_22a52a5l3lqxro2.R.flushNeeded();}}

    /**
     * Used by the lastIndexOf(CharSequence methods) as a green implementation of lastIndexOf
     *
     * @param cs the {@code CharSequence} to be processed
     * @param searchChar the {@code CharSequence} to be searched for
     * @param start the start index
     * @return the index where the search sequence was found
     */
    static int lastIndexOf(final CharSequence cs, final CharSequence searchChar, final int start) {try{__CLR4_1_22a52a5l3lqxro2.R.inc(3005);
        __CLR4_1_22a52a5l3lqxro2.R.inc(3006);return cs.toString().lastIndexOf(searchChar.toString(), start);
//        if (cs instanceof String && searchChar instanceof String) {
//            // TODO: Do we assume searchChar is usually relatively small;
//            //       If so then calling toString() on it is better than reverting to
//            //       the green implementation in the else block
//            return ((String) cs).lastIndexOf((String) searchChar, start);
//        } else {
//            // TODO: Implement rather than convert to String
//            return cs.toString().lastIndexOf(searchChar.toString(), start);
//        }
    }finally{__CLR4_1_22a52a5l3lqxro2.R.flushNeeded();}}

    /**
     * Green implementation of toCharArray.
     *
     * @param cs the {@code CharSequence} to be processed
     * @return the resulting char array
     */
    static char[] toCharArray(final CharSequence cs) {try{__CLR4_1_22a52a5l3lqxro2.R.inc(3007);
        __CLR4_1_22a52a5l3lqxro2.R.inc(3008);if ((((cs instanceof String)&&(__CLR4_1_22a52a5l3lqxro2.R.iget(3009)!=0|true))||(__CLR4_1_22a52a5l3lqxro2.R.iget(3010)==0&false))) {{
            __CLR4_1_22a52a5l3lqxro2.R.inc(3011);return ((String) cs).toCharArray();
        } }else {{
            __CLR4_1_22a52a5l3lqxro2.R.inc(3012);final int sz = cs.length();
            __CLR4_1_22a52a5l3lqxro2.R.inc(3013);final char[] array = new char[cs.length()];
            __CLR4_1_22a52a5l3lqxro2.R.inc(3014);for (int i = 0; (((i < sz)&&(__CLR4_1_22a52a5l3lqxro2.R.iget(3015)!=0|true))||(__CLR4_1_22a52a5l3lqxro2.R.iget(3016)==0&false)); i++) {{
                __CLR4_1_22a52a5l3lqxro2.R.inc(3017);array[i] = cs.charAt(i);
            }
            }__CLR4_1_22a52a5l3lqxro2.R.inc(3018);return array;
        }
    }}finally{__CLR4_1_22a52a5l3lqxro2.R.flushNeeded();}}

    /**
     * Green implementation of regionMatches.
     *
     * @param cs the {@code CharSequence} to be processed
     * @param ignoreCase whether or not to be case insensitive
     * @param thisStart the index to start on the {@code cs} CharSequence
     * @param substring the {@code CharSequence} to be looked for
     * @param start the index to start on the {@code substring} CharSequence
     * @param length character length of the region
     * @return whether the region matched
     */
    static boolean regionMatches(final CharSequence cs, final boolean ignoreCase, final int thisStart,
            final CharSequence substring, final int start, final int length)    {try{__CLR4_1_22a52a5l3lqxro2.R.inc(3019);
        __CLR4_1_22a52a5l3lqxro2.R.inc(3020);if ((((cs instanceof String && substring instanceof String)&&(__CLR4_1_22a52a5l3lqxro2.R.iget(3021)!=0|true))||(__CLR4_1_22a52a5l3lqxro2.R.iget(3022)==0&false))) {{
            __CLR4_1_22a52a5l3lqxro2.R.inc(3023);return ((String) cs).regionMatches(ignoreCase, thisStart, (String) substring, start, length);
        } }else {{
            __CLR4_1_22a52a5l3lqxro2.R.inc(3024);int index1 = thisStart;
            __CLR4_1_22a52a5l3lqxro2.R.inc(3025);int index2 = start;
            __CLR4_1_22a52a5l3lqxro2.R.inc(3026);int tmpLen = length;

            __CLR4_1_22a52a5l3lqxro2.R.inc(3027);while ((((tmpLen-- > 0)&&(__CLR4_1_22a52a5l3lqxro2.R.iget(3028)!=0|true))||(__CLR4_1_22a52a5l3lqxro2.R.iget(3029)==0&false))) {{
                __CLR4_1_22a52a5l3lqxro2.R.inc(3030);char c1 = cs.charAt(index1++);
                __CLR4_1_22a52a5l3lqxro2.R.inc(3031);char c2 = substring.charAt(index2++);

                __CLR4_1_22a52a5l3lqxro2.R.inc(3032);if ((((c1 == c2)&&(__CLR4_1_22a52a5l3lqxro2.R.iget(3033)!=0|true))||(__CLR4_1_22a52a5l3lqxro2.R.iget(3034)==0&false))) {{
                    __CLR4_1_22a52a5l3lqxro2.R.inc(3035);continue;
                }

                }__CLR4_1_22a52a5l3lqxro2.R.inc(3036);if ((((!ignoreCase)&&(__CLR4_1_22a52a5l3lqxro2.R.iget(3037)!=0|true))||(__CLR4_1_22a52a5l3lqxro2.R.iget(3038)==0&false))) {{
                    __CLR4_1_22a52a5l3lqxro2.R.inc(3039);return false;
                }

                // The same check as in String.regionMatches():
                }__CLR4_1_22a52a5l3lqxro2.R.inc(3040);if ((((Character.toUpperCase(c1) != Character.toUpperCase(c2)
                        && Character.toLowerCase(c1) != Character.toLowerCase(c2))&&(__CLR4_1_22a52a5l3lqxro2.R.iget(3041)!=0|true))||(__CLR4_1_22a52a5l3lqxro2.R.iget(3042)==0&false))) {{
                    __CLR4_1_22a52a5l3lqxro2.R.inc(3043);return false;
                }
            }}

            }__CLR4_1_22a52a5l3lqxro2.R.inc(3044);return true;
        }
    }}finally{__CLR4_1_22a52a5l3lqxro2.R.flushNeeded();}}
}
