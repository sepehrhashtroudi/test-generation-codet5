package com.fasterxml.jackson.databind.module;

import java.util.Map;

import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.BaseMapTest;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TestKeyDeserializers extends BaseMapTest
{
    static class FooKeyDeserializer extends KeyDeserializer
    {
        @Override
        public Foo deserializeKey(String key, DeserializationContext ctxt)
        {
            return new Foo(key);
        }
    }
    
    static class Foo {
        public String value;
        
        public Foo(String v) { value = v; }
    }
    

    /*
    /**********************************************************
    /* Unit tests
    /**********************************************************
     */

    
}
