public ContextualKeySerializer() { [EOL]     this(""); [EOL] } <line_num>: 34,34
public ContextualKeySerializer(String p) { [EOL]     _prefix = p; [EOL] } <line_num>: 35,37
protected ContextualDeser(String p) { [EOL]     _prefix = p; [EOL] } <line_num>: 62,64
@Override [EOL] public void serialize(String value, JsonGenerator jgen, SerializerProvider provider) throws IOException { [EOL]     if (_prefix != null) { [EOL]         value = _prefix + value; [EOL]     } [EOL]     jgen.writeFieldName(value); [EOL] } <line_num>: 39,46
@Override [EOL] public JsonSerializer<?> createContextual(SerializerProvider prov, BeanProperty property) throws JsonMappingException { [EOL]     return new ContextualKeySerializer(_prefix + ":"); [EOL] } <line_num>: 48,53
@Override [EOL] public Object deserializeKey(String key, DeserializationContext ctxt) throws IOException, JsonProcessingException { [EOL]     return _prefix + ":" + key; [EOL] } <line_num>: 66,71
@Override [EOL] public KeyDeserializer createContextual(DeserializationContext ctxt, BeanProperty property) throws JsonMappingException { [EOL]     return new ContextualDeser((property == null) ? "ROOT" : property.getName()); [EOL] } <line_num>: 73,78
public void testSimpleKeySer() throws Exception { [EOL]     ObjectMapper mapper = new ObjectMapper(); [EOL]     SimpleModule module = new SimpleModule("test", Version.unknownVersion()); [EOL]     module.addKeySerializer(String.class, new ContextualKeySerializer("prefix")); [EOL]     mapper.registerModule(module); [EOL]     Map<String, Object> input = new HashMap<String, Object>(); [EOL]     input.put("a", Integer.valueOf(3)); [EOL]     String json = mapper.writerWithType(TypeFactory.defaultInstance().constructMapType(HashMap.class, String.class, Object.class)).writeValueAsString(input); [EOL]     assertEquals("{\"prefix:a\":3}", json); [EOL] } <line_num>: 91,102
public void testSimpleKeyDeser() throws Exception { [EOL]     ObjectMapper mapper = new ObjectMapper(); [EOL]     SimpleModule module = new SimpleModule("test", Version.unknownVersion()); [EOL]     module.addKeyDeserializer(String.class, new ContextualDeser("???")); [EOL]     mapper.registerModule(module); [EOL]     MapBean result = mapper.readValue("{\"map\":{\"a\":3}}", MapBean.class); [EOL]     Map<String, Integer> map = result.map; [EOL]     assertNotNull(map); [EOL]     assertEquals(1, map.size()); [EOL]     Map.Entry<String, Integer> entry = map.entrySet().iterator().next(); [EOL]     assertEquals(Integer.valueOf(3), entry.getValue()); [EOL]     assertEquals("map:a", entry.getKey()); [EOL] } <line_num>: 110,123