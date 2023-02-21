@Before [EOL] public void setUp() throws Exception { [EOL]     javaMap.put(50, 100.0); [EOL]     javaMap.put(75, 75.0); [EOL]     javaMap.put(25, 500.0); [EOL]     javaMap.put(Integer.MAX_VALUE, Double.MAX_VALUE); [EOL]     javaMap.put(0, -1.0); [EOL]     javaMap.put(1, 0.0); [EOL]     javaMap.put(33, -0.1); [EOL]     javaMap.put(23234234, -242343.0); [EOL]     javaMap.put(23321, Double.MIN_VALUE); [EOL]     javaMap.put(-4444, 332.0); [EOL]     javaMap.put(-1, -2323.0); [EOL]     javaMap.put(Integer.MIN_VALUE, 44.0); [EOL]     javaMap.putAll(generate()); [EOL] } <line_num>: 40,58
private Map<Integer, Double> generate() { [EOL]     Map<Integer, Double> map = new HashMap<Integer, Double>(); [EOL]     Random r = new Random(); [EOL]     for (int i = 0; i < 2000; ++i) map.put(r.nextInt(), r.nextDouble()); [EOL]     return map; [EOL] } <line_num>: 60,66
private OpenIntToDoubleHashMap createFromJavaMap() { [EOL]     OpenIntToDoubleHashMap map = new OpenIntToDoubleHashMap(); [EOL]     for (Map.Entry<Integer, Double> mapEntry : javaMap.entrySet()) { [EOL]         map.put(mapEntry.getKey(), mapEntry.getValue()); [EOL]     } [EOL]     return map; [EOL] } <line_num>: 68,74
@Test [EOL] public void testPutAndGetWith0ExpectedSize() { [EOL]     OpenIntToDoubleHashMap map = new OpenIntToDoubleHashMap(0); [EOL]     assertPutAndGet(map); [EOL] } <line_num>: 76,80
@Test [EOL] public void testPutAndGetWithExpectedSize() { [EOL]     OpenIntToDoubleHashMap map = new OpenIntToDoubleHashMap(500); [EOL]     assertPutAndGet(map); [EOL] } <line_num>: 82,86
@Test [EOL] public void testPutAndGet() { [EOL]     OpenIntToDoubleHashMap map = new OpenIntToDoubleHashMap(); [EOL]     assertPutAndGet(map); [EOL] } <line_num>: 88,92
private void assertPutAndGet(OpenIntToDoubleHashMap map) { [EOL]     assertPutAndGet(map, 0, new HashSet<Integer>()); [EOL] } <line_num>: 94,96
private void assertPutAndGet(OpenIntToDoubleHashMap map, int mapSize, Set<Integer> keysInMap) { [EOL]     Assert.assertEquals(mapSize, map.size()); [EOL]     for (Map.Entry<Integer, Double> mapEntry : javaMap.entrySet()) { [EOL]         map.put(mapEntry.getKey(), mapEntry.getValue()); [EOL]         if (!keysInMap.contains(mapEntry.getKey())) [EOL]             ++mapSize; [EOL]         Assert.assertEquals(mapSize, map.size()); [EOL]         Assert.assertTrue(Precision.equals(mapEntry.getValue(), map.get(mapEntry.getKey()), 1)); [EOL]     } [EOL] } <line_num>: 98,108
@Test [EOL] public void testPutAbsentOnExisting() { [EOL]     OpenIntToDoubleHashMap map = createFromJavaMap(); [EOL]     int size = javaMap.size(); [EOL]     for (Map.Entry<Integer, Double> mapEntry : generateAbsent().entrySet()) { [EOL]         map.put(mapEntry.getKey(), mapEntry.getValue()); [EOL]         Assert.assertEquals(++size, map.size()); [EOL]         Assert.assertTrue(Precision.equals(mapEntry.getValue(), map.get(mapEntry.getKey()), 1)); [EOL]     } [EOL] } <line_num>: 110,119
@Test [EOL] public void testPutOnExisting() { [EOL]     OpenIntToDoubleHashMap map = createFromJavaMap(); [EOL]     for (Map.Entry<Integer, Double> mapEntry : javaMap.entrySet()) { [EOL]         map.put(mapEntry.getKey(), mapEntry.getValue()); [EOL]         Assert.assertEquals(javaMap.size(), map.size()); [EOL]         Assert.assertTrue(Precision.equals(mapEntry.getValue(), map.get(mapEntry.getKey()), 1)); [EOL]     } [EOL] } <line_num>: 121,129
@Test [EOL] public void testGetAbsent() { [EOL]     Map<Integer, Double> generated = generateAbsent(); [EOL]     OpenIntToDoubleHashMap map = createFromJavaMap(); [EOL]     for (Map.Entry<Integer, Double> mapEntry : generated.entrySet()) Assert.assertTrue(Double.isNaN(map.get(mapEntry.getKey()))); [EOL] } <line_num>: 131,138
@Test [EOL] public void testGetFromEmpty() { [EOL]     OpenIntToDoubleHashMap map = new OpenIntToDoubleHashMap(); [EOL]     Assert.assertTrue(Double.isNaN(map.get(5))); [EOL]     Assert.assertTrue(Double.isNaN(map.get(0))); [EOL]     Assert.assertTrue(Double.isNaN(map.get(50))); [EOL] } <line_num>: 140,146
@Test [EOL] public void testRemove() { [EOL]     OpenIntToDoubleHashMap map = createFromJavaMap(); [EOL]     int mapSize = javaMap.size(); [EOL]     Assert.assertEquals(mapSize, map.size()); [EOL]     for (Map.Entry<Integer, Double> mapEntry : javaMap.entrySet()) { [EOL]         map.remove(mapEntry.getKey()); [EOL]         Assert.assertEquals(--mapSize, map.size()); [EOL]         Assert.assertTrue(Double.isNaN(map.get(mapEntry.getKey()))); [EOL]     } [EOL]     assertPutAndGet(map); [EOL] } <line_num>: 148,161
@Test [EOL] public void testRemove2() { [EOL]     OpenIntToDoubleHashMap map = createFromJavaMap(); [EOL]     int mapSize = javaMap.size(); [EOL]     int count = 0; [EOL]     Set<Integer> keysInMap = new HashSet<Integer>(javaMap.keySet()); [EOL]     for (Map.Entry<Integer, Double> mapEntry : javaMap.entrySet()) { [EOL]         keysInMap.remove(mapEntry.getKey()); [EOL]         map.remove(mapEntry.getKey()); [EOL]         Assert.assertEquals(--mapSize, map.size()); [EOL]         Assert.assertTrue(Double.isNaN(map.get(mapEntry.getKey()))); [EOL]         if (count++ > 5) [EOL]             break; [EOL]     } [EOL]     assertPutAndGet(map, mapSize, keysInMap); [EOL] } <line_num>: 164,181
@Test [EOL] public void testRemoveFromEmpty() { [EOL]     OpenIntToDoubleHashMap map = new OpenIntToDoubleHashMap(); [EOL]     Assert.assertTrue(Double.isNaN(map.remove(50))); [EOL] } <line_num>: 183,187
@Test [EOL] public void testRemoveAbsent() { [EOL]     Map<Integer, Double> generated = generateAbsent(); [EOL]     OpenIntToDoubleHashMap map = createFromJavaMap(); [EOL]     int mapSize = map.size(); [EOL]     for (Map.Entry<Integer, Double> mapEntry : generated.entrySet()) { [EOL]         map.remove(mapEntry.getKey()); [EOL]         Assert.assertEquals(mapSize, map.size()); [EOL]         Assert.assertTrue(Double.isNaN(map.get(mapEntry.getKey()))); [EOL]     } [EOL] } <line_num>: 189,201
private Map<Integer, Double> generateAbsent() { [EOL]     Map<Integer, Double> generated = new HashMap<Integer, Double>(); [EOL]     do { [EOL]         generated.putAll(generate()); [EOL]         for (Integer key : javaMap.keySet()) generated.remove(key); [EOL]     } while (generated.size() < 100); [EOL]     return generated; [EOL] } <line_num>: 206,214
@Test [EOL] public void testCopy() { [EOL]     OpenIntToDoubleHashMap copy = new OpenIntToDoubleHashMap(createFromJavaMap()); [EOL]     Assert.assertEquals(javaMap.size(), copy.size()); [EOL]     for (Map.Entry<Integer, Double> mapEntry : javaMap.entrySet()) Assert.assertTrue(Precision.equals(mapEntry.getValue(), copy.get(mapEntry.getKey()), 1)); [EOL] } <line_num>: 216,224
@Test [EOL] public void testContainsKey() { [EOL]     OpenIntToDoubleHashMap map = createFromJavaMap(); [EOL]     for (Map.Entry<Integer, Double> mapEntry : javaMap.entrySet()) { [EOL]         Assert.assertTrue(map.containsKey(mapEntry.getKey())); [EOL]     } [EOL]     for (Map.Entry<Integer, Double> mapEntry : generateAbsent().entrySet()) { [EOL]         Assert.assertFalse(map.containsKey(mapEntry.getKey())); [EOL]     } [EOL]     for (Map.Entry<Integer, Double> mapEntry : javaMap.entrySet()) { [EOL]         int key = mapEntry.getKey(); [EOL]         Assert.assertTrue(map.containsKey(key)); [EOL]         map.remove(key); [EOL]         Assert.assertFalse(map.containsKey(key)); [EOL]     } [EOL] } <line_num>: 226,241
@Test [EOL] public void testIterator() { [EOL]     OpenIntToDoubleHashMap map = createFromJavaMap(); [EOL]     OpenIntToDoubleHashMap.Iterator iterator = map.iterator(); [EOL]     for (int i = 0; i < map.size(); ++i) { [EOL]         Assert.assertTrue(iterator.hasNext()); [EOL]         iterator.advance(); [EOL]         int key = iterator.key(); [EOL]         Assert.assertTrue(map.containsKey(key)); [EOL]         Assert.assertEquals(javaMap.get(key), map.get(key), 0); [EOL]         Assert.assertEquals(javaMap.get(key), iterator.value(), 0); [EOL]         Assert.assertTrue(javaMap.containsKey(key)); [EOL]     } [EOL]     Assert.assertFalse(iterator.hasNext()); [EOL]     try { [EOL]         iterator.advance(); [EOL]         Assert.fail("an exception should have been thrown"); [EOL]     } catch (NoSuchElementException nsee) { [EOL]     } [EOL] } <line_num>: 243,263
@Test [EOL] public void testConcurrentModification() { [EOL]     OpenIntToDoubleHashMap map = createFromJavaMap(); [EOL]     OpenIntToDoubleHashMap.Iterator iterator = map.iterator(); [EOL]     map.put(3, 3); [EOL]     try { [EOL]         iterator.advance(); [EOL]         Assert.fail("an exception should have been thrown"); [EOL]     } catch (ConcurrentModificationException cme) { [EOL]     } [EOL] } <line_num>: 265,276
@Test [EOL] public void testPutKeysWithCollisions() { [EOL]     OpenIntToDoubleHashMap map = new OpenIntToDoubleHashMap(); [EOL]     int key1 = -1996012590; [EOL]     double value1 = 1.0; [EOL]     map.put(key1, value1); [EOL]     int key2 = 835099822; [EOL]     map.put(key2, value1); [EOL]     int key3 = 1008859686; [EOL]     map.put(key3, value1); [EOL]     Assert.assertTrue(Precision.equals(value1, map.get(key3), 1)); [EOL]     Assert.assertEquals(3, map.size()); [EOL]     map.remove(key2); [EOL]     double value2 = 2.0; [EOL]     map.put(key3, value2); [EOL]     Assert.assertTrue(Precision.equals(value2, map.get(key3), 1)); [EOL]     Assert.assertEquals(2, map.size()); [EOL] } <line_num>: 283,301
@Test [EOL] public void testPutKeysWithCollision2() { [EOL]     OpenIntToDoubleHashMap map = new OpenIntToDoubleHashMap(); [EOL]     int key1 = 837989881; [EOL]     double value1 = 1.0; [EOL]     map.put(key1, value1); [EOL]     int key2 = 476463321; [EOL]     map.put(key2, value1); [EOL]     Assert.assertEquals(2, map.size()); [EOL]     Assert.assertTrue(Precision.equals(value1, map.get(key2), 1)); [EOL]     map.remove(key1); [EOL]     double value2 = 2.0; [EOL]     map.put(key2, value2); [EOL]     Assert.assertEquals(1, map.size()); [EOL]     Assert.assertTrue(Precision.equals(value2, map.get(key2), 1)); [EOL] } <line_num>: 307,323
