/* ===========================================================
 * JFreeChart : a free chart library for the Java(tm) platform
 * ===========================================================
 *
 * (C) Copyright 2000-2009, by Object Refinery Limited and Contributors.
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
 * OHLCSeriesCollectionTests.java
 * ------------------------------
 * (C) Copyright 2006-2009, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 04-Dec-2006 : Version 1 (DG);
 * 10-Jul-2008 : Updated testEquals() method (DG);
 * 26-Jun-2009 : Added tests for removeSeries() methods (DG);
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

import org.jfree.data.event.DatasetChangeEvent;
import org.jfree.data.event.DatasetChangeListener;
import org.jfree.data.time.TimePeriodAnchor;
import org.jfree.data.time.Year;
import org.jfree.data.time.ohlc.OHLCSeries;
import org.jfree.data.time.ohlc.OHLCSeriesCollection;

/**
 * Tests for the {@link OHLCSeriesCollectionTests} class.
 */
public class OHLCSeriesCollectionTests extends TestCase 
        implements DatasetChangeListener {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(OHLCSeriesCollectionTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public OHLCSeriesCollectionTests(String name) {
        super(name);
    }

    /**
     * Confirm that the equals method can distinguish all the required fields.
     */
public void testSerialization869() { 
     OHLCSeriesCollection c1 = new OHLCSeriesCollection(); 
     c1.addSeries(new OHLCSeries("Series 1")); 
     c1.addSeries(new OHLCSeries("Series 2")); 
     OHLCSeriesCollection c2 = null; 
     try { 
         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); 
         ObjectOutput out = new ObjectOutputStream(buffer); 
         out.writeObject(c1); 
         out.close(); 
         ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray())); 
         c2 = (OHLCSeriesCollection) in.readObject(); 
         in.close(); 
     } catch (Exception e) { 
         e.printStackTrace(); 
     } 
     assertEquals(c1, c2); 
 }
