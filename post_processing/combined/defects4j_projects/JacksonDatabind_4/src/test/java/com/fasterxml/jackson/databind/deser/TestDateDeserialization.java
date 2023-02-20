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
