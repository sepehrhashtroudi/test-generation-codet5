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

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * JUnit tests.
 * 
 * @version $Id$
 * @see MutableShort
 */
public class MutableShortTest {static class __CLR4_1_2swpswpl3lqxuth{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492830024L,8589935092L,37561,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    // ----------------------------------------------------------------
    @Test
    public void testConstructors() {__CLR4_1_2swpswpl3lqxuth.R.globalSliceStart(getClass().getName(),37465);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2lwxaheswp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2swpswpl3lqxuth.R.rethrow($CLV_t2$);}finally{__CLR4_1_2swpswpl3lqxuth.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableShortTest.testConstructors",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37465,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2lwxaheswp(){try{__CLR4_1_2swpswpl3lqxuth.R.inc(37465);
        __CLR4_1_2swpswpl3lqxuth.R.inc(37466);assertEquals((short) 0, new MutableShort().shortValue());
        
        __CLR4_1_2swpswpl3lqxuth.R.inc(37467);assertEquals((short) 1, new MutableShort((short) 1).shortValue());
        
        __CLR4_1_2swpswpl3lqxuth.R.inc(37468);assertEquals((short) 2, new MutableShort(Short.valueOf((short) 2)).shortValue());
        __CLR4_1_2swpswpl3lqxuth.R.inc(37469);assertEquals((short) 3, new MutableShort(new MutableShort((short) 3)).shortValue());

        __CLR4_1_2swpswpl3lqxuth.R.inc(37470);assertEquals((short) 2, new MutableShort("2").shortValue());

        __CLR4_1_2swpswpl3lqxuth.R.inc(37471);try {
            __CLR4_1_2swpswpl3lqxuth.R.inc(37472);new MutableShort((Number)null);
            __CLR4_1_2swpswpl3lqxuth.R.inc(37473);fail();
        } catch (final NullPointerException ex) {}
    }finally{__CLR4_1_2swpswpl3lqxuth.R.flushNeeded();}}

