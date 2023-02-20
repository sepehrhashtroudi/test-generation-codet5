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

package com.google.javascript.jscomp;

import static com.google.javascript.jscomp.TypeCheck.WRONG_ARGUMENT_COUNT;
import static com.google.javascript.jscomp.FunctionTypeBuilder.OPTIONAL_ARG_AT_END;
import static com.google.javascript.jscomp.FunctionTypeBuilder.VAR_ARGS_MUST_BE_LAST;

import com.google.javascript.jscomp.CheckLevel;
import com.google.javascript.rhino.Node;

/**
 * Tests for function and method arity checking in TypeCheck.
 * @author nicksantos@google.com (Nick Santos)
 */
public class TypeCheckFunctionCheckTest extends CompilerTestCase {

  private CodingConvention convention = null;

  public TypeCheckFunctionCheckTest() {
    parseTypeInfo = true;
    enableTypeCheck(CheckLevel.ERROR);
  }

  @Override protected CompilerPass getProcessor(Compiler compiler) {
    return new CompilerPass() {
      @Override
      public void process(Node externs, Node root) {}
    };
  }

  @Override
  protected CodingConvention getCodingConvention() {
    return convention;
  }

  @Override
  protected int getNumRepetitions() {
    // TypeCheck will only run once, regardless of what this returns.
    // We return 1 so that the framework only expects 1 warning.
    return 1;
  }

  @Override
  public void setUp() throws Exception {
    super.setUp();
    convention = new GoogleCodingConvention();
  }

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  public void assertOk(String params, String arguments) {
    assertWarning(params, arguments, null);
  }

  public void assertWarning(String params, String arguments,
      DiagnosticType type) {
    testSame("function foo(" + params + ") {} foo(" + arguments + ");",
        type);
  }
}
