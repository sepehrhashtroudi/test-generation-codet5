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
 * A mutable <code>short</code> wrapper.
 * <p>
 * Note that as MutableShort does not extend Short, it is not treated by String.format as a Short parameter. 
 * 
 * @see Short
 * @since 2.1
 * @version $Id$
 */
public class MutableShort extends Number implements Comparable<MutableShort>, Mutable<Number> {public static class __CLR4_1_2a4wa4wl3lqxsi9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492827633L,8589935092L,13194,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Required for serialization support.
     * 
     * @see java.io.Serializable
     */
    private static final long serialVersionUID = -2135791679L;

    /** The mutable value. */
    private short value;

    /**
     * Constructs a new MutableShort with the default value of zero.
     */
    public MutableShort() {
        super();__CLR4_1_2a4wa4wl3lqxsi9.R.inc(13137);try{__CLR4_1_2a4wa4wl3lqxsi9.R.inc(13136);
    }finally{__CLR4_1_2a4wa4wl3lqxsi9.R.flushNeeded();}}

    /**
     * Constructs a new MutableShort with the specified value.
     * 
     * @param value  the initial value to store
     */
    public MutableShort(final short value) {
        super();__CLR4_1_2a4wa4wl3lqxsi9.R.inc(13139);try{__CLR4_1_2a4wa4wl3lqxsi9.R.inc(13138);
        __CLR4_1_2a4wa4wl3lqxsi9.R.inc(13140);this.value = value;
    }finally{__CLR4_1_2a4wa4wl3lqxsi9.R.flushNeeded();}}

    /**
     * Constructs a new MutableShort with the specified value.
     * 
     * @param value  the initial value to store, not null
     * @throws NullPointerException if the object is null
     */
    public MutableShort(final Number value) {
        super();__CLR4_1_2a4wa4wl3lqxsi9.R.inc(13142);try{__CLR4_1_2a4wa4wl3lqxsi9.R.inc(13141);
        __CLR4_1_2a4wa4wl3lqxsi9.R.inc(13143);this.value = value.shortValue();
    }finally{__CLR4_1_2a4wa4wl3lqxsi9.R.flushNeeded();}}

