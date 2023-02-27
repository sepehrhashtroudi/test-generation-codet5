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

import org.apache.commons.lang3.math.NumberUtils;

/**
 * <p>Operations on boolean primitives and Boolean objects.</p>
 *
 * <p>This class tries to handle {@code null} input gracefully.
 * An exception will not be thrown for a {@code null} input.
 * Each method documents its behaviour in more detail.</p>
 *
 * <p>#ThreadSafe#</p>
 * @since 2.0
 * @version $Id$
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class BooleanUtils {public static class __CLR4_1_21vf1vfl3lqxrmt{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492827633L,8589935092L,2820,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * <p>{@code BooleanUtils} instances should NOT be constructed in standard programming.
     * Instead, the class should be used as {@code BooleanUtils.negate(true);}.</p>
     *
     * <p>This constructor is public to permit tools that require a JavaBean instance
     * to operate.</p>
     */
    public BooleanUtils() {
      super();__CLR4_1_21vf1vfl3lqxrmt.R.inc(2428);try{__CLR4_1_21vf1vfl3lqxrmt.R.inc(2427);
    }finally{__CLR4_1_21vf1vfl3lqxrmt.R.flushNeeded();}}

    // Boolean utilities
    //--------------------------------------------------------------------------
    /**
     * <p>Negates the specified boolean.</p>
     *
     * <p>If {@code null} is passed in, {@code null} will be returned.</p>
     *
     * <p>NOTE: This returns null and will throw a NullPointerException if autoboxed to a boolean. </p>
     *
     * <pre>
     *   BooleanUtils.negate(Boolean.TRUE)  = Boolean.FALSE;
     *   BooleanUtils.negate(Boolean.FALSE) = Boolean.TRUE;
     *   BooleanUtils.negate(null)          = null;
     * </pre>
     *
     * @param bool  the Boolean to negate, may be null
     * @return the negated Boolean, or {@code null} if {@code null} input
     */
    public static Boolean negate(final Boolean bool) {try{__CLR4_1_21vf1vfl3lqxrmt.R.inc(2429);
        __CLR4_1_21vf1vfl3lqxrmt.R.inc(2430);if ((((bool == null)&&(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2431)!=0|true))||(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2432)==0&false))) {{
            __CLR4_1_21vf1vfl3lqxrmt.R.inc(2433);return null;
        }
        }__CLR4_1_21vf1vfl3lqxrmt.R.inc(2434);return (((bool.booleanValue() )&&(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2435)!=0|true))||(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2436)==0&false))? Boolean.FALSE : Boolean.TRUE;
    }finally{__CLR4_1_21vf1vfl3lqxrmt.R.flushNeeded();}}

    // boolean Boolean methods
    //-----------------------------------------------------------------------
    /**
     * <p>Checks if a {@code Boolean} value is {@code true},
     * handling {@code null} by returning {@code false}.</p>
     *
     * <pre>
     *   BooleanUtils.isTrue(Boolean.TRUE)  = true
     *   BooleanUtils.isTrue(Boolean.FALSE) = false
     *   BooleanUtils.isTrue(null)          = false
     * </pre>
     *
     * @param bool  the boolean to check, null returns {@code false}
     * @return {@code true} only if the input is non-null and true
     * @since 2.1
     */
    public static boolean isTrue(final Boolean bool) {try{__CLR4_1_21vf1vfl3lqxrmt.R.inc(2437);
        __CLR4_1_21vf1vfl3lqxrmt.R.inc(2438);return Boolean.TRUE.equals(bool);
    }finally{__CLR4_1_21vf1vfl3lqxrmt.R.flushNeeded();}}

    /**
     * <p>Checks if a {@code Boolean} value is <i>not</i> {@code true},
     * handling {@code null} by returning {@code true}.</p>
     *
     * <pre>
     *   BooleanUtils.isNotTrue(Boolean.TRUE)  = false
     *   BooleanUtils.isNotTrue(Boolean.FALSE) = true
     *   BooleanUtils.isNotTrue(null)          = true
     * </pre>
     *
     * @param bool  the boolean to check, null returns {@code true}
     * @return {@code true} if the input is null or false
     * @since 2.3
     */
    public static boolean isNotTrue(final Boolean bool) {try{__CLR4_1_21vf1vfl3lqxrmt.R.inc(2439);
        __CLR4_1_21vf1vfl3lqxrmt.R.inc(2440);return !isTrue(bool);
    }finally{__CLR4_1_21vf1vfl3lqxrmt.R.flushNeeded();}}

    /**
     * <p>Checks if a {@code Boolean} value is {@code false},
     * handling {@code null} by returning {@code false}.</p>
     *
     * <pre>
     *   BooleanUtils.isFalse(Boolean.TRUE)  = false
     *   BooleanUtils.isFalse(Boolean.FALSE) = true
     *   BooleanUtils.isFalse(null)          = false
     * </pre>
     *
     * @param bool  the boolean to check, null returns {@code false}
     * @return {@code true} only if the input is non-null and false
     * @since 2.1
     */
    public static boolean isFalse(final Boolean bool) {try{__CLR4_1_21vf1vfl3lqxrmt.R.inc(2441);
        __CLR4_1_21vf1vfl3lqxrmt.R.inc(2442);return Boolean.FALSE.equals(bool);
    }finally{__CLR4_1_21vf1vfl3lqxrmt.R.flushNeeded();}}

    /**
     * <p>Checks if a {@code Boolean} value is <i>not</i> {@code false},
     * handling {@code null} by returning {@code true}.</p>
     *
     * <pre>
     *   BooleanUtils.isNotFalse(Boolean.TRUE)  = true
     *   BooleanUtils.isNotFalse(Boolean.FALSE) = false
     *   BooleanUtils.isNotFalse(null)          = true
     * </pre>
     *
     * @param bool  the boolean to check, null returns {@code true}
     * @return {@code true} if the input is null or true
     * @since 2.3
     */
    public static boolean isNotFalse(final Boolean bool) {try{__CLR4_1_21vf1vfl3lqxrmt.R.inc(2443);
        __CLR4_1_21vf1vfl3lqxrmt.R.inc(2444);return !isFalse(bool);
    }finally{__CLR4_1_21vf1vfl3lqxrmt.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * <p>Converts a Boolean to a boolean handling {@code null}
     * by returning {@code false}.</p>
     *
     * <pre>
     *   BooleanUtils.toBoolean(Boolean.TRUE)  = true
     *   BooleanUtils.toBoolean(Boolean.FALSE) = false
     *   BooleanUtils.toBoolean(null)          = false
     * </pre>
     *
     * @param bool  the boolean to convert
     * @return {@code true} or {@code false}, {@code null} returns {@code false}
     */
    public static boolean toBoolean(final Boolean bool) {try{__CLR4_1_21vf1vfl3lqxrmt.R.inc(2445);
        __CLR4_1_21vf1vfl3lqxrmt.R.inc(2446);return bool != null && bool.booleanValue();
    }finally{__CLR4_1_21vf1vfl3lqxrmt.R.flushNeeded();}}

    /**
     * <p>Converts a Boolean to a boolean handling {@code null}.</p>
     *
     * <pre>
     *   BooleanUtils.toBooleanDefaultIfNull(Boolean.TRUE, false) = true
     *   BooleanUtils.toBooleanDefaultIfNull(Boolean.FALSE, true) = false
     *   BooleanUtils.toBooleanDefaultIfNull(null, true)          = true
     * </pre>
     *
     * @param bool  the boolean to convert
     * @param valueIfNull  the boolean value to return if {@code null}
     * @return {@code true} or {@code false}
     */
    public static boolean toBooleanDefaultIfNull(final Boolean bool, final boolean valueIfNull) {try{__CLR4_1_21vf1vfl3lqxrmt.R.inc(2447);
        __CLR4_1_21vf1vfl3lqxrmt.R.inc(2448);if ((((bool == null)&&(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2449)!=0|true))||(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2450)==0&false))) {{
            __CLR4_1_21vf1vfl3lqxrmt.R.inc(2451);return valueIfNull;
        }
        }__CLR4_1_21vf1vfl3lqxrmt.R.inc(2452);return bool.booleanValue();
    }finally{__CLR4_1_21vf1vfl3lqxrmt.R.flushNeeded();}}

    // Integer to Boolean methods
    //-----------------------------------------------------------------------
    /**
     * <p>Converts an int to a boolean using the convention that {@code zero}
     * is {@code false}.</p>
     *
     * <pre>
     *   BooleanUtils.toBoolean(0) = false
     *   BooleanUtils.toBoolean(1) = true
     *   BooleanUtils.toBoolean(2) = true
     * </pre>
     *
     * @param value  the int to convert
     * @return {@code true} if non-zero, {@code false}
     *  if zero
     */
    public static boolean toBoolean(final int value) {try{__CLR4_1_21vf1vfl3lqxrmt.R.inc(2453);
        __CLR4_1_21vf1vfl3lqxrmt.R.inc(2454);return value != 0;
    }finally{__CLR4_1_21vf1vfl3lqxrmt.R.flushNeeded();}}

    /**
     * <p>Converts an int to a Boolean using the convention that {@code zero}
     * is {@code false}.</p>
     *
     * <pre>
     *   BooleanUtils.toBoolean(0) = Boolean.FALSE
     *   BooleanUtils.toBoolean(1) = Boolean.TRUE
     *   BooleanUtils.toBoolean(2) = Boolean.TRUE
     * </pre>
     *
     * @param value  the int to convert
     * @return Boolean.TRUE if non-zero, Boolean.FALSE if zero,
     *  {@code null} if {@code null}
     */
    public static Boolean toBooleanObject(final int value) {try{__CLR4_1_21vf1vfl3lqxrmt.R.inc(2455);
        __CLR4_1_21vf1vfl3lqxrmt.R.inc(2456);return (((value == 0 )&&(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2457)!=0|true))||(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2458)==0&false))? Boolean.FALSE : Boolean.TRUE;
    }finally{__CLR4_1_21vf1vfl3lqxrmt.R.flushNeeded();}}

    /**
     * <p>Converts an Integer to a Boolean using the convention that {@code zero}
     * is {@code false}.</p>
     *
     * <p>{@code null} will be converted to {@code null}.</p>
     *
     * <p>NOTE: This returns null and will throw a NullPointerException if autoboxed to a boolean. </p>
     *
     * <pre>
     *   BooleanUtils.toBoolean(Integer.valueOf(0))    = Boolean.FALSE
     *   BooleanUtils.toBoolean(Integer.valueOf(1))    = Boolean.TRUE
     *   BooleanUtils.toBoolean(Integer.valueOf(null)) = null
     * </pre>
     *
     * @param value  the Integer to convert
     * @return Boolean.TRUE if non-zero, Boolean.FALSE if zero,
     *  {@code null} if {@code null} input
     */
    public static Boolean toBooleanObject(final Integer value) {try{__CLR4_1_21vf1vfl3lqxrmt.R.inc(2459);
        __CLR4_1_21vf1vfl3lqxrmt.R.inc(2460);if ((((value == null)&&(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2461)!=0|true))||(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2462)==0&false))) {{
            __CLR4_1_21vf1vfl3lqxrmt.R.inc(2463);return null;
        }
        }__CLR4_1_21vf1vfl3lqxrmt.R.inc(2464);return (((value.intValue() == 0 )&&(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2465)!=0|true))||(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2466)==0&false))? Boolean.FALSE : Boolean.TRUE;
    }finally{__CLR4_1_21vf1vfl3lqxrmt.R.flushNeeded();}}

    /**
     * <p>Converts an int to a boolean specifying the conversion values.</p>
     *
     * <pre>
     *   BooleanUtils.toBoolean(0, 1, 0) = false
     *   BooleanUtils.toBoolean(1, 1, 0) = true
     *   BooleanUtils.toBoolean(2, 1, 2) = false
     *   BooleanUtils.toBoolean(2, 2, 0) = true
     * </pre>
     *
     * @param value  the Integer to convert
     * @param trueValue  the value to match for {@code true}
     * @param falseValue  the value to match for {@code false}
     * @return {@code true} or {@code false}
     * @throws IllegalArgumentException if no match
     */
    public static boolean toBoolean(final int value, final int trueValue, final int falseValue) {try{__CLR4_1_21vf1vfl3lqxrmt.R.inc(2467);
        __CLR4_1_21vf1vfl3lqxrmt.R.inc(2468);if ((((value == trueValue)&&(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2469)!=0|true))||(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2470)==0&false))) {{
            __CLR4_1_21vf1vfl3lqxrmt.R.inc(2471);return true;
        }
        }__CLR4_1_21vf1vfl3lqxrmt.R.inc(2472);if ((((value == falseValue)&&(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2473)!=0|true))||(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2474)==0&false))) {{
            __CLR4_1_21vf1vfl3lqxrmt.R.inc(2475);return false;
        }
        // no match
        }__CLR4_1_21vf1vfl3lqxrmt.R.inc(2476);throw new IllegalArgumentException("The Integer did not match either specified value");
    }finally{__CLR4_1_21vf1vfl3lqxrmt.R.flushNeeded();}}

    /**
     * <p>Converts an Integer to a boolean specifying the conversion values.</p>
     *
     * <pre>
     *   BooleanUtils.toBoolean(Integer.valueOf(0), Integer.valueOf(1), Integer.valueOf(0)) = false
     *   BooleanUtils.toBoolean(Integer.valueOf(1), Integer.valueOf(1), Integer.valueOf(0)) = true
     *   BooleanUtils.toBoolean(Integer.valueOf(2), Integer.valueOf(1), Integer.valueOf(2)) = false
     *   BooleanUtils.toBoolean(Integer.valueOf(2), Integer.valueOf(2), Integer.valueOf(0)) = true
     *   BooleanUtils.toBoolean(null, null, Integer.valueOf(0))                     = true
     * </pre>
     *
     * @param value  the Integer to convert
     * @param trueValue  the value to match for {@code true}, may be {@code null}
     * @param falseValue  the value to match for {@code false}, may be {@code null}
     * @return {@code true} or {@code false}
     * @throws IllegalArgumentException if no match
     */
    public static boolean toBoolean(final Integer value, final Integer trueValue, final Integer falseValue) {try{__CLR4_1_21vf1vfl3lqxrmt.R.inc(2477);
        __CLR4_1_21vf1vfl3lqxrmt.R.inc(2478);if ((((value == null)&&(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2479)!=0|true))||(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2480)==0&false))) {{
            __CLR4_1_21vf1vfl3lqxrmt.R.inc(2481);if ((((trueValue == null)&&(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2482)!=0|true))||(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2483)==0&false))) {{
                __CLR4_1_21vf1vfl3lqxrmt.R.inc(2484);return true;
            }
            }__CLR4_1_21vf1vfl3lqxrmt.R.inc(2485);if ((((falseValue == null)&&(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2486)!=0|true))||(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2487)==0&false))) {{
                __CLR4_1_21vf1vfl3lqxrmt.R.inc(2488);return false;
            }
        }} }else {__CLR4_1_21vf1vfl3lqxrmt.R.inc(2489);if ((((value.equals(trueValue))&&(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2490)!=0|true))||(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2491)==0&false))) {{
            __CLR4_1_21vf1vfl3lqxrmt.R.inc(2492);return true;
        } }else {__CLR4_1_21vf1vfl3lqxrmt.R.inc(2493);if ((((value.equals(falseValue))&&(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2494)!=0|true))||(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2495)==0&false))) {{
            __CLR4_1_21vf1vfl3lqxrmt.R.inc(2496);return false;
        }
        // no match
        }}}__CLR4_1_21vf1vfl3lqxrmt.R.inc(2497);throw new IllegalArgumentException("The Integer did not match either specified value");
    }finally{__CLR4_1_21vf1vfl3lqxrmt.R.flushNeeded();}}

    /**
     * <p>Converts an int to a Boolean specifying the conversion values.</p>
     *
     * <p>NOTE: This returns null and will throw a NullPointerException if autoboxed to a boolean. </p>
     *
     * <pre>
     *   BooleanUtils.toBooleanObject(0, 0, 2, 3) = Boolean.TRUE
     *   BooleanUtils.toBooleanObject(2, 1, 2, 3) = Boolean.FALSE
     *   BooleanUtils.toBooleanObject(3, 1, 2, 3) = null
     * </pre>
     *
     * @param value  the Integer to convert
     * @param trueValue  the value to match for {@code true}
     * @param falseValue  the value to match for {@code false}
     * @param nullValue  the value to to match for {@code null}
     * @return Boolean.TRUE, Boolean.FALSE, or {@code null}
     * @throws IllegalArgumentException if no match
     */
    public static Boolean toBooleanObject(final int value, final int trueValue, final int falseValue, final int nullValue) {try{__CLR4_1_21vf1vfl3lqxrmt.R.inc(2498);
        __CLR4_1_21vf1vfl3lqxrmt.R.inc(2499);if ((((value == trueValue)&&(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2500)!=0|true))||(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2501)==0&false))) {{
            __CLR4_1_21vf1vfl3lqxrmt.R.inc(2502);return Boolean.TRUE;
        }
        }__CLR4_1_21vf1vfl3lqxrmt.R.inc(2503);if ((((value == falseValue)&&(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2504)!=0|true))||(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2505)==0&false))) {{
            __CLR4_1_21vf1vfl3lqxrmt.R.inc(2506);return Boolean.FALSE;
        }
        }__CLR4_1_21vf1vfl3lqxrmt.R.inc(2507);if ((((value == nullValue)&&(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2508)!=0|true))||(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2509)==0&false))) {{
            __CLR4_1_21vf1vfl3lqxrmt.R.inc(2510);return null;
        }
        // no match
        }__CLR4_1_21vf1vfl3lqxrmt.R.inc(2511);throw new IllegalArgumentException("The Integer did not match any specified value");
    }finally{__CLR4_1_21vf1vfl3lqxrmt.R.flushNeeded();}}

    /**
     * <p>Converts an Integer to a Boolean specifying the conversion values.</p>
     *
     * <p>NOTE: This returns null and will throw a NullPointerException if autoboxed to a boolean. </p>
     *
     * <pre>
     *   BooleanUtils.toBooleanObject(Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(2), Integer.valueOf(3)) = Boolean.TRUE
     *   BooleanUtils.toBooleanObject(Integer.valueOf(2), Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3)) = Boolean.FALSE
     *   BooleanUtils.toBooleanObject(Integer.valueOf(3), Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3)) = null
     * </pre>
     *
     * @param value  the Integer to convert
     * @param trueValue  the value to match for {@code true}, may be {@code null}
     * @param falseValue  the value to match for {@code false}, may be {@code null}
     * @param nullValue  the value to to match for {@code null}, may be {@code null}
     * @return Boolean.TRUE, Boolean.FALSE, or {@code null}
     * @throws IllegalArgumentException if no match
     */
    public static Boolean toBooleanObject(final Integer value, final Integer trueValue, final Integer falseValue, final Integer nullValue) {try{__CLR4_1_21vf1vfl3lqxrmt.R.inc(2512);
        __CLR4_1_21vf1vfl3lqxrmt.R.inc(2513);if ((((value == null)&&(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2514)!=0|true))||(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2515)==0&false))) {{
            __CLR4_1_21vf1vfl3lqxrmt.R.inc(2516);if ((((trueValue == null)&&(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2517)!=0|true))||(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2518)==0&false))) {{
                __CLR4_1_21vf1vfl3lqxrmt.R.inc(2519);return Boolean.TRUE;
            }
            }__CLR4_1_21vf1vfl3lqxrmt.R.inc(2520);if ((((falseValue == null)&&(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2521)!=0|true))||(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2522)==0&false))) {{
                __CLR4_1_21vf1vfl3lqxrmt.R.inc(2523);return Boolean.FALSE;
            }
            }__CLR4_1_21vf1vfl3lqxrmt.R.inc(2524);if ((((nullValue == null)&&(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2525)!=0|true))||(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2526)==0&false))) {{
                __CLR4_1_21vf1vfl3lqxrmt.R.inc(2527);return null;
            }
        }} }else {__CLR4_1_21vf1vfl3lqxrmt.R.inc(2528);if ((((value.equals(trueValue))&&(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2529)!=0|true))||(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2530)==0&false))) {{
            __CLR4_1_21vf1vfl3lqxrmt.R.inc(2531);return Boolean.TRUE;
        } }else {__CLR4_1_21vf1vfl3lqxrmt.R.inc(2532);if ((((value.equals(falseValue))&&(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2533)!=0|true))||(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2534)==0&false))) {{
            __CLR4_1_21vf1vfl3lqxrmt.R.inc(2535);return Boolean.FALSE;
        } }else {__CLR4_1_21vf1vfl3lqxrmt.R.inc(2536);if ((((value.equals(nullValue))&&(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2537)!=0|true))||(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2538)==0&false))) {{
            __CLR4_1_21vf1vfl3lqxrmt.R.inc(2539);return null;
        }
        // no match
        }}}}__CLR4_1_21vf1vfl3lqxrmt.R.inc(2540);throw new IllegalArgumentException("The Integer did not match any specified value");
    }finally{__CLR4_1_21vf1vfl3lqxrmt.R.flushNeeded();}}

    // Boolean to Integer methods
    //-----------------------------------------------------------------------
    /**
     * <p>Converts a boolean to an int using the convention that
     * {@code zero} is {@code false}.</p>
     *
     * <pre>
     *   BooleanUtils.toInteger(true)  = 1
     *   BooleanUtils.toInteger(false) = 0
     * </pre>
     *
     * @param bool  the boolean to convert
     * @return one if {@code true}, zero if {@code false}
     */
    public static int toInteger(final boolean bool) {try{__CLR4_1_21vf1vfl3lqxrmt.R.inc(2541);
        __CLR4_1_21vf1vfl3lqxrmt.R.inc(2542);return (((bool )&&(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2543)!=0|true))||(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2544)==0&false))? 1 : 0;
    }finally{__CLR4_1_21vf1vfl3lqxrmt.R.flushNeeded();}}

    /**
     * <p>Converts a boolean to an Integer using the convention that
     * {@code zero} is {@code false}.</p>
     *
     * <pre>
     *   BooleanUtils.toIntegerObject(true)  = Integer.valueOf(1)
     *   BooleanUtils.toIntegerObject(false) = Integer.valueOf(0)
     * </pre>
     *
     * @param bool  the boolean to convert
     * @return one if {@code true}, zero if {@code false}
     */
    public static Integer toIntegerObject(final boolean bool) {try{__CLR4_1_21vf1vfl3lqxrmt.R.inc(2545);
        __CLR4_1_21vf1vfl3lqxrmt.R.inc(2546);return (((bool )&&(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2547)!=0|true))||(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2548)==0&false))? NumberUtils.INTEGER_ONE : NumberUtils.INTEGER_ZERO;
    }finally{__CLR4_1_21vf1vfl3lqxrmt.R.flushNeeded();}}

    /**
     * <p>Converts a Boolean to a Integer using the convention that
     * {@code zero} is {@code false}.</p>
     *
     * <p>{@code null} will be converted to {@code null}.</p>
     *
     * <pre>
     *   BooleanUtils.toIntegerObject(Boolean.TRUE)  = Integer.valueOf(1)
     *   BooleanUtils.toIntegerObject(Boolean.FALSE) = Integer.valueOf(0)
     * </pre>
     *
     * @param bool  the Boolean to convert
     * @return one if Boolean.TRUE, zero if Boolean.FALSE, {@code null} if {@code null}
     */
    public static Integer toIntegerObject(final Boolean bool) {try{__CLR4_1_21vf1vfl3lqxrmt.R.inc(2549);
        __CLR4_1_21vf1vfl3lqxrmt.R.inc(2550);if ((((bool == null)&&(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2551)!=0|true))||(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2552)==0&false))) {{
            __CLR4_1_21vf1vfl3lqxrmt.R.inc(2553);return null;
        }
        }__CLR4_1_21vf1vfl3lqxrmt.R.inc(2554);return (((bool.booleanValue() )&&(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2555)!=0|true))||(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2556)==0&false))? NumberUtils.INTEGER_ONE : NumberUtils.INTEGER_ZERO;
    }finally{__CLR4_1_21vf1vfl3lqxrmt.R.flushNeeded();}}

    /**
     * <p>Converts a boolean to an int specifying the conversion values.</p>
     *
     * <pre>
     *   BooleanUtils.toInteger(true, 1, 0)  = 1
     *   BooleanUtils.toInteger(false, 1, 0) = 0
     * </pre>
     *
     * @param bool  the to convert
     * @param trueValue  the value to return if {@code true}
     * @param falseValue  the value to return if {@code false}
     * @return the appropriate value
     */
    public static int toInteger(final boolean bool, final int trueValue, final int falseValue) {try{__CLR4_1_21vf1vfl3lqxrmt.R.inc(2557);
        __CLR4_1_21vf1vfl3lqxrmt.R.inc(2558);return (((bool )&&(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2559)!=0|true))||(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2560)==0&false))? trueValue : falseValue;
    }finally{__CLR4_1_21vf1vfl3lqxrmt.R.flushNeeded();}}

    /**
     * <p>Converts a Boolean to an int specifying the conversion values.</p>
     *
     * <pre>
     *   BooleanUtils.toInteger(Boolean.TRUE, 1, 0, 2)  = 1
     *   BooleanUtils.toInteger(Boolean.FALSE, 1, 0, 2) = 0
     *   BooleanUtils.toInteger(null, 1, 0, 2)          = 2
     * </pre>
     *
     * @param bool  the Boolean to convert
     * @param trueValue  the value to return if {@code true}
     * @param falseValue  the value to return if {@code false}
     * @param nullValue  the value to return if {@code null}
     * @return the appropriate value
     */
    public static int toInteger(final Boolean bool, final int trueValue, final int falseValue, final int nullValue) {try{__CLR4_1_21vf1vfl3lqxrmt.R.inc(2561);
        __CLR4_1_21vf1vfl3lqxrmt.R.inc(2562);if ((((bool == null)&&(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2563)!=0|true))||(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2564)==0&false))) {{
            __CLR4_1_21vf1vfl3lqxrmt.R.inc(2565);return nullValue;
        }
        }__CLR4_1_21vf1vfl3lqxrmt.R.inc(2566);return (((bool.booleanValue() )&&(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2567)!=0|true))||(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2568)==0&false))? trueValue : falseValue;
    }finally{__CLR4_1_21vf1vfl3lqxrmt.R.flushNeeded();}}

    /**
     * <p>Converts a boolean to an Integer specifying the conversion values.</p>
     *
     * <pre>
     *   BooleanUtils.toIntegerObject(true, Integer.valueOf(1), Integer.valueOf(0))  = Integer.valueOf(1)
     *   BooleanUtils.toIntegerObject(false, Integer.valueOf(1), Integer.valueOf(0)) = Integer.valueOf(0)
     * </pre>
     *
     * @param bool  the to convert
     * @param trueValue  the value to return if {@code true}, may be {@code null}
     * @param falseValue  the value to return if {@code false}, may be {@code null}
     * @return the appropriate value
     */
    public static Integer toIntegerObject(final boolean bool, final Integer trueValue, final Integer falseValue) {try{__CLR4_1_21vf1vfl3lqxrmt.R.inc(2569);
        __CLR4_1_21vf1vfl3lqxrmt.R.inc(2570);return (((bool )&&(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2571)!=0|true))||(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2572)==0&false))? trueValue : falseValue;
    }finally{__CLR4_1_21vf1vfl3lqxrmt.R.flushNeeded();}}

    /**
     * <p>Converts a Boolean to an Integer specifying the conversion values.</p>
     *
     * <pre>
     *   BooleanUtils.toIntegerObject(Boolean.TRUE, Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(2))  = Integer.valueOf(1)
     *   BooleanUtils.toIntegerObject(Boolean.FALSE, Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(2)) = Integer.valueOf(0)
     *   BooleanUtils.toIntegerObject(null, Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(2))          = Integer.valueOf(2)
     * </pre>
     *
     * @param bool  the Boolean to convert
     * @param trueValue  the value to return if {@code true}, may be {@code null}
     * @param falseValue  the value to return if {@code false}, may be {@code null}
     * @param nullValue  the value to return if {@code null}, may be {@code null}
     * @return the appropriate value
     */
    public static Integer toIntegerObject(final Boolean bool, final Integer trueValue, final Integer falseValue, final Integer nullValue) {try{__CLR4_1_21vf1vfl3lqxrmt.R.inc(2573);
        __CLR4_1_21vf1vfl3lqxrmt.R.inc(2574);if ((((bool == null)&&(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2575)!=0|true))||(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2576)==0&false))) {{
            __CLR4_1_21vf1vfl3lqxrmt.R.inc(2577);return nullValue;
        }
        }__CLR4_1_21vf1vfl3lqxrmt.R.inc(2578);return (((bool.booleanValue() )&&(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2579)!=0|true))||(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2580)==0&false))? trueValue : falseValue;
    }finally{__CLR4_1_21vf1vfl3lqxrmt.R.flushNeeded();}}

    // String to Boolean methods
    //-----------------------------------------------------------------------
    /**
     * <p>Converts a String to a Boolean.</p>
     *
     * <p>{@code 'true'}, {@code 'on'} or {@code 'yes'}
     * (case insensitive) will return {@code true}.
     * {@code 'false'}, {@code 'off'} or {@code 'no'}
     * (case insensitive) will return {@code false}.
     * Otherwise, {@code null} is returned.</p>
     *
     * <p>NOTE: This returns null and will throw a NullPointerException if autoboxed to a boolean. </p>
     *
     * <pre>
     *   BooleanUtils.toBooleanObject(null)    = null
     *   BooleanUtils.toBooleanObject("true")  = Boolean.TRUE
     *   BooleanUtils.toBooleanObject("false") = Boolean.FALSE
     *   BooleanUtils.toBooleanObject("on")    = Boolean.TRUE
     *   BooleanUtils.toBooleanObject("ON")    = Boolean.TRUE
     *   BooleanUtils.toBooleanObject("off")   = Boolean.FALSE
     *   BooleanUtils.toBooleanObject("oFf")   = Boolean.FALSE
     *   BooleanUtils.toBooleanObject("blue")  = null
     * </pre>
     *
     * @param str  the String to check
     * @return the Boolean value of the string, {@code null} if no match or {@code null} input
     */
    public static Boolean toBooleanObject(final String str) {try{__CLR4_1_21vf1vfl3lqxrmt.R.inc(2581);
        // Previously used equalsIgnoreCase, which was fast for interned 'true'.
        // Non interned 'true' matched 15 times slower.
        //
        // Optimisation provides same performance as before for interned 'true'.
        // Similar performance for null, 'false', and other strings not length 2/3/4.
        // 'true'/'TRUE' match 4 times slower, 'tRUE'/'True' 7 times slower.
        __CLR4_1_21vf1vfl3lqxrmt.R.inc(2582);if ((((str == "true")&&(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2583)!=0|true))||(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2584)==0&false))) {{
            __CLR4_1_21vf1vfl3lqxrmt.R.inc(2585);return Boolean.TRUE;
        }
        }__CLR4_1_21vf1vfl3lqxrmt.R.inc(2586);if ((((str == null)&&(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2587)!=0|true))||(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2588)==0&false))) {{
            __CLR4_1_21vf1vfl3lqxrmt.R.inc(2589);return null;
        }
        }boolean __CLB4_1_2_bool0=false;__CLR4_1_21vf1vfl3lqxrmt.R.inc(2590);switch (str.length()) {
            case 1:if (!__CLB4_1_2_bool0) {__CLR4_1_21vf1vfl3lqxrmt.R.inc(2591);__CLB4_1_2_bool0=true;} {
                __CLR4_1_21vf1vfl3lqxrmt.R.inc(2592);final char ch0 = str.charAt(0);
                __CLR4_1_21vf1vfl3lqxrmt.R.inc(2593);if ((((ch0 == 'y' || ch0 == 'Y' ||
                    ch0 == 't' || ch0 == 'T')&&(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2594)!=0|true))||(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2595)==0&false))) {{
                    __CLR4_1_21vf1vfl3lqxrmt.R.inc(2596);return Boolean.TRUE;
                }
                }__CLR4_1_21vf1vfl3lqxrmt.R.inc(2597);if ((((ch0 == 'n' || ch0 == 'N' ||
                    ch0 == 'f' || ch0 == 'F')&&(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2598)!=0|true))||(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2599)==0&false))) {{
                    __CLR4_1_21vf1vfl3lqxrmt.R.inc(2600);return Boolean.FALSE;
                }
                }__CLR4_1_21vf1vfl3lqxrmt.R.inc(2601);break;
            }
            case 2:if (!__CLB4_1_2_bool0) {__CLR4_1_21vf1vfl3lqxrmt.R.inc(2602);__CLB4_1_2_bool0=true;} {
                __CLR4_1_21vf1vfl3lqxrmt.R.inc(2603);final char ch0 = str.charAt(0);
                __CLR4_1_21vf1vfl3lqxrmt.R.inc(2604);final char ch1 = str.charAt(1);
                __CLR4_1_21vf1vfl3lqxrmt.R.inc(2605);if (((((ch0 == 'o' || ch0 == 'O') &&
                    (ch1 == 'n' || ch1 == 'N') )&&(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2606)!=0|true))||(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2607)==0&false))) {{
                    __CLR4_1_21vf1vfl3lqxrmt.R.inc(2608);return Boolean.TRUE;
                }
                }__CLR4_1_21vf1vfl3lqxrmt.R.inc(2609);if (((((ch0 == 'n' || ch0 == 'N') &&
                    (ch1 == 'o' || ch1 == 'O') )&&(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2610)!=0|true))||(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2611)==0&false))) {{
                    __CLR4_1_21vf1vfl3lqxrmt.R.inc(2612);return Boolean.FALSE;
                }
                }__CLR4_1_21vf1vfl3lqxrmt.R.inc(2613);break;
            }
            case 3:if (!__CLB4_1_2_bool0) {__CLR4_1_21vf1vfl3lqxrmt.R.inc(2614);__CLB4_1_2_bool0=true;} {
                __CLR4_1_21vf1vfl3lqxrmt.R.inc(2615);final char ch0 = str.charAt(0);
                __CLR4_1_21vf1vfl3lqxrmt.R.inc(2616);final char ch1 = str.charAt(1);
                __CLR4_1_21vf1vfl3lqxrmt.R.inc(2617);final char ch2 = str.charAt(2);
                __CLR4_1_21vf1vfl3lqxrmt.R.inc(2618);if (((((ch0 == 'y' || ch0 == 'Y') &&
                    (ch1 == 'e' || ch1 == 'E') &&
                    (ch2 == 's' || ch2 == 'S') )&&(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2619)!=0|true))||(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2620)==0&false))) {{
                    __CLR4_1_21vf1vfl3lqxrmt.R.inc(2621);return Boolean.TRUE;
                }
                }__CLR4_1_21vf1vfl3lqxrmt.R.inc(2622);if (((((ch0 == 'o' || ch0 == 'O') &&
                    (ch1 == 'f' || ch1 == 'F') &&
                    (ch2 == 'f' || ch2 == 'F') )&&(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2623)!=0|true))||(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2624)==0&false))) {{
                    __CLR4_1_21vf1vfl3lqxrmt.R.inc(2625);return Boolean.FALSE;
                }
                }__CLR4_1_21vf1vfl3lqxrmt.R.inc(2626);break;
            }
            case 4:if (!__CLB4_1_2_bool0) {__CLR4_1_21vf1vfl3lqxrmt.R.inc(2627);__CLB4_1_2_bool0=true;} {
                __CLR4_1_21vf1vfl3lqxrmt.R.inc(2628);final char ch0 = str.charAt(0);
                __CLR4_1_21vf1vfl3lqxrmt.R.inc(2629);final char ch1 = str.charAt(1);
                __CLR4_1_21vf1vfl3lqxrmt.R.inc(2630);final char ch2 = str.charAt(2);
                __CLR4_1_21vf1vfl3lqxrmt.R.inc(2631);final char ch3 = str.charAt(3);
                __CLR4_1_21vf1vfl3lqxrmt.R.inc(2632);if (((((ch0 == 't' || ch0 == 'T') &&
                    (ch1 == 'r' || ch1 == 'R') &&
                    (ch2 == 'u' || ch2 == 'U') &&
                    (ch3 == 'e' || ch3 == 'E') )&&(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2633)!=0|true))||(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2634)==0&false))) {{
                    __CLR4_1_21vf1vfl3lqxrmt.R.inc(2635);return Boolean.TRUE;
                }
                }__CLR4_1_21vf1vfl3lqxrmt.R.inc(2636);break;
            }
            case 5:if (!__CLB4_1_2_bool0) {__CLR4_1_21vf1vfl3lqxrmt.R.inc(2637);__CLB4_1_2_bool0=true;} {
                __CLR4_1_21vf1vfl3lqxrmt.R.inc(2638);final char ch0 = str.charAt(0);
                __CLR4_1_21vf1vfl3lqxrmt.R.inc(2639);final char ch1 = str.charAt(1);
                __CLR4_1_21vf1vfl3lqxrmt.R.inc(2640);final char ch2 = str.charAt(2);
                __CLR4_1_21vf1vfl3lqxrmt.R.inc(2641);final char ch3 = str.charAt(3);
                __CLR4_1_21vf1vfl3lqxrmt.R.inc(2642);final char ch4 = str.charAt(4);
                __CLR4_1_21vf1vfl3lqxrmt.R.inc(2643);if (((((ch0 == 'f' || ch0 == 'F') &&
                    (ch1 == 'a' || ch1 == 'A') &&
                    (ch2 == 'l' || ch2 == 'L') &&
                    (ch3 == 's' || ch3 == 'S') &&
                    (ch4 == 'e' || ch4 == 'E') )&&(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2644)!=0|true))||(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2645)==0&false))) {{
                    __CLR4_1_21vf1vfl3lqxrmt.R.inc(2646);return Boolean.FALSE;
                }
                }__CLR4_1_21vf1vfl3lqxrmt.R.inc(2647);break;
            }
        }

        __CLR4_1_21vf1vfl3lqxrmt.R.inc(2648);return null;
    }finally{__CLR4_1_21vf1vfl3lqxrmt.R.flushNeeded();}}

    /**
     * <p>Converts a String to a Boolean throwing an exception if no match.</p>
     *
     * <p>NOTE: This returns null and will throw a NullPointerException if autoboxed to a boolean. </p>
     *
     * <pre>
     *   BooleanUtils.toBooleanObject("true", "true", "false", "null")  = Boolean.TRUE
     *   BooleanUtils.toBooleanObject("false", "true", "false", "null") = Boolean.FALSE
     *   BooleanUtils.toBooleanObject("null", "true", "false", "null")  = null
     * </pre>
     *
     * @param str  the String to check
     * @param trueString  the String to match for {@code true} (case sensitive), may be {@code null}
     * @param falseString  the String to match for {@code false} (case sensitive), may be {@code null}
     * @param nullString  the String to match for {@code null} (case sensitive), may be {@code null}
     * @return the Boolean value of the string, {@code null} if either the String matches {@code nullString}
     *  or if {@code null} input and {@code nullString} is {@code null}
     * @throws IllegalArgumentException if the String doesn't match
     */
    public static Boolean toBooleanObject(final String str, final String trueString, final String falseString, final String nullString) {try{__CLR4_1_21vf1vfl3lqxrmt.R.inc(2649);
        __CLR4_1_21vf1vfl3lqxrmt.R.inc(2650);if ((((str == null)&&(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2651)!=0|true))||(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2652)==0&false))) {{
            __CLR4_1_21vf1vfl3lqxrmt.R.inc(2653);if ((((trueString == null)&&(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2654)!=0|true))||(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2655)==0&false))) {{
                __CLR4_1_21vf1vfl3lqxrmt.R.inc(2656);return Boolean.TRUE;
            }
            }__CLR4_1_21vf1vfl3lqxrmt.R.inc(2657);if ((((falseString == null)&&(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2658)!=0|true))||(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2659)==0&false))) {{
                __CLR4_1_21vf1vfl3lqxrmt.R.inc(2660);return Boolean.FALSE;
            }
            }__CLR4_1_21vf1vfl3lqxrmt.R.inc(2661);if ((((nullString == null)&&(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2662)!=0|true))||(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2663)==0&false))) {{
                __CLR4_1_21vf1vfl3lqxrmt.R.inc(2664);return null;
            }
        }} }else {__CLR4_1_21vf1vfl3lqxrmt.R.inc(2665);if ((((str.equals(trueString))&&(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2666)!=0|true))||(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2667)==0&false))) {{
            __CLR4_1_21vf1vfl3lqxrmt.R.inc(2668);return Boolean.TRUE;
        } }else {__CLR4_1_21vf1vfl3lqxrmt.R.inc(2669);if ((((str.equals(falseString))&&(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2670)!=0|true))||(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2671)==0&false))) {{
            __CLR4_1_21vf1vfl3lqxrmt.R.inc(2672);return Boolean.FALSE;
        } }else {__CLR4_1_21vf1vfl3lqxrmt.R.inc(2673);if ((((str.equals(nullString))&&(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2674)!=0|true))||(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2675)==0&false))) {{
            __CLR4_1_21vf1vfl3lqxrmt.R.inc(2676);return null;
        }
        // no match
        }}}}__CLR4_1_21vf1vfl3lqxrmt.R.inc(2677);throw new IllegalArgumentException("The String did not match any specified value");
    }finally{__CLR4_1_21vf1vfl3lqxrmt.R.flushNeeded();}}

    // String to boolean methods
    //-----------------------------------------------------------------------
    /**
     * <p>Converts a String to a boolean (optimised for performance).</p>
     *
     * <p>{@code 'true'}, {@code 'on'} or {@code 'yes'}
     * (case insensitive) will return {@code true}. Otherwise,
     * {@code false} is returned.</p>
     *
     * <p>This method performs 4 times faster (JDK1.4) than
     * {@code Boolean.valueOf(String)}. However, this method accepts
     * 'on' and 'yes' as true values.
     *
     * <pre>
     *   BooleanUtils.toBoolean(null)    = false
     *   BooleanUtils.toBoolean("true")  = true
     *   BooleanUtils.toBoolean("TRUE")  = true
     *   BooleanUtils.toBoolean("tRUe")  = true
     *   BooleanUtils.toBoolean("on")    = true
     *   BooleanUtils.toBoolean("yes")   = true
     *   BooleanUtils.toBoolean("false") = false
     *   BooleanUtils.toBoolean("x gti") = false
     * </pre>
     *
     * @param str  the String to check
     * @return the boolean value of the string, {@code false} if no match or the String is null
     */
    public static boolean toBoolean(final String str) {try{__CLR4_1_21vf1vfl3lqxrmt.R.inc(2678);
        __CLR4_1_21vf1vfl3lqxrmt.R.inc(2679);return toBooleanObject(str) == Boolean.TRUE;
    }finally{__CLR4_1_21vf1vfl3lqxrmt.R.flushNeeded();}}

    /**
     * <p>Converts a String to a Boolean throwing an exception if no match found.</p>
     *
     * <pre>
     *   BooleanUtils.toBoolean("true", "true", "false")  = true
     *   BooleanUtils.toBoolean("false", "true", "false") = false
     * </pre>
     *
     * @param str  the String to check
     * @param trueString  the String to match for {@code true} (case sensitive), may be {@code null}
     * @param falseString  the String to match for {@code false} (case sensitive), may be {@code null}
     * @return the boolean value of the string
     * @throws IllegalArgumentException if the String doesn't match
     */
    public static boolean toBoolean(final String str, final String trueString, final String falseString) {try{__CLR4_1_21vf1vfl3lqxrmt.R.inc(2680);
        __CLR4_1_21vf1vfl3lqxrmt.R.inc(2681);if ((((str == trueString)&&(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2682)!=0|true))||(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2683)==0&false))) {{
            __CLR4_1_21vf1vfl3lqxrmt.R.inc(2684);return true;
        } }else {__CLR4_1_21vf1vfl3lqxrmt.R.inc(2685);if ((((str == falseString)&&(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2686)!=0|true))||(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2687)==0&false))) {{
            __CLR4_1_21vf1vfl3lqxrmt.R.inc(2688);return false;
        } }else {__CLR4_1_21vf1vfl3lqxrmt.R.inc(2689);if ((((str != null)&&(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2690)!=0|true))||(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2691)==0&false))) {{
            __CLR4_1_21vf1vfl3lqxrmt.R.inc(2692);if ((((str.equals(trueString))&&(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2693)!=0|true))||(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2694)==0&false))) {{
                __CLR4_1_21vf1vfl3lqxrmt.R.inc(2695);return true;
            } }else {__CLR4_1_21vf1vfl3lqxrmt.R.inc(2696);if ((((str.equals(falseString))&&(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2697)!=0|true))||(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2698)==0&false))) {{
                __CLR4_1_21vf1vfl3lqxrmt.R.inc(2699);return false;
            }
        }}}
        // no match
        }}}__CLR4_1_21vf1vfl3lqxrmt.R.inc(2700);throw new IllegalArgumentException("The String did not match either specified value");
    }finally{__CLR4_1_21vf1vfl3lqxrmt.R.flushNeeded();}}

    // Boolean to String methods
    //-----------------------------------------------------------------------
    /**
     * <p>Converts a Boolean to a String returning {@code 'true'},
     * {@code 'false'}, or {@code null}.</p>
     *
     * <pre>
     *   BooleanUtils.toStringTrueFalse(Boolean.TRUE)  = "true"
     *   BooleanUtils.toStringTrueFalse(Boolean.FALSE) = "false"
     *   BooleanUtils.toStringTrueFalse(null)          = null;
     * </pre>
     *
     * @param bool  the Boolean to check
     * @return {@code 'true'}, {@code 'false'}, or {@code null}
     */
    public static String toStringTrueFalse(final Boolean bool) {try{__CLR4_1_21vf1vfl3lqxrmt.R.inc(2701);
        __CLR4_1_21vf1vfl3lqxrmt.R.inc(2702);return toString(bool, "true", "false", null);
    }finally{__CLR4_1_21vf1vfl3lqxrmt.R.flushNeeded();}}

    /**
     * <p>Converts a Boolean to a String returning {@code 'on'},
     * {@code 'off'}, or {@code null}.</p>
     *
     * <pre>
     *   BooleanUtils.toStringOnOff(Boolean.TRUE)  = "on"
     *   BooleanUtils.toStringOnOff(Boolean.FALSE) = "off"
     *   BooleanUtils.toStringOnOff(null)          = null;
     * </pre>
     *
     * @param bool  the Boolean to check
     * @return {@code 'on'}, {@code 'off'}, or {@code null}
     */
    public static String toStringOnOff(final Boolean bool) {try{__CLR4_1_21vf1vfl3lqxrmt.R.inc(2703);
        __CLR4_1_21vf1vfl3lqxrmt.R.inc(2704);return toString(bool, "on", "off", null);
    }finally{__CLR4_1_21vf1vfl3lqxrmt.R.flushNeeded();}}

    /**
     * <p>Converts a Boolean to a String returning {@code 'yes'},
     * {@code 'no'}, or {@code null}.</p>
     *
     * <pre>
     *   BooleanUtils.toStringYesNo(Boolean.TRUE)  = "yes"
     *   BooleanUtils.toStringYesNo(Boolean.FALSE) = "no"
     *   BooleanUtils.toStringYesNo(null)          = null;
     * </pre>
     *
     * @param bool  the Boolean to check
     * @return {@code 'yes'}, {@code 'no'}, or {@code null}
     */
    public static String toStringYesNo(final Boolean bool) {try{__CLR4_1_21vf1vfl3lqxrmt.R.inc(2705);
        __CLR4_1_21vf1vfl3lqxrmt.R.inc(2706);return toString(bool, "yes", "no", null);
    }finally{__CLR4_1_21vf1vfl3lqxrmt.R.flushNeeded();}}

    /**
     * <p>Converts a Boolean to a String returning one of the input Strings.</p>
     *
     * <pre>
     *   BooleanUtils.toString(Boolean.TRUE, "true", "false", null)   = "true"
     *   BooleanUtils.toString(Boolean.FALSE, "true", "false", null)  = "false"
     *   BooleanUtils.toString(null, "true", "false", null)           = null;
     * </pre>
     *
     * @param bool  the Boolean to check
     * @param trueString  the String to return if {@code true}, may be {@code null}
     * @param falseString  the String to return if {@code false}, may be {@code null}
     * @param nullString  the String to return if {@code null}, may be {@code null}
     * @return one of the three input Strings
     */
    public static String toString(final Boolean bool, final String trueString, final String falseString, final String nullString) {try{__CLR4_1_21vf1vfl3lqxrmt.R.inc(2707);
        __CLR4_1_21vf1vfl3lqxrmt.R.inc(2708);if ((((bool == null)&&(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2709)!=0|true))||(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2710)==0&false))) {{
            __CLR4_1_21vf1vfl3lqxrmt.R.inc(2711);return nullString;
        }
        }__CLR4_1_21vf1vfl3lqxrmt.R.inc(2712);return (((bool.booleanValue() )&&(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2713)!=0|true))||(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2714)==0&false))? trueString : falseString;
    }finally{__CLR4_1_21vf1vfl3lqxrmt.R.flushNeeded();}}

    // boolean to String methods
    //-----------------------------------------------------------------------
    /**
     * <p>Converts a boolean to a String returning {@code 'true'}
     * or {@code 'false'}.</p>
     *
     * <pre>
     *   BooleanUtils.toStringTrueFalse(true)   = "true"
     *   BooleanUtils.toStringTrueFalse(false)  = "false"
     * </pre>
     *
     * @param bool  the Boolean to check
     * @return {@code 'true'}, {@code 'false'}, or {@code null}
     */
    public static String toStringTrueFalse(final boolean bool) {try{__CLR4_1_21vf1vfl3lqxrmt.R.inc(2715);
        __CLR4_1_21vf1vfl3lqxrmt.R.inc(2716);return toString(bool, "true", "false");
    }finally{__CLR4_1_21vf1vfl3lqxrmt.R.flushNeeded();}}

    /**
     * <p>Converts a boolean to a String returning {@code 'on'}
     * or {@code 'off'}.</p>
     *
     * <pre>
     *   BooleanUtils.toStringOnOff(true)   = "on"
     *   BooleanUtils.toStringOnOff(false)  = "off"
     * </pre>
     *
     * @param bool  the Boolean to check
     * @return {@code 'on'}, {@code 'off'}, or {@code null}
     */
    public static String toStringOnOff(final boolean bool) {try{__CLR4_1_21vf1vfl3lqxrmt.R.inc(2717);
        __CLR4_1_21vf1vfl3lqxrmt.R.inc(2718);return toString(bool, "on", "off");
    }finally{__CLR4_1_21vf1vfl3lqxrmt.R.flushNeeded();}}

    /**
     * <p>Converts a boolean to a String returning {@code 'yes'}
     * or {@code 'no'}.</p>
     *
     * <pre>
     *   BooleanUtils.toStringYesNo(true)   = "yes"
     *   BooleanUtils.toStringYesNo(false)  = "no"
     * </pre>
     *
     * @param bool  the Boolean to check
     * @return {@code 'yes'}, {@code 'no'}, or {@code null}
     */
    public static String toStringYesNo(final boolean bool) {try{__CLR4_1_21vf1vfl3lqxrmt.R.inc(2719);
        __CLR4_1_21vf1vfl3lqxrmt.R.inc(2720);return toString(bool, "yes", "no");
    }finally{__CLR4_1_21vf1vfl3lqxrmt.R.flushNeeded();}}

    /**
     * <p>Converts a boolean to a String returning one of the input Strings.</p>
     *
     * <pre>
     *   BooleanUtils.toString(true, "true", "false")   = "true"
     *   BooleanUtils.toString(false, "true", "false")  = "false"
     * </pre>
     *
     * @param bool  the Boolean to check
     * @param trueString  the String to return if {@code true}, may be {@code null}
     * @param falseString  the String to return if {@code false}, may be {@code null}
     * @return one of the two input Strings
     */
    public static String toString(final boolean bool, final String trueString, final String falseString) {try{__CLR4_1_21vf1vfl3lqxrmt.R.inc(2721);
        __CLR4_1_21vf1vfl3lqxrmt.R.inc(2722);return (((bool )&&(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2723)!=0|true))||(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2724)==0&false))? trueString : falseString;
    }finally{__CLR4_1_21vf1vfl3lqxrmt.R.flushNeeded();}}

    // logical operations
    // ----------------------------------------------------------------------
    /**
     * <p>Performs an and on a set of booleans.</p>
     *
     * <pre>
     *   BooleanUtils.and(true, true)         = true
     *   BooleanUtils.and(false, false)       = false
     *   BooleanUtils.and(true, false)        = false
     *   BooleanUtils.and(true, true, false)  = false
     *   BooleanUtils.and(true, true, true)   = true
     * </pre>
     *
     * @param array  an array of {@code boolean}s
     * @return {@code true} if the and is successful.
     * @throws IllegalArgumentException if {@code array} is {@code null}
     * @throws IllegalArgumentException if {@code array} is empty.
     * @since 3.0.1
     */
    public static boolean and(final boolean... array) {try{__CLR4_1_21vf1vfl3lqxrmt.R.inc(2725);
        // Validates input
        __CLR4_1_21vf1vfl3lqxrmt.R.inc(2726);if ((((array == null)&&(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2727)!=0|true))||(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2728)==0&false))) {{
            __CLR4_1_21vf1vfl3lqxrmt.R.inc(2729);throw new IllegalArgumentException("The Array must not be null");
        }
        }__CLR4_1_21vf1vfl3lqxrmt.R.inc(2730);if ((((array.length == 0)&&(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2731)!=0|true))||(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2732)==0&false))) {{
            __CLR4_1_21vf1vfl3lqxrmt.R.inc(2733);throw new IllegalArgumentException("Array is empty");
        }
        }__CLR4_1_21vf1vfl3lqxrmt.R.inc(2734);for (final boolean element : array) {{
            __CLR4_1_21vf1vfl3lqxrmt.R.inc(2735);if ((((!element)&&(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2736)!=0|true))||(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2737)==0&false))) {{
                __CLR4_1_21vf1vfl3lqxrmt.R.inc(2738);return false;
            }
        }}
        }__CLR4_1_21vf1vfl3lqxrmt.R.inc(2739);return true;
    }finally{__CLR4_1_21vf1vfl3lqxrmt.R.flushNeeded();}}

    /**
     * <p>Performs an and on an array of Booleans.</p>
     *
     * <pre>
     *   BooleanUtils.and(Boolean.TRUE, Boolean.TRUE)                 = Boolean.TRUE
     *   BooleanUtils.and(Boolean.FALSE, Boolean.FALSE)               = Boolean.FALSE
     *   BooleanUtils.and(Boolean.TRUE, Boolean.FALSE)                = Boolean.FALSE
     *   BooleanUtils.and(Boolean.TRUE, Boolean.TRUE, Boolean.TRUE)   = Boolean.TRUE
     *   BooleanUtils.and(Boolean.FALSE, Boolean.FALSE, Boolean.TRUE) = Boolean.FALSE
     *   BooleanUtils.and(Boolean.TRUE, Boolean.FALSE, Boolean.TRUE)  = Boolean.FALSE
     * </pre>
     *
     * @param array  an array of {@code Boolean}s
     * @return {@code true} if the and is successful.
     * @throws IllegalArgumentException if {@code array} is {@code null}
     * @throws IllegalArgumentException if {@code array} is empty.
     * @throws IllegalArgumentException if {@code array} contains a {@code null}
     * @since 3.0.1
     */
    public static Boolean and(final Boolean... array) {try{__CLR4_1_21vf1vfl3lqxrmt.R.inc(2740);
        __CLR4_1_21vf1vfl3lqxrmt.R.inc(2741);if ((((array == null)&&(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2742)!=0|true))||(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2743)==0&false))) {{
            __CLR4_1_21vf1vfl3lqxrmt.R.inc(2744);throw new IllegalArgumentException("The Array must not be null");
        }
        }__CLR4_1_21vf1vfl3lqxrmt.R.inc(2745);if ((((array.length == 0)&&(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2746)!=0|true))||(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2747)==0&false))) {{
            __CLR4_1_21vf1vfl3lqxrmt.R.inc(2748);throw new IllegalArgumentException("Array is empty");
        }
        }__CLR4_1_21vf1vfl3lqxrmt.R.inc(2749);try {
            __CLR4_1_21vf1vfl3lqxrmt.R.inc(2750);final boolean[] primitive = ArrayUtils.toPrimitive(array);
            __CLR4_1_21vf1vfl3lqxrmt.R.inc(2751);return (((and(primitive) )&&(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2752)!=0|true))||(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2753)==0&false))? Boolean.TRUE : Boolean.FALSE;
        } catch (final NullPointerException ex) {
            __CLR4_1_21vf1vfl3lqxrmt.R.inc(2754);throw new IllegalArgumentException("The array must not contain any null elements");
        }
    }finally{__CLR4_1_21vf1vfl3lqxrmt.R.flushNeeded();}}

    /**
     * <p>Performs an or on a set of booleans.</p>
     *
     * <pre>
     *   BooleanUtils.or(true, true)          = true
     *   BooleanUtils.or(false, false)        = false
     *   BooleanUtils.or(true, false)         = true
     *   BooleanUtils.or(true, true, false)   = true
     *   BooleanUtils.or(true, true, true)    = true
     *   BooleanUtils.or(false, false, false) = false
     * </pre>
     *
     * @param array  an array of {@code boolean}s
     * @return {@code true} if the or is successful.
     * @throws IllegalArgumentException if {@code array} is {@code null}
     * @throws IllegalArgumentException if {@code array} is empty.
     * @since 3.0.1
     */
    public static boolean or(final boolean... array) {try{__CLR4_1_21vf1vfl3lqxrmt.R.inc(2755);
        // Validates input
        __CLR4_1_21vf1vfl3lqxrmt.R.inc(2756);if ((((array == null)&&(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2757)!=0|true))||(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2758)==0&false))) {{
            __CLR4_1_21vf1vfl3lqxrmt.R.inc(2759);throw new IllegalArgumentException("The Array must not be null");
        }
        }__CLR4_1_21vf1vfl3lqxrmt.R.inc(2760);if ((((array.length == 0)&&(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2761)!=0|true))||(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2762)==0&false))) {{
            __CLR4_1_21vf1vfl3lqxrmt.R.inc(2763);throw new IllegalArgumentException("Array is empty");
        }
        }__CLR4_1_21vf1vfl3lqxrmt.R.inc(2764);for (final boolean element : array) {{
            __CLR4_1_21vf1vfl3lqxrmt.R.inc(2765);if ((((element)&&(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2766)!=0|true))||(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2767)==0&false))) {{
                __CLR4_1_21vf1vfl3lqxrmt.R.inc(2768);return true;
            }
        }}
        }__CLR4_1_21vf1vfl3lqxrmt.R.inc(2769);return false;
    }finally{__CLR4_1_21vf1vfl3lqxrmt.R.flushNeeded();}}

    /**
     * <p>Performs an or on an array of Booleans.</p>
     *
     * <pre>
     *   BooleanUtils.or(Boolean.TRUE, Boolean.TRUE)                  = Boolean.TRUE
     *   BooleanUtils.or(Boolean.FALSE, Boolean.FALSE)                = Boolean.FALSE
     *   BooleanUtils.or(Boolean.TRUE, Boolean.FALSE)                 = Boolean.TRUE
     *   BooleanUtils.or(Boolean.TRUE, Boolean.TRUE, Boolean.TRUE)    = Boolean.TRUE
     *   BooleanUtils.or(Boolean.FALSE, Boolean.FALSE, Boolean.TRUE)  = Boolean.TRUE
     *   BooleanUtils.or(Boolean.TRUE, Boolean.FALSE, Boolean.TRUE)   = Boolean.TRUE
     *   BooleanUtils.or(Boolean.FALSE, Boolean.FALSE, Boolean.FALSE) = Boolean.FALSE
     * </pre>
     *
     * @param array  an array of {@code Boolean}s
     * @return {@code true} if the or is successful.
     * @throws IllegalArgumentException if {@code array} is {@code null}
     * @throws IllegalArgumentException if {@code array} is empty.
     * @throws IllegalArgumentException if {@code array} contains a {@code null}
     * @since 3.0.1
     */
    public static Boolean or(final Boolean... array) {try{__CLR4_1_21vf1vfl3lqxrmt.R.inc(2770);
        __CLR4_1_21vf1vfl3lqxrmt.R.inc(2771);if ((((array == null)&&(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2772)!=0|true))||(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2773)==0&false))) {{
            __CLR4_1_21vf1vfl3lqxrmt.R.inc(2774);throw new IllegalArgumentException("The Array must not be null");
        }
        }__CLR4_1_21vf1vfl3lqxrmt.R.inc(2775);if ((((array.length == 0)&&(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2776)!=0|true))||(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2777)==0&false))) {{
            __CLR4_1_21vf1vfl3lqxrmt.R.inc(2778);throw new IllegalArgumentException("Array is empty");
        }
        }__CLR4_1_21vf1vfl3lqxrmt.R.inc(2779);try {
            __CLR4_1_21vf1vfl3lqxrmt.R.inc(2780);final boolean[] primitive = ArrayUtils.toPrimitive(array);
            __CLR4_1_21vf1vfl3lqxrmt.R.inc(2781);return (((or(primitive) )&&(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2782)!=0|true))||(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2783)==0&false))? Boolean.TRUE : Boolean.FALSE;
        } catch (final NullPointerException ex) {
            __CLR4_1_21vf1vfl3lqxrmt.R.inc(2784);throw new IllegalArgumentException("The array must not contain any null elements");
        }
    }finally{__CLR4_1_21vf1vfl3lqxrmt.R.flushNeeded();}}

    /**
     * <p>Performs an xor on a set of booleans.</p>
     *
     * <pre>
     *   BooleanUtils.xor(true, true)   = false
     *   BooleanUtils.xor(false, false) = false
     *   BooleanUtils.xor(true, false)  = true
     *   BooleanUtils.xor(true, true)   = false
     *   BooleanUtils.xor(false, false) = false
     *   BooleanUtils.xor(true, false)  = true
     * </pre>
     *
     * @param array  an array of {@code boolean}s
     * @return {@code true} if the xor is successful.
     * @throws IllegalArgumentException if {@code array} is {@code null}
     * @throws IllegalArgumentException if {@code array} is empty.
     */
    public static boolean xor(final boolean... array) {try{__CLR4_1_21vf1vfl3lqxrmt.R.inc(2785);
        // Validates input
        __CLR4_1_21vf1vfl3lqxrmt.R.inc(2786);if ((((array == null)&&(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2787)!=0|true))||(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2788)==0&false))) {{
            __CLR4_1_21vf1vfl3lqxrmt.R.inc(2789);throw new IllegalArgumentException("The Array must not be null");
        }
        }__CLR4_1_21vf1vfl3lqxrmt.R.inc(2790);if ((((array.length == 0)&&(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2791)!=0|true))||(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2792)==0&false))) {{
            __CLR4_1_21vf1vfl3lqxrmt.R.inc(2793);throw new IllegalArgumentException("Array is empty");
        }

        // Loops through array, comparing each item
        }__CLR4_1_21vf1vfl3lqxrmt.R.inc(2794);int trueCount = 0;
        __CLR4_1_21vf1vfl3lqxrmt.R.inc(2795);for (final boolean element : array) {{
            // If item is true, and trueCount is < 1, increments count
            // Else, xor fails
            __CLR4_1_21vf1vfl3lqxrmt.R.inc(2796);if ((((element)&&(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2797)!=0|true))||(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2798)==0&false))) {{
                __CLR4_1_21vf1vfl3lqxrmt.R.inc(2799);if ((((trueCount < 1)&&(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2800)!=0|true))||(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2801)==0&false))) {{
                    __CLR4_1_21vf1vfl3lqxrmt.R.inc(2802);trueCount++;
                } }else {{
                    __CLR4_1_21vf1vfl3lqxrmt.R.inc(2803);return false;
                }
            }}
        }}

        // Returns true if there was exactly 1 true item
        }__CLR4_1_21vf1vfl3lqxrmt.R.inc(2804);return trueCount == 1;
    }finally{__CLR4_1_21vf1vfl3lqxrmt.R.flushNeeded();}}

    /**
     * <p>Performs an xor on an array of Booleans.</p>
     *
     * <pre>
     *   BooleanUtils.xor(new Boolean[] { Boolean.TRUE, Boolean.TRUE })   = Boolean.FALSE
     *   BooleanUtils.xor(new Boolean[] { Boolean.FALSE, Boolean.FALSE }) = Boolean.FALSE
     *   BooleanUtils.xor(new Boolean[] { Boolean.TRUE, Boolean.FALSE })  = Boolean.TRUE
     * </pre>
     *
     * @param array  an array of {@code Boolean}s
     * @return {@code true} if the xor is successful.
     * @throws IllegalArgumentException if {@code array} is {@code null}
     * @throws IllegalArgumentException if {@code array} is empty.
     * @throws IllegalArgumentException if {@code array} contains a {@code null}
     */
    public static Boolean xor(final Boolean... array) {try{__CLR4_1_21vf1vfl3lqxrmt.R.inc(2805);
        __CLR4_1_21vf1vfl3lqxrmt.R.inc(2806);if ((((array == null)&&(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2807)!=0|true))||(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2808)==0&false))) {{
            __CLR4_1_21vf1vfl3lqxrmt.R.inc(2809);throw new IllegalArgumentException("The Array must not be null");
        }
        }__CLR4_1_21vf1vfl3lqxrmt.R.inc(2810);if ((((array.length == 0)&&(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2811)!=0|true))||(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2812)==0&false))) {{
            __CLR4_1_21vf1vfl3lqxrmt.R.inc(2813);throw new IllegalArgumentException("Array is empty");
        }
        }__CLR4_1_21vf1vfl3lqxrmt.R.inc(2814);try {
            __CLR4_1_21vf1vfl3lqxrmt.R.inc(2815);final boolean[] primitive = ArrayUtils.toPrimitive(array);
            __CLR4_1_21vf1vfl3lqxrmt.R.inc(2816);return (((xor(primitive) )&&(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2817)!=0|true))||(__CLR4_1_21vf1vfl3lqxrmt.R.iget(2818)==0&false))? Boolean.TRUE : Boolean.FALSE;
        } catch (final NullPointerException ex) {
            __CLR4_1_21vf1vfl3lqxrmt.R.inc(2819);throw new IllegalArgumentException("The array must not contain any null elements");
        }
    }finally{__CLR4_1_21vf1vfl3lqxrmt.R.flushNeeded();}}

}
