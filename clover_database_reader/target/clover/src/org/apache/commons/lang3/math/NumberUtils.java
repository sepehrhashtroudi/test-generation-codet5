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
package org.apache.commons.lang3.math;

import java.lang.reflect.Array;
import java.math.BigDecimal;
import java.math.BigInteger;

import org.apache.commons.lang3.StringUtils;

/**
 * <p>Provides extra functionality for Java Number classes.</p>
 *
 * @since 2.0
 * @version $Id$
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class NumberUtils {public static class __CLR4_1_29do9dol3lqxsgy{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492827633L,8589935092L,12788,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    /** Reusable Long constant for zero. */
    public static final Long LONG_ZERO = Long.valueOf(0L);
    /** Reusable Long constant for one. */
    public static final Long LONG_ONE = Long.valueOf(1L);
    /** Reusable Long constant for minus one. */
    public static final Long LONG_MINUS_ONE = Long.valueOf(-1L);
    /** Reusable Integer constant for zero. */
    public static final Integer INTEGER_ZERO = Integer.valueOf(0);
    /** Reusable Integer constant for one. */
    public static final Integer INTEGER_ONE = Integer.valueOf(1);
    /** Reusable Integer constant for minus one. */
    public static final Integer INTEGER_MINUS_ONE = Integer.valueOf(-1);
    /** Reusable Short constant for zero. */
    public static final Short SHORT_ZERO = Short.valueOf((short) 0);
    /** Reusable Short constant for one. */
    public static final Short SHORT_ONE = Short.valueOf((short) 1);
    /** Reusable Short constant for minus one. */
    public static final Short SHORT_MINUS_ONE = Short.valueOf((short) -1);
    /** Reusable Byte constant for zero. */
    public static final Byte BYTE_ZERO = Byte.valueOf((byte) 0);
    /** Reusable Byte constant for one. */
    public static final Byte BYTE_ONE = Byte.valueOf((byte) 1);
    /** Reusable Byte constant for minus one. */
    public static final Byte BYTE_MINUS_ONE = Byte.valueOf((byte) -1);
    /** Reusable Double constant for zero. */
    public static final Double DOUBLE_ZERO = Double.valueOf(0.0d);
    /** Reusable Double constant for one. */
    public static final Double DOUBLE_ONE = Double.valueOf(1.0d);
    /** Reusable Double constant for minus one. */
    public static final Double DOUBLE_MINUS_ONE = Double.valueOf(-1.0d);
    /** Reusable Float constant for zero. */
    public static final Float FLOAT_ZERO = Float.valueOf(0.0f);
    /** Reusable Float constant for one. */
    public static final Float FLOAT_ONE = Float.valueOf(1.0f);
    /** Reusable Float constant for minus one. */
    public static final Float FLOAT_MINUS_ONE = Float.valueOf(-1.0f);

    /**
     * <p><code>NumberUtils</code> instances should NOT be constructed in standard programming.
     * Instead, the class should be used as <code>NumberUtils.toInt("6");</code>.</p>
     *
     * <p>This constructor is public to permit tools that require a JavaBean instance
     * to operate.</p>
     */
    public NumberUtils() {
        super();__CLR4_1_29do9dol3lqxsgy.R.inc(12157);try{__CLR4_1_29do9dol3lqxsgy.R.inc(12156);
    }finally{__CLR4_1_29do9dol3lqxsgy.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * <p>Convert a <code>String</code> to an <code>int</code>, returning
     * <code>zero</code> if the conversion fails.</p>
     *
     * <p>If the string is <code>null</code>, <code>zero</code> is returned.</p>
     *
     * <pre>
     *   NumberUtils.toInt(null) = 0
     *   NumberUtils.toInt("")   = 0
     *   NumberUtils.toInt("1")  = 1
     * </pre>
     *
     * @param str  the string to convert, may be null
     * @return the int represented by the string, or <code>zero</code> if
     *  conversion fails
     * @since 2.1
     */
    public static int toInt(final String str) {try{__CLR4_1_29do9dol3lqxsgy.R.inc(12158);
        __CLR4_1_29do9dol3lqxsgy.R.inc(12159);return toInt(str, 0);
    }finally{__CLR4_1_29do9dol3lqxsgy.R.flushNeeded();}}

    /**
     * <p>Convert a <code>String</code> to an <code>int</code>, returning a
     * default value if the conversion fails.</p>
     *
     * <p>If the string is <code>null</code>, the default value is returned.</p>
     *
     * <pre>
     *   NumberUtils.toInt(null, 1) = 1
     *   NumberUtils.toInt("", 1)   = 1
     *   NumberUtils.toInt("1", 0)  = 1
     * </pre>
     *
     * @param str  the string to convert, may be null
     * @param defaultValue  the default value
     * @return the int represented by the string, or the default if conversion fails
     * @since 2.1
     */
    public static int toInt(final String str, final int defaultValue) {try{__CLR4_1_29do9dol3lqxsgy.R.inc(12160);
        __CLR4_1_29do9dol3lqxsgy.R.inc(12161);if((((str == null)&&(__CLR4_1_29do9dol3lqxsgy.R.iget(12162)!=0|true))||(__CLR4_1_29do9dol3lqxsgy.R.iget(12163)==0&false))) {{
            __CLR4_1_29do9dol3lqxsgy.R.inc(12164);return defaultValue;
        }
        }__CLR4_1_29do9dol3lqxsgy.R.inc(12165);try {
            __CLR4_1_29do9dol3lqxsgy.R.inc(12166);return Integer.parseInt(str);
        } catch (final NumberFormatException nfe) {
            __CLR4_1_29do9dol3lqxsgy.R.inc(12167);return defaultValue;
        }
    }finally{__CLR4_1_29do9dol3lqxsgy.R.flushNeeded();}}

    /**
     * <p>Convert a <code>String</code> to a <code>long</code>, returning
     * <code>zero</code> if the conversion fails.</p>
     *
     * <p>If the string is <code>null</code>, <code>zero</code> is returned.</p>
     *
     * <pre>
     *   NumberUtils.toLong(null) = 0L
     *   NumberUtils.toLong("")   = 0L
     *   NumberUtils.toLong("1")  = 1L
     * </pre>
     *
     * @param str  the string to convert, may be null
     * @return the long represented by the string, or <code>0</code> if
     *  conversion fails
     * @since 2.1
     */
    public static long toLong(final String str) {try{__CLR4_1_29do9dol3lqxsgy.R.inc(12168);
        __CLR4_1_29do9dol3lqxsgy.R.inc(12169);return toLong(str, 0L);
    }finally{__CLR4_1_29do9dol3lqxsgy.R.flushNeeded();}}

    /**
     * <p>Convert a <code>String</code> to a <code>long</code>, returning a
     * default value if the conversion fails.</p>
     *
     * <p>If the string is <code>null</code>, the default value is returned.</p>
     *
     * <pre>
     *   NumberUtils.toLong(null, 1L) = 1L
     *   NumberUtils.toLong("", 1L)   = 1L
     *   NumberUtils.toLong("1", 0L)  = 1L
     * </pre>
     *
     * @param str  the string to convert, may be null
     * @param defaultValue  the default value
     * @return the long represented by the string, or the default if conversion fails
     * @since 2.1
     */
    public static long toLong(final String str, final long defaultValue) {try{__CLR4_1_29do9dol3lqxsgy.R.inc(12170);
        __CLR4_1_29do9dol3lqxsgy.R.inc(12171);if ((((str == null)&&(__CLR4_1_29do9dol3lqxsgy.R.iget(12172)!=0|true))||(__CLR4_1_29do9dol3lqxsgy.R.iget(12173)==0&false))) {{
            __CLR4_1_29do9dol3lqxsgy.R.inc(12174);return defaultValue;
        }
        }__CLR4_1_29do9dol3lqxsgy.R.inc(12175);try {
            __CLR4_1_29do9dol3lqxsgy.R.inc(12176);return Long.parseLong(str);
        } catch (final NumberFormatException nfe) {
            __CLR4_1_29do9dol3lqxsgy.R.inc(12177);return defaultValue;
        }
    }finally{__CLR4_1_29do9dol3lqxsgy.R.flushNeeded();}}

    /**
     * <p>Convert a <code>String</code> to a <code>float</code>, returning
     * <code>0.0f</code> if the conversion fails.</p>
     *
     * <p>If the string <code>str</code> is <code>null</code>,
     * <code>0.0f</code> is returned.</p>
     *
     * <pre>
     *   NumberUtils.toFloat(null)   = 0.0f
     *   NumberUtils.toFloat("")     = 0.0f
     *   NumberUtils.toFloat("1.5")  = 1.5f
     * </pre>
     *
     * @param str the string to convert, may be <code>null</code>
     * @return the float represented by the string, or <code>0.0f</code>
     *  if conversion fails
     * @since 2.1
     */
    public static float toFloat(final String str) {try{__CLR4_1_29do9dol3lqxsgy.R.inc(12178);
        __CLR4_1_29do9dol3lqxsgy.R.inc(12179);return toFloat(str, 0.0f);
    }finally{__CLR4_1_29do9dol3lqxsgy.R.flushNeeded();}}

    /**
     * <p>Convert a <code>String</code> to a <code>float</code>, returning a
     * default value if the conversion fails.</p>
     *
     * <p>If the string <code>str</code> is <code>null</code>, the default
     * value is returned.</p>
     *
     * <pre>
     *   NumberUtils.toFloat(null, 1.1f)   = 1.0f
     *   NumberUtils.toFloat("", 1.1f)     = 1.1f
     *   NumberUtils.toFloat("1.5", 0.0f)  = 1.5f
     * </pre>
     *
     * @param str the string to convert, may be <code>null</code>
     * @param defaultValue the default value
     * @return the float represented by the string, or defaultValue
     *  if conversion fails
     * @since 2.1
     */
    public static float toFloat(final String str, final float defaultValue) {try{__CLR4_1_29do9dol3lqxsgy.R.inc(12180);
      __CLR4_1_29do9dol3lqxsgy.R.inc(12181);if ((((str == null)&&(__CLR4_1_29do9dol3lqxsgy.R.iget(12182)!=0|true))||(__CLR4_1_29do9dol3lqxsgy.R.iget(12183)==0&false))) {{
          __CLR4_1_29do9dol3lqxsgy.R.inc(12184);return defaultValue;
      }     
      }__CLR4_1_29do9dol3lqxsgy.R.inc(12185);try {
          __CLR4_1_29do9dol3lqxsgy.R.inc(12186);return Float.parseFloat(str);
      } catch (final NumberFormatException nfe) {
          __CLR4_1_29do9dol3lqxsgy.R.inc(12187);return defaultValue;
      }
    }finally{__CLR4_1_29do9dol3lqxsgy.R.flushNeeded();}}

    /**
     * <p>Convert a <code>String</code> to a <code>double</code>, returning
     * <code>0.0d</code> if the conversion fails.</p>
     *
     * <p>If the string <code>str</code> is <code>null</code>,
     * <code>0.0d</code> is returned.</p>
     *
     * <pre>
     *   NumberUtils.toDouble(null)   = 0.0d
     *   NumberUtils.toDouble("")     = 0.0d
     *   NumberUtils.toDouble("1.5")  = 1.5d
     * </pre>
     *
     * @param str the string to convert, may be <code>null</code>
     * @return the double represented by the string, or <code>0.0d</code>
     *  if conversion fails
     * @since 2.1
     */
    public static double toDouble(final String str) {try{__CLR4_1_29do9dol3lqxsgy.R.inc(12188);
        __CLR4_1_29do9dol3lqxsgy.R.inc(12189);return toDouble(str, 0.0d);
    }finally{__CLR4_1_29do9dol3lqxsgy.R.flushNeeded();}}

    /**
     * <p>Convert a <code>String</code> to a <code>double</code>, returning a
     * default value if the conversion fails.</p>
     *
     * <p>If the string <code>str</code> is <code>null</code>, the default
     * value is returned.</p>
     *
     * <pre>
     *   NumberUtils.toDouble(null, 1.1d)   = 1.1d
     *   NumberUtils.toDouble("", 1.1d)     = 1.1d
     *   NumberUtils.toDouble("1.5", 0.0d)  = 1.5d
     * </pre>
     *
     * @param str the string to convert, may be <code>null</code>
     * @param defaultValue the default value
     * @return the double represented by the string, or defaultValue
     *  if conversion fails
     * @since 2.1
     */
    public static double toDouble(final String str, final double defaultValue) {try{__CLR4_1_29do9dol3lqxsgy.R.inc(12190);
      __CLR4_1_29do9dol3lqxsgy.R.inc(12191);if ((((str == null)&&(__CLR4_1_29do9dol3lqxsgy.R.iget(12192)!=0|true))||(__CLR4_1_29do9dol3lqxsgy.R.iget(12193)==0&false))) {{
          __CLR4_1_29do9dol3lqxsgy.R.inc(12194);return defaultValue;
      }
      }__CLR4_1_29do9dol3lqxsgy.R.inc(12195);try {
          __CLR4_1_29do9dol3lqxsgy.R.inc(12196);return Double.parseDouble(str);
      } catch (final NumberFormatException nfe) {
          __CLR4_1_29do9dol3lqxsgy.R.inc(12197);return defaultValue;
      }
    }finally{__CLR4_1_29do9dol3lqxsgy.R.flushNeeded();}}

     //-----------------------------------------------------------------------
     /**
     * <p>Convert a <code>String</code> to a <code>byte</code>, returning
     * <code>zero</code> if the conversion fails.</p>
     *
     * <p>If the string is <code>null</code>, <code>zero</code> is returned.</p>
     *
     * <pre>
     *   NumberUtils.toByte(null) = 0
     *   NumberUtils.toByte("")   = 0
     *   NumberUtils.toByte("1")  = 1
     * </pre>
     *
     * @param str  the string to convert, may be null
     * @return the byte represented by the string, or <code>zero</code> if
     *  conversion fails
     * @since 2.5
     */
    public static byte toByte(final String str) {try{__CLR4_1_29do9dol3lqxsgy.R.inc(12198);
        __CLR4_1_29do9dol3lqxsgy.R.inc(12199);return toByte(str, (byte) 0);
    }finally{__CLR4_1_29do9dol3lqxsgy.R.flushNeeded();}}

    /**
     * <p>Convert a <code>String</code> to a <code>byte</code>, returning a
     * default value if the conversion fails.</p>
     *
     * <p>If the string is <code>null</code>, the default value is returned.</p>
     *
     * <pre>
     *   NumberUtils.toByte(null, 1) = 1
     *   NumberUtils.toByte("", 1)   = 1
     *   NumberUtils.toByte("1", 0)  = 1
     * </pre>
     *
     * @param str  the string to convert, may be null
     * @param defaultValue  the default value
     * @return the byte represented by the string, or the default if conversion fails
     * @since 2.5
     */
    public static byte toByte(final String str, final byte defaultValue) {try{__CLR4_1_29do9dol3lqxsgy.R.inc(12200);
        __CLR4_1_29do9dol3lqxsgy.R.inc(12201);if((((str == null)&&(__CLR4_1_29do9dol3lqxsgy.R.iget(12202)!=0|true))||(__CLR4_1_29do9dol3lqxsgy.R.iget(12203)==0&false))) {{
            __CLR4_1_29do9dol3lqxsgy.R.inc(12204);return defaultValue;
        }
        }__CLR4_1_29do9dol3lqxsgy.R.inc(12205);try {
            __CLR4_1_29do9dol3lqxsgy.R.inc(12206);return Byte.parseByte(str);
        } catch (final NumberFormatException nfe) {
            __CLR4_1_29do9dol3lqxsgy.R.inc(12207);return defaultValue;
        }
    }finally{__CLR4_1_29do9dol3lqxsgy.R.flushNeeded();}}

    /**
     * <p>Convert a <code>String</code> to a <code>short</code>, returning
     * <code>zero</code> if the conversion fails.</p>
     *
     * <p>If the string is <code>null</code>, <code>zero</code> is returned.</p>
     *
     * <pre>
     *   NumberUtils.toShort(null) = 0
     *   NumberUtils.toShort("")   = 0
     *   NumberUtils.toShort("1")  = 1
     * </pre>
     *
     * @param str  the string to convert, may be null
     * @return the short represented by the string, or <code>zero</code> if
     *  conversion fails
     * @since 2.5
     */
    public static short toShort(final String str) {try{__CLR4_1_29do9dol3lqxsgy.R.inc(12208);
        __CLR4_1_29do9dol3lqxsgy.R.inc(12209);return toShort(str, (short) 0);
    }finally{__CLR4_1_29do9dol3lqxsgy.R.flushNeeded();}}

    /**
     * <p>Convert a <code>String</code> to an <code>short</code>, returning a
     * default value if the conversion fails.</p>
     *
     * <p>If the string is <code>null</code>, the default value is returned.</p>
     *
     * <pre>
     *   NumberUtils.toShort(null, 1) = 1
     *   NumberUtils.toShort("", 1)   = 1
     *   NumberUtils.toShort("1", 0)  = 1
     * </pre>
     *
     * @param str  the string to convert, may be null
     * @param defaultValue  the default value
     * @return the short represented by the string, or the default if conversion fails
     * @since 2.5
     */
    public static short toShort(final String str, final short defaultValue) {try{__CLR4_1_29do9dol3lqxsgy.R.inc(12210);
        __CLR4_1_29do9dol3lqxsgy.R.inc(12211);if((((str == null)&&(__CLR4_1_29do9dol3lqxsgy.R.iget(12212)!=0|true))||(__CLR4_1_29do9dol3lqxsgy.R.iget(12213)==0&false))) {{
            __CLR4_1_29do9dol3lqxsgy.R.inc(12214);return defaultValue;
        }
        }__CLR4_1_29do9dol3lqxsgy.R.inc(12215);try {
            __CLR4_1_29do9dol3lqxsgy.R.inc(12216);return Short.parseShort(str);
        } catch (final NumberFormatException nfe) {
            __CLR4_1_29do9dol3lqxsgy.R.inc(12217);return defaultValue;
        }
    }finally{__CLR4_1_29do9dol3lqxsgy.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    // must handle Long, Float, Integer, Float, Short,
    //                  BigDecimal, BigInteger and Byte
    // useful methods:
    // Byte.decode(String)
    // Byte.valueOf(String,int radix)
    // Byte.valueOf(String)
    // Double.valueOf(String)
    // Float.valueOf(String)
    // Float.valueOf(String)
    // Integer.valueOf(String,int radix)
    // Integer.valueOf(String)
    // Integer.decode(String)
    // Integer.getInteger(String)
    // Integer.getInteger(String,int val)
    // Integer.getInteger(String,Integer val)
    // Integer.valueOf(String)
    // Double.valueOf(String)
    // new Byte(String)
    // Long.valueOf(String)
    // Long.getLong(String)
    // Long.getLong(String,int)
    // Long.getLong(String,Integer)
    // Long.valueOf(String,int)
    // Long.valueOf(String)
    // Short.valueOf(String)
    // Short.decode(String)
    // Short.valueOf(String,int)
    // Short.valueOf(String)
    // new BigDecimal(String)
    // new BigInteger(String)
    // new BigInteger(String,int radix)
    // Possible inputs:
    // 45 45.5 45E7 4.5E7 Hex Oct Binary xxxF xxxD xxxf xxxd
    // plus minus everything. Prolly more. A lot are not separable.

    /**
     * <p>Turns a string value into a java.lang.Number.</p>
     *
     * <p>If the string starts with {@code 0x} or {@code -0x} (lower or upper case) or {@code #} or {@code -#}, it
     * will be interpreted as a hexadecimal Integer - or Long, if the number of digits after the
     * prefix is more than 8 - or BigInteger if there are more than 16 digits.
     * </p>
     * <p>Then, the value is examined for a type qualifier on the end, i.e. one of
     * <code>'f','F','d','D','l','L'</code>.  If it is found, it starts 
     * trying to create successively larger types from the type specified
     * until one is found that can represent the value.</p>
     *
     * <p>If a type specifier is not found, it will check for a decimal point
     * and then try successively larger types from <code>Integer</code> to
     * <code>BigInteger</code> and from <code>Float</code> to
    * <code>BigDecimal</code>.</p>
    * 
     * <p>
     * Integral values with a leading {@code 0} will be interpreted as octal; the returned number will
     * be Integer, Long or BigDecimal as appropriate.
     * </p>
     *
     * <p>Returns <code>null</code> if the string is <code>null</code>.</p>
     *
     * <p>This method does not trim the input string, i.e., strings with leading
     * or trailing spaces will generate NumberFormatExceptions.</p>
     *
     * @param str  String containing a number, may be null
     * @return Number created from the string (or null if the input is null)
     * @throws NumberFormatException if the value cannot be converted
     */
    public static Number createNumber(final String str) throws NumberFormatException {try{__CLR4_1_29do9dol3lqxsgy.R.inc(12218);
        __CLR4_1_29do9dol3lqxsgy.R.inc(12219);if ((((str == null)&&(__CLR4_1_29do9dol3lqxsgy.R.iget(12220)!=0|true))||(__CLR4_1_29do9dol3lqxsgy.R.iget(12221)==0&false))) {{
            __CLR4_1_29do9dol3lqxsgy.R.inc(12222);return null;
        }
        }__CLR4_1_29do9dol3lqxsgy.R.inc(12223);if ((((StringUtils.isBlank(str))&&(__CLR4_1_29do9dol3lqxsgy.R.iget(12224)!=0|true))||(__CLR4_1_29do9dol3lqxsgy.R.iget(12225)==0&false))) {{
            __CLR4_1_29do9dol3lqxsgy.R.inc(12226);throw new NumberFormatException("A blank string is not a valid number");
        }
        // Need to deal with all possible hex prefixes here
        }__CLR4_1_29do9dol3lqxsgy.R.inc(12227);final String[] hex_prefixes = {"0x", "0X", "-0x", "-0X", "#", "-#"};
        __CLR4_1_29do9dol3lqxsgy.R.inc(12228);int pfxLen = 0;
        __CLR4_1_29do9dol3lqxsgy.R.inc(12229);for(final String pfx : hex_prefixes) {{
            __CLR4_1_29do9dol3lqxsgy.R.inc(12230);if ((((str.startsWith(pfx))&&(__CLR4_1_29do9dol3lqxsgy.R.iget(12231)!=0|true))||(__CLR4_1_29do9dol3lqxsgy.R.iget(12232)==0&false))) {{
                __CLR4_1_29do9dol3lqxsgy.R.inc(12233);pfxLen += pfx.length();
                __CLR4_1_29do9dol3lqxsgy.R.inc(12234);break;
            }
        }}
        }__CLR4_1_29do9dol3lqxsgy.R.inc(12235);if ((((pfxLen > 0)&&(__CLR4_1_29do9dol3lqxsgy.R.iget(12236)!=0|true))||(__CLR4_1_29do9dol3lqxsgy.R.iget(12237)==0&false))) {{ // we have a hex number
            __CLR4_1_29do9dol3lqxsgy.R.inc(12238);final int hexDigits = str.length() - pfxLen;
            __CLR4_1_29do9dol3lqxsgy.R.inc(12239);if ((((hexDigits > 16)&&(__CLR4_1_29do9dol3lqxsgy.R.iget(12240)!=0|true))||(__CLR4_1_29do9dol3lqxsgy.R.iget(12241)==0&false))) {{ // too many for Long
                __CLR4_1_29do9dol3lqxsgy.R.inc(12242);return createBigInteger(str);
            }
            }__CLR4_1_29do9dol3lqxsgy.R.inc(12243);if ((((hexDigits > 8)&&(__CLR4_1_29do9dol3lqxsgy.R.iget(12244)!=0|true))||(__CLR4_1_29do9dol3lqxsgy.R.iget(12245)==0&false))) {{ // too many for an int
                __CLR4_1_29do9dol3lqxsgy.R.inc(12246);return createLong(str);
            }
            }__CLR4_1_29do9dol3lqxsgy.R.inc(12247);return createInteger(str);
        }
        }__CLR4_1_29do9dol3lqxsgy.R.inc(12248);final char lastChar = str.charAt(str.length() - 1);
        __CLR4_1_29do9dol3lqxsgy.R.inc(12249);String mant;
        __CLR4_1_29do9dol3lqxsgy.R.inc(12250);String dec;
        __CLR4_1_29do9dol3lqxsgy.R.inc(12251);String exp;
        __CLR4_1_29do9dol3lqxsgy.R.inc(12252);final int decPos = str.indexOf('.');
        __CLR4_1_29do9dol3lqxsgy.R.inc(12253);final int expPos = str.indexOf('e') + str.indexOf('E') + 1; // assumes both not present
        // if both e and E are present, this is caught by the checks on expPos (which prevent IOOBE)
        // and the parsing which will detect if e or E appear in a number due to using the wrong offset

        __CLR4_1_29do9dol3lqxsgy.R.inc(12254);int numDecimals = 0; // Check required precision (LANG-693)
        __CLR4_1_29do9dol3lqxsgy.R.inc(12255);if ((((decPos > -1)&&(__CLR4_1_29do9dol3lqxsgy.R.iget(12256)!=0|true))||(__CLR4_1_29do9dol3lqxsgy.R.iget(12257)==0&false))) {{ // there is a decimal point

            __CLR4_1_29do9dol3lqxsgy.R.inc(12258);if ((((expPos > -1)&&(__CLR4_1_29do9dol3lqxsgy.R.iget(12259)!=0|true))||(__CLR4_1_29do9dol3lqxsgy.R.iget(12260)==0&false))) {{ // there is an exponent
                __CLR4_1_29do9dol3lqxsgy.R.inc(12261);if ((((expPos < decPos || expPos > str.length())&&(__CLR4_1_29do9dol3lqxsgy.R.iget(12262)!=0|true))||(__CLR4_1_29do9dol3lqxsgy.R.iget(12263)==0&false))) {{ // prevents double exponent causing IOOBE
                    __CLR4_1_29do9dol3lqxsgy.R.inc(12264);throw new NumberFormatException(str + " is not a valid number.");
                }
                }__CLR4_1_29do9dol3lqxsgy.R.inc(12265);dec = str.substring(decPos + 1, expPos);
            } }else {{
                __CLR4_1_29do9dol3lqxsgy.R.inc(12266);dec = str.substring(decPos + 1);
            }
            }__CLR4_1_29do9dol3lqxsgy.R.inc(12267);mant = str.substring(0, decPos);
            __CLR4_1_29do9dol3lqxsgy.R.inc(12268);numDecimals = dec.length(); // gets number of digits past the decimal to ensure no loss of precision for floating point numbers.
        } }else {{
            __CLR4_1_29do9dol3lqxsgy.R.inc(12269);if ((((expPos > -1)&&(__CLR4_1_29do9dol3lqxsgy.R.iget(12270)!=0|true))||(__CLR4_1_29do9dol3lqxsgy.R.iget(12271)==0&false))) {{
                __CLR4_1_29do9dol3lqxsgy.R.inc(12272);if ((((expPos > str.length())&&(__CLR4_1_29do9dol3lqxsgy.R.iget(12273)!=0|true))||(__CLR4_1_29do9dol3lqxsgy.R.iget(12274)==0&false))) {{ // prevents double exponent causing IOOBE
                    __CLR4_1_29do9dol3lqxsgy.R.inc(12275);throw new NumberFormatException(str + " is not a valid number.");
                }
                }__CLR4_1_29do9dol3lqxsgy.R.inc(12276);mant = str.substring(0, expPos);
            } }else {{
                __CLR4_1_29do9dol3lqxsgy.R.inc(12277);mant = str;
            }
            }__CLR4_1_29do9dol3lqxsgy.R.inc(12278);dec = null;
        }
        }__CLR4_1_29do9dol3lqxsgy.R.inc(12279);if ((((!Character.isDigit(lastChar) && lastChar != '.')&&(__CLR4_1_29do9dol3lqxsgy.R.iget(12280)!=0|true))||(__CLR4_1_29do9dol3lqxsgy.R.iget(12281)==0&false))) {{
            __CLR4_1_29do9dol3lqxsgy.R.inc(12282);if ((((expPos > -1 && expPos < str.length() - 1)&&(__CLR4_1_29do9dol3lqxsgy.R.iget(12283)!=0|true))||(__CLR4_1_29do9dol3lqxsgy.R.iget(12284)==0&false))) {{
                __CLR4_1_29do9dol3lqxsgy.R.inc(12285);exp = str.substring(expPos + 1, str.length() - 1);
            } }else {{
                __CLR4_1_29do9dol3lqxsgy.R.inc(12286);exp = null;
            }
            //Requesting a specific type..
            }__CLR4_1_29do9dol3lqxsgy.R.inc(12287);final String numeric = str.substring(0, str.length() - 1);
            __CLR4_1_29do9dol3lqxsgy.R.inc(12288);final boolean allZeros = isAllZeros(mant) && isAllZeros(exp);
            boolean __CLB4_1_2_bool0=false;__CLR4_1_29do9dol3lqxsgy.R.inc(12289);switch (lastChar) {
                case 'l' :if (!__CLB4_1_2_bool0) {__CLR4_1_29do9dol3lqxsgy.R.inc(12290);__CLB4_1_2_bool0=true;}
                case 'L' :if (!__CLB4_1_2_bool0) {__CLR4_1_29do9dol3lqxsgy.R.inc(12291);__CLB4_1_2_bool0=true;}
                    __CLR4_1_29do9dol3lqxsgy.R.inc(12292);if ((((dec == null
                        && exp == null
                        && (numeric.charAt(0) == '-' && isDigits(numeric.substring(1)) || isDigits(numeric)))&&(__CLR4_1_29do9dol3lqxsgy.R.iget(12293)!=0|true))||(__CLR4_1_29do9dol3lqxsgy.R.iget(12294)==0&false))) {{
                        __CLR4_1_29do9dol3lqxsgy.R.inc(12295);try {
                            __CLR4_1_29do9dol3lqxsgy.R.inc(12296);return createLong(numeric);
                        } catch (final NumberFormatException nfe) { // NOPMD
                            // Too big for a long
                        }
                        __CLR4_1_29do9dol3lqxsgy.R.inc(12297);return createBigInteger(numeric);

                    }
                    }__CLR4_1_29do9dol3lqxsgy.R.inc(12298);throw new NumberFormatException(str + " is not a valid number.");
                case 'f' :if (!__CLB4_1_2_bool0) {__CLR4_1_29do9dol3lqxsgy.R.inc(12299);__CLB4_1_2_bool0=true;}
                case 'F' :if (!__CLB4_1_2_bool0) {__CLR4_1_29do9dol3lqxsgy.R.inc(12300);__CLB4_1_2_bool0=true;}
                    __CLR4_1_29do9dol3lqxsgy.R.inc(12301);try {
                        __CLR4_1_29do9dol3lqxsgy.R.inc(12302);final Float f = NumberUtils.createFloat(numeric);
                        __CLR4_1_29do9dol3lqxsgy.R.inc(12303);if ((((!(f.isInfinite() || (f.floatValue() == 0.0F && !allZeros)))&&(__CLR4_1_29do9dol3lqxsgy.R.iget(12304)!=0|true))||(__CLR4_1_29do9dol3lqxsgy.R.iget(12305)==0&false))) {{
                            //If it's too big for a float or the float value = 0 and the string
                            //has non-zeros in it, then float does not have the precision we want
                            __CLR4_1_29do9dol3lqxsgy.R.inc(12306);return f;
                        }

                    }} catch (final NumberFormatException nfe) { // NOPMD
                        // ignore the bad number
                    }
                    //$FALL-THROUGH$
                case 'd' :if (!__CLB4_1_2_bool0) {__CLR4_1_29do9dol3lqxsgy.R.inc(12307);__CLB4_1_2_bool0=true;}
                case 'D' :if (!__CLB4_1_2_bool0) {__CLR4_1_29do9dol3lqxsgy.R.inc(12308);__CLB4_1_2_bool0=true;}
                    __CLR4_1_29do9dol3lqxsgy.R.inc(12309);try {
                        __CLR4_1_29do9dol3lqxsgy.R.inc(12310);final Double d = NumberUtils.createDouble(numeric);
                        __CLR4_1_29do9dol3lqxsgy.R.inc(12311);if ((((!(d.isInfinite() || (d.floatValue() == 0.0D && !allZeros)))&&(__CLR4_1_29do9dol3lqxsgy.R.iget(12312)!=0|true))||(__CLR4_1_29do9dol3lqxsgy.R.iget(12313)==0&false))) {{
                            __CLR4_1_29do9dol3lqxsgy.R.inc(12314);return d;
                        }
                    }} catch (final NumberFormatException nfe) { // NOPMD
                        // ignore the bad number
                    }
                    __CLR4_1_29do9dol3lqxsgy.R.inc(12315);try {
                        __CLR4_1_29do9dol3lqxsgy.R.inc(12316);return createBigDecimal(numeric);
                    } catch (final NumberFormatException e) { // NOPMD
                        // ignore the bad number
                    }
                    //$FALL-THROUGH$
                default :if (!__CLB4_1_2_bool0) {__CLR4_1_29do9dol3lqxsgy.R.inc(12317);__CLB4_1_2_bool0=true;}
                    __CLR4_1_29do9dol3lqxsgy.R.inc(12318);throw new NumberFormatException(str + " is not a valid number.");

            }
        }
        //User doesn't have a preference on the return type, so let's start
        //small and go from there...
        }__CLR4_1_29do9dol3lqxsgy.R.inc(12319);if ((((expPos > -1 && expPos < str.length() - 1)&&(__CLR4_1_29do9dol3lqxsgy.R.iget(12320)!=0|true))||(__CLR4_1_29do9dol3lqxsgy.R.iget(12321)==0&false))) {{
            __CLR4_1_29do9dol3lqxsgy.R.inc(12322);exp = str.substring(expPos + 1, str.length());
        } }else {{
            __CLR4_1_29do9dol3lqxsgy.R.inc(12323);exp = null;
        }
        }__CLR4_1_29do9dol3lqxsgy.R.inc(12324);if ((((dec == null && exp == null)&&(__CLR4_1_29do9dol3lqxsgy.R.iget(12325)!=0|true))||(__CLR4_1_29do9dol3lqxsgy.R.iget(12326)==0&false))) {{ // no decimal point and no exponent
            //Must be an Integer, Long, Biginteger
            __CLR4_1_29do9dol3lqxsgy.R.inc(12327);try {
                __CLR4_1_29do9dol3lqxsgy.R.inc(12328);return createInteger(str);
            } catch (final NumberFormatException nfe) { // NOPMD
                // ignore the bad number
            }
            __CLR4_1_29do9dol3lqxsgy.R.inc(12329);try {
                __CLR4_1_29do9dol3lqxsgy.R.inc(12330);return createLong(str);
            } catch (final NumberFormatException nfe) { // NOPMD
                // ignore the bad number
            }
            __CLR4_1_29do9dol3lqxsgy.R.inc(12331);return createBigInteger(str);
        }

        //Must be a Float, Double, BigDecimal
        }__CLR4_1_29do9dol3lqxsgy.R.inc(12332);final boolean allZeros = isAllZeros(mant) && isAllZeros(exp);
        __CLR4_1_29do9dol3lqxsgy.R.inc(12333);try {
                __CLR4_1_29do9dol3lqxsgy.R.inc(12334);final Float f = createFloat(str);
                __CLR4_1_29do9dol3lqxsgy.R.inc(12335);if ((((!(f.isInfinite() || (f.floatValue() == 0.0F && !allZeros)))&&(__CLR4_1_29do9dol3lqxsgy.R.iget(12336)!=0|true))||(__CLR4_1_29do9dol3lqxsgy.R.iget(12337)==0&false))) {{
                    __CLR4_1_29do9dol3lqxsgy.R.inc(12338);return f;
                }
        }} catch (final NumberFormatException nfe) { // NOPMD
            // ignore the bad number
        }
        __CLR4_1_29do9dol3lqxsgy.R.inc(12339);try {
                __CLR4_1_29do9dol3lqxsgy.R.inc(12340);final Double d = createDouble(str);
                __CLR4_1_29do9dol3lqxsgy.R.inc(12341);if ((((!(d.isInfinite() || (d.doubleValue() == 0.0D && !allZeros)))&&(__CLR4_1_29do9dol3lqxsgy.R.iget(12342)!=0|true))||(__CLR4_1_29do9dol3lqxsgy.R.iget(12343)==0&false))) {{
                    __CLR4_1_29do9dol3lqxsgy.R.inc(12344);return d;
                }
        }} catch (final NumberFormatException nfe) { // NOPMD
            // ignore the bad number
        }

        __CLR4_1_29do9dol3lqxsgy.R.inc(12345);return createBigDecimal(str);
    }finally{__CLR4_1_29do9dol3lqxsgy.R.flushNeeded();}}

    /**
     * <p>Utility method for {@link #createNumber(java.lang.String)}.</p>
     *
     * <p>Returns <code>true</code> if s is <code>null</code>.</p>
     * 
     * @param str  the String to check
     * @return if it is all zeros or <code>null</code>
     */
    private static boolean isAllZeros(final String str) {try{__CLR4_1_29do9dol3lqxsgy.R.inc(12346);
        __CLR4_1_29do9dol3lqxsgy.R.inc(12347);if ((((str == null)&&(__CLR4_1_29do9dol3lqxsgy.R.iget(12348)!=0|true))||(__CLR4_1_29do9dol3lqxsgy.R.iget(12349)==0&false))) {{
            __CLR4_1_29do9dol3lqxsgy.R.inc(12350);return true;
        }
        }__CLR4_1_29do9dol3lqxsgy.R.inc(12351);for (int i = str.length() - 1; (((i >= 0)&&(__CLR4_1_29do9dol3lqxsgy.R.iget(12352)!=0|true))||(__CLR4_1_29do9dol3lqxsgy.R.iget(12353)==0&false)); i--) {{
            __CLR4_1_29do9dol3lqxsgy.R.inc(12354);if ((((str.charAt(i) != '0')&&(__CLR4_1_29do9dol3lqxsgy.R.iget(12355)!=0|true))||(__CLR4_1_29do9dol3lqxsgy.R.iget(12356)==0&false))) {{
                __CLR4_1_29do9dol3lqxsgy.R.inc(12357);return false;
            }
        }}
        }__CLR4_1_29do9dol3lqxsgy.R.inc(12358);return str.length() > 0;
    }finally{__CLR4_1_29do9dol3lqxsgy.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * <p>Convert a <code>String</code> to a <code>Float</code>.</p>
     *
     * <p>Returns <code>null</code> if the string is <code>null</code>.</p>
     * 
     * @param str  a <code>String</code> to convert, may be null
     * @return converted <code>Float</code> (or null if the input is null)
     * @throws NumberFormatException if the value cannot be converted
     */
    public static Float createFloat(final String str) {try{__CLR4_1_29do9dol3lqxsgy.R.inc(12359);
        __CLR4_1_29do9dol3lqxsgy.R.inc(12360);if ((((str == null)&&(__CLR4_1_29do9dol3lqxsgy.R.iget(12361)!=0|true))||(__CLR4_1_29do9dol3lqxsgy.R.iget(12362)==0&false))) {{
            __CLR4_1_29do9dol3lqxsgy.R.inc(12363);return null;
        }
        }__CLR4_1_29do9dol3lqxsgy.R.inc(12364);return Float.valueOf(str);
    }finally{__CLR4_1_29do9dol3lqxsgy.R.flushNeeded();}}

    /**
     * <p>Convert a <code>String</code> to a <code>Double</code>.</p>
     * 
     * <p>Returns <code>null</code> if the string is <code>null</code>.</p>
     *
     * @param str  a <code>String</code> to convert, may be null
     * @return converted <code>Double</code> (or null if the input is null)
     * @throws NumberFormatException if the value cannot be converted
     */
    public static Double createDouble(final String str) {try{__CLR4_1_29do9dol3lqxsgy.R.inc(12365);
        __CLR4_1_29do9dol3lqxsgy.R.inc(12366);if ((((str == null)&&(__CLR4_1_29do9dol3lqxsgy.R.iget(12367)!=0|true))||(__CLR4_1_29do9dol3lqxsgy.R.iget(12368)==0&false))) {{
            __CLR4_1_29do9dol3lqxsgy.R.inc(12369);return null;
        }
        }__CLR4_1_29do9dol3lqxsgy.R.inc(12370);return Double.valueOf(str);
    }finally{__CLR4_1_29do9dol3lqxsgy.R.flushNeeded();}}

    /**
     * <p>Convert a <code>String</code> to a <code>Integer</code>, handling
     * hex and octal notations.</p>
     *
     * <p>Returns <code>null</code> if the string is <code>null</code>.</p>
     * 
     * @param str  a <code>String</code> to convert, may be null
     * @return converted <code>Integer</code> (or null if the input is null)
     * @throws NumberFormatException if the value cannot be converted
     */
    public static Integer createInteger(final String str) {try{__CLR4_1_29do9dol3lqxsgy.R.inc(12371);
        __CLR4_1_29do9dol3lqxsgy.R.inc(12372);if ((((str == null)&&(__CLR4_1_29do9dol3lqxsgy.R.iget(12373)!=0|true))||(__CLR4_1_29do9dol3lqxsgy.R.iget(12374)==0&false))) {{
            __CLR4_1_29do9dol3lqxsgy.R.inc(12375);return null;
        }
        // decode() handles 0xAABD and 0777 (hex and octal) as well.
        }__CLR4_1_29do9dol3lqxsgy.R.inc(12376);return Integer.decode(str);
    }finally{__CLR4_1_29do9dol3lqxsgy.R.flushNeeded();}}

    /**
     * <p>Convert a <code>String</code> to a <code>Long</code>; 
     * since 3.1 it handles hex and octal notations.</p>
     * 
     * <p>Returns <code>null</code> if the string is <code>null</code>.</p>
     *
     * @param str  a <code>String</code> to convert, may be null
     * @return converted <code>Long</code> (or null if the input is null)
     * @throws NumberFormatException if the value cannot be converted
     */
    public static Long createLong(final String str) {try{__CLR4_1_29do9dol3lqxsgy.R.inc(12377);
        __CLR4_1_29do9dol3lqxsgy.R.inc(12378);if ((((str == null)&&(__CLR4_1_29do9dol3lqxsgy.R.iget(12379)!=0|true))||(__CLR4_1_29do9dol3lqxsgy.R.iget(12380)==0&false))) {{
            __CLR4_1_29do9dol3lqxsgy.R.inc(12381);return null;
        }
        }__CLR4_1_29do9dol3lqxsgy.R.inc(12382);return Long.decode(str);
    }finally{__CLR4_1_29do9dol3lqxsgy.R.flushNeeded();}}

    /**
     * <p>Convert a <code>String</code> to a <code>BigInteger</code>;
     * since 3.2 it handles hex (0x or #) and octal (0) notations.</p>
     *
     * <p>Returns <code>null</code> if the string is <code>null</code>.</p>
     * 
     * @param str  a <code>String</code> to convert, may be null
     * @return converted <code>BigInteger</code> (or null if the input is null)
     * @throws NumberFormatException if the value cannot be converted
     */
    public static BigInteger createBigInteger(final String str) {try{__CLR4_1_29do9dol3lqxsgy.R.inc(12383);
        __CLR4_1_29do9dol3lqxsgy.R.inc(12384);if ((((str == null)&&(__CLR4_1_29do9dol3lqxsgy.R.iget(12385)!=0|true))||(__CLR4_1_29do9dol3lqxsgy.R.iget(12386)==0&false))) {{
            __CLR4_1_29do9dol3lqxsgy.R.inc(12387);return null;
        }
        }__CLR4_1_29do9dol3lqxsgy.R.inc(12388);int pos = 0; // offset within string
        __CLR4_1_29do9dol3lqxsgy.R.inc(12389);int radix = 10;
        __CLR4_1_29do9dol3lqxsgy.R.inc(12390);boolean negate = false; // need to negate later?
        __CLR4_1_29do9dol3lqxsgy.R.inc(12391);if ((((str.startsWith("-"))&&(__CLR4_1_29do9dol3lqxsgy.R.iget(12392)!=0|true))||(__CLR4_1_29do9dol3lqxsgy.R.iget(12393)==0&false))) {{
            __CLR4_1_29do9dol3lqxsgy.R.inc(12394);negate = true;
            __CLR4_1_29do9dol3lqxsgy.R.inc(12395);pos = 1;
        }
        }__CLR4_1_29do9dol3lqxsgy.R.inc(12396);if ((((str.startsWith("0x", pos) || str.startsWith("0x", pos))&&(__CLR4_1_29do9dol3lqxsgy.R.iget(12397)!=0|true))||(__CLR4_1_29do9dol3lqxsgy.R.iget(12398)==0&false))) {{ // hex
            __CLR4_1_29do9dol3lqxsgy.R.inc(12399);radix = 16;
            __CLR4_1_29do9dol3lqxsgy.R.inc(12400);pos += 2;
        } }else {__CLR4_1_29do9dol3lqxsgy.R.inc(12401);if ((((str.startsWith("#", pos))&&(__CLR4_1_29do9dol3lqxsgy.R.iget(12402)!=0|true))||(__CLR4_1_29do9dol3lqxsgy.R.iget(12403)==0&false))) {{ // alternative hex (allowed by Long/Integer)
            __CLR4_1_29do9dol3lqxsgy.R.inc(12404);radix = 16;
            __CLR4_1_29do9dol3lqxsgy.R.inc(12405);pos ++;
        } }else {__CLR4_1_29do9dol3lqxsgy.R.inc(12406);if ((((str.startsWith("0", pos) && str.length() > pos + 1)&&(__CLR4_1_29do9dol3lqxsgy.R.iget(12407)!=0|true))||(__CLR4_1_29do9dol3lqxsgy.R.iget(12408)==0&false))) {{ // octal; so long as there are additional digits
            __CLR4_1_29do9dol3lqxsgy.R.inc(12409);radix = 8;
            __CLR4_1_29do9dol3lqxsgy.R.inc(12410);pos ++;
        } // default is to treat as decimal

        }}}__CLR4_1_29do9dol3lqxsgy.R.inc(12411);final BigInteger value = new BigInteger(str.substring(pos), radix);
        __CLR4_1_29do9dol3lqxsgy.R.inc(12412);return (((negate )&&(__CLR4_1_29do9dol3lqxsgy.R.iget(12413)!=0|true))||(__CLR4_1_29do9dol3lqxsgy.R.iget(12414)==0&false))? value.negate() : value;
    }finally{__CLR4_1_29do9dol3lqxsgy.R.flushNeeded();}}

    /**
     * <p>Convert a <code>String</code> to a <code>BigDecimal</code>.</p>
     * 
     * <p>Returns <code>null</code> if the string is <code>null</code>.</p>
     *
     * @param str  a <code>String</code> to convert, may be null
     * @return converted <code>BigDecimal</code> (or null if the input is null)
     * @throws NumberFormatException if the value cannot be converted
     */
    public static BigDecimal createBigDecimal(final String str) {try{__CLR4_1_29do9dol3lqxsgy.R.inc(12415);
        __CLR4_1_29do9dol3lqxsgy.R.inc(12416);if ((((str == null)&&(__CLR4_1_29do9dol3lqxsgy.R.iget(12417)!=0|true))||(__CLR4_1_29do9dol3lqxsgy.R.iget(12418)==0&false))) {{
            __CLR4_1_29do9dol3lqxsgy.R.inc(12419);return null;
        }
        // handle JDK1.3.1 bug where "" throws IndexOutOfBoundsException
        }__CLR4_1_29do9dol3lqxsgy.R.inc(12420);if ((((StringUtils.isBlank(str))&&(__CLR4_1_29do9dol3lqxsgy.R.iget(12421)!=0|true))||(__CLR4_1_29do9dol3lqxsgy.R.iget(12422)==0&false))) {{
            __CLR4_1_29do9dol3lqxsgy.R.inc(12423);throw new NumberFormatException("A blank string is not a valid number");
        }
        }__CLR4_1_29do9dol3lqxsgy.R.inc(12424);if ((((str.trim().startsWith("--"))&&(__CLR4_1_29do9dol3lqxsgy.R.iget(12425)!=0|true))||(__CLR4_1_29do9dol3lqxsgy.R.iget(12426)==0&false))) {{
            // this is protection for poorness in java.lang.BigDecimal.
            // it accepts this as a legal value, but it does not appear 
            // to be in specification of class. OS X Java parses it to 
            // a wrong value.
            __CLR4_1_29do9dol3lqxsgy.R.inc(12427);throw new NumberFormatException(str + " is not a valid number.");
        }
        }__CLR4_1_29do9dol3lqxsgy.R.inc(12428);return new BigDecimal(str);
    }finally{__CLR4_1_29do9dol3lqxsgy.R.flushNeeded();}}

    // Min in array
    //--------------------------------------------------------------------
    /**
     * <p>Returns the minimum value in an array.</p>
     * 
     * @param array  an array, must not be null or empty
     * @return the minimum value in the array
     * @throws IllegalArgumentException if <code>array</code> is <code>null</code>
     * @throws IllegalArgumentException if <code>array</code> is empty
     */
    public static long min(final long[] array) {try{__CLR4_1_29do9dol3lqxsgy.R.inc(12429);
        // Validates input
        __CLR4_1_29do9dol3lqxsgy.R.inc(12430);validateArray(array);
    
        // Finds and returns min
        __CLR4_1_29do9dol3lqxsgy.R.inc(12431);long min = array[0];
        __CLR4_1_29do9dol3lqxsgy.R.inc(12432);for (int i = 1; (((i < array.length)&&(__CLR4_1_29do9dol3lqxsgy.R.iget(12433)!=0|true))||(__CLR4_1_29do9dol3lqxsgy.R.iget(12434)==0&false)); i++) {{
            __CLR4_1_29do9dol3lqxsgy.R.inc(12435);if ((((array[i] < min)&&(__CLR4_1_29do9dol3lqxsgy.R.iget(12436)!=0|true))||(__CLR4_1_29do9dol3lqxsgy.R.iget(12437)==0&false))) {{
                __CLR4_1_29do9dol3lqxsgy.R.inc(12438);min = array[i];
            }
        }}
    
        }__CLR4_1_29do9dol3lqxsgy.R.inc(12439);return min;
    }finally{__CLR4_1_29do9dol3lqxsgy.R.flushNeeded();}}

    /**
     * <p>Returns the minimum value in an array.</p>
     * 
     * @param array  an array, must not be null or empty
     * @return the minimum value in the array
     * @throws IllegalArgumentException if <code>array</code> is <code>null</code>
     * @throws IllegalArgumentException if <code>array</code> is empty
     */
    public static int min(final int[] array) {try{__CLR4_1_29do9dol3lqxsgy.R.inc(12440);
        // Validates input
        __CLR4_1_29do9dol3lqxsgy.R.inc(12441);validateArray(array);
    
        // Finds and returns min
        __CLR4_1_29do9dol3lqxsgy.R.inc(12442);int min = array[0];
        __CLR4_1_29do9dol3lqxsgy.R.inc(12443);for (int j = 1; (((j < array.length)&&(__CLR4_1_29do9dol3lqxsgy.R.iget(12444)!=0|true))||(__CLR4_1_29do9dol3lqxsgy.R.iget(12445)==0&false)); j++) {{
            __CLR4_1_29do9dol3lqxsgy.R.inc(12446);if ((((array[j] < min)&&(__CLR4_1_29do9dol3lqxsgy.R.iget(12447)!=0|true))||(__CLR4_1_29do9dol3lqxsgy.R.iget(12448)==0&false))) {{
                __CLR4_1_29do9dol3lqxsgy.R.inc(12449);min = array[j];
            }
        }}
    
        }__CLR4_1_29do9dol3lqxsgy.R.inc(12450);return min;
    }finally{__CLR4_1_29do9dol3lqxsgy.R.flushNeeded();}}

    /**
     * <p>Returns the minimum value in an array.</p>
     * 
     * @param array  an array, must not be null or empty
     * @return the minimum value in the array
     * @throws IllegalArgumentException if <code>array</code> is <code>null</code>
     * @throws IllegalArgumentException if <code>array</code> is empty
     */
    public static short min(final short[] array) {try{__CLR4_1_29do9dol3lqxsgy.R.inc(12451);
        // Validates input
        __CLR4_1_29do9dol3lqxsgy.R.inc(12452);validateArray(array);
    
        // Finds and returns min
        __CLR4_1_29do9dol3lqxsgy.R.inc(12453);short min = array[0];
        __CLR4_1_29do9dol3lqxsgy.R.inc(12454);for (int i = 1; (((i < array.length)&&(__CLR4_1_29do9dol3lqxsgy.R.iget(12455)!=0|true))||(__CLR4_1_29do9dol3lqxsgy.R.iget(12456)==0&false)); i++) {{
            __CLR4_1_29do9dol3lqxsgy.R.inc(12457);if ((((array[i] < min)&&(__CLR4_1_29do9dol3lqxsgy.R.iget(12458)!=0|true))||(__CLR4_1_29do9dol3lqxsgy.R.iget(12459)==0&false))) {{
                __CLR4_1_29do9dol3lqxsgy.R.inc(12460);min = array[i];
            }
        }}
    
        }__CLR4_1_29do9dol3lqxsgy.R.inc(12461);return min;
    }finally{__CLR4_1_29do9dol3lqxsgy.R.flushNeeded();}}

    /**
     * <p>Returns the minimum value in an array.</p>
     * 
     * @param array  an array, must not be null or empty
     * @return the minimum value in the array
     * @throws IllegalArgumentException if <code>array</code> is <code>null</code>
     * @throws IllegalArgumentException if <code>array</code> is empty
     */
    public static byte min(final byte[] array) {try{__CLR4_1_29do9dol3lqxsgy.R.inc(12462);
        // Validates input
        __CLR4_1_29do9dol3lqxsgy.R.inc(12463);validateArray(array);
    
        // Finds and returns min
        __CLR4_1_29do9dol3lqxsgy.R.inc(12464);byte min = array[0];
        __CLR4_1_29do9dol3lqxsgy.R.inc(12465);for (int i = 1; (((i < array.length)&&(__CLR4_1_29do9dol3lqxsgy.R.iget(12466)!=0|true))||(__CLR4_1_29do9dol3lqxsgy.R.iget(12467)==0&false)); i++) {{
            __CLR4_1_29do9dol3lqxsgy.R.inc(12468);if ((((array[i] < min)&&(__CLR4_1_29do9dol3lqxsgy.R.iget(12469)!=0|true))||(__CLR4_1_29do9dol3lqxsgy.R.iget(12470)==0&false))) {{
                __CLR4_1_29do9dol3lqxsgy.R.inc(12471);min = array[i];
            }
        }}
    
        }__CLR4_1_29do9dol3lqxsgy.R.inc(12472);return min;
    }finally{__CLR4_1_29do9dol3lqxsgy.R.flushNeeded();}}

     /**
     * <p>Returns the minimum value in an array.</p>
     * 
     * @param array  an array, must not be null or empty
     * @return the minimum value in the array
     * @throws IllegalArgumentException if <code>array</code> is <code>null</code>
     * @throws IllegalArgumentException if <code>array</code> is empty
     * @see IEEE754rUtils#min(double[]) IEEE754rUtils for a version of this method that handles NaN differently
     */
    public static double min(final double[] array) {try{__CLR4_1_29do9dol3lqxsgy.R.inc(12473);
        // Validates input
        __CLR4_1_29do9dol3lqxsgy.R.inc(12474);validateArray(array);
    
        // Finds and returns min
        __CLR4_1_29do9dol3lqxsgy.R.inc(12475);double min = array[0];
        __CLR4_1_29do9dol3lqxsgy.R.inc(12476);for (int i = 1; (((i < array.length)&&(__CLR4_1_29do9dol3lqxsgy.R.iget(12477)!=0|true))||(__CLR4_1_29do9dol3lqxsgy.R.iget(12478)==0&false)); i++) {{
            __CLR4_1_29do9dol3lqxsgy.R.inc(12479);if ((((Double.isNaN(array[i]))&&(__CLR4_1_29do9dol3lqxsgy.R.iget(12480)!=0|true))||(__CLR4_1_29do9dol3lqxsgy.R.iget(12481)==0&false))) {{
                __CLR4_1_29do9dol3lqxsgy.R.inc(12482);return Double.NaN;
            }
            }__CLR4_1_29do9dol3lqxsgy.R.inc(12483);if ((((array[i] < min)&&(__CLR4_1_29do9dol3lqxsgy.R.iget(12484)!=0|true))||(__CLR4_1_29do9dol3lqxsgy.R.iget(12485)==0&false))) {{
                __CLR4_1_29do9dol3lqxsgy.R.inc(12486);min = array[i];
            }
        }}
    
        }__CLR4_1_29do9dol3lqxsgy.R.inc(12487);return min;
    }finally{__CLR4_1_29do9dol3lqxsgy.R.flushNeeded();}}

    /**
     * <p>Returns the minimum value in an array.</p>
     * 
     * @param array  an array, must not be null or empty
     * @return the minimum value in the array
     * @throws IllegalArgumentException if <code>array</code> is <code>null</code>
     * @throws IllegalArgumentException if <code>array</code> is empty
     * @see IEEE754rUtils#min(float[]) IEEE754rUtils for a version of this method that handles NaN differently
     */
    public static float min(final float[] array) {try{__CLR4_1_29do9dol3lqxsgy.R.inc(12488);
        // Validates input
        __CLR4_1_29do9dol3lqxsgy.R.inc(12489);validateArray(array);
    
        // Finds and returns min
        __CLR4_1_29do9dol3lqxsgy.R.inc(12490);float min = array[0];
        __CLR4_1_29do9dol3lqxsgy.R.inc(12491);for (int i = 1; (((i < array.length)&&(__CLR4_1_29do9dol3lqxsgy.R.iget(12492)!=0|true))||(__CLR4_1_29do9dol3lqxsgy.R.iget(12493)==0&false)); i++) {{
            __CLR4_1_29do9dol3lqxsgy.R.inc(12494);if ((((Float.isNaN(array[i]))&&(__CLR4_1_29do9dol3lqxsgy.R.iget(12495)!=0|true))||(__CLR4_1_29do9dol3lqxsgy.R.iget(12496)==0&false))) {{
                __CLR4_1_29do9dol3lqxsgy.R.inc(12497);return Float.NaN;
            }
            }__CLR4_1_29do9dol3lqxsgy.R.inc(12498);if ((((array[i] < min)&&(__CLR4_1_29do9dol3lqxsgy.R.iget(12499)!=0|true))||(__CLR4_1_29do9dol3lqxsgy.R.iget(12500)==0&false))) {{
                __CLR4_1_29do9dol3lqxsgy.R.inc(12501);min = array[i];
            }
        }}
    
        }__CLR4_1_29do9dol3lqxsgy.R.inc(12502);return min;
    }finally{__CLR4_1_29do9dol3lqxsgy.R.flushNeeded();}}

    // Max in array
    //--------------------------------------------------------------------
    /**
     * <p>Returns the maximum value in an array.</p>
     * 
     * @param array  an array, must not be null or empty
     * @return the minimum value in the array
     * @throws IllegalArgumentException if <code>array</code> is <code>null</code>
     * @throws IllegalArgumentException if <code>array</code> is empty
     */
    public static long max(final long[] array) {try{__CLR4_1_29do9dol3lqxsgy.R.inc(12503);
        // Validates input
        __CLR4_1_29do9dol3lqxsgy.R.inc(12504);validateArray(array);

        // Finds and returns max
        __CLR4_1_29do9dol3lqxsgy.R.inc(12505);long max = array[0];
        __CLR4_1_29do9dol3lqxsgy.R.inc(12506);for (int j = 1; (((j < array.length)&&(__CLR4_1_29do9dol3lqxsgy.R.iget(12507)!=0|true))||(__CLR4_1_29do9dol3lqxsgy.R.iget(12508)==0&false)); j++) {{
            __CLR4_1_29do9dol3lqxsgy.R.inc(12509);if ((((array[j] > max)&&(__CLR4_1_29do9dol3lqxsgy.R.iget(12510)!=0|true))||(__CLR4_1_29do9dol3lqxsgy.R.iget(12511)==0&false))) {{
                __CLR4_1_29do9dol3lqxsgy.R.inc(12512);max = array[j];
            }
        }}

        }__CLR4_1_29do9dol3lqxsgy.R.inc(12513);return max;
    }finally{__CLR4_1_29do9dol3lqxsgy.R.flushNeeded();}}

    /**
     * <p>Returns the maximum value in an array.</p>
     * 
     * @param array  an array, must not be null or empty
     * @return the minimum value in the array
     * @throws IllegalArgumentException if <code>array</code> is <code>null</code>
     * @throws IllegalArgumentException if <code>array</code> is empty
     */
    public static int max(final int[] array) {try{__CLR4_1_29do9dol3lqxsgy.R.inc(12514);
        // Validates input
        __CLR4_1_29do9dol3lqxsgy.R.inc(12515);validateArray(array);
    
        // Finds and returns max
        __CLR4_1_29do9dol3lqxsgy.R.inc(12516);int max = array[0];
        __CLR4_1_29do9dol3lqxsgy.R.inc(12517);for (int j = 1; (((j < array.length)&&(__CLR4_1_29do9dol3lqxsgy.R.iget(12518)!=0|true))||(__CLR4_1_29do9dol3lqxsgy.R.iget(12519)==0&false)); j++) {{
            __CLR4_1_29do9dol3lqxsgy.R.inc(12520);if ((((array[j] > max)&&(__CLR4_1_29do9dol3lqxsgy.R.iget(12521)!=0|true))||(__CLR4_1_29do9dol3lqxsgy.R.iget(12522)==0&false))) {{
                __CLR4_1_29do9dol3lqxsgy.R.inc(12523);max = array[j];
            }
        }}
    
        }__CLR4_1_29do9dol3lqxsgy.R.inc(12524);return max;
    }finally{__CLR4_1_29do9dol3lqxsgy.R.flushNeeded();}}

    /**
     * <p>Returns the maximum value in an array.</p>
     * 
     * @param array  an array, must not be null or empty
     * @return the minimum value in the array
     * @throws IllegalArgumentException if <code>array</code> is <code>null</code>
     * @throws IllegalArgumentException if <code>array</code> is empty
     */
    public static short max(final short[] array) {try{__CLR4_1_29do9dol3lqxsgy.R.inc(12525);
        // Validates input
        __CLR4_1_29do9dol3lqxsgy.R.inc(12526);validateArray(array);
    
        // Finds and returns max
        __CLR4_1_29do9dol3lqxsgy.R.inc(12527);short max = array[0];
        __CLR4_1_29do9dol3lqxsgy.R.inc(12528);for (int i = 1; (((i < array.length)&&(__CLR4_1_29do9dol3lqxsgy.R.iget(12529)!=0|true))||(__CLR4_1_29do9dol3lqxsgy.R.iget(12530)==0&false)); i++) {{
            __CLR4_1_29do9dol3lqxsgy.R.inc(12531);if ((((array[i] > max)&&(__CLR4_1_29do9dol3lqxsgy.R.iget(12532)!=0|true))||(__CLR4_1_29do9dol3lqxsgy.R.iget(12533)==0&false))) {{
                __CLR4_1_29do9dol3lqxsgy.R.inc(12534);max = array[i];
            }
        }}
    
        }__CLR4_1_29do9dol3lqxsgy.R.inc(12535);return max;
    }finally{__CLR4_1_29do9dol3lqxsgy.R.flushNeeded();}}

    /**
     * <p>Returns the maximum value in an array.</p>
     * 
     * @param array  an array, must not be null or empty
     * @return the minimum value in the array
     * @throws IllegalArgumentException if <code>array</code> is <code>null</code>
     * @throws IllegalArgumentException if <code>array</code> is empty
     */
    public static byte max(final byte[] array) {try{__CLR4_1_29do9dol3lqxsgy.R.inc(12536);
        // Validates input
        __CLR4_1_29do9dol3lqxsgy.R.inc(12537);validateArray(array);
    
        // Finds and returns max
        __CLR4_1_29do9dol3lqxsgy.R.inc(12538);byte max = array[0];
        __CLR4_1_29do9dol3lqxsgy.R.inc(12539);for (int i = 1; (((i < array.length)&&(__CLR4_1_29do9dol3lqxsgy.R.iget(12540)!=0|true))||(__CLR4_1_29do9dol3lqxsgy.R.iget(12541)==0&false)); i++) {{
            __CLR4_1_29do9dol3lqxsgy.R.inc(12542);if ((((array[i] > max)&&(__CLR4_1_29do9dol3lqxsgy.R.iget(12543)!=0|true))||(__CLR4_1_29do9dol3lqxsgy.R.iget(12544)==0&false))) {{
                __CLR4_1_29do9dol3lqxsgy.R.inc(12545);max = array[i];
            }
        }}
    
        }__CLR4_1_29do9dol3lqxsgy.R.inc(12546);return max;
    }finally{__CLR4_1_29do9dol3lqxsgy.R.flushNeeded();}}

    /**
     * <p>Returns the maximum value in an array.</p>
     * 
     * @param array  an array, must not be null or empty
     * @return the minimum value in the array
     * @throws IllegalArgumentException if <code>array</code> is <code>null</code>
     * @throws IllegalArgumentException if <code>array</code> is empty
     * @see IEEE754rUtils#max(double[]) IEEE754rUtils for a version of this method that handles NaN differently
     */
    public static double max(final double[] array) {try{__CLR4_1_29do9dol3lqxsgy.R.inc(12547);
        // Validates input
        __CLR4_1_29do9dol3lqxsgy.R.inc(12548);validateArray(array);

        // Finds and returns max
        __CLR4_1_29do9dol3lqxsgy.R.inc(12549);double max = array[0];
        __CLR4_1_29do9dol3lqxsgy.R.inc(12550);for (int j = 1; (((j < array.length)&&(__CLR4_1_29do9dol3lqxsgy.R.iget(12551)!=0|true))||(__CLR4_1_29do9dol3lqxsgy.R.iget(12552)==0&false)); j++) {{
            __CLR4_1_29do9dol3lqxsgy.R.inc(12553);if ((((Double.isNaN(array[j]))&&(__CLR4_1_29do9dol3lqxsgy.R.iget(12554)!=0|true))||(__CLR4_1_29do9dol3lqxsgy.R.iget(12555)==0&false))) {{
                __CLR4_1_29do9dol3lqxsgy.R.inc(12556);return Double.NaN;
            }
            }__CLR4_1_29do9dol3lqxsgy.R.inc(12557);if ((((array[j] > max)&&(__CLR4_1_29do9dol3lqxsgy.R.iget(12558)!=0|true))||(__CLR4_1_29do9dol3lqxsgy.R.iget(12559)==0&false))) {{
                __CLR4_1_29do9dol3lqxsgy.R.inc(12560);max = array[j];
            }
        }}
    
        }__CLR4_1_29do9dol3lqxsgy.R.inc(12561);return max;
    }finally{__CLR4_1_29do9dol3lqxsgy.R.flushNeeded();}}

    /**
     * <p>Returns the maximum value in an array.</p>
     * 
     * @param array  an array, must not be null or empty
     * @return the minimum value in the array
     * @throws IllegalArgumentException if <code>array</code> is <code>null</code>
     * @throws IllegalArgumentException if <code>array</code> is empty
     * @see IEEE754rUtils#max(float[]) IEEE754rUtils for a version of this method that handles NaN differently
     */
    public static float max(final float[] array) {try{__CLR4_1_29do9dol3lqxsgy.R.inc(12562);
        // Validates input
        __CLR4_1_29do9dol3lqxsgy.R.inc(12563);validateArray(array);

        // Finds and returns max
        __CLR4_1_29do9dol3lqxsgy.R.inc(12564);float max = array[0];
        __CLR4_1_29do9dol3lqxsgy.R.inc(12565);for (int j = 1; (((j < array.length)&&(__CLR4_1_29do9dol3lqxsgy.R.iget(12566)!=0|true))||(__CLR4_1_29do9dol3lqxsgy.R.iget(12567)==0&false)); j++) {{
            __CLR4_1_29do9dol3lqxsgy.R.inc(12568);if ((((Float.isNaN(array[j]))&&(__CLR4_1_29do9dol3lqxsgy.R.iget(12569)!=0|true))||(__CLR4_1_29do9dol3lqxsgy.R.iget(12570)==0&false))) {{
                __CLR4_1_29do9dol3lqxsgy.R.inc(12571);return Float.NaN;
            }
            }__CLR4_1_29do9dol3lqxsgy.R.inc(12572);if ((((array[j] > max)&&(__CLR4_1_29do9dol3lqxsgy.R.iget(12573)!=0|true))||(__CLR4_1_29do9dol3lqxsgy.R.iget(12574)==0&false))) {{
                __CLR4_1_29do9dol3lqxsgy.R.inc(12575);max = array[j];
            }
        }}

        }__CLR4_1_29do9dol3lqxsgy.R.inc(12576);return max;
    }finally{__CLR4_1_29do9dol3lqxsgy.R.flushNeeded();}}

    /**
     * Checks if the specified array is neither null nor empty.
     *
     * @param array  the array to check
     * @throws IllegalArgumentException if {@code array} is either {@code null} or empty
     */
    private static void validateArray(final Object array) {try{__CLR4_1_29do9dol3lqxsgy.R.inc(12577);
        __CLR4_1_29do9dol3lqxsgy.R.inc(12578);if ((((array == null)&&(__CLR4_1_29do9dol3lqxsgy.R.iget(12579)!=0|true))||(__CLR4_1_29do9dol3lqxsgy.R.iget(12580)==0&false))) {{
            __CLR4_1_29do9dol3lqxsgy.R.inc(12581);throw new IllegalArgumentException("The Array must not be null");
        } }else {__CLR4_1_29do9dol3lqxsgy.R.inc(12582);if ((((Array.getLength(array) == 0)&&(__CLR4_1_29do9dol3lqxsgy.R.iget(12583)!=0|true))||(__CLR4_1_29do9dol3lqxsgy.R.iget(12584)==0&false))) {{
            __CLR4_1_29do9dol3lqxsgy.R.inc(12585);throw new IllegalArgumentException("Array cannot be empty.");
        }
    }}}finally{__CLR4_1_29do9dol3lqxsgy.R.flushNeeded();}}
     
    // 3 param min
    //-----------------------------------------------------------------------
    /**
     * <p>Gets the minimum of three <code>long</code> values.</p>
     * 
     * @param a  value 1
     * @param b  value 2
     * @param c  value 3
     * @return  the smallest of the values
     */
    public static long min(long a, final long b, final long c) {try{__CLR4_1_29do9dol3lqxsgy.R.inc(12586);
        __CLR4_1_29do9dol3lqxsgy.R.inc(12587);if ((((b < a)&&(__CLR4_1_29do9dol3lqxsgy.R.iget(12588)!=0|true))||(__CLR4_1_29do9dol3lqxsgy.R.iget(12589)==0&false))) {{
            __CLR4_1_29do9dol3lqxsgy.R.inc(12590);a = b;
        }
        }__CLR4_1_29do9dol3lqxsgy.R.inc(12591);if ((((c < a)&&(__CLR4_1_29do9dol3lqxsgy.R.iget(12592)!=0|true))||(__CLR4_1_29do9dol3lqxsgy.R.iget(12593)==0&false))) {{
            __CLR4_1_29do9dol3lqxsgy.R.inc(12594);a = c;
        }
        }__CLR4_1_29do9dol3lqxsgy.R.inc(12595);return a;
    }finally{__CLR4_1_29do9dol3lqxsgy.R.flushNeeded();}}

    /**
     * <p>Gets the minimum of three <code>int</code> values.</p>
     * 
     * @param a  value 1
     * @param b  value 2
     * @param c  value 3
     * @return  the smallest of the values
     */
    public static int min(int a, final int b, final int c) {try{__CLR4_1_29do9dol3lqxsgy.R.inc(12596);
        __CLR4_1_29do9dol3lqxsgy.R.inc(12597);if ((((b < a)&&(__CLR4_1_29do9dol3lqxsgy.R.iget(12598)!=0|true))||(__CLR4_1_29do9dol3lqxsgy.R.iget(12599)==0&false))) {{
            __CLR4_1_29do9dol3lqxsgy.R.inc(12600);a = b;
        }
        }__CLR4_1_29do9dol3lqxsgy.R.inc(12601);if ((((c < a)&&(__CLR4_1_29do9dol3lqxsgy.R.iget(12602)!=0|true))||(__CLR4_1_29do9dol3lqxsgy.R.iget(12603)==0&false))) {{
            __CLR4_1_29do9dol3lqxsgy.R.inc(12604);a = c;
        }
        }__CLR4_1_29do9dol3lqxsgy.R.inc(12605);return a;
    }finally{__CLR4_1_29do9dol3lqxsgy.R.flushNeeded();}}

    /**
     * <p>Gets the minimum of three <code>short</code> values.</p>
     * 
     * @param a  value 1
     * @param b  value 2
     * @param c  value 3
     * @return  the smallest of the values
     */
    public static short min(short a, final short b, final short c) {try{__CLR4_1_29do9dol3lqxsgy.R.inc(12606);
        __CLR4_1_29do9dol3lqxsgy.R.inc(12607);if ((((b < a)&&(__CLR4_1_29do9dol3lqxsgy.R.iget(12608)!=0|true))||(__CLR4_1_29do9dol3lqxsgy.R.iget(12609)==0&false))) {{
            __CLR4_1_29do9dol3lqxsgy.R.inc(12610);a = b;
        }
        }__CLR4_1_29do9dol3lqxsgy.R.inc(12611);if ((((c < a)&&(__CLR4_1_29do9dol3lqxsgy.R.iget(12612)!=0|true))||(__CLR4_1_29do9dol3lqxsgy.R.iget(12613)==0&false))) {{
            __CLR4_1_29do9dol3lqxsgy.R.inc(12614);a = c;
        }
        }__CLR4_1_29do9dol3lqxsgy.R.inc(12615);return a;
    }finally{__CLR4_1_29do9dol3lqxsgy.R.flushNeeded();}}

    /**
     * <p>Gets the minimum of three <code>byte</code> values.</p>
     * 
     * @param a  value 1
     * @param b  value 2
     * @param c  value 3
     * @return  the smallest of the values
     */
    public static byte min(byte a, final byte b, final byte c) {try{__CLR4_1_29do9dol3lqxsgy.R.inc(12616);
        __CLR4_1_29do9dol3lqxsgy.R.inc(12617);if ((((b < a)&&(__CLR4_1_29do9dol3lqxsgy.R.iget(12618)!=0|true))||(__CLR4_1_29do9dol3lqxsgy.R.iget(12619)==0&false))) {{
            __CLR4_1_29do9dol3lqxsgy.R.inc(12620);a = b;
        }
        }__CLR4_1_29do9dol3lqxsgy.R.inc(12621);if ((((c < a)&&(__CLR4_1_29do9dol3lqxsgy.R.iget(12622)!=0|true))||(__CLR4_1_29do9dol3lqxsgy.R.iget(12623)==0&false))) {{
            __CLR4_1_29do9dol3lqxsgy.R.inc(12624);a = c;
        }
        }__CLR4_1_29do9dol3lqxsgy.R.inc(12625);return a;
    }finally{__CLR4_1_29do9dol3lqxsgy.R.flushNeeded();}}

    /**
     * <p>Gets the minimum of three <code>double</code> values.</p>
     * 
     * <p>If any value is <code>NaN</code>, <code>NaN</code> is
     * returned. Infinity is handled.</p>
     * 
     * @param a  value 1
     * @param b  value 2
     * @param c  value 3
     * @return  the smallest of the values
     * @see IEEE754rUtils#min(double, double, double) for a version of this method that handles NaN differently
     */
    public static double min(final double a, final double b, final double c) {try{__CLR4_1_29do9dol3lqxsgy.R.inc(12626);
        __CLR4_1_29do9dol3lqxsgy.R.inc(12627);return Math.min(Math.min(a, b), c);
    }finally{__CLR4_1_29do9dol3lqxsgy.R.flushNeeded();}}

    /**
     * <p>Gets the minimum of three <code>float</code> values.</p>
     * 
     * <p>If any value is <code>NaN</code>, <code>NaN</code> is
     * returned. Infinity is handled.</p>
     *
     * @param a  value 1
     * @param b  value 2
     * @param c  value 3
     * @return  the smallest of the values
     * @see IEEE754rUtils#min(float, float, float) for a version of this method that handles NaN differently
     */
    public static float min(final float a, final float b, final float c) {try{__CLR4_1_29do9dol3lqxsgy.R.inc(12628);
        __CLR4_1_29do9dol3lqxsgy.R.inc(12629);return Math.min(Math.min(a, b), c);
    }finally{__CLR4_1_29do9dol3lqxsgy.R.flushNeeded();}}

    // 3 param max
    //-----------------------------------------------------------------------
    /**
     * <p>Gets the maximum of three <code>long</code> values.</p>
     * 
     * @param a  value 1
     * @param b  value 2
     * @param c  value 3
     * @return  the largest of the values
     */
    public static long max(long a, final long b, final long c) {try{__CLR4_1_29do9dol3lqxsgy.R.inc(12630);
        __CLR4_1_29do9dol3lqxsgy.R.inc(12631);if ((((b > a)&&(__CLR4_1_29do9dol3lqxsgy.R.iget(12632)!=0|true))||(__CLR4_1_29do9dol3lqxsgy.R.iget(12633)==0&false))) {{
            __CLR4_1_29do9dol3lqxsgy.R.inc(12634);a = b;
        }
        }__CLR4_1_29do9dol3lqxsgy.R.inc(12635);if ((((c > a)&&(__CLR4_1_29do9dol3lqxsgy.R.iget(12636)!=0|true))||(__CLR4_1_29do9dol3lqxsgy.R.iget(12637)==0&false))) {{
            __CLR4_1_29do9dol3lqxsgy.R.inc(12638);a = c;
        }
        }__CLR4_1_29do9dol3lqxsgy.R.inc(12639);return a;
    }finally{__CLR4_1_29do9dol3lqxsgy.R.flushNeeded();}}

    /**
     * <p>Gets the maximum of three <code>int</code> values.</p>
     * 
     * @param a  value 1
     * @param b  value 2
     * @param c  value 3
     * @return  the largest of the values
     */
    public static int max(int a, final int b, final int c) {try{__CLR4_1_29do9dol3lqxsgy.R.inc(12640);
        __CLR4_1_29do9dol3lqxsgy.R.inc(12641);if ((((b > a)&&(__CLR4_1_29do9dol3lqxsgy.R.iget(12642)!=0|true))||(__CLR4_1_29do9dol3lqxsgy.R.iget(12643)==0&false))) {{
            __CLR4_1_29do9dol3lqxsgy.R.inc(12644);a = b;
        }
        }__CLR4_1_29do9dol3lqxsgy.R.inc(12645);if ((((c > a)&&(__CLR4_1_29do9dol3lqxsgy.R.iget(12646)!=0|true))||(__CLR4_1_29do9dol3lqxsgy.R.iget(12647)==0&false))) {{
            __CLR4_1_29do9dol3lqxsgy.R.inc(12648);a = c;
        }
        }__CLR4_1_29do9dol3lqxsgy.R.inc(12649);return a;
    }finally{__CLR4_1_29do9dol3lqxsgy.R.flushNeeded();}}

    /**
     * <p>Gets the maximum of three <code>short</code> values.</p>
     * 
     * @param a  value 1
     * @param b  value 2
     * @param c  value 3
     * @return  the largest of the values
     */
    public static short max(short a, final short b, final short c) {try{__CLR4_1_29do9dol3lqxsgy.R.inc(12650);
        __CLR4_1_29do9dol3lqxsgy.R.inc(12651);if ((((b > a)&&(__CLR4_1_29do9dol3lqxsgy.R.iget(12652)!=0|true))||(__CLR4_1_29do9dol3lqxsgy.R.iget(12653)==0&false))) {{
            __CLR4_1_29do9dol3lqxsgy.R.inc(12654);a = b;
        }
        }__CLR4_1_29do9dol3lqxsgy.R.inc(12655);if ((((c > a)&&(__CLR4_1_29do9dol3lqxsgy.R.iget(12656)!=0|true))||(__CLR4_1_29do9dol3lqxsgy.R.iget(12657)==0&false))) {{
            __CLR4_1_29do9dol3lqxsgy.R.inc(12658);a = c;
        }
        }__CLR4_1_29do9dol3lqxsgy.R.inc(12659);return a;
    }finally{__CLR4_1_29do9dol3lqxsgy.R.flushNeeded();}}

    /**
     * <p>Gets the maximum of three <code>byte</code> values.</p>
     * 
     * @param a  value 1
     * @param b  value 2
     * @param c  value 3
     * @return  the largest of the values
     */
    public static byte max(byte a, final byte b, final byte c) {try{__CLR4_1_29do9dol3lqxsgy.R.inc(12660);
        __CLR4_1_29do9dol3lqxsgy.R.inc(12661);if ((((b > a)&&(__CLR4_1_29do9dol3lqxsgy.R.iget(12662)!=0|true))||(__CLR4_1_29do9dol3lqxsgy.R.iget(12663)==0&false))) {{
            __CLR4_1_29do9dol3lqxsgy.R.inc(12664);a = b;
        }
        }__CLR4_1_29do9dol3lqxsgy.R.inc(12665);if ((((c > a)&&(__CLR4_1_29do9dol3lqxsgy.R.iget(12666)!=0|true))||(__CLR4_1_29do9dol3lqxsgy.R.iget(12667)==0&false))) {{
            __CLR4_1_29do9dol3lqxsgy.R.inc(12668);a = c;
        }
        }__CLR4_1_29do9dol3lqxsgy.R.inc(12669);return a;
    }finally{__CLR4_1_29do9dol3lqxsgy.R.flushNeeded();}}

    /**
     * <p>Gets the maximum of three <code>double</code> values.</p>
     * 
     * <p>If any value is <code>NaN</code>, <code>NaN</code> is
     * returned. Infinity is handled.</p>
     *
     * @param a  value 1
     * @param b  value 2
     * @param c  value 3
     * @return  the largest of the values
     * @see IEEE754rUtils#max(double, double, double) for a version of this method that handles NaN differently
     */
    public static double max(final double a, final double b, final double c) {try{__CLR4_1_29do9dol3lqxsgy.R.inc(12670);
        __CLR4_1_29do9dol3lqxsgy.R.inc(12671);return Math.max(Math.max(a, b), c);
    }finally{__CLR4_1_29do9dol3lqxsgy.R.flushNeeded();}}

    /**
     * <p>Gets the maximum of three <code>float</code> values.</p>
     * 
     * <p>If any value is <code>NaN</code>, <code>NaN</code> is
     * returned. Infinity is handled.</p>
     *
     * @param a  value 1
     * @param b  value 2
     * @param c  value 3
     * @return  the largest of the values
     * @see IEEE754rUtils#max(float, float, float) for a version of this method that handles NaN differently
     */
    public static float max(final float a, final float b, final float c) {try{__CLR4_1_29do9dol3lqxsgy.R.inc(12672);
        __CLR4_1_29do9dol3lqxsgy.R.inc(12673);return Math.max(Math.max(a, b), c);
    }finally{__CLR4_1_29do9dol3lqxsgy.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * <p>Checks whether the <code>String</code> contains only
     * digit characters.</p>
     *
     * <p><code>Null</code> and empty String will return
     * <code>false</code>.</p>
     *
     * @param str  the <code>String</code> to check
     * @return <code>true</code> if str contains only Unicode numeric
     */
    public static boolean isDigits(final String str) {try{__CLR4_1_29do9dol3lqxsgy.R.inc(12674);
        __CLR4_1_29do9dol3lqxsgy.R.inc(12675);if ((((StringUtils.isEmpty(str))&&(__CLR4_1_29do9dol3lqxsgy.R.iget(12676)!=0|true))||(__CLR4_1_29do9dol3lqxsgy.R.iget(12677)==0&false))) {{
            __CLR4_1_29do9dol3lqxsgy.R.inc(12678);return false;
        }
        }__CLR4_1_29do9dol3lqxsgy.R.inc(12679);for (int i = 0; (((i < str.length())&&(__CLR4_1_29do9dol3lqxsgy.R.iget(12680)!=0|true))||(__CLR4_1_29do9dol3lqxsgy.R.iget(12681)==0&false)); i++) {{
            __CLR4_1_29do9dol3lqxsgy.R.inc(12682);if ((((!Character.isDigit(str.charAt(i)))&&(__CLR4_1_29do9dol3lqxsgy.R.iget(12683)!=0|true))||(__CLR4_1_29do9dol3lqxsgy.R.iget(12684)==0&false))) {{
                __CLR4_1_29do9dol3lqxsgy.R.inc(12685);return false;
            }
        }}
        }__CLR4_1_29do9dol3lqxsgy.R.inc(12686);return true;
    }finally{__CLR4_1_29do9dol3lqxsgy.R.flushNeeded();}}

    /**
     * <p>Checks whether the String a valid Java number.</p>
     *
     * <p>Valid numbers include hexadecimal marked with the <code>0x</code>
     * qualifier, scientific notation and numbers marked with a type
     * qualifier (e.g. 123L).</p>
     *
     * <p><code>Null</code> and empty String will return
     * <code>false</code>.</p>
     *
     * @param str  the <code>String</code> to check
     * @return <code>true</code> if the string is a correctly formatted number
     */
    public static boolean isNumber(final String str) {try{__CLR4_1_29do9dol3lqxsgy.R.inc(12687);
        __CLR4_1_29do9dol3lqxsgy.R.inc(12688);if ((((StringUtils.isEmpty(str))&&(__CLR4_1_29do9dol3lqxsgy.R.iget(12689)!=0|true))||(__CLR4_1_29do9dol3lqxsgy.R.iget(12690)==0&false))) {{
            __CLR4_1_29do9dol3lqxsgy.R.inc(12691);return false;
        }
        }__CLR4_1_29do9dol3lqxsgy.R.inc(12692);final char[] chars = str.toCharArray();
        __CLR4_1_29do9dol3lqxsgy.R.inc(12693);int sz = chars.length;
        __CLR4_1_29do9dol3lqxsgy.R.inc(12694);boolean hasExp = false;
        __CLR4_1_29do9dol3lqxsgy.R.inc(12695);boolean hasDecPoint = false;
        __CLR4_1_29do9dol3lqxsgy.R.inc(12696);boolean allowSigns = false;
        __CLR4_1_29do9dol3lqxsgy.R.inc(12697);boolean foundDigit = false;
        // deal with any possible sign up front
        __CLR4_1_29do9dol3lqxsgy.R.inc(12698);final int start = ((((chars[0] == '-') )&&(__CLR4_1_29do9dol3lqxsgy.R.iget(12699)!=0|true))||(__CLR4_1_29do9dol3lqxsgy.R.iget(12700)==0&false))? 1 : 0;
        __CLR4_1_29do9dol3lqxsgy.R.inc(12701);if ((((sz > start + 1 && chars[start] == '0' && chars[start + 1] == 'x')&&(__CLR4_1_29do9dol3lqxsgy.R.iget(12702)!=0|true))||(__CLR4_1_29do9dol3lqxsgy.R.iget(12703)==0&false))) {{
            __CLR4_1_29do9dol3lqxsgy.R.inc(12704);int i = start + 2;
            __CLR4_1_29do9dol3lqxsgy.R.inc(12705);if ((((i == sz)&&(__CLR4_1_29do9dol3lqxsgy.R.iget(12706)!=0|true))||(__CLR4_1_29do9dol3lqxsgy.R.iget(12707)==0&false))) {{
                __CLR4_1_29do9dol3lqxsgy.R.inc(12708);return false; // str == "0x"
            }
            // checking hex (it can't be anything else)
            }__CLR4_1_29do9dol3lqxsgy.R.inc(12709);for (; (((i < chars.length)&&(__CLR4_1_29do9dol3lqxsgy.R.iget(12710)!=0|true))||(__CLR4_1_29do9dol3lqxsgy.R.iget(12711)==0&false)); i++) {{
                __CLR4_1_29do9dol3lqxsgy.R.inc(12712);if (((((chars[i] < '0' || chars[i] > '9')
                    && (chars[i] < 'a' || chars[i] > 'f')
                    && (chars[i] < 'A' || chars[i] > 'F'))&&(__CLR4_1_29do9dol3lqxsgy.R.iget(12713)!=0|true))||(__CLR4_1_29do9dol3lqxsgy.R.iget(12714)==0&false))) {{
                    __CLR4_1_29do9dol3lqxsgy.R.inc(12715);return false;
                }
            }}
            }__CLR4_1_29do9dol3lqxsgy.R.inc(12716);return true;
        }
        }__CLR4_1_29do9dol3lqxsgy.R.inc(12717);sz--; // don't want to loop to the last char, check it afterwords
              // for type qualifiers
        __CLR4_1_29do9dol3lqxsgy.R.inc(12718);int i = start;
        // loop to the next to last char or to the last char if we need another digit to
        // make a valid number (e.g. chars[0..5] = "1234E")
        __CLR4_1_29do9dol3lqxsgy.R.inc(12719);while ((((i < sz || (i < sz + 1 && allowSigns && !foundDigit))&&(__CLR4_1_29do9dol3lqxsgy.R.iget(12720)!=0|true))||(__CLR4_1_29do9dol3lqxsgy.R.iget(12721)==0&false))) {{
            __CLR4_1_29do9dol3lqxsgy.R.inc(12722);if ((((chars[i] >= '0' && chars[i] <= '9')&&(__CLR4_1_29do9dol3lqxsgy.R.iget(12723)!=0|true))||(__CLR4_1_29do9dol3lqxsgy.R.iget(12724)==0&false))) {{
                __CLR4_1_29do9dol3lqxsgy.R.inc(12725);foundDigit = true;
                __CLR4_1_29do9dol3lqxsgy.R.inc(12726);allowSigns = false;

            } }else {__CLR4_1_29do9dol3lqxsgy.R.inc(12727);if ((((chars[i] == '.')&&(__CLR4_1_29do9dol3lqxsgy.R.iget(12728)!=0|true))||(__CLR4_1_29do9dol3lqxsgy.R.iget(12729)==0&false))) {{
                __CLR4_1_29do9dol3lqxsgy.R.inc(12730);if ((((hasDecPoint || hasExp)&&(__CLR4_1_29do9dol3lqxsgy.R.iget(12731)!=0|true))||(__CLR4_1_29do9dol3lqxsgy.R.iget(12732)==0&false))) {{
                    // two decimal points or dec in exponent   
                    __CLR4_1_29do9dol3lqxsgy.R.inc(12733);return false;
                }
                }__CLR4_1_29do9dol3lqxsgy.R.inc(12734);hasDecPoint = true;
            } }else {__CLR4_1_29do9dol3lqxsgy.R.inc(12735);if ((((chars[i] == 'e' || chars[i] == 'E')&&(__CLR4_1_29do9dol3lqxsgy.R.iget(12736)!=0|true))||(__CLR4_1_29do9dol3lqxsgy.R.iget(12737)==0&false))) {{
                // we've already taken care of hex.
                __CLR4_1_29do9dol3lqxsgy.R.inc(12738);if ((((hasExp)&&(__CLR4_1_29do9dol3lqxsgy.R.iget(12739)!=0|true))||(__CLR4_1_29do9dol3lqxsgy.R.iget(12740)==0&false))) {{
                    // two E's
                    __CLR4_1_29do9dol3lqxsgy.R.inc(12741);return false;
                }
                }__CLR4_1_29do9dol3lqxsgy.R.inc(12742);if ((((!foundDigit)&&(__CLR4_1_29do9dol3lqxsgy.R.iget(12743)!=0|true))||(__CLR4_1_29do9dol3lqxsgy.R.iget(12744)==0&false))) {{
                    __CLR4_1_29do9dol3lqxsgy.R.inc(12745);return false;
                }
                }__CLR4_1_29do9dol3lqxsgy.R.inc(12746);hasExp = true;
                __CLR4_1_29do9dol3lqxsgy.R.inc(12747);allowSigns = true;
            } }else {__CLR4_1_29do9dol3lqxsgy.R.inc(12748);if ((((chars[i] == '+' || chars[i] == '-')&&(__CLR4_1_29do9dol3lqxsgy.R.iget(12749)!=0|true))||(__CLR4_1_29do9dol3lqxsgy.R.iget(12750)==0&false))) {{
                __CLR4_1_29do9dol3lqxsgy.R.inc(12751);if ((((!allowSigns)&&(__CLR4_1_29do9dol3lqxsgy.R.iget(12752)!=0|true))||(__CLR4_1_29do9dol3lqxsgy.R.iget(12753)==0&false))) {{
                    __CLR4_1_29do9dol3lqxsgy.R.inc(12754);return false;
                }
                }__CLR4_1_29do9dol3lqxsgy.R.inc(12755);allowSigns = false;
                __CLR4_1_29do9dol3lqxsgy.R.inc(12756);foundDigit = false; // we need a digit after the E
            } }else {{
                __CLR4_1_29do9dol3lqxsgy.R.inc(12757);return false;
            }
            }}}}__CLR4_1_29do9dol3lqxsgy.R.inc(12758);i++;
        }
        }__CLR4_1_29do9dol3lqxsgy.R.inc(12759);if ((((i < chars.length)&&(__CLR4_1_29do9dol3lqxsgy.R.iget(12760)!=0|true))||(__CLR4_1_29do9dol3lqxsgy.R.iget(12761)==0&false))) {{
            __CLR4_1_29do9dol3lqxsgy.R.inc(12762);if ((((chars[i] >= '0' && chars[i] <= '9')&&(__CLR4_1_29do9dol3lqxsgy.R.iget(12763)!=0|true))||(__CLR4_1_29do9dol3lqxsgy.R.iget(12764)==0&false))) {{
                // no type qualifier, OK
                __CLR4_1_29do9dol3lqxsgy.R.inc(12765);return true;
            }
            }__CLR4_1_29do9dol3lqxsgy.R.inc(12766);if ((((chars[i] == 'e' || chars[i] == 'E')&&(__CLR4_1_29do9dol3lqxsgy.R.iget(12767)!=0|true))||(__CLR4_1_29do9dol3lqxsgy.R.iget(12768)==0&false))) {{
                // can't have an E at the last byte
                __CLR4_1_29do9dol3lqxsgy.R.inc(12769);return false;
            }
            }__CLR4_1_29do9dol3lqxsgy.R.inc(12770);if ((((chars[i] == '.')&&(__CLR4_1_29do9dol3lqxsgy.R.iget(12771)!=0|true))||(__CLR4_1_29do9dol3lqxsgy.R.iget(12772)==0&false))) {{
                __CLR4_1_29do9dol3lqxsgy.R.inc(12773);if ((((hasDecPoint || hasExp)&&(__CLR4_1_29do9dol3lqxsgy.R.iget(12774)!=0|true))||(__CLR4_1_29do9dol3lqxsgy.R.iget(12775)==0&false))) {{
                    // two decimal points or dec in exponent
                    __CLR4_1_29do9dol3lqxsgy.R.inc(12776);return false;
                }
                // single trailing decimal point after non-exponent is ok
                }__CLR4_1_29do9dol3lqxsgy.R.inc(12777);return foundDigit;
            }
            }__CLR4_1_29do9dol3lqxsgy.R.inc(12778);if ((((!allowSigns
                && (chars[i] == 'd'
                    || chars[i] == 'D'
                    || chars[i] == 'f'
                    || chars[i] == 'F'))&&(__CLR4_1_29do9dol3lqxsgy.R.iget(12779)!=0|true))||(__CLR4_1_29do9dol3lqxsgy.R.iget(12780)==0&false))) {{
                __CLR4_1_29do9dol3lqxsgy.R.inc(12781);return foundDigit;
            }
            }__CLR4_1_29do9dol3lqxsgy.R.inc(12782);if ((((chars[i] == 'l'
                || chars[i] == 'L')&&(__CLR4_1_29do9dol3lqxsgy.R.iget(12783)!=0|true))||(__CLR4_1_29do9dol3lqxsgy.R.iget(12784)==0&false))) {{
                // not allowing L with an exponent or decimal point
                __CLR4_1_29do9dol3lqxsgy.R.inc(12785);return foundDigit && !hasExp && !hasDecPoint;
            }
            // last character is illegal
            }__CLR4_1_29do9dol3lqxsgy.R.inc(12786);return false;
        }
        // allowSigns is true iff the val ends in 'E'
        // found digit it to make sure weird stuff like '.' and '1E-' doesn't pass
        }__CLR4_1_29do9dol3lqxsgy.R.inc(12787);return !allowSigns && foundDigit;
    }finally{__CLR4_1_29do9dol3lqxsgy.R.flushNeeded();}}

}
