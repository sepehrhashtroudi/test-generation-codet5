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

public void testFloat79() throws Exception { 
     double[] values = new double[] { 0.0, 1.0, 0.1, -37.01, 999.99, 0.3, 33.3, Double.NaN, Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY }; 
     for (double d : values) { 
         float f = (float) d; 
         String expected = String.valueOf(f); 
         if (Float.isNaN(f) || Float.isInfinite(f)) { 
             expected = "\"" + expected + "\""; 
         } 
         assertEquals(expected, serializeAsString(MAPPER, Float.valueOf(f))); 
     } 
 }
public void testByteWrapper121() throws Exception { 
     Short result = MAPPER.readValue(new StringReader("37"), Short.class); 
     assertEquals(Short.valueOf((short) 37), result); 
     result = MAPPER.readValue(new StringReader(" \"-1009\""), Short.class); 
     assertEquals(Short.valueOf((short) -1009), result); 
     result = MAPPER.readValue(new StringReader("-12.9"), Short.class); 
     assertEquals(Short.valueOf((short) -12), result); 
 }
public void testFloatNaN123() throws Exception { 
     ObjectMapper m = new ObjectMapper(); 
     Float result = m.readValue(" \"NaN\"", Float.class); 
     assertEquals(Float.valueOf(Float.NaN), result); 
 }
public void testFloatPrimitiveNonNumeric124() throws Exception { 
     float value = Float.POSITIVE_INFINITY; 
     FloatBean result = MAPPER.readValue(new StringReader("{\"v\":\"" + value + "\"}"), FloatBean.class); 
     assertEquals(value, result._v); 
     float[] array = MAPPER.readValue(new StringReader("[ \"Infinity\" ]"), float[].class); 
     assertNotNull(array); 
     assertEquals(1, array.length); 
     assertEquals(Float.POSITIVE_INFINITY, array[0]); 
 }
public void testDoubleWrapper125() throws Exception { 
     String[] STRS = new String[] { "1.0", "0.0", "-0.3", "0.7", "42.012", "-999.0", NAN_STRING }; 
     for (String str : STRS) { 
         Double exp = Double.valueOf(str); 
         Double result; 
         if (NAN_STRING != str) { 
             result = MAPPER.readValue(new StringReader(str), Double.class); 
             assertEquals(exp, result); 
         } 
         result = MAPPER.readValue(new StringReader(" \"" + str + "\""), Double.class); 
         assertEquals(exp, result); 
     } 
 }
public void testDoubleArray126() throws Exception { 
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
     double[] result = MAPPER.readValue(sb.toString(), double[].class); 
     assertNotNull(result); 
     assertEquals(LEN, result.length); 
     for (int i = 0; i < LEN; ++i) { 
         String expStr = String.valueOf(i) + "." + String.valueOf(i % 10); 
         String actStr = String.valueOf(result[i]); 
         if (!expStr.equals(actStr)) { 
             fail("Entry #" + i + "/" + LEN + "; exp '" + expStr + "', got '" + actStr + "'"); 
         } 
     } 
 }
public void testDoublePrimitive127() throws Exception { 
     double value = 0.016; 
     DoubleBean result = MAPPER.readValue(new StringReader("{\"v\":" + value + "}"), DoubleBean.class); 
     assertEquals(value, result._v); 
     result = MAPPER.readValue(new StringReader("{\"v\":null}"), DoubleBean.class); 
     assertNotNull(result); 
     assertEquals(0.0, result._v); 
     double[] array = MAPPER.readValue(new StringReader("[ null ]"), double[].class); 
     assertNotNull(array); 
     assertEquals(1, array.length); 
     assertEquals(0.0, array[0]); 
 }
public void testEmptyAsNumber243() throws Exception { 
     ObjectMapper m = new ObjectMapper(); 
     assertNull(m.readValue(quote(""), Integer.class)); 
     assertNull(m.readValue(quote(""), Long.class)); 
     assertNull(m.readValue(quote(""), Float.class)); 
     assertNull(m.readValue(quote(""), Double.class)); 
     assertNull(m.readValue(quote(""), BigInteger.class)); 
     assertNull(m.readValue(quote(""), BigDecimal.class)); 
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

