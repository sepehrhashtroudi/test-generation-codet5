public void testCR() throws Exception { [EOL]     _testLinefeeds("\r", true); [EOL]     _testLinefeeds("\r", false); [EOL] } <line_num>: 16,20
public void testLF() throws Exception { [EOL]     _testLinefeeds("\n", true); [EOL]     _testLinefeeds("\n", false); [EOL] } <line_num>: 22,26
public void testCRLF() throws Exception { [EOL]     _testLinefeeds("\r\n", true); [EOL]     _testLinefeeds("\r\n", false); [EOL] } <line_num>: 28,32
private void _testLinefeeds(String lf, boolean useStream) throws IOException { [EOL]     String DOC = "[1,@2,@-178@]"; [EOL]     DOC = DOC.replaceAll("@", lf); [EOL]     JsonParser jp = useStream ? createParserUsingStream(DOC, "UTF-8") : createParserUsingReader(DOC); [EOL]     assertToken(JsonToken.START_ARRAY, jp.nextToken()); [EOL]     assertEquals(1, jp.getCurrentLocation().getLineNr()); [EOL]     assertToken(JsonToken.VALUE_NUMBER_INT, jp.nextToken()); [EOL]     assertEquals(1, jp.getIntValue()); [EOL]     assertEquals(1, jp.getCurrentLocation().getLineNr()); [EOL]     assertToken(JsonToken.VALUE_NUMBER_INT, jp.nextToken()); [EOL]     assertEquals(2, jp.getIntValue()); [EOL]     assertEquals(2, jp.getCurrentLocation().getLineNr()); [EOL]     assertToken(JsonToken.VALUE_NUMBER_INT, jp.nextToken()); [EOL]     assertEquals(-178, jp.getIntValue()); [EOL]     assertEquals(3, jp.getCurrentLocation().getLineNr()); [EOL]     assertToken(JsonToken.END_ARRAY, jp.nextToken()); [EOL]     assertEquals(4, jp.getCurrentLocation().getLineNr()); [EOL]     jp.close(); [EOL] } <line_num>: 40,69