public BlockBorderTests(String name) { [EOL]     super(name); [EOL] } <line_num>: 80,82
public static Test suite() { [EOL]     return new TestSuite(BlockBorderTests.class); [EOL] } <line_num>: 71,73
public void testEquals() { [EOL]     BlockBorder b1 = new BlockBorder(new RectangleInsets(1.0, 2.0, 3.0, 4.0), Color.red); [EOL]     BlockBorder b2 = new BlockBorder(new RectangleInsets(1.0, 2.0, 3.0, 4.0), Color.red); [EOL]     assertTrue(b1.equals(b2)); [EOL]     assertTrue(b2.equals(b2)); [EOL]     b1 = new BlockBorder(new RectangleInsets(UnitType.RELATIVE, 1.0, 2.0, 3.0, 4.0), Color.red); [EOL]     assertFalse(b1.equals(b2)); [EOL]     b2 = new BlockBorder(new RectangleInsets(UnitType.RELATIVE, 1.0, 2.0, 3.0, 4.0), Color.red); [EOL]     assertTrue(b1.equals(b2)); [EOL]     b1 = new BlockBorder(new RectangleInsets(1.0, 2.0, 3.0, 4.0), Color.blue); [EOL]     assertFalse(b1.equals(b2)); [EOL]     b2 = new BlockBorder(new RectangleInsets(1.0, 2.0, 3.0, 4.0), Color.blue); [EOL]     assertTrue(b1.equals(b2)); [EOL] } <line_num>: 87,110
public void testCloning() { [EOL]     BlockBorder b1 = new BlockBorder(); [EOL]     assertFalse(b1 instanceof Cloneable); [EOL] } <line_num>: 115,118
public void testSerialization() { [EOL]     BlockBorder b1 = new BlockBorder(new RectangleInsets(1.0, 2.0, 3.0, 4.0), new GradientPaint(1.0f, 2.0f, Color.red, 3.0f, 4.0f, Color.yellow)); [EOL]     BlockBorder b2 = null; [EOL]     try { [EOL]         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); [EOL]         ObjectOutput out = new ObjectOutputStream(buffer); [EOL]         out.writeObject(b1); [EOL]         out.close(); [EOL]         ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray())); [EOL]         b2 = (BlockBorder) in.readObject(); [EOL]         in.close(); [EOL]     } catch (Exception e) { [EOL]         fail(e.toString()); [EOL]     } [EOL]     assertTrue(b1.equals(b2)); [EOL] } <line_num>: 123,143
