package com.fasterxml.jackson.databind.deser;

import java.util.concurrent.atomic.*;

import com.fasterxml.jackson.databind.ObjectMapper;

public class TestSimpleAtomicTypes
    extends com.fasterxml.jackson.databind.BaseMapTest
{
public void testAtomicReference140() throws Exception { 
     ObjectMapper mapper = new ObjectMapper(); 
     String[] strs = new String[] { "abc" }; 
     assertEquals("[\"abc\"]", serializeAsString(mapper, new AtomicReference<String[]>(strs))); 
 }
    

    

    

    
}
