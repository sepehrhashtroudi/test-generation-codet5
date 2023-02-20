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

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * This class is a Junit unit test for Months.
 *
 * @author Stephen Colebourne
 */
public class TestMonths extends TestCase {
    // Test in 2002/03 as time zones are more well known
    // (before the late 90's they were all over the place)
    private static final DateTimeZone PARIS = DateTimeZone.forID("Europe/Paris");

    public static void main(String[] args) {
        junit.textui.TestRunner.run(suite());
    }

    public static TestSuite suite() {
        return new TestSuite(TestMonths.class);
    }

    public TestMonths(String name) {
        super(name);
    }

    protected void setUp() throws Exception {
    }

    protected void tearDown() throws Exception {
    }

    //-----------------------------------------------------------------------

public void testDividedBy_int132() { 
     Months test = Months.months(12); 
     assertEquals(6, test.dividedBy(2).getMonths()); 
     assertEquals(12, test.getMonths()); 
     assertEquals(4, test.dividedBy(3).getMonths()); 
     assertEquals(3, test.dividedBy(4).getMonths()); 
     assertEquals(2, test.dividedBy(5).getMonths()); 
     assertEquals(2, test.dividedBy(6).getMonths()); 
     assertSame(test, test.dividedBy(1)); 
     try { 
         Months.ONE.dividedBy(0); 
         fail(); 
     } catch (ArithmeticException ex) { 
     } 
 } 


public void testFactory_parseMonths_String133() { 
     assertEquals(0, Months.parseMonths((String) null).getMonths()); 
     assertEquals(0, Months.parseMonths("P0M").getMonths()); 
     assertEquals(1, Months.parseMonths("P1M").getMonths()); 
     assertEquals(-3, Months.parseMonths("P-3M").getMonths()); 
     assertEquals(2, Months.parseMonths("P0Y2M").getMonths()); 
     assertEquals(2, Months.parseMonths("P2MT0H0M").getMonths()); 
     try { 
         Months.parseMonths("P1Y1D"); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
     try { 
         Months.parseMonths("P1MT1H"); 
         fail(); 
     } catch (IllegalArgumentException ex) { 
     } 
 } 


public void testMinus_Months258() { 
     Months test2 = Months.months(2); 
     Months test3 = Months.months(3); 
     Months result = test2.minus(test3); 
     assertEquals(2, test2.getMonths()); 
     assertEquals(3, test3.getMonths()); 
     assertEquals(-1, result.getMonths()); 
     assertEquals(1, Months.ONE.minus(Months.ZERO).getMonths()); 
     assertEquals(1, Months.ONE.minus((Months) null).getMonths()); 
     try { 
         Months.MIN_VALUE.minus(Months.ONE); 
         fail(); 
     } catch (ArithmeticException ex) { 
     } 
 } 


public void testSerialization281() throws Exception { 
     Months test = Months.THREE; 
     ByteArrayOutputStream baos = new ByteArrayOutputStream(); 
     ObjectOutputStream oos = new ObjectOutputStream(baos); 
     oos.writeObject(test); 
     byte[] bytes = baos.toByteArray(); 
     oos.close(); 
     ByteArrayInputStream bais = new ByteArrayInputStream(bytes); 
     ObjectInputStream ois = new ObjectInputStream(bais); 
     Months result = (Months) ois.readObject(); 
     ois.close(); 
     assertSame(test, result); 
 } 


public void testFactory_monthsBetween_RInstant461() { 
     DateTime start = new DateTime(2006, 6, 9, 12, 0, 0, 0, PARIS); 
     DateTime end1 = new DateTime(2006, 9, 9, 12, 0, 0, 0, PARIS); 
     DateTime end2 = new DateTime(2006, 12, 9, 12, 0, 0, 0, PARIS); 
     assertEquals(3, Months.monthsBetween(start, end1).getMonths()); 
     assertEquals(0, Months.monthsBetween(start, start).getMonths()); 
     assertEquals(0, Months.monthsBetween(end1, end1).getMonths()); 
     assertEquals(-3, Months.monthsBetween(end1, start).getMonths()); 
     assertEquals(6, Months.monthsBetween(start, end2).getMonths()); 
 } 


public void testPlus_Months494() { 
     Months test2 = Months.months(2); 
     Months test3 = Months.months(3); 
     Months result = test2.plus(test3); 
     assertEquals(2, test2.getMonths()); 
     assertEquals(3, test3.getMonths()); 
     assertEquals(5, result.getMonths()); 
     assertEquals(1, Months.ONE.plus(Months.ZERO).getMonths()); 
     assertEquals(1, Months.ONE.plus((Months) null).getMonths()); 
     try { 
         Months.MAX_VALUE.plus(Months.ONE); 
         fail(); 
     } catch (ArithmeticException ex) { 
     } 
 } 


public void testFactory_monthsBetween_RPartial_YearMonth649() { 
     YearMonth start1 = new YearMonth(2011, 1); 
     for (int i = 0; i < 6; i++) { 
         YearMonth start2 = new YearMonth(2011 + i, 1); 
         YearMonth end = new YearMonth(2011 + i, 3); 
         assertEquals(i * 12 + 2, Months.monthsBetween(start1, end).getMonths()); 
         assertEquals(2, Months.monthsBetween(start2, end).getMonths()); 
     } 
 } 


public void testToString843() { 
     Months test = Months.months(20); 
     assertEquals("P20M", test.toString()); 
     test = Months.months(-20); 
     assertEquals("P-20M", test.toString()); 
 } 


public void testGetPeriodType860() { 
     Months test = Months.months(20); 
     assertEquals(PeriodType.months(), test.getPeriodType()); 
 } 


@SuppressWarnings("deprecation") 
 public void testFactory_monthsBetween_RPartial_LocalDate1061() { 
     LocalDate start = new LocalDate(2006, 6, 9); 
     LocalDate end1 = new LocalDate(2006, 9, 9); 
     YearMonthDay end2 = new YearMonthDay(2006, 12, 9); 
     assertEquals(3, Months.monthsBetween(start, end1).getMonths()); 
     assertEquals(0, Months.monthsBetween(start, start).getMonths()); 
     assertEquals(0, Months.monthsBetween(end1, end1).getMonths()); 
     assertEquals(-3, Months.monthsBetween(end1, start).getMonths()); 
     assertEquals(6, Months.monthsBetween(start, end2).getMonths()); 
 } 


public void testIsLessThan1128() { 
     assertEquals(false, Months.THREE.isLessThan(Months.TWO)); 
     assertEquals(false, Months.THREE.isLessThan(Months.THREE)); 
     assertEquals(true, Months.TWO.isLessThan(Months.THREE)); 
     assertEquals(false, Months.ONE.isLessThan(null)); 
     assertEquals(true, Months.months(-1).isLessThan(null)); 
 } 


public void testIsGreaterThan1234() { 
     assertEquals(true, Months.THREE.isGreaterThan(Months.TWO)); 
     assertEquals(false, Months.THREE.isGreaterThan(Months.THREE)); 
     assertEquals(false, Months.TWO.isGreaterThan(Months.THREE)); 
     assertEquals(true, Months.ONE.isGreaterThan(null)); 
     assertEquals(false, Months.months(-1).isGreaterThan(null)); 
 } 


public void testMultipliedBy_int1246() { 
     Months test = Months.months(2); 
     assertEquals(6, test.multipliedBy(3).getMonths()); 
     assertEquals(2, test.getMonths()); 
     assertEquals(-6, test.multipliedBy(-3).getMonths()); 
     assertSame(test, test.multipliedBy(1)); 
     Months halfMax = Months.months(Integer.MAX_VALUE / 2 + 1); 
     try { 
         halfMax.multipliedBy(2); 
         fail(); 
     } catch (ArithmeticException ex) { 
     } 
 } 


public void testNegated1396() { 
     Months test = Months.months(12); 
     assertEquals(-12, test.negated().getMonths()); 
     assertEquals(12, test.getMonths()); 
     try { 
         Months.MIN_VALUE.negated(); 
         fail(); 
     } catch (ArithmeticException ex) { 
     } 
 } 

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-------------------------------------------------------------------------
    

    

    

    //-------------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    

    

    //-----------------------------------------------------------------------
    

    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    

    

    

    

    

    

    //-----------------------------------------------------------------------
    

}
