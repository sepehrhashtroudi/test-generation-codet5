package com.fasterxml.jackson.databind.node;

import java.util.*;

import static org.junit.Assert.*;

import com.fasterxml.jackson.annotation.*;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.node.BinaryNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.node.POJONode;
import com.fasterxml.jackson.databind.node.TextNode;

public class TestTreeTraversingParser
    extends BaseMapTest
{
    static class Person {
        public String name;
        public int magicNumber;
        public List<String> kids;
    }

    // Helper class for [JACKSON-370]
    @JsonIgnoreProperties(ignoreUnknown=true)
    public static class Jackson370Bean {
        public Inner inner;
    }

    public static class Inner {
        public String value;
    }
    
    /*
    /**********************************************************
    /* Test methods
    /**********************************************************
     */
    
public void testTextAsBinary247() throws Exception { 
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
public void testSpecDoc248() throws Exception { 
     ObjectMapper m = new ObjectMapper(); 
     JsonNode tree = m.readTree(SAMPLE_DOC_JSON_SPEC); 
     JsonParser jp = tree.traverse(); 
     verifyJsonSpecSampleDoc(jp, true); 
 }
    

    
    
    
    
    /**
     * Unit test that verifies that we can (re)parse sample document
     * from JSON specification.
     */
    

    

    

    

    /**
     * Very simple test case to verify that tree-to-POJO
     * conversion works ok
     */
    

    // [JACKSON-370]
    
}

