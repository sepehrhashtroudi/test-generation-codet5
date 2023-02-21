public XYShapeAnnotationTests(String name) { [EOL]     super(name); [EOL] } <line_num>: 82,84
public static Test suite() { [EOL]     return new TestSuite(XYShapeAnnotationTests.class); [EOL] } <line_num>: 73,75
public void testEquals() { [EOL]     XYShapeAnnotation a1 = new XYShapeAnnotation(new Rectangle2D.Double(1.0, 2.0, 3.0, 4.0), new BasicStroke(1.2f), Color.red, Color.blue); [EOL]     XYShapeAnnotation a2 = new XYShapeAnnotation(new Rectangle2D.Double(1.0, 2.0, 3.0, 4.0), new BasicStroke(1.2f), Color.red, Color.blue); [EOL]     assertTrue(a1.equals(a2)); [EOL]     assertTrue(a2.equals(a1)); [EOL]     a1 = new XYShapeAnnotation(new Rectangle2D.Double(4.0, 3.0, 2.0, 1.0), new BasicStroke(1.2f), Color.red, Color.blue); [EOL]     assertFalse(a1.equals(a2)); [EOL]     a2 = new XYShapeAnnotation(new Rectangle2D.Double(4.0, 3.0, 2.0, 1.0), new BasicStroke(1.2f), Color.red, Color.blue); [EOL]     assertTrue(a1.equals(a2)); [EOL]     a1 = new XYShapeAnnotation(new Rectangle2D.Double(4.0, 3.0, 2.0, 1.0), new BasicStroke(2.3f), Color.red, Color.blue); [EOL]     assertFalse(a1.equals(a2)); [EOL]     a2 = new XYShapeAnnotation(new Rectangle2D.Double(4.0, 3.0, 2.0, 1.0), new BasicStroke(2.3f), Color.red, Color.blue); [EOL]     assertTrue(a1.equals(a2)); [EOL]     GradientPaint gp1a = new GradientPaint(1.0f, 2.0f, Color.blue, 3.0f, 4.0f, Color.red); [EOL]     GradientPaint gp1b = new GradientPaint(1.0f, 2.0f, Color.blue, 3.0f, 4.0f, Color.red); [EOL]     GradientPaint gp2a = new GradientPaint(5.0f, 6.0f, Color.pink, 7.0f, 8.0f, Color.white); [EOL]     GradientPaint gp2b = new GradientPaint(5.0f, 6.0f, Color.pink, 7.0f, 8.0f, Color.white); [EOL]     a1 = new XYShapeAnnotation(new Rectangle2D.Double(4.0, 3.0, 2.0, 1.0), new BasicStroke(2.3f), gp1a, Color.blue); [EOL]     assertFalse(a1.equals(a2)); [EOL]     a2 = new XYShapeAnnotation(new Rectangle2D.Double(4.0, 3.0, 2.0, 1.0), new BasicStroke(2.3f), gp1b, Color.blue); [EOL]     assertTrue(a1.equals(a2)); [EOL]     a1 = new XYShapeAnnotation(new Rectangle2D.Double(4.0, 3.0, 2.0, 1.0), new BasicStroke(2.3f), gp1a, gp2a); [EOL]     assertFalse(a1.equals(a2)); [EOL]     a2 = new XYShapeAnnotation(new Rectangle2D.Double(4.0, 3.0, 2.0, 1.0), new BasicStroke(2.3f), gp1b, gp2b); [EOL]     assertTrue(a1.equals(a2)); [EOL] } <line_num>: 89,148
public void testHashCode() { [EOL]     XYShapeAnnotation a1 = new XYShapeAnnotation(new Rectangle2D.Double(1.0, 2.0, 3.0, 4.0), new BasicStroke(1.2f), Color.red, Color.blue); [EOL]     XYShapeAnnotation a2 = new XYShapeAnnotation(new Rectangle2D.Double(1.0, 2.0, 3.0, 4.0), new BasicStroke(1.2f), Color.red, Color.blue); [EOL]     assertTrue(a1.equals(a2)); [EOL]     int h1 = a1.hashCode(); [EOL]     int h2 = a2.hashCode(); [EOL]     assertEquals(h1, h2); [EOL] } <line_num>: 153,164
public void testCloning() { [EOL]     XYShapeAnnotation a1 = new XYShapeAnnotation(new Rectangle2D.Double(1.0, 2.0, 3.0, 4.0), new BasicStroke(1.2f), Color.red, Color.blue); [EOL]     XYShapeAnnotation a2 = null; [EOL]     try { [EOL]         a2 = (XYShapeAnnotation) a1.clone(); [EOL]     } catch (CloneNotSupportedException e) { [EOL]         e.printStackTrace(); [EOL]     } [EOL]     assertTrue(a1 != a2); [EOL]     assertTrue(a1.getClass() == a2.getClass()); [EOL]     assertTrue(a1.equals(a2)); [EOL] } <line_num>: 169,183
public void testPublicCloneable() { [EOL]     XYShapeAnnotation a1 = new XYShapeAnnotation(new Rectangle2D.Double(1.0, 2.0, 3.0, 4.0), new BasicStroke(1.2f), Color.red, Color.blue); [EOL]     assertTrue(a1 instanceof PublicCloneable); [EOL] } <line_num>: 188,193
public void testSerialization() { [EOL]     XYShapeAnnotation a1 = new XYShapeAnnotation(new Rectangle2D.Double(1.0, 2.0, 3.0, 4.0), new BasicStroke(1.2f), Color.red, Color.blue); [EOL]     XYShapeAnnotation a2 = null; [EOL]     try { [EOL]         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); [EOL]         ObjectOutput out = new ObjectOutputStream(buffer); [EOL]         out.writeObject(a1); [EOL]         out.close(); [EOL]         ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray())); [EOL]         a2 = (XYShapeAnnotation) in.readObject(); [EOL]         in.close(); [EOL]     } catch (Exception e) { [EOL]         e.printStackTrace(); [EOL]     } [EOL]     assertEquals(a1, a2); [EOL] } <line_num>: 198,219