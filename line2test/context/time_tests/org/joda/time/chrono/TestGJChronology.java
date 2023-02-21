public TestGJChronology(String name)
public static void main(String[] args)
public static TestSuite suite()
protected void setUp() throws Exception
protected void tearDown() throws Exception
public void testFactoryUTC()
public void testFactory()
public void testFactory_Zone()
public void testFactory_Zone_long_int()
public void testFactory_Zone_RI()
public void testFactory_Zone_RI_int()
public void testEquality()
public void testWithUTC()
public void testWithZone()
public void testToString()
public void testDurationFields()
public void testDateFields()
public void testTimeFields()
public void testIllegalDates()
public void testParseEquivalence()
private void testParse(String str, int year, int month, int day, int hour, int minute, int second, int millis)
public void testCutoverAddYears()
public void testCutoverAddWeekyears()
public void testCutoverAddMonths()
public void testCutoverAddWeeks()
public void testCutoverAddDays()
public void testYearEndAddDays()
public void testSubtractDays()
private void testAdd(String start, DurationFieldType type, int amt, String end)
public void testTimeOfDayAdd()
public void testMaximumValue()
public void testPartialGetAsText()
public void testLeapYearRulesConstruction()
public void testLeapYearRulesConstructionInvalid()
DateTimeZone PARIS=Optional[DateTimeZone.forID("Europe/Paris")]
DateTimeZone LONDON=Optional[DateTimeZone.forID("Europe/London")]
DateTimeZone TOKYO=Optional[DateTimeZone.forID("Asia/Tokyo")]
long y2002days=Optional[365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365]
long TEST_TIME_NOW=Optional[(y2002days + 31L + 28L + 31L + 30L + 31L + 9L - 1L) * DateTimeConstants.MILLIS_PER_DAY]
DateTimeZone originalDateTimeZone=Optional[null]
TimeZone originalTimeZone=Optional[null]
Locale originalLocale=Optional[null]
