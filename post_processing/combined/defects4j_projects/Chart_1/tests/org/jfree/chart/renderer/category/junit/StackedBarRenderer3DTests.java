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
 * StackedBarRenderer3DTests.java
 * ------------------------------
 * (C) Copyright 2003-2009, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 25-Mar-2003 : Version 1 (DG);
 * 18-Jan-2007 : Added many new tests (DG);
 * 23-Apr-2008 : Added testPublicCloneable() (DG);
 * 03-Feb-2009 : Added testFindRangeBounds() (DG);
 * 
 */

package org.jfree.chart.renderer.category.junit;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.List;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.chart.renderer.category.StackedBarRenderer3D;
import org.jfree.chart.util.PublicCloneable;
import org.jfree.data.Range;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 * Tests for the {@link StackedBarRenderer3D} class.
 */
public class StackedBarRenderer3DTests extends TestCase {

    /**
     * Provide access to protected method.
     */
    static class MyRenderer extends StackedBarRenderer3D {
        public List createStackedValueList(CategoryDataset dataset,
                Comparable category, int[] includedRows, double base,
                boolean asPercentages) {
            return super.createStackedValueList(dataset, category, 
                    includedRows, base, asPercentages);
        }
    }

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(StackedBarRenderer3DTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public StackedBarRenderer3DTests(String name) {
        super(name);
    }

    /**
     * Some checks for the findRangeBounds() method.
     */
public void testSerialization36() { 
     StackedBarRenderer3D r1 = new StackedBarRenderer3D(); 
     StackedBarRenderer3D r2 = null; 
     try { 
         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); 
         ObjectOutput out = new ObjectOutputStream(buffer); 
         out.writeObject(r1); 
         out.close(); 
         ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray())); 
         r2 = (StackedBarRenderer3D) in.readObject(); 
         in.close(); 
     } catch (Exception e) { 
         e.printStackTrace(); 
     } 
     assertEquals(r1, r2); 
 }
    

    /**
     * Check that the equals() method distinguishes all fields.
     */
    

    /**
     * Two objects that are equal are required to return the same hashCode.
     */
    

    /**
     * Confirm that cloning works.
     */
    

    /**
     * Check that this class implements PublicCloneable.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

    /**
     * A test for the createStackedValueList() method.
     */
    

    /**
     * A test for the createStackedValueList() method.
     */
    

    /**
     * A test for the createStackedValueList() method.
     */
    

    /**
     * A test for the createStackedValueList() method.
     */
    

    /**
     * A test for the createStackedValueList() method.
     */
    

    /**
     * A test for the createStackedValueList() method.
     */
    

    /**
     * A test for the createStackedValueList() method.
     */
    

    /**
     * A test for the createStackedValueList() method.
     */
    

    /**
     * A test for the createStackedValueList() method.
     */
    

    /**
     * A test for the createStackedValueList() method.
     */
    

    /**
     * A test for the createStackedValueList() method.
     */
    

    /**
     * A test for the createStackedValueList() method.
     */
    

    /**
     * A test for the createStackedValueList() method.
     */
    

    /**
     * A test for the createStackedValueList() method.
     */
    

    /**
     * A test for the createStackedValueList() method.
     */
    

    /**
     * A test for the createStackedValueList() method.
     */
    

    /**
     * A test for the createStackedValueList() method.
     */
    
}
