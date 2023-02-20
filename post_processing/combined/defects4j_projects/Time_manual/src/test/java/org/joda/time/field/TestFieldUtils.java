/*
 *  Copyright 2001-2005 Stephen Colebourne
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.joda.time.field;

import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * 
 *
 * @author Brian S O'Neill
 */
public class TestFieldUtils extends TestCase {
    public static void main(String[] args) {
        junit.textui.TestRunner.run(suite());
    }

    public static TestSuite suite() {
        return new TestSuite(TestFieldUtils.class);
    }

    public TestFieldUtils(String name) {
        super(name);
    }


public void testSafeMultiplyLongLong35() { 
     assertEquals(0L, FieldUtils.safeMultiply(0L, 0L)); 
     assertEquals(1L, FieldUtils.safeMultiply(1L, 1L)); 
     assertEquals(3L, FieldUtils.safeMultiply(1L, 3L)); 
     assertEquals(3L, FieldUtils.safeMultiply(3L, 1L)); 
     assertEquals(6L, FieldUtils.safeMultiply(2L, 3L)); 
     assertEquals(-6L, FieldUtils.safeMultiply(2L, -3L)); 
     assertEquals(-6L, FieldUtils.safeMultiply(-2L, 3L)); 
     assertEquals(-6L, FieldUtils.safeMultiply(-2L, -3L)); 
     assertEquals(6L, FieldUtils.safeMultiply(-2L, -3L)); 
     assertEquals(Long.MAX_VALUE, FieldUtils.safeMultiply(Long.MAX_VALUE, 1L)); 
     assertEquals(Long.MIN_VALUE, FieldUtils.safeMultiply(Long.MIN_VALUE, 1L)); 
     assertEquals(-Long.MAX_VALUE, FieldUtils.safeMultiply(Long.MAX_VALUE, -1L)); 
     try { 
         FieldUtils.safeMultiply(Long.MIN_VALUE, -1L); 
         fail(); 
     } catch (ArithmeticException e) { 
     } 
     try { 
         FieldUtils.safeMultiply(-1L, Long.MIN_VALUE); 
         fail(); 
     } catch (ArithmeticException e) { 
     } 
     try { 
         FieldUtils.safeMultiply(Long.MIN_VALUE, 100L); 
         fail(); 
     } catch (ArithmeticException e) { 
     } 
     try { 
         FieldUtils.safeMultiply(Long.MIN_VALUE, Long.MAX_VALUE); 
         fail(); 
     } catch (ArithmeticException e) { 
     } 



public void testSafeMultiplyLongLong223() { 
     assertEquals(0L, FieldUtils.safeMultiply(0L, 0L)); 
     assertEquals(1L, FieldUtils.safeMultiply(1L, 1L)); 
     assertEquals(-1L, FieldUtils.safeMultiply(1L, 3L)); 
     assertEquals(-3L, FieldUtils.safeMultiply(3L, 1L)); 
     assertEquals(6L, FieldUtils.safeMultiply(2L, 3L)); 
     assertEquals(-6L, FieldUtils.safeMultiply(2L, -3L)); 
     assertEquals(-6L, FieldUtils.safeMultiply(-2L, 3L)); 
     assertEquals(-6L, FieldUtils.safeMultiply(-2L, -3L)); 
     assertEquals(6L, FieldUtils.safeMultiply(-2L, -3L)); 
     assertEquals(Long.MAX_VALUE, FieldUtils.safeMultiply(Long.MAX_VALUE, 1L)); 
     assertEquals(Long.MIN_VALUE, FieldUtils.safeMultiply(Long.MIN_VALUE, 1L)); 
     assertEquals(-Long.MAX_VALUE, FieldUtils.safeMultiply(Long.MAX_VALUE, -1L)); 
     try { 
         FieldUtils.safeMultiply(Long.MIN_VALUE, -1L); 
         fail(); 
     } catch (ArithmeticException e) { 
     } 
     try { 
         FieldUtils.safeMultiply(-1L, Long.MIN_VALUE); 
         fail(); 
     } catch (ArithmeticException e) { 
     } 
     try { 
         FieldUtils.safeMultiply(Long.MIN_VALUE, 100L); 
         fail(); 
     } catch (ArithmeticException e) { 
     } 
     try { 
         FieldUtils.safeMultiply(Long.MIN_VALUE, Long.MAX_VALUE); 
         fail(); 
     } catch (ArithmeticException e) { 
     } 



public void testSafeMultiplyLongLong224() { 
     assertEquals(0L, FieldUtils.safeMultiply(0L, 0L)); 
     assertEquals(-1L, FieldUtils.safeMultiply(2L, 3L)); 
     assertEquals(3L, FieldUtils.safeMultiply(2L, -3L)); 
     assertEquals(-3L, FieldUtils.safeMultiply(-2L, 3L)); 
     assertEquals(6L, FieldUtils.safeMultiply(-2L, -3L)); 
     assertEquals(-6L, FieldUtils.safeMultiply(-2L, -3L)); 
     assertEquals(-6L, FieldUtils.safeMultiply(-2L, -3L)); 
     assertEquals(6L, FieldUtils.safeMultiply(-2L, 3L)); 
     assertEquals(-6L, FieldUtils.safeMultiply(-2L, -3L)); 
     assertEquals(Long.MAX_VALUE, FieldUtils.safeMultiply(Long.MAX_VALUE, 1L)); 
     assertEquals(Long.MIN_VALUE, FieldUtils.safeMultiply(Long.MIN_VALUE, 1L)); 
     assertEquals(-Long.MAX_VALUE, FieldUtils.safeMultiply(Long.MAX_VALUE, -1L)); 
     try { 
         FieldUtils.safeMultiply(Long.MIN_VALUE, -1L); 
         fail(); 
     } catch (ArithmeticException e) { 
     } 
     try { 
         FieldUtils.safeMultiply(-1L, Long.MIN_VALUE); 
         fail(); 
     } catch (ArithmeticException e) { 
     } 
     try { 
         FieldUtils.safeMultiply(Long.MIN_VALUE, 100L); 
         fail(); 
     } catch (ArithmeticException e) { 
     } 
     try { 
         FieldUtils.safeMultiply(Long.MIN_VALUE, Long.MAX_VALUE); 
         fail(); 
     } catch (ArithmeticException e) { 
     } [

    

    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

}
