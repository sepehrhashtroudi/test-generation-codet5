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

import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.javascript.jscomp.AbstractCommandLineRunner.FlagUsageException;
import com.google.javascript.jscomp.CompilerOptions.LanguageMode;
import com.google.javascript.rhino.Node;

import junit.framework.TestCase;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.List;
import java.util.Map;

/**
 * Tests for {@link CommandLineRunner}.
 *
 * @author nicksantos@google.com (Nick Santos)
 */
public class CommandLineRunnerTest extends TestCase {

  private Compiler lastCompiler = null;
  private CommandLineRunner lastCommandLineRunner = null;
  private List<Integer> exitCodes = null;
  private ByteArrayOutputStream outReader = null;
  private ByteArrayOutputStream errReader = null;
  private Map<Integer,String> filenames;

  // If set, this will be appended to the end of the args list.
  // For testing args parsing.
  private String lastArg = null;

  // If set to true, uses comparison by string instead of by AST.
  private boolean useStringComparison = false;

  private ModulePattern useModules = ModulePattern.NONE;

  private enum ModulePattern {
    NONE,
    CHAIN,
    STAR
  }

  private List<String> args = Lists.newArrayList();

  /** Externs for the test */
  private final List<SourceFile> DEFAULT_EXTERNS = ImmutableList.of(
    SourceFile.fromCode("externs",
        "var arguments;"
        + "/**\n"
        + " * @constructor\n"
        + " * @param {...*} var_args\n"
        + " * @nosideeffects\n"
        + " * @throws {Error}\n"
        + " */\n"
        + "function Function(var_args) {}\n"
        + "/**\n"
        + " * @param {...*} var_args\n"
        + " * @return {*}\n"
        + " */\n"
        + "Function.prototype.call = function(var_args) {};"
        + "/**\n"
        + " * @constructor\n"
        + " * @param {...*} var_args\n"
        + " * @return {!Array}\n"
        + " */\n"
        + "function Array(var_args) {}"
        + "/**\n"
        + " * @param {*=} opt_begin\n"
        + " * @param {*=} opt_end\n"
        + " * @return {!Array}\n"
        + " * @this {Object}\n"
        + " */\n"
        + "Array.prototype.slice = function(opt_begin, opt_end) {};"
        + "/** @constructor */ function Window() {}\n"
        + "/** @type {string} */ Window.prototype.name;\n"
        + "/** @type {Window} */ var window;"
        + "/** @constructor */ function Element() {}"
        + "Element.prototype.offsetWidth;"
        + "/** @nosideeffects */ function noSideEffects() {}\n"
        + "/** @param {...*} x */ function alert(x) {}\n")
  );

  private List<SourceFile> externs;

  @Override
  public void setUp() throws Exception {
    super.setUp();
    externs = DEFAULT_EXTERNS;
    filenames = Maps.newHashMap();
    lastCompiler = null;
    lastArg = null;
    outReader = new ByteArrayOutputStream();
    errReader = new ByteArrayOutputStream();
    useStringComparison = false;
    useModules = ModulePattern.NONE;
    args.clear();
    exitCodes = Lists.newArrayList();
  }

