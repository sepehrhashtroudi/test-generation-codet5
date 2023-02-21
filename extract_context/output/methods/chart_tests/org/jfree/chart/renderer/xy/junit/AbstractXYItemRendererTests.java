public AbstractXYItemRendererTests(String name) { [EOL]     super(name); [EOL] } <line_num>: 78,80
public static Test suite() { [EOL]     return new TestSuite(AbstractXYItemRendererTests.class); [EOL] } <line_num>: 69,71
private XYDataset createDataset1() { [EOL]     XYSeries series = new XYSeries("Series"); [EOL]     series.add(1.0, 1.0); [EOL]     series.add(2.0, 2.0); [EOL]     series.add(3.0, 3.0); [EOL]     XYSeriesCollection dataset = new XYSeriesCollection(); [EOL]     dataset.addSeries(series); [EOL]     return dataset; [EOL] } <line_num>: 87,95
public void testFindDomainBounds() { [EOL]     AbstractXYItemRenderer renderer = new StandardXYItemRenderer(); [EOL]     XYDataset dataset = createDataset1(); [EOL]     Range r = renderer.findDomainBounds(dataset); [EOL]     assertEquals(1.0, r.getLowerBound(), EPSILON); [EOL]     assertEquals(3.0, r.getUpperBound(), EPSILON); [EOL]     assertTrue(renderer.findDomainBounds(null) == null); [EOL] } <line_num>: 102,113
public void testFindRangeBounds() { [EOL]     AbstractXYItemRenderer renderer = new StandardXYItemRenderer(); [EOL]     assertTrue(renderer.findRangeBounds(null) == null); [EOL] } <line_num>: 118,122
public void testCloning_LegendItemLabelGenerator() { [EOL]     StandardXYSeriesLabelGenerator generator = new StandardXYSeriesLabelGenerator("Series {0}"); [EOL]     XYBarRenderer r1 = new XYBarRenderer(); [EOL]     r1.setLegendItemLabelGenerator(generator); [EOL]     XYBarRenderer r2 = null; [EOL]     try { [EOL]         r2 = (XYBarRenderer) r1.clone(); [EOL]     } catch (CloneNotSupportedException e) { [EOL]         e.printStackTrace(); [EOL]     } [EOL]     assertTrue(r1 != r2); [EOL]     assertTrue(r1.getClass() == r2.getClass()); [EOL]     assertTrue(r1.equals(r2)); [EOL]     assertTrue(r1.getLegendItemLabelGenerator() != r2.getLegendItemLabelGenerator()); [EOL] } <line_num>: 127,146
public void testCloning_LegendItemToolTipGenerator() { [EOL]     StandardXYSeriesLabelGenerator generator = new StandardXYSeriesLabelGenerator("Series {0}"); [EOL]     XYBarRenderer r1 = new XYBarRenderer(); [EOL]     r1.setLegendItemToolTipGenerator(generator); [EOL]     XYBarRenderer r2 = null; [EOL]     try { [EOL]         r2 = (XYBarRenderer) r1.clone(); [EOL]     } catch (CloneNotSupportedException e) { [EOL]         e.printStackTrace(); [EOL]     } [EOL]     assertTrue(r1 != r2); [EOL]     assertTrue(r1.getClass() == r2.getClass()); [EOL]     assertTrue(r1.equals(r2)); [EOL]     assertTrue(r1.getLegendItemToolTipGenerator() != r2.getLegendItemToolTipGenerator()); [EOL] } <line_num>: 151,170
public void testCloning_LegendItemURLGenerator() { [EOL]     StandardXYSeriesLabelGenerator generator = new StandardXYSeriesLabelGenerator("Series {0}"); [EOL]     XYBarRenderer r1 = new XYBarRenderer(); [EOL]     r1.setLegendItemURLGenerator(generator); [EOL]     XYBarRenderer r2 = null; [EOL]     try { [EOL]         r2 = (XYBarRenderer) r1.clone(); [EOL]     } catch (CloneNotSupportedException e) { [EOL]         e.printStackTrace(); [EOL]     } [EOL]     assertTrue(r1 != r2); [EOL]     assertTrue(r1.getClass() == r2.getClass()); [EOL]     assertTrue(r1.equals(r2)); [EOL]     assertTrue(r1.getLegendItemURLGenerator() != r2.getLegendItemURLGenerator()); [EOL] } <line_num>: 175,194
public void testEquals() { [EOL]     XYBarRenderer r1 = new XYBarRenderer(); [EOL]     XYBarRenderer r2 = new XYBarRenderer(); [EOL]     assertTrue(r1.equals(r2)); [EOL]     r1.addAnnotation(new XYTextAnnotation("ABC", 1.0, 2.0), Layer.BACKGROUND); [EOL]     assertFalse(r1.equals(r2)); [EOL]     r2.addAnnotation(new XYTextAnnotation("ABC", 1.0, 2.0), Layer.BACKGROUND); [EOL]     assertTrue(r1.equals(r2)); [EOL]     r1.addAnnotation(new XYTextAnnotation("DEF", 3.0, 4.0), Layer.FOREGROUND); [EOL]     assertFalse(r1.equals(r2)); [EOL]     r2.addAnnotation(new XYTextAnnotation("DEF", 3.0, 4.0), Layer.FOREGROUND); [EOL]     assertTrue(r1.equals(r2)); [EOL]     r1.setDefaultEntityRadius(99); [EOL]     assertFalse(r1.equals(r2)); [EOL]     r2.setDefaultEntityRadius(99); [EOL]     assertTrue(r1.equals(r2)); [EOL]     r1.setLegendItemLabelGenerator(new StandardXYSeriesLabelGenerator("X:{0}")); [EOL]     assertFalse(r1.equals(r2)); [EOL]     r2.setLegendItemLabelGenerator(new StandardXYSeriesLabelGenerator("X:{0}")); [EOL]     assertTrue(r1.equals(r2)); [EOL]     r1.setLegendItemToolTipGenerator(new StandardXYSeriesLabelGenerator("X:{0}")); [EOL]     assertFalse(r1.equals(r2)); [EOL]     r2.setLegendItemToolTipGenerator(new StandardXYSeriesLabelGenerator("X:{0}")); [EOL]     assertTrue(r1.equals(r2)); [EOL]     r1.setLegendItemURLGenerator(new StandardXYSeriesLabelGenerator("X:{0}")); [EOL]     assertFalse(r1.equals(r2)); [EOL]     r2.setLegendItemURLGenerator(new StandardXYSeriesLabelGenerator("X:{0}")); [EOL]     assertTrue(r1.equals(r2)); [EOL] } <line_num>: 199,249
