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
 * ---------------------
 * ValueMarkerTests.java
 * ---------------------
 * (C) Copyright 2003-2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 18-Aug-2003 : Version 1 (DG);
 * 14-Jun-2004 : Renamed MarkerTests --> ValueMarkerTests (DG);
 * 01-Jun-2005 : Strengthened equals() test (DG);
 * 05-Sep-2006 : Added checks for MarkerChangeEvent generation (DG);
 * 20-Jun-2007 : Removed JCommon dependencies (DG);
 * 26-Sep-2007 : Added test1802195() method (DG);
 * 08-Oct-2007 : Added test1808376() method (DG);
 *
 */

package org.jfree.chart.plot.junit;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Stroke;
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
import org.jfree.chart.plot.Marker;
import org.jfree.chart.plot.ValueMarker;
import org.jfree.chart.text.TextAnchor;
import org.jfree.chart.util.LengthAdjustmentType;
import org.jfree.chart.util.RectangleAnchor;
import org.jfree.chart.util.RectangleInsets;

/**
 * Tests for the {@link ValueMarker} class.
 */
public class ValueMarkerTests
    extends TestCase
    implements MarkerChangeListener {


    MarkerChangeEvent lastEvent;

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(ValueMarkerTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public ValueMarkerTests(String name) {
        super(name);
    }

    /**
     * Confirm that the equals method can distinguish all the required fields.
     */
public void test() { Stroke stroke = new BasicStroke(1.5f); Stroke outlineStroke = new BasicStroke(2.0f); ValueMarker m1 = new ValueMarker(25.0, Color.RED, stroke, Color.BLUE, outlineStroke, 1.0f); assertEquals(25.0, m1.getValue(), 0.001); }
public void testValueMarker4776() { Stroke stroke = new BasicStroke(1.5f); ValueMarker m = new ValueMarker(25.0, Color.RED, stroke); assertEquals(25.0, m.getValue(), 0.001); }
public void testSetValue4777() { ValueMarker m1 = new ValueMarker(25.0); assertEquals(25.0, m1.getValue(), EPSILON); m1.setValue(50.0); assertEquals(50.0, m1.getValue(), EPSILON); m1.setValue(50.0); assertEquals(50.0, m1.getValue(), EPSILON); }
public void testSetValue4778() { ValueMarker m1 = new ValueMarker(25.0); assertEquals(25.0, m1.getValue(), EPSILON); m1.setValue(50.0); assertEquals(50.0, m1.getValue(), EPSILON); }
public void testEquals4780() { ValueMarker m1 = new ValueMarker(1.0); ValueMarker m2 = new ValueMarker(1.0); assertEquals(m1, m2); assertEquals(m2, m1); }
public void testEquals4781() { ValueMarker m1 = new ValueMarker(25.0); ValueMarker m2 = new ValueMarker(25.0); assertEquals(m1, m2); assertEquals(m2, m1); }
public void testEquals4782() { ValueMarker m1 = new ValueMarker(1.0); ValueMarker m2 = new ValueMarker(1.0); assertEquals(m1, m2); assertEquals(m2, m1); m1.setValue(2.0); assertFalse(m1.equals(m2)); m2.setValue(2.0); assertEquals(m1, m2); }
public void testEquals4783() { ValueMarker m1 = new ValueMarker(1.0); ValueMarker m2 = new ValueMarker(1.0); assertEquals(m1, m2); m1.setValue(2.0); assertFalse(m1.equals(m2)); m2.setValue(2.0); assertEquals(m1, m2); m1.setValue(3.0); assertFalse(m1.equals(m2)); m2.setValue(3.0); assertEquals(m1, m2); }
public void testEquals4784() { ValueMarker m1 = new ValueMarker(25.0); ValueMarker m2 = new ValueMarker(25.0); assertEquals(m1, m2); assertEquals(m2, m1); m1.setValue(50.0); assertFalse(m1.equals(m2)); m2.setValue(50.0); assertEquals(m1, m2); }
    

    /**
     * Confirm that cloning works.
     */
    

   /**
     * Serialize an instance, restore it, and check for equality.
     */
    

    private static final double EPSILON = 0.000000001;

    /**
     * Some checks for the getValue() and setValue() methods.
     */
    

    /**
     * Records the last event.
     *
     * @param event  the event.
     */
    public void markerChanged(MarkerChangeEvent event) {
        this.lastEvent = event;
    }

    /**
     * A test for bug 1802195.
     */
    

    /**
     * A test for bug report 1808376.
     */
    

}
