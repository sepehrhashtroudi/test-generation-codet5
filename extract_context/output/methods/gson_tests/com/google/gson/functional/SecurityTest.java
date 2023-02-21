@Override [EOL] protected void setUp() throws Exception { [EOL]     super.setUp(); [EOL]     gsonBuilder = new GsonBuilder(); [EOL] } <line_num>: 38,42
public void testNonExecutableJsonSerialization() { [EOL]     Gson gson = gsonBuilder.generateNonExecutableJson().create(); [EOL]     String json = gson.toJson(new BagOfPrimitives()); [EOL]     assertTrue(json.startsWith(JSON_NON_EXECUTABLE_PREFIX)); [EOL] } <line_num>: 44,48
public void testNonExecutableJsonDeserialization() { [EOL]     String json = JSON_NON_EXECUTABLE_PREFIX + "{longValue:1}"; [EOL]     Gson gson = gsonBuilder.create(); [EOL]     BagOfPrimitives target = gson.fromJson(json, BagOfPrimitives.class); [EOL]     assertEquals(1, target.longValue); [EOL] } <line_num>: 50,55
public void testJsonWithNonExectuableTokenSerialization() { [EOL]     Gson gson = gsonBuilder.generateNonExecutableJson().create(); [EOL]     String json = gson.toJson(JSON_NON_EXECUTABLE_PREFIX); [EOL]     assertTrue(json.contains(")]}'\n")); [EOL] } <line_num>: 57,61
public void testJsonWithNonExectuableTokenWithRegularGsonDeserialization() { [EOL]     Gson gson = gsonBuilder.create(); [EOL]     String json = JSON_NON_EXECUTABLE_PREFIX + "{stringValue:')]}\\u0027\\n'}"; [EOL]     BagOfPrimitives target = gson.fromJson(json, BagOfPrimitives.class); [EOL]     assertEquals(")]}'\n", target.stringValue); [EOL] } <line_num>: 67,72
public void testJsonWithNonExectuableTokenWithConfiguredGsonDeserialization() { [EOL]     Gson gson = gsonBuilder.generateNonExecutableJson().create(); [EOL]     String json = JSON_NON_EXECUTABLE_PREFIX + "{intValue:2,stringValue:')]}\\u0027\\n'}"; [EOL]     BagOfPrimitives target = gson.fromJson(json, BagOfPrimitives.class); [EOL]     assertEquals(")]}'\n", target.stringValue); [EOL]     assertEquals(2, target.intValue); [EOL] } <line_num>: 78,85
