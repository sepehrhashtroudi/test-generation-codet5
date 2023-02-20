/*
 *  Copyright 2001-2005 Stephen Colebourne
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

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Locale;
import java.util.TimeZone;

import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * This class is a JUnit test for PeriodType.
 *
 * @author Stephen Colebourne
 */
public class TestPeriodType extends TestCase {
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)

    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");
    private static final DateTimeZone LONDON = DateTimeZone.forID("Europe/London");
    
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
    
    private DateTimeZone originalDateTimeZone = null;
    private TimeZone originalTimeZone = null;
    private Locale originalLocale = null;

    public static void main(String[] args) {
        junit.textui.TestRunner.run(suite());
    }

    public static TestSuite suite() {
        return new TestSuite(TestPeriodType.class);
    }

    public TestPeriodType(String name) {
        super(name);
    }

    protected void setUp() throws Exception {
        DateTimeUtils.setCurrentMillisFixed(TEST_TIME_NOW);
        originalDateTimeZone = DateTimeZone.getDefault();
        originalTimeZone = TimeZone.getDefault();
        originalLocale = Locale.getDefault();
        DateTimeZone.setDefault(LONDON);
        TimeZone.setDefault(TimeZone.getTimeZone("Europe/London"));
        Locale.setDefault(Locale.UK);
    }

    protected void tearDown() throws Exception {
        DateTimeUtils.setCurrentMillisSystem();
        DateTimeZone.setDefault(originalDateTimeZone);
        TimeZone.setDefault(originalTimeZone);
        Locale.setDefault(originalLocale);
        originalDateTimeZone = null;
        originalTimeZone = null;
        originalLocale = null;
    }

    //-----------------------------------------------------------------------

public void testForFields471() throws Exception { 
     DurationFieldType[] types = new DurationFieldType[] { DurationFieldType.weeks(), DurationFieldType.days(), DurationFieldType.months() }; 
     DurationFieldType[] types2 = new DurationFieldType[] { DurationFieldType.months(), DurationFieldType.days(), DurationFieldType.weeks() }; 
     PeriodType type = PeriodType.forFields(types); 
     PeriodType type2 = PeriodType.forFields(types2); 
     assertEquals(true, type == type2); 
 } 


public void testYears438() throws Exception { 
     PeriodType type = PeriodType.years(); 
     assertEquals(1, type.size()); 
     assertEquals(DurationFieldType.years(), type.getFieldType(0)); 
     assertEquals("Years", type.getName()); 
     assertEquals("PeriodType[Years]", type.toString()); 
     assertEquals(true, type.equals(type)); 
     assertEquals(true, type == PeriodType.years()); 
     assertEquals(false, type.equals(PeriodType.standard())); 
     assertEquals(true, type.hashCode() == type.hashCode()); 
     assertEquals(true, type.hashCode() == PeriodType.years().hashCode()); 
     assertEquals(false, type.hashCode() == PeriodType.standard().hashCode()); 
     assertSameAfterSerialization(type); 
 } 


public void testYearDayTime582() throws Exception { 
     PeriodType type = PeriodType.yearDayTime(); 
     assertEquals(6, type.size()); 
     assertEquals(DurationFieldType.years(), type.getFieldType(0)); 
     assertEquals(DurationFieldType.days(), type.getFieldType(1)); 
     assertEquals(DurationFieldType.hours(), type.getFieldType(2)); 
     assertEquals(DurationFieldType.minutes(), type.getFieldType(3)); 
     assertEquals(DurationFieldType.seconds(), type.getFieldType(4)); 
     assertEquals(DurationFieldType.millis(), type.getFieldType(5)); 
     assertEquals("YearDayTime", type.getName()); 
     assertEquals("PeriodType[YearDayTime]", type.toString()); 
     assertEquals(true, type.equals(type)); 
     assertEquals(true, type == PeriodType.yearDayTime()); 
     assertEquals(false, type.equals(PeriodType.millis())); 
     assertEquals(true, type.hashCode() == type.hashCode()); 
     assertEquals(true, type.hashCode() == PeriodType.yearDayTime().hashCode()); 
     assertEquals(false, type.hashCode() == PeriodType.millis().hashCode()); 
     assertSameAfterSerialization(type); 
 } 


