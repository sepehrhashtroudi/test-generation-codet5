public PureFunctionIdentifier(AbstractCompiler compiler, DefinitionProvider definitionProvider)
 FunctionAnalyzer(boolean inExterns)
 FunctionInformation(boolean extern)
 Driver(AbstractCompiler compiler, String reportPath, boolean useNameReferenceGraph)
public void process(Node externsAst, Node srcAst)
 String getDebugReport()
private static Collection<Definition> getCallableDefinitions(DefinitionProvider definitionProvider, Node name)
private void propagateSideEffects()
private void markPureFunctionCalls()
public boolean shouldTraverse(NodeTraversal traversal, Node node, Node parent)
public void visit(NodeTraversal traversal, Node node, Node parent)
public void enterScope(NodeTraversal t)
public void exitScope(NodeTraversal t)
private void visitAssignmentOrUnaryOperator(FunctionInformation sideEffectInfo, Scope scope, Node op, Node lhs, Node rhs)
private void visitCall(FunctionInformation sideEffectInfo, Node node)
private void visitFunction(NodeTraversal traversal, Node node, Node parent, Node gramp)
private boolean isLocalValueType(JSType jstype, boolean recurse)
private void visitThrow(FunctionInformation sideEffectInfo)
private JSDocInfo getJSDocInfoForFunction(Node node, Node parent, Node gramp)
private boolean hasNoSideEffectsAnnotation(JSDocInfo docInfo)
private boolean hasSideEffectsThisAnnotation(JSDocInfo docInfo)
private boolean hasSideEffectsArgumentsAnnotation(JSDocInfo docInfo)
private static boolean isIncDec(Node n)
public boolean apply(Node value)
private static boolean isKnownLocalValue(final Node value)
public boolean traverseEdge(FunctionInformation callee, Node callSite, FunctionInformation caller)
private static Node getCallThisObject(Node callSite)
private static boolean isCallOrApply(Node callSite)
 void addTaintedLocalObject(Var var)
 void resetLocalVars()
public void blacklistLocal(Var var)
 boolean mayBePure()
 boolean mayHaveSideEffects()
 void setIsPure()
 void setTaintsGlobalState()
 void setTaintsThis()
 void setTaintsArguments()
 void setFunctionThrows()
 void setTaintsUnknown()
 void setTaintsReturn()
 boolean mutatesGlobalState()
 boolean mutatesThis()
 boolean functionThrows()
private void checkInvariant()
 void appendCall(Node callNode)
 List<Node> getCallsInFunctionBody()
public String toString()
public void process(Node externs, Node root)
