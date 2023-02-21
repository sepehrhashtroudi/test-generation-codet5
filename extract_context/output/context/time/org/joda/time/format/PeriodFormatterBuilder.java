public PeriodFormatterBuilder()
 SimpleAffix(String text)
 PluralAffix(String singularText, String pluralText)
 CompositeAffix(PeriodFieldAffix left, PeriodFieldAffix right)
 FieldFormatter(int minPrintedDigits, int printZeroSetting, int maxParsedDigits, boolean rejectSignedValues, int fieldType, FieldFormatter[] fieldFormatters, PeriodFieldAffix prefix, PeriodFieldAffix suffix)
 FieldFormatter(FieldFormatter field, PeriodFieldAffix suffix)
 Literal(String text)
 Separator(String text, String finalText, String[] variants, PeriodPrinter beforePrinter, PeriodParser beforeParser, boolean useBefore, boolean useAfter)
 Composite(List<Object> elementPairs)
public PeriodFormatter toFormatter()
public PeriodPrinter toPrinter()
public PeriodParser toParser()
public void clear()
public PeriodFormatterBuilder append(PeriodFormatter formatter)
public PeriodFormatterBuilder append(PeriodPrinter printer, PeriodParser parser)
public PeriodFormatterBuilder appendLiteral(String text)
public PeriodFormatterBuilder minimumPrintedDigits(int minDigits)
public PeriodFormatterBuilder maximumParsedDigits(int maxDigits)
public PeriodFormatterBuilder rejectSignedValues(boolean v)
public PeriodFormatterBuilder printZeroRarelyLast()
public PeriodFormatterBuilder printZeroRarelyFirst()
public PeriodFormatterBuilder printZeroIfSupported()
public PeriodFormatterBuilder printZeroAlways()
public PeriodFormatterBuilder printZeroNever()
public PeriodFormatterBuilder appendPrefix(String text)
public PeriodFormatterBuilder appendPrefix(String singularText, String pluralText)
private PeriodFormatterBuilder appendPrefix(PeriodFieldAffix prefix)
public PeriodFormatterBuilder appendYears()
public PeriodFormatterBuilder appendMonths()
public PeriodFormatterBuilder appendWeeks()
public PeriodFormatterBuilder appendDays()
public PeriodFormatterBuilder appendHours()
public PeriodFormatterBuilder appendMinutes()
public PeriodFormatterBuilder appendSeconds()
public PeriodFormatterBuilder appendSecondsWithMillis()
public PeriodFormatterBuilder appendSecondsWithOptionalMillis()
public PeriodFormatterBuilder appendMillis()
public PeriodFormatterBuilder appendMillis3Digit()
private void appendField(int type)
private void appendField(int type, int minPrinted)
public PeriodFormatterBuilder appendSuffix(String text)
public PeriodFormatterBuilder appendSuffix(String singularText, String pluralText)
private PeriodFormatterBuilder appendSuffix(PeriodFieldAffix suffix)
public PeriodFormatterBuilder appendSeparator(String text)
public PeriodFormatterBuilder appendSeparatorIfFieldsAfter(String text)
public PeriodFormatterBuilder appendSeparatorIfFieldsBefore(String text)
public PeriodFormatterBuilder appendSeparator(String text, String finalText)
public PeriodFormatterBuilder appendSeparator(String text, String finalText, String[] variants)
private PeriodFormatterBuilder appendSeparator(String text, String finalText, String[] variants, boolean useBefore, boolean useAfter)
private void clearPrefix() throws IllegalStateException
private PeriodFormatterBuilder append0(PeriodPrinter printer, PeriodParser parser)
private static PeriodFormatter toFormatter(List<Object> elementPairs, boolean notPrinter, boolean notParser)
private static Object[] createComposite(List<Object> elementPairs)
 int calculatePrintedLength(int value)
 void printTo(StringBuffer buf, int value)
 void printTo(Writer out, int value) throws IOException
 int parse(String periodStr, int position)
 int scan(String periodStr, int position)
