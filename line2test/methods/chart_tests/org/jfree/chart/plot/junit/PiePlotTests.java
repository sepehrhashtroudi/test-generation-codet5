public PiePlotTests(String name) { [EOL]     super(name); [EOL] } <line_num>: 103,105
public static Test suite() { [EOL]     return new TestSuite(PiePlotTests.class); [EOL] } <line_num>: 94,96
public void testEquals() { [EOL]     PiePlot plot1 = new PiePlot(); [EOL]     PiePlot plot2 = new PiePlot(); [EOL]     assertTrue(plot1.equals(plot2)); [EOL]     assertTrue(plot2.equals(plot1)); [EOL]     plot1.setPieIndex(99); [EOL]     assertFalse(plot1.equals(plot2)); [EOL]     plot2.setPieIndex(99); [EOL]     assertTrue(plot1.equals(plot2)); [EOL]     plot1.setInteriorGap(0.15); [EOL]     assertFalse(plot1.equals(plot2)); [EOL]     plot2.setInteriorGap(0.15); [EOL]     assertTrue(plot1.equals(plot2)); [EOL]     plot1.setCircular(!plot1.isCircular()); [EOL]     assertFalse(plot1.equals(plot2)); [EOL]     plot2.setCircular(false); [EOL]     assertTrue(plot1.equals(plot2)); [EOL]     plot1.setStartAngle(Math.PI); [EOL]     assertFalse(plot1.equals(plot2)); [EOL]     plot2.setStartAngle(Math.PI); [EOL]     assertTrue(plot1.equals(plot2)); [EOL]     plot1.setDirection(Rotation.ANTICLOCKWISE); [EOL]     assertFalse(plot1.equals(plot2)); [EOL]     plot2.setDirection(Rotation.ANTICLOCKWISE); [EOL]     assertTrue(plot1.equals(plot2)); [EOL]     plot1.setIgnoreZeroValues(true); [EOL]     plot2.setIgnoreZeroValues(false); [EOL]     assertFalse(plot1.equals(plot2)); [EOL]     plot2.setIgnoreZeroValues(true); [EOL]     assertTrue(plot1.equals(plot2)); [EOL]     plot1.setIgnoreNullValues(true); [EOL]     plot2.setIgnoreNullValues(false); [EOL]     assertFalse(plot1.equals(plot2)); [EOL]     plot2.setIgnoreNullValues(true); [EOL]     assertTrue(plot1.equals(plot2)); [EOL]     plot1.setSectionPaint("A", new GradientPaint(1.0f, 2.0f, Color.blue, 3.0f, 4.0f, Color.white)); [EOL]     assertFalse(plot1.equals(plot2)); [EOL]     plot2.setSectionPaint("A", new GradientPaint(1.0f, 2.0f, Color.blue, 3.0f, 4.0f, Color.white)); [EOL]     assertTrue(plot1.equals(plot2)); [EOL]     plot1.setBaseSectionPaint(new GradientPaint(1.0f, 2.0f, Color.black, 3.0f, 4.0f, Color.white)); [EOL]     assertFalse(plot1.equals(plot2)); [EOL]     plot2.setBaseSectionPaint(new GradientPaint(1.0f, 2.0f, Color.black, 3.0f, 4.0f, Color.white)); [EOL]     assertTrue(plot1.equals(plot2)); [EOL]     plot1.setSectionOutlinesVisible(false); [EOL]     assertFalse(plot1.equals(plot2)); [EOL]     plot2.setSectionOutlinesVisible(false); [EOL]     assertTrue(plot1.equals(plot2)); [EOL]     plot1.setSectionOutlinePaint("A", new GradientPaint(1.0f, 2.0f, Color.green, 3.0f, 4.0f, Color.white)); [EOL]     assertFalse(plot1.equals(plot2)); [EOL]     plot2.setSectionOutlinePaint("A", new GradientPaint(1.0f, 2.0f, Color.green, 3.0f, 4.0f, Color.white)); [EOL]     assertTrue(plot1.equals(plot2)); [EOL]     plot1.setBaseSectionOutlinePaint(new GradientPaint(1.0f, 2.0f, Color.gray, 3.0f, 4.0f, Color.white)); [EOL]     assertFalse(plot1.equals(plot2)); [EOL]     plot2.setBaseSectionOutlinePaint(new GradientPaint(1.0f, 2.0f, Color.gray, 3.0f, 4.0f, Color.white)); [EOL]     assertTrue(plot1.equals(plot2)); [EOL]     plot1.setSectionOutlineStroke("A", new BasicStroke(1.0f)); [EOL]     assertFalse(plot1.equals(plot2)); [EOL]     plot2.setSectionOutlineStroke("A", new BasicStroke(1.0f)); [EOL]     assertTrue(plot1.equals(plot2)); [EOL]     plot1.setBaseSectionOutlineStroke(new BasicStroke(1.0f)); [EOL]     assertFalse(plot1.equals(plot2)); [EOL]     plot2.setBaseSectionOutlineStroke(new BasicStroke(1.0f)); [EOL]     assertTrue(plot1.equals(plot2)); [EOL]     plot1.setShadowPaint(new GradientPaint(1.0f, 2.0f, Color.orange, 3.0f, 4.0f, Color.white)); [EOL]     assertFalse(plot1.equals(plot2)); [EOL]     plot2.setShadowPaint(new GradientPaint(1.0f, 2.0f, Color.orange, 3.0f, 4.0f, Color.white)); [EOL]     assertTrue(plot1.equals(plot2)); [EOL]     plot1.setShadowXOffset(4.4); [EOL]     assertFalse(plot1.equals(plot2)); [EOL]     plot2.setShadowXOffset(4.4); [EOL]     assertTrue(plot1.equals(plot2)); [EOL]     plot1.setShadowYOffset(4.4); [EOL]     assertFalse(plot1.equals(plot2)); [EOL]     plot2.setShadowYOffset(4.4); [EOL]     assertTrue(plot1.equals(plot2)); [EOL]     plot1.setLabelFont(new Font("Serif", Font.PLAIN, 18)); [EOL]     assertFalse(plot1.equals(plot2)); [EOL]     plot2.setLabelFont(new Font("Serif", Font.PLAIN, 18)); [EOL]     assertTrue(plot1.equals(plot2)); [EOL]     plot1.setLabelPaint(new GradientPaint(1.0f, 2.0f, Color.darkGray, 3.0f, 4.0f, Color.white)); [EOL]     assertFalse(plot1.equals(plot2)); [EOL]     plot2.setLabelPaint(new GradientPaint(1.0f, 2.0f, Color.darkGray, 3.0f, 4.0f, Color.white)); [EOL]     assertTrue(plot1.equals(plot2)); [EOL]     plot1.setLabelBackgroundPaint(new GradientPaint(1.0f, 2.0f, Color.red, 3.0f, 4.0f, Color.white)); [EOL]     assertFalse(plot1.equals(plot2)); [EOL]     plot2.setLabelBackgroundPaint(new GradientPaint(1.0f, 2.0f, Color.red, 3.0f, 4.0f, Color.white)); [EOL]     assertTrue(plot1.equals(plot2)); [EOL]     plot1.setLabelOutlinePaint(new GradientPaint(1.0f, 2.0f, Color.blue, 3.0f, 4.0f, Color.white)); [EOL]     assertFalse(plot1.equals(plot2)); [EOL]     plot2.setLabelOutlinePaint(new GradientPaint(1.0f, 2.0f, Color.blue, 3.0f, 4.0f, Color.white)); [EOL]     assertTrue(plot1.equals(plot2)); [EOL]     Stroke s = new BasicStroke(1.1f); [EOL]     plot1.setLabelOutlineStroke(s); [EOL]     assertFalse(plot1.equals(plot2)); [EOL]     plot2.setLabelOutlineStroke(s); [EOL]     assertTrue(plot1.equals(plot2)); [EOL]     plot1.setLabelShadowPaint(new GradientPaint(1.0f, 2.0f, Color.yellow, 3.0f, 4.0f, Color.white)); [EOL]     assertFalse(plot1.equals(plot2)); [EOL]     plot2.setLabelShadowPaint(new GradientPaint(1.0f, 2.0f, Color.yellow, 3.0f, 4.0f, Color.white)); [EOL]     assertTrue(plot1.equals(plot2)); [EOL]     plot1.setExplodePercent("A", 0.33); [EOL]     assertFalse(plot1.equals(plot2)); [EOL]     plot2.setExplodePercent("A", 0.33); [EOL]     assertTrue(plot1.equals(plot2)); [EOL]     plot1.setLabelGenerator(new StandardPieSectionLabelGenerator("{2}{1}{0}")); [EOL]     assertFalse(plot1.equals(plot2)); [EOL]     plot2.setLabelGenerator(new StandardPieSectionLabelGenerator("{2}{1}{0}")); [EOL]     assertTrue(plot1.equals(plot2)); [EOL]     Font f = new Font("SansSerif", Font.PLAIN, 20); [EOL]     plot1.setLabelFont(f); [EOL]     assertFalse(plot1.equals(plot2)); [EOL]     plot2.setLabelFont(f); [EOL]     assertTrue(plot1.equals(plot2)); [EOL]     plot1.setLabelPaint(new GradientPaint(1.0f, 2.0f, Color.magenta, 3.0f, 4.0f, Color.white)); [EOL]     assertFalse(plot1.equals(plot2)); [EOL]     plot2.setLabelPaint(new GradientPaint(1.0f, 2.0f, Color.magenta, 3.0f, 4.0f, Color.white)); [EOL]     assertTrue(plot1.equals(plot2)); [EOL]     plot1.setMaximumLabelWidth(0.33); [EOL]     assertFalse(plot1.equals(plot2)); [EOL]     plot2.setMaximumLabelWidth(0.33); [EOL]     assertTrue(plot1.equals(plot2)); [EOL]     plot1.setLabelGap(0.11); [EOL]     assertFalse(plot1.equals(plot2)); [EOL]     plot2.setLabelGap(0.11); [EOL]     assertTrue(plot1.equals(plot2)); [EOL]     plot1.setLabelLinksVisible(false); [EOL]     assertFalse(plot1.equals(plot2)); [EOL]     plot2.setLabelLinksVisible(false); [EOL]     assertTrue(plot1.equals(plot2)); [EOL]     plot1.setLabelLinkStyle(PieLabelLinkStyle.QUAD_CURVE); [EOL]     assertFalse(plot1.equals(plot2)); [EOL]     plot2.setLabelLinkStyle(PieLabelLinkStyle.QUAD_CURVE); [EOL]     assertTrue(plot1.equals(plot2)); [EOL]     plot1.setLabelLinkMargin(0.11); [EOL]     assertFalse(plot1.equals(plot2)); [EOL]     plot2.setLabelLinkMargin(0.11); [EOL]     assertTrue(plot1.equals(plot2)); [EOL]     plot1.setLabelLinkPaint(new GradientPaint(1.0f, 2.0f, Color.magenta, 3.0f, 4.0f, Color.white)); [EOL]     assertFalse(plot1.equals(plot2)); [EOL]     plot2.setLabelLinkPaint(new GradientPaint(1.0f, 2.0f, Color.magenta, 3.0f, 4.0f, Color.white)); [EOL]     assertTrue(plot1.equals(plot2)); [EOL]     plot1.setLabelLinkStroke(new BasicStroke(1.0f)); [EOL]     assertFalse(plot1.equals(plot2)); [EOL]     plot2.setLabelLinkStroke(new BasicStroke(1.0f)); [EOL]     assertTrue(plot1.equals(plot2)); [EOL]     plot1.setToolTipGenerator(new StandardPieToolTipGenerator("{2}{1}{0}")); [EOL]     assertFalse(plot1.equals(plot2)); [EOL]     plot2.setToolTipGenerator(new StandardPieToolTipGenerator("{2}{1}{0}")); [EOL]     assertTrue(plot1.equals(plot2)); [EOL]     plot1.setURLGenerator(new StandardPieURLGenerator("xx")); [EOL]     assertFalse(plot1.equals(plot2)); [EOL]     plot2.setURLGenerator(new StandardPieURLGenerator("xx")); [EOL]     assertTrue(plot1.equals(plot2)); [EOL]     plot1.setMinimumArcAngleToDraw(1.0); [EOL]     assertFalse(plot1.equals(plot2)); [EOL]     plot2.setMinimumArcAngleToDraw(1.0); [EOL]     assertTrue(plot1.equals(plot2)); [EOL]     plot1.setLegendItemShape(new Rectangle2D.Double(1.0, 2.0, 3.0, 4.0)); [EOL]     assertFalse(plot1.equals(plot2)); [EOL]     plot2.setLegendItemShape(new Rectangle2D.Double(1.0, 2.0, 3.0, 4.0)); [EOL]     assertTrue(plot1.equals(plot2)); [EOL]     plot1.setLegendLabelGenerator(new StandardPieSectionLabelGenerator("{0} --> {1}")); [EOL]     assertFalse(plot1.equals(plot2)); [EOL]     plot2.setLegendLabelGenerator(new StandardPieSectionLabelGenerator("{0} --> {1}")); [EOL]     assertTrue(plot1.equals(plot2)); [EOL]     plot1.setLegendLabelToolTipGenerator(new StandardPieSectionLabelGenerator("{0} is {1}")); [EOL]     assertFalse(plot1.equals(plot2)); [EOL]     plot2.setLegendLabelToolTipGenerator(new StandardPieSectionLabelGenerator("{0} is {1}")); [EOL]     assertTrue(plot1.equals(plot2)); [EOL]     plot1.setLegendLabelURLGenerator(new StandardPieURLGenerator("index.html")); [EOL]     assertFalse(plot1.equals(plot2)); [EOL]     plot2.setLegendLabelURLGenerator(new StandardPieURLGenerator("index.html")); [EOL]     assertTrue(plot1.equals(plot2)); [EOL]     plot1.setAutoPopulateSectionPaint(false); [EOL]     assertFalse(plot1.equals(plot2)); [EOL]     plot2.setAutoPopulateSectionPaint(false); [EOL]     assertTrue(plot1.equals(plot2)); [EOL]     plot1.setAutoPopulateSectionOutlinePaint(true); [EOL]     assertFalse(plot1.equals(plot2)); [EOL]     plot2.setAutoPopulateSectionOutlinePaint(true); [EOL]     assertTrue(plot1.equals(plot2)); [EOL]     plot1.setAutoPopulateSectionOutlineStroke(true); [EOL]     assertFalse(plot1.equals(plot2)); [EOL]     plot2.setAutoPopulateSectionOutlineStroke(true); [EOL]     assertTrue(plot1.equals(plot2)); [EOL]     plot1.setShadowGenerator(new DefaultShadowGenerator(5, Color.gray, 0.6f, 4, -Math.PI / 4)); [EOL]     assertFalse(plot1.equals(plot2)); [EOL]     plot2.setShadowGenerator(new DefaultShadowGenerator(5, Color.gray, 0.6f, 4, -Math.PI / 4)); [EOL]     assertTrue(plot1.equals(plot2)); [EOL]     plot1.setShadowGenerator(null); [EOL]     assertFalse(plot1.equals(plot2)); [EOL]     plot2.setShadowGenerator(null); [EOL]     assertTrue(plot1.equals(plot2)); [EOL] } <line_num>: 110,430
public void testCloning() { [EOL]     PiePlot p1 = new PiePlot(); [EOL]     PiePlot p2 = null; [EOL]     try { [EOL]         p2 = (PiePlot) p1.clone(); [EOL]     } catch (CloneNotSupportedException e) { [EOL]         e.printStackTrace(); [EOL]     } [EOL]     assertTrue(p1 != p2); [EOL]     assertTrue(p1.getClass() == p2.getClass()); [EOL]     assertTrue(p1.equals(p2)); [EOL] } <line_num>: 435,447
public void testCloning_URLGenerator() { [EOL]     CustomPieURLGenerator generator = new CustomPieURLGenerator(); [EOL]     PiePlot p1 = new PiePlot(); [EOL]     p1.setURLGenerator(generator); [EOL]     PiePlot p2 = null; [EOL]     try { [EOL]         p2 = (PiePlot) p1.clone(); [EOL]     } catch (CloneNotSupportedException e) { [EOL]         e.printStackTrace(); [EOL]     } [EOL]     assertTrue(p1 != p2); [EOL]     assertTrue(p1.getClass() == p2.getClass()); [EOL]     assertTrue(p1.equals(p2)); [EOL]     assertTrue(p1.getURLGenerator() != p2.getURLGenerator()); [EOL] } <line_num>: 452,469
public void testCloning_LegendItemShape() { [EOL]     Rectangle shape = new Rectangle(-4, -4, 8, 8); [EOL]     PiePlot p1 = new PiePlot(); [EOL]     p1.setLegendItemShape(shape); [EOL]     PiePlot p2 = null; [EOL]     try { [EOL]         p2 = (PiePlot) p1.clone(); [EOL]     } catch (CloneNotSupportedException e) { [EOL]         e.printStackTrace(); [EOL]     } [EOL]     assertTrue(p1 != p2); [EOL]     assertTrue(p1.getClass() == p2.getClass()); [EOL]     assertTrue(p1.equals(p2)); [EOL]     shape.setRect(1.0, 2.0, 3.0, 4.0); [EOL]     assertFalse(p1.equals(p2)); [EOL] } <line_num>: 474,492
public void testCloning_LegendLabelGenerator() { [EOL]     StandardPieSectionLabelGenerator generator = new StandardPieSectionLabelGenerator(); [EOL]     PiePlot p1 = new PiePlot(); [EOL]     p1.setLegendLabelGenerator(generator); [EOL]     PiePlot p2 = null; [EOL]     try { [EOL]         p2 = (PiePlot) p1.clone(); [EOL]     } catch (CloneNotSupportedException e) { [EOL]         e.printStackTrace(); [EOL]     } [EOL]     assertTrue(p1 != p2); [EOL]     assertTrue(p1.getClass() == p2.getClass()); [EOL]     assertTrue(p1.equals(p2)); [EOL]     generator.getNumberFormat().setMinimumFractionDigits(2); [EOL]     assertFalse(p1.equals(p2)); [EOL] } <line_num>: 497,516
public void testCloning_LegendLabelToolTipGenerator() { [EOL]     StandardPieSectionLabelGenerator generator = new StandardPieSectionLabelGenerator(); [EOL]     PiePlot p1 = new PiePlot(); [EOL]     p1.setLegendLabelToolTipGenerator(generator); [EOL]     PiePlot p2 = null; [EOL]     try { [EOL]         p2 = (PiePlot) p1.clone(); [EOL]     } catch (CloneNotSupportedException e) { [EOL]         e.printStackTrace(); [EOL]     } [EOL]     assertTrue(p1 != p2); [EOL]     assertTrue(p1.getClass() == p2.getClass()); [EOL]     assertTrue(p1.equals(p2)); [EOL]     generator.getNumberFormat().setMinimumFractionDigits(2); [EOL]     assertFalse(p1.equals(p2)); [EOL] } <line_num>: 521,540
public void testCloning_LegendLabelURLGenerator() { [EOL]     CustomPieURLGenerator generator = new CustomPieURLGenerator(); [EOL]     PiePlot p1 = new PiePlot(); [EOL]     p1.setLegendLabelURLGenerator(generator); [EOL]     PiePlot p2 = null; [EOL]     try { [EOL]         p2 = (PiePlot) p1.clone(); [EOL]     } catch (CloneNotSupportedException e) { [EOL]         e.printStackTrace(); [EOL]     } [EOL]     assertTrue(p1 != p2); [EOL]     assertTrue(p1.getClass() == p2.getClass()); [EOL]     assertTrue(p1.equals(p2)); [EOL]     assertTrue(p1.getLegendLabelURLGenerator() != p2.getLegendLabelURLGenerator()); [EOL] } <line_num>: 545,563
public void testSerialization() { [EOL]     PiePlot p1 = new PiePlot(null); [EOL]     PiePlot p2 = null; [EOL]     try { [EOL]         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); [EOL]         ObjectOutput out = new ObjectOutputStream(buffer); [EOL]         out.writeObject(p1); [EOL]         out.close(); [EOL]         ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray())); [EOL]         p2 = (PiePlot) in.readObject(); [EOL]         in.close(); [EOL]     } catch (Exception e) { [EOL]         e.printStackTrace(); [EOL]     } [EOL]     assertEquals(p1, p2); [EOL] } <line_num>: 568,586
public void testGetLegendItems() { [EOL]     DefaultPieDataset dataset = new DefaultPieDataset(); [EOL]     dataset.setValue("Item 1", 1.0); [EOL]     dataset.setValue("Item 2", 2.0); [EOL]     dataset.setValue("Item 3", 0.0); [EOL]     dataset.setValue("Item 4", null); [EOL]     PiePlot plot = new PiePlot(dataset); [EOL]     plot.setIgnoreNullValues(false); [EOL]     plot.setIgnoreZeroValues(false); [EOL]     LegendItemCollection items = plot.getLegendItems(); [EOL]     assertEquals(4, items.getItemCount()); [EOL]     plot.setIgnoreNullValues(true); [EOL]     items = plot.getLegendItems(); [EOL]     assertEquals(3, items.getItemCount()); [EOL]     plot.setIgnoreZeroValues(true); [EOL]     items = plot.getLegendItems(); [EOL]     assertEquals(2, items.getItemCount()); [EOL]     dataset.setValue("Item 5", -1.0); [EOL]     items = plot.getLegendItems(); [EOL]     assertEquals(2, items.getItemCount()); [EOL] } <line_num>: 591,618
public void testGetBaseSectionPaint() { [EOL]     PiePlot plot = new PiePlot(); [EOL]     assertNotNull(plot.getBaseSectionPaint()); [EOL]     boolean pass = false; [EOL]     try { [EOL]         plot.setBaseSectionPaint(null); [EOL]     } catch (IllegalArgumentException e) { [EOL]         pass = true; [EOL]     } [EOL]     assertTrue(pass); [EOL] } <line_num>: 624,636
public AttributedString generateAttributedSectionLabel(PieDataset dataset, Comparable key) { [EOL]     return null; [EOL] } <line_num>: 639,642
public String generateSectionLabel(PieDataset dataset, Comparable key) { [EOL]     return null; [EOL] } <line_num>: 643,645
public void testDrawWithNullLegendLabels() { [EOL]     DefaultPieDataset dataset = new DefaultPieDataset(); [EOL]     dataset.setValue("L1", 12.0); [EOL]     dataset.setValue("L2", 11.0); [EOL]     JFreeChart chart = ChartFactory.createPieChart("Test", dataset, true); [EOL]     PiePlot plot = (PiePlot) chart.getPlot(); [EOL]     plot.setLegendLabelGenerator(new NullLegendLabelGenerator()); [EOL]     boolean success = false; [EOL]     try { [EOL]         BufferedImage image = new BufferedImage(200, 100, BufferedImage.TYPE_INT_RGB); [EOL]         Graphics2D g2 = image.createGraphics(); [EOL]         chart.draw(g2, new Rectangle2D.Double(0, 0, 200, 100), null, null); [EOL]         g2.dispose(); [EOL]         success = true; [EOL]     } catch (Exception e) { [EOL]         success = false; [EOL]     } [EOL]     assertTrue(success); [EOL] } <line_num>: 651,671