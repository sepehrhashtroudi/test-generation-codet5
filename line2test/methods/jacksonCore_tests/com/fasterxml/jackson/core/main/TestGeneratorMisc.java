public void testIsClosed() throws IOException { [EOL]     JsonFactory jf = new JsonFactory(); [EOL]     for (int i = 0; i < 2; ++i) { [EOL]         boolean stream = ((i & 1) == 0); [EOL]         JsonGenerator jg = stream ? jf.createGenerator(new StringWriter()) : jf.createGenerator(new ByteArrayOutputStream(), JsonEncoding.UTF8); [EOL]         assertFalse(jg.isClosed()); [EOL]         jg.writeStartArray(); [EOL]         jg.writeNumber(-1); [EOL]         jg.writeEndArray(); [EOL]         assertFalse(jg.isClosed()); [EOL]         jg.close(); [EOL]         assertTrue(jg.isClosed()); [EOL]         jg.close(); [EOL]         assertTrue(jg.isClosed()); [EOL]     } [EOL] } <line_num>: 23,43
public void testSimpleWriteObject() throws IOException { [EOL]     JsonFactory jf = new JsonFactory(); [EOL]     StringWriter sw = new StringWriter(); [EOL]     JsonGenerator gen = jf.createGenerator(sw); [EOL]     gen.writeStartArray(); [EOL]     gen.writeObject(1); [EOL]     gen.writeObject((short) -2); [EOL]     gen.writeObject((long) 3); [EOL]     gen.writeObject((byte) -4); [EOL]     gen.writeObject(0.25); [EOL]     gen.writeObject(-0.125f); [EOL]     gen.writeObject(Boolean.TRUE); [EOL]     gen.close(); [EOL]     String act = sw.toString().trim(); [EOL]     assertEquals("[1,-2,3,-4,0.25,-0.125,true]", act); [EOL]     sw = new StringWriter(); [EOL]     gen = jf.createGenerator(sw); [EOL]     gen.writeStartArray(); [EOL]     gen.writeObject(BigInteger.valueOf(1234)); [EOL]     gen.writeObject(new BigDecimal(0.5)); [EOL]     gen.writeEndArray(); [EOL]     gen.close(); [EOL]     act = sw.toString().trim(); [EOL]     assertEquals("[1234,0.5]", act); [EOL]     sw = new StringWriter(); [EOL]     gen = jf.createGenerator(sw); [EOL]     gen.writeStartArray(); [EOL]     gen.writeObject(new AtomicBoolean(false)); [EOL]     gen.writeObject(new AtomicInteger(13)); [EOL]     gen.writeObject(new AtomicLong(-127L)); [EOL]     gen.writeEndArray(); [EOL]     gen.close(); [EOL]     act = sw.toString().trim(); [EOL]     assertEquals("[false,13,-127]", act); [EOL] } <line_num>: 46,88
public void testRaw() throws IOException { [EOL]     JsonFactory jf = new JsonFactory(); [EOL]     StringWriter sw = new StringWriter(); [EOL]     JsonGenerator gen = jf.createGenerator(sw); [EOL]     gen.writeStartArray(); [EOL]     gen.writeRaw("-123, true"); [EOL]     gen.writeRaw(", \"x\"  "); [EOL]     gen.writeEndArray(); [EOL]     gen.close(); [EOL]     JsonParser jp = createParserUsingReader(sw.toString()); [EOL]     assertToken(JsonToken.START_ARRAY, jp.nextToken()); [EOL]     assertToken(JsonToken.VALUE_NUMBER_INT, jp.nextToken()); [EOL]     assertEquals(-123, jp.getIntValue()); [EOL]     assertToken(JsonToken.VALUE_TRUE, jp.nextToken()); [EOL]     assertToken(JsonToken.VALUE_STRING, jp.nextToken()); [EOL]     assertEquals("x", jp.getText()); [EOL]     assertToken(JsonToken.END_ARRAY, jp.nextToken()); [EOL]     jp.close(); [EOL] } <line_num>: 96,117
public void testRawValue() throws IOException { [EOL]     JsonFactory jf = new JsonFactory(); [EOL]     StringWriter sw = new StringWriter(); [EOL]     JsonGenerator gen = jf.createGenerator(sw); [EOL]     gen.writeStartArray(); [EOL]     gen.writeRawValue("7"); [EOL]     gen.writeRawValue("[ null ]"); [EOL]     gen.writeRawValue("false"); [EOL]     gen.writeEndArray(); [EOL]     gen.close(); [EOL]     JsonParser jp = createParserUsingReader(sw.toString()); [EOL]     assertToken(JsonToken.START_ARRAY, jp.nextToken()); [EOL]     assertToken(JsonToken.VALUE_NUMBER_INT, jp.nextToken()); [EOL]     assertEquals(7, jp.getIntValue()); [EOL]     assertToken(JsonToken.START_ARRAY, jp.nextToken()); [EOL]     assertToken(JsonToken.VALUE_NULL, jp.nextToken()); [EOL]     assertToken(JsonToken.END_ARRAY, jp.nextToken()); [EOL]     assertToken(JsonToken.VALUE_FALSE, jp.nextToken()); [EOL]     assertToken(JsonToken.END_ARRAY, jp.nextToken()); [EOL]     jp.close(); [EOL] } <line_num>: 119,143
public void testBinaryWrite() throws Exception { [EOL]     _testBinaryWrite(false); [EOL]     _testBinaryWrite(true); [EOL] } <line_num>: 156,160
private void _testBinaryWrite(boolean useCharBased) throws Exception { [EOL]     final String INPUT = "Man is distinguished, not only by his reason, but by this singular passion from other animals, which is a lust of the mind, that by a perseverance of delight in the continued and indefatigable generation of knowledge, exceeds the short vehemence of any carnal pleasure."; [EOL]     final byte[] INPUT_BYTES = INPUT.getBytes("US-ASCII"); [EOL]     final String OUTPUT = "TWFuIGlzIGRpc3Rpbmd1aXNoZWQsIG5vdCBvbmx5IGJ5IGhpcyByZWFzb24sIGJ1dCBieSB0aGlz" + "IHNpbmd1bGFyIHBhc3Npb24gZnJvbSBvdGhlciBhbmltYWxzLCB3aGljaCBpcyBhIGx1c3Qgb2Yg" + "dGhlIG1pbmQsIHRoYXQgYnkgYSBwZXJzZXZlcmFuY2Ugb2YgZGVsaWdodCBpbiB0aGUgY29udGlu" + "dWVkIGFuZCBpbmRlZmF0aWdhYmxlIGdlbmVyYXRpb24gb2Yga25vd2xlZGdlLCBleGNlZWRzIHRo" + "ZSBzaG9ydCB2ZWhlbWVuY2Ugb2YgYW55IGNhcm5hbCBwbGVhc3VyZS4="; [EOL]     Base64Variant b64v = Base64Variants.getDefaultVariant(); [EOL]     JsonFactory jf = new JsonFactory(); [EOL]     for (int i = 0; i < 3; ++i) { [EOL]         JsonGenerator gen; [EOL]         ByteArrayOutputStream bout = new ByteArrayOutputStream(200); [EOL]         if (useCharBased) { [EOL]             gen = jf.createGenerator(new OutputStreamWriter(bout, "UTF-8")); [EOL]         } else { [EOL]             gen = jf.createGenerator(bout, JsonEncoding.UTF8); [EOL]         } [EOL]         switch(i) { [EOL]             case 0: [EOL]                 gen.writeBinary(b64v, INPUT_BYTES, 0, INPUT_BYTES.length); [EOL]                 break; [EOL]             case 1: [EOL]                 gen.writeStartArray(); [EOL]                 gen.writeBinary(b64v, INPUT_BYTES, 0, INPUT_BYTES.length); [EOL]                 gen.writeEndArray(); [EOL]                 break; [EOL]             default: [EOL]                 gen.writeStartObject(); [EOL]                 gen.writeFieldName("field"); [EOL]                 gen.writeBinary(b64v, INPUT_BYTES, 0, INPUT_BYTES.length); [EOL]                 gen.writeEndObject(); [EOL]                 break; [EOL]         } [EOL]         gen.close(); [EOL]         JsonParser jp = jf.createParser(new ByteArrayInputStream(bout.toByteArray())); [EOL]         switch(i) { [EOL]             case 0: [EOL]                 break; [EOL]             case 1: [EOL]                 assertEquals(JsonToken.START_ARRAY, jp.nextToken()); [EOL]                 break; [EOL]             default: [EOL]                 assertEquals(JsonToken.START_OBJECT, jp.nextToken()); [EOL]                 assertEquals(JsonToken.FIELD_NAME, jp.nextToken()); [EOL]                 break; [EOL]         } [EOL]         assertEquals(JsonToken.VALUE_STRING, jp.nextToken()); [EOL]         String actualValue = jp.getText(); [EOL]         jp.close(); [EOL]         assertEquals(OUTPUT, actualValue); [EOL]     } [EOL] } <line_num>: 162,230
public void testLongerObjects() throws Exception { [EOL]     JsonFactory jf = new JsonFactory(); [EOL]     for (int i = 0; i < 2; ++i) { [EOL]         boolean useChars = (i == 0); [EOL]         JsonGenerator jgen; [EOL]         ByteArrayOutputStream bout = new ByteArrayOutputStream(200); [EOL]         if (useChars) { [EOL]             jgen = jf.createGenerator(new OutputStreamWriter(bout, "UTF-8")); [EOL]         } else { [EOL]             jgen = jf.createGenerator(bout, JsonEncoding.UTF8); [EOL]         } [EOL]         jgen.writeStartObject(); [EOL]         for (int rounds = 0; rounds < 1500; ++rounds) { [EOL]             for (int letter = 'a'; letter <= 'z'; ++letter) { [EOL]                 for (int index = 0; index < 20; ++index) { [EOL]                     String name; [EOL]                     if (letter > 'f') { [EOL]                         name = "X" + letter + index; [EOL]                     } else if (letter > 'p') { [EOL]                         name = "" + letter + index; [EOL]                     } else { [EOL]                         name = "__" + index + letter; [EOL]                     } [EOL]                     jgen.writeFieldName(name); [EOL]                     jgen.writeNumber(index - 1); [EOL]                 } [EOL]                 jgen.writeRaw('\n'); [EOL]             } [EOL]         } [EOL]         jgen.writeEndObject(); [EOL]         jgen.close(); [EOL]         byte[] json = bout.toByteArray(); [EOL]         JsonParser jp = jf.createParser(json); [EOL]         assertToken(JsonToken.START_OBJECT, jp.nextToken()); [EOL]         for (int rounds = 0; rounds < 1500; ++rounds) { [EOL]             for (int letter = 'a'; letter <= 'z'; ++letter) { [EOL]                 for (int index = 0; index < 20; ++index) { [EOL]                     assertToken(JsonToken.FIELD_NAME, jp.nextToken()); [EOL]                     String name; [EOL]                     if (letter > 'f') { [EOL]                         name = "X" + letter + index; [EOL]                     } else if (letter > 'p') { [EOL]                         name = "" + letter + index; [EOL]                     } else { [EOL]                         name = "__" + index + letter; [EOL]                     } [EOL]                     assertEquals(name, jp.getCurrentName()); [EOL]                     assertToken(JsonToken.VALUE_NUMBER_INT, jp.nextToken()); [EOL]                     assertEquals(index - 1, jp.getIntValue()); [EOL]                 } [EOL]             } [EOL]         } [EOL]         assertToken(JsonToken.END_OBJECT, jp.nextToken()); [EOL]         jp.close(); [EOL]     } [EOL] } <line_num>: 241,300
