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
public void testEquals5615() { final DefaultShadowGenerator g1 = new DefaultShadowGenerator(); assertTrue(g1.equals(g1)); final DefaultShadowGenerator g2 = new DefaultShadowGenerator(); assertTrue(g1.equals(g2)); final DefaultShadowGenerator g3 = new DefaultShadowGenerator(); assertFalse(g1.equals(g3)); final DefaultShadowGenerator g4 = new DefaultShadowGenerator(); assertFalse(g1.equals(g4)); final DefaultShadowGenerator g5 = new DefaultShadowGenerator(); assertFalse(g1.equals(g5)); final DefaultShadowGenerator g6 = new DefaultShadowGenerator(); assertFalse(g1.equals(g6)); }
public void testSetOrientation8376() { XYPlot plot = new XYPlot(); plot.setOrientation(PlotOrientation.VERTICAL); assertEquals(PlotOrientation.VERTICAL, plot.getOrientation()); plot.setOrientation(PlotOrientation.VERTICAL); assertEquals(PlotOrientation.VERTICAL, plot.getOrientation()); plot.setOrientation(PlotOrientation.VERTICAL); assertEquals(PlotOrientation.VERTICAL, plot.getOrientation()); }
public void testGetDomainAxis8379() { XYPlot plot = new XYPlot(); NumberAxis xAxis = new NumberAxis("X"); NumberAxis yAxis = new NumberAxis("Y"); plot.setDomainAxis(xAxis); plot.setDomainAxis(yAxis); assertEquals(xAxis, plot.getDomainAxis(0)); assertEquals(yAxis, plot.getDomainAxis(1)); }
public void testSetDomainAxis8380() { XYPlot plot = new XYPlot(); NumberAxis xAxis = new NumberAxis("X"); NumberAxis yAxis = new NumberAxis("Y"); plot.setDomainAxis(xAxis); assertEquals(xAxis, plot.getDomainAxis()); plot.setDomainAxis(yAxis); assertEquals(yAxis, plot.getDomainAxis()); }
public void testSetDomainAxis8381() { XYPlot plot = new XYPlot(); NumberAxis xAxis = new NumberAxis("X"); NumberAxis yAxis = new NumberAxis("Y"); plot.setDomainAxis(0, xAxis); assertEquals(xAxis, plot.getDomainAxis()); plot.setDomainAxis(1, yAxis); assertEquals(yAxis, plot.getDomainAxis()); }
public void testSetDomainAxis8382() { XYPlot plot = new XYPlot(); NumberAxis xAxis = new NumberAxis("X"); NumberAxis yAxis = new NumberAxis("Y"); plot.setDomainAxis(0, xAxis); assertEquals(xAxis, plot.getDomainAxis()); plot.setDomainAxis(1, yAxis); assertEquals(yAxis, plot.getDomainAxis()); plot.setDomainAxis(2, yAxis); assertEquals(yAxis, plot.getDomainAxis()); }
public void testSetDomainAxis8383() { XYPlot plot = new XYPlot(); NumberAxis xAxis = new NumberAxis("X"); NumberAxis yAxis = new NumberAxis("Y"); plot.setDomainAxis(0, xAxis, true); assertEquals(xAxis, plot.getDomainAxis()); plot.setDomainAxis(1, yAxis, true); assertEquals(yAxis, plot.getDomainAxis()); }
public void testConfigureDomainAxes8387() { XYPlot plot = new XYPlot(); NumberAxis xAxis = new NumberAxis("X"); NumberAxis yAxis = new NumberAxis("Y"); plot.setDomainAxis(xAxis); plot.setDomainAxis(yAxis); plot.configureDomainAxes(); assertEquals(yAxis, plot.getDomainAxis()); }
public void testSetRangeAxis8393() { XYPlot plot = new XYPlot(); NumberAxis xAxis = new NumberAxis("X"); NumberAxis yAxis = new NumberAxis("Y"); plot.setRangeAxis(xAxis); assertEquals(xAxis, plot.getRangeAxis()); plot.setRangeAxis(yAxis); assertEquals(yAxis, plot.getRangeAxis()); }
public void testFireChangeEvent8394() { XYPlot plot = new XYPlot(); NumberAxis xAxis = new NumberAxis("X"); NumberAxis yAxis = new NumberAxis("Y"); plot.setRangeAxis(xAxis); plot.setRangeAxis(yAxis); assertEquals(xAxis, plot.getRangeAxis()); assertEquals(yAxis, plot.getRangeAxis()); }
public void testGetRangeAxis8397() { XYPlot plot = new XYPlot(); NumberAxis xAxis = new NumberAxis("X"); NumberAxis yAxis = new NumberAxis("Y"); plot.setRangeAxis(0, xAxis); assertEquals(xAxis, plot.getRangeAxis(0)); plot.setRangeAxis(1, yAxis); assertEquals(yAxis, plot.getRangeAxis(1)); }
public void testSetRangeAxis8399() { XYPlot plot = new XYPlot(); NumberAxis xAxis = new NumberAxis("X"); NumberAxis yAxis = new NumberAxis("Y"); plot.setRangeAxis(0, xAxis); assertEquals(xAxis, plot.getRangeAxis()); plot.setRangeAxis(1, yAxis); assertEquals(yAxis, plot.getRangeAxis()); plot.setRangeAxis(2, yAxis); assertEquals(yAxis, plot.getRangeAxis()); plot.setRangeAxis(3, yAxis); assertEquals(yAxis, plot.getRangeAxis()); plot.setRangeAxis(4, yAxis); assertEquals(yAxis, plot.getRangeAxis());
}

