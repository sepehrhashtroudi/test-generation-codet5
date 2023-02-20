package com.fasterxml.jackson.databind.deser;

import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;


import com.fasterxml.jackson.databind.*;

/**
 * Unit tests for verifying handling of non-specific numeric types.
 */
public class TestGenericNumber
    extends BaseMapTest
{
public void testFpTypeOverrideStructured254() throws Exception { 
     ObjectMapper m = new ObjectMapper(); 
     BigDecimal dec = new BigDecimal("-19.37"); 
     m.enable(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS); 
     @SuppressWarnings("unchecked") 
     List<Object> list = (List<Object>) m.readValue("[ " + dec.toString() + " ]", List.class); 
     assertEquals(1, list.size()); 
     Object val = list.get(0); 
     assertEquals(BigDecimal.class, val.getClass()); 
     assertEquals(dec, val); 
     Map<?, ?> map = m.readValue("{ \"a\" : " + dec.toString() + " }", Map.class); 
     assertEquals(1, map.size()); 
     val = map.get("a"); 
     assertEquals(BigDecimal.class, val.getClass()); 
     assertEquals(dec, val); 
 }
    

    

    

    

    /**
     * Related to [JACKSON-72]: by default should wrap floating-point
     * Number as Double
     */
    

    /**
     * Test for verifying [JACKSON-72].
     */
    

	
}
