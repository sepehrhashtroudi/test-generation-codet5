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

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.javascript.jscomp.CompilerOptions.AliasTransformation;
import com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SourcePosition;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * Tests for {@link ScopedAliases}
 *
 * @author robbyw@google.com (Robby Walker)
 */
public class ScopedAliasesTest extends CompilerTestCase {

  private static final String GOOG_SCOPE_START_BLOCK =
      "goog.scope(function() {";
  private static final String GOOG_SCOPE_END_BLOCK = "});";

  private static String EXTERNS = "var window;";

  AliasTransformationHandler transformationHandler =
      CompilerOptions.NULL_ALIAS_TRANSFORMATION_HANDLER;

  public ScopedAliasesTest() {
    super(EXTERNS);
  }

  private void testScoped(String code, String expected) {
    test(GOOG_SCOPE_START_BLOCK + code + GOOG_SCOPE_END_BLOCK, expected);
  }

  private void testScopedNoChanges(String aliases, String code) {
    testScoped(aliases + code, code);
  }

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  private void testTypes(String aliases, String code) {
    testScopedNoChanges(aliases, code);
    verifyTypes();
  }

  private void verifyTypes() {
    Compiler lastCompiler = getLastCompiler();
    new TypeVerifyingPass(lastCompiler).process(lastCompiler.externsRoot,
        lastCompiler.jsRoot);
  }

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  // TODO(robbyw): What if it's recursive?  var goog = goog.dom;

  // FAILURE CASES

  private void testFailure(String code, DiagnosticType expectedError) {
    test(code, null, expectedError);
  }

  private void testScopedFailure(String code, DiagnosticType expectedError) {
    test("goog.scope(function() {" + code + "});", null, expectedError);
  }

  

  

  

  

  

  

  

  

  // Alias Recording Tests
  // TODO(tylerg) : update these to EasyMock style tests once available
  

  

  

  

  private void verifyAliasTransformationPosition(int startLine, int startChar,
      int endLine, int endChar, SourcePosition<AliasTransformation> pos) {
    assertEquals(startLine, pos.getStartLine());
    assertEquals(startChar, pos.getPositionOnStartLine());
    assertTrue(
        "expected endline >= " + endLine + ".  Found " + pos.getEndLine(),
        pos.getEndLine() >= endLine);
    assertTrue("expected endChar >= " + endChar + ".  Found "
        + pos.getPositionOnEndLine(), pos.getPositionOnEndLine() >= endChar);
  }

  @Override
  protected ScopedAliases getProcessor(Compiler compiler) {
    return new ScopedAliases(compiler, null, transformationHandler);
  }

  private static class TransformationHandlerSpy
      implements AliasTransformationHandler {

    private final Map<String, List<SourcePosition<AliasTransformation>>>
        observedPositions = Maps.newHashMap();

    public final List<AliasTransformation> constructedAliases =
        Lists.newArrayList();

    @Override
    public AliasTransformation logAliasTransformation(
        String sourceFile, SourcePosition<AliasTransformation> position) {
      if(!observedPositions.containsKey(sourceFile)) {
        observedPositions.put(sourceFile,
            Lists.<SourcePosition<AliasTransformation>> newArrayList());
      }
      observedPositions.get(sourceFile).add(position);
      AliasTransformation spy = new AliasSpy();
      constructedAliases.add(spy);
      return spy;
    }
  }

  private static class AliasSpy implements AliasTransformation {
    public final Map<String, String> observedDefinitions = Maps.newHashMap();

    @Override
    public void addAlias(String alias, String definition) {
      observedDefinitions.put(alias, definition);
    }
  }

  private static class TypeVerifyingPass
      implements CompilerPass, NodeTraversal.Callback {
    private final Compiler compiler;
    private List<Node> actualTypes = null;

    public TypeVerifyingPass(Compiler compiler) {
      this.compiler = compiler;
    }

    @Override
    public void process(Node externs, Node root) {
      NodeTraversal.traverse(compiler, root, this);
    }

    @Override
    public boolean shouldTraverse(NodeTraversal nodeTraversal, Node n,
        Node parent) {
      return true;
    }

    @Override
    public void visit(NodeTraversal t, Node n, Node parent) {
      JSDocInfo info = n.getJSDocInfo();
      if (info != null) {
        Collection<Node> typeNodes = info.getTypeNodes();
        if (typeNodes.size() > 0) {
          if (actualTypes != null) {
            List<Node> expectedTypes = Lists.newArrayList();
            for (Node typeNode : info.getTypeNodes()) {
              expectedTypes.add(typeNode);
            }
            assertEquals("Wrong number of JsDoc types",
                expectedTypes.size(), actualTypes.size());
            for (int i = 0; i < expectedTypes.size(); i++) {
              assertNull(
                  expectedTypes.get(i).checkTreeEquals(actualTypes.get(i)));
            }
          } else {
            actualTypes = Lists.newArrayList();
            for (Node typeNode : info.getTypeNodes()) {
              actualTypes.add(typeNode);
            }
          }
        }
      }
    }
  }
}
