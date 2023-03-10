public abstract DateTimeFieldType getType()
public abstract String getName()
public abstract boolean isSupported()
public abstract boolean isLenient()
public abstract int get(long instant)
public abstract String getAsText(long instant, Locale locale)
public abstract String getAsText(long instant)
public abstract String getAsText(ReadablePartial partial, int fieldValue, Locale locale)
public abstract String getAsText(ReadablePartial partial, Locale locale)
public abstract String getAsText(int fieldValue, Locale locale)
public abstract String getAsShortText(long instant, Locale locale)
public abstract String getAsShortText(long instant)
public abstract String getAsShortText(ReadablePartial partial, int fieldValue, Locale locale)
public abstract String getAsShortText(ReadablePartial partial, Locale locale)
public abstract String getAsShortText(int fieldValue, Locale locale)
public abstract long add(long instant, int value)
public abstract long add(long instant, long value)
public abstract int[] add(ReadablePartial instant, int fieldIndex, int[] values, int valueToAdd)
public abstract int[] addWrapPartial(ReadablePartial instant, int fieldIndex, int[] values, int valueToAdd)
public abstract long addWrapField(long instant, int value)
public abstract int[] addWrapField(ReadablePartial instant, int fieldIndex, int[] values, int valueToAdd)
public abstract int getDifference(long minuendInstant, long subtrahendInstant)
public abstract long getDifferenceAsLong(long minuendInstant, long subtrahendInstant)
public abstract long set(long instant, int value)
public abstract int[] set(ReadablePartial instant, int fieldIndex, int[] values, int newValue)
public abstract long set(long instant, String text, Locale locale)
public abstract long set(long instant, String text)
public abstract int[] set(ReadablePartial instant, int fieldIndex, int[] values, String text, Locale locale)
public abstract DurationField getDurationField()
public abstract DurationField getRangeDurationField()
public abstract boolean isLeap(long instant)
public abstract int getLeapAmount(long instant)
public abstract DurationField getLeapDurationField()
public abstract int getMinimumValue()
public abstract int getMinimumValue(long instant)
public abstract int getMinimumValue(ReadablePartial instant)
public abstract int getMinimumValue(ReadablePartial instant, int[] values)
public abstract int getMaximumValue()
public abstract int getMaximumValue(long instant)
public abstract int getMaximumValue(ReadablePartial instant)
public abstract int getMaximumValue(ReadablePartial instant, int[] values)
public abstract int getMaximumTextLength(Locale locale)
public abstract int getMaximumShortTextLength(Locale locale)
public abstract long roundFloor(long instant)
public abstract long roundCeiling(long instant)
public abstract long roundHalfFloor(long instant)
public abstract long roundHalfCeiling(long instant)
public abstract long roundHalfEven(long instant)
public abstract long remainder(long instant)
public abstract String toString()
