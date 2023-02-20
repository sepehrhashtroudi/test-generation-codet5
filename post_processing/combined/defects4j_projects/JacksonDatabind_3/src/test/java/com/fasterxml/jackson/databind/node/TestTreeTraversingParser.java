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
    
public void testArrayNodeEquality190() { 
     ArrayNode n1 = new ArrayNode(null); 
     ArrayNode n2 = new ArrayNode(null); 
     assertTrue(n1.equals(n2)); 
     assertTrue(n2.equals(n1)); 
     n1.add(TextNode.valueOf("Test")); 
     assertFalse(n1.equals(n2)); 
     assertFalse(n2.equals(n1)); 
     n2.add(TextNode.valueOf("Test")); 
     assertTrue(n1.equals(n2)); 
     assertTrue(n2.equals(n1)); 
 }
public void testSpecDoc209() throws Exception { 
     ObjectMapper m = new ObjectMapper(); 
     JsonNode tree = m.readTree(SAMPLE_DOC_JSON_SPEC); 
     JsonParser jp = tree.traverse(); 
     verifyJsonSpecSampleDoc(jp, true); 
 }
public void testArray245() throws Exception { 
     ObjectMapper m = new ObjectMapper(); 
     JsonParser jp = m.readTree("[]").traverse(); 
     assertToken(JsonToken.START_ARRAY, jp.nextToken()); 
     assertToken(JsonToken.END_ARRAY, jp.nextToken()); 
     jp.close(); 
     jp = m.readTree("[[]]").traverse(); 
     assertToken(JsonToken.START_ARRAY, jp.nextToken()); 
     assertToken(JsonToken.START_ARRAY, jp.nextToken()); 
     assertToken(JsonToken.END_ARRAY, jp.nextToken()); 
     assertToken(JsonToken.END_ARRAY, jp.nextToken()); 
     jp.close(); 
     jp = m.readTree("[[ 12.1 ]]").traverse(); 
     assertToken(JsonToken.START_ARRAY, jp.nextToken()); 
     assertToken(JsonToken.START_ARRAY, jp.nextToken()); 
     assertToken(JsonToken.VALUE_NUMBER_FLOAT, jp.nextToken()); 
     assertToken(JsonToken.END_ARRAY, jp.nextToken()); 
     assertToken(JsonToken.END_ARRAY, jp.nextToken()); 
     jp.close(); 
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

