package com.fasterxml.jackson.databind.ser;

import java.io.*;
import java.text.*;
import java.util.*;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.*;

public class TestDateSerialization
    extends BaseMapTest
{
    static class TimeZoneBean {
        private TimeZone tz;
        
        public TimeZoneBean(String name) {
            tz = TimeZone.getTimeZone(name);
        }

        public TimeZone getTz() { return tz; }
    }

    static class DateAsNumberBean {
        @JsonFormat(shape=JsonFormat.Shape.NUMBER)
        public Date date;
        public DateAsNumberBean(long l) { date = new java.util.Date(l); }
    }

    static class DateAsStringBean {
        @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd")
        public Date date;
        public DateAsStringBean(long l) { date = new java.util.Date(l); }
    }

    static class DateInCETBean {
        @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd,HH:00", timezone="CET")
        public Date date;
        public DateInCETBean(long l) { date = new java.util.Date(l); }
    }
    
    /*
    /**********************************************************
    /* Test methods
    /**********************************************************
     */

    private final ObjectMapper MAPPER = new ObjectMapper();
    
public void testDateWithJsonFormat97() throws Exception { 
     ObjectMapper mapper = new ObjectMapper(); 
     String json; 
     mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS); 
     json = mapper.writeValueAsString(new DateAsNumberBean(0L)); 
     assertEquals("{\"date\":0}", json); 
     mapper.enable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS); 
     json = mapper.writer().with(getUTCTimeZone()).writeValueAsString(new DateAsStringBean(0L)); 
     assertEquals("{\"date\":\"1970-01-01\"}", json); 
     json = mapper.writeValueAsString(new DateInCETBean(0L)); 
     assertEquals("{\"date\":\"1970-01-01,01:00\"}", json); 
 }
public void testWithTimeZoneOverride132() throws Exception { 
     ObjectMapper mapper = new ObjectMapper(); 
     mapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd/HH:mm z")); 
     mapper.setTimeZone(TimeZone.getTimeZone("PST")); 
     mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS); 
     String json = mapper.writeValueAsString(new Date(0)); 
     assertEquals(quote("1969-12-31/16:00 PST"), json); 
 }
    

    

    

    

    

    // [JACKSON-663]
    
    
    // [JACKSON-648]: (re)configuring via ObjectWriter
    

    // [JACKSON-606]
    

    // [JACKSON-435]
    

    /**
     * Test to ensure that setting a TimeZone _after_ dateformat should enforce
     * that timezone on format, regardless of TimeZone format had.
     */
    
}

