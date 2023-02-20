package com.fasterxml.jackson.core.format;

import java.io.*;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.format.DataFormatDetector;
import com.fasterxml.jackson.core.format.DataFormatMatcher;
import com.fasterxml.jackson.core.format.MatchStrength;

public class TestJsonFormatDetection extends com.fasterxml.jackson.test.BaseTest
{
public void testSimpleInvalid28() throws Exception { 
     DataFormatDetector detector = new DataFormatDetector(new JsonFactory()); 
     final String NON_JSON = "<root />"; 
     DataFormatMatcher matcher = detector.findFormat(new ByteArrayInputStream(NON_JSON.getBytes("UTF-8"))); 
     assertFalse(matcher.hasMatch()); 
     assertEquals(MatchStrength.INCONCLUSIVE, matcher.getMatchStrength()); 
     assertNull(matcher.createParserWithMatch()); 
 }
public void testSimpleValidObject65() throws Exception { 
     JsonFactory jsonF = new JsonFactory(); 
     DataFormatDetector detector = new DataFormatDetector(jsonF); 
     final String JSON = "{  \"field\" : true }"; 
     DataFormatMatcher matcher = detector.findFormat(new ByteArrayInputStream(JSON.getBytes("UTF-8"))); 
     assertTrue(matcher.hasMatch()); 
     assertEquals("JSON", matcher.getMatchedFormatName()); 
     assertSame(jsonF, matcher.getMatch()); 
     assertEquals(MatchStrength.SOLID_MATCH, matcher.getMatchStrength()); 
     JsonParser jp = matcher.createParserWithMatch(); 
     assertToken(JsonToken.START_OBJECT, jp.nextToken()); 
     assertToken(JsonToken.FIELD_NAME, jp.nextToken()); 
     assertEquals("field", jp.getCurrentName()); 
     assertToken(JsonToken.VALUE_TRUE, jp.nextToken()); 
     assertToken(JsonToken.END_OBJECT, jp.nextToken()); 
     assertNull(jp.nextToken()); 
     jp.close(); 
 }
    

    

    /**
     * While JSON String is not a strong match alone, it should
     * be detected unless some better match is available
     */
    
    
    

}
