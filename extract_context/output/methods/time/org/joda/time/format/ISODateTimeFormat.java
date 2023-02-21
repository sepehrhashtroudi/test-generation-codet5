protected ISODateTimeFormat() { [EOL]     super(); [EOL] } <line_num>: 70,72
public static DateTimeFormatter forFields(Collection<DateTimeFieldType> fields, boolean extended, boolean strictISO) { [EOL]     if (fields == null || fields.size() == 0) { [EOL]         throw new IllegalArgumentException("The fields must not be null or empty"); [EOL]     } [EOL]     Set<DateTimeFieldType> workingFields = new HashSet<DateTimeFieldType>(fields); [EOL]     int inputSize = workingFields.size(); [EOL]     boolean reducedPrec = false; [EOL]     DateTimeFormatterBuilder bld = new DateTimeFormatterBuilder(); [EOL]     if (workingFields.contains(DateTimeFieldType.monthOfYear())) { [EOL]         reducedPrec = dateByMonth(bld, workingFields, extended, strictISO); [EOL]     } else if (workingFields.contains(DateTimeFieldType.dayOfYear())) { [EOL]         reducedPrec = dateByOrdinal(bld, workingFields, extended, strictISO); [EOL]     } else if (workingFields.contains(DateTimeFieldType.weekOfWeekyear())) { [EOL]         reducedPrec = dateByWeek(bld, workingFields, extended, strictISO); [EOL]     } else if (workingFields.contains(DateTimeFieldType.dayOfMonth())) { [EOL]         reducedPrec = dateByMonth(bld, workingFields, extended, strictISO); [EOL]     } else if (workingFields.contains(DateTimeFieldType.dayOfWeek())) { [EOL]         reducedPrec = dateByWeek(bld, workingFields, extended, strictISO); [EOL]     } else if (workingFields.remove(DateTimeFieldType.year())) { [EOL]         bld.append(Constants.ye); [EOL]         reducedPrec = true; [EOL]     } else if (workingFields.remove(DateTimeFieldType.weekyear())) { [EOL]         bld.append(Constants.we); [EOL]         reducedPrec = true; [EOL]     } [EOL]     boolean datePresent = (workingFields.size() < inputSize); [EOL]     time(bld, workingFields, extended, strictISO, reducedPrec, datePresent); [EOL]     if (bld.canBuildFormatter() == false) { [EOL]         throw new IllegalArgumentException("No valid format for fields: " + fields); [EOL]     } [EOL]     try { [EOL]         fields.retainAll(workingFields); [EOL]     } catch (UnsupportedOperationException ex) { [EOL]     } [EOL]     return bld.toFormatter(); [EOL] } <line_num>: 151,199
private static boolean dateByMonth(DateTimeFormatterBuilder bld, Collection<DateTimeFieldType> fields, boolean extended, boolean strictISO) { [EOL]     boolean reducedPrec = false; [EOL]     if (fields.remove(DateTimeFieldType.year())) { [EOL]         bld.append(Constants.ye); [EOL]         if (fields.remove(DateTimeFieldType.monthOfYear())) { [EOL]             if (fields.remove(DateTimeFieldType.dayOfMonth())) { [EOL]                 appendSeparator(bld, extended); [EOL]                 bld.appendMonthOfYear(2); [EOL]                 appendSeparator(bld, extended); [EOL]                 bld.appendDayOfMonth(2); [EOL]             } else { [EOL]                 bld.appendLiteral('-'); [EOL]                 bld.appendMonthOfYear(2); [EOL]                 reducedPrec = true; [EOL]             } [EOL]         } else { [EOL]             if (fields.remove(DateTimeFieldType.dayOfMonth())) { [EOL]                 checkNotStrictISO(fields, strictISO); [EOL]                 bld.appendLiteral('-'); [EOL]                 bld.appendLiteral('-'); [EOL]                 bld.appendDayOfMonth(2); [EOL]             } else { [EOL]                 reducedPrec = true; [EOL]             } [EOL]         } [EOL]     } else if (fields.remove(DateTimeFieldType.monthOfYear())) { [EOL]         bld.appendLiteral('-'); [EOL]         bld.appendLiteral('-'); [EOL]         bld.appendMonthOfYear(2); [EOL]         if (fields.remove(DateTimeFieldType.dayOfMonth())) { [EOL]             appendSeparator(bld, extended); [EOL]             bld.appendDayOfMonth(2); [EOL]         } else { [EOL]             reducedPrec = true; [EOL]         } [EOL]     } else if (fields.remove(DateTimeFieldType.dayOfMonth())) { [EOL]         bld.appendLiteral('-'); [EOL]         bld.appendLiteral('-'); [EOL]         bld.appendLiteral('-'); [EOL]         bld.appendDayOfMonth(2); [EOL]     } [EOL]     return reducedPrec; [EOL] } <line_num>: 213,268
private static boolean dateByOrdinal(DateTimeFormatterBuilder bld, Collection<DateTimeFieldType> fields, boolean extended, boolean strictISO) { [EOL]     boolean reducedPrec = false; [EOL]     if (fields.remove(DateTimeFieldType.year())) { [EOL]         bld.append(Constants.ye); [EOL]         if (fields.remove(DateTimeFieldType.dayOfYear())) { [EOL]             appendSeparator(bld, extended); [EOL]             bld.appendDayOfYear(3); [EOL]         } else { [EOL]             reducedPrec = true; [EOL]         } [EOL]     } else if (fields.remove(DateTimeFieldType.dayOfYear())) { [EOL]         bld.appendLiteral('-'); [EOL]         bld.appendDayOfYear(3); [EOL]     } [EOL]     return reducedPrec; [EOL] } <line_num>: 281,305
private static boolean dateByWeek(DateTimeFormatterBuilder bld, Collection<DateTimeFieldType> fields, boolean extended, boolean strictISO) { [EOL]     boolean reducedPrec = false; [EOL]     if (fields.remove(DateTimeFieldType.weekyear())) { [EOL]         bld.append(Constants.we); [EOL]         if (fields.remove(DateTimeFieldType.weekOfWeekyear())) { [EOL]             appendSeparator(bld, extended); [EOL]             bld.appendLiteral('W'); [EOL]             bld.appendWeekOfWeekyear(2); [EOL]             if (fields.remove(DateTimeFieldType.dayOfWeek())) { [EOL]                 appendSeparator(bld, extended); [EOL]                 bld.appendDayOfWeek(1); [EOL]             } else { [EOL]                 reducedPrec = true; [EOL]             } [EOL]         } else { [EOL]             if (fields.remove(DateTimeFieldType.dayOfWeek())) { [EOL]                 checkNotStrictISO(fields, strictISO); [EOL]                 appendSeparator(bld, extended); [EOL]                 bld.appendLiteral('W'); [EOL]                 bld.appendLiteral('-'); [EOL]                 bld.appendDayOfWeek(1); [EOL]             } else { [EOL]                 reducedPrec = true; [EOL]             } [EOL]         } [EOL]     } else if (fields.remove(DateTimeFieldType.weekOfWeekyear())) { [EOL]         bld.appendLiteral('-'); [EOL]         bld.appendLiteral('W'); [EOL]         bld.appendWeekOfWeekyear(2); [EOL]         if (fields.remove(DateTimeFieldType.dayOfWeek())) { [EOL]             appendSeparator(bld, extended); [EOL]             bld.appendDayOfWeek(1); [EOL]         } else { [EOL]             reducedPrec = true; [EOL]         } [EOL]     } else if (fields.remove(DateTimeFieldType.dayOfWeek())) { [EOL]         bld.appendLiteral('-'); [EOL]         bld.appendLiteral('W'); [EOL]         bld.appendLiteral('-'); [EOL]         bld.appendDayOfWeek(1); [EOL]     } [EOL]     return reducedPrec; [EOL] } <line_num>: 318,373
private static void time(DateTimeFormatterBuilder bld, Collection<DateTimeFieldType> fields, boolean extended, boolean strictISO, boolean reducedPrec, boolean datePresent) { [EOL]     boolean hour = fields.remove(DateTimeFieldType.hourOfDay()); [EOL]     boolean minute = fields.remove(DateTimeFieldType.minuteOfHour()); [EOL]     boolean second = fields.remove(DateTimeFieldType.secondOfMinute()); [EOL]     boolean milli = fields.remove(DateTimeFieldType.millisOfSecond()); [EOL]     if (!hour && !minute && !second && !milli) { [EOL]         return; [EOL]     } [EOL]     if (hour || minute || second || milli) { [EOL]         if (strictISO && reducedPrec) { [EOL]             throw new IllegalArgumentException("No valid ISO8601 format for fields because Date was reduced precision: " + fields); [EOL]         } [EOL]         if (datePresent) { [EOL]             bld.appendLiteral('T'); [EOL]         } [EOL]     } [EOL]     if (hour && minute && second || (hour && !second && !milli)) { [EOL]     } else { [EOL]         if (strictISO && datePresent) { [EOL]             throw new IllegalArgumentException("No valid ISO8601 format for fields because Time was truncated: " + fields); [EOL]         } [EOL]         if (!hour && (minute && second || (minute && !milli) || second)) { [EOL]         } else { [EOL]             if (strictISO) { [EOL]                 throw new IllegalArgumentException("No valid ISO8601 format for fields: " + fields); [EOL]             } [EOL]         } [EOL]     } [EOL]     if (hour) { [EOL]         bld.appendHourOfDay(2); [EOL]     } else if (minute || second || milli) { [EOL]         bld.appendLiteral('-'); [EOL]     } [EOL]     if (extended && hour && minute) { [EOL]         bld.appendLiteral(':'); [EOL]     } [EOL]     if (minute) { [EOL]         bld.appendMinuteOfHour(2); [EOL]     } else if (second || milli) { [EOL]         bld.appendLiteral('-'); [EOL]     } [EOL]     if (extended && minute && second) { [EOL]         bld.appendLiteral(':'); [EOL]     } [EOL]     if (second) { [EOL]         bld.appendSecondOfMinute(2); [EOL]     } else if (milli) { [EOL]         bld.appendLiteral('-'); [EOL]     } [EOL]     if (milli) { [EOL]         bld.appendLiteral('.'); [EOL]         bld.appendMillisOfSecond(3); [EOL]     } [EOL] } <line_num>: 388,450
private static void checkNotStrictISO(Collection<DateTimeFieldType> fields, boolean strictISO) { [EOL]     if (strictISO) { [EOL]         throw new IllegalArgumentException("No valid ISO8601 format for fields: " + fields); [EOL]     } [EOL] } <line_num>: 460,464
private static void appendSeparator(DateTimeFormatterBuilder bld, boolean extended) { [EOL]     if (extended) { [EOL]         bld.appendLiteral('-'); [EOL]     } [EOL] } <line_num>: 474,478
public static DateTimeFormatter dateParser() { [EOL]     return Constants.dp; [EOL] } <line_num>: 494,496
public static DateTimeFormatter localDateParser() { [EOL]     return Constants.ldp; [EOL] } <line_num>: 511,513
public static DateTimeFormatter dateElementParser() { [EOL]     return Constants.dpe; [EOL] } <line_num>: 526,528
public static DateTimeFormatter timeParser() { [EOL]     return Constants.tp; [EOL] } <line_num>: 544,546
public static DateTimeFormatter localTimeParser() { [EOL]     return Constants.ltp; [EOL] } <line_num>: 563,565
public static DateTimeFormatter timeElementParser() { [EOL]     return Constants.tpe; [EOL] } <line_num>: 579,581
public static DateTimeFormatter dateTimeParser() { [EOL]     return Constants.dtp; [EOL] } <line_num>: 603,605
public static DateTimeFormatter dateOptionalTimeParser() { [EOL]     return Constants.dotp; [EOL] } <line_num>: 626,628
public static DateTimeFormatter localDateOptionalTimeParser() { [EOL]     return Constants.ldotp; [EOL] } <line_num>: 650,652
public static DateTimeFormatter date() { [EOL]     return yearMonthDay(); [EOL] } <line_num>: 661,663
public static DateTimeFormatter time() { [EOL]     return Constants.t; [EOL] } <line_num>: 674,676
public static DateTimeFormatter timeNoMillis() { [EOL]     return Constants.tx; [EOL] } <line_num>: 686,688
public static DateTimeFormatter tTime() { [EOL]     return Constants.tt; [EOL] } <line_num>: 699,701
public static DateTimeFormatter tTimeNoMillis() { [EOL]     return Constants.ttx; [EOL] } <line_num>: 712,714
public static DateTimeFormatter dateTime() { [EOL]     return Constants.dt; [EOL] } <line_num>: 724,726
public static DateTimeFormatter dateTimeNoMillis() { [EOL]     return Constants.dtx; [EOL] } <line_num>: 736,738
public static DateTimeFormatter ordinalDate() { [EOL]     return Constants.od; [EOL] } <line_num>: 747,749
public static DateTimeFormatter ordinalDateTime() { [EOL]     return Constants.odt; [EOL] } <line_num>: 760,762
public static DateTimeFormatter ordinalDateTimeNoMillis() { [EOL]     return Constants.odtx; [EOL] } <line_num>: 773,775
public static DateTimeFormatter weekDate() { [EOL]     return Constants.wwd; [EOL] } <line_num>: 783,785
public static DateTimeFormatter weekDateTime() { [EOL]     return Constants.wdt; [EOL] } <line_num>: 795,797
public static DateTimeFormatter weekDateTimeNoMillis() { [EOL]     return Constants.wdtx; [EOL] } <line_num>: 807,809
public static DateTimeFormatter basicDate() { [EOL]     return Constants.bd; [EOL] } <line_num>: 818,820
public static DateTimeFormatter basicTime() { [EOL]     return Constants.bt; [EOL] } <line_num>: 831,833
public static DateTimeFormatter basicTimeNoMillis() { [EOL]     return Constants.btx; [EOL] } <line_num>: 843,845
public static DateTimeFormatter basicTTime() { [EOL]     return Constants.btt; [EOL] } <line_num>: 856,858
public static DateTimeFormatter basicTTimeNoMillis() { [EOL]     return Constants.bttx; [EOL] } <line_num>: 869,871
public static DateTimeFormatter basicDateTime() { [EOL]     return Constants.bdt; [EOL] } <line_num>: 881,883
public static DateTimeFormatter basicDateTimeNoMillis() { [EOL]     return Constants.bdtx; [EOL] } <line_num>: 893,895
public static DateTimeFormatter basicOrdinalDate() { [EOL]     return Constants.bod; [EOL] } <line_num>: 904,906
public static DateTimeFormatter basicOrdinalDateTime() { [EOL]     return Constants.bodt; [EOL] } <line_num>: 917,919
public static DateTimeFormatter basicOrdinalDateTimeNoMillis() { [EOL]     return Constants.bodtx; [EOL] } <line_num>: 930,932
public static DateTimeFormatter basicWeekDate() { [EOL]     return Constants.bwd; [EOL] } <line_num>: 940,942
public static DateTimeFormatter basicWeekDateTime() { [EOL]     return Constants.bwdt; [EOL] } <line_num>: 952,954
public static DateTimeFormatter basicWeekDateTimeNoMillis() { [EOL]     return Constants.bwdtx; [EOL] } <line_num>: 964,966
public static DateTimeFormatter year() { [EOL]     return Constants.ye; [EOL] } <line_num>: 974,976
public static DateTimeFormatter yearMonth() { [EOL]     return Constants.ym; [EOL] } <line_num>: 984,986
public static DateTimeFormatter yearMonthDay() { [EOL]     return Constants.ymd; [EOL] } <line_num>: 994,996
public static DateTimeFormatter weekyear() { [EOL]     return Constants.we; [EOL] } <line_num>: 1003,1005
public static DateTimeFormatter weekyearWeek() { [EOL]     return Constants.ww; [EOL] } <line_num>: 1013,1015
public static DateTimeFormatter weekyearWeekDay() { [EOL]     return Constants.wwd; [EOL] } <line_num>: 1023,1025
public static DateTimeFormatter hour() { [EOL]     return Constants.hde; [EOL] } <line_num>: 1032,1034
public static DateTimeFormatter hourMinute() { [EOL]     return Constants.hm; [EOL] } <line_num>: 1042,1044
public static DateTimeFormatter hourMinuteSecond() { [EOL]     return Constants.hms; [EOL] } <line_num>: 1052,1054
public static DateTimeFormatter hourMinuteSecondMillis() { [EOL]     return Constants.hmsl; [EOL] } <line_num>: 1064,1066
public static DateTimeFormatter hourMinuteSecondFraction() { [EOL]     return Constants.hmsf; [EOL] } <line_num>: 1076,1078
public static DateTimeFormatter dateHour() { [EOL]     return Constants.dh; [EOL] } <line_num>: 1086,1088
public static DateTimeFormatter dateHourMinute() { [EOL]     return Constants.dhm; [EOL] } <line_num>: 1096,1098
public static DateTimeFormatter dateHourMinuteSecond() { [EOL]     return Constants.dhms; [EOL] } <line_num>: 1107,1109
public static DateTimeFormatter dateHourMinuteSecondMillis() { [EOL]     return Constants.dhmsl; [EOL] } <line_num>: 1119,1121
public static DateTimeFormatter dateHourMinuteSecondFraction() { [EOL]     return Constants.dhmsf; [EOL] } <line_num>: 1131,1133
private static DateTimeFormatter dateParser() { [EOL]     if (dp == null) { [EOL]         DateTimeParser tOffset = new DateTimeFormatterBuilder().appendLiteral('T').append(offsetElement()).toParser(); [EOL]         return new DateTimeFormatterBuilder().append(dateElementParser()).appendOptional(tOffset).toFormatter(); [EOL]     } [EOL]     return dp; [EOL] } <line_num>: 1215,1226
private static DateTimeFormatter localDateParser() { [EOL]     if (ldp == null) { [EOL]         return dateElementParser().withZoneUTC(); [EOL]     } [EOL]     return ldp; [EOL] } <line_num>: 1228,1233
private static DateTimeFormatter dateElementParser() { [EOL]     if (dpe == null) { [EOL]         return new DateTimeFormatterBuilder().append(null, new DateTimeParser[] { new DateTimeFormatterBuilder().append(yearElement()).appendOptional(new DateTimeFormatterBuilder().append(monthElement()).appendOptional(dayOfMonthElement().getParser()).toParser()).toParser(), new DateTimeFormatterBuilder().append(weekyearElement()).append(weekElement()).appendOptional(dayOfWeekElement().getParser()).toParser(), new DateTimeFormatterBuilder().append(yearElement()).append(dayOfYearElement()).toParser() }).toFormatter(); [EOL]     } [EOL]     return dpe; [EOL] } <line_num>: 1235,1260
private static DateTimeFormatter timeParser() { [EOL]     if (tp == null) { [EOL]         return new DateTimeFormatterBuilder().appendOptional(literalTElement().getParser()).append(timeElementParser()).appendOptional(offsetElement().getParser()).toFormatter(); [EOL]     } [EOL]     return tp; [EOL] } <line_num>: 1262,1271
private static DateTimeFormatter localTimeParser() { [EOL]     if (ltp == null) { [EOL]         return new DateTimeFormatterBuilder().appendOptional(literalTElement().getParser()).append(timeElementParser()).toFormatter().withZoneUTC(); [EOL]     } [EOL]     return ltp; [EOL] } <line_num>: 1273,1281
private static DateTimeFormatter timeElementParser() { [EOL]     if (tpe == null) { [EOL]         DateTimeParser decimalPoint = new DateTimeFormatterBuilder().append(null, new DateTimeParser[] { new DateTimeFormatterBuilder().appendLiteral('.').toParser(), new DateTimeFormatterBuilder().appendLiteral(',').toParser() }).toParser(); [EOL]         return new DateTimeFormatterBuilder().append(hourElement()).append(null, new DateTimeParser[] { new DateTimeFormatterBuilder().append(minuteElement()).append(null, new DateTimeParser[] { new DateTimeFormatterBuilder().append(secondElement()).appendOptional(new DateTimeFormatterBuilder().append(decimalPoint).appendFractionOfSecond(1, 9).toParser()).toParser(), new DateTimeFormatterBuilder().append(decimalPoint).appendFractionOfMinute(1, 9).toParser(), null }).toParser(), new DateTimeFormatterBuilder().append(decimalPoint).appendFractionOfHour(1, 9).toParser(), null }).toFormatter(); [EOL]     } [EOL]     return tpe; [EOL] } <line_num>: 1283,1334
private static DateTimeFormatter dateTimeParser() { [EOL]     if (dtp == null) { [EOL]         DateTimeParser time = new DateTimeFormatterBuilder().appendLiteral('T').append(timeElementParser()).appendOptional(offsetElement().getParser()).toParser(); [EOL]         return new DateTimeFormatterBuilder().append(null, new DateTimeParser[] { time, dateOptionalTimeParser().getParser() }).toFormatter(); [EOL]     } [EOL]     return dtp; [EOL] } <line_num>: 1336,1350
private static DateTimeFormatter dateOptionalTimeParser() { [EOL]     if (dotp == null) { [EOL]         DateTimeParser timeOrOffset = new DateTimeFormatterBuilder().appendLiteral('T').appendOptional(timeElementParser().getParser()).appendOptional(offsetElement().getParser()).toParser(); [EOL]         return new DateTimeFormatterBuilder().append(dateElementParser()).appendOptional(timeOrOffset).toFormatter(); [EOL]     } [EOL]     return dotp; [EOL] } <line_num>: 1352,1365
private static DateTimeFormatter localDateOptionalTimeParser() { [EOL]     if (ldotp == null) { [EOL]         DateTimeParser time = new DateTimeFormatterBuilder().appendLiteral('T').append(timeElementParser()).toParser(); [EOL]         return new DateTimeFormatterBuilder().append(dateElementParser()).appendOptional(time).toFormatter().withZoneUTC(); [EOL]     } [EOL]     return ldotp; [EOL] } <line_num>: 1367,1379
private static DateTimeFormatter time() { [EOL]     if (t == null) { [EOL]         return new DateTimeFormatterBuilder().append(hourMinuteSecondFraction()).append(offsetElement()).toFormatter(); [EOL]     } [EOL]     return t; [EOL] } <line_num>: 1382,1390
private static DateTimeFormatter timeNoMillis() { [EOL]     if (tx == null) { [EOL]         return new DateTimeFormatterBuilder().append(hourMinuteSecond()).append(offsetElement()).toFormatter(); [EOL]     } [EOL]     return tx; [EOL] } <line_num>: 1392,1400
private static DateTimeFormatter tTime() { [EOL]     if (tt == null) { [EOL]         return new DateTimeFormatterBuilder().append(literalTElement()).append(time()).toFormatter(); [EOL]     } [EOL]     return tt; [EOL] } <line_num>: 1402,1410
private static DateTimeFormatter tTimeNoMillis() { [EOL]     if (ttx == null) { [EOL]         return new DateTimeFormatterBuilder().append(literalTElement()).append(timeNoMillis()).toFormatter(); [EOL]     } [EOL]     return ttx; [EOL] } <line_num>: 1412,1420
private static DateTimeFormatter dateTime() { [EOL]     if (dt == null) { [EOL]         return new DateTimeFormatterBuilder().append(date()).append(tTime()).toFormatter(); [EOL]     } [EOL]     return dt; [EOL] } <line_num>: 1422,1430
private static DateTimeFormatter dateTimeNoMillis() { [EOL]     if (dtx == null) { [EOL]         return new DateTimeFormatterBuilder().append(date()).append(tTimeNoMillis()).toFormatter(); [EOL]     } [EOL]     return dtx; [EOL] } <line_num>: 1432,1440
private static DateTimeFormatter ordinalDate() { [EOL]     if (od == null) { [EOL]         return new DateTimeFormatterBuilder().append(yearElement()).append(dayOfYearElement()).toFormatter(); [EOL]     } [EOL]     return od; [EOL] } <line_num>: 1442,1450
private static DateTimeFormatter ordinalDateTime() { [EOL]     if (odt == null) { [EOL]         return new DateTimeFormatterBuilder().append(ordinalDate()).append(tTime()).toFormatter(); [EOL]     } [EOL]     return odt; [EOL] } <line_num>: 1452,1460
private static DateTimeFormatter ordinalDateTimeNoMillis() { [EOL]     if (odtx == null) { [EOL]         return new DateTimeFormatterBuilder().append(ordinalDate()).append(tTimeNoMillis()).toFormatter(); [EOL]     } [EOL]     return odtx; [EOL] } <line_num>: 1462,1470
private static DateTimeFormatter weekDateTime() { [EOL]     if (wdt == null) { [EOL]         return new DateTimeFormatterBuilder().append(weekDate()).append(tTime()).toFormatter(); [EOL]     } [EOL]     return wdt; [EOL] } <line_num>: 1472,1480
private static DateTimeFormatter weekDateTimeNoMillis() { [EOL]     if (wdtx == null) { [EOL]         return new DateTimeFormatterBuilder().append(weekDate()).append(tTimeNoMillis()).toFormatter(); [EOL]     } [EOL]     return wdtx; [EOL] } <line_num>: 1482,1490
private static DateTimeFormatter basicDate() { [EOL]     if (bd == null) { [EOL]         return new DateTimeFormatterBuilder().appendYear(4, 4).appendFixedDecimal(DateTimeFieldType.monthOfYear(), 2).appendFixedDecimal(DateTimeFieldType.dayOfMonth(), 2).toFormatter(); [EOL]     } [EOL]     return bd; [EOL] } <line_num>: 1493,1502
private static DateTimeFormatter basicTime() { [EOL]     if (bt == null) { [EOL]         return new DateTimeFormatterBuilder().appendFixedDecimal(DateTimeFieldType.hourOfDay(), 2).appendFixedDecimal(DateTimeFieldType.minuteOfHour(), 2).appendFixedDecimal(DateTimeFieldType.secondOfMinute(), 2).appendLiteral('.').appendFractionOfSecond(3, 9).appendTimeZoneOffset("Z", false, 2, 2).toFormatter(); [EOL]     } [EOL]     return bt; [EOL] } <line_num>: 1504,1516
private static DateTimeFormatter basicTimeNoMillis() { [EOL]     if (btx == null) { [EOL]         return new DateTimeFormatterBuilder().appendFixedDecimal(DateTimeFieldType.hourOfDay(), 2).appendFixedDecimal(DateTimeFieldType.minuteOfHour(), 2).appendFixedDecimal(DateTimeFieldType.secondOfMinute(), 2).appendTimeZoneOffset("Z", false, 2, 2).toFormatter(); [EOL]     } [EOL]     return btx; [EOL] } <line_num>: 1518,1528
private static DateTimeFormatter basicTTime() { [EOL]     if (btt == null) { [EOL]         return new DateTimeFormatterBuilder().append(literalTElement()).append(basicTime()).toFormatter(); [EOL]     } [EOL]     return btt; [EOL] } <line_num>: 1530,1538
private static DateTimeFormatter basicTTimeNoMillis() { [EOL]     if (bttx == null) { [EOL]         return new DateTimeFormatterBuilder().append(literalTElement()).append(basicTimeNoMillis()).toFormatter(); [EOL]     } [EOL]     return bttx; [EOL] } <line_num>: 1540,1548
private static DateTimeFormatter basicDateTime() { [EOL]     if (bdt == null) { [EOL]         return new DateTimeFormatterBuilder().append(basicDate()).append(basicTTime()).toFormatter(); [EOL]     } [EOL]     return bdt; [EOL] } <line_num>: 1550,1558
private static DateTimeFormatter basicDateTimeNoMillis() { [EOL]     if (bdtx == null) { [EOL]         return new DateTimeFormatterBuilder().append(basicDate()).append(basicTTimeNoMillis()).toFormatter(); [EOL]     } [EOL]     return bdtx; [EOL] } <line_num>: 1560,1568
private static DateTimeFormatter basicOrdinalDate() { [EOL]     if (bod == null) { [EOL]         return new DateTimeFormatterBuilder().appendYear(4, 4).appendFixedDecimal(DateTimeFieldType.dayOfYear(), 3).toFormatter(); [EOL]     } [EOL]     return bod; [EOL] } <line_num>: 1570,1578
private static DateTimeFormatter basicOrdinalDateTime() { [EOL]     if (bodt == null) { [EOL]         return new DateTimeFormatterBuilder().append(basicOrdinalDate()).append(basicTTime()).toFormatter(); [EOL]     } [EOL]     return bodt; [EOL] } <line_num>: 1580,1588
private static DateTimeFormatter basicOrdinalDateTimeNoMillis() { [EOL]     if (bodtx == null) { [EOL]         return new DateTimeFormatterBuilder().append(basicOrdinalDate()).append(basicTTimeNoMillis()).toFormatter(); [EOL]     } [EOL]     return bodtx; [EOL] } <line_num>: 1590,1598
private static DateTimeFormatter basicWeekDate() { [EOL]     if (bwd == null) { [EOL]         return new DateTimeFormatterBuilder().appendWeekyear(4, 4).appendLiteral('W').appendFixedDecimal(DateTimeFieldType.weekOfWeekyear(), 2).appendFixedDecimal(DateTimeFieldType.dayOfWeek(), 1).toFormatter(); [EOL]     } [EOL]     return bwd; [EOL] } <line_num>: 1600,1610
private static DateTimeFormatter basicWeekDateTime() { [EOL]     if (bwdt == null) { [EOL]         return new DateTimeFormatterBuilder().append(basicWeekDate()).append(basicTTime()).toFormatter(); [EOL]     } [EOL]     return bwdt; [EOL] } <line_num>: 1612,1620
private static DateTimeFormatter basicWeekDateTimeNoMillis() { [EOL]     if (bwdtx == null) { [EOL]         return new DateTimeFormatterBuilder().append(basicWeekDate()).append(basicTTimeNoMillis()).toFormatter(); [EOL]     } [EOL]     return bwdtx; [EOL] } <line_num>: 1622,1630
private static DateTimeFormatter yearMonth() { [EOL]     if (ym == null) { [EOL]         return new DateTimeFormatterBuilder().append(yearElement()).append(monthElement()).toFormatter(); [EOL]     } [EOL]     return ym; [EOL] } <line_num>: 1633,1641
private static DateTimeFormatter yearMonthDay() { [EOL]     if (ymd == null) { [EOL]         return new DateTimeFormatterBuilder().append(yearElement()).append(monthElement()).append(dayOfMonthElement()).toFormatter(); [EOL]     } [EOL]     return ymd; [EOL] } <line_num>: 1643,1652
private static DateTimeFormatter weekyearWeek() { [EOL]     if (ww == null) { [EOL]         return new DateTimeFormatterBuilder().append(weekyearElement()).append(weekElement()).toFormatter(); [EOL]     } [EOL]     return ww; [EOL] } <line_num>: 1654,1662
private static DateTimeFormatter weekyearWeekDay() { [EOL]     if (wwd == null) { [EOL]         return new DateTimeFormatterBuilder().append(weekyearElement()).append(weekElement()).append(dayOfWeekElement()).toFormatter(); [EOL]     } [EOL]     return wwd; [EOL] } <line_num>: 1664,1673
private static DateTimeFormatter hourMinute() { [EOL]     if (hm == null) { [EOL]         return new DateTimeFormatterBuilder().append(hourElement()).append(minuteElement()).toFormatter(); [EOL]     } [EOL]     return hm; [EOL] } <line_num>: 1675,1683
private static DateTimeFormatter hourMinuteSecond() { [EOL]     if (hms == null) { [EOL]         return new DateTimeFormatterBuilder().append(hourElement()).append(minuteElement()).append(secondElement()).toFormatter(); [EOL]     } [EOL]     return hms; [EOL] } <line_num>: 1685,1694
private static DateTimeFormatter hourMinuteSecondMillis() { [EOL]     if (hmsl == null) { [EOL]         return new DateTimeFormatterBuilder().append(hourElement()).append(minuteElement()).append(secondElement()).appendLiteral('.').appendFractionOfSecond(3, 3).toFormatter(); [EOL]     } [EOL]     return hmsl; [EOL] } <line_num>: 1696,1707
private static DateTimeFormatter hourMinuteSecondFraction() { [EOL]     if (hmsf == null) { [EOL]         return new DateTimeFormatterBuilder().append(hourElement()).append(minuteElement()).append(secondElement()).append(fractionElement()).toFormatter(); [EOL]     } [EOL]     return hmsf; [EOL] } <line_num>: 1709,1719
private static DateTimeFormatter dateHour() { [EOL]     if (dh == null) { [EOL]         return new DateTimeFormatterBuilder().append(date()).append(literalTElement()).append(hour()).toFormatter(); [EOL]     } [EOL]     return dh; [EOL] } <line_num>: 1721,1730
private static DateTimeFormatter dateHourMinute() { [EOL]     if (dhm == null) { [EOL]         return new DateTimeFormatterBuilder().append(date()).append(literalTElement()).append(hourMinute()).toFormatter(); [EOL]     } [EOL]     return dhm; [EOL] } <line_num>: 1732,1741
private static DateTimeFormatter dateHourMinuteSecond() { [EOL]     if (dhms == null) { [EOL]         return new DateTimeFormatterBuilder().append(date()).append(literalTElement()).append(hourMinuteSecond()).toFormatter(); [EOL]     } [EOL]     return dhms; [EOL] } <line_num>: 1743,1752
private static DateTimeFormatter dateHourMinuteSecondMillis() { [EOL]     if (dhmsl == null) { [EOL]         return new DateTimeFormatterBuilder().append(date()).append(literalTElement()).append(hourMinuteSecondMillis()).toFormatter(); [EOL]     } [EOL]     return dhmsl; [EOL] } <line_num>: 1754,1763
private static DateTimeFormatter dateHourMinuteSecondFraction() { [EOL]     if (dhmsf == null) { [EOL]         return new DateTimeFormatterBuilder().append(date()).append(literalTElement()).append(hourMinuteSecondFraction()).toFormatter(); [EOL]     } [EOL]     return dhmsf; [EOL] } <line_num>: 1765,1774
private static DateTimeFormatter yearElement() { [EOL]     if (ye == null) { [EOL]         return new DateTimeFormatterBuilder().appendYear(4, 9).toFormatter(); [EOL]     } [EOL]     return ye; [EOL] } <line_num>: 1777,1784
private static DateTimeFormatter monthElement() { [EOL]     if (mye == null) { [EOL]         return new DateTimeFormatterBuilder().appendLiteral('-').appendMonthOfYear(2).toFormatter(); [EOL]     } [EOL]     return mye; [EOL] } <line_num>: 1786,1794
private static DateTimeFormatter dayOfMonthElement() { [EOL]     if (dme == null) { [EOL]         return new DateTimeFormatterBuilder().appendLiteral('-').appendDayOfMonth(2).toFormatter(); [EOL]     } [EOL]     return dme; [EOL] } <line_num>: 1796,1804
private static DateTimeFormatter weekyearElement() { [EOL]     if (we == null) { [EOL]         return new DateTimeFormatterBuilder().appendWeekyear(4, 9).toFormatter(); [EOL]     } [EOL]     return we; [EOL] } <line_num>: 1806,1813
private static DateTimeFormatter weekElement() { [EOL]     if (wwe == null) { [EOL]         return new DateTimeFormatterBuilder().appendLiteral("-W").appendWeekOfWeekyear(2).toFormatter(); [EOL]     } [EOL]     return wwe; [EOL] } <line_num>: 1815,1823
private static DateTimeFormatter dayOfWeekElement() { [EOL]     if (dwe == null) { [EOL]         return new DateTimeFormatterBuilder().appendLiteral('-').appendDayOfWeek(1).toFormatter(); [EOL]     } [EOL]     return dwe; [EOL] } <line_num>: 1825,1833
private static DateTimeFormatter dayOfYearElement() { [EOL]     if (dye == null) { [EOL]         return new DateTimeFormatterBuilder().appendLiteral('-').appendDayOfYear(3).toFormatter(); [EOL]     } [EOL]     return dye; [EOL] } <line_num>: 1835,1843
private static DateTimeFormatter literalTElement() { [EOL]     if (lte == null) { [EOL]         return new DateTimeFormatterBuilder().appendLiteral('T').toFormatter(); [EOL]     } [EOL]     return lte; [EOL] } <line_num>: 1845,1852
private static DateTimeFormatter hourElement() { [EOL]     if (hde == null) { [EOL]         return new DateTimeFormatterBuilder().appendHourOfDay(2).toFormatter(); [EOL]     } [EOL]     return hde; [EOL] } <line_num>: 1854,1861
private static DateTimeFormatter minuteElement() { [EOL]     if (mhe == null) { [EOL]         return new DateTimeFormatterBuilder().appendLiteral(':').appendMinuteOfHour(2).toFormatter(); [EOL]     } [EOL]     return mhe; [EOL] } <line_num>: 1863,1871
private static DateTimeFormatter secondElement() { [EOL]     if (sme == null) { [EOL]         return new DateTimeFormatterBuilder().appendLiteral(':').appendSecondOfMinute(2).toFormatter(); [EOL]     } [EOL]     return sme; [EOL] } <line_num>: 1873,1881
private static DateTimeFormatter fractionElement() { [EOL]     if (fse == null) { [EOL]         return new DateTimeFormatterBuilder().appendLiteral('.').appendFractionOfSecond(3, 9).toFormatter(); [EOL]     } [EOL]     return fse; [EOL] } <line_num>: 1883,1893
private static DateTimeFormatter offsetElement() { [EOL]     if (ze == null) { [EOL]         return new DateTimeFormatterBuilder().appendTimeZoneOffset("Z", true, 2, 4).toFormatter(); [EOL]     } [EOL]     return ze; [EOL] } <line_num>: 1895,1902
