public RendererXYPackageTests(String name) { [EOL]     super(name); [EOL] } <line_num>: 112,114
public static Test suite() { [EOL]     TestSuite suite = new TestSuite("org.jfree.chart.renderer.xy"); [EOL]     suite.addTestSuite(AbstractXYItemRendererTests.class); [EOL]     suite.addTestSuite(CandlestickRendererTests.class); [EOL]     suite.addTestSuite(ClusteredXYBarRendererTests.class); [EOL]     suite.addTestSuite(DeviationRendererTests.class); [EOL]     suite.addTestSuite(GradientXYBarPainterTests.class); [EOL]     suite.addTestSuite(HighLowRendererTests.class); [EOL]     suite.addTestSuite(StackedXYAreaRendererTests.class); [EOL]     suite.addTestSuite(StackedXYAreaRenderer2Tests.class); [EOL]     suite.addTestSuite(StackedXYBarRendererTests.class); [EOL]     suite.addTestSuite(StandardXYBarPainterTests.class); [EOL]     suite.addTestSuite(StandardXYItemRendererTests.class); [EOL]     suite.addTestSuite(VectorRendererTests.class); [EOL]     suite.addTestSuite(WindItemRendererTests.class); [EOL]     suite.addTestSuite(XYAreaRendererTests.class); [EOL]     suite.addTestSuite(XYAreaRenderer2Tests.class); [EOL]     suite.addTestSuite(XYBarRendererTests.class); [EOL]     suite.addTestSuite(XYBlockRendererTests.class); [EOL]     suite.addTestSuite(XYBoxAndWhiskerRendererTests.class); [EOL]     suite.addTestSuite(XYBubbleRendererTests.class); [EOL]     suite.addTestSuite(XYDifferenceRendererTests.class); [EOL]     suite.addTestSuite(XYDotRendererTests.class); [EOL]     suite.addTestSuite(XYErrorRendererTests.class); [EOL]     suite.addTestSuite(XYLineAndShapeRendererTests.class); [EOL]     suite.addTestSuite(XYLine3DRendererTests.class); [EOL]     suite.addTestSuite(XYShapeRendererTests.class); [EOL]     suite.addTestSuite(XYSplineRendererTests.class); [EOL]     suite.addTestSuite(XYStepRendererTests.class); [EOL]     suite.addTestSuite(XYStepAreaRendererTests.class); [EOL]     suite.addTestSuite(YIntervalRendererTests.class); [EOL]     return suite; [EOL] } <line_num>: 73,105
public static XYSeriesCollection createTestXYSeriesCollection() { [EOL]     XYSeriesCollection result = new XYSeriesCollection(); [EOL]     XYSeries series1 = new XYSeries("Series 1", false, false); [EOL]     series1.add(1.0, 2.0); [EOL]     series1.add(2.0, 5.0); [EOL]     XYSeries series2 = new XYSeries("Series 2", false, false); [EOL]     series2.add(1.0, 4.0); [EOL]     series2.add(2.0, 3.0); [EOL]     result.addSeries(series1); [EOL]     result.addSeries(series2); [EOL]     return result; [EOL] } <line_num>: 121,132
public static TableXYDataset createTestTableXYDataset() { [EOL]     DefaultTableXYDataset result = new DefaultTableXYDataset(); [EOL]     XYSeries series1 = new XYSeries("Series 1", false, false); [EOL]     series1.add(1.0, 2.0); [EOL]     series1.add(2.0, 5.0); [EOL]     XYSeries series2 = new XYSeries("Series 2", false, false); [EOL]     series2.add(1.0, 4.0); [EOL]     series2.add(2.0, 3.0); [EOL]     result.addSeries(series1); [EOL]     result.addSeries(series2); [EOL]     return result; [EOL] } <line_num>: 139,150
public static void main(String[] args) { [EOL]     junit.textui.TestRunner.run(suite()); [EOL] } <line_num>: 157,159
