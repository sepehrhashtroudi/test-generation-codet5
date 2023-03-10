private UnsupportedDateTimeField(DateTimeFieldType type, DurationField durationField)
public static synchronized UnsupportedDateTimeField getInstance(DateTimeFieldType type, DurationField durationField)
public DateTimeFieldType getType()
public String getName()
public boolean isSupported()
public boolean isLenient()
public int get(long instant)
public String getAsText(long instant, Locale locale)
public String getAsText(long instant)
public String getAsText(ReadablePartial partial, int fieldValue, Locale locale)
public String getAsText(ReadablePartial partial, Locale locale)
public String getAsText(int fieldValue, Locale locale)
public String getAsShortText(long instant, Locale locale)
public String getAsShortText(long instant)
public String getAsShortText(ReadablePartial partial, int fieldValue, Locale locale)
public String getAsShortText(ReadablePartial partial, Locale locale)
public String getAsShortText(int fieldValue, Locale locale)
public long add(long instant, int value)
public long add(long instant, long value)
public int[] add(ReadablePartial instant, int fieldIndex, int[] values, int valueToAdd)
public int[] addWrapPartial(ReadablePartial instant, int fieldIndex, int[] values, int valueToAdd)
public long addWrapField(long instant, int value)
public int[] addWrapField(ReadablePartial instant, int fieldIndex, int[] values, int valueToAdd)
public int getDifference(long minuendInstant, long subtrahendInstant)
public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant)
public long set(long instant, int value)
public int[] set(ReadablePartial instant, int fieldIndex, int[] values, int newValue)
public long set(long instant, String text, Locale locale)
public long set(long instant, String text)
public int[] set(ReadablePartial instant, int fieldIndex, int[] values, String text, Locale locale)
public DurationField getDurationField()
public DurationField getRangeDurationField()
public boolean isLeap(long instant)
public int getLeapAmount(long instant)
public DurationField getLeapDurationField()
public int getMinimumValue()
public int getMinimumValue(long instant)
public int getMinimumValue(ReadablePartial instant)
public int getMinimumValue(ReadablePartial instant, int[] values)
public int getMaximumValue()
public int getMaximumValue(long instant)
public int getMaximumValue(ReadablePartial instant)
public int getMaximumValue(ReadablePartial instant, int[] values)
public int getMaximumTextLength(Locale locale)
public int getMaximumShortTextLength(Locale locale)
public long roundFloor(long instant)
public long roundCeiling(long instant)
public long roundHalfFloor(long instant)
public long roundHalfCeiling(long instant)
public long roundHalfEven(long instant)
public long remainder(long instant)
public String toString()
private Object readResolve()
private UnsupportedOperationException unsupported()
long serialVersionUID=Optional[-1934618396111902255L]
HashMap<DateTimeFieldType, UnsupportedDateTimeField> cCache
DateTimeFieldType iType
DurationField iDurationField
