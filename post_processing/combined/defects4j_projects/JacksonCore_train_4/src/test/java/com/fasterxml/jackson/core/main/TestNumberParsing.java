package com.fasterxml.jackson.core.main;

import com.fasterxml.jackson.core.io.NumberInput;

/**
 * Set of basic unit tests for verifying that the low-level number
 * handling methods work as expected.
 */
public class TestNumberParsing
    extends com.fasterxml.jackson.test.BaseTest
{

public void testIntParsingWithStrings48() throws Exception { 
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

    

    
    
    

    // Unit test for [JACKSON-491]
    
    
}
