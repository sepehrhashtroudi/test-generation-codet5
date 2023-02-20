/*
 * Copyright 2009 The Closure Compiler Authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.debugging.sourcemap;

import com.google.debugging.sourcemap.SourceMapConsumerV1;
import com.google.debugging.sourcemap.SourceMapParseException;
import com.google.debugging.sourcemap.proto.Mapping.OriginalMapping;

import junit.framework.TestCase;

public class SourceMapConsumerV1Test extends TestCase {

  public SourceMapConsumerV1Test() {
  }

  public SourceMapConsumerV1Test(String name) {
    super(name);
  }

public void testGetMappingForLineWithNameIndex127() throws Exception { 
     String mapData = "{\n" + "\"version\":2,\n" + "\"file\":\"testcode\",\n" + "\"lineCount\":1,\n" + "\"lineMaps\":" + "[\"cAEBABIBA/ICA+ADICA/ICA+IDA9AEYBMBA5\"],\n" + "\"sources\":[\"testcode\"],\n" + "\"names\": [\"f\"],\n" + "\"mappings\":[[0,1,9,0],\n" + "[0,1,9,0]\n" + "]\n" + "}\n"; 
     SourceMapConsumerV2 sourceMap = new SourceMapConsumerV2(); 
     sourceMap.parse(mapData); 
     OriginalMapping mapping = sourceMap.getMappingForLine(1, 10); 
     assertNotNull(mapping); 
     assertEquals("testcode", mapping.getOriginalFile()); 
     assertEquals(1, mapping.getLineNumber()); 
     assertEquals(9, mapping.getColumnPosition()); 
     assertEquals("f", mapping.getIdentifier()); 
 }
public void testInvalidHeaderFailure131() throws Exception { 
     StringBuilder sb = new StringBuilder(); 
     sb.append("/** Begin line maps. **/{ count : 1 }\n"); 
     sb.append("[0,,,1]\n"); 
     sb.append("[3,,,4]\n"); 
     sb.append("[5,,,6]\n"); 
     assertException("Expected /** Begin file information. **/ got [3,,,4]\n", sb); 
 }
public void testInvalidCountFailure132() throws Exception { 
     StringBuilder sb = new StringBuilder(); 
     sb.append("/** Begin line maps. **/{ count : 0 }\n"); 
     sb.append("[0,,,1]\n"); 
     sb.append("[3,,,4]\n"); 
     sb.append("[5,,,6]\n"); 
     assertException("Expected /** Begin file information. **/ got [3,,,4]\n", sb); 
 }
  

  

  

  

  

  

  

  

  

  

  

  

  

  

  private void assertException(String exception, StringBuilder sb) {
    boolean exceptionRaised = false;

    try {
      SourceMapConsumerV1 sourceMap = new SourceMapConsumerV1();
      sourceMap.parse(sb.toString());

    } catch (SourceMapParseException pe) {
      assertEquals(exception, pe.getMessage());
      exceptionRaised = true;
    }

    assertTrue(exceptionRaised);
  }

  private void assertExceptionStartsWith(String exception, StringBuilder sb) {
    boolean exceptionRaised = false;

    try {
      SourceMapConsumerV1 sourceMap = new SourceMapConsumerV1();
      sourceMap.parse(sb.toString());

    } catch (SourceMapParseException pe) {
      assertTrue(
        "expected <" + exception +"> but was <"+ pe.getMessage() +">",
        pe.getMessage().startsWith(exception));
      exceptionRaised = true;
    }

    assertTrue(exceptionRaised);
  }

}
