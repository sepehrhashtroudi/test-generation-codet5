@SuppressWarnings("unused") [EOL] private SubTypeOfNested() { [EOL]     this(null, null); [EOL] } <line_num>: 129,132
public SubTypeOfNested(BagOfPrimitives primitive1, BagOfPrimitives primitive2) { [EOL]     super(primitive1, primitive2); [EOL] } <line_num>: 134,136
@SuppressWarnings("unused") [EOL] private ClassWithSubInterfacesOfCollection() { [EOL] } <line_num>: 190,192
public ClassWithSubInterfacesOfCollection(List<Integer> list, Queue<Long> queue, Set<Float> set, SortedSet<Character> sortedSet) { [EOL]     this.list = list; [EOL]     this.queue = queue; [EOL]     this.set = set; [EOL]     this.sortedSet = sortedSet; [EOL] } <line_num>: 194,200
@Override [EOL] protected void setUp() throws Exception { [EOL]     super.setUp(); [EOL]     gson = new Gson(); [EOL] } <line_num>: 49,53
public void testSubClassSerialization() throws Exception { [EOL]     SubTypeOfNested target = new SubTypeOfNested(new BagOfPrimitives(10, 20, false, "stringValue"), new BagOfPrimitives(30, 40, true, "stringValue")); [EOL]     assertEquals(target.getExpectedJson(), gson.toJson(target)); [EOL] } <line_num>: 55,59
public void testSubClassDeserialization() throws Exception { [EOL]     String json = "{\"value\":5,\"primitive1\":{\"longValue\":10,\"intValue\":20," + "\"booleanValue\":false,\"stringValue\":\"stringValue\"},\"primitive2\":" + "{\"longValue\":30,\"intValue\":40,\"booleanValue\":true," + "\"stringValue\":\"stringValue\"}}"; [EOL]     SubTypeOfNested target = gson.fromJson(json, SubTypeOfNested.class); [EOL]     assertEquals(json, target.getExpectedJson()); [EOL] } <line_num>: 61,68
public void testClassWithBaseFieldSerialization() { [EOL]     ClassWithBaseField sub = new ClassWithBaseField(new Sub()); [EOL]     JsonObject json = (JsonObject) gson.toJsonTree(sub); [EOL]     JsonElement base = json.getAsJsonObject().get(ClassWithBaseField.FIELD_KEY); [EOL]     assertEquals(Sub.SUB_NAME, base.getAsJsonObject().get(Sub.SUB_FIELD_KEY).getAsString()); [EOL] } <line_num>: 70,75
public void testClassWithBaseArrayFieldSerialization() { [EOL]     Base[] baseClasses = new Base[] { new Sub(), new Sub() }; [EOL]     ClassWithBaseArrayField sub = new ClassWithBaseArrayField(baseClasses); [EOL]     JsonObject json = gson.toJsonTree(sub).getAsJsonObject(); [EOL]     JsonArray bases = json.get(ClassWithBaseArrayField.FIELD_KEY).getAsJsonArray(); [EOL]     for (JsonElement element : bases) { [EOL]         assertEquals(Sub.SUB_NAME, element.getAsJsonObject().get(Sub.SUB_FIELD_KEY).getAsString()); [EOL]     } [EOL] } <line_num>: 77,85
public void testBaseSerializedAsSub() { [EOL]     Base base = new Sub(); [EOL]     JsonObject json = gson.toJsonTree(base).getAsJsonObject(); [EOL]     assertEquals(Sub.SUB_NAME, json.get(Sub.SUB_FIELD_KEY).getAsString()); [EOL] } <line_num>: 87,91
public void testBaseSerializedAsSubForToJsonMethod() { [EOL]     Base base = new Sub(); [EOL]     String json = gson.toJson(base); [EOL]     assertTrue(json.contains(Sub.SUB_NAME)); [EOL] } <line_num>: 93,97
public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitType() { [EOL]     Base base = new Sub(); [EOL]     JsonObject json = gson.toJsonTree(base, Base.class).getAsJsonObject(); [EOL]     assertEquals(Base.BASE_NAME, json.get(Base.BASE_FIELD_KEY).getAsString()); [EOL]     assertNull(json.get(Sub.SUB_FIELD_KEY)); [EOL] } <line_num>: 99,104
public void testBaseSerializedAsBaseWhenSpecifiedWithExplicitTypeForToJsonMethod() { [EOL]     Base base = new Sub(); [EOL]     String json = gson.toJson(base, Base.class); [EOL]     assertTrue(json.contains(Base.BASE_NAME)); [EOL]     assertFalse(json.contains(Sub.SUB_FIELD_KEY)); [EOL] } <line_num>: 106,111
public void testBaseSerializedAsSubWhenSpecifiedWithExplicitType() { [EOL]     Base base = new Sub(); [EOL]     JsonObject json = gson.toJsonTree(base, Sub.class).getAsJsonObject(); [EOL]     assertEquals(Sub.SUB_NAME, json.get(Sub.SUB_FIELD_KEY).getAsString()); [EOL] } <line_num>: 113,117
public void testBaseSerializedAsSubWhenSpecifiedWithExplicitTypeForToJsonMethod() { [EOL]     Base base = new Sub(); [EOL]     String json = gson.toJson(base, Sub.class); [EOL]     assertTrue(json.contains(Sub.SUB_NAME)); [EOL] } <line_num>: 119,123
@Override [EOL] public void appendFields(StringBuilder sb) { [EOL]     sb.append("\"value\":").append(value).append(","); [EOL]     super.appendFields(sb); [EOL] } <line_num>: 138,142
public void testSubInterfacesOfCollectionSerialization() throws Exception { [EOL]     List<Integer> list = new LinkedList<Integer>(); [EOL]     list.add(0); [EOL]     list.add(1); [EOL]     list.add(2); [EOL]     list.add(3); [EOL]     Queue<Long> queue = new LinkedList<Long>(); [EOL]     queue.add(0L); [EOL]     queue.add(1L); [EOL]     queue.add(2L); [EOL]     queue.add(3L); [EOL]     Set<Float> set = new TreeSet<Float>(); [EOL]     set.add(0.1F); [EOL]     set.add(0.2F); [EOL]     set.add(0.3F); [EOL]     set.add(0.4F); [EOL]     SortedSet<Character> sortedSet = new TreeSet<Character>(); [EOL]     sortedSet.add('a'); [EOL]     sortedSet.add('b'); [EOL]     sortedSet.add('c'); [EOL]     sortedSet.add('d'); [EOL]     ClassWithSubInterfacesOfCollection target = new ClassWithSubInterfacesOfCollection(list, queue, set, sortedSet); [EOL]     assertEquals(target.getExpectedJson(), gson.toJson(target)); [EOL] } <line_num>: 145,169
public void testSubInterfacesOfCollectionDeserialization() throws Exception { [EOL]     String json = "{\"list\":[0,1,2,3],\"queue\":[0,1,2,3],\"set\":[0.1,0.2,0.3,0.4]," + "\"sortedSet\":[\"a\",\"b\",\"c\",\"d\"]" + "}"; [EOL]     ClassWithSubInterfacesOfCollection target = gson.fromJson(json, ClassWithSubInterfacesOfCollection.class); [EOL]     assertTrue(target.listContains(0, 1, 2, 3)); [EOL]     assertTrue(target.queueContains(0, 1, 2, 3)); [EOL]     assertTrue(target.setContains(0.1F, 0.2F, 0.3F, 0.4F)); [EOL]     assertTrue(target.sortedSetContains('a', 'b', 'c', 'd')); [EOL] } <line_num>: 171,181
boolean listContains(int... values) { [EOL]     for (int value : values) { [EOL]         if (!list.contains(value)) { [EOL]             return false; [EOL]         } [EOL]     } [EOL]     return true; [EOL] } <line_num>: 202,209
boolean queueContains(long... values) { [EOL]     for (long value : values) { [EOL]         if (!queue.contains(value)) { [EOL]             return false; [EOL]         } [EOL]     } [EOL]     return true; [EOL] } <line_num>: 211,218
boolean setContains(float... values) { [EOL]     for (float value : values) { [EOL]         if (!set.contains(value)) { [EOL]             return false; [EOL]         } [EOL]     } [EOL]     return true; [EOL] } <line_num>: 220,227
boolean sortedSetContains(char... values) { [EOL]     for (char value : values) { [EOL]         if (!sortedSet.contains(value)) { [EOL]             return false; [EOL]         } [EOL]     } [EOL]     return true; [EOL] } <line_num>: 229,236
public String getExpectedJson() { [EOL]     StringBuilder sb = new StringBuilder(); [EOL]     sb.append("{"); [EOL]     sb.append("\"list\":"); [EOL]     append(sb, list).append(","); [EOL]     sb.append("\"queue\":"); [EOL]     append(sb, queue).append(","); [EOL]     sb.append("\"set\":"); [EOL]     append(sb, set).append(","); [EOL]     sb.append("\"sortedSet\":"); [EOL]     append(sb, sortedSet); [EOL]     sb.append("}"); [EOL]     return sb.toString(); [EOL] } <line_num>: 238,251
private StringBuilder append(StringBuilder sb, Collection<?> c) { [EOL]     sb.append("["); [EOL]     boolean first = true; [EOL]     for (Object o : c) { [EOL]         if (!first) { [EOL]             sb.append(","); [EOL]         } else { [EOL]             first = false; [EOL]         } [EOL]         if (o instanceof String || o instanceof Character) { [EOL]             sb.append('\"'); [EOL]         } [EOL]         sb.append(o.toString()); [EOL]         if (o instanceof String || o instanceof Character) { [EOL]             sb.append('\"'); [EOL]         } [EOL]     } [EOL]     sb.append("]"); [EOL]     return sb; [EOL] } <line_num>: 253,272
