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
 * ----------------------------------
 * DefaultPolarItemRendererTests.java
 * ----------------------------------
 * (C) Copyright 2006-2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 04-Aug-2006 : Version 1 (DG);
 * 15-Mar-2007 : Added independence check to testCloning() (DG);
 *
 */

package org.jfree.chart.renderer.junit;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.chart.renderer.DefaultPolarItemRenderer;

/**
 * Tests for the {@link DefaultPolarItemRenderer} class.
 */
public class DefaultPolarItemRendererTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(DefaultPolarItemRendererTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public DefaultPolarItemRendererTests(String name) {
        super(name);
    }

    /**
     * Check that the equals() method distinguishes all fields.
     */
public void testDefaultPolarItemRenderer3690() { DefaultPolarItemRenderer r = new DefaultPolarItemRenderer(); assertEquals(r, new DefaultPolarItemRenderer()); }
public void testEquals3696() { DefaultPolarItemRenderer r1 = new DefaultPolarItemRenderer(); DefaultPolarItemRenderer r2 = new DefaultPolarItemRenderer(); assertEquals(r1, r2); r1.setSeriesFilled(0, true); assertFalse(r1.equals(r2)); r2.setSeriesFilled(0, true); assertEquals(r1, r2); r1.setSeriesFilled(1, false); assertFalse(r1.equals(r2)); r2.setSeriesFilled(1, false); assertEquals(r1, r2); }
public void testCloning3697() throws CloneNotSupportedException { DefaultPolarItemRenderer r1 = new DefaultPolarItemRenderer(); DefaultPolarItemRenderer r2 = (DefaultPolarItemRenderer) r1.clone(); assertNotSame(r1, r2); assertSame(r1.getClass(), r2.getClass()); assertEquals(r1, r2); }
    

    /**
     * Two objects that are equal are required to return the same hashCode.
     */
    

    /**
     * Confirm that cloning works.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

}
