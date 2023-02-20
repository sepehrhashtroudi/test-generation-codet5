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
 * --------------------------
 * DefaultXYDatasetTests.java
 * --------------------------
 * (C) Copyright 2006-2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 06-Jul-2006 : Version 1 (DG);
 * 02-Nov-2006 : Added testAddSeries() method (DG);
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

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.chart.util.PublicCloneable;
import org.jfree.data.xy.DefaultXYDataset;

/**
 * Tests for {@link DefaultXYDataset}.
 */
public class DefaultXYDatasetTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(DefaultXYDatasetTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public DefaultXYDatasetTests(String name) {
        super(name);
    }

    /**
     * Confirm that the equals method can distinguish all the required fields.
     */
public void testGetSeriesKey964() { 
     DefaultXYDataset d = new DefaultXYDataset(); 
     assertNull(d.getSeriesKey(0)); 
     d.addSeries("S1", new double[][] { { 1.0 }, { 2.0 } }); 
     assertEquals("S1", d.getSeriesKey(0)); 
     assertEquals("S2", d.getSeriesKey(1)); 
     boolean pass = false; 
     try { 
         d.getSeriesKey(-1); 
     } catch (IllegalArgumentException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
     pass = false; 
     try { 
         d.getSeriesKey(2); 
     } catch (IllegalArgumentException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
     pass = false; 
     try { 
         d.getSeriesKey(2); 
     } catch (IllegalArgumentException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
 }
public void testCloning965() { 
     DefaultXYDataset d1 = new DefaultXYDataset(); 
     DefaultXYDataset d2 = null; 
     try { 
         d2 = (DefaultXYDataset) d1.clone(); 
     } catch (CloneNotSupportedException e) { 
         e.printStackTrace(); 
     } 
     assertTrue(d1 != d2); 
     assertTrue(d1.getClass() == d2.getClass()); 
     assertTrue(d1.equals(d2)); 
     double[] x1 = new double[] { 1.0, 2.0, 3.0 }; 
     double[] y1 = new double[] { 4.0, 5.0, 6.0 }; 
     double[] z1 = new double[] { 7.0, 8.0, 9.0 }; 
     double[][] data1 = new double[][] { x1, y1, z1 }; 
     d1.addSeries("S1", data1); 
     try { 
         d2 = (DefaultXYDataset) d1.clone(); 
     } catch (CloneNotSupportedException e) { 
         e.printStackTrace(); 
     } 
     assertTrue(d1 != d2); 
     assertTrue(d1.getClass() == d2.getClass()); 
     assertTrue(d1.equals(d2)); 
     x1[1] = 2.2; 
     assertFalse(d1.equals(d2)); 
     x1[1] = 2.0; 
     assertTrue(d1.equals(d2)); 
     x1[1] = 2.0; 
     assertTrue(d1.equals(d2)); 
     x1[1] = 2.0; 
     assertTrue(d1.equals(d2)); 
     x1[1] = 2.0; 
     assertTrue(d1.equals(d2));
}

public void testCloning969() { 
     DefaultXYDataset d1 = new DefaultXYDataset(); 
     DefaultXYDataset d2 = null; 
     try { 
         d2 = (DefaultXYDataset) d1.clone(); 
     } catch (CloneNotSupportedException e) { 
         e.printStackTrace(); 
     } 
     assertTrue(d1 != d2); 
     assertTrue(d1.getClass() == d2.getClass()); 
     assertTrue(d1.equals(d2)); 
     double[] x1 = new double[] { 1.0, 2.0, 3.0 }; 
     double[] y1 = new double[] { 4.0, 5.0, 6.0 }; 
     double[] z1 = new double[] { 7.0, 8.0, 9.0 }; 
     double[][] data1 = new double[][] { x1, y1, z1 }; 
     d1.addSeries("S1", data1); 
     try { 
         d2 = (DefaultXYDataset) d1.clone(); 
     } catch (CloneNotSupportedException e) { 
         e.printStackTrace(); 
     } 
     assertTrue(d1 != d2); 
     assertTrue(d1.getClass() == d2.getClass()); 
     assertTrue(d1.equals(d2)); 
     x1[1] = 2.2; 
     assertFalse(d1.equals(d2)); 
     x1[1] = 2.0; 
     assertTrue(d1.equals(d2)); 
     x1[1] = 2.0; 
     assertTrue(d1.equals(d2)); 
     x1[1] = 2.0; 
     assertTrue(d1.equals(d2)); 
     x1[2] = 2.0; 
     assertTrue(d1.equals(d2));
}

    

    /**
     * Confirm that cloning works.
     */
    

    /**
     * Verify that this class implements {@link PublicCloneable}.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

    /**
     * Some checks for the getSeriesKey(int) method.
     */
    

    /**
     * Some checks for the indexOf(Comparable) method.
     */
    

    static final double EPSILON = 0.0000000001;

    /**
     * Some tests for the addSeries() method.
     */
    

    /**
     * Creates a sample dataset for testing.
     *
     * @return A sample dataset.
     */
    public DefaultXYDataset createSampleDataset1() {
        DefaultXYDataset d = new DefaultXYDataset();
        double[] x1 = new double[] {1.0, 2.0, 3.0};
        double[] y1 = new double[] {4.0, 5.0, 6.0};
        double[][] data1 = new double[][] {x1, y1};
        d.addSeries("S1", data1);

        double[] x2 = new double[] {1.0, 2.0, 3.0};
        double[] y2 = new double[] {4.0, 5.0, 6.0};
        double[][] data2 = new double[][] {x2, y2};
        d.addSeries("S2", data2);
        return d;
    }

}
