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
 * @see MutableLong
 */
public class MutableLongTest {static class __CLR4_1_2sspsspl3lqxusz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492830024L,8589935092L,37420,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    // ----------------------------------------------------------------
    @Test
    public void testConstructors() {__CLR4_1_2sspsspl3lqxusz.R.globalSliceStart(getClass().getName(),37321);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2lwxahessp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2sspsspl3lqxusz.R.rethrow($CLV_t2$);}finally{__CLR4_1_2sspsspl3lqxusz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableLongTest.testConstructors",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37321,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2lwxahessp(){try{__CLR4_1_2sspsspl3lqxusz.R.inc(37321);
        __CLR4_1_2sspsspl3lqxusz.R.inc(37322);assertEquals(0, new MutableLong().longValue());
        
        __CLR4_1_2sspsspl3lqxusz.R.inc(37323);assertEquals(1, new MutableLong(1).longValue());
        
        __CLR4_1_2sspsspl3lqxusz.R.inc(37324);assertEquals(2, new MutableLong(Long.valueOf(2)).longValue());
        __CLR4_1_2sspsspl3lqxusz.R.inc(37325);assertEquals(3, new MutableLong(new MutableLong(3)).longValue());

        __CLR4_1_2sspsspl3lqxusz.R.inc(37326);assertEquals(2, new MutableLong("2").longValue());

    }finally{__CLR4_1_2sspsspl3lqxusz.R.flushNeeded();}}

    @Test(expected=NullPointerException.class)
    public void testConstructorNull() {__CLR4_1_2sspsspl3lqxusz.R.globalSliceStart(getClass().getName(),37327);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2hqkc8assv();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,111,110,115,116,114,117,99,116,111,114,78,117,108,108,58,32,91,78,117,108,108,80,111,105,110,116,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullPointerException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2sspsspl3lqxusz.R.rethrow($CLV_t2$);}finally{__CLR4_1_2sspsspl3lqxusz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableLongTest.testConstructorNull",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37327,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2hqkc8assv(){try{__CLR4_1_2sspsspl3lqxusz.R.inc(37327);
        __CLR4_1_2sspsspl3lqxusz.R.inc(37328);new MutableLong((Number)null);
    }finally{__CLR4_1_2sspsspl3lqxusz.R.flushNeeded();}}

    @Test
    public void testGetSet() {__CLR4_1_2sspsspl3lqxusz.R.globalSliceStart(getClass().getName(),37329);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_22wnvh7ssx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2sspsspl3lqxusz.R.rethrow($CLV_t2$);}finally{__CLR4_1_2sspsspl3lqxusz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableLongTest.testGetSet",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37329,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_22wnvh7ssx(){try{__CLR4_1_2sspsspl3lqxusz.R.inc(37329);
        __CLR4_1_2sspsspl3lqxusz.R.inc(37330);final MutableLong mutNum = new MutableLong(0);
        __CLR4_1_2sspsspl3lqxusz.R.inc(37331);assertEquals(0, new MutableLong().longValue());
        __CLR4_1_2sspsspl3lqxusz.R.inc(37332);assertEquals(Long.valueOf(0), new MutableLong().getValue());
        
        __CLR4_1_2sspsspl3lqxusz.R.inc(37333);mutNum.setValue(1);
        __CLR4_1_2sspsspl3lqxusz.R.inc(37334);assertEquals(1, mutNum.longValue());
        __CLR4_1_2sspsspl3lqxusz.R.inc(37335);assertEquals(Long.valueOf(1), mutNum.getValue());
        
        __CLR4_1_2sspsspl3lqxusz.R.inc(37336);mutNum.setValue(Long.valueOf(2));
        __CLR4_1_2sspsspl3lqxusz.R.inc(37337);assertEquals(2, mutNum.longValue());
        __CLR4_1_2sspsspl3lqxusz.R.inc(37338);assertEquals(Long.valueOf(2), mutNum.getValue());
        
        __CLR4_1_2sspsspl3lqxusz.R.inc(37339);mutNum.setValue(new MutableLong(3));
        __CLR4_1_2sspsspl3lqxusz.R.inc(37340);assertEquals(3, mutNum.longValue());
        __CLR4_1_2sspsspl3lqxusz.R.inc(37341);assertEquals(Long.valueOf(3), mutNum.getValue());
    }finally{__CLR4_1_2sspsspl3lqxusz.R.flushNeeded();}}

    @Test(expected=NullPointerException.class)
    public void testSetNull() {__CLR4_1_2sspsspl3lqxusz.R.globalSliceStart(getClass().getName(),37342);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2hciyrista();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,83,101,116,78,117,108,108,58,32,91,78,117,108,108,80,111,105,110,116,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullPointerException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2sspsspl3lqxusz.R.rethrow($CLV_t2$);}finally{__CLR4_1_2sspsspl3lqxusz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableLongTest.testSetNull",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37342,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2hciyrista(){try{__CLR4_1_2sspsspl3lqxusz.R.inc(37342);
        __CLR4_1_2sspsspl3lqxusz.R.inc(37343);final MutableLong mutNum = new MutableLong(0);
        __CLR4_1_2sspsspl3lqxusz.R.inc(37344);mutNum.setValue(null);
    }finally{__CLR4_1_2sspsspl3lqxusz.R.flushNeeded();}}

    @Test
    public void testEquals() {__CLR4_1_2sspsspl3lqxusz.R.globalSliceStart(getClass().getName(),37345);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2s4e608std();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2sspsspl3lqxusz.R.rethrow($CLV_t2$);}finally{__CLR4_1_2sspsspl3lqxusz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableLongTest.testEquals",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37345,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2s4e608std(){try{__CLR4_1_2sspsspl3lqxusz.R.inc(37345);
        __CLR4_1_2sspsspl3lqxusz.R.inc(37346);final MutableLong mutNumA = new MutableLong(0);
        __CLR4_1_2sspsspl3lqxusz.R.inc(37347);final MutableLong mutNumB = new MutableLong(0);
        __CLR4_1_2sspsspl3lqxusz.R.inc(37348);final MutableLong mutNumC = new MutableLong(1);

        __CLR4_1_2sspsspl3lqxusz.R.inc(37349);assertTrue(mutNumA.equals(mutNumA));
        __CLR4_1_2sspsspl3lqxusz.R.inc(37350);assertTrue(mutNumA.equals(mutNumB));
        __CLR4_1_2sspsspl3lqxusz.R.inc(37351);assertTrue(mutNumB.equals(mutNumA));
        __CLR4_1_2sspsspl3lqxusz.R.inc(37352);assertTrue(mutNumB.equals(mutNumB));
        __CLR4_1_2sspsspl3lqxusz.R.inc(37353);assertFalse(mutNumA.equals(mutNumC));
        __CLR4_1_2sspsspl3lqxusz.R.inc(37354);assertFalse(mutNumB.equals(mutNumC));
        __CLR4_1_2sspsspl3lqxusz.R.inc(37355);assertTrue(mutNumC.equals(mutNumC));
        __CLR4_1_2sspsspl3lqxusz.R.inc(37356);assertFalse(mutNumA.equals(null));
        __CLR4_1_2sspsspl3lqxusz.R.inc(37357);assertFalse(mutNumA.equals(Long.valueOf(0)));
        __CLR4_1_2sspsspl3lqxusz.R.inc(37358);assertFalse(mutNumA.equals("0"));
    }finally{__CLR4_1_2sspsspl3lqxusz.R.flushNeeded();}}

    @Test
    public void testHashCode() {__CLR4_1_2sspsspl3lqxusz.R.globalSliceStart(getClass().getName(),37359);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_23zkhv8str();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2sspsspl3lqxusz.R.rethrow($CLV_t2$);}finally{__CLR4_1_2sspsspl3lqxusz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableLongTest.testHashCode",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37359,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_23zkhv8str(){try{__CLR4_1_2sspsspl3lqxusz.R.inc(37359);
        __CLR4_1_2sspsspl3lqxusz.R.inc(37360);final MutableLong mutNumA = new MutableLong(0);
        __CLR4_1_2sspsspl3lqxusz.R.inc(37361);final MutableLong mutNumB = new MutableLong(0);
        __CLR4_1_2sspsspl3lqxusz.R.inc(37362);final MutableLong mutNumC = new MutableLong(1);

        __CLR4_1_2sspsspl3lqxusz.R.inc(37363);assertTrue(mutNumA.hashCode() == mutNumA.hashCode());
        __CLR4_1_2sspsspl3lqxusz.R.inc(37364);assertTrue(mutNumA.hashCode() == mutNumB.hashCode());
        __CLR4_1_2sspsspl3lqxusz.R.inc(37365);assertFalse(mutNumA.hashCode() == mutNumC.hashCode());
        __CLR4_1_2sspsspl3lqxusz.R.inc(37366);assertTrue(mutNumA.hashCode() == Long.valueOf(0).hashCode());
    }finally{__CLR4_1_2sspsspl3lqxusz.R.flushNeeded();}}

    @Test
    public void testCompareTo() {__CLR4_1_2sspsspl3lqxusz.R.globalSliceStart(getClass().getName(),37367);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2pz6vfvstz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2sspsspl3lqxusz.R.rethrow($CLV_t2$);}finally{__CLR4_1_2sspsspl3lqxusz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableLongTest.testCompareTo",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37367,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2pz6vfvstz(){try{__CLR4_1_2sspsspl3lqxusz.R.inc(37367);
        __CLR4_1_2sspsspl3lqxusz.R.inc(37368);final MutableLong mutNum = new MutableLong(0);

        __CLR4_1_2sspsspl3lqxusz.R.inc(37369);assertEquals(0, mutNum.compareTo(new MutableLong(0)));
        __CLR4_1_2sspsspl3lqxusz.R.inc(37370);assertEquals(+1, mutNum.compareTo(new MutableLong(-1)));
        __CLR4_1_2sspsspl3lqxusz.R.inc(37371);assertEquals(-1, mutNum.compareTo(new MutableLong(1)));
    }finally{__CLR4_1_2sspsspl3lqxusz.R.flushNeeded();}}

    @Test(expected=NullPointerException.class)
    public void testCompareToNull() {__CLR4_1_2sspsspl3lqxusz.R.globalSliceStart(getClass().getName(),37372);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2g1nl0csu4();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,111,109,112,97,114,101,84,111,78,117,108,108,58,32,91,78,117,108,108,80,111,105,110,116,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullPointerException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2sspsspl3lqxusz.R.rethrow($CLV_t2$);}finally{__CLR4_1_2sspsspl3lqxusz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableLongTest.testCompareToNull",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37372,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2g1nl0csu4(){try{__CLR4_1_2sspsspl3lqxusz.R.inc(37372);
        __CLR4_1_2sspsspl3lqxusz.R.inc(37373);final MutableLong mutNum = new MutableLong(0);
        __CLR4_1_2sspsspl3lqxusz.R.inc(37374);mutNum.compareTo(null);
    }finally{__CLR4_1_2sspsspl3lqxusz.R.flushNeeded();}}

    @Test
    public void testPrimitiveValues() {__CLR4_1_2sspsspl3lqxusz.R.globalSliceStart(getClass().getName(),37375);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2uifrysu7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2sspsspl3lqxusz.R.rethrow($CLV_t2$);}finally{__CLR4_1_2sspsspl3lqxusz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableLongTest.testPrimitiveValues",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37375,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2uifrysu7(){try{__CLR4_1_2sspsspl3lqxusz.R.inc(37375);
        __CLR4_1_2sspsspl3lqxusz.R.inc(37376);final MutableLong mutNum = new MutableLong(1L);

        __CLR4_1_2sspsspl3lqxusz.R.inc(37377);assertEquals( 1.0F, mutNum.floatValue(), 0 );
        __CLR4_1_2sspsspl3lqxusz.R.inc(37378);assertEquals( 1.0, mutNum.doubleValue(), 0 );
        __CLR4_1_2sspsspl3lqxusz.R.inc(37379);assertEquals( (byte) 1, mutNum.byteValue() );
        __CLR4_1_2sspsspl3lqxusz.R.inc(37380);assertEquals( (short) 1, mutNum.shortValue() );
        __CLR4_1_2sspsspl3lqxusz.R.inc(37381);assertEquals( 1, mutNum.intValue() );
        __CLR4_1_2sspsspl3lqxusz.R.inc(37382);assertEquals( 1L, mutNum.longValue() );
    }finally{__CLR4_1_2sspsspl3lqxusz.R.flushNeeded();}}

    @Test
    public void testToLong() {__CLR4_1_2sspsspl3lqxusz.R.globalSliceStart(getClass().getName(),37383);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2c1zoc0suf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2sspsspl3lqxusz.R.rethrow($CLV_t2$);}finally{__CLR4_1_2sspsspl3lqxusz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableLongTest.testToLong",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37383,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2c1zoc0suf(){try{__CLR4_1_2sspsspl3lqxusz.R.inc(37383);
        __CLR4_1_2sspsspl3lqxusz.R.inc(37384);assertEquals(Long.valueOf(0L), new MutableLong(0L).toLong());
        __CLR4_1_2sspsspl3lqxusz.R.inc(37385);assertEquals(Long.valueOf(123L), new MutableLong(123L).toLong());
    }finally{__CLR4_1_2sspsspl3lqxusz.R.flushNeeded();}}

    @Test
    public void testIncrement() {__CLR4_1_2sspsspl3lqxusz.R.globalSliceStart(getClass().getName(),37386);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2m6qqn0sui();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2sspsspl3lqxusz.R.rethrow($CLV_t2$);}finally{__CLR4_1_2sspsspl3lqxusz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableLongTest.testIncrement",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37386,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2m6qqn0sui(){try{__CLR4_1_2sspsspl3lqxusz.R.inc(37386);
        __CLR4_1_2sspsspl3lqxusz.R.inc(37387);final MutableLong mutNum = new MutableLong(1);
        __CLR4_1_2sspsspl3lqxusz.R.inc(37388);mutNum.increment();
        
        __CLR4_1_2sspsspl3lqxusz.R.inc(37389);assertEquals(2, mutNum.intValue());
        __CLR4_1_2sspsspl3lqxusz.R.inc(37390);assertEquals(2L, mutNum.longValue());
    }finally{__CLR4_1_2sspsspl3lqxusz.R.flushNeeded();}}

    @Test
    public void testDecrement() {__CLR4_1_2sspsspl3lqxusz.R.globalSliceStart(getClass().getName(),37391);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2pripmwsun();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2sspsspl3lqxusz.R.rethrow($CLV_t2$);}finally{__CLR4_1_2sspsspl3lqxusz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableLongTest.testDecrement",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37391,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2pripmwsun(){try{__CLR4_1_2sspsspl3lqxusz.R.inc(37391);
        __CLR4_1_2sspsspl3lqxusz.R.inc(37392);final MutableLong mutNum = new MutableLong(1);
        __CLR4_1_2sspsspl3lqxusz.R.inc(37393);mutNum.decrement();
        
        __CLR4_1_2sspsspl3lqxusz.R.inc(37394);assertEquals(0, mutNum.intValue());
        __CLR4_1_2sspsspl3lqxusz.R.inc(37395);assertEquals(0L, mutNum.longValue());
    }finally{__CLR4_1_2sspsspl3lqxusz.R.flushNeeded();}}

    @Test
    public void testAddValuePrimitive() {__CLR4_1_2sspsspl3lqxusz.R.globalSliceStart(getClass().getName(),37396);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2nrme6ssus();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2sspsspl3lqxusz.R.rethrow($CLV_t2$);}finally{__CLR4_1_2sspsspl3lqxusz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableLongTest.testAddValuePrimitive",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37396,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2nrme6ssus(){try{__CLR4_1_2sspsspl3lqxusz.R.inc(37396);
        __CLR4_1_2sspsspl3lqxusz.R.inc(37397);final MutableLong mutNum = new MutableLong(1);
        __CLR4_1_2sspsspl3lqxusz.R.inc(37398);mutNum.add(1);
        
        __CLR4_1_2sspsspl3lqxusz.R.inc(37399);assertEquals(2, mutNum.intValue());
        __CLR4_1_2sspsspl3lqxusz.R.inc(37400);assertEquals(2L, mutNum.longValue());
    }finally{__CLR4_1_2sspsspl3lqxusz.R.flushNeeded();}}

    @Test
    public void testAddValueObject() {__CLR4_1_2sspsspl3lqxusz.R.globalSliceStart(getClass().getName(),37401);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2cu6v3ssux();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2sspsspl3lqxusz.R.rethrow($CLV_t2$);}finally{__CLR4_1_2sspsspl3lqxusz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableLongTest.testAddValueObject",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37401,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2cu6v3ssux(){try{__CLR4_1_2sspsspl3lqxusz.R.inc(37401);
        __CLR4_1_2sspsspl3lqxusz.R.inc(37402);final MutableLong mutNum = new MutableLong(1);
        __CLR4_1_2sspsspl3lqxusz.R.inc(37403);mutNum.add(Long.valueOf(1));
        
        __CLR4_1_2sspsspl3lqxusz.R.inc(37404);assertEquals(2, mutNum.intValue());
        __CLR4_1_2sspsspl3lqxusz.R.inc(37405);assertEquals(2L, mutNum.longValue());
    }finally{__CLR4_1_2sspsspl3lqxusz.R.flushNeeded();}}

    @Test
    public void testSubtractValuePrimitive() {__CLR4_1_2sspsspl3lqxusz.R.globalSliceStart(getClass().getName(),37406);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2w07icjsv2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2sspsspl3lqxusz.R.rethrow($CLV_t2$);}finally{__CLR4_1_2sspsspl3lqxusz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableLongTest.testSubtractValuePrimitive",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37406,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2w07icjsv2(){try{__CLR4_1_2sspsspl3lqxusz.R.inc(37406);
        __CLR4_1_2sspsspl3lqxusz.R.inc(37407);final MutableLong mutNum = new MutableLong(1);
        __CLR4_1_2sspsspl3lqxusz.R.inc(37408);mutNum.subtract(1);
        
        __CLR4_1_2sspsspl3lqxusz.R.inc(37409);assertEquals(0, mutNum.intValue());
        __CLR4_1_2sspsspl3lqxusz.R.inc(37410);assertEquals(0L, mutNum.longValue());
    }finally{__CLR4_1_2sspsspl3lqxusz.R.flushNeeded();}}

    @Test
    public void testSubtractValueObject() {__CLR4_1_2sspsspl3lqxusz.R.globalSliceStart(getClass().getName(),37411);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2xnns6psv7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2sspsspl3lqxusz.R.rethrow($CLV_t2$);}finally{__CLR4_1_2sspsspl3lqxusz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableLongTest.testSubtractValueObject",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37411,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2xnns6psv7(){try{__CLR4_1_2sspsspl3lqxusz.R.inc(37411);
        __CLR4_1_2sspsspl3lqxusz.R.inc(37412);final MutableLong mutNum = new MutableLong(1);
        __CLR4_1_2sspsspl3lqxusz.R.inc(37413);mutNum.subtract(Long.valueOf(1));
        
        __CLR4_1_2sspsspl3lqxusz.R.inc(37414);assertEquals(0, mutNum.intValue());
        __CLR4_1_2sspsspl3lqxusz.R.inc(37415);assertEquals(0L, mutNum.longValue());
    }finally{__CLR4_1_2sspsspl3lqxusz.R.flushNeeded();}}

    @Test
    public void testToString() {__CLR4_1_2sspsspl3lqxusz.R.globalSliceStart(getClass().getName(),37416);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2hrxdidsvc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2sspsspl3lqxusz.R.rethrow($CLV_t2$);}finally{__CLR4_1_2sspsspl3lqxusz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableLongTest.testToString",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37416,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2hrxdidsvc(){try{__CLR4_1_2sspsspl3lqxusz.R.inc(37416);
        __CLR4_1_2sspsspl3lqxusz.R.inc(37417);assertEquals("0", new MutableLong(0).toString());
        __CLR4_1_2sspsspl3lqxusz.R.inc(37418);assertEquals("10", new MutableLong(10).toString());
        __CLR4_1_2sspsspl3lqxusz.R.inc(37419);assertEquals("-123", new MutableLong(-123).toString());
    }finally{__CLR4_1_2sspsspl3lqxusz.R.flushNeeded();}}

}
