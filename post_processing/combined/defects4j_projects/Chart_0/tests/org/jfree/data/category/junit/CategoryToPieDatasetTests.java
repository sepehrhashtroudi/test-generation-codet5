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
 * ------------------------------
 * CategoryToPieDatasetTests.java
 * ------------------------------
 * (C) Copyright 2006-2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 26-Jul-2006 : Version 1 (DG);
 * 01-Aug-2006 : Added testGetIndex() method (DG);
 * 21-Jun-2007 : Removed JCommon dependencies (DG);
 *
 */

package org.jfree.data.category.junit;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.chart.util.TableOrder;
import org.jfree.data.category.CategoryToPieDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.pie.DefaultPieDataset;

/**
 * Tests for the {@link CategoryToPieDataset} class.
 */
public class CategoryToPieDatasetTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(CategoryToPieDatasetTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public CategoryToPieDatasetTests(String name) {
        super(name);
    }

    /**
     * Some tests for the constructor.
     */
public void testSerialization112() { 
     DefaultCategoryDataset underlying = new DefaultCategoryDataset(); 
     underlying.addValue(1.1, "R1", "C1"); 
     underlying.addValue(2.2, "R1", "C2"); 
     CategoryToPieDataset d1 = new CategoryToPieDataset(underlying, TableOrder.BY_ROW, 0); 
     CategoryToPieDataset d2 = null; 
     try { 
         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); 
         ObjectOutput out = new ObjectOutputStream(buffer); 
         out.writeObject(d1); 
         out.close(); 
         ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray())); 
         d2 = (CategoryToPieDataset) in.readObject(); 
         in.close(); 
     } catch (Exception e) { 
         e.printStackTrace(); 
     } 
     assertEquals(d1, d2); 
     assertEquals(d1.getUnderlyingDataset(), d2.getUnderlyingDataset()); 
     assertEquals(d1.getExtractType(), d2.getExtractType()); 
     assertEquals(d1.getExtractIndex(), d2.getExtractIndex()); 
 }
public void testGetValue114() { 
     DefaultCategoryDataset underlying = new DefaultCategoryDataset(); 
     underlying.addValue(1.1, "R1", "C1"); 
     underlying.addValue(2.2, "R1", "C2"); 
     CategoryToPieDataset d1 = new CategoryToPieDataset(underlying, TableOrder.BY_ROW, 0); 
     assertEquals(d1.getValue("C1"), new Double(1.1)); 
     assertEquals(d1.getValue("C2"), new Double(2.2)); 
     try { 
         d1.getValue(-1); 
         fail("Expected IndexOutOfBoundsException."); 
     } catch (IndexOutOfBoundsException e) { 
     } 
     try { 
         d1.getValue(d1.getItemCount()); 
         fail("Expected IndexOutOfBoundsException."); 
     } catch (IndexOutOfBoundsException e) { 
     } 
     CategoryToPieDataset p1 = new CategoryToPieDataset(null, TableOrder.BY_COLUMN, 0); 
     try { 
         p1.getValue(0); 
         fail("Expected IndexOutOfBoundsException."); 
     } catch (IndexOutOfBoundsException e) { 
     } 
 }
public void testGetKey115() { 
     DefaultCategoryDataset underlying = new DefaultCategoryDataset(); 
     underlying.addValue(1.1, "R1", "C1"); 
     underlying.addValue(2.2, "R1", "C2"); 
     CategoryToPieDataset d1 = new CategoryToPieDataset(underlying, TableOrder.BY_ROW, 0); 
     assertEquals("C1", d1.getKey(0)); 
     assertEquals("C2", d1.getKey(1)); 
     try { 
         d1.getKey(-1); 
         fail("Expected IndexOutOfBoundsException."); 
     } catch (IndexOutOfBoundsException e) { 
     } 
     try { 
         d1.getKey(d1.getItemCount()); 
         fail("Expected IndexOutOfBoundsException."); 
     } catch (IndexOutOfBoundsException e) { 
     } 
     CategoryToPieDataset p1 = new CategoryToPieDataset(null, TableOrder.BY_COLUMN, 0); 
     try { 
         p1.getKey(0); 
         fail("Expected IndexOutOfBoundsException."); 
     } catch (IndexOutOfBoundsException e) { 
     } 
     CategoryToPieDataset p2 = new CategoryToPieDataset(null, TableOrder.BY_COLUMN, 1); 
     try { 
         p2.getKey(1); 
         fail("Expected IndexOutOfBoundsException."); 
     } catch (IndexOutOfBoundsException e) { 
     } 
 }
public void testGetIndex116() { 
     DefaultCategoryDataset underlying = new DefaultCategoryDataset(); 
     underlying.addValue(1.1, "R1", "C1"); 
     underlying.addValue(2.2, "R1", "C2"); 
     CategoryToPieDataset d1 = new CategoryToPieDataset(underlying, TableOrder.BY_ROW, 0); 
     assertEquals(0, d1.getIndex("C1")); 
     assertEquals(1, d1.getIndex("C2")); 
     assertEquals(-1, d1.getIndex("XX")); 
     boolean pass = false; 
     try { 
         d1.getIndex(null); 
     } catch (IllegalArgumentException e) { 
         pass = true; 
     } 
     assertTrue(pass); 
 }
public void testSerialization120() { 
     DefaultCategoryDataset underlying = new DefaultCategoryDataset(); 
     underlying.addValue(1.1, "R1", "C1"); 
     underlying.addValue(2.2, "R1", "C2"); 
     CategoryToPieDataset d1 = new CategoryToPieDataset(underlying, TableOrder.BY_COLUMN, 1); 
     CategoryToPieDataset d2 = null; 
     try { 
         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); 
         ObjectOutput out = new ObjectOutputStream(buffer); 
         out.writeObject(d1); 
         out.close(); 
         ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray())); 
         d2 = (CategoryToPieDataset) in.readObject(); 
         in.close(); 
     } catch (Exception e) { 
         e.printStackTrace(); 
     } 
     assertEquals(d1, d2); 
     assertEquals(d1.getUnderlyingDataset(), d2.getUnderlyingDataset()); 
     assertEquals(d1.getExtractType(), d2.getExtractType()); 
     assertEquals(d1.getExtractIndex(), d2.getExtractIndex()); 
 }
    

    /**
     * Some checks for the getValue() method.
     */
    

    /**
     * Some checks for the getKey(int) method.
     */
    

    /**
     * Some checks for the getIndex() method.
     */
    

    /**
     * For datasets, the equals() method just checks keys and values.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

}
