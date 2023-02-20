package com.fasterxml.jackson.core.json;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

public class TestParserErrorHandling
    extends com.fasterxml.jackson.test.BaseTest
{

public void testMismatchArrayToObject46() throws Exception { 
     final String JSON = "[ 1, 2 }"; 
     for (int i = 0; i < 2; ++i) { 
         JsonParser jp = (i == 0) ? createParserUsingReader(JSON) : createParserUsingStream(JSON, "UTF-8"); 
         assertToken(JsonToken.START_ARRAY, jp.nextToken()); 
         assertToken(JsonToken.VALUE_NUMBER_INT, jp.nextToken()); 
         assertToken(JsonToken.VALUE_NUMBER_INT, jp.nextToken()); 
         assertToken(JsonToken.END_ARRAY, jp.nextToken()); 
         jp.close(); 
     } 
 }
public void testMismatchArrayToObject47() throws Exception { 
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
public void testWeirdToken58() throws Exception { 
     final String JSON = "[ nil ]"; 
     for (int i = 0; i < 2; ++i) { 
         JsonParser jp = (i == 0) ? createParserUsingReader(JSON) : createParserUsingStream(JSON, "UTF-8"); 
         assertToken(JsonToken.START_ARRAY, jp.nextToken()); 
         try { 
             jp.nextToken(); 
             fail("Expected an exception for weird token"); 
         } catch (JsonParseException jpe) { 
             verifyException(jpe, "Unrecognized token"); 
         } 
         jp.close(); 
     } 
 }
    
    
    

    /*
    /**********************************************************
    /* Helper methods
    /**********************************************************
     */
    
    private void _testInvalidKeywords(boolean useStream) throws Exception
    {
        doTestInvalidKeyword1(useStream, "nul");
        doTestInvalidKeyword1(useStream, "Null");
        doTestInvalidKeyword1(useStream, "nulla");
        doTestInvalidKeyword1(useStream, "fal");
        doTestInvalidKeyword1(useStream, "False");
        doTestInvalidKeyword1(useStream, "fals0");
        doTestInvalidKeyword1(useStream, "falsett0");
        doTestInvalidKeyword1(useStream, "tr");
        doTestInvalidKeyword1(useStream, "truE");
        doTestInvalidKeyword1(useStream, "treu");
        doTestInvalidKeyword1(useStream, "trueenough");
        doTestInvalidKeyword1(useStream, "C");
    }

    private void doTestInvalidKeyword1(boolean useStream, String value)
        throws IOException
    {
        final String doc = "{ \"key1\" : "+value+" }";
        JsonParser jp = useStream ? createParserUsingStream(doc, "UTF-8")
                : createParserUsingReader(doc);
        assertToken(JsonToken.START_OBJECT, jp.nextToken());
        /* 24-Nov-2008, tatu: Note that depending on parser impl, we may
         *   get the exception early or late...
         */
        try {
            assertToken(JsonToken.FIELD_NAME, jp.nextToken());
            jp.nextToken();
            fail("Expected an exception for malformed value keyword");
        } catch (JsonParseException jex) {
            verifyException(jex, "Unrecognized token");
            verifyException(jex, value);
        } finally {
            jp.close();
        }

        // Try as root-level value as well:
        jp = useStream ? createParserUsingStream(value, "UTF-8")
                : createParserUsingReader(value);
        try {
            jp.nextToken();
            fail("Expected an exception for malformed value keyword");
        } catch (JsonParseException jex) {
            verifyException(jex, "Unrecognized token");
            verifyException(jex, value);
        } finally {
            jp.close();
        }
    }
}
