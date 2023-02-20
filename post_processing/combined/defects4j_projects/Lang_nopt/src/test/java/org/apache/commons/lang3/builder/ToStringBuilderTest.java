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
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.SystemUtils;
import org.junit.After;
import org.junit.Test;

/**
 * Unit tests for {@link org.apache.commons.lang3.builder.ToStringBuilder}.
 *
 * @version $Id$
 */
public class ToStringBuilderTest {

    private final Integer base = Integer.valueOf(5);
    private final String baseStr = base.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(base));

    /*
     * All tests should leave the registry empty. 
     */
    @After
    public void after(){
        validateNullToStringStyleRegistry();
    }

    //-----------------------------------------------------------------------

@Test
void appendInternal() { final Map<Integer, String> map = new HashMap<Integer, String>(); map.put(1, "one"); map.put(2, "two"); map.put(3, "three"); map.put(4, "four"); map.put(5, "five"); map.put(6, "six"); map.put(7, "seven"); map.put(8, "eight"); map.put(9, "nine"); map.put(10, "nine"); map.put(11, "nine"); map.put(12, "nine"); final StringBuffer buffer = new StringBuffer();
}

@Test
void appendDetail() { final Map<Integer, String> map = new HashMap<Integer, String>(); map.put(1, "one"); map.put(2, "two"); map.put(3, "three"); map.put(4, "four"); map.put(5, "five"); map.put(6, "six"); map.put(7, "seven"); map.put(8, "eight"); map.put(9, "nine"); map.put(10, "nine"); map.put(11, "nine"); map.put(12, "nine"); final StringBuffer buffer = new StringBuffer();
}

    

    

    

    

    

    

    /**
     * Test wrapper for int primitive.
     */
    

    /**
     * Test wrapper for char primitive.
     */
    

    /**
     * Test wrapper for char boolean.
     */
    

    /**
     * Create the same toString() as Object.toString().
     * @param o the object to create the string for.
     * @return a String in the Object.toString format.
     */
    private String toBaseString(final Object o) {
        return o.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(o));
    }

    // Reflection Array tests

    //
    // Note on the following line of code repeated in the reflection array tests.
    //
    // assertReflectionArray("<null>", array);
    //
    // The expected value is not baseStr + "[<null>]" since array==null and is typed as Object.
    // The null array does not carry array type information.
    // If we added a primitive array type constructor and pile of associated methods,
    // then type declaring type information could be carried forward. IMHO, null is null.
    //
    // Gary Gregory - 2003-03-12 - ggregory@seagullsw.com
    //

    public void assertReflectionArray(final String expected, final Object actual) {
        if (actual == null) {
            // Until ToStringBuilder supports null objects.
            return;
        }
        assertEquals(expected, ToStringBuilder.reflectionToString(actual));
        assertEquals(expected, ToStringBuilder.reflectionToString(actual, null));
        assertEquals(expected, ToStringBuilder.reflectionToString(actual, null, true));
        assertEquals(expected, ToStringBuilder.reflectionToString(actual, null, false));
    }

    

    

    

    

    

    

    

    

    

    // Reflection Array Array tests

    


    

    

    

    

    

    

    

    // Reflection hierarchy tests
    
