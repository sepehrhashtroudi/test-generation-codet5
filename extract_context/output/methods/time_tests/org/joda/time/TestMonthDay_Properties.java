public TestMonthDay_Properties(String name) { [EOL]     super(name); [EOL] } <line_num>: 59,61
public static void main(String[] args) { [EOL]     junit.textui.TestRunner.run(suite()); [EOL] } <line_num>: 51,53
public static TestSuite suite() { [EOL]     return new TestSuite(TestMonthDay_Properties.class); [EOL] } <line_num>: 55,57
protected void setUp() throws Exception { [EOL]     DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW); [EOL]     zone = DateTimeZone.getDefault(); [EOL]     locale = Locale.getDefault(); [EOL]     Locale.setDefault(Locale.UK); [EOL]     DateTimeZone.setDefault(DateTimeZone.UTC); [EOL] } <line_num>: 63,69
protected void tearDown() throws Exception { [EOL]     DateTimeUtils.setCurrentMillisSystem(); [EOL]     DateTimeZone.setDefault(zone); [EOL]     zone = null; [EOL]     Locale.setDefault(locale); [EOL]     locale = null; [EOL] } <line_num>: 71,77
public void testPropertyGetMonthOfYear() { [EOL]     MonthDay test = new MonthDay(9, 6); [EOL]     assertSame(test.getChronology().monthOfYear(), test.monthOfYear().getField()); [EOL]     assertEquals("monthOfYear", test.monthOfYear().getName()); [EOL]     assertEquals("Property[monthOfYear]", test.monthOfYear().toString()); [EOL]     assertSame(test, test.monthOfYear().getReadablePartial()); [EOL]     assertSame(test, test.monthOfYear().getMonthDay()); [EOL]     assertEquals(9, test.monthOfYear().get()); [EOL]     assertEquals("9", test.monthOfYear().getAsString()); [EOL]     assertEquals("September", test.monthOfYear().getAsText()); [EOL]     assertEquals("septembre", test.monthOfYear().getAsText(Locale.FRENCH)); [EOL]     assertEquals("Sep", test.monthOfYear().getAsShortText()); [EOL]     assertEquals("sept.", test.monthOfYear().getAsShortText(Locale.FRENCH)); [EOL]     assertEquals(test.getChronology().months(), test.monthOfYear().getDurationField()); [EOL]     assertEquals(9, test.monthOfYear().getMaximumTextLength(null)); [EOL]     assertEquals(3, test.monthOfYear().getMaximumShortTextLength(null)); [EOL] } <line_num>: 80,97
public void testPropertyGetMaxMinValuesMonthOfYear() { [EOL]     MonthDay test = new MonthDay(10, 6); [EOL]     assertEquals(1, test.monthOfYear().getMinimumValue()); [EOL]     assertEquals(1, test.monthOfYear().getMinimumValueOverall()); [EOL]     assertEquals(12, test.monthOfYear().getMaximumValue()); [EOL]     assertEquals(12, test.monthOfYear().getMaximumValueOverall()); [EOL] } <line_num>: 99,105
public void testPropertyAddMonthOfYear() { [EOL]     MonthDay test = new MonthDay(3, 6); [EOL]     MonthDay copy = test.monthOfYear().addToCopy(9); [EOL]     check(test, 3, 6); [EOL]     check(copy, 12, 6); [EOL]     copy = test.monthOfYear().addToCopy(0); [EOL]     check(copy, 3, 6); [EOL]     check(test, 3, 6); [EOL]     copy = test.monthOfYear().addToCopy(-3); [EOL]     check(copy, 12, 6); [EOL]     check(test, 3, 6); [EOL] } <line_num>: 107,121
public void testPropertyAddWrapFieldMonthOfYear() { [EOL]     MonthDay test = new MonthDay(5, 6); [EOL]     MonthDay copy = test.monthOfYear().addWrapFieldToCopy(2); [EOL]     check(test, 5, 6); [EOL]     check(copy, 7, 6); [EOL]     copy = test.monthOfYear().addWrapFieldToCopy(2); [EOL]     check(copy, 7, 6); [EOL]     copy = test.monthOfYear().addWrapFieldToCopy(292278993 - 4 + 1); [EOL]     check(copy, 11, 6); [EOL]     copy = test.monthOfYear().addWrapFieldToCopy(-292275054 - 4 - 1); [EOL]     check(copy, 6, 6); [EOL] } <line_num>: 123,137
public void testPropertySetMonthOfYear() { [EOL]     MonthDay test = new MonthDay(10, 6); [EOL]     MonthDay copy = test.monthOfYear().setCopy(12); [EOL]     check(test, 10, 6); [EOL]     check(copy, 12, 6); [EOL] } <line_num>: 139,144
public void testPropertySetTextMonthOfYear() { [EOL]     MonthDay test = new MonthDay(10, 6); [EOL]     MonthDay copy = test.monthOfYear().setCopy("12"); [EOL]     check(test, 10, 6); [EOL]     check(copy, 12, 6); [EOL] } <line_num>: 146,151
public void testPropertyCompareToMonthOfYear() { [EOL]     MonthDay test1 = new MonthDay(TEST_TIME1); [EOL]     MonthDay test2 = new MonthDay(TEST_TIME2); [EOL]     assertEquals(true, test1.monthOfYear().compareTo(test2) < 0); [EOL]     assertEquals(true, test2.monthOfYear().compareTo(test1) > 0); [EOL]     assertEquals(true, test1.monthOfYear().compareTo(test1) == 0); [EOL]     try { [EOL]         test1.monthOfYear().compareTo((ReadablePartial) null); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL]     DateTime dt1 = new DateTime(TEST_TIME1); [EOL]     DateTime dt2 = new DateTime(TEST_TIME2); [EOL]     assertEquals(true, test1.monthOfYear().compareTo(dt2) < 0); [EOL]     assertEquals(true, test2.monthOfYear().compareTo(dt1) > 0); [EOL]     assertEquals(true, test1.monthOfYear().compareTo(dt1) == 0); [EOL]     try { [EOL]         test1.monthOfYear().compareTo((ReadableInstant) null); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL] } <line_num>: 153,173
public void testPropertyGetDayOfMonth() { [EOL]     MonthDay test = new MonthDay(4, 6); [EOL]     assertSame(test.getChronology().dayOfMonth(), test.dayOfMonth().getField()); [EOL]     assertEquals("dayOfMonth", test.dayOfMonth().getName()); [EOL]     assertEquals("Property[dayOfMonth]", test.dayOfMonth().toString()); [EOL]     assertSame(test, test.dayOfMonth().getReadablePartial()); [EOL]     assertSame(test, test.dayOfMonth().getMonthDay()); [EOL]     assertEquals(6, test.dayOfMonth().get()); [EOL]     assertEquals("6", test.dayOfMonth().getAsString()); [EOL]     assertEquals("6", test.dayOfMonth().getAsText()); [EOL]     assertEquals("6", test.dayOfMonth().getAsText(Locale.FRENCH)); [EOL]     assertEquals("6", test.dayOfMonth().getAsShortText()); [EOL]     assertEquals("6", test.dayOfMonth().getAsShortText(Locale.FRENCH)); [EOL]     assertEquals(test.getChronology().days(), test.dayOfMonth().getDurationField()); [EOL]     assertEquals(test.getChronology().months(), test.dayOfMonth().getRangeDurationField()); [EOL]     assertEquals(2, test.dayOfMonth().getMaximumTextLength(null)); [EOL]     assertEquals(2, test.dayOfMonth().getMaximumShortTextLength(null)); [EOL]     test = new MonthDay(4, 7); [EOL]     assertEquals("7", test.dayOfMonth().getAsText(Locale.FRENCH)); [EOL]     assertEquals("7", test.dayOfMonth().getAsShortText(Locale.FRENCH)); [EOL] } <line_num>: 176,196
public void testPropertyGetMaxMinValuesDayOfMonth() { [EOL]     MonthDay test = new MonthDay(4, 6); [EOL]     assertEquals(1, test.dayOfMonth().getMinimumValue()); [EOL]     assertEquals(1, test.dayOfMonth().getMinimumValueOverall()); [EOL]     assertEquals(30, test.dayOfMonth().getMaximumValue()); [EOL]     assertEquals(31, test.dayOfMonth().getMaximumValueOverall()); [EOL] } <line_num>: 198,204
public void testPropertyAddDayOfMonth() { [EOL]     MonthDay test = new MonthDay(4, 6); [EOL]     MonthDay copy = test.dayOfMonth().addToCopy(6); [EOL]     check(test, 4, 6); [EOL]     check(copy, 4, 12); [EOL]     copy = test.dayOfMonth().addToCopy(7); [EOL]     check(copy, 4, 13); [EOL]     copy = test.dayOfMonth().addToCopy(-5); [EOL]     check(copy, 4, 1); [EOL]     copy = test.dayOfMonth().addToCopy(-6); [EOL]     check(copy, 3, 31); [EOL] } <line_num>: 206,220
public void testPropertyAddWrapFieldDayOfMonth() { [EOL]     MonthDay test = new MonthDay(4, 6); [EOL]     MonthDay copy = test.dayOfMonth().addWrapFieldToCopy(4); [EOL]     check(test, 4, 6); [EOL]     check(copy, 4, 10); [EOL]     copy = test.dayOfMonth().addWrapFieldToCopy(8); [EOL]     check(copy, 4, 14); [EOL]     copy = test.dayOfMonth().addWrapFieldToCopy(-8); [EOL]     check(copy, 4, 28); [EOL] } <line_num>: 222,233
public void testPropertySetDayOfMonth() { [EOL]     MonthDay test = new MonthDay(4, 6); [EOL]     MonthDay copy = test.dayOfMonth().setCopy(12); [EOL]     check(test, 4, 6); [EOL]     check(copy, 4, 12); [EOL]     try { [EOL]         test.dayOfMonth().setCopy(33); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL]     try { [EOL]         test.dayOfMonth().setCopy(0); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL] } <line_num>: 235,249
public void testPropertySetTextDayOfMonth() { [EOL]     MonthDay test = new MonthDay(4, 6); [EOL]     MonthDay copy = test.dayOfMonth().setCopy("12"); [EOL]     check(test, 4, 6); [EOL]     check(copy, 4, 12); [EOL]     copy = test.dayOfMonth().setCopy("2"); [EOL]     check(test, 4, 6); [EOL]     check(copy, 4, 2); [EOL]     copy = test.dayOfMonth().setCopy("4"); [EOL]     check(test, 4, 6); [EOL]     check(copy, 4, 4); [EOL] } <line_num>: 251,264
public void testPropertyCompareToDayOfMonth() { [EOL]     MonthDay test1 = new MonthDay(TEST_TIME1); [EOL]     MonthDay test2 = new MonthDay(TEST_TIME2); [EOL]     assertEquals(true, test1.dayOfMonth().compareTo(test2) < 0); [EOL]     assertEquals(true, test2.dayOfMonth().compareTo(test1) > 0); [EOL]     assertEquals(true, test1.dayOfMonth().compareTo(test1) == 0); [EOL]     try { [EOL]         test1.dayOfMonth().compareTo((ReadablePartial) null); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL]     DateTime dt1 = new DateTime(TEST_TIME1); [EOL]     DateTime dt2 = new DateTime(TEST_TIME2); [EOL]     assertEquals(true, test1.dayOfMonth().compareTo(dt2) < 0); [EOL]     assertEquals(true, test2.dayOfMonth().compareTo(dt1) > 0); [EOL]     assertEquals(true, test1.dayOfMonth().compareTo(dt1) == 0); [EOL]     try { [EOL]         test1.dayOfMonth().compareTo((ReadableInstant) null); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL] } <line_num>: 266,286
public void testPropertyEquals() { [EOL]     MonthDay test1 = new MonthDay(11, 11); [EOL]     MonthDay test2 = new MonthDay(11, 12); [EOL]     MonthDay test3 = new MonthDay(11, 11, CopticChronology.getInstanceUTC()); [EOL]     assertEquals(true, test1.dayOfMonth().equals(test1.dayOfMonth())); [EOL]     assertEquals(false, test1.dayOfMonth().equals(test1.monthOfYear())); [EOL]     assertEquals(false, test1.dayOfMonth().equals(test2.dayOfMonth())); [EOL]     assertEquals(false, test1.dayOfMonth().equals(test2.monthOfYear())); [EOL]     assertEquals(false, test1.monthOfYear().equals(test1.dayOfMonth())); [EOL]     assertEquals(true, test1.monthOfYear().equals(test1.monthOfYear())); [EOL]     assertEquals(false, test1.monthOfYear().equals(test2.dayOfMonth())); [EOL]     assertEquals(true, test1.monthOfYear().equals(test2.monthOfYear())); [EOL]     assertEquals(false, test1.dayOfMonth().equals(null)); [EOL]     assertEquals(false, test1.dayOfMonth().equals("any")); [EOL]     assertEquals(false, test1.dayOfMonth().equals(test3.dayOfMonth())); [EOL] } <line_num>: 289,308
public void testPropertyHashCode() { [EOL]     MonthDay test1 = new MonthDay(5, 11); [EOL]     MonthDay test2 = new MonthDay(5, 12); [EOL]     assertEquals(true, test1.dayOfMonth().hashCode() == test1.dayOfMonth().hashCode()); [EOL]     assertEquals(false, test1.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode()); [EOL]     assertEquals(true, test1.monthOfYear().hashCode() == test1.monthOfYear().hashCode()); [EOL]     assertEquals(true, test1.monthOfYear().hashCode() == test2.monthOfYear().hashCode()); [EOL] } <line_num>: 310,317
public void testPropertyEqualsHashCodeLenient() { [EOL]     MonthDay test1 = new MonthDay(5, 6, LenientChronology.getInstance(COPTIC_PARIS)); [EOL]     MonthDay test2 = new MonthDay(5, 6, LenientChronology.getInstance(COPTIC_PARIS)); [EOL]     assertEquals(true, test1.dayOfMonth().equals(test2.dayOfMonth())); [EOL]     assertEquals(true, test2.dayOfMonth().equals(test1.dayOfMonth())); [EOL]     assertEquals(true, test1.dayOfMonth().equals(test1.dayOfMonth())); [EOL]     assertEquals(true, test2.dayOfMonth().equals(test2.dayOfMonth())); [EOL]     assertEquals(true, test1.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode()); [EOL]     assertEquals(true, test1.dayOfMonth().hashCode() == test1.dayOfMonth().hashCode()); [EOL]     assertEquals(true, test2.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode()); [EOL] } <line_num>: 319,329
public void testPropertyEqualsHashCodeStrict() { [EOL]     MonthDay test1 = new MonthDay(5, 6, StrictChronology.getInstance(COPTIC_PARIS)); [EOL]     MonthDay test2 = new MonthDay(5, 6, StrictChronology.getInstance(COPTIC_PARIS)); [EOL]     assertEquals(true, test1.dayOfMonth().equals(test2.dayOfMonth())); [EOL]     assertEquals(true, test2.dayOfMonth().equals(test1.dayOfMonth())); [EOL]     assertEquals(true, test1.dayOfMonth().equals(test1.dayOfMonth())); [EOL]     assertEquals(true, test2.dayOfMonth().equals(test2.dayOfMonth())); [EOL]     assertEquals(true, test1.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode()); [EOL]     assertEquals(true, test1.dayOfMonth().hashCode() == test1.dayOfMonth().hashCode()); [EOL]     assertEquals(true, test2.dayOfMonth().hashCode() == test2.dayOfMonth().hashCode()); [EOL] } <line_num>: 331,341
private void check(MonthDay test, int monthOfYear, int dayOfMonth) { [EOL]     assertEquals(monthOfYear, test.getMonthOfYear()); [EOL]     assertEquals(dayOfMonth, test.getDayOfMonth()); [EOL] } <line_num>: 344,347