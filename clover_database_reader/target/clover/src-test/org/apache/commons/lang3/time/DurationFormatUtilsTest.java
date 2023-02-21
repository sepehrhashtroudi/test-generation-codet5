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

package org.apache.commons.lang3.time;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.Calendar;
import java.util.TimeZone;

/**
 * TestCase for DurationFormatUtils.
 * 
 */
public class DurationFormatUtilsTest {static class __CLR4_1_2xa6xa6l3lqxv7c{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492830024L,8589935092L,43460,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    // -----------------------------------------------------------------------
    @Test
    public void testConstructor() {__CLR4_1_2xa6xa6l3lqxv7c.R.globalSliceStart(getClass().getName(),43134);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2uefs8hxa6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2xa6xa6l3lqxv7c.R.rethrow($CLV_t2$);}finally{__CLR4_1_2xa6xa6l3lqxv7c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DurationFormatUtilsTest.testConstructor",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),43134,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2uefs8hxa6(){try{__CLR4_1_2xa6xa6l3lqxv7c.R.inc(43134);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43135);assertNotNull(new DurationFormatUtils());
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43136);final Constructor<?>[] cons = DurationFormatUtils.class.getDeclaredConstructors();
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43137);assertEquals(1, cons.length);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43138);assertTrue(Modifier.isPublic(cons[0].getModifiers()));
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43139);assertTrue(Modifier.isPublic(DurationFormatUtils.class.getModifiers()));
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43140);assertFalse(Modifier.isFinal(DurationFormatUtils.class.getModifiers()));
    }finally{__CLR4_1_2xa6xa6l3lqxv7c.R.flushNeeded();}}

    // -----------------------------------------------------------------------
    @Test
    public void testFormatDurationWords() {__CLR4_1_2xa6xa6l3lqxv7c.R.globalSliceStart(getClass().getName(),43141);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2olh5d9xad();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2xa6xa6l3lqxv7c.R.rethrow($CLV_t2$);}finally{__CLR4_1_2xa6xa6l3lqxv7c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DurationFormatUtilsTest.testFormatDurationWords",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),43141,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2olh5d9xad(){try{__CLR4_1_2xa6xa6l3lqxv7c.R.inc(43141);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43142);String text = null;

        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43143);text = DurationFormatUtils.formatDurationWords(50 * 1000, true, false);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43144);assertEquals("50 seconds", text);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43145);text = DurationFormatUtils.formatDurationWords(65 * 1000, true, false);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43146);assertEquals("1 minute 5 seconds", text);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43147);text = DurationFormatUtils.formatDurationWords(120 * 1000, true, false);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43148);assertEquals("2 minutes 0 seconds", text);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43149);text = DurationFormatUtils.formatDurationWords(121 * 1000, true, false);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43150);assertEquals("2 minutes 1 second", text);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43151);text = DurationFormatUtils.formatDurationWords(72 * 60 * 1000, true, false);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43152);assertEquals("1 hour 12 minutes 0 seconds", text);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43153);text = DurationFormatUtils.formatDurationWords(24 * 60 * 60 * 1000, true, false);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43154);assertEquals("1 day 0 hours 0 minutes 0 seconds", text);

        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43155);text = DurationFormatUtils.formatDurationWords(50 * 1000, true, true);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43156);assertEquals("50 seconds", text);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43157);text = DurationFormatUtils.formatDurationWords(65 * 1000, true, true);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43158);assertEquals("1 minute 5 seconds", text);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43159);text = DurationFormatUtils.formatDurationWords(120 * 1000, true, true);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43160);assertEquals("2 minutes", text);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43161);text = DurationFormatUtils.formatDurationWords(121 * 1000, true, true);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43162);assertEquals("2 minutes 1 second", text);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43163);text = DurationFormatUtils.formatDurationWords(72 * 60 * 1000, true, true);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43164);assertEquals("1 hour 12 minutes", text);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43165);text = DurationFormatUtils.formatDurationWords(24 * 60 * 60 * 1000, true, true);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43166);assertEquals("1 day", text);

        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43167);text = DurationFormatUtils.formatDurationWords(50 * 1000, false, true);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43168);assertEquals("0 days 0 hours 0 minutes 50 seconds", text);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43169);text = DurationFormatUtils.formatDurationWords(65 * 1000, false, true);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43170);assertEquals("0 days 0 hours 1 minute 5 seconds", text);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43171);text = DurationFormatUtils.formatDurationWords(120 * 1000, false, true);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43172);assertEquals("0 days 0 hours 2 minutes", text);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43173);text = DurationFormatUtils.formatDurationWords(121 * 1000, false, true);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43174);assertEquals("0 days 0 hours 2 minutes 1 second", text);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43175);text = DurationFormatUtils.formatDurationWords(72 * 60 * 1000, false, true);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43176);assertEquals("0 days 1 hour 12 minutes", text);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43177);text = DurationFormatUtils.formatDurationWords(24 * 60 * 60 * 1000, false, true);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43178);assertEquals("1 day", text);

        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43179);text = DurationFormatUtils.formatDurationWords(50 * 1000, false, false);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43180);assertEquals("0 days 0 hours 0 minutes 50 seconds", text);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43181);text = DurationFormatUtils.formatDurationWords(65 * 1000, false, false);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43182);assertEquals("0 days 0 hours 1 minute 5 seconds", text);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43183);text = DurationFormatUtils.formatDurationWords(120 * 1000, false, false);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43184);assertEquals("0 days 0 hours 2 minutes 0 seconds", text);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43185);text = DurationFormatUtils.formatDurationWords(121 * 1000, false, false);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43186);assertEquals("0 days 0 hours 2 minutes 1 second", text);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43187);text = DurationFormatUtils.formatDurationWords(72 * 60 * 1000, false, false);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43188);assertEquals("0 days 1 hour 12 minutes 0 seconds", text);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43189);text = DurationFormatUtils.formatDurationWords(24 * 60 * 60 * 1000 + 72 * 60 * 1000, false, false);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43190);assertEquals("1 day 1 hour 12 minutes 0 seconds", text);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43191);text = DurationFormatUtils.formatDurationWords(2 * 24 * 60 * 60 * 1000 + 72 * 60 * 1000, false, false);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43192);assertEquals("2 days 1 hour 12 minutes 0 seconds", text);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43193);for (int i = 2; (((i < 31)&&(__CLR4_1_2xa6xa6l3lqxv7c.R.iget(43194)!=0|true))||(__CLR4_1_2xa6xa6l3lqxv7c.R.iget(43195)==0&false)); i++) {{
            __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43196);text = DurationFormatUtils.formatDurationWords(i * 24 * 60 * 60 * 1000L, false, false);
            // assertEquals(i + " days 0 hours 0 minutes 0 seconds", text);
            //            
            // junit.framework.ComparisonFailure: expected:<25 days 0 hours 0 minutes 0...> but was:<-24 days -17 hours
            // -2 minutes -47...>
            // at junit.framework.Assert.assertEquals(Assert.java:81)
            // at junit.framework.Assert.assertEquals(Assert.java:87)
            // at
            // org.apache.commons.lang.time.DurationFormatUtilsTest.testFormatDurationWords(DurationFormatUtilsTest.java:124)
            // at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
            // at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:39)
            // at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:25)
            // at java.lang.reflect.Method.invoke(Method.java:324)
            // at junit.framework.TestCase.runTest(TestCase.java:154)
            // at junit.framework.TestCase.runBare(TestCase.java:127)
            // at junit.framework.TestResult$1.protect(TestResult.java:106)
            // at junit.framework.TestResult.runProtected(TestResult.java:124)
            // at junit.framework.TestResult.run(TestResult.java:109)
            // at junit.framework.TestCase.run(TestCase.java:118)
            // at junit.framework.TestSuite.runTest(TestSuite.java:208)
            // at junit.framework.TestSuite.run(TestSuite.java:203)
            // at org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:478)
            // at org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:344)
            // at org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:196)
        }
    }}finally{__CLR4_1_2xa6xa6l3lqxv7c.R.flushNeeded();}}

    /**
     * Tests that "1 <unit>s" gets converted to "1 <unit>" but that "11 <unit>s" is left alone.
     */
    @Test
    public void testFormatDurationPluralWords() {__CLR4_1_2xa6xa6l3lqxv7c.R.globalSliceStart(getClass().getName(),43197);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2yg8j3jxbx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2xa6xa6l3lqxv7c.R.rethrow($CLV_t2$);}finally{__CLR4_1_2xa6xa6l3lqxv7c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DurationFormatUtilsTest.testFormatDurationPluralWords",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),43197,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2yg8j3jxbx(){try{__CLR4_1_2xa6xa6l3lqxv7c.R.inc(43197);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43198);final long oneSecond = 1000;
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43199);final long oneMinute = oneSecond * 60;
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43200);final long oneHour = oneMinute * 60;
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43201);final long oneDay = oneHour * 24;
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43202);String text = null;

        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43203);text = DurationFormatUtils.formatDurationWords(oneSecond, false, false);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43204);assertEquals("0 days 0 hours 0 minutes 1 second", text);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43205);text = DurationFormatUtils.formatDurationWords(oneSecond * 2, false, false);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43206);assertEquals("0 days 0 hours 0 minutes 2 seconds", text);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43207);text = DurationFormatUtils.formatDurationWords(oneSecond * 11, false, false);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43208);assertEquals("0 days 0 hours 0 minutes 11 seconds", text);

        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43209);text = DurationFormatUtils.formatDurationWords(oneMinute, false, false);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43210);assertEquals("0 days 0 hours 1 minute 0 seconds", text);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43211);text = DurationFormatUtils.formatDurationWords(oneMinute * 2, false, false);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43212);assertEquals("0 days 0 hours 2 minutes 0 seconds", text);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43213);text = DurationFormatUtils.formatDurationWords(oneMinute * 11, false, false);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43214);assertEquals("0 days 0 hours 11 minutes 0 seconds", text);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43215);text = DurationFormatUtils.formatDurationWords(oneMinute + oneSecond, false, false);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43216);assertEquals("0 days 0 hours 1 minute 1 second", text);

        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43217);text = DurationFormatUtils.formatDurationWords(oneHour, false, false);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43218);assertEquals("0 days 1 hour 0 minutes 0 seconds", text);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43219);text = DurationFormatUtils.formatDurationWords(oneHour * 2, false, false);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43220);assertEquals("0 days 2 hours 0 minutes 0 seconds", text);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43221);text = DurationFormatUtils.formatDurationWords(oneHour * 11, false, false);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43222);assertEquals("0 days 11 hours 0 minutes 0 seconds", text);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43223);text = DurationFormatUtils.formatDurationWords(oneHour + oneMinute + oneSecond, false, false);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43224);assertEquals("0 days 1 hour 1 minute 1 second", text);

        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43225);text = DurationFormatUtils.formatDurationWords(oneDay, false, false);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43226);assertEquals("1 day 0 hours 0 minutes 0 seconds", text);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43227);text = DurationFormatUtils.formatDurationWords(oneDay * 2, false, false);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43228);assertEquals("2 days 0 hours 0 minutes 0 seconds", text);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43229);text = DurationFormatUtils.formatDurationWords(oneDay * 11, false, false);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43230);assertEquals("11 days 0 hours 0 minutes 0 seconds", text);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43231);text = DurationFormatUtils.formatDurationWords(oneDay + oneHour + oneMinute + oneSecond, false, false);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43232);assertEquals("1 day 1 hour 1 minute 1 second", text);
    }finally{__CLR4_1_2xa6xa6l3lqxv7c.R.flushNeeded();}}

    @Test
    public void testFormatDurationHMS() {__CLR4_1_2xa6xa6l3lqxv7c.R.globalSliceStart(getClass().getName(),43233);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_29t123sxcx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2xa6xa6l3lqxv7c.R.rethrow($CLV_t2$);}finally{__CLR4_1_2xa6xa6l3lqxv7c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DurationFormatUtilsTest.testFormatDurationHMS",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),43233,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_29t123sxcx(){try{__CLR4_1_2xa6xa6l3lqxv7c.R.inc(43233);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43234);long time = 0;
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43235);assertEquals("0:00:00.000", DurationFormatUtils.formatDurationHMS(time));

        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43236);time = 1;
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43237);assertEquals("0:00:00.001", DurationFormatUtils.formatDurationHMS(time));

        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43238);time = 15;
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43239);assertEquals("0:00:00.015", DurationFormatUtils.formatDurationHMS(time));

        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43240);time = 165;
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43241);assertEquals("0:00:00.165", DurationFormatUtils.formatDurationHMS(time));

        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43242);time = 1675;
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43243);assertEquals("0:00:01.675", DurationFormatUtils.formatDurationHMS(time));

        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43244);time = 13465;
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43245);assertEquals("0:00:13.465", DurationFormatUtils.formatDurationHMS(time));

        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43246);time = 72789;
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43247);assertEquals("0:01:12.789", DurationFormatUtils.formatDurationHMS(time));

        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43248);time = 12789 + 32 * 60000;
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43249);assertEquals("0:32:12.789", DurationFormatUtils.formatDurationHMS(time));

        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43250);time = 12789 + 62 * 60000;
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43251);assertEquals("1:02:12.789", DurationFormatUtils.formatDurationHMS(time));
    }finally{__CLR4_1_2xa6xa6l3lqxv7c.R.flushNeeded();}}

    @Test
    public void testFormatDurationISO() {__CLR4_1_2xa6xa6l3lqxv7c.R.globalSliceStart(getClass().getName(),43252);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2bb1p67xdg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2xa6xa6l3lqxv7c.R.rethrow($CLV_t2$);}finally{__CLR4_1_2xa6xa6l3lqxv7c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DurationFormatUtilsTest.testFormatDurationISO",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),43252,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2bb1p67xdg(){try{__CLR4_1_2xa6xa6l3lqxv7c.R.inc(43252);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43253);assertEquals("P0Y0M0DT0H0M0.000S", DurationFormatUtils.formatDurationISO(0L));
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43254);assertEquals("P0Y0M0DT0H0M0.001S", DurationFormatUtils.formatDurationISO(1L));
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43255);assertEquals("P0Y0M0DT0H0M0.010S", DurationFormatUtils.formatDurationISO(10L));
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43256);assertEquals("P0Y0M0DT0H0M0.100S", DurationFormatUtils.formatDurationISO(100L));
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43257);assertEquals("P0Y0M0DT0H1M15.321S", DurationFormatUtils.formatDurationISO(75321L));
    }finally{__CLR4_1_2xa6xa6l3lqxv7c.R.flushNeeded();}}

    @Test
    public void testFormatDuration() {__CLR4_1_2xa6xa6l3lqxv7c.R.globalSliceStart(getClass().getName(),43258);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2dunrlwxdm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2xa6xa6l3lqxv7c.R.rethrow($CLV_t2$);}finally{__CLR4_1_2xa6xa6l3lqxv7c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DurationFormatUtilsTest.testFormatDuration",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),43258,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2dunrlwxdm(){try{__CLR4_1_2xa6xa6l3lqxv7c.R.inc(43258);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43259);long duration = 0;
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43260);assertEquals("0", DurationFormatUtils.formatDuration(duration, "y"));
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43261);assertEquals("0", DurationFormatUtils.formatDuration(duration, "M"));
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43262);assertEquals("0", DurationFormatUtils.formatDuration(duration, "d"));
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43263);assertEquals("0", DurationFormatUtils.formatDuration(duration, "H"));
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43264);assertEquals("0", DurationFormatUtils.formatDuration(duration, "m"));
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43265);assertEquals("0", DurationFormatUtils.formatDuration(duration, "s"));
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43266);assertEquals("0", DurationFormatUtils.formatDuration(duration, "S"));
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43267);assertEquals("0000", DurationFormatUtils.formatDuration(duration, "SSSS"));
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43268);assertEquals("0000", DurationFormatUtils.formatDuration(duration, "yyyy"));
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43269);assertEquals("0000", DurationFormatUtils.formatDuration(duration, "yyMM"));

        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43270);duration = 60 * 1000;
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43271);assertEquals("0", DurationFormatUtils.formatDuration(duration, "y"));
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43272);assertEquals("0", DurationFormatUtils.formatDuration(duration, "M"));
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43273);assertEquals("0", DurationFormatUtils.formatDuration(duration, "d"));
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43274);assertEquals("0", DurationFormatUtils.formatDuration(duration, "H"));
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43275);assertEquals("1", DurationFormatUtils.formatDuration(duration, "m"));
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43276);assertEquals("60", DurationFormatUtils.formatDuration(duration, "s"));
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43277);assertEquals("60000", DurationFormatUtils.formatDuration(duration, "S"));
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43278);assertEquals("01:00", DurationFormatUtils.formatDuration(duration, "mm:ss"));

        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43279);final Calendar base = Calendar.getInstance();
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43280);base.set(2000, 0, 1, 0, 0, 0);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43281);base.set(Calendar.MILLISECOND, 0);

        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43282);final Calendar cal = Calendar.getInstance();
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43283);cal.set(2003, 1, 1, 0, 0, 0);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43284);cal.set(Calendar.MILLISECOND, 0);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43285);duration = cal.getTime().getTime() - base.getTime().getTime(); // duration from 2000-01-01 to cal
        // don't use 1970 in test as time zones were less reliable in 1970 than now
        // remember that duration formatting ignores time zones, working on strict hour lengths
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43286);final int days = 366 + 365 + 365 + 31;
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43287);assertEquals("0 0 " + days, DurationFormatUtils.formatDuration(duration, "y M d"));
    }finally{__CLR4_1_2xa6xa6l3lqxv7c.R.flushNeeded();}}

    @Test
    public void testFormatPeriodISO() {__CLR4_1_2xa6xa6l3lqxv7c.R.globalSliceStart(getClass().getName(),43288);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_26fsqwuxeg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2xa6xa6l3lqxv7c.R.rethrow($CLV_t2$);}finally{__CLR4_1_2xa6xa6l3lqxv7c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DurationFormatUtilsTest.testFormatPeriodISO",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),43288,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_26fsqwuxeg(){try{__CLR4_1_2xa6xa6l3lqxv7c.R.inc(43288);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43289);final TimeZone timeZone = TimeZone.getTimeZone("GMT-3");
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43290);final Calendar base = Calendar.getInstance(timeZone);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43291);base.set(1970, 0, 1, 0, 0, 0);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43292);base.set(Calendar.MILLISECOND, 0);

        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43293);final Calendar cal = Calendar.getInstance(timeZone);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43294);cal.set(2002, 1, 23, 9, 11, 12);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43295);cal.set(Calendar.MILLISECOND, 1);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43296);String text;
        // repeat a test from testDateTimeISO to compare extended and not extended.
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43297);text = DateFormatUtils.ISO_DATETIME_TIME_ZONE_FORMAT.format(cal);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43298);assertEquals("2002-02-23T09:11:12-03:00", text);
        // test fixture is the same as above, but now with extended format.
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43299);text = DurationFormatUtils.formatPeriod(base.getTime().getTime(), cal.getTime().getTime(),
                DurationFormatUtils.ISO_EXTENDED_FORMAT_PATTERN, false, timeZone);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43300);assertEquals("P32Y1M22DT9H11M12.001S", text);
        // test fixture from example in http://www.w3.org/TR/xmlschema-2/#duration
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43301);cal.set(1971, 1, 3, 10, 30, 0);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43302);cal.set(Calendar.MILLISECOND, 0);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43303);text = DurationFormatUtils.formatPeriod(base.getTime().getTime(), cal.getTime().getTime(),
                DurationFormatUtils.ISO_EXTENDED_FORMAT_PATTERN, false, timeZone);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43304);assertEquals("P1Y1M2DT10H30M0.000S", text);
        // want a way to say 'don't print the seconds in format()' or other fields for that matter:
        // assertEquals("P1Y2M3DT10H30M", text);
    }finally{__CLR4_1_2xa6xa6l3lqxv7c.R.flushNeeded();}}

    @Test
    public void testFormatPeriod() {__CLR4_1_2xa6xa6l3lqxv7c.R.globalSliceStart(getClass().getName(),43305);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_27dc7ddxex();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2xa6xa6l3lqxv7c.R.rethrow($CLV_t2$);}finally{__CLR4_1_2xa6xa6l3lqxv7c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DurationFormatUtilsTest.testFormatPeriod",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),43305,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_27dc7ddxex(){try{__CLR4_1_2xa6xa6l3lqxv7c.R.inc(43305);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43306);final Calendar cal1970 = Calendar.getInstance();
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43307);cal1970.set(1970, 0, 1, 0, 0, 0);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43308);cal1970.set(Calendar.MILLISECOND, 0);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43309);final long time1970 = cal1970.getTime().getTime();

        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43310);assertEquals("0", DurationFormatUtils.formatPeriod(time1970, time1970, "y"));
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43311);assertEquals("0", DurationFormatUtils.formatPeriod(time1970, time1970, "M"));
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43312);assertEquals("0", DurationFormatUtils.formatPeriod(time1970, time1970, "d"));
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43313);assertEquals("0", DurationFormatUtils.formatPeriod(time1970, time1970, "H"));
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43314);assertEquals("0", DurationFormatUtils.formatPeriod(time1970, time1970, "m"));
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43315);assertEquals("0", DurationFormatUtils.formatPeriod(time1970, time1970, "s"));
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43316);assertEquals("0", DurationFormatUtils.formatPeriod(time1970, time1970, "S"));
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43317);assertEquals("0000", DurationFormatUtils.formatPeriod(time1970, time1970, "SSSS"));
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43318);assertEquals("0000", DurationFormatUtils.formatPeriod(time1970, time1970, "yyyy"));
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43319);assertEquals("0000", DurationFormatUtils.formatPeriod(time1970, time1970, "yyMM"));

        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43320);long time = time1970 + 60 * 1000;
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43321);assertEquals("0", DurationFormatUtils.formatPeriod(time1970, time, "y"));
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43322);assertEquals("0", DurationFormatUtils.formatPeriod(time1970, time, "M"));
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43323);assertEquals("0", DurationFormatUtils.formatPeriod(time1970, time, "d"));
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43324);assertEquals("0", DurationFormatUtils.formatPeriod(time1970, time, "H"));
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43325);assertEquals("1", DurationFormatUtils.formatPeriod(time1970, time, "m"));
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43326);assertEquals("60", DurationFormatUtils.formatPeriod(time1970, time, "s"));
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43327);assertEquals("60000", DurationFormatUtils.formatPeriod(time1970, time, "S"));
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43328);assertEquals("01:00", DurationFormatUtils.formatPeriod(time1970, time, "mm:ss"));

        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43329);final Calendar cal = Calendar.getInstance();
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43330);cal.set(1973, 6, 1, 0, 0, 0);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43331);cal.set(Calendar.MILLISECOND, 0);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43332);time = cal.getTime().getTime();
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43333);assertEquals("36", DurationFormatUtils.formatPeriod(time1970, time, "yM"));
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43334);assertEquals("3 years 6 months", DurationFormatUtils.formatPeriod(time1970, time, "y' years 'M' months'"));
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43335);assertEquals("03/06", DurationFormatUtils.formatPeriod(time1970, time, "yy/MM"));

        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43336);cal.set(1973, 10, 1, 0, 0, 0);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43337);cal.set(Calendar.MILLISECOND, 0);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43338);time = cal.getTime().getTime();
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43339);assertEquals("310", DurationFormatUtils.formatPeriod(time1970, time, "yM"));
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43340);assertEquals("3 years 10 months", DurationFormatUtils.formatPeriod(time1970, time, "y' years 'M' months'"));
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43341);assertEquals("03/10", DurationFormatUtils.formatPeriod(time1970, time, "yy/MM"));

        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43342);cal.set(1974, 0, 1, 0, 0, 0);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43343);cal.set(Calendar.MILLISECOND, 0);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43344);time = cal.getTime().getTime();
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43345);assertEquals("40", DurationFormatUtils.formatPeriod(time1970, time, "yM"));
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43346);assertEquals("4 years 0 months", DurationFormatUtils.formatPeriod(time1970, time, "y' years 'M' months'"));
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43347);assertEquals("04/00", DurationFormatUtils.formatPeriod(time1970, time, "yy/MM"));
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43348);assertEquals("48", DurationFormatUtils.formatPeriod(time1970, time, "M"));
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43349);assertEquals("48", DurationFormatUtils.formatPeriod(time1970, time, "MM"));
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43350);assertEquals("048", DurationFormatUtils.formatPeriod(time1970, time, "MMM"));
    }finally{__CLR4_1_2xa6xa6l3lqxv7c.R.flushNeeded();}}

    @Test
    public void testLexx() {__CLR4_1_2xa6xa6l3lqxv7c.R.globalSliceStart(getClass().getName(),43351);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2f6760exg7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2xa6xa6l3lqxv7c.R.rethrow($CLV_t2$);}finally{__CLR4_1_2xa6xa6l3lqxv7c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DurationFormatUtilsTest.testLexx",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),43351,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2f6760exg7(){try{__CLR4_1_2xa6xa6l3lqxv7c.R.inc(43351);
        // tests each constant
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43352);assertArrayEquals(new DurationFormatUtils.Token[]{
            new DurationFormatUtils.Token(DurationFormatUtils.y, 1),
            new DurationFormatUtils.Token(DurationFormatUtils.M, 1),
            new DurationFormatUtils.Token(DurationFormatUtils.d, 1),
            new DurationFormatUtils.Token(DurationFormatUtils.H, 1),
            new DurationFormatUtils.Token(DurationFormatUtils.m, 1),
            new DurationFormatUtils.Token(DurationFormatUtils.s, 1),
            new DurationFormatUtils.Token(DurationFormatUtils.S, 1)}, DurationFormatUtils.lexx("yMdHmsS"));

        // tests the ISO8601-like
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43353);assertArrayEquals(new DurationFormatUtils.Token[]{
            new DurationFormatUtils.Token(DurationFormatUtils.H, 1),
            new DurationFormatUtils.Token(new StringBuilder(":"), 1),
            new DurationFormatUtils.Token(DurationFormatUtils.m, 2),
            new DurationFormatUtils.Token(new StringBuilder(":"), 1),
            new DurationFormatUtils.Token(DurationFormatUtils.s, 2),
            new DurationFormatUtils.Token(new StringBuilder("."), 1),
            new DurationFormatUtils.Token(DurationFormatUtils.S, 3)}, DurationFormatUtils.lexx("H:mm:ss.SSS"));

        // test the iso extended format
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43354);assertArrayEquals(new DurationFormatUtils.Token[]{
            new DurationFormatUtils.Token(new StringBuilder("P"), 1),
            new DurationFormatUtils.Token(DurationFormatUtils.y, 4),
            new DurationFormatUtils.Token(new StringBuilder("Y"), 1),
            new DurationFormatUtils.Token(DurationFormatUtils.M, 1),
            new DurationFormatUtils.Token(new StringBuilder("M"), 1),
            new DurationFormatUtils.Token(DurationFormatUtils.d, 1),
            new DurationFormatUtils.Token(new StringBuilder("DT"), 1),
            new DurationFormatUtils.Token(DurationFormatUtils.H, 1),
            new DurationFormatUtils.Token(new StringBuilder("H"), 1),
            new DurationFormatUtils.Token(DurationFormatUtils.m, 1),
            new DurationFormatUtils.Token(new StringBuilder("M"), 1),
            new DurationFormatUtils.Token(DurationFormatUtils.s, 1),
            new DurationFormatUtils.Token(new StringBuilder("."), 1),
            new DurationFormatUtils.Token(DurationFormatUtils.S, 1),
            new DurationFormatUtils.Token(new StringBuilder("S"), 1)}, DurationFormatUtils
                .lexx(DurationFormatUtils.ISO_EXTENDED_FORMAT_PATTERN));

        // test failures in equals
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43355);final DurationFormatUtils.Token token = new DurationFormatUtils.Token(DurationFormatUtils.y, 4);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43356);assertFalse("Token equal to non-Token class. ", token.equals(new Object()));
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43357);assertFalse("Token equal to Token with wrong value class. ", token.equals(new DurationFormatUtils.Token(
                new Object())));
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43358);assertFalse("Token equal to Token with different count. ", token.equals(new DurationFormatUtils.Token(
                DurationFormatUtils.y, 1)));
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43359);final DurationFormatUtils.Token numToken = new DurationFormatUtils.Token(Integer.valueOf(1), 4);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43360);assertTrue("Token with Number value not equal to itself. ", numToken.equals(numToken));
    }finally{__CLR4_1_2xa6xa6l3lqxv7c.R.flushNeeded();}}


    // http://issues.apache.org/bugzilla/show_bug.cgi?id=38401
    @Test
    public void testBugzilla38401() {__CLR4_1_2xa6xa6l3lqxv7c.R.globalSliceStart(getClass().getName(),43361);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2w7elevxgh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2xa6xa6l3lqxv7c.R.rethrow($CLV_t2$);}finally{__CLR4_1_2xa6xa6l3lqxv7c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DurationFormatUtilsTest.testBugzilla38401",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),43361,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2w7elevxgh(){try{__CLR4_1_2xa6xa6l3lqxv7c.R.inc(43361);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43362);assertEqualDuration( "0000/00/30 16:00:00 000", new int[] { 2006, 0, 26, 18, 47, 34 }, 
                             new int[] { 2006, 1, 26, 10, 47, 34 }, "yyyy/MM/dd HH:mm:ss SSS");
    }finally{__CLR4_1_2xa6xa6l3lqxv7c.R.flushNeeded();}}

    // https://issues.apache.org/jira/browse/LANG-281
    @Test
    public void testJiraLang281() {__CLR4_1_2xa6xa6l3lqxv7c.R.globalSliceStart(getClass().getName(),43363);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2mnc204xgj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2xa6xa6l3lqxv7c.R.rethrow($CLV_t2$);}finally{__CLR4_1_2xa6xa6l3lqxv7c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DurationFormatUtilsTest.testJiraLang281",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),43363,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2mnc204xgj(){try{__CLR4_1_2xa6xa6l3lqxv7c.R.inc(43363);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43364);assertEqualDuration( "09", new int[] { 2005, 11, 31, 0, 0, 0 }, 
                             new int[] { 2006, 9, 6, 0, 0, 0 }, "MM");
    }finally{__CLR4_1_2xa6xa6l3lqxv7c.R.flushNeeded();}}

    @Test
    public void testLANG815() {__CLR4_1_2xa6xa6l3lqxv7c.R.globalSliceStart(getClass().getName(),43365);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2j8cevxxgl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2xa6xa6l3lqxv7c.R.rethrow($CLV_t2$);}finally{__CLR4_1_2xa6xa6l3lqxv7c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DurationFormatUtilsTest.testLANG815",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),43365,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2j8cevxxgl(){try{__CLR4_1_2xa6xa6l3lqxv7c.R.inc(43365);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43366);final Calendar calendar = Calendar.getInstance();
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43367);calendar.set(2012, 6, 30, 0, 0, 0);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43368);final long startMillis = calendar.getTimeInMillis();

        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43369);calendar.set(2012, 8, 8);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43370);final long endMillis = calendar.getTimeInMillis();

        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43371);assertEquals("1 9", DurationFormatUtils.formatPeriod(startMillis, endMillis, "M d"));
    }finally{__CLR4_1_2xa6xa6l3lqxv7c.R.flushNeeded();}}

    // Testing the under a day range in DurationFormatUtils.formatPeriod
    @Test
    public void testLowDurations() {__CLR4_1_2xa6xa6l3lqxv7c.R.globalSliceStart(getClass().getName(),43372);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2dhsjoxgs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2xa6xa6l3lqxv7c.R.rethrow($CLV_t2$);}finally{__CLR4_1_2xa6xa6l3lqxv7c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DurationFormatUtilsTest.testLowDurations",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),43372,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2dhsjoxgs(){try{__CLR4_1_2xa6xa6l3lqxv7c.R.inc(43372);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43373);for(int hr=0; (((hr < 24)&&(__CLR4_1_2xa6xa6l3lqxv7c.R.iget(43374)!=0|true))||(__CLR4_1_2xa6xa6l3lqxv7c.R.iget(43375)==0&false)); hr++) {{
            __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43376);for(int min=0; (((min < 60)&&(__CLR4_1_2xa6xa6l3lqxv7c.R.iget(43377)!=0|true))||(__CLR4_1_2xa6xa6l3lqxv7c.R.iget(43378)==0&false)); min++) {{
                __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43379);for(int sec=0; (((sec < 60)&&(__CLR4_1_2xa6xa6l3lqxv7c.R.iget(43380)!=0|true))||(__CLR4_1_2xa6xa6l3lqxv7c.R.iget(43381)==0&false)); sec++) {{
                    __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43382);assertEqualDuration( hr + ":" + min + ":" + sec, 
                                         new int[] { 2000, 0, 1, 0, 0, 0, 0 },
                                         new int[] { 2000, 0, 1, hr, min, sec },
                                         "H:m:s"
                                       );
                }
            }}
        }}
    }}finally{__CLR4_1_2xa6xa6l3lqxv7c.R.flushNeeded();}}

    // Attempting to test edge cases in DurationFormatUtils.formatPeriod
    @Test
    public void testEdgeDurations() {__CLR4_1_2xa6xa6l3lqxv7c.R.globalSliceStart(getClass().getName(),43383);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_242lgjbxh3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2xa6xa6l3lqxv7c.R.rethrow($CLV_t2$);}finally{__CLR4_1_2xa6xa6l3lqxv7c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DurationFormatUtilsTest.testEdgeDurations",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),43383,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_242lgjbxh3(){try{__CLR4_1_2xa6xa6l3lqxv7c.R.inc(43383);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43384);assertEqualDuration( "01", new int[] { 2006, 0, 15, 0, 0, 0 }, 
                             new int[] { 2006, 2, 10, 0, 0, 0 }, "MM");
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43385);assertEqualDuration( "12", new int[] { 2005, 0, 15, 0, 0, 0 }, 
                             new int[] { 2006, 0, 15, 0, 0, 0 }, "MM");
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43386);assertEqualDuration( "12", new int[] { 2005, 0, 15, 0, 0, 0 }, 
                             new int[] { 2006, 0, 16, 0, 0, 0 }, "MM");
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43387);assertEqualDuration( "11", new int[] { 2005, 0, 15, 0, 0, 0 }, 
                             new int[] { 2006, 0, 14, 0, 0, 0 }, "MM");
        
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43388);assertEqualDuration( "01 26", new int[] { 2006, 0, 15, 0, 0, 0 },
                             new int[] { 2006, 2, 10, 0, 0, 0 }, "MM dd");
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43389);assertEqualDuration( "54", new int[] { 2006, 0, 15, 0, 0, 0 },
                             new int[] { 2006, 2, 10, 0, 0, 0 }, "dd"); 
        
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43390);assertEqualDuration( "09 12", new int[] { 2006, 1, 20, 0, 0, 0 },
                             new int[] { 2006, 11, 4, 0, 0, 0 }, "MM dd");
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43391);assertEqualDuration( "287", new int[] { 2006, 1, 20, 0, 0, 0 },
                             new int[] { 2006, 11, 4, 0, 0, 0 }, "dd"); 

        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43392);assertEqualDuration( "11 30", new int[] { 2006, 0, 2, 0, 0, 0 },
                             new int[] { 2007, 0, 1, 0, 0, 0 }, "MM dd"); 
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43393);assertEqualDuration( "364", new int[] { 2006, 0, 2, 0, 0, 0 },
                             new int[] { 2007, 0, 1, 0, 0, 0 }, "dd"); 

        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43394);assertEqualDuration( "12 00", new int[] { 2006, 0, 1, 0, 0, 0 },
                             new int[] { 2007, 0, 1, 0, 0, 0 }, "MM dd"); 
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43395);assertEqualDuration( "365", new int[] { 2006, 0, 1, 0, 0, 0 },
                             new int[] { 2007, 0, 1, 0, 0, 0 }, "dd"); 
    
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43396);assertEqualDuration( "31", new int[] { 2006, 0, 1, 0, 0, 0 },
                new int[] { 2006, 1, 1, 0, 0, 0 }, "dd"); 
        
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43397);assertEqualDuration( "92", new int[] { 2005, 9, 1, 0, 0, 0 },
                new int[] { 2006, 0, 1, 0, 0, 0 }, "dd"); 
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43398);assertEqualDuration( "77", new int[] { 2005, 9, 16, 0, 0, 0 },
                new int[] { 2006, 0, 1, 0, 0, 0 }, "dd"); 

        // test month larger in start than end
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43399);assertEqualDuration( "136", new int[] { 2005, 9, 16, 0, 0, 0 },
                new int[] { 2006, 2, 1, 0, 0, 0 }, "dd"); 
        // test when start in leap year
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43400);assertEqualDuration( "136", new int[] { 2004, 9, 16, 0, 0, 0 },
                new int[] { 2005, 2, 1, 0, 0, 0 }, "dd"); 
        // test when end in leap year
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43401);assertEqualDuration( "137", new int[] { 2003, 9, 16, 0, 0, 0 },
                new int[] { 2004, 2, 1, 0, 0, 0 }, "dd");         
        // test when end in leap year but less than end of feb
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43402);assertEqualDuration( "135", new int[] { 2003, 9, 16, 0, 0, 0 },
                new int[] { 2004, 1, 28, 0, 0, 0 }, "dd"); 

        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43403);assertEqualDuration( "364", new int[] { 2007, 0, 2, 0, 0, 0 },
                new int[] { 2008, 0, 1, 0, 0, 0 }, "dd"); 
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43404);assertEqualDuration( "729", new int[] { 2006, 0, 2, 0, 0, 0 },
                new int[] { 2008, 0, 1, 0, 0, 0 }, "dd"); 

        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43405);assertEqualDuration( "365", new int[] { 2007, 2, 2, 0, 0, 0 },
                new int[] { 2008, 2, 1, 0, 0, 0 }, "dd"); 
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43406);assertEqualDuration( "333", new int[] { 2007, 1, 2, 0, 0, 0 },
                new int[] { 2008, 0, 1, 0, 0, 0 }, "dd"); 

        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43407);assertEqualDuration( "28", new int[] { 2008, 1, 2, 0, 0, 0 },
                new int[] { 2008, 2, 1, 0, 0, 0 }, "dd"); 
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43408);assertEqualDuration( "393", new int[] { 2007, 1, 2, 0, 0, 0 },
                new int[] { 2008, 2, 1, 0, 0, 0 }, "dd"); 

        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43409);assertEqualDuration( "369", new int[] { 2004, 0, 29, 0, 0, 0 },
                new int[] { 2005, 1, 1, 0, 0, 0 }, "dd"); 

        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43410);assertEqualDuration( "338", new int[] { 2004, 1, 29, 0, 0, 0 },
                new int[] { 2005, 1, 1, 0, 0, 0 }, "dd"); 

        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43411);assertEqualDuration( "28", new int[] { 2004, 2, 8, 0, 0, 0 },
                new int[] { 2004, 3, 5, 0, 0, 0 }, "dd"); 

        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43412);assertEqualDuration( "48", new int[] { 1992, 1, 29, 0, 0, 0 },
                new int[] { 1996, 1, 29, 0, 0, 0 }, "M"); 
        
        
        // this seems odd - and will fail if I throw it in as a brute force 
        // below as it expects the answer to be 12. It's a tricky edge case
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43413);assertEqualDuration( "11", new int[] { 1996, 1, 29, 0, 0, 0 },
                new int[] { 1997, 1, 28, 0, 0, 0 }, "M"); 
        // again - this seems odd
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43414);assertEqualDuration( "11 28", new int[] { 1996, 1, 29, 0, 0, 0 },
                new int[] { 1997, 1, 28, 0, 0, 0 }, "M d"); 
        
    }finally{__CLR4_1_2xa6xa6l3lqxv7c.R.flushNeeded();}}
    
    @Test
    public void testDurationsByBruteForce() {__CLR4_1_2xa6xa6l3lqxv7c.R.globalSliceStart(getClass().getName(),43415);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2bfu55sxhz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2xa6xa6l3lqxv7c.R.rethrow($CLV_t2$);}finally{__CLR4_1_2xa6xa6l3lqxv7c.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DurationFormatUtilsTest.testDurationsByBruteForce",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),43415,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2bfu55sxhz(){try{__CLR4_1_2xa6xa6l3lqxv7c.R.inc(43415);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43416);bruteForce(2006, 0, 1, "d", Calendar.DAY_OF_MONTH);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43417);bruteForce(2006, 0, 2, "d", Calendar.DAY_OF_MONTH);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43418);bruteForce(2007, 1, 2, "d", Calendar.DAY_OF_MONTH);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43419);bruteForce(2004, 1, 29, "d", Calendar.DAY_OF_MONTH);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43420);bruteForce(1996, 1, 29, "d", Calendar.DAY_OF_MONTH);

        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43421);bruteForce(1969, 1, 28, "M", Calendar.MONTH);  // tests for 48 years
        //bruteForce(1996, 1, 29, "M", Calendar.MONTH);  // this will fail
    }finally{__CLR4_1_2xa6xa6l3lqxv7c.R.flushNeeded();}}
    
    private static final int FOUR_YEARS = 365 * 3 + 366;
    
    // Takes a minute to run, so generally turned off
