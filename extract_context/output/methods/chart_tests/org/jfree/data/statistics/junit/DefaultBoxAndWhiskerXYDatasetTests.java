public DefaultBoxAndWhiskerXYDatasetTests(String name) { [EOL]     super(name); [EOL] } <line_num>: 79,81
public static Test suite() { [EOL]     return new TestSuite(DefaultBoxAndWhiskerXYDatasetTests.class); [EOL] } <line_num>: 70,72
public void testEquals() { [EOL]     DefaultBoxAndWhiskerXYDataset d1 = new DefaultBoxAndWhiskerXYDataset("Series"); [EOL]     DefaultBoxAndWhiskerXYDataset d2 = new DefaultBoxAndWhiskerXYDataset("Series"); [EOL]     assertTrue(d1.equals(d2)); [EOL]     d1.add(new Date(1L), new BoxAndWhiskerItem(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, new ArrayList())); [EOL]     assertFalse(d1.equals(d2)); [EOL]     d2.add(new Date(1L), new BoxAndWhiskerItem(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, new ArrayList())); [EOL]     assertTrue(d1.equals(d2)); [EOL] } <line_num>: 86,99
public void testSerialization() { [EOL]     DefaultBoxAndWhiskerXYDataset d1 = new DefaultBoxAndWhiskerXYDataset("Series"); [EOL]     d1.add(new Date(1L), new BoxAndWhiskerItem(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, new ArrayList())); [EOL]     DefaultBoxAndWhiskerXYDataset d2 = null; [EOL]     try { [EOL]         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); [EOL]         ObjectOutput out = new ObjectOutputStream(buffer); [EOL]         out.writeObject(d1); [EOL]         out.close(); [EOL]         ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray())); [EOL]         d2 = (DefaultBoxAndWhiskerXYDataset) in.readObject(); [EOL]         in.close(); [EOL]     } catch (Exception e) { [EOL]         e.printStackTrace(); [EOL]     } [EOL]     assertEquals(d1, d2); [EOL]     d1.add(new Date(2L), new BoxAndWhiskerItem(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, new ArrayList())); [EOL]     assertFalse(d1.equals(d2)); [EOL] } <line_num>: 104,132
public void testCloning() { [EOL]     DefaultBoxAndWhiskerXYDataset d1 = new DefaultBoxAndWhiskerXYDataset("Series"); [EOL]     d1.add(new Date(1L), new BoxAndWhiskerItem(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, new ArrayList())); [EOL]     DefaultBoxAndWhiskerXYDataset d2 = null; [EOL]     try { [EOL]         d2 = (DefaultBoxAndWhiskerXYDataset) d1.clone(); [EOL]     } catch (CloneNotSupportedException e) { [EOL]         e.printStackTrace(); [EOL]     } [EOL]     assertTrue(d1 != d2); [EOL]     assertTrue(d1.getClass() == d2.getClass()); [EOL]     assertTrue(d1.equals(d2)); [EOL]     d1.add(new Date(2L), new BoxAndWhiskerItem(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, new ArrayList())); [EOL]     assertFalse(d1.equals(d2)); [EOL] } <line_num>: 137,157
public void testAdd() { [EOL]     DefaultBoxAndWhiskerXYDataset dataset = new DefaultBoxAndWhiskerXYDataset("S1"); [EOL]     BoxAndWhiskerItem item1 = new BoxAndWhiskerItem(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, new ArrayList()); [EOL]     dataset.add(new Date(33L), item1); [EOL]     assertEquals(1.0, dataset.getY(0, 0).doubleValue(), EPSILON); [EOL]     assertEquals(1.0, dataset.getMeanValue(0, 0).doubleValue(), EPSILON); [EOL]     assertEquals(2.0, dataset.getMedianValue(0, 0).doubleValue(), EPSILON); [EOL]     assertEquals(3.0, dataset.getQ1Value(0, 0).doubleValue(), EPSILON); [EOL]     assertEquals(4.0, dataset.getQ3Value(0, 0).doubleValue(), EPSILON); [EOL]     assertEquals(5.0, dataset.getMinRegularValue(0, 0).doubleValue(), EPSILON); [EOL]     assertEquals(6.0, dataset.getMaxRegularValue(0, 0).doubleValue(), EPSILON); [EOL]     assertEquals(7.0, dataset.getMinOutlier(0, 0).doubleValue(), EPSILON); [EOL]     assertEquals(8.0, dataset.getMaxOutlier(0, 0).doubleValue(), EPSILON); [EOL]     assertEquals(new Range(5.0, 6.0), dataset.getRangeBounds(false)); [EOL] } <line_num>: 164,183
public void testConstructor() { [EOL]     DefaultBoxAndWhiskerXYDataset dataset = new DefaultBoxAndWhiskerXYDataset("S1"); [EOL]     assertEquals(1, dataset.getSeriesCount()); [EOL]     assertEquals(0, dataset.getItemCount(0)); [EOL]     assertTrue(Double.isNaN(dataset.getRangeLowerBound(false))); [EOL]     assertTrue(Double.isNaN(dataset.getRangeUpperBound(false))); [EOL] } <line_num>: 188,195
public void testGetRangeBounds() { [EOL]     DefaultBoxAndWhiskerXYDataset d1 = new DefaultBoxAndWhiskerXYDataset("S"); [EOL]     d1.add(new Date(1L), new BoxAndWhiskerItem(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, new ArrayList())); [EOL]     assertEquals(new Range(5.0, 6.0), d1.getRangeBounds(false)); [EOL]     assertEquals(new Range(5.0, 6.0), d1.getRangeBounds(true)); [EOL]     d1.add(new Date(1L), new BoxAndWhiskerItem(1.5, 2.5, 3.5, 4.5, 5.5, 6.5, 7.5, 8.5, new ArrayList())); [EOL]     assertEquals(new Range(5.0, 6.5), d1.getRangeBounds(false)); [EOL]     assertEquals(new Range(5.0, 6.5), d1.getRangeBounds(true)); [EOL]     d1.add(new Date(2L), new BoxAndWhiskerItem(2.5, 3.5, 4.5, 5.5, 6.5, 7.5, 8.5, 9.5, new ArrayList())); [EOL]     assertEquals(new Range(5.0, 7.5), d1.getRangeBounds(false)); [EOL]     assertEquals(new Range(5.0, 7.5), d1.getRangeBounds(true)); [EOL] } <line_num>: 200,217