package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.*;

import java.io.*;

/**
 * Set of basic unit tests for verifying that the basic generator
 * functionality works as expected.
 */
public class TestJsonGenerator
    extends com.fasterxml.jackson.test.BaseTest
{
    // // // First, tests for primitive (non-structured) values


public void testLongWrite22() throws Exception { 
     doTestLongWrite(false); 
     doTestLongWrite(true); 
 } 


public void testStringWrite100() throws Exception { 
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


public void testIntWrite108() throws Exception { 
     doTestIntWrite(false); 
     doTestIntWrite(true); 
 } 


public void testBooleanWrite117() throws Exception { 
     for (int i = 0; i < 4; ++i) { 
         boolean state = (i & 1) == 0; 
         boolean pad = (i & 2) == 0; 
         StringWriter sw = new StringWriter(); 
         JsonGenerator gen = new JsonFactory().createGenerator(sw); 
         gen.writeBoolean(state); 
         if (pad) { 
             gen.writeRaw(" "); 
         } 
         gen.close(); 
         String docStr = sw.toString(); 
         JsonParser jp = createParserUsingReader(docStr); 
         JsonToken t = jp.nextToken(); 
         String exp = Boolean.valueOf(state).toString(); 
         if (!exp.equals(jp.getText())) { 
             fail("Expected '" + exp + "', got '" + jp.getText()); 
         } 
         assertEquals(state ? JsonToken.VALUE_TRUE : JsonToken.VALUE_FALSE, t); 
         assertEquals(null, jp.nextToken()); 
         jp.close(); 
     } 
 } 

    

    

    

    

    
    
    // // Then root-level output testing

     
    
    // Convenience methods
    
    

    /**
     * Test to verify that output context actually contains useful information
     */
    
// Defects4J: flaky method
//     public void testOutputContext() throws Exception
//     {
//         StringWriter sw = new StringWriter();
//         JsonGenerator gen = new JsonFactory().createGenerator(sw);
//         JsonStreamContext ctxt = gen.getOutputContext();
//         assertTrue(ctxt.inRoot());
// 
//         gen.writeStartObject();
//         assertTrue(gen.getOutputContext().inObject());
// 
//         gen.writeFieldName("a");
//         assertEquals("a", gen.getOutputContext().getCurrentName());
// 
//         gen.writeStartArray();
//         assertTrue(gen.getOutputContext().inArray());
// 
//         gen.writeStartObject();
//         assertTrue(gen.getOutputContext().inObject());
// 
//         gen.writeFieldName("b");
//         ctxt = gen.getOutputContext();
//         assertEquals("b", ctxt.getCurrentName());
//         gen.writeNumber(123);
//         assertEquals("b", ctxt.getCurrentName());
// 
//         gen.writeFieldName("c");
//         assertEquals("c", gen.getOutputContext().getCurrentName());
//         gen.writeNumber(5);
// //        assertEquals("c", gen.getOutputContext().getCurrentName());
// 
//         gen.writeFieldName("d");
//         assertEquals("d", gen.getOutputContext().getCurrentName());
// 
//         gen.writeStartArray();
//         ctxt = gen.getOutputContext();
//         assertTrue(ctxt.inArray());
//         assertEquals(0, ctxt.getCurrentIndex());
//         assertEquals(0, ctxt.getEntryCount());
// 
//         gen.writeBoolean(true);
//         ctxt = gen.getOutputContext();
//         assertTrue(ctxt.inArray());
//         // NOTE: index still refers to currently output entry
//         assertEquals(0, ctxt.getCurrentIndex());
//         assertEquals(1, ctxt.getEntryCount());
// 
//         gen.writeNumber(3);
//         ctxt = gen.getOutputContext();
//         assertTrue(ctxt.inArray());
//         assertEquals(1, ctxt.getCurrentIndex());
//         assertEquals(2, ctxt.getEntryCount());
//         
//         gen.writeEndArray();
//         assertTrue(gen.getOutputContext().inObject());
//         
//         gen.writeEndObject();
//         assertTrue(gen.getOutputContext().inArray());
// 
//         gen.writeEndArray();
//         assertTrue(gen.getOutputContext().inObject());
// 
//         gen.writeEndObject();
// 
//         assertTrue(gen.getOutputContext().inRoot());
//         
//         gen.close();
//     }
    
    /*
    /**********************************************************
    /* Internal methods
    /**********************************************************
     */
    
    private void doTestIntWrite(boolean pad)
        throws Exception
    {
        int[] VALUES = new int[] {
            0, 1, -9, 32, -32, 57, 13240, -9999, Integer.MAX_VALUE, Integer.MAX_VALUE
        };
        for (int i = 0; i < VALUES.length; ++i) {
            int VALUE = VALUES[i];
            StringWriter sw = new StringWriter();
            JsonGenerator gen = new JsonFactory().createGenerator(sw);
            gen.writeNumber(VALUE);
            if (pad) {
                gen.writeRaw(" ");
            }
            gen.close();
            String docStr = sw.toString();
            JsonParser jp = createParserUsingReader(docStr);
            JsonToken t = jp.nextToken();
            assertNotNull("Document \""+docStr+"\" yielded no tokens", t);
            // Number are always available as lexical representation too
            String exp = ""+VALUE;
            if (!exp.equals(jp.getText())) {
                fail("Expected '"+exp+"', got '"+jp.getText());
            }
            assertEquals(JsonToken.VALUE_NUMBER_INT, t);
            assertEquals(VALUE, jp.getIntValue());
            assertEquals(null, jp.nextToken());
            jp.close();
        }
    }

    private void doTestLongWrite(boolean pad)
        throws Exception
    {
        long[] VALUES = new long[] {
            0L, 1L, -1L, -12005002294L, Long.MIN_VALUE, Long.MAX_VALUE
        };
        for (int i = 0; i < VALUES.length; ++i) {
            long VALUE = VALUES[i];
            StringWriter sw = new StringWriter();
            JsonGenerator gen = new JsonFactory().createGenerator(sw);
            gen.writeNumber(VALUE);
            if (pad) {
                gen.writeRaw(" ");
            }
            gen.close();
            String docStr = sw.toString();
            JsonParser jp = createParserUsingReader(docStr);
            JsonToken t = jp.nextToken();
            assertNotNull("Document \""+docStr+"\" yielded no tokens", t);
            String exp = ""+VALUE;
            if (!exp.equals(jp.getText())) {
                fail("Expected '"+exp+"', got '"+jp.getText());
            }
            assertEquals(JsonToken.VALUE_NUMBER_INT, t);
            assertEquals(VALUE, jp.getLongValue());
            assertEquals(null, jp.nextToken());
            jp.close();
        }
    }
}
