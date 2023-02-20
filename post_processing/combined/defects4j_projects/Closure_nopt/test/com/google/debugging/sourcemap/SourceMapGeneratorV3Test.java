/*
 * Copyright 2011 The Closure Compiler Authors.
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

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.javascript.jscomp.SourceMap;
import com.google.javascript.jscomp.SourceMap.Format;

import java.io.IOException;
import java.io.StringWriter;
import java.util.LinkedHashMap;
import java.util.List;


/**
 * @author johnlenz@google.com (John Lenz)
 */
public class SourceMapGeneratorV3Test extends SourceMapTestCase {

  public SourceMapGeneratorV3Test() {
  }

  @Override
  protected SourceMapConsumer getSourceMapConsumer() {
    return new SourceMapConsumerV3();
  }

  @Override
  protected Format getSourceMapFormat() {
    return SourceMap.Format.V3;
  }

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  private String getEmptyMapFor(String name) throws IOException {
    StringWriter out = new StringWriter();
    SourceMapGeneratorV3 generator = new SourceMapGeneratorV3();
    generator.appendTo(out, name);
    return out.toString();
  }

  

  

  

  FilePosition count(String js) {
    int line = 0, column = 0;
    for (int i = 0; i < js.length(); i++) {
      if (js.charAt(i) == '\n') {
        line++;
        column = 0;
      } else {
        column++;
      }
    }
    return new FilePosition(line, column);
  }

  FilePosition appendAndCount(Appendable out, String js) throws IOException {
    out.append(js);
    return count(js);
  }
}
