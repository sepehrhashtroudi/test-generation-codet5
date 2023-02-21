public TestMutableInterval_Basics(String name) { [EOL]     super(name); [EOL] } <line_num>: 83,85
public MockInterval() { [EOL]     super(); [EOL] } <line_num>: 181,183
public static void main(String[] args) { [EOL]     junit.textui.TestRunner.run(suite()); [EOL] } <line_num>: 75,77
public static TestSuite suite() { [EOL]     return new TestSuite(TestMutableInterval_Basics.class); [EOL] } <line_num>: 79,81
protected void setUp() throws Exception { [EOL]     DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW); [EOL]     originalDateTimeZone = DateTimeZone.getDefault(); [EOL]     originalTimeZone = TimeZone.getDefault(); [EOL]     originalLocale = Locale.getDefault(); [EOL]     DateTimeZone.setDefault(LONDON); [EOL]     TimeZone.setDefault(TimeZone.getTimeZone("Europe/London")); [EOL]     Locale.setDefault(Locale.UK); [EOL] } <line_num>: 87,95
protected void tearDown() throws Exception { [EOL]     DateTimeUtils.setCurrentMillisSystem(); [EOL]     DateTimeZone.setDefault(originalDateTimeZone); [EOL]     TimeZone.setDefault(originalTimeZone); [EOL]     Locale.setDefault(originalLocale); [EOL]     originalDateTimeZone = null; [EOL]     originalTimeZone = null; [EOL]     originalLocale = null; [EOL] } <line_num>: 97,105
public void testTest() { [EOL]     assertEquals("2002-06-09T00:00:00.000Z", new Instant(TEST_TIME_NOW).toString()); [EOL]     assertEquals("2002-04-05T12:24:00.000Z", new Instant(TEST_TIME1).toString()); [EOL]     assertEquals("2003-05-06T14:28:00.000Z", new Instant(TEST_TIME2).toString()); [EOL] } <line_num>: 108,112
public void testGetMillis() { [EOL]     MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); [EOL]     assertEquals(TEST_TIME1, test.getStartMillis()); [EOL]     assertEquals(TEST_TIME1, test.getStart().getMillis()); [EOL]     assertEquals(TEST_TIME2, test.getEndMillis()); [EOL]     assertEquals(TEST_TIME2, test.getEnd().getMillis()); [EOL]     assertEquals(TEST_TIME2 - TEST_TIME1, test.toDurationMillis()); [EOL]     assertEquals(TEST_TIME2 - TEST_TIME1, test.toDuration().getMillis()); [EOL] } <line_num>: 115,123
public void testGetDuration1() { [EOL]     MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); [EOL]     assertEquals(TEST_TIME2 - TEST_TIME1, test.toDurationMillis()); [EOL]     assertEquals(TEST_TIME2 - TEST_TIME1, test.toDuration().getMillis()); [EOL] } <line_num>: 125,129
public void testGetDuration2() { [EOL]     MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME1); [EOL]     assertSame(Duration.ZERO, test.toDuration()); [EOL] } <line_num>: 131,134
public void testEqualsHashCode() { [EOL]     MutableInterval test1 = new MutableInterval(TEST_TIME1, TEST_TIME2); [EOL]     MutableInterval test2 = new MutableInterval(TEST_TIME1, TEST_TIME2); [EOL]     assertEquals(true, test1.equals(test2)); [EOL]     assertEquals(true, test2.equals(test1)); [EOL]     assertEquals(true, test1.equals(test1)); [EOL]     assertEquals(true, test2.equals(test2)); [EOL]     assertEquals(true, test1.hashCode() == test2.hashCode()); [EOL]     assertEquals(true, test1.hashCode() == test1.hashCode()); [EOL]     assertEquals(true, test2.hashCode() == test2.hashCode()); [EOL]     MutableInterval test3 = new MutableInterval(TEST_TIME_NOW, TEST_TIME2); [EOL]     assertEquals(false, test1.equals(test3)); [EOL]     assertEquals(false, test2.equals(test3)); [EOL]     assertEquals(false, test3.equals(test1)); [EOL]     assertEquals(false, test3.equals(test2)); [EOL]     assertEquals(false, test1.hashCode() == test3.hashCode()); [EOL]     assertEquals(false, test2.hashCode() == test3.hashCode()); [EOL]     MutableInterval test4 = new MutableInterval(TEST_TIME1, TEST_TIME2, GJChronology.getInstance()); [EOL]     assertEquals(true, test4.equals(test4)); [EOL]     assertEquals(false, test1.equals(test4)); [EOL]     assertEquals(false, test2.equals(test4)); [EOL]     assertEquals(false, test4.equals(test1)); [EOL]     assertEquals(false, test4.equals(test2)); [EOL]     assertEquals(false, test1.hashCode() == test4.hashCode()); [EOL]     assertEquals(false, test2.hashCode() == test4.hashCode()); [EOL]     MutableInterval test5 = new MutableInterval(TEST_TIME1, TEST_TIME2); [EOL]     assertEquals(true, test1.equals(test5)); [EOL]     assertEquals(true, test2.equals(test5)); [EOL]     assertEquals(false, test3.equals(test5)); [EOL]     assertEquals(true, test5.equals(test1)); [EOL]     assertEquals(true, test5.equals(test2)); [EOL]     assertEquals(false, test5.equals(test3)); [EOL]     assertEquals(true, test1.hashCode() == test5.hashCode()); [EOL]     assertEquals(true, test2.hashCode() == test5.hashCode()); [EOL]     assertEquals(false, test3.hashCode() == test5.hashCode()); [EOL]     assertEquals(false, test1.equals("Hello")); [EOL]     assertEquals(true, test1.equals(new MockInterval())); [EOL]     assertEquals(false, test1.equals(new DateTime(TEST_TIME1))); [EOL] } <line_num>: 136,178
public Chronology getChronology() { [EOL]     return ISOChronology.getInstance(); [EOL] } <line_num>: 184,186
public long getStartMillis() { [EOL]     return TEST_TIME1; [EOL] } <line_num>: 187,189
public long getEndMillis() { [EOL]     return TEST_TIME2; [EOL] } <line_num>: 190,192
public void testContains_long() { [EOL]     MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); [EOL]     assertEquals(true, test.contains(TEST_TIME1)); [EOL]     assertEquals(false, test.contains(TEST_TIME1 - 1)); [EOL]     assertEquals(true, test.contains(TEST_TIME1 + (TEST_TIME2 - TEST_TIME1) / 2)); [EOL]     assertEquals(false, test.contains(TEST_TIME2)); [EOL]     assertEquals(true, test.contains(TEST_TIME2 - 1)); [EOL] } <line_num>: 196,203
public void testContainsNow() { [EOL]     MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); [EOL]     DateTimeUtils.setCurrentMillisFixed(TEST_TIME1); [EOL]     assertEquals(true, test.containsNow()); [EOL]     DateTimeUtils.setCurrentMillisFixed(TEST_TIME1 - 1); [EOL]     assertEquals(false, test.containsNow()); [EOL]     DateTimeUtils.setCurrentMillisFixed(TEST_TIME1 + (TEST_TIME2 - TEST_TIME1) / 2); [EOL]     assertEquals(true, test.containsNow()); [EOL]     DateTimeUtils.setCurrentMillisFixed(TEST_TIME2); [EOL]     assertEquals(false, test.containsNow()); [EOL]     DateTimeUtils.setCurrentMillisFixed(TEST_TIME2 - 1); [EOL]     assertEquals(true, test.containsNow()); [EOL] } <line_num>: 205,218
public void testContains_RI() { [EOL]     MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); [EOL]     assertEquals(true, test.contains(new Instant(TEST_TIME1))); [EOL]     assertEquals(false, test.contains(new Instant(TEST_TIME1 - 1))); [EOL]     assertEquals(true, test.contains(new Instant(TEST_TIME1 + (TEST_TIME2 - TEST_TIME1) / 2))); [EOL]     assertEquals(false, test.contains(new Instant(TEST_TIME2))); [EOL]     assertEquals(true, test.contains(new Instant(TEST_TIME2 - 1))); [EOL]     assertEquals(true, test.contains((ReadableInstant) null)); [EOL] } <line_num>: 220,228
public void testContains_RInterval() { [EOL]     MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); [EOL]     assertEquals(true, test.contains(new Interval(TEST_TIME1, TEST_TIME1))); [EOL]     assertEquals(false, test.contains(new Interval(TEST_TIME1 - 1, TEST_TIME1))); [EOL]     assertEquals(true, test.contains(new Interval(TEST_TIME1, TEST_TIME1 + 1))); [EOL]     assertEquals(false, test.contains(new Interval(TEST_TIME1 - 1, TEST_TIME1 + 1))); [EOL]     assertEquals(true, test.contains(new Interval(TEST_TIME1 + 1, TEST_TIME1 + 1))); [EOL]     assertEquals(true, test.contains(new Interval(TEST_TIME1, TEST_TIME2))); [EOL]     assertEquals(false, test.contains(new Interval(TEST_TIME1 - 1, TEST_TIME2))); [EOL]     assertEquals(true, test.contains(new Interval(TEST_TIME1 + (TEST_TIME2 - TEST_TIME1) / 2, TEST_TIME2))); [EOL]     assertEquals(false, test.contains(new Interval(TEST_TIME2, TEST_TIME2))); [EOL]     assertEquals(true, test.contains(new Interval(TEST_TIME2 - 1, TEST_TIME2))); [EOL]     assertEquals(true, test.contains(new Interval(TEST_TIME1, TEST_TIME2 - 1))); [EOL]     assertEquals(false, test.contains(new Interval(TEST_TIME1 - 1, TEST_TIME2 - 1))); [EOL]     assertEquals(true, test.contains(new Interval(TEST_TIME1 + (TEST_TIME2 - TEST_TIME1) / 2, TEST_TIME2 - 1))); [EOL]     assertEquals(true, test.contains(new Interval(TEST_TIME2 - 1, TEST_TIME2 - 1))); [EOL]     assertEquals(true, test.contains(new Interval(TEST_TIME2 - 2, TEST_TIME2 - 1))); [EOL]     assertEquals(false, test.contains(new Interval(TEST_TIME1, TEST_TIME2 + 1))); [EOL]     assertEquals(false, test.contains(new Interval(TEST_TIME1 - 1, TEST_TIME2 + 1))); [EOL]     assertEquals(false, test.contains(new Interval(TEST_TIME1 + (TEST_TIME2 - TEST_TIME1) / 2, TEST_TIME2 + 1))); [EOL]     assertEquals(false, test.contains(new Interval(TEST_TIME2, TEST_TIME2 + 1))); [EOL]     assertEquals(false, test.contains(new Interval(TEST_TIME2 - 1, TEST_TIME2 + 1))); [EOL]     assertEquals(false, test.contains(new Interval(TEST_TIME1 - 2, TEST_TIME1 - 1))); [EOL]     assertEquals(true, test.contains((ReadableInterval) null)); [EOL] } <line_num>: 231,261
public void testOverlaps_RInterval() { [EOL]     MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); [EOL]     assertEquals(false, test.overlaps(new Interval(TEST_TIME1, TEST_TIME1))); [EOL]     assertEquals(false, test.overlaps(new Interval(TEST_TIME1 - 1, TEST_TIME1))); [EOL]     assertEquals(true, test.overlaps(new Interval(TEST_TIME1, TEST_TIME1 + 1))); [EOL]     assertEquals(true, test.overlaps(new Interval(TEST_TIME1 - 1, TEST_TIME1 + 1))); [EOL]     assertEquals(true, test.overlaps(new Interval(TEST_TIME1 + 1, TEST_TIME1 + 1))); [EOL]     assertEquals(true, test.overlaps(new Interval(TEST_TIME1, TEST_TIME2))); [EOL]     assertEquals(true, test.overlaps(new Interval(TEST_TIME1 - 1, TEST_TIME2))); [EOL]     assertEquals(true, test.overlaps(new Interval(TEST_TIME1 + (TEST_TIME2 - TEST_TIME1) / 2, TEST_TIME2))); [EOL]     assertEquals(false, test.overlaps(new Interval(TEST_TIME2, TEST_TIME2))); [EOL]     assertEquals(true, test.overlaps(new Interval(TEST_TIME2 - 1, TEST_TIME2))); [EOL]     assertEquals(true, test.overlaps(new Interval(TEST_TIME1, TEST_TIME2 + 1))); [EOL]     assertEquals(true, test.overlaps(new Interval(TEST_TIME1 - 1, TEST_TIME2 + 1))); [EOL]     assertEquals(true, test.overlaps(new Interval(TEST_TIME1 + (TEST_TIME2 - TEST_TIME1) / 2, TEST_TIME2 + 1))); [EOL]     assertEquals(false, test.overlaps(new Interval(TEST_TIME2, TEST_TIME2 + 1))); [EOL]     assertEquals(true, test.overlaps(new Interval(TEST_TIME2 - 1, TEST_TIME2 + 1))); [EOL]     assertEquals(false, test.overlaps(new Interval(TEST_TIME1 - 1, TEST_TIME1 - 1))); [EOL]     assertEquals(false, test.overlaps(new Interval(TEST_TIME1 - 1, TEST_TIME1))); [EOL]     assertEquals(true, test.overlaps(new Interval(TEST_TIME1 - 1, TEST_TIME1 + 1))); [EOL]     assertEquals(true, test.overlaps((ReadableInterval) null)); [EOL]     MutableInterval empty = new MutableInterval(TEST_TIME1, TEST_TIME1); [EOL]     assertEquals(false, empty.overlaps(empty)); [EOL]     assertEquals(false, empty.overlaps(test)); [EOL]     assertEquals(false, test.overlaps(empty)); [EOL] } <line_num>: 263,295
public void testIsBefore_long() { [EOL]     MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); [EOL]     assertEquals(false, test.isBefore(TEST_TIME1 - 1)); [EOL]     assertEquals(false, test.isBefore(TEST_TIME1)); [EOL]     assertEquals(false, test.isBefore(TEST_TIME1 + 1)); [EOL]     assertEquals(false, test.isBefore(TEST_TIME2 - 1)); [EOL]     assertEquals(true, test.isBefore(TEST_TIME2)); [EOL]     assertEquals(true, test.isBefore(TEST_TIME2 + 1)); [EOL] } <line_num>: 298,308
public void testIsBeforeNow() { [EOL]     MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); [EOL]     DateTimeUtils.setCurrentMillisFixed(TEST_TIME2 - 1); [EOL]     assertEquals(false, test.isBeforeNow()); [EOL]     DateTimeUtils.setCurrentMillisFixed(TEST_TIME2); [EOL]     assertEquals(true, test.isBeforeNow()); [EOL]     DateTimeUtils.setCurrentMillisFixed(TEST_TIME2 + 1); [EOL]     assertEquals(true, test.isBeforeNow()); [EOL] } <line_num>: 310,319
public void testIsBefore_RI() { [EOL]     MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); [EOL]     assertEquals(false, test.isBefore(new Instant(TEST_TIME1 - 1))); [EOL]     assertEquals(false, test.isBefore(new Instant(TEST_TIME1))); [EOL]     assertEquals(false, test.isBefore(new Instant(TEST_TIME1 + 1))); [EOL]     assertEquals(false, test.isBefore(new Instant(TEST_TIME2 - 1))); [EOL]     assertEquals(true, test.isBefore(new Instant(TEST_TIME2))); [EOL]     assertEquals(true, test.isBefore(new Instant(TEST_TIME2 + 1))); [EOL]     assertEquals(false, test.isBefore((ReadableInstant) null)); [EOL] } <line_num>: 321,333
public void testIsBefore_RInterval() { [EOL]     MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); [EOL]     assertEquals(false, test.isBefore(new Interval(Long.MIN_VALUE, TEST_TIME1 - 1))); [EOL]     assertEquals(false, test.isBefore(new Interval(Long.MIN_VALUE, TEST_TIME1))); [EOL]     assertEquals(false, test.isBefore(new Interval(Long.MIN_VALUE, TEST_TIME1 + 1))); [EOL]     assertEquals(false, test.isBefore(new Interval(TEST_TIME2 - 1, Long.MAX_VALUE))); [EOL]     assertEquals(true, test.isBefore(new Interval(TEST_TIME2, Long.MAX_VALUE))); [EOL]     assertEquals(true, test.isBefore(new Interval(TEST_TIME2 + 1, Long.MAX_VALUE))); [EOL]     assertEquals(false, test.isBefore((ReadableInterval) null)); [EOL] } <line_num>: 335,347
public void testIsAfter_long() { [EOL]     MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); [EOL]     assertEquals(true, test.isAfter(TEST_TIME1 - 1)); [EOL]     assertEquals(false, test.isAfter(TEST_TIME1)); [EOL]     assertEquals(false, test.isAfter(TEST_TIME1 + 1)); [EOL]     assertEquals(false, test.isAfter(TEST_TIME2 - 1)); [EOL]     assertEquals(false, test.isAfter(TEST_TIME2)); [EOL]     assertEquals(false, test.isAfter(TEST_TIME2 + 1)); [EOL] } <line_num>: 350,360
public void testIsAfterNow() { [EOL]     MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); [EOL]     DateTimeUtils.setCurrentMillisFixed(TEST_TIME1 - 1); [EOL]     assertEquals(true, test.isAfterNow()); [EOL]     DateTimeUtils.setCurrentMillisFixed(TEST_TIME1); [EOL]     assertEquals(false, test.isAfterNow()); [EOL]     DateTimeUtils.setCurrentMillisFixed(TEST_TIME1 + 1); [EOL]     assertEquals(false, test.isAfterNow()); [EOL] } <line_num>: 362,371
public void testIsAfter_RI() { [EOL]     MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); [EOL]     assertEquals(true, test.isAfter(new Instant(TEST_TIME1 - 1))); [EOL]     assertEquals(false, test.isAfter(new Instant(TEST_TIME1))); [EOL]     assertEquals(false, test.isAfter(new Instant(TEST_TIME1 + 1))); [EOL]     assertEquals(false, test.isAfter(new Instant(TEST_TIME2 - 1))); [EOL]     assertEquals(false, test.isAfter(new Instant(TEST_TIME2))); [EOL]     assertEquals(false, test.isAfter(new Instant(TEST_TIME2 + 1))); [EOL]     assertEquals(false, test.isAfter((ReadableInstant) null)); [EOL] } <line_num>: 373,385
public void testIsAfter_RInterval() { [EOL]     MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); [EOL]     assertEquals(true, test.isAfter(new Interval(Long.MIN_VALUE, TEST_TIME1 - 1))); [EOL]     assertEquals(true, test.isAfter(new Interval(Long.MIN_VALUE, TEST_TIME1))); [EOL]     assertEquals(false, test.isAfter(new Interval(Long.MIN_VALUE, TEST_TIME1 + 1))); [EOL]     assertEquals(false, test.isAfter(new Interval(TEST_TIME2 - 1, Long.MAX_VALUE))); [EOL]     assertEquals(false, test.isAfter(new Interval(TEST_TIME2, Long.MAX_VALUE))); [EOL]     assertEquals(false, test.isAfter(new Interval(TEST_TIME2 + 1, Long.MAX_VALUE))); [EOL]     assertEquals(false, test.isAfter((ReadableInterval) null)); [EOL] } <line_num>: 387,399
public void testToInterval1() { [EOL]     MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2, COPTIC_PARIS); [EOL]     Interval result = test.toInterval(); [EOL]     assertEquals(test, result); [EOL] } <line_num>: 402,406
public void testToMutableInterval1() { [EOL]     MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2, COPTIC_PARIS); [EOL]     MutableInterval result = test.toMutableInterval(); [EOL]     assertEquals(test, result); [EOL]     assertNotSame(test, result); [EOL] } <line_num>: 409,414
public void testToPeriod() { [EOL]     DateTime dt1 = new DateTime(2004, 6, 9, 7, 8, 9, 10, COPTIC_PARIS); [EOL]     DateTime dt2 = new DateTime(2005, 8, 13, 12, 14, 16, 18, COPTIC_PARIS); [EOL]     MutableInterval base = new MutableInterval(dt1, dt2); [EOL]     Period test = base.toPeriod(); [EOL]     Period expected = new Period(dt1, dt2, PeriodType.standard()); [EOL]     assertEquals(expected, test); [EOL] } <line_num>: 417,425
public void testToPeriod_PeriodType1() { [EOL]     DateTime dt1 = new DateTime(2004, 6, 9, 7, 8, 9, 10, COPTIC_PARIS); [EOL]     DateTime dt2 = new DateTime(2005, 8, 13, 12, 14, 16, 18, COPTIC_PARIS); [EOL]     MutableInterval base = new MutableInterval(dt1, dt2); [EOL]     Period test = base.toPeriod(null); [EOL]     Period expected = new Period(dt1, dt2, PeriodType.standard()); [EOL]     assertEquals(expected, test); [EOL] } <line_num>: 428,436
public void testToPeriod_PeriodType2() { [EOL]     DateTime dt1 = new DateTime(2004, 6, 9, 7, 8, 9, 10); [EOL]     DateTime dt2 = new DateTime(2005, 8, 13, 12, 14, 16, 18); [EOL]     MutableInterval base = new MutableInterval(dt1, dt2); [EOL]     Period test = base.toPeriod(PeriodType.yearWeekDayTime()); [EOL]     Period expected = new Period(dt1, dt2, PeriodType.yearWeekDayTime()); [EOL]     assertEquals(expected, test); [EOL] } <line_num>: 438,446
public void testSerialization() throws Exception { [EOL]     MutableInterval test = new MutableInterval(TEST_TIME1, TEST_TIME2); [EOL]     ByteArrayOutputStream baos = new ByteArrayOutputStream(); [EOL]     ObjectOutputStream oos = new ObjectOutputStream(baos); [EOL]     oos.writeObject(test); [EOL]     byte[] bytes = baos.toByteArray(); [EOL]     oos.close(); [EOL]     ByteArrayInputStream bais = new ByteArrayInputStream(bytes); [EOL]     ObjectInputStream ois = new ObjectInputStream(bais); [EOL]     MutableInterval result = (MutableInterval) ois.readObject(); [EOL]     ois.close(); [EOL]     assertEquals(test, result); [EOL] } <line_num>: 449,464
public void testToString() { [EOL]     DateTime dt1 = new DateTime(2004, 6, 9, 7, 8, 9, 10, DateTimeZone.UTC); [EOL]     DateTime dt2 = new DateTime(2005, 8, 13, 12, 14, 16, 18, DateTimeZone.UTC); [EOL]     MutableInterval test = new MutableInterval(dt1, dt2); [EOL]     assertEquals("2004-06-09T07:08:09.010Z/2005-08-13T12:14:16.018Z", test.toString()); [EOL] } <line_num>: 467,472
public void testCopy() { [EOL]     MutableInterval test = new MutableInterval(123L, 456L, COPTIC_PARIS); [EOL]     MutableInterval cloned = test.copy(); [EOL]     assertEquals(test, cloned); [EOL]     assertNotSame(test, cloned); [EOL] } <line_num>: 475,480
public void testClone() { [EOL]     MutableInterval test = new MutableInterval(123L, 456L, COPTIC_PARIS); [EOL]     MutableInterval cloned = (MutableInterval) test.clone(); [EOL]     assertEquals(test, cloned); [EOL]     assertNotSame(test, cloned); [EOL] } <line_num>: 481,486