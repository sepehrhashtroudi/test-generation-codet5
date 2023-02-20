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

import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.google.common.collect.Sets;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.testing.BaseJSTypeTestCase;
import com.google.javascript.rhino.testing.TestErrorReporter;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * Unit test for the Compiler DisambiguateProperties pass.
 *
 */
public class DisambiguatePropertiesTest extends CompilerTestCase {
  private DisambiguateProperties<?> lastPass;
  private boolean runTightenTypes;

  public DisambiguatePropertiesTest() {
    parseTypeInfo = true;
  }

  @Override
  protected void setUp() throws Exception {
    super.setUp();
    super.enableNormalize(true);
    super.enableTypeCheck(CheckLevel.WARNING);
  }

  @Override
  public CompilerPass getProcessor(final Compiler compiler) {

    return new CompilerPass() {
      @Override
      public void process(Node externs, Node root) {
        Map<String, CheckLevel> propertiesToErrorFor =
            Maps.<String, CheckLevel>newHashMap();
        propertiesToErrorFor.put("foobar", CheckLevel.ERROR);

        if (runTightenTypes) {
          TightenTypes tightener = new TightenTypes(compiler);
          tightener.process(externs, root);
          lastPass = DisambiguateProperties.forConcreteTypeSystem(compiler,
              tightener, propertiesToErrorFor);
        } else {
          // This must be created after type checking is run as it depends on
          // any mismatches found during checking.
          lastPass = DisambiguateProperties.forJSTypeSystem(
              compiler, propertiesToErrorFor);
        }

        lastPass.process(externs, root);
      }
    };
  }

  @Override
  protected int getNumRepetitions() {
    return 1;
  }

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  /**
   * Tests that the type based version skips renaming on types that have a
   * mismatch, and the type tightened version continues to work as normal.
   */
  

  

  

  

  

  

  

  

  

  @SuppressWarnings("unchecked")
  private void testSets(boolean runTightenTypes, String js, String expected,
      String fieldTypes) {
    this.runTightenTypes = runTightenTypes;
    test(js, expected);
    assertEquals(
        fieldTypes, mapToString(lastPass.getRenamedTypesForTesting()));
  }

  @SuppressWarnings("unchecked")
  private void testSets(boolean runTightenTypes, String externs, String js,
       String expected, String fieldTypes) {
    testSets(runTightenTypes, externs, js, expected, fieldTypes, null, null);
  }

  @SuppressWarnings("unchecked")
  private void testSets(boolean runTightenTypes, String externs, String js,
       String expected, String fieldTypes, DiagnosticType warning,
       String description) {
    this.runTightenTypes = runTightenTypes;
    test(externs, js, expected, null, warning, description);
    assertEquals(
        fieldTypes, mapToString(lastPass.getRenamedTypesForTesting()));
  }

  /**
   * Compiles the code and checks that the set of types for each field matches
   * the expected value.
   *
   * <p>The format for the set of types for fields is:
   * {field=[[Type1, Type2]]}
   */
  private void testSets(boolean runTightenTypes, String js, String fieldTypes) {
    this.runTightenTypes = runTightenTypes;
    test(js, null, null, null);
    assertEquals(fieldTypes, mapToString(lastPass.getRenamedTypesForTesting()));
  }

  /**
   * Compiles the code and checks that the set of types for each field matches
   * the expected value.
   *
   * <p>The format for the set of types for fields is:
   * {field=[[Type1, Type2]]}
   */
  private void testSets(boolean runTightenTypes, String js, String fieldTypes,
      DiagnosticType warning) {
    this.runTightenTypes = runTightenTypes;
    test(js, null, null, warning);
    assertEquals(fieldTypes, mapToString(lastPass.getRenamedTypesForTesting()));
  }

  /** Sorts the map and converts to a string for comparison purposes. */
  private <T> String mapToString(Multimap<String, Collection<T>> map) {
    TreeMap<String, String> retMap = Maps.newTreeMap();
    for (String key : map.keySet()) {
      TreeSet<String> treeSet = Sets.newTreeSet();
      for (Collection<T> collection : map.get(key)) {
        Set<String> subSet = Sets.newTreeSet();
        for (T type : collection) {
          subSet.add(type.toString());
        }
        treeSet.add(subSet.toString());
      }
      retMap.put(key, treeSet.toString());
    }
    return retMap.toString();
  }
}
