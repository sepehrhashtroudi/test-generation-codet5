/*
 *  Copyright 2001-2006 Stephen Colebourne
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
package org.joda.time.convert;

import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.security.AllPermission;
import java.security.CodeSource;
import java.security.Permission;
import java.security.PermissionCollection;
import java.security.Permissions;
import java.security.Policy;
import java.security.ProtectionDomain;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.Chronology;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Duration;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.Interval;
import org.joda.time.JodaTimePermission;
import org.joda.time.ReadWritablePeriod;
import org.joda.time.ReadWritableInterval;
import org.joda.time.ReadableDateTime;
import org.joda.time.ReadableDuration;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadableInterval;
import org.joda.time.TimeOfDay;
import org.joda.time.format.DateTimeFormatter;

/**
 * This class is a JUnit test for ConverterManager.
 *
 * @author Stephen Colebourne
 */
public class TestConverterManager extends TestCase {
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
        return new TestSuite(TestConverterManager.class);
    }

    public TestConverterManager(String name) {
        super(name);
    }

    //-----------------------------------------------------------------------

public void testAddDurationConverter22() { 
     DurationConverter c = new DurationConverter() { 
  
         public long getDurationMillis(Object object) { 
             return 0; 
         } 
  
         public Class getSupportedType() { 
             return String.class; 
         } 
     }; 
     try { 
         DurationConverter removed = ConverterManager.getInstance().addDurationConverter(c); 
         assertEquals(StringConverter.INSTANCE, removed); 
         assertEquals(String.class, ConverterManager.getInstance().getDurationConverter("").getSupportedType()); 
         assertEquals(DURATION_SIZE, ConverterManager.getInstance().getDurationConverters().length); 
     } finally { 
         ConverterManager.getInstance().addDurationConverter(StringConverter.INSTANCE); 
     } 
     assertEquals(DURATION_SIZE, ConverterManager.getInstance().getDurationConverters().length); 
 } 


public void testGetInstantConverterOKMultipleMatches19() { 
     InstantConverter c = new InstantConverter() { 
  
         public long getInstantMillis(Object object, Chronology chrono) { 
             return 0; 
         } 
  
         public Chronology getChronology(Object object, DateTimeZone zone) { 
             return null; 
         } 
  
         public Chronology getChronology(Object object, Chronology chrono) { 
             return null; 
         } 
  
         public Class getSupportedType() { 
             return ReadableDateTime.class; 
         } 
     }; 
     try { 
         ConverterManager.getInstance().addInstantConverter(c); 
         InstantConverter ok = ConverterManager.getInstance().getInstantConverter(new DateTime()); 
         assertEquals(ReadableDateTime.class, ok.getSupportedType()); 
     } finally { 
         ConverterManager.getInstance().removeInstantConverter(c); 
     } 
     assertEquals(6, ConverterManager.getInstance().getInstantConverters().length); 
 } 


public void testGetPartialConverterOKMultipleMatches36() { 
     PartialConverter c = new PartialConverter() { 
  
         public int[] getPartialValues(ReadablePartial partial, Object object, Chronology chrono) { 
             return null; 
         } 
  
         public int[] getPartialValues(ReadablePartial partial, Object object, Chronology chrono, DateTimeFormatter parser) { 
             return null; 
         } 
  
         public Chronology getChronology(Object object, DateTimeZone zone) { 
             return null; 
         } 
  
         public Chronology getChronology(Object object, Chronology chrono) { 
             return null; 
         } 
  
         public Class getSupportedType() { 
             return ReadableDateTime.class; 
         } 
     }; 
     try { 
         ConverterManager.getInstance().addPartialConverter(c); 
         PartialConverter ok = ConverterManager.getInstance().getPartialConverter(new DateTime()); 
         assertEquals(ReadableDateTime.class, ok.getSupportedType()); 
     } finally { 
         ConverterManager.getInstance().removePartialConverter(c); 
     } 
     assertEquals(PARTIAL_SIZE, ConverterManager.getInstance().getPartialConverters().length); 
 } 


public void testAddInstantConverter4134() { 
     InstantConverter removed = ConverterManager.getInstance().addInstantConverter(null); 
     assertEquals(null, removed); 
     assertEquals(6, ConverterManager.getInstance().getInstantConverters().length); 
 } 


