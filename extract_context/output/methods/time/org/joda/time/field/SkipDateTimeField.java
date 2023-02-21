public SkipDateTimeField(Chronology chronology, DateTimeField field) { [EOL]     this(chronology, field, 0); [EOL] } <line_num>: 53,55
public SkipDateTimeField(Chronology chronology, DateTimeField field, int skip) { [EOL]     super(field); [EOL]     iChronology = chronology; [EOL]     int min = super.getMinimumValue(); [EOL]     if (min < skip) { [EOL]         iMinValue = min - 1; [EOL]     } else if (min == skip) { [EOL]         iMinValue = skip + 1; [EOL]     } else { [EOL]         iMinValue = min; [EOL]     } [EOL]     iSkip = skip; [EOL] } <line_num>: 64,76
public int get(long millis) { [EOL]     int value = super.get(millis); [EOL]     if (value <= iSkip) { [EOL]         value--; [EOL]     } [EOL]     return value; [EOL] } <line_num>: 79,85
public long set(long millis, int value) { [EOL]     FieldUtils.verifyValueBounds(this, value, iMinValue, getMaximumValue()); [EOL]     if (value <= iSkip) { [EOL]         if (value == iSkip) { [EOL]             throw new IllegalFieldValueException(DateTimeFieldType.year(), Integer.valueOf(value), null, null); [EOL]         } [EOL]         value++; [EOL]     } [EOL]     return super.set(millis, value); [EOL] } <line_num>: 87,97
public int getMinimumValue() { [EOL]     return iMinValue; [EOL] } <line_num>: 99,101
private Object readResolve() { [EOL]     return getType().getField(iChronology); [EOL] } <line_num>: 103,105