/*
 * Copyright 2011 The Closure Compiler Authors.
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

/**
 * Tests for {@link ExpandJqueryAliases}
 */
public class ExpandJqueryAliasesTest extends CompilerTestCase {
  private JqueryCodingConvention conv = new JqueryCodingConvention();

  final DiagnosticType NAME_ERROR =
      ExpandJqueryAliases.JQUERY_UNABLE_TO_EXPAND_INVALID_NAME_ERROR;

  final DiagnosticType INVALID_LIT_ERROR =
      ExpandJqueryAliases.JQUERY_UNABLE_TO_EXPAND_INVALID_LIT_ERROR;

  final DiagnosticType USELESS_EACH_ERROR =
      ExpandJqueryAliases.JQUERY_USELESS_EACH_EXPANSION;

  public ExpandJqueryAliasesTest() {}

  @Override
  protected CompilerPass getProcessor(Compiler compiler) {
    compiler.options.setCodingConvention(conv);
    return new ExpandJqueryAliases(compiler);
  }

  

  

  
}
