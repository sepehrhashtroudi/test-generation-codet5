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
 * TimePeriodValueTests.java
 * -------------------------
 * (C) Copyright 2003-2008, by Object Refinery Limited.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 30-Jul-2003 : Version 1 (DG);
 * 21-Jun-2007 : Removed JCommon dependencies (DG);
 * 07-Apr-2008 : Added new tests for min/max-start/middle/end
 *               index updates (DG);
 *
 */

package org.jfree.data.time.junit;

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

import org.jfree.data.event.SeriesChangeEvent;
import org.jfree.data.event.SeriesChangeListener;
import org.jfree.data.general.SeriesException;
import org.jfree.data.time.Day;
import org.jfree.data.time.MonthConstants;
import org.jfree.data.time.RegularTimePeriod;
import org.jfree.data.time.SimpleTimePeriod;
import org.jfree.data.time.TimePeriodValue;
import org.jfree.data.time.TimePeriodValues;
import org.jfree.data.time.Year;

/**
 * A collection of test cases for the {@link TimePeriodValues} class.
 */
public class TimePeriodValuesTests extends TestCase {

    /** Series A. */
    private TimePeriodValues seriesA;

    /** Series B. */
    private TimePeriodValues seriesB;

    /** Series C. */
    private TimePeriodValues seriesC;

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(TimePeriodValuesTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public TimePeriodValuesTests(String name) {
        super(name);
    }

    /**
     * Common test setup.
     */
    protected void setUp() {

        this.seriesA = new TimePeriodValues("Series A");
        try {
            this.seriesA.add(new Year(2000), new Integer(102000));
            this.seriesA.add(new Year(2001), new Integer(102001));
            this.seriesA.add(new Year(2002), new Integer(102002));
            this.seriesA.add(new Year(2003), new Integer(102003));
            this.seriesA.add(new Year(2004), new Integer(102004));
            this.seriesA.add(new Year(2005), new Integer(102005));
        }
        catch (SeriesException e) {
            System.err.println("Problem creating series.");
        }

        this.seriesB = new TimePeriodValues("Series B");
        try {
            this.seriesB.add(new Year(2006), new Integer(202006));
            this.seriesB.add(new Year(2007), new Integer(202007));
            this.seriesB.add(new Year(2008), new Integer(202008));
        }
        catch (SeriesException e) {
            System.err.println("Problem creating series.");
        }

        this.seriesC = new TimePeriodValues("Series C");
        try {
            this.seriesC.add(new Year(1999), new Integer(301999));
            this.seriesC.add(new Year(2000), new Integer(302000));
            this.seriesC.add(new Year(2002), new Integer(302002));
        }
        catch (SeriesException e) {
            System.err.println("Problem creating series.");
        }

    }

    /**
     * Set up a quarter equal to Q1 1900.  Request the previous quarter, it 
     * should be null.
     */
public void testSerialization240() { 
     TimePeriodValues s1 = new TimePeriodValues("A test"); 
     s1.add(new Year(2000), 13.75); 
     s1.add(new Year(2001), 11.90); 
     s1.add(new Year(2002), null); 
     s1.add(new Year(2005), 19.32); 
     s1.add(new Year(2007), 16.89); 
     TimePeriodValues s2 = null; 
     try { 
         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); 
         ObjectOutput out = new ObjectOutputStream(buffer); 
         out.writeObject(s1); 
         out.close(); 
         ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray())); 
         s2 = (TimePeriodValues) in.readObject(); 
         in.close(); 
     } catch (Exception e) { 
         e.printStackTrace(); 
     } 
     assertTrue(s1.equals(s2)); 
 }
public void testSerialization498() { 
     TimePeriodValues s1 = new TimePeriodValues("A test"); 
     s1.add(new Year(2000), 13.75); 
     s1.add(new Year(2001), 11.90); 
     s1.add(new Year(2002), null); 
     s1.add(new Year(2005), 19.32); 
     s1.add(new Year(2007), 16.89); 
     TimePeriodValues s2 = null; 
     try { 
         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); 
         ObjectOutput out = new ObjectOutputStream(buffer); 
         out.writeObject(s1); 
         out.close(); 
         ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray())); 
         s2 = (TimePeriodValues) in.readObject(); 
         in.close(); 
     } catch (Exception e) { 
         e.printStackTrace(); 
     } 
     assertEquals(s1, s2); 
 }
    

    /**
     * Add a value to series A for 1999.  It should be added at index 0.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

    /**
     * Tests the equals method.
     */
    
    
    /**
     * A test for bug report 1161329.
     */
    
    
    static final double EPSILON = 0.0000000001;
    
    /**
     * Some checks for the add() methods.
     */
    
    
    /**
     * Some tests for the getMinStartIndex() method.
     */
    
    
    /**
     * Some tests for the getMaxStartIndex() method.
     */
    

    /**
     * Some tests for the getMinMiddleIndex() method.
     */
    
    
    /**
     * Some tests for the getMaxMiddleIndex() method.
     */
    

    /**
     * Some tests for the getMinEndIndex() method.
     */
    public void getMinEndIndex() {
        TimePeriodValues s = new TimePeriodValues("Test");
        assertEquals(-1, s.getMinEndIndex());
        s.add(new SimpleTimePeriod(100L, 200L), 1.0);
        assertEquals(0, s.getMinEndIndex());
        s.add(new SimpleTimePeriod(300L, 400L), 2.0);
        assertEquals(0, s.getMinEndIndex());
        s.add(new SimpleTimePeriod(0L, 50L), 3.0);
        assertEquals(2, s.getMinEndIndex());
    }
    
    /**
     * Some tests for the getMaxEndIndex() method.
     */
    public void getMaxEndIndex() {
        TimePeriodValues s = new TimePeriodValues("Test");
        assertEquals(-1, s.getMaxEndIndex());
        s.add(new SimpleTimePeriod(100L, 200L), 1.0);
        assertEquals(0, s.getMaxEndIndex());
        s.add(new SimpleTimePeriod(300L, 400L), 2.0);
        assertEquals(1, s.getMaxEndIndex());
        s.add(new SimpleTimePeriod(0L, 50L), 3.0);
        assertEquals(1, s.getMaxEndIndex());
    }

    /**
     * A listener used for detecting series change events.
     */
    static class MySeriesChangeListener implements SeriesChangeListener {
        
        SeriesChangeEvent lastEvent;
        
        /**
         * Creates a new listener.
         */
        public MySeriesChangeListener() {
            this.lastEvent = null;
        }
        
        /**
         * Returns the last event.
         * 
         * @return The last event (possibly <code>null</code>).
         */
        public SeriesChangeEvent getLastEvent() {
            return this.lastEvent;
        }
        
        /**
         * Clears the last event (sets it to <code>null</code>).
         */
        public void clearLastEvent() {
            this.lastEvent = null;
        }
        
        /**
         * Callback method for series change events.
         * 
         * @param event  the event.
         */
        public void seriesChanged(SeriesChangeEvent event) {
            this.lastEvent = event;
        }
    }

}
