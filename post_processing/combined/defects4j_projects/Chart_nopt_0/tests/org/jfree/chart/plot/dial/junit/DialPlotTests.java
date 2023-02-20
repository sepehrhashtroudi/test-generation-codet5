/* ===========================================================
 * JFreeChart : a free chart library for the Java(tm) platform
 * ===========================================================
 *
 * (C) Copyright 2000-2008, by Object Refinery Limited and Contributors.
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
 * ------------------
 * DialPlotTests.java
 * ------------------
 * (C) Copyright 2006-2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 03-Nov-2006 : Version 1 (DG);
 *
 */

package org.jfree.chart.plot.dial.junit;

import java.awt.Color;
import java.awt.GradientPaint;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.chart.event.PlotChangeEvent;
import org.jfree.chart.event.PlotChangeListener;
import org.jfree.chart.plot.dial.ArcDialFrame;
import org.jfree.chart.plot.dial.DialBackground;
import org.jfree.chart.plot.dial.DialCap;
import org.jfree.chart.plot.dial.DialPlot;
import org.jfree.chart.plot.dial.StandardDialFrame;
import org.jfree.chart.plot.dial.StandardDialScale;

/**
 * Tests for the {@link DialPlot} class.
 */
public class DialPlotTests extends TestCase implements PlotChangeListener {

    /** The last plot change event received. */
    private PlotChangeEvent lastEvent;

    /**
     * Records the last plot change event received.
     *
     * @param event  the event.
     */
    public void plotChanged(PlotChangeEvent event) {
        this.lastEvent = event;
    }


    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(DialPlotTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public DialPlotTests(String name) {
        super(name);
    }

    /**
     * Confirm that the equals method can distinguish all the required fields.
     */
public void testEquals3545() { DialPlot p1 = new DialPlot(); DialPlot p2 = new DialPlot(); p1.setBackground(new DialBackground(Color.RED)); assertEquals(p1, p2); p1.setBackground(new DialBackground(Color.BLUE)); assertFalse(p1.equals(p2)); p2.setBackground(new DialBackground(Color.RED)); assertEquals(p1, p2); p1.setBackground(new DialBackground(Color.BLUE)); assertFalse(p1.equals(p2)); p2.setBackground(new DialBackground(Color.BLUE)); assertEquals(p1, p2);
}

    

    /**
     * Two objects that are equal are required to return the same hashCode.
     */
    

    /**
     * Confirm that cloning works.
     */
    


    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

    /**
     * Check the notification event mechanism for the dial background.
     */
    

    /**
     * Check the notification event mechanism for the dial cap.
     */
    

    /**
     * Check the notification event mechanism for the dial frame.
     */
    

    /**
     * Check the notification event mechanism for the dial scales.
     */
    

    /**
     * Check the notification event mechanism for a layer.
     */
    

}
