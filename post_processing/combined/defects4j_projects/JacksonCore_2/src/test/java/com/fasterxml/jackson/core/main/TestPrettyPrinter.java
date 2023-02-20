package com.fasterxml.jackson.core.main;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;

import java.io.*;

/**
 * Set of basic unit tests for verifying that indenting
 * option of generator works correctly
 */
@SuppressWarnings("serial")
public class TestPrettyPrinter
    extends com.fasterxml.jackson.test.BaseTest
{
    static class CountPrinter extends MinimalPrettyPrinter
    {
        @Override
        public void writeEndObject(JsonGenerator jg, int nrOfEntries)
                throws IOException, JsonGenerationException
        {
            jg.writeRaw("("+nrOfEntries+")}");
        }

        @Override
        public void writeEndArray(JsonGenerator jg, int nrOfValues)
            throws IOException, JsonGenerationException
        {
            jg.writeRaw("("+nrOfValues+")]");
        }
    }

    /*
    /**********************************************************
    /* Test methods
    /**********************************************************
     */
    
public void testIsClosed59() throws IOException { 
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
     } 
 }
    

    
    
    

    

    // [Issue#26]
    

    // Alternative solution for [Issue#26]
    
    
    /*
    /**********************************************************
    /* Helper methods
    /**********************************************************
     */

    private String _verifyPrettyPrinter(JsonGenerator gen, StringWriter sw) throws Exception
    {    
        gen.writeStartArray();
        gen.writeNumber(3);
        gen.writeString("abc");

        gen.writeStartArray();
        gen.writeBoolean(true);
        gen.writeEndArray();

        gen.writeStartObject();
        gen.writeFieldName("f");
        gen.writeNull();
        gen.writeFieldName("f2");
        gen.writeNull();
        gen.writeEndObject();

        gen.writeEndArray();
        gen.close();

        String docStr = sw.toString();
        JsonParser jp = createParserUsingReader(docStr);

        assertEquals(JsonToken.START_ARRAY, jp.nextToken());

        assertEquals(JsonToken.VALUE_NUMBER_INT, jp.nextToken());
        assertEquals(3, jp.getIntValue());
        assertEquals(JsonToken.VALUE_STRING, jp.nextToken());
        assertEquals("abc", jp.getText());

        assertEquals(JsonToken.START_ARRAY, jp.nextToken());
        assertEquals(JsonToken.VALUE_TRUE, jp.nextToken());
        assertEquals(JsonToken.END_ARRAY, jp.nextToken());

        assertEquals(JsonToken.START_OBJECT, jp.nextToken());
        assertEquals(JsonToken.FIELD_NAME, jp.nextToken());
        assertEquals("f", jp.getText());
        assertEquals(JsonToken.VALUE_NULL, jp.nextToken());
        assertEquals(JsonToken.FIELD_NAME, jp.nextToken());
        assertEquals("f2", jp.getText());
        assertEquals(JsonToken.VALUE_NULL, jp.nextToken());
        assertEquals(JsonToken.END_OBJECT, jp.nextToken());

        assertEquals(JsonToken.END_ARRAY, jp.nextToken());

        jp.close();

        return docStr;
    }

    protected String _generateRoot(JsonFactory jf, PrettyPrinter pp) throws IOException
    {
        StringWriter sw = new StringWriter();
        JsonGenerator gen = new JsonFactory().createGenerator(sw);
        gen.setPrettyPrinter(pp);
        gen.writeStartObject();
        gen.writeEndObject();
        gen.writeStartObject();
        gen.writeEndObject();
        gen.writeStartArray();
        gen.writeEndArray();
        gen.close();
        return sw.toString();
    }
}
