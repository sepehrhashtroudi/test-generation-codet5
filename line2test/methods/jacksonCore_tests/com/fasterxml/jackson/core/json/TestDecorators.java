@Override [EOL] public InputStream decorate(IOContext ctxt, InputStream in) throws IOException { [EOL]     return new ByteArrayInputStream("123".getBytes("UTF-8")); [EOL] } <line_num>: 27,32
@Override [EOL] public InputStream decorate(IOContext ctxt, byte[] src, int offset, int length) throws IOException { [EOL]     return new ByteArrayInputStream("456".getBytes("UTF-8")); [EOL] } <line_num>: 34,39
@Override [EOL] public Reader decorate(IOContext ctxt, Reader src) { [EOL]     return new StringReader("789"); [EOL] } <line_num>: 41,44
@Override [EOL] public OutputStream decorate(IOContext ctxt, OutputStream out) throws IOException { [EOL]     out.write("123".getBytes("UTF-8")); [EOL]     out.flush(); [EOL]     return new ByteArrayOutputStream(); [EOL] } <line_num>: 49,55
@Override [EOL] public Writer decorate(IOContext ctxt, Writer w) throws IOException { [EOL]     w.write("567"); [EOL]     w.flush(); [EOL]     return new StringWriter(); [EOL] } <line_num>: 57,63
public void testInputDecoration() throws IOException { [EOL]     JsonFactory f = new JsonFactory(); [EOL]     f.setInputDecorator(new SimpleInputDecorator()); [EOL]     JsonParser jp; [EOL]     jp = f.createParser(new StringReader("{ }")); [EOL]     assertEquals(JsonToken.VALUE_NUMBER_INT, jp.nextToken()); [EOL]     assertEquals(789, jp.getIntValue()); [EOL]     jp.close(); [EOL]     jp = f.createParser(new ByteArrayInputStream("[ ]".getBytes("UTF-8"))); [EOL]     assertEquals(JsonToken.VALUE_NUMBER_INT, jp.nextToken()); [EOL]     assertEquals(123, jp.getIntValue()); [EOL]     jp.close(); [EOL]     jp = f.createParser("[ ]".getBytes("UTF-8")); [EOL]     assertEquals(JsonToken.VALUE_NUMBER_INT, jp.nextToken()); [EOL]     assertEquals(456, jp.getIntValue()); [EOL]     jp.close(); [EOL] } <line_num>: 72,97
public void testOutputDecoration() throws IOException { [EOL]     JsonFactory f = new JsonFactory(); [EOL]     f.setOutputDecorator(new SimpleOutputDecorator()); [EOL]     JsonGenerator jg; [EOL]     StringWriter sw = new StringWriter(); [EOL]     jg = f.createGenerator(sw); [EOL]     jg.close(); [EOL]     assertEquals("567", sw.toString()); [EOL]     ByteArrayOutputStream out = new ByteArrayOutputStream(); [EOL]     jg = f.createGenerator(out, JsonEncoding.UTF8); [EOL]     jg.close(); [EOL]     assertEquals("123", out.toString("UTF-8")); [EOL] } <line_num>: 99,114
