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
 * @see MutableInt
 */
public class MutableIntTest {static class __CLR4_1_2sq0sq0l3lqxusq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492830024L,8589935092L,37321,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    // ----------------------------------------------------------------
    @Test
    public void testConstructors() {__CLR4_1_2sq0sq0l3lqxusq.R.globalSliceStart(getClass().getName(),37224);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2lwxahesq0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2sq0sq0l3lqxusq.R.rethrow($CLV_t2$);}finally{__CLR4_1_2sq0sq0l3lqxusq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableIntTest.testConstructors",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37224,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2lwxahesq0(){try{__CLR4_1_2sq0sq0l3lqxusq.R.inc(37224);
        __CLR4_1_2sq0sq0l3lqxusq.R.inc(37225);assertEquals(0, new MutableInt().intValue());
        
        __CLR4_1_2sq0sq0l3lqxusq.R.inc(37226);assertEquals(1, new MutableInt(1).intValue());
        
        __CLR4_1_2sq0sq0l3lqxusq.R.inc(37227);assertEquals(2, new MutableInt(Integer.valueOf(2)).intValue());
        __CLR4_1_2sq0sq0l3lqxusq.R.inc(37228);assertEquals(3, new MutableInt(new MutableLong(3)).intValue());

        __CLR4_1_2sq0sq0l3lqxusq.R.inc(37229);assertEquals(2, new MutableInt("2").intValue());

    }finally{__CLR4_1_2sq0sq0l3lqxusq.R.flushNeeded();}}

    @Test(expected=NullPointerException.class)
    public void testConstructorNull() {__CLR4_1_2sq0sq0l3lqxusq.R.globalSliceStart(getClass().getName(),37230);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2hqkc8asq6();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,111,110,115,116,114,117,99,116,111,114,78,117,108,108,58,32,91,78,117,108,108,80,111,105,110,116,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullPointerException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2sq0sq0l3lqxusq.R.rethrow($CLV_t2$);}finally{__CLR4_1_2sq0sq0l3lqxusq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableIntTest.testConstructorNull",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37230,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2hqkc8asq6(){try{__CLR4_1_2sq0sq0l3lqxusq.R.inc(37230);
        __CLR4_1_2sq0sq0l3lqxusq.R.inc(37231);new MutableInt((Number)null);
    }finally{__CLR4_1_2sq0sq0l3lqxusq.R.flushNeeded();}}

    @Test
    public void testGetSet() {__CLR4_1_2sq0sq0l3lqxusq.R.globalSliceStart(getClass().getName(),37232);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_22wnvh7sq8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2sq0sq0l3lqxusq.R.rethrow($CLV_t2$);}finally{__CLR4_1_2sq0sq0l3lqxusq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableIntTest.testGetSet",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37232,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_22wnvh7sq8(){try{__CLR4_1_2sq0sq0l3lqxusq.R.inc(37232);
        __CLR4_1_2sq0sq0l3lqxusq.R.inc(37233);final MutableInt mutNum = new MutableInt(0);
        __CLR4_1_2sq0sq0l3lqxusq.R.inc(37234);assertEquals(0, new MutableInt().intValue());
        __CLR4_1_2sq0sq0l3lqxusq.R.inc(37235);assertEquals(Integer.valueOf(0), new MutableInt().getValue());
        
        __CLR4_1_2sq0sq0l3lqxusq.R.inc(37236);mutNum.setValue(1);
        __CLR4_1_2sq0sq0l3lqxusq.R.inc(37237);assertEquals(1, mutNum.intValue());
        __CLR4_1_2sq0sq0l3lqxusq.R.inc(37238);assertEquals(Integer.valueOf(1), mutNum.getValue());
        
        __CLR4_1_2sq0sq0l3lqxusq.R.inc(37239);mutNum.setValue(Integer.valueOf(2));
        __CLR4_1_2sq0sq0l3lqxusq.R.inc(37240);assertEquals(2, mutNum.intValue());
        __CLR4_1_2sq0sq0l3lqxusq.R.inc(37241);assertEquals(Integer.valueOf(2), mutNum.getValue());
        
        __CLR4_1_2sq0sq0l3lqxusq.R.inc(37242);mutNum.setValue(new MutableLong(3));
        __CLR4_1_2sq0sq0l3lqxusq.R.inc(37243);assertEquals(3, mutNum.intValue());
        __CLR4_1_2sq0sq0l3lqxusq.R.inc(37244);assertEquals(Integer.valueOf(3), mutNum.getValue());
    }finally{__CLR4_1_2sq0sq0l3lqxusq.R.flushNeeded();}}

    @Test(expected=NullPointerException.class)
    public void testSetNull() {__CLR4_1_2sq0sq0l3lqxusq.R.globalSliceStart(getClass().getName(),37245);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2hciyrisql();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,83,101,116,78,117,108,108,58,32,91,78,117,108,108,80,111,105,110,116,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullPointerException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2sq0sq0l3lqxusq.R.rethrow($CLV_t2$);}finally{__CLR4_1_2sq0sq0l3lqxusq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableIntTest.testSetNull",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37245,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2hciyrisql(){try{__CLR4_1_2sq0sq0l3lqxusq.R.inc(37245);
        __CLR4_1_2sq0sq0l3lqxusq.R.inc(37246);final MutableInt mutNum = new MutableInt(0);
        __CLR4_1_2sq0sq0l3lqxusq.R.inc(37247);mutNum.setValue(null);
    }finally{__CLR4_1_2sq0sq0l3lqxusq.R.flushNeeded();}}

    @Test
    public void testEquals() {__CLR4_1_2sq0sq0l3lqxusq.R.globalSliceStart(getClass().getName(),37248);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2s4e608sqo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2sq0sq0l3lqxusq.R.rethrow($CLV_t2$);}finally{__CLR4_1_2sq0sq0l3lqxusq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableIntTest.testEquals",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37248,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2s4e608sqo(){try{__CLR4_1_2sq0sq0l3lqxusq.R.inc(37248);
        __CLR4_1_2sq0sq0l3lqxusq.R.inc(37249);this.testEquals(new MutableInt(0), new MutableInt(0), new MutableInt(1));
        // Should Numbers be supported? GaryG July-21-2005.
        //this.testEquals(mutNumA, Integer.valueOf(0), mutNumC);
    }finally{__CLR4_1_2sq0sq0l3lqxusq.R.flushNeeded();}}

    /**
     * @param numA must not be a 0 Integer; must not equal numC.
     * @param numB must equal numA; must not equal numC.
     * @param numC must not equal numA; must not equal numC.
     */
    void testEquals(final Number numA, final Number numB, final Number numC) {try{__CLR4_1_2sq0sq0l3lqxusq.R.inc(37250);
        __CLR4_1_2sq0sq0l3lqxusq.R.inc(37251);assertTrue(numA.equals(numA));
        __CLR4_1_2sq0sq0l3lqxusq.R.inc(37252);assertTrue(numA.equals(numB));
        __CLR4_1_2sq0sq0l3lqxusq.R.inc(37253);assertTrue(numB.equals(numA));
        __CLR4_1_2sq0sq0l3lqxusq.R.inc(37254);assertTrue(numB.equals(numB));
        __CLR4_1_2sq0sq0l3lqxusq.R.inc(37255);assertFalse(numA.equals(numC));
        __CLR4_1_2sq0sq0l3lqxusq.R.inc(37256);assertFalse(numB.equals(numC));
        __CLR4_1_2sq0sq0l3lqxusq.R.inc(37257);assertTrue(numC.equals(numC));
        __CLR4_1_2sq0sq0l3lqxusq.R.inc(37258);assertFalse(numA.equals(null));
        __CLR4_1_2sq0sq0l3lqxusq.R.inc(37259);assertFalse(numA.equals(Integer.valueOf(0)));
        __CLR4_1_2sq0sq0l3lqxusq.R.inc(37260);assertFalse(numA.equals("0"));
    }finally{__CLR4_1_2sq0sq0l3lqxusq.R.flushNeeded();}}

    @Test
    public void testHashCode() {__CLR4_1_2sq0sq0l3lqxusq.R.globalSliceStart(getClass().getName(),37261);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_23zkhv8sr1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2sq0sq0l3lqxusq.R.rethrow($CLV_t2$);}finally{__CLR4_1_2sq0sq0l3lqxusq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableIntTest.testHashCode",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37261,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_23zkhv8sr1(){try{__CLR4_1_2sq0sq0l3lqxusq.R.inc(37261);
        __CLR4_1_2sq0sq0l3lqxusq.R.inc(37262);final MutableInt mutNumA = new MutableInt(0);
        __CLR4_1_2sq0sq0l3lqxusq.R.inc(37263);final MutableInt mutNumB = new MutableInt(0);
        __CLR4_1_2sq0sq0l3lqxusq.R.inc(37264);final MutableInt mutNumC = new MutableInt(1);

        __CLR4_1_2sq0sq0l3lqxusq.R.inc(37265);assertTrue(mutNumA.hashCode() == mutNumA.hashCode());
        __CLR4_1_2sq0sq0l3lqxusq.R.inc(37266);assertTrue(mutNumA.hashCode() == mutNumB.hashCode());
        __CLR4_1_2sq0sq0l3lqxusq.R.inc(37267);assertFalse(mutNumA.hashCode() == mutNumC.hashCode());
        __CLR4_1_2sq0sq0l3lqxusq.R.inc(37268);assertTrue(mutNumA.hashCode() == Integer.valueOf(0).hashCode());
    }finally{__CLR4_1_2sq0sq0l3lqxusq.R.flushNeeded();}}

    @Test
    public void testCompareTo() {__CLR4_1_2sq0sq0l3lqxusq.R.globalSliceStart(getClass().getName(),37269);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2pz6vfvsr9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2sq0sq0l3lqxusq.R.rethrow($CLV_t2$);}finally{__CLR4_1_2sq0sq0l3lqxusq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableIntTest.testCompareTo",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37269,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2pz6vfvsr9(){try{__CLR4_1_2sq0sq0l3lqxusq.R.inc(37269);
        __CLR4_1_2sq0sq0l3lqxusq.R.inc(37270);final MutableInt mutNum = new MutableInt(0);

        __CLR4_1_2sq0sq0l3lqxusq.R.inc(37271);assertEquals(0, mutNum.compareTo(new MutableInt(0)));
        __CLR4_1_2sq0sq0l3lqxusq.R.inc(37272);assertEquals(+1, mutNum.compareTo(new MutableInt(-1)));
        __CLR4_1_2sq0sq0l3lqxusq.R.inc(37273);assertEquals(-1, mutNum.compareTo(new MutableInt(1)));
    }finally{__CLR4_1_2sq0sq0l3lqxusq.R.flushNeeded();}}

    @Test(expected=NullPointerException.class)
    public void testCompareToNull() {__CLR4_1_2sq0sq0l3lqxusq.R.globalSliceStart(getClass().getName(),37274);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2g1nl0csre();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,111,109,112,97,114,101,84,111,78,117,108,108,58,32,91,78,117,108,108,80,111,105,110,116,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullPointerException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2sq0sq0l3lqxusq.R.rethrow($CLV_t2$);}finally{__CLR4_1_2sq0sq0l3lqxusq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableIntTest.testCompareToNull",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37274,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2g1nl0csre(){try{__CLR4_1_2sq0sq0l3lqxusq.R.inc(37274);
        __CLR4_1_2sq0sq0l3lqxusq.R.inc(37275);final MutableInt mutNum = new MutableInt(0);
        __CLR4_1_2sq0sq0l3lqxusq.R.inc(37276);mutNum.compareTo(null);
    }finally{__CLR4_1_2sq0sq0l3lqxusq.R.flushNeeded();}}

    @Test
    public void testPrimitiveValues() {__CLR4_1_2sq0sq0l3lqxusq.R.globalSliceStart(getClass().getName(),37277);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2uifrysrh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2sq0sq0l3lqxusq.R.rethrow($CLV_t2$);}finally{__CLR4_1_2sq0sq0l3lqxusq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableIntTest.testPrimitiveValues",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37277,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2uifrysrh(){try{__CLR4_1_2sq0sq0l3lqxusq.R.inc(37277);
        __CLR4_1_2sq0sq0l3lqxusq.R.inc(37278);final MutableInt mutNum = new MutableInt(1);
        
        __CLR4_1_2sq0sq0l3lqxusq.R.inc(37279);assertEquals( (byte) 1, mutNum.byteValue() );
        __CLR4_1_2sq0sq0l3lqxusq.R.inc(37280);assertEquals( (short) 1, mutNum.shortValue() );
        __CLR4_1_2sq0sq0l3lqxusq.R.inc(37281);assertEquals( 1.0F, mutNum.floatValue(), 0 );
        __CLR4_1_2sq0sq0l3lqxusq.R.inc(37282);assertEquals( 1.0, mutNum.doubleValue(), 0 );
        __CLR4_1_2sq0sq0l3lqxusq.R.inc(37283);assertEquals( 1L, mutNum.longValue() );
    }finally{__CLR4_1_2sq0sq0l3lqxusq.R.flushNeeded();}}

    @Test
    public void testToInteger() {__CLR4_1_2sq0sq0l3lqxusq.R.globalSliceStart(getClass().getName(),37284);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2wjyivcsro();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2sq0sq0l3lqxusq.R.rethrow($CLV_t2$);}finally{__CLR4_1_2sq0sq0l3lqxusq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableIntTest.testToInteger",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37284,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2wjyivcsro(){try{__CLR4_1_2sq0sq0l3lqxusq.R.inc(37284);
        __CLR4_1_2sq0sq0l3lqxusq.R.inc(37285);assertEquals(Integer.valueOf(0), new MutableInt(0).toInteger());
        __CLR4_1_2sq0sq0l3lqxusq.R.inc(37286);assertEquals(Integer.valueOf(123), new MutableInt(123).toInteger());
    }finally{__CLR4_1_2sq0sq0l3lqxusq.R.flushNeeded();}}

    @Test
    public void testIncrement() {__CLR4_1_2sq0sq0l3lqxusq.R.globalSliceStart(getClass().getName(),37287);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2m6qqn0srr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2sq0sq0l3lqxusq.R.rethrow($CLV_t2$);}finally{__CLR4_1_2sq0sq0l3lqxusq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableIntTest.testIncrement",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37287,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2m6qqn0srr(){try{__CLR4_1_2sq0sq0l3lqxusq.R.inc(37287);
        __CLR4_1_2sq0sq0l3lqxusq.R.inc(37288);final MutableInt mutNum = new MutableInt(1);
        __CLR4_1_2sq0sq0l3lqxusq.R.inc(37289);mutNum.increment();
        
        __CLR4_1_2sq0sq0l3lqxusq.R.inc(37290);assertEquals(2, mutNum.intValue());
        __CLR4_1_2sq0sq0l3lqxusq.R.inc(37291);assertEquals(2L, mutNum.longValue());
    }finally{__CLR4_1_2sq0sq0l3lqxusq.R.flushNeeded();}}

    @Test
    public void testDecrement() {__CLR4_1_2sq0sq0l3lqxusq.R.globalSliceStart(getClass().getName(),37292);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2pripmwsrw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2sq0sq0l3lqxusq.R.rethrow($CLV_t2$);}finally{__CLR4_1_2sq0sq0l3lqxusq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableIntTest.testDecrement",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37292,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2pripmwsrw(){try{__CLR4_1_2sq0sq0l3lqxusq.R.inc(37292);
        __CLR4_1_2sq0sq0l3lqxusq.R.inc(37293);final MutableInt mutNum = new MutableInt(1);
        __CLR4_1_2sq0sq0l3lqxusq.R.inc(37294);mutNum.decrement();
        
        __CLR4_1_2sq0sq0l3lqxusq.R.inc(37295);assertEquals(0, mutNum.intValue());
        __CLR4_1_2sq0sq0l3lqxusq.R.inc(37296);assertEquals(0L, mutNum.longValue());
    }finally{__CLR4_1_2sq0sq0l3lqxusq.R.flushNeeded();}}

    @Test
    public void testAddValuePrimitive() {__CLR4_1_2sq0sq0l3lqxusq.R.globalSliceStart(getClass().getName(),37297);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2nrme6sss1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2sq0sq0l3lqxusq.R.rethrow($CLV_t2$);}finally{__CLR4_1_2sq0sq0l3lqxusq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableIntTest.testAddValuePrimitive",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37297,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2nrme6sss1(){try{__CLR4_1_2sq0sq0l3lqxusq.R.inc(37297);
        __CLR4_1_2sq0sq0l3lqxusq.R.inc(37298);final MutableInt mutNum = new MutableInt(1);
        __CLR4_1_2sq0sq0l3lqxusq.R.inc(37299);mutNum.add(1);
        
        __CLR4_1_2sq0sq0l3lqxusq.R.inc(37300);assertEquals(2, mutNum.intValue());
        __CLR4_1_2sq0sq0l3lqxusq.R.inc(37301);assertEquals(2L, mutNum.longValue());
    }finally{__CLR4_1_2sq0sq0l3lqxusq.R.flushNeeded();}}

    @Test
    public void testAddValueObject() {__CLR4_1_2sq0sq0l3lqxusq.R.globalSliceStart(getClass().getName(),37302);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2cu6v3sss6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2sq0sq0l3lqxusq.R.rethrow($CLV_t2$);}finally{__CLR4_1_2sq0sq0l3lqxusq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableIntTest.testAddValueObject",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37302,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2cu6v3sss6(){try{__CLR4_1_2sq0sq0l3lqxusq.R.inc(37302);
        __CLR4_1_2sq0sq0l3lqxusq.R.inc(37303);final MutableInt mutNum = new MutableInt(1);
        __CLR4_1_2sq0sq0l3lqxusq.R.inc(37304);mutNum.add(Integer.valueOf(1));
        
        __CLR4_1_2sq0sq0l3lqxusq.R.inc(37305);assertEquals(2, mutNum.intValue());
        __CLR4_1_2sq0sq0l3lqxusq.R.inc(37306);assertEquals(2L, mutNum.longValue());
    }finally{__CLR4_1_2sq0sq0l3lqxusq.R.flushNeeded();}}

    @Test
    public void testSubtractValuePrimitive() {__CLR4_1_2sq0sq0l3lqxusq.R.globalSliceStart(getClass().getName(),37307);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2w07icjssb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2sq0sq0l3lqxusq.R.rethrow($CLV_t2$);}finally{__CLR4_1_2sq0sq0l3lqxusq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableIntTest.testSubtractValuePrimitive",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37307,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2w07icjssb(){try{__CLR4_1_2sq0sq0l3lqxusq.R.inc(37307);
        __CLR4_1_2sq0sq0l3lqxusq.R.inc(37308);final MutableInt mutNum = new MutableInt(1);
        __CLR4_1_2sq0sq0l3lqxusq.R.inc(37309);mutNum.subtract(1);
        
        __CLR4_1_2sq0sq0l3lqxusq.R.inc(37310);assertEquals(0, mutNum.intValue());
        __CLR4_1_2sq0sq0l3lqxusq.R.inc(37311);assertEquals(0L, mutNum.longValue());
    }finally{__CLR4_1_2sq0sq0l3lqxusq.R.flushNeeded();}}

    @Test
    public void testSubtractValueObject() {__CLR4_1_2sq0sq0l3lqxusq.R.globalSliceStart(getClass().getName(),37312);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2xnns6pssg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2sq0sq0l3lqxusq.R.rethrow($CLV_t2$);}finally{__CLR4_1_2sq0sq0l3lqxusq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableIntTest.testSubtractValueObject",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37312,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2xnns6pssg(){try{__CLR4_1_2sq0sq0l3lqxusq.R.inc(37312);
        __CLR4_1_2sq0sq0l3lqxusq.R.inc(37313);final MutableInt mutNum = new MutableInt(1);
        __CLR4_1_2sq0sq0l3lqxusq.R.inc(37314);mutNum.subtract(Integer.valueOf(1));
        
        __CLR4_1_2sq0sq0l3lqxusq.R.inc(37315);assertEquals(0, mutNum.intValue());
        __CLR4_1_2sq0sq0l3lqxusq.R.inc(37316);assertEquals(0L, mutNum.longValue());
    }finally{__CLR4_1_2sq0sq0l3lqxusq.R.flushNeeded();}}

    @Test
    public void testToString() {__CLR4_1_2sq0sq0l3lqxusq.R.globalSliceStart(getClass().getName(),37317);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2hrxdidssl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2sq0sq0l3lqxusq.R.rethrow($CLV_t2$);}finally{__CLR4_1_2sq0sq0l3lqxusq.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableIntTest.testToString",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37317,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2hrxdidssl(){try{__CLR4_1_2sq0sq0l3lqxusq.R.inc(37317);
        __CLR4_1_2sq0sq0l3lqxusq.R.inc(37318);assertEquals("0", new MutableInt(0).toString());
        __CLR4_1_2sq0sq0l3lqxusq.R.inc(37319);assertEquals("10", new MutableInt(10).toString());
        __CLR4_1_2sq0sq0l3lqxusq.R.inc(37320);assertEquals("-123", new MutableInt(-123).toString());
    }finally{__CLR4_1_2sq0sq0l3lqxusq.R.flushNeeded();}}

}
