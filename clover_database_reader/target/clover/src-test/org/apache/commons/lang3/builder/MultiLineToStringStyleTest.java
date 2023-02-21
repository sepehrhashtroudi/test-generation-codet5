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
package org.apache.commons.lang3.builder;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;

import org.apache.commons.lang3.SystemUtils;
import org.apache.commons.lang3.builder.ToStringStyleTest.Person;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit tests {@link org.apache.commons.lang3.builder.MultiLineToStringStyleTest}.
 *
 * @version $Id$
 */
public class MultiLineToStringStyleTest {static class __CLR4_1_2p4ep4el3lqxue1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492830024L,8589935092L,32617,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final Integer base = Integer.valueOf(5);
    private final String baseStr = base.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(base));
    
    @Before
    public void setUp() throws Exception {try{__CLR4_1_2p4ep4el3lqxue1.R.inc(32558);
        __CLR4_1_2p4ep4el3lqxue1.R.inc(32559);ToStringBuilder.setDefaultStyle(ToStringStyle.MULTI_LINE_STYLE);
    }finally{__CLR4_1_2p4ep4el3lqxue1.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_1_2p4ep4el3lqxue1.R.inc(32560);
        __CLR4_1_2p4ep4el3lqxue1.R.inc(32561);ToStringBuilder.setDefaultStyle(ToStringStyle.DEFAULT_STYLE);
    }finally{__CLR4_1_2p4ep4el3lqxue1.R.flushNeeded();}}

    //----------------------------------------------------------------

    @Test
    public void testBlank() {__CLR4_1_2p4ep4el3lqxue1.R.globalSliceStart(getClass().getName(),32562);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2s7z6qxp4i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2p4ep4el3lqxue1.R.rethrow($CLV_t2$);}finally{__CLR4_1_2p4ep4el3lqxue1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.MultiLineToStringStyleTest.testBlank",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32562,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2s7z6qxp4i(){try{__CLR4_1_2p4ep4el3lqxue1.R.inc(32562);
        __CLR4_1_2p4ep4el3lqxue1.R.inc(32563);assertEquals(baseStr + "[" + SystemUtils.LINE_SEPARATOR + "]", new ToStringBuilder(base).toString());
    }finally{__CLR4_1_2p4ep4el3lqxue1.R.flushNeeded();}}

    @Test
    public void testAppendSuper() {__CLR4_1_2p4ep4el3lqxue1.R.globalSliceStart(getClass().getName(),32564);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2cvyfiip4k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2p4ep4el3lqxue1.R.rethrow($CLV_t2$);}finally{__CLR4_1_2p4ep4el3lqxue1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.MultiLineToStringStyleTest.testAppendSuper",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32564,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2cvyfiip4k(){try{__CLR4_1_2p4ep4el3lqxue1.R.inc(32564);
        __CLR4_1_2p4ep4el3lqxue1.R.inc(32565);assertEquals(baseStr + "[" + SystemUtils.LINE_SEPARATOR + "]", new ToStringBuilder(base).appendSuper("Integer@8888[" + SystemUtils.LINE_SEPARATOR + "]").toString());
        __CLR4_1_2p4ep4el3lqxue1.R.inc(32566);assertEquals(baseStr + "[" + SystemUtils.LINE_SEPARATOR + "  <null>" + SystemUtils.LINE_SEPARATOR + "]", new ToStringBuilder(base).appendSuper("Integer@8888[" + SystemUtils.LINE_SEPARATOR + "  <null>" + SystemUtils.LINE_SEPARATOR + "]").toString());
        
        __CLR4_1_2p4ep4el3lqxue1.R.inc(32567);assertEquals(baseStr + "[" + SystemUtils.LINE_SEPARATOR + "  a=hello" + SystemUtils.LINE_SEPARATOR + "]", new ToStringBuilder(base).appendSuper("Integer@8888[" + SystemUtils.LINE_SEPARATOR + "]").append("a", "hello").toString());
        __CLR4_1_2p4ep4el3lqxue1.R.inc(32568);assertEquals(baseStr + "[" + SystemUtils.LINE_SEPARATOR + "  <null>" + SystemUtils.LINE_SEPARATOR + "  a=hello" + SystemUtils.LINE_SEPARATOR + "]", new ToStringBuilder(base).appendSuper("Integer@8888[" + SystemUtils.LINE_SEPARATOR + "  <null>" + SystemUtils.LINE_SEPARATOR + "]").append("a", "hello").toString());
        __CLR4_1_2p4ep4el3lqxue1.R.inc(32569);assertEquals(baseStr + "[" + SystemUtils.LINE_SEPARATOR + "  a=hello" + SystemUtils.LINE_SEPARATOR + "]", new ToStringBuilder(base).appendSuper(null).append("a", "hello").toString());
    }finally{__CLR4_1_2p4ep4el3lqxue1.R.flushNeeded();}}
    
    @Test
    public void testObject() {__CLR4_1_2p4ep4el3lqxue1.R.globalSliceStart(getClass().getName(),32570);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2iogga0p4q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2p4ep4el3lqxue1.R.rethrow($CLV_t2$);}finally{__CLR4_1_2p4ep4el3lqxue1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.MultiLineToStringStyleTest.testObject",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32570,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2iogga0p4q(){try{__CLR4_1_2p4ep4el3lqxue1.R.inc(32570);
        __CLR4_1_2p4ep4el3lqxue1.R.inc(32571);final Integer i3 = Integer.valueOf(3);
        __CLR4_1_2p4ep4el3lqxue1.R.inc(32572);final Integer i4 = Integer.valueOf(4);
        __CLR4_1_2p4ep4el3lqxue1.R.inc(32573);assertEquals(baseStr + "[" + SystemUtils.LINE_SEPARATOR + "  <null>" + SystemUtils.LINE_SEPARATOR + "]", new ToStringBuilder(base).append((Object) null).toString());
        __CLR4_1_2p4ep4el3lqxue1.R.inc(32574);assertEquals(baseStr + "[" + SystemUtils.LINE_SEPARATOR + "  3" + SystemUtils.LINE_SEPARATOR + "]", new ToStringBuilder(base).append(i3).toString());
        __CLR4_1_2p4ep4el3lqxue1.R.inc(32575);assertEquals(baseStr + "[" + SystemUtils.LINE_SEPARATOR + "  a=<null>" + SystemUtils.LINE_SEPARATOR + "]", new ToStringBuilder(base).append("a", (Object) null).toString());
        __CLR4_1_2p4ep4el3lqxue1.R.inc(32576);assertEquals(baseStr + "[" + SystemUtils.LINE_SEPARATOR + "  a=3" + SystemUtils.LINE_SEPARATOR + "]", new ToStringBuilder(base).append("a", i3).toString());
        __CLR4_1_2p4ep4el3lqxue1.R.inc(32577);assertEquals(baseStr + "[" + SystemUtils.LINE_SEPARATOR + "  a=3" + SystemUtils.LINE_SEPARATOR + "  b=4" + SystemUtils.LINE_SEPARATOR + "]", new ToStringBuilder(base).append("a", i3).append("b", i4).toString());
        __CLR4_1_2p4ep4el3lqxue1.R.inc(32578);assertEquals(baseStr + "[" + SystemUtils.LINE_SEPARATOR + "  a=<Integer>" + SystemUtils.LINE_SEPARATOR + "]", new ToStringBuilder(base).append("a", i3, false).toString());
        __CLR4_1_2p4ep4el3lqxue1.R.inc(32579);assertEquals(baseStr + "[" + SystemUtils.LINE_SEPARATOR + "  a=<size=0>" + SystemUtils.LINE_SEPARATOR + "]", new ToStringBuilder(base).append("a", new ArrayList<Object>(), false).toString());
        __CLR4_1_2p4ep4el3lqxue1.R.inc(32580);assertEquals(baseStr + "[" + SystemUtils.LINE_SEPARATOR + "  a=[]" + SystemUtils.LINE_SEPARATOR + "]", new ToStringBuilder(base).append("a", new ArrayList<Object>(), true).toString());
        __CLR4_1_2p4ep4el3lqxue1.R.inc(32581);assertEquals(baseStr + "[" + SystemUtils.LINE_SEPARATOR + "  a=<size=0>" + SystemUtils.LINE_SEPARATOR + "]", new ToStringBuilder(base).append("a", new HashMap<Object, Object>(), false).toString());
        __CLR4_1_2p4ep4el3lqxue1.R.inc(32582);assertEquals(baseStr + "[" + SystemUtils.LINE_SEPARATOR + "  a={}" + SystemUtils.LINE_SEPARATOR + "]", new ToStringBuilder(base).append("a", new HashMap<Object, Object>(), true).toString());
        __CLR4_1_2p4ep4el3lqxue1.R.inc(32583);assertEquals(baseStr + "[" + SystemUtils.LINE_SEPARATOR + "  a=<size=0>" + SystemUtils.LINE_SEPARATOR + "]", new ToStringBuilder(base).append("a", (Object) new String[0], false).toString());
        __CLR4_1_2p4ep4el3lqxue1.R.inc(32584);assertEquals(baseStr + "[" + SystemUtils.LINE_SEPARATOR + "  a={}" + SystemUtils.LINE_SEPARATOR + "]", new ToStringBuilder(base).append("a", (Object) new String[0], true).toString());
    }finally{__CLR4_1_2p4ep4el3lqxue1.R.flushNeeded();}}

    @Test
    public void testPerson() {__CLR4_1_2p4ep4el3lqxue1.R.globalSliceStart(getClass().getName(),32585);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2rmqmmqp55();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2p4ep4el3lqxue1.R.rethrow($CLV_t2$);}finally{__CLR4_1_2p4ep4el3lqxue1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.MultiLineToStringStyleTest.testPerson",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32585,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2rmqmmqp55(){try{__CLR4_1_2p4ep4el3lqxue1.R.inc(32585);
        __CLR4_1_2p4ep4el3lqxue1.R.inc(32586);final Person p = new Person();
        __CLR4_1_2p4ep4el3lqxue1.R.inc(32587);p.name = "Jane Doe";
        __CLR4_1_2p4ep4el3lqxue1.R.inc(32588);p.age = 25;
        __CLR4_1_2p4ep4el3lqxue1.R.inc(32589);p.smoker = true;
        __CLR4_1_2p4ep4el3lqxue1.R.inc(32590);final String pBaseStr = p.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(p));
        __CLR4_1_2p4ep4el3lqxue1.R.inc(32591);assertEquals(pBaseStr + "[" + SystemUtils.LINE_SEPARATOR + "  name=Jane Doe" + SystemUtils.LINE_SEPARATOR + "  age=25" + SystemUtils.LINE_SEPARATOR + "  smoker=true" + SystemUtils.LINE_SEPARATOR + "]", new ToStringBuilder(p).append("name", p.name).append("age", p.age).append("smoker", p.smoker).toString());
    }finally{__CLR4_1_2p4ep4el3lqxue1.R.flushNeeded();}}

    @Test
    public void testLong() {__CLR4_1_2p4ep4el3lqxue1.R.globalSliceStart(getClass().getName(),32592);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2xsq9mzp5c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2p4ep4el3lqxue1.R.rethrow($CLV_t2$);}finally{__CLR4_1_2p4ep4el3lqxue1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.MultiLineToStringStyleTest.testLong",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32592,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2xsq9mzp5c(){try{__CLR4_1_2p4ep4el3lqxue1.R.inc(32592);
        __CLR4_1_2p4ep4el3lqxue1.R.inc(32593);assertEquals(baseStr + "[" + SystemUtils.LINE_SEPARATOR + "  3" + SystemUtils.LINE_SEPARATOR + "]", new ToStringBuilder(base).append(3L).toString());
        __CLR4_1_2p4ep4el3lqxue1.R.inc(32594);assertEquals(baseStr + "[" + SystemUtils.LINE_SEPARATOR + "  a=3" + SystemUtils.LINE_SEPARATOR + "]", new ToStringBuilder(base).append("a", 3L).toString());
        __CLR4_1_2p4ep4el3lqxue1.R.inc(32595);assertEquals(baseStr + "[" + SystemUtils.LINE_SEPARATOR + "  a=3" + SystemUtils.LINE_SEPARATOR + "  b=4" + SystemUtils.LINE_SEPARATOR + "]", new ToStringBuilder(base).append("a", 3L).append("b", 4L).toString());
    }finally{__CLR4_1_2p4ep4el3lqxue1.R.flushNeeded();}}

    @Test
    public void testObjectArray() {__CLR4_1_2p4ep4el3lqxue1.R.globalSliceStart(getClass().getName(),32596);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2oi04a7p5g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2p4ep4el3lqxue1.R.rethrow($CLV_t2$);}finally{__CLR4_1_2p4ep4el3lqxue1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.MultiLineToStringStyleTest.testObjectArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32596,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2oi04a7p5g(){try{__CLR4_1_2p4ep4el3lqxue1.R.inc(32596);
        __CLR4_1_2p4ep4el3lqxue1.R.inc(32597);Object[] array = new Object[] {null, base, new int[] {3, 6}};
        __CLR4_1_2p4ep4el3lqxue1.R.inc(32598);assertEquals(baseStr + "[" + SystemUtils.LINE_SEPARATOR + "  {<null>,5,{3,6}}" + SystemUtils.LINE_SEPARATOR + "]", new ToStringBuilder(base).append(array).toString());
        __CLR4_1_2p4ep4el3lqxue1.R.inc(32599);assertEquals(baseStr + "[" + SystemUtils.LINE_SEPARATOR + "  {<null>,5,{3,6}}" + SystemUtils.LINE_SEPARATOR + "]", new ToStringBuilder(base).append((Object) array).toString());
        __CLR4_1_2p4ep4el3lqxue1.R.inc(32600);array = null;
        __CLR4_1_2p4ep4el3lqxue1.R.inc(32601);assertEquals(baseStr + "[" + SystemUtils.LINE_SEPARATOR + "  <null>" + SystemUtils.LINE_SEPARATOR + "]", new ToStringBuilder(base).append(array).toString());
        __CLR4_1_2p4ep4el3lqxue1.R.inc(32602);assertEquals(baseStr + "[" + SystemUtils.LINE_SEPARATOR + "  <null>" + SystemUtils.LINE_SEPARATOR + "]", new ToStringBuilder(base).append((Object) array).toString());
    }finally{__CLR4_1_2p4ep4el3lqxue1.R.flushNeeded();}}

    @Test
    public void testLongArray() {__CLR4_1_2p4ep4el3lqxue1.R.globalSliceStart(getClass().getName(),32603);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2if58i6p5n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2p4ep4el3lqxue1.R.rethrow($CLV_t2$);}finally{__CLR4_1_2p4ep4el3lqxue1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.MultiLineToStringStyleTest.testLongArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32603,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2if58i6p5n(){try{__CLR4_1_2p4ep4el3lqxue1.R.inc(32603);
        __CLR4_1_2p4ep4el3lqxue1.R.inc(32604);long[] array = new long[] {1, 2, -3, 4};
        __CLR4_1_2p4ep4el3lqxue1.R.inc(32605);assertEquals(baseStr + "[" + SystemUtils.LINE_SEPARATOR + "  {1,2,-3,4}" + SystemUtils.LINE_SEPARATOR + "]", new ToStringBuilder(base).append(array).toString());
        __CLR4_1_2p4ep4el3lqxue1.R.inc(32606);assertEquals(baseStr + "[" + SystemUtils.LINE_SEPARATOR + "  {1,2,-3,4}" + SystemUtils.LINE_SEPARATOR + "]", new ToStringBuilder(base).append((Object) array).toString());
        __CLR4_1_2p4ep4el3lqxue1.R.inc(32607);array = null;
        __CLR4_1_2p4ep4el3lqxue1.R.inc(32608);assertEquals(baseStr + "[" + SystemUtils.LINE_SEPARATOR + "  <null>" + SystemUtils.LINE_SEPARATOR + "]", new ToStringBuilder(base).append(array).toString());
        __CLR4_1_2p4ep4el3lqxue1.R.inc(32609);assertEquals(baseStr + "[" + SystemUtils.LINE_SEPARATOR + "  <null>" + SystemUtils.LINE_SEPARATOR + "]", new ToStringBuilder(base).append((Object) array).toString());
    }finally{__CLR4_1_2p4ep4el3lqxue1.R.flushNeeded();}}

    @Test
    public void testLongArrayArray() {__CLR4_1_2p4ep4el3lqxue1.R.globalSliceStart(getClass().getName(),32610);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2xbpkglp5u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2p4ep4el3lqxue1.R.rethrow($CLV_t2$);}finally{__CLR4_1_2p4ep4el3lqxue1.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.MultiLineToStringStyleTest.testLongArrayArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32610,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2xbpkglp5u(){try{__CLR4_1_2p4ep4el3lqxue1.R.inc(32610);
        __CLR4_1_2p4ep4el3lqxue1.R.inc(32611);long[][] array = new long[][] {{1, 2}, null, {5}};
        __CLR4_1_2p4ep4el3lqxue1.R.inc(32612);assertEquals(baseStr + "[" + SystemUtils.LINE_SEPARATOR + "  {{1,2},<null>,{5}}" + SystemUtils.LINE_SEPARATOR + "]", new ToStringBuilder(base).append(array).toString());
        __CLR4_1_2p4ep4el3lqxue1.R.inc(32613);assertEquals(baseStr + "[" + SystemUtils.LINE_SEPARATOR + "  {{1,2},<null>,{5}}" + SystemUtils.LINE_SEPARATOR + "]", new ToStringBuilder(base).append((Object) array).toString());
        __CLR4_1_2p4ep4el3lqxue1.R.inc(32614);array = null;
        __CLR4_1_2p4ep4el3lqxue1.R.inc(32615);assertEquals(baseStr + "[" + SystemUtils.LINE_SEPARATOR + "  <null>" + SystemUtils.LINE_SEPARATOR + "]", new ToStringBuilder(base).append(array).toString());
        __CLR4_1_2p4ep4el3lqxue1.R.inc(32616);assertEquals(baseStr + "[" + SystemUtils.LINE_SEPARATOR + "  <null>" + SystemUtils.LINE_SEPARATOR + "]", new ToStringBuilder(base).append((Object) array).toString());
    }finally{__CLR4_1_2p4ep4el3lqxue1.R.flushNeeded();}}

}
