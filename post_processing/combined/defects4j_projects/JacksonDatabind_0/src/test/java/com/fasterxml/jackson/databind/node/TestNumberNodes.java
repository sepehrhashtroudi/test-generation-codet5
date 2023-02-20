package com.fasterxml.jackson.databind.node;

import java.math.BigDecimal;
import java.math.BigInteger;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Basic tests for {@link JsonNode} implementations that
 * contain numeric values.
 */
public class TestNumberNodes extends NodeTestBase
{
public void testAsInt250() throws Exception { 
     assertEquals(9, IntNode.valueOf(9).asInt()); 
     assertEquals(7, LongNode.valueOf(7L).asInt()); 
     assertEquals(13, new TextNode("13").asInt()); 
     assertEquals(0, new TextNode("foobar").asInt()); 
     assertEquals(27, new TextNode("foobar").asInt(27)); 
     assertEquals(1, BooleanNode.TRUE.asInt()); 
 }
public void testInt251() { 
     IntNode n = IntNode.valueOf(1); 
     assertStandardEquals(n); 
     assertTrue(0 != n.hashCode()); 
     assertEquals(JsonToken.VALUE_NUMBER_INT, n.asToken()); 
     assertEquals(JsonParser.NumberType.INT, n.numberType()); 
     assertEquals(1, n.intValue()); 
     assertEquals(1L, n.longValue()); 
     assertEquals(BigDecimal.ONE, n.decimalValue()); 
     assertEquals(BigInteger.ONE, n.bigIntegerValue()); 
     assertEquals("1", n.asText()); 
     assertNodeNumbers(n, 1, 1.0); 
     assertTrue(IntNode.valueOf(0).canConvertToInt()); 
     assertTrue(IntNode.valueOf(Integer.MAX_VALUE).canConvertToInt()); 
     assertTrue(IntNode.valueOf(Integer.MIN_VALUE).canConvertToInt()); 
     assertTrue(IntNode.valueOf(0).canConvertToLong()); 
     assertTrue(IntNode.valueOf(Integer.MAX_VALUE).canConvertToLong()); 
     assertTrue(IntNode.valueOf(Integer.MIN_VALUE).canConvertToLong()); 
 }
    
    
	

    

    

    // @since 2.2
    
    
    

    

}
