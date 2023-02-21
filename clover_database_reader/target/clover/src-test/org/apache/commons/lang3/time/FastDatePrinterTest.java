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

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

import org.apache.commons.lang3.SerializationUtils;
import org.junit.Test;

/**
 * Unit tests {@link org.apache.commons.lang3.time.FastDatePrinter}.
 *
 * @since 3.0
 */
public class FastDatePrinterTest {static class __CLR4_1_2xvqxvql3lqxv94{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492830024L,8589935092L,44036,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    private static final String YYYY_MM_DD = "yyyy/MM/dd";
    private static final TimeZone NEW_YORK = TimeZone.getTimeZone("America/New_York");
    private static final Locale SWEDEN = new Locale("sv", "SE");

        DatePrinter getInstance(final String format) {try{__CLR4_1_2xvqxvql3lqxv94.R.inc(43910);
        __CLR4_1_2xvqxvql3lqxv94.R.inc(43911);return getInstance(format, TimeZone.getDefault(), Locale.getDefault());
    }finally{__CLR4_1_2xvqxvql3lqxv94.R.flushNeeded();}}

    private DatePrinter getDateInstance(final int dateStyle, final Locale locale) {try{__CLR4_1_2xvqxvql3lqxv94.R.inc(43912);
        __CLR4_1_2xvqxvql3lqxv94.R.inc(43913);return getInstance(FormatCache.getPatternForStyle(Integer.valueOf(dateStyle), null, locale), TimeZone.getDefault(), Locale.getDefault());
    }finally{__CLR4_1_2xvqxvql3lqxv94.R.flushNeeded();}}

    private DatePrinter getInstance(final String format, final Locale locale) {try{__CLR4_1_2xvqxvql3lqxv94.R.inc(43914);
        __CLR4_1_2xvqxvql3lqxv94.R.inc(43915);return getInstance(format, TimeZone.getDefault(), locale);
    }finally{__CLR4_1_2xvqxvql3lqxv94.R.flushNeeded();}}

    private DatePrinter getInstance(final String format, final TimeZone timeZone) {try{__CLR4_1_2xvqxvql3lqxv94.R.inc(43916);
        __CLR4_1_2xvqxvql3lqxv94.R.inc(43917);return getInstance(format, timeZone, Locale.getDefault());
    }finally{__CLR4_1_2xvqxvql3lqxv94.R.flushNeeded();}}

    /**
     * Override this method in derived tests to change the construction of instances
     * @param format
     * @param timeZone
     * @param locale
     * @return
     */
    protected DatePrinter getInstance(final String format, final TimeZone timeZone, final Locale locale) {try{__CLR4_1_2xvqxvql3lqxv94.R.inc(43918);
        __CLR4_1_2xvqxvql3lqxv94.R.inc(43919);return new FastDatePrinter(format, timeZone, locale);
    }finally{__CLR4_1_2xvqxvql3lqxv94.R.flushNeeded();}}

