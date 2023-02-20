package com.fasterxml.jackson.databind.util;

import java.io.*;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.util.JsonParserSequence;

public class TestTokenBuffer extends com.fasterxml.jackson.test.BaseTest
{
    /*
    /**********************************************************
    /* Basic TokenBuffer tests
    /**********************************************************
     */
    
    /**
     * Test writing of individual simple values
     */
public void testWithJSONSampleDoc136() throws Exception { 
     JsonParser jp = createParserUsingReader(SAMPLE_DOC_JSON_SPEC); 
     TokenBuffer tb = new TokenBuffer(null); 
     while (jp.nextToken() != null) { 
         tb.copyCurrentEvent(jp); 
     } 
     verifyJsonSpecSampleDoc(tb.asParser(), false); 
     verifyJsonSpecSampleDoc(tb.asParser(), true); 
     tb.close(); 
 }
    

    

    

    /**
     * Verify handling of that "standard" test document (from JSON
     * specification)
     */
    

    
    
    /*
    /**********************************************************
    /* Tests to verify interaction of TokenBuffer and JsonParserSequence
    /**********************************************************
     */
    
    
    
    /**
     * Test to verify that TokenBuffer and JsonParserSequence work together
     * as expected.
     */
        
}
