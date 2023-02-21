public DividedDateTimeField(DateTimeField field, DateTimeFieldType type, int divisor) { [EOL]     this(field, field.getRangeDurationField(), type, divisor); [EOL] } <line_num>: 56,59
public DividedDateTimeField(DateTimeField field, DurationField rangeField, DateTimeFieldType type, int divisor) { [EOL]     super(field, type); [EOL]     if (divisor < 2) { [EOL]         throw new IllegalArgumentException("The divisor must be at least 2"); [EOL]     } [EOL]     DurationField unitField = field.getDurationField(); [EOL]     if (unitField == null) { [EOL]         iDurationField = null; [EOL]     } else { [EOL]         iDurationField = new ScaledDurationField(unitField, type.getDurationType(), divisor); [EOL]     } [EOL]     iRangeDurationField = rangeField; [EOL]     iDivisor = divisor; [EOL]     int i = field.getMinimumValue(); [EOL]     int min = (i >= 0) ? i / divisor : ((i + 1) / divisor - 1); [EOL]     int j = field.getMaximumValue(); [EOL]     int max = (j >= 0) ? j / divisor : ((j + 1) / divisor - 1); [EOL]     iMin = min; [EOL]     iMax = max; [EOL] } <line_num>: 70,91
public DividedDateTimeField(RemainderDateTimeField remainderField, DateTimeFieldType type) { [EOL]     this(remainderField, null, type); [EOL] } <line_num>: 100,102
public DividedDateTimeField(RemainderDateTimeField remainderField, DurationField rangeField, DateTimeFieldType type) { [EOL]     super(remainderField.getWrappedField(), type); [EOL]     int divisor = iDivisor = remainderField.iDivisor; [EOL]     iDurationField = remainderField.iRangeField; [EOL]     iRangeDurationField = rangeField; [EOL]     DateTimeField field = getWrappedField(); [EOL]     int i = field.getMinimumValue(); [EOL]     int min = (i >= 0) ? i / divisor : ((i + 1) / divisor - 1); [EOL]     int j = field.getMaximumValue(); [EOL]     int max = (j >= 0) ? j / divisor : ((j + 1) / divisor - 1); [EOL]     iMin = min; [EOL]     iMax = max; [EOL] } <line_num>: 112,124
@Override [EOL] public DurationField getRangeDurationField() { [EOL]     if (iRangeDurationField != null) { [EOL]         return iRangeDurationField; [EOL]     } [EOL]     return super.getRangeDurationField(); [EOL] } <line_num>: 126,132
public int get(long instant) { [EOL]     int value = getWrappedField().get(instant); [EOL]     if (value >= 0) { [EOL]         return value / iDivisor; [EOL]     } else { [EOL]         return ((value + 1) / iDivisor) - 1; [EOL]     } [EOL] } <line_num>: 140,147
public long add(long instant, int amount) { [EOL]     return getWrappedField().add(instant, amount * iDivisor); [EOL] } <line_num>: 157,159
public long add(long instant, long amount) { [EOL]     return getWrappedField().add(instant, amount * iDivisor); [EOL] } <line_num>: 169,171
public long addWrapField(long instant, int amount) { [EOL]     return set(instant, FieldUtils.getWrappedValue(get(instant), amount, iMin, iMax)); [EOL] } <line_num>: 181,183
public int getDifference(long minuendInstant, long subtrahendInstant) { [EOL]     return getWrappedField().getDifference(minuendInstant, subtrahendInstant) / iDivisor; [EOL] } <line_num>: 185,187
public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) { [EOL]     return getWrappedField().getDifferenceAsLong(minuendInstant, subtrahendInstant) / iDivisor; [EOL] } <line_num>: 189,191
public long set(long instant, int value) { [EOL]     FieldUtils.verifyValueBounds(this, value, iMin, iMax); [EOL]     int remainder = getRemainder(getWrappedField().get(instant)); [EOL]     return getWrappedField().set(instant, value * iDivisor + remainder); [EOL] } <line_num>: 201,205
public DurationField getDurationField() { [EOL]     return iDurationField; [EOL] } <line_num>: 210,212
public int getMinimumValue() { [EOL]     return iMin; [EOL] } <line_num>: 219,221
public int getMaximumValue() { [EOL]     return iMax; [EOL] } <line_num>: 228,230
public long roundFloor(long instant) { [EOL]     DateTimeField field = getWrappedField(); [EOL]     return field.roundFloor(field.set(instant, get(instant) * iDivisor)); [EOL] } <line_num>: 232,235
public long remainder(long instant) { [EOL]     return set(instant, get(getWrappedField().remainder(instant))); [EOL] } <line_num>: 237,239
public int getDivisor() { [EOL]     return iDivisor; [EOL] } <line_num>: 246,248
private int getRemainder(int value) { [EOL]     if (value >= 0) { [EOL]         return value % iDivisor; [EOL]     } else { [EOL]         return (iDivisor - 1) + ((value + 1) % iDivisor); [EOL]     } [EOL] } <line_num>: 250,256