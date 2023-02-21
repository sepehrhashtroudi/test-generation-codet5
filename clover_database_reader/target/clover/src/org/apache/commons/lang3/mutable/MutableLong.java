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
package org.apache.commons.lang3.mutable;

/**
 * A mutable <code>long</code> wrapper.
 * <p>
 * Note that as MutableLong does not extend Long, it is not treated by String.format as a Long parameter. 
 * 
 * @see Long
 * @since 2.1
 * @version $Id$
 */
public class MutableLong extends Number implements Comparable<MutableLong>, Mutable<Number> {public static class __CLR4_1_2a2ga2gl3lqxsi0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492827633L,8589935092L,13104,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Required for serialization support.
     * 
     * @see java.io.Serializable
     */
    private static final long serialVersionUID = 62986528375L;

    /** The mutable value. */
    private long value;

    /**
     * Constructs a new MutableLong with the default value of zero.
     */
    public MutableLong() {
        super();__CLR4_1_2a2ga2gl3lqxsi0.R.inc(13049);try{__CLR4_1_2a2ga2gl3lqxsi0.R.inc(13048);
    }finally{__CLR4_1_2a2ga2gl3lqxsi0.R.flushNeeded();}}

    /**
     * Constructs a new MutableLong with the specified value.
     * 
     * @param value  the initial value to store
     */
    public MutableLong(final long value) {
        super();__CLR4_1_2a2ga2gl3lqxsi0.R.inc(13051);try{__CLR4_1_2a2ga2gl3lqxsi0.R.inc(13050);
        __CLR4_1_2a2ga2gl3lqxsi0.R.inc(13052);this.value = value;
    }finally{__CLR4_1_2a2ga2gl3lqxsi0.R.flushNeeded();}}

    /**
     * Constructs a new MutableLong with the specified value.
     * 
     * @param value  the initial value to store, not null
     * @throws NullPointerException if the object is null
     */
    public MutableLong(final Number value) {
        super();__CLR4_1_2a2ga2gl3lqxsi0.R.inc(13054);try{__CLR4_1_2a2ga2gl3lqxsi0.R.inc(13053);
        __CLR4_1_2a2ga2gl3lqxsi0.R.inc(13055);this.value = value.longValue();
    }finally{__CLR4_1_2a2ga2gl3lqxsi0.R.flushNeeded();}}

