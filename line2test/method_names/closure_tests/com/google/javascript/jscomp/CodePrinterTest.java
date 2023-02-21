public void setUp()
 Node parse(String js)
 Node parse(String js, boolean checkTypes)
private static void checkUnexpectedErrorsOrWarnings(Compiler compiler, int expected)
 String parsePrint(String js, boolean prettyprint, int lineThreshold)
 String parsePrint(String js, boolean prettyprint, boolean lineBreak, int lineThreshold)
 String parsePrint(String js, boolean prettyprint, boolean lineBreak, boolean preferLineBreakAtEof, int lineThreshold)
 String parsePrint(String js, boolean prettyprint, boolean lineBreak, int lineThreshold, boolean outputTypes)
 String parsePrint(String js, boolean prettyprint, boolean lineBreak, int lineThreshold, boolean outputTypes, boolean tagAsStrict)
 String printNode(Node n)
 void assertPrintNode(String expectedJs, Node ast)
public void testPrint()
public void testBreakTrustedStrings()
public void testBreakUntrustedStrings()
public void testPrintArray()
public void testHook()
public void testPrintInOperatorInForLoop()
public void testLiteralProperty()
private void assertPrint(String js, String expected)
private void assertPrintSame(String js)
public void testAmbiguousElseClauses()
public void testLineBreak()
private void assertLineBreak(String js, String expected)
public void testPreferLineBreakAtEndOfFile()
private void assertLineBreakAtEndOfFile(String js, String expectedWithoutBreakAtEnd, String expectedWithBreakAtEnd)
public void testPrettyPrinter()
public void testPrettyPrinter2()
public void testPrettyPrinter3()
public void testPrettyPrinter4()
public void testTypeAnnotations()
public void testTypeAnnotationsTypeDef()
public void testTypeAnnotationsAssign()
public void testTypeAnnotationsNamespace()
public void testTypeAnnotationsMemberSubclass()
public void testTypeAnnotationsInterface()
public void testTypeAnnotationsMultipleInterface()
public void testTypeAnnotationsMember()
public void testTypeAnnotationsImplements()
public void testTypeAnnotationsDispatcher1()
public void testTypeAnnotationsDispatcher2()
public void testU2UFunctionTypeAnnotation()
public void testEmitUnknownParamTypesAsAllType()
public void testOptionalTypesAnnotation()
public void testVariableArgumentsTypesAnnotation()
public void testTempConstructor()
public void testEnumAnnotation1()
public void testEnumAnnotation2()
private void assertPrettyPrint(String js, String expected)
private void assertTypeAnnotations(String js, String expected)
public void testSubtraction()
public void testFunctionWithCall()
public void testLineLength()
private void assertLineLength(String js, String expected)
public void testParsePrintParse()
private void testReparse(String code)
public void testDoLoopIECompatiblity()
public void testFunctionSafariCompatiblity()
public void testExponents()
private void assertPrintNumber(String expected, double number)
private void assertPrintNumber(String expected, int number)
public void testDirectEval()
public void testIndirectEval()
public void testFreeCall1()
public void testFreeCall2()
public void testFreeCall3()
public void testPrintScript()
public void testObjectLit()
public void testObjectLit2()
public void testObjectLit3()
public void testObjectLit4()
public void testGetter()
public void testSetter()
public void testNegCollapse()
public void testStrict()
public void testArrayLiteral()
public void testZero()
public void testUnicode()
public void testUnicodeKeyword()
public void testNumericKeys()
public void testIssue582()
public void testIssue601()
public void testIssue620()
public void testIssue5746867()
public void testCommaSpacing()
public void testManyCommas()
public void testManyAdds()
public void testMinusNegativeZero()
public void testStringEscapeSequences()