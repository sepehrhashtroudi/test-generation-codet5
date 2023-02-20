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

import java.io.StringReader;
import java.math.BigDecimal;
import java.math.BigInteger;

import com.google.gson.*;
import junit.framework.TestCase;

import com.google.gson.common.TestTypes.CrazyLongTypeAdapter;

/**
 * Functional tests for Json primitive values: integers, and floating point numbers.
 *
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class PrimitiveTest extends TestCase {
  private Gson gson;

  @Override
  protected void setUp() throws Exception {
    super.setUp();
    gson = new Gson();
  }

public void testBigDecimalInASingleElementArrayDeserialization53() { 
     BigDecimal expected = new BigDecimal("34.56"); 
     String json = gson.toJson(expected); 
     BigDecimal actual = gson.fromJson(json, BigDecimal.class); 
     assertEquals(expected, actual); 
 }
  

  

  

  

  

  

  

  

  

  

  

  

  

  
  
  
  
  

  

  

  
  
  
  
  

  

  

  

  

  

  

  

  
  
  
  
  

  
  
  

  

  

  

  

  

  

  
  
  

  private String extractElementFromArray(String json) {
    return json.substring(json.indexOf('[') + 1, json.indexOf(']'));
  }
  
  
    
  
  
  
  
  
  
  
  
  

  

  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
    
  
  
  
  
  
  

  
  
  private static class ClassWithIntegerField {
    Integer i;
  }
  
  
}
