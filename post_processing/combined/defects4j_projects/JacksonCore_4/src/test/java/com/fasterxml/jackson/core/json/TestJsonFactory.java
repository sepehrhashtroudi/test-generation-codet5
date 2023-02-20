package com.fasterxml.jackson.core.json;

import java.io.*;

import com.fasterxml.jackson.core.*;

public class TestJsonFactory
    extends com.fasterxml.jackson.test.BaseTest
{
public void testGeneratorFeatures64() throws Exception { 
     JsonFactory f = new JsonFactory(); 
     assertNull(f.getCodec()); 
     f.configure(JsonGenerator.Feature.QUOTE_FIELD_NAMES, true); 
     assertTrue(f.isEnabled(JsonGenerator.Feature.QUOTE_FIELD_NAMES)); 
     f.configure(JsonGenerator.Feature.QUOTE_FIELD_NAMES, false); 
     assertFalse(f.isEnabled(JsonGenerator.Feature.QUOTE_FIELD_NAMES)); 
 }
    

    
    
    

    // #72
    
}

