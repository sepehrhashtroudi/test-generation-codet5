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
 * DefaultKeyedValuesTests.java
 * ----------------------------
 * (C) Copyright 2003-2009, by Object Refinery Limited.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 05-Mar-2003 : Version 1 (DG);
 * 27-Aug-2003 : Moved SortOrder from org.jfree.data --> org.jfree.util (DG);
 * 31-Jul-2006 : Added test for new clear() method (DG);
 * 01-Aug-2006 : Extended testGetIndex() method (DG);
 * 30-Apr-2007 : Added some new tests (DG);
 * 03-Oct-2007 : Updated testRemoveValue() (DG);
 * 21-Nov-2007 : Added testGetIndex2() method (DG);
 *
 */

package org.jfree.data.junit;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.List;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.chart.util.SortOrder;
import org.jfree.data.DefaultKeyedValues;
import org.jfree.data.UnknownKeyException;

/**
 * Tests for the {@link DefaultKeyedValues} class.
 */
public class DefaultKeyedValuesTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(DefaultKeyedValuesTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public DefaultKeyedValuesTests(String name) {
        super(name);
    }

    /**
     * Common test setup.
     */
    protected void setUp() {
        // no setup required
    }

    /**
     * Checks that a new instance is empty.
     */
public void testUnknownKeyException4024() { UnknownKeyException k1 = new UnknownKeyException("K1"); UnknownKeyException k2 = new UnknownKeyException("K2"); UnknownKeyException k3 = new UnknownKeyException("K3"); UnknownKeyException k4 = new UnknownKeyException("K4"); assertEquals("K1", k1.getMessage()); assertEquals("K2", k2.getMessage()); assertEquals("K3", k3.getMessage()); assertEquals("K4", k4.getMessage()); }
public void testGetKeys7527() { DefaultKeyedValues cv = new DefaultKeyedValues(); cv.addValue("A", 1.0); cv.addValue("B", 2.0); cv.addValue("C", 3.0); cv.addValue("D", 4.0); cv.addValue("E", 5.0); List keys = cv.getKeys(); assertEquals(3, keys.size()); assertEquals("A", keys.get(0)); assertEquals("B", keys.get(1)); assertEquals("C", keys.get(2)); assertEquals("D", keys.get(3)); assertEquals("E", keys.get(4));
}

    

    /**
     * Some checks for the getItemCount() method.
     */
    

    /**
     * Some checks for the getKeys() method.
     */
    

    /**
     * A simple test for the clear() method.
     */
    

    /**
     * Some checks for the getValue() methods.
     */
    

    /**
     * Some checks for the getKey() methods.
     */
    

    /**
     * Some checks for the getIndex() methods.
     */
    

    /**
     * Another check for the getIndex(Comparable) method.
     */
    

    /**
     * Some checks for the addValue() method.
     */
    

    /**
     * Some checks for the insertValue() method.
     */
    

    /**
     * Some checks for the clone() method.
     */
    

    /**
     * Check that inserting and retrieving values works as expected.
     */
    

    /**
     * Some tests for the removeValue() method.
     */
    

    /**
     * Tests sorting of data by key (ascending).
     */
    

    /**
     * Tests sorting of data by key (descending).
     */
    

    /**
     * Tests sorting of data by value (ascending).
     */
    

    /**
     * Tests sorting of data by key (descending).
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

}
