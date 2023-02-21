public TestLocalTime_Constructors(String name) { [EOL]     super(name); [EOL] } <line_num>: 80,82
public static void main(String[] args) { [EOL]     junit.textui.TestRunner.run(suite()); [EOL] } <line_num>: 72,74
public static TestSuite suite() { [EOL]     return new TestSuite(TestLocalTime_Constructors.class); [EOL] } <line_num>: 76,78
protected void setUp() throws Exception { [EOL]     DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW); [EOL]     zone = DateTimeZone.getDefault(); [EOL]     DateTimeZone.setDefault(LONDON); [EOL]     java.util.TimeZone.setDefault(LONDON.toTimeZone()); [EOL] } <line_num>: 84,89
protected void tearDown() throws Exception { [EOL]     DateTimeUtils.setCurrentMillisSystem(); [EOL]     DateTimeZone.setDefault(zone); [EOL]     java.util.TimeZone.setDefault(zone.toTimeZone()); [EOL]     zone = null; [EOL] } <line_num>: 91,96
public void testConstantMidnight() throws Throwable { [EOL]     LocalTime test = LocalTime.MIDNIGHT; [EOL]     assertEquals(ISO_UTC, test.getChronology()); [EOL]     assertEquals(0, test.getHourOfDay()); [EOL]     assertEquals(0, test.getMinuteOfHour()); [EOL]     assertEquals(0, test.getSecondOfMinute()); [EOL]     assertEquals(0, test.getMillisOfSecond()); [EOL] } <line_num>: 102,109
public void testParse_noFormatter() throws Throwable { [EOL]     assertEquals(new LocalTime(1, 20), LocalTime.parse("01:20")); [EOL]     assertEquals(new LocalTime(14, 50, 30, 432), LocalTime.parse("14:50:30.432")); [EOL] } <line_num>: 112,115
public void testParse_formatter() throws Throwable { [EOL]     DateTimeFormatter f = DateTimeFormat.forPattern("HH mm").withChronology(ISOChronology.getInstance(PARIS)); [EOL]     assertEquals(new LocalTime(13, 30), LocalTime.parse("13 30", f)); [EOL] } <line_num>: 117,120
public void testFactory_FromCalendarFields_Calendar() throws Exception { [EOL]     GregorianCalendar cal = new GregorianCalendar(1970, 1, 3, 4, 5, 6); [EOL]     cal.set(Calendar.MILLISECOND, 7); [EOL]     LocalTime expected = new LocalTime(4, 5, 6, 7); [EOL]     assertEquals(expected, LocalTime.fromCalendarFields(cal)); [EOL]     try { [EOL]         LocalTime.fromCalendarFields((Calendar) null); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL] } <line_num>: 123,132
public void testFactory_FromDateFields_after1970() throws Exception { [EOL]     GregorianCalendar cal = new GregorianCalendar(1970, 1, 3, 4, 5, 6); [EOL]     cal.set(Calendar.MILLISECOND, 7); [EOL]     LocalTime expected = new LocalTime(4, 5, 6, 7); [EOL]     assertEquals(expected, LocalTime.fromDateFields(cal.getTime())); [EOL] } <line_num>: 135,140
public void testFactory_FromDateFields_before1970() throws Exception { [EOL]     GregorianCalendar cal = new GregorianCalendar(1969, 1, 3, 4, 5, 6); [EOL]     cal.set(Calendar.MILLISECOND, 7); [EOL]     LocalTime expected = new LocalTime(4, 5, 6, 7); [EOL]     assertEquals(expected, LocalTime.fromDateFields(cal.getTime())); [EOL] } <line_num>: 142,147
public void testFactory_FromDateFields_null() throws Exception { [EOL]     try { [EOL]         LocalTime.fromDateFields((Date) null); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL] } <line_num>: 149,154
public void testFactoryMillisOfDay_long() throws Throwable { [EOL]     LocalTime test = LocalTime.fromMillisOfDay(TEST_TIME1); [EOL]     assertEquals(ISO_UTC, test.getChronology()); [EOL]     assertEquals(1, test.getHourOfDay()); [EOL]     assertEquals(2, test.getMinuteOfHour()); [EOL]     assertEquals(3, test.getSecondOfMinute()); [EOL]     assertEquals(4, test.getMillisOfSecond()); [EOL] } <line_num>: 157,164
public void testFactoryMillisOfDay_long_Chronology() throws Throwable { [EOL]     LocalTime test = LocalTime.fromMillisOfDay(TEST_TIME1, JULIAN_LONDON); [EOL]     assertEquals(JULIAN_UTC, test.getChronology()); [EOL]     assertEquals(1, test.getHourOfDay()); [EOL]     assertEquals(2, test.getMinuteOfHour()); [EOL]     assertEquals(3, test.getSecondOfMinute()); [EOL]     assertEquals(4, test.getMillisOfSecond()); [EOL] } <line_num>: 167,174
public void testFactoryMillisOfDay_long_nullChronology() throws Throwable { [EOL]     LocalTime test = LocalTime.fromMillisOfDay(TEST_TIME1, null); [EOL]     assertEquals(ISO_UTC, test.getChronology()); [EOL]     assertEquals(1, test.getHourOfDay()); [EOL]     assertEquals(2, test.getMinuteOfHour()); [EOL]     assertEquals(3, test.getSecondOfMinute()); [EOL]     assertEquals(4, test.getMillisOfSecond()); [EOL] } <line_num>: 176,183
public void testConstructor() throws Throwable { [EOL]     LocalTime test = new LocalTime(); [EOL]     assertEquals(ISO_UTC, test.getChronology()); [EOL]     assertEquals(10 + OFFSET_LONDON, test.getHourOfDay()); [EOL]     assertEquals(20, test.getMinuteOfHour()); [EOL]     assertEquals(30, test.getSecondOfMinute()); [EOL]     assertEquals(40, test.getMillisOfSecond()); [EOL]     assertEquals(test, LocalTime.now()); [EOL] } <line_num>: 186,194
public void testConstructor_DateTimeZone() throws Throwable { [EOL]     DateTime dt = new DateTime(2005, 6, 8, 23, 59, 30, 40, LONDON); [EOL]     DateTimeUtils.setCurrentMillisFixed(dt.getMillis()); [EOL]     LocalTime test = new LocalTime(LONDON); [EOL]     assertEquals(ISO_UTC, test.getChronology()); [EOL]     assertEquals(23, test.getHourOfDay()); [EOL]     assertEquals(59, test.getMinuteOfHour()); [EOL]     assertEquals(30, test.getSecondOfMinute()); [EOL]     assertEquals(40, test.getMillisOfSecond()); [EOL]     assertEquals(test, LocalTime.now(LONDON)); [EOL]     test = new LocalTime(PARIS); [EOL]     assertEquals(ISO_UTC, test.getChronology()); [EOL]     assertEquals(0, test.getHourOfDay()); [EOL]     assertEquals(59, test.getMinuteOfHour()); [EOL]     assertEquals(30, test.getSecondOfMinute()); [EOL]     assertEquals(40, test.getMillisOfSecond()); [EOL]     assertEquals(test, LocalTime.now(PARIS)); [EOL] } <line_num>: 197,217
public void testConstructor_nullDateTimeZone() throws Throwable { [EOL]     DateTime dt = new DateTime(2005, 6, 8, 23, 59, 30, 40, LONDON); [EOL]     DateTimeUtils.setCurrentMillisFixed(dt.getMillis()); [EOL]     LocalTime test = new LocalTime((DateTimeZone) null); [EOL]     assertEquals(ISO_UTC, test.getChronology()); [EOL]     assertEquals(23, test.getHourOfDay()); [EOL]     assertEquals(59, test.getMinuteOfHour()); [EOL]     assertEquals(30, test.getSecondOfMinute()); [EOL]     assertEquals(40, test.getMillisOfSecond()); [EOL] } <line_num>: 219,230
public void testConstructor_Chronology() throws Throwable { [EOL]     LocalTime test = new LocalTime(JULIAN_LONDON); [EOL]     assertEquals(JULIAN_UTC, test.getChronology()); [EOL]     assertEquals(10 + OFFSET_LONDON, test.getHourOfDay()); [EOL]     assertEquals(20, test.getMinuteOfHour()); [EOL]     assertEquals(30, test.getSecondOfMinute()); [EOL]     assertEquals(40, test.getMillisOfSecond()); [EOL]     assertEquals(test, LocalTime.now(JULIAN_LONDON)); [EOL] } <line_num>: 233,241
public void testConstructor_nullChronology() throws Throwable { [EOL]     LocalTime test = new LocalTime((Chronology) null); [EOL]     assertEquals(ISO_UTC, test.getChronology()); [EOL]     assertEquals(10 + OFFSET_LONDON, test.getHourOfDay()); [EOL]     assertEquals(20, test.getMinuteOfHour()); [EOL]     assertEquals(30, test.getSecondOfMinute()); [EOL]     assertEquals(40, test.getMillisOfSecond()); [EOL] } <line_num>: 243,250
public void testConstructor_long1() throws Throwable { [EOL]     LocalTime test = new LocalTime(TEST_TIME1); [EOL]     assertEquals(ISO_UTC, test.getChronology()); [EOL]     assertEquals(1 + OFFSET_LONDON, test.getHourOfDay()); [EOL]     assertEquals(2, test.getMinuteOfHour()); [EOL]     assertEquals(3, test.getSecondOfMinute()); [EOL]     assertEquals(4, test.getMillisOfSecond()); [EOL] } <line_num>: 253,260
public void testConstructor_long2() throws Throwable { [EOL]     LocalTime test = new LocalTime(TEST_TIME2); [EOL]     assertEquals(ISO_UTC, test.getChronology()); [EOL]     assertEquals(5 + OFFSET_LONDON, test.getHourOfDay()); [EOL]     assertEquals(6, test.getMinuteOfHour()); [EOL]     assertEquals(7, test.getSecondOfMinute()); [EOL]     assertEquals(8, test.getMillisOfSecond()); [EOL] } <line_num>: 262,269
public void testConstructor_long_DateTimeZone() throws Throwable { [EOL]     LocalTime test = new LocalTime(TEST_TIME1, PARIS); [EOL]     assertEquals(ISO_UTC, test.getChronology()); [EOL]     assertEquals(1 + OFFSET_PARIS, test.getHourOfDay()); [EOL]     assertEquals(2, test.getMinuteOfHour()); [EOL]     assertEquals(3, test.getSecondOfMinute()); [EOL]     assertEquals(4, test.getMillisOfSecond()); [EOL] } <line_num>: 272,279
public void testConstructor_long_DateTimeZone_2() throws Throwable { [EOL]     DateTime dt = new DateTime(2007, 6, 9, 1, 2, 3, 4, PARIS); [EOL]     DateTime dtUTC = new DateTime(1970, 1, 1, 1, 2, 3, 4, DateTimeZone.UTC); [EOL]     LocalTime test = new LocalTime(dt.getMillis(), PARIS); [EOL]     assertEquals(ISO_UTC, test.getChronology()); [EOL]     assertEquals(1, test.getHourOfDay()); [EOL]     assertEquals(2, test.getMinuteOfHour()); [EOL]     assertEquals(3, test.getSecondOfMinute()); [EOL]     assertEquals(4, test.getMillisOfSecond()); [EOL]     assertEquals(dtUTC.getMillis(), test.getLocalMillis()); [EOL] } <line_num>: 281,292
public void testConstructor_long_nullDateTimeZone() throws Throwable { [EOL]     LocalTime test = new LocalTime(TEST_TIME1, (DateTimeZone) null); [EOL]     assertEquals(ISO_UTC, test.getChronology()); [EOL]     assertEquals(1 + OFFSET_LONDON, test.getHourOfDay()); [EOL]     assertEquals(2, test.getMinuteOfHour()); [EOL]     assertEquals(3, test.getSecondOfMinute()); [EOL]     assertEquals(4, test.getMillisOfSecond()); [EOL] } <line_num>: 294,301
public void testConstructor_long1_Chronology() throws Throwable { [EOL]     LocalTime test = new LocalTime(TEST_TIME1, JULIAN_PARIS); [EOL]     assertEquals(JULIAN_UTC, test.getChronology()); [EOL]     assertEquals(1 + OFFSET_PARIS, test.getHourOfDay()); [EOL]     assertEquals(2, test.getMinuteOfHour()); [EOL]     assertEquals(3, test.getSecondOfMinute()); [EOL]     assertEquals(4, test.getMillisOfSecond()); [EOL] } <line_num>: 304,311
public void testConstructor_long2_Chronology() throws Throwable { [EOL]     LocalTime test = new LocalTime(TEST_TIME2, JULIAN_LONDON); [EOL]     assertEquals(JULIAN_UTC, test.getChronology()); [EOL]     assertEquals(5 + OFFSET_LONDON, test.getHourOfDay()); [EOL]     assertEquals(6, test.getMinuteOfHour()); [EOL]     assertEquals(7, test.getSecondOfMinute()); [EOL]     assertEquals(8, test.getMillisOfSecond()); [EOL] } <line_num>: 313,320
public void testConstructor_long_nullChronology() throws Throwable { [EOL]     LocalTime test = new LocalTime(TEST_TIME1, (Chronology) null); [EOL]     assertEquals(ISO_UTC, test.getChronology()); [EOL]     assertEquals(1 + OFFSET_LONDON, test.getHourOfDay()); [EOL]     assertEquals(2, test.getMinuteOfHour()); [EOL]     assertEquals(3, test.getSecondOfMinute()); [EOL]     assertEquals(4, test.getMillisOfSecond()); [EOL] } <line_num>: 322,329
public void testConstructor_Object1() throws Throwable { [EOL]     Date date = new Date(TEST_TIME1); [EOL]     LocalTime test = new LocalTime(date); [EOL]     assertEquals(ISO_UTC, test.getChronology()); [EOL]     assertEquals(1 + OFFSET_LONDON, test.getHourOfDay()); [EOL]     assertEquals(2, test.getMinuteOfHour()); [EOL]     assertEquals(3, test.getSecondOfMinute()); [EOL]     assertEquals(4, test.getMillisOfSecond()); [EOL] } <line_num>: 332,340
public void testConstructor_Object2() throws Throwable { [EOL]     Calendar cal = new GregorianCalendar(); [EOL]     cal.setTime(new Date(TEST_TIME1)); [EOL]     LocalTime test = new LocalTime(cal); [EOL]     assertEquals(GJChronology.getInstanceUTC(), test.getChronology()); [EOL]     assertEquals(1 + OFFSET_LONDON, test.getHourOfDay()); [EOL]     assertEquals(2, test.getMinuteOfHour()); [EOL]     assertEquals(3, test.getSecondOfMinute()); [EOL]     assertEquals(4, test.getMillisOfSecond()); [EOL] } <line_num>: 342,351
public void testConstructor_nullObject() throws Throwable { [EOL]     LocalTime test = new LocalTime((Object) null); [EOL]     assertEquals(ISO_UTC, test.getChronology()); [EOL]     assertEquals(10 + OFFSET_LONDON, test.getHourOfDay()); [EOL]     assertEquals(20, test.getMinuteOfHour()); [EOL]     assertEquals(30, test.getSecondOfMinute()); [EOL]     assertEquals(40, test.getMillisOfSecond()); [EOL] } <line_num>: 353,360
public void testConstructor_ObjectString1() throws Throwable { [EOL]     LocalTime test = new LocalTime("10:20:30.040"); [EOL]     assertEquals(ISO_UTC, test.getChronology()); [EOL]     assertEquals(10, test.getHourOfDay()); [EOL]     assertEquals(20, test.getMinuteOfHour()); [EOL]     assertEquals(30, test.getSecondOfMinute()); [EOL]     assertEquals(40, test.getMillisOfSecond()); [EOL] } <line_num>: 362,369
public void testConstructor_ObjectString1Tokyo() throws Throwable { [EOL]     DateTimeZone.setDefault(TOKYO); [EOL]     LocalTime test = new LocalTime("10:20:30.040"); [EOL]     assertEquals(ISO_UTC, test.getChronology()); [EOL]     assertEquals(10, test.getHourOfDay()); [EOL]     assertEquals(20, test.getMinuteOfHour()); [EOL]     assertEquals(30, test.getSecondOfMinute()); [EOL]     assertEquals(40, test.getMillisOfSecond()); [EOL] } <line_num>: 371,379
public void testConstructor_ObjectString1NewYork() throws Throwable { [EOL]     DateTimeZone.setDefault(NEW_YORK); [EOL]     LocalTime test = new LocalTime("10:20:30.040"); [EOL]     assertEquals(ISO_UTC, test.getChronology()); [EOL]     assertEquals(10, test.getHourOfDay()); [EOL]     assertEquals(20, test.getMinuteOfHour()); [EOL]     assertEquals(30, test.getSecondOfMinute()); [EOL]     assertEquals(40, test.getMillisOfSecond()); [EOL] } <line_num>: 381,389
public void testConstructor_ObjectString2() throws Throwable { [EOL]     LocalTime test = new LocalTime("T10:20:30.040"); [EOL]     assertEquals(ISO_UTC, test.getChronology()); [EOL]     assertEquals(10, test.getHourOfDay()); [EOL]     assertEquals(20, test.getMinuteOfHour()); [EOL]     assertEquals(30, test.getSecondOfMinute()); [EOL]     assertEquals(40, test.getMillisOfSecond()); [EOL] } <line_num>: 391,398
public void testConstructor_ObjectString3() throws Throwable { [EOL]     LocalTime test = new LocalTime("10:20"); [EOL]     assertEquals(ISO_UTC, test.getChronology()); [EOL]     assertEquals(10, test.getHourOfDay()); [EOL]     assertEquals(20, test.getMinuteOfHour()); [EOL]     assertEquals(0, test.getSecondOfMinute()); [EOL]     assertEquals(0, test.getMillisOfSecond()); [EOL] } <line_num>: 400,407
public void testConstructor_ObjectString4() throws Throwable { [EOL]     LocalTime test = new LocalTime("10"); [EOL]     assertEquals(ISO_UTC, test.getChronology()); [EOL]     assertEquals(10, test.getHourOfDay()); [EOL]     assertEquals(0, test.getMinuteOfHour()); [EOL]     assertEquals(0, test.getSecondOfMinute()); [EOL]     assertEquals(0, test.getMillisOfSecond()); [EOL] } <line_num>: 409,416
public void testConstructor_ObjectStringEx1() throws Throwable { [EOL]     try { [EOL]         new LocalTime("1970-04-06"); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL] } <line_num>: 418,423
public void testConstructor_ObjectStringEx2() throws Throwable { [EOL]     try { [EOL]         new LocalTime("1970-04-06T+14:00"); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL] } <line_num>: 425,430
public void testConstructor_ObjectStringEx3() throws Throwable { [EOL]     try { [EOL]         new LocalTime("1970-04-06T10:20:30.040"); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL] } <line_num>: 432,437
public void testConstructor_ObjectStringEx4() throws Throwable { [EOL]     try { [EOL]         new LocalTime("1970-04-06T10:20:30.040+14:00"); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL] } <line_num>: 439,444
public void testConstructor_ObjectStringEx5() throws Throwable { [EOL]     try { [EOL]         new LocalTime("T10:20:30.040+04:00"); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL] } <line_num>: 446,451
public void testConstructor_ObjectStringEx6() throws Throwable { [EOL]     try { [EOL]         new LocalTime("10:20:30.040+04:00"); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL] } <line_num>: 453,458
public void testConstructor_ObjectLocalTime() throws Throwable { [EOL]     LocalTime time = new LocalTime(10, 20, 30, 40, BUDDHIST_UTC); [EOL]     LocalTime test = new LocalTime(time); [EOL]     assertEquals(BUDDHIST_UTC, test.getChronology()); [EOL]     assertEquals(10, test.getHourOfDay()); [EOL]     assertEquals(20, test.getMinuteOfHour()); [EOL]     assertEquals(30, test.getSecondOfMinute()); [EOL]     assertEquals(40, test.getMillisOfSecond()); [EOL] } <line_num>: 460,468
public void testConstructor_ObjectLocalDate() throws Throwable { [EOL]     LocalDate date = new LocalDate(1970, 4, 6, BUDDHIST_UTC); [EOL]     try { [EOL]         new LocalTime(date); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL] } <line_num>: 470,476
public void testConstructor_ObjectLocalDateTime() throws Throwable { [EOL]     LocalDateTime dt = new LocalDateTime(1970, 5, 6, 10, 20, 30, 40, BUDDHIST_UTC); [EOL]     LocalTime test = new LocalTime(dt); [EOL]     assertEquals(BUDDHIST_UTC, test.getChronology()); [EOL]     assertEquals(10, test.getHourOfDay()); [EOL]     assertEquals(20, test.getMinuteOfHour()); [EOL]     assertEquals(30, test.getSecondOfMinute()); [EOL]     assertEquals(40, test.getMillisOfSecond()); [EOL] } <line_num>: 478,486
@SuppressWarnings("deprecation") [EOL] public void testConstructor_ObjectTimeOfDay() throws Throwable { [EOL]     TimeOfDay time = new TimeOfDay(10, 20, 30, 40, BUDDHIST_UTC); [EOL]     LocalTime test = new LocalTime(time); [EOL]     assertEquals(BUDDHIST_UTC, test.getChronology()); [EOL]     assertEquals(10, test.getHourOfDay()); [EOL]     assertEquals(20, test.getMinuteOfHour()); [EOL]     assertEquals(30, test.getSecondOfMinute()); [EOL]     assertEquals(40, test.getMillisOfSecond()); [EOL] } <line_num>: 488,497
public void testConstructor_Object1_DateTimeZone() throws Throwable { [EOL]     Date date = new Date(TEST_TIME1); [EOL]     LocalTime test = new LocalTime(date, PARIS); [EOL]     assertEquals(ISO_UTC, test.getChronology()); [EOL]     assertEquals(1 + OFFSET_PARIS, test.getHourOfDay()); [EOL]     assertEquals(2, test.getMinuteOfHour()); [EOL]     assertEquals(3, test.getSecondOfMinute()); [EOL]     assertEquals(4, test.getMillisOfSecond()); [EOL] } <line_num>: 500,508
public void testConstructor_ObjectString_DateTimeZoneLondon() throws Throwable { [EOL]     LocalTime test = new LocalTime("04:20", LONDON); [EOL]     assertEquals(4, test.getHourOfDay()); [EOL]     assertEquals(20, test.getMinuteOfHour()); [EOL] } <line_num>: 510,514
public void testConstructor_ObjectString_DateTimeZoneTokyo() throws Throwable { [EOL]     LocalTime test = new LocalTime("04:20", TOKYO); [EOL]     assertEquals(ISO_UTC, test.getChronology()); [EOL]     assertEquals(4, test.getHourOfDay()); [EOL]     assertEquals(20, test.getMinuteOfHour()); [EOL] } <line_num>: 516,521
public void testConstructor_ObjectString_DateTimeZoneNewYork() throws Throwable { [EOL]     LocalTime test = new LocalTime("04:20", NEW_YORK); [EOL]     assertEquals(ISO_UTC, test.getChronology()); [EOL]     assertEquals(4, test.getHourOfDay()); [EOL]     assertEquals(20, test.getMinuteOfHour()); [EOL] } <line_num>: 523,528
public void testConstructor_nullObject_DateTimeZone() throws Throwable { [EOL]     LocalTime test = new LocalTime((Object) null, PARIS); [EOL]     assertEquals(ISO_UTC, test.getChronology()); [EOL]     assertEquals(10 + OFFSET_PARIS, test.getHourOfDay()); [EOL]     assertEquals(20, test.getMinuteOfHour()); [EOL]     assertEquals(30, test.getSecondOfMinute()); [EOL]     assertEquals(40, test.getMillisOfSecond()); [EOL] } <line_num>: 530,537
public void testConstructor_Object_nullDateTimeZone() throws Throwable { [EOL]     Date date = new Date(TEST_TIME1); [EOL]     LocalTime test = new LocalTime(date, (DateTimeZone) null); [EOL]     assertEquals(ISO_UTC, test.getChronology()); [EOL]     assertEquals(1 + OFFSET_LONDON, test.getHourOfDay()); [EOL]     assertEquals(2, test.getMinuteOfHour()); [EOL]     assertEquals(3, test.getSecondOfMinute()); [EOL]     assertEquals(4, test.getMillisOfSecond()); [EOL] } <line_num>: 539,547
public void testConstructor_nullObject_nullDateTimeZone() throws Throwable { [EOL]     LocalTime test = new LocalTime((Object) null, (DateTimeZone) null); [EOL]     assertEquals(ISO_UTC, test.getChronology()); [EOL]     assertEquals(10 + OFFSET_LONDON, test.getHourOfDay()); [EOL]     assertEquals(20, test.getMinuteOfHour()); [EOL]     assertEquals(30, test.getSecondOfMinute()); [EOL]     assertEquals(40, test.getMillisOfSecond()); [EOL] } <line_num>: 549,556
public void testConstructor_Object1_Chronology() throws Throwable { [EOL]     Date date = new Date(TEST_TIME1); [EOL]     LocalTime test = new LocalTime(date, JULIAN_LONDON); [EOL]     assertEquals(JULIAN_UTC, test.getChronology()); [EOL]     assertEquals(1 + OFFSET_LONDON, test.getHourOfDay()); [EOL]     assertEquals(2, test.getMinuteOfHour()); [EOL]     assertEquals(3, test.getSecondOfMinute()); [EOL]     assertEquals(4, test.getMillisOfSecond()); [EOL] } <line_num>: 559,567
public void testConstructor_Object2_Chronology() throws Throwable { [EOL]     LocalTime test = new LocalTime("T10:20"); [EOL]     assertEquals(10, test.getHourOfDay()); [EOL]     assertEquals(20, test.getMinuteOfHour()); [EOL]     assertEquals(0, test.getSecondOfMinute()); [EOL]     assertEquals(0, test.getMillisOfSecond()); [EOL]     try { [EOL]         new LocalTime("T1020"); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL] } <line_num>: 569,580
public void testConstructor_nullObject_Chronology() throws Throwable { [EOL]     LocalTime test = new LocalTime((Object) null, JULIAN_LONDON); [EOL]     assertEquals(JULIAN_UTC, test.getChronology()); [EOL]     assertEquals(10 + OFFSET_LONDON, test.getHourOfDay()); [EOL]     assertEquals(20, test.getMinuteOfHour()); [EOL]     assertEquals(30, test.getSecondOfMinute()); [EOL]     assertEquals(40, test.getMillisOfSecond()); [EOL] } <line_num>: 582,589
public void testConstructor_Object_nullChronology() throws Throwable { [EOL]     Date date = new Date(TEST_TIME1); [EOL]     LocalTime test = new LocalTime(date, (Chronology) null); [EOL]     assertEquals(ISO_UTC, test.getChronology()); [EOL]     assertEquals(1 + OFFSET_LONDON, test.getHourOfDay()); [EOL]     assertEquals(2, test.getMinuteOfHour()); [EOL]     assertEquals(3, test.getSecondOfMinute()); [EOL]     assertEquals(4, test.getMillisOfSecond()); [EOL] } <line_num>: 591,599
public void testConstructor_nullObject_nullChronology() throws Throwable { [EOL]     LocalTime test = new LocalTime((Object) null, (Chronology) null); [EOL]     assertEquals(ISO_UTC, test.getChronology()); [EOL]     assertEquals(10 + OFFSET_LONDON, test.getHourOfDay()); [EOL]     assertEquals(20, test.getMinuteOfHour()); [EOL]     assertEquals(30, test.getSecondOfMinute()); [EOL]     assertEquals(40, test.getMillisOfSecond()); [EOL] } <line_num>: 601,608
public void testConstructor_int_int() throws Throwable { [EOL]     LocalTime test = new LocalTime(10, 20); [EOL]     assertEquals(ISO_UTC, test.getChronology()); [EOL]     assertEquals(10, test.getHourOfDay()); [EOL]     assertEquals(20, test.getMinuteOfHour()); [EOL]     assertEquals(0, test.getSecondOfMinute()); [EOL]     assertEquals(0, test.getMillisOfSecond()); [EOL]     try { [EOL]         new LocalTime(-1, 20); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL]     try { [EOL]         new LocalTime(24, 20); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL]     try { [EOL]         new LocalTime(10, -1); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL]     try { [EOL]         new LocalTime(10, 60); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL] } <line_num>: 611,634
public void testConstructor_int_int_int() throws Throwable { [EOL]     LocalTime test = new LocalTime(10, 20, 30); [EOL]     assertEquals(ISO_UTC, test.getChronology()); [EOL]     assertEquals(10, test.getHourOfDay()); [EOL]     assertEquals(20, test.getMinuteOfHour()); [EOL]     assertEquals(30, test.getSecondOfMinute()); [EOL]     assertEquals(0, test.getMillisOfSecond()); [EOL]     try { [EOL]         new LocalTime(-1, 20, 30); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL]     try { [EOL]         new LocalTime(24, 20, 30); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL]     try { [EOL]         new LocalTime(10, -1, 30); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL]     try { [EOL]         new LocalTime(10, 60, 30); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL]     try { [EOL]         new LocalTime(10, 20, -1); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL]     try { [EOL]         new LocalTime(10, 20, 60); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL] } <line_num>: 636,667
public void testConstructor_int_int_int_int() throws Throwable { [EOL]     LocalTime test = new LocalTime(10, 20, 30, 40); [EOL]     assertEquals(ISO_UTC, test.getChronology()); [EOL]     assertEquals(10, test.getHourOfDay()); [EOL]     assertEquals(20, test.getMinuteOfHour()); [EOL]     assertEquals(30, test.getSecondOfMinute()); [EOL]     assertEquals(40, test.getMillisOfSecond()); [EOL]     try { [EOL]         new LocalTime(-1, 20, 30, 40); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL]     try { [EOL]         new LocalTime(24, 20, 30, 40); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL]     try { [EOL]         new LocalTime(10, -1, 30, 40); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL]     try { [EOL]         new LocalTime(10, 60, 30, 40); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL]     try { [EOL]         new LocalTime(10, 20, -1, 40); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL]     try { [EOL]         new LocalTime(10, 20, 60, 40); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL]     try { [EOL]         new LocalTime(10, 20, 30, -1); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL]     try { [EOL]         new LocalTime(10, 20, 30, 1000); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL] } <line_num>: 669,708
public void testConstructor_int_int_int_int_Chronology() throws Throwable { [EOL]     LocalTime test = new LocalTime(10, 20, 30, 40, JULIAN_LONDON); [EOL]     assertEquals(JULIAN_UTC, test.getChronology()); [EOL]     assertEquals(10, test.getHourOfDay()); [EOL]     assertEquals(20, test.getMinuteOfHour()); [EOL]     assertEquals(30, test.getSecondOfMinute()); [EOL]     assertEquals(40, test.getMillisOfSecond()); [EOL]     try { [EOL]         new LocalTime(-1, 20, 30, 40, JULIAN_LONDON); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL]     try { [EOL]         new LocalTime(24, 20, 30, 40, JULIAN_LONDON); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL]     try { [EOL]         new LocalTime(10, -1, 30, 40, JULIAN_LONDON); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL]     try { [EOL]         new LocalTime(10, 60, 30, 40, JULIAN_LONDON); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL]     try { [EOL]         new LocalTime(10, 20, -1, 40, JULIAN_LONDON); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL]     try { [EOL]         new LocalTime(10, 20, 60, 40, JULIAN_LONDON); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL]     try { [EOL]         new LocalTime(10, 20, 30, -1, JULIAN_LONDON); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL]     try { [EOL]         new LocalTime(10, 20, 30, 1000, JULIAN_LONDON); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL] } <line_num>: 710,749
public void testConstructor_int_int_int_int_nullChronology() throws Throwable { [EOL]     LocalTime test = new LocalTime(10, 20, 30, 40, null); [EOL]     assertEquals(ISO_UTC, test.getChronology()); [EOL]     assertEquals(10, test.getHourOfDay()); [EOL]     assertEquals(20, test.getMinuteOfHour()); [EOL]     assertEquals(30, test.getSecondOfMinute()); [EOL]     assertEquals(40, test.getMillisOfSecond()); [EOL] } <line_num>: 751,758