public int calculatePrintedLength(int value)
public void printTo(StringBuffer buf, int value)
public void printTo(Writer out, int value) throws IOException
public int parse(String periodStr, int position)
public int scan(String periodStr, final int position)
public int calculatePrintedLength(int value)
public void printTo(StringBuffer buf, int value)
public void printTo(Writer out, int value) throws IOException
public int parse(String periodStr, int position)
public int scan(String periodStr, final int position)
public int calculatePrintedLength(int value)
public void printTo(StringBuffer buf, int value)
public void printTo(Writer out, int value) throws IOException
public int parse(String periodStr, int position)
public int scan(String periodStr, final int position)
public int countFieldsToPrint(ReadablePeriod period, int stopAt, Locale locale)
public int calculatePrintedLength(ReadablePeriod period, Locale locale)
public void printTo(StringBuffer buf, ReadablePeriod period, Locale locale)
public void printTo(Writer out, ReadablePeriod period, Locale locale) throws IOException
public int parseInto(ReadWritablePeriod period, String text, int position, Locale locale)
private int parseInt(String text, int position, int length)
 long getFieldValue(ReadablePeriod period)
 boolean isZero(ReadablePeriod period)
 boolean isSupported(PeriodType type, int field)
 void setFieldValue(ReadWritablePeriod period, int field, int value)
 int getFieldType()
public int countFieldsToPrint(ReadablePeriod period, int stopAt, Locale locale)
public int calculatePrintedLength(ReadablePeriod period, Locale locale)
public void printTo(StringBuffer buf, ReadablePeriod period, Locale locale)
public void printTo(Writer out, ReadablePeriod period, Locale locale) throws IOException
public int parseInto(ReadWritablePeriod period, String periodStr, int position, Locale locale)
public int countFieldsToPrint(ReadablePeriod period, int stopAt, Locale locale)
public int calculatePrintedLength(ReadablePeriod period, Locale locale)
public void printTo(StringBuffer buf, ReadablePeriod period, Locale locale)
public void printTo(Writer out, ReadablePeriod period, Locale locale) throws IOException
public int parseInto(ReadWritablePeriod period, String periodStr, int position, Locale locale)
 Separator finish(PeriodPrinter afterPrinter, PeriodParser afterParser)
public int countFieldsToPrint(ReadablePeriod period, int stopAt, Locale locale)
public int calculatePrintedLength(ReadablePeriod period, Locale locale)
public void printTo(StringBuffer buf, ReadablePeriod period, Locale locale)
public void printTo(Writer out, ReadablePeriod period, Locale locale) throws IOException
public int parseInto(ReadWritablePeriod period, String periodStr, int position, Locale locale)
private void decompose(List<Object> elementPairs, List<Object> printerList, List<Object> parserList)
private void addArrayToList(List<Object> list, Object[] array)
int PRINT_ZERO_RARELY_FIRST=Optional[1]
int PRINT_ZERO_RARELY_LAST=Optional[2]
int PRINT_ZERO_IF_SUPPORTED=Optional[3]
int PRINT_ZERO_ALWAYS=Optional[4]
int PRINT_ZERO_NEVER=Optional[5]
int YEARS=Optional[0]
int MONTHS=Optional[1]
int WEEKS=Optional[2]
int DAYS=Optional[3]
int HOURS=Optional[4]
int MINUTES=Optional[5]
int SECONDS=Optional[6]
int MILLIS=Optional[7]
int SECONDS_MILLIS=Optional[8]
int SECONDS_OPTIONAL_MILLIS=Optional[9]
int MAX_FIELD=Optional[SECONDS_OPTIONAL_MILLIS]
int iMinPrintedDigits
int iPrintZeroSetting
int iMaxParsedDigits
boolean iRejectSignedValues
PeriodFieldAffix iPrefix
List<Object> iElementPairs
boolean iNotPrinter
boolean iNotParser
FieldFormatter[] iFieldFormatters