  @Override
  public void tearDown() throws Exception {
    super.tearDown();
  }

public void testIssue817() { 
     args.add("--compilation_level=ADVANCED_OPTIMIZATIONS"); 
     useStringComparison = true; 
     test("eval('1'); var x = eval; x('2');", "eval(\"1\");(0,eval)(\"2\");"); 
 }
public void testInlineInFunction5100() { 
     testSame("function baz() { " + "var a = (foo = new obj());" + "foo.x();" + "result = a;" + "}"); 
 }
public void testCodeBuilderAppend103() { 
     Compiler.CodeBuilder cb = new Compiler.CodeBuilder(); 
     cb.append("foo();"); 
     assertEquals(0, cb.getLineIndex()); 
     assertEquals(6, cb.getColumnIndex()); 
     cb.append("goo();"); 
     assertEquals(0, cb.getLineIndex()); 
     assertEquals(12, cb.getColumnIndex()); 
     cb.append("blah();\ngoo();"); 
     assertEquals(1, cb.getLineIndex()); 
     assertEquals(6, cb.getColumnIndex()); 
 }
public void testProcessCJSWithModuleOutput400() { 
     useStringComparison = true; 
     args.add("--process_common_js_modules"); 
     args.add("--common_js_entry_module=foo/bar"); 
     args.add("--module=auto"); 
     setFilename(0, "foo/bar.js"); 
     test("exports.test = 1", "var module$foo$bar={test:1};"); 
     assertEquals("", outReader.toString()); 
 }
public void testPrintAstFlag401() { 
     args.add("--print_ast=true"); 
     testSame(""); 
     assertEquals("digraph AST {\n" + "  node [color=lightblue2, style=filled];\n" + "  node0 [label=\"BLOCK\"];\n" + "  node1 [label=\"SCRIPT\"];\n" + "  node0 -> node1 [weight=1];\n" + "  node1 -> RETURN [label=\"UNCOND\", " + "fontcolor=\"red\", weight=0.01, color=\"red\"];\n" + "  node0 -> RETURN [label=\"SYN_BLOCK\", " + "fontcolor=\"red\", weight=0.01, color=\"red\"];\n" + "  node0 -> node1 [label=\"UNCOND\", " + "fontcolor=\"red\", weight=0.01, color=\"red\"];\n" + "}\n\n", new String(outReader.toByteArray())); 
 }
public void testSourceMapExpansion1402() { 
     args.add("--js_output_file"); 
     args.add("/path/to/out.js"); 
     args.add("--create_source_map=%outname%.map"); 
     testSame("var x = 3;"); 
     assertEquals("/path/to/out.js.map", lastCommandLineRunner.expandSourceMapPath(lastCompiler.getOptions(), null)); 
 }
public void testNoSrCFilesWithManifest403() throws IOException { 
     args.add("--use_only_custom_externs=true"); 
     args.add("--output_manifest=test.MF"); 
     CommandLineRunner runner = createCommandLineRunner(new String[0]); 
     String expectedMessage = ""; 
     try { 
         runner.doRun(); 
     } catch (FlagUsageException e) { 
         expectedMessage = e.getMessage(); 
     } 
     assertEquals(expectedMessage, "Bad --js flag. " + "Manifest files cannot be generated when the input is from stdin."); 
 }
public void testModuleWrapperBaseNameExpansion406() throws Exception { 
     useModules = ModulePattern.CHAIN; 
     args.add("--module_wrapper=m0:%s // %basename%"); 
     args.add("--module_wrapper=m1:%s // %basename%"); 
     testSame(new String[] { "var x = 3;", "var y = 4;" }); 
     StringBuilder builder = new StringBuilder(); 
     lastCommandLineRunner.writeModuleOutput(builder, lastCompiler.getModuleGraph().getRootModule()); 
     assertEquals("var x=3; // m0.js\n", builder.toString()); 
 }
public void testTypeParsingOnWithVerbose408() { 
     args.add("--warning_level=VERBOSE"); 
     test("/** @return {number */ function f(a) { return a; }", RhinoErrorReporter.TYPE_PARSE_ERROR); 
     test("/** @return {n} */ function f(a) { return a; }", RhinoErrorReporter.TYPE_PARSE_ERROR); 
 }
public void testVersionFlag2409() { 
     lastArg = "--version"; 
     testSame(""); 
     assertEquals(0, new String(errReader.toByteArray()).indexOf("Closure Compiler (http://code.google.com/closure/compiler)\n" + "Version: ")); 
 }
public void testDefineFlag411() { 
     args.add("--define=FOO"); 
     args.add("--define=\"BAR=5\""); 
     args.add("--D"); 
     args.add("CCC"); 
     args.add("-D"); 
     args.add("DDD"); 
     test("/** @define {boolean} */ var FOO = false;" + "/** @define {number} */ var BAR = 3;" + "/** @define {boolean} */ var CCC = false;" + "/** @define {boolean} */ var DDD = false;", "var FOO = !0, BAR = 5, CCC = !0, DDD = !0;"); 
 }
public void testCharSetExpansion412() { 
     testSame(""); 
     assertEquals("US-ASCII", lastCompiler.getOptions().outputCharset); 
     args.add("--charset=UTF-8"); 
     testSame(""); 
     assertEquals("UTF-8", lastCompiler.getOptions().outputCharset); 
 }
public void testNameMapExpansion3413() { 
     useModules = ModulePattern.CHAIN; 
     args.add("--create_source_map=%outname%.map"); 
     args.add("--module_output_path_prefix=foo_"); 
     testSame(new String[] { "var x = 3;", "var y = 5;" }); 
     assertEquals("foo_m0.js.map", lastCommandLineRunner.expandSourceMapPath(lastCompiler.getOptions(), lastCompiler.getModuleGraph().getRootModule())); 
 }
public void testStaticFunction7416() { 
     testSame("var a = function() { return function() { this.x = 8; } }"); 
 }
public void testModuleWrapperBaseNameExpansion417() throws Exception { 
     useModules = ModulePattern.CHAIN; 
     args.add("--module_wrapper=m0:%s // %basename%"); 
     testSame(new String[] { "var x = 3;", "var y = 4;" }); 
     StringBuilder builder = new StringBuilder(); 
     lastCommandLineRunner.writeModuleOutput(builder, lastCompiler.getModuleGraph().getRootModule()); 
     assertEquals("var x=3; // m0.js\n", builder.toString()); 
 }
public void testPrintTree418() { 
     args.add("--print_tree=true"); 
     testSame(""); 
     assertEquals("digraph AST {\n" + "  node [color=lightblue2, style=filled];\n" + "  node0 [label=\"BLOCK\"];\n" + "  node1 [label=\"SCRIPT\"];\n" + "  node0 -> node1 [weight=1];\n" + "  node1 -> RETURN [label=\"UNCOND\", " + "fontcolor=\"red\", weight=0.01, color=\"red\"];\n" + "  node0 -> RETURN [label=\"SYN_BLOCK\", " + "fontcolor=\"red\", weight=0.01, color=\"red\"];\n" + "  node0 -> node1 [label=\"UNCOND\", " + "fontcolor=\"red\", weight=0.01, color=\"red\"];\n" + "}\n\n", new String(outReader.toByteArray())); 
 }
public void testModuleJSON420() { 
     useStringComparison = true; 
     args.add("--transform_amd_modules"); 
     args.add("--process_common_js_modules"); 
     args.add("--common_js_entry_module=foo/bar"); 
     args.add("--output_module_dependencies=test.json"); 
     setFilename(0, "foo/bar.js"); 
     test("define({foo: 1})", "var module$foo$bar={},module$foo$bar={foo:1};"); 
 }
public void testDefineFlag3421() { 
     args.add("--define=FOO=\"x'\""); 
     args.add("--define=\"BAR=5\""); 
     args.add("--D"); 
     args.add("CCC"); 
     args.add("-D"); 
     args.add("DDD"); 
     test("/** @define {boolean} */ var FOO = false;" + "/** @define {number} */ var BAR = 3;" + "/** @define {boolean} */ var CCC = false;" + "/** @define {boolean} */ var DDD = false;", "var FOO = !0, BAR = 5, CCC = !0, DDD = !0;"); 
 }
public void testPrintPassGraph423() { 
     args.add("--print_pass_graph=true"); 
     testSame(""); 
     assertEquals("digraph AST {\n" + "  node [color=lightblue2, style=filled];\n" + "  node0 [label=\"BLOCK\"];\n" + "  node1 [label=\"SCRIPT\"];\n" + "  node0 -> node1 [weight=1];\n" + "  node1 -> RETURN [label=\"UNCOND\", " + "fontcolor=\"red\", weight=0.01, color=\"red\"];\n" + "  node0 -> RETURN [label=\"SYN_BLOCK\", " + "fontcolor=\"red\", weight=0.01, color=\"red\"];\n" + "  node0 -> node1 [label=\"UNCOND\", " + "fontcolor=\"red\", weight=0.01, color=\"red\"];\n" + "}\n\n", new String(outReader.toByteArray())); 
 }
public void testVariableMapExpansion3424() { 
     useModules = ModulePattern.CHAIN; 
     args.add("--create_source_map=%outname%.map"); 
     args.add("--module_output_path_prefix=foo_"); 
     testSame(new String[] { "var x = 3;", "var y = 5;" }); 
     assertEquals("foo_m0.js.map", lastCommandLineRunner.expandSourceMapPath(lastCompiler.getOptions(), lastCompiler.getModuleGraph().getRootModule())); 
 }
public void testFormattingSingleQuote426() { 
     args.add("--formatting=SINGLE_QUOTES"); 
     testSame("var x = '';"); 
     assertEquals("var x=\"\";", lastCompiler.toSource()); 
     args.add("--formatting=SIMPLE_QUOTES"); 
     testSame("var x = '';"); 
     assertEquals("var x='';", lastCompiler.toSource()); 
 }
public void testSourceMapExpansion3427() { 
     args.add("--js_output_file"); 
     args.add("/path/to/out.js"); 
     args.add("--create_source_map=%outname%.map"); 
     testSame("var x = 3;"); 
     assertEquals("/path/to/out.js.map", lastCommandLineRunner.expandSourceMapPath(lastCompiler.getOptions(), null)); 
 }
  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  


