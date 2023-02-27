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

import org.apache.commons.lang3.builder.ToStringStyleTest.Person;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit tests {@link org.apache.commons.lang3.builder.ToStringStyle#SHORT_PREFIX_STYLE}.
 * 
 * @version $Id$
 */
public class ShortPrefixToStringStyleTest {static class __CLR4_1_2pahpahl3lqxuff{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492830024L,8589935092L,32836,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final Integer base = Integer.valueOf(5);
    private final String baseStr = "Integer";
    
    @Before
    public void setUp() throws Exception {try{__CLR4_1_2pahpahl3lqxuff.R.inc(32777);
        __CLR4_1_2pahpahl3lqxuff.R.inc(32778);ToStringBuilder.setDefaultStyle(ToStringStyle.SHORT_PREFIX_STYLE);
    }finally{__CLR4_1_2pahpahl3lqxuff.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_1_2pahpahl3lqxuff.R.inc(32779);
        __CLR4_1_2pahpahl3lqxuff.R.inc(32780);ToStringBuilder.setDefaultStyle(ToStringStyle.DEFAULT_STYLE);
    }finally{__CLR4_1_2pahpahl3lqxuff.R.flushNeeded();}}

    //----------------------------------------------------------------
    
    @Test
    public void testBlank() {__CLR4_1_2pahpahl3lqxuff.R.globalSliceStart(getClass().getName(),32781);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2s7z6qxpal();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pahpahl3lqxuff.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pahpahl3lqxuff.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ShortPrefixToStringStyleTest.testBlank",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32781,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2s7z6qxpal(){try{__CLR4_1_2pahpahl3lqxuff.R.inc(32781);
        __CLR4_1_2pahpahl3lqxuff.R.inc(32782);assertEquals(baseStr + "[]", new ToStringBuilder(base).toString());
    }finally{__CLR4_1_2pahpahl3lqxuff.R.flushNeeded();}}

    @Test
    public void testAppendSuper() {__CLR4_1_2pahpahl3lqxuff.R.globalSliceStart(getClass().getName(),32783);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2cvyfiipan();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pahpahl3lqxuff.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pahpahl3lqxuff.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ShortPrefixToStringStyleTest.testAppendSuper",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32783,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2cvyfiipan(){try{__CLR4_1_2pahpahl3lqxuff.R.inc(32783);
        __CLR4_1_2pahpahl3lqxuff.R.inc(32784);assertEquals(baseStr + "[]", new ToStringBuilder(base).appendSuper("Integer@8888[]").toString());
        __CLR4_1_2pahpahl3lqxuff.R.inc(32785);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).appendSuper("Integer@8888[<null>]").toString());
        
        __CLR4_1_2pahpahl3lqxuff.R.inc(32786);assertEquals(baseStr + "[a=hello]", new ToStringBuilder(base).appendSuper("Integer@8888[]").append("a", "hello").toString());
        __CLR4_1_2pahpahl3lqxuff.R.inc(32787);assertEquals(baseStr + "[<null>,a=hello]", new ToStringBuilder(base).appendSuper("Integer@8888[<null>]").append("a", "hello").toString());
        __CLR4_1_2pahpahl3lqxuff.R.inc(32788);assertEquals(baseStr + "[a=hello]", new ToStringBuilder(base).appendSuper(null).append("a", "hello").toString());
    }finally{__CLR4_1_2pahpahl3lqxuff.R.flushNeeded();}}
    
    @Test
    public void testObject() {__CLR4_1_2pahpahl3lqxuff.R.globalSliceStart(getClass().getName(),32789);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2iogga0pat();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pahpahl3lqxuff.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pahpahl3lqxuff.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ShortPrefixToStringStyleTest.testObject",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32789,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2iogga0pat(){try{__CLR4_1_2pahpahl3lqxuff.R.inc(32789);
        __CLR4_1_2pahpahl3lqxuff.R.inc(32790);final Integer i3 = Integer.valueOf(3);
        __CLR4_1_2pahpahl3lqxuff.R.inc(32791);final Integer i4 = Integer.valueOf(4);
        __CLR4_1_2pahpahl3lqxuff.R.inc(32792);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).append((Object) null).toString());
        __CLR4_1_2pahpahl3lqxuff.R.inc(32793);assertEquals(baseStr + "[3]", new ToStringBuilder(base).append(i3).toString());
        __CLR4_1_2pahpahl3lqxuff.R.inc(32794);assertEquals(baseStr + "[a=<null>]", new ToStringBuilder(base).append("a", (Object) null).toString());
        __CLR4_1_2pahpahl3lqxuff.R.inc(32795);assertEquals(baseStr + "[a=3]", new ToStringBuilder(base).append("a", i3).toString());
        __CLR4_1_2pahpahl3lqxuff.R.inc(32796);assertEquals(baseStr + "[a=3,b=4]", new ToStringBuilder(base).append("a", i3).append("b", i4).toString());
        __CLR4_1_2pahpahl3lqxuff.R.inc(32797);assertEquals(baseStr + "[a=<Integer>]", new ToStringBuilder(base).append("a", i3, false).toString());
        __CLR4_1_2pahpahl3lqxuff.R.inc(32798);assertEquals(baseStr + "[a=<size=0>]", new ToStringBuilder(base).append("a", new ArrayList<Object>(), false).toString());
        __CLR4_1_2pahpahl3lqxuff.R.inc(32799);assertEquals(baseStr + "[a=[]]", new ToStringBuilder(base).append("a", new ArrayList<Object>(), true).toString());
        __CLR4_1_2pahpahl3lqxuff.R.inc(32800);assertEquals(baseStr + "[a=<size=0>]", new ToStringBuilder(base).append("a", new HashMap<Object, Object>(), false).toString());
        __CLR4_1_2pahpahl3lqxuff.R.inc(32801);assertEquals(baseStr + "[a={}]", new ToStringBuilder(base).append("a", new HashMap<Object, Object>(), true).toString());
        __CLR4_1_2pahpahl3lqxuff.R.inc(32802);assertEquals(baseStr + "[a=<size=0>]", new ToStringBuilder(base).append("a", (Object) new String[0], false).toString());
        __CLR4_1_2pahpahl3lqxuff.R.inc(32803);assertEquals(baseStr + "[a={}]", new ToStringBuilder(base).append("a", (Object) new String[0], true).toString());
    }finally{__CLR4_1_2pahpahl3lqxuff.R.flushNeeded();}}

    @Test
    public void testPerson() {__CLR4_1_2pahpahl3lqxuff.R.globalSliceStart(getClass().getName(),32804);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2rmqmmqpb8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pahpahl3lqxuff.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pahpahl3lqxuff.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ShortPrefixToStringStyleTest.testPerson",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32804,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2rmqmmqpb8(){try{__CLR4_1_2pahpahl3lqxuff.R.inc(32804);
        __CLR4_1_2pahpahl3lqxuff.R.inc(32805);final Person p = new Person();
        __CLR4_1_2pahpahl3lqxuff.R.inc(32806);p.name = "John Q. Public";
        __CLR4_1_2pahpahl3lqxuff.R.inc(32807);p.age = 45;
        __CLR4_1_2pahpahl3lqxuff.R.inc(32808);p.smoker = true;
        __CLR4_1_2pahpahl3lqxuff.R.inc(32809);final String pBaseStr = "ToStringStyleTest.Person";
        __CLR4_1_2pahpahl3lqxuff.R.inc(32810);assertEquals(pBaseStr + "[name=John Q. Public,age=45,smoker=true]", new ToStringBuilder(p).append("name", p.name).append("age", p.age).append("smoker", p.smoker).toString());
    }finally{__CLR4_1_2pahpahl3lqxuff.R.flushNeeded();}}

    @Test
    public void testLong() {__CLR4_1_2pahpahl3lqxuff.R.globalSliceStart(getClass().getName(),32811);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2xsq9mzpbf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pahpahl3lqxuff.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pahpahl3lqxuff.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ShortPrefixToStringStyleTest.testLong",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32811,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2xsq9mzpbf(){try{__CLR4_1_2pahpahl3lqxuff.R.inc(32811);
        __CLR4_1_2pahpahl3lqxuff.R.inc(32812);assertEquals(baseStr + "[3]", new ToStringBuilder(base).append(3L).toString());
        __CLR4_1_2pahpahl3lqxuff.R.inc(32813);assertEquals(baseStr + "[a=3]", new ToStringBuilder(base).append("a", 3L).toString());
        __CLR4_1_2pahpahl3lqxuff.R.inc(32814);assertEquals(baseStr + "[a=3,b=4]", new ToStringBuilder(base).append("a", 3L).append("b", 4L).toString());
    }finally{__CLR4_1_2pahpahl3lqxuff.R.flushNeeded();}}

    @Test
    public void testObjectArray() {__CLR4_1_2pahpahl3lqxuff.R.globalSliceStart(getClass().getName(),32815);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2oi04a7pbj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pahpahl3lqxuff.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pahpahl3lqxuff.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ShortPrefixToStringStyleTest.testObjectArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32815,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2oi04a7pbj(){try{__CLR4_1_2pahpahl3lqxuff.R.inc(32815);
        __CLR4_1_2pahpahl3lqxuff.R.inc(32816);Object[] array = new Object[] {null, base, new int[] {3, 6}};
        __CLR4_1_2pahpahl3lqxuff.R.inc(32817);assertEquals(baseStr + "[{<null>,5,{3,6}}]", new ToStringBuilder(base).append(array).toString());
        __CLR4_1_2pahpahl3lqxuff.R.inc(32818);assertEquals(baseStr + "[{<null>,5,{3,6}}]", new ToStringBuilder(base).append((Object) array).toString());
        __CLR4_1_2pahpahl3lqxuff.R.inc(32819);array = null;
        __CLR4_1_2pahpahl3lqxuff.R.inc(32820);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).append(array).toString());
        __CLR4_1_2pahpahl3lqxuff.R.inc(32821);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).append((Object) array).toString());
    }finally{__CLR4_1_2pahpahl3lqxuff.R.flushNeeded();}}

    @Test
    public void testLongArray() {__CLR4_1_2pahpahl3lqxuff.R.globalSliceStart(getClass().getName(),32822);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2if58i6pbq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pahpahl3lqxuff.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pahpahl3lqxuff.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ShortPrefixToStringStyleTest.testLongArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32822,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2if58i6pbq(){try{__CLR4_1_2pahpahl3lqxuff.R.inc(32822);
        __CLR4_1_2pahpahl3lqxuff.R.inc(32823);long[] array = new long[] {1, 2, -3, 4};
        __CLR4_1_2pahpahl3lqxuff.R.inc(32824);assertEquals(baseStr + "[{1,2,-3,4}]", new ToStringBuilder(base).append(array).toString());
        __CLR4_1_2pahpahl3lqxuff.R.inc(32825);assertEquals(baseStr + "[{1,2,-3,4}]", new ToStringBuilder(base).append((Object) array).toString());
        __CLR4_1_2pahpahl3lqxuff.R.inc(32826);array = null;
        __CLR4_1_2pahpahl3lqxuff.R.inc(32827);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).append(array).toString());
        __CLR4_1_2pahpahl3lqxuff.R.inc(32828);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).append((Object) array).toString());
    }finally{__CLR4_1_2pahpahl3lqxuff.R.flushNeeded();}}

    @Test
    public void testLongArrayArray() {__CLR4_1_2pahpahl3lqxuff.R.globalSliceStart(getClass().getName(),32829);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2xbpkglpbx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pahpahl3lqxuff.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pahpahl3lqxuff.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ShortPrefixToStringStyleTest.testLongArrayArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32829,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2xbpkglpbx(){try{__CLR4_1_2pahpahl3lqxuff.R.inc(32829);
        __CLR4_1_2pahpahl3lqxuff.R.inc(32830);long[][] array = new long[][] {{1, 2}, null, {5}};
        __CLR4_1_2pahpahl3lqxuff.R.inc(32831);assertEquals(baseStr + "[{{1,2},<null>,{5}}]", new ToStringBuilder(base).append(array).toString());
        __CLR4_1_2pahpahl3lqxuff.R.inc(32832);assertEquals(baseStr + "[{{1,2},<null>,{5}}]", new ToStringBuilder(base).append((Object) array).toString());
        __CLR4_1_2pahpahl3lqxuff.R.inc(32833);array = null;
        __CLR4_1_2pahpahl3lqxuff.R.inc(32834);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).append(array).toString());
        __CLR4_1_2pahpahl3lqxuff.R.inc(32835);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).append((Object) array).toString());
    }finally{__CLR4_1_2pahpahl3lqxuff.R.flushNeeded();}}
    
}
