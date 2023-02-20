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
 * --------------------------------
 * ComparableObjectSeriesTests.java
 * --------------------------------
 * (C) Copyright 2006-2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 20-Oct-2006 : Version 1 (DG);
 * 31-Oct-2007 : New hashCode() test (DG);
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

import org.jfree.data.ComparableObjectItem;
import org.jfree.data.ComparableObjectSeries;

/**
 * Tests for the {@link ComparableObjectSeries} class.
 */
public class ComparableObjectSeriesTests extends TestCase {

    static class MyComparableObjectSeries extends ComparableObjectSeries {
        /**
         * Creates a new instance.
         *
         * @param key  the series key.
         */
        public MyComparableObjectSeries(Comparable key) {
            super(key);
        }
        /**
         * Creates a new instance.
         *
         * @param key  the series key.
         * @param autoSort  automatically sort by x-value?
         * @param allowDuplicateXValues  allow duplicate values?
         */
        public MyComparableObjectSeries(Comparable key, boolean autoSort,
                boolean allowDuplicateXValues) {
            super(key, autoSort, allowDuplicateXValues);
        }
        public void add(Comparable x, Object y) {
            super.add(x, y);
        }

        public ComparableObjectItem remove(Comparable x) {
            return super.remove(x);
        }
    }

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(ComparableObjectSeriesTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public ComparableObjectSeriesTests(String name) {
        super(name);
    }

    /**
     * Some checks for the constructor.
     */
public void testGetItemCount3376() { MyComparableObjectSeries s1 = new MyComparableObjectSeries("A"); assertEquals(0, s1.getItemCount()); s1.add("A", "1"); assertEquals(1, s1.getItemCount()); s1.add("B", "2"); assertEquals(2, s1.getItemCount()); s1.add("C", "3"); assertEquals(3, s1.getItemCount()); s1.add("D", "4"); assertEquals(4, s1.getItemCount()); s1.add("E", "5"); assertEquals(5, s1.getItemCount()); }
public void testGetMaximumItemCount3378() { MyComparableObjectSeries s1 = new MyComparableObjectSeries("A"); assertEquals(0, s1.getMaximumItemCount()); s1.setMaximumItemCount(1); assertEquals(1, s1.getMaximumItemCount()); s1.setMaximumItemCount(2); assertEquals(2, s1.getMaximumItemCount()); s1.setMaximumItemCount(3); assertEquals(3, s1.getMaximumItemCount()); s1.setMaximumItemCount(4); assertEquals(4, s1.getMaximumItemCount()); s1.setMaximumItemCount(5); assertEquals(5, s1.getMaximumItemCount()); }
    

    /**
     * Confirm that the equals method can distinguish all the required fields.
     */
    

    /**
     * Some checks for the clone() method.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

    /**
     * Some simple checks for the hashCode() method.
     */
    

}
