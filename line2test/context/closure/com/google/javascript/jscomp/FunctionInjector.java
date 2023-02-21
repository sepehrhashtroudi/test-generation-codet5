public FunctionInjector(AbstractCompiler compiler, Supplier<String> safeNameIdSupplier, boolean allowDecomposition, boolean assumeStrictThis, boolean assumeMinimumCapture)
 Reference(Node callNode, JSModule module, InliningMode mode)
public boolean apply(Node n)
 boolean doesFunctionMeetMinimumRequirements(final String fnName, Node fnNode)
 CanInlineResult canInlineReferenceToFunction(NodeTraversal t, Node callNode, Node fnNode, Set<String> needAliases, InliningMode mode, boolean referencesThis, boolean containsFunctions)
private boolean isSupportedCallType(Node callNode)
 Node inline(NodeTraversal t, Node callNode, String fnName, Node fnNode, InliningMode mode)
private Node inlineReturnValue(Node callNode, Node fnNode)
public void prepare(FunctionInjector injector, Node callNode)
public void prepare(FunctionInjector injector, Node callNode)
public void prepare(FunctionInjector injector, Node callNode)
public void prepare(FunctionInjector injector, Node callNode)
public void prepare(FunctionInjector injector, Node callNode)
public void prepare(FunctionInjector injector, Node callNode)
public abstract void prepare(FunctionInjector injector, Node callNode)
private CallSiteType classifyCallSite(Node callNode)
private ExpressionDecomposer getDecomposer()
 void maybePrepareCall(Node callNode)
private Node inlineFunction(Node callNode, Node fnNode, String fnName)
 boolean isDirectCallNodeReplacementPossible(Node fnNode)
private CanInlineResult canInlineReferenceAsStatementBlock(NodeTraversal t, Node callNode, Node fnNode, Set<String> namesToAlias)
public boolean apply(Node n)
private boolean callMeetsBlockInliningRequirements(NodeTraversal t, Node callNode, final Node fnNode, Set<String> namesToAlias)
private CanInlineResult canInlineReferenceDirectly(Node callNode, Node fnNode)
 boolean inliningLowersCost(JSModule fnModule, Node fnNode, Collection<? extends Reference> refs, Set<String> namesToAlias, boolean isRemovable, boolean referencesThis)
private boolean doesLowerCost(Node fnNode, int callCost, int directInlines, int costDeltaDirect, int blockInlines, int costDeltaBlock, boolean removable)
private static int estimateCallCost(Node fnNode, boolean referencesThis)
private static int inlineCostDelta(Node fnNode, Set<String> namesToAlias, InliningMode mode)
public void setKnownConstants(Set<String> knownConstants)
AbstractCompiler compiler
Supplier<String> safeNameIdSupplier
boolean allowDecomposition
Set<String> knownConstants=Optional[Sets.newHashSet()]
boolean assumeStrictThis
boolean assumeMinimumCapture
int NAME_COST_ESTIMATE=Optional[InlineCostEstimator.ESTIMATED_IDENTIFIER_COST]
int COMMA_COST=Optional[1]
int PAREN_COST=Optional[2]
