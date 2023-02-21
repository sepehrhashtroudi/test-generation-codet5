GetReplacementSideEffectSubexpressions(AbstractCompiler compiler, List<Node> replacements) { [EOL]     this.compiler = compiler; [EOL]     this.replacements = replacements; [EOL] } <line_num>: 100,104
GatherSideEffectSubexpressionsCallback(AbstractCompiler compiler, SideEffectAccumulator accumulator) { [EOL]     this.compiler = compiler; [EOL]     this.accumulator = accumulator; [EOL] } <line_num>: 199,203
boolean classDefiningCallsHaveSideEffects(); <line_num>: 50,50
void keepSubTree(Node original); <line_num>: 57,57
void keepSimplifiedShortCircuitExpression(Node original); <line_num>: 66,66
void keepSimplifiedHookExpression(Node hook, boolean thenHasSideEffects, boolean elseHasSideEffects); <line_num>: 77,79
@Override [EOL] public boolean classDefiningCallsHaveSideEffects() { [EOL]     return true; [EOL] } <line_num>: 106,109
@Override [EOL] public void keepSubTree(Node original) { [EOL]     if (original.getParent() != null) { [EOL]         original.detachFromParent(); [EOL]     } [EOL]     replacements.add(original); [EOL] } <line_num>: 111,117
@Override [EOL] public void keepSimplifiedShortCircuitExpression(Node original) { [EOL]     Preconditions.checkArgument((original.isAnd()) || (original.isOr()), "Expected: AND or OR, Got: %s", Token.name(original.getType())); [EOL]     Node left = original.getFirstChild(); [EOL]     Node right = left.getNext(); [EOL]     Node simplifiedRight = simplifyShortCircuitBranch(right); [EOL]     original.detachChildren(); [EOL]     original.addChildToBack(left); [EOL]     original.addChildToBack(simplifiedRight); [EOL]     keepSubTree(original); [EOL] } <line_num>: 119,131
@Override [EOL] public void keepSimplifiedHookExpression(Node hook, boolean thenHasSideEffects, boolean elseHasSideEffects) { [EOL]     Preconditions.checkArgument(hook.isHook(), "Expected: HOOK, Got: %s", Token.name(hook.getType())); [EOL]     Node condition = hook.getFirstChild(); [EOL]     Node thenBranch = condition.getNext(); [EOL]     Node elseBranch = thenBranch.getNext(); [EOL]     if (thenHasSideEffects && elseHasSideEffects) { [EOL]         hook.detachChildren(); [EOL]         hook.addChildToBack(condition); [EOL]         hook.addChildToBack(simplifyShortCircuitBranch(thenBranch)); [EOL]         hook.addChildToBack(simplifyShortCircuitBranch(elseBranch)); [EOL]         keepSubTree(hook); [EOL]     } else if (thenHasSideEffects || elseHasSideEffects) { [EOL]         int type = thenHasSideEffects ? Token.AND : Token.OR; [EOL]         Node body = thenHasSideEffects ? thenBranch : elseBranch; [EOL]         Node simplified = new Node(type, condition.detachFromParent(), simplifyShortCircuitBranch(body)).copyInformationFrom(hook); [EOL]         keepSubTree(simplified); [EOL]     } else { [EOL]         throw new IllegalArgumentException("keepSimplifiedHookExpression must keep at least 1 branch"); [EOL]     } [EOL] } <line_num>: 133,160
private Node simplifyShortCircuitBranch(Node node) { [EOL]     List<Node> parts = Lists.newArrayList(); [EOL]     NodeTraversal.traverse(compiler, node, new GatherSideEffectSubexpressionsCallback(compiler, new GetReplacementSideEffectSubexpressions(compiler, parts))); [EOL]     Node ret = null; [EOL]     for (Node part : parts) { [EOL]         if (ret != null) { [EOL]             ret = IR.comma(ret, part).srcref(node); [EOL]         } else { [EOL]             ret = part; [EOL]         } [EOL]     } [EOL]     if (ret == null) { [EOL]         throw new IllegalArgumentException("expected at least one side effect subexpression in short " + "circuit branch."); [EOL]     } [EOL]     return ret; [EOL] } <line_num>: 162,186
private boolean isClassDefiningCall(Node callNode) { [EOL]     SubclassRelationship classes = compiler.getCodingConvention().getClassesDefinedByCall(callNode); [EOL]     return classes != null; [EOL] } <line_num>: 209,213
@Override [EOL] public boolean shouldTraverse(NodeTraversal traversal, Node node, Node parent) { [EOL]     if (FORBIDDEN_TYPES.contains(node.getType()) || NodeUtil.isControlStructure(node)) { [EOL]         throw new IllegalArgumentException(Token.name(node.getType()) + " nodes are not supported."); [EOL]     } [EOL]     if (node.isFunction()) { [EOL]         return false; [EOL]     } [EOL]     if (node.isHook()) { [EOL]         return processHook(node); [EOL]     } [EOL]     if ((node.isAnd()) || (node.isOr())) { [EOL]         return processShortCircuitExpression(node); [EOL]     } [EOL]     if (!NodeUtil.nodeTypeMayHaveSideEffects(node, compiler)) { [EOL]         return true; [EOL]     } else { [EOL]         if (node.isCall()) { [EOL]             return processFunctionCall(node); [EOL]         } else if (node.isNew()) { [EOL]             return processConstructorCall(node); [EOL]         } else { [EOL]             accumulator.keepSubTree(node); [EOL]             return false; [EOL]         } [EOL]     } [EOL] } <line_num>: 227,266
boolean processShortCircuitExpression(Node node) { [EOL]     Preconditions.checkArgument((node.isAnd()) || (node.isOr()), "Expected: AND or OR, Got: %s", Token.name(node.getType())); [EOL]     Node left = node.getFirstChild(); [EOL]     Node right = left.getNext(); [EOL]     if (NodeUtil.mayHaveSideEffects(right, compiler)) { [EOL]         accumulator.keepSimplifiedShortCircuitExpression(node); [EOL]         return false; [EOL]     } else { [EOL]         return true; [EOL]     } [EOL] } <line_num>: 273,288
boolean processHook(Node node) { [EOL]     Preconditions.checkArgument(node.isHook(), "Expected: HOOK, Got: %s", Token.name(node.getType())); [EOL]     Node condition = node.getFirstChild(); [EOL]     Node ifBranch = condition.getNext(); [EOL]     Node elseBranch = ifBranch.getNext(); [EOL]     boolean thenHasSideEffects = NodeUtil.mayHaveSideEffects(ifBranch, compiler); [EOL]     boolean elseHasSideEffects = NodeUtil.mayHaveSideEffects(elseBranch, compiler); [EOL]     if (thenHasSideEffects || elseHasSideEffects) { [EOL]         accumulator.keepSimplifiedHookExpression(node, thenHasSideEffects, elseHasSideEffects); [EOL]         return false; [EOL]     } else { [EOL]         return true; [EOL]     } [EOL] } <line_num>: 295,313
boolean processFunctionCall(Node node) { [EOL]     Preconditions.checkArgument(node.isCall(), "Expected: CALL, Got: %s", Token.name(node.getType())); [EOL]     Node functionName = node.getFirstChild(); [EOL]     if (functionName.isName() || functionName.isGetProp()) { [EOL]         if (!accumulator.classDefiningCallsHaveSideEffects() && isClassDefiningCall(node)) { [EOL]             return true; [EOL]         } [EOL]     } [EOL]     if (!NodeUtil.functionCallHasSideEffects(node)) { [EOL]         return true; [EOL]     } [EOL]     accumulator.keepSubTree(node); [EOL]     return false; [EOL] } <line_num>: 320,340
boolean processConstructorCall(Node node) { [EOL]     Preconditions.checkArgument(node.isNew(), "Expected: NEW, Got: %s", Token.name(node.getType())); [EOL]     if (!NodeUtil.constructorCallHasSideEffects(node)) { [EOL]         return true; [EOL]     } [EOL]     accumulator.keepSubTree(node); [EOL]     return false; [EOL] } <line_num>: 347,359
@Override [EOL] public void visit(NodeTraversal traversal, Node node, Node parent) { [EOL] } <line_num>: 361,362
