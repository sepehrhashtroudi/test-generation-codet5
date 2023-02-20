/*
 * Copyright 2007 The Closure Compiler Authors.
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
 * Tests {@link ConstCheck}.
 *
 */
public class ConstCheckTest extends CompilerTestCase {

  public ConstCheckTest() {
    enableNormalize();
  }

  @Override
  public CompilerPass getProcessor(Compiler compiler) {
    return new ConstCheck(compiler);
  }

  @Override
  public int getNumRepetitions() {
    return 1;
  }

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  private void testError(String js) {
    test(js, null, ConstCheck.CONST_REASSIGNED_VALUE_ERROR);
  }
}
