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
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Set;

import junit.framework.TestCase;

import com.google.gson.Gson;
import com.google.gson.common.MoreAsserts;
import com.google.gson.reflect.TypeToken;

/**
 * Functional tests for Java 5.0 enums.
 *
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class EnumTest extends TestCase {
  
  private Gson gson;
  
  @Override
  protected void setUp() throws Exception {
    super.setUp();
    gson = new Gson();
  }
  
  
  
  
  
  

  

  

  

  
  
  private static enum MyEnum {
    VALUE1, VALUE2;

    public String getExpectedJson() {
      return "\"" + toString() + "\"";
    }
  }

  private static class ClassWithEnumFields {
    private final MyEnum value1 = MyEnum.VALUE1;
    private final MyEnum value2 = MyEnum.VALUE2;
    public String getExpectedJson() {
      return "{\"value1\":\"" + value1 + "\",\"value2\":\"" + value2 + "\"}";
    }
  }

  /**
   * Test for issue 226.
   */
  

  private enum Roshambo {
    ROCK {
      @Override Roshambo defeats() {
        return SCISSORS;
      }
    },
    PAPER {
      @Override Roshambo defeats() {
        return ROCK;
      }
    },
    SCISSORS {
      @Override Roshambo defeats() {
        return PAPER;
      }
    };

    abstract Roshambo defeats();
  }
}
