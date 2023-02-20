/* ===========================================================
 * JFreeChart : a free chart library for the Java(tm) platform
 * ===========================================================
 *
 * (C) Copyright 2000-2009, by Object Refinery Limited and Contributors.
 *
 * Project Info:  http://www.jfree.org/jfreechart/index.html
 *
 * This library is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation; either version 2.1 of the License, or
 * (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public
 * License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301,
 * USA.
 *
 * [Java is a trademark or registered trademark of Sun Microsystems, Inc.
 * in the United States and other countries.]
 *
 * ----------------
 * XYPlotTests.java
 * ----------------
 * (C) Copyright 2003-2009, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 26-Mar-2003 : Version 1 (DG);
 * 22-Mar-2004 : Added new cloning test (DG);
 * 05-Oct-2004 : Strengthened test for clone independence (DG);
 * 22-Nov-2006 : Added quadrant fields to equals() and clone() tests (DG);
 * 09-Jan-2007 : Mark and comment out testGetDatasetCount() (DG);
 * 05-Feb-2007 : Added testAddDomainMarker() and testAddRangeMarker() (DG);
 * 07-Feb-2007 : Added test1654215() (DG);
 * 24-May-2007 : Added testDrawSeriesWithZeroItems() (DG);
 * 20-Jun-2007 : Removed JCommon dependencies (DG);
 * 07-Apr-2008 : Added testRemoveDomainMarker() and
 *               testRemoveRangeMarker() (DG);
 * 10-May-2009 : Extended testEquals(), added testCloning3() (DG);
 * 06-Jul-2009 : Added testBug2817504() (DG);
 *
 */

package org.jfree.chart.plot.junit;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.awt.Stroke;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.List;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.LegendItem;
import org.jfree.chart.LegendItemCollection;
import org.jfree.chart.annotations.XYTextAnnotation;
import org.jfree.chart.axis.AxisLocation;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.event.MarkerChangeListener;
import org.jfree.chart.labels.StandardXYToolTipGenerator;
import org.jfree.chart.plot.IntervalMarker;
import org.jfree.chart.plot.Marker;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.ValueMarker;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.DefaultXYItemRenderer;
import org.jfree.chart.renderer.xy.StandardXYItemRenderer;
import org.jfree.chart.renderer.xy.XYBarRenderer;
import org.jfree.chart.renderer.xy.XYItemRenderer;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.chart.util.DefaultShadowGenerator;
import org.jfree.chart.util.Layer;
import org.jfree.chart.util.RectangleInsets;
import org.jfree.data.time.Day;
import org.jfree.data.time.MonthConstants;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;
import org.jfree.data.xy.DefaultXYDataset;
import org.jfree.data.xy.IntervalXYDataset;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 * Tests for the {@link XYPlot} class.
 */
