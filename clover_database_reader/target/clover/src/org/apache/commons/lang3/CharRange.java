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

import java.io.Serializable;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * <p>A contiguous range of characters, optionally negated.</p>
 * 
 * <p>Instances are immutable.</p>
 *
 * <p>#ThreadSafe#</p>
 * @since 1.0
 * @version $Id$
 */
// TODO: This is no longer public and will be removed later as CharSet is moved 
// to depend on Range.
final class CharRange implements Iterable<Character>, Serializable {public static class __CLR4_1_226k26kl3lqxrno{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492827633L,8589935092L,2957,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Required for serialization support. Lang version 2.0. 
     * 
     * @see java.io.Serializable
     */
    private static final long serialVersionUID = 8270183163158333422L;
    
    /** The first character, inclusive, in the range. */
    private final char start;
    /** The last character, inclusive, in the range. */
    private final char end;
    /** True if the range is everything except the characters specified. */
    private final boolean negated;
    
    /** Cached toString. */
    private transient String iToString;

    /**
     * <p>Constructs a {@code CharRange} over a set of characters,
     * optionally negating the range.</p>
     *
     * <p>A negated range includes everything except that defined by the
     * start and end characters.</p>
     * 
     * <p>If start and end are in the wrong order, they are reversed.
     * Thus {@code a-e} is the same as {@code e-a}.</p>
     *
     * @param start  first character, inclusive, in this range
     * @param end  last character, inclusive, in this range
     * @param negated  true to express everything except the range
     */
    private CharRange(char start, char end, final boolean negated) {
        super();__CLR4_1_226k26kl3lqxrno.R.inc(2829);try{__CLR4_1_226k26kl3lqxrno.R.inc(2828);
        __CLR4_1_226k26kl3lqxrno.R.inc(2830);if ((((start > end)&&(__CLR4_1_226k26kl3lqxrno.R.iget(2831)!=0|true))||(__CLR4_1_226k26kl3lqxrno.R.iget(2832)==0&false))) {{
            __CLR4_1_226k26kl3lqxrno.R.inc(2833);final char temp = start;
            __CLR4_1_226k26kl3lqxrno.R.inc(2834);start = end;
            __CLR4_1_226k26kl3lqxrno.R.inc(2835);end = temp;
        }
        
        }__CLR4_1_226k26kl3lqxrno.R.inc(2836);this.start = start;
        __CLR4_1_226k26kl3lqxrno.R.inc(2837);this.end = end;
        __CLR4_1_226k26kl3lqxrno.R.inc(2838);this.negated = negated;
    }finally{__CLR4_1_226k26kl3lqxrno.R.flushNeeded();}}

    /**
     * <p>Constructs a {@code CharRange} over a single character.</p>
     *
     * @param ch  only character in this range
     * @return the new CharRange object
     * @see CharRange#CharRange(char, char, boolean)
     * @since 2.5
     */
    public static CharRange is(final char ch) {try{__CLR4_1_226k26kl3lqxrno.R.inc(2839);
        __CLR4_1_226k26kl3lqxrno.R.inc(2840);return new CharRange(ch, ch, false);
    }finally{__CLR4_1_226k26kl3lqxrno.R.flushNeeded();}}

    /**
     * <p>Constructs a negated {@code CharRange} over a single character.</p>
     *
     * @param ch  only character in this range
     * @return the new CharRange object
     * @see CharRange#CharRange(char, char, boolean)
     * @since 2.5
     */
    public static CharRange isNot(final char ch) {try{__CLR4_1_226k26kl3lqxrno.R.inc(2841);
        __CLR4_1_226k26kl3lqxrno.R.inc(2842);return new CharRange(ch, ch, true);
    }finally{__CLR4_1_226k26kl3lqxrno.R.flushNeeded();}}

