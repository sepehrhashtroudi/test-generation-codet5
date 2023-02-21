public void testFromArray() throws Exception { [EOL]     ArrayList<Object> doc = new ArrayList<Object>(); [EOL]     doc.add("Elem1"); [EOL]     doc.add(Integer.valueOf(3)); [EOL]     Map<String, Object> struct = new LinkedHashMap<String, Object>(); [EOL]     struct.put("first", Boolean.TRUE); [EOL]     struct.put("Second", new ArrayList<Object>()); [EOL]     doc.add(struct); [EOL]     doc.add(Boolean.FALSE); [EOL]     ObjectMapper mapper = new ObjectMapper(); [EOL]     JsonFactory f = new JsonFactory(); [EOL]     for (int i = 0; i < 3; ++i) { [EOL]         String str = mapper.writeValueAsString(doc); [EOL]         JsonParser jp = f.createParser(str); [EOL]         assertEquals(JsonToken.START_ARRAY, jp.nextToken()); [EOL]         assertEquals(JsonToken.VALUE_STRING, jp.nextToken()); [EOL]         assertEquals("Elem1", getAndVerifyText(jp)); [EOL]         assertEquals(JsonToken.VALUE_NUMBER_INT, jp.nextToken()); [EOL]         assertEquals(3, jp.getIntValue()); [EOL]         assertEquals(JsonToken.START_OBJECT, jp.nextToken()); [EOL]         assertEquals(JsonToken.FIELD_NAME, jp.nextToken()); [EOL]         assertEquals("first", getAndVerifyText(jp)); [EOL]         assertEquals(JsonToken.VALUE_TRUE, jp.nextToken()); [EOL]         assertEquals(JsonToken.FIELD_NAME, jp.nextToken()); [EOL]         assertEquals("Second", getAndVerifyText(jp)); [EOL]         if (jp.nextToken() != JsonToken.START_ARRAY) { [EOL]             fail("Expected START_ARRAY: JSON == '" + str + "'"); [EOL]         } [EOL]         assertEquals(JsonToken.END_ARRAY, jp.nextToken()); [EOL]         assertEquals(JsonToken.END_OBJECT, jp.nextToken()); [EOL]         assertEquals(JsonToken.VALUE_FALSE, jp.nextToken()); [EOL]         assertEquals(JsonToken.END_ARRAY, jp.nextToken()); [EOL]         assertNull(jp.nextToken()); [EOL]     } [EOL] } <line_num>: 17,64
public void testFromMap() throws Exception { [EOL]     LinkedHashMap<String, Object> doc = new LinkedHashMap<String, Object>(); [EOL]     JsonFactory f = new JsonFactory(); [EOL]     doc.put("a1", "\"text\""); [EOL]     doc.put("int", Integer.valueOf(137)); [EOL]     doc.put("foo bar", Long.valueOf(1234567890L)); [EOL]     ObjectMapper mapper = new ObjectMapper(); [EOL]     for (int i = 0; i < 3; ++i) { [EOL]         String str = mapper.writeValueAsString(doc); [EOL]         JsonParser jp = f.createParser(str); [EOL]         assertEquals(JsonToken.START_OBJECT, jp.nextToken()); [EOL]         assertEquals(JsonToken.FIELD_NAME, jp.nextToken()); [EOL]         assertEquals("a1", getAndVerifyText(jp)); [EOL]         assertEquals(JsonToken.VALUE_STRING, jp.nextToken()); [EOL]         assertEquals("\"text\"", getAndVerifyText(jp)); [EOL]         assertEquals(JsonToken.FIELD_NAME, jp.nextToken()); [EOL]         assertEquals("int", getAndVerifyText(jp)); [EOL]         assertEquals(JsonToken.VALUE_NUMBER_INT, jp.nextToken()); [EOL]         assertEquals(137, jp.getIntValue()); [EOL]         assertEquals(JsonToken.FIELD_NAME, jp.nextToken()); [EOL]         assertEquals("foo bar", getAndVerifyText(jp)); [EOL]         assertEquals(JsonToken.VALUE_NUMBER_INT, jp.nextToken()); [EOL]         assertEquals(1234567890L, jp.getLongValue()); [EOL]         assertEquals(JsonToken.END_OBJECT, jp.nextToken()); [EOL]         assertNull(jp.nextToken()); [EOL]     } [EOL] } <line_num>: 66,102
