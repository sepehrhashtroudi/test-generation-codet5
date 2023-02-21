public void testNoSplit() { [EOL]     splitFunctions("", ""); [EOL]     splitFunctions("var x", "var x"); [EOL]     splitFunctions("var x", "var x"); [EOL]     splitFunctions("x()", "x()"); [EOL] } <line_num>: 35,40
public void testSplitNamedFuntion() { [EOL]     splitFunctions("function foo() { foo() } foo()", "function " + HOLDER + "() {} foo()", "function foo() { foo() }"); [EOL] } <line_num>: 42,46
public void testSplitNamedFuntionWithArgs() { [EOL]     splitFunctions("function foo(x) { foo(1) } foo(1)", "function " + HOLDER + "() {} foo(1)", "function foo(x) { foo(1) }"); [EOL] } <line_num>: 49,53
public void disable_testSplitAnonFuntion() { [EOL]     splitFunctions("var foo = function(x) { foo(1) }; foo(1)", "var foo = function " + HOLDER + "() {}; foo(1)", "(function(x) { foo(1) })"); [EOL] } <line_num>: 57,61
public void disable_testSplitInplaceCall() { [EOL]     splitFunctions("(function() { print('hi') })()", "(function " + HOLDER + "() {})()", "(function() { print('hi') })"); [EOL] } <line_num>: 65,69
public void disable_testSplitMupltiFuntions() { [EOL]     splitFunctions("var foo = function(x) { foo(1) }; foo();" + "var bar = function(x,y) { bar(1,2) }; bar(1,2)", "var foo = function " + HOLDER + "() {}; foo();" + "var bar = function " + HOLDER + "() {}; bar(1,2)", "(function(x) { foo(1) })", "(function(x,y) { bar(1,2) })"); [EOL] } <line_num>: 73,83
public void disable_testInnerFunctions() { [EOL]     splitFunctions("var foo = function() {var bar = function() {}}", "var foo = function " + HOLDER + "() {}", "function() {var bar = function() {}}"); [EOL] } <line_num>: 87,91
public void testSplitFileLevel() { [EOL]     splitFiles(new String[] { "var a", "var b", "var c" }); [EOL]     splitFiles(new String[] { "var a", "var b", "var c", "var d", "function e() {}" }); [EOL] } <line_num>: 93,97
private void splitFunctions(String input, String... output) { [EOL]     Compiler compiler = new Compiler(); [EOL]     Node original = compiler.parseTestCode(input); [EOL]     Node root = original.cloneTree(); [EOL]     AstParallelizer parallelizer = AstParallelizer.createNewFunctionLevelAstParallelizer(root, true); [EOL]     List<Node> forest = parallelizer.split(); [EOL]     assertEquals(output.length, forest.size()); [EOL]     int i = 0; [EOL]     for (Node n : forest) { [EOL]         Node tree = compiler.parseTestCode(output[i++]); [EOL]         assertEquals(compiler.toSource(tree), compiler.toSource(n)); [EOL]     } [EOL]     parallelizer.join(); [EOL]     assertTrue(original.isEquivalentTo(root)); [EOL] } <line_num>: 104,120
private void splitFiles(String[] input) { [EOL]     Compiler compiler = new Compiler(); [EOL]     List<SourceFile> files = Lists.newArrayList(); [EOL]     for (int i = 0; i < input.length; i++) { [EOL]         files.add(SourceFile.fromCode("file" + i, input[i])); [EOL]     } [EOL]     compiler.init(ImmutableList.<SourceFile>of(), files, new CompilerOptions()); [EOL]     compiler.parse(); [EOL]     Node original = compiler.getRoot(); [EOL]     Node root = original.cloneTree(); [EOL]     AstParallelizer parallelizer = AstParallelizer.createNewFileLevelAstParallelizer(root); [EOL]     List<Node> forest = parallelizer.split(); [EOL]     assertEquals(input.length, forest.size()); [EOL]     int i = 0; [EOL]     for (Node n : forest) { [EOL]         Node tree = compiler.parseTestCode(input[i++]); [EOL]         assertEquals(compiler.toSource(tree), compiler.toSource(n)); [EOL]     } [EOL]     parallelizer.join(); [EOL]     assertTrue(original.isEquivalentTo(root)); [EOL] } <line_num>: 122,148
