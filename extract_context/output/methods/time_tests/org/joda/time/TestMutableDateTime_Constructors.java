public TestMutableDateTime_Constructors(String name) { [EOL]     super(name); [EOL] } <line_num>: 79,81
public static void main(String[] args) { [EOL]     junit.textui.TestRunner.run(suite()); [EOL] } <line_num>: 71,73
public static TestSuite suite() { [EOL]     return new TestSuite(TestMutableDateTime_Constructors.class); [EOL] } <line_num>: 75,77
protected void setUp() throws Exception { [EOL]     DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW); [EOL]     zone = DateTimeZone.getDefault(); [EOL]     locale = Locale.getDefault(); [EOL]     DateTimeZone.setDefault(LONDON); [EOL]     java.util.TimeZone.setDefault(LONDON.toTimeZone()); [EOL]     Locale.setDefault(Locale.UK); [EOL] } <line_num>: 83,90
protected void tearDown() throws Exception { [EOL]     DateTimeUtils.setCurrentMillisSystem(); [EOL]     DateTimeZone.setDefault(zone); [EOL]     java.util.TimeZone.setDefault(zone.toTimeZone()); [EOL]     Locale.setDefault(locale); [EOL]     zone = null; [EOL] } <line_num>: 92,98
public void testTest() { [EOL]     assertEquals("2002-06-09T00:00:00.000Z", new Instant(TEST_TIME_NOW).toString()); [EOL]     assertEquals("2002-04-05T12:24:00.000Z", new Instant(TEST_TIME1).toString()); [EOL]     assertEquals("2003-05-06T14:28:00.000Z", new Instant(TEST_TIME2).toString()); [EOL] } <line_num>: 101,105
public void test_now() throws Throwable { [EOL]     MutableDateTime test = MutableDateTime.now(); [EOL]     assertEquals(ISOChronology.getInstance(), test.getChronology()); [EOL]     assertEquals(TEST_TIME_NOW, test.getMillis()); [EOL] } <line_num>: 111,115
public void test_now_DateTimeZone() throws Throwable { [EOL]     MutableDateTime test = MutableDateTime.now(PARIS); [EOL]     assertEquals(ISOChronology.getInstance(PARIS), test.getChronology()); [EOL]     assertEquals(TEST_TIME_NOW, test.getMillis()); [EOL] } <line_num>: 120,124
public void test_now_nullDateTimeZone() throws Throwable { [EOL]     try { [EOL]         MutableDateTime.now((DateTimeZone) null); [EOL]         fail(); [EOL]     } catch (NullPointerException ex) { [EOL]     } [EOL] } <line_num>: 129,134
public void test_now_Chronology() throws Throwable { [EOL]     MutableDateTime test = MutableDateTime.now(GregorianChronology.getInstance()); [EOL]     assertEquals(GregorianChronology.getInstance(), test.getChronology()); [EOL]     assertEquals(TEST_TIME_NOW, test.getMillis()); [EOL] } <line_num>: 139,143
public void test_now_nullChronology() throws Throwable { [EOL]     try { [EOL]         MutableDateTime.now((Chronology) null); [EOL]         fail(); [EOL]     } catch (NullPointerException ex) { [EOL]     } [EOL] } <line_num>: 148,153
public void testParse_noFormatter() throws Throwable { [EOL]     assertEquals(new MutableDateTime(2010, 6, 30, 1, 20, 0, 0, ISOChronology.getInstance(DateTimeZone.forOffsetHours(2))), MutableDateTime.parse("2010-06-30T01:20+02:00")); [EOL]     assertEquals(new MutableDateTime(2010, 1, 2, 14, 50, 0, 0, ISOChronology.getInstance(LONDON)), MutableDateTime.parse("2010-002T14:50")); [EOL] } <line_num>: 156,159
public void testParse_formatter() throws Throwable { [EOL]     DateTimeFormatter f = DateTimeFormat.forPattern("yyyy--dd MM HH").withChronology(ISOChronology.getInstance(PARIS)); [EOL]     assertEquals(new MutableDateTime(2010, 6, 30, 13, 0, 0, 0, ISOChronology.getInstance(PARIS)), MutableDateTime.parse("2010--30 06 13", f)); [EOL] } <line_num>: 161,164
public void testConstructor() throws Throwable { [EOL]     MutableDateTime test = new MutableDateTime(); [EOL]     assertEquals(ISOChronology.getInstance(), test.getChronology()); [EOL]     assertEquals(TEST_TIME_NOW, test.getMillis()); [EOL] } <line_num>: 170,174
public void testConstructor_DateTimeZone() throws Throwable { [EOL]     MutableDateTime test = new MutableDateTime(PARIS); [EOL]     assertEquals(ISOChronology.getInstance(PARIS), test.getChronology()); [EOL]     assertEquals(TEST_TIME_NOW, test.getMillis()); [EOL] } <line_num>: 179,183
public void testConstructor_nullDateTimeZone() throws Throwable { [EOL]     MutableDateTime test = new MutableDateTime((DateTimeZone) null); [EOL]     assertEquals(ISOChronology.getInstance(), test.getChronology()); [EOL]     assertEquals(TEST_TIME_NOW, test.getMillis()); [EOL] } <line_num>: 188,192
public void testConstructor_Chronology() throws Throwable { [EOL]     MutableDateTime test = new MutableDateTime(GregorianChronology.getInstance()); [EOL]     assertEquals(GregorianChronology.getInstance(), test.getChronology()); [EOL]     assertEquals(TEST_TIME_NOW, test.getMillis()); [EOL] } <line_num>: 197,201
public void testConstructor_nullChronology() throws Throwable { [EOL]     MutableDateTime test = new MutableDateTime((Chronology) null); [EOL]     assertEquals(ISOChronology.getInstance(), test.getChronology()); [EOL]     assertEquals(TEST_TIME_NOW, test.getMillis()); [EOL] } <line_num>: 206,210
public void testConstructor_long1() throws Throwable { [EOL]     MutableDateTime test = new MutableDateTime(TEST_TIME1); [EOL]     assertEquals(ISOChronology.getInstance(), test.getChronology()); [EOL]     assertEquals(TEST_TIME1, test.getMillis()); [EOL] } <line_num>: 216,220
public void testConstructor_long2() throws Throwable { [EOL]     MutableDateTime test = new MutableDateTime(TEST_TIME2); [EOL]     assertEquals(ISOChronology.getInstance(), test.getChronology()); [EOL]     assertEquals(TEST_TIME2, test.getMillis()); [EOL] } <line_num>: 225,229
public void testConstructor_long1_DateTimeZone() throws Throwable { [EOL]     MutableDateTime test = new MutableDateTime(TEST_TIME1, PARIS); [EOL]     assertEquals(ISOChronology.getInstance(PARIS), test.getChronology()); [EOL]     assertEquals(TEST_TIME1, test.getMillis()); [EOL] } <line_num>: 234,238
public void testConstructor_long2_DateTimeZone() throws Throwable { [EOL]     MutableDateTime test = new MutableDateTime(TEST_TIME2, PARIS); [EOL]     assertEquals(ISOChronology.getInstance(PARIS), test.getChronology()); [EOL]     assertEquals(TEST_TIME2, test.getMillis()); [EOL] } <line_num>: 243,247
public void testConstructor_long_nullDateTimeZone() throws Throwable { [EOL]     MutableDateTime test = new MutableDateTime(TEST_TIME1, (DateTimeZone) null); [EOL]     assertEquals(ISOChronology.getInstance(), test.getChronology()); [EOL]     assertEquals(TEST_TIME1, test.getMillis()); [EOL] } <line_num>: 252,256
public void testConstructor_long1_Chronology() throws Throwable { [EOL]     MutableDateTime test = new MutableDateTime(TEST_TIME1, GregorianChronology.getInstance()); [EOL]     assertEquals(GregorianChronology.getInstance(), test.getChronology()); [EOL]     assertEquals(TEST_TIME1, test.getMillis()); [EOL] } <line_num>: 261,265
public void testConstructor_long2_Chronology() throws Throwable { [EOL]     MutableDateTime test = new MutableDateTime(TEST_TIME2, GregorianChronology.getInstance()); [EOL]     assertEquals(GregorianChronology.getInstance(), test.getChronology()); [EOL]     assertEquals(TEST_TIME2, test.getMillis()); [EOL] } <line_num>: 270,274
public void testConstructor_long_nullChronology() throws Throwable { [EOL]     MutableDateTime test = new MutableDateTime(TEST_TIME1, (Chronology) null); [EOL]     assertEquals(ISOChronology.getInstance(), test.getChronology()); [EOL]     assertEquals(TEST_TIME1, test.getMillis()); [EOL] } <line_num>: 279,283
public void testConstructor_Object() throws Throwable { [EOL]     Date date = new Date(TEST_TIME1); [EOL]     MutableDateTime test = new MutableDateTime(date); [EOL]     assertEquals(ISOChronology.getInstance(), test.getChronology()); [EOL]     assertEquals(TEST_TIME1, test.getMillis()); [EOL] } <line_num>: 289,294
public void testConstructor_invalidObject() throws Throwable { [EOL]     try { [EOL]         new MutableDateTime(new Object()); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL] } <line_num>: 299,304
public void testConstructor_nullObject() throws Throwable { [EOL]     MutableDateTime test = new MutableDateTime((Object) null); [EOL]     assertEquals(ISOChronology.getInstance(), test.getChronology()); [EOL]     assertEquals(TEST_TIME_NOW, test.getMillis()); [EOL] } <line_num>: 309,313
public void testConstructor_badconverterObject() throws Throwable { [EOL]     try { [EOL]         ConverterManager.getInstance().addInstantConverter(MockZeroNullIntegerConverter.INSTANCE); [EOL]         MutableDateTime test = new MutableDateTime(new Integer(0)); [EOL]         assertEquals(ISOChronology.getInstance(), test.getChronology()); [EOL]         assertEquals(0L, test.getMillis()); [EOL]     } finally { [EOL]         ConverterManager.getInstance().removeInstantConverter(MockZeroNullIntegerConverter.INSTANCE); [EOL]     } [EOL] } <line_num>: 318,327
public void testConstructor_Object_DateTimeZone() throws Throwable { [EOL]     Date date = new Date(TEST_TIME1); [EOL]     MutableDateTime test = new MutableDateTime(date, PARIS); [EOL]     assertEquals(ISOChronology.getInstance(PARIS), test.getChronology()); [EOL]     assertEquals(TEST_TIME1, test.getMillis()); [EOL] } <line_num>: 332,337
public void testConstructor_invalidObject_DateTimeZone() throws Throwable { [EOL]     try { [EOL]         new MutableDateTime(new Object(), PARIS); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL] } <line_num>: 342,347
public void testConstructor_nullObject_DateTimeZone() throws Throwable { [EOL]     MutableDateTime test = new MutableDateTime((Object) null, PARIS); [EOL]     assertEquals(ISOChronology.getInstance(PARIS), test.getChronology()); [EOL]     assertEquals(TEST_TIME_NOW, test.getMillis()); [EOL] } <line_num>: 352,356
public void testConstructor_Object_nullDateTimeZone() throws Throwable { [EOL]     Date date = new Date(TEST_TIME1); [EOL]     MutableDateTime test = new MutableDateTime(date, (DateTimeZone) null); [EOL]     assertEquals(ISOChronology.getInstance(), test.getChronology()); [EOL]     assertEquals(TEST_TIME1, test.getMillis()); [EOL] } <line_num>: 361,366
public void testConstructor_nullObject_nullDateTimeZone() throws Throwable { [EOL]     MutableDateTime test = new MutableDateTime((Object) null, (DateTimeZone) null); [EOL]     assertEquals(ISOChronology.getInstance(), test.getChronology()); [EOL]     assertEquals(TEST_TIME_NOW, test.getMillis()); [EOL] } <line_num>: 371,375
public void testConstructor_badconverterObject_DateTimeZone() throws Throwable { [EOL]     try { [EOL]         ConverterManager.getInstance().addInstantConverter(MockZeroNullIntegerConverter.INSTANCE); [EOL]         MutableDateTime test = new MutableDateTime(new Integer(0), GregorianChronology.getInstance()); [EOL]         assertEquals(ISOChronology.getInstance(), test.getChronology()); [EOL]         assertEquals(0L, test.getMillis()); [EOL]     } finally { [EOL]         ConverterManager.getInstance().removeInstantConverter(MockZeroNullIntegerConverter.INSTANCE); [EOL]     } [EOL] } <line_num>: 380,389
public void testConstructor_Object_Chronology() throws Throwable { [EOL]     Date date = new Date(TEST_TIME1); [EOL]     MutableDateTime test = new MutableDateTime(date, GregorianChronology.getInstance()); [EOL]     assertEquals(GregorianChronology.getInstance(), test.getChronology()); [EOL]     assertEquals(TEST_TIME1, test.getMillis()); [EOL] } <line_num>: 394,399
public void testConstructor_invalidObject_Chronology() throws Throwable { [EOL]     try { [EOL]         new MutableDateTime(new Object(), GregorianChronology.getInstance()); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL] } <line_num>: 404,409
public void testConstructor_nullObject_Chronology() throws Throwable { [EOL]     MutableDateTime test = new MutableDateTime((Object) null, GregorianChronology.getInstance()); [EOL]     assertEquals(GregorianChronology.getInstance(), test.getChronology()); [EOL]     assertEquals(TEST_TIME_NOW, test.getMillis()); [EOL] } <line_num>: 414,418
public void testConstructor_Object_nullChronology() throws Throwable { [EOL]     Date date = new Date(TEST_TIME1); [EOL]     MutableDateTime test = new MutableDateTime(date, (Chronology) null); [EOL]     assertEquals(ISOChronology.getInstance(), test.getChronology()); [EOL]     assertEquals(TEST_TIME1, test.getMillis()); [EOL] } <line_num>: 423,428
public void testConstructor_nullObject_nullChronology() throws Throwable { [EOL]     MutableDateTime test = new MutableDateTime((Object) null, (Chronology) null); [EOL]     assertEquals(ISOChronology.getInstance(), test.getChronology()); [EOL]     assertEquals(TEST_TIME_NOW, test.getMillis()); [EOL] } <line_num>: 433,437
public void testConstructor_badconverterObject_Chronology() throws Throwable { [EOL]     try { [EOL]         ConverterManager.getInstance().addInstantConverter(MockZeroNullIntegerConverter.INSTANCE); [EOL]         MutableDateTime test = new MutableDateTime(new Integer(0), GregorianChronology.getInstance()); [EOL]         assertEquals(ISOChronology.getInstance(), test.getChronology()); [EOL]         assertEquals(0L, test.getMillis()); [EOL]     } finally { [EOL]         ConverterManager.getInstance().removeInstantConverter(MockZeroNullIntegerConverter.INSTANCE); [EOL]     } [EOL] } <line_num>: 442,451
public void testConstructor_int_int_int_int_int_int_int() throws Throwable { [EOL]     MutableDateTime test = new MutableDateTime(2002, 6, 9, 1, 0, 0, 0); [EOL]     assertEquals(ISOChronology.getInstance(), test.getChronology()); [EOL]     assertEquals(LONDON, test.getZone()); [EOL]     assertEquals(TEST_TIME_NOW, test.getMillis()); [EOL]     try { [EOL]         new MutableDateTime(Integer.MIN_VALUE, 6, 9, 0, 0, 0, 0); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL]     try { [EOL]         new MutableDateTime(Integer.MAX_VALUE, 6, 9, 0, 0, 0, 0); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL]     try { [EOL]         new MutableDateTime(2002, 0, 9, 0, 0, 0, 0); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL]     try { [EOL]         new MutableDateTime(2002, 13, 9, 0, 0, 0, 0); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL]     try { [EOL]         new MutableDateTime(2002, 6, 0, 0, 0, 0, 0); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL]     try { [EOL]         new MutableDateTime(2002, 6, 31, 0, 0, 0, 0); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL]     new MutableDateTime(2002, 7, 31, 0, 0, 0, 0); [EOL]     try { [EOL]         new MutableDateTime(2002, 7, 32, 0, 0, 0, 0); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL] } <line_num>: 457,491
public void testConstructor_int_int_int_int_int_int_int_DateTimeZone() throws Throwable { [EOL]     MutableDateTime test = new MutableDateTime(2002, 6, 9, 2, 0, 0, 0, PARIS); [EOL]     assertEquals(ISOChronology.getInstance(PARIS), test.getChronology()); [EOL]     assertEquals(TEST_TIME_NOW, test.getMillis()); [EOL]     try { [EOL]         new MutableDateTime(Integer.MIN_VALUE, 6, 9, 0, 0, 0, 0, PARIS); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL]     try { [EOL]         new MutableDateTime(Integer.MAX_VALUE, 6, 9, 0, 0, 0, 0, PARIS); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL]     try { [EOL]         new MutableDateTime(2002, 0, 9, 0, 0, 0, 0, PARIS); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL]     try { [EOL]         new MutableDateTime(2002, 13, 9, 0, 0, 0, 0, PARIS); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL]     try { [EOL]         new MutableDateTime(2002, 6, 0, 0, 0, 0, 0, PARIS); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL]     try { [EOL]         new MutableDateTime(2002, 6, 31, 0, 0, 0, 0, PARIS); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL]     new MutableDateTime(2002, 7, 31, 0, 0, 0, 0, PARIS); [EOL]     try { [EOL]         new MutableDateTime(2002, 7, 32, 0, 0, 0, 0, PARIS); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL] } <line_num>: 496,529
public void testConstructor_int_int_int_int_int_int_int_nullDateTimeZone() throws Throwable { [EOL]     MutableDateTime test = new MutableDateTime(2002, 6, 9, 1, 0, 0, 0, (DateTimeZone) null); [EOL]     assertEquals(ISOChronology.getInstance(), test.getChronology()); [EOL]     assertEquals(TEST_TIME_NOW, test.getMillis()); [EOL] } <line_num>: 534,538
public void testConstructor_int_int_int_int_int_int_int_Chronology() throws Throwable { [EOL]     MutableDateTime test = new MutableDateTime(2002, 6, 9, 1, 0, 0, 0, GregorianChronology.getInstance()); [EOL]     assertEquals(GregorianChronology.getInstance(), test.getChronology()); [EOL]     assertEquals(TEST_TIME_NOW, test.getMillis()); [EOL]     try { [EOL]         new MutableDateTime(Integer.MIN_VALUE, 6, 9, 0, 0, 0, 0, GregorianChronology.getInstance()); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL]     try { [EOL]         new MutableDateTime(Integer.MAX_VALUE, 6, 9, 0, 0, 0, 0, GregorianChronology.getInstance()); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL]     try { [EOL]         new MutableDateTime(2002, 0, 9, 0, 0, 0, 0, GregorianChronology.getInstance()); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL]     try { [EOL]         new MutableDateTime(2002, 13, 9, 0, 0, 0, 0, GregorianChronology.getInstance()); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL]     try { [EOL]         new MutableDateTime(2002, 6, 0, 0, 0, 0, 0, GregorianChronology.getInstance()); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL]     try { [EOL]         new MutableDateTime(2002, 6, 31, 0, 0, 0, 0, GregorianChronology.getInstance()); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL]     new MutableDateTime(2002, 7, 31, 0, 0, 0, 0, GregorianChronology.getInstance()); [EOL]     try { [EOL]         new MutableDateTime(2002, 7, 32, 0, 0, 0, 0, GregorianChronology.getInstance()); [EOL]         fail(); [EOL]     } catch (IllegalArgumentException ex) { [EOL]     } [EOL] } <line_num>: 543,576
public void testConstructor_int_int_int_int_int_int_int_nullChronology() throws Throwable { [EOL]     MutableDateTime test = new MutableDateTime(2002, 6, 9, 1, 0, 0, 0, (Chronology) null); [EOL]     assertEquals(ISOChronology.getInstance(), test.getChronology()); [EOL]     assertEquals(TEST_TIME_NOW, test.getMillis()); [EOL] } <line_num>: 581,585