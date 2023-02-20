package com.fasterxml.jackson.core.main;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.test.BaseTest;

import java.io.*;
import java.math.BigDecimal;

/**
 * Set of basic unit tests for verifying that the Object write methods
 * of {@link JsonGenerator} work as expected.
 */
public class TestGeneratorObject
    extends BaseTest
{

public void testSimpleObjectWrite37() throws Exception { 
     StringWriter sw = new StringWriter(); 
     JsonGenerator gen = new JsonFactory().createGenerator(sw); 
     gen.writeStartObject(); 
     gen.writeFieldName("first"); 
     gen.writeNumber(-901); 
     gen.writeFieldName("sec"); 
     gen.writeBoolean(false); 
     gen.writeFieldName("3rd!"); 
     gen.writeString("yee-haw"); 
     gen.writeEndObject(); 
     gen.close(); 
     String docStr = sw.toString(); 
     JsonParser jp = createParserUsingReader(docStr); 
     assertEquals(JsonToken.START_OBJECT, jp.nextToken()); 
     assertEquals(JsonToken.FIELD_NAME, jp.nextToken()); 
     assertEquals("first", jp.getText()); 
     assertEquals(JsonToken.VALUE_NUMBER_INT, jp.nextToken()); 
     assertEquals(-901, jp.getIntValue()); 
     assertEquals(JsonToken.FIELD_NAME, jp.nextToken()); 
     assertEquals("sec", jp.getText()); 
     assertEquals(JsonToken.VALUE_FALSE, jp.nextToken()); 
     assertEquals(JsonToken.FIELD_NAME, jp.nextToken()); 
     assertEquals("3rd!", jp.getText()); 
     assertEquals(JsonToken.VALUE_STRING, jp.nextToken()); 
     assertEquals("yee-haw", jp.getText()); 
     assertEquals(JsonToken.END_OBJECT, jp.nextToken()); 
     assertEquals(null, jp.nextToken()); 
     jp.close(); 
 } 


public void testConvenienceMethodsWithNulls93() throws Exception { 
     StringWriter sw = new StringWriter(); 
     JsonGenerator gen = new JsonFactory().createGenerator(sw); 
     gen.writeStartObject(); 
     gen.writeStringField("str", null); 
     gen.writeNumberField("num", null); 
     gen.writeObjectField("obj", null); 
     gen.writeEndObject(); 
     gen.close(); 
     String docStr = sw.toString(); 
     JsonParser jp = createParserUsingReader(docStr); 
     assertEquals(JsonToken.START_OBJECT, jp.nextToken()); 
     assertEquals(JsonToken.FIELD_NAME, jp.nextToken()); 
     assertEquals("str", jp.getCurrentName()); 
     assertEquals(JsonToken.VALUE_NULL, jp.nextToken()); 
     assertEquals(JsonToken.FIELD_NAME, jp.nextToken()); 
     assertEquals("num", jp.getCurrentName()); 
     assertEquals(JsonToken.VALUE_NULL, jp.nextToken()); 
     assertEquals(JsonToken.FIELD_NAME, jp.nextToken()); 
     assertEquals("obj", jp.getCurrentName()); 
     assertEquals(JsonToken.VALUE_NULL, jp.nextToken()); 
     assertEquals(JsonToken.END_OBJECT, jp.nextToken()); 
     jp.close(); 
 } 

    

    

    

    /**
     * Methods to test functionality added for [JACKSON-26]
     */
    

    /**
     * Tests to cover [JACKSON-164]
     */
    
}