public class XYPlotTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(XYPlotTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public XYPlotTests(String name) {
        super(name);
    }

// FIXME: the getDatasetCount() method is returning a count of the slots
// available for datasets, rather than the number of datasets actually
// specified...see if there is some way to clean this up.
//    /**
//     * Added this test in response to a bug report.
//     */
//    public void testGetDatasetCount() {
//        XYPlot plot = new XYPlot();
//        assertEquals(0, plot.getDatasetCount());
//    }

    /**
     * Some checks for the equals() method.
     */

public void testEquals82() { 
     XYPlot plot1 = new XYPlot(); 
     XYPlot plot2 = new XYPlot(); 
     assertTrue(plot1.equals(plot2)); 
     plot1.setOrientation(PlotOrientation.HORIZONTAL); 
     assertFalse(plot1.equals(plot2)); 
     plot2.setOrientation(PlotOrientation.HORIZONTAL); 
     assertTrue(plot1.equals(plot2)); 
     plot1.setAxisOffset(new RectangleInsets(0.05, 0.05, 0.05, 0.05)); 
     assertFalse(plot1.equals(plot2)); 
     plot2.setAxisOffset(new RectangleInsets(0.05, 0.05, 0.05, 0.05)); 
     assertTrue(plot1.equals(plot2)); 
     plot1.setDomainAxis(new NumberAxis("Domain Axis")); 
     assertFalse(plot1.equals(plot2)); 
     plot2.setDomainAxis(new NumberAxis("Domain Axis")); 
     assertTrue(plot1.equals(plot2)); 
     plot1.setDomainAxisLocation(AxisLocation.TOP_OR_RIGHT); 
     assertFalse(plot1.equals(plot2)); 
     plot2.setDomainAxisLocation(AxisLocation.TOP_OR_RIGHT); 
     assertTrue(plot1.equals(plot2)); 
     plot1.setDomainAxis(11, new NumberAxis("Secondary Domain Axis")); 
     assertFalse(plot1.equals(plot2)); 
     plot2.setDomainAxis(11, new NumberAxis("Secondary Domain Axis")); 
     assertTrue(plot1.equals(plot2)); 
     plot1.setDomainAxisLocation(11, AxisLocation.TOP_OR_RIGHT); 
     assertFalse(plot1.equals(plot2)); 
     plot2.setDomainAxisLocation(11, AxisLocation.TOP_OR_RIGHT); 
     assertTrue(plot1.equals(plot2)); 
     plot1.setRangeAxis(new NumberAxis("Range Axis")); 
     assertFalse(plot1.equals(plot2)); 
     plot2.setRangeAxis(new NumberAxis("Range Axis")); 
     assertTrue(plot1.equals(plot2)); 
     plot1.setRangeAxisLocation(AxisLocation.TOP_OR_RIGHT); 
     assertFalse(plot1.equals(plot2)); 
     plot2.setRangeAxisLocation(AxisLocation.TOP_OR_RIGHT); 
     assertTrue(plot1.equals(plot2)); 
     plot1.setRangeAxis(11, new NumberAxis("Secondary Range Axis")); 
     assertFalse(plot1.equals(plot2)); 
     plot2.setRangeAxis(11, new NumberAxis("Secondary Range Axis")); 
     assertTrue(plot1.equals(plot2)); 
     plot1.setRangeAxisLocation(11, AxisLocation.TOP_OR_RIGHT); 
     assertFalse(plot1.equals(plot2)); 
     plot2.setRangeAxisLocation(11, AxisLocation.TOP_OR_RIGHT); 
     assertTrue(plot1.equals(plot2)); 
     plot1.mapDatasetToDomainAxis(11, 11); 
     assertFalse(plot1.equals(plot2)); 
     plot2.mapDatasetToDomainAxis(11, 11); 
     assertTrue(plot1.equals(plot2)); 
     plot1.mapDatasetToRangeAxis(11, 11); 
     assertFalse(plot1.equals(plot2)); 
     plot2.mapDatasetToRangeAxis(11, 11); 
     assertTrue(plot1.equals(plot2)); 
     plot1.setRenderer(new DefaultXYItemRenderer()); 
     assertFalse(plot1.equals(plot2)); 
     plot2.setRenderer(new DefaultXYItemRenderer()); 
     assertTrue(plot1.equals(plot2)); 
     plot1.setRenderer(11, new DefaultXYItemRenderer()); 
     assertFalse(plot1.equals(plot2)); 
     plot2.setRenderer(11, new DefaultXYItemRenderer()); 
     assertTrue(plot1.equals(plot2)); 
     plot1.setDomainGridlinesVisible(false); 
     assertFalse(plot1.equals(plot2)); 
     plot2.setDomainGridlinesVisible(false); 
     assertTrue(plot1.equals(plot2)); 
     Stroke stroke = new BasicStroke(2.0f); 
     plot1.setDomainGridlineStroke(stroke); 
     assertFalse(plot1.equals(plot2)); 
     plot2.setDomainGridlineStroke(stroke); 
     assertTrue(plot1.equals(plot2)); 
     plot1.setDomainGridlinePaint(new GradientPaint(1.0f, 2.0f, Color.blue, 3.0f, 4.0f, Color.red)); 
     assertFalse(plot1.equals(plot2)); 
     plot2.setDomainGridlinePaint(new GradientPaint(1.0f, 2.0f, Color.blue, 3.0f, 4.0f, Color.red)); 
     assertTrue(plot1.equals(plot2)); 
     plot1.setRangeGridlinesVisible(false); 
     assertFalse(plot1.equals(plot2)); 
     plot2.setRangeGridlinesVisible(false); 
     assertTrue(plot1.equals(plot2)); 
     plot1.setRangeGridlineStroke(stroke); 
     assertFalse(plot1.equals(plot2)); 
     plot2.setRangeGridlineStroke(stroke); 
     assertTrue(plot1.equals(plot2)); 
     plot1.setRangeGridlinePaint(new GradientPaint(1.0f, 2.0f, Color.green, 3.0f, 4.0f, Color.red)); 
     assertFalse(plot1.equals(plot2)); 
     plot2.setRangeGridlinePaint(new GradientPaint(1.0f, 2.0f, Color.green, 3.0f, 4.0f, Color.red)); 
     assertTrue(plot1.equals(plot2)); 
     plot1.setRangeZeroBaselineVisible(true); 
     assertFalse(plot1.equals(plot2)); 
     plot2.setRangeZeroBaselineVisible(true); 
     assertTrue(plot1.equals(plot2)); 
     plot1.setRangeZeroBaselineStroke(stroke); 
     assertFalse(plot1.equals(plot2)); 
     plot2.setRangeZeroBaselineStroke(stroke); 
     assertTrue(plot1.equals(plot2)); 
     plot1.setRangeZeroBaselinePaint(new GradientPaint(1.0f, 2.0f, Color.white, 3.0f, 4.0f, Color.red)); 
     assertFalse(plot1.equals(plot2)); 
     plot2.setRangeZeroBaselinePaint(new GradientPaint(1.0f, 2.0f, Color.white, 3.0f, 4.0f, Color.red)); 
     assertTrue(plot1.equals(plot2)); 
     plot1.setRangeCrosshairVisible(true); 
     assertFalse(plot1.equals(plot2)); 
     plot2.setRangeCrosshairVisible(true); 
     assertTrue(plot1.equals(plot2)); 
     plot1.setRangeCrosshairValue(100.0); 
     assertFalse(plot1.equals(plot2)); 
     plot2.setRangeCrosshairValue(100.0); 
     assertTrue(plot1.equals(plot2)); 
     plot1.setRangeCrosshairStroke(stroke); 
     assertFalse(plot1.equals(plot2)); 
     plot2.setRangeCrosshairStroke(stroke); 
     assertTrue(plot1.equals(plot2)); 
     plot1.setRangeCrosshairPaint(new GradientPaint(1.0f, 2.0f, Color.pink, 3.0f, 4.0f, Color.red)); 
     assertFalse(plot1.equals(plot2)); 
     plot2.setRangeCrosshairPaint(new GradientPaint(1.0f, 2.0f, Color.pink, 3.0f, 4.0f, Color.red)); 
     assertTrue(plot1.equals(plot2)); 
     plot1.setRangeCrosshairLockedOnData(false); 
     assertFalse(plot1.equals(plot2)); 
     plot2.setRangeCrosshairLockedOnData(false); 
     assertTrue(plot1.equals(plot2)); 
     plot1.addRangeMarker(new ValueMarker(4.0)); 
     assertFalse(plot1.equals(plot2)); 
     plot2.addRangeMarker(new ValueMarker(4.0)); 
     assertTrue(plot1.equals(plot2)); 
     plot1.addRangeMarker(1, new ValueMarker(4.0), Layer.FOREGROUND); 
     assertFalse(plot1.equals(plot2)); 
     plot2.addRangeMarker(1, new ValueMarker(4.0), Layer.FOREGROUND); 
     assertTrue(plot1.equals(plot2)); 
     plot1.addRangeMarker(1, new ValueMarker(99.0), Layer.BACKGROUND); 
     assertFalse(plot1.equals(plot2)); 
     plot2.addRangeMarker(1, new ValueMarker(99.0), Layer.BACKGROUND); 
     assertTrue(plot1.equals(plot2)); 
     plot1.setFixedLegendItems(new LegendItemCollection()); 
     assertFalse(plot1.equals(plot2)); 
     plot2.setFixedLegendItems(new LegendItemCollection()); 
     assertTrue(plot1.equals(plot2)); 
     plot1.setWeight(3); 
     assertFalse(plot1.equals(plot2)); 
     plot2.setWeight(3); 
     assertTrue(plot1.equals(plot2)); 
     plot1.setQuadrantOrigin(new Point2D.Double(12.3, 45.6)); 
     assertFalse(plot1.equals(plot2)); 
     plot2.setQuadrantOrigin(new Point2D.Double(12.3, 45.6)); 
     assertTrue(plot1.equals(plot2)); 
     plot1.setQuadrantPaint(0, new GradientPaint(1.0f, 2.0f, Color.red, 3.0f, 4.0f, Color.blue)); 
     assertFalse(plot1.equals(plot2)); 
     plot2.setQuadrantPaint(0, new GradientPaint(1.0f, 2.0f, Color.red, 3.0f, 4.0f, Color.blue)); 
     assertTrue(plot1.equals(plot2)); 
     plot1.setQuadrantPaint(1, new GradientPaint(2.0f, 3.0f, Color.red, 4.0f, 5.0f, Color.blue)); 
     assertFalse(plot1.equals(plot2)); 
     plot2.setQuadrantPaint(1, new GradientPaint(2.0f, 3.0f, Color.red, 4.0f, 5.0f, Color.blue)); 
     assertTrue(plot1.equals(plot2)); 
     plot1.setQuadrantPaint(2, new GradientPaint(3.0f, 4.0f, Color.red, 5.0f, 6.0f, Color.blue)); 
     assertFalse(plot1.equals(plot2)); 
     plot2.setQuadrantPaint(2, new GradientPaint(3.0f, 4.0f, Color.red, 5.0f, 6.0f, Color.blue)); 
     assertTrue(plot1.equals(plot2)); 
     plot1.setQuadrantPaint(3, new GradientPaint(4.0f, 5.0f, Color.red, 6.0f, 7.0f, Color.blue)); 
     assertFalse(plot1.equals(plot2)); 
     plot2.setQuadrantPaint(3, new GradientPaint(4.0f, 5.0f, Color.red, 6.0f, 7.0f, Color.blue)); 
     assertTrue(plot1.equals(plot2)); 
     plot1.setDomainTickBandPaint(Color.red); 
     assertFalse(plot1.equals(plot2)); 
     plot2.setDomainTickBandPaint(Color.red); 
     assertTrue(plot1.equals(plot2)); 
     plot1.setRangeTickBandPaint(Color.blue); 
     assertFalse(plot1.equals(plot2)); 
     plot2.setRangeTickBandPaint(Color.blue); 
     assertTrue(plot1.equals(plot2)); 
     plot1.setDomainMinorGridlinesVisible(true); 
     assertFalse(plot1.equals(plot2)); 
     plot2.setDomainMinorGridlinesVisible(true); 
     assertTrue(plot1.equals(plot2)); 
     plot1.setDomainMinorGridlinePaint(Color.red); 
     assertFalse(plot1.equals(plot2)); 
     plot2.setDomainMinorGridlinePaint(Color.red); 
     assertTrue(plot1.equals(plot2)); 
     plot1.setDomainGridlineStroke(new BasicStroke(1.1f)); 
     assertFalse(plot1.equals(plot2)); 
     plot2.setDomainGridlineStroke(new BasicStroke(1.1f)); 
     assertTrue(plot1.equals(plot2)); 
     plot1.setRangeMinorGridlinesVisible(true); 
     assertFalse(plot1.equals(plot2)); 
     plot2.setRangeMinorGridlinesVisible(true); 
     assertTrue(plot1.equals(plot2)); 
     plot1.setRangeMinorGridlinePaint(Color.blue); 
     assertFalse(plot1.equals(plot2)); 
     plot2.setRangeMinorGridlinePaint(Color.blue); 
     assertTrue(plot1.equals(plot2)); 
     plot1.setRangeMinorGridlineStroke(new BasicStroke(1.23f)); 
     assertFalse(plot1.equals(plot2)); 
     plot2.setRangeMinorGridlineStroke(new BasicStroke(1.23f)); 
     assertTrue(plot1.equals(plot2)); 
     List axisIndices = Arrays.asList(new Integer[] { new Integer(0), new Integer(1) }); 
     plot1.mapDatasetToDomainAxes(0, axisIndices); 
     assertFalse(plot1.equals(plot2)); 
     plot2.mapDatasetToDomainAxes(0, axisIndices); 
     assertTrue(plot1.equals(plot2)); 
     plot1.mapDatasetToRangeAxes(0, axisIndices); 
     assertFalse(plot1.equals(plot2)); 
     plot2.mapDatasetToRangeAxes(0, axisIndices); 
     assertTrue(plot1.equals(plot2)); 
     plot1.setShadowGenerator(new DefaultShadowGenerator(5, Color.gray, 0.6f, 4, -Math.PI / 4)); 
     assertFalse(plot1.equals(plot2)); 
     plot2.setShadowGenerator(new DefaultShadowGenerator(5, Color.gray, 0.6f, 4, -Math.PI / 4)); 
     assertTrue(plot1.equals(plot2)); 
     plot1.setShadowGenerator(null); 
     assertFalse(plot1.equals(plot2)); 
     plot2.setShadowGenerator(null); 
     assertTrue(plot1.equals(plot2)); 
 } 


public void testSerialization2115() { 
     IntervalXYDataset data1 = createDataset1(); 
     XYItemRenderer renderer1 = new XYBarRenderer(0.20); 
     renderer1.setBaseToolTipGenerator(StandardXYToolTipGenerator.getTimeSeriesInstance()); 
     XYPlot p1 = new XYPlot(data1, new DateAxis("Date"), null, renderer1); 
     XYPlot p2 = null; 
     try { 
         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); 
         ObjectOutput out = new ObjectOutputStream(buffer); 
         out.writeObject(p1); 
         out.close(); 
         ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray())); 
         p2 = (XYPlot) in.readObject(); 
         in.close(); 
     } catch (Exception e) { 
         fail(e.toString()); 
     } 
     assertEquals(p1, p2); 
 } 


