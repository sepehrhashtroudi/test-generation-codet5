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
public void testAtomicBoolean248() throws Exception { 
     ObjectMapper mapper = new ObjectMapper(); 
     AtomicBoolean b = mapper.readValue("true", AtomicBoolean.class); 
     assertTrue(b.get()); 
 }
public void testAtomicInteger249() throws Exception { 
     ObjectMapper mapper = new ObjectMapper(); 
     assertEquals("0", serializeAsString(mapper, new AtomicInteger(0))); 
 }
    

    

    

    
}
