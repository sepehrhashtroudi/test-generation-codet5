public TestConverterSet(String name) { [EOL]     super(name); [EOL] } <line_num>: 68,70
public Class getSupportedType() { [EOL]     return Boolean.class; [EOL] } <line_num>: 42,42
public Class getSupportedType() { [EOL]     return Character.class; [EOL] } <line_num>: 45,45
public Class getSupportedType() { [EOL]     return Byte.class; [EOL] } <line_num>: 48,48
public Class getSupportedType() { [EOL]     return Short.class; [EOL] } <line_num>: 51,51
public Class getSupportedType() { [EOL]     return Short.class; [EOL] } <line_num>: 54,54
public Class getSupportedType() { [EOL]     return Integer.class; [EOL] } <line_num>: 57,57
public static void main(String[] args) { [EOL]     junit.textui.TestRunner.run(suite()); [EOL] } <line_num>: 60,62
public static TestSuite suite() { [EOL]     return new TestSuite(TestConverterSet.class); [EOL] } <line_num>: 64,66
public void testClass() throws Exception { [EOL]     Class cls = ConverterSet.class; [EOL]     assertEquals(false, Modifier.isPublic(cls.getModifiers())); [EOL]     assertEquals(false, Modifier.isProtected(cls.getModifiers())); [EOL]     assertEquals(false, Modifier.isPrivate(cls.getModifiers())); [EOL]     assertEquals(1, cls.getDeclaredConstructors().length); [EOL]     Constructor con = cls.getDeclaredConstructors()[0]; [EOL]     assertEquals(false, Modifier.isPublic(con.getModifiers())); [EOL]     assertEquals(false, Modifier.isProtected(con.getModifiers())); [EOL]     assertEquals(false, Modifier.isPrivate(con.getModifiers())); [EOL] } <line_num>: 73,84
public void testBigHashtable() { [EOL]     Converter[] array = new Converter[] { c1, c2, c3, c4 }; [EOL]     ConverterSet set = new ConverterSet(array); [EOL]     set.select(Boolean.class); [EOL]     set.select(Character.class); [EOL]     set.select(Byte.class); [EOL]     set.select(Short.class); [EOL]     set.select(Integer.class); [EOL]     set.select(Long.class); [EOL]     set.select(Float.class); [EOL]     set.select(Double.class); [EOL]     set.select(null); [EOL]     set.select(Calendar.class); [EOL]     set.select(GregorianCalendar.class); [EOL]     set.select(DateTime.class); [EOL]     set.select(DateMidnight.class); [EOL]     set.select(ReadableInstant.class); [EOL]     set.select(ReadableDateTime.class); [EOL]     set.select(ReadWritableInstant.class); [EOL]     set.select(ReadWritableDateTime.class); [EOL]     set.select(DateTime.class); [EOL]     assertEquals(4, set.size()); [EOL] } <line_num>: 87,111
public void testAddNullRemoved1() { [EOL]     Converter[] array = new Converter[] { c1, c2, c3, c4 }; [EOL]     ConverterSet set = new ConverterSet(array); [EOL]     ConverterSet result = set.add(c5, null); [EOL]     assertEquals(4, set.size()); [EOL]     assertEquals(5, result.size()); [EOL] } <line_num>: 114,122
public void testAddNullRemoved2() { [EOL]     Converter[] array = new Converter[] { c1, c2, c3, c4 }; [EOL]     ConverterSet set = new ConverterSet(array); [EOL]     ConverterSet result = set.add(c4, null); [EOL]     assertSame(set, result); [EOL] } <line_num>: 124,131
public void testAddNullRemoved3() { [EOL]     Converter[] array = new Converter[] { c1, c2, c3, c4 }; [EOL]     ConverterSet set = new ConverterSet(array); [EOL]     ConverterSet result = set.add(c4a, null); [EOL]     assertTrue(set != result); [EOL]     assertEquals(4, set.size()); [EOL]     assertEquals(4, result.size()); [EOL] } <line_num>: 133,142
public void testRemoveNullRemoved1() { [EOL]     Converter[] array = new Converter[] { c1, c2, c3, c4 }; [EOL]     ConverterSet set = new ConverterSet(array); [EOL]     ConverterSet result = set.remove(c3, null); [EOL]     assertEquals(4, set.size()); [EOL]     assertEquals(3, result.size()); [EOL] } <line_num>: 145,153
public void testRemoveNullRemoved2() { [EOL]     Converter[] array = new Converter[] { c1, c2, c3, c4 }; [EOL]     ConverterSet set = new ConverterSet(array); [EOL]     ConverterSet result = set.remove(c5, null); [EOL]     assertSame(set, result); [EOL] } <line_num>: 155,162
public void testRemoveBadIndex1() { [EOL]     Converter[] array = new Converter[] { c1, c2, c3, c4 }; [EOL]     ConverterSet set = new ConverterSet(array); [EOL]     try { [EOL]         set.remove(200, null); [EOL]         fail(); [EOL]     } catch (IndexOutOfBoundsException ex) { [EOL]     } [EOL]     assertEquals(4, set.size()); [EOL] } <line_num>: 165,175
public void testRemoveBadIndex2() { [EOL]     Converter[] array = new Converter[] { c1, c2, c3, c4 }; [EOL]     ConverterSet set = new ConverterSet(array); [EOL]     try { [EOL]         set.remove(-1, null); [EOL]         fail(); [EOL]     } catch (IndexOutOfBoundsException ex) { [EOL]     } [EOL]     assertEquals(4, set.size()); [EOL] } <line_num>: 177,187
