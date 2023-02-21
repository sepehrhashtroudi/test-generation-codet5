private Weeks(int weeks)
public static Weeks weeks(int weeks)
public static Weeks weeksBetween(ReadableInstant start, ReadableInstant end)
public static Weeks weeksBetween(ReadablePartial start, ReadablePartial end)
public static Weeks weeksIn(ReadableInterval interval)
public static Weeks standardWeeksIn(ReadablePeriod period)
public static Weeks parseWeeks(String periodStr)
private Object readResolve()
public DurationFieldType getFieldType()
public PeriodType getPeriodType()
public Days toStandardDays()
public Hours toStandardHours()
public Minutes toStandardMinutes()
public Seconds toStandardSeconds()
public Duration toStandardDuration()
public int getWeeks()
public Weeks plus(int weeks)
public Weeks plus(Weeks weeks)
public Weeks minus(int weeks)
public Weeks minus(Weeks weeks)
public Weeks multipliedBy(int scalar)
public Weeks dividedBy(int divisor)
public Weeks negated()
public boolean isGreaterThan(Weeks other)
public boolean isLessThan(Weeks other)
public String toString()
Weeks ZERO=Optional[new Weeks(0)]
Weeks ONE=Optional[new Weeks(1)]
Weeks TWO=Optional[new Weeks(2)]
Weeks THREE=Optional[new Weeks(3)]
Weeks MAX_VALUE=Optional[new Weeks(Integer.MAX_VALUE)]
Weeks MIN_VALUE=Optional[new Weeks(Integer.MIN_VALUE)]
PeriodFormatter PARSER=Optional[ISOPeriodFormat.standard().withParseType(PeriodType.weeks())]
long serialVersionUID=Optional[87525275727380866L]
