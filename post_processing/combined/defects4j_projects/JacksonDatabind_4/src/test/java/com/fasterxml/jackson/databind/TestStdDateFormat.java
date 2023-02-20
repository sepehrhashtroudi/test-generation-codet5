package com.fasterxml.jackson.databind;

import java.util.*;

import com.fasterxml.jackson.databind.util.StdDateFormat;

public class TestStdDateFormat
    extends BaseMapTest
{
public void testFactories80() { 
     assertNotNull(StdDateFormat.getBlueprintISO8601Format()); 
     assertNotNull(StdDateFormat.getBlueprintRFC1123Format()); 
     TimeZone tz = TimeZone.getTimeZone("GMT"); 
     assertNotNull(StdDateFormat.getISO8601Format(tz)); 
     assertNotNull(StdDateFormat.getRFC1123Format(tz)); 
 }
    

    
}
