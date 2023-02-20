package com.fasterxml.jackson.core.json;

import java.io.*;

import com.fasterxml.jackson.core.*;

/**
 * Unit tests for verifying that support for (non-standard) comments
 * works as expected.
 */
public class TestComments
    extends com.fasterxml.jackson.test.BaseTest
{
    final static String DOC_WITH_SLASHSTAR_COMMENT =
        "[ /* comment:\n ends here */ 1 /* one more ok to have \"unquoted\"  */ ]"
        ;

    final static String DOC_WITH_SLASHSLASH_COMMENT =
        "[ // comment...\n 1 \r  // one more, not array: []   \n ]"
        ;

    /*
    /**********************************************************
    /* Test method wrappers
    /**********************************************************
     */
    
    /**
     * Unit test for verifying that by default comments are not
     * recognized.
     */
public void testCommentsWithUTF818() throws Exception { 
     final String JSON = "[ 1, 3, [ true, null ], 3, { \"a\":\"b\" }, [ [ ] ], { } ]"; 
     for (int i = 0; i < 2; ++i) { 
         JsonParser jp = (i == 0) ? createParserUsingReader(JSON) : createParserUsingStream(JSON, "UTF-8"); 
         assertToken(JsonToken.START_ARRAY, jp.nextToken()); 
         assertToken(JsonToken.VALUE_NUMBER_INT, jp.nextToken()); 
         assertEquals(1, jp.getIntValue()); 
         assertToken(JsonToken.VALUE_TRUE, jp.nextToken()); 
         assertToken(JsonToken.END_ARRAY, jp.nextToken()); 
         jp.close(); 
     JsonParser jp2 = createParserUsingReader(JSON); 
         assertToken(JsonToken.START_ARRAY, jp2.nextToken()); 
         assertToken(JsonToken.VALUE_NUMBER_INT, jp2.nextToken()); 
         assertToken(JsonToken.END_ARRAY, jp2.nextToken()); 
         jp.close(); 
     } 
 }
public void testCommentsWithUTF820() throws Exception { 
     final String JSON = "/* \u00a9 2099 Yoyodyne Inc. */\n [ \"bar? \u00a9\" ]\n"; 
     _testWithUTF8Chars(JSON, false); 
     _testWithUTF8Chars(JSON, true); 
 }
public void testCommentsWithEOF39() throws Exception { 
     final String JSON = "[ nil ]"; 
     for (int i = 0; i < 2; ++i) { 
         JsonParser jp = (i == 0) ? createParserUsingReader(JSON) : createParserUsingStream(JSON, "UTF-8"); 
         assertToken(JsonToken.START_ARRAY, jp.nextToken()); 
         try { 
             jp.nextToken(); 
             fail("Expected an exception for EOF"); 
         } catch (EOFException e) { 
             verifyException(e, "was expecting either * for a comment"); 
         } 
         jp.close(); 
     } 
 }
public void testCommentsWithEOF40() throws Exception { 
     final String JSON = "[ 1, 3, [ true, null ], 3, { \"a\":\"b\" }, [ [ ] ], { } ]"; 
     for (int i = 0; i < 2; ++i) { 
         JsonParser jp = (i == 0) ? createParserUsingReader(JSON) : createParserUsingStream(JSON, "UTF-8"); 
         assertToken(JsonToken.START_ARRAY, jp.nextToken()); 
         try { 
             jp.nextToken(); 
             fail("Expected an exception for EOF"); 
         } catch (JsonParseException jpe) { 
             verifyException(jpe, "Unexpected end-of-input"); 
         } 
         jp.close(); 
     } 
 }
public void testCommentsWithEOF41() throws Exception { 
     final String JSON = "[ 1, 3, [ true, null ], 3, { \"a\":\"b\" }, [ [ ] ], { } ]"; 
     for (int i = 0; i < 2; ++i) { 
         JsonParser jp; 
         if (i == 0) { 
             jp = createParserUsingReader(JSON); 
         } else { 
             jp = this.createParserUsingStream(JSON, "UTF-8"); 
         } 
         assertToken(JsonToken.START_ARRAY, jp.nextToken()); 
         assertToken(JsonToken.VALUE_NUMBER_INT, jp.nextToken()); 
         assertEquals(1, jp.getIntValue()); 
         assertToken(JsonToken.VALUE_TRUE, jp.nextToken()); 
         assertToken(JsonToken.END_ARRAY, jp.nextToken()); 
         jp.close(); 
         assertEquals(0, jp.getIntValue()); 
         assertToken(JsonToken.END_ARRAY, jp.nextToken()); 
         jp.close(); 
     } 
 }
public void testCommentsWithUTF842() throws Exception { 
     final String JSON = "[ 1, 3, [ true, null ], 3, { \"a\":\"b\" }, [ [ ] ], { } ]"; 
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
public void testCommentsWithEOF43() throws Exception { 
     final String JSON = "[ 1, 3, [ true, null ], 3, { \"a\":\"b\" }, [ [ ] ], { } ]"; 
     for (int i = 0; i < 2; ++i) { 
         JsonParser jp; 
         if (i == 0) { 
             jp = createParserUsingReader(JSON); 
         } else { 
             jp = this.createParserUsingStream(JSON, "UTF-8"); 
         } 
         assertToken(JsonToken.START_ARRAY, jp.nextToken()); 
         assertToken(JsonToken.VALUE_NUMBER_INT, jp.nextToken()); 
         assertEquals(1, jp.getIntValue()); 
         assertToken(JsonToken.VALUE_TRUE, jp.nextToken()); 
         assertToken(JsonToken.END_ARRAY, jp.nextToken()); 
         jp.close(); 
         assertEquals(0, jp.getIntValue()); 
         assertToken(JsonToken.END_ARRAY, jp.nextToken()); 
         assertToken(JsonToken.START_ARRAY, jp.nextToken()); 
         assertToken(JsonToken.VALUE_FALSE, jp.nextToken()); 
         assertToken(JsonToken.END_ARRAY, jp.nextToken()); 
         jp.close(); 
     } 
 }
    

    

    

    // for [JACKSON-779]
    
    
    /*
    /**********************************************************
    /* Helper methods
    /**********************************************************
     */

    private void _testWithUTF8Chars(String doc, boolean useStream) throws IOException
    {
        // should basically just stream through
        JsonParser jp = _createParser(doc, useStream, true);
        assertToken(JsonToken.VALUE_STRING, jp.nextToken());
        assertToken(JsonToken.END_ARRAY, jp.nextToken());
        assertNull(jp.nextToken());
        jp.close();
    }
    
    private void _testDisabled(String doc, boolean useStream) throws IOException
    {
        JsonParser jp = _createParser(doc, useStream, false);
        try {
            jp.nextToken();
            fail("Expected exception for unrecognized comment");
        } catch (JsonParseException je) {
            // Should have something denoting that user may want to enable 'ALLOW_COMMENTS'
            verifyException(je, "ALLOW_COMMENTS");
        }
        jp.close();
    }

    private void _testEnabled(String doc, boolean useStream)
        throws IOException
    {
        JsonParser jp = _createParser(doc, useStream, true);
        assertToken(JsonToken.VALUE_NUMBER_INT, jp.nextToken());
        assertEquals(1, jp.getIntValue());
        assertToken(JsonToken.END_ARRAY, jp.nextToken());
        jp.close();
    }

    private JsonParser _createParser(String doc, boolean useStream, boolean enabled)
        throws IOException
    {
        JsonFactory jf = new JsonFactory();
        jf.configure(JsonParser.Feature.ALLOW_COMMENTS, enabled);
        JsonParser jp = useStream ?
            jf.createParser(doc.getBytes("UTF-8"))
            : jf.createParser(doc);
        assertToken(JsonToken.START_ARRAY, jp.nextToken());
        return jp;
    }
}
