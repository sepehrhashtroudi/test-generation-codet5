public XYLineAnnotationTests(String name) { [EOL]     super(name); [EOL] } <line_num>: 82,84
public static Test suite() { [EOL]     return new TestSuite(XYLineAnnotationTests.class); [EOL] } <line_num>: 73,75
public void testEquals() { [EOL]     Stroke stroke = new BasicStroke(2.0f); [EOL]     XYLineAnnotation a1 = new XYLineAnnotation(10.0, 20.0, 100.0, 200.0, stroke, Color.blue); [EOL]     XYLineAnnotation a2 = new XYLineAnnotation(10.0, 20.0, 100.0, 200.0, stroke, Color.blue); [EOL]     assertTrue(a1.equals(a2)); [EOL]     assertTrue(a2.equals(a1)); [EOL]     a1 = new XYLineAnnotation(11.0, 20.0, 100.0, 200.0, stroke, Color.blue); [EOL]     assertFalse(a1.equals(a2)); [EOL]     a2 = new XYLineAnnotation(11.0, 20.0, 100.0, 200.0, stroke, Color.blue); [EOL]     assertTrue(a1.equals(a2)); [EOL]     a1 = new XYLineAnnotation(11.0, 21.0, 100.0, 200.0, stroke, Color.blue); [EOL]     assertFalse(a1.equals(a2)); [EOL]     a2 = new XYLineAnnotation(11.0, 21.0, 100.0, 200.0, stroke, Color.blue); [EOL]     assertTrue(a1.equals(a2)); [EOL]     a1 = new XYLineAnnotation(11.0, 21.0, 101.0, 200.0, stroke, Color.blue); [EOL]     assertFalse(a1.equals(a2)); [EOL]     a2 = new XYLineAnnotation(11.0, 21.0, 101.0, 200.0, stroke, Color.blue); [EOL]     assertTrue(a1.equals(a2)); [EOL]     a1 = new XYLineAnnotation(11.0, 21.0, 101.0, 201.0, stroke, Color.blue); [EOL]     assertFalse(a1.equals(a2)); [EOL]     a2 = new XYLineAnnotation(11.0, 21.0, 101.0, 201.0, stroke, Color.blue); [EOL]     assertTrue(a1.equals(a2)); [EOL]     Stroke stroke2 = new BasicStroke(0.99f); [EOL]     a1 = new XYLineAnnotation(11.0, 21.0, 101.0, 200.0, stroke2, Color.blue); [EOL]     assertFalse(a1.equals(a2)); [EOL]     a2 = new XYLineAnnotation(11.0, 21.0, 101.0, 200.0, stroke2, Color.blue); [EOL]     assertTrue(a1.equals(a2)); [EOL]     GradientPaint g1 = new GradientPaint(1.0f, 2.0f, Color.red, 3.0f, 4.0f, Color.white); [EOL]     GradientPaint g2 = new GradientPaint(1.0f, 2.0f, Color.red, 3.0f, 4.0f, Color.white); [EOL]     a1 = new XYLineAnnotation(11.0, 21.0, 101.0, 200.0, stroke2, g1); [EOL]     assertFalse(a1.equals(a2)); [EOL]     a2 = new XYLineAnnotation(11.0, 21.0, 101.0, 200.0, stroke2, g2); [EOL]     assertTrue(a1.equals(a2)); [EOL] } <line_num>: 89,132
public void testHashCode() { [EOL]     Stroke stroke = new BasicStroke(2.0f); [EOL]     XYLineAnnotation a1 = new XYLineAnnotation(10.0, 20.0, 100.0, 200.0, stroke, Color.blue); [EOL]     XYLineAnnotation a2 = new XYLineAnnotation(10.0, 20.0, 100.0, 200.0, stroke, Color.blue); [EOL]     assertTrue(a1.equals(a2)); [EOL]     int h1 = a1.hashCode(); [EOL]     int h2 = a2.hashCode(); [EOL]     assertEquals(h1, h2); [EOL] } <line_num>: 137,147
public void testCloning() { [EOL]     Stroke stroke = new BasicStroke(2.0f); [EOL]     XYLineAnnotation a1 = new XYLineAnnotation(10.0, 20.0, 100.0, 200.0, stroke, Color.blue); [EOL]     XYLineAnnotation a2 = null; [EOL]     try { [EOL]         a2 = (XYLineAnnotation) a1.clone(); [EOL]     } catch (CloneNotSupportedException e) { [EOL]         System.err.println("Failed to clone."); [EOL]     } [EOL]     assertTrue(a1 != a2); [EOL]     assertTrue(a1.getClass() == a2.getClass()); [EOL]     assertTrue(a1.equals(a2)); [EOL] } <line_num>: 152,166
public void testPublicCloneable() { [EOL]     Stroke stroke = new BasicStroke(2.0f); [EOL]     XYLineAnnotation a1 = new XYLineAnnotation(10.0, 20.0, 100.0, 200.0, stroke, Color.blue); [EOL]     assertTrue(a1 instanceof PublicCloneable); [EOL] } <line_num>: 171,176
public void testSerialization() { [EOL]     Stroke stroke = new BasicStroke(2.0f); [EOL]     XYLineAnnotation a1 = new XYLineAnnotation(10.0, 20.0, 100.0, 200.0, stroke, Color.blue); [EOL]     XYLineAnnotation a2 = null; [EOL]     try { [EOL]         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); [EOL]         ObjectOutput out = new ObjectOutputStream(buffer); [EOL]         out.writeObject(a1); [EOL]         out.close(); [EOL]         ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray())); [EOL]         a2 = (XYLineAnnotation) in.readObject(); [EOL]         in.close(); [EOL]     } catch (Exception e) { [EOL]         e.printStackTrace(); [EOL]     } [EOL]     assertEquals(a1, a2); [EOL] } <line_num>: 181,204