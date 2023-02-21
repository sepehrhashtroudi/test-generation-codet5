public DefaultTableXYDatasetTests(String name) { [EOL]     super(name); [EOL] } <line_num>: 80,82
public static Test suite() { [EOL]     return new TestSuite(DefaultTableXYDatasetTests.class); [EOL] } <line_num>: 71,73
public void testEquals() { [EOL]     DefaultTableXYDataset d1 = new DefaultTableXYDataset(); [EOL]     XYSeries s1 = new XYSeries("Series 1", true, false); [EOL]     s1.add(1.0, 1.1); [EOL]     s1.add(2.0, 2.2); [EOL]     d1.addSeries(s1); [EOL]     DefaultTableXYDataset d2 = new DefaultTableXYDataset(); [EOL]     XYSeries s2 = new XYSeries("Series 1", true, false); [EOL]     s2.add(1.0, 1.1); [EOL]     s2.add(2.0, 2.2); [EOL]     d2.addSeries(s2); [EOL]     assertTrue(d1.equals(d2)); [EOL]     assertTrue(d2.equals(d1)); [EOL]     s1.add(3.0, 3.3); [EOL]     assertFalse(d1.equals(d2)); [EOL]     s2.add(3.0, 3.3); [EOL]     assertTrue(d1.equals(d2)); [EOL] } <line_num>: 87,110
public void testCloning() { [EOL]     DefaultTableXYDataset d1 = new DefaultTableXYDataset(); [EOL]     XYSeries s1 = new XYSeries("Series 1", true, false); [EOL]     s1.add(1.0, 1.1); [EOL]     s1.add(2.0, 2.2); [EOL]     d1.addSeries(s1); [EOL]     DefaultTableXYDataset d2 = null; [EOL]     try { [EOL]         d2 = (DefaultTableXYDataset) d1.clone(); [EOL]     } catch (CloneNotSupportedException e) { [EOL]         e.printStackTrace(); [EOL]     } [EOL]     assertTrue(d1 != d2); [EOL]     assertTrue(d1.getClass() == d2.getClass()); [EOL]     assertTrue(d1.equals(d2)); [EOL]     s1.add(3.0, 3.3); [EOL]     assertFalse(d1.equals(d2)); [EOL] } <line_num>: 115,135
public void testPublicCloneable() { [EOL]     DefaultTableXYDataset d1 = new DefaultTableXYDataset(); [EOL]     assertTrue(d1 instanceof PublicCloneable); [EOL] } <line_num>: 140,143
public void testSerialization() { [EOL]     DefaultTableXYDataset d1 = new DefaultTableXYDataset(); [EOL]     XYSeries s1 = new XYSeries("Series 1", true, false); [EOL]     s1.add(1.0, 1.1); [EOL]     s1.add(2.0, 2.2); [EOL]     d1.addSeries(s1); [EOL]     DefaultTableXYDataset d2 = null; [EOL]     try { [EOL]         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); [EOL]         ObjectOutput out = new ObjectOutputStream(buffer); [EOL]         out.writeObject(d1); [EOL]         out.close(); [EOL]         ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray())); [EOL]         d2 = (DefaultTableXYDataset) in.readObject(); [EOL]         in.close(); [EOL]     } catch (Exception e) { [EOL]         e.printStackTrace(); [EOL]     } [EOL]     assertEquals(d1, d2); [EOL] } <line_num>: 148,174
public void testAddSeries() { [EOL]     DefaultTableXYDataset d1 = new DefaultTableXYDataset(); [EOL]     d1.setAutoWidth(true); [EOL]     XYSeries s1 = new XYSeries("Series 1", true, false); [EOL]     s1.add(3.0, 1.1); [EOL]     s1.add(7.0, 2.2); [EOL]     d1.addSeries(s1); [EOL]     assertEquals(3.0, d1.getXValue(0, 0), EPSILON); [EOL]     assertEquals(7.0, d1.getXValue(0, 1), EPSILON); [EOL]     assertEquals(1.0, d1.getStartXValue(0, 0), EPSILON); [EOL]     assertEquals(5.0, d1.getStartXValue(0, 1), EPSILON); [EOL]     assertEquals(5.0, d1.getEndXValue(0, 0), EPSILON); [EOL]     assertEquals(9.0, d1.getEndXValue(0, 1), EPSILON); [EOL]     XYSeries s2 = new XYSeries("Series 2", true, false); [EOL]     s2.add(7.5, 1.1); [EOL]     s2.add(9.0, 2.2); [EOL]     d1.addSeries(s2); [EOL]     assertEquals(3.0, d1.getXValue(1, 0), EPSILON); [EOL]     assertEquals(7.0, d1.getXValue(1, 1), EPSILON); [EOL]     assertEquals(7.5, d1.getXValue(1, 2), EPSILON); [EOL]     assertEquals(9.0, d1.getXValue(1, 3), EPSILON); [EOL]     assertEquals(7.25, d1.getStartXValue(1, 2), EPSILON); [EOL]     assertEquals(8.75, d1.getStartXValue(1, 3), EPSILON); [EOL]     assertEquals(7.75, d1.getEndXValue(1, 2), EPSILON); [EOL]     assertEquals(9.25, d1.getEndXValue(1, 3), EPSILON); [EOL]     assertEquals(2.75, d1.getStartXValue(0, 0), EPSILON); [EOL]     assertEquals(6.75, d1.getStartXValue(0, 1), EPSILON); [EOL]     assertEquals(3.25, d1.getEndXValue(0, 0), EPSILON); [EOL]     assertEquals(7.25, d1.getEndXValue(0, 1), EPSILON); [EOL] } <line_num>: 183,218
public void testGetSeries() { [EOL]     DefaultTableXYDataset d1 = new DefaultTableXYDataset(); [EOL]     XYSeries s1 = new XYSeries("Series 1", true, false); [EOL]     d1.addSeries(s1); [EOL]     assertEquals("Series 1", d1.getSeries(0).getKey()); [EOL]     boolean pass = false; [EOL]     try { [EOL]         d1.getSeries(-1); [EOL]     } catch (IllegalArgumentException e) { [EOL]         pass = true; [EOL]     } [EOL]     assertTrue(pass); [EOL]     pass = false; [EOL]     try { [EOL]         d1.getSeries(1); [EOL]     } catch (IllegalArgumentException e) { [EOL]         pass = true; [EOL]     } [EOL]     assertTrue(pass); [EOL] } <line_num>: 223,246