    @Test
    public void testFormat() {__CLR4_1_2xvqxvql3lqxv94.R.globalSliceStart(getClass().getName(),43920);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_27ezuswxw0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2xvqxvql3lqxv94.R.rethrow($CLV_t2$);}finally{__CLR4_1_2xvqxvql3lqxv94.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDatePrinterTest.testFormat",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),43920,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_27ezuswxw0(){try{__CLR4_1_2xvqxvql3lqxv94.R.inc(43920);
        __CLR4_1_2xvqxvql3lqxv94.R.inc(43921);final Locale realDefaultLocale = Locale.getDefault();
        __CLR4_1_2xvqxvql3lqxv94.R.inc(43922);final TimeZone realDefaultZone = TimeZone.getDefault();
        __CLR4_1_2xvqxvql3lqxv94.R.inc(43923);try {
            __CLR4_1_2xvqxvql3lqxv94.R.inc(43924);Locale.setDefault(Locale.US);
            __CLR4_1_2xvqxvql3lqxv94.R.inc(43925);TimeZone.setDefault(NEW_YORK);

            __CLR4_1_2xvqxvql3lqxv94.R.inc(43926);final GregorianCalendar cal1 = new GregorianCalendar(2003, 0, 10, 15, 33, 20);
            __CLR4_1_2xvqxvql3lqxv94.R.inc(43927);final GregorianCalendar cal2 = new GregorianCalendar(2003, 6, 10, 9, 00, 00);
            __CLR4_1_2xvqxvql3lqxv94.R.inc(43928);final Date date1 = cal1.getTime();
            __CLR4_1_2xvqxvql3lqxv94.R.inc(43929);final Date date2 = cal2.getTime();
            __CLR4_1_2xvqxvql3lqxv94.R.inc(43930);final long millis1 = date1.getTime();
            __CLR4_1_2xvqxvql3lqxv94.R.inc(43931);final long millis2 = date2.getTime();

            __CLR4_1_2xvqxvql3lqxv94.R.inc(43932);DatePrinter fdf = getInstance("yyyy-MM-dd'T'HH:mm:ss");
            __CLR4_1_2xvqxvql3lqxv94.R.inc(43933);SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
            __CLR4_1_2xvqxvql3lqxv94.R.inc(43934);assertEquals(sdf.format(date1), fdf.format(date1));
            __CLR4_1_2xvqxvql3lqxv94.R.inc(43935);assertEquals("2003-01-10T15:33:20", fdf.format(date1));
            __CLR4_1_2xvqxvql3lqxv94.R.inc(43936);assertEquals("2003-01-10T15:33:20", fdf.format(cal1));
            __CLR4_1_2xvqxvql3lqxv94.R.inc(43937);assertEquals("2003-01-10T15:33:20", fdf.format(millis1));
            __CLR4_1_2xvqxvql3lqxv94.R.inc(43938);assertEquals("2003-07-10T09:00:00", fdf.format(date2));
            __CLR4_1_2xvqxvql3lqxv94.R.inc(43939);assertEquals("2003-07-10T09:00:00", fdf.format(cal2));
            __CLR4_1_2xvqxvql3lqxv94.R.inc(43940);assertEquals("2003-07-10T09:00:00", fdf.format(millis2));

            __CLR4_1_2xvqxvql3lqxv94.R.inc(43941);fdf = getInstance("Z");
            __CLR4_1_2xvqxvql3lqxv94.R.inc(43942);assertEquals("-0500", fdf.format(date1));
            __CLR4_1_2xvqxvql3lqxv94.R.inc(43943);assertEquals("-0500", fdf.format(cal1));
            __CLR4_1_2xvqxvql3lqxv94.R.inc(43944);assertEquals("-0500", fdf.format(millis1));

            __CLR4_1_2xvqxvql3lqxv94.R.inc(43945);assertEquals("-0400", fdf.format(date2));
            __CLR4_1_2xvqxvql3lqxv94.R.inc(43946);assertEquals("-0400", fdf.format(cal2));
            __CLR4_1_2xvqxvql3lqxv94.R.inc(43947);assertEquals("-0400", fdf.format(millis2));

            __CLR4_1_2xvqxvql3lqxv94.R.inc(43948);fdf = getInstance("ZZ");
            __CLR4_1_2xvqxvql3lqxv94.R.inc(43949);assertEquals("-05:00", fdf.format(date1));
            __CLR4_1_2xvqxvql3lqxv94.R.inc(43950);assertEquals("-05:00", fdf.format(cal1));
            __CLR4_1_2xvqxvql3lqxv94.R.inc(43951);assertEquals("-05:00", fdf.format(millis1));

            __CLR4_1_2xvqxvql3lqxv94.R.inc(43952);assertEquals("-04:00", fdf.format(date2));
            __CLR4_1_2xvqxvql3lqxv94.R.inc(43953);assertEquals("-04:00", fdf.format(cal2));
            __CLR4_1_2xvqxvql3lqxv94.R.inc(43954);assertEquals("-04:00", fdf.format(millis2));

            __CLR4_1_2xvqxvql3lqxv94.R.inc(43955);final String pattern = "GGGG GGG GG G yyyy yyy yy y MMMM MMM MM M" +
                " dddd ddd dd d DDDD DDD DD D EEEE EEE EE E aaaa aaa aa a zzzz zzz zz z";
            __CLR4_1_2xvqxvql3lqxv94.R.inc(43956);fdf = getInstance(pattern);
            __CLR4_1_2xvqxvql3lqxv94.R.inc(43957);sdf = new SimpleDateFormat(pattern);
            // SDF bug fix starting with Java 7
            __CLR4_1_2xvqxvql3lqxv94.R.inc(43958);assertEquals(sdf.format(date1).replaceAll("2003 03 03 03", "2003 2003 03 2003"), fdf.format(date1));
            __CLR4_1_2xvqxvql3lqxv94.R.inc(43959);assertEquals(sdf.format(date2).replaceAll("2003 03 03 03", "2003 2003 03 2003"), fdf.format(date2));
        } finally {
            __CLR4_1_2xvqxvql3lqxv94.R.inc(43960);Locale.setDefault(realDefaultLocale);
            __CLR4_1_2xvqxvql3lqxv94.R.inc(43961);TimeZone.setDefault(realDefaultZone);
        }
    }finally{__CLR4_1_2xvqxvql3lqxv94.R.flushNeeded();}}

