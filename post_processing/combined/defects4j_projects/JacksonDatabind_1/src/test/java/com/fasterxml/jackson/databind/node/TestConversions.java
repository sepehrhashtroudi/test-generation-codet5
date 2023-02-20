package com.fasterxml.jackson.databind.node;

import java.io.IOException;

import static org.junit.Assert.*;

import org.junit.Assert;

import com.fasterxml.jackson.core.*;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.util.TokenBuffer;

/**
 * Unit tests for verifying functionality of {@link JsonNode} methods that
 * convert values to other types
 */
public class TestConversions extends BaseMapTest
{
    static class Root {
        public Leaf leaf;
    }

    static class Leaf {
        public int value;

        public Leaf() { }
        public Leaf(int v) { value = v; }
    }
    
    // MixIn for [JACKSON-554]
    @JsonDeserialize(using = LeafDeserializer.class)
    public static class LeafMixIn
    {
    }
    
    /*
    /**********************************************************
    /* Unit tests
    /**********************************************************
     */

    private final static ObjectMapper MAPPER = new ObjectMapper();
    
public void testBoolean144() throws Exception { 
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
public void testEmbeddedObject171() throws Exception { 
     TokenBuffer buf = new TokenBuffer(MAPPER); 
     buf.writeObject(new byte[3]); 
     JsonNode node = MAPPER.readTree(buf.asParser()); 
     buf.close(); 
     assertTrue(node.isBinary()); 
     byte[] data = node.binaryValue(); 
     assertNotNull(data); 
     assertEquals(3, data.length); 
 }
public void testAdds219() { 
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
    

    
    
    // Deserializer to trigger the problem described in [JACKSON-554]
    public static class LeafDeserializer extends JsonDeserializer<Leaf>
    {
        @Override
        public Leaf deserialize(JsonParser jp, DeserializationContext ctxt)
                throws IOException, JsonProcessingException
        {
            JsonNode tree = (JsonNode) jp.readValueAsTree();
            Leaf leaf = new Leaf();
            leaf.value = tree.get("value").intValue();
            return leaf;
        }
    }

    // Test for [JACKSON-554]
    

    // Test for [JACKSON-631]
    

    static class Issue709Bean {
        public byte[] data;
    }
    
    /**
     * Simple test to verify that byte[] values can be handled properly when
     * converting, as long as there is metadata (from POJO definitions).
     */
    

    
    
    private final Object MARKER = new Object();

    

    
}

