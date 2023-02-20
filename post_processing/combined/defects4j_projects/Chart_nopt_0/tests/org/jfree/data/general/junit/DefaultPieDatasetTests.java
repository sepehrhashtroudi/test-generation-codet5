/* ===========================================================
 * JFreeChart : a free chart library for the Java(tm) platform
 * ===========================================================
 *
 * (C) Copyright 2000-2007, by Object Refinery Limited and Contributors.
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
 * --------------------
 * PieDatasetTests.java
 * --------------------
 * (C) Copyright 2003-2007, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 18-Aug-2003 : Version 1 (DG);
 * 31-Jul-2006 : Added test for new clear() method (DG);
 * 01-Aug-2006 : Added testGetKey() and testGetIndex() methods (DG);
 *
 */

package org.jfree.data.general.junit;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.data.event.DatasetChangeEvent;
import org.jfree.data.event.DatasetChangeListener;
import org.jfree.data.pie.DefaultPieDataset;

/**
 * Tests for the {@link org.jfree.data.general.PieDataset} class.
 */
public class DefaultPieDatasetTests extends TestCase
    implements DatasetChangeListener {

    private DatasetChangeEvent lastEvent;

    /**
     * Records the last event.
     *
     * @param event  the event.
     */
    public void datasetChanged(DatasetChangeEvent event) {
        this.lastEvent = event;
    }

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(DefaultPieDatasetTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public DefaultPieDatasetTests(String name) {
        super(name);
    }

    /**
     * Some tests for the clear() method.
     */
public void testClear3170() { DefaultPieDataset d = new DefaultPieDataset(); d.setValue("A", 1.0); d.setValue("B", 2.0); d.setValue("C", 3.0); d.setValue("D", 4.0); d.clear(); assertEquals(0, d.getItemCount()); }
public void testClear3171() { DefaultPieDataset d = new DefaultPieDataset(); d.setValue("A", 1.0); d.setValue("B", 2.0); d.setValue("C", 3.0); d.clear(); assertEquals(0, d.getItemCount()); }
    

    /**
     * Some checks for the getKey(int) method.
     */
    

    /**
     * Some checks for the getIndex() method.
     */
    

    /**
     * Confirm that cloning works.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

}
