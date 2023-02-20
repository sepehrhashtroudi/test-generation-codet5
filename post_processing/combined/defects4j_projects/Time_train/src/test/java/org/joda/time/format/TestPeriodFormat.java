/*
 *  Copyright 2001-2012 Stephen Colebourne
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
package org.joda.time.format;

import java.util.Locale;

import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.joda.time.Period;

/**
 * This class is a Junit unit test for PeriodFormat.
 *
 * @author Stephen Colebourne
 */
public class TestPeriodFormat extends TestCase {

    private static final Locale EN = new Locale("en");
    private static final Locale FR = new Locale("fr");
    private static final Locale PT = new Locale("pt");
    private static final Locale ES = new Locale("es");
    private static final Locale DE = new Locale("de");
    private static final Locale NL = new Locale("nl");
    private static final Locale DA = new Locale("da");
    private static final Locale JA = new Locale("ja");

    private Locale originalLocale = null;

    public static void main(String[] args) {
        junit.textui.TestRunner.run(suite());
    }

    public static TestSuite suite() {
        return new TestSuite(TestPeriodFormat.class);
    }

    public TestPeriodFormat(String name) {
        super(name);
    }

    protected void setUp() throws Exception {
        originalLocale = Locale.getDefault();
        Locale.setDefault(DE);
    }

    protected void tearDown() throws Exception {
        Locale.setDefault(originalLocale);
        originalLocale = null;
    }

    //-----------------------------------------------------------------------

public void test_wordBased_nl_formatStandard57() { 
     Period p = new Period(0, 0, 0, 1, 5, 6, 7, 8); 
     assertEquals("1 dag, 5 uur, 6 minuten, 7 seconden en 8 milliseconden", PeriodFormat.wordBased(NL).print(p)); 
 } 


public void test_getDefault_cached187() { 
     assertSame(PeriodFormat.getDefault(), PeriodFormat.getDefault()); 
 } 


public void test_wordBased_nl_parseTwoFields504() { 
     Period p = Period.days(2).withHours(5); 
     assertEquals(p, PeriodFormat.wordBased(NL).parsePeriod("2 dagen en 5 uur")); 
 } 


public void test_wordBased_es_parseTwoFields617() { 
     Period p = Period.days(2).withHours(5); 
     assertEquals(p, PeriodFormat.wordBased(ES).parsePeriod("2 d\u00EDas y 5 horas")); 
 } 


public void testSubclassableConstructor654() { 
     PeriodFormat f = new PeriodFormat() { 
     }; 
     assertNotNull(f); 
 } 


public void test_wordBased_de_FormatOneField1123() { 
     Period p = Period.days(2); 
     assertEquals("2 Tage", PeriodFormat.wordBased(DE).print(p)); 
 } 


public void test_wordBased_fr_formatStandard1373() { 
     Period p = new Period(0, 0, 0, 1, 5, 6, 7, 8); 
     assertEquals("1 jour, 5 heures, 6 minutes, 7 secondes et 8 millisecondes", PeriodFormat.wordBased(FR).print(p)); 
 } 


public void test_wordBased_default1380() { 
     Period p = new Period(0, 0, 0, 1, 5, 6, 7, 8); 
     assertEquals("1 Tag, 5 Stunden, 6 Minuten, 7 Sekunden und 8 Millisekunden", PeriodFormat.wordBased().print(p)); 
 } 


public void test_getDefault_checkRedundantSeparator1767() { 
     try { 
         PeriodFormat.getDefault().parsePeriod("2 days and 5 hours "); 
         fail("No exception was caught"); 
     } catch (Exception e) { 
         assertEquals(IllegalArgumentException.class, e.getClass()); 
     } 
 } 

    

    //-----------------------------------------------------------------------
    // getDefault()
    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
        
    
    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    // wordBased() - default locale (de)
    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    // wordBased(Locale.FRENCH)
    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    // wordBased(Locale pt)
    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    // wordBased(Locale es)
    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    // wordBased(Locale de)
    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    // wordBased(Locale nl)
    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    // wordBased(Locale da)
    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    
    
    //-----------------------------------------------------------------------
    
    
    //-----------------------------------------------------------------------
    // wordBased(Locale ja)
    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    

    //-----------------------------------------------------------------------
    
    
    //-----------------------------------------------------------------------
       
    
    //-----------------------------------------------------------------------
    // Cross check languages
    //-----------------------------------------------------------------------
    

    

    

    

}
