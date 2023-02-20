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

import com.google.common.collect.ImmutableSet;


/**
 * Tests for {@link ReplaceIdGenerators}.
 *
 */
public class ReplaceIdGeneratorsTest extends CompilerTestCase {

  private boolean generatePseudoNames = false;
  private ReplaceIdGenerators lastPass = null;
  private String previousMappings = null;

  @Override
  protected CompilerPass getProcessor(final Compiler compiler) {
    lastPass = new ReplaceIdGenerators(
        compiler,
        new ImmutableSet.Builder<String>()
            .add("goog.events.getUniqueId")
            .add("goog.place.getUniqueId")
            .build(),
        generatePseudoNames,
        previousMappings);
    return lastPass;
  }

  @Override
  protected void setUp() throws Exception {
    super.setUp();
    generatePseudoNames = false;
    previousMappings = null;
  }

  @Override
  protected int getNumRepetitions() {
    return 1;
  }

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  private void testMap(String code, String expected, String expectedMap) {
    test(code, expected);
    assertEquals(expectedMap, lastPass.getSerializedIdMappings());
  }

  private void test(String code, String expected, String expectedPseudo) {
    generatePseudoNames = false;
    test(code, expected);
    generatePseudoNames = true;
    test(code, expectedPseudo);
  }

  private void testNonPseudoSupportingGenerator(String code, String expected) {
    generatePseudoNames = false;
    test(code, expected);
    generatePseudoNames = true;
    test(code, expected);
  }
}
