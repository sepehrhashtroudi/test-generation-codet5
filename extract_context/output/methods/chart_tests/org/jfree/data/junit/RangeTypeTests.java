public RangeTypeTests(String name) { [EOL]     super(name); [EOL] } <line_num>: 75,77
public static Test suite() { [EOL]     return new TestSuite(RangeTypeTests.class); [EOL] } <line_num>: 66,68
public void testEquals() { [EOL]     assertEquals(RangeType.FULL, RangeType.FULL); [EOL]     assertEquals(RangeType.NEGATIVE, RangeType.NEGATIVE); [EOL]     assertEquals(RangeType.POSITIVE, RangeType.POSITIVE); [EOL]     assertFalse(RangeType.FULL.equals(RangeType.NEGATIVE)); [EOL]     assertFalse(RangeType.FULL.equals(RangeType.POSITIVE)); [EOL]     assertFalse(RangeType.FULL.equals(null)); [EOL]     assertFalse(RangeType.NEGATIVE.equals(RangeType.FULL)); [EOL]     assertFalse(RangeType.NEGATIVE.equals(RangeType.POSITIVE)); [EOL]     assertFalse(RangeType.NEGATIVE.equals(null)); [EOL]     assertFalse(RangeType.POSITIVE.equals(RangeType.NEGATIVE)); [EOL]     assertFalse(RangeType.POSITIVE.equals(RangeType.FULL)); [EOL]     assertFalse(RangeType.POSITIVE.equals(null)); [EOL] } <line_num>: 82,95
public void testHashCode() { [EOL]     RangeType r1 = RangeType.FULL; [EOL]     RangeType r2 = RangeType.FULL; [EOL]     assertTrue(r1.equals(r2)); [EOL]     int h1 = r1.hashCode(); [EOL]     int h2 = r2.hashCode(); [EOL]     assertEquals(h1, h2); [EOL] } <line_num>: 100,107
public void testSerialization() { [EOL]     RangeType r1 = RangeType.FULL; [EOL]     RangeType r2 = null; [EOL]     try { [EOL]         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); [EOL]         ObjectOutput out = new ObjectOutputStream(buffer); [EOL]         out.writeObject(r1); [EOL]         out.close(); [EOL]         ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray())); [EOL]         r2 = (RangeType) in.readObject(); [EOL]         in.close(); [EOL]     } catch (Exception e) { [EOL]         System.out.println(e.toString()); [EOL]     } [EOL]     assertEquals(r1, r2); [EOL]     boolean same = r1 == r2; [EOL]     assertEquals(true, same); [EOL] } <line_num>: 112,133