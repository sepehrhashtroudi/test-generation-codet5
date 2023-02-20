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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

import org.junit.Test;

/**
 * Unit tests {@link org.apache.commons.lang3.time.FastDateFormat}.
 *
 * @since 2.0
 * @version $Id$
 */
public class FastDateFormatTest {

    /*
     * Only the cache methods need to be tested here.  
     * The print methods are tested by {@link FastDateFormat_PrinterTest}
     * and the parse methods are tested by {@link FastDateFormat_ParserTest}
     */
@Test
public void testTimeDateDefaults69() { 
     assertEquals(FastDateFormat.getDateTimeInstance(FastDateFormat.LONG, FastDateFormat.MEDIUM, Locale.CANADA), FastDateFormat.getDateTimeInstance(FastDateFormat.LONG, FastDateFormat.MEDIUM, TimeZone.getDefault(), Locale.CANADA)); 
     assertEquals(FastDateFormat.getDateTimeInstance(FastDateFormat.LONG, FastDateFormat.MEDIUM, TimeZone.getTimeZone("America/New_York")), FastDateFormat.getDateTimeInstance(FastDateFormat.LONG, FastDateFormat.MEDIUM, TimeZone.getTimeZone("America/New_York"), Locale.getDefault())); 
     assertEquals(FastDateFormat.getDateTimeInstance(FastDateFormat.LONG, FastDateFormat.MEDIUM), FastDateFormat.getDateTimeInstance(FastDateFormat.LONG, FastDateFormat.MEDIUM, TimeZone.getDefault(), Locale.getDefault())); 
 }
@Test
public void testDateDefaults371() { 
     assertEquals(FastDateFormat.getDateInstance(FastDateFormat.LONG, Locale.CANADA), FastDateFormat.getDateInstance(FastDateFormat.LONG, TimeZone.getDefault(), Locale.CANADA)); 
     assertEquals(FastDateFormat.getDateInstance(FastDateFormat.LONG, TimeZone.getTimeZone("America/New_York")), FastDateFormat.getDateInstance(FastDateFormat.LONG, TimeZone.getTimeZone("America/New_York"), Locale.getDefault())); 
     assertEquals(FastDateFormat.getDateInstance(FastDateFormat.LONG), FastDateFormat.getDateInstance(FastDateFormat.LONG, TimeZone.getDefault(), Locale.getDefault())); 
 }
@Test
public void test_getDateInstance_int372() { 
     assertEquals(FastDateFormat.getDateInstance(FastDateFormat.LONG, Locale.CANADA), FastDateFormat.getDateInstance(FastDateFormat.LONG, TimeZone.getDefault(), Locale.CANADA)); 
     assertEquals(FastDateFormat.getDateInstance(FastDateFormat.LONG, TimeZone.getTimeZone("America/New_York")), FastDateFormat.getDateInstance(FastDateFormat.LONG, TimeZone.getTimeZone("America/New_York"), Locale.getDefault())); 
     assertEquals(FastDateFormat.getDateInstance(FastDateFormat.LONG), FastDateFormat.getDateInstance(FastDateFormat.LONG, TimeZone.getDefault(), Locale.getDefault())); 
 }
@Test
public void testTimeDateDefaults374() { 
     assertEquals(FastDateFormat.getDateInstance(FastDateFormat.LONG, Locale.CANADA), FastDateFormat.getDateInstance(FastDateFormat.LONG, TimeZone.getDefault(), Locale.CANADA)); 
     assertEquals(FastDateFormat.getDateInstance(FastDateFormat.LONG, TimeZone.getTimeZone("America/New_York")), FastDateFormat.getDateInstance(FastDateFormat.LONG, TimeZone.getTimeZone("America/New_York"), Locale.getDefault())); 
     assertEquals(FastDateFormat.getDateInstance(FastDateFormat.LONG), FastDateFormat.getDateInstance(FastDateFormat.LONG, TimeZone.getDefault(), Locale.getDefault())); 
 }
    

    

    

    

    

    

           

    

    

    

    

    

    

    final static private int NTHREADS= 10;
    final static private int NROUNDS= 10000;
    
    private long measureTime(final Format formatter, final Format parser) throws InterruptedException {
        final ExecutorService pool = Executors.newFixedThreadPool(NTHREADS);
        final AtomicInteger failures= new AtomicInteger(0);
        final AtomicLong totalElapsed= new AtomicLong(0);
        
        for(int i= 0; i<NTHREADS; ++i) {
            pool.submit(new Runnable() {
                @Override
                public void run() {
                    for(int i= 0; i<NROUNDS; ++i) {
                        try {
                            final Date date= new Date();
                            final String formattedDate= formatter.format(date);
                            final long start= System.currentTimeMillis();        
                            final Object pd= parser.parseObject(formattedDate);
                            totalElapsed.addAndGet(System.currentTimeMillis()-start);
                            if(!date.equals(pd)) {
                                failures.incrementAndGet();
                            }
                        } catch (final Exception e) {
                            failures.incrementAndGet();
                            e.printStackTrace();
                        }
                    }
                }                
            });
        }
        pool.shutdown();                        
        if(!pool.awaitTermination(20, TimeUnit.SECONDS)) {
            pool.shutdownNow();
            fail("did not complete tasks");
        }
        assertEquals(0, failures.get());
        return totalElapsed.get();
    }
}
