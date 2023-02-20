package com.fasterxml.jackson.databind.deser;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;

public class TestDateDeserialization
    extends BaseMapTest
{
    // Test for [JACKSON-435]
    static class DateAsStringBean
    {
        @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="/yyyy/MM/dd/")
        public Date date;
    }

    static class CalendarAsStringBean
    {
        @JsonFormat(shape=JsonFormat.Shape.STRING, pattern=";yyyy/MM/dd;")
        public Calendar cal;
    }

    static class DateInCETBean {
        @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd,HH", timezone="CET")
        public Date date;
    }
    
    /*
    /**********************************************************
    /* Unit tests
    /**********************************************************
     */

    private final ObjectMapper MAPPER = new ObjectMapper();
    
public void test8601DateTimeNoMilliSecs47() throws Exception { 
     for (String inputStr : new String[] { "2010-06-28T23:34:22Z", "2010-06-28T23:34:22+0000", "2010-06-28T23:34:22+00" }) { 
         Date inputDate = MAPPER.readValue(quote(inputStr), java.util.Date.class); 
         Calendar c = Calendar.getInstance(TimeZone.getTimeZone("GMT")); 
         c.setTime(inputDate); 
         assertEquals(2010, c.get(Calendar.YEAR)); 
         assertEquals(Calendar.JUNE, c.get(Calendar.MONTH)); 
         assertEquals(28, c.get(Calendar.DAY_OF_MONTH)); 
         assertEquals(23, c.get(Calendar.HOUR_OF_DAY)); 
         assertEquals(34, c.get(Calendar.MINUTE)); 
         assertEquals(22, c.get(Calendar.SECOND)); 
         assertEquals(0, c.get(Calendar.MILLISECOND)); 
     } 
 }
public void testDateUtilISO8601NoTimezone48() throws Exception { 
     String inputStr = "1984-11-13T00:00:09"; 
     Date inputDate = MAPPER.readValue(quote(inputStr), java.util.Date.class); 
     Calendar c = Calendar.getInstance(TimeZone.getTimeZone("GMT")); 
     c.setTime(inputDate); 
     assertEquals(1984, c.get(Calendar.YEAR)); 
     assertEquals(Calendar.NOVEMBER, c.get(Calendar.MONTH)); 
     assertEquals(13, c.get(Calendar.DAY_OF_MONTH)); 
     assertEquals(0, c.get(Calendar.HOUR_OF_DAY)); 
     assertEquals(0, c.get(Calendar.MINUTE)); 
     assertEquals(9, c.get(Calendar.SECOND)); 
     assertEquals(0, c.get(Calendar.MILLISECOND)); 
 }
public void testDatesWithEmptyStrings128() throws Exception { 
     assertNull(MAPPER.readValue(quote(""), java.util.Date.class)); 
     assertNull(MAPPER.readValue(quote(""), java.util.Calendar.class)); 
     assertNull(MAPPER.readValue(quote(""), java.sql.Date.class)); 
 }
public void testDateScalars202() throws Exception { 
     ObjectMapper m = new ObjectMapper(); 
     m.enableDefaultTyping(); 
     long ts = 12345678L; 
     assertEquals("[[\"java.util.Date\"," + ts + "]]", m.writeValueAsString(new Object[] { new Date(ts) })); 
     Calendar c = Calendar.getInstance(); 
     c.setTimeInMillis(ts); 
     String json = m.writeValueAsString(new Object[] { c }); 
     assertEquals("[[\"" + c.getClass().getName() + "\"," + ts + "]]", json); 
     Object[] result = m.readValue(json, Object[].class); 
     assertEquals(1, result.length); 
     assertTrue(result[0] instanceof Calendar); 
     assertEquals(ts, ((Calendar) result[0]).getTimeInMillis()); 
 }
public void testCustomDateWithAnnotation204() throws Exception { 
     DateAsStringBean result = MAPPER.readValue("{\"date\":\"/2005/05/25/\"}", DateAsStringBean.class); 
     assertNotNull(result); 
     assertNotNull(result.date); 
     Calendar c = Calendar.getInstance(TimeZone.getTimeZone("GMT")); 
     long l = result.date.getTime(); 
     if (l == 0L) { 
         fail("Should not get null date"); 
     } 
     c.setTimeInMillis(l); 
     assertEquals(2005, c.get(Calendar.YEAR)); 
     assertEquals(Calendar.MAY, c.get(Calendar.MONTH)); 
     assertEquals(25, c.get(Calendar.DAY_OF_MONTH)); 
 }
public void testCustomCalendarWithAnnotation206() throws Exception { 
     CalendarAsStringBean cbean = MAPPER.readValue("{\"cal\":\";2007/07/13;\"}", CalendarAsStringBean.class); 
     assertNotNull(cbean); 
     assertNotNull(cbean.cal); 
     Calendar c = cbean.cal; 
     assertEquals(2007, c.get(Calendar.YEAR)); 
     assertEquals(Calendar.JULY, c.get(Calendar.MONTH)); 
     assertEquals(13, c.get(Calendar.DAY_OF_MONTH)); 
 }
public void testCalendarScalars207() throws Exception { 
     ObjectMapper m = new ObjectMapper(); 
     m.enableDefaultTyping(); 
     long ts = 12345678L; 
     assertEquals("[[\"java.util.Date\"," + ts + "]]", m.writeValueAsString(new Object[] { new Date(ts) })); 
     Calendar c = Calendar.getInstance(); 
     c.setTimeInMillis(ts); 
     String json = m.writeValueAsString(new Object[] { c }); 
     assertEquals("[[\"" + c.getClass().getName() + "\"," + ts + "]]", json); 
     Object[] result = m.readValue(json, Object[].class); 
     assertEquals(1, result.length); 
     assertTrue(result[0] instanceof Calendar); 
     assertEquals(ts, ((Calendar) result[0]).getTimeInMillis()); 
 }
    

    

    

    

    /**
     * ISO8601 is supported as well
     */
    

    

    

    

    

    

    /**
     * Test for [JACKSON-203]: make empty Strings deserialize as nulls by default,
     * without need to turn on feature (which may be added in future)
     */
    

    // for [JACKSON-334]
    

    

    

    

    

    /*
    /**********************************************************
    /* Tests to verify failing cases
    /**********************************************************
     */

    
    
    /*
    /**********************************************************
    /* Helper methods
    /**********************************************************
     */

    private String dateToString(java.util.Date value)
    {
        /* Then from String. This is bit tricky, since JDK does not really
         * suggest a 'standard' format. So let's try using something...
         */
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        return df.format(value);
    }

    private static Calendar gmtCalendar(long time)
    {
        Calendar c = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        c.setTimeInMillis(time);
        return c;
    }

}
