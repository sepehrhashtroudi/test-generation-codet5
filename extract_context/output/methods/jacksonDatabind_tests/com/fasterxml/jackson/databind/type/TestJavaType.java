private MyEnum2(int value) { [EOL] } <line_num>: 22,22
public void testSimpleClass() { [EOL]     TypeFactory tf = TypeFactory.defaultInstance(); [EOL]     JavaType baseType = tf.constructType(BaseType.class); [EOL]     assertSame(BaseType.class, baseType.getRawClass()); [EOL]     assertTrue(baseType.hasRawClass(BaseType.class)); [EOL]     assertFalse(baseType.isArrayType()); [EOL]     assertFalse(baseType.isContainerType()); [EOL]     assertFalse(baseType.isEnumType()); [EOL]     assertFalse(baseType.isInterface()); [EOL]     assertFalse(baseType.isPrimitive()); [EOL]     assertNull(baseType.getContentType()); [EOL]     assertNull(baseType.getValueHandler()); [EOL]     assertSame(baseType, baseType.narrowBy(BaseType.class)); [EOL]     assertSame(baseType, baseType.widenBy(BaseType.class)); [EOL]     try { [EOL]         baseType.narrowBy(SubType.class); [EOL]     } catch (IllegalArgumentException e) { [EOL]         verifyException(e, "should never be called"); [EOL]     } [EOL] } <line_num>: 31,74
public void testMapType() { [EOL]     TypeFactory tf = TypeFactory.defaultInstance(); [EOL]     JavaType keyT = tf.constructType(String.class); [EOL]     JavaType baseT = tf.constructType(BaseType.class); [EOL]     MapType mapT = MapType.construct(Map.class, keyT, baseT); [EOL]     assertNotNull(mapT); [EOL]     assertTrue(mapT.isContainerType()); [EOL]     assertSame(mapT, mapT.narrowContentsBy(BaseType.class)); [EOL]     assertSame(mapT, mapT.narrowKey(String.class)); [EOL]     assertTrue(mapT.equals(mapT)); [EOL]     assertFalse(mapT.equals(null)); [EOL]     assertFalse(mapT.equals("xyz")); [EOL]     MapType mapT2 = MapType.construct(HashMap.class, keyT, baseT); [EOL]     assertFalse(mapT.equals(mapT2)); [EOL]     try { [EOL]         SimpleType.construct(HashMap.class); [EOL]     } catch (IllegalArgumentException e) { [EOL]         verifyException(e, "for a Map"); [EOL]     } [EOL] } <line_num>: 76,103
public void testArrayType() { [EOL]     TypeFactory tf = TypeFactory.defaultInstance(); [EOL]     JavaType arrayT = ArrayType.construct(tf.constructType(String.class), null, null); [EOL]     assertNotNull(arrayT); [EOL]     assertTrue(arrayT.isContainerType()); [EOL]     assertSame(arrayT, arrayT.narrowContentsBy(String.class)); [EOL]     assertNotNull(arrayT.toString()); [EOL]     assertTrue(arrayT.equals(arrayT)); [EOL]     assertFalse(arrayT.equals(null)); [EOL]     assertFalse(arrayT.equals("xyz")); [EOL]     assertTrue(arrayT.equals(ArrayType.construct(tf.constructType(String.class), null, null))); [EOL]     assertFalse(arrayT.equals(ArrayType.construct(tf.constructType(Integer.class), null, null))); [EOL]     try { [EOL]         SimpleType.construct(String[].class); [EOL]     } catch (IllegalArgumentException e) { [EOL]         verifyException(e, "for an array"); [EOL]     } [EOL] } <line_num>: 105,130
public void testCollectionType() { [EOL]     TypeFactory tf = TypeFactory.defaultInstance(); [EOL]     JavaType collectionT = CollectionType.construct(List.class, tf.constructType(String.class)); [EOL]     assertNotNull(collectionT); [EOL]     assertTrue(collectionT.isContainerType()); [EOL]     assertSame(collectionT, collectionT.narrowContentsBy(String.class)); [EOL]     assertNotNull(collectionT.toString()); [EOL]     assertTrue(collectionT.equals(collectionT)); [EOL]     assertFalse(collectionT.equals(null)); [EOL]     assertFalse(collectionT.equals("xyz")); [EOL]     assertTrue(collectionT.equals(CollectionType.construct(List.class, tf.constructType(String.class)))); [EOL]     assertFalse(collectionT.equals(CollectionType.construct(Set.class, tf.constructType(String.class)))); [EOL]     try { [EOL]         SimpleType.construct(ArrayList.class); [EOL]     } catch (IllegalArgumentException e) { [EOL]         verifyException(e, "for a Collection"); [EOL]     } [EOL] } <line_num>: 132,158
public void testEnumType() { [EOL]     TypeFactory tf = TypeFactory.defaultInstance(); [EOL]     assertTrue(tf.constructType(MyEnum.class).isEnumType()); [EOL]     assertTrue(tf.constructType(MyEnum2.class).isEnumType()); [EOL]     assertTrue(tf.constructType(MyEnum.A.getClass()).isEnumType()); [EOL]     assertTrue(tf.constructType(MyEnum2.A.getClass()).isEnumType()); [EOL] } <line_num>: 160,167
public void testClassKey() { [EOL]     ClassKey key = new ClassKey(String.class); [EOL]     assertEquals(0, key.compareTo(key)); [EOL]     assertTrue(key.equals(key)); [EOL]     assertFalse(key.equals(null)); [EOL]     assertFalse(key.equals("foo")); [EOL]     assertFalse(key.equals(new ClassKey(Integer.class))); [EOL]     assertEquals(String.class.getName(), key.toString()); [EOL] } <line_num>: 169,178
public void testJavaTypeAsJLRType() { [EOL]     TypeFactory tf = TypeFactory.defaultInstance(); [EOL]     JavaType t1 = tf.constructType(getClass()); [EOL]     JavaType t2 = tf.constructType(t1); [EOL]     assertSame(t1, t2); [EOL] } <line_num>: 181,188