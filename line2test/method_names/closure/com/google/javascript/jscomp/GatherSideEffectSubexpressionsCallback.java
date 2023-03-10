 GetReplacementSideEffectSubexpressions(AbstractCompiler compiler, List<Node> replacements)
 GatherSideEffectSubexpressionsCallback(AbstractCompiler compiler, SideEffectAccumulator accumulator)
 boolean classDefiningCallsHaveSideEffects()
 void keepSubTree(Node original)
 void keepSimplifiedShortCircuitExpression(Node original)
 void keepSimplifiedHookExpression(Node hook, boolean thenHasSideEffects, boolean elseHasSideEffects)
public boolean classDefiningCallsHaveSideEffects()
public void keepSubTree(Node original)
public void keepSimplifiedShortCircuitExpression(Node original)
public void keepSimplifiedHookExpression(Node hook, boolean thenHasSideEffects, boolean elseHasSideEffects)
private Node simplifyShortCircuitBranch(Node node)
private boolean isClassDefiningCall(Node callNode)
public boolean shouldTraverse(NodeTraversal traversal, Node node, Node parent)
 boolean processShortCircuitExpression(Node node)
 boolean processHook(Node node)
 boolean processFunctionCall(Node node)
 boolean processConstructorCall(Node node)
public void visit(NodeTraversal traversal, Node node, Node parent)
