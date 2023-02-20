package com.fasterxml.jackson.databind.ser;


import java.io.*;
import java.util.*;


import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.node.*;

/**
 * This unit test suite tries to verify that JsonNode-based trees
 * can be serialized as expected
 */
public class TestTreeSerialization
    extends BaseMapTest
{
    final static class Bean {
        public String getX() { return "y"; }
        public int getY() { return 13; }
    }

    

    /**
     * Simple test to verify that POJONodes (JsonNode wrapper around
     * any old Java object) work with serialization
     */
    

    

    
}
