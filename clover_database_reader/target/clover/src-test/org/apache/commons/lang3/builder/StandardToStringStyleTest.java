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
 * Unit tests {@link org.apache.commons.lang3.builder.ToStringStyle}.
 *
 * @version $Id$
 */
public class StandardToStringStyleTest {static class __CLR4_1_2pdqpdql3lqxugl{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492830024L,8589935092L,32964,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final Integer base = Integer.valueOf(5);
    private final String baseStr = "Integer";
    
    private static final StandardToStringStyle STYLE = new StandardToStringStyle();
    
    static {try{__CLR4_1_2pdqpdql3lqxugl.R.inc(32894);
        __CLR4_1_2pdqpdql3lqxugl.R.inc(32895);STYLE.setUseShortClassName(true);
        __CLR4_1_2pdqpdql3lqxugl.R.inc(32896);STYLE.setUseIdentityHashCode(false);
        __CLR4_1_2pdqpdql3lqxugl.R.inc(32897);STYLE.setArrayStart("[");
        __CLR4_1_2pdqpdql3lqxugl.R.inc(32898);STYLE.setArraySeparator(", ");
        __CLR4_1_2pdqpdql3lqxugl.R.inc(32899);STYLE.setArrayEnd("]");
        __CLR4_1_2pdqpdql3lqxugl.R.inc(32900);STYLE.setNullText("%NULL%");
        __CLR4_1_2pdqpdql3lqxugl.R.inc(32901);STYLE.setSizeStartText("%SIZE=");
        __CLR4_1_2pdqpdql3lqxugl.R.inc(32902);STYLE.setSizeEndText("%");
        __CLR4_1_2pdqpdql3lqxugl.R.inc(32903);STYLE.setSummaryObjectStartText("%");
        __CLR4_1_2pdqpdql3lqxugl.R.inc(32904);STYLE.setSummaryObjectEndText("%");
    }finally{__CLR4_1_2pdqpdql3lqxugl.R.flushNeeded();}}
    
    @Before
    public void setUp() throws Exception {try{__CLR4_1_2pdqpdql3lqxugl.R.inc(32905);
        __CLR4_1_2pdqpdql3lqxugl.R.inc(32906);ToStringBuilder.setDefaultStyle(STYLE);
    }finally{__CLR4_1_2pdqpdql3lqxugl.R.flushNeeded();}}

    @After
    public void tearDown() throws Exception {try{__CLR4_1_2pdqpdql3lqxugl.R.inc(32907);
        __CLR4_1_2pdqpdql3lqxugl.R.inc(32908);ToStringBuilder.setDefaultStyle(ToStringStyle.DEFAULT_STYLE);
    }finally{__CLR4_1_2pdqpdql3lqxugl.R.flushNeeded();}}

    //----------------------------------------------------------------
    
    @Test
    public void testBlank() {__CLR4_1_2pdqpdql3lqxugl.R.globalSliceStart(getClass().getName(),32909);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2s7z6qxpe5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pdqpdql3lqxugl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pdqpdql3lqxugl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.StandardToStringStyleTest.testBlank",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32909,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2s7z6qxpe5(){try{__CLR4_1_2pdqpdql3lqxugl.R.inc(32909);
        __CLR4_1_2pdqpdql3lqxugl.R.inc(32910);assertEquals(baseStr + "[]", new ToStringBuilder(base).toString());
    }finally{__CLR4_1_2pdqpdql3lqxugl.R.flushNeeded();}}