    /**
     * <p>Constructs a {@code CharRange} over a set of characters.</p>
     *
     * @param start  first character, inclusive, in this range
     * @param end  last character, inclusive, in this range
     * @return the new CharRange object
     * @see CharRange#CharRange(char, char, boolean)
     * @since 2.5
     */
    public static CharRange isIn(final char start, final char end) {try{__CLR4_1_226k26kl3lqxrno.R.inc(2843);
        __CLR4_1_226k26kl3lqxrno.R.inc(2844);return new CharRange(start, end, false);
    }finally{__CLR4_1_226k26kl3lqxrno.R.flushNeeded();}}

    /**
     * <p>Constructs a negated {@code CharRange} over a set of characters.</p>
     *
     * @param start  first character, inclusive, in this range
     * @param end  last character, inclusive, in this range
     * @return the new CharRange object
     * @see CharRange#CharRange(char, char, boolean)
     * @since 2.5
     */
    public static CharRange isNotIn(final char start, final char end) {try{__CLR4_1_226k26kl3lqxrno.R.inc(2845);
        __CLR4_1_226k26kl3lqxrno.R.inc(2846);return new CharRange(start, end, true);
    }finally{__CLR4_1_226k26kl3lqxrno.R.flushNeeded();}}

    // Accessors
    //-----------------------------------------------------------------------
    /**
     * <p>Gets the start character for this character range.</p>
     * 
     * @return the start char (inclusive)
     */
    public char getStart() {try{__CLR4_1_226k26kl3lqxrno.R.inc(2847);
        __CLR4_1_226k26kl3lqxrno.R.inc(2848);return this.start;
    }finally{__CLR4_1_226k26kl3lqxrno.R.flushNeeded();}}

    /**
     * <p>Gets the end character for this character range.</p>
     * 
     * @return the end char (inclusive)
     */
    public char getEnd() {try{__CLR4_1_226k26kl3lqxrno.R.inc(2849);
        __CLR4_1_226k26kl3lqxrno.R.inc(2850);return this.end;
    }finally{__CLR4_1_226k26kl3lqxrno.R.flushNeeded();}}

    /**
     * <p>Is this {@code CharRange} negated.</p>
     * 
     * <p>A negated range includes everything except that defined by the
     * start and end characters.</p>
     *
     * @return {@code true} if negated
     */
    public boolean isNegated() {try{__CLR4_1_226k26kl3lqxrno.R.inc(2851);
        __CLR4_1_226k26kl3lqxrno.R.inc(2852);return negated;
    }finally{__CLR4_1_226k26kl3lqxrno.R.flushNeeded();}}

    // Contains
    //-----------------------------------------------------------------------
    /**
     * <p>Is the character specified contained in this range.</p>
     *
     * @param ch  the character to check
     * @return {@code true} if this range contains the input character
     */
    public boolean contains(final char ch) {try{__CLR4_1_226k26kl3lqxrno.R.inc(2853);
        __CLR4_1_226k26kl3lqxrno.R.inc(2854);return (ch >= start && ch <= end) != negated;
    }finally{__CLR4_1_226k26kl3lqxrno.R.flushNeeded();}}

    /**
     * <p>Are all the characters of the passed in range contained in
     * this range.</p>
     *
     * @param range  the range to check against
     * @return {@code true} if this range entirely contains the input range
     * @throws IllegalArgumentException if {@code null} input
     */
    public boolean contains(final CharRange range) {try{__CLR4_1_226k26kl3lqxrno.R.inc(2855);
        __CLR4_1_226k26kl3lqxrno.R.inc(2856);if ((((range == null)&&(__CLR4_1_226k26kl3lqxrno.R.iget(2857)!=0|true))||(__CLR4_1_226k26kl3lqxrno.R.iget(2858)==0&false))) {{
            __CLR4_1_226k26kl3lqxrno.R.inc(2859);throw new IllegalArgumentException("The Range must not be null");
        }
        }__CLR4_1_226k26kl3lqxrno.R.inc(2860);if ((((negated)&&(__CLR4_1_226k26kl3lqxrno.R.iget(2861)!=0|true))||(__CLR4_1_226k26kl3lqxrno.R.iget(2862)==0&false))) {{
            __CLR4_1_226k26kl3lqxrno.R.inc(2863);if ((((range.negated)&&(__CLR4_1_226k26kl3lqxrno.R.iget(2864)!=0|true))||(__CLR4_1_226k26kl3lqxrno.R.iget(2865)==0&false))) {{
                __CLR4_1_226k26kl3lqxrno.R.inc(2866);return start >= range.start && end <= range.end;
            }
            }__CLR4_1_226k26kl3lqxrno.R.inc(2867);return range.end < start || range.start > end;
        }
        }__CLR4_1_226k26kl3lqxrno.R.inc(2868);if ((((range.negated)&&(__CLR4_1_226k26kl3lqxrno.R.iget(2869)!=0|true))||(__CLR4_1_226k26kl3lqxrno.R.iget(2870)==0&false))) {{
            __CLR4_1_226k26kl3lqxrno.R.inc(2871);return start == 0 && end == Character.MAX_VALUE;
        }
        }__CLR4_1_226k26kl3lqxrno.R.inc(2872);return start <= range.start && end >= range.end;
    }finally{__CLR4_1_226k26kl3lqxrno.R.flushNeeded();}}