public void testGetInstantConverterBadMultipleMatches294() { 
     InstantConverter c = new InstantConverter() { 
  
         public long getInstantMillis(Object object, Chronology chrono) { 
             return 0; 
         } 
  
         public Chronology getChronology(Object object, DateTimeZone zone) { 
             return null; 
         } 
  
         public Chronology getChronology(Object object, Chronology chrono) { 
             return null; 
         } 
  
         public Class getSupportedType() { 
             return Serializable.class; 
         } 
     }; 
     try { 
         ConverterManager.getInstance().addInstantConverter(c); 
         try { 
             ConverterManager.getInstance().getInstantConverter(new DateTime()); 
             fail(); 
         } catch (IllegalStateException ex) { 
         } 
     } finally { 
         ConverterManager.getInstance().removeInstantConverter(c); 
     } 
     assertEquals(6, ConverterManager.getInstance().getInstantConverters().length); 
 } 


public void testGetIntervalConverterRemovedNull347() { 
     try { 
         ConverterManager.getInstance().removeIntervalConverter(NullConverter.INSTANCE); 
         try { 
             ConverterManager.getInstance().getIntervalConverter(null); 
             fail(); 
         } catch (IllegalArgumentException ex) { 
         } 
     } finally { 
         ConverterManager.getInstance().addIntervalConverter(NullConverter.INSTANCE); 
     } 
     assertEquals(INTERVAL_SIZE, ConverterManager.getInstance().getIntervalConverters().length); 
 } 


public void testRemoveDurationConverter3381() { 
     DurationConverter removed = ConverterManager.getInstance().removeDurationConverter(null); 
     assertEquals(null, removed); 
     assertEquals(DURATION_SIZE, ConverterManager.getInstance().getDurationConverters().length); 
 } 


public void testGetPeriodConverterRemovedNull383() { 
     try { 
         ConverterManager.getInstance().removePeriodConverter(NullConverter.INSTANCE); 
         try { 
             ConverterManager.getInstance().getPeriodConverter(null); 
             fail(); 
         } catch (IllegalArgumentException ex) { 
         } 
     } finally { 
         ConverterManager.getInstance().addPeriodConverter(NullConverter.INSTANCE); 
     } 
     assertEquals(PERIOD_SIZE, ConverterManager.getInstance().getPeriodConverters().length); 
 } 


public void testToString441() { 
     assertEquals("ConverterManager[6 instant,7 partial,5 duration,5 period,3 interval]", ConverterManager.getInstance().toString()); 
 } 


public void testRemoveIntervalConverter2545() { 
     IntervalConverter c = new IntervalConverter() { 
  
         public boolean isReadableInterval(Object object, Chronology chrono) { 
             return false; 
         } 
  
         public void setInto(ReadWritableInterval interval, Object object, Chronology chrono) { 
         } 
  
         public Class getSupportedType() { 
             return Boolean.class; 
         } 
     }; 
     IntervalConverter removed = ConverterManager.getInstance().removeIntervalConverter(c); 
     assertEquals(null, removed); 
     assertEquals(INTERVAL_SIZE, ConverterManager.getInstance().getIntervalConverters().length); 
 } 


public void testAddIntervalConverter1591() { 
     IntervalConverter c = new IntervalConverter() { 
  
         public boolean isReadableInterval(Object object, Chronology chrono) { 
             return false; 
         } 
  
         public void setInto(ReadWritableInterval interval, Object object, Chronology chrono) { 
         } 
  
         public Class getSupportedType() { 
             return Boolean.class; 
         } 
     }; 
     try { 
         IntervalConverter removed = ConverterManager.getInstance().addIntervalConverter(c); 
         assertEquals(null, removed); 
         assertEquals(Boolean.class, ConverterManager.getInstance().getIntervalConverter(Boolean.TRUE).getSupportedType()); 
         assertEquals(INTERVAL_SIZE + 1, ConverterManager.getInstance().getIntervalConverters().length); 
     } finally { 
         ConverterManager.getInstance().removeIntervalConverter(c); 
     } 
     assertEquals(INTERVAL_SIZE, ConverterManager.getInstance().getIntervalConverters().length); 
 } 


