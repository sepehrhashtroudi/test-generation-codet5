public LineAndShapeRendererTests(String name) { [EOL]     super(name); [EOL] } <line_num>: 85,87
public static Test suite() { [EOL]     return new TestSuite(LineAndShapeRendererTests.class); [EOL] } <line_num>: 76,78
public void testEquals() { [EOL]     LineAndShapeRenderer r1 = new LineAndShapeRenderer(); [EOL]     LineAndShapeRenderer r2 = new LineAndShapeRenderer(); [EOL]     assertEquals(r1, r2); [EOL]     r1.setBaseLinesVisible(!r1.getBaseLinesVisible()); [EOL]     assertFalse(r1.equals(r2)); [EOL]     r2.setBaseLinesVisible(r1.getBaseLinesVisible()); [EOL]     assertTrue(r1.equals(r2)); [EOL]     r1.setSeriesLinesVisible(1, true); [EOL]     assertFalse(r1.equals(r2)); [EOL]     r2.setSeriesLinesVisible(1, true); [EOL]     assertTrue(r1.equals(r2)); [EOL]     r1.setBaseShapesVisible(!r1.getBaseShapesVisible()); [EOL]     assertFalse(r1.equals(r2)); [EOL]     r2.setBaseShapesVisible(r1.getBaseShapesVisible()); [EOL]     assertTrue(r1.equals(r2)); [EOL]     r1.setSeriesShapesVisible(1, true); [EOL]     assertFalse(r1.equals(r2)); [EOL]     r2.setSeriesShapesVisible(1, true); [EOL]     assertTrue(r1.equals(r2)); [EOL]     r1.setSeriesShapesFilled(1, true); [EOL]     assertFalse(r1.equals(r2)); [EOL]     r2.setSeriesShapesFilled(1, true); [EOL]     assertTrue(r1.equals(r2)); [EOL]     r1.setBaseShapesFilled(false); [EOL]     assertFalse(r1.equals(r2)); [EOL]     r2.setBaseShapesFilled(false); [EOL]     assertTrue(r1.equals(r2)); [EOL]     r1.setUseOutlinePaint(true); [EOL]     assertFalse(r1.equals(r2)); [EOL]     r2.setUseOutlinePaint(true); [EOL]     assertTrue(r1.equals(r2)); [EOL]     r1.setUseSeriesOffset(true); [EOL]     assertFalse(r1.equals(r2)); [EOL]     r2.setUseSeriesOffset(true); [EOL]     assertTrue(r1.equals(r2)); [EOL]     r1.setItemMargin(0.14); [EOL]     assertFalse(r1.equals(r2)); [EOL]     r2.setItemMargin(0.14); [EOL]     assertTrue(r1.equals(r2)); [EOL] } <line_num>: 92,143
public void testHashcode() { [EOL]     LineAndShapeRenderer r1 = new LineAndShapeRenderer(); [EOL]     LineAndShapeRenderer r2 = new LineAndShapeRenderer(); [EOL]     assertTrue(r1.equals(r2)); [EOL]     int h1 = r1.hashCode(); [EOL]     int h2 = r2.hashCode(); [EOL]     assertEquals(h1, h2); [EOL] } <line_num>: 148,155
public void testCloning() { [EOL]     LineAndShapeRenderer r1 = new LineAndShapeRenderer(); [EOL]     LineAndShapeRenderer r2 = null; [EOL]     try { [EOL]         r2 = (LineAndShapeRenderer) r1.clone(); [EOL]     } catch (CloneNotSupportedException e) { [EOL]         e.printStackTrace(); [EOL]     } [EOL]     assertTrue(r1 != r2); [EOL]     assertTrue(r1.getClass() == r2.getClass()); [EOL]     assertTrue(r1.equals(r2)); [EOL]     assertTrue(checkIndependence(r1, r2)); [EOL] } <line_num>: 160,175
public void testPublicCloneable() { [EOL]     LineAndShapeRenderer r1 = new LineAndShapeRenderer(); [EOL]     assertTrue(r1 instanceof PublicCloneable); [EOL] } <line_num>: 180,183
private boolean checkIndependence(LineAndShapeRenderer r1, LineAndShapeRenderer r2) { [EOL]     if (!r1.equals(r2)) { [EOL]         return false; [EOL]     } [EOL]     r1.setBaseLinesVisible(!r1.getBaseLinesVisible()); [EOL]     if (r1.equals(r2)) { [EOL]         return false; [EOL]     } [EOL]     r2.setBaseLinesVisible(r1.getBaseLinesVisible()); [EOL]     if (!r1.equals(r2)) { [EOL]         return false; [EOL]     } [EOL]     r1.setSeriesLinesVisible(1, true); [EOL]     if (r1.equals(r2)) { [EOL]         return false; [EOL]     } [EOL]     r2.setSeriesLinesVisible(1, true); [EOL]     if (!r1.equals(r2)) { [EOL]         return false; [EOL]     } [EOL]     r1.setBaseShapesVisible(!r1.getBaseShapesVisible()); [EOL]     if (r1.equals(r2)) { [EOL]         return false; [EOL]     } [EOL]     r2.setBaseShapesVisible(r1.getBaseShapesVisible()); [EOL]     if (!r1.equals(r2)) { [EOL]         return false; [EOL]     } [EOL]     r1.setSeriesShapesVisible(1, true); [EOL]     if (r1.equals(r2)) { [EOL]         return false; [EOL]     } [EOL]     r2.setSeriesShapesVisible(1, true); [EOL]     if (!r1.equals(r2)) { [EOL]         return false; [EOL]     } [EOL]     r1.setSeriesShapesFilled(0, false); [EOL]     r2.setSeriesShapesFilled(0, true); [EOL]     if (r1.equals(r2)) { [EOL]         return false; [EOL]     } [EOL]     r2.setSeriesShapesFilled(0, false); [EOL]     if (!r1.equals(r2)) { [EOL]         return false; [EOL]     } [EOL]     r1.setBaseShapesFilled(false); [EOL]     r2.setBaseShapesFilled(true); [EOL]     if (r1.equals(r2)) { [EOL]         return false; [EOL]     } [EOL]     r2.setBaseShapesFilled(false); [EOL]     if (!r1.equals(r2)) { [EOL]         return false; [EOL]     } [EOL]     return true; [EOL] } <line_num>: 193,259
public void testSerialization() { [EOL]     LineAndShapeRenderer r1 = new LineAndShapeRenderer(); [EOL]     LineAndShapeRenderer r2 = null; [EOL]     try { [EOL]         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); [EOL]         ObjectOutput out = new ObjectOutputStream(buffer); [EOL]         out.writeObject(r1); [EOL]         out.close(); [EOL]         ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray())); [EOL]         r2 = (LineAndShapeRenderer) in.readObject(); [EOL]         in.close(); [EOL]     } catch (Exception e) { [EOL]         e.printStackTrace(); [EOL]     } [EOL]     assertEquals(r1, r2); [EOL] } <line_num>: 264,285
public void testGetLegendItemSeriesIndex() { [EOL]     DefaultCategoryDataset dataset0 = new DefaultCategoryDataset(); [EOL]     dataset0.addValue(21.0, "R1", "C1"); [EOL]     dataset0.addValue(22.0, "R2", "C1"); [EOL]     DefaultCategoryDataset dataset1 = new DefaultCategoryDataset(); [EOL]     dataset1.addValue(23.0, "R3", "C1"); [EOL]     dataset1.addValue(24.0, "R4", "C1"); [EOL]     dataset1.addValue(25.0, "R5", "C1"); [EOL]     LineAndShapeRenderer r = new LineAndShapeRenderer(); [EOL]     CategoryPlot plot = new CategoryPlot(dataset0, new CategoryAxis("x"), new NumberAxis("y"), r); [EOL]     plot.setDataset(1, dataset1); [EOL]     new JFreeChart(plot); [EOL]     LegendItem li = r.getLegendItem(1, 2); [EOL]     assertEquals("R5", li.getLabel()); [EOL]     assertEquals(1, li.getDatasetIndex()); [EOL]     assertEquals(2, li.getSeriesIndex()); [EOL] } <line_num>: 291,308