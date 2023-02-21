protected Animal(String n) { [EOL]     name = n; [EOL] } <line_num>: 28,28
private Dog() { [EOL]     super(null); [EOL] } <line_num>: 36,36
public Dog(String name, int b) { [EOL]     super(name); [EOL]     boneCount = b; [EOL] } <line_num>: 37,40
private Cat() { [EOL]     super(null); [EOL] } <line_num>: 48,48
public Cat(String name, String c) { [EOL]     super(name); [EOL]     furColor = c; [EOL] } <line_num>: 49,52
public AnimalWrapper(Animal a) { [EOL]     animal = a; [EOL] } <line_num>: 58,58
public void testSimpleClassAsProperty() throws Exception { [EOL]     Map<String, Object> result = writeAndMap(MAPPER, new Cat("Beelzebub", "tabby")); [EOL]     assertEquals(3, result.size()); [EOL]     assertEquals("Beelzebub", result.get("name")); [EOL]     assertEquals("tabby", result.get("furColor")); [EOL]     String classProp = Id.CLASS.getDefaultPropertyName(); [EOL]     assertEquals(Cat.class.getName(), result.get(classProp)); [EOL] } <line_num>: 88,97
public void testTypeAsWrapper() throws Exception { [EOL]     ObjectMapper m = new ObjectMapper(); [EOL]     m.addMixInAnnotations(Animal.class, TypeWithWrapper.class); [EOL]     Map<String, Object> result = writeAndMap(m, new Cat("Venla", "black")); [EOL]     assertEquals(1, result.size()); [EOL]     Map<?, ?> cat = (Map<?, ?>) result.get(".TestTypedSerialization$Cat"); [EOL]     assertNotNull(cat); [EOL]     assertEquals(2, cat.size()); [EOL]     assertEquals("Venla", cat.get("name")); [EOL]     assertEquals("black", cat.get("furColor")); [EOL] } <line_num>: 102,115
public void testTypeAsArray() throws Exception { [EOL]     ObjectMapper m = new ObjectMapper(); [EOL]     m.addMixInAnnotations(Animal.class, TypeWithArray.class); [EOL]     Map<String, Object> result = writeAndMap(m, new AnimalWrapper(new Dog("Amadeus", 7))); [EOL]     assertEquals(1, result.size()); [EOL]     List<?> l = (List<?>) result.get("animal"); [EOL]     assertNotNull(l); [EOL]     assertEquals(2, l.size()); [EOL]     assertEquals(Dog.class.getName(), l.get(0)); [EOL]     Map<?, ?> doggie = (Map<?, ?>) l.get(1); [EOL]     assertNotNull(doggie); [EOL]     assertEquals(2, doggie.size()); [EOL]     assertEquals("Amadeus", doggie.get("name")); [EOL]     assertEquals(Integer.valueOf(7), doggie.get("boneCount")); [EOL] } <line_num>: 120,137
@SuppressWarnings("unchecked") [EOL] public void testInArray() throws Exception { [EOL]     ObjectMapper m = new ObjectMapper(); [EOL]     m.disableDefaultTyping(); [EOL]     Animal[] animals = new Animal[] { new Cat("Miuku", "white"), new Dog("Murre", 9) }; [EOL]     Map<String, Object> map = new HashMap<String, Object>(); [EOL]     map.put("a", animals); [EOL]     String json = m.writeValueAsString(map); [EOL]     Map<String, Object> result = m.readValue(json, Map.class); [EOL]     assertEquals(1, result.size()); [EOL]     Object ob = result.get("a"); [EOL]     if (!(ob instanceof List<?>)) { [EOL]         fail("Did not map to entry with 'a' as List (but as " + ob.getClass().getName() + "): JSON == '" + json + "'"); [EOL]     } [EOL]     List<?> l = (List<?>) ob; [EOL]     assertNotNull(l); [EOL]     assertEquals(2, l.size()); [EOL]     Map<?, ?> a1 = (Map<?, ?>) l.get(0); [EOL]     assertEquals(3, a1.size()); [EOL]     String classProp = Id.CLASS.getDefaultPropertyName(); [EOL]     assertEquals(Cat.class.getName(), a1.get(classProp)); [EOL]     Map<?, ?> a2 = (Map<?, ?>) l.get(1); [EOL]     assertEquals(3, a2.size()); [EOL]     assertEquals(Dog.class.getName(), a2.get(classProp)); [EOL] } <line_num>: 148,177
public void testEmptyBean() throws Exception { [EOL]     ObjectMapper m = new ObjectMapper(); [EOL]     m.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false); [EOL]     assertEquals("{\"@type\":\"empty\"}", m.writeValueAsString(new Empty())); [EOL] } <line_num>: 182,187
public void testTypedMaps() throws Exception { [EOL]     ObjectMapper mapper = new ObjectMapper(); [EOL]     Map<Long, Collection<Super>> map = new HashMap<Long, Collection<Super>>(); [EOL]     List<Super> list = new ArrayList<Super>(); [EOL]     list.add(new A()); [EOL]     map.put(1L, list); [EOL]     String json = mapper.writerWithType(new TypeReference<Map<Long, Collection<Super>>>() { [EOL]     }).writeValueAsString(map); [EOL]     assertTrue("JSON does not contain '@class': " + json, json.contains("@class")); [EOL] } <line_num>: 192,202