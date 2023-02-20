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
    
public void testDouble45() throws Exception { 
     ObjectMapper mapper = new ObjectMapper(); 
     double value = 3.04; 
     JsonNode result = mapper.readTree(String.valueOf(value)); 
     assertTrue(result.isNumber()); 
     assertFalse(result.isNull()); 
     assertType(result, DoubleNode.class); 
     assertTrue(result.isFloatingPointNumber()); 
     assertTrue(result.isDouble()); 
     assertFalse(result.isInt()); 
     assertFalse(result.isLong()); 
     assertFalse(result.isIntegralNumber()); 
     assertFalse(result.isTextual()); 
     assertFalse(result.isMissingNode()); 
     assertEquals(value, result.doubleValue()); 
     assertEquals(value, result.numberValue().doubleValue()); 
     assertEquals((int) value, result.intValue()); 
     assertEquals((long) value, result.longValue()); 
     assertEquals(String.valueOf(value), result.asText()); 
     assertEquals(result, DoubleNode.valueOf(value)); 
 }
public void testNested227() throws Exception { 
     final String JSON = "{\"coordinates\":[[[-3,\n1],[179.859681,51.175092]]]}"; 
     ObjectMapper m = new ObjectMapper(); 
     JsonNode tree = m.readTree(JSON); 
     JsonParser jp = tree.traverse(); 
     assertToken(JsonToken.START_OBJECT, jp.nextToken()); 
     assertToken(JsonToken.FIELD_NAME, jp.nextToken()); 
     assertToken(JsonToken.START_ARRAY, jp.nextToken()); 
     assertToken(JsonToken.START_ARRAY, jp.nextToken()); 
     assertToken(JsonToken.START_ARRAY, jp.nextToken()); 
     assertToken(JsonToken.VALUE_NUMBER_INT, jp.nextToken()); 
     assertToken(JsonToken.VALUE_NUMBER_INT, jp.nextToken()); 
     assertToken(JsonToken.END_ARRAY, jp.nextToken()); 
     assertToken(JsonToken.START_ARRAY, jp.nextToken()); 
     assertToken(JsonToken.VALUE_NUMBER_FLOAT, jp.nextToken()); 
     assertToken(JsonToken.VALUE_NUMBER_FLOAT, jp.nextToken()); 
     assertToken(JsonToken.END_ARRAY, jp.nextToken()); 
     assertToken(JsonToken.END_ARRAY, jp.nextToken()); 
     assertToken(JsonToken.END_ARRAY, jp.nextToken()); 
     assertToken(JsonToken.END_OBJECT, jp.nextToken()); 
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

