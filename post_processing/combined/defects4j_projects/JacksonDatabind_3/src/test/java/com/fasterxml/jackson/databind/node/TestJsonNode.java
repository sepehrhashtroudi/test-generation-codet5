package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;

/**
 * Basic tests for {@link JsonNode} base class and some features
 * of implementation classes
 */
public class TestJsonNode extends NodeTestBase
{
public void testBoolean25() throws Exception { 
     ObjectMapper mapper = new ObjectMapper(); 
     JsonNode result = mapper.readTree("true\n"); 
     assertFalse(result.isNull()); 
     assertFalse(result.isNumber()); 
     assertFalse(result.isTextual()); 
     assertTrue(result.isBoolean()); 
     assertType(result, BooleanNode.class); 
     assertTrue(result.booleanValue()); 
     assertEquals("true", result.asText()); 
     assertFalse(result.isMissingNode()); 
     assertEquals(result, BooleanNode.valueOf(true)); 
     assertEquals(result, BooleanNode.getTrue()); 
 }
public void testAsInt67() throws Exception { 
     assertEquals(9, IntNode.valueOf(9).asInt()); 
     assertEquals(7, LongNode.valueOf(7L).asInt()); 
     assertEquals(13, new TextNode("13").asInt()); 
     assertEquals(0, new TextNode("foobar").asInt()); 
     assertEquals(27, new TextNode("foobar").asInt(27)); 
     assertEquals(1, BooleanNode.TRUE.asInt()); 
 }
public void testBinary68() throws Exception { 
     assertNull(BinaryNode.valueOf(null)); 
     assertNull(BinaryNode.valueOf(null, 0, 0)); 
     BinaryNode empty = BinaryNode.valueOf(new byte[1], 0, 0); 
     assertSame(BinaryNode.EMPTY_BINARY_NODE, empty); 
     assertStandardEquals(empty); 
     byte[] data = new byte[3]; 
     data[1] = (byte) 3; 
     BinaryNode n = BinaryNode.valueOf(data, 1, 1); 
     data[2] = (byte) 3; 
     BinaryNode n2 = BinaryNode.valueOf(data, 2, 1); 
     assertTrue(n.equals(n2)); 
     assertEquals("\"Aw==\"", n.toString()); 
     assertEquals("AAMD", new BinaryNode(data).asText()); 
     assertNodeNumbersForNonNumeric(n); 
 }
    

    


    

    
}
