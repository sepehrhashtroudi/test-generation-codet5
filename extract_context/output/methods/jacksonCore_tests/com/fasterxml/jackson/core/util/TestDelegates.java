public void testParserDelegate() throws IOException { [EOL]     JsonParser jp = new JsonFactory().createParser("[ 1, true ]"); [EOL]     assertNull(jp.getCurrentToken()); [EOL]     assertToken(JsonToken.START_ARRAY, jp.nextToken()); [EOL]     assertEquals("[", jp.getText()); [EOL]     assertToken(JsonToken.VALUE_NUMBER_INT, jp.nextToken()); [EOL]     assertEquals(1, jp.getIntValue()); [EOL]     assertToken(JsonToken.VALUE_TRUE, jp.nextToken()); [EOL]     assertTrue(jp.getBooleanValue()); [EOL]     assertToken(JsonToken.END_ARRAY, jp.nextToken()); [EOL]     jp.close(); [EOL]     assertTrue(jp.isClosed()); [EOL] } <line_num>: 12,25
public void testGeneratorDelegate() throws IOException { [EOL]     StringWriter sw = new StringWriter(); [EOL]     JsonGenerator jg = new JsonFactory().createGenerator(sw); [EOL]     jg.writeStartArray(); [EOL]     jg.writeNumber(13); [EOL]     jg.writeNull(); [EOL]     jg.writeBoolean(false); [EOL]     jg.writeEndArray(); [EOL]     jg.close(); [EOL]     assertTrue(jg.isClosed()); [EOL]     assertEquals("[13,null,false]", sw.toString()); [EOL] } <line_num>: 30,42
