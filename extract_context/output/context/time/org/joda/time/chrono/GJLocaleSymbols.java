private GJLocaleSymbols(Locale locale)
public static GJLocaleSymbols forLocale(Locale locale)
private static String[] realignMonths(String[] months)
private static String[] realignDaysOfWeek(String[] daysOfWeek)
private static void addSymbols(TreeMap<String, Integer> map, String[] symbols, Integer[] integers)
private static void addNumerals(TreeMap<String, Integer> map, int start, int end, Integer[] integers)
private static int maxLength(String[] a)
public String eraValueToText(int value)
public int eraTextToValue(String text)
public int getEraMaxTextLength()
public String monthOfYearValueToText(int value)
public String monthOfYearValueToShortText(int value)
public int monthOfYearTextToValue(String text)
public int getMonthMaxTextLength()
public int getMonthMaxShortTextLength()
public String dayOfWeekValueToText(int value)
public String dayOfWeekValueToShortText(int value)
public int dayOfWeekTextToValue(String text)
public int getDayOfWeekMaxTextLength()
public int getDayOfWeekMaxShortTextLength()
public String halfdayValueToText(int value)
public int halfdayTextToValue(String text)
public int getHalfdayMaxTextLength()
int FAST_CACHE_SIZE=Optional[64]
GJLocaleSymbols[] cFastCache=Optional[new GJLocaleSymbols[FAST_CACHE_SIZE]]
WeakHashMap<Locale, GJLocaleSymbols> cCache=Optional[new WeakHashMap<Locale, GJLocaleSymbols>()]
WeakReference<Locale> iLocale
String[] iEras
String[] iDaysOfWeek
String[] iShortDaysOfWeek
String[] iMonths
String[] iShortMonths
String[] iHalfday
TreeMap<String, Integer> iParseEras
TreeMap<String, Integer> iParseDaysOfWeek
TreeMap<String, Integer> iParseMonths
int iMaxEraLength
int iMaxDayOfWeekLength
int iMaxShortDayOfWeekLength
int iMaxMonthLength
int iMaxShortMonthLength
int iMaxHalfdayLength
