package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.annotation.*;

import com.fasterxml.jackson.databind.BaseMapTest;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Tests to verify that annotations are shared and merged between members
 * of a property (getter and setter and so on)
 */
public class TestAnnotationMerging extends BaseMapTest
{
    static class Wrapper
    {
        protected Object value;

        public Wrapper() { }
        public Wrapper(Object o) { value = o; }
        
        @JsonTypeInfo(use = JsonTypeInfo.Id.CLASS)
        public Object getValue() { return value; }

        public void setValue(Object o) { value = o; }
    }

    static class SharedName {
        @JsonProperty("x")
        protected int value;

        public SharedName(int v) { value = v; }
        
        public int getValue() { return value; }
    }

    static class SharedName2
    {
        @JsonProperty("x")
        public int getValue() { return 1; }
        public void setValue(int x) { }
    }

    // Testing to ensure that ctor param and getter can "share" @JsonTypeInfo stuff
    static class TypeWrapper
    {
        protected Object value;

        @JsonCreator
        public TypeWrapper(
                @JsonProperty("value")
                @JsonTypeInfo(use = JsonTypeInfo.Id.CLASS) Object o) {
            value = o;
        }
        public Object getValue() { return value; }
    }
    
    /*
    /**********************************************************
    /* Unit tests
    /**********************************************************
     */

    

    
    
    

    
}