public void testCloning4234() { 
     XYLineAndShapeRenderer r1 = new XYLineAndShapeRenderer(); 
     XYPlot p1 = new XYPlot(null, new NumberAxis("Domain Axis"), new NumberAxis("Range Axis"), r1); 
     XYPlot p2 = null; 
     try { 
         p2 = (XYPlot) p1.clone(); 
     } catch (CloneNotSupportedException e) { 
         e.printStackTrace(); 
     } 
     assertTrue(p1 != p2); 
     assertTrue(p1.getClass() == p2.getClass()); 
     assertTrue(p1.equals(p2)); 
     XYLineAndShapeRenderer r2 = (XYLineAndShapeRenderer) p2.getRenderer(); 
     assertTrue(r2.hasListener(p2)); 
 } 


public void testSerialization5425() { 
     XYSeriesCollection dataset1 = new XYSeriesCollection(); 
     NumberAxis domainAxis1 = new NumberAxis("Domain 1"); 
     NumberAxis rangeAxis1 = new NumberAxis("Range 1"); 
     StandardXYItemRenderer renderer1 = new StandardXYItemRenderer(); 
     XYPlot p1 = new XYPlot(dataset1, domainAxis1, rangeAxis1, renderer1); 
     NumberAxis domainAxis2 = new NumberAxis("Domain 2"); 
     NumberAxis rangeAxis2 = new NumberAxis("Range 2"); 
     StandardXYItemRenderer renderer2 = new StandardXYItemRenderer(); 
     XYSeriesCollection dataset2 = new XYSeriesCollection(); 
     p1.setDataset(1, dataset2); 
     p1.setDomainAxis(1, domainAxis2); 
     p1.setRangeAxis(1, rangeAxis2); 
     p1.setRenderer(1, renderer2); 
     XYPlot p2 = null; 
     try { 
         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); 
         ObjectOutput out = new ObjectOutputStream(buffer); 
         out.writeObject(p1); 
         out.close(); 
         ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray())); 
         p2 = (XYPlot) in.readObject(); 
         in.close(); 
     } catch (Exception e) { 
         fail(e.toString()); 
     } 
     assertEquals(p1, p2); 
     NumberAxis domainAxisA = (NumberAxis) p2.getDomainAxis(0); 
     NumberAxis rangeAxisA = (NumberAxis) p2.getRangeAxis(0); 
     XYSeriesCollection datasetA = (XYSeriesCollection) p2.getDataset(0); 
     StandardXYItemRenderer rendererA = (StandardXYItemRenderer) p2.getRenderer(0); 
     NumberAxis domainAxisB = (NumberAxis) p2.getDomainAxis(1); 
     NumberAxis rangeAxisB = (NumberAxis) p2.getRangeAxis(1); 
     XYSeriesCollection datasetB = (XYSeriesCollection) p2.getDataset(1); 
     StandardXYItemRenderer rendererB = (StandardXYItemRenderer) p2.getRenderer(1); 
     assertTrue(datasetA.hasListener(p2)); 
     assertTrue(domainAxisA.hasListener(p2)); 
     assertTrue(rangeAxisA.hasListener(p2)); 
     assertTrue(rendererA.hasListener(p2)); 
     assertTrue(datasetB.hasListener(p2)); 
     assertTrue(domainAxisB.hasListener(p2)); 
     assertTrue(rangeAxisB.hasListener(p2)); 
     assertTrue(rendererB.hasListener(p2)); 
 } 


