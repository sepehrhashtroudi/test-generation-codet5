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
 * ----------------------------------------
 * StandardXYSeriesLabelGeneratorTests.java
 * ----------------------------------------
 * (C) Copyright 2006-2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 24-Nov-2006 : Version 1 (DG);
 * 23-Apr-2008 : Added testPublicCloneable() (DG)
 *
 */

package org.jfree.chart.labels.junit;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.chart.labels.StandardXYSeriesLabelGenerator;
import org.jfree.chart.util.PublicCloneable;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 * Tests for the {@link StandardXYSeriesLabelGenerator} class.
 */
public class StandardXYSeriesLabelGeneratorTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(StandardXYSeriesLabelGeneratorTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public StandardXYSeriesLabelGeneratorTests(String name) {
        super(name);
    }

    /**
     * Some checks for the generalLabel() method.
     */
public void testCreateItemArray5266() { XYSeriesCollection d = new XYSeriesCollection(); XYSeries s1 = new XYSeries("S1"); s1.add(1.0, 1.1); s1.add(2.0, 2.2); d.addSeries(s1); XYSeries s2 = new XYSeries("S2"); s2.add(1.0, 1.1); s2.add(2.0, 2.2); d.addSeries(s2); XYSeriesCollection d2 = new XYSeriesCollection(); XYSeries s3 = new XYSeries("S3"); s3.add(1.0, 1.1);
}

public void testEquals5269() { StandardXYSeriesLabelGenerator g1 = new StandardXYSeriesLabelGenerator(); StandardXYSeriesLabelGenerator g2 = new StandardXYSeriesLabelGenerator(); assertEquals(g1, g2); }
public void testHashCode5270() { StandardXYSeriesLabelGenerator g1 = new StandardXYSeriesLabelGenerator(); StandardXYSeriesLabelGenerator g2 = new StandardXYSeriesLabelGenerator(); assertEquals(g1.hashCode(), g2.hashCode()); }
    

    /**
     * Some checks for the equals() method.
     */
    

    /**
     * Simple check that hashCode is implemented.
     */
    

    /**
     * Confirm that cloning works.
     */
    

    /**
     * Check to ensure that this class implements PublicCloneable.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    
}