public void testYearMonthDay594() throws Exception { 
     PeriodType type = PeriodType.yearMonthDay(); 
     assertEquals(3, type.size()); 
     assertEquals(DurationFieldType.years(), type.getFieldType(0)); 
     assertEquals(DurationFieldType.months(), type.getFieldType(1)); 
     assertEquals(DurationFieldType.days(), type.getFieldType(2)); 
     assertEquals("YearMonthDay", type.getName()); 
     assertEquals("PeriodType[YearMonthDay]", type.toString()); 
     assertEquals(true, type.equals(type)); 
     assertEquals(true, type == PeriodType.yearMonthDay()); 
     assertEquals(false, type.equals(PeriodType.millis())); 
     assertEquals(true, type.hashCode() == type.hashCode()); 
     assertEquals(true, type.hashCode() == PeriodType.yearMonthDay().hashCode()); 
     assertEquals(false, type.hashCode() == PeriodType.millis().hashCode()); 
     assertSameAfterSerialization(type); 
 } 


public void testDays894() throws Exception { 
     PeriodType type = PeriodType.days(); 
     assertEquals(1, type.size()); 
     assertEquals(DurationFieldType.days(), type.getFieldType(0)); 
     assertEquals("Days", type.getName()); 
     assertEquals("PeriodType[Days]", type.toString()); 
     assertEquals(true, type.equals(type)); 
     assertEquals(true, type == PeriodType.days()); 
     assertEquals(false, type.equals(PeriodType.standard())); 
     assertEquals(true, type.hashCode() == type.hashCode()); 
     assertEquals(true, type.hashCode() == PeriodType.days().hashCode()); 
     assertEquals(false, type.hashCode() == PeriodType.standard().hashCode()); 
     assertSameAfterSerialization(type); 
 } 


public void testMaskTwice2915() throws Exception { 
     PeriodType type = PeriodType.dayTime(); 
     PeriodType type2 = type.withYearsRemoved(); 
     assertEquals(true, type == type2); 
     type = PeriodType.dayTime(); 
     type2 = type.withMonthsRemoved(); 
     assertEquals(true, type == type2); 
     type = PeriodType.dayTime(); 
     type2 = type.withWeeksRemoved(); 
     assertEquals(true, type == type2); 
     type = PeriodType.millis(); 
     type2 = type.withDaysRemoved(); 
     assertEquals(true, type == type2); 
     type = PeriodType.millis(); 
     type2 = type.withHoursRemoved(); 
     assertEquals(true, type == type2); 
     type = PeriodType.millis(); 
     type2 = type.withMinutesRemoved(); 
     assertEquals(true, type == type2); 
     type = PeriodType.millis(); 
     type2 = type.withSecondsRemoved(); 
     assertEquals(true, type == type2); 
 } 


public void testForFields71025() throws Exception { 
     DurationFieldType[] types = new DurationFieldType[] { DurationFieldType.weeks(), DurationFieldType.months() }; 
     DurationFieldType[] types2 = new DurationFieldType[] { DurationFieldType.seconds() }; 
     PeriodType type = PeriodType.forFields(types); 
     PeriodType type2 = PeriodType.forFields(types2); 
     assertEquals(false, type == type2); 
     assertEquals(false, type.equals(type2)); 
     assertEquals(false, type.hashCode() == type2.hashCode()); 
 } 


