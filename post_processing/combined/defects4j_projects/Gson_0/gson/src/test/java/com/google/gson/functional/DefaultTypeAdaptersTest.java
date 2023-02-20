/*
 * Copyright (C) 2008 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.gson.functional;

import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.URI;
import java.net.URL;
import java.sql.Time;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Locale;
import java.util.Properties;
import java.util.Set;
import java.util.TimeZone;
import java.util.TreeSet;
import java.util.UUID;

import junit.framework.TestCase;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;

/**
 * Functional test for Json serialization and deserialization for common classes for which default
 * support is provided in Gson. The tests for Map types are available in {@link MapTest}.
 *
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class DefaultTypeAdaptersTest extends TestCase {
  private Gson gson;
  private TimeZone oldTimeZone;

  @Override
  protected void setUp() throws Exception {
    super.setUp();
    this.oldTimeZone = TimeZone.getDefault();
    TimeZone.setDefault(TimeZone.getTimeZone("PST"));
    gson = new Gson();
  }

  @Override
  protected void tearDown() throws Exception {
    TimeZone.setDefault(oldTimeZone);
    super.tearDown();
  }

public void testDefaultJavaSqlDateDeserialization33() { 
     String json = "'Dec 3, 2009'"; 
     java.sql.Date extracted = gson.fromJson(json, java.sql.Date.class); 
     assertEqualsDate(extracted, 2009, 11, 3); 
 }
public void testDefaultJavaSqlDateDeserialization34() { 
     String json = "'Dec 3, 2009'"; 
     Date extracted = gson.fromJson(json, Date.class); 
     assertEqualsDate(extracted, 2009, 11, 3); 
 }
public void testDefaultCalendarDeserialization35() throws Exception { 
     Gson gson = new GsonBuilder().create(); 
     String json = "{year:2009,month:2,dayOfMonth:11,hourOfDay:14,minute:29,second:23}"; 
     Calendar cal = gson.fromJson(json, Calendar.class); 
     assertEquals(2009, cal.get(Calendar.YEAR)); 
     assertEquals(2, cal.get(Calendar.MONTH)); 
     assertEquals(11, cal.get(Calendar.DAY_OF_MONTH)); 
     assertEquals(14, cal.get(Calendar.HOUR_OF_DAY)); 
     assertEquals(29, cal.get(Calendar.MINUTE)); 
     assertEquals(23, cal.get(Calendar.SECOND)); 
 }
public void testUrlDeserialization40() { 
     String urlValue = "http://google.com/"; 
     String json = '"' + urlValue + '"'; 
     URL target = gson.fromJson(json, URL.class); 
     assertEquals(urlValue, target.toExternalForm()); 
 }
public void testLocaleDeserializationWithLanguageCountry42() { 
     String json = "\"fr_CA\""; 
     Locale locale = gson.fromJson(json, Locale.class); 
     assertEquals(Locale.CANADA_FRENCH, locale); 
 }
  

  

  

  

  private static class ClassWithUrlField {
    URL url;
  }

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  // Date can not directly be compared with another instance since the deserialization loses the
  // millisecond portion.
  @SuppressWarnings("deprecation")
  private void assertEqualsDate(Date date, int year, int month, int day) {
      assertEquals(year-1900, date.getYear());
      assertEquals(month, date.getMonth());
      assertEquals(day, date.getDate());
  }

  @SuppressWarnings("deprecation")
  private void assertEqualsTime(Date date, int hours, int minutes, int seconds) {
    assertEquals(hours, date.getHours());
    assertEquals(minutes, date.getMinutes());
    assertEquals(seconds, date.getSeconds());
  }

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  private static class ClassWithBigDecimal {
    BigDecimal value;
    // For use by Gson
    @SuppressWarnings("unused")
    private ClassWithBigDecimal() { }
    ClassWithBigDecimal(String value) {
      this.value = new BigDecimal(value);
    }
    String getExpectedJson() {
      return "{\"value\":" + value.toEngineeringString() + "}";
    }
  }

  private static class ClassWithBigInteger {
    BigInteger value;
    // For use by Gson
    @SuppressWarnings("unused")
    private ClassWithBigInteger() { }
    ClassWithBigInteger(String value) {
      this.value = new BigInteger(value);
    }
    String getExpectedJson() {
      return "{\"value\":" + value + "}";
    }
  }

  

  

  

  
}
