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

public void testCommentsWithUTF863() throws Exception { 
     final String JSON = "/* \u00a9 2099 Yoyodyne Inc. */\n [ \"bar? \u00a9\" ]\n"; 
     _testWithUTF8Chars(JSON, false); 
     _testWithUTF8Chars(JSON, true); 
 } 


public void testCommentsDisabled66() throws Exception { 
     _testDisabled(DOC_WITH_SLASHSTAR_COMMENT, false); 
     _testDisabled(DOC_WITH_SLASHSLASH_COMMENT, false); 
     _testDisabled(DOC_WITH_SLASHSTAR_COMMENT, true); 
     _testDisabled(DOC_WITH_SLASHSLASH_COMMENT, true); 
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
