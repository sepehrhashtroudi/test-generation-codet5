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
import com.google.gson.ParamterizedTypeFixtures.MyParameterizedType;
import com.google.gson.ParamterizedTypeFixtures.MyParameterizedTypeAdapter;
import com.google.gson.ParamterizedTypeFixtures.MyParameterizedTypeInstanceCreator;
import com.google.gson.common.TestTypes.BagOfPrimitives;
import com.google.gson.reflect.TypeToken;

import junit.framework.TestCase;

import java.io.Reader;
import java.io.Serializable;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Functional tests for the serialization and deserialization of parameterized types in Gson.
 *
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class ParameterizedTypesTest extends TestCase {
  private Gson gson;

  @Override
  protected void setUp() throws Exception {
    super.setUp();
    gson = new Gson();
  }

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  /**
   * An test object that has fields that are type variables.
   *
   * @param <T> Enforce T to be a string to make writing the "toExpectedJson" method easier.
   */
  private static class ObjectWithTypeVariables<T extends Number> {
    private final T typeParameterObj;
    private final T[] typeParameterArray;
    private final List<T> listOfTypeParameters;
    private final List<T>[] arrayOfListOfTypeParameters;
    private final List<? extends T> listOfWildcardTypeParameters;
    private final List<? extends T>[] arrayOfListOfWildcardTypeParameters;

    // For use by Gson
    @SuppressWarnings("unused")
    private ObjectWithTypeVariables() {
      this(null, null, null, null, null, null);
    }

    public ObjectWithTypeVariables(T obj, T[] array, List<T> list, List<T>[] arrayOfList,
        List<? extends T> wildcardList, List<? extends T>[] arrayOfWildcardList) {
      this.typeParameterObj = obj;
      this.typeParameterArray = array;
      this.listOfTypeParameters = list;
      this.arrayOfListOfTypeParameters = arrayOfList;
      this.listOfWildcardTypeParameters = wildcardList;
      this.arrayOfListOfWildcardTypeParameters = arrayOfWildcardList;
    }

    public String getExpectedJson() {
      StringBuilder sb = new StringBuilder().append("{");

      boolean needsComma = false;
      if (typeParameterObj != null) {
        sb.append("\"typeParameterObj\":").append(toString(typeParameterObj));
        needsComma = true;
      }

      if (typeParameterArray != null) {
        if (needsComma) {
          sb.append(',');
        }
        sb.append("\"typeParameterArray\":[");
        appendObjectsToBuilder(sb, Arrays.asList(typeParameterArray));
        sb.append(']');
        needsComma = true;
      }

      if (listOfTypeParameters != null) {
        if (needsComma) {
          sb.append(',');
        }
        sb.append("\"listOfTypeParameters\":[");
        appendObjectsToBuilder(sb, listOfTypeParameters);
        sb.append(']');
        needsComma = true;
      }

      if (arrayOfListOfTypeParameters != null) {
        if (needsComma) {
          sb.append(',');
        }
        sb.append("\"arrayOfListOfTypeParameters\":[");
        appendObjectsToBuilder(sb, arrayOfListOfTypeParameters);
        sb.append(']');
        needsComma = true;
      }

      if (listOfWildcardTypeParameters != null) {
        if (needsComma) {
          sb.append(',');
        }
        sb.append("\"listOfWildcardTypeParameters\":[");
        appendObjectsToBuilder(sb, listOfWildcardTypeParameters);
        sb.append(']');
        needsComma = true;
      }

      if (arrayOfListOfWildcardTypeParameters != null) {
        if (needsComma) {
          sb.append(',');
        }
        sb.append("\"arrayOfListOfWildcardTypeParameters\":[");
        appendObjectsToBuilder(sb, arrayOfListOfWildcardTypeParameters);
        sb.append(']');
        needsComma = true;
      }
      sb.append('}');
      return sb.toString();
    }

    private void appendObjectsToBuilder(StringBuilder sb, Iterable<? extends T> iterable) {
      boolean isFirst = true;
      for (T obj : iterable) {
        if (!isFirst) {
          sb.append(',');
        }
        isFirst = false;
        sb.append(toString(obj));
      }
    }

    private void appendObjectsToBuilder(StringBuilder sb, List<? extends T>[] arrayOfList) {
      boolean isFirst = true;
      for (List<? extends T> list : arrayOfList) {
        if (!isFirst) {
          sb.append(',');
        }
        isFirst = false;
        if (list != null) {
          sb.append('[');
          appendObjectsToBuilder(sb, list);
          sb.append(']');
        } else {
          sb.append("null");
        }
      }
    }

    public String toString(T obj) {
      return obj.toString();
    }
  }

  private static class MultiParameters<A, B, C, D, E> {
    A a;
    B b;
    C c;
    D d;
    E e;
    // For use by Gson
    @SuppressWarnings("unused")
    private MultiParameters() {
    }
    MultiParameters(A a, B b, C c, D d, E e) {
      super();
      this.a = a;
      this.b = b;
      this.c = c;
      this.d = d;
      this.e = e;
    }
    @Override
    public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + ((a == null) ? 0 : a.hashCode());
      result = prime * result + ((b == null) ? 0 : b.hashCode());
      result = prime * result + ((c == null) ? 0 : c.hashCode());
      result = prime * result + ((d == null) ? 0 : d.hashCode());
      result = prime * result + ((e == null) ? 0 : e.hashCode());
      return result;
    }
    @Override
    @SuppressWarnings("unchecked")
    public boolean equals(Object obj) {
      if (this == obj) {
        return true;
      }
      if (obj == null) {
        return false;
      }
      if (getClass() != obj.getClass()) {
        return false;
      }
      MultiParameters<A, B, C, D, E> other = (MultiParameters<A, B, C, D, E>) obj;
      if (a == null) {
        if (other.a != null) {
          return false;
        }
      } else if (!a.equals(other.a)) {
        return false;
      }
      if (b == null) {
        if (other.b != null) {
          return false;
        }
      } else if (!b.equals(other.b)) {
        return false;
      }
      if (c == null) {
        if (other.c != null) {
          return false;
        }
      } else if (!c.equals(other.c)) {
        return false;
      }
      if (d == null) {
        if (other.d != null) {
          return false;
        }
      } else if (!d.equals(other.d)) {
        return false;
      }
      if (e == null) {
        if (other.e != null) {
          return false;
        }
      } else if (!e.equals(other.e)) {
        return false;
      }
      return true;
    }
  }
  
  // Begin: tests to reproduce issue 103
  private static class Quantity {
    @SuppressWarnings("unused")
    int q = 10;
  }
  private static class MyQuantity extends Quantity {
    @SuppressWarnings("unused")
    int q2 = 20;
  }
  private interface Measurable<T> {    
  }
  private interface Field<T> {    
  }
  private interface Immutable {    
  }
  
  public static final class Amount<Q extends Quantity> 
      implements Measurable<Q>, Field<Amount<?>>, Serializable, Immutable {
    private static final long serialVersionUID = -7560491093120970437L;

    int value = 30;
  }
  
  
  
  
  // End: tests to reproduce issue 103
}
