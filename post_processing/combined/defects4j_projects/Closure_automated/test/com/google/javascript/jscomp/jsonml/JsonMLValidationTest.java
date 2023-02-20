/*
 * Copyright 2010 The Closure Compiler Authors.
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

package com.google.javascript.jscomp.jsonml;

import com.google.javascript.jscomp.jsonml.JsonML;
import com.google.javascript.jscomp.jsonml.JsonMLUtil;
import com.google.javascript.jscomp.jsonml.TagAttr;
import com.google.javascript.jscomp.jsonml.TagType;
import com.google.javascript.jscomp.jsonml.Validator;

import junit.framework.TestCase;

/**
 * Tests validation of particular JsonML elements.
 *
 * @author dhans@google.com (Daniel Hans)
 */
public class JsonMLValidationTest extends TestCase {

  // Used for correct statements - error message should be null
  private void testValidation(String jsonml) throws Exception {
    JsonML jsonMLRoot = JsonMLUtil.parseString(jsonml);
    String msg = Validator.validate(jsonMLRoot);
    if (msg != null) {
      String errorMsg = String.format(
          "Validation error for %s.\n Received: %s\n", jsonml, msg);
    }
  }

  private void testValidation(String jsonml, String expected)
      throws Exception {
    JsonML jsonMLRoot = JsonMLUtil.parseString(jsonml);
    String msg = Validator.validate(jsonMLRoot);
    if (!msg.equals(expected)) {
      String errorMsg = String.format(
          "Validation error for %s.\n Received: %s\n Expected: %s\n",
          jsonml, msg, expected);
      assertEquals(errorMsg, expected, msg);
    }
  }

  private void testNotEnoughChildrenValidation(String jsonml, TagType type,
      int expected, int actual) throws Exception {
    testValidation(jsonml,
        String.format(Validator.NOT_ENOUGH_CHILDREN_FMT,
        type, expected, actual));
  }

  private void testTooManyChildrenValidation(String jsonml, TagType type,
      int expected, int actual) throws Exception {
    testValidation(jsonml,
        String.format(Validator.TOO_MANY_CHILDREN_FMT,
        type, expected, actual));
  }

  private void testWrongChildTypeValidation(String jsonml, TagType type,
      TagType expected, TagType actual, int index) throws Exception {
    testWrongChildTypeValidation(jsonml, type, new TagType[] { expected },
        actual, index);
  }

  private void testWrongChildTypeValidation(String jsonml, TagType type,
      TagType[] expected, TagType actual, int index) throws Exception {
    testValidation(jsonml,
        String.format(Validator.WRONG_CHILD_TYPE_FMT,
        index, type, Validator.printList(expected), actual));
  }

  private void testMissingArgument(String jsonml, TagAttr attr, TagType type)
      throws Exception {
    testValidation(jsonml,
        String.format(Validator.MISSING_ARGUMENT, attr, type));
  }

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  
}
