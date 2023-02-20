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

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;

import junit.framework.TestCase;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Performs some functional tests when Gson is instantiated with some common user defined
 * {@link ExclusionStrategy} objects.
 *
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class ExclusionStrategyFunctionalTest extends TestCase {
  private SampleObjectForTest src;
  private Gson gson;

  @Override
  protected void setUp() throws Exception {
    super.setUp();
    gson = new GsonBuilder()
        .setExclusionStrategies(new MyExclusionStrategy(String.class))
        .serializeNulls()
        .create();
    src = new SampleObjectForTest();
  }

  

  

  @Retention(RetentionPolicy.RUNTIME)
  @Target({ElementType.FIELD})
  private static @interface Foo {
    // Field tag only annotation
  }

  @SuppressWarnings("unused")
  private static class SampleObjectForTest {
    @Foo
    private final int annotatedField;
    private final String stringField;
    private final long longField;
    private final Class<?> clazzField;

    public SampleObjectForTest() {
      annotatedField = 5;
      stringField = "someDefaultValue";
      longField = 1234;
      clazzField = String.class;
    }
  }

  private static class MyExclusionStrategy implements ExclusionStrategy {
    private final Class<?> typeToSkip;

    private MyExclusionStrategy(Class<?> typeToSkip) {
      this.typeToSkip = typeToSkip;
    }

    public boolean shouldSkipClass(Class<?> clazz) {
      return (clazz == typeToSkip);
    }

    public boolean shouldSkipField(FieldAttributes f) {
      return f.getAnnotation(Foo.class) != null;
    }
  }
}
