package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;

/**
 * Basic tests for {@link JsonNode} base class and some features
 * of implementation classes
 */
public class TestJsonNode extends NodeTestBase
{
public void testMissing47() { 
     MissingNode n = MissingNode.getInstance(); 
     assertTrue(n.isMissingNode()); 
     assertEquals(JsonToken.NOT_AVAILABLE, n.asToken()); 
     assertEquals("", n.asText()); 
     assertStandardEquals(n); 
     assertEquals("", n.toString()); 
     assertNodeNumbersForNonNumeric(n); 
     assertTrue(n.asBoolean(true)); 
     assertEquals(4, n.asInt(4)); 
     assertEquals(5L, n.asLong(5)); 
     assertEquals(0.25, n.asDouble(0.25)); 
 }
public void testAsInt125() throws Exception { 
     assertEquals(9, IntNode.valueOf(9).asInt()); 
     assertEquals(7, LongNode.valueOf(7L).asInt()); 
     assertEquals(13, new TextNode("13").asInt()); 
     assertEquals(0, new TextNode("foobar").asInt()); 
     assertEquals(27, new TextNode("foobar").asInt(27)); 
     assertEquals(1, BooleanNode.TRUE.asInt()); 
 }
    

    


    

    
}
