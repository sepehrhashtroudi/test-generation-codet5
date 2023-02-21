 UnreachableCodeElimination(AbstractCompiler compiler, boolean removeNoOpStatements)
private EliminationPass(ControlFlowGraph<Node> cfg)
public void exitScope(NodeTraversal t)
public void process(Node externs, Node root)
public void visit(NodeTraversal t, Node n, Node parent)
private Node tryRemoveUnconditionalBranching(Node n)
private Node computeFollowing(Node n)
private void removeDeadExprStatementSafely(Node n)
public void visit(NodeTraversal t, Node n, Node parent)
public void enterScope(NodeTraversal t)
Logger logger=Optional[Logger.getLogger(UnreachableCodeElimination.class.getName())]
AbstractCompiler compiler
boolean removeNoOpStatements