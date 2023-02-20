package com.fasterxml.jackson.core.util;

import java.io.*;

import com.fasterxml.jackson.core.*;

public class TestDelegates extends com.fasterxml.jackson.test.BaseTest
{
    /**
     * Test default, non-overridden parser delegate.
     */
public void testIsClosed12() throws IOException { 
     JsonFactory jf = new JsonFactory(); 
     for (int i = 0; i < 2; ++i) { 
         boolean stream = ((i & 1) == 0); 
         JsonGenerator jg = stream ? jf.createGenerator(new StringWriter()) : jf.createGenerator(new ByteArrayOutputStream(), JsonEncoding.UTF8); 
         assertFalse(jg.isClosed()); 
         jg.writeStartArray(); 
         jg.writeNumber(-1); 
         jg.writeEndArray(); 
         assertFalse(jg.isClosed()); 
         jg.close(); 
         assertTrue(jg.isClosed()); 
         jg.close(); 
         assertTrue(jg.isClosed()); 
     } 
 }
public void testInvalidBooleanAccess48() throws Exception { 
     JsonParser jp = createParserUsingReader("[ \"abc\" ]"); 
     assertToken(JsonToken.START_ARRAY, jp.nextToken()); 
     try { 
         jp.getBooleanValue(); 
         fail("Expected error trying to call getBooleanValue on non-boolean value"); 
     } catch (JsonParseException e) { 
         verifyException(e, "not of boolean type"); 
     } 
     jp.close(); 
 }
    

    /**
     * Test default, non-overridden generator delegate.
     */
    
}
