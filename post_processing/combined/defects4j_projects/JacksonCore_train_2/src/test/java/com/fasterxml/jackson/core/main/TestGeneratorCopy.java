package com.fasterxml.jackson.core.main;


import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.test.BaseTest;

import java.io.*;

/**
 * Set of basic unit tests for verifying that copy-through methods
 * of {@link JsonGenerator} work as expected.
 */
public class TestGeneratorCopy
    extends BaseTest
{

public void testCopyRootTokens13() throws IOException { 
     JsonFactory jf = new JsonFactory(); 
     final String DOC = "\"text\\non two lines\" true false 2.0"; 
     JsonParser jp = jf.createParser(new StringReader(DOC)); 
     StringWriter sw = new StringWriter(); 
     JsonGenerator gen = jf.createGenerator(sw); 
     JsonToken t; 
     while ((t = jp.nextToken()) != null) { 
         gen.copyCurrentEvent(jp); 
         assertToken(t, jp.getCurrentToken()); 
     } 
     jp.close(); 
     gen.close(); 
     assertEquals("\"text\\non two lines\" true false 2.0", sw.toString()); 
 } 


public void testCopyArrayTokens95() throws IOException { 
     JsonFactory jf = new JsonFactory(); 
     final String DOC = "123 [ 1, null, [ false ] ]"; 
     JsonParser jp = jf.createParser(new StringReader(DOC)); 
     StringWriter sw = new StringWriter(); 
     JsonGenerator gen = jf.createGenerator(sw); 
     assertToken(JsonToken.VALUE_NUMBER_INT, jp.nextToken()); 
     gen.copyCurrentEvent(jp); 
     assertToken(JsonToken.VALUE_NUMBER_INT, jp.getCurrentToken()); 
     assertEquals(123, jp.getIntValue()); 
     assertToken(JsonToken.START_ARRAY, jp.nextToken()); 
     gen.copyCurrentStructure(jp); 
     assertToken(JsonToken.END_ARRAY, jp.getCurrentToken()); 
     jp.close(); 
     gen.close(); 
     assertEquals("123 [1,null,[false]]", sw.toString()); 
 } 

    

    

    
}
