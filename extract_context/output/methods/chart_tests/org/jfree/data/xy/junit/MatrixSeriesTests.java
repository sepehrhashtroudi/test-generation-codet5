public MatrixSeriesTests(String name) { [EOL]     super(name); [EOL] } <line_num>: 75,77
public static Test suite() { [EOL]     return new TestSuite(MatrixSeriesTests.class); [EOL] } <line_num>: 66,68
public void testEquals() { [EOL]     MatrixSeries m1 = new MatrixSeries("Test", 8, 3); [EOL]     m1.update(0, 0, 11.0); [EOL]     m1.update(7, 2, 22.0); [EOL]     MatrixSeries m2 = new MatrixSeries("Test", 8, 3); [EOL]     m2.update(0, 0, 11.0); [EOL]     m2.update(7, 2, 22.0); [EOL]     assertTrue(m1.equals(m2)); [EOL]     assertTrue(m2.equals(m1)); [EOL]     m1 = new MatrixSeries("Test 2", 8, 3); [EOL]     assertFalse(m1.equals(m2)); [EOL]     m2 = new MatrixSeries("Test 2", 8, 3); [EOL]     assertTrue(m1.equals(m2)); [EOL]     m1 = new MatrixSeries("Test 2", 10, 3); [EOL]     assertFalse(m1.equals(m2)); [EOL]     m2 = new MatrixSeries("Test 2", 10, 3); [EOL]     assertTrue(m1.equals(m2)); [EOL]     m1 = new MatrixSeries("Test 2", 10, 5); [EOL]     assertFalse(m1.equals(m2)); [EOL]     m2 = new MatrixSeries("Test 2", 10, 5); [EOL]     assertTrue(m1.equals(m2)); [EOL]     m1.update(0, 0, 99); [EOL]     assertFalse(m1.equals(m2)); [EOL]     m2.update(0, 0, 99); [EOL]     assertTrue(m1.equals(m2)); [EOL] } <line_num>: 82,112
public void testCloning() { [EOL]     MatrixSeries m1 = new MatrixSeries("Test", 8, 3); [EOL]     m1.update(0, 0, 11.0); [EOL]     m1.update(7, 2, 22.0); [EOL]     MatrixSeries m2 = null; [EOL]     try { [EOL]         m2 = (MatrixSeries) m1.clone(); [EOL]     } catch (CloneNotSupportedException e) { [EOL]         e.printStackTrace(); [EOL]     } [EOL]     assertTrue(m1 != m2); [EOL]     assertTrue(m1.getClass() == m2.getClass()); [EOL]     assertTrue(m1.equals(m2)); [EOL] } <line_num>: 117,131
public void testSerialization() { [EOL]     MatrixSeries m1 = new MatrixSeries("Test", 8, 3); [EOL]     m1.update(0, 0, 11.0); [EOL]     m1.update(7, 2, 22.0); [EOL]     MatrixSeries m2 = null; [EOL]     try { [EOL]         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); [EOL]         ObjectOutput out = new ObjectOutputStream(buffer); [EOL]         out.writeObject(m1); [EOL]         out.close(); [EOL]         ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray())); [EOL]         m2 = (MatrixSeries) in.readObject(); [EOL]         in.close(); [EOL]     } catch (Exception e) { [EOL]         e.printStackTrace(); [EOL]     } [EOL]     assertEquals(m1, m2); [EOL] } <line_num>: 136,156
public void testGetItemColumn() { [EOL]     MatrixSeries m = new MatrixSeries("Test", 3, 2); [EOL]     assertEquals(0, m.getItemColumn(0)); [EOL]     assertEquals(1, m.getItemColumn(1)); [EOL]     assertEquals(0, m.getItemColumn(2)); [EOL]     assertEquals(1, m.getItemColumn(3)); [EOL]     assertEquals(0, m.getItemColumn(4)); [EOL]     assertEquals(1, m.getItemColumn(5)); [EOL] } <line_num>: 161,169
public void testGetItemRow() { [EOL]     MatrixSeries m = new MatrixSeries("Test", 3, 2); [EOL]     assertEquals(0, m.getItemRow(0)); [EOL]     assertEquals(0, m.getItemRow(1)); [EOL]     assertEquals(1, m.getItemRow(2)); [EOL]     assertEquals(1, m.getItemRow(3)); [EOL]     assertEquals(2, m.getItemRow(4)); [EOL]     assertEquals(2, m.getItemRow(5)); [EOL] } <line_num>: 174,182
public void testGetItem() { [EOL]     MatrixSeries m = new MatrixSeries("Test", 3, 2); [EOL]     m.update(0, 0, 0.0); [EOL]     m.update(0, 1, 1.0); [EOL]     m.update(1, 0, 2.0); [EOL]     m.update(1, 1, 3.0); [EOL]     m.update(2, 0, 4.0); [EOL]     m.update(2, 1, 5.0); [EOL]     assertEquals(0.0, m.getItem(0).doubleValue(), 0.001); [EOL]     assertEquals(1.0, m.getItem(1).doubleValue(), 0.001); [EOL]     assertEquals(2.0, m.getItem(2).doubleValue(), 0.001); [EOL]     assertEquals(3.0, m.getItem(3).doubleValue(), 0.001); [EOL]     assertEquals(4.0, m.getItem(4).doubleValue(), 0.001); [EOL]     assertEquals(5.0, m.getItem(5).doubleValue(), 0.001); [EOL] } <line_num>: 187,201