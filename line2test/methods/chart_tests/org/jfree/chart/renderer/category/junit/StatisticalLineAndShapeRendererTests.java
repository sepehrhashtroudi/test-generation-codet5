public StatisticalLineAndShapeRendererTests(String name) { [EOL]     super(name); [EOL] } <line_num>: 84,86
public static Test suite() { [EOL]     return new TestSuite(StatisticalLineAndShapeRendererTests.class); [EOL] } <line_num>: 75,77
public void testEquals() { [EOL]     StatisticalLineAndShapeRenderer r1 = new StatisticalLineAndShapeRenderer(); [EOL]     StatisticalLineAndShapeRenderer r2 = new StatisticalLineAndShapeRenderer(); [EOL]     assertTrue(r1.equals(r2)); [EOL]     assertTrue(r2.equals(r1)); [EOL]     r1.setErrorIndicatorPaint(Color.red); [EOL]     assertFalse(r1.equals(r2)); [EOL]     r2.setErrorIndicatorPaint(Color.red); [EOL]     assertTrue(r2.equals(r1)); [EOL] } <line_num>: 91,103
public void testHashcode() { [EOL]     StatisticalLineAndShapeRenderer r1 = new StatisticalLineAndShapeRenderer(); [EOL]     StatisticalLineAndShapeRenderer r2 = new StatisticalLineAndShapeRenderer(); [EOL]     assertTrue(r1.equals(r2)); [EOL]     int h1 = r1.hashCode(); [EOL]     int h2 = r2.hashCode(); [EOL]     assertEquals(h1, h2); [EOL] } <line_num>: 108,117
public void testCloning() { [EOL]     StatisticalLineAndShapeRenderer r1 = new StatisticalLineAndShapeRenderer(); [EOL]     StatisticalLineAndShapeRenderer r2 = null; [EOL]     try { [EOL]         r2 = (StatisticalLineAndShapeRenderer) r1.clone(); [EOL]     } catch (CloneNotSupportedException e) { [EOL]         System.err.println("Failed to clone."); [EOL]     } [EOL]     assertTrue(r1 != r2); [EOL]     assertTrue(r1.getClass() == r2.getClass()); [EOL]     assertTrue(r1.equals(r2)); [EOL] } <line_num>: 122,135
public void testPublicCloneable() { [EOL]     StatisticalLineAndShapeRenderer r1 = new StatisticalLineAndShapeRenderer(); [EOL]     assertTrue(r1 instanceof PublicCloneable); [EOL] } <line_num>: 140,144
public void testSerialization() { [EOL]     StatisticalLineAndShapeRenderer r1 = new StatisticalLineAndShapeRenderer(); [EOL]     StatisticalLineAndShapeRenderer r2 = null; [EOL]     try { [EOL]         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); [EOL]         ObjectOutput out = new ObjectOutputStream(buffer); [EOL]         out.writeObject(r1); [EOL]         out.close(); [EOL]         ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray())); [EOL]         r2 = (StatisticalLineAndShapeRenderer) in.readObject(); [EOL]         in.close(); [EOL]     } catch (Exception e) { [EOL]         System.out.println(e.toString()); [EOL]     } [EOL]     assertEquals(r1, r2); [EOL] } <line_num>: 149,171
public void testDrawWithNullInfo() { [EOL]     boolean success = false; [EOL]     try { [EOL]         DefaultStatisticalCategoryDataset dataset = new DefaultStatisticalCategoryDataset(); [EOL]         dataset.add(1.0, 2.0, "S1", "C1"); [EOL]         dataset.add(3.0, 4.0, "S1", "C2"); [EOL]         CategoryPlot plot = new CategoryPlot(dataset, new CategoryAxis("Category"), new NumberAxis("Value"), new StatisticalLineAndShapeRenderer()); [EOL]         JFreeChart chart = new JFreeChart(plot); [EOL]         chart.createBufferedImage(300, 200, null); [EOL]         success = true; [EOL]     } catch (NullPointerException e) { [EOL]         e.printStackTrace(); [EOL]         success = false; [EOL]     } [EOL]     assertTrue(success); [EOL] } <line_num>: 177,197
public void test1562759() { [EOL]     StatisticalLineAndShapeRenderer r = new StatisticalLineAndShapeRenderer(true, false); [EOL]     assertTrue(r.getBaseLinesVisible()); [EOL]     assertFalse(r.getBaseShapesVisible()); [EOL]     r = new StatisticalLineAndShapeRenderer(false, true); [EOL]     assertFalse(r.getBaseLinesVisible()); [EOL]     assertTrue(r.getBaseShapesVisible()); [EOL] } <line_num>: 202,211