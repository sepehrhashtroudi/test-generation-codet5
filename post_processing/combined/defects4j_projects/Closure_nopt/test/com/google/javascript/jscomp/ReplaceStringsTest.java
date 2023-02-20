/*
 * Copyright 2010 The Closure Compiler Authors.
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

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import com.google.javascript.jscomp.ReplaceStrings.Result;
import com.google.javascript.rhino.Node;

import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * Tests for {@link ReplaceStrings}.
 *
 */
public class ReplaceStringsTest extends CompilerTestCase {
  private ReplaceStrings pass;
  private Set<String> reserved;
  private VariableMap previous;

  private final static String EXTERNS =
    "var goog = {};\n" +
    "goog.debug = {};\n" +
    "/** @constructor */\n" +
    "goog.debug.Trace = function() {};\n" +
    "goog.debug.Trace.startTracer = function (var_args) {};\n" +
    "/** @constructor */\n" +
    "goog.debug.Logger = function() {};\n" +
    "goog.debug.Logger.prototype.info = function(msg, opt_ex) {};\n" +
    "/**\n" +
    " * @param {string} name\n" +
    " * @return {!goog.debug.Logger}\n" +
    " */\n" +
    "goog.debug.Logger.getLogger = function(name){};\n";

  public ReplaceStringsTest() {
    super(EXTERNS, true);
    enableNormalize();
  }

  @Override
  protected CompilerOptions getOptions() {
    CompilerOptions options = super.getOptions();
    options.setWarningLevel(
        DiagnosticGroups.MISSING_PROPERTIES, CheckLevel.OFF);
    return options;
  }

  @Override
  protected void setUp() throws Exception {
    super.setUp();
    super.enableLineNumberCheck(false);
    super.enableTypeCheck(CheckLevel.OFF);
    reserved = Collections.emptySet();
    previous = null;
  }

  @Override
  public CompilerPass getProcessor(final Compiler compiler) {
    List<String> names = Lists.newArrayList(
        "Error(?)",
        "goog.debug.Trace.startTracer(*)",
        "goog.debug.Logger.getLogger(?)",
        "goog.debug.Logger.prototype.info(?)"
        );
    pass = new ReplaceStrings(compiler, "`", names, reserved, previous);

    return new CompilerPass() {
        @Override
        public void process(Node externs, Node js) {
          new CollapseProperties(compiler, true, true).process(externs, js);
          pass.process(externs, js);
        }
      };
  }

  @Override
  public int getNumRepetitions() {
    // This compiler pass is not idempotent and should only be run over a
    // parse tree once.
    return 1;
  }

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  // Non-matching "info" property.
  

  // Non-matching "info" prototype property.
  

  // Non-matching "info" prototype property.
  

  // Non-matching "info" property on "NoObject" type.
  

  // Non-matching "info" property on "UnknownObject" type.
  

  

  

  

  

  

  

  

  

  

  private void testDebugStrings(String js, String expected,
                                String[] substitutedStrings) {
    // Verify that the strings are substituted correctly in the JS code.
    test(js, expected);

    List<Result> results = pass.getResult();
    assertTrue(substitutedStrings.length % 2 == 0);
    assertEquals(substitutedStrings.length/2, results.size());

    // Verify that substituted strings are decoded correctly.
    for (int i = 0; i < substitutedStrings.length; i += 2) {
      Result result = results.get(i/2);
      String original = substitutedStrings[i + 1];
      assertEquals(original, result.original);

      String replacement = substitutedStrings[i];
      assertEquals(replacement, result.replacement);
    }
  }
}
