/* $$ This file has been instrumented by Clover 4.1.2#20161011084623935 $$ *//*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional inparserion regarding copyright ownership.
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
import static org.junit.Assert.assertTrue;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

import org.junit.Assert;

import org.apache.commons.lang3.SerializationUtils;
import org.junit.Test;

/**
 * Unit tests {@link org.apache.commons.lang3.time.FastDateParser}.
 *
 * @since 3.2
 */
public class FastDateParserTest {static class __CLR4_1_2xnxxnxl3lqxv8m{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_2();if(20161011084623935L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.2#20161011084623935,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0068\u006f\u006d\u0065\u002f\u0073\u0065\u0070\u0065\u0068\u0072\u002f\u0074\u0065\u0073\u0074\u005f\u0067\u0065\u006e\u0065\u0072\u0061\u0074\u0069\u006f\u006e\u002f\u004c\u0061\u006e\u0067\u0033\u0062\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1653492830024L,8589935092L,43910,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final String SHORT_FORMAT_NOERA = "y/M/d/h/a/m/E/Z";
    private static final String LONG_FORMAT_NOERA = "yyyy/MMMM/dddd/hhhh/mmmm/aaaa/EEEE/ZZZZ";
    private static final String SHORT_FORMAT = "G/" + SHORT_FORMAT_NOERA;
    private static final String LONG_FORMAT = "GGGG/" + LONG_FORMAT_NOERA;

    private static final String yMdHmsSZ = "yyyy-MM-dd'T'HH:mm:ss.SSS Z";
    private static final String DMY_DOT = "dd.MM.yyyy";
    private static final String YMD_SLASH = "yyyy/MM/dd";
    private static final String MDY_DASH = "MM-DD-yyyy";
    private static final String MDY_SLASH = "MM/DD/yyyy";

    private static final TimeZone REYKJAVIK = TimeZone.getTimeZone("Atlantic/Reykjavik");
    private static final TimeZone NEW_YORK = TimeZone.getTimeZone("America/New_York");
    private static final TimeZone GMT = TimeZone.getTimeZone("GMT");

    private static final Locale SWEDEN = new Locale("sv", "SE");

    DateParser getInstance(final String format) {try{__CLR4_1_2xnxxnxl3lqxv8m.R.inc(43629);
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43630);return getInstance(format, TimeZone.getDefault(), Locale.getDefault());
    }finally{__CLR4_1_2xnxxnxl3lqxv8m.R.flushNeeded();}}

    private DateParser getDateInstance(final int dateStyle, final Locale locale) {try{__CLR4_1_2xnxxnxl3lqxv8m.R.inc(43631);
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43632);return getInstance(FormatCache.getPatternForStyle(Integer.valueOf(dateStyle), null, locale), TimeZone.getDefault(), Locale.getDefault());
    }finally{__CLR4_1_2xnxxnxl3lqxv8m.R.flushNeeded();}}

