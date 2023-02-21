protected SerialDate() { [EOL] } <line_num>: 210,211
public static boolean isValidWeekdayCode(final int code) { [EOL]     switch(code) { [EOL]         case SUNDAY: [EOL]         case MONDAY: [EOL]         case TUESDAY: [EOL]         case WEDNESDAY: [EOL]         case THURSDAY: [EOL]         case FRIDAY: [EOL]         case SATURDAY: [EOL]             return true; [EOL]         default: [EOL]             return false; [EOL]     } [EOL] } <line_num>: 222,237
public static int stringToWeekdayCode(String s) { [EOL]     final String[] shortWeekdayNames = DATE_FORMAT_SYMBOLS.getShortWeekdays(); [EOL]     final String[] weekDayNames = DATE_FORMAT_SYMBOLS.getWeekdays(); [EOL]     int result = -1; [EOL]     s = s.trim(); [EOL]     for (int i = 0; i < weekDayNames.length; i++) { [EOL]         if (s.equals(shortWeekdayNames[i])) { [EOL]             result = i; [EOL]             break; [EOL]         } [EOL]         if (s.equals(weekDayNames[i])) { [EOL]             result = i; [EOL]             break; [EOL]         } [EOL]     } [EOL]     return result; [EOL] } <line_num>: 247,267
public static String weekdayCodeToString(final int weekday) { [EOL]     final String[] weekdays = DATE_FORMAT_SYMBOLS.getWeekdays(); [EOL]     return weekdays[weekday]; [EOL] } <line_num>: 278,283
public static String[] getMonths() { [EOL]     return getMonths(false); [EOL] } <line_num>: 290,294
public static String[] getMonths(final boolean shortened) { [EOL]     if (shortened) { [EOL]         return DATE_FORMAT_SYMBOLS.getShortMonths(); [EOL]     } else { [EOL]         return DATE_FORMAT_SYMBOLS.getMonths(); [EOL]     } [EOL] } <line_num>: 304,313
public static boolean isValidMonthCode(final int code) { [EOL]     switch(code) { [EOL]         case JANUARY: [EOL]         case FEBRUARY: [EOL]         case MARCH: [EOL]         case APRIL: [EOL]         case MAY: [EOL]         case JUNE: [EOL]         case JULY: [EOL]         case AUGUST: [EOL]         case SEPTEMBER: [EOL]         case OCTOBER: [EOL]         case NOVEMBER: [EOL]         case DECEMBER: [EOL]             return true; [EOL]         default: [EOL]             return false; [EOL]     } [EOL] } <line_num>: 323,343
public static int monthCodeToQuarter(final int code) { [EOL]     switch(code) { [EOL]         case JANUARY: [EOL]         case FEBRUARY: [EOL]         case MARCH: [EOL]             return 1; [EOL]         case APRIL: [EOL]         case MAY: [EOL]         case JUNE: [EOL]             return 2; [EOL]         case JULY: [EOL]         case AUGUST: [EOL]         case SEPTEMBER: [EOL]             return 3; [EOL]         case OCTOBER: [EOL]         case NOVEMBER: [EOL]         case DECEMBER: [EOL]             return 4; [EOL]         default: [EOL]             throw new IllegalArgumentException("SerialDate.monthCodeToQuarter: invalid month code."); [EOL]     } [EOL] } <line_num>: 352,371
public static String monthCodeToString(final int month) { [EOL]     return monthCodeToString(month, false); [EOL] } <line_num>: 383,387
public static String monthCodeToString(final int month, final boolean shortened) { [EOL]     if (!isValidMonthCode(month)) { [EOL]         throw new IllegalArgumentException("SerialDate.monthCodeToString: month outside valid range."); [EOL]     } [EOL]     final String[] months; [EOL]     if (shortened) { [EOL]         months = DATE_FORMAT_SYMBOLS.getShortMonths(); [EOL]     } else { [EOL]         months = DATE_FORMAT_SYMBOLS.getMonths(); [EOL]     } [EOL]     return months[month - 1]; [EOL] } <line_num>: 401,421
public static int stringToMonthCode(String s) { [EOL]     final String[] shortMonthNames = DATE_FORMAT_SYMBOLS.getShortMonths(); [EOL]     final String[] monthNames = DATE_FORMAT_SYMBOLS.getMonths(); [EOL]     int result = -1; [EOL]     s = s.trim(); [EOL]     try { [EOL]         result = Integer.parseInt(s); [EOL]     } catch (NumberFormatException e) { [EOL]     } [EOL]     if ((result < 1) || (result > 12)) { [EOL]         for (int i = 0; i < monthNames.length; i++) { [EOL]             if (s.equals(shortMonthNames[i])) { [EOL]                 result = i + 1; [EOL]                 break; [EOL]             } [EOL]             if (s.equals(monthNames[i])) { [EOL]                 result = i + 1; [EOL]                 break; [EOL]             } [EOL]         } [EOL]     } [EOL]     return result; [EOL] } <line_num>: 435,467
public static boolean isValidWeekInMonthCode(final int code) { [EOL]     switch(code) { [EOL]         case FIRST_WEEK_IN_MONTH: [EOL]         case SECOND_WEEK_IN_MONTH: [EOL]         case THIRD_WEEK_IN_MONTH: [EOL]         case FOURTH_WEEK_IN_MONTH: [EOL]         case LAST_WEEK_IN_MONTH: [EOL]             return true; [EOL]         default: [EOL]             return false; [EOL]     } [EOL] } <line_num>: 477,488
public static boolean isLeapYear(final int yyyy) { [EOL]     if ((yyyy % 4) != 0) { [EOL]         return false; [EOL]     } else if ((yyyy % 400) == 0) { [EOL]         return true; [EOL]     } else if ((yyyy % 100) == 0) { [EOL]         return false; [EOL]     } else { [EOL]         return true; [EOL]     } [EOL] } <line_num>: 497,512
public static int leapYearCount(final int yyyy) { [EOL]     final int leap4 = (yyyy - 1896) / 4; [EOL]     final int leap100 = (yyyy - 1800) / 100; [EOL]     final int leap400 = (yyyy - 1600) / 400; [EOL]     return leap4 - leap100 + leap400; [EOL] } <line_num>: 524,531
public static int lastDayOfMonth(final int month, final int yyyy) { [EOL]     final int result = LAST_DAY_OF_MONTH[month]; [EOL]     if (month != FEBRUARY) { [EOL]         return result; [EOL]     } else if (isLeapYear(yyyy)) { [EOL]         return result + 1; [EOL]     } else { [EOL]         return result; [EOL]     } [EOL] } <line_num>: 542,555
public static SerialDate addDays(final int days, final SerialDate base) { [EOL]     final int serialDayNumber = base.toSerial() + days; [EOL]     return SerialDate.createInstance(serialDayNumber); [EOL] } <line_num>: 566,571
public static SerialDate addMonths(final int months, final SerialDate base) { [EOL]     final int yy = (12 * base.getYYYY() + base.getMonth() + months - 1) / 12; [EOL]     final int mm = (12 * base.getYYYY() + base.getMonth() + months - 1) % 12 + 1; [EOL]     final int dd = Math.min(base.getDayOfMonth(), SerialDate.lastDayOfMonth(mm, yy)); [EOL]     return SerialDate.createInstance(dd, mm, yy); [EOL] } <line_num>: 585,597
public static SerialDate addYears(final int years, final SerialDate base) { [EOL]     final int baseY = base.getYYYY(); [EOL]     final int baseM = base.getMonth(); [EOL]     final int baseD = base.getDayOfMonth(); [EOL]     final int targetY = baseY + years; [EOL]     final int targetD = Math.min(baseD, SerialDate.lastDayOfMonth(baseM, targetY)); [EOL]     return SerialDate.createInstance(targetD, baseM, targetY); [EOL] } <line_num>: 608,621
public static SerialDate getPreviousDayOfWeek(final int targetWeekday, final SerialDate base) { [EOL]     if (!SerialDate.isValidWeekdayCode(targetWeekday)) { [EOL]         throw new IllegalArgumentException("Invalid day-of-the-week code."); [EOL]     } [EOL]     final int adjust; [EOL]     final int baseDOW = base.getDayOfWeek(); [EOL]     if (baseDOW > targetWeekday) { [EOL]         adjust = Math.min(0, targetWeekday - baseDOW); [EOL]     } else { [EOL]         adjust = -7 + Math.max(0, targetWeekday - baseDOW); [EOL]     } [EOL]     return SerialDate.addDays(adjust, base); [EOL] } <line_num>: 633,655
public static SerialDate getFollowingDayOfWeek(final int targetWeekday, final SerialDate base) { [EOL]     if (!SerialDate.isValidWeekdayCode(targetWeekday)) { [EOL]         throw new IllegalArgumentException("Invalid day-of-the-week code."); [EOL]     } [EOL]     final int adjust; [EOL]     final int baseDOW = base.getDayOfWeek(); [EOL]     if (baseDOW > targetWeekday) { [EOL]         adjust = 7 + Math.min(0, targetWeekday - baseDOW); [EOL]     } else { [EOL]         adjust = Math.max(0, targetWeekday - baseDOW); [EOL]     } [EOL]     return SerialDate.addDays(adjust, base); [EOL] } <line_num>: 667,688
public static SerialDate getNearestDayOfWeek(final int targetDOW, final SerialDate base) { [EOL]     if (!SerialDate.isValidWeekdayCode(targetDOW)) { [EOL]         throw new IllegalArgumentException("Invalid day-of-the-week code."); [EOL]     } [EOL]     final int baseDOW = base.getDayOfWeek(); [EOL]     int adjust = -Math.abs(targetDOW - baseDOW); [EOL]     if (adjust >= 4) { [EOL]         adjust = 7 - adjust; [EOL]     } [EOL]     if (adjust <= -4) { [EOL]         adjust = 7 + adjust; [EOL]     } [EOL]     return SerialDate.addDays(adjust, base); [EOL] } <line_num>: 700,721
public SerialDate getEndOfCurrentMonth(final SerialDate base) { [EOL]     final int last = SerialDate.lastDayOfMonth(base.getMonth(), base.getYYYY()); [EOL]     return SerialDate.createInstance(last, base.getMonth(), base.getYYYY()); [EOL] } <line_num>: 730,735
public static String weekInMonthToString(final int count) { [EOL]     switch(count) { [EOL]         case SerialDate.FIRST_WEEK_IN_MONTH: [EOL]             return "First"; [EOL]         case SerialDate.SECOND_WEEK_IN_MONTH: [EOL]             return "Second"; [EOL]         case SerialDate.THIRD_WEEK_IN_MONTH: [EOL]             return "Third"; [EOL]         case SerialDate.FOURTH_WEEK_IN_MONTH: [EOL]             return "Fourth"; [EOL]         case SerialDate.LAST_WEEK_IN_MONTH: [EOL]             return "Last"; [EOL]         default: [EOL]             return "SerialDate.weekInMonthToString(): invalid code."; [EOL]     } [EOL] } <line_num>: 746,758
public static String relativeToString(final int relative) { [EOL]     switch(relative) { [EOL]         case SerialDate.PRECEDING: [EOL]             return "Preceding"; [EOL]         case SerialDate.NEAREST: [EOL]             return "Nearest"; [EOL]         case SerialDate.FOLLOWING: [EOL]             return "Following"; [EOL]         default: [EOL]             return "ERROR : Relative To String"; [EOL]     } [EOL] } <line_num>: 769,778
public static SerialDate createInstance(final int day, final int month, final int yyyy) { [EOL]     return new SpreadsheetDate(day, month, yyyy); [EOL] } <line_num>: 790,793
public static SerialDate createInstance(final int serial) { [EOL]     return new SpreadsheetDate(serial); [EOL] } <line_num>: 803,805
public static SerialDate createInstance(final java.util.Date date) { [EOL]     final GregorianCalendar calendar = new GregorianCalendar(); [EOL]     calendar.setTime(date); [EOL]     return new SpreadsheetDate(calendar.get(Calendar.DATE), calendar.get(Calendar.MONTH) + 1, calendar.get(Calendar.YEAR)); [EOL] } <line_num>: 814,822
public abstract int toSerial(); <line_num>: 831,831
public abstract java.util.Date toDate(); <line_num>: 839,839
public String getDescription() { [EOL]     return this.description; [EOL] } <line_num>: 848,850
public void setDescription(final String description) { [EOL]     this.description = description; [EOL] } <line_num>: 858,860
public String toString() { [EOL]     return getDayOfMonth() + "-" + SerialDate.monthCodeToString(getMonth()) + "-" + getYYYY(); [EOL] } <line_num>: 867,870
public abstract int getYYYY(); <line_num>: 877,877
public abstract int getMonth(); <line_num>: 884,884
public abstract int getDayOfMonth(); <line_num>: 891,891
public abstract int getDayOfWeek(); <line_num>: 898,898
public abstract int compare(SerialDate other); <line_num>: 911,911
public abstract boolean isOn(SerialDate other); <line_num>: 922,922
public abstract boolean isBefore(SerialDate other); <line_num>: 933,933
public abstract boolean isOnOrBefore(SerialDate other); <line_num>: 944,944
public abstract boolean isAfter(SerialDate other); <line_num>: 955,955
public abstract boolean isOnOrAfter(SerialDate other); <line_num>: 966,966
public abstract boolean isInRange(SerialDate d1, SerialDate d2); <line_num>: 978,978
public abstract boolean isInRange(SerialDate d1, SerialDate d2, int include); <line_num>: 992,993
public SerialDate getPreviousDayOfWeek(final int targetDOW) { [EOL]     return getPreviousDayOfWeek(targetDOW, this); [EOL] } <line_num>: 1004,1006
public SerialDate getFollowingDayOfWeek(final int targetDOW) { [EOL]     return getFollowingDayOfWeek(targetDOW, this); [EOL] } <line_num>: 1017,1019
public SerialDate getNearestDayOfWeek(final int targetDOW) { [EOL]     return getNearestDayOfWeek(targetDOW, this); [EOL] } <line_num>: 1028,1030
