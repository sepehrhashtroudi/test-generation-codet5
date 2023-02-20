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

import static com.google.javascript.jscomp.TypeValidator.TYPE_MISMATCH_WARNING;
import static com.google.javascript.rhino.jstype.JSTypeNative.BOOLEAN_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_TYPE;
import static com.google.javascript.rhino.jstype.JSTypeNative.STRING_TYPE;

import com.google.common.collect.Lists;
import com.google.javascript.jscomp.CheckLevel;
import com.google.javascript.jscomp.TypeValidator.TypeMismatch;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeNative;
import com.google.javascript.rhino.jstype.JSTypeRegistry;

import java.util.Collections;
import java.util.List;

/**
 * Tests for TypeValidator.
 * @author nicksantos@google.com (Nick Santos)
 */
public class TypeValidatorTest extends CompilerTestCase {

  private Compiler compiler = null;

  public TypeValidatorTest() {
    enableTypeCheck(CheckLevel.ERROR);
  }

  @Override
  protected CompilerPass getProcessor(final Compiler compiler) {
    this.compiler = compiler;
    return new CompilerPass() {
      @Override
      public void process(Node externs, Node n) {
        // Do nothing: we're in it for the type-checking.
      }
    };
  }

  @Override public int getNumRepetitions() { return 1; }

public void testBasicMismatch267() throws Exception { 
     testSame("/** @param {number} x */ function f(x) {} f('a');", TYPE_MISMATCH_WARNING); 
     assertMismatches(Lists.newArrayList(fromNatives(STRING_TYPE, NUMBER_TYPE))); 
 }
  

  

  

  

  

  private TypeMismatch fromNatives(JSTypeNative a, JSTypeNative b) {
    JSTypeRegistry registry = compiler.getTypeRegistry();
    return new TypeMismatch(
        registry.getNativeType(a), registry.getNativeType(b), null);
  }

  private void assertMismatches(List<TypeMismatch> expected) {
    List<TypeMismatch> actual = Lists.newArrayList(
        compiler.getTypeValidator().getMismatches());
    assertEquals(expected, actual);
  }
}