// Defects4J: flaky method
//     @Test
//     public void testReflectionHierarchyArrayList() {
//         final List<Object> base = new ArrayList<Object>();
//         final String baseStr = this.toBaseString(base);
//         // note, the test data depends on the internal representation of the ArrayList, which may differ between JDK versions and vendors
//         final String expectedWithTransients = baseStr + "[elementData={<null>,<null>,<null>,<null>,<null>,<null>,<null>,<null>,<null>,<null>},size=0,modCount=0]";
//         final String toStringWithTransients = ToStringBuilder.reflectionToString(base, null, true);
//         if (!expectedWithTransients.equals(toStringWithTransients)) {
//             // representation different for IBM JDK 1.6.0, LANG-727
//             if (!("IBM Corporation".equals(SystemUtils.JAVA_VENDOR) && "1.6".equals(SystemUtils.JAVA_SPECIFICATION_VERSION))) {
//                 assertEquals(expectedWithTransients, toStringWithTransients);
//             }
//         }
//         final String expectedWithoutTransients = baseStr + "[size=0]";
//         final String toStringWithoutTransients = ToStringBuilder.reflectionToString(base, null, false);
//         if (!expectedWithoutTransients.equals(toStringWithoutTransients)) {
//             // representation different for IBM JDK 1.6.0, LANG-727
//             if (!("IBM Corporation".equals(SystemUtils.JAVA_VENDOR) && "1.6".equals(SystemUtils.JAVA_SPECIFICATION_VERSION))) {
//                 assertEquals(expectedWithoutTransients, toStringWithoutTransients);
//             }
//         }
//     }

    

    static class ReflectionTestFixtureA {
        @SuppressWarnings("unused")
        private final char a='a';
        @SuppressWarnings("unused")
        private transient char transientA='t';
    }

    static class ReflectionTestFixtureB extends ReflectionTestFixtureA {
        @SuppressWarnings("unused")
        private final char b='b';
        @SuppressWarnings("unused")
        private transient char transientB='t';
    }

    

    static class Outer {
        Inner inner = new Inner();
        class Inner {
            @Override
            public String toString() {
                return ToStringBuilder.reflectionToString(this);
            }
        }
        @Override
        public String toString() {
            return ToStringBuilder.reflectionToString(this);
        }
    }

    // Reflection cycle tests

    /**
     * Test an array element pointing to its container.
     */
    

    /**
     * Test an array element pointing to its container.
     */
    

    

    /**
     * A reflection test fixture.
     */
    static class ReflectionTestCycleA {
        ReflectionTestCycleB b;

        @Override
        public String toString() {
            return ToStringBuilder.reflectionToString(this);
        }
    }

    /**
     * A reflection test fixture.
     */
    static class ReflectionTestCycleB {
        ReflectionTestCycleA a;

        @Override
        public String toString() {
            return ToStringBuilder.reflectionToString(this);
        }
    }

    /**
     * A reflection test fixture.
     */
    static class SimpleReflectionTestFixture {
        Object o;

        public SimpleReflectionTestFixture() {
        }

        public SimpleReflectionTestFixture(final Object o) {
            this.o = o;
        }

        @Override
        public String toString() {
            return ToStringBuilder.reflectionToString(this);
        }
    }

    private static class SelfInstanceVarReflectionTestFixture {
        @SuppressWarnings("unused")
        private final SelfInstanceVarReflectionTestFixture typeIsSelf;

        public SelfInstanceVarReflectionTestFixture() {
            this.typeIsSelf = this;
        }

        @Override
        public String toString() {
            return ToStringBuilder.reflectionToString(this);
        }
      }

    private static class SelfInstanceTwoVarsReflectionTestFixture {
        @SuppressWarnings("unused")
        private final SelfInstanceTwoVarsReflectionTestFixture typeIsSelf;
        private final String otherType = "The Other Type";

        public SelfInstanceTwoVarsReflectionTestFixture() {
            this.typeIsSelf = this;
        }

        public String getOtherType(){
            return this.otherType;
        }

        @Override
        public String toString() {
            return ToStringBuilder.reflectionToString(this);
        }
      }


    /**
     * Test an Object pointing to itself, the simplest test.
     *
     * @throws Exception
     */
    

    /**
     * Test a class that defines an ivar pointing to itself.
     *
     * @throws Exception
     */
    

    /**
     * Test a class that defines an ivar pointing to itself.  This test was
     * created to show that handling cyclical object resulted in a missing endFieldSeparator call.
     *
     * @throws Exception
     */
    


    /**
     * Test Objects pointing to each other.
     *
     * @throws Exception
     */
    

    /**
     * Test a nasty combination of arrays and Objects pointing to each other.
     * objects[0] -> SimpleReflectionTestFixture[ o -> objects ]
     *
     * @throws Exception
     */
    

    void validateNullToStringStyleRegistry() {
        final Map<Object, Object> registry = ToStringStyle.getRegistry();
        assertNull("Expected null, actual: "+registry, registry);
    }
    //  End: Reflection cycle tests

    

    

    
    
    

    

    

    

    

    

    

    

    


    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    static class ObjectCycle {
        Object obj;

        @Override
        public String toString() {
            return new ToStringBuilder(this).append(obj).toString();
        }
    }

    

    /**
     * Tests ReflectionToStringBuilder.toString() for statics.
     */
    

    /**
     * Tests ReflectionToStringBuilder.toString() for statics.
     */
    

    /**
     * <p>This method uses reflection to build a suitable
     * <code>toString</code> value which includes static fields.</p>
     *
     * <p>It uses <code>AccessibleObject.setAccessible</code> to gain access to private
     * fields. This means that it will throw a security exception if run
     * under a security manager, if the permissions are not set up correctly.
     * It is also not as efficient as testing explicitly. </p>
     *
     * <p>Transient fields are not output.</p>
     *
     * <p>Superclass fields will be appended up to and including the specified superclass.
     * A null superclass is treated as <code>java.lang.Object</code>.</p>
     *
     * <p>If the style is <code>null</code>, the default
     * <code>ToStringStyle</code> is used.</p>
     *
     * @param object  the Object to be output
     * @param style  the style of the <code>toString</code> to create,
     *  may be <code>null</code>
     * @param reflectUpToClass  the superclass to reflect up to (inclusive),
     *  may be <code>null</code>
     * @return the String result
     * @throws IllegalArgumentException if the Object is <code>null</code>
     */
    public <T> String toStringWithStatics(final T object, final ToStringStyle style, final Class<? super T> reflectUpToClass) {
        return ReflectionToStringBuilder.toString(object, style, false, true, reflectUpToClass);
    }

    /**
     * Tests ReflectionToStringBuilder setUpToClass().
     */
    

    /**
     * Tests ReflectionToStringBuilder setUpToClass().
     */
    

    /**
     * Tests ReflectionToStringBuilder.toString() for statics.
     */
    class ReflectionStaticFieldsFixture {
        static final String staticString = "staticString";
        static final int staticInt = 12345;
        static final transient String staticTransientString = "staticTransientString";
        static final transient int staticTransientInt = 54321;
        String instanceString = "instanceString";
        int instanceInt = 67890;
        transient String transientString = "transientString";
        transient int transientInt = 98765;
    }

    /**
     * Test fixture for ReflectionToStringBuilder.toString() for statics.
     */
    class SimpleReflectionStaticFieldsFixture {
        static final String staticString = "staticString";
        static final int staticInt = 12345;
    }

    /**
     * Test fixture for ReflectionToStringBuilder.toString() for statics.
     */
    class InheritedReflectionStaticFieldsFixture extends SimpleReflectionStaticFieldsFixture {
        static final String staticString2 = "staticString2";
        static final int staticInt2 = 67890;
    }

    

    /**
     * Points out failure to print anything from appendToString methods using MULTI_LINE_STYLE.
     * See issue LANG-372.
     */
    class MultiLineTestObject {
        Integer i = Integer.valueOf(31337);
        @Override
        public String toString() {
            return new ToStringBuilder(this).append("testInt", i).toString();
        }
    }

    

}
