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
public void testLogarithmicAxis5273() { LogarithmicAxis a1 = new LogarithmicAxis("Test"); LogarithmicAxis a2 = new LogarithmicAxis("Test"); assertEquals(a1, a2); }
    

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
