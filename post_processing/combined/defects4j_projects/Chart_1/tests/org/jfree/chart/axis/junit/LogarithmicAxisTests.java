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
 * -------------------------
 * LogarithmicAxisTests.java
 * -------------------------
 * (C) Copyright 2003-2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 26-Mar-2003 : Version 1 (DG);
 * 02-Mar-2007 : Added tests from bug report 880597 (DG);
 * 20-Jun-2007 : Removed JCommon dependencies (DG);
 *
 */

package org.jfree.chart.axis.junit;

import java.awt.geom.Rectangle2D;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.chart.axis.LogarithmicAxis;
import org.jfree.chart.util.RectangleEdge;

/**
 * Tests for the {@link LogarithmicAxis} class.
 */
public class LogarithmicAxisTests extends TestCase {

    static class MyLogarithmicAxis extends LogarithmicAxis {

        /**
         * Creates an instance.
         *
         * @param label  the label.
         */
        public MyLogarithmicAxis(String label) {
            super(label);
        }

        /* (non-Javadoc)
         * @see org.jfree.chart.axis.LogarithmicAxis#switchedLog10(double)
         */
        protected double switchedLog10(double val) {
            return super.switchedLog10(val);
        }

    }

    /** Tolerance for floating point comparisons */
    public static double EPSILON = 0.000001;

