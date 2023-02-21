@Override [EOL] protected void setUp() throws Exception { [EOL]     reportMisplacedTypeAnnotations = false; [EOL]     super.setUp(); [EOL] } <line_num>: 34,38
public void testTrailingComma() throws Exception { [EOL]     String message = "Parse error. IE8 (and below) will parse trailing commas in " + "array and object literals incorrectly. " + "If you are targeting newer versions of JS, " + "set the appropriate language_in option."; [EOL]     assertError("var x = [1,];", RhinoErrorReporter.TRAILING_COMMA, message); [EOL]     JSError error = assertError("var x = {\n" + "    1: 2,\n" + "};", RhinoErrorReporter.TRAILING_COMMA, message); [EOL]     assertEquals(2, error.getLineNumber()); [EOL]     assertEquals(4, error.getCharno()); [EOL] } <line_num>: 40,62
public void testMisplacedTypeAnnotation() throws Exception { [EOL]     reportMisplacedTypeAnnotations = false; [EOL]     assertNoWarningOrError("var x = /** @type {string} */ y;"); [EOL]     reportMisplacedTypeAnnotations = true; [EOL]     String message = "Type annotations are not allowed here. " + "Are you missing parentheses?"; [EOL]     assertWarning("var x = /** @type {string} */ y;", RhinoErrorReporter.MISPLACED_TYPE_ANNOTATION, message); [EOL]     JSError error = assertWarning("var x = /** @type {string} */ y;", RhinoErrorReporter.MISPLACED_TYPE_ANNOTATION, message); [EOL]     assertEquals(1, error.getLineNumber()); [EOL]     assertEquals(0, error.getCharno()); [EOL] } <line_num>: 64,88
private void assertNoWarningOrError(String code) { [EOL]     Compiler compiler = parseCode(code); [EOL]     assertEquals("Expected error", 0, compiler.getErrorCount()); [EOL]     assertEquals("Expected warning", 0, compiler.getErrorCount()); [EOL] } <line_num>: 93,97
private JSError assertError(String code, DiagnosticType type, String description) { [EOL]     Compiler compiler = parseCode(code); [EOL]     assertEquals("Expected error", 1, compiler.getErrorCount()); [EOL]     JSError error = Iterables.getOnlyElement(Lists.newArrayList(compiler.getErrors())); [EOL]     assertEquals(type, error.getType()); [EOL]     assertEquals(description, error.description); [EOL]     return error; [EOL] } <line_num>: 102,112
private JSError assertWarning(String code, DiagnosticType type, String description) { [EOL]     Compiler compiler = parseCode(code); [EOL]     assertEquals("Expected warning", 1, compiler.getWarningCount()); [EOL]     JSError error = Iterables.getOnlyElement(Lists.newArrayList(compiler.getWarnings())); [EOL]     assertEquals(type, error.getType()); [EOL]     assertEquals(description, error.description); [EOL]     return error; [EOL] } <line_num>: 117,127
private Compiler parseCode(String code) { [EOL]     Compiler compiler = new Compiler(); [EOL]     CompilerOptions options = new CompilerOptions(); [EOL]     if (reportMisplacedTypeAnnotations) { [EOL]         options.setWarningLevel(DiagnosticGroups.MISPLACED_TYPE_ANNOTATION, CheckLevel.WARNING); [EOL]     } [EOL]     List<SourceFile> externs = ImmutableList.of(); [EOL]     List<SourceFile> inputs = ImmutableList.of(SourceFile.fromCode("input", code)); [EOL]     compiler.init(externs, inputs, options); [EOL]     compiler.parseInputs(); [EOL]     return compiler; [EOL] } <line_num>: 129,144
