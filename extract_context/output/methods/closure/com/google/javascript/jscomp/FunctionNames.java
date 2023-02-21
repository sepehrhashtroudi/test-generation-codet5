FunctionNames(AbstractCompiler compiler) { [EOL]     this.compiler = compiler; [EOL]     this.functionListExtractor = new FunctionListExtractor(functionMap); [EOL] } <line_num>: 54,57
FunctionRecord(int id, Node parent, String name) { [EOL]     this.id = id; [EOL]     this.parent = parent; [EOL]     this.name = name; [EOL] } <line_num>: 116,120
FunctionListExtractor(Map<Node, FunctionRecord> functionMap) { [EOL]     this.functionMap = functionMap; [EOL] } <line_num>: 127,129
FunctionExpressionNamer(Map<Node, FunctionRecord> functionMap) { [EOL]     this.functionMap = functionMap; [EOL] } <line_num>: 153,155
@Override [EOL] public void process(Node externs, Node root) { [EOL]     NodeTraversal.traverse(compiler, root, functionListExtractor); [EOL]     FunctionExpressionNamer namer = new FunctionExpressionNamer(functionMap); [EOL]     AnonymousFunctionNamingCallback namingCallback = new AnonymousFunctionNamingCallback(namer); [EOL]     NodeTraversal.traverse(compiler, root, namingCallback); [EOL] } <line_num>: 59,66
public Iterable<Node> getFunctionNodeList() { [EOL]     return functionMap.keySet(); [EOL] } <line_num>: 68,70
public int getFunctionId(Node f) { [EOL]     FunctionRecord record = functionMap.get(f); [EOL]     if (record != null) { [EOL]         return record.id; [EOL]     } else { [EOL]         return -1; [EOL]     } [EOL] } <line_num>: 72,79
public String getFunctionName(Node f) { [EOL]     FunctionRecord record = functionMap.get(f); [EOL]     if (record == null) { [EOL]         return null; [EOL]     } [EOL]     String str = record.name; [EOL]     if (str.isEmpty()) { [EOL]         str = "<anonymous>"; [EOL]     } [EOL]     Node parent = record.parent; [EOL]     if (parent != null) { [EOL]         str = getFunctionName(parent) + "::" + str; [EOL]     } [EOL]     str = str.replaceAll("::this\\.", "."); [EOL]     str = str.replaceAll("\\.\\.", "."); [EOL]     str = str.replaceFirst("^(<anonymous>::)*", ""); [EOL]     return str; [EOL] } <line_num>: 81,107
@Override [EOL] public void visit(NodeTraversal t, Node n, Node parent) { [EOL]     if (n.isFunction()) { [EOL]         Node functionNameNode = n.getFirstChild(); [EOL]         String functionName = functionNameNode.getString(); [EOL]         Node enclosingFunction = t.getEnclosingFunction(); [EOL]         functionMap.put(n, new FunctionRecord(nextId, enclosingFunction, functionName)); [EOL]         nextId++; [EOL]     } [EOL] } <line_num>: 131,143
@Override [EOL] public final String getName(Node node) { [EOL]     return extractor.getName(node); [EOL] } <line_num>: 157,160
@Override [EOL] public final void setFunctionName(String name, Node fnNode) { [EOL]     FunctionRecord record = functionMap.get(fnNode); [EOL]     assert (record != null); [EOL]     assert (record.name.isEmpty()); [EOL]     record.name = name; [EOL] } <line_num>: 162,168
@Override [EOL] public final String getCombinedName(String lhs, String rhs) { [EOL]     return lhs + DELIMITER + rhs; [EOL] } <line_num>: 170,173