  //////////////////////////////////////////////////////////////////////////////
  // Integration tests

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  

  /* Helper functions */

  private void testSame(String original) {
    testSame(new String[] { original });
  }

  private void testSame(String[] original) {
    test(original, original);
  }

  private void test(String original, String compiled) {
    test(new String[] { original }, new String[] { compiled });
  }

  /**
   * Asserts that when compiling with the given compiler options,
   * {@code original} is transformed into {@code compiled}.
   */
  private void test(String[] original, String[] compiled) {
    test(original, compiled, null);
  }

  /**
   * Asserts that when compiling with the given compiler options,
   * {@code original} is transformed into {@code compiled}.
   * If {@code warning} is non-null, we will also check if the given
   * warning type was emitted.
   */
  private void test(String[] original, String[] compiled,
                    DiagnosticType warning) {
    Compiler compiler = compile(original);

    if (warning == null) {
      assertEquals("Expected no warnings or errors\n" +
          "Errors: \n" + Joiner.on("\n").join(compiler.getErrors()) +
          "Warnings: \n" + Joiner.on("\n").join(compiler.getWarnings()),
          0, compiler.getErrors().length + compiler.getWarnings().length);
    } else {
      assertEquals(1, compiler.getWarnings().length);
      assertEquals(warning, compiler.getWarnings()[0].getType());
    }

    Node root = compiler.getRoot().getLastChild();
    if (useStringComparison) {
      assertEquals(Joiner.on("").join(compiled), compiler.toSource());
    } else {
      Node expectedRoot = parse(compiled);
      String explanation = expectedRoot.checkTreeEquals(root);
      assertNull("\nExpected: " + compiler.toSource(expectedRoot) +
          "\nResult: " + compiler.toSource(root) +
          "\n" + explanation, explanation);
    }
  }

