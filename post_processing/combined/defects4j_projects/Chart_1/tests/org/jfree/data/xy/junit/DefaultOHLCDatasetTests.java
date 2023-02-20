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
 * DefaultOHLCDatasetTests.java
 * ----------------------------
 * (C) Copyright 2005-2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 29-Apr-2005 : Version 1 (DG);
 * 28-Nov-2006 : Extended equals() test (DG);
 * 22-Apr-2008 : Added testPublicCloneable (DG);
 *
 */

package org.jfree.data.xy.junit;

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

import org.jfree.chart.util.PublicCloneable;
import org.jfree.data.Range;
import org.jfree.data.general.DatasetUtilities;
import org.jfree.data.xy.DefaultOHLCDataset;
import org.jfree.data.xy.OHLCDataItem;

/**
 * Tests for the {@link DefaultOHLCDataset} class.
 */
public class DefaultOHLCDatasetTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(DefaultOHLCDatasetTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public DefaultOHLCDatasetTests(String name) {
        super(name);
    }

    private static final double EPSILON = 0.0000000001;

    /**
     * A small test for the data range calculated on this dataset.
     */
public void testGetHighValue374() { 
     DefaultOHLCDataset d = new DefaultOHLCDataset("Series 1", new OHLCDataItem[0]); 
     assertEquals(1.1, d.getHighValue(0, 0), EPSILON); 
     assertEquals(2.1, d.getHighValue(0, 1), EPSILON); 
     assertEquals(3.1, d.getHighValue(0, 2), EPSILON); 
     assertEquals(4.1, d.getHighValue(0, 3), EPSILON); 
     assertEquals(5.1, d.getHighValue(0, 4), EPSILON); 
     assertEquals(1.1, d.getLowValue(0, 0), EPSILON); 
     assertEquals(2.1, d.getLowValue(0, 1), EPSILON); 
     assertEquals(3.1, d.getHighValue(0, 2), EPSILON); 
     assertEquals(4.1, d.getCloseValue(0, 0), EPSILON); 
     assertEquals(5.1, d.getCloseValue(0, 1), EPSILON); 
 }
public void testGetLowValue2376() { 
     DefaultOHLCDataset d = new DefaultOHLCDataset("Series 1", new OHLCDataItem[0]); 
     assertTrue(Double.isNaN(d.getLowValue(0, 0))); 
     assertTrue(Double.isNaN(d.getLowValue(0, 1))); 
     assertEquals(1.0, d.getLowValue(0, 2), EPSILON); 
     assertEquals(1.0, d.getLowValue(0, 3), EPSILON); 
     assertEquals(2.0, d.getLowValue(0, 4), EPSILON); 
     assertEquals(3.0, d.getLowValue(0, 5), EPSILON); 
     assertEquals(4.0, d.getLowValue(0, 6), EPSILON); 
     assertEquals(5.0, d.getLowValue(0, 7), EPSILON); 
     assertEquals(9.0, d.getHighValue(0, 0), EPSILON); 
     assertEquals(1.0, d.getOpenValue(0, 0), EPSILON); 
     assertEquals(2.0, d.getCloseValue(0, 0), EPSILON); 
     assertEquals(3.0, d.getCloseValue(0, 1), EPSILON); 
 }
public void testGetLowValue2377() { 
     DefaultOHLCDataset d = new DefaultOHLCDataset("Series 1", new OHLCDataItem[0]); 
     assertTrue(Double.isNaN(d.getLowValue(0, 0))); 
     assertTrue(Double.isNaN(d.getLowValue(0, 1))); 
     assertEquals(1.1, d.getLowValue(0, 2), EPSILON); 
     assertEquals(2.1, d.getLowValue(0, 3), EPSILON); 
     assertEquals(3.1, d.getLowValue(0, 4), EPSILON); 
     assertEquals(1.1, d.getLowValue(0, 5), EPSILON); 
     assertEquals(2.1, d.getLowValue(0, 6), EPSILON); 
     assertEquals(3.1, d.getHighValue(0, 0), EPSILON); 
     assertEquals(4.1, d.getHighValue(0, 1), EPSILON); 
     assertEquals(5.1, d.getOpenValue(0, 0), EPSILON); 
     assertEquals(6.1, d.getOpenValue(0, 1), EPSILON); 
     assertEquals(7.1, d.getCloseValue(0, 0), EPSILON); 
     assertEquals(7.1, d.getCloseValue(0, 1), EPSILON); 
 }
public void testGetLowValue2378() { 
     DefaultOHLCDataset d = new DefaultOHLCDataset("Series 1", new OHLCDataItem[0]); 
     assertTrue(Double.isNaN(d.getLowValue(0, 0))); 
     assertTrue(Double.isNaN(d.getLowValue(0, 1))); 
     assertEquals(1.0, d.getLowValue(0, 2), EPSILON); 
     assertEquals(1.0, d.getLowValue(0, 3), EPSILON); 
     assertEquals(2.0, d.getLowValue(0, 4), EPSILON); 
     assertEquals(3.0, d.getLowValue(0, 5), EPSILON); 
     assertEquals(4.0, d.getLowValue(0, 6), EPSILON); 
     assertEquals(5.0, d.getLowValue(0, 7), EPSILON); 
     assertEquals(6.0, d.getHighValue(0, 0), EPSILON); 
     assertEquals(1.0, d.getOpenValue(0, 0), EPSILON); 
     assertEquals(3.0, d.getCloseValue(0, 0), EPSILON); 
     assertEquals(4.0, d.getCloseValue(0, 1), EPSILON); 
 }
    

    /**
     * Confirm that the equals method can distinguish all the required fields.
     */
    

    /**
     * Confirm that cloning works.
     */
    

    /**
     * Confirm that cloning works.
     */
    

    /**
     * Verify that this class implements {@link PublicCloneable}.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

}
