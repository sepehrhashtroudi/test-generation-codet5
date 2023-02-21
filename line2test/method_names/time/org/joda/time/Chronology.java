public abstract DateTimeZone getZone()
public abstract Chronology withUTC()
public abstract Chronology withZone(DateTimeZone zone)
public abstract long getDateTimeMillis(int year, int monthOfYear, int dayOfMonth, int millisOfDay)
public abstract long getDateTimeMillis(int year, int monthOfYear, int dayOfMonth, int hourOfDay, int minuteOfHour, int secondOfMinute, int millisOfSecond)
public abstract long getDateTimeMillis(long instant, int hourOfDay, int minuteOfHour, int secondOfMinute, int millisOfSecond)
public abstract void validate(ReadablePartial partial, int[] values)
public abstract int[] get(ReadablePartial partial, long instant)
public abstract long set(ReadablePartial partial, long instant)
public abstract int[] get(ReadablePeriod period, long startInstant, long endInstant)
public abstract int[] get(ReadablePeriod period, long duration)
public abstract long add(ReadablePeriod period, long instant, int scalar)
public abstract long add(long instant, long duration, int scalar)
public abstract DurationField millis()
public abstract DateTimeField millisOfSecond()
public abstract DateTimeField millisOfDay()
public abstract DurationField seconds()
public abstract DateTimeField secondOfMinute()
public abstract DateTimeField secondOfDay()
public abstract DurationField minutes()
public abstract DateTimeField minuteOfHour()
public abstract DateTimeField minuteOfDay()
public abstract DurationField hours()
public abstract DateTimeField hourOfDay()
public abstract DateTimeField clockhourOfDay()
public abstract DurationField halfdays()
public abstract DateTimeField hourOfHalfday()
public abstract DateTimeField clockhourOfHalfday()
public abstract DateTimeField halfdayOfDay()
public abstract DurationField days()
public abstract DateTimeField dayOfWeek()
public abstract DateTimeField dayOfMonth()
public abstract DateTimeField dayOfYear()
public abstract DurationField weeks()
public abstract DateTimeField weekOfWeekyear()
public abstract DurationField weekyears()
public abstract DateTimeField weekyear()
public abstract DateTimeField weekyearOfCentury()
public abstract DurationField months()
public abstract DateTimeField monthOfYear()
public abstract DurationField years()
public abstract DateTimeField year()
public abstract DateTimeField yearOfEra()
public abstract DateTimeField yearOfCentury()
public abstract DurationField centuries()
public abstract DateTimeField centuryOfEra()
public abstract DurationField eras()
public abstract DateTimeField era()
public abstract String toString()
