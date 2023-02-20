package com.fasterxml.jackson.databind.deser;

import java.text.DateFormat;
import java.text.SimpleDateFormat;


import com.fasterxml.jackson.databind.*;

public class TestTimestampDeserialization
    extends BaseMapTest
{
    // As for TestDateDeserialization except we don't need to test date conversion routines, so
    // just check we pick up timestamp class

    

    /*
    /**********************************************************
    /* Helper methods
    /**********************************************************
     */

    private String serializeTimestampAsString(java.sql.Timestamp value)
    {
        /* Then from String. This is bit tricky, since JDK does not really
         * suggest a 'standard' format. So let's try using something...
         */
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        return df.format(value);
    }
}
