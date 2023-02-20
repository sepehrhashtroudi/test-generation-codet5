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
 * ---------------------------
 * RendererUtilitiesTests.java
 * ---------------------------
 * (C) Copyright 2007-2009, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 19-Apr-2007 : Version 1 (DG);
 *
 */

package org.jfree.chart.renderer.junit;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.chart.renderer.RendererUtilities;
import org.jfree.data.DomainOrder;
import org.jfree.data.xy.DefaultXYDataset;

/**
 * Some checks for the {@link RendererUtilities} class.
 */
public class RendererUtilitiesTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(RendererUtilitiesTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public RendererUtilitiesTests(String name) {
        super(name);
    }

    /**
     * Some checks for the findLiveItemsLowerBound() method when the dataset is
     * unordered.
     */

public void testFindLiveItemsLowerBound_Ascending178() { 
     DefaultXYDataset d = new DefaultXYDataset() { 
  
         public DomainOrder getDomainOrder() { 
             return DomainOrder.ASCENDING; 
         } 
     }; 
     d.addSeries("S1", new double[][] { {}, {} }); 
     assertEquals(0, RendererUtilities.findLiveItemsLowerBound(d, 0, 10.0, 11.1)); 
     d.addSeries("S2", new double[][] { { 1.0 }, { 9.9 } }); 
     assertEquals(0, RendererUtilities.findLiveItemsLowerBound(d, 1, 0.0, 1.1)); 
     assertEquals(0, RendererUtilities.findLiveItemsLowerBound(d, 1, 2.0, 2.2)); 
     d.addSeries("S3", new double[][] { { 1.0, 2.0 }, { 9.9, 9.9 } }); 
     assertEquals(0, RendererUtilities.findLiveItemsLowerBound(d, 2, 0.0, 1.1)); 
     assertEquals(0, RendererUtilities.findLiveItemsLowerBound(d, 2, 1.0, 2.2)); 
     assertEquals(1, RendererUtilities.findLiveItemsLowerBound(d, 2, 2.0, 3.3)); 
     assertEquals(1, RendererUtilities.findLiveItemsLowerBound(d, 2, 3.0, 4.4)); 
     d.addSeries("S4", new double[][] { { 1.0, 2.0, 3.0 }, { 9.9, 9.9, 9.9 } }); 
     assertEquals(0, RendererUtilities.findLiveItemsLowerBound(d, 3, 0.0, 1.1)); 
     assertEquals(0, RendererUtilities.findLiveItemsLowerBound(d, 3, 1.0, 2.2)); 
     assertEquals(1, RendererUtilities.findLiveItemsLowerBound(d, 3, 2.0, 3.3)); 
     assertEquals(2, RendererUtilities.findLiveItemsLowerBound(d, 3, 3.0, 4.4)); 
     d.addSeries("S5", new double[][] { { 1.0, 2.0, 3.0, 4.0 }, { 9.9, 9.9, 9.9, 9.9 } }); 
     assertEquals(0, RendererUtilities.findLiveItemsLowerBound(d, 4, 0.0, 1.1)); 
     assertEquals(0, RendererUtilities.findLiveItemsLowerBound(d, 4, 1.0, 2.2)); 
     assertEquals(1, RendererUtilities.findLiveItemsLowerBound(d, 4, 2.0, 3.3)); 
     assertEquals(2, RendererUtilities.findLiveItemsLowerBound(d, 4, 3.0, 4.4)); 
     assertEquals(3, RendererUtilities.findLiveItemsLowerBound(d, 4, 4.0, 5.5)); 
     d.addSeries("S5", new double[][] { { 1.0, 2.0, 2.0, 2.0, 3.0 }, { 9.9, 9.9, 9.9, 9.9, 9.9 } }); 
     assertEquals(0, RendererUtilities.findLiveItemsLowerBound(d, 4, 0.0, 4.0)); 
     assertEquals(0, RendererUtilities.findLiveItemsLowerBound(d, 4, 1.0, 4.0)); 
     assertEquals(1, RendererUtilities.findLiveItemsLowerBound(d, 4, 2.0, 4.0)); 
     assertEquals(4, RendererUtilities.findLiveItemsLowerBound(d, 4, 3.0, 4.0)); 
 } 


public void testFindLiveItemsUpperBound_Unordered179() { 
     DefaultXYDataset d = new DefaultXYDataset(); 
     d.addSeries("S1", new double[][] { {}, {} }); 
     assertEquals(0, RendererUtilities.findLiveItemsUpperBound(d, 0, 10.0, 11.0)); 
     d.addSeries("S2", new double[][] { { 1.0 }, { 9.9 } }); 
     assertEquals(0, RendererUtilities.findLiveItemsUpperBound(d, 1, 0.0, 1.1)); 
     assertEquals(0, RendererUtilities.findLiveItemsUpperBound(d, 1, 2.0, 3.3)); 
     d.addSeries("S3", new double[][] { { 1.0, 2.0 }, { 9.9, 9.9 } }); 
     assertEquals(0, RendererUtilities.findLiveItemsUpperBound(d, 2, 0.0, 1.1)); 
     assertEquals(1, RendererUtilities.findLiveItemsUpperBound(d, 2, 1.0, 2.2)); 
     assertEquals(1, RendererUtilities.findLiveItemsUpperBound(d, 2, 2.0, 3.3)); 
     assertEquals(0, RendererUtilities.findLiveItemsUpperBound(d, 2, 3.0, 4.4)); 
     d.addSeries("S4", new double[][] { { 1.0, 2.0, 1.5 }, { 9.9, 9.9, 9.9 } }); 
     assertEquals(0, RendererUtilities.findLiveItemsUpperBound(d, 3, 0.0, 1.1)); 
     assertEquals(2, RendererUtilities.findLiveItemsUpperBound(d, 3, 1.0, 2.2)); 
     assertEquals(1, RendererUtilities.findLiveItemsUpperBound(d, 3, 2.0, 3.3)); 
     assertEquals(0, RendererUtilities.findLiveItemsUpperBound(d, 3, 3.0, 4.4)); 
     d.addSeries("S5", new double[][] { { 1.0, 2.0, 1.5, 1.8 }, { 9.9, 9.9, 9.9, 9.9 } }); 
     assertEquals(0, RendererUtilities.findLiveItemsUpperBound(d, 4, 0.0, 1.1)); 
     assertEquals(3, RendererUtilities.findLiveItemsUpperBound(d, 4, 1.0, 2.2)); 
     assertEquals(1, RendererUtilities.findLiveItemsUpperBound(d, 4, 2.0, 3.3)); 
     assertEquals(0, RendererUtilities.findLiveItemsUpperBound(d, 4, 3.0, 4.4)); 
     assertEquals(0, RendererUtilities.findLiveItemsUpperBound(d, 4, 4.0, 5.5)); 
 } 

    

    /**
     * Some checks for the findLiveItemsLowerBound() method when the dataset is
     * ASCENDING.
     */
    

    /**
     * Some checks for the findLiveItemsLowerBound() method when the dataset is
     * DESCENDING.
     */
    

    /**
     * Some checks for the findLiveItemsUpperBound() method when the dataset is
     * unordered.
     */
    

    /**
     * Some checks for the findLiveItemsUpperBound() method when the dataset is
     * ASCENDING.
     */
    

    /**
     * Some checks for the findLiveItemsUpperBound() method when the dataset is
     * DESCENDING.
     */
    

}
