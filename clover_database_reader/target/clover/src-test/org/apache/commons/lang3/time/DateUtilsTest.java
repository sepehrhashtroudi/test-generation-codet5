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

import static org.apache.commons.lang3.JavaVersion.JAVA_1_4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.TimeZone;

import junit.framework.AssertionFailedError;

import org.apache.commons.lang3.SystemUtils;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit tests {@link org.apache.commons.lang3.time.DateUtils}.
 *
 */
public class DateUtilsTest {static class __CLR4_1_2wmpwmpl3lqxv5t{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492830024L,8589935092L,43134,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final long MILLIS_TEST;
    static {try{__CLR4_1_2wmpwmpl3lqxv5t.R.inc(42289);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42290);final GregorianCalendar cal = new GregorianCalendar(2000, 6, 5, 4, 3, 2);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42291);cal.set(Calendar.MILLISECOND, 1);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42292);MILLIS_TEST = cal.getTime().getTime();
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42293);System.out.println("DateUtilsTest: Default Locale="+Locale.getDefault());
    }finally{__CLR4_1_2wmpwmpl3lqxv5t.R.flushNeeded();}}

    DateFormat dateParser = null;
    DateFormat dateTimeParser = null;
    DateFormat timeZoneDateParser = null;
    Date dateAmPm1 = null;
    Date dateAmPm2 = null;
    Date dateAmPm3 = null;
    Date dateAmPm4 = null;
    Date date0 = null;
    Date date1 = null;
    Date date2 = null;
    Date date3 = null;
    Date date4 = null;
    Date date5 = null;
    Date date6 = null;
    Date date7 = null;
    Date date8 = null;
    Calendar calAmPm1 = null;
    Calendar calAmPm2 = null;
    Calendar calAmPm3 = null;
    Calendar calAmPm4 = null;
    Calendar cal1 = null;
    Calendar cal2 = null;
    Calendar cal3 = null;
    Calendar cal4 = null;
    Calendar cal5 = null;
    Calendar cal6 = null;
    Calendar cal7 = null;
    Calendar cal8 = null;
    TimeZone zone = null;
    TimeZone defaultZone = null;


    @Before
    public void setUp() throws Exception {try{__CLR4_1_2wmpwmpl3lqxv5t.R.inc(42294);


        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42295);dateParser = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42296);dateTimeParser = new SimpleDateFormat("MMM dd, yyyy H:mm:ss.SSS", Locale.ENGLISH);

        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42297);dateAmPm1 = dateTimeParser.parse("February 3, 2002 01:10:00.000");
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42298);dateAmPm2 = dateTimeParser.parse("February 3, 2002 11:10:00.000");
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42299);dateAmPm3 = dateTimeParser.parse("February 3, 2002 13:10:00.000");
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42300);dateAmPm4 = dateTimeParser.parse("February 3, 2002 19:10:00.000");
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42301);date0 = dateTimeParser.parse("February 3, 2002 12:34:56.789");
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42302);date1 = dateTimeParser.parse("February 12, 2002 12:34:56.789");
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42303);date2 = dateTimeParser.parse("November 18, 2001 1:23:11.321");
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42304);defaultZone = TimeZone.getDefault();
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42305);zone = TimeZone.getTimeZone("MET");
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42306);TimeZone.setDefault(zone);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42307);dateTimeParser.setTimeZone(zone);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42308);date3 = dateTimeParser.parse("March 30, 2003 05:30:45.000");
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42309);date4 = dateTimeParser.parse("March 30, 2003 01:10:00.000");
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42310);date5 = dateTimeParser.parse("March 30, 2003 01:40:00.000");
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42311);date6 = dateTimeParser.parse("March 30, 2003 02:10:00.000");
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42312);date7 = dateTimeParser.parse("March 30, 2003 02:40:00.000");
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42313);date8 = dateTimeParser.parse("October 26, 2003 05:30:45.000");
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42314);dateTimeParser.setTimeZone(defaultZone);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42315);TimeZone.setDefault(defaultZone);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42316);calAmPm1 = Calendar.getInstance();
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42317);calAmPm1.setTime(dateAmPm1);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42318);calAmPm2 = Calendar.getInstance();
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42319);calAmPm2.setTime(dateAmPm2);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42320);calAmPm3 = Calendar.getInstance();
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42321);calAmPm3.setTime(dateAmPm3);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42322);calAmPm4 = Calendar.getInstance();
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42323);calAmPm4.setTime(dateAmPm4);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42324);cal1 = Calendar.getInstance();
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42325);cal1.setTime(date1);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42326);cal2 = Calendar.getInstance();
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42327);cal2.setTime(date2);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42328);TimeZone.setDefault(zone);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42329);cal3 = Calendar.getInstance();
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42330);cal3.setTime(date3);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42331);cal4 = Calendar.getInstance();
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42332);cal4.setTime(date4);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42333);cal5 = Calendar.getInstance();
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42334);cal5.setTime(date5);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42335);cal6 = Calendar.getInstance();
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42336);cal6.setTime(date6);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42337);cal7 = Calendar.getInstance();
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42338);cal7.setTime(date7);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42339);cal8 = Calendar.getInstance();
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42340);cal8.setTime(date8);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42341);TimeZone.setDefault(defaultZone);
    }finally{__CLR4_1_2wmpwmpl3lqxv5t.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testConstructor() {__CLR4_1_2wmpwmpl3lqxv5t.R.globalSliceStart(getClass().getName(),42342);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2uefs8hwo6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2wmpwmpl3lqxv5t.R.rethrow($CLV_t2$);}finally{__CLR4_1_2wmpwmpl3lqxv5t.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsTest.testConstructor",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),42342,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2uefs8hwo6(){try{__CLR4_1_2wmpwmpl3lqxv5t.R.inc(42342);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42343);assertNotNull(new DateUtils());
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42344);final Constructor<?>[] cons = DateUtils.class.getDeclaredConstructors();
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42345);assertEquals(1, cons.length);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42346);assertTrue(Modifier.isPublic(cons[0].getModifiers()));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42347);assertTrue(Modifier.isPublic(DateUtils.class.getModifiers()));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42348);assertFalse(Modifier.isFinal(DateUtils.class.getModifiers()));
    }finally{__CLR4_1_2wmpwmpl3lqxv5t.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    @Test
    public void testIsSameDay_Date() {__CLR4_1_2wmpwmpl3lqxv5t.R.globalSliceStart(getClass().getName(),42349);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_23yogvuwod();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2wmpwmpl3lqxv5t.R.rethrow($CLV_t2$);}finally{__CLR4_1_2wmpwmpl3lqxv5t.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsTest.testIsSameDay_Date",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),42349,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_23yogvuwod(){try{__CLR4_1_2wmpwmpl3lqxv5t.R.inc(42349);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42350);Date date1 = new GregorianCalendar(2004, 6, 9, 13, 45).getTime();
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42351);Date date2 = new GregorianCalendar(2004, 6, 9, 13, 45).getTime();
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42352);assertTrue(DateUtils.isSameDay(date1, date2));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42353);date2 = new GregorianCalendar(2004, 6, 10, 13, 45).getTime();
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42354);assertFalse(DateUtils.isSameDay(date1, date2));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42355);date1 = new GregorianCalendar(2004, 6, 10, 13, 45).getTime();
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42356);assertTrue(DateUtils.isSameDay(date1, date2));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42357);date2 = new GregorianCalendar(2005, 6, 10, 13, 45).getTime();
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42358);assertFalse(DateUtils.isSameDay(date1, date2));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42359);try {
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42360);DateUtils.isSameDay((Date) null, (Date) null);
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42361);fail();
        } catch (final IllegalArgumentException ex) {}
    }finally{__CLR4_1_2wmpwmpl3lqxv5t.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    @Test
    public void testIsSameDay_Cal() {__CLR4_1_2wmpwmpl3lqxv5t.R.globalSliceStart(getClass().getName(),42362);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_26736ggwoq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2wmpwmpl3lqxv5t.R.rethrow($CLV_t2$);}finally{__CLR4_1_2wmpwmpl3lqxv5t.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsTest.testIsSameDay_Cal",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),42362,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_26736ggwoq(){try{__CLR4_1_2wmpwmpl3lqxv5t.R.inc(42362);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42363);final GregorianCalendar cal1 = new GregorianCalendar(2004, 6, 9, 13, 45);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42364);final GregorianCalendar cal2 = new GregorianCalendar(2004, 6, 9, 13, 45);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42365);assertTrue(DateUtils.isSameDay(cal1, cal2));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42366);cal2.add(Calendar.DAY_OF_YEAR, 1);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42367);assertFalse(DateUtils.isSameDay(cal1, cal2));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42368);cal1.add(Calendar.DAY_OF_YEAR, 1);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42369);assertTrue(DateUtils.isSameDay(cal1, cal2));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42370);cal2.add(Calendar.YEAR, 1);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42371);assertFalse(DateUtils.isSameDay(cal1, cal2));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42372);try {
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42373);DateUtils.isSameDay((Calendar) null, (Calendar) null);
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42374);fail();
        } catch (final IllegalArgumentException ex) {}
    }finally{__CLR4_1_2wmpwmpl3lqxv5t.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    @Test
    public void testIsSameInstant_Date() {__CLR4_1_2wmpwmpl3lqxv5t.R.globalSliceStart(getClass().getName(),42375);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_29e4g7fwp3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2wmpwmpl3lqxv5t.R.rethrow($CLV_t2$);}finally{__CLR4_1_2wmpwmpl3lqxv5t.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsTest.testIsSameInstant_Date",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),42375,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_29e4g7fwp3(){try{__CLR4_1_2wmpwmpl3lqxv5t.R.inc(42375);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42376);Date date1 = new GregorianCalendar(2004, 6, 9, 13, 45).getTime();
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42377);Date date2 = new GregorianCalendar(2004, 6, 9, 13, 45).getTime();
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42378);assertTrue(DateUtils.isSameInstant(date1, date2));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42379);date2 = new GregorianCalendar(2004, 6, 10, 13, 45).getTime();
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42380);assertFalse(DateUtils.isSameInstant(date1, date2));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42381);date1 = new GregorianCalendar(2004, 6, 10, 13, 45).getTime();
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42382);assertTrue(DateUtils.isSameInstant(date1, date2));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42383);date2 = new GregorianCalendar(2005, 6, 10, 13, 45).getTime();
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42384);assertFalse(DateUtils.isSameInstant(date1, date2));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42385);try {
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42386);DateUtils.isSameInstant((Date) null, (Date) null);
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42387);fail();
        } catch (final IllegalArgumentException ex) {}
    }finally{__CLR4_1_2wmpwmpl3lqxv5t.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    @Test
    public void testIsSameInstant_Cal() {__CLR4_1_2wmpwmpl3lqxv5t.R.globalSliceStart(getClass().getName(),42388);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2h5aoa3wpg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2wmpwmpl3lqxv5t.R.rethrow($CLV_t2$);}finally{__CLR4_1_2wmpwmpl3lqxv5t.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsTest.testIsSameInstant_Cal",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),42388,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2h5aoa3wpg(){try{__CLR4_1_2wmpwmpl3lqxv5t.R.inc(42388);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42389);final GregorianCalendar cal1 = new GregorianCalendar(TimeZone.getTimeZone("GMT+1"));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42390);final GregorianCalendar cal2 = new GregorianCalendar(TimeZone.getTimeZone("GMT-1"));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42391);cal1.set(2004, 6, 9, 13, 45, 0);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42392);cal1.set(Calendar.MILLISECOND, 0);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42393);cal2.set(2004, 6, 9, 13, 45, 0);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42394);cal2.set(Calendar.MILLISECOND, 0);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42395);assertFalse(DateUtils.isSameInstant(cal1, cal2));
        
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42396);cal2.set(2004, 6, 9, 11, 45, 0);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42397);assertTrue(DateUtils.isSameInstant(cal1, cal2));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42398);try {
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42399);DateUtils.isSameInstant((Calendar) null, (Calendar) null);
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42400);fail();
        } catch (final IllegalArgumentException ex) {}
    }finally{__CLR4_1_2wmpwmpl3lqxv5t.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    @Test
    public void testIsSameLocalTime_Cal() {__CLR4_1_2wmpwmpl3lqxv5t.R.globalSliceStart(getClass().getName(),42401);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2ofpq5owpt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2wmpwmpl3lqxv5t.R.rethrow($CLV_t2$);}finally{__CLR4_1_2wmpwmpl3lqxv5t.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsTest.testIsSameLocalTime_Cal",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),42401,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2ofpq5owpt(){try{__CLR4_1_2wmpwmpl3lqxv5t.R.inc(42401);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42402);final GregorianCalendar cal1 = new GregorianCalendar(TimeZone.getTimeZone("GMT+1"));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42403);final GregorianCalendar cal2 = new GregorianCalendar(TimeZone.getTimeZone("GMT-1"));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42404);cal1.set(2004, 6, 9, 13, 45, 0);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42405);cal1.set(Calendar.MILLISECOND, 0);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42406);cal2.set(2004, 6, 9, 13, 45, 0);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42407);cal2.set(Calendar.MILLISECOND, 0);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42408);assertTrue(DateUtils.isSameLocalTime(cal1, cal2));

        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42409);final Calendar cal3 = Calendar.getInstance();
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42410);final Calendar cal4 = Calendar.getInstance();
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42411);cal3.set(2004, 6, 9, 4,  0, 0);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42412);cal4.set(2004, 6, 9, 16, 0, 0);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42413);cal3.set(Calendar.MILLISECOND, 0);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42414);cal4.set(Calendar.MILLISECOND, 0);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42415);assertFalse("LANG-677", DateUtils.isSameLocalTime(cal3, cal4));
        
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42416);cal2.set(2004, 6, 9, 11, 45, 0);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42417);assertFalse(DateUtils.isSameLocalTime(cal1, cal2));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42418);try {
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42419);DateUtils.isSameLocalTime((Calendar) null, (Calendar) null);
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42420);fail();
        } catch (final IllegalArgumentException ex) {}
    }finally{__CLR4_1_2wmpwmpl3lqxv5t.R.flushNeeded();}}
    
    //-----------------------------------------------------------------------
    @Test
    public void testParseDate() throws Exception {__CLR4_1_2wmpwmpl3lqxv5t.R.globalSliceStart(getClass().getName(),42421);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2148ft6wqd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2wmpwmpl3lqxv5t.R.rethrow($CLV_t2$);}finally{__CLR4_1_2wmpwmpl3lqxv5t.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsTest.testParseDate",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),42421,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2148ft6wqd() throws Exception{try{__CLR4_1_2wmpwmpl3lqxv5t.R.inc(42421);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42422);final GregorianCalendar cal = new GregorianCalendar(1972, 11, 3);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42423);String dateStr = "1972-12-03";
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42424);final String[] parsers = new String[] {"yyyy'-'DDD", "yyyy'-'MM'-'dd", "yyyyMMdd"};
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42425);Date date = DateUtils.parseDate(dateStr, parsers);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42426);assertEquals(cal.getTime(), date);
        
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42427);dateStr = "1972-338";
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42428);date = DateUtils.parseDate(dateStr, parsers);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42429);assertEquals(cal.getTime(), date);
        
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42430);dateStr = "19721203";
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42431);date = DateUtils.parseDate(dateStr, parsers);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42432);assertEquals(cal.getTime(), date);
        
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42433);try {
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42434);DateUtils.parseDate("PURPLE", parsers);
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42435);fail();
        } catch (final ParseException ex) {}
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42436);try {
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42437);DateUtils.parseDate("197212AB", parsers);
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42438);fail();
        } catch (final ParseException ex) {}
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42439);try {
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42440);DateUtils.parseDate(null, parsers);
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42441);fail();
        } catch (final IllegalArgumentException ex) {}
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42442);try {
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42443);DateUtils.parseDate(dateStr, (String[]) null);
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42444);fail();
        } catch (final IllegalArgumentException ex) {}
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42445);try {
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42446);DateUtils.parseDate(dateStr, new String[0]);
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42447);fail();
        } catch (final ParseException ex) {}
    }finally{__CLR4_1_2wmpwmpl3lqxv5t.R.flushNeeded();}}
    // LANG-486
    @Test
    public void testParseDateWithLeniency() throws Exception {__CLR4_1_2wmpwmpl3lqxv5t.R.globalSliceStart(getClass().getName(),42448);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2o9wlynwr4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2wmpwmpl3lqxv5t.R.rethrow($CLV_t2$);}finally{__CLR4_1_2wmpwmpl3lqxv5t.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsTest.testParseDateWithLeniency",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),42448,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2o9wlynwr4() throws Exception{try{__CLR4_1_2wmpwmpl3lqxv5t.R.inc(42448);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42449);final GregorianCalendar cal = new GregorianCalendar(1998, 6, 30);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42450);final String dateStr = "02 942, 1996";
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42451);final String[] parsers = new String[] {"MM DDD, yyyy"};
        
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42452);Date date = DateUtils.parseDate(dateStr, parsers);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42453);assertEquals(cal.getTime(), date);
        
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42454);try {
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42455);date = DateUtils.parseDateStrictly(dateStr, parsers);
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42456);fail();
        } catch (final ParseException ex) {}
    }finally{__CLR4_1_2wmpwmpl3lqxv5t.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAddYears() throws Exception {__CLR4_1_2wmpwmpl3lqxv5t.R.globalSliceStart(getClass().getName(),42457);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2pigqmmwrd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2wmpwmpl3lqxv5t.R.rethrow($CLV_t2$);}finally{__CLR4_1_2wmpwmpl3lqxv5t.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsTest.testAddYears",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),42457,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2pigqmmwrd() throws Exception{try{__CLR4_1_2wmpwmpl3lqxv5t.R.inc(42457);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42458);final Date base = new Date(MILLIS_TEST);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42459);Date result = DateUtils.addYears(base, 0);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42460);assertNotSame(base, result);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42461);assertDate(base, 2000, 6, 5, 4, 3, 2, 1);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42462);assertDate(result, 2000, 6, 5, 4, 3, 2, 1);
        
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42463);result = DateUtils.addYears(base, 1);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42464);assertNotSame(base, result);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42465);assertDate(base, 2000, 6, 5, 4, 3, 2, 1);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42466);assertDate(result, 2001, 6, 5, 4, 3, 2, 1);
        
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42467);result = DateUtils.addYears(base, -1);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42468);assertNotSame(base, result);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42469);assertDate(base, 2000, 6, 5, 4, 3, 2, 1);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42470);assertDate(result, 1999, 6, 5, 4, 3, 2, 1);
    }finally{__CLR4_1_2wmpwmpl3lqxv5t.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAddMonths() throws Exception {__CLR4_1_2wmpwmpl3lqxv5t.R.globalSliceStart(getClass().getName(),42471);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2n5eqa1wrr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2wmpwmpl3lqxv5t.R.rethrow($CLV_t2$);}finally{__CLR4_1_2wmpwmpl3lqxv5t.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsTest.testAddMonths",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),42471,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2n5eqa1wrr() throws Exception{try{__CLR4_1_2wmpwmpl3lqxv5t.R.inc(42471);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42472);final Date base = new Date(MILLIS_TEST);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42473);Date result = DateUtils.addMonths(base, 0);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42474);assertNotSame(base, result);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42475);assertDate(base, 2000, 6, 5, 4, 3, 2, 1);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42476);assertDate(result, 2000, 6, 5, 4, 3, 2, 1);
        
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42477);result = DateUtils.addMonths(base, 1);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42478);assertNotSame(base, result);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42479);assertDate(base, 2000, 6, 5, 4, 3, 2, 1);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42480);assertDate(result, 2000, 7, 5, 4, 3, 2, 1);
        
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42481);result = DateUtils.addMonths(base, -1);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42482);assertNotSame(base, result);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42483);assertDate(base, 2000, 6, 5, 4, 3, 2, 1);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42484);assertDate(result, 2000, 5, 5, 4, 3, 2, 1);
    }finally{__CLR4_1_2wmpwmpl3lqxv5t.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAddWeeks() throws Exception {__CLR4_1_2wmpwmpl3lqxv5t.R.globalSliceStart(getClass().getName(),42485);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_25be28nws5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2wmpwmpl3lqxv5t.R.rethrow($CLV_t2$);}finally{__CLR4_1_2wmpwmpl3lqxv5t.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsTest.testAddWeeks",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),42485,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_25be28nws5() throws Exception{try{__CLR4_1_2wmpwmpl3lqxv5t.R.inc(42485);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42486);final Date base = new Date(MILLIS_TEST);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42487);Date result = DateUtils.addWeeks(base, 0);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42488);assertNotSame(base, result);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42489);assertDate(base, 2000, 6, 5, 4, 3, 2, 1);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42490);assertDate(result, 2000, 6, 5, 4, 3, 2, 1);
        
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42491);result = DateUtils.addWeeks(base, 1);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42492);assertNotSame(base, result);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42493);assertDate(base, 2000, 6, 5, 4, 3, 2, 1);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42494);assertDate(result, 2000, 6, 12, 4, 3, 2, 1);
        
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42495);result = DateUtils.addWeeks(base, -1);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42496);assertNotSame(base, result);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42497);assertDate(base, 2000, 6, 5, 4, 3, 2, 1);      // july
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42498);assertDate(result, 2000, 5, 28, 4, 3, 2, 1);   // june
    }finally{__CLR4_1_2wmpwmpl3lqxv5t.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAddDays() throws Exception {__CLR4_1_2wmpwmpl3lqxv5t.R.globalSliceStart(getClass().getName(),42499);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2hq0g19wsj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2wmpwmpl3lqxv5t.R.rethrow($CLV_t2$);}finally{__CLR4_1_2wmpwmpl3lqxv5t.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsTest.testAddDays",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),42499,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2hq0g19wsj() throws Exception{try{__CLR4_1_2wmpwmpl3lqxv5t.R.inc(42499);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42500);final Date base = new Date(MILLIS_TEST);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42501);Date result = DateUtils.addDays(base, 0);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42502);assertNotSame(base, result);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42503);assertDate(base, 2000, 6, 5, 4, 3, 2, 1);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42504);assertDate(result, 2000, 6, 5, 4, 3, 2, 1);
        
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42505);result = DateUtils.addDays(base, 1);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42506);assertNotSame(base, result);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42507);assertDate(base, 2000, 6, 5, 4, 3, 2, 1);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42508);assertDate(result, 2000, 6, 6, 4, 3, 2, 1);
        
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42509);result = DateUtils.addDays(base, -1);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42510);assertNotSame(base, result);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42511);assertDate(base, 2000, 6, 5, 4, 3, 2, 1);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42512);assertDate(result, 2000, 6, 4, 4, 3, 2, 1);
    }finally{__CLR4_1_2wmpwmpl3lqxv5t.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAddHours() throws Exception {__CLR4_1_2wmpwmpl3lqxv5t.R.globalSliceStart(getClass().getName(),42513);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2v9jld3wsx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2wmpwmpl3lqxv5t.R.rethrow($CLV_t2$);}finally{__CLR4_1_2wmpwmpl3lqxv5t.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsTest.testAddHours",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),42513,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2v9jld3wsx() throws Exception{try{__CLR4_1_2wmpwmpl3lqxv5t.R.inc(42513);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42514);final Date base = new Date(MILLIS_TEST);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42515);Date result = DateUtils.addHours(base, 0);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42516);assertNotSame(base, result);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42517);assertDate(base, 2000, 6, 5, 4, 3, 2, 1);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42518);assertDate(result, 2000, 6, 5, 4, 3, 2, 1);
        
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42519);result = DateUtils.addHours(base, 1);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42520);assertNotSame(base, result);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42521);assertDate(base, 2000, 6, 5, 4, 3, 2, 1);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42522);assertDate(result, 2000, 6, 5, 5, 3, 2, 1);
        
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42523);result = DateUtils.addHours(base, -1);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42524);assertNotSame(base, result);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42525);assertDate(base, 2000, 6, 5, 4, 3, 2, 1);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42526);assertDate(result, 2000, 6, 5, 3, 3, 2, 1);
    }finally{__CLR4_1_2wmpwmpl3lqxv5t.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAddMinutes() throws Exception {__CLR4_1_2wmpwmpl3lqxv5t.R.globalSliceStart(getClass().getName(),42527);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2pu9rbdwtb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2wmpwmpl3lqxv5t.R.rethrow($CLV_t2$);}finally{__CLR4_1_2wmpwmpl3lqxv5t.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsTest.testAddMinutes",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),42527,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2pu9rbdwtb() throws Exception{try{__CLR4_1_2wmpwmpl3lqxv5t.R.inc(42527);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42528);final Date base = new Date(MILLIS_TEST);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42529);Date result = DateUtils.addMinutes(base, 0);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42530);assertNotSame(base, result);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42531);assertDate(base, 2000, 6, 5, 4, 3, 2, 1);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42532);assertDate(result, 2000, 6, 5, 4, 3, 2, 1);
        
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42533);result = DateUtils.addMinutes(base, 1);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42534);assertNotSame(base, result);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42535);assertDate(base, 2000, 6, 5, 4, 3, 2, 1);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42536);assertDate(result, 2000, 6, 5, 4, 4, 2, 1);
        
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42537);result = DateUtils.addMinutes(base, -1);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42538);assertNotSame(base, result);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42539);assertDate(base, 2000, 6, 5, 4, 3, 2, 1);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42540);assertDate(result, 2000, 6, 5, 4, 2, 2, 1);
    }finally{__CLR4_1_2wmpwmpl3lqxv5t.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAddSeconds() throws Exception {__CLR4_1_2wmpwmpl3lqxv5t.R.globalSliceStart(getClass().getName(),42541);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2dg3my1wtp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2wmpwmpl3lqxv5t.R.rethrow($CLV_t2$);}finally{__CLR4_1_2wmpwmpl3lqxv5t.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsTest.testAddSeconds",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),42541,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2dg3my1wtp() throws Exception{try{__CLR4_1_2wmpwmpl3lqxv5t.R.inc(42541);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42542);final Date base = new Date(MILLIS_TEST);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42543);Date result = DateUtils.addSeconds(base, 0);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42544);assertNotSame(base, result);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42545);assertDate(base, 2000, 6, 5, 4, 3, 2, 1);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42546);assertDate(result, 2000, 6, 5, 4, 3, 2, 1);
        
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42547);result = DateUtils.addSeconds(base, 1);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42548);assertNotSame(base, result);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42549);assertDate(base, 2000, 6, 5, 4, 3, 2, 1);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42550);assertDate(result, 2000, 6, 5, 4, 3, 3, 1);
        
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42551);result = DateUtils.addSeconds(base, -1);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42552);assertNotSame(base, result);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42553);assertDate(base, 2000, 6, 5, 4, 3, 2, 1);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42554);assertDate(result, 2000, 6, 5, 4, 3, 1, 1);
    }finally{__CLR4_1_2wmpwmpl3lqxv5t.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testAddMilliseconds() throws Exception {__CLR4_1_2wmpwmpl3lqxv5t.R.globalSliceStart(getClass().getName(),42555);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_27wvhx4wu3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2wmpwmpl3lqxv5t.R.rethrow($CLV_t2$);}finally{__CLR4_1_2wmpwmpl3lqxv5t.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsTest.testAddMilliseconds",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),42555,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_27wvhx4wu3() throws Exception{try{__CLR4_1_2wmpwmpl3lqxv5t.R.inc(42555);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42556);final Date base = new Date(MILLIS_TEST);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42557);Date result = DateUtils.addMilliseconds(base, 0);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42558);assertNotSame(base, result);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42559);assertDate(base, 2000, 6, 5, 4, 3, 2, 1);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42560);assertDate(result, 2000, 6, 5, 4, 3, 2, 1);
        
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42561);result = DateUtils.addMilliseconds(base, 1);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42562);assertNotSame(base, result);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42563);assertDate(base, 2000, 6, 5, 4, 3, 2, 1);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42564);assertDate(result, 2000, 6, 5, 4, 3, 2, 2);
        
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42565);result = DateUtils.addMilliseconds(base, -1);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42566);assertNotSame(base, result);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42567);assertDate(base, 2000, 6, 5, 4, 3, 2, 1);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42568);assertDate(result, 2000, 6, 5, 4, 3, 2, 0);
    }finally{__CLR4_1_2wmpwmpl3lqxv5t.R.flushNeeded();}}

    // -----------------------------------------------------------------------
    @Test
    public void testSetYears() throws Exception {__CLR4_1_2wmpwmpl3lqxv5t.R.globalSliceStart(getClass().getName(),42569);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2diokb1wuh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2wmpwmpl3lqxv5t.R.rethrow($CLV_t2$);}finally{__CLR4_1_2wmpwmpl3lqxv5t.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsTest.testSetYears",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),42569,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2diokb1wuh() throws Exception{try{__CLR4_1_2wmpwmpl3lqxv5t.R.inc(42569);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42570);final Date base = new Date(MILLIS_TEST);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42571);Date result = DateUtils.setYears(base, 2000);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42572);assertNotSame(base, result);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42573);assertDate(base, 2000, 6, 5, 4, 3, 2, 1);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42574);assertDate(result, 2000, 6, 5, 4, 3, 2, 1);

        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42575);result = DateUtils.setYears(base, 2008);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42576);assertNotSame(base, result);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42577);assertDate(base, 2000, 6, 5, 4, 3, 2, 1);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42578);assertDate(result, 2008, 6, 5, 4, 3, 2, 1);

        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42579);result = DateUtils.setYears(base, 2005);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42580);assertNotSame(base, result);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42581);assertDate(base, 2000, 6, 5, 4, 3, 2, 1);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42582);assertDate(result, 2005, 6, 5, 4, 3, 2, 1);
    }finally{__CLR4_1_2wmpwmpl3lqxv5t.R.flushNeeded();}}

    // -----------------------------------------------------------------------
    @Test
    public void testSetMonths() throws Exception {__CLR4_1_2wmpwmpl3lqxv5t.R.globalSliceStart(getClass().getName(),42583);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_26hpk6iwuv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2wmpwmpl3lqxv5t.R.rethrow($CLV_t2$);}finally{__CLR4_1_2wmpwmpl3lqxv5t.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsTest.testSetMonths",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),42583,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_26hpk6iwuv() throws Exception{try{__CLR4_1_2wmpwmpl3lqxv5t.R.inc(42583);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42584);final Date base = new Date(MILLIS_TEST);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42585);Date result = DateUtils.setMonths(base, 5);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42586);assertNotSame(base, result);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42587);assertDate(base, 2000, 6, 5, 4, 3, 2, 1);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42588);assertDate(result, 2000, 5, 5, 4, 3, 2, 1);

        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42589);result = DateUtils.setMonths(base, 1);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42590);assertNotSame(base, result);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42591);assertDate(base, 2000, 6, 5, 4, 3, 2, 1);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42592);assertDate(result, 2000, 1, 5, 4, 3, 2, 1);

        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42593);try {
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42594);result = DateUtils.setMonths(base, 12);
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42595);fail("DateUtils.setMonths did not throw an expected IllegalArguementException.");
        } catch (final IllegalArgumentException e) {

        }
    }finally{__CLR4_1_2wmpwmpl3lqxv5t.R.flushNeeded();}}

    // -----------------------------------------------------------------------
    @Test
    public void testSetDays() throws Exception {__CLR4_1_2wmpwmpl3lqxv5t.R.globalSliceStart(getClass().getName(),42596);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_25kshbmwv8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2wmpwmpl3lqxv5t.R.rethrow($CLV_t2$);}finally{__CLR4_1_2wmpwmpl3lqxv5t.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsTest.testSetDays",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),42596,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_25kshbmwv8() throws Exception{try{__CLR4_1_2wmpwmpl3lqxv5t.R.inc(42596);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42597);final Date base = new Date(MILLIS_TEST);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42598);Date result = DateUtils.setDays(base, 1);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42599);assertNotSame(base, result);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42600);assertDate(base, 2000, 6, 5, 4, 3, 2, 1);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42601);assertDate(result, 2000, 6, 1, 4, 3, 2, 1);

        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42602);result = DateUtils.setDays(base, 29);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42603);assertNotSame(base, result);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42604);assertDate(base, 2000, 6, 5, 4, 3, 2, 1);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42605);assertDate(result, 2000, 6, 29, 4, 3, 2, 1);

        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42606);try {
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42607);result = DateUtils.setDays(base, 32);
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42608);fail("DateUtils.setDays did not throw an expected IllegalArguementException.");
        } catch (final IllegalArgumentException e) {

        }
    }finally{__CLR4_1_2wmpwmpl3lqxv5t.R.flushNeeded();}}

    // -----------------------------------------------------------------------
    @Test
    public void testSetHours() throws Exception {__CLR4_1_2wmpwmpl3lqxv5t.R.globalSliceStart(getClass().getName(),42609);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2j9rf1iwvl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2wmpwmpl3lqxv5t.R.rethrow($CLV_t2$);}finally{__CLR4_1_2wmpwmpl3lqxv5t.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsTest.testSetHours",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),42609,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2j9rf1iwvl() throws Exception{try{__CLR4_1_2wmpwmpl3lqxv5t.R.inc(42609);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42610);final Date base = new Date(MILLIS_TEST);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42611);Date result = DateUtils.setHours(base, 0);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42612);assertNotSame(base, result);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42613);assertDate(base, 2000, 6, 5, 4, 3, 2, 1);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42614);assertDate(result, 2000, 6, 5, 0, 3, 2, 1);

        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42615);result = DateUtils.setHours(base, 23);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42616);assertNotSame(base, result);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42617);assertDate(base, 2000, 6, 5, 4, 3, 2, 1);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42618);assertDate(result, 2000, 6, 5, 23, 3, 2, 1);

        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42619);try {
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42620);result = DateUtils.setHours(base, 24);
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42621);fail("DateUtils.setHours did not throw an expected IllegalArguementException.");
        } catch (final IllegalArgumentException e) {

        }
    }finally{__CLR4_1_2wmpwmpl3lqxv5t.R.flushNeeded();}}

    // -----------------------------------------------------------------------
    @Test
    public void testSetMinutes() throws Exception {__CLR4_1_2wmpwmpl3lqxv5t.R.globalSliceStart(getClass().getName(),42622);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2pzyfg6wvy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2wmpwmpl3lqxv5t.R.rethrow($CLV_t2$);}finally{__CLR4_1_2wmpwmpl3lqxv5t.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsTest.testSetMinutes",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),42622,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2pzyfg6wvy() throws Exception{try{__CLR4_1_2wmpwmpl3lqxv5t.R.inc(42622);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42623);final Date base = new Date(MILLIS_TEST);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42624);Date result = DateUtils.setMinutes(base, 0);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42625);assertNotSame(base, result);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42626);assertDate(base, 2000, 6, 5, 4, 3, 2, 1);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42627);assertDate(result, 2000, 6, 5, 4, 0, 2, 1);

        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42628);result = DateUtils.setMinutes(base, 59);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42629);assertNotSame(base, result);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42630);assertDate(base, 2000, 6, 5, 4, 3, 2, 1);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42631);assertDate(result, 2000, 6, 5, 4, 59, 2, 1);

        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42632);try {
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42633);result = DateUtils.setMinutes(base, 60);
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42634);fail("DateUtils.setMinutes did not throw an expected IllegalArguementException.");
        } catch (final IllegalArgumentException e) {

        }
    }finally{__CLR4_1_2wmpwmpl3lqxv5t.R.flushNeeded();}}

    // -----------------------------------------------------------------------
    @Test
    public void testSetSeconds() throws Exception {__CLR4_1_2wmpwmpl3lqxv5t.R.globalSliceStart(getClass().getName(),42635);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2wmzi5mwwb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2wmpwmpl3lqxv5t.R.rethrow($CLV_t2$);}finally{__CLR4_1_2wmpwmpl3lqxv5t.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsTest.testSetSeconds",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),42635,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2wmzi5mwwb() throws Exception{try{__CLR4_1_2wmpwmpl3lqxv5t.R.inc(42635);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42636);final Date base = new Date(MILLIS_TEST);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42637);Date result = DateUtils.setSeconds(base, 0);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42638);assertNotSame(base, result);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42639);assertDate(base, 2000, 6, 5, 4, 3, 2, 1);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42640);assertDate(result, 2000, 6, 5, 4, 3, 0, 1);

        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42641);result = DateUtils.setSeconds(base, 59);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42642);assertNotSame(base, result);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42643);assertDate(base, 2000, 6, 5, 4, 3, 2, 1);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42644);assertDate(result, 2000, 6, 5, 4, 3, 59, 1);

        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42645);try {
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42646);result = DateUtils.setSeconds(base, 60);
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42647);fail("DateUtils.setSeconds did not throw an expected IllegalArguementException.");
        } catch (final IllegalArgumentException e) {

        }
    }finally{__CLR4_1_2wmpwmpl3lqxv5t.R.flushNeeded();}}

    // -----------------------------------------------------------------------
    @Test
    public void testSetMilliseconds() throws Exception {__CLR4_1_2wmpwmpl3lqxv5t.R.globalSliceStart(getClass().getName(),42648);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2xitrxlwwo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2wmpwmpl3lqxv5t.R.rethrow($CLV_t2$);}finally{__CLR4_1_2wmpwmpl3lqxv5t.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsTest.testSetMilliseconds",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),42648,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2xitrxlwwo() throws Exception{try{__CLR4_1_2wmpwmpl3lqxv5t.R.inc(42648);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42649);final Date base = new Date(MILLIS_TEST);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42650);Date result = DateUtils.setMilliseconds(base, 0);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42651);assertNotSame(base, result);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42652);assertDate(base, 2000, 6, 5, 4, 3, 2, 1);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42653);assertDate(result, 2000, 6, 5, 4, 3, 2, 0);

        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42654);result = DateUtils.setMilliseconds(base, 999);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42655);assertNotSame(base, result);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42656);assertDate(base, 2000, 6, 5, 4, 3, 2, 1);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42657);assertDate(result, 2000, 6, 5, 4, 3, 2, 999);

        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42658);try {
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42659);result = DateUtils.setMilliseconds(base, 1000);
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42660);fail("DateUtils.setMilliseconds did not throw an expected IllegalArguementException.");
        } catch (final IllegalArgumentException e) {

        }
    }finally{__CLR4_1_2wmpwmpl3lqxv5t.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    private void assertDate(final Date date, final int year, final int month, final int day, final int hour, final int min, final int sec, final int mil) throws Exception {try{__CLR4_1_2wmpwmpl3lqxv5t.R.inc(42661);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42662);final GregorianCalendar cal = new GregorianCalendar();
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42663);cal.setTime(date);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42664);assertEquals(year, cal.get(Calendar.YEAR));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42665);assertEquals(month, cal.get(Calendar.MONTH));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42666);assertEquals(day, cal.get(Calendar.DAY_OF_MONTH));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42667);assertEquals(hour, cal.get(Calendar.HOUR_OF_DAY));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42668);assertEquals(min, cal.get(Calendar.MINUTE));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42669);assertEquals(sec, cal.get(Calendar.SECOND));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42670);assertEquals(mil, cal.get(Calendar.MILLISECOND));
    }finally{__CLR4_1_2wmpwmpl3lqxv5t.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    @Test
    public void testToCalendar() {__CLR4_1_2wmpwmpl3lqxv5t.R.globalSliceStart(getClass().getName(),42671);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_293d0y6wxb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2wmpwmpl3lqxv5t.R.rethrow($CLV_t2$);}finally{__CLR4_1_2wmpwmpl3lqxv5t.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsTest.testToCalendar",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),42671,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_293d0y6wxb(){try{__CLR4_1_2wmpwmpl3lqxv5t.R.inc(42671);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42672);assertEquals("Failed to convert to a Calendar and back", date1, DateUtils.toCalendar(date1).getTime());
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42673);try {
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42674);DateUtils.toCalendar(null);
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42675);fail("Expected NullPointerException to be thrown");
        } catch(final NullPointerException npe) {
            // expected
        }
    }finally{__CLR4_1_2wmpwmpl3lqxv5t.R.flushNeeded();}}

    //-----------------------------------------------------------------------
    /**
     * Tests various values with the round method
     */
    @Test
    public void testRound() throws Exception {__CLR4_1_2wmpwmpl3lqxv5t.R.globalSliceStart(getClass().getName(),42676);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2uyajvhwxg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2wmpwmpl3lqxv5t.R.rethrow($CLV_t2$);}finally{__CLR4_1_2wmpwmpl3lqxv5t.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsTest.testRound",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),42676,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2uyajvhwxg() throws Exception{try{__CLR4_1_2wmpwmpl3lqxv5t.R.inc(42676);
        // tests for public static Date round(Date date, int field)
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42677);assertEquals("round year-1 failed",
                dateParser.parse("January 1, 2002"),
                DateUtils.round(date1, Calendar.YEAR));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42678);assertEquals("round year-2 failed",
                dateParser.parse("January 1, 2002"),
                DateUtils.round(date2, Calendar.YEAR));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42679);assertEquals("round month-1 failed",
                dateParser.parse("February 1, 2002"),
                DateUtils.round(date1, Calendar.MONTH));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42680);assertEquals("round month-2 failed",
                dateParser.parse("December 1, 2001"),
                DateUtils.round(date2, Calendar.MONTH));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42681);assertEquals("round semimonth-0 failed",
                dateParser.parse("February 1, 2002"),
                DateUtils.round(date0, DateUtils.SEMI_MONTH));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42682);assertEquals("round semimonth-1 failed",
                dateParser.parse("February 16, 2002"),
                DateUtils.round(date1, DateUtils.SEMI_MONTH));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42683);assertEquals("round semimonth-2 failed",
                dateParser.parse("November 16, 2001"),
                DateUtils.round(date2, DateUtils.SEMI_MONTH));
        
        
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42684);assertEquals("round date-1 failed",
                dateParser.parse("February 13, 2002"),
                DateUtils.round(date1, Calendar.DATE));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42685);assertEquals("round date-2 failed",
                dateParser.parse("November 18, 2001"),
                DateUtils.round(date2, Calendar.DATE));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42686);assertEquals("round hour-1 failed",
                dateTimeParser.parse("February 12, 2002 13:00:00.000"),
                DateUtils.round(date1, Calendar.HOUR));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42687);assertEquals("round hour-2 failed",
                dateTimeParser.parse("November 18, 2001 1:00:00.000"),
                DateUtils.round(date2, Calendar.HOUR));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42688);assertEquals("round minute-1 failed",
                dateTimeParser.parse("February 12, 2002 12:35:00.000"),
                DateUtils.round(date1, Calendar.MINUTE));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42689);assertEquals("round minute-2 failed",
                dateTimeParser.parse("November 18, 2001 1:23:00.000"),
                DateUtils.round(date2, Calendar.MINUTE));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42690);assertEquals("round second-1 failed",
                dateTimeParser.parse("February 12, 2002 12:34:57.000"),
                DateUtils.round(date1, Calendar.SECOND));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42691);assertEquals("round second-2 failed",
                dateTimeParser.parse("November 18, 2001 1:23:11.000"),
                DateUtils.round(date2, Calendar.SECOND));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42692);assertEquals("round ampm-1 failed",
                dateTimeParser.parse("February 3, 2002 00:00:00.000"),
                DateUtils.round(dateAmPm1, Calendar.AM_PM));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42693);assertEquals("round ampm-2 failed",
                dateTimeParser.parse("February 3, 2002 12:00:00.000"),
                DateUtils.round(dateAmPm2, Calendar.AM_PM));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42694);assertEquals("round ampm-3 failed",
                dateTimeParser.parse("February 3, 2002 12:00:00.000"),
                DateUtils.round(dateAmPm3, Calendar.AM_PM));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42695);assertEquals("round ampm-4 failed",
                dateTimeParser.parse("February 4, 2002 00:00:00.000"),
                DateUtils.round(dateAmPm4, Calendar.AM_PM));

        // tests for public static Date round(Object date, int field)
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42696);assertEquals("round year-1 failed",
                dateParser.parse("January 1, 2002"),
                DateUtils.round((Object) date1, Calendar.YEAR));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42697);assertEquals("round year-2 failed",
                dateParser.parse("January 1, 2002"),
                DateUtils.round((Object) date2, Calendar.YEAR));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42698);assertEquals("round month-1 failed",
                dateParser.parse("February 1, 2002"),
                DateUtils.round((Object) date1, Calendar.MONTH));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42699);assertEquals("round month-2 failed",
                dateParser.parse("December 1, 2001"),
                DateUtils.round((Object) date2, Calendar.MONTH));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42700);assertEquals("round semimonth-1 failed",
                dateParser.parse("February 16, 2002"),
                DateUtils.round((Object) date1, DateUtils.SEMI_MONTH));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42701);assertEquals("round semimonth-2 failed",
                dateParser.parse("November 16, 2001"),
                DateUtils.round((Object) date2, DateUtils.SEMI_MONTH));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42702);assertEquals("round date-1 failed",
                dateParser.parse("February 13, 2002"),
                DateUtils.round((Object) date1, Calendar.DATE));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42703);assertEquals("round date-2 failed",
                dateParser.parse("November 18, 2001"),
                DateUtils.round((Object) date2, Calendar.DATE));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42704);assertEquals("round hour-1 failed",
                dateTimeParser.parse("February 12, 2002 13:00:00.000"),
                DateUtils.round((Object) date1, Calendar.HOUR));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42705);assertEquals("round hour-2 failed",
                dateTimeParser.parse("November 18, 2001 1:00:00.000"),
                DateUtils.round((Object) date2, Calendar.HOUR));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42706);assertEquals("round minute-1 failed",
                dateTimeParser.parse("February 12, 2002 12:35:00.000"),
                DateUtils.round((Object) date1, Calendar.MINUTE));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42707);assertEquals("round minute-2 failed",
                dateTimeParser.parse("November 18, 2001 1:23:00.000"),
                DateUtils.round((Object) date2, Calendar.MINUTE));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42708);assertEquals("round second-1 failed",
                dateTimeParser.parse("February 12, 2002 12:34:57.000"),
                DateUtils.round((Object) date1, Calendar.SECOND));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42709);assertEquals("round second-2 failed",
                dateTimeParser.parse("November 18, 2001 1:23:11.000"),
                DateUtils.round((Object) date2, Calendar.SECOND));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42710);assertEquals("round calendar second-1 failed",
                dateTimeParser.parse("February 12, 2002 12:34:57.000"),
                DateUtils.round((Object) cal1, Calendar.SECOND));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42711);assertEquals("round calendar second-2 failed",
                dateTimeParser.parse("November 18, 2001 1:23:11.000"),
                DateUtils.round((Object) cal2, Calendar.SECOND));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42712);assertEquals("round ampm-1 failed",
                dateTimeParser.parse("February 3, 2002 00:00:00.000"),
                DateUtils.round((Object) dateAmPm1, Calendar.AM_PM));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42713);assertEquals("round ampm-2 failed",
                dateTimeParser.parse("February 3, 2002 12:00:00.000"),
                DateUtils.round((Object) dateAmPm2, Calendar.AM_PM));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42714);assertEquals("round ampm-3 failed",
                dateTimeParser.parse("February 3, 2002 12:00:00.000"),
                DateUtils.round((Object) dateAmPm3, Calendar.AM_PM));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42715);assertEquals("round ampm-4 failed",
                dateTimeParser.parse("February 4, 2002 00:00:00.000"),
                DateUtils.round((Object) dateAmPm4, Calendar.AM_PM));

        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42716);try {
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42717);DateUtils.round((Date) null, Calendar.SECOND);
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42718);fail();
        } catch (final IllegalArgumentException ex) {}
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42719);try {
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42720);DateUtils.round((Calendar) null, Calendar.SECOND);
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42721);fail();
        } catch (final IllegalArgumentException ex) {}
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42722);try {
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42723);DateUtils.round((Object) null, Calendar.SECOND);
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42724);fail();
        } catch (final IllegalArgumentException ex) {}
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42725);try {
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42726);DateUtils.round("", Calendar.SECOND);
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42727);fail();
        } catch (final ClassCastException ex) {}
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42728);try {
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42729);DateUtils.round(date1, -9999);
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42730);fail();
        } catch(final IllegalArgumentException ex) {}

        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42731);assertEquals("round ampm-1 failed",
                dateTimeParser.parse("February 3, 2002 00:00:00.000"),
                DateUtils.round((Object) calAmPm1, Calendar.AM_PM));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42732);assertEquals("round ampm-2 failed",
                dateTimeParser.parse("February 3, 2002 12:00:00.000"),
                DateUtils.round((Object) calAmPm2, Calendar.AM_PM));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42733);assertEquals("round ampm-3 failed",
                dateTimeParser.parse("February 3, 2002 12:00:00.000"),
                DateUtils.round((Object) calAmPm3, Calendar.AM_PM));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42734);assertEquals("round ampm-4 failed",
                dateTimeParser.parse("February 4, 2002 00:00:00.000"),
                DateUtils.round((Object) calAmPm4, Calendar.AM_PM));
        
        // Fix for http://issues.apache.org/bugzilla/show_bug.cgi?id=25560 / LANG-13
        // Test rounding across the beginning of daylight saving time
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42735);TimeZone.setDefault(zone);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42736);dateTimeParser.setTimeZone(zone);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42737);assertEquals("round MET date across DST change-over",
                dateTimeParser.parse("March 30, 2003 00:00:00.000"),
                DateUtils.round(date4, Calendar.DATE));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42738);assertEquals("round MET date across DST change-over",
                dateTimeParser.parse("March 30, 2003 00:00:00.000"),
                DateUtils.round((Object) cal4, Calendar.DATE));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42739);assertEquals("round MET date across DST change-over",
                dateTimeParser.parse("March 30, 2003 00:00:00.000"),
                DateUtils.round(date5, Calendar.DATE));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42740);assertEquals("round MET date across DST change-over",
                dateTimeParser.parse("March 30, 2003 00:00:00.000"),
                DateUtils.round((Object) cal5, Calendar.DATE));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42741);assertEquals("round MET date across DST change-over",
                dateTimeParser.parse("March 30, 2003 00:00:00.000"),
                DateUtils.round(date6, Calendar.DATE));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42742);assertEquals("round MET date across DST change-over",
                dateTimeParser.parse("March 30, 2003 00:00:00.000"),
                DateUtils.round((Object) cal6, Calendar.DATE));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42743);assertEquals("round MET date across DST change-over",
                dateTimeParser.parse("March 30, 2003 00:00:00.000"),
                DateUtils.round(date7, Calendar.DATE));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42744);assertEquals("round MET date across DST change-over",
                dateTimeParser.parse("March 30, 2003 00:00:00.000"),
                DateUtils.round((Object) cal7, Calendar.DATE));
        
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42745);assertEquals("round MET date across DST change-over",
                dateTimeParser.parse("March 30, 2003 01:00:00.000"),
                DateUtils.round(date4, Calendar.HOUR_OF_DAY));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42746);assertEquals("round MET date across DST change-over",
                dateTimeParser.parse("March 30, 2003 01:00:00.000"),
                DateUtils.round((Object) cal4, Calendar.HOUR_OF_DAY));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42747);if ((((SystemUtils.isJavaVersionAtLeast(JAVA_1_4))&&(__CLR4_1_2wmpwmpl3lqxv5t.R.iget(42748)!=0|true))||(__CLR4_1_2wmpwmpl3lqxv5t.R.iget(42749)==0&false))) {{
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42750);assertEquals("round MET date across DST change-over",
                    dateTimeParser.parse("March 30, 2003 03:00:00.000"),
                    DateUtils.round(date5, Calendar.HOUR_OF_DAY));
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42751);assertEquals("round MET date across DST change-over",
                    dateTimeParser.parse("March 30, 2003 03:00:00.000"),
                    DateUtils.round((Object) cal5, Calendar.HOUR_OF_DAY));
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42752);assertEquals("round MET date across DST change-over",
                    dateTimeParser.parse("March 30, 2003 03:00:00.000"),
                    DateUtils.round(date6, Calendar.HOUR_OF_DAY));
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42753);assertEquals("round MET date across DST change-over",
                    dateTimeParser.parse("March 30, 2003 03:00:00.000"),
                    DateUtils.round((Object) cal6, Calendar.HOUR_OF_DAY));
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42754);assertEquals("round MET date across DST change-over",
                    dateTimeParser.parse("March 30, 2003 04:00:00.000"),
                    DateUtils.round(date7, Calendar.HOUR_OF_DAY));
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42755);assertEquals("round MET date across DST change-over",
                    dateTimeParser.parse("March 30, 2003 04:00:00.000"),
                    DateUtils.round((Object) cal7, Calendar.HOUR_OF_DAY));
        } }else {{
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42756);this.warn("WARNING: Some date rounding tests not run since the current version is " + SystemUtils.JAVA_SPECIFICATION_VERSION);
        }
        }__CLR4_1_2wmpwmpl3lqxv5t.R.inc(42757);TimeZone.setDefault(defaultZone);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42758);dateTimeParser.setTimeZone(defaultZone);
    }finally{__CLR4_1_2wmpwmpl3lqxv5t.R.flushNeeded();}}

    /**
     * Tests the Changes Made by LANG-346 to the DateUtils.modify() private method invoked
     * by DateUtils.round().
     */
    @Test
    public void testRoundLang346() throws Exception
    {__CLR4_1_2wmpwmpl3lqxv5t.R.globalSliceStart(getClass().getName(),42759);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2dirzwuwzr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2wmpwmpl3lqxv5t.R.rethrow($CLV_t2$);}finally{__CLR4_1_2wmpwmpl3lqxv5t.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsTest.testRoundLang346",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),42759,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2dirzwuwzr() throws Exception{try{__CLR4_1_2wmpwmpl3lqxv5t.R.inc(42759);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42760);TimeZone.setDefault(defaultZone);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42761);dateTimeParser.setTimeZone(defaultZone);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42762);final Calendar testCalendar = Calendar.getInstance();
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42763);testCalendar.set(2007, 6, 2, 8, 8, 50);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42764);Date date = testCalendar.getTime();
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42765);assertEquals("Minute Round Up Failed",
                     dateTimeParser.parse("July 2, 2007 08:09:00.000"),
                     DateUtils.round(date, Calendar.MINUTE));

        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42766);testCalendar.set(2007, 6, 2, 8, 8, 20);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42767);date = testCalendar.getTime();
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42768);assertEquals("Minute No Round Failed",
                     dateTimeParser.parse("July 2, 2007 08:08:00.000"),
                     DateUtils.round(date, Calendar.MINUTE));

        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42769);testCalendar.set(2007, 6, 2, 8, 8, 50);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42770);testCalendar.set(Calendar.MILLISECOND, 600);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42771);date = testCalendar.getTime();

        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42772);assertEquals("Second Round Up with 600 Milli Seconds Failed",
                     dateTimeParser.parse("July 2, 2007 08:08:51.000"),
                     DateUtils.round(date, Calendar.SECOND));

        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42773);testCalendar.set(2007, 6, 2, 8, 8, 50);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42774);testCalendar.set(Calendar.MILLISECOND, 200);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42775);date = testCalendar.getTime();
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42776);assertEquals("Second Round Down with 200 Milli Seconds Failed",
                     dateTimeParser.parse("July 2, 2007 08:08:50.000"),
                     DateUtils.round(date, Calendar.SECOND));

        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42777);testCalendar.set(2007, 6, 2, 8, 8, 20);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42778);testCalendar.set(Calendar.MILLISECOND, 600);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42779);date = testCalendar.getTime();
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42780);assertEquals("Second Round Up with 200 Milli Seconds Failed",
                     dateTimeParser.parse("July 2, 2007 08:08:21.000"),
                     DateUtils.round(date, Calendar.SECOND));

        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42781);testCalendar.set(2007, 6, 2, 8, 8, 20);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42782);testCalendar.set(Calendar.MILLISECOND, 200);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42783);date = testCalendar.getTime();
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42784);assertEquals("Second Round Down with 200 Milli Seconds Failed",
                     dateTimeParser.parse("July 2, 2007 08:08:20.000"),
                     DateUtils.round(date, Calendar.SECOND));

        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42785);testCalendar.set(2007, 6, 2, 8, 8, 50);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42786);date = testCalendar.getTime();
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42787);assertEquals("Hour Round Down Failed",
                     dateTimeParser.parse("July 2, 2007 08:00:00.000"),
                     DateUtils.round(date, Calendar.HOUR));

        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42788);testCalendar.set(2007, 6, 2, 8, 31, 50);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42789);date = testCalendar.getTime();
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42790);assertEquals("Hour Round Up Failed",
                     dateTimeParser.parse("July 2, 2007 09:00:00.000"),
                     DateUtils.round(date, Calendar.HOUR));
    }finally{__CLR4_1_2wmpwmpl3lqxv5t.R.flushNeeded();}}

    /**
     * Tests various values with the trunc method
     */
    @Test
    public void testTruncate() throws Exception {__CLR4_1_2wmpwmpl3lqxv5t.R.globalSliceStart(getClass().getName(),42791);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2scappdx0n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2wmpwmpl3lqxv5t.R.rethrow($CLV_t2$);}finally{__CLR4_1_2wmpwmpl3lqxv5t.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsTest.testTruncate",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),42791,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2scappdx0n() throws Exception{try{__CLR4_1_2wmpwmpl3lqxv5t.R.inc(42791);
        // tests public static Date truncate(Date date, int field)
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42792);assertEquals("truncate year-1 failed",
                dateParser.parse("January 1, 2002"),
                DateUtils.truncate(date1, Calendar.YEAR));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42793);assertEquals("truncate year-2 failed",
                dateParser.parse("January 1, 2001"),
                DateUtils.truncate(date2, Calendar.YEAR));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42794);assertEquals("truncate month-1 failed",
                dateParser.parse("February 1, 2002"),
                DateUtils.truncate(date1, Calendar.MONTH));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42795);assertEquals("truncate month-2 failed",
                dateParser.parse("November 1, 2001"),
                DateUtils.truncate(date2, Calendar.MONTH));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42796);assertEquals("truncate semimonth-1 failed",
                dateParser.parse("February 1, 2002"),
                DateUtils.truncate(date1, DateUtils.SEMI_MONTH));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42797);assertEquals("truncate semimonth-2 failed",
                dateParser.parse("November 16, 2001"),
                DateUtils.truncate(date2, DateUtils.SEMI_MONTH));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42798);assertEquals("truncate date-1 failed",
                dateParser.parse("February 12, 2002"),
                DateUtils.truncate(date1, Calendar.DATE));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42799);assertEquals("truncate date-2 failed",
                dateParser.parse("November 18, 2001"),
                DateUtils.truncate(date2, Calendar.DATE));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42800);assertEquals("truncate hour-1 failed",
                dateTimeParser.parse("February 12, 2002 12:00:00.000"),
                DateUtils.truncate(date1, Calendar.HOUR));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42801);assertEquals("truncate hour-2 failed",
                dateTimeParser.parse("November 18, 2001 1:00:00.000"),
                DateUtils.truncate(date2, Calendar.HOUR));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42802);assertEquals("truncate minute-1 failed",
                dateTimeParser.parse("February 12, 2002 12:34:00.000"),
                DateUtils.truncate(date1, Calendar.MINUTE));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42803);assertEquals("truncate minute-2 failed",
                dateTimeParser.parse("November 18, 2001 1:23:00.000"),
                DateUtils.truncate(date2, Calendar.MINUTE));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42804);assertEquals("truncate second-1 failed",
                dateTimeParser.parse("February 12, 2002 12:34:56.000"),
                DateUtils.truncate(date1, Calendar.SECOND));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42805);assertEquals("truncate second-2 failed",
                dateTimeParser.parse("November 18, 2001 1:23:11.000"),
                DateUtils.truncate(date2, Calendar.SECOND));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42806);assertEquals("truncate ampm-1 failed",
                dateTimeParser.parse("February 3, 2002 00:00:00.000"),
                DateUtils.truncate(dateAmPm1, Calendar.AM_PM));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42807);assertEquals("truncate ampm-2 failed",
                dateTimeParser.parse("February 3, 2002 00:00:00.000"),
                DateUtils.truncate(dateAmPm2, Calendar.AM_PM));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42808);assertEquals("truncate ampm-3 failed",
                dateTimeParser.parse("February 3, 2002 12:00:00.000"),
                DateUtils.truncate(dateAmPm3, Calendar.AM_PM));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42809);assertEquals("truncate ampm-4 failed",
                dateTimeParser.parse("February 3, 2002 12:00:00.000"),
                DateUtils.truncate(dateAmPm4, Calendar.AM_PM));

        // tests public static Date truncate(Object date, int field)
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42810);assertEquals("truncate year-1 failed",
                dateParser.parse("January 1, 2002"),
                DateUtils.truncate((Object) date1, Calendar.YEAR));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42811);assertEquals("truncate year-2 failed",
                dateParser.parse("January 1, 2001"),
                DateUtils.truncate((Object) date2, Calendar.YEAR));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42812);assertEquals("truncate month-1 failed",
                dateParser.parse("February 1, 2002"),
                DateUtils.truncate((Object) date1, Calendar.MONTH));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42813);assertEquals("truncate month-2 failed",
                dateParser.parse("November 1, 2001"),
                DateUtils.truncate((Object) date2, Calendar.MONTH));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42814);assertEquals("truncate semimonth-1 failed",
                dateParser.parse("February 1, 2002"),
                DateUtils.truncate((Object) date1, DateUtils.SEMI_MONTH));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42815);assertEquals("truncate semimonth-2 failed",
                dateParser.parse("November 16, 2001"),
                DateUtils.truncate((Object) date2, DateUtils.SEMI_MONTH));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42816);assertEquals("truncate date-1 failed",
                dateParser.parse("February 12, 2002"),
                DateUtils.truncate((Object) date1, Calendar.DATE));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42817);assertEquals("truncate date-2 failed",
                dateParser.parse("November 18, 2001"),
                DateUtils.truncate((Object) date2, Calendar.DATE));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42818);assertEquals("truncate hour-1 failed",
                dateTimeParser.parse("February 12, 2002 12:00:00.000"),
                DateUtils.truncate((Object) date1, Calendar.HOUR));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42819);assertEquals("truncate hour-2 failed",
                dateTimeParser.parse("November 18, 2001 1:00:00.000"),
                DateUtils.truncate((Object) date2, Calendar.HOUR));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42820);assertEquals("truncate minute-1 failed",
                dateTimeParser.parse("February 12, 2002 12:34:00.000"),
                DateUtils.truncate((Object) date1, Calendar.MINUTE));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42821);assertEquals("truncate minute-2 failed",
                dateTimeParser.parse("November 18, 2001 1:23:00.000"),
                DateUtils.truncate((Object) date2, Calendar.MINUTE));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42822);assertEquals("truncate second-1 failed",
                dateTimeParser.parse("February 12, 2002 12:34:56.000"),
                DateUtils.truncate((Object) date1, Calendar.SECOND));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42823);assertEquals("truncate second-2 failed",
                dateTimeParser.parse("November 18, 2001 1:23:11.000"),
                DateUtils.truncate((Object) date2, Calendar.SECOND));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42824);assertEquals("truncate ampm-1 failed",
                dateTimeParser.parse("February 3, 2002 00:00:00.000"),
                DateUtils.truncate((Object) dateAmPm1, Calendar.AM_PM));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42825);assertEquals("truncate ampm-2 failed",
                dateTimeParser.parse("February 3, 2002 00:00:00.000"),
                DateUtils.truncate((Object) dateAmPm2, Calendar.AM_PM));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42826);assertEquals("truncate ampm-3 failed",
                dateTimeParser.parse("February 3, 2002 12:00:00.000"),
                DateUtils.truncate((Object) dateAmPm3, Calendar.AM_PM));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42827);assertEquals("truncate ampm-4 failed",
                dateTimeParser.parse("February 3, 2002 12:00:00.000"),
                DateUtils.truncate((Object) dateAmPm4, Calendar.AM_PM));
        
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42828);assertEquals("truncate calendar second-1 failed",
                dateTimeParser.parse("February 12, 2002 12:34:56.000"),
                DateUtils.truncate((Object) cal1, Calendar.SECOND));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42829);assertEquals("truncate calendar second-2 failed",
                dateTimeParser.parse("November 18, 2001 1:23:11.000"),
                DateUtils.truncate((Object) cal2, Calendar.SECOND));
        
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42830);assertEquals("truncate ampm-1 failed",
                dateTimeParser.parse("February 3, 2002 00:00:00.000"),
                DateUtils.truncate((Object) calAmPm1, Calendar.AM_PM));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42831);assertEquals("truncate ampm-2 failed",
                dateTimeParser.parse("February 3, 2002 00:00:00.000"),
                DateUtils.truncate((Object) calAmPm2, Calendar.AM_PM));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42832);assertEquals("truncate ampm-3 failed",
                dateTimeParser.parse("February 3, 2002 12:00:00.000"),
                DateUtils.truncate((Object) calAmPm3, Calendar.AM_PM));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42833);assertEquals("truncate ampm-4 failed",
                dateTimeParser.parse("February 3, 2002 12:00:00.000"),
                DateUtils.truncate((Object) calAmPm4, Calendar.AM_PM));
        
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42834);try {
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42835);DateUtils.truncate((Date) null, Calendar.SECOND);
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42836);fail();
        } catch (final IllegalArgumentException ex) {}
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42837);try {
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42838);DateUtils.truncate((Calendar) null, Calendar.SECOND);
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42839);fail();
        } catch (final IllegalArgumentException ex) {}
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42840);try {
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42841);DateUtils.truncate((Object) null, Calendar.SECOND);
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42842);fail();
        } catch (final IllegalArgumentException ex) {}
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42843);try {
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42844);DateUtils.truncate("", Calendar.SECOND);
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42845);fail();
        } catch (final ClassCastException ex) {}

        // Fix for http://issues.apache.org/bugzilla/show_bug.cgi?id=25560
        // Test truncate across beginning of daylight saving time
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42846);TimeZone.setDefault(zone);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42847);dateTimeParser.setTimeZone(zone);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42848);assertEquals("truncate MET date across DST change-over",
                dateTimeParser.parse("March 30, 2003 00:00:00.000"),
                DateUtils.truncate(date3, Calendar.DATE));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42849);assertEquals("truncate MET date across DST change-over",
                dateTimeParser.parse("March 30, 2003 00:00:00.000"),
                DateUtils.truncate((Object) cal3, Calendar.DATE));
        // Test truncate across end of daylight saving time
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42850);assertEquals("truncate MET date across DST change-over",
                dateTimeParser.parse("October 26, 2003 00:00:00.000"),
                DateUtils.truncate(date8, Calendar.DATE));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42851);assertEquals("truncate MET date across DST change-over",
                dateTimeParser.parse("October 26, 2003 00:00:00.000"),
                DateUtils.truncate((Object) cal8, Calendar.DATE));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42852);TimeZone.setDefault(defaultZone);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42853);dateTimeParser.setTimeZone(defaultZone);
        
        // Bug 31395, large dates
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42854);final Date endOfTime = new Date(Long.MAX_VALUE); // fyi: Sun Aug 17 07:12:55 CET 292278994 -- 807 millis
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42855);final GregorianCalendar endCal = new GregorianCalendar();
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42856);endCal.setTime(endOfTime);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42857);try {
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42858);DateUtils.truncate(endCal, Calendar.DATE);
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42859);fail();
        } catch (final ArithmeticException ex) {}
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42860);endCal.set(Calendar.YEAR, 280000001);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42861);try {
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42862);DateUtils.truncate(endCal, Calendar.DATE);
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42863);fail();
        } catch (final ArithmeticException ex) {}
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42864);endCal.set(Calendar.YEAR, 280000000);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42865);final Calendar cal = DateUtils.truncate(endCal, Calendar.DATE);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42866);assertEquals(0, cal.get(Calendar.HOUR));
    }finally{__CLR4_1_2wmpwmpl3lqxv5t.R.flushNeeded();}}

    /**
     * Tests for LANG-59
     *
     * see http://issues.apache.org/jira/browse/LANG-59
     */
    @Test
    public void testTruncateLang59() throws Exception {__CLR4_1_2wmpwmpl3lqxv5t.R.globalSliceStart(getClass().getName(),42867);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2gx12unx2r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2wmpwmpl3lqxv5t.R.rethrow($CLV_t2$);}finally{__CLR4_1_2wmpwmpl3lqxv5t.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsTest.testTruncateLang59",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),42867,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2gx12unx2r() throws Exception{try{__CLR4_1_2wmpwmpl3lqxv5t.R.inc(42867);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42868);if ((((!SystemUtils.isJavaVersionAtLeast(JAVA_1_4))&&(__CLR4_1_2wmpwmpl3lqxv5t.R.iget(42869)!=0|true))||(__CLR4_1_2wmpwmpl3lqxv5t.R.iget(42870)==0&false))) {{
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42871);this.warn("WARNING: Test for LANG-59 not run since the current version is " + SystemUtils.JAVA_SPECIFICATION_VERSION);
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42872);return;
        }

        // Set TimeZone to Mountain Time
        }__CLR4_1_2wmpwmpl3lqxv5t.R.inc(42873);final TimeZone MST_MDT = TimeZone.getTimeZone("MST7MDT");
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42874);TimeZone.setDefault(MST_MDT);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42875);final DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS z");
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42876);format.setTimeZone(MST_MDT);

        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42877);final Date oct31_01MDT = new Date(1099206000000L); 

        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42878);final Date oct31MDT             = new Date(oct31_01MDT.getTime()       - 3600000L); // - 1 hour
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42879);final Date oct31_01_02MDT       = new Date(oct31_01MDT.getTime()       + 120000L);  // + 2 minutes
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42880);final Date oct31_01_02_03MDT    = new Date(oct31_01_02MDT.getTime()    + 3000L);    // + 3 seconds
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42881);final Date oct31_01_02_03_04MDT = new Date(oct31_01_02_03MDT.getTime() + 4L);       // + 4 milliseconds

        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42882);assertEquals("Check 00:00:00.000", "2004-10-31 00:00:00.000 MDT", format.format(oct31MDT));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42883);assertEquals("Check 01:00:00.000", "2004-10-31 01:00:00.000 MDT", format.format(oct31_01MDT));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42884);assertEquals("Check 01:02:00.000", "2004-10-31 01:02:00.000 MDT", format.format(oct31_01_02MDT));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42885);assertEquals("Check 01:02:03.000", "2004-10-31 01:02:03.000 MDT", format.format(oct31_01_02_03MDT));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42886);assertEquals("Check 01:02:03.004", "2004-10-31 01:02:03.004 MDT", format.format(oct31_01_02_03_04MDT));

        // ------- Demonstrate Problem -------
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42887);final Calendar gval = Calendar.getInstance();
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42888);gval.setTime(new Date(oct31_01MDT.getTime()));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42889);gval.set(Calendar.MINUTE, gval.get(Calendar.MINUTE)); // set minutes to the same value
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42890);assertEquals("Demonstrate Problem", gval.getTime().getTime(), oct31_01MDT.getTime() + 3600000L);

        // ---------- Test Truncate ----------
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42891);assertEquals("Truncate Calendar.MILLISECOND",
                oct31_01_02_03_04MDT, DateUtils.truncate(oct31_01_02_03_04MDT, Calendar.MILLISECOND));

        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42892);assertEquals("Truncate Calendar.SECOND",
                   oct31_01_02_03MDT, DateUtils.truncate(oct31_01_02_03_04MDT, Calendar.SECOND));

        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42893);assertEquals("Truncate Calendar.MINUTE",
                      oct31_01_02MDT, DateUtils.truncate(oct31_01_02_03_04MDT, Calendar.MINUTE));

        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42894);assertEquals("Truncate Calendar.HOUR_OF_DAY",
                         oct31_01MDT, DateUtils.truncate(oct31_01_02_03_04MDT, Calendar.HOUR_OF_DAY));

        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42895);assertEquals("Truncate Calendar.HOUR",
                         oct31_01MDT, DateUtils.truncate(oct31_01_02_03_04MDT, Calendar.HOUR));

        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42896);assertEquals("Truncate Calendar.DATE",
                            oct31MDT, DateUtils.truncate(oct31_01_02_03_04MDT, Calendar.DATE));


        // ---------- Test Round (down) ----------
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42897);assertEquals("Round Calendar.MILLISECOND",
                oct31_01_02_03_04MDT, DateUtils.round(oct31_01_02_03_04MDT, Calendar.MILLISECOND));

        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42898);assertEquals("Round Calendar.SECOND",
                   oct31_01_02_03MDT, DateUtils.round(oct31_01_02_03_04MDT, Calendar.SECOND));

        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42899);assertEquals("Round Calendar.MINUTE",
                      oct31_01_02MDT, DateUtils.round(oct31_01_02_03_04MDT, Calendar.MINUTE));

        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42900);assertEquals("Round Calendar.HOUR_OF_DAY",
                         oct31_01MDT, DateUtils.round(oct31_01_02_03_04MDT, Calendar.HOUR_OF_DAY));

        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42901);assertEquals("Round Calendar.HOUR",
                         oct31_01MDT, DateUtils.round(oct31_01_02_03_04MDT, Calendar.HOUR));

        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42902);assertEquals("Round Calendar.DATE",
                            oct31MDT, DateUtils.round(oct31_01_02_03_04MDT, Calendar.DATE));

        // restore default time zone
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42903);TimeZone.setDefault(defaultZone);
    }finally{__CLR4_1_2wmpwmpl3lqxv5t.R.flushNeeded();}}

    // http://issues.apache.org/jira/browse/LANG-530
    @Test
    public void testLang530() throws ParseException {__CLR4_1_2wmpwmpl3lqxv5t.R.globalSliceStart(getClass().getName(),42904);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2aigeyhx3s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2wmpwmpl3lqxv5t.R.rethrow($CLV_t2$);}finally{__CLR4_1_2wmpwmpl3lqxv5t.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsTest.testLang530",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),42904,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2aigeyhx3s() throws ParseException{try{__CLR4_1_2wmpwmpl3lqxv5t.R.inc(42904);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42905);final Date d = new Date();
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42906);final String isoDateStr = DateFormatUtils.ISO_DATETIME_TIME_ZONE_FORMAT.format(d);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42907);final Date d2 = DateUtils.parseDate(isoDateStr, new String[] { DateFormatUtils.ISO_DATETIME_TIME_ZONE_FORMAT.getPattern() });
        // the format loses milliseconds so have to reintroduce them
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42908);assertEquals("Date not equal to itself ISO formatted and parsed", d.getTime(), d2.getTime() + d.getTime() % 1000); 
    }finally{__CLR4_1_2wmpwmpl3lqxv5t.R.flushNeeded();}}
    
    /**
     * Tests various values with the ceiling method
     */
    @Test
    public void testCeil() throws Exception {__CLR4_1_2wmpwmpl3lqxv5t.R.globalSliceStart(getClass().getName(),42909);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2omoba6x3x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2wmpwmpl3lqxv5t.R.rethrow($CLV_t2$);}finally{__CLR4_1_2wmpwmpl3lqxv5t.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsTest.testCeil",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),42909,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2omoba6x3x() throws Exception{try{__CLR4_1_2wmpwmpl3lqxv5t.R.inc(42909);
        // test javadoc
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42910);assertEquals("ceiling javadoc-1 failed",
                dateTimeParser.parse("March 28, 2002 14:00:00.000"),
                DateUtils.ceiling(
                    dateTimeParser.parse("March 28, 2002 13:45:01.231"),
                Calendar.HOUR));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42911);assertEquals("ceiling javadoc-2 failed",
                dateTimeParser.parse("April 1, 2002 00:00:00.000"),
                DateUtils.ceiling(
                    dateTimeParser.parse("March 28, 2002 13:45:01.231"),
                Calendar.MONTH));

        // tests public static Date ceiling(Date date, int field)
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42912);assertEquals("ceiling year-1 failed",
                dateParser.parse("January 1, 2003"),
                DateUtils.ceiling(date1, Calendar.YEAR));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42913);assertEquals("ceiling year-2 failed",
                dateParser.parse("January 1, 2002"),
                DateUtils.ceiling(date2, Calendar.YEAR));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42914);assertEquals("ceiling month-1 failed",
                dateParser.parse("March 1, 2002"),
                DateUtils.ceiling(date1, Calendar.MONTH));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42915);assertEquals("ceiling month-2 failed",
                dateParser.parse("December 1, 2001"),
                DateUtils.ceiling(date2, Calendar.MONTH));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42916);assertEquals("ceiling semimonth-1 failed",
                dateParser.parse("February 16, 2002"),
                DateUtils.ceiling(date1, DateUtils.SEMI_MONTH));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42917);assertEquals("ceiling semimonth-2 failed",
                dateParser.parse("December 1, 2001"),
                DateUtils.ceiling(date2, DateUtils.SEMI_MONTH));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42918);assertEquals("ceiling date-1 failed",
                dateParser.parse("February 13, 2002"),
                DateUtils.ceiling(date1, Calendar.DATE));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42919);assertEquals("ceiling date-2 failed",
                dateParser.parse("November 19, 2001"),
                DateUtils.ceiling(date2, Calendar.DATE));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42920);assertEquals("ceiling hour-1 failed",
                dateTimeParser.parse("February 12, 2002 13:00:00.000"),
                DateUtils.ceiling(date1, Calendar.HOUR));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42921);assertEquals("ceiling hour-2 failed",
                dateTimeParser.parse("November 18, 2001 2:00:00.000"),
                DateUtils.ceiling(date2, Calendar.HOUR));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42922);assertEquals("ceiling minute-1 failed",
                dateTimeParser.parse("February 12, 2002 12:35:00.000"),
                DateUtils.ceiling(date1, Calendar.MINUTE));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42923);assertEquals("ceiling minute-2 failed",
                dateTimeParser.parse("November 18, 2001 1:24:00.000"),
                DateUtils.ceiling(date2, Calendar.MINUTE));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42924);assertEquals("ceiling second-1 failed",
                dateTimeParser.parse("February 12, 2002 12:34:57.000"),
                DateUtils.ceiling(date1, Calendar.SECOND));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42925);assertEquals("ceiling second-2 failed",
                dateTimeParser.parse("November 18, 2001 1:23:12.000"),
                DateUtils.ceiling(date2, Calendar.SECOND));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42926);assertEquals("ceiling ampm-1 failed",
                dateTimeParser.parse("February 3, 2002 12:00:00.000"),
                DateUtils.ceiling(dateAmPm1, Calendar.AM_PM));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42927);assertEquals("ceiling ampm-2 failed",
                dateTimeParser.parse("February 3, 2002 12:00:00.000"),
                DateUtils.ceiling(dateAmPm2, Calendar.AM_PM));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42928);assertEquals("ceiling ampm-3 failed",
                dateTimeParser.parse("February 4, 2002 00:00:00.000"),
                DateUtils.ceiling(dateAmPm3, Calendar.AM_PM));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42929);assertEquals("ceiling ampm-4 failed",
                dateTimeParser.parse("February 4, 2002 00:00:00.000"),
                DateUtils.ceiling(dateAmPm4, Calendar.AM_PM));
        
     // tests public static Date ceiling(Object date, int field)
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42930);assertEquals("ceiling year-1 failed",
                dateParser.parse("January 1, 2003"),
                DateUtils.ceiling((Object) date1, Calendar.YEAR));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42931);assertEquals("ceiling year-2 failed",
                dateParser.parse("January 1, 2002"),
                DateUtils.ceiling((Object) date2, Calendar.YEAR));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42932);assertEquals("ceiling month-1 failed",
                dateParser.parse("March 1, 2002"),
                DateUtils.ceiling((Object) date1, Calendar.MONTH));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42933);assertEquals("ceiling month-2 failed",
                dateParser.parse("December 1, 2001"),
                DateUtils.ceiling((Object) date2, Calendar.MONTH));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42934);assertEquals("ceiling semimonth-1 failed",
                dateParser.parse("February 16, 2002"),
                DateUtils.ceiling((Object) date1, DateUtils.SEMI_MONTH));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42935);assertEquals("ceiling semimonth-2 failed",
                dateParser.parse("December 1, 2001"),
                DateUtils.ceiling((Object) date2, DateUtils.SEMI_MONTH));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42936);assertEquals("ceiling date-1 failed",
                dateParser.parse("February 13, 2002"),
                DateUtils.ceiling((Object) date1, Calendar.DATE));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42937);assertEquals("ceiling date-2 failed",
                dateParser.parse("November 19, 2001"),
                DateUtils.ceiling((Object) date2, Calendar.DATE));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42938);assertEquals("ceiling hour-1 failed",
                dateTimeParser.parse("February 12, 2002 13:00:00.000"),
                DateUtils.ceiling((Object) date1, Calendar.HOUR));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42939);assertEquals("ceiling hour-2 failed",
                dateTimeParser.parse("November 18, 2001 2:00:00.000"),
                DateUtils.ceiling((Object) date2, Calendar.HOUR));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42940);assertEquals("ceiling minute-1 failed",
                dateTimeParser.parse("February 12, 2002 12:35:00.000"),
                DateUtils.ceiling((Object) date1, Calendar.MINUTE));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42941);assertEquals("ceiling minute-2 failed",
                dateTimeParser.parse("November 18, 2001 1:24:00.000"),
                DateUtils.ceiling((Object) date2, Calendar.MINUTE));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42942);assertEquals("ceiling second-1 failed",
                dateTimeParser.parse("February 12, 2002 12:34:57.000"),
                DateUtils.ceiling((Object) date1, Calendar.SECOND));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42943);assertEquals("ceiling second-2 failed",
                dateTimeParser.parse("November 18, 2001 1:23:12.000"),
                DateUtils.ceiling((Object) date2, Calendar.SECOND));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42944);assertEquals("ceiling ampm-1 failed",
                dateTimeParser.parse("February 3, 2002 12:00:00.000"),
                DateUtils.ceiling((Object) dateAmPm1, Calendar.AM_PM));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42945);assertEquals("ceiling ampm-2 failed",
                dateTimeParser.parse("February 3, 2002 12:00:00.000"),
                DateUtils.ceiling((Object) dateAmPm2, Calendar.AM_PM));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42946);assertEquals("ceiling ampm-3 failed",
                dateTimeParser.parse("February 4, 2002 00:00:00.000"),
                DateUtils.ceiling((Object) dateAmPm3, Calendar.AM_PM));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42947);assertEquals("ceiling ampm-4 failed",
                dateTimeParser.parse("February 4, 2002 00:00:00.000"),
                DateUtils.ceiling((Object) dateAmPm4, Calendar.AM_PM));
        
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42948);assertEquals("ceiling calendar second-1 failed",
                dateTimeParser.parse("February 12, 2002 12:34:57.000"),
                DateUtils.ceiling((Object) cal1, Calendar.SECOND));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42949);assertEquals("ceiling calendar second-2 failed",
                dateTimeParser.parse("November 18, 2001 1:23:12.000"),
                DateUtils.ceiling((Object) cal2, Calendar.SECOND));
        
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42950);assertEquals("ceiling ampm-1 failed",
                dateTimeParser.parse("February 3, 2002 12:00:00.000"),
                DateUtils.ceiling((Object) calAmPm1, Calendar.AM_PM));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42951);assertEquals("ceiling ampm-2 failed",
                dateTimeParser.parse("February 3, 2002 12:00:00.000"),
                DateUtils.ceiling((Object) calAmPm2, Calendar.AM_PM));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42952);assertEquals("ceiling ampm-3 failed",
                dateTimeParser.parse("February 4, 2002 00:00:00.000"),
                DateUtils.ceiling((Object) calAmPm3, Calendar.AM_PM));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42953);assertEquals("ceiling ampm-4 failed",
                dateTimeParser.parse("February 4, 2002 00:00:00.000"),
                DateUtils.ceiling((Object) calAmPm4, Calendar.AM_PM));

        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42954);try {
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42955);DateUtils.ceiling((Date) null, Calendar.SECOND);
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42956);fail();
        } catch (final IllegalArgumentException ex) {}
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42957);try {
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42958);DateUtils.ceiling((Calendar) null, Calendar.SECOND);
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42959);fail();
        } catch (final IllegalArgumentException ex) {}
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42960);try {
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42961);DateUtils.ceiling((Object) null, Calendar.SECOND);
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42962);fail();
        } catch (final IllegalArgumentException ex) {}
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42963);try {
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42964);DateUtils.ceiling("", Calendar.SECOND);
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42965);fail();
        } catch (final ClassCastException ex) {}
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42966);try {
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42967);DateUtils.ceiling(date1, -9999);
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42968);fail();
        } catch(final IllegalArgumentException ex) {}

        
        // Fix for http://issues.apache.org/bugzilla/show_bug.cgi?id=25560
        // Test ceiling across the beginning of daylight saving time
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42969);TimeZone.setDefault(zone);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42970);dateTimeParser.setTimeZone(zone);

        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42971);assertEquals("ceiling MET date across DST change-over",
                dateTimeParser.parse("March 31, 2003 00:00:00.000"),
                DateUtils.ceiling(date4, Calendar.DATE));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42972);assertEquals("ceiling MET date across DST change-over",
                dateTimeParser.parse("March 31, 2003 00:00:00.000"),
                DateUtils.ceiling((Object) cal4, Calendar.DATE));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42973);assertEquals("ceiling MET date across DST change-over",
                dateTimeParser.parse("March 31, 2003 00:00:00.000"),
                DateUtils.ceiling(date5, Calendar.DATE));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42974);assertEquals("ceiling MET date across DST change-over",
                dateTimeParser.parse("March 31, 2003 00:00:00.000"),
                DateUtils.ceiling((Object) cal5, Calendar.DATE));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42975);assertEquals("ceiling MET date across DST change-over",
                dateTimeParser.parse("March 31, 2003 00:00:00.000"),
                DateUtils.ceiling(date6, Calendar.DATE));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42976);assertEquals("ceiling MET date across DST change-over",
                dateTimeParser.parse("March 31, 2003 00:00:00.000"),
                DateUtils.ceiling((Object) cal6, Calendar.DATE));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42977);assertEquals("ceiling MET date across DST change-over",
                dateTimeParser.parse("March 31, 2003 00:00:00.000"),
                DateUtils.ceiling(date7, Calendar.DATE));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42978);assertEquals("ceiling MET date across DST change-over",
                dateTimeParser.parse("March 31, 2003 00:00:00.000"),
                DateUtils.ceiling((Object) cal7, Calendar.DATE));
        
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42979);assertEquals("ceiling MET date across DST change-over",
                dateTimeParser.parse("March 30, 2003 03:00:00.000"),
                DateUtils.ceiling(date4, Calendar.HOUR_OF_DAY));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42980);assertEquals("ceiling MET date across DST change-over",
                dateTimeParser.parse("March 30, 2003 03:00:00.000"),
                DateUtils.ceiling((Object) cal4, Calendar.HOUR_OF_DAY));
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42981);if ((((SystemUtils.isJavaVersionAtLeast(JAVA_1_4))&&(__CLR4_1_2wmpwmpl3lqxv5t.R.iget(42982)!=0|true))||(__CLR4_1_2wmpwmpl3lqxv5t.R.iget(42983)==0&false))) {{
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42984);assertEquals("ceiling MET date across DST change-over",
                    dateTimeParser.parse("March 30, 2003 03:00:00.000"),
                    DateUtils.ceiling(date5, Calendar.HOUR_OF_DAY));
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42985);assertEquals("ceiling MET date across DST change-over",
                    dateTimeParser.parse("March 30, 2003 03:00:00.000"),
                    DateUtils.ceiling((Object) cal5, Calendar.HOUR_OF_DAY));
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42986);assertEquals("ceiling MET date across DST change-over",
                    dateTimeParser.parse("March 30, 2003 04:00:00.000"),
                    DateUtils.ceiling(date6, Calendar.HOUR_OF_DAY));
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42987);assertEquals("ceiling MET date across DST change-over",
                    dateTimeParser.parse("March 30, 2003 04:00:00.000"),
                    DateUtils.ceiling((Object) cal6, Calendar.HOUR_OF_DAY));
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42988);assertEquals("ceiling MET date across DST change-over",
                    dateTimeParser.parse("March 30, 2003 04:00:00.000"),
                    DateUtils.ceiling(date7, Calendar.HOUR_OF_DAY));
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42989);assertEquals("ceiling MET date across DST change-over",
                    dateTimeParser.parse("March 30, 2003 04:00:00.000"),
                    DateUtils.ceiling((Object) cal7, Calendar.HOUR_OF_DAY));
        } }else {{
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42990);this.warn("WARNING: Some date ceiling tests not run since the current version is " + SystemUtils.JAVA_SPECIFICATION_VERSION);
        }
        }__CLR4_1_2wmpwmpl3lqxv5t.R.inc(42991);TimeZone.setDefault(defaultZone);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42992);dateTimeParser.setTimeZone(defaultZone);
        
     // Bug 31395, large dates
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42993);final Date endOfTime = new Date(Long.MAX_VALUE); // fyi: Sun Aug 17 07:12:55 CET 292278994 -- 807 millis
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42994);final GregorianCalendar endCal = new GregorianCalendar();
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42995);endCal.setTime(endOfTime);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42996);try {
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42997);DateUtils.ceiling(endCal, Calendar.DATE);
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42998);fail();
        } catch (final ArithmeticException ex) {}
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(42999);endCal.set(Calendar.YEAR, 280000001);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(43000);try {
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(43001);DateUtils.ceiling(endCal, Calendar.DATE);
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(43002);fail();
        } catch (final ArithmeticException ex) {}
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(43003);endCal.set(Calendar.YEAR, 280000000);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(43004);final Calendar cal = DateUtils.ceiling(endCal, Calendar.DATE);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(43005);assertEquals(0, cal.get(Calendar.HOUR));
    }finally{__CLR4_1_2wmpwmpl3lqxv5t.R.flushNeeded();}}

    /**
     * Tests the iterator exceptions
     */
    @Test
    public void testIteratorEx() throws Exception {__CLR4_1_2wmpwmpl3lqxv5t.R.globalSliceStart(getClass().getName(),43006);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2tgtzux6m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2wmpwmpl3lqxv5t.R.rethrow($CLV_t2$);}finally{__CLR4_1_2wmpwmpl3lqxv5t.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsTest.testIteratorEx",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),43006,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2tgtzux6m() throws Exception{try{__CLR4_1_2wmpwmpl3lqxv5t.R.inc(43006);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(43007);try {
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(43008);DateUtils.iterator(Calendar.getInstance(), -9999);
        } catch (final IllegalArgumentException ex) {}
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(43009);try {
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(43010);DateUtils.iterator((Date) null, DateUtils.RANGE_WEEK_CENTER);
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(43011);fail();
        } catch (final IllegalArgumentException ex) {}
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(43012);try {
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(43013);DateUtils.iterator((Calendar) null, DateUtils.RANGE_WEEK_CENTER);
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(43014);fail();
        } catch (final IllegalArgumentException ex) {}
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(43015);try {
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(43016);DateUtils.iterator((Object) null, DateUtils.RANGE_WEEK_CENTER);
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(43017);fail();
        } catch (final IllegalArgumentException ex) {}
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(43018);try {
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(43019);DateUtils.iterator("", DateUtils.RANGE_WEEK_CENTER);
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(43020);fail();
        } catch (final ClassCastException ex) {}
    }finally{__CLR4_1_2wmpwmpl3lqxv5t.R.flushNeeded();}}

    /**
     * Tests the calendar iterator for week ranges
     */
    @Test
    public void testWeekIterator() throws Exception {__CLR4_1_2wmpwmpl3lqxv5t.R.globalSliceStart(getClass().getName(),43021);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2bpvfnfx71();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2wmpwmpl3lqxv5t.R.rethrow($CLV_t2$);}finally{__CLR4_1_2wmpwmpl3lqxv5t.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsTest.testWeekIterator",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),43021,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2bpvfnfx71() throws Exception{try{__CLR4_1_2wmpwmpl3lqxv5t.R.inc(43021);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(43022);final Calendar now = Calendar.getInstance();
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(43023);for (int i = 0; (((i< 7)&&(__CLR4_1_2wmpwmpl3lqxv5t.R.iget(43024)!=0|true))||(__CLR4_1_2wmpwmpl3lqxv5t.R.iget(43025)==0&false)); i++) {{
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(43026);final Calendar today = DateUtils.truncate(now, Calendar.DATE);
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(43027);final Calendar sunday = DateUtils.truncate(now, Calendar.DATE);
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(43028);sunday.add(Calendar.DATE, 1 - sunday.get(Calendar.DAY_OF_WEEK));
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(43029);final Calendar monday = DateUtils.truncate(now, Calendar.DATE);
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(43030);if ((((monday.get(Calendar.DAY_OF_WEEK) == 1)&&(__CLR4_1_2wmpwmpl3lqxv5t.R.iget(43031)!=0|true))||(__CLR4_1_2wmpwmpl3lqxv5t.R.iget(43032)==0&false))) {{
                //This is sunday... roll back 6 days
                __CLR4_1_2wmpwmpl3lqxv5t.R.inc(43033);monday.add(Calendar.DATE, -6);
            } }else {{
                __CLR4_1_2wmpwmpl3lqxv5t.R.inc(43034);monday.add(Calendar.DATE, 2 - monday.get(Calendar.DAY_OF_WEEK));
            }
            }__CLR4_1_2wmpwmpl3lqxv5t.R.inc(43035);final Calendar centered = DateUtils.truncate(now, Calendar.DATE);
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(43036);centered.add(Calendar.DATE, -3);
            
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(43037);Iterator<?> it = DateUtils.iterator(now, DateUtils.RANGE_WEEK_SUNDAY);
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(43038);assertWeekIterator(it, sunday);
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(43039);it = DateUtils.iterator(now, DateUtils.RANGE_WEEK_MONDAY);
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(43040);assertWeekIterator(it, monday);
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(43041);it = DateUtils.iterator(now, DateUtils.RANGE_WEEK_RELATIVE);
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(43042);assertWeekIterator(it, today);
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(43043);it = DateUtils.iterator(now, DateUtils.RANGE_WEEK_CENTER);
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(43044);assertWeekIterator(it, centered);
            
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(43045);it = DateUtils.iterator((Object) now, DateUtils.RANGE_WEEK_CENTER);
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(43046);assertWeekIterator(it, centered);
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(43047);it = DateUtils.iterator((Object) now.getTime(), DateUtils.RANGE_WEEK_CENTER);
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(43048);assertWeekIterator(it, centered);
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(43049);try {
                __CLR4_1_2wmpwmpl3lqxv5t.R.inc(43050);it.next();
                __CLR4_1_2wmpwmpl3lqxv5t.R.inc(43051);fail();
            } catch (final NoSuchElementException ex) {}
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(43052);it = DateUtils.iterator(now, DateUtils.RANGE_WEEK_CENTER);
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(43053);it.next();
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(43054);try {
                __CLR4_1_2wmpwmpl3lqxv5t.R.inc(43055);it.remove();
            } catch( final UnsupportedOperationException ex) {}
            
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(43056);now.add(Calendar.DATE,1);
        }
    }}finally{__CLR4_1_2wmpwmpl3lqxv5t.R.flushNeeded();}}
            
    /**
     * Tests the calendar iterator for month-based ranges
     */
    @Test
    public void testMonthIterator() throws Exception {__CLR4_1_2wmpwmpl3lqxv5t.R.globalSliceStart(getClass().getName(),43057);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2u2kxurx81();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2wmpwmpl3lqxv5t.R.rethrow($CLV_t2$);}finally{__CLR4_1_2wmpwmpl3lqxv5t.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsTest.testMonthIterator",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),43057,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2u2kxurx81() throws Exception{try{__CLR4_1_2wmpwmpl3lqxv5t.R.inc(43057);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(43058);Iterator<?> it = DateUtils.iterator(date1, DateUtils.RANGE_MONTH_SUNDAY);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(43059);assertWeekIterator(it,
                dateParser.parse("January 27, 2002"),
                dateParser.parse("March 2, 2002"));

        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(43060);it = DateUtils.iterator(date1, DateUtils.RANGE_MONTH_MONDAY);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(43061);assertWeekIterator(it,
                dateParser.parse("January 28, 2002"),
                dateParser.parse("March 3, 2002"));

        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(43062);it = DateUtils.iterator(date2, DateUtils.RANGE_MONTH_SUNDAY);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(43063);assertWeekIterator(it,
                dateParser.parse("October 28, 2001"),
                dateParser.parse("December 1, 2001"));

        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(43064);it = DateUtils.iterator(date2, DateUtils.RANGE_MONTH_MONDAY);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(43065);assertWeekIterator(it,
                dateParser.parse("October 29, 2001"),
                dateParser.parse("December 2, 2001"));
    }finally{__CLR4_1_2wmpwmpl3lqxv5t.R.flushNeeded();}}

    @Test
    public void testLANG799_EN_OK() throws ParseException {__CLR4_1_2wmpwmpl3lqxv5t.R.globalSliceStart(getClass().getName(),43066);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_246kir3x8a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2wmpwmpl3lqxv5t.R.rethrow($CLV_t2$);}finally{__CLR4_1_2wmpwmpl3lqxv5t.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsTest.testLANG799_EN_OK",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),43066,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_246kir3x8a() throws ParseException{try{__CLR4_1_2wmpwmpl3lqxv5t.R.inc(43066);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(43067);final Locale dflt = Locale.getDefault();
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(43068);Locale.setDefault(Locale.ENGLISH);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(43069);try {
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(43070);DateUtils.parseDate("Wed, 09 Apr 2008 23:55:38 GMT", "EEE, dd MMM yyyy HH:mm:ss zzz");
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(43071);DateUtils.parseDateStrictly("Wed, 09 Apr 2008 23:55:38 GMT", "EEE, dd MMM yyyy HH:mm:ss zzz");
        } finally {
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(43072);Locale.setDefault(dflt);            
        }
    }finally{__CLR4_1_2wmpwmpl3lqxv5t.R.flushNeeded();}}

    // Parse German date with English Locale
    @Test(expected=ParseException.class)
    public void testLANG799_EN_FAIL() throws ParseException {__CLR4_1_2wmpwmpl3lqxv5t.R.globalSliceStart(getClass().getName(),43073);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2dfrkwjx8h();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,76,65,78,71,55,57,57,95,69,78,95,70,65,73,76,58,32,91,80,97,114,115,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof ParseException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2wmpwmpl3lqxv5t.R.rethrow($CLV_t2$);}finally{__CLR4_1_2wmpwmpl3lqxv5t.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsTest.testLANG799_EN_FAIL",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),43073,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2dfrkwjx8h() throws ParseException{try{__CLR4_1_2wmpwmpl3lqxv5t.R.inc(43073);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(43074);final Locale dflt = Locale.getDefault();
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(43075);Locale.setDefault(Locale.ENGLISH);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(43076);try {
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(43077);DateUtils.parseDate("Mi, 09 Apr 2008 23:55:38 GMT", "EEE, dd MMM yyyy HH:mm:ss zzz");
        } finally {
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(43078);Locale.setDefault(dflt);            
        }
    }finally{__CLR4_1_2wmpwmpl3lqxv5t.R.flushNeeded();}}

    @Test
    public void testLANG799_DE_OK() throws ParseException {__CLR4_1_2wmpwmpl3lqxv5t.R.globalSliceStart(getClass().getName(),43079);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2etdut5x8n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2wmpwmpl3lqxv5t.R.rethrow($CLV_t2$);}finally{__CLR4_1_2wmpwmpl3lqxv5t.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsTest.testLANG799_DE_OK",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),43079,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2etdut5x8n() throws ParseException{try{__CLR4_1_2wmpwmpl3lqxv5t.R.inc(43079);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(43080);final Locale dflt = Locale.getDefault();
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(43081);Locale.setDefault(Locale.GERMAN);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(43082);try {
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(43083);DateUtils.parseDate("Mi, 09 Apr 2008 23:55:38 GMT", "EEE, dd MMM yyyy HH:mm:ss zzz");
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(43084);DateUtils.parseDateStrictly("Mi, 09 Apr 2008 23:55:38 GMT", "EEE, dd MMM yyyy HH:mm:ss zzz");
        } finally {
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(43085);Locale.setDefault(dflt);            
        }
    }finally{__CLR4_1_2wmpwmpl3lqxv5t.R.flushNeeded();}}

    // Parse English date with German Locale
    @Test(expected=ParseException.class)
    public void testLANG799_DE_FAIL() throws ParseException {__CLR4_1_2wmpwmpl3lqxv5t.R.globalSliceStart(getClass().getName(),43086);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2gahi2jx8u();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,76,65,78,71,55,57,57,95,68,69,95,70,65,73,76,58,32,91,80,97,114,115,101,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof ParseException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2wmpwmpl3lqxv5t.R.rethrow($CLV_t2$);}finally{__CLR4_1_2wmpwmpl3lqxv5t.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsTest.testLANG799_DE_FAIL",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),43086,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2gahi2jx8u() throws ParseException{try{__CLR4_1_2wmpwmpl3lqxv5t.R.inc(43086);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(43087);final Locale dflt = Locale.getDefault();
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(43088);Locale.setDefault(Locale.GERMAN);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(43089);try {
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(43090);DateUtils.parseDate("Wed, 09 Apr 2008 23:55:38 GMT", "EEE, dd MMM yyyy HH:mm:ss zzz");
        } finally {
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(43091);Locale.setDefault(dflt);            
        }
    }finally{__CLR4_1_2wmpwmpl3lqxv5t.R.flushNeeded();}}
    
    // Parse German date with English Locale, specifying German Locale override
    @Test
    public void testLANG799_EN_WITH_DE_LOCALE() throws ParseException {__CLR4_1_2wmpwmpl3lqxv5t.R.globalSliceStart(getClass().getName(),43092);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_230e6j0x90();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2wmpwmpl3lqxv5t.R.rethrow($CLV_t2$);}finally{__CLR4_1_2wmpwmpl3lqxv5t.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.DateUtilsTest.testLANG799_EN_WITH_DE_LOCALE",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),43092,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_230e6j0x90() throws ParseException{try{__CLR4_1_2wmpwmpl3lqxv5t.R.inc(43092);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(43093);final Locale dflt = Locale.getDefault();
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(43094);Locale.setDefault(Locale.ENGLISH);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(43095);try {
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(43096);DateUtils.parseDate("Mi, 09 Apr 2008 23:55:38 GMT", Locale.GERMAN, "EEE, dd MMM yyyy HH:mm:ss zzz");
        } finally {
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(43097);Locale.setDefault(dflt);            
        }
    }finally{__CLR4_1_2wmpwmpl3lqxv5t.R.flushNeeded();}}
    
    /**
     * This checks that this is a 7 element iterator of Calendar objects
     * that are dates (no time), and exactly 1 day spaced after each other.
     */
    private static void assertWeekIterator(final Iterator<?> it, final Calendar start) {try{__CLR4_1_2wmpwmpl3lqxv5t.R.inc(43098);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(43099);final Calendar end = (Calendar) start.clone();
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(43100);end.add(Calendar.DATE, 6);

        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(43101);assertWeekIterator(it, start, end);
    }finally{__CLR4_1_2wmpwmpl3lqxv5t.R.flushNeeded();}}

    /**
     * Convenience method for when working with Date objects
     */
    private static void assertWeekIterator(final Iterator<?> it, final Date start, final Date end) {try{__CLR4_1_2wmpwmpl3lqxv5t.R.inc(43102);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(43103);final Calendar calStart = Calendar.getInstance();
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(43104);calStart.setTime(start);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(43105);final Calendar calEnd = Calendar.getInstance();
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(43106);calEnd.setTime(end);

        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(43107);assertWeekIterator(it, calStart, calEnd);
    }finally{__CLR4_1_2wmpwmpl3lqxv5t.R.flushNeeded();}}

    /**
     * This checks that this is a 7 divisble iterator of Calendar objects
     * that are dates (no time), and exactly 1 day spaced after each other
     * (in addition to the proper start and stop dates)
     */
    private static void assertWeekIterator(final Iterator<?> it, final Calendar start, final Calendar end) {try{__CLR4_1_2wmpwmpl3lqxv5t.R.inc(43108);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(43109);Calendar cal = (Calendar) it.next();
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(43110);assertCalendarsEquals("", start, cal, 0);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(43111);Calendar last = null;
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(43112);int count = 1;
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(43113);while ((((it.hasNext())&&(__CLR4_1_2wmpwmpl3lqxv5t.R.iget(43114)!=0|true))||(__CLR4_1_2wmpwmpl3lqxv5t.R.iget(43115)==0&false))) {{
            //Check this is just a date (no time component)
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(43116);assertCalendarsEquals("", cal, DateUtils.truncate(cal, Calendar.DATE), 0);

            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(43117);last = cal;
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(43118);cal = (Calendar) it.next();
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(43119);count++;

            //Check that this is one day more than the last date
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(43120);last.add(Calendar.DATE, 1);
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(43121);assertCalendarsEquals("", last, cal, 0);
        }
        }__CLR4_1_2wmpwmpl3lqxv5t.R.inc(43122);if ((((count % 7 != 0)&&(__CLR4_1_2wmpwmpl3lqxv5t.R.iget(43123)!=0|true))||(__CLR4_1_2wmpwmpl3lqxv5t.R.iget(43124)==0&false))) {{
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(43125);throw new AssertionFailedError("There were " + count + " days in this iterator");
        }
        }__CLR4_1_2wmpwmpl3lqxv5t.R.inc(43126);assertCalendarsEquals("", end, cal, 0);
    }finally{__CLR4_1_2wmpwmpl3lqxv5t.R.flushNeeded();}}

    /**
     * Used to check that Calendar objects are close enough
     * delta is in milliseconds
     */
    private static void assertCalendarsEquals(final String message, final Calendar cal1, final Calendar cal2, final long delta) {try{__CLR4_1_2wmpwmpl3lqxv5t.R.inc(43127);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(43128);if ((((Math.abs(cal1.getTime().getTime() - cal2.getTime().getTime()) > delta)&&(__CLR4_1_2wmpwmpl3lqxv5t.R.iget(43129)!=0|true))||(__CLR4_1_2wmpwmpl3lqxv5t.R.iget(43130)==0&false))) {{
            __CLR4_1_2wmpwmpl3lqxv5t.R.inc(43131);throw new AssertionFailedError(
                    message + " expected " + cal1.getTime() + " but got " + cal2.getTime());
        }
    }}finally{__CLR4_1_2wmpwmpl3lqxv5t.R.flushNeeded();}}

    void warn(final String msg) {try{__CLR4_1_2wmpwmpl3lqxv5t.R.inc(43132);
        __CLR4_1_2wmpwmpl3lqxv5t.R.inc(43133);System.err.println(msg);
    }finally{__CLR4_1_2wmpwmpl3lqxv5t.R.flushNeeded();}}
}

