public NormalDistributionFunction2DTests(String name) { [EOL]     super(name); [EOL] } <line_num>: 76,78
public static Test suite() { [EOL]     return new TestSuite(NormalDistributionFunction2DTests.class); [EOL] } <line_num>: 67,69
public void testConstructor() { [EOL]     NormalDistributionFunction2D f = new NormalDistributionFunction2D(1.0, 2.0); [EOL]     assertEquals(1.0, f.getMean(), EPSILON); [EOL]     assertEquals(2.0, f.getStandardDeviation(), EPSILON); [EOL] } <line_num>: 85,90
public void testEquals() { [EOL]     NormalDistributionFunction2D f1 = new NormalDistributionFunction2D(1.0, 2.0); [EOL]     NormalDistributionFunction2D f2 = new NormalDistributionFunction2D(1.0, 2.0); [EOL]     assertTrue(f1.equals(f2)); [EOL]     f1 = new NormalDistributionFunction2D(2.0, 3.0); [EOL]     assertFalse(f1.equals(f2)); [EOL]     f2 = new NormalDistributionFunction2D(2.0, 3.0); [EOL]     assertTrue(f1.equals(f2)); [EOL] } <line_num>: 95,105
public void testSerialization() { [EOL]     NormalDistributionFunction2D f1 = new NormalDistributionFunction2D(1.0, 2.0); [EOL]     NormalDistributionFunction2D f2 = null; [EOL]     try { [EOL]         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); [EOL]         ObjectOutput out = new ObjectOutputStream(buffer); [EOL]         out.writeObject(f1); [EOL]         out.close(); [EOL]         ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray())); [EOL]         f2 = (NormalDistributionFunction2D) in.readObject(); [EOL]         in.close(); [EOL]     } catch (Exception e) { [EOL]         e.printStackTrace(); [EOL]     } [EOL]     assertEquals(f1, f2); [EOL] } <line_num>: 110,130
public void testHashCode() { [EOL]     NormalDistributionFunction2D f1 = new NormalDistributionFunction2D(1.0, 2.0); [EOL]     NormalDistributionFunction2D f2 = new NormalDistributionFunction2D(1.0, 2.0); [EOL]     assertEquals(f1.hashCode(), f2.hashCode()); [EOL] } <line_num>: 136,142
