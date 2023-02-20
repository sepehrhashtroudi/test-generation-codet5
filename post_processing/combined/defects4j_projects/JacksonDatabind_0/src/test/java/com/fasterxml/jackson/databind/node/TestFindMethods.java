package com.fasterxml.jackson.databind.node;

import java.util.*;

import com.fasterxml.jackson.databind.BaseMapTest;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class TestFindMethods
    extends BaseMapTest
{
public void testMatchingMultiple56() throws Exception { 
     JsonNode root = _buildTree(); 
     List<JsonNode> nodes = root.findValues("value"); 
     assertEquals(2, nodes.size()); 
     assertEquals(3, nodes.get(0).intValue()); 
     assertEquals(42, nodes.get(1).intValue()); 
     nodes = root.findParents("value"); 
     assertEquals(2, nodes.size()); 
     assertTrue(nodes.get(0).isObject()); 
     assertTrue(nodes.get(1).isObject()); 
     assertEquals(3, nodes.get(0).path("value").intValue()); 
     assertEquals(42, nodes.get(1).path("value").intValue()); 
     List<String> values = root.findValuesAsText("value"); 
     assertEquals(2, values.size()); 
     assertEquals("3", values.get(0)); 
     assertEquals("42", values.get(1)); 
 }
public void testMatchingSingle141() throws Exception { 
     JsonNode root = _buildTree(); 
     JsonNode node = root.findValue("b"); 
     assertNotNull(node); 
     assertEquals(3, node.intValue()); 
     node = root.findParent("b"); 
     assertNotNull(node); 
     assertTrue(node.isObject()); 
     assertEquals(1, ((ObjectNode) node).size()); 
     assertEquals(3, node.path("b").intValue()); 
 }
    

    

    
    
    private JsonNode _buildTree() throws Exception
    {
        final String SAMPLE = "{ \"a\" : { \"value\" : 3 },"
            +"\"array\" : [ { \"b\" : 3 }, {\"value\" : 42}, { \"other\" : true } ]"
            +"}";
        return new ObjectMapper().readTree(SAMPLE);
    }
}
