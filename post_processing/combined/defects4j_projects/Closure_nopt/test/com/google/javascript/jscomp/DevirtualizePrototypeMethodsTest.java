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

import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.javascript.jscomp.CheckLevel;
import com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.JSType;

import java.util.List;

/**
 * Tests for {@link DevirtualizePrototypeMethods}
 *
 */
public class DevirtualizePrototypeMethodsTest extends CompilerTestCase {
  private static final String EXTERNAL_SYMBOLS =
      "var extern;extern.externalMethod";
  private final List<String> typeInformation;

  public DevirtualizePrototypeMethodsTest() {
    super(EXTERNAL_SYMBOLS);
    typeInformation = Lists.newArrayList();
  }

  @Override
  protected int getNumRepetitions() {
    // run pass once.
    return 1;
  }

  @Override
  protected void setUp() throws Exception {
    super.setUp();
    super.enableLineNumberCheck(true);
    disableTypeCheck();
  }

  /**
   * Combine source strings using '\n' as the separator.
   */
  private static String newlineJoin(String ... parts) {
    return Joiner.on("\n").join(parts);
  }

  /**
   * Combine source strings using ';' as the separator.
   */
  private static String semicolonJoin(String ... parts) {
    return Joiner.on(";").join(parts);
  }

  /**
   * Inputs for prototype method tests.
   */
  private static class RewritePrototypeMethodTestInput {
    static final String INPUT = newlineJoin(
        "/** @constructor */",
        "function a(){ this.x = 3; }",
        "/** @return {number} */",
        "a.prototype.foo = function() {return this.x};",
        "/** @param {number} p\n@return {number} */",
        "a.prototype.bar = function(p) {return this.x};",
        "a.prototype.baz = function() {};",
        "var o = new a;",
        "o.foo();",
        "o.bar(2);",
        "o.baz()");

    static final String EXPECTED = newlineJoin(
        "function a(){ this.x = 3; }",
        "var JSCompiler_StaticMethods_foo = ",
        "function(JSCompiler_StaticMethods_foo$self) {",
        "  return JSCompiler_StaticMethods_foo$self.x",
        "};",
        "var JSCompiler_StaticMethods_bar = ",
        "function(JSCompiler_StaticMethods_bar$self, p) {",
        "  return JSCompiler_StaticMethods_bar$self.x",
        "};",
        "var JSCompiler_StaticMethods_baz = ",
        "function(JSCompiler_StaticMethods_baz$self) {",
        "};",
        "var o = new a;",
        "JSCompiler_StaticMethods_foo(o);",
        "JSCompiler_StaticMethods_bar(o, 2);",
        "JSCompiler_StaticMethods_baz(o)");

    static final List<String> EXPECTED_TYPE_CHECKING_OFF = ImmutableList.of(
        "FUNCTION a = null",
        "NAME JSCompiler_StaticMethods_foo$self = null",
        "FUNCTION JSCompiler_StaticMethods_foo = null",
        "NAME JSCompiler_StaticMethods_bar$self = null",
        "FUNCTION JSCompiler_StaticMethods_bar = null",
        "FUNCTION JSCompiler_StaticMethods_baz = null",
        "NEW a = null",
        "CALL JSCompiler_StaticMethods_foo = null",
        "CALL JSCompiler_StaticMethods_bar = null",
        "CALL JSCompiler_StaticMethods_baz = null");

    static final List<String> EXPECTED_TYPE_CHECKING_ON = ImmutableList.of(
        "FUNCTION a = function (new:a): undefined",
        "NAME JSCompiler_StaticMethods_foo$self = a",
        "FUNCTION JSCompiler_StaticMethods_foo = function (a): number",
        "NAME JSCompiler_StaticMethods_bar$self = a",
        "FUNCTION JSCompiler_StaticMethods_bar = function (a, number): number",
        "FUNCTION JSCompiler_StaticMethods_baz = function (a): undefined",
        "NEW a = a",
        "CALL JSCompiler_StaticMethods_foo = number",
        "CALL JSCompiler_StaticMethods_bar = number",
        "CALL JSCompiler_StaticMethods_baz = undefined");

    private RewritePrototypeMethodTestInput() {}
  }

  

  

  

  /**
   * Inputs for declaration used as an r-value tests.
   */
  private static class NoRewriteDeclarationUsedAsRValue {
    static final String DECL = "a.prototype.foo = function() {}";
    static final String CALL = "o.foo()";

    private NoRewriteDeclarationUsedAsRValue() {}
  }

  

  

  

  /**
   * Inputs for restrict-to-global-scope tests.
   */
  private static class NoRewriteIfNotInGlobalScopeTestInput {
    static final String INPUT = newlineJoin(
        "function a(){}",
        "a.prototype.foo = function() {return this.x};",
        "var o = new a;",
        "o.foo()");

    private NoRewriteIfNotInGlobalScopeTestInput() {}
  }

  

  

  

  

  /**
   * Inputs for multiple definition tests.
   */
  private static class NoRewriteMultipleDefinitionTestInput {
    static final String TEMPLATE = ".prototype.foo = function() {}";
    static final String SOURCE_A = "a" + TEMPLATE;
    static final String SOURCE_B = "b" + TEMPLATE;
    static final String CALL = "o.foo()";

    static final String SINGLE_DEFINITION_EXPECTED =
        "var JSCompiler_StaticMethods_foo = " +
        "  function(JSCompiler_StaticMethods_foo$self) {};" +
        "JSCompiler_StaticMethods_foo(o)";

