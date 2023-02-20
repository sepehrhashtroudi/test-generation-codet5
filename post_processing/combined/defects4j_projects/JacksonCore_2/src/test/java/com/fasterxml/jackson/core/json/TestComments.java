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
public void testCommentsEnabled28() throws Exception { 
     _testEnabled(DOC_WITH_SLASHSTAR_COMMENT, false); 
     _testEnabled(DOC_WITH_SLASHSLASH_COMMENT, false); 
     _testEnabled(DOC_WITH_SLASHSTAR_COMMENT, true); 
     _testEnabled(DOC_WITH_SLASHSLASH_COMMENT, true); 
 }
public void testParserFeatures67() throws Exception { 
     JsonFactory f = new JsonFactory(); 
     assertNull(f.getCodec()); 
     f.configure(JsonFactory.Feature.INTERN_FIELD_NAMES, true); 
     assertTrue(f.isEnabled(JsonFactory.Feature.INTERN_FIELD_NAMES)); 
     f.configure(JsonFactory.Feature.INTERN_FIELD_NAMES, false); 
     assertFalse(f.isEnabled(JsonFactory.Feature.INTERN_FIELD_NAMES)); 
 }
public void testCopy68() throws Exception { 
     JsonFactory jf = new JsonFactory(); 
     assertTrue(jf.isEnabled(JsonFactory.Feature.INTERN_FIELD_NAMES)); 
     assertFalse(jf.isEnabled(JsonParser.Feature.ALLOW_COMMENTS)); 
     assertFalse(jf.isEnabled(JsonGenerator.Feature.ESCAPE_NON_ASCII)); 
     jf.disable(JsonFactory.Feature.INTERN_FIELD_NAMES); 
     jf.enable(JsonParser.Feature.ALLOW_COMMENTS); 
     jf.enable(JsonGenerator.Feature.ESCAPE_NON_ASCII); 
     assertFalse(jf.isEnabled(JsonFactory.Feature.INTERN_FIELD_NAMES)); 
     assertTrue(jf.isEnabled(JsonParser.Feature.ALLOW_COMMENTS)); 
     assertTrue(jf.isEnabled(JsonGenerator.Feature.ESCAPE_NON_ASCII)); 
     JsonFactory jf2 = jf.copy(); 
     assertFalse(jf2.isEnabled(JsonFactory.Feature.INTERN_FIELD_NAMES)); 
     assertTrue(jf.isEnabled(JsonParser.Feature.ALLOW_COMMENTS)); 
     assertTrue(jf.isEnabled(JsonGenerator.Feature.ESCAPE_NON_ASCII)); 
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
