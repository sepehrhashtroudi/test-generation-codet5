public void testEmptyArrayWrite() throws Exception { [EOL]     StringWriter sw = new StringWriter(); [EOL]     JsonGenerator gen = new JsonFactory().createGenerator(sw); [EOL]     JsonStreamContext ctxt = gen.getOutputContext(); [EOL]     assertTrue(ctxt.inRoot()); [EOL]     assertFalse(ctxt.inArray()); [EOL]     assertFalse(ctxt.inObject()); [EOL]     assertEquals(0, ctxt.getEntryCount()); [EOL]     assertEquals(0, ctxt.getCurrentIndex()); [EOL]     gen.writeStartArray(); [EOL]     ctxt = gen.getOutputContext(); [EOL]     assertFalse(ctxt.inRoot()); [EOL]     assertTrue(ctxt.inArray()); [EOL]     assertFalse(ctxt.inObject()); [EOL]     assertEquals(0, ctxt.getEntryCount()); [EOL]     assertEquals(0, ctxt.getCurrentIndex()); [EOL]     gen.writeEndArray(); [EOL]     ctxt = gen.getOutputContext(); [EOL]     assertTrue("Should be in root, was " + ctxt.getTypeDesc(), ctxt.inRoot()); [EOL]     assertFalse(ctxt.inArray()); [EOL]     assertFalse(ctxt.inObject()); [EOL]     assertEquals(1, ctxt.getEntryCount()); [EOL]     assertEquals(0, ctxt.getCurrentIndex()); [EOL]     gen.close(); [EOL]     String docStr = sw.toString(); [EOL]     JsonParser jp = createParserUsingReader(docStr); [EOL]     assertEquals(JsonToken.START_ARRAY, jp.nextToken()); [EOL]     assertEquals(JsonToken.END_ARRAY, jp.nextToken()); [EOL]     jp.close(); [EOL]     sw = new StringWriter(); [EOL]     gen = new JsonFactory().createGenerator(sw); [EOL]     gen.writeStartArray(); [EOL]     gen.writeStartArray(); [EOL]     gen.writeEndArray(); [EOL]     gen.writeEndArray(); [EOL]     gen.close(); [EOL]     docStr = sw.toString(); [EOL]     jp = createParserUsingReader(docStr); [EOL]     assertEquals(JsonToken.START_ARRAY, jp.nextToken()); [EOL]     assertEquals(JsonToken.START_ARRAY, jp.nextToken()); [EOL]     assertEquals(JsonToken.END_ARRAY, jp.nextToken()); [EOL]     assertEquals(JsonToken.END_ARRAY, jp.nextToken()); [EOL]     assertEquals(null, jp.nextToken()); [EOL]     jp.close(); [EOL] } <line_num>: 14,69
public void testInvalidArrayWrite() throws Exception { [EOL]     StringWriter sw = new StringWriter(); [EOL]     JsonGenerator gen = new JsonFactory().createGenerator(sw); [EOL]     gen.writeStartArray(); [EOL]     try { [EOL]         gen.writeEndObject(); [EOL]         fail("Expected an exception for mismatched array/object write"); [EOL]     } catch (JsonGenerationException e) { [EOL]         verifyException(e, "Current context not an object"); [EOL]     } [EOL]     gen.close(); [EOL] } <line_num>: 71,85
public void testSimpleArrayWrite() throws Exception { [EOL]     StringWriter sw = new StringWriter(); [EOL]     JsonGenerator gen = new JsonFactory().createGenerator(sw); [EOL]     gen.writeStartArray(); [EOL]     gen.writeNumber(13); [EOL]     gen.writeBoolean(true); [EOL]     gen.writeString("foobar"); [EOL]     gen.writeEndArray(); [EOL]     gen.close(); [EOL]     String docStr = sw.toString(); [EOL]     JsonParser jp = createParserUsingReader(docStr); [EOL]     assertEquals(JsonToken.START_ARRAY, jp.nextToken()); [EOL]     assertEquals(JsonToken.VALUE_NUMBER_INT, jp.nextToken()); [EOL]     assertEquals(13, jp.getIntValue()); [EOL]     assertEquals(JsonToken.VALUE_TRUE, jp.nextToken()); [EOL]     assertEquals(JsonToken.VALUE_STRING, jp.nextToken()); [EOL]     assertEquals("foobar", jp.getText()); [EOL]     assertEquals(JsonToken.END_ARRAY, jp.nextToken()); [EOL]     assertEquals(null, jp.nextToken()); [EOL]     jp.close(); [EOL] } <line_num>: 87,109
