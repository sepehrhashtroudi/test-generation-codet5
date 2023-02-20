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
 * -----------------------------------
 * YIntervalSeriesCollectionTests.java
 * -----------------------------------
 * (C) Copyright 2006-2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 20-Oct-2006 : Version 1 (DG);
 * 18-Jan-2008 : Added testRemoveSeries() (DG);
 * 22-Apr-2008 : Added testPublicCloneable (DG);
 *
 */

package org.jfree.data.xy.junit;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.chart.util.PublicCloneable;
import org.jfree.data.xy.YIntervalSeries;
import org.jfree.data.xy.YIntervalSeriesCollection;

/**
 * Tests for the {@link YIntervalSeriesCollection} class.
 */
public class YIntervalSeriesCollectionTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(YIntervalSeriesCollectionTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public YIntervalSeriesCollectionTests(String name) {
        super(name);
    }

    /**
     * Confirm that the equals method can distinguish all the required fields.
     */
public void testDeepClone5629() throws CloneNotSupportedException { final Object obj1 = new Object(); final Object obj2 = new Object(); final Object obj3 = new Object(); final Object obj4 = new Object(); final Object obj5 = new Object(); final Object obj6 = new Object(); final Object obj7 = new Object(); final Object obj8 = new Object(); final Object obj9 = new Object(); final Object obj10 = new Object(); final Object obj11 = new Object(); final Object obj12 = new Object(); final Object obj13 = new Object(); final Object obj14 = new Object(); final Object obj15 = new Object(); final Object obj16 = new Object(); final Object obj17 = new Object();
}

public void testEquals5738() { YIntervalSeriesCollection c1 = new YIntervalSeriesCollection(); YIntervalSeriesCollection c2 = new YIntervalSeriesCollection(); c1.addSeries(new YIntervalSeries("Series 1", true, false)); c1.addSeries(new YIntervalSeries("Series 2", true, false)); c2.addSeries(new YIntervalSeries("Series 1", true, false)); c2.addSeries(new YIntervalSeries("Series 2", true, false)); assertEquals(c1, c2); assertEquals(c2, c1); }
    

    /**
     * Confirm that cloning works.
     */
    

    /**
     * Verify that this class implements {@link PublicCloneable}.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

    /**
     * Some basic checks for the removeSeries() method.
     */
    

    /**
     * A test for bug report 1170825 (originally affected XYSeriesCollection,
     * this test is just copied over).
     */
    

}
