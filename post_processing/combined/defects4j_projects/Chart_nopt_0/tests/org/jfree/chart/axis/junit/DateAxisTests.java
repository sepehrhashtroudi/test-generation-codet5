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
 * ------------------
 * DateAxisTests.java
 * ------------------
 * (C) Copyright 2003-2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 22-Apr-2003 : Version 1 (DG);
 * 07-Jan-2005 : Added test for hashCode() method (DG);
 * 25-Sep-2005 : New tests for bug 1564977 (DG);
 * 19-Apr-2007 : Added further checks for setMinimumDate() and
 *               setMaximumDate() (DG);
 * 03-May-2007 : Replaced the tests for the previousStandardDate() method with
 *               new tests that check that the previousStandardDate and the
 *               next standard date do in fact span the reference date (DG);
 * 25-Nov-2008 : Added testBug2201869 (DG);
 *
 */

package org.jfree.chart.axis.junit;

import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.chart.axis.AxisState;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.axis.DateTick;
import org.jfree.chart.axis.DateTickMarkPosition;
import org.jfree.chart.axis.DateTickUnit;
import org.jfree.chart.axis.DateTickUnitType;
import org.jfree.chart.axis.SegmentedTimeline;
import org.jfree.chart.util.RectangleEdge;
import org.jfree.data.time.DateRange;
import org.jfree.data.time.Day;
import org.jfree.data.time.Hour;
import org.jfree.data.time.Millisecond;
import org.jfree.data.time.Month;
import org.jfree.data.time.Second;
import org.jfree.data.time.Year;

/**
 * Tests for the {@link DateAxis} class.
 */
public class DateAxisTests extends TestCase {

    static class MyDateAxis extends DateAxis {

        /**
         * Creates a new instance.
         *
         * @param label  the label.
         */
        public MyDateAxis(String label) {
            super(label);
        }

