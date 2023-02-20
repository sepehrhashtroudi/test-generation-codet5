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
 * ----------------------
 * CategoryPlotTests.java
 * ----------------------
 * (C) Copyright 2003-2009, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 26-Mar-2003 : Version 1 (DG);
 * 15-Sep-2003 : Added a unit test to reproduce a bug in serialization (now
 *               fixed) (DG);
 * 05-Feb-2007 : Added testAddDomainMarker() and testAddRangeMarker() (DG);
 * 07-Feb-2007 : Added test1654215() (DG);
 * 20-Jun-2007 : Removed JCommon dependencies (DG);
 * 07-Apr-2008 : Added testRemoveDomainMarker() and
 *               testRemoveRangeMarker() (DG);
 * 23-Apr-2008 : Extended testEquals() and testCloning(), and added
 *               testCloning2() and testCloning3() (DG);
 * 26-Jun-2008 : Updated testEquals() (DG);
 * 21-Jan-2009 : Updated testEquals() for new fields (DG);
 * 10-Jul-2009 : Updated testEquals() for new field (DG);
 *
 */

package org.jfree.chart.plot.junit;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.awt.Stroke;
import java.awt.geom.Line2D;
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
import org.jfree.chart.annotations.CategoryLineAnnotation;
import org.jfree.chart.annotations.CategoryTextAnnotation;
import org.jfree.chart.axis.AxisLocation;
import org.jfree.chart.axis.AxisSpace;
import org.jfree.chart.axis.CategoryAnchor;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.event.MarkerChangeListener;
import org.jfree.chart.plot.CategoryMarker;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.DatasetRenderingOrder;
import org.jfree.chart.plot.IntervalMarker;
import org.jfree.chart.plot.Marker;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.ValueMarker;
import org.jfree.chart.renderer.category.AreaRenderer;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.CategoryItemRenderer;
import org.jfree.chart.renderer.category.DefaultCategoryItemRenderer;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.chart.util.DefaultShadowGenerator;
import org.jfree.chart.util.Layer;
import org.jfree.chart.util.RectangleInsets;
import org.jfree.chart.util.SortOrder;
import org.jfree.data.Range;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 * Tests for the {@link CategoryPlot} class.
 */
public class CategoryPlotTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(CategoryPlotTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public CategoryPlotTests(String name) {
        super(name);
    }

    /**
     * Some checks for the constructor.
     */

public void testSerialization2243() { 
     DefaultCategoryDataset data = new DefaultCategoryDataset(); 
     CategoryAxis domainAxis = new CategoryAxis("Domain"); 
     NumberAxis rangeAxis = new NumberAxis("Range"); 
     BarRenderer renderer = new BarRenderer(); 
     CategoryPlot p1 = new CategoryPlot(data, domainAxis, rangeAxis, renderer); 
     p1.setOrientation(PlotOrientation.VERTICAL); 
     CategoryPlot p2 = null; 
     try { 
         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); 
         ObjectOutput out = new ObjectOutputStream(buffer); 
         out.writeObject(p1); 
         out.close(); 
         ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray())); 
         p2 = (CategoryPlot) in.readObject(); 
         in.close(); 
     } catch (Exception e) { 
         fail(e.toString()); 
     } 
     assertEquals(p1, p2); 
 } 


