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
 * XIntervalSeriesCollectionTests.java
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
import org.jfree.data.xy.XIntervalSeries;
import org.jfree.data.xy.XIntervalSeriesCollection;

/**
 * Tests for the {@link XIntervalSeriesCollection} class.
 */
public class XIntervalSeriesCollectionTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(XIntervalSeriesCollectionTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public XIntervalSeriesCollectionTests(String name) {
        super(name);
    }

    /**
     * Confirm that the equals method can distinguish all the required fields.
     */
public void testAddSeries1765() { XIntervalSeriesCollection seriesCollection = new XIntervalSeriesCollection(); seriesCollection.addSeries(new XIntervalSeries("Series 1", true, false)); seriesCollection.addSeries(new XIntervalSeries("Series 2", true, false)); seriesCollection.addSeries(new XIntervalSeries("Series 3", true, false)); seriesCollection.addSeries(new XIntervalSeries("Series 4", true, false)); seriesCollection.addSeries(new XIntervalSeries("Series 5", true, false)); seriesCollection.addSeries(new XIntervalSeries("Series 6", true, false)); seriesCollection.addSeries(new XIntervalSeries("Series 7", true, false));
}

public void testGetSeriesCount1767() { System.out.println("getSeriesCount"); XIntervalSeriesCollection instance = new XIntervalSeriesCollection(); assertEquals(0, instance.getSeriesCount()); instance.addSeries(new XIntervalSeries("Series 1", true, false)); assertEquals(1, instance.getSeriesCount()); instance.addSeries(new XIntervalSeries("Series 2", true, false)); assertEquals(2, instance.getSeriesCount()); instance.addSeries(new XIntervalSeries("Series 3", true, false)); assertEquals(3, instance.getSeriesCount()); }
public void testGetSeriesCount1768() { XIntervalSeriesCollection xIntervalSeriesCollection = new XIntervalSeriesCollection(); xIntervalSeriesCollection.addSeries(new XIntervalSeries("Series 1", true, false)); xIntervalSeriesCollection.addSeries(new XIntervalSeries("Series 2", true, false)); xIntervalSeriesCollection.addSeries(new XIntervalSeries("Series 3", true, false)); assertEquals(3, xIntervalSeriesCollection.getSeriesCount()); }
public void testRemoveSeries1769() { XIntervalSeriesCollection seriesCollection = new XIntervalSeriesCollection(); seriesCollection.addSeries(new XIntervalSeries("Series 1", true, false)); seriesCollection.addSeries(new XIntervalSeries("Series 2", true, false)); seriesCollection.addSeries(new XIntervalSeries("Series 3", true, false)); seriesCollection.addSeries(new XIntervalSeries("Series 4", true, false)); seriesCollection.addSeries(new XIntervalSeries("Series 5", true, false)); seriesCollection.addSeries(new XIntervalSeries("Series 6", true, false)); seriesCollection.addSeries(new XIntervalSeries("Series 7", true, false));
}

public void testClone1776() throws CloneNotSupportedException { XIntervalSeriesCollection c1 = new XIntervalSeriesCollection(); XIntervalSeriesCollection c2 = (XIntervalSeriesCollection) c1.clone(); assertEquals(c1, c2); }
public void testAdd4432() { XIntervalSeries s1 = new XIntervalSeries("s1"); s1.add(1.0, 1.0, 1.0, 2.0); s1.add(2.0, 2.0, 2.0, 3.0); s1.add(3.0, 3.0, 3.0, 4.0); s1.add(4.0, 4.0, 4.0, 5.0); s1.add(5.0, 5.0, 5.0, 6.0); s1.add(6.0, 6.0, 6.0, 7.0);
}

    

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
