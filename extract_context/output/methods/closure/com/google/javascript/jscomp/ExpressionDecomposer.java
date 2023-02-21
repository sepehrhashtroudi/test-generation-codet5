public ExpressionDecomposer(AbstractCompiler compiler, Supplier<String> safeNameIdSupplier, Set<String> constNames) { [EOL]     Preconditions.checkNotNull(compiler); [EOL]     Preconditions.checkNotNull(safeNameIdSupplier); [EOL]     Preconditions.checkNotNull(constNames); [EOL]     this.compiler = compiler; [EOL]     this.safeNameIdSupplier = safeNameIdSupplier; [EOL]     this.knownConstants = constNames; [EOL] } <line_num>: 58,68
void maybeExposeExpression(Node expression) { [EOL]     int i = 0; [EOL]     while (DecompositionType.DECOMPOSABLE == canExposeExpression(expression)) { [EOL]         exposeExpression(expression); [EOL]         i++; [EOL]         if (i > MAX_INTERATIONS) { [EOL]             throw new IllegalStateException("DecomposeExpression depth exceeded on :\n" + expression.toStringTree()); [EOL]         } [EOL]     } [EOL] } <line_num>: 78,90
void exposeExpression(Node expression) { [EOL]     Node expressionRoot = findExpressionRoot(expression); [EOL]     Preconditions.checkState(expressionRoot != null); [EOL]     exposeExpression(expressionRoot, expression); [EOL]     compiler.reportCodeChange(); [EOL] } <line_num>: 97,102
void moveExpression(Node expression) { [EOL]     String resultName = getResultValueName(); [EOL]     Node injectionPoint = findInjectionPoint(expression); [EOL]     Preconditions.checkNotNull(injectionPoint); [EOL]     Node injectionPointParent = injectionPoint.getParent(); [EOL]     Preconditions.checkNotNull(injectionPointParent); [EOL]     Preconditions.checkState(NodeUtil.isStatementBlock(injectionPointParent)); [EOL]     Node expressionParent = expression.getParent(); [EOL]     expressionParent.replaceChild(expression, IR.name(resultName)); [EOL]     Node newExpressionRoot = NodeUtil.newVarNode(resultName, expression); [EOL]     injectionPointParent.addChildBefore(newExpressionRoot, injectionPoint); [EOL]     compiler.reportCodeChange(); [EOL] } <line_num>: 112,129
private void exposeExpression(Node expressionRoot, Node subExpression) { [EOL]     Node nonconditionalExpr = findNonconditionalParent(subExpression, expressionRoot); [EOL]     boolean hasFollowingSideEffects = NodeUtil.mayHaveSideEffects(nonconditionalExpr, compiler); [EOL]     Node exprInjectionPoint = findInjectionPoint(nonconditionalExpr); [EOL]     DecompositionState state = new DecompositionState(); [EOL]     state.sideEffects = hasFollowingSideEffects; [EOL]     state.extractBeforeStatement = exprInjectionPoint; [EOL]     for (Node grandchild = null, child = nonconditionalExpr, parent = child.getParent(); parent != expressionRoot; grandchild = child, child = parent, parent = child.getParent()) { [EOL]         int parentType = parent.getType(); [EOL]         Preconditions.checkState(!isConditionalOp(parent) || child == parent.getFirstChild()); [EOL]         if (parentType == Token.ASSIGN) { [EOL]             if (isSafeAssign(parent, state.sideEffects)) { [EOL]             } else { [EOL]                 Node left = parent.getFirstChild(); [EOL]                 int type = left.getType(); [EOL]                 if (left != child) { [EOL]                     Preconditions.checkState(NodeUtil.isGet(left)); [EOL]                     if (type == Token.GETELEM) { [EOL]                         decomposeSubExpressions(left.getLastChild(), null, state); [EOL]                     } [EOL]                     decomposeSubExpressions(left.getFirstChild(), null, state); [EOL]                 } [EOL]             } [EOL]         } else if (parentType == Token.CALL && NodeUtil.isGet(parent.getFirstChild())) { [EOL]             Node functionExpression = parent.getFirstChild(); [EOL]             decomposeSubExpressions(functionExpression.getNext(), child, state); [EOL]             if (isExpressionTreeUnsafe(functionExpression, state.sideEffects) && functionExpression.getFirstChild() != grandchild) { [EOL]                 Preconditions.checkState(allowObjectCallDecomposing(), "Object method calls can not be decomposed."); [EOL]                 state.sideEffects = true; [EOL]                 Node replacement = rewriteCallExpression(parent, state); [EOL]                 parent = replacement; [EOL]             } [EOL]         } else if (parentType == Token.OBJECTLIT) { [EOL]             decomposeObjectLiteralKeys(parent.getFirstChild(), child, state); [EOL]         } else { [EOL]             decomposeSubExpressions(parent.getFirstChild(), child, state); [EOL]         } [EOL]     } [EOL]     if (nonconditionalExpr == subExpression) { [EOL]     } else { [EOL]         Node parent = nonconditionalExpr.getParent(); [EOL]         boolean needResult = !parent.isExprResult(); [EOL]         Node extractedConditional = extractConditional(nonconditionalExpr, exprInjectionPoint, needResult); [EOL]     } [EOL] } <line_num>: 146,236
private static boolean allowObjectCallDecomposing() { [EOL]     return false; [EOL] } <line_num>: 238,240
private boolean maybeExternMethod(Node node) { [EOL]     return true; [EOL] } <line_num>: 245,248
private static Node findNonconditionalParent(Node subExpression, Node expressionRoot) { [EOL]     Node result = subExpression; [EOL]     for (Node child = subExpression, parent = child.getParent(); parent != expressionRoot; child = parent, parent = child.getParent()) { [EOL]         if (isConditionalOp(parent)) { [EOL]             if (child != parent.getFirstChild()) { [EOL]                 result = parent; [EOL]             } [EOL]         } [EOL]     } [EOL]     return result; [EOL] } <line_num>: 254,271
private void decomposeObjectLiteralKeys(Node key, Node stopNode, DecompositionState state) { [EOL]     if (key == null || key == stopNode) { [EOL]         return; [EOL]     } [EOL]     decomposeObjectLiteralKeys(key.getNext(), stopNode, state); [EOL]     decomposeSubExpressions(key.getFirstChild(), stopNode, state); [EOL] } <line_num>: 288,295
private void decomposeSubExpressions(Node n, Node stopNode, DecompositionState state) { [EOL]     if (n == null || n == stopNode) { [EOL]         return; [EOL]     } [EOL]     Preconditions.checkState(!NodeUtil.isObjectLitKey(n, n.getParent())); [EOL]     decomposeSubExpressions(n.getNext(), stopNode, state); [EOL]     if (isExpressionTreeUnsafe(n, state.sideEffects)) { [EOL]         state.sideEffects = true; [EOL]         state.extractBeforeStatement = extractExpression(n, state.extractBeforeStatement); [EOL]     } [EOL] } <line_num>: 301,326
private Node extractConditional(Node expr, Node injectionPoint, boolean needResult) { [EOL]     Node parent = expr.getParent(); [EOL]     String tempName = getTempValueName(); [EOL]     Node first = expr.getFirstChild(); [EOL]     Node second = first.getNext(); [EOL]     Node last = expr.getLastChild(); [EOL]     expr.detachChildren(); [EOL]     Node cond = null; [EOL]     Node trueExpr = IR.block().srcref(expr); [EOL]     Node falseExpr = IR.block().srcref(expr); [EOL]     switch(expr.getType()) { [EOL]         case Token.HOOK: [EOL]             cond = first; [EOL]             trueExpr.addChildToFront(NodeUtil.newExpr(buildResultExpression(second, needResult, tempName))); [EOL]             falseExpr.addChildToFront(NodeUtil.newExpr(buildResultExpression(last, needResult, tempName))); [EOL]             break; [EOL]         case Token.AND: [EOL]             cond = buildResultExpression(first, needResult, tempName); [EOL]             trueExpr.addChildToFront(NodeUtil.newExpr(buildResultExpression(last, needResult, tempName))); [EOL]             break; [EOL]         case Token.OR: [EOL]             cond = buildResultExpression(first, needResult, tempName); [EOL]             falseExpr.addChildToFront(NodeUtil.newExpr(buildResultExpression(last, needResult, tempName))); [EOL]             break; [EOL]         default: [EOL]             throw new IllegalStateException("Unexpected."); [EOL]     } [EOL]     Node ifNode; [EOL]     if (falseExpr.hasChildren()) { [EOL]         ifNode = IR.ifNode(cond, trueExpr, falseExpr); [EOL]     } else { [EOL]         ifNode = IR.ifNode(cond, trueExpr); [EOL]     } [EOL]     ifNode.copyInformationFrom(expr); [EOL]     if (needResult) { [EOL]         Node tempVarNode = NodeUtil.newVarNode(tempName, null).copyInformationFromForTree(expr); [EOL]         Node injectionPointParent = injectionPoint.getParent(); [EOL]         injectionPointParent.addChildBefore(tempVarNode, injectionPoint); [EOL]         injectionPointParent.addChildAfter(ifNode, tempVarNode); [EOL]         Node replacementValueNode = IR.name(tempName); [EOL]         parent.replaceChild(expr, replacementValueNode); [EOL]     } else { [EOL]         Preconditions.checkArgument(parent.isExprResult()); [EOL]         Node gramps = parent.getParent(); [EOL]         gramps.replaceChild(parent, ifNode); [EOL]     } [EOL]     return ifNode; [EOL] } <line_num>: 337,407
private static Node buildResultExpression(Node expr, boolean needResult, String tempName) { [EOL]     if (needResult) { [EOL]         return IR.assign(IR.name(tempName), expr).srcrefTree(expr); [EOL]     } else { [EOL]         return expr; [EOL]     } [EOL] } <line_num>: 418,427
private boolean isConstantName(Node n, Set<String> knownConstants) { [EOL]     return n.isName() && (NodeUtil.isConstantName(n) || knownConstants.contains(n.getString())); [EOL] } <line_num>: 429,433
private Node extractExpression(Node expr, Node injectionPoint) { [EOL]     Node parent = expr.getParent(); [EOL]     boolean isLhsOfAssignOp = NodeUtil.isAssignmentOp(parent) && !parent.isAssign() && parent.getFirstChild() == expr; [EOL]     Node firstExtractedNode = null; [EOL]     if (isLhsOfAssignOp && NodeUtil.isGet(expr)) { [EOL]         for (Node n : expr.children()) { [EOL]             if (!n.isString() && !isConstantName(n, knownConstants)) { [EOL]                 Node extractedNode = extractExpression(n, injectionPoint); [EOL]                 if (firstExtractedNode == null) { [EOL]                     firstExtractedNode = extractedNode; [EOL]                 } [EOL]             } [EOL]         } [EOL]     } [EOL]     String tempName = getTempConstantValueName(); [EOL]     Node replacementValueNode = IR.name(tempName).srcref(expr); [EOL]     Node tempNameValue; [EOL]     if (isLhsOfAssignOp) { [EOL]         Preconditions.checkState(expr.isName() || NodeUtil.isGet(expr)); [EOL]         Node opNode = new Node(NodeUtil.getOpFromAssignmentOp(parent)).copyInformationFrom(parent); [EOL]         Node rightOperand = parent.getLastChild(); [EOL]         parent.setType(Token.ASSIGN); [EOL]         parent.replaceChild(rightOperand, opNode); [EOL]         opNode.addChildToFront(replacementValueNode); [EOL]         opNode.addChildToBack(rightOperand); [EOL]         tempNameValue = expr.cloneTree(); [EOL]     } else { [EOL]         parent.replaceChild(expr, replacementValueNode); [EOL]         tempNameValue = expr; [EOL]     } [EOL]     Node tempVarNode = NodeUtil.newVarNode(tempName, tempNameValue); [EOL]     Node injectionPointParent = injectionPoint.getParent(); [EOL]     injectionPointParent.addChildBefore(tempVarNode, injectionPoint); [EOL]     if (firstExtractedNode == null) { [EOL]         firstExtractedNode = tempVarNode; [EOL]     } [EOL]     return firstExtractedNode; [EOL] } <line_num>: 441,509
private Node rewriteCallExpression(Node call, DecompositionState state) { [EOL]     Preconditions.checkArgument(call.isCall()); [EOL]     Node first = call.getFirstChild(); [EOL]     Preconditions.checkArgument(NodeUtil.isGet(first)); [EOL]     Node getVarNode = extractExpression(first, state.extractBeforeStatement); [EOL]     state.extractBeforeStatement = getVarNode; [EOL]     Node getExprNode = getVarNode.getFirstChild().getFirstChild(); [EOL]     Preconditions.checkArgument(NodeUtil.isGet(getExprNode)); [EOL]     Node thisVarNode = extractExpression(getExprNode.getFirstChild(), state.extractBeforeStatement); [EOL]     state.extractBeforeStatement = thisVarNode; [EOL]     Node thisNameNode = thisVarNode.getFirstChild(); [EOL]     Node functionNameNode = getVarNode.getFirstChild(); [EOL]     Node newCall = IR.call(IR.getprop(functionNameNode.cloneNode(), IR.string("call")), thisNameNode.cloneNode()).srcref(call); [EOL]     call.removeFirstChild(); [EOL]     if (call.hasChildren()) { [EOL]         newCall.addChildrenToBack(call.removeChildren()); [EOL]     } [EOL]     Node callParent = call.getParent(); [EOL]     callParent.replaceChild(call, newCall); [EOL]     return newCall; [EOL] } <line_num>: 521,570
@VisibleForTesting [EOL] public void setTempNamePrefix(String prefix) { [EOL]     this.tempNamePrefix = prefix; [EOL] } <line_num>: 578,581
private String getTempValueName() { [EOL]     return tempNamePrefix + ContextualRenamer.UNIQUE_ID_SEPARATOR + safeNameIdSupplier.get(); [EOL] } <line_num>: 586,589
@VisibleForTesting [EOL] public void setResultNamePrefix(String prefix) { [EOL]     this.resultNamePrefix = prefix; [EOL] } <line_num>: 594,597
private String getResultValueName() { [EOL]     return resultNamePrefix + ContextualRenamer.UNIQUE_ID_SEPARATOR + safeNameIdSupplier.get(); [EOL] } <line_num>: 602,605
private String getTempConstantValueName() { [EOL]     String name = tempNamePrefix + "_const" + ContextualRenamer.UNIQUE_ID_SEPARATOR + safeNameIdSupplier.get(); [EOL]     this.knownConstants.add(name); [EOL]     return name; [EOL] } <line_num>: 610,616
static Node findInjectionPoint(Node subExpression) { [EOL]     Node expressionRoot = findExpressionRoot(subExpression); [EOL]     Preconditions.checkNotNull(expressionRoot); [EOL]     Node injectionPoint = expressionRoot; [EOL]     Node parent = injectionPoint.getParent(); [EOL]     while (parent.isLabel()) { [EOL]         injectionPoint = parent; [EOL]         parent = injectionPoint.getParent(); [EOL]     } [EOL]     Preconditions.checkState(NodeUtil.isStatementBlock(injectionPoint.getParent())); [EOL]     return injectionPoint; [EOL] } <line_num>: 622,637
private static boolean isConditionalOp(Node n) { [EOL]     switch(n.getType()) { [EOL]         case Token.HOOK: [EOL]         case Token.AND: [EOL]         case Token.OR: [EOL]             return true; [EOL]         default: [EOL]             return false; [EOL]     } [EOL] } <line_num>: 642,651
static Node findExpressionRoot(Node subExpression) { [EOL]     Node child = subExpression; [EOL]     for (Node parent : child.getAncestors()) { [EOL]         int parentType = parent.getType(); [EOL]         switch(parentType) { [EOL]             case Token.EXPR_RESULT: [EOL]             case Token.IF: [EOL]             case Token.SWITCH: [EOL]             case Token.RETURN: [EOL]             case Token.VAR: [EOL]                 Preconditions.checkState(child == parent.getFirstChild()); [EOL]                 return parent; [EOL]             case Token.SCRIPT: [EOL]             case Token.BLOCK: [EOL]             case Token.LABEL: [EOL]             case Token.CASE: [EOL]             case Token.DEFAULT_CASE: [EOL]                 return null; [EOL]         } [EOL]         child = parent; [EOL]     } [EOL]     throw new IllegalStateException("Unexpected AST structure."); [EOL] } <line_num>: 658,686
DecompositionType canExposeExpression(Node subExpression) { [EOL]     Node expressionRoot = findExpressionRoot(subExpression); [EOL]     if (expressionRoot != null) { [EOL]         return isSubexpressionMovable(expressionRoot, subExpression); [EOL]     } [EOL]     return DecompositionType.UNDECOMPOSABLE; [EOL] } <line_num>: 713,719
private DecompositionType isSubexpressionMovable(Node expressionRoot, Node subExpression) { [EOL]     boolean requiresDecomposition = false; [EOL]     boolean seenSideEffects = NodeUtil.mayHaveSideEffects(subExpression, compiler); [EOL]     Node child = subExpression; [EOL]     for (Node parent : child.getAncestors()) { [EOL]         if (parent == expressionRoot) { [EOL]             return requiresDecomposition ? DecompositionType.DECOMPOSABLE : DecompositionType.MOVABLE; [EOL]         } [EOL]         int parentType = parent.getType(); [EOL]         if (isConditionalOp(parent)) { [EOL]             if (child != parent.getFirstChild()) { [EOL]                 requiresDecomposition = true; [EOL]             } [EOL]         } else { [EOL]             if (isSafeAssign(parent, seenSideEffects)) { [EOL]             } else { [EOL]                 for (Node n : parent.children()) { [EOL]                     if (n == child) { [EOL]                         break; [EOL]                     } [EOL]                     if (isExpressionTreeUnsafe(n, seenSideEffects)) { [EOL]                         seenSideEffects = true; [EOL]                         requiresDecomposition = true; [EOL]                     } [EOL]                 } [EOL]                 Node first = parent.getFirstChild(); [EOL]                 if (requiresDecomposition && parent.isCall() && NodeUtil.isGet(first)) { [EOL]                     if (maybeExternMethod(first)) { [EOL]                         return DecompositionType.UNDECOMPOSABLE; [EOL]                     } else { [EOL]                         return DecompositionType.DECOMPOSABLE; [EOL]                     } [EOL]                 } [EOL]             } [EOL]         } [EOL]         child = parent; [EOL]     } [EOL]     throw new IllegalStateException("Unexpected."); [EOL] } <line_num>: 747,839
private boolean isSafeAssign(Node n, boolean seenSideEffects) { [EOL]     if (n.isAssign()) { [EOL]         Node lhs = n.getFirstChild(); [EOL]         switch(lhs.getType()) { [EOL]             case Token.NAME: [EOL]                 return true; [EOL]             case Token.GETPROP: [EOL]                 return !isExpressionTreeUnsafe(lhs.getFirstChild(), seenSideEffects); [EOL]             case Token.GETELEM: [EOL]                 return !isExpressionTreeUnsafe(lhs.getFirstChild(), seenSideEffects) && !isExpressionTreeUnsafe(lhs.getLastChild(), seenSideEffects); [EOL]         } [EOL]     } [EOL]     return false; [EOL] } <line_num>: 862,876
private boolean isExpressionTreeUnsafe(Node n, boolean followingSideEffectsExist) { [EOL]     if (followingSideEffectsExist) { [EOL]         return NodeUtil.canBeSideEffected(n, this.knownConstants); [EOL]     } else { [EOL]         return NodeUtil.mayHaveSideEffects(n, compiler); [EOL]     } [EOL] } <line_num>: 882,895
