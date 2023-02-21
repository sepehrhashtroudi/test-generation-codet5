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
 * <p>Operations on bit-mapped fields.</p>
 *
 * @since 2.0
 * @version $Id$
 */
public class BitField {public static class __CLR4_1_21ty1tyl3lqxrlh{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492827633L,8589935092L,2427,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    private final int _mask;
    private final int _shift_count;

    /**
     * <p>Creates a BitField instance.</p>
     *
     * @param mask the mask specifying which bits apply to this
     *  BitField. Bits that are set in this mask are the bits
     *  that this BitField operates on
     */
    public BitField(final int mask) {try{__CLR4_1_21ty1tyl3lqxrlh.R.inc(2374);
        __CLR4_1_21ty1tyl3lqxrlh.R.inc(2375);_mask = mask;
        __CLR4_1_21ty1tyl3lqxrlh.R.inc(2376);int count = 0;
        __CLR4_1_21ty1tyl3lqxrlh.R.inc(2377);int bit_pattern = mask;

        __CLR4_1_21ty1tyl3lqxrlh.R.inc(2378);if ((((bit_pattern != 0)&&(__CLR4_1_21ty1tyl3lqxrlh.R.iget(2379)!=0|true))||(__CLR4_1_21ty1tyl3lqxrlh.R.iget(2380)==0&false))) {{
            __CLR4_1_21ty1tyl3lqxrlh.R.inc(2381);while (((((bit_pattern & 1) == 0)&&(__CLR4_1_21ty1tyl3lqxrlh.R.iget(2382)!=0|true))||(__CLR4_1_21ty1tyl3lqxrlh.R.iget(2383)==0&false))) {{
                __CLR4_1_21ty1tyl3lqxrlh.R.inc(2384);count++;
                __CLR4_1_21ty1tyl3lqxrlh.R.inc(2385);bit_pattern >>= 1;
            }
        }}
        }__CLR4_1_21ty1tyl3lqxrlh.R.inc(2386);_shift_count = count;
    }finally{__CLR4_1_21ty1tyl3lqxrlh.R.flushNeeded();}}

    /**
     * <p>Obtains the value for the specified BitField, appropriately
     * shifted right.</p>
     *
     * <p>Many users of a BitField will want to treat the specified
     * bits as an int value, and will not want to be aware that the
     * value is stored as a BitField (and so shifted left so many
     * bits).</p>
     *
     * @see #setValue(int,int)
     * @param holder the int data containing the bits we're interested
     *  in
     * @return the selected bits, shifted right appropriately
     */
    public int getValue(final int holder) {try{__CLR4_1_21ty1tyl3lqxrlh.R.inc(2387);
        __CLR4_1_21ty1tyl3lqxrlh.R.inc(2388);return getRawValue(holder) >> _shift_count;
    }finally{__CLR4_1_21ty1tyl3lqxrlh.R.flushNeeded();}}

    /**
     * <p>Obtains the value for the specified BitField, appropriately
     * shifted right, as a short.</p>
     *
     * <p>Many users of a BitField will want to treat the specified
     * bits as an int value, and will not want to be aware that the
     * value is stored as a BitField (and so shifted left so many
     * bits).</p>
     *
     * @see #setShortValue(short,short)
     * @param holder the short data containing the bits we're
     *  interested in
     * @return the selected bits, shifted right appropriately
     */
    public short getShortValue(final short holder) {try{__CLR4_1_21ty1tyl3lqxrlh.R.inc(2389);
        __CLR4_1_21ty1tyl3lqxrlh.R.inc(2390);return (short) getValue(holder);
    }finally{__CLR4_1_21ty1tyl3lqxrlh.R.flushNeeded();}}

    /**
     * <p>Obtains the value for the specified BitField, unshifted.</p>
     *
     * @param holder the int data containing the bits we're
     *  interested in
     * @return the selected bits
     */
    public int getRawValue(final int holder) {try{__CLR4_1_21ty1tyl3lqxrlh.R.inc(2391);
        __CLR4_1_21ty1tyl3lqxrlh.R.inc(2392);return holder & _mask;
    }finally{__CLR4_1_21ty1tyl3lqxrlh.R.flushNeeded();}}

