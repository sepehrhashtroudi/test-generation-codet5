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

public void testNegative22() { 
     NumberFormat nf = new DecimalFormat("0"); 
     RelativeDateFormat df1 = new RelativeDateFormat(); 
     df1.setSecondFormatter(nf); 
     assertEquals("-0h0m1s", df1.format(new Date(-1000L))); 
 } 


public void test203309223() { 
     RelativeDateFormat rdf = new RelativeDateFormat(); 
     rdf.setShowZeroDays(false); 
     rdf.setShowZeroHours(false); 
     rdf.setMinuteSuffix(":"); 
     rdf.setHourSuffix(":"); 
     rdf.setSecondSuffix(""); 
     DecimalFormat hoursFormatter = new DecimalFormat(); 
     hoursFormatter.setMaximumFractionDigits(0); 
     hoursFormatter.setMaximumIntegerDigits(2); 
     hoursFormatter.setMinimumIntegerDigits(2); 
     rdf.setHourFormatter(hoursFormatter); 
     DecimalFormat minsFormatter = new DecimalFormat(); 
     minsFormatter.setMaximumFractionDigits(0); 
     minsFormatter.setMaximumIntegerDigits(2); 
     minsFormatter.setMinimumIntegerDigits(2); 
     rdf.setMinuteFormatter(minsFormatter); 
     DecimalFormat secondsFormatter = new DecimalFormat(); 
     secondsFormatter.setMaximumFractionDigits(0); 
     secondsFormatter.setMaximumIntegerDigits(2); 
     secondsFormatter.setMinimumIntegerDigits(2); 
     rdf.setSecondFormatter(secondsFormatter); 
     String s = rdf.format(new Date(2 * 60L * 60L * 1000L + 122500L)); 
     assertEquals("02:02:02", s); 
 } 


public void testCloning24() { 
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

