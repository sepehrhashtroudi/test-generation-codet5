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
 * DialPlotTests.java
 * ------------------
 * (C) Copyright 2006-2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 03-Nov-2006 : Version 1 (DG);
 *
 */

package org.jfree.chart.plot.dial.junit;

import java.awt.Color;
import java.awt.GradientPaint;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.chart.event.PlotChangeEvent;
import org.jfree.chart.event.PlotChangeListener;
import org.jfree.chart.plot.dial.ArcDialFrame;
import org.jfree.chart.plot.dial.DialBackground;
import org.jfree.chart.plot.dial.DialCap;
import org.jfree.chart.plot.dial.DialPlot;
import org.jfree.chart.plot.dial.StandardDialFrame;
import org.jfree.chart.plot.dial.StandardDialScale;

/**
 * Tests for the {@link DialPlot} class.
 */
public class DialPlotTests extends TestCase implements PlotChangeListener {

    /** The last plot change event received. */
    private PlotChangeEvent lastEvent;

    /**
     * Records the last plot change event received.
     *
     * @param event  the event.
     */
    public void plotChanged(PlotChangeEvent event) {
        this.lastEvent = event;
    }


    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(DialPlotTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public DialPlotTests(String name) {
        super(name);
    }

    /**
     * Confirm that the equals method can distinguish all the required fields.
     */
public void testRemove40() { 
     DialCap c1 = new DialCap(); 
     DialCap c2 = null; 
     try { 
         c2 = (DialCap) c1.clone(); 
     } catch (CloneNotSupportedException e) { 
         e.printStackTrace(); 
     } 
     assertTrue(c1 != c2); 
     assertTrue(c1.getClass() == c2.getClass()); 
     assertTrue(c1.equals(c2)); 
     c1.setVisible(false); 
     assertFalse(c1.equals(c2)); 
     c2.setVisible(false); 
     assertTrue(c1.equals(c2)); 
 }
public void testEquals41() { 
     DialCap c1 = new DialCap(); 
     DialCap c2 = new DialCap(); 
     assertTrue(c1.equals(c2)); 
     c1.setVisible(false); 
     assertFalse(c1.equals(c2)); 
     c2.setVisible(false); 
     assertTrue(c1.equals(c2)); 
 }
public void testHashCode667() { 
     DialPlot p1 = new DialPlot(); 
     DialPlot p2 = new DialPlot(); 
     assertTrue(p1.equals(p2)); 
     int h1 = p1.hashCode(); 
     int h2 = p2.hashCode(); 
     assertEquals(h1, h2); 
 }
public void testEquals668() { 
     DialPlot p1 = new DialPlot(); 
     DialPlot p2 = new DialPlot(); 
     assertTrue(p1.equals(p2)); 
     assertTrue(p2.equals(p1)); 
     p1.setBackground(new DialBackground()); 
     assertFalse(p1.equals(p2)); 
     p2.setBackground(new DialBackground()); 
     assertTrue(p1.equals(p2)); 
 }
public void testEquals772() { 
     DialBackground b1 = new DialBackground(); 
     DialBackground b2 = new DialBackground(); 
     assertTrue(b1.equals(b2)); 
     b1 = new DialBackground(); 
     assertFalse(b1.equals(b2)); 
     b2 = new DialBackground(); 
     assertTrue(b1.equals(b2)); 
     b1 = new DialBackground(Color.red); 
     assertFalse(b1.equals(b2)); 
     b2 = new DialBackground(Color.red); 
     assertTrue(b1.equals(b2)); 
     b1 = new DialBackground(Color.blue); 
     assertFalse(b1.equals(b2)); 
     b2 = new DialBackground(Color.blue); 
     assertTrue(b1.equals(b2)); 
     b1 = new DialBackground(Color.blue); 
     assertFalse(b1.equals(b2)); 
     b2 = new DialBackground(Color.blue); 
     assertTrue(b1.equals(b2)); 
     b1 = new DialBackground(Color.blue); 
     assertFalse(b1.equals(b2)); 
     b2 = new DialBackground(Color.blue); 
     assertTrue(b1.equals(b2)); 
     b1 = new DialBackground(Color.blue); 
     assertFalse(b1.equals(b2)); 
     b2 = new DialBackground(Color.blue); 
     assertTrue(b1.equals(b2)); 
 }
public void testSerialization973() { 
     DialCap c1 = new DialCap(); 
     DialCap c2 = null; 
     try { 
         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); 
         ObjectOutput out = new ObjectOutputStream(buffer); 
         out.writeObject(c1); 
         out.close(); 
         ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray())); 
         c2 = (DialCap) in.readObject(); 
         in.close(); 
     } catch (Exception e) { 
         e.printStackTrace(); 
     } 
     assertEquals(c1, c2); 
     MyDialLayerChangeListener l1 = new MyDialLayerChangeListener(); 
     c1.addChangeListener(l1); 
     assertTrue(c1.hasListener(l1)); 
     assertFalse(c2.hasListener(l1)); 
 }
public void testHashCode1459() { 
     ArcDialFrame f1 = new ArcDialFrame(); 
     ArcDialFrame f2 = new ArcDialFrame(); 
     assertTrue(f1.equals(f2)); 
     int h1 = f1.hashCode(); 
     int h2 = f2.hashCode(); 
     assertEquals(h1, h2); 
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
    

    /**
     * Check the notification event mechanism for the dial background.
     */
    

    /**
     * Check the notification event mechanism for the dial cap.
     */
    

    /**
     * Check the notification event mechanism for the dial frame.
     */
    

    /**
     * Check the notification event mechanism for the dial scales.
     */
    

    /**
     * Check the notification event mechanism for a layer.
     */
    

}
