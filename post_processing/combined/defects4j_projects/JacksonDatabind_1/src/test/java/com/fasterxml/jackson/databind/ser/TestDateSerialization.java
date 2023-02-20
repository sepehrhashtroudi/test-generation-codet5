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
    
public void testDateUsingObjectWriter44() throws IOException { 
     DateFormat df = new SimpleDateFormat("yyyy-MM-dd'X'HH:mm:ss"); 
     df.setTimeZone(TimeZone.getTimeZone("PST")); 
     assertEquals(quote("1969-12-31X16:00:00"), MAPPER.writer(df).writeValueAsString(new Date(0L))); 
     ObjectWriter w = MAPPER.writer((DateFormat) null); 
     assertEquals("0", w.writeValueAsString(new Date(0L))); 
     w = w.with(df); 
     assertEquals(quote("1969-12-31X16:00:00"), w.writeValueAsString(new Date(0L))); 
     w = w.with((DateFormat) null); 
     assertEquals("0", w.writeValueAsString(new Date(0L))); 
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

