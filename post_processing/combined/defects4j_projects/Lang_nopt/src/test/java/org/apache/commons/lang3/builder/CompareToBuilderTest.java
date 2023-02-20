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
package org.apache.commons.lang3.builder;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.math.BigInteger;

import org.junit.Test;

/**
 * Unit tests {@link org.apache.commons.lang3.builder.CompareToBuilder}.
 *
 * @version $Id$
 */
public class CompareToBuilderTest {

    //-----------------------------------------------------------------------

    static class TestObject implements Comparable<TestObject> {
        private int a;
        public TestObject(final int a) {
            this.a = a;
        }
        @Override
        public boolean equals(final Object o) {
            if (o == this) {
                return true;
            }
            if (!(o instanceof TestObject)) {
                return false;
            }
            final TestObject rhs = (TestObject) o;
            return a == rhs.a;
        }

        @Override
        public int hashCode() {
            return a;
        }

        public void setA(final int a) {
            this.a = a;
        }

        public int getA() {
            return a;
        }
        @Override
        public int compareTo(final TestObject rhs) {
            return a < rhs.a ? -1 : a > rhs.a ? +1 : 0;
        }
    }

    static class TestSubObject extends TestObject {
        private int b;
        public TestSubObject() {
            super(0);
        }
        public TestSubObject(final int a, final int b) {
            super(a);
            this.b = b;
        }
        @Override
        public boolean equals(final Object o) {
            if (o == this) {
                return true;
            }
            if (!(o instanceof TestSubObject)) {
                return false;
            }
            final TestSubObject rhs = (TestSubObject) o;
            return super.equals(o) && b == rhs.b;
        }
    }

    static class TestTransientSubObject extends TestObject {
        @SuppressWarnings("unused")
        private transient int t;
        public TestTransientSubObject(final int a, final int t) {
            super(a);
            this.t = t;
        }
    }
    
@Test
public void testIntArray500() { final int[] lhs = new int[] {1, 2, 3}; final int[] rhs = new int[] {1, 2, 3}; CompareToBuilder builder = new CompareToBuilder(); builder.append(lhs, rhs); assertTrue(builder.toString().contains("1")); assertTrue(builder.toString().contains("2")); assertTrue(builder.toString().contains("3")); builder.append(lhs, rhs); assertTrue(builder.toString().contains("1")); assertTrue(builder.toString().contains("2")); builder.append(lhs, rhs); assertTrue(builder.toString().contains("3"));
}

@Test
public void testCompareToBuilder506() { CompareToBuilder builder = new CompareToBuilder(); builder.append((byte) 1, (byte) 1); builder.append((short) 1, (short) 1); builder.append((int) 1, 1); builder.append((int) 1, 1); builder.append((short) 1, (short) 1); builder.append((int) 1, 1); builder.append((short) 1, (short) 1); builder.append((int) 1, 1); builder.append((short) 1, (short) 1); builder.append((int) 1, 1); builder.append((short) 1, (short) 1);
}

    

    

    

    
    
    
    
    
    
    private void assertXYZCompareOrder(final Object x, final Object y, final Object z, final boolean testTransients, final String[] excludeFields) {
        assertTrue(0 == CompareToBuilder.reflectionCompare(x, x, testTransients, null, excludeFields));
        assertTrue(0 == CompareToBuilder.reflectionCompare(y, y, testTransients, null, excludeFields));
        assertTrue(0 == CompareToBuilder.reflectionCompare(z, z, testTransients, null, excludeFields));
        
        assertTrue(0 > CompareToBuilder.reflectionCompare(x, y, testTransients, null, excludeFields));
        assertTrue(0 > CompareToBuilder.reflectionCompare(x, z, testTransients, null, excludeFields));
        assertTrue(0 > CompareToBuilder.reflectionCompare(y, z, testTransients, null, excludeFields));
        
        assertTrue(0 < CompareToBuilder.reflectionCompare(y, x, testTransients, null, excludeFields));
        assertTrue(0 < CompareToBuilder.reflectionCompare(z, x, testTransients, null, excludeFields));
        assertTrue(0 < CompareToBuilder.reflectionCompare(z, y, testTransients, null, excludeFields));
    }
    
    private void testReflectionHierarchyCompare(final boolean testTransients, final String[] excludeFields) {
        final TestObject to1 = new TestObject(1);
        final TestObject to2 = new TestObject(2);
        final TestObject to3 = new TestObject(3);
        final TestSubObject tso1 = new TestSubObject(1, 1);
        final TestSubObject tso2 = new TestSubObject(2, 2);
        final TestSubObject tso3 = new TestSubObject(3, 3);
        
        assertReflectionCompareContract(to1, to1, to1, false, excludeFields);
        assertReflectionCompareContract(to1, to2, to3, false, excludeFields);
        assertReflectionCompareContract(tso1, tso1, tso1, false, excludeFields);
        assertReflectionCompareContract(tso1, tso2, tso3, false, excludeFields);
        assertReflectionCompareContract("1", "2", "3", false, excludeFields);
        
        assertTrue(0 != CompareToBuilder.reflectionCompare(tso1, new TestSubObject(1, 0), testTransients));
        assertTrue(0 != CompareToBuilder.reflectionCompare(tso1, new TestSubObject(0, 1), testTransients));

        // root class
        assertXYZCompareOrder(to1, to2, to3, true, null);
        // subclass  
        assertXYZCompareOrder(tso1, tso2, tso3, true, null);  
    }

    /**
     * See "Effective Java" under "Consider Implementing Comparable".
     *  
     * @param x an object to compare 
     * @param y an object to compare
     * @param z an object to compare
     * @param testTransients Whether to include transients in the comparison
     * @param excludeFields fields to exclude
     */
    private void assertReflectionCompareContract(final Object x, final Object y, final Object z, final boolean testTransients, final String[] excludeFields) {

        // signum
        assertTrue(reflectionCompareSignum(x, y, testTransients, excludeFields) == -reflectionCompareSignum(y, x, testTransients, excludeFields));
        
        // transitive
        if (CompareToBuilder.reflectionCompare(x, y, testTransients, null, excludeFields) > 0 
                && CompareToBuilder.reflectionCompare(y, z, testTransients, null, excludeFields) > 0){
            assertTrue(CompareToBuilder.reflectionCompare(x, z, testTransients, null, excludeFields) > 0);
        }
        
        // un-named
        if (CompareToBuilder.reflectionCompare(x, y, testTransients, null, excludeFields) == 0) {
            assertTrue(reflectionCompareSignum(x, z, testTransients, excludeFields) == -reflectionCompareSignum(y, z, testTransients, excludeFields));
        }
        
        // strongly recommended but not strictly required
        assertTrue(CompareToBuilder.reflectionCompare(x, y, testTransients) ==0 == EqualsBuilder.reflectionEquals(x, y, testTransients));
    }
    
    /**
     * Returns the signum of the result of comparing x and y with
     * <code>CompareToBuilder.reflectionCompare</code>
     * 
     * @param lhs The "left-hand-side" of the comparison.
     * @param rhs The "right-hand-side" of the comparison.
     * @param testTransients Whether to include transients in the comparison
     * @param excludeFields fields to exclude
     * @return int The signum
     */
    private int reflectionCompareSignum(final Object lhs, final Object rhs, final boolean testTransients, final String[] excludeFields) {
        return BigInteger.valueOf(CompareToBuilder.reflectionCompare(lhs, rhs, testTransients)).signum();
    }
    
    
    
    
    
    

    

    
    
    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    
    
    

    

    

    

    

    

    

    

    

    

    

    

    

    
  
 }
