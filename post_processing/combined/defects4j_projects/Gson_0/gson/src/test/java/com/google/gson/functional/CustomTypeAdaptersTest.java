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

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.InstanceCreator;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.common.TestTypes.BagOfPrimitives;
import com.google.gson.common.TestTypes.ClassWithCustomTypeConverter;
import com.google.gson.reflect.TypeToken;

import junit.framework.TestCase;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Functional tests for the support of custom serializer and deserializers.
 *
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class CustomTypeAdaptersTest extends TestCase {
  private GsonBuilder builder;

  @Override
  protected void setUp() throws Exception {
    super.setUp();
    builder = new GsonBuilder();
  }

  

  
  
  

  

  

  
  
  
  
  
  
  private static class Base {
    int baseValue = 2;
  }
  
  private static class Derived extends Base {
    @SuppressWarnings("unused")
    int derivedValue = 3;
  }
  
  
  private Gson createGsonObjectWithFooTypeAdapter() {
    return new GsonBuilder().registerTypeAdapter(Foo.class, new FooTypeAdapter()).create();
  }
  
  public static class Foo {
    private final int key;
    private final long value;
    
    public Foo() {
      this(0, 0L);
    }

    public Foo(int key, long value) {
      this.key = key;
      this.value = value;
    }
  }
  
  public static class FooTypeAdapter implements JsonSerializer<Foo>, JsonDeserializer<Foo> {
    public Foo deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
        throws JsonParseException {
      return context.deserialize(json, typeOfT);
    }

    public JsonElement serialize(Foo src, Type typeOfSrc, JsonSerializationContext context) {
      return context.serialize(src, typeOfSrc);
    }
  }
  
  
  
  
  
  private static class ClassWithWrapperLongField {
    Long value;
  }
  
  private static class ClassWithBooleanField {
    Boolean value;
  }
  
  
  
  
  
  private static class StringHolder {
    String part1;
    String part2;

    public StringHolder(String string) {
      String[] parts = string.split(":");
      part1 = parts[0];
      part2 = parts[1];
    }
    public StringHolder(String part1, String part2) {
      this.part1 = part1;
      this.part2 = part2;
    }
  }
  
  private static class StringHolderTypeAdapter implements JsonSerializer<StringHolder>, 
      JsonDeserializer<StringHolder>, InstanceCreator<StringHolder> {

    public StringHolder createInstance(Type type) {
      //Fill up with objects that will be thrown away
      return new StringHolder("unknown:thing");
    }

    public StringHolder deserialize(JsonElement src, Type type, 
        JsonDeserializationContext context) {
      return new StringHolder(src.getAsString());
    }

    public JsonElement serialize(StringHolder src, Type typeOfSrc, 
        JsonSerializationContext context) {
      String contents = src.part1 + ':' + src.part2;
      return new JsonPrimitive(contents);
    }
  }
  
  // Test created from Issue 70
  

  // Test created from Issue 70
  

  // Test created from Issue 70
  
  
  // Test created from Issue 70
  
  
  // Test created from Issue 70
  

  // Test created from Issue 70
  

  

  

  private static class DataHolder {
    final String data;

    // For use by Gson
    @SuppressWarnings("unused")
    private DataHolder() {
      this("");
    }
    
    public DataHolder(String data) {
      this.data = data;
    }
  }
  
  private static class DataHolderWrapper {
    final DataHolder wrappedData;
    
    // For use by Gson
    @SuppressWarnings("unused")
    private DataHolderWrapper() {
      this(null);
    }
    
    public DataHolderWrapper(DataHolder data) {
      this.wrappedData = data;
    }
  }
  
  private static class DataHolderSerializer implements JsonSerializer<DataHolder> {
    public JsonElement serialize(DataHolder src, Type typeOfSrc, JsonSerializationContext context) {
      JsonObject obj = new JsonObject();
      obj.addProperty("myData", src.data);
      return obj;
    }
  }

  private static class DataHolderDeserializer implements JsonDeserializer<DataHolder> {
    public DataHolder deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
        throws JsonParseException {
      JsonObject jsonObj = json.getAsJsonObject();
      JsonElement jsonElement = jsonObj.get("data");
      if (jsonElement == null || jsonElement.isJsonNull()) {
        return new DataHolder(null);
      }
      return new DataHolder(jsonElement.getAsString());
    }
  }
}
