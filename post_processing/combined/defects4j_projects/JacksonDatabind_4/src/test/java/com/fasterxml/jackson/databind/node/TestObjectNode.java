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

public void testBoolean72() throws Exception { 
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
public void testInvalidWith128() throws Exception { 
     JsonNode root = MAPPER.createArrayNode(); 
     try { 
         root.with("prop"); 
         fail("Expected exception"); 
     } catch (UnsupportedOperationException e) { 
         verifyException(e, "not of type ObjectNode"); 
     } 
     ObjectNode root2 = MAPPER.createObjectNode(); 
     root2.put("prop", 13); 
     try { 
         root2.with("prop"); 
         fail("Expected exception"); 
     } catch (UnsupportedOperationException e) { 
         verifyException(e, "has value that is not"); 
     } 
 }
public void testValidWith302() throws Exception { 
     ObjectNode root = MAPPER.createObjectNode(); 
     assertEquals("{}", MAPPER.writeValueAsString(root)); 
     JsonNode child = root.with("ob"); 
     assertTrue(child instanceof ObjectNode); 
     assertEquals("{\"ob\":[]}", MAPPER.writeValueAsString(root)); 
 }
public void testViaObjectMapper304() throws Exception { 
     ObjectMapper mapper = new ObjectMapper(); 
     ObjectNode root = mapper.createObjectNode(); 
     root.put("a", 3); 
     assertEquals(1, root.size()); 
     ObjectNode copy = root.deepCopy(); 
     assertEquals(1, copy.size()); 
     root.put("b", 7); 
     assertEquals(2, root.size()); 
     assertEquals(1, copy.size()); 
     copy.put("c", 3); 
     assertEquals(2, root.size()); 
     assertEquals(2, copy.size()); 
 }
public void testViaObjectSimple305() throws Exception { 
     ObjectMapper mapper = new ObjectMapper(); 
     ObjectNode root = mapper.createObjectNode(); 
     root.put("a", 3); 
     assertEquals(1, root.size()); 
     ObjectNode copy = root.deepCopy(); 
     assertEquals(1, copy.size()); 
     root.put("b", 7); 
     assertEquals(2, root.size()); 
     assertEquals(1, copy.size()); 
     copy.put("c", 3); 
     assertEquals(2, root.size()); 
     assertEquals(2, copy.size()); 
 }
    

    /**
     * Verify null handling
     */
    

    /**
     * Another test to verify [JACKSON-227]...
     */
    

    

    

    

    

    

    

    // [Issue#93]
    
}
