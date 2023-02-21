public StandardXYItemRendererTests(String name) { [EOL]     super(name); [EOL] } <line_num>: 100,102
public static Test suite() { [EOL]     return new TestSuite(StandardXYItemRendererTests.class); [EOL] } <line_num>: 91,93
public void testEquals() { [EOL]     StandardXYItemRenderer r1 = new StandardXYItemRenderer(); [EOL]     StandardXYItemRenderer r2 = new StandardXYItemRenderer(); [EOL]     assertEquals(r1, r2); [EOL]     r1.setBaseShapesVisible(true); [EOL]     assertFalse(r1.equals(r2)); [EOL]     r2.setBaseShapesVisible(true); [EOL]     assertTrue(r1.equals(r2)); [EOL]     r1.setPlotLines(false); [EOL]     assertFalse(r1.equals(r2)); [EOL]     r2.setPlotLines(false); [EOL]     assertTrue(r1.equals(r2)); [EOL]     r1.setPlotImages(true); [EOL]     assertFalse(r1.equals(r2)); [EOL]     r2.setPlotImages(true); [EOL]     assertTrue(r1.equals(r2)); [EOL]     r1.setPlotDiscontinuous(true); [EOL]     assertFalse(r1.equals(r2)); [EOL]     r2.setPlotDiscontinuous(true); [EOL]     assertTrue(r1.equals(r2)); [EOL]     r1.setGapThresholdType(UnitType.ABSOLUTE); [EOL]     assertFalse(r1.equals(r2)); [EOL]     r2.setGapThresholdType(UnitType.ABSOLUTE); [EOL]     assertTrue(r1.equals(r2)); [EOL]     r1.setGapThreshold(1.23); [EOL]     assertFalse(r1.equals(r2)); [EOL]     r2.setGapThreshold(1.23); [EOL]     assertTrue(r1.equals(r2)); [EOL]     r1.setLegendLine(new Line2D.Double(1.0, 2.0, 3.0, 4.0)); [EOL]     assertFalse(r1.equals(r2)); [EOL]     r2.setLegendLine(new Line2D.Double(1.0, 2.0, 3.0, 4.0)); [EOL]     assertTrue(r1.equals(r2)); [EOL]     r1.setSeriesShapesFilled(1, Boolean.TRUE); [EOL]     assertFalse(r1.equals(r2)); [EOL]     r2.setSeriesShapesFilled(1, Boolean.TRUE); [EOL]     assertTrue(r1.equals(r2)); [EOL]     r1.setBaseShapesFilled(false); [EOL]     assertFalse(r1.equals(r2)); [EOL]     r2.setBaseShapesFilled(false); [EOL]     assertTrue(r1.equals(r2)); [EOL]     r1.setDrawSeriesLineAsPath(true); [EOL]     assertFalse(r1.equals(r2)); [EOL]     r2.setDrawSeriesLineAsPath(true); [EOL]     assertTrue(r1.equals(r2)); [EOL] } <line_num>: 107,161
public void testHashcode() { [EOL]     StandardXYItemRenderer r1 = new StandardXYItemRenderer(); [EOL]     StandardXYItemRenderer r2 = new StandardXYItemRenderer(); [EOL]     assertTrue(r1.equals(r2)); [EOL]     int h1 = r1.hashCode(); [EOL]     int h2 = r2.hashCode(); [EOL]     assertEquals(h1, h2); [EOL] } <line_num>: 166,173
public void testCloning() { [EOL]     StandardXYItemRenderer r1 = new StandardXYItemRenderer(); [EOL]     Rectangle2D rect1 = new Rectangle2D.Double(1.0, 2.0, 3.0, 4.0); [EOL]     r1.setLegendLine(rect1); [EOL]     StandardXYItemRenderer r2 = null; [EOL]     try { [EOL]         r2 = (StandardXYItemRenderer) r1.clone(); [EOL]     } catch (CloneNotSupportedException e) { [EOL]         e.printStackTrace(); [EOL]     } [EOL]     assertTrue(r1 != r2); [EOL]     assertTrue(r1.getClass() == r2.getClass()); [EOL]     assertTrue(r1.equals(r2)); [EOL]     rect1.setRect(4.0, 3.0, 2.0, 1.0); [EOL]     assertFalse(r1.equals(r2)); [EOL]     r2.setLegendLine(new Rectangle2D.Double(4.0, 3.0, 2.0, 1.0)); [EOL]     assertTrue(r1.equals(r2)); [EOL]     r1.setSeriesShapesFilled(1, Boolean.TRUE); [EOL]     assertFalse(r1.equals(r2)); [EOL]     r2.setSeriesShapesFilled(1, Boolean.TRUE); [EOL]     assertTrue(r1.equals(r2)); [EOL] } <line_num>: 178,203
public void testPublicCloneable() { [EOL]     StandardXYItemRenderer r1 = new StandardXYItemRenderer(); [EOL]     assertTrue(r1 instanceof PublicCloneable); [EOL] } <line_num>: 208,211
public void testSerialization() { [EOL]     StandardXYItemRenderer r1 = new StandardXYItemRenderer(); [EOL]     StandardXYItemRenderer r2 = null; [EOL]     try { [EOL]         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); [EOL]         ObjectOutput out = new ObjectOutputStream(buffer); [EOL]         out.writeObject(r1); [EOL]         out.close(); [EOL]         ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray())); [EOL]         r2 = (StandardXYItemRenderer) in.readObject(); [EOL]         in.close(); [EOL]     } catch (Exception e) { [EOL]         e.printStackTrace(); [EOL]     } [EOL]     assertEquals(r1, r2); [EOL] } <line_num>: 216,234
public void testGetLegendItemSeriesIndex() { [EOL]     XYSeriesCollection d1 = new XYSeriesCollection(); [EOL]     XYSeries s1 = new XYSeries("S1"); [EOL]     s1.add(1.0, 1.1); [EOL]     XYSeries s2 = new XYSeries("S2"); [EOL]     s2.add(1.0, 1.1); [EOL]     d1.addSeries(s1); [EOL]     d1.addSeries(s2); [EOL]     XYSeriesCollection d2 = new XYSeriesCollection(); [EOL]     XYSeries s3 = new XYSeries("S3"); [EOL]     s3.add(1.0, 1.1); [EOL]     XYSeries s4 = new XYSeries("S4"); [EOL]     s4.add(1.0, 1.1); [EOL]     XYSeries s5 = new XYSeries("S5"); [EOL]     s5.add(1.0, 1.1); [EOL]     d2.addSeries(s3); [EOL]     d2.addSeries(s4); [EOL]     d2.addSeries(s5); [EOL]     StandardXYItemRenderer r = new StandardXYItemRenderer(); [EOL]     XYPlot plot = new XYPlot(d1, new NumberAxis("x"), new NumberAxis("y"), r); [EOL]     plot.setDataset(1, d2); [EOL]     new JFreeChart(plot); [EOL]     LegendItem li = r.getLegendItem(1, 2); [EOL]     assertEquals("S5", li.getLabel()); [EOL]     assertEquals(1, li.getDatasetIndex()); [EOL]     assertEquals(2, li.getSeriesIndex()); [EOL] } <line_num>: 240,269
public void testNoDisplayedItem() { [EOL]     XYSeriesCollection dataset = new XYSeriesCollection(); [EOL]     XYSeries s1 = new XYSeries("S1"); [EOL]     s1.add(10.0, 10.0); [EOL]     dataset.addSeries(s1); [EOL]     JFreeChart chart = ChartFactory.createXYLineChart("Title", "X", "Y", dataset, false); [EOL]     XYPlot plot = (XYPlot) chart.getPlot(); [EOL]     plot.setRenderer(new StandardXYItemRenderer()); [EOL]     NumberAxis xAxis = (NumberAxis) plot.getDomainAxis(); [EOL]     xAxis.setRange(0.0, 5.0); [EOL]     NumberAxis yAxis = (NumberAxis) plot.getRangeAxis(); [EOL]     yAxis.setRange(0.0, 5.0); [EOL]     BufferedImage image = new BufferedImage(200, 100, BufferedImage.TYPE_INT_RGB); [EOL]     Graphics2D g2 = image.createGraphics(); [EOL]     ChartRenderingInfo info = new ChartRenderingInfo(); [EOL]     chart.draw(g2, new Rectangle2D.Double(0, 0, 200, 100), null, info); [EOL]     g2.dispose(); [EOL]     EntityCollection ec = info.getEntityCollection(); [EOL]     assertFalse(TestUtilities.containsInstanceOf(ec.getEntities(), XYItemEntity.class)); [EOL] } <line_num>: 275,297