public void testSetRangeAxis8400() { XYPlot plot = new XYPlot(); NumberAxis xAxis = new NumberAxis("X"); NumberAxis yAxis = new NumberAxis("Y"); plot.setRangeAxis(0, xAxis, true); assertEquals(xAxis, plot.getRangeAxis()); plot.setRangeAxis(1, yAxis, true); assertEquals(yAxis, plot.getRangeAxis()); plot.setRangeAxis(2, xAxis, true); assertEquals(xAxis, plot.getRangeAxis()); plot.setRangeAxis(3, yAxis, true); assertEquals(yAxis, plot.getRangeAxis()); }
public void testSetRangeAxis8401() { XYPlot plot = new XYPlot(); NumberAxis xAxis = new NumberAxis("X"); NumberAxis yAxis = new NumberAxis("Y"); plot.setRangeAxis(0, xAxis); assertEquals(xAxis, plot.getRangeAxis()); plot.setRangeAxis(1, yAxis); assertEquals(yAxis, plot.getRangeAxis()); plot.setRangeAxis(2, null); assertNull(plot.getRangeAxis()); }
public void testSetRangeAxis8402() { XYPlot plot = new XYPlot(); NumberAxis xAxis = new NumberAxis("X"); NumberAxis yAxis = new NumberAxis("Y"); plot.setRangeAxis(0, xAxis); assertEquals(xAxis, plot.getRangeAxis()); plot.setRangeAxis(1, yAxis); assertEquals(yAxis, plot.getRangeAxis()); }
public void testSetRangeAxis8403() { XYPlot plot = new XYPlot(); NumberAxis xAxis = new NumberAxis("X"); NumberAxis yAxis = new NumberAxis("Y"); plot.setRangeAxis(0, xAxis); assertEquals(xAxis, plot.getRangeAxis()); plot.setRangeAxis(1, yAxis); assertEquals(yAxis, plot.getRangeAxis()); plot.setRangeAxis(2, yAxis); assertEquals(yAxis, plot.getRangeAxis()); plot.setRangeAxis(3, xAxis); assertEquals(xAxis, plot.getRangeAxis()); plot.setRangeAxis(4, yAxis); assertEquals(yAxis, plot.getRangeAxis());
}

