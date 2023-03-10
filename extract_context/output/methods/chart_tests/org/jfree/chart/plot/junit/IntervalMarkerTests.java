public IntervalMarkerTests(String name) { [EOL]     super(name); [EOL] } <line_num>: 93,95
public void markerChanged(MarkerChangeEvent event) { [EOL]     this.lastEvent = event; [EOL] } <line_num>: 75,77
public static Test suite() { [EOL]     return new TestSuite(IntervalMarkerTests.class); [EOL] } <line_num>: 84,86
public void testEquals() { [EOL]     IntervalMarker m1 = new IntervalMarker(45.0, 50.0); [EOL]     IntervalMarker m2 = new IntervalMarker(45.0, 50.0); [EOL]     assertTrue(m1.equals(m2)); [EOL]     assertTrue(m2.equals(m1)); [EOL]     m1 = new IntervalMarker(44.0, 50.0); [EOL]     assertFalse(m1.equals(m2)); [EOL]     m2 = new IntervalMarker(44.0, 50.0); [EOL]     assertTrue(m1.equals(m2)); [EOL]     m1 = new IntervalMarker(44.0, 55.0); [EOL]     assertFalse(m1.equals(m2)); [EOL]     m2 = new IntervalMarker(44.0, 55.0); [EOL]     assertTrue(m1.equals(m2)); [EOL]     GradientPaintTransformer t = new StandardGradientPaintTransformer(GradientPaintTransformType.HORIZONTAL); [EOL]     m1.setGradientPaintTransformer(t); [EOL]     assertFalse(m1.equals(m2)); [EOL]     m2.setGradientPaintTransformer(t); [EOL]     assertTrue(m1.equals(m2)); [EOL] } <line_num>: 100,124
public void testCloning() { [EOL]     IntervalMarker m1 = new IntervalMarker(45.0, 50.0); [EOL]     IntervalMarker m2 = null; [EOL]     try { [EOL]         m2 = (IntervalMarker) m1.clone(); [EOL]     } catch (CloneNotSupportedException e) { [EOL]         e.printStackTrace(); [EOL]     } [EOL]     assertTrue(m1 != m2); [EOL]     assertTrue(m1.getClass() == m2.getClass()); [EOL]     assertTrue(m1.equals(m2)); [EOL] } <line_num>: 129,141
public void testSerialization() { [EOL]     IntervalMarker m1 = new IntervalMarker(45.0, 50.0); [EOL]     IntervalMarker m2 = null; [EOL]     try { [EOL]         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); [EOL]         ObjectOutput out = new ObjectOutputStream(buffer); [EOL]         out.writeObject(m1); [EOL]         out.close(); [EOL]         ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray())); [EOL]         m2 = (IntervalMarker) in.readObject(); [EOL]         in.close(); [EOL]     } catch (Exception e) { [EOL]         e.printStackTrace(); [EOL]     } [EOL]     boolean b = m1.equals(m2); [EOL]     assertTrue(b); [EOL] } <line_num>: 146,167
public void testGetSetStartValue() { [EOL]     IntervalMarker m = new IntervalMarker(1.0, 2.0); [EOL]     m.addChangeListener(this); [EOL]     this.lastEvent = null; [EOL]     assertEquals(1.0, m.getStartValue(), EPSILON); [EOL]     m.setStartValue(0.5); [EOL]     assertEquals(0.5, m.getStartValue(), EPSILON); [EOL]     assertEquals(m, this.lastEvent.getMarker()); [EOL] } <line_num>: 174,182
public void testGetSetEndValue() { [EOL]     IntervalMarker m = new IntervalMarker(1.0, 2.0); [EOL]     m.addChangeListener(this); [EOL]     this.lastEvent = null; [EOL]     assertEquals(2.0, m.getEndValue(), EPSILON); [EOL]     m.setEndValue(0.5); [EOL]     assertEquals(0.5, m.getEndValue(), EPSILON); [EOL]     assertEquals(m, this.lastEvent.getMarker()); [EOL] } <line_num>: 187,195
