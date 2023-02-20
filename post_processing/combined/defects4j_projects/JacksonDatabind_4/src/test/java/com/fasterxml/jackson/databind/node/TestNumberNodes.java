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
public void testDouble31() { 
     DoubleNode n = DoubleNode.valueOf(0.25); 
     assertStandardEquals(n); 
     assertTrue(0 != n.hashCode()); 
     assertEquals(JsonToken.VALUE_NUMBER_FLOAT, n.asToken()); 
     assertEquals(JsonParser.NumberType.DOUBLE, n.numberType()); 
     assertEquals(0, n.intValue()); 
     assertEquals(0.25, n.doubleValue()); 
     assertEquals(0.25f, n.floatValue()); 
     assertNotNull(n.decimalValue()); 
     assertEquals(BigInteger.ZERO, n.bigIntegerValue()); 
     assertEquals("0.25", n.asText()); 
     assertNodeNumbers(FloatNode.valueOf(4.5f), 4, 4.5f); 
     assertTrue(FloatNode.valueOf(0).canConvertToInt()); 
     assertTrue(FloatNode.valueOf(Integer.MAX_VALUE).canConvertToInt()); 
     assertTrue(FloatNode.valueOf(Integer.MIN_VALUE).canConvertToInt()); 
     assertFalse(FloatNode.valueOf(1000L + Integer.MAX_VALUE).canConvertToInt()); 
     assertFalse(FloatNode.valueOf(-1000L + Integer.MIN_VALUE).canConvertToInt()); 
     assertTrue(FloatNode.valueOf(0L).canConvertToLong()); 
     assertTrue(FloatNode.valueOf(Integer.MAX_VALUE).canConvertToLong()); 
     assertTrue(FloatNode.valueOf(Integer.MIN_VALUE).canConvertToLong()); 
 }
public void testDouble34() { 
     DoubleNode n = DoubleNode.valueOf(0.25); 
     assertStandardEquals(n); 
     assertTrue(0 != n.hashCode()); 
     assertEquals(JsonToken.VALUE_NUMBER_FLOAT, n.asToken()); 
     assertEquals(JsonParser.NumberType.FLOAT, n.numberType()); 
     assertEquals(0, n.intValue()); 
     assertEquals(0.25, n.doubleValue()); 
     assertEquals(0.25f, n.floatValue()); 
     assertNotNull(n.decimalValue()); 
     assertEquals(BigInteger.ZERO, n.bigIntegerValue()); 
     assertEquals("0.25", n.asText()); 
     assertNodeNumbers(FloatNode.valueOf(4.5f), 4, 4.5f); 
     assertTrue(FloatNode.valueOf(0).canConvertToInt()); 
     assertTrue(FloatNode.valueOf(Integer.MAX_VALUE).canConvertToInt()); 
     assertTrue(FloatNode.valueOf(Integer.MIN_VALUE).canConvertToInt()); 
     assertFalse(FloatNode.valueOf(1000L + Integer.MAX_VALUE).canConvertToInt()); 
     assertFalse(FloatNode.valueOf(-1000L + Integer.MIN_VALUE).canConvertToInt()); 
     assertTrue(FloatNode.valueOf(0L).canConvertToLong()); 
     assertTrue(FloatNode.valueOf(Integer.MAX_VALUE).canConvertToLong()); 
     assertTrue(FloatNode.valueOf(Integer.MIN_VALUE).canConvertToLong()); 
 }
public void testDouble35() { 
     DoubleNode n = DoubleNode.valueOf(0.25); 
     assertStandardEquals(n); 
     assertTrue(0 != n.hashCode()); 
     assertEquals(JsonToken.VALUE_NUMBER_FLOAT, n.asToken()); 
     assertEquals(JsonParser.NumberType.FLOAT, n.numberType()); 
     assertEquals(0, n.intValue()); 
     assertEquals(0.25, n.doubleValue()); 
     assertEquals(0.25f, n.floatValue()); 
     assertNotNull(n.decimalValue()); 
     assertEquals(BigInteger.ZERO, n.bigIntegerValue()); 
     assertEquals("0.25", n.asText()); 
     assertNodeNumbers(FloatNode.valueOf(4.5f), 4, 4.5f); 
     assertTrue(DoubleNode.valueOf(0).canConvertToInt()); 
     assertTrue(DoubleNode.valueOf(Integer.MAX_VALUE).canConvertToInt()); 
     assertTrue(DoubleNode.valueOf(Integer.MIN_VALUE).canConvertToInt()); 
     assertFalse(DoubleNode.valueOf(1000L + Integer.MAX_VALUE).canConvertToInt()); 
     assertFalse(DoubleNode.valueOf(-1000L + Integer.MIN_VALUE).canConvertToInt()); 
     assertTrue(DoubleNode.valueOf(0L).canConvertToLong()); 
     assertTrue(DoubleNode.valueOf(Integer.MAX_VALUE).canConvertToLong()); 
     assertTrue(DoubleNode.valueOf(Integer.MIN_VALUE).canConvertToLong()); 
 }
    
    
	

    

    

    // @since 2.2
    
    
    

    

}
