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

package com.google.gson.metrics;

import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import com.google.gson.annotations.Expose;
import com.google.gson.reflect.TypeToken;

import junit.framework.TestCase;

import java.io.StringWriter;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Tests to measure performance for Gson. All tests in this file will be disabled in code. To run
 * them remove disabled_ prefix from the tests and run them.
 * 
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class PerformanceTest extends TestCase {
  private static final int COLLECTION_SIZE = 5000;

  private static final int NUM_ITERATIONS = 100;

  private Gson gson;

  @Override
  protected void setUp() throws Exception {
    super.setUp();
    gson = new Gson();
  }
  
    

  
  
  private void parseLongJson(String json) throws JsonParseException {
    ExceptionHolder target = gson.fromJson(json, ExceptionHolder.class);
    assertTrue(target.message.contains("Error"));
    assertTrue(target.stackTrace.contains("Yippie"));
  }

  private static class ExceptionHolder {
    public final String message;
    public final String stackTrace;
    
    // For use by Gson
    @SuppressWarnings("unused")
    private ExceptionHolder() {
      this("", "");
    }
    public ExceptionHolder(String message, String stackTrace) {
      this.message = message;
      this.stackTrace = stackTrace;
    }
  }

  @SuppressWarnings("unused")
  private static class CollectionEntry {
    final String name;
    final String value;

    // For use by Gson
    private CollectionEntry() {
      this(null, null);
    }

    CollectionEntry(String name, String value) {
      this.name = name;
      this.value = value;
    }
  }
  
  /**
   * Created in response to http://code.google.com/p/google-gson/issues/detail?id=96
   */
  
  
  /**
   * Created in response to http://code.google.com/p/google-gson/issues/detail?id=96
   */
  

  /**
   * Created in response to http://code.google.com/p/google-gson/issues/detail?id=96
   */
  // Last I tested, Gson was able to serialize upto 14MB byte array
  
  
  /**
   * Created in response to http://code.google.com/p/google-gson/issues/detail?id=96
   */
  // Last I tested, Gson was able to deserialize a byte array of 11MB
  

// The tests to measure serialization and deserialization performance of Gson
// Based on the discussion at
// http://groups.google.com/group/google-gson/browse_thread/thread/7a50b17a390dfaeb
// Test results: 10/19/2009 
// Serialize classes avg time: 60 ms
// Deserialized classes avg time: 70 ms
// Serialize exposed classes avg time: 159 ms
// Deserialized exposed classes avg time: 173 ms
  
  

  
  
  

  

  

  

  private String buildJsonForClassWithList() {
    StringBuilder sb = new StringBuilder("{");
    sb.append("field:").append("'str',");
    sb.append("list:[");
    boolean first = true;
    for (int i = 0; i < COLLECTION_SIZE; ++i) {
      if (first) {
        first = false;
      } else {
        sb.append(",");
      }
      sb.append("{field:'element-" + i + "'}");
    }
    sb.append("]");
    sb.append("}");
    String json = sb.toString();
    return json;
  }

  @SuppressWarnings("unused")
  private static final class ClassWithList { 
    final String field; 
    final List<ClassWithField> list = new ArrayList<ClassWithField>(COLLECTION_SIZE);
    ClassWithList() {
      this(null);
    }
    ClassWithList(String field) {
      this.field = field;
    }
  } 

  @SuppressWarnings("unused")
  private static final class ClassWithField { 
    final String field;
    ClassWithField() {
      this("");
    }
    public ClassWithField(String field) { 
      this.field = field; 
    } 
  }

  @SuppressWarnings("unused")
  private static final class ClassWithListOfObjects { 
    @Expose 
    final String field; 
    @Expose 
    final List<ClassWithExposedField> list = new ArrayList<ClassWithExposedField>(COLLECTION_SIZE);
    ClassWithListOfObjects() {
      this(null);
    }
    ClassWithListOfObjects(String field) {
      this.field = field;
    }
  } 

  @SuppressWarnings("unused")
  private static final class ClassWithExposedField { 
    @Expose 
    final String field;
    ClassWithExposedField() {
      this("");
    }
    ClassWithExposedField(String field) { 
      this.field = field; 
    } 
  }
}
