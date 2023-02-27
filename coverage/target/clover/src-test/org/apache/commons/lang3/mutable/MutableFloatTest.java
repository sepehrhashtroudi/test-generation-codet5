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
 * @see MutableFloat
 */
public class MutableFloatTest {static class __CLR4_1_2sn6sn6l3lqxusi{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492830024L,8589935092L,37224,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    // ----------------------------------------------------------------
    @Test
    public void testConstructors() {__CLR4_1_2sn6sn6l3lqxusi.R.globalSliceStart(getClass().getName(),37122);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2lwxahesn6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2sn6sn6l3lqxusi.R.rethrow($CLV_t2$);}finally{__CLR4_1_2sn6sn6l3lqxusi.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableFloatTest.testConstructors",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37122,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2lwxahesn6(){try{__CLR4_1_2sn6sn6l3lqxusi.R.inc(37122);
        __CLR4_1_2sn6sn6l3lqxusi.R.inc(37123);assertEquals(0f, new MutableFloat().floatValue(), 0.0001f);
        
        __CLR4_1_2sn6sn6l3lqxusi.R.inc(37124);assertEquals(1f, new MutableFloat(1f).floatValue(), 0.0001f);
        
        __CLR4_1_2sn6sn6l3lqxusi.R.inc(37125);assertEquals(2f, new MutableFloat(Float.valueOf(2f)).floatValue(), 0.0001f);
        __CLR4_1_2sn6sn6l3lqxusi.R.inc(37126);assertEquals(3f, new MutableFloat(new MutableFloat(3f)).floatValue(), 0.0001f);

        __CLR4_1_2sn6sn6l3lqxusi.R.inc(37127);assertEquals(2f, new MutableFloat("2.0").floatValue(), 0.0001f);

    }finally{__CLR4_1_2sn6sn6l3lqxusi.R.flushNeeded();}}

