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
 * ----------------
 * SecondTests.java
 * ----------------
 * (C) Copyright 2002-2008, by Object Refinery Limited.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 29-Jan-2002 : Version 1 (DG);
 * 17-Oct-2002 : Fixed errors reported by Checkstyle (DG);
 * 13-Oct-2003 : Added serialization test (DG);
 * 11-Jan-2005 : Added test for non-clonability (DG);
 * 06-Oct-2006 : Added some new tests (DG);
 * 21-Jun-2007 : Removed JCommon dependencies (DG);
 * 11-Jul-2007 : Fixed bad time zone assumption (DG);
 *
 */

package org.jfree.data.time.junit;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.data.time.Day;
import org.jfree.data.time.Hour;
import org.jfree.data.time.Minute;
import org.jfree.data.time.MonthConstants;
import org.jfree.data.time.Second;

/**
 * Tests for the {@link Second} class.
 */
public class SecondTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(SecondTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public SecondTests(String name) {
        super(name);
    }

    /**
     * Common test setup.
     */
    protected void setUp() {
        // no setup
    }

    /**
     * Test that a Second instance is equal to itself.
     *
     * SourceForge Bug ID: 558850.
     */
public void testGetHourValue7047() { Minute m = new Minute(1, 1, 1, 1, 2000); assertEquals(1,m.getHourValue()); m = new Minute(1, 1, 1, 1, 1900); assertEquals(1,m.getHourValue()); m = new Minute(1, 1, 1, 1, 1900); assertEquals(1,m.getHourValue()); m = new Minute(1, 1, 1, 1, 1900); assertEquals(1,m.getHourValue()); m = new Minute(1, 1, 1, 1, 1900); assertEquals(1,m.getHourValue()); }
public void testGetHourValue7048() { Minute m = new Minute(1, 1, 1, 1, 2000); assertEquals(1, m.getHourValue()); m = new Minute(1, 1, 1, 1, 1900); assertEquals(1, m.getHourValue()); m = new Minute(1, 1, 1, 1, 1900); assertEquals(1, m.getHourValue()); m = new Minute(1, 1, 1, 1, 1900); assertEquals(1, m.getHourValue()); }
public void testToString8731() { Second s = new Second(1, 1, 1, 1, 1, 1); assertEquals("1:01:01:01", s.toString()); }
public void testGetSecond8738() { Second s = new Second(1, 1, 1, 1, 1, 2000); assertEquals(1, s.getSecond()); s = new Second(1, 1, 1, 1, 1, 2000); assertEquals(1, s.getSecond()); s = new Second(1, 1, 1, 1, 1, 1900); assertEquals(1, s.getSecond()); s = new Second(1, 1, 1, 1, 1, 1900); assertEquals(1, s.getSecond()); s = new Second(1, 1, 1, 1, 1, 1900); assertEquals(1, s.getSecond());
}

public void testGetLastMillisecond8742() { Locale saved = Locale.getDefault(); Locale.setDefault(Locale.UK); TimeZone savedZone = TimeZone.getDefault(); TimeZone.setDefault(TimeZone.getTimeZone("Europe/London")); Second s = new Second(0, 0, 0, 0, 0, 1970); assertEquals(0, s.getLastMillisecond()); Locale.setDefault(saved); TimeZone.setDefault(savedZone); }
public void testGetFirstMillisecond8747() { Locale saved = Locale.getDefault(); Locale.setDefault(Locale.UK); TimeZone savedZone = TimeZone.getDefault(); TimeZone.setDefault(TimeZone.getTimeZone("Europe/London")); Second s = new Second(0, 0, 0, 0, 0, 0); Calendar c = new GregorianCalendar(saved); assertEquals(0, s.getFirstMillisecond(c)); Locale.setDefault(saved); TimeZone.setDefault(savedZone); }
public void testGetFirstMillisecond8748() { Locale saved = Locale.getDefault(); Locale.setDefault(Locale.UK); TimeZone savedZone = TimeZone.getDefault(); TimeZone.setDefault(TimeZone.getTimeZone("Europe/London")); Second s = new Second(0, 0, 0, 0, 0, 2006); Calendar c = new GregorianCalendar(saved); assertEquals(0, s.getFirstMillisecond(c)); Locale.setDefault(saved); TimeZone.setDefault(savedZone); s = new Second(0, 0, 0, 0, 0, 2006); assertEquals(0, s.getFirstMillisecond(c)); }
public void testGetLastMillisecond8749() { Locale saved = Locale.getDefault(); Locale.setDefault(Locale.UK); TimeZone savedZone = TimeZone.getDefault(); TimeZone.setDefault(TimeZone.getTimeZone("Europe/London")); Second s = new Second(0, 0, 0, 0, 0, 1970); assertEquals(0, s.getLastMillisecond(null)); Locale.setDefault(saved); TimeZone.setDefault(savedZone); }
public void testGetLastMillisecond8750() { Locale saved = Locale.getDefault(); Locale.setDefault(Locale.UK); TimeZone savedZone = TimeZone.getDefault(); TimeZone.setDefault(TimeZone.getTimeZone("Europe/London")); Second s = new Second(0, 0, 0, 0, 0, 1970); assertEquals(0, s.getFirstMillisecond(null)); Locale.setDefault(saved); TimeZone.setDefault(savedZone); }
public void testHashCode8758() { Second s1 = new Second(1, 0, 0, 0, 0, 2000); Second s2 = new Second(1, 0, 0, 0, 0, 2000); assertEquals(s1.hashCode(), s2.hashCode()); }
public void testHashCode8759() { Second s1 = new Second(0, 0, 0, 0, 0, 2000); Second s2 = new Second(0, 0, 0, 0, 0, 2000); assertEquals(s1.hashCode(), s2.hashCode()); }
public void testHashCode8761() { Second s1 = new Second(); Second s2 = new Second(); assertEquals(s1, s2); int h1 = s1.hashCode(); int h2 = s2.hashCode(); assertEquals(h1, h2); }
public void testHashCode8762() { Second s1 = new Second(1, 1, 1, 1, 1, 2000); Second s2 = new Second(1, 1, 1, 1, 1, 2000); assertEquals(s1.hashCode(), s2.hashCode()); }
    

    /**
     * Tests the equals method.
     */
    

    /**
     * In GMT, the 4.55:59pm on 21 Mar 2002 is java.util.Date(1016729759000L).
     * Use this to check the Second constructor.
     */
    

    /**
     * In Chicago, the 4.55:59pm on 21 Mar 2002 is
     * java.util.Date(1016751359000L). Use this to check the Second constructor.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

    /**
     * Two objects that are equal are required to return the same hashCode.
     */
    

    /**
     * The {@link Second} class is immutable, so should not be
     * {@link Cloneable}.
     */
    

    /**
     * Some checks for the getFirstMillisecond() method.
     */
    

    /**
     * Some checks for the getFirstMillisecond(TimeZone) method.
     */
    

    /**
     * Some checks for the getFirstMillisecond(TimeZone) method.
     */
    

    /**
     * Some checks for the getLastMillisecond() method.
     */
    

    /**
     * Some checks for the getLastMillisecond(TimeZone) method.
     */
    

    /**
     * Some checks for the getLastMillisecond(TimeZone) method.
     */
    

    /**
     * Some checks for the getSerialIndex() method.
     */
    

    /**
     * Some checks for the testNext() method.
     */
    

    /**
     * Some checks for the getStart() method.
     */
    

    /**
     * Some checks for the getEnd() method.
     */
    

}