public void testDrawRangeGridlines458() { 
     DefaultXYDataset dataset = new DefaultXYDataset(); 
     JFreeChart chart = ChartFactory.createXYLineChart("Title", "X", "Y", dataset, true); 
     XYPlot plot = (XYPlot) chart.getPlot(); 
     plot.setRenderer(null); 
     boolean success = false; 
     try { 
         BufferedImage image = new BufferedImage(200, 100, BufferedImage.TYPE_INT_RGB); 
         Graphics2D g2 = image.createGraphics(); 
         chart.draw(g2, new Rectangle2D.Double(0, 0, 200, 100), null, null); 
         g2.dispose(); 
         success = true; 
     } catch (Exception e) { 
         e.printStackTrace(); 
         success = false; 
     } 
     assertTrue(success); 
 } 


public void testCloning_QuadrantOrigin707() { 
     XYPlot p1 = new XYPlot(); 
     Point2D p = new Point2D.Double(1.2, 3.4); 
     p1.setQuadrantOrigin(p); 
     XYPlot p2 = null; 
     try { 
         p2 = (XYPlot) p1.clone(); 
     } catch (CloneNotSupportedException e) { 
         e.printStackTrace(); 
     } 
     assertTrue(p1 != p2); 
     assertTrue(p1.getClass() == p2.getClass()); 
     assertTrue(p1.equals(p2)); 
     assertTrue(p2.getQuadrantOrigin() != p); 
 } 


