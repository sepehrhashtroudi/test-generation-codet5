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
 * ------------------
 * DateTickTests.java
 * ------------------
 * (C) Copyright 2004-2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 13-May-2004 : Version 1 (DG);
 * 20-Jun-2007 : Removed JCommon dependency (DG);
 * 25-Sep-2008 : Extended testEquals() to cover new fields (DG);
 *
 */

package org.jfree.chart.axis.junit;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.Date;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.chart.axis.DateTick;
import org.jfree.chart.axis.TickType;
import org.jfree.chart.text.TextAnchor;

/**
 * Tests for the {@link DateTick} class.
 */
public class DateTickTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(DateTickTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public DateTickTests(String name) {
        super(name);
    }

    /**
     * Confirm that the equals method can distinguish all the required fields.
     */
public void testHashCode962() { Date d1 = new Date(1); Date d2 = new Date(1); String l1 = "Label 1"; String l2 = "Label 2"; TextAnchor ta1 = TextAnchor.CENTER; TextAnchor ta2 = TextAnchor.CENTER; DateTick t1 = new DateTick(d1, l1, ta1, ta1, Math.PI / 2.0); DateTick t2 = new DateTick(d2, l1, ta1, ta2, Math.PI / 2.0); assertEquals(t1.hashCode(), t2.hashCode()); }
public void testHashCode963() { Date d1 = new Date(1); Date d2 = new Date(1); String l1 = "Label 1"; String l2 = "Label 2"; TextAnchor ta1 = TextAnchor.CENTER; TextAnchor ta2 = TextAnchor.CENTER; DateTick t1 = new DateTick(d1, l1, ta1, ta1, Math.PI / 2.0); DateTick t2 = new DateTick(d2, l1, ta1, ta1, Math.PI / 2.0); assertEquals(t1.hashCode(), t2.hashCode()); }
    

    /**
     * Two objects that are equal are required to return the same hashCode.
     */
    

    /**
     * Confirm that cloning works.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

}
