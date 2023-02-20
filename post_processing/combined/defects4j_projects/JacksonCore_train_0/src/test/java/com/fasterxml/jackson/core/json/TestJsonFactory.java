package com.fasterxml.jackson.core.json;

import java.io.*;

import com.fasterxml.jackson.core.*;

public class TestJsonFactory
    extends com.fasterxml.jackson.test.BaseTest
{

public void testJsonWithFiles78() throws Exception { 
     File file = File.createTempFile("jackson-test", null); 
     file.deleteOnExit(); 
     JsonFactory f = new JsonFactory(); 
     JsonGenerator jg = f.createGenerator(file, JsonEncoding.UTF16_LE); 
     jg.writeStartObject(); 
     jg.writeRaw("   "); 
     jg.writeEndObject(); 
     jg.close(); 
     JsonParser jp = f.createParser(file); 
     assertToken(JsonToken.START_OBJECT, jp.nextToken()); 
     assertToken(JsonToken.END_OBJECT, jp.nextToken()); 
     assertNull(jp.nextToken()); 
     jp.close(); 
     jp = f.createParser(file.toURI().toURL()); 
     assertToken(JsonToken.START_OBJECT, jp.nextToken()); 
     assertToken(JsonToken.END_OBJECT, jp.nextToken()); 
     assertNull(jp.nextToken()); 
     jp.close(); 
     file.delete(); 
 } 


public void testParserFeatures132() throws Exception { 
     JsonFactory f = new JsonFactory(); 
     assertNull(f.getCodec()); 
     f.configure(JsonFactory.Feature.INTERN_FIELD_NAMES, true); 
     assertTrue(f.isEnabled(JsonFactory.Feature.INTERN_FIELD_NAMES)); 
     f.configure(JsonFactory.Feature.INTERN_FIELD_NAMES, false); 
     assertFalse(f.isEnabled(JsonFactory.Feature.INTERN_FIELD_NAMES)); 
 } 

    

    
    
    

    // #72
    
}

