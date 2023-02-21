@Override [EOL] protected void setUp() throws Exception { [EOL]     super.setUp(); [EOL]     mapSerializer = new DefaultTypeAdapters.MapTypeAdapter(); [EOL] } <line_num>: 38,42
public void testEmptyMapNoTypeSerialization() { [EOL]     Map<String, String> emptyMap = new HashMap<String, String>(); [EOL]     JsonElement element = mapSerializer.serialize(emptyMap, emptyMap.getClass(), null); [EOL]     assertTrue(element instanceof JsonObject); [EOL]     JsonObject emptyMapJsonObject = (JsonObject) element; [EOL]     assertTrue(emptyMapJsonObject.entrySet().isEmpty()); [EOL] } <line_num>: 44,50
public void testEmptyMapSerialization() { [EOL]     Type mapType = new TypeToken<Map<String, String>>() { [EOL]     }.getType(); [EOL]     Map<String, String> emptyMap = new HashMap<String, String>(); [EOL]     JsonElement element = mapSerializer.serialize(emptyMap, mapType, null); [EOL]     assertTrue(element instanceof JsonObject); [EOL]     JsonObject emptyMapJsonObject = (JsonObject) element; [EOL]     assertTrue(emptyMapJsonObject.entrySet().isEmpty()); [EOL] } <line_num>: 52,60
