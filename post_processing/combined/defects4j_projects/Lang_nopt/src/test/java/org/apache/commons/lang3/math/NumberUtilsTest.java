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
package org.apache.commons.lang3.math;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.math.BigDecimal;
import java.math.BigInteger;

import org.junit.Test;

/**
 * Unit tests {@link org.apache.commons.lang3.math.NumberUtils}.
 *
 * @version $Id$
 */
public class NumberUtilsTest {

    //-----------------------------------------------------------------------
@Test(expected = NumberFormatException.class) public void nullTest() { try { NumberUtils.createBigDecimal(null); } catch (NumberFormatException e) { fail(e.getMessage()); } try { NumberUtils.createBigDecimal(null); } catch (NumberFormatException e) { fail(e.getMessage()); } try { NumberUtils.createBigDecimal(" "); } catch (NumberFormatException e) { fail(e.getMessage()); } }
    

    //---------------------------------------------------------------------

    /**
     * Test for {@link NumberUtils#toInt(String)}.
     */
    

    /**
     * Test for {@link NumberUtils#toInt(String, int)}.
     */
    

    /**
     * Test for {@link NumberUtils#toLong(String)}.
     */
    

    /**
     * Test for {@link NumberUtils#toLong(String, long)}.
     */
    

    /**
     * Test for {@link NumberUtils#toFloat(String)}.
     */
    

    /**
     * Test for {@link NumberUtils#toFloat(String, float)}.
     */
    
    
    /**
     * Test for {(@link NumberUtils#createNumber(String)}
     */
    
    /**
     * Test for {@link NumberUtils#toDouble(String)}.
     */
    

    /**
     * Test for {@link NumberUtils#toDouble(String, double)}.
     */
    

     /**
     * Test for {@link NumberUtils#toByte(String)}.
     */
    

    /**
     * Test for {@link NumberUtils#toByte(String, byte)}.
     */
    

    /**
     * Test for {@link NumberUtils#toShort(String)}.
     */
    

    /**
     * Test for {@link NumberUtils#toShort(String, short)}.
     */
    

    

    

    

    

    

    

    // Tests to show when magnitude causes switch to next Number type
    // Will probably need to be adjusted if code is changed to check precision (LANG-693)
    

    

    protected void testCreateFloatFailure(final String str) {
        try {
            final Float value = NumberUtils.createFloat(str);
            fail("createFloat(\"" + str + "\") should have failed: " + value);
        } catch (final NumberFormatException ex) {
            // empty
        }
    }

    

    protected void testCreateDoubleFailure(final String str) {
        try {
            final Double value = NumberUtils.createDouble(str);
            fail("createDouble(\"" + str + "\") should have failed: " + value);
        } catch (final NumberFormatException ex) {
            // empty
        }
    }

    

    protected void testCreateIntegerFailure(final String str) {
        try {
            final Integer value = NumberUtils.createInteger(str);
            fail("createInteger(\"" + str + "\") should have failed: " + value);
        } catch (final NumberFormatException ex) {
            // empty
        }
    }

    

    protected void testCreateLongFailure(final String str) {
        try {
            final Long value = NumberUtils.createLong(str);
            fail("createLong(\"" + str + "\") should have failed: " + value);
        } catch (final NumberFormatException ex) {
            // empty
        }
    }

    

    protected void testCreateBigIntegerFailure(final String str) {
        try {
            final BigInteger value = NumberUtils.createBigInteger(str);
            fail("createBigInteger(\"" + str + "\") should have failed: " + value);
        } catch (final NumberFormatException ex) {
            // empty
        }
    }

    

    protected void testCreateBigDecimalFailure(final String str) {
        try {
            final BigDecimal value = NumberUtils.createBigDecimal(str);
            fail("createBigDecimal(\"" + str + "\") should have failed: " + value);
        } catch (final NumberFormatException ex) {
            // empty
        }
    }

    // min/max tests
    // ----------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    // Testing JDK against old Lang functionality
    

    

    

    /**
     * Tests isNumber(String) and tests that createNumber(String) returns
     * a valid number iff isNumber(String) returns false.
     */
    

    private boolean checkCreateNumber(final String val) {
        try {
            final Object obj = NumberUtils.createNumber(val);
            if (obj == null) {
                return false;
            }
            return true;
        } catch (final NumberFormatException e) {
            return false;
       }
    }

    

    

    

}
