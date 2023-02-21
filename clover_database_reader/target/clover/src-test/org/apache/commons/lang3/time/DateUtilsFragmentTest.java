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
import org.junit.Before;
import static org.junit.Assert.*;
import java.util.Calendar;
import java.util.Date;

public class DateUtilsFragmentTest {static class __CLR4_1_2w70w70l3lqxv2z{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492830024L,8589935092L,41979,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final int months = 7;   // second final prime before 12
    private static final int days = 23;    // second final prime before 31 (and valid)
    private static final int hours = 19;   // second final prime before 24
    private static final int minutes = 53; // second final prime before 60
    private static final int seconds = 47; // third final prime before 60
    private static final int millis = 991; // second final prime before 1000

    private Date aDate;
    private Calendar aCalendar;


    @Before
    public void setUp() {try{__CLR4_1_2w70w70l3lqxv2z.R.inc(41724);
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41725);aCalendar = Calendar.getInstance();
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41726);aCalendar.set(2005, months, days, hours, minutes, seconds);
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41727);aCalendar.set(Calendar.MILLISECOND, millis);
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41728);aDate = aCalendar.getTime();
    }finally{__CLR4_1_2w70w70l3lqxv2z.R.flushNeeded();}}
    
    @Test
    public void testNullDate() {__CLR4_1_2w70w70l3lqxv2z.R.globalSliceStart(getClass().getName(),41729);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2oklpn6w75();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2w70w70l3lqxv2z.R.rethrow($CLV_t2$);}finally{__CLR4_1_2w70w70l3lqxv2z.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsFragmentTest.testNullDate",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),41729,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2oklpn6w75(){try{__CLR4_1_2w70w70l3lqxv2z.R.inc(41729);
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41730);try {
            __CLR4_1_2w70w70l3lqxv2z.R.inc(41731);DateUtils.getFragmentInMilliseconds((Date) null, Calendar.MILLISECOND);
            __CLR4_1_2w70w70l3lqxv2z.R.inc(41732);fail();
        } catch(final IllegalArgumentException iae) {}

        __CLR4_1_2w70w70l3lqxv2z.R.inc(41733);try {
            __CLR4_1_2w70w70l3lqxv2z.R.inc(41734);DateUtils.getFragmentInSeconds((Date) null, Calendar.MILLISECOND);
            __CLR4_1_2w70w70l3lqxv2z.R.inc(41735);fail();
        } catch(final IllegalArgumentException iae) {}

        __CLR4_1_2w70w70l3lqxv2z.R.inc(41736);try {
            __CLR4_1_2w70w70l3lqxv2z.R.inc(41737);DateUtils.getFragmentInMinutes((Date) null, Calendar.MILLISECOND);
            __CLR4_1_2w70w70l3lqxv2z.R.inc(41738);fail();
        } catch(final IllegalArgumentException iae) {}

        __CLR4_1_2w70w70l3lqxv2z.R.inc(41739);try {
            __CLR4_1_2w70w70l3lqxv2z.R.inc(41740);DateUtils.getFragmentInHours((Date) null, Calendar.MILLISECOND);
            __CLR4_1_2w70w70l3lqxv2z.R.inc(41741);fail();
        } catch(final IllegalArgumentException iae) {}

        __CLR4_1_2w70w70l3lqxv2z.R.inc(41742);try {
            __CLR4_1_2w70w70l3lqxv2z.R.inc(41743);DateUtils.getFragmentInDays((Date) null, Calendar.MILLISECOND);
            __CLR4_1_2w70w70l3lqxv2z.R.inc(41744);fail();
        } catch(final IllegalArgumentException iae) {}
    }finally{__CLR4_1_2w70w70l3lqxv2z.R.flushNeeded();}}

    @Test
    public void testNullCalendar() {__CLR4_1_2w70w70l3lqxv2z.R.globalSliceStart(getClass().getName(),41745);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_27eqtxew7l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2w70w70l3lqxv2z.R.rethrow($CLV_t2$);}finally{__CLR4_1_2w70w70l3lqxv2z.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsFragmentTest.testNullCalendar",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),41745,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_27eqtxew7l(){try{__CLR4_1_2w70w70l3lqxv2z.R.inc(41745);
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41746);try {
            __CLR4_1_2w70w70l3lqxv2z.R.inc(41747);DateUtils.getFragmentInMilliseconds((Calendar) null, Calendar.MILLISECOND);
            __CLR4_1_2w70w70l3lqxv2z.R.inc(41748);fail();
        } catch(final IllegalArgumentException iae) {}

        __CLR4_1_2w70w70l3lqxv2z.R.inc(41749);try {
            __CLR4_1_2w70w70l3lqxv2z.R.inc(41750);DateUtils.getFragmentInSeconds((Calendar) null, Calendar.MILLISECOND);
            __CLR4_1_2w70w70l3lqxv2z.R.inc(41751);fail();
        } catch(final IllegalArgumentException iae) {}

        __CLR4_1_2w70w70l3lqxv2z.R.inc(41752);try {
            __CLR4_1_2w70w70l3lqxv2z.R.inc(41753);DateUtils.getFragmentInMinutes((Calendar) null, Calendar.MILLISECOND);
            __CLR4_1_2w70w70l3lqxv2z.R.inc(41754);fail();
        } catch(final IllegalArgumentException iae) {}

        __CLR4_1_2w70w70l3lqxv2z.R.inc(41755);try {
            __CLR4_1_2w70w70l3lqxv2z.R.inc(41756);DateUtils.getFragmentInHours((Calendar) null, Calendar.MILLISECOND);
            __CLR4_1_2w70w70l3lqxv2z.R.inc(41757);fail();
        } catch(final IllegalArgumentException iae) {}

        __CLR4_1_2w70w70l3lqxv2z.R.inc(41758);try {
            __CLR4_1_2w70w70l3lqxv2z.R.inc(41759);DateUtils.getFragmentInDays((Calendar) null, Calendar.MILLISECOND);
            __CLR4_1_2w70w70l3lqxv2z.R.inc(41760);fail();
        } catch(final IllegalArgumentException iae) {}
    }finally{__CLR4_1_2w70w70l3lqxv2z.R.flushNeeded();}}
    
    @Test
    public void testInvalidFragmentWithDate() {__CLR4_1_2w70w70l3lqxv2z.R.globalSliceStart(getClass().getName(),41761);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2xcy9iow81();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2w70w70l3lqxv2z.R.rethrow($CLV_t2$);}finally{__CLR4_1_2w70w70l3lqxv2z.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsFragmentTest.testInvalidFragmentWithDate",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),41761,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2xcy9iow81(){try{__CLR4_1_2w70w70l3lqxv2z.R.inc(41761);
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41762);try {
            __CLR4_1_2w70w70l3lqxv2z.R.inc(41763);DateUtils.getFragmentInMilliseconds(aDate, 0);
            __CLR4_1_2w70w70l3lqxv2z.R.inc(41764);fail();
        } catch(final IllegalArgumentException iae) {}

        __CLR4_1_2w70w70l3lqxv2z.R.inc(41765);try {
            __CLR4_1_2w70w70l3lqxv2z.R.inc(41766);DateUtils.getFragmentInSeconds(aDate, 0);
            __CLR4_1_2w70w70l3lqxv2z.R.inc(41767);fail();
        } catch(final IllegalArgumentException iae) {}

        __CLR4_1_2w70w70l3lqxv2z.R.inc(41768);try {
            __CLR4_1_2w70w70l3lqxv2z.R.inc(41769);DateUtils.getFragmentInMinutes(aDate, 0);
            __CLR4_1_2w70w70l3lqxv2z.R.inc(41770);fail();
        } catch(final IllegalArgumentException iae) {}

        __CLR4_1_2w70w70l3lqxv2z.R.inc(41771);try {
            __CLR4_1_2w70w70l3lqxv2z.R.inc(41772);DateUtils.getFragmentInHours(aDate, 0);
            __CLR4_1_2w70w70l3lqxv2z.R.inc(41773);fail();
        } catch(final IllegalArgumentException iae) {}

        __CLR4_1_2w70w70l3lqxv2z.R.inc(41774);try {
            __CLR4_1_2w70w70l3lqxv2z.R.inc(41775);DateUtils.getFragmentInDays(aDate, 0);
            __CLR4_1_2w70w70l3lqxv2z.R.inc(41776);fail();
        } catch(final IllegalArgumentException iae) {}
    }finally{__CLR4_1_2w70w70l3lqxv2z.R.flushNeeded();}}

    @Test
    public void testInvalidFragmentWithCalendar() {__CLR4_1_2w70w70l3lqxv2z.R.globalSliceStart(getClass().getName(),41777);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_292xl5sw8h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2w70w70l3lqxv2z.R.rethrow($CLV_t2$);}finally{__CLR4_1_2w70w70l3lqxv2z.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsFragmentTest.testInvalidFragmentWithCalendar",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),41777,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_292xl5sw8h(){try{__CLR4_1_2w70w70l3lqxv2z.R.inc(41777);
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41778);try {
            __CLR4_1_2w70w70l3lqxv2z.R.inc(41779);DateUtils.getFragmentInMilliseconds(aCalendar, 0);
            __CLR4_1_2w70w70l3lqxv2z.R.inc(41780);fail();
        } catch(final IllegalArgumentException iae) {}

        __CLR4_1_2w70w70l3lqxv2z.R.inc(41781);try {
            __CLR4_1_2w70w70l3lqxv2z.R.inc(41782);DateUtils.getFragmentInSeconds(aCalendar, 0);
            __CLR4_1_2w70w70l3lqxv2z.R.inc(41783);fail();
        } catch(final IllegalArgumentException iae) {}

        __CLR4_1_2w70w70l3lqxv2z.R.inc(41784);try {
            __CLR4_1_2w70w70l3lqxv2z.R.inc(41785);DateUtils.getFragmentInMinutes(aCalendar, 0);
            __CLR4_1_2w70w70l3lqxv2z.R.inc(41786);fail();
        } catch(final IllegalArgumentException iae) {}

        __CLR4_1_2w70w70l3lqxv2z.R.inc(41787);try {
            __CLR4_1_2w70w70l3lqxv2z.R.inc(41788);DateUtils.getFragmentInHours(aCalendar, 0);
            __CLR4_1_2w70w70l3lqxv2z.R.inc(41789);fail();
        } catch(final IllegalArgumentException iae) {}

        __CLR4_1_2w70w70l3lqxv2z.R.inc(41790);try {
            __CLR4_1_2w70w70l3lqxv2z.R.inc(41791);DateUtils.getFragmentInDays(aCalendar, 0);
            __CLR4_1_2w70w70l3lqxv2z.R.inc(41792);fail();
        } catch(final IllegalArgumentException iae) {}
    }finally{__CLR4_1_2w70w70l3lqxv2z.R.flushNeeded();}}

    @Test
    public void testMillisecondFragmentInLargerUnitWithDate() {__CLR4_1_2w70w70l3lqxv2z.R.globalSliceStart(getClass().getName(),41793);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2ryj8cmw8x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2w70w70l3lqxv2z.R.rethrow($CLV_t2$);}finally{__CLR4_1_2w70w70l3lqxv2z.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsFragmentTest.testMillisecondFragmentInLargerUnitWithDate",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),41793,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2ryj8cmw8x(){try{__CLR4_1_2w70w70l3lqxv2z.R.inc(41793);
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41794);assertEquals(0, DateUtils.getFragmentInMilliseconds(aDate, Calendar.MILLISECOND));
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41795);assertEquals(0, DateUtils.getFragmentInSeconds(aDate, Calendar.MILLISECOND));
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41796);assertEquals(0, DateUtils.getFragmentInMinutes(aDate, Calendar.MILLISECOND));
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41797);assertEquals(0, DateUtils.getFragmentInHours(aDate, Calendar.MILLISECOND));
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41798);assertEquals(0, DateUtils.getFragmentInDays(aDate, Calendar.MILLISECOND));
    }finally{__CLR4_1_2w70w70l3lqxv2z.R.flushNeeded();}}

    @Test
    public void testMillisecondFragmentInLargerUnitWithCalendar() {__CLR4_1_2w70w70l3lqxv2z.R.globalSliceStart(getClass().getName(),41799);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2wyzmraw93();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2w70w70l3lqxv2z.R.rethrow($CLV_t2$);}finally{__CLR4_1_2w70w70l3lqxv2z.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsFragmentTest.testMillisecondFragmentInLargerUnitWithCalendar",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),41799,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2wyzmraw93(){try{__CLR4_1_2w70w70l3lqxv2z.R.inc(41799);
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41800);assertEquals(0, DateUtils.getFragmentInMilliseconds(aCalendar, Calendar.MILLISECOND));
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41801);assertEquals(0, DateUtils.getFragmentInSeconds(aCalendar, Calendar.MILLISECOND));
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41802);assertEquals(0, DateUtils.getFragmentInMinutes(aCalendar, Calendar.MILLISECOND));
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41803);assertEquals(0, DateUtils.getFragmentInHours(aCalendar, Calendar.MILLISECOND));
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41804);assertEquals(0, DateUtils.getFragmentInDays(aCalendar, Calendar.MILLISECOND));
    }finally{__CLR4_1_2w70w70l3lqxv2z.R.flushNeeded();}}
    
    @Test
    public void testSecondFragmentInLargerUnitWithDate() {__CLR4_1_2w70w70l3lqxv2z.R.globalSliceStart(getClass().getName(),41805);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2bjbqz3w99();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2w70w70l3lqxv2z.R.rethrow($CLV_t2$);}finally{__CLR4_1_2w70w70l3lqxv2z.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsFragmentTest.testSecondFragmentInLargerUnitWithDate",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),41805,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2bjbqz3w99(){try{__CLR4_1_2w70w70l3lqxv2z.R.inc(41805);
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41806);assertEquals(0, DateUtils.getFragmentInSeconds(aDate, Calendar.SECOND));
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41807);assertEquals(0, DateUtils.getFragmentInMinutes(aDate, Calendar.SECOND));
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41808);assertEquals(0, DateUtils.getFragmentInHours(aDate, Calendar.SECOND));
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41809);assertEquals(0, DateUtils.getFragmentInDays(aDate, Calendar.SECOND));
    }finally{__CLR4_1_2w70w70l3lqxv2z.R.flushNeeded();}}

    @Test
    public void testSecondFragmentInLargerUnitWithCalendar() {__CLR4_1_2w70w70l3lqxv2z.R.globalSliceStart(getClass().getName(),41810);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2cldeprw9e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2w70w70l3lqxv2z.R.rethrow($CLV_t2$);}finally{__CLR4_1_2w70w70l3lqxv2z.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsFragmentTest.testSecondFragmentInLargerUnitWithCalendar",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),41810,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2cldeprw9e(){try{__CLR4_1_2w70w70l3lqxv2z.R.inc(41810);
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41811);assertEquals(0, DateUtils.getFragmentInSeconds(aCalendar, Calendar.SECOND));
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41812);assertEquals(0, DateUtils.getFragmentInMinutes(aCalendar, Calendar.SECOND));
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41813);assertEquals(0, DateUtils.getFragmentInHours(aCalendar, Calendar.SECOND));
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41814);assertEquals(0, DateUtils.getFragmentInDays(aCalendar, Calendar.SECOND));
    }finally{__CLR4_1_2w70w70l3lqxv2z.R.flushNeeded();}}
    
    @Test
    public void testMinuteFragmentInLargerUnitWithDate() {__CLR4_1_2w70w70l3lqxv2z.R.globalSliceStart(getClass().getName(),41815);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_25pc1bjw9j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2w70w70l3lqxv2z.R.rethrow($CLV_t2$);}finally{__CLR4_1_2w70w70l3lqxv2z.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsFragmentTest.testMinuteFragmentInLargerUnitWithDate",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),41815,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_25pc1bjw9j(){try{__CLR4_1_2w70w70l3lqxv2z.R.inc(41815);
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41816);assertEquals(0, DateUtils.getFragmentInMinutes(aDate, Calendar.MINUTE));
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41817);assertEquals(0, DateUtils.getFragmentInHours(aDate, Calendar.MINUTE));
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41818);assertEquals(0, DateUtils.getFragmentInDays(aDate, Calendar.MINUTE));
    }finally{__CLR4_1_2w70w70l3lqxv2z.R.flushNeeded();}}

    @Test
    public void testMinuteFragmentInLargerUnitWithCalendar() {__CLR4_1_2w70w70l3lqxv2z.R.globalSliceStart(getClass().getName(),41819);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_24i3u1tw9n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2w70w70l3lqxv2z.R.rethrow($CLV_t2$);}finally{__CLR4_1_2w70w70l3lqxv2z.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsFragmentTest.testMinuteFragmentInLargerUnitWithCalendar",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),41819,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_24i3u1tw9n(){try{__CLR4_1_2w70w70l3lqxv2z.R.inc(41819);
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41820);assertEquals(0, DateUtils.getFragmentInMinutes(aCalendar, Calendar.MINUTE));
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41821);assertEquals(0, DateUtils.getFragmentInHours(aCalendar, Calendar.MINUTE));
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41822);assertEquals(0, DateUtils.getFragmentInDays(aCalendar, Calendar.MINUTE));
    }finally{__CLR4_1_2w70w70l3lqxv2z.R.flushNeeded();}}

    @Test
    public void testHourOfDayFragmentInLargerUnitWithDate() {__CLR4_1_2w70w70l3lqxv2z.R.globalSliceStart(getClass().getName(),41823);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2lirjcqw9r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2w70w70l3lqxv2z.R.rethrow($CLV_t2$);}finally{__CLR4_1_2w70w70l3lqxv2z.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsFragmentTest.testHourOfDayFragmentInLargerUnitWithDate",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),41823,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2lirjcqw9r(){try{__CLR4_1_2w70w70l3lqxv2z.R.inc(41823);
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41824);assertEquals(0, DateUtils.getFragmentInHours(aDate, Calendar.HOUR_OF_DAY));
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41825);assertEquals(0, DateUtils.getFragmentInDays(aDate, Calendar.HOUR_OF_DAY));
    }finally{__CLR4_1_2w70w70l3lqxv2z.R.flushNeeded();}}

    @Test
    public void testHourOfDayFragmentInLargerUnitWithCalendar() {__CLR4_1_2w70w70l3lqxv2z.R.globalSliceStart(getClass().getName(),41826);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2zek822w9u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2w70w70l3lqxv2z.R.rethrow($CLV_t2$);}finally{__CLR4_1_2w70w70l3lqxv2z.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsFragmentTest.testHourOfDayFragmentInLargerUnitWithCalendar",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),41826,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2zek822w9u(){try{__CLR4_1_2w70w70l3lqxv2z.R.inc(41826);
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41827);assertEquals(0, DateUtils.getFragmentInHours(aCalendar, Calendar.HOUR_OF_DAY));
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41828);assertEquals(0, DateUtils.getFragmentInDays(aCalendar, Calendar.HOUR_OF_DAY));
    }finally{__CLR4_1_2w70w70l3lqxv2z.R.flushNeeded();}}

    @Test
    public void testDayOfYearFragmentInLargerUnitWithDate() {__CLR4_1_2w70w70l3lqxv2z.R.globalSliceStart(getClass().getName(),41829);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_29qg6bbw9x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2w70w70l3lqxv2z.R.rethrow($CLV_t2$);}finally{__CLR4_1_2w70w70l3lqxv2z.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsFragmentTest.testDayOfYearFragmentInLargerUnitWithDate",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),41829,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_29qg6bbw9x(){try{__CLR4_1_2w70w70l3lqxv2z.R.inc(41829);
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41830);assertEquals(0, DateUtils.getFragmentInDays(aDate, Calendar.DAY_OF_YEAR));
    }finally{__CLR4_1_2w70w70l3lqxv2z.R.flushNeeded();}}

    @Test
    public void testDayOfYearFragmentInLargerUnitWithCalendar() {__CLR4_1_2w70w70l3lqxv2z.R.globalSliceStart(getClass().getName(),41831);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2nasy93w9z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2w70w70l3lqxv2z.R.rethrow($CLV_t2$);}finally{__CLR4_1_2w70w70l3lqxv2z.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsFragmentTest.testDayOfYearFragmentInLargerUnitWithCalendar",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),41831,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2nasy93w9z(){try{__CLR4_1_2w70w70l3lqxv2z.R.inc(41831);
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41832);assertEquals(0, DateUtils.getFragmentInDays(aCalendar, Calendar.DAY_OF_YEAR));
    }finally{__CLR4_1_2w70w70l3lqxv2z.R.flushNeeded();}}

    @Test
    public void testDateFragmentInLargerUnitWithDate() {__CLR4_1_2w70w70l3lqxv2z.R.globalSliceStart(getClass().getName(),41833);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2ndnm51wa1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2w70w70l3lqxv2z.R.rethrow($CLV_t2$);}finally{__CLR4_1_2w70w70l3lqxv2z.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsFragmentTest.testDateFragmentInLargerUnitWithDate",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),41833,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2ndnm51wa1(){try{__CLR4_1_2w70w70l3lqxv2z.R.inc(41833);
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41834);assertEquals(0, DateUtils.getFragmentInDays(aDate, Calendar.DATE));
    }finally{__CLR4_1_2w70w70l3lqxv2z.R.flushNeeded();}}

    @Test
    public void testDateFragmentInLargerUnitWithCalendar() {__CLR4_1_2w70w70l3lqxv2z.R.globalSliceStart(getClass().getName(),41835);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2t3q6h1wa3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2w70w70l3lqxv2z.R.rethrow($CLV_t2$);}finally{__CLR4_1_2w70w70l3lqxv2z.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsFragmentTest.testDateFragmentInLargerUnitWithCalendar",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),41835,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2t3q6h1wa3(){try{__CLR4_1_2w70w70l3lqxv2z.R.inc(41835);
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41836);assertEquals(0, DateUtils.getFragmentInDays(aCalendar, Calendar.DATE));
    }finally{__CLR4_1_2w70w70l3lqxv2z.R.flushNeeded();}}

    //Calendar.SECOND as useful fragment
    
    @Test
    public void testMillisecondsOfSecondWithDate() {__CLR4_1_2w70w70l3lqxv2z.R.globalSliceStart(getClass().getName(),41837);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2kl7crawa5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2w70w70l3lqxv2z.R.rethrow($CLV_t2$);}finally{__CLR4_1_2w70w70l3lqxv2z.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsFragmentTest.testMillisecondsOfSecondWithDate",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),41837,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2kl7crawa5(){try{__CLR4_1_2w70w70l3lqxv2z.R.inc(41837);
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41838);final long testResult = DateUtils.getFragmentInMilliseconds(aDate, Calendar.SECOND);
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41839);assertEquals(millis, testResult);
    }finally{__CLR4_1_2w70w70l3lqxv2z.R.flushNeeded();}}

    @Test
    public void testMillisecondsOfSecondWithCalendar() {__CLR4_1_2w70w70l3lqxv2z.R.globalSliceStart(getClass().getName(),41840);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2yzdnzuwa8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2w70w70l3lqxv2z.R.rethrow($CLV_t2$);}finally{__CLR4_1_2w70w70l3lqxv2z.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsFragmentTest.testMillisecondsOfSecondWithCalendar",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),41840,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2yzdnzuwa8(){try{__CLR4_1_2w70w70l3lqxv2z.R.inc(41840);
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41841);final long testResult = DateUtils.getFragmentInMilliseconds(aCalendar, Calendar.SECOND);
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41842);assertEquals(millis, testResult);
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41843);assertEquals(aCalendar.get(Calendar.MILLISECOND), testResult);
    }finally{__CLR4_1_2w70w70l3lqxv2z.R.flushNeeded();}}

    //Calendar.MINUTE as useful fragment

    @Test
    public void testMillisecondsOfMinuteWithDate() {__CLR4_1_2w70w70l3lqxv2z.R.globalSliceStart(getClass().getName(),41844);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2ezzlpywac();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2w70w70l3lqxv2z.R.rethrow($CLV_t2$);}finally{__CLR4_1_2w70w70l3lqxv2z.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsFragmentTest.testMillisecondsOfMinuteWithDate",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),41844,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2ezzlpywac(){try{__CLR4_1_2w70w70l3lqxv2z.R.inc(41844);
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41845);final long testResult = DateUtils.getFragmentInMilliseconds(aDate, Calendar.MINUTE);
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41846);assertEquals(millis + (seconds * DateUtils.MILLIS_PER_SECOND), testResult);
    }finally{__CLR4_1_2w70w70l3lqxv2z.R.flushNeeded();}}

    @Test
    public void testMillisecondsOfMinuteWithCalender() {__CLR4_1_2w70w70l3lqxv2z.R.globalSliceStart(getClass().getName(),41847);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2qasdyiwaf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2w70w70l3lqxv2z.R.rethrow($CLV_t2$);}finally{__CLR4_1_2w70w70l3lqxv2z.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsFragmentTest.testMillisecondsOfMinuteWithCalender",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),41847,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2qasdyiwaf(){try{__CLR4_1_2w70w70l3lqxv2z.R.inc(41847);
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41848);final long testResult = DateUtils.getFragmentInMilliseconds(aCalendar, Calendar.MINUTE);
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41849);assertEquals(millis + (seconds * DateUtils.MILLIS_PER_SECOND), testResult);
    }finally{__CLR4_1_2w70w70l3lqxv2z.R.flushNeeded();}}

    @Test
    public void testSecondsofMinuteWithDate() {__CLR4_1_2w70w70l3lqxv2z.R.globalSliceStart(getClass().getName(),41850);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2u66g9fwai();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2w70w70l3lqxv2z.R.rethrow($CLV_t2$);}finally{__CLR4_1_2w70w70l3lqxv2z.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsFragmentTest.testSecondsofMinuteWithDate",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),41850,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2u66g9fwai(){try{__CLR4_1_2w70w70l3lqxv2z.R.inc(41850);
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41851);final long testResult = DateUtils.getFragmentInSeconds(aDate, Calendar.MINUTE);
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41852);assertEquals(seconds, testResult);
    }finally{__CLR4_1_2w70w70l3lqxv2z.R.flushNeeded();}}

    @Test
    public void testSecondsofMinuteWithCalendar() {__CLR4_1_2w70w70l3lqxv2z.R.globalSliceStart(getClass().getName(),41853);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2ccofhfwal();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2w70w70l3lqxv2z.R.rethrow($CLV_t2$);}finally{__CLR4_1_2w70w70l3lqxv2z.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsFragmentTest.testSecondsofMinuteWithCalendar",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),41853,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2ccofhfwal(){try{__CLR4_1_2w70w70l3lqxv2z.R.inc(41853);
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41854);final long testResult = DateUtils.getFragmentInSeconds(aCalendar, Calendar.MINUTE);
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41855);assertEquals(seconds, testResult);
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41856);assertEquals(aCalendar.get(Calendar.SECOND), testResult);
    }finally{__CLR4_1_2w70w70l3lqxv2z.R.flushNeeded();}}

    //Calendar.HOUR_OF_DAY as useful fragment
    
    @Test
    public void testMillisecondsOfHourWithDate() {__CLR4_1_2w70w70l3lqxv2z.R.globalSliceStart(getClass().getName(),41857);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2o4gy56wap();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2w70w70l3lqxv2z.R.rethrow($CLV_t2$);}finally{__CLR4_1_2w70w70l3lqxv2z.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsFragmentTest.testMillisecondsOfHourWithDate",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),41857,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2o4gy56wap(){try{__CLR4_1_2w70w70l3lqxv2z.R.inc(41857);
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41858);final long testResult = DateUtils.getFragmentInMilliseconds(aDate, Calendar.HOUR_OF_DAY);
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41859);assertEquals(millis + (seconds * DateUtils.MILLIS_PER_SECOND) + (minutes * DateUtils.MILLIS_PER_MINUTE), testResult);
    }finally{__CLR4_1_2w70w70l3lqxv2z.R.flushNeeded();}}
    
    @Test
    public void testMillisecondsOfHourWithCalendar() {__CLR4_1_2w70w70l3lqxv2z.R.globalSliceStart(getClass().getName(),41860);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_26m0naiwas();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2w70w70l3lqxv2z.R.rethrow($CLV_t2$);}finally{__CLR4_1_2w70w70l3lqxv2z.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsFragmentTest.testMillisecondsOfHourWithCalendar",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),41860,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_26m0naiwas(){try{__CLR4_1_2w70w70l3lqxv2z.R.inc(41860);
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41861);final long testResult = DateUtils.getFragmentInMilliseconds(aCalendar, Calendar.HOUR_OF_DAY);
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41862);assertEquals(millis + (seconds * DateUtils.MILLIS_PER_SECOND) + (minutes * DateUtils.MILLIS_PER_MINUTE), testResult);
    }finally{__CLR4_1_2w70w70l3lqxv2z.R.flushNeeded();}}

    @Test
    public void testSecondsofHourWithDate() {__CLR4_1_2w70w70l3lqxv2z.R.globalSliceStart(getClass().getName(),41863);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2i9aiebwav();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2w70w70l3lqxv2z.R.rethrow($CLV_t2$);}finally{__CLR4_1_2w70w70l3lqxv2z.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsFragmentTest.testSecondsofHourWithDate",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),41863,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2i9aiebwav(){try{__CLR4_1_2w70w70l3lqxv2z.R.inc(41863);
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41864);final long testResult = DateUtils.getFragmentInSeconds(aDate, Calendar.HOUR_OF_DAY);
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41865);assertEquals(
                seconds
                        + (minutes
                                * DateUtils.MILLIS_PER_MINUTE / DateUtils.MILLIS_PER_SECOND),
                testResult);
    }finally{__CLR4_1_2w70w70l3lqxv2z.R.flushNeeded();}}

    @Test
    public void testSecondsofHourWithCalendar() {__CLR4_1_2w70w70l3lqxv2z.R.globalSliceStart(getClass().getName(),41866);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2gdu1bnway();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2w70w70l3lqxv2z.R.rethrow($CLV_t2$);}finally{__CLR4_1_2w70w70l3lqxv2z.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsFragmentTest.testSecondsofHourWithCalendar",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),41866,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2gdu1bnway(){try{__CLR4_1_2w70w70l3lqxv2z.R.inc(41866);
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41867);final long testResult = DateUtils.getFragmentInSeconds(aCalendar, Calendar.HOUR_OF_DAY);
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41868);assertEquals(
                seconds
                        + (minutes
                                * DateUtils.MILLIS_PER_MINUTE / DateUtils.MILLIS_PER_SECOND),
                testResult);
    }finally{__CLR4_1_2w70w70l3lqxv2z.R.flushNeeded();}}

    @Test
    public void testMinutesOfHourWithDate() {__CLR4_1_2w70w70l3lqxv2z.R.globalSliceStart(getClass().getName(),41869);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2osm1gdwb1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2w70w70l3lqxv2z.R.rethrow($CLV_t2$);}finally{__CLR4_1_2w70w70l3lqxv2z.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsFragmentTest.testMinutesOfHourWithDate",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),41869,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2osm1gdwb1(){try{__CLR4_1_2w70w70l3lqxv2z.R.inc(41869);
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41870);final long testResult = DateUtils.getFragmentInMinutes(aDate, Calendar.HOUR_OF_DAY);
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41871);assertEquals(minutes, testResult);
    }finally{__CLR4_1_2w70w70l3lqxv2z.R.flushNeeded();}}

    @Test
    public void testMinutesOfHourWithCalendar() {__CLR4_1_2w70w70l3lqxv2z.R.globalSliceStart(getClass().getName(),41872);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2obp60jwb4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2w70w70l3lqxv2z.R.rethrow($CLV_t2$);}finally{__CLR4_1_2w70w70l3lqxv2z.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsFragmentTest.testMinutesOfHourWithCalendar",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),41872,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2obp60jwb4(){try{__CLR4_1_2w70w70l3lqxv2z.R.inc(41872);
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41873);final long testResult = DateUtils.getFragmentInMinutes(aCalendar, Calendar.HOUR_OF_DAY);
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41874);assertEquals(minutes, testResult);
    }finally{__CLR4_1_2w70w70l3lqxv2z.R.flushNeeded();}}

    //Calendar.DATE and Calendar.DAY_OF_YEAR as useful fragment
    @Test
    public void testMillisecondsOfDayWithDate() {__CLR4_1_2w70w70l3lqxv2z.R.globalSliceStart(getClass().getName(),41875);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2v0583gwb7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2w70w70l3lqxv2z.R.rethrow($CLV_t2$);}finally{__CLR4_1_2w70w70l3lqxv2z.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsFragmentTest.testMillisecondsOfDayWithDate",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),41875,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2v0583gwb7(){try{__CLR4_1_2w70w70l3lqxv2z.R.inc(41875);
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41876);long testresult = DateUtils.getFragmentInMilliseconds(aDate, Calendar.DATE);
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41877);final long expectedValue = millis + (seconds * DateUtils.MILLIS_PER_SECOND) + (minutes * DateUtils.MILLIS_PER_MINUTE) + (hours * DateUtils.MILLIS_PER_HOUR); 
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41878);assertEquals(expectedValue, testresult);
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41879);testresult = DateUtils.getFragmentInMilliseconds(aDate, Calendar.DAY_OF_YEAR);
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41880);assertEquals(expectedValue, testresult);
    }finally{__CLR4_1_2w70w70l3lqxv2z.R.flushNeeded();}}
    
    @Test
    public void testMillisecondsOfDayWithCalendar() {__CLR4_1_2w70w70l3lqxv2z.R.globalSliceStart(getClass().getName(),41881);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2sjp2uswbd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2w70w70l3lqxv2z.R.rethrow($CLV_t2$);}finally{__CLR4_1_2w70w70l3lqxv2z.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsFragmentTest.testMillisecondsOfDayWithCalendar",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),41881,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2sjp2uswbd(){try{__CLR4_1_2w70w70l3lqxv2z.R.inc(41881);
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41882);long testresult = DateUtils.getFragmentInMilliseconds(aCalendar, Calendar.DATE);
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41883);final long expectedValue = millis + (seconds * DateUtils.MILLIS_PER_SECOND) + (minutes * DateUtils.MILLIS_PER_MINUTE) + (hours * DateUtils.MILLIS_PER_HOUR); 
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41884);assertEquals(expectedValue, testresult);
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41885);testresult = DateUtils.getFragmentInMilliseconds(aCalendar, Calendar.DAY_OF_YEAR);
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41886);assertEquals(expectedValue, testresult);
    }finally{__CLR4_1_2w70w70l3lqxv2z.R.flushNeeded();}}

    @Test
    public void testSecondsOfDayWithDate() {__CLR4_1_2w70w70l3lqxv2z.R.globalSliceStart(getClass().getName(),41887);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2quz6szwbj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2w70w70l3lqxv2z.R.rethrow($CLV_t2$);}finally{__CLR4_1_2w70w70l3lqxv2z.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsFragmentTest.testSecondsOfDayWithDate",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),41887,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2quz6szwbj(){try{__CLR4_1_2w70w70l3lqxv2z.R.inc(41887);
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41888);long testresult = DateUtils.getFragmentInSeconds(aDate, Calendar.DATE);
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41889);final long expectedValue = seconds + ((minutes * DateUtils.MILLIS_PER_MINUTE) + (hours * DateUtils.MILLIS_PER_HOUR))/ DateUtils.MILLIS_PER_SECOND;
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41890);assertEquals(expectedValue, testresult);
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41891);testresult = DateUtils.getFragmentInSeconds(aDate, Calendar.DAY_OF_YEAR);
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41892);assertEquals(expectedValue, testresult);
    }finally{__CLR4_1_2w70w70l3lqxv2z.R.flushNeeded();}}

    @Test
    public void testSecondsOfDayWithCalendar() {__CLR4_1_2w70w70l3lqxv2z.R.globalSliceStart(getClass().getName(),41893);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2wfqvr1wbp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2w70w70l3lqxv2z.R.rethrow($CLV_t2$);}finally{__CLR4_1_2w70w70l3lqxv2z.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsFragmentTest.testSecondsOfDayWithCalendar",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),41893,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2wfqvr1wbp(){try{__CLR4_1_2w70w70l3lqxv2z.R.inc(41893);
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41894);long testresult = DateUtils.getFragmentInSeconds(aCalendar, Calendar.DATE);
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41895);final long expectedValue = seconds + ((minutes * DateUtils.MILLIS_PER_MINUTE) + (hours * DateUtils.MILLIS_PER_HOUR))/ DateUtils.MILLIS_PER_SECOND;
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41896);assertEquals(expectedValue, testresult);
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41897);testresult = DateUtils.getFragmentInSeconds(aCalendar, Calendar.DAY_OF_YEAR);
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41898);assertEquals(expectedValue, testresult);
    }finally{__CLR4_1_2w70w70l3lqxv2z.R.flushNeeded();}}

    @Test
    public void testMinutesOfDayWithDate() {__CLR4_1_2w70w70l3lqxv2z.R.globalSliceStart(getClass().getName(),41899);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2d020dwbv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2w70w70l3lqxv2z.R.rethrow($CLV_t2$);}finally{__CLR4_1_2w70w70l3lqxv2z.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsFragmentTest.testMinutesOfDayWithDate",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),41899,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2d020dwbv(){try{__CLR4_1_2w70w70l3lqxv2z.R.inc(41899);
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41900);long testResult = DateUtils.getFragmentInMinutes(aDate, Calendar.DATE);
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41901);final long expectedValue = minutes + ((hours * DateUtils.MILLIS_PER_HOUR))/ DateUtils.MILLIS_PER_MINUTE; 
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41902);assertEquals(expectedValue,testResult);
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41903);testResult = DateUtils.getFragmentInMinutes(aDate, Calendar.DAY_OF_YEAR);
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41904);assertEquals(expectedValue,testResult);
    }finally{__CLR4_1_2w70w70l3lqxv2z.R.flushNeeded();}}

    @Test
    public void testMinutesOfDayWithCalendar() {__CLR4_1_2w70w70l3lqxv2z.R.globalSliceStart(getClass().getName(),41905);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2wk3na5wc1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2w70w70l3lqxv2z.R.rethrow($CLV_t2$);}finally{__CLR4_1_2w70w70l3lqxv2z.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsFragmentTest.testMinutesOfDayWithCalendar",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),41905,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2wk3na5wc1(){try{__CLR4_1_2w70w70l3lqxv2z.R.inc(41905);
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41906);long testResult = DateUtils.getFragmentInMinutes(aCalendar, Calendar.DATE);
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41907);final long expectedValue = minutes + ((hours * DateUtils.MILLIS_PER_HOUR))/ DateUtils.MILLIS_PER_MINUTE; 
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41908);assertEquals(expectedValue, testResult);
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41909);testResult = DateUtils.getFragmentInMinutes(aCalendar, Calendar.DAY_OF_YEAR);
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41910);assertEquals(expectedValue, testResult);
    }finally{__CLR4_1_2w70w70l3lqxv2z.R.flushNeeded();}}
    
    @Test
    public void testHoursOfDayWithDate() {__CLR4_1_2w70w70l3lqxv2z.R.globalSliceStart(getClass().getName(),41911);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2wxt9nnwc7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2w70w70l3lqxv2z.R.rethrow($CLV_t2$);}finally{__CLR4_1_2w70w70l3lqxv2z.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsFragmentTest.testHoursOfDayWithDate",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),41911,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2wxt9nnwc7(){try{__CLR4_1_2w70w70l3lqxv2z.R.inc(41911);
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41912);long testResult = DateUtils.getFragmentInHours(aDate, Calendar.DATE);
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41913);final long expectedValue = hours; 
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41914);assertEquals(expectedValue,testResult);
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41915);testResult = DateUtils.getFragmentInHours(aDate, Calendar.DAY_OF_YEAR);
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41916);assertEquals(expectedValue,testResult);
    }finally{__CLR4_1_2w70w70l3lqxv2z.R.flushNeeded();}}

    @Test
    public void testHoursOfDayWithCalendar() {__CLR4_1_2w70w70l3lqxv2z.R.globalSliceStart(getClass().getName(),41917);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2m4pv7xwcd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2w70w70l3lqxv2z.R.rethrow($CLV_t2$);}finally{__CLR4_1_2w70w70l3lqxv2z.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsFragmentTest.testHoursOfDayWithCalendar",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),41917,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2m4pv7xwcd(){try{__CLR4_1_2w70w70l3lqxv2z.R.inc(41917);
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41918);long testResult = DateUtils.getFragmentInHours(aCalendar, Calendar.DATE);
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41919);final long expectedValue = hours; 
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41920);assertEquals(expectedValue, testResult);
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41921);testResult = DateUtils.getFragmentInHours(aCalendar, Calendar.DAY_OF_YEAR);
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41922);assertEquals(expectedValue, testResult);
    }finally{__CLR4_1_2w70w70l3lqxv2z.R.flushNeeded();}}
    
    
    //Calendar.MONTH as useful fragment
    @Test
    public void testMillisecondsOfMonthWithDate() {__CLR4_1_2w70w70l3lqxv2z.R.globalSliceStart(getClass().getName(),41923);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2gmutggwcj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2w70w70l3lqxv2z.R.rethrow($CLV_t2$);}finally{__CLR4_1_2w70w70l3lqxv2z.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsFragmentTest.testMillisecondsOfMonthWithDate",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),41923,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2gmutggwcj(){try{__CLR4_1_2w70w70l3lqxv2z.R.inc(41923);
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41924);final long testResult = DateUtils.getFragmentInMilliseconds(aDate, Calendar.MONTH);
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41925);assertEquals(millis + (seconds * DateUtils.MILLIS_PER_SECOND) + (minutes * DateUtils.MILLIS_PER_MINUTE)
                                + (hours * DateUtils.MILLIS_PER_HOUR) + (days * DateUtils.MILLIS_PER_DAY),
                testResult);
    }finally{__CLR4_1_2w70w70l3lqxv2z.R.flushNeeded();}}

    @Test
    public void testMillisecondsOfMonthWithCalendar() {__CLR4_1_2w70w70l3lqxv2z.R.globalSliceStart(getClass().getName(),41926);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2oi9m6owcm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2w70w70l3lqxv2z.R.rethrow($CLV_t2$);}finally{__CLR4_1_2w70w70l3lqxv2z.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsFragmentTest.testMillisecondsOfMonthWithCalendar",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),41926,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2oi9m6owcm(){try{__CLR4_1_2w70w70l3lqxv2z.R.inc(41926);
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41927);final long testResult = DateUtils.getFragmentInMilliseconds(aCalendar, Calendar.MONTH);
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41928);assertEquals(millis + (seconds * DateUtils.MILLIS_PER_SECOND) + (minutes * DateUtils.MILLIS_PER_MINUTE)
                + (hours * DateUtils.MILLIS_PER_HOUR) + (days * DateUtils.MILLIS_PER_DAY),
testResult);
    }finally{__CLR4_1_2w70w70l3lqxv2z.R.flushNeeded();}}
    
    @Test
    public void testSecondsOfMonthWithDate() {__CLR4_1_2w70w70l3lqxv2z.R.globalSliceStart(getClass().getName(),41929);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2kuo7e1wcp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2w70w70l3lqxv2z.R.rethrow($CLV_t2$);}finally{__CLR4_1_2w70w70l3lqxv2z.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsFragmentTest.testSecondsOfMonthWithDate",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),41929,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2kuo7e1wcp(){try{__CLR4_1_2w70w70l3lqxv2z.R.inc(41929);
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41930);final long testResult = DateUtils.getFragmentInSeconds(aDate, Calendar.MONTH);
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41931);assertEquals(
                seconds
                        + ((minutes * DateUtils.MILLIS_PER_MINUTE)
                                + (hours * DateUtils.MILLIS_PER_HOUR) + (days * DateUtils.MILLIS_PER_DAY))
                        / DateUtils.MILLIS_PER_SECOND,
                testResult);
    }finally{__CLR4_1_2w70w70l3lqxv2z.R.flushNeeded();}}

    @Test
    public void testSecondsOfMonthWithCalendar() {__CLR4_1_2w70w70l3lqxv2z.R.globalSliceStart(getClass().getName(),41932);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_21kkxlzwcs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2w70w70l3lqxv2z.R.rethrow($CLV_t2$);}finally{__CLR4_1_2w70w70l3lqxv2z.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsFragmentTest.testSecondsOfMonthWithCalendar",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),41932,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_21kkxlzwcs(){try{__CLR4_1_2w70w70l3lqxv2z.R.inc(41932);
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41933);final long testResult = DateUtils.getFragmentInSeconds(aCalendar, Calendar.MONTH);
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41934);assertEquals(
                seconds
                        + ((minutes * DateUtils.MILLIS_PER_MINUTE)
                                + (hours * DateUtils.MILLIS_PER_HOUR) + (days * DateUtils.MILLIS_PER_DAY))
                        / DateUtils.MILLIS_PER_SECOND,
                testResult);
    }finally{__CLR4_1_2w70w70l3lqxv2z.R.flushNeeded();}}

    @Test
    public void testMinutesOfMonthWithDate() {__CLR4_1_2w70w70l3lqxv2z.R.globalSliceStart(getClass().getName(),41935);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2tk1qgnwcv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2w70w70l3lqxv2z.R.rethrow($CLV_t2$);}finally{__CLR4_1_2w70w70l3lqxv2z.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsFragmentTest.testMinutesOfMonthWithDate",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),41935,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2tk1qgnwcv(){try{__CLR4_1_2w70w70l3lqxv2z.R.inc(41935);
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41936);final long testResult = DateUtils.getFragmentInMinutes(aDate, Calendar.MONTH);
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41937);assertEquals(minutes
                                + ((hours * DateUtils.MILLIS_PER_HOUR) + (days * DateUtils.MILLIS_PER_DAY))
                        / DateUtils.MILLIS_PER_MINUTE,
                testResult);
    }finally{__CLR4_1_2w70w70l3lqxv2z.R.flushNeeded();}}

    @Test
    public void testMinutesOfMonthWithCalendar() {__CLR4_1_2w70w70l3lqxv2z.R.globalSliceStart(getClass().getName(),41938);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2re24efwcy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2w70w70l3lqxv2z.R.rethrow($CLV_t2$);}finally{__CLR4_1_2w70w70l3lqxv2z.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsFragmentTest.testMinutesOfMonthWithCalendar",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),41938,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2re24efwcy(){try{__CLR4_1_2w70w70l3lqxv2z.R.inc(41938);
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41939);final long testResult = DateUtils.getFragmentInMinutes(aCalendar, Calendar.MONTH);
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41940);assertEquals( minutes  +((hours * DateUtils.MILLIS_PER_HOUR) + (days * DateUtils.MILLIS_PER_DAY))
                        / DateUtils.MILLIS_PER_MINUTE,
                testResult);
    }finally{__CLR4_1_2w70w70l3lqxv2z.R.flushNeeded();}}

    @Test
    public void testHoursOfMonthWithDate() {__CLR4_1_2w70w70l3lqxv2z.R.globalSliceStart(getClass().getName(),41941);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_23oykqhwd1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2w70w70l3lqxv2z.R.rethrow($CLV_t2$);}finally{__CLR4_1_2w70w70l3lqxv2z.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsFragmentTest.testHoursOfMonthWithDate",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),41941,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_23oykqhwd1(){try{__CLR4_1_2w70w70l3lqxv2z.R.inc(41941);
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41942);final long testResult = DateUtils.getFragmentInHours(aDate, Calendar.MONTH);
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41943);assertEquals(hours + ((days * DateUtils.MILLIS_PER_DAY))
                        / DateUtils.MILLIS_PER_HOUR,
                testResult);
    }finally{__CLR4_1_2w70w70l3lqxv2z.R.flushNeeded();}}

    @Test
    public void testHoursOfMonthWithCalendar() {__CLR4_1_2w70w70l3lqxv2z.R.globalSliceStart(getClass().getName(),41944);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2wo0h7bwd4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2w70w70l3lqxv2z.R.rethrow($CLV_t2$);}finally{__CLR4_1_2w70w70l3lqxv2z.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsFragmentTest.testHoursOfMonthWithCalendar",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),41944,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2wo0h7bwd4(){try{__CLR4_1_2w70w70l3lqxv2z.R.inc(41944);
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41945);final long testResult = DateUtils.getFragmentInHours(aCalendar, Calendar.MONTH);
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41946);assertEquals( hours +((days * DateUtils.MILLIS_PER_DAY))
                        / DateUtils.MILLIS_PER_HOUR,
                testResult);
    }finally{__CLR4_1_2w70w70l3lqxv2z.R.flushNeeded();}}
    
    //Calendar.YEAR as useful fragment
    @Test
    public void testMillisecondsOfYearWithDate() {__CLR4_1_2w70w70l3lqxv2z.R.globalSliceStart(getClass().getName(),41947);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2r2oz59wd7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2w70w70l3lqxv2z.R.rethrow($CLV_t2$);}finally{__CLR4_1_2w70w70l3lqxv2z.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsFragmentTest.testMillisecondsOfYearWithDate",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),41947,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2r2oz59wd7(){try{__CLR4_1_2w70w70l3lqxv2z.R.inc(41947);
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41948);final long testResult = DateUtils.getFragmentInMilliseconds(aDate, Calendar.YEAR);
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41949);final Calendar cal = Calendar.getInstance();
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41950);cal.setTime(aDate);
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41951);assertEquals(millis + (seconds * DateUtils.MILLIS_PER_SECOND) + (minutes * DateUtils.MILLIS_PER_MINUTE)
                                + (hours * DateUtils.MILLIS_PER_HOUR) + (cal.get(Calendar.DAY_OF_YEAR) * DateUtils.MILLIS_PER_DAY),
                testResult);
    }finally{__CLR4_1_2w70w70l3lqxv2z.R.flushNeeded();}}

    @Test
    public void testMillisecondsOfYearWithCalendar() {__CLR4_1_2w70w70l3lqxv2z.R.globalSliceStart(getClass().getName(),41952);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_236aul9wdc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2w70w70l3lqxv2z.R.rethrow($CLV_t2$);}finally{__CLR4_1_2w70w70l3lqxv2z.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsFragmentTest.testMillisecondsOfYearWithCalendar",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),41952,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_236aul9wdc(){try{__CLR4_1_2w70w70l3lqxv2z.R.inc(41952);
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41953);final long testResult = DateUtils.getFragmentInMilliseconds(aCalendar, Calendar.YEAR);
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41954);assertEquals(millis + (seconds * DateUtils.MILLIS_PER_SECOND) + (minutes * DateUtils.MILLIS_PER_MINUTE)
                + (hours * DateUtils.MILLIS_PER_HOUR) + (aCalendar.get(Calendar.DAY_OF_YEAR) * DateUtils.MILLIS_PER_DAY),
testResult);
    }finally{__CLR4_1_2w70w70l3lqxv2z.R.flushNeeded();}}
    
    @Test
    public void testSecondsOfYearWithDate() {__CLR4_1_2w70w70l3lqxv2z.R.globalSliceStart(getClass().getName(),41955);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2dgnz7owdf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2w70w70l3lqxv2z.R.rethrow($CLV_t2$);}finally{__CLR4_1_2w70w70l3lqxv2z.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsFragmentTest.testSecondsOfYearWithDate",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),41955,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2dgnz7owdf(){try{__CLR4_1_2w70w70l3lqxv2z.R.inc(41955);
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41956);final long testResult = DateUtils.getFragmentInSeconds(aDate, Calendar.YEAR);
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41957);final Calendar cal = Calendar.getInstance();
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41958);cal.setTime(aDate);
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41959);assertEquals(
                seconds
                        + ((minutes * DateUtils.MILLIS_PER_MINUTE)
                                + (hours * DateUtils.MILLIS_PER_HOUR) + (cal.get(Calendar.DAY_OF_YEAR) * DateUtils.MILLIS_PER_DAY))
                        / DateUtils.MILLIS_PER_SECOND,
                testResult);
    }finally{__CLR4_1_2w70w70l3lqxv2z.R.flushNeeded();}}

    @Test
    public void testSecondsOfYearWithCalendar() {__CLR4_1_2w70w70l3lqxv2z.R.globalSliceStart(getClass().getName(),41960);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2iaddl8wdk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2w70w70l3lqxv2z.R.rethrow($CLV_t2$);}finally{__CLR4_1_2w70w70l3lqxv2z.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsFragmentTest.testSecondsOfYearWithCalendar",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),41960,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2iaddl8wdk(){try{__CLR4_1_2w70w70l3lqxv2z.R.inc(41960);
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41961);final long testResult = DateUtils.getFragmentInSeconds(aCalendar, Calendar.YEAR);
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41962);assertEquals(
                seconds
                        + ((minutes * DateUtils.MILLIS_PER_MINUTE)
                                + (hours * DateUtils.MILLIS_PER_HOUR) + (aCalendar.get(Calendar.DAY_OF_YEAR) * DateUtils.MILLIS_PER_DAY))
                        / DateUtils.MILLIS_PER_SECOND,
                testResult);
    }finally{__CLR4_1_2w70w70l3lqxv2z.R.flushNeeded();}}

    @Test
    public void testMinutesOfYearWithDate() {__CLR4_1_2w70w70l3lqxv2z.R.globalSliceStart(getClass().getName(),41963);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_24ynwrowdn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2w70w70l3lqxv2z.R.rethrow($CLV_t2$);}finally{__CLR4_1_2w70w70l3lqxv2z.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsFragmentTest.testMinutesOfYearWithDate",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),41963,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_24ynwrowdn(){try{__CLR4_1_2w70w70l3lqxv2z.R.inc(41963);
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41964);final long testResult = DateUtils.getFragmentInMinutes(aDate, Calendar.YEAR);
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41965);final Calendar cal = Calendar.getInstance();
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41966);cal.setTime(aDate);
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41967);assertEquals(minutes
                                + ((hours * DateUtils.MILLIS_PER_HOUR) + (cal.get(Calendar.DAY_OF_YEAR) * DateUtils.MILLIS_PER_DAY))
                        / DateUtils.MILLIS_PER_MINUTE,
                testResult);
    }finally{__CLR4_1_2w70w70l3lqxv2z.R.flushNeeded();}}

    @Test
    public void testMinutesOfYearWithCalendar() {__CLR4_1_2w70w70l3lqxv2z.R.globalSliceStart(getClass().getName(),41968);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2ejdo4swds();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2w70w70l3lqxv2z.R.rethrow($CLV_t2$);}finally{__CLR4_1_2w70w70l3lqxv2z.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsFragmentTest.testMinutesOfYearWithCalendar",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),41968,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2ejdo4swds(){try{__CLR4_1_2w70w70l3lqxv2z.R.inc(41968);
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41969);final long testResult = DateUtils.getFragmentInMinutes(aCalendar, Calendar.YEAR);
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41970);assertEquals( minutes  +((hours * DateUtils.MILLIS_PER_HOUR) + (aCalendar.get(Calendar.DAY_OF_YEAR) * DateUtils.MILLIS_PER_DAY))
                        / DateUtils.MILLIS_PER_MINUTE,
                testResult);
    }finally{__CLR4_1_2w70w70l3lqxv2z.R.flushNeeded();}}

    @Test
    public void testHoursOfYearWithDate() {__CLR4_1_2w70w70l3lqxv2z.R.globalSliceStart(getClass().getName(),41971);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2wx0d8swdv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2w70w70l3lqxv2z.R.rethrow($CLV_t2$);}finally{__CLR4_1_2w70w70l3lqxv2z.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsFragmentTest.testHoursOfYearWithDate",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),41971,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2wx0d8swdv(){try{__CLR4_1_2w70w70l3lqxv2z.R.inc(41971);
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41972);final long testResult = DateUtils.getFragmentInHours(aDate, Calendar.YEAR);
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41973);final Calendar cal = Calendar.getInstance();
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41974);cal.setTime(aDate);
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41975);assertEquals(hours + ((cal.get(Calendar.DAY_OF_YEAR) * DateUtils.MILLIS_PER_DAY))
                        / DateUtils.MILLIS_PER_HOUR,
                testResult);
    }finally{__CLR4_1_2w70w70l3lqxv2z.R.flushNeeded();}}

    @Test
    public void testHoursOfYearWithCalendar() {__CLR4_1_2w70w70l3lqxv2z.R.globalSliceStart(getClass().getName(),41976);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2hdbftwwe0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2w70w70l3lqxv2z.R.rethrow($CLV_t2$);}finally{__CLR4_1_2w70w70l3lqxv2z.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsFragmentTest.testHoursOfYearWithCalendar",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),41976,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2hdbftwwe0(){try{__CLR4_1_2w70w70l3lqxv2z.R.inc(41976);
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41977);final long testResult = DateUtils.getFragmentInHours(aCalendar, Calendar.YEAR);
        __CLR4_1_2w70w70l3lqxv2z.R.inc(41978);assertEquals( hours +((aCalendar.get(Calendar.DAY_OF_YEAR) * DateUtils.MILLIS_PER_DAY))
                        / DateUtils.MILLIS_PER_HOUR,
                testResult);
    }finally{__CLR4_1_2w70w70l3lqxv2z.R.flushNeeded();}}
}
