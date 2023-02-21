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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

import org.junit.Test;

/**
 * Unit tests {@link org.apache.commons.lang3.time.FastDateFormat}.
 *
 * @since 2.0
 * @version $Id$
 */
public class FastDateFormatTest {static class __CLR4_1_2xj8xj8l3lqxv7w{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492830024L,8589935092L,43623,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /*
     * Only the cache methods need to be tested here.  
     * The print methods are tested by {@link FastDateFormat_PrinterTest}
     * and the parse methods are tested by {@link FastDateFormat_ParserTest}
     */
    @Test
    public void test_getInstance() {__CLR4_1_2xj8xj8l3lqxv7w.R.globalSliceStart(getClass().getName(),43460);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2fwz0pxxj8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2xj8xj8l3lqxv7w.R.rethrow($CLV_t2$);}finally{__CLR4_1_2xj8xj8l3lqxv7w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDateFormatTest.test_getInstance",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),43460,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2fwz0pxxj8(){try{__CLR4_1_2xj8xj8l3lqxv7w.R.inc(43460);
        __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43461);final FastDateFormat format1 = FastDateFormat.getInstance();
        __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43462);final FastDateFormat format2 = FastDateFormat.getInstance();
        __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43463);assertSame(format1, format2);
    }finally{__CLR4_1_2xj8xj8l3lqxv7w.R.flushNeeded();}}

    @Test
    public void test_getInstance_String() {__CLR4_1_2xj8xj8l3lqxv7w.R.globalSliceStart(getClass().getName(),43464);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2xny2exxjc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2xj8xj8l3lqxv7w.R.rethrow($CLV_t2$);}finally{__CLR4_1_2xj8xj8l3lqxv7w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDateFormatTest.test_getInstance_String",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),43464,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2xny2exxjc(){try{__CLR4_1_2xj8xj8l3lqxv7w.R.inc(43464);
        __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43465);final FastDateFormat format1 = FastDateFormat.getInstance("MM/DD/yyyy");
        __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43466);final FastDateFormat format2 = FastDateFormat.getInstance("MM-DD-yyyy");
        __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43467);final FastDateFormat format3 = FastDateFormat.getInstance("MM-DD-yyyy");

        __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43468);assertTrue(format1 != format2); // -- junit 3.8 version -- assertFalse(format1 == format2);
        __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43469);assertSame(format2, format3);
        __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43470);assertEquals("MM/DD/yyyy", format1.getPattern());
        __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43471);assertEquals(TimeZone.getDefault(), format1.getTimeZone());
        __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43472);assertEquals(TimeZone.getDefault(), format2.getTimeZone());
    }finally{__CLR4_1_2xj8xj8l3lqxv7w.R.flushNeeded();}}

    @Test
    public void test_getInstance_String_TimeZone() {__CLR4_1_2xj8xj8l3lqxv7w.R.globalSliceStart(getClass().getName(),43473);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2ntjj2rxjl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2xj8xj8l3lqxv7w.R.rethrow($CLV_t2$);}finally{__CLR4_1_2xj8xj8l3lqxv7w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDateFormatTest.test_getInstance_String_TimeZone",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),43473,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2ntjj2rxjl(){try{__CLR4_1_2xj8xj8l3lqxv7w.R.inc(43473);
        __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43474);final Locale realDefaultLocale = Locale.getDefault();
        __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43475);final TimeZone realDefaultZone = TimeZone.getDefault();
        __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43476);try {
            __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43477);Locale.setDefault(Locale.US);
            __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43478);TimeZone.setDefault(TimeZone.getTimeZone("America/New_York"));

            __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43479);final FastDateFormat format1 = FastDateFormat.getInstance("MM/DD/yyyy",
                    TimeZone.getTimeZone("Atlantic/Reykjavik"));
            __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43480);final FastDateFormat format2 = FastDateFormat.getInstance("MM/DD/yyyy");
            __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43481);final FastDateFormat format3 = FastDateFormat.getInstance("MM/DD/yyyy", TimeZone.getDefault());
            __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43482);final FastDateFormat format4 = FastDateFormat.getInstance("MM/DD/yyyy", TimeZone.getDefault());
            __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43483);final FastDateFormat format5 = FastDateFormat.getInstance("MM-DD-yyyy", TimeZone.getDefault());
            __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43484);final FastDateFormat format6 = FastDateFormat.getInstance("MM-DD-yyyy");

            __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43485);assertTrue(format1 != format2); // -- junit 3.8 version -- assertFalse(format1 == format2);
            __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43486);assertEquals(TimeZone.getTimeZone("Atlantic/Reykjavik"), format1.getTimeZone());
            __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43487);assertEquals(TimeZone.getDefault(), format2.getTimeZone());
            __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43488);assertSame(format3, format4);
            __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43489);assertTrue(format3 != format5); // -- junit 3.8 version -- assertFalse(format3 == format5);
            __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43490);assertTrue(format4 != format6); // -- junit 3.8 version -- assertFalse(format3 == format5);

        } finally {
            __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43491);Locale.setDefault(realDefaultLocale);
            __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43492);TimeZone.setDefault(realDefaultZone);
        }
    }finally{__CLR4_1_2xj8xj8l3lqxv7w.R.flushNeeded();}}

    @Test
    public void test_getInstance_String_Locale() {__CLR4_1_2xj8xj8l3lqxv7w.R.globalSliceStart(getClass().getName(),43493);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2bl3rpqxk5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2xj8xj8l3lqxv7w.R.rethrow($CLV_t2$);}finally{__CLR4_1_2xj8xj8l3lqxv7w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDateFormatTest.test_getInstance_String_Locale",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),43493,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2bl3rpqxk5(){try{__CLR4_1_2xj8xj8l3lqxv7w.R.inc(43493);
        __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43494);final Locale realDefaultLocale = Locale.getDefault();
        __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43495);try {
            __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43496);Locale.setDefault(Locale.US);
            __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43497);final FastDateFormat format1 = FastDateFormat.getInstance("MM/DD/yyyy", Locale.GERMANY);
            __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43498);final FastDateFormat format2 = FastDateFormat.getInstance("MM/DD/yyyy");
            __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43499);final FastDateFormat format3 = FastDateFormat.getInstance("MM/DD/yyyy", Locale.GERMANY);

            __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43500);assertTrue(format1 != format2); // -- junit 3.8 version -- assertFalse(format1 == format2);
            __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43501);assertSame(format1, format3);
            __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43502);assertEquals(Locale.GERMANY, format1.getLocale());

        } finally {
            __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43503);Locale.setDefault(realDefaultLocale);
        }
    }finally{__CLR4_1_2xj8xj8l3lqxv7w.R.flushNeeded();}}

    @Test
    public void test_changeDefault_Locale_DateInstance() {__CLR4_1_2xj8xj8l3lqxv7w.R.globalSliceStart(getClass().getName(),43504);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2nqua98xkg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2xj8xj8l3lqxv7w.R.rethrow($CLV_t2$);}finally{__CLR4_1_2xj8xj8l3lqxv7w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDateFormatTest.test_changeDefault_Locale_DateInstance",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),43504,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2nqua98xkg(){try{__CLR4_1_2xj8xj8l3lqxv7w.R.inc(43504);
        __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43505);final Locale realDefaultLocale = Locale.getDefault();
        __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43506);try {
            __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43507);Locale.setDefault(Locale.US);
            __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43508);final FastDateFormat format1 = FastDateFormat.getDateInstance(FastDateFormat.FULL, Locale.GERMANY);
            __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43509);final FastDateFormat format2 = FastDateFormat.getDateInstance(FastDateFormat.FULL);
            __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43510);Locale.setDefault(Locale.GERMANY);
            __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43511);final FastDateFormat format3 = FastDateFormat.getDateInstance(FastDateFormat.FULL);

            __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43512);assertSame(Locale.GERMANY, format1.getLocale());
            __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43513);assertSame(Locale.US, format2.getLocale());
            __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43514);assertSame(Locale.GERMANY, format3.getLocale());
            __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43515);assertTrue(format1 != format2); // -- junit 3.8 version -- assertFalse(format1 == format2);
            __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43516);assertTrue(format2 != format3);

        } finally {
            __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43517);Locale.setDefault(realDefaultLocale);
        }
    }finally{__CLR4_1_2xj8xj8l3lqxv7w.R.flushNeeded();}}

    @Test
    public void test_changeDefault_Locale_DateTimeInstance() {__CLR4_1_2xj8xj8l3lqxv7w.R.globalSliceStart(getClass().getName(),43518);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2t6uuxrxku();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2xj8xj8l3lqxv7w.R.rethrow($CLV_t2$);}finally{__CLR4_1_2xj8xj8l3lqxv7w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDateFormatTest.test_changeDefault_Locale_DateTimeInstance",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),43518,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2t6uuxrxku(){try{__CLR4_1_2xj8xj8l3lqxv7w.R.inc(43518);
        __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43519);final Locale realDefaultLocale = Locale.getDefault();
        __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43520);try {
            __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43521);Locale.setDefault(Locale.US);
            __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43522);final FastDateFormat format1 = FastDateFormat.getDateTimeInstance(FastDateFormat.FULL, FastDateFormat.FULL, Locale.GERMANY);
            __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43523);final FastDateFormat format2 = FastDateFormat.getDateTimeInstance(FastDateFormat.FULL, FastDateFormat.FULL);
            __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43524);Locale.setDefault(Locale.GERMANY);
            __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43525);final FastDateFormat format3 = FastDateFormat.getDateTimeInstance(FastDateFormat.FULL, FastDateFormat.FULL);

            __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43526);assertSame(Locale.GERMANY, format1.getLocale());
            __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43527);assertSame(Locale.US, format2.getLocale());
            __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43528);assertSame(Locale.GERMANY, format3.getLocale());
            __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43529);assertTrue(format1 != format2); // -- junit 3.8 version -- assertFalse(format1 == format2);
            __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43530);assertTrue(format2 != format3);

        } finally {
            __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43531);Locale.setDefault(realDefaultLocale);
        }
    }finally{__CLR4_1_2xj8xj8l3lqxv7w.R.flushNeeded();}}

    @Test
    public void test_getInstance_String_TimeZone_Locale() {__CLR4_1_2xj8xj8l3lqxv7w.R.globalSliceStart(getClass().getName(),43532);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2vuwleuxl8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2xj8xj8l3lqxv7w.R.rethrow($CLV_t2$);}finally{__CLR4_1_2xj8xj8l3lqxv7w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDateFormatTest.test_getInstance_String_TimeZone_Locale",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),43532,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2vuwleuxl8(){try{__CLR4_1_2xj8xj8l3lqxv7w.R.inc(43532);
        __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43533);final Locale realDefaultLocale = Locale.getDefault();
        __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43534);final TimeZone realDefaultZone = TimeZone.getDefault();
        __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43535);try {
            __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43536);Locale.setDefault(Locale.US);
            __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43537);TimeZone.setDefault(TimeZone.getTimeZone("America/New_York"));

            __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43538);final FastDateFormat format1 = FastDateFormat.getInstance("MM/DD/yyyy",
                    TimeZone.getTimeZone("Atlantic/Reykjavik"), Locale.GERMANY);
            __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43539);final FastDateFormat format2 = FastDateFormat.getInstance("MM/DD/yyyy", Locale.GERMANY);
            __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43540);final FastDateFormat format3 = FastDateFormat.getInstance("MM/DD/yyyy",
                    TimeZone.getDefault(), Locale.GERMANY);

            __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43541);assertTrue(format1 != format2); // -- junit 3.8 version -- assertNotSame(format1, format2);
            __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43542);assertEquals(TimeZone.getTimeZone("Atlantic/Reykjavik"), format1.getTimeZone());
            __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43543);assertEquals(TimeZone.getDefault(), format2.getTimeZone());
            __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43544);assertEquals(TimeZone.getDefault(), format3.getTimeZone());
            __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43545);assertEquals(Locale.GERMANY, format1.getLocale());
            __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43546);assertEquals(Locale.GERMANY, format2.getLocale());
            __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43547);assertEquals(Locale.GERMANY, format3.getLocale());

        } finally {
            __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43548);Locale.setDefault(realDefaultLocale);
            __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43549);TimeZone.setDefault(realDefaultZone);
        }
    }finally{__CLR4_1_2xj8xj8l3lqxv7w.R.flushNeeded();}}       

    @Test
    public void testCheckDefaults() {__CLR4_1_2xj8xj8l3lqxv7w.R.globalSliceStart(getClass().getName(),43550);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2kzd60hxlq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2xj8xj8l3lqxv7w.R.rethrow($CLV_t2$);}finally{__CLR4_1_2xj8xj8l3lqxv7w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDateFormatTest.testCheckDefaults",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),43550,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2kzd60hxlq(){try{__CLR4_1_2xj8xj8l3lqxv7w.R.inc(43550);
        __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43551);final FastDateFormat format = FastDateFormat.getInstance();
        __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43552);final FastDateFormat medium = FastDateFormat.getDateTimeInstance(FastDateFormat.SHORT, FastDateFormat.SHORT);
        __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43553);assertEquals(medium, format);
        
        __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43554);final SimpleDateFormat sdf = new SimpleDateFormat();
        __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43555);assertEquals(sdf.toPattern(), format.getPattern());
        
        __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43556);assertEquals(Locale.getDefault(), format.getLocale());
        __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43557);assertEquals(TimeZone.getDefault(), format.getTimeZone());        
    }finally{__CLR4_1_2xj8xj8l3lqxv7w.R.flushNeeded();}}

    @Test
    public void testCheckDifferingStyles() {__CLR4_1_2xj8xj8l3lqxv7w.R.globalSliceStart(getClass().getName(),43558);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2u9kosdxly();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2xj8xj8l3lqxv7w.R.rethrow($CLV_t2$);}finally{__CLR4_1_2xj8xj8l3lqxv7w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDateFormatTest.testCheckDifferingStyles",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),43558,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2u9kosdxly(){try{__CLR4_1_2xj8xj8l3lqxv7w.R.inc(43558);
        __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43559);final FastDateFormat shortShort = FastDateFormat.getDateTimeInstance(FastDateFormat.SHORT, FastDateFormat.SHORT, Locale.US);
        __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43560);final FastDateFormat shortLong = FastDateFormat.getDateTimeInstance(FastDateFormat.SHORT, FastDateFormat.LONG, Locale.US);
        __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43561);final FastDateFormat longShort = FastDateFormat.getDateTimeInstance(FastDateFormat.LONG, FastDateFormat.SHORT, Locale.US);
        __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43562);final FastDateFormat longLong = FastDateFormat.getDateTimeInstance(FastDateFormat.LONG, FastDateFormat.LONG, Locale.US);
        
        __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43563);assertFalse(shortShort.equals(shortLong));
        __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43564);assertFalse(shortShort.equals(longShort));
        __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43565);assertFalse(shortShort.equals(longLong));      
        __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43566);assertFalse(shortLong.equals(longShort));
        __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43567);assertFalse(shortLong.equals(longLong));
        __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43568);assertFalse(longShort.equals(longLong));
    }finally{__CLR4_1_2xj8xj8l3lqxv7w.R.flushNeeded();}}

    @Test
    public void testDateDefaults() {__CLR4_1_2xj8xj8l3lqxv7w.R.globalSliceStart(getClass().getName(),43569);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2wp5rkpxm9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2xj8xj8l3lqxv7w.R.rethrow($CLV_t2$);}finally{__CLR4_1_2xj8xj8l3lqxv7w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDateFormatTest.testDateDefaults",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),43569,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2wp5rkpxm9(){try{__CLR4_1_2xj8xj8l3lqxv7w.R.inc(43569);
        __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43570);assertEquals(FastDateFormat.getDateInstance(FastDateFormat.LONG, Locale.CANADA), 
                FastDateFormat.getDateInstance(FastDateFormat.LONG, TimeZone.getDefault(), Locale.CANADA));
        
        __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43571);assertEquals(FastDateFormat.getDateInstance(FastDateFormat.LONG, TimeZone.getTimeZone("America/New_York")), 
                FastDateFormat.getDateInstance(FastDateFormat.LONG, TimeZone.getTimeZone("America/New_York"), Locale.getDefault()));

        __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43572);assertEquals(FastDateFormat.getDateInstance(FastDateFormat.LONG), 
                FastDateFormat.getDateInstance(FastDateFormat.LONG, TimeZone.getDefault(), Locale.getDefault()));
    }finally{__CLR4_1_2xj8xj8l3lqxv7w.R.flushNeeded();}}

    @Test
    public void testTimeDefaults() {__CLR4_1_2xj8xj8l3lqxv7w.R.globalSliceStart(getClass().getName(),43573);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_244qiooxmd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2xj8xj8l3lqxv7w.R.rethrow($CLV_t2$);}finally{__CLR4_1_2xj8xj8l3lqxv7w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDateFormatTest.testTimeDefaults",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),43573,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_244qiooxmd(){try{__CLR4_1_2xj8xj8l3lqxv7w.R.inc(43573);
        __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43574);assertEquals(FastDateFormat.getTimeInstance(FastDateFormat.LONG, Locale.CANADA),
                FastDateFormat.getTimeInstance(FastDateFormat.LONG, TimeZone.getDefault(), Locale.CANADA));

        __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43575);assertEquals(FastDateFormat.getTimeInstance(FastDateFormat.LONG, TimeZone.getTimeZone("America/New_York")),
                FastDateFormat.getTimeInstance(FastDateFormat.LONG, TimeZone.getTimeZone("America/New_York"), Locale.getDefault()));

        __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43576);assertEquals(FastDateFormat.getTimeInstance(FastDateFormat.LONG),
                FastDateFormat.getTimeInstance(FastDateFormat.LONG, TimeZone.getDefault(), Locale.getDefault()));
    }finally{__CLR4_1_2xj8xj8l3lqxv7w.R.flushNeeded();}}

    @Test
    public void testTimeDateDefaults() {__CLR4_1_2xj8xj8l3lqxv7w.R.globalSliceStart(getClass().getName(),43577);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2p1z2cmxmh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2xj8xj8l3lqxv7w.R.rethrow($CLV_t2$);}finally{__CLR4_1_2xj8xj8l3lqxv7w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDateFormatTest.testTimeDateDefaults",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),43577,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2p1z2cmxmh(){try{__CLR4_1_2xj8xj8l3lqxv7w.R.inc(43577);
        __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43578);assertEquals(FastDateFormat.getDateTimeInstance(FastDateFormat.LONG, FastDateFormat.MEDIUM, Locale.CANADA),
                FastDateFormat.getDateTimeInstance(FastDateFormat.LONG, FastDateFormat.MEDIUM, TimeZone.getDefault(), Locale.CANADA));

        __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43579);assertEquals(FastDateFormat.getDateTimeInstance(FastDateFormat.LONG, FastDateFormat.MEDIUM, TimeZone.getTimeZone("America/New_York")),
                FastDateFormat.getDateTimeInstance(FastDateFormat.LONG, FastDateFormat.MEDIUM, TimeZone.getTimeZone("America/New_York"), Locale.getDefault()));

        __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43580);assertEquals(FastDateFormat.getDateTimeInstance(FastDateFormat.LONG, FastDateFormat.MEDIUM),
                FastDateFormat.getDateTimeInstance(FastDateFormat.LONG, FastDateFormat.MEDIUM, TimeZone.getDefault(), Locale.getDefault()));
    }finally{__CLR4_1_2xj8xj8l3lqxv7w.R.flushNeeded();}}

    @Test
    public void testParseSync() throws InterruptedException {__CLR4_1_2xj8xj8l3lqxv7w.R.globalSliceStart(getClass().getName(),43581);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2mbcla5xml();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2xj8xj8l3lqxv7w.R.rethrow($CLV_t2$);}finally{__CLR4_1_2xj8xj8l3lqxv7w.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDateFormatTest.testParseSync",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),43581,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2mbcla5xml() throws InterruptedException{try{__CLR4_1_2xj8xj8l3lqxv7w.R.inc(43581);
        __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43582);final String pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS Z";
        __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43583);final FastDateFormat formatter= FastDateFormat.getInstance(pattern);
        
        __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43584);final long sdfTime= measureTime(formatter, new SimpleDateFormat(pattern) {
                        private static final long serialVersionUID = 1L;  // because SimpleDateFormat is serializable

                        @Override
                        public Object parseObject(final String formattedDate) throws ParseException {try{__CLR4_1_2xj8xj8l3lqxv7w.R.inc(43585);
                            __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43586);synchronized(this) {
                                __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43587);return super.parse(formattedDate);
                            }
                        }finally{__CLR4_1_2xj8xj8l3lqxv7w.R.flushNeeded();}}
        });
        
        __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43588);final long fdfTime= measureTime(formatter, FastDateFormat.getInstance(pattern));
        
        __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43589);final String times= ">>FastDateFormatTest: FastDateParser:"+fdfTime+"  SimpleDateFormat:"+sdfTime;
        __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43590);System.out.println(times);
    }finally{__CLR4_1_2xj8xj8l3lqxv7w.R.flushNeeded();}}

    final static private int NTHREADS= 10;
    final static private int NROUNDS= 10000;
    
    private long measureTime(final Format formatter, final Format parser) throws InterruptedException {try{__CLR4_1_2xj8xj8l3lqxv7w.R.inc(43591);
        __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43592);final ExecutorService pool = Executors.newFixedThreadPool(NTHREADS);
        __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43593);final AtomicInteger failures= new AtomicInteger(0);
        __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43594);final AtomicLong totalElapsed= new AtomicLong(0);
        
        __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43595);for(int i= 0; (((i<NTHREADS)&&(__CLR4_1_2xj8xj8l3lqxv7w.R.iget(43596)!=0|true))||(__CLR4_1_2xj8xj8l3lqxv7w.R.iget(43597)==0&false)); ++i) {{
            __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43598);pool.submit(new Runnable() {
                @Override
                public void run() {try{__CLR4_1_2xj8xj8l3lqxv7w.R.inc(43599);
                    __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43600);for(int i= 0; (((i<NROUNDS)&&(__CLR4_1_2xj8xj8l3lqxv7w.R.iget(43601)!=0|true))||(__CLR4_1_2xj8xj8l3lqxv7w.R.iget(43602)==0&false)); ++i) {{
                        __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43603);try {
                            __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43604);final Date date= new Date();
                            __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43605);final String formattedDate= formatter.format(date);
                            __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43606);final long start= System.currentTimeMillis();        
                            __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43607);final Object pd= parser.parseObject(formattedDate);
                            __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43608);totalElapsed.addAndGet(System.currentTimeMillis()-start);
                            __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43609);if((((!date.equals(pd))&&(__CLR4_1_2xj8xj8l3lqxv7w.R.iget(43610)!=0|true))||(__CLR4_1_2xj8xj8l3lqxv7w.R.iget(43611)==0&false))) {{
                                __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43612);failures.incrementAndGet();
                            }
                        }} catch (final Exception e) {
                            __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43613);failures.incrementAndGet();
                            __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43614);e.printStackTrace();
                        }
                    }
                }}finally{__CLR4_1_2xj8xj8l3lqxv7w.R.flushNeeded();}}                
            });
        }
        }__CLR4_1_2xj8xj8l3lqxv7w.R.inc(43615);pool.shutdown();                        
        __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43616);if((((!pool.awaitTermination(20, TimeUnit.SECONDS))&&(__CLR4_1_2xj8xj8l3lqxv7w.R.iget(43617)!=0|true))||(__CLR4_1_2xj8xj8l3lqxv7w.R.iget(43618)==0&false))) {{
            __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43619);pool.shutdownNow();
            __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43620);fail("did not complete tasks");
        }
        }__CLR4_1_2xj8xj8l3lqxv7w.R.inc(43621);assertEquals(0, failures.get());
        __CLR4_1_2xj8xj8l3lqxv7w.R.inc(43622);return totalElapsed.get();
    }finally{__CLR4_1_2xj8xj8l3lqxv7w.R.flushNeeded();}}
}