    // Basics
    //-----------------------------------------------------------------------
    /**
     * <p>Compares two CharRange objects, returning true if they represent
     * exactly the same range of characters defined in the same way.</p>
     * 
     * @param obj  the object to compare to
     * @return true if equal
     */
    @Override
    public boolean equals(final Object obj) {try{__CLR4_1_226k26kl3lqxrno.R.inc(2873);
        __CLR4_1_226k26kl3lqxrno.R.inc(2874);if ((((obj == this)&&(__CLR4_1_226k26kl3lqxrno.R.iget(2875)!=0|true))||(__CLR4_1_226k26kl3lqxrno.R.iget(2876)==0&false))) {{
            __CLR4_1_226k26kl3lqxrno.R.inc(2877);return true;
        }
        }__CLR4_1_226k26kl3lqxrno.R.inc(2878);if ((((obj instanceof CharRange == false)&&(__CLR4_1_226k26kl3lqxrno.R.iget(2879)!=0|true))||(__CLR4_1_226k26kl3lqxrno.R.iget(2880)==0&false))) {{
            __CLR4_1_226k26kl3lqxrno.R.inc(2881);return false;
        }
        }__CLR4_1_226k26kl3lqxrno.R.inc(2882);final CharRange other = (CharRange) obj;
        __CLR4_1_226k26kl3lqxrno.R.inc(2883);return start == other.start && end == other.end && negated == other.negated;
    }finally{__CLR4_1_226k26kl3lqxrno.R.flushNeeded();}}

    /**
     * <p>Gets a hashCode compatible with the equals method.</p>
     * 
     * @return a suitable hashCode
     */
    @Override
    public int hashCode() {try{__CLR4_1_226k26kl3lqxrno.R.inc(2884);
        __CLR4_1_226k26kl3lqxrno.R.inc(2885);return 83 + start + 7 * end + ((((negated )&&(__CLR4_1_226k26kl3lqxrno.R.iget(2886)!=0|true))||(__CLR4_1_226k26kl3lqxrno.R.iget(2887)==0&false))? 1 : 0);
    }finally{__CLR4_1_226k26kl3lqxrno.R.flushNeeded();}}
    
