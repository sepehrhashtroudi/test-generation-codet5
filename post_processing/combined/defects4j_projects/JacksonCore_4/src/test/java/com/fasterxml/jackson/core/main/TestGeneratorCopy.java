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
public void testCopyObjectTokens42() throws IOException { 
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
public void testCopyObjectTokens43() throws IOException { 
     JsonFactory jf = new JsonFactory(); 
     final String DOC = "{ \"a\":1, \"b\":[{ \"c\" : null }] }"; 
     JsonParser jp = jf.createParser(new StringReader(DOC)); 
     StringWriter sw = new StringWriter(); 
     JsonGenerator gen = jf.createGenerator(sw); 
     assertToken(JsonToken.START_OBJECT, jp.nextToken()); 
     gen.copyCurrentEvent(jp); 
     assertToken(JsonToken.END_OBJECT, jp.getCurrentToken()); 
     jp.close(); 
     gen.close(); 
     assertEquals("{\"a\":1,\"b\":[{\"c\":null}]}", sw.toString()); 
 }
public void testStringWrite59() throws Exception { 
     JsonFactory jf = new JsonFactory(); 
     String[] inputStrings = new String[] { "", "X", "1234567890" }; 
     for (int useReader = 0; useReader < 2; ++useReader) { 
         for (int writeString = 0; writeString < 2; ++writeString) { 
             for (int strIx = 0; strIx < inputStrings.length; ++strIx) { 
                 String input = inputStrings[strIx]; 
                 JsonGenerator gen; 
                 ByteArrayOutputStream bout = new ByteArrayOutputStream(); 
                 if (useReader != 0) { 
                     gen = jf.createGenerator(new OutputStreamWriter(bout, "UTF-8")); 
                 } else { 
                     gen = jf.createGenerator(bout, JsonEncoding.UTF8); 
                 } 
                 if (writeString > 0) { 
                     gen.writeString(input); 
                 } else { 
                     int len = input.length(); 
                     char[] buffer = new char[len + 20]; 
                     input.getChars(0, len, buffer, strIx); 
                     gen.writeString(buffer, strIx, len); 
                 } 
                 gen.flush(); 
                 gen.close(); 
                 JsonParser jp = jf.createParser(new ByteArrayInputStream(bout.toByteArray())); 
                 JsonToken t = jp.nextToken(); 
                 assertNotNull("Document \"" + bout.toString("UTF-8") + "\" yielded no tokens", t); 
                 assertEquals(JsonToken.VALUE_STRING, t); 
                 assertEquals(input, jp.getText()); 
                 assertEquals(null, jp.nextToken()); 
                 jp.close(); 
             } 
         } 
     } 
 }
    

    

    
}
