 InstrumentFunctions(AbstractCompiler compiler, FunctionNames functionNames, String templateFilename, String appNameStr, Readable readable)
 RemoveCallback(List<String> removable)
 InstrumentReturns(int functionId)
public void process(Node externs, Node root)
public void visit(NodeTraversal t, Node n, Node parent)
 void process(Node body)
public boolean shouldTraverse(NodeTraversal t, Node n, Node parent)
public void visit(NodeTraversal t, Node n, Node parent)
private Node newReportFunctionExitNode()
private boolean allPathsReturn(Node block)
public void visit(NodeTraversal t, Node n, Node parent)
AbstractCompiler compiler
FunctionNames functionNames
String templateFilename
String appNameStr
String initCodeSource
String definedFunctionName
String reportFunctionName
String reportFunctionExitName
String appNameSetter
List<String> declarationsToRemove
