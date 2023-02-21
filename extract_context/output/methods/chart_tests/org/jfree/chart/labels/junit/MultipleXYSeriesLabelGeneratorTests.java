public MultipleXYSeriesLabelGeneratorTests(String name) { [EOL]     super(name); [EOL] } <line_num>: 77,79
public static Test suite() { [EOL]     return new TestSuite(MultipleXYSeriesLabelGeneratorTests.class); [EOL] } <line_num>: 68,70
public void testEquals() { [EOL]     MultipleXYSeriesLabelGenerator g1 = new MultipleXYSeriesLabelGenerator(); [EOL]     MultipleXYSeriesLabelGenerator g2 = new MultipleXYSeriesLabelGenerator(); [EOL]     assertTrue(g1.equals(g2)); [EOL]     assertTrue(g2.equals(g1)); [EOL]     g1 = new MultipleXYSeriesLabelGenerator("Series {0}"); [EOL]     assertFalse(g1.equals(g2)); [EOL]     g2 = new MultipleXYSeriesLabelGenerator("Series {0}"); [EOL]     assertTrue(g1.equals(g2)); [EOL]     g1.addSeriesLabel(1, "Additional 1"); [EOL]     assertFalse(g1.equals(g2)); [EOL]     g2.addSeriesLabel(1, "Additional 1"); [EOL]     assertTrue(g1.equals(g2)); [EOL] } <line_num>: 84,101
public void testHashCode() { [EOL]     MultipleXYSeriesLabelGenerator g1 = new MultipleXYSeriesLabelGenerator(); [EOL]     MultipleXYSeriesLabelGenerator g2 = new MultipleXYSeriesLabelGenerator(); [EOL]     assertTrue(g1.equals(g2)); [EOL]     assertTrue(g1.hashCode() == g2.hashCode()); [EOL] } <line_num>: 106,113
public void testCloning() { [EOL]     MultipleXYSeriesLabelGenerator g1 = new MultipleXYSeriesLabelGenerator(); [EOL]     MultipleXYSeriesLabelGenerator g2 = null; [EOL]     try { [EOL]         g2 = (MultipleXYSeriesLabelGenerator) g1.clone(); [EOL]     } catch (CloneNotSupportedException e) { [EOL]         e.printStackTrace(); [EOL]     } [EOL]     assertTrue(g1 != g2); [EOL]     assertTrue(g1.getClass() == g2.getClass()); [EOL]     assertTrue(g1.equals(g2)); [EOL]     g1.addSeriesLabel(3, "Add3"); [EOL]     assertFalse(g1.equals(g2)); [EOL]     g2.addSeriesLabel(3, "Add3"); [EOL]     assertTrue(g1.equals(g2)); [EOL] } <line_num>: 118,137
public void testPublicCloneable() { [EOL]     MultipleXYSeriesLabelGenerator g1 = new MultipleXYSeriesLabelGenerator(); [EOL]     assertTrue(g1 instanceof PublicCloneable); [EOL] } <line_num>: 142,146
public void testSerialization() { [EOL]     MultipleXYSeriesLabelGenerator g1 = new MultipleXYSeriesLabelGenerator(); [EOL]     g1.addSeriesLabel(0, "Add0"); [EOL]     g1.addSeriesLabel(0, "Add0b"); [EOL]     g1.addSeriesLabel(1, "Add1"); [EOL]     MultipleXYSeriesLabelGenerator g2 = null; [EOL]     try { [EOL]         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); [EOL]         ObjectOutput out = new ObjectOutputStream(buffer); [EOL]         out.writeObject(g1); [EOL]         out.close(); [EOL]         ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray())); [EOL]         g2 = (MultipleXYSeriesLabelGenerator) in.readObject(); [EOL]         in.close(); [EOL]     } catch (Exception e) { [EOL]         e.printStackTrace(); [EOL]     } [EOL]     assertEquals(g1, g2); [EOL] } <line_num>: 151,176
