public XYStepChartTests(String name) { [EOL]     super(name); [EOL] } <line_num>: 88,90
public static Test suite() { [EOL]     return new TestSuite(XYStepChartTests.class); [EOL] } <line_num>: 79,81
protected void setUp() { [EOL]     this.chart = createChart(); [EOL] } <line_num>: 95,97
public void testDrawWithNullInfo() { [EOL]     boolean success = false; [EOL]     try { [EOL]         BufferedImage image = new BufferedImage(200, 100, BufferedImage.TYPE_INT_RGB); [EOL]         Graphics2D g2 = image.createGraphics(); [EOL]         this.chart.draw(g2, new Rectangle2D.Double(0, 0, 200, 100), null, null); [EOL]         g2.dispose(); [EOL]         success = true; [EOL]     } catch (Exception e) { [EOL]         success = false; [EOL]         e.printStackTrace(); [EOL]     } [EOL]     assertTrue(success); [EOL] } <line_num>: 103,121
public void testReplaceDataset() { [EOL]     XYSeries series1 = new XYSeries("Series 1"); [EOL]     series1.add(10.0, 10.0); [EOL]     series1.add(20.0, 20.0); [EOL]     series1.add(30.0, 30.0); [EOL]     XYDataset dataset = new XYSeriesCollection(series1); [EOL]     LocalListener l = new LocalListener(); [EOL]     this.chart.addChangeListener(l); [EOL]     XYPlot plot = (XYPlot) this.chart.getPlot(); [EOL]     plot.setDataset(dataset); [EOL]     assertEquals(true, l.flag); [EOL]     ValueAxis axis = plot.getRangeAxis(); [EOL]     Range range = axis.getRange(); [EOL]     assertTrue("Expecting the lower bound of the range to be around 10: " + range.getLowerBound(), range.getLowerBound() <= 10); [EOL]     assertTrue("Expecting the upper bound of the range to be around 30: " + range.getUpperBound(), range.getUpperBound() >= 30); [EOL] } <line_num>: 126,147
public void testSetSeriesToolTipGenerator() { [EOL]     XYPlot plot = (XYPlot) this.chart.getPlot(); [EOL]     XYItemRenderer renderer = plot.getRenderer(); [EOL]     StandardXYToolTipGenerator tt = new StandardXYToolTipGenerator(); [EOL]     renderer.setSeriesToolTipGenerator(0, tt); [EOL]     XYToolTipGenerator tt2 = renderer.getToolTipGenerator(0, 0, false); [EOL]     assertTrue(tt2 == tt); [EOL] } <line_num>: 153,160
private static JFreeChart createChart() { [EOL]     XYSeries series1 = new XYSeries("Series 1"); [EOL]     series1.add(1.0, 1.0); [EOL]     series1.add(2.0, 2.0); [EOL]     series1.add(3.0, 3.0); [EOL]     XYDataset dataset = new XYSeriesCollection(series1); [EOL]     return ChartFactory.createXYStepChart("Step Chart", "Domain", "Range", dataset, true); [EOL] } <line_num>: 167,175
public void chartChanged(ChartChangeEvent event) { [EOL]     this.flag = true; [EOL] } <line_num>: 191,193
