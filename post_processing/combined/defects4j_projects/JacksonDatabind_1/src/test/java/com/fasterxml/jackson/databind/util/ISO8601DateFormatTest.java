package com.fasterxml.jackson.databind.util;

import java.text.DateFormat;
import java.util.*;


import com.fasterxml.jackson.databind.BaseMapTest;
import com.fasterxml.jackson.databind.util.ISO8601DateFormat;

/**
 * @see ISO8601DateFormat
 */
public class ISO8601DateFormatTest extends BaseMapTest
{
    private ISO8601DateFormat df;
    private Date date;

    @Override
    public void setUp()
    {
        Calendar cal = new GregorianCalendar(2007, 8 - 1, 13, 19, 51, 23);
        cal.setTimeZone(TimeZone.getTimeZone("GMT"));
        cal.set(Calendar.MILLISECOND, 0);
        date = cal.getTime();
        df = new ISO8601DateFormat();
    }

    

    

    

}
