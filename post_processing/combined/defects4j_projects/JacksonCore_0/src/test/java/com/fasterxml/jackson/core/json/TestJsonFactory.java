package com.fasterxml.jackson.core.json;

import java.io.*;

import com.fasterxml.jackson.core.*;

public class TestJsonFactory
    extends com.fasterxml.jackson.test.BaseTest
{
public void testParserFeatures57() throws Exception { 
     JsonFactory f = new JsonFactory(); 
     assertNull(f.getCodec()); 
     f.configure(JsonFactory.Feature.INTERN_FIELD_NAMES, true); 
     assertTrue(f.isEnabled(JsonFactory.Feature.INTERN_FIELD_NAMES)); 
     f.configure(JsonFactory.Feature.INTERN_FIELD_NAMES, false); 
     assertFalse(f.isEnabled(JsonFactory.Feature.INTERN_FIELD_NAMES)); 
 }
    

    
    
    

    // #72
    
}

