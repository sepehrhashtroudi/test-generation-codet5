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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Comparator;

import org.junit.Before;
import org.junit.Test;

/**
 * <p>
 * Tests the methods in the {@link org.apache.commons.lang3.Range} class.
 * </p>
 * 
 * @version $Id$
 */
@SuppressWarnings("boxing")
public class RangeTest {static class __CLR4_1_2kj4kj4l3lqxtxz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492830024L,8589935092L,26790,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private Range<Byte> byteRange;
    private Range<Byte> byteRange2;
    private Range<Byte> byteRange3;

    private Range<Integer> intRange;
    private Range<Long> longRange;
    private Range<Float> floatRange;
    private Range<Double> doubleRange;

    @SuppressWarnings("cast") // intRange
    @Before
    public void setUp() {try{__CLR4_1_2kj4kj4l3lqxtxz.R.inc(26608);
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26609);byteRange   = Range.between((byte) 0, (byte) 5);
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26610);byteRange2  = Range.between((byte) 0, (byte) 5);
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26611);byteRange3  = Range.between((byte) 0, (byte) 10);

        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26612);intRange    = Range.between((int) 10, (int) 20);
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26613);longRange   = Range.between((long) 10, (long) 20);
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26614);floatRange  = Range.between((float) 10, (float) 20);
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26615);doubleRange = Range.between((double) 10, (double) 20);
    }finally{__CLR4_1_2kj4kj4l3lqxtxz.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @SuppressWarnings({ "rawtypes", "unchecked" })
    @Test
    public void testComparableConstructors() {__CLR4_1_2kj4kj4l3lqxtxz.R.globalSliceStart(getClass().getName(),26616);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2g8bn90kjc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2kj4kj4l3lqxtxz.R.rethrow($CLV_t2$);}finally{__CLR4_1_2kj4kj4l3lqxtxz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.RangeTest.testComparableConstructors",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),26616,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2g8bn90kjc(){try{__CLR4_1_2kj4kj4l3lqxtxz.R.inc(26616);
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26617);final Comparable c = 
            new Comparable() { 
                @Override
                public int compareTo(final Object other) {try{__CLR4_1_2kj4kj4l3lqxtxz.R.inc(26618);
                    __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26619);return 1;
                }finally{__CLR4_1_2kj4kj4l3lqxtxz.R.flushNeeded();}}
            };
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26620);final Range r1 = Range.is(c);
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26621);final Range r2 = Range.between(c, c);
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26622);assertEquals(true, r1.isNaturalOrdering());
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26623);assertEquals(true, r2.isNaturalOrdering());
    }finally{__CLR4_1_2kj4kj4l3lqxtxz.R.flushNeeded();}}

    @Test
    public void testIsWithCompare(){__CLR4_1_2kj4kj4l3lqxtxz.R.globalSliceStart(getClass().getName(),26624);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2n8rcq2kjk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2kj4kj4l3lqxtxz.R.rethrow($CLV_t2$);}finally{__CLR4_1_2kj4kj4l3lqxtxz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.RangeTest.testIsWithCompare",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),26624,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2n8rcq2kjk(){try{__CLR4_1_2kj4kj4l3lqxtxz.R.inc(26624);
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26625);final Comparator<Integer> c = new Comparator<Integer>(){
            @Override
            public int compare(final Integer o1, final Integer o2) {try{__CLR4_1_2kj4kj4l3lqxtxz.R.inc(26626);
                __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26627);return 0; // all integers are equal
            }finally{__CLR4_1_2kj4kj4l3lqxtxz.R.flushNeeded();}}
        };
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26628);Range<Integer> ri = Range.is(10);
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26629);assertFalse("should not contain null",ri.contains(null));
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26630);assertTrue("should contain 10",ri.contains(10));
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26631);assertFalse("should not contain 11",ri.contains(11));
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26632);ri = Range.is(10,c);
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26633);assertFalse("should not contain null",ri.contains(null));
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26634);assertTrue("should contain 10",ri.contains(10));
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26635);assertTrue("should contain 11",ri.contains(11));
    }finally{__CLR4_1_2kj4kj4l3lqxtxz.R.flushNeeded();}}

    @Test
    public void testBetweenWithCompare(){__CLR4_1_2kj4kj4l3lqxtxz.R.globalSliceStart(getClass().getName(),26636);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2v0tnjkkjw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2kj4kj4l3lqxtxz.R.rethrow($CLV_t2$);}finally{__CLR4_1_2kj4kj4l3lqxtxz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.RangeTest.testBetweenWithCompare",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),26636,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2v0tnjkkjw(){try{__CLR4_1_2kj4kj4l3lqxtxz.R.inc(26636);
        // TODO add tests with a better comparator
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26637);final Comparator<Integer> c = new Comparator<Integer>(){
            @Override
            public int compare(final Integer o1, final Integer o2) {try{__CLR4_1_2kj4kj4l3lqxtxz.R.inc(26638);
                __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26639);return 0; // all integers are equal
            }finally{__CLR4_1_2kj4kj4l3lqxtxz.R.flushNeeded();}}
        };
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26640);Range<Integer> rb = Range.between(-10,20);
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26641);assertFalse("should not contain null",rb.contains(null));
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26642);assertTrue("should contain 10",rb.contains(10));
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26643);assertTrue("should contain -10",rb.contains(-10));
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26644);assertFalse("should not contain 21",rb.contains(21));
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26645);assertFalse("should not contain -11",rb.contains(-11));
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26646);rb = Range.between(-10,20,c);
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26647);assertFalse("should not contain null",rb.contains(null));
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26648);assertTrue("should contain 10",rb.contains(10));
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26649);assertTrue("should contain -10",rb.contains(-10));
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26650);assertTrue("should contain 21",rb.contains(21));
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26651);assertTrue("should contain -11",rb.contains(-11));
    }finally{__CLR4_1_2kj4kj4l3lqxtxz.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testRangeOfChars() {__CLR4_1_2kj4kj4l3lqxtxz.R.globalSliceStart(getClass().getName(),26652);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_28c2c4ikkc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2kj4kj4l3lqxtxz.R.rethrow($CLV_t2$);}finally{__CLR4_1_2kj4kj4l3lqxtxz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.RangeTest.testRangeOfChars",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),26652,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_28c2c4ikkc(){try{__CLR4_1_2kj4kj4l3lqxtxz.R.inc(26652);
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26653);final Range<Character> chars = Range.between('a', 'z');
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26654);assertTrue(chars.contains('b'));
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26655);assertFalse(chars.contains('B'));
    }finally{__CLR4_1_2kj4kj4l3lqxtxz.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testEqualsObject() {__CLR4_1_2kj4kj4l3lqxtxz.R.globalSliceStart(getClass().getName(),26656);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2ayw755kkg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2kj4kj4l3lqxtxz.R.rethrow($CLV_t2$);}finally{__CLR4_1_2kj4kj4l3lqxtxz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.RangeTest.testEqualsObject",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),26656,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2ayw755kkg(){try{__CLR4_1_2kj4kj4l3lqxtxz.R.inc(26656);
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26657);assertEquals(byteRange, byteRange);
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26658);assertEquals(byteRange, byteRange2);
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26659);assertEquals(byteRange2, byteRange2);
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26660);assertTrue(byteRange.equals(byteRange));
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26661);assertTrue(byteRange2.equals(byteRange2));
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26662);assertTrue(byteRange3.equals(byteRange3));
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26663);assertFalse(byteRange2.equals(byteRange3));
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26664);assertFalse(byteRange2.equals(null));
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26665);assertFalse(byteRange2.equals("Ni!"));
    }finally{__CLR4_1_2kj4kj4l3lqxtxz.R.flushNeeded();}}

    @Test
    public void testHashCode() {__CLR4_1_2kj4kj4l3lqxtxz.R.globalSliceStart(getClass().getName(),26666);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_23zkhv8kkq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2kj4kj4l3lqxtxz.R.rethrow($CLV_t2$);}finally{__CLR4_1_2kj4kj4l3lqxtxz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.RangeTest.testHashCode",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),26666,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_23zkhv8kkq(){try{__CLR4_1_2kj4kj4l3lqxtxz.R.inc(26666);
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26667);assertEquals(byteRange.hashCode(), byteRange2.hashCode());
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26668);assertFalse(byteRange.hashCode() == byteRange3.hashCode());
        
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26669);assertEquals(intRange.hashCode(), intRange.hashCode());
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26670);assertTrue(intRange.hashCode() != 0);
    }finally{__CLR4_1_2kj4kj4l3lqxtxz.R.flushNeeded();}}

    @Test
    public void testToString() {__CLR4_1_2kj4kj4l3lqxtxz.R.globalSliceStart(getClass().getName(),26671);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2hrxdidkkv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2kj4kj4l3lqxtxz.R.rethrow($CLV_t2$);}finally{__CLR4_1_2kj4kj4l3lqxtxz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.RangeTest.testToString",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),26671,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2hrxdidkkv(){try{__CLR4_1_2kj4kj4l3lqxtxz.R.inc(26671);
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26672);assertNotNull(byteRange.toString());
        
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26673);final String str = intRange.toString();
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26674);assertEquals("[10..20]", str);
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26675);assertEquals("[-20..-10]", Range.between(-20, -10).toString());
    }finally{__CLR4_1_2kj4kj4l3lqxtxz.R.flushNeeded();}}

    @Test
    public void testToStringFormat() {__CLR4_1_2kj4kj4l3lqxtxz.R.globalSliceStart(getClass().getName(),26676);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2xkhrh8kl0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2kj4kj4l3lqxtxz.R.rethrow($CLV_t2$);}finally{__CLR4_1_2kj4kj4l3lqxtxz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.RangeTest.testToStringFormat",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),26676,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2xkhrh8kl0(){try{__CLR4_1_2kj4kj4l3lqxtxz.R.inc(26676);
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26677);final String str = intRange.toString("From %1$s to %2$s");
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26678);assertEquals("From 10 to 20", str);
    }finally{__CLR4_1_2kj4kj4l3lqxtxz.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testGetMinimum() {__CLR4_1_2kj4kj4l3lqxtxz.R.globalSliceStart(getClass().getName(),26679);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2d0bkz3kl3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2kj4kj4l3lqxtxz.R.rethrow($CLV_t2$);}finally{__CLR4_1_2kj4kj4l3lqxtxz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.RangeTest.testGetMinimum",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),26679,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2d0bkz3kl3(){try{__CLR4_1_2kj4kj4l3lqxtxz.R.inc(26679);
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26680);assertEquals(10, (int) intRange.getMinimum());
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26681);assertEquals(10L, (long) longRange.getMinimum());
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26682);assertEquals(10f, floatRange.getMinimum(), 0.00001f);
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26683);assertEquals(10d, doubleRange.getMinimum(), 0.00001d);
    }finally{__CLR4_1_2kj4kj4l3lqxtxz.R.flushNeeded();}}

    @Test
    public void testGetMaximum() {__CLR4_1_2kj4kj4l3lqxtxz.R.globalSliceStart(getClass().getName(),26684);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2e2ci71kl8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2kj4kj4l3lqxtxz.R.rethrow($CLV_t2$);}finally{__CLR4_1_2kj4kj4l3lqxtxz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.RangeTest.testGetMaximum",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),26684,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2e2ci71kl8(){try{__CLR4_1_2kj4kj4l3lqxtxz.R.inc(26684);
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26685);assertEquals(20, (int) intRange.getMaximum());
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26686);assertEquals(20L, (long) longRange.getMaximum());
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26687);assertEquals(20f, floatRange.getMaximum(), 0.00001f);
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26688);assertEquals(20d, doubleRange.getMaximum(), 0.00001d);
    }finally{__CLR4_1_2kj4kj4l3lqxtxz.R.flushNeeded();}}

    @Test
    public void testContains() {__CLR4_1_2kj4kj4l3lqxtxz.R.globalSliceStart(getClass().getName(),26689);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2y9zhfskld();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2kj4kj4l3lqxtxz.R.rethrow($CLV_t2$);}finally{__CLR4_1_2kj4kj4l3lqxtxz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.RangeTest.testContains",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),26689,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2y9zhfskld(){try{__CLR4_1_2kj4kj4l3lqxtxz.R.inc(26689);
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26690);assertFalse(intRange.contains(null));
        
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26691);assertFalse(intRange.contains(5));
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26692);assertTrue(intRange.contains(10));
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26693);assertTrue(intRange.contains(15));
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26694);assertTrue(intRange.contains(20));
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26695);assertFalse(intRange.contains(25));
    }finally{__CLR4_1_2kj4kj4l3lqxtxz.R.flushNeeded();}}

    @Test
    public void testIsAfter() {__CLR4_1_2kj4kj4l3lqxtxz.R.globalSliceStart(getClass().getName(),26696);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2ax1icnklk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2kj4kj4l3lqxtxz.R.rethrow($CLV_t2$);}finally{__CLR4_1_2kj4kj4l3lqxtxz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.RangeTest.testIsAfter",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),26696,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2ax1icnklk(){try{__CLR4_1_2kj4kj4l3lqxtxz.R.inc(26696);
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26697);assertFalse(intRange.isAfter(null));
        
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26698);assertTrue(intRange.isAfter(5));
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26699);assertFalse(intRange.isAfter(10));
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26700);assertFalse(intRange.isAfter(15));
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26701);assertFalse(intRange.isAfter(20));
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26702);assertFalse(intRange.isAfter(25));
    }finally{__CLR4_1_2kj4kj4l3lqxtxz.R.flushNeeded();}}

    @Test
    public void testIsStartedBy() {__CLR4_1_2kj4kj4l3lqxtxz.R.globalSliceStart(getClass().getName(),26703);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_25qeq2rklr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2kj4kj4l3lqxtxz.R.rethrow($CLV_t2$);}finally{__CLR4_1_2kj4kj4l3lqxtxz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.RangeTest.testIsStartedBy",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),26703,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_25qeq2rklr(){try{__CLR4_1_2kj4kj4l3lqxtxz.R.inc(26703);
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26704);assertFalse(intRange.isStartedBy(null));
        
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26705);assertFalse(intRange.isStartedBy(5));
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26706);assertTrue(intRange.isStartedBy(10));
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26707);assertFalse(intRange.isStartedBy(15));
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26708);assertFalse(intRange.isStartedBy(20));
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26709);assertFalse(intRange.isStartedBy(25));
    }finally{__CLR4_1_2kj4kj4l3lqxtxz.R.flushNeeded();}}

    @Test
    public void testIsEndedBy() {__CLR4_1_2kj4kj4l3lqxtxz.R.globalSliceStart(getClass().getName(),26710);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_29nab8ckly();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2kj4kj4l3lqxtxz.R.rethrow($CLV_t2$);}finally{__CLR4_1_2kj4kj4l3lqxtxz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.RangeTest.testIsEndedBy",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),26710,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_29nab8ckly(){try{__CLR4_1_2kj4kj4l3lqxtxz.R.inc(26710);
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26711);assertFalse(intRange.isEndedBy(null));
        
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26712);assertFalse(intRange.isEndedBy(5));
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26713);assertFalse(intRange.isEndedBy(10));
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26714);assertFalse(intRange.isEndedBy(15));
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26715);assertTrue(intRange.isEndedBy(20));
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26716);assertFalse(intRange.isEndedBy(25));
    }finally{__CLR4_1_2kj4kj4l3lqxtxz.R.flushNeeded();}}

    @Test
    public void testIsBefore() {__CLR4_1_2kj4kj4l3lqxtxz.R.globalSliceStart(getClass().getName(),26717);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_21rmvj2km5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2kj4kj4l3lqxtxz.R.rethrow($CLV_t2$);}finally{__CLR4_1_2kj4kj4l3lqxtxz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.RangeTest.testIsBefore",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),26717,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_21rmvj2km5(){try{__CLR4_1_2kj4kj4l3lqxtxz.R.inc(26717);
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26718);assertFalse(intRange.isBefore(null));
        
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26719);assertFalse(intRange.isBefore(5));
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26720);assertFalse(intRange.isBefore(10));
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26721);assertFalse(intRange.isBefore(15));
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26722);assertFalse(intRange.isBefore(20));
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26723);assertTrue(intRange.isBefore(25));
    }finally{__CLR4_1_2kj4kj4l3lqxtxz.R.flushNeeded();}}

    @Test
    public void testElementCompareTo() {__CLR4_1_2kj4kj4l3lqxtxz.R.globalSliceStart(getClass().getName(),26724);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2lqzq3hkmc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2kj4kj4l3lqxtxz.R.rethrow($CLV_t2$);}finally{__CLR4_1_2kj4kj4l3lqxtxz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.RangeTest.testElementCompareTo",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),26724,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2lqzq3hkmc(){try{__CLR4_1_2kj4kj4l3lqxtxz.R.inc(26724);
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26725);try {
            __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26726);intRange.elementCompareTo(null);
            __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26727);fail("NullPointerException should have been thrown");
        } catch(final NullPointerException npe) {
            // expected
        }
        
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26728);assertEquals(-1, intRange.elementCompareTo(5));
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26729);assertEquals(0, intRange.elementCompareTo(10));
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26730);assertEquals(0, intRange.elementCompareTo(15));
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26731);assertEquals(0, intRange.elementCompareTo(20));
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26732);assertEquals(1, intRange.elementCompareTo(25));
    }finally{__CLR4_1_2kj4kj4l3lqxtxz.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testContainsRange() {__CLR4_1_2kj4kj4l3lqxtxz.R.globalSliceStart(getClass().getName(),26733);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2d61e8dkml();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2kj4kj4l3lqxtxz.R.rethrow($CLV_t2$);}finally{__CLR4_1_2kj4kj4l3lqxtxz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.RangeTest.testContainsRange",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),26733,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2d61e8dkml(){try{__CLR4_1_2kj4kj4l3lqxtxz.R.inc(26733);

        // null handling
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26734);assertFalse(intRange.containsRange(null));

        // easy inside range
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26735);assertTrue(intRange.containsRange(Range.between(12, 18)));

        // outside range on each side
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26736);assertFalse(intRange.containsRange(Range.between(32, 45)));
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26737);assertFalse(intRange.containsRange(Range.between(2, 8)));

        // equals range
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26738);assertTrue(intRange.containsRange(Range.between(10, 20)));

        // overlaps
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26739);assertFalse(intRange.containsRange(Range.between(9, 14)));
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26740);assertFalse(intRange.containsRange(Range.between(16, 21)));

        // touches lower boundary
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26741);assertTrue(intRange.containsRange(Range.between(10, 19)));
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26742);assertFalse(intRange.containsRange(Range.between(10, 21)));

        // touches upper boundary
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26743);assertTrue(intRange.containsRange(Range.between(11, 20)));
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26744);assertFalse(intRange.containsRange(Range.between(9, 20)));
        
        // negative
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26745);assertFalse(intRange.containsRange(Range.between(-11, -18)));
    }finally{__CLR4_1_2kj4kj4l3lqxtxz.R.flushNeeded();}}

    @Test
    public void testIsAfterRange() {__CLR4_1_2kj4kj4l3lqxtxz.R.globalSliceStart(getClass().getName(),26746);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2xsoljwkmy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2kj4kj4l3lqxtxz.R.rethrow($CLV_t2$);}finally{__CLR4_1_2kj4kj4l3lqxtxz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.RangeTest.testIsAfterRange",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),26746,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2xsoljwkmy(){try{__CLR4_1_2kj4kj4l3lqxtxz.R.inc(26746);
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26747);assertFalse(intRange.isAfterRange(null));
        
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26748);assertTrue(intRange.isAfterRange(Range.between(5, 9)));
        
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26749);assertFalse(intRange.isAfterRange(Range.between(5, 10)));
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26750);assertFalse(intRange.isAfterRange(Range.between(5, 20)));
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26751);assertFalse(intRange.isAfterRange(Range.between(5, 25)));
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26752);assertFalse(intRange.isAfterRange(Range.between(15, 25)));
        
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26753);assertFalse(intRange.isAfterRange(Range.between(21, 25)));
        
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26754);assertFalse(intRange.isAfterRange(Range.between(10, 20)));
    }finally{__CLR4_1_2kj4kj4l3lqxtxz.R.flushNeeded();}}

    @Test
    public void testIsOverlappedBy() {__CLR4_1_2kj4kj4l3lqxtxz.R.globalSliceStart(getClass().getName(),26755);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2tbz4n6kn7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2kj4kj4l3lqxtxz.R.rethrow($CLV_t2$);}finally{__CLR4_1_2kj4kj4l3lqxtxz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.RangeTest.testIsOverlappedBy",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),26755,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2tbz4n6kn7(){try{__CLR4_1_2kj4kj4l3lqxtxz.R.inc(26755);

        // null handling
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26756);assertFalse(intRange.isOverlappedBy(null));

        // easy inside range
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26757);assertTrue(intRange.isOverlappedBy(Range.between(12, 18)));

        // outside range on each side
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26758);assertFalse(intRange.isOverlappedBy(Range.between(32, 45)));
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26759);assertFalse(intRange.isOverlappedBy(Range.between(2, 8)));

        // equals range
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26760);assertTrue(intRange.isOverlappedBy(Range.between(10, 20)));

        // overlaps
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26761);assertTrue(intRange.isOverlappedBy(Range.between(9, 14)));
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26762);assertTrue(intRange.isOverlappedBy(Range.between(16, 21)));

        // touches lower boundary
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26763);assertTrue(intRange.isOverlappedBy(Range.between(10, 19)));
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26764);assertTrue(intRange.isOverlappedBy(Range.between(10, 21)));

        // touches upper boundary
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26765);assertTrue(intRange.isOverlappedBy(Range.between(11, 20)));
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26766);assertTrue(intRange.isOverlappedBy(Range.between(9, 20)));
        
        // negative
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26767);assertFalse(intRange.isOverlappedBy(Range.between(-11, -18)));
    }finally{__CLR4_1_2kj4kj4l3lqxtxz.R.flushNeeded();}}

    @Test
    public void testIsBeforeRange() {__CLR4_1_2kj4kj4l3lqxtxz.R.globalSliceStart(getClass().getName(),26768);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2ww54nknk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2kj4kj4l3lqxtxz.R.rethrow($CLV_t2$);}finally{__CLR4_1_2kj4kj4l3lqxtxz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.RangeTest.testIsBeforeRange",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),26768,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2ww54nknk(){try{__CLR4_1_2kj4kj4l3lqxtxz.R.inc(26768);
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26769);assertFalse(intRange.isBeforeRange(null));
        
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26770);assertFalse(intRange.isBeforeRange(Range.between(5, 9)));
        
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26771);assertFalse(intRange.isBeforeRange(Range.between(5, 10)));
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26772);assertFalse(intRange.isBeforeRange(Range.between(5, 20)));
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26773);assertFalse(intRange.isBeforeRange(Range.between(5, 25)));
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26774);assertFalse(intRange.isBeforeRange(Range.between(15, 25)));
        
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26775);assertTrue(intRange.isBeforeRange(Range.between(21, 25)));
        
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26776);assertFalse(intRange.isBeforeRange(Range.between(10, 20)));
    }finally{__CLR4_1_2kj4kj4l3lqxtxz.R.flushNeeded();}}

    @Test
    public void testIntersectionWith() {__CLR4_1_2kj4kj4l3lqxtxz.R.globalSliceStart(getClass().getName(),26777);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2qu8q88knt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2kj4kj4l3lqxtxz.R.rethrow($CLV_t2$);}finally{__CLR4_1_2kj4kj4l3lqxtxz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.RangeTest.testIntersectionWith",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),26777,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2qu8q88knt(){try{__CLR4_1_2kj4kj4l3lqxtxz.R.inc(26777);
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26778);assertSame(intRange, intRange.intersectionWith(intRange));
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26779);assertSame(byteRange, byteRange.intersectionWith(byteRange));
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26780);assertSame(longRange, longRange.intersectionWith(longRange));
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26781);assertSame(floatRange, floatRange.intersectionWith(floatRange));
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26782);assertSame(doubleRange, doubleRange.intersectionWith(doubleRange));

        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26783);assertEquals(Range.between(10, 15), intRange.intersectionWith(Range.between(5, 15)));
    }finally{__CLR4_1_2kj4kj4l3lqxtxz.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testIntersectionWithNull() {__CLR4_1_2kj4kj4l3lqxtxz.R.globalSliceStart(getClass().getName(),26784);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2sqf7jlko0();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,73,110,116,101,114,115,101,99,116,105,111,110,87,105,116,104,78,117,108,108,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2kj4kj4l3lqxtxz.R.rethrow($CLV_t2$);}finally{__CLR4_1_2kj4kj4l3lqxtxz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.RangeTest.testIntersectionWithNull",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),26784,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2sqf7jlko0(){try{__CLR4_1_2kj4kj4l3lqxtxz.R.inc(26784);
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26785);intRange.intersectionWith(null);
    }finally{__CLR4_1_2kj4kj4l3lqxtxz.R.flushNeeded();}}

    @Test(expected = IllegalArgumentException.class)
    public void testIntersectionWithNonOverlapping() {__CLR4_1_2kj4kj4l3lqxtxz.R.globalSliceStart(getClass().getName(),26786);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2jzzt4cko2();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,73,110,116,101,114,115,101,99,116,105,111,110,87,105,116,104,78,111,110,79,118,101,114,108,97,112,112,105,110,103,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2kj4kj4l3lqxtxz.R.rethrow($CLV_t2$);}finally{__CLR4_1_2kj4kj4l3lqxtxz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.RangeTest.testIntersectionWithNonOverlapping",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),26786,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2jzzt4cko2(){try{__CLR4_1_2kj4kj4l3lqxtxz.R.inc(26786);
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26787);intRange.intersectionWith(Range.between(0, 9));
    }finally{__CLR4_1_2kj4kj4l3lqxtxz.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testSerializing() {__CLR4_1_2kj4kj4l3lqxtxz.R.globalSliceStart(getClass().getName(),26788);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2qqv6umko4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2kj4kj4l3lqxtxz.R.rethrow($CLV_t2$);}finally{__CLR4_1_2kj4kj4l3lqxtxz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.RangeTest.testSerializing",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),26788,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2qqv6umko4(){try{__CLR4_1_2kj4kj4l3lqxtxz.R.inc(26788);
        __CLR4_1_2kj4kj4l3lqxtxz.R.inc(26789);SerializationUtils.clone(intRange);
    }finally{__CLR4_1_2kj4kj4l3lqxtxz.R.flushNeeded();}}

}
