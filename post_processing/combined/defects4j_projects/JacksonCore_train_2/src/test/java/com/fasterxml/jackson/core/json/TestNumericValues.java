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

public void testBigNumbers2() throws Exception { 
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


public void testInvalidIntAccess12() throws Exception { 
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


public void testSimpleInt24() throws Exception { 
     int EXP_I = 1234; 
     JsonParser jp = createParserUsingReader("[ " + EXP_I + " ]"); 
     assertToken(JsonToken.START_ARRAY, jp.nextToken()); 
     assertToken(JsonToken.VALUE_NUMBER_INT, jp.nextToken()); 
     assertEquals(JsonParser.NumberType.INT, jp.getNumberType()); 
     assertEquals("" + EXP_I, jp.getText()); 
     assertEquals(EXP_I, jp.getIntValue()); 
     assertEquals((long) EXP_I, jp.getLongValue()); 
     assertEquals((double) EXP_I, jp.getDoubleValue()); 
     assertEquals(BigDecimal.valueOf((long) EXP_I), jp.getDecimalValue()); 
     jp.close(); 
 } 


public void testIntRange25() throws Exception { 
     for (int i = 0; i < 2; ++i) { 
         String input = "[ " + Integer.MAX_VALUE + "," + Integer.MIN_VALUE + " ]"; 
         JsonParser jp; 
         if (i == 0) { 
             jp = createParserUsingReader(input); 
         } else { 
             jp = this.createParserUsingStream(input, "UTF-8"); 
         } 
         assertToken(JsonToken.START_ARRAY, jp.nextToken()); 
         assertToken(JsonToken.VALUE_NUMBER_INT, jp.nextToken()); 
         assertEquals(JsonParser.NumberType.INT, jp.getNumberType()); 
         assertEquals(Integer.MAX_VALUE, jp.getIntValue()); 
         assertToken(JsonToken.VALUE_NUMBER_INT, jp.nextToken()); 
         assertEquals(JsonParser.NumberType.INT, jp.getNumberType()); 
         assertEquals(Integer.MIN_VALUE, jp.getIntValue()); 
         jp.close(); 
     } 
 } 


public void testNumbers26() throws Exception { 
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
         assertEquals(8100200300L, jp.getLongValue()); 
         try { 
             jp.getIntValue(); 
             fail("Expected an exception for overflow"); 
         } catch (Exception e) { 
             verifyException(e, "out of range of int"); 
         } 
         assertEquals(8100200300., jp.getDoubleValue()); 
         assertEquals("8100200300", jp.getText()); 
         assertToken(JsonToken.VALUE_NUMBER_FLOAT, jp.nextToken()); 
         assertEquals(13, jp.getIntValue()); 
         assertEquals(13L, jp.getLongValue()); 
         assertEquals(13.5, jp.getDoubleValue()); 
         assertEquals("13.5", jp.getText()); 
         assertToken(JsonToken.VALUE_NUMBER_FLOAT, jp.nextToken()); 
         assertEquals(0, jp.getIntValue()); 
         assertEquals(0L, jp.getLongValue()); 
         assertEquals(0.00010, jp.getDoubleValue()); 
         assertEquals("0.00010", jp.getText()); 
         assertToken(JsonToken.VALUE_NUMBER_FLOAT, jp.nextToken()); 
         assertEquals(-2, jp.getIntValue()); 
         assertEquals(-2L, jp.getLongValue()); 
         assertEquals(-2.033, jp.getDoubleValue()); 
         assertEquals("-2.033", jp.getText()); 
         assertToken(JsonToken.END_ARRAY, jp.nextToken()); 
         jp.close(); 
     } 
 } 


@SuppressWarnings("resource") 
 public void testLongOverflow27() throws Exception { 
     BigInteger below = BigInteger.valueOf(Long.MIN_VALUE); 
     below = below.subtract(BigInteger.ONE); 
     BigInteger above = BigInteger.valueOf(Long.MAX_VALUE); 
     above = above.add(BigInteger.ONE); 
     String DOC_BELOW = below.toString() + " "; 
     String DOC_ABOVE = below.toString() + " "; 
     for (int input = 0; input < 2; ++input) { 
         JsonParser jp; 
         if (input == 0) { 
             jp = createParserUsingStream(DOC_BELOW, "UTF-8"); 
         } else { 
             jp = createParserUsingReader(DOC_BELOW); 
         } 
         jp.nextToken(); 
         try { 
             long x = jp.getLongValue(); 
             fail("Expected an exception for underflow (input " + jp.getText() + "): instead, got long value: " + x); 
         } catch (JsonParseException e) { 
             verifyException(e, "out of range of long"); 
         } 
         jp.close(); 
         if (input == 0) { 
             jp = createParserUsingStream(DOC_ABOVE, "UTF-8"); 
         } else { 
             jp = createParserUsingReader(DOC_ABOVE); 
         } 
         jp.nextToken(); 
         try { 
             long x = jp.getLongValue(); 
             fail("Expected an exception for underflow (input " + jp.getText() + "): instead, got long value: " + x); 
         } catch (JsonParseException e) { 
             verifyException(e, "out of range of long"); 
         } 
         jp.close(); 
     } 
 } 


public void testSimpleDouble49() throws Exception { 
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


public void testInvalidBooleanAccess85() throws Exception { 
     JsonParser jp = createParserUsingReader("[ \"abc\" ]"); 
     assertToken(JsonToken.START_ARRAY, jp.nextToken()); 
     assertToken(JsonToken.VALUE_STRING, jp.nextToken()); 
     try { 
         jp.getBooleanValue(); 
         fail("Expected error trying to call getBooleanValue on non-boolean value"); 
     } catch (JsonParseException e) { 
         verifyException(e, "not of boolean type"); 
     } 
     jp.close(); 
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