    MyLogarithmicAxis axis = null;

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(LogarithmicAxisTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public LogarithmicAxisTests(String name) {
        super(name);
    }

    /**
     * Sets up a new axis.
     *
     * @throws Exception
     */
    protected void setUp() throws Exception {
        this.axis = new MyLogarithmicAxis("Value (log)");
        this.axis.setAllowNegativesFlag(false);
        this.axis.setLog10TickLabelsFlag(false);
        this.axis.setLowerMargin(0.0);
        this.axis.setUpperMargin(0.0);

        this.axis.setLowerBound(0.2);
        this.axis.setUpperBound(100.0);
    }

    /**
     * Serialize an instance, restore it, and check for equality.
     */
public void testSerialization1007() { 
     LogarithmicAxis a1 = new LogarithmicAxis("Test Axis"); 
     LogarithmicAxis a2 = null; 
     try { 
         ByteArrayOutputStream buffer = new ByteArrayOutputStream(); 
         ObjectOutput out = new ObjectOutputStream(buffer); 
         out.writeObject(a1); 
         out.close(); 
         ObjectInput in = new ObjectInputStream(new ByteArrayInputStream(buffer.toByteArray())); 
         a2 = (LogarithmicAxis) in.readObject(); 
         in.close(); 
     } catch (Exception e) { 
         e.printStackTrace(); 
     } 
     assertEquals(a1, a2); 
 }
public void testCloning1008() { 
     LogarithmicAxis a1 = new LogarithmicAxis("Test Axis"); 
     LogarithmicAxis a2 = null; 
     try { 
         a2 = (LogarithmicAxis) a1.clone(); 
     } catch (CloneNotSupportedException e) { 
         e.printStackTrace(); 
     } 
     assertTrue(a1 != a2); 
     assertTrue(a1.getClass() == a2.getClass()); 
     assertTrue(a1.equals(a2)); 
     a1.setAllowNegativesFlag(!a1.getAllowNegativesFlag()); 
     assertFalse(a1.equals(a2)); 
     a2.setAllowNegativesFlag(!a2.getAllowNegativesFlag()); 
     assertTrue(a1.equals(a2)); 
     a1.setExpTickLabelsFlag(!a1.getExpTickLabelsFlag()); 
     assertFalse(a1.equals(a2)); 
     a2.setExpTickLabelsFlag(!a2.getExpTickLabelsFlag()); 
     assertTrue(a1.equals(a2)); 
     a1.setAutoRangeNextLogFlag(!a1.getAutoRangeNextLogFlag()); 
     assertFalse(a1.equals(a2)); 
     a2.setAutoRangeNextLogFlag(!a2.getAutoRangeNextLogFlag()); 
     assertTrue(a1.equals(a2)); 
 }
public void testCloning1009() { 
     LogarithmicAxis a1 = new LogarithmicAxis("Test Axis"); 
     LogarithmicAxis a2 = null; 
     try { 
         a2 = (LogarithmicAxis) a1.clone(); 
     } catch (CloneNotSupportedException e) { 
         e.printStackTrace(); 
     } 
     assertTrue(a1 != a2); 
     assertTrue(a1.getClass() == a2.getClass()); 
     assertTrue(a1.equals(a2)); 
     a1.setAllowNegativesFlag(true); 
     assertFalse(a1.equals(a2)); 
     a2.setAllowNegativesFlag(true); 
     assertTrue(a1.equals(a2)); 
     a1.setExpTickLabelsFlag(true); 
     assertFalse(a1.equals(a2)); 
     a2.setExpTickLabelsFlag(true); 
     assertTrue(a1.equals(a2)); 
     a1.setLog10TickLabelsFlag(true); 
     assertFalse(a1.equals(a2)); 
     a2.setLog10TickLabelsFlag(true); 
     assertTrue(a1.equals(a2)); 
     a1.setAutoRangeNextLogFlag(true); 
     assertFalse(a1.equals(a2)); 
     a2.setAutoRangeNextLogFlag(true); 
     assertTrue(a1.equals(a2)); 
 }
public void testAdjustedLog101012() { 
     LogarithmicAxis axis = new LogarithmicAxis("Test Axis"); 
     axis.setLog10TickLabelsFlag(false); 
     axis.setAutoRangeNextLogFlag(true); 
     assertEquals(0.0, axis.adjustedLog10(0.0), EPSILON); 
     axis.setLog10TickLabelsFlag(false); 
     assertEquals(0.0, axis.adjustedLog10(0.5), EPSILON); 
     axis.setAutoRangeNextLogFlag(true); 
     assertEquals(0.5, axis.adjustedLog10(0.5), EPSILON); 
     axis.setLog10TickLabelsFlag(true); 
     assertEquals(0.5, axis.adjustedLog10(0.5), EPSILON); 
     axis.setAutoRangeNextLogFlag(true); 
     assertEquals(0.5, axis.adjustedLog10(0.5), EPSILON); 
     axis.setLog10TickLabelsFlag(false); 
     assertEquals(0.5, axis.adjustedLog10(0.5), EPSILON); 
     axis.setAutoRangeNextLogFlag(true); 
     assertEquals(0.5, axis.adjustedLog10(0.5), EPSILON); 
     axis.setLog10TickLabelsFlag(false); 
     assertEquals(0.5, axis.adjustedLog10(0.5), EPSILON); 
     axis.setAutoRangeNextLogFlag(true); 
     assertEquals(0.5, axis.adjustedLog10(0.5), EPSILON); 
     axis.setLog10TickLabelsFlag(false); 
     assertEquals(0.5, axis.adjustedLog10(0.5), EPSILON); 
     axis.setAutoRangeNextLogFlag(false); 
     assertEquals(0.5, axis.adjustedLog10(0.5), EPSILON); 
     axis.setLog10TickLabelsFlag(true);
}

public void testAdjustLog101014() { 
     LogarithmicAxis axis = new LogarithmicAxis("Test Axis"); 
     axis.setAllowNegativesFlag(true); 
     axis.setExpTickLabelsFlag(true); 
     axis.setLog10TickLabelsFlag(true); 
     axis.setAutoRangeNextLogFlag(true); 
     assertEquals(0.0, axis.adjustedLog10(0.5), EPSILON); 
     assertEquals(-0.5, axis.adjustedLog10(0.5), EPSILON); 
     axis.setAutoRangeNextLogFlag(true); 
     assertEquals(0.5, axis.adjustedLog10(0.5), EPSILON); 
     axis.setLog10TickLabelsFlag(true); 
     assertEquals(0.5, axis.adjustedLog10(0.5), EPSILON); 
     axis.setAutoRangeNextLogFlag(true); 
     assertEquals(0.5, axis.adjustedLog10(0.5), EPSILON); 
     axis.setLog10TickLabelsFlag(true); 
     assertEquals(0.5, axis.adjustedLog10(0.5), EPSILON); 
     axis.setAutoRangeNextLogFlag(true); 
     assertEquals(0.5, axis.adjustedLog10(0.5), EPSILON); 
     axis.setLog10TickLabelsFlag(false); 
     assertEquals(0.5, axis.adjustedLog10(0.5), EPSILON); 
     axis.setAutoRangeNextLogFlag(false); 
     assertEquals(0.5, axis.adjustedLog10(0.5), EPSILON); 
     axis.setLog10TickLabelsFlag(false); 
     assertEquals(0.5, axis.adjustedLog10(0.5), EPSILON); 
     axis.setAutoRangeNextLogFlag(true); 
     assertEquals(0.5, axis.adjustedLog10(0.5), EPSILON);
}

public void testJava2DToValue1016() { 
     LogarithmicAxis axis = new LogarithmicAxis("Test Axis"); 
     axis.setRange(0.0, 10.0); 
     Rectangle2D dataArea = new Rectangle2D.Double(0.0, 0.0, 200.0, 300.0); 
     double y1 = axis.java2DToValue(75.0, dataArea, RectangleEdge.LEFT); 
     assertEquals(75.0, y1, EPSILON); 
     axis.setInverted(true); 
     double y2 = axis.java2DToValue(75.0, dataArea, RectangleEdge.RIGHT); 
     assertEquals(75.0, y2, EPSILON); 
     axis.setInverted(false); 
     double x1 = axis.java2DToValue(75.0, dataArea, RectangleEdge.TOP); 
     assertEquals(75.0, x1, EPSILON); 
     double x2 = axis.java2DToValue(75.0, dataArea, RectangleEdge.BOTTOM); 
     assertEquals(75.0, x2, EPSILON); 
     axis.setInverted(true); 
     double y3 = axis.java2DToValue(75.0, dataArea, RectangleEdge.LEFT); 
     assertEquals(75.0, y3, EPSILON); 
     axis.setInverted(true); 
     double y4 = axis.java2DToValue(75.0, dataArea, RectangleEdge.RIGHT); 
     assertEquals(75.0, y4, EPSILON); 
     axis.setInverted(false); 
     assertEquals(75.0, y4, EPSILON); 
 }
    

    /**
     * Test if adjustedLog10 and adjustedPow10 are inverses of each other
     */
     

     private void checkLogPowRoundTrip(double value) {
         assertEquals("log(pow(x)) = x", value, this.axis.adjustedLog10(
                 this.axis.adjustedPow10(value)), EPSILON);
         assertEquals("pow(log(x)) = x", value, this.axis.adjustedPow10(
                 this.axis.adjustedLog10(value)), EPSILON);
     }

     /**
      * Test if switchedLog10 and switchedPow10 are inverses of each other
      */
      

      private void checkSwitchedLogPowRoundTrip(double value) {
          assertEquals("log(pow(x)) = x", value, this.axis.switchedLog10(
                  this.axis.switchedPow10(value)), EPSILON);
          assertEquals("pow(log(x)) = x", value, this.axis.switchedPow10(
                  this.axis.switchedLog10(value)), EPSILON);
      }

      /**
       * Test of java2DToValue method.
       */
      

      /**
       * Test of valueToJava2D method.
       */
      

      private void checkPointsToJava2D(RectangleEdge edge,
              Rectangle2D plotArea) {
          assertEquals("Left most point on the axis should be beginning of "
                  + "range.", plotArea.getX(), this.axis.valueToJava2D(
                  this.axis.getLowerBound(), plotArea, edge), EPSILON);
          assertEquals("Right most point on the axis should be end of range.",
                  plotArea.getX() + plotArea.getWidth(),
                  this.axis.valueToJava2D(this.axis.getUpperBound(),
                  plotArea, edge), EPSILON);
          assertEquals("Center point on the axis should geometric mean of the bounds.",
                  plotArea.getX() + (plotArea.getWidth() / 2),
                  this.axis.valueToJava2D(Math.sqrt(this.axis.getLowerBound()
                  * this.axis.getUpperBound()), plotArea, edge), EPSILON);
        }

    /**
     * Check the translation java2D to value for left, right, and center point.
     *
     * @param edge  the edge.
     * @param plotArea  the plot area.
     */
     private void checkPointsToValue(RectangleEdge edge, Rectangle2D plotArea) {
         assertEquals("Right most point on the axis should be end of range.",
                 this.axis.getUpperBound(), this.axis.java2DToValue(
                 plotArea.getX() + plotArea.getWidth(), plotArea, edge),
                 EPSILON);

         assertEquals("Left most point on the axis should be beginning of "
                 + "range.", this.axis.getLowerBound(),
                 this.axis.java2DToValue(plotArea.getX(), plotArea, edge),
                 EPSILON);

         assertEquals("Center point on the axis should geometric mean of the "
                 + "bounds.", Math.sqrt(this.axis.getUpperBound()
                 * this.axis.getLowerBound()), this.axis.java2DToValue(
                 plotArea.getX() + (plotArea.getWidth() / 2), plotArea, edge),
                 EPSILON);
    }

    /**
     * Runs all tests in this class.
     *
     * @param args  ignored.
     */
    public static void main(String[] args) {
        junit.textui.TestRunner.run(LogarithmicAxisTests.class);
    }

}
