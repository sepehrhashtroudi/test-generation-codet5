Export(String symbolName, Node value) { [EOL]     this.symbolName = symbolName; [EOL]     this.value = value; [EOL] } <line_num>: 84,87
public SymbolExport(String symbolName, Node value) { [EOL]     super(symbolName, value); [EOL]     String qualifiedName = value.getQualifiedName(); [EOL]     if (qualifiedName != null) { [EOL]         mappedPaths.put(qualifiedName, symbolName); [EOL]     } [EOL] } <line_num>: 364,372
public PropertyExport(String exportPath, String symbolName, Node value) { [EOL]     super(symbolName, value); [EOL]     this.exportPath = exportPath; [EOL] } <line_num>: 386,390
ExternExportsPass(AbstractCompiler compiler) { [EOL]     this.exports = Lists.newArrayList(); [EOL]     this.compiler = compiler; [EOL]     this.definitionMap = Maps.newHashMap(); [EOL]     this.externsRoot = IR.block(); [EOL]     this.externsRoot.setIsSyntheticBlock(true); [EOL]     this.alreadyExportedPaths = Sets.newHashSet(); [EOL]     this.mappedPaths = Maps.newHashMap(); [EOL]     initExportMethods(); [EOL] } <line_num>: 422,432
void generateExterns() { [EOL]     appendExtern(getExportedPath(), getValue(value)); [EOL] } <line_num>: 93,95
abstract String getExportedPath(); <line_num>: 100,100
void appendExtern(String path, Node valueToExport) { [EOL]     List<String> pathPrefixes = computePathPrefixes(path); [EOL]     for (int i = 0; i < pathPrefixes.size(); ++i) { [EOL]         String pathPrefix = pathPrefixes.get(i); [EOL]         boolean isCompletePathPrefix = (i == pathPrefixes.size() - 1); [EOL]         boolean skipPathPrefix = pathPrefix.endsWith(".prototype") || (alreadyExportedPaths.contains(pathPrefix) && !isCompletePathPrefix); [EOL]         if (!skipPathPrefix) { [EOL]             Node initializer; [EOL]             if (isCompletePathPrefix && valueToExport != null) { [EOL]                 if (valueToExport.isFunction()) { [EOL]                     initializer = createExternFunction(valueToExport); [EOL]                 } else { [EOL]                     Preconditions.checkState(valueToExport.isObjectLit()); [EOL]                     initializer = createExternObjectLit(valueToExport); [EOL]                 } [EOL]             } else { [EOL]                 initializer = IR.empty(); [EOL]             } [EOL]             appendPathDefinition(pathPrefix, initializer); [EOL]         } [EOL]     } [EOL] } <line_num>: 113,157
private List<String> computePathPrefixes(String path) { [EOL]     List<String> pieces = Lists.newArrayList(path.split("\\.")); [EOL]     List<String> pathPrefixes = Lists.newArrayList(); [EOL]     for (int i = 0; i < pieces.size(); i++) { [EOL]         pathPrefixes.add(Joiner.on(".").join(Iterables.limit(pieces, i + 1))); [EOL]     } [EOL]     return pathPrefixes; [EOL] } <line_num>: 169,179
private void appendPathDefinition(String path, Node initializer) { [EOL]     Node pathDefinition; [EOL]     if (!path.contains(".")) { [EOL]         if (initializer.isEmpty()) { [EOL]             pathDefinition = IR.var(IR.name(path)); [EOL]         } else { [EOL]             pathDefinition = NodeUtil.newVarNode(path, initializer); [EOL]         } [EOL]     } else { [EOL]         Node qualifiedPath = NodeUtil.newQualifiedNameNode(compiler.getCodingConvention(), path); [EOL]         if (initializer.isEmpty()) { [EOL]             pathDefinition = NodeUtil.newExpr(qualifiedPath); [EOL]         } else { [EOL]             pathDefinition = NodeUtil.newExpr(IR.assign(qualifiedPath, initializer)); [EOL]         } [EOL]     } [EOL]     externsRoot.addChildToBack(pathDefinition); [EOL]     alreadyExportedPaths.add(path); [EOL] } <line_num>: 181,204
private Node createExternFunction(Node exportedFunction) { [EOL]     Node paramList = NodeUtil.getFunctionParameters(exportedFunction).cloneTree(); [EOL]     Node externFunction = IR.function(IR.name(""), paramList, IR.block()); [EOL]     checkForFunctionsWithUnknownTypes(exportedFunction); [EOL]     externFunction.setJSType(exportedFunction.getJSType()); [EOL]     return externFunction; [EOL] } <line_num>: 215,224
private Node createExternObjectLit(Node exportedObjectLit) { [EOL]     Node lit = IR.objectlit(); [EOL]     lit.setJSType(exportedObjectLit.getJSType()); [EOL]     lit.setJSDocInfo(new JSDocInfo()); [EOL]     int index = 1; [EOL]     for (Node child = exportedObjectLit.getFirstChild(); child != null; child = child.getNext()) { [EOL]         if (child.isStringKey()) { [EOL]             lit.addChildToBack(IR.propdef(IR.stringKey(child.getString()), IR.number(index++))); [EOL]         } [EOL]     } [EOL]     return lit; [EOL] } <line_num>: 231,252
private void checkForFunctionsWithUnknownTypes(Node function) { [EOL]     Preconditions.checkArgument(function.isFunction()); [EOL]     FunctionType functionType = JSType.toMaybeFunctionType(function.getJSType()); [EOL]     if (functionType == null) { [EOL]         return; [EOL]     } [EOL]     JSDocInfo functionJSDocInfo = functionType.getJSDocInfo(); [EOL]     JSType returnType = functionType.getReturnType(); [EOL]     if (!functionType.isConstructor() && (returnType == null || returnType.isUnknownType())) { [EOL]         reportUnknownReturnType(function); [EOL]     } [EOL]     Node astParameterIterator = NodeUtil.getFunctionParameters(function).getFirstChild(); [EOL]     Node typeParameterIterator = functionType.getParametersNode().getFirstChild(); [EOL]     while (astParameterIterator != null) { [EOL]         JSType parameterType = typeParameterIterator.getJSType(); [EOL]         if (parameterType == null || parameterType.isUnknownType()) { [EOL]             reportUnknownParameterType(function, astParameterIterator); [EOL]         } [EOL]         astParameterIterator = astParameterIterator.getNext(); [EOL]         typeParameterIterator = typeParameterIterator.getNext(); [EOL]     } [EOL] } <line_num>: 258,306
private void reportUnknownParameterType(Node function, Node parameter) { [EOL]     compiler.report(JSError.make(NodeUtil.getSourceName(function), parameter, CheckLevel.WARNING, EXPORTED_FUNCTION_UNKNOWN_PARAMETER_TYPE, NodeUtil.getFunctionName(function), parameter.getString())); [EOL] } <line_num>: 308,313
private void reportUnknownReturnType(Node function) { [EOL]     compiler.report(JSError.make(NodeUtil.getSourceName(function), function, CheckLevel.WARNING, EXPORTED_FUNCTION_UNKNOWN_RETURN_TYPE, NodeUtil.getFunctionName(function))); [EOL] } <line_num>: 315,319
protected Node getValue(Node qualifiedNameNode) { [EOL]     String qualifiedName = value.getQualifiedName(); [EOL]     if (qualifiedName == null) { [EOL]         return null; [EOL]     } [EOL]     Node definitionParent = definitionMap.get(qualifiedName); [EOL]     if (definitionParent == null) { [EOL]         return null; [EOL]     } [EOL]     Node definition; [EOL]     switch(definitionParent.getType()) { [EOL]         case Token.ASSIGN: [EOL]             definition = definitionParent.getLastChild(); [EOL]             break; [EOL]         case Token.VAR: [EOL]             definition = definitionParent.getLastChild().getLastChild(); [EOL]             break; [EOL]         default: [EOL]             return null; [EOL]     } [EOL]     if (!definition.isFunction() && !definition.isObjectLit()) { [EOL]         return null; [EOL]     } [EOL]     return definition; [EOL] } <line_num>: 326,356
@Override [EOL] String getExportedPath() { [EOL]     return symbolName; [EOL] } <line_num>: 374,377
@Override [EOL] String getExportedPath() { [EOL]     List<String> pieces = Lists.newArrayList(exportPath.split("\\.")); [EOL]     for (int i = pieces.size(); i > 0; i--) { [EOL]         String cPath = Joiner.on(".").join(Iterables.limit(pieces, i)); [EOL]         if (mappedPaths.containsKey(cPath)) { [EOL]             String newPath = mappedPaths.get(cPath); [EOL]             if (i < pieces.size()) { [EOL]                 newPath += "." + Joiner.on(".").join(Iterables.skip(pieces, i)); [EOL]             } [EOL]             return newPath + "." + symbolName; [EOL]         } [EOL]     } [EOL]     return exportPath + "." + symbolName; [EOL] } <line_num>: 392,416
private void initExportMethods() { [EOL]     exportSymbolFunctionNames = Lists.newArrayList(); [EOL]     exportPropertyFunctionNames = Lists.newArrayList(); [EOL]     CodingConvention convention = compiler.getCodingConvention(); [EOL]     exportSymbolFunctionNames.add(convention.getExportSymbolFunction()); [EOL]     exportPropertyFunctionNames.add(convention.getExportPropertyFunction()); [EOL]     exportSymbolFunctionNames.add("google_exportSymbol"); [EOL]     exportPropertyFunctionNames.add("google_exportProperty"); [EOL] } <line_num>: 434,448
@Override [EOL] public int compare(Export e1, Export e2) { [EOL]     return e1.getExportedPath().compareTo(e2.getExportedPath()); [EOL] } <line_num>: 459,462
@Override [EOL] public void process(Node externs, Node root) { [EOL]     new NodeTraversal(compiler, this).traverse(root); [EOL]     Set<Export> sorted = new TreeSet<Export>(new Comparator<Export>() { [EOL]  [EOL]         @Override [EOL]         public int compare(Export e1, Export e2) { [EOL]             return e1.getExportedPath().compareTo(e2.getExportedPath()); [EOL]         } [EOL]     }); [EOL]     sorted.addAll(exports); [EOL]     for (Export export : sorted) { [EOL]         export.generateExterns(); [EOL]     } [EOL] } <line_num>: 450,470
public String getGeneratedExterns() { [EOL]     CodePrinter.Builder builder = new CodePrinter.Builder(externsRoot).setPrettyPrint(true).setOutputTypes(true); [EOL]     return builder.build(); [EOL] } <line_num>: 475,480
@Override [EOL] public void visit(NodeTraversal t, Node n, Node parent) { [EOL]     switch(n.getType()) { [EOL]         case Token.NAME: [EOL]         case Token.GETPROP: [EOL]             String name = n.getQualifiedName(); [EOL]             if (name == null) { [EOL]                 return; [EOL]             } [EOL]             if (parent.isAssign() || parent.isVar()) { [EOL]                 definitionMap.put(name, parent); [EOL]             } [EOL]             if (!parent.isCall()) { [EOL]                 return; [EOL]             } [EOL]             if (exportPropertyFunctionNames.contains(name)) { [EOL]                 handlePropertyExport(parent); [EOL]             } [EOL]             if (exportSymbolFunctionNames.contains(name)) { [EOL]                 handleSymbolExport(parent); [EOL]             } [EOL]     } [EOL] } <line_num>: 482,511
private void handleSymbolExport(Node parent) { [EOL]     if (parent.getChildCount() != 3) { [EOL]         return; [EOL]     } [EOL]     Node thisNode = parent.getFirstChild(); [EOL]     Node nameArg = thisNode.getNext(); [EOL]     Node valueArg = nameArg.getNext(); [EOL]     if (!nameArg.isString()) { [EOL]         return; [EOL]     } [EOL]     this.exports.add(new SymbolExport(nameArg.getString(), valueArg)); [EOL] } <line_num>: 513,532
private void handlePropertyExport(Node parent) { [EOL]     if (parent.getChildCount() != 4) { [EOL]         return; [EOL]     } [EOL]     Node thisNode = parent.getFirstChild(); [EOL]     Node objectArg = thisNode.getNext(); [EOL]     Node nameArg = objectArg.getNext(); [EOL]     Node valueArg = nameArg.getNext(); [EOL]     if (!objectArg.isQualifiedName()) { [EOL]         return; [EOL]     } [EOL]     if (!nameArg.isString()) { [EOL]         return; [EOL]     } [EOL]     this.exports.add(new PropertyExport(objectArg.getQualifiedName(), nameArg.getString(), valueArg)); [EOL] } <line_num>: 534,561
