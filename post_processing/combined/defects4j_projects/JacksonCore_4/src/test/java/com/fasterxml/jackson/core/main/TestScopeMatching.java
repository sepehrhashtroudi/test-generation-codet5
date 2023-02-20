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
public void testMismatchObjectToArray3() throws Exception { 
     final String JSON = "{ ]"; 
     for (int i = 0; i < 2; ++i) { 
         boolean useChars = (i == 0); 
         JsonParser jp = (i == 0) ? createParserUsingReader(JSON) : createParserUsingStream(JSON, "UTF-8"); 
         assertToken(JsonToken.START_OBJECT, jp.nextToken()); 
         try { 
             jp.nextToken(); 
             fail("Expected an exception for incorrectly closed OBJECT"); 
         } catch (JsonParseException jpe) { 
             verifyException(jpe, "Unexpected close marker ']': expected '}'"); 
         } 
         jp.close(); 
     } 
 }
public void testUnclosedArray4() throws Exception { 
     @SuppressWarnings("resource") 
     JsonParser jp = createParserUsingReader("[ 1, 2"); 
     assertToken(JsonToken.START_ARRAY, jp.nextToken()); 
     assertToken(JsonToken.VALUE_NUMBER_INT, jp.nextToken()); 
     assertToken(JsonToken.VALUE_NUMBER_INT, jp.nextToken()); 
     try { 
         jp.nextToken(); 
         fail("Expected an exception for unclosed ARRAY"); 
     } catch (JsonParseException jpe) { 
         verifyException(jpe, "expected close marker for ARRAY"); 
     } 
 }
public void testMismatchObjectToArray18() throws Exception { 
     final String JSON = "{ ]"; 
     for (int i = 0; i < 2; ++i) { 
         JsonParser jp = (i == 0) ? createParserUsingReader(JSON) : createParserUsingStream(JSON, "UTF-8"); 
         assertToken(JsonToken.START_OBJECT, jp.nextToken()); 
         try { 
             jp.nextToken(); 
             fail("Expected an exception for incorrectly closed OBJECT"); 
         } catch (JsonParseException jpe) { 
             verifyException(jpe, "Unexpected close marker ']': expected '}'"); 
         } 
         jp.close(); 
     } 
 }
    

    

    

    

    

    

    
}
