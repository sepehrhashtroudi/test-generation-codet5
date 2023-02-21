public CategoryLineAnnotationTests(String name) { [EOL]     super(name); [EOL] } <line_num>: 79,81
public static Test suite() { [EOL]     return new TestSuite(CategoryLineAnnotationTests.class); [EOL] } <line_num>: 70,72
public void testEquals() { [EOL]     BasicStroke s1 = new BasicStroke(1.0f); [EOL]     BasicStroke s2 = new BasicStroke(2.0f); [EOL]     CategoryLineAnnotation a1 = new CategoryLineAnnotation("Category 1", 1.0, "Category 2", 2.0, Color.red, s1); [EOL]     CategoryLineAnnotation a2 = new CategoryLineAnnotation("Category 1", 1.0, "Category 2", 2.0, Color.red, s1); [EOL]     assertTrue(a1.equals(a2)); [EOL]     assertTrue(a2.equals(a1)); [EOL]     a1.setCategory1("Category A"); [EOL]     assertFalse(a1.equals(a2)); [EOL]     a2.setCategory1("Category A"); [EOL]     assertTrue(a1.equals(a2)); [EOL]     a1.setValue1(0.15); [EOL]     assertFalse(a1.equals(a2)); [EOL]     a2.setValue1(0.15); [EOL]     assertTrue(a1.equals(a2)); [EOL]     a1.setCategory2("Category B"); [EOL]     assertFalse(a1.equals(a2)); [EOL]     a2.setCategory2("Category B"); [EOL]     assertTrue(a1.equals(a2)); [EOL]     a1.setValue2(0.25); [EOL]     assertFalse(a1.equals(a2)); [EOL]     a2.setValue2(0.25); [EOL]     assertTrue(a1.equals(a2)); [EOL]     a1.setPaint(Color.yellow); [EOL]     assertFalse(a1.equals(a2)); [EOL]     a2.setPaint(Color.yellow); [EOL]     assertTrue(a1.equals(a2)); [EOL]     a1.setStroke(s2); [EOL]     assertFalse(a1.equals(a2)); [EOL]     a2.setStroke(s2); [EOL]     assertTrue(a1.equals(a2)); [EOL] } <line_num>: 86,132
public void testHashcode() { [EOL]     CategoryLineAnnotation a1 = new CategoryLineAnnotation("Category 1", 1.0, "Category 2", 2.0, Color.red, new BasicStroke(1.0f)); [EOL]     CategoryLineAnnotation a2 = new CategoryLineAnnotation("Category 1", 1.0, "Category 2", 2.0, Color.red, new BasicStroke(1.0f)); [EOL]     assertTrue(a1.equals(a2)); [EOL]     int h1 = a1.hashCode(); [EOL]     int h2 = a2.hashCode(); [EOL]     assertEquals(h1, h2); [EOL] } <line_num>: 137,146
public void testCloning() { [EOL]     CategoryLineAnnotation a1 = new CategoryLineAnnotation("Category 1", 1.0, "Category 2", 2.0, Color.red, new BasicStroke(1.0f)); [EOL]     CategoryLineAnnotation a2 = null; [EOL]     try { [EOL]         a2 = (CategoryLineAnnotation) a1.clone(); [EOL]     } catch (CloneNotSupportedException e) { [EOL]         e.printStackTrace(); [EOL]     } [EOL]     assertTrue(a1 != a2); [EOL]     assertTrue(a1.getClass() == a2.getClass()); [EOL]     assertTrue(a1.equals(a2)); [EOL] } <line_num>: 151,164
public void testPublicCloneable() { [EOL]     CategoryLineAnnotation a1 = new CategoryLineAnnotation("Category 1", 1.0, "Category 2", 2.0, Color.red, new BasicStroke(1.0f)); [EOL]     assertTrue(a1 instanceof PublicCloneable); [EOL] } <line_num>: 169,174
public void testSerialization() { [EOL]     CategoryLineAnnotation a1 = new CategoryLineAnnotation("Category 1", 1.0, "Category 2", 2.0, Color.red, new BasicStroke(1.0f)); [EOL]     CategoryLineAnnotation a2 = null; [EOL]     try { [EOL]         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); [EOL]         ObjectOutput out = new ObjectOutputStream(buffer); [EOL]         out.writeObject(a1); [EOL]         out.close(); [EOL]         ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray())); [EOL]         a2 = (CategoryLineAnnotation) in.readObject(); [EOL]         in.close(); [EOL]     } catch (Exception e) { [EOL]         e.printStackTrace(); [EOL]     } [EOL]     assertEquals(a1, a2); [EOL] } <line_num>: 179,198