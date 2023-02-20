package com.fasterxml.jackson.databind.node;

import java.io.*;
import java.util.*;


import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.TextNode;
import com.fasterxml.jackson.databind.node.TreeTraversingParser;

/**
 * Additional tests for {@link ArrayNode} container class.
 */
public class TestArrayNode
    extends BaseMapTest
{
public void testParser191() throws Exception { 
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
public void testArray212() throws Exception { 
     ObjectMapper mapper = new ObjectMapper(); 
     final String JSON = "[[[-0.027512,51.503221],[-0.008497,51.503221],[-0.008497,51.509744],[-0.027512,51.509744]]]"; 
     JsonNode n = mapper.readTree(JSON); 
     assertNotNull(n); 
     assertTrue(n.isArray()); 
     ArrayNode an = (ArrayNode) n; 
     assertEquals(1, an.size()); 
     ArrayNode an2 = (ArrayNode) n.get(0); 
     assertTrue(an2.isArray()); 
     assertEquals(4, an2.size()); 
 }
    

    

    /**
     * Test to verify [JACKSON-227]
     */
    

    /**
     * Another test to verify [JACKSON-227]...
     */
    
    
    
}
