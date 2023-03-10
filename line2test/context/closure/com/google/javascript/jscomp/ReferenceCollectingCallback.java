 ReferenceCollectingCallback(AbstractCompiler compiler, Behavior behavior)
 ReferenceCollectingCallback(AbstractCompiler compiler, Behavior behavior, Predicate<Var> varFilter)
public ReferenceMapWrapper(Map<Var, ReferenceCollection> referenceMap)
 Reference(Node nameNode, NodeTraversal t, BasicBlock basicBlock)
private Reference(Node nameNode, BasicBlock basicBlock, Scope scope, InputId inputId)
 BasicBlock(BasicBlock parent, Node root)
public void process(Node externs, Node root)
public void hotSwapScript(Node scriptRoot, Node originalRoot)
public Iterable<Var> getAllSymbols()
public Scope getScope(Var var)
public ReferenceCollection getReferences(Var v)
public void visit(NodeTraversal t, Node n, Node parent)
public void enterScope(NodeTraversal t)
public void exitScope(NodeTraversal t)
public boolean shouldTraverse(NodeTraversal nodeTraversal, Node n, Node parent)
private static boolean isBlockBoundary(Node n, Node parent)
private void addReference(NodeTraversal t, Var v, Reference reference)
 ReferenceCollection getReferences(Var var)
public ReferenceCollection getReferences(Var var)
 void afterExitScope(NodeTraversal t, ReferenceMap referenceMap)
public void afterExitScope(NodeTraversal t, ReferenceMap referenceMap)
public Iterator<Reference> iterator()
 void add(Reference reference, NodeTraversal t, Var v)
protected boolean isWellDefined()
 boolean isEscaped()
private boolean isInitializingDeclarationAt(int index)
private boolean isInitializingAssignmentAt(int index)
 Reference getInitializingReference()
 Reference getInitializingReferenceForConstants()
 boolean isAssignedOnceInLifetime()
private Reference getOneAndOnlyAssignment()
 boolean isNeverAssigned()
 boolean firstReferenceIsAssigningDeclaration()
 static Reference newBleedingFunction(NodeTraversal t, BasicBlock basicBlock, Node func)
 static Reference createRefForTest(CompilerInput input)
 Reference cloneWithNewScope(Scope newScope)
public Var getSymbol()
public Node getNode()
public InputId getInputId()
public StaticSourceFile getSourceFile()
 boolean isDeclaration()
 boolean isVarDeclaration()
 boolean isHoistedFunction()
 boolean isInitializingDeclaration()
 Node getAssignedValue()
 BasicBlock getBasicBlock()
 Node getParent()
 Node getGrandparent()
private static boolean isLhsOfForInExpression(Node n)
 boolean isSimpleAssignmentToName()
 boolean isLvalue()
 Scope getScope()
 BasicBlock getParent()
 boolean isGlobalScopeBlock()
 boolean provablyExecutesBefore(BasicBlock thatBlock)
Map<Var, ReferenceCollection> referenceMap=Optional[Maps.newHashMap()]
Deque<BasicBlock> blockStack=Optional[new ArrayDeque<BasicBlock>()]
Behavior behavior
AbstractCompiler compiler
Predicate<Var> varFilter
Behavior DO_NOTHING_BEHAVIOR=Optional[new Behavior() {

    @Override
    public void afterExitScope(NodeTraversal t, ReferenceMap referenceMap) {
    }
}]
