protected BaseChronology()
public abstract DateTimeZone getZone()
public abstract Chronology withUTC()
public abstract Chronology withZone(DateTimeZone zone)
public long getDateTimeMillis(int year, int monthOfYear, int dayOfMonth, int millisOfDay) throws IllegalArgumentException
public long getDateTimeMillis(int year, int monthOfYear, int dayOfMonth, int hourOfDay, int minuteOfHour, int secondOfMinute, int millisOfSecond) throws IllegalArgumentException
public long getDateTimeMillis(long instant, int hourOfDay, int minuteOfHour, int secondOfMinute, int millisOfSecond) throws IllegalArgumentException
public void validate(ReadablePartial partial, int[] values)
public int[] get(ReadablePartial partial, long instant)
public long set(ReadablePartial partial, long instant)
public int[] get(ReadablePeriod period, long startInstant, long endInstant)
public int[] get(ReadablePeriod period, long duration)
public long add(ReadablePeriod period, long instant, int scalar)
public long add(long instant, long duration, int scalar)
public DurationField millis()
public DateTimeField millisOfSecond()
public DateTimeField millisOfDay()
public DurationField seconds()
public DateTimeField secondOfMinute()
public DateTimeField secondOfDay()
public DurationField minutes()
public DateTimeField minuteOfHour()
public DateTimeField minuteOfDay()
public DurationField hours()
public DateTimeField hourOfDay()
public DateTimeField clockhourOfDay()
public DurationField halfdays()
public DateTimeField hourOfHalfday()
public DateTimeField clockhourOfHalfday()
public DateTimeField halfdayOfDay()
public DurationField days()
public DateTimeField dayOfWeek()
public DateTimeField dayOfMonth()
public DateTimeField dayOfYear()
public DurationField weeks()
public DateTimeField weekOfWeekyear()
public DurationField weekyears()
public DateTimeField weekyear()
public DateTimeField weekyearOfCentury()
public DurationField months()
public DateTimeField monthOfYear()
public DurationField years()
public DateTimeField year()
public DateTimeField yearOfEra()
public DateTimeField yearOfCentury()
public DurationField centuries()
public DateTimeField centuryOfEra()
public DurationField eras()
public DateTimeField era()
public abstract String toString()
