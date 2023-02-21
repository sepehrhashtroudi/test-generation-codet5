public ValueAxisTests(String name) { [EOL]     super(name); [EOL] } <line_num>: 83,85
public static Test suite() { [EOL]     return new TestSuite(ValueAxisTests.class); [EOL] } <line_num>: 74,76
public void testCloning() { [EOL]     ValueAxis a1 = new NumberAxis("Test"); [EOL]     ValueAxis a2 = null; [EOL]     try { [EOL]         a2 = (NumberAxis) a1.clone(); [EOL]     } catch (CloneNotSupportedException e) { [EOL]         e.printStackTrace(); [EOL]     } [EOL]     assertTrue(a1 != a2); [EOL]     assertTrue(a1.getClass() == a2.getClass()); [EOL]     assertTrue(a1.equals(a2)); [EOL] } <line_num>: 90,102
public void testEquals() { [EOL]     NumberAxis a1 = new NumberAxis("Test"); [EOL]     NumberAxis a2 = new NumberAxis("Test"); [EOL]     assertTrue(a1.equals(a2)); [EOL]     a1.setAxisLineVisible(false); [EOL]     assertFalse(a1.equals(a2)); [EOL]     a2.setAxisLineVisible(false); [EOL]     assertTrue(a1.equals(a2)); [EOL]     a1.setPositiveArrowVisible(true); [EOL]     assertFalse(a1.equals(a2)); [EOL]     a2.setPositiveArrowVisible(true); [EOL]     assertTrue(a1.equals(a2)); [EOL]     a1.setNegativeArrowVisible(true); [EOL]     assertFalse(a1.equals(a2)); [EOL]     a2.setNegativeArrowVisible(true); [EOL]     assertTrue(a1.equals(a2)); [EOL]     a1.setAxisLinePaint(Color.blue); [EOL]     assertFalse(a1.equals(a2)); [EOL]     a2.setAxisLinePaint(Color.blue); [EOL]     assertTrue(a1.equals(a2)); [EOL]     Stroke stroke = new BasicStroke(2.0f); [EOL]     a1.setAxisLineStroke(stroke); [EOL]     assertFalse(a1.equals(a2)); [EOL]     a2.setAxisLineStroke(stroke); [EOL]     assertTrue(a1.equals(a2)); [EOL]     a1.setInverted(true); [EOL]     assertFalse(a1.equals(a2)); [EOL]     a2.setInverted(true); [EOL]     assertTrue(a1.equals(a2)); [EOL]     a1.setRange(new Range(50.0, 75.0)); [EOL]     assertFalse(a1.equals(a2)); [EOL]     a2.setRange(new Range(50.0, 75.0)); [EOL]     assertTrue(a1.equals(a2)); [EOL]     a1.setAutoRange(true); [EOL]     assertFalse(a1.equals(a2)); [EOL]     a2.setAutoRange(true); [EOL]     assertTrue(a1.equals(a2)); [EOL]     a1.setAutoRangeMinimumSize(3.33); [EOL]     assertFalse(a1.equals(a2)); [EOL]     a2.setAutoRangeMinimumSize(3.33); [EOL]     assertTrue(a1.equals(a2)); [EOL]     a1.setDefaultAutoRange(new Range(1.2, 3.4)); [EOL]     assertFalse(a1.equals(a2)); [EOL]     a2.setDefaultAutoRange(new Range(1.2, 3.4)); [EOL]     assertTrue(a1.equals(a2)); [EOL]     a1.setUpperMargin(0.09); [EOL]     assertFalse(a1.equals(a2)); [EOL]     a2.setUpperMargin(0.09); [EOL]     assertTrue(a1.equals(a2)); [EOL]     a1.setLowerMargin(0.09); [EOL]     assertFalse(a1.equals(a2)); [EOL]     a2.setLowerMargin(0.09); [EOL]     assertTrue(a1.equals(a2)); [EOL]     a1.setFixedAutoRange(50.0); [EOL]     assertFalse(a1.equals(a2)); [EOL]     a2.setFixedAutoRange(50.0); [EOL]     assertTrue(a1.equals(a2)); [EOL]     a1.setAutoTickUnitSelection(false); [EOL]     assertFalse(a1.equals(a2)); [EOL]     a2.setAutoTickUnitSelection(false); [EOL]     assertTrue(a1.equals(a2)); [EOL]     a1.setStandardTickUnits(NumberAxis.createIntegerTickUnits()); [EOL]     assertFalse(a1.equals(a2)); [EOL]     a2.setStandardTickUnits(NumberAxis.createIntegerTickUnits()); [EOL]     assertTrue(a1.equals(a2)); [EOL]     a1.setVerticalTickLabels(true); [EOL]     assertFalse(a1.equals(a2)); [EOL]     a2.setVerticalTickLabels(true); [EOL]     assertTrue(a1.equals(a2)); [EOL] } <line_num>: 107,222
public void testAxisMargins() { [EOL]     XYSeries series = new XYSeries("S1"); [EOL]     series.add(100.0, 1.1); [EOL]     series.add(200.0, 2.2); [EOL]     XYSeriesCollection dataset = new XYSeriesCollection(series); [EOL]     dataset.setIntervalWidth(0.0); [EOL]     JFreeChart chart = ChartFactory.createScatterPlot("Title", "X", "Y", dataset, false); [EOL]     ValueAxis domainAxis = ((XYPlot) chart.getPlot()).getDomainAxis(); [EOL]     Range r = domainAxis.getRange(); [EOL]     assertEquals(110.0, r.getLength(), EPSILON); [EOL]     domainAxis.setLowerMargin(0.10); [EOL]     domainAxis.setUpperMargin(0.10); [EOL]     r = domainAxis.getRange(); [EOL]     assertEquals(120.0, r.getLength(), EPSILON); [EOL] } <line_num>: 228,243
