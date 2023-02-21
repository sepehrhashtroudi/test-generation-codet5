public NormalizeTest() { [EOL]     super(EXTERNS); [EOL]     super.enableLineNumberCheck(true); [EOL] } <line_num>: 34,37
WithCollapse() { [EOL]     enableNormalize(); [EOL] } <line_num>: 500,502
@Override [EOL] public CompilerPass getProcessor(final Compiler compiler) { [EOL]     return new Normalize(compiler, false); [EOL] } <line_num>: 39,42
@Override [EOL] protected int getNumRepetitions() { [EOL]     return 1; [EOL] } <line_num>: 44,48
public void testSplitVar() { [EOL]     testSame("var a"); [EOL]     test("var a, b", "var a; var b"); [EOL]     test("var a, b, c", "var a; var b; var c"); [EOL]     testSame("var a = 0 "); [EOL]     test("var a = 0 , b = foo()", "var a = 0; var b = foo()"); [EOL]     test("var a = 0, b = 1, c = 2", "var a = 0; var b = 1; var c = 2"); [EOL]     test("var a = foo(1), b = foo(2), c = foo(3)", "var a = foo(1); var b = foo(2); var c = foo(3)"); [EOL]     test("for(var a = 0, b = foo(1), c = 1; c < b; c++) foo(2)", "var a = 0; var b = foo(1); var c = 1; for(; c < b; c++) foo(2)"); [EOL]     test("for(;;) var b = foo(1), c = foo(2);", "for(;;){var b = foo(1); var c = foo(2)}"); [EOL]     test("for(;;){var b = foo(1), c = foo(2);}", "for(;;){var b = foo(1); var c = foo(2)}"); [EOL]     test("try{var b = foo(1), c = foo(2);} finally foo(3);", "try{var b = foo(1); var c = foo(2)} finally foo(3);"); [EOL]     test("try{var b = foo(1),c = foo(2);} finally;", "try{var b = foo(1); var c = foo(2)} finally;"); [EOL]     test("try{foo(0);} finally var b = foo(1), c = foo(2);", "try{foo(0);} finally {var b = foo(1); var c = foo(2)}"); [EOL]     test("switch(a) {default: var b = foo(1), c = foo(2); break;}", "switch(a) {default: var b = foo(1); var c = foo(2); break;}"); [EOL]     test("do var a = foo(1), b; while(false);", "do{var a = foo(1); var b} while(false);"); [EOL]     test("a:var a,b,c;", "a:{ var a;var b; var c; }"); [EOL]     test("a:for(var a,b,c;;);", "var a;var b; var c;a:for(;;);"); [EOL]     test("if (true) a:var a,b;", "if (true)a:{ var a; var b; }"); [EOL] } <line_num>: 50,92
public void testDuplicateVarInExterns() { [EOL]     test("var extern;", "/** @suppress {duplicate} */ var extern = 3;", "var extern = 3;", null, null); [EOL] } <line_num>: 94,98
public void testUnhandled() { [EOL]     testSame("var x = y = 1"); [EOL] } <line_num>: 100,102
public void testFor() { [EOL]     test("for(a = 0; a < 2 ; a++) foo();", "a = 0; for(; a < 2 ; a++) foo()"); [EOL]     test("for(var a = 0; c < b ; c++) foo()", "var a = 0; for(; c < b ; c++) foo()"); [EOL]     test("a:for(var a = 0; c < b ; c++) foo()", "var a = 0; a:for(; c < b ; c++) foo()"); [EOL]     test("a:b:for(var a = 0; c < b ; c++) foo()", "var a = 0; a:b:for(; c < b ; c++) foo()"); [EOL]     test("if(x) for(var a = 0; c < b ; c++) foo()", "if(x){var a = 0; for(; c < b ; c++) foo()}"); [EOL]     test("for(init(); a < 2 ; a++) foo();", "init(); for(; a < 2 ; a++) foo()"); [EOL] } <line_num>: 104,126
public void testForIn1() { [EOL]     testSame("for(a in b) foo();"); [EOL]     test("for(var a in b) foo()", "var a; for(a in b) foo()"); [EOL]     test("a:for(var a in b) foo()", "var a; a:for(a in b) foo()"); [EOL]     test("a:b:for(var a in b) foo()", "var a; a:b:for(a in b) foo()"); [EOL]     test("if (x) for(var a in b) foo()", "if (x) { var a; for(a in b) foo() }"); [EOL] } <line_num>: 128,146
public void testForIn2() { [EOL]     test("for(var a = foo() in b) foo()", "var a = foo(); for(a in b) foo()"); [EOL] } <line_num>: 148,152
public void testWhile() { [EOL]     test("while(c < b) foo()", "for(; c < b;) foo()"); [EOL] } <line_num>: 154,158
public void testMoveFunctions1() throws Exception { [EOL]     test("function f() { if (x) return; foo(); function foo() {} }", "function f() {function foo() {} if (x) return; foo(); }"); [EOL]     test("function f() { " + "function foo() {} " + "if (x) return;" + "foo(); " + "function bar() {} " + "}", "function f() {" + "function foo() {}" + "function bar() {}" + "if (x) return;" + "foo();" + "}"); [EOL] } <line_num>: 160,175
public void testMoveFunctions2() throws Exception { [EOL]     testSame("function f() { function foo() {} }"); [EOL]     test("function f() { f(); a:function bar() {} }", "function f() { f(); a:{ var bar = function () {} }}"); [EOL]     test("function f() { f(); {function bar() {}}}", "function f() { f(); {var bar = function () {}}}"); [EOL]     test("function f() { f(); if (true) {function bar() {}}}", "function f() { f(); if (true) {var bar = function () {}}}"); [EOL] } <line_num>: 177,185
private String inFunction(String code) { [EOL]     return "(function(){" + code + "})"; [EOL] } <line_num>: 187,189
private void testSameInFunction(String code) { [EOL]     testSame(inFunction(code)); [EOL] } <line_num>: 191,193
private void testInFunction(String code, String expected) { [EOL]     test(inFunction(code), inFunction(expected)); [EOL] } <line_num>: 195,197
public void testNormalizeFunctionDeclarations() throws Exception { [EOL]     testSame("function f() {}"); [EOL]     testSame("var f = function () {}"); [EOL]     test("var f = function f() {}", "var f = function f$$1() {}"); [EOL]     testSame("var f = function g() {}"); [EOL]     test("a:function g() {}", "a:{ var g = function () {} }"); [EOL]     test("{function g() {}}", "{var g = function () {}}"); [EOL]     testSame("if (function g() {}) {}"); [EOL]     test("if (true) {function g() {}}", "if (true) {var g = function () {}}"); [EOL]     test("if (true) {} else {function g() {}}", "if (true) {} else {var g = function () {}}"); [EOL]     testSame("switch (function g() {}) {}"); [EOL]     test("switch (1) { case 1: function g() {}}", "switch (1) { case 1: var g = function () {}}"); [EOL]     testSameInFunction("function f() {}"); [EOL]     testInFunction("f(); a:function g() {}", "f(); a:{ var g = function () {} }"); [EOL]     testInFunction("f(); {function g() {}}", "f(); {var g = function () {}}"); [EOL]     testInFunction("f(); if (true) {function g() {}}", "f(); if (true) {var g = function () {}}"); [EOL]     testInFunction("if (true) {} else {function g() {}}", "if (true) {} else {var g = function () {}}"); [EOL] } <line_num>: 199,228
public void testMakeLocalNamesUnique() { [EOL]     if (!Normalize.MAKE_LOCAL_NAMES_UNIQUE) { [EOL]         return; [EOL]     } [EOL]     testSame("var a;"); [EOL]     testSame("a;"); [EOL]     test("var a;function foo(a){var b;a}", "var a;function foo(a$$1){var b;a$$1}"); [EOL]     test("var a;function foo(){var b;a}function boo(){var b;a}", "var a;function foo(){var b;a}function boo(){var b$$1;a}"); [EOL]     test("function foo(a){var b}" + "function boo(a){var b}", "function foo(a){var b}" + "function boo(a$$1){var b$$1}"); [EOL]     test("var a = function foo(){foo()};var b = function foo(){foo()};", "var a = function foo(){foo()};var b = function foo$$1(){foo$$1()};"); [EOL]     test("try { } catch(e) {e;}", "try { } catch(e) {e;}"); [EOL]     test("try { } catch(e) {e;}; try { } catch(e) {e;}", "try { } catch(e) {e;}; try { } catch(e$$1) {e$$1;}"); [EOL]     test("try { } catch(e) {e; try { } catch(e) {e;}};", "try { } catch(e) {e; try { } catch(e$$1) {e$$1;} }; "); [EOL]     test("/** @suppress {duplicate} */\nvar window;", "var window;"); [EOL]     test("/** @suppress {duplicate} */\nvar window;" + "/** @suppress {duplicate} */\nvar window;", "var window;"); [EOL]     test("function f() {var window}", "function f() {var window$$1}"); [EOL] } <line_num>: 231,274
public void testRemoveDuplicateVarDeclarations1() { [EOL]     test("function f() { var a; var a }", "function f() { var a; }"); [EOL]     test("function f() { var a = 1; var a = 2 }", "function f() { var a = 1; a = 2 }"); [EOL]     test("var a = 1; function f(){ var a = 2 }", "var a = 1; function f(){ var a$$1 = 2 }"); [EOL]     test("function f() { var a = 1; lable1:var a = 2 }", "function f() { var a = 1; lable1:{a = 2}}"); [EOL]     test("function f() { var a = 1; lable1:var a }", "function f() { var a = 1; lable1:{} }"); [EOL]     test("function f() { var a = 1; for(var a in b); }", "function f() { var a = 1; for(a in b); }"); [EOL] } <line_num>: 276,289
public void testRemoveDuplicateVarDeclarations2() { [EOL]     test("var e = 1; function f(){ try {} catch (e) {} var e = 2 }", "var e = 1; function f(){ try {} catch (e$$2) {} var e$$1 = 2 }"); [EOL] } <line_num>: 291,294
public void testRemoveDuplicateVarDeclarations3() { [EOL]     test("var f = 1; function f(){}", "f = 1; function f(){}"); [EOL]     test("var f; function f(){}", "function f(){}"); [EOL]     test("if (a) { var f = 1; } else { function f(){} }", "if (a) { var f = 1; } else { f = function (){} }"); [EOL]     test("function f(){} var f = 1;", "function f(){} f = 1;"); [EOL]     test("function f(){} var f;", "function f(){}"); [EOL]     test("if (a) { function f(){} } else { var f = 1; }", "if (a) { var f = function (){} } else { f = 1; }"); [EOL]     test("function f(){} function f(){}", "function f(){} function f(){}", SyntacticScopeCreator.VAR_MULTIPLY_DECLARED_ERROR); [EOL]     test("if (a) { function f(){} } else { function f(){} }", "if (a) { var f = function (){} } else { f = function (){} }"); [EOL] } <line_num>: 296,318
public void testRenamingConstants() { [EOL]     test("var ACONST = 4;var b = ACONST;", "var ACONST = 4; var b = ACONST;"); [EOL]     test("var a, ACONST = 4;var b = ACONST;", "var a; var ACONST = 4; var b = ACONST;"); [EOL]     test("var ACONST; ACONST = 4; var b = ACONST;", "var ACONST; ACONST = 4;" + "var b = ACONST;"); [EOL]     test("var ACONST = new Foo(); var b = ACONST;", "var ACONST = new Foo(); var b = ACONST;"); [EOL]     test("/** @const */var aa; aa=1;", "var aa;aa=1"); [EOL] } <line_num>: 320,335
public void testSkipRenamingExterns() { [EOL]     test("var EXTERN; var ext; ext.FOO;", "var b = EXTERN; var c = ext.FOO", "var b = EXTERN; var c = ext.FOO", null, null); [EOL] } <line_num>: 337,340
public void testIssue166a() { [EOL]     test("try { throw 1 } catch(e) { /** @suppress {duplicate} */ var e=2 }", "try { throw 1 } catch(e) { var e=2 }", Normalize.CATCH_BLOCK_VAR_ERROR); [EOL] } <line_num>: 342,346
public void testIssue166b() { [EOL]     test("function a() {" + "try { throw 1 } catch(e) { /** @suppress {duplicate} */ var e=2 }" + "};", "function a() {" + "try { throw 1 } catch(e) { var e=2 }" + "}", Normalize.CATCH_BLOCK_VAR_ERROR); [EOL] } <line_num>: 348,356
public void testIssue166c() { [EOL]     test("var e = 0; try { throw 1 } catch(e) {" + "/** @suppress {duplicate} */ var e=2 }", "var e = 0; try { throw 1 } catch(e) { var e=2 }", Normalize.CATCH_BLOCK_VAR_ERROR); [EOL] } <line_num>: 358,363
public void testIssue166d() { [EOL]     test("function a() {" + "var e = 0; try { throw 1 } catch(e) {" + "/** @suppress {duplicate} */ var e=2 }" + "};", "function a() {" + "var e = 0; try { throw 1 } catch(e) { var e=2 }" + "}", Normalize.CATCH_BLOCK_VAR_ERROR); [EOL] } <line_num>: 365,374
public void testIssue166e() { [EOL]     test("var e = 2; try { throw 1 } catch(e) {}", "var e = 2; try { throw 1 } catch(e$$1) {}"); [EOL] } <line_num>: 376,379
public void testIssue166f() { [EOL]     test("function a() {" + "var e = 2; try { throw 1 } catch(e) {}" + "}", "function a() {" + "var e = 2; try { throw 1 } catch(e$$1) {}" + "}"); [EOL] } <line_num>: 381,388
public void testIssue() { [EOL]     super.allowExternsChanges(true); [EOL]     test("var a,b,c; var a,b", "a(), b()", "a(), b()", null, null); [EOL] } <line_num>: 390,393
public void testNormalizeSyntheticCode() { [EOL]     Compiler compiler = new Compiler(); [EOL]     compiler.init(Lists.<SourceFile>newArrayList(), Lists.<SourceFile>newArrayList(), new CompilerOptions()); [EOL]     Node code = Normalize.parseAndNormalizeSyntheticCode(compiler, "function f(x) {} function g(x) {}", "prefix_"); [EOL]     assertEquals("function f(x$$prefix_0){}function g(x$$prefix_1){}", compiler.toSource(code)); [EOL] } <line_num>: 395,405
public void testIsConstant() throws Exception { [EOL]     testSame("var CONST = 3; var b = CONST;"); [EOL]     Node n = getLastCompiler().getRoot(); [EOL]     Set<Node> constantNodes = findNodesWithProperty(n, Node.IS_CONSTANT_NAME); [EOL]     assertEquals(2, constantNodes.size()); [EOL]     for (Node hasProp : constantNodes) { [EOL]         assertEquals("CONST", hasProp.getString()); [EOL]     } [EOL] } <line_num>: 407,416
public void testPropertyIsConstant1() throws Exception { [EOL]     testSame("var a = {};a.CONST = 3; var b = a.CONST;"); [EOL]     Node n = getLastCompiler().getRoot(); [EOL]     Set<Node> constantNodes = findNodesWithProperty(n, Node.IS_CONSTANT_NAME); [EOL]     assertEquals(2, constantNodes.size()); [EOL]     for (Node hasProp : constantNodes) { [EOL]         assertEquals("CONST", hasProp.getString()); [EOL]     } [EOL] } <line_num>: 418,427
public void testPropertyIsConstant2() throws Exception { [EOL]     testSame("var a = {CONST: 3}; var b = a.CONST;"); [EOL]     Node n = getLastCompiler().getRoot(); [EOL]     Set<Node> constantNodes = findNodesWithProperty(n, Node.IS_CONSTANT_NAME); [EOL]     assertEquals(2, constantNodes.size()); [EOL]     for (Node hasProp : constantNodes) { [EOL]         assertEquals("CONST", hasProp.getString()); [EOL]     } [EOL] } <line_num>: 429,438
public void testGetterPropertyIsConstant() throws Exception { [EOL]     testSame("var a = { get CONST() {return 3} }; " + "var b = a.CONST;"); [EOL]     Node n = getLastCompiler().getRoot(); [EOL]     Set<Node> constantNodes = findNodesWithProperty(n, Node.IS_CONSTANT_NAME); [EOL]     assertEquals(2, constantNodes.size()); [EOL]     for (Node hasProp : constantNodes) { [EOL]         assertEquals("CONST", hasProp.getString()); [EOL]     } [EOL] } <line_num>: 440,450
public void testSetterPropertyIsConstant() throws Exception { [EOL]     testSame("var a = { set CONST(b) {throw 'invalid'} }; " + "var c = a.CONST;"); [EOL]     Node n = getLastCompiler().getRoot(); [EOL]     Set<Node> constantNodes = findNodesWithProperty(n, Node.IS_CONSTANT_NAME); [EOL]     assertEquals(2, constantNodes.size()); [EOL]     for (Node hasProp : constantNodes) { [EOL]         assertEquals("CONST", hasProp.getString()); [EOL]     } [EOL] } <line_num>: 452,463
public void testExposeSimple() { [EOL]     test("var x = {}; /** @expose */ x.y = 3; x.y = 5;", "var x = {}; x['y'] = 3; x['y'] = 5;"); [EOL] } <line_num>: 465,468
public void testExposeComplex() { [EOL]     test("var x = {/** @expose */ a: 1, b: 2};" + "x.a = 3; /** @expose */ x.b = 5;", "var x = {'a': 1, 'b': 2};" + "x['a'] = 3; x['b'] = 5;"); [EOL] } <line_num>: 470,476
@Override [EOL] public void visit(NodeTraversal t, Node node, Node parent) { [EOL]     if (node.getBooleanProp(prop)) { [EOL]         set.add(node); [EOL]     } [EOL] } <line_num>: 482,487
private Set<Node> findNodesWithProperty(Node root, final int prop) { [EOL]     final Set<Node> set = Sets.newHashSet(); [EOL]     NodeTraversal.traverse(getLastCompiler(), root, new AbstractPostOrderCallback() { [EOL]  [EOL]         @Override [EOL]         public void visit(NodeTraversal t, Node node, Node parent) { [EOL]             if (node.getBooleanProp(prop)) { [EOL]                 set.add(node); [EOL]             } [EOL]         } [EOL]     }); [EOL]     return set; [EOL] } <line_num>: 478,490
public void testRenamingConstantProperties() { [EOL]     new WithCollapse().testConstantProperties(); [EOL] } <line_num>: 492,497
private void testConstantProperties() { [EOL]     test("var a={}; a.ACONST = 4;var b = a.ACONST;", "var a$ACONST = 4; var b = a$ACONST;"); [EOL]     test("var a={b:{}}; a.b.ACONST = 4;var b = a.b.ACONST;", "var a$b$ACONST = 4;var b = a$b$ACONST;"); [EOL]     test("var a = {FOO: 1};var b = a.FOO;", "var a$FOO = 1; var b = a$FOO;"); [EOL]     test("var EXTERN; var ext; ext.FOO;", "var b = EXTERN; var c = ext.FOO", "var b = EXTERN; var c = ext.FOO", null, null); [EOL]     test("var a={}; a.ACONST = 4; var b = a.ACONST;", "var a$ACONST = 4; var b = a$ACONST;"); [EOL]     test("var a = {}; function foo() { var d = a.CONST; };" + "(function(){a.CONST=4})();", "var a$CONST;function foo(){var d = a$CONST;};" + "(function(){a$CONST = 4})();"); [EOL]     test("var a = {}; a.ACONST = new Foo(); var b = a.ACONST;", "var a$ACONST = new Foo(); var b = a$ACONST;"); [EOL] } <line_num>: 504,527
@Override [EOL] protected int getNumRepetitions() { [EOL]     return 1; [EOL] } <line_num>: 529,533
@Override [EOL] public void process(Node externs, Node root) { [EOL]     new CollapseProperties(compiler, false, true).process(externs, root); [EOL] } <line_num>: 538,541
@Override [EOL] public CompilerPass getProcessor(final Compiler compiler) { [EOL]     return new CompilerPass() { [EOL]  [EOL]         @Override [EOL]         public void process(Node externs, Node root) { [EOL]             new CollapseProperties(compiler, false, true).process(externs, root); [EOL]         } [EOL]     }; [EOL] } <line_num>: 535,543
