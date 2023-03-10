/*
 * Copyright (C) 2010 Google Inc.
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

/**
 * Unit test for the {@link LruCache} class.
 *
 * @author Inderjeet Singh
 * @author Joel Leitch
 */
public class LruCacheTest extends TestCase {

public void testAddingAndRemovingObjectProperties66() throws Exception { 
     JsonObject jsonObj = new JsonObject(); 
     String propertyName = "property"; 
     assertFalse(jsonObj.has(propertyName)); 
     assertNull(jsonObj.get(propertyName)); 
     JsonPrimitive value = new JsonPrimitive("blah"); 
     jsonObj.add(propertyName, value); 
     assertEquals(value, jsonObj.get(propertyName)); 
     JsonElement removedElement = jsonObj.remove(propertyName); 
     assertEquals(value, removedElement); 
     assertFalse(jsonObj.has(propertyName)); 
 }
public void testNegativeInfinitySerialization68() { 
     Gson gson = new GsonBuilder().serializeSpecialFloatingPointValues().create(); 
     double negativeInfinity = Double.NEGATIVE_INFINITY; 
     assertEquals("-Infinity", gson.toJson(negativeInfinity)); 
     assertEquals("-Infinity", gson.toJson(Double.NEGATIVE_INFINITY)); 
 }
public void testDoubles69() throws Exception { 
     String json = "[-0.0," + "1.0," + "1.7976931348623157E308," + "4.9E-324," + "0.0," + "-0.5," + "2.2250738585072014E-308," + "3.141592653589793," + "2.718281828459045]"; 
     LruCache<String, String> cache = new LruCache<String, String>(10); 
     assertEquals(-0.0, cache.getElement("-0.0")); 
     assertEquals(1.0, cache.getElement("1.0")); 
     assertEquals(1.7976931348623157E308, cache.getElement("2.2250738585072014E-308")); 
     assertEquals(4.9E-324, cache.getElement("3.141592653589793")); 
     assertEquals(2.718281828459045, cache.getElement("2.718281828459045")); 
 }
  
  
  
  
  
}
