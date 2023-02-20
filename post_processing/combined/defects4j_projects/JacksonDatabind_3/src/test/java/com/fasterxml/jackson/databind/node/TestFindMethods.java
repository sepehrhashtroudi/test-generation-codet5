package com.fasterxml.jackson.databind.node;

import java.util.*;

import com.fasterxml.jackson.databind.BaseMapTest;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class TestFindMethods
    extends BaseMapTest
{
public void testNonMatching60() throws Exception { 
     JsonNode root = _buildTree(); 
     assertNull(root.findValue("boogaboo")); 
     assertNull(root.findParent("boogaboo")); 
     JsonNode n = root.findPath("boogaboo"); 
     assertNotNull(n); 
     assertTrue(n.isMissingNode()); 
     assertTrue(root.findValues("boogaboo").isEmpty()); 
     assertTrue(root.findParents("boogaboo").isEmpty()); 
 }
    

    

    
    
    private JsonNode _buildTree() throws Exception
    {
        final String SAMPLE = "{ \"a\" : { \"value\" : 3 },"
            +"\"array\" : [ { \"b\" : 3 }, {\"value\" : 42}, { \"other\" : true } ]"
            +"}";
        return new ObjectMapper().readTree(SAMPLE);
    }
}
