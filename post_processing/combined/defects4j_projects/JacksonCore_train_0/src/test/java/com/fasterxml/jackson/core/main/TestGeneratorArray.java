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

public void testEmptyArrayWrite100() throws Exception { 
     StringWriter sw = new StringWriter(); 
     JsonGenerator gen = new JsonFactory().createGenerator(sw); 
     JsonStreamContext ctxt = gen.getOutputContext(); 
     assertTrue(ctxt.inRoot()); 
     assertFalse(ctxt.inArray()); 
     assertFalse(ctxt.inObject()); 
     assertEquals(0, ctxt.getEntryCount()); 
     assertEquals(0, ctxt.getCurrentIndex()); 
     gen.writeStartArray(); 
     ctxt = gen.getOutputContext(); 
     assertFalse(ctxt.inRoot()); 
     assertTrue(ctxt.inArray()); 
     assertFalse(ctxt.inObject()); 
     assertEquals(0, ctxt.getEntryCount()); 
     assertEquals(0, ctxt.getCurrentIndex()); 
     gen.writeEndArray(); 
     ctxt = gen.getOutputContext(); 
     assertTrue("Should be in root, was " + ctxt.getTypeDesc(), ctxt.inRoot()); 
     assertFalse(ctxt.inArray()); 
     assertFalse(ctxt.inObject()); 
     assertEquals(1, ctxt.getEntryCount()); 
     assertEquals(0, ctxt.getCurrentIndex()); 
     gen.close(); 
     String docStr = sw.toString(); 
     JsonParser jp = createParserUsingReader(docStr); 
     assertEquals(JsonToken.START_ARRAY, jp.nextToken()); 
     assertEquals(JsonToken.END_ARRAY, jp.nextToken()); 
     jp.close(); 
     sw = new StringWriter(); 
     gen = new JsonFactory().createGenerator(sw); 
     gen.writeStartArray(); 
     gen.writeStartArray(); 
     gen.writeEndArray(); 
     gen.writeEndArray(); 
     gen.close(); 
     docStr = sw.toString(); 
     jp = createParserUsingReader(docStr); 
     assertEquals(JsonToken.START_ARRAY, jp.nextToken()); 
     assertEquals(JsonToken.START_ARRAY, jp.nextToken()); 
     assertEquals(JsonToken.END_ARRAY, jp.nextToken()); 
     assertEquals(JsonToken.END_ARRAY, jp.nextToken()); 
     assertEquals(null, jp.nextToken()); 
     jp.close(); 
 } 

    

    

    
}
