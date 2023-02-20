package com.fasterxml.jackson.databind.struct;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

import com.fasterxml.jackson.databind.BaseMapTest;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector;

public class TestPOJOAsArray extends BaseMapTest
{
    static class Pojo
    {
        @JsonFormat(shape=JsonFormat.Shape.ARRAY)
        public PojoValue value;

        public Pojo() { }
        public Pojo(String name, int x, int y, boolean c) {
            value = new PojoValue(name, x, y, c);
        }
    }

    // note: must be serialized/deserialized alphabetically; fields NOT declared in that order
    @JsonPropertyOrder(alphabetic=true)
    static class PojoValue
    {
        public int x, y;
        public String name;
        public boolean complete;

        public PojoValue() { }
        public PojoValue(String name, int x, int y, boolean c) {
            this.name = name;
            this.x = x;
            this.y = y;
            this.complete = c;
        }
    }

    @JsonPropertyOrder(alphabetic=true)
    @JsonFormat(shape=JsonFormat.Shape.ARRAY)
    static class FlatPojo
    {
        public int x, y;
        public String name;
        public boolean complete;

        public FlatPojo() { }
        public FlatPojo(String name, int x, int y, boolean c) {
            this.name = name;
            this.x = x;
            this.y = y;
            this.complete = c;
        }
    }

    static class ForceArraysIntrospector extends JacksonAnnotationIntrospector
    {
        private static final long serialVersionUID = 1L;

        @Override
        public JsonFormat.Value findFormat(Annotated a) {
            return new JsonFormat.Value().withShape(JsonFormat.Shape.ARRAY);
        }
    }

    static class A {
        public B value = new B();
    }

    @JsonPropertyOrder(alphabetic=true)
    static class B {
        public int x = 1;
        public int y = 2;
    }

    // for [JACKSON-805]
    @JsonFormat(shape=Shape.ARRAY)
    static class SingleBean {
        public String name = "foo";
    }

    @JsonPropertyOrder(alphabetic=true)
    @JsonFormat(shape=Shape.ARRAY)
    static class TwoStringsBean {
        public String bar = null;
        public String foo = "bar";
    }
    
    /*
    /*****************************************************
    /* Basic tests
    /*****************************************************
     */

    private final static ObjectMapper MAPPER = new ObjectMapper();
    
    /**
     * Test that verifies that property annotation works
     */
    

    /**
     * Test that verifies that Class annotation works
     */
    
    
    /**
     * Test that verifies that property annotation works
     */
    

    /**
     * Test that verifies that Class annotation works
     */
    

    // [Issue#223]
    

    /*
    /*****************************************************
    /* Compatibility with "single-elem as array" feature
    /*****************************************************
     */
    
    // for [JACKSON-805]
    
    
    /*
    /*****************************************************
    /* Round-trip tests
    /*****************************************************
     */

    
}
