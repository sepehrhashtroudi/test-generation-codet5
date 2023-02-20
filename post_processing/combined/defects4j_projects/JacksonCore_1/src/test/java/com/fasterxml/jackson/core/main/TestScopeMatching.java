package com.fasterxml.jackson.core.main;


import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.test.BaseTest;

/**
 * Set of basic unit tests for verifying that Array/Object scopes
 * are properly matched.
 */
public class TestScopeMatching
    extends BaseTest
{
public void testMismatchArrayToObject31() throws Exception { 
     final String JSON = "[ 1, 2 }"; 
     for (int i = 0; i < 2; ++i) { 
         JsonParser jp = (i == 0) ? createParserUsingReader(JSON) : createParserUsingStream(JSON, "UTF-8"); 
         assertToken(JsonToken.START_ARRAY, jp.nextToken()); 
         assertToken(JsonToken.VALUE_NUMBER_INT, jp.nextToken()); 
         assertToken(JsonToken.VALUE_NUMBER_INT, jp.nextToken()); 
         try { 
             jp.nextToken(); 
             fail("Expected an exception for incorrectly closed ARRAY"); 
         } catch (JsonParseException jpe) { 
             verifyException(jpe, "Unexpected close marker '}': expected ']'"); 
         } 
         jp.close(); 
     } 
 }
    

    

    

    

    

    

    
}
