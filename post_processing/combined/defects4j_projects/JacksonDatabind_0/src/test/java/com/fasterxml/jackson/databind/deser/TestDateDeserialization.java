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
    
public void testInvalidFormat27() throws Exception { 
     try { 
         MAPPER.readValue(quote("foobar"), Date.class); 
         fail("Should have failed with an exception"); 
     } catch (InvalidFormatException e) { 
         verifyException(e, "Can not construct instance"); 
         assertEquals("foobar", e.getValue()); 
         assertEquals(Date.class, e.getTargetType()); 
     } catch (Exception e) { 
         fail("Wrong type of exception (" + e.getClass().getName() + "), should get " + InvalidFormatException.class.getName()); 
     } 
 }
public void testCustomCalendarWithAnnotation225() throws Exception { 
     CalendarAsStringBean cbean = MAPPER.readValue("{\"cal\":\";2007/07/13;\"}", CalendarAsStringBean.class); 
     assertNotNull(cbean); 
     assertNotNull(cbean.cal); 
     Calendar c = cbean.cal; 
     assertEquals(2007, c.get(Calendar.YEAR)); 
     assertEquals(Calendar.JULY, c.get(Calendar.MONTH)); 
     assertEquals(13, c.get(Calendar.DAY_OF_MONTH)); 
 }
public void testWithCustomCalendarWithAnnotation226() throws Exception { 
     CalendarAsStringBean cbean = MAPPER.readValue("{\"cal\":\";2007/07/13;\"}", CalendarAsStringBean.class); 
     assertNotNull(cbean); 
     assertNotNull(cbean.cal); 
     Calendar c = cbean.cal; 
     assertEquals(2007, c.get(Calendar.YEAR)); 
     assertEquals(Calendar.JULY, c.get(Calendar.MONTH)); 
     assertEquals(13, c.get(Calendar.DAY_OF_MONTH)); 
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
