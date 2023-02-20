/*
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
public class FastDateParserTest {
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

    DateParser getInstance(final String format) {
        return getInstance(format, TimeZone.getDefault(), Locale.getDefault());
    }

    private DateParser getDateInstance(final int dateStyle, final Locale locale) {
        return getInstance(FormatCache.getPatternForStyle(Integer.valueOf(dateStyle), null, locale), TimeZone.getDefault(), Locale.getDefault());
    }

    private DateParser getInstance(final String format, final Locale locale) {
        return getInstance(format, TimeZone.getDefault(), locale);
    }

    private DateParser getInstance(final String format, final TimeZone timeZone) {
        return getInstance(format, timeZone, Locale.getDefault());
    }

    /**
     * Override this method in derived tests to change the construction of instances
     */
    protected DateParser getInstance(final String format, final TimeZone timeZone, final Locale locale) {
        return new FastDateParser(format, timeZone, locale);
    }

@Test
public void testFormatPeriodISO18() { 
     final TimeZone timeZone = TimeZone.getTimeZone("GMT-3"); 
     final Calendar base = Calendar.getInstance(timeZone); 
     base.set(1970, 0, 1, 0, 0, 0); 
     base.set(Calendar.MILLISECOND, 0); 
     final Calendar cal = Calendar.getInstance(timeZone); 
     cal.set(2002, 1, 23, 9, 11, 12); 
     cal.set(Calendar.MILLISECOND, 1); 
     String text; 
     text = DateFormatUtils.ISO_DATETIME_TIME_ZONE_FORMAT.format(cal); 
     assertEquals("2002-02-23T09:11:12-03:00", text); 
     text = DurationFormatUtils.formatPeriod(base.getTime().getTime(), cal.getTime().getTime(), DurationFormatUtils.ISO_EXTENDED_FORMAT_PATTERN, false, timeZone); 
     assertEquals("P32Y1M22DT9H11M12.001S", text); 
     cal.set(1971, 1, 3, 10, 30, 0); 
     cal.set(Calendar.MILLISECOND, 0); 
     text = DurationFormatUtils.formatPeriod(base.getTime().getTime(), cal.getTime().getTime(), DurationFormatUtils.ISO_EXTENDED_FORMAT_PATTERN, false, timeZone); 
     assertEquals("P1Y1M2DT10H30M0.000S", text); 
 }
@Test
public void testSpecialCharacters47() throws Exception { 
     testSdfAndFdp("q", "", true); 
     testSdfAndFdp("Q", "", true); 
     testSdfAndFdp("$", "$", false); 
     testSdfAndFdp("?.d", "?.12", false); 
     testSdfAndFdp("''yyyyMMdd'A''B'HHmmssSSS''", "'20030210A'B153320989'", false); 
     testSdfAndFdp("''''yyyyMMdd'A''B'HHmmssSSS''", "''20030210A'B153320989'", false); 
     testSdfAndFdp("'$\\Ed'", "$\\Ed", false); 
 }
@Test
public void testParseLongShort87() throws ParseException { 
     final Calendar cal = Calendar.getInstance(NEW_YORK, Locale.US); 
     cal.clear(); 
     cal.set(2003, 1, 10, 15, 33, 20); 
     cal.set(Calendar.MILLISECOND, 989); 
     cal.setTimeZone(NEW_YORK); 
     DateParser fdf = getInstance("yyyy GGGG MMMM dddd aaaa EEEE HHHH mmmm ssss SSSS ZZZZ", NEW_YORK, Locale.US); 
     assertEquals(cal.getTime(), fdf.parse("2003 AD February 0010 PM Monday 0015 0033 0020 0989 GMT-05:00")); 
     cal.set(Calendar.ERA, GregorianCalendar.BC); 
     final Date parse = fdf.parse("2003 BC February 0010 PM Saturday 0015 0033 0020 0989 GMT-05:00"); 
     assertEquals(cal.getTime(), parse); 
     fdf = getInstance("y G M d a E H m s S Z", NEW_YORK, Locale.US); 
     assertEquals(cal.getTime(), fdf.parse("03 BC 2 10 PM Sat 15 33 20 989 -0500")); 
     cal.set(Calendar.ERA, GregorianCalendar.AD); 
     assertEquals(cal.getTime(), fdf.parse("03 AD 2 10 PM Saturday 15 33 20 989 -0500")); 
 }