public void testGetSeries876() { 
     OHLCSeriesCollection c = new OHLCSeriesCollection(); 
     assertNull(c.getSeries(0)); 
     c.addSeries(new OHLCSeries("Series 1")); 
     assertEquals("Series 1", c.getSeries(0).getKey()); 
     c.addSeries(new OHLCSeries("Series 2")); 
     assertEquals("Series 2", c.getSeries(1).getKey()); 
     boolean pass = false; 
     try { 
         c.getSeries(-1); 
     } catch (IllegalArgumentException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
 }
public void testGetSeries877() { 
     OHLCSeriesCollection c = new OHLCSeriesCollection(); 
     c.addSeries(new OHLCSeries("Series 1")); 
     assertEquals("Series 1", c.getSeries(0).getKey()); 
     boolean pass = false; 
     try { 
         c.getSeries(-1); 
     } catch (IllegalArgumentException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
     pass = false; 
     try { 
         c.getSeries(1); 
     } catch (IllegalArgumentException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
     pass = false; 
     try { 
         c.getSeries(2); 
     } catch (IllegalArgumentException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
 }
public void testRemoveSeries878() { 
     OHLCSeriesCollection c = new OHLCSeriesCollection(); 
     c.addSeries(new OHLCSeries("Series 1")); 
     c.removeSeries(0); 
     assertEquals(0, c.getSeriesCount()); 
     c.addSeries(new OHLCSeries("Series 2")); 
     boolean pass = false; 
     try { 
         c.removeSeries(-1); 
     } catch (IllegalArgumentException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
     pass = false; 
     try { 
         c.removeSeries(0); 
     } catch (IllegalArgumentException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
     pass = false; 
     try { 
         c.removeSeries(1); 
     } catch (IllegalArgumentException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
 }
public void testRemoveSeries879() { 
     OHLCSeriesCollection c = new OHLCSeriesCollection(); 
     c.addSeries(new OHLCSeries("Series 1")); 
     c.removeSeries(0); 
     assertEquals(0, c.getSeriesCount()); 
     c.addSeries(new OHLCSeries("Series 2")); 
     boolean pass = false; 
     try { 
         c.removeSeries(null); 
     } catch (IllegalArgumentException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
     pass = false; 
     try { 
         c.removeSeries(new OHLCSeries("Empty Series")); 
     } catch (IllegalArgumentException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
     pass = false; 
     try { 
         c.removeSeries(new OHLCSeries("Empty Series")); 
     } catch (IllegalArgumentException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
 }
public void testRemoveSeries880() { 
     OHLCSeriesCollection c = new OHLCSeriesCollection(); 
     c.addSeries(new OHLCSeries("Series 1")); 
     c.removeSeries(new OHLCSeries("Series 1")); 
     assertEquals(0, c.getSeriesCount()); 
     c.addSeries(new OHLCSeries("Series 2")); 
     boolean pass = false; 
     try { 
         c.removeSeries(null); 
     } catch (IllegalArgumentException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
     pass = false; 
     try { 
         c.removeSeries(new OHLCSeries("Series 2")); 
     } catch (IllegalArgumentException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
     pass = false; 
     try { 
         c.removeSeries(new OHLCSeries("Series 2")); 
     } catch (IllegalArgumentException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
 }
public void testRemoveSeries881() { 
     OHLCSeriesCollection c = new OHLCSeriesCollection(); 
     c.addSeries(new OHLCSeries("Series 1")); 
     c.removeSeries(new OHLCSeries("Series 1")); 
     assertEquals(0, c.getSeriesCount()); 
     c.addSeries(new OHLCSeries("Series 2")); 
     boolean pass = false; 
     try { 
         c.removeSeries(null); 
     } catch (IllegalArgumentException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
     pass = false; 
     try { 
         c.removeSeries(new OHLCSeries("Empty Series")); 
     } catch (IllegalArgumentException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
     pass = false; 
     try { 
         c.removeSeries(new OHLCSeries("Empty Series")); 
     } catch (IllegalArgumentException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
 }
public void testRemoveSeries882() { 
     OHLCSeriesCollection c = new OHLCSeriesCollection(); 
     c.addSeries(new OHLCSeries("Series 1")); 
     assertEquals(0, c.getSeriesCount()); 
     c.removeSeries(new OHLCSeries("Series 1")); 
     assertEquals(0, c.getSeriesCount()); 
     c.addSeries(new OHLCSeries("Series 2")); 
     assertEquals(0, c.getSeriesCount()); 
     boolean pass = false; 
     try { 
         c.removeSeries(null); 
     } catch (IllegalArgumentException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
     pass = false; 
     try { 
         c.removeSeries(new OHLCSeries("Series 2")); 
     } catch (IllegalArgumentException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
     pass = false; 
     try { 
         c.removeSeries(new OHLCSeries("Series 2")); 
     } catch (IllegalArgumentException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
 }
public void testHashcode978() { 
     TimePeriodAnchor a1 = TimePeriodAnchor.MIDDLE; 
     TimePeriodAnchor a2 = TimePeriodAnchor.MIDDLE; 
     assertTrue(a1.equals(a2)); 
     int h1 = a1.hashCode(); 
     int h2 = a2.hashCode(); 
     assertEquals(h1, h2); 
 }
    

    /**
     * Confirm that cloning works.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

    /**
     * A test for bug report 1170825 (originally affected XYSeriesCollection,
     * this test is just copied over).
     */
    

    /**
     * Two objects that are equal are required to return the same hashCode.
     */
    

    /**
     * Some checks for the {@link OHLCSeriesCollection#removeSeries(int)}
     * method.
     */
    

    /**
     * Some checks for the
     * {@link OHLCSeriesCollection#removeSeries(OHLCSeries)} method.
     */
    

    /**
     * A simple check for the removeAllSeries() method.
     */
    

    /** The last received event. */
    private DatasetChangeEvent lastEvent;

    /**
     * Receives dataset change events.
     *
     * @param event  the event.
     */
    public void datasetChanged(DatasetChangeEvent event) {
        this.lastEvent = event;
    }

}
