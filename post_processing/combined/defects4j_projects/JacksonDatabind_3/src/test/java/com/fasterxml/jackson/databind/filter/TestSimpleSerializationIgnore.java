package com.fasterxml.jackson.databind.filter;

import java.util.*;

import com.fasterxml.jackson.annotation.*;

import com.fasterxml.jackson.databind.*;

/**
 * This unit test suite tests use of {@link JsonIgnore} annotations
 * with  bean serialization; as well as (since 1.7)
 * {@link JsonIgnoreType}.
 */
public class TestSimpleSerializationIgnore
    extends BaseMapTest
{
    /*
    /**********************************************************
    /* Annotated helper classes
    /**********************************************************
     */

    /// Class for testing enabled {@link JsonIgnore} annotation
    final static class SizeClassEnabledIgnore
    {
        @JsonIgnore public int getY() { return 9; }

        // note: must be public to be seen
        public int getX() { return 1; }

        @JsonIgnore public int getY2() { return 1; }
        @JsonIgnore public int getY3() { return 2; }
    }

    /// Class for testing disabled {@link JsonIgnore} annotation
    final static class SizeClassDisabledIgnore
    {
        // note: must be public to be seen
        public int getX() { return 3; }
        @JsonIgnore(false) public int getY() { return 4; }
    }

    static class BaseClassIgnore
    {
        @JsonProperty("x")
        @JsonIgnore
        public int x() { return 1; }

        public int getY() { return 2; }
    }

    static class SubClassNonIgnore
        extends BaseClassIgnore
    {
        /* Annotations to disable ignorance, in sub-class; note that
         * we must still get "JsonProperty" fro super class
         */
        @Override
        @JsonIgnore(false)
        public int x() { return 3; }
    }

    @JsonIgnoreType
    static class IgnoredType { }

    @JsonIgnoreType(false)
    static class NonIgnoredType
    {
        public int value = 13;
        
        public IgnoredType ignored = new IgnoredType();
    }
    
    /*
    /**********************************************************
    /* Unit tests
    /**********************************************************
     */

    

    

    /**
     * Test case to verify that ignore tag can also be disabled
     * via inheritance
     */
    

    /**
     * @since 1.7
     */
    
}
