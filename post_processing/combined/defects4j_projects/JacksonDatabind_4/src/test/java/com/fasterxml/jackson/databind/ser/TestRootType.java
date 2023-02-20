package com.fasterxml.jackson.databind.ser;

import java.io.StringWriter;
import java.util.*;


import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.type.TypeFactory;

/**
 * Unit tests for verifying functioning of [JACKSON-195], ability to
 * force specific root type for serialization (super type of value)
 */
public class TestRootType
    extends BaseMapTest
{
    /*
    /**********************************************************
    /* Annotated helper classes
    /**********************************************************
     */

    interface BaseInterface {
        int getB();
    }
    
    static class BaseType
        implements BaseInterface
    {
        public String a = "a";

        @Override
        public int getB() { return 3; }
    }

    static class SubType extends BaseType {
        public String a2 = "x";
        
        public boolean getB2() { return true; }
    }

    @JsonTypeInfo(use=Id.NAME, include=As.PROPERTY, property="beanClass")
    public abstract static class BaseClass398 { }

    public static class TestClass398 extends BaseClass398 {
       public String property = "aa";
    }
    
    @JsonRootName("root")
    static class WithRootName {
        public int a = 3;
    }

    /*
    /**********************************************************
    /* Main tests
    /**********************************************************
     */
    
public void testPrettyPrinter223() throws Exception { 
     ObjectMapper mapper = new ObjectMapper(); 
     ObjectWriter writer = mapper.writer(); 
     HashMap<String, Integer> data = new HashMap<String, Integer>(); 
     data.put("a", 1); 
     assertEquals("{\"a\":1}", writer.writeValueAsString(data)); 
     writer = writer.withDefaultPrettyPrinter(); 
     String lf = System.getProperty("line.separator"); 
     assertEquals("{" + lf + "  \"a\" : 1" + lf + "}", writer.writeValueAsString(data)); 
     writer = writer.with((PrettyPrinter) null); 
     assertEquals("{\"a\":1}", writer.writeValueAsString(data)); 
 }
public void testPrefetch224() throws Exception { 
     ObjectWriter writer = objectWriter(); 
     assertFalse(writer.hasPrefetchedSerializer()); 
     writer = objectWriter().withType(String.class); 
     assertTrue(writer.hasPrefetchedSerializer()); 
 }
    

    

    
    
    /**
     * Unit test to ensure that proper exception is thrown if declared
     * root type is not compatible with given value instance.
     */
    
    
    /**
     * Unit test to verify [JACKSON-398]
     */
    

    // Test to verify [JACKSON-163]
    

    /**
     * Test to verify that there is support for specifying root type as primitive,
     * even if wrapper value is passed (there is no way to pass primitive values as
     * Objects); this to support frameworks that may pass unprocessed
     * {@link java.lang.reflect.Type} from field or method.
     */
    

    // [JACKSON-630] also, allow annotation to define root name
    
}
