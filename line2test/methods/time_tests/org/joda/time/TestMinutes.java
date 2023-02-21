public TestMinutes(String name) { [EOL]     super(name); [EOL] } <line_num>: 44,46
public static void main(String[] args) { [EOL]     junit.textui.TestRunner.run(suite()); [EOL] } <line_num>: 36,38
public static TestSuite suite() { [EOL]     return new TestSuite(TestMinutes.class); [EOL] } <line_num>: 40,42
protected void setUp() throws Exception { [EOL] } <line_num>: 48,49
protected void tearDown() throws Exception { [EOL] } <line_num>: 51,52
public void testConstants() { [EOL]     assertEquals(0, Minutes.ZERO.getMinutes()); [EOL]     assertEquals(1, Minutes.ONE.getMinutes()); [EOL]     assertEquals(2, Minutes.TWO.getMinutes()); [EOL]     assertEquals(3, Minutes.THREE.getMinutes()); [EOL]     assertEquals(Integer.MAX_VALUE, Minutes.MAX_VALUE.getMinutes()); [EOL]     assertEquals(Integer.MIN_VALUE, Minutes.MIN_VALUE.getMinutes()); [EOL] } <line_num>: 55,62
public void testFactory_minutes_int() { [EOL]     assertSame(Minutes.ZERO, Minutes.minutes(0)); [EOL]     assertSame(Minutes.ONE, Minutes.minutes(1)); [EOL]     assertSame(Minutes.TWO, Minutes.minutes(2)); [EOL]     assertSame(Minutes.THREE, Minutes.minutes(3)); [EOL]     assertSame(Minutes.MAX_VALUE, Minutes.minutes(Integer.MAX_VALUE)); [EOL]     assertSame(Minutes.MIN_VALUE, Minutes.minutes(Integer.MIN_VALUE)); [EOL]     assertEquals(-1, Minutes.minutes(-1).getMinutes()); [EOL]     assertEquals(4, Minutes.minutes(4).getMinutes()); [EOL] } <line_num>: 65,74
public void testFactory_minutesBetween_RInstant() { [EOL]     DateTime start = new DateTime(2006, 6, 9, 12, 3, 0, 0, PARIS); [EOL]     DateTime end1 = new DateTime(2006, 6, 9, 12, 6, 0, 0, PARIS); [EOL]     DateTime end2 = new DateTime(2006, 6, 9, 12, 9, 0, 0, PARIS); [EOL]     assertEquals(3, Minutes.minutesBetween(start, end1).getMinutes()); [EOL]     assertEquals(0, Minutes.minutesBetween(start, start).getMinutes()); [EOL]     assertEquals(0, Minutes.minutesBetween(end1, end1).getMinutes()); [EOL]     assertEquals(-3, Minutes.minutesBetween(end1, start).getMinutes()); [EOL]     assertEquals(6, Minutes.minutesBetween(start, end2).getMinutes()); [EOL] } <line_num>: 77,87
public void testFactory_minutesBetween_RPartial() { [EOL]     LocalTime start = new LocalTime(12, 3); [EOL]     LocalTime end1 = new LocalTime(12, 6); [EOL]     @SuppressWarnings("deprecation") [EOL]     TimeOfDay end2 = new TimeOfDay(12, 9); [EOL]     assertEquals(3, Minutes.minutesBetween(start, end1).getMinutes()); [EOL]     assertEquals(0, Minutes.minutesBetween(start, start).getMinutes()); [EOL]     assertEquals(0, Minutes.minutesBetween(end1, end1).getMinutes()); [EOL]     assertEquals(-3, Minutes.minutesBetween(end1, start).getMinutes()); [EOL]     assertEquals(6, Minutes.minutesBetween(start, end2).getMinutes()); [EOL] } <line_num>: 89,100
public void testFactory_minutesIn_RInterval() { [EOL]     DateTime start = new DateTime(2006, 6, 9, 12, 3, 0, 0, PARIS); [EOL]     DateTime end1 = new DateTime(2006, 6, 9, 12, 6, 0, 0, PARIS); [EOL]     DateTime end2 = new DateTime(2006, 6, 9, 12, 9, 0, 0, PARIS); [EOL]     assertEquals(0, Minutes.minutesIn((ReadableInterval) null).getMinutes()); [EOL]     assertEquals(3, Minutes.minutesIn(new Interval(start, end1)).getMinutes()); [EOL]     assertEquals(0, Minutes.minutesIn(new Interval(start, start)).getMinutes()); [EOL]     assertEquals(0, Minutes.minutesIn(new Interval(end1, end1)).getMinutes()); [EOL]     assertEquals(6, Minutes.minutesIn(new Interval(start, end2)).getMinutes()); [EOL] } <line_num>: 102,112
public void testFactory_standardMinutesIn_RPeriod() { [EOL]     assertEquals(0, Minutes.standardMinutesIn((ReadablePeriod) null).getMinutes()); [EOL]     assertEquals(0, Minutes.standardMinutesIn(Period.ZERO).getMinutes()); [EOL]     assertEquals(1, Minutes.standardMinutesIn(new Period(0, 0, 0, 0, 0, 1, 0, 0)).getMinutes()); [EOL]     assertEquals(123, Minutes.standardMinutesIn(Period.minutes(123)).getMinutes()); [EOL]     assertEquals(-987, Minutes.standardMinutesIn(Period.minutes(-987)).getMinutes()); [EOL]     assertEquals(1, Minutes.standardMinutesIn(Period.seconds(119)).getMinutes()); [EOL]     assertEquals(2, Minutes.standardMinutesIn(Period.seconds(120)).getMinutes()); [EOL]     assertEquals(2, Minutes.standardMinutesIn(Period.seconds(121)).getMinutes()); [EOL]     assertEquals(120, Minutes.standardMinutesIn(Period.hours(2)).getMinutes()); [EOL]     try { [EOL]         Minutes.standardMinutesIn(Period.months(1)); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL] } <line_num>: 114,130
public void testFactory_parseMinutes_String() { [EOL]     assertEquals(0, Minutes.parseMinutes((String) null).getMinutes()); [EOL]     assertEquals(0, Minutes.parseMinutes("PT0M").getMinutes()); [EOL]     assertEquals(1, Minutes.parseMinutes("PT1M").getMinutes()); [EOL]     assertEquals(-3, Minutes.parseMinutes("PT-3M").getMinutes()); [EOL]     assertEquals(2, Minutes.parseMinutes("P0Y0M0DT2M").getMinutes()); [EOL]     assertEquals(2, Minutes.parseMinutes("PT0H2M").getMinutes()); [EOL]     try { [EOL]         Minutes.parseMinutes("P1Y1D"); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL]     try { [EOL]         Minutes.parseMinutes("P1DT1M"); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL] } <line_num>: 132,151
public void testGetMethods() { [EOL]     Minutes test = Minutes.minutes(20); [EOL]     assertEquals(20, test.getMinutes()); [EOL] } <line_num>: 154,157
public void testGetFieldType() { [EOL]     Minutes test = Minutes.minutes(20); [EOL]     assertEquals(DurationFieldType.minutes(), test.getFieldType()); [EOL] } <line_num>: 159,162
public void testGetPeriodType() { [EOL]     Minutes test = Minutes.minutes(20); [EOL]     assertEquals(PeriodType.minutes(), test.getPeriodType()); [EOL] } <line_num>: 164,167
public void testIsGreaterThan() { [EOL]     assertEquals(true, Minutes.THREE.isGreaterThan(Minutes.TWO)); [EOL]     assertEquals(false, Minutes.THREE.isGreaterThan(Minutes.THREE)); [EOL]     assertEquals(false, Minutes.TWO.isGreaterThan(Minutes.THREE)); [EOL]     assertEquals(true, Minutes.ONE.isGreaterThan(null)); [EOL]     assertEquals(false, Minutes.minutes(-1).isGreaterThan(null)); [EOL] } <line_num>: 170,176
public void testIsLessThan() { [EOL]     assertEquals(false, Minutes.THREE.isLessThan(Minutes.TWO)); [EOL]     assertEquals(false, Minutes.THREE.isLessThan(Minutes.THREE)); [EOL]     assertEquals(true, Minutes.TWO.isLessThan(Minutes.THREE)); [EOL]     assertEquals(false, Minutes.ONE.isLessThan(null)); [EOL]     assertEquals(true, Minutes.minutes(-1).isLessThan(null)); [EOL] } <line_num>: 178,184
public void testToString() { [EOL]     Minutes test = Minutes.minutes(20); [EOL]     assertEquals("PT20M", test.toString()); [EOL]     test = Minutes.minutes(-20); [EOL]     assertEquals("PT-20M", test.toString()); [EOL] } <line_num>: 187,193
public void testSerialization() throws Exception { [EOL]     Minutes test = Minutes.THREE; [EOL]     ByteArrayOutputStream baos = new ByteArrayOutputStream(); [EOL]     ObjectOutputStream oos = new ObjectOutputStream(baos); [EOL]     oos.writeObject(test); [EOL]     byte[] bytes = baos.toByteArray(); [EOL]     oos.close(); [EOL]     ByteArrayInputStream bais = new ByteArrayInputStream(bytes); [EOL]     ObjectInputStream ois = new ObjectInputStream(bais); [EOL]     Minutes result = (Minutes) ois.readObject(); [EOL]     ois.close(); [EOL]     assertSame(test, result); [EOL] } <line_num>: 196,211
public void testToStandardWeeks() { [EOL]     Minutes test = Minutes.minutes(60 * 24 * 7 * 2); [EOL]     Weeks expected = Weeks.weeks(2); [EOL]     assertEquals(expected, test.toStandardWeeks()); [EOL] } <line_num>: 214,218
public void testToStandardDays() { [EOL]     Minutes test = Minutes.minutes(60 * 24 * 2); [EOL]     Days expected = Days.days(2); [EOL]     assertEquals(expected, test.toStandardDays()); [EOL] } <line_num>: 220,224
public void testToStandardHours() { [EOL]     Minutes test = Minutes.minutes(3 * 60); [EOL]     Hours expected = Hours.hours(3); [EOL]     assertEquals(expected, test.toStandardHours()); [EOL] } <line_num>: 226,230
public void testToStandardSeconds() { [EOL]     Minutes test = Minutes.minutes(3); [EOL]     Seconds expected = Seconds.seconds(3 * 60); [EOL]     assertEquals(expected, test.toStandardSeconds()); [EOL]     try { [EOL]         Minutes.MAX_VALUE.toStandardSeconds(); [EOL]         fail(); [EOL]     } catch (ArithmeticException ex) { [EOL]     } [EOL] } <line_num>: 232,243
public void testToStandardDuration() { [EOL]     Minutes test = Minutes.minutes(20); [EOL]     Duration expected = new Duration(20L * DateTimeConstants.MILLIS_PER_MINUTE); [EOL]     assertEquals(expected, test.toStandardDuration()); [EOL]     expected = new Duration(((long) Integer.MAX_VALUE) * DateTimeConstants.MILLIS_PER_MINUTE); [EOL]     assertEquals(expected, Minutes.MAX_VALUE.toStandardDuration()); [EOL] } <line_num>: 245,252
public void testPlus_int() { [EOL]     Minutes test2 = Minutes.minutes(2); [EOL]     Minutes result = test2.plus(3); [EOL]     assertEquals(2, test2.getMinutes()); [EOL]     assertEquals(5, result.getMinutes()); [EOL]     assertEquals(1, Minutes.ONE.plus(0).getMinutes()); [EOL]     try { [EOL]         Minutes.MAX_VALUE.plus(1); [EOL]         fail(); [EOL]     } catch (ArithmeticException ex) { [EOL]     } [EOL] } <line_num>: 255,269
public void testPlus_Minutes() { [EOL]     Minutes test2 = Minutes.minutes(2); [EOL]     Minutes test3 = Minutes.minutes(3); [EOL]     Minutes result = test2.plus(test3); [EOL]     assertEquals(2, test2.getMinutes()); [EOL]     assertEquals(3, test3.getMinutes()); [EOL]     assertEquals(5, result.getMinutes()); [EOL]     assertEquals(1, Minutes.ONE.plus(Minutes.ZERO).getMinutes()); [EOL]     assertEquals(1, Minutes.ONE.plus((Minutes) null).getMinutes()); [EOL]     try { [EOL]         Minutes.MAX_VALUE.plus(Minutes.ONE); [EOL]         fail(); [EOL]     } catch (ArithmeticException ex) { [EOL]     } [EOL] } <line_num>: 271,288
public void testMinus_int() { [EOL]     Minutes test2 = Minutes.minutes(2); [EOL]     Minutes result = test2.minus(3); [EOL]     assertEquals(2, test2.getMinutes()); [EOL]     assertEquals(-1, result.getMinutes()); [EOL]     assertEquals(1, Minutes.ONE.minus(0).getMinutes()); [EOL]     try { [EOL]         Minutes.MIN_VALUE.minus(1); [EOL]         fail(); [EOL]     } catch (ArithmeticException ex) { [EOL]     } [EOL] } <line_num>: 290,304
public void testMinus_Minutes() { [EOL]     Minutes test2 = Minutes.minutes(2); [EOL]     Minutes test3 = Minutes.minutes(3); [EOL]     Minutes result = test2.minus(test3); [EOL]     assertEquals(2, test2.getMinutes()); [EOL]     assertEquals(3, test3.getMinutes()); [EOL]     assertEquals(-1, result.getMinutes()); [EOL]     assertEquals(1, Minutes.ONE.minus(Minutes.ZERO).getMinutes()); [EOL]     assertEquals(1, Minutes.ONE.minus((Minutes) null).getMinutes()); [EOL]     try { [EOL]         Minutes.MIN_VALUE.minus(Minutes.ONE); [EOL]         fail(); [EOL]     } catch (ArithmeticException ex) { [EOL]     } [EOL] } <line_num>: 306,323
public void testMultipliedBy_int() { [EOL]     Minutes test = Minutes.minutes(2); [EOL]     assertEquals(6, test.multipliedBy(3).getMinutes()); [EOL]     assertEquals(2, test.getMinutes()); [EOL]     assertEquals(-6, test.multipliedBy(-3).getMinutes()); [EOL]     assertSame(test, test.multipliedBy(1)); [EOL]     Minutes halfMax = Minutes.minutes(Integer.MAX_VALUE / 2 + 1); [EOL]     try { [EOL]         halfMax.multipliedBy(2); [EOL]         fail(); [EOL]     } catch (ArithmeticException ex) { [EOL]     } [EOL] } <line_num>: 325,339
public void testDividedBy_int() { [EOL]     Minutes test = Minutes.minutes(12); [EOL]     assertEquals(6, test.dividedBy(2).getMinutes()); [EOL]     assertEquals(12, test.getMinutes()); [EOL]     assertEquals(4, test.dividedBy(3).getMinutes()); [EOL]     assertEquals(3, test.dividedBy(4).getMinutes()); [EOL]     assertEquals(2, test.dividedBy(5).getMinutes()); [EOL]     assertEquals(2, test.dividedBy(6).getMinutes()); [EOL]     assertSame(test, test.dividedBy(1)); [EOL]     try { [EOL]         Minutes.ONE.dividedBy(0); [EOL]         fail(); [EOL]     } catch (ArithmeticException ex) { [EOL]     } [EOL] } <line_num>: 341,357
public void testNegated() { [EOL]     Minutes test = Minutes.minutes(12); [EOL]     assertEquals(-12, test.negated().getMinutes()); [EOL]     assertEquals(12, test.getMinutes()); [EOL]     try { [EOL]         Minutes.MIN_VALUE.negated(); [EOL]         fail(); [EOL]     } catch (ArithmeticException ex) { [EOL]     } [EOL] } <line_num>: 359,370
public void testAddToLocalDate() { [EOL]     Minutes test = Minutes.minutes(26); [EOL]     LocalDateTime date = new LocalDateTime(2006, 6, 1, 0, 0, 0, 0); [EOL]     LocalDateTime expected = new LocalDateTime(2006, 6, 1, 0, 26, 0, 0); [EOL]     assertEquals(expected, date.plus(test)); [EOL] } <line_num>: 373,378