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
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

import junit.framework.*;

import java.util.*;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Tests for {@link JSModuleGraph}
 *
 */
public class JSModuleGraphTest extends TestCase {

  private final JSModule A = new JSModule("A");
  private final JSModule B = new JSModule("B");
  private final JSModule C = new JSModule("C");
  private final JSModule D = new JSModule("D");
  private final JSModule E = new JSModule("E");
  private final JSModule F = new JSModule("F");
  private JSModuleGraph graph = null;

  // For resolving dependencies only.
  private Compiler compiler;

  @Override
  public void setUp() throws Exception {
    super.setUp();
    B.addDependency(A);  //     __A__
    C.addDependency(A);  //    /  |  \
    D.addDependency(B);  //   B   C  |
    E.addDependency(B);  //  / \ /|  |
    E.addDependency(C);  // D   E | /
    F.addDependency(A);  //      \|/
    F.addDependency(C);  //       F
    F.addDependency(E);
    graph = new JSModuleGraph(new JSModule[] {A, B, C, D, E, F});
    compiler = new Compiler();
  }

  

  

  

  

  

  

  

  

  

  

  

  private List<CompilerInput> setUpManageDependenciesTest() {
    List<CompilerInput> inputs = Lists.newArrayList();

    A.add(code("a1", provides("a1"), requires()));
    A.add(code("a2", provides("a2"), requires("a1")));
    A.add(code("a3", provides(), requires("a1")));

    B.add(code("b1", provides("b1"), requires("a2")));
    B.add(code("b2", provides(), requires("a1", "a2")));

    C.add(code("c1", provides("c1"), requires("a1")));
    C.add(code("c2", provides("c2"), requires("c1")));

    E.add(code("e1", provides(), requires("c1")));
    E.add(code("e2", provides(), requires("c1")));

    inputs.addAll(A.getInputs());
    inputs.addAll(B.getInputs());
    inputs.addAll(C.getInputs());
    inputs.addAll(E.getInputs());

    for (CompilerInput input : inputs) {
      input.setCompiler(compiler);
    }
    return inputs;
  }

  private void assertInputs(JSModule module, String ... sourceNames) {
    List<CompilerInput> actualInputs = module.getInputs();

    assertEquals(
        Lists.newArrayList(sourceNames),
        sourceNames(module.getInputs()));
  }

  private List<String> sourceNames(List<CompilerInput> inputs) {
    List<String> inputNames = Lists.newArrayList();
    for (CompilerInput input : inputs) {
      inputNames.add(input.getName());
    }
    return inputNames;
  }

  private SourceFile code(
      String sourceName, List<String> provides, List<String> requires) {
    String text = "";
    for (String p : provides) {
      text += "goog.provide('" + p + "');\n";
    }
    for (String r : requires) {
      text += "goog.require('" + r + "');\n";
    }
    return SourceFile.fromCode(sourceName, text);
  }

  private List<String> provides(String ... strings) {
    return Lists.newArrayList(strings);
  }

  private List<String> requires(String ... strings) {
    return Lists.newArrayList(strings);
  }

  private void assertDeepestCommonDepInclusive(
      JSModule expected, JSModule m1, JSModule m2) {
    assertDeepestCommonDepOneWay(expected, m1, m2, true);
    assertDeepestCommonDepOneWay(expected, m2, m1, true);
  }

  private void assertDeepestCommonDep(
      JSModule expected, JSModule m1, JSModule m2) {
    assertDeepestCommonDepOneWay(expected, m1, m2, false);
    assertDeepestCommonDepOneWay(expected, m2, m1, false);
  }

  private void assertDeepestCommonDepOneWay(
      JSModule expected, JSModule m1, JSModule m2, boolean inclusive) {
    JSModule actual = inclusive ?
        graph.getDeepestCommonDependencyInclusive(m1, m2) :
        graph.getDeepestCommonDependency(m1, m2);
    if (actual != expected) {
      fail(String.format(
          "Deepest common dep of %s and %s should be %s but was %s",
          m1.getName(), m2.getName(),
          expected == null ? "null" : expected.getName(),
          actual ==  null ? "null" : actual.getName()));
    }
  }

  private void assertTransitiveDepsDeepestFirst(JSModule m, JSModule... deps) {
    Iterable<JSModule> actual = graph.getTransitiveDepsDeepestFirst(m);
    assertEquals(Arrays.toString(deps),
                 Arrays.toString(Iterables.toArray(actual, JSModule.class)));
  }
}
