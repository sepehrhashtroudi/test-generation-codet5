package com.fasterxml.jackson.databind.filter;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.core.*;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.DeserializationProblemHandler;

/**
 * Unit tests for checking handling of unknown properties
 */
public class TestUnknownPropertyDeserialization
    extends BaseMapTest
{
    final static String JSON_UNKNOWN_FIELD = "{ \"a\" : 1, \"foo\" : [ 1, 2, 3], \"b\" : -1 }";

    /*
    /**********************************************************
    /* Helper classes
    /**********************************************************
     */

    final static class TestBean
    {
        String _unknown;

        int _a, _b;

        public TestBean() { }

        public void setA(int a) { _a = a; }
        public void setB(int b) { _b = b; }

        public void markUnknown(String unk) { _unknown = unk; }
    }

    /**
     * Simple {@link DeserializationProblemHandler} sub-class that
     * just marks unknown property/ies when encountered, along with
     * Json value of the property.
     */
    final static class MyHandler
        extends DeserializationProblemHandler
    {
        @Override
        public boolean handleUnknownProperty(DeserializationContext ctxt,
                JsonParser jp, JsonDeserializer<?> deserializer,
                Object bean, String propertyName)
            throws IOException, JsonProcessingException
        {
            // very simple, just to verify that we do see correct token type
            ((TestBean) bean).markUnknown(propertyName+":"+jp.getCurrentToken().toString());
            // Yup, we are good to go; must skip whatever value we'd have:
            jp.skipChildren();
            return true;
        }
    }

    @JsonIgnoreProperties({"b", "c"})
    static class IgnoreSome
    {
        public int a, b;
        private String c, d;

        public IgnoreSome() { }

        public String c() { return c; }
        public void setC(String value) { c = value; }
        public String d() { return d; }
        public void setD(String value) { d = value; }
    }

    @JsonIgnoreProperties(ignoreUnknown=true)
    static class IgnoreUnknown {
        public int a;
    }

    @SuppressWarnings("serial")
    @JsonIgnoreProperties({"a", "d"})
    static class IgnoreMap extends HashMap<String,Object> { }

    static class ImplicitIgnores {
        @JsonIgnore public int a;
        @JsonIgnore public void setB(int b) { }
        public int c;
    }

    // // Ignored as per [JACKSON-787]

    static class XYZWrapper1 {
        @JsonIgnoreProperties({"x"})
        public YZ value;
    }

    static class YZ {
        public int y, z;
    }

    static class XYZWrapper2 {
        @JsonIgnoreProperties({"y"})
        public X value;
    }

    @JsonIgnoreProperties({"z"})
    static class X {
        public int x;
    }

    static class MapWithoutX {
        @JsonIgnoreProperties("x")
        public Map<String,Integer> values;
    }
    
    /*
    /**********************************************************
    /* Test methods
    /**********************************************************
     */

    private final ObjectMapper MAPPER = new ObjectMapper();
    
    /**
     * By default we should just get an exception if an unknown property
     * is encountered
     */
    

    /**
     * Test that verifies that it is possible to ignore unknown properties using
     * {@link DeserializationProblemHandler}.
     */
    

    /**
     * Test that verifies that it is possible to ignore unknown properties using
     * {@link DeserializationProblemHandler} and an ObjectReader.
     */
    

    /**
     * Test for checking that it is also possible to simply suppress
     * error reporting for unknown properties.
     */
    

    

    /// @since 1.4
    

    

    /**
     * Test that verifies that use of {@link JsonIgnore} will add implicit
     * skipping of matching properties.
     */
    

    

    

    
}

