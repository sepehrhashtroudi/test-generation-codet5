public PointerNeedleTests(String name) { [EOL]     super(name); [EOL] } <line_num>: 74,76
public static Test suite() { [EOL]     return new TestSuite(PointerNeedleTests.class); [EOL] } <line_num>: 65,67
public void testEquals() { [EOL]     PointerNeedle n1 = new PointerNeedle(); [EOL]     PointerNeedle n2 = new PointerNeedle(); [EOL]     assertTrue(n1.equals(n2)); [EOL]     assertTrue(n2.equals(n1)); [EOL] } <line_num>: 81,86
public void testCloning() { [EOL]     PointerNeedle n1 = new PointerNeedle(); [EOL]     PointerNeedle n2 = null; [EOL]     try { [EOL]         n2 = (PointerNeedle) n1.clone(); [EOL]     } catch (CloneNotSupportedException e) { [EOL]         e.printStackTrace(); [EOL]         System.err.println("Failed to clone."); [EOL]     } [EOL]     assertTrue(n1 != n2); [EOL]     assertTrue(n1.getClass() == n2.getClass()); [EOL]     assertTrue(n1.equals(n2)); [EOL] } <line_num>: 91,104
public void testSerialization() { [EOL]     PointerNeedle n1 = new PointerNeedle(); [EOL]     PointerNeedle n2 = null; [EOL]     try { [EOL]         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); [EOL]         ObjectOutput out = new ObjectOutputStream(buffer); [EOL]         out.writeObject(n1); [EOL]         out.close(); [EOL]         ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray())); [EOL]         n2 = (PointerNeedle) in.readObject(); [EOL]         in.close(); [EOL]     } catch (Exception e) { [EOL]         e.printStackTrace(); [EOL]     } [EOL]     assertTrue(n1.equals(n2)); [EOL] } <line_num>: 109,127