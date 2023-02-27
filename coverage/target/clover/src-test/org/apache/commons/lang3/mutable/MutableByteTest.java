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
 * @see MutableByte
 */
public class MutableByteTest {static class __CLR4_1_2shpshpl3lqxus0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492830024L,8589935092L,37020,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    // ----------------------------------------------------------------
    @Test
    public void testConstructors() {__CLR4_1_2shpshpl3lqxus0.R.globalSliceStart(getClass().getName(),36925);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2lwxaheshp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2shpshpl3lqxus0.R.rethrow($CLV_t2$);}finally{__CLR4_1_2shpshpl3lqxus0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableByteTest.testConstructors",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),36925,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2lwxaheshp(){try{__CLR4_1_2shpshpl3lqxus0.R.inc(36925);
        __CLR4_1_2shpshpl3lqxus0.R.inc(36926);assertEquals((byte) 0, new MutableByte().byteValue());
        
        __CLR4_1_2shpshpl3lqxus0.R.inc(36927);assertEquals((byte) 1, new MutableByte((byte) 1).byteValue());
        
        __CLR4_1_2shpshpl3lqxus0.R.inc(36928);assertEquals((byte) 2, new MutableByte(Byte.valueOf((byte) 2)).byteValue());
        __CLR4_1_2shpshpl3lqxus0.R.inc(36929);assertEquals((byte) 3, new MutableByte(new MutableByte((byte) 3)).byteValue());

        __CLR4_1_2shpshpl3lqxus0.R.inc(36930);assertEquals((byte) 2, new MutableByte("2").byteValue());

    }finally{__CLR4_1_2shpshpl3lqxus0.R.flushNeeded();}}

    @Test(expected=NullPointerException.class)
    public void testConstructorNull() {__CLR4_1_2shpshpl3lqxus0.R.globalSliceStart(getClass().getName(),36931);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2hqkc8ashv();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,111,110,115,116,114,117,99,116,111,114,78,117,108,108,58,32,91,78,117,108,108,80,111,105,110,116,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullPointerException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2shpshpl3lqxus0.R.rethrow($CLV_t2$);}finally{__CLR4_1_2shpshpl3lqxus0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableByteTest.testConstructorNull",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),36931,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2hqkc8ashv(){try{__CLR4_1_2shpshpl3lqxus0.R.inc(36931);
        __CLR4_1_2shpshpl3lqxus0.R.inc(36932);new MutableByte((Number)null);
    }finally{__CLR4_1_2shpshpl3lqxus0.R.flushNeeded();}}

    @Test
    public void testGetSet() {__CLR4_1_2shpshpl3lqxus0.R.globalSliceStart(getClass().getName(),36933);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_22wnvh7shx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2shpshpl3lqxus0.R.rethrow($CLV_t2$);}finally{__CLR4_1_2shpshpl3lqxus0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableByteTest.testGetSet",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),36933,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_22wnvh7shx(){try{__CLR4_1_2shpshpl3lqxus0.R.inc(36933);
        __CLR4_1_2shpshpl3lqxus0.R.inc(36934);final MutableByte mutNum = new MutableByte((byte) 0);
        __CLR4_1_2shpshpl3lqxus0.R.inc(36935);assertEquals((byte) 0, new MutableByte().byteValue());
        __CLR4_1_2shpshpl3lqxus0.R.inc(36936);assertEquals(Byte.valueOf((byte) 0), new MutableByte().getValue());
        
        __CLR4_1_2shpshpl3lqxus0.R.inc(36937);mutNum.setValue((byte) 1);
        __CLR4_1_2shpshpl3lqxus0.R.inc(36938);assertEquals((byte) 1, mutNum.byteValue());
        __CLR4_1_2shpshpl3lqxus0.R.inc(36939);assertEquals(Byte.valueOf((byte) 1), mutNum.getValue());
        
        __CLR4_1_2shpshpl3lqxus0.R.inc(36940);mutNum.setValue(Byte.valueOf((byte) 2));
        __CLR4_1_2shpshpl3lqxus0.R.inc(36941);assertEquals((byte) 2, mutNum.byteValue());
        __CLR4_1_2shpshpl3lqxus0.R.inc(36942);assertEquals(Byte.valueOf((byte) 2), mutNum.getValue());
        
        __CLR4_1_2shpshpl3lqxus0.R.inc(36943);mutNum.setValue(new MutableByte((byte) 3));
        __CLR4_1_2shpshpl3lqxus0.R.inc(36944);assertEquals((byte) 3, mutNum.byteValue());
        __CLR4_1_2shpshpl3lqxus0.R.inc(36945);assertEquals(Byte.valueOf((byte) 3), mutNum.getValue());
    }finally{__CLR4_1_2shpshpl3lqxus0.R.flushNeeded();}}

    @Test(expected=NullPointerException.class)
    public void testSetNull() {__CLR4_1_2shpshpl3lqxus0.R.globalSliceStart(getClass().getName(),36946);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2hciyrisia();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,83,101,116,78,117,108,108,58,32,91,78,117,108,108,80,111,105,110,116,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullPointerException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2shpshpl3lqxus0.R.rethrow($CLV_t2$);}finally{__CLR4_1_2shpshpl3lqxus0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableByteTest.testSetNull",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),36946,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2hciyrisia(){try{__CLR4_1_2shpshpl3lqxus0.R.inc(36946);
        __CLR4_1_2shpshpl3lqxus0.R.inc(36947);final MutableByte mutNum = new MutableByte((byte) 0);
        __CLR4_1_2shpshpl3lqxus0.R.inc(36948);mutNum.setValue(null);
    }finally{__CLR4_1_2shpshpl3lqxus0.R.flushNeeded();}}

    @Test
    public void testEquals() {__CLR4_1_2shpshpl3lqxus0.R.globalSliceStart(getClass().getName(),36949);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2s4e608sid();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2shpshpl3lqxus0.R.rethrow($CLV_t2$);}finally{__CLR4_1_2shpshpl3lqxus0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableByteTest.testEquals",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),36949,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2s4e608sid(){try{__CLR4_1_2shpshpl3lqxus0.R.inc(36949);
        __CLR4_1_2shpshpl3lqxus0.R.inc(36950);final MutableByte mutNumA = new MutableByte((byte) 0);
        __CLR4_1_2shpshpl3lqxus0.R.inc(36951);final MutableByte mutNumB = new MutableByte((byte) 0);
        __CLR4_1_2shpshpl3lqxus0.R.inc(36952);final MutableByte mutNumC = new MutableByte((byte) 1);

        __CLR4_1_2shpshpl3lqxus0.R.inc(36953);assertTrue(mutNumA.equals(mutNumA));
        __CLR4_1_2shpshpl3lqxus0.R.inc(36954);assertTrue(mutNumA.equals(mutNumB));
        __CLR4_1_2shpshpl3lqxus0.R.inc(36955);assertTrue(mutNumB.equals(mutNumA));
        __CLR4_1_2shpshpl3lqxus0.R.inc(36956);assertTrue(mutNumB.equals(mutNumB));
        __CLR4_1_2shpshpl3lqxus0.R.inc(36957);assertFalse(mutNumA.equals(mutNumC));
        __CLR4_1_2shpshpl3lqxus0.R.inc(36958);assertFalse(mutNumB.equals(mutNumC));
        __CLR4_1_2shpshpl3lqxus0.R.inc(36959);assertTrue(mutNumC.equals(mutNumC));
        __CLR4_1_2shpshpl3lqxus0.R.inc(36960);assertFalse(mutNumA.equals(null));
        __CLR4_1_2shpshpl3lqxus0.R.inc(36961);assertFalse(mutNumA.equals(Byte.valueOf((byte) 0)));
        __CLR4_1_2shpshpl3lqxus0.R.inc(36962);assertFalse(mutNumA.equals("0"));
    }finally{__CLR4_1_2shpshpl3lqxus0.R.flushNeeded();}}

    @Test
    public void testHashCode() {__CLR4_1_2shpshpl3lqxus0.R.globalSliceStart(getClass().getName(),36963);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_23zkhv8sir();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2shpshpl3lqxus0.R.rethrow($CLV_t2$);}finally{__CLR4_1_2shpshpl3lqxus0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableByteTest.testHashCode",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),36963,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_23zkhv8sir(){try{__CLR4_1_2shpshpl3lqxus0.R.inc(36963);
        __CLR4_1_2shpshpl3lqxus0.R.inc(36964);final MutableByte mutNumA = new MutableByte((byte) 0);
        __CLR4_1_2shpshpl3lqxus0.R.inc(36965);final MutableByte mutNumB = new MutableByte((byte) 0);
        __CLR4_1_2shpshpl3lqxus0.R.inc(36966);final MutableByte mutNumC = new MutableByte((byte) 1);

        __CLR4_1_2shpshpl3lqxus0.R.inc(36967);assertTrue(mutNumA.hashCode() == mutNumA.hashCode());
        __CLR4_1_2shpshpl3lqxus0.R.inc(36968);assertTrue(mutNumA.hashCode() == mutNumB.hashCode());
        __CLR4_1_2shpshpl3lqxus0.R.inc(36969);assertFalse(mutNumA.hashCode() == mutNumC.hashCode());
        __CLR4_1_2shpshpl3lqxus0.R.inc(36970);assertTrue(mutNumA.hashCode() == Byte.valueOf((byte) 0).hashCode());
    }finally{__CLR4_1_2shpshpl3lqxus0.R.flushNeeded();}}

    @Test
    public void testCompareTo() {__CLR4_1_2shpshpl3lqxus0.R.globalSliceStart(getClass().getName(),36971);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2pz6vfvsiz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2shpshpl3lqxus0.R.rethrow($CLV_t2$);}finally{__CLR4_1_2shpshpl3lqxus0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableByteTest.testCompareTo",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),36971,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2pz6vfvsiz(){try{__CLR4_1_2shpshpl3lqxus0.R.inc(36971);
        __CLR4_1_2shpshpl3lqxus0.R.inc(36972);final MutableByte mutNum = new MutableByte((byte) 0);

        __CLR4_1_2shpshpl3lqxus0.R.inc(36973);assertEquals((byte) 0, mutNum.compareTo(new MutableByte((byte) 0)));
        __CLR4_1_2shpshpl3lqxus0.R.inc(36974);assertEquals((byte) +1, mutNum.compareTo(new MutableByte((byte) -1)));
        __CLR4_1_2shpshpl3lqxus0.R.inc(36975);assertEquals((byte) -1, mutNum.compareTo(new MutableByte((byte) 1)));
    }finally{__CLR4_1_2shpshpl3lqxus0.R.flushNeeded();}}

    @Test(expected=NullPointerException.class)
    public void testCompareToNull() {__CLR4_1_2shpshpl3lqxus0.R.globalSliceStart(getClass().getName(),36976);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2g1nl0csj4();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,111,109,112,97,114,101,84,111,78,117,108,108,58,32,91,78,117,108,108,80,111,105,110,116,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullPointerException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2shpshpl3lqxus0.R.rethrow($CLV_t2$);}finally{__CLR4_1_2shpshpl3lqxus0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableByteTest.testCompareToNull",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),36976,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2g1nl0csj4(){try{__CLR4_1_2shpshpl3lqxus0.R.inc(36976);
        __CLR4_1_2shpshpl3lqxus0.R.inc(36977);final MutableByte mutNum = new MutableByte((byte) 0);
        __CLR4_1_2shpshpl3lqxus0.R.inc(36978);mutNum.compareTo(null);
    }finally{__CLR4_1_2shpshpl3lqxus0.R.flushNeeded();}}

    @Test
    public void testPrimitiveValues() {__CLR4_1_2shpshpl3lqxus0.R.globalSliceStart(getClass().getName(),36979);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2uifrysj7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2shpshpl3lqxus0.R.rethrow($CLV_t2$);}finally{__CLR4_1_2shpshpl3lqxus0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableByteTest.testPrimitiveValues",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),36979,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2uifrysj7(){try{__CLR4_1_2shpshpl3lqxus0.R.inc(36979);
        __CLR4_1_2shpshpl3lqxus0.R.inc(36980);final MutableByte mutNum = new MutableByte( (byte) 1 );
        
        __CLR4_1_2shpshpl3lqxus0.R.inc(36981);assertEquals( 1.0F, mutNum.floatValue(), 0 );
        __CLR4_1_2shpshpl3lqxus0.R.inc(36982);assertEquals( 1.0, mutNum.doubleValue(), 0 );
        __CLR4_1_2shpshpl3lqxus0.R.inc(36983);assertEquals( (byte) 1, mutNum.byteValue() );
        __CLR4_1_2shpshpl3lqxus0.R.inc(36984);assertEquals( (short) 1, mutNum.shortValue() );
        __CLR4_1_2shpshpl3lqxus0.R.inc(36985);assertEquals( 1, mutNum.intValue() );
        __CLR4_1_2shpshpl3lqxus0.R.inc(36986);assertEquals( 1L, mutNum.longValue() );
    }finally{__CLR4_1_2shpshpl3lqxus0.R.flushNeeded();}}

    @Test
    public void testToByte() {__CLR4_1_2shpshpl3lqxus0.R.globalSliceStart(getClass().getName(),36987);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2s2gao4sjf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2shpshpl3lqxus0.R.rethrow($CLV_t2$);}finally{__CLR4_1_2shpshpl3lqxus0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableByteTest.testToByte",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),36987,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2s2gao4sjf(){try{__CLR4_1_2shpshpl3lqxus0.R.inc(36987);
        __CLR4_1_2shpshpl3lqxus0.R.inc(36988);assertEquals(Byte.valueOf((byte) 0), new MutableByte((byte) 0).toByte());
        __CLR4_1_2shpshpl3lqxus0.R.inc(36989);assertEquals(Byte.valueOf((byte) 123), new MutableByte((byte) 123).toByte());
    }finally{__CLR4_1_2shpshpl3lqxus0.R.flushNeeded();}}

    @Test
    public void testIncrement() {__CLR4_1_2shpshpl3lqxus0.R.globalSliceStart(getClass().getName(),36990);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2m6qqn0sji();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2shpshpl3lqxus0.R.rethrow($CLV_t2$);}finally{__CLR4_1_2shpshpl3lqxus0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableByteTest.testIncrement",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),36990,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2m6qqn0sji(){try{__CLR4_1_2shpshpl3lqxus0.R.inc(36990);
        __CLR4_1_2shpshpl3lqxus0.R.inc(36991);final MutableByte mutNum = new MutableByte((byte) 1);
        __CLR4_1_2shpshpl3lqxus0.R.inc(36992);mutNum.increment();
        
        __CLR4_1_2shpshpl3lqxus0.R.inc(36993);assertEquals(2, mutNum.intValue());
        __CLR4_1_2shpshpl3lqxus0.R.inc(36994);assertEquals(2L, mutNum.longValue());
    }finally{__CLR4_1_2shpshpl3lqxus0.R.flushNeeded();}}

    @Test
    public void testDecrement() {__CLR4_1_2shpshpl3lqxus0.R.globalSliceStart(getClass().getName(),36995);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2pripmwsjn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2shpshpl3lqxus0.R.rethrow($CLV_t2$);}finally{__CLR4_1_2shpshpl3lqxus0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableByteTest.testDecrement",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),36995,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2pripmwsjn(){try{__CLR4_1_2shpshpl3lqxus0.R.inc(36995);
        __CLR4_1_2shpshpl3lqxus0.R.inc(36996);final MutableByte mutNum = new MutableByte((byte) 1);
        __CLR4_1_2shpshpl3lqxus0.R.inc(36997);mutNum.decrement();
        
        __CLR4_1_2shpshpl3lqxus0.R.inc(36998);assertEquals(0, mutNum.intValue());
        __CLR4_1_2shpshpl3lqxus0.R.inc(36999);assertEquals(0L, mutNum.longValue());
    }finally{__CLR4_1_2shpshpl3lqxus0.R.flushNeeded();}}

    @Test
    public void testAddValuePrimitive() {__CLR4_1_2shpshpl3lqxus0.R.globalSliceStart(getClass().getName(),37000);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2nrme6ssjs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2shpshpl3lqxus0.R.rethrow($CLV_t2$);}finally{__CLR4_1_2shpshpl3lqxus0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableByteTest.testAddValuePrimitive",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37000,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2nrme6ssjs(){try{__CLR4_1_2shpshpl3lqxus0.R.inc(37000);
        __CLR4_1_2shpshpl3lqxus0.R.inc(37001);final MutableByte mutNum = new MutableByte((byte) 1);
        __CLR4_1_2shpshpl3lqxus0.R.inc(37002);mutNum.add((byte)1);
        
        __CLR4_1_2shpshpl3lqxus0.R.inc(37003);assertEquals((byte) 2, mutNum.byteValue());
    }finally{__CLR4_1_2shpshpl3lqxus0.R.flushNeeded();}}

    @Test
    public void testAddValueObject() {__CLR4_1_2shpshpl3lqxus0.R.globalSliceStart(getClass().getName(),37004);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2cu6v3ssjw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2shpshpl3lqxus0.R.rethrow($CLV_t2$);}finally{__CLR4_1_2shpshpl3lqxus0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableByteTest.testAddValueObject",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37004,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2cu6v3ssjw(){try{__CLR4_1_2shpshpl3lqxus0.R.inc(37004);
        __CLR4_1_2shpshpl3lqxus0.R.inc(37005);final MutableByte mutNum = new MutableByte((byte) 1);
        __CLR4_1_2shpshpl3lqxus0.R.inc(37006);mutNum.add(Integer.valueOf(1));
        
        __CLR4_1_2shpshpl3lqxus0.R.inc(37007);assertEquals((byte) 2, mutNum.byteValue());
    }finally{__CLR4_1_2shpshpl3lqxus0.R.flushNeeded();}}

    @Test
    public void testSubtractValuePrimitive() {__CLR4_1_2shpshpl3lqxus0.R.globalSliceStart(getClass().getName(),37008);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2w07icjsk0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2shpshpl3lqxus0.R.rethrow($CLV_t2$);}finally{__CLR4_1_2shpshpl3lqxus0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableByteTest.testSubtractValuePrimitive",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37008,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2w07icjsk0(){try{__CLR4_1_2shpshpl3lqxus0.R.inc(37008);
        __CLR4_1_2shpshpl3lqxus0.R.inc(37009);final MutableByte mutNum = new MutableByte((byte) 1);
        __CLR4_1_2shpshpl3lqxus0.R.inc(37010);mutNum.subtract((byte) 1);
        
        __CLR4_1_2shpshpl3lqxus0.R.inc(37011);assertEquals((byte) 0, mutNum.byteValue());
    }finally{__CLR4_1_2shpshpl3lqxus0.R.flushNeeded();}}

    @Test
    public void testSubtractValueObject() {__CLR4_1_2shpshpl3lqxus0.R.globalSliceStart(getClass().getName(),37012);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2xnns6psk4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2shpshpl3lqxus0.R.rethrow($CLV_t2$);}finally{__CLR4_1_2shpshpl3lqxus0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableByteTest.testSubtractValueObject",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37012,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2xnns6psk4(){try{__CLR4_1_2shpshpl3lqxus0.R.inc(37012);
        __CLR4_1_2shpshpl3lqxus0.R.inc(37013);final MutableByte mutNum = new MutableByte((byte) 1);
        __CLR4_1_2shpshpl3lqxus0.R.inc(37014);mutNum.subtract(Integer.valueOf(1));
        
        __CLR4_1_2shpshpl3lqxus0.R.inc(37015);assertEquals((byte) 0, mutNum.byteValue());
    }finally{__CLR4_1_2shpshpl3lqxus0.R.flushNeeded();}}

    @Test
    public void testToString() {__CLR4_1_2shpshpl3lqxus0.R.globalSliceStart(getClass().getName(),37016);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2hrxdidsk8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2shpshpl3lqxus0.R.rethrow($CLV_t2$);}finally{__CLR4_1_2shpshpl3lqxus0.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableByteTest.testToString",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37016,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2hrxdidsk8(){try{__CLR4_1_2shpshpl3lqxus0.R.inc(37016);
        __CLR4_1_2shpshpl3lqxus0.R.inc(37017);assertEquals("0", new MutableByte((byte) 0).toString());
        __CLR4_1_2shpshpl3lqxus0.R.inc(37018);assertEquals("10", new MutableByte((byte) 10).toString());
        __CLR4_1_2shpshpl3lqxus0.R.inc(37019);assertEquals("-123", new MutableByte((byte) -123).toString());
    }finally{__CLR4_1_2shpshpl3lqxus0.R.flushNeeded();}}

}
