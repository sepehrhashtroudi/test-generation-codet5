 Tracer(@Nullable String type, @Nullable String comment)
 Tracer(String comment)
 Event(boolean start, Tracer t)
 long currentTimeMillis()
public long currentTimeMillis()
 static Tracer shortName(Object object, String comment)
private static String longToPaddedString(long v, int digits_column_width)
private static int numDigits(long n)
 static void appendSpaces(StringBuilder sb, int numSpaces)
 static int addTracingStatistic(TracingStatistic tracingStatistic)
 static void clearTracingStatisticsTestingOnly()
 long stop(int silence_threshold)
 long stop()
public String toString()
 static void setDefaultSilenceThreshold(int threshold)
 static void initCurrentThreadTrace()
 static void initCurrentThreadTrace(int default_silence_threshold)
 static String getCurrentThreadTraceReport()
 static void logCurrentThreadTrace()
 static void clearCurrentThreadTrace()
 static void logAndClearCurrentThreadTrace()
 static void setPrettyPrint(boolean enabled)
 int getCount()
 int getSilentCount()
 int getTotalTime()
 int getExtraInfo(int index)
 static synchronized void enableTypeMaps()
 static Map<String, Long> getTypeToCountMap()
 static Map<String, Long> getTypeToSilentMap()
 static Map<String, Long> getTypeToTimeMap()
 static Stat getStatsForType(String type)
private static String formatTime(long time)
 long eventTime()
 String toString(long prevEventTime, String indent, int digitsColWidth)
 void init()
 boolean isInitialized()
 void startEvent(Tracer t)
 void endEvent(Tracer t, int silenceThreshold)
 boolean isEmpty()
 void truncateOutstandingEvents()
 void truncateEvents()
public String toString()
private int getMaxDigits()
 static ThreadTrace getThreadTrace()
 static void clearThreadTrace()
 long start(Thread thread)
 long stop(Thread thread)
 boolean enable()
 AtomicTracerStatMap getTracingStat()
 String getUnits()
 void incrementBy(String key, long delta)
 Map<String, Long> getMap()
