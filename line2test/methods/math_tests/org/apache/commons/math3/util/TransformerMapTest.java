@Test [EOL] public void testPutTransformer() { [EOL]     NumberTransformer expected = new DefaultTransformer(); [EOL]     TransformerMap map = new TransformerMap(); [EOL]     map.putTransformer(TransformerMapTest.class, expected); [EOL]     Assert.assertEquals(expected, map.getTransformer(TransformerMapTest.class)); [EOL] } <line_num>: 32,39
@Test [EOL] public void testContainsClass() { [EOL]     NumberTransformer expected = new DefaultTransformer(); [EOL]     TransformerMap map = new TransformerMap(); [EOL]     map.putTransformer(TransformerMapTest.class, expected); [EOL]     Assert.assertTrue(map.containsClass(TransformerMapTest.class)); [EOL] } <line_num>: 44,50
@Test [EOL] public void testContainsTransformer() { [EOL]     NumberTransformer expected = new DefaultTransformer(); [EOL]     TransformerMap map = new TransformerMap(); [EOL]     map.putTransformer(TransformerMapTest.class, expected); [EOL]     Assert.assertTrue(map.containsTransformer(expected)); [EOL] } <line_num>: 55,61
@Test [EOL] public void testRemoveTransformer() { [EOL]     NumberTransformer expected = new DefaultTransformer(); [EOL]     TransformerMap map = new TransformerMap(); [EOL]     map.putTransformer(TransformerMapTest.class, expected); [EOL]     Assert.assertTrue(map.containsClass(TransformerMapTest.class)); [EOL]     Assert.assertTrue(map.containsTransformer(expected)); [EOL]     map.removeTransformer(TransformerMapTest.class); [EOL]     Assert.assertFalse(map.containsClass(TransformerMapTest.class)); [EOL]     Assert.assertFalse(map.containsTransformer(expected)); [EOL] } <line_num>: 66,77
@Test [EOL] public void testClear() { [EOL]     NumberTransformer expected = new DefaultTransformer(); [EOL]     TransformerMap map = new TransformerMap(); [EOL]     map.putTransformer(TransformerMapTest.class, expected); [EOL]     Assert.assertTrue(map.containsClass(TransformerMapTest.class)); [EOL]     map.clear(); [EOL]     Assert.assertFalse(map.containsClass(TransformerMapTest.class)); [EOL] } <line_num>: 82,91
@Test [EOL] public void testClasses() { [EOL]     NumberTransformer expected = new DefaultTransformer(); [EOL]     TransformerMap map = new TransformerMap(); [EOL]     map.putTransformer(TransformerMapTest.class, expected); [EOL]     Assert.assertTrue(map.classes().contains(TransformerMapTest.class)); [EOL] } <line_num>: 96,102
@Test [EOL] public void testTransformers() { [EOL]     NumberTransformer expected = new DefaultTransformer(); [EOL]     TransformerMap map = new TransformerMap(); [EOL]     map.putTransformer(TransformerMapTest.class, expected); [EOL]     Assert.assertTrue(map.transformers().contains(expected)); [EOL] } <line_num>: 107,113
@Test [EOL] public void testSerial() { [EOL]     NumberTransformer expected = new DefaultTransformer(); [EOL]     TransformerMap map = new TransformerMap(); [EOL]     map.putTransformer(TransformerMapTest.class, expected); [EOL]     Assert.assertEquals(map, TestUtils.serializeAndRecover(map)); [EOL] } <line_num>: 115,121