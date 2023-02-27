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

import org.junit.Test;

/**
 * Test case for ToStringStyle.
 * 
 * @version $Id$
 */
public class ToStringStyleTest {static class __CLR4_1_2pttpttl3lqxuiz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492830024L,8589935092L,33521,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static class ToStringStyleImpl extends ToStringStyle {
    }

    //-----------------------------------------------------------------------
    @Test
    public void testSetArrayStart() {__CLR4_1_2pttpttl3lqxuiz.R.globalSliceStart(getClass().getName(),33473);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_27u9c0ptt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pttpttl3lqxuiz.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pttpttl3lqxuiz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringStyleTest.testSetArrayStart",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33473,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_27u9c0ptt(){try{__CLR4_1_2pttpttl3lqxuiz.R.inc(33473);
        __CLR4_1_2pttpttl3lqxuiz.R.inc(33474);final ToStringStyle style = new ToStringStyleImpl();
        __CLR4_1_2pttpttl3lqxuiz.R.inc(33475);style.setArrayStart(null);
        __CLR4_1_2pttpttl3lqxuiz.R.inc(33476);assertEquals("", style.getArrayStart());
    }finally{__CLR4_1_2pttpttl3lqxuiz.R.flushNeeded();}}

    @Test
    public void testSetArrayEnd() {__CLR4_1_2pttpttl3lqxuiz.R.globalSliceStart(getClass().getName(),33477);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2wm1sbrptx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pttpttl3lqxuiz.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pttpttl3lqxuiz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringStyleTest.testSetArrayEnd",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33477,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2wm1sbrptx(){try{__CLR4_1_2pttpttl3lqxuiz.R.inc(33477);
        __CLR4_1_2pttpttl3lqxuiz.R.inc(33478);final ToStringStyle style = new ToStringStyleImpl();
        __CLR4_1_2pttpttl3lqxuiz.R.inc(33479);style.setArrayEnd(null);
        __CLR4_1_2pttpttl3lqxuiz.R.inc(33480);assertEquals("", style.getArrayEnd());
    }finally{__CLR4_1_2pttpttl3lqxuiz.R.flushNeeded();}}

    @Test
    public void testSetArraySeparator() {__CLR4_1_2pttpttl3lqxuiz.R.globalSliceStart(getClass().getName(),33481);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_26b5mubpu1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pttpttl3lqxuiz.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pttpttl3lqxuiz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringStyleTest.testSetArraySeparator",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33481,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_26b5mubpu1(){try{__CLR4_1_2pttpttl3lqxuiz.R.inc(33481);
        __CLR4_1_2pttpttl3lqxuiz.R.inc(33482);final ToStringStyle style = new ToStringStyleImpl();
        __CLR4_1_2pttpttl3lqxuiz.R.inc(33483);style.setArraySeparator(null);
        __CLR4_1_2pttpttl3lqxuiz.R.inc(33484);assertEquals("", style.getArraySeparator());
    }finally{__CLR4_1_2pttpttl3lqxuiz.R.flushNeeded();}}

    @Test
    public void testSetContentStart() {__CLR4_1_2pttpttl3lqxuiz.R.globalSliceStart(getClass().getName(),33485);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_24cy31cpu5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pttpttl3lqxuiz.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pttpttl3lqxuiz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringStyleTest.testSetContentStart",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33485,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_24cy31cpu5(){try{__CLR4_1_2pttpttl3lqxuiz.R.inc(33485);
        __CLR4_1_2pttpttl3lqxuiz.R.inc(33486);final ToStringStyle style = new ToStringStyleImpl();
        __CLR4_1_2pttpttl3lqxuiz.R.inc(33487);style.setContentStart(null);
        __CLR4_1_2pttpttl3lqxuiz.R.inc(33488);assertEquals("", style.getContentStart());
    }finally{__CLR4_1_2pttpttl3lqxuiz.R.flushNeeded();}}

    @Test
    public void testSetContentEnd() {__CLR4_1_2pttpttl3lqxuiz.R.globalSliceStart(getClass().getName(),33489);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2avwjifpu9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pttpttl3lqxuiz.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pttpttl3lqxuiz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringStyleTest.testSetContentEnd",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33489,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2avwjifpu9(){try{__CLR4_1_2pttpttl3lqxuiz.R.inc(33489);
        __CLR4_1_2pttpttl3lqxuiz.R.inc(33490);final ToStringStyle style = new ToStringStyleImpl();
        __CLR4_1_2pttpttl3lqxuiz.R.inc(33491);style.setContentEnd(null);
        __CLR4_1_2pttpttl3lqxuiz.R.inc(33492);assertEquals("", style.getContentEnd());
    }finally{__CLR4_1_2pttpttl3lqxuiz.R.flushNeeded();}}

    @Test
    public void testSetFieldNameValueSeparator() {__CLR4_1_2pttpttl3lqxuiz.R.globalSliceStart(getClass().getName(),33493);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2zsjqopud();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pttpttl3lqxuiz.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pttpttl3lqxuiz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringStyleTest.testSetFieldNameValueSeparator",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33493,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2zsjqopud(){try{__CLR4_1_2pttpttl3lqxuiz.R.inc(33493);
        __CLR4_1_2pttpttl3lqxuiz.R.inc(33494);final ToStringStyle style = new ToStringStyleImpl();
        __CLR4_1_2pttpttl3lqxuiz.R.inc(33495);style.setFieldNameValueSeparator(null);
        __CLR4_1_2pttpttl3lqxuiz.R.inc(33496);assertEquals("", style.getFieldNameValueSeparator());
    }finally{__CLR4_1_2pttpttl3lqxuiz.R.flushNeeded();}}

    @Test
    public void testSetFieldSeparator() {__CLR4_1_2pttpttl3lqxuiz.R.globalSliceStart(getClass().getName(),33497);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2575b3ypuh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pttpttl3lqxuiz.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pttpttl3lqxuiz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringStyleTest.testSetFieldSeparator",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33497,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2575b3ypuh(){try{__CLR4_1_2pttpttl3lqxuiz.R.inc(33497);
        __CLR4_1_2pttpttl3lqxuiz.R.inc(33498);final ToStringStyle style = new ToStringStyleImpl();
        __CLR4_1_2pttpttl3lqxuiz.R.inc(33499);style.setFieldSeparator(null);
        __CLR4_1_2pttpttl3lqxuiz.R.inc(33500);assertEquals("", style.getFieldSeparator());
    }finally{__CLR4_1_2pttpttl3lqxuiz.R.flushNeeded();}}

    @Test
    public void testSetNullText() {__CLR4_1_2pttpttl3lqxuiz.R.globalSliceStart(getClass().getName(),33501);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2qdgaxhpul();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pttpttl3lqxuiz.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pttpttl3lqxuiz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringStyleTest.testSetNullText",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33501,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2qdgaxhpul(){try{__CLR4_1_2pttpttl3lqxuiz.R.inc(33501);
        __CLR4_1_2pttpttl3lqxuiz.R.inc(33502);final ToStringStyle style = new ToStringStyleImpl();
        __CLR4_1_2pttpttl3lqxuiz.R.inc(33503);style.setNullText(null);
        __CLR4_1_2pttpttl3lqxuiz.R.inc(33504);assertEquals("", style.getNullText());
    }finally{__CLR4_1_2pttpttl3lqxuiz.R.flushNeeded();}}

    @Test
    public void testSetSizeStartText() {__CLR4_1_2pttpttl3lqxuiz.R.globalSliceStart(getClass().getName(),33505);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2giqv6jpup();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pttpttl3lqxuiz.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pttpttl3lqxuiz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringStyleTest.testSetSizeStartText",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33505,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2giqv6jpup(){try{__CLR4_1_2pttpttl3lqxuiz.R.inc(33505);
        __CLR4_1_2pttpttl3lqxuiz.R.inc(33506);final ToStringStyle style = new ToStringStyleImpl();
        __CLR4_1_2pttpttl3lqxuiz.R.inc(33507);style.setSizeStartText(null);
        __CLR4_1_2pttpttl3lqxuiz.R.inc(33508);assertEquals("", style.getSizeStartText());
    }finally{__CLR4_1_2pttpttl3lqxuiz.R.flushNeeded();}}

    @Test
    public void testSetSizeEndText() {__CLR4_1_2pttpttl3lqxuiz.R.globalSliceStart(getClass().getName(),33509);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2l54ywyput();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pttpttl3lqxuiz.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pttpttl3lqxuiz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringStyleTest.testSetSizeEndText",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33509,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2l54ywyput(){try{__CLR4_1_2pttpttl3lqxuiz.R.inc(33509);
        __CLR4_1_2pttpttl3lqxuiz.R.inc(33510);final ToStringStyle style = new ToStringStyleImpl();
        __CLR4_1_2pttpttl3lqxuiz.R.inc(33511);style.setSizeEndText(null);
        __CLR4_1_2pttpttl3lqxuiz.R.inc(33512);assertEquals("", style.getSizeEndText());
    }finally{__CLR4_1_2pttpttl3lqxuiz.R.flushNeeded();}}

    @Test
    public void testSetSummaryObjectStartText() {__CLR4_1_2pttpttl3lqxuiz.R.globalSliceStart(getClass().getName(),33513);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2sl5uwvpux();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pttpttl3lqxuiz.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pttpttl3lqxuiz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringStyleTest.testSetSummaryObjectStartText",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33513,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2sl5uwvpux(){try{__CLR4_1_2pttpttl3lqxuiz.R.inc(33513);
        __CLR4_1_2pttpttl3lqxuiz.R.inc(33514);final ToStringStyle style = new ToStringStyleImpl();
        __CLR4_1_2pttpttl3lqxuiz.R.inc(33515);style.setSummaryObjectStartText(null);
        __CLR4_1_2pttpttl3lqxuiz.R.inc(33516);assertEquals("", style.getSummaryObjectStartText());
    }finally{__CLR4_1_2pttpttl3lqxuiz.R.flushNeeded();}}

    @Test
    public void testSetSummaryObjectEndText() {__CLR4_1_2pttpttl3lqxuiz.R.globalSliceStart(getClass().getName(),33517);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2othcd6pv1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2pttpttl3lqxuiz.R.rethrow($CLV_t2$);}finally{__CLR4_1_2pttpttl3lqxuiz.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.builder.ToStringStyleTest.testSetSummaryObjectEndText",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),33517,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2othcd6pv1(){try{__CLR4_1_2pttpttl3lqxuiz.R.inc(33517);
        __CLR4_1_2pttpttl3lqxuiz.R.inc(33518);final ToStringStyle style = new ToStringStyleImpl();
        __CLR4_1_2pttpttl3lqxuiz.R.inc(33519);style.setSummaryObjectEndText(null);
        __CLR4_1_2pttpttl3lqxuiz.R.inc(33520);assertEquals("", style.getSummaryObjectEndText());
    }finally{__CLR4_1_2pttpttl3lqxuiz.R.flushNeeded();}}

    /**
     * An object used to test {@link ToStringStyle}.
     * 
     */
    static class Person {
        /**
         * Test String field.
         */
        String name;

        /**
         * Test integer field.
         */
        int age;

        /**
         * Test boolean field.
         */
        boolean smoker;
    }
}
