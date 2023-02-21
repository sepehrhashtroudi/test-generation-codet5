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
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.Arrays;

import org.junit.Test;

/**
 * Tests ArrayUtils remove and removeElement methods.
 * 
 * @version $Id$
 */
public class ArrayUtilsRemoveTest {static class __CLR4_1_2fvnfvnl3lqxtak{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492830024L,8589935092L,20943,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testRemoveObjectArray() {__CLR4_1_2fvnfvnl3lqxtak.R.globalSliceStart(getClass().getName(),20579);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_22m0dxfvn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2fvnfvnl3lqxtak.R.rethrow($CLV_t2$);}finally{__CLR4_1_2fvnfvnl3lqxtak.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveTest.testRemoveObjectArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),20579,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_22m0dxfvn(){try{__CLR4_1_2fvnfvnl3lqxtak.R.inc(20579);
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20580);Object[] array;
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20581);array = ArrayUtils.remove(new Object[] {"a"}, 0);
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20582);assertTrue(Arrays.equals(ArrayUtils.EMPTY_OBJECT_ARRAY, array));
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20583);assertEquals(Object.class, array.getClass().getComponentType());
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20584);array = ArrayUtils.remove(new Object[] {"a", "b"}, 0);
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20585);assertTrue(Arrays.equals(new Object[] {"b"}, array));
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20586);assertEquals(Object.class, array.getClass().getComponentType());
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20587);array = ArrayUtils.remove(new Object[] {"a", "b"}, 1);
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20588);assertTrue(Arrays.equals(new Object[] {"a"}, array));
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20589);assertEquals(Object.class, array.getClass().getComponentType());
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20590);array = ArrayUtils.remove(new Object[] {"a", "b", "c"}, 1);
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20591);assertTrue(Arrays.equals(new Object[] {"a", "c"}, array));
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20592);assertEquals(Object.class, array.getClass().getComponentType());
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20593);try {
            __CLR4_1_2fvnfvnl3lqxtak.R.inc(20594);ArrayUtils.remove(new Object[] {"a", "b"}, -1);
            __CLR4_1_2fvnfvnl3lqxtak.R.inc(20595);fail("IndexOutOfBoundsException expected");
        } catch (final IndexOutOfBoundsException e) {}
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20596);try {
            __CLR4_1_2fvnfvnl3lqxtak.R.inc(20597);ArrayUtils.remove(new Object[] {"a", "b"}, 2);
            __CLR4_1_2fvnfvnl3lqxtak.R.inc(20598);fail("IndexOutOfBoundsException expected");
        } catch (final IndexOutOfBoundsException e) {}
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20599);try {
            __CLR4_1_2fvnfvnl3lqxtak.R.inc(20600);ArrayUtils.remove((Object[]) null, 0);
            __CLR4_1_2fvnfvnl3lqxtak.R.inc(20601);fail("IndexOutOfBoundsException expected");
        } catch (final IndexOutOfBoundsException e) {}
    }finally{__CLR4_1_2fvnfvnl3lqxtak.R.flushNeeded();}}

    @Test
    public void testRemoveNumberArray(){__CLR4_1_2fvnfvnl3lqxtak.R.globalSliceStart(getClass().getName(),20602);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2fp651dfwa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2fvnfvnl3lqxtak.R.rethrow($CLV_t2$);}finally{__CLR4_1_2fvnfvnl3lqxtak.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveTest.testRemoveNumberArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),20602,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2fp651dfwa(){try{__CLR4_1_2fvnfvnl3lqxtak.R.inc(20602);
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20603);final Number[] inarray = {Integer.valueOf(1),Long.valueOf(2),Byte.valueOf((byte) 3)};
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20604);assertEquals(3, inarray.length);
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20605);Number[] outarray;
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20606);outarray = ArrayUtils.remove(inarray, 1);
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20607);assertEquals(2, outarray.length);
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20608);assertEquals(Number.class, outarray.getClass().getComponentType());
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20609);outarray = ArrayUtils.remove(outarray, 1);
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20610);assertEquals(1, outarray.length);
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20611);assertEquals(Number.class, outarray.getClass().getComponentType());
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20612);outarray = ArrayUtils.remove(outarray, 0);
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20613);assertEquals(0, outarray.length);
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20614);assertEquals(Number.class, outarray.getClass().getComponentType());
    }finally{__CLR4_1_2fvnfvnl3lqxtak.R.flushNeeded();}}

    @Test
    public void testRemoveBooleanArray() {__CLR4_1_2fvnfvnl3lqxtak.R.globalSliceStart(getClass().getName(),20615);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2ld5xzifwn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2fvnfvnl3lqxtak.R.rethrow($CLV_t2$);}finally{__CLR4_1_2fvnfvnl3lqxtak.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveTest.testRemoveBooleanArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),20615,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2ld5xzifwn(){try{__CLR4_1_2fvnfvnl3lqxtak.R.inc(20615);
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20616);boolean[] array;
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20617);array = ArrayUtils.remove(new boolean[] {true}, 0);
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20618);assertTrue(Arrays.equals(ArrayUtils.EMPTY_BOOLEAN_ARRAY, array));
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20619);assertEquals(Boolean.TYPE, array.getClass().getComponentType());
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20620);array = ArrayUtils.remove(new boolean[] {true, false}, 0);
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20621);assertTrue(Arrays.equals(new boolean[] {false}, array));
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20622);assertEquals(Boolean.TYPE, array.getClass().getComponentType());
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20623);array = ArrayUtils.remove(new boolean[] {true, false}, 1);
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20624);assertTrue(Arrays.equals(new boolean[] {true}, array));
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20625);assertEquals(Boolean.TYPE, array.getClass().getComponentType());
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20626);array = ArrayUtils.remove(new boolean[] {true, false, true}, 1);
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20627);assertTrue(Arrays.equals(new boolean[] {true, true}, array));
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20628);assertEquals(Boolean.TYPE, array.getClass().getComponentType());
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20629);try {
            __CLR4_1_2fvnfvnl3lqxtak.R.inc(20630);ArrayUtils.remove(new boolean[] {true, false}, -1);
            __CLR4_1_2fvnfvnl3lqxtak.R.inc(20631);fail("IndexOutOfBoundsException expected");
        } catch (final IndexOutOfBoundsException e) {}
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20632);try {
            __CLR4_1_2fvnfvnl3lqxtak.R.inc(20633);ArrayUtils.remove(new boolean[] {true, false}, 2);
            __CLR4_1_2fvnfvnl3lqxtak.R.inc(20634);fail("IndexOutOfBoundsException expected");
        } catch (final IndexOutOfBoundsException e) {}
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20635);try {
            __CLR4_1_2fvnfvnl3lqxtak.R.inc(20636);ArrayUtils.remove((boolean[]) null, 0);
            __CLR4_1_2fvnfvnl3lqxtak.R.inc(20637);fail("IndexOutOfBoundsException expected");
        } catch (final IndexOutOfBoundsException e) {}
    }finally{__CLR4_1_2fvnfvnl3lqxtak.R.flushNeeded();}}
    
    @Test
    public void testRemoveByteArray() {__CLR4_1_2fvnfvnl3lqxtak.R.globalSliceStart(getClass().getName(),20638);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2hmp2wufxa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2fvnfvnl3lqxtak.R.rethrow($CLV_t2$);}finally{__CLR4_1_2fvnfvnl3lqxtak.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveTest.testRemoveByteArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),20638,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2hmp2wufxa(){try{__CLR4_1_2fvnfvnl3lqxtak.R.inc(20638);
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20639);byte[] array;
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20640);array = ArrayUtils.remove(new byte[] {1}, 0);
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20641);assertTrue(Arrays.equals(ArrayUtils.EMPTY_BYTE_ARRAY, array));
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20642);assertEquals(Byte.TYPE, array.getClass().getComponentType());
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20643);array = ArrayUtils.remove(new byte[] {1, 2}, 0);
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20644);assertTrue(Arrays.equals(new byte[] {2}, array));
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20645);assertEquals(Byte.TYPE, array.getClass().getComponentType());
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20646);array = ArrayUtils.remove(new byte[] {1, 2}, 1);
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20647);assertTrue(Arrays.equals(new byte[] {1}, array));
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20648);assertEquals(Byte.TYPE, array.getClass().getComponentType());
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20649);array = ArrayUtils.remove(new byte[] {1, 2, 1}, 1);
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20650);assertTrue(Arrays.equals(new byte[] {1, 1}, array));
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20651);assertEquals(Byte.TYPE, array.getClass().getComponentType());
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20652);try {
            __CLR4_1_2fvnfvnl3lqxtak.R.inc(20653);ArrayUtils.remove(new byte[] {1, 2}, -1);
            __CLR4_1_2fvnfvnl3lqxtak.R.inc(20654);fail("IndexOutOfBoundsException expected");
        } catch (final IndexOutOfBoundsException e) {}
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20655);try {
            __CLR4_1_2fvnfvnl3lqxtak.R.inc(20656);ArrayUtils.remove(new byte[] {1, 2}, 2);
            __CLR4_1_2fvnfvnl3lqxtak.R.inc(20657);fail("IndexOutOfBoundsException expected");
        } catch (final IndexOutOfBoundsException e) {}
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20658);try {
            __CLR4_1_2fvnfvnl3lqxtak.R.inc(20659);ArrayUtils.remove((byte[]) null, 0);
            __CLR4_1_2fvnfvnl3lqxtak.R.inc(20660);fail("IndexOutOfBoundsException expected");
        } catch (final IndexOutOfBoundsException e) {}
    }finally{__CLR4_1_2fvnfvnl3lqxtak.R.flushNeeded();}}
    
    @Test
    public void testRemoveCharArray() {__CLR4_1_2fvnfvnl3lqxtak.R.globalSliceStart(getClass().getName(),20661);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2y62y18fxx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2fvnfvnl3lqxtak.R.rethrow($CLV_t2$);}finally{__CLR4_1_2fvnfvnl3lqxtak.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveTest.testRemoveCharArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),20661,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2y62y18fxx(){try{__CLR4_1_2fvnfvnl3lqxtak.R.inc(20661);
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20662);char[] array;
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20663);array = ArrayUtils.remove(new char[] {'a'}, 0);
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20664);assertTrue(Arrays.equals(ArrayUtils.EMPTY_CHAR_ARRAY, array));
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20665);assertEquals(Character.TYPE, array.getClass().getComponentType());
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20666);array = ArrayUtils.remove(new char[] {'a', 'b'}, 0);
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20667);assertTrue(Arrays.equals(new char[] {'b'}, array));
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20668);assertEquals(Character.TYPE, array.getClass().getComponentType());
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20669);array = ArrayUtils.remove(new char[] {'a', 'b'}, 1);
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20670);assertTrue(Arrays.equals(new char[] {'a'}, array));
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20671);assertEquals(Character.TYPE, array.getClass().getComponentType());
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20672);array = ArrayUtils.remove(new char[] {'a', 'b', 'c'}, 1);
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20673);assertTrue(Arrays.equals(new char[] {'a', 'c'}, array));
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20674);assertEquals(Character.TYPE, array.getClass().getComponentType());
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20675);try {
            __CLR4_1_2fvnfvnl3lqxtak.R.inc(20676);ArrayUtils.remove(new char[] {'a', 'b'}, -1);
            __CLR4_1_2fvnfvnl3lqxtak.R.inc(20677);fail("IndexOutOfBoundsException expected");
        } catch (final IndexOutOfBoundsException e) {}
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20678);try {
            __CLR4_1_2fvnfvnl3lqxtak.R.inc(20679);ArrayUtils.remove(new char[] {'a', 'b'}, 2);
            __CLR4_1_2fvnfvnl3lqxtak.R.inc(20680);fail("IndexOutOfBoundsException expected");
        } catch (final IndexOutOfBoundsException e) {}
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20681);try {
            __CLR4_1_2fvnfvnl3lqxtak.R.inc(20682);ArrayUtils.remove((char[]) null, 0);
            __CLR4_1_2fvnfvnl3lqxtak.R.inc(20683);fail("IndexOutOfBoundsException expected");
        } catch (final IndexOutOfBoundsException e) {}
    }finally{__CLR4_1_2fvnfvnl3lqxtak.R.flushNeeded();}}
    
    @Test
    public void testRemoveDoubleArray() {__CLR4_1_2fvnfvnl3lqxtak.R.globalSliceStart(getClass().getName(),20684);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2o9x56hfyk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2fvnfvnl3lqxtak.R.rethrow($CLV_t2$);}finally{__CLR4_1_2fvnfvnl3lqxtak.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveTest.testRemoveDoubleArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),20684,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2o9x56hfyk(){try{__CLR4_1_2fvnfvnl3lqxtak.R.inc(20684);
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20685);double[] array;
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20686);array = ArrayUtils.remove(new double[] {1}, 0);
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20687);assertTrue(Arrays.equals(ArrayUtils.EMPTY_DOUBLE_ARRAY, array));
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20688);assertEquals(Double.TYPE, array.getClass().getComponentType());
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20689);array = ArrayUtils.remove(new double[] {1, 2}, 0);
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20690);assertTrue(Arrays.equals(new double[] {2}, array));
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20691);assertEquals(Double.TYPE, array.getClass().getComponentType());
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20692);array = ArrayUtils.remove(new double[] {1, 2}, 1);
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20693);assertTrue(Arrays.equals(new double[] {1}, array));
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20694);assertEquals(Double.TYPE, array.getClass().getComponentType());
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20695);array = ArrayUtils.remove(new double[] {1, 2, 1}, 1);
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20696);assertTrue(Arrays.equals(new double[] {1, 1}, array));
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20697);assertEquals(Double.TYPE, array.getClass().getComponentType());
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20698);try {
            __CLR4_1_2fvnfvnl3lqxtak.R.inc(20699);ArrayUtils.remove(new double[] {1, 2}, -1);
            __CLR4_1_2fvnfvnl3lqxtak.R.inc(20700);fail("IndexOutOfBoundsException expected");
        } catch (final IndexOutOfBoundsException e) {}
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20701);try {
            __CLR4_1_2fvnfvnl3lqxtak.R.inc(20702);ArrayUtils.remove(new double[] {1, 2}, 2);
            __CLR4_1_2fvnfvnl3lqxtak.R.inc(20703);fail("IndexOutOfBoundsException expected");
        } catch (final IndexOutOfBoundsException e) {}
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20704);try {
            __CLR4_1_2fvnfvnl3lqxtak.R.inc(20705);ArrayUtils.remove((double[]) null, 0);
            __CLR4_1_2fvnfvnl3lqxtak.R.inc(20706);fail("IndexOutOfBoundsException expected");
        } catch (final IndexOutOfBoundsException e) {}
    }finally{__CLR4_1_2fvnfvnl3lqxtak.R.flushNeeded();}}
    
    @Test
    public void testRemoveFloatArray() {__CLR4_1_2fvnfvnl3lqxtak.R.globalSliceStart(getClass().getName(),20707);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2dxh9wmfz7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2fvnfvnl3lqxtak.R.rethrow($CLV_t2$);}finally{__CLR4_1_2fvnfvnl3lqxtak.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveTest.testRemoveFloatArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),20707,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2dxh9wmfz7(){try{__CLR4_1_2fvnfvnl3lqxtak.R.inc(20707);
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20708);float[] array;
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20709);array = ArrayUtils.remove(new float[] {1}, 0);
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20710);assertTrue(Arrays.equals(ArrayUtils.EMPTY_FLOAT_ARRAY, array));
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20711);assertEquals(Float.TYPE, array.getClass().getComponentType());
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20712);array = ArrayUtils.remove(new float[] {1, 2}, 0);
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20713);assertTrue(Arrays.equals(new float[] {2}, array));
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20714);assertEquals(Float.TYPE, array.getClass().getComponentType());
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20715);array = ArrayUtils.remove(new float[] {1, 2}, 1);
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20716);assertTrue(Arrays.equals(new float[] {1}, array));
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20717);assertEquals(Float.TYPE, array.getClass().getComponentType());
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20718);array = ArrayUtils.remove(new float[] {1, 2, 1}, 1);
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20719);assertTrue(Arrays.equals(new float[] {1, 1}, array));
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20720);assertEquals(Float.TYPE, array.getClass().getComponentType());
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20721);try {
            __CLR4_1_2fvnfvnl3lqxtak.R.inc(20722);ArrayUtils.remove(new float[] {1, 2}, -1);
            __CLR4_1_2fvnfvnl3lqxtak.R.inc(20723);fail("IndexOutOfBoundsException expected");
        } catch (final IndexOutOfBoundsException e) {}
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20724);try {
            __CLR4_1_2fvnfvnl3lqxtak.R.inc(20725);ArrayUtils.remove(new float[] {1, 2}, 2);
            __CLR4_1_2fvnfvnl3lqxtak.R.inc(20726);fail("IndexOutOfBoundsException expected");
        } catch (final IndexOutOfBoundsException e) {}
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20727);try {
            __CLR4_1_2fvnfvnl3lqxtak.R.inc(20728);ArrayUtils.remove((float[]) null, 0);
            __CLR4_1_2fvnfvnl3lqxtak.R.inc(20729);fail("IndexOutOfBoundsException expected");
        } catch (final IndexOutOfBoundsException e) {}
    }finally{__CLR4_1_2fvnfvnl3lqxtak.R.flushNeeded();}}
    
    @Test
    public void testRemoveIntArray() {__CLR4_1_2fvnfvnl3lqxtak.R.globalSliceStart(getClass().getName(),20730);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2to1mfbfzu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2fvnfvnl3lqxtak.R.rethrow($CLV_t2$);}finally{__CLR4_1_2fvnfvnl3lqxtak.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveTest.testRemoveIntArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),20730,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2to1mfbfzu(){try{__CLR4_1_2fvnfvnl3lqxtak.R.inc(20730);
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20731);int[] array;
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20732);array = ArrayUtils.remove(new int[] {1}, 0);
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20733);assertTrue(Arrays.equals(ArrayUtils.EMPTY_INT_ARRAY, array));
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20734);assertEquals(Integer.TYPE, array.getClass().getComponentType());
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20735);array = ArrayUtils.remove(new int[] {1, 2}, 0);
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20736);assertTrue(Arrays.equals(new int[] {2}, array));
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20737);assertEquals(Integer.TYPE, array.getClass().getComponentType());
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20738);array = ArrayUtils.remove(new int[] {1, 2}, 1);
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20739);assertTrue(Arrays.equals(new int[] {1}, array));
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20740);assertEquals(Integer.TYPE, array.getClass().getComponentType());
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20741);array = ArrayUtils.remove(new int[] {1, 2, 1}, 1);
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20742);assertTrue(Arrays.equals(new int[] {1, 1}, array));
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20743);assertEquals(Integer.TYPE, array.getClass().getComponentType());
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20744);try {
            __CLR4_1_2fvnfvnl3lqxtak.R.inc(20745);ArrayUtils.remove(new int[] {1, 2}, -1);
            __CLR4_1_2fvnfvnl3lqxtak.R.inc(20746);fail("IndexOutOfBoundsException expected");
        } catch (final IndexOutOfBoundsException e) {}
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20747);try {
            __CLR4_1_2fvnfvnl3lqxtak.R.inc(20748);ArrayUtils.remove(new int[] {1, 2}, 2);
            __CLR4_1_2fvnfvnl3lqxtak.R.inc(20749);fail("IndexOutOfBoundsException expected");
        } catch (final IndexOutOfBoundsException e) {}
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20750);try {
            __CLR4_1_2fvnfvnl3lqxtak.R.inc(20751);ArrayUtils.remove((int[]) null, 0);
            __CLR4_1_2fvnfvnl3lqxtak.R.inc(20752);fail("IndexOutOfBoundsException expected");
        } catch (final IndexOutOfBoundsException e) {}
    }finally{__CLR4_1_2fvnfvnl3lqxtak.R.flushNeeded();}}
    
    @Test
    public void testRemoveLongArray() {__CLR4_1_2fvnfvnl3lqxtak.R.globalSliceStart(getClass().getName(),20753);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2dkg3uag0h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2fvnfvnl3lqxtak.R.rethrow($CLV_t2$);}finally{__CLR4_1_2fvnfvnl3lqxtak.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveTest.testRemoveLongArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),20753,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2dkg3uag0h(){try{__CLR4_1_2fvnfvnl3lqxtak.R.inc(20753);
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20754);long[] array;
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20755);array = ArrayUtils.remove(new long[] {1}, 0);
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20756);assertTrue(Arrays.equals(ArrayUtils.EMPTY_LONG_ARRAY, array));
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20757);assertEquals(Long.TYPE, array.getClass().getComponentType());
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20758);array = ArrayUtils.remove(new long[] {1, 2}, 0);
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20759);assertTrue(Arrays.equals(new long[] {2}, array));
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20760);assertEquals(Long.TYPE, array.getClass().getComponentType());
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20761);array = ArrayUtils.remove(new long[] {1, 2}, 1);
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20762);assertTrue(Arrays.equals(new long[] {1}, array));
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20763);assertEquals(Long.TYPE, array.getClass().getComponentType());
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20764);array = ArrayUtils.remove(new long[] {1, 2, 1}, 1);
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20765);assertTrue(Arrays.equals(new long[] {1, 1}, array));
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20766);assertEquals(Long.TYPE, array.getClass().getComponentType());
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20767);try {
            __CLR4_1_2fvnfvnl3lqxtak.R.inc(20768);ArrayUtils.remove(new long[] {1, 2}, -1);
            __CLR4_1_2fvnfvnl3lqxtak.R.inc(20769);fail("IndexOutOfBoundsException expected");
        } catch (final IndexOutOfBoundsException e) {}
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20770);try {
            __CLR4_1_2fvnfvnl3lqxtak.R.inc(20771);ArrayUtils.remove(new long[] {1, 2}, 2);
            __CLR4_1_2fvnfvnl3lqxtak.R.inc(20772);fail("IndexOutOfBoundsException expected");
        } catch (final IndexOutOfBoundsException e) {}
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20773);try {
            __CLR4_1_2fvnfvnl3lqxtak.R.inc(20774);ArrayUtils.remove((long[]) null, 0);
            __CLR4_1_2fvnfvnl3lqxtak.R.inc(20775);fail("IndexOutOfBoundsException expected");
        } catch (final IndexOutOfBoundsException e) {}
    }finally{__CLR4_1_2fvnfvnl3lqxtak.R.flushNeeded();}}
    
    @Test
    public void testRemoveShortArray() {__CLR4_1_2fvnfvnl3lqxtak.R.globalSliceStart(getClass().getName(),20776);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2w420sag14();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2fvnfvnl3lqxtak.R.rethrow($CLV_t2$);}finally{__CLR4_1_2fvnfvnl3lqxtak.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveTest.testRemoveShortArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),20776,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2w420sag14(){try{__CLR4_1_2fvnfvnl3lqxtak.R.inc(20776);
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20777);short[] array;
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20778);array = ArrayUtils.remove(new short[] {1}, 0);
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20779);assertTrue(Arrays.equals(ArrayUtils.EMPTY_SHORT_ARRAY, array));
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20780);assertEquals(Short.TYPE, array.getClass().getComponentType());
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20781);array = ArrayUtils.remove(new short[] {1, 2}, 0);
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20782);assertTrue(Arrays.equals(new short[] {2}, array));
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20783);assertEquals(Short.TYPE, array.getClass().getComponentType());
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20784);array = ArrayUtils.remove(new short[] {1, 2}, 1);
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20785);assertTrue(Arrays.equals(new short[] {1}, array));
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20786);assertEquals(Short.TYPE, array.getClass().getComponentType());
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20787);array = ArrayUtils.remove(new short[] {1, 2, 1}, 1);
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20788);assertTrue(Arrays.equals(new short[] {1, 1}, array));
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20789);assertEquals(Short.TYPE, array.getClass().getComponentType());
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20790);try {
            __CLR4_1_2fvnfvnl3lqxtak.R.inc(20791);ArrayUtils.remove(new short[] {1, 2}, -1);
            __CLR4_1_2fvnfvnl3lqxtak.R.inc(20792);fail("IndexOutOfBoundsException expected");
        } catch (final IndexOutOfBoundsException e) {}
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20793);try {
            __CLR4_1_2fvnfvnl3lqxtak.R.inc(20794);ArrayUtils.remove(new short[] {1, 2}, 2);
            __CLR4_1_2fvnfvnl3lqxtak.R.inc(20795);fail("IndexOutOfBoundsException expected");
        } catch (final IndexOutOfBoundsException e) {}
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20796);try {
            __CLR4_1_2fvnfvnl3lqxtak.R.inc(20797);ArrayUtils.remove((short[]) null, 0);
            __CLR4_1_2fvnfvnl3lqxtak.R.inc(20798);fail("IndexOutOfBoundsException expected");
        } catch (final IndexOutOfBoundsException e) {}
    }finally{__CLR4_1_2fvnfvnl3lqxtak.R.flushNeeded();}}
    
    @Test
    public void testRemoveElementObjectArray() {__CLR4_1_2fvnfvnl3lqxtak.R.globalSliceStart(getClass().getName(),20799);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2xinaqtg1r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2fvnfvnl3lqxtak.R.rethrow($CLV_t2$);}finally{__CLR4_1_2fvnfvnl3lqxtak.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveTest.testRemoveElementObjectArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),20799,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2xinaqtg1r(){try{__CLR4_1_2fvnfvnl3lqxtak.R.inc(20799);
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20800);Object[] array;
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20801);array = ArrayUtils.removeElement((Object[]) null, "a");
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20802);assertNull(array);
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20803);array = ArrayUtils.removeElement(ArrayUtils.EMPTY_OBJECT_ARRAY, "a");
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20804);assertTrue(Arrays.equals(ArrayUtils.EMPTY_OBJECT_ARRAY, array));
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20805);assertEquals(Object.class, array.getClass().getComponentType());
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20806);array = ArrayUtils.removeElement(new Object[] {"a"}, "a");
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20807);assertTrue(Arrays.equals(ArrayUtils.EMPTY_OBJECT_ARRAY, array));
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20808);assertEquals(Object.class, array.getClass().getComponentType());
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20809);array = ArrayUtils.removeElement(new Object[] {"a", "b"}, "a");
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20810);assertTrue(Arrays.equals(new Object[] {"b"}, array));
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20811);assertEquals(Object.class, array.getClass().getComponentType());
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20812);array = ArrayUtils.removeElement(new Object[] {"a", "b", "a"}, "a");
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20813);assertTrue(Arrays.equals(new Object[] {"b", "a"}, array));
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20814);assertEquals(Object.class, array.getClass().getComponentType());
    }finally{__CLR4_1_2fvnfvnl3lqxtak.R.flushNeeded();}}
    
    @Test
    public void testRemoveElementBooleanArray() {__CLR4_1_2fvnfvnl3lqxtak.R.globalSliceStart(getClass().getName(),20815);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2l0d7gig27();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2fvnfvnl3lqxtak.R.rethrow($CLV_t2$);}finally{__CLR4_1_2fvnfvnl3lqxtak.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveTest.testRemoveElementBooleanArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),20815,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2l0d7gig27(){try{__CLR4_1_2fvnfvnl3lqxtak.R.inc(20815);
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20816);boolean[] array;
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20817);array = ArrayUtils.removeElement((boolean[]) null, true);
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20818);assertNull(array);
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20819);array = ArrayUtils.removeElement(ArrayUtils.EMPTY_BOOLEAN_ARRAY, true);
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20820);assertTrue(Arrays.equals(ArrayUtils.EMPTY_BOOLEAN_ARRAY, array));
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20821);assertEquals(Boolean.TYPE, array.getClass().getComponentType());
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20822);array = ArrayUtils.removeElement(new boolean[] {true}, true);
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20823);assertTrue(Arrays.equals(ArrayUtils.EMPTY_BOOLEAN_ARRAY, array));
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20824);assertEquals(Boolean.TYPE, array.getClass().getComponentType());
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20825);array = ArrayUtils.removeElement(new boolean[] {true, false}, true);
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20826);assertTrue(Arrays.equals(new boolean[] {false}, array));
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20827);assertEquals(Boolean.TYPE, array.getClass().getComponentType());
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20828);array = ArrayUtils.removeElement(new boolean[] {true, false, true}, true);
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20829);assertTrue(Arrays.equals(new boolean[] {false, true}, array));
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20830);assertEquals(Boolean.TYPE, array.getClass().getComponentType());
    }finally{__CLR4_1_2fvnfvnl3lqxtak.R.flushNeeded();}}
    
    @Test
    public void testRemoveElementByteArray() {__CLR4_1_2fvnfvnl3lqxtak.R.globalSliceStart(getClass().getName(),20831);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2sz2coeg2n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2fvnfvnl3lqxtak.R.rethrow($CLV_t2$);}finally{__CLR4_1_2fvnfvnl3lqxtak.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveTest.testRemoveElementByteArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),20831,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2sz2coeg2n(){try{__CLR4_1_2fvnfvnl3lqxtak.R.inc(20831);
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20832);byte[] array;
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20833);array = ArrayUtils.removeElement((byte[]) null, (byte) 1);
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20834);assertNull(array);
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20835);array = ArrayUtils.removeElement(ArrayUtils.EMPTY_BYTE_ARRAY, (byte) 1);
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20836);assertTrue(Arrays.equals(ArrayUtils.EMPTY_BYTE_ARRAY, array));
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20837);assertEquals(Byte.TYPE, array.getClass().getComponentType());
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20838);array = ArrayUtils.removeElement(new byte[] {1}, (byte) 1);
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20839);assertTrue(Arrays.equals(ArrayUtils.EMPTY_BYTE_ARRAY, array));
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20840);assertEquals(Byte.TYPE, array.getClass().getComponentType());
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20841);array = ArrayUtils.removeElement(new byte[] {1, 2}, (byte) 1);
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20842);assertTrue(Arrays.equals(new byte[] {2}, array));
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20843);assertEquals(Byte.TYPE, array.getClass().getComponentType());
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20844);array = ArrayUtils.removeElement(new byte[] {1, 2, 1}, (byte) 1);
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20845);assertTrue(Arrays.equals(new byte[] {2, 1}, array));
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20846);assertEquals(Byte.TYPE, array.getClass().getComponentType());
    }finally{__CLR4_1_2fvnfvnl3lqxtak.R.flushNeeded();}}
    
    @Test
    public void testRemoveElementCharArray() {__CLR4_1_2fvnfvnl3lqxtak.R.globalSliceStart(getClass().getName(),20847);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2pinu6cg33();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2fvnfvnl3lqxtak.R.rethrow($CLV_t2$);}finally{__CLR4_1_2fvnfvnl3lqxtak.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveTest.testRemoveElementCharArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),20847,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2pinu6cg33(){try{__CLR4_1_2fvnfvnl3lqxtak.R.inc(20847);
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20848);char[] array;
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20849);array = ArrayUtils.removeElement((char[]) null, 'a');
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20850);assertNull(array);
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20851);array = ArrayUtils.removeElement(ArrayUtils.EMPTY_CHAR_ARRAY, 'a');
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20852);assertTrue(Arrays.equals(ArrayUtils.EMPTY_CHAR_ARRAY, array));
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20853);assertEquals(Character.TYPE, array.getClass().getComponentType());
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20854);array = ArrayUtils.removeElement(new char[] {'a'}, 'a');
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20855);assertTrue(Arrays.equals(ArrayUtils.EMPTY_CHAR_ARRAY, array));
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20856);assertEquals(Character.TYPE, array.getClass().getComponentType());
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20857);array = ArrayUtils.removeElement(new char[] {'a', 'b'}, 'a');
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20858);assertTrue(Arrays.equals(new char[] {'b'}, array));
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20859);assertEquals(Character.TYPE, array.getClass().getComponentType());
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20860);array = ArrayUtils.removeElement(new char[] {'a', 'b', 'a'}, 'a');
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20861);assertTrue(Arrays.equals(new char[] {'b', 'a'}, array));
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20862);assertEquals(Character.TYPE, array.getClass().getComponentType());
    }finally{__CLR4_1_2fvnfvnl3lqxtak.R.flushNeeded();}}
    
    @Test
    @SuppressWarnings("cast")
    public void testRemoveElementDoubleArray() {__CLR4_1_2fvnfvnl3lqxtak.R.globalSliceStart(getClass().getName(),20863);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_296456fg3j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2fvnfvnl3lqxtak.R.rethrow($CLV_t2$);}finally{__CLR4_1_2fvnfvnl3lqxtak.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveTest.testRemoveElementDoubleArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),20863,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_296456fg3j(){try{__CLR4_1_2fvnfvnl3lqxtak.R.inc(20863);
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20864);double[] array;
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20865);array = ArrayUtils.removeElement((double[]) null, (double) 1);
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20866);assertNull(array);
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20867);array = ArrayUtils.removeElement(ArrayUtils.EMPTY_DOUBLE_ARRAY, (double) 1);
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20868);assertTrue(Arrays.equals(ArrayUtils.EMPTY_DOUBLE_ARRAY, array));
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20869);assertEquals(Double.TYPE, array.getClass().getComponentType());
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20870);array = ArrayUtils.removeElement(new double[] {1}, (double) 1);
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20871);assertTrue(Arrays.equals(ArrayUtils.EMPTY_DOUBLE_ARRAY, array));
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20872);assertEquals(Double.TYPE, array.getClass().getComponentType());
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20873);array = ArrayUtils.removeElement(new double[] {1, 2}, (double) 1);
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20874);assertTrue(Arrays.equals(new double[] {2}, array));
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20875);assertEquals(Double.TYPE, array.getClass().getComponentType());
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20876);array = ArrayUtils.removeElement(new double[] {1, 2, 1}, (double) 1);
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20877);assertTrue(Arrays.equals(new double[] {2, 1}, array));
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20878);assertEquals(Double.TYPE, array.getClass().getComponentType());
    }finally{__CLR4_1_2fvnfvnl3lqxtak.R.flushNeeded();}}
    
    @Test
    @SuppressWarnings("cast")
    public void testRemoveElementFloatArray() {__CLR4_1_2fvnfvnl3lqxtak.R.globalSliceStart(getClass().getName(),20879);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2afcerag3z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2fvnfvnl3lqxtak.R.rethrow($CLV_t2$);}finally{__CLR4_1_2fvnfvnl3lqxtak.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveTest.testRemoveElementFloatArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),20879,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2afcerag3z(){try{__CLR4_1_2fvnfvnl3lqxtak.R.inc(20879);
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20880);float[] array;
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20881);array = ArrayUtils.removeElement((float[]) null, (float) 1);
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20882);assertNull(array);
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20883);array = ArrayUtils.removeElement(ArrayUtils.EMPTY_FLOAT_ARRAY, (float) 1);
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20884);assertTrue(Arrays.equals(ArrayUtils.EMPTY_FLOAT_ARRAY, array));
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20885);assertEquals(Float.TYPE, array.getClass().getComponentType());
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20886);array = ArrayUtils.removeElement(new float[] {1}, (float) 1);
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20887);assertTrue(Arrays.equals(ArrayUtils.EMPTY_FLOAT_ARRAY, array));
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20888);assertEquals(Float.TYPE, array.getClass().getComponentType());
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20889);array = ArrayUtils.removeElement(new float[] {1, 2}, (float) 1);
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20890);assertTrue(Arrays.equals(new float[] {2}, array));
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20891);assertEquals(Float.TYPE, array.getClass().getComponentType());
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20892);array = ArrayUtils.removeElement(new float[] {1, 2, 1}, (float) 1);
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20893);assertTrue(Arrays.equals(new float[] {2, 1}, array));
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20894);assertEquals(Float.TYPE, array.getClass().getComponentType());
    }finally{__CLR4_1_2fvnfvnl3lqxtak.R.flushNeeded();}}
    
    @Test
    public void testRemoveElementIntArray() {__CLR4_1_2fvnfvnl3lqxtak.R.globalSliceStart(getClass().getName(),20895);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2k4x6rbg4f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2fvnfvnl3lqxtak.R.rethrow($CLV_t2$);}finally{__CLR4_1_2fvnfvnl3lqxtak.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveTest.testRemoveElementIntArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),20895,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2k4x6rbg4f(){try{__CLR4_1_2fvnfvnl3lqxtak.R.inc(20895);
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20896);int[] array;
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20897);array = ArrayUtils.removeElement((int[]) null, 1);
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20898);assertNull(array);
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20899);array = ArrayUtils.removeElement(ArrayUtils.EMPTY_INT_ARRAY, 1);
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20900);assertTrue(Arrays.equals(ArrayUtils.EMPTY_INT_ARRAY, array));
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20901);assertEquals(Integer.TYPE, array.getClass().getComponentType());
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20902);array = ArrayUtils.removeElement(new int[] {1}, 1);
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20903);assertTrue(Arrays.equals(ArrayUtils.EMPTY_INT_ARRAY, array));
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20904);assertEquals(Integer.TYPE, array.getClass().getComponentType());
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20905);array = ArrayUtils.removeElement(new int[] {1, 2}, 1);
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20906);assertTrue(Arrays.equals(new int[] {2}, array));
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20907);assertEquals(Integer.TYPE, array.getClass().getComponentType());
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20908);array = ArrayUtils.removeElement(new int[] {1, 2, 1}, 1);
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20909);assertTrue(Arrays.equals(new int[] {2, 1}, array));
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20910);assertEquals(Integer.TYPE, array.getClass().getComponentType());
    }finally{__CLR4_1_2fvnfvnl3lqxtak.R.flushNeeded();}}
    
    @Test
    @SuppressWarnings("cast")
    public void testRemoveElementLongArray() {__CLR4_1_2fvnfvnl3lqxtak.R.globalSliceStart(getClass().getName(),20911);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2owtdlug4v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2fvnfvnl3lqxtak.R.rethrow($CLV_t2$);}finally{__CLR4_1_2fvnfvnl3lqxtak.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveTest.testRemoveElementLongArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),20911,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2owtdlug4v(){try{__CLR4_1_2fvnfvnl3lqxtak.R.inc(20911);
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20912);long[] array;
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20913);array = ArrayUtils.removeElement((long[]) null, (long) 1);
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20914);assertNull(array);
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20915);array = ArrayUtils.removeElement(ArrayUtils.EMPTY_LONG_ARRAY, (long) 1);
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20916);assertTrue(Arrays.equals(ArrayUtils.EMPTY_LONG_ARRAY, array));
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20917);assertEquals(Long.TYPE, array.getClass().getComponentType());
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20918);array = ArrayUtils.removeElement(new long[] {1}, (long) 1);
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20919);assertTrue(Arrays.equals(ArrayUtils.EMPTY_LONG_ARRAY, array));
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20920);assertEquals(Long.TYPE, array.getClass().getComponentType());
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20921);array = ArrayUtils.removeElement(new long[] {1, 2}, (long) 1);
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20922);assertTrue(Arrays.equals(new long[] {2}, array));
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20923);assertEquals(Long.TYPE, array.getClass().getComponentType());
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20924);array = ArrayUtils.removeElement(new long[] {1, 2, 1}, (long) 1);
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20925);assertTrue(Arrays.equals(new long[] {2, 1}, array));
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20926);assertEquals(Long.TYPE, array.getClass().getComponentType());
    }finally{__CLR4_1_2fvnfvnl3lqxtak.R.flushNeeded();}}
    
    @Test
    public void testRemoveElementShortArray() {__CLR4_1_2fvnfvnl3lqxtak.R.globalSliceStart(getClass().getName(),20927);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2zex61ig5b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2fvnfvnl3lqxtak.R.rethrow($CLV_t2$);}finally{__CLR4_1_2fvnfvnl3lqxtak.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.ArrayUtilsRemoveTest.testRemoveElementShortArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),20927,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2zex61ig5b(){try{__CLR4_1_2fvnfvnl3lqxtak.R.inc(20927);
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20928);short[] array;
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20929);array = ArrayUtils.removeElement((short[]) null, (short) 1);
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20930);assertNull(array);
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20931);array = ArrayUtils.removeElement(ArrayUtils.EMPTY_SHORT_ARRAY, (short) 1);
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20932);assertTrue(Arrays.equals(ArrayUtils.EMPTY_SHORT_ARRAY, array));
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20933);assertEquals(Short.TYPE, array.getClass().getComponentType());
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20934);array = ArrayUtils.removeElement(new short[] {1}, (short) 1);
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20935);assertTrue(Arrays.equals(ArrayUtils.EMPTY_SHORT_ARRAY, array));
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20936);assertEquals(Short.TYPE, array.getClass().getComponentType());
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20937);array = ArrayUtils.removeElement(new short[] {1, 2}, (short) 1);
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20938);assertTrue(Arrays.equals(new short[] {2}, array));
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20939);assertEquals(Short.TYPE, array.getClass().getComponentType());
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20940);array = ArrayUtils.removeElement(new short[] {1, 2, 1}, (short) 1);
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20941);assertTrue(Arrays.equals(new short[] {2, 1}, array));
        __CLR4_1_2fvnfvnl3lqxtak.R.inc(20942);assertEquals(Short.TYPE, array.getClass().getComponentType());
    }finally{__CLR4_1_2fvnfvnl3lqxtak.R.flushNeeded();}}
    
}
