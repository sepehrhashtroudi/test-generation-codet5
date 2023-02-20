package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.annotation.*;

import com.fasterxml.jackson.databind.*;

/**
 * Tests for checking that static methods are not recognized as accessors
 * for properties
 */
public class TestStatics
    extends BaseMapTest
{
    static class Bean
    {
        int _x;

        public static void setX(int value) { throw new Error("Should NOT call static method"); }
        
        @JsonProperty("x") public void assignX(int x) { _x = x; }
    }

    /*
    /**********************************************************
    /* Test methods
    /**********************************************************
     */

    
}