    /**
     * <p>Gets a string representation of the character range.</p>
     * 
     * @return string representation of this range
     */
    @Override
    public String toString() {try{__CLR4_1_226k26kl3lqxrno.R.inc(2888);
        __CLR4_1_226k26kl3lqxrno.R.inc(2889);if ((((iToString == null)&&(__CLR4_1_226k26kl3lqxrno.R.iget(2890)!=0|true))||(__CLR4_1_226k26kl3lqxrno.R.iget(2891)==0&false))) {{
            __CLR4_1_226k26kl3lqxrno.R.inc(2892);final StringBuilder buf = new StringBuilder(4);
            __CLR4_1_226k26kl3lqxrno.R.inc(2893);if ((((isNegated())&&(__CLR4_1_226k26kl3lqxrno.R.iget(2894)!=0|true))||(__CLR4_1_226k26kl3lqxrno.R.iget(2895)==0&false))) {{
                __CLR4_1_226k26kl3lqxrno.R.inc(2896);buf.append('^');
            }
            }__CLR4_1_226k26kl3lqxrno.R.inc(2897);buf.append(start);
            __CLR4_1_226k26kl3lqxrno.R.inc(2898);if ((((start != end)&&(__CLR4_1_226k26kl3lqxrno.R.iget(2899)!=0|true))||(__CLR4_1_226k26kl3lqxrno.R.iget(2900)==0&false))) {{
                __CLR4_1_226k26kl3lqxrno.R.inc(2901);buf.append('-');
                __CLR4_1_226k26kl3lqxrno.R.inc(2902);buf.append(end);
            }
            }__CLR4_1_226k26kl3lqxrno.R.inc(2903);iToString = buf.toString();
        }
        }__CLR4_1_226k26kl3lqxrno.R.inc(2904);return iToString;
    }finally{__CLR4_1_226k26kl3lqxrno.R.flushNeeded();}}

    // Expansions
    //-----------------------------------------------------------------------
    /**
     * <p>Returns an iterator which can be used to walk through the characters described by this range.</p>
     *
     * <p>#NotThreadSafe# the iterator is not thread-safe</p>
     * @return an iterator to the chars represented by this range
     * @since 2.5
     */
    @Override
    public Iterator<Character> iterator() {try{__CLR4_1_226k26kl3lqxrno.R.inc(2905);
        __CLR4_1_226k26kl3lqxrno.R.inc(2906);return new CharacterIterator(this);
    }finally{__CLR4_1_226k26kl3lqxrno.R.flushNeeded();}}

    /**
     * Character {@link Iterator}.
     * <p>#NotThreadSafe#</p>
     */
    private static class CharacterIterator implements Iterator<Character> {
        /** The current character */
        private char current;

        private final CharRange range;
        private boolean hasNext;

        /**
         * Construct a new iterator for the character range.
         *
         * @param r The character range
         */
        private CharacterIterator(final CharRange r) {try{__CLR4_1_226k26kl3lqxrno.R.inc(2907);
            __CLR4_1_226k26kl3lqxrno.R.inc(2908);range = r;
            __CLR4_1_226k26kl3lqxrno.R.inc(2909);hasNext = true;

            __CLR4_1_226k26kl3lqxrno.R.inc(2910);if ((((range.negated)&&(__CLR4_1_226k26kl3lqxrno.R.iget(2911)!=0|true))||(__CLR4_1_226k26kl3lqxrno.R.iget(2912)==0&false))) {{
                __CLR4_1_226k26kl3lqxrno.R.inc(2913);if ((((range.start == 0)&&(__CLR4_1_226k26kl3lqxrno.R.iget(2914)!=0|true))||(__CLR4_1_226k26kl3lqxrno.R.iget(2915)==0&false))) {{
                    __CLR4_1_226k26kl3lqxrno.R.inc(2916);if ((((range.end == Character.MAX_VALUE)&&(__CLR4_1_226k26kl3lqxrno.R.iget(2917)!=0|true))||(__CLR4_1_226k26kl3lqxrno.R.iget(2918)==0&false))) {{
                        // This range is an empty set
                        __CLR4_1_226k26kl3lqxrno.R.inc(2919);hasNext = false;
                    } }else {{
                        __CLR4_1_226k26kl3lqxrno.R.inc(2920);current = (char) (range.end + 1);
                    }
                }} }else {{
                    __CLR4_1_226k26kl3lqxrno.R.inc(2921);current = 0;
                }
            }} }else {{
                __CLR4_1_226k26kl3lqxrno.R.inc(2922);current = range.start;
            }
        }}finally{__CLR4_1_226k26kl3lqxrno.R.flushNeeded();}}

