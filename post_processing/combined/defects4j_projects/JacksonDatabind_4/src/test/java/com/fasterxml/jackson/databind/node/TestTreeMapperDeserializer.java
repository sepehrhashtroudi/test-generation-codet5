package com.fasterxml.jackson.databind.node;

import java.io.*;
import java.math.BigDecimal;
import java.util.*;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.test.BaseTest;

/**
 * This unit test suite tries to verify that ObjectMapper
 * can properly parse JSON and bind contents into appropriate
 * JsonNode instances.
 */
public class TestTreeMapperDeserializer
    extends BaseTest
{
public void testDouble33() throws Exception { 
     ObjectMapper mapper = new ObjectMapper(); 
     double value = 0.016; 
     JsonNode result = mapper.readTree(String.valueOf(value)); 
     assertTrue(result.isNumber()); 
     assertTrue(result.isIntegralNumber()); 
     assertTrue(result.isDouble()); 
     assertType(result, DoubleNode.class); 
     assertFalse(result.isInt()); 
     assertFalse(result.isFloatingPointNumber()); 
     assertFalse(result.isDouble()); 
     assertFalse(result.isNull()); 
     assertFalse(result.isTextual()); 
     assertFalse(result.isMissingNode()); 
     assertEquals(value, result.numberValue().doubleValue()); 
     assertEquals(value, result.doubleValue()); 
     assertEquals(String.valueOf(value), result.asText()); 
     assertEquals((double) value, result.doubleValue()); 
     assertEquals((long) value, result.longValue()); 
     assertEquals(result, DoubleNode.valueOf(value)); 
 }
public void testArray37() throws Exception { 
     ObjectMapper m = new ObjectMapper(); 
     JsonParser jp = m.readTree("[]").traverse(); 
     assertToken(JsonToken.START_ARRAY, jp.nextToken()); 
     assertToken(JsonToken.END_ARRAY, jp.nextToken()); 
     jp.close(); 
     jp = m.readTree("[[]]").traverse(); 
     assertToken(JsonToken.START_ARRAY, jp.nextToken()); 
     assertToken(JsonToken.START_ARRAY, jp.nextToken()); 
     assertToken(JsonToken.END_ARRAY, jp.nextToken()); 
     assertToken(JsonToken.END_ARRAY, jp.nextToken()); 
     jp.close(); 
     jp = m.readTree("[[ 12.1 ]]").traverse(); 
     assertToken(JsonToken.START_ARRAY, jp.nextToken()); 
     assertToken(JsonToken.START_ARRAY, jp.nextToken()); 
     assertToken(JsonToken.VALUE_NUMBER_FLOAT, jp.nextToken()); 
     assertToken(JsonToken.END_ARRAY, jp.nextToken()); 
     assertToken(JsonToken.END_ARRAY, jp.nextToken()); 
     jp.close(); 
 }
public void testNull85() throws Exception { 
     ObjectMapper mapper = new ObjectMapper(); 
     StringWriter sw = new StringWriter(); 
     mapper.writeValue(sw, NullNode.instance); 
     assertEquals("null", sw.toString()); 
 }
public void testReadingArrayAsTree127() throws IOException { 
     JsonFactory jf = new MappingJsonFactory(); 
     final String JSON = "[ 1, 2, false ]"; 
     for (int i = 0; i < 2; ++i) { 
         JsonParser jp = jf.createParser(new StringReader(JSON)); 
         if (i == 0) { 
             assertToken(JsonToken.START_ARRAY, jp.nextToken()); 
         } 
         JsonNode root = (JsonNode) jp.readValueAsTree(); 
         jp.close(); 
         assertTrue(root.isArray()); 
         assertEquals(3, root.size()); 
         assertEquals(1, root.get(0).intValue()); 
         assertEquals(2, root.get(1).intValue()); 
         assertFalse(root.get(2).booleanValue()); 
     } 
 }
	

    

    

    

    

    

    

    

    /**
     * Type mappers should be able to gracefully deal with end of
     * input.
     */
    

    

    /**
     * Let's also verify behavior of "MissingNode" -- one needs to be able
     * to traverse such bogus nodes with appropriate methods.
     */
    

    
    
    /*
    /**********************************************
    /* Helper methods
    /**********************************************
     */

    private int calcLength(Iterator<JsonNode> it)
    {
        int count = 0;
        while (it.hasNext()) {
            it.next();
            ++count;
        }
        return count;
    }
}

