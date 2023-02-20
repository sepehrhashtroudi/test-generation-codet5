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
 * ------------------------
 * IntervalMarkerTests.java
 * ------------------------
 * (C) Copyright 2004-2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 14-Jun-2004 : Version 1 (DG);
 * 05-Sep-2006 : Added checks for MarkerChangeEvents (DG);
 *
 */

package org.jfree.chart.plot.junit;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.chart.event.MarkerChangeEvent;
import org.jfree.chart.event.MarkerChangeListener;
import org.jfree.chart.plot.IntervalMarker;
import org.jfree.chart.util.GradientPaintTransformType;
import org.jfree.chart.util.GradientPaintTransformer;
import org.jfree.chart.util.StandardGradientPaintTransformer;

/**
 * Tests for the {@link IntervalMarker} class.
 */
public class IntervalMarkerTests extends TestCase
        implements MarkerChangeListener {

    MarkerChangeEvent lastEvent;

    /**
     * Records the last event.
     *
     * @param event  the event.
     */
    public void markerChanged(MarkerChangeEvent event) {
        this.lastEvent = event;
    }

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(IntervalMarkerTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public IntervalMarkerTests(String name) {
        super(name);
    }

    /**
     * Confirm that the equals method can distinguish all the required fields.
     */
public void testIntervalMarker1217() { IntervalMarker m1 = new IntervalMarker(10.0, 20.0); assertEquals(10.0, m1.getStartValue(), 0.001); assertEquals(20.0, m1.getEndValue(), 0.001); }
public void testGetEndValue1220() { IntervalMarker m1 = new IntervalMarker(1.0, 2.0); assertEquals(3.0, m1.getEndValue(), EPSILON); }
public void testConstructor1221() { IntervalMarker m1 = new IntervalMarker(10.0, 20.0); assertEquals(10.0, m1.getStartValue(), EPSILON); assertEquals(20.0, m1.getEndValue(), EPSILON); }
public void testNotifyListeners1227() { IntervalMarker m1 = new IntervalMarker(1.0, 2.0); m1.notifyListeners(new MarkerChangeEvent(m1)); assertEquals(1.0, m1.getStartValue(), EPSILON); assertEquals(2.0, m1.getEndValue(), EPSILON); m1.setGradientPaintTransformer(null); m1.notifyListeners(new MarkerChangeEvent(m1)); assertEquals(1.0, m1.getStartValue(), EPSILON); assertEquals(2.0, m1.getEndValue(), EPSILON); }
public void testEquals1228() { IntervalMarker m1 = new IntervalMarker(45.0, 50.0); IntervalMarker m2 = new IntervalMarker(45.0, 50.0); assertEquals(m1, m2); assertEquals(m2, m1); m1 = new IntervalMarker(45.0, 50.0); assertFalse(m1.equals(m2)); m2 = new IntervalMarker(45.0, 50.0); assertEquals(m1, m2); }
    

    /**
     * Confirm that cloning works.
     */
    

   /**
     * Serialize an instance, restore it, and check for equality.
     */
    

    private static final double EPSILON = 0.0000000001;

    /**
     * Some checks for the getStartValue() and setStartValue() methods.
     */
    

    /**
     * Some checks for the getEndValue() and setEndValue() methods.
     */
    
}
