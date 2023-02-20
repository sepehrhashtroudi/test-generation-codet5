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
    
public void testDateNumeric139() throws IOException { 
     assertTrue(MAPPER.isEnabled(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)); 
     String json = MAPPER.writeValueAsString(new Date(199L)); 
     assertEquals("199", json); 
 }
public void testOrderByKey155() throws IOException { 
     ObjectMapper m = new ObjectMapper(); 
     assertFalse(m.isEnabled(SerializationFeature.ORDER_MAP_ENTRIES_BY_KEYS)); 
     LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>(); 
     map.put("b", 3); 
     map.put("a", 6); 
     assertEquals("{\"b\":3,\"a\":6}", m.writeValueAsString(map)); 
     assertEquals("{\"a\":6,\"b\":3}", m.writer(SerializationFeature.ORDER_MAP_ENTRIES_BY_KEYS).writeValueAsString(map)); 
 }
public void testDateUsingObjectWriter172() throws IOException { 
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
public void testWithTimeZoneOverride173() throws Exception { 
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

