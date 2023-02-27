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
 * Unit tests {@link org.apache.commons.lang3.builder.SimpleToStringStyleTest}.
 *
 * @version $Id$
 */
public class SimpleToStringStyleTest {static class __CLR4_1_2pc4pc4l3lqxuft{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492830024L,8589935092L,32894,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final Integer base = Integer.valueOf(5);
    
    @Before
    public void setUp() throws Exception {try{__CLR4_1_2pc4pc4l3lqxuft.R.inc(32836);
        __CLR4_1_2pc4pc4l3lqxuft.R.inc(32837);ToStringBuilder.setDefaultStyle(ToStringStyle.SIMPLE_STYLE);
    }finally{__CLR4_1_2pc4pc4l3lqxuft.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_1_2pc4pc4l3lqxuft.R.inc(32838);
        __CLR4_1_2pc4pc4l3lqxuft.R.inc(32839);ToStringBuilder.setDefaultStyle(ToStringStyle.DEFAULT_STYLE);
    }finally{__CLR4_1_2pc4pc4l3lqxuft.R.flushNeeded();}}

    //----------------------------------------------------------------
    
    @Test
    public void testBlank() {__CLR4_1_2pc4pc4l3lqxuft.R.globalSliceStart(getClass().getName(),32840);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2s7z6qxpc8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pc4pc4l3lqxuft.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pc4pc4l3lqxuft.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.SimpleToStringStyleTest.testBlank",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32840,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2s7z6qxpc8(){try{__CLR4_1_2pc4pc4l3lqxuft.R.inc(32840);
        __CLR4_1_2pc4pc4l3lqxuft.R.inc(32841);assertEquals("", new ToStringBuilder(base).toString());
    }finally{__CLR4_1_2pc4pc4l3lqxuft.R.flushNeeded();}}