    /**
     * <p>Obtains the value for the specified BitField, unshifted.</p>
     *
     * @param holder the short data containing the bits we're
     *  interested in
     * @return the selected bits
     */
    public short getShortRawValue(final short holder) {try{__CLR4_1_21ty1tyl3lqxrlh.R.inc(2393);
        __CLR4_1_21ty1tyl3lqxrlh.R.inc(2394);return (short) getRawValue(holder);
    }finally{__CLR4_1_21ty1tyl3lqxrlh.R.flushNeeded();}}

    /**
     * <p>Returns whether the field is set or not.</p>
     *
     * <p>This is most commonly used for a single-bit field, which is
     * often used to represent a boolean value; the results of using
     * it for a multi-bit field is to determine whether *any* of its
     * bits are set.</p>
     *
     * @param holder the int data containing the bits we're interested
     *  in
     * @return {@code true} if any of the bits are set,
     *  else {@code false}
     */
    public boolean isSet(final int holder) {try{__CLR4_1_21ty1tyl3lqxrlh.R.inc(2395);
        __CLR4_1_21ty1tyl3lqxrlh.R.inc(2396);return (holder & _mask) != 0;
    }finally{__CLR4_1_21ty1tyl3lqxrlh.R.flushNeeded();}}

    /**
     * <p>Returns whether all of the bits are set or not.</p>
     *
     * <p>This is a stricter test than {@link #isSet(int)},
     * in that all of the bits in a multi-bit set must be set
     * for this method to return {@code true}.</p>
     *
     * @param holder the int data containing the bits we're
     *  interested in
     * @return {@code true} if all of the bits are set,
     *  else {@code false}
     */
    public boolean isAllSet(final int holder) {try{__CLR4_1_21ty1tyl3lqxrlh.R.inc(2397);
        __CLR4_1_21ty1tyl3lqxrlh.R.inc(2398);return (holder & _mask) == _mask;
    }finally{__CLR4_1_21ty1tyl3lqxrlh.R.flushNeeded();}}

    /**
     * <p>Replaces the bits with new values.</p>
     *
     * @see #getValue(int)
     * @param holder the int data containing the bits we're
     *  interested in
     * @param value the new value for the specified bits
     * @return the value of holder with the bits from the value
     *  parameter replacing the old bits
     */
    public int setValue(final int holder, final int value) {try{__CLR4_1_21ty1tyl3lqxrlh.R.inc(2399);
        __CLR4_1_21ty1tyl3lqxrlh.R.inc(2400);return (holder & ~_mask) | ((value << _shift_count) & _mask);
    }finally{__CLR4_1_21ty1tyl3lqxrlh.R.flushNeeded();}}

    /**
     * <p>Replaces the bits with new values.</p>
     *
     * @see #getShortValue(short)
     * @param holder the short data containing the bits we're
     *  interested in
     * @param value the new value for the specified bits
     * @return the value of holder with the bits from the value
     *  parameter replacing the old bits
     */
    public short setShortValue(final short holder, final short value) {try{__CLR4_1_21ty1tyl3lqxrlh.R.inc(2401);
        __CLR4_1_21ty1tyl3lqxrlh.R.inc(2402);return (short) setValue(holder, value);
    }finally{__CLR4_1_21ty1tyl3lqxrlh.R.flushNeeded();}}

    /**
     * <p>Clears the bits.</p>
     *
     * @param holder the int data containing the bits we're
     *  interested in
     * @return the value of holder with the specified bits cleared
     *  (set to {@code 0})
     */
    public int clear(final int holder) {try{__CLR4_1_21ty1tyl3lqxrlh.R.inc(2403);
        __CLR4_1_21ty1tyl3lqxrlh.R.inc(2404);return holder & ~_mask;
    }finally{__CLR4_1_21ty1tyl3lqxrlh.R.flushNeeded();}}

    /**
     * <p>Clears the bits.</p>
     *
     * @param holder the short data containing the bits we're
     *  interested in
     * @return the value of holder with the specified bits cleared
     *  (set to {@code 0})
     */
    public short clearShort(final short holder) {try{__CLR4_1_21ty1tyl3lqxrlh.R.inc(2405);
        __CLR4_1_21ty1tyl3lqxrlh.R.inc(2406);return (short) clear(holder);
    }finally{__CLR4_1_21ty1tyl3lqxrlh.R.flushNeeded();}}

