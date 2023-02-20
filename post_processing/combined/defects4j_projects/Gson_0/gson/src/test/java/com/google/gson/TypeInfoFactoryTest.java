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

import com.google.gson.reflect.TypeToken;

import junit.framework.TestCase;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.List;

/**
 * Small test to ensure that the TypeInfoFactory is return the object that we expect.
 *
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class TypeInfoFactoryTest extends TestCase {

  private static Type OBJ_TYPE = new TypeToken<ObjectWithDifferentFields<Integer>>() {}.getType();
  private ObjectWithDifferentFields<Integer> obj;

  @Override
  protected void setUp() throws Exception {
    super.setUp();
    obj = new ObjectWithDifferentFields<Integer>();
  }

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  @SuppressWarnings("unused")
  private static class ObjectWithDifferentFields<T> {
    public static enum TestEnum {
      TEST_1, TEST_2;
    }

    public String simpleField;
    public TestEnum enumField;
    public List<String> simpleParameterizedType;
    public List<List<String>> simpleNestedParameterizedType;
    public List<String>[] simpleGenericArray;

    public T typeVariableObj;
    public T[] typeVariableArray;
    public T[][][] mutliDimensionalTypeVariableArray;
    public List<T> listOfTypeVariables;
    public List<List<T>> listOfListsOfTypeVariables;
    public List<T>[] listOfTypeVariablesArray;

    public List<?> listWithWildcard;
    public List<?>[] arrayOfListWithWildcard;
    public List<? extends String> listWithStringWildcard;
    public List<? extends String>[] arrayOfListWithStringWildcard;

    public List<? extends T> listWithTypeVariableWildcard;
    public List<? extends T>[] arrayOfListWithTypeVariableWildcard;
  }
}
