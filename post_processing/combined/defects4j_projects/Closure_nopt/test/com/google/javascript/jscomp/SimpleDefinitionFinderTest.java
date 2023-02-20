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
import com.google.common.collect.Multiset;
import com.google.common.collect.Sets;
import com.google.common.collect.TreeMultiset;
import com.google.javascript.jscomp.DefinitionsRemover.Definition;
import com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

import java.util.Collection;
import java.util.Set;

/**
 * Tests for {@link SimpleDefinitionFinder}
 *
 */
public class SimpleDefinitionFinderTest extends CompilerTestCase {
  Set<String> found = Sets.newTreeSet();

  @Override
  protected int getNumRepetitions() {
    // run pass once.
    return 1;
  }

  @Override
  protected void tearDown() throws Exception {
    super.tearDown();
    found.clear();
  }

  

  

  

  

  

  

  

  

  

  

  void checkDefinitionsInExterns(String externs, Set<String> expected) {
    checkDefinitions(externs, "", expected);
  }

  void checkDefinitionsInJs(String js, Set<String> expected) {
    checkDefinitions("", js, expected);
  }

  void checkDefinitions(String externs, String source, Set<String> expected) {
    testSame(externs, source, null);
    assertEquals(expected, found);
    found.clear();
  }

  @Override
  protected CompilerPass getProcessor(Compiler compiler) {
    return new SimpleDefinitionEnumerator(compiler);
  }

  /**
   * Run SimpleDefinitionFinder, then gather a list of definitions.
   */
  private class SimpleDefinitionEnumerator
      extends AbstractPostOrderCallback implements CompilerPass {
    private final SimpleDefinitionFinder passUnderTest;
    private final Compiler compiler;

    SimpleDefinitionEnumerator(Compiler compiler) {
      this.passUnderTest = new SimpleDefinitionFinder(compiler);
      this.compiler = compiler;
    }

    @Override
    public void process(Node externs, Node root) {
      passUnderTest.process(externs, root);
      NodeTraversal.traverse(compiler, externs, this);
      NodeTraversal.traverse(compiler, root, this);

      for (DefinitionSite defSite : passUnderTest.getDefinitionSites()) {
        Node node = defSite.node;
        Definition definition = defSite.definition;
        StringBuilder sb = new StringBuilder();
        sb.append("DEF ");
        sb.append(Token.name(node.getType()));
        sb.append(" ");
        sb.append(node.getQualifiedName());
        sb.append(" -> ");

        if (definition.isExtern()) {
          sb.append("EXTERN ");
        }

        Node rValue = definition.getRValue();
        if (rValue != null) {
          sb.append(Token.name(rValue.getType()));
        } else {
          sb.append("<null>");
        }

        found.add(sb.toString());
      }

    }

    @Override
    public void visit(NodeTraversal traversal, Node node, Node parent) {
      Collection<Definition> defs =
          passUnderTest.getDefinitionsReferencedAt(node);
      if (defs != null) {
        StringBuilder sb = new StringBuilder();
        sb.append("USE ");
        sb.append(Token.name(node.getType()));
        sb.append(" ");
        sb.append(node.getQualifiedName());
        sb.append(" -> ");
        Multiset<String> defstrs = TreeMultiset.create();
        for (Definition def : defs) {
          String defstr;

          Node rValue = def.getRValue();
          if (rValue != null) {
            defstr = Token.name(rValue.getType());
          } else {
            defstr = "<null>";
          }

          if (def.isExtern()) {
            defstr = "EXTERN " + defstr;
          }

          defstrs.add(defstr);
        }

        sb.append(defstrs.toString());
        found.add(sb.toString());
      }
    }
  }
}
