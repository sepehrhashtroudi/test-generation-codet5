public PieLabelRecordTests(String name) { [EOL]     super(name); [EOL] } <line_num>: 76,78
public static Test suite() { [EOL]     return new TestSuite(PieLabelRecordTests.class); [EOL] } <line_num>: 67,69
public void testEquals() { [EOL]     PieLabelRecord p1 = new PieLabelRecord("A", 1.0, 2.0, new TextBox("B"), 3.0, 4.0, 5.0); [EOL]     PieLabelRecord p2 = new PieLabelRecord("A", 1.0, 2.0, new TextBox("B"), 3.0, 4.0, 5.0); [EOL]     assertTrue(p1.equals(p2)); [EOL]     assertTrue(p2.equals(p1)); [EOL]     p1 = new PieLabelRecord("B", 1.0, 2.0, new TextBox("B"), 3.0, 4.0, 5.0); [EOL]     assertFalse(p1.equals(p2)); [EOL]     p2 = new PieLabelRecord("B", 1.0, 2.0, new TextBox("B"), 3.0, 4.0, 5.0); [EOL]     assertTrue(p1.equals(p2)); [EOL]     p1 = new PieLabelRecord("B", 1.1, 2.0, new TextBox("B"), 3.0, 4.0, 5.0); [EOL]     assertFalse(p1.equals(p2)); [EOL]     p2 = new PieLabelRecord("B", 1.1, 2.0, new TextBox("B"), 3.0, 4.0, 5.0); [EOL]     assertTrue(p1.equals(p2)); [EOL]     p1 = new PieLabelRecord("B", 1.1, 2.2, new TextBox("B"), 3.0, 4.0, 5.0); [EOL]     assertFalse(p1.equals(p2)); [EOL]     p2 = new PieLabelRecord("B", 1.1, 2.2, new TextBox("B"), 3.0, 4.0, 5.0); [EOL]     assertTrue(p1.equals(p2)); [EOL]     p1 = new PieLabelRecord("B", 1.1, 2.2, new TextBox("C"), 3.0, 4.0, 5.0); [EOL]     assertFalse(p1.equals(p2)); [EOL]     p2 = new PieLabelRecord("B", 1.1, 2.2, new TextBox("C"), 3.0, 4.0, 5.0); [EOL]     assertTrue(p1.equals(p2)); [EOL]     p1 = new PieLabelRecord("B", 1.1, 2.2, new TextBox("C"), 3.3, 4.0, 5.0); [EOL]     assertFalse(p1.equals(p2)); [EOL]     p2 = new PieLabelRecord("B", 1.1, 2.2, new TextBox("C"), 3.3, 4.0, 5.0); [EOL]     assertTrue(p1.equals(p2)); [EOL]     p1 = new PieLabelRecord("B", 1.1, 2.2, new TextBox("C"), 3.3, 4.4, 5.0); [EOL]     assertFalse(p1.equals(p2)); [EOL]     p2 = new PieLabelRecord("B", 1.1, 2.2, new TextBox("C"), 3.3, 4.4, 5.0); [EOL]     assertTrue(p1.equals(p2)); [EOL]     p1 = new PieLabelRecord("B", 1.1, 2.2, new TextBox("C"), 3.3, 4.4, 5.5); [EOL]     assertFalse(p1.equals(p2)); [EOL]     p2 = new PieLabelRecord("B", 1.1, 2.2, new TextBox("C"), 3.3, 4.4, 5.5); [EOL]     assertTrue(p1.equals(p2)); [EOL] } <line_num>: 83,126
public void testCloning() { [EOL]     PieLabelRecord p1 = new PieLabelRecord("A", 1.0, 2.0, new TextBox("B"), 3.0, 4.0, 5.0); [EOL]     assertFalse(p1 instanceof Cloneable); [EOL] } <line_num>: 131,135
public void testSerialization() { [EOL]     PieLabelRecord p1 = new PieLabelRecord("A", 1.0, 2.0, new TextBox("B"), 3.0, 4.0, 5.0); [EOL]     PieLabelRecord p2 = null; [EOL]     try { [EOL]         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); [EOL]         ObjectOutput out = new ObjectOutputStream(buffer); [EOL]         out.writeObject(p1); [EOL]         out.close(); [EOL]         ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray())); [EOL]         p2 = (PieLabelRecord) in.readObject(); [EOL]         in.close(); [EOL]     } catch (Exception e) { [EOL]         e.printStackTrace(); [EOL]     } [EOL]     boolean b = p1.equals(p2); [EOL]     assertTrue(b); [EOL] } <line_num>: 140,162
