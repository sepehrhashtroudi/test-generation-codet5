public XIntervalDataItemTests(String name) { [EOL]     super(name); [EOL] } <line_num>: 75,77
public static Test suite() { [EOL]     return new TestSuite(XIntervalDataItemTests.class); [EOL] } <line_num>: 66,68
public void testConstructor1() { [EOL]     XIntervalDataItem item1 = new XIntervalDataItem(1.0, 2.0, 3.0, 4.0); [EOL]     assertEquals(new Double(1.0), item1.getX()); [EOL]     assertEquals(2.0, item1.getXLowValue(), EPSILON); [EOL]     assertEquals(3.0, item1.getXHighValue(), EPSILON); [EOL]     assertEquals(4.0, item1.getYValue(), EPSILON); [EOL] } <line_num>: 84,90
public void testEquals() { [EOL]     XIntervalDataItem item1 = new XIntervalDataItem(1.0, 2.0, 3.0, 4.0); [EOL]     XIntervalDataItem item2 = new XIntervalDataItem(1.0, 2.0, 3.0, 4.0); [EOL]     assertTrue(item1.equals(item2)); [EOL]     assertTrue(item2.equals(item1)); [EOL]     item1 = new XIntervalDataItem(1.1, 2.0, 3.0, 4.0); [EOL]     assertFalse(item1.equals(item2)); [EOL]     item2 = new XIntervalDataItem(1.1, 2.0, 3.0, 4.0); [EOL]     assertTrue(item1.equals(item2)); [EOL]     item1 = new XIntervalDataItem(1.1, 2.2, 3.0, 4.0); [EOL]     assertFalse(item1.equals(item2)); [EOL]     item2 = new XIntervalDataItem(1.1, 2.2, 3.0, 4.0); [EOL]     assertTrue(item1.equals(item2)); [EOL]     item1 = new XIntervalDataItem(1.1, 2.2, 3.3, 4.0); [EOL]     assertFalse(item1.equals(item2)); [EOL]     item2 = new XIntervalDataItem(1.1, 2.2, 3.3, 4.0); [EOL]     assertTrue(item1.equals(item2)); [EOL]     item1 = new XIntervalDataItem(1.1, 2.2, 3.3, 4.4); [EOL]     assertFalse(item1.equals(item2)); [EOL]     item2 = new XIntervalDataItem(1.1, 2.2, 3.3, 4.4); [EOL]     assertTrue(item1.equals(item2)); [EOL] } <line_num>: 95,125
public void testCloning() { [EOL]     XIntervalDataItem item1 = new XIntervalDataItem(1.0, 2.0, 3.0, 4.0); [EOL]     XIntervalDataItem item2 = null; [EOL]     try { [EOL]         item2 = (XIntervalDataItem) item1.clone(); [EOL]     } catch (CloneNotSupportedException e) { [EOL]         e.printStackTrace(); [EOL]     } [EOL]     assertTrue(item1 != item2); [EOL]     assertTrue(item1.getClass() == item2.getClass()); [EOL]     assertTrue(item1.equals(item2)); [EOL] } <line_num>: 130,142
public void testSerialization() { [EOL]     XIntervalDataItem item1 = new XIntervalDataItem(1.0, 2.0, 3.0, 4.0); [EOL]     XIntervalDataItem item2 = null; [EOL]     try { [EOL]         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); [EOL]         ObjectOutput out = new ObjectOutputStream(buffer); [EOL]         out.writeObject(item1); [EOL]         out.close(); [EOL]         ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray())); [EOL]         item2 = (XIntervalDataItem) in.readObject(); [EOL]         in.close(); [EOL]     } catch (Exception e) { [EOL]         e.printStackTrace(); [EOL]     } [EOL]     assertEquals(item1, item2); [EOL] } <line_num>: 147,165