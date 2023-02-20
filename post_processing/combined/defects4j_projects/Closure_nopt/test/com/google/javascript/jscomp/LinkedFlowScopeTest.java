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

import com.google.common.collect.Lists;
import com.google.javascript.jscomp.type.FlowScope;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.JSType;

/**
 * Tests for LinkedFlowScope.
 * @author nicksantos@google.com (Nick Santos)
 */
public class LinkedFlowScopeTest extends CompilerTypeTestCase {

  private final Node blockNode = new Node(Token.BLOCK);
  private final Node functionNode = new Node(Token.FUNCTION);
  private final int LONG_CHAIN_LENGTH = 1050;

  private Scope globalScope;
  private Scope localScope;
  @SuppressWarnings("unused")
  private FlowScope globalEntry;
  private FlowScope localEntry;

  @Override
  public void setUp() throws Exception {
    super.setUp();

    globalScope = Scope.createGlobalScope(blockNode);
    globalScope.declare("globalA", null, null, null);
    globalScope.declare("globalB", null, null, null);

    localScope = new Scope(globalScope, functionNode);
    localScope.declare("localA", null, null, null);
    localScope.declare("localB", null, null, null);

    globalEntry = LinkedFlowScope.createEntryLattice(globalScope);
    localEntry = LinkedFlowScope.createEntryLattice(localScope);
  }

  

  

  

  

  /**
   * Create a long chain of flow scopes where each link in the chain
   * contains one slot.
   */
  

  /**
   * Create a long chain of flow scopes where each link in the chain
   * contains 7 slots.
   */
  

  /**
   * Create a long chain of flow scopes where every 4 links in the chain
   * contain a slot.
   */
  

  // Common chain verification for testLongChainN for all N.
  private void verifyLongChains(FlowScope chainA, FlowScope chainB) {
    FlowScope joined = join(chainA, chainB);
    for (int i = 0; i < LONG_CHAIN_LENGTH; i++) {
      assertTypeEquals(
          i % 2 == 0 ? NUMBER_TYPE : BOOLEAN_TYPE,
          chainA.getSlot("local" + i).getType());
      assertTypeEquals(
          i % 3 == 0 ? STRING_TYPE : BOOLEAN_TYPE,
          chainB.getSlot("local" + i).getType());

      JSType joinedSlotType = joined.getSlot("local" + i).getType();
      if (i % 6 == 0) {
        assertTypeEquals(createUnionType(STRING_TYPE, NUMBER_TYPE), joinedSlotType);
      } else if (i % 2 == 0) {
        assertTypeEquals(createUnionType(NUMBER_TYPE, BOOLEAN_TYPE),
            joinedSlotType);
      } else if (i % 3 == 0) {
        assertTypeEquals(createUnionType(STRING_TYPE, BOOLEAN_TYPE),
            joinedSlotType);
      } else {
        assertTypeEquals(BOOLEAN_TYPE, joinedSlotType);
      }
    }

    assertScopesDiffer(chainA, chainB);
    assertScopesDiffer(chainA, joined);
    assertScopesDiffer(chainB, joined);
  }

  

  

  

  private void assertScopesDiffer(FlowScope a, FlowScope b) {
    assertFalse(a.equals(b));
    assertFalse(b.equals(a));
    assertEquals(a, a);
    assertEquals(b, b);
  }

  private void assertScopesSame(FlowScope a, FlowScope b) {
    assertEquals(a, b);
    assertEquals(b, a);
    assertEquals(a, a);
    assertEquals(b, b);
  }

  @SuppressWarnings("unchecked")
  private FlowScope join(FlowScope a, FlowScope b) {
    return (new LinkedFlowScope.FlowScopeJoinOp()).apply(
        Lists.newArrayList(a, b));
  }
}
