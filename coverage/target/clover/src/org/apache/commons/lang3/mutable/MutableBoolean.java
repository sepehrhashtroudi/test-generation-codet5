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

import java.io.Serializable;

/**
 * A mutable <code>boolean</code> wrapper.
 * <p>
 * Note that as MutableBoolean does not extend Boolean, it is not treated by String.format as a Boolean parameter. 
 * 
 * @see Boolean
 * @since 2.2
 * @version $Id$
 */
public class MutableBoolean implements Mutable<Boolean>, Serializable, Comparable<MutableBoolean> {public static class __CLR4_1_29v89v8l3lqxsh8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492827633L,8589935092L,12829,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Required for serialization support.
     * 
     * @see java.io.Serializable
     */
    private static final long serialVersionUID = -4830728138360036487L;

    /** The mutable value. */
    private boolean value;

    /**
     * Constructs a new MutableBoolean with the default value of false.
     */
    public MutableBoolean() {
        super();__CLR4_1_29v89v8l3lqxsh8.R.inc(12789);try{__CLR4_1_29v89v8l3lqxsh8.R.inc(12788);
    }finally{__CLR4_1_29v89v8l3lqxsh8.R.flushNeeded();}}

    /**
     * Constructs a new MutableBoolean with the specified value.
     * 
     * @param value  the initial value to store
     */
    public MutableBoolean(final boolean value) {
        super();__CLR4_1_29v89v8l3lqxsh8.R.inc(12791);try{__CLR4_1_29v89v8l3lqxsh8.R.inc(12790);
        __CLR4_1_29v89v8l3lqxsh8.R.inc(12792);this.value = value;
    }finally{__CLR4_1_29v89v8l3lqxsh8.R.flushNeeded();}}

