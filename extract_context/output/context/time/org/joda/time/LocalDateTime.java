public LocalDateTime()
public LocalDateTime(DateTimeZone zone)
public LocalDateTime(Chronology chronology)
public LocalDateTime(long instant)
public LocalDateTime(long instant, DateTimeZone zone)
public LocalDateTime(long instant, Chronology chronology)
public LocalDateTime(Object instant)
public LocalDateTime(Object instant, DateTimeZone zone)
public LocalDateTime(Object instant, Chronology chronology)
public LocalDateTime(int year, int monthOfYear, int dayOfMonth, int hourOfDay, int minuteOfHour)
public LocalDateTime(int year, int monthOfYear, int dayOfMonth, int hourOfDay, int minuteOfHour, int secondOfMinute)
public LocalDateTime(int year, int monthOfYear, int dayOfMonth, int hourOfDay, int minuteOfHour, int secondOfMinute, int millisOfSecond)
public LocalDateTime(int year, int monthOfYear, int dayOfMonth, int hourOfDay, int minuteOfHour, int secondOfMinute, int millisOfSecond, Chronology chronology)
 Property(LocalDateTime instant, DateTimeField field)
public static LocalDateTime now()
public static LocalDateTime now(DateTimeZone zone)
public static LocalDateTime now(Chronology chronology)
public static LocalDateTime parse(String str)
public static LocalDateTime parse(String str, DateTimeFormatter formatter)
public static LocalDateTime fromCalendarFields(Calendar calendar)
public static LocalDateTime fromDateFields(Date date)
private Object readResolve()
public int size()
protected DateTimeField getField(int index, Chronology chrono)
public int getValue(int index)
public int get(DateTimeFieldType type)
public boolean isSupported(DateTimeFieldType type)
public boolean isSupported(DurationFieldType type)
protected long getLocalMillis()
public Chronology getChronology()
public boolean equals(Object partial)
public int compareTo(ReadablePartial partial)
public DateTime toDateTime()
public DateTime toDateTime(DateTimeZone zone)
public LocalDate toLocalDate()
public LocalTime toLocalTime()
public Date toDate()
public Date toDate(final TimeZone timeZone)
private Date correctDstTransition(Date date, final TimeZone timeZone)
 LocalDateTime withLocalMillis(long newMillis)
public LocalDateTime withDate(int year, int monthOfYear, int dayOfMonth)
public LocalDateTime withTime(int hourOfDay, int minuteOfHour, int secondOfMinute, int millisOfSecond)
public LocalDateTime withFields(ReadablePartial partial)
public LocalDateTime withField(DateTimeFieldType fieldType, int value)
public LocalDateTime withFieldAdded(DurationFieldType fieldType, int amount)
public LocalDateTime withDurationAdded(ReadableDuration durationToAdd, int scalar)
public LocalDateTime withPeriodAdded(ReadablePeriod period, int scalar)
public LocalDateTime plus(ReadableDuration duration)
public LocalDateTime plus(ReadablePeriod period)
public LocalDateTime plusYears(int years)
public LocalDateTime plusMonths(int months)
public LocalDateTime plusWeeks(int weeks)
public LocalDateTime plusDays(int days)
public LocalDateTime plusHours(int hours)
public LocalDateTime plusMinutes(int minutes)
public LocalDateTime plusSeconds(int seconds)
public LocalDateTime plusMillis(int millis)
public LocalDateTime minus(ReadableDuration duration)
public LocalDateTime minus(ReadablePeriod period)
public LocalDateTime minusYears(int years)
public LocalDateTime minusMonths(int months)
public LocalDateTime minusWeeks(int weeks)
public LocalDateTime minusDays(int days)
public LocalDateTime minusHours(int hours)
public LocalDateTime minusMinutes(int minutes)
public LocalDateTime minusSeconds(int seconds)
public LocalDateTime minusMillis(int millis)
public Property property(DateTimeFieldType fieldType)
public int getEra()
public int getCenturyOfEra()
public int getYearOfEra()
public int getYearOfCentury()
public int getYear()
public int getWeekyear()
public int getMonthOfYear()
public int getWeekOfWeekyear()
public int getDayOfYear()
public int getDayOfMonth()
public int getDayOfWeek()
public int getHourOfDay()
public int getMinuteOfHour()
public int getSecondOfMinute()
public int getMillisOfSecond()
public int getMillisOfDay()
public LocalDateTime withEra(int era)
public LocalDateTime withCenturyOfEra(int centuryOfEra)
public LocalDateTime withYearOfEra(int yearOfEra)
public LocalDateTime withYearOfCentury(int yearOfCentury)
public LocalDateTime withYear(int year)
public LocalDateTime withWeekyear(int weekyear)
public LocalDateTime withMonthOfYear(int monthOfYear)
public LocalDateTime withWeekOfWeekyear(int weekOfWeekyear)
public LocalDateTime withDayOfYear(int dayOfYear)
public LocalDateTime withDayOfMonth(int dayOfMonth)
public LocalDateTime withDayOfWeek(int dayOfWeek)
public LocalDateTime withHourOfDay(int hour)
public LocalDateTime withMinuteOfHour(int minute)
public LocalDateTime withSecondOfMinute(int second)
public LocalDateTime withMillisOfSecond(int millis)
public LocalDateTime withMillisOfDay(int millis)
public Property era()
public Property centuryOfEra()
public Property yearOfCentury()
public Property yearOfEra()
public Property year()
public Property weekyear()
public Property monthOfYear()
public Property weekOfWeekyear()
public Property dayOfYear()
public Property dayOfMonth()
public Property dayOfWeek()
public Property hourOfDay()
public Property minuteOfHour()
public Property secondOfMinute()
public Property millisOfSecond()
public Property millisOfDay()
public String toString()
public String toString(String pattern)
public String toString(String pattern, Locale locale) throws IllegalArgumentException
private void writeObject(ObjectOutputStream oos) throws IOException
private void readObject(ObjectInputStream oos) throws IOException, ClassNotFoundException
public DateTimeField getField()
protected long getMillis()
protected Chronology getChronology()
public LocalDateTime getLocalDateTime()
public LocalDateTime addToCopy(int value)
public LocalDateTime addToCopy(long value)
public LocalDateTime addWrapFieldToCopy(int value)
public LocalDateTime setCopy(int value)
public LocalDateTime setCopy(String text, Locale locale)
public LocalDateTime setCopy(String text)
public LocalDateTime withMaximumValue()
public LocalDateTime withMinimumValue()
public LocalDateTime roundFloorCopy()
public LocalDateTime roundCeilingCopy()
public LocalDateTime roundHalfFloorCopy()
public LocalDateTime roundHalfCeilingCopy()
public LocalDateTime roundHalfEvenCopy()
long serialVersionUID=Optional[-268716875315837168L]
int YEAR=Optional[0]
int MONTH_OF_YEAR=Optional[1]
int DAY_OF_MONTH=Optional[2]
int MILLIS_OF_DAY=Optional[3]
long iLocalMillis
Chronology iChronology