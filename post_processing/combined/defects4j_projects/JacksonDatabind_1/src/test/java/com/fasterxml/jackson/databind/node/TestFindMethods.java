package com.fasterxml.jackson.databind.node;

import java.util.*;

import com.fasterxml.jackson.databind.BaseMapTest;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class TestFindMethods
    extends BaseMapTest
{
    

    

    
    
    private JsonNode _buildTree() throws Exception
    {
        final String SAMPLE = "{ \"a\" : { \"value\" : 3 },"
            +"\"array\" : [ { \"b\" : 3 }, {\"value\" : 42}, { \"other\" : true } ]"
            +"}";
        return new ObjectMapper().readTree(SAMPLE);
    }
}