    @Test
    public void testAppendSuper() {__CLR4_1_2pdqpdql3lqxugl.R.globalSliceStart(getClass().getName(),32911);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2cvyfiipe7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pdqpdql3lqxugl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pdqpdql3lqxugl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.StandardToStringStyleTest.testAppendSuper",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32911,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2cvyfiipe7(){try{__CLR4_1_2pdqpdql3lqxugl.R.inc(32911);
        __CLR4_1_2pdqpdql3lqxugl.R.inc(32912);assertEquals(baseStr + "[]", new ToStringBuilder(base).appendSuper("Integer@8888[]").toString());
        __CLR4_1_2pdqpdql3lqxugl.R.inc(32913);assertEquals(baseStr + "[%NULL%]", new ToStringBuilder(base).appendSuper("Integer@8888[%NULL%]").toString());
        
        __CLR4_1_2pdqpdql3lqxugl.R.inc(32914);assertEquals(baseStr + "[a=hello]", new ToStringBuilder(base).appendSuper("Integer@8888[]").append("a", "hello").toString());
        __CLR4_1_2pdqpdql3lqxugl.R.inc(32915);assertEquals(baseStr + "[%NULL%,a=hello]", new ToStringBuilder(base).appendSuper("Integer@8888[%NULL%]").append("a", "hello").toString());
        __CLR4_1_2pdqpdql3lqxugl.R.inc(32916);assertEquals(baseStr + "[a=hello]", new ToStringBuilder(base).appendSuper(null).append("a", "hello").toString());
    }finally{__CLR4_1_2pdqpdql3lqxugl.R.flushNeeded();}}
    
    @Test
    public void testObject() {__CLR4_1_2pdqpdql3lqxugl.R.globalSliceStart(getClass().getName(),32917);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2iogga0ped();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pdqpdql3lqxugl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pdqpdql3lqxugl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.StandardToStringStyleTest.testObject",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32917,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2iogga0ped(){try{__CLR4_1_2pdqpdql3lqxugl.R.inc(32917);
        __CLR4_1_2pdqpdql3lqxugl.R.inc(32918);final Integer i3 = Integer.valueOf(3);
        __CLR4_1_2pdqpdql3lqxugl.R.inc(32919);final Integer i4 = Integer.valueOf(4);
        __CLR4_1_2pdqpdql3lqxugl.R.inc(32920);assertEquals(baseStr + "[%NULL%]", new ToStringBuilder(base).append((Object) null).toString());
        __CLR4_1_2pdqpdql3lqxugl.R.inc(32921);assertEquals(baseStr + "[3]", new ToStringBuilder(base).append(i3).toString());
        __CLR4_1_2pdqpdql3lqxugl.R.inc(32922);assertEquals(baseStr + "[a=%NULL%]", new ToStringBuilder(base).append("a", (Object) null).toString());
        __CLR4_1_2pdqpdql3lqxugl.R.inc(32923);assertEquals(baseStr + "[a=3]", new ToStringBuilder(base).append("a", i3).toString());
        __CLR4_1_2pdqpdql3lqxugl.R.inc(32924);assertEquals(baseStr + "[a=3,b=4]", new ToStringBuilder(base).append("a", i3).append("b", i4).toString());
        __CLR4_1_2pdqpdql3lqxugl.R.inc(32925);assertEquals(baseStr + "[a=%Integer%]", new ToStringBuilder(base).append("a", i3, false).toString());
        __CLR4_1_2pdqpdql3lqxugl.R.inc(32926);assertEquals(baseStr + "[a=%SIZE=0%]", new ToStringBuilder(base).append("a", new ArrayList<Object>(), false).toString());
        __CLR4_1_2pdqpdql3lqxugl.R.inc(32927);assertEquals(baseStr + "[a=[]]", new ToStringBuilder(base).append("a", new ArrayList<Object>(), true).toString());
        __CLR4_1_2pdqpdql3lqxugl.R.inc(32928);assertEquals(baseStr + "[a=%SIZE=0%]", new ToStringBuilder(base).append("a", new HashMap<Object, Object>(), false).toString());
        __CLR4_1_2pdqpdql3lqxugl.R.inc(32929);assertEquals(baseStr + "[a={}]", new ToStringBuilder(base).append("a", new HashMap<Object, Object>(), true).toString());
        __CLR4_1_2pdqpdql3lqxugl.R.inc(32930);assertEquals(baseStr + "[a=%SIZE=0%]", new ToStringBuilder(base).append("a", (Object) new String[0], false).toString());
        __CLR4_1_2pdqpdql3lqxugl.R.inc(32931);assertEquals(baseStr + "[a=[]]", new ToStringBuilder(base).append("a", (Object) new String[0], true).toString());
    }finally{__CLR4_1_2pdqpdql3lqxugl.R.flushNeeded();}}

    @Test
    public void testPerson() {__CLR4_1_2pdqpdql3lqxugl.R.globalSliceStart(getClass().getName(),32932);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2rmqmmqpes();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pdqpdql3lqxugl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pdqpdql3lqxugl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.StandardToStringStyleTest.testPerson",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32932,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2rmqmmqpes(){try{__CLR4_1_2pdqpdql3lqxugl.R.inc(32932);
        __CLR4_1_2pdqpdql3lqxugl.R.inc(32933);final Person p = new Person();
        __CLR4_1_2pdqpdql3lqxugl.R.inc(32934);p.name = "Suzy Queue";
        __CLR4_1_2pdqpdql3lqxugl.R.inc(32935);p.age = 19;
        __CLR4_1_2pdqpdql3lqxugl.R.inc(32936);p.smoker = false;
        __CLR4_1_2pdqpdql3lqxugl.R.inc(32937);final String pBaseStr = "ToStringStyleTest.Person";
        __CLR4_1_2pdqpdql3lqxugl.R.inc(32938);assertEquals(pBaseStr + "[name=Suzy Queue,age=19,smoker=false]", new ToStringBuilder(p).append("name", p.name).append("age", p.age).append("smoker", p.smoker).toString());
    }finally{__CLR4_1_2pdqpdql3lqxugl.R.flushNeeded();}}

    @Test
    public void testLong() {__CLR4_1_2pdqpdql3lqxugl.R.globalSliceStart(getClass().getName(),32939);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2xsq9mzpez();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pdqpdql3lqxugl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pdqpdql3lqxugl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.StandardToStringStyleTest.testLong",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32939,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2xsq9mzpez(){try{__CLR4_1_2pdqpdql3lqxugl.R.inc(32939);
        __CLR4_1_2pdqpdql3lqxugl.R.inc(32940);assertEquals(baseStr + "[3]", new ToStringBuilder(base).append(3L).toString());
        __CLR4_1_2pdqpdql3lqxugl.R.inc(32941);assertEquals(baseStr + "[a=3]", new ToStringBuilder(base).append("a", 3L).toString());
        __CLR4_1_2pdqpdql3lqxugl.R.inc(32942);assertEquals(baseStr + "[a=3,b=4]", new ToStringBuilder(base).append("a", 3L).append("b", 4L).toString());
    }finally{__CLR4_1_2pdqpdql3lqxugl.R.flushNeeded();}}

    @Test
    public void testObjectArray() {__CLR4_1_2pdqpdql3lqxugl.R.globalSliceStart(getClass().getName(),32943);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2oi04a7pf3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pdqpdql3lqxugl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pdqpdql3lqxugl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.StandardToStringStyleTest.testObjectArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32943,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2oi04a7pf3(){try{__CLR4_1_2pdqpdql3lqxugl.R.inc(32943);
        __CLR4_1_2pdqpdql3lqxugl.R.inc(32944);Object[] array = new Object[] {null, base, new int[] {3, 6}};
        __CLR4_1_2pdqpdql3lqxugl.R.inc(32945);assertEquals(baseStr + "[[%NULL%, 5, [3, 6]]]", new ToStringBuilder(base).append(array).toString());
        __CLR4_1_2pdqpdql3lqxugl.R.inc(32946);assertEquals(baseStr + "[[%NULL%, 5, [3, 6]]]", new ToStringBuilder(base).append((Object) array).toString());
        __CLR4_1_2pdqpdql3lqxugl.R.inc(32947);array = null;
        __CLR4_1_2pdqpdql3lqxugl.R.inc(32948);assertEquals(baseStr + "[%NULL%]", new ToStringBuilder(base).append(array).toString());
        __CLR4_1_2pdqpdql3lqxugl.R.inc(32949);assertEquals(baseStr + "[%NULL%]", new ToStringBuilder(base).append((Object) array).toString());
    }finally{__CLR4_1_2pdqpdql3lqxugl.R.flushNeeded();}}

    @Test
    public void testLongArray() {__CLR4_1_2pdqpdql3lqxugl.R.globalSliceStart(getClass().getName(),32950);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2if58i6pfa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pdqpdql3lqxugl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pdqpdql3lqxugl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.StandardToStringStyleTest.testLongArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32950,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2if58i6pfa(){try{__CLR4_1_2pdqpdql3lqxugl.R.inc(32950);
        __CLR4_1_2pdqpdql3lqxugl.R.inc(32951);long[] array = new long[] {1, 2, -3, 4};
        __CLR4_1_2pdqpdql3lqxugl.R.inc(32952);assertEquals(baseStr + "[[1, 2, -3, 4]]", new ToStringBuilder(base).append(array).toString());
        __CLR4_1_2pdqpdql3lqxugl.R.inc(32953);assertEquals(baseStr + "[[1, 2, -3, 4]]", new ToStringBuilder(base).append((Object) array).toString());
        __CLR4_1_2pdqpdql3lqxugl.R.inc(32954);array = null;
        __CLR4_1_2pdqpdql3lqxugl.R.inc(32955);assertEquals(baseStr + "[%NULL%]", new ToStringBuilder(base).append(array).toString());
        __CLR4_1_2pdqpdql3lqxugl.R.inc(32956);assertEquals(baseStr + "[%NULL%]", new ToStringBuilder(base).append((Object) array).toString());
    }finally{__CLR4_1_2pdqpdql3lqxugl.R.flushNeeded();}}

    @Test
    public void testLongArrayArray() {__CLR4_1_2pdqpdql3lqxugl.R.globalSliceStart(getClass().getName(),32957);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2xbpkglpfh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pdqpdql3lqxugl.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pdqpdql3lqxugl.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.StandardToStringStyleTest.testLongArrayArray",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),32957,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2xbpkglpfh(){try{__CLR4_1_2pdqpdql3lqxugl.R.inc(32957);
        __CLR4_1_2pdqpdql3lqxugl.R.inc(32958);long[][] array = new long[][] {{1, 2}, null, {5}};
        __CLR4_1_2pdqpdql3lqxugl.R.inc(32959);assertEquals(baseStr + "[[[1, 2], %NULL%, [5]]]", new ToStringBuilder(base).append(array).toString());
        __CLR4_1_2pdqpdql3lqxugl.R.inc(32960);assertEquals(baseStr + "[[[1, 2], %NULL%, [5]]]", new ToStringBuilder(base).append((Object) array).toString());
        __CLR4_1_2pdqpdql3lqxugl.R.inc(32961);array = null;
        __CLR4_1_2pdqpdql3lqxugl.R.inc(32962);assertEquals(baseStr + "[%NULL%]", new ToStringBuilder(base).append(array).toString());
        __CLR4_1_2pdqpdql3lqxugl.R.inc(32963);assertEquals(baseStr + "[%NULL%]", new ToStringBuilder(base).append((Object) array).toString());
    }finally{__CLR4_1_2pdqpdql3lqxugl.R.flushNeeded();}}

}
