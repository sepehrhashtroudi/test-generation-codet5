protected AbstractPartial() { [EOL]     super(); [EOL] } <line_num>: 53,55
protected abstract DateTimeField getField(int index, Chronology chrono); <line_num>: 68,68
public DateTimeFieldType getFieldType(int index) { [EOL]     return getField(index, getChronology()).getType(); [EOL] } <line_num>: 78,80
public DateTimeFieldType[] getFieldTypes() { [EOL]     DateTimeFieldType[] result = new DateTimeFieldType[size()]; [EOL]     for (int i = 0; i < result.length; i++) { [EOL]         result[i] = getFieldType(i); [EOL]     } [EOL]     return result; [EOL] } <line_num>: 89,95
public DateTimeField getField(int index) { [EOL]     return getField(index, getChronology()); [EOL] } <line_num>: 104,106
public DateTimeField[] getFields() { [EOL]     DateTimeField[] result = new DateTimeField[size()]; [EOL]     for (int i = 0; i < result.length; i++) { [EOL]         result[i] = getField(i); [EOL]     } [EOL]     return result; [EOL] } <line_num>: 115,121
public int[] getValues() { [EOL]     int[] result = new int[size()]; [EOL]     for (int i = 0; i < result.length; i++) { [EOL]         result[i] = getValue(i); [EOL]     } [EOL]     return result; [EOL] } <line_num>: 131,137
public int get(DateTimeFieldType type) { [EOL]     return getValue(indexOfSupported(type)); [EOL] } <line_num>: 149,151
public boolean isSupported(DateTimeFieldType type) { [EOL]     return (indexOf(type) != -1); [EOL] } <line_num>: 159,161
public int indexOf(DateTimeFieldType type) { [EOL]     for (int i = 0, isize = size(); i < isize; i++) { [EOL]         if (getFieldType(i) == type) { [EOL]             return i; [EOL]         } [EOL]     } [EOL]     return -1; [EOL] } <line_num>: 169,176
protected int indexOfSupported(DateTimeFieldType type) { [EOL]     int index = indexOf(type); [EOL]     if (index == -1) { [EOL]         throw new IllegalArgumentException("Field '" + type + "' is not supported"); [EOL]     } [EOL]     return index; [EOL] } <line_num>: 186,192
protected int indexOf(DurationFieldType type) { [EOL]     for (int i = 0, isize = size(); i < isize; i++) { [EOL]         if (getFieldType(i).getDurationType() == type) { [EOL]             return i; [EOL]         } [EOL]     } [EOL]     return -1; [EOL] } <line_num>: 201,208
protected int indexOfSupported(DurationFieldType type) { [EOL]     int index = indexOf(type); [EOL]     if (index == -1) { [EOL]         throw new IllegalArgumentException("Field '" + type + "' is not supported"); [EOL]     } [EOL]     return index; [EOL] } <line_num>: 218,224
public DateTime toDateTime(ReadableInstant baseInstant) { [EOL]     Chronology chrono = DateTimeUtils.getInstantChronology(baseInstant); [EOL]     long instantMillis = DateTimeUtils.getInstantMillis(baseInstant); [EOL]     long resolved = chrono.set(this, instantMillis); [EOL]     return new DateTime(resolved, chrono); [EOL] } <line_num>: 239,244
public boolean equals(Object partial) { [EOL]     if (this == partial) { [EOL]         return true; [EOL]     } [EOL]     if (partial instanceof ReadablePartial == false) { [EOL]         return false; [EOL]     } [EOL]     ReadablePartial other = (ReadablePartial) partial; [EOL]     if (size() != other.size()) { [EOL]         return false; [EOL]     } [EOL]     for (int i = 0, isize = size(); i < isize; i++) { [EOL]         if (getValue(i) != other.getValue(i) || getFieldType(i) != other.getFieldType(i)) { [EOL]             return false; [EOL]         } [EOL]     } [EOL]     return FieldUtils.equals(getChronology(), other.getChronology()); [EOL] } <line_num>: 254,271
public int hashCode() { [EOL]     int total = 157; [EOL]     for (int i = 0, isize = size(); i < isize; i++) { [EOL]         total = 23 * total + getValue(i); [EOL]         total = 23 * total + getFieldType(i).hashCode(); [EOL]     } [EOL]     total += getChronology().hashCode(); [EOL]     return total; [EOL] } <line_num>: 279,287
public int compareTo(ReadablePartial other) { [EOL]     if (this == other) { [EOL]         return 0; [EOL]     } [EOL]     if (size() != other.size()) { [EOL]         throw new ClassCastException("ReadablePartial objects must have matching field types"); [EOL]     } [EOL]     for (int i = 0, isize = size(); i < isize; i++) { [EOL]         if (getFieldType(i) != other.getFieldType(i)) { [EOL]             throw new ClassCastException("ReadablePartial objects must have matching field types"); [EOL]         } [EOL]     } [EOL]     for (int i = 0, isize = size(); i < isize; i++) { [EOL]         if (getValue(i) > other.getValue(i)) { [EOL]             return 1; [EOL]         } [EOL]         if (getValue(i) < other.getValue(i)) { [EOL]             return -1; [EOL]         } [EOL]     } [EOL]     return 0; [EOL] } <line_num>: 310,332
public boolean isAfter(ReadablePartial partial) { [EOL]     if (partial == null) { [EOL]         throw new IllegalArgumentException("Partial cannot be null"); [EOL]     } [EOL]     return compareTo(partial) > 0; [EOL] } <line_num>: 349,354
public boolean isBefore(ReadablePartial partial) { [EOL]     if (partial == null) { [EOL]         throw new IllegalArgumentException("Partial cannot be null"); [EOL]     } [EOL]     return compareTo(partial) < 0; [EOL] } <line_num>: 371,376
public boolean isEqual(ReadablePartial partial) { [EOL]     if (partial == null) { [EOL]         throw new IllegalArgumentException("Partial cannot be null"); [EOL]     } [EOL]     return compareTo(partial) == 0; [EOL] } <line_num>: 393,398
public String toString(DateTimeFormatter formatter) { [EOL]     if (formatter == null) { [EOL]         return toString(); [EOL]     } [EOL]     return formatter.print(this); [EOL] } <line_num>: 408,413
