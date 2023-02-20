package com.fasterxml.jackson.core.main;

import java.io.*;

import com.fasterxml.jackson.core.*;

/**
 * Unit tests for verifying that object mapping functionality can
 * be accessed using JsonParser.
 */
public class TestParserWithObjects
    extends com.fasterxml.jackson.test.BaseTest
{

    /*
    /**********************************************************
    /* Test for simple traversal with data mapping
    /**********************************************************
     */


public void testNextValueNested129() throws IOException { 
     _testNextValueNested(false); 
     _testNextValueNested(true); 
 } 

    

    // [JACKSON-395]
    

    

    /*
    /**********************************************************
    /* Supporting methods
    /**********************************************************
     */

    private void  _testNextValueBasic(boolean useStream) throws IOException
    {
        // first array, no change to default
        JsonParser jp = _getParser("[ 1, 2, 3, 4 ]", useStream);
        assertToken(JsonToken.START_ARRAY, jp.nextValue());
        for (int i = 1; i <= 4; ++i) {
            assertToken(JsonToken.VALUE_NUMBER_INT, jp.nextValue());
            assertEquals(i, jp.getIntValue());
        }
        assertToken(JsonToken.END_ARRAY, jp.nextValue());
        assertNull(jp.nextValue());
        jp.close();

        // then Object, is different
        jp = _getParser("{ \"3\" :3, \"4\": 4, \"5\" : 5 }", useStream);
        assertToken(JsonToken.START_OBJECT, jp.nextValue());
        for (int i = 3; i <= 5; ++i) {
            assertToken(JsonToken.VALUE_NUMBER_INT, jp.nextValue());
            assertEquals(String.valueOf(i), jp.getCurrentName());
            assertEquals(i, jp.getIntValue());
        }
        assertToken(JsonToken.END_OBJECT, jp.nextValue());
        assertNull(jp.nextValue());
        jp.close();

        // and then mixed...
        jp = _getParser("[ true, [ ], { \"a\" : 3 } ]", useStream);

        assertToken(JsonToken.START_ARRAY, jp.nextValue());
        assertToken(JsonToken.VALUE_TRUE, jp.nextValue());
        assertToken(JsonToken.START_ARRAY, jp.nextValue());
        assertToken(JsonToken.END_ARRAY, jp.nextValue());

        assertToken(JsonToken.START_OBJECT, jp.nextValue());
        assertToken(JsonToken.VALUE_NUMBER_INT, jp.nextValue());
        assertEquals("a", jp.getCurrentName());
        assertToken(JsonToken.END_OBJECT, jp.nextValue());
        assertToken(JsonToken.END_ARRAY, jp.nextValue());

        assertNull(jp.nextValue());
        jp.close();
    }

    // [JACKSON-395]
    private void  _testNextValueNested(boolean useStream) throws IOException
    {
        // first array, no change to default
        JsonParser jp;
    
        // then object with sub-objects...
        jp = _getParser("{\"a\": { \"b\" : true, \"c\": false }, \"d\": 3 }", useStream);

        assertToken(JsonToken.START_OBJECT, jp.nextValue());
        assertNull(jp.getCurrentName());
        assertToken(JsonToken.START_OBJECT, jp.nextValue());
        assertEquals("a", jp.getCurrentName());
        assertToken(JsonToken.VALUE_TRUE, jp.nextValue());
        assertEquals("b", jp.getCurrentName());
        assertToken(JsonToken.VALUE_FALSE, jp.nextValue());
        assertEquals("c", jp.getCurrentName());
        assertToken(JsonToken.END_OBJECT, jp.nextValue());
        // ideally we should match closing marker with field, too:
        assertEquals("a", jp.getCurrentName());

        assertToken(JsonToken.VALUE_NUMBER_INT, jp.nextValue());
        assertEquals("d", jp.getCurrentName());
        assertToken(JsonToken.END_OBJECT, jp.nextValue());
        assertNull(jp.getCurrentName());
        assertNull(jp.nextValue());
        jp.close();

        // and arrays
        jp = _getParser("{\"a\": [ false ] }", useStream);

        assertToken(JsonToken.START_OBJECT, jp.nextValue());
        assertNull(jp.getCurrentName());
        assertToken(JsonToken.START_ARRAY, jp.nextValue());
        assertEquals("a", jp.getCurrentName());
        assertToken(JsonToken.VALUE_FALSE, jp.nextValue());
        assertNull(jp.getCurrentName());
        assertToken(JsonToken.END_ARRAY, jp.nextValue());
        // ideally we should match closing marker with field, too:
        assertEquals("a", jp.getCurrentName());
        assertToken(JsonToken.END_OBJECT, jp.nextValue());
        assertNull(jp.getCurrentName());
        assertNull(jp.nextValue());
        jp.close();
    }

    private JsonParser _getParser(String doc, boolean useStream)
        throws IOException
    {
        JsonFactory jf = new JsonFactory();
        if (useStream) {
            return jf.createParser(doc.getBytes("UTF-8"));
        }
        return jf.createParser(new StringReader(doc));
    }
}