    /**
     * Constructs a new MutableBoolean with the specified value.
     * 
     * @param value  the initial value to store, not null
     * @throws NullPointerException if the object is null
     */
    public MutableBoolean(final Boolean value) {
        super();__CLR4_1_29v89v8l3lqxsh8.R.inc(12794);try{__CLR4_1_29v89v8l3lqxsh8.R.inc(12793);
        __CLR4_1_29v89v8l3lqxsh8.R.inc(12795);this.value = value.booleanValue();
    }finally{__CLR4_1_29v89v8l3lqxsh8.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets the value as a Boolean instance.
     * 
     * @return the value as a Boolean, never null
     */
    @Override
    public Boolean getValue() {try{__CLR4_1_29v89v8l3lqxsh8.R.inc(12796);
        __CLR4_1_29v89v8l3lqxsh8.R.inc(12797);return Boolean.valueOf(this.value);
    }finally{__CLR4_1_29v89v8l3lqxsh8.R.flushNeeded();}}

    /**
     * Sets the value.
     * 
     * @param value  the value to set
     */
    public void setValue(final boolean value) {try{__CLR4_1_29v89v8l3lqxsh8.R.inc(12798);
        __CLR4_1_29v89v8l3lqxsh8.R.inc(12799);this.value = value;
    }finally{__CLR4_1_29v89v8l3lqxsh8.R.flushNeeded();}}

    /**
     * Sets the value from any Boolean instance.
     * 
     * @param value  the value to set, not null
     * @throws NullPointerException if the object is null
     */
    @Override
    public void setValue(final Boolean value) {try{__CLR4_1_29v89v8l3lqxsh8.R.inc(12800);
        __CLR4_1_29v89v8l3lqxsh8.R.inc(12801);this.value = value.booleanValue();
    }finally{__CLR4_1_29v89v8l3lqxsh8.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Checks if the current value is <code>true</code>.
     * 
     * @return <code>true</code> if the current value is <code>true</code>
     * @since 2.5
     */
    public boolean isTrue() {try{__CLR4_1_29v89v8l3lqxsh8.R.inc(12802);
        __CLR4_1_29v89v8l3lqxsh8.R.inc(12803);return value == true;
    }finally{__CLR4_1_29v89v8l3lqxsh8.R.flushNeeded();}}

    /**
     * Checks if the current value is <code>false</code>.
     * 
     * @return <code>true</code> if the current value is <code>false</code>
     * @since 2.5
     */
    public boolean isFalse() {try{__CLR4_1_29v89v8l3lqxsh8.R.inc(12804);
        __CLR4_1_29v89v8l3lqxsh8.R.inc(12805);return value == false;
    }finally{__CLR4_1_29v89v8l3lqxsh8.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Returns the value of this MutableBoolean as a boolean.
     * 
     * @return the boolean value represented by this object.
     */
    public boolean booleanValue() {try{__CLR4_1_29v89v8l3lqxsh8.R.inc(12806);
        __CLR4_1_29v89v8l3lqxsh8.R.inc(12807);return value;
    }finally{__CLR4_1_29v89v8l3lqxsh8.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Gets this mutable as an instance of Boolean.
     *
     * @return a Boolean instance containing the value from this mutable, never null
     * @since 2.5
     */
    public Boolean toBoolean() {try{__CLR4_1_29v89v8l3lqxsh8.R.inc(12808);
        __CLR4_1_29v89v8l3lqxsh8.R.inc(12809);return Boolean.valueOf(booleanValue());
    }finally{__CLR4_1_29v89v8l3lqxsh8.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Compares this object to the specified object. The result is <code>true</code> if and only if the argument is
     * not <code>null</code> and is an <code>MutableBoolean</code> object that contains the same
     * <code>boolean</code> value as this object.
     * 
     * @param obj  the object to compare with, null returns false
     * @return <code>true</code> if the objects are the same; <code>false</code> otherwise.
     */
    @Override
    public boolean equals(final Object obj) {try{__CLR4_1_29v89v8l3lqxsh8.R.inc(12810);
        __CLR4_1_29v89v8l3lqxsh8.R.inc(12811);if ((((obj instanceof MutableBoolean)&&(__CLR4_1_29v89v8l3lqxsh8.R.iget(12812)!=0|true))||(__CLR4_1_29v89v8l3lqxsh8.R.iget(12813)==0&false))) {{
            __CLR4_1_29v89v8l3lqxsh8.R.inc(12814);return value == ((MutableBoolean) obj).booleanValue();
        }
        }__CLR4_1_29v89v8l3lqxsh8.R.inc(12815);return false;
    }finally{__CLR4_1_29v89v8l3lqxsh8.R.flushNeeded();}}

    /**
     * Returns a suitable hash code for this mutable.
     * 
     * @return the hash code returned by <code>Boolean.TRUE</code> or <code>Boolean.FALSE</code>
     */
    @Override
    public int hashCode() {try{__CLR4_1_29v89v8l3lqxsh8.R.inc(12816);
        __CLR4_1_29v89v8l3lqxsh8.R.inc(12817);return (((value )&&(__CLR4_1_29v89v8l3lqxsh8.R.iget(12818)!=0|true))||(__CLR4_1_29v89v8l3lqxsh8.R.iget(12819)==0&false))? Boolean.TRUE.hashCode() : Boolean.FALSE.hashCode();
    }finally{__CLR4_1_29v89v8l3lqxsh8.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Compares this mutable to another in ascending order.
     * 
     * @param other  the other mutable to compare to, not null
     * @return negative if this is less, zero if equal, positive if greater
     *  where false is less than true
     */
    @Override
    public int compareTo(final MutableBoolean other) {try{__CLR4_1_29v89v8l3lqxsh8.R.inc(12820);
        __CLR4_1_29v89v8l3lqxsh8.R.inc(12821);final boolean anotherVal = other.value;
        __CLR4_1_29v89v8l3lqxsh8.R.inc(12822);return (((value == anotherVal )&&(__CLR4_1_29v89v8l3lqxsh8.R.iget(12823)!=0|true))||(__CLR4_1_29v89v8l3lqxsh8.R.iget(12824)==0&false))? 0 : ((((value )&&(__CLR4_1_29v89v8l3lqxsh8.R.iget(12825)!=0|true))||(__CLR4_1_29v89v8l3lqxsh8.R.iget(12826)==0&false))? 1 : -1);
    }finally{__CLR4_1_29v89v8l3lqxsh8.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Returns the String value of this mutable.
     * 
     * @return the mutable value as a string
     */
    @Override
    public String toString() {try{__CLR4_1_29v89v8l3lqxsh8.R.inc(12827);
        __CLR4_1_29v89v8l3lqxsh8.R.inc(12828);return String.valueOf(value);
    }finally{__CLR4_1_29v89v8l3lqxsh8.R.flushNeeded();}}

}
