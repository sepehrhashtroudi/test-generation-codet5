package com.fasterxml.jackson.databind;

import java.util.*;

import com.fasterxml.jackson.databind.util.StdDateFormat;

public class TestStdDateFormat
    extends BaseMapTest
{
public void testInvalid49() { 
     StdDateFormat std = new StdDateFormat(); 
     try { 
         std.parse("foobar"); 
     } catch (java.text.ParseException e) { 
         verifyException(e, "Can not parse"); 
     } 
 }
public void testDateISO860150() throws Exception { 
     ObjectMapper mapper = new ObjectMapper(); 
     mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false); 
     String json = mapper.writeValueAsString(new Date(0L)); 
     assertEquals("\"1970-01-01T00:00:00.000+0000\"", json); 
 }
    

    
}
