/*
 *  Copyright 2001-2013 Stephen Colebourne
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.joda.time;

import java.lang.reflect.Modifier;
import java.security.AllPermission;
import java.security.CodeSource;
import java.security.Permission;
import java.security.PermissionCollection;
import java.security.Permissions;
import java.security.Policy;
import java.security.ProtectionDomain;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.DateTimeUtils.MillisProvider;
import org.joda.time.base.AbstractInstant;
import org.joda.time.chrono.BuddhistChronology;
import org.joda.time.chrono.CopticChronology;
import org.joda.time.chrono.GJChronology;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.chrono.JulianChronology;

/**
 * This class is a Junit unit test for DateTimeUtils.
 *
 * @author Stephen Colebourne
 */
public class TestDateTimeUtils extends TestCase {

    private static final GJChronology GJ = GJChronology.getInstance();
    private static final boolean OLD_JDK;
    static {
        String str = System.getProperty("java.version");
        boolean old = true;
        if (str.length() > 3 &&
            str.charAt(0) == '1' &&
            str.charAt(1) == '.' &&
            (str.charAt(2) == '4' || str.charAt(2) == '5' || str.charAt(2) == '6')) {
            old = false;
        }
        OLD_JDK = old;
    }

    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    
    long y2002days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 
                     366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 
                     365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
                     366 + 365;
    long y2003days = 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 
                     366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 
                     365 + 365 + 366 + 365 + 365 + 365 + 366 + 365 + 365 + 365 +
                     366 + 365 + 365;
    
    // 2002-06-09
    private long TEST_TIME_NOW =
            (y2002days + 31L + 28L + 31L + 30L + 31L + 9L -1L) * DateTimeConstants.MILLIS_PER_DAY;
            
    // 2002-04-05
    private long TEST_TIME1 =
            (y2002days + 31L + 28L + 31L + 5L -1L) * DateTimeConstants.MILLIS_PER_DAY
            + 12L * DateTimeConstants.MILLIS_PER_HOUR
            + 24L * DateTimeConstants.MILLIS_PER_MINUTE;
        
    // 2003-05-06
    private long TEST_TIME2 =
            (y2003days + 31L + 28L + 31L + 30L + 6L -1L) * DateTimeConstants.MILLIS_PER_DAY
            + 14L * DateTimeConstants.MILLIS_PER_HOUR
            + 28L * DateTimeConstants.MILLIS_PER_MINUTE;
        
    private static final Policy RESTRICT;
    private static final Policy ALLOW;
    static {
        // don't call Policy.getPolicy()
        RESTRICT = new Policy() {
            public PermissionCollection getPermissions(CodeSource codesource) {
                Permissions p = new Permissions();
                p.add(new AllPermission());  // enable everything
                return p;
            }
            public void refresh() {
            }
            public boolean implies(ProtectionDomain domain, Permission permission) {
                if (permission instanceof JodaTimePermission) {
                    return false;
                }
                return true;
//                return super.implies(domain, permission);
            }
        };
        ALLOW = new Policy() {
            public PermissionCollection getPermissions(CodeSource codesource) {
                Permissions p = new Permissions();
                p.add(new AllPermission());  // enable everything
                return p;
            }
            public void refresh() {
            }
        };
    }
    
    public static void main(String[] args) {
        junit.textui.TestRunner.run(suite());
    }

    public static TestSuite suite() {
        return new TestSuite(TestDateTimeUtils.class);
    }

    public TestDateTimeUtils(String name) {
        super(name);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    //-----------------------------------------------------------------------

public void testMillisProvider89() { 
     try { 
         DateTimeUtils.setCurrentMillisProvider(new MillisProvider() { 
  
             public long getMillis() { 
                 return 1L; 
             } 
         }); 
         assertEquals(1L, DateTimeUtils.currentTimeMillis()); 
     } finally { 
         DateTimeUtils.setCurrentMillisSystem(); 
     } 
 } 


public void testGetInstantChronology_RI108() { 
     DateTime dt = new DateTime(123L, BuddhistChronology.getInstance()); 
     assertEquals(BuddhistChronology.getInstance(), DateTimeUtils.getInstantChronology(dt)); 
     Instant i = new Instant(123L); 
     assertEquals(ISOChronology.getInstanceUTC(), DateTimeUtils.getInstantChronology(i)); 
     AbstractInstant ai = new AbstractInstant() { 
  
         public long getMillis() { 
             return 0L; 
         } 
  
         public Chronology getChronology() { 
             return null; 
         } 
     }; 
     assertEquals(ISOChronology.getInstance(), DateTimeUtils.getInstantChronology(ai)); 
     assertEquals(ISOChronology.getInstance(), DateTimeUtils.getInstantChronology(null)); 
 } 


public void testGetInstantMillis_RI152() { 
     Instant i = new Instant(123L); 
     assertEquals(123L, DateTimeUtils.getInstantMillis(i)); 
     try { 
         DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW); 
         assertEquals(TEST_TIME_NOW, DateTimeUtils.getInstantMillis(null)); 
     } finally { 
         DateTimeUtils.setCurrentMillisSystem(); 
     } 
 } 


public void testGetReadableInterval_ReadableInterval376() { 
     ReadableInterval input = new Interval(0, 100L); 
     assertEquals(input, DateTimeUtils.getReadableInterval(input)); 
     try { 
         DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW); 
         assertEquals(new Interval(TEST_TIME_NOW, TEST_TIME_NOW), DateTimeUtils.getReadableInterval(null)); 
     } finally { 
         DateTimeUtils.setCurrentMillisSystem(); 
     } 
 } 


