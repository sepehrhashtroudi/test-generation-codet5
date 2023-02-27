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
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * These Unit-tests will check all possible extremes when using some rounding-methods of DateUtils.
 * The extremes are tested at the switch-point in milliseconds
 * 
 * According to the implementation SEMI_MONTH will either round/truncate to the 1st or 16th
 * When rounding Calendar.MONTH it depends on the number of days within that month.
 * A month with 28 days will be rounded up from the 15th
 * A month with 29 or 30 days will be rounded up from the 16th
 * A month with 31 days will be rounded up from the 17th
 * 
 * @since 3.0
 * @version $Id$
 */
public class DateUtilsRoundingTest {static class __CLR4_1_2we3we3l3lqxv3r{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492830024L,8589935092L,42289,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    DateFormat dateTimeParser;
    
    Date januaryOneDate;
    Date targetYearDate;
    //No targetMonths, these must be tested for every type of month(28-31 days)
    Date targetDateDate, targetDayOfMonthDate, targetAmDate, targetPmDate;
    Date targetHourOfDayDate, targetHourDate;
    Date targetMinuteDate;
    Date targetSecondDate;
    Date targetMilliSecondDate;

    Calendar januaryOneCalendar;
    FastDateFormat fdf = DateFormatUtils.ISO_DATETIME_FORMAT;


    @Before
    public void setUp() throws Exception {try{__CLR4_1_2we3we3l3lqxv3r.R.inc(41979);

        __CLR4_1_2we3we3l3lqxv3r.R.inc(41980);dateTimeParser = new SimpleDateFormat("MMM dd, yyyy H:mm:ss.SSS", Locale.ENGLISH);
        
        __CLR4_1_2we3we3l3lqxv3r.R.inc(41981);targetYearDate = dateTimeParser.parse("January 1, 2007 0:00:00.000");
        __CLR4_1_2we3we3l3lqxv3r.R.inc(41982);targetDateDate = targetDayOfMonthDate = dateTimeParser.parse("June 1, 2008 0:00:00.000");
        __CLR4_1_2we3we3l3lqxv3r.R.inc(41983);targetAmDate =  dateTimeParser.parse("June 1, 2008 0:00:00.000");
        __CLR4_1_2we3we3l3lqxv3r.R.inc(41984);targetPmDate = dateTimeParser.parse("June 1, 2008 12:00:00.000");
        __CLR4_1_2we3we3l3lqxv3r.R.inc(41985);targetHourDate = dateTimeParser.parse("June 1, 2008 8:00:00.000");
        __CLR4_1_2we3we3l3lqxv3r.R.inc(41986);targetHourOfDayDate = dateTimeParser.parse("June 1, 2008 8:00:00.000");
        __CLR4_1_2we3we3l3lqxv3r.R.inc(41987);targetMinuteDate =  dateTimeParser.parse("June 1, 2008 8:15:00.000");
        __CLR4_1_2we3we3l3lqxv3r.R.inc(41988);targetSecondDate =  dateTimeParser.parse("June 1, 2008 8:15:14.000");
        __CLR4_1_2we3we3l3lqxv3r.R.inc(41989);targetMilliSecondDate =  dateTimeParser.parse("June 1, 2008 8:15:14.231");
        
        __CLR4_1_2we3we3l3lqxv3r.R.inc(41990);januaryOneDate = dateTimeParser.parse("January 1, 2008 0:00:00.000");
        __CLR4_1_2we3we3l3lqxv3r.R.inc(41991);januaryOneCalendar = Calendar.getInstance();
        __CLR4_1_2we3we3l3lqxv3r.R.inc(41992);januaryOneCalendar.setTime(januaryOneDate);
    }finally{__CLR4_1_2we3we3l3lqxv3r.R.flushNeeded();}}

    /**
     * Tests DateUtils.round()-method with Calendar.Year
     * 
     * @throws Exception
     * @since 3.0
     */
    @Test
    public void testRoundYear() throws Exception {__CLR4_1_2we3we3l3lqxv3r.R.globalSliceStart(getClass().getName(),41993);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2mx3s0weh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2we3we3l3lqxv3r.R.rethrow($CLV_t2$);}finally{__CLR4_1_2we3we3l3lqxv3r.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsRoundingTest.testRoundYear",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),41993,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2mx3s0weh() throws Exception{try{__CLR4_1_2we3we3l3lqxv3r.R.inc(41993);
        __CLR4_1_2we3we3l3lqxv3r.R.inc(41994);final int calendarField = Calendar.YEAR;
        __CLR4_1_2we3we3l3lqxv3r.R.inc(41995);final Date roundedUpDate = dateTimeParser.parse("January 1, 2008 0:00:00.000");
        __CLR4_1_2we3we3l3lqxv3r.R.inc(41996);final Date roundedDownDate = targetYearDate;
        __CLR4_1_2we3we3l3lqxv3r.R.inc(41997);final Date lastRoundedDownDate = dateTimeParser.parse("June 30, 2007 23:59:59.999");
        __CLR4_1_2we3we3l3lqxv3r.R.inc(41998);baseRoundTest(roundedUpDate, roundedDownDate, lastRoundedDownDate,  calendarField);
    }finally{__CLR4_1_2we3we3l3lqxv3r.R.flushNeeded();}}
    