    private DateParser getInstance(final String format, final Locale locale) {try{__CLR4_1_2xnxxnxl3lqxv8m.R.inc(43633);
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43634);return getInstance(format, TimeZone.getDefault(), locale);
    }finally{__CLR4_1_2xnxxnxl3lqxv8m.R.flushNeeded();}}

    private DateParser getInstance(final String format, final TimeZone timeZone) {try{__CLR4_1_2xnxxnxl3lqxv8m.R.inc(43635);
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43636);return getInstance(format, timeZone, Locale.getDefault());
    }finally{__CLR4_1_2xnxxnxl3lqxv8m.R.flushNeeded();}}

    /**
     * Override this method in derived tests to change the construction of instances
     */
    protected DateParser getInstance(final String format, final TimeZone timeZone, final Locale locale) {try{__CLR4_1_2xnxxnxl3lqxv8m.R.inc(43637);
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43638);return new FastDateParser(format, timeZone, locale);
    }finally{__CLR4_1_2xnxxnxl3lqxv8m.R.flushNeeded();}}

    @Test
    public void test_Equality_Hash() {__CLR4_1_2xnxxnxl3lqxv8m.R.globalSliceStart(getClass().getName(),43639);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_29qhnm5xo7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2xnxxnxl3lqxv8m.R.rethrow($CLV_t2$);}finally{__CLR4_1_2xnxxnxl3lqxv8m.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDateParserTest.test_Equality_Hash",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),43639,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_29qhnm5xo7(){try{__CLR4_1_2xnxxnxl3lqxv8m.R.inc(43639);
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43640);final DateParser[] parsers= {
            getInstance(yMdHmsSZ, NEW_YORK, Locale.US),
            getInstance(DMY_DOT, NEW_YORK, Locale.US),
            getInstance(YMD_SLASH, NEW_YORK, Locale.US),
            getInstance(MDY_DASH, NEW_YORK, Locale.US),
            getInstance(MDY_SLASH, NEW_YORK, Locale.US),
            getInstance(MDY_SLASH, REYKJAVIK, Locale.US),
            getInstance(MDY_SLASH, REYKJAVIK, SWEDEN)
        };

        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43641);final Map<DateParser,Integer> map= new HashMap<DateParser,Integer>();
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43642);int i= 0;
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43643);for(final DateParser parser:parsers) {{
            __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43644);map.put(parser, Integer.valueOf(i++));
        }

        }__CLR4_1_2xnxxnxl3lqxv8m.R.inc(43645);i= 0;
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43646);for(final DateParser parser:parsers) {{
            __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43647);assertEquals(i++, map.get(parser).intValue());
        }
    }}finally{__CLR4_1_2xnxxnxl3lqxv8m.R.flushNeeded();}}

    @Test
    public void testParseZone() {__CLR4_1_2xnxxnxl3lqxv8m.R.globalSliceStart(getClass().getName(),43648);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2vj5aksxog();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2xnxxnxl3lqxv8m.R.rethrow($CLV_t2$);}finally{__CLR4_1_2xnxxnxl3lqxv8m.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDateParserTest.testParseZone",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),43648,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2vj5aksxog(){try{__CLR4_1_2xnxxnxl3lqxv8m.R.inc(43648);}finally{__CLR4_1_2xnxxnxl3lqxv8m.R.flushNeeded();}}
// Defects4J: flaky method
//     @Test
//     public void testParseZone() throws ParseException {
//         final Calendar cal= Calendar.getInstance(NEW_YORK, Locale.US);
//         cal.clear();
//         cal.set(2003, 6, 10, 16, 33, 20);
// 
//         final DateParser fdf = getInstance(yMdHmsSZ, NEW_YORK, Locale.US);
// 
//         assertEquals(cal.getTime(), fdf.parse("2003-07-10T15:33:20.000 -0500"));
//         assertEquals(cal.getTime(), fdf.parse("2003-07-10T15:33:20.000 GMT-05:00"));
//         assertEquals(cal.getTime(), fdf.parse("2003-07-10T16:33:20.000 Eastern Daylight Time"));
//         assertEquals(cal.getTime(), fdf.parse("2003-07-10T16:33:20.000 EDT"));
// 
//         cal.setTimeZone(TimeZone.getTimeZone("GMT-3"));
//         cal.set(2003, 1, 10, 9, 0, 0);
// 
//         assertEquals(cal.getTime(), fdf.parse("2003-02-10T09:00:00.000 -0300"));
// 
//         cal.setTimeZone(TimeZone.getTimeZone("GMT+5"));
//         cal.set(2003, 1, 10, 15, 5, 6);
// 
//         assertEquals(cal.getTime(), fdf.parse("2003-02-10T15:05:06.000 +0500"));
//     }

    @Test
    public void testParseLongShort() throws ParseException {__CLR4_1_2xnxxnxl3lqxv8m.R.globalSliceStart(getClass().getName(),43649);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2660rraxoh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2xnxxnxl3lqxv8m.R.rethrow($CLV_t2$);}finally{__CLR4_1_2xnxxnxl3lqxv8m.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDateParserTest.testParseLongShort",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),43649,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2660rraxoh() throws ParseException{try{__CLR4_1_2xnxxnxl3lqxv8m.R.inc(43649);
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43650);final Calendar cal= Calendar.getInstance(NEW_YORK, Locale.US);
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43651);cal.clear();
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43652);cal.set(2003, 1, 10, 15, 33, 20);
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43653);cal.set(Calendar.MILLISECOND, 989);
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43654);cal.setTimeZone(NEW_YORK);

        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43655);DateParser fdf = getInstance("yyyy GGGG MMMM dddd aaaa EEEE HHHH mmmm ssss SSSS ZZZZ", NEW_YORK, Locale.US);

        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43656);assertEquals(cal.getTime(), fdf.parse("2003 AD February 0010 PM Monday 0015 0033 0020 0989 GMT-05:00"));
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43657);cal.set(Calendar.ERA, GregorianCalendar.BC);

        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43658);final Date parse = fdf.parse("2003 BC February 0010 PM Saturday 0015 0033 0020 0989 GMT-05:00");
                __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43659);assertEquals(cal.getTime(), parse);

        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43660);fdf = getInstance("y G M d a E H m s S Z", NEW_YORK, Locale.US);
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43661);assertEquals(cal.getTime(), fdf.parse("03 BC 2 10 PM Sat 15 33 20 989 -0500"));

        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43662);cal.set(Calendar.ERA, GregorianCalendar.AD);
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43663);assertEquals(cal.getTime(), fdf.parse("03 AD 2 10 PM Saturday 15 33 20 989 -0500"));
    }finally{__CLR4_1_2xnxxnxl3lqxv8m.R.flushNeeded();}}

    @Test
    public void testAmPm() throws ParseException {__CLR4_1_2xnxxnxl3lqxv8m.R.globalSliceStart(getClass().getName(),43664);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2vjul26xow();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2xnxxnxl3lqxv8m.R.rethrow($CLV_t2$);}finally{__CLR4_1_2xnxxnxl3lqxv8m.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDateParserTest.testAmPm",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),43664,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2vjul26xow() throws ParseException{try{__CLR4_1_2xnxxnxl3lqxv8m.R.inc(43664);
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43665);final Calendar cal= Calendar.getInstance(NEW_YORK, Locale.US);
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43666);cal.clear();

        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43667);final DateParser h = getInstance("yyyy-MM-dd hh a mm:ss", NEW_YORK, Locale.US);
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43668);final DateParser K = getInstance("yyyy-MM-dd KK a mm:ss", NEW_YORK, Locale.US);
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43669);final DateParser k = getInstance("yyyy-MM-dd kk:mm:ss", NEW_YORK, Locale.US);
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43670);final DateParser H = getInstance("yyyy-MM-dd HH:mm:ss", NEW_YORK, Locale.US);

        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43671);cal.set(2010, 7, 1, 0, 33, 20);
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43672);assertEquals(cal.getTime(), h.parse("2010-08-01 12 AM 33:20"));
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43673);assertEquals(cal.getTime(), K.parse("2010-08-01 0 AM 33:20"));
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43674);assertEquals(cal.getTime(), k.parse("2010-08-01 00:33:20"));
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43675);assertEquals(cal.getTime(), H.parse("2010-08-01 00:33:20"));

        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43676);cal.set(2010, 7, 1, 3, 33, 20);
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43677);assertEquals(cal.getTime(), h.parse("2010-08-01 3 AM 33:20"));
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43678);assertEquals(cal.getTime(), K.parse("2010-08-01 3 AM 33:20"));
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43679);assertEquals(cal.getTime(), k.parse("2010-08-01 03:33:20"));
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43680);assertEquals(cal.getTime(), H.parse("2010-08-01 03:33:20"));

        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43681);cal.set(2010, 7, 1, 15, 33, 20);
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43682);assertEquals(cal.getTime(), h.parse("2010-08-01 3 PM 33:20"));
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43683);assertEquals(cal.getTime(), K.parse("2010-08-01 3 PM 33:20"));
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43684);assertEquals(cal.getTime(), k.parse("2010-08-01 15:33:20"));
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43685);assertEquals(cal.getTime(), H.parse("2010-08-01 15:33:20"));

        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43686);cal.set(2010, 7, 1, 12, 33, 20);
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43687);assertEquals(cal.getTime(), h.parse("2010-08-01 12 PM 33:20"));
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43688);assertEquals(cal.getTime(), K.parse("2010-08-01 0 PM 33:20"));
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43689);assertEquals(cal.getTime(), k.parse("2010-08-01 12:33:20"));
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43690);assertEquals(cal.getTime(), H.parse("2010-08-01 12:33:20"));
    }finally{__CLR4_1_2xnxxnxl3lqxv8m.R.flushNeeded();}}

    @Test
    // Check that all Locales can parse the formats we use
    public void testParses() throws Exception {__CLR4_1_2xnxxnxl3lqxv8m.R.globalSliceStart(getClass().getName(),43691);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2d58xndxpn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2xnxxnxl3lqxv8m.R.rethrow($CLV_t2$);}finally{__CLR4_1_2xnxxnxl3lqxv8m.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDateParserTest.testParses",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),43691,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2d58xndxpn() throws Exception{try{__CLR4_1_2xnxxnxl3lqxv8m.R.inc(43691);
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43692);for(final Locale locale : Locale.getAvailableLocales()) {{
            __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43693);for(final TimeZone tz : new TimeZone[]{NEW_YORK, GMT}) {{
                __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43694);final Calendar cal = Calendar.getInstance(tz);
                __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43695);for(final int year : new int[]{2003, 1940, 1868, 1867, 0, -1940}) {{
                    // http://docs.oracle.com/javase/6/docs/technotes/guides/intl/calendar.doc.html
                    __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43696);if ((((year < 1868 && locale.equals(FastDateParser.JAPANESE_IMPERIAL))&&(__CLR4_1_2xnxxnxl3lqxv8m.R.iget(43697)!=0|true))||(__CLR4_1_2xnxxnxl3lqxv8m.R.iget(43698)==0&false))) {{
                        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43699);continue; // Japanese imperial calendar does not support eras before 1868
                    }
                    }__CLR4_1_2xnxxnxl3lqxv8m.R.inc(43700);cal.clear();
                    __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43701);if ((((year < 0)&&(__CLR4_1_2xnxxnxl3lqxv8m.R.iget(43702)!=0|true))||(__CLR4_1_2xnxxnxl3lqxv8m.R.iget(43703)==0&false))) {{
                        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43704);cal.set(-year, 1, 10);
                        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43705);cal.set(Calendar.ERA, GregorianCalendar.BC);
                    } }else {{
                        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43706);cal.set(year, 1, 10);
                    }
                    }__CLR4_1_2xnxxnxl3lqxv8m.R.inc(43707);final Date in = cal.getTime();
                    __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43708);for(final String format : new String[]{LONG_FORMAT, SHORT_FORMAT}) {{
                        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43709);final SimpleDateFormat sdf = new SimpleDateFormat(format, locale);
                        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43710);if ((((format.equals(SHORT_FORMAT))&&(__CLR4_1_2xnxxnxl3lqxv8m.R.iget(43711)!=0|true))||(__CLR4_1_2xnxxnxl3lqxv8m.R.iget(43712)==0&false))) {{
                            __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43713);if ((((year < 1930)&&(__CLR4_1_2xnxxnxl3lqxv8m.R.iget(43714)!=0|true))||(__CLR4_1_2xnxxnxl3lqxv8m.R.iget(43715)==0&false))) {{
                                __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43716);sdf.set2DigitYearStart(cal.getTime());
                            }
                        }}
                        }__CLR4_1_2xnxxnxl3lqxv8m.R.inc(43717);final String fmt = sdf.format(in);
                        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43718);try {
                            __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43719);final Date out = sdf.parse(fmt);

                            __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43720);assertEquals(locale.toString()+" "+year+" "+ format+ " "+tz.getID(), in, out);
                        } catch (final ParseException pe) {
                            __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43721);System.out.println(fmt+" "+locale.toString()+" "+year+" "+ format+ " "+tz.getID());
                            __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43722);throw pe;
                        }
                    }
                }}
            }}
        }}
    }}finally{__CLR4_1_2xnxxnxl3lqxv8m.R.flushNeeded();}}

    @Test
    public void testLocales_Long_AD() throws Exception {__CLR4_1_2xnxxnxl3lqxv8m.R.globalSliceStart(getClass().getName(),43723);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2pfcr4lxqj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2xnxxnxl3lqxv8m.R.rethrow($CLV_t2$);}finally{__CLR4_1_2xnxxnxl3lqxv8m.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDateParserTest.testLocales_Long_AD",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),43723,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2pfcr4lxqj() throws Exception{try{__CLR4_1_2xnxxnxl3lqxv8m.R.inc(43723);
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43724);testLocales(LONG_FORMAT, false);
    }finally{__CLR4_1_2xnxxnxl3lqxv8m.R.flushNeeded();}}

    @Test
    public void testLocales_Long_BC() throws Exception {__CLR4_1_2xnxxnxl3lqxv8m.R.globalSliceStart(getClass().getName(),43725);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2j4wd3hxql();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2xnxxnxl3lqxv8m.R.rethrow($CLV_t2$);}finally{__CLR4_1_2xnxxnxl3lqxv8m.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDateParserTest.testLocales_Long_BC",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),43725,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2j4wd3hxql() throws Exception{try{__CLR4_1_2xnxxnxl3lqxv8m.R.inc(43725);
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43726);testLocales(LONG_FORMAT, true);
    }finally{__CLR4_1_2xnxxnxl3lqxv8m.R.flushNeeded();}}

    @Test
    public void testLocales_Short_AD() throws Exception {__CLR4_1_2xnxxnxl3lqxv8m.R.globalSliceStart(getClass().getName(),43727);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2ktvdmjxqn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2xnxxnxl3lqxv8m.R.rethrow($CLV_t2$);}finally{__CLR4_1_2xnxxnxl3lqxv8m.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDateParserTest.testLocales_Short_AD",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),43727,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2ktvdmjxqn() throws Exception{try{__CLR4_1_2xnxxnxl3lqxv8m.R.inc(43727);
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43728);testLocales(SHORT_FORMAT, false);
    }finally{__CLR4_1_2xnxxnxl3lqxv8m.R.flushNeeded();}}

    @Test
    public void testLocales_Short_BC() throws Exception {__CLR4_1_2xnxxnxl3lqxv8m.R.globalSliceStart(getClass().getName(),43729);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_25mzk4jxqp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2xnxxnxl3lqxv8m.R.rethrow($CLV_t2$);}finally{__CLR4_1_2xnxxnxl3lqxv8m.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDateParserTest.testLocales_Short_BC",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),43729,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_25mzk4jxqp() throws Exception{try{__CLR4_1_2xnxxnxl3lqxv8m.R.inc(43729);
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43730);testLocales(SHORT_FORMAT, true);
    }finally{__CLR4_1_2xnxxnxl3lqxv8m.R.flushNeeded();}}

    @Test
    public void testLocales_LongNoEra_AD() throws Exception {__CLR4_1_2xnxxnxl3lqxv8m.R.globalSliceStart(getClass().getName(),43731);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2o8q6ixqr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2xnxxnxl3lqxv8m.R.rethrow($CLV_t2$);}finally{__CLR4_1_2xnxxnxl3lqxv8m.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDateParserTest.testLocales_LongNoEra_AD",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),43731,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2o8q6ixqr() throws Exception{try{__CLR4_1_2xnxxnxl3lqxv8m.R.inc(43731);
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43732);testLocales(LONG_FORMAT_NOERA, false);
    }finally{__CLR4_1_2xnxxnxl3lqxv8m.R.flushNeeded();}}

    @Test
    public void testLocales_LongNoEra_BC() throws Exception {__CLR4_1_2xnxxnxl3lqxv8m.R.globalSliceStart(getClass().getName(),43733);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2r53nxkxqt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2xnxxnxl3lqxv8m.R.rethrow($CLV_t2$);}finally{__CLR4_1_2xnxxnxl3lqxv8m.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDateParserTest.testLocales_LongNoEra_BC",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),43733,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2r53nxkxqt() throws Exception{try{__CLR4_1_2xnxxnxl3lqxv8m.R.inc(43733);
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43734);testLocales(LONG_FORMAT_NOERA, true);
    }finally{__CLR4_1_2xnxxnxl3lqxv8m.R.flushNeeded();}}

    @Test
    public void testLocales_ShortNoEra_AD() throws Exception {__CLR4_1_2xnxxnxl3lqxv8m.R.globalSliceStart(getClass().getName(),43735);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2q4e2jqxqv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2xnxxnxl3lqxv8m.R.rethrow($CLV_t2$);}finally{__CLR4_1_2xnxxnxl3lqxv8m.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDateParserTest.testLocales_ShortNoEra_AD",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),43735,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2q4e2jqxqv() throws Exception{try{__CLR4_1_2xnxxnxl3lqxv8m.R.inc(43735);
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43736);testLocales(SHORT_FORMAT_NOERA, false);
    }finally{__CLR4_1_2xnxxnxl3lqxv8m.R.flushNeeded();}}

    @Test
    public void testLocales_ShortNoEra_BC() throws Exception {__CLR4_1_2xnxxnxl3lqxv8m.R.globalSliceStart(getClass().getName(),43737);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2cgv7cxqx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2xnxxnxl3lqxv8m.R.rethrow($CLV_t2$);}finally{__CLR4_1_2xnxxnxl3lqxv8m.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDateParserTest.testLocales_ShortNoEra_BC",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),43737,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2cgv7cxqx() throws Exception{try{__CLR4_1_2xnxxnxl3lqxv8m.R.inc(43737);
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43738);testLocales(SHORT_FORMAT_NOERA, true);
    }finally{__CLR4_1_2xnxxnxl3lqxv8m.R.flushNeeded();}}

    private void testLocales(final String format, final boolean eraBC) throws Exception {try{__CLR4_1_2xnxxnxl3lqxv8m.R.inc(43739);

        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43740);final Calendar cal= Calendar.getInstance(GMT);
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43741);cal.clear();
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43742);cal.set(2003, 1, 10);
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43743);if ((((eraBC)&&(__CLR4_1_2xnxxnxl3lqxv8m.R.iget(43744)!=0|true))||(__CLR4_1_2xnxxnxl3lqxv8m.R.iget(43745)==0&false))) {{
            __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43746);cal.set(Calendar.ERA, GregorianCalendar.BC);
        }
        }__CLR4_1_2xnxxnxl3lqxv8m.R.inc(43747);for(final Locale locale : Locale.getAvailableLocales()) {{
            // ja_JP_JP cannot handle dates before 1868 properly
            __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43748);if ((((eraBC && locale.equals(FastDateParser.JAPANESE_IMPERIAL))&&(__CLR4_1_2xnxxnxl3lqxv8m.R.iget(43749)!=0|true))||(__CLR4_1_2xnxxnxl3lqxv8m.R.iget(43750)==0&false))) {{
                __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43751);continue;
            }
            }__CLR4_1_2xnxxnxl3lqxv8m.R.inc(43752);final SimpleDateFormat sdf = new SimpleDateFormat(format, locale);
            __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43753);final DateParser fdf = getInstance(format, locale);

            __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43754);try {
                __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43755);checkParse(locale, cal, sdf, fdf);
            } catch(final ParseException ex) {
                __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43756);Assert.fail("Locale "+locale+ " failed with "+format+" era "+((((eraBC)&&(__CLR4_1_2xnxxnxl3lqxv8m.R.iget(43757)!=0|true))||(__CLR4_1_2xnxxnxl3lqxv8m.R.iget(43758)==0&false))?"BC":"AD")+"\n" + trimMessage(ex.toString()));
            }
        }
    }}finally{__CLR4_1_2xnxxnxl3lqxv8m.R.flushNeeded();}}

    private String trimMessage(final String msg) {try{__CLR4_1_2xnxxnxl3lqxv8m.R.inc(43759);
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43760);if ((((msg.length() < 100)&&(__CLR4_1_2xnxxnxl3lqxv8m.R.iget(43761)!=0|true))||(__CLR4_1_2xnxxnxl3lqxv8m.R.iget(43762)==0&false))) {{
            __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43763);return msg;
        }
        }__CLR4_1_2xnxxnxl3lqxv8m.R.inc(43764);final int gmt = msg.indexOf("(GMT");
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43765);if ((((gmt > 0)&&(__CLR4_1_2xnxxnxl3lqxv8m.R.iget(43766)!=0|true))||(__CLR4_1_2xnxxnxl3lqxv8m.R.iget(43767)==0&false))) {{
            __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43768);return msg.substring(0, gmt+4)+"...)";
        }
        }__CLR4_1_2xnxxnxl3lqxv8m.R.inc(43769);return msg.substring(0, 100)+"...";
    }finally{__CLR4_1_2xnxxnxl3lqxv8m.R.flushNeeded();}}

    private void checkParse(final Locale locale, final Calendar cal, final SimpleDateFormat sdf, final DateParser fdf) throws ParseException {try{__CLR4_1_2xnxxnxl3lqxv8m.R.inc(43770);
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43771);final String formattedDate= sdf.format(cal.getTime());
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43772);final Date expectedTime = sdf.parse(formattedDate);
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43773);final Date actualTime = fdf.parse(formattedDate);
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43774);assertEquals(locale.toString()+" "+formattedDate
                +"\n",expectedTime, actualTime);
    }finally{__CLR4_1_2xnxxnxl3lqxv8m.R.flushNeeded();}}

    @Test
    public void testParseNumerics() throws ParseException {__CLR4_1_2xnxxnxl3lqxv8m.R.globalSliceStart(getClass().getName(),43775);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2i26fjmxrz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2xnxxnxl3lqxv8m.R.rethrow($CLV_t2$);}finally{__CLR4_1_2xnxxnxl3lqxv8m.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDateParserTest.testParseNumerics",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),43775,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2i26fjmxrz() throws ParseException{try{__CLR4_1_2xnxxnxl3lqxv8m.R.inc(43775);
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43776);final Calendar cal= Calendar.getInstance(NEW_YORK, Locale.US);
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43777);cal.clear();
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43778);cal.set(2003, 1, 10, 15, 33, 20);
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43779);cal.set(Calendar.MILLISECOND, 989);

        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43780);final DateParser fdf = getInstance("yyyyMMddHHmmssSSS", NEW_YORK, Locale.US);
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43781);assertEquals(cal.getTime(), fdf.parse("20030210153320989"));
    }finally{__CLR4_1_2xnxxnxl3lqxv8m.R.flushNeeded();}}

    @Test
    public void testQuotes() throws ParseException {__CLR4_1_2xnxxnxl3lqxv8m.R.globalSliceStart(getClass().getName(),43782);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_23bickwxs6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2xnxxnxl3lqxv8m.R.rethrow($CLV_t2$);}finally{__CLR4_1_2xnxxnxl3lqxv8m.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDateParserTest.testQuotes",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),43782,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_23bickwxs6() throws ParseException{try{__CLR4_1_2xnxxnxl3lqxv8m.R.inc(43782);
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43783);final Calendar cal= Calendar.getInstance(NEW_YORK, Locale.US);
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43784);cal.clear();
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43785);cal.set(2003, 1, 10, 15, 33, 20);
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43786);cal.set(Calendar.MILLISECOND, 989);

        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43787);final DateParser fdf = getInstance("''yyyyMMdd'A''B'HHmmssSSS''", NEW_YORK, Locale.US);
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43788);assertEquals(cal.getTime(), fdf.parse("'20030210A'B153320989'"));
    }finally{__CLR4_1_2xnxxnxl3lqxv8m.R.flushNeeded();}}

    @Test
    public void testSpecialCharacters() throws Exception {__CLR4_1_2xnxxnxl3lqxv8m.R.globalSliceStart(getClass().getName(),43789);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_21v68g8xsd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2xnxxnxl3lqxv8m.R.rethrow($CLV_t2$);}finally{__CLR4_1_2xnxxnxl3lqxv8m.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDateParserTest.testSpecialCharacters",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),43789,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_21v68g8xsd() throws Exception{try{__CLR4_1_2xnxxnxl3lqxv8m.R.inc(43789);
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43790);testSdfAndFdp("q" ,"", true); // bad pattern character (at present)
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43791);testSdfAndFdp("Q" ,"", true); // bad pattern character
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43792);testSdfAndFdp("$" ,"$", false); // OK
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43793);testSdfAndFdp("?.d" ,"?.12", false); // OK
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43794);testSdfAndFdp("''yyyyMMdd'A''B'HHmmssSSS''", "'20030210A'B153320989'", false); // OK
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43795);testSdfAndFdp("''''yyyyMMdd'A''B'HHmmssSSS''", "''20030210A'B153320989'", false); // OK
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43796);testSdfAndFdp("'$\\Ed'" ,"$\\Ed", false); // OK
    }finally{__CLR4_1_2xnxxnxl3lqxv8m.R.flushNeeded();}}

    @Test
    public void testLANG_832() throws Exception {__CLR4_1_2xnxxnxl3lqxv8m.R.globalSliceStart(getClass().getName(),43797);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2ccjqzlxsl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2xnxxnxl3lqxv8m.R.rethrow($CLV_t2$);}finally{__CLR4_1_2xnxxnxl3lqxv8m.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDateParserTest.testLANG_832",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),43797,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2ccjqzlxsl() throws Exception{try{__CLR4_1_2xnxxnxl3lqxv8m.R.inc(43797);
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43798);testSdfAndFdp("'d'd" ,"d3", false); // OK
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43799);testSdfAndFdp("'d'd'","d3", true); // should fail (unterminated quote)
    }finally{__CLR4_1_2xnxxnxl3lqxv8m.R.flushNeeded();}}

    @Test
    public void testLANG_831() throws Exception {__CLR4_1_2xnxxnxl3lqxv8m.R.globalSliceStart(getClass().getName(),43800);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2fljps2xso();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2xnxxnxl3lqxv8m.R.rethrow($CLV_t2$);}finally{__CLR4_1_2xnxxnxl3lqxv8m.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDateParserTest.testLANG_831",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),43800,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2fljps2xso() throws Exception{try{__CLR4_1_2xnxxnxl3lqxv8m.R.inc(43800);
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43801);testSdfAndFdp("M E","3  Tue", true);
    }finally{__CLR4_1_2xnxxnxl3lqxv8m.R.flushNeeded();}}

    private void testSdfAndFdp(final String format, final String date, final boolean shouldFail)
            throws Exception {try{__CLR4_1_2xnxxnxl3lqxv8m.R.inc(43802);
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43803);final boolean debug = false;
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43804);Date dfdp = null;
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43805);Date dsdf = null;
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43806);Throwable f = null;
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43807);Throwable s = null;

        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43808);try {
            __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43809);final SimpleDateFormat sdf = new SimpleDateFormat(format, Locale.US);
            __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43810);sdf.setTimeZone(NEW_YORK);
            __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43811);dsdf = sdf.parse(date);
            __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43812);if ((((shouldFail)&&(__CLR4_1_2xnxxnxl3lqxv8m.R.iget(43813)!=0|true))||(__CLR4_1_2xnxxnxl3lqxv8m.R.iget(43814)==0&false))) {{
                __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43815);Assert.fail("Expected SDF failure, but got " + dsdf + " for ["+format+","+date+"]");
            }
        }} catch (final Exception e) {
            __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43816);s = e;
            __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43817);if ((((!shouldFail)&&(__CLR4_1_2xnxxnxl3lqxv8m.R.iget(43818)!=0|true))||(__CLR4_1_2xnxxnxl3lqxv8m.R.iget(43819)==0&false))) {{
                __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43820);throw e;
            }
            }__CLR4_1_2xnxxnxl3lqxv8m.R.inc(43821);if ((((debug)&&(__CLR4_1_2xnxxnxl3lqxv8m.R.iget(43822)!=0|true))||(__CLR4_1_2xnxxnxl3lqxv8m.R.iget(43823)==0&false))) {{
                __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43824);System.out.println("sdf:"+format+"/"+date+"=>"+e);
            }
        }}

        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43825);try {
            __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43826);final DateParser fdp = getInstance(format, NEW_YORK, Locale.US);
            __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43827);dfdp = fdp.parse(date);
            __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43828);if ((((shouldFail)&&(__CLR4_1_2xnxxnxl3lqxv8m.R.iget(43829)!=0|true))||(__CLR4_1_2xnxxnxl3lqxv8m.R.iget(43830)==0&false))) {{
                __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43831);Assert.fail("Expected FDF failure, but got " + dfdp + " for ["+format+","+date+"] using "+((FastDateParser)fdp).getParsePattern());
            }
        }} catch (final Exception e) {
            __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43832);f = e;
            __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43833);if ((((!shouldFail)&&(__CLR4_1_2xnxxnxl3lqxv8m.R.iget(43834)!=0|true))||(__CLR4_1_2xnxxnxl3lqxv8m.R.iget(43835)==0&false))) {{
                __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43836);throw e;
            }
            }__CLR4_1_2xnxxnxl3lqxv8m.R.inc(43837);if ((((debug)&&(__CLR4_1_2xnxxnxl3lqxv8m.R.iget(43838)!=0|true))||(__CLR4_1_2xnxxnxl3lqxv8m.R.iget(43839)==0&false))) {{
                __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43840);System.out.println("fdf:"+format+"/"+date+"=>"+e);
            }
        }}
        // SDF and FDF should produce equivalent results
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43841);assertTrue("Should both or neither throw Exceptions", (f==null)==(s==null));
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43842);assertEquals("Parsed dates should be equal", dsdf, dfdp);
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43843);if ((((debug)&&(__CLR4_1_2xnxxnxl3lqxv8m.R.iget(43844)!=0|true))||(__CLR4_1_2xnxxnxl3lqxv8m.R.iget(43845)==0&false))) {{
            __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43846);System.out.println(format + "," + date + " => " + dsdf);
        }
    }}finally{__CLR4_1_2xnxxnxl3lqxv8m.R.flushNeeded();}}

    @Test
    public void testDayOf() throws ParseException {__CLR4_1_2xnxxnxl3lqxv8m.R.globalSliceStart(getClass().getName(),43847);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_22r1tbsxtz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2xnxxnxl3lqxv8m.R.rethrow($CLV_t2$);}finally{__CLR4_1_2xnxxnxl3lqxv8m.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDateParserTest.testDayOf",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),43847,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_22r1tbsxtz() throws ParseException{try{__CLR4_1_2xnxxnxl3lqxv8m.R.inc(43847);
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43848);final Calendar cal= Calendar.getInstance(NEW_YORK, Locale.US);
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43849);cal.clear();
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43850);cal.set(2003, 1, 10);

        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43851);final DateParser fdf = getInstance("W w F D y", NEW_YORK, Locale.US);
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43852);assertEquals(cal.getTime(), fdf.parse("3 7 2 41 03"));
    }finally{__CLR4_1_2xnxxnxl3lqxv8m.R.flushNeeded();}}

    /**
     * Test case for {@link FastDateParser#FastDateParser(String, TimeZone, Locale)}.
     * @throws ParseException
     */
    @Test
    public void testShortDateStyleWithLocales() throws ParseException {__CLR4_1_2xnxxnxl3lqxv8m.R.globalSliceStart(getClass().getName(),43853);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2a9jtmnxu5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2xnxxnxl3lqxv8m.R.rethrow($CLV_t2$);}finally{__CLR4_1_2xnxxnxl3lqxv8m.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDateParserTest.testShortDateStyleWithLocales",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),43853,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2a9jtmnxu5() throws ParseException{try{__CLR4_1_2xnxxnxl3lqxv8m.R.inc(43853);
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43854);DateParser fdf = getDateInstance(FastDateFormat.SHORT, Locale.US);
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43855);final Calendar cal = Calendar.getInstance();
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43856);cal.clear();

        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43857);cal.set(2004, 1, 3);
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43858);assertEquals(cal.getTime(), fdf.parse("2/3/04"));

        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43859);fdf = getDateInstance(FastDateFormat.SHORT, SWEDEN);
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43860);assertEquals(cal.getTime(), fdf.parse("2004-02-03"));
    }finally{__CLR4_1_2xnxxnxl3lqxv8m.R.flushNeeded();}}

    /**
     * Tests that pre-1000AD years get padded with yyyy
     * @throws ParseException
     */
    @Test
    public void testLowYearPadding() throws ParseException {__CLR4_1_2xnxxnxl3lqxv8m.R.globalSliceStart(getClass().getName(),43861);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2jr7xi1xud();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2xnxxnxl3lqxv8m.R.rethrow($CLV_t2$);}finally{__CLR4_1_2xnxxnxl3lqxv8m.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDateParserTest.testLowYearPadding",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),43861,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2jr7xi1xud() throws ParseException{try{__CLR4_1_2xnxxnxl3lqxv8m.R.inc(43861);
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43862);final DateParser parser = getInstance(YMD_SLASH);
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43863);final Calendar cal = Calendar.getInstance();
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43864);cal.clear();

        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43865);cal.set(1,0,1);
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43866);assertEquals(cal.getTime(), parser.parse("0001/01/01"));
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43867);cal.set(10,0,1);
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43868);assertEquals(cal.getTime(), parser.parse("0010/01/01"));
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43869);cal.set(100,0,1);
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43870);assertEquals(cal.getTime(), parser.parse("0100/01/01"));
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43871);cal.set(999,0,1);
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43872);assertEquals(cal.getTime(), parser.parse("0999/01/01"));
    }finally{__CLR4_1_2xnxxnxl3lqxv8m.R.flushNeeded();}}

    /**
     * @throws ParseException
     */
    @Test
    public void testMilleniumBug() throws ParseException {__CLR4_1_2xnxxnxl3lqxv8m.R.globalSliceStart(getClass().getName(),43873);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2rn0vxtxup();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2xnxxnxl3lqxv8m.R.rethrow($CLV_t2$);}finally{__CLR4_1_2xnxxnxl3lqxv8m.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDateParserTest.testMilleniumBug",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),43873,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2rn0vxtxup() throws ParseException{try{__CLR4_1_2xnxxnxl3lqxv8m.R.inc(43873);
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43874);final DateParser parser = getInstance(DMY_DOT);
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43875);final Calendar cal = Calendar.getInstance();
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43876);cal.clear();

        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43877);cal.set(1000,0,1);
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43878);assertEquals(cal.getTime(), parser.parse("01.01.1000"));
    }finally{__CLR4_1_2xnxxnxl3lqxv8m.R.flushNeeded();}}

    @Test
    public void testLang303() throws ParseException {__CLR4_1_2xnxxnxl3lqxv8m.R.globalSliceStart(getClass().getName(),43879);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_26ep1elxuv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2xnxxnxl3lqxv8m.R.rethrow($CLV_t2$);}finally{__CLR4_1_2xnxxnxl3lqxv8m.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDateParserTest.testLang303",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),43879,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_26ep1elxuv() throws ParseException{try{__CLR4_1_2xnxxnxl3lqxv8m.R.inc(43879);
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43880);DateParser parser = getInstance(YMD_SLASH);
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43881);final Calendar cal = Calendar.getInstance();
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43882);cal.set(2004, 11, 31);

        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43883);final Date date = parser.parse("2004/11/31");

        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43884);parser = SerializationUtils.deserialize(SerializationUtils.serialize((Serializable) parser));
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43885);assertEquals(date, parser.parse("2004/11/31"));
    }finally{__CLR4_1_2xnxxnxl3lqxv8m.R.flushNeeded();}}

    @Test
    public void testLang538() throws ParseException {__CLR4_1_2xnxxnxl3lqxv8m.R.globalSliceStart(getClass().getName(),43886);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2yinwovxv2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2xnxxnxl3lqxv8m.R.rethrow($CLV_t2$);}finally{__CLR4_1_2xnxxnxl3lqxv8m.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDateParserTest.testLang538",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),43886,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2yinwovxv2() throws ParseException{try{__CLR4_1_2xnxxnxl3lqxv8m.R.inc(43886);
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43887);final DateParser parser = getInstance("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", GMT);

        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43888);final Calendar cal = Calendar.getInstance(TimeZone.getTimeZone("GMT-8"));
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43889);cal.clear();
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43890);cal.set(2009, 9, 16, 8, 42, 16);

        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43891);assertEquals(cal.getTime(), parser.parse("2009-10-16T16:42:16.000Z"));
    }finally{__CLR4_1_2xnxxnxl3lqxv8m.R.flushNeeded();}}

    @Test
    public void testEquals() {__CLR4_1_2xnxxnxl3lqxv8m.R.globalSliceStart(getClass().getName(),43892);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2s4e608xv8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2xnxxnxl3lqxv8m.R.rethrow($CLV_t2$);}finally{__CLR4_1_2xnxxnxl3lqxv8m.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDateParserTest.testEquals",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),43892,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2s4e608xv8(){try{__CLR4_1_2xnxxnxl3lqxv8m.R.inc(43892);
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43893);final DateParser parser1= getInstance(YMD_SLASH);
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43894);final DateParser parser2= getInstance(YMD_SLASH);

        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43895);assertEquals(parser1, parser2);
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43896);assertEquals(parser1.hashCode(), parser2.hashCode());

        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43897);assertFalse(parser1.equals(new Object()));
    }finally{__CLR4_1_2xnxxnxl3lqxv8m.R.flushNeeded();}}

    @Test
    public void testToStringContainsName() {__CLR4_1_2xnxxnxl3lqxv8m.R.globalSliceStart(getClass().getName(),43898);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2tx5bkfxve();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2xnxxnxl3lqxv8m.R.rethrow($CLV_t2$);}finally{__CLR4_1_2xnxxnxl3lqxv8m.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDateParserTest.testToStringContainsName",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),43898,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2tx5bkfxve(){try{__CLR4_1_2xnxxnxl3lqxv8m.R.inc(43898);
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43899);final DateParser parser= getInstance(YMD_SLASH);
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43900);assertTrue(parser.toString().startsWith("FastDate"));
    }finally{__CLR4_1_2xnxxnxl3lqxv8m.R.flushNeeded();}}

    @Test
    public void testPatternMatches() {__CLR4_1_2xnxxnxl3lqxv8m.R.globalSliceStart(getClass().getName(),43901);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2na8f50xvh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2xnxxnxl3lqxv8m.R.rethrow($CLV_t2$);}finally{__CLR4_1_2xnxxnxl3lqxv8m.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDateParserTest.testPatternMatches",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),43901,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2na8f50xvh(){try{__CLR4_1_2xnxxnxl3lqxv8m.R.inc(43901);
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43902);final DateParser parser= getInstance(yMdHmsSZ);
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43903);assertEquals(yMdHmsSZ, parser.getPattern());
    }finally{__CLR4_1_2xnxxnxl3lqxv8m.R.flushNeeded();}}

    @Test
    public void testLocaleMatches() {__CLR4_1_2xnxxnxl3lqxv8m.R.globalSliceStart(getClass().getName(),43904);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2pxtz0yxvk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2xnxxnxl3lqxv8m.R.rethrow($CLV_t2$);}finally{__CLR4_1_2xnxxnxl3lqxv8m.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDateParserTest.testLocaleMatches",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),43904,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2pxtz0yxvk(){try{__CLR4_1_2xnxxnxl3lqxv8m.R.inc(43904);
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43905);final DateParser parser= getInstance(yMdHmsSZ, SWEDEN);
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43906);assertEquals(SWEDEN, parser.getLocale());
    }finally{__CLR4_1_2xnxxnxl3lqxv8m.R.flushNeeded();}}

    @Test
    public void testTimeZoneMatches() {__CLR4_1_2xnxxnxl3lqxv8m.R.globalSliceStart(getClass().getName(),43907);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_2qy3lf3xvn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_2xnxxnxl3lqxv8m.R.rethrow($CLV_t2$);}finally{__CLR4_1_2xnxxnxl3lqxv8m.R.globalSliceEnd(getClass().getName(),"org.apache.commons.lang3.time.FastDateParserTest.testTimeZoneMatches",__CLR4_1_2_TEST_NAME_SNIFFER.getTestName(),43907,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_2qy3lf3xvn(){try{__CLR4_1_2xnxxnxl3lqxv8m.R.inc(43907);
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43908);final DateParser parser= getInstance(yMdHmsSZ, REYKJAVIK);
        __CLR4_1_2xnxxnxl3lqxv8m.R.inc(43909);assertEquals(REYKJAVIK, parser.getTimeZone());
    }finally{__CLR4_1_2xnxxnxl3lqxv8m.R.flushNeeded();}}
}
