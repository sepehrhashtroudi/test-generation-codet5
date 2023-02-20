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
package org.apache.commons.lang3;

import static org.apache.commons.lang3.JavaVersion.JAVA_1_5;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

/**
 * Unit tests {@link org.apache.commons.lang3.ClassUtils}.
 *
 * @version $Id$
 */
@SuppressWarnings("boxing") // JUnit4 does not support primitive equality testing apart from long
public class ClassUtilsTest  {

    private static class Inner {
        private class DeeplyNested{}
    }

    //-----------------------------------------------------------------------
@Test
public void test_getPackageCanonicalName_Object21() { 
     assertEquals("org.apache.commons.lang3", ClassUtils.getPackageCanonicalName(new ClassUtils(), "<null>")); 
     assertEquals("org.apache.commons.lang3", ClassUtils.getPackageCanonicalName(new Inner(), "<null>")); 
     assertEquals("<null>", ClassUtils.getPackageCanonicalName(null, "<null>")); 
 }
@Test
public void test_getShortCanonicalName_Object40() { 
     assertEquals("ClassUtils", ClassUtils.getShortCanonicalName(new ClassUtils(), "<null>")); 
     assertEquals("ClassUtilsTest.Inner", ClassUtils.getShortCanonicalName(new Inner(), "<null>")); 
     assertEquals("String", ClassUtils.getShortCanonicalName("hello", "<null>")); 
     assertEquals("<null>", ClassUtils.getShortCanonicalName(null, "<null>")); 
     class Named extends Object { 
     } 
     assertEquals("ClassUtilsTest.1", ClassUtils.getShortCanonicalName(new Object() { 
     }, "<null>")); 
     assertEquals("ClassUtilsTest.1Named", ClassUtils.getShortCanonicalName(new Named(), "<null>")); 
     assertEquals("ClassUtilsTest.Inner", ClassUtils.getShortCanonicalName(new Inner(), "<null>")); 
 }
@Test
public void testGetClassWithArrayClasses111() throws Exception { 
     assertGetClassReturnsClass(String[].class); 
     assertGetClassReturnsClass(int[].class); 
     assertGetClassReturnsClass(long[].class); 
     assertGetClassReturnsClass(short[].class); 
     assertGetClassReturnsClass(byte[].class); 
     assertGetClassReturnsClass(char[].class); 
     assertGetClassReturnsClass(float[].class); 
     assertGetClassReturnsClass(double[].class); 
     assertGetClassReturnsClass(boolean[].class); 
 }
@Test
public void testConstructor209() { 
     assertNotNull(new ClassUtils()); 
     final Constructor<?>[] cons = ClassUtils.class.getDeclaredConstructors(); 
     assertEquals(1, cons.length); 
     assertTrue(Modifier.isPublic(cons[0].getModifiers())); 
     assertTrue(Modifier.isPublic(ClassUtils.class.getModifiers())); 
     assertFalse(Modifier.isFinal(ClassUtils.class.getModifiers())); 
 }
@Test
public void test_getPackageName_String210() { 
     assertEquals("org.apache.commons.lang3", ClassUtils.getPackageName(ClassUtils.class.getName())); 
     assertEquals("java.util", ClassUtils.getPackageName(Map.Entry.class.getName())); 
     assertEquals("", ClassUtils.getPackageName((String) null)); 
     assertEquals("", ClassUtils.getPackageName("")); 
 }
@Test
public void test_getPackageName_Class412() { 
     assertEquals("org.apache.commons.lang3", ClassUtils.getPackageName(ClassUtils.class)); 
     assertEquals("java.util", ClassUtils.getPackageName(Map.Entry.class)); 
     assertEquals("", ClassUtils.getPackageName((Class<?>) null)); 
     assertEquals("", ClassUtils.getPackageName(String.class)); 
     assertEquals("", ClassUtils.getPackageName(Map.Entry[].class)); 
     assertEquals("", ClassUtils.getPackageName(String[][].class)); 
     assertEquals("", ClassUtils.getPackageName(int[].class)); 
     assertEquals("", ClassUtils.getPackageName(int[][].class)); 
     class Named extends Object { 
     } 
     assertEquals("org.apache.commons.lang3", ClassUtils.getPackageName(new Object() { 
     }.getClass())); 
     assertEquals("org.apache.commons.lang3", ClassUtils.getPackageName(Named.class)); 
     assertEquals("org.apache.commons.lang3", ClassUtils.getPackageName(Inner.class)); 
 }
@Test
public void test_getShortClassName_Class439() { 
     assertEquals("ClassUtils", ClassUtils.getShortClassName(ClassUtils.class)); 
     assertEquals("Map.Entry", ClassUtils.getShortClassName(Map.Entry.class)); 
     assertEquals("", ClassUtils.getShortClassName((Class<?>) null)); 
     assertEquals("String[]", ClassUtils.getShortClassName(String[].class)); 
     assertEquals("Map.Entry[]", ClassUtils.getShortClassName(Map.Entry[].class)); 
     assertEquals("boolean", ClassUtils.getShortClassName(boolean.class)); 
     assertEquals("byte", ClassUtils.getShortClassName(byte.class)); 
     assertEquals("char", ClassUtils.getShortClassName(char.class)); 
     assertEquals("short", ClassUtils.getShortClassName(short.class)); 
     assertEquals("int", ClassUtils.getShortClassName(int.class)); 
     assertEquals("long", ClassUtils.getShortClassName(long.class)); 
     assertEquals("float", ClassUtils.getShortClassName(float.class)); 
     assertEquals("double", ClassUtils.getShortClassName(double.class)); 
     assertEquals("boolean[]", ClassUtils.getShortClassName(boolean[].class)); 
     assertEquals("byte[]", ClassUtils.getShortClassName(byte[].class)); 
     assertEquals("char[]", ClassUtils.getShortClassName(char[].class)); 
     assertEquals("short[]", ClassUtils.getShortClassName(short[].class)); 
     assertEquals("int[]", ClassUtils.getShortClassName(int[].class)); 
     assertEquals("long[]", ClassUtils.getShortClassName(long[].class)); 
     assertEquals("float[]", ClassUtils.getShortClassName(float[].class)); 
     assertEquals("double[]", ClassUtils.getShortClassName(double[].class)); 
     assertEquals("String[][]", ClassUtils.getShortClassName(String[][].class)); 
     assertEquals("String[][][]", ClassUtils.getShortClassName(String[][][].class));
}

@Test
public void test_getShortCanonicalName_String440() { 
     assertEquals("ClassUtils", ClassUtils.getShortCanonicalName(ClassUtils.class.getName())); 
     assertEquals("ClassUtils[]", ClassUtils.getShortCanonicalName(ClassUtils[].class.getName())); 
     assertEquals("ClassUtils[][]", ClassUtils.getShortCanonicalName(ClassUtils[][].class.getName())); 
     assertEquals("int[]", ClassUtils.getShortCanonicalName(int[].class.getName())); 
     assertEquals("int[][]", ClassUtils.getShortCanonicalName(int[][].class.getName())); 
     class Named extends Object { 
     } 
     assertEquals("ClassUtilsTest.7", ClassUtils.getShortCanonicalName(new Object() { 
     }.getClass())); 
     assertEquals("ClassUtilsTest.6Named", ClassUtils.getShortCanonicalName(Named.class.getName())); 
     assertEquals("ClassUtilsTest.Inner", ClassUtils.getShortCanonicalName(Inner.class.getName())); 
 }
    

