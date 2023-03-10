public ExpressionDecomposer(AbstractCompiler compiler, Supplier<String> safeNameIdSupplier, Set<String> constNames)
 void maybeExposeExpression(Node expression)
 void exposeExpression(Node expression)
 void moveExpression(Node expression)
private void exposeExpression(Node expressionRoot, Node subExpression)
private static boolean allowObjectCallDecomposing()
private boolean maybeExternMethod(Node node)
private static Node findNonconditionalParent(Node subExpression, Node expressionRoot)
private void decomposeObjectLiteralKeys(Node key, Node stopNode, DecompositionState state)
private void decomposeSubExpressions(Node n, Node stopNode, DecompositionState state)
private Node extractConditional(Node expr, Node injectionPoint, boolean needResult)
private static Node buildResultExpression(Node expr, boolean needResult, String tempName)
private boolean isConstantName(Node n, Set<String> knownConstants)
private Node extractExpression(Node expr, Node injectionPoint)
private Node rewriteCallExpression(Node call, DecompositionState state)
public void setTempNamePrefix(String prefix)
private String getTempValueName()
public void setResultNamePrefix(String prefix)
private String getResultValueName()
private String getTempConstantValueName()
 static Node findInjectionPoint(Node subExpression)
private static boolean isConditionalOp(Node n)
 static Node findExpressionRoot(Node subExpression)
 DecompositionType canExposeExpression(Node subExpression)
private DecompositionType isSubexpressionMovable(Node expressionRoot, Node subExpression)
private boolean isSafeAssign(Node n, boolean seenSideEffects)
private boolean isExpressionTreeUnsafe(Node n, boolean followingSideEffectsExist)
