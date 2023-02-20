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
 * ------------------------------------
 * TimePeriodValuesCollectionTests.java
 * ------------------------------------
 * (C) Copyright 2005-2008, by Object Refinery Limited.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 11-Mar-2005 : Version 1 (DG);
 * 08-Mar-2007 : Added testGetSeries() (DG);
 * 11-Jun-2007 : Added tests for getDomainBounds() (DG);
 * 20-Jun-2007 : Updated for deprecated method removals (DG);
 * 07-Apr-2008 : Added more checks to 
 *               testGetDomainBoundsWithInterval() (DG);
 *
 */

package org.jfree.data.time.junit;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.data.Range;
import org.jfree.data.time.Day;
import org.jfree.data.time.SimpleTimePeriod;
import org.jfree.data.time.TimePeriodAnchor;
import org.jfree.data.time.TimePeriodValues;
import org.jfree.data.time.TimePeriodValuesCollection;

/**
 * Some tests for the {@link TimePeriodValuesCollection} class.
 */
public class TimePeriodValuesCollectionTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(TimePeriodValuesCollectionTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public TimePeriodValuesCollectionTests(String name) {
        super(name);
    }

    /**
     * Common test setup.
     */
    protected void setUp() {
        // no setup
    }

    /**
     * A test for bug report 1161340.  I wasn't able to reproduce the problem
     * with this test.
     */
public void testSerialization804() { 
     TimePeriodValuesCollection c1 = new TimePeriodValuesCollection(); 
     TimePeriodValuesCollection c2 = null; 
     try { 
         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); 
         ObjectOutput out = new ObjectOutputStream(buffer); 
         out.writeObject(c1); 
         out.close(); 
         ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray())); 
         c2 = (TimePeriodValuesCollection) in.readObject(); 
         in.close(); 
     } catch (Exception e) { 
         e.printStackTrace(); 
     } 
     assertEquals(c1, c2); 
 }
public void testRemoveSeries806() { 
     TimePeriodValuesCollection c1 = new TimePeriodValuesCollection(); 
     TimePeriodValues s1 = new TimePeriodValues("Series 1"); 
     c1.addSeries(s1); 
     c1.removeSeries(0); 
     assertEquals(0, c1.getSeriesCount()); 
     c1.addSeries(new TimePeriodValues("Empty Series")); 
     boolean pass = false; 
     try { 
         c1.removeSeries(-1); 
     } catch (IllegalArgumentException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
     pass = false; 
     try { 
         c1.removeSeries(1); 
     } catch (IllegalArgumentException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
 }
public void testRemoveSeries808() { 
     TimePeriodValuesCollection c1 = new TimePeriodValuesCollection(); 
     TimePeriodValues s1 = new TimePeriodValues("Series 1"); 
     c1.addSeries(s1); 
     c1.removeSeries(s1); 
     assertEquals(0, c1.getSeriesCount()); 
     c1.addSeries(new TimePeriodValues("Empty Series")); 
     boolean pass = false; 
     try { 
         c1.removeSeries(-1); 
     } catch (IllegalArgumentException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
     pass = false; 
     try { 
         c1.removeSeries(null); 
     } catch (IllegalArgumentException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
 }
    
    
    /**
     * Tests the equals() method.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

    /**
     * Some basic checks for the getSeries() method.
     */
    
    
    private static final double EPSILON = 0.0000000001;
    
    /**
     * Some checks for the getDomainBounds() method.
     */
    

    /**
     * Some more checks for the getDomainBounds() method.
     * 
     * @see #testGetDomainBoundsWithoutInterval()
     */
    
}
