 FunctionToBlockMutator(AbstractCompiler compiler, Supplier<String> safeNameIdSupplier)
 LabelNameSupplier(Supplier<String> idSupplier)
 Node mutate(String fnName, Node fnNode, Node callNode, String resultName, boolean needsDefaultResult, boolean isCallInLoop)
private void rewriteFunctionDeclarations(Node n)
private void fixUnitializedVarDeclarations(Node n)
private void makeLocalNamesUnique(Node fnNode, boolean isCallInLoop)
public String get()
private String getLabelNameForFunction(String fnName)
private String getUniqueThisName()
private Node aliasAndInlineArguments(Node fnTemplateRoot, LinkedHashMap<String, Node> argMap, Set<String> namesToAlias)
private static Node replaceReturns(Node block, String resultName, String labelName, boolean resultMustBeSet)
private static void addDummyAssignment(Node node, String resultName)
private static void convertLastReturnToStatement(Node block, String resultName)
private static Node createAssignStatementNode(String name, Node expression)
private static Node getReplacementReturnStatement(Node node, String resultName)
private static boolean hasReturnAtExit(Node block)
private static Node replaceReturnWithBreak(Node current, Node parent, String resultName, String labelName)
AbstractCompiler compiler
Supplier<String> safeNameIdSupplier