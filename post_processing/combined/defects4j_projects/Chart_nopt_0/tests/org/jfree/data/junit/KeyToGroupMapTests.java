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
 * -----------------------
 * KeyToGroupMapTests.java
 * -----------------------
 * (C) Copyright 2004-2008, by Object Refinery Limited and Contributors.
 *
 * Original Author:  David Gilbert (for Object Refinery Limited);
 * Contributor(s):   -;
 *
 * Changes
 * -------
 * 29-Apr-2004 : Version 1 (DG);
 *
 */

package org.jfree.data.junit;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.jfree.data.KeyToGroupMap;

/**
 * Tests for the {@link KeyToGroupMap} class.
 */
public class KeyToGroupMapTests extends TestCase {

    /**
     * Returns the tests as a test suite.
     *
     * @return The test suite.
     */
    public static Test suite() {
        return new TestSuite(KeyToGroupMapTests.class);
    }

    /**
     * Constructs a new set of tests.
     *
     * @param name  the name of the tests.
     */
    public KeyToGroupMapTests(String name) {
        super(name);
    }

    /**
     * Tests the mapKeyToGroup() method.
     */
public void testKeyToGroupMap2083() { KeyToGroupMap m1 = new KeyToGroupMap("Default Group"); m1.mapKeyToGroup("Key 1", "Group 1"); m1.mapKeyToGroup("Key 2", "Group 2"); m1.mapKeyToGroup("Key 3", "Group 3"); KeyToGroupMap m2 = new KeyToGroupMap("Default Group"); m2.mapKeyToGroup("Key 1", "Group 1"); m2.mapKeyToGroup("Key 2", "Group 2"); m2.mapKeyToGroup("Key 3", "Group 3"); m2.mapKeyToGroup("Key 4", "Group 4");
}

public void testKeyToGroupMap2084() { KeyToGroupMap m1 = new KeyToGroupMap("Default Group"); m1.mapKeyToGroup("Key 1", "Group 1"); m1.mapKeyToGroup("Key 2", "Group 2"); m1.mapKeyToGroup("Key 3", "Group 3"); KeyToGroupMap m2 = new KeyToGroupMap("Default Group"); m2.mapKeyToGroup("Key 4", "Group 4"); m2.mapKeyToGroup("Key 5", "Group 5"); m2.mapKeyToGroup("Key 6", "Group 6"); m2.mapKeyToGroup("Key 7", "Group 7");
}

public void testGetGroup2091() { KeyToGroupMap m = new KeyToGroupMap(); m.mapKeyToGroup("key1", "Group1"); assertEquals("Group1", m.getGroup("key1")); m.mapKeyToGroup("key2", "Group2"); assertEquals("Group2", m.getGroup("key2")); m.mapKeyToGroup("key3", "Group3"); assertEquals("Group3", m.getGroup("key3")); m.mapKeyToGroup("key4", "Group4"); assertEquals("Group4", m.getGroup("key4")); }
public void testGetGroup2092() { KeyToGroupMap map = new KeyToGroupMap(); map.mapKeyToGroup("key1", "Group1"); map.mapKeyToGroup("key2", "Group2"); map.mapKeyToGroup("key3", "Group3"); assertEquals("Group1", map.getGroup("key1")); assertEquals("Group2", map.getGroup("key2")); assertEquals("Group3", map.getGroup("key3")); }
public void testGetGroup2093() { KeyToGroupMap m = new KeyToGroupMap(); m.mapKeyToGroup("key1", "Group1"); assertEquals("Group1", m.getGroup("key1")); m.mapKeyToGroup("key2", "Group2"); assertEquals("Group2", m.getGroup("key2")); m.mapKeyToGroup("key3", "Group3"); assertEquals("Group3", m.getGroup("key3")); }
    

    /**
     * Tests that the getGroupCount() method returns the correct values under
     * various circumstances.
     */
    

    /**
     * Tests that the getKeyCount() method returns the correct values under
     * various circumstances.
     */
    

    /**
     * Tests the getGroupIndex() method.
     */
    

    /**
     * Tests the getGroup() method.
     */
    

    /**
     * Confirm that the equals method can distinguish all the required fields.
     */
    

    /**
     * Confirm that cloning works.
     */
    

    /**
     * Serialize an instance, restore it, and check for equality.
     */
    

}
