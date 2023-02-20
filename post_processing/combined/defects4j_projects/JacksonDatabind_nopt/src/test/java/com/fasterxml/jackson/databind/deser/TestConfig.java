package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector;

/**
 * Unit tests for checking handling of DeserializationConfig.
 */
public class TestConfig
    extends BaseMapTest
{
    @JsonAutoDetect(setterVisibility=Visibility.NONE)
    final static class Dummy { }

    final static class EmptyDummy { }

    static class AnnoBean {
        int value = 3;
        
        @JsonProperty("y")
            public void setX(int v) { value = v; }
    }

    enum Alpha { A, B, C; }

    public static class SimpleBean {
        public int x, y;
    }
    
    /*
    /**********************************************************
    /* Main tests
    /**********************************************************
     */

    /* Test to verify that we don't overflow number of features; if we
     * hit the limit, need to change implementation -- this test just
     * gives low-water mark
     */
    
    
    

    
        
    

    // [JACKSON-875]
    

    
}
