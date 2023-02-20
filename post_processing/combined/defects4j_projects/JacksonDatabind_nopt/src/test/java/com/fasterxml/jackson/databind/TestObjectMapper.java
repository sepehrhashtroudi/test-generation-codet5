package com.fasterxml.jackson.databind;

import java.io.*;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.node.*;
import com.fasterxml.jackson.databind.type.TypeFactory;

public class TestObjectMapper extends BaseMapTest
{
    static class Bean {
        int value = 3;
        
        public void setX(int v) { value = v; }
    }

    // for [Issue#206]
    @SuppressWarnings("serial")
    static class CustomMapper extends ObjectMapper {
        @Override
        protected DefaultDeserializationContext createDeserializationContext(JsonParser jp,
                DeserializationConfig cfg) {
            return super.createDeserializationContext(jp, cfg);
        }
    }
    
    /*
    /**********************************************************
    /* Test methods
    /**********************************************************
     */
    
    final static ObjectMapper MAPPER = new ObjectMapper();
    
    

    

    

    // Test to ensure that we can check property ordering defaults...
    


    
    
    /**
     * Test for verifying working of [JACKSON-191]
     */
    
    
    // [Issue#28]: ObjectMapper.copy()
    
}