    @Test(expected=NullPointerException.class)
    public void testConstructorNull() {__CLR4_1_2sn6sn6l3lqxusi.R.globalSliceStart(getClass().getName(),37128);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2hqkc8asnc();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,111,110,115,116,114,117,99,116,111,114,78,117,108,108,58,32,91,78,117,108,108,80,111,105,110,116,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullPointerException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2sn6sn6l3lqxusi.R.rethrow($CLV_t2$);}finally{__CLR4_1_2sn6sn6l3lqxusi.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableFloatTest.testConstructorNull",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37128,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2hqkc8asnc(){try{__CLR4_1_2sn6sn6l3lqxusi.R.inc(37128);
        __CLR4_1_2sn6sn6l3lqxusi.R.inc(37129);new MutableFloat((Number)null);
    }finally{__CLR4_1_2sn6sn6l3lqxusi.R.flushNeeded();}}

    @Test
    public void testGetSet() {__CLR4_1_2sn6sn6l3lqxusi.R.globalSliceStart(getClass().getName(),37130);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_22wnvh7sne();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2sn6sn6l3lqxusi.R.rethrow($CLV_t2$);}finally{__CLR4_1_2sn6sn6l3lqxusi.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableFloatTest.testGetSet",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37130,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_22wnvh7sne(){try{__CLR4_1_2sn6sn6l3lqxusi.R.inc(37130);
        __CLR4_1_2sn6sn6l3lqxusi.R.inc(37131);final MutableFloat mutNum = new MutableFloat(0f);
        __CLR4_1_2sn6sn6l3lqxusi.R.inc(37132);assertEquals(0f, new MutableFloat().floatValue(), 0.0001f);
        __CLR4_1_2sn6sn6l3lqxusi.R.inc(37133);assertEquals(Float.valueOf(0), new MutableFloat().getValue());
        
        __CLR4_1_2sn6sn6l3lqxusi.R.inc(37134);mutNum.setValue(1);
        __CLR4_1_2sn6sn6l3lqxusi.R.inc(37135);assertEquals(1f, mutNum.floatValue(), 0.0001f);
        __CLR4_1_2sn6sn6l3lqxusi.R.inc(37136);assertEquals(Float.valueOf(1f), mutNum.getValue());
        
        __CLR4_1_2sn6sn6l3lqxusi.R.inc(37137);mutNum.setValue(Float.valueOf(2f));
        __CLR4_1_2sn6sn6l3lqxusi.R.inc(37138);assertEquals(2f, mutNum.floatValue(), 0.0001f);
        __CLR4_1_2sn6sn6l3lqxusi.R.inc(37139);assertEquals(Float.valueOf(2f), mutNum.getValue());
        
        __CLR4_1_2sn6sn6l3lqxusi.R.inc(37140);mutNum.setValue(new MutableFloat(3f));
        __CLR4_1_2sn6sn6l3lqxusi.R.inc(37141);assertEquals(3f, mutNum.floatValue(), 0.0001f);
        __CLR4_1_2sn6sn6l3lqxusi.R.inc(37142);assertEquals(Float.valueOf(3f), mutNum.getValue());
    }finally{__CLR4_1_2sn6sn6l3lqxusi.R.flushNeeded();}}

    @Test(expected=NullPointerException.class)
    public void testSetNull() {__CLR4_1_2sn6sn6l3lqxusi.R.globalSliceStart(getClass().getName(),37143);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2hciyrisnr();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,83,101,116,78,117,108,108,58,32,91,78,117,108,108,80,111,105,110,116,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullPointerException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2sn6sn6l3lqxusi.R.rethrow($CLV_t2$);}finally{__CLR4_1_2sn6sn6l3lqxusi.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableFloatTest.testSetNull",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37143,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2hciyrisnr(){try{__CLR4_1_2sn6sn6l3lqxusi.R.inc(37143);
        __CLR4_1_2sn6sn6l3lqxusi.R.inc(37144);final MutableFloat mutNum = new MutableFloat(0f);
        __CLR4_1_2sn6sn6l3lqxusi.R.inc(37145);mutNum.setValue(null);
    }finally{__CLR4_1_2sn6sn6l3lqxusi.R.flushNeeded();}}

    @Test
    public void testNanInfinite() {__CLR4_1_2sn6sn6l3lqxusi.R.globalSliceStart(getClass().getName(),37146);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2gn0e0ssnu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2sn6sn6l3lqxusi.R.rethrow($CLV_t2$);}finally{__CLR4_1_2sn6sn6l3lqxusi.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableFloatTest.testNanInfinite",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37146,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2gn0e0ssnu(){try{__CLR4_1_2sn6sn6l3lqxusi.R.inc(37146);
        __CLR4_1_2sn6sn6l3lqxusi.R.inc(37147);MutableFloat mutNum = new MutableFloat(Float.NaN);
        __CLR4_1_2sn6sn6l3lqxusi.R.inc(37148);assertTrue(mutNum.isNaN());
        
        __CLR4_1_2sn6sn6l3lqxusi.R.inc(37149);mutNum = new MutableFloat(Float.POSITIVE_INFINITY);
        __CLR4_1_2sn6sn6l3lqxusi.R.inc(37150);assertTrue(mutNum.isInfinite());
        
        __CLR4_1_2sn6sn6l3lqxusi.R.inc(37151);mutNum = new MutableFloat(Float.NEGATIVE_INFINITY);
        __CLR4_1_2sn6sn6l3lqxusi.R.inc(37152);assertTrue(mutNum.isInfinite());
    }finally{__CLR4_1_2sn6sn6l3lqxusi.R.flushNeeded();}}

    @Test
    public void testEquals() {__CLR4_1_2sn6sn6l3lqxusi.R.globalSliceStart(getClass().getName(),37153);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2s4e608so1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2sn6sn6l3lqxusi.R.rethrow($CLV_t2$);}finally{__CLR4_1_2sn6sn6l3lqxusi.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableFloatTest.testEquals",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37153,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2s4e608so1(){try{__CLR4_1_2sn6sn6l3lqxusi.R.inc(37153);
        __CLR4_1_2sn6sn6l3lqxusi.R.inc(37154);final MutableFloat mutNumA = new MutableFloat(0f);
        __CLR4_1_2sn6sn6l3lqxusi.R.inc(37155);final MutableFloat mutNumB = new MutableFloat(0f);
        __CLR4_1_2sn6sn6l3lqxusi.R.inc(37156);final MutableFloat mutNumC = new MutableFloat(1f);

        __CLR4_1_2sn6sn6l3lqxusi.R.inc(37157);assertTrue(mutNumA.equals(mutNumA));
        __CLR4_1_2sn6sn6l3lqxusi.R.inc(37158);assertTrue(mutNumA.equals(mutNumB));
        __CLR4_1_2sn6sn6l3lqxusi.R.inc(37159);assertTrue(mutNumB.equals(mutNumA));
        __CLR4_1_2sn6sn6l3lqxusi.R.inc(37160);assertTrue(mutNumB.equals(mutNumB));
        __CLR4_1_2sn6sn6l3lqxusi.R.inc(37161);assertFalse(mutNumA.equals(mutNumC));
        __CLR4_1_2sn6sn6l3lqxusi.R.inc(37162);assertFalse(mutNumB.equals(mutNumC));
        __CLR4_1_2sn6sn6l3lqxusi.R.inc(37163);assertTrue(mutNumC.equals(mutNumC));
        __CLR4_1_2sn6sn6l3lqxusi.R.inc(37164);assertFalse(mutNumA.equals(null));
        __CLR4_1_2sn6sn6l3lqxusi.R.inc(37165);assertFalse(mutNumA.equals(Float.valueOf(0f)));
        __CLR4_1_2sn6sn6l3lqxusi.R.inc(37166);assertFalse(mutNumA.equals("0"));
    }finally{__CLR4_1_2sn6sn6l3lqxusi.R.flushNeeded();}}

    @Test
    public void testHashCode() {__CLR4_1_2sn6sn6l3lqxusi.R.globalSliceStart(getClass().getName(),37167);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_23zkhv8sof();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2sn6sn6l3lqxusi.R.rethrow($CLV_t2$);}finally{__CLR4_1_2sn6sn6l3lqxusi.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableFloatTest.testHashCode",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37167,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_23zkhv8sof(){try{__CLR4_1_2sn6sn6l3lqxusi.R.inc(37167);
        __CLR4_1_2sn6sn6l3lqxusi.R.inc(37168);final MutableFloat mutNumA = new MutableFloat(0f);
        __CLR4_1_2sn6sn6l3lqxusi.R.inc(37169);final MutableFloat mutNumB = new MutableFloat(0f);
        __CLR4_1_2sn6sn6l3lqxusi.R.inc(37170);final MutableFloat mutNumC = new MutableFloat(1f);

        __CLR4_1_2sn6sn6l3lqxusi.R.inc(37171);assertTrue(mutNumA.hashCode() == mutNumA.hashCode());
        __CLR4_1_2sn6sn6l3lqxusi.R.inc(37172);assertTrue(mutNumA.hashCode() == mutNumB.hashCode());
        __CLR4_1_2sn6sn6l3lqxusi.R.inc(37173);assertFalse(mutNumA.hashCode() == mutNumC.hashCode());
        __CLR4_1_2sn6sn6l3lqxusi.R.inc(37174);assertTrue(mutNumA.hashCode() == Float.valueOf(0f).hashCode());
    }finally{__CLR4_1_2sn6sn6l3lqxusi.R.flushNeeded();}}

    @Test
    public void testCompareTo() {__CLR4_1_2sn6sn6l3lqxusi.R.globalSliceStart(getClass().getName(),37175);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2pz6vfvson();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2sn6sn6l3lqxusi.R.rethrow($CLV_t2$);}finally{__CLR4_1_2sn6sn6l3lqxusi.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableFloatTest.testCompareTo",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37175,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2pz6vfvson(){try{__CLR4_1_2sn6sn6l3lqxusi.R.inc(37175);
        __CLR4_1_2sn6sn6l3lqxusi.R.inc(37176);final MutableFloat mutNum = new MutableFloat(0f);

        __CLR4_1_2sn6sn6l3lqxusi.R.inc(37177);assertEquals(0, mutNum.compareTo(new MutableFloat(0f)));
        __CLR4_1_2sn6sn6l3lqxusi.R.inc(37178);assertEquals(+1, mutNum.compareTo(new MutableFloat(-1f)));
        __CLR4_1_2sn6sn6l3lqxusi.R.inc(37179);assertEquals(-1, mutNum.compareTo(new MutableFloat(1f)));
    }finally{__CLR4_1_2sn6sn6l3lqxusi.R.flushNeeded();}}

    @Test(expected=NullPointerException.class)
    public void testCompareToNull() {__CLR4_1_2sn6sn6l3lqxusi.R.globalSliceStart(getClass().getName(),37180);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2g1nl0csos();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,67,111,109,112,97,114,101,84,111,78,117,108,108,58,32,91,78,117,108,108,80,111,105,110,116,101,114,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof NullPointerException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2sn6sn6l3lqxusi.R.rethrow($CLV_t2$);}finally{__CLR4_1_2sn6sn6l3lqxusi.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableFloatTest.testCompareToNull",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37180,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2g1nl0csos(){try{__CLR4_1_2sn6sn6l3lqxusi.R.inc(37180);
        __CLR4_1_2sn6sn6l3lqxusi.R.inc(37181);final MutableFloat mutNum = new MutableFloat(0f);
        __CLR4_1_2sn6sn6l3lqxusi.R.inc(37182);mutNum.compareTo(null);
    }finally{__CLR4_1_2sn6sn6l3lqxusi.R.flushNeeded();}}

    @Test
    public void testPrimitiveValues() {__CLR4_1_2sn6sn6l3lqxusi.R.globalSliceStart(getClass().getName(),37183);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2uifrysov();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2sn6sn6l3lqxusi.R.rethrow($CLV_t2$);}finally{__CLR4_1_2sn6sn6l3lqxusi.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableFloatTest.testPrimitiveValues",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37183,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2uifrysov(){try{__CLR4_1_2sn6sn6l3lqxusi.R.inc(37183);
        __CLR4_1_2sn6sn6l3lqxusi.R.inc(37184);final MutableFloat mutNum = new MutableFloat(1.7F);
        
        __CLR4_1_2sn6sn6l3lqxusi.R.inc(37185);assertEquals( 1, mutNum.intValue() );
        __CLR4_1_2sn6sn6l3lqxusi.R.inc(37186);assertEquals( 1.7, mutNum.doubleValue(), 0.00001 );
        __CLR4_1_2sn6sn6l3lqxusi.R.inc(37187);assertEquals( (byte) 1, mutNum.byteValue() );
        __CLR4_1_2sn6sn6l3lqxusi.R.inc(37188);assertEquals( (short) 1, mutNum.shortValue() );
        __CLR4_1_2sn6sn6l3lqxusi.R.inc(37189);assertEquals( 1, mutNum.intValue() );
        __CLR4_1_2sn6sn6l3lqxusi.R.inc(37190);assertEquals( 1L, mutNum.longValue() );
    }finally{__CLR4_1_2sn6sn6l3lqxusi.R.flushNeeded();}}

    @Test
    public void testToFloat() {__CLR4_1_2sn6sn6l3lqxusi.R.globalSliceStart(getClass().getName(),37191);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2uoiec6sp3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2sn6sn6l3lqxusi.R.rethrow($CLV_t2$);}finally{__CLR4_1_2sn6sn6l3lqxusi.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableFloatTest.testToFloat",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37191,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2uoiec6sp3(){try{__CLR4_1_2sn6sn6l3lqxusi.R.inc(37191);
        __CLR4_1_2sn6sn6l3lqxusi.R.inc(37192);assertEquals(Float.valueOf(0f), new MutableFloat(0f).toFloat());
        __CLR4_1_2sn6sn6l3lqxusi.R.inc(37193);assertEquals(Float.valueOf(12.3f), new MutableFloat(12.3f).toFloat());
    }finally{__CLR4_1_2sn6sn6l3lqxusi.R.flushNeeded();}}

    @Test
    public void testIncrement() {__CLR4_1_2sn6sn6l3lqxusi.R.globalSliceStart(getClass().getName(),37194);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2m6qqn0sp6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2sn6sn6l3lqxusi.R.rethrow($CLV_t2$);}finally{__CLR4_1_2sn6sn6l3lqxusi.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableFloatTest.testIncrement",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37194,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2m6qqn0sp6(){try{__CLR4_1_2sn6sn6l3lqxusi.R.inc(37194);
        __CLR4_1_2sn6sn6l3lqxusi.R.inc(37195);final MutableFloat mutNum = new MutableFloat(1);
        __CLR4_1_2sn6sn6l3lqxusi.R.inc(37196);mutNum.increment();
        
        __CLR4_1_2sn6sn6l3lqxusi.R.inc(37197);assertEquals(2, mutNum.intValue());
        __CLR4_1_2sn6sn6l3lqxusi.R.inc(37198);assertEquals(2L, mutNum.longValue());
    }finally{__CLR4_1_2sn6sn6l3lqxusi.R.flushNeeded();}}

    @Test
    public void testDecrement() {__CLR4_1_2sn6sn6l3lqxusi.R.globalSliceStart(getClass().getName(),37199);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2pripmwspb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2sn6sn6l3lqxusi.R.rethrow($CLV_t2$);}finally{__CLR4_1_2sn6sn6l3lqxusi.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableFloatTest.testDecrement",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37199,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2pripmwspb(){try{__CLR4_1_2sn6sn6l3lqxusi.R.inc(37199);
        __CLR4_1_2sn6sn6l3lqxusi.R.inc(37200);final MutableFloat mutNum = new MutableFloat(1);
        __CLR4_1_2sn6sn6l3lqxusi.R.inc(37201);mutNum.decrement();
        
        __CLR4_1_2sn6sn6l3lqxusi.R.inc(37202);assertEquals(0, mutNum.intValue());
        __CLR4_1_2sn6sn6l3lqxusi.R.inc(37203);assertEquals(0L, mutNum.longValue());
    }finally{__CLR4_1_2sn6sn6l3lqxusi.R.flushNeeded();}}

    @Test
    public void testAddValuePrimitive() {__CLR4_1_2sn6sn6l3lqxusi.R.globalSliceStart(getClass().getName(),37204);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2nrme6sspg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2sn6sn6l3lqxusi.R.rethrow($CLV_t2$);}finally{__CLR4_1_2sn6sn6l3lqxusi.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableFloatTest.testAddValuePrimitive",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37204,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2nrme6sspg(){try{__CLR4_1_2sn6sn6l3lqxusi.R.inc(37204);
        __CLR4_1_2sn6sn6l3lqxusi.R.inc(37205);final MutableFloat mutNum = new MutableFloat(1);
        __CLR4_1_2sn6sn6l3lqxusi.R.inc(37206);mutNum.add(1.1f);
        
        __CLR4_1_2sn6sn6l3lqxusi.R.inc(37207);assertEquals(2.1f, mutNum.floatValue(), 0.01f);
    }finally{__CLR4_1_2sn6sn6l3lqxusi.R.flushNeeded();}}

    @Test
    public void testAddValueObject() {__CLR4_1_2sn6sn6l3lqxusi.R.globalSliceStart(getClass().getName(),37208);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2cu6v3sspk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2sn6sn6l3lqxusi.R.rethrow($CLV_t2$);}finally{__CLR4_1_2sn6sn6l3lqxusi.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableFloatTest.testAddValueObject",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37208,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2cu6v3sspk(){try{__CLR4_1_2sn6sn6l3lqxusi.R.inc(37208);
        __CLR4_1_2sn6sn6l3lqxusi.R.inc(37209);final MutableFloat mutNum = new MutableFloat(1);
        __CLR4_1_2sn6sn6l3lqxusi.R.inc(37210);mutNum.add(Float.valueOf(1.1f));
        
        __CLR4_1_2sn6sn6l3lqxusi.R.inc(37211);assertEquals(2.1f, mutNum.floatValue(), 0.01f);
    }finally{__CLR4_1_2sn6sn6l3lqxusi.R.flushNeeded();}}

    @Test
    public void testSubtractValuePrimitive() {__CLR4_1_2sn6sn6l3lqxusi.R.globalSliceStart(getClass().getName(),37212);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2w07icjspo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2sn6sn6l3lqxusi.R.rethrow($CLV_t2$);}finally{__CLR4_1_2sn6sn6l3lqxusi.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableFloatTest.testSubtractValuePrimitive",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37212,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2w07icjspo(){try{__CLR4_1_2sn6sn6l3lqxusi.R.inc(37212);
        __CLR4_1_2sn6sn6l3lqxusi.R.inc(37213);final MutableFloat mutNum = new MutableFloat(1);
        __CLR4_1_2sn6sn6l3lqxusi.R.inc(37214);mutNum.subtract(0.9f);
        
        __CLR4_1_2sn6sn6l3lqxusi.R.inc(37215);assertEquals(0.1f, mutNum.floatValue(), 0.01f);
    }finally{__CLR4_1_2sn6sn6l3lqxusi.R.flushNeeded();}}

    @Test
    public void testSubtractValueObject() {__CLR4_1_2sn6sn6l3lqxusi.R.globalSliceStart(getClass().getName(),37216);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2xnns6psps();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2sn6sn6l3lqxusi.R.rethrow($CLV_t2$);}finally{__CLR4_1_2sn6sn6l3lqxusi.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableFloatTest.testSubtractValueObject",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37216,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2xnns6psps(){try{__CLR4_1_2sn6sn6l3lqxusi.R.inc(37216);
        __CLR4_1_2sn6sn6l3lqxusi.R.inc(37217);final MutableFloat mutNum = new MutableFloat(1);
        __CLR4_1_2sn6sn6l3lqxusi.R.inc(37218);mutNum.subtract(Float.valueOf(0.9f));
        
        __CLR4_1_2sn6sn6l3lqxusi.R.inc(37219);assertEquals(0.1f, mutNum.floatValue(), 0.01f);
    }finally{__CLR4_1_2sn6sn6l3lqxusi.R.flushNeeded();}}

    @Test
    public void testToString() {__CLR4_1_2sn6sn6l3lqxusi.R.globalSliceStart(getClass().getName(),37220);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2hrxdidspw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2sn6sn6l3lqxusi.R.rethrow($CLV_t2$);}finally{__CLR4_1_2sn6sn6l3lqxusi.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.mutable.MutableFloatTest.testToString",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),37220,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2hrxdidspw(){try{__CLR4_1_2sn6sn6l3lqxusi.R.inc(37220);
        __CLR4_1_2sn6sn6l3lqxusi.R.inc(37221);assertEquals("0.0", new MutableFloat(0f).toString());
        __CLR4_1_2sn6sn6l3lqxusi.R.inc(37222);assertEquals("10.0", new MutableFloat(10f).toString());
        __CLR4_1_2sn6sn6l3lqxusi.R.inc(37223);assertEquals("-123.0", new MutableFloat(-123f).toString());
    }finally{__CLR4_1_2sn6sn6l3lqxusi.R.flushNeeded();}}

}
