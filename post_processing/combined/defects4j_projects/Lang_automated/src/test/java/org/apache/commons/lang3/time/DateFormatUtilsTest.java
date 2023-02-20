/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.lang3.time;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

/**
 * TestCase for DateFormatUtils.
 *
 */
public class DateFormatUtilsTest {

    //-----------------------------------------------------------------------
@Test
public void testFormat92() { 
     final Calendar c = Calendar.getInstance(TimeZone.getTimeZone("UTC")); 
     c.set(2005, 0, 1, 12, 0, 0); 
     c.setTimeZone(TimeZone.getDefault()); 
     final StringBuilder buffer = new StringBuilder(); 
     final int year = c.get(Calendar.YEAR); 
     final int month = c.get(Calendar.MONTH) + 1; 
     final int day = c.get(Calendar.DAY_OF_MONTH); 
     final int hour = c.get(Calendar.HOUR_OF_DAY); 
     buffer.append(year); 
     buffer.append(month); 
     buffer.append(day); 
     buffer.append(hour); 
     assertEquals(buffer.toString(), DateFormatUtils.format(c.getTime(), "yyyyMdH")); 
     assertEquals(buffer.toString(), DateFormatUtils.format(c.getTime().getTime(), "yyyyMdH")); 
     assertEquals(buffer.toString(), DateFormatUtils.format(c.getTime(), "yyyyMdH", Locale.US)); 
     assertEquals(buffer.toString(), DateFormatUtils.format(c.getTime().getTime(), "yyyyMdH", Locale.US)); 
 }
    
    
    //-----------------------------------------------------------------------
    
    
    //-----------------------------------------------------------------------
    
    
    
    
    

    

    

    

    

    /*
    public void testLang312() {
        String pattern = "dd/MM/yyyy";
        String expected = "19/04/1948";
        TimeZone timeZone = TimeZone.getTimeZone("CET");
        Locale locale = Locale.GERMANY;

        // show Calendar is good
        Calendar cal = Calendar.getInstance(timeZone, locale);
        cal.set(1948, 3, 19);
        assertEquals(expected, DateFormatUtils.format( cal.getTime(), pattern, timeZone, locale ) );

        Date date = new Date(48, 3, 19);

        // test JDK
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat(pattern, locale);
        sdf.setTimeZone(timeZone);
// There's nothing we can do if the JDK fails, so just going to pring a warning in this case
//        assertEquals(expected, sdf.format( date ) );
        if( ! expected.equals( sdf.format( date ) ) ) {
            System.out.println("WARNING: JDK test failed - testLang312()");
        }

        // test Commons
        assertEquals(expected, DateFormatUtils.format( date, pattern, timeZone, locale ) );
    }
    */

}