@Test
public void testLocaleMatches142() { 
     final DateParser parser = getInstance(yMdHmsSZ, SWEDEN); 
     assertEquals(SWEDEN, parser.getLocale()); 
 }
@Test
public void testDayOf143() throws ParseException { 
     final Calendar cal = Calendar.getInstance(NEW_YORK, Locale.US); 
     cal.clear(); 
     cal.set(2003, 1, 10); 
     final DateParser fdf = getInstance("W w F D y", NEW_YORK, Locale.US); 
     assertEquals(cal.getTime(), fdf.parse("3 7 2 41 03")); 
 }
@Test
public void testLANG_831200() throws Exception { 
     testSdfAndFdp("M E", "3  Tue", true); 
 }
@Test
public void test_LocaleMatches201() { 
     final DateParser parser = getInstance(yMdHmsSZ, SWEDEN); 
     assertEquals(SWEDEN, parser.getLocale()); 
 }
@Test
public void test_formatPeriodISO203() { 
     final TimeZone timeZone = TimeZone.getTimeZone("GMT-3"); 
     final Calendar base = Calendar.getInstance(timeZone); 
     base.set(1970, 0, 1, 0, 0, 0); 
     base.set(Calendar.MILLISECOND, 0); 
     final Calendar cal = Calendar.getInstance(timeZone); 
     cal.set(2002, 1, 23, 9, 11, 12); 
     cal.set(Calendar.MILLISECOND, 1); 
     String text; 
     text = DateFormatUtils.ISO_DATETIME_TIME_ZONE_FORMAT.format(cal); 
     assertEquals("2002-02-23T09:11:12-03:00", text); 
     text = DurationFormatUtils.formatPeriod(base.getTime().getTime(), cal.getTime().getTime(), DurationFormatUtils.ISO_EXTENDED_FORMAT_PATTERN, false, timeZone); 
     assertEquals("P32Y1M22DT9H11M12.001S", text); 
     cal.set(1971, 1, 3, 10, 30, 0); 
     cal.set(Calendar.MILLISECOND, 0); 
     text = DurationFormatUtils.formatPeriod(base.getTime().getTime(), cal.getTime().getTime(), DurationFormatUtils.ISO_EXTENDED_FORMAT_PATTERN, false, timeZone); 
     assertEquals("P1Y1M2DT10H30M0.000S", text); 
 }
@Test
public void testBasicQuotedTrimmed1204() throws Exception { 
     final Calendar cal = Calendar.getInstance(NEW_YORK, Locale.US); 
     cal.clear(); 
     cal.set(2003, 1, 10, 15, 33, 20); 
     cal.set(Calendar.MILLISECOND, 989); 
     cal.setTimeZone(NEW_YORK); 
     DateParser fdf = getInstance("yyyy GGGG MMMM dddd aaaa EEEE HHHH mmmm ssss SSSS ZZZZ", NEW_YORK, Locale.US); 
     assertEquals(cal.getTime(), fdf.parse("2003 AD February 0010 PM Monday 0015 0033 0020 0989 GMT-05:00")); 
     cal.set(Calendar.ERA, GregorianCalendar.BC); 
     final Date parse = fdf.parse("2003 BC February 0010 PM Saturday 0015 0033 0020 0989 GMT-05:00"); 
     assertEquals(cal.getTime(), parse); 
     fdf = getInstance("y G M d a E H m s S Z", NEW_YORK, Locale.US); 
     assertEquals(cal.getTime(), fdf.parse("03 BC 2 10 PM Sat 15 33 20 989 -0500")); 
     cal.set(Calendar.ERA, GregorianCalendar.AD); 
     assertEquals(cal.getTime(), fdf.parse("03 AD 2 10 PM Saturday 15 33 20 989 -0500")); 
 }
