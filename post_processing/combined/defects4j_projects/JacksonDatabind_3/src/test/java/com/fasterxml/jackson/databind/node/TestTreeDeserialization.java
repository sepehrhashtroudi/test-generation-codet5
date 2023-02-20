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
public void testNull182() throws Exception { 
     ObjectMapper mapper = new ObjectMapper(); 
     JsonNode result = mapper.readTree("   null "); 
     assertNotNull(result); 
     assertTrue(result.isNull()); 
     assertFalse(result.isNumber()); 
     assertFalse(result.isTextual()); 
     assertEquals("null", result.asText()); 
     assertEquals(result, NullNode.instance); 
 }
public void testReconfiguringOfWrapping183() throws Exception { 
     ObjectMapper mapper = new ObjectMapper(); 
     final Bean input = new Bean(); 
     String jsonUnwrapped = mapper.writeValueAsString(input); 
     assertEquals("{\"a\":3}", jsonUnwrapped); 
     String jsonWrapped = mapper.writer(SerializationFeature.WRAP_ROOT_VALUE).writeValueAsString(input); 
     assertEquals("{\"rudy\":{\"a\":3}}", jsonWrapped); 
     Bean result = mapper.readValue(jsonUnwrapped, Bean.class); 
     assertNotNull(result); 
     try { 
         result = mapper.reader(Bean.class).with(DeserializationFeature.UNWRAP_ROOT_VALUE).readValue(jsonUnwrapped); 
         fail("Should have failed"); 
     } catch (JsonMappingException e) { 
         verifyException(e, "Root name 'a'"); 
     } 
     result = mapper.reader(Bean.class).with(DeserializationFeature.UNWRAP_ROOT_VALUE).readValue(jsonWrapped); 
     assertNotNull(result); 
 }
    

    /// Verifying [JACKSON-143]
    

    

    

    // Issue#186
    
}
