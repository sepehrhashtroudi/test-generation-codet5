/*
 *  Copyright 2001-2006 Stephen Colebourne
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.joda.time.format;

import java.util.Locale;
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

/**
 * This class is a Junit unit test for ISODateTimeFormat parsing.
 *
 * @author Stephen Colebourne
 */
public class TestISODateTimeFormatParsing extends TestCase {

    private DateTimeZone originalDateTimeZone = null;
    private TimeZone originalTimeZone = null;
    private Locale originalLocale = null;

    public static void main(String[] args) {
        junit.textui.TestRunner.run(suite());
    }

    public static TestSuite suite() {
        return new TestSuite(TestISODateTimeFormatParsing.class);
    }

    public TestISODateTimeFormatParsing(String name) {
        super(name);
    }

    protected void setUp() throws Exception {
        originalDateTimeZone = DateTimeZone.getDefault();
        originalTimeZone = TimeZone.getDefault();
        originalLocale = Locale.getDefault();
        DateTimeZone.setDefault(DateTimeZone.forID("Europe/London"));
        TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        Locale.setDefault(Locale.UK);
    }

    protected void tearDown() throws Exception {
        DateTimeZone.setDefault(originalDateTimeZone);
        TimeZone.setDefault(originalTimeZone);
        Locale.setDefault(originalLocale);
        originalDateTimeZone = null;
        originalTimeZone = null;
        originalLocale = null;
    }

