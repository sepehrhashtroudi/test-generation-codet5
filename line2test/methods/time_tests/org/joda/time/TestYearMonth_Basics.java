public TestYearMonth_Basics(String name) { [EOL]     super(name); [EOL] } <line_num>: 71,73
public static void main(String[] args) { [EOL]     junit.textui.TestRunner.run(suite()); [EOL] } <line_num>: 63,65
public static TestSuite suite() { [EOL]     return new TestSuite(TestYearMonth_Basics.class); [EOL] } <line_num>: 67,69
protected void setUp() throws Exception { [EOL]     DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW); [EOL]     zone = DateTimeZone.getDefault(); [EOL]     DateTimeZone.setDefault(LONDON); [EOL] } <line_num>: 75,79
protected void tearDown() throws Exception { [EOL]     DateTimeUtils.setCurrentMillisSystem(); [EOL]     DateTimeZone.setDefault(zone); [EOL]     zone = null; [EOL] } <line_num>: 81,85
public void testGet() { [EOL]     YearMonth test = new YearMonth(); [EOL]     assertEquals(1970, test.get(DateTimeFieldType.year())); [EOL]     assertEquals(6, test.get(DateTimeFieldType.monthOfYear())); [EOL]     try { [EOL]         test.get(null); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL]     try { [EOL]         test.get(DateTimeFieldType.dayOfMonth()); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL] } <line_num>: 88,100
public void testSize() { [EOL]     YearMonth test = new YearMonth(); [EOL]     assertEquals(2, test.size()); [EOL] } <line_num>: 102,105
public void testGetFieldType() { [EOL]     YearMonth test = new YearMonth(COPTIC_PARIS); [EOL]     assertSame(DateTimeFieldType.year(), test.getFieldType(0)); [EOL]     assertSame(DateTimeFieldType.monthOfYear(), test.getFieldType(1)); [EOL]     try { [EOL]         test.getFieldType(-1); [EOL]     } catch (IndexOutOfBoundsException ex) { [EOL]     } [EOL]     try { [EOL]         test.getFieldType(2); [EOL]     } catch (IndexOutOfBoundsException ex) { [EOL]     } [EOL] } <line_num>: 107,117
public void testGetFieldTypes() { [EOL]     YearMonth test = new YearMonth(COPTIC_PARIS); [EOL]     DateTimeFieldType[] fields = test.getFieldTypes(); [EOL]     assertEquals(2, fields.length); [EOL]     assertSame(DateTimeFieldType.year(), fields[0]); [EOL]     assertSame(DateTimeFieldType.monthOfYear(), fields[1]); [EOL]     assertNotSame(test.getFieldTypes(), test.getFieldTypes()); [EOL] } <line_num>: 119,126
public void testGetField() { [EOL]     YearMonth test = new YearMonth(COPTIC_PARIS); [EOL]     assertSame(COPTIC_UTC.year(), test.getField(0)); [EOL]     assertSame(COPTIC_UTC.monthOfYear(), test.getField(1)); [EOL]     try { [EOL]         test.getField(-1); [EOL]     } catch (IndexOutOfBoundsException ex) { [EOL]     } [EOL]     try { [EOL]         test.getField(2); [EOL]     } catch (IndexOutOfBoundsException ex) { [EOL]     } [EOL] } <line_num>: 128,138
public void testGetFields() { [EOL]     YearMonth test = new YearMonth(COPTIC_PARIS); [EOL]     DateTimeField[] fields = test.getFields(); [EOL]     assertEquals(2, fields.length); [EOL]     assertSame(COPTIC_UTC.year(), fields[0]); [EOL]     assertSame(COPTIC_UTC.monthOfYear(), fields[1]); [EOL]     assertNotSame(test.getFields(), test.getFields()); [EOL] } <line_num>: 140,147
public void testGetValue() { [EOL]     YearMonth test = new YearMonth(); [EOL]     assertEquals(1970, test.getValue(0)); [EOL]     assertEquals(6, test.getValue(1)); [EOL]     try { [EOL]         test.getValue(-1); [EOL]     } catch (IndexOutOfBoundsException ex) { [EOL]     } [EOL]     try { [EOL]         test.getValue(2); [EOL]     } catch (IndexOutOfBoundsException ex) { [EOL]     } [EOL] } <line_num>: 149,159
public void testGetValues() { [EOL]     YearMonth test = new YearMonth(); [EOL]     int[] values = test.getValues(); [EOL]     assertEquals(2, values.length); [EOL]     assertEquals(1970, values[0]); [EOL]     assertEquals(6, values[1]); [EOL]     assertNotSame(test.getValues(), test.getValues()); [EOL] } <line_num>: 161,168
public void testIsSupported() { [EOL]     YearMonth test = new YearMonth(COPTIC_PARIS); [EOL]     assertEquals(true, test.isSupported(DateTimeFieldType.year())); [EOL]     assertEquals(true, test.isSupported(DateTimeFieldType.monthOfYear())); [EOL]     assertEquals(false, test.isSupported(DateTimeFieldType.dayOfMonth())); [EOL]     assertEquals(false, test.isSupported(DateTimeFieldType.hourOfDay())); [EOL] } <line_num>: 170,176
public void testEqualsHashCode() { [EOL]     YearMonth test1 = new YearMonth(1970, 6, COPTIC_PARIS); [EOL]     YearMonth test2 = new YearMonth(1970, 6, COPTIC_PARIS); [EOL]     assertEquals(true, test1.equals(test2)); [EOL]     assertEquals(true, test2.equals(test1)); [EOL]     assertEquals(true, test1.equals(test1)); [EOL]     assertEquals(true, test2.equals(test2)); [EOL]     assertEquals(true, test1.hashCode() == test2.hashCode()); [EOL]     assertEquals(true, test1.hashCode() == test1.hashCode()); [EOL]     assertEquals(true, test2.hashCode() == test2.hashCode()); [EOL]     YearMonth test3 = new YearMonth(1971, 6); [EOL]     assertEquals(false, test1.equals(test3)); [EOL]     assertEquals(false, test2.equals(test3)); [EOL]     assertEquals(false, test3.equals(test1)); [EOL]     assertEquals(false, test3.equals(test2)); [EOL]     assertEquals(false, test1.hashCode() == test3.hashCode()); [EOL]     assertEquals(false, test2.hashCode() == test3.hashCode()); [EOL]     assertEquals(false, test1.equals("Hello")); [EOL]     assertEquals(true, test1.equals(new MockYM())); [EOL]     assertEquals(false, test1.equals(MockPartial.EMPTY_INSTANCE)); [EOL] } <line_num>: 178,200
public Chronology getChronology() { [EOL]     return COPTIC_UTC; [EOL] } <line_num>: 203,205
public DateTimeField[] getFields() { [EOL]     return new DateTimeField[] { COPTIC_UTC.year(), COPTIC_UTC.monthOfYear() }; [EOL] } <line_num>: 206,211
public int[] getValues() { [EOL]     return new int[] { 1970, 6 }; [EOL] } <line_num>: 212,214
public void testCompareTo() { [EOL]     YearMonth test1 = new YearMonth(2005, 6); [EOL]     YearMonth test1a = new YearMonth(2005, 6); [EOL]     assertEquals(0, test1.compareTo(test1a)); [EOL]     assertEquals(0, test1a.compareTo(test1)); [EOL]     assertEquals(0, test1.compareTo(test1)); [EOL]     assertEquals(0, test1a.compareTo(test1a)); [EOL]     YearMonth test2 = new YearMonth(2005, 7); [EOL]     assertEquals(-1, test1.compareTo(test2)); [EOL]     assertEquals(+1, test2.compareTo(test1)); [EOL]     YearMonth test3 = new YearMonth(2005, 7, GregorianChronology.getInstanceUTC()); [EOL]     assertEquals(-1, test1.compareTo(test3)); [EOL]     assertEquals(+1, test3.compareTo(test1)); [EOL]     assertEquals(0, test3.compareTo(test2)); [EOL]     DateTimeFieldType[] types = new DateTimeFieldType[] { DateTimeFieldType.year(), DateTimeFieldType.monthOfYear() }; [EOL]     int[] values = new int[] { 2005, 6 }; [EOL]     Partial p = new Partial(types, values); [EOL]     assertEquals(0, test1.compareTo(p)); [EOL]     try { [EOL]         test1.compareTo(null); [EOL]         fail(); [EOL]     } catch (NullPointerException ex) { [EOL]     } [EOL]     try { [EOL]         test1.compareTo(new LocalTime()); [EOL]         fail(); [EOL]     } catch (ClassCastException ex) { [EOL]     } [EOL]     Partial partial = new Partial().with(DateTimeFieldType.centuryOfEra(), 1).with(DateTimeFieldType.halfdayOfDay(), 0).with(DateTimeFieldType.dayOfMonth(), 9); [EOL]     try { [EOL]         new YearMonth(1970, 6).compareTo(partial); [EOL]         fail(); [EOL]     } catch (ClassCastException ex) { [EOL]     } [EOL] } <line_num>: 218,258
public void testIsEqual_YM() { [EOL]     YearMonth test1 = new YearMonth(2005, 6); [EOL]     YearMonth test1a = new YearMonth(2005, 6); [EOL]     assertEquals(true, test1.isEqual(test1a)); [EOL]     assertEquals(true, test1a.isEqual(test1)); [EOL]     assertEquals(true, test1.isEqual(test1)); [EOL]     assertEquals(true, test1a.isEqual(test1a)); [EOL]     YearMonth test2 = new YearMonth(2005, 7); [EOL]     assertEquals(false, test1.isEqual(test2)); [EOL]     assertEquals(false, test2.isEqual(test1)); [EOL]     YearMonth test3 = new YearMonth(2005, 7, GregorianChronology.getInstanceUTC()); [EOL]     assertEquals(false, test1.isEqual(test3)); [EOL]     assertEquals(false, test3.isEqual(test1)); [EOL]     assertEquals(true, test3.isEqual(test2)); [EOL]     try { [EOL]         new YearMonth(2005, 7).isEqual(null); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL] } <line_num>: 261,282
public void testIsBefore_YM() { [EOL]     YearMonth test1 = new YearMonth(2005, 6); [EOL]     YearMonth test1a = new YearMonth(2005, 6); [EOL]     assertEquals(false, test1.isBefore(test1a)); [EOL]     assertEquals(false, test1a.isBefore(test1)); [EOL]     assertEquals(false, test1.isBefore(test1)); [EOL]     assertEquals(false, test1a.isBefore(test1a)); [EOL]     YearMonth test2 = new YearMonth(2005, 7); [EOL]     assertEquals(true, test1.isBefore(test2)); [EOL]     assertEquals(false, test2.isBefore(test1)); [EOL]     YearMonth test3 = new YearMonth(2005, 7, GregorianChronology.getInstanceUTC()); [EOL]     assertEquals(true, test1.isBefore(test3)); [EOL]     assertEquals(false, test3.isBefore(test1)); [EOL]     assertEquals(false, test3.isBefore(test2)); [EOL]     try { [EOL]         new YearMonth(2005, 7).isBefore(null); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL] } <line_num>: 285,306
public void testIsAfter_YM() { [EOL]     YearMonth test1 = new YearMonth(2005, 6); [EOL]     YearMonth test1a = new YearMonth(2005, 6); [EOL]     assertEquals(false, test1.isAfter(test1a)); [EOL]     assertEquals(false, test1a.isAfter(test1)); [EOL]     assertEquals(false, test1.isAfter(test1)); [EOL]     assertEquals(false, test1a.isAfter(test1a)); [EOL]     YearMonth test2 = new YearMonth(2005, 7); [EOL]     assertEquals(false, test1.isAfter(test2)); [EOL]     assertEquals(true, test2.isAfter(test1)); [EOL]     YearMonth test3 = new YearMonth(2005, 7, GregorianChronology.getInstanceUTC()); [EOL]     assertEquals(false, test1.isAfter(test3)); [EOL]     assertEquals(true, test3.isAfter(test1)); [EOL]     assertEquals(false, test3.isAfter(test2)); [EOL]     try { [EOL]         new YearMonth(2005, 7).isAfter(null); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL] } <line_num>: 309,330
public void testWithChronologyRetainFields_Chrono() { [EOL]     YearMonth base = new YearMonth(2005, 6, COPTIC_PARIS); [EOL]     YearMonth test = base.withChronologyRetainFields(BUDDHIST_TOKYO); [EOL]     check(base, 2005, 6); [EOL]     assertEquals(COPTIC_UTC, base.getChronology()); [EOL]     check(test, 2005, 6); [EOL]     assertEquals(BUDDHIST_UTC, test.getChronology()); [EOL] } <line_num>: 333,340
public void testWithChronologyRetainFields_sameChrono() { [EOL]     YearMonth base = new YearMonth(2005, 6, COPTIC_PARIS); [EOL]     YearMonth test = base.withChronologyRetainFields(COPTIC_TOKYO); [EOL]     assertSame(base, test); [EOL] } <line_num>: 342,346
public void testWithChronologyRetainFields_nullChrono() { [EOL]     YearMonth base = new YearMonth(2005, 6, COPTIC_PARIS); [EOL]     YearMonth test = base.withChronologyRetainFields(null); [EOL]     check(base, 2005, 6); [EOL]     assertEquals(COPTIC_UTC, base.getChronology()); [EOL]     check(test, 2005, 6); [EOL]     assertEquals(ISO_UTC, test.getChronology()); [EOL] } <line_num>: 348,355
public void testWithChronologyRetainFields_invalidInNewChrono() { [EOL]     YearMonth base = new YearMonth(2005, 13, COPTIC_UTC); [EOL]     try { [EOL]         base.withChronologyRetainFields(ISO_UTC); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL] } <line_num>: 357,365
public void testWithField() { [EOL]     YearMonth test = new YearMonth(2004, 6); [EOL]     YearMonth result = test.withField(DateTimeFieldType.year(), 2006); [EOL]     assertEquals(new YearMonth(2004, 6), test); [EOL]     assertEquals(new YearMonth(2006, 6), result); [EOL] } <line_num>: 368,374
public void testWithField_nullField() { [EOL]     YearMonth test = new YearMonth(2004, 6); [EOL]     try { [EOL]         test.withField(null, 6); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL] } <line_num>: 376,382
public void testWithField_unknownField() { [EOL]     YearMonth test = new YearMonth(2004, 6); [EOL]     try { [EOL]         test.withField(DateTimeFieldType.hourOfDay(), 6); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL] } <line_num>: 384,390
public void testWithField_same() { [EOL]     YearMonth test = new YearMonth(2004, 6); [EOL]     YearMonth result = test.withField(DateTimeFieldType.year(), 2004); [EOL]     assertEquals(new YearMonth(2004, 6), test); [EOL]     assertSame(test, result); [EOL] } <line_num>: 392,397
public void testWithFieldAdded() { [EOL]     YearMonth test = new YearMonth(2004, 6); [EOL]     YearMonth result = test.withFieldAdded(DurationFieldType.years(), 6); [EOL]     assertEquals(new YearMonth(2004, 6), test); [EOL]     assertEquals(new YearMonth(2010, 6), result); [EOL] } <line_num>: 400,406
public void testWithFieldAdded_nullField_zero() { [EOL]     YearMonth test = new YearMonth(2004, 6); [EOL]     try { [EOL]         test.withFieldAdded(null, 0); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL] } <line_num>: 408,414
public void testWithFieldAdded_nullField_nonZero() { [EOL]     YearMonth test = new YearMonth(2004, 6); [EOL]     try { [EOL]         test.withFieldAdded(null, 6); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL] } <line_num>: 416,422
public void testWithFieldAdded_zero() { [EOL]     YearMonth test = new YearMonth(2004, 6); [EOL]     YearMonth result = test.withFieldAdded(DurationFieldType.years(), 0); [EOL]     assertSame(test, result); [EOL] } <line_num>: 424,428
public void testWithFieldAdded_unknownField() { [EOL]     YearMonth test = new YearMonth(2004, 6); [EOL]     try { [EOL]         test.withFieldAdded(DurationFieldType.hours(), 6); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL] } <line_num>: 430,436
public void testPlus_RP() { [EOL]     YearMonth test = new YearMonth(2002, 5, BuddhistChronology.getInstance()); [EOL]     YearMonth result = test.plus(new Period(1, 2, 3, 4, 5, 6, 7, 8)); [EOL]     YearMonth expected = new YearMonth(2003, 7, BuddhistChronology.getInstance()); [EOL]     assertEquals(expected, result); [EOL]     result = test.plus((ReadablePeriod) null); [EOL]     assertSame(test, result); [EOL] } <line_num>: 439,447
public void testPlusYears_int() { [EOL]     YearMonth test = new YearMonth(2002, 5, BuddhistChronology.getInstance()); [EOL]     YearMonth result = test.plusYears(1); [EOL]     YearMonth expected = new YearMonth(2003, 5, BuddhistChronology.getInstance()); [EOL]     assertEquals(expected, result); [EOL]     result = test.plusYears(0); [EOL]     assertSame(test, result); [EOL] } <line_num>: 449,457
public void testPlusMonths_int() { [EOL]     YearMonth test = new YearMonth(2002, 5, BuddhistChronology.getInstance()); [EOL]     YearMonth result = test.plusMonths(1); [EOL]     YearMonth expected = new YearMonth(2002, 6, BuddhistChronology.getInstance()); [EOL]     assertEquals(expected, result); [EOL]     result = test.plusMonths(0); [EOL]     assertSame(test, result); [EOL] } <line_num>: 459,467
public void testMinus_RP() { [EOL]     YearMonth test = new YearMonth(2002, 5, BuddhistChronology.getInstance()); [EOL]     YearMonth result = test.minus(new Period(1, 1, 1, 1, 1, 1, 1, 1)); [EOL]     YearMonth expected = new YearMonth(2001, 4, BuddhistChronology.getInstance()); [EOL]     assertEquals(expected, result); [EOL]     result = test.minus((ReadablePeriod) null); [EOL]     assertSame(test, result); [EOL] } <line_num>: 470,478
public void testMinusYears_int() { [EOL]     YearMonth test = new YearMonth(2002, 5, BuddhistChronology.getInstance()); [EOL]     YearMonth result = test.minusYears(1); [EOL]     YearMonth expected = new YearMonth(2001, 5, BuddhistChronology.getInstance()); [EOL]     assertEquals(expected, result); [EOL]     result = test.minusYears(0); [EOL]     assertSame(test, result); [EOL] } <line_num>: 480,488
public void testMinusMonths_int() { [EOL]     YearMonth test = new YearMonth(2002, 5, BuddhistChronology.getInstance()); [EOL]     YearMonth result = test.minusMonths(1); [EOL]     YearMonth expected = new YearMonth(2002, 4, BuddhistChronology.getInstance()); [EOL]     assertEquals(expected, result); [EOL]     result = test.minusMonths(0); [EOL]     assertSame(test, result); [EOL] } <line_num>: 490,498
public void testToLocalDate() { [EOL]     YearMonth base = new YearMonth(2005, 6, COPTIC_UTC); [EOL]     LocalDate test = base.toLocalDate(9); [EOL]     assertEquals(new LocalDate(2005, 6, 9, COPTIC_UTC), test); [EOL]     try { [EOL]         base.toLocalDate(0); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL] } <line_num>: 501,509
public void testToDateTime_RI() { [EOL]     YearMonth base = new YearMonth(2005, 6, COPTIC_PARIS); [EOL]     DateTime dt = new DateTime(2002, 1, 3, 4, 5, 6, 7); [EOL]     DateTime test = base.toDateTime(dt); [EOL]     check(base, 2005, 6); [EOL]     DateTime expected = dt; [EOL]     expected = expected.year().setCopy(2005); [EOL]     expected = expected.monthOfYear().setCopy(6); [EOL]     assertEquals(expected, test); [EOL] } <line_num>: 512,522
public void testToDateTime_nullRI() { [EOL]     YearMonth base = new YearMonth(2005, 6); [EOL]     DateTime dt = new DateTime(2002, 1, 3, 4, 5, 6, 7); [EOL]     DateTimeUtils.setCurrentMillisFixed(dt.getMillis()); [EOL]     DateTime test = base.toDateTime((ReadableInstant) null); [EOL]     check(base, 2005, 6); [EOL]     DateTime expected = dt; [EOL]     expected = expected.year().setCopy(2005); [EOL]     expected = expected.monthOfYear().setCopy(6); [EOL]     assertEquals(expected, test); [EOL] } <line_num>: 524,535
public void testToInterval() { [EOL]     YearMonth base = new YearMonth(2005, 6, COPTIC_PARIS); [EOL]     Interval test = base.toInterval(); [EOL]     check(base, 2005, 6); [EOL]     DateTime start = new DateTime(2005, 6, 1, 0, 0, COPTIC_LONDON); [EOL]     DateTime end = new DateTime(2005, 7, 1, 0, 0, COPTIC_LONDON); [EOL]     Interval expected = new Interval(start, end); [EOL]     assertEquals(expected, test); [EOL] } <line_num>: 538,546
public void testToInterval_Zone() { [EOL]     YearMonth base = new YearMonth(2005, 6, COPTIC_PARIS); [EOL]     Interval test = base.toInterval(TOKYO); [EOL]     check(base, 2005, 6); [EOL]     DateTime start = new DateTime(2005, 6, 1, 0, 0, COPTIC_TOKYO); [EOL]     DateTime end = new DateTime(2005, 7, 1, 0, 0, COPTIC_TOKYO); [EOL]     Interval expected = new Interval(start, end); [EOL]     assertEquals(expected, test); [EOL] } <line_num>: 549,557
public void testToInterval_nullZone() { [EOL]     YearMonth base = new YearMonth(2005, 6, COPTIC_PARIS); [EOL]     Interval test = base.toInterval(null); [EOL]     check(base, 2005, 6); [EOL]     DateTime start = new DateTime(2005, 6, 1, 0, 0, COPTIC_LONDON); [EOL]     DateTime end = new DateTime(2005, 7, 1, 0, 0, COPTIC_LONDON); [EOL]     Interval expected = new Interval(start, end); [EOL]     assertEquals(expected, test); [EOL] } <line_num>: 559,567
public void testWithers() { [EOL]     YearMonth test = new YearMonth(1970, 6); [EOL]     check(test.withYear(2000), 2000, 6); [EOL]     check(test.withMonthOfYear(2), 1970, 2); [EOL]     try { [EOL]         test.withMonthOfYear(0); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL]     try { [EOL]         test.withMonthOfYear(13); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL] } <line_num>: 570,582
public void testProperty() { [EOL]     YearMonth test = new YearMonth(2005, 6); [EOL]     assertEquals(test.year(), test.property(DateTimeFieldType.year())); [EOL]     assertEquals(test.monthOfYear(), test.property(DateTimeFieldType.monthOfYear())); [EOL]     try { [EOL]         test.property(DateTimeFieldType.millisOfDay()); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL]     try { [EOL]         test.property(null); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL] } <line_num>: 585,597
public void testSerialization() throws Exception { [EOL]     YearMonth test = new YearMonth(1972, 6, COPTIC_PARIS); [EOL]     ByteArrayOutputStream baos = new ByteArrayOutputStream(); [EOL]     ObjectOutputStream oos = new ObjectOutputStream(baos); [EOL]     oos.writeObject(test); [EOL]     byte[] bytes = baos.toByteArray(); [EOL]     oos.close(); [EOL]     ByteArrayInputStream bais = new ByteArrayInputStream(bytes); [EOL]     ObjectInputStream ois = new ObjectInputStream(bais); [EOL]     YearMonth result = (YearMonth) ois.readObject(); [EOL]     ois.close(); [EOL]     assertEquals(test, result); [EOL]     assertTrue(Arrays.equals(test.getValues(), result.getValues())); [EOL]     assertTrue(Arrays.equals(test.getFields(), result.getFields())); [EOL]     assertEquals(test.getChronology(), result.getChronology()); [EOL] } <line_num>: 600,618
public void testToString() { [EOL]     YearMonth test = new YearMonth(2002, 6); [EOL]     assertEquals("2002-06", test.toString()); [EOL] } <line_num>: 621,624
public void testToString_String() { [EOL]     YearMonth test = new YearMonth(2002, 6); [EOL]     assertEquals("2002 \ufffd\ufffd", test.toString("yyyy HH")); [EOL]     assertEquals("2002-06", test.toString((String) null)); [EOL] } <line_num>: 627,631
public void testToString_String_Locale() { [EOL]     YearMonth test = new YearMonth(2002, 6); [EOL]     assertEquals("\ufffd \ufffd/6", test.toString("EEE d/M", Locale.ENGLISH)); [EOL]     assertEquals("\ufffd \ufffd/6", test.toString("EEE d/M", Locale.FRENCH)); [EOL]     assertEquals("2002-06", test.toString(null, Locale.ENGLISH)); [EOL]     assertEquals("\ufffd \ufffd/6", test.toString("EEE d/M", null)); [EOL]     assertEquals("2002-06", test.toString(null, null)); [EOL] } <line_num>: 634,641
public void testToString_DTFormatter() { [EOL]     YearMonth test = new YearMonth(2002, 6); [EOL]     assertEquals("2002 \ufffd\ufffd", test.toString(DateTimeFormat.forPattern("yyyy HH"))); [EOL]     assertEquals("2002-06", test.toString((DateTimeFormatter) null)); [EOL] } <line_num>: 644,648
private void check(YearMonth test, int year, int month) { [EOL]     assertEquals(year, test.getYear()); [EOL]     assertEquals(month, test.getMonthOfYear()); [EOL] } <line_num>: 651,654
