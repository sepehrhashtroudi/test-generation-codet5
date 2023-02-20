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
public void testDecimalNode52() throws Exception { 
     BigDecimal value = new BigDecimal("0.1"); 
     JsonNode result = DecimalNode.valueOf(value); 
     assertFalse(result.isArray()); 
     assertFalse(result.isObject()); 
     assertTrue(result.isNumber()); 
     assertFalse(result.isIntegralNumber()); 
     assertFalse(result.isLong()); 
     assertType(result, DecimalNode.class); 
     assertFalse(result.isInt()); 
     assertTrue(result.isFloatingPointNumber()); 
     assertTrue(result.isBigDecimal()); 
     assertFalse(result.isDouble()); 
     assertFalse(result.isNull()); 
     assertFalse(result.isTextual()); 
     assertFalse(result.isMissingNode()); 
     assertEquals(value, result.numberValue()); 
     assertEquals(value.toString(), result.asText()); 
     assertEquals(result, DecimalNode.valueOf(value)); 
 }
public void testInt53() throws Exception { 
     ObjectMapper mapper = new ObjectMapper(); 
     int value = -90184; 
     JsonNode result = mapper.readTree(String.valueOf(value)); 
     assertTrue(result.isNumber()); 
     assertTrue(result.isIntegralNumber()); 
     assertTrue(result.isInt()); 
     assertType(result, IntNode.class); 
     assertFalse(result.isLong()); 
     assertFalse(result.isFloatingPointNumber()); 
     assertFalse(result.isDouble()); 
     assertFalse(result.isNull()); 
     assertFalse(result.isTextual()); 
     assertFalse(result.isMissingNode()); 
     assertEquals(value, result.numberValue().intValue()); 
     assertEquals(value, result.intValue()); 
     assertEquals(String.valueOf(value), result.asText()); 
     assertEquals((double) value, result.doubleValue()); 
     assertEquals((long) value, result.longValue()); 
     assertEquals(result, IntNode.valueOf(value)); 
 }
public void testArrayNodeEquality186() { 
     ArrayNode n1 = new ArrayNode(null); 
     ArrayNode n2 = new ArrayNode(null); 
     assertTrue(n1.equals(n2)); 
     assertTrue(n2.equals(n1)); 
     n1.add(TextNode.valueOf("Test")); 
     assertFalse(n1.equals(n2)); 
     assertFalse(n2.equals(n1)); 
     n2.add(TextNode.valueOf("Test")); 
     assertTrue(n1.equals(n2)); 
     assertTrue(n2.equals(n1)); 
 }
public void testParser235() throws Exception { 
     ArrayNode n = new ArrayNode(JsonNodeFactory.instance); 
     n.add(123); 
     TreeTraversingParser p = new TreeTraversingParser(n, null); 
     p.setCodec(null); 
     assertNull(p.getCodec()); 
     assertNotNull(p.getParsingContext()); 
     assertNotNull(p.getTokenLocation()); 
     assertNotNull(p.getCurrentLocation()); 
     assertNull(p.getEmbeddedObject()); 
     assertNull(p.currentNode()); 
     assertToken(JsonToken.START_ARRAY, p.nextToken()); 
     p.skipChildren(); 
     assertToken(JsonToken.END_ARRAY, p.getCurrentToken()); 
     p.close(); 
     p = new TreeTraversingParser(n, null); 
     p.nextToken(); 
     assertToken(JsonToken.VALUE_NUMBER_INT, p.nextToken()); 
     assertEquals(JsonParser.NumberType.INT, p.getNumberType()); 
     p.close(); 
 }
public void testObjectNodeEquality268() { 
     ObjectNode n1 = new ObjectNode(null); 
     ObjectNode n2 = new ObjectNode(null); 
     assertTrue(n1.equals(n2)); 
     assertTrue(n2.equals(n1)); 
     n1.set("x", TextNode.valueOf("Test")); 
     assertFalse(n1.equals(n2)); 
     assertFalse(n2.equals(n1)); 
     n2.set("x", TextNode.valueOf("Test")); 
     assertTrue(n1.equals(n2)); 
     assertTrue(n2.equals(n1)); 
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

