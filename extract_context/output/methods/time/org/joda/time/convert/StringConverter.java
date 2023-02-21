protected StringConverter() { [EOL]     super(); [EOL] } <line_num>: 49,51
public long getInstantMillis(Object object, Chronology chrono) { [EOL]     String str = (String) object; [EOL]     DateTimeFormatter p = ISODateTimeFormat.dateTimeParser(); [EOL]     return p.withChronology(chrono).parseMillis(str); [EOL] } <line_num>: 62,66
public int[] getPartialValues(ReadablePartial fieldSource, Object object, Chronology chrono, DateTimeFormatter parser) { [EOL]     if (parser.getZone() != null) { [EOL]         chrono = chrono.withZone(parser.getZone()); [EOL]     } [EOL]     long millis = parser.withChronology(chrono).parseMillis((String) object); [EOL]     return chrono.get(fieldSource, millis); [EOL] } <line_num>: 83,89
public long getDurationMillis(Object object) { [EOL]     String original = (String) object; [EOL]     String str = original; [EOL]     int len = str.length(); [EOL]     if (len >= 4 && (str.charAt(0) == 'P' || str.charAt(0) == 'p') && (str.charAt(1) == 'T' || str.charAt(1) == 't') && (str.charAt(len - 1) == 'S' || str.charAt(len - 1) == 's')) { [EOL]     } else { [EOL]         throw new IllegalArgumentException("Invalid format: \"" + original + '"'); [EOL]     } [EOL]     str = str.substring(2, len - 1); [EOL]     int dot = -1; [EOL]     boolean negative = false; [EOL]     for (int i = 0; i < str.length(); i++) { [EOL]         if (str.charAt(i) >= '0' && str.charAt(i) <= '9') { [EOL]         } else if (i == 0 && str.charAt(0) == '-') { [EOL]             negative = true; [EOL]         } else if (i > (negative ? 1 : 0) && str.charAt(i) == '.' && dot == -1) { [EOL]             dot = i; [EOL]         } else { [EOL]             throw new IllegalArgumentException("Invalid format: \"" + original + '"'); [EOL]         } [EOL]     } [EOL]     long millis = 0, seconds = 0; [EOL]     int firstDigit = negative ? 1 : 0; [EOL]     if (dot > 0) { [EOL]         seconds = Long.parseLong(str.substring(firstDigit, dot)); [EOL]         str = str.substring(dot + 1); [EOL]         if (str.length() != 3) { [EOL]             str = (str + "000").substring(0, 3); [EOL]         } [EOL]         millis = Integer.parseInt(str); [EOL]     } else if (negative) { [EOL]         seconds = Long.parseLong(str.substring(firstDigit, str.length())); [EOL]     } else { [EOL]         seconds = Long.parseLong(str); [EOL]     } [EOL]     if (negative) { [EOL]         return FieldUtils.safeAdd(FieldUtils.safeMultiply(-seconds, 1000), -millis); [EOL]     } else { [EOL]         return FieldUtils.safeAdd(FieldUtils.safeMultiply(seconds, 1000), millis); [EOL]     } [EOL] } <line_num>: 99,148
public void setInto(ReadWritablePeriod period, Object object, Chronology chrono) { [EOL]     String str = (String) object; [EOL]     PeriodFormatter parser = ISOPeriodFormat.standard(); [EOL]     period.clear(); [EOL]     int pos = parser.parseInto(period, str, 0); [EOL]     if (pos < str.length()) { [EOL]         if (pos < 0) { [EOL]             parser.withParseType(period.getPeriodType()).parseMutablePeriod(str); [EOL]         } [EOL]         throw new IllegalArgumentException("Invalid format: \"" + str + '"'); [EOL]     } [EOL] } <line_num>: 161,173
public void setInto(ReadWritableInterval writableInterval, Object object, Chronology chrono) { [EOL]     String str = (String) object; [EOL]     int separator = str.indexOf('/'); [EOL]     if (separator < 0) { [EOL]         throw new IllegalArgumentException("Format requires a '/' separator: " + str); [EOL]     } [EOL]     String leftStr = str.substring(0, separator); [EOL]     if (leftStr.length() <= 0) { [EOL]         throw new IllegalArgumentException("Format invalid: " + str); [EOL]     } [EOL]     String rightStr = str.substring(separator + 1); [EOL]     if (rightStr.length() <= 0) { [EOL]         throw new IllegalArgumentException("Format invalid: " + str); [EOL]     } [EOL]     DateTimeFormatter dateTimeParser = ISODateTimeFormat.dateTimeParser(); [EOL]     dateTimeParser = dateTimeParser.withChronology(chrono); [EOL]     PeriodFormatter periodParser = ISOPeriodFormat.standard(); [EOL]     long startInstant = 0, endInstant = 0; [EOL]     Period period = null; [EOL]     Chronology parsedChrono = null; [EOL]     char c = leftStr.charAt(0); [EOL]     if (c == 'P' || c == 'p') { [EOL]         period = periodParser.withParseType(getPeriodType(leftStr)).parsePeriod(leftStr); [EOL]     } else { [EOL]         DateTime start = dateTimeParser.parseDateTime(leftStr); [EOL]         startInstant = start.getMillis(); [EOL]         parsedChrono = start.getChronology(); [EOL]     } [EOL]     c = rightStr.charAt(0); [EOL]     if (c == 'P' || c == 'p') { [EOL]         if (period != null) { [EOL]             throw new IllegalArgumentException("Interval composed of two durations: " + str); [EOL]         } [EOL]         period = periodParser.withParseType(getPeriodType(rightStr)).parsePeriod(rightStr); [EOL]         chrono = (chrono != null ? chrono : parsedChrono); [EOL]         endInstant = chrono.add(period, startInstant, 1); [EOL]     } else { [EOL]         DateTime end = dateTimeParser.parseDateTime(rightStr); [EOL]         endInstant = end.getMillis(); [EOL]         parsedChrono = (parsedChrono != null ? parsedChrono : end.getChronology()); [EOL]         chrono = (chrono != null ? chrono : parsedChrono); [EOL]         if (period != null) { [EOL]             startInstant = chrono.add(period, endInstant, -1); [EOL]         } [EOL]     } [EOL]     writableInterval.setInterval(startInstant, endInstant); [EOL]     writableInterval.setChronology(chrono); [EOL] } <line_num>: 183,238
public Class<?> getSupportedType() { [EOL]     return String.class; [EOL] } <line_num>: 246,248
