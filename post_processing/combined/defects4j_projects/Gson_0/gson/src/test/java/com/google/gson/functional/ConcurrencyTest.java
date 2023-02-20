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

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

import junit.framework.TestCase;

import com.google.gson.Gson;

/**
 * Tests for ensuring Gson thread-safety.
 * 
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class ConcurrencyTest extends TestCase {
  private Gson gson;

  @Override
  protected void setUp() throws Exception {
    super.setUp();
    gson = new Gson();
  }

  /**
   * Source-code based on
   * http://groups.google.com/group/google-gson/browse_thread/thread/563bb51ee2495081
   */
   

  /**
   * Source-code based on
   * http://groups.google.com/group/google-gson/browse_thread/thread/563bb51ee2495081
   */
   

  /**
   * Source-code based on
   * http://groups.google.com/group/google-gson/browse_thread/thread/563bb51ee2495081
   */
  

  /**
   * Source-code based on
   * http://groups.google.com/group/google-gson/browse_thread/thread/563bb51ee2495081
   */
  
  
  @SuppressWarnings("unused")
  private static class MyObject {
    String a;
    String b;
    int i;

    MyObject() {
      this("hello", "world", 42);
    }

    public MyObject(String a, String b, int i) {
      this.a = a;
      this.b = b;
      this.i = i;
    }
  }
}
