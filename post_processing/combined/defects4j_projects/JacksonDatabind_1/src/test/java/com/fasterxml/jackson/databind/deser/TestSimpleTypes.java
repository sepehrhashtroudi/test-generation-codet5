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

public void testFloatWrapper150() throws Exception { 
     String[] STRS = new String[] { "1.0", "0.0", "-0.3", "0.7", "42.012", "-999.0", NAN_STRING }; 
     for (String str : STRS) { 
         Float exp = Float.valueOf(str); 
         Float result; 
         if (NAN_STRING != str) { 
             result = MAPPER.readValue(new StringReader(str), Float.class); 
             assertEquals(exp, result); 
         } 
         result = MAPPER.readValue(new StringReader(" \"" + str + "\""), Float.class); 
         assertEquals(exp, result); 
     } 
 }
public void testFloatInf151() throws Exception { 
     ObjectMapper m = new ObjectMapper(); 
     Float result = m.readValue(" \"" + Float.POSITIVE_INFINITY + "\"", Float.class); 
     assertEquals(Float.valueOf(Float.POSITIVE_INFINITY), result); 
 }
public void testFloatPrimitiveNonNumeric152() throws Exception { 
     double value = Double.POSITIVE_INFINITY; 
     FloatBean result = MAPPER.readValue(new StringReader("{\"v\":\"" + value + "\"}"), FloatBean.class); 
     assertEquals(value, result._v); 
     double[] array = MAPPER.readValue(new StringReader("[ \"Infinity\" ]"), double[].class); 
     assertNotNull(array); 
     assertEquals(1, array.length); 
     assertEquals(Double.POSITIVE_INFINITY, array[0]); 
 }
public void testURI156() throws Exception { 
     URI value = new URI("http://foo.com"); 
     assertEquals(value, MAPPER.readValue("\"" + value.toString() + "\"", URI.class)); 
     TokenBuffer buf = new TokenBuffer(null); 
     buf.writeObject(null); 
     assertNull(MAPPER.readValue(buf.asParser(), URI.class)); 
     buf.close(); 
     buf = new TokenBuffer(null); 
     buf.writeObject(value); 
     assertSame(value, MAPPER.readValue(buf.asParser(), URI.class)); 
     buf.close(); 
 }
public void testFloatArray186() throws Exception { 
     final int LEN = 7000; 
     StringBuilder sb = new StringBuilder(); 
     sb.append('['); 
     for (int i = 0; i < LEN; ++i) { 
         if (i > 0) { 
             sb.append(','); 
         } 
         sb.append(i).append('.').append(i % 10); 
     } 
     sb.append(']'); 
     float[] result = MAPPER.readValue(sb.toString(), float[].class); 
     assertNotNull(result); 
     assertEquals(LEN, result.length); 
     for (int i = 0; i < LEN; ++i) { 
         String expStr = String.valueOf(i) + "." + String.valueOf(i % 10); 
         assertEquals(expStr, String.valueOf(result[i])); 
     } 
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

