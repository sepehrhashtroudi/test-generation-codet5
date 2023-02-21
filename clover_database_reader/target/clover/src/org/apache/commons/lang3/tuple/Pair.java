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
package org.apache.commons.lang3.tuple;

import java.io.Serializable;
import java.util.Map;

import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.builder.CompareToBuilder;

/**
 * <p>A pair consisting of two elements.</p>
 * 
 * <p>This class is an abstract implementation defining the basic API.
 * It refers to the elements as 'left' and 'right'. It also implements the
 * {@code Map.Entry} interface where the key is 'left' and the value is 'right'.</p>
 * 
 * <p>Subclass implementations may be mutable or immutable.
 * However, there is no restriction on the type of the stored objects that may be stored.
 * If mutable objects are stored in the pair, then the pair itself effectively becomes mutable.</p>
 *
 * @param <L> the left element type
 * @param <R> the right element type
 *
 * @since Lang 3.0
 * @version $Id$
 */
public abstract class Pair<L, R> implements Map.Entry<L, R>, Comparable<Pair<L, R>>, Serializable {public static class __CLR4_1_2eu9eu9l3lqxsvr{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492827633L,8589935092L,19262,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /** Serialization version */
    private static final long serialVersionUID = 4954918890077093841L;

    /**
     * <p>Obtains an immutable pair of from two objects inferring the generic types.</p>
     * 
     * <p>This factory allows the pair to be created using inference to
     * obtain the generic types.</p>
     * 
     * @param <L> the left element type
     * @param <R> the right element type
     * @param left  the left element, may be null
     * @param right  the right element, may be null
     * @return a pair formed from the two parameters, not null
     */
    public static <L, R> Pair<L, R> of(final L left, final R right) {try{__CLR4_1_2eu9eu9l3lqxsvr.R.inc(19233);
        __CLR4_1_2eu9eu9l3lqxsvr.R.inc(19234);return new ImmutablePair<L, R>(left, right);
    }finally{__CLR4_1_2eu9eu9l3lqxsvr.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * <p>Gets the left element from this pair.</p>
     * 
     * <p>When treated as a key-value pair, this is the key.</p>
     * 
     * @return the left element, may be null
     */
    public abstract L getLeft();

    /**
     * <p>Gets the right element from this pair.</p>
     * 
     * <p>When treated as a key-value pair, this is the value.</p>
     * 
     * @return the right element, may be null
     */
    public abstract R getRight();

    /**
     * <p>Gets the key from this pair.</p>
     * 
     * <p>This method implements the {@code Map.Entry} interface returning the
     * left element as the key.</p>
     * 
     * @return the left element as the key, may be null
     */
    @Override
    public final L getKey() {try{__CLR4_1_2eu9eu9l3lqxsvr.R.inc(19235);
        __CLR4_1_2eu9eu9l3lqxsvr.R.inc(19236);return getLeft();
    }finally{__CLR4_1_2eu9eu9l3lqxsvr.R.flushNeeded();}}

    /**
     * <p>Gets the value from this pair.</p>
     * 
     * <p>This method implements the {@code Map.Entry} interface returning the
     * right element as the value.</p>
     * 
     * @return the right element as the value, may be null
     */
    @Override
    public R getValue() {try{__CLR4_1_2eu9eu9l3lqxsvr.R.inc(19237);
        __CLR4_1_2eu9eu9l3lqxsvr.R.inc(19238);return getRight();
    }finally{__CLR4_1_2eu9eu9l3lqxsvr.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * <p>Compares the pair based on the left element followed by the right element.
     * The types must be {@code Comparable}.</p>
     * 
     * @param other  the other pair, not null
     * @return negative if this is less, zero if equal, positive if greater
     */
    @Override
    public int compareTo(final Pair<L, R> other) {try{__CLR4_1_2eu9eu9l3lqxsvr.R.inc(19239);
      __CLR4_1_2eu9eu9l3lqxsvr.R.inc(19240);return new CompareToBuilder().append(getLeft(), other.getLeft())
              .append(getRight(), other.getRight()).toComparison();
    }finally{__CLR4_1_2eu9eu9l3lqxsvr.R.flushNeeded();}}

    /**
     * <p>Compares this pair to another based on the two elements.</p>
     * 
     * @param obj  the object to compare to, null returns false
     * @return true if the elements of the pair are equal
     */
    @Override
    public boolean equals(final Object obj) {try{__CLR4_1_2eu9eu9l3lqxsvr.R.inc(19241);
        __CLR4_1_2eu9eu9l3lqxsvr.R.inc(19242);if ((((obj == this)&&(__CLR4_1_2eu9eu9l3lqxsvr.R.iget(19243)!=0|true))||(__CLR4_1_2eu9eu9l3lqxsvr.R.iget(19244)==0&false))) {{
            __CLR4_1_2eu9eu9l3lqxsvr.R.inc(19245);return true;
        }
        }__CLR4_1_2eu9eu9l3lqxsvr.R.inc(19246);if ((((obj instanceof Map.Entry<?, ?>)&&(__CLR4_1_2eu9eu9l3lqxsvr.R.iget(19247)!=0|true))||(__CLR4_1_2eu9eu9l3lqxsvr.R.iget(19248)==0&false))) {{
            __CLR4_1_2eu9eu9l3lqxsvr.R.inc(19249);final Map.Entry<?, ?> other = (Map.Entry<?, ?>) obj;
            __CLR4_1_2eu9eu9l3lqxsvr.R.inc(19250);return ObjectUtils.equals(getKey(), other.getKey())
                    && ObjectUtils.equals(getValue(), other.getValue());
        }
        }__CLR4_1_2eu9eu9l3lqxsvr.R.inc(19251);return false;
    }finally{__CLR4_1_2eu9eu9l3lqxsvr.R.flushNeeded();}}

    /**
     * <p>Returns a suitable hash code.
     * The hash code follows the definition in {@code Map.Entry}.</p>
     * 
     * @return the hash code
     */
    @Override
    public int hashCode() {try{__CLR4_1_2eu9eu9l3lqxsvr.R.inc(19252);
        // see Map.Entry API specification
        __CLR4_1_2eu9eu9l3lqxsvr.R.inc(19253);return ((((getKey() == null )&&(__CLR4_1_2eu9eu9l3lqxsvr.R.iget(19254)!=0|true))||(__CLR4_1_2eu9eu9l3lqxsvr.R.iget(19255)==0&false))? 0 : getKey().hashCode()) ^
                ((((getValue() == null )&&(__CLR4_1_2eu9eu9l3lqxsvr.R.iget(19256)!=0|true))||(__CLR4_1_2eu9eu9l3lqxsvr.R.iget(19257)==0&false))? 0 : getValue().hashCode());
    }finally{__CLR4_1_2eu9eu9l3lqxsvr.R.flushNeeded();}}

    /**
     * <p>Returns a String representation of this pair using the format {@code ($left,$right)}.</p>
     * 
     * @return a string describing this object, not null
     */
    @Override
    public String toString() {try{__CLR4_1_2eu9eu9l3lqxsvr.R.inc(19258);
        __CLR4_1_2eu9eu9l3lqxsvr.R.inc(19259);return new StringBuilder().append('(').append(getLeft()).append(',').append(getRight()).append(')').toString();
    }finally{__CLR4_1_2eu9eu9l3lqxsvr.R.flushNeeded();}}

    /**
     * <p>Formats the receiver using the given format.</p>
     * 
     * <p>This uses {@link java.util.Formattable} to perform the formatting. Two variables may
     * be used to embed the left and right elements. Use {@code %1$s} for the left
     * element (key) and {@code %2$s} for the right element (value).
     * The default format used by {@code toString()} is {@code (%1$s,%2$s)}.</p>
     * 
     * @param format  the format string, optionally containing {@code %1$s} and {@code %2$s}, not null
     * @return the formatted string, not null
     */
    public String toString(final String format) {try{__CLR4_1_2eu9eu9l3lqxsvr.R.inc(19260);
        __CLR4_1_2eu9eu9l3lqxsvr.R.inc(19261);return String.format(format, getLeft(), getRight());
    }finally{__CLR4_1_2eu9eu9l3lqxsvr.R.flushNeeded();}}

}
