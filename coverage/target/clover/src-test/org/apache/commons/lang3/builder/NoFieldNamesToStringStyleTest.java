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
 * Unit tests {@link org.apache.commons.lang3.builder.NoFieldNamesToStringStyleTest}.
 *
 * @version $Id$
 */
public class NoFieldNamesToStringStyleTest {static class __CLR4_1_2p61p61l3lqxueg{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492830024L,8589935092L,32676,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final Integer base = Integer.valueOf(5);
    private final String baseStr = base.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(base));
    
    @Before
    public void setUp() throws Exception {try{__CLR4_1_2p61p61l3lqxueg.R.inc(32617);
        __CLR4_1_2p61p61l3lqxueg.R.inc(32618);ToStringBuilder.setDefaultStyle(ToStringStyle.NO_FIELD_NAMES_STYLE);
    }finally{__CLR4_1_2p61p61l3lqxueg.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_1_2p61p61l3lqxueg.R.inc(32619);
        __CLR4_1_2p61p61l3lqxueg.R.inc(32620);ToStringBuilder.setDefaultStyle(ToStringStyle.DEFAULT_STYLE);
    }finally{__CLR4_1_2p61p61l3lqxueg.R.flushNeeded();}}

    //----------------------------------------------------------------
    
    @Test
    public void testBlank() {__CLR4_1_2p61p61l3lqxueg.R.globalSliceStart(getClass().getName(),32621);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2s7z6qxp65();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2p61p61l3lqxueg.R.rethrow($CLV_t2$);}finally{__CLR4_1_2p61p61l3lqxueg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.NoFieldNamesToStringStyleTest.testBlank",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32621,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2s7z6qxp65(){try{__CLR4_1_2p61p61l3lqxueg.R.inc(32621);
        __CLR4_1_2p61p61l3lqxueg.R.inc(32622);assertEquals(baseStr + "[]", new ToStringBuilder(base).toString());
    }finally{__CLR4_1_2p61p61l3lqxueg.R.flushNeeded();}}

    @Test
    public void testAppendSuper() {__CLR4_1_2p61p61l3lqxueg.R.globalSliceStart(getClass().getName(),32623);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2cvyfiip67();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2p61p61l3lqxueg.R.rethrow($CLV_t2$);}finally{__CLR4_1_2p61p61l3lqxueg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.NoFieldNamesToStringStyleTest.testAppendSuper",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32623,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2cvyfiip67(){try{__CLR4_1_2p61p61l3lqxueg.R.inc(32623);
        __CLR4_1_2p61p61l3lqxueg.R.inc(32624);assertEquals(baseStr + "[]", new ToStringBuilder(base).appendSuper("Integer@8888[]").toString());
        __CLR4_1_2p61p61l3lqxueg.R.inc(32625);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).appendSuper("Integer@8888[<null>]").toString());
        
        __CLR4_1_2p61p61l3lqxueg.R.inc(32626);assertEquals(baseStr + "[hello]", new ToStringBuilder(base).appendSuper("Integer@8888[]").append("a", "hello").toString());
        __CLR4_1_2p61p61l3lqxueg.R.inc(32627);assertEquals(baseStr + "[<null>,hello]", new ToStringBuilder(base).appendSuper("Integer@8888[<null>]").append("a", "hello").toString());
        __CLR4_1_2p61p61l3lqxueg.R.inc(32628);assertEquals(baseStr + "[hello]", new ToStringBuilder(base).appendSuper(null).append("a", "hello").toString());
    }finally{__CLR4_1_2p61p61l3lqxueg.R.flushNeeded();}}
    
    @Test
    public void testObject() {__CLR4_1_2p61p61l3lqxueg.R.globalSliceStart(getClass().getName(),32629);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2iogga0p6d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2p61p61l3lqxueg.R.rethrow($CLV_t2$);}finally{__CLR4_1_2p61p61l3lqxueg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.NoFieldNamesToStringStyleTest.testObject",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32629,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2iogga0p6d(){try{__CLR4_1_2p61p61l3lqxueg.R.inc(32629);
        __CLR4_1_2p61p61l3lqxueg.R.inc(32630);final Integer i3 = Integer.valueOf(3);
        __CLR4_1_2p61p61l3lqxueg.R.inc(32631);final Integer i4 = Integer.valueOf(4);
        __CLR4_1_2p61p61l3lqxueg.R.inc(32632);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).append((Object) null).toString());
        __CLR4_1_2p61p61l3lqxueg.R.inc(32633);assertEquals(baseStr + "[3]", new ToStringBuilder(base).append(i3).toString());
        __CLR4_1_2p61p61l3lqxueg.R.inc(32634);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).append("a", (Object) null).toString());
        __CLR4_1_2p61p61l3lqxueg.R.inc(32635);assertEquals(baseStr + "[3]", new ToStringBuilder(base).append("a", i3).toString());
        __CLR4_1_2p61p61l3lqxueg.R.inc(32636);assertEquals(baseStr + "[3,4]", new ToStringBuilder(base).append("a", i3).append("b", i4).toString());
        __CLR4_1_2p61p61l3lqxueg.R.inc(32637);assertEquals(baseStr + "[<Integer>]", new ToStringBuilder(base).append("a", i3, false).toString());
        __CLR4_1_2p61p61l3lqxueg.R.inc(32638);assertEquals(baseStr + "[<size=0>]", new ToStringBuilder(base).append("a", new ArrayList<Object>(), false).toString());
        __CLR4_1_2p61p61l3lqxueg.R.inc(32639);assertEquals(baseStr + "[[]]", new ToStringBuilder(base).append("a", new ArrayList<Object>(), true).toString());
        __CLR4_1_2p61p61l3lqxueg.R.inc(32640);assertEquals(baseStr + "[<size=0>]", new ToStringBuilder(base).append("a", new HashMap<Object, Object>(), false).toString());
        __CLR4_1_2p61p61l3lqxueg.R.inc(32641);assertEquals(baseStr + "[{}]", new ToStringBuilder(base).append("a", new HashMap<Object, Object>(), true).toString());
        __CLR4_1_2p61p61l3lqxueg.R.inc(32642);assertEquals(baseStr + "[<size=0>]", new ToStringBuilder(base).append("a", (Object) new String[0], false).toString());
        __CLR4_1_2p61p61l3lqxueg.R.inc(32643);assertEquals(baseStr + "[{}]", new ToStringBuilder(base).append("a", (Object) new String[0], true).toString());
    }finally{__CLR4_1_2p61p61l3lqxueg.R.flushNeeded();}}

    @Test
    public void testPerson() {__CLR4_1_2p61p61l3lqxueg.R.globalSliceStart(getClass().getName(),32644);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2rmqmmqp6s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2p61p61l3lqxueg.R.rethrow($CLV_t2$);}finally{__CLR4_1_2p61p61l3lqxueg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.NoFieldNamesToStringStyleTest.testPerson",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32644,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2rmqmmqp6s(){try{__CLR4_1_2p61p61l3lqxueg.R.inc(32644);
        __CLR4_1_2p61p61l3lqxueg.R.inc(32645);final Person p = new Person();
        __CLR4_1_2p61p61l3lqxueg.R.inc(32646);p.name = "Ron Paul";
        __CLR4_1_2p61p61l3lqxueg.R.inc(32647);p.age = 72;
        __CLR4_1_2p61p61l3lqxueg.R.inc(32648);p.smoker = false;
        __CLR4_1_2p61p61l3lqxueg.R.inc(32649);final String pBaseStr = p.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(p));
        __CLR4_1_2p61p61l3lqxueg.R.inc(32650);assertEquals(pBaseStr + "[Ron Paul,72,false]", new ToStringBuilder(p).append("name", p.name).append("age", p.age).append("smoker", p.smoker).toString());
    }finally{__CLR4_1_2p61p61l3lqxueg.R.flushNeeded();}}

    @Test
    public void testLong() {__CLR4_1_2p61p61l3lqxueg.R.globalSliceStart(getClass().getName(),32651);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2xsq9mzp6z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2p61p61l3lqxueg.R.rethrow($CLV_t2$);}finally{__CLR4_1_2p61p61l3lqxueg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.NoFieldNamesToStringStyleTest.testLong",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32651,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2xsq9mzp6z(){try{__CLR4_1_2p61p61l3lqxueg.R.inc(32651);
        __CLR4_1_2p61p61l3lqxueg.R.inc(32652);assertEquals(baseStr + "[3]", new ToStringBuilder(base).append(3L).toString());
        __CLR4_1_2p61p61l3lqxueg.R.inc(32653);assertEquals(baseStr + "[3]", new ToStringBuilder(base).append("a", 3L).toString());
        __CLR4_1_2p61p61l3lqxueg.R.inc(32654);assertEquals(baseStr + "[3,4]", new ToStringBuilder(base).append("a", 3L).append("b", 4L).toString());
    }finally{__CLR4_1_2p61p61l3lqxueg.R.flushNeeded();}}

    @Test
    public void testObjectArray() {__CLR4_1_2p61p61l3lqxueg.R.globalSliceStart(getClass().getName(),32655);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2oi04a7p73();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2p61p61l3lqxueg.R.rethrow($CLV_t2$);}finally{__CLR4_1_2p61p61l3lqxueg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.NoFieldNamesToStringStyleTest.testObjectArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32655,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2oi04a7p73(){try{__CLR4_1_2p61p61l3lqxueg.R.inc(32655);
        __CLR4_1_2p61p61l3lqxueg.R.inc(32656);Object[] array = new Object[] {null, base, new int[] {3, 6}};
        __CLR4_1_2p61p61l3lqxueg.R.inc(32657);assertEquals(baseStr + "[{<null>,5,{3,6}}]", new ToStringBuilder(base).append(array).toString());
        __CLR4_1_2p61p61l3lqxueg.R.inc(32658);assertEquals(baseStr + "[{<null>,5,{3,6}}]", new ToStringBuilder(base).append((Object) array).toString());
        __CLR4_1_2p61p61l3lqxueg.R.inc(32659);array = null;
        __CLR4_1_2p61p61l3lqxueg.R.inc(32660);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).append(array).toString());
        __CLR4_1_2p61p61l3lqxueg.R.inc(32661);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).append((Object) array).toString());
    }finally{__CLR4_1_2p61p61l3lqxueg.R.flushNeeded();}}

    @Test
    public void testLongArray() {__CLR4_1_2p61p61l3lqxueg.R.globalSliceStart(getClass().getName(),32662);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2if58i6p7a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2p61p61l3lqxueg.R.rethrow($CLV_t2$);}finally{__CLR4_1_2p61p61l3lqxueg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.NoFieldNamesToStringStyleTest.testLongArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32662,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2if58i6p7a(){try{__CLR4_1_2p61p61l3lqxueg.R.inc(32662);
        __CLR4_1_2p61p61l3lqxueg.R.inc(32663);long[] array = new long[] {1, 2, -3, 4};
        __CLR4_1_2p61p61l3lqxueg.R.inc(32664);assertEquals(baseStr + "[{1,2,-3,4}]", new ToStringBuilder(base).append(array).toString());
        __CLR4_1_2p61p61l3lqxueg.R.inc(32665);assertEquals(baseStr + "[{1,2,-3,4}]", new ToStringBuilder(base).append((Object) array).toString());
        __CLR4_1_2p61p61l3lqxueg.R.inc(32666);array = null;
        __CLR4_1_2p61p61l3lqxueg.R.inc(32667);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).append(array).toString());
        __CLR4_1_2p61p61l3lqxueg.R.inc(32668);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).append((Object) array).toString());
    }finally{__CLR4_1_2p61p61l3lqxueg.R.flushNeeded();}}

    @Test
    public void testLongArrayArray() {__CLR4_1_2p61p61l3lqxueg.R.globalSliceStart(getClass().getName(),32669);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2xbpkglp7h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2p61p61l3lqxueg.R.rethrow($CLV_t2$);}finally{__CLR4_1_2p61p61l3lqxueg.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.NoFieldNamesToStringStyleTest.testLongArrayArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32669,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2xbpkglp7h(){try{__CLR4_1_2p61p61l3lqxueg.R.inc(32669);
        __CLR4_1_2p61p61l3lqxueg.R.inc(32670);long[][] array = new long[][] {{1, 2}, null, {5}};
        __CLR4_1_2p61p61l3lqxueg.R.inc(32671);assertEquals(baseStr + "[{{1,2},<null>,{5}}]", new ToStringBuilder(base).append(array).toString());
        __CLR4_1_2p61p61l3lqxueg.R.inc(32672);assertEquals(baseStr + "[{{1,2},<null>,{5}}]", new ToStringBuilder(base).append((Object) array).toString());
        __CLR4_1_2p61p61l3lqxueg.R.inc(32673);array = null;
        __CLR4_1_2p61p61l3lqxueg.R.inc(32674);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).append(array).toString());
        __CLR4_1_2p61p61l3lqxueg.R.inc(32675);assertEquals(baseStr + "[<null>]", new ToStringBuilder(base).append((Object) array).toString());
    }finally{__CLR4_1_2p61p61l3lqxueg.R.flushNeeded();}}

}
