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
 * ---------------------
 * KeyedObjectTests.java
 * ---------------------
 * (C) Copyright 2004-2008, by Object Refinery Limited.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 27-Jan-2004 : Version 1 (DG);
 * 28-Sep-2007 : Added testCloning2() (DG);
 *
 */

package org.jfree.data.junit;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.data.KeyedObject;
import org.jfree.data.pie.DefaultPieDataset;

/**
 * Tests for the {@link KeyedObject} class.
 */
public class KeyedObjectTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(KeyedObjectTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public KeyedObjectTests(String name) {
        super(name);
    }

    /**
     * Confirm that the equals method can distinguish all the required fields.
     */
public void testClone6094() throws CloneNotSupportedException { KeyedObject ko1 = new KeyedObject("Test1", "Test1"); KeyedObject ko2 = (KeyedObject) ko1.clone(); assertEquals("Test1", ko1.getKey()); assertEquals("Test1", ko2.getKey()); assertEquals("Test1", ko1.getObject()); KeyedObject ko3 = (KeyedObject) ko2.clone(); assertEquals("Test1", ko3.getKey()); assertEquals("Test1", ko3.getObject()); }
    

    /**
     * Confirm that cloning works.
     */
    

    /**
     * Confirm special features of cloning.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

}