        public Date previousStandardDate(Date d, DateTickUnit unit) {
            return super.previousStandardDate(d, unit);
        }
    }

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(DateAxisTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public DateAxisTests(String name) {
        super(name);
    }

    /**
     * Confirm that the equals method can distinguish all the required fields.
     */
public void testGetFirstMillisecond2924() { Day d = new Day(); assertEquals(0, d.getFirstMillisecond()); Locale saved = Locale.getDefault(); Locale.setDefault(Locale.UK); TimeZone savedZone = TimeZone.getDefault(); TimeZone.setDefault(TimeZone.getTimeZone("Europe/London")); assertEquals(0, d.getFirstMillisecond()); Locale.setDefault(saved); TimeZone.setDefault(savedZone); }
public void testGetFirstMillisecond2925() { Day d = new Day(); assertEquals(0, d.getFirstMillisecond()); Calendar c = Calendar.getInstance(TimeZone.getTimeZone("Europe/London")); assertEquals(0, d.getFirstMillisecond(c)); try { d.getFirstMillisecond(null); fail("NullPointerException should have been thrown"); } catch (NullPointerException e) { } }
public void testGetLastMillisecond2926() { Day d = new Day(); assertEquals(0, d.getLastMillisecond()); Locale saved = Locale.getDefault(); Locale.setDefault(Locale.UK); TimeZone savedZone = TimeZone.getDefault(); TimeZone.setDefault(TimeZone.getTimeZone("Europe/London")); assertEquals(0, d.getLastMillisecond()); Locale.setDefault(saved); TimeZone.setDefault(savedZone); }
public void testGetFirstMillisecond2927() { Day d = new Day(0, 0, 1970); Calendar c = Calendar.getInstance(TimeZone.getTimeZone("Europe/London")); assertEquals(0, d.getFirstMillisecond(c)); try { d.getFirstMillisecond(null); fail("NullPointerException should have been thrown"); } catch (NullPointerException e) { } }
public void testGetFirstMillisecond2928() { Day d = new Day(0, 0, 1970); Calendar c = new GregorianCalendar(TimeZone.getTimeZone("Europe/London")); assertEquals(0, d.getFirstMillisecond(c)); try { d.getFirstMillisecond(null); fail("NullPointerException should have been thrown"); } catch (NullPointerException e) { } }
public void testGetFirstMillisecond2929() { Day d = new Day(0, 0, 1970); Calendar c = Calendar.getInstance(TimeZone.getTimeZone("America/Los_Angeles")); assertEquals(0, d.getFirstMillisecond(c)); try { d.getFirstMillisecond(null); fail("NullPointerException should have been thrown"); } catch (NullPointerException e) { } }
public void testGetFirstMillisecond2930() { Day d = new Day(0, 0, 1970); Calendar c1 = new GregorianCalendar(TimeZone.getTimeZone("America/Los_Angeles")); assertEquals(0, d.getFirstMillisecond(c1)); Calendar c2 = new GregorianCalendar(TimeZone.getTimeZone("America/Los_Angeles")); assertEquals(0, d.getFirstMillisecond(c2)); try { d.getFirstMillisecond(null); fail("NullPointerException should have been thrown"); } catch (NullPointerException e) { } }
public void testGetFirstMillisecond2933() { Locale saved = Locale.getDefault(); Locale.setDefault(Locale.UK); TimeZone savedZone = TimeZone.getDefault(); TimeZone.setDefault(TimeZone.getTimeZone("Europe/London")); Day d = new Day(0, 0, 1970); assertEquals(0, d.getFirstMillisecond(null)); Locale.setDefault(saved); TimeZone.setDefault(savedZone); }
public void testGetLastMillisecond2935() { Day d = new Day(0, 0, 1970); Calendar c = new GregorianCalendar(TimeZone.getTimeZone("Europe/London")); assertEquals(0, d.getLastMillisecond(c)); try { d.getLastMillisecond(null); fail("NullPointerException should have been thrown"); } catch (NullPointerException e) { } }
public void testGetLastMillisecond2936() { Day d = new Day(0, 0, 1970); Calendar c = Calendar.getInstance(TimeZone.getTimeZone("America/Los_Angeles")); assertEquals(0, d.getLastMillisecond(c)); try { d.getLastMillisecond(null); fail("NullPointerException should have been thrown"); } catch (NullPointerException e) { } }
public void testGetLastMillisecond2939() { Calendar c1 = Calendar.getInstance(); c1.set(Calendar.MILLISECOND, 999); Calendar c2 = Calendar.getInstance(); c2.set(Calendar.MILLISECOND, 999); assertEquals(999, new Day().getLastMillisecond(c1)); assertEquals(999, new Day(0, 0, 0).getLastMillisecond(c2)); try { new Day().getLastMillisecond(null); fail("NullPointerException should have been thrown"); } catch (NullPointerException e) { } }
public void testGetLastMillisecond2940() { Locale saved = Locale.getDefault(); Locale.setDefault(Locale.UK); TimeZone savedZone = TimeZone.getDefault(); TimeZone.setDefault(TimeZone.getTimeZone("Europe/London")); Day d = new Day(0, 0, 1970); assertEquals(0, d.getLastMillisecond(null)); Locale.setDefault(saved); TimeZone.setDefault(savedZone); }
public void testDateAxis2960() { DateAxis axis = new DateAxis("Test Axis"); assertEquals("Test Axis", axis.getLabel()); }
public void testDateAxis2961() { DateAxis axis = new DateAxis("Test Axis", TimeZone.getTimeZone("UTC")); assertEquals("Test Axis", axis.getLabel()); assertEquals(TimeZone.getTimeZone("UTC"), axis.getTimeZone()); }
public void testDateAxis2963() { DateAxis axis = new DateAxis("Test Axis", TimeZone.getTimeZone("PST"), Locale.UK); assertEquals("Test Axis", axis.getLabel()); }
public void testSetRange2967() { DateAxis axis = new DateAxis("Test Axis"); Date d1 = new Date(); Date d2 = new Date(); axis.setRange(d1, d2); assertEquals(d1, axis.getMinimumDate()); assertEquals(d2, axis.getMaximumDate()); axis.setRange(d1, d2); assertEquals(d1, axis.getMinimumDate()); assertEquals(d2, axis.getMaximumDate()); }
public void testGetDateFormatOverride2975() { DateAxis axis = new DateAxis(); Date d1 = new Date(); Date d2 = new Date(); axis.setDateFormatOverride(new SimpleDateFormat("yyyy-MM-dd")); assertEquals("yyyy-MM-dd", axis.getDateFormatOverride().format(d1)); assertEquals("yyyy-MM-dd", axis.getDateFormatOverride().format(d2)); axis.setDateFormatOverride(new SimpleDateFormat("yyyy-MM-dd")); assertEquals("yyyy-MM-dd", axis.getDateFormatOverride().format(d1)); assertEquals("yyyy-MM-dd", axis.getDateFormatOverride().format(d2)); }
public void testSetRange2979() { DateRange range = new DateRange(new Date(0), new Date(1)); DateAxis axis = new DateAxis("Test Axis"); axis.setRange(range, true, true); assertEquals(new Date(0), axis.getMinimumDate()); assertEquals(new Date(1), axis.getMaximumDate()); range = new DateRange(new Date(2), new Date(3)); axis.setRange(range, true, true); assertEquals(new Date(2), axis.getMinimumDate()); assertEquals(new Date(3), axis.getMaximumDate()); range = new DateRange(new Date(4), new Date(5));
}

public void testSetRange2981() { Date date = new Date(); DateRange range = new DateRange(date, date); DateAxis axis = new DateAxis("Test Axis"); axis.setRange(range); assertEquals(date, axis.getMinimumDate()); assertEquals(date, axis.getMaximumDate()); range = new DateRange(date, date); axis.setRange(range); assertEquals(date, axis.getMinimumDate()); assertEquals(date, axis.getMaximumDate()); range = new DateRange(date, date); axis.setRange(range); assertEquals(date, axis.getMinimumDate()); assertEquals(date, axis.getMaximumDate()); }
public void testGetMinimumDate2985() { Date d1 = new Date(); Date d2 = new Date(d1.getTime() + 1000); Date d3 = new Date(d2.getTime() + 1000); DateRange range = new DateRange(d1, d2); DateRange range2 = new DateRange(d3, d1); DateAxis axis = new DateAxis(); axis.setRange(range); axis.setMinimumDate(d1); assertEquals(d1, axis.getMinimumDate()); axis.setRange(range2); assertEquals(d2, axis.getMinimumDate()); }
public void testGetMaximumDate2997() { Date d = new Date(); Date d1 = new Date(d.getTime() + 1000); Date d2 = new Date(d.getTime() + 2000); DateRange r = new DateRange(d1, d2); DateRange r2 = new DateRange(d2, d1); DateAxis axis = new DateAxis(); axis.setRange(r); axis.setMaximumDate(d1); assertEquals(d1, axis.getMaximumDate()); axis.setRange(r2); assertEquals(d2, axis.getMaximumDate()); }
public void testIsHiddenValue3010() { Date d1 = new Date(1L); Date d2 = new Date(2L); Date d3 = new Date(3L); Date d4 = new Date(4L); assertTrue(new DateAxis().isHiddenValue(d1.getTime())); assertTrue(new DateAxis().isHiddenValue(d2.getTime())); assertTrue(new DateAxis().isHiddenValue(d3.getTime())); assertTrue(new DateAxis().isHiddenValue(d4.getTime())); }
public void createStandardDateTickUnits() { Calendar c = Calendar.getInstance(); c.set(Calendar.YEAR, 2015); c.set(Calendar.MONTH, 0); c.set(Calendar.DAY_OF_MONTH, 1); c.set(Calendar.HOUR_OF_DAY, 0); c.set(Calendar.MINUTE, 0); c.set(Calendar.SECOND, 0); Calendar c2 = Calendar.getInstance(); c2.set(Calendar.YEAR, 2015); c2.set(Calendar.MONTH, 0); c2.set(Calendar.DAY_OF_MONTH, 1); c2.set(Calendar.HOUR_OF_DAY, 0);
}

public void createStandardDateTickUnits() { Calendar c = Calendar.getInstance(); c.set(2015, Calendar.DECEMBER, 31, 0, 0); c.set(Calendar.MILLISECOND, 0); Calendar c2 = Calendar.getInstance(); c2.set(2015, Calendar.DECEMBER, 31, 0, 0); c2.set(Calendar.MILLISECOND, 0); Calendar c3 = Calendar.getInstance(); c3.set(2015, Calendar.DECEMBER, 31, 0, 0); Calendar c4 = Calendar.getInstance(); c4.set(2015, Calendar.DECEMBER, 31, 0, 0);
}

public void testCorrectTickDateForPosition3045() { DateAxis axis = new DateAxis(); Calendar calendar = Calendar.getInstance(); calendar.set(Calendar.HOUR_OF_DAY, 0); calendar.set(Calendar.MINUTE, 0); calendar.set(Calendar.SECOND, 0); calendar.set(Calendar.MILLISECOND, 0); Date d1 = calendar.getTime(); calendar.set(Calendar.HOUR_OF_DAY, 0); calendar.set(Calendar.MINUTE, 0); Date d2 = calendar.getTime(); calendar.set(Calendar.HOUR_OF_DAY, 0); calendar.set(Calendar.MINUTE, 0); Date d3 = calendar.getTime();
}

public void testEquals3057() { DateAxis a1 = new DateAxis("Test"); DateAxis a2 = new DateAxis("Test"); assertEquals(a1, a2); a1.setDateFormatOverride(new SimpleDateFormat("yyyy-MM-dd")); assertFalse(a1.equals(a2)); a2.setDateFormatOverride(new SimpleDateFormat("yyyy-MM-dd")); assertEquals(a1, a2); }
public void testClone3058() throws CloneNotSupportedException { DateAxis a1 = new DateAxis(); DateAxis a2 = (DateAxis) a1.clone(); assertNotSame(a1, a2); assertSame(a1.getDateFormatOverride(), a2.getDateFormatOverride()); }
public void testCloning3059() throws CloneNotSupportedException { DateAxis a1 = new DateAxis("Test"); DateAxis a2 = (DateAxis) a1.clone(); assertNotSame(a1, a2); assertSame(a1.getClass(), a2.getClass()); assertEquals(a1, a2); }
public void testCloning3060() throws CloneNotSupportedException { DateAxis a1 = new DateAxis("Test"); DateAxis a2 = (DateAxis) a1.clone(); assertNotSame(a1, a2); assertSame(a1.getDateFormatOverride(), a2.getDateFormatOverride()); }
    

    /**
     * A test for bug report 1472942.  The DateFormat.equals() method is not
     * checking the range attribute.
     */
    

    /**
     * Two objects that are equal are required to return the same hashCode.
     */
    

    /**
     * Confirm that cloning works.
     */
    

    /**
     * Test that the setRange() method works.
     */
    

    /**
     * Test that the setMaximumDate() method works.
     */
    

    /**
     * Test that the setMinimumDate() method works.
     */
    

    /**
     * Tests two doubles for 'near enough' equality.
     *
     * @param d1  number 1.
     * @param d2  number 2.
     * @param tolerance  maximum tolerance.
     *
     * @return A boolean.
     */
    private boolean same(double d1, double d2, double tolerance) {
        return (Math.abs(d1 - d2) < tolerance);
    }

    /**
     * Test the translation of Java2D values to data values.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

    /**
     * A basic check for the testPreviousStandardDate() method when the
     * tick unit is 1 year.
     */
    

    /**
     * A basic check for the testPreviousStandardDate() method when the
     * tick unit is 10 years (just for the sake of having a multiple).
     */
    

    /**
     * A basic check for the testPreviousStandardDate() method when the
     * tick unit is 1 month.
     */
    

    /**
     * A basic check for the testPreviousStandardDate() method when the
     * tick unit is 3 months (just for the sake of having a multiple).
     */
    

    /**
     * A basic check for the testPreviousStandardDate() method when the
     * tick unit is 1 day.
     */
    

    /**
     * A basic check for the testPreviousStandardDate() method when the
     * tick unit is 7 days (just for the sake of having a multiple).
     */
    

    /**
     * A basic check for the testPreviousStandardDate() method when the
     * tick unit is 1 hour.
     */
    

    /**
     * A basic check for the testPreviousStandardDate() method when the
     * tick unit is 6 hours (just for the sake of having a multiple).
     */
    

    /**
     * A basic check for the testPreviousStandardDate() method when the
     * tick unit is 1 second.
     */
    

    /**
     * A basic check for the testPreviousStandardDate() method when the
     * tick unit is 5 seconds (just for the sake of having a multiple).
     */
    

    /**
     * A basic check for the testPreviousStandardDate() method when the
     * tick unit is 1 millisecond.
     */
    

    /**
     * A basic check for the testPreviousStandardDate() method when the
     * tick unit is 10 milliseconds (just for the sake of having a multiple).
     */
    

    /**
     * A test to reproduce bug 2201869.
     */
    

}
