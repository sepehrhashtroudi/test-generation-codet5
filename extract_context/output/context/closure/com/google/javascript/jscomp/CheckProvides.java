 CheckProvides(AbstractCompiler compiler, CheckLevel checkLevel)
 CheckProvidesCallback(CodingConvention convention)
public void process(Node externs, Node root)
public void hotSwapScript(Node scriptRoot, Node originalRoot)
public void visit(NodeTraversal t, Node n, Node parent)
private void visitFunctionNode(Node n, Node parent)
private void visitScriptNode(NodeTraversal t, Node n)
AbstractCompiler compiler
CheckLevel checkLevel
CodingConvention codingConvention
DiagnosticType MISSING_PROVIDE_WARNING=Optional[DiagnosticType.disabled("JSC_MISSING_PROVIDE", "missing goog.provide(''{0}'')")]
