package com.fasterxml.jackson.databind.deser;


import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;

/**
 * Tests for checking handling of abstract types.
 */
public class TestAbstract
    extends BaseMapTest
{
    static abstract class Abstract {
        public int x;
    }
    
    /*
    /**********************************************************
    /* Unit tests
    /**********************************************************
     */
    
    /**
     * Test to verify details of how trying to deserialize into
     * abstract type should fail (if there is no way to determine
     * actual type information for the concrete type to use)
     */
    
}
