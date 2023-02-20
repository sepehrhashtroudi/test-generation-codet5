package com.fasterxml.jackson.databind.ser;

import java.io.StringWriter;
import java.util.*;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector;

/**
 * Unit tests for checking handling of SerializationConfig.
 */
public class TestConfig
    extends BaseMapTest
{
    /*
    /**********************************************************
    /* Helper beans
    /**********************************************************
     */

    @JsonSerialize(include=JsonSerialize.Inclusion.NON_DEFAULT,
                   typing=JsonSerialize.Typing.STATIC)
    final static class Config { }

    final static class ConfigNone { }

    static class AnnoBean {
        public int getX() { return 1; }
        @JsonProperty("y")
        private int getY() { return 2; }
    }

    static class Indentable {
        public int a = 3;
    }

    public static class SimpleBean {
        public int x = 1;
    }
    
    /*
    /**********************************************************
    /* Main tests
    /**********************************************************
     */

    final static ObjectMapper MAPPER = new ObjectMapper();

    /* Test to verify that we don't overflow number of features; if we
     * hit the limit, need to change implementation -- this test just
     * gives low-water mark
     */
public void testOverrideIntrospectors170() { 
     ObjectMapper m = new ObjectMapper(); 
     DeserializationConfig cfg = m.getDeserializationConfig(); 
     cfg = cfg.with((ClassIntrospector) null); 
     cfg = cfg.with((AnnotationIntrospector) null); 
     assertNull(cfg.getAnnotationIntrospector()); 
 }
    
    
    

    

    

    

    

    /**
     * Test for verifying working of [JACKSON-191]
     */
    

    // Test for [Issue#12]
    

    
    
    private final static String getLF() {
        return System.getProperty("line.separator");
    }
}
