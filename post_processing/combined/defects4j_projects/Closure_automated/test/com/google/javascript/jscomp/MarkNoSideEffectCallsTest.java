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

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback;
import static com.google.javascript.jscomp.MarkNoSideEffectCalls.INVALID_NO_SIDE_EFFECT_ANNOTATION;
import com.google.javascript.rhino.Node;
import java.util.Collections;
import java.util.List;

/**
 * Tests for {@link MarkNoSideEffectCalls}
 *
 */
public class MarkNoSideEffectCallsTest extends CompilerTestCase {
  List<String> noSideEffectCalls = Lists.newArrayList();

  private static String kExterns =
      "function externSef1(){}" +
      "/**@nosideeffects*/function externNsef1(){}" +
      "var externSef2 = function(){};" +
      "/**@nosideeffects*/var externNsef2 = function(){};" +
      "var externNsef3 = /**@nosideeffects*/function(){};" +
      "var externObj;" +
      "externObj.sef1 = function(){};" +
      "/**@nosideeffects*/externObj.nsef1 = function(){};" +
      "externObj.nsef2 = /**@nosideeffects*/function(){};" +
      "externObj.sef2;" +
      "/**@nosideeffects*/externObj.nsef3;";

  public MarkNoSideEffectCallsTest() {
    super(kExterns);
  }

  @Override
  protected int getNumRepetitions() {
    // run pass once.
    return 1;
  }

  @Override
  protected void tearDown() throws Exception {
    super.tearDown();
    noSideEffectCalls.clear();
  }

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  void testMarkCalls(String source, List<String> expected) {
    testMarkCalls("", source, expected);
  }

  void testMarkCalls(
      String extraExterns, String source, List<String> expected) {
    testSame(kExterns + extraExterns, source, null);
    assertEquals(expected, noSideEffectCalls);
    noSideEffectCalls.clear();
  }

  @Override
  protected CompilerPass getProcessor(Compiler compiler) {
    return new NoSideEffectCallEnumerator(compiler);
  }

  /**
   * Run MarkNoSideEffectCalls, then gather a list of calls that are
   * marked as having no side effects.
   */
  private class NoSideEffectCallEnumerator
      extends AbstractPostOrderCallback implements CompilerPass {
    private final MarkNoSideEffectCalls passUnderTest;
    private final Compiler compiler;

    NoSideEffectCallEnumerator(Compiler compiler) {
      this.passUnderTest = new MarkNoSideEffectCalls(compiler);
      this.compiler = compiler;
    }

    @Override
    public void process(Node externs, Node root) {
      passUnderTest.process(externs, root);
      NodeTraversal.traverse(compiler, externs, this);
      NodeTraversal.traverse(compiler, root, this);
    }

    @Override
    public void visit(NodeTraversal t, Node n, Node parent) {
      if (n.isNew()) {
        if (!NodeUtil.constructorCallHasSideEffects(n)) {
          noSideEffectCalls.add(n.getFirstChild().getQualifiedName());
        }
      } else if (n.isCall()) {
        if (!NodeUtil.functionCallHasSideEffects(n)) {
          noSideEffectCalls.add(n.getFirstChild().getQualifiedName());
        }
      }
    }
  }
}
