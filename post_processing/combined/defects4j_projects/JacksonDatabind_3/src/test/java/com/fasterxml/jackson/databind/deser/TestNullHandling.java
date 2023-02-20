package com.fasterxml.jackson.databind.deser;

import java.io.IOException;


import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.module.SimpleModule;

public class TestNullHandling extends BaseMapTest
{
    /*
    /**********************************************************
    /* Helper classes
    /**********************************************************
     */

    static class FunnyNullDeserializer extends JsonDeserializer<String>
    {
        @Override
        public String deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException {
            return "text";
        }

        @Override
        public String getNullValue() { return "funny"; }
    }

    /*
    /**********************************************************
    /* Test methods
    /**********************************************************
     */

    // Test for [JACKSON-643]
    
}
