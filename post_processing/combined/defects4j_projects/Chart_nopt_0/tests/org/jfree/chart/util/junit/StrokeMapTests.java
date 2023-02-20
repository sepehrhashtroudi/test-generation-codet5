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
 * -------------------
 * StrokeMapTests.java
 * -------------------
 * (C) Copyright 2006-2008, by Object Refinery Limited.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes:
 * --------
 * 27-Sep-2006 : Version 1 (DG);
 *
 */

package org.jfree.chart.util.junit;

import java.awt.BasicStroke;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.chart.util.StrokeMap;

/**
 * Some tests for the {@link StrokeMap} class.
 */
public class StrokeMapTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(StrokeMapTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public StrokeMapTests(String name) {
        super(name);
    }

    /**
     * Some checks for the getStroke() method.
     */
public void testStrokeMap2118() { StrokeMap m1 = new StrokeMap(); m1.put("A", new BasicStroke(1.0f)); m1.put("B", new BasicStroke(2.0f)); m1.put("C", new BasicStroke(3.0f)); assertEquals(new BasicStroke(1.0f), m1.getStroke("A")); assertEquals(new BasicStroke(2.0f), m1.getStroke("B")); assertEquals(new BasicStroke(3.0f), m1.getStroke("C")); }
public void testGetStroke2123() { StrokeMap m = new StrokeMap(); m.put("A", new BasicStroke(1.1f)); m.put("B", new BasicStroke(2.2f)); assertEquals(new BasicStroke(1.1f), m.getStroke("A")); assertEquals(new BasicStroke(2.2f), m.getStroke("B")); try { m.getStroke(null); fail("IllegalArgumentException should have been thrown on null key"); } catch (IllegalArgumentException e) { } try { m.getStroke(""); fail("IllegalArgumentException should have been thrown on null key"); } catch (IllegalArgumentException e) { } }
    

    /**
     * Some checks for the put() method.
     */
    

    /**
     * Some checks for the equals() method.
     */
    

    /**
     * Some checks for cloning.
     */
    

    /**
     * A check for serialization.
     */
    

    /**
     * A check for serialization.
     */
    

}

