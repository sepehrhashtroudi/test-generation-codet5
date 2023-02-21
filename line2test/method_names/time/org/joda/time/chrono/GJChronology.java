private GJChronology(JulianChronology julian, GregorianChronology gregorian, Instant cutoverInstant)
private GJChronology(Chronology base, JulianChronology julian, GregorianChronology gregorian, Instant cutoverInstant)
 CutoverField(DateTimeField julianField, DateTimeField gregorianField, long cutoverMillis)
 CutoverField(DateTimeField julianField, DateTimeField gregorianField, long cutoverMillis, boolean convertByWeekyear)
 CutoverField(DateTimeField julianField, DateTimeField gregorianField, DurationField rangeField, long cutoverMillis, boolean convertByWeekyear)
 ImpreciseCutoverField(DateTimeField julianField, DateTimeField gregorianField, long cutoverMillis)
 ImpreciseCutoverField(DateTimeField julianField, DateTimeField gregorianField, DurationField durationField, long cutoverMillis)
 ImpreciseCutoverField(DateTimeField julianField, DateTimeField gregorianField, DurationField durationField, DurationField rangeDurationField, long cutoverMillis)
 ImpreciseCutoverField(DateTimeField julianField, DateTimeField gregorianField, DurationField durationField, long cutoverMillis, boolean convertByWeekyear)
 LinkedDurationField(DurationField durationField, ImpreciseCutoverField dateTimeField)
private static long convertByYear(long instant, Chronology from, Chronology to)
private static long convertByWeekyear(final long instant, Chronology from, Chronology to)
public static GJChronology getInstanceUTC()
public static GJChronology getInstance()
public static GJChronology getInstance(DateTimeZone zone)
public static GJChronology getInstance(DateTimeZone zone, ReadableInstant gregorianCutover)
public static synchronized GJChronology getInstance(DateTimeZone zone, ReadableInstant gregorianCutover, int minDaysInFirstWeek)
public static GJChronology getInstance(DateTimeZone zone, long gregorianCutover, int minDaysInFirstWeek)
private Object readResolve()
public DateTimeZone getZone()
public Chronology withUTC()
public Chronology withZone(DateTimeZone zone)
public long getDateTimeMillis(int year, int monthOfYear, int dayOfMonth, int millisOfDay) throws IllegalArgumentException
public long getDateTimeMillis(int year, int monthOfYear, int dayOfMonth, int hourOfDay, int minuteOfHour, int secondOfMinute, int millisOfSecond) throws IllegalArgumentException
public Instant getGregorianCutover()
public int getMinimumDaysInFirstWeek()
public boolean equals(Object obj)
public int hashCode()
public String toString()
protected void assemble(Fields fields)
 long julianToGregorianByYear(long instant)
 long gregorianToJulianByYear(long instant)
 long julianToGregorianByWeekyear(long instant)
 long gregorianToJulianByWeekyear(long instant)
public boolean isLenient()
public int get(long instant)
public String getAsText(long instant, Locale locale)
public String getAsText(int fieldValue, Locale locale)
public String getAsShortText(long instant, Locale locale)
public String getAsShortText(int fieldValue, Locale locale)
public long add(long instant, int value)
public long add(long instant, long value)
public int[] add(ReadablePartial partial, int fieldIndex, int[] values, int valueToAdd)
public int getDifference(long minuendInstant, long subtrahendInstant)
public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant)
public long set(long instant, int value)
public long set(long instant, String text, Locale locale)
public DurationField getDurationField()
public DurationField getRangeDurationField()
public boolean isLeap(long instant)
public int getLeapAmount(long instant)
public DurationField getLeapDurationField()
public int getMinimumValue()
public int getMinimumValue(ReadablePartial partial)
public int getMinimumValue(ReadablePartial partial, int[] values)
public int getMinimumValue(long instant)
public int getMaximumValue()
public int getMaximumValue(long instant)
public int getMaximumValue(ReadablePartial partial)
public int getMaximumValue(ReadablePartial partial, int[] values)
public long roundFloor(long instant)
public long roundCeiling(long instant)
public int getMaximumTextLength(Locale locale)
public int getMaximumShortTextLength(Locale locale)
protected long julianToGregorian(long instant)
protected long gregorianToJulian(long instant)
public long add(long instant, int value)
public long add(long instant, long value)
public int getDifference(long minuendInstant, long subtrahendInstant)
public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant)
public int getMinimumValue(long instant)
public int getMaximumValue(long instant)
public long add(long instant, int value)
public long add(long instant, long value)
public int getDifference(long minuendInstant, long subtrahendInstant)
public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant)