    /**
     * Constructs a new MutableLong parsing the given string.
     * 
     * @param value  the string to parse, not null
     * @throws NumberFormatException if the string cannot be parsed into a long
     * @since 2.5
     */
    public MutableLong(final String value) throws NumberFormatException {
        super();__CLR4_1_2a2ga2gl3lqxsi0.R.inc(13057);try{__CLR4_1_2a2ga2gl3lqxsi0.R.inc(13056);
        __CLR4_1_2a2ga2gl3lqxsi0.R.inc(13058);this.value = Long.parseLong(value);
    }finally{__CLR4_1_2a2ga2gl3lqxsi0.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets the value as a Long instance.
     * 
     * @return the value as a Long, never null
     */
    @Override
    public Long getValue() {try{__CLR4_1_2a2ga2gl3lqxsi0.R.inc(13059);
        __CLR4_1_2a2ga2gl3lqxsi0.R.inc(13060);return Long.valueOf(this.value);
    }finally{__CLR4_1_2a2ga2gl3lqxsi0.R.flushNeeded();}}

    /**
     * Sets the value.
     * 
     * @param value  the value to set
     */
    public void setValue(final long value) {try{__CLR4_1_2a2ga2gl3lqxsi0.R.inc(13061);
        __CLR4_1_2a2ga2gl3lqxsi0.R.inc(13062);this.value = value;
    }finally{__CLR4_1_2a2ga2gl3lqxsi0.R.flushNeeded();}}

    /**
     * Sets the value from any Number instance.
     * 
     * @param value  the value to set, not null
     * @throws NullPointerException if the object is null
     */
    @Override
    public void setValue(final Number value) {try{__CLR4_1_2a2ga2gl3lqxsi0.R.inc(13063);
        __CLR4_1_2a2ga2gl3lqxsi0.R.inc(13064);this.value = value.longValue();
    }finally{__CLR4_1_2a2ga2gl3lqxsi0.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Increments the value.
     *
     * @since Commons Lang 2.2
     */
    public void increment() {try{__CLR4_1_2a2ga2gl3lqxsi0.R.inc(13065);
        __CLR4_1_2a2ga2gl3lqxsi0.R.inc(13066);value++;
    }finally{__CLR4_1_2a2ga2gl3lqxsi0.R.flushNeeded();}}

    /**
     * Decrements the value.
     *
     * @since Commons Lang 2.2
     */
    public void decrement() {try{__CLR4_1_2a2ga2gl3lqxsi0.R.inc(13067);
        __CLR4_1_2a2ga2gl3lqxsi0.R.inc(13068);value--;
    }finally{__CLR4_1_2a2ga2gl3lqxsi0.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Adds a value to the value of this instance.
     * 
     * @param operand  the value to add, not null
     * @since Commons Lang 2.2
     */
    public void add(final long operand) {try{__CLR4_1_2a2ga2gl3lqxsi0.R.inc(13069);
        __CLR4_1_2a2ga2gl3lqxsi0.R.inc(13070);this.value += operand;
    }finally{__CLR4_1_2a2ga2gl3lqxsi0.R.flushNeeded();}}

    /**
     * Adds a value to the value of this instance.
     * 
     * @param operand  the value to add, not null
     * @throws NullPointerException if the object is null
     * @since Commons Lang 2.2
     */
    public void add(final Number operand) {try{__CLR4_1_2a2ga2gl3lqxsi0.R.inc(13071);
        __CLR4_1_2a2ga2gl3lqxsi0.R.inc(13072);this.value += operand.longValue();
    }finally{__CLR4_1_2a2ga2gl3lqxsi0.R.flushNeeded();}}

    /**
     * Subtracts a value from the value of this instance.
     * 
     * @param operand  the value to subtract, not null
     * @since Commons Lang 2.2
     */
    public void subtract(final long operand) {try{__CLR4_1_2a2ga2gl3lqxsi0.R.inc(13073);
        __CLR4_1_2a2ga2gl3lqxsi0.R.inc(13074);this.value -= operand;
    }finally{__CLR4_1_2a2ga2gl3lqxsi0.R.flushNeeded();}}

    /**
     * Subtracts a value from the value of this instance.
     * 
     * @param operand  the value to subtract, not null
     * @throws NullPointerException if the object is null
     * @since Commons Lang 2.2
     */
    public void subtract(final Number operand) {try{__CLR4_1_2a2ga2gl3lqxsi0.R.inc(13075);
        __CLR4_1_2a2ga2gl3lqxsi0.R.inc(13076);this.value -= operand.longValue();
    }finally{__CLR4_1_2a2ga2gl3lqxsi0.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    // shortValue and byteValue rely on Number implementation
    /**
     * Returns the value of this MutableLong as an int.
     *
     * @return the numeric value represented by this object after conversion to type int.
     */
    @Override
    public int intValue() {try{__CLR4_1_2a2ga2gl3lqxsi0.R.inc(13077);
        __CLR4_1_2a2ga2gl3lqxsi0.R.inc(13078);return (int) value;
    }finally{__CLR4_1_2a2ga2gl3lqxsi0.R.flushNeeded();}}

    /**
     * Returns the value of this MutableLong as a long.
     *
     * @return the numeric value represented by this object after conversion to type long.
     */
    @Override
    public long longValue() {try{__CLR4_1_2a2ga2gl3lqxsi0.R.inc(13079);
        __CLR4_1_2a2ga2gl3lqxsi0.R.inc(13080);return value;
    }finally{__CLR4_1_2a2ga2gl3lqxsi0.R.flushNeeded();}}

    /**
     * Returns the value of this MutableLong as a float.
     *
     * @return the numeric value represented by this object after conversion to type float.
     */
    @Override
    public float floatValue() {try{__CLR4_1_2a2ga2gl3lqxsi0.R.inc(13081);
        __CLR4_1_2a2ga2gl3lqxsi0.R.inc(13082);return value;
    }finally{__CLR4_1_2a2ga2gl3lqxsi0.R.flushNeeded();}}

    /**
     * Returns the value of this MutableLong as a double.
     *
     * @return the numeric value represented by this object after conversion to type double.
     */
    @Override
    public double doubleValue() {try{__CLR4_1_2a2ga2gl3lqxsi0.R.inc(13083);
        __CLR4_1_2a2ga2gl3lqxsi0.R.inc(13084);return value;
    }finally{__CLR4_1_2a2ga2gl3lqxsi0.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets this mutable as an instance of Long.
     *
     * @return a Long instance containing the value from this mutable, never null
     */
    public Long toLong() {try{__CLR4_1_2a2ga2gl3lqxsi0.R.inc(13085);
        __CLR4_1_2a2ga2gl3lqxsi0.R.inc(13086);return Long.valueOf(longValue());
    }finally{__CLR4_1_2a2ga2gl3lqxsi0.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Compares this object to the specified object. The result is <code>true</code> if and only if the argument
     * is not <code>null</code> and is a <code>MutableLong</code> object that contains the same <code>long</code>
     * value as this object.
     * 
     * @param obj  the object to compare with, null returns false
     * @return <code>true</code> if the objects are the same; <code>false</code> otherwise.
     */
    @Override
    public boolean equals(final Object obj) {try{__CLR4_1_2a2ga2gl3lqxsi0.R.inc(13087);
        __CLR4_1_2a2ga2gl3lqxsi0.R.inc(13088);if ((((obj instanceof MutableLong)&&(__CLR4_1_2a2ga2gl3lqxsi0.R.iget(13089)!=0|true))||(__CLR4_1_2a2ga2gl3lqxsi0.R.iget(13090)==0&false))) {{
            __CLR4_1_2a2ga2gl3lqxsi0.R.inc(13091);return value == ((MutableLong) obj).longValue();
        }
        }__CLR4_1_2a2ga2gl3lqxsi0.R.inc(13092);return false;
    }finally{__CLR4_1_2a2ga2gl3lqxsi0.R.flushNeeded();}}

    /**
     * Returns a suitable hash code for this mutable.
     * 
     * @return a suitable hash code
     */
    @Override
    public int hashCode() {try{__CLR4_1_2a2ga2gl3lqxsi0.R.inc(13093);
        __CLR4_1_2a2ga2gl3lqxsi0.R.inc(13094);return (int) (value ^ (value >>> 32));
    }finally{__CLR4_1_2a2ga2gl3lqxsi0.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Compares this mutable to another in ascending order.
     * 
     * @param other  the other mutable to compare to, not null
     * @return negative if this is less, zero if equal, positive if greater
     */
    @Override
    public int compareTo(final MutableLong other) {try{__CLR4_1_2a2ga2gl3lqxsi0.R.inc(13095);
        __CLR4_1_2a2ga2gl3lqxsi0.R.inc(13096);final long anotherVal = other.value;
        __CLR4_1_2a2ga2gl3lqxsi0.R.inc(13097);return (((value < anotherVal )&&(__CLR4_1_2a2ga2gl3lqxsi0.R.iget(13098)!=0|true))||(__CLR4_1_2a2ga2gl3lqxsi0.R.iget(13099)==0&false))? -1 : ((((value == anotherVal )&&(__CLR4_1_2a2ga2gl3lqxsi0.R.iget(13100)!=0|true))||(__CLR4_1_2a2ga2gl3lqxsi0.R.iget(13101)==0&false))? 0 : 1);
    }finally{__CLR4_1_2a2ga2gl3lqxsi0.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Returns the String value of this mutable.
     * 
     * @return the mutable value as a string
     */
    @Override
    public String toString() {try{__CLR4_1_2a2ga2gl3lqxsi0.R.inc(13102);
        __CLR4_1_2a2ga2gl3lqxsi0.R.inc(13103);return String.valueOf(value);
    }finally{__CLR4_1_2a2ga2gl3lqxsi0.R.flushNeeded();}}

}
