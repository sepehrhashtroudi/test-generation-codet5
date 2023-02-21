private LiveVariableLattice(int numVars)
private LiveVariableLattice(LiveVariableLattice other)
 LiveVariablesAnalysis(ControlFlowGraph<Node> cfg, Scope jsScope, AbstractCompiler compiler)
public LiveVariableLattice apply(List<LiveVariableLattice> in)
public boolean equals(Object other)
public boolean isLive(Var v)
public boolean isLive(int index)
public String toString()
public int hashCode()
public Set<Var> getEscapedLocals()
public int getVarIndex(String var)
 boolean isForward()
 LiveVariableLattice createEntryLattice()
 LiveVariableLattice createInitialEstimateLattice()
 LiveVariableLattice flowThrough(Node node, LiveVariableLattice input)
private void computeGenKill(Node n, BitSet gen, BitSet kill, boolean conditional)
private void addToSetIfLocal(Node node, BitSet set)
 void markAllParametersEscaped()
private boolean isArgumentsName(Node n)
int MAX_VARIABLES_TO_ANALYZE=Optional[100]
String ARGUMENT_ARRAY_ALIAS=Optional["arguments"]
Scope jsScope
Set<Var> escaped