public void testSetRangeAxis8404() { XYPlot plot = new XYPlot(); NumberAxis xAxis = new NumberAxis("X"); NumberAxis yAxis = new NumberAxis("Y"); plot.setRangeAxis(0, xAxis); assertEquals(xAxis, plot.getRangeAxis()); plot.setRangeAxis(1, yAxis); assertEquals(yAxis, plot.getRangeAxis()); plot.setRangeAxis(2, xAxis); assertEquals(xAxis, plot.getRangeAxis()); plot.setRangeAxis(3, yAxis); assertEquals(yAxis, plot.getRangeAxis()); }
public void testConfigureRangeAxes8406() { XYPlot plot = new XYPlot(); NumberAxis xAxis = new NumberAxis("X"); NumberAxis yAxis = new NumberAxis("Y"); plot.setDomainAxis(xAxis); plot.setRangeAxis(yAxis); plot.configureRangeAxes(); assertEquals(yAxis, plot.getRangeAxis()); }
public void testSetRangeAxisLocation8409() { XYPlot plot = new XYPlot(); AxisLocation location1 = AxisLocation.BOTTOM_OR_RIGHT; AxisLocation location2 = AxisLocation.TOP_OR_LEFT; plot.setRangeAxisLocation(0, location1, true); assertEquals(location1, plot.getRangeAxisLocation()); plot.setRangeAxisLocation(1, location2, true); assertEquals(location2, plot.getRangeAxisLocation()); plot.setRangeAxisLocation(2, location2, true); assertEquals(location2, plot.getRangeAxisLocation()); }
public void testSetWeight8418() { XYPlot plot = new XYPlot(); plot.setWeight(1); assertEquals(1, plot.getWeight()); plot.setWeight(2); assertEquals(2, plot.getWeight()); }
public void testSetWeight8419() { XYPlot plot = new XYPlot(); plot.setWeight(1); assertEquals(1, plot.getWeight()); }
public void testFireChangeEvent8420() { XYPlot plot = new XYPlot(); plot.setWeight(0); assertEquals(0, plot.getWeight()); plot.setWeight(1); assertEquals(1, plot.getWeight()); plot.setWeight(-1); assertEquals(-1, plot.getWeight()); plot.setWeight(2); assertEquals(2, plot.getWeight()); plot.setWeight(3); assertEquals(3, plot.getWeight()); }
public void testSetDomainGridlineStroke8426() { XYPlot plot = new XYPlot(); assertNull(plot.getDomainGridlineStroke()); try { plot.setDomainGridlineStroke(null); fail("IllegalArgumentException expected"); } catch (IllegalArgumentException e) { } }
public void testFireChangeEvent8427() { XYPlot plot = new XYPlot(); assertNull(plot.getDomainGridlineStroke()); try { plot.setDomainGridlineStroke(null); fail("IllegalArgumentException expected"); } catch (IllegalArgumentException e) { } }
public void testSetDomainMinorGridlinePaint8428() { XYPlot plot = new XYPlot(); assertNull(plot.getDomainMinorGridlinePaint()); plot.setDomainMinorGridlinePaint(new GradientPaint(1.0f, 2.0f, Color.RED, 3.0f, 4.0f, Color.BLUE)); assertEquals(new GradientPaint(1.0f, 2.0f, Color.RED, 3.0f, 4.0f, Color.BLUE), plot.getDomainMinorGridlinePaint()); }
public void testSetRangeGridlineStroke8434() { XYPlot plot = new XYPlot(); assertNull(plot.getRangeGridlineStroke());Stroke s = new BasicStroke(1.0f); plot.setRangeGridlineStroke(s); assertSame(s, plot.getRangeGridlineStroke()); try { plot.setRangeGridlineStroke(null); fail("IllegalArgumentException expected"); } catch (IllegalArgumentException e) { } try { plot.setRangeGridlineStroke(new BasicStroke(2.0f)); fail("IllegalArgumentException expected"); } catch (IllegalArgumentException e) { } }
public void testSetRangeMinorGridlineStroke8439() { XYPlot plot = new XYPlot(); assertNull(plot.getRangeMinorGridlineStroke()); try { plot.setRangeMinorGridlineStroke(null); fail("IllegalArgumentException should have been thrown."); } catch (IllegalArgumentException e) { } }
public void testSetRangeMinorGridlineStroke8440() { XYPlot plot = new XYPlot(); assertNull(plot.getRangeMinorGridlineStroke());Stroke s = new BasicStroke(1.0f); plot.setRangeMinorGridlineStroke(s); assertSame(s, plot.getRangeMinorGridlineStroke()); try { plot.setRangeMinorGridlineStroke(null); fail("IllegalArgumentException should have been thrown."); } catch (IllegalArgumentException e) { } try { plot.setRangeMinorGridlineStroke(new BasicStroke(2.0f)); fail("IllegalArgumentException should have been thrown."); } catch (IllegalArgumentException e) { } }
public void testSetDomainTickBandPaint8453() { XYPlot plot = new XYPlot(); plot.setDomainTickBandPaint(new GradientPaint(1.0f, 2.0f, Color.RED, 3.0f, 4.0f, Color.BLUE)); }
public void testSetDomainTickBandPaint8454() { XYPlot plot = new XYPlot(); plot.setDomainTickBandPaint(new GradientPaint(1.0f, 2.0f, Color.RED, 3.0f, 4.0f, Color.BLUE)); assertEquals(new GradientPaint(1.0f, 2.0f, Color.RED, 3.0f, 4.0f, Color.BLUE), plot.getDomainTickBandPaint()); }
public void testAddRangeMarker8465() { XYPlot plot = new XYPlot(); Marker m = new ValueMarker(1.0); plot.addRangeMarker(m); }
public void testGetRangeAxisIndex8526() { XYPlot plot = new XYPlot(); assertEquals(-1, plot.getRangeAxisIndex(new NumberAxis("A"))); plot.setRangeAxis(1, new NumberAxis("B")); assertEquals(0, plot.getRangeAxisIndex(new NumberAxis("A"))); plot.setRangeAxis(2, new NumberAxis("B")); assertEquals(1, plot.getRangeAxisIndex(new NumberAxis("A"))); assertEquals(2, plot.getRangeAxisIndex(new NumberAxis("B"))); }
public void testCloning8576() throws CloneNotSupportedException { XYPlot p1 = new XYPlot(); XYPlot p2 = (XYPlot) p1.clone(); assertNotSame(p1, p2); assertSame(p1.getClass(), p2.getClass()); assertEquals(p1, p2); }
public void testCloning8578() throws CloneNotSupportedException { NumberAxis d1 = new NumberAxis("X"); NumberAxis d2 = (NumberAxis) d1.clone(); assertNotSame(d1, d2); assertSame(d1.getClass(), d2.getClass()); assertEquals(d1, d2); }
public void testCloning8580() throws CloneNotSupportedException { NumberAxis x1 = new NumberAxis("X"); NumberAxis x2 = (NumberAxis) x1.clone(); assertNotSame(x1, x2); assertSame(x1.getClass(), x2.getClass()); assertEquals(x1, x2); }
    

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
