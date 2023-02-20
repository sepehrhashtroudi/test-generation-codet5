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
 * -------------------------------
 * CustomPieURLGeneratorTests.java
 * -------------------------------
 * (C) Copyright 2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 11-Apr-2008 : Version 1 (DG);
 * 23-Apr-2008 : Added testPublicCloneable (DG);
 *
 */

package org.jfree.chart.urls.junit;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.chart.urls.CustomPieURLGenerator;
import org.jfree.chart.util.PublicCloneable;

/**
 * Tests for the {@link CustomPieURLGenerator} class.
 */
public class CustomPieURLGeneratorTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(CustomPieURLGeneratorTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public CustomPieURLGeneratorTests(String name) {
        super(name);
    }

    /**
     * Some checks for the equals() method.
     */
public void testClone160() throws CloneNotSupportedException { CustomPieURLGenerator g1 = new CustomPieURLGenerator(); g1.addURLs(new HashMap()); CustomPieURLGenerator g2 = (CustomPieURLGenerator) g1.clone(); assertEquals(g1, g2); }
public void testClone161() throws CloneNotSupportedException { CustomPieURLGenerator g1 = new CustomPieURLGenerator(); CustomPieURLGenerator g2 = (CustomPieURLGenerator) g1.clone(); assertEquals(g1, g2); }
public void testClone164() throws CloneNotSupportedException { CustomPieURLGenerator g1 = new CustomPieURLGenerator(); CustomPieURLGenerator g2 = (CustomPieURLGenerator) g1.clone(); assertEquals(g1.getListCount(), g2.getListCount()); assertEquals(g1.getURL(null, 0), g2.getURL(null, 0)); }
    

    /**
     * Confirm that cloning works.
     */
    

    /**
     * Checks that the class implements PublicCloneable.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

}
