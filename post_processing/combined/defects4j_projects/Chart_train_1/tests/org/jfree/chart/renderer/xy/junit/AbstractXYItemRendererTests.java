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
 * --------------------------------
 * AbstractXYItemRendererTests.java
 * --------------------------------
 * (C) Copyright 2004-2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 06-Oct-2004 : Version 1 (DG);
 * 24-Nov-2006 : Added cloning tests (DG);
 *
 */

package org.jfree.chart.renderer.xy.junit;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.chart.annotations.XYTextAnnotation;
import org.jfree.chart.labels.StandardXYSeriesLabelGenerator;
import org.jfree.chart.renderer.xy.AbstractXYItemRenderer;
import org.jfree.chart.renderer.xy.StandardXYItemRenderer;
import org.jfree.chart.renderer.xy.XYBarRenderer;
import org.jfree.chart.util.Layer;
import org.jfree.data.Range;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 * Tests for the {@link AbstractXYItemRenderer} class.
 */
public class AbstractXYItemRendererTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(AbstractXYItemRendererTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public AbstractXYItemRendererTests(String name) {
        super(name);
    }

    /**
     * Creates a test dataset.
     *
     * @return A test dataset.
     */
    private XYDataset createDataset1() {
        XYSeries series = new XYSeries("Series");
        series.add(1.0, 1.0);
        series.add(2.0, 2.0);
        series.add(3.0, 3.0);
        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(series);
        return dataset;
    }

    private static final double EPSILON = 0.0000000001;

    /**
     * Some checks for the findDomainBounds() method.
     */

public void testEquals293() { 
     XYBarRenderer r1 = new XYBarRenderer(); 
     XYBarRenderer r2 = new XYBarRenderer(); 
     assertTrue(r1.equals(r2)); 
     r1.addAnnotation(new XYTextAnnotation("ABC", 1.0, 2.0), Layer.BACKGROUND); 
     assertFalse(r1.equals(r2)); 
     r2.addAnnotation(new XYTextAnnotation("ABC", 1.0, 2.0), Layer.BACKGROUND); 
     assertTrue(r1.equals(r2)); 
     r1.addAnnotation(new XYTextAnnotation("DEF", 3.0, 4.0), Layer.FOREGROUND); 
     assertFalse(r1.equals(r2)); 
     r2.addAnnotation(new XYTextAnnotation("DEF", 3.0, 4.0), Layer.FOREGROUND); 
     assertTrue(r1.equals(r2)); 
     r1.setDefaultEntityRadius(99); 
     assertFalse(r1.equals(r2)); 
     r2.setDefaultEntityRadius(99); 
     assertTrue(r1.equals(r2)); 
     r1.setLegendItemLabelGenerator(new StandardXYSeriesLabelGenerator("X:{0}")); 
     assertFalse(r1.equals(r2)); 
     r2.setLegendItemLabelGenerator(new StandardXYSeriesLabelGenerator("X:{0}")); 
     assertTrue(r1.equals(r2)); 
     r1.setLegendItemToolTipGenerator(new StandardXYSeriesLabelGenerator("X:{0}")); 
     assertFalse(r1.equals(r2)); 
     r2.setLegendItemToolTipGenerator(new StandardXYSeriesLabelGenerator("X:{0}")); 
     assertTrue(r1.equals(r2)); 
     r1.setLegendItemURLGenerator(new StandardXYSeriesLabelGenerator("X:{0}")); 
     assertFalse(r1.equals(r2)); 
     r2.setLegendItemURLGenerator(new StandardXYSeriesLabelGenerator("X:{0}")); 
     assertTrue(r1.equals(r2)); 
 } 


public void testFindRangeBounds370() { 
     AbstractXYItemRenderer renderer = new StandardXYItemRenderer(); 
     assertTrue(renderer.findRangeBounds(null) == null); 
 } 


public void testCloning_LegendItemLabelGenerator371() { 
     StandardXYSeriesLabelGenerator generator = new StandardXYSeriesLabelGenerator("Series {0}"); 
     XYBarRenderer r1 = new XYBarRenderer(); 
     r1.setLegendItemLabelGenerator(generator); 
     XYBarRenderer r2 = null; 
     try { 
         r2 = (XYBarRenderer) r1.clone(); 
     } catch (CloneNotSupportedException e) { 
         e.printStackTrace(); 
     } 
     assertTrue(r1 != r2); 
     assertTrue(r1.getClass() == r2.getClass()); 
     assertTrue(r1.equals(r2)); 
     assertTrue(r1.getLegendItemLabelGenerator() != r2.getLegendItemLabelGenerator()); 
 } 


public void testCloning_LegendItemToolTipGenerator372() { 
     StandardXYSeriesLabelGenerator generator = new StandardXYSeriesLabelGenerator("Series {0}"); 
     XYBarRenderer r1 = new XYBarRenderer(); 
     r1.setLegendItemToolTipGenerator(generator); 
     XYBarRenderer r2 = null; 
     try { 
         r2 = (XYBarRenderer) r1.clone(); 
     } catch (CloneNotSupportedException e) { 
         e.printStackTrace(); 
     } 
     assertTrue(r1 != r2); 
     assertTrue(r1.getClass() == r2.getClass()); 
     assertTrue(r1.equals(r2)); 
     assertTrue(r1.getLegendItemToolTipGenerator() != r2.getLegendItemToolTipGenerator()); 
 } 


public void testFindDomainBounds373() { 
     AbstractXYItemRenderer renderer = new StandardXYItemRenderer(); 
     XYDataset dataset = createDataset1(); 
     Range r = renderer.findDomainBounds(dataset); 
     assertEquals(1.0, r.getLowerBound(), EPSILON); 
     assertEquals(3.0, r.getUpperBound(), EPSILON); 
     assertTrue(renderer.findDomainBounds(null) == null); 
 } 

    

    /**
     * Some checks for the findRangeBounds() method.
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
     * Some checks for the equals() method.
     */
    

}
