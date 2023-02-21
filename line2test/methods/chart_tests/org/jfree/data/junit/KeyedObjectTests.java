public KeyedObjectTests(String name) { [EOL]     super(name); [EOL] } <line_num>: 78,80
public static Test suite() { [EOL]     return new TestSuite(KeyedObjectTests.class); [EOL] } <line_num>: 69,71
public void testEquals() { [EOL]     KeyedObject ko1 = new KeyedObject("Test", "Object"); [EOL]     KeyedObject ko2 = new KeyedObject("Test", "Object"); [EOL]     assertTrue(ko1.equals(ko2)); [EOL]     assertTrue(ko2.equals(ko1)); [EOL]     ko1 = new KeyedObject("Test 1", "Object"); [EOL]     ko2 = new KeyedObject("Test 2", "Object"); [EOL]     assertFalse(ko1.equals(ko2)); [EOL]     ko1 = new KeyedObject("Test", "Object 1"); [EOL]     ko2 = new KeyedObject("Test", "Object 2"); [EOL]     assertFalse(ko1.equals(ko2)); [EOL] } <line_num>: 85,100
public void testCloning() { [EOL]     KeyedObject ko1 = new KeyedObject("Test", "Object"); [EOL]     KeyedObject ko2 = null; [EOL]     try { [EOL]         ko2 = (KeyedObject) ko1.clone(); [EOL]     } catch (CloneNotSupportedException e) { [EOL]         e.printStackTrace(); [EOL]     } [EOL]     assertTrue(ko1 != ko2); [EOL]     assertTrue(ko1.getClass() == ko2.getClass()); [EOL]     assertTrue(ko1.equals(ko2)); [EOL] } <line_num>: 105,117
public void testCloning2() { [EOL]     Object obj1 = new ArrayList(); [EOL]     KeyedObject ko1 = new KeyedObject("Test", obj1); [EOL]     KeyedObject ko2 = null; [EOL]     try { [EOL]         ko2 = (KeyedObject) ko1.clone(); [EOL]     } catch (CloneNotSupportedException e) { [EOL]         e.printStackTrace(); [EOL]     } [EOL]     assertTrue(ko1 != ko2); [EOL]     assertTrue(ko1.getClass() == ko2.getClass()); [EOL]     assertTrue(ko1.equals(ko2)); [EOL]     assertTrue(ko2.getObject() == obj1); [EOL]     obj1 = new DefaultPieDataset(); [EOL]     ko1 = new KeyedObject("Test", obj1); [EOL]     ko2 = null; [EOL]     try { [EOL]         ko2 = (KeyedObject) ko1.clone(); [EOL]     } catch (CloneNotSupportedException e) { [EOL]         e.printStackTrace(); [EOL]     } [EOL]     assertTrue(ko1 != ko2); [EOL]     assertTrue(ko1.getClass() == ko2.getClass()); [EOL]     assertTrue(ko1.equals(ko2)); [EOL]     assertTrue(ko2.getObject() != obj1); [EOL] } <line_num>: 122,156
public void testSerialization() { [EOL]     KeyedObject ko1 = new KeyedObject("Test", "Object"); [EOL]     KeyedObject ko2 = null; [EOL]     try { [EOL]         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); [EOL]         ObjectOutput out = new ObjectOutputStream(buffer); [EOL]         out.writeObject(ko1); [EOL]         out.close(); [EOL]         ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray())); [EOL]         ko2 = (KeyedObject) in.readObject(); [EOL]         in.close(); [EOL]     } catch (Exception e) { [EOL]         e.printStackTrace(); [EOL]     } [EOL]     assertEquals(ko1, ko2); [EOL] } <line_num>: 161,183
