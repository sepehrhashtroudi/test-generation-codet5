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

import static com.google.javascript.jscomp.CheckGlobalNames.NAME_DEFINED_LATE_WARNING;
import static com.google.javascript.jscomp.CheckGlobalNames.UNDEFINED_NAME_WARNING;
import static com.google.javascript.jscomp.CheckGlobalNames.STRICT_MODULE_DEP_QNAME;

import com.google.javascript.rhino.Node;

/**
 * Tests for {@code CheckGlobalNames.java}.
 *
 * @author nicksantos@google.com (Nick Santos)
 */
public class CheckGlobalNamesTest extends CompilerTestCase {

  private boolean injectNamespace = false;

  public CheckGlobalNamesTest() {
    super("function alert() {}" +
          "/** @constructor */ function Object(){}" +
          "Object.prototype.hasOwnProperty = function() {};" +
          "/** @constructor */ function Function(){}" +
          "Function.prototype.call = function() {};");
  }

  @Override
  protected CompilerPass getProcessor(final Compiler compiler) {
    final CheckGlobalNames checkGlobalNames = new CheckGlobalNames(
        compiler, CheckLevel.WARNING);
    if (injectNamespace) {
      return new CompilerPass() {
        @Override
        public void process(Node externs, Node js) {
          checkGlobalNames.injectNamespace(
              new GlobalNamespace(compiler, externs, js))
              .process(externs, js);
        }
      };
    } else {
      return checkGlobalNames;
    }
  }

  @Override
  public void setUp() {
    injectNamespace = false;
    STRICT_MODULE_DEP_QNAME.level = CheckLevel.WARNING;
  }

  private static final String GET_NAMES =
      "var a = {get d() {return 1}}; a.b = 3; a.c = {get e() {return 5}};";
  private static final String SET_NAMES =
      "var a = {set d(x) {}}; a.b = 3; a.c = {set e(y) {}};";
  private static final String NAMES = "var a = {d: 1}; a.b = 3; a.c = {e: 5};";

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  
  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  
}
