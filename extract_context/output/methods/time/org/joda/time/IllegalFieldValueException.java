public IllegalFieldValueException(DateTimeFieldType fieldType, Number value, Number lowerBound, Number upperBound) { [EOL]     super(createMessage(fieldType.getName(), value, lowerBound, upperBound, null)); [EOL]     iDateTimeFieldType = fieldType; [EOL]     iDurationFieldType = null; [EOL]     iFieldName = fieldType.getName(); [EOL]     iNumberValue = value; [EOL]     iStringValue = null; [EOL]     iLowerBound = lowerBound; [EOL]     iUpperBound = upperBound; [EOL]     iMessage = super.getMessage(); [EOL] } <line_num>: 106,117
public IllegalFieldValueException(DateTimeFieldType fieldType, Number value, String explain) { [EOL]     super(createMessage(fieldType.getName(), value, null, null, explain)); [EOL]     iDateTimeFieldType = fieldType; [EOL]     iDurationFieldType = null; [EOL]     iFieldName = fieldType.getName(); [EOL]     iNumberValue = value; [EOL]     iStringValue = null; [EOL]     iLowerBound = null; [EOL]     iUpperBound = null; [EOL]     iMessage = super.getMessage(); [EOL] } <line_num>: 127,138
public IllegalFieldValueException(DurationFieldType fieldType, Number value, Number lowerBound, Number upperBound) { [EOL]     super(createMessage(fieldType.getName(), value, lowerBound, upperBound, null)); [EOL]     iDateTimeFieldType = null; [EOL]     iDurationFieldType = fieldType; [EOL]     iFieldName = fieldType.getName(); [EOL]     iNumberValue = value; [EOL]     iStringValue = null; [EOL]     iLowerBound = lowerBound; [EOL]     iUpperBound = upperBound; [EOL]     iMessage = super.getMessage(); [EOL] } <line_num>: 148,159
public IllegalFieldValueException(String fieldName, Number value, Number lowerBound, Number upperBound) { [EOL]     super(createMessage(fieldName, value, lowerBound, upperBound, null)); [EOL]     iDateTimeFieldType = null; [EOL]     iDurationFieldType = null; [EOL]     iFieldName = fieldName; [EOL]     iNumberValue = value; [EOL]     iStringValue = null; [EOL]     iLowerBound = lowerBound; [EOL]     iUpperBound = upperBound; [EOL]     iMessage = super.getMessage(); [EOL] } <line_num>: 169,180
public IllegalFieldValueException(DateTimeFieldType fieldType, String value) { [EOL]     super(createMessage(fieldType.getName(), value)); [EOL]     iDateTimeFieldType = fieldType; [EOL]     iDurationFieldType = null; [EOL]     iFieldName = fieldType.getName(); [EOL]     iStringValue = value; [EOL]     iNumberValue = null; [EOL]     iLowerBound = null; [EOL]     iUpperBound = null; [EOL]     iMessage = super.getMessage(); [EOL] } <line_num>: 188,198
public IllegalFieldValueException(DurationFieldType fieldType, String value) { [EOL]     super(createMessage(fieldType.getName(), value)); [EOL]     iDateTimeFieldType = null; [EOL]     iDurationFieldType = fieldType; [EOL]     iFieldName = fieldType.getName(); [EOL]     iStringValue = value; [EOL]     iNumberValue = null; [EOL]     iLowerBound = null; [EOL]     iUpperBound = null; [EOL]     iMessage = super.getMessage(); [EOL] } <line_num>: 206,216
public IllegalFieldValueException(String fieldName, String value) { [EOL]     super(createMessage(fieldName, value)); [EOL]     iDateTimeFieldType = null; [EOL]     iDurationFieldType = null; [EOL]     iFieldName = fieldName; [EOL]     iStringValue = value; [EOL]     iNumberValue = null; [EOL]     iLowerBound = null; [EOL]     iUpperBound = null; [EOL]     iMessage = super.getMessage(); [EOL] } <line_num>: 224,234
private static String createMessage(String fieldName, Number value, Number lowerBound, Number upperBound, String explain) { [EOL]     StringBuilder buf = new StringBuilder().append("Value ").append(value).append(" for ").append(fieldName).append(' '); [EOL]     if (lowerBound == null) { [EOL]         if (upperBound == null) { [EOL]             buf.append("is not supported"); [EOL]         } else { [EOL]             buf.append("must not be larger than ").append(upperBound); [EOL]         } [EOL]     } else if (upperBound == null) { [EOL]         buf.append("must not be smaller than ").append(lowerBound); [EOL]     } else { [EOL]         buf.append("must be in the range [").append(lowerBound).append(',').append(upperBound).append(']'); [EOL]     } [EOL]     if (explain != null) { [EOL]         buf.append(": ").append(explain); [EOL]     } [EOL]     return buf.toString(); [EOL] } <line_num>: 39,64
private static String createMessage(String fieldName, String value) { [EOL]     StringBuffer buf = new StringBuffer().append("Value "); [EOL]     if (value == null) { [EOL]         buf.append("null"); [EOL]     } else { [EOL]         buf.append('"'); [EOL]         buf.append(value); [EOL]         buf.append('"'); [EOL]     } [EOL]     buf.append(" for ").append(fieldName).append(' ').append("is not supported"); [EOL]     return buf.toString(); [EOL] } <line_num>: 73,87
public DateTimeFieldType getDateTimeFieldType() { [EOL]     return iDateTimeFieldType; [EOL] } <line_num>: 242,244
public DurationFieldType getDurationFieldType() { [EOL]     return iDurationFieldType; [EOL] } <line_num>: 251,253
public String getFieldName() { [EOL]     return iFieldName; [EOL] } <line_num>: 260,262
public Number getIllegalNumberValue() { [EOL]     return iNumberValue; [EOL] } <line_num>: 269,271
public String getIllegalStringValue() { [EOL]     return iStringValue; [EOL] } <line_num>: 278,280
public String getIllegalValueAsString() { [EOL]     String value = iStringValue; [EOL]     if (value == null) { [EOL]         value = String.valueOf(iNumberValue); [EOL]     } [EOL]     return value; [EOL] } <line_num>: 287,293
public Number getLowerBound() { [EOL]     return iLowerBound; [EOL] } <line_num>: 300,302
public Number getUpperBound() { [EOL]     return iUpperBound; [EOL] } <line_num>: 309,311
public String getMessage() { [EOL]     return iMessage; [EOL] } <line_num>: 313,315
public void prependMessage(String message) { [EOL]     if (iMessage == null) { [EOL]         iMessage = message; [EOL]     } else if (message != null) { [EOL]         iMessage = message + ": " + iMessage; [EOL]     } [EOL] } <line_num>: 322,328