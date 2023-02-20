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
 * OHLCItemTests.java
 * ------------------
 * (C) Copyright 2006, 2007, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 04-Dec-2006 : Version 1 (DG);
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

import org.jfree.data.time.Year;
import org.jfree.data.time.ohlc.OHLCItem;

/**
 * Tests for the {@link OHLCItem} class.
 */
public class OHLCItemTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(OHLCItemTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public OHLCItemTests(String name) {
        super(name);
    }

    private static final double EPSILON = 0.00000000001;

    /**
     * Some checks for the constructor.
     */

public void testConstructor1446() { 
     OHLCItem item1 = new OHLCItem(new Year(2006), 2.0, 4.0, 1.0, 3.0); 
     assertEquals(new Year(2006), item1.getPeriod()); 
     assertEquals(2.0, item1.getOpenValue(), EPSILON); 
     assertEquals(4.0, item1.getHighValue(), EPSILON); 
     assertEquals(1.0, item1.getLowValue(), EPSILON); 
     assertEquals(3.0, item1.getCloseValue(), EPSILON); 
 } 


public void testEquals447() { 
     OHLCItem item1 = new OHLCItem(new Year(2006), 2.0, 4.0, 1.0, 3.0); 
     OHLCItem item2 = new OHLCItem(new Year(2006), 2.0, 4.0, 1.0, 3.0); 
     assertTrue(item1.equals(item2)); 
     assertTrue(item2.equals(item1)); 
     item1 = new OHLCItem(new Year(2007), 2.0, 4.0, 1.0, 3.0); 
     assertFalse(item1.equals(item2)); 
     item2 = new OHLCItem(new Year(2007), 2.0, 4.0, 1.0, 3.0); 
     assertTrue(item1.equals(item2)); 
     item1 = new OHLCItem(new Year(2007), 2.2, 4.0, 1.0, 3.0); 
     assertFalse(item1.equals(item2)); 
     item2 = new OHLCItem(new Year(2007), 2.2, 4.0, 1.0, 3.0); 
     assertTrue(item1.equals(item2)); 
     item1 = new OHLCItem(new Year(2007), 2.2, 4.4, 1.0, 3.0); 
     assertFalse(item1.equals(item2)); 
     item2 = new OHLCItem(new Year(2007), 2.2, 4.4, 1.0, 3.0); 
     assertTrue(item1.equals(item2)); 
     item1 = new OHLCItem(new Year(2007), 2.2, 4.4, 1.1, 3.0); 
     assertFalse(item1.equals(item2)); 
     item2 = new OHLCItem(new Year(2007), 2.2, 4.4, 1.1, 3.0); 
     assertTrue(item1.equals(item2)); 
     item1 = new OHLCItem(new Year(2007), 2.2, 4.4, 1.1, 3.3); 
     assertFalse(item1.equals(item2)); 
     item2 = new OHLCItem(new Year(2007), 2.2, 4.4, 1.1, 3.3); 
     assertTrue(item1.equals(item2)); 
 } 

    

    /**
     * Confirm that the equals method can distinguish all the required fields.
     */
    

    /**
     * Some checks for the clone() method.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

}
