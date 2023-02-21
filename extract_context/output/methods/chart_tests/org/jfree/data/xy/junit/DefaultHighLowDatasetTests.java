public DefaultHighLowDatasetTests(String name) { [EOL]     super(name); [EOL] } <line_num>: 78,80
public static Test suite() { [EOL]     return new TestSuite(DefaultHighLowDatasetTests.class); [EOL] } <line_num>: 69,71
public void testEquals() { [EOL]     DefaultHighLowDataset d1 = new DefaultHighLowDataset("Series 1", new Date[0], new double[0], new double[0], new double[0], new double[0], new double[0]); [EOL]     DefaultHighLowDataset d2 = new DefaultHighLowDataset("Series 1", new Date[0], new double[0], new double[0], new double[0], new double[0], new double[0]); [EOL]     assertTrue(d1.equals(d2)); [EOL]     assertTrue(d2.equals(d1)); [EOL]     d1 = new DefaultHighLowDataset("Series 2", new Date[0], new double[0], new double[0], new double[0], new double[0], new double[0]); [EOL]     assertFalse(d1.equals(d2)); [EOL]     d2 = new DefaultHighLowDataset("Series 2", new Date[0], new double[0], new double[0], new double[0], new double[0], new double[0]); [EOL]     assertTrue(d1.equals(d2)); [EOL]     d1 = new DefaultHighLowDataset("Series 2", new Date[] { new Date(123L) }, new double[1], new double[1], new double[1], new double[1], new double[1]); [EOL]     assertFalse(d1.equals(d2)); [EOL]     d2 = new DefaultHighLowDataset("Series 2", new Date[] { new Date(123L) }, new double[1], new double[1], new double[1], new double[1], new double[1]); [EOL]     assertTrue(d1.equals(d2)); [EOL]     d1 = new DefaultHighLowDataset("Series 2", new Date[] { new Date(123L) }, new double[] { 1.2 }, new double[1], new double[1], new double[1], new double[1]); [EOL]     assertFalse(d1.equals(d2)); [EOL]     d2 = new DefaultHighLowDataset("Series 2", new Date[] { new Date(123L) }, new double[] { 1.2 }, new double[1], new double[1], new double[1], new double[1]); [EOL]     assertTrue(d1.equals(d2)); [EOL]     d1 = new DefaultHighLowDataset("Series 2", new Date[] { new Date(123L) }, new double[] { 1.2 }, new double[] { 3.4 }, new double[1], new double[1], new double[1]); [EOL]     assertFalse(d1.equals(d2)); [EOL]     d2 = new DefaultHighLowDataset("Series 2", new Date[] { new Date(123L) }, new double[] { 1.2 }, new double[] { 3.4 }, new double[1], new double[1], new double[1]); [EOL]     assertTrue(d1.equals(d2)); [EOL]     d1 = new DefaultHighLowDataset("Series 2", new Date[] { new Date(123L) }, new double[] { 1.2 }, new double[] { 3.4 }, new double[] { 5.6 }, new double[1], new double[1]); [EOL]     assertFalse(d1.equals(d2)); [EOL]     d2 = new DefaultHighLowDataset("Series 2", new Date[] { new Date(123L) }, new double[] { 1.2 }, new double[] { 3.4 }, new double[] { 5.6 }, new double[1], new double[1]); [EOL]     assertTrue(d1.equals(d2)); [EOL]     d1 = new DefaultHighLowDataset("Series 2", new Date[] { new Date(123L) }, new double[] { 1.2 }, new double[] { 3.4 }, new double[] { 5.6 }, new double[] { 7.8 }, new double[1]); [EOL]     assertFalse(d1.equals(d2)); [EOL]     d2 = new DefaultHighLowDataset("Series 2", new Date[] { new Date(123L) }, new double[] { 1.2 }, new double[] { 3.4 }, new double[] { 5.6 }, new double[] { 7.8 }, new double[1]); [EOL]     assertTrue(d1.equals(d2)); [EOL]     d1 = new DefaultHighLowDataset("Series 2", new Date[] { new Date(123L) }, new double[] { 1.2 }, new double[] { 3.4 }, new double[] { 5.6 }, new double[] { 7.8 }, new double[] { 99.9 }); [EOL]     assertFalse(d1.equals(d2)); [EOL]     d2 = new DefaultHighLowDataset("Series 2", new Date[] { new Date(123L) }, new double[] { 1.2 }, new double[] { 3.4 }, new double[] { 5.6 }, new double[] { 7.8 }, new double[] { 99.9 }); [EOL]     assertTrue(d1.equals(d2)); [EOL] } <line_num>: 85,166
public void testCloning() { [EOL]     DefaultHighLowDataset d1 = new DefaultHighLowDataset("Series 1", new Date[] { new Date(123L) }, new double[] { 1.2 }, new double[] { 3.4 }, new double[] { 5.6 }, new double[] { 7.8 }, new double[] { 99.9 }); [EOL]     DefaultHighLowDataset d2 = null; [EOL]     try { [EOL]         d2 = (DefaultHighLowDataset) d1.clone(); [EOL]     } catch (CloneNotSupportedException e) { [EOL]         e.printStackTrace(); [EOL]     } [EOL]     assertTrue(d1 != d2); [EOL]     assertTrue(d1.getClass() == d2.getClass()); [EOL]     assertTrue(d1.equals(d2)); [EOL] } <line_num>: 171,186
public void testPublicCloneable() { [EOL]     DefaultHighLowDataset d1 = new DefaultHighLowDataset("Series 1", new Date[0], new double[0], new double[0], new double[0], new double[0], new double[0]); [EOL]     assertTrue(d1 instanceof PublicCloneable); [EOL] } <line_num>: 191,196
public void testSerialization() { [EOL]     DefaultHighLowDataset d1 = new DefaultHighLowDataset("Series 1", new Date[] { new Date(123L) }, new double[] { 1.2 }, new double[] { 3.4 }, new double[] { 5.6 }, new double[] { 7.8 }, new double[] { 99.9 }); [EOL]     DefaultHighLowDataset d2 = null; [EOL]     try { [EOL]         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); [EOL]         ObjectOutput out = new ObjectOutputStream(buffer); [EOL]         out.writeObject(d1); [EOL]         out.close(); [EOL]         ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray())); [EOL]         d2 = (DefaultHighLowDataset) in.readObject(); [EOL]         in.close(); [EOL]     } catch (Exception e) { [EOL]         e.printStackTrace(); [EOL]     } [EOL]     assertEquals(d1, d2); [EOL] } <line_num>: 201,223
