public TestMonths(String name) { [EOL]     super(name); [EOL] } <line_num>: 44,46
public static void main(String[] args) { [EOL]     junit.textui.TestRunner.run(suite()); [EOL] } <line_num>: 36,38
public static TestSuite suite() { [EOL]     return new TestSuite(TestMonths.class); [EOL] } <line_num>: 40,42
protected void setUp() throws Exception { [EOL] } <line_num>: 48,49
protected void tearDown() throws Exception { [EOL] } <line_num>: 51,52
public void testConstants() { [EOL]     assertEquals(0, Months.ZERO.getMonths()); [EOL]     assertEquals(1, Months.ONE.getMonths()); [EOL]     assertEquals(2, Months.TWO.getMonths()); [EOL]     assertEquals(3, Months.THREE.getMonths()); [EOL]     assertEquals(4, Months.FOUR.getMonths()); [EOL]     assertEquals(5, Months.FIVE.getMonths()); [EOL]     assertEquals(6, Months.SIX.getMonths()); [EOL]     assertEquals(7, Months.SEVEN.getMonths()); [EOL]     assertEquals(8, Months.EIGHT.getMonths()); [EOL]     assertEquals(9, Months.NINE.getMonths()); [EOL]     assertEquals(10, Months.TEN.getMonths()); [EOL]     assertEquals(11, Months.ELEVEN.getMonths()); [EOL]     assertEquals(12, Months.TWELVE.getMonths()); [EOL]     assertEquals(Integer.MAX_VALUE, Months.MAX_VALUE.getMonths()); [EOL]     assertEquals(Integer.MIN_VALUE, Months.MIN_VALUE.getMonths()); [EOL] } <line_num>: 55,71
public void testFactory_months_int() { [EOL]     assertSame(Months.ZERO, Months.months(0)); [EOL]     assertSame(Months.ONE, Months.months(1)); [EOL]     assertSame(Months.TWO, Months.months(2)); [EOL]     assertSame(Months.THREE, Months.months(3)); [EOL]     assertSame(Months.FOUR, Months.months(4)); [EOL]     assertSame(Months.FIVE, Months.months(5)); [EOL]     assertSame(Months.SIX, Months.months(6)); [EOL]     assertSame(Months.SEVEN, Months.months(7)); [EOL]     assertSame(Months.EIGHT, Months.months(8)); [EOL]     assertSame(Months.NINE, Months.months(9)); [EOL]     assertSame(Months.TEN, Months.months(10)); [EOL]     assertSame(Months.ELEVEN, Months.months(11)); [EOL]     assertSame(Months.TWELVE, Months.months(12)); [EOL]     assertSame(Months.MAX_VALUE, Months.months(Integer.MAX_VALUE)); [EOL]     assertSame(Months.MIN_VALUE, Months.months(Integer.MIN_VALUE)); [EOL]     assertEquals(-1, Months.months(-1).getMonths()); [EOL]     assertEquals(13, Months.months(13).getMonths()); [EOL] } <line_num>: 74,92
public void testFactory_monthsBetween_RInstant() { [EOL]     DateTime start = new DateTime(2006, 6, 9, 12, 0, 0, 0, PARIS); [EOL]     DateTime end1 = new DateTime(2006, 9, 9, 12, 0, 0, 0, PARIS); [EOL]     DateTime end2 = new DateTime(2006, 12, 9, 12, 0, 0, 0, PARIS); [EOL]     assertEquals(3, Months.monthsBetween(start, end1).getMonths()); [EOL]     assertEquals(0, Months.monthsBetween(start, start).getMonths()); [EOL]     assertEquals(0, Months.monthsBetween(end1, end1).getMonths()); [EOL]     assertEquals(-3, Months.monthsBetween(end1, start).getMonths()); [EOL]     assertEquals(6, Months.monthsBetween(start, end2).getMonths()); [EOL] } <line_num>: 95,105
@SuppressWarnings("deprecation") [EOL] public void testFactory_monthsBetween_RPartial_LocalDate() { [EOL]     LocalDate start = new LocalDate(2006, 6, 9); [EOL]     LocalDate end1 = new LocalDate(2006, 9, 9); [EOL]     YearMonthDay end2 = new YearMonthDay(2006, 12, 9); [EOL]     assertEquals(3, Months.monthsBetween(start, end1).getMonths()); [EOL]     assertEquals(0, Months.monthsBetween(start, start).getMonths()); [EOL]     assertEquals(0, Months.monthsBetween(end1, end1).getMonths()); [EOL]     assertEquals(-3, Months.monthsBetween(end1, start).getMonths()); [EOL]     assertEquals(6, Months.monthsBetween(start, end2).getMonths()); [EOL] } <line_num>: 108,119
public void testFactory_monthsBetween_RPartial_YearMonth() { [EOL]     YearMonth start1 = new YearMonth(2011, 1); [EOL]     for (int i = 0; i < 6; i++) { [EOL]         YearMonth start2 = new YearMonth(2011 + i, 1); [EOL]         YearMonth end = new YearMonth(2011 + i, 3); [EOL]         assertEquals(i * 12 + 2, Months.monthsBetween(start1, end).getMonths()); [EOL]         assertEquals(2, Months.monthsBetween(start2, end).getMonths()); [EOL]     } [EOL] } <line_num>: 121,129
public void testFactory_monthsBetween_RPartial_MonthDay() { [EOL]     MonthDay start = new MonthDay(2, 1); [EOL]     MonthDay end1 = new MonthDay(2, 28); [EOL]     MonthDay end2 = new MonthDay(2, 29); [EOL]     MonthDay end3 = new MonthDay(3, 1); [EOL]     assertEquals(0, Months.monthsBetween(start, end1).getMonths()); [EOL]     assertEquals(0, Months.monthsBetween(start, end2).getMonths()); [EOL]     assertEquals(1, Months.monthsBetween(start, end3).getMonths()); [EOL]     assertEquals(0, Months.monthsBetween(end1, start).getMonths()); [EOL]     assertEquals(0, Months.monthsBetween(end2, start).getMonths()); [EOL]     assertEquals(-1, Months.monthsBetween(end3, start).getMonths()); [EOL] } <line_num>: 131,144
public void testFactory_monthsIn_RInterval() { [EOL]     DateTime start = new DateTime(2006, 6, 9, 12, 0, 0, 0, PARIS); [EOL]     DateTime end1 = new DateTime(2006, 9, 9, 12, 0, 0, 0, PARIS); [EOL]     DateTime end2 = new DateTime(2006, 12, 9, 12, 0, 0, 0, PARIS); [EOL]     assertEquals(0, Months.monthsIn((ReadableInterval) null).getMonths()); [EOL]     assertEquals(3, Months.monthsIn(new Interval(start, end1)).getMonths()); [EOL]     assertEquals(0, Months.monthsIn(new Interval(start, start)).getMonths()); [EOL]     assertEquals(0, Months.monthsIn(new Interval(end1, end1)).getMonths()); [EOL]     assertEquals(6, Months.monthsIn(new Interval(start, end2)).getMonths()); [EOL] } <line_num>: 147,157
public void testFactory_parseMonths_String() { [EOL]     assertEquals(0, Months.parseMonths((String) null).getMonths()); [EOL]     assertEquals(0, Months.parseMonths("P0M").getMonths()); [EOL]     assertEquals(1, Months.parseMonths("P1M").getMonths()); [EOL]     assertEquals(-3, Months.parseMonths("P-3M").getMonths()); [EOL]     assertEquals(2, Months.parseMonths("P0Y2M").getMonths()); [EOL]     assertEquals(2, Months.parseMonths("P2MT0H0M").getMonths()); [EOL]     try { [EOL]         Months.parseMonths("P1Y1D"); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL]     try { [EOL]         Months.parseMonths("P1MT1H"); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL] } <line_num>: 159,178
public void testGetMethods() { [EOL]     Months test = Months.months(20); [EOL]     assertEquals(20, test.getMonths()); [EOL] } <line_num>: 181,184
public void testGetFieldType() { [EOL]     Months test = Months.months(20); [EOL]     assertEquals(DurationFieldType.months(), test.getFieldType()); [EOL] } <line_num>: 186,189
public void testGetPeriodType() { [EOL]     Months test = Months.months(20); [EOL]     assertEquals(PeriodType.months(), test.getPeriodType()); [EOL] } <line_num>: 191,194
public void testIsGreaterThan() { [EOL]     assertEquals(true, Months.THREE.isGreaterThan(Months.TWO)); [EOL]     assertEquals(false, Months.THREE.isGreaterThan(Months.THREE)); [EOL]     assertEquals(false, Months.TWO.isGreaterThan(Months.THREE)); [EOL]     assertEquals(true, Months.ONE.isGreaterThan(null)); [EOL]     assertEquals(false, Months.months(-1).isGreaterThan(null)); [EOL] } <line_num>: 197,203
public void testIsLessThan() { [EOL]     assertEquals(false, Months.THREE.isLessThan(Months.TWO)); [EOL]     assertEquals(false, Months.THREE.isLessThan(Months.THREE)); [EOL]     assertEquals(true, Months.TWO.isLessThan(Months.THREE)); [EOL]     assertEquals(false, Months.ONE.isLessThan(null)); [EOL]     assertEquals(true, Months.months(-1).isLessThan(null)); [EOL] } <line_num>: 205,211
public void testToString() { [EOL]     Months test = Months.months(20); [EOL]     assertEquals("P20M", test.toString()); [EOL]     test = Months.months(-20); [EOL]     assertEquals("P-20M", test.toString()); [EOL] } <line_num>: 214,220
public void testSerialization() throws Exception { [EOL]     Months test = Months.THREE; [EOL]     ByteArrayOutputStream baos = new ByteArrayOutputStream(); [EOL]     ObjectOutputStream oos = new ObjectOutputStream(baos); [EOL]     oos.writeObject(test); [EOL]     byte[] bytes = baos.toByteArray(); [EOL]     oos.close(); [EOL]     ByteArrayInputStream bais = new ByteArrayInputStream(bytes); [EOL]     ObjectInputStream ois = new ObjectInputStream(bais); [EOL]     Months result = (Months) ois.readObject(); [EOL]     ois.close(); [EOL]     assertSame(test, result); [EOL] } <line_num>: 223,238
public void testPlus_int() { [EOL]     Months test2 = Months.months(2); [EOL]     Months result = test2.plus(3); [EOL]     assertEquals(2, test2.getMonths()); [EOL]     assertEquals(5, result.getMonths()); [EOL]     assertEquals(1, Months.ONE.plus(0).getMonths()); [EOL]     try { [EOL]         Months.MAX_VALUE.plus(1); [EOL]         fail(); [EOL]     } catch (ArithmeticException ex) { [EOL]     } [EOL] } <line_num>: 241,255
public void testPlus_Months() { [EOL]     Months test2 = Months.months(2); [EOL]     Months test3 = Months.months(3); [EOL]     Months result = test2.plus(test3); [EOL]     assertEquals(2, test2.getMonths()); [EOL]     assertEquals(3, test3.getMonths()); [EOL]     assertEquals(5, result.getMonths()); [EOL]     assertEquals(1, Months.ONE.plus(Months.ZERO).getMonths()); [EOL]     assertEquals(1, Months.ONE.plus((Months) null).getMonths()); [EOL]     try { [EOL]         Months.MAX_VALUE.plus(Months.ONE); [EOL]         fail(); [EOL]     } catch (ArithmeticException ex) { [EOL]     } [EOL] } <line_num>: 257,274
public void testMinus_int() { [EOL]     Months test2 = Months.months(2); [EOL]     Months result = test2.minus(3); [EOL]     assertEquals(2, test2.getMonths()); [EOL]     assertEquals(-1, result.getMonths()); [EOL]     assertEquals(1, Months.ONE.minus(0).getMonths()); [EOL]     try { [EOL]         Months.MIN_VALUE.minus(1); [EOL]         fail(); [EOL]     } catch (ArithmeticException ex) { [EOL]     } [EOL] } <line_num>: 276,290
public void testMinus_Months() { [EOL]     Months test2 = Months.months(2); [EOL]     Months test3 = Months.months(3); [EOL]     Months result = test2.minus(test3); [EOL]     assertEquals(2, test2.getMonths()); [EOL]     assertEquals(3, test3.getMonths()); [EOL]     assertEquals(-1, result.getMonths()); [EOL]     assertEquals(1, Months.ONE.minus(Months.ZERO).getMonths()); [EOL]     assertEquals(1, Months.ONE.minus((Months) null).getMonths()); [EOL]     try { [EOL]         Months.MIN_VALUE.minus(Months.ONE); [EOL]         fail(); [EOL]     } catch (ArithmeticException ex) { [EOL]     } [EOL] } <line_num>: 292,309
public void testMultipliedBy_int() { [EOL]     Months test = Months.months(2); [EOL]     assertEquals(6, test.multipliedBy(3).getMonths()); [EOL]     assertEquals(2, test.getMonths()); [EOL]     assertEquals(-6, test.multipliedBy(-3).getMonths()); [EOL]     assertSame(test, test.multipliedBy(1)); [EOL]     Months halfMax = Months.months(Integer.MAX_VALUE / 2 + 1); [EOL]     try { [EOL]         halfMax.multipliedBy(2); [EOL]         fail(); [EOL]     } catch (ArithmeticException ex) { [EOL]     } [EOL] } <line_num>: 311,325
public void testDividedBy_int() { [EOL]     Months test = Months.months(12); [EOL]     assertEquals(6, test.dividedBy(2).getMonths()); [EOL]     assertEquals(12, test.getMonths()); [EOL]     assertEquals(4, test.dividedBy(3).getMonths()); [EOL]     assertEquals(3, test.dividedBy(4).getMonths()); [EOL]     assertEquals(2, test.dividedBy(5).getMonths()); [EOL]     assertEquals(2, test.dividedBy(6).getMonths()); [EOL]     assertSame(test, test.dividedBy(1)); [EOL]     try { [EOL]         Months.ONE.dividedBy(0); [EOL]         fail(); [EOL]     } catch (ArithmeticException ex) { [EOL]     } [EOL] } <line_num>: 327,343
public void testNegated() { [EOL]     Months test = Months.months(12); [EOL]     assertEquals(-12, test.negated().getMonths()); [EOL]     assertEquals(12, test.getMonths()); [EOL]     try { [EOL]         Months.MIN_VALUE.negated(); [EOL]         fail(); [EOL]     } catch (ArithmeticException ex) { [EOL]     } [EOL] } <line_num>: 345,356
public void testAddToLocalDate() { [EOL]     Months test = Months.months(3); [EOL]     LocalDate date = new LocalDate(2006, 6, 1); [EOL]     LocalDate expected = new LocalDate(2006, 9, 1); [EOL]     assertEquals(expected, date.plus(test)); [EOL] } <line_num>: 359,364