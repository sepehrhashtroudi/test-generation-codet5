 ScopeState()
 StateStack()
 PeepholeOptimizationsPass(AbstractCompiler compiler, AbstractPeepholeOptimization... optimizations)
 void reset()
 ScopeState peek()
 void push()
 void pop()
public void reportChange()
 PeepholeOptimizationsPass setRetraverseOnChange(boolean retraverse)
public AbstractCompiler getCompiler()
public void process(Node externs, Node root)
private void traverse(Node node)
private boolean shouldRetraverse(Node node)
private boolean shouldVisit(Node node)
private void exitNode(Node node)
public void visit(Node n)
private void beginTraversal()
private void endTraversal()
