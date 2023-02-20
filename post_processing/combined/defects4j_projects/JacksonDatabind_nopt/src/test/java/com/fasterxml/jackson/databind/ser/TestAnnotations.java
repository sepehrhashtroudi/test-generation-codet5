package com.fasterxml.jackson.databind.ser;

import java.io.*;
import java.util.*;


import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.core.*;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * This unit test suite tests use of Annotations for
 * bean serialization.
 */
public class TestAnnotations
    extends BaseMapTest
{
    /*
    /**********************************************************
    /* Helper classes
    /**********************************************************
     */

    /// Class for testing {@link JsonProperty} annotations with getters
    final static class SizeClassGetter
    {
        @JsonProperty public int size() { return 3; }
        @JsonProperty("length") public int foobar() { return -17; }
        // note: need not be public since there's annotation
        @JsonProperty protected int value() { return 0; }

        // dummy method; not a getter signature
        protected int getNotReally(int arg) { return 0; }
    }

    // And additional testing to cover [JACKSON-64]
    final static class SizeClassGetter2
    {
        // Should still be considered property "x"
        @JsonProperty protected int getX() { return 3; }
    }

    // and some support for testing [JACKSON-120]
    final static class SizeClassGetter3
    {
        // Should be considered property "y" even tho non-public
        @JsonSerialize protected int getY() { return 8; }
    }


    /**
     * Class for testing {@link JsonSerializer} annotation
     * for class itself.
     */
    @JsonSerialize(using=BogusSerializer.class)
    final static class ClassSerializer {
    }

    /**
     * Class for testing an active {@link JsonSerialize#using} annotation
     * for a method
     */
    final static class ClassMethodSerializer {
        private int _x;

        public ClassMethodSerializer(int x) { _x = x; }

        @JsonSerialize(using=StringSerializer.class)
        public int getX() { return _x; }
    }

    /**
     * Class for testing an inactive (one that will not have any effect)
     * {@link JsonSerialize} annotation for a method
     */
    final static class InactiveClassMethodSerializer {
        private int _x;

        public InactiveClassMethodSerializer(int x) { _x = x; }

        // Basically, has no effect, hence gets serialized as number
        @JsonSerialize(using=JsonSerializer.None.class)
        public int getX() { return _x; }
    }

    /**
     * Class for verifying that getter information is inherited
     * as expected via normal class inheritance
     */
    static class BaseBean {
        public int getX() { return 1; }
        @JsonProperty("y")
        private int getY() { return 2; }
    }

    static class SubClassBean extends BaseBean {
        public int getZ() { return 3; }
    }

    // For [JACKSON-666] ("SerializationFeature of the Beast!")
    @JsonPropertyOrder(alphabetic=true)
    static class GettersWithoutSetters
    {
        public int d = 0;
        
        @JsonCreator
        public GettersWithoutSetters(@JsonProperty("a") int a) { }
        
        // included, since there is a constructor property
        public int getA() { return 3; }

        // not included, as there's nothing matching
        public int getB() { return 4; }

        // include as there is setter
        public int getC() { return 5; }
        public void setC(int v) { }

        // and included, as there is a field
        public int getD() { return 6; }
    }

    // [JACKSON-806]: override 'need-setter' with explicit annotation
    static class GettersWithoutSetters2
    {
        @JsonProperty
        public int getA() { return 123; }
    }
    
    /*
    /**********************************************************
    /* Other helper classes
    /**********************************************************
     */

    public final static class BogusSerializer extends JsonSerializer<Object>
    {
        @Override
        public void serialize(Object value, JsonGenerator jgen, SerializerProvider provider)
            throws IOException, JsonGenerationException
        {
            jgen.writeBoolean(true);
        }
    }

    private final static class StringSerializer extends JsonSerializer<Object>
    {
        @Override
        public void serialize(Object value, JsonGenerator jgen, SerializerProvider provider)
            throws IOException, JsonGenerationException
        {
            jgen.writeString("X"+value+"X");
        }

    }

    /*
    /**********************************************************
    /* Main tests
    /**********************************************************
     */

    private final ObjectMapper MAPPER = new ObjectMapper();
    
    

    

    // testing [JACKSON-120], implied getter
    

    /**
     * Let's also verify that inherited super-class getters are used
     * as expected
     */
    

    /**
     * Unit test to verify that {@link JsonSerialize#using} annotation works
     * when applied to a class
     */
    

    /**
     * Unit test to verify that @JsonSerializer annotation works
     * when applied to a Method
     */
    

    

    

    
}