    @Test
    public void testAppendSuper() {__CLR4_1_2pc4pc4l3lqxuft.R.globalSliceStart(getClass().getName(),32842);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2cvyfiipca();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pc4pc4l3lqxuft.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pc4pc4l3lqxuft.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.SimpleToStringStyleTest.testAppendSuper",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32842,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2cvyfiipca(){try{__CLR4_1_2pc4pc4l3lqxuft.R.inc(32842);
        __CLR4_1_2pc4pc4l3lqxuft.R.inc(32843);assertEquals("", new ToStringBuilder(base).appendSuper("").toString());
        __CLR4_1_2pc4pc4l3lqxuft.R.inc(32844);assertEquals("<null>", new ToStringBuilder(base).appendSuper("<null>").toString());
        
        __CLR4_1_2pc4pc4l3lqxuft.R.inc(32845);assertEquals("hello", new ToStringBuilder(base).appendSuper("").append("a", "hello").toString());
        __CLR4_1_2pc4pc4l3lqxuft.R.inc(32846);assertEquals("<null>,hello", new ToStringBuilder(base).appendSuper("<null>").append("a", "hello").toString());
        __CLR4_1_2pc4pc4l3lqxuft.R.inc(32847);assertEquals("hello", new ToStringBuilder(base).appendSuper(null).append("a", "hello").toString());
    }finally{__CLR4_1_2pc4pc4l3lqxuft.R.flushNeeded();}}
    
    @Test
    public void testObject() {__CLR4_1_2pc4pc4l3lqxuft.R.globalSliceStart(getClass().getName(),32848);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2iogga0pcg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pc4pc4l3lqxuft.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pc4pc4l3lqxuft.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.SimpleToStringStyleTest.testObject",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32848,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2iogga0pcg(){try{__CLR4_1_2pc4pc4l3lqxuft.R.inc(32848);
        __CLR4_1_2pc4pc4l3lqxuft.R.inc(32849);final Integer i3 = Integer.valueOf(3);
        __CLR4_1_2pc4pc4l3lqxuft.R.inc(32850);final Integer i4 = Integer.valueOf(4);
        __CLR4_1_2pc4pc4l3lqxuft.R.inc(32851);assertEquals("<null>", new ToStringBuilder(base).append((Object) null).toString());
        __CLR4_1_2pc4pc4l3lqxuft.R.inc(32852);assertEquals("3", new ToStringBuilder(base).append(i3).toString());
        __CLR4_1_2pc4pc4l3lqxuft.R.inc(32853);assertEquals("<null>", new ToStringBuilder(base).append("a", (Object) null).toString());
        __CLR4_1_2pc4pc4l3lqxuft.R.inc(32854);assertEquals("3", new ToStringBuilder(base).append("a", i3).toString());
        __CLR4_1_2pc4pc4l3lqxuft.R.inc(32855);assertEquals("3,4", new ToStringBuilder(base).append("a", i3).append("b", i4).toString());
        __CLR4_1_2pc4pc4l3lqxuft.R.inc(32856);assertEquals("<Integer>", new ToStringBuilder(base).append("a", i3, false).toString());
        __CLR4_1_2pc4pc4l3lqxuft.R.inc(32857);assertEquals("<size=0>", new ToStringBuilder(base).append("a", new ArrayList<Object>(), false).toString());
        __CLR4_1_2pc4pc4l3lqxuft.R.inc(32858);assertEquals("[]", new ToStringBuilder(base).append("a", new ArrayList<Object>(), true).toString());
        __CLR4_1_2pc4pc4l3lqxuft.R.inc(32859);assertEquals("<size=0>", new ToStringBuilder(base).append("a", new HashMap<Object, Object>(), false).toString());
        __CLR4_1_2pc4pc4l3lqxuft.R.inc(32860);assertEquals("{}", new ToStringBuilder(base).append("a", new HashMap<Object, Object>(), true).toString());
        __CLR4_1_2pc4pc4l3lqxuft.R.inc(32861);assertEquals("<size=0>", new ToStringBuilder(base).append("a", (Object) new String[0], false).toString());
        __CLR4_1_2pc4pc4l3lqxuft.R.inc(32862);assertEquals("{}", new ToStringBuilder(base).append("a", (Object) new String[0], true).toString());
    }finally{__CLR4_1_2pc4pc4l3lqxuft.R.flushNeeded();}}

    @Test
    public void testPerson() {__CLR4_1_2pc4pc4l3lqxuft.R.globalSliceStart(getClass().getName(),32863);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2rmqmmqpcv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pc4pc4l3lqxuft.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pc4pc4l3lqxuft.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.SimpleToStringStyleTest.testPerson",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32863,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2rmqmmqpcv(){try{__CLR4_1_2pc4pc4l3lqxuft.R.inc(32863);
        __CLR4_1_2pc4pc4l3lqxuft.R.inc(32864);final Person p = new Person();
        __CLR4_1_2pc4pc4l3lqxuft.R.inc(32865);p.name = "Jane Q. Public";
        __CLR4_1_2pc4pc4l3lqxuft.R.inc(32866);p.age = 47;
        __CLR4_1_2pc4pc4l3lqxuft.R.inc(32867);p.smoker = false;
        __CLR4_1_2pc4pc4l3lqxuft.R.inc(32868);assertEquals("Jane Q. Public,47,false", new ToStringBuilder(p).append("name", p.name).append("age", p.age).append("smoker", p.smoker).toString());
    }finally{__CLR4_1_2pc4pc4l3lqxuft.R.flushNeeded();}}

    @Test
    public void testLong() {__CLR4_1_2pc4pc4l3lqxuft.R.globalSliceStart(getClass().getName(),32869);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2xsq9mzpd1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pc4pc4l3lqxuft.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pc4pc4l3lqxuft.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.SimpleToStringStyleTest.testLong",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32869,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2xsq9mzpd1(){try{__CLR4_1_2pc4pc4l3lqxuft.R.inc(32869);
        __CLR4_1_2pc4pc4l3lqxuft.R.inc(32870);assertEquals("3", new ToStringBuilder(base).append(3L).toString());
        __CLR4_1_2pc4pc4l3lqxuft.R.inc(32871);assertEquals("3", new ToStringBuilder(base).append("a", 3L).toString());
        __CLR4_1_2pc4pc4l3lqxuft.R.inc(32872);assertEquals("3,4", new ToStringBuilder(base).append("a", 3L).append("b", 4L).toString());
    }finally{__CLR4_1_2pc4pc4l3lqxuft.R.flushNeeded();}}

    @Test
    public void testObjectArray() {__CLR4_1_2pc4pc4l3lqxuft.R.globalSliceStart(getClass().getName(),32873);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2oi04a7pd5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pc4pc4l3lqxuft.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pc4pc4l3lqxuft.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.SimpleToStringStyleTest.testObjectArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32873,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2oi04a7pd5(){try{__CLR4_1_2pc4pc4l3lqxuft.R.inc(32873);
        __CLR4_1_2pc4pc4l3lqxuft.R.inc(32874);Object[] array = new Object[] {null, base, new int[] {3, 6}};
        __CLR4_1_2pc4pc4l3lqxuft.R.inc(32875);assertEquals("{<null>,5,{3,6}}", new ToStringBuilder(base).append(array).toString());
        __CLR4_1_2pc4pc4l3lqxuft.R.inc(32876);assertEquals("{<null>,5,{3,6}}", new ToStringBuilder(base).append((Object) array).toString());
        __CLR4_1_2pc4pc4l3lqxuft.R.inc(32877);array = null;
        __CLR4_1_2pc4pc4l3lqxuft.R.inc(32878);assertEquals("<null>", new ToStringBuilder(base).append(array).toString());
        __CLR4_1_2pc4pc4l3lqxuft.R.inc(32879);assertEquals("<null>", new ToStringBuilder(base).append((Object) array).toString());
    }finally{__CLR4_1_2pc4pc4l3lqxuft.R.flushNeeded();}}

    @Test
    public void testLongArray() {__CLR4_1_2pc4pc4l3lqxuft.R.globalSliceStart(getClass().getName(),32880);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2if58i6pdc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pc4pc4l3lqxuft.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pc4pc4l3lqxuft.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.SimpleToStringStyleTest.testLongArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32880,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2if58i6pdc(){try{__CLR4_1_2pc4pc4l3lqxuft.R.inc(32880);
        __CLR4_1_2pc4pc4l3lqxuft.R.inc(32881);long[] array = new long[] {1, 2, -3, 4};
        __CLR4_1_2pc4pc4l3lqxuft.R.inc(32882);assertEquals("{1,2,-3,4}", new ToStringBuilder(base).append(array).toString());
        __CLR4_1_2pc4pc4l3lqxuft.R.inc(32883);assertEquals("{1,2,-3,4}", new ToStringBuilder(base).append((Object) array).toString());
        __CLR4_1_2pc4pc4l3lqxuft.R.inc(32884);array = null;
        __CLR4_1_2pc4pc4l3lqxuft.R.inc(32885);assertEquals("<null>", new ToStringBuilder(base).append(array).toString());
        __CLR4_1_2pc4pc4l3lqxuft.R.inc(32886);assertEquals("<null>", new ToStringBuilder(base).append((Object) array).toString());
    }finally{__CLR4_1_2pc4pc4l3lqxuft.R.flushNeeded();}}

    @Test
    public void testLongArrayArray() {__CLR4_1_2pc4pc4l3lqxuft.R.globalSliceStart(getClass().getName(),32887);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2xbpkglpdj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pc4pc4l3lqxuft.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pc4pc4l3lqxuft.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.SimpleToStringStyleTest.testLongArrayArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32887,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2xbpkglpdj(){try{__CLR4_1_2pc4pc4l3lqxuft.R.inc(32887);
        __CLR4_1_2pc4pc4l3lqxuft.R.inc(32888);long[][] array = new long[][] {{1, 2}, null, {5}};
        __CLR4_1_2pc4pc4l3lqxuft.R.inc(32889);assertEquals("{{1,2},<null>,{5}}", new ToStringBuilder(base).append(array).toString());
        __CLR4_1_2pc4pc4l3lqxuft.R.inc(32890);assertEquals("{{1,2},<null>,{5}}", new ToStringBuilder(base).append((Object) array).toString());
        __CLR4_1_2pc4pc4l3lqxuft.R.inc(32891);array = null;
        __CLR4_1_2pc4pc4l3lqxuft.R.inc(32892);assertEquals("<null>", new ToStringBuilder(base).append(array).toString());
        __CLR4_1_2pc4pc4l3lqxuft.R.inc(32893);assertEquals("<null>", new ToStringBuilder(base).append((Object) array).toString());
    }finally{__CLR4_1_2pc4pc4l3lqxuft.R.flushNeeded();}}

}
