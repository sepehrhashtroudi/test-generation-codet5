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

public void testDoubleArray152() throws Exception { 
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
public void testDoublePrimitiveNonNumeric153() throws Exception { 
     double value = Double.POSITIVE_INFINITY; 
     DoubleBean result = MAPPER.readValue(new StringReader("{\"v\":\"" + value + "\"}"), DoubleBean.class); 
     assertEquals(value, result._v); 
     double[] array = MAPPER.readValue(new StringReader("[ \"Infinity\" ]"), double[].class); 
     assertNotNull(array); 
     assertEquals(1, array.length); 
     assertEquals(Double.POSITIVE_INFINITY, array[0]); 
 }
public void testDoubleNaN154() throws Exception { 
     ObjectMapper m = new ObjectMapper(); 
     Double result = m.readValue(" \"NaN\"", Double.class); 
     assertEquals(Double.valueOf(Double.NaN), result); 
 }
public void testDoubleNaN155() throws Exception { 
     ObjectMapper m = new ObjectMapper(); 
     Double result = m.readValue(" \"" + Double.POSITIVE_INFINITY + "\"", Double.class); 
     assertEquals(Double.valueOf(Double.POSITIVE_INFINITY), result); 
     result = m.readValue(" \"" + Double.NEGATIVE_INFINITY + "\"", Double.class); 
     assertEquals(Double.valueOf(Double.NEGATIVE_INFINITY), result); 
 }
public void testDoubleWrapper156() throws Exception { 
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

