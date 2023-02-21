public ItemLabelAnchorTests(String name) { [EOL]     super(name); [EOL] } <line_num>: 75,77
public static Test suite() { [EOL]     return new TestSuite(ItemLabelAnchorTests.class); [EOL] } <line_num>: 66,68
public void testEquals() { [EOL]     assertTrue(ItemLabelAnchor.INSIDE1.equals(ItemLabelAnchor.INSIDE1)); [EOL]     assertFalse(ItemLabelAnchor.INSIDE1.equals(ItemLabelAnchor.INSIDE2)); [EOL] } <line_num>: 82,85
public void testSerialization() { [EOL]     ItemLabelAnchor a1 = ItemLabelAnchor.INSIDE1; [EOL]     ItemLabelAnchor a2 = null; [EOL]     try { [EOL]         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); [EOL]         ObjectOutput out = new ObjectOutputStream(buffer); [EOL]         out.writeObject(a1); [EOL]         out.close(); [EOL]         ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray())); [EOL]         a2 = (ItemLabelAnchor) in.readObject(); [EOL]         in.close(); [EOL]     } catch (Exception e) { [EOL]         e.printStackTrace(); [EOL]     } [EOL]     assertTrue(a1 == a2); [EOL] } <line_num>: 90,111
