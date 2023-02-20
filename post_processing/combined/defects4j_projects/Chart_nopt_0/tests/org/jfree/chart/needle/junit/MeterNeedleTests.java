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
 * MeterNeedleTests.java
 * ---------------------
 * (C) Copyright 2005-2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 08-Jun-2005 : Version 1 (DG);
 *
 */

package org.jfree.chart.needle.junit;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Stroke;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.chart.needle.LineNeedle;
import org.jfree.chart.needle.MeterNeedle;

/**
 * Tests for the {@link MeterNeedle} class.
 */
public class MeterNeedleTests extends TestCase {
    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(MeterNeedleTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public MeterNeedleTests(String name) {
        super(name);
    }

    /**
     * Check that the equals() method can distinguish all fields.
     */
public void testEquals1267() { MeterNeedle n1 = new LineNeedle(); MeterNeedle n2 = new LineNeedle(); assertEquals(n1, n2); assertEquals(n2, n1); n1.setOutlinePaint(new GradientPaint(1.0f, 2.0f, Color.RED, 3.0f, 4.0f, Color.BLUE)); assertFalse(n1.equals(n2)); n2.setOutlinePaint(new GradientPaint(1.0f, 2.0f, Color.RED, 3.0f, 4.0f, Color.BLUE)); assertEquals(n1, n2);
}

public void testEquals1268() { MeterNeedle n1 = new LineNeedle(); MeterNeedle n2 = new LineNeedle(); assertEquals(n1, n2); n1.setOutlinePaint(new GradientPaint(1.0f, 2.0f, Color.RED, 3.0f, 4.0f, Color.BLUE)); assertFalse(n1.equals(n2)); n2.setOutlinePaint(new GradientPaint(1.0f, 2.0f, Color.RED, 3.0f, 4.0f, Color.BLUE)); assertEquals(n1, n2); }
public void testEquals1274() { MeterNeedle n1 = new LineNeedle(); MeterNeedle n2 = new LineNeedle(); assertEquals(n1, n2); n1.setRotateX(1.0); assertFalse(n1.equals(n2)); n2.setRotateX(1.0); assertEquals(n1, n2); }
    

}
