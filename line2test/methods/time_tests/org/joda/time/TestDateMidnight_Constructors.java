public TestDateMidnight_Constructors(String name) { [EOL]     super(name); [EOL] } <line_num>: 95,97
public static void main(String[] args) { [EOL]     junit.textui.TestRunner.run(suite()); [EOL] } <line_num>: 87,89
public static TestSuite suite() { [EOL]     return new TestSuite(TestDateMidnight_Constructors.class); [EOL] } <line_num>: 91,93
protected void setUp() throws Exception { [EOL]     DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW_UTC); [EOL]     zone = DateTimeZone.getDefault(); [EOL]     locale = Locale.getDefault(); [EOL]     DateTimeZone.setDefault(LONDON); [EOL]     Locale.setDefault(Locale.UK); [EOL] } <line_num>: 99,105
protected void tearDown() throws Exception { [EOL]     DateTimeUtils.setCurrentMillisSystem(); [EOL]     DateTimeZone.setDefault(zone); [EOL]     Locale.setDefault(locale); [EOL]     zone = null; [EOL] } <line_num>: 107,112
public void testTest() { [EOL]     assertEquals("2002-06-09T00:00:00.000Z", new Instant(TEST_TIME_NOW_UTC).toString()); [EOL]     assertEquals("2002-04-05T12:24:00.000Z", new Instant(TEST_TIME1_UTC).toString()); [EOL]     assertEquals("2003-05-06T14:28:00.000Z", new Instant(TEST_TIME2_UTC).toString()); [EOL] } <line_num>: 115,119
public void test_now() throws Throwable { [EOL]     DateMidnight test = DateMidnight.now(); [EOL]     assertEquals(ISOChronology.getInstance(), test.getChronology()); [EOL]     assertEquals(TEST_TIME_NOW_LONDON, test.getMillis()); [EOL]     assertEquals(2002, test.getYear()); [EOL]     assertEquals(6, test.getMonthOfYear()); [EOL]     assertEquals(9, test.getDayOfMonth()); [EOL] } <line_num>: 125,132
public void test_now_DateTimeZone() throws Throwable { [EOL]     DateMidnight test = DateMidnight.now(PARIS); [EOL]     assertEquals(ISOChronology.getInstance(PARIS), test.getChronology()); [EOL]     assertEquals(TEST_TIME_NOW_PARIS, test.getMillis()); [EOL] } <line_num>: 137,141
public void test_now_nullDateTimeZone() throws Throwable { [EOL]     try { [EOL]         DateMidnight.now((DateTimeZone) null); [EOL]         fail(); [EOL]     } catch (NullPointerException ex) { [EOL]     } [EOL] } <line_num>: 146,151
public void test_now_Chronology() throws Throwable { [EOL]     DateMidnight test = DateMidnight.now(GregorianChronology.getInstance()); [EOL]     assertEquals(GregorianChronology.getInstance(), test.getChronology()); [EOL]     assertEquals(TEST_TIME_NOW_LONDON, test.getMillis()); [EOL] } <line_num>: 156,160
public void test_now_nullChronology() throws Throwable { [EOL]     try { [EOL]         DateMidnight.now((Chronology) null); [EOL]         fail(); [EOL]     } catch (NullPointerException ex) { [EOL]     } [EOL] } <line_num>: 165,170
public void testParse_noFormatter() throws Throwable { [EOL]     assertEquals(new DateMidnight(2010, 6, 30, ISOChronology.getInstance(LONDON)), DateMidnight.parse("2010-06-30")); [EOL]     assertEquals(new DateMidnight(2010, 1, 2, ISOChronology.getInstance(LONDON)), DateMidnight.parse("2010-002")); [EOL] } <line_num>: 173,176
public void testParse_formatter() throws Throwable { [EOL]     assertEquals(new DateMidnight(2010, 6, 30, ISOChronology.getInstance(LONDON)), DateMidnight.parse("2010--30 06", DateTimeFormat.forPattern("yyyy--dd MM"))); [EOL] } <line_num>: 178,180
public void testConstructor() throws Throwable { [EOL]     DateMidnight test = new DateMidnight(); [EOL]     assertEquals(ISOChronology.getInstance(), test.getChronology()); [EOL]     assertEquals(TEST_TIME_NOW_LONDON, test.getMillis()); [EOL]     assertEquals(2002, test.getYear()); [EOL]     assertEquals(6, test.getMonthOfYear()); [EOL]     assertEquals(9, test.getDayOfMonth()); [EOL] } <line_num>: 186,193
public void testConstructor_DateTimeZone() throws Throwable { [EOL]     DateMidnight test = new DateMidnight(PARIS); [EOL]     assertEquals(ISOChronology.getInstance(PARIS), test.getChronology()); [EOL]     assertEquals(TEST_TIME_NOW_PARIS, test.getMillis()); [EOL] } <line_num>: 198,202
public void testConstructor_nullDateTimeZone() throws Throwable { [EOL]     DateMidnight test = new DateMidnight((DateTimeZone) null); [EOL]     assertEquals(ISOChronology.getInstance(), test.getChronology()); [EOL]     assertEquals(TEST_TIME_NOW_LONDON, test.getMillis()); [EOL] } <line_num>: 207,211
public void testConstructor_Chronology() throws Throwable { [EOL]     DateMidnight test = new DateMidnight(GregorianChronology.getInstance()); [EOL]     assertEquals(GregorianChronology.getInstance(), test.getChronology()); [EOL]     assertEquals(TEST_TIME_NOW_LONDON, test.getMillis()); [EOL] } <line_num>: 216,220
public void testConstructor_nullChronology() throws Throwable { [EOL]     DateMidnight test = new DateMidnight((Chronology) null); [EOL]     assertEquals(ISOChronology.getInstance(), test.getChronology()); [EOL]     assertEquals(TEST_TIME_NOW_LONDON, test.getMillis()); [EOL] } <line_num>: 225,229
public void testConstructor_long1() throws Throwable { [EOL]     DateMidnight test = new DateMidnight(TEST_TIME1_UTC); [EOL]     assertEquals(ISOChronology.getInstance(), test.getChronology()); [EOL]     assertEquals(TEST_TIME1_LONDON, test.getMillis()); [EOL] } <line_num>: 235,239
public void testConstructor_long2() throws Throwable { [EOL]     DateMidnight test = new DateMidnight(TEST_TIME2_UTC); [EOL]     assertEquals(ISOChronology.getInstance(), test.getChronology()); [EOL]     assertEquals(TEST_TIME2_LONDON, test.getMillis()); [EOL] } <line_num>: 244,248
public void testConstructor_long1_DateTimeZone() throws Throwable { [EOL]     DateMidnight test = new DateMidnight(TEST_TIME1_UTC, PARIS); [EOL]     assertEquals(ISOChronology.getInstance(PARIS), test.getChronology()); [EOL]     assertEquals(TEST_TIME1_PARIS, test.getMillis()); [EOL] } <line_num>: 253,257
public void testConstructor_long2_DateTimeZone() throws Throwable { [EOL]     DateMidnight test = new DateMidnight(TEST_TIME2_UTC, PARIS); [EOL]     assertEquals(ISOChronology.getInstance(PARIS), test.getChronology()); [EOL]     assertEquals(TEST_TIME2_PARIS, test.getMillis()); [EOL] } <line_num>: 262,266
public void testConstructor_long_nullDateTimeZone() throws Throwable { [EOL]     DateMidnight test = new DateMidnight(TEST_TIME1_UTC, (DateTimeZone) null); [EOL]     assertEquals(ISOChronology.getInstance(), test.getChronology()); [EOL]     assertEquals(TEST_TIME1_LONDON, test.getMillis()); [EOL] } <line_num>: 271,275
public void testConstructor_long1_Chronology() throws Throwable { [EOL]     DateMidnight test = new DateMidnight(TEST_TIME1_UTC, GregorianChronology.getInstance()); [EOL]     assertEquals(GregorianChronology.getInstance(), test.getChronology()); [EOL]     assertEquals(TEST_TIME1_LONDON, test.getMillis()); [EOL] } <line_num>: 280,284
public void testConstructor_long2_Chronology() throws Throwable { [EOL]     DateMidnight test = new DateMidnight(TEST_TIME2_UTC, GregorianChronology.getInstance()); [EOL]     assertEquals(GregorianChronology.getInstance(), test.getChronology()); [EOL]     assertEquals(TEST_TIME2_LONDON, test.getMillis()); [EOL] } <line_num>: 289,293
public void testConstructor_long_nullChronology() throws Throwable { [EOL]     DateMidnight test = new DateMidnight(TEST_TIME1_UTC, (Chronology) null); [EOL]     assertEquals(ISOChronology.getInstance(), test.getChronology()); [EOL]     assertEquals(TEST_TIME1_LONDON, test.getMillis()); [EOL] } <line_num>: 298,302
public void testConstructor_Object() throws Throwable { [EOL]     Date date = new Date(TEST_TIME1_UTC); [EOL]     DateMidnight test = new DateMidnight(date); [EOL]     assertEquals(ISOChronology.getInstance(), test.getChronology()); [EOL]     assertEquals(TEST_TIME1_LONDON, test.getMillis()); [EOL] } <line_num>: 308,313
public void testConstructor_invalidObject() throws Throwable { [EOL]     try { [EOL]         new DateMidnight(new Object()); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL] } <line_num>: 318,323
public void testConstructor_nullObject() throws Throwable { [EOL]     DateMidnight test = new DateMidnight((Object) null); [EOL]     assertEquals(ISOChronology.getInstance(), test.getChronology()); [EOL]     assertEquals(TEST_TIME_NOW_LONDON, test.getMillis()); [EOL] } <line_num>: 328,332
public void testConstructor_badconverterObject() throws Throwable { [EOL]     try { [EOL]         ConverterManager.getInstance().addInstantConverter(MockZeroNullIntegerConverter.INSTANCE); [EOL]         DateMidnight test = new DateMidnight(new Integer(0)); [EOL]         assertEquals(ISOChronology.getInstance(), test.getChronology()); [EOL]         assertEquals(0L - DateTimeConstants.MILLIS_PER_HOUR, test.getMillis()); [EOL]     } finally { [EOL]         ConverterManager.getInstance().removeInstantConverter(MockZeroNullIntegerConverter.INSTANCE); [EOL]     } [EOL] } <line_num>: 337,346
public void testConstructor_Object_DateTimeZone() throws Throwable { [EOL]     Date date = new Date(TEST_TIME1_UTC); [EOL]     DateMidnight test = new DateMidnight(date, PARIS); [EOL]     assertEquals(ISOChronology.getInstance(PARIS), test.getChronology()); [EOL]     assertEquals(TEST_TIME1_PARIS, test.getMillis()); [EOL] } <line_num>: 351,356
public void testConstructor_invalidObject_DateTimeZone() throws Throwable { [EOL]     try { [EOL]         new DateMidnight(new Object(), PARIS); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL] } <line_num>: 361,366
public void testConstructor_nullObject_DateTimeZone() throws Throwable { [EOL]     DateMidnight test = new DateMidnight((Object) null, PARIS); [EOL]     assertEquals(ISOChronology.getInstance(PARIS), test.getChronology()); [EOL]     assertEquals(TEST_TIME_NOW_PARIS, test.getMillis()); [EOL] } <line_num>: 371,375
public void testConstructor_Object_nullDateTimeZone() throws Throwable { [EOL]     Date date = new Date(TEST_TIME1_UTC); [EOL]     DateMidnight test = new DateMidnight(date, (DateTimeZone) null); [EOL]     assertEquals(ISOChronology.getInstance(), test.getChronology()); [EOL]     assertEquals(TEST_TIME1_LONDON, test.getMillis()); [EOL] } <line_num>: 380,385
public void testConstructor_nullObject_nullDateTimeZone() throws Throwable { [EOL]     DateMidnight test = new DateMidnight((Object) null, (DateTimeZone) null); [EOL]     assertEquals(ISOChronology.getInstance(), test.getChronology()); [EOL]     assertEquals(TEST_TIME_NOW_LONDON, test.getMillis()); [EOL] } <line_num>: 390,394
public void testConstructor_badconverterObject_DateTimeZone() throws Throwable { [EOL]     try { [EOL]         ConverterManager.getInstance().addInstantConverter(MockZeroNullIntegerConverter.INSTANCE); [EOL]         DateMidnight test = new DateMidnight(new Integer(0), GregorianChronology.getInstance()); [EOL]         assertEquals(ISOChronology.getInstance(), test.getChronology()); [EOL]         assertEquals(0L - DateTimeConstants.MILLIS_PER_HOUR, test.getMillis()); [EOL]     } finally { [EOL]         ConverterManager.getInstance().removeInstantConverter(MockZeroNullIntegerConverter.INSTANCE); [EOL]     } [EOL] } <line_num>: 399,408
public void testConstructor_Object_Chronology() throws Throwable { [EOL]     Date date = new Date(TEST_TIME1_UTC); [EOL]     DateMidnight test = new DateMidnight(date, GregorianChronology.getInstance()); [EOL]     assertEquals(GregorianChronology.getInstance(), test.getChronology()); [EOL]     assertEquals(TEST_TIME1_LONDON, test.getMillis()); [EOL] } <line_num>: 413,418
public void testConstructor_invalidObject_Chronology() throws Throwable { [EOL]     try { [EOL]         new DateMidnight(new Object(), GregorianChronology.getInstance()); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL] } <line_num>: 423,428
public void testConstructor_nullObject_Chronology() throws Throwable { [EOL]     DateMidnight test = new DateMidnight((Object) null, GregorianChronology.getInstance()); [EOL]     assertEquals(GregorianChronology.getInstance(), test.getChronology()); [EOL]     assertEquals(TEST_TIME_NOW_LONDON, test.getMillis()); [EOL] } <line_num>: 433,437
public void testConstructor_Object_nullChronology() throws Throwable { [EOL]     Date date = new Date(TEST_TIME1_UTC); [EOL]     DateMidnight test = new DateMidnight(date, (Chronology) null); [EOL]     assertEquals(ISOChronology.getInstance(), test.getChronology()); [EOL]     assertEquals(TEST_TIME1_LONDON, test.getMillis()); [EOL] } <line_num>: 442,447
public void testConstructor_nullObject_nullChronology() throws Throwable { [EOL]     DateMidnight test = new DateMidnight((Object) null, (Chronology) null); [EOL]     assertEquals(ISOChronology.getInstance(), test.getChronology()); [EOL]     assertEquals(TEST_TIME_NOW_LONDON, test.getMillis()); [EOL] } <line_num>: 452,456
public void testConstructor_badconverterObject_Chronology() throws Throwable { [EOL]     try { [EOL]         ConverterManager.getInstance().addInstantConverter(MockZeroNullIntegerConverter.INSTANCE); [EOL]         DateMidnight test = new DateMidnight(new Integer(0), GregorianChronology.getInstance()); [EOL]         assertEquals(ISOChronology.getInstance(), test.getChronology()); [EOL]         assertEquals(0L - DateTimeConstants.MILLIS_PER_HOUR, test.getMillis()); [EOL]     } finally { [EOL]         ConverterManager.getInstance().removeInstantConverter(MockZeroNullIntegerConverter.INSTANCE); [EOL]     } [EOL] } <line_num>: 461,470
public void testConstructor_int_int_int() throws Throwable { [EOL]     DateMidnight test = new DateMidnight(2002, 6, 9); [EOL]     assertEquals(ISOChronology.getInstance(), test.getChronology()); [EOL]     assertEquals(LONDON, test.getZone()); [EOL]     assertEquals(TEST_TIME_NOW_LONDON, test.getMillis()); [EOL]     assertEquals(2002, test.getYear()); [EOL]     assertEquals(6, test.getMonthOfYear()); [EOL]     assertEquals(9, test.getDayOfMonth()); [EOL]     try { [EOL]         new DateMidnight(Integer.MIN_VALUE, 6, 9); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL]     try { [EOL]         new DateMidnight(Integer.MAX_VALUE, 6, 9); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL]     try { [EOL]         new DateMidnight(2002, 0, 9); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL]     try { [EOL]         new DateMidnight(2002, 13, 9); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL]     try { [EOL]         new DateMidnight(2002, 6, 0); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL]     try { [EOL]         new DateMidnight(2002, 6, 31); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL]     new DateMidnight(2002, 7, 31); [EOL]     try { [EOL]         new DateMidnight(2002, 7, 32); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL] } <line_num>: 476,513
public void testConstructor_int_int_int_DateTimeZone() throws Throwable { [EOL]     DateMidnight test = new DateMidnight(2002, 6, 9, PARIS); [EOL]     assertEquals(ISOChronology.getInstance(PARIS), test.getChronology()); [EOL]     assertEquals(TEST_TIME_NOW_PARIS, test.getMillis()); [EOL]     assertEquals(2002, test.getYear()); [EOL]     assertEquals(6, test.getMonthOfYear()); [EOL]     assertEquals(9, test.getDayOfMonth()); [EOL]     try { [EOL]         new DateMidnight(Integer.MIN_VALUE, 6, 9, PARIS); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL]     try { [EOL]         new DateMidnight(Integer.MAX_VALUE, 6, 9, PARIS); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL]     try { [EOL]         new DateMidnight(2002, 0, 9, PARIS); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL]     try { [EOL]         new DateMidnight(2002, 13, 9, PARIS); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL]     try { [EOL]         new DateMidnight(2002, 6, 0, PARIS); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL]     try { [EOL]         new DateMidnight(2002, 6, 31, PARIS); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL]     new DateMidnight(2002, 7, 31, PARIS); [EOL]     try { [EOL]         new DateMidnight(2002, 7, 32, PARIS); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL] } <line_num>: 518,554
public void testConstructor_int_int_int_nullDateTimeZone() throws Throwable { [EOL]     DateMidnight test = new DateMidnight(2002, 6, 9, (DateTimeZone) null); [EOL]     assertEquals(ISOChronology.getInstance(), test.getChronology()); [EOL]     assertEquals(TEST_TIME_NOW_LONDON, test.getMillis()); [EOL]     assertEquals(2002, test.getYear()); [EOL]     assertEquals(6, test.getMonthOfYear()); [EOL]     assertEquals(9, test.getDayOfMonth()); [EOL] } <line_num>: 559,566
public void testConstructor_int_int_int_Chronology() throws Throwable { [EOL]     DateMidnight test = new DateMidnight(2002, 6, 9, GregorianChronology.getInstance()); [EOL]     assertEquals(GregorianChronology.getInstance(), test.getChronology()); [EOL]     assertEquals(TEST_TIME_NOW_LONDON, test.getMillis()); [EOL]     assertEquals(2002, test.getYear()); [EOL]     assertEquals(6, test.getMonthOfYear()); [EOL]     assertEquals(9, test.getDayOfMonth()); [EOL]     try { [EOL]         new DateMidnight(Integer.MIN_VALUE, 6, 9, GregorianChronology.getInstance()); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL]     try { [EOL]         new DateMidnight(Integer.MAX_VALUE, 6, 9, GregorianChronology.getInstance()); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL]     try { [EOL]         new DateMidnight(2002, 0, 9, GregorianChronology.getInstance()); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL]     try { [EOL]         new DateMidnight(2002, 13, 9, GregorianChronology.getInstance()); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL]     try { [EOL]         new DateMidnight(2002, 6, 0, GregorianChronology.getInstance()); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL]     try { [EOL]         new DateMidnight(2002, 6, 31, GregorianChronology.getInstance()); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL]     new DateMidnight(2002, 7, 31, GregorianChronology.getInstance()); [EOL]     try { [EOL]         new DateMidnight(2002, 7, 32, GregorianChronology.getInstance()); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL] } <line_num>: 571,607
public void testConstructor_int_int_int_nullChronology() throws Throwable { [EOL]     DateMidnight test = new DateMidnight(2002, 6, 9, (Chronology) null); [EOL]     assertEquals(ISOChronology.getInstance(), test.getChronology()); [EOL]     assertEquals(TEST_TIME_NOW_LONDON, test.getMillis()); [EOL]     assertEquals(2002, test.getYear()); [EOL]     assertEquals(6, test.getMonthOfYear()); [EOL]     assertEquals(9, test.getDayOfMonth()); [EOL] } <line_num>: 612,619