  /**
   * Asserts that when compiling, there is an error or warning.
   */
  private void test(String original, DiagnosticType warning) {
    test(new String[] { original }, warning);
  }

  private void test(String original, String expected, DiagnosticType warning) {
    test(new String[] { original }, new String[] { expected }, warning);
  }

  /**
   * Asserts that when compiling, there is an error or warning.
   */
  private void test(String[] original, DiagnosticType warning) {
    Compiler compiler = compile(original);
    assertEquals("Expected exactly one warning or error " +
        "Errors: \n" + Joiner.on("\n").join(compiler.getErrors()) +
        "Warnings: \n" + Joiner.on("\n").join(compiler.getWarnings()),
        1, compiler.getErrors().length + compiler.getWarnings().length);

    assertTrue(exitCodes.size() > 0);
    int lastExitCode = exitCodes.get(exitCodes.size() - 1);

    if (compiler.getErrors().length > 0) {
      assertEquals(1, compiler.getErrors().length);
      assertEquals(warning, compiler.getErrors()[0].getType());
      assertEquals(1, lastExitCode);
    } else {
      assertEquals(1, compiler.getWarnings().length);
      assertEquals(warning, compiler.getWarnings()[0].getType());
      assertEquals(0, lastExitCode);
    }
  }

  private CommandLineRunner createCommandLineRunner(String[] original) {
    for (int i = 0; i < original.length; i++) {
      args.add("--js");
      args.add("/path/to/input" + i + ".js");
      if (useModules == ModulePattern.CHAIN) {
        args.add("--module");
        args.add("m" + i + ":1" + (i > 0 ? (":m" + (i - 1)) : ""));
      } else if (useModules == ModulePattern.STAR) {
        args.add("--module");
        args.add("m" + i + ":1" + (i > 0 ? ":m0" : ""));
      }
    }

    if (lastArg != null) {
      args.add(lastArg);
    }

    String[] argStrings = args.toArray(new String[] {});
    return new CommandLineRunner(
        argStrings,
        new PrintStream(outReader),
        new PrintStream(errReader));
  }