    /**
     * Constructs a new MutableShort parsing the given string.
     * 
     * @param value  the string to parse, not null
     * @throws NumberFormatException if the string cannot be parsed into a short
     * @since 2.5
     */
    public MutableShort(final String value) throws NumberFormatException {
        super();__CLR4_1_2a4wa4wl3lqxsi9.R.inc(13145);try{__CLR4_1_2a4wa4wl3lqxsi9.R.inc(13144);
        __CLR4_1_2a4wa4wl3lqxsi9.R.inc(13146);this.value = Short.parseShort(value);
    }finally{__CLR4_1_2a4wa4wl3lqxsi9.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets the value as a Short instance.
     * 
     * @return the value as a Short, never null
     */
    @Override
    public Short getValue() {try{__CLR4_1_2a4wa4wl3lqxsi9.R.inc(13147);
        __CLR4_1_2a4wa4wl3lqxsi9.R.inc(13148);return Short.valueOf(this.value);
    }finally{__CLR4_1_2a4wa4wl3lqxsi9.R.flushNeeded();}}

    /**
     * Sets the value.
     * 
     * @param value  the value to set
     */
    public void setValue(final short value) {try{__CLR4_1_2a4wa4wl3lqxsi9.R.inc(13149);
        __CLR4_1_2a4wa4wl3lqxsi9.R.inc(13150);this.value = value;
    }finally{__CLR4_1_2a4wa4wl3lqxsi9.R.flushNeeded();}}

    /**
     * Sets the value from any Number instance.
     * 
     * @param value  the value to set, not null
     * @throws NullPointerException if the object is null
     */
    @Override
    public void setValue(final Number value) {try{__CLR4_1_2a4wa4wl3lqxsi9.R.inc(13151);
        __CLR4_1_2a4wa4wl3lqxsi9.R.inc(13152);this.value = value.shortValue();
    }finally{__CLR4_1_2a4wa4wl3lqxsi9.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Increments the value.
     *
     * @since Commons Lang 2.2
     */
    public void increment() {try{__CLR4_1_2a4wa4wl3lqxsi9.R.inc(13153);
        __CLR4_1_2a4wa4wl3lqxsi9.R.inc(13154);value++;
    }finally{__CLR4_1_2a4wa4wl3lqxsi9.R.flushNeeded();}}

    /**
     * Decrements the value.
     *
     * @since Commons Lang 2.2
     */
    public void decrement() {try{__CLR4_1_2a4wa4wl3lqxsi9.R.inc(13155);
        __CLR4_1_2a4wa4wl3lqxsi9.R.inc(13156);value--;
    }finally{__CLR4_1_2a4wa4wl3lqxsi9.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Adds a value to the value of this instance.
     * 
     * @param operand  the value to add, not null
     * @since Commons Lang 2.2
     */
    public void add(final short operand) {try{__CLR4_1_2a4wa4wl3lqxsi9.R.inc(13157);
        __CLR4_1_2a4wa4wl3lqxsi9.R.inc(13158);this.value += operand;
    }finally{__CLR4_1_2a4wa4wl3lqxsi9.R.flushNeeded();}}

    /**
     * Adds a value to the value of this instance.
     * 
     * @param operand  the value to add, not null
     * @throws NullPointerException if the object is null
     * @since Commons Lang 2.2
     */
    public void add(final Number operand) {try{__CLR4_1_2a4wa4wl3lqxsi9.R.inc(13159);
        __CLR4_1_2a4wa4wl3lqxsi9.R.inc(13160);this.value += operand.shortValue();
    }finally{__CLR4_1_2a4wa4wl3lqxsi9.R.flushNeeded();}}

    /**
     * Subtracts a value from the value of this instance.
     * 
     * @param operand  the value to subtract, not null
     * @since Commons Lang 2.2
     */
    public void subtract(final short operand) {try{__CLR4_1_2a4wa4wl3lqxsi9.R.inc(13161);
        __CLR4_1_2a4wa4wl3lqxsi9.R.inc(13162);this.value -= operand;
    }finally{__CLR4_1_2a4wa4wl3lqxsi9.R.flushNeeded();}}

    /**
     * Subtracts a value from the value of this instance.
     * 
     * @param operand  the value to subtract, not null
     * @throws NullPointerException if the object is null
     * @since Commons Lang 2.2
     */
    public void subtract(final Number operand) {try{__CLR4_1_2a4wa4wl3lqxsi9.R.inc(13163);
        __CLR4_1_2a4wa4wl3lqxsi9.R.inc(13164);this.value -= operand.shortValue();
    }finally{__CLR4_1_2a4wa4wl3lqxsi9.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    // byteValue relies on Number implementation
    /**
     * Returns the value of this MutableShort as a short.
     *
     * @return the numeric value represented by this object after conversion to type short.
     */
    @Override
    public short shortValue() {try{__CLR4_1_2a4wa4wl3lqxsi9.R.inc(13165);
        __CLR4_1_2a4wa4wl3lqxsi9.R.inc(13166);return value;
    }finally{__CLR4_1_2a4wa4wl3lqxsi9.R.flushNeeded();}}

    /**
     * Returns the value of this MutableShort as an int.
     *
     * @return the numeric value represented by this object after conversion to type int.
     */
    @Override
    public int intValue() {try{__CLR4_1_2a4wa4wl3lqxsi9.R.inc(13167);
        __CLR4_1_2a4wa4wl3lqxsi9.R.inc(13168);return value;
    }finally{__CLR4_1_2a4wa4wl3lqxsi9.R.flushNeeded();}}

    /**
     * Returns the value of this MutableShort as a long.
     *
     * @return the numeric value represented by this object after conversion to type long.
     */
    @Override
    public long longValue() {try{__CLR4_1_2a4wa4wl3lqxsi9.R.inc(13169);
        __CLR4_1_2a4wa4wl3lqxsi9.R.inc(13170);return value;
    }finally{__CLR4_1_2a4wa4wl3lqxsi9.R.flushNeeded();}}

    /**
     * Returns the value of this MutableShort as a float.
     *
     * @return the numeric value represented by this object after conversion to type float.
     */
    @Override
    public float floatValue() {try{__CLR4_1_2a4wa4wl3lqxsi9.R.inc(13171);
        __CLR4_1_2a4wa4wl3lqxsi9.R.inc(13172);return value;
    }finally{__CLR4_1_2a4wa4wl3lqxsi9.R.flushNeeded();}}

    /**
     * Returns the value of this MutableShort as a double.
     *
     * @return the numeric value represented by this object after conversion to type double.
     */
    @Override
    public double doubleValue() {try{__CLR4_1_2a4wa4wl3lqxsi9.R.inc(13173);
        __CLR4_1_2a4wa4wl3lqxsi9.R.inc(13174);return value;
    }finally{__CLR4_1_2a4wa4wl3lqxsi9.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets this mutable as an instance of Short.
     *
     * @return a Short instance containing the value from this mutable, never null
     */
    public Short toShort() {try{__CLR4_1_2a4wa4wl3lqxsi9.R.inc(13175);
        __CLR4_1_2a4wa4wl3lqxsi9.R.inc(13176);return Short.valueOf(shortValue());
    }finally{__CLR4_1_2a4wa4wl3lqxsi9.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Compares this object to the specified object. The result is <code>true</code> if and only if the argument
     * is not <code>null</code> and is a <code>MutableShort</code> object that contains the same <code>short</code>
     * value as this object.
     * 
     * @param obj  the object to compare with, null returns false
     * @return <code>true</code> if the objects are the same; <code>false</code> otherwise.
     */
    @Override
    public boolean equals(final Object obj) {try{__CLR4_1_2a4wa4wl3lqxsi9.R.inc(13177);
        __CLR4_1_2a4wa4wl3lqxsi9.R.inc(13178);if ((((obj instanceof MutableShort)&&(__CLR4_1_2a4wa4wl3lqxsi9.R.iget(13179)!=0|true))||(__CLR4_1_2a4wa4wl3lqxsi9.R.iget(13180)==0&false))) {{
            __CLR4_1_2a4wa4wl3lqxsi9.R.inc(13181);return value == ((MutableShort) obj).shortValue();
        }
        }__CLR4_1_2a4wa4wl3lqxsi9.R.inc(13182);return false;
    }finally{__CLR4_1_2a4wa4wl3lqxsi9.R.flushNeeded();}}

    /**
     * Returns a suitable hash code for this mutable.
     * 
     * @return a suitable hash code
     */
    @Override
    public int hashCode() {try{__CLR4_1_2a4wa4wl3lqxsi9.R.inc(13183);
        __CLR4_1_2a4wa4wl3lqxsi9.R.inc(13184);return value;
    }finally{__CLR4_1_2a4wa4wl3lqxsi9.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Compares this mutable to another in ascending order.
     * 
     * @param other  the other mutable to compare to, not null
     * @return negative if this is less, zero if equal, positive if greater
     */
    @Override
    public int compareTo(final MutableShort other) {try{__CLR4_1_2a4wa4wl3lqxsi9.R.inc(13185);
        __CLR4_1_2a4wa4wl3lqxsi9.R.inc(13186);final short anotherVal = other.value;
        __CLR4_1_2a4wa4wl3lqxsi9.R.inc(13187);return (((value < anotherVal )&&(__CLR4_1_2a4wa4wl3lqxsi9.R.iget(13188)!=0|true))||(__CLR4_1_2a4wa4wl3lqxsi9.R.iget(13189)==0&false))? -1 : ((((value == anotherVal )&&(__CLR4_1_2a4wa4wl3lqxsi9.R.iget(13190)!=0|true))||(__CLR4_1_2a4wa4wl3lqxsi9.R.iget(13191)==0&false))? 0 : 1);
    }finally{__CLR4_1_2a4wa4wl3lqxsi9.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Returns the String value of this mutable.
     * 
     * @return the mutable value as a string
     */
    @Override
    public String toString() {try{__CLR4_1_2a4wa4wl3lqxsi9.R.inc(13192);
        __CLR4_1_2a4wa4wl3lqxsi9.R.inc(13193);return String.valueOf(value);
    }finally{__CLR4_1_2a4wa4wl3lqxsi9.R.flushNeeded();}}

}
