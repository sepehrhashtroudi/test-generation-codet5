public CategoryMarkerTests(String name) { [EOL]     super(name); [EOL] } <line_num>: 92,94
public void markerChanged(MarkerChangeEvent event) { [EOL]     this.lastEvent = event; [EOL] } <line_num>: 74,76
public static Test suite() { [EOL]     return new TestSuite(CategoryMarkerTests.class); [EOL] } <line_num>: 83,85
public void testEquals() { [EOL]     CategoryMarker m1 = new CategoryMarker("A"); [EOL]     CategoryMarker m2 = new CategoryMarker("A"); [EOL]     assertTrue(m1.equals(m2)); [EOL]     assertTrue(m2.equals(m1)); [EOL]     m1 = new CategoryMarker("B"); [EOL]     assertFalse(m1.equals(m2)); [EOL]     m2 = new CategoryMarker("B"); [EOL]     assertTrue(m1.equals(m2)); [EOL]     m1 = new CategoryMarker("A", new GradientPaint(1.0f, 2.0f, Color.white, 3.0f, 4.0f, Color.yellow), new BasicStroke(1.1f)); [EOL]     assertFalse(m1.equals(m2)); [EOL]     m2 = new CategoryMarker("A", new GradientPaint(1.0f, 2.0f, Color.white, 3.0f, 4.0f, Color.yellow), new BasicStroke(1.1f)); [EOL]     assertTrue(m1.equals(m2)); [EOL]     m1 = new CategoryMarker("A", new GradientPaint(1.0f, 2.0f, Color.white, 3.0f, 4.0f, Color.yellow), new BasicStroke(2.2f)); [EOL]     assertFalse(m1.equals(m2)); [EOL]     m2 = new CategoryMarker("A", new GradientPaint(1.0f, 2.0f, Color.white, 3.0f, 4.0f, Color.yellow), new BasicStroke(2.2f)); [EOL]     assertTrue(m1.equals(m2)); [EOL]     m1 = new CategoryMarker("A", new GradientPaint(1.0f, 2.0f, Color.white, 3.0f, 4.0f, Color.yellow), new BasicStroke(2.2f), Color.red, new BasicStroke(1.0f), 1.0f); [EOL]     assertFalse(m1.equals(m2)); [EOL]     m2 = new CategoryMarker("A", new GradientPaint(1.0f, 2.0f, Color.white, 3.0f, 4.0f, Color.yellow), new BasicStroke(2.2f), Color.red, new BasicStroke(1.0f), 1.0f); [EOL]     assertTrue(m1.equals(m2)); [EOL]     m1 = new CategoryMarker("A", new GradientPaint(1.0f, 2.0f, Color.white, 3.0f, 4.0f, Color.yellow), new BasicStroke(2.2f), Color.red, new BasicStroke(3.3f), 1.0f); [EOL]     assertFalse(m1.equals(m2)); [EOL]     m2 = new CategoryMarker("A", new GradientPaint(1.0f, 2.0f, Color.white, 3.0f, 4.0f, Color.yellow), new BasicStroke(2.2f), Color.red, new BasicStroke(3.3f), 1.0f); [EOL]     assertTrue(m1.equals(m2)); [EOL]     m1 = new CategoryMarker("A", new GradientPaint(1.0f, 2.0f, Color.white, 3.0f, 4.0f, Color.yellow), new BasicStroke(2.2f), Color.red, new BasicStroke(1.0f), 0.5f); [EOL]     assertFalse(m1.equals(m2)); [EOL]     m2 = new CategoryMarker("A", new GradientPaint(1.0f, 2.0f, Color.white, 3.0f, 4.0f, Color.yellow), new BasicStroke(2.2f), Color.red, new BasicStroke(1.0f), 0.5f); [EOL]     assertTrue(m1.equals(m2)); [EOL] } <line_num>: 99,157
public void testCloning() { [EOL]     CategoryMarker m1 = new CategoryMarker("A", new GradientPaint(1.0f, 2.0f, Color.white, 3.0f, 4.0f, Color.yellow), new BasicStroke(1.1f)); [EOL]     CategoryMarker m2 = null; [EOL]     try { [EOL]         m2 = (CategoryMarker) m1.clone(); [EOL]     } catch (CloneNotSupportedException e) { [EOL]         e.printStackTrace(); [EOL]     } [EOL]     assertTrue(m1 != m2); [EOL]     assertTrue(m1.getClass() == m2.getClass()); [EOL]     assertTrue(m1.equals(m2)); [EOL] } <line_num>: 162,176
public void testSerialization() { [EOL]     CategoryMarker m1 = new CategoryMarker("A", new GradientPaint(1.0f, 2.0f, Color.white, 3.0f, 4.0f, Color.yellow), new BasicStroke(1.1f)); [EOL]     CategoryMarker m2 = null; [EOL]     try { [EOL]         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); [EOL]         ObjectOutput out = new ObjectOutputStream(buffer); [EOL]         out.writeObject(m1); [EOL]         out.close(); [EOL]         ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray())); [EOL]         m2 = (CategoryMarker) in.readObject(); [EOL]         in.close(); [EOL]     } catch (Exception e) { [EOL]         fail(e.toString()); [EOL]     } [EOL]     boolean b = m1.equals(m2); [EOL]     assertTrue(b); [EOL] } <line_num>: 181,204
public void testGetSetKey() { [EOL]     CategoryMarker m = new CategoryMarker("X"); [EOL]     m.addChangeListener(this); [EOL]     this.lastEvent = null; [EOL]     assertEquals("X", m.getKey()); [EOL]     m.setKey("Y"); [EOL]     assertEquals("Y", m.getKey()); [EOL]     assertEquals(m, this.lastEvent.getMarker()); [EOL]     try { [EOL]         m.setKey(null); [EOL]         fail("Expected an IllegalArgumentException for null."); [EOL]     } catch (IllegalArgumentException e) { [EOL]         assertTrue(true); [EOL]     } [EOL] } <line_num>: 209,226
public void testGetSetDrawAsLine() { [EOL]     CategoryMarker m = new CategoryMarker("X"); [EOL]     m.addChangeListener(this); [EOL]     this.lastEvent = null; [EOL]     assertEquals(false, m.getDrawAsLine()); [EOL]     m.setDrawAsLine(true); [EOL]     assertEquals(true, m.getDrawAsLine()); [EOL]     assertEquals(m, this.lastEvent.getMarker()); [EOL] } <line_num>: 231,239