    /**
     * Tests DateUtils.round()-method with Calendar.MONTH
     * Includes rounding months with 28, 29, 30 and 31 days
     * Includes rounding to January 1
     * 
     * @throws Exception
     * @since 3.0
     */
    @Test
    public void testRoundMonth() throws Exception {__CLR4_1_2we3we3l3lqxv3r.R.globalSliceStart(getClass().getName(),41999);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2ynx851wen();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2we3we3l3lqxv3r.R.rethrow($CLV_t2$);}finally{__CLR4_1_2we3we3l3lqxv3r.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsRoundingTest.testRoundMonth",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),41999,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2ynx851wen() throws Exception{try{__CLR4_1_2we3we3l3lqxv3r.R.inc(41999);
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42000);final int calendarField = Calendar.MONTH;
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42001);Date roundedUpDate, roundedDownDate, lastRoundedDownDate;
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42002);Date minDate, maxDate;
        
        //month with 28 days
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42003);roundedUpDate = dateTimeParser.parse("March 1, 2007 0:00:00.000");
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42004);roundedDownDate = dateTimeParser.parse("February 1, 2007 0:00:00.000");
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42005);lastRoundedDownDate = dateTimeParser.parse("February 14, 2007 23:59:59.999");
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42006);baseRoundTest(roundedUpDate, roundedDownDate, lastRoundedDownDate,  calendarField);

        //month with 29 days
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42007);roundedUpDate = dateTimeParser.parse("March 1, 2008 0:00:00.000");
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42008);roundedDownDate = dateTimeParser.parse("February 1, 2008 0:00:00.000");
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42009);lastRoundedDownDate = dateTimeParser.parse("February 15, 2008 23:59:59.999");
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42010);baseRoundTest(roundedUpDate, roundedDownDate, lastRoundedDownDate,  calendarField);
        
        //month with 30 days
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42011);roundedUpDate = dateTimeParser.parse("May 1, 2008 0:00:00.000");
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42012);roundedDownDate = dateTimeParser.parse("April 1, 2008 0:00:00.000");
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42013);lastRoundedDownDate = dateTimeParser.parse("April 15, 2008 23:59:59.999");
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42014);baseRoundTest(roundedUpDate, roundedDownDate, lastRoundedDownDate,  calendarField);
        
        //month with 31 days
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42015);roundedUpDate = dateTimeParser.parse("June 1, 2008 0:00:00.000");
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42016);roundedDownDate = dateTimeParser.parse("May 1, 2008 0:00:00.000");
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42017);lastRoundedDownDate = dateTimeParser.parse("May 16, 2008 23:59:59.999");
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42018);baseRoundTest(roundedUpDate, roundedDownDate, lastRoundedDownDate,  calendarField);
        
        //round to January 1
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42019);minDate = dateTimeParser.parse("December 17, 2007 00:00:00.000");
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42020);maxDate = dateTimeParser.parse("January 16, 2008 23:59:59.999");
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42021);roundToJanuaryFirst(minDate, maxDate, calendarField);
    }finally{__CLR4_1_2we3we3l3lqxv3r.R.flushNeeded();}}
    
    /**
     * Tests DateUtils.round()-method with DateUtils.SEMI_MONTH
     * Includes rounding months with 28, 29, 30 and 31 days, each with first and second half 
     * Includes rounding to January 1
     *      
     * @throws Exception
     * @since 3.0
     */
    @Test
    public void testRoundSemiMonth() throws Exception {__CLR4_1_2we3we3l3lqxv3r.R.globalSliceStart(getClass().getName(),42022);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2qn6yrhwfa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2we3we3l3lqxv3r.R.rethrow($CLV_t2$);}finally{__CLR4_1_2we3we3l3lqxv3r.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsRoundingTest.testRoundSemiMonth",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),42022,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2qn6yrhwfa() throws Exception{try{__CLR4_1_2we3we3l3lqxv3r.R.inc(42022);
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42023);final int calendarField = DateUtils.SEMI_MONTH;
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42024);Date roundedUpDate, roundedDownDate, lastRoundedDownDate;
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42025);Date minDate, maxDate;
        
        //month with 28 days (1)
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42026);roundedUpDate = dateTimeParser.parse("February 16, 2007 0:00:00.000");
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42027);roundedDownDate = dateTimeParser.parse("February 1, 2007 0:00:00.000");
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42028);lastRoundedDownDate = dateTimeParser.parse("February 8, 2007 23:59:59.999");
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42029);baseRoundTest(roundedUpDate, roundedDownDate, lastRoundedDownDate,  calendarField);

        //month with 28 days (2)
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42030);roundedUpDate = dateTimeParser.parse("March 1, 2007 0:00:00.000");
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42031);roundedDownDate = dateTimeParser.parse("February 16, 2007 0:00:00.000");
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42032);lastRoundedDownDate = dateTimeParser.parse("February 23, 2007 23:59:59.999");
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42033);baseRoundTest(roundedUpDate, roundedDownDate, lastRoundedDownDate,  calendarField);

        //month with 29 days (1)
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42034);roundedUpDate = dateTimeParser.parse("February 16, 2008 0:00:00.000");
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42035);roundedDownDate = dateTimeParser.parse("February 1, 2008 0:00:00.000");
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42036);lastRoundedDownDate = dateTimeParser.parse("February 8, 2008 23:59:59.999");
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42037);baseRoundTest(roundedUpDate, roundedDownDate, lastRoundedDownDate,  calendarField);
        
        //month with 29 days (2)
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42038);roundedUpDate = dateTimeParser.parse("March 1, 2008 0:00:00.000");
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42039);roundedDownDate = dateTimeParser.parse("February 16, 2008 0:00:00.000");
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42040);lastRoundedDownDate = dateTimeParser.parse("February 23, 2008 23:59:59.999");
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42041);baseRoundTest(roundedUpDate, roundedDownDate, lastRoundedDownDate,  calendarField);

        //month with 30 days (1)
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42042);roundedUpDate = dateTimeParser.parse("April 16, 2008 0:00:00.000");
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42043);roundedDownDate = dateTimeParser.parse("April 1, 2008 0:00:00.000");
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42044);lastRoundedDownDate = dateTimeParser.parse("April 8, 2008 23:59:59.999");
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42045);baseRoundTest(roundedUpDate, roundedDownDate, lastRoundedDownDate,  calendarField);

        //month with 30 days (2)
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42046);roundedUpDate = dateTimeParser.parse("May 1, 2008 0:00:00.000");
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42047);roundedDownDate = dateTimeParser.parse("April 16, 2008 0:00:00.000");
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42048);lastRoundedDownDate = dateTimeParser.parse("April 23, 2008 23:59:59.999");
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42049);baseRoundTest(roundedUpDate, roundedDownDate, lastRoundedDownDate,  calendarField);
        
        //month with 31 days (1)
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42050);roundedUpDate = dateTimeParser.parse("May 16, 2008 0:00:00.000");
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42051);roundedDownDate = dateTimeParser.parse("May 1, 2008 0:00:00.000");
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42052);lastRoundedDownDate = dateTimeParser.parse("May 8, 2008 23:59:59.999");
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42053);baseRoundTest(roundedUpDate, roundedDownDate, lastRoundedDownDate,  calendarField);

        //month with 31 days (2)
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42054);roundedUpDate = dateTimeParser.parse("June 1, 2008 0:00:00.000");
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42055);roundedDownDate = dateTimeParser.parse("May 16, 2008 0:00:00.000");
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42056);lastRoundedDownDate = dateTimeParser.parse("May 23, 2008 23:59:59.999");
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42057);baseRoundTest(roundedUpDate, roundedDownDate, lastRoundedDownDate,  calendarField);
        
        //round to January 1
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42058);minDate = dateTimeParser.parse("December 24, 2007 00:00:00.000");
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42059);maxDate = dateTimeParser.parse("January 8, 2008 23:59:59.999");
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42060);roundToJanuaryFirst(minDate, maxDate, calendarField);
    }finally{__CLR4_1_2we3we3l3lqxv3r.R.flushNeeded();}}
    
    /**
     * Tests DateUtils.round()-method with Calendar.DATE
     * Includes rounding the extremes of one day 
     * Includes rounding to January 1
     * 
     * @throws Exception
     * @since 3.0
     */
    @Test
    public void testRoundDate() throws Exception {__CLR4_1_2we3we3l3lqxv3r.R.globalSliceStart(getClass().getName(),42061);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_227reghwgd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2we3we3l3lqxv3r.R.rethrow($CLV_t2$);}finally{__CLR4_1_2we3we3l3lqxv3r.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsRoundingTest.testRoundDate",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),42061,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_227reghwgd() throws Exception{try{__CLR4_1_2we3we3l3lqxv3r.R.inc(42061);
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42062);final int calendarField = Calendar.DATE;
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42063);Date roundedUpDate, roundedDownDate, lastRoundedDownDate;
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42064);Date minDate, maxDate;

        __CLR4_1_2we3we3l3lqxv3r.R.inc(42065);roundedUpDate = dateTimeParser.parse("June 2, 2008 0:00:00.000");
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42066);roundedDownDate = targetDateDate;
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42067);lastRoundedDownDate = dateTimeParser.parse("June 1, 2008 11:59:59.999");
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42068);baseRoundTest(roundedUpDate, roundedDownDate, lastRoundedDownDate,  calendarField);
        
        //round to January 1
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42069);minDate = dateTimeParser.parse("December 31, 2007 12:00:00.000");
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42070);maxDate = dateTimeParser.parse("January 1, 2008 11:59:59.999");
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42071);roundToJanuaryFirst(minDate, maxDate, calendarField);
    }finally{__CLR4_1_2we3we3l3lqxv3r.R.flushNeeded();}}
    
    /**
     * Tests DateUtils.round()-method with Calendar.DAY_OF_MONTH
     * Includes rounding the extremes of one day 
     * Includes rounding to January 1
     * 
     * @throws Exception
     * @since 3.0
     */
    @Test
    public void testRoundDayOfMonth() throws Exception {__CLR4_1_2we3we3l3lqxv3r.R.globalSliceStart(getClass().getName(),42072);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2vjbg28wgo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2we3we3l3lqxv3r.R.rethrow($CLV_t2$);}finally{__CLR4_1_2we3we3l3lqxv3r.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsRoundingTest.testRoundDayOfMonth",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),42072,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2vjbg28wgo() throws Exception{try{__CLR4_1_2we3we3l3lqxv3r.R.inc(42072);
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42073);final int calendarField = Calendar.DAY_OF_MONTH;
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42074);Date roundedUpDate, roundedDownDate, lastRoundedDownDate;
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42075);Date minDate, maxDate;

        __CLR4_1_2we3we3l3lqxv3r.R.inc(42076);roundedUpDate = dateTimeParser.parse("June 2, 2008 0:00:00.000");
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42077);roundedDownDate = targetDayOfMonthDate;
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42078);lastRoundedDownDate = dateTimeParser.parse("June 1, 2008 11:59:59.999");
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42079);baseRoundTest(roundedUpDate, roundedDownDate, lastRoundedDownDate,  calendarField);
        
        //round to January 1
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42080);minDate = dateTimeParser.parse("December 31, 2007 12:00:00.000");
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42081);maxDate = dateTimeParser.parse("January 1, 2008 11:59:59.999");
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42082);roundToJanuaryFirst(minDate, maxDate, calendarField);
    }finally{__CLR4_1_2we3we3l3lqxv3r.R.flushNeeded();}}
    
    /**
     * Tests DateUtils.round()-method with Calendar.AM_PM
     * Includes rounding the extremes of both AM and PM of one day 
     * Includes rounding to January 1
     * 
     * @throws Exception
     * @since 3.0
     */
    @Test
    public void testRoundAmPm() throws Exception {__CLR4_1_2we3we3l3lqxv3r.R.globalSliceStart(getClass().getName(),42083);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2gcqt3owgz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2we3we3l3lqxv3r.R.rethrow($CLV_t2$);}finally{__CLR4_1_2we3we3l3lqxv3r.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsRoundingTest.testRoundAmPm",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),42083,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2gcqt3owgz() throws Exception{try{__CLR4_1_2we3we3l3lqxv3r.R.inc(42083);
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42084);final int calendarField = Calendar.AM_PM;
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42085);Date roundedUpDate, roundedDownDate, lastRoundedDownDate;
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42086);Date minDate, maxDate;

        //AM
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42087);roundedUpDate = dateTimeParser.parse("June 1, 2008 12:00:00.000");
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42088);roundedDownDate = targetAmDate;
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42089);lastRoundedDownDate = dateTimeParser.parse("June 1, 2008 5:59:59.999");
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42090);baseRoundTest(roundedUpDate, roundedDownDate, lastRoundedDownDate,  calendarField);

        //PM
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42091);roundedUpDate = dateTimeParser.parse("June 2, 2008 0:00:00.000");
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42092);roundedDownDate = targetPmDate;
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42093);lastRoundedDownDate = dateTimeParser.parse("June 1, 2008 17:59:59.999");
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42094);baseRoundTest(roundedUpDate, roundedDownDate, lastRoundedDownDate,  calendarField);

        //round to January 1
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42095);minDate = dateTimeParser.parse("December 31, 2007 18:00:00.000");
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42096);maxDate = dateTimeParser.parse("January 1, 2008 5:59:59.999");
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42097);roundToJanuaryFirst(minDate, maxDate, calendarField);
    }finally{__CLR4_1_2we3we3l3lqxv3r.R.flushNeeded();}}
    
    /**
     * Tests DateUtils.round()-method with Calendar.HOUR_OF_DAY
     * Includes rounding the extremes of one hour 
     * Includes rounding to January 1
     * 
     * @throws Exception
     * @since 3.0
     */
    @Test
    public void testRoundHourOfDay() throws Exception {__CLR4_1_2we3we3l3lqxv3r.R.globalSliceStart(getClass().getName(),42098);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2ccjbu4whe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2we3we3l3lqxv3r.R.rethrow($CLV_t2$);}finally{__CLR4_1_2we3we3l3lqxv3r.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsRoundingTest.testRoundHourOfDay",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),42098,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2ccjbu4whe() throws Exception{try{__CLR4_1_2we3we3l3lqxv3r.R.inc(42098);
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42099);final int calendarField = Calendar.HOUR_OF_DAY;
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42100);Date roundedUpDate, roundedDownDate, lastRoundedDownDate;
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42101);Date minDate, maxDate;

        __CLR4_1_2we3we3l3lqxv3r.R.inc(42102);roundedUpDate = dateTimeParser.parse("June 1, 2008 9:00:00.000");
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42103);roundedDownDate = targetHourOfDayDate;
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42104);lastRoundedDownDate = dateTimeParser.parse("June 1, 2008 8:29:59.999");
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42105);baseRoundTest(roundedUpDate, roundedDownDate, lastRoundedDownDate,  calendarField);
        
        //round to January 1
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42106);minDate = dateTimeParser.parse("December 31, 2007 23:30:00.000");
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42107);maxDate = dateTimeParser.parse("January 1, 2008 0:29:59.999");
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42108);roundToJanuaryFirst(minDate, maxDate, calendarField);
    }finally{__CLR4_1_2we3we3l3lqxv3r.R.flushNeeded();}}
    
    /**
     * Tests DateUtils.round()-method with Calendar.HOUR
     * Includes rounding the extremes of one hour 
     * Includes rounding to January 1
     * 
     * @throws Exception
     * @since 3.0
     */
    @Test
    public void testRoundHour() throws Exception {__CLR4_1_2we3we3l3lqxv3r.R.globalSliceStart(getClass().getName(),42109);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_27bp9y1whp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2we3we3l3lqxv3r.R.rethrow($CLV_t2$);}finally{__CLR4_1_2we3we3l3lqxv3r.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsRoundingTest.testRoundHour",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),42109,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_27bp9y1whp() throws Exception{try{__CLR4_1_2we3we3l3lqxv3r.R.inc(42109);
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42110);final int calendarField = Calendar.HOUR;
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42111);Date roundedUpDate, roundedDownDate, lastRoundedDownDate;
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42112);Date minDate, maxDate;

        __CLR4_1_2we3we3l3lqxv3r.R.inc(42113);roundedUpDate = dateTimeParser.parse("June 1, 2008 9:00:00.000");
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42114);roundedDownDate = targetHourDate;
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42115);lastRoundedDownDate = dateTimeParser.parse("June 1, 2008 8:29:59.999");
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42116);baseRoundTest(roundedUpDate, roundedDownDate, lastRoundedDownDate,  calendarField);
        
        //round to January 1
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42117);minDate = dateTimeParser.parse("December 31, 2007 23:30:00.000");
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42118);maxDate = dateTimeParser.parse("January 1, 2008 0:29:59.999");
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42119);roundToJanuaryFirst(minDate, maxDate, calendarField);
    }finally{__CLR4_1_2we3we3l3lqxv3r.R.flushNeeded();}}
    
    /**
     * Tests DateUtils.round()-method with Calendar.MINUTE
     * Includes rounding the extremes of one minute 
     * Includes rounding to January 1
     * 
     * @throws Exception
     * @since 3.0
     */
    @Test
    public void testRoundMinute() throws Exception {__CLR4_1_2we3we3l3lqxv3r.R.globalSliceStart(getClass().getName(),42120);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_26i5uvrwi0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2we3we3l3lqxv3r.R.rethrow($CLV_t2$);}finally{__CLR4_1_2we3we3l3lqxv3r.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsRoundingTest.testRoundMinute",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),42120,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_26i5uvrwi0() throws Exception{try{__CLR4_1_2we3we3l3lqxv3r.R.inc(42120);
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42121);final int calendarField = Calendar.MINUTE;
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42122);Date roundedUpDate, roundedDownDate, lastRoundedDownDate;
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42123);Date minDate, maxDate;

        __CLR4_1_2we3we3l3lqxv3r.R.inc(42124);roundedUpDate = dateTimeParser.parse("June 1, 2008 8:16:00.000");
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42125);roundedDownDate = targetMinuteDate;
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42126);lastRoundedDownDate = dateTimeParser.parse("June 1, 2008 8:15:29.999");
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42127);baseRoundTest(roundedUpDate, roundedDownDate, lastRoundedDownDate,  calendarField);
        
        //round to January 1
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42128);minDate = dateTimeParser.parse("December 31, 2007 23:59:30.000");
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42129);maxDate = dateTimeParser.parse("January 1, 2008 0:00:29.999");
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42130);roundToJanuaryFirst(minDate, maxDate, calendarField);
    }finally{__CLR4_1_2we3we3l3lqxv3r.R.flushNeeded();}}
    
    /**
     * Tests DateUtils.round()-method with Calendar.SECOND
     * Includes rounding the extremes of one second 
     * Includes rounding to January 1
     * 
     * @throws Exception
     * @since 3.0
     */
    @Test
    public void testRoundSecond() throws Exception {__CLR4_1_2we3we3l3lqxv3r.R.globalSliceStart(getClass().getName(),42131);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2rixxx3wib();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2we3we3l3lqxv3r.R.rethrow($CLV_t2$);}finally{__CLR4_1_2we3we3l3lqxv3r.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsRoundingTest.testRoundSecond",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),42131,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2rixxx3wib() throws Exception{try{__CLR4_1_2we3we3l3lqxv3r.R.inc(42131);
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42132);final int calendarField = Calendar.SECOND;
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42133);Date roundedUpDate, roundedDownDate, lastRoundedDownDate;
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42134);Date minDate, maxDate;

        __CLR4_1_2we3we3l3lqxv3r.R.inc(42135);roundedUpDate = dateTimeParser.parse("June 1, 2008 8:15:15.000");
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42136);roundedDownDate = targetSecondDate;
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42137);lastRoundedDownDate = dateTimeParser.parse("June 1, 2008 8:15:14.499");
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42138);baseRoundTest(roundedUpDate, roundedDownDate, lastRoundedDownDate,  calendarField);
        
        //round to January 1
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42139);minDate = dateTimeParser.parse("December 31, 2007 23:59:59.500");
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42140);maxDate = dateTimeParser.parse("January 1, 2008 0:00:00.499");
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42141);roundToJanuaryFirst(minDate, maxDate, calendarField);
    }finally{__CLR4_1_2we3we3l3lqxv3r.R.flushNeeded();}}
    
    /**
     * Tests DateUtils.round()-method with Calendar.MILLISECOND
     * Includes rounding the extremes of one second 
     * Includes rounding to January 1
     * 
     * @throws Exception
     * @since 3.0
     */
    @Test
    public void testRoundMilliSecond() throws Exception {__CLR4_1_2we3we3l3lqxv3r.R.globalSliceStart(getClass().getName(),42142);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_26ddb3owim();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2we3we3l3lqxv3r.R.rethrow($CLV_t2$);}finally{__CLR4_1_2we3we3l3lqxv3r.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsRoundingTest.testRoundMilliSecond",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),42142,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_26ddb3owim() throws Exception{try{__CLR4_1_2we3we3l3lqxv3r.R.inc(42142);
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42143);final int calendarField = Calendar.MILLISECOND;
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42144);Date roundedUpDate, roundedDownDate, lastRoundedDownDate;
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42145);Date minDate, maxDate;

        __CLR4_1_2we3we3l3lqxv3r.R.inc(42146);roundedDownDate = lastRoundedDownDate = targetMilliSecondDate;
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42147);roundedUpDate = dateTimeParser.parse("June 1, 2008 8:15:14.232");
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42148);baseRoundTest(roundedUpDate, roundedDownDate, lastRoundedDownDate,  calendarField);
        
        //round to January 1
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42149);minDate = maxDate = januaryOneDate;
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42150);roundToJanuaryFirst(minDate, maxDate, calendarField);
    }finally{__CLR4_1_2we3we3l3lqxv3r.R.flushNeeded();}}
    
    /**
     * Test DateUtils.truncate()-method with Calendar.YEAR
     * 
     * @throws Exception
     * @since 3.0
     */
    @Test
    public void testTruncateYear() throws Exception {__CLR4_1_2we3we3l3lqxv3r.R.globalSliceStart(getClass().getName(),42151);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2dpusykwiv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2we3we3l3lqxv3r.R.rethrow($CLV_t2$);}finally{__CLR4_1_2we3we3l3lqxv3r.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsRoundingTest.testTruncateYear",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),42151,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2dpusykwiv() throws Exception{try{__CLR4_1_2we3we3l3lqxv3r.R.inc(42151);
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42152);final int calendarField = Calendar.YEAR;
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42153);final Date lastTruncateDate = dateTimeParser.parse("December 31, 2007 23:59:59.999");
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42154);baseTruncateTest(targetYearDate, lastTruncateDate, calendarField);
    }finally{__CLR4_1_2we3we3l3lqxv3r.R.flushNeeded();}}

    /**
     * Test DateUtils.truncate()-method with Calendar.MONTH
     * 
     * @throws Exception
     * @since 3.0
     */
    @Test
    public void testTruncateMonth() throws Exception {__CLR4_1_2we3we3l3lqxv3r.R.globalSliceStart(getClass().getName(),42155);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2fukd4hwiz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2we3we3l3lqxv3r.R.rethrow($CLV_t2$);}finally{__CLR4_1_2we3we3l3lqxv3r.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsRoundingTest.testTruncateMonth",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),42155,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2fukd4hwiz() throws Exception{try{__CLR4_1_2we3we3l3lqxv3r.R.inc(42155);
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42156);final int calendarField = Calendar.MONTH;
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42157);final Date truncatedDate = dateTimeParser.parse("March 1, 2008 0:00:00.000");
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42158);final Date lastTruncateDate = dateTimeParser.parse("March 31, 2008 23:59:59.999");
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42159);baseTruncateTest(truncatedDate, lastTruncateDate, calendarField);
    }finally{__CLR4_1_2we3we3l3lqxv3r.R.flushNeeded();}}

    /**
     * Test DateUtils.truncate()-method with DateUtils.SEMI_MONTH
     * Includes truncating months with 28, 29, 30 and 31 days, each with first and second half
     * 
     * @throws Exception
     * @since 3.0
     */
    @Test
    public void testTruncateSemiMonth() throws Exception {__CLR4_1_2we3we3l3lqxv3r.R.globalSliceStart(getClass().getName(),42160);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2dem3y9wj4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2we3we3l3lqxv3r.R.rethrow($CLV_t2$);}finally{__CLR4_1_2we3we3l3lqxv3r.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsRoundingTest.testTruncateSemiMonth",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),42160,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2dem3y9wj4() throws Exception{try{__CLR4_1_2we3we3l3lqxv3r.R.inc(42160);
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42161);final int calendarField = DateUtils.SEMI_MONTH;
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42162);Date truncatedDate, lastTruncateDate;
        
        //month with 28 days (1)
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42163);truncatedDate = dateTimeParser.parse("February 1, 2007 0:00:00.000");
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42164);lastTruncateDate = dateTimeParser.parse("February 15, 2007 23:59:59.999");
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42165);baseTruncateTest(truncatedDate, lastTruncateDate, calendarField);

        //month with 28 days (2)
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42166);truncatedDate = dateTimeParser.parse("February 16, 2007 0:00:00.000");
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42167);lastTruncateDate = dateTimeParser.parse("February 28, 2007 23:59:59.999");
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42168);baseTruncateTest(truncatedDate, lastTruncateDate, calendarField);

        //month with 29 days (1)
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42169);truncatedDate = dateTimeParser.parse("February 1, 2008 0:00:00.000");
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42170);lastTruncateDate = dateTimeParser.parse("February 15, 2008 23:59:59.999");
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42171);baseTruncateTest(truncatedDate, lastTruncateDate, calendarField);

        //month with 29 days (2)
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42172);truncatedDate = dateTimeParser.parse("February 16, 2008 0:00:00.000");
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42173);lastTruncateDate = dateTimeParser.parse("February 29, 2008 23:59:59.999");
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42174);baseTruncateTest(truncatedDate, lastTruncateDate, calendarField);

        //month with 30 days (1)
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42175);truncatedDate = dateTimeParser.parse("April 1, 2008 0:00:00.000");
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42176);lastTruncateDate = dateTimeParser.parse("April 15, 2008 23:59:59.999");
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42177);baseTruncateTest(truncatedDate, lastTruncateDate, calendarField);

        //month with 30 days (2)
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42178);truncatedDate = dateTimeParser.parse("April 16, 2008 0:00:00.000");
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42179);lastTruncateDate = dateTimeParser.parse("April 30, 2008 23:59:59.999");
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42180);baseTruncateTest(truncatedDate, lastTruncateDate, calendarField);
        
        //month with 31 days (1)
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42181);truncatedDate = dateTimeParser.parse("March 1, 2008 0:00:00.000");
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42182);lastTruncateDate = dateTimeParser.parse("March 15, 2008 23:59:59.999");
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42183);baseTruncateTest(truncatedDate, lastTruncateDate, calendarField);

        //month with 31 days (2)
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42184);truncatedDate = dateTimeParser.parse("March 16, 2008 0:00:00.000");
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42185);lastTruncateDate = dateTimeParser.parse("March 31, 2008 23:59:59.999");
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42186);baseTruncateTest(truncatedDate, lastTruncateDate, calendarField);

    }finally{__CLR4_1_2we3we3l3lqxv3r.R.flushNeeded();}}

    /**
     * Test DateUtils.truncate()-method with Calendar.DATE
     * 
     * @throws Exception
     * @since 3.0
     */
    @Test
    public void testTruncateDate() throws Exception {__CLR4_1_2we3we3l3lqxv3r.R.globalSliceStart(getClass().getName(),42187);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2gkjb71wjv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2we3we3l3lqxv3r.R.rethrow($CLV_t2$);}finally{__CLR4_1_2we3we3l3lqxv3r.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsRoundingTest.testTruncateDate",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),42187,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2gkjb71wjv() throws Exception{try{__CLR4_1_2we3we3l3lqxv3r.R.inc(42187);
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42188);final int calendarField = Calendar.DATE;
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42189);final Date lastTruncateDate = dateTimeParser.parse("June 1, 2008 23:59:59.999");
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42190);baseTruncateTest(targetDateDate, lastTruncateDate, calendarField);
    }finally{__CLR4_1_2we3we3l3lqxv3r.R.flushNeeded();}}
    
    /**
     * Test DateUtils.truncate()-method with Calendar.DAY_OF_MONTH
     * 
     * @throws Exception
     * @since 3.0
     */
    @Test
    public void testTruncateDayOfMonth() throws Exception {__CLR4_1_2we3we3l3lqxv3r.R.globalSliceStart(getClass().getName(),42191);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2np2t84wjz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2we3we3l3lqxv3r.R.rethrow($CLV_t2$);}finally{__CLR4_1_2we3we3l3lqxv3r.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsRoundingTest.testTruncateDayOfMonth",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),42191,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2np2t84wjz() throws Exception{try{__CLR4_1_2we3we3l3lqxv3r.R.inc(42191);
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42192);final int calendarField = Calendar.DAY_OF_MONTH;
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42193);final Date lastTruncateDate = dateTimeParser.parse("June 1, 2008 23:59:59.999");
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42194);baseTruncateTest(targetDayOfMonthDate, lastTruncateDate, calendarField);
    }finally{__CLR4_1_2we3we3l3lqxv3r.R.flushNeeded();}}
    
    /**
     * Test DateUtils.truncate()-method with Calendar.AM_PM
     * Includes truncating the extremes of both AM and PM of one day 
     * 
     * @throws Exception
     * @since 3.0
     */
    @Test
    public void testTruncateAmPm() throws Exception {__CLR4_1_2we3we3l3lqxv3r.R.globalSliceStart(getClass().getName(),42195);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_21zywd4wk3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2we3we3l3lqxv3r.R.rethrow($CLV_t2$);}finally{__CLR4_1_2we3we3l3lqxv3r.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsRoundingTest.testTruncateAmPm",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),42195,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_21zywd4wk3() throws Exception{try{__CLR4_1_2we3we3l3lqxv3r.R.inc(42195);
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42196);final int calendarField = Calendar.AM_PM;
        
        //AM
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42197);Date lastTruncateDate = dateTimeParser.parse("June 1, 2008 11:59:59.999");
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42198);baseTruncateTest(targetAmDate, lastTruncateDate, calendarField);

        //PM
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42199);lastTruncateDate = dateTimeParser.parse("June 1, 2008 23:59:59.999");
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42200);baseTruncateTest(targetPmDate, lastTruncateDate, calendarField);
    }finally{__CLR4_1_2we3we3l3lqxv3r.R.flushNeeded();}}
    
    /**
     * Test DateUtils.truncate()-method with Calendar.HOUR
     * 
     * @throws Exception
     * @since 3.0
     */
    @Test
    public void testTruncateHour() throws Exception {__CLR4_1_2we3we3l3lqxv3r.R.globalSliceStart(getClass().getName(),42201);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2712msjwk9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2we3we3l3lqxv3r.R.rethrow($CLV_t2$);}finally{__CLR4_1_2we3we3l3lqxv3r.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsRoundingTest.testTruncateHour",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),42201,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2712msjwk9() throws Exception{try{__CLR4_1_2we3we3l3lqxv3r.R.inc(42201);
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42202);final int calendarField = Calendar.HOUR;
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42203);final Date lastTruncateDate = dateTimeParser.parse("June 1, 2008 8:59:59.999");
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42204);baseTruncateTest(targetHourDate, lastTruncateDate, calendarField);
    }finally{__CLR4_1_2we3we3l3lqxv3r.R.flushNeeded();}}
    
    /**
     * Test DateUtils.truncate()-method with Calendar.HOUR_OF_DAY
     * 
     * @throws Exception
     * @since 3.0
     */
    @Test
    public void testTruncateHourOfDay() throws Exception {__CLR4_1_2we3we3l3lqxv3r.R.globalSliceStart(getClass().getName(),42205);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2w1iz4wkd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2we3we3l3lqxv3r.R.rethrow($CLV_t2$);}finally{__CLR4_1_2we3we3l3lqxv3r.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsRoundingTest.testTruncateHourOfDay",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),42205,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2w1iz4wkd() throws Exception{try{__CLR4_1_2we3we3l3lqxv3r.R.inc(42205);
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42206);final int calendarField = Calendar.HOUR_OF_DAY;
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42207);final Date lastTruncateDate = dateTimeParser.parse("June 1, 2008 8:59:59.999");
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42208);baseTruncateTest(targetHourOfDayDate, lastTruncateDate, calendarField);
    }finally{__CLR4_1_2we3we3l3lqxv3r.R.flushNeeded();}}
    
    /**
     * Test DateUtils.truncate()-method with Calendar.MINUTE
     * 
     * @throws Exception
     * @since 3.0
     */
    @Test
    public void testTruncateMinute() throws Exception {__CLR4_1_2we3we3l3lqxv3r.R.globalSliceStart(getClass().getName(),42209);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2ljc4k3wkh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2we3we3l3lqxv3r.R.rethrow($CLV_t2$);}finally{__CLR4_1_2we3we3l3lqxv3r.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsRoundingTest.testTruncateMinute",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),42209,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2ljc4k3wkh() throws Exception{try{__CLR4_1_2we3we3l3lqxv3r.R.inc(42209);
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42210);final int calendarField = Calendar.MINUTE;
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42211);final Date lastTruncateDate = dateTimeParser.parse("June 1, 2008 8:15:59.999");
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42212);baseTruncateTest(targetMinuteDate, lastTruncateDate, calendarField);
    }finally{__CLR4_1_2we3we3l3lqxv3r.R.flushNeeded();}}
    
    /**
     * Test DateUtils.truncate()-method with Calendar.SECOND
     * 
     * @throws Exception
     * @since 3.0
     */
    @Test
    public void testTruncateSecond() throws Exception {__CLR4_1_2we3we3l3lqxv3r.R.globalSliceStart(getClass().getName(),42213);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2sgzudpwkl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2we3we3l3lqxv3r.R.rethrow($CLV_t2$);}finally{__CLR4_1_2we3we3l3lqxv3r.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsRoundingTest.testTruncateSecond",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),42213,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2sgzudpwkl() throws Exception{try{__CLR4_1_2we3we3l3lqxv3r.R.inc(42213);
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42214);final int calendarField = Calendar.SECOND;
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42215);final Date lastTruncateDate = dateTimeParser.parse("June 1, 2008 8:15:14.999");
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42216);baseTruncateTest(targetSecondDate, lastTruncateDate, calendarField);
    }finally{__CLR4_1_2we3we3l3lqxv3r.R.flushNeeded();}}
    
    /**
     * Test DateUtils.truncate()-method with Calendar.SECOND
     * 
     * @throws Exception
     * @since 3.0
     */
    @Test
    public void testTruncateMilliSecond() throws Exception {__CLR4_1_2we3we3l3lqxv3r.R.globalSliceStart(getClass().getName(),42217);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2duxzlcwkp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2we3we3l3lqxv3r.R.rethrow($CLV_t2$);}finally{__CLR4_1_2we3we3l3lqxv3r.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsRoundingTest.testTruncateMilliSecond",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),42217,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2duxzlcwkp() throws Exception{try{__CLR4_1_2we3we3l3lqxv3r.R.inc(42217);
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42218);final int calendarField = Calendar.MILLISECOND;
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42219);baseTruncateTest(targetMilliSecondDate, targetMilliSecondDate, calendarField);
    }finally{__CLR4_1_2we3we3l3lqxv3r.R.flushNeeded();}}
        
    /**
     * When using this basetest all extremes are tested.<br> 
     * It will test the Date, Calendar and Object-implementation<br>
     * lastRoundDownDate should round down to roundedDownDate<br>
     * lastRoundDownDate + 1 millisecond should round up to roundedUpDate
     * 
     * @param roundedUpDate the next rounded date after <strong>roundedDownDate</strong> when using <strong>calendarField</strong>
     * @param roundedDownDate the result if <strong>lastRoundDownDate</strong> was rounded with <strong>calendarField</strong>
     * @param lastRoundDownDate rounding this value with <strong>calendarField</strong> will result in <strong>roundedDownDate</strong>
     * @param calendarField
     * @since 3.0
     */
    protected void baseRoundTest(final Date roundedUpDate, final Date roundedDownDate, final Date lastRoundDownDate, final int calendarField) {try{__CLR4_1_2we3we3l3lqxv3r.R.inc(42220);
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42221);final Date firstRoundUpDate = DateUtils.addMilliseconds(lastRoundDownDate, 1);
        
        //Date-comparison
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42222);assertEquals(roundedDownDate, DateUtils.round(roundedDownDate, calendarField));
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42223);assertEquals(roundedUpDate, DateUtils.round(roundedUpDate, calendarField));
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42224);assertEquals(roundedDownDate, DateUtils.round(lastRoundDownDate, calendarField));
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42225);assertEquals(roundedUpDate, DateUtils.round(firstRoundUpDate, calendarField));
        
        //Calendar-initiations
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42226);Calendar roundedUpCalendar, roundedDownCalendar, lastRoundDownCalendar, firstRoundUpCalendar; 
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42227);roundedDownCalendar = Calendar.getInstance();
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42228);roundedUpCalendar = Calendar.getInstance();
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42229);lastRoundDownCalendar = Calendar.getInstance();
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42230);firstRoundUpCalendar = Calendar.getInstance();
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42231);roundedDownCalendar.setTime(roundedDownDate);
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42232);roundedUpCalendar.setTime(roundedUpDate);
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42233);lastRoundDownCalendar.setTime(lastRoundDownDate);
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42234);firstRoundUpCalendar.setTime(firstRoundUpDate);

        //Calendar-comparison
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42235);assertEquals(roundedDownCalendar, DateUtils.round(roundedDownCalendar, calendarField));
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42236);assertEquals(roundedUpCalendar, DateUtils.round(roundedUpCalendar, calendarField));
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42237);assertEquals(roundedDownCalendar, DateUtils.round(lastRoundDownCalendar, calendarField));
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42238);assertEquals(roundedUpCalendar, DateUtils.round(firstRoundUpCalendar, calendarField));

        //Object-comparison
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42239);assertEquals(roundedDownDate, DateUtils.round((Object) roundedDownDate, calendarField));
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42240);assertEquals(roundedUpDate, DateUtils.round((Object) roundedUpDate, calendarField));
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42241);assertEquals(roundedDownDate, DateUtils.round((Object) lastRoundDownDate, calendarField));
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42242);assertEquals(roundedUpDate, DateUtils.round((Object) firstRoundUpDate, calendarField));
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42243);assertEquals(roundedDownDate, DateUtils.round((Object) roundedDownCalendar, calendarField));
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42244);assertEquals(roundedUpDate, DateUtils.round((Object) roundedUpCalendar, calendarField));
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42245);assertEquals(roundedDownDate, DateUtils.round((Object) lastRoundDownDate, calendarField));
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42246);assertEquals(roundedUpDate, DateUtils.round((Object) firstRoundUpDate, calendarField));
    }finally{__CLR4_1_2we3we3l3lqxv3r.R.flushNeeded();}}
    
    /**
     * When using this basetest all extremes are tested.<br> 
     * It will test the Date, Calendar and Object-implementation<br>
     * lastTruncateDate should round down to truncatedDate<br>
     * lastTruncateDate + 1 millisecond should never round down to truncatedDate
     * 
     * @param truncatedDate expected Date when <strong>lastTruncateDate</strong> is truncated with <strong>calendarField</strong>
     * @param lastTruncateDate the last possible Date which will truncate to <strong>truncatedDate</strong> with <strong>calendarField</strong>
     * @param calendarField a Calendar.field value
     * @since 3.0
     */
    protected void baseTruncateTest(final Date truncatedDate, final Date lastTruncateDate, final int calendarField) {try{__CLR4_1_2we3we3l3lqxv3r.R.inc(42247);
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42248);final Date nextTruncateDate = DateUtils.addMilliseconds(lastTruncateDate, 1);
        
        //Date-comparison
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42249);assertEquals("Truncating "+ fdf.format(truncatedDate) +" as Date with CalendarField-value "+ calendarField +" must return itself", truncatedDate, DateUtils.truncate(truncatedDate, calendarField));
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42250);assertEquals(truncatedDate, DateUtils.truncate(lastTruncateDate, calendarField));
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42251);assertFalse(fdf.format(lastTruncateDate) +" is not an extreme when truncating as Date with CalendarField-value "+ calendarField, truncatedDate.equals(DateUtils.truncate(nextTruncateDate, calendarField)));
        
        //Calendar-initiations
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42252);Calendar truncatedCalendar, lastTruncateCalendar, nextTruncateCalendar; 
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42253);truncatedCalendar = Calendar.getInstance();
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42254);lastTruncateCalendar = Calendar.getInstance();
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42255);nextTruncateCalendar = Calendar.getInstance();
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42256);truncatedCalendar.setTime(truncatedDate);
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42257);lastTruncateCalendar.setTime(lastTruncateDate);
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42258);nextTruncateCalendar.setTime(nextTruncateDate);

        //Calendar-comparison
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42259);assertEquals("Truncating "+ fdf.format(truncatedCalendar) +" as Calendar with CalendarField-value "+ calendarField +" must return itself", truncatedCalendar, DateUtils.truncate(truncatedCalendar, calendarField));
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42260);assertEquals(truncatedCalendar, DateUtils.truncate(lastTruncateCalendar, calendarField));
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42261);assertFalse(fdf.format(lastTruncateCalendar) +" is not an extreme when truncating as Calendar with CalendarField-value "+ calendarField, truncatedCalendar.equals(DateUtils.truncate(nextTruncateCalendar, calendarField)));

        //Object-comparison
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42262);assertEquals("Truncating "+ fdf.format(truncatedDate) +" as Date cast to Object with CalendarField-value "+ calendarField +" must return itself as Date", truncatedDate, DateUtils.truncate((Object) truncatedDate, calendarField));
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42263);assertEquals(truncatedDate, DateUtils.truncate((Object) lastTruncateDate, calendarField));
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42264);assertFalse(fdf.format(lastTruncateDate) +" is not an extreme when truncating as Date cast to Object with CalendarField-value "+ calendarField, truncatedDate.equals(DateUtils.truncate((Object) nextTruncateDate, calendarField)));
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42265);assertEquals("Truncating "+ fdf.format(truncatedCalendar) +" as Calendar cast to Object with CalendarField-value "+ calendarField +" must return itself as Date", truncatedDate, DateUtils.truncate((Object) truncatedCalendar, calendarField));
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42266);assertEquals(truncatedDate, DateUtils.truncate((Object) lastTruncateCalendar, calendarField));
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42267);assertFalse(fdf.format(lastTruncateCalendar) +" is not an extreme when truncating as Calendar cast to Object with CalendarField-value "+ calendarField, truncatedDate.equals(DateUtils.truncate((Object) nextTruncateCalendar, calendarField)));
    }finally{__CLR4_1_2we3we3l3lqxv3r.R.flushNeeded();}}
    
    /**
     * 
     * Any January 1 could be considered as the ultimate extreme.
     * Instead of comparing the results if the input has a difference of 1 millisecond we check the output to be exactly January first. 
     * 
     * @param minDate
     * @param maxDate
     * @param calendarField
     * @since 3.0
     */
    protected void roundToJanuaryFirst(final Date minDate, final Date maxDate, final int calendarField) {try{__CLR4_1_2we3we3l3lqxv3r.R.inc(42268);
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42269);assertEquals("Rounding "+ fdf.format(januaryOneDate) +" as Date with CalendarField-value "+ calendarField +" must return itself", januaryOneDate, DateUtils.round(januaryOneDate, calendarField));
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42270);assertEquals(januaryOneDate, DateUtils.round(minDate, calendarField));
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42271);assertEquals(januaryOneDate, DateUtils.round(maxDate, calendarField));
        
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42272);final Calendar minCalendar = Calendar.getInstance();
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42273);minCalendar.setTime(minDate);
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42274);final Calendar maxCalendar = Calendar.getInstance();
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42275);maxCalendar.setTime(maxDate);
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42276);assertEquals("Rounding "+ fdf.format(januaryOneCalendar) +" as Date with CalendarField-value "+ calendarField +" must return itself", januaryOneCalendar, DateUtils.round(januaryOneCalendar, calendarField));
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42277);assertEquals(januaryOneCalendar, DateUtils.round(minCalendar, calendarField));
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42278);assertEquals(januaryOneCalendar, DateUtils.round(maxCalendar, calendarField));

        __CLR4_1_2we3we3l3lqxv3r.R.inc(42279);final Date toPrevRoundDate = DateUtils.addMilliseconds(minDate, -1);
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42280);final Date toNextRoundDate = DateUtils.addMilliseconds(maxDate, 1);
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42281);assertFalse(fdf.format(minDate) +" is not an lower-extreme when rounding as Date with CalendarField-value "+ calendarField, januaryOneDate.equals(DateUtils.round(toPrevRoundDate, calendarField)));
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42282);assertFalse(fdf.format(maxDate) +" is not an upper-extreme when rounding as Date with CalendarField-value "+ calendarField, januaryOneDate.equals(DateUtils.round(toNextRoundDate, calendarField)));
        
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42283);final Calendar toPrevRoundCalendar = Calendar.getInstance();
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42284);toPrevRoundCalendar.setTime(toPrevRoundDate);
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42285);final Calendar toNextRoundCalendar = Calendar.getInstance();
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42286);toNextRoundCalendar.setTime(toNextRoundDate);
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42287);assertFalse(fdf.format(minCalendar) +" is not an lower-extreme when rounding as Date with CalendarField-value "+ calendarField, januaryOneDate.equals(DateUtils.round(toPrevRoundDate, calendarField)));
        __CLR4_1_2we3we3l3lqxv3r.R.inc(42288);assertFalse(fdf.format(maxCalendar) +" is not an upper-extreme when rounding as Date with CalendarField-value "+ calendarField, januaryOneDate.equals(DateUtils.round(toNextRoundDate, calendarField)));
    }finally{__CLR4_1_2we3we3l3lqxv3r.R.flushNeeded();}}
}
