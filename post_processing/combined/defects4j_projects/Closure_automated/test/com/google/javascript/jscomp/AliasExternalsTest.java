/*
 * Copyright 2006 The Closure Compiler Authors.
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
 * Tests for {@link AliasExternals}.
 *
 */
public class AliasExternalsTest extends CompilerTestCase {

  private static String EXTERNS =
    // Globals
    "/** @const */ var window;" +
    "/** @const */ var document;" +
    "var arguments;var _USER_ID;var ActiveXObject;" +
    "function eval(x) {}" +
    // Properties
    "window.setTimeout;" +
    "window.eval;" +
    "props.window;props.innerHTML;props.length;props.prototype;props.length;" +
    // More globals
    "/** @noalias */ var RangeObject; " +
    "var /** @noalias */ RuntimeObject, SelectionObject;" +
    "/** @noalias */ function NoAliasFunction() {};";

  // Blacklist and whitelist of globals. Assign to these before running test
  // if you want to factor them in to the test, otherwise they will be null.
  private String unaliasableGlobals;
  private String aliasableGlobals;

  public AliasExternalsTest() {
    super(EXTERNS);
  }

  @Override
  protected int getNumRepetitions() {
    // This pass only runs once.
    return 1;
  }

  @Override
  public void setUp() {
    super.enableLineNumberCheck(false);
    super.enableNormalize();
    unaliasableGlobals = null;
    aliasableGlobals = null;
  }

  /**
   * Test standard global aliasing.
   */
public void testPropMutatorNotPushedDeeper3() { 
     test(createModuleChain("var a = [1]; a.length = 1;", "a.length = 0;"), new String[] { formatSetPropFn("length") + "var a = [1]; SETPROP_length(a, 1);", "SETPROP_length(a, 0);" }); 
 }
public void testNoAliasAnnotationForMultiVarDeclaration67() { 
     test("[RuntimeObject, RuntimeObject, RuntimeObject," + " SelectionObject, SelectionObject, SelectionObject]", "var GLOBAL_SelectionObject = SelectionObject;" + "[RuntimeObject, RuntimeObject, RuntimeObject," + " GLOBAL_SelectionObject, GLOBAL_SelectionObject," + " GLOBAL_SelectionObject]"); 
 }
  

  /**
   * Some globals should not be aliased because they have special meaning
   * within the language (like arguments).
   */
  

  /**
   * Test using a whitelist to explicitly alias only specific
   * identifiers.
   */
  

  /**
   * Test combined usage of aliasable and unaliasable global lists.
   */
  

  /**
   * Global variables that get re-assigned should not be aliased.
   */
  

  

  /**
   * Test the standard replacement for GETPROP
   */
  

  /**
   * Ops that should be ignored
   */
  

  /**
   * Test property setting
   */
  

  /**
   * Test for modifying both parent and child, as all replacements
   * are on a single pass and modifying both involves being careful with
   * references.
   */
  

  private static final String MODULE_SRC_ONE =
      "a=b.length;a=b.length;a=b.length;";
  private static final String MODULE_SRC_TWO = "c=d.length;";

  /**
   * Test that the code is placed in the first module when there are no
   * dependencies.
   */
  

  /**
   * Test that the code is placed in the first module when the second module
   * depends on the first.
   */
  

  

  

  

  

  

  

  

  

  

  

  

  private String formatPropNameDecl(String prop) {
    return "var $$PROP_" + prop + "='" + prop + "';";
  }

  private String formatSetPropFn(String prop) {
    String mutatorName = "SETPROP_" + prop;
    String arg1 = mutatorName + "$a";
    String arg2 = mutatorName + "$b";
    return "function " + mutatorName + "(" + arg1 + "," + arg2 + ") {" +
        "return " + arg1 + "." + prop + "=" + arg2 + ";}";
  }

  @Override
  protected CompilerPass getProcessor(Compiler compiler) {
    AliasExternals ae = new AliasExternals(
        compiler, compiler.getModuleGraph(),
        unaliasableGlobals, aliasableGlobals);
    ae.setRequiredUsage(1);
    return ae;
  }
}
