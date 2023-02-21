public DummyDeserializer(T v, Class<T> cls) { [EOL]     super(cls); [EOL]     value = v; [EOL] } <line_num>: 30,33
public CustomBean(int a, int b) { [EOL]     this.a = a; [EOL]     this.b = b; [EOL] } <line_num>: 55,58
@Override [EOL] public T deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException { [EOL]     jp.skipChildren(); [EOL]     return value; [EOL] } <line_num>: 35,42
@Override [EOL] public CustomBean deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException { [EOL]     int a = 0, b = 0; [EOL]     JsonToken t = jp.getCurrentToken(); [EOL]     if (t == JsonToken.START_OBJECT) { [EOL]         t = jp.nextToken(); [EOL]     } else if (t != JsonToken.FIELD_NAME) { [EOL]         throw new Error(); [EOL]     } [EOL]     while (t == JsonToken.FIELD_NAME) { [EOL]         final String fieldName = jp.getCurrentName(); [EOL]         t = jp.nextToken(); [EOL]         if (t != JsonToken.VALUE_NUMBER_INT) { [EOL]             throw new JsonParseException("expecting number got " + t, jp.getCurrentLocation()); [EOL]         } [EOL]         if (fieldName.equals("a")) { [EOL]             a = jp.getIntValue(); [EOL]         } else if (fieldName.equals("b")) { [EOL]             b = jp.getIntValue(); [EOL]         } else { [EOL]             throw new Error(); [EOL]         } [EOL]         t = jp.nextToken(); [EOL]     } [EOL]     return new CustomBean(a, b); [EOL] } <line_num>: 63,89
public void testCustomBeanDeserializer() throws Exception { [EOL]     final ObjectMapper map = new ObjectMapper(); [EOL]     String json = "{\"beans\":[{\"c\":{\"a\":10,\"b\":20},\"d\":\"hello, tatu\"}]}"; [EOL]     TestBeans beans = map.readValue(json, TestBeans.class); [EOL]     assertNotNull(beans); [EOL]     List<TestBean> results = beans.beans; [EOL]     assertNotNull(results); [EOL]     assertEquals(1, results.size()); [EOL]     TestBean bean = results.get(0); [EOL]     assertEquals("hello, tatu", bean.d); [EOL]     CustomBean c = bean.c; [EOL]     assertNotNull(c); [EOL]     assertEquals(10, c.a); [EOL]     assertEquals(20, c.b); [EOL]     json = "{\"beans\":[{\"c\":{\"b\":3,\"a\":-4},\"d\":\"\"}," + "{\"d\":\"abc\", \"c\":{\"b\":15}}]}"; [EOL]     beans = map.readValue(json, TestBeans.class); [EOL]     assertNotNull(beans); [EOL]     results = beans.beans; [EOL]     assertNotNull(results); [EOL]     assertEquals(2, results.size()); [EOL]     bean = results.get(0); [EOL]     assertEquals("", bean.d); [EOL]     c = bean.c; [EOL]     assertNotNull(c); [EOL]     assertEquals(-4, c.a); [EOL]     assertEquals(3, c.b); [EOL]     bean = results.get(1); [EOL]     assertEquals("abc", bean.d); [EOL]     c = bean.c; [EOL]     assertNotNull(c); [EOL]     assertEquals(0, c.a); [EOL]     assertEquals(15, c.b); [EOL] } <line_num>: 99,139
