package com.fasterxml.jackson.core.json;

import java.io.*;

import com.fasterxml.jackson.core.*;

public class TestJsonFactory
    extends com.fasterxml.jackson.test.BaseTest
{

public void testJsonWithFiles80() throws Exception { 
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


public void testCopy130() throws Exception { 
     JsonFactory jf = new JsonFactory(); 
     assertTrue(jf.isEnabled(JsonFactory.Feature.INTERN_FIELD_NAMES)); 
     assertFalse(jf.isEnabled(JsonParser.Feature.ALLOW_COMMENTS)); 
     assertFalse(jf.isEnabled(JsonGenerator.Feature.ESCAPE_NON_ASCII)); 
     jf.disable(JsonFactory.Feature.INTERN_FIELD_NAMES); 
     jf.enable(JsonParser.Feature.ALLOW_COMMENTS); 
     jf.enable(JsonGenerator.Feature.ESCAPE_NON_ASCII); 
     assertFalse(jf.isEnabled(JsonFactory.Feature.INTERN_FIELD_NAMES)); 
     assertTrue(jf.isEnabled(JsonParser.Feature.ALLOW_COMMENTS)); 
     assertTrue(jf.isEnabled(JsonGenerator.Feature.ESCAPE_NON_ASCII)); 
     JsonFactory jf2 = jf.copy(); 
     assertFalse(jf2.isEnabled(JsonFactory.Feature.INTERN_FIELD_NAMES)); 
     assertTrue(jf.isEnabled(JsonParser.Feature.ALLOW_COMMENTS)); 
     assertTrue(jf.isEnabled(JsonGenerator.Feature.ESCAPE_NON_ASCII)); 
 } 


public void testParserFeatures131() throws Exception { 
     JsonFactory f = new JsonFactory(); 
     assertNull(f.getCodec()); 
     f.configure(JsonFactory.Feature.INTERN_FIELD_NAMES, true); 
     assertTrue(f.isEnabled(JsonFactory.Feature.INTERN_FIELD_NAMES)); 
     f.configure(JsonFactory.Feature.INTERN_FIELD_NAMES, false); 
     assertFalse(f.isEnabled(JsonFactory.Feature.INTERN_FIELD_NAMES)); 
 } 


public void testGeneratorFeatures133() throws Exception { 
     JsonFactory f = new JsonFactory(); 
     assertNull(f.getCodec()); 
     f.configure(JsonGenerator.Feature.QUOTE_FIELD_NAMES, true); 
     assertTrue(f.isEnabled(JsonGenerator.Feature.QUOTE_FIELD_NAMES)); 
     f.configure(JsonGenerator.Feature.QUOTE_FIELD_NAMES, false); 
     assertFalse(f.isEnabled(JsonGenerator.Feature.QUOTE_FIELD_NAMES)); 
 } 

    

    
    
    

    // #72
    
}

