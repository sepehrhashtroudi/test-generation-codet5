public TestMutableInterval_Updates(String name) { [EOL]     super(name); [EOL] } <line_num>: 76,78
public static void main(String[] args) { [EOL]     junit.textui.TestRunner.run(suite()); [EOL] } <line_num>: 68,70
public static TestSuite suite() { [EOL]     return new TestSuite(TestMutableInterval_Updates.class); [EOL] } <line_num>: 72,74
protected void setUp() throws Exception { [EOL]     DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW); [EOL]     originalDateTimeZone = DateTimeZone.getDefault(); [EOL]     originalTimeZone = TimeZone.getDefault(); [EOL]     originalLocale = Locale.getDefault(); [EOL]     DateTimeZone.setDefault(LONDON); [EOL]     TimeZone.setDefault(TimeZone.getTimeZone("Europe/London")); [EOL]     Locale.setDefault(Locale.UK); [EOL] } <line_num>: 80,88
protected void tearDown() throws Exception { [EOL]     DateTimeUtils.setCurrentMillisSystem(); [EOL]     DateTimeZone.setDefault(originalDateTimeZone); [EOL]     TimeZone.setDefault(originalTimeZone); [EOL]     Locale.setDefault(originalLocale); [EOL]     originalDateTimeZone = null; [EOL]     originalTimeZone = null; [EOL]     originalLocale = null; [EOL] } <line_num>: 90,98
public void testTest() { [EOL]     assertEquals("2002-06-09T00:00:00.000Z", new Instant(TEST_TIME_NOW).toString()); [EOL]     assertEquals("2002-04-05T12:24:00.000Z", new Instant(TEST_TIME1).toString()); [EOL]     assertEquals("2003-05-06T14:28:00.000Z", new Instant(TEST_TIME2).toString()); [EOL] } <line_num>: 101,105
public void testSetInterval_long_long1() { [EOL]     MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); [EOL]     test.setInterval(TEST_TIME1 - 1, TEST_TIME2 + 1); [EOL]     assertEquals(TEST_TIME1 - 1, test.getStartMillis()); [EOL]     assertEquals(TEST_TIME2 + 1, test.getEndMillis()); [EOL] } <line_num>: 108,113
public void testSetInterval_long_long2() { [EOL]     MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); [EOL]     try { [EOL]         test.setInterval(TEST_TIME1 - 1, TEST_TIME1 - 2); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL] } <line_num>: 115,121
public void testSetInterval_RI_RI1() { [EOL]     MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); [EOL]     test.setInterval(new Instant(TEST_TIME1 - 1), new Instant(TEST_TIME2 + 1)); [EOL]     assertEquals(TEST_TIME1 - 1, test.getStartMillis()); [EOL]     assertEquals(TEST_TIME2 + 1, test.getEndMillis()); [EOL] } <line_num>: 124,129
public void testSetInterval_RI_RI2() { [EOL]     MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); [EOL]     try { [EOL]         test.setInterval(new Instant(TEST_TIME1 - 1), new Instant(TEST_TIME1 - 2)); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL] } <line_num>: 131,137
public void testSetInterval_RI_RI3() { [EOL]     MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); [EOL]     test.setInterval(null, new Instant(TEST_TIME2 + 1)); [EOL]     assertEquals(TEST_TIME_NOW, test.getStartMillis()); [EOL]     assertEquals(TEST_TIME2 + 1, test.getEndMillis()); [EOL] } <line_num>: 139,144
public void testSetInterval_RI_RI4() { [EOL]     MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); [EOL]     test.setInterval(new Instant(TEST_TIME1 - 1), null); [EOL]     assertEquals(TEST_TIME1 - 1, test.getStartMillis()); [EOL]     assertEquals(TEST_TIME_NOW, test.getEndMillis()); [EOL] } <line_num>: 146,151
public void testSetInterval_RI_RI5() { [EOL]     MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); [EOL]     test.setInterval(null, null); [EOL]     assertEquals(TEST_TIME_NOW, test.getStartMillis()); [EOL]     assertEquals(TEST_TIME_NOW, test.getEndMillis()); [EOL] } <line_num>: 153,158
public void testSetInterval_RInterval1() { [EOL]     MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); [EOL]     test.setInterval(new Interval(TEST_TIME1 - 1, TEST_TIME2 + 1)); [EOL]     assertEquals(TEST_TIME1 - 1, test.getStartMillis()); [EOL]     assertEquals(TEST_TIME2 + 1, test.getEndMillis()); [EOL] } <line_num>: 161,166
public void testSetInterval_RInterval2() { [EOL]     MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); [EOL]     try { [EOL]         test.setInterval(new MockBadInterval()); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL] } <line_num>: 168,174
public Chronology getChronology() { [EOL]     return ISOChronology.getInstance(); [EOL] } <line_num>: 177,179
public long getStartMillis() { [EOL]     return TEST_TIME1 - 1; [EOL] } <line_num>: 180,182
public long getEndMillis() { [EOL]     return TEST_TIME1 - 2; [EOL] } <line_num>: 183,185
public void testSetInterval_RInterval3() { [EOL]     MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); [EOL]     try { [EOL]         test.setInterval(null); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL] } <line_num>: 188,194
public void testSetStartMillis_long1() { [EOL]     MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); [EOL]     test.setStartMillis(TEST_TIME1 - 1); [EOL]     assertEquals(TEST_TIME1 - 1, test.getStartMillis()); [EOL]     assertEquals(TEST_TIME2, test.getEndMillis()); [EOL] } <line_num>: 197,202
public void testSetStartMillis_long2() { [EOL]     MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); [EOL]     try { [EOL]         test.setStartMillis(TEST_TIME2 + 1); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL] } <line_num>: 204,210
public void testSetStart_RI1() { [EOL]     MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); [EOL]     test.setStart(new Instant(TEST_TIME1 - 1)); [EOL]     assertEquals(TEST_TIME1 - 1, test.getStartMillis()); [EOL]     assertEquals(TEST_TIME2, test.getEndMillis()); [EOL] } <line_num>: 213,218
public void testSetStart_RI2() { [EOL]     MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); [EOL]     try { [EOL]         test.setStart(new Instant(TEST_TIME2 + 1)); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL] } <line_num>: 220,226
public void testSetStart_RI3() { [EOL]     MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); [EOL]     test.setStart(null); [EOL]     assertEquals(TEST_TIME_NOW, test.getStartMillis()); [EOL]     assertEquals(TEST_TIME2, test.getEndMillis()); [EOL] } <line_num>: 228,233
public void testSetEndMillis_long1() { [EOL]     MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); [EOL]     test.setEndMillis(TEST_TIME2 + 1); [EOL]     assertEquals(TEST_TIME1, test.getStartMillis()); [EOL]     assertEquals(TEST_TIME2 + 1, test.getEndMillis()); [EOL] } <line_num>: 236,241
public void testSetEndMillis_long2() { [EOL]     MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); [EOL]     try { [EOL]         test.setEndMillis(TEST_TIME1 - 1); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL] } <line_num>: 243,249
public void testSetEnd_RI1() { [EOL]     MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); [EOL]     test.setEnd(new Instant(TEST_TIME2 + 1)); [EOL]     assertEquals(TEST_TIME1, test.getStartMillis()); [EOL]     assertEquals(TEST_TIME2 + 1, test.getEndMillis()); [EOL] } <line_num>: 252,257
public void testSetEnd_RI2() { [EOL]     MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); [EOL]     try { [EOL]         test.setEnd(new Instant(TEST_TIME1 - 1)); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL] } <line_num>: 259,265
public void testSetEnd_RI3() { [EOL]     MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); [EOL]     test.setEnd(null); [EOL]     assertEquals(TEST_TIME1, test.getStartMillis()); [EOL]     assertEquals(TEST_TIME_NOW, test.getEndMillis()); [EOL] } <line_num>: 267,272
public void testSetDurationAfterStart_long1() { [EOL]     MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); [EOL]     test.setDurationAfterStart(123L); [EOL]     assertEquals(TEST_TIME1, test.getStartMillis()); [EOL]     assertEquals(TEST_TIME1 + 123L, test.getEndMillis()); [EOL] } <line_num>: 275,280
public void testSeDurationAfterStart_long2() { [EOL]     MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); [EOL]     try { [EOL]         test.setDurationAfterStart(-1); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL] } <line_num>: 282,288
public void testSetDurationAfterStart_RI1() { [EOL]     MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); [EOL]     test.setDurationAfterStart(new Duration(123L)); [EOL]     assertEquals(TEST_TIME1, test.getStartMillis()); [EOL]     assertEquals(TEST_TIME1 + 123L, test.getEndMillis()); [EOL] } <line_num>: 291,296
public void testSeDurationAfterStart_RI2() { [EOL]     MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); [EOL]     try { [EOL]         test.setDurationAfterStart(new Duration(-1)); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL] } <line_num>: 298,304
public void testSetDurationAfterStart_RI3() { [EOL]     MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); [EOL]     test.setDurationAfterStart(null); [EOL]     assertEquals(TEST_TIME1, test.getStartMillis()); [EOL]     assertEquals(TEST_TIME1, test.getEndMillis()); [EOL] } <line_num>: 306,311
public void testSetDurationBeforeEnd_long1() { [EOL]     MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); [EOL]     test.setDurationBeforeEnd(123L); [EOL]     assertEquals(TEST_TIME2 - 123L, test.getStartMillis()); [EOL]     assertEquals(TEST_TIME2, test.getEndMillis()); [EOL] } <line_num>: 314,319
public void testSeDurationBeforeEnd_long2() { [EOL]     MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); [EOL]     try { [EOL]         test.setDurationBeforeEnd(-1); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL] } <line_num>: 321,327
public void testSetDurationBeforeEnd_RI1() { [EOL]     MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); [EOL]     test.setDurationBeforeEnd(new Duration(123L)); [EOL]     assertEquals(TEST_TIME2 - 123L, test.getStartMillis()); [EOL]     assertEquals(TEST_TIME2, test.getEndMillis()); [EOL] } <line_num>: 330,335
public void testSeDurationBeforeEnd_RI2() { [EOL]     MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); [EOL]     try { [EOL]         test.setDurationBeforeEnd(new Duration(-1)); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL] } <line_num>: 337,343
public void testSetDurationBeforeEnd_RI3() { [EOL]     MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); [EOL]     test.setDurationBeforeEnd(null); [EOL]     assertEquals(TEST_TIME2, test.getStartMillis()); [EOL]     assertEquals(TEST_TIME2, test.getEndMillis()); [EOL] } <line_num>: 345,350
public void testSetPeriodAfterStart_RI1() { [EOL]     MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); [EOL]     test.setPeriodAfterStart(new Period(123L)); [EOL]     assertEquals(TEST_TIME1, test.getStartMillis()); [EOL]     assertEquals(TEST_TIME1 + 123L, test.getEndMillis()); [EOL] } <line_num>: 353,358
public void testSePeriodAfterStart_RI2() { [EOL]     MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); [EOL]     try { [EOL]         test.setPeriodAfterStart(new Period(-1L)); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL] } <line_num>: 360,366
public void testSetPeriodAfterStart_RI3() { [EOL]     MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); [EOL]     test.setPeriodAfterStart(null); [EOL]     assertEquals(TEST_TIME1, test.getStartMillis()); [EOL]     assertEquals(TEST_TIME1, test.getEndMillis()); [EOL] } <line_num>: 368,373
public void testSetPeriodBeforeEnd_RI1() { [EOL]     MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); [EOL]     test.setPeriodBeforeEnd(new Period(123L)); [EOL]     assertEquals(TEST_TIME2 - 123L, test.getStartMillis()); [EOL]     assertEquals(TEST_TIME2, test.getEndMillis()); [EOL] } <line_num>: 376,381
public void testSePeriodBeforeEnd_RI2() { [EOL]     MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); [EOL]     try { [EOL]         test.setPeriodBeforeEnd(new Period(-1L)); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL] } <line_num>: 383,389
public void testSetPeriodBeforeEnd_RI3() { [EOL]     MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); [EOL]     test.setPeriodBeforeEnd(null); [EOL]     assertEquals(TEST_TIME2, test.getStartMillis()); [EOL]     assertEquals(TEST_TIME2, test.getEndMillis()); [EOL] } <line_num>: 391,396