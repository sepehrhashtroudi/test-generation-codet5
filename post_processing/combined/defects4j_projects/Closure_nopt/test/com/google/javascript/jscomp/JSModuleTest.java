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
import com.google.common.collect.ImmutableSet;

import junit.framework.TestCase;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

/**
 * Tests for {@link JSModule}
 *
 */
public class JSModuleTest extends TestCase {
  private JSModule mod1;
  private JSModule mod2;  // depends on mod1
  private JSModule mod3;  // depends on mod1
  private JSModule mod4;  // depends on mod2, mod3
  private JSModule mod5;  // depends on mod1

  @Override
  protected void setUp() {
    List<JSModule> modulesInDepOrder = new ArrayList<JSModule>();

    mod1 = new JSModule("mod1");
    modulesInDepOrder.add(mod1);

    mod2 = new JSModule("mod2");
    mod2.addDependency(mod1);
    modulesInDepOrder.add(mod2);

    mod3 = new JSModule("mod3");
    mod3.addDependency(mod1);
    modulesInDepOrder.add(mod3);

    mod4 = new JSModule("mod4");
    mod4.addDependency(mod2);
    mod4.addDependency(mod3);
    modulesInDepOrder.add(mod4);

    mod5 = new JSModule("mod5");
    mod5.addDependency(mod1);
    modulesInDepOrder.add(mod5);
  }

  

  

  private void assertSortedInputs(
      List<CompilerInput> expected, List<CompilerInput> shuffled)
      throws Exception {
    JSModule mod = new JSModule("mod");
    for (CompilerInput input : shuffled) {
      input.setModule(null);
      mod.add(input);
    }
    Compiler compiler = new Compiler(System.err);
    compiler.initCompilerOptionsIfTesting();
    mod.sortInputsByDeps(compiler);

    assertEquals(expected, mod.getInputs());
  }

  
}
