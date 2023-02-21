public ExceptionUtils() { [EOL]     super(); [EOL] } <line_num>: 75,77
@Deprecated [EOL] public static String[] getDefaultCauseMethodNames() { [EOL]     return ArrayUtils.clone(CAUSE_METHOD_NAMES); [EOL] } <line_num>: 89,92
@Deprecated [EOL] public static Throwable getCause(final Throwable throwable) { [EOL]     return getCause(throwable, CAUSE_METHOD_NAMES); [EOL] } <line_num>: 122,125
@Deprecated [EOL] public static Throwable getCause(final Throwable throwable, String[] methodNames) { [EOL]     if (throwable == null) { [EOL]         return null; [EOL]     } [EOL]     if (methodNames == null) { [EOL]         methodNames = CAUSE_METHOD_NAMES; [EOL]     } [EOL]     for (final String methodName : methodNames) { [EOL]         if (methodName != null) { [EOL]             final Throwable cause = getCauseUsingMethodName(throwable, methodName); [EOL]             if (cause != null) { [EOL]                 return cause; [EOL]             } [EOL]         } [EOL]     } [EOL]     return null; [EOL] } <line_num>: 140,160
public static Throwable getRootCause(final Throwable throwable) { [EOL]     final List<Throwable> list = getThrowableList(throwable); [EOL]     return list.size() < 2 ? null : (Throwable) list.get(list.size() - 1); [EOL] } <line_num>: 179,182
private static Throwable getCauseUsingMethodName(final Throwable throwable, final String methodName) { [EOL]     Method method = null; [EOL]     try { [EOL]         method = throwable.getClass().getMethod(methodName); [EOL]     } catch (final NoSuchMethodException ignored) { [EOL]     } catch (final SecurityException ignored) { [EOL]     } [EOL]     if (method != null && Throwable.class.isAssignableFrom(method.getReturnType())) { [EOL]         try { [EOL]             return (Throwable) method.invoke(throwable); [EOL]         } catch (final IllegalAccessException ignored) { [EOL]         } catch (final IllegalArgumentException ignored) { [EOL]         } catch (final InvocationTargetException ignored) { [EOL]         } [EOL]     } [EOL]     return null; [EOL] } <line_num>: 192,214
public static int getThrowableCount(final Throwable throwable) { [EOL]     return getThrowableList(throwable).size(); [EOL] } <line_num>: 233,235
public static Throwable[] getThrowables(final Throwable throwable) { [EOL]     final List<Throwable> list = getThrowableList(throwable); [EOL]     return list.toArray(new Throwable[list.size()]); [EOL] } <line_num>: 256,259
public static List<Throwable> getThrowableList(Throwable throwable) { [EOL]     final List<Throwable> list = new ArrayList<Throwable>(); [EOL]     while (throwable != null && list.contains(throwable) == false) { [EOL]         list.add(throwable); [EOL]         throwable = ExceptionUtils.getCause(throwable); [EOL]     } [EOL]     return list; [EOL] } <line_num>: 280,287
public static int indexOfThrowable(final Throwable throwable, final Class<?> clazz) { [EOL]     return indexOf(throwable, clazz, 0, false); [EOL] } <line_num>: 304,306
public static int indexOfThrowable(final Throwable throwable, final Class<?> clazz, final int fromIndex) { [EOL]     return indexOf(throwable, clazz, fromIndex, false); [EOL] } <line_num>: 327,329
public static int indexOfType(final Throwable throwable, final Class<?> type) { [EOL]     return indexOf(throwable, type, 0, true); [EOL] } <line_num>: 347,349
public static int indexOfType(final Throwable throwable, final Class<?> type, final int fromIndex) { [EOL]     return indexOf(throwable, type, fromIndex, true); [EOL] } <line_num>: 371,373
private static int indexOf(final Throwable throwable, final Class<?> type, int fromIndex, final boolean subclass) { [EOL]     if (throwable == null || type == null) { [EOL]         return -1; [EOL]     } [EOL]     if (fromIndex < 0) { [EOL]         fromIndex = 0; [EOL]     } [EOL]     final Throwable[] throwables = ExceptionUtils.getThrowables(throwable); [EOL]     if (fromIndex >= throwables.length) { [EOL]         return -1; [EOL]     } [EOL]     if (subclass) { [EOL]         for (int i = fromIndex; i < throwables.length; i++) { [EOL]             if (type.isAssignableFrom(throwables[i].getClass())) { [EOL]                 return i; [EOL]             } [EOL]         } [EOL]     } else { [EOL]         for (int i = fromIndex; i < throwables.length; i++) { [EOL]             if (type.equals(throwables[i].getClass())) { [EOL]                 return i; [EOL]             } [EOL]         } [EOL]     } [EOL]     return -1; [EOL] } <line_num>: 386,411
public static void printRootCauseStackTrace(final Throwable throwable) { [EOL]     printRootCauseStackTrace(throwable, System.err); [EOL] } <line_num>: 432,434
public static void printRootCauseStackTrace(final Throwable throwable, final PrintStream stream) { [EOL]     if (throwable == null) { [EOL]         return; [EOL]     } [EOL]     if (stream == null) { [EOL]         throw new IllegalArgumentException("The PrintStream must not be null"); [EOL]     } [EOL]     final String[] trace = getRootCauseStackTrace(throwable); [EOL]     for (final String element : trace) { [EOL]         stream.println(element); [EOL]     } [EOL]     stream.flush(); [EOL] } <line_num>: 455,467
public static void printRootCauseStackTrace(final Throwable throwable, final PrintWriter writer) { [EOL]     if (throwable == null) { [EOL]         return; [EOL]     } [EOL]     if (writer == null) { [EOL]         throw new IllegalArgumentException("The PrintWriter must not be null"); [EOL]     } [EOL]     final String[] trace = getRootCauseStackTrace(throwable); [EOL]     for (final String element : trace) { [EOL]         writer.println(element); [EOL]     } [EOL]     writer.flush(); [EOL] } <line_num>: 488,500
public static String[] getRootCauseStackTrace(final Throwable throwable) { [EOL]     if (throwable == null) { [EOL]         return ArrayUtils.EMPTY_STRING_ARRAY; [EOL]     } [EOL]     final Throwable[] throwables = getThrowables(throwable); [EOL]     final int count = throwables.length; [EOL]     final List<String> frames = new ArrayList<String>(); [EOL]     List<String> nextTrace = getStackFrameList(throwables[count - 1]); [EOL]     for (int i = count; --i >= 0; ) { [EOL]         final List<String> trace = nextTrace; [EOL]         if (i != 0) { [EOL]             nextTrace = getStackFrameList(throwables[i - 1]); [EOL]             removeCommonFrames(trace, nextTrace); [EOL]         } [EOL]         if (i == count - 1) { [EOL]             frames.add(throwables[i].toString()); [EOL]         } else { [EOL]             frames.add(WRAPPED_MARKER + throwables[i].toString()); [EOL]         } [EOL]         for (int j = 0; j < trace.size(); j++) { [EOL]             frames.add(trace.get(j)); [EOL]         } [EOL]     } [EOL]     return frames.toArray(new String[frames.size()]); [EOL] } <line_num>: 516,540
public static void removeCommonFrames(final List<String> causeFrames, final List<String> wrapperFrames) { [EOL]     if (causeFrames == null || wrapperFrames == null) { [EOL]         throw new IllegalArgumentException("The List must not be null"); [EOL]     } [EOL]     int causeFrameIndex = causeFrames.size() - 1; [EOL]     int wrapperFrameIndex = wrapperFrames.size() - 1; [EOL]     while (causeFrameIndex >= 0 && wrapperFrameIndex >= 0) { [EOL]         final String causeFrame = causeFrames.get(causeFrameIndex); [EOL]         final String wrapperFrame = wrapperFrames.get(wrapperFrameIndex); [EOL]         if (causeFrame.equals(wrapperFrame)) { [EOL]             causeFrames.remove(causeFrameIndex); [EOL]         } [EOL]         causeFrameIndex--; [EOL]         wrapperFrameIndex--; [EOL]     } [EOL] } <line_num>: 550,567
public static String getStackTrace(final Throwable throwable) { [EOL]     final StringWriter sw = new StringWriter(); [EOL]     final PrintWriter pw = new PrintWriter(sw, true); [EOL]     throwable.printStackTrace(pw); [EOL]     return sw.getBuffer().toString(); [EOL] } <line_num>: 582,587
public static String[] getStackFrames(final Throwable throwable) { [EOL]     if (throwable == null) { [EOL]         return ArrayUtils.EMPTY_STRING_ARRAY; [EOL]     } [EOL]     return getStackFrames(getStackTrace(throwable)); [EOL] } <line_num>: 602,607
static String[] getStackFrames(final String stackTrace) { [EOL]     final String linebreak = SystemUtils.LINE_SEPARATOR; [EOL]     final StringTokenizer frames = new StringTokenizer(stackTrace, linebreak); [EOL]     final List<String> list = new ArrayList<String>(); [EOL]     while (frames.hasMoreTokens()) { [EOL]         list.add(frames.nextToken()); [EOL]     } [EOL]     return list.toArray(new String[list.size()]); [EOL] } <line_num>: 618,626
static List<String> getStackFrameList(final Throwable t) { [EOL]     final String stackTrace = getStackTrace(t); [EOL]     final String linebreak = SystemUtils.LINE_SEPARATOR; [EOL]     final StringTokenizer frames = new StringTokenizer(stackTrace, linebreak); [EOL]     final List<String> list = new ArrayList<String>(); [EOL]     boolean traceStarted = false; [EOL]     while (frames.hasMoreTokens()) { [EOL]         final String token = frames.nextToken(); [EOL]         final int at = token.indexOf("at"); [EOL]         if (at != -1 && token.substring(0, at).trim().isEmpty()) { [EOL]             traceStarted = true; [EOL]             list.add(token); [EOL]         } else if (traceStarted) { [EOL]             break; [EOL]         } [EOL]     } [EOL]     return list; [EOL] } <line_num>: 640,658
public static String getMessage(final Throwable th) { [EOL]     if (th == null) { [EOL]         return ""; [EOL]     } [EOL]     final String clsName = ClassUtils.getShortClassName(th, null); [EOL]     final String msg = th.getMessage(); [EOL]     return clsName + ": " + StringUtils.defaultString(msg); [EOL] } <line_num>: 671,678
public static String getRootCauseMessage(final Throwable th) { [EOL]     Throwable root = ExceptionUtils.getRootCause(th); [EOL]     root = root == null ? th : root; [EOL]     return getMessage(root); [EOL] } <line_num>: 691,695
