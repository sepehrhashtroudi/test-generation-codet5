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

import java.lang.reflect.Field;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.FieldNamingStrategy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;
import com.google.gson.common.TestTypes.ClassWithSerializedNameFields;
import com.google.gson.common.TestTypes.StringWrapper;

import junit.framework.TestCase;

/**
 * Functional tests for naming policies.
 *
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class NamingPolicyTest extends TestCase {

  private GsonBuilder builder;

  @Override
  protected void setUp() throws Exception {
    super.setUp();
    builder = new GsonBuilder();
  }

  

  
  
  

  
  
  

  

  

  
  
  
  
  
  
  

  

  private static class UpperCaseNamingStrategy implements FieldNamingStrategy {
    public String translateName(Field f) {
      return f.getName().toUpperCase();
    }
  }

  @SuppressWarnings("unused")
  private static class ClassWithDuplicateFields {
    public Integer a;
    @SerializedName("a") public Double b;
    
    public ClassWithDuplicateFields(Integer a) {
      this(a, null);
    }
    
    public ClassWithDuplicateFields(Double b) {
      this(null, b);
    }
    
    public ClassWithDuplicateFields(Integer a, Double b) {
      this.a = a;
      this.b = b;
    }
  }
}
