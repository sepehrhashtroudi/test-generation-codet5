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
import com.google.gson.common.TestTypes.BagOfPrimitives;

import junit.framework.TestCase;

/**
 * Tests for security-related aspects of Gson
 * 
 * @author Inderjeet Singh
 */
public class SecurityTest extends TestCase {
  /**
   * Keep this in sync with Gson.JSON_NON_EXECUTABLE_PREFIX
   */
  private static final String JSON_NON_EXECUTABLE_PREFIX = ")]}'\n";

  private GsonBuilder gsonBuilder;

  @Override
  protected void setUp() throws Exception {
    super.setUp();
    gsonBuilder = new GsonBuilder();
  }

  
  
  
  
  
  
  /**
   *  Gson should be able to deserialize a stream with non-exectuable token even if it is created
   *  without {@link GsonBuilder#generateNonExecutableJson()}.
   */
    
  
  /**
   *  Gson should be able to deserialize a stream with non-exectuable token if it is created
   *  with {@link GsonBuilder#generateNonExecutableJson()}.
   */
    
}
