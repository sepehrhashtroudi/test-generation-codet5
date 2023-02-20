/* ===========================================================
 * JFreeChart : a free chart library for the Java(tm) platform
 * ===========================================================
 *
 * (C) Copyright 2000-2010, by Object Refinery Limited and Contributors.
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
 * --------------------------------------
 * AbstractCategoryItemRendererTests.java
 * --------------------------------------
 * (C) Copyright 2004-2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 12-Feb-2004 : Version 1 (DG);
 * 24-Nov-2006 : New cloning tests (DG);
 * 07-Dec-2006 : Added testEquals() method (DG);
 * 26-Jun-2007 : Added testGetSeriesItemLabelGenerator() and
 *               testGetSeriesURLGenerator() (DG);
 * 25-Nov-2008 : Added testFindRangeBounds() (DG);
 * 09-Feb-2010 : Added test2947660() (DG);
 *
 */

package org.jfree.chart.renderer.category.junit;

import java.text.NumberFormat;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.chart.LegendItemCollection;
import org.jfree.chart.annotations.CategoryTextAnnotation;
import org.jfree.chart.labels.IntervalCategoryItemLabelGenerator;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.chart.labels.StandardCategorySeriesLabelGenerator;
import org.jfree.chart.labels.StandardCategoryToolTipGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.renderer.category.AbstractCategoryItemRenderer;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.CategoryItemRenderer;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;
import org.jfree.chart.urls.StandardCategoryURLGenerator;
import org.jfree.chart.util.Layer;
import org.jfree.data.Range;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 * Tests for the {@link AbstractCategoryItemRenderer} class.
 */
public class AbstractCategoryItemRendererTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(AbstractCategoryItemRendererTests.class);
    }

    /**
     * Checks that all fields are distinguished.
     */
    

    /**
     * Confirm that cloning works.
     */
    

    /**
     * Confirm that cloning works.
     */
    

    /**
     * Check that the legendItemLabelGenerator is cloned.
     */
    

    /**
     * Check that the legendItemToolTipGenerator is cloned.
     */
    

    /**
     * Check that the legendItemURLGenerator is cloned.
     */
    

    /**
     * Check that the getSeriesItemLabelGenerator() method behaves as
     * expected.
     */
    

    /**
     * Check that the getSeriesURLGenerator() method behaves as expected.
     */
    

    /**
     * Some checks for the findRangeBounds() method.
     */
    

    /**
     * A test that reproduces the problem reported in bug 2947660.
     */
    

}

