package com.fasterxml.jackson.databind.deser;

import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URL;
import java.net.URI;
import java.util.*;

import org.junit.Assert;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.util.TokenBuffer;

/**
 * Unit tests for verifying handling of simple basic non-structured
 * types; primitives (and/or their wrappers), Strings.
 */
public class TestSimpleTypes
    extends BaseMapTest
{
    final static String NAN_STRING = "NaN";

    final static class BooleanBean {
        boolean _v;
        void setV(boolean v) { _v = v; }
    }

    static class IntBean {
        int _v;
        void setV(int v) { _v = v; }
    }

    final static class DoubleBean {
        double _v;
        void setV(double v) { _v = v; }
    }

    final static class FloatBean {
        float _v;
        void setV(float v) { _v = v; }
    }

    /**
     * Also, let's ensure that it's ok to override methods.
     */
    static class IntBean2
        extends IntBean
    {
        @Override
        void setV(int v2) { super.setV(v2+1); }
    }

    /*
    /**********************************************************
    /* Then tests for primitives
    /**********************************************************
     */

    private final ObjectMapper MAPPER = new ObjectMapper();

public void testURL174() throws Exception { 
     URL value = new URL("http://foo.com"); 
     assertEquals(value, MAPPER.readValue("\"" + value.toString() + "\"", URL.class)); 
 }
public void testURL176() throws Exception { 
     URI value = new URI("http://foo.com"); 
     assertEquals(value, MAPPER.readValue("\"" + value.toString() + "\"", URI.class)); 
 }
    

    

    

    
    
    
    
    /**
     * Beyond simple case, let's also ensure that method overriding works as
     * expected.
     */
    

    /*
    /**********************************************************
    /* Then tests for wrappers
    /**********************************************************
     */

    /**
     * Simple unit test to verify that we can map boolean values to
     * java.lang.Boolean.
     */
    

    

    

    

    

    

    /* Note: dealing with floating-point values is tricky; not sure if
     * we can really use equality tests here... JDK does have decent
     * conversions though, to retain accuracy and round-trippability.
     * But still...
     */
    

    

    // as per [Issue#42], allow Base64 variant use as well
        
    /*
    /**********************************************************
    /* Simple non-primitive types
    /**********************************************************
     */

    

    

    

    

    

    

    

    

    /*
    /**********************************************************
    /* Sequence tests
    /**********************************************************
     */

    /**
     * Then a unit test to verify that we can conveniently bind sequence of
     * space-separate simple values
     */
    
}

