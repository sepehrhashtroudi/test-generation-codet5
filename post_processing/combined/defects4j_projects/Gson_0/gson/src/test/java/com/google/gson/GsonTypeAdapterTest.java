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

package com.google.gson;

import junit.framework.TestCase;

import java.lang.reflect.Type;
import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Contains numerous tests involving registered type converters with a Gson instance.
 *
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class GsonTypeAdapterTest extends TestCase {
  private Gson gson;

  @Override
  protected void setUp() throws Exception {
    super.setUp();
    gson = new GsonBuilder()
        .registerTypeAdapter(AtomicLong.class, new ExceptionTypeAdapter())
        .registerTypeAdapter(AtomicInteger.class, new AtomicIntegerTypeAdapter())
        .create();
  }

  

  

  

  

  private static class ExceptionTypeAdapter
      implements JsonSerializer<AtomicLong>, JsonDeserializer<AtomicLong> {
    public JsonElement serialize(
        AtomicLong src, Type typeOfSrc, JsonSerializationContext context) {
      throw new IllegalStateException();
    }

    public AtomicLong deserialize(
        JsonElement json, Type typeOfT, JsonDeserializationContext context)
        throws JsonParseException {
      throw new IllegalStateException();
    }
  }

  private static class AtomicIntegerTypeAdapter
      implements JsonSerializer<AtomicInteger>, JsonDeserializer<AtomicInteger> {
    public JsonElement serialize(AtomicInteger src, Type typeOfSrc, JsonSerializationContext context) {
      return new JsonPrimitive(src.incrementAndGet());
    }

    public AtomicInteger deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
        throws JsonParseException {
      int intValue = json.getAsInt();
      return new AtomicInteger(--intValue);
    }
  }
}
