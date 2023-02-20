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
public void testGreatestCommonDivisor1231() { final int u = -1; final int v = 1; final int expected = -1; final Fraction f = Fraction.getReducedFraction(u, v); assertEquals(expected, f.getNumerator()); assertEquals(expected, f.getDenominator()); final Fraction f2 = Fraction.getReducedFraction(f.getNumerator(), f.getDenominator()); assertEquals(expected, f2.getNumerator()); assertEquals(expected, f2.getDenominator()); final Fraction f3 = Fraction.getReducedFraction(f.getNumerator(), f.getDenominator());
}

@Test
public void testPow1252() { Fraction f1 = Fraction.getFraction("1"); Fraction f2 = Fraction.getFraction("2"); Fraction f3 = Fraction.getFraction("3"); Fraction f4 = Fraction.getFraction("4"); Fraction f5 = Fraction.getFraction("5"); Fraction f6 = Fraction.getFraction("6"); Fraction f7 = Fraction.getFraction("7"); Fraction f8 = Fraction.getFraction("8"); Fraction f9 = Fraction.getFraction("9"); Fraction f10 = Fraction.getFraction("10");
}

@Test
public void testCompareTo1260() { Fraction a = Fraction.getReducedFraction(1, 2); Fraction b = Fraction.getReducedFraction(1, 3); Fraction c = Fraction.getReducedFraction(1, 2); assertEquals(0, a.compareTo(a)); assertEquals(0, b.compareTo(b)); assertEquals(-1, c.compareTo(c)); assertEquals(0, a.compareTo(c)); assertEquals(1, a.compareTo(a)); assertEquals(1, b.compareTo(b)); assertEquals(-1, c.compareTo(c)); }
    

    

    
    

    

    
    
    
    

    

    

    
            
    
    
    
    
    
    
    
    
    
    
    
    
    
            
    
            
    
            
    
            
    
    
    
    
    
    
    
    
    
}
