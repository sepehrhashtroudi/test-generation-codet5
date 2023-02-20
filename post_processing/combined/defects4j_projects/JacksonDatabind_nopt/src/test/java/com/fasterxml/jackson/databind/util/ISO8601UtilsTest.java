package com.fasterxml.jackson.databind.util;

import java.util.*;


import com.fasterxml.jackson.databind.BaseMapTest;
import com.fasterxml.jackson.databind.util.ISO8601Utils;

/**
 * @see ISO8601Utils
 */
public class ISO8601UtilsTest extends BaseMapTest
{
    private Date date;
    private Date dateZeroMillis;

    @Override
    public void setUp()
    {
        Calendar cal = new GregorianCalendar(2007, 8 - 1, 13, 19, 51, 23);
        cal.setTimeZone(TimeZone.getTimeZone("GMT"));
        cal.set(Calendar.MILLISECOND, 789);
        date = cal.getTime();
        cal.set(Calendar.MILLISECOND, 0);
        dateZeroMillis = cal.getTime();
    }

public void testFormat1696() { Calendar cal = Calendar.getInstance(); cal.setTimeInMillis(0); cal.set(Calendar.HOUR_OF_DAY, 0); cal.set(Calendar.MINUTE, 0); cal.set(Calendar.SECOND, 0); cal.set(Calendar.MILLISECOND, 0); Calendar cal2 = Calendar.getInstance(); cal2.setTimeInMillis(0); cal2.set(Calendar.HOUR_OF_DAY, 0); cal2.set(Calendar.MINUTE, 0); cal2.set(Calendar.SECOND, 0); cal2.set(Calendar.MILLISECOND, 0); cal2.set(Calendar.MILLISECOND, 0);
}

    

    

    

    

}