    /**
     * <p>Clears the bits.</p>
     *
     * @param holder the byte data containing the bits we're
     *  interested in
     *
     * @return the value of holder with the specified bits cleared
     *  (set to {@code 0})
     */
    public byte clearByte(final byte holder) {try{__CLR4_1_21ty1tyl3lqxrlh.R.inc(2407);
        __CLR4_1_21ty1tyl3lqxrlh.R.inc(2408);return (byte) clear(holder);
    }finally{__CLR4_1_21ty1tyl3lqxrlh.R.flushNeeded();}}

    /**
     * <p>Sets the bits.</p>
     *
     * @param holder the int data containing the bits we're
     *  interested in
     * @return the value of holder with the specified bits set
     *  to {@code 1}
     */
    public int set(final int holder) {try{__CLR4_1_21ty1tyl3lqxrlh.R.inc(2409);
        __CLR4_1_21ty1tyl3lqxrlh.R.inc(2410);return holder | _mask;
    }finally{__CLR4_1_21ty1tyl3lqxrlh.R.flushNeeded();}}

    /**
     * <p>Sets the bits.</p>
     *
     * @param holder the short data containing the bits we're
     *  interested in
     * @return the value of holder with the specified bits set
     *  to {@code 1}
     */
    public short setShort(final short holder) {try{__CLR4_1_21ty1tyl3lqxrlh.R.inc(2411);
        __CLR4_1_21ty1tyl3lqxrlh.R.inc(2412);return (short) set(holder);
    }finally{__CLR4_1_21ty1tyl3lqxrlh.R.flushNeeded();}}

    /**
     * <p>Sets the bits.</p>
     *
     * @param holder the byte data containing the bits we're
     *  interested in
     *
     * @return the value of holder with the specified bits set
     *  to {@code 1}
     */
    public byte setByte(final byte holder) {try{__CLR4_1_21ty1tyl3lqxrlh.R.inc(2413);
        __CLR4_1_21ty1tyl3lqxrlh.R.inc(2414);return (byte) set(holder);
    }finally{__CLR4_1_21ty1tyl3lqxrlh.R.flushNeeded();}}

    /**
     * <p>Sets a boolean BitField.</p>
     *
     * @param holder the int data containing the bits we're
     *  interested in
     * @param flag indicating whether to set or clear the bits
     * @return the value of holder with the specified bits set or
     *         cleared
     */
    public int setBoolean(final int holder, final boolean flag) {try{__CLR4_1_21ty1tyl3lqxrlh.R.inc(2415);
        __CLR4_1_21ty1tyl3lqxrlh.R.inc(2416);return (((flag )&&(__CLR4_1_21ty1tyl3lqxrlh.R.iget(2417)!=0|true))||(__CLR4_1_21ty1tyl3lqxrlh.R.iget(2418)==0&false))? set(holder) : clear(holder);
    }finally{__CLR4_1_21ty1tyl3lqxrlh.R.flushNeeded();}}

    /**
     * <p>Sets a boolean BitField.</p>
     *
     * @param holder the short data containing the bits we're
     *  interested in
     * @param flag indicating whether to set or clear the bits
     * @return the value of holder with the specified bits set or
     *  cleared
     */
    public short setShortBoolean(final short holder, final boolean flag) {try{__CLR4_1_21ty1tyl3lqxrlh.R.inc(2419);
        __CLR4_1_21ty1tyl3lqxrlh.R.inc(2420);return (((flag )&&(__CLR4_1_21ty1tyl3lqxrlh.R.iget(2421)!=0|true))||(__CLR4_1_21ty1tyl3lqxrlh.R.iget(2422)==0&false))? setShort(holder) : clearShort(holder);
    }finally{__CLR4_1_21ty1tyl3lqxrlh.R.flushNeeded();}}

    /**
     * <p>Sets a boolean BitField.</p>
     *
     * @param holder the byte data containing the bits we're
     *  interested in
     * @param flag indicating whether to set or clear the bits
     * @return the value of holder with the specified bits set or
     *  cleared
     */
    public byte setByteBoolean(final byte holder, final boolean flag) {try{__CLR4_1_21ty1tyl3lqxrlh.R.inc(2423);
        __CLR4_1_21ty1tyl3lqxrlh.R.inc(2424);return (((flag )&&(__CLR4_1_21ty1tyl3lqxrlh.R.iget(2425)!=0|true))||(__CLR4_1_21ty1tyl3lqxrlh.R.iget(2426)==0&false))? setByte(holder) : clearByte(holder);
    }finally{__CLR4_1_21ty1tyl3lqxrlh.R.flushNeeded();}}

}
