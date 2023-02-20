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
    
public void testTextAsBinary116() throws Exception { 
     TextNode n = new TextNode("   APs=\n"); 
     JsonParser jp = n.traverse(); 
     assertNull(jp.getCurrentToken()); 
     assertToken(JsonToken.VALUE_STRING, jp.nextToken()); 
     byte[] data = jp.getBinaryValue(); 
     assertNotNull(data); 
     assertArrayEquals(new byte[] { 0, -5 }, data); 
     assertNull(jp.nextToken()); 
     jp.close(); 
     assertTrue(jp.isClosed()); 
     n = new TextNode("?!??"); 
     jp = n.traverse(); 
     assertToken(JsonToken.VALUE_STRING, jp.nextToken()); 
     try { 
         jp.getBinaryValue(); 
     } catch (JsonParseException e) { 
         verifyException(e, "Illegal character"); 
     } 
 }
public void testTwoBytes117() throws Exception { 
     byte[] input = new byte[] { 1, 2, 3, 4, 5, 6, 7 }; 
     String encoded = MAPPER.convertValue(input, String.class); 
     assertNotNull(encoded); 
     byte[] result = MAPPER.convertValue(encoded, byte[].class); 
     assertArrayEquals(input, result); 
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

