/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.lang3.concurrent;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.regex.Pattern;

import org.junit.Before;
import org.junit.Test;

/**
 * Test class for {@code ConstantInitializer}.
 *
 * @version $Id$
 */
public class ConstantInitializerTest {
    /** Constant for the object managed by the initializer. */
    private static final Integer VALUE = 42;

    /** The initializer to be tested. */
    private ConstantInitializer<Integer> init;

    @Before
    public void setUp() throws Exception {
        init = new ConstantInitializer<Integer>(VALUE);
    }

    /**
     * Helper method for testing equals() and hashCode().
     *
     * @param obj the object to compare with the test instance
     * @param expected the expected result
     */
    private void checkEquals(final Object obj, final boolean expected) {
        assertTrue("Wrong result of equals", expected == init.equals(obj));
        if (obj != null) {
            assertTrue("Not symmetric", expected == obj.equals(init));
            if (expected) {
                assertEquals("Different hash codes", init.hashCode(),
                        obj.hashCode());
            }
        }
    }

    /**
     * Tests whether the correct object is returned.
     */
    

    /**
     * Tests whether get() returns the correct object.
     */
    

    /**
     * Tests equals() if the expected result is true.
     */
    

    /**
     * Tests equals() if the expected result is false.
     */
    

    /**
     * Tests equals() with objects of other classes.
     */
    

    /**
     * Tests the string representation.
     */
    

    /**
     * Tests the string representation if the managed object is null.
     */
    
}
