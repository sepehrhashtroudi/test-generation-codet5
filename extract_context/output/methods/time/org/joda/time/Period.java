public Period() { [EOL]     super(0L, null, null); [EOL] } <line_num>: 297,299
public Period(int hours, int minutes, int seconds, int millis) { [EOL]     super(0, 0, 0, 0, hours, minutes, seconds, millis, PeriodType.standard()); [EOL] } <line_num>: 311,313
public Period(int years, int months, int weeks, int days, int hours, int minutes, int seconds, int millis) { [EOL]     super(years, months, weeks, days, hours, minutes, seconds, millis, PeriodType.standard()); [EOL] } <line_num>: 327,330
public Period(int years, int months, int weeks, int days, int hours, int minutes, int seconds, int millis, PeriodType type) { [EOL]     super(years, months, weeks, days, hours, minutes, seconds, millis, type); [EOL] } <line_num>: 350,353
public Period(long duration) { [EOL]     super(duration); [EOL] } <line_num>: 381,383
public Period(long duration, PeriodType type) { [EOL]     super(duration, type, null); [EOL] } <line_num>: 401,403
public Period(long duration, Chronology chronology) { [EOL]     super(duration, null, chronology); [EOL] } <line_num>: 422,424
public Period(long duration, PeriodType type, Chronology chronology) { [EOL]     super(duration, type, chronology); [EOL] } <line_num>: 443,445
public Period(long startInstant, long endInstant) { [EOL]     super(startInstant, endInstant, null, null); [EOL] } <line_num>: 454,456
public Period(long startInstant, long endInstant, PeriodType type) { [EOL]     super(startInstant, endInstant, type, null); [EOL] } <line_num>: 465,467
public Period(long startInstant, long endInstant, Chronology chrono) { [EOL]     super(startInstant, endInstant, null, chrono); [EOL] } <line_num>: 477,479
public Period(long startInstant, long endInstant, PeriodType type, Chronology chrono) { [EOL]     super(startInstant, endInstant, type, chrono); [EOL] } <line_num>: 489,491
public Period(ReadableInstant startInstant, ReadableInstant endInstant) { [EOL]     super(startInstant, endInstant, null); [EOL] } <line_num>: 508,510
public Period(ReadableInstant startInstant, ReadableInstant endInstant, PeriodType type) { [EOL]     super(startInstant, endInstant, type); [EOL] } <line_num>: 527,529
public Period(ReadablePartial start, ReadablePartial end) { [EOL]     super(start, end, null); [EOL] } <line_num>: 561,563
public Period(ReadablePartial start, ReadablePartial end, PeriodType type) { [EOL]     super(start, end, type); [EOL] } <line_num>: 595,597
public Period(ReadableInstant startInstant, ReadableDuration duration) { [EOL]     super(startInstant, duration, null); [EOL] } <line_num>: 605,607
public Period(ReadableInstant startInstant, ReadableDuration duration, PeriodType type) { [EOL]     super(startInstant, duration, type); [EOL] } <line_num>: 616,618
public Period(ReadableDuration duration, ReadableInstant endInstant) { [EOL]     super(duration, endInstant, null); [EOL] } <line_num>: 626,628
public Period(ReadableDuration duration, ReadableInstant endInstant, PeriodType type) { [EOL]     super(duration, endInstant, type); [EOL] } <line_num>: 637,639
public Period(Object period) { [EOL]     super(period, null, null); [EOL] } <line_num>: 653,655
public Period(Object period, PeriodType type) { [EOL]     super(period, type, null); [EOL] } <line_num>: 670,672
public Period(Object period, Chronology chrono) { [EOL]     super(period, null, chrono); [EOL] } <line_num>: 687,689
public Period(Object period, PeriodType type, Chronology chrono) { [EOL]     super(period, type, chrono); [EOL] } <line_num>: 705,707
private Period(int[] values, PeriodType type) { [EOL]     super(values, type); [EOL] } <line_num>: 715,717
@FromString [EOL] public static Period parse(String str) { [EOL]     return parse(str, ISOPeriodFormat.standard()); [EOL] } <line_num>: 79,82
public static Period parse(String str, PeriodFormatter formatter) { [EOL]     return formatter.parsePeriod(str); [EOL] } <line_num>: 91,93
public static Period years(int years) { [EOL]     return new Period(new int[] { years, 0, 0, 0, 0, 0, 0, 0, 0 }, PeriodType.standard()); [EOL] } <line_num>: 109,111
public static Period months(int months) { [EOL]     return new Period(new int[] { 0, months, 0, 0, 0, 0, 0, 0 }, PeriodType.standard()); [EOL] } <line_num>: 126,128
public static Period weeks(int weeks) { [EOL]     return new Period(new int[] { 0, 0, weeks, 0, 0, 0, 0, 0 }, PeriodType.standard()); [EOL] } <line_num>: 143,145
public static Period days(int days) { [EOL]     return new Period(new int[] { 0, 0, 0, days, 0, 0, 0, 0 }, PeriodType.standard()); [EOL] } <line_num>: 160,162
public static Period hours(int hours) { [EOL]     return new Period(new int[] { 0, 0, 0, 0, hours, 0, 0, 0 }, PeriodType.standard()); [EOL] } <line_num>: 177,179
public static Period minutes(int minutes) { [EOL]     return new Period(new int[] { 0, 0, 0, 0, 0, minutes, 0, 0 }, PeriodType.standard()); [EOL] } <line_num>: 194,196
public static Period seconds(int seconds) { [EOL]     return new Period(new int[] { 0, 0, 0, 0, 0, 0, seconds, 0 }, PeriodType.standard()); [EOL] } <line_num>: 211,213
public static Period millis(int millis) { [EOL]     return new Period(new int[] { 0, 0, 0, 0, 0, 0, 0, millis }, PeriodType.standard()); [EOL] } <line_num>: 225,227
public static Period fieldDifference(ReadablePartial start, ReadablePartial end) { [EOL]     if (start == null || end == null) { [EOL]         throw new IllegalArgumentException("ReadablePartial objects must not be null"); [EOL]     } [EOL]     if (start.size() != end.size()) { [EOL]         throw new IllegalArgumentException("ReadablePartial objects must have the same set of fields"); [EOL]     } [EOL]     DurationFieldType[] types = new DurationFieldType[start.size()]; [EOL]     int[] values = new int[start.size()]; [EOL]     for (int i = 0, isize = start.size(); i < isize; i++) { [EOL]         if (start.getFieldType(i) != end.getFieldType(i)) { [EOL]             throw new IllegalArgumentException("ReadablePartial objects must have the same set of fields"); [EOL]         } [EOL]         types[i] = start.getFieldType(i).getDurationType(); [EOL]         if (i > 0 && types[i - 1] == types[i]) { [EOL]             throw new IllegalArgumentException("ReadablePartial objects must not have overlapping fields"); [EOL]         } [EOL]         values[i] = end.getValue(i) - start.getValue(i); [EOL]     } [EOL]     return new Period(values, PeriodType.forFields(types)); [EOL] } <line_num>: 256,276
public Period toPeriod() { [EOL]     return this; [EOL] } <line_num>: 726,728
public int getYears() { [EOL]     return getPeriodType().getIndexedField(this, PeriodType.YEAR_INDEX); [EOL] } <line_num>: 736,738
public int getMonths() { [EOL]     return getPeriodType().getIndexedField(this, PeriodType.MONTH_INDEX); [EOL] } <line_num>: 745,747
public int getWeeks() { [EOL]     return getPeriodType().getIndexedField(this, PeriodType.WEEK_INDEX); [EOL] } <line_num>: 754,756
public int getDays() { [EOL]     return getPeriodType().getIndexedField(this, PeriodType.DAY_INDEX); [EOL] } <line_num>: 763,765
public int getHours() { [EOL]     return getPeriodType().getIndexedField(this, PeriodType.HOUR_INDEX); [EOL] } <line_num>: 773,775
public int getMinutes() { [EOL]     return getPeriodType().getIndexedField(this, PeriodType.MINUTE_INDEX); [EOL] } <line_num>: 782,784
public int getSeconds() { [EOL]     return getPeriodType().getIndexedField(this, PeriodType.SECOND_INDEX); [EOL] } <line_num>: 791,793
public int getMillis() { [EOL]     return getPeriodType().getIndexedField(this, PeriodType.MILLI_INDEX); [EOL] } <line_num>: 800,802
public Period withPeriodType(PeriodType type) { [EOL]     type = DateTimeUtils.getPeriodType(type); [EOL]     if (type.equals(getPeriodType())) { [EOL]         return this; [EOL]     } [EOL]     return new Period(this, type); [EOL] } <line_num>: 815,821
public Period withFields(ReadablePeriod period) { [EOL]     if (period == null) { [EOL]         return this; [EOL]     } [EOL]     int[] newValues = getValues(); [EOL]     newValues = super.mergePeriodInto(newValues, period); [EOL]     return new Period(newValues, getPeriodType()); [EOL] } <line_num>: 833,840
public Period withField(DurationFieldType field, int value) { [EOL]     if (field == null) { [EOL]         throw new IllegalArgumentException("Field must not be null"); [EOL]     } [EOL]     int[] newValues = getValues(); [EOL]     super.setFieldInto(newValues, field, value); [EOL]     return new Period(newValues, getPeriodType()); [EOL] } <line_num>: 853,860
public Period withFieldAdded(DurationFieldType field, int value) { [EOL]     if (field == null) { [EOL]         throw new IllegalArgumentException("Field must not be null"); [EOL]     } [EOL]     if (value == 0) { [EOL]         return this; [EOL]     } [EOL]     int[] newValues = getValues(); [EOL]     super.addFieldInto(newValues, field, value); [EOL]     return new Period(newValues, getPeriodType()); [EOL] } <line_num>: 872,882
public Period withYears(int years) { [EOL]     int[] values = getValues(); [EOL]     getPeriodType().setIndexedField(this, PeriodType.YEAR_INDEX, values, years); [EOL]     return new Period(values, getPeriodType()); [EOL] } <line_num>: 894,898
public Period withMonths(int months) { [EOL]     int[] values = getValues(); [EOL]     getPeriodType().setIndexedField(this, PeriodType.MONTH_INDEX, values, months); [EOL]     return new Period(values, getPeriodType()); [EOL] } <line_num>: 909,913
public Period withWeeks(int weeks) { [EOL]     int[] values = getValues(); [EOL]     getPeriodType().setIndexedField(this, PeriodType.WEEK_INDEX, values, weeks); [EOL]     return new Period(values, getPeriodType()); [EOL] } <line_num>: 924,928
public Period withDays(int days) { [EOL]     int[] values = getValues(); [EOL]     getPeriodType().setIndexedField(this, PeriodType.DAY_INDEX, values, days); [EOL]     return new Period(values, getPeriodType()); [EOL] } <line_num>: 939,943
public Period withHours(int hours) { [EOL]     int[] values = getValues(); [EOL]     getPeriodType().setIndexedField(this, PeriodType.HOUR_INDEX, values, hours); [EOL]     return new Period(values, getPeriodType()); [EOL] } <line_num>: 954,958
public Period withMinutes(int minutes) { [EOL]     int[] values = getValues(); [EOL]     getPeriodType().setIndexedField(this, PeriodType.MINUTE_INDEX, values, minutes); [EOL]     return new Period(values, getPeriodType()); [EOL] } <line_num>: 969,973
public Period withSeconds(int seconds) { [EOL]     int[] values = getValues(); [EOL]     getPeriodType().setIndexedField(this, PeriodType.SECOND_INDEX, values, seconds); [EOL]     return new Period(values, getPeriodType()); [EOL] } <line_num>: 984,988
public Period withMillis(int millis) { [EOL]     int[] values = getValues(); [EOL]     getPeriodType().setIndexedField(this, PeriodType.MILLI_INDEX, values, millis); [EOL]     return new Period(values, getPeriodType()); [EOL] } <line_num>: 999,1003
public Period plus(ReadablePeriod period) { [EOL]     if (period == null) { [EOL]         return this; [EOL]     } [EOL]     int[] values = getValues(); [EOL]     getPeriodType().addIndexedField(this, PeriodType.YEAR_INDEX, values, period.get(DurationFieldType.YEARS_TYPE)); [EOL]     getPeriodType().addIndexedField(this, PeriodType.MONTH_INDEX, values, period.get(DurationFieldType.MONTHS_TYPE)); [EOL]     getPeriodType().addIndexedField(this, PeriodType.WEEK_INDEX, values, period.get(DurationFieldType.WEEKS_TYPE)); [EOL]     getPeriodType().addIndexedField(this, PeriodType.DAY_INDEX, values, period.get(DurationFieldType.DAYS_TYPE)); [EOL]     getPeriodType().addIndexedField(this, PeriodType.HOUR_INDEX, values, period.get(DurationFieldType.HOURS_TYPE)); [EOL]     getPeriodType().addIndexedField(this, PeriodType.MINUTE_INDEX, values, period.get(DurationFieldType.MINUTES_TYPE)); [EOL]     getPeriodType().addIndexedField(this, PeriodType.SECOND_INDEX, values, period.get(DurationFieldType.SECONDS_TYPE)); [EOL]     getPeriodType().addIndexedField(this, PeriodType.MILLI_INDEX, values, period.get(DurationFieldType.MILLIS_TYPE)); [EOL]     return new Period(values, getPeriodType()); [EOL] } <line_num>: 1023,1037
public Period plusYears(int years) { [EOL]     if (years == 0) { [EOL]         return this; [EOL]     } [EOL]     int[] values = getValues(); [EOL]     getPeriodType().addIndexedField(this, PeriodType.YEAR_INDEX, values, years); [EOL]     return new Period(values, getPeriodType()); [EOL] } <line_num>: 1049,1056
public Period plusMonths(int months) { [EOL]     if (months == 0) { [EOL]         return this; [EOL]     } [EOL]     int[] values = getValues(); [EOL]     getPeriodType().addIndexedField(this, PeriodType.MONTH_INDEX, values, months); [EOL]     return new Period(values, getPeriodType()); [EOL] } <line_num>: 1067,1074
public Period plusWeeks(int weeks) { [EOL]     if (weeks == 0) { [EOL]         return this; [EOL]     } [EOL]     int[] values = getValues(); [EOL]     getPeriodType().addIndexedField(this, PeriodType.WEEK_INDEX, values, weeks); [EOL]     return new Period(values, getPeriodType()); [EOL] } <line_num>: 1085,1092
public Period plusDays(int days) { [EOL]     if (days == 0) { [EOL]         return this; [EOL]     } [EOL]     int[] values = getValues(); [EOL]     getPeriodType().addIndexedField(this, PeriodType.DAY_INDEX, values, days); [EOL]     return new Period(values, getPeriodType()); [EOL] } <line_num>: 1103,1110
public Period plusHours(int hours) { [EOL]     if (hours == 0) { [EOL]         return this; [EOL]     } [EOL]     int[] values = getValues(); [EOL]     getPeriodType().addIndexedField(this, PeriodType.HOUR_INDEX, values, hours); [EOL]     return new Period(values, getPeriodType()); [EOL] } <line_num>: 1121,1128
public Period plusMinutes(int minutes) { [EOL]     if (minutes == 0) { [EOL]         return this; [EOL]     } [EOL]     int[] values = getValues(); [EOL]     getPeriodType().addIndexedField(this, PeriodType.MINUTE_INDEX, values, minutes); [EOL]     return new Period(values, getPeriodType()); [EOL] } <line_num>: 1139,1146
public Period plusSeconds(int seconds) { [EOL]     if (seconds == 0) { [EOL]         return this; [EOL]     } [EOL]     int[] values = getValues(); [EOL]     getPeriodType().addIndexedField(this, PeriodType.SECOND_INDEX, values, seconds); [EOL]     return new Period(values, getPeriodType()); [EOL] } <line_num>: 1157,1164
public Period plusMillis(int millis) { [EOL]     if (millis == 0) { [EOL]         return this; [EOL]     } [EOL]     int[] values = getValues(); [EOL]     getPeriodType().addIndexedField(this, PeriodType.MILLI_INDEX, values, millis); [EOL]     return new Period(values, getPeriodType()); [EOL] } <line_num>: 1175,1182
public Period minus(ReadablePeriod period) { [EOL]     if (period == null) { [EOL]         return this; [EOL]     } [EOL]     int[] values = getValues(); [EOL]     getPeriodType().addIndexedField(this, PeriodType.YEAR_INDEX, values, -period.get(DurationFieldType.YEARS_TYPE)); [EOL]     getPeriodType().addIndexedField(this, PeriodType.MONTH_INDEX, values, -period.get(DurationFieldType.MONTHS_TYPE)); [EOL]     getPeriodType().addIndexedField(this, PeriodType.WEEK_INDEX, values, -period.get(DurationFieldType.WEEKS_TYPE)); [EOL]     getPeriodType().addIndexedField(this, PeriodType.DAY_INDEX, values, -period.get(DurationFieldType.DAYS_TYPE)); [EOL]     getPeriodType().addIndexedField(this, PeriodType.HOUR_INDEX, values, -period.get(DurationFieldType.HOURS_TYPE)); [EOL]     getPeriodType().addIndexedField(this, PeriodType.MINUTE_INDEX, values, -period.get(DurationFieldType.MINUTES_TYPE)); [EOL]     getPeriodType().addIndexedField(this, PeriodType.SECOND_INDEX, values, -period.get(DurationFieldType.SECONDS_TYPE)); [EOL]     getPeriodType().addIndexedField(this, PeriodType.MILLI_INDEX, values, -period.get(DurationFieldType.MILLIS_TYPE)); [EOL]     return new Period(values, getPeriodType()); [EOL] } <line_num>: 1202,1216
public Period minusYears(int years) { [EOL]     return plusYears(-years); [EOL] } <line_num>: 1228,1230
public Period minusMonths(int months) { [EOL]     return plusMonths(-months); [EOL] } <line_num>: 1241,1243
public Period minusWeeks(int weeks) { [EOL]     return plusWeeks(-weeks); [EOL] } <line_num>: 1254,1256
public Period minusDays(int days) { [EOL]     return plusDays(-days); [EOL] } <line_num>: 1267,1269
public Period minusHours(int hours) { [EOL]     return plusHours(-hours); [EOL] } <line_num>: 1280,1282
public Period minusMinutes(int minutes) { [EOL]     return plusMinutes(-minutes); [EOL] } <line_num>: 1293,1295
public Period minusSeconds(int seconds) { [EOL]     return plusSeconds(-seconds); [EOL] } <line_num>: 1306,1308
public Period minusMillis(int millis) { [EOL]     return plusMillis(-millis); [EOL] } <line_num>: 1319,1321
public Period multipliedBy(int scalar) { [EOL]     if (this == ZERO || scalar == 1) { [EOL]         return this; [EOL]     } [EOL]     int[] values = getValues(); [EOL]     for (int i = 0; i < values.length; i++) { [EOL]         values[i] = FieldUtils.safeMultiply(values[i], scalar); [EOL]     } [EOL]     return new Period(values, getPeriodType()); [EOL] } <line_num>: 1333,1342
public Period negated() { [EOL]     return multipliedBy(-1); [EOL] } <line_num>: 1351,1353
public Weeks toStandardWeeks() { [EOL]     checkYearsAndMonths("Weeks"); [EOL]     long millis = getMillis(); [EOL]     millis += ((long) getSeconds()) * DateTimeConstants.MILLIS_PER_SECOND; [EOL]     millis += ((long) getMinutes()) * DateTimeConstants.MILLIS_PER_MINUTE; [EOL]     millis += ((long) getHours()) * DateTimeConstants.MILLIS_PER_HOUR; [EOL]     millis += ((long) getDays()) * DateTimeConstants.MILLIS_PER_DAY; [EOL]     long weeks = ((long) getWeeks()) + millis / DateTimeConstants.MILLIS_PER_WEEK; [EOL]     return Weeks.weeks(FieldUtils.safeToInt(weeks)); [EOL] } <line_num>: 1375,1384
public Days toStandardDays() { [EOL]     checkYearsAndMonths("Days"); [EOL]     long millis = getMillis(); [EOL]     millis += ((long) getSeconds()) * DateTimeConstants.MILLIS_PER_SECOND; [EOL]     millis += ((long) getMinutes()) * DateTimeConstants.MILLIS_PER_MINUTE; [EOL]     millis += ((long) getHours()) * DateTimeConstants.MILLIS_PER_HOUR; [EOL]     long days = millis / DateTimeConstants.MILLIS_PER_DAY; [EOL]     days = FieldUtils.safeAdd(days, getDays()); [EOL]     days = FieldUtils.safeAdd(days, ((long) getWeeks()) * ((long) DateTimeConstants.DAYS_PER_WEEK)); [EOL]     return Days.days(FieldUtils.safeToInt(days)); [EOL] } <line_num>: 1405,1415
public Hours toStandardHours() { [EOL]     checkYearsAndMonths("Hours"); [EOL]     long millis = getMillis(); [EOL]     millis += ((long) getSeconds()) * DateTimeConstants.MILLIS_PER_SECOND; [EOL]     millis += ((long) getMinutes()) * DateTimeConstants.MILLIS_PER_MINUTE; [EOL]     long hours = millis / DateTimeConstants.MILLIS_PER_HOUR; [EOL]     hours = FieldUtils.safeAdd(hours, getHours()); [EOL]     hours = FieldUtils.safeAdd(hours, ((long) getDays()) * ((long) DateTimeConstants.HOURS_PER_DAY)); [EOL]     hours = FieldUtils.safeAdd(hours, ((long) getWeeks()) * ((long) DateTimeConstants.HOURS_PER_WEEK)); [EOL]     return Hours.hours(FieldUtils.safeToInt(hours)); [EOL] } <line_num>: 1436,1446
public Minutes toStandardMinutes() { [EOL]     checkYearsAndMonths("Minutes"); [EOL]     long millis = getMillis(); [EOL]     millis += ((long) getSeconds()) * DateTimeConstants.MILLIS_PER_SECOND; [EOL]     long minutes = millis / DateTimeConstants.MILLIS_PER_MINUTE; [EOL]     minutes = FieldUtils.safeAdd(minutes, getMinutes()); [EOL]     minutes = FieldUtils.safeAdd(minutes, ((long) getHours()) * ((long) DateTimeConstants.MINUTES_PER_HOUR)); [EOL]     minutes = FieldUtils.safeAdd(minutes, ((long) getDays()) * ((long) DateTimeConstants.MINUTES_PER_DAY)); [EOL]     minutes = FieldUtils.safeAdd(minutes, ((long) getWeeks()) * ((long) DateTimeConstants.MINUTES_PER_WEEK)); [EOL]     return Minutes.minutes(FieldUtils.safeToInt(minutes)); [EOL] } <line_num>: 1467,1477
public Seconds toStandardSeconds() { [EOL]     checkYearsAndMonths("Seconds"); [EOL]     long seconds = getMillis() / DateTimeConstants.MILLIS_PER_SECOND; [EOL]     seconds = FieldUtils.safeAdd(seconds, getSeconds()); [EOL]     seconds = FieldUtils.safeAdd(seconds, ((long) getMinutes()) * ((long) DateTimeConstants.SECONDS_PER_MINUTE)); [EOL]     seconds = FieldUtils.safeAdd(seconds, ((long) getHours()) * ((long) DateTimeConstants.SECONDS_PER_HOUR)); [EOL]     seconds = FieldUtils.safeAdd(seconds, ((long) getDays()) * ((long) DateTimeConstants.SECONDS_PER_DAY)); [EOL]     seconds = FieldUtils.safeAdd(seconds, ((long) getWeeks()) * ((long) DateTimeConstants.SECONDS_PER_WEEK)); [EOL]     return Seconds.seconds(FieldUtils.safeToInt(seconds)); [EOL] } <line_num>: 1498,1507
public Duration toStandardDuration() { [EOL]     checkYearsAndMonths("Duration"); [EOL]     long millis = getMillis(); [EOL]     millis += (((long) getSeconds()) * ((long) DateTimeConstants.MILLIS_PER_SECOND)); [EOL]     millis += (((long) getMinutes()) * ((long) DateTimeConstants.MILLIS_PER_MINUTE)); [EOL]     millis += (((long) getHours()) * ((long) DateTimeConstants.MILLIS_PER_HOUR)); [EOL]     millis += (((long) getDays()) * ((long) DateTimeConstants.MILLIS_PER_DAY)); [EOL]     millis += (((long) getWeeks()) * ((long) DateTimeConstants.MILLIS_PER_WEEK)); [EOL]     return new Duration(millis); [EOL] } <line_num>: 1528,1537
private void checkYearsAndMonths(String destintionType) { [EOL]     if (getMonths() != 0) { [EOL]         throw new UnsupportedOperationException("Cannot convert to " + destintionType + " as this period contains months and months vary in length"); [EOL]     } [EOL]     if (getYears() != 0) { [EOL]         throw new UnsupportedOperationException("Cannot convert to " + destintionType + " as this period contains years and years vary in length"); [EOL]     } [EOL] } <line_num>: 1545,1552
public Period normalizedStandard() { [EOL]     return normalizedStandard(PeriodType.standard()); [EOL] } <line_num>: 1580,1582
public Period normalizedStandard(PeriodType type) { [EOL]     type = DateTimeUtils.getPeriodType(type); [EOL]     long millis = getMillis(); [EOL]     millis += (((long) getSeconds()) * ((long) DateTimeConstants.MILLIS_PER_SECOND)); [EOL]     millis += (((long) getMinutes()) * ((long) DateTimeConstants.MILLIS_PER_MINUTE)); [EOL]     millis += (((long) getHours()) * ((long) DateTimeConstants.MILLIS_PER_HOUR)); [EOL]     millis += (((long) getDays()) * ((long) DateTimeConstants.MILLIS_PER_DAY)); [EOL]     millis += (((long) getWeeks()) * ((long) DateTimeConstants.MILLIS_PER_WEEK)); [EOL]     Period result = new Period(millis, type, ISOChronology.getInstanceUTC()); [EOL]     int years = getYears(); [EOL]     int months = getMonths(); [EOL]     if (years != 0 || months != 0) { [EOL]         long totalMonths = years * 12L + months; [EOL]         if (type.isSupported(DurationFieldType.YEARS_TYPE)) { [EOL]             int normalizedYears = FieldUtils.safeToInt(totalMonths / 12); [EOL]             result = result.withYears(normalizedYears); [EOL]             totalMonths = totalMonths - (normalizedYears * 12); [EOL]         } [EOL]         if (type.isSupported(DurationFieldType.MONTHS_TYPE)) { [EOL]             int normalizedMonths = FieldUtils.safeToInt(totalMonths); [EOL]             result = result.withMonths(normalizedMonths); [EOL]             totalMonths = totalMonths - normalizedMonths; [EOL]         } [EOL]         if (totalMonths != 0) { [EOL]             throw new UnsupportedOperationException("Unable to normalize as PeriodType is missing either years or months but period has a month/year amount: " + toString()); [EOL]         } [EOL]     } [EOL]     return result; [EOL] } <line_num>: 1616,1644
