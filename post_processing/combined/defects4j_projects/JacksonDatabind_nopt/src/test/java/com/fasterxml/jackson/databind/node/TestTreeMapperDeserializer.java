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
public void testToString533() { TextNode str1 = null; TextNode str2 = null; TextNode str3 = null; TextNode str4 = null; TextNode str5 = null; TextNode str6 = null; TextNode str7 = null; TextNode str8 = null; TextNode str9 = null; TextNode str10 = null; TextNode str11 = null; TextNode str12 = null; TextNode str13 = null; TextNode str14 = null; TextNode str15 = null; TextNode str16 = null; TextNode str17 = null; TextNode str18 = null; TextNode str19 = null; TextNode str20 = null;
}

public void testGetNodeType535() { TextNode nodeType = new TextNode("foo"); assertEquals(JsonNodeType.STRING, nodeType.getNodeType()); }
public void testGetTrue694() { assertEquals(BooleanNode.TRUE, BooleanNode.getTrue()); }
public void testValueOf695() { BooleanNode n1=BooleanNode.valueOf(true); BooleanNode n2=BooleanNode.valueOf(false); BooleanNode n3=BooleanNode.valueOf(true); assertEquals(n1.booleanValue(), n2.booleanValue()); assertEquals(n1.booleanValue(), n3.booleanValue()); assertEquals(n1.asBoolean(), n2.asBoolean()); assertEquals(n1.asInt(), n3.asInt()); assertEquals(n1.asLong(), n3.asLong()); assertEquals(n1.asDouble(), n3.asDouble()); }
public void testGetNodeType1530() { assertEquals(JsonNodeType.OBJECT, new ObjectNode(JsonNodeFactory.instance).getNodeType()); }
public void testIntNode1568() { IntNode n = new IntNode(1); assertEquals(1, n.intValue()); assertEquals(1, n.shortValue()); assertEquals(1, n.intValue()); assertEquals(1, n.longValue()); assertEquals(1.0, n.floatValue(), 0.0); assertEquals(1.0, n.doubleValue(), 0.0); }
	

    

    

    

    

    

    

    

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

