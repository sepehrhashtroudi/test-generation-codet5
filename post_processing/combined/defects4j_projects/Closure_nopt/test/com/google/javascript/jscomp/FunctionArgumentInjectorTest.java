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

import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.collect.Sets;
import com.google.javascript.rhino.Node;
import junit.framework.TestCase;

import java.util.Collections;
import java.util.Map;
import java.util.Set;

/**
 * Inline function tests.
 * @author johnlenz@google.com (John Lenz)
 */
public class FunctionArgumentInjectorTest extends TestCase {

  // TODO(johnlenz): Add unit tests for:
  //    inject
  //    getFunctionCallParameterMap

  private static final Set<String> EMPTY_STRING_SET = Collections.emptySet();

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  private void testNeededTemps(
      String code, String fnName, Set<String> expectedTemps) {
    Node n = parse(code);
    Node fn = findFunction(n, fnName);
    assertNotNull(fn);
    Node call = findCall(n, fnName);
    assertNotNull(call);
    Map<String, Node> args =
      FunctionArgumentInjector.getFunctionCallParameterMap(
          fn, call, getNameSupplier());

    Set<String> actualTemps = Sets.newHashSet();
    FunctionArgumentInjector.maybeAddTempsForCallArguments(
        fn, args, actualTemps, new ClosureCodingConvention());

    assertEquals(expectedTemps, actualTemps);
  }

  private static Supplier<String> getNameSupplier() {
    return new Supplier<String>() {
      int i = 0;
      @Override
      public String get() {
        return String.valueOf(i++);
      }
    };
  }

  private static Node findCall(Node n, String name) {
    if (n.isCall()) {
      Node callee;
      if (NodeUtil.isGet(n.getFirstChild())) {
        callee = n.getFirstChild().getFirstChild();
        Node prop = callee.getNext();
        // Only "call" is support at this point.
        Preconditions.checkArgument(prop.isString() &&
            prop.getString().equals("call"));
      } else {
        callee = n.getFirstChild();
      }

      if (callee.isName()
          && callee.getString().equals(name)) {
        return n;
      }
    }

    for (Node c : n.children()) {
      Node result = findCall(c, name);
      if (result != null) {
        return result;
      }
    }

    return null;
  }

  private static Node findFunction(Node n, String name) {
    if (n.isFunction()) {
      if (n.getFirstChild().getString().equals(name)) {
        return n;
      }
    }

    for (Node c : n.children()) {
      Node result = findFunction(c, name);
      if (result != null) {
        return result;
      }
    }

    return null;
  }

  private static Node parseFunction(String js) {
    return parse(js).getFirstChild();
  }

  private static Node parse(String js) {
    Compiler compiler = new Compiler();
    Node n = compiler.parseTestCode(js);
    assertEquals(0, compiler.getErrorCount());
    return n;
  }
}
