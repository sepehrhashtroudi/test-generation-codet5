package com.fasterxml.jackson.databind.ser;

import java.util.concurrent.atomic.*;


import com.fasterxml.jackson.databind.BaseMapTest;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Unit tests for verifying serialization of simple basic non-structured
 * types; primitives (and/or their wrappers), Strings.
 */
public class TestSimpleAtomicTypes
    extends BaseMapTest
{
public void testAtomicLong266() throws Exception { 
     ObjectMapper mapper = new ObjectMapper(); 
     assertEquals("1", serializeAsString(mapper, new AtomicInteger(1))); 
     assertEquals("-9", serializeAsString(mapper, new AtomicInteger(-9))); 
 }
    

    

    

    
}
