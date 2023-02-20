/* ===========================================================
 * JFreeChart : a free chart library for the Java(tm) platform
 * ===========================================================
 *
 * (C) Copyright 2000-2007, by Object Refinery Limited and Contributors.
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
 * ------------------------------
 * DefaultKeyedValues2DTests.java
 * ------------------------------
 * (C) Copyright 2003-2007 by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 13-Mar-2003 : Version 1 (DG);
 * 15-Sep-2004 : Updated cloning test (DG);
 * 06-Oct-2005 : Added testEquals() (DG);
 * 18-Jan-2007 : Added testSparsePopulation() (DG);
 * 26-Feb-2007 : Added some basic tests (DG);
 * 30-Mar-2007 : Added a test for bug 1690654 (DG);
 * 21-Nov-2007 : Added testRemoveColumnByKey() method (DG);
 *
 */

package org.jfree.data.junit;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.data.DefaultKeyedValues2D;
import org.jfree.data.UnknownKeyException;

/**
 * Tests for the {@link DefaultKeyedValues2D} class.
 */
public class DefaultKeyedValues2DTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(DefaultKeyedValues2DTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public DefaultKeyedValues2DTests(String name) {
        super(name);
    }

    /**
     * Some checks for the getValue() method.
     */
    

    /**
     * Some checks for the clone() method.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

    /**
     * Some checks for the equals() method.
     */
    

    /**
     * Populates a data structure with sparse entries, then checks that
     * the unspecified entries return null.
     */
    

    /**
     * Some basic checks for the getRowCount() method.
     */
    

    /**
     * Some basic checks for the getColumnCount() method.
     */
    

    private static final double EPSILON = 0.0000000001;

    /**
     * Some basic checks for the getValue(int, int) method.
     */
    

    /**
     * Some basic checks for the getRowKey() method.
     */
    

    /**
     * Some basic checks for the getColumnKey() method.
     */
    

    /**
     * Some basic checks for the removeValue() method.
     */
    

    /**
     * A test for bug 1690654.
     */
    

    /**
     * Some basic checks for the removeRow() method.
     */
    

    /**
     * Some basic checks for the removeColumn(Comparable) method.
     */
    

}
