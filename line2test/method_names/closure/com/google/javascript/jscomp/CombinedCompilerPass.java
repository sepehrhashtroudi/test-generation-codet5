 CombinedCompilerPass(AbstractCompiler compiler, Callback... callbacks)
 CombinedCompilerPass(AbstractCompiler compiler, List<Callback> callbacks)
private CallbackWrapper(Callback callback)
 static void traverse(AbstractCompiler compiler, Node root, List<Callback> callbacks)
 void visitOrMaybeActivate(NodeTraversal t, Node n, Node parent)
 void shouldTraverseIfActive(NodeTraversal t, Node n, Node parent)
 void enterScopeIfActive(NodeTraversal t)
 void exitScopeIfActive(NodeTraversal t)
 boolean isActive()
public final void process(Node externs, Node root)
public void hotSwapScript(Node scriptRoot, Node originalRoot)
public boolean shouldTraverse(NodeTraversal t, Node n, Node parent)
public void visit(NodeTraversal t, Node n, Node parent)
public void enterScope(NodeTraversal t)
public void exitScope(NodeTraversal t)
