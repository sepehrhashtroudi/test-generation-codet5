public AbstractReadableInstantFieldProperty()
public abstract DateTimeField getField()
public DateTimeFieldType getFieldType()
public String getName()
protected abstract long getMillis()
protected Chronology getChronology()
public int get()
public String getAsString()
public String getAsText()
public String getAsText(Locale locale)
public String getAsShortText()
public String getAsShortText(Locale locale)
public int getDifference(ReadableInstant instant)
public long getDifferenceAsLong(ReadableInstant instant)
public DurationField getDurationField()
public DurationField getRangeDurationField()
public boolean isLeap()
public int getLeapAmount()
public DurationField getLeapDurationField()
public int getMinimumValueOverall()
public int getMinimumValue()
public int getMaximumValueOverall()
public int getMaximumValue()
public int getMaximumTextLength(Locale locale)
public int getMaximumShortTextLength(Locale locale)
public long remainder()
public Interval toInterval()
public int compareTo(ReadableInstant instant)
public int compareTo(ReadablePartial partial)
public boolean equals(Object object)
public int hashCode()
public String toString()
