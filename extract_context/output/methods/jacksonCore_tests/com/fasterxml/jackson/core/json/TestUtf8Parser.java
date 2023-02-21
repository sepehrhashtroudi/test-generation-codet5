public void testEmptyName() throws Exception { [EOL]     final String DOC = "{ \"\" : \"\" }"; [EOL]     JsonParser jp = createParserUsingStream(DOC, "UTF-8"); [EOL]     assertToken(JsonToken.START_OBJECT, jp.nextToken()); [EOL]     assertToken(JsonToken.FIELD_NAME, jp.nextToken()); [EOL]     assertEquals("", jp.getCurrentName()); [EOL]     assertToken(JsonToken.VALUE_STRING, jp.nextToken()); [EOL]     assertEquals("", jp.getText()); [EOL]     assertToken(JsonToken.END_OBJECT, jp.nextToken()); [EOL]     jp.close(); [EOL] } <line_num>: 35,48
public void testUtf8Name2Bytes() throws Exception { [EOL]     final String[] NAMES = UTF8_2BYTE_STRINGS; [EOL]     for (int i = 0; i < NAMES.length; ++i) { [EOL]         String NAME = NAMES[i]; [EOL]         String DOC = "{ \"" + NAME + "\" : 0 }"; [EOL]         JsonParser jp = createParserUsingStream(DOC, "UTF-8"); [EOL]         assertToken(JsonToken.START_OBJECT, jp.nextToken()); [EOL]         assertToken(JsonToken.FIELD_NAME, jp.nextToken()); [EOL]         assertEquals(NAME, jp.getCurrentName()); [EOL]         assertToken(JsonToken.VALUE_NUMBER_INT, jp.nextToken()); [EOL]         assertEquals(NAME, jp.getCurrentName()); [EOL]         assertToken(JsonToken.END_OBJECT, jp.nextToken()); [EOL]         jp.close(); [EOL]     } [EOL] } <line_num>: 50,70
public void testUtf8Name3Bytes() throws Exception { [EOL]     final String[] NAMES = UTF8_3BYTE_STRINGS; [EOL]     for (int i = 0; i < NAMES.length; ++i) { [EOL]         String NAME = NAMES[i]; [EOL]         String DOC = "{ \"" + NAME + "\" : true }"; [EOL]         JsonParser jp = createParserUsingStream(DOC, "UTF-8"); [EOL]         assertToken(JsonToken.START_OBJECT, jp.nextToken()); [EOL]         assertToken(JsonToken.FIELD_NAME, jp.nextToken()); [EOL]         assertEquals(NAME, jp.getCurrentName()); [EOL]         assertToken(JsonToken.VALUE_TRUE, jp.nextToken()); [EOL]         assertEquals(NAME, jp.getCurrentName()); [EOL]         assertToken(JsonToken.END_OBJECT, jp.nextToken()); [EOL]         jp.close(); [EOL]     } [EOL] } <line_num>: 72,92
public void testUtf8StringTrivial() throws Exception { [EOL]     String[] VALUES = UTF8_2BYTE_STRINGS; [EOL]     for (int i = 0; i < VALUES.length; ++i) { [EOL]         String VALUE = VALUES[i]; [EOL]         String DOC = "[ \"" + VALUE + "\" ]"; [EOL]         JsonParser jp = createParserUsingStream(DOC, "UTF-8"); [EOL]         assertToken(JsonToken.START_ARRAY, jp.nextToken()); [EOL]         assertToken(JsonToken.VALUE_STRING, jp.nextToken()); [EOL]         String act = getAndVerifyText(jp); [EOL]         if (act.length() != VALUE.length()) { [EOL]             fail("Failed for value #" + (i + 1) + "/" + VALUES.length + ": length was " + act.length() + ", should be " + VALUE.length()); [EOL]         } [EOL]         assertEquals(VALUE, act); [EOL]         assertToken(JsonToken.END_ARRAY, jp.nextToken()); [EOL]         jp.close(); [EOL]     } [EOL]     VALUES = UTF8_3BYTE_STRINGS; [EOL]     for (int i = 0; i < VALUES.length; ++i) { [EOL]         String VALUE = VALUES[i]; [EOL]         String DOC = "[ \"" + VALUE + "\" ]"; [EOL]         JsonParser jp = createParserUsingStream(DOC, "UTF-8"); [EOL]         assertToken(JsonToken.START_ARRAY, jp.nextToken()); [EOL]         assertToken(JsonToken.VALUE_STRING, jp.nextToken()); [EOL]         assertEquals(VALUE, getAndVerifyText(jp)); [EOL]         assertToken(JsonToken.END_ARRAY, jp.nextToken()); [EOL]         jp.close(); [EOL]     } [EOL] } <line_num>: 96,125
public void testUtf8StringValue() throws Exception { [EOL]     Random r = new Random(13); [EOL]     int LEN = 720; [EOL]     StringBuilder sb = new StringBuilder(LEN + 20); [EOL]     while (sb.length() < LEN) { [EOL]         int c; [EOL]         if (r.nextBoolean()) { [EOL]             c = 32 + (r.nextInt() & 0x3F); [EOL]             if (c == '"' || c == '\\') { [EOL]                 c = ' '; [EOL]             } [EOL]         } else if (r.nextBoolean()) { [EOL]             c = 160 + (r.nextInt() & 0x3FF); [EOL]         } else if (r.nextBoolean()) { [EOL]             c = 8000 + (r.nextInt() & 0x7FFF); [EOL]         } else { [EOL]             int value = r.nextInt() & 0x3FFFF; [EOL]             sb.append((char) (0xD800 + (value >> 10))); [EOL]             c = (0xDC00 + (value & 0x3FF)); [EOL]         } [EOL]         sb.append((char) c); [EOL]     } [EOL]     ByteArrayOutputStream bout = new ByteArrayOutputStream(LEN); [EOL]     OutputStreamWriter out = new OutputStreamWriter(bout, "UTF-8"); [EOL]     out.write("[\""); [EOL]     String VALUE = sb.toString(); [EOL]     out.write(VALUE); [EOL]     out.write("\"]"); [EOL]     out.close(); [EOL]     byte[] data = bout.toByteArray(); [EOL]     JsonParser jp = new JsonFactory().createParser(new ByteArrayInputStream(data)); [EOL]     assertToken(JsonToken.START_ARRAY, jp.nextToken()); [EOL]     assertToken(JsonToken.VALUE_STRING, jp.nextToken()); [EOL]     String act = jp.getText(); [EOL]     assertEquals(VALUE.length(), act.length()); [EOL]     assertEquals(VALUE, act); [EOL]     jp.close(); [EOL] } <line_num>: 127,171
public void testNextFieldName() throws IOException { [EOL]     JsonFactory f = new JsonFactory(); [EOL]     SerializedString id = new SerializedString("id"); [EOL]     ByteArrayOutputStream os = new ByteArrayOutputStream(); [EOL]     os.write('{'); [EOL]     for (int i = 0; i < 3994; i++) { [EOL]         os.write(' '); [EOL]     } [EOL]     os.write("\"id\":2".getBytes("UTF-8")); [EOL]     os.write('}'); [EOL]     JsonParser parser = f.createParser(new ByteArrayInputStream(os.toByteArray())); [EOL]     assertEquals(parser.nextToken(), JsonToken.START_OBJECT); [EOL]     assertTrue(parser.nextFieldName(id)); [EOL]     assertEquals(parser.nextToken(), JsonToken.VALUE_NUMBER_INT); [EOL]     assertEquals(parser.nextToken(), JsonToken.END_OBJECT); [EOL]     parser.close(); [EOL] } <line_num>: 174,193