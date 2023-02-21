public NumberTickUnitTests(String name) { [EOL]     super(name); [EOL] } <line_num>: 76,78
public static Test suite() { [EOL]     return new TestSuite(NumberTickUnitTests.class); [EOL] } <line_num>: 67,69
public void testEquals() { [EOL]     NumberTickUnit t1 = new NumberTickUnit(1.23, new DecimalFormat("0.00")); [EOL]     NumberTickUnit t2 = new NumberTickUnit(1.23, new DecimalFormat("0.00")); [EOL]     assertTrue(t1.equals(t2)); [EOL]     assertTrue(t2.equals(t1)); [EOL]     t1 = new NumberTickUnit(3.21, new DecimalFormat("0.00")); [EOL]     assertFalse(t1.equals(t2)); [EOL]     t2 = new NumberTickUnit(3.21, new DecimalFormat("0.00")); [EOL]     assertTrue(t1.equals(t2)); [EOL]     t1 = new NumberTickUnit(3.21, new DecimalFormat("0.000")); [EOL]     assertFalse(t1.equals(t2)); [EOL]     t2 = new NumberTickUnit(3.21, new DecimalFormat("0.000")); [EOL]     assertTrue(t1.equals(t2)); [EOL] } <line_num>: 83,98
public void testHashCode() { [EOL]     NumberTickUnit t1 = new NumberTickUnit(1.23, new DecimalFormat("0.00")); [EOL]     NumberTickUnit t2 = new NumberTickUnit(1.23, new DecimalFormat("0.00")); [EOL]     int h1 = t1.hashCode(); [EOL]     int h2 = t2.hashCode(); [EOL]     assertEquals(h1, h2); [EOL] } <line_num>: 103,109
public void testCloning() { [EOL]     NumberTickUnit t1 = new NumberTickUnit(1.23, new DecimalFormat("0.00")); [EOL]     assertFalse(t1 instanceof Cloneable); [EOL] } <line_num>: 114,117
public void testSerialization() { [EOL]     NumberTickUnit t1 = new NumberTickUnit(1.23, new DecimalFormat("0.00")); [EOL]     NumberTickUnit t2 = null; [EOL]     try { [EOL]         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); [EOL]         ObjectOutput out = new ObjectOutputStream(buffer); [EOL]         out.writeObject(t1); [EOL]         out.close(); [EOL]         ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray())); [EOL]         t2 = (NumberTickUnit) in.readObject(); [EOL]         in.close(); [EOL]     } catch (Exception e) { [EOL]         e.printStackTrace(); [EOL]     } [EOL]     assertEquals(t1, t2); [EOL] } <line_num>: 122,140