@Test
public void testTimeDefaults206() { 
     assertEquals(FastDateFormat.getTimeInstance(FastDateFormat.LONG, Locale.CANADA), FastDateFormat.getTimeInstance(FastDateFormat.LONG, TimeZone.getDefault(), Locale.CANADA)); 
     assertEquals(FastDateFormat.getTimeInstance(FastDateFormat.LONG, TimeZone.getTimeZone("America/New_York")), FastDateFormat.getTimeInstance(FastDateFormat.LONG, TimeZone.getTimeZone("America/New_York"), Locale.getDefault())); 
     assertEquals(FastDateFormat.getTimeInstance(FastDateFormat.LONG), FastDateFormat.getTimeInstance(FastDateFormat.LONG, TimeZone.getDefault(), Locale.getDefault())); 
 }
    

    
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

    

    

    

    

    

    

    

    

    

    

    

    private void testLocales(final String format, final boolean eraBC) throws Exception {

        final Calendar cal= Calendar.getInstance(GMT);
        cal.clear();
        cal.set(2003, 1, 10);
        if (eraBC) {
            cal.set(Calendar.ERA, GregorianCalendar.BC);
        }
        for(final Locale locale : Locale.getAvailableLocales()) {
            // ja_JP_JP cannot handle dates before 1868 properly
            if (eraBC && locale.equals(FastDateParser.JAPANESE_IMPERIAL)) {
                continue;
            }
            final SimpleDateFormat sdf = new SimpleDateFormat(format, locale);
            final DateParser fdf = getInstance(format, locale);

            try {
                checkParse(locale, cal, sdf, fdf);
            } catch(final ParseException ex) {
                Assert.fail("Locale "+locale+ " failed with "+format+" era "+(eraBC?"BC":"AD")+"\n" + trimMessage(ex.toString()));
            }
        }
    }

    private String trimMessage(final String msg) {
        if (msg.length() < 100) {
            return msg;
        }
        final int gmt = msg.indexOf("(GMT");
        if (gmt > 0) {
            return msg.substring(0, gmt+4)+"...)";
        }
        return msg.substring(0, 100)+"...";
    }

    private void checkParse(final Locale locale, final Calendar cal, final SimpleDateFormat sdf, final DateParser fdf) throws ParseException {
        final String formattedDate= sdf.format(cal.getTime());
        final Date expectedTime = sdf.parse(formattedDate);
        final Date actualTime = fdf.parse(formattedDate);
        assertEquals(locale.toString()+" "+formattedDate
                +"\n",expectedTime, actualTime);
    }

    

    

    

    

    

    private void testSdfAndFdp(final String format, final String date, final boolean shouldFail)
            throws Exception {
        final boolean debug = false;
        Date dfdp = null;
        Date dsdf = null;
        Throwable f = null;
        Throwable s = null;

        try {
            final SimpleDateFormat sdf = new SimpleDateFormat(format, Locale.US);
            sdf.setTimeZone(NEW_YORK);
            dsdf = sdf.parse(date);
            if (shouldFail) {
                Assert.fail("Expected SDF failure, but got " + dsdf + " for ["+format+","+date+"]");
            }
        } catch (final Exception e) {
            s = e;
            if (!shouldFail) {
                throw e;
            }
            if (debug) {
                System.out.println("sdf:"+format+"/"+date+"=>"+e);
            }
        }

        try {
            final DateParser fdp = getInstance(format, NEW_YORK, Locale.US);
            dfdp = fdp.parse(date);
            if (shouldFail) {
                Assert.fail("Expected FDF failure, but got " + dfdp + " for ["+format+","+date+"] using "+((FastDateParser)fdp).getParsePattern());
            }
        } catch (final Exception e) {
            f = e;
            if (!shouldFail) {
                throw e;
            }
            if (debug) {
                System.out.println("fdf:"+format+"/"+date+"=>"+e);
            }
        }
        // SDF and FDF should produce equivalent results
        assertTrue("Should both or neither throw Exceptions", (f==null)==(s==null));
        assertEquals("Parsed dates should be equal", dsdf, dfdp);
        if (debug) {
            System.out.println(format + "," + date + " => " + dsdf);
        }
    }

    

    /**
     * Test case for {@link FastDateParser#FastDateParser(String, TimeZone, Locale)}.
     * @throws ParseException
     */
    

    /**
     * Tests that pre-1000AD years get padded with yyyy
     * @throws ParseException
     */
    

    /**
     * @throws ParseException
     */
    

    

    

    

    

    

    

    
}