  private Compiler compile(String[] original) {
    CommandLineRunner runner = createCommandLineRunner(original);
    assertTrue(new String(errReader.toByteArray()), runner.shouldRunCompiler());
    Supplier<List<SourceFile>> inputsSupplier = null;
    Supplier<List<JSModule>> modulesSupplier = null;

    if (useModules == ModulePattern.NONE) {
      List<SourceFile> inputs = Lists.newArrayList();
      for (int i = 0; i < original.length; i++) {
        inputs.add(SourceFile.fromCode(getFilename(i), original[i]));
      }
      inputsSupplier = Suppliers.ofInstance(inputs);
    } else if (useModules == ModulePattern.STAR) {
      modulesSupplier = Suppliers.<List<JSModule>>ofInstance(
          Lists.<JSModule>newArrayList(
              CompilerTestCase.createModuleStar(original)));
    } else if (useModules == ModulePattern.CHAIN) {
      modulesSupplier = Suppliers.<List<JSModule>>ofInstance(
          Lists.<JSModule>newArrayList(
              CompilerTestCase.createModuleChain(original)));
    } else {
      throw new IllegalArgumentException("Unknown module type: " + useModules);
    }

    runner.enableTestMode(
        Suppliers.<List<SourceFile>>ofInstance(externs),
        inputsSupplier,
        modulesSupplier,
        new Function<Integer, Boolean>() {
          @Override
          public Boolean apply(Integer code) {
            return exitCodes.add(code);
          }
        });
    runner.run();
    lastCompiler = runner.getCompiler();
    lastCommandLineRunner = runner;
    return lastCompiler;
  }

  private Node parse(String[] original) {
    String[] argStrings = args.toArray(new String[] {});
    CommandLineRunner runner = new CommandLineRunner(argStrings);
    Compiler compiler = runner.createCompiler();
    List<SourceFile> inputs = Lists.newArrayList();
    for (int i = 0; i < original.length; i++) {
      inputs.add(SourceFile.fromCode(getFilename(i), original[i]));
    }
    CompilerOptions options = new CompilerOptions();
    // ECMASCRIPT5 is the most forgiving.
    options.setLanguageIn(LanguageMode.ECMASCRIPT5);
    compiler.init(externs, inputs, options);
    Node all = compiler.parseInputs();
    Preconditions.checkState(compiler.getErrorCount() == 0);
    Preconditions.checkNotNull(all);
    Node n = all.getLastChild();
    return n;
  }

  private void setFilename(int i, String filename) {
    this.filenames.put(i, filename);
  }

  private String getFilename(int i) {
    if (filenames.isEmpty()) {
      return "input" + i;
    }
    return filenames.get(i);
  }
}
