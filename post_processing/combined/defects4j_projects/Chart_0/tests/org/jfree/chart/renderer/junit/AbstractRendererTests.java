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
public void testPaintLookup501() { 
     BarRenderer r = new BarRenderer(); 
     assertEquals(Color.blue, r.getBasePaint()); 
     r.setAutoPopulateSeriesPaint(false); 
     assertEquals(Color.blue, r.lookupSeriesPaint(0)); 
     assertNull(r.getSeriesPaint(0)); 
     r.setAutoPopulateSeriesPaint(true); 
     new CategoryPlot(null, new CategoryAxis("Category"), new NumberAxis("Value"), r); 
     assertEquals(DefaultDrawingSupplier.DEFAULT_PAINT_SEQUENCE[0], r.lookupSeriesPaint(0)); 
     assertNotNull(r.getSeriesPaint(0)); 
 }
public void testPaintLookup503() { 
     BarRenderer r = new BarRenderer(); 
     assertEquals(Color.blue, r.getBasePaint()); 
     r.setAutoPopulateSeriesPaint(false); 
     assertEquals(Color.blue, r.lookupSeriesOutlinePaint(0)); 
     assertNull(r.getSeriesOutlinePaint(0)); 
     r.setAutoPopulateSeriesPaint(true); 
     new CategoryPlot(null, new CategoryAxis("Category"), new NumberAxis("Value"), r); 
     assertEquals(DefaultDrawingSupplier.DEFAULT_PAINT_SEQUENCE[0], r.lookupSeriesOutlinePaint(0)); 
     assertNotNull(r.getSeriesOutlinePaint(0)); 
 }
public void testEquals505() { 
     BarRenderer r1 = new BarRenderer(); 
     BarRenderer r2 = new BarRenderer(); 
     assertTrue(r1.equals(r2)); 
     assertTrue(r2.equals(r1)); 
     r1.setBaseSeriesVisible(true); 
     assertFalse(r1.equals(r2)); 
     r2.setBaseSeriesVisible(true); 
     assertTrue(r1.equals(r2)); 
     r1.setSeriesVisible(1, Boolean.FALSE); 
     assertFalse(r1.equals(r2)); 
     r2.setSeriesVisible(1, Boolean.FALSE); 
     assertTrue(r1.equals(r2)); 
     r1.setBaseSeriesVisible(false); 
     assertFalse(r1.equals(r2)); 
     r2.setBaseSeriesVisible(false); 
     assertTrue(r1.equals(r2)); 
     r1.setSeriesVisibleInLegend(1, Boolean.FALSE); 
     assertFalse(r1.equals(r2)); 
     r2.setSeriesVisibleInLegend(1, Boolean.FALSE); 
     assertTrue(r1.equals(r2)); 
     r1.setBaseSeriesVisibleInLegend(false); 
     assertFalse(r1.equals(r2)); 
     r2.setBaseSeriesVisibleInLegend(false); 
     assertTrue(r1.equals(r2)); 
     r1.setSeriesPaint(0, new GradientPaint(1.0f, 2.0f, Color.RED, 3.0f, 4.0f, Color.BLUE)); 
     assertFalse(r1.equals(r2)); 
     r2.setSeriesPaint(0, new GradientPaint(1.0f, 2.0f, Color.RED, 3.0f, 4.0f, Color.BLUE)); 
     assertTrue(r1.equals(r2));
}

public void testSerialization509() { 
     BarRenderer r1 = new BarRenderer(); 
     r1.setBaseLegendTextFont(new Font("Dialog", Font.PLAIN, 4)); 
     r1.setBaseLegendTextPaint(new GradientPaint(1.0f, 2.0f, Color.red, 3.0f, 4.0f, Color.green)); 
     r1.setBaseLegendShape(new Line2D.Double(1.0, 2.0, 3.0, 4.0)); 
     BarRenderer r2 = null; 
     try { 
         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); 
         ObjectOutput out = new ObjectOutputStream(buffer); 
         out.writeObject(r1); 
         out.close(); 
         ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray())); 
         r2 = (BarRenderer) in.readObject(); 
         in.close(); 
     } catch (Exception e) { 
         e.printStackTrace(); 
     } 
     assertEquals(r1, r2); 
     try { 
         r2.notifyListeners(new RendererChangeEvent(r2)); 
     } catch (NullPointerException e) { 
         assertTrue(false); 
     } 
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
