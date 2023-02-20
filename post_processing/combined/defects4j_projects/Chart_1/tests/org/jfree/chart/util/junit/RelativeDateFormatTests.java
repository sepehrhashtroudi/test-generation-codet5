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
public void testNegative39() { 
     NumberFormat nf = new DecimalFormat("0"); 
     RelativeDateFormat rdf = new RelativeDateFormat(); 
     rdf.setShowZeroDays(false); 
     rdf.setShowZeroHours(false); 
     rdf.setMinuteSuffix(":"); 
     rdf.setHourSuffix(":"); 
     rdf.setSecondSuffix(""); 
     rdf.setHourFormatter(nf); 
     rdf.setSecondFormatter(nf); 
     assertEquals("-0h0m1s", rdf.format(new Date(-1000L))); 
 }
public void testNegative40() { 
     RelativeDateFormat rdf = new RelativeDateFormat(); 
     rdf.setShowZeroDays(false); 
     rdf.setShowZeroHours(false); 
     rdf.setMinuteSuffix(":"); 
     rdf.setHourSuffix(":"); 
     rdf.setSecondSuffix(""); 
     rdf.setHourFormatter(new DecimalFormat("0")); 
     rdf.setSecondFormatter(new DecimalFormat("0")); 
     assertEquals("-0h0m1s", rdf.format(new Date(-1000L))); 
 }
public void testCloning43() { 
     NumberFormat nf = new DecimalFormat("0"); 
     RelativeDateFormat df1 = new RelativeDateFormat(); 
     df1.setSecondFormatter(nf); 
     RelativeDateFormat df2 = null; 
     df2 = (RelativeDateFormat) df1.clone(); 
     assertTrue(df1 != df2); 
     assertTrue(df1.getClass() == df2.getClass()); 
     assertTrue(df1.equals(df2)); 
     nf.setMinimumFractionDigits(2); 
     assertFalse(df1.equals(df2)); 
 }
public void testHashCode44() { 
     RelativeDateFormat rdf1 = new RelativeDateFormat(); 
     RelativeDateFormat rdf2 = new RelativeDateFormat(); 
     assertEquals(rdf1.hashCode(), rdf2.hashCode()); 
     rdf1.setShowZeroDays(false); 
     assertFalse(rdf1.hashCode() == rdf2.hashCode()); 
     rdf2.setShowZeroDays(false); 
     assertTrue(rdf1.hashCode() == rdf2.hashCode()); 
     rdf1.setShowZeroHours(false); 
     assertFalse(rdf1.hashCode() == rdf2.hashCode()); 
     rdf2.setShowZeroHours(false); 
     assertTrue(rdf1.hashCode() == rdf2.hashCode()); 
     rdf1.setMinuteSuffix(":"); 
     assertFalse(rdf1.hashCode() == rdf2.hashCode()); 
     rdf2.setMinuteSuffix(":"); 
     assertTrue(rdf1.hashCode() == rdf2.hashCode()); 
     rdf1.setHourSuffix(":"); 
     assertFalse(rdf1.hashCode() == rdf2.hashCode()); 
     rdf2.setHourSuffix(":"); 
     assertTrue(rdf1.hashCode() == rdf2.hashCode()); 
     rdf1.setSecondSuffix(""); 
     assertFalse(rdf1.hashCode() == rdf2.hashCode()); 
     rdf2.setSecondSuffix(""); 
     assertTrue(rdf1.hashCode() == rdf2.hashCode()); 
 }
public void testHashCode45() { 
     RelativeDateFormat rdf1 = new RelativeDateFormat(); 
     RelativeDateFormat rdf2 = new RelativeDateFormat(); 
     assertEquals(rdf1.hashCode(), rdf2.hashCode()); 
     rdf1.setShowZeroDays(false); 
     assertFalse(rdf1.equals(rdf2)); 
     rdf2.setShowZeroDays(false); 
     assertTrue(rdf1.hashCode() == rdf2.hashCode()); 
     rdf1.setShowZeroHours(false); 
     assertFalse(rdf1.hashCode() == rdf2.hashCode()); 
     rdf2.setShowZeroHours(false); 
     assertTrue(rdf1.hashCode() == rdf2.hashCode()); 
     rdf1.setMinuteSuffix(":"); 
     assertFalse(rdf1.hashCode() == rdf2.hashCode()); 
     rdf2.setMinuteSuffix(":"); 
     assertTrue(rdf1.hashCode() == rdf2.hashCode()); 
     rdf1.setHourSuffix(":"); 
     assertFalse(rdf1.hashCode() == rdf2.hashCode()); 
     rdf2.setHourSuffix(":"); 
     assertTrue(rdf1.hashCode() == rdf2.hashCode()); 
     rdf1.setSecondSuffix(""); 
     assertFalse(rdf1.hashCode() == rdf2.hashCode()); 
     rdf2.setSecondSuffix(""); 
     assertTrue(rdf1.hashCode() == rdf2.hashCode()); 
 }
public void testHashCode46() { 
     RelativeDateFormat rdf1 = new RelativeDateFormat(); 
     RelativeDateFormat rdf2 = new RelativeDateFormat(); 
     assertEquals(rdf1.hashCode(), rdf2.hashCode()); 
     rdf1.setShowZeroDays(true); 
     assertFalse(rdf1.equals(rdf2)); 
     rdf2.setShowZeroDays(true); 
     assertTrue(rdf1.equals(rdf2)); 
     rdf1.setShowZeroHours(true); 
     assertFalse(rdf1.equals(rdf2)); 
     rdf2.setShowZeroHours(true); 
     assertTrue(rdf1.equals(rdf2)); 
     rdf1.setMinuteSuffix(":"); 
     assertFalse(rdf1.equals(rdf2)); 
     rdf2.setMinuteSuffix(":"); 
     assertTrue(rdf1.equals(rdf2)); 
     rdf1.setHourSuffix(":"); 
     assertFalse(rdf1.equals(rdf2)); 
     rdf2.setHourSuffix(":"); 
     assertTrue(rdf1.equals(rdf2)); 
     rdf1.setSecondSuffix(""); 
     assertFalse(rdf1.equals(rdf2)); 
     rdf2.setSecondSuffix(""); 
     assertTrue(rdf1.equals(rdf2)); 
     rdf1.setHourFormatter(new DecimalFormat("0.000")); 
     assertFalse(rdf1.equals(rdf2)); 
     rdf2.setHourFormatter(new DecimalFormat("0.000")); 
     assertTrue(rdf1.equals(rdf2)); 
     rdf1.setSecondFormatter(new DecimalFormat("0.000")); 
     assertFalse(rdf1.equals(rdf2)); 
     rdf2.setSecondFormatter(new DecimalFormat("0.000")); 
     assertTrue(rdf1.equals(rdf2)); 
 }
public void testHashCode47() { 
     RelativeDateFormat rdf1 = new RelativeDateFormat(); 
     RelativeDateFormat rdf2 = new RelativeDateFormat(); 
     assertTrue(rdf1.equals(rdf2)); 
     int h1 = rdf1.hashCode(); 
     int h2 = rdf2.hashCode(); 
     assertEquals(h1, h2); 
 }
    

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

