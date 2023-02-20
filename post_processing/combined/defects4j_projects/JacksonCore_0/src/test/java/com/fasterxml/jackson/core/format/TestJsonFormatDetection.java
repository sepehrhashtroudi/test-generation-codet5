package com.fasterxml.jackson.core.format;

import java.io.*;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.format.DataFormatDetector;
import com.fasterxml.jackson.core.format.DataFormatMatcher;
import com.fasterxml.jackson.core.format.MatchStrength;

public class TestJsonFormatDetection extends com.fasterxml.jackson.test.BaseTest
{
public void testInvalidIntAccess4() throws Exception { 
     JsonParser jp = createParserUsingReader("[ \"abc\" ]"); 
     assertToken(JsonToken.START_ARRAY, jp.nextToken()); 
     assertToken(JsonToken.VALUE_STRING, jp.nextToken()); 
     try { 
         jp.getIntValue(); 
         fail("Expected error trying to call getIntValue on non-numeric value"); 
     } catch (JsonParseException e) { 
         verifyException(e, "can not use numeric value accessors"); 
     } 
     jp.close(); 
 }
public void testSimpleValidString5() throws Exception { 
     JsonFactory jsonF = new JsonFactory(); 
     DataFormatDetector detector = new DataFormatDetector(jsonF); 
     final String JSON = "\"JSON!\""; 
     DataFormatMatcher matcher = detector.findFormat(new ByteArrayInputStream(JSON.getBytes("UTF-8"))); 
     assertTrue(matcher.hasMatch()); 
     assertEquals("JSON", matcher.getMatchedFormatName()); 
     assertSame(jsonF, matcher.getMatch()); 
     assertEquals(MatchStrength.WEAK_MATCH, matcher.getMatchStrength()); 
     JsonParser jp = matcher.createParserWithMatch(); 
     assertToken(JsonToken.VALUE_STRING, jp.nextToken()); 
     assertEquals("JSON!", jp.getText()); 
     assertNull(jp.nextToken()); 
     jp.close(); 
 }
public void testSimpleInvalid34() throws Exception { 
     DataFormatDetector detector = new DataFormatDetector(new JsonFactory()); 
     final String NON_JSON = "<root />"; 
     DataFormatMatcher matcher = detector.findFormat(new ByteArrayInputStream(NON_JSON.getBytes("UTF-8"))); 
     assertFalse(matcher.hasMatch()); 
     assertEquals(MatchStrength.INCONCLUSIVE, matcher.getMatchStrength()); 
     assertNull(matcher.createParserWithMatch()); 
 }
public void testJsonWithFiles56() throws Exception { 
     File file = File.createTempFile("jackson-test", null); 
     file.deleteOnExit(); 
     JsonFactory f = new JsonFactory(); 
     JsonGenerator jg = f.createGenerator(file, JsonEncoding.UTF16_LE); 
     jg.writeStartObject(); 
     jg.writeRaw("   "); 
     jg.writeEndObject(); 
     jg.close(); 
     JsonParser jp = f.createParser(file); 
     assertToken(JsonToken.START_OBJECT, jp.nextToken()); 
     assertToken(JsonToken.END_OBJECT, jp.nextToken()); 
     assertNull(jp.nextToken()); 
     jp.close(); 
     jp = f.createParser(file.toURI().toURL()); 
     assertToken(JsonToken.START_OBJECT, jp.nextToken()); 
     assertToken(JsonToken.END_OBJECT, jp.nextToken()); 
     assertNull(jp.nextToken()); 
     jp.close(); 
     file.delete(); 
 }
    

    

    /**
     * While JSON String is not a strong match alone, it should
     * be detected unless some better match is available
     */
    
    
    

}
