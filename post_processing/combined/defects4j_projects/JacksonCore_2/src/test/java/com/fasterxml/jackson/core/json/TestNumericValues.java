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
public void testBigNumbers5() throws Exception { 
     StringBuilder sb = new StringBuilder(); 
     for (int i = 0; i < 520; ++i) { 
         sb.append('1'); 
     } 
     final String NUMBER_STR = sb.toString(); 
     BigInteger biggie = new BigInteger(NUMBER_STR); 
     for (int i = 0; i < 2; ++i) { 
         JsonParser jp; 
         if (i == 0) { 
             jp = createParserUsingReader(NUMBER_STR); 
         } else { 
             jp = this.createParserUsingStream(NUMBER_STR, "UTF-8"); 
         } 
         assertToken(JsonToken.VALUE_NUMBER_INT, jp.nextToken()); 
         assertEquals(JsonParser.NumberType.BIG_INTEGER, jp.getNumberType()); 
         assertEquals(NUMBER_STR, jp.getText()); 
         assertEquals(biggie, jp.getBigIntegerValue()); 
         jp.close(); 
     } 
 }
public void testNumbers9() throws Exception { 
     final String DOC = "[ -13, 8100200300, 13.5, 0.00010, -2.033 ]"; 
     for (int input = 0; input < 2; ++input) { 
         JsonParser jp; 
         if (input == 0) { 
             jp = createParserUsingStream(DOC, "UTF-8"); 
         } else { 
             jp = createParserUsingReader(DOC); 
         } 
         assertToken(JsonToken.START_ARRAY, jp.nextToken()); 
         assertToken(JsonToken.VALUE_NUMBER_INT, jp.nextToken()); 
         assertEquals(-13, jp.getIntValue()); 
         assertEquals(-13L, jp.getLongValue()); 
         assertEquals(-13., jp.getDoubleValue()); 
         assertEquals("-13", jp.getText()); 
         assertToken(JsonToken.VALUE_NUMBER_INT, jp.nextToken()); 
         assertEquals(13, jp.getIntValue()); 
         assertEquals(13L, jp.getLongValue()); 
         try { 
             jp.getIntValue(); 
             fail("Expected an exception for overflow"); 
         } catch (Exception e) { 
             verifyException(e, "out of range of int"); 
         } 
         jp.close(); 
     } 
 }
public void testSimpleDouble22() throws Exception { 
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
