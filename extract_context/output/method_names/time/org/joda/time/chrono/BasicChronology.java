 BasicChronology(Chronology base, Object param, int minDaysInFirstWeek)
 HalfdayField()
 YearInfo(int year, long firstDayMillis)
public DateTimeZone getZone()
public long getDateTimeMillis(int year, int monthOfYear, int dayOfMonth, int millisOfDay) throws IllegalArgumentException
public long getDateTimeMillis(int year, int monthOfYear, int dayOfMonth, int hourOfDay, int minuteOfHour, int secondOfMinute, int millisOfSecond) throws IllegalArgumentException
public int getMinimumDaysInFirstWeek()
public boolean equals(Object obj)
public int hashCode()
public String toString()
protected void assemble(Fields fields)
 int getDaysInYearMax()
 int getDaysInYear(int year)
 int getWeeksInYear(int year)
 long getFirstWeekOfYearMillis(int year)
 long getYearMillis(int year)
 long getYearMonthMillis(int year, int month)
 long getYearMonthDayMillis(int year, int month, int dayOfMonth)
 int getYear(long instant)
 int getMonthOfYear(long millis)
 abstract int getMonthOfYear(long millis, int year)
 int getDayOfMonth(long millis)
 int getDayOfMonth(long millis, int year)
 int getDayOfMonth(long millis, int year, int month)
 int getDayOfYear(long instant)
 int getDayOfYear(long instant, int year)
 int getWeekyear(long instant)
 int getWeekOfWeekyear(long instant)
 int getWeekOfWeekyear(long instant, int year)
 int getDayOfWeek(long instant)
 int getMillisOfDay(long instant)
 int getDaysInMonthMax()
 int getDaysInMonthMax(long instant)
 int getDaysInMonthMaxForSet(long instant, int value)
 long getDateMidnightMillis(int year, int monthOfYear, int dayOfMonth)
 abstract long getYearDifference(long minuendInstant, long subtrahendInstant)
 abstract boolean isLeapYear(int year)
 abstract int getDaysInYearMonth(int year, int month)
 abstract int getDaysInMonthMax(int month)
 abstract long getTotalMillisByYearMonth(int year, int month)
 abstract long calculateFirstDayOfYearMillis(int year)
 abstract int getMinYear()
 abstract int getMaxYear()
 int getMaxMonth(int year)
 int getMaxMonth()
 abstract long getAverageMillisPerYear()
 abstract long getAverageMillisPerYearDividedByTwo()
 abstract long getAverageMillisPerMonth()
 abstract long getApproxMillisAtEpochDividedByTwo()
 abstract long setYear(long instant, int year)
private YearInfo getYearInfo(int year)
public String getAsText(int fieldValue, Locale locale)
public long set(long millis, String text, Locale locale)
public int getMaximumTextLength(Locale locale)
