public IntervalBarRendererTests(String name) { [EOL]     super(name); [EOL] } <line_num>: 83,85
public static Test suite() { [EOL]     return new TestSuite(IntervalBarRendererTests.class); [EOL] } <line_num>: 74,76
public void testEquals() { [EOL]     IntervalBarRenderer r1 = new IntervalBarRenderer(); [EOL]     IntervalBarRenderer r2 = new IntervalBarRenderer(); [EOL]     assertEquals(r1, r2); [EOL]     BarRenderer br = new BarRenderer(); [EOL]     assertFalse(r1.equals(br)); [EOL] } <line_num>: 90,98
public void testHashcode() { [EOL]     IntervalBarRenderer r1 = new IntervalBarRenderer(); [EOL]     IntervalBarRenderer r2 = new IntervalBarRenderer(); [EOL]     assertTrue(r1.equals(r2)); [EOL]     int h1 = r1.hashCode(); [EOL]     int h2 = r2.hashCode(); [EOL]     assertEquals(h1, h2); [EOL] } <line_num>: 103,110
public void testCloning() { [EOL]     IntervalBarRenderer r1 = new IntervalBarRenderer(); [EOL]     IntervalBarRenderer r2 = null; [EOL]     try { [EOL]         r2 = (IntervalBarRenderer) r1.clone(); [EOL]     } catch (CloneNotSupportedException e) { [EOL]         System.err.println("Failed to clone."); [EOL]     } [EOL]     assertTrue(r1 != r2); [EOL]     assertTrue(r1.getClass() == r2.getClass()); [EOL]     assertTrue(r1.equals(r2)); [EOL] } <line_num>: 115,127
public void testPublicCloneable() { [EOL]     IntervalBarRenderer r1 = new IntervalBarRenderer(); [EOL]     assertTrue(r1 instanceof PublicCloneable); [EOL] } <line_num>: 132,135
public void testSerialization() { [EOL]     IntervalBarRenderer r1 = new IntervalBarRenderer(); [EOL]     IntervalBarRenderer r2 = null; [EOL]     try { [EOL]         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); [EOL]         ObjectOutput out = new ObjectOutputStream(buffer); [EOL]         out.writeObject(r1); [EOL]         out.close(); [EOL]         ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray())); [EOL]         r2 = (IntervalBarRenderer) in.readObject(); [EOL]         in.close(); [EOL]     } catch (Exception e) { [EOL]         e.printStackTrace(); [EOL]     } [EOL]     assertEquals(r1, r2); [EOL] } <line_num>: 140,157
public void testDrawWithNullInfo() { [EOL]     boolean success = false; [EOL]     try { [EOL]         double[][] starts = new double[][] { { 0.1, 0.2, 0.3 }, { 0.3, 0.4, 0.5 } }; [EOL]         double[][] ends = new double[][] { { 0.5, 0.6, 0.7 }, { 0.7, 0.8, 0.9 } }; [EOL]         DefaultIntervalCategoryDataset dataset = new DefaultIntervalCategoryDataset(starts, ends); [EOL]         IntervalBarRenderer renderer = new IntervalBarRenderer(); [EOL]         CategoryPlot plot = new CategoryPlot(dataset, new CategoryAxis("Category"), new NumberAxis("Value"), renderer); [EOL]         JFreeChart chart = new JFreeChart(plot); [EOL]         chart.createBufferedImage(300, 200, null); [EOL]         success = true; [EOL]     } catch (NullPointerException e) { [EOL]         e.printStackTrace(); [EOL]         success = false; [EOL]     } [EOL]     assertTrue(success); [EOL] } <line_num>: 163,185