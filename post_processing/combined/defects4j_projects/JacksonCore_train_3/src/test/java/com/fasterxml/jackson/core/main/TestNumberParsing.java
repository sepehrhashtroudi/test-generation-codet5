package com.fasterxml.jackson.core.main;

import com.fasterxml.jackson.core.io.NumberInput;

/**
 * Set of basic unit tests for verifying that the low-level number
 * handling methods work as expected.
 */
public class TestNumberParsing
    extends com.fasterxml.jackson.test.BaseTest
{

public void testIntParsingWithStrings45() throws Exception { 
     assertEquals(3, NumberInput.parseInt("3")); 
     assertEquals(0, NumberInput.parseInt("0")); 
     assertEquals(-3, NumberInput.parseInt("-3")); 
     assertEquals(27, NumberInput.parseInt("27")); 
     assertEquals(-31, NumberInput.parseInt("-31")); 
     assertEquals(271, NumberInput.parseInt("271")); 
     assertEquals(-131, NumberInput.parseInt("-131")); 
     assertEquals(2709, NumberInput.parseInt("2709")); 
     assertEquals(-9999, NumberInput.parseInt("-9999")); 
     assertEquals(Integer.MIN_VALUE, NumberInput.parseInt("" + Integer.MIN_VALUE)); 
     assertEquals(Integer.MAX_VALUE, NumberInput.parseInt("" + Integer.MAX_VALUE)); 
 } 


public void testLongBoundsChecks46() throws Exception { 
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
