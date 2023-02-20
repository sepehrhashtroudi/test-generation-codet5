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
 * --------------------------
 * AbstractRendererTests.java
 * --------------------------
 * (C) Copyright 2003-2009, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 23-Oct-2003 : Version 1 (DG);
 * 01-Mar-2004 : Added serialization test (DG);
 * 19-Feb-2007 : Added testCloning (DG);
 * 28-Feb-2007 : Added checks for cloning (DG);
 * 20-Jun-2007 : Removed JCommon dependencies (DG);
 * 04-Dec-2007 : Added testHashCode() (DG);
 * 28-Jan-2009 : Updated testEquals() (DG);
 *
 */

package org.jfree.chart.renderer.junit;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Rectangle;
import java.awt.Stroke;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.event.RendererChangeEvent;
import org.jfree.chart.event.RendererChangeListener;
import org.jfree.chart.labels.ItemLabelAnchor;
import org.jfree.chart.labels.ItemLabelPosition;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.DefaultDrawingSupplier;
import org.jfree.chart.renderer.AbstractRenderer;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.chart.text.TextAnchor;

/**
 * Tests for the {@link AbstractRenderer} class.
 */
public class AbstractRendererTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(AbstractRendererTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public AbstractRendererTests(String name) {
        super(name);
    }

    /**
     * Test that the equals() method distinguishes all fields.
     */

public void testEquals287() { 
     BarRenderer r1 = new BarRenderer(); 
     BarRenderer r2 = new BarRenderer(); 
     assertTrue(r1.equals(r2)); 
     assertTrue(r2.equals(r1)); 
     r1.setSeriesVisible(2, Boolean.TRUE); 
     assertFalse(r1.equals(r2)); 
     r2.setSeriesVisible(2, Boolean.TRUE); 
     assertTrue(r1.equals(r2)); 
     r1.setBaseSeriesVisible(false); 
     assertFalse(r1.equals(r2)); 
     r2.setBaseSeriesVisible(false); 
     assertTrue(r1.equals(r2)); 
     r1.setSeriesVisibleInLegend(1, Boolean.TRUE); 
     assertFalse(r1.equals(r2)); 
     r2.setSeriesVisibleInLegend(1, Boolean.TRUE); 
     assertTrue(r1.equals(r2)); 
     r1.setBaseSeriesVisibleInLegend(false); 
     assertFalse(r1.equals(r2)); 
     r2.setBaseSeriesVisibleInLegend(false); 
     assertTrue(r1.equals(r2)); 
     r1.setSeriesPaint(0, new GradientPaint(1.0f, 2.0f, Color.red, 3.0f, 4.0f, Color.white)); 
     assertFalse(r1.equals(r2)); 
     r2.setSeriesPaint(0, new GradientPaint(1.0f, 2.0f, Color.red, 3.0f, 4.0f, Color.white)); 
     assertTrue(r1.equals(r2)); 
     r1.setBasePaint(new GradientPaint(1.0f, 2.0f, Color.blue, 3.0f, 4.0f, Color.red)); 
     assertFalse(r1.equals(r2)); 
     r2.setBasePaint(new GradientPaint(1.0f, 2.0f, Color.blue, 3.0f, 4.0f, Color.red)); 
     assertTrue(r1.equals(r2)); 
     r1.setSeriesFillPaint(0, new GradientPaint(1.0f, 2.0f, Color.blue, 3.0f, 4.0f, Color.red)); 
     assertFalse(r1.equals(r2)); 
     r2.setSeriesFillPaint(0, new GradientPaint(1.0f, 2.0f, Color.blue, 3.0f, 4.0f, Color.red)); 
     assertTrue(r1.equals(r2)); 
     r1.setBaseFillPaint(new GradientPaint(1.0f, 2.0f, Color.blue, 3.0f, 4.0f, Color.red)); 
     assertFalse(r1.equals(r2)); 
     r2.setBaseFillPaint(new GradientPaint(1.0f, 2.0f, Color.blue, 3.0f, 4.0f, Color.red)); 
     assertTrue(r1.equals(r2)); 
     r1.setSeriesOutlinePaint(0, new GradientPaint(1.0f, 2.0f, Color.blue, 3.0f, 4.0f, Color.red)); 
     assertFalse(r1.equals(r2)); 
     r2.setSeriesOutlinePaint(0, new GradientPaint(1.0f, 2.0f, Color.blue, 3.0f, 4.0f, Color.red)); 
     assertTrue(r1.equals(r2)); 
     r1.setBaseOutlinePaint(new GradientPaint(1.0f, 2.0f, Color.blue, 3.0f, 4.0f, Color.red)); 
     assertFalse(r1.equals(r2)); 
     r2.setBaseOutlinePaint(new GradientPaint(1.0f, 2.0f, Color.blue, 3.0f, 4.0f, Color.red)); 
     assertTrue(r1.equals(r2)); 
     Stroke s = new BasicStroke(3.21f); 
     r1.setSeriesStroke(1, s); 
     assertFalse(r1.equals(r2)); 
     r2.setSeriesStroke(1, s); 
     assertTrue(r1.equals(r2)); 
     r1.setBaseStroke(s); 
     assertFalse(r1.equals(r2)); 
     r2.setBaseStroke(s); 
     assertTrue(r1.equals(r2)); 
     r1.setSeriesOutlineStroke(0, s); 
     assertFalse(r1.equals(r2)); 
     r2.setSeriesOutlineStroke(0, s); 
     assertTrue(r1.equals(r2)); 
     r1.setBaseOutlineStroke(s); 
     assertFalse(r1.equals(r2)); 
     r2.setBaseOutlineStroke(s); 
     assertTrue(r1.equals(r2)); 
     r1.setSeriesShape(1, new Ellipse2D.Double(1, 2, 3, 4)); 
     assertFalse(r1.equals(r2)); 
     r2.setSeriesShape(1, new Ellipse2D.Double(1, 2, 3, 4)); 
     assertTrue(r1.equals(r2)); 
     r1.setBaseShape(new Ellipse2D.Double(1, 2, 3, 4)); 
     assertFalse(r1.equals(r2)); 
     r2.setBaseShape(new Ellipse2D.Double(1, 2, 3, 4)); 
     assertTrue(r1.equals(r2)); 
     r1.setSeriesItemLabelsVisible(1, Boolean.TRUE); 
     assertFalse(r1.equals(r2)); 
     r2.setSeriesItemLabelsVisible(1, Boolean.TRUE); 
     assertTrue(r1.equals(r2)); 
     r1.setBaseItemLabelsVisible(true); 
     assertFalse(r1.equals(r2)); 
     r2.setBaseItemLabelsVisible(true); 
     assertTrue(r1.equals(r2)); 
     r1.setSeriesItemLabelFont(1, new Font("Serif", Font.BOLD, 9)); 
     assertFalse(r1.equals(r2)); 
     r2.setSeriesItemLabelFont(1, new Font("Serif", Font.BOLD, 9)); 
     assertTrue(r1.equals(r2)); 
     r1.setBaseItemLabelFont(new Font("Serif", Font.PLAIN, 10)); 
     assertFalse(r1.equals(r2)); 
     r2.setBaseItemLabelFont(new Font("Serif", Font.PLAIN, 10)); 
     assertTrue(r1.equals(r2)); 
     r1.setSeriesItemLabelPaint(0, new GradientPaint(1.0f, 2.0f, Color.red, 3.0f, 4.0f, Color.gray)); 
     assertFalse(r1.equals(r2)); 
     r2.setSeriesItemLabelPaint(0, new GradientPaint(1.0f, 2.0f, Color.red, 3.0f, 4.0f, Color.gray)); 
     assertTrue(r1.equals(r2)); 
     r1.setBaseItemLabelPaint(new GradientPaint(1.0f, 2.0f, Color.red, 3.0f, 4.0f, Color.gray)); 
     assertFalse(r1.equals(r2)); 
     r2.setBaseItemLabelPaint(new GradientPaint(1.0f, 2.0f, Color.red, 3.0f, 4.0f, Color.gray)); 
     assertTrue(r1.equals(r2)); 
     r1.setSeriesPositiveItemLabelPosition(0, new ItemLabelPosition()); 
     assertFalse(r1.equals(r2)); 
     r2.setSeriesPositiveItemLabelPosition(0, new ItemLabelPosition()); 
     assertTrue(r1.equals(r2)); 
     r1.setBasePositiveItemLabelPosition(new ItemLabelPosition(ItemLabelAnchor.INSIDE10, TextAnchor.BASELINE_RIGHT)); 
     assertFalse(r1.equals(r2)); 
     r2.setBasePositiveItemLabelPosition(new ItemLabelPosition(ItemLabelAnchor.INSIDE10, TextAnchor.BASELINE_RIGHT)); 
     assertTrue(r1.equals(r2)); 
     r1.setSeriesNegativeItemLabelPosition(1, new ItemLabelPosition(ItemLabelAnchor.INSIDE10, TextAnchor.BASELINE_RIGHT)); 
     assertFalse(r1.equals(r2)); 
     r2.setSeriesNegativeItemLabelPosition(1, new ItemLabelPosition(ItemLabelAnchor.INSIDE10, TextAnchor.BASELINE_RIGHT)); 
     assertTrue(r1.equals(r2)); 
     r1.setBaseNegativeItemLabelPosition(new ItemLabelPosition(ItemLabelAnchor.INSIDE10, TextAnchor.BASELINE_RIGHT)); 
     assertFalse(r1.equals(r2)); 
     r2.setBaseNegativeItemLabelPosition(new ItemLabelPosition(ItemLabelAnchor.INSIDE10, TextAnchor.BASELINE_RIGHT)); 
     assertTrue(r1.equals(r2)); 
     r1.setItemLabelAnchorOffset(3.0); 
     assertFalse(r1.equals(r2)); 
     r2.setItemLabelAnchorOffset(3.0); 
     assertTrue(r1.equals(r2)); 
     r1.setSeriesCreateEntities(0, Boolean.TRUE); 
     assertFalse(r1.equals(r2)); 
     r2.setSeriesCreateEntities(0, Boolean.TRUE); 
     assertTrue(r1.equals(r2)); 
     r1.setBaseCreateEntities(false); 
     assertFalse(r1.equals(r2)); 
     r2.setBaseCreateEntities(false); 
     assertTrue(r1.equals(r2)); 
     r1.setLegendShape(0, new Ellipse2D.Double(1.0, 2.0, 3.0, 4.0)); 
     assertFalse(r1.equals(r2)); 
     r2.setLegendShape(0, new Ellipse2D.Double(1.0, 2.0, 3.0, 4.0)); 
     assertTrue(r1.equals(r2)); 
     r1.setBaseLegendShape(new Ellipse2D.Double(5.0, 6.0, 7.0, 8.0)); 
     assertFalse(r1.equals(r2)); 
     r2.setBaseLegendShape(new Ellipse2D.Double(5.0, 6.0, 7.0, 8.0)); 
     assertTrue(r1.equals(r2)); 
     r1.setLegendTextFont(0, new Font("Dialog", Font.PLAIN, 7)); 
     assertFalse(r1.equals(r2)); 
     r2.setLegendTextFont(0, new Font("Dialog", Font.PLAIN, 7)); 
     assertTrue(r1.equals(r2)); 
     r1.setBaseLegendTextFont(new Font("Dialog", Font.PLAIN, 7)); 
     assertFalse(r1.equals(r2)); 
     r2.setBaseLegendTextFont(new Font("Dialog", Font.PLAIN, 7)); 
     assertTrue(r1.equals(r2)); 
     r1.setLegendTextPaint(0, new GradientPaint(1.0f, 2.0f, Color.blue, 3.0f, 4.0f, Color.red)); 
     assertFalse(r1.equals(r2)); 
     r2.setLegendTextPaint(0, new GradientPaint(1.0f, 2.0f, Color.blue, 3.0f, 4.0f, Color.red)); 
     assertTrue(r1.equals(r2)); 
     r1.setBaseLegendTextPaint(new GradientPaint(1.0f, 2.0f, Color.blue, 3.0f, 4.0f, Color.red)); 
     assertFalse(r1.equals(r2)); 
     r2.setBaseLegendTextPaint(new GradientPaint(1.0f, 2.0f, Color.blue, 3.0f, 4.0f, Color.red)); 
     assertTrue(r1.equals(r2)); 
 } 


public void testFillPaintLookup289() { 
     BarRenderer r = new BarRenderer(); 
     assertEquals(Color.white, r.getBaseFillPaint()); 
     r.setAutoPopulateSeriesFillPaint(false); 
     assertEquals(Color.white, r.lookupSeriesFillPaint(0)); 
     assertNull(r.getSeriesFillPaint(0)); 
     r.setAutoPopulateSeriesFillPaint(true); 
     new CategoryPlot(null, new CategoryAxis("Category"), new NumberAxis("Value"), r); 
     assertEquals(DefaultDrawingSupplier.DEFAULT_FILL_PAINT_SEQUENCE[0], r.lookupSeriesFillPaint(0)); 
     assertNotNull(r.getSeriesFillPaint(0)); 
 } 


public void testOutlinePaintLookup291() { 
     BarRenderer r = new BarRenderer(); 
     assertEquals(Color.gray, r.getBaseOutlinePaint()); 
     r.setAutoPopulateSeriesOutlinePaint(false); 
     assertEquals(Color.gray, r.lookupSeriesOutlinePaint(0)); 
     assertNull(r.getSeriesOutlinePaint(0)); 
     r.setAutoPopulateSeriesOutlinePaint(true); 
     new CategoryPlot(null, new CategoryAxis("Category"), new NumberAxis("Value"), r); 
     assertEquals(DefaultDrawingSupplier.DEFAULT_OUTLINE_PAINT_SEQUENCE[0], r.lookupSeriesOutlinePaint(0)); 
     assertNotNull(r.getSeriesOutlinePaint(0)); 
 } 


public void testCloning2294() { 
     LineAndShapeRenderer r1 = new LineAndShapeRenderer(); 
     r1.setBasePaint(Color.blue); 
     r1.setBaseLegendTextPaint(new GradientPaint(1.0f, 2.0f, Color.red, 3.0f, 4.0f, Color.blue)); 
     LineAndShapeRenderer r2 = null; 
     try { 
         r2 = (LineAndShapeRenderer) r1.clone(); 
     } catch (CloneNotSupportedException e) { 
         e.printStackTrace(); 
     } 
     assertTrue(r1 != r2); 
     assertTrue(r1.getClass() == r2.getClass()); 
     assertTrue(r1.equals(r2)); 
     MyRendererChangeListener listener = new MyRendererChangeListener(); 
     r2.addChangeListener(listener); 
     r2.setBasePaint(Color.red); 
     assertTrue(listener.lastEvent.getRenderer() == r2); 
     assertFalse(r1.hasListener(listener)); 
 } 

    

    /**
     * Confirm that cloning works.
     */
    

    /**
     * A utility class for listening to changes to a renderer.
     */
    static class MyRendererChangeListener implements RendererChangeListener {

        /** The last event received. */
        public RendererChangeEvent lastEvent;

        /**
         * Creates a new instance.
         */
        public MyRendererChangeListener() {
            this.lastEvent = null;
        }
        public void rendererChanged(RendererChangeEvent event) {
            this.lastEvent = event;
        }
    }

    /**
     * A check for cloning.
     */
    

    /**
     * Tests each setter method to ensure that it sends an event notification.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.  In addition,
     * test for a bug that was reported where the listener list is 'null' after
     * deserialization.
     */
    

    /**
     * Some checks for the autoPopulate flag default values.
     */
    

    /**
     * Some checks for the paint lookup mechanism.
     */
    

    /**
     * Some checks for the fill paint lookup mechanism.
     */
    

    /**
     * Some checks for the outline paint lookup mechanism.
     */
    

    /**
     * Some checks for the hashCode() method.
     */
    

}