@SuppressWarnings("deprecation") 
 public void testIsContiguous_RP459() { 
     YearMonthDay ymd = new YearMonthDay(2005, 6, 9); 
     assertEquals(true, DateTimeUtils.isContiguous(ymd)); 
     TimeOfDay tod = new TimeOfDay(12, 20, 30, 0); 
     assertEquals(true, DateTimeUtils.isContiguous(tod)); 
     Partial year = new Partial(DateTimeFieldType.year(), 2005); 
     assertEquals(true, DateTimeUtils.isContiguous(year)); 
     Partial hourOfDay = new Partial(DateTimeFieldType.hourOfDay(), 12); 
     assertEquals(true, DateTimeUtils.isContiguous(hourOfDay)); 
     Partial yearHour = year.with(DateTimeFieldType.hourOfDay(), 12); 
     assertEquals(false, DateTimeUtils.isContiguous(yearHour)); 
     Partial ymdd = new Partial(ymd).with(DateTimeFieldType.dayOfWeek(), 2); 
     assertEquals(false, DateTimeUtils.isContiguous(ymdd)); 
     Partial dd = new Partial(DateTimeFieldType.dayOfMonth(), 13).with(DateTimeFieldType.dayOfWeek(), 5); 
     assertEquals(false, DateTimeUtils.isContiguous(dd)); 
     try { 
         DateTimeUtils.isContiguous((ReadablePartial) null); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 } 


public void testMillisProvider_null508() { 
     try { 
         DateTimeUtils.setCurrentMillisProvider(null); 
     } catch (IllegalArgumentException ex) { 
     } 
 } 


public void testGetIntervalChronology_RInterval593() { 
     Interval dt = new Interval(123L, 456L, BuddhistChronology.getInstance()); 
     assertEquals(BuddhistChronology.getInstance(), DateTimeUtils.getIntervalChronology(dt)); 
     assertEquals(ISOChronology.getInstance(), DateTimeUtils.getIntervalChronology(null)); 
     MutableInterval ai = new MutableInterval() { 
  
         private static final long serialVersionUID = 1L; 
  
         public Chronology getChronology() { 
             return null; 
         } 
     }; 
     assertEquals(ISOChronology.getInstance(), DateTimeUtils.getIntervalChronology(ai)); 
 } 


@SuppressWarnings("deprecation") 
 public void testIsContiguous_RP_GJChronology682() { 
     YearMonthDay ymd = new YearMonthDay(2005, 6, 9, GJ); 
     assertEquals(true, DateTimeUtils.isContiguous(ymd)); 
     TimeOfDay tod = new TimeOfDay(12, 20, 30, 0, GJ); 
     assertEquals(true, DateTimeUtils.isContiguous(tod)); 
     Partial year = new Partial(DateTimeFieldType.year(), 2005, GJ); 
     assertEquals(true, DateTimeUtils.isContiguous(year)); 
     Partial hourOfDay = new Partial(DateTimeFieldType.hourOfDay(), 12, GJ); 
     assertEquals(true, DateTimeUtils.isContiguous(hourOfDay)); 
     Partial yearHour = year.with(DateTimeFieldType.hourOfDay(), 12); 
     assertEquals(false, DateTimeUtils.isContiguous(yearHour)); 
     Partial ymdd = new Partial(ymd).with(DateTimeFieldType.dayOfWeek(), 2); 
     assertEquals(false, DateTimeUtils.isContiguous(ymdd)); 
     Partial dd = new Partial(DateTimeFieldType.dayOfMonth(), 13).with(DateTimeFieldType.dayOfWeek(), 5); 
     assertEquals(false, DateTimeUtils.isContiguous(dd)); 
     try { 
         DateTimeUtils.isContiguous((ReadablePartial) null); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 } 


public void testClass961() { 
     Class<?> cls = DateTimeUtils.class; 
     assertEquals(true, Modifier.isPublic(cls.getModifiers())); 
     assertEquals(false, Modifier.isFinal(cls.getModifiers())); 
     assertEquals(1, cls.getDeclaredConstructors().length); 
     assertEquals(true, Modifier.isProtected(cls.getDeclaredConstructors()[0].getModifiers())); 
     new DateTimeUtils() { 
     }; 
 } 


public void testGetIntervalChronology_RI_RI1009() { 
     DateTime dt1 = new DateTime(123L, BuddhistChronology.getInstance()); 
     DateTime dt2 = new DateTime(123L, CopticChronology.getInstance()); 
     assertEquals(BuddhistChronology.getInstance(), DateTimeUtils.getIntervalChronology(dt1, dt2)); 
     assertEquals(BuddhistChronology.getInstance(), DateTimeUtils.getIntervalChronology(dt1, null)); 
     assertEquals(CopticChronology.getInstance(), DateTimeUtils.getIntervalChronology(null, dt2)); 
     assertEquals(ISOChronology.getInstance(), DateTimeUtils.getIntervalChronology(null, null)); 
 } 


public void test_julianDay1159() { 
     DateTime base = new DateTime(1970, 1, 1, 0, 0, DateTimeZone.UTC); 
     assertEquals(2440587.5d, DateTimeUtils.toJulianDay(base.getMillis()), 0.0001d); 
     assertEquals(2440588, DateTimeUtils.toJulianDayNumber(base.getMillis())); 
     assertEquals(base.getMillis(), DateTimeUtils.fromJulianDay(2440587.5d)); 
     base = base.plusHours(6); 
     assertEquals(2440587.75d, DateTimeUtils.toJulianDay(base.getMillis()), 0.0001d); 
     assertEquals(2440588, DateTimeUtils.toJulianDayNumber(base.getMillis())); 
     assertEquals(base.getMillis(), DateTimeUtils.fromJulianDay(2440587.75d)); 
     base = base.plusHours(6); 
     assertEquals(2440588d, DateTimeUtils.toJulianDay(base.getMillis()), 0.0001d); 
     assertEquals(2440588, DateTimeUtils.toJulianDayNumber(base.getMillis())); 
     assertEquals(base.getMillis(), DateTimeUtils.fromJulianDay(2440588d)); 
     base = base.plusHours(6); 
     assertEquals(2440588.25d, DateTimeUtils.toJulianDay(base.getMillis()), 0.0001d); 
     assertEquals(2440588, DateTimeUtils.toJulianDayNumber(base.getMillis())); 
     assertEquals(base.getMillis(), DateTimeUtils.fromJulianDay(2440588.25d)); 
     base = base.plusHours(6); 
     assertEquals(2440588.5d, DateTimeUtils.toJulianDay(base.getMillis()), 0.0001d); 
     assertEquals(2440589, DateTimeUtils.toJulianDayNumber(base.getMillis())); 
     assertEquals(base.getMillis(), DateTimeUtils.fromJulianDay(2440588.5d)); 
     base = new DateTime(2012, 8, 31, 23, 50, DateTimeZone.UTC); 
     assertEquals(2456171.4930555555, DateTimeUtils.toJulianDay(base.getMillis()), 0.0001d); 
     assertEquals(2456171, DateTimeUtils.toJulianDayNumber(base.getMillis())); 
     base = new DateTime(-4713, 1, 1, 12, 0, JulianChronology.getInstanceUTC()); 
     assertEquals(0d, DateTimeUtils.toJulianDay(base.getMillis()), 0.0001d); 
     assertEquals(0, DateTimeUtils.toJulianDayNumber(base.getMillis())); 
     assertEquals(base.getMillis(), DateTimeUtils.fromJulianDay(0d)); 
     base = new DateTime(-4713, 1, 1, 0, 0, JulianChronology.getInstanceUTC()); 
     assertEquals(-0.5d, DateTimeUtils.toJulianDay(base.getMillis()), 0.0001d); 
     assertEquals(0, DateTimeUtils.toJulianDayNumber(base.getMillis())); 
     assertEquals(base.getMillis(), DateTimeUtils.fromJulianDay(-0.5d)); 
 } 


public void testGetDurationMillis_RI1251() { 
     Duration dur = new Duration(123L); 
     assertEquals(123L, DateTimeUtils.getDurationMillis(dur)); 
     assertEquals(0L, DateTimeUtils.getDurationMillis(null)); 
 } 


public void testGetPeriodType_PeriodType1410() { 
     assertEquals(PeriodType.dayTime(), DateTimeUtils.getPeriodType(PeriodType.dayTime())); 
     assertEquals(PeriodType.standard(), DateTimeUtils.getPeriodType(null)); 
 } 


public void testGetZone_Zone1759() { 
     assertEquals(PARIS, DateTimeUtils.getZone(PARIS)); 
     assertEquals(DateTimeZone.getDefault(), DateTimeUtils.getZone(null)); 
 } 

    

    //-----------------------------------------------------------------------
    
    
    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    
// Defects4J: flaky method
//     public void testOffsetMillisToZero() {
//         long now1 = 0L;
//         try {
//             // set time to one day ago
//             DateTimeUtils.setCurrentMillisOffset(0);
//             now1 = DateTimeUtils.currentTimeMillis();
//         } finally {
//             DateTimeUtils.setCurrentMillisSystem();
//         }
//         long now2 = DateTimeUtils.currentTimeMillis();
//         assertEquals(now1, now2);
//     }

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

}
