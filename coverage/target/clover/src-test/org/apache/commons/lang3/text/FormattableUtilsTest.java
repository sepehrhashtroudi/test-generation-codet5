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
package org.apache.commons.lang3.text;

import static java.util.FormattableFlags.LEFT_JUSTIFY;
import static org.junit.Assert.assertEquals;

import java.util.Formatter;

import org.junit.Test;

/**
 * Unit tests {@link FormattableUtils}.
 *
 * @version $Id$
 */
public class FormattableUtilsTest {static class __CLR4_1_2tcatcal3lqxuv5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492830024L,8589935092L,38093,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Test
    public void testDefaultAppend() {__CLR4_1_2tcatcal3lqxuv5.R.globalSliceStart(getClass().getName(),38026);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_238asggtca();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2tcatcal3lqxuv5.R.rethrow($CLV_t2$);}finally{__CLR4_1_2tcatcal3lqxuv5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.FormattableUtilsTest.testDefaultAppend",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),38026,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_238asggtca(){try{__CLR4_1_2tcatcal3lqxuv5.R.inc(38026);
        __CLR4_1_2tcatcal3lqxuv5.R.inc(38027);assertEquals("foo", FormattableUtils.append("foo", new Formatter(), 0, -1, -1).toString());
        __CLR4_1_2tcatcal3lqxuv5.R.inc(38028);assertEquals("fo", FormattableUtils.append("foo", new Formatter(), 0, -1, 2).toString());
        __CLR4_1_2tcatcal3lqxuv5.R.inc(38029);assertEquals(" foo", FormattableUtils.append("foo", new Formatter(), 0, 4, -1).toString());
        __CLR4_1_2tcatcal3lqxuv5.R.inc(38030);assertEquals("   foo", FormattableUtils.append("foo", new Formatter(), 0, 6, -1).toString());
        __CLR4_1_2tcatcal3lqxuv5.R.inc(38031);assertEquals(" fo", FormattableUtils.append("foo", new Formatter(), 0, 3, 2).toString());
        __CLR4_1_2tcatcal3lqxuv5.R.inc(38032);assertEquals("   fo", FormattableUtils.append("foo", new Formatter(), 0, 5, 2).toString());
        __CLR4_1_2tcatcal3lqxuv5.R.inc(38033);assertEquals("foo ", FormattableUtils.append("foo", new Formatter(), LEFT_JUSTIFY, 4, -1).toString());
        __CLR4_1_2tcatcal3lqxuv5.R.inc(38034);assertEquals("foo   ", FormattableUtils.append("foo", new Formatter(), LEFT_JUSTIFY, 6, -1).toString());
        __CLR4_1_2tcatcal3lqxuv5.R.inc(38035);assertEquals("fo ", FormattableUtils.append("foo", new Formatter(), LEFT_JUSTIFY, 3, 2).toString());
        __CLR4_1_2tcatcal3lqxuv5.R.inc(38036);assertEquals("fo   ", FormattableUtils.append("foo", new Formatter(), LEFT_JUSTIFY, 5, 2).toString());
    }finally{__CLR4_1_2tcatcal3lqxuv5.R.flushNeeded();}}

    @Test
    public void testAlternatePadCharacter() {__CLR4_1_2tcatcal3lqxuv5.R.globalSliceStart(getClass().getName(),38037);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2y7bj45tcl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2tcatcal3lqxuv5.R.rethrow($CLV_t2$);}finally{__CLR4_1_2tcatcal3lqxuv5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.FormattableUtilsTest.testAlternatePadCharacter",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),38037,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2y7bj45tcl(){try{__CLR4_1_2tcatcal3lqxuv5.R.inc(38037);
        __CLR4_1_2tcatcal3lqxuv5.R.inc(38038);final char pad='_';
        __CLR4_1_2tcatcal3lqxuv5.R.inc(38039);assertEquals("foo", FormattableUtils.append("foo", new Formatter(), 0, -1, -1, pad).toString());
        __CLR4_1_2tcatcal3lqxuv5.R.inc(38040);assertEquals("fo", FormattableUtils.append("foo", new Formatter(), 0, -1, 2, pad).toString());
        __CLR4_1_2tcatcal3lqxuv5.R.inc(38041);assertEquals("_foo", FormattableUtils.append("foo", new Formatter(), 0, 4, -1, pad).toString());
        __CLR4_1_2tcatcal3lqxuv5.R.inc(38042);assertEquals("___foo", FormattableUtils.append("foo", new Formatter(), 0, 6, -1, pad).toString());
        __CLR4_1_2tcatcal3lqxuv5.R.inc(38043);assertEquals("_fo", FormattableUtils.append("foo", new Formatter(), 0, 3, 2, pad).toString());
        __CLR4_1_2tcatcal3lqxuv5.R.inc(38044);assertEquals("___fo", FormattableUtils.append("foo", new Formatter(), 0, 5, 2, pad).toString());
        __CLR4_1_2tcatcal3lqxuv5.R.inc(38045);assertEquals("foo_", FormattableUtils.append("foo", new Formatter(), LEFT_JUSTIFY, 4, -1, pad).toString());
        __CLR4_1_2tcatcal3lqxuv5.R.inc(38046);assertEquals("foo___", FormattableUtils.append("foo", new Formatter(), LEFT_JUSTIFY, 6, -1, pad).toString());
        __CLR4_1_2tcatcal3lqxuv5.R.inc(38047);assertEquals("fo_", FormattableUtils.append("foo", new Formatter(), LEFT_JUSTIFY, 3, 2, pad).toString());
        __CLR4_1_2tcatcal3lqxuv5.R.inc(38048);assertEquals("fo___", FormattableUtils.append("foo", new Formatter(), LEFT_JUSTIFY, 5, 2, pad).toString());
    }finally{__CLR4_1_2tcatcal3lqxuv5.R.flushNeeded();}}

    @Test
    public void testEllipsis() {__CLR4_1_2tcatcal3lqxuv5.R.globalSliceStart(getClass().getName(),38049);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2ujddp2tcx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2tcatcal3lqxuv5.R.rethrow($CLV_t2$);}finally{__CLR4_1_2tcatcal3lqxuv5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.FormattableUtilsTest.testEllipsis",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),38049,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2ujddp2tcx(){try{__CLR4_1_2tcatcal3lqxuv5.R.inc(38049);
        __CLR4_1_2tcatcal3lqxuv5.R.inc(38050);assertEquals("foo", FormattableUtils.append("foo", new Formatter(), 0, -1, -1, "*").toString());
        __CLR4_1_2tcatcal3lqxuv5.R.inc(38051);assertEquals("f*", FormattableUtils.append("foo", new Formatter(), 0, -1, 2, "*").toString());
        __CLR4_1_2tcatcal3lqxuv5.R.inc(38052);assertEquals(" foo", FormattableUtils.append("foo", new Formatter(), 0, 4, -1, "*").toString());
        __CLR4_1_2tcatcal3lqxuv5.R.inc(38053);assertEquals("   foo", FormattableUtils.append("foo", new Formatter(), 0, 6, -1, "*").toString());
        __CLR4_1_2tcatcal3lqxuv5.R.inc(38054);assertEquals(" f*", FormattableUtils.append("foo", new Formatter(), 0, 3, 2, "*").toString());
        __CLR4_1_2tcatcal3lqxuv5.R.inc(38055);assertEquals("   f*", FormattableUtils.append("foo", new Formatter(), 0, 5, 2, "*").toString());
        __CLR4_1_2tcatcal3lqxuv5.R.inc(38056);assertEquals("foo ", FormattableUtils.append("foo", new Formatter(), LEFT_JUSTIFY, 4, -1, "*").toString());
        __CLR4_1_2tcatcal3lqxuv5.R.inc(38057);assertEquals("foo   ", FormattableUtils.append("foo", new Formatter(), LEFT_JUSTIFY, 6, -1, "*").toString());
        __CLR4_1_2tcatcal3lqxuv5.R.inc(38058);assertEquals("f* ", FormattableUtils.append("foo", new Formatter(), LEFT_JUSTIFY, 3, 2, "*").toString());
        __CLR4_1_2tcatcal3lqxuv5.R.inc(38059);assertEquals("f*   ", FormattableUtils.append("foo", new Formatter(), LEFT_JUSTIFY, 5, 2, "*").toString());

        __CLR4_1_2tcatcal3lqxuv5.R.inc(38060);assertEquals("foo", FormattableUtils.append("foo", new Formatter(), 0, -1, -1, "+*").toString());
        __CLR4_1_2tcatcal3lqxuv5.R.inc(38061);assertEquals("+*", FormattableUtils.append("foo", new Formatter(), 0, -1, 2, "+*").toString());
        __CLR4_1_2tcatcal3lqxuv5.R.inc(38062);assertEquals(" foo", FormattableUtils.append("foo", new Formatter(), 0, 4, -1, "+*").toString());
        __CLR4_1_2tcatcal3lqxuv5.R.inc(38063);assertEquals("   foo", FormattableUtils.append("foo", new Formatter(), 0, 6, -1, "+*").toString());
        __CLR4_1_2tcatcal3lqxuv5.R.inc(38064);assertEquals(" +*", FormattableUtils.append("foo", new Formatter(), 0, 3, 2, "+*").toString());
        __CLR4_1_2tcatcal3lqxuv5.R.inc(38065);assertEquals("   +*", FormattableUtils.append("foo", new Formatter(), 0, 5, 2, "+*").toString());
        __CLR4_1_2tcatcal3lqxuv5.R.inc(38066);assertEquals("foo ", FormattableUtils.append("foo", new Formatter(), LEFT_JUSTIFY, 4, -1, "+*").toString());
        __CLR4_1_2tcatcal3lqxuv5.R.inc(38067);assertEquals("foo   ", FormattableUtils.append("foo", new Formatter(), LEFT_JUSTIFY, 6, -1, "+*").toString());
        __CLR4_1_2tcatcal3lqxuv5.R.inc(38068);assertEquals("+* ", FormattableUtils.append("foo", new Formatter(), LEFT_JUSTIFY, 3, 2, "+*").toString());
        __CLR4_1_2tcatcal3lqxuv5.R.inc(38069);assertEquals("+*   ", FormattableUtils.append("foo", new Formatter(), LEFT_JUSTIFY, 5, 2, "+*").toString());
    }finally{__CLR4_1_2tcatcal3lqxuv5.R.flushNeeded();}}

    @Test(expected=IllegalArgumentException.class)
    public void testIllegalEllipsis() {__CLR4_1_2tcatcal3lqxuv5.R.globalSliceStart(getClass().getName(),38070);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2jdfgf8tdi();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,73,108,108,101,103,97,108,69,108,108,105,112,115,105,115,58,32,91,73,108,108,101,103,97,108,65,114,103,117,109,101,110,116,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof IllegalArgumentException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2tcatcal3lqxuv5.R.rethrow($CLV_t2$);}finally{__CLR4_1_2tcatcal3lqxuv5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.FormattableUtilsTest.testIllegalEllipsis",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),38070,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2jdfgf8tdi(){try{__CLR4_1_2tcatcal3lqxuv5.R.inc(38070);
        __CLR4_1_2tcatcal3lqxuv5.R.inc(38071);FormattableUtils.append("foo", new Formatter(), 0, -1, 1, "xx");
    }finally{__CLR4_1_2tcatcal3lqxuv5.R.flushNeeded();}}

    @Test
    public void testAlternatePadCharAndEllipsis() {__CLR4_1_2tcatcal3lqxuv5.R.globalSliceStart(getClass().getName(),38072);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_22td4oitdk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2tcatcal3lqxuv5.R.rethrow($CLV_t2$);}finally{__CLR4_1_2tcatcal3lqxuv5.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.text.FormattableUtilsTest.testAlternatePadCharAndEllipsis",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),38072,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_22td4oitdk(){try{__CLR4_1_2tcatcal3lqxuv5.R.inc(38072);
        __CLR4_1_2tcatcal3lqxuv5.R.inc(38073);assertEquals("foo", FormattableUtils.append("foo", new Formatter(), 0, -1, -1, '_', "*").toString());
        __CLR4_1_2tcatcal3lqxuv5.R.inc(38074);assertEquals("f*", FormattableUtils.append("foo", new Formatter(), 0, -1, 2, '_', "*").toString());
        __CLR4_1_2tcatcal3lqxuv5.R.inc(38075);assertEquals("_foo", FormattableUtils.append("foo", new Formatter(), 0, 4, -1, '_', "*").toString());
        __CLR4_1_2tcatcal3lqxuv5.R.inc(38076);assertEquals("___foo", FormattableUtils.append("foo", new Formatter(), 0, 6, -1, '_', "*").toString());
        __CLR4_1_2tcatcal3lqxuv5.R.inc(38077);assertEquals("_f*", FormattableUtils.append("foo", new Formatter(), 0, 3, 2, '_', "*").toString());
        __CLR4_1_2tcatcal3lqxuv5.R.inc(38078);assertEquals("___f*", FormattableUtils.append("foo", new Formatter(), 0, 5, 2, '_', "*").toString());
        __CLR4_1_2tcatcal3lqxuv5.R.inc(38079);assertEquals("foo_", FormattableUtils.append("foo", new Formatter(), LEFT_JUSTIFY, 4, -1, '_', "*").toString());
        __CLR4_1_2tcatcal3lqxuv5.R.inc(38080);assertEquals("foo___", FormattableUtils.append("foo", new Formatter(), LEFT_JUSTIFY, 6, -1, '_', "*").toString());
        __CLR4_1_2tcatcal3lqxuv5.R.inc(38081);assertEquals("f*_", FormattableUtils.append("foo", new Formatter(), LEFT_JUSTIFY, 3, 2, '_', "*").toString());
        __CLR4_1_2tcatcal3lqxuv5.R.inc(38082);assertEquals("f*___", FormattableUtils.append("foo", new Formatter(), LEFT_JUSTIFY, 5, 2, '_', "*").toString());

        __CLR4_1_2tcatcal3lqxuv5.R.inc(38083);assertEquals("foo", FormattableUtils.append("foo", new Formatter(), 0, -1, -1, '_', "+*").toString());
        __CLR4_1_2tcatcal3lqxuv5.R.inc(38084);assertEquals("+*", FormattableUtils.append("foo", new Formatter(), 0, -1, 2, '_', "+*").toString());
        __CLR4_1_2tcatcal3lqxuv5.R.inc(38085);assertEquals("_foo", FormattableUtils.append("foo", new Formatter(), 0, 4, -1, '_', "+*").toString());
        __CLR4_1_2tcatcal3lqxuv5.R.inc(38086);assertEquals("___foo", FormattableUtils.append("foo", new Formatter(), 0, 6, -1, '_', "+*").toString());
        __CLR4_1_2tcatcal3lqxuv5.R.inc(38087);assertEquals("_+*", FormattableUtils.append("foo", new Formatter(), 0, 3, 2, '_', "+*").toString());
        __CLR4_1_2tcatcal3lqxuv5.R.inc(38088);assertEquals("___+*", FormattableUtils.append("foo", new Formatter(), 0, 5, 2, '_', "+*").toString());
        __CLR4_1_2tcatcal3lqxuv5.R.inc(38089);assertEquals("foo_", FormattableUtils.append("foo", new Formatter(), LEFT_JUSTIFY, 4, -1, '_', "+*").toString());
        __CLR4_1_2tcatcal3lqxuv5.R.inc(38090);assertEquals("foo___", FormattableUtils.append("foo", new Formatter(), LEFT_JUSTIFY, 6, -1, '_', "+*").toString());
        __CLR4_1_2tcatcal3lqxuv5.R.inc(38091);assertEquals("+*_", FormattableUtils.append("foo", new Formatter(), LEFT_JUSTIFY, 3, 2, '_', "+*").toString());
        __CLR4_1_2tcatcal3lqxuv5.R.inc(38092);assertEquals("+*___", FormattableUtils.append("foo", new Formatter(), LEFT_JUSTIFY, 5, 2, '_', "+*").toString());
    }finally{__CLR4_1_2tcatcal3lqxuv5.R.flushNeeded();}}

}