//    public void testBrutally() {
//        Calendar c = Calendar.getInstance();
//        c.set(2004, 0, 1, 0, 0, 0);
//        for (int i=0; i < FOUR_YEARS; i++) {
//            bruteForce(c.get(Calendar.YEAR), c.get(Calendar.MONTH), c.get(Calendar.DAY_OF_MONTH), "d", Calendar.DAY_OF_MONTH );
//            c.add(Calendar.DAY_OF_MONTH, 1);
//        }
//    }        
    
    private void bruteForce(final int year, final int month, final int day, final String format, final int calendarType) {try{__CLR4_1_2xa6xa6l3lqxv7c.R.inc(43422);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43423);final String msg = year + "-" + month + "-" + day + " to ";
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43424);final Calendar c = Calendar.getInstance();
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43425);c.set(year, month, day, 0, 0, 0);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43426);final int[] array1 = new int[] { year, month, day, 0, 0, 0 };
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43427);final int[] array2 = new int[] { year, month, day, 0, 0, 0 };
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43428);for (int i=0; (((i < FOUR_YEARS)&&(__CLR4_1_2xa6xa6l3lqxv7c.R.iget(43429)!=0|true))||(__CLR4_1_2xa6xa6l3lqxv7c.R.iget(43430)==0&false)); i++) {{
            __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43431);array2[0] = c.get(Calendar.YEAR);
            __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43432);array2[1] = c.get(Calendar.MONTH);
            __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43433);array2[2] = c.get(Calendar.DAY_OF_MONTH);
            __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43434);final String tmpMsg = msg + array2[0] + "-" + array2[1] + "-" + array2[2] + " at ";
            __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43435);assertEqualDuration( tmpMsg + i, Integer.toString(i), array1, array2, format );
            __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43436);c.add(calendarType, 1);
        }
    }}finally{__CLR4_1_2xa6xa6l3lqxv7c.R.flushNeeded();}}

    private void assertEqualDuration(final String expected, final int[] start, final int[] end, final String format) {try{__CLR4_1_2xa6xa6l3lqxv7c.R.inc(43437);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43438);assertEqualDuration(null, expected, start, end, format);
    }finally{__CLR4_1_2xa6xa6l3lqxv7c.R.flushNeeded();}}
    private void assertEqualDuration(final String message, final String expected, final int[] start, final int[] end, final String format) {try{__CLR4_1_2xa6xa6l3lqxv7c.R.inc(43439);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43440);final Calendar cal1 = Calendar.getInstance();
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43441);cal1.set(start[0], start[1], start[2], start[3], start[4], start[5]);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43442);cal1.set(Calendar.MILLISECOND, 0);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43443);final Calendar cal2 = Calendar.getInstance();
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43444);cal2.set(end[0], end[1], end[2], end[3], end[4], end[5]);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43445);cal2.set(Calendar.MILLISECOND, 0);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43446);final long milli1 = cal1.getTime().getTime();
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43447);final long milli2 = cal2.getTime().getTime();
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43448);final String result = DurationFormatUtils.formatPeriod(milli1, milli2, format);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43449);if ((((message == null)&&(__CLR4_1_2xa6xa6l3lqxv7c.R.iget(43450)!=0|true))||(__CLR4_1_2xa6xa6l3lqxv7c.R.iget(43451)==0&false))) {{
            __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43452);assertEquals(expected, result);
        } }else {{
            __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43453);assertEquals(message, expected, result);
        }
    }}finally{__CLR4_1_2xa6xa6l3lqxv7c.R.flushNeeded();}}

    private void assertArrayEquals(final DurationFormatUtils.Token[] obj1, final DurationFormatUtils.Token[] obj2) {try{__CLR4_1_2xa6xa6l3lqxv7c.R.inc(43454);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43455);assertEquals("Arrays are unequal length. ", obj1.length, obj2.length);
        __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43456);for (int i = 0; (((i < obj1.length)&&(__CLR4_1_2xa6xa6l3lqxv7c.R.iget(43457)!=0|true))||(__CLR4_1_2xa6xa6l3lqxv7c.R.iget(43458)==0&false)); i++) {{
            __CLR4_1_2xa6xa6l3lqxv7c.R.inc(43459);assertTrue("Index " + i + " not equal, " + obj1[i] + " vs " + obj2[i], obj1[i].equals(obj2[i]));
        }
    }}finally{__CLR4_1_2xa6xa6l3lqxv7c.R.flushNeeded();}}

}
