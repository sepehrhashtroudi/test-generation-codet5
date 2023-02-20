package com.fasterxml.jackson.databind.ser;

import java.math.BigInteger;


import com.fasterxml.jackson.core.Base64Variants;
import com.fasterxml.jackson.databind.BaseMapTest;
import com.fasterxml.jackson.databind.ObjectMapper;

import static org.junit.Assert.*;

/**
 * Unit tests for verifying serialization of simple basic non-structured
 * types; primitives (and/or their wrappers), Strings.
 */
public class TestSimpleTypes
    extends BaseMapTest
{
    private final ObjectMapper MAPPER = new ObjectMapper();
    
    

    

    

    // as per [Issue#42], allow Base64 variant use as well
    
    
    

    

    /* Note: dealing with floating-point values is tricky; not sure if
     * we can really use equality tests here... JDK does have decent
     * conversions though, to retain accuracy and round-trippability.
     * But still...
     */
    

    

    
    
    
}
