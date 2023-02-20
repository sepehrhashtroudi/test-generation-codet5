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

public void testCopyObjectTokens95() throws IOException { 
     JsonFactory jf = new JsonFactory(); 
     final String DOC = "{ \"a\":1, \"b\":[{ \"c\" : null }] }"; 
     JsonParser jp = jf.createParser(new StringReader(DOC)); 
     StringWriter sw = new StringWriter(); 
     JsonGenerator gen = jf.createGenerator(sw); 
     assertToken(JsonToken.START_OBJECT, jp.nextToken()); 
     gen.copyCurrentStructure(jp); 
     assertToken(JsonToken.END_OBJECT, jp.getCurrentToken()); 
     jp.close(); 
     gen.close(); 
     assertEquals("{\"a\":1,\"b\":[{\"c\":null}]}", sw.toString()); 
 } 

    

    

    
}
