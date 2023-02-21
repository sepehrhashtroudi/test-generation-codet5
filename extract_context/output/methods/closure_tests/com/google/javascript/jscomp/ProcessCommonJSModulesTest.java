public ProcessCommonJSModulesTest() { [EOL] } <line_num>: 29,30
@Override [EOL] protected CompilerPass getProcessor(Compiler compiler) { [EOL]     return new ProcessCommonJSModules(compiler, "foo/bar/", false); [EOL] } <line_num>: 32,35
@Override [EOL] protected int getNumRepetitions() { [EOL]     return 1; [EOL] } <line_num>: 37,40
public void testWithoutExports() { [EOL]     setFilename("test"); [EOL]     test("var name = require('name');" + "name()", "goog.provide('module$test');" + "var module$test = {};" + "goog.require('module$name');" + "var name$$module$test = module$name;" + "name$$module$test();"); [EOL]     setFilename("test/sub"); [EOL]     test("var name = require('mod/name');" + "(function() { name(); })();", "goog.provide('module$test$sub');" + "var module$test$sub = {};" + "goog.require('module$mod$name');" + "var name$$module$test$sub = module$mod$name;" + "(function() { name$$module$test$sub(); })();"); [EOL] } <line_num>: 42,61
public void testExports() { [EOL]     setFilename("test"); [EOL]     test("var name = require('name');" + "exports.foo = 1;", "goog.provide('module$test');" + "var module$test = {};" + "goog.require('module$name');" + "var name$$module$test = module$name;" + "module$test.foo = 1;"); [EOL]     test("var name = require('name');" + "module.exports = function() {};", "goog.provide('module$test');" + "var module$test = {};" + "goog.require('module$name');" + "var name$$module$test = module$name;" + "module$test.module$exports = function() {};" + "if(module$test.module$exports)" + "module$test=module$test.module$exports"); [EOL] } <line_num>: 63,83
public void testVarRenaming() { [EOL]     setFilename("test"); [EOL]     test("var a = 1, b = 2;" + "(function() { var a; b = 4})()", "goog.provide('module$test');" + "var module$test = {};" + "var a$$module$test = 1, b$$module$test = 2;" + "(function() { var a; b$$module$test = 4})();"); [EOL] } <line_num>: 85,94
public void testDash() { [EOL]     setFilename("test-test"); [EOL]     test("var name = require('name'); exports.foo = 1;", "goog.provide('module$test_test');" + "var module$test_test = {};" + "goog.require('module$name');" + "var name$$module$test_test = module$name;" + "module$test_test.foo = 1;"); [EOL] } <line_num>: 96,105
public void testModuleName() { [EOL]     assertEquals("module$foo$baz", ProcessCommonJSModules.toModuleName("./baz.js", "foo/bar.js")); [EOL]     assertEquals("module$foo$baz_bar", ProcessCommonJSModules.toModuleName("./baz-bar.js", "foo/bar.js")); [EOL]     assertEquals("module$baz", ProcessCommonJSModules.toModuleName("../baz.js", "foo/bar.js")); [EOL]     assertEquals("module$baz", ProcessCommonJSModules.toModuleName("../../baz.js", "foo/bar/abc.js")); [EOL]     assertEquals("module$baz", ProcessCommonJSModules.toModuleName("../../../baz.js", "foo/bar/abc/xyz.js")); [EOL]     setFilename("foo/bar"); [EOL]     test("var name = require('name');", "goog.provide('module$foo$bar'); var module$foo$bar = {};" + "goog.require('module$name');" + "var name$$module$foo$bar = module$name;"); [EOL]     test("var name = require('./name');", "goog.provide('module$foo$bar');" + "var module$foo$bar = {};" + "goog.require('module$foo$name');" + "var name$$module$foo$bar = module$foo$name;"); [EOL] } <line_num>: 107,131
public void testGuessModuleName() { [EOL]     ProcessCommonJSModules pass = new ProcessCommonJSModules(null, "foo"); [EOL]     assertEquals("module$baz", pass.guessCJSModuleName("foo/baz.js")); [EOL]     assertEquals("module$baz", pass.guessCJSModuleName("foo\\baz.js")); [EOL]     assertEquals("module$bar$baz", pass.guessCJSModuleName("foo\\bar\\baz.js")); [EOL] } <line_num>: 133,141
public void testSortInputs() throws Exception { [EOL]     SourceFile a = SourceFile.fromCode("a.js", "require('b');require('c')"); [EOL]     SourceFile b = SourceFile.fromCode("b.js", "require('d')"); [EOL]     SourceFile c = SourceFile.fromCode("c.js", "require('d')"); [EOL]     SourceFile d = SourceFile.fromCode("d.js", "1;"); [EOL]     assertSortedInputs(ImmutableList.of(d, b, c, a), ImmutableList.of(a, b, c, d)); [EOL]     assertSortedInputs(ImmutableList.of(d, b, c, a), ImmutableList.of(d, b, c, a)); [EOL]     assertSortedInputs(ImmutableList.of(d, c, b, a), ImmutableList.of(d, c, b, a)); [EOL]     assertSortedInputs(ImmutableList.of(d, b, c, a), ImmutableList.of(d, a, b, c)); [EOL] } <line_num>: 143,164
private void assertSortedInputs(List<SourceFile> expected, List<SourceFile> shuffled) throws Exception { [EOL]     Compiler compiler = new Compiler(System.err); [EOL]     compiler.initCompilerOptionsIfTesting(); [EOL]     compiler.getOptions().setProcessCommonJSModules(true); [EOL]     compiler.getOptions().dependencyOptions.setEntryPoints(Lists.newArrayList(ProcessCommonJSModules.toModuleName("a"))); [EOL]     compiler.compile(Lists.newArrayList(SourceFile.fromCode("externs.js", "")), shuffled, compiler.getOptions()); [EOL]     List<SourceFile> result = Lists.newArrayList(); [EOL]     for (JSModule m : compiler.getModuleGraph().getAllModules()) { [EOL]         for (CompilerInput i : m.getInputs()) { [EOL]             result.add(i.getSourceFile()); [EOL]         } [EOL]     } [EOL]     assertEquals(expected, result); [EOL] } <line_num>: 166,185