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
 * Unit tests {@link org.apache.commons.lang3.builder.DefaultToStringStyleTest}.
 *
 * @version $Id$
 */
public class DefaultToStringStyleTest {static class __CLR4_1_2o7xo7xl3lqxu95{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492830024L,8589935092L,31448,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final Integer base = Integer.valueOf(5);
    private final String baseStr = base.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(base));
    
    @Before
    public void setUp() throws Exception {try{__CLR4_1_2o7xo7xl3lqxu95.R.inc(31389);
        __CLR4_1_2o7xo7xl3lqxu95.R.inc(31390);ToStringBuilder.setDefaultStyle(ToStringStyle.DEFAULT_STYLE);
    }finally{__CLR4_1_2o7xo7xl3lqxu95.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_1_2o7xo7xl3lqxu95.R.inc(31391);
        __CLR4_1_2o7xo7xl3lqxu95.R.inc(31392);ToStringBuilder.setDefaultStyle(ToStringStyle.DEFAULT_STYLE);
    }finally{__CLR4_1_2o7xo7xl3lqxu95.R.flushNeeded();}}

    //----------------------------------------------------------------
    
    @Test
    public void testBlank() {__CLR4_1_2o7xo7xl3lqxu95.R.globalSliceStart(getClass().getName(),31393);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2s7z6qxo81();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2o7xo7xl3lqxu95.R.rethrow($CLV_t2$);}finally{__CLR4_1_2o7xo7xl3lqxu95.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.DefaultToStringStyleTest.testBlank",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),31393,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2s7z6qxo81(){try{__CLR4_1_2o7xo7xl3lqxu95.R.inc(31393);
        __CLR4_1_2o7xo7xl3lqxu95.R.inc(31394);assertEquals(baseStr + "[]", new ToStringBuilder(base).toString());
    }finally{__CLR4_1_2o7xo7xl3lqxu95.R.flushNeeded();}}

    @Test
    public void testAppendSuper() {__CLR4_1_2o7xo7xl3lqxu95.R.globalSliceStart(getClass().getName(),31395);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2cvyfiio83();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2o7xo7xl3lqxu95.R.rethrow($CLV_t2$);}finally{__CLR4_1_2o7xo7xl3lqxu95.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.DefaultToStringStyleTest.testAppendSuper",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),31395,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2cvyfiio83(){try{__CLR4_1_2o7xo7xl3lqxu95.R.inc(31395);
        __CLR4_1_2o7xo7xl3lqxu95.R.inc(31396);assertEquals(baseStr + "[]", new ToStringBuilder(base).appendSuper("Integer@8888[]").toString());
        __CLR4_1_2o7xo7xl3lqxu95.R.inc(31397);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).appendSuper("Integer@8888[<null>]").toString());
        
        __CLR4_1_2o7xo7xl3lqxu95.R.inc(31398);assertEquals(baseStr + "[a=hello]", new ToStringBuilder(base).appendSuper("Integer@8888[]").append("a", "hello").toString());
        __CLR4_1_2o7xo7xl3lqxu95.R.inc(31399);assertEquals(baseStr + "[<null>,a=hello]", new ToStringBuilder(base).appendSuper("Integer@8888[<null>]").append("a", "hello").toString());
        __CLR4_1_2o7xo7xl3lqxu95.R.inc(31400);assertEquals(baseStr + "[a=hello]", new ToStringBuilder(base).appendSuper(null).append("a", "hello").toString());
    }finally{__CLR4_1_2o7xo7xl3lqxu95.R.flushNeeded();}}
    
    @Test
    public void testObject() {__CLR4_1_2o7xo7xl3lqxu95.R.globalSliceStart(getClass().getName(),31401);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2iogga0o89();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2o7xo7xl3lqxu95.R.rethrow($CLV_t2$);}finally{__CLR4_1_2o7xo7xl3lqxu95.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.DefaultToStringStyleTest.testObject",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),31401,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2iogga0o89(){try{__CLR4_1_2o7xo7xl3lqxu95.R.inc(31401);
        __CLR4_1_2o7xo7xl3lqxu95.R.inc(31402);final Integer i3 = Integer.valueOf(3);
        __CLR4_1_2o7xo7xl3lqxu95.R.inc(31403);final Integer i4 = Integer.valueOf(4);
        __CLR4_1_2o7xo7xl3lqxu95.R.inc(31404);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).append((Object) null).toString());
        __CLR4_1_2o7xo7xl3lqxu95.R.inc(31405);assertEquals(baseStr + "[3]", new ToStringBuilder(base).append(i3).toString());
        __CLR4_1_2o7xo7xl3lqxu95.R.inc(31406);assertEquals(baseStr + "[a=<null>]", new ToStringBuilder(base).append("a", (Object) null).toString());
        __CLR4_1_2o7xo7xl3lqxu95.R.inc(31407);assertEquals(baseStr + "[a=3]", new ToStringBuilder(base).append("a", i3).toString());
        __CLR4_1_2o7xo7xl3lqxu95.R.inc(31408);assertEquals(baseStr + "[a=3,b=4]", new ToStringBuilder(base).append("a", i3).append("b", i4).toString());
        __CLR4_1_2o7xo7xl3lqxu95.R.inc(31409);assertEquals(baseStr + "[a=<Integer>]", new ToStringBuilder(base).append("a", i3, false).toString());
        __CLR4_1_2o7xo7xl3lqxu95.R.inc(31410);assertEquals(baseStr + "[a=<size=0>]", new ToStringBuilder(base).append("a", new ArrayList<Object>(), false).toString());
        __CLR4_1_2o7xo7xl3lqxu95.R.inc(31411);assertEquals(baseStr + "[a=[]]", new ToStringBuilder(base).append("a", new ArrayList<Object>(), true).toString());
        __CLR4_1_2o7xo7xl3lqxu95.R.inc(31412);assertEquals(baseStr + "[a=<size=0>]", new ToStringBuilder(base).append("a", new HashMap<Object, Object>(), false).toString());
        __CLR4_1_2o7xo7xl3lqxu95.R.inc(31413);assertEquals(baseStr + "[a={}]", new ToStringBuilder(base).append("a", new HashMap<Object, Object>(), true).toString());
        __CLR4_1_2o7xo7xl3lqxu95.R.inc(31414);assertEquals(baseStr + "[a=<size=0>]", new ToStringBuilder(base).append("a", (Object) new String[0], false).toString());
        __CLR4_1_2o7xo7xl3lqxu95.R.inc(31415);assertEquals(baseStr + "[a={}]", new ToStringBuilder(base).append("a", (Object) new String[0], true).toString());
    }finally{__CLR4_1_2o7xo7xl3lqxu95.R.flushNeeded();}}

    @Test
    public void testPerson() {__CLR4_1_2o7xo7xl3lqxu95.R.globalSliceStart(getClass().getName(),31416);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2rmqmmqo8o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2o7xo7xl3lqxu95.R.rethrow($CLV_t2$);}finally{__CLR4_1_2o7xo7xl3lqxu95.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.DefaultToStringStyleTest.testPerson",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),31416,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2rmqmmqo8o(){try{__CLR4_1_2o7xo7xl3lqxu95.R.inc(31416);
        __CLR4_1_2o7xo7xl3lqxu95.R.inc(31417);final Person p = new Person();
        __CLR4_1_2o7xo7xl3lqxu95.R.inc(31418);p.name = "John Doe";
        __CLR4_1_2o7xo7xl3lqxu95.R.inc(31419);p.age = 33;
        __CLR4_1_2o7xo7xl3lqxu95.R.inc(31420);p.smoker = false;
        __CLR4_1_2o7xo7xl3lqxu95.R.inc(31421);final String pBaseStr = p.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(p));
        __CLR4_1_2o7xo7xl3lqxu95.R.inc(31422);assertEquals(pBaseStr + "[name=John Doe,age=33,smoker=false]", new ToStringBuilder(p).append("name", p.name).append("age", p.age).append("smoker", p.smoker).toString());
    }finally{__CLR4_1_2o7xo7xl3lqxu95.R.flushNeeded();}}

    @Test
    public void testLong() {__CLR4_1_2o7xo7xl3lqxu95.R.globalSliceStart(getClass().getName(),31423);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2xsq9mzo8v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2o7xo7xl3lqxu95.R.rethrow($CLV_t2$);}finally{__CLR4_1_2o7xo7xl3lqxu95.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.DefaultToStringStyleTest.testLong",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),31423,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2xsq9mzo8v(){try{__CLR4_1_2o7xo7xl3lqxu95.R.inc(31423);
        __CLR4_1_2o7xo7xl3lqxu95.R.inc(31424);assertEquals(baseStr + "[3]", new ToStringBuilder(base).append(3L).toString());
        __CLR4_1_2o7xo7xl3lqxu95.R.inc(31425);assertEquals(baseStr + "[a=3]", new ToStringBuilder(base).append("a", 3L).toString());
        __CLR4_1_2o7xo7xl3lqxu95.R.inc(31426);assertEquals(baseStr + "[a=3,b=4]", new ToStringBuilder(base).append("a", 3L).append("b", 4L).toString());
    }finally{__CLR4_1_2o7xo7xl3lqxu95.R.flushNeeded();}}

    @Test
    public void testObjectArray() {__CLR4_1_2o7xo7xl3lqxu95.R.globalSliceStart(getClass().getName(),31427);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2oi04a7o8z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2o7xo7xl3lqxu95.R.rethrow($CLV_t2$);}finally{__CLR4_1_2o7xo7xl3lqxu95.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.DefaultToStringStyleTest.testObjectArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),31427,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2oi04a7o8z(){try{__CLR4_1_2o7xo7xl3lqxu95.R.inc(31427);
        __CLR4_1_2o7xo7xl3lqxu95.R.inc(31428);Object[] array = new Object[] {null, base, new int[] {3, 6}};
        __CLR4_1_2o7xo7xl3lqxu95.R.inc(31429);assertEquals(baseStr + "[{<null>,5,{3,6}}]", new ToStringBuilder(base).append(array).toString());
        __CLR4_1_2o7xo7xl3lqxu95.R.inc(31430);assertEquals(baseStr + "[{<null>,5,{3,6}}]", new ToStringBuilder(base).append((Object) array).toString());
        __CLR4_1_2o7xo7xl3lqxu95.R.inc(31431);array = null;
        __CLR4_1_2o7xo7xl3lqxu95.R.inc(31432);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).append(array).toString());
        __CLR4_1_2o7xo7xl3lqxu95.R.inc(31433);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).append((Object) array).toString());
    }finally{__CLR4_1_2o7xo7xl3lqxu95.R.flushNeeded();}}

    @Test
    public void testLongArray() {__CLR4_1_2o7xo7xl3lqxu95.R.globalSliceStart(getClass().getName(),31434);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2if58i6o96();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2o7xo7xl3lqxu95.R.rethrow($CLV_t2$);}finally{__CLR4_1_2o7xo7xl3lqxu95.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.DefaultToStringStyleTest.testLongArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),31434,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2if58i6o96(){try{__CLR4_1_2o7xo7xl3lqxu95.R.inc(31434);
        __CLR4_1_2o7xo7xl3lqxu95.R.inc(31435);long[] array = new long[] {1, 2, -3, 4};
        __CLR4_1_2o7xo7xl3lqxu95.R.inc(31436);assertEquals(baseStr + "[{1,2,-3,4}]", new ToStringBuilder(base).append(array).toString());
        __CLR4_1_2o7xo7xl3lqxu95.R.inc(31437);assertEquals(baseStr + "[{1,2,-3,4}]", new ToStringBuilder(base).append((Object) array).toString());
        __CLR4_1_2o7xo7xl3lqxu95.R.inc(31438);array = null;
        __CLR4_1_2o7xo7xl3lqxu95.R.inc(31439);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).append(array).toString());
        __CLR4_1_2o7xo7xl3lqxu95.R.inc(31440);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).append((Object) array).toString());
    }finally{__CLR4_1_2o7xo7xl3lqxu95.R.flushNeeded();}}

    @Test
    public void testLongArrayArray() {__CLR4_1_2o7xo7xl3lqxu95.R.globalSliceStart(getClass().getName(),31441);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2xbpkglo9d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2o7xo7xl3lqxu95.R.rethrow($CLV_t2$);}finally{__CLR4_1_2o7xo7xl3lqxu95.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.DefaultToStringStyleTest.testLongArrayArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),31441,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2xbpkglo9d(){try{__CLR4_1_2o7xo7xl3lqxu95.R.inc(31441);
        __CLR4_1_2o7xo7xl3lqxu95.R.inc(31442);long[][] array = new long[][] {{1, 2}, null, {5}};
        __CLR4_1_2o7xo7xl3lqxu95.R.inc(31443);assertEquals(baseStr + "[{{1,2},<null>,{5}}]", new ToStringBuilder(base).append(array).toString());
        __CLR4_1_2o7xo7xl3lqxu95.R.inc(31444);assertEquals(baseStr + "[{{1,2},<null>,{5}}]", new ToStringBuilder(base).append((Object) array).toString());
        __CLR4_1_2o7xo7xl3lqxu95.R.inc(31445);array = null;
        __CLR4_1_2o7xo7xl3lqxu95.R.inc(31446);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).append(array).toString());
        __CLR4_1_2o7xo7xl3lqxu95.R.inc(31447);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).append((Object) array).toString());
    }finally{__CLR4_1_2o7xo7xl3lqxu95.R.flushNeeded();}}

}
