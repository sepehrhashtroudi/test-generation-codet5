public TestTimeOfDay_Properties(String name)
public static void main(String[] args)
public static TestSuite suite()
protected void setUp() throws Exception
protected void tearDown() throws Exception
public void testPropertyGetHour()
public void testPropertyGetMaxMinValuesHour()
public void testPropertyAddHour()
public void testPropertyAddNoWrapHour()
public void testPropertyAddWrapFieldHour()
public void testPropertySetHour()
public void testPropertySetTextHour()
public void testPropertyWithMaximumValueHour()
public void testPropertyWithMinimumValueHour()
public void testPropertyCompareToHour()
public void testPropertyGetMinute()
public void testPropertyGetMaxMinValuesMinute()
public void testPropertyAddMinute()
public void testPropertyAddNoWrapMinute()
public void testPropertyAddWrapFieldMinute()
public void testPropertySetMinute()
public void testPropertySetTextMinute()
public void testPropertyCompareToMinute()
public void testPropertyGetSecond()
public void testPropertyGetMaxMinValuesSecond()
public void testPropertyAddSecond()
public void testPropertyAddNoWrapSecond()
public void testPropertyAddWrapFieldSecond()
public void testPropertySetSecond()
public void testPropertySetTextSecond()
public void testPropertyCompareToSecond()
public void testPropertyGetMilli()
public void testPropertyGetMaxMinValuesMilli()
public void testPropertyAddMilli()
public void testPropertyAddNoWrapMilli()
public void testPropertyAddWrapFieldMilli()
public void testPropertySetMilli()
public void testPropertySetTextMilli()
public void testPropertyCompareToMilli()
private void check(TimeOfDay test, int hour, int min, int sec, int milli)
DateTimeZone LONDON=Optional[DateTimeZone.forID("Europe/London")]
long TEST_TIME_NOW=Optional[10L * DateTimeConstants.MILLIS_PER_HOUR + 20L * DateTimeConstants.MILLIS_PER_MINUTE + 30L * DateTimeConstants.MILLIS_PER_SECOND + 40L]
long TEST_TIME1=Optional[1L * DateTimeConstants.MILLIS_PER_HOUR + 2L * DateTimeConstants.MILLIS_PER_MINUTE + 3L * DateTimeConstants.MILLIS_PER_SECOND + 4L]
long TEST_TIME2=Optional[1L * DateTimeConstants.MILLIS_PER_DAY + 5L * DateTimeConstants.MILLIS_PER_HOUR + 6L * DateTimeConstants.MILLIS_PER_MINUTE + 7L * DateTimeConstants.MILLIS_PER_SECOND + 8L]
DateTimeZone zone=Optional[null]