        /**
         * Prepare the next character in the range.
         */
        private void prepareNext() {try{__CLR4_1_226k26kl3lqxrno.R.inc(2923);
            __CLR4_1_226k26kl3lqxrno.R.inc(2924);if ((((range.negated)&&(__CLR4_1_226k26kl3lqxrno.R.iget(2925)!=0|true))||(__CLR4_1_226k26kl3lqxrno.R.iget(2926)==0&false))) {{
                __CLR4_1_226k26kl3lqxrno.R.inc(2927);if ((((current == Character.MAX_VALUE)&&(__CLR4_1_226k26kl3lqxrno.R.iget(2928)!=0|true))||(__CLR4_1_226k26kl3lqxrno.R.iget(2929)==0&false))) {{
                    __CLR4_1_226k26kl3lqxrno.R.inc(2930);hasNext = false;
                } }else {__CLR4_1_226k26kl3lqxrno.R.inc(2931);if ((((current + 1 == range.start)&&(__CLR4_1_226k26kl3lqxrno.R.iget(2932)!=0|true))||(__CLR4_1_226k26kl3lqxrno.R.iget(2933)==0&false))) {{
                    __CLR4_1_226k26kl3lqxrno.R.inc(2934);if ((((range.end == Character.MAX_VALUE)&&(__CLR4_1_226k26kl3lqxrno.R.iget(2935)!=0|true))||(__CLR4_1_226k26kl3lqxrno.R.iget(2936)==0&false))) {{
                        __CLR4_1_226k26kl3lqxrno.R.inc(2937);hasNext = false;
                    } }else {{
                        __CLR4_1_226k26kl3lqxrno.R.inc(2938);current = (char) (range.end + 1);
                    }
                }} }else {{
                    __CLR4_1_226k26kl3lqxrno.R.inc(2939);current = (char) (current + 1);
                }
            }}} }else {__CLR4_1_226k26kl3lqxrno.R.inc(2940);if ((((current < range.end)&&(__CLR4_1_226k26kl3lqxrno.R.iget(2941)!=0|true))||(__CLR4_1_226k26kl3lqxrno.R.iget(2942)==0&false))) {{
                __CLR4_1_226k26kl3lqxrno.R.inc(2943);current = (char) (current + 1);
            } }else {{
                __CLR4_1_226k26kl3lqxrno.R.inc(2944);hasNext = false;
            }
        }}}finally{__CLR4_1_226k26kl3lqxrno.R.flushNeeded();}}

        /**
         * Has the iterator not reached the end character yet?
         *
         * @return {@code true} if the iterator has yet to reach the character date
         */
        @Override
        public boolean hasNext() {try{__CLR4_1_226k26kl3lqxrno.R.inc(2945);
            __CLR4_1_226k26kl3lqxrno.R.inc(2946);return hasNext;
        }finally{__CLR4_1_226k26kl3lqxrno.R.flushNeeded();}}

        /**
         * Return the next character in the iteration
         *
         * @return {@code Character} for the next character
         */
        @Override
        public Character next() {try{__CLR4_1_226k26kl3lqxrno.R.inc(2947);
            __CLR4_1_226k26kl3lqxrno.R.inc(2948);if ((((hasNext == false)&&(__CLR4_1_226k26kl3lqxrno.R.iget(2949)!=0|true))||(__CLR4_1_226k26kl3lqxrno.R.iget(2950)==0&false))) {{
                __CLR4_1_226k26kl3lqxrno.R.inc(2951);throw new NoSuchElementException();
            }
            }__CLR4_1_226k26kl3lqxrno.R.inc(2952);final char cur = current;
            __CLR4_1_226k26kl3lqxrno.R.inc(2953);prepareNext();
            __CLR4_1_226k26kl3lqxrno.R.inc(2954);return Character.valueOf(cur);
        }finally{__CLR4_1_226k26kl3lqxrno.R.flushNeeded();}}

        /**
         * Always throws UnsupportedOperationException.
         *
         * @throws UnsupportedOperationException
         * @see java.util.Iterator#remove()
         */
        @Override
        public void remove() {try{__CLR4_1_226k26kl3lqxrno.R.inc(2955);
            __CLR4_1_226k26kl3lqxrno.R.inc(2956);throw new UnsupportedOperationException();
        }finally{__CLR4_1_226k26kl3lqxrno.R.flushNeeded();}}
    }
}
