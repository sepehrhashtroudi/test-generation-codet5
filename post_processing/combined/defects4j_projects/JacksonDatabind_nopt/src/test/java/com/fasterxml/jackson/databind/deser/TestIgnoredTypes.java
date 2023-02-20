package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.annotation.*;

import com.fasterxml.jackson.databind.*;

/**
 * Test for [JACKSON-429]
 */
public class TestIgnoredTypes extends BaseMapTest
{
    /*
    /**********************************************************
    /* Annotated helper classes
    /**********************************************************
     */
    
    @JsonIgnoreType
    class IgnoredType { // note: non-static, can't be deserializer
        public IgnoredType(IgnoredType src) { }
    }

    @JsonIgnoreType(false)
    static class NonIgnoredType
    {
        public int value = 13;
        public IgnoredType ignored;
    }

    /*
    /**********************************************************
    /* Unit tests
    /**********************************************************
     */

    
}
