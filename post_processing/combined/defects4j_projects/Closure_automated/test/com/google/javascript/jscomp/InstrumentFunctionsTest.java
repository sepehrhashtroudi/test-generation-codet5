/*
 * Copyright 2008 The Closure Compiler Authors.
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

import com.google.common.collect.ImmutableList;
import com.google.javascript.rhino.Node;

import java.io.StringReader;
import java.util.List;

/**
 * Tests for {@link InstrumentFunctions}
 *
 */
public class InstrumentFunctionsTest extends CompilerTestCase {
  private String instrumentationPb;

  public InstrumentFunctionsTest() {
    this.instrumentationPb = null;
  }

  @Override
  protected void setUp() {
    super.enableLineNumberCheck(false);
    this.instrumentationPb = null;
  }

  @Override
  protected CompilerPass getProcessor(Compiler compiler) {
    return new NameAndInstrumentFunctions(compiler);
  }

  @Override
  protected int getNumRepetitions() {
    // This pass is not idempotent.
    return 1;
  }

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  private class NameAndInstrumentFunctions implements CompilerPass {
    private final Compiler compiler;
    NameAndInstrumentFunctions(Compiler compiler) {
      this.compiler = compiler;
    }

    @Override
    public void process(Node externs, Node root) {
      FunctionNames functionNames = new FunctionNames(compiler);
      functionNames.process(externs, root);

      InstrumentFunctions instrumentation =
              new InstrumentFunctions(compiler, functionNames,
                      "test init code", "testfile.js",
                      new StringReader(instrumentationPb));
      instrumentation.process(externs, root);
    }
  }
}
