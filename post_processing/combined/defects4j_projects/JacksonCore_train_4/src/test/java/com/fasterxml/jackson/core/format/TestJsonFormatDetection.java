package com.fasterxml.jackson.core.format;

import java.io.*;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.format.DataFormatDetector;
import com.fasterxml.jackson.core.format.DataFormatMatcher;
import com.fasterxml.jackson.core.format.MatchStrength;

public class TestJsonFormatDetection extends com.fasterxml.jackson.test.BaseTest
{

public void testSimpleValidArray17() throws Exception { 
     JsonFactory jsonF = new JsonFactory(); 
     DataFormatDetector detector = new DataFormatDetector(jsonF); 
     final String ARRAY_JSON = "[ 1, 2 ]"; 
     DataFormatMatcher matcher = detector.findFormat(new ByteArrayInputStream(ARRAY_JSON.getBytes("UTF-8"))); 
     assertTrue(matcher.hasMatch()); 
     assertEquals("JSON", matcher.getMatchedFormatName()); 
     assertSame(jsonF, matcher.getMatch()); 
     assertEquals(MatchStrength.SOLID_MATCH, matcher.getMatchStrength()); 
     JsonParser jp = matcher.createParserWithMatch(); 
     assertToken(JsonToken.START_ARRAY, jp.nextToken()); 
     assertToken(JsonToken.VALUE_NUMBER_INT, jp.nextToken()); 
     assertToken(JsonToken.VALUE_NUMBER_INT, jp.nextToken()); 
     assertToken(JsonToken.END_ARRAY, jp.nextToken()); 
     assertNull(jp.nextToken()); 
     jp.close(); 
 } 


public void testSimpleValidString37() throws Exception { 
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


public void testSimpleValidObject105() throws Exception { 
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
