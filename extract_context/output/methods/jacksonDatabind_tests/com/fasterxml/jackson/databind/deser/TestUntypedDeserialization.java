@SuppressWarnings("unchecked") [EOL] public void testSampleDoc() throws Exception { [EOL]     final String JSON = SAMPLE_DOC_JSON_SPEC; [EOL]     JsonFactory jf = new JsonFactory(); [EOL]     Object root = new ObjectMapper().readValue(jf.createParser(new StringReader(JSON)), Object.class); [EOL]     assertType(root, Map.class); [EOL]     Map<?, ?> rootMap = (Map<?, ?>) root; [EOL]     assertEquals(1, rootMap.size()); [EOL]     Map.Entry<?, ?> rootEntry = rootMap.entrySet().iterator().next(); [EOL]     assertEquals("Image", rootEntry.getKey()); [EOL]     Object image = rootEntry.getValue(); [EOL]     assertType(image, Map.class); [EOL]     Map<?, ?> imageMap = (Map<?, ?>) image; [EOL]     assertEquals(5, imageMap.size()); [EOL]     Object value = imageMap.get("Width"); [EOL]     assertType(value, Integer.class); [EOL]     assertEquals(Integer.valueOf(SAMPLE_SPEC_VALUE_WIDTH), value); [EOL]     value = imageMap.get("Height"); [EOL]     assertType(value, Integer.class); [EOL]     assertEquals(Integer.valueOf(SAMPLE_SPEC_VALUE_HEIGHT), value); [EOL]     assertEquals(SAMPLE_SPEC_VALUE_TITLE, imageMap.get("Title")); [EOL]     value = imageMap.get("Thumbnail"); [EOL]     assertType(value, Map.class); [EOL]     Map<?, ?> tnMap = (Map<?, ?>) value; [EOL]     assertEquals(3, tnMap.size()); [EOL]     assertEquals(Integer.valueOf(SAMPLE_SPEC_VALUE_TN_HEIGHT), tnMap.get("Height")); [EOL]     assertEquals(SAMPLE_SPEC_VALUE_TN_WIDTH, tnMap.get("Width")); [EOL]     assertEquals(SAMPLE_SPEC_VALUE_TN_URL, tnMap.get("Url")); [EOL]     value = imageMap.get("IDs"); [EOL]     assertType(value, List.class); [EOL]     List<Object> ids = (List<Object>) value; [EOL]     assertEquals(4, ids.size()); [EOL]     assertEquals(Integer.valueOf(SAMPLE_SPEC_VALUE_TN_ID1), ids.get(0)); [EOL]     assertEquals(Integer.valueOf(SAMPLE_SPEC_VALUE_TN_ID2), ids.get(1)); [EOL]     assertEquals(Integer.valueOf(SAMPLE_SPEC_VALUE_TN_ID3), ids.get(2)); [EOL]     assertEquals(Integer.valueOf(SAMPLE_SPEC_VALUE_TN_ID4), ids.get(3)); [EOL] } <line_num>: 19,74
public void testObjectSerializeWithLong() throws IOException { [EOL]     final ObjectMapper mapper = new ObjectMapper(); [EOL]     mapper.enableDefaultTyping(DefaultTyping.JAVA_LANG_OBJECT, As.PROPERTY); [EOL]     final long VALUE = 1337800584532L; [EOL]     String serialized = "{\"timestamp\":" + VALUE + "}"; [EOL]     JsonNode deserialized = mapper.readTree(serialized); [EOL]     assertEquals(VALUE, deserialized.get("timestamp").asLong()); [EOL]     Map<?, ?> deserMap = mapper.readValue(serialized, Map.class); [EOL]     Number n = (Number) deserMap.get("timestamp"); [EOL]     assertNotNull(n); [EOL]     assertSame(Long.class, n.getClass()); [EOL]     assertEquals(Long.valueOf(VALUE), n); [EOL] } <line_num>: 77,93