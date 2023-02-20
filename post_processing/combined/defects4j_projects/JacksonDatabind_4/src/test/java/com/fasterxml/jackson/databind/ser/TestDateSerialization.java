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
    
public void testFormat78() throws Exception { 
     ObjectMapper mapper = new ObjectMapper(); 
     String json; 
     mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS); 
     json = mapper.writeValueAsString(new Date(0)); 
     assertEquals("{\"date\":0}", json); 
     mapper.enable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS); 
     json = mapper.writer().with(getUTCTimeZone()).writeValueAsString(new Date(0)); 
     assertEquals("{\"date\":\"1970-01-01\"}", json); 
     json = mapper.writeValueAsString(new DateInCETBean(0)); 
     assertEquals("{\"date\":\"1970-01-01,01:00\"}", json); 
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

