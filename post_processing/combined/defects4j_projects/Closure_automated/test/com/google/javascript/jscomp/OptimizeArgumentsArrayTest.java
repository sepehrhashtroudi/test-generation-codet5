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

/**
 * Unit tests for {@link OptimizeArgumentsArray}.
 *
 */
public class OptimizeArgumentsArrayTest extends CompilerTestCase {

  public OptimizeArgumentsArrayTest() {
    /*
     * arguments is a builtin variable of the javascript language and
     * OptimizeArgumentsArray does not make any attempt to resolve it. However,
     * I am leaving "var arguments" in the externs to emulate the current
     * behavior we have for JS compilation where var arguments in defined in
     * externs/es3.js as extern.
     */
    super("var arguments, alert" /* Externs */);
  }

  @Override
  public void setUp() {
    super.enableLineNumberCheck(false);
  }

  @Override
  protected CompilerPass getProcessor(Compiler compiler) {
    return new OptimizeArgumentsArray(compiler, "p");
  }

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  
}
