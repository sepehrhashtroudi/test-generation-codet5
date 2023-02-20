package com.fasterxml.jackson.databind.node;

import java.io.*;

import com.fasterxml.jackson.databind.*;

/**
 * This unit test suite tries to verify that JsonNode-based trees
 * can be deserialized as expected.
 */
public class TestTreeDeserialization
    extends BaseMapTest
{
    final static class Bean {
        int _x;
        JsonNode _node;

        public void setX(int x) { _x = x; }
        public void setNode(JsonNode n) { _node = n; }
    }

    /*
    /**********************************************************
    /* Unit tests
    /**********************************************************
     */

    /**
     * This test checks that is possible to mix "regular" Java objects
     * and JsonNode.
     */
    

    /// Verifying [JACKSON-143]
    

    

    

    // Issue#186
    
}
