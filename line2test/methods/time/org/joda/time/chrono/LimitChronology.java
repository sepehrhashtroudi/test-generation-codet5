private LimitChronology(Chronology base, DateTime lowerLimit, DateTime upperLimit) { [EOL]     super(base, null); [EOL]     iLowerLimit = lowerLimit; [EOL]     iUpperLimit = upperLimit; [EOL] } <line_num>: 97,103
LimitException(String desc, boolean isLow) { [EOL]     super(desc); [EOL]     iIsLow = isLow; [EOL] } <line_num>: 351,354
LimitDurationField(DurationField field) { [EOL]     super(field, field.getType()); [EOL] } <line_num>: 391,393
LimitDateTimeField(DateTimeField field, DurationField durationField, DurationField rangeDurationField, DurationField leapDurationField) { [EOL]     super(field, field.getType()); [EOL]     iDurationField = durationField; [EOL]     iRangeDurationField = rangeDurationField; [EOL]     iLeapDurationField = leapDurationField; [EOL] } <line_num>: 451,459
public static LimitChronology getInstance(Chronology base, ReadableDateTime lowerLimit, ReadableDateTime upperLimit) { [EOL]     if (base == null) { [EOL]         throw new IllegalArgumentException("Must supply a chronology"); [EOL]     } [EOL]     lowerLimit = lowerLimit == null ? null : lowerLimit.toDateTime(); [EOL]     upperLimit = upperLimit == null ? null : upperLimit.toDateTime(); [EOL]     if (lowerLimit != null && upperLimit != null) { [EOL]         if (!lowerLimit.isBefore(upperLimit)) { [EOL]             throw new IllegalArgumentException("The lower limit must be come before than the upper limit"); [EOL]         } [EOL]     } [EOL]     return new LimitChronology(base, (DateTime) lowerLimit, (DateTime) upperLimit); [EOL] } <line_num>: 64,82
public DateTime getLowerLimit() { [EOL]     return iLowerLimit; [EOL] } <line_num>: 110,112
public DateTime getUpperLimit() { [EOL]     return iUpperLimit; [EOL] } <line_num>: 119,121
public Chronology withUTC() { [EOL]     return withZone(DateTimeZone.UTC); [EOL] } <line_num>: 128,130
public Chronology withZone(DateTimeZone zone) { [EOL]     if (zone == null) { [EOL]         zone = DateTimeZone.getDefault(); [EOL]     } [EOL]     if (zone == getZone()) { [EOL]         return this; [EOL]     } [EOL]     if (zone == DateTimeZone.UTC && iWithUTC != null) { [EOL]         return iWithUTC; [EOL]     } [EOL]     DateTime lowerLimit = iLowerLimit; [EOL]     if (lowerLimit != null) { [EOL]         MutableDateTime mdt = lowerLimit.toMutableDateTime(); [EOL]         mdt.setZoneRetainFields(zone); [EOL]         lowerLimit = mdt.toDateTime(); [EOL]     } [EOL]     DateTime upperLimit = iUpperLimit; [EOL]     if (upperLimit != null) { [EOL]         MutableDateTime mdt = upperLimit.toMutableDateTime(); [EOL]         mdt.setZoneRetainFields(zone); [EOL]         upperLimit = mdt.toDateTime(); [EOL]     } [EOL]     LimitChronology chrono = getInstance(getBase().withZone(zone), lowerLimit, upperLimit); [EOL]     if (zone == DateTimeZone.UTC) { [EOL]         iWithUTC = chrono; [EOL]     } [EOL]     return chrono; [EOL] } <line_num>: 137,171
public long getDateTimeMillis(int year, int monthOfYear, int dayOfMonth, int millisOfDay) throws IllegalArgumentException { [EOL]     long instant = getBase().getDateTimeMillis(year, monthOfYear, dayOfMonth, millisOfDay); [EOL]     checkLimits(instant, "resulting"); [EOL]     return instant; [EOL] } <line_num>: 173,180
public long getDateTimeMillis(int year, int monthOfYear, int dayOfMonth, int hourOfDay, int minuteOfHour, int secondOfMinute, int millisOfSecond) throws IllegalArgumentException { [EOL]     long instant = getBase().getDateTimeMillis(year, monthOfYear, dayOfMonth, hourOfDay, minuteOfHour, secondOfMinute, millisOfSecond); [EOL]     checkLimits(instant, "resulting"); [EOL]     return instant; [EOL] } <line_num>: 182,192
public long getDateTimeMillis(long instant, int hourOfDay, int minuteOfHour, int secondOfMinute, int millisOfSecond) throws IllegalArgumentException { [EOL]     checkLimits(instant, null); [EOL]     instant = getBase().getDateTimeMillis(instant, hourOfDay, minuteOfHour, secondOfMinute, millisOfSecond); [EOL]     checkLimits(instant, "resulting"); [EOL]     return instant; [EOL] } <line_num>: 194,204
protected void assemble(Fields fields) { [EOL]     HashMap<Object, Object> converted = new HashMap<Object, Object>(); [EOL]     fields.eras = convertField(fields.eras, converted); [EOL]     fields.centuries = convertField(fields.centuries, converted); [EOL]     fields.years = convertField(fields.years, converted); [EOL]     fields.months = convertField(fields.months, converted); [EOL]     fields.weekyears = convertField(fields.weekyears, converted); [EOL]     fields.weeks = convertField(fields.weeks, converted); [EOL]     fields.days = convertField(fields.days, converted); [EOL]     fields.halfdays = convertField(fields.halfdays, converted); [EOL]     fields.hours = convertField(fields.hours, converted); [EOL]     fields.minutes = convertField(fields.minutes, converted); [EOL]     fields.seconds = convertField(fields.seconds, converted); [EOL]     fields.millis = convertField(fields.millis, converted); [EOL]     fields.year = convertField(fields.year, converted); [EOL]     fields.yearOfEra = convertField(fields.yearOfEra, converted); [EOL]     fields.yearOfCentury = convertField(fields.yearOfCentury, converted); [EOL]     fields.centuryOfEra = convertField(fields.centuryOfEra, converted); [EOL]     fields.era = convertField(fields.era, converted); [EOL]     fields.dayOfWeek = convertField(fields.dayOfWeek, converted); [EOL]     fields.dayOfMonth = convertField(fields.dayOfMonth, converted); [EOL]     fields.dayOfYear = convertField(fields.dayOfYear, converted); [EOL]     fields.monthOfYear = convertField(fields.monthOfYear, converted); [EOL]     fields.weekOfWeekyear = convertField(fields.weekOfWeekyear, converted); [EOL]     fields.weekyear = convertField(fields.weekyear, converted); [EOL]     fields.weekyearOfCentury = convertField(fields.weekyearOfCentury, converted); [EOL]     fields.millisOfSecond = convertField(fields.millisOfSecond, converted); [EOL]     fields.millisOfDay = convertField(fields.millisOfDay, converted); [EOL]     fields.secondOfMinute = convertField(fields.secondOfMinute, converted); [EOL]     fields.secondOfDay = convertField(fields.secondOfDay, converted); [EOL]     fields.minuteOfHour = convertField(fields.minuteOfHour, converted); [EOL]     fields.minuteOfDay = convertField(fields.minuteOfDay, converted); [EOL]     fields.hourOfDay = convertField(fields.hourOfDay, converted); [EOL]     fields.hourOfHalfday = convertField(fields.hourOfHalfday, converted); [EOL]     fields.clockhourOfDay = convertField(fields.clockhourOfDay, converted); [EOL]     fields.clockhourOfHalfday = convertField(fields.clockhourOfHalfday, converted); [EOL]     fields.halfdayOfDay = convertField(fields.halfdayOfDay, converted); [EOL] } <line_num>: 206,253
private DurationField convertField(DurationField field, HashMap<Object, Object> converted) { [EOL]     if (field == null || !field.isSupported()) { [EOL]         return field; [EOL]     } [EOL]     if (converted.containsKey(field)) { [EOL]         return (DurationField) converted.get(field); [EOL]     } [EOL]     LimitDurationField limitField = new LimitDurationField(field); [EOL]     converted.put(field, limitField); [EOL]     return limitField; [EOL] } <line_num>: 255,265
private DateTimeField convertField(DateTimeField field, HashMap<Object, Object> converted) { [EOL]     if (field == null || !field.isSupported()) { [EOL]         return field; [EOL]     } [EOL]     if (converted.containsKey(field)) { [EOL]         return (DateTimeField) converted.get(field); [EOL]     } [EOL]     LimitDateTimeField limitField = new LimitDateTimeField(field, convertField(field.getDurationField(), converted), convertField(field.getRangeDurationField(), converted), convertField(field.getLeapDurationField(), converted)); [EOL]     converted.put(field, limitField); [EOL]     return limitField; [EOL] } <line_num>: 267,281
void checkLimits(long instant, String desc) { [EOL]     DateTime limit; [EOL]     if ((limit = iLowerLimit) != null && instant < limit.getMillis()) { [EOL]         throw new LimitException(desc, true); [EOL]     } [EOL]     if ((limit = iUpperLimit) != null && instant >= limit.getMillis()) { [EOL]         throw new LimitException(desc, false); [EOL]     } [EOL] } <line_num>: 283,291
public boolean equals(Object obj) { [EOL]     if (this == obj) { [EOL]         return true; [EOL]     } [EOL]     if (obj instanceof LimitChronology == false) { [EOL]         return false; [EOL]     } [EOL]     LimitChronology chrono = (LimitChronology) obj; [EOL]     return getBase().equals(chrono.getBase()) && FieldUtils.equals(getLowerLimit(), chrono.getLowerLimit()) && FieldUtils.equals(getUpperLimit(), chrono.getUpperLimit()); [EOL] } <line_num>: 302,314
public int hashCode() { [EOL]     int hash = 317351877; [EOL]     hash += (getLowerLimit() != null ? getLowerLimit().hashCode() : 0); [EOL]     hash += (getUpperLimit() != null ? getUpperLimit().hashCode() : 0); [EOL]     hash += getBase().hashCode() * 7; [EOL]     return hash; [EOL] } <line_num>: 322,328
public String toString() { [EOL]     return "LimitChronology[" + getBase().toString() + ", " + (getLowerLimit() == null ? "NoLimit" : getLowerLimit().toString()) + ", " + (getUpperLimit() == null ? "NoLimit" : getUpperLimit().toString()) + ']'; [EOL] } <line_num>: 335,339
public String getMessage() { [EOL]     StringBuffer buf = new StringBuffer(85); [EOL]     buf.append("The"); [EOL]     String desc = super.getMessage(); [EOL]     if (desc != null) { [EOL]         buf.append(' '); [EOL]         buf.append(desc); [EOL]     } [EOL]     buf.append(" instant is "); [EOL]     DateTimeFormatter p = ISODateTimeFormat.dateTime(); [EOL]     p = p.withChronology(getBase()); [EOL]     if (iIsLow) { [EOL]         buf.append("below the supported minimum of "); [EOL]         p.printTo(buf, getLowerLimit().getMillis()); [EOL]     } else { [EOL]         buf.append("above the supported maximum of "); [EOL]         p.printTo(buf, getUpperLimit().getMillis()); [EOL]     } [EOL]     buf.append(" ("); [EOL]     buf.append(getBase()); [EOL]     buf.append(')'); [EOL]     return buf.toString(); [EOL] } <line_num>: 356,381
public String toString() { [EOL]     return "IllegalArgumentException: " + getMessage(); [EOL] } <line_num>: 383,385
public int getValue(long duration, long instant) { [EOL]     checkLimits(instant, null); [EOL]     return getWrappedField().getValue(duration, instant); [EOL] } <line_num>: 395,398
public long getValueAsLong(long duration, long instant) { [EOL]     checkLimits(instant, null); [EOL]     return getWrappedField().getValueAsLong(duration, instant); [EOL] } <line_num>: 400,403
public long getMillis(int value, long instant) { [EOL]     checkLimits(instant, null); [EOL]     return getWrappedField().getMillis(value, instant); [EOL] } <line_num>: 405,408
public long getMillis(long value, long instant) { [EOL]     checkLimits(instant, null); [EOL]     return getWrappedField().getMillis(value, instant); [EOL] } <line_num>: 410,413
public long add(long instant, int amount) { [EOL]     checkLimits(instant, null); [EOL]     long result = getWrappedField().add(instant, amount); [EOL]     checkLimits(result, "resulting"); [EOL]     return result; [EOL] } <line_num>: 415,420
public long add(long instant, long amount) { [EOL]     checkLimits(instant, null); [EOL]     long result = getWrappedField().add(instant, amount); [EOL]     checkLimits(result, "resulting"); [EOL]     return result; [EOL] } <line_num>: 422,427
public int getDifference(long minuendInstant, long subtrahendInstant) { [EOL]     checkLimits(minuendInstant, "minuend"); [EOL]     checkLimits(subtrahendInstant, "subtrahend"); [EOL]     return getWrappedField().getDifference(minuendInstant, subtrahendInstant); [EOL] } <line_num>: 429,433
public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) { [EOL]     checkLimits(minuendInstant, "minuend"); [EOL]     checkLimits(subtrahendInstant, "subtrahend"); [EOL]     return getWrappedField().getDifferenceAsLong(minuendInstant, subtrahendInstant); [EOL] } <line_num>: 435,439
public int get(long instant) { [EOL]     checkLimits(instant, null); [EOL]     return getWrappedField().get(instant); [EOL] } <line_num>: 461,464
public String getAsText(long instant, Locale locale) { [EOL]     checkLimits(instant, null); [EOL]     return getWrappedField().getAsText(instant, locale); [EOL] } <line_num>: 466,469
public String getAsShortText(long instant, Locale locale) { [EOL]     checkLimits(instant, null); [EOL]     return getWrappedField().getAsShortText(instant, locale); [EOL] } <line_num>: 471,474
public long add(long instant, int amount) { [EOL]     checkLimits(instant, null); [EOL]     long result = getWrappedField().add(instant, amount); [EOL]     checkLimits(result, "resulting"); [EOL]     return result; [EOL] } <line_num>: 476,481
public long add(long instant, long amount) { [EOL]     checkLimits(instant, null); [EOL]     long result = getWrappedField().add(instant, amount); [EOL]     checkLimits(result, "resulting"); [EOL]     return result; [EOL] } <line_num>: 483,488
public long addWrapField(long instant, int amount) { [EOL]     checkLimits(instant, null); [EOL]     long result = getWrappedField().addWrapField(instant, amount); [EOL]     checkLimits(result, "resulting"); [EOL]     return result; [EOL] } <line_num>: 490,495
public int getDifference(long minuendInstant, long subtrahendInstant) { [EOL]     checkLimits(minuendInstant, "minuend"); [EOL]     checkLimits(subtrahendInstant, "subtrahend"); [EOL]     return getWrappedField().getDifference(minuendInstant, subtrahendInstant); [EOL] } <line_num>: 497,501
public long getDifferenceAsLong(long minuendInstant, long subtrahendInstant) { [EOL]     checkLimits(minuendInstant, "minuend"); [EOL]     checkLimits(subtrahendInstant, "subtrahend"); [EOL]     return getWrappedField().getDifferenceAsLong(minuendInstant, subtrahendInstant); [EOL] } <line_num>: 503,507
public long set(long instant, int value) { [EOL]     checkLimits(instant, null); [EOL]     long result = getWrappedField().set(instant, value); [EOL]     checkLimits(result, "resulting"); [EOL]     return result; [EOL] } <line_num>: 509,514
public long set(long instant, String text, Locale locale) { [EOL]     checkLimits(instant, null); [EOL]     long result = getWrappedField().set(instant, text, locale); [EOL]     checkLimits(result, "resulting"); [EOL]     return result; [EOL] } <line_num>: 516,521
public final DurationField getDurationField() { [EOL]     return iDurationField; [EOL] } <line_num>: 523,525
public final DurationField getRangeDurationField() { [EOL]     return iRangeDurationField; [EOL] } <line_num>: 527,529
public boolean isLeap(long instant) { [EOL]     checkLimits(instant, null); [EOL]     return getWrappedField().isLeap(instant); [EOL] } <line_num>: 531,534
public int getLeapAmount(long instant) { [EOL]     checkLimits(instant, null); [EOL]     return getWrappedField().getLeapAmount(instant); [EOL] } <line_num>: 536,539
public final DurationField getLeapDurationField() { [EOL]     return iLeapDurationField; [EOL] } <line_num>: 541,543
public long roundFloor(long instant) { [EOL]     checkLimits(instant, null); [EOL]     long result = getWrappedField().roundFloor(instant); [EOL]     checkLimits(result, "resulting"); [EOL]     return result; [EOL] } <line_num>: 545,550
public long roundCeiling(long instant) { [EOL]     checkLimits(instant, null); [EOL]     long result = getWrappedField().roundCeiling(instant); [EOL]     checkLimits(result, "resulting"); [EOL]     return result; [EOL] } <line_num>: 552,557
public long roundHalfFloor(long instant) { [EOL]     checkLimits(instant, null); [EOL]     long result = getWrappedField().roundHalfFloor(instant); [EOL]     checkLimits(result, "resulting"); [EOL]     return result; [EOL] } <line_num>: 559,564
public long roundHalfCeiling(long instant) { [EOL]     checkLimits(instant, null); [EOL]     long result = getWrappedField().roundHalfCeiling(instant); [EOL]     checkLimits(result, "resulting"); [EOL]     return result; [EOL] } <line_num>: 566,571
public long roundHalfEven(long instant) { [EOL]     checkLimits(instant, null); [EOL]     long result = getWrappedField().roundHalfEven(instant); [EOL]     checkLimits(result, "resulting"); [EOL]     return result; [EOL] } <line_num>: 573,578
public long remainder(long instant) { [EOL]     checkLimits(instant, null); [EOL]     long result = getWrappedField().remainder(instant); [EOL]     checkLimits(result, "resulting"); [EOL]     return result; [EOL] } <line_num>: 580,585
public int getMinimumValue(long instant) { [EOL]     checkLimits(instant, null); [EOL]     return getWrappedField().getMinimumValue(instant); [EOL] } <line_num>: 587,590
public int getMaximumValue(long instant) { [EOL]     checkLimits(instant, null); [EOL]     return getWrappedField().getMaximumValue(instant); [EOL] } <line_num>: 592,595
public int getMaximumTextLength(Locale locale) { [EOL]     return getWrappedField().getMaximumTextLength(locale); [EOL] } <line_num>: 597,599
public int getMaximumShortTextLength(Locale locale) { [EOL]     return getWrappedField().getMaximumShortTextLength(locale); [EOL] } <line_num>: 601,603
