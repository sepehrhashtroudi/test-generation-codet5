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
public void testLong130() throws Exception { 
     ObjectMapper mapper = new ObjectMapper(); 
     long value = 12345678L << 32; 
     JsonNode result = mapper.readTree(String.valueOf(value)); 
     assertTrue(result.isNumber()); 
     assertTrue(result.isIntegralNumber()); 
     assertTrue(result.isLong()); 
     assertType(result, LongNode.class); 
     assertFalse(result.isInt()); 
     assertFalse(result.isFloatingPointNumber()); 
     assertFalse(result.isDouble()); 
     assertFalse(result.isNull()); 
     assertFalse(result.isTextual()); 
     assertFalse(result.isMissingNode()); 
     assertEquals(value, result.numberValue().longValue()); 
     assertEquals(value, result.longValue()); 
     assertEquals(String.valueOf(value), result.asText()); 
     assertEquals((double) value, result.doubleValue()); 
     assertEquals(result, LongNode.valueOf(value)); 
 }
public void testDouble131() throws Exception { 
     ObjectMapper mapper = new ObjectMapper(); 
     double value = 3.04; 
     JsonNode result = mapper.readTree(String.valueOf(value)); 
     assertTrue(result.isNumber()); 
     assertFalse(result.isNull()); 
     assertType(result, DoubleNode.class); 
     assertTrue(result.isFloatingPointNumber()); 
     assertTrue(result.isDouble()); 
     assertFalse(result.isInt()); 
     assertFalse(result.isLong()); 
     assertFalse(result.isIntegralNumber()); 
     assertFalse(result.isTextual()); 
     assertFalse(result.isMissingNode()); 
     assertEquals(value, result.doubleValue()); 
     assertEquals(value, result.numberValue().doubleValue()); 
     assertEquals((int) value, result.intValue()); 
     assertEquals((long) value, result.longValue()); 
     assertEquals(String.valueOf(value), result.asText()); 
     assertEquals(result, DoubleNode.valueOf(value)); 
 }
public void testFloat258() { 
     FloatNode n = FloatNode.valueOf(1.01f); 
     assertStandardEquals(n); 
     assertTrue(0 != n.hashCode()); 
     assertEquals(JsonToken.VALUE_NUMBER_FLOAT, n.asToken()); 
     assertEquals(JsonParser.NumberType.FLOAT, n.numberType()); 
     assertEquals(1, n.intValue()); 
     assertEquals(1L, n.longValue()); 
     assertEquals(BigDecimal.ONE, n.decimalValue()); 
     assertEquals(BigInteger.ONE, n.bigIntegerValue()); 
     assertEquals("1.01", n.asText()); 
     assertNodeNumbers(n, 1, 1.0); 
     assertTrue(FloatNode.valueOf(0).canConvertToInt()); 
     assertTrue(FloatNode.valueOf(Integer.MAX_VALUE).canConvertToInt()); 
     assertTrue(FloatNode.valueOf(Integer.MIN_VALUE).canConvertToInt()); 
     assertFalse(FloatNode.valueOf(1L + Integer.MAX_VALUE).canConvertToInt()); 
     assertFalse(FloatNode.valueOf(-1L + Integer.MIN_VALUE).canConvertToInt()); 
     assertTrue(FloatNode.valueOf(0L).canConvertToLong()); 
     assertTrue(FloatNode.valueOf(Long.MAX_VALUE).canConvertToLong()); 
     assertTrue(FloatNode.valueOf(Long.MIN_VALUE).canConvertToLong()); 
 }
    
    
	

    

    

    // @since 2.2
    
    
    

    

}
