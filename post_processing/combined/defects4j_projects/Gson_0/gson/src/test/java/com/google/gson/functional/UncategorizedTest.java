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
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.common.TestTypes.BagOfPrimitives;
import com.google.gson.common.TestTypes.ClassOverridingEquals;

import junit.framework.TestCase;

import java.lang.reflect.Type;

/**
 * Functional tests that do not fall neatly into any of the existing classification.
 *
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class UncategorizedTest extends TestCase {

  private Gson gson = null;

  @Override
  protected void setUp() throws Exception {
    super.setUp();
    gson = new Gson();
  }

  

  

  

  /**
   * This test ensures that a custom deserializer is able to return a derived class instance for a
   * base class object. For a motivation for this test, see Issue 37 and
   * http://groups.google.com/group/google-gson/browse_thread/thread/677d56e9976d7761
   */
  

  private enum OperationType { OP1, OP2 }
  private static class Base {
    OperationType opType;
  }
  private static class Derived1 extends Base {
    Derived1() { opType = OperationType.OP1; }
  }
  private static class Derived2 extends Base {
    Derived2() { opType = OperationType.OP2; }
  }
  private static class BaseTypeAdapter implements JsonDeserializer<Base> {
    public Base deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
        throws JsonParseException {
      String opTypeStr = json.getAsJsonObject().get("opType").getAsString();
      OperationType opType = OperationType.valueOf(opTypeStr);
      switch (opType) {
      case OP1:
        return new Derived1();
      case OP2:
        return new Derived2();
      }
      throw new JsonParseException("unknown type: " + json);
    }
  }
}
