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
 * ----------------------------
 * RelativeDateFormatTests.java
 * ----------------------------
 * (C) Copyright 2006-2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 23-Nov-2006 : Version 1 (DG);
 * 15-Feb-2008 : Added tests for negative dates (DG);
 * 01-Sep-2008 : Added a test for hours and minutes with leading zeroes (DG);
 *
 */

package org.jfree.chart.util.junit;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Date;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.chart.util.RelativeDateFormat;

/**
 * Tests for the {@link RelativeDateFormat} class.
 */
public class RelativeDateFormatTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(RelativeDateFormatTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public RelativeDateFormatTests(String name) {
        super(name);
    }

    /**
     * Some checks for the formatting.
     */
public void testSetShowZeroDays88() { RelativeDateFormat df = new RelativeDateFormat(); df.setShowZeroDays(true); assertTrue(df.getShowZeroDays()); df.setShowZeroDays(false); assertFalse(df.getShowZeroDays()); df.setShowZeroDays(true); assertTrue(df.getShowZeroDays()); }
public void testSetShowZeroHours89() { RelativeDateFormat df = new RelativeDateFormat(); df.setShowZeroHours(true); assertTrue(df.getShowZeroHours()); df.setShowZeroHours(false); assertFalse(df.getShowZeroHours()); df.setShowZeroHours(true); assertTrue(df.getShowZeroHours()); }
public void testGetHourSuffix91() { RelativeDateFormat df = new RelativeDateFormat(); assertEquals("#", df.getHourSuffix()); df.setHourSuffix("#"); assertEquals("#", df.getHourSuffix()); df.setHourSuffix("#"); assertEquals("#", df.getHourSuffix()); }
public void testGetHourSuffix92() { RelativeDateFormat df = new RelativeDateFormat(); assertEquals(".", df.getHourSuffix()); }
public void testHourSuffix93() { RelativeDateFormat df = new RelativeDateFormat(); assertNull(df.getHourSuffix()); df.setHourSuffix(null); assertEquals("", df.getHourSuffix()); df.setHourSuffix(" "); assertEquals(" " + df.getHourSuffix(), " " + df.getHourSuffix()); df.setHourSuffix(" "); assertEquals(" " + df.getHourSuffix(), " " + df.getHourSuffix()); df.setHourSuffix(" "); assertEquals(" " + df.getHourSuffix(), " " + df.getHourSuffix()); }
public void testSetHourSuffix94() { RelativeDateFormat df = new RelativeDateFormat(); assertNull(df.getHourSuffix()); df.setHourSuffix("a"); assertEquals("a", df.getHourSuffix()); df.setHourSuffix(null); assertEquals(null, df.getHourSuffix()); }
public void testSetHourSuffix95() { RelativeDateFormat df = new RelativeDateFormat(); assertNull(df.getHourSuffix()); df.setHourSuffix("s"); assertEquals("s", df.getHourSuffix()); df.setHourSuffix(null); assertEquals("", df.getHourSuffix()); }
public void testGetMinuteSuffix99() { RelativeDateFormat df = new RelativeDateFormat(); assertEquals(":", df.getMinuteSuffix()); df.setMinuteSuffix(":"); assertEquals(":", df.getMinuteSuffix()); df.setMinuteSuffix(":"); assertEquals(":", df.getMinuteSuffix()); }
public void testGetMinuteSuffix100() { RelativeDateFormat df = new RelativeDateFormat(); assertEquals(":", df.getMinuteSuffix()); }
public void testMinuteSuffix101() { RelativeDateFormat df = new RelativeDateFormat(); assertNull(df.getMinuteSuffix()); df.setMinuteSuffix("s"); assertEquals("s", df.getMinuteSuffix()); df.setMinuteSuffix(null); assertEquals("", df.getMinuteSuffix()); }
public void testMinuteSuffix102() { RelativeDateFormat df = new RelativeDateFormat(); df.setMinuteSuffix("s"); assertEquals("s", df.getMinuteSuffix()); df.setMinuteSuffix(null); assertEquals("", df.getMinuteSuffix()); }
public void testGetSecondSuffix103() { RelativeDateFormat df = new RelativeDateFormat(); df.setSecondSuffix(".txt"); assertEquals(".txt", df.getSecondSuffix()); }
public void testSetSecondSuffix104() { RelativeDateFormat df = new RelativeDateFormat(); assertNull(df.getSecondSuffix()); df.setSecondSuffix("."); assertEquals(".", df.getSecondSuffix()); df.setSecondSuffix(null); assertEquals(".", df.getSecondSuffix()); }
public void testSetSecondSuffix105() { RelativeDateFormat df = new RelativeDateFormat(); df.setSecondSuffix("+"); assertEquals("+", df.getSecondSuffix()); df.setSecondSuffix(null); assertEquals("+", df.getSecondSuffix()); }
public void testSetSecondSuffix106() { RelativeDateFormat df = new RelativeDateFormat(); df.setSecondSuffix(".txt"); assertEquals(".txt", df.getSecondSuffix()); df.setSecondSuffix(null); assertEquals(".txt", df.getSecondSuffix()); }
    

    /**
     * Test that we can configure the RelativeDateFormat to show
     * hh:mm:ss.
     */
    

    /**
     * Check that the equals() method can distinguish all fields.
     */
    

    /**
     * Two objects that are equal are required to return the same hashCode.
     */
    

    /**
     * Confirm that cloning works.
     */
    

    /**
     * Some tests for negative dates.
     */
    
}

