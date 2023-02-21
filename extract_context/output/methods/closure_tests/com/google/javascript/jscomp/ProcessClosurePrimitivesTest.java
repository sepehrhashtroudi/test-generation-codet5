public ProcessClosurePrimitivesTest() { [EOL]     enableLineNumberCheck(true); [EOL] } <line_num>: 45,47
@Override [EOL] protected void setUp() { [EOL]     additionalCode = null; [EOL]     additionalEndCode = null; [EOL]     addAdditionalNamespace = false; [EOL] } <line_num>: 49,53
@Override [EOL] public void process(Node externs, Node root) { [EOL]     new ProcessClosurePrimitives(compiler, null, CheckLevel.OFF).process(externs, root); [EOL]     if (additionalCode != null) { [EOL]         SourceFile file = SourceFile.fromCode("additionalcode", additionalCode); [EOL]         Node scriptNode = root.getFirstChild(); [EOL]         Node newScriptNode = new CompilerInput(file).getAstRoot(compiler); [EOL]         if (addAdditionalNamespace) { [EOL]             newScriptNode.getFirstChild().putBooleanProp(Node.IS_NAMESPACE, true); [EOL]         } [EOL]         while (newScriptNode.getLastChild() != null) { [EOL]             Node lastChild = newScriptNode.getLastChild(); [EOL]             newScriptNode.removeChild(lastChild); [EOL]             scriptNode.addChildBefore(lastChild, scriptNode.getFirstChild()); [EOL]         } [EOL]     } [EOL]     if (additionalEndCode != null) { [EOL]         SourceFile file = SourceFile.fromCode("additionalendcode", additionalEndCode); [EOL]         Node scriptNode = root.getFirstChild(); [EOL]         Node newScriptNode = new CompilerInput(file).getAstRoot(compiler); [EOL]         if (addAdditionalNamespace) { [EOL]             newScriptNode.getFirstChild().putBooleanProp(Node.IS_NAMESPACE, true); [EOL]         } [EOL]         while (newScriptNode.getFirstChild() != null) { [EOL]             Node firstChild = newScriptNode.getFirstChild(); [EOL]             newScriptNode.removeChild(firstChild); [EOL]             scriptNode.addChildToBack(firstChild); [EOL]         } [EOL]     } [EOL]     new ProcessClosurePrimitives(compiler, null, CheckLevel.ERROR).process(externs, root); [EOL] } <line_num>: 61,104
@Override [EOL] public CompilerPass getProcessor(final Compiler compiler) { [EOL]     if ((additionalCode == null) && (additionalEndCode == null)) { [EOL]         return new ProcessClosurePrimitives(compiler, null, CheckLevel.ERROR); [EOL]     } else { [EOL]         return new CompilerPass() { [EOL]  [EOL]             @Override [EOL]             public void process(Node externs, Node root) { [EOL]                 new ProcessClosurePrimitives(compiler, null, CheckLevel.OFF).process(externs, root); [EOL]                 if (additionalCode != null) { [EOL]                     SourceFile file = SourceFile.fromCode("additionalcode", additionalCode); [EOL]                     Node scriptNode = root.getFirstChild(); [EOL]                     Node newScriptNode = new CompilerInput(file).getAstRoot(compiler); [EOL]                     if (addAdditionalNamespace) { [EOL]                         newScriptNode.getFirstChild().putBooleanProp(Node.IS_NAMESPACE, true); [EOL]                     } [EOL]                     while (newScriptNode.getLastChild() != null) { [EOL]                         Node lastChild = newScriptNode.getLastChild(); [EOL]                         newScriptNode.removeChild(lastChild); [EOL]                         scriptNode.addChildBefore(lastChild, scriptNode.getFirstChild()); [EOL]                     } [EOL]                 } [EOL]                 if (additionalEndCode != null) { [EOL]                     SourceFile file = SourceFile.fromCode("additionalendcode", additionalEndCode); [EOL]                     Node scriptNode = root.getFirstChild(); [EOL]                     Node newScriptNode = new CompilerInput(file).getAstRoot(compiler); [EOL]                     if (addAdditionalNamespace) { [EOL]                         newScriptNode.getFirstChild().putBooleanProp(Node.IS_NAMESPACE, true); [EOL]                     } [EOL]                     while (newScriptNode.getFirstChild() != null) { [EOL]                         Node firstChild = newScriptNode.getFirstChild(); [EOL]                         newScriptNode.removeChild(firstChild); [EOL]                         scriptNode.addChildToBack(firstChild); [EOL]                     } [EOL]                 } [EOL]                 new ProcessClosurePrimitives(compiler, null, CheckLevel.ERROR).process(externs, root); [EOL]             } [EOL]         }; [EOL]     } [EOL] } <line_num>: 55,107
@Override [EOL] public int getNumRepetitions() { [EOL]     return 1; [EOL] } <line_num>: 109,111
public void testSimpleProvides() { [EOL]     test("goog.provide('foo');", "var foo={};"); [EOL]     test("goog.provide('foo.bar');", "var foo={}; foo.bar={};"); [EOL]     test("goog.provide('foo.bar.baz');", "var foo={}; foo.bar={}; foo.bar.baz={};"); [EOL]     test("goog.provide('foo.bar.baz.boo');", "var foo={}; foo.bar={}; foo.bar.baz={}; foo.bar.baz.boo={};"); [EOL]     test("goog.provide('goog.bar');", "goog.bar={};"); [EOL] } <line_num>: 113,124
public void testMultipleProvides() { [EOL]     test("goog.provide('foo.bar'); goog.provide('foo.baz');", "var foo={}; foo.bar={}; foo.baz={};"); [EOL]     test("goog.provide('foo.bar.baz'); goog.provide('foo.boo.foo');", "var foo={}; foo.bar={}; foo.bar.baz={}; foo.boo={}; foo.boo.foo={};"); [EOL]     test("goog.provide('foo.bar.baz'); goog.provide('foo.bar.boo');", "var foo={}; foo.bar={}; foo.bar.baz={}; foo.bar.boo={};"); [EOL]     test("goog.provide('foo.bar.baz'); goog.provide('goog.bar.boo');", "var foo={}; foo.bar={}; foo.bar.baz={}; goog.bar={}; " + "goog.bar.boo={};"); [EOL] } <line_num>: 126,136
public void testRemovalOfProvidedObjLit() { [EOL]     test("goog.provide('foo'); foo = 0;", "var foo = 0;"); [EOL]     test("goog.provide('foo'); foo = {a: 0};", "var foo = {a: 0};"); [EOL]     test("goog.provide('foo'); foo = function(){};", "var foo = function(){};"); [EOL]     test("goog.provide('foo'); var foo = 0;", "var foo = 0;"); [EOL]     test("goog.provide('foo'); var foo = {a: 0};", "var foo = {a: 0};"); [EOL]     test("goog.provide('foo'); var foo = function(){};", "var foo = function(){};"); [EOL]     test("goog.provide('foo.bar.Baz'); foo.bar.Baz=function(){};", "var foo={}; foo.bar={}; foo.bar.Baz=function(){};"); [EOL]     test("goog.provide('foo.bar.moo'); foo.bar.moo={E:1,S:2};", "var foo={}; foo.bar={}; foo.bar.moo={E:1,S:2};"); [EOL]     test("goog.provide('foo.bar.moo'); foo.bar.moo={E:1}; foo.bar.moo={E:2};", "var foo={}; foo.bar={}; foo.bar.moo={E:1}; foo.bar.moo={E:2};"); [EOL] } <line_num>: 138,157
public void testProvidedDeclaredFunctionError() { [EOL]     test("goog.provide('foo'); function foo(){}", null, FUNCTION_NAMESPACE_ERROR); [EOL] } <line_num>: 159,162
public void testRemovalMultipleAssignment1() { [EOL]     test("goog.provide('foo'); foo = 0; foo = 1", "var foo = 0; foo = 1;"); [EOL] } <line_num>: 164,167
public void testRemovalMultipleAssignment2() { [EOL]     test("goog.provide('foo'); var foo = 0; foo = 1", "var foo = 0; foo = 1;"); [EOL] } <line_num>: 169,172
public void testRemovalMultipleAssignment3() { [EOL]     test("goog.provide('foo'); foo = 0; var foo = 1", "foo = 0; var foo = 1;"); [EOL] } <line_num>: 174,177
public void testRemovalMultipleAssignment4() { [EOL]     test("goog.provide('foo.bar'); foo.bar = 0; foo.bar = 1", "var foo = {}; foo.bar = 0; foo.bar = 1"); [EOL] } <line_num>: 179,182
public void testNoRemovalFunction1() { [EOL]     test("goog.provide('foo'); function f(){foo = 0}", "var foo = {}; function f(){foo = 0}"); [EOL] } <line_num>: 184,187
public void testNoRemovalFunction2() { [EOL]     test("goog.provide('foo'); function f(){var foo = 0}", "var foo = {}; function f(){var foo = 0}"); [EOL] } <line_num>: 189,192
public void testRemovalMultipleAssignmentInIf1() { [EOL]     test("goog.provide('foo'); if (true) { var foo = 0 } else { foo = 1 }", "if (true) { var foo = 0 } else { foo = 1 }"); [EOL] } <line_num>: 194,197
public void testRemovalMultipleAssignmentInIf2() { [EOL]     test("goog.provide('foo'); if (true) { foo = 0 } else { var foo = 1 }", "if (true) { foo = 0 } else { var foo = 1 }"); [EOL] } <line_num>: 199,202
public void testRemovalMultipleAssignmentInIf3() { [EOL]     test("goog.provide('foo'); if (true) { foo = 0 } else { foo = 1 }", "if (true) { var foo = 0 } else { foo = 1 }"); [EOL] } <line_num>: 204,207
public void testRemovalMultipleAssignmentInIf4() { [EOL]     test("goog.provide('foo.bar');" + "if (true) { foo.bar = 0 } else { foo.bar = 1 }", "var foo = {}; if (true) { foo.bar = 0 } else { foo.bar = 1 }"); [EOL] } <line_num>: 209,213
public void testMultipleDeclarationError1() { [EOL]     String rest = "if (true) { foo.bar = 0 } else { foo.bar = 1 }"; [EOL]     test("goog.provide('foo.bar');" + "var foo = {};" + rest, "var foo = {};" + "var foo = {};" + rest); [EOL] } <line_num>: 215,219
public void testMultipleDeclarationError2() { [EOL]     test("goog.provide('foo.bar');" + "if (true) { var foo = {}; foo.bar = 0 } else { foo.bar = 1 }", "var foo = {};" + "if (true) {" + "  var foo = {}; foo.bar = 0" + "} else {" + "  foo.bar = 1" + "}"); [EOL] } <line_num>: 221,230
public void testMultipleDeclarationError3() { [EOL]     test("goog.provide('foo.bar');" + "if (true) { foo.bar = 0 } else { var foo = {}; foo.bar = 1 }", "var foo = {};" + "if (true) {" + "  foo.bar = 0" + "} else {" + "  var foo = {}; foo.bar = 1" + "}"); [EOL] } <line_num>: 232,241
public void testProvideAfterDeclarationError() { [EOL]     test("var x = 42; goog.provide('x');", "var x = 42; var x = {}"); [EOL] } <line_num>: 243,246
public void testProvideErrorCases() { [EOL]     test("goog.provide();", "", NULL_ARGUMENT_ERROR); [EOL]     test("goog.provide(5);", "", INVALID_ARGUMENT_ERROR); [EOL]     test("goog.provide([]);", "", INVALID_ARGUMENT_ERROR); [EOL]     test("goog.provide({});", "", INVALID_ARGUMENT_ERROR); [EOL]     test("goog.provide('foo', 'bar');", "", TOO_MANY_ARGUMENTS_ERROR); [EOL]     test("goog.provide('foo'); goog.provide('foo');", "", DUPLICATE_NAMESPACE_ERROR); [EOL]     test("goog.provide('foo.bar'); goog.provide('foo'); goog.provide('foo');", "", DUPLICATE_NAMESPACE_ERROR); [EOL] } <line_num>: 248,258
public void testRemovalOfRequires() { [EOL]     test("goog.provide('foo'); goog.require('foo');", "var foo={};"); [EOL]     test("goog.provide('foo.bar'); goog.require('foo.bar');", "var foo={}; foo.bar={};"); [EOL]     test("goog.provide('foo.bar.baz'); goog.require('foo.bar.baz');", "var foo={}; foo.bar={}; foo.bar.baz={};"); [EOL]     test("goog.provide('foo'); var x = 3; goog.require('foo'); something();", "var foo={}; var x = 3; something();"); [EOL]     testSame("foo.require('foo.bar');"); [EOL] } <line_num>: 260,270
public void testRequireErrorCases() { [EOL]     test("goog.require();", "", NULL_ARGUMENT_ERROR); [EOL]     test("goog.require(5);", "", INVALID_ARGUMENT_ERROR); [EOL]     test("goog.require([]);", "", INVALID_ARGUMENT_ERROR); [EOL]     test("goog.require({});", "", INVALID_ARGUMENT_ERROR); [EOL] } <line_num>: 272,277
public void testLateProvides() { [EOL]     test("goog.require('foo'); goog.provide('foo');", "var foo={};", LATE_PROVIDE_ERROR); [EOL]     test("goog.require('foo.bar'); goog.provide('foo.bar');", "var foo={}; foo.bar={};", LATE_PROVIDE_ERROR); [EOL]     test("goog.provide('foo.bar'); goog.require('foo'); goog.provide('foo');", "var foo={}; foo.bar={};", LATE_PROVIDE_ERROR); [EOL] } <line_num>: 279,286
public void testMissingProvides() { [EOL]     test("goog.require('foo');", "", MISSING_PROVIDE_ERROR); [EOL]     test("goog.provide('foo'); goog.require('Foo');", "var foo={};", MISSING_PROVIDE_ERROR); [EOL]     test("goog.provide('foo'); goog.require('foo.bar');", "var foo={};", MISSING_PROVIDE_ERROR); [EOL]     test("goog.provide('foo'); var EXPERIMENT_FOO = true; " + "if (EXPERIMENT_FOO) {goog.require('foo.bar');}", "var foo={}; var EXPERIMENT_FOO = true; if (EXPERIMENT_FOO) {}", MISSING_PROVIDE_ERROR); [EOL] } <line_num>: 288,299
public void testAddDependency() { [EOL]     test("goog.addDependency('x.js', ['A', 'B'], []);", "0"); [EOL]     Compiler compiler = getLastCompiler(); [EOL]     assertTrue(compiler.getTypeRegistry().isForwardDeclaredType("A")); [EOL]     assertTrue(compiler.getTypeRegistry().isForwardDeclaredType("B")); [EOL]     assertFalse(compiler.getTypeRegistry().isForwardDeclaredType("C")); [EOL] } <line_num>: 301,308
public void testValidSetCssNameMapping() { [EOL]     test("goog.setCssNameMapping({foo:'bar',\"biz\":'baz'});", ""); [EOL]     CssRenamingMap map = getLastCompiler().getCssRenamingMap(); [EOL]     assertNotNull(map); [EOL]     assertEquals("bar", map.get("foo")); [EOL]     assertEquals("baz", map.get("biz")); [EOL] } <line_num>: 310,316
public void testValidSetCssNameMappingWithType() { [EOL]     test("goog.setCssNameMapping({foo:'bar',\"biz\":'baz'}, 'BY_PART');", ""); [EOL]     CssRenamingMap map = getLastCompiler().getCssRenamingMap(); [EOL]     assertNotNull(map); [EOL]     assertEquals("bar", map.get("foo")); [EOL]     assertEquals("baz", map.get("biz")); [EOL]     test("goog.setCssNameMapping({foo:'bar',biz:'baz','biz-foo':'baz-bar'}," + " 'BY_WHOLE');", ""); [EOL]     map = getLastCompiler().getCssRenamingMap(); [EOL]     assertNotNull(map); [EOL]     assertEquals("bar", map.get("foo")); [EOL]     assertEquals("baz", map.get("biz")); [EOL]     assertEquals("baz-bar", map.get("biz-foo")); [EOL] } <line_num>: 318,332
public void testSetCssNameMappingNonStringValueReturnsError() { [EOL]     test("var BAR = {foo:'bar'}; goog.setCssNameMapping(BAR);", "", EXPECTED_OBJECTLIT_ERROR); [EOL]     test("goog.setCssNameMapping([]);", "", EXPECTED_OBJECTLIT_ERROR); [EOL]     test("goog.setCssNameMapping(false);", "", EXPECTED_OBJECTLIT_ERROR); [EOL]     test("goog.setCssNameMapping(null);", "", EXPECTED_OBJECTLIT_ERROR); [EOL]     test("goog.setCssNameMapping(undefined);", "", EXPECTED_OBJECTLIT_ERROR); [EOL]     test("var BAR = 'bar'; goog.setCssNameMapping({foo:BAR});", "", NON_STRING_PASSED_TO_SET_CSS_NAME_MAPPING_ERROR); [EOL]     test("goog.setCssNameMapping({foo:6});", "", NON_STRING_PASSED_TO_SET_CSS_NAME_MAPPING_ERROR); [EOL]     test("goog.setCssNameMapping({foo:false});", "", NON_STRING_PASSED_TO_SET_CSS_NAME_MAPPING_ERROR); [EOL]     test("goog.setCssNameMapping({foo:null});", "", NON_STRING_PASSED_TO_SET_CSS_NAME_MAPPING_ERROR); [EOL]     test("goog.setCssNameMapping({foo:undefined});", "", NON_STRING_PASSED_TO_SET_CSS_NAME_MAPPING_ERROR); [EOL] } <line_num>: 334,358
public void testSetCssNameMappingValidity() { [EOL]     test("goog.setCssNameMapping({'a': 'b', 'a-a': 'c'})", "", null, INVALID_CSS_RENAMING_MAP); [EOL]     test("goog.setCssNameMapping({'a': 'b', 'a-a': 'c'}, 'BY_WHOLE')", "", null, INVALID_CSS_RENAMING_MAP); [EOL]     test("goog.setCssNameMapping({foo:'bar'}, 'UNKNOWN');", "", INVALID_STYLE_ERROR); [EOL] } <line_num>: 360,372
public void testBadCrossModuleRequire() { [EOL]     test(createModuleStar("", "goog.provide('goog.ui');", "goog.require('goog.ui');"), new String[] { "", "goog.ui = {};", "" }, null, XMODULE_REQUIRE_ERROR); [EOL] } <line_num>: 374,387
public void testGoodCrossModuleRequire1() { [EOL]     test(createModuleStar("goog.provide('goog.ui');", "", "goog.require('goog.ui');"), new String[] { "goog.ui = {};", "", "" }); [EOL] } <line_num>: 389,400
public void testGoodCrossModuleRequire2() { [EOL]     test(createModuleStar("", "", "goog.provide('goog.ui'); goog.require('goog.ui');"), new String[] { "", "", "goog.ui = {};" }); [EOL] } <line_num>: 402,413
public void testSimpleAdditionalProvide() { [EOL]     additionalCode = "goog.provide('b.B'); b.B = {};"; [EOL]     test("goog.provide('a.A'); a.A = {};", "var b={};b.B={};var a={};a.A={};"); [EOL] } <line_num>: 416,420
public void testSimpleAdditionalProvideAtEnd() { [EOL]     additionalEndCode = "goog.provide('b.B'); b.B = {};"; [EOL]     test("goog.provide('a.A'); a.A = {};", "var a={};a.A={};var b={};b.B={};"); [EOL] } <line_num>: 423,427
public void testSimpleDottedAdditionalProvide() { [EOL]     additionalCode = "goog.provide('a.b.B'); a.b.B = {};"; [EOL]     test("goog.provide('c.d.D'); c.d.D = {};", "var a={};a.b={};a.b.B={};var c={};c.d={};c.d.D={};"); [EOL] } <line_num>: 430,434
public void testOverlappingAdditionalProvide() { [EOL]     additionalCode = "goog.provide('a.B'); a.B = {};"; [EOL]     test("goog.provide('a.A'); a.A = {};", "var a={};a.B={};a.A={};"); [EOL] } <line_num>: 437,441
public void testOverlappingAdditionalProvideAtEnd() { [EOL]     additionalEndCode = "goog.provide('a.B'); a.B = {};"; [EOL]     test("goog.provide('a.A'); a.A = {};", "var a={};a.A={};a.B={};"); [EOL] } <line_num>: 444,448
public void testOverlappingDottedAdditionalProvide() { [EOL]     additionalCode = "goog.provide('a.b.B'); a.b.B = {};"; [EOL]     test("goog.provide('a.b.C'); a.b.C = {};", "var a={};a.b={};a.b.B={};a.b.C={};"); [EOL] } <line_num>: 451,455
public void testRequireOfAdditionalProvide() { [EOL]     additionalCode = "goog.provide('b.B'); b.B = {};"; [EOL]     test("goog.require('b.B'); goog.provide('a.A'); a.A = {};", "var b={};b.B={};var a={};a.A={};"); [EOL] } <line_num>: 458,462
public void testMissingRequireWithAdditionalProvide() { [EOL]     additionalCode = "goog.provide('b.B'); b.B = {};"; [EOL]     test("goog.require('b.C'); goog.provide('a.A'); a.A = {};", "var b={};b.B={};var a={};a.A={};", MISSING_PROVIDE_ERROR); [EOL] } <line_num>: 465,470
public void testLateRequire() { [EOL]     additionalEndCode = "goog.require('a.A');"; [EOL]     test("goog.provide('a.A'); a.A = {};", "var a={};a.A={};"); [EOL] } <line_num>: 473,477
public void testReorderedProvides() { [EOL]     additionalCode = "a.B = {};"; [EOL]     addAdditionalNamespace = true; [EOL]     test("goog.provide('a.A'); a.A = {};", "var a={};a.B={};a.A={};"); [EOL] } <line_num>: 481,486
public void testReorderedProvides2() { [EOL]     additionalEndCode = "a.B = {};"; [EOL]     addAdditionalNamespace = true; [EOL]     test("goog.provide('a.A'); a.A = {};", "var a={};a.A={};a.B={};"); [EOL] } <line_num>: 489,494
public void testProvideOrder1() { [EOL]     additionalEndCode = ""; [EOL]     addAdditionalNamespace = false; [EOL]     test("goog.provide('a.b');" + "goog.provide('a.b.c');" + "a.b.c;" + "a.b = function(x,y) {};", "var a = {};" + "a.b = {};" + "a.b.c = {};" + "a.b.c;" + "a.b = function(x,y) {};"); [EOL] } <line_num>: 498,513
public void testProvideOrder2() { [EOL]     additionalEndCode = ""; [EOL]     addAdditionalNamespace = false; [EOL]     test("goog.provide('a.b');" + "goog.provide('a.b.c');" + "a.b = function(x,y) {};" + "a.b.c;", "var a = {};" + "a.b = {};" + "a.b.c = {};" + "a.b = function(x,y) {};" + "a.b.c;"); [EOL] } <line_num>: 517,532
public void testProvideOrder3a() { [EOL]     test("goog.provide('a.b');" + "a.b = function(x,y) {};" + "goog.provide('a.b.c');" + "a.b.c;", "var a = {};" + "a.b = function(x,y) {};" + "a.b.c = {};" + "a.b.c;"); [EOL] } <line_num>: 536,545
public void testProvideOrder3b() { [EOL]     additionalEndCode = ""; [EOL]     addAdditionalNamespace = false; [EOL]     test("goog.provide('a.b');" + "a.b = function(x,y) {};" + "goog.provide('a.b.c');" + "a.b.c;", "var a = {};" + "a.b = function(x,y) {};" + "a.b.c = {};" + "a.b.c;"); [EOL] } <line_num>: 547,559
public void testProvideOrder4a() { [EOL]     test("goog.provide('goog.a');" + "goog.provide('goog.a.b');" + "if (x) {" + "  goog.a.b = 1;" + "} else {" + "  goog.a.b = 2;" + "}", "goog.a={};" + "if(x)" + "  goog.a.b=1;" + "else" + "  goog.a.b=2;"); [EOL] } <line_num>: 561,575
public void testProvideOrder4b() { [EOL]     additionalEndCode = ""; [EOL]     addAdditionalNamespace = false; [EOL]     test("goog.provide('goog.a');" + "goog.provide('goog.a.b');" + "if (x) {" + "  goog.a.b = 1;" + "} else {" + "  goog.a.b = 2;" + "}", "goog.a={};" + "if(x)" + "  goog.a.b=1;" + "else" + "  goog.a.b=2;"); [EOL] } <line_num>: 577,594
public void testInvalidProvide() { [EOL]     test("goog.provide('a.class');", null, INVALID_PROVIDE_ERROR); [EOL] } <line_num>: 596,598
public void testInvalidBase1() { [EOL]     test("goog.base(this, 'method');", null, BASE_CLASS_ERROR); [EOL] } <line_num>: 606,608
public void testInvalidBase2() { [EOL]     test("function Foo() {}" + "Foo.method = function() {" + "  goog.base(this, 'method');" + "};", null, BASE_CLASS_ERROR); [EOL] } <line_num>: 610,615
public void testInvalidBase3() { [EOL]     test(String.format(METHOD_FORMAT, "goog.base();"), null, BASE_CLASS_ERROR); [EOL] } <line_num>: 617,620
public void testInvalidBase4() { [EOL]     test(String.format(METHOD_FORMAT, "goog.base(this, 'bar');"), null, BASE_CLASS_ERROR); [EOL] } <line_num>: 622,625
public void testInvalidBase5() { [EOL]     test(String.format(METHOD_FORMAT, "goog.base('foo', 'method');"), null, BASE_CLASS_ERROR); [EOL] } <line_num>: 627,630
public void testInvalidBase6() { [EOL]     test(String.format(METHOD_FORMAT, "goog.base.call(null, this, 'method');"), null, BASE_CLASS_ERROR); [EOL] } <line_num>: 632,635
public void testInvalidBase7() { [EOL]     test("function Foo() { goog.base(this); }", null, BASE_CLASS_ERROR); [EOL] } <line_num>: 637,640
public void testInvalidBase8() { [EOL]     test("var Foo = function() { goog.base(this); }", null, BASE_CLASS_ERROR); [EOL] } <line_num>: 642,645
public void testInvalidBase9() { [EOL]     test("var goog = {}; goog.Foo = function() { goog.base(this); }", null, BASE_CLASS_ERROR); [EOL] } <line_num>: 647,650
public void testValidBase1() { [EOL]     test(String.format(METHOD_FORMAT, "goog.base(this, 'method');"), String.format(METHOD_FORMAT, "Foo.superClass_.method.call(this)")); [EOL] } <line_num>: 652,655
public void testValidBase2() { [EOL]     test(String.format(METHOD_FORMAT, "goog.base(this, 'method', 1, 2);"), String.format(METHOD_FORMAT, "Foo.superClass_.method.call(this, 1, 2)")); [EOL] } <line_num>: 657,661
public void testValidBase3() { [EOL]     test(String.format(METHOD_FORMAT, "return goog.base(this, 'method');"), String.format(METHOD_FORMAT, "return Foo.superClass_.method.call(this)")); [EOL] } <line_num>: 663,667
public void testValidBase4() { [EOL]     test("function Foo() { goog.base(this, 1, 2); }" + FOO_INHERITS, "function Foo() { BaseFoo.call(this, 1, 2); } " + FOO_INHERITS); [EOL] } <line_num>: 669,672
public void testValidBase5() { [EOL]     test("var Foo = function() { goog.base(this, 1); };" + FOO_INHERITS, "var Foo = function() { BaseFoo.call(this, 1); }; " + FOO_INHERITS); [EOL] } <line_num>: 674,677
public void testValidBase6() { [EOL]     test("var goog = {}; goog.Foo = function() { goog.base(this); }; " + "goog.inherits(goog.Foo, goog.BaseFoo);", "var goog = {}; goog.Foo = function() { goog.BaseFoo.call(this); }; " + "goog.inherits(goog.Foo, goog.BaseFoo);"); [EOL] } <line_num>: 679,684
public void testImplicitAndExplicitProvide() { [EOL]     test("var goog = {}; " + "goog.provide('goog.foo.bar'); goog.provide('goog.foo');", "var goog = {}; goog.foo = {}; goog.foo.bar = {};"); [EOL] } <line_num>: 686,690
public void testImplicitProvideInIndependentModules() { [EOL]     test(createModuleStar("", "goog.provide('apps.A');", "goog.provide('apps.B');"), new String[] { "var apps = {};", "apps.A = {};", "apps.B = {};" }); [EOL] } <line_num>: 692,703
public void testImplicitProvideInIndependentModules2() { [EOL]     test(createModuleStar("goog.provide('apps');", "goog.provide('apps.foo.A');", "goog.provide('apps.foo.B');"), new String[] { "var apps = {}; apps.foo = {};", "apps.foo.A = {};", "apps.foo.B = {};" }); [EOL] } <line_num>: 705,716
public void testImplicitProvideInIndependentModules3() { [EOL]     test(createModuleStar("var goog = {};", "goog.provide('goog.foo.A');", "goog.provide('goog.foo.B');"), new String[] { "var goog = {}; goog.foo = {};", "goog.foo.A = {};", "goog.foo.B = {};" }); [EOL] } <line_num>: 718,729
public void testProvideInIndependentModules1() { [EOL]     test(createModuleStar("goog.provide('apps');", "goog.provide('apps.foo');", "goog.provide('apps.foo.B');"), new String[] { "var apps = {}; apps.foo = {};", "", "apps.foo.B = {};" }); [EOL] } <line_num>: 731,742
public void testProvideInIndependentModules2() { [EOL]     test(createModuleStar("goog.provide('apps');", "goog.provide('apps.foo'); apps.foo = {};", "goog.provide('apps.foo.B');"), new String[] { "var apps = {};", "apps.foo = {};", "apps.foo.B = {};" }); [EOL] } <line_num>: 744,756
public void testProvideInIndependentModules2b() { [EOL]     test(createModuleStar("goog.provide('apps');", "goog.provide('apps.foo'); apps.foo = function() {};", "goog.provide('apps.foo.B');"), new String[] { "var apps = {};", "apps.foo = function() {};", "apps.foo.B = {};" }); [EOL] } <line_num>: 758,770
public void testProvideInIndependentModules3() { [EOL]     test(createModuleStar("goog.provide('apps');", "goog.provide('apps.foo.B');", "goog.provide('apps.foo'); goog.require('apps.foo');"), new String[] { "var apps = {}; apps.foo = {};", "apps.foo.B = {};", "" }); [EOL] } <line_num>: 772,783
public void testProvideInIndependentModules3b() { [EOL]     test(createModuleStar("goog.provide('apps');", "goog.provide('apps.foo.B');", "goog.provide('apps.foo'); apps.foo = function() {}; " + "goog.require('apps.foo');"), new String[] { "var apps = {};", "apps.foo.B = {};", "apps.foo = function() {};" }); [EOL] } <line_num>: 785,798
public void testProvideInIndependentModules4() { [EOL]     test(createModuleStar("goog.provide('apps');", "goog.provide('apps.foo.bar.B');", "goog.provide('apps.foo.bar.C');"), new String[] { "var apps = {};apps.foo = {};apps.foo.bar = {}", "apps.foo.bar.B = {};", "apps.foo.bar.C = {};" }); [EOL] } <line_num>: 800,813
public void testRequireOfBaseGoog() { [EOL]     test("goog.require('goog');", "", MISSING_PROVIDE_ERROR); [EOL] } <line_num>: 815,818
public void testSourcePositionPreservation() { [EOL]     test("goog.provide('foo.bar.baz');", "var foo = {};" + "foo.bar = {};" + "foo.bar.baz = {};"); [EOL]     Node root = getLastCompiler().getRoot(); [EOL]     Node fooDecl = findQualifiedNameNode("foo", root); [EOL]     Node fooBarDecl = findQualifiedNameNode("foo.bar", root); [EOL]     Node fooBarBazDecl = findQualifiedNameNode("foo.bar.baz", root); [EOL]     assertEquals(1, fooDecl.getLineno()); [EOL]     assertEquals(14, fooDecl.getCharno()); [EOL]     assertEquals(1, fooBarDecl.getLineno()); [EOL]     assertEquals(18, fooBarDecl.getCharno()); [EOL]     assertEquals(1, fooBarBazDecl.getLineno()); [EOL]     assertEquals(22, fooBarBazDecl.getCharno()); [EOL] } <line_num>: 820,840
public void testNoStubForProvidedTypedef() { [EOL]     test("goog.provide('x'); /** @typedef {number} */ var x;", "var x;"); [EOL] } <line_num>: 842,844
public void testNoStubForProvidedTypedef2() { [EOL]     test("goog.provide('x.y'); /** @typedef {number} */ x.y;", "var x = {}; x.y;"); [EOL] } <line_num>: 846,849
public void testNoStubForProvidedTypedef4() { [EOL]     test("goog.provide('x.y.z'); /** @typedef {number} */ x.y.z;", "var x = {}; x.y = {}; x.y.z;"); [EOL] } <line_num>: 851,854
public void testProvideRequireSameFile() { [EOL]     test("goog.provide('x');\ngoog.require('x');", "var x = {};"); [EOL] } <line_num>: 856,858