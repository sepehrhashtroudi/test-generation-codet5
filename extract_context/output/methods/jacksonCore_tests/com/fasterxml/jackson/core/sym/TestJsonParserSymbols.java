public int byteSymbolCount() { [EOL]     return _rootByteSymbols.size(); [EOL] } <line_num>: 24,24
public int charSymbolCount() { [EOL]     return _rootCharSymbols.size(); [EOL] } <line_num>: 25,25
public void testByteSymbolsWithClose() throws Exception { [EOL]     _testWithClose(true); [EOL] } <line_num>: 30,33
public void testByteSymbolsWithEOF() throws Exception { [EOL]     MyJsonFactory f = new MyJsonFactory(); [EOL]     JsonParser jp = _getParser(f, JSON, true); [EOL]     while (jp.nextToken() != null) { [EOL]         assertEquals(0, f.byteSymbolCount()); [EOL]     } [EOL]     assertEquals(3, f.byteSymbolCount()); [EOL]     jp.close(); [EOL]     assertEquals(3, f.byteSymbolCount()); [EOL] } <line_num>: 35,47
public void testCharSymbolsWithClose() throws Exception { [EOL]     _testWithClose(false); [EOL] } <line_num>: 49,52
public void testCharSymbolsWithEOF() throws Exception { [EOL]     MyJsonFactory f = new MyJsonFactory(); [EOL]     JsonParser jp = _getParser(f, JSON, false); [EOL]     while (jp.nextToken() != null) { [EOL]         assertEquals(0, f.charSymbolCount()); [EOL]     } [EOL]     assertEquals(3, f.charSymbolCount()); [EOL]     jp.close(); [EOL]     assertEquals(3, f.charSymbolCount()); [EOL] } <line_num>: 54,66
private void _testWithClose(boolean useBytes) throws IOException { [EOL]     MyJsonFactory f = new MyJsonFactory(); [EOL]     JsonParser jp = _getParser(f, JSON, useBytes); [EOL]     assertToken(JsonToken.START_OBJECT, jp.nextToken()); [EOL]     assertToken(JsonToken.FIELD_NAME, jp.nextToken()); [EOL]     assertToken(JsonToken.VALUE_NUMBER_INT, jp.nextToken()); [EOL]     assertToken(JsonToken.FIELD_NAME, jp.nextToken()); [EOL]     assertEquals(0, useBytes ? f.byteSymbolCount() : f.charSymbolCount()); [EOL]     jp.close(); [EOL]     assertEquals(2, useBytes ? f.byteSymbolCount() : f.charSymbolCount()); [EOL] } <line_num>: 74,89
private JsonParser _getParser(MyJsonFactory f, String doc, boolean useBytes) throws IOException { [EOL]     JsonParser jp; [EOL]     if (useBytes) { [EOL]         jp = f.createParser(doc.getBytes("UTF-8")); [EOL]         assertEquals(UTF8StreamJsonParser.class, jp.getClass()); [EOL]         assertEquals(0, f.byteSymbolCount()); [EOL]     } else { [EOL]         jp = f.createParser(doc); [EOL]         assertEquals(ReaderBasedJsonParser.class, jp.getClass()); [EOL]         assertEquals(0, f.charSymbolCount()); [EOL]     } [EOL]     return jp; [EOL] } <line_num>: 91,104