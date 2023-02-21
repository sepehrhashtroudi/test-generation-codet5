 ScopedAliases(AbstractCompiler compiler, @Nullable PreprocessorSymbolTable preprocessorSymbolTable, AliasTransformationHandler transformationHandler)
 AliasedNode(Node aliasReference, Node aliasDefinition)
 AliasedTypeNode(Node typeReference, Node aliasDefinition, String aliasName)
public void process(Node externs, Node root)
public void hotSwapScript(Node root, Node originalRoot)
public void applyAlias()
public void applyAlias()
public void applyAlias()
 Collection<Node> getAliasDefinitionsInOrder()
private List<AliasUsage> getAliasUsages()
 List<Node> getScopeCalls()
 boolean hasErrors()
private boolean isCallToScopeMethod(Node n)
public void enterScope(NodeTraversal t)
public void exitScope(NodeTraversal t)
public final boolean shouldTraverse(NodeTraversal t, Node n, Node parent)
private SourcePosition<AliasTransformation> getSourceRegion(Node n)
private void report(NodeTraversal t, Node n, DiagnosticType error, String... arguments)
private void findAliases(NodeTraversal t)
private void findNamespaceShadows(NodeTraversal t)
private void renameNamespaceShadows(NodeTraversal t)
private void validateScopeCall(NodeTraversal t, Node n, Node parent)
public void visit(NodeTraversal t, Node n, Node parent)
private void fixTypeNode(Node typeNode)