/*
 * Copyright 2007 The Closure Compiler Authors.
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
package com.google.javascript.jscomp;

import static com.google.javascript.jscomp.LightweightMessageFormatter.LineNumberingFormatter;

import com.google.javascript.rhino.Node;

import junit.framework.TestCase;

public class LightweightMessageFormatterTest extends TestCase {
  private static final DiagnosticType FOO_TYPE =
      DiagnosticType.error("TEST_FOO", "error description here");

  

  

  

  

  

  

  

  

  

  

  

  

  private LightweightMessageFormatter formatter(String string) {
    return new LightweightMessageFormatter(source(string));
  }

  private SourceExcerptProvider source(final String source) {
    return new SourceExcerptProvider() {
      @Override
      public String getSourceLine(String sourceName, int lineNumber) {
        return source;
      }
      @Override
      public Region getSourceRegion(String sourceName, int lineNumber) {
        throw new UnsupportedOperationException();
      }
    };
  }

  private String format(Region region) {
    return new LineNumberingFormatter().formatRegion(region);
  }

  private Region region(final int startLine, final int endLine,
      final String source) {
    return new SimpleRegion(startLine, endLine, source);
  }
}
