package com.fasterxml.jackson.databind.node;

import java.io.*;
import java.util.*;


import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.TextNode;
import com.fasterxml.jackson.databind.node.TreeTraversingParser;

/**
 * Additional tests for {@link ArrayNode} container class.
 */
public class TestArrayNode
    extends BaseMapTest
{
public void testObjectNodeEquality229() { 
     ObjectNode n1 = new ObjectNode(null); 
     ObjectNode n2 = new ObjectNode(null); 
     assertTrue(n1.equals(n2)); 
     assertTrue(n2.equals(n1)); 
     n1.set("x", TextNode.valueOf("Test")); 
     assertFalse(n1.equals(n2)); 
     assertFalse(n2.equals(n1)); 
     n2.set("x", TextNode.valueOf("Test")); 
     assertTrue(n1.equals(n2)); 
     assertTrue(n2.equals(n1)); 
 }
    

    

    /**
     * Test to verify [JACKSON-227]
     */
    

    /**
     * Another test to verify [JACKSON-227]...
     */
    
    
    
}