public void testGetRangeAxisForDataset541() { 
     CategoryDataset dataset = new DefaultCategoryDataset(); 
     CategoryAxis xAxis = new CategoryAxis("X"); 
     NumberAxis yAxis = new NumberAxis("Y"); 
     CategoryItemRenderer renderer = new DefaultCategoryItemRenderer(); 
     CategoryPlot plot = new CategoryPlot(dataset, xAxis, yAxis, renderer); 
     assertEquals(yAxis, plot.getRangeAxisForDataset(0)); 
     boolean pass = false; 
     try { 
         plot.getRangeAxisForDataset(-1); 
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


public void testGetDomainAxisIndex666() { 
     CategoryAxis domainAxis1 = new CategoryAxis("X1"); 
     CategoryAxis domainAxis2 = new CategoryAxis("X2"); 
     NumberAxis rangeAxis1 = new NumberAxis("Y1"); 
     CategoryPlot plot = new CategoryPlot(null, domainAxis1, rangeAxis1, null); 
     assertEquals(0, plot.getDomainAxisIndex(domainAxis1)); 
     assertEquals(-1, plot.getDomainAxisIndex(domainAxis2)); 
     plot.setDomainAxis(1, domainAxis2); 
     assertEquals(1, plot.getDomainAxisIndex(domainAxis2)); 
     assertEquals(-1, plot.getDomainAxisIndex(new CategoryAxis("X2"))); 
     boolean pass = false; 
     try { 
         plot.getDomainAxisIndex(null); 
     } catch (IllegalArgumentException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
 } 


public void test1169972667() { 
     CategoryPlot plot = new CategoryPlot(null, null, null, null); 
     plot.setDomainAxis(new CategoryAxis("C")); 
     plot.setRangeAxis(new NumberAxis("Y")); 
     plot.setRenderer(new BarRenderer()); 
     plot.setDataset(new DefaultCategoryDataset()); 
     assertTrue(plot != null); 
 } 


public void testBug2817504668() { 
     CategoryPlot p1 = new CategoryPlot(); 
     LineAndShapeRenderer r1 = new LineAndShapeRenderer(); 
     p1.setRenderer(r1); 
     CategoryPlot p2 = null; 
     try { 
         p2 = (CategoryPlot) p1.clone(); 
     } catch (CloneNotSupportedException e) { 
         e.printStackTrace(); 
     } 
     assertTrue(p1 != p2); 
     assertTrue(p1.getClass() == p2.getClass()); 
     assertTrue(p1.equals(p2)); 
     LineAndShapeRenderer r2 = (LineAndShapeRenderer) p2.getRenderer(); 
     assertTrue(r2.getPlot() == p2); 
 } 


public void testRemoveDomainMarker669() { 
     CategoryPlot plot = new CategoryPlot(); 
     assertFalse(plot.removeDomainMarker(new CategoryMarker("Category 1"))); 
 } 


public void testCloning2670() { 
     AxisSpace da1 = new AxisSpace(); 
     AxisSpace ra1 = new AxisSpace(); 
     CategoryPlot p1 = new CategoryPlot(); 
     p1.setFixedDomainAxisSpace(da1); 
     p1.setFixedRangeAxisSpace(ra1); 
     CategoryPlot p2 = null; 
     try { 
         p2 = (CategoryPlot) p1.clone(); 
     } catch (CloneNotSupportedException e) { 
         e.printStackTrace(); 
     } 
     assertTrue(p1 != p2); 
     assertTrue(p1.getClass() == p2.getClass()); 
     assertTrue(p1.equals(p2)); 
     da1.setBottom(99.0); 
     assertFalse(p1.equals(p2)); 
     p2.getFixedDomainAxisSpace().setBottom(99.0); 
     assertTrue(p1.equals(p2)); 
     ra1.setBottom(11.0); 
     assertFalse(p1.equals(p2)); 
     p2.getFixedRangeAxisSpace().setBottom(11.0); 
     assertTrue(p1.equals(p2)); 
 } 

    

    /**
     * A test for a bug reported in the forum.
     */
    

    /**
     * Test that the equals() method differentiates all the required fields.
     */
    

    /**
     * Confirm that cloning works.
     */
    

    /**
     * Some more cloning checks.
     */
    

    /**
     * Some more cloning checks.
     */
    

    /**
     * Renderers that belong to the plot are being cloned but they are
     * retaining a reference to the original plot.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

    /**
     * This test ensures that a plot with markers is serialized correctly.
     */
    

    /**
     * Tests a bug where the plot is no longer registered as a listener
     * with the dataset(s) and axes after deserialization.  See patch 1209475
     * at SourceForge.
     */
    

    /**
     * A test for a bug where setting the renderer doesn't register the plot
     * as a RendererChangeListener.
     */
    

    /**
     * A test for bug report 1169972.
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
     * Some checks for the getDomainAxisIndex() method.
     */
    

    /**
     * Some checks for the getRangeAxisIndex() method.
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
