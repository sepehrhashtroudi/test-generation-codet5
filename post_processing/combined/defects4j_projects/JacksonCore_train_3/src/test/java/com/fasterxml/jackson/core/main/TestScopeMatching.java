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

public void testUnclosedArray14() throws Exception { 
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


public void testMismatchArrayToObject15() throws Exception { 
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


public void testMismatchObjectToArray53() throws Exception { 
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


public void testMisssingColon54() throws Exception { 
     final String JSON = "{ \"a\" \"b\" }"; 
     for (int i = 0; i < 2; ++i) { 
         JsonParser jp = (i == 0) ? createParserUsingReader(JSON) : createParserUsingStream(JSON, "UTF-8"); 
         assertToken(JsonToken.START_OBJECT, jp.nextToken()); 
         try { 
             assertToken(JsonToken.FIELD_NAME, jp.nextToken()); 
             jp.nextToken(); 
             fail("Expected an exception for missing semicolon"); 
         } catch (JsonParseException jpe) { 
             verifyException(jpe, "was expecting a colon"); 
         } 
         jp.close(); 
     } 
 } 

    

    

    

    

    

    

    
}