public void testGetDomainAxisForDataset708() { 
     XYDataset dataset = new XYSeriesCollection(); 
     NumberAxis xAxis = new NumberAxis("X"); 
     NumberAxis yAxis = new NumberAxis("Y"); 
     XYItemRenderer renderer = new DefaultXYItemRenderer(); 
     XYPlot plot = new XYPlot(dataset, xAxis, yAxis, renderer); 
     assertEquals(xAxis, plot.getDomainAxisForDataset(0)); 
     boolean pass = false; 
     try { 
         plot.getDomainAxisForDataset(-1); 
     } catch (IllegalArgumentException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
     pass = false; 
     try { 
         plot.getDomainAxisForDataset(1); 
     } catch (IllegalArgumentException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
     NumberAxis xAxis2 = new NumberAxis("X2"); 
     plot.setDomainAxis(1, xAxis2); 
     assertEquals(xAxis, plot.getDomainAxisForDataset(0)); 
     plot.mapDatasetToDomainAxis(0, 1); 
     assertEquals(xAxis2, plot.getDomainAxisForDataset(0)); 
     List axisIndices = Arrays.asList(new Integer[] { new Integer(0), new Integer(1) }); 
     plot.mapDatasetToDomainAxes(0, axisIndices); 
     assertEquals(xAxis, plot.getDomainAxisForDataset(0)); 
     axisIndices = Arrays.asList(new Integer[] { new Integer(1), new Integer(2) }); 
     plot.mapDatasetToDomainAxes(0, axisIndices); 
     assertEquals(xAxis2, plot.getDomainAxisForDataset(0)); 
 } 


public void testGetRangeAxisForDataset709() { 
     XYDataset dataset = new XYSeriesCollection(); 
     NumberAxis xAxis = new NumberAxis("X"); 
     NumberAxis yAxis = new NumberAxis("Y"); 
     XYItemRenderer renderer = new DefaultXYItemRenderer(); 
     XYPlot plot = new XYPlot(dataset, xAxis, yAxis, renderer); 
     assertEquals(yAxis, plot.getRangeAxisForDataset(0)); 
     boolean pass = false; 
     try { 
         plot.getRangeAxisForDataset(-1); 
     } catch (IllegalArgumentException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
     pass = false; 
     try { 
         plot.getRangeAxisForDataset(1); 
     } catch (IllegalArgumentException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
     NumberAxis yAxis2 = new NumberAxis("Y2"); 
     plot.setRangeAxis(1, yAxis2); 
     assertEquals(yAxis, plot.getRangeAxisForDataset(0)); 
     plot.mapDatasetToRangeAxis(0, 1); 
     assertEquals(yAxis2, plot.getRangeAxisForDataset(0)); 
     List axisIndices = Arrays.asList(new Integer[] { new Integer(0), new Integer(1) }); 
     plot.mapDatasetToRangeAxes(0, axisIndices); 
     assertEquals(yAxis, plot.getRangeAxisForDataset(0)); 
     axisIndices = Arrays.asList(new Integer[] { new Integer(1), new Integer(2) }); 
     plot.mapDatasetToRangeAxes(0, axisIndices); 
     assertEquals(yAxis2, plot.getRangeAxisForDataset(0)); 
 } 

    

    /**
     * Confirm that basic cloning works.
     */
    

    /**
     * Tests cloning for a more complex plot.
     */
    

    /**
     * Tests cloning for a plot where the fixed legend items have been
     * specified.
     */
    

    /**
     * Tests cloning to ensure that the cloned plot is registered as a listener
     * on the cloned renderer.
     */
    

    /**
     * Confirm that cloning captures the quadrantOrigin field.
     */
    

    /**
     * Confirm that cloning captures the quadrantOrigin field.
     */
    

    /**
     * Renderers that belong to the plot are being cloned but they are
     * retaining a reference to the original plot.
     */
    

    /**
     * Tests the independence of the clones.
     */
    

    /**
     * Setting a null renderer should be allowed, but is generating a null
     * pointer exception in 0.9.7.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.  This test
     * uses a {@link DateAxis} and a {@link StandardXYToolTipGenerator}.
     */
    

    /**
     * Problem to reproduce a bug in serialization.  The bug (first reported
     * against the {@link org.jfree.chart.plot.CategoryPlot} class) is a null
     * pointer exception that occurs when drawing a plot after deserialization.
     * It is caused by four temporary storage structures (axesAtTop,
     * axesAtBottom, axesAtLeft and axesAtRight - all initialized as empty
     * lists in the constructor) not being initialized by the readObject()
     * method following deserialization.  This test has been written to
     * reproduce the bug (now fixed).
     */
    

    /**
     * A test to reproduce a bug in serialization: the domain and/or range
     * markers for a plot are not being serialized.
     */
    

    /**
     * Tests a bug where the plot is no longer registered as a listener
     * with the dataset(s) and axes after deserialization.  See patch 1209475
     * at SourceForge.
     */
    

    /**
     * Some checks for the getRendererForDataset() method.
     */
    

    /**
     * Some checks for the getLegendItems() method.
     */
    

    /**
     * Creates a sample dataset.
     *
     * @return Series 1.
     */
    private IntervalXYDataset createDataset1() {

        // create dataset 1...
        TimeSeries series1 = new TimeSeries("Series 1");
        series1.add(new Day(1, MonthConstants.MARCH, 2002), 12353.3);
        series1.add(new Day(2, MonthConstants.MARCH, 2002), 13734.4);
        series1.add(new Day(3, MonthConstants.MARCH, 2002), 14525.3);
        series1.add(new Day(4, MonthConstants.MARCH, 2002), 13984.3);
        series1.add(new Day(5, MonthConstants.MARCH, 2002), 12999.4);
        series1.add(new Day(6, MonthConstants.MARCH, 2002), 14274.3);
        series1.add(new Day(7, MonthConstants.MARCH, 2002), 15943.5);
        series1.add(new Day(8, MonthConstants.MARCH, 2002), 14845.3);
        series1.add(new Day(9, MonthConstants.MARCH, 2002), 14645.4);
        series1.add(new Day(10, MonthConstants.MARCH, 2002), 16234.6);
        series1.add(new Day(11, MonthConstants.MARCH, 2002), 17232.3);
        series1.add(new Day(12, MonthConstants.MARCH, 2002), 14232.2);
        series1.add(new Day(13, MonthConstants.MARCH, 2002), 13102.2);
        series1.add(new Day(14, MonthConstants.MARCH, 2002), 14230.2);
        series1.add(new Day(15, MonthConstants.MARCH, 2002), 11235.2);

        TimeSeriesCollection collection = new TimeSeriesCollection(series1);
        return collection;

    }

    /**
     * Creates a sample dataset.
     *
     * @return A sample dataset.
     */
    private XYDataset createDataset2() {
        // create dataset 1...
        XYSeries series = new XYSeries("Series 2");
        XYSeriesCollection collection = new XYSeriesCollection(series);
        return collection;

    }

    /**
     * A test for a bug where setting the renderer doesn't register the plot
     * as a RendererChangeListener.
     */
    

    /**
     * Some checks for the removeAnnotation() method.
     */
    

    /**
     * Some tests for the addDomainMarker() method(s).
     */
    

    /**
     * Some tests for the addRangeMarker() method(s).
     */
    

    /**
     * A test for bug 1654215 (where a renderer is added to the plot without
     * a corresponding dataset and it throws an exception at drawing time).
     */
    

    /**
     * A test for drawing range grid lines when there is no primary renderer.
     * In 1.0.4, this is throwing a NullPointerException.
     */
    

    /**
     * A test for drawing a plot where a series has zero items.  With
     * JFreeChart 1.0.5+cvs this was throwing an exception at one point.
     */
    

    /**
     * Check that removing a marker that isn't assigned to the plot returns
     * false.
     */
    

    /**
     * Check that removing a marker that isn't assigned to the plot returns
     * false.
     */
    

    /**
     * Some tests for the getDomainAxisForDataset() method.
     */
    

    /**
     * Some tests for the getRangeAxisForDataset() method.
     */
    
}