    /**
     * Test case for {@link FastDateParser#FastDateParser(String, TimeZone, Locale)}.
     */
    @Test
    public void testShortDateStyleWithLocales() {__CLR4_1_2xvqxvql3lqxv94.R.globalSliceStart(getClass().getName(),43962);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2a9jtmnxx6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2xvqxvql3lqxv94.R.rethrow($CLV_t2$);}finally{__CLR4_1_2xvqxvql3lqxv94.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDatePrinterTest.testShortDateStyleWithLocales",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),43962,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2a9jtmnxx6(){try{__CLR4_1_2xvqxvql3lqxv94.R.inc(43962);
        __CLR4_1_2xvqxvql3lqxv94.R.inc(43963);final Locale usLocale = Locale.US;
        __CLR4_1_2xvqxvql3lqxv94.R.inc(43964);final Locale swedishLocale = new Locale("sv", "SE");
        __CLR4_1_2xvqxvql3lqxv94.R.inc(43965);final Calendar cal = Calendar.getInstance();
        __CLR4_1_2xvqxvql3lqxv94.R.inc(43966);cal.set(2004, 1, 3);
        __CLR4_1_2xvqxvql3lqxv94.R.inc(43967);DatePrinter fdf = getDateInstance(FastDateFormat.SHORT, usLocale);
        __CLR4_1_2xvqxvql3lqxv94.R.inc(43968);assertEquals("2/3/04", fdf.format(cal));

        __CLR4_1_2xvqxvql3lqxv94.R.inc(43969);fdf = getDateInstance(FastDateFormat.SHORT, swedishLocale);
        __CLR4_1_2xvqxvql3lqxv94.R.inc(43970);assertEquals("2004-02-03", fdf.format(cal));

    }finally{__CLR4_1_2xvqxvql3lqxv94.R.flushNeeded();}}

    /**
     * Tests that pre-1000AD years get padded with yyyy
     */
    @Test
    public void testLowYearPadding() {__CLR4_1_2xvqxvql3lqxv94.R.globalSliceStart(getClass().getName(),43971);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2jr7xi1xxf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2xvqxvql3lqxv94.R.rethrow($CLV_t2$);}finally{__CLR4_1_2xvqxvql3lqxv94.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDatePrinterTest.testLowYearPadding",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),43971,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2jr7xi1xxf(){try{__CLR4_1_2xvqxvql3lqxv94.R.inc(43971);
        __CLR4_1_2xvqxvql3lqxv94.R.inc(43972);final Calendar cal = Calendar.getInstance();
        __CLR4_1_2xvqxvql3lqxv94.R.inc(43973);final DatePrinter format = getInstance(YYYY_MM_DD);

        __CLR4_1_2xvqxvql3lqxv94.R.inc(43974);cal.set(1,0,1);
        __CLR4_1_2xvqxvql3lqxv94.R.inc(43975);assertEquals("0001/01/01", format.format(cal));
        __CLR4_1_2xvqxvql3lqxv94.R.inc(43976);cal.set(10,0,1);
        __CLR4_1_2xvqxvql3lqxv94.R.inc(43977);assertEquals("0010/01/01", format.format(cal));
        __CLR4_1_2xvqxvql3lqxv94.R.inc(43978);cal.set(100,0,1);
        __CLR4_1_2xvqxvql3lqxv94.R.inc(43979);assertEquals("0100/01/01", format.format(cal));
        __CLR4_1_2xvqxvql3lqxv94.R.inc(43980);cal.set(999,0,1);
        __CLR4_1_2xvqxvql3lqxv94.R.inc(43981);assertEquals("0999/01/01", format.format(cal));
    }finally{__CLR4_1_2xvqxvql3lqxv94.R.flushNeeded();}}
    /**
     * Show Bug #39410 is solved
     */
    @Test
    public void testMilleniumBug() {__CLR4_1_2xvqxvql3lqxv94.R.globalSliceStart(getClass().getName(),43982);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2rn0vxtxxq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2xvqxvql3lqxv94.R.rethrow($CLV_t2$);}finally{__CLR4_1_2xvqxvql3lqxv94.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDatePrinterTest.testMilleniumBug",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),43982,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2rn0vxtxxq(){try{__CLR4_1_2xvqxvql3lqxv94.R.inc(43982);
        __CLR4_1_2xvqxvql3lqxv94.R.inc(43983);final Calendar cal = Calendar.getInstance();
        __CLR4_1_2xvqxvql3lqxv94.R.inc(43984);final DatePrinter format = getInstance("dd.MM.yyyy");

        __CLR4_1_2xvqxvql3lqxv94.R.inc(43985);cal.set(1000,0,1);
        __CLR4_1_2xvqxvql3lqxv94.R.inc(43986);assertEquals("01.01.1000", format.format(cal));
    }finally{__CLR4_1_2xvqxvql3lqxv94.R.flushNeeded();}}

    /**
     * testLowYearPadding showed that the date was buggy
     * This test confirms it, getting 366 back as a date
     */
    @Test
    public void testSimpleDate() {__CLR4_1_2xvqxvql3lqxv94.R.globalSliceStart(getClass().getName(),43987);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2sx4dyxxxv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2xvqxvql3lqxv94.R.rethrow($CLV_t2$);}finally{__CLR4_1_2xvqxvql3lqxv94.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDatePrinterTest.testSimpleDate",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),43987,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2sx4dyxxxv(){try{__CLR4_1_2xvqxvql3lqxv94.R.inc(43987);
        __CLR4_1_2xvqxvql3lqxv94.R.inc(43988);final Calendar cal = Calendar.getInstance();
        __CLR4_1_2xvqxvql3lqxv94.R.inc(43989);final DatePrinter format = getInstance(YYYY_MM_DD);

        __CLR4_1_2xvqxvql3lqxv94.R.inc(43990);cal.set(2004,11,31);
        __CLR4_1_2xvqxvql3lqxv94.R.inc(43991);assertEquals("2004/12/31", format.format(cal));
        __CLR4_1_2xvqxvql3lqxv94.R.inc(43992);cal.set(999,11,31);
        __CLR4_1_2xvqxvql3lqxv94.R.inc(43993);assertEquals("0999/12/31", format.format(cal));
        __CLR4_1_2xvqxvql3lqxv94.R.inc(43994);cal.set(1,2,2);
        __CLR4_1_2xvqxvql3lqxv94.R.inc(43995);assertEquals("0001/03/02", format.format(cal));
    }finally{__CLR4_1_2xvqxvql3lqxv94.R.flushNeeded();}}

    @Test
    public void testLang303() {__CLR4_1_2xvqxvql3lqxv94.R.globalSliceStart(getClass().getName(),43996);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_26ep1elxy4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2xvqxvql3lqxv94.R.rethrow($CLV_t2$);}finally{__CLR4_1_2xvqxvql3lqxv94.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDatePrinterTest.testLang303",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),43996,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_26ep1elxy4(){try{__CLR4_1_2xvqxvql3lqxv94.R.inc(43996);
        __CLR4_1_2xvqxvql3lqxv94.R.inc(43997);final Calendar cal = Calendar.getInstance();
        __CLR4_1_2xvqxvql3lqxv94.R.inc(43998);cal.set(2004, 11, 31);

        __CLR4_1_2xvqxvql3lqxv94.R.inc(43999);DatePrinter format = getInstance(YYYY_MM_DD);
        __CLR4_1_2xvqxvql3lqxv94.R.inc(44000);final String output = format.format(cal);

        __CLR4_1_2xvqxvql3lqxv94.R.inc(44001);format = SerializationUtils.deserialize(SerializationUtils.serialize((Serializable) format));
        __CLR4_1_2xvqxvql3lqxv94.R.inc(44002);assertEquals(output, format.format(cal));
    }finally{__CLR4_1_2xvqxvql3lqxv94.R.flushNeeded();}}

    @Test
    public void testLang538() {__CLR4_1_2xvqxvql3lqxv94.R.globalSliceStart(getClass().getName(),44003);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2yinwovxyb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2xvqxvql3lqxv94.R.rethrow($CLV_t2$);}finally{__CLR4_1_2xvqxvql3lqxv94.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDatePrinterTest.testLang538",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),44003,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2yinwovxyb(){try{__CLR4_1_2xvqxvql3lqxv94.R.inc(44003);
        // more commonly constructed with: cal = new GregorianCalendar(2009, 9, 16, 8, 42, 16)
        // for the unit test to work in any time zone, constructing with GMT-8 rather than default locale time zone
        __CLR4_1_2xvqxvql3lqxv94.R.inc(44004);final GregorianCalendar cal = new GregorianCalendar(TimeZone.getTimeZone("GMT-8"));
        __CLR4_1_2xvqxvql3lqxv94.R.inc(44005);cal.clear();
        __CLR4_1_2xvqxvql3lqxv94.R.inc(44006);cal.set(2009, 9, 16, 8, 42, 16);

        __CLR4_1_2xvqxvql3lqxv94.R.inc(44007);final DatePrinter format = getInstance("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", TimeZone.getTimeZone("GMT"));
        __CLR4_1_2xvqxvql3lqxv94.R.inc(44008);assertEquals("dateTime", "2009-10-16T16:42:16.000Z", format.format(cal.getTime()));
        __CLR4_1_2xvqxvql3lqxv94.R.inc(44009);assertEquals("dateTime", "2009-10-16T08:42:16.000Z", format.format(cal));
    }finally{__CLR4_1_2xvqxvql3lqxv94.R.flushNeeded();}}

    @Test
    public void testLang645() {__CLR4_1_2xvqxvql3lqxv94.R.globalSliceStart(getClass().getName(),44010);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2gonlduxyi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2xvqxvql3lqxv94.R.rethrow($CLV_t2$);}finally{__CLR4_1_2xvqxvql3lqxv94.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDatePrinterTest.testLang645",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),44010,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2gonlduxyi(){try{__CLR4_1_2xvqxvql3lqxv94.R.inc(44010);
        __CLR4_1_2xvqxvql3lqxv94.R.inc(44011);final Locale locale = new Locale("sv", "SE");

        __CLR4_1_2xvqxvql3lqxv94.R.inc(44012);final Calendar cal = Calendar.getInstance();
        __CLR4_1_2xvqxvql3lqxv94.R.inc(44013);cal.set(2010, 0, 1, 12, 0, 0);
        __CLR4_1_2xvqxvql3lqxv94.R.inc(44014);final Date d = cal.getTime();

        __CLR4_1_2xvqxvql3lqxv94.R.inc(44015);final DatePrinter fdf = getInstance("EEEE', week 'ww", locale);

        __CLR4_1_2xvqxvql3lqxv94.R.inc(44016);assertEquals("fredag, week 53", fdf.format(d));
    }finally{__CLR4_1_2xvqxvql3lqxv94.R.flushNeeded();}}
    
    @Test
    public void testEquals() {__CLR4_1_2xvqxvql3lqxv94.R.globalSliceStart(getClass().getName(),44017);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2s4e608xyp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2xvqxvql3lqxv94.R.rethrow($CLV_t2$);}finally{__CLR4_1_2xvqxvql3lqxv94.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDatePrinterTest.testEquals",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),44017,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2s4e608xyp(){try{__CLR4_1_2xvqxvql3lqxv94.R.inc(44017);
        __CLR4_1_2xvqxvql3lqxv94.R.inc(44018);final DatePrinter printer1= getInstance(YYYY_MM_DD);
        __CLR4_1_2xvqxvql3lqxv94.R.inc(44019);final DatePrinter printer2= getInstance(YYYY_MM_DD);

        __CLR4_1_2xvqxvql3lqxv94.R.inc(44020);assertEquals(printer1, printer2);
        __CLR4_1_2xvqxvql3lqxv94.R.inc(44021);assertEquals(printer1.hashCode(), printer2.hashCode());        

        __CLR4_1_2xvqxvql3lqxv94.R.inc(44022);assertFalse(printer1.equals(new Object()));
    }finally{__CLR4_1_2xvqxvql3lqxv94.R.flushNeeded();}}
    
    @Test
    public void testToStringContainsName() {__CLR4_1_2xvqxvql3lqxv94.R.globalSliceStart(getClass().getName(),44023);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2tx5bkfxyv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2xvqxvql3lqxv94.R.rethrow($CLV_t2$);}finally{__CLR4_1_2xvqxvql3lqxv94.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDatePrinterTest.testToStringContainsName",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),44023,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2tx5bkfxyv(){try{__CLR4_1_2xvqxvql3lqxv94.R.inc(44023);
        __CLR4_1_2xvqxvql3lqxv94.R.inc(44024);final DatePrinter printer= getInstance(YYYY_MM_DD);
        __CLR4_1_2xvqxvql3lqxv94.R.inc(44025);assertTrue(printer.toString().startsWith("FastDate"));
    }finally{__CLR4_1_2xvqxvql3lqxv94.R.flushNeeded();}}
    
    @Test
    public void testPatternMatches() {__CLR4_1_2xvqxvql3lqxv94.R.globalSliceStart(getClass().getName(),44026);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2na8f50xyy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2xvqxvql3lqxv94.R.rethrow($CLV_t2$);}finally{__CLR4_1_2xvqxvql3lqxv94.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDatePrinterTest.testPatternMatches",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),44026,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2na8f50xyy(){try{__CLR4_1_2xvqxvql3lqxv94.R.inc(44026);
        __CLR4_1_2xvqxvql3lqxv94.R.inc(44027);final DatePrinter printer= getInstance(YYYY_MM_DD);
        __CLR4_1_2xvqxvql3lqxv94.R.inc(44028);assertEquals(YYYY_MM_DD, printer.getPattern());
    }finally{__CLR4_1_2xvqxvql3lqxv94.R.flushNeeded();}}
    
    @Test
    public void testLocaleMatches() {__CLR4_1_2xvqxvql3lqxv94.R.globalSliceStart(getClass().getName(),44029);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2pxtz0yxz1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2xvqxvql3lqxv94.R.rethrow($CLV_t2$);}finally{__CLR4_1_2xvqxvql3lqxv94.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDatePrinterTest.testLocaleMatches",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),44029,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2pxtz0yxz1(){try{__CLR4_1_2xvqxvql3lqxv94.R.inc(44029);
        __CLR4_1_2xvqxvql3lqxv94.R.inc(44030);final DatePrinter printer= getInstance(YYYY_MM_DD, SWEDEN);
        __CLR4_1_2xvqxvql3lqxv94.R.inc(44031);assertEquals(SWEDEN, printer.getLocale());
    }finally{__CLR4_1_2xvqxvql3lqxv94.R.flushNeeded();}}
    
    @Test
    public void testTimeZoneMatches() {__CLR4_1_2xvqxvql3lqxv94.R.globalSliceStart(getClass().getName(),44032);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2qy3lf3xz4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2xvqxvql3lqxv94.R.rethrow($CLV_t2$);}finally{__CLR4_1_2xvqxvql3lqxv94.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDatePrinterTest.testTimeZoneMatches",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),44032,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2qy3lf3xz4(){try{__CLR4_1_2xvqxvql3lqxv94.R.inc(44032);
        __CLR4_1_2xvqxvql3lqxv94.R.inc(44033);final DatePrinter printer= getInstance(YYYY_MM_DD, NEW_YORK);
        __CLR4_1_2xvqxvql3lqxv94.R.inc(44034);assertEquals(NEW_YORK, printer.getTimeZone());
    }finally{__CLR4_1_2xvqxvql3lqxv94.R.flushNeeded();}}
    
    @Test
    public void testCalendarTimezoneRespected() {__CLR4_1_2xvqxvql3lqxv94.R.globalSliceStart(getClass().getName(),44035);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_29wrx3xxz7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2xvqxvql3lqxv94.R.rethrow($CLV_t2$);}finally{__CLR4_1_2xvqxvql3lqxv94.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDatePrinterTest.testCalendarTimezoneRespected",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),44035,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_29wrx3xxz7(){try{__CLR4_1_2xvqxvql3lqxv94.R.inc(44035);}finally{__CLR4_1_2xvqxvql3lqxv94.R.flushNeeded();}}
// Defects4J: flaky method
//     @Test
//     public void testCalendarTimezoneRespected() {
//         final String[] availableZones = TimeZone.getAvailableIDs();
//         final TimeZone currentZone = TimeZone.getDefault();
//         
//         TimeZone anotherZone = null;
//         for (final String zone : availableZones) {
//             if (!zone.equals(currentZone.getID())) {
//                 anotherZone = TimeZone.getTimeZone(zone);
//             }
//         }
//         
//         assertNotNull("Cannot find another timezone", anotherZone);
//         
//         final String pattern = "h:mma z";
//         final Calendar cal = Calendar.getInstance(anotherZone);
//         
//         final SimpleDateFormat sdf = new SimpleDateFormat(pattern);
//         sdf.setTimeZone(anotherZone);
//         final String expectedValue = sdf.format(cal.getTime());
//         final String actualValue = FastDateFormat.getInstance(pattern).format(cal);
//         assertEquals(expectedValue, actualValue);
//     }
}
