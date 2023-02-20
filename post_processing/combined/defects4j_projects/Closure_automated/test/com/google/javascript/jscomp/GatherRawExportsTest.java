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

import com.google.common.collect.Sets;

import java.util.Set;

/**
 * Tests for {@link GatherRawExports}.
 *
 * @author johnlenz@google.com (John Lenz)
 */
public class GatherRawExportsTest extends CompilerTestCase {

  private static final String EXTERNS = "var window;";
  private GatherRawExports last;

  public GatherRawExportsTest() {
    super(EXTERNS);
    super.enableNormalize();
  }

  @Override
  protected CompilerPass getProcessor(Compiler compiler) {
    last = new GatherRawExports(compiler);
    return last;
  }

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  private void assertExported(String js, String ... names) {
    Set<String> setNames = Sets.newHashSet(names);
    testSame(js);
    assertTrue(last.getExportedVariableNames().equals(setNames));
  }
}
