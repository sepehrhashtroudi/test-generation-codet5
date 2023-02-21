private NodeUtil()
 MatchNameNode(String name)
 MatchNodeType(int type)
 static TernaryValue getImpureBooleanValue(Node n)
 static TernaryValue getPureBooleanValue(Node n)
 static String getStringValue(Node n)
 static String getStringValue(double value)
 static String getArrayElementStringValue(Node n)
 static String arrayToString(Node literal)
 static Double getNumberValue(Node n)
 static Double getStringNumberValue(String rawJsString)
 static String trimJsWhiteSpace(String s)
public static TernaryValue isStrWhiteSpaceChar(int c)
 static String getFunctionName(Node n)
public static String getNearestFunctionName(Node n)
 static boolean isImmutableValue(Node n)
 static boolean isSymmetricOperation(Node n)
 static boolean isRelationalOperation(Node n)
 static int getInverseOperator(int type)
 static boolean isLiteralValue(Node n, boolean includeFunctions)
 static boolean isValidDefineValue(Node val, Set<String> defines)
 static boolean isEmptyBlock(Node block)
 static boolean isSimpleOperator(Node n)
 static boolean isSimpleOperatorType(int type)
 static Node newExpr(Node child)
 static boolean mayEffectMutableState(Node n)
 static boolean mayEffectMutableState(Node n, AbstractCompiler compiler)
 static boolean mayHaveSideEffects(Node n)
 static boolean mayHaveSideEffects(Node n, AbstractCompiler compiler)
private static boolean checkForStateChangeHelper(Node n, boolean checkForNewObjects, AbstractCompiler compiler)
 static boolean constructorCallHasSideEffects(Node callNode)
 static boolean constructorCallHasSideEffects(Node callNode, AbstractCompiler compiler)
 static boolean functionCallHasSideEffects(Node callNode)
 static boolean functionCallHasSideEffects(Node callNode, @Nullable AbstractCompiler compiler)
 static boolean callHasLocalResult(Node n)
 static boolean newHasLocalResult(Node n)
 static boolean nodeTypeMayHaveSideEffects(Node n)
 static boolean nodeTypeMayHaveSideEffects(Node n, AbstractCompiler compiler)
 static boolean canBeSideEffected(Node n)
 static boolean canBeSideEffected(Node n, Set<String> knownConstants)
 static int precedence(int type)
 static boolean isUndefined(Node n)
 static boolean isNullOrUndefined(Node n)
public boolean apply(Node n)
 static boolean isImmutableResult(Node n)
 static boolean allResultsMatch(Node n, Predicate<Node> p)
 static boolean anyResultsMatch(Node n, Predicate<Node> p)
public boolean apply(Node n)
 static boolean isNumericResult(Node n)
 static boolean isNumericResultHelper(Node n)
public boolean apply(Node n)
 static boolean isBooleanResult(Node n)
 static boolean isBooleanResultHelper(Node n)
public boolean apply(Node n)
 static boolean mayBeString(Node n)
 static boolean mayBeString(Node n, boolean recurse)
 static boolean mayBeStringHelper(Node n)
 static boolean isAssociative(int type)
 static boolean isCommutative(int type)
 static boolean isAssignmentOp(Node n)
 static int getOpFromAssignmentOp(Node n)
 static boolean containsFunction(Node n)
 static boolean referencesThis(Node n)
 static boolean isGet(Node n)
 static boolean isVarDeclaration(Node n)
 static Node getAssignedValue(Node n)
 static boolean isExprAssign(Node n)
 static boolean isExprCall(Node n)
 static boolean isForIn(Node n)
 static boolean isLoopStructure(Node n)
 static Node getLoopCodeBlock(Node n)
 static boolean isWithinLoop(Node n)
 static boolean isControlStructure(Node n)
 static boolean isControlStructureCodeBlock(Node parent, Node n)
 static Node getConditionExpression(Node n)
 static boolean isStatementBlock(Node n)
 static boolean isStatement(Node n)
 static boolean isStatementParent(Node parent)
 static boolean isSwitchCase(Node n)
 static boolean isReferenceName(Node n)
 static boolean isTryFinallyNode(Node parent, Node child)
 static boolean isTryCatchNodeContainer(Node n)
 static void removeChild(Node parent, Node node)
 static void maybeAddFinally(Node tryNode)
 static boolean tryMergeBlock(Node block)
 static boolean isCallOrNew(Node node)
 static Node getFunctionBody(Node fn)
 static boolean isFunctionDeclaration(Node n)
 static boolean isHoistedFunctionDeclaration(Node n)
 static boolean isFunctionExpression(Node n)
 static boolean isBleedingFunctionName(Node n)
 static boolean isEmptyFunctionExpression(Node node)
 static boolean isVarArgsFunction(Node function)
 static boolean isObjectCallMethod(Node callNode, String methodName)
 static boolean isFunctionObjectCall(Node callNode)
 static boolean isFunctionObjectApply(Node callNode)
 static boolean isVarOrSimpleAssignLhs(Node n, Node parent)
public static boolean isLValue(Node n)
 static boolean isObjectLitKey(Node node, Node parent)
 static String getObjectLitKeyName(Node key)
 static JSType getObjectLitKeyTypeFromValueType(Node key, JSType valueType)
 static boolean isGetOrSetKey(Node node)
 static String opToStr(int operator)
 static String opToStrNoFail(int operator)
 static boolean containsType(Node node, int type, Predicate<Node> traverseChildrenPred)
 static boolean containsType(Node node, int type)
 static void redeclareVarsInsideBranch(Node branch)
 static void copyNameAnnotations(Node source, Node destination)