public void testGetPeriodConverter690() { 
     PeriodConverter c = ConverterManager.getInstance().getPeriodConverter(new Period(1, 2, 3, 4, 5, 6, 7, 8)); 
     assertEquals(ReadablePeriod.class, c.getSupportedType()); 
     c = ConverterManager.getInstance().getPeriodConverter(new Duration(123L)); 
     assertEquals(ReadableDuration.class, c.getSupportedType()); 
     c = ConverterManager.getInstance().getPeriodConverter(new Interval(0L, 1000L)); 
     assertEquals(ReadableInterval.class, c.getSupportedType()); 
     c = ConverterManager.getInstance().getPeriodConverter(""); 
     assertEquals(String.class, c.getSupportedType()); 
     c = ConverterManager.getInstance().getPeriodConverter(null); 
     assertEquals(null, c.getSupportedType()); 
     try { 
         ConverterManager.getInstance().getPeriodConverter(Boolean.TRUE); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 } 


public void testGetDurationConverterRemovedNull727() { 
     try { 
         ConverterManager.getInstance().removeDurationConverter(NullConverter.INSTANCE); 
         try { 
             ConverterManager.getInstance().getDurationConverter(null); 
             fail(); 
         } catch (IllegalArgumentException ex) { 
         } 
     } finally { 
         ConverterManager.getInstance().addDurationConverter(NullConverter.INSTANCE); 
     } 
     assertEquals(DURATION_SIZE, ConverterManager.getInstance().getDurationConverters().length); 
 } 


public void testGetIntervalConverter824() { 
     IntervalConverter c = ConverterManager.getInstance().getIntervalConverter(new Interval(0L, 1000L)); 
     assertEquals(ReadableInterval.class, c.getSupportedType()); 
     c = ConverterManager.getInstance().getIntervalConverter(""); 
     assertEquals(String.class, c.getSupportedType()); 
     c = ConverterManager.getInstance().getIntervalConverter(null); 
     assertEquals(null, c.getSupportedType()); 
     try { 
         ConverterManager.getInstance().getIntervalConverter(Boolean.TRUE); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     try { 
         ConverterManager.getInstance().getIntervalConverter(new Long(0)); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 } 


public void testRemoveInstantConverter3861() { 
     InstantConverter removed = ConverterManager.getInstance().removeInstantConverter(null); 
     assertEquals(null, removed); 
     assertEquals(6, ConverterManager.getInstance().getInstantConverters().length); 
 } 


public void testGetInstantConverter886() { 
     InstantConverter c = ConverterManager.getInstance().getInstantConverter(new Long(0L)); 
     assertEquals(Long.class, c.getSupportedType()); 
     c = ConverterManager.getInstance().getInstantConverter(new DateTime()); 
     assertEquals(ReadableInstant.class, c.getSupportedType()); 
     c = ConverterManager.getInstance().getInstantConverter(""); 
     assertEquals(String.class, c.getSupportedType()); 
     c = ConverterManager.getInstance().getInstantConverter(new Date()); 
     assertEquals(Date.class, c.getSupportedType()); 
     c = ConverterManager.getInstance().getInstantConverter(new GregorianCalendar()); 
     assertEquals(Calendar.class, c.getSupportedType()); 
     c = ConverterManager.getInstance().getInstantConverter(null); 
     assertEquals(null, c.getSupportedType()); 
     try { 
         ConverterManager.getInstance().getInstantConverter(Boolean.TRUE); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 } 


public void testRemoveIntervalConverter31067() { 
     IntervalConverter removed = ConverterManager.getInstance().removeIntervalConverter(null); 
     assertEquals(null, removed); 
     assertEquals(INTERVAL_SIZE, ConverterManager.getInstance().getIntervalConverters().length); 
 } 


public void testAddPartialConverter41071() { 
     PartialConverter removed = ConverterManager.getInstance().addPartialConverter(null); 
     assertEquals(null, removed); 
     assertEquals(PARTIAL_SIZE, ConverterManager.getInstance().getPartialConverters().length); 
 } 


public void testGetDurationConverter1202() { 
     DurationConverter c = ConverterManager.getInstance().getDurationConverter(new Long(0L)); 
     assertEquals(Long.class, c.getSupportedType()); 
     c = ConverterManager.getInstance().getDurationConverter(new Duration(123L)); 
     assertEquals(ReadableDuration.class, c.getSupportedType()); 
     c = ConverterManager.getInstance().getDurationConverter(new Interval(0L, 1000L)); 
     assertEquals(ReadableInterval.class, c.getSupportedType()); 
     c = ConverterManager.getInstance().getDurationConverter(""); 
     assertEquals(String.class, c.getSupportedType()); 
     c = ConverterManager.getInstance().getDurationConverter(null); 
     assertEquals(null, c.getSupportedType()); 
     try { 
         ConverterManager.getInstance().getDurationConverter(Boolean.TRUE); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 } 


public void testAddPeriodConverter31253() { 
     PeriodConverter removed = ConverterManager.getInstance().addPeriodConverter(null); 
     assertEquals(null, removed); 
     assertEquals(PERIOD_SIZE, ConverterManager.getInstance().getPeriodConverters().length); 
 } 


public void testAddPartialConverter21317() { 
     PartialConverter c = new PartialConverter() { 
  
         public int[] getPartialValues(ReadablePartial partial, Object object, Chronology chrono) { 
             return null; 
         } 
  
         public int[] getPartialValues(ReadablePartial partial, Object object, Chronology chrono, DateTimeFormatter parser) { 
             return null; 
         } 
  
         public Chronology getChronology(Object object, DateTimeZone zone) { 
             return null; 
         } 
  
         public Chronology getChronology(Object object, Chronology chrono) { 
             return null; 
         } 
  
         public Class getSupportedType() { 
             return String.class; 
         } 
     }; 
     try { 
         PartialConverter removed = ConverterManager.getInstance().addPartialConverter(c); 
         assertEquals(StringConverter.INSTANCE, removed); 
         assertEquals(String.class, ConverterManager.getInstance().getPartialConverter("").getSupportedType()); 
         assertEquals(PARTIAL_SIZE, ConverterManager.getInstance().getPartialConverters().length); 
     } finally { 
         ConverterManager.getInstance().addPartialConverter(StringConverter.INSTANCE); 
     } 
     assertEquals(PARTIAL_SIZE, ConverterManager.getInstance().getPartialConverters().length); 
 } 


public void testRemovePartialConverter31430() { 
     PartialConverter removed = ConverterManager.getInstance().removePartialConverter(null); 
     assertEquals(null, removed); 
     assertEquals(PARTIAL_SIZE, ConverterManager.getInstance().getPartialConverters().length); 
 } 


public void testGetPartialConverterRemovedNull1486() { 
     try { 
         ConverterManager.getInstance().removePartialConverter(NullConverter.INSTANCE); 
         try { 
             ConverterManager.getInstance().getPartialConverter(null); 
             fail(); 
         } catch (IllegalArgumentException ex) { 
         } 
     } finally { 
         ConverterManager.getInstance().addPartialConverter(NullConverter.INSTANCE); 
     } 
     assertEquals(PARTIAL_SIZE, ConverterManager.getInstance().getPartialConverters().length); 
 } 


public void testGetPartialConverter1512() { 
     PartialConverter c = ConverterManager.getInstance().getPartialConverter(new Long(0L)); 
     assertEquals(Long.class, c.getSupportedType()); 
     c = ConverterManager.getInstance().getPartialConverter(new TimeOfDay()); 
     assertEquals(ReadablePartial.class, c.getSupportedType()); 
     c = ConverterManager.getInstance().getPartialConverter(new DateTime()); 
     assertEquals(ReadableInstant.class, c.getSupportedType()); 
     c = ConverterManager.getInstance().getPartialConverter(""); 
     assertEquals(String.class, c.getSupportedType()); 
     c = ConverterManager.getInstance().getPartialConverter(new Date()); 
     assertEquals(Date.class, c.getSupportedType()); 
     c = ConverterManager.getInstance().getPartialConverter(new GregorianCalendar()); 
     assertEquals(Calendar.class, c.getSupportedType()); 
     c = ConverterManager.getInstance().getPartialConverter(null); 
     assertEquals(null, c.getSupportedType()); 
     try { 
         ConverterManager.getInstance().getPartialConverter(Boolean.TRUE); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 } 


public void testAddPartialConverter31558() { 
     PartialConverter removed = ConverterManager.getInstance().addPartialConverter(StringConverter.INSTANCE); 
     assertEquals(null, removed); 
     assertEquals(PARTIAL_SIZE, ConverterManager.getInstance().getPartialConverters().length); 
 } 


public void testRemovePeriodConverter31600() { 
     PeriodConverter removed = ConverterManager.getInstance().removePeriodConverter(null); 
     assertEquals(null, removed); 
     assertEquals(PERIOD_SIZE, ConverterManager.getInstance().getPeriodConverters().length); 
 } 


public void testAddIntervalConverter31696() { 
     IntervalConverter removed = ConverterManager.getInstance().addIntervalConverter(null); 
     assertEquals(null, removed); 
     assertEquals(INTERVAL_SIZE, ConverterManager.getInstance().getIntervalConverters().length); 
 } 


public void testGetInstantConverterRemovedNull1753() { 
     try { 
         ConverterManager.getInstance().removeInstantConverter(NullConverter.INSTANCE); 
         try { 
             ConverterManager.getInstance().getInstantConverter(null); 
             fail(); 
         } catch (IllegalArgumentException ex) { 
         } 
     } finally { 
         ConverterManager.getInstance().addInstantConverter(NullConverter.INSTANCE); 
     } 
     assertEquals(6, ConverterManager.getInstance().getInstantConverters().length); 
 } 


public void testAddDurationConverter31762() { 
     DurationConverter removed = ConverterManager.getInstance().addDurationConverter(null); 
     assertEquals(null, removed); 
     assertEquals(DURATION_SIZE, ConverterManager.getInstance().getDurationConverters().length); 
 } 

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    private static final int PARTIAL_SIZE = 7;
    
    

    

    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    private static int DURATION_SIZE = 5;
    
    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    private static int PERIOD_SIZE = 5;
    
    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    //-----------------------------------------------------------------------
    private static int INTERVAL_SIZE = 3;

    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

    

    

    

    //-----------------------------------------------------------------------
    

}
