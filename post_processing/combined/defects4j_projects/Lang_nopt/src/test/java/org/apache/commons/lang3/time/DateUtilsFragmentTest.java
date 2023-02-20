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
import org.junit.Before;
import static org.junit.Assert.*;
import java.util.Calendar;
import java.util.Date;

public class DateUtilsFragmentTest {

    private static final int months = 7;   // second final prime before 12
    private static final int days = 23;    // second final prime before 31 (and valid)
    private static final int hours = 19;   // second final prime before 24
    private static final int minutes = 53; // second final prime before 60
    private static final int seconds = 47; // third final prime before 60
    private static final int millis = 991; // second final prime before 1000

    private Date aDate;
    private Calendar aCalendar;


    @Before
    public void setUp() {
        aCalendar = Calendar.getInstance();
        aCalendar.set(2005, months, days, hours, minutes, seconds);
        aCalendar.set(Calendar.MILLISECOND, millis);
        aDate = aCalendar.getTime();
    }
    
    

    
    
    

    

    

    
    
    

    
    
    

    

    

    

    

    

    

    

    //Calendar.SECOND as useful fragment
    
    

    

    //Calendar.MINUTE as useful fragment

    

    

    

    

    //Calendar.HOUR_OF_DAY as useful fragment
    
    
    
    

    

    

    

    

    //Calendar.DATE and Calendar.DAY_OF_YEAR as useful fragment
    
    
    

    

    

    

    
    
    

    
    
    
    //Calendar.MONTH as useful fragment
    

    
    
    

    

    

    

    

    
    
    //Calendar.YEAR as useful fragment
    

    
    
    

    

    

    

    

    
}
