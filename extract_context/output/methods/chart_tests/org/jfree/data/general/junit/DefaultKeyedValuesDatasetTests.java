public DefaultKeyedValuesDatasetTests(String name) { [EOL]     super(name); [EOL] } <line_num>: 76,78
public static Test suite() { [EOL]     return new TestSuite(DefaultKeyedValuesDatasetTests.class); [EOL] } <line_num>: 67,69
public void testCloning() { [EOL]     DefaultKeyedValuesDataset d1 = new DefaultKeyedValuesDataset(); [EOL]     d1.setValue("V1", new Integer(1)); [EOL]     d1.setValue("V2", null); [EOL]     d1.setValue("V3", new Integer(3)); [EOL]     DefaultKeyedValuesDataset d2 = null; [EOL]     try { [EOL]         d2 = (DefaultKeyedValuesDataset) d1.clone(); [EOL]     } catch (CloneNotSupportedException e) { [EOL]         System.err.println("Failed to clone."); [EOL]     } [EOL]     assertTrue(d1 != d2); [EOL]     assertTrue(d1.getClass() == d2.getClass()); [EOL]     assertTrue(d1.equals(d2)); [EOL] } <line_num>: 83,98
public void testSerialization() { [EOL]     DefaultKeyedValuesDataset d1 = new DefaultKeyedValuesDataset(); [EOL]     d1.setValue("C1", new Double(234.2)); [EOL]     d1.setValue("C2", null); [EOL]     d1.setValue("C3", new Double(345.9)); [EOL]     d1.setValue("C4", new Double(452.7)); [EOL]     KeyedValuesDataset d2 = null; [EOL]     try { [EOL]         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); [EOL]         ObjectOutput out = new ObjectOutputStream(buffer); [EOL]         out.writeObject(d1); [EOL]         out.close(); [EOL]         ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray())); [EOL]         d2 = (KeyedValuesDataset) in.readObject(); [EOL]         in.close(); [EOL]     } catch (Exception e) { [EOL]         System.out.println(e.toString()); [EOL]     } [EOL]     assertEquals(d1, d2); [EOL] } <line_num>: 103,130