    // -------------------------------------------------------------------------
    

    



    

    

    

    // -------------------------------------------------------------------------
    

    

    

    // -------------------------------------------------------------------------
    

    

    private static interface IA {
    }
    private static interface IB {
    }
    private static interface IC extends ID, IE {
    }
    private static interface ID {
    }
    private static interface IE extends IF {
    }
    private static interface IF {
    }
    private static class CX implements IB, IA, IE {
    }
    private static class CY extends CX implements IB, IC {
    }

    // -------------------------------------------------------------------------
    

    

    // -------------------------------------------------------------------------
    

    // -------------------------------------------------------------------------
    

    

    

    

    

    

    

    

    

    
    
    
    
    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    

    private void assertGetClassReturnsClass( final Class<?> c ) throws Exception {
        assertEquals( c, ClassUtils.getClass( c.getName() ) );
    }

    private void assertGetClassThrowsException( final String className, final Class<?> exceptionType ) throws Exception {
        try {
            ClassUtils.getClass( className );
            fail( "ClassUtils.getClass() should fail with an exception of type " + exceptionType.getName() + " when given class name \"" + className + "\"." );
        }
        catch( final Exception e ) {
            assertTrue( exceptionType.isAssignableFrom( e.getClass() ) );
        }
    }

    private void assertGetClassThrowsNullPointerException( final String className ) throws Exception {
        assertGetClassThrowsException( className, NullPointerException.class );
    }

    private void assertGetClassThrowsClassNotFound( final String className ) throws Exception {
        assertGetClassThrowsException( className, ClassNotFoundException.class );
    }

    // Show the Java bug: http://bugs.sun.com/bugdatabase/view_bug.do?bug_id=4071957
    // We may have to delete this if a JDK fixes the bug.
    

    

    

    

    

    

    

    

    

}
