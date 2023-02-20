package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

/**
 * @since 1.6
 */
public class TestValueConversions
    extends com.fasterxml.jackson.test.BaseTest
{

public void testAsInt21() throws Exception { 
     final String input = "[ 1, -3, 4.98, true, false, null, \"-17\", \"foo\" ]"; 
     for (int i = 0; i < 2; ++i) { 
         JsonParser jp; 
         if (i == 0) { 
             jp = createParserUsingReader(input); 
         } else { 
             jp = this.createParserUsingStream(input, "UTF-8"); 
         } 
         assertToken(JsonToken.START_ARRAY, jp.nextToken()); 
         assertEquals(0, jp.getValueAsLong()); 
         assertEquals(9, jp.getValueAsLong(9)); 
         assertToken(JsonToken.VALUE_NUMBER_INT, jp.nextToken()); 
         assertEquals(1, jp.getValueAsLong()); 
         assertEquals(1, jp.getValueAsLong(-99)); 
         assertToken(JsonToken.VALUE_NUMBER_INT, jp.nextToken()); 
         assertEquals(-3, jp.getValueAsLong()); 
         assertToken(JsonToken.VALUE_NUMBER_FLOAT, jp.nextToken()); 
         assertEquals(4, jp.getValueAsLong()); 
         assertEquals(4, jp.getValueAsLong(99)); 
         assertToken(JsonToken.VALUE_TRUE, jp.nextToken()); 
         assertEquals(1, jp.getValueAsLong()); 
         assertToken(JsonToken.VALUE_FALSE, jp.nextToken()); 
         assertEquals(0, jp.getValueAsLong()); 
         assertToken(JsonToken.VALUE_NULL, jp.nextToken()); 
         assertEquals(0, jp.getValueAsLong()); 
         assertEquals(0, jp.getValueAsLong(27)); 
         assertToken(JsonToken.VALUE_STRING, jp.nextToken()); 
         assertEquals(-17, jp.getValueAsLong()); 
         assertEquals(-17, jp.getValueAsLong(3)); 
         assertToken(JsonToken.VALUE_STRING, jp.nextToken()); 
         assertEquals(0, jp.getValueAsLong()); 
         assertEquals(9, jp.getValueAsLong(9)); 
         assertToken(JsonToken.END_ARRAY, jp.nextToken()); 
         assertEquals(0, jp.getValueAsLong()); 
         assertEquals(9, jp.getValueAsLong(9)); 
         jp.close(); 
     } 
 } 


public void testAsDouble23() throws Exception { 
     final String input = "[ 1, -3, 4.98, true, false, null, \"-17.25\", \"foo\" ]"; 
     for (int i = 0; i < 2; ++i) { 
         JsonParser jp; 
         if (i == 0) { 
             jp = createParserUsingReader(input); 
         } else { 
             jp = this.createParserUsingStream(input, "UTF-8"); 
         } 
         assertToken(JsonToken.START_ARRAY, jp.nextToken()); 
         assertEquals(0.0, jp.getValueAsDouble()); 
         assertEquals(9.0, jp.getValueAsDouble(9.0)); 
         assertToken(JsonToken.VALUE_NUMBER_INT, jp.nextToken()); 
         assertEquals(1., jp.getValueAsDouble()); 
         assertEquals(1., jp.getValueAsDouble(-99.0)); 
         assertToken(JsonToken.VALUE_NUMBER_INT, jp.nextToken()); 
         assertEquals(-3., jp.getValueAsDouble()); 
         assertToken(JsonToken.VALUE_NUMBER_FLOAT, jp.nextToken()); 
         assertEquals(4.98, jp.getValueAsDouble()); 
         assertEquals(4.98, jp.getValueAsDouble(12.5)); 
         assertToken(JsonToken.VALUE_TRUE, jp.nextToken()); 
         assertEquals(1.0, jp.getValueAsDouble()); 
         assertToken(JsonToken.VALUE_FALSE, jp.nextToken()); 
         assertEquals(0.0, jp.getValueAsDouble()); 
         assertToken(JsonToken.VALUE_NULL, jp.nextToken()); 
         assertEquals(0.0, jp.getValueAsDouble()); 
         assertEquals(0.0, jp.getValueAsDouble(27.8)); 
         assertToken(JsonToken.VALUE_STRING, jp.nextToken()); 
         assertEquals(-17.25, jp.getValueAsDouble()); 
         assertEquals(-17.25, jp.getValueAsDouble(1.9)); 
         assertToken(JsonToken.VALUE_STRING, jp.nextToken()); 
         assertEquals(0.0, jp.getValueAsDouble()); 
         assertEquals(1.25, jp.getValueAsDouble(1.25)); 
         assertToken(JsonToken.END_ARRAY, jp.nextToken()); 
         assertEquals(0.0, jp.getValueAsDouble()); 
         assertEquals(7.5, jp.getValueAsDouble(7.5)); 
         jp.close(); 
     } 
 } 


public void testAsBoolean57() throws Exception { 
     final String input = "[ true, false, null, 1, 0, \"true\", \"false\", \"foo\" ]"; 
     for (int i = 0; i < 2; ++i) { 
         JsonParser jp; 
         if (i == 0) { 
             jp = createParserUsingReader(input); 
         } else { 
             jp = this.createParserUsingStream(input, "UTF-8"); 
         } 
         assertToken(JsonToken.START_ARRAY, jp.nextToken()); 
         assertEquals(false, jp.getValueAsBoolean()); 
         assertEquals(true, jp.getValueAsBoolean(true)); 
         assertToken(JsonToken.VALUE_TRUE, jp.nextToken()); 
         assertEquals(true, jp.getValueAsBoolean()); 
         assertToken(JsonToken.VALUE_FALSE, jp.nextToken()); 
         assertEquals(false, jp.getValueAsBoolean()); 
         assertToken(JsonToken.VALUE_NULL, jp.nextToken()); 
         assertEquals(false, jp.getValueAsBoolean()); 
         assertToken(JsonToken.VALUE_NUMBER_INT, jp.nextToken()); 
         assertEquals(1, jp.getIntValue()); 
         assertEquals(true, jp.getValueAsBoolean()); 
         assertToken(JsonToken.VALUE_NUMBER_INT, jp.nextToken()); 
         assertEquals(0, jp.getIntValue()); 
         assertEquals(false, jp.getValueAsBoolean()); 
         assertToken(JsonToken.VALUE_STRING, jp.nextToken()); 
         assertEquals(true, jp.getValueAsBoolean()); 
         assertToken(JsonToken.VALUE_STRING, jp.nextToken()); 
         assertEquals(false, jp.getValueAsBoolean()); 
         assertToken(JsonToken.VALUE_STRING, jp.nextToken()); 
         assertEquals(false, jp.getValueAsBoolean()); 
         assertToken(JsonToken.END_ARRAY, jp.nextToken()); 
         assertEquals(false, jp.getValueAsBoolean()); 
         assertEquals(true, jp.getValueAsBoolean(true)); 
         jp.close(); 
     } 
 } 

    

    /**
     * @since 1.7
     */
    
    
    

    
    
}
