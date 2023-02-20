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
 * -------------------------
 * MonthDateFormatTests.java
 * -------------------------
 * (C) Copyright 2005-2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 10-May-2005 : Version 1 (DG);
 *
 */

package org.jfree.chart.axis.junit;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.chart.axis.MonthDateFormat;

/**
 * Some tests for the {@link MonthDateFormat} class.
 */
public class MonthDateFormatTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(MonthDateFormatTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public MonthDateFormatTests(String name) {
        super(name);
    }

    /**
     * Confirm that the equals method can distinguish all the required fields.
     */

public void testEquals367() { 
     MonthDateFormat mf1 = new MonthDateFormat(); 
     MonthDateFormat mf2 = new MonthDateFormat(); 
     assertTrue(mf1.equals(mf2)); 
     assertTrue(mf2.equals(mf1)); 
     boolean[] showYear1 = new boolean[12]; 
     showYear1[0] = true; 
     boolean[] showYear2 = new boolean[12]; 
     showYear1[1] = true; 
     mf1 = new MonthDateFormat(TimeZone.getTimeZone("PST"), Locale.US, 1, showYear1, new SimpleDateFormat("yy")); 
     assertFalse(mf1.equals(mf2)); 
     mf2 = new MonthDateFormat(TimeZone.getTimeZone("PST"), Locale.US, 1, showYear1, new SimpleDateFormat("yy")); 
     assertTrue(mf1.equals(mf2)); 
     mf1 = new MonthDateFormat(TimeZone.getTimeZone("PST"), Locale.FRANCE, 1, showYear1, new SimpleDateFormat("yy")); 
     assertFalse(mf1.equals(mf2)); 
     mf2 = new MonthDateFormat(TimeZone.getTimeZone("PST"), Locale.FRANCE, 1, showYear1, new SimpleDateFormat("yy")); 
     assertTrue(mf1.equals(mf2)); 
     mf1 = new MonthDateFormat(TimeZone.getTimeZone("PST"), Locale.FRANCE, 2, showYear1, new SimpleDateFormat("yy")); 
     assertFalse(mf1.equals(mf2)); 
     mf2 = new MonthDateFormat(TimeZone.getTimeZone("PST"), Locale.FRANCE, 2, showYear1, new SimpleDateFormat("yy")); 
     assertTrue(mf1.equals(mf2)); 
     mf1 = new MonthDateFormat(TimeZone.getTimeZone("PST"), Locale.FRANCE, 2, showYear2, new SimpleDateFormat("yy")); 
     assertFalse(mf1.equals(mf2)); 
     mf2 = new MonthDateFormat(TimeZone.getTimeZone("PST"), Locale.FRANCE, 2, showYear2, new SimpleDateFormat("yy")); 
     assertTrue(mf1.equals(mf2)); 
     mf1 = new MonthDateFormat(TimeZone.getTimeZone("PST"), Locale.FRANCE, 2, showYear2, new SimpleDateFormat("yyyy")); 
     assertFalse(mf1.equals(mf2)); 
     mf2 = new MonthDateFormat(TimeZone.getTimeZone("PST"), Locale.FRANCE, 2, showYear2, new SimpleDateFormat("yyyy")); 
     assertTrue(mf1.equals(mf2)); 
 } 

    

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
