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
 * --------------
 * AxisTests.java
 * --------------
 * (C) Copyright 2003-2009, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 13-Aug-2003 : Version 1 (DG);
 * 06-Jan-2004 : Added tests for axis line attributes (DG);
 * 07-Jan-2005 : Added hashCode() test (DG);
 * 20-Jun-2007 : Removed JCommon dependencies (DG);
 * 25-Sep-2008 : Extended equals() to cover new fields (DG);
 *
 */

package org.jfree.chart.axis.junit;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.chart.axis.Axis;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.util.RectangleInsets;

/**
 * Tests for the {@link Axis} class.
 */
public class AxisTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(AxisTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public AxisTests(String name) {
        super(name);
    }

    /**
     * Confirm that cloning works.
     */
public void testSetVisible6769() { Axis a1 = new CategoryAxis("Test"); a1.setVisible(false); assertFalse(a1.isVisible()); a1.setVisible(true); assertTrue(a1.isVisible()); a1.setVisible(false); assertFalse(a1.isVisible()); a1.setVisible(true); assertTrue(a1.isVisible()); }
public void testSetVisible6770() { Axis a1 = new CategoryAxis("Test"); assertFalse(a1.isVisible()); a1.setVisible(true); assertTrue(a1.isVisible()); a1.setVisible(false); assertFalse(a1.isVisible()); a1.setVisible(true); assertTrue(a1.isVisible()); a1.setVisible(false); assertFalse(a1.isVisible()); a1.setVisible(true); assertTrue(a1.isVisible()); }
public void testSetVisible6771() { Axis a1 = new CategoryAxis("Test"); assertFalse(a1.isVisible()); a1.setVisible(true); assertTrue(a1.isVisible()); a1.setVisible(false); assertFalse(a1.isVisible()); a1.setVisible(false); assertFalse(a1.isVisible()); a1.setVisible(true); assertTrue(a1.isVisible()); a1.setVisible(false); assertFalse(a1.isVisible()); a1.setVisible(true); assertTrue(a1.isVisible()); }
public void testSetLabelInsets6786() { Axis a = new CategoryAxis("Test"); RectangleInsets expected = new RectangleInsets(0.0, 0.0, 50.0, 50.0); a.setLabelInsets(expected); assertEquals(expected, a.getLabelInsets()); a.setLabelInsets(null); assertEquals(expected, a.getLabelInsets()); try { a.setLabelInsets(new RectangleInsets(0.0, 0.0, 50.0, 50.0)); fail("Expected IllegalArgumentException"); } catch (IllegalArgumentException e) { } }
public void testSetLabelInsets6787() { Axis a1 = new CategoryAxis("Test"); RectangleInsets expected1 = new RectangleInsets(0.0, 0.0, 50.0, 50.0); RectangleInsets expected2 = new RectangleInsets(0.0, 0.0, 50.0, 50.0); a1.setLabelInsets(expected1); a1.setLabelInsets(expected2); assertEquals(expected1, a1.getLabelInsets()); assertEquals(expected2, a1.getLabelInsets()); }
public void testAxisLinePaint6803() { Axis axis = new CategoryAxis("Test"); axis.setAxisLinePaint(new GradientPaint(1.0f, 2.0f, Color.RED, 3.0f, 4.0f, Color.BLUE)); }
public void testSetTickLabelsVisible6811() { Axis a = new CategoryAxis("Test"); a.setTickLabelsVisible(true); assertTrue(a.isTickLabelsVisible()); a.setTickLabelsVisible(false); assertFalse(a.isTickLabelsVisible()); a.setTickLabelsVisible(true); assertTrue(a.isTickLabelsVisible()); }
public void testTickLabelsVisible6812() { Axis a1 = new CategoryAxis("Test"); assertFalse(a1.isTickLabelsVisible()); a1.setTickLabelsVisible(true); assertTrue(a1.isTickLabelsVisible()); Axis a2 = new CategoryAxis("Test"); assertFalse(a2.isTickLabelsVisible()); a2.setTickLabelsVisible(false); assertFalse(a2.isTickLabelsVisible()); }
public void testTickLabelsVisible6813() { Axis p = new CategoryAxis("Test"); p.setTickLabelsVisible(true); assertTrue(p.isTickLabelsVisible()); p.setTickLabelsVisible(false); assertFalse(p.isTickLabelsVisible()); p.setTickLabelsVisible(true); assertTrue(p.isTickLabelsVisible()); }
public void testSetMinorTickMarksVisible6815() { Axis a = new CategoryAxis("Test"); a.setMinorTickMarksVisible(true); assertTrue(a.isMinorTickMarksVisible()); a.setMinorTickMarksVisible(false); assertFalse(a.isMinorTickMarksVisible()); }
public void testSetTickLabelFont6823() { Axis axis = new CategoryAxis("Test"); axis.setTickLabelFont(new Font("Serif", Font.PLAIN, 10)); assertEquals(new Font("Serif", Font.PLAIN, 10), axis.getTickLabelFont()); axis.setTickLabelFont(new Font("Serif", Font.PLAIN, 10)); assertEquals(new Font("Serif", Font.PLAIN, 10), axis.getTickLabelFont()); }
public void testSetTickLabelInsets6829() { Axis a = new CategoryAxis("Test"); RectangleInsets expected = new RectangleInsets(0.0, 0.0, 50.0, 50.0); a.setTickLabelInsets(expected); assertEquals(expected, a.getTickLabelInsets()); }
public void testSetTickLabelInsets6830() { Axis a = new CategoryAxis("Test"); RectangleInsets expected = new RectangleInsets(0.0, 0.0, 50.0, 50.0); a.setTickLabelInsets(expected); assertEquals(expected, a.getTickLabelInsets()); a.setTickLabelInsets(null); assertEquals(expected, a.getTickLabelInsets()); try { a.setTickLabelInsets(new RectangleInsets(0.0, 0.0, 50.0, 50.0)); fail("Expected IllegalArgumentException"); } catch (IllegalArgumentException e) { } }
public void testTickLabelInsets6831() { Axis axis = new CategoryAxis("Test"); axis.setTickLabelInsets(new RectangleInsets(0.0, 0.0, 50.0, 50.0)); assertEquals(new RectangleInsets(0.0, 0.0, 50.0, 50.0), axis.getTickLabelInsets()); axis.setTickLabelInsets(new RectangleInsets(0.0, 0.0, 50.0, 50.0)); assertEquals(new RectangleInsets(0.0, 0.0, 50.0, 50.0), axis.getTickLabelInsets()); }
public void testFireChangeEvent6833() { Axis axis = new CategoryAxis("Test"); axis.setTickLabelInsets(new RectangleInsets(0.0, 0.0, 50.0, 50.0)); assertEquals(new RectangleInsets(0.0, 0.0, 50.0, 50.0), axis.getTickLabelInsets()); axis.setTickLabelInsets(new RectangleInsets(0.0, 0.0, 50.0, 50.0)); assertEquals(new RectangleInsets(0.0, 0.0, 50.0, 50.0), axis.getTickLabelInsets()); }
public void testSetTickMarksVisible6834() { Axis a = new CategoryAxis("Test"); a.setTickMarksVisible(true); assertTrue(a.isTickMarksVisible()); a.setTickMarksVisible(false); assertFalse(a.isTickMarksVisible()); }
public void testTickMarksVisible6835() { Axis a1 = new CategoryAxis("Test"); assertFalse(a1.isTickMarksVisible()); a1.setTickMarksVisible(true); assertTrue(a1.isTickMarksVisible()); Axis a2 = new CategoryAxis("Test"); assertFalse(a2.isTickMarksVisible()); a2.setTickMarksVisible(false); assertFalse(a2.isTickMarksVisible()); }
public void testTickMarksVisible6836() { Axis a1 = new CategoryAxis("Test"); a1.setTickMarksVisible(true); Axis a2 = new CategoryAxis("Test"); a2.setTickMarksVisible(true); }
    

    /**
     * Confirm that the equals method can distinguish all the required fields.
     */
    

    /**
     * Two objects that are equal are required to return the same hashCode.
     */
    

}