public void testForFields61154() throws Exception { 
     DurationFieldType[] types = null; 
     try { 
         PeriodType.forFields(types); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     types = new DurationFieldType[0]; 
     try { 
         PeriodType.forFields(types); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     types = new DurationFieldType[] { null, DurationFieldType.months() }; 
     try { 
         PeriodType.forFields(types); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     types = new DurationFieldType[] { DurationFieldType.months(), null }; 
     try { 
         PeriodType.forFields(types); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 } 


public void testEquals1204() throws Exception { 
     PeriodType type = PeriodType.dayTime().withMillisRemoved(); 
     assertEquals(true, type.equals(type)); 
     assertEquals(true, type.equals(PeriodType.dayTime().withMillisRemoved())); 
     assertEquals(false, type.equals(null)); 
     assertEquals(false, type.equals("")); 
 } 


public void testIsSupported1213() throws Exception { 
     PeriodType type = PeriodType.dayTime().withMillisRemoved(); 
     assertEquals(false, type.isSupported(DurationFieldType.years())); 
     assertEquals(false, type.isSupported(DurationFieldType.months())); 
     assertEquals(false, type.isSupported(DurationFieldType.weeks())); 
     assertEquals(true, type.isSupported(DurationFieldType.days())); 
     assertEquals(true, type.isSupported(DurationFieldType.hours())); 
     assertEquals(true, type.isSupported(DurationFieldType.minutes())); 
     assertEquals(true, type.isSupported(DurationFieldType.seconds())); 
     assertEquals(false, type.isSupported(DurationFieldType.millis())); 
 } 


public void testForFields21264() throws Exception { 
     DurationFieldType[] types = new DurationFieldType[] { DurationFieldType.years(), DurationFieldType.hours() }; 
     PeriodType type = PeriodType.forFields(types); 
     assertEquals(2, type.size()); 
     assertEquals(DurationFieldType.years(), type.getFieldType(0)); 
     assertEquals(DurationFieldType.hours(), type.getFieldType(1)); 
     assertEquals("StandardNoMonthsNoWeeksNoDaysNoMinutesNoSecondsNoMillis", type.getName()); 
     assertEquals("PeriodType[StandardNoMonthsNoWeeksNoDaysNoMinutesNoSecondsNoMillis]", type.toString()); 
     assertEquals(true, type.equals(type)); 
     assertEquals(true, type == PeriodType.forFields(types)); 
     assertEquals(false, type.equals(PeriodType.millis())); 
     assertEquals(true, type.hashCode() == type.hashCode()); 
     assertEquals(true, type.hashCode() == PeriodType.forFields(types).hashCode()); 
     assertEquals(false, type.hashCode() == PeriodType.millis().hashCode()); 
     assertSameAfterSerialization(type); 
 } 


public void testMaskMinutes1267() throws Exception { 
     PeriodType type = PeriodType.standard().withMinutesRemoved(); 
     assertEquals(7, type.size()); 
     assertEquals(DurationFieldType.years(), type.getFieldType(0)); 
     assertEquals(DurationFieldType.months(), type.getFieldType(1)); 
     assertEquals(DurationFieldType.weeks(), type.getFieldType(2)); 
     assertEquals(DurationFieldType.days(), type.getFieldType(3)); 
     assertEquals(DurationFieldType.hours(), type.getFieldType(4)); 
     assertEquals(DurationFieldType.seconds(), type.getFieldType(5)); 
     assertEquals(DurationFieldType.millis(), type.getFieldType(6)); 
     assertEquals(true, type.equals(type)); 
     assertEquals(true, type.equals(PeriodType.standard().withMinutesRemoved())); 
     assertEquals(false, type.equals(PeriodType.millis())); 
     assertEquals(true, type.hashCode() == type.hashCode()); 
     assertEquals(true, type.hashCode() == PeriodType.standard().withMinutesRemoved().hashCode()); 
     assertEquals(false, type.hashCode() == PeriodType.millis().hashCode()); 
     assertEquals("StandardNoMinutes", type.getName()); 
     assertEquals("PeriodType[StandardNoMinutes]", type.toString()); 
     assertEqualsAfterSerialization(type); 
 } 


public void testYearWeekDayTime1333() throws Exception { 
     PeriodType type = PeriodType.yearWeekDayTime(); 
     assertEquals(7, type.size()); 
     assertEquals(DurationFieldType.years(), type.getFieldType(0)); 
     assertEquals(DurationFieldType.weeks(), type.getFieldType(1)); 
     assertEquals(DurationFieldType.days(), type.getFieldType(2)); 
     assertEquals(DurationFieldType.hours(), type.getFieldType(3)); 
     assertEquals(DurationFieldType.minutes(), type.getFieldType(4)); 
     assertEquals(DurationFieldType.seconds(), type.getFieldType(5)); 
     assertEquals(DurationFieldType.millis(), type.getFieldType(6)); 
     assertEquals("YearWeekDayTime", type.getName()); 
     assertEquals("PeriodType[YearWeekDayTime]", type.toString()); 
     assertEquals(true, type.equals(type)); 
     assertEquals(true, type == PeriodType.yearWeekDayTime()); 
     assertEquals(false, type.equals(PeriodType.millis())); 
     assertEquals(true, type.hashCode() == type.hashCode()); 
     assertEquals(true, type.hashCode() == PeriodType.yearWeekDayTime().hashCode()); 
     assertEquals(false, type.hashCode() == PeriodType.millis().hashCode()); 
     assertSameAfterSerialization(type); 
 } 


public void testSeconds1335() throws Exception { 
     PeriodType type = PeriodType.seconds(); 
     assertEquals(1, type.size()); 
     assertEquals(DurationFieldType.seconds(), type.getFieldType(0)); 
     assertEquals("Seconds", type.getName()); 
     assertEquals("PeriodType[Seconds]", type.toString()); 
     assertEquals(true, type.equals(type)); 
     assertEquals(true, type == PeriodType.seconds()); 
     assertEquals(false, type.equals(PeriodType.standard())); 
     assertEquals(true, type.hashCode() == type.hashCode()); 
     assertEquals(true, type.hashCode() == PeriodType.seconds().hashCode()); 
     assertEquals(false, type.hashCode() == PeriodType.standard().hashCode()); 
     assertSameAfterSerialization(type); 
 } 


public void testForFields11366() throws Exception { 
     PeriodType type = PeriodType.forFields(new DurationFieldType[] { DurationFieldType.years() }); 
     assertSame(PeriodType.years(), type); 
     type = PeriodType.forFields(new DurationFieldType[] { DurationFieldType.months() }); 
     assertSame(PeriodType.months(), type); 
     type = PeriodType.forFields(new DurationFieldType[] { DurationFieldType.weeks() }); 
     assertSame(PeriodType.weeks(), type); 
     type = PeriodType.forFields(new DurationFieldType[] { DurationFieldType.days() }); 
     assertSame(PeriodType.days(), type); 
     type = PeriodType.forFields(new DurationFieldType[] { DurationFieldType.hours() }); 
     assertSame(PeriodType.hours(), type); 
     type = PeriodType.forFields(new DurationFieldType[] { DurationFieldType.minutes() }); 
     assertSame(PeriodType.minutes(), type); 
     type = PeriodType.forFields(new DurationFieldType[] { DurationFieldType.seconds() }); 
     assertSame(PeriodType.seconds(), type); 
     type = PeriodType.forFields(new DurationFieldType[] { DurationFieldType.millis() }); 
     assertSame(PeriodType.millis(), type); 
 } 


public void testMaskMillis1481() throws Exception { 
     PeriodType type = PeriodType.standard().withMillisRemoved(); 
     assertEquals(7, type.size()); 
     assertEquals(DurationFieldType.years(), type.getFieldType(0)); 
     assertEquals(DurationFieldType.months(), type.getFieldType(1)); 
     assertEquals(DurationFieldType.weeks(), type.getFieldType(2)); 
     assertEquals(DurationFieldType.days(), type.getFieldType(3)); 
     assertEquals(DurationFieldType.hours(), type.getFieldType(4)); 
     assertEquals(DurationFieldType.minutes(), type.getFieldType(5)); 
     assertEquals(DurationFieldType.seconds(), type.getFieldType(6)); 
     assertEquals(true, type.equals(type)); 
     assertEquals(true, type.equals(PeriodType.standard().withMillisRemoved())); 
     assertEquals(false, type.equals(PeriodType.millis())); 
     assertEquals(true, type.hashCode() == type.hashCode()); 
     assertEquals(true, type.hashCode() == PeriodType.standard().withMillisRemoved().hashCode()); 
     assertEquals(false, type.hashCode() == PeriodType.millis().hashCode()); 
     assertEquals("StandardNoMillis", type.getName()); 
     assertEquals("PeriodType[StandardNoMillis]", type.toString()); 
     assertEqualsAfterSerialization(type); 
 } 


public void testYearDay1583() throws Exception { 
     PeriodType type = PeriodType.yearDay(); 
     assertEquals(2, type.size()); 
     assertEquals(DurationFieldType.years(), type.getFieldType(0)); 
     assertEquals(DurationFieldType.days(), type.getFieldType(1)); 
     assertEquals("YearDay", type.getName()); 
     assertEquals("PeriodType[YearDay]", type.toString()); 
     assertEquals(true, type.equals(type)); 
     assertEquals(true, type == PeriodType.yearDay()); 
     assertEquals(false, type.equals(PeriodType.millis())); 
     assertEquals(true, type.hashCode() == type.hashCode()); 
     assertEquals(true, type.hashCode() == PeriodType.yearDay().hashCode()); 
     assertEquals(false, type.hashCode() == PeriodType.millis().hashCode()); 
     assertSameAfterSerialization(type); 
 } 


public void testYearWeekDay1656() throws Exception { 
     PeriodType type = PeriodType.yearWeekDay(); 
     assertEquals(3, type.size()); 
     assertEquals(DurationFieldType.years(), type.getFieldType(0)); 
     assertEquals(DurationFieldType.weeks(), type.getFieldType(1)); 
     assertEquals(DurationFieldType.days(), type.getFieldType(2)); 
     assertEquals("YearWeekDay", type.getName()); 
     assertEquals("PeriodType[YearWeekDay]", type.toString()); 
     assertEquals(true, type.equals(type)); 
     assertEquals(true, type == PeriodType.yearWeekDay()); 
     assertEquals(false, type.equals(PeriodType.millis())); 
     assertEquals(true, type.hashCode() == type.hashCode()); 
     assertEquals(true, type.hashCode() == PeriodType.yearWeekDay().hashCode()); 
     assertEquals(false, type.hashCode() == PeriodType.millis().hashCode()); 
     assertSameAfterSerialization(type); 
 } 


public void testMaskYears1671() throws Exception { 
     PeriodType type = PeriodType.standard().withYearsRemoved(); 
     assertEquals(7, type.size()); 
     assertEquals(DurationFieldType.months(), type.getFieldType(0)); 
     assertEquals(DurationFieldType.weeks(), type.getFieldType(1)); 
     assertEquals(DurationFieldType.days(), type.getFieldType(2)); 
     assertEquals(DurationFieldType.hours(), type.getFieldType(3)); 
     assertEquals(DurationFieldType.minutes(), type.getFieldType(4)); 
     assertEquals(DurationFieldType.seconds(), type.getFieldType(5)); 
     assertEquals(DurationFieldType.millis(), type.getFieldType(6)); 
     assertEquals(true, type.equals(type)); 
     assertEquals(true, type.equals(PeriodType.standard().withYearsRemoved())); 
     assertEquals(false, type.equals(PeriodType.millis())); 
     assertEquals(true, type.hashCode() == type.hashCode()); 
     assertEquals(true, type.hashCode() == PeriodType.standard().withYearsRemoved().hashCode()); 
     assertEquals(false, type.hashCode() == PeriodType.millis().hashCode()); 
     assertEquals("StandardNoYears", type.getName()); 
     assertEquals("PeriodType[StandardNoYears]", type.toString()); 
     assertEqualsAfterSerialization(type); 
 } 


public void testForFields51679() throws Exception { 
     DurationFieldType[] types = new DurationFieldType[] { DurationFieldType.centuries(), DurationFieldType.months() }; 
     try { 
         PeriodType.forFields(types); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     try { 
         PeriodType.forFields(types); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 } 

    

    //-----------------------------------------------------------------------
    private void assertEqualsAfterSerialization(PeriodType type) throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(type);
        byte[] bytes = baos.toByteArray();
        oos.close();
        
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        ObjectInputStream ois = new ObjectInputStream(bais);
        PeriodType result = (PeriodType) ois.readObject();
        ois.close();
        
        assertEquals(type, result);
    }

    private void assertSameAfterSerialization(PeriodType type) throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(type);
        byte[] bytes = baos.toByteArray();
        oos.close();
        
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        ObjectInputStream ois = new ObjectInputStream(bais);
        PeriodType result = (PeriodType) ois.readObject();
        ois.close();
        
        assertEquals(type, result);
    }

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
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    // ensure hash key distribution
    

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
