public SimpleHistogramDatasetTests(String name) { [EOL]     super(name); [EOL] } <line_num>: 77,79
public static Test suite() { [EOL]     return new TestSuite(SimpleHistogramDatasetTests.class); [EOL] } <line_num>: 68,70
public void testEquals() { [EOL]     SimpleHistogramDataset d1 = new SimpleHistogramDataset("Dataset 1"); [EOL]     SimpleHistogramDataset d2 = new SimpleHistogramDataset("Dataset 1"); [EOL]     assertTrue(d1.equals(d2)); [EOL]     d1.addBin(new SimpleHistogramBin(1.0, 2.0)); [EOL]     assertFalse(d1.equals(d2)); [EOL]     d2.addBin(new SimpleHistogramBin(1.0, 2.0)); [EOL]     assertTrue(d1.equals(d2)); [EOL] } <line_num>: 84,93
public void testCloning() { [EOL]     SimpleHistogramDataset d1 = new SimpleHistogramDataset("Dataset 1"); [EOL]     SimpleHistogramDataset d2 = null; [EOL]     try { [EOL]         d2 = (SimpleHistogramDataset) d1.clone(); [EOL]     } catch (CloneNotSupportedException e) { [EOL]         e.printStackTrace(); [EOL]     } [EOL]     assertTrue(d1 != d2); [EOL]     assertTrue(d1.getClass() == d2.getClass()); [EOL]     assertTrue(d1.equals(d2)); [EOL]     d2.addBin(new SimpleHistogramBin(2.0, 3.0)); [EOL]     d2.addObservation(2.3); [EOL]     assertFalse(d1.equals(d2)); [EOL] } <line_num>: 98,115
public void testSerialization() { [EOL]     SimpleHistogramDataset d1 = new SimpleHistogramDataset("D1"); [EOL]     SimpleHistogramDataset d2 = null; [EOL]     try { [EOL]         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); [EOL]         ObjectOutput out = new ObjectOutputStream(buffer); [EOL]         out.writeObject(d1); [EOL]         out.close(); [EOL]         ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray())); [EOL]         d2 = (SimpleHistogramDataset) in.readObject(); [EOL]         in.close(); [EOL]     } catch (Exception e) { [EOL]         e.printStackTrace(); [EOL]     } [EOL]     assertEquals(d1, d2); [EOL] } <line_num>: 120,137
public void testClearObservations() { [EOL]     SimpleHistogramDataset d1 = new SimpleHistogramDataset("D1"); [EOL]     d1.clearObservations(); [EOL]     assertEquals(0, d1.getItemCount(0)); [EOL]     d1.addBin(new SimpleHistogramBin(0.0, 1.0)); [EOL]     d1.addObservation(0.5); [EOL]     assertEquals(1.0, d1.getYValue(0, 0), EPSILON); [EOL] } <line_num>: 144,151
public void testRemoveAllBins() { [EOL]     SimpleHistogramDataset d1 = new SimpleHistogramDataset("D1"); [EOL]     d1.addBin(new SimpleHistogramBin(0.0, 1.0)); [EOL]     d1.addObservation(0.5); [EOL]     d1.addBin(new SimpleHistogramBin(2.0, 3.0)); [EOL]     assertEquals(2, d1.getItemCount(0)); [EOL]     d1.removeAllBins(); [EOL]     assertEquals(0, d1.getItemCount(0)); [EOL] } <line_num>: 156,164