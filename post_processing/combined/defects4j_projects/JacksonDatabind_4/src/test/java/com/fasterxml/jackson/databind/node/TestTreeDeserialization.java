package com.fasterxml.jackson.databind.node;

import java.io.*;

import com.fasterxml.jackson.databind.*;

/**
 * This unit test suite tries to verify that JsonNode-based trees
 * can be deserialized as expected.
 */
public class TestTreeDeserialization
    extends BaseMapTest
{
    final static class Bean {
        int _x;
        JsonNode _node;

        public void setX(int x) { _x = x; }
        public void setNode(JsonNode n) { _node = n; }
    }

    /*
    /**********************************************************
    /* Unit tests
    /**********************************************************
     */

    /**
     * This test checks that is possible to mix "regular" Java objects
     * and JsonNode.
     */
public void testAdds230() { 
     ArrayNode n = new ArrayNode(JsonNodeFactory.instance); 
     assertNotNull(n.addArray()); 
     assertNotNull(n.addObject()); 
     n.addPOJO("foobar"); 
     n.add(1); 
     n.add(1L); 
     n.add(0.5); 
     n.add(0.5f); 
     assertEquals(7, n.size()); 
     assertNotNull(n.insertArray(0)); 
     assertNotNull(n.insertObject(0)); 
     n.insertPOJO(2, "xxx"); 
     assertEquals(10, n.size()); 
 }
public void testArray231() throws Exception { 
     ObjectMapper mapper = new ObjectMapper(); 
     ArrayNode result = mapper.createArrayNode(); 
     assertTrue(result.isArray()); 
     assertType(result, ArrayNode.class); 
     assertFalse(result.isObject()); 
     assertFalse(result.isNumber()); 
     assertFalse(result.isNull()); 
     assertFalse(result.isTextual()); 
     result.add(false); 
     result.insertNull(0); 
     assertEquals(result, result); 
     assertFalse(result.equals(null)); 
     assertEquals(NullNode.instance, result.path(0)); 
     assertEquals(NullNode.instance, result.get(0)); 
     assertEquals(BooleanNode.FALSE, result.path(1)); 
     assertEquals(BooleanNode.FALSE, result.get(1)); 
     assertEquals(2, result.size()); 
     assertNull(result.get(-1)); 
     assertNull(result.get(2)); 
     JsonNode missing = result.path(2); 
     assertTrue(missing.isMissingNode()); 
     assertTrue(result.path(-100).isMissingNode()); 
     ArrayNode array2 = mapper.createArrayNode(); 
     array2.addNull(); 
     array2.add(false); 
     assertEquals(result, array2); 
     JsonNode rm1 = array2.remove(0); 
     assertEquals(NullNode.instance, rm1); 
     assertEquals(1, array2.size()); 
     assertEquals(BooleanNode.FALSE, array2.get(0)); 
     assertFalse(result.equals(array2)); 
     JsonNode rm2 = array2.remove(0); 
     assertEquals(BooleanNode.FALSE, rm2); 
     assertEquals(0, array2.size()); 
 }
    

    /// Verifying [JACKSON-143]
    

    

    

    // Issue#186
    
}
