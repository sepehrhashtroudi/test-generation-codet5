public DurationFormatUtils()
 Token(final Object value)
 Token(final Object value, final int count)
public static String formatDurationHMS(final long durationMillis)
public static String formatDurationISO(final long durationMillis)
public static String formatDuration(final long durationMillis, final String format)
public static String formatDuration(long durationMillis, final String format, final boolean padWithZeros)
public static String formatDurationWords(final long durationMillis, final boolean suppressLeadingZeroElements, final boolean suppressTrailingZeroElements)
public static String formatPeriodISO(final long startMillis, final long endMillis)
public static String formatPeriod(final long startMillis, final long endMillis, final String format)
public static String formatPeriod(final long startMillis, final long endMillis, final String format, final boolean padWithZeros, final TimeZone timezone)
 static String format(final Token[] tokens, final int years, final int months, final int days, final int hours, final int minutes, final int seconds, int milliseconds, final boolean padWithZeros)
 static Token[] lexx(final String format)
 static boolean containsTokenWithValue(final Token[] tokens, final Object value)
 void increment()
 int getCount()
 Object getValue()
public boolean equals(final Object obj2)
public int hashCode()
public String toString()
String ISO_EXTENDED_FORMAT_PATTERN=Optional["'P'yyyy'Y'M'M'd'DT'H'H'm'M's.S'S'"]
Object y=Optional["y"]
Object M=Optional["M"]
Object d=Optional["d"]
Object H=Optional["H"]
Object m=Optional["m"]
Object s=Optional["s"]
Object S=Optional["S"]
