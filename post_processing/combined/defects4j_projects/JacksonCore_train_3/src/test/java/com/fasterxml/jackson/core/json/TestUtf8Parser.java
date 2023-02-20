package com.fasterxml.jackson.core.json;


import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.test.BaseTest;

import java.io.*;
import java.util.Random;

/**
 * Set of basic unit tests for verifying that the basic parser
 * functionality works as expected.
 */
public class TestUtf8Parser
    extends BaseTest
{
    final static String[] UTF8_2BYTE_STRINGS = new String[] {
        /* This may look funny, but UTF8 scanner has fairly
         * elaborate decoding machinery, and it is indeed
         * necessary to try out various combinations...
         */
        "b", "A\u00D8", "abc", "c3p0",
        "12345", "......", "Long\u00FAer",
        "Latin1-fully-\u00BE-develop\u00A8d",
        "Some very long name, ridiculously long actually to see that buffer expansion works: \u00BF?"
    };

    final static String[] UTF8_3BYTE_STRINGS = new String[] {
        "\uC823?", "A\u400F", "1\u1234?",
        "Ab123\u4034",
        "Even-longer:\uC023"
    };


public void testEmptyName29() throws Exception { 
     final String DOC = "{ \"\" : \"\" }"; 
     JsonParser jp = createParserUsingStream(DOC, "UTF-8"); 
     assertToken(JsonToken.START_OBJECT, jp.nextToken()); 
     assertToken(JsonToken.FIELD_NAME, jp.nextToken()); 
     assertEquals("", jp.getCurrentName()); 
     assertToken(JsonToken.VALUE_STRING, jp.nextToken()); 
     assertEquals("", jp.getText()); 
     assertToken(JsonToken.END_OBJECT, jp.nextToken()); 
     jp.close(); 
 } 


public void testNextFieldName40() throws IOException { 
     JsonFactory f = new JsonFactory(); 
     SerializedString id = new SerializedString("id"); 
     ByteArrayOutputStream os = new ByteArrayOutputStream(); 
     os.write('{'); 
     for (int i = 0; i < 3994; i++) { 
         os.write(' '); 
     } 
     os.write("\"id\":2".getBytes("UTF-8")); 
     os.write('}'); 
     JsonParser parser = f.createParser(new ByteArrayInputStream(os.toByteArray())); 
     assertEquals(parser.nextToken(), JsonToken.START_OBJECT); 
     assertTrue(parser.nextFieldName(id)); 
     assertEquals(parser.nextToken(), JsonToken.VALUE_NUMBER_INT); 
     assertEquals(parser.nextToken(), JsonToken.END_OBJECT); 
     parser.close(); 
 } 


public void testUtf8Name3Bytes61() throws Exception { 
     final String[] NAMES = UTF8_3BYTE_STRINGS; 
     for (int i = 0; i < NAMES.length; ++i) { 
         String NAME = NAMES[i]; 
         String DOC = "{ \"" + NAME + "\" : true }"; 
         JsonParser jp = createParserUsingStream(DOC, "UTF-8"); 
         assertToken(JsonToken.START_OBJECT, jp.nextToken()); 
         assertToken(JsonToken.FIELD_NAME, jp.nextToken()); 
         assertEquals(NAME, jp.getCurrentName()); 
         assertToken(JsonToken.VALUE_TRUE, jp.nextToken()); 
         assertEquals(NAME, jp.getCurrentName()); 
         assertToken(JsonToken.END_OBJECT, jp.nextToken()); 
         jp.close(); 
     } 
 } 


public void testUtf8Name2Bytes62() throws Exception { 
     final String[] NAMES = UTF8_2BYTE_STRINGS; 
     for (int i = 0; i < NAMES.length; ++i) { 
         String NAME = NAMES[i]; 
         String DOC = "{ \"" + NAME + "\" : 0 }"; 
         JsonParser jp = createParserUsingStream(DOC, "UTF-8"); 
         assertToken(JsonToken.START_OBJECT, jp.nextToken()); 
         assertToken(JsonToken.FIELD_NAME, jp.nextToken()); 
         assertEquals(NAME, jp.getCurrentName()); 
         assertToken(JsonToken.VALUE_NUMBER_INT, jp.nextToken()); 
         assertEquals(NAME, jp.getCurrentName()); 
         assertToken(JsonToken.END_OBJECT, jp.nextToken()); 
         jp.close(); 
     } 
 } 

    

    

    

    // How about tests for Surrogate-Pairs?

    

    

    // [JACKSON-889]
	
}
