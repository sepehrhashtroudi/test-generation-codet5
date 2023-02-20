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
package org.apache.commons.lang3.reflect;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.apache.commons.lang3.mutable.MutableObject;

/**
 * Unit tests ConstructorUtils
 * @version $Id$
 */
public class ConstructorUtilsTest {
    public static class TestBean {
        private final String toString;

        public TestBean() {
            toString = "()";
        }

        public TestBean(final int i) {
            toString = "(int)";
        }

        public TestBean(final Integer i) {
            toString = "(Integer)";
        }

        public TestBean(final double d) {
            toString = "(double)";
        }

        public TestBean(final String s) {
            toString = "(String)";
        }

        public TestBean(final Object o) {
            toString = "(Object)";
        }

        @Override
        public String toString() {
            return toString;
        }
    }

    private static class PrivateClass {
        @SuppressWarnings("unused")
        public PrivateClass() {
        }
    }

    private final Map<Class<?>, Class<?>[]> classCache;

    public ConstructorUtilsTest() {
        classCache = new HashMap<Class<?>, Class<?>[]>();
    }


    @Before
    public void setUp() throws Exception {
        classCache.clear();
    }

    

    

    

    

    

    

    

    private void expectMatchingAccessibleConstructorParameterTypes(final Class<?> cls,
            final Class<?>[] requestTypes, final Class<?>[] actualTypes) {
        final Constructor<?> c = ConstructorUtils.getMatchingAccessibleConstructor(cls,
                requestTypes);
        assertTrue(toString(c.getParameterTypes()) + " not equals "
                + toString(actualTypes), Arrays.equals(actualTypes, c
                .getParameterTypes()));
    }

    private String toString(final Class<?>[] c) {
        return Arrays.asList(c).toString();
    }

    private Class<?>[] singletonArray(final Class<?> c) {
        Class<?>[] result = classCache.get(c);
        if (result == null) {
            result = new Class[] { c };
            classCache.put(c, result);
        }
        return result;
    }

}
