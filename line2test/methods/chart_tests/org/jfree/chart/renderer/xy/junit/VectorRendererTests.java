public VectorRendererTests(String name) { [EOL]     super(name); [EOL] } <line_num>: 78,80
public static Test suite() { [EOL]     return new TestSuite(VectorRendererTests.class); [EOL] } <line_num>: 69,71
public void testEquals() { [EOL]     VectorRenderer r1 = new VectorRenderer(); [EOL]     VectorRenderer r2 = new VectorRenderer(); [EOL]     assertTrue(r1.equals(r2)); [EOL]     assertTrue(r2.equals(r1)); [EOL]     r1.setSeriesFillPaint(0, Color.green); [EOL]     assertFalse(r1.equals(r2)); [EOL]     r2.setSeriesFillPaint(0, Color.green); [EOL]     assertTrue(r1.equals(r2)); [EOL] } <line_num>: 85,97
public void testHashcode() { [EOL]     VectorRenderer r1 = new VectorRenderer(); [EOL]     VectorRenderer r2 = new VectorRenderer(); [EOL]     assertTrue(r1.equals(r2)); [EOL]     int h1 = r1.hashCode(); [EOL]     int h2 = r2.hashCode(); [EOL]     assertEquals(h1, h2); [EOL] } <line_num>: 102,109
public void testCloning() { [EOL]     VectorRenderer r1 = new VectorRenderer(); [EOL]     VectorRenderer r2 = null; [EOL]     try { [EOL]         r2 = (VectorRenderer) r1.clone(); [EOL]     } catch (CloneNotSupportedException e) { [EOL]         e.printStackTrace(); [EOL]     } [EOL]     assertTrue(r1 != r2); [EOL]     assertTrue(r1.getClass() == r2.getClass()); [EOL]     assertTrue(r1.equals(r2)); [EOL] } <line_num>: 114,126
public void testPublicCloneable() { [EOL]     VectorRenderer r1 = new VectorRenderer(); [EOL]     assertTrue(r1 instanceof PublicCloneable); [EOL] } <line_num>: 131,134
public void testSerialization() { [EOL]     VectorRenderer r1 = new VectorRenderer(); [EOL]     VectorRenderer r2 = null; [EOL]     try { [EOL]         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); [EOL]         ObjectOutput out = new ObjectOutputStream(buffer); [EOL]         out.writeObject(r1); [EOL]         out.close(); [EOL]         ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray())); [EOL]         r2 = (VectorRenderer) in.readObject(); [EOL]         in.close(); [EOL]     } catch (Exception e) { [EOL]         e.printStackTrace(); [EOL]     } [EOL]     assertEquals(r1, r2); [EOL] } <line_num>: 139,157