    //-----------------------------------------------------------------------

public void test_basicTimeNoMillis80() { 
     DateTimeZone.setDefault(DateTimeZone.UTC); 
     DateTimeFormatter parser = ISODateTimeFormat.basicTimeNoMillis(); 
     assertParse(parser, "102030Z", new DateTime(1970, 1, 1, 10, 20, 30, 0)); 
     assertParse(parser, false, "10203Z"); 
     assertParse(parser, false, "1020Z"); 
     assertParse(parser, false, "102Z"); 
     assertParse(parser, false, "10Z"); 
     assertParse(parser, false, "1Z"); 
 } 


public void test_basicWeekDateTime123() { 
     DateTimeZone.setDefault(DateTimeZone.UTC); 
     DateTimeFormatter parser = ISODateTimeFormat.basicWeekDateTime(); 
     assertParse(parser, "2006W273T102030.400999999Z", new DateTime(2006, 6, 1, 10, 20, 30, 400).withWeekOfWeekyear(27).withDayOfWeek(3)); 
     assertParse(parser, "2006W273T102030.400Z", new DateTime(2006, 6, 1, 10, 20, 30, 400).withWeekOfWeekyear(27).withDayOfWeek(3)); 
     assertParse(parser, "2006W273T102030.40Z", new DateTime(2006, 6, 1, 10, 20, 30, 400).withWeekOfWeekyear(27).withDayOfWeek(3)); 
     assertParse(parser, "2006W273T102030.4Z", new DateTime(2006, 6, 1, 10, 20, 30, 400).withWeekOfWeekyear(27).withDayOfWeek(3)); 
     assertParse(parser, false, "2006W27T102030.400Z"); 
     assertParse(parser, false, "2006W2T102030.400Z"); 
     assertParse(parser, false, "2006W273T10203.400Z"); 
     assertParse(parser, false, "2006W273T1020.400Z"); 
     assertParse(parser, false, "2006W273T102.400Z"); 
     assertParse(parser, false, "2006W273T10.400Z"); 
     assertParse(parser, false, "2006W273T1.400Z"); 
 } 


public void test_dateTimeNoMillis161() { 
     DateTimeZone.setDefault(DateTimeZone.UTC); 
     DateTimeFormatter parser = ISODateTimeFormat.dateTimeNoMillis(); 
     assertParse(parser, "2006-02-04T10:20:30Z", new DateTime(2006, 2, 4, 10, 20, 30, 0)); 
     assertParse(parser, "2006-02-4T10:20:30Z", new DateTime(2006, 2, 4, 10, 20, 30, 0)); 
     assertParse(parser, "2006-2-04T10:20:30Z", new DateTime(2006, 2, 4, 10, 20, 30, 0)); 
     assertParse(parser, "2006-2-4T10:20:30Z", new DateTime(2006, 2, 4, 10, 20, 30, 0)); 
     assertParse(parser, "2006-02-04T5:6:7Z", new DateTime(2006, 2, 4, 5, 6, 7, 0)); 
     assertParse(parser, false, "2006-02-T10:20:30Z"); 
     assertParse(parser, false, "2006-12T10:20:30Z"); 
     assertParse(parser, false, "2006-1T10:20:30Z"); 
     assertParse(parser, false, "2006T10:20:30Z"); 
     assertParse(parser, false, "200T10:20:30Z"); 
     assertParse(parser, false, "20T10:20:30Z"); 
     assertParse(parser, false, "2T10:20:30Z"); 
     assertParse(parser, false, "2006-02-04T10:20Z"); 
     assertParse(parser, false, "2006-02-04T10:2Z"); 
     assertParse(parser, false, "2006-02-04T10Z"); 
     assertParse(parser, false, "2006-02-04T1Z"); 
 } 


public void test_weekDateTime447() { 
     DateTimeZone.setDefault(DateTimeZone.UTC); 
     DateTimeFormatter parser = ISODateTimeFormat.weekDateTime(); 
     assertParse(parser, "2006-W27-3T10:20:30.400999999Z", new DateTime(2006, 6, 1, 10, 20, 30, 400).withWeekOfWeekyear(27).withDayOfWeek(3)); 
     assertParse(parser, "2006-W27-3T10:20:30.400Z", new DateTime(2006, 6, 1, 10, 20, 30, 400).withWeekOfWeekyear(27).withDayOfWeek(3)); 
     assertParse(parser, "2006-W27-3T10:20:30.40Z", new DateTime(2006, 6, 1, 10, 20, 30, 400).withWeekOfWeekyear(27).withDayOfWeek(3)); 
     assertParse(parser, "2006-W27-3T10:20:30.4Z", new DateTime(2006, 6, 1, 10, 20, 30, 400).withWeekOfWeekyear(27).withDayOfWeek(3)); 
     assertParse(parser, "2006-W2-3T10:20:30.400Z", new DateTime(2006, 6, 1, 10, 20, 30, 400).withWeekOfWeekyear(2).withDayOfWeek(3)); 
     assertParse(parser, "2006-W27-3T5:6:7.800Z", new DateTime(2006, 6, 1, 5, 6, 7, 800).withWeekOfWeekyear(27).withDayOfWeek(3)); 
     assertParse(parser, false, "2006-W27-T10:20:30.400Z"); 
     assertParse(parser, false, "2006-W27T10:20:30.400Z"); 
     assertParse(parser, false, "2006-W2T10:20:30.400Z"); 
     assertParse(parser, false, "2006-W-3T10:20:30.400Z"); 
     assertParse(parser, false, "2006-W27-3T10:20.400Z"); 
     assertParse(parser, false, "2006-W27-3T10:2.400Z"); 
     assertParse(parser, false, "2006-W27-3T10.400Z"); 
     assertParse(parser, false, "2006-W27-3T1.400Z"); 
 } 


public void test_timeElementParser613() { 
     DateTimeFormatter parser = ISODateTimeFormat.timeElementParser(); 
     assertParse(parser, false, "2006-06-09"); 
     assertParse(parser, false, "2006-W27-3"); 
     assertParse(parser, false, "2006-123"); 
     assertParse(parser, false, "2006-06-09T+02:00"); 
     assertParse(parser, false, "2006-W27-3T+02:00"); 
     assertParse(parser, false, "2006-123T+02:00"); 
     assertParse(parser, false, "2006-06-09T10:20:30.040"); 
     assertParse(parser, false, "2006-W27-3T10:20:30.040"); 
     assertParse(parser, false, "2006-123T10:20:30.040"); 
     assertParse(parser, false, "2006-06-09T10:20:30.040+02:00"); 
     assertParse(parser, false, "2006-W27-3T10:20:30.040+02:00"); 
     assertParse(parser, false, "2006-123T10:20:30.040+02:00"); 
     assertParse(parser, false, "T10:20:30.040"); 
     assertParse(parser, false, "T10.5"); 
     assertParse(parser, false, "T10:20:30.040+02:00"); 
     assertParse(parser, false, "T10.5+02:00"); 
     assertParse(parser, true, "10:20:30.040"); 
     assertParse(parser, true, "10.5"); 
     assertParse(parser, false, "10:20:30.040+02:00"); 
     assertParse(parser, false, "10.5+02:00"); 
     assertParse(parser, true, "00:00:10.512345678"); 
     assertEquals(10512, parser.parseMillis("00:00:10.512345678") + DateTimeZone.getDefault().getOffset(0L)); 
 } 


public void test_basicDateTime712() { 
     DateTimeZone.setDefault(DateTimeZone.UTC); 
     DateTimeFormatter parser = ISODateTimeFormat.basicDateTime(); 
     assertParse(parser, "20061204T102030.400999999Z", new DateTime(2006, 12, 4, 10, 20, 30, 400)); 
     assertParse(parser, "20061204T102030.400Z", new DateTime(2006, 12, 4, 10, 20, 30, 400)); 
     assertParse(parser, "20061204T102030.40Z", new DateTime(2006, 12, 4, 10, 20, 30, 400)); 
     assertParse(parser, "20061204T102030.4Z", new DateTime(2006, 12, 4, 10, 20, 30, 400)); 
     assertParse(parser, false, "2006120T102030.400Z"); 
     assertParse(parser, false, "200612T102030.400Z"); 
     assertParse(parser, false, "20061T102030.400Z"); 
     assertParse(parser, false, "2006T102030.400Z"); 
     assertParse(parser, false, "200T102030.400Z"); 
     assertParse(parser, false, "20T102030.400Z"); 
     assertParse(parser, false, "2T102030.400Z"); 
     assertParse(parser, false, "20061204T10203.400Z"); 
     assertParse(parser, false, "20061204T1020.400Z"); 
     assertParse(parser, false, "20061204T102.400Z"); 
     assertParse(parser, false, "20061204T10.400Z"); 
     assertParse(parser, false, "20061204T1.400Z"); 
 } 


public void test_basicOrdinalDateTime733() { 
     DateTimeZone.setDefault(DateTimeZone.UTC); 
     DateTimeFormatter parser = ISODateTimeFormat.basicOrdinalDateTime(); 
     assertParse(parser, "2006123T102030.400999999Z", new DateTime(2006, 1, 1, 10, 20, 30, 400).withDayOfYear(123)); 
     assertParse(parser, "2006123T102030.400Z", new DateTime(2006, 1, 1, 10, 20, 30, 400).withDayOfYear(123)); 
     assertParse(parser, "2006123T102030.40Z", new DateTime(2006, 1, 1, 10, 20, 30, 400).withDayOfYear(123)); 
     assertParse(parser, "2006123T102030.4Z", new DateTime(2006, 1, 1, 10, 20, 30, 400).withDayOfYear(123)); 
     assertParse(parser, false, "200612T102030.400Z"); 
     assertParse(parser, false, "20061T102030.400Z"); 
     assertParse(parser, false, "2006T102030.400Z"); 
     assertParse(parser, false, "200T102030.400Z"); 
     assertParse(parser, false, "20T102030.400Z"); 
     assertParse(parser, false, "2T102030.400Z"); 
     assertParse(parser, false, "2006123T10203.400Z"); 
     assertParse(parser, false, "2006123T1020.400Z"); 
     assertParse(parser, false, "2006123T102.400Z"); 
     assertParse(parser, false, "2006123T10.400Z"); 
     assertParse(parser, false, "2006123T1.400Z"); 
 } 


public void test_ordinalDateTimeNoMillis754() { 
     DateTimeZone.setDefault(DateTimeZone.UTC); 
     DateTimeFormatter parser = ISODateTimeFormat.ordinalDateTimeNoMillis(); 
     assertParse(parser, "2006-123T10:20:30Z", new DateTime(2006, 1, 1, 10, 20, 30, 0).withDayOfYear(123)); 
     assertParse(parser, "2006-12T10:20:30Z", new DateTime(2006, 1, 1, 10, 20, 30, 0).withDayOfYear(12)); 
     assertParse(parser, "2006-1T10:20:30Z", new DateTime(2006, 1, 1, 10, 20, 30, 0).withDayOfYear(1)); 
     assertParse(parser, "2006-123T5:6:7Z", new DateTime(2006, 1, 1, 5, 6, 7, 0).withDayOfYear(123)); 
     assertParse(parser, false, "2006-T10:20:30Z"); 
     assertParse(parser, false, "2006T10:20:30Z"); 
     assertParse(parser, false, "2006-123T10:20Z"); 
     assertParse(parser, false, "2006-123T10:2Z"); 
     assertParse(parser, false, "2006-123T10Z"); 
     assertParse(parser, false, "2006-123T1Z"); 
 } 


public void test_basicTTimeNoMillis791() { 
     DateTimeZone.setDefault(DateTimeZone.UTC); 
     DateTimeFormatter parser = ISODateTimeFormat.basicTTimeNoMillis(); 
     assertParse(parser, "T102030Z", new DateTime(1970, 1, 1, 10, 20, 30, 0)); 
     assertParse(parser, false, "T10203Z"); 
     assertParse(parser, false, "T1020Z"); 
     assertParse(parser, false, "T102Z"); 
     assertParse(parser, false, "T10Z"); 
     assertParse(parser, false, "T1Z"); 
 } 


public void test_dateElementParser856() { 
     DateTimeFormatter parser = ISODateTimeFormat.dateElementParser(); 
     assertParse(parser, "2006-06-09", new DateTime(2006, 6, 9, 0, 0, 0, 0)); 
     assertParse(parser, "2006-06-9", new DateTime(2006, 6, 9, 0, 0, 0, 0)); 
     assertParse(parser, "2006-6-09", new DateTime(2006, 6, 9, 0, 0, 0, 0)); 
     assertParse(parser, "2006-6-9", new DateTime(2006, 6, 9, 0, 0, 0, 0)); 
     assertParse(parser, true, "2006-W27-3"); 
     assertParse(parser, true, "2006-123"); 
     assertParse(parser, false, "2006-06-09T+02:00"); 
     assertParse(parser, false, "2006-W27-3T+02:00"); 
     assertParse(parser, false, "2006-123T+02:00"); 
     assertParse(parser, false, "2006-06-09T10:20:30.040"); 
     assertParse(parser, false, "2006-W27-3T10:20:30.040"); 
     assertParse(parser, false, "2006-123T10:20:30.040"); 
     assertParse(parser, false, "2006-06-09T10:20:30.040+02:00"); 
     assertParse(parser, false, "2006-W27-3T10:20:30.040+02:00"); 
     assertParse(parser, false, "2006-123T10:20:30.040+02:00"); 
     assertParse(parser, false, "T10:20:30.040"); 
     assertParse(parser, false, "T10.5"); 
     assertParse(parser, false, "T10:20:30.040+02:00"); 
     assertParse(parser, false, "T10.5+02:00"); 
     assertParse(parser, false, "10:20:30.040"); 
     assertParse(parser, false, "10.5"); 
     assertParse(parser, false, "10:20:30.040+02:00"); 
     assertParse(parser, false, "10.5+02:00"); 
 } 


public void test_ordinalDate863() { 
     DateTimeFormatter parser = ISODateTimeFormat.ordinalDate(); 
     assertParse(parser, "2006-123", new DateTime(2006, 1, 1, 0, 0, 0, 0).withDayOfYear(123)); 
     assertParse(parser, "2006-12", new DateTime(2006, 1, 1, 0, 0, 0, 0).withDayOfYear(12)); 
     assertParse(parser, "2006-1", new DateTime(2006, 1, 1, 0, 0, 0, 0).withDayOfYear(1)); 
     assertParse(parser, false, "2006-"); 
     assertParse(parser, false, "2006"); 
 } 


public void test_basicOrdinalDate901() { 
     DateTimeFormatter parser = ISODateTimeFormat.basicOrdinalDate(); 
     assertParse(parser, "2006123", new DateTime(2006, 1, 1, 0, 0, 0, 0).withDayOfYear(123)); 
     assertParse(parser, false, "200612"); 
     assertParse(parser, false, "20061"); 
     assertParse(parser, false, "2006"); 
 } 


public void test_dateTimeParser920() { 
     DateTimeFormatter parser = ISODateTimeFormat.dateTimeParser(); 
     assertParse(parser, true, "2006-06-09"); 
     assertParse(parser, true, "2006-W27-3"); 
     assertParse(parser, true, "2006-123"); 
     assertParse(parser, true, "2006-06-09T+02:00"); 
     assertParse(parser, true, "2006-W27-3T+02:00"); 
     assertParse(parser, true, "2006-123T+02:00"); 
     assertParse(parser, true, "2006-06-09T10:20:30.040"); 
     assertParse(parser, true, "2006-W27-3T10:20:30.040"); 
     assertParse(parser, true, "2006-123T10:20:30.040"); 
     assertParse(parser, true, "2006-06-09T10:20:30.040+02:00"); 
     assertParse(parser, true, "2006-W27-3T10:20:30.040+02:00"); 
     assertParse(parser, true, "2006-123T10:20:30.040+02:00"); 
     assertParse(parser, true, "T10:20:30.040"); 
     assertParse(parser, true, "T10.5"); 
     assertParse(parser, true, "T10:20:30.040+02:00"); 
     assertParse(parser, true, "T10.5+02:00"); 
     assertParse(parser, false, "10:20:30.040"); 
     assertParse(parser, false, "10.5"); 
     assertParse(parser, false, "10:20:30.040+02:00"); 
     assertParse(parser, false, "10.5+02:00"); 
 } 


public void test_tTime945() { 
     DateTimeZone.setDefault(DateTimeZone.UTC); 
     DateTimeFormatter parser = ISODateTimeFormat.tTime(); 
     assertParse(parser, "T10:20:30.400999999Z", new DateTime(1970, 1, 1, 10, 20, 30, 400)); 
     assertParse(parser, "T10:20:30.400Z", new DateTime(1970, 1, 1, 10, 20, 30, 400)); 
     assertParse(parser, "T10:20:30.40Z", new DateTime(1970, 1, 1, 10, 20, 30, 400)); 
     assertParse(parser, "T10:20:30.4Z", new DateTime(1970, 1, 1, 10, 20, 30, 400)); 
     assertParse(parser, "T5:6:7.8Z", new DateTime(1970, 1, 1, 5, 6, 7, 800)); 
     assertParse(parser, false, "T10:20.400Z"); 
     assertParse(parser, false, "T102.400Z"); 
     assertParse(parser, false, "T10.400Z"); 
     assertParse(parser, false, "T1.400Z"); 
 } 


public void test_ordinalDateTime951() { 
     DateTimeZone.setDefault(DateTimeZone.UTC); 
     DateTimeFormatter parser = ISODateTimeFormat.ordinalDateTime(); 
     assertParse(parser, "2006-123T10:20:30.400999999Z", new DateTime(2006, 1, 1, 10, 20, 30, 400).withDayOfYear(123)); 
     assertParse(parser, "2006-123T10:20:30.400Z", new DateTime(2006, 1, 1, 10, 20, 30, 400).withDayOfYear(123)); 
     assertParse(parser, "2006-123T10:20:30.40Z", new DateTime(2006, 1, 1, 10, 20, 30, 400).withDayOfYear(123)); 
     assertParse(parser, "2006-123T10:20:30.4Z", new DateTime(2006, 1, 1, 10, 20, 30, 400).withDayOfYear(123)); 
     assertParse(parser, "2006-12T10:20:30.400Z", new DateTime(2006, 1, 1, 10, 20, 30, 400).withDayOfYear(12)); 
     assertParse(parser, "2006-1T10:20:30.400Z", new DateTime(2006, 1, 1, 10, 20, 30, 400).withDayOfYear(1)); 
     assertParse(parser, "2006-123T5:6:7.800Z", new DateTime(2006, 1, 1, 5, 6, 7, 800).withDayOfYear(123)); 
     assertParse(parser, false, "2006-T10:20:30.400Z"); 
     assertParse(parser, false, "2006T10:20:30.400Z"); 
     assertParse(parser, false, "2006-123T10:20.400Z"); 
     assertParse(parser, false, "2006-123T10:2.400Z"); 
     assertParse(parser, false, "2006-123T10.400Z"); 
     assertParse(parser, false, "2006-123T1.400Z"); 
 } 


public void test_time988() { 
     DateTimeZone.setDefault(DateTimeZone.UTC); 
     DateTimeFormatter parser = ISODateTimeFormat.time(); 
     assertParse(parser, "10:20:30.400999999Z", new DateTime(1970, 1, 1, 10, 20, 30, 400)); 
     assertParse(parser, "10:20:30.400Z", new DateTime(1970, 1, 1, 10, 20, 30, 400)); 
     assertParse(parser, "10:20:30.40Z", new DateTime(1970, 1, 1, 10, 20, 30, 400)); 
     assertParse(parser, "10:20:30.4Z", new DateTime(1970, 1, 1, 10, 20, 30, 400)); 
     assertParse(parser, "5:6:7.8Z", new DateTime(1970, 1, 1, 5, 6, 7, 800)); 
     assertParse(parser, false, "10:20.400Z"); 
     assertParse(parser, false, "10:2.400Z"); 
     assertParse(parser, false, "10.400Z"); 
     assertParse(parser, false, "1.400Z"); 
 } 


public void test_localDateParser1082() { 
     DateTimeFormatter parser = ISODateTimeFormat.localDateParser(); 
     assertEquals(DateTimeZone.UTC, parser.getZone()); 
     assertParse(parser, true, "2006-06-09"); 
     assertParse(parser, true, "2006-W27-3"); 
     assertParse(parser, true, "2006-123"); 
     assertParse(parser, false, "2006-06-09T+02:00"); 
     assertParse(parser, false, "2006-W27-3T+02:00"); 
     assertParse(parser, false, "2006-123T+02:00"); 
     assertParse(parser, false, "2006-06-09T10:20:30.040"); 
     assertParse(parser, false, "2006-W27-3T10:20:30.040"); 
     assertParse(parser, false, "2006-123T10:20:30.040"); 
     assertParse(parser, false, "2006-06-09T10:20:30.040+02:00"); 
     assertParse(parser, false, "2006-W27-3T10:20:30.040+02:00"); 
     assertParse(parser, false, "2006-123T10:20:30.040+02:00"); 
     assertParse(parser, false, "T10:20:30.040"); 
     assertParse(parser, false, "T10.5"); 
     assertParse(parser, false, "T10:20:30.040+02:00"); 
     assertParse(parser, false, "T10.5+02:00"); 
     assertParse(parser, false, "10:20:30.040"); 
     assertParse(parser, false, "10.5"); 
     assertParse(parser, false, "10:20:30.040+02:00"); 
     assertParse(parser, false, "10.5+02:00"); 
 } 


public void test_localTimeParser1118() { 
     DateTimeFormatter parser = ISODateTimeFormat.localTimeParser(); 
     assertEquals(DateTimeZone.UTC, parser.getZone()); 
     assertParse(parser, false, "2006-06-09"); 
     assertParse(parser, false, "2006-W27-3"); 
     assertParse(parser, false, "2006-123"); 
     assertParse(parser, false, "2006-06-09T+02:00"); 
     assertParse(parser, false, "2006-W27-3T+02:00"); 
     assertParse(parser, false, "2006-123T+02:00"); 
     assertParse(parser, false, "2006-06-09T10:20:30.040"); 
     assertParse(parser, false, "2006-W27-3T10:20:30.040"); 
     assertParse(parser, false, "2006-123T10:20:30.040"); 
     assertParse(parser, false, "2006-06-09T10:20:30.040+02:00"); 
     assertParse(parser, false, "2006-W27-3T10:20:30.040+02:00"); 
     assertParse(parser, false, "2006-123T10:20:30.040+02:00"); 
     assertParse(parser, true, "T10:20:30.040"); 
     assertParse(parser, true, "T10.5"); 
     assertParse(parser, false, "T10:20:30.040+02:00"); 
     assertParse(parser, false, "T10.5+02:00"); 
     assertParse(parser, true, "10:20:30.040"); 
     assertParse(parser, true, "10.5"); 
     assertParse(parser, false, "10:20:30.040+02:00"); 
     assertParse(parser, false, "10.5+02:00"); 
     assertParse(parser, true, "00:00:10.512345678"); 
     assertEquals(10512, parser.parseMillis("00:00:10.512345678")); 
 } 


public void test_dateOptionalTimeParser1142() { 
     DateTimeFormatter parser = ISODateTimeFormat.dateOptionalTimeParser(); 
     assertParse(parser, true, "2006-06-09"); 
     assertParse(parser, true, "2006-W27-3"); 
     assertParse(parser, true, "2006-123"); 
     assertParse(parser, true, "2006-06-09T+02:00"); 
     assertParse(parser, true, "2006-W27-3T+02:00"); 
     assertParse(parser, true, "2006-123T+02:00"); 
     assertParse(parser, true, "2006-06-09T10:20:30.040"); 
     assertParse(parser, true, "2006-W27-3T10:20:30.040"); 
     assertParse(parser, true, "2006-123T10:20:30.040"); 
     assertParse(parser, true, "2006-06-09T10:20:30.040+02:00"); 
     assertParse(parser, true, "2006-W27-3T10:20:30.040+02:00"); 
     assertParse(parser, true, "2006-123T10:20:30.040+02:00"); 
     assertParse(parser, false, "T10:20:30.040"); 
     assertParse(parser, false, "T10.5"); 
     assertParse(parser, false, "T10:20:30.040+02:00"); 
     assertParse(parser, false, "T10.5+02:00"); 
     assertParse(parser, false, "10:20:30.040"); 
     assertParse(parser, false, "10.5"); 
     assertParse(parser, false, "10:20:30.040+02:00"); 
     assertParse(parser, false, "10.5+02:00"); 
 } 


public void test_basicTime1184() { 
     DateTimeZone.setDefault(DateTimeZone.UTC); 
     DateTimeFormatter parser = ISODateTimeFormat.basicTime(); 
     assertParse(parser, "102030.400999999Z", new DateTime(1970, 1, 1, 10, 20, 30, 400)); 
     assertParse(parser, "102030.400Z", new DateTime(1970, 1, 1, 10, 20, 30, 400)); 
     assertParse(parser, "102030.40Z", new DateTime(1970, 1, 1, 10, 20, 30, 400)); 
     assertParse(parser, "102030.4Z", new DateTime(1970, 1, 1, 10, 20, 30, 400)); 
     assertParse(parser, false, "10203.400Z"); 
     assertParse(parser, false, "1020.400Z"); 
     assertParse(parser, false, "102.400Z"); 
     assertParse(parser, false, "10.400Z"); 
     assertParse(parser, false, "1.400Z"); 
 } 


public void test_dateTime1316() { 
     DateTimeZone.setDefault(DateTimeZone.UTC); 
     DateTimeFormatter parser = ISODateTimeFormat.dateTime(); 
     assertParse(parser, "2006-02-04T10:20:30.400999999Z", new DateTime(2006, 2, 4, 10, 20, 30, 400)); 
     assertParse(parser, "2006-02-04T10:20:30.400Z", new DateTime(2006, 2, 4, 10, 20, 30, 400)); 
     assertParse(parser, "2006-02-04T10:20:30.40Z", new DateTime(2006, 2, 4, 10, 20, 30, 400)); 
     assertParse(parser, "2006-02-04T10:20:30.4Z", new DateTime(2006, 2, 4, 10, 20, 30, 400)); 
     assertParse(parser, "2006-02-4T10:20:30.400Z", new DateTime(2006, 2, 4, 10, 20, 30, 400)); 
     assertParse(parser, "2006-2-04T10:20:30.400Z", new DateTime(2006, 2, 4, 10, 20, 30, 400)); 
     assertParse(parser, "2006-2-4T10:20:30.400Z", new DateTime(2006, 2, 4, 10, 20, 30, 400)); 
     assertParse(parser, "2006-02-04T5:6:7.800Z", new DateTime(2006, 2, 4, 5, 6, 7, 800)); 
     assertParse(parser, false, "2006-02-T10:20:30.400Z"); 
     assertParse(parser, false, "2006-12T10:20:30.400Z"); 
     assertParse(parser, false, "2006-1T10:20:30.400Z"); 
     assertParse(parser, false, "2006T10:20:30.400Z"); 
     assertParse(parser, false, "200T10:20:30.400Z"); 
     assertParse(parser, false, "20T10:20:30.400Z"); 
     assertParse(parser, false, "2T10:20:30.400Z"); 
     assertParse(parser, false, "2006-02-04T10:20.400Z"); 
     assertParse(parser, false, "2006-02-04T10:2.400Z"); 
     assertParse(parser, false, "2006-02-04T10.400Z"); 
     assertParse(parser, false, "2006-02-04T1.400Z"); 
 } 


public void test_localDateOptionalTimeParser1340() { 
     DateTimeFormatter parser = ISODateTimeFormat.localDateOptionalTimeParser(); 
     assertEquals(DateTimeZone.UTC, parser.getZone()); 
     assertParse(parser, true, "2006-06-09"); 
     assertParse(parser, true, "2006-W27-3"); 
     assertParse(parser, true, "2006-123"); 
     assertParse(parser, false, "2006-06-09T+02:00"); 
     assertParse(parser, false, "2006-W27-3T+02:00"); 
     assertParse(parser, false, "2006-123T+02:00"); 
     assertParse(parser, true, "2006-06-09T10:20:30.040"); 
     assertParse(parser, true, "2006-W27-3T10:20:30.040"); 
     assertParse(parser, true, "2006-123T10:20:30.040"); 
     assertParse(parser, false, "2006-06-09T10:20:30.040+02:00"); 
     assertParse(parser, false, "2006-W27-3T10:20:30.040+02:00"); 
     assertParse(parser, false, "2006-123T10:20:30.040+02:00"); 
     assertParse(parser, false, "T10:20:30.040"); 
     assertParse(parser, false, "T10.5"); 
     assertParse(parser, false, "T10:20:30.040+02:00"); 
     assertParse(parser, false, "T10.5+02:00"); 
     assertParse(parser, false, "10:20:30.040"); 
     assertParse(parser, false, "10.5"); 
     assertParse(parser, false, "10:20:30.040+02:00"); 
     assertParse(parser, false, "10.5+02:00"); 
 } 


public void test_timeParser1362() { 
     DateTimeZone.setDefault(DateTimeZone.UTC); 
     DateTimeFormatter parser = ISODateTimeFormat.timeParser(); 
     assertParse(parser, false, "2006-06-09"); 
     assertParse(parser, false, "2006-W27-3"); 
     assertParse(parser, false, "2006-123"); 
     assertParse(parser, false, "2006-06-09T+02:00"); 
     assertParse(parser, false, "2006-W27-3T+02:00"); 
     assertParse(parser, false, "2006-123T+02:00"); 
     assertParse(parser, false, "2006-06-09T10:20:30.040"); 
     assertParse(parser, false, "2006-W27-3T10:20:30.040"); 
     assertParse(parser, false, "2006-123T10:20:30.040"); 
     assertParse(parser, false, "2006-06-09T10:20:30.040+02:00"); 
     assertParse(parser, false, "2006-W27-3T10:20:30.040+02:00"); 
     assertParse(parser, false, "2006-123T10:20:30.040+02:00"); 
     assertParse(parser, "T10:20:30.040000000", new DateTime(1970, 1, 1, 10, 20, 30, 40)); 
     assertParse(parser, "T10:20:30.004", new DateTime(1970, 1, 1, 10, 20, 30, 4)); 
     assertParse(parser, "T10:20:30.040", new DateTime(1970, 1, 1, 10, 20, 30, 40)); 
     assertParse(parser, "T10:20:30.400", new DateTime(1970, 1, 1, 10, 20, 30, 400)); 
     assertParse(parser, "T10.5", new DateTime(1970, 1, 1, 10, 30, 0, 0)); 
     assertParse(parser, "T10:20:30.040+02:00", new DateTime(1970, 1, 1, 8, 20, 30, 40)); 
     assertParse(parser, "T10.5+02:00", new DateTime(1970, 1, 1, 8, 30, 0, 0)); 
     assertParse(parser, true, "10:20:30.040"); 
     assertParse(parser, true, "10.5"); 
     assertParse(parser, true, "10:20:30.040+02:00"); 
     assertParse(parser, true, "10.5+02:00"); 
 } 


public void test_dateParser1398() { 
     DateTimeFormatter parser = ISODateTimeFormat.dateParser(); 
     assertParse(parser, true, "2006-06-09"); 
     assertParse(parser, true, "2006-W27-3"); 
     assertParse(parser, true, "2006-123"); 
     assertParse(parser, true, "2006-06-09T+02:00"); 
     assertParse(parser, true, "2006-W27-3T+02:00"); 
     assertParse(parser, true, "2006-123T+02:00"); 
     assertParse(parser, false, "2006-06-09T10:20:30.040"); 
     assertParse(parser, false, "2006-W27-3T10:20:30.040"); 
     assertParse(parser, false, "2006-123T10:20:30.040"); 
     assertParse(parser, false, "2006-06-09T10:20:30.040+02:00"); 
     assertParse(parser, false, "2006-W27-3T10:20:30.040+02:00"); 
     assertParse(parser, false, "2006-123T10:20:30.040+02:00"); 
     assertParse(parser, false, "T10:20:30.040"); 
     assertParse(parser, false, "T10.5"); 
     assertParse(parser, false, "T10:20:30.040+02:00"); 
     assertParse(parser, false, "T10.5+02:00"); 
     assertParse(parser, false, "10:20:30.040"); 
     assertParse(parser, false, "10.5"); 
     assertParse(parser, false, "10:20:30.040+02:00"); 
     assertParse(parser, false, "10.5+02:00"); 
 } 


public void test_weekDateTimeNoMillis1415() { 
     DateTimeZone.setDefault(DateTimeZone.UTC); 
     DateTimeFormatter parser = ISODateTimeFormat.weekDateTimeNoMillis(); 
     assertParse(parser, "2006-W27-3T10:20:30Z", new DateTime(2006, 6, 1, 10, 20, 30, 0).withWeekOfWeekyear(27).withDayOfWeek(3)); 
     assertParse(parser, "2006-W2-3T10:20:30Z", new DateTime(2006, 6, 1, 10, 20, 30, 0).withWeekOfWeekyear(2).withDayOfWeek(3)); 
     assertParse(parser, "2006-W27-3T5:6:7Z", new DateTime(2006, 6, 1, 5, 6, 7, 0).withWeekOfWeekyear(27).withDayOfWeek(3)); 
     assertParse(parser, false, "2006-W27-T10:20:30Z"); 
     assertParse(parser, false, "2006-W27T10:20:30Z"); 
     assertParse(parser, false, "2006-W2T10:20:30Z"); 
     assertParse(parser, false, "2006-W-3T10:20:30Z"); 
     assertParse(parser, false, "2006-W27-3T10:20Z"); 
     assertParse(parser, false, "2006-W27-3T10:2Z"); 
     assertParse(parser, false, "2006-W27-3T10Z"); 
     assertParse(parser, false, "2006-W27-3T1Z"); 
 } 


public void test_basicDate1489() { 
     DateTimeFormatter parser = ISODateTimeFormat.basicDate(); 
     assertParse(parser, "20060204", new DateTime(2006, 2, 4, 0, 0, 0, 0)); 
     assertParse(parser, false, "2006024"); 
     assertParse(parser, false, "200602"); 
     assertParse(parser, false, "20061"); 
     assertParse(parser, false, "2006"); 
 } 

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    private void assertParse(DateTimeFormatter parser, boolean expected, String str) {
        if (expected) {
            parser.parseMillis(str);
        } else {
            try {
                parser.parseMillis(str);
                fail();
            } catch (IllegalArgumentException ex) {
                // expected
            }
        }
    }

    private void assertParse(DateTimeFormatter parser, String str, DateTime expected) {
        DateTime dt = parser.parseDateTime(str);
        assertEquals(expected, dt);
    }

}
