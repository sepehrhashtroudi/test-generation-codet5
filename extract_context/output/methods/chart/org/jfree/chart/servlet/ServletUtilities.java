public static String getTempFilePrefix() { [EOL]     return ServletUtilities.tempFilePrefix; [EOL] } <line_num>: 93,95
public static void setTempFilePrefix(String prefix) { [EOL]     if (prefix == null) { [EOL]         throw new IllegalArgumentException("Null 'prefix' argument."); [EOL]     } [EOL]     ServletUtilities.tempFilePrefix = prefix; [EOL] } <line_num>: 102,107
public static String getTempOneTimeFilePrefix() { [EOL]     return ServletUtilities.tempOneTimeFilePrefix; [EOL] } <line_num>: 115,117
public static void setTempOneTimeFilePrefix(String prefix) { [EOL]     if (prefix == null) { [EOL]         throw new IllegalArgumentException("Null 'prefix' argument."); [EOL]     } [EOL]     ServletUtilities.tempOneTimeFilePrefix = prefix; [EOL] } <line_num>: 125,130
public static String saveChartAsPNG(JFreeChart chart, int width, int height, HttpSession session) throws IOException { [EOL]     return ServletUtilities.saveChartAsPNG(chart, width, height, null, session); [EOL] } <line_num>: 147,153
public static String saveChartAsPNG(JFreeChart chart, int width, int height, ChartRenderingInfo info, HttpSession session) throws IOException { [EOL]     if (chart == null) { [EOL]         throw new IllegalArgumentException("Null 'chart' argument."); [EOL]     } [EOL]     ServletUtilities.createTempDir(); [EOL]     String prefix = ServletUtilities.tempFilePrefix; [EOL]     if (session == null) { [EOL]         prefix = ServletUtilities.tempOneTimeFilePrefix; [EOL]     } [EOL]     File tempFile = File.createTempFile(prefix, ".png", new File(System.getProperty("java.io.tmpdir"))); [EOL]     ChartUtilities.saveChartAsPNG(tempFile, chart, width, height, info); [EOL]     if (session != null) { [EOL]         ServletUtilities.registerChartForDeletion(tempFile, session); [EOL]     } [EOL]     return tempFile.getName(); [EOL] } <line_num>: 174,193
public static String saveChartAsJPEG(JFreeChart chart, int width, int height, HttpSession session) throws IOException { [EOL]     return ServletUtilities.saveChartAsJPEG(chart, width, height, null, session); [EOL] } <line_num>: 215,222
public static String saveChartAsJPEG(JFreeChart chart, int width, int height, ChartRenderingInfo info, HttpSession session) throws IOException { [EOL]     if (chart == null) { [EOL]         throw new IllegalArgumentException("Null 'chart' argument."); [EOL]     } [EOL]     ServletUtilities.createTempDir(); [EOL]     String prefix = ServletUtilities.tempFilePrefix; [EOL]     if (session == null) { [EOL]         prefix = ServletUtilities.tempOneTimeFilePrefix; [EOL]     } [EOL]     File tempFile = File.createTempFile(prefix, ".jpeg", new File(System.getProperty("java.io.tmpdir"))); [EOL]     ChartUtilities.saveChartAsJPEG(tempFile, chart, width, height, info); [EOL]     if (session != null) { [EOL]         ServletUtilities.registerChartForDeletion(tempFile, session); [EOL]     } [EOL]     return tempFile.getName(); [EOL] } <line_num>: 247,268
protected static void createTempDir() { [EOL]     String tempDirName = System.getProperty("java.io.tmpdir"); [EOL]     if (tempDirName == null) { [EOL]         throw new RuntimeException("Temporary directory system property " + "(java.io.tmpdir) is null."); [EOL]     } [EOL]     File tempDir = new File(tempDirName); [EOL]     if (!tempDir.exists()) { [EOL]         tempDir.mkdirs(); [EOL]     } [EOL] } <line_num>: 279,291
protected static void registerChartForDeletion(File tempFile, HttpSession session) { [EOL]     if (session != null) { [EOL]         ChartDeleter chartDeleter = (ChartDeleter) session.getAttribute("JFreeChart_Deleter"); [EOL]         if (chartDeleter == null) { [EOL]             chartDeleter = new ChartDeleter(); [EOL]             session.setAttribute("JFreeChart_Deleter", chartDeleter); [EOL]         } [EOL]         chartDeleter.addChart(tempFile.getName()); [EOL]     } else { [EOL]         System.out.println("Session is null - chart will not be deleted"); [EOL]     } [EOL] } <line_num>: 301,317
public static void sendTempFile(String filename, HttpServletResponse response) throws IOException { [EOL]     File file = new File(System.getProperty("java.io.tmpdir"), filename); [EOL]     ServletUtilities.sendTempFile(file, response); [EOL] } <line_num>: 328,333
public static void sendTempFile(File file, HttpServletResponse response) throws IOException { [EOL]     String mimeType = null; [EOL]     String filename = file.getName(); [EOL]     if (filename.length() > 5) { [EOL]         if (filename.substring(filename.length() - 5, filename.length()).equals(".jpeg")) { [EOL]             mimeType = "image/jpeg"; [EOL]         } else if (filename.substring(filename.length() - 4, filename.length()).equals(".png")) { [EOL]             mimeType = "image/png"; [EOL]         } [EOL]     } [EOL]     ServletUtilities.sendTempFile(file, response, mimeType); [EOL] } <line_num>: 343,359
public static void sendTempFile(File file, HttpServletResponse response, String mimeType) throws IOException { [EOL]     if (file.exists()) { [EOL]         BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file)); [EOL]         if (mimeType != null) { [EOL]             response.setHeader("Content-Type", mimeType); [EOL]         } [EOL]         response.setHeader("Content-Length", String.valueOf(file.length())); [EOL]         SimpleDateFormat sdf = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z", Locale.ENGLISH); [EOL]         sdf.setTimeZone(TimeZone.getTimeZone("GMT")); [EOL]         response.setHeader("Last-Modified", sdf.format(new Date(file.lastModified()))); [EOL]         BufferedOutputStream bos = new BufferedOutputStream(response.getOutputStream()); [EOL]         byte[] input = new byte[1024]; [EOL]         boolean eof = false; [EOL]         while (!eof) { [EOL]             int length = bis.read(input); [EOL]             if (length == -1) { [EOL]                 eof = true; [EOL]             } else { [EOL]                 bos.write(input, 0, length); [EOL]             } [EOL]         } [EOL]         bos.flush(); [EOL]         bis.close(); [EOL]         bos.close(); [EOL]     } else { [EOL]         throw new FileNotFoundException(file.getAbsolutePath()); [EOL]     } [EOL]     return; [EOL] } <line_num>: 370,409
public static String searchReplace(String inputString, String searchString, String replaceString) { [EOL]     int i = inputString.indexOf(searchString); [EOL]     if (i == -1) { [EOL]         return inputString; [EOL]     } [EOL]     String r = ""; [EOL]     r += inputString.substring(0, i) + replaceString; [EOL]     if (i + searchString.length() < inputString.length()) { [EOL]         r += searchReplace(inputString.substring(i + searchString.length()), searchString, replaceString); [EOL]     } [EOL]     return r; [EOL] } <line_num>: 421,438