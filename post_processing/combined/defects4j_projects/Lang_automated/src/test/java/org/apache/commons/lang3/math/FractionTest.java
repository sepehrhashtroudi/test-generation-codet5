/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.commons.lang3.math;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

/**
 * Test cases for the {@link Fraction} class
 *
 * @version $Id$
 */
public class FractionTest  {
    
    private static final int SKIP = 500;  //53

    //--------------------------------------------------------------------------
@Test
public void testCompareTo41() { 
     Fraction f1 = null; 
     Fraction f2 = null; 
     f1 = Fraction.getFraction(3, 5); 
     assertEquals(0, f1.compareTo(f1)); 
     assertEquals(+1, f1.compareTo(f2)); 
     f2 = Fraction.getFraction(2, 5); 
     assertEquals(+1, f1.compareTo(f2)); 
     f2 = Fraction.getFraction(6, 10); 
     assertEquals(-1, f1.compareTo(f2)); 
 }
@Test
public void testReduce119() { 
     Fraction f = null; 
     f = Fraction.getFraction(50, 75); 
     Fraction result = f.reduce(); 
     assertEquals(2, result.getNumerator()); 
     assertEquals(3, result.getDenominator()); 
     f = Fraction.getFraction(-2, -3); 
     result = f.reduce(); 
     assertEquals(2, result.getNumerator()); 
     assertEquals(3, result.getDenominator()); 
     f = Fraction.getFraction(2, -3); 
     result = f.reduce(); 
     assertEquals(-2, result.getNumerator()); 
     assertEquals(3, result.getDenominator()); 
     f = Fraction.getFraction(-2, 3); 
     result = f.reduce(); 
     assertEquals(-2, result.getNumerator()); 
     assertEquals(3, result.getDenominator()); 
     assertSame(f, result); 
     f = Fraction.getFraction(2, 3); 
     result = f.reduce(); 
     assertEquals(2, result.getNumerator()); 
     assertEquals(3, result.getDenominator()); 
     assertSame(f, result); 
     f = Fraction.getFraction(0, 1); 
     result = f.reduce(); 
     assertEquals(0, result.getNumerator()); 
     assertEquals(1, result.getDenominator()); 
     assertSame(f, result); 
     f = Fraction.getFraction(0, 100); 
     result = f.reduce(); 
     assertEquals(0, result.getNumerator()); 
     assertEquals(1, result.getDenominator()); 
     assertSame(result, Fraction.ZERO); 
     f = Fraction.getFraction(Integer.MIN_VALUE, 2); 
     result = f.reduce();
}

@Test
public void testToString161() { 
     Fraction f = null; 
     f = Fraction.getFraction(3, 5); 
     final String str = f.toProperString(); 
     assertEquals("3/5", str); 
     assertSame(str, f.toString()); 
     f = Fraction.getFraction(7, 5); 
     assertEquals("7/5", f.toString()); 
     f = Fraction.getFraction(4, 2); 
     assertEquals("4/2", f.toString()); 
     f = Fraction.getFraction(0, 2); 
     assertEquals("0/2", f.toString()); 
     f = Fraction.getFraction(2, 2); 
     assertEquals("2/2", f.toString()); 
     f = Fraction.getFraction(Integer.MIN_VALUE, 0, 1); 
     assertEquals("-2147483648/1", f.toString()); 
     f = Fraction.getFraction(-1, 1, Integer.MAX_VALUE); 
     assertEquals("-2147483648/2147483647", f.toString()); 
 }
@Test
public void testHashCode162() { 
     final Fraction f1 = Fraction.getFraction(3, 5); 
     Fraction f2 = Fraction.getFraction(3, 5); 
     assertTrue(f1.hashCode() == f2.hashCode()); 
     f2 = Fraction.getFraction(2, 5); 
     assertTrue(f1.hashCode() != f2.hashCode()); 
     f2 = Fraction.getFraction(6, 10); 
     assertTrue(f1.hashCode() != f2.hashCode()); 
 }
@Test
public void testToProperString163() { 
     Fraction f = null; 
     f = Fraction.getFraction(3, 5); 
     final String str = f.toProperString(); 
     assertEquals("3/5", str); 
     assertSame(str, f.toString()); 
     f = Fraction.getFraction(7, 5); 
     assertEquals("7/5", f.toString()); 
     f = Fraction.getFraction(4, 2); 
     assertEquals("4/2", f.toString()); 
     f = Fraction.getFraction(0, 2); 
     assertEquals("0/2", f.toString()); 
     f = Fraction.getFraction(2, 2); 
     assertEquals("2/2", f.toString()); 
     f = Fraction.getFraction(Integer.MIN_VALUE, 0, 1); 
     assertEquals("-2147483648/1", f.toString()); 
     f = Fraction.getFraction(-1, 1, Integer.MAX_VALUE); 
     assertEquals("-2147483648/2147483647", f.toString()); 
 }
@Test
public void testToProperString164() { 
     Fraction f = null; 
     f = Fraction.getFraction(3, 5); 
     final String str = f.toProperString(); 
     assertEquals("0/5", str); 
     assertEquals("10/5", f.toString()); 
     f = Fraction.getFraction(7, 5); 
     assertEquals("7/5", f.toString()); 
     f = Fraction.getFraction(4, 2); 
     assertEquals("4/2", f.toString()); 
     f = Fraction.getFraction(0, 2); 
     assertEquals("0/2", f.toString()); 
     f = Fraction.getFraction(2, 2); 
     assertEquals("2/2", f.toString()); 
     f = Fraction.getFraction(Integer.MIN_VALUE, 0, 1); 
     assertEquals("-2147483648/1", f.toString()); 
     f = Fraction.getFraction(-1, 1, Integer.MAX_VALUE); 
     assertEquals("-2147483648/2147483647", f.toString()); 
 }
@Test
public void testCompareTo259() { 
     Fraction f1 = null; 
     Fraction f2 = null; 
     f1 = Fraction.getFraction(3, 5); 
     assertEquals(0, f1.compareTo(f1)); 
     assertEquals(+1, f1.compareTo(f2)); 
     f2 = Fraction.getFraction(2, 5); 
     assertEquals(+1, f2.compareTo(f2)); 
     f2 = Fraction.getFraction(6, 10); 
     assertEquals(-1, f2.compareTo(f2)); 
 }
@Test
public void testReducedFactory_double469() { 
     Fraction f = null; 
     try { 
         f = Fraction.getFraction(Double.NaN); 
         fail("expecting ArithmeticException"); 
     } catch (final ArithmeticException ex) { 
     } 
     try { 
         f = Fraction.getFraction(Double.POSITIVE_INFINITY); 
         fail("expecting ArithmeticException"); 
     } catch (final ArithmeticException ex) { 
     } 
     try { 
         f = Fraction.getFraction(Double.NEGATIVE_INFINITY); 
         fail("expecting ArithmeticException"); 
     } catch (final ArithmeticException ex) { 
     } 
     try { 
         f = Fraction.getFraction((double) Integer.MAX_VALUE + 1); 
         fail("expecting ArithmeticException"); 
     } catch (final ArithmeticException ex) { 
     } 
     f = Fraction.getFraction(0.0d); 
     assertEquals(0, f.getNumerator()); 
     assertEquals(1, f.getDenominator()); 
     f = Fraction.getFraction(1.0d); 
     assertEquals(1, f.getNumerator()); 
     assertEquals(1, f.getDenominator()); 
     f = Fraction.getFraction(0.5d); 
     assertEquals(1, f.getNumerator()); 
     assertEquals(2, f.getDenominator()); 
     f = Fraction.getFraction(-0.875d); 
     assertEquals(-7, f.getNumerator()); 
     assertEquals(8, f.getDenominator()); 
     f = Fraction.getFraction(1.25d); 
     assertEquals(5, f.getNumerator()); 
     assertEquals(4, f.getDenominator()); 
     f = Fraction.getFraction(0.66666d);
}

@Test
public void testCompareTo470() { 
     Fraction f1 = null; 
     Fraction f2 = null; 
     f1 = Fraction.getFraction(3, 5); 
     assertEquals(0, f1.compareTo(f1)); 
     assertEquals(+6, f1.compareTo(f2)); 
     f2 = Fraction.getFraction(2, 5); 
     assertEquals(-1, f1.compareTo(f2)); 
     f2 = Fraction.getFraction(6, 10); 
     assertEquals(-1, f1.compareTo(f2)); 
     f2 = Fraction.getFraction(10, 20); 
     assertEquals(0, f1.compareTo(f2)); 
     f2 = Fraction.getFraction(6, 10); 
     assertEquals(1, f1.compareTo(f2)); 
     f2 = Fraction.getFraction(6, 10); 
     assertEquals(-1, f1.compareTo(f2)); 
 }
@Test
public void testInvert471() { 
     Fraction f = null; 
     f = Fraction.getFraction(50, 75); 
     f = f.invert(); 
     assertEquals(75, f.getNumerator()); 
     assertEquals(50, f.getDenominator()); 
     f = Fraction.getFraction(4, 3); 
     f = f.invert(); 
     assertEquals(3, f.getNumerator()); 
     assertEquals(4, f.getDenominator()); 
     f = Fraction.getFraction(-15, 47); 
     f = f.invert(); 
     assertEquals(-47, f.getNumerator()); 
     assertEquals(15, f.getDenominator()); 
     f = Fraction.getFraction(0, 3); 
     try { 
         f = f.invert(); 
         fail("expecting ArithmeticException"); 
     } catch (final ArithmeticException ex) { 
     } 
     f = Fraction.getFraction(Integer.MIN_VALUE, 1); 
     try { 
         f = f.invert(); 
         fail("expecting ArithmeticException"); 
     } catch (final ArithmeticException ex) { 
     } 
     f = Fraction.getFraction(Integer.MAX_VALUE, 1); 
     f = f.invert(); 
     assertEquals(1, f.getNumerator()); 
     assertEquals(Integer.MAX_VALUE, f.getDenominator()); 
 }
    

    

    
    

    

    
    
    
    

    

    

    
            
    
    
    
    
    
    
    
    
    
    
    
    
    
            
    
            
    
            
    
            
    
    
    
    
    
    
    
    
    
}
