/*
 * Copyright 2006 The Closure Compiler Authors.
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


public class RemoveTryCatchTest extends CompilerTestCase {

  public RemoveTryCatchTest() {
    // do not compare as tree because we use synthetic blocks
    super("", false);
  }

  @Override public CompilerPass getProcessor(Compiler compiler) {
    return new RemoveTryCatch(compiler);
  }

  @Override public int getNumRepetitions() {
    // Use only one repetition because test code contains JSDoc comments.
    return 1;
  }

  

  

  

  

  

  

  
}
