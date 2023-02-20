package com.fasterxml.jackson.core.main;

import com.fasterxml.jackson.core.io.NumberInput;

/**
 * Set of basic unit tests for verifying that the low-level number
 * handling methods work as expected.
 */
public class TestNumberParsing
    extends com.fasterxml.jackson.test.BaseTest
{

public void testLongBoundsChecks43() throws Exception { 
     String minLong = String.valueOf(Long.MIN_VALUE).substring(1); 
     String maxLong = String.valueOf(Long.MAX_VALUE); 
     final String VALUE_491 = "1323372036854775807"; 
     final String OVERFLOW = "9999999999999999999"; 
     assertTrue(NumberInput.inLongRange(minLong, true)); 
     assertTrue(NumberInput.inLongRange(maxLong, false)); 
     assertTrue(NumberInput.inLongRange(VALUE_491, true)); 
     assertTrue(NumberInput.inLongRange(VALUE_491, false)); 
     assertFalse(NumberInput.inLongRange(OVERFLOW, false)); 
     assertFalse(NumberInput.inLongRange(OVERFLOW, true)); 
     char[] cbuf = minLong.toCharArray(); 
     assertTrue(NumberInput.inLongRange(cbuf, 0, cbuf.length, true)); 
     cbuf = maxLong.toCharArray(); 
     assertTrue(NumberInput.inLongRange(cbuf, 0, cbuf.length, false)); 
     cbuf = VALUE_491.toCharArray(); 
     assertTrue(NumberInput.inLongRange(cbuf, 0, cbuf.length, true)); 
     assertTrue(NumberInput.inLongRange(cbuf, 0, cbuf.length, false)); 
     cbuf = OVERFLOW.toCharArray(); 
     assertFalse(NumberInput.inLongRange(cbuf, 0, cbuf.length, true)); 
     assertFalse(NumberInput.inLongRange(cbuf, 0, cbuf.length, false)); 
 } 

    

    
    
    

    // Unit test for [JACKSON-491]
    
    
}
