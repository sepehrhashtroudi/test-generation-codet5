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

import static com.google.javascript.jscomp.SyntacticScopeCreator.VAR_MULTIPLY_DECLARED_ERROR;

import com.google.common.collect.Maps;
import com.google.javascript.jscomp.GlobalNamespace.Name;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

import java.util.Map;

/**
 * @author nicksantos@google.com (Nick Santos)
 */
public class ProcessDefinesTest extends CompilerTestCase {

  public ProcessDefinesTest() {
    super("var externMethod;");

    // ProcessDefines emits warnings if the user tries to re-define a constant,
    // but the constant is not defined anywhere in the binary.
    allowSourcelessWarnings();
  }

  private Map<String, Node> overrides = Maps.newHashMap();
  private GlobalNamespace namespace;

  @Override
  public void setUp() throws Exception {
    super.setUp();
    overrides.clear();
  }

  @Override
  protected CompilerPass getProcessor(Compiler compiler) {
    return new ProcessDefinesWithInjectedNamespace(compiler);
  }

  @Override
  protected int getNumRepetitions() {
    // Only do one repetition, so that we can make sure the first pass keeps
    // GlobalNamespace up to date.
    return 1;
  }

  /**
   * Helper for tests that expects definitions to remain unchanged, such
   * that {@code definitions+js} is converted to {@code definitions+expected}.
   */
  private void testWithPrefix(String definitions, String js, String expected) {
    test(definitions + js, definitions + expected);
  }

public void testDefineOnlyFunction2() { 
     test("/** @define {boolean} */var DEF=true;function foo() {DEF=false};", null, ProcessDefines.INVALID_DEFINE_TYPE_ERROR); 
     test("/** @define {boolean} */var DEF=false;function foo() {DEF=true};", null, ProcessDefines.INVALID_DEFINE_TYPE_ERROR); 
     test("/** @define {boolean} */var DEF=false;function foo() {DEF=true};function bar() {DEF=false};", null, ProcessDefines.INVALID_DEFINE_TYPE_ERROR); 
     test("/** @define {boolean} */var DEF=true;function foo() {DEF=false};", null, ProcessDefines.INVALID_DEFINE_TYPE_ERROR); 
     test("/** @define {boolean} */var DEF=false;function foo() {DEF=true};", null, ProcessDefines.INVALID_DEFINE_TYPE_ERROR); 
 }
public void testAssignInNonGlobalScope45() { 
     test("/** @define {boolean} */var DEF=true;function foo() {DEF=false};", null, ProcessDefines.NON_GLOBAL_DEFINE_INIT_ERROR); 
 }
public void testAssignBeforeDeclaration1372() { 
     test("/** @define {boolean} */var DEF=true;var x = DEF;DEF=false", null, ProcessDefines.INVALID_DEFINE_TYPE_ERROR); 
 }
public void testDefineOnlyFunction374() { 
     test("/** @define {boolean} */var DEF=true;function foo() {DEF=false}", null, ProcessDefines.INVALID_DEFINE_TYPE_ERROR); 
     test("/** @define {boolean} */var DEF=false;function foo() {DEF=true}", null, ProcessDefines.INVALID_DEFINE_TYPE_ERROR); 
     test("/** @define {boolean} */var DEF=false;function foo() {DEF=true}", null, ProcessDefines.INVALID_DEFINE_TYPE_ERROR); 
     test("/** @define {boolean} */var DEF=false;function foo() {DEF=false}", null, ProcessDefines.INVALID_DEFINE_TYPE_ERROR); 
 }
public void testAssignBeforeDeclaration1375() { 
     test("/** @define {boolean} */var DEF=true;var x=false;DEF=false", null, ProcessDefines.INVALID_DEFINE_INIT_ERROR); 
 }
public void testAssignBeforeDeclaration1376() { 
     test("/** @define {boolean} */var DEF=true;function foo() {DEF=false};", null, ProcessDefines.NON_GLOBAL_DEFINE_INIT_ERROR); 
 }
public void testDefineOnlyFunction377() { 
     test("/** @define {boolean} */var DEF=true;function foo() {DEF=false}", null, ProcessDefines.NON_GLOBAL_DEFINE_INIT_ERROR); 
     test("/** @define {boolean} */var DEF=false;function foo() {DEF=true}", null, ProcessDefines.NON_GLOBAL_DEFINE_INIT_ERROR); 
     test("/** @define {boolean} */var DEF=false;function foo() {DEF=true}", null, ProcessDefines.NON_GLOBAL_DEFINE_INIT_ERROR); 
     test("/** @define {boolean} */var DEF=false;function foo() {DEF=false}", null, ProcessDefines.NON_GLOBAL_DEFINE_INIT_ERROR); 
 }
public void testNamespacedDefine1379() { 
     overrides.put("a.B", new Node(Token.TRUE)); 
     test("var a = {};", "var a = {};", null, ProcessDefines.NON_GLOBAL_DEFINE_INIT_ERROR); 
     test("var a = {};", "var a = {};", null, ProcessDefines.NON_GLOBAL_DEFINE_INIT_ERROR); 
 }
public void testDefineOnlyFunction380() { 
     test("/** @define {boolean} */var DEF=true;function foo() {DEF=false}", null, ProcessDefines.INVALID_DEFINE_TYPE_ERROR); 
     test("/** @define {boolean} */var DEF=false;function foo() {DEF=true}", null, ProcessDefines.INVALID_DEFINE_TYPE_ERROR); 
     test("/** @define {boolean} */var DEF=false;function foo() {DEF=true}", null, ProcessDefines.INVALID_DEFINE_TYPE_ERROR); 
     test("/** @define {boolean} */var DEF=false;function foo() {DEF=false}", null, ProcessDefines.INVALID_DEFINE_TYPE_ERROR); 
     test("/** @define {boolean} */var DEF=true;function foo() {DEF=false}", null, ProcessDefines.INVALID_DEFINE_TYPE_ERROR); 
 }
public void testNamespacedDefine1381() { 
     overrides.put("a.B", new Node(Token.TRUE)); 
     test("var a = {};", "var a = {};", null, ProcessDefines.NON_GLOBAL_DEFINE_INIT_ERROR); 
     test("var a = {};", "var a = {};", null, ProcessDefines.NON_GLOBAL_DEFINE_INIT_ERROR); 
     test("var a = {};", "var a = {};", null, ProcessDefines.NON_GLOBAL_DEFINE_INIT_ERROR); 
     test("var a = {};", "var a = {};", null, ProcessDefines.NON_GLOBAL_DEFINE_INIT_ERROR); 
 }
public void testDefineBadType383() { 
     test("/** @define {Object} */ var DEF = {}", null, ProcessDefines.INVALID_DEFINE_TYPE_ERROR); 
 }
  

  

  

  

  

  

  


  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  


  

  private class ProcessDefinesWithInjectedNamespace implements CompilerPass {
    private final Compiler compiler;

    public ProcessDefinesWithInjectedNamespace(Compiler compiler) {
      this.compiler = compiler;
    }

    @Override
    public void process(Node externs, Node js) {
      namespace = new GlobalNamespace(compiler, js);
      new ProcessDefines(compiler, overrides)
          .injectNamespace(namespace)
          .process(externs, js);
    }
  }
}
