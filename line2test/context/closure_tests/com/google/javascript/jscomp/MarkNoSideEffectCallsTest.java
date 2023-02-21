public MarkNoSideEffectCallsTest()
 NoSideEffectCallEnumerator(Compiler compiler)
protected int getNumRepetitions()
protected void tearDown() throws Exception
public void testFunctionAnnotation() throws Exception
public void testNamespaceAnnotation() throws Exception
public void testConstructorAnnotation() throws Exception
public void testMultipleDefinition() throws Exception
public void testAssignNoFunction() throws Exception
public void testPrototype() throws Exception
public void testAnnotationInExterns() throws Exception
public void testNamespaceAnnotationInExterns() throws Exception
public void testOverrideDefinitionInSource() throws Exception
public void testApply1() throws Exception
public void testApply2() throws Exception
public void testCall1() throws Exception
public void testCall2() throws Exception
public void testInvalidAnnotation1() throws Exception
public void testInvalidAnnotation2() throws Exception
public void testInvalidAnnotation3() throws Exception
public void testInvalidAnnotation4() throws Exception
public void testInvalidAnnotation5() throws Exception
 void testMarkCalls(String source, List<String> expected)
 void testMarkCalls(String extraExterns, String source, List<String> expected)
protected CompilerPass getProcessor(Compiler compiler)
public void process(Node externs, Node root)
public void visit(NodeTraversal t, Node n, Node parent)
List<String> noSideEffectCalls=Optional[Lists.newArrayList()]
String kExterns=Optional["function externSef1(){}" + "/**@nosideeffects*/function externNsef1(){}" + "var externSef2 = function(){};" + "/**@nosideeffects*/var externNsef2 = function(){};" + "var externNsef3 = /**@nosideeffects*/function(){};" + "var externObj;" + "externObj.sef1 = function(){};" + "/**@nosideeffects*/externObj.nsef1 = function(){};" + "externObj.nsef2 = /**@nosideeffects*/function(){};" + "externObj.sef2;" + "/**@nosideeffects*/externObj.nsef3;"]
