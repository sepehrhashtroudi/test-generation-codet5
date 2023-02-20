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

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  
}
