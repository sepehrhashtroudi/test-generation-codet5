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

import com.google.javascript.jscomp.Normalize.NormalizeStatements;
import com.google.javascript.rhino.Node;

/**
 * @author johnlenz@google.com (John Lenz)
 *
 */
public class DenormalizeTest extends CompilerTestCase {
  @Override
  public CompilerPass getProcessor(final Compiler compiler) {
    return new NormalizeAndDenormalizePass(compiler);
  }

  @Override
  protected int getNumRepetitions() {
    // The normalize pass is only run once.
    return 1;
  }

  

  

  

  /**
   * Create a class to combine the Normalize and Denormalize passes.
   * This is needed because the enableNormalize() call on CompilerTestCase
   * causes normalization of the result *and* the expected string, and
   * we really don't want the compiler twisting the expected code around.
   */
  public class NormalizeAndDenormalizePass implements CompilerPass {
    Denormalize denormalizePass;
    NormalizeStatements normalizePass;
    AbstractCompiler compiler;

    public NormalizeAndDenormalizePass(AbstractCompiler compiler) {
      this.compiler = compiler;
      denormalizePass = new Denormalize(compiler);
      normalizePass = new NormalizeStatements(compiler, false);
    }

    @Override
    public void process(Node externs, Node root) {
      NodeTraversal.traverse(compiler, root, normalizePass);
      NodeTraversal.traverse(compiler, root, denormalizePass);
    }
  }

}