    private NoRewriteMultipleDefinitionTestInput() {}
  }

  

  

  

  

  

  /**
   * Inputs for object literal tests.
   */
  private static class NoRewritePrototypeObjectLiteralsTestInput {
    static final String REGULAR = "b.prototype.foo = function() {}";
    static final String OBJ_LIT = "a.prototype = {foo : function() {}}";
    static final String CALL = "o.foo()";

    private NoRewritePrototypeObjectLiteralsTestInput() {}
  }

  

  

  

  

  

  

  

  

  /**
   * Inputs for invalidating reference tests.
   */
  private static class NoRewriteNonCallReferenceTestInput {
    static final String BASE = newlineJoin(
        "function a(){}",
        "a.prototype.foo = function() {return this.x};",
        "var o = new a;");

    private NoRewriteNonCallReferenceTestInput() {}
  }

  

  

  

  /**
   * Inputs for nested definition tests.
   */
  private static class NoRewriteNestedFunctionTestInput {
    static final String PREFIX = "a.prototype.foo = function() {";
    static final String SUFFIX = "o.foo()";
    static final String INNER = "a.prototype.bar = function() {}; o.bar()";
    static final String EXPECTED_PREFIX =
        "var JSCompiler_StaticMethods_foo=" +
        "function(JSCompiler_StaticMethods_foo$self){";
    static final String EXPECTED_SUFFIX =
        "JSCompiler_StaticMethods_foo(o)";

    private NoRewriteNestedFunctionTestInput() {}
  }

  

  

  

  

  

  

  

  

  

  

  

  

  

  private static class ModuleTestInput {
    static final String DEFINITION = "a.prototype.foo = function() {}";
    static final String USE = "x.foo()";

    static final String REWRITTEN_DEFINITION =
        "var JSCompiler_StaticMethods_foo=" +
        "function(JSCompiler_StaticMethods_foo$self){}";
    static final String REWRITTEN_USE =
        "JSCompiler_StaticMethods_foo(x)";

    private ModuleTestInput() {}
  }

  

  

  

  

  

  /**
   * Verifies that the compiler pass's output matches the expected
   * output, and that nodes are annotated with the expected jstype
   * information.
   */
  private void checkTypes(String source,
                          String expected,
                          List<String> expectedTypes) {
    typeInformation.clear();
    test(source, expected);
    assertEquals(expectedTypes, typeInformation);
  }

  @Override
  protected CompilerPass getProcessor(Compiler compiler) {
    return new TypeInformationGatherer(
        compiler, new DevirtualizePrototypeMethods(compiler), typeInformation);
  }

  /**
   * Wrapper that gathers function, call, and self variable type strings after
   * the pass under test runs.  For use to test passes that modify JSType
   * annotations.
   */
  private static class TypeInformationGatherer
      implements CompilerPass {
    private final Compiler compiler;
    private final CompilerPass passUnderTest;
    private final List<String> typeInformation;

    TypeInformationGatherer(Compiler compiler,
                                    CompilerPass passUnderTest,
                                    List<String> typeInformation) {
      this.compiler = compiler;
      this.passUnderTest = passUnderTest;
      this.typeInformation = typeInformation;
    }

    @Override
    public void process(Node externs, Node root) {
      passUnderTest.process(externs, root);
      NodeTraversal.traverse(compiler, externs, new GatherCallback());
      NodeTraversal.traverse(compiler, root, new GatherCallback());
    }

    public String getNameString(Node n) {
      int type = n.getType();
      if (type == Token.NAME) {
        return n.getString();
      } else if (type == Token.GETPROP) {
        String left = getNameString(n.getFirstChild());
        if (left == null) {
          return null;
        }
        return left + "." + n.getLastChild().getString();
      } else if (type == Token.GETELEM) {
        String left = getNameString(n.getFirstChild());
        if (left == null) {
          return null;
        }
        return left + "[" + n.getLastChild().getString() + "]";
      } else if (type == Token.THIS) {
        return "this";
      } else if (type == Token.FUNCTION){
        return "{ANON FUNCTION}";
      } else {
        // I wonder if we should just die on this.
        return null;
      }
    }

    private class GatherCallback extends AbstractPostOrderCallback {
      @Override
      public void visit(NodeTraversal traversal, Node node, Node parent) {
        Node nameNode = null;
        if (node.isFunction()) {
          if (parent.isName()) {
            nameNode = parent;
          } else if (parent.isAssign()) {
            nameNode = parent.getFirstChild();
          } else {
            nameNode = node.getFirstChild();
          }
        } else if (node.isCall() || node.isNew()) {
          nameNode = node.getFirstChild();
        }

        if (nameNode != null) {
          JSType type = node.getJSType();
          typeInformation.add(
              Joiner.on("").join(
                        Token.name(node.getType()),
                        " ",
                        getNameString(nameNode),
                        " = ",
                        (type != null) ? type.toString() : "null"));
        }

        if (node.isGetProp()) {
          Node child = node.getFirstChild();
          if (child.isName() && child.getString().endsWith("$self")) {
            JSType type = child.getJSType();
            typeInformation.add(
                Joiner.on("").join(
                    Token.name(child.getType()),
                    " ",
                    child.getString(),
                    " = ",
                    (type != null) ? type.toString() : "null"));
          }
        }
      }
    }
  }
}
