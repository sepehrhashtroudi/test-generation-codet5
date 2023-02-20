package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.BaseMapTest;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TestInferredMutators extends BaseMapTest
{
    public static class Point {
        private int x;
        
        public int getX() { return x; }
    }

    public static class FixedPoint {
        private final int x;

        public FixedPoint() { x = 0; }

        public int getX() { return x; }
    }

    /*
    /**********************************************************
    /* Unit tests
    /**********************************************************
     */

    // for #190
    
    
    // for #195
    
}
