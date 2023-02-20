package com.fasterxml.jackson.core.main;


import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.test.BaseTest;

import java.io.IOException;

/**
 * Set of basic unit tests for verifying that the basic parser
 * functionality works as expected.
 */
public class TestParserLinefeeds
    extends BaseTest
{
public void testParserDelegate57() throws IOException { 
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
    

    

    

    /*
    /**********************************************************
    /* Helper methods
    /**********************************************************
     */

    private void _testLinefeeds(String lf, boolean useStream)
        throws IOException
    {
        String DOC = "[1,@2,@-178@]";
        DOC = DOC.replaceAll("@", lf);

        JsonParser jp = useStream ?
            createParserUsingStream(DOC, "UTF-8")
            : createParserUsingReader(DOC);
            
        assertToken(JsonToken.START_ARRAY, jp.nextToken());
        assertEquals(1, jp.getCurrentLocation().getLineNr());
        
        assertToken(JsonToken.VALUE_NUMBER_INT, jp.nextToken());
        assertEquals(1, jp.getIntValue());
        assertEquals(1, jp.getCurrentLocation().getLineNr());

        assertToken(JsonToken.VALUE_NUMBER_INT, jp.nextToken());
        assertEquals(2, jp.getIntValue());
        assertEquals(2, jp.getCurrentLocation().getLineNr());

        assertToken(JsonToken.VALUE_NUMBER_INT, jp.nextToken());
        assertEquals(-178, jp.getIntValue());
        assertEquals(3, jp.getCurrentLocation().getLineNr());
        
        assertToken(JsonToken.END_ARRAY, jp.nextToken());
        assertEquals(4, jp.getCurrentLocation().getLineNr());

        jp.close();
    }
}
