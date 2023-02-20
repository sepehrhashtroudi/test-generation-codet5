package com.fasterxml.jackson.databind.mixins;

import java.io.*;
import java.util.*;

import com.fasterxml.jackson.annotation.*;

import com.fasterxml.jackson.databind.*;

public class TestMixinDeserForMethods
    extends BaseMapTest
{
    /*
    /**********************************************************
    /* Helper bean classes
    /**********************************************************
     */

    static class BaseClass
    {
        protected HashMap<String,Object> values = new HashMap<String,Object>();

        public BaseClass() { }

        protected void addValue(String key, Object value) {
            values.put(key, value);
        }
    }

    interface MixIn
    {
        @JsonAnySetter void addValue(String key, Object value);
    }

    /*
    /**********************************************************
    /* Unit tests
    /**********************************************************
     */

    /**
     * Unit test that verifies that we can mix in @JsonAnySetter
     * annotation, as expected.
     */
    
}
