package com.fasterxml.jackson.databind.node;

import java.math.BigDecimal;
import java.util.*;

import com.fasterxml.jackson.databind.*;

/**
 * Additional tests for {@link ObjectNode} container class.
 */
public class TestObjectNode
    extends BaseMapTest
{
    private final ObjectMapper MAPPER = new ObjectMapper();

public void testSetAll26() throws Exception { 
     ObjectNode root = MAPPER.createObjectNode(); 
     assertEquals(0, root.size()); 
     HashMap<String, JsonNode> map = new HashMap<String, JsonNode>(); 
     map.put("a", root.numberNode(1)); 
     root.setAll(map); 
     assertEquals(1, root.size()); 
     assertTrue(root.has("a")); 
     assertFalse(root.has("b")); 
     map.put("b", root.numberNode(2)); 
     root.setAll(map); 
     assertEquals(2, root.size()); 
     assertTrue(root.has("a")); 
     assertTrue(root.has("b")); 
     assertEquals(2, root.path("b").intValue()); 
     ObjectNode root2 = MAPPER.createObjectNode(); 
     root2.setAll(root); 
     assertEquals(2, root.size()); 
     assertEquals(2, root2.size()); 
     root2.setAll(root); 
     assertEquals(2, root.size()); 
     assertEquals(2, root2.size()); 
     ObjectNode root3 = MAPPER.createObjectNode(); 
     root3.put("a", 2); 
     root3.put("c", 3); 
     assertEquals(2, root3.path("a").intValue()); 
     root3.setAll(root2); 
     assertEquals(3, root3.size()); 
     assertEquals(1, root3.path("a").intValue()); 
 }
public void testValidWith251() throws Exception { 
     ObjectNode root = MAPPER.createObjectNode(); 
     assertEquals("{}", MAPPER.writeValueAsString(root)); 
     JsonNode child = root.with("prop"); 
     assertTrue(child instanceof ObjectNode); 
     assertEquals("{\"prop\":{}}", MAPPER.writeValueAsString(root)); 
 }
    

    /**
     * Verify null handling
     */
    

    /**
     * Another test to verify [JACKSON-227]...
     */
    

    

    

    

    

    

    

    // [Issue#93]
    
}
