package com.fasterxml.jackson.core.json;

import java.math.BigDecimal;
import java.math.BigInteger;

import com.fasterxml.jackson.core.*;

/**
 * Set of basic unit tests for verifying that the basic parser
 * functionality works as expected.
 */
public class TestNumericValues
    extends com.fasterxml.jackson.test.BaseTest
{
public void testSimpleDouble8() throws Exception { 
     final String[] INPUTS = new String[] { "1234.00", "2.1101567E-16", "1.0e5", "2.5e+5", "9e4", "-12e-3", "0.25" }; 
     for (int input = 0; input < 2; ++input) { 
         for (int i = 0; i < INPUTS.length; ++i) { 
             String STR = INPUTS[i]; 
             double EXP_D = Double.parseDouble(STR); 
             String DOC = "[" + STR + "]"; 
             JsonParser jp; 
             if (input == 0) { 
                 jp = createParserUsingStream(DOC, "UTF-8"); 
             } else { 
                 jp = createParserUsingReader(DOC); 
             } 
             assertToken(JsonToken.START_ARRAY, jp.nextToken()); 
             assertToken(JsonToken.VALUE_NUMBER_FLOAT, jp.nextToken()); 
             assertEquals(STR, jp.getText()); 
             assertEquals(EXP_D, jp.getDoubleValue()); 
             assertToken(JsonToken.END_ARRAY, jp.nextToken()); 
             jp.close(); 
         } 
     } 
 }
public void testInvalidIntAccess14() throws Exception { 
     JsonParser jp = createParserUsingReader("[ \"abc\" ]"); 
     assertToken(JsonToken.START_ARRAY, jp.nextToken()); 
     assertToken(JsonToken.VALUE_STRING, jp.nextToken()); 
     try { 
         jp.getIntValue(); 
         fail("Expected error trying to call getIntValue on non-numeric value"); 
     } catch (JsonParseException e) { 
         verifyException(e, "can not use numeric value accessors"); 
     } 
     jp.close(); 
 }
public void testSimpleLong16() throws Exception { 
     long EXP_L = 12345678907L; 
     JsonParser jp = createParserUsingReader("[ " + EXP_L + " ]"); 
     assertToken(JsonToken.START_ARRAY, jp.nextToken()); 
     assertToken(JsonToken.VALUE_NUMBER_INT, jp.nextToken()); 
     assertEquals(JsonParser.NumberType.LONG, jp.getNumberType()); 
     assertEquals("" + EXP_L, jp.getText()); 
     assertEquals(EXP_L, jp.getLongValue()); 
     try { 
         jp.getIntValue(); 
     } catch (JsonParseException jpe) { 
         verifyException(jpe, "out of range"); 
     } 
     assertEquals((double) EXP_L, jp.getDoubleValue()); 
     assertEquals(BigDecimal.valueOf((long) EXP_L), jp.getDecimalValue()); 
     jp.close(); 
 }
public void testLongOverflow20() throws Exception { 
     BigInteger below = BigInteger.valueOf(Long.MIN_VALUE); 
     below = below.subtract(BigInteger.ONE); 
     BigInteger above = BigInteger.valueOf(Long.MAX_VALUE); 
     above = above.add(BigInteger.ONE); 
     above = above.add(BigInteger.ONE); 
     above = above.add(BigInteger.ONE); 
     above = above.add(BigInteger.ONE); 
     above = above.add(BigInteger.ONE); 
     above = above.add(BigInteger.ONE); 
     above = above.add(BigInteger.ONE); 
     above = above.add(BigInteger.ONE); 
     above = above.add(BigInteger.ONE); 
     above = above.add(BigInteger.ONE); 
     above = above.add(BigInteger.ONE); 
     above = above.add(BigInteger.ONE); 
     above = above.add(BigInteger.ONE); 
     above = above.add(BigInteger.ONE); 
     above = above.add(BigInteger.ONE); 
     above = above.add(BigInteger.ONE); 
     above = above.add(BigInteger.ONE); 
     above = above.add(BigInteger.ONE); 
     above = above.add(BigInteger.ONE); 
     above = above.add(BigInteger.ONE); 
     above = above.add(BigInteger.ONE); 
     above = above.add(BigInteger.ONE); 
     above = above.add(BigInteger.ONE); 
     above = above.add(BigInteger.ONE); 
     above = above.add(BigInteger.ONE); 
     above = above.add(BigInteger.ONE); 
     above = above.add(BigInteger.ONE); 
     above = above.add(BigInteger.ONE); 
     above = above.add(BigInteger.ONE); 
     above = above.add(BigInteger.ONE); 
     above = above.add(BigInteger.ONE);
}

    

    

    

    

    

    

    // for [Issue#78]
    
    
    

    

    
    
    /**
     * Method that tries to test that number parsing works in cases where
     * input is split between buffer boundaries.
     */
    

    /*
    /**********************************************************
    /* Tests for invalid access
    /**********************************************************
     */
    
    

    
}
