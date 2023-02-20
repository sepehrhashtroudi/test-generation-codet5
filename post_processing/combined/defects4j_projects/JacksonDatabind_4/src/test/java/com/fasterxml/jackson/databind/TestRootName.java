package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.*;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Unit tests dealing with handling of "root element wrapping",
 * including configuration of root name to use.
 */
public class TestRootName extends BaseMapTest
{
    @JsonRootName("rudy")
    static class Bean {
        public int a = 3;
    }
    
    @JsonRootName("")
    static class RootBeanWithEmpty {
        public int a = 2;
    }

    /*
    /**********************************************************
    /* Unit tests
    /**********************************************************
     */

    

    

    
    
    // [JACKSON-764]
    

    /*
    /**********************************************************
    /* Helper methods
    /**********************************************************
     */
    
    private ObjectMapper rootMapper()
    {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(SerializationFeature.WRAP_ROOT_VALUE, true);
        mapper.configure(DeserializationFeature.UNWRAP_ROOT_VALUE, true);
        return mapper;
    }
}
