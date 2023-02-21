public Period()
public Period(int hours, int minutes, int seconds, int millis)
public Period(int years, int months, int weeks, int days, int hours, int minutes, int seconds, int millis)
public Period(int years, int months, int weeks, int days, int hours, int minutes, int seconds, int millis, PeriodType type)
public Period(long duration)
public Period(long duration, PeriodType type)
public Period(long duration, Chronology chronology)
public Period(long duration, PeriodType type, Chronology chronology)
public Period(long startInstant, long endInstant)
public Period(long startInstant, long endInstant, PeriodType type)
public Period(long startInstant, long endInstant, Chronology chrono)
public Period(long startInstant, long endInstant, PeriodType type, Chronology chrono)
public Period(ReadableInstant startInstant, ReadableInstant endInstant)
public Period(ReadableInstant startInstant, ReadableInstant endInstant, PeriodType type)
public Period(ReadablePartial start, ReadablePartial end)
public Period(ReadablePartial start, ReadablePartial end, PeriodType type)
public Period(ReadableInstant startInstant, ReadableDuration duration)
public Period(ReadableInstant startInstant, ReadableDuration duration, PeriodType type)
public Period(ReadableDuration duration, ReadableInstant endInstant)
public Period(ReadableDuration duration, ReadableInstant endInstant, PeriodType type)
public Period(Object period)
public Period(Object period, PeriodType type)
public Period(Object period, Chronology chrono)
public Period(Object period, PeriodType type, Chronology chrono)
private Period(int[] values, PeriodType type)
public static Period parse(String str)
public static Period parse(String str, PeriodFormatter formatter)
public static Period years(int years)
public static Period months(int months)
public static Period weeks(int weeks)
public static Period days(int days)
public static Period hours(int hours)
public static Period minutes(int minutes)
public static Period seconds(int seconds)
public static Period millis(int millis)
public static Period fieldDifference(ReadablePartial start, ReadablePartial end)
public Period toPeriod()
public int getYears()
public int getMonths()
public int getWeeks()
public int getDays()
public int getHours()
public int getMinutes()
public int getSeconds()
public int getMillis()
public Period withPeriodType(PeriodType type)
public Period withFields(ReadablePeriod period)
public Period withField(DurationFieldType field, int value)
public Period withFieldAdded(DurationFieldType field, int value)
public Period withYears(int years)
public Period withMonths(int months)
public Period withWeeks(int weeks)
public Period withDays(int days)
public Period withHours(int hours)
public Period withMinutes(int minutes)
public Period withSeconds(int seconds)
public Period withMillis(int millis)
public Period plus(ReadablePeriod period)
public Period plusYears(int years)
public Period plusMonths(int months)
public Period plusWeeks(int weeks)
public Period plusDays(int days)
public Period plusHours(int hours)
public Period plusMinutes(int minutes)
public Period plusSeconds(int seconds)
public Period plusMillis(int millis)
public Period minus(ReadablePeriod period)
public Period minusYears(int years)
public Period minusMonths(int months)
public Period minusWeeks(int weeks)
public Period minusDays(int days)
public Period minusHours(int hours)
public Period minusMinutes(int minutes)
public Period minusSeconds(int seconds)
public Period minusMillis(int millis)
public Period multipliedBy(int scalar)
public Period negated()
public Weeks toStandardWeeks()
public Days toStandardDays()
public Hours toStandardHours()
public Minutes toStandardMinutes()
public Seconds toStandardSeconds()
public Duration toStandardDuration()
private void checkYearsAndMonths(String destintionType)
public Period normalizedStandard()
public Period normalizedStandard(PeriodType type)
