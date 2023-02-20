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
 * ----------------------------
 * XYSeriesCollectionTests.java
 * ----------------------------
 * (C) Copyright 2003-2009, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 18-May-2003 : Version 1 (DG);
 * 27-Nov-2006 : Updated testCloning() (DG);
 * 08-Mar-2007 : Added testGetSeries() and testRemoveSeries() (DG);
 * 08-May-2007 : Added testIndexOf() (DG);
 * 03-Dec-2007 : Added testGetSeriesByKey() (DG);
 * 22-Apr-2008 : Added testPublicCloneable (DG);
 * 06-Mar-2009 : Added testGetDomainBounds (DG);
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
import org.jfree.data.Range;
import org.jfree.data.UnknownKeyException;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 * Tests for the {@link XYSeriesCollection} class.
 */
public class XYSeriesCollectionTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(XYSeriesCollectionTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public XYSeriesCollectionTests(String name) {
        super(name);
    }

    private static final double EPSILON = 0.0000000001;

    /**
     * Some checks for the constructor.
     */
public void testCloning1646() throws CloneNotSupportedException { XYSeries s1 = new XYSeries("S1"); s1.add(1.0, 1.1); XYSeries s2 = (XYSeries) s1.clone(); assertNotSame(s1, s2); assertSame(s1.getClass(), s2.getClass()); assertEquals(s1, s2); }
public void testEquals6632() { XYSeries s1 = new XYSeries("Series 1", true, false); s1.add(1.0, 1.1); XYSeriesCollection c1 = new XYSeriesCollection(); c1.addSeries(s1); XYSeriesCollection c2 = new XYSeriesCollection(); c2.addSeries(s1); assertEquals(c1, c2); XYSeries s2 = new XYSeries("Series 2", true, false); s2.add(1.0, 1.1); c2.addSeries(s2); assertEquals(c1, c2); }
public void testClone6634() throws CloneNotSupportedException { XYSeries s1 = new XYSeries("S1"); s1.add(1.0, 1.1); XYSeries s2 = new XYSeries("S2"); s2.add(1.0, 1.1); XYSeriesCollection c1 = new XYSeriesCollection(); c1.addSeries(s1); XYSeriesCollection c2 = (XYSeriesCollection) c1.clone(); assertEquals(c1, c2); }
public void testGetRangeBounds6646() { XYSeriesCollection dataset = new XYSeriesCollection(); Range r = dataset.getRangeBounds(false); assertNull(r); dataset.addSeries(new XYSeries("s1")); r = dataset.getRangeBounds(false); assertNull(r); dataset.addSeries(new XYSeries("s2")); r = dataset.getRangeBounds(false); assertNull(r); dataset.addSeries(new XYSeries("s3")); r = dataset.getRangeBounds(false); assertNull(r); dataset.addSeries(new XYSeries("s4")); r = dataset.getRangeBounds(false); assertNull(r);
}

    

    /**
     * Confirm that the equals method can distinguish all the required fields.
     */
    

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
     * A test for bug report 1170825.
     */
    

    /**
     * Some basic checks for the getSeries() method.
     */
    

    /**
     * Some checks for the getSeries(Comparable) method.
     */
    

    /**
     * Some basic checks for the removeSeries() method.
     */
    

    /**
     * Some tests for the indexOf() method.
     */
    

    /**
     * Some checks for the getDomainBounds() method.
     */
    

    /**
     * Some checks for the getRangeBounds() method.
     */
    

}
