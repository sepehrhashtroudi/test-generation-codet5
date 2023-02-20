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
 * -------------------------
 * MultiplePiePlotTests.java
 * -------------------------
 * (C) Copyright 2005-2009, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 16-Jun-2005 : Version 1 (DG);
 * 06-Apr-2006 : Added tests for new fields (DG);
 * 21-Jun-2007 : Removed JCommon dependencies (DG);
 * 18-Apr-2008 : Added testConstructor() (DG);
 * 30-Dec-2008 : Updated for new legendItemShape field (DG);
 * 01-Jun-2009 : Added test for getLegendItems() bug, series key is not
 *               set (DG);
 *
 */

package org.jfree.chart.plot.junit;

import java.awt.Color;
import java.awt.GradientPaint;
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

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.LegendItem;
import org.jfree.chart.LegendItemCollection;
import org.jfree.chart.event.PlotChangeEvent;
import org.jfree.chart.event.PlotChangeListener;
import org.jfree.chart.plot.MultiplePiePlot;
import org.jfree.chart.util.TableOrder;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.pie.PieDataset;

/**
 * Some tests for the {@link MultiplePiePlot} class.
 */
public class MultiplePiePlotTests extends TestCase
        implements PlotChangeListener {

    /** The last event received. */
    PlotChangeEvent lastEvent;

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(MultiplePiePlotTests.class);
    }

    /**
     * Receives a plot change event and records it.  Some tests will use this
     * to check that events have been generated (or not) when required.
     *
     * @param event  the event.
     */
    public void plotChanged(PlotChangeEvent event) {
        this.lastEvent = event;
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public MultiplePiePlotTests(String name) {
        super(name);
    }

    /**
     * Some checks for the constructors.
     */
public void testSerialization156() { 
     DefaultCategoryDataset d1 = new DefaultCategoryDataset(); 
     d1.setValue(23.4, "R1", "C1"); 
     DefaultCategoryDataset d2 = null; 
     try { 
         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); 
         ObjectOutput out = new ObjectOutputStream(buffer); 
         out.writeObject(d1); 
         out.close(); 
         ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray())); 
         d2 = (DefaultCategoryDataset) in.readObject(); 
         in.close(); 
     } catch (Exception e) { 
         e.printStackTrace(); 
     } 
     assertEquals(d1, d2); 
 }
public void testSerialization241() { 
     MultiplePiePlot p1 = new MultiplePiePlot(); 
     MultiplePiePlot p2 = null; 
     try { 
         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); 
         ObjectOutput out = new ObjectOutputStream(buffer); 
         out.writeObject(p1); 
         out.close(); 
         ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray())); 
         p2 = (MultiplePiePlot) in.readObject(); 
         in.close(); 
     } catch (Exception e) { 
         e.printStackTrace(); 
     } 
     assertEquals(p1, p2); 
 }
public void testEquals250() { 
     MultiplePiePlot plot1 = new MultiplePiePlot(); 
     MultiplePiePlot plot2 = new MultiplePiePlot(); 
     assertTrue(plot1.equals(plot2)); 
     assertTrue(plot2.equals(plot1)); 
     plot1.setAggregatedItemsPaint(new GradientPaint(1.0f, 2.0f, Color.red, 3.0f, 4.0f, Color.blue)); 
     assertFalse(plot1.equals(plot2)); 
     plot2.setAggregatedItemsPaint(new GradientPaint(1.0f, 2.0f, Color.red, 3.0f, 4.0f, Color.blue)); 
     assertTrue(plot1.equals(plot2)); 
     plot1.setAggregatedItemsPaint(new GradientPaint(1.0f, 2.0f, Color.red, 3.0f, 4.0f, Color.blue)); 
     assertFalse(plot1.equals(plot2)); 
     plot2.setAggregatedItemsPaint(new GradientPaint(1.0f, 2.0f, Color.red, 3.0f, 4.0f, Color.blue)); 
     assertTrue(plot1.equals(plot2)); 
     plot1.setDataExtractOrder(TableOrder.BY_COLUMN); 
     assertFalse(plot1.equals(plot2)); 
     plot2.setDataExtractOrder(TableOrder.BY_COLUMN); 
     assertTrue(plot1.equals(plot2)); 
     plot1.setLimit(99.0); 
     assertFalse(plot1.equals(plot2)); 
     plot2.setLimit(99.0); 
     assertTrue(plot1.equals(plot2)); 
     plot1.setAggregatedItemsKey("S1"); 
     assertFalse(plot1.equals(plot2)); 
     plot2.setAggregatedItemsKey("S1"); 
     assertTrue(plot1.equals(plot2));
}

public void testEquals252() { 
     MultiplePiePlot plot1 = new MultiplePiePlot(); 
     MultiplePiePlot plot2 = new MultiplePiePlot(); 
     assertTrue(plot1.equals(plot2)); 
     assertTrue(plot2.equals(plot1)); 
     plot1.setAggregatedItemsPaint(new GradientPaint(1.0f, 2.0f, Color.red, 3.0f, 4.0f, Color.blue)); 
     assertFalse(plot1.equals(plot2)); 
     plot2.setAggregatedItemsPaint(new GradientPaint(1.0f, 2.0f, Color.red, 3.0f, 4.0f, Color.blue)); 
     assertTrue(plot1.equals(plot2)); 
     plot1.setDataExtractOrder(TableOrder.BY_COLUMN); 
     assertFalse(plot1.equals(plot2)); 
     plot2.setDataExtractOrder(TableOrder.BY_COLUMN); 
     assertTrue(plot1.equals(plot2)); 
     plot1.setLimit(0.11); 
     assertFalse(plot1.equals(plot2)); 
     plot2.setLimit(0.11); 
     assertTrue(plot1.equals(plot2)); 
     plot1.setAggregatedItemsKey("S1"); 
     assertFalse(plot1.equals(plot2)); 
     plot2.setAggregatedItemsKey("S1"); 
     assertTrue(plot1.equals(plot2)); 
     plot1.setAggregatedItemsPaint(new GradientPaint(1.0f, 2.0f, Color.red, 3.0f, 4.0f, Color.blue)); 
     assertFalse(plot1.equals(plot2)); 
     plot2.setAggregatedItemsPaint(new GradientPaint(1.0f, 2.0f, Color.red, 3.0f, 4.0f, Color.blue)); 
     assertTrue(plot1.equals(plot2));
}

public void testCloning255() { 
     MultiplePiePlot p1 = new MultiplePiePlot(); 
     p1.setAggregatedItemsPaint(new GradientPaint(1.0f, 2.0f, Color.red, 3.0f, 4.0f, Color.blue)); 
     MultiplePiePlot p2 = null; 
     try { 
         p2 = (MultiplePiePlot) p1.clone(); 
     } catch (CloneNotSupportedException e) { 
         e.printStackTrace(); 
     } 
     assertTrue(p1 != p2); 
     assertTrue(p1.getClass() == p2.getClass()); 
     assertTrue(p1.equals(p2)); 
     p1.setAggregatedItemsPaint(new GradientPaint(1.0f, 2.0f, Color.red, 3.0f, 4.0f, Color.blue)); 
     assertFalse(p1.equals(p2)); 
     p2.setAggregatedItemsPaint(new GradientPaint(1.0f, 2.0f, Color.red, 3.0f, 4.0f, Color.blue)); 
     assertTrue(p1.equals(p2)); 
 }
    

    /**
     * Check that the equals() method distinguishes the required fields.
     */
    

    /**
     * Some basic checks for the clone() method.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

    /**
     * Fetches the legend items and checks the values.
     */
    

}
