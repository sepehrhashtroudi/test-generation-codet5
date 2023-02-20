package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;

/**
 * Unit tests for verifying that field-backed properties can also be
 * deserialized (since version 1.1) as well as
 * setter-accessible properties.
 */
public class TestFieldDeserialization
    extends BaseMapTest
{
    /*
    /**********************************************************
    /* Annotated helper classes
    /**********************************************************
     */

    static class SimpleFieldBean
    {
        public int x, y;

        // not auto-detectable, not public
        int z;

        // ignored, not detectable either
        @JsonIgnore public int a;
    }

    static class SimpleFieldBean2
    {
        @JsonDeserialize String[] values;
    }

    @JsonAutoDetect(fieldVisibility=Visibility.NONE)
    static class NoAutoDetectBean
    {
        // not auto-detectable any more
        public int z;

        @JsonProperty("z")
        public int _z;
    }

    // Let's test invalid bean too
    static class DupFieldBean
    {
        public int z;

        @JsonProperty("z")
        public int _z;
    }

    public static class DupFieldBean2
    {
        @JsonProperty("foo")
        public int _z;

        @JsonDeserialize
        private int foo;
    }

    public static class OkDupFieldBean
        extends SimpleFieldBean
    {
        @JsonProperty("x")
        protected int myX = 10;

        public int y = 11;
    }
    
    abstract static class Abstract { }
    static class Concrete extends Abstract
    {
        String value;

        public Concrete(String v) { value = v; }
    }

    static class AbstractWrapper {
        @JsonDeserialize(as=Concrete.class)
        public Abstract value;
    }

    /*
    /**********************************************************
    /* Main tests
    /**********************************************************
     */

    

    

    

    

    

    

    // For [JACKSON-226], acceptable field overrides
    
}
