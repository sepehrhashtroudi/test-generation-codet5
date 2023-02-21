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
 * @see MutableDouble
 */
public class MutableDoubleTest {static class __CLR4_1_2skcskcl3lqxus9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492830024L,8589935092L,37122,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    // ----------------------------------------------------------------
    @Test
    public void testConstructors() {__CLR4_1_2skcskcl3lqxus9.R.globalSliceStart(getClass().getName(),37020);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2lwxaheskc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2skcskcl3lqxus9.R.rethrow($CLV_t2$);}finally{__CLR4_1_2skcskcl3lqxus9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableDoubleTest.testConstructors",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37020,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2lwxaheskc(){try{__CLR4_1_2skcskcl3lqxus9.R.inc(37020);
        __CLR4_1_2skcskcl3lqxus9.R.inc(37021);assertEquals(0d, new MutableDouble().doubleValue(), 0.0001d);
        
        __CLR4_1_2skcskcl3lqxus9.R.inc(37022);assertEquals(1d, new MutableDouble(1d).doubleValue(), 0.0001d);
        
        __CLR4_1_2skcskcl3lqxus9.R.inc(37023);assertEquals(2d, new MutableDouble(Double.valueOf(2d)).doubleValue(), 0.0001d);
        __CLR4_1_2skcskcl3lqxus9.R.inc(37024);assertEquals(3d, new MutableDouble(new MutableDouble(3d)).doubleValue(), 0.0001d);
        
        __CLR4_1_2skcskcl3lqxus9.R.inc(37025);assertEquals(2d, new MutableDouble("2.0").doubleValue(), 0.0001d);

    }finally{__CLR4_1_2skcskcl3lqxus9.R.flushNeeded();}}

    @Test(expected=NullPointerException.class)
    public void testConstructorNull() {__CLR4_1_2skcskcl3lqxus9.R.globalSliceStart(getClass().getName(),37026);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2hqkc8aski();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,111,110,115,116,114,117,99,116,111,114,78,117,108,108,58,32,91,78,117,108,108,80,111,105,110,116,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullPointerException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2skcskcl3lqxus9.R.rethrow($CLV_t2$);}finally{__CLR4_1_2skcskcl3lqxus9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableDoubleTest.testConstructorNull",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37026,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2hqkc8aski(){try{__CLR4_1_2skcskcl3lqxus9.R.inc(37026);
        __CLR4_1_2skcskcl3lqxus9.R.inc(37027);new MutableDouble((Number)null);
    }finally{__CLR4_1_2skcskcl3lqxus9.R.flushNeeded();}}

    @Test
    public void testGetSet() {__CLR4_1_2skcskcl3lqxus9.R.globalSliceStart(getClass().getName(),37028);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_22wnvh7skk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2skcskcl3lqxus9.R.rethrow($CLV_t2$);}finally{__CLR4_1_2skcskcl3lqxus9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableDoubleTest.testGetSet",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37028,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_22wnvh7skk(){try{__CLR4_1_2skcskcl3lqxus9.R.inc(37028);
        __CLR4_1_2skcskcl3lqxus9.R.inc(37029);final MutableDouble mutNum = new MutableDouble(0d);
        __CLR4_1_2skcskcl3lqxus9.R.inc(37030);assertEquals(0d, new MutableDouble().doubleValue(), 0.0001d);
        __CLR4_1_2skcskcl3lqxus9.R.inc(37031);assertEquals(Double.valueOf(0), new MutableDouble().getValue());
        
        __CLR4_1_2skcskcl3lqxus9.R.inc(37032);mutNum.setValue(1);
        __CLR4_1_2skcskcl3lqxus9.R.inc(37033);assertEquals(1d, mutNum.doubleValue(), 0.0001d);
        __CLR4_1_2skcskcl3lqxus9.R.inc(37034);assertEquals(Double.valueOf(1d), mutNum.getValue());
        
        __CLR4_1_2skcskcl3lqxus9.R.inc(37035);mutNum.setValue(Double.valueOf(2d));
        __CLR4_1_2skcskcl3lqxus9.R.inc(37036);assertEquals(2d, mutNum.doubleValue(), 0.0001d);
        __CLR4_1_2skcskcl3lqxus9.R.inc(37037);assertEquals(Double.valueOf(2d), mutNum.getValue());
        
        __CLR4_1_2skcskcl3lqxus9.R.inc(37038);mutNum.setValue(new MutableDouble(3d));
        __CLR4_1_2skcskcl3lqxus9.R.inc(37039);assertEquals(3d, mutNum.doubleValue(), 0.0001d);
        __CLR4_1_2skcskcl3lqxus9.R.inc(37040);assertEquals(Double.valueOf(3d), mutNum.getValue());
    }finally{__CLR4_1_2skcskcl3lqxus9.R.flushNeeded();}}

    @Test(expected=NullPointerException.class)
    public void testSetNull() {__CLR4_1_2skcskcl3lqxus9.R.globalSliceStart(getClass().getName(),37041);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2hciyriskx();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,83,101,116,78,117,108,108,58,32,91,78,117,108,108,80,111,105,110,116,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullPointerException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2skcskcl3lqxus9.R.rethrow($CLV_t2$);}finally{__CLR4_1_2skcskcl3lqxus9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableDoubleTest.testSetNull",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37041,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2hciyriskx(){try{__CLR4_1_2skcskcl3lqxus9.R.inc(37041);
        __CLR4_1_2skcskcl3lqxus9.R.inc(37042);final MutableDouble mutNum = new MutableDouble(0d);
        __CLR4_1_2skcskcl3lqxus9.R.inc(37043);mutNum.setValue(null);
    }finally{__CLR4_1_2skcskcl3lqxus9.R.flushNeeded();}}

    @Test
    public void testNanInfinite() {__CLR4_1_2skcskcl3lqxus9.R.globalSliceStart(getClass().getName(),37044);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2gn0e0ssl0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2skcskcl3lqxus9.R.rethrow($CLV_t2$);}finally{__CLR4_1_2skcskcl3lqxus9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableDoubleTest.testNanInfinite",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37044,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2gn0e0ssl0(){try{__CLR4_1_2skcskcl3lqxus9.R.inc(37044);
        __CLR4_1_2skcskcl3lqxus9.R.inc(37045);MutableDouble mutNum = new MutableDouble(Double.NaN);
        __CLR4_1_2skcskcl3lqxus9.R.inc(37046);assertTrue(mutNum.isNaN());
        
        __CLR4_1_2skcskcl3lqxus9.R.inc(37047);mutNum = new MutableDouble(Double.POSITIVE_INFINITY);
        __CLR4_1_2skcskcl3lqxus9.R.inc(37048);assertTrue(mutNum.isInfinite());
        
        __CLR4_1_2skcskcl3lqxus9.R.inc(37049);mutNum = new MutableDouble(Double.NEGATIVE_INFINITY);
        __CLR4_1_2skcskcl3lqxus9.R.inc(37050);assertTrue(mutNum.isInfinite());
    }finally{__CLR4_1_2skcskcl3lqxus9.R.flushNeeded();}}

    @Test
    public void testEquals() {__CLR4_1_2skcskcl3lqxus9.R.globalSliceStart(getClass().getName(),37051);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2s4e608sl7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2skcskcl3lqxus9.R.rethrow($CLV_t2$);}finally{__CLR4_1_2skcskcl3lqxus9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableDoubleTest.testEquals",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37051,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2s4e608sl7(){try{__CLR4_1_2skcskcl3lqxus9.R.inc(37051);
        __CLR4_1_2skcskcl3lqxus9.R.inc(37052);final MutableDouble mutNumA = new MutableDouble(0d);
        __CLR4_1_2skcskcl3lqxus9.R.inc(37053);final MutableDouble mutNumB = new MutableDouble(0d);
        __CLR4_1_2skcskcl3lqxus9.R.inc(37054);final MutableDouble mutNumC = new MutableDouble(1d);

        __CLR4_1_2skcskcl3lqxus9.R.inc(37055);assertTrue(mutNumA.equals(mutNumA));
        __CLR4_1_2skcskcl3lqxus9.R.inc(37056);assertTrue(mutNumA.equals(mutNumB));
        __CLR4_1_2skcskcl3lqxus9.R.inc(37057);assertTrue(mutNumB.equals(mutNumA));
        __CLR4_1_2skcskcl3lqxus9.R.inc(37058);assertTrue(mutNumB.equals(mutNumB));
        __CLR4_1_2skcskcl3lqxus9.R.inc(37059);assertFalse(mutNumA.equals(mutNumC));
        __CLR4_1_2skcskcl3lqxus9.R.inc(37060);assertFalse(mutNumB.equals(mutNumC));
        __CLR4_1_2skcskcl3lqxus9.R.inc(37061);assertTrue(mutNumC.equals(mutNumC));
        __CLR4_1_2skcskcl3lqxus9.R.inc(37062);assertFalse(mutNumA.equals(null));
        __CLR4_1_2skcskcl3lqxus9.R.inc(37063);assertFalse(mutNumA.equals(Double.valueOf(0d)));
        __CLR4_1_2skcskcl3lqxus9.R.inc(37064);assertFalse(mutNumA.equals("0"));
    }finally{__CLR4_1_2skcskcl3lqxus9.R.flushNeeded();}}

    @Test
    public void testHashCode() {__CLR4_1_2skcskcl3lqxus9.R.globalSliceStart(getClass().getName(),37065);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_23zkhv8sll();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2skcskcl3lqxus9.R.rethrow($CLV_t2$);}finally{__CLR4_1_2skcskcl3lqxus9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableDoubleTest.testHashCode",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37065,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_23zkhv8sll(){try{__CLR4_1_2skcskcl3lqxus9.R.inc(37065);
        __CLR4_1_2skcskcl3lqxus9.R.inc(37066);final MutableDouble mutNumA = new MutableDouble(0d);
        __CLR4_1_2skcskcl3lqxus9.R.inc(37067);final MutableDouble mutNumB = new MutableDouble(0d);
        __CLR4_1_2skcskcl3lqxus9.R.inc(37068);final MutableDouble mutNumC = new MutableDouble(1d);

        __CLR4_1_2skcskcl3lqxus9.R.inc(37069);assertTrue(mutNumA.hashCode() == mutNumA.hashCode());
        __CLR4_1_2skcskcl3lqxus9.R.inc(37070);assertTrue(mutNumA.hashCode() == mutNumB.hashCode());
        __CLR4_1_2skcskcl3lqxus9.R.inc(37071);assertFalse(mutNumA.hashCode() == mutNumC.hashCode());
        __CLR4_1_2skcskcl3lqxus9.R.inc(37072);assertTrue(mutNumA.hashCode() == Double.valueOf(0d).hashCode());
    }finally{__CLR4_1_2skcskcl3lqxus9.R.flushNeeded();}}

    @Test
    public void testCompareTo() {__CLR4_1_2skcskcl3lqxus9.R.globalSliceStart(getClass().getName(),37073);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2pz6vfvslt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2skcskcl3lqxus9.R.rethrow($CLV_t2$);}finally{__CLR4_1_2skcskcl3lqxus9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableDoubleTest.testCompareTo",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37073,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2pz6vfvslt(){try{__CLR4_1_2skcskcl3lqxus9.R.inc(37073);
        __CLR4_1_2skcskcl3lqxus9.R.inc(37074);final MutableDouble mutNum = new MutableDouble(0d);

        __CLR4_1_2skcskcl3lqxus9.R.inc(37075);assertEquals(0, mutNum.compareTo(new MutableDouble(0d)));
        __CLR4_1_2skcskcl3lqxus9.R.inc(37076);assertEquals(+1, mutNum.compareTo(new MutableDouble(-1d)));
        __CLR4_1_2skcskcl3lqxus9.R.inc(37077);assertEquals(-1, mutNum.compareTo(new MutableDouble(1d)));
    }finally{__CLR4_1_2skcskcl3lqxus9.R.flushNeeded();}}

    @Test(expected=NullPointerException.class)
    public void testCompareToNull() {__CLR4_1_2skcskcl3lqxus9.R.globalSliceStart(getClass().getName(),37078);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2g1nl0csly();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,111,109,112,97,114,101,84,111,78,117,108,108,58,32,91,78,117,108,108,80,111,105,110,116,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullPointerException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2skcskcl3lqxus9.R.rethrow($CLV_t2$);}finally{__CLR4_1_2skcskcl3lqxus9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableDoubleTest.testCompareToNull",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37078,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2g1nl0csly(){try{__CLR4_1_2skcskcl3lqxus9.R.inc(37078);
        __CLR4_1_2skcskcl3lqxus9.R.inc(37079);final MutableDouble mutNum = new MutableDouble(0d);
        __CLR4_1_2skcskcl3lqxus9.R.inc(37080);mutNum.compareTo(null);
    }finally{__CLR4_1_2skcskcl3lqxus9.R.flushNeeded();}}

    @Test
    public void testPrimitiveValues() {__CLR4_1_2skcskcl3lqxus9.R.globalSliceStart(getClass().getName(),37081);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2uifrysm1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2skcskcl3lqxus9.R.rethrow($CLV_t2$);}finally{__CLR4_1_2skcskcl3lqxus9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableDoubleTest.testPrimitiveValues",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37081,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2uifrysm1(){try{__CLR4_1_2skcskcl3lqxus9.R.inc(37081);
        __CLR4_1_2skcskcl3lqxus9.R.inc(37082);final MutableDouble mutNum = new MutableDouble(1.7);
        
        __CLR4_1_2skcskcl3lqxus9.R.inc(37083);assertEquals( 1.7F, mutNum.floatValue(), 0 );
        __CLR4_1_2skcskcl3lqxus9.R.inc(37084);assertEquals( 1.7, mutNum.doubleValue(), 0 );
        __CLR4_1_2skcskcl3lqxus9.R.inc(37085);assertEquals( (byte) 1, mutNum.byteValue() );
        __CLR4_1_2skcskcl3lqxus9.R.inc(37086);assertEquals( (short) 1, mutNum.shortValue() );
        __CLR4_1_2skcskcl3lqxus9.R.inc(37087);assertEquals( 1, mutNum.intValue() );
        __CLR4_1_2skcskcl3lqxus9.R.inc(37088);assertEquals( 1L, mutNum.longValue() );
    }finally{__CLR4_1_2skcskcl3lqxus9.R.flushNeeded();}}

    @Test
    public void testToDouble() {__CLR4_1_2skcskcl3lqxus9.R.globalSliceStart(getClass().getName(),37089);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2te5t9hsm9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2skcskcl3lqxus9.R.rethrow($CLV_t2$);}finally{__CLR4_1_2skcskcl3lqxus9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableDoubleTest.testToDouble",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37089,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2te5t9hsm9(){try{__CLR4_1_2skcskcl3lqxus9.R.inc(37089);
        __CLR4_1_2skcskcl3lqxus9.R.inc(37090);assertEquals(Double.valueOf(0d), new MutableDouble(0d).toDouble());
        __CLR4_1_2skcskcl3lqxus9.R.inc(37091);assertEquals(Double.valueOf(12.3d), new MutableDouble(12.3d).toDouble());
    }finally{__CLR4_1_2skcskcl3lqxus9.R.flushNeeded();}}

    @Test
    public void testIncrement() {__CLR4_1_2skcskcl3lqxus9.R.globalSliceStart(getClass().getName(),37092);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2m6qqn0smc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2skcskcl3lqxus9.R.rethrow($CLV_t2$);}finally{__CLR4_1_2skcskcl3lqxus9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableDoubleTest.testIncrement",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37092,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2m6qqn0smc(){try{__CLR4_1_2skcskcl3lqxus9.R.inc(37092);
        __CLR4_1_2skcskcl3lqxus9.R.inc(37093);final MutableDouble mutNum = new MutableDouble(1);
        __CLR4_1_2skcskcl3lqxus9.R.inc(37094);mutNum.increment();
        
        __CLR4_1_2skcskcl3lqxus9.R.inc(37095);assertEquals(2, mutNum.intValue());
        __CLR4_1_2skcskcl3lqxus9.R.inc(37096);assertEquals(2L, mutNum.longValue());
    }finally{__CLR4_1_2skcskcl3lqxus9.R.flushNeeded();}}

    @Test
    public void testDecrement() {__CLR4_1_2skcskcl3lqxus9.R.globalSliceStart(getClass().getName(),37097);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2pripmwsmh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2skcskcl3lqxus9.R.rethrow($CLV_t2$);}finally{__CLR4_1_2skcskcl3lqxus9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableDoubleTest.testDecrement",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37097,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2pripmwsmh(){try{__CLR4_1_2skcskcl3lqxus9.R.inc(37097);
        __CLR4_1_2skcskcl3lqxus9.R.inc(37098);final MutableDouble mutNum = new MutableDouble(1);
        __CLR4_1_2skcskcl3lqxus9.R.inc(37099);mutNum.decrement();
        
        __CLR4_1_2skcskcl3lqxus9.R.inc(37100);assertEquals(0, mutNum.intValue());
        __CLR4_1_2skcskcl3lqxus9.R.inc(37101);assertEquals(0L, mutNum.longValue());
    }finally{__CLR4_1_2skcskcl3lqxus9.R.flushNeeded();}}

    @Test
    public void testAddValuePrimitive() {__CLR4_1_2skcskcl3lqxus9.R.globalSliceStart(getClass().getName(),37102);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2nrme6ssmm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2skcskcl3lqxus9.R.rethrow($CLV_t2$);}finally{__CLR4_1_2skcskcl3lqxus9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableDoubleTest.testAddValuePrimitive",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37102,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2nrme6ssmm(){try{__CLR4_1_2skcskcl3lqxus9.R.inc(37102);
        __CLR4_1_2skcskcl3lqxus9.R.inc(37103);final MutableDouble mutNum = new MutableDouble(1);
        __CLR4_1_2skcskcl3lqxus9.R.inc(37104);mutNum.add(1.1d);
        
        __CLR4_1_2skcskcl3lqxus9.R.inc(37105);assertEquals(2.1d, mutNum.doubleValue(), 0.01d);
    }finally{__CLR4_1_2skcskcl3lqxus9.R.flushNeeded();}}

    @Test
    public void testAddValueObject() {__CLR4_1_2skcskcl3lqxus9.R.globalSliceStart(getClass().getName(),37106);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2cu6v3ssmq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2skcskcl3lqxus9.R.rethrow($CLV_t2$);}finally{__CLR4_1_2skcskcl3lqxus9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableDoubleTest.testAddValueObject",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37106,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2cu6v3ssmq(){try{__CLR4_1_2skcskcl3lqxus9.R.inc(37106);
        __CLR4_1_2skcskcl3lqxus9.R.inc(37107);final MutableDouble mutNum = new MutableDouble(1);
        __CLR4_1_2skcskcl3lqxus9.R.inc(37108);mutNum.add(Double.valueOf(1.1d));
        
        __CLR4_1_2skcskcl3lqxus9.R.inc(37109);assertEquals(2.1d, mutNum.doubleValue(), 0.01d);
    }finally{__CLR4_1_2skcskcl3lqxus9.R.flushNeeded();}}

    @Test
    public void testSubtractValuePrimitive() {__CLR4_1_2skcskcl3lqxus9.R.globalSliceStart(getClass().getName(),37110);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2w07icjsmu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2skcskcl3lqxus9.R.rethrow($CLV_t2$);}finally{__CLR4_1_2skcskcl3lqxus9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableDoubleTest.testSubtractValuePrimitive",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37110,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2w07icjsmu(){try{__CLR4_1_2skcskcl3lqxus9.R.inc(37110);
        __CLR4_1_2skcskcl3lqxus9.R.inc(37111);final MutableDouble mutNum = new MutableDouble(1);
        __CLR4_1_2skcskcl3lqxus9.R.inc(37112);mutNum.subtract(0.9d);
        
        __CLR4_1_2skcskcl3lqxus9.R.inc(37113);assertEquals(0.1d, mutNum.doubleValue(), 0.01d);
    }finally{__CLR4_1_2skcskcl3lqxus9.R.flushNeeded();}}

    @Test
    public void testSubtractValueObject() {__CLR4_1_2skcskcl3lqxus9.R.globalSliceStart(getClass().getName(),37114);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2xnns6psmy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2skcskcl3lqxus9.R.rethrow($CLV_t2$);}finally{__CLR4_1_2skcskcl3lqxus9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableDoubleTest.testSubtractValueObject",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37114,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2xnns6psmy(){try{__CLR4_1_2skcskcl3lqxus9.R.inc(37114);
        __CLR4_1_2skcskcl3lqxus9.R.inc(37115);final MutableDouble mutNum = new MutableDouble(1);
        __CLR4_1_2skcskcl3lqxus9.R.inc(37116);mutNum.subtract(Double.valueOf(0.9d));
        
        __CLR4_1_2skcskcl3lqxus9.R.inc(37117);assertEquals(0.1d, mutNum.doubleValue(), 0.01d);
    }finally{__CLR4_1_2skcskcl3lqxus9.R.flushNeeded();}}

    @Test
    public void testToString() {__CLR4_1_2skcskcl3lqxus9.R.globalSliceStart(getClass().getName(),37118);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2hrxdidsn2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2skcskcl3lqxus9.R.rethrow($CLV_t2$);}finally{__CLR4_1_2skcskcl3lqxus9.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableDoubleTest.testToString",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37118,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2hrxdidsn2(){try{__CLR4_1_2skcskcl3lqxus9.R.inc(37118);
        __CLR4_1_2skcskcl3lqxus9.R.inc(37119);assertEquals("0.0", new MutableDouble(0d).toString());
        __CLR4_1_2skcskcl3lqxus9.R.inc(37120);assertEquals("10.0", new MutableDouble(10d).toString());
        __CLR4_1_2skcskcl3lqxus9.R.inc(37121);assertEquals("-123.0", new MutableDouble(-123d).toString());
    }finally{__CLR4_1_2skcskcl3lqxus9.R.flushNeeded();}}

}
