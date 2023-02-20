package com.fasterxml.jackson.core.json;

import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;

import com.fasterxml.jackson.core.*;

/**
 * Set of basic unit tests for verifying that the basic generator
 * functionality works as expected.
 */
public class TestJsonGeneratorFeatures
    extends com.fasterxml.jackson.test.BaseTest
{
public void testStringWrite44() throws Exception { 
     JsonFactory jf = new JsonFactory(); 
     String[] inputStrings = new String[] { "", "X", "1234567890" }; 
     for (int useReader = 0; useReader < 2; ++useReader) { 
         for (int writeString = 0; writeString < 2; ++writeString) { 
             for (int strIx = 0; strIx < inputStrings.length; ++strIx) { 
                 String input = inputStrings[strIx]; 
                 JsonGenerator gen; 
                 ByteArrayOutputStream bout = new ByteArrayOutputStream(); 
                 if (useReader != 0) { 
                     gen = jf.createGenerator(new OutputStreamWriter(bout, "UTF-8")); 
                 } else { 
                     gen = jf.createGenerator(bout, JsonEncoding.UTF8); 
                 } 
                 if (writeString > 0) { 
                     gen.writeString(input); 
                 } else { 
                     int len = input.length(); 
                     char[] buffer = new char[len + 20]; 
                     input.getChars(0, len, buffer, strIx); 
                     gen.writeString(buffer, strIx, len); 
                 } 
                 gen.flush(); 
                 gen.close(); 
                 JsonParser jp = jf.createParser(new ByteArrayInputStream(bout.toByteArray())); 
                 JsonToken t = jp.nextToken(); 
                 assertNotNull("Document \"" + bout.toString("UTF-8") + "\" yielded no tokens", t); 
                 assertEquals(JsonToken.VALUE_STRING, t); 
                 assertEquals(input, jp.getText()); 
                 assertEquals(null, jp.nextToken()); 
                 jp.close(); 
             } 
         } 
     } 
 }
public void testIsClosed55() throws IOException { 
     JsonFactory jf = new JsonFactory(); 
     for (int i = 0; i < 2; ++i) { 
         boolean stream = ((i & 1) == 0); 
         JsonGenerator jg = stream ? jf.createGenerator(new StringWriter()) : jf.createGenerator(new ByteArrayOutputStream(), JsonEncoding.UTF8); 
         assertFalse(jg.isClosed()); 
         jg.writeStartArray(); 
         jg.writeNumber(-1); 
         jg.writeEndArray(); 
         assertFalse(jg.isClosed()); 
         jg.close(); 
         assertTrue(jg.isClosed()); 
         jg.close(); 
         assertTrue(jg.isClosed()); 
         jg.close(); 
         assertTrue(jg.isClosed()); 
     } 
 }
    

    

    

    /**
     * Testing for [JACKSON-176], ability to force serializing numbers
     * as JSON Strings.
     */
    

    // [Issue#85]
    
    
    private String _writeNumbers(JsonFactory jf) throws IOException
    {
        StringWriter sw = new StringWriter();
        JsonGenerator jg = jf.createGenerator(sw);
    
        jg.writeStartArray();
        jg.writeNumber(1);
        jg.writeNumber(2L);
        jg.writeNumber(1.25);
        jg.writeNumber(2.25f);
        jg.writeNumber(BigInteger.valueOf(3001));
        jg.writeNumber(BigDecimal.valueOf(0.5));
        jg.writeNumber("-1");
        jg.writeEndArray();
        jg.close();

        return sw.toString();
    }

    /*
    /**********************************************************
    /* Helper methods
    /**********************************************************
     */

    private void _testFieldNameQuoting(JsonFactory jf, boolean quoted)
        throws IOException
    {
        StringWriter sw = new StringWriter();
        JsonGenerator jg = jf.createGenerator(sw);
        jg.writeStartObject();
        jg.writeFieldName("foo");
        jg.writeNumber(1);
        jg.writeEndObject();
        jg.close();

        String result = sw.toString();
        if (quoted) {
            assertEquals("{\"foo\":1}", result);
        } else {
            assertEquals("{foo:1}", result);
        }
    }
    private void _testNonNumericQuoting(JsonFactory jf, boolean quoted)
        throws IOException
    {
        StringWriter sw = new StringWriter();
        JsonGenerator jg = jf.createGenerator(sw);
        jg.writeStartObject();
        jg.writeFieldName("double");
        jg.writeNumber(Double.NaN);
        jg.writeEndObject();
        jg.writeStartObject();
        jg.writeFieldName("float");
        jg.writeNumber(Float.NaN);
        jg.writeEndObject();
        jg.close();
	
        String result = sw.toString();
        if (quoted) {
            assertEquals("{\"double\":\"NaN\"} {\"float\":\"NaN\"}", result);
        } else {
            assertEquals("{\"double\":NaN} {\"float\":NaN}", result);
        }
    }
}
