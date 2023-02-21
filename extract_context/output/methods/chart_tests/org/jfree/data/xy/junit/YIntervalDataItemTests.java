public YIntervalDataItemTests(String name) { [EOL]     super(name); [EOL] } <line_num>: 75,77
public static Test suite() { [EOL]     return new TestSuite(YIntervalDataItemTests.class); [EOL] } <line_num>: 66,68
public void testConstructor1() { [EOL]     YIntervalDataItem item1 = new YIntervalDataItem(1.0, 2.0, 3.0, 4.0); [EOL]     assertEquals(new Double(1.0), item1.getX()); [EOL]     assertEquals(2.0, item1.getYValue(), EPSILON); [EOL]     assertEquals(3.0, item1.getYLowValue(), EPSILON); [EOL]     assertEquals(4.0, item1.getYHighValue(), EPSILON); [EOL] } <line_num>: 84,90
public void testEquals() { [EOL]     YIntervalDataItem item1 = new YIntervalDataItem(1.0, 2.0, 1.5, 2.5); [EOL]     YIntervalDataItem item2 = new YIntervalDataItem(1.0, 2.0, 1.5, 2.5); [EOL]     assertTrue(item1.equals(item2)); [EOL]     assertTrue(item2.equals(item1)); [EOL]     item1 = new YIntervalDataItem(1.1, 2.0, 1.5, 2.5); [EOL]     assertFalse(item1.equals(item2)); [EOL]     item2 = new YIntervalDataItem(1.1, 2.0, 1.5, 2.5); [EOL]     assertTrue(item1.equals(item2)); [EOL]     item1 = new YIntervalDataItem(1.1, 2.2, 1.5, 2.5); [EOL]     assertFalse(item1.equals(item2)); [EOL]     item2 = new YIntervalDataItem(1.1, 2.2, 1.5, 2.5); [EOL]     assertTrue(item1.equals(item2)); [EOL]     item1 = new YIntervalDataItem(1.1, 2.2, 1.55, 2.5); [EOL]     assertFalse(item1.equals(item2)); [EOL]     item2 = new YIntervalDataItem(1.1, 2.2, 1.55, 2.5); [EOL]     assertTrue(item1.equals(item2)); [EOL]     item1 = new YIntervalDataItem(1.1, 2.2, 1.55, 2.55); [EOL]     assertFalse(item1.equals(item2)); [EOL]     item2 = new YIntervalDataItem(1.1, 2.2, 1.55, 2.55); [EOL]     assertTrue(item1.equals(item2)); [EOL] } <line_num>: 95,124
public void testCloning() { [EOL]     YIntervalDataItem item1 = new YIntervalDataItem(1.0, 2.0, 1.5, 2.5); [EOL]     YIntervalDataItem item2 = null; [EOL]     try { [EOL]         item2 = (YIntervalDataItem) item1.clone(); [EOL]     } catch (CloneNotSupportedException e) { [EOL]         e.printStackTrace(); [EOL]     } [EOL]     assertTrue(item1 != item2); [EOL]     assertTrue(item1.getClass() == item2.getClass()); [EOL]     assertTrue(item1.equals(item2)); [EOL] } <line_num>: 129,141
public void testSerialization() { [EOL]     YIntervalDataItem item1 = new YIntervalDataItem(1.0, 2.0, 1.5, 2.5); [EOL]     YIntervalDataItem item2 = null; [EOL]     try { [EOL]         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); [EOL]         ObjectOutput out = new ObjectOutputStream(buffer); [EOL]         out.writeObject(item1); [EOL]         out.close(); [EOL]         ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray())); [EOL]         item2 = (YIntervalDataItem) in.readObject(); [EOL]         in.close(); [EOL]     } catch (Exception e) { [EOL]         e.printStackTrace(); [EOL]     } [EOL]     assertEquals(item1, item2); [EOL] } <line_num>: 146,164
