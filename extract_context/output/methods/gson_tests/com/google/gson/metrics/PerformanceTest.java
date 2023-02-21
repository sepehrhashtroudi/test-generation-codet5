@SuppressWarnings("unused") [EOL] private ExceptionHolder() { [EOL]     this("", ""); [EOL] } <line_num>: 85,88
public ExceptionHolder(String message, String stackTrace) { [EOL]     this.message = message; [EOL]     this.stackTrace = stackTrace; [EOL] } <line_num>: 89,92
private CollectionEntry() { [EOL]     this(null, null); [EOL] } <line_num>: 101,103
CollectionEntry(String name, String value) { [EOL]     this.name = name; [EOL]     this.value = value; [EOL] } <line_num>: 105,108
ClassWithList() { [EOL]     this(null); [EOL] } <line_num>: 302,304
ClassWithList(String field) { [EOL]     this.field = field; [EOL] } <line_num>: 305,307
ClassWithField() { [EOL]     this(""); [EOL] } <line_num>: 313,315
public ClassWithField(String field) { [EOL]     this.field = field; [EOL] } <line_num>: 316,318
ClassWithListOfObjects() { [EOL]     this(null); [EOL] } <line_num>: 327,329
ClassWithListOfObjects(String field) { [EOL]     this.field = field; [EOL] } <line_num>: 330,332
ClassWithExposedField() { [EOL]     this(""); [EOL] } <line_num>: 339,341
ClassWithExposedField(String field) { [EOL]     this.field = field; [EOL] } <line_num>: 342,344
@Override [EOL] protected void setUp() throws Exception { [EOL]     super.setUp(); [EOL]     gson = new Gson(); [EOL] } <line_num>: 47,51
public void testDummy() { [EOL] } <line_num>: 53,55
public void disabled_testStringDeserialization() { [EOL]     StringBuilder sb = new StringBuilder(8096); [EOL]     sb.append("Error Yippie"); [EOL]     while (true) { [EOL]         try { [EOL]             String stackTrace = sb.toString(); [EOL]             sb.append(stackTrace); [EOL]             String json = "{\"message\":\"Error message.\"," + "\"stackTrace\":\"" + stackTrace + "\"}"; [EOL]             parseLongJson(json); [EOL]             System.out.println("Gson could handle a string of size: " + stackTrace.length()); [EOL]         } catch (JsonParseException expected) { [EOL]             break; [EOL]         } [EOL]     } [EOL] } <line_num>: 57,72
private void parseLongJson(String json) throws JsonParseException { [EOL]     ExceptionHolder target = gson.fromJson(json, ExceptionHolder.class); [EOL]     assertTrue(target.message.contains("Error")); [EOL]     assertTrue(target.stackTrace.contains("Yippie")); [EOL] } <line_num>: 74,78
public void disabled_testLargeCollectionSerialization() { [EOL]     int count = 1400000; [EOL]     List<CollectionEntry> list = new ArrayList<CollectionEntry>(count); [EOL]     for (int i = 0; i < count; ++i) { [EOL]         list.add(new CollectionEntry("name" + i, "value" + i)); [EOL]     } [EOL]     gson.toJson(list); [EOL] } <line_num>: 114,121
public void disabled_testLargeCollectionDeserialization() { [EOL]     StringBuilder sb = new StringBuilder(); [EOL]     int count = 87000; [EOL]     boolean first = true; [EOL]     sb.append('['); [EOL]     for (int i = 0; i < count; ++i) { [EOL]         if (first) { [EOL]             first = false; [EOL]         } else { [EOL]             sb.append(','); [EOL]         } [EOL]         sb.append("{name:'name").append(i).append("',value:'value").append(i).append("'}"); [EOL]     } [EOL]     sb.append(']'); [EOL]     String json = sb.toString(); [EOL]     Type collectionType = new TypeToken<ArrayList<CollectionEntry>>() { [EOL]     }.getType(); [EOL]     List<CollectionEntry> list = gson.fromJson(json, collectionType); [EOL]     assertEquals(count, list.size()); [EOL] } <line_num>: 126,144
public void disabled_testByteArraySerialization() { [EOL]     for (int size = 4145152; true; size += 1036288) { [EOL]         byte[] ba = new byte[size]; [EOL]         for (int i = 0; i < size; ++i) { [EOL]             ba[i] = 0x05; [EOL]         } [EOL]         gson.toJson(ba); [EOL]         System.out.printf("Gson could serialize a byte array of size: %d\n", size); [EOL]     } [EOL] } <line_num>: 150,159
public void disable_testByteArrayDeserialization() { [EOL]     for (int numElements = 10639296; true; numElements += 16384) { [EOL]         StringBuilder sb = new StringBuilder(numElements * 2); [EOL]         sb.append("["); [EOL]         boolean first = true; [EOL]         for (int i = 0; i < numElements; ++i) { [EOL]             if (first) { [EOL]                 first = false; [EOL]             } else { [EOL]                 sb.append(","); [EOL]             } [EOL]             sb.append("5"); [EOL]         } [EOL]         sb.append("]"); [EOL]         String json = sb.toString(); [EOL]         byte[] ba = gson.fromJson(json, byte[].class); [EOL]         System.out.printf("Gson could deserialize a byte array of size: %d\n", ba.length); [EOL]     } [EOL] } <line_num>: 165,183
public void disabled_testSerializeClasses() { [EOL]     ClassWithList c = new ClassWithList("str"); [EOL]     for (int i = 0; i < COLLECTION_SIZE; ++i) { [EOL]         c.list.add(new ClassWithField("element-" + i)); [EOL]     } [EOL]     StringWriter w = new StringWriter(); [EOL]     long t1 = System.currentTimeMillis(); [EOL]     for (int i = 0; i < NUM_ITERATIONS; ++i) { [EOL]         gson.toJson(c, w); [EOL]     } [EOL]     long t2 = System.currentTimeMillis(); [EOL]     long avg = (t2 - t1) / NUM_ITERATIONS; [EOL]     System.out.printf("Serialize classes avg time: %d ms\n", avg); [EOL] } <line_num>: 194,207
public void disabled_testDeserializeClasses() { [EOL]     String json = buildJsonForClassWithList(); [EOL]     ClassWithList[] target = new ClassWithList[NUM_ITERATIONS]; [EOL]     long t1 = System.currentTimeMillis(); [EOL]     for (int i = 0; i < NUM_ITERATIONS; ++i) { [EOL]         target[i] = gson.fromJson(json, ClassWithList.class); [EOL]     } [EOL]     long t2 = System.currentTimeMillis(); [EOL]     long avg = (t2 - t1) / NUM_ITERATIONS; [EOL]     System.out.printf("Deserialize classes avg time: %d ms\n", avg); [EOL] } <line_num>: 209,219
public void disable_testLargeObjectSerializationAndDeserialization() { [EOL]     Map<String, Long> largeObject = new HashMap<String, Long>(); [EOL]     for (long l = 0; l < 100000; l++) { [EOL]         largeObject.put("field" + l, l); [EOL]     } [EOL]     long t1 = System.currentTimeMillis(); [EOL]     String json = gson.toJson(largeObject); [EOL]     long t2 = System.currentTimeMillis(); [EOL]     System.out.printf("Large object serialized in: %d ms\n", (t2 - t1)); [EOL]     t1 = System.currentTimeMillis(); [EOL]     gson.fromJson(json, new TypeToken<Map<String, Long>>() { [EOL]     }.getType()); [EOL]     t2 = System.currentTimeMillis(); [EOL]     System.out.printf("Large object deserialized in: %d ms\n", (t2 - t1)); [EOL] } <line_num>: 221,237
public void disabled_testSerializeExposedClasses() { [EOL]     ClassWithListOfObjects c1 = new ClassWithListOfObjects("str"); [EOL]     for (int i1 = 0; i1 < COLLECTION_SIZE; ++i1) { [EOL]         c1.list.add(new ClassWithExposedField("element-" + i1)); [EOL]     } [EOL]     ClassWithListOfObjects c = c1; [EOL]     StringWriter w = new StringWriter(); [EOL]     long t1 = System.currentTimeMillis(); [EOL]     for (int i = 0; i < NUM_ITERATIONS; ++i) { [EOL]         gson.toJson(c, w); [EOL]     } [EOL]     long t2 = System.currentTimeMillis(); [EOL]     long avg = (t2 - t1) / NUM_ITERATIONS; [EOL]     System.out.printf("Serialize exposed classes avg time: %d ms\n", avg); [EOL] } <line_num>: 239,253
public void disabled_testDeserializeExposedClasses() { [EOL]     String json = buildJsonForClassWithList(); [EOL]     ClassWithListOfObjects[] target = new ClassWithListOfObjects[NUM_ITERATIONS]; [EOL]     long t1 = System.currentTimeMillis(); [EOL]     for (int i = 0; i < NUM_ITERATIONS; ++i) { [EOL]         target[i] = gson.fromJson(json, ClassWithListOfObjects.class); [EOL]     } [EOL]     long t2 = System.currentTimeMillis(); [EOL]     long avg = (t2 - t1) / NUM_ITERATIONS; [EOL]     System.out.printf("Deserialize exposed classes avg time: %d ms\n", avg); [EOL] } <line_num>: 255,265
public void disabled_testLargeGsonMapRoundTrip() throws Exception { [EOL]     Map<Long, Long> original = new HashMap<Long, Long>(); [EOL]     for (long i = 0; i < 1000000; i++) { [EOL]         original.put(i, i + 1); [EOL]     } [EOL]     Gson gson = new Gson(); [EOL]     String json = gson.toJson(original); [EOL]     Type longToLong = new TypeToken<Map<Long, Long>>() { [EOL]     }.getType(); [EOL]     gson.fromJson(json, longToLong); [EOL] } <line_num>: 267,277
private String buildJsonForClassWithList() { [EOL]     StringBuilder sb = new StringBuilder("{"); [EOL]     sb.append("field:").append("'str',"); [EOL]     sb.append("list:["); [EOL]     boolean first = true; [EOL]     for (int i = 0; i < COLLECTION_SIZE; ++i) { [EOL]         if (first) { [EOL]             first = false; [EOL]         } else { [EOL]             sb.append(","); [EOL]         } [EOL]         sb.append("{field:'element-" + i + "'}"); [EOL]     } [EOL]     sb.append("]"); [EOL]     sb.append("}"); [EOL]     String json = sb.toString(); [EOL]     return json; [EOL] } <line_num>: 279,296