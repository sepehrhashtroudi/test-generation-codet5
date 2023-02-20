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
public void testSimpleObjectWrite9() throws Exception { 
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
public void testMismatchArrayToObject62() throws Exception { 
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
public void testFieldValueWrites70() throws Exception { 
     StringWriter sw = new StringWriter(); 
     JsonGenerator gen = new JsonFactory().createGenerator(sw); 
     gen.writeStartObject(); 
     gen.writeNumberField("long", 3L); 
     gen.writeNumberField("double", 0.25); 
     gen.writeNumberField("float", -0.25f); 
     gen.writeEndObject(); 
     gen.close(); 
     assertEquals("{\"long\":3,\"double\":0.25,\"float\":-0.25}", sw.toString().trim()); 
 }
public void testInvalid73() throws Exception { 
     String DOC = "[\"\\u41=A\"]"; 
     JsonParser jp = createParserUsingReader(DOC); 
     assertToken(JsonToken.START_ARRAY, jp.nextToken()); 
     try { 
         jp.nextToken(); 
         jp.getText(); 
         fail("Expected an exception for unclosed ARRAY"); 
     } catch (JsonParseException jpe) { 
         verifyException(jpe, "for character escape"); 
     } 
     jp.close(); 
 }
public void testConfigDefaults74() throws IOException { 
     JsonFactory jf = new JsonFactory(); 
     JsonGenerator jg = jf.createGenerator(new StringWriter()); 
     assertFalse(jg.isEnabled(JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS)); 
     assertFalse(jg.isEnabled(JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN)); 
     jg.close(); 
 }
    

    

    

    /**
     * Methods to test functionality added for [JACKSON-26]
     */
    

    /**
     * Tests to cover [JACKSON-164]
     */
    
}