    @Test
    public void testGetSet() {__CLR4_1_2swpswpl3lqxuth.R.globalSliceStart(getClass().getName(),37474);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_22wnvh7swy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2swpswpl3lqxuth.R.rethrow($CLV_t2$);}finally{__CLR4_1_2swpswpl3lqxuth.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableShortTest.testGetSet",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37474,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_22wnvh7swy(){try{__CLR4_1_2swpswpl3lqxuth.R.inc(37474);
        __CLR4_1_2swpswpl3lqxuth.R.inc(37475);final MutableShort mutNum = new MutableShort((short) 0);
        __CLR4_1_2swpswpl3lqxuth.R.inc(37476);assertEquals((short) 0, new MutableShort().shortValue());
        __CLR4_1_2swpswpl3lqxuth.R.inc(37477);assertEquals(Short.valueOf((short) 0), new MutableShort().getValue());
        
        __CLR4_1_2swpswpl3lqxuth.R.inc(37478);mutNum.setValue((short) 1);
        __CLR4_1_2swpswpl3lqxuth.R.inc(37479);assertEquals((short) 1, mutNum.shortValue());
        __CLR4_1_2swpswpl3lqxuth.R.inc(37480);assertEquals(Short.valueOf((short) 1), mutNum.getValue());
        
        __CLR4_1_2swpswpl3lqxuth.R.inc(37481);mutNum.setValue(Short.valueOf((short) 2));
        __CLR4_1_2swpswpl3lqxuth.R.inc(37482);assertEquals((short) 2, mutNum.shortValue());
        __CLR4_1_2swpswpl3lqxuth.R.inc(37483);assertEquals(Short.valueOf((short) 2), mutNum.getValue());
        
        __CLR4_1_2swpswpl3lqxuth.R.inc(37484);mutNum.setValue(new MutableShort((short) 3));
        __CLR4_1_2swpswpl3lqxuth.R.inc(37485);assertEquals((short) 3, mutNum.shortValue());
        __CLR4_1_2swpswpl3lqxuth.R.inc(37486);assertEquals(Short.valueOf((short) 3), mutNum.getValue());
        __CLR4_1_2swpswpl3lqxuth.R.inc(37487);try {
            __CLR4_1_2swpswpl3lqxuth.R.inc(37488);mutNum.setValue(null);
            __CLR4_1_2swpswpl3lqxuth.R.inc(37489);fail();
        } catch (final NullPointerException ex) {}
    }finally{__CLR4_1_2swpswpl3lqxuth.R.flushNeeded();}}

    @Test
    public void testEquals() {__CLR4_1_2swpswpl3lqxuth.R.globalSliceStart(getClass().getName(),37490);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2s4e608sxe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2swpswpl3lqxuth.R.rethrow($CLV_t2$);}finally{__CLR4_1_2swpswpl3lqxuth.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableShortTest.testEquals",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37490,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2s4e608sxe(){try{__CLR4_1_2swpswpl3lqxuth.R.inc(37490);
        __CLR4_1_2swpswpl3lqxuth.R.inc(37491);final MutableShort mutNumA = new MutableShort((short) 0);
        __CLR4_1_2swpswpl3lqxuth.R.inc(37492);final MutableShort mutNumB = new MutableShort((short) 0);
        __CLR4_1_2swpswpl3lqxuth.R.inc(37493);final MutableShort mutNumC = new MutableShort((short) 1);

        __CLR4_1_2swpswpl3lqxuth.R.inc(37494);assertTrue(mutNumA.equals(mutNumA));
        __CLR4_1_2swpswpl3lqxuth.R.inc(37495);assertTrue(mutNumA.equals(mutNumB));
        __CLR4_1_2swpswpl3lqxuth.R.inc(37496);assertTrue(mutNumB.equals(mutNumA));
        __CLR4_1_2swpswpl3lqxuth.R.inc(37497);assertTrue(mutNumB.equals(mutNumB));
        __CLR4_1_2swpswpl3lqxuth.R.inc(37498);assertFalse(mutNumA.equals(mutNumC));
        __CLR4_1_2swpswpl3lqxuth.R.inc(37499);assertFalse(mutNumB.equals(mutNumC));
        __CLR4_1_2swpswpl3lqxuth.R.inc(37500);assertTrue(mutNumC.equals(mutNumC));
        __CLR4_1_2swpswpl3lqxuth.R.inc(37501);assertFalse(mutNumA.equals(null));
        __CLR4_1_2swpswpl3lqxuth.R.inc(37502);assertFalse(mutNumA.equals(Short.valueOf((short) 0)));
        __CLR4_1_2swpswpl3lqxuth.R.inc(37503);assertFalse(mutNumA.equals("0"));
    }finally{__CLR4_1_2swpswpl3lqxuth.R.flushNeeded();}}

    @Test
    public void testHashCode() {__CLR4_1_2swpswpl3lqxuth.R.globalSliceStart(getClass().getName(),37504);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_23zkhv8sxs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2swpswpl3lqxuth.R.rethrow($CLV_t2$);}finally{__CLR4_1_2swpswpl3lqxuth.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableShortTest.testHashCode",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37504,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_23zkhv8sxs(){try{__CLR4_1_2swpswpl3lqxuth.R.inc(37504);
        __CLR4_1_2swpswpl3lqxuth.R.inc(37505);final MutableShort mutNumA = new MutableShort((short) 0);
        __CLR4_1_2swpswpl3lqxuth.R.inc(37506);final MutableShort mutNumB = new MutableShort((short) 0);
        __CLR4_1_2swpswpl3lqxuth.R.inc(37507);final MutableShort mutNumC = new MutableShort((short) 1);

        __CLR4_1_2swpswpl3lqxuth.R.inc(37508);assertTrue(mutNumA.hashCode() == mutNumA.hashCode());
        __CLR4_1_2swpswpl3lqxuth.R.inc(37509);assertTrue(mutNumA.hashCode() == mutNumB.hashCode());
        __CLR4_1_2swpswpl3lqxuth.R.inc(37510);assertFalse(mutNumA.hashCode() == mutNumC.hashCode());
        __CLR4_1_2swpswpl3lqxuth.R.inc(37511);assertTrue(mutNumA.hashCode() == Short.valueOf((short) 0).hashCode());
    }finally{__CLR4_1_2swpswpl3lqxuth.R.flushNeeded();}}

    @Test
    public void testCompareTo() {__CLR4_1_2swpswpl3lqxuth.R.globalSliceStart(getClass().getName(),37512);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2pz6vfvsy0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2swpswpl3lqxuth.R.rethrow($CLV_t2$);}finally{__CLR4_1_2swpswpl3lqxuth.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableShortTest.testCompareTo",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37512,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2pz6vfvsy0(){try{__CLR4_1_2swpswpl3lqxuth.R.inc(37512);
        __CLR4_1_2swpswpl3lqxuth.R.inc(37513);final MutableShort mutNum = new MutableShort((short) 0);

        __CLR4_1_2swpswpl3lqxuth.R.inc(37514);assertEquals((short) 0, mutNum.compareTo(new MutableShort((short) 0)));
        __CLR4_1_2swpswpl3lqxuth.R.inc(37515);assertEquals((short) +1, mutNum.compareTo(new MutableShort((short) -1)));
        __CLR4_1_2swpswpl3lqxuth.R.inc(37516);assertEquals((short) -1, mutNum.compareTo(new MutableShort((short) 1)));
        __CLR4_1_2swpswpl3lqxuth.R.inc(37517);try {
            __CLR4_1_2swpswpl3lqxuth.R.inc(37518);mutNum.compareTo(null);
            __CLR4_1_2swpswpl3lqxuth.R.inc(37519);fail();
        } catch (final NullPointerException ex) {}
    }finally{__CLR4_1_2swpswpl3lqxuth.R.flushNeeded();}}

    @Test
    public void testPrimitiveValues() {__CLR4_1_2swpswpl3lqxuth.R.globalSliceStart(getClass().getName(),37520);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2uifrysy8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2swpswpl3lqxuth.R.rethrow($CLV_t2$);}finally{__CLR4_1_2swpswpl3lqxuth.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableShortTest.testPrimitiveValues",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37520,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2uifrysy8(){try{__CLR4_1_2swpswpl3lqxuth.R.inc(37520);
        __CLR4_1_2swpswpl3lqxuth.R.inc(37521);final MutableShort mutNum = new MutableShort( (short) 1 );
        
        __CLR4_1_2swpswpl3lqxuth.R.inc(37522);assertEquals( 1.0F, mutNum.floatValue(), 0 );
        __CLR4_1_2swpswpl3lqxuth.R.inc(37523);assertEquals( 1.0, mutNum.doubleValue(), 0 );
        __CLR4_1_2swpswpl3lqxuth.R.inc(37524);assertEquals( (byte) 1, mutNum.byteValue() );
        __CLR4_1_2swpswpl3lqxuth.R.inc(37525);assertEquals( (short) 1, mutNum.shortValue() );
        __CLR4_1_2swpswpl3lqxuth.R.inc(37526);assertEquals( 1, mutNum.intValue() );
        __CLR4_1_2swpswpl3lqxuth.R.inc(37527);assertEquals( 1L, mutNum.longValue() );
    }finally{__CLR4_1_2swpswpl3lqxuth.R.flushNeeded();}}

    @Test
    public void testToShort() {__CLR4_1_2swpswpl3lqxuth.R.globalSliceStart(getClass().getName(),37528);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2e3ox56syg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2swpswpl3lqxuth.R.rethrow($CLV_t2$);}finally{__CLR4_1_2swpswpl3lqxuth.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableShortTest.testToShort",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37528,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2e3ox56syg(){try{__CLR4_1_2swpswpl3lqxuth.R.inc(37528);
        __CLR4_1_2swpswpl3lqxuth.R.inc(37529);assertEquals(Short.valueOf((short) 0), new MutableShort((short) 0).toShort());
        __CLR4_1_2swpswpl3lqxuth.R.inc(37530);assertEquals(Short.valueOf((short) 123), new MutableShort((short) 123).toShort());
    }finally{__CLR4_1_2swpswpl3lqxuth.R.flushNeeded();}}

    @Test
    public void testIncrement() {__CLR4_1_2swpswpl3lqxuth.R.globalSliceStart(getClass().getName(),37531);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2m6qqn0syj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2swpswpl3lqxuth.R.rethrow($CLV_t2$);}finally{__CLR4_1_2swpswpl3lqxuth.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableShortTest.testIncrement",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37531,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2m6qqn0syj(){try{__CLR4_1_2swpswpl3lqxuth.R.inc(37531);
        __CLR4_1_2swpswpl3lqxuth.R.inc(37532);final MutableShort mutNum = new MutableShort((short) 1);
        __CLR4_1_2swpswpl3lqxuth.R.inc(37533);mutNum.increment();
        
        __CLR4_1_2swpswpl3lqxuth.R.inc(37534);assertEquals(2, mutNum.intValue());
        __CLR4_1_2swpswpl3lqxuth.R.inc(37535);assertEquals(2L, mutNum.longValue());
    }finally{__CLR4_1_2swpswpl3lqxuth.R.flushNeeded();}}

    @Test
    public void testDecrement() {__CLR4_1_2swpswpl3lqxuth.R.globalSliceStart(getClass().getName(),37536);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2pripmwsyo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2swpswpl3lqxuth.R.rethrow($CLV_t2$);}finally{__CLR4_1_2swpswpl3lqxuth.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableShortTest.testDecrement",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37536,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2pripmwsyo(){try{__CLR4_1_2swpswpl3lqxuth.R.inc(37536);
        __CLR4_1_2swpswpl3lqxuth.R.inc(37537);final MutableShort mutNum = new MutableShort((short) 1);
        __CLR4_1_2swpswpl3lqxuth.R.inc(37538);mutNum.decrement();
        
        __CLR4_1_2swpswpl3lqxuth.R.inc(37539);assertEquals(0, mutNum.intValue());
        __CLR4_1_2swpswpl3lqxuth.R.inc(37540);assertEquals(0L, mutNum.longValue());
    }finally{__CLR4_1_2swpswpl3lqxuth.R.flushNeeded();}}

    @Test
    public void testAddValuePrimitive() {__CLR4_1_2swpswpl3lqxuth.R.globalSliceStart(getClass().getName(),37541);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2nrme6ssyt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2swpswpl3lqxuth.R.rethrow($CLV_t2$);}finally{__CLR4_1_2swpswpl3lqxuth.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableShortTest.testAddValuePrimitive",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37541,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2nrme6ssyt(){try{__CLR4_1_2swpswpl3lqxuth.R.inc(37541);
        __CLR4_1_2swpswpl3lqxuth.R.inc(37542);final MutableShort mutNum = new MutableShort((short) 1);
        __CLR4_1_2swpswpl3lqxuth.R.inc(37543);mutNum.add((short) 1);
        
        __CLR4_1_2swpswpl3lqxuth.R.inc(37544);assertEquals((short) 2, mutNum.shortValue());
    }finally{__CLR4_1_2swpswpl3lqxuth.R.flushNeeded();}}

    @Test
    public void testAddValueObject() {__CLR4_1_2swpswpl3lqxuth.R.globalSliceStart(getClass().getName(),37545);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2cu6v3ssyx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2swpswpl3lqxuth.R.rethrow($CLV_t2$);}finally{__CLR4_1_2swpswpl3lqxuth.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableShortTest.testAddValueObject",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37545,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2cu6v3ssyx(){try{__CLR4_1_2swpswpl3lqxuth.R.inc(37545);
        __CLR4_1_2swpswpl3lqxuth.R.inc(37546);final MutableShort mutNum = new MutableShort((short) 1);
        __CLR4_1_2swpswpl3lqxuth.R.inc(37547);mutNum.add(Short.valueOf((short) 1));
        
        __CLR4_1_2swpswpl3lqxuth.R.inc(37548);assertEquals((short) 2, mutNum.shortValue());
    }finally{__CLR4_1_2swpswpl3lqxuth.R.flushNeeded();}}

    @Test
    public void testSubtractValuePrimitive() {__CLR4_1_2swpswpl3lqxuth.R.globalSliceStart(getClass().getName(),37549);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2w07icjsz1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2swpswpl3lqxuth.R.rethrow($CLV_t2$);}finally{__CLR4_1_2swpswpl3lqxuth.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableShortTest.testSubtractValuePrimitive",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37549,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2w07icjsz1(){try{__CLR4_1_2swpswpl3lqxuth.R.inc(37549);
        __CLR4_1_2swpswpl3lqxuth.R.inc(37550);final MutableShort mutNum = new MutableShort((short) 1);
        __CLR4_1_2swpswpl3lqxuth.R.inc(37551);mutNum.subtract((short) 1);
        
        __CLR4_1_2swpswpl3lqxuth.R.inc(37552);assertEquals((short) 0, mutNum.shortValue());
    }finally{__CLR4_1_2swpswpl3lqxuth.R.flushNeeded();}}

    @Test
    public void testSubtractValueObject() {__CLR4_1_2swpswpl3lqxuth.R.globalSliceStart(getClass().getName(),37553);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2xnns6psz5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2swpswpl3lqxuth.R.rethrow($CLV_t2$);}finally{__CLR4_1_2swpswpl3lqxuth.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableShortTest.testSubtractValueObject",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37553,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2xnns6psz5(){try{__CLR4_1_2swpswpl3lqxuth.R.inc(37553);
        __CLR4_1_2swpswpl3lqxuth.R.inc(37554);final MutableShort mutNum = new MutableShort((short) 1);
        __CLR4_1_2swpswpl3lqxuth.R.inc(37555);mutNum.subtract(Short.valueOf((short) 1));
        
        __CLR4_1_2swpswpl3lqxuth.R.inc(37556);assertEquals((short) 0, mutNum.shortValue());
    }finally{__CLR4_1_2swpswpl3lqxuth.R.flushNeeded();}}

    @Test
    public void testToString() {__CLR4_1_2swpswpl3lqxuth.R.globalSliceStart(getClass().getName(),37557);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2hrxdidsz9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2swpswpl3lqxuth.R.rethrow($CLV_t2$);}finally{__CLR4_1_2swpswpl3lqxuth.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableShortTest.testToString",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37557,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2hrxdidsz9(){try{__CLR4_1_2swpswpl3lqxuth.R.inc(37557);
        __CLR4_1_2swpswpl3lqxuth.R.inc(37558);assertEquals("0", new MutableShort((short) 0).toString());
        __CLR4_1_2swpswpl3lqxuth.R.inc(37559);assertEquals("10", new MutableShort((short) 10).toString());
        __CLR4_1_2swpswpl3lqxuth.R.inc(37560);assertEquals("-123", new MutableShort((short) -123).toString());
    }finally{__CLR4_1_2swpswpl3lqxuth.R.flushNeeded();}}

}
