/*
 * Copyright (C) 2010 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.gson.stream;

import junit.framework.TestCase;

import java.io.IOException;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.math.BigInteger;

public final class JsonWriterTest extends TestCase {

public void testTwoNames6() throws IOException { 
     StringWriter stringWriter = new StringWriter(); 
     JsonWriter jsonWriter = new JsonWriter(stringWriter); 
     jsonWriter.beginObject(); 
     jsonWriter.name("a"); 
     try { 
         jsonWriter.name("a"); 
         fail(); 
     } catch (IllegalStateException expected) { 
     } 
 }
public void testObjectsInArrays7() throws IOException { 
     StringWriter stringWriter = new StringWriter(); 
     JsonWriter jsonWriter = new JsonWriter(stringWriter); 
     jsonWriter.beginArray(); 
     jsonWriter.beginObject(); 
     jsonWriter.name("a").value(5); 
     jsonWriter.name("b").value(false); 
     jsonWriter.endObject(); 
     jsonWriter.beginObject(); 
     jsonWriter.name("c").value(6); 
     jsonWriter.name("d").value(true); 
     jsonWriter.endObject(); 
     jsonWriter.endArray(); 
     assertEquals("[{\"a\":5,\"b\":false}," + "{\"c\":6,\"d\":true}]", stringWriter.toString()); 
 }
public void testDeepNestingArrays8() throws IOException { 
     StringWriter stringWriter = new StringWriter(); 
     JsonWriter jsonWriter = new JsonWriter(stringWriter); 
     for (int i = 0; i < 20; i++) { 
         jsonWriter.beginArray(); 
     } 
     for (int i = 0; i < 20; i++) { 
         jsonWriter.endArray(); 
     } 
     assertEquals("[[[[[[[[[[[[[[[[[[[[]]]]]]]]]]]]]]]]]]", stringWriter.toString()); 
 }
public void testStrings9() throws IOException { 
     StringWriter stringWriter = new StringWriter(); 
     JsonWriter jsonWriter = new JsonWriter(stringWriter); 
     jsonWriter.beginArray(); 
     jsonWriter.value("a"); 
     jsonWriter.value("a\""); 
     jsonWriter.value("\""); 
     jsonWriter.value(":"); 
     jsonWriter.value(","); 
     jsonWriter.value("\b"); 
     jsonWriter.value("\f"); 
     jsonWriter.value("\n"); 
     jsonWriter.value("\r"); 
     jsonWriter.value("\t"); 
     jsonWriter.value(" "); 
     jsonWriter.value("\\"); 
     jsonWriter.value("{"); 
     jsonWriter.value("}"); 
     jsonWriter.value("["); 
     jsonWriter.value("]"); 
     jsonWriter.value("\0"); 
     jsonWriter.value("\u0019"); 
     jsonWriter.endArray(); 
     assertEquals("[\"a\"," + "\"a\\\"\"," + "\"\\\"\"," + "\":\"," + "\",\"," + "\"\\b\"," + "\"\\f\"," + "\"\\n\"," + "\"\\r\"," + "\"\\t\"," + "\" \"," + "\"\\\\\"," + "\"{\"," + "\"}\"," + "\"[\"," + "\"]\"," + "\"\\u0000\"," + "\"\\u0019\"]", stringWriter.toString()); 
 }
public void testNonFiniteDoubles10() throws IOException { 
     StringWriter stringWriter = new StringWriter(); 
     JsonWriter jsonWriter = new JsonWriter(stringWriter); 
     jsonWriter.beginArray(); 
     try { 
         jsonWriter.value(Double.NaN); 
         fail(); 
     } catch (IllegalArgumentException expected) { 
     } 
     try { 
         jsonWriter.value(Double.NEGATIVE_INFINITY); 
         fail(); 
     } catch (IllegalArgumentException expected) { 
     } 
     try { 
         jsonWriter.value(Double.POSITIVE_INFINITY); 
         fail(); 
     } catch (IllegalArgumentException expected) { 
     } 
 }
public void testMultipleTopLevelValues11() throws IOException { 
     StringWriter stringWriter = new StringWriter(); 
     JsonWriter jsonWriter = new JsonWriter(stringWriter); 
     jsonWriter.beginArray().endArray(); 
     try { 
         jsonWriter.beginArray(); 
         fail(); 
     } catch (IllegalStateException expected) { 
     } 
 }
public void testDeepNestingArrays12() throws IOException { 
     StringWriter stringWriter = new StringWriter(); 
     JsonWriter jsonWriter = new JsonWriter(stringWriter); 
     for (int i = 0; i < 20; i++) { 
         jsonWriter.beginArray(); 
     } 
     for (int i = 0; i < 20; i++) { 
         jsonWriter.endArray(); 
     } 
     assertEquals("[[[[[[[[[[[[[[[[[[]]]]]]]]]]]]]]]]]]", stringWriter.toString()); 
 }
  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  
}
