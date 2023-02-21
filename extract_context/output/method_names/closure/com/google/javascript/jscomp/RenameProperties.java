 RenameProperties(AbstractCompiler compiler, boolean affinity, boolean generatePseudoNames)
 RenameProperties(AbstractCompiler compiler, boolean affinity, boolean generatePseudoNames, VariableMap prevUsedPropertyMap)
 RenameProperties(AbstractCompiler compiler, boolean affinity, boolean generatePseudoNames, VariableMap prevUsedPropertyMap, @Nullable char[] reservedCharacters)
 Property(String name)
private PropertyAffinity(int affinity)
public int compare(Property p1, Property p2)
public void process(Node externs, Node root)
private void reusePropertyNames(Set<String> reservedNames, Collection<Property> allProps)
private void computeAffinityScores()
private void generateNames(Set<Property> props, Set<String> reservedNames)
 VariableMap getPropertyMap()
public void visit(NodeTraversal t, Node n, Node parent)
public void visit(NodeTraversal t, Node n, Node parent)
private void maybeMarkCandidate(Node n)
private void countCallCandidates(NodeTraversal t, Node callNode)
private void countPropertyOccurrence(String name)
public void enterScope(NodeTraversal t)
public void exitScope(NodeTraversal t)
private void increase()
