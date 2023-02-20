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
 * --------------------
 * OHLCSeriesTests.java
 * --------------------
 * (C) Copyright 2006-2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 04-Dec-2006 : Version 1, based on XYSeriesTests (DG);
 * 27-Nov-2007 : Added testClear() method (DG);
 *
 */

package org.jfree.data.time.ohlc.junit;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.data.event.SeriesChangeEvent;
import org.jfree.data.event.SeriesChangeListener;
import org.jfree.data.general.SeriesException;
import org.jfree.data.time.Year;
import org.jfree.data.time.ohlc.OHLCSeries;

/**
 * Tests for the {@link OHLCSeries} class.
 */
public class OHLCSeriesTests extends TestCase
        implements SeriesChangeListener {

    SeriesChangeEvent lastEvent;

    /**
     * Records a change event.
     *
     * @param event  the event.
     */
    public void seriesChanged(SeriesChangeEvent event) {
        this.lastEvent = event;
    }

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(OHLCSeriesTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public OHLCSeriesTests(String name) {
        super(name);
    }

    /**
     * Confirm that the equals method can distinguish all the required fields.
     */
public void testSerialization980() { 
     OHLCSeries s1 = new OHLCSeries("Series 1"); 
     OHLCSeries s2 = null; 
     try { 
         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); 
         ObjectOutput out = new ObjectOutputStream(buffer); 
         out.writeObject(s1); 
         out.close(); 
         ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray())); 
         s2 = (OHLCSeries) in.readObject(); 
         in.close(); 
     } catch (Exception e) { 
         e.printStackTrace(); 
     } 
     assertEquals(s1, s2); 
 }
public void testSerialization981() { 
     OHLCSeries s1 = new OHLCSeries("s1"); 
     OHLCSeries s2 = null; 
     try { 
         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); 
         ObjectOutput out = new ObjectOutputStream(buffer); 
         out.writeObject(s1); 
         out.close(); 
         ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray())); 
         s2 = (OHLCSeries) in.readObject(); 
         in.close(); 
     } catch (Exception e) { 
         e.printStackTrace(); 
     } 
     assertEquals(s1, s2); 
 }
public void testEquals986() { 
     OHLCSeries s1 = new OHLCSeries("Series 1"); 
     OHLCSeries s2 = new OHLCSeries("Series 2"); 
     assertTrue(s1.equals(s2)); 
     assertTrue(s2.equals(s1)); 
     s1.add(new Year(2008), 1.1, 1.2, 1.3, 1.4); 
     assertFalse(s1.equals(s2)); 
     s2.add(new Year(2009), 1.1, 1.2, 1.3, 1.4); 
     assertTrue(s1.equals(s2)); 
     s1.add(new Year(2000), 2.2, 2.2, 1.4, 1.5); 
     assertFalse(s1.equals(s2)); 
     s2.add(new Year(2000), 2.2, 2.2, 1.4, 1.5); 
     assertTrue(s1.equals(s2)); 
     s1.add(new Year(2002), 2.2, 2.2, 1.4, 1.5); 
     assertFalse(s1.equals(s2)); 
     s2.add(new Year(2002), 2.2, 2.2, 1.4, 1.5); 
     assertTrue(s1.equals(s2)); 
 }
public void testSerialization988() { 
     OHLCSeries s1 = new OHLCSeries("s1"); 
     OHLCSeries s2 = null; 
     try { 
         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); 
         ObjectOutput out = new ObjectOutputStream(buffer); 
         out.writeObject(s1); 
         out.close(); 
         ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray())); 
         s2 = (OHLCSeries) in.readObject(); 
         in.close(); 
     } catch (Exception e) { 
         e.printStackTrace(); 
     } 
     assertEquals(s1, s2); 
     s1 = new OHLCSeries("s2"); 
     try { 
         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); 
         ObjectOutput out = new ObjectOutputStream(buffer); 
         out.writeObject(s1); 
         out.close(); 
         ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray())); 
         s2 = (OHLCSeries) in.readObject(); 
         in.close(); 
     } catch (Exception e) { 
         e.printStackTrace(); 
     } 
     assertEquals(s1, s2); 
 }
public void testEquals989() { 
     OHLCSeries s1 = new OHLCSeries("Series 1"); 
     OHLCSeries s2 = new OHLCSeries("Series 2"); 
     assertTrue(s1.equals(s2)); 
     assertTrue(s2.equals(s1)); 
     s1.add(new Year(2008), 1.1, 1.1, 1.1, 1.1); 
     assertFalse(s1.equals(s2)); 
     s2.add(new Year(2008), 1.1, 1.1, 1.1, 1.1); 
     assertTrue(s1.equals(s2)); 
     s1.add(new Year(2009), 2.2, 2.2, 2.2, 2.2); 
     assertFalse(s1.equals(s2)); 
     s2.add(new Year(2009), 2.2, 2.2, 2.2, 2.2); 
     assertTrue(s1.equals(s2)); 
     s1.remove(0); 
     assertFalse(s1.equals(s2)); 
     s2.remove(0); 
     assertTrue(s1.equals(s2)); 
 }
public void testEquals990() { 
     OHLCSeries s1 = new OHLCSeries("Series 1"); 
     OHLCSeries s2 = new OHLCSeries("Series 2"); 
     assertTrue(s1.equals(s2)); 
     assertTrue(s2.equals(s1)); 
     s1.add(new Year(2008), 1.1, 1.2, 1.3, 1.4); 
     assertFalse(s1.equals(s2)); 
     s2.add(new Year(2008), 1.1, 1.2, 1.3, 1.4); 
     assertTrue(s1.equals(s2)); 
     s1.add(new Year(2009), 2.2, 2.2, 1.4, 1.5); 
     assertFalse(s1.equals(s2)); 
     s2.add(new Year(2009), 2.2, 2.2, 1.4, 1.5); 
     assertTrue(s1.equals(s2)); 
     s1.remove(0); 
     assertFalse(s1.equals(s2)); 
     s2.remove(0); 
     assertTrue(s1.equals(s2)); 
 }
    

    /**
     * Confirm that cloning works.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

    /**
     * Simple test for the indexOf() method.
     */
    

    /**
     * Simple test for the remove() method.
     */
    

    /**
     * If you add a duplicate period, an exception should be thrown.
     */
    

    /**
     * A simple check that the maximumItemCount attribute is working.
     */
    

    /**
     * Check that the maximum item count can be applied retrospectively.
     */
    

    /**
     * Some checks for the clear() method.
     */
    

}
