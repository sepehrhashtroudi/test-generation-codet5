public TestObject(final int a) { [EOL]     this.a = a; [EOL] } <line_num>: 70,72
public TestSubObject() { [EOL]     super(0); [EOL] } <line_num>: 106,108
public TestSubObject(final int a, final int b, final int t) { [EOL]     super(a); [EOL]     this.b = b; [EOL]     this.t = t; [EOL] } <line_num>: 110,114
public TestObjectWithMultipleFields(final int one, final int two, final int three) { [EOL]     this.one = one; [EOL]     this.two = two; [EOL]     this.three = three; [EOL] } <line_num>: 508,512
@Override [EOL] public int hashCode() { [EOL]     return HashCodeBuilder.reflectionHashCode(this); [EOL] } <line_num>: 37,40
@Override [EOL] public int hashCode() { [EOL]     return HashCodeBuilder.reflectionHashCode(this); [EOL] } <line_num>: 49,52
@Test(expected = IllegalArgumentException.class) [EOL] public void testConstructorEx1() { [EOL]     new HashCodeBuilder(0, 0); [EOL] } <line_num>: 57,60
@Test(expected = IllegalArgumentException.class) [EOL] public void testConstructorEx2() { [EOL]     new HashCodeBuilder(2, 2); [EOL] } <line_num>: 62,65
@Override [EOL] public boolean equals(final Object o) { [EOL]     if (o == this) { [EOL]         return true; [EOL]     } [EOL]     if (!(o instanceof TestObject)) { [EOL]         return false; [EOL]     } [EOL]     final TestObject rhs = (TestObject) o; [EOL]     return a == rhs.a; [EOL] } <line_num>: 74,84
@Override [EOL] public int hashCode() { [EOL]     return a; [EOL] } <line_num>: 86,89
public void setA(final int a) { [EOL]     this.a = a; [EOL] } <line_num>: 91,93
public int getA() { [EOL]     return a; [EOL] } <line_num>: 95,97
@Override [EOL] public boolean equals(final Object o) { [EOL]     if (o == this) { [EOL]         return true; [EOL]     } [EOL]     if (!(o instanceof TestSubObject)) { [EOL]         return false; [EOL]     } [EOL]     final TestSubObject rhs = (TestSubObject) o; [EOL]     return super.equals(o) && b == rhs.b; [EOL] } <line_num>: 116,126
@Override [EOL] public int hashCode() { [EOL]     return b * 17 + super.hashCode(); [EOL] } <line_num>: 128,131
@Test [EOL] public void testReflectionHashCode() { [EOL]     assertEquals(17 * 37, HashCodeBuilder.reflectionHashCode(new TestObject(0))); [EOL]     assertEquals(17 * 37 + 123456, HashCodeBuilder.reflectionHashCode(new TestObject(123456))); [EOL] } <line_num>: 135,139
@Test [EOL] public void testReflectionHierarchyHashCode() { [EOL]     assertEquals(17 * 37 * 37, HashCodeBuilder.reflectionHashCode(new TestSubObject(0, 0, 0))); [EOL]     assertEquals(17 * 37 * 37 * 37, HashCodeBuilder.reflectionHashCode(new TestSubObject(0, 0, 0), true)); [EOL]     assertEquals((17 * 37 + 7890) * 37 + 123456, HashCodeBuilder.reflectionHashCode(new TestSubObject(123456, 7890, 0))); [EOL]     assertEquals(((17 * 37 + 7890) * 37 + 0) * 37 + 123456, HashCodeBuilder.reflectionHashCode(new TestSubObject(123456, 7890, 0), true)); [EOL] } <line_num>: 141,149
@Test(expected = IllegalArgumentException.class) [EOL] public void testReflectionHierarchyHashCodeEx1() { [EOL]     HashCodeBuilder.reflectionHashCode(0, 0, new TestSubObject(0, 0, 0), true); [EOL] } <line_num>: 151,154
@Test(expected = IllegalArgumentException.class) [EOL] public void testReflectionHierarchyHashCodeEx2() { [EOL]     HashCodeBuilder.reflectionHashCode(2, 2, new TestSubObject(0, 0, 0), true); [EOL] } <line_num>: 156,159
@Test(expected = IllegalArgumentException.class) [EOL] public void testReflectionHashCodeEx1() { [EOL]     HashCodeBuilder.reflectionHashCode(0, 0, new TestObject(0), true); [EOL] } <line_num>: 161,164
@Test(expected = IllegalArgumentException.class) [EOL] public void testReflectionHashCodeEx2() { [EOL]     HashCodeBuilder.reflectionHashCode(2, 2, new TestObject(0), true); [EOL] } <line_num>: 166,169
@Test(expected = IllegalArgumentException.class) [EOL] public void testReflectionHashCodeEx3() { [EOL]     HashCodeBuilder.reflectionHashCode(13, 19, null, true); [EOL] } <line_num>: 171,174
@Test [EOL] public void testSuper() { [EOL]     final Object obj = new Object(); [EOL]     assertEquals(17 * 37 + 19 * 41 + obj.hashCode(), new HashCodeBuilder(17, 37).appendSuper(new HashCodeBuilder(19, 41).append(obj).toHashCode()).toHashCode()); [EOL] } <line_num>: 176,181
@Test [EOL] public void testObject() { [EOL]     Object obj = null; [EOL]     assertEquals(17 * 37, new HashCodeBuilder(17, 37).append(obj).toHashCode()); [EOL]     obj = new Object(); [EOL]     assertEquals(17 * 37 + obj.hashCode(), new HashCodeBuilder(17, 37).append(obj).toHashCode()); [EOL] } <line_num>: 183,189
@Test [EOL] public void testObjectBuild() { [EOL]     Object obj = null; [EOL]     assertEquals(17 * 37, new HashCodeBuilder(17, 37).append(obj).build().intValue()); [EOL]     obj = new Object(); [EOL]     assertEquals(17 * 37 + obj.hashCode(), new HashCodeBuilder(17, 37).append(obj).build().intValue()); [EOL] } <line_num>: 191,197
@Test [EOL] @SuppressWarnings("cast") [EOL] public void testLong() { [EOL]     assertEquals(17 * 37, new HashCodeBuilder(17, 37).append((long) 0L).toHashCode()); [EOL]     assertEquals(17 * 37 + (int) (123456789L ^ 123456789L >> 32), new HashCodeBuilder(17, 37).append((long) 123456789L).toHashCode()); [EOL] } <line_num>: 199,205
@Test [EOL] @SuppressWarnings("cast") [EOL] public void testInt() { [EOL]     assertEquals(17 * 37, new HashCodeBuilder(17, 37).append((int) 0).toHashCode()); [EOL]     assertEquals(17 * 37 + 123456, new HashCodeBuilder(17, 37).append((int) 123456).toHashCode()); [EOL] } <line_num>: 207,212
@Test [EOL] public void testShort() { [EOL]     assertEquals(17 * 37, new HashCodeBuilder(17, 37).append((short) 0).toHashCode()); [EOL]     assertEquals(17 * 37 + 12345, new HashCodeBuilder(17, 37).append((short) 12345).toHashCode()); [EOL] } <line_num>: 214,218
@Test [EOL] public void testChar() { [EOL]     assertEquals(17 * 37, new HashCodeBuilder(17, 37).append((char) 0).toHashCode()); [EOL]     assertEquals(17 * 37 + 1234, new HashCodeBuilder(17, 37).append((char) 1234).toHashCode()); [EOL] } <line_num>: 220,224
@Test [EOL] public void testByte() { [EOL]     assertEquals(17 * 37, new HashCodeBuilder(17, 37).append((byte) 0).toHashCode()); [EOL]     assertEquals(17 * 37 + 123, new HashCodeBuilder(17, 37).append((byte) 123).toHashCode()); [EOL] } <line_num>: 226,230
@Test [EOL] @SuppressWarnings("cast") [EOL] public void testDouble() { [EOL]     assertEquals(17 * 37, new HashCodeBuilder(17, 37).append((double) 0d).toHashCode()); [EOL]     final double d = 1234567.89; [EOL]     final long l = Double.doubleToLongBits(d); [EOL]     assertEquals(17 * 37 + (int) (l ^ l >> 32), new HashCodeBuilder(17, 37).append(d).toHashCode()); [EOL] } <line_num>: 232,239
@Test [EOL] @SuppressWarnings("cast") [EOL] public void testFloat() { [EOL]     assertEquals(17 * 37, new HashCodeBuilder(17, 37).append((float) 0f).toHashCode()); [EOL]     final float f = 1234.89f; [EOL]     final int i = Float.floatToIntBits(f); [EOL]     assertEquals(17 * 37 + i, new HashCodeBuilder(17, 37).append(f).toHashCode()); [EOL] } <line_num>: 241,248
@Test [EOL] public void testBoolean() { [EOL]     assertEquals(17 * 37 + 0, new HashCodeBuilder(17, 37).append(true).toHashCode()); [EOL]     assertEquals(17 * 37 + 1, new HashCodeBuilder(17, 37).append(false).toHashCode()); [EOL] } <line_num>: 250,254
@Test [EOL] public void testObjectArray() { [EOL]     assertEquals(17 * 37, new HashCodeBuilder(17, 37).append((Object[]) null).toHashCode()); [EOL]     final Object[] obj = new Object[2]; [EOL]     assertEquals(17 * 37 * 37, new HashCodeBuilder(17, 37).append(obj).toHashCode()); [EOL]     obj[0] = new Object(); [EOL]     assertEquals((17 * 37 + obj[0].hashCode()) * 37, new HashCodeBuilder(17, 37).append(obj).toHashCode()); [EOL]     obj[1] = new Object(); [EOL]     assertEquals((17 * 37 + obj[0].hashCode()) * 37 + obj[1].hashCode(), new HashCodeBuilder(17, 37).append(obj).toHashCode()); [EOL] } <line_num>: 256,266
@Test [EOL] public void testObjectArrayAsObject() { [EOL]     final Object[] obj = new Object[2]; [EOL]     assertEquals(17 * 37 * 37, new HashCodeBuilder(17, 37).append((Object) obj).toHashCode()); [EOL]     obj[0] = new Object(); [EOL]     assertEquals((17 * 37 + obj[0].hashCode()) * 37, new HashCodeBuilder(17, 37).append((Object) obj).toHashCode()); [EOL]     obj[1] = new Object(); [EOL]     assertEquals((17 * 37 + obj[0].hashCode()) * 37 + obj[1].hashCode(), new HashCodeBuilder(17, 37).append((Object) obj).toHashCode()); [EOL] } <line_num>: 268,277
@Test [EOL] public void testLongArray() { [EOL]     assertEquals(17 * 37, new HashCodeBuilder(17, 37).append((long[]) null).toHashCode()); [EOL]     final long[] obj = new long[2]; [EOL]     assertEquals(17 * 37 * 37, new HashCodeBuilder(17, 37).append(obj).toHashCode()); [EOL]     obj[0] = 5L; [EOL]     final int h1 = (int) (5L ^ 5L >> 32); [EOL]     assertEquals((17 * 37 + h1) * 37, new HashCodeBuilder(17, 37).append(obj).toHashCode()); [EOL]     obj[1] = 6L; [EOL]     final int h2 = (int) (6L ^ 6L >> 32); [EOL]     assertEquals((17 * 37 + h1) * 37 + h2, new HashCodeBuilder(17, 37).append(obj).toHashCode()); [EOL] } <line_num>: 279,290
@Test [EOL] public void testLongArrayAsObject() { [EOL]     final long[] obj = new long[2]; [EOL]     assertEquals(17 * 37 * 37, new HashCodeBuilder(17, 37).append((Object) obj).toHashCode()); [EOL]     obj[0] = 5L; [EOL]     final int h1 = (int) (5L ^ 5L >> 32); [EOL]     assertEquals((17 * 37 + h1) * 37, new HashCodeBuilder(17, 37).append((Object) obj).toHashCode()); [EOL]     obj[1] = 6L; [EOL]     final int h2 = (int) (6L ^ 6L >> 32); [EOL]     assertEquals((17 * 37 + h1) * 37 + h2, new HashCodeBuilder(17, 37).append((Object) obj).toHashCode()); [EOL] } <line_num>: 292,302
@Test [EOL] public void testIntArray() { [EOL]     assertEquals(17 * 37, new HashCodeBuilder(17, 37).append((int[]) null).toHashCode()); [EOL]     final int[] obj = new int[2]; [EOL]     assertEquals(17 * 37 * 37, new HashCodeBuilder(17, 37).append(obj).toHashCode()); [EOL]     obj[0] = 5; [EOL]     assertEquals((17 * 37 + 5) * 37, new HashCodeBuilder(17, 37).append(obj).toHashCode()); [EOL]     obj[1] = 6; [EOL]     assertEquals((17 * 37 + 5) * 37 + 6, new HashCodeBuilder(17, 37).append(obj).toHashCode()); [EOL] } <line_num>: 304,313
@Test [EOL] public void testIntArrayAsObject() { [EOL]     final int[] obj = new int[2]; [EOL]     assertEquals(17 * 37 * 37, new HashCodeBuilder(17, 37).append((Object) obj).toHashCode()); [EOL]     obj[0] = 5; [EOL]     assertEquals((17 * 37 + 5) * 37, new HashCodeBuilder(17, 37).append((Object) obj).toHashCode()); [EOL]     obj[1] = 6; [EOL]     assertEquals((17 * 37 + 5) * 37 + 6, new HashCodeBuilder(17, 37).append((Object) obj).toHashCode()); [EOL] } <line_num>: 315,323
@Test [EOL] public void testShortArray() { [EOL]     assertEquals(17 * 37, new HashCodeBuilder(17, 37).append((short[]) null).toHashCode()); [EOL]     final short[] obj = new short[2]; [EOL]     assertEquals(17 * 37 * 37, new HashCodeBuilder(17, 37).append(obj).toHashCode()); [EOL]     obj[0] = (short) 5; [EOL]     assertEquals((17 * 37 + 5) * 37, new HashCodeBuilder(17, 37).append(obj).toHashCode()); [EOL]     obj[1] = (short) 6; [EOL]     assertEquals((17 * 37 + 5) * 37 + 6, new HashCodeBuilder(17, 37).append(obj).toHashCode()); [EOL] } <line_num>: 325,334
@Test [EOL] public void testShortArrayAsObject() { [EOL]     final short[] obj = new short[2]; [EOL]     assertEquals(17 * 37 * 37, new HashCodeBuilder(17, 37).append((Object) obj).toHashCode()); [EOL]     obj[0] = (short) 5; [EOL]     assertEquals((17 * 37 + 5) * 37, new HashCodeBuilder(17, 37).append((Object) obj).toHashCode()); [EOL]     obj[1] = (short) 6; [EOL]     assertEquals((17 * 37 + 5) * 37 + 6, new HashCodeBuilder(17, 37).append((Object) obj).toHashCode()); [EOL] } <line_num>: 336,344
@Test [EOL] public void testCharArray() { [EOL]     assertEquals(17 * 37, new HashCodeBuilder(17, 37).append((char[]) null).toHashCode()); [EOL]     final char[] obj = new char[2]; [EOL]     assertEquals(17 * 37 * 37, new HashCodeBuilder(17, 37).append(obj).toHashCode()); [EOL]     obj[0] = (char) 5; [EOL]     assertEquals((17 * 37 + 5) * 37, new HashCodeBuilder(17, 37).append(obj).toHashCode()); [EOL]     obj[1] = (char) 6; [EOL]     assertEquals((17 * 37 + 5) * 37 + 6, new HashCodeBuilder(17, 37).append(obj).toHashCode()); [EOL] } <line_num>: 346,355
@Test [EOL] public void testCharArrayAsObject() { [EOL]     final char[] obj = new char[2]; [EOL]     assertEquals(17 * 37 * 37, new HashCodeBuilder(17, 37).append((Object) obj).toHashCode()); [EOL]     obj[0] = (char) 5; [EOL]     assertEquals((17 * 37 + 5) * 37, new HashCodeBuilder(17, 37).append((Object) obj).toHashCode()); [EOL]     obj[1] = (char) 6; [EOL]     assertEquals((17 * 37 + 5) * 37 + 6, new HashCodeBuilder(17, 37).append((Object) obj).toHashCode()); [EOL] } <line_num>: 357,365
@Test [EOL] public void testByteArray() { [EOL]     assertEquals(17 * 37, new HashCodeBuilder(17, 37).append((byte[]) null).toHashCode()); [EOL]     final byte[] obj = new byte[2]; [EOL]     assertEquals(17 * 37 * 37, new HashCodeBuilder(17, 37).append(obj).toHashCode()); [EOL]     obj[0] = (byte) 5; [EOL]     assertEquals((17 * 37 + 5) * 37, new HashCodeBuilder(17, 37).append(obj).toHashCode()); [EOL]     obj[1] = (byte) 6; [EOL]     assertEquals((17 * 37 + 5) * 37 + 6, new HashCodeBuilder(17, 37).append(obj).toHashCode()); [EOL] } <line_num>: 367,376
@Test [EOL] public void testByteArrayAsObject() { [EOL]     final byte[] obj = new byte[2]; [EOL]     assertEquals(17 * 37 * 37, new HashCodeBuilder(17, 37).append((Object) obj).toHashCode()); [EOL]     obj[0] = (byte) 5; [EOL]     assertEquals((17 * 37 + 5) * 37, new HashCodeBuilder(17, 37).append((Object) obj).toHashCode()); [EOL]     obj[1] = (byte) 6; [EOL]     assertEquals((17 * 37 + 5) * 37 + 6, new HashCodeBuilder(17, 37).append((Object) obj).toHashCode()); [EOL] } <line_num>: 378,386
@Test [EOL] public void testDoubleArray() { [EOL]     assertEquals(17 * 37, new HashCodeBuilder(17, 37).append((double[]) null).toHashCode()); [EOL]     final double[] obj = new double[2]; [EOL]     assertEquals(17 * 37 * 37, new HashCodeBuilder(17, 37).append(obj).toHashCode()); [EOL]     obj[0] = 5.4d; [EOL]     final long l1 = Double.doubleToLongBits(5.4d); [EOL]     final int h1 = (int) (l1 ^ l1 >> 32); [EOL]     assertEquals((17 * 37 + h1) * 37, new HashCodeBuilder(17, 37).append(obj).toHashCode()); [EOL]     obj[1] = 6.3d; [EOL]     final long l2 = Double.doubleToLongBits(6.3d); [EOL]     final int h2 = (int) (l2 ^ l2 >> 32); [EOL]     assertEquals((17 * 37 + h1) * 37 + h2, new HashCodeBuilder(17, 37).append(obj).toHashCode()); [EOL] } <line_num>: 388,401
@Test [EOL] public void testDoubleArrayAsObject() { [EOL]     final double[] obj = new double[2]; [EOL]     assertEquals(17 * 37 * 37, new HashCodeBuilder(17, 37).append((Object) obj).toHashCode()); [EOL]     obj[0] = 5.4d; [EOL]     final long l1 = Double.doubleToLongBits(5.4d); [EOL]     final int h1 = (int) (l1 ^ l1 >> 32); [EOL]     assertEquals((17 * 37 + h1) * 37, new HashCodeBuilder(17, 37).append((Object) obj).toHashCode()); [EOL]     obj[1] = 6.3d; [EOL]     final long l2 = Double.doubleToLongBits(6.3d); [EOL]     final int h2 = (int) (l2 ^ l2 >> 32); [EOL]     assertEquals((17 * 37 + h1) * 37 + h2, new HashCodeBuilder(17, 37).append((Object) obj).toHashCode()); [EOL] } <line_num>: 403,415
@Test [EOL] public void testFloatArray() { [EOL]     assertEquals(17 * 37, new HashCodeBuilder(17, 37).append((float[]) null).toHashCode()); [EOL]     final float[] obj = new float[2]; [EOL]     assertEquals(17 * 37 * 37, new HashCodeBuilder(17, 37).append(obj).toHashCode()); [EOL]     obj[0] = 5.4f; [EOL]     final int h1 = Float.floatToIntBits(5.4f); [EOL]     assertEquals((17 * 37 + h1) * 37, new HashCodeBuilder(17, 37).append(obj).toHashCode()); [EOL]     obj[1] = 6.3f; [EOL]     final int h2 = Float.floatToIntBits(6.3f); [EOL]     assertEquals((17 * 37 + h1) * 37 + h2, new HashCodeBuilder(17, 37).append(obj).toHashCode()); [EOL] } <line_num>: 417,428
@Test [EOL] public void testFloatArrayAsObject() { [EOL]     final float[] obj = new float[2]; [EOL]     assertEquals(17 * 37 * 37, new HashCodeBuilder(17, 37).append((Object) obj).toHashCode()); [EOL]     obj[0] = 5.4f; [EOL]     final int h1 = Float.floatToIntBits(5.4f); [EOL]     assertEquals((17 * 37 + h1) * 37, new HashCodeBuilder(17, 37).append((Object) obj).toHashCode()); [EOL]     obj[1] = 6.3f; [EOL]     final int h2 = Float.floatToIntBits(6.3f); [EOL]     assertEquals((17 * 37 + h1) * 37 + h2, new HashCodeBuilder(17, 37).append((Object) obj).toHashCode()); [EOL] } <line_num>: 430,440
@Test [EOL] public void testBooleanArray() { [EOL]     assertEquals(17 * 37, new HashCodeBuilder(17, 37).append((boolean[]) null).toHashCode()); [EOL]     final boolean[] obj = new boolean[2]; [EOL]     assertEquals((17 * 37 + 1) * 37 + 1, new HashCodeBuilder(17, 37).append(obj).toHashCode()); [EOL]     obj[0] = true; [EOL]     assertEquals((17 * 37 + 0) * 37 + 1, new HashCodeBuilder(17, 37).append(obj).toHashCode()); [EOL]     obj[1] = false; [EOL]     assertEquals((17 * 37 + 0) * 37 + 1, new HashCodeBuilder(17, 37).append(obj).toHashCode()); [EOL] } <line_num>: 442,451
@Test [EOL] public void testBooleanArrayAsObject() { [EOL]     final boolean[] obj = new boolean[2]; [EOL]     assertEquals((17 * 37 + 1) * 37 + 1, new HashCodeBuilder(17, 37).append((Object) obj).toHashCode()); [EOL]     obj[0] = true; [EOL]     assertEquals((17 * 37 + 0) * 37 + 1, new HashCodeBuilder(17, 37).append((Object) obj).toHashCode()); [EOL]     obj[1] = false; [EOL]     assertEquals((17 * 37 + 0) * 37 + 1, new HashCodeBuilder(17, 37).append((Object) obj).toHashCode()); [EOL] } <line_num>: 453,461
@Test [EOL] public void testBooleanMultiArray() { [EOL]     final boolean[][] obj = new boolean[2][]; [EOL]     assertEquals(17 * 37 * 37, new HashCodeBuilder(17, 37).append(obj).toHashCode()); [EOL]     obj[0] = new boolean[0]; [EOL]     assertEquals(17 * 37, new HashCodeBuilder(17, 37).append(obj).toHashCode()); [EOL]     obj[0] = new boolean[1]; [EOL]     assertEquals((17 * 37 + 1) * 37, new HashCodeBuilder(17, 37).append(obj).toHashCode()); [EOL]     obj[0] = new boolean[2]; [EOL]     assertEquals(((17 * 37 + 1) * 37 + 1) * 37, new HashCodeBuilder(17, 37).append(obj).toHashCode()); [EOL]     obj[0][0] = true; [EOL]     assertEquals(((17 * 37 + 0) * 37 + 1) * 37, new HashCodeBuilder(17, 37).append(obj).toHashCode()); [EOL]     obj[1] = new boolean[1]; [EOL]     assertEquals(((17 * 37 + 0) * 37 + 1) * 37 + 1, new HashCodeBuilder(17, 37).append(obj).toHashCode()); [EOL] } <line_num>: 463,477
@Test [EOL] public void testReflectionHashCodeExcludeFields() throws Exception { [EOL]     final TestObjectWithMultipleFields x = new TestObjectWithMultipleFields(1, 2, 3); [EOL]     assertEquals(((17 * 37 + 1) * 37 + 2) * 37 + 3, HashCodeBuilder.reflectionHashCode(x)); [EOL]     assertEquals(((17 * 37 + 1) * 37 + 2) * 37 + 3, HashCodeBuilder.reflectionHashCode(x, (String[]) null)); [EOL]     assertEquals(((17 * 37 + 1) * 37 + 2) * 37 + 3, HashCodeBuilder.reflectionHashCode(x, new String[] {})); [EOL]     assertEquals(((17 * 37 + 1) * 37 + 2) * 37 + 3, HashCodeBuilder.reflectionHashCode(x, new String[] { "xxx" })); [EOL]     assertEquals((17 * 37 + 1) * 37 + 3, HashCodeBuilder.reflectionHashCode(x, new String[] { "two" })); [EOL]     assertEquals((17 * 37 + 1) * 37 + 2, HashCodeBuilder.reflectionHashCode(x, new String[] { "three" })); [EOL]     assertEquals(17 * 37 + 1, HashCodeBuilder.reflectionHashCode(x, new String[] { "two", "three" })); [EOL]     assertEquals(17, HashCodeBuilder.reflectionHashCode(x, new String[] { "one", "two", "three" })); [EOL]     assertEquals(17, HashCodeBuilder.reflectionHashCode(x, new String[] { "one", "two", "three", "xxx" })); [EOL] } <line_num>: 479,496
@Test [EOL] public void testReflectionObjectCycle() { [EOL]     final ReflectionTestCycleA a = new ReflectionTestCycleA(); [EOL]     final ReflectionTestCycleB b = new ReflectionTestCycleB(); [EOL]     a.b = b; [EOL]     b.a = a; [EOL]     a.hashCode(); [EOL]     assertNull(HashCodeBuilder.getRegistry()); [EOL]     b.hashCode(); [EOL]     assertNull(HashCodeBuilder.getRegistry()); [EOL] } <line_num>: 518,546
@Test [EOL] public void testToHashCodeEqualsHashCode() { [EOL]     final HashCodeBuilder hcb = new HashCodeBuilder(17, 37).append(new Object()).append('a'); [EOL]     assertEquals("hashCode() is no longer returning the same value as toHashCode() - see LANG-520", hcb.toHashCode(), hcb.hashCode()); [EOL] } <line_num>: 551,556
