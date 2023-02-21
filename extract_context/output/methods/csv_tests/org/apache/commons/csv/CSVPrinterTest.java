@Test [EOL] public void testPrinter1() throws IOException { [EOL]     StringWriter sw = new StringWriter(); [EOL]     CSVPrinter printer = new CSVPrinter(sw, CSVFormat.DEFAULT); [EOL]     printer.println("a", "b"); [EOL]     assertEquals("a,b" + lineSeparator, sw.toString()); [EOL] } <line_num>: 33,39
@Test [EOL] public void testPrinter2() throws IOException { [EOL]     StringWriter sw = new StringWriter(); [EOL]     CSVPrinter printer = new CSVPrinter(sw, CSVFormat.DEFAULT); [EOL]     printer.println("a,b", "b"); [EOL]     assertEquals("\"a,b\",b" + lineSeparator, sw.toString()); [EOL] } <line_num>: 41,47
@Test [EOL] public void testPrinter3() throws IOException { [EOL]     StringWriter sw = new StringWriter(); [EOL]     CSVPrinter printer = new CSVPrinter(sw, CSVFormat.DEFAULT); [EOL]     printer.println("a, b", "b "); [EOL]     assertEquals("\"a, b\",\"b \"" + lineSeparator, sw.toString()); [EOL] } <line_num>: 49,55
@Test [EOL] public void testPrinter4() throws IOException { [EOL]     StringWriter sw = new StringWriter(); [EOL]     CSVPrinter printer = new CSVPrinter(sw, CSVFormat.DEFAULT); [EOL]     printer.println("a", "b\"c"); [EOL]     assertEquals("a,\"b\"\"c\"" + lineSeparator, sw.toString()); [EOL] } <line_num>: 57,63
@Test [EOL] public void testPrinter5() throws IOException { [EOL]     StringWriter sw = new StringWriter(); [EOL]     CSVPrinter printer = new CSVPrinter(sw, CSVFormat.DEFAULT); [EOL]     printer.println("a", "b\nc"); [EOL]     assertEquals("a,\"b\nc\"" + lineSeparator, sw.toString()); [EOL] } <line_num>: 65,71
@Test [EOL] public void testPrinter6() throws IOException { [EOL]     StringWriter sw = new StringWriter(); [EOL]     CSVPrinter printer = new CSVPrinter(sw, CSVFormat.DEFAULT); [EOL]     printer.println("a", "b\r\nc"); [EOL]     assertEquals("a,\"b\r\nc\"" + lineSeparator, sw.toString()); [EOL] } <line_num>: 73,79
@Test [EOL] public void testPrinter7() throws IOException { [EOL]     StringWriter sw = new StringWriter(); [EOL]     CSVPrinter printer = new CSVPrinter(sw, CSVFormat.DEFAULT); [EOL]     printer.println("a", "b\\c"); [EOL]     assertEquals("a,b\\c" + lineSeparator, sw.toString()); [EOL] } <line_num>: 81,87
@Test [EOL] public void testExcelPrinter1() throws IOException { [EOL]     StringWriter sw = new StringWriter(); [EOL]     CSVPrinter printer = new CSVPrinter(sw, CSVFormat.EXCEL); [EOL]     printer.println("a", "b"); [EOL]     assertEquals("a,b" + lineSeparator, sw.toString()); [EOL] } <line_num>: 89,95
@Test [EOL] public void testExcelPrinter2() throws IOException { [EOL]     StringWriter sw = new StringWriter(); [EOL]     CSVPrinter printer = new CSVPrinter(sw, CSVFormat.EXCEL); [EOL]     printer.println("a,b", "b"); [EOL]     assertEquals("\"a,b\",b" + lineSeparator, sw.toString()); [EOL] } <line_num>: 97,103
@Test [EOL] public void testPrintNullValues() throws IOException { [EOL]     StringWriter sw = new StringWriter(); [EOL]     CSVPrinter printer = new CSVPrinter(sw, CSVFormat.DEFAULT); [EOL]     printer.println("a", null, "b"); [EOL]     assertEquals("a,,b" + lineSeparator, sw.toString()); [EOL] } <line_num>: 105,111
@Test [EOL] public void testDisabledComment() throws IOException { [EOL]     StringWriter sw = new StringWriter(); [EOL]     CSVPrinter printer = new CSVPrinter(sw, CSVFormat.DEFAULT); [EOL]     printer.printComment("This is a comment"); [EOL]     assertEquals("", sw.toString()); [EOL] } <line_num>: 113,120
@Test [EOL] public void testSingleLineComment() throws IOException { [EOL]     StringWriter sw = new StringWriter(); [EOL]     CSVPrinter printer = new CSVPrinter(sw, CSVFormat.DEFAULT.withCommentStart('#')); [EOL]     printer.printComment("This is a comment"); [EOL]     assertEquals("# This is a comment" + lineSeparator, sw.toString()); [EOL] } <line_num>: 122,129
@Test [EOL] public void testMultiLineComment() throws IOException { [EOL]     StringWriter sw = new StringWriter(); [EOL]     CSVPrinter printer = new CSVPrinter(sw, CSVFormat.DEFAULT.withCommentStart('#')); [EOL]     printer.printComment("This is a comment\non multiple lines"); [EOL]     assertEquals("# This is a comment" + lineSeparator + "# on multiple lines" + lineSeparator, sw.toString()); [EOL] } <line_num>: 131,138
@Test [EOL] public void testRandom() throws Exception { [EOL]     int iter = 10000; [EOL]     doRandom(CSVFormat.DEFAULT, iter); [EOL]     doRandom(CSVFormat.EXCEL, iter); [EOL]     doRandom(CSVFormat.MYSQL, iter); [EOL] } <line_num>: 140,146
public void doRandom(CSVFormat format, int iter) throws Exception { [EOL]     for (int i = 0; i < iter; i++) { [EOL]         doOneRandom(format); [EOL]     } [EOL] } <line_num>: 148,152
public void doOneRandom(CSVFormat format) throws Exception { [EOL]     Random r = new Random(); [EOL]     int nLines = r.nextInt(4) + 1; [EOL]     int nCol = r.nextInt(3) + 1; [EOL]     String[][] lines = new String[nLines][]; [EOL]     for (int i = 0; i < nLines; i++) { [EOL]         String[] line = new String[nCol]; [EOL]         lines[i] = line; [EOL]         for (int j = 0; j < nCol; j++) { [EOL]             line[j] = randStr(); [EOL]         } [EOL]     } [EOL]     StringWriter sw = new StringWriter(); [EOL]     CSVPrinter printer = new CSVPrinter(sw, format); [EOL]     for (int i = 0; i < nLines; i++) { [EOL]         printer.println(lines[i]); [EOL]     } [EOL]     printer.flush(); [EOL]     String result = sw.toString(); [EOL]     CSVParser parser = new CSVParser(result, format); [EOL]     List<CSVRecord> parseResult = parser.getRecords(); [EOL]     if (!equals(lines, parseResult)) { [EOL]         System.out.println("Printer output :" + printable(result)); [EOL]         assertTrue(false); [EOL]     } [EOL] } <line_num>: 154,188
public static boolean equals(String[][] a, List<CSVRecord> b) { [EOL]     if (a.length != b.size()) { [EOL]         return false; [EOL]     } [EOL]     for (int i = 0; i < a.length; i++) { [EOL]         String[] linea = a[i]; [EOL]         String[] lineb = b.get(i).values(); [EOL]         if (linea.length != lineb.length) { [EOL]             return false; [EOL]         } [EOL]         for (int j = 0; j < linea.length; j++) { [EOL]             String aval = linea[j]; [EOL]             String bval = lineb[j]; [EOL]             if (!aval.equals(bval)) { [EOL]                 System.out.println("expected  :" + printable(aval)); [EOL]                 System.out.println("got       :" + printable(bval)); [EOL]                 return false; [EOL]             } [EOL]         } [EOL]     } [EOL]     return true; [EOL] } <line_num>: 190,211
public static String printable(String s) { [EOL]     StringBuilder sb = new StringBuilder(); [EOL]     for (int i = 0; i < s.length(); i++) { [EOL]         char ch = s.charAt(i); [EOL]         if (ch <= ' ' || ch >= 128) { [EOL]             sb.append("(").append((int) ch).append(")"); [EOL]         } else { [EOL]             sb.append(ch); [EOL]         } [EOL]     } [EOL]     return sb.toString(); [EOL] } <line_num>: 213,224
public String randStr() { [EOL]     Random r = new Random(); [EOL]     int sz = r.nextInt(20); [EOL]     char[] buf = new char[sz]; [EOL]     for (int i = 0; i < sz; i++) { [EOL]         char ch; [EOL]         int what = r.nextInt(20); [EOL]         switch(what) { [EOL]             case 0: [EOL]                 ch = '\r'; [EOL]                 break; [EOL]             case 1: [EOL]                 ch = '\n'; [EOL]                 break; [EOL]             case 2: [EOL]                 ch = '\t'; [EOL]                 break; [EOL]             case 3: [EOL]                 ch = '\f'; [EOL]                 break; [EOL]             case 4: [EOL]                 ch = ' '; [EOL]                 break; [EOL]             case 5: [EOL]                 ch = ','; [EOL]                 break; [EOL]             case 6: [EOL]                 ch = '"'; [EOL]                 break; [EOL]             case 7: [EOL]                 ch = '\''; [EOL]                 break; [EOL]             case 8: [EOL]                 ch = '\\'; [EOL]                 break; [EOL]             default: [EOL]                 ch = (char) r.nextInt(300); [EOL]                 break; [EOL]         } [EOL]         buf[i] = ch; [EOL]     } [EOL]     return new String(buf); [EOL] } <line_num>: 226,272
