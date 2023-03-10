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
 * ---------------
 * TitleTests.java
 * ---------------
 * (C) Copyright 2004-2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 17-Feb-2004 : Version 1 (DG);
 * 20-Jun-2007 : Removed JCommon dependencies (DG);
 * 18-Sep-2008 : Updated testEquals() (DG);
 *
 */

package org.jfree.chart.title.junit;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.chart.title.TextTitle;
import org.jfree.chart.title.Title;
import org.jfree.chart.util.HorizontalAlignment;
import org.jfree.chart.util.RectangleEdge;
import org.jfree.chart.util.VerticalAlignment;

/**
 * Tests for the abstract {@link Title} class.
 */
public class TitleTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(TitleTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public TitleTests(String name) {
        super(name);
    }

    /**
     * Some checks for the equals() method.
     */

public void testEquals718() { 
     Title t1 = new TextTitle(); 
     Title t2 = new TextTitle(); 
     assertEquals(t1, t2); 
     t1.setPosition(RectangleEdge.LEFT); 
     assertFalse(t1.equals(t2)); 
     t2.setPosition(RectangleEdge.LEFT); 
     assertTrue(t1.equals(t2)); 
     t1.setHorizontalAlignment(HorizontalAlignment.RIGHT); 
     assertFalse(t1.equals(t2)); 
     t2.setHorizontalAlignment(HorizontalAlignment.RIGHT); 
     assertTrue(t1.equals(t2)); 
     t1.setVerticalAlignment(VerticalAlignment.BOTTOM); 
     assertFalse(t1.equals(t2)); 
     t2.setVerticalAlignment(VerticalAlignment.BOTTOM); 
     assertTrue(t1.equals(t2)); 
     t1.setVisible(false); 
     assertFalse(t1.equals(t2)); 
     t2.setVisible(false); 
     assertTrue(t1.equals(t2)); 
 } 

    

    /**
     * Two objects that are equal are required to return the same hashCode.
     */
    

}
