package com.fasterxml.jackson.core.util;

import java.io.*;

import com.fasterxml.jackson.core.*;

public class TestDelegates extends com.fasterxml.jackson.test.BaseTest
{
    /**
     * Test default, non-overridden parser delegate.
     */

public void testParserDelegate10() throws IOException { 
     JsonParser jp = new JsonFactory().createParser("[ 1, true ]"); 
     assertNull(jp.getCurrentToken()); 
     assertToken(JsonToken.START_ARRAY, jp.nextToken()); 
     assertEquals("[", jp.getText()); 
     assertToken(JsonToken.VALUE_NUMBER_INT, jp.nextToken()); 
     assertEquals(1, jp.getIntValue()); 
     assertToken(JsonToken.VALUE_TRUE, jp.nextToken()); 
     assertTrue(jp.getBooleanValue()); 
     assertToken(JsonToken.END_ARRAY, jp.nextToken()); 
     jp.close(); 
     assertTrue(jp.isClosed()); 
 } 

    

    /**
     * Test default, non-overridden generator delegate.
     */
    
}
