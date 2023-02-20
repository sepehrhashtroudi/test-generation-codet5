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
public void testEquals1075() { MultiplePiePlot p1 = new MultiplePiePlot(); MultiplePiePlot p2 = new MultiplePiePlot(); assertEquals(p1, p2); assertEquals(p2, p1); p1.setDataExtractOrder(TableOrder.BY_COLUMN); assertFalse(p1.equals(p2)); p2.setDataExtractOrder(TableOrder.BY_COLUMN); assertEquals(p1, p2); p1.setLimit(0.5); assertFalse(p1.equals(p2)); p2.setLimit(0.5); assertEquals(p1, p2); }
    

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
