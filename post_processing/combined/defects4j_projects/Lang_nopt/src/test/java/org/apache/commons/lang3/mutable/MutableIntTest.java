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
package org.apache.commons.lang3.mutable;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * JUnit tests.
 * 
 * @version $Id$
 * @see MutableInt
 */
public class MutableIntTest {

    // ----------------------------------------------------------------
@Test
public void testMutableInt1085() { final MutableInt x = new MutableInt(0); assertEquals(0, x.intValue()); assertEquals(0, x.longValue()); assertEquals(0.0, x.floatValue(), 0.0); assertEquals(0.0, x.doubleValue(), 0.0); final MutableInt y = new MutableInt(1); assertEquals(1, y.intValue()); assertEquals(1, y.longValue()); assertEquals(1.0, y.floatValue(), 0.0); assertEquals(1.0, y.doubleValue(), 0.0); }
    

    

    

    

    

    /**
     * @param numA must not be a 0 Integer; must not equal numC.
     * @param numB must equal numA; must not equal numC.
     * @param numC must not equal numA; must not equal numC.
     */
    void testEquals(final Number numA, final Number numB, final Number numC) {
        assertTrue(numA.equals(numA));
        assertTrue(numA.equals(numB));
        assertTrue(numB.equals(numA));
        assertTrue(numB.equals(numB));
        assertFalse(numA.equals(numC));
        assertFalse(numB.equals(numC));
        assertTrue(numC.equals(numC));
        assertFalse(numA.equals(null));
        assertFalse(numA.equals(Integer.valueOf(0)));
        assertFalse(numA.equals("0"));
    }

    

    

    

    

    

    

    

    

    

    

    

    

}
