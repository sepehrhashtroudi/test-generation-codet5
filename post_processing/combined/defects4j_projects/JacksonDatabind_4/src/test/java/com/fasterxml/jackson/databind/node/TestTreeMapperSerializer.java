package com.fasterxml.jackson.databind.node;

import static org.junit.Assert.*;

import java.io.*;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.test.BaseTest;

/**
 * This unit test suite tries to verify that the trees ObjectMapper
 * constructs can be serialized properly.
 */
public class TestTreeMapperSerializer
    extends BaseTest
{
    final static String FIELD1 = "first";
    final static String FIELD2 = "Second?";
    final static String FIELD3 = "foo'n \"bar\"";
    final static String FIELD4 = "4";

    final static String TEXT1 = "Some text & \"stuff\"";
    final static String TEXT2 = "Some more text:\twith\nlinefeeds and all!";

    final static double DOUBLE_VALUE = 9.25;

    

    

    /**
     * Unit test to check for regression of [JACKSON-18].
     */
    

    

    

    /*
    ///////////////////////////////////////////////////////////////
    // Internal methods
    ///////////////////////////////////////////////////////////////
     */

    private void verifyFromArray(String input)
        throws Exception
    {
        JsonParser jp = new JsonFactory().createParser(new StringReader(input));
        
        assertEquals(JsonToken.START_ARRAY, jp.nextToken());
        
        assertEquals(JsonToken.VALUE_STRING, jp.nextToken());
        assertEquals(TEXT1, getAndVerifyText(jp));
        
        assertEquals(JsonToken.VALUE_NUMBER_INT, jp.nextToken());
        assertEquals(3, jp.getIntValue());
        
        assertEquals(JsonToken.START_OBJECT, jp.nextToken());
        assertEquals(JsonToken.FIELD_NAME, jp.nextToken());
        assertEquals(FIELD1, getAndVerifyText(jp));
        
        assertEquals(JsonToken.VALUE_TRUE, jp.nextToken());
        assertEquals(JsonToken.FIELD_NAME, jp.nextToken());
        assertEquals(FIELD2, getAndVerifyText(jp));
        
        assertEquals(JsonToken.START_ARRAY, jp.nextToken());
        assertEquals(JsonToken.END_ARRAY, jp.nextToken());
        assertEquals(JsonToken.END_OBJECT, jp.nextToken());
        
        assertEquals(JsonToken.VALUE_FALSE, jp.nextToken());
        
        assertEquals(JsonToken.END_ARRAY, jp.nextToken());
        assertNull(jp.nextToken());
    }

    private void verifyFromMap(String input)
        throws Exception
    {
        JsonParser jp = new JsonFactory().createParser(new StringReader(input));
        assertEquals(JsonToken.START_OBJECT, jp.nextToken());
        assertEquals(JsonToken.FIELD_NAME, jp.nextToken());
        assertEquals(FIELD4, getAndVerifyText(jp));
        assertEquals(JsonToken.VALUE_STRING, jp.nextToken());
        assertEquals(TEXT2, getAndVerifyText(jp));
        
        assertEquals(JsonToken.FIELD_NAME, jp.nextToken());
        assertEquals(FIELD3, getAndVerifyText(jp));
        assertEquals(JsonToken.VALUE_NUMBER_INT, jp.nextToken());
        assertEquals(-1, jp.getIntValue());
        
        assertEquals(JsonToken.FIELD_NAME, jp.nextToken());
        assertEquals(FIELD2, getAndVerifyText(jp));
        assertEquals(JsonToken.START_ARRAY, jp.nextToken());
        assertEquals(JsonToken.END_ARRAY, jp.nextToken());
        
        assertEquals(JsonToken.FIELD_NAME, jp.nextToken());
        assertEquals(FIELD1, getAndVerifyText(jp));
        assertEquals(JsonToken.VALUE_NUMBER_FLOAT, jp.nextToken());
        assertEquals(DOUBLE_VALUE, jp.getDoubleValue(), 0);
        
        assertEquals(JsonToken.END_OBJECT, jp.nextToken());
        
        assertNull(jp.nextToken());
    }
}
