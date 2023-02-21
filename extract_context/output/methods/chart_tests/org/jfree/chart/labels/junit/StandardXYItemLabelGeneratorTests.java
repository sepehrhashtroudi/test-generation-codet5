public StandardXYItemLabelGeneratorTests(String name) { [EOL]     super(name); [EOL] } <line_num>: 84,86
public static Test suite() { [EOL]     return new TestSuite(StandardXYItemLabelGeneratorTests.class); [EOL] } <line_num>: 75,77
public void testEquals() { [EOL]     String f1 = "{1}"; [EOL]     String f2 = "{2}"; [EOL]     NumberFormat xnf1 = new DecimalFormat("0.00"); [EOL]     NumberFormat xnf2 = new DecimalFormat("0.000"); [EOL]     NumberFormat ynf1 = new DecimalFormat("0.00"); [EOL]     NumberFormat ynf2 = new DecimalFormat("0.000"); [EOL]     StandardXYItemLabelGenerator g1 = null; [EOL]     StandardXYItemLabelGenerator g2 = null; [EOL]     g1 = new StandardXYItemLabelGenerator(f1, xnf1, ynf1); [EOL]     g2 = new StandardXYItemLabelGenerator(f1, xnf1, ynf1); [EOL]     assertTrue(g1.equals(g2)); [EOL]     assertTrue(g2.equals(g1)); [EOL]     g1 = new StandardXYItemLabelGenerator(f2, xnf1, ynf1); [EOL]     assertFalse(g1.equals(g2)); [EOL]     g2 = new StandardXYItemLabelGenerator(f2, xnf1, ynf1); [EOL]     assertTrue(g1.equals(g2)); [EOL]     g1 = new StandardXYItemLabelGenerator(f2, xnf2, ynf1); [EOL]     assertFalse(g1.equals(g2)); [EOL]     g2 = new StandardXYItemLabelGenerator(f2, xnf2, ynf1); [EOL]     assertTrue(g1.equals(g2)); [EOL]     g1 = new StandardXYItemLabelGenerator(f2, xnf2, ynf2); [EOL]     assertFalse(g1.equals(g2)); [EOL]     g2 = new StandardXYItemLabelGenerator(f2, xnf2, ynf2); [EOL]     assertTrue(g1.equals(g2)); [EOL]     DateFormat xdf1 = new SimpleDateFormat("d-MMM"); [EOL]     DateFormat xdf2 = new SimpleDateFormat("d-MMM-yyyy"); [EOL]     DateFormat ydf1 = new SimpleDateFormat("d-MMM"); [EOL]     DateFormat ydf2 = new SimpleDateFormat("d-MMM-yyyy"); [EOL]     g1 = new StandardXYItemLabelGenerator(f1, xdf1, ydf1); [EOL]     g2 = new StandardXYItemLabelGenerator(f1, xdf1, ydf1); [EOL]     assertTrue(g1.equals(g2)); [EOL]     assertTrue(g2.equals(g1)); [EOL]     g1 = new StandardXYItemLabelGenerator(f1, xdf2, ydf1); [EOL]     assertFalse(g1.equals(g2)); [EOL]     g2 = new StandardXYItemLabelGenerator(f1, xdf2, ydf1); [EOL]     assertTrue(g1.equals(g2)); [EOL]     g1 = new StandardXYItemLabelGenerator(f1, xdf2, ydf2); [EOL]     assertFalse(g1.equals(g2)); [EOL]     g2 = new StandardXYItemLabelGenerator(f1, xdf2, ydf2); [EOL]     assertTrue(g1.equals(g2)); [EOL] } <line_num>: 91,144
public void testHashCode() { [EOL]     StandardXYItemLabelGenerator g1 = new StandardXYItemLabelGenerator(); [EOL]     StandardXYItemLabelGenerator g2 = new StandardXYItemLabelGenerator(); [EOL]     assertTrue(g1.equals(g2)); [EOL]     assertTrue(g1.hashCode() == g2.hashCode()); [EOL] } <line_num>: 149,156
public void testCloning() { [EOL]     StandardXYItemLabelGenerator g1 = new StandardXYItemLabelGenerator(); [EOL]     StandardXYItemLabelGenerator g2 = null; [EOL]     try { [EOL]         g2 = (StandardXYItemLabelGenerator) g1.clone(); [EOL]     } catch (CloneNotSupportedException e) { [EOL]         e.printStackTrace(); [EOL]     } [EOL]     assertTrue(g1 != g2); [EOL]     assertTrue(g1.getClass() == g2.getClass()); [EOL]     assertTrue(g1.equals(g2)); [EOL]     g1.getXFormat().setMinimumIntegerDigits(2); [EOL]     assertFalse(g1.equals(g2)); [EOL]     g2.getXFormat().setMinimumIntegerDigits(2); [EOL]     assertTrue(g1.equals(g2)); [EOL]     g1.getYFormat().setMinimumIntegerDigits(2); [EOL]     assertFalse(g1.equals(g2)); [EOL]     g2.getYFormat().setMinimumIntegerDigits(2); [EOL]     assertTrue(g1.equals(g2)); [EOL]     g1 = new StandardXYItemLabelGenerator("{0} {1} {2}", DateFormat.getInstance(), DateFormat.getInstance()); [EOL]     try { [EOL]         g2 = (StandardXYItemLabelGenerator) g1.clone(); [EOL]     } catch (CloneNotSupportedException e) { [EOL]         e.printStackTrace(); [EOL]     } [EOL]     assertTrue(g1 != g2); [EOL]     assertTrue(g1.getClass() == g2.getClass()); [EOL]     assertTrue(g1.equals(g2)); [EOL]     g1.getXDateFormat().setNumberFormat(new DecimalFormat("0.000")); [EOL]     assertFalse(g1.equals(g2)); [EOL]     g2.getXDateFormat().setNumberFormat(new DecimalFormat("0.000")); [EOL]     assertTrue(g1.equals(g2)); [EOL]     g1.getYDateFormat().setNumberFormat(new DecimalFormat("0.000")); [EOL]     assertFalse(g1.equals(g2)); [EOL]     g2.getYDateFormat().setNumberFormat(new DecimalFormat("0.000")); [EOL]     assertTrue(g1.equals(g2)); [EOL] } <line_num>: 161,209
public void testPublicCloneable() { [EOL]     StandardXYItemLabelGenerator g1 = new StandardXYItemLabelGenerator(); [EOL]     assertTrue(g1 instanceof PublicCloneable); [EOL] } <line_num>: 214,217
public void testSerialization() { [EOL]     StandardXYItemLabelGenerator g1 = new StandardXYItemLabelGenerator(); [EOL]     StandardXYItemLabelGenerator g2 = null; [EOL]     try { [EOL]         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); [EOL]         ObjectOutput out = new ObjectOutputStream(buffer); [EOL]         out.writeObject(g1); [EOL]         out.close(); [EOL]         ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray())); [EOL]         g2 = (StandardXYItemLabelGenerator) in.readObject(); [EOL]         in.close(); [EOL]     } catch (Exception e) { [EOL]         e.printStackTrace(); [EOL]     } [EOL]     assertEquals(g1, g2); [EOL] } <line_num>: 222,243
