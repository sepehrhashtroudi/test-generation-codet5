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
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import junit.framework.TestCase;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.common.TestTypes.ArrayOfObjects;
import com.google.gson.common.TestTypes.BagOfPrimitives;
import com.google.gson.reflect.TypeToken;

/**
 * Functional tests for pretty printing option.
 *
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class PrettyPrintingTest extends TestCase {
  private static int PRINT_MARGIN = 80;
  private static int RIGHT_MARGIN = 4;

  private static final boolean DEBUG = false;

  private Gson gson;

  @Override
  protected void setUp() throws Exception {
    super.setUp();
    gson = new GsonBuilder().setPrettyPrinting().create();
  }

  

  

  

  

  
  
  

  // In response to bug 153
  

  @SuppressWarnings("unused")
  private static class ClassWithMap {
    Map<String, Integer> map;
    int value = 2;
  }

  

  private void print(String msg) {
    if (DEBUG) {
      System.out.println(msg);
    }
  }
}