private static Node getAddingRoot(Node n)
public static Node newQualifiedNameNode(CodingConvention convention, String name)
 static Node newQualifiedNameNode(CodingConvention convention, String name, Node basisNode, String originalName)
 static Node getRootOfQualifiedName(Node qName)
 static void setDebugInformation(Node node, Node basisNode, String originalName)
private static Node newName(CodingConvention convention, String name)
 static Node newName(CodingConvention convention, String name, Node srcref)
 static Node newName(CodingConvention convention, String name, Node basisNode, String originalName)
 static boolean isLatin(String s)
 static boolean isValidSimpleName(String name)
public static boolean isValidQualifiedName(String name)
 static boolean isValidPropertyName(String name)
public void visit(Node n)
 static Collection<Node> getVarsDeclaredInBranch(Node root)
 static boolean isPrototypePropertyDeclaration(Node n)
 static boolean isPrototypeProperty(Node n)
 static Node getPrototypeClassName(Node qName)
 static String getPrototypePropertyName(Node qName)
 static Node newUndefinedNode(Node srcReferenceNode)
 static Node newVarNode(String name, Node value)
public boolean apply(Node n)
public boolean apply(Node n)
public boolean apply(Node n)
public boolean apply(Node n)
public boolean apply(Node n)
 static int getNodeTypeReferenceCount(Node node, int type, Predicate<Node> traverseChildrenPred)
 static boolean isNameReferenced(Node node, String name, Predicate<Node> traverseChildrenPred)
 static boolean isNameReferenced(Node node, String name)
 static int getNameReferenceCount(Node node, String name)
 static boolean has(Node node, Predicate<Node> pred, Predicate<Node> traverseChildrenPred)
 static int getCount(Node n, Predicate<Node> pred, Predicate<Node> traverseChildrenPred)
 void visit(Node node)
 static void visitPreOrder(Node node, Visitor visitor, Predicate<Node> traverseChildrenPred)
 static void visitPostOrder(Node node, Visitor visitor, Predicate<Node> traverseChildrenPred)
 static boolean hasFinally(Node n)
 static Node getCatchBlock(Node n)
 static boolean hasCatchHandler(Node n)
public static Node getFunctionParameters(Node fnNode)
 static boolean isConstantName(Node node)
 static boolean isConstantByConvention(CodingConvention convention, Node node, Node parent)
public static JSDocInfo getFunctionJSDocInfo(Node n)
public static String getSourceName(Node n)
public static StaticSourceFile getSourceFile(Node n)
public static InputId getInputId(Node n)
 static Node newCallNode(Node callTarget, Node... parameters)
 static boolean evaluatesToLocalValue(Node value)
 static boolean evaluatesToLocalValue(Node value, Predicate<Node> locals)
private static Node getNthSibling(Node first, int index)
 static Node getArgumentForFunction(Node function, int index)
 static Node getArgumentForCallOrNew(Node call, int index)
 static boolean isCallOrNewTarget(Node target)
private static boolean isToStringMethodCall(Node call)
 static JSDocInfo getBestJSDocInfo(Node n)
 static Node getBestLValue(Node n)
 static Node getRValueOfLValue(Node n)
 static Node getBestLValueOwner(@Nullable Node lValue)
 static String getBestLValueName(@Nullable Node lValue)
 static boolean isExpressionResultUsed(Node expr)
 static boolean isExecutedExactlyOnce(Node n)
 static Node booleanNode(boolean value)
 static Node numberNode(double value, Node srcref)
 static boolean isNaN(Node n)
long MAX_POSITIVE_INTEGER_NUMBER=Optional[(long) Math.pow(2, 53)]
String JSC_PROPERTY_NAME_FN=Optional["JSCompiler_renameProperty"]
char LARGEST_BASIC_LATIN=Optional[0x7f]
Set<String> CONSTRUCTORS_WITHOUT_SIDE_EFFECTS=Optional[new HashSet<String>(Arrays.asList("Array", "Date", "Error", "Object", "RegExp", "XMLHttpRequest"))]
Set<String> BUILTIN_FUNCTIONS_WITHOUT_SIDEEFFECTS=Optional[ImmutableSet.of("Object", "Array", "String", "Number", "Boolean", "RegExp", "Error")]
Set<String> OBJECT_METHODS_WITHOUT_SIDEEFFECTS=Optional[ImmutableSet.of("toString", "valueOf")]
Set<String> REGEXP_METHODS=Optional[ImmutableSet.of("test", "exec")]
Set<String> STRING_REGEXP_METHODS=Optional[ImmutableSet.of("match", "replace", "search", "split")]
Predicate<Node> IMMUTABLE_PREDICATE=Optional[new Predicate<Node>() {

    @Override
    public boolean apply(Node n) {
        return isImmutableValue(n);
    }
}]
NumbericResultPredicate NUMBERIC_RESULT_PREDICATE=Optional[new NumbericResultPredicate()]
BooleanResultPredicate BOOLEAN_RESULT_PREDICATE=Optional[new BooleanResultPredicate()]
MayBeStringResultPredicate MAY_BE_STRING_PREDICATE=Optional[new MayBeStringResultPredicate()]
Predicate<Node> MATCH_NOT_FUNCTION=Optional[new MatchNotFunction()]
