private MillisDurationField()
public DurationFieldType getType()
public String getName()
public boolean isSupported()
public final boolean isPrecise()
public final long getUnitMillis()
public int getValue(long duration)
public long getValueAsLong(long duration)
public int getValue(long duration, long instant)
public long getValueAsLong(long duration, long instant)
public long getMillis(int value)
public long getMillis(long value)
public long getMillis(int value, long instant)
public long getMillis(long value, long instant)
public long add(long instant, int value)
public long add(long instant, long value)
public int getDifference(long minuendInstant, long subtrahendInstant)
public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant)
public int compareTo(DurationField otherField)
public boolean equals(Object obj)
public int hashCode()
public String toString()
private Object readResolve()
long serialVersionUID=Optional[2656707858124633367L]
DurationField INSTANCE=Optional[new MillisDurationField()]
