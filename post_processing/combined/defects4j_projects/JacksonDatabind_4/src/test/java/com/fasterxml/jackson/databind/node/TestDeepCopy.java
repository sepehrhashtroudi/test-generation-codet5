package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.databind.BaseMapTest;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Simple tests to verify that [JACKSON-707] is implemented correctly.
 */
public class TestDeepCopy extends BaseMapTest
{
    private final ObjectMapper mapper = new ObjectMapper();
    
public void testWithObjectSimple226() { 
     ObjectNode root = mapper.createObjectNode(); 
     root.put("a", 3); 
     assertEquals(1, root.size()); 
     ObjectNode copy = root.deepCopy(); 
     assertEquals(1, copy.size()); 
     root.put("b", 7); 
     assertEquals(2, root.size()); 
     assertEquals(1, copy.size()); 
     copy.put("c", 3); 
     assertEquals(2, root.size()); 
     assertEquals(2, copy.size()); 
 }
    

    

    
}
