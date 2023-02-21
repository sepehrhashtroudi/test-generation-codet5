public SimpleHistogramBinTests(String name) { [EOL]     super(name); [EOL] } <line_num>: 75,77
public static Test suite() { [EOL]     return new TestSuite(SimpleHistogramBinTests.class); [EOL] } <line_num>: 66,68
public void testAccepts() { [EOL]     SimpleHistogramBin bin1 = new SimpleHistogramBin(1.0, 2.0); [EOL]     assertFalse(bin1.accepts(0.0)); [EOL]     assertTrue(bin1.accepts(1.0)); [EOL]     assertTrue(bin1.accepts(1.5)); [EOL]     assertTrue(bin1.accepts(2.0)); [EOL]     assertFalse(bin1.accepts(2.1)); [EOL]     assertFalse(bin1.accepts(Double.NaN)); [EOL]     SimpleHistogramBin bin2 = new SimpleHistogramBin(1.0, 2.0, false, false); [EOL]     assertFalse(bin2.accepts(0.0)); [EOL]     assertFalse(bin2.accepts(1.0)); [EOL]     assertTrue(bin2.accepts(1.5)); [EOL]     assertFalse(bin2.accepts(2.0)); [EOL]     assertFalse(bin2.accepts(2.1)); [EOL]     assertFalse(bin2.accepts(Double.NaN)); [EOL] } <line_num>: 82,99
public void testOverlapsWidth() { [EOL]     SimpleHistogramBin b1 = new SimpleHistogramBin(1.0, 2.0); [EOL]     SimpleHistogramBin b2 = new SimpleHistogramBin(2.0, 3.0); [EOL]     SimpleHistogramBin b3 = new SimpleHistogramBin(3.0, 4.0); [EOL]     SimpleHistogramBin b4 = new SimpleHistogramBin(0.0, 5.0); [EOL]     SimpleHistogramBin b5 = new SimpleHistogramBin(2.0, 3.0, false, true); [EOL]     SimpleHistogramBin b6 = new SimpleHistogramBin(2.0, 3.0, true, false); [EOL]     assertTrue(b1.overlapsWith(b2)); [EOL]     assertTrue(b2.overlapsWith(b1)); [EOL]     assertFalse(b1.overlapsWith(b3)); [EOL]     assertFalse(b3.overlapsWith(b1)); [EOL]     assertTrue(b1.overlapsWith(b4)); [EOL]     assertTrue(b4.overlapsWith(b1)); [EOL]     assertFalse(b1.overlapsWith(b5)); [EOL]     assertFalse(b5.overlapsWith(b1)); [EOL]     assertTrue(b1.overlapsWith(b6)); [EOL]     assertTrue(b6.overlapsWith(b1)); [EOL] } <line_num>: 104,121
public void testEquals() { [EOL]     SimpleHistogramBin b1 = new SimpleHistogramBin(1.0, 2.0); [EOL]     SimpleHistogramBin b2 = new SimpleHistogramBin(1.0, 2.0); [EOL]     assertTrue(b1.equals(b2)); [EOL]     assertTrue(b2.equals(b1)); [EOL]     b1 = new SimpleHistogramBin(1.1, 2.0, true, true); [EOL]     assertFalse(b1.equals(b2)); [EOL]     b2 = new SimpleHistogramBin(1.1, 2.0, true, true); [EOL]     assertTrue(b1.equals(b2)); [EOL]     b1 = new SimpleHistogramBin(1.1, 2.2, true, true); [EOL]     assertFalse(b1.equals(b2)); [EOL]     b2 = new SimpleHistogramBin(1.1, 2.2, true, true); [EOL]     assertTrue(b1.equals(b2)); [EOL]     b1 = new SimpleHistogramBin(1.1, 2.2, false, true); [EOL]     assertFalse(b1.equals(b2)); [EOL]     b2 = new SimpleHistogramBin(1.1, 2.2, false, true); [EOL]     assertTrue(b1.equals(b2)); [EOL]     b1 = new SimpleHistogramBin(1.1, 2.2, false, false); [EOL]     assertFalse(b1.equals(b2)); [EOL]     b2 = new SimpleHistogramBin(1.1, 2.2, false, false); [EOL]     assertTrue(b1.equals(b2)); [EOL]     b1.setItemCount(99); [EOL]     assertFalse(b1.equals(b2)); [EOL]     b2.setItemCount(99); [EOL]     assertTrue(b1.equals(b2)); [EOL] } <line_num>: 126,156
public void testCloning() { [EOL]     SimpleHistogramBin b1 = new SimpleHistogramBin(1.1, 2.2, false, true); [EOL]     b1.setItemCount(99); [EOL]     SimpleHistogramBin b2 = null; [EOL]     try { [EOL]         b2 = (SimpleHistogramBin) b1.clone(); [EOL]     } catch (CloneNotSupportedException e) { [EOL]         System.err.println("Failed to clone."); [EOL]     } [EOL]     assertTrue(b1 != b2); [EOL]     assertTrue(b1.getClass() == b2.getClass()); [EOL]     assertTrue(b1.equals(b2)); [EOL]     b2.setItemCount(111); [EOL]     assertFalse(b1.equals(b2)); [EOL] } <line_num>: 161,178
public void testSerialization() { [EOL]     SimpleHistogramBin b1 = new SimpleHistogramBin(1.0, 2.0, false, true); [EOL]     b1.setItemCount(123); [EOL]     SimpleHistogramBin b2 = null; [EOL]     try { [EOL]         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); [EOL]         ObjectOutput out = new ObjectOutputStream(buffer); [EOL]         out.writeObject(b1); [EOL]         out.close(); [EOL]         ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray())); [EOL]         b2 = (SimpleHistogramBin) in.readObject(); [EOL]         in.close(); [EOL]     } catch (Exception e) { [EOL]         System.out.println(e.toString()); [EOL]     } [EOL]     assertEquals(b1, b2); [EOL] } <line_num>: 183,203