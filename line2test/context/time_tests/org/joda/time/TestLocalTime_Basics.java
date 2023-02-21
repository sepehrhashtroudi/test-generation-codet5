public TestLocalTime_Basics(String name)
public static void main(String[] args)
public static TestSuite suite()
protected void setUp() throws Exception
protected void tearDown() throws Exception
public void testGet_DateTimeFieldType()
public void testSize()
public void testGetFieldType_int()
public void testGetFieldTypes()
public void testGetField_int()
public void testGetFields()
public void testGetValue_int()
public void testGetValues()
public DurationFieldType getDurationType()
public DurationFieldType getRangeDurationType()
public DateTimeField getField(Chronology chronology)
public DurationFieldType getDurationType()
public DurationFieldType getRangeDurationType()
public DateTimeField getField(Chronology chronology)
public void testIsSupported_DateTimeFieldType()
public void testIsSupported_DurationFieldType()
public void testEqualsHashCode()
public Chronology getChronology()
public DateTimeField[] getFields()
public int[] getValues()
public void testCompareTo()
public void testIsEqual_LocalTime()
public void testIsBefore_LocalTime()
public void testIsAfter_LocalTime()
public void testWithField_DateTimeFieldType_int_1()
public void testWithField_DateTimeFieldType_int_2()
public void testWithField_DateTimeFieldType_int_3()
public void testWithField_DateTimeFieldType_int_4()
public void testWithFieldAdded_DurationFieldType_int_1()
public void testWithFieldAdded_DurationFieldType_int_2()
public void testWithFieldAdded_DurationFieldType_int_3()
public void testWithFieldAdded_DurationFieldType_int_4()
public void testWithFieldAdded_DurationFieldType_int_5()
public void testWithFieldAdded_DurationFieldType_int_6()
public void testWithFieldAdded_DurationFieldType_int_7()
public void testWithFieldAdded_DurationFieldType_int_8()
public void testPlus_RP()
public void testPlusHours_int()
public void testPlusMinutes_int()
public void testPlusSeconds_int()
public void testPlusMillis_int()
public void testMinus_RP()
public void testMinusHours_int()
public void testMinusMinutes_int()
public void testMinusSeconds_int()
public void testMinusMillis_int()
public void testGetters()
public void testWithers()
public void testToDateTimeTodayDefaultZone()
public void testToDateTimeToday_Zone()
public void testToDateTimeToday_nullZone()
public void testToDateTime_RI()
public void testToDateTime_nullRI()
public void testProperty()
public void testSerialization() throws Exception
public void testToString()
public void testToString_String()
public void testToString_String_Locale()
public void testToString_DTFormatter()
private void check(LocalTime test, int hour, int min, int sec, int milli)
DateTimeZone PARIS=Optional[DateTimeZone.forID("Europe/Paris")]
DateTimeZone LONDON=Optional[DateTimeZone.forID("Europe/London")]
DateTimeZone TOKYO=Optional[DateTimeZone.forID("Asia/Tokyo")]
Chronology COPTIC_PARIS=Optional[CopticChronology.getInstance(PARIS)]
Chronology COPTIC_LONDON=Optional[CopticChronology.getInstance(LONDON)]
Chronology COPTIC_TOKYO=Optional[CopticChronology.getInstance(TOKYO)]
Chronology COPTIC_UTC=Optional[CopticChronology.getInstanceUTC()]
Chronology BUDDHIST_LONDON=Optional[BuddhistChronology.getInstance(LONDON)]
long TEST_TIME_NOW=Optional[10L * DateTimeConstants.MILLIS_PER_HOUR + 20L * DateTimeConstants.MILLIS_PER_MINUTE + 30L * DateTimeConstants.MILLIS_PER_SECOND + 40L]
long TEST_TIME2=Optional[1L * DateTimeConstants.MILLIS_PER_DAY + 5L * DateTimeConstants.MILLIS_PER_HOUR + 6L * DateTimeConstants.MILLIS_PER_MINUTE + 7L * DateTimeConstants.MILLIS_PER_SECOND + 8L]
DateTimeZone zone=Optional[null]
