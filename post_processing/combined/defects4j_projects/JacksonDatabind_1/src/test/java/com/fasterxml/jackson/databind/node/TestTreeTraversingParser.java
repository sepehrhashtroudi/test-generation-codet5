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
    
public void testBinaryNode79() throws Exception { 
     byte[] inputBinary = new byte[] { 0, -5 }; 
     BinaryNode n = new BinaryNode(inputBinary); 
     JsonParser jp = n.traverse(); 
     assertNull(jp.getCurrentToken()); 
     assertToken(JsonToken.VALUE_EMBEDDED_OBJECT, jp.nextToken()); 
     byte[] data = jp.getBinaryValue(); 
     assertNotNull(data); 
     assertArrayEquals(inputBinary, data); 
     assertEquals("APs=", jp.getText()); 
     assertNull(jp.nextToken()); 
 }
public void testParser129() throws Exception { 
     ArrayNode n = new ArrayNode(JsonNodeFactory.instance); 
     n.add(123); 
     TreeTraversingParser p = new TreeTraversingParser(n, null); 
     p.setCodec(null); 
     assertNull(p.getCodec()); 
     assertNotNull(p.getParsingContext()); 
     assertNotNull(p.getTokenLocation()); 
     assertNotNull(p.getCurrentLocation()); 
     assertNull(p.getEmbeddedObject()); 
     assertNull(p.currentNode()); 
     assertToken(JsonToken.START_ARRAY, p.nextToken()); 
     p.skipChildren(); 
     assertToken(JsonToken.END_ARRAY, p.getCurrentToken()); 
     p.close(); 
     p = new TreeTraversingParser(n, null); 
     p.nextToken(); 
     assertToken(JsonToken.VALUE_NUMBER_INT, p.nextToken()); 
     assertEquals(JsonParser.NumberType.INT, p.getNumberType()); 
     p.close(); 
 }
public void testNested212() throws Exception { 
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
public void testArray213() throws Exception { 
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
public void testBinaryNode215() throws Exception { 
     byte[] inputBinary = new byte[] { 0, -5 }; 
     BinaryNode n = new BinaryNode(inputBinary); 
     JsonParser jp = n.traverse(); 
     assertNull(jp.getCurrentToken()); 
     assertToken(JsonToken.VALUE_EMBEDDED_OBJECT, jp.nextToken()); 
     byte[] data = jp.getBinaryValue(Base64Variants.MIME); 
     assertNotNull(data); 
     assertArrayEquals(inputBinary, data); 
     assertEquals("APs=", jp.getText()); 
     assertNull(jp.nextToken()); 
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

