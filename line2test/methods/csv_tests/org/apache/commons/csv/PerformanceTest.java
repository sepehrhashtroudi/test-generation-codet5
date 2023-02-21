Stats(int c, int f) { [EOL]     count = c; [EOL]     fields = f; [EOL] } <line_num>: 110,113
public static void main(String[] args) throws Exception { [EOL]     final int argc = args.length; [EOL]     String[] tests; [EOL]     if (argc > 0) { [EOL]         max = Integer.parseInt(args[0]); [EOL]     } [EOL]     if (argc > 1) { [EOL]         tests = new String[argc - 1]; [EOL]         for (int i = 1; i < argc; i++) { [EOL]             tests[i - 1] = args[i]; [EOL]         } [EOL]     } else { [EOL]         tests = new String[] { "file", "split", "extb", "exts", "csv", "lexreset", "lexnew" }; [EOL]     } [EOL]     for (String p : PROPS) { [EOL]         System.out.println(p + "=" + System.getProperty(p)); [EOL]     } [EOL]     System.out.println("Max count: " + max + "\n"); [EOL]     for (String test : tests) { [EOL]         if ("file".equals(test)) { [EOL]             testReadBigFile(false); [EOL]         } else if ("split".equals(test)) { [EOL]             testReadBigFile(true); [EOL]         } else if ("csv".equals(test)) { [EOL]             testParseCommonsCSV(); [EOL]         } else if ("lexreset".equals(test)) { [EOL]             testCSVLexer(false, test); [EOL]         } else if ("lexnew".equals(test)) { [EOL]             testCSVLexer(true, test); [EOL]         } else if (test.startsWith("CSVLexer")) { [EOL]             testCSVLexer(false, test); [EOL]         } else if ("extb".equals(test)) { [EOL]             testExtendedBuffer(false); [EOL]         } else if ("exts".equals(test)) { [EOL]             testExtendedBuffer(true); [EOL]         } else { [EOL]             System.out.println("Invalid test name: " + test); [EOL]         } [EOL]     } [EOL] } <line_num>: 60,100
private static BufferedReader getReader() throws IOException { [EOL]     return new BufferedReader(new FileReader("worldcitiespop.txt")); [EOL] } <line_num>: 102,104
private static void show(String msg, Stats s, long start) { [EOL]     final long elapsed = System.currentTimeMillis() - start; [EOL]     System.out.printf("%-20s: %5dms " + s.count + " lines " + s.fields + " fields%n", msg, elapsed); [EOL]     elapsedTimes[num++] = elapsed; [EOL] } <line_num>: 117,121
private static void show() { [EOL]     long tot = 0; [EOL]     if (num > 1) { [EOL]         for (int i = 1; i < num; i++) { [EOL]             tot += elapsedTimes[i]; [EOL]         } [EOL]         System.out.printf("%-20s: %5dms%n%n", "Average(not first)", (tot / (num - 1))); [EOL]     } [EOL]     num = 0; [EOL] } <line_num>: 124,133
private static void testReadBigFile(boolean split) throws Exception { [EOL]     for (int i = 0; i < max; i++) { [EOL]         BufferedReader in = getReader(); [EOL]         long t0 = System.currentTimeMillis(); [EOL]         Stats s = readAll(in, split); [EOL]         in.close(); [EOL]         show(split ? "file+split" : "file", s, t0); [EOL]     } [EOL]     show(); [EOL] } <line_num>: 135,144
private static Stats readAll(BufferedReader in, boolean split) throws IOException { [EOL]     int count = 0; [EOL]     int fields = 0; [EOL]     String record; [EOL]     while ((record = in.readLine()) != null) { [EOL]         count++; [EOL]         fields += split ? record.split(",").length : 1; [EOL]     } [EOL]     return new Stats(count, fields); [EOL] } <line_num>: 146,155
private static void testExtendedBuffer(boolean makeString) throws Exception { [EOL]     for (int i = 0; i < max; i++) { [EOL]         ExtendedBufferedReader in = new ExtendedBufferedReader(getReader()); [EOL]         long t0 = System.currentTimeMillis(); [EOL]         int read; [EOL]         int fields = 0; [EOL]         int lines = 0; [EOL]         if (makeString) { [EOL]             StringBuilder sb = new StringBuilder(); [EOL]             while ((read = in.read()) != -1) { [EOL]                 sb.append((char) read); [EOL]                 if (read == ',') { [EOL]                     sb.toString(); [EOL]                     sb = new StringBuilder(); [EOL]                     fields++; [EOL]                 } else if (read == '\n') { [EOL]                     sb.toString(); [EOL]                     sb = new StringBuilder(); [EOL]                     lines++; [EOL]                 } [EOL]             } [EOL]         } else { [EOL]             while ((read = in.read()) != -1) { [EOL]                 if (read == ',') { [EOL]                     fields++; [EOL]                 } else if (read == '\n') { [EOL]                     lines++; [EOL]                 } [EOL]             } [EOL]         } [EOL]         fields += lines; [EOL]         in.close(); [EOL]         show("Extended" + (makeString ? " toString" : ""), new Stats(lines, fields), t0); [EOL]     } [EOL]     show(); [EOL] } <line_num>: 157,192
private static void testParseCommonsCSV() throws Exception { [EOL]     for (int i = 0; i < max; i++) { [EOL]         final BufferedReader reader = getReader(); [EOL]         CSVParser parser = new CSVParser(reader, format); [EOL]         long t0 = System.currentTimeMillis(); [EOL]         Stats s = iterate(parser); [EOL]         reader.close(); [EOL]         show("CSV", s, t0); [EOL]     } [EOL]     show(); [EOL] } <line_num>: 194,204
private static Constructor<Lexer> getLexerCtor(String clazz) throws Exception { [EOL]     @SuppressWarnings("unchecked") [EOL]     Class<Lexer> lexer = (Class<Lexer>) Class.forName("org.apache.commons.csv." + clazz); [EOL]     Constructor<Lexer> ctor = lexer.getConstructor(new Class<?>[] { CSVFormat.class, ExtendedBufferedReader.class }); [EOL]     return ctor; [EOL] } <line_num>: 207,212
private static void testCSVLexer(final boolean newToken, String test) throws Exception { [EOL]     Token token = new Token(); [EOL]     String dynamic = ""; [EOL]     for (int i = 0; i < max; i++) { [EOL]         final ExtendedBufferedReader input = new ExtendedBufferedReader(getReader()); [EOL]         Lexer lexer = null; [EOL]         if (test.startsWith("CSVLexer")) { [EOL]             dynamic = "!"; [EOL]             lexer = getLexerCtor(test).newInstance(new Object[] { format, input }); [EOL]         } else { [EOL]             lexer = new CSVLexer(format, input); [EOL]         } [EOL]         int count = 0; [EOL]         int fields = 0; [EOL]         long t0 = System.currentTimeMillis(); [EOL]         do { [EOL]             if (newToken) { [EOL]                 token = new Token(); [EOL]             } else { [EOL]                 token.reset(); [EOL]             } [EOL]             lexer.nextToken(token); [EOL]             switch(token.type) { [EOL]                 case EOF: [EOL]                     break; [EOL]                 case EORECORD: [EOL]                     fields++; [EOL]                     count++; [EOL]                     break; [EOL]                 case INVALID: [EOL]                     throw new IOException("invalid parse sequence"); [EOL]                 case TOKEN: [EOL]                     fields++; [EOL]                     break; [EOL]             } [EOL]         } while (!token.type.equals(Token.Type.EOF)); [EOL]         Stats s = new Stats(count, fields); [EOL]         input.close(); [EOL]         show(lexer.getClass().getSimpleName() + dynamic + " " + (newToken ? "new" : "reset"), s, t0); [EOL]     } [EOL]     show(); [EOL] } <line_num>: 214,256
private static Stats iterate(Iterable<CSVRecord> it) { [EOL]     int count = 0; [EOL]     int fields = 0; [EOL]     for (CSVRecord record : it) { [EOL]         count++; [EOL]         fields += record.size(); [EOL]     } [EOL]     return new Stats(count, fields); [EOL] } <line_num>: 258,266
