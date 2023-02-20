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

import com.google.javascript.rhino.Node;
import com.google.javascript.jscomp.CheckLevel;
import static com.google.javascript.jscomp.ProcessClosurePrimitives.BASE_CLASS_ERROR;
import static com.google.javascript.jscomp.ProcessClosurePrimitives.DUPLICATE_NAMESPACE_ERROR;
import static com.google.javascript.jscomp.ProcessClosurePrimitives.EXPECTED_OBJECTLIT_ERROR;
import static com.google.javascript.jscomp.ProcessClosurePrimitives.FUNCTION_NAMESPACE_ERROR;
import static com.google.javascript.jscomp.ProcessClosurePrimitives.INVALID_ARGUMENT_ERROR;
import static com.google.javascript.jscomp.ProcessClosurePrimitives.INVALID_PROVIDE_ERROR;
import static com.google.javascript.jscomp.ProcessClosurePrimitives.INVALID_STYLE_ERROR;
import static com.google.javascript.jscomp.ProcessClosurePrimitives.LATE_PROVIDE_ERROR;
import static com.google.javascript.jscomp.ProcessClosurePrimitives.MISSING_PROVIDE_ERROR;
import static com.google.javascript.jscomp.ProcessClosurePrimitives.NON_STRING_PASSED_TO_SET_CSS_NAME_MAPPING_ERROR;
import static com.google.javascript.jscomp.ProcessClosurePrimitives.NULL_ARGUMENT_ERROR;
import static com.google.javascript.jscomp.ProcessClosurePrimitives.TOO_MANY_ARGUMENTS_ERROR;
import static com.google.javascript.jscomp.ProcessClosurePrimitives.XMODULE_REQUIRE_ERROR;
import static com.google.javascript.jscomp.ProcessClosurePrimitives.INVALID_CSS_RENAMING_MAP;

/**
 * Tests for {@link ProcessClosurePrimitives}.
 *
 */
public class ProcessClosurePrimitivesTest extends CompilerTestCase {
  private String additionalCode;
  private String additionalEndCode;
  private boolean addAdditionalNamespace;

  public ProcessClosurePrimitivesTest() {
    enableLineNumberCheck(true);
  }

  @Override protected void setUp() {
    additionalCode = null;
    additionalEndCode = null;
    addAdditionalNamespace = false;
  }

  @Override public CompilerPass getProcessor(final Compiler compiler) {
    if ((additionalCode == null) && (additionalEndCode == null)) {
      return new ProcessClosurePrimitives(
          compiler, null, CheckLevel.ERROR);
    } else {
      return new CompilerPass() {
        @Override
        public void process(Node externs, Node root) {
          // Process the original code.
          new ProcessClosurePrimitives(compiler, null, CheckLevel.OFF)
              .process(externs, root);

          // Inject additional code at the beginning.
          if (additionalCode != null) {
            SourceFile file =
                SourceFile.fromCode("additionalcode", additionalCode);
            Node scriptNode = root.getFirstChild();
            Node newScriptNode = new CompilerInput(file).getAstRoot(compiler);
            if (addAdditionalNamespace) {
              newScriptNode.getFirstChild()
                  .putBooleanProp(Node.IS_NAMESPACE, true);
            }
            while (newScriptNode.getLastChild() != null) {
              Node lastChild = newScriptNode.getLastChild();
              newScriptNode.removeChild(lastChild);
              scriptNode.addChildBefore(lastChild, scriptNode.getFirstChild());
            }
          }

          // Inject additional code at the end.
          if (additionalEndCode != null) {
            SourceFile file =
                SourceFile.fromCode("additionalendcode", additionalEndCode);
            Node scriptNode = root.getFirstChild();
            Node newScriptNode = new CompilerInput(file).getAstRoot(compiler);
            if (addAdditionalNamespace) {
              newScriptNode.getFirstChild()
                  .putBooleanProp(Node.IS_NAMESPACE, true);
            }
            while (newScriptNode.getFirstChild() != null) {
              Node firstChild = newScriptNode.getFirstChild();
              newScriptNode.removeChild(firstChild);
              scriptNode.addChildToBack(firstChild);
            }
          }

          // Process the tree a second time.
          new ProcessClosurePrimitives(compiler, null, CheckLevel.ERROR)
              .process(externs, root);
        }
      };
    }
  }

  @Override public int getNumRepetitions() {
    return 1;
  }

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  // Tests providing additional code with non-overlapping var namespace.
  

  // Same as above, but with the additional code added after the original.
  

  // Tests providing additional code with non-overlapping dotted namespace.
  

  // Tests providing additional code with overlapping var namespace.
  

  // Tests providing additional code with overlapping var namespace.
  

  // Tests providing additional code with overlapping dotted namespace.
  

  // Tests that a require of additional code generates no error.
  

  // Tests that a require not in additional code generates (only) one error.
  

  // Tests that a require in additional code generates no error.
  

  // Tests a case where code is reordered after processing provides and then
  // provides are processed again.
  

  // Another version of above.
  

  // Provide a name before the definition of the class providing the
  // parent namespace.
  

  // Provide a name after the definition of the class providing the
  // parent namespace.
  

  // Provide a name after the definition of the class providing the
  // parent namespace.
  

  

  

  

  

  private static final String METHOD_FORMAT =
      "function Foo() {} Foo.prototype.method = function() { %s };";

  private static final String FOO_INHERITS =
      "goog.inherits(Foo, BaseFoo);";

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  
}
