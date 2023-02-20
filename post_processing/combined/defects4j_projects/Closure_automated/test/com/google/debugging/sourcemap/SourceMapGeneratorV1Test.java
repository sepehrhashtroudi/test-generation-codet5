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

import com.google.javascript.jscomp.SourceMap;
import com.google.javascript.jscomp.SourceMap.Format;

/**
 * Tests for {@link SourceMap}.
 *
 */
public class SourceMapGeneratorV1Test extends SourceMapTestCase {

  public SourceMapGeneratorV1Test() {
    disableColumnValidation();
  }

  @Override
  protected SourceMapConsumer getSourceMapConsumer() {
    return new SourceMapConsumerV1();
  }

  @Override
  protected Format getSourceMapFormat() {
    return SourceMap.Format.V1;
  }

  @Override
  public void setUp() {
    detailLevel = SourceMap.DetailLevel.ALL;
  }

public void testGoldenOutput212() throws Exception { 
     checkSourceMap("function f(foo, bar) {\r\n\n\n\nfoo = foo + bar + foo;" + "\nreturn foo;\n}", "{\n" + "\"version\":2,\n" + "\"file\":\"testcode\",\n" + "\"lineCount\":1,\n" + "\"lineMaps\":[" + "\"cAEBABIBA/ICA+ADICA/ICA+IDA9IEYBMBA5\"],\n" + "\"mappings\":[[0,1,0,0],\n" + "[0,1,9,0],\n" + "[0,1,10],\n" + "[0,1,11,1],\n" + "[0,1,16,2],\n" + "[0,1,21],\n" + "[0,5,0],\n" + "[0,5,0,1],\n" + "[0,5,6,1],\n" + "[0,5,12,2],\n" + "[0,5,18,1],\n" + "[0,6,0],\n" + "[0,6,7,1],\n" + "],\n" + "\"sources\":[\"testcode\"],\n" + "\"names\":[\"f\",\"foo\",\"bar\"]\n" + "}\n"); 
 }
public void testBasicDeterminism123() throws Exception { 
     RunResult result1 = compile("file1", "foo;", "file2", "bar;"); 
     RunResult result2 = compile("file2", "foo;", "file1", "bar;"); 
     String map1 = getSourceMap(result1); 
     String map2 = getSourceMap(result2); 
     String files1 = map1.split("\n")[4]; 
     String files2 = map2.split("\n")[4]; 
     assertEquals(files1, files2); 
 }
public void testMultilineMapping124() throws Exception { 
     compileAndCheck("function __BASIC__(__PARAM1__, __PARAM2__) {\n" + "var __VAR__ = '__STR__';\n" + "var __ANO__ = \"__STR2__\";\n" + "}"); 
 }
public void testGoldenOutput2125() throws Exception { 
     checkSourceMap("function f(foo, bar) {\r\n\n\n\nfoo = foo + bar + foo;" + "\nreturn foo;\n}", "{\n" + "\"version\":2,\n" + "\"file\":\"testcode\",\n" + "\"lineCount\":1,\n" + "\"lineMaps\":[" + "\"cAEBABIBA/ICA+ADICA/ICA+IDA9IEYBMBA5\"],\n" + "\"mappings\":[[0,1,0,0],\n" + "[0,1,9,0],\n" + "[0,1,10],\n" + "[0,1,11,1],\n" + "[0,1,16,2],\n" + "[0,1,21],\n" + "[0,5,0],\n" + "[0,5,0,1],\n" + "[0,5,6,1],\n" + "[0,5,12,2],\n" + "[0,5,18,1],\n" + "[0,6,0],\n" + "[0,6,7,1],\n" + "\"sources\":[\"testcode\"],\n" + "\"names\":[\"f\",\"foo\",\"bar\"]\n" + "}\n"); 
 }
  

  

  

  

  

  

  

  

  

  

  

  

  

  

  
}
