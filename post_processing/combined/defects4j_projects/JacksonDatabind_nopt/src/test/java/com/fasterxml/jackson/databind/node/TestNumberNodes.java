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
public void testEquals1226() { BigIntegerNode a = new BigIntegerNode(new BigInteger("1")); BigIntegerNode b = new BigIntegerNode(new BigInteger("2")); BigIntegerNode c = new BigIntegerNode(new BigInteger("3")); BigIntegerNode d = new BigIntegerNode(new BigInteger("4")); BigIntegerNode e = new BigIntegerNode(new BigInteger("5")); BigIntegerNode f = new BigIntegerNode(new BigInteger("6")); BigIntegerNode g = new BigIntegerNode(new BigInteger("7")); BigIntegerNode h = new BigIntegerNode(new BigInteger("8")); BigIntegerNode j = new BigIntegerNode(new BigInteger("9")); BigIntegerNode k = new BigIntegerNode(new BigInteger("10"));
}

public void testValueOf1389() { ShortNode n = ShortNode.valueOf((short) 0); assertEquals(0, n.shortValue()); assertEquals(0, n.intValue()); assertEquals(0, n.longValue()); assertEquals(0.0, n.floatValue(), 0.0); assertEquals(0.0, n.doubleValue(), 0.0); }
public void testAsToken1390() { assertEquals(JsonToken.VALUE_NUMBER_INT, new ShortNode((short) 0).asToken()); assertEquals(JsonToken.VALUE_NUMBER_INT, new ShortNode((short) 1).asToken()); assertEquals(JsonToken.VALUE_NUMBER_INT, new ShortNode((short) 2).asToken()); assertEquals(JsonToken.VALUE_NUMBER_INT, new ShortNode((short) 3).asToken()); assertEquals(JsonToken.VALUE_NUMBER_INT, new ShortNode((short) 4).asToken()); assertEquals(JsonToken.VALUE_NUMBER_INT, new ShortNode((short) 5).asToken()); }
    
    
	

    

    

    // @since 2.2
    
    
    

    

}
