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


/**
 * {@link IgnoreCajaProperties} tests.
 *
 */
public class IgnoreCajaPropertiesTest extends CompilerTestCase {

  private static final String EXTERNS =
      "var z = {}, " +
      "f = function(y) { z[y] = z[y] ? (z[y]+1) : 1; }, " +
      "x, i;";

  public IgnoreCajaPropertiesTest() {
    super(EXTERNS);
  }

  @Override
  public void setUp() {
    super.enableLineNumberCheck(false);
  }

  @Override
  public int getNumRepetitions() {
    return 1;
  }

  

  

  

  

  

  @Override
  public CompilerPass getProcessor(Compiler compiler) {
    return new IgnoreCajaProperties(compiler);
  }
}
