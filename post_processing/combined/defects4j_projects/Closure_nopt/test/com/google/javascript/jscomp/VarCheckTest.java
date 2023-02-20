/*
 * Copyright 2005 The Closure Compiler Authors.
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
import com.google.common.collect.Lists;
import com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback;
import com.google.javascript.rhino.Node;

public class VarCheckTest extends CompilerTestCase {
  private static final String EXTERNS = "var window; function alert() {}";

  private CheckLevel strictModuleDepErrorLevel;
  private boolean sanityCheck = false;

  private CheckLevel externValidationErrorLevel;

  private CompilerPass testSetupPass;

  public VarCheckTest() {
    super(EXTERNS);
  }

  @Override
  protected void setUp() throws Exception {
    super.setUp();
    // Setup value set by individual tests to the appropriate defaults.
    super.allowExternsChanges(true);
    super.enableAstValidation(true);
    strictModuleDepErrorLevel = CheckLevel.OFF;
    externValidationErrorLevel = null;
    sanityCheck = false;
    testSetupPass = null;
  }

  @Override
  protected CompilerOptions getOptions() {
    CompilerOptions options = super.getOptions();
    options.setWarningLevel(DiagnosticGroups.STRICT_MODULE_DEP_CHECK,
        strictModuleDepErrorLevel);
    if (externValidationErrorLevel != null) {
     options.setWarningLevel(DiagnosticGroups.EXTERNS_VALIDATION,
         externValidationErrorLevel);
    }
    return options;
  }

  @Override
  protected CompilerPass getProcessor(final Compiler compiler) {
    if (!sanityCheck) {
      return new CompilerPass() {
        @Override public void process(Node externs, Node root) {
          if (testSetupPass != null) {
            testSetupPass.process(externs, root);
          }
          new VarCheck(compiler, false).process(externs, root);
          if (!compiler.hasErrors()) {
            new VarCheck(compiler, true).process(externs, root);
          }
        }
      };
    }
    return new VarCheck(compiler, sanityCheck);
  }

  @Override
  protected int getNumRepetitions() {
    // Because we synthesize externs, the second pass won't emit a warning.
    return 1;
  }

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  private void testDependentModules(String code1, String code2,
                                    DiagnosticType error) {
    testDependentModules(code1, code2, error, null);
  }

  private void testDependentModules(String code1, String code2,
                                    DiagnosticType error,
                                    DiagnosticType warning) {
    testTwoModules(code1, code2, true, error, warning);
  }

  private void testIndependentModules(String code1, String code2,
                                      DiagnosticType error,
                                      DiagnosticType warning) {
    testTwoModules(code1, code2, false, error, warning);
  }

  private void testTwoModules(String code1, String code2, boolean m2DependsOnm1,
                              DiagnosticType error, DiagnosticType warning) {
    JSModule m1 = new JSModule("m1");
    m1.add(SourceFile.fromCode("input1", code1));
    JSModule m2 = new JSModule("m2");
    m2.add(SourceFile.fromCode("input2", code2));
    if (m2DependsOnm1) {
      m2.addDependency(m1);
    }
    test(new JSModule[] { m1, m2 },
         new String[] { code1, code2 }, error, warning);
  }

  //////////////////////////////////////////////////////////////////////////////
  // Test synthesis of externs

  

  

  

  

  

  

  

  

  

  

  

  private final static class VariableTestCheck implements CompilerPass {

    final AbstractCompiler compiler;
    VariableTestCheck(AbstractCompiler compiler) {
      this.compiler = compiler;
    }

    @Override
    public void process(Node externs, Node root) {
      NodeTraversal.traverseRoots(compiler, Lists.newArrayList(externs, root),
          new AbstractPostOrderCallback() {
        @Override
        public void visit(NodeTraversal t, Node n, Node parent) {
          if (n.isName() && !parent.isFunction()
              && !parent.isLabel()) {
            assertTrue("Variable " + n.getString() + " should have be declared",
                t.getScope().isDeclared(n.getString(), true));
          }
        }
      });
    }
  }

  public void checkSynthesizedExtern(
      String input, String expectedExtern) {
    checkSynthesizedExtern("", input, expectedExtern);
  }

  public void checkSynthesizedExtern(
      String extern, String input, String expectedExtern) {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.setWarningLevel(
        DiagnosticGroup.forType(VarCheck.UNDEFINED_VAR_ERROR),
        CheckLevel.OFF);
    compiler.init(
        ImmutableList.of(SourceFile.fromCode("extern", extern)),
        ImmutableList.of(SourceFile.fromCode("input", input)),
        options);
    compiler.parseInputs();
    assertFalse(compiler.hasErrors());

    Node externsAndJs = compiler.getRoot();
    Node root = externsAndJs.getLastChild();

    Node rootOriginal = root.cloneTree();
    Node externs = externsAndJs.getFirstChild();

    Node expected = compiler.parseTestCode(expectedExtern);
    assertFalse(compiler.hasErrors());

    (new VarCheck(compiler, sanityCheck))
        .process(externs, root);
    if (!sanityCheck) {
      (new VariableTestCheck(compiler)).process(externs, root);
    }

    String externsCode = compiler.toSource(externs);
    String expectedCode = compiler.toSource(expected);

    assertEquals(expectedCode, externsCode);
  }
}
