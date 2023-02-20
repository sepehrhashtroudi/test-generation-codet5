package com.fasterxml.jackson.core.main;

import com.fasterxml.jackson.core.*;

import java.io.*;

/**
 * Set of basic unit tests for verifying that the Array write methods
 * of {@link JsonGenerator} work as expected.
 */
public class TestGeneratorArray
    extends com.fasterxml.jackson.test.BaseTest
{
public void testInvalidObjectWrite45() throws Exception { 
     StringWriter sw = new StringWriter(); 
     JsonGenerator gen = new JsonFactory().createGenerator(sw); 
     gen.writeStartObject(); 
     try { 
         gen.writeEndArray(); 
         fail("Expected an exception for mismatched array/object write"); 
     } catch (JsonGenerationException e) { 
         verifyException(e, "Current context not an array"); 
     } 
     gen.close(); 
 }
    

    

    
}
