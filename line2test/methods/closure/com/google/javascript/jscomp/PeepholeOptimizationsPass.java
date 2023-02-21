ScopeState() { [EOL]     reset(); [EOL] } <line_num>: 48,50
StateStack() { [EOL]     states.add(new ScopeState()); [EOL] } <line_num>: 62,64
PeepholeOptimizationsPass(AbstractCompiler compiler, AbstractPeepholeOptimization... optimizations) { [EOL]     this.compiler = compiler; [EOL]     this.peepholeOptimizations = optimizations; [EOL] } <line_num>: 95,99
void reset() { [EOL]     changed = false; [EOL]     traverseChildScopes = true; [EOL] } <line_num>: 52,55
ScopeState peek() { [EOL]     return states.get(currentDepth); [EOL] } <line_num>: 66,68
void push() { [EOL]     currentDepth++; [EOL]     if (states.size() <= currentDepth) { [EOL]         states.add(new ScopeState()); [EOL]     } else { [EOL]         states.get(currentDepth).reset(); [EOL]     } [EOL] } <line_num>: 70,77
void pop() { [EOL]     currentDepth--; [EOL] } <line_num>: 79,81
@Override [EOL] public void reportChange() { [EOL]     traversalState.peek().changed = true; [EOL] } <line_num>: 85,88
PeepholeOptimizationsPass setRetraverseOnChange(boolean retraverse) { [EOL]     this.retraverseOnChange = retraverse; [EOL]     return this; [EOL] } <line_num>: 101,104
public AbstractCompiler getCompiler() { [EOL]     return compiler; [EOL] } <line_num>: 106,108
@Override [EOL] public void process(Node externs, Node root) { [EOL]     PeepholeChangeHandler handler = new PeepholeChangeHandler(); [EOL]     compiler.addChangeHandler(handler); [EOL]     beginTraversal(); [EOL]     traverse(root); [EOL]     endTraversal(); [EOL]     compiler.removeChangeHandler(handler); [EOL] } <line_num>: 110,118
private void traverse(Node node) { [EOL]     if (!shouldVisit(node)) { [EOL]         return; [EOL]     } [EOL]     int visits = 0; [EOL]     do { [EOL]         Node c = node.getFirstChild(); [EOL]         while (c != null) { [EOL]             Node next = c.getNext(); [EOL]             traverse(c); [EOL]             c = next; [EOL]         } [EOL]         visit(node); [EOL]         visits++; [EOL]         Preconditions.checkState(visits < 10000, "too many interations"); [EOL]     } while (shouldRetraverse(node)); [EOL]     exitNode(node); [EOL] } <line_num>: 120,145
private boolean shouldRetraverse(Node node) { [EOL]     if (retraverseOnChange && node.getParent() != null && (node.isFunction() || node.isScript())) { [EOL]         ScopeState state = traversalState.peek(); [EOL]         if (state.changed) { [EOL]             state.changed = false; [EOL]             state.traverseChildScopes = false; [EOL]             return true; [EOL]         } [EOL]     } [EOL]     return false; [EOL] } <line_num>: 147,163
private boolean shouldVisit(Node node) { [EOL]     if (node.isFunction() || node.isScript()) { [EOL]         ScopeState previous = traversalState.peek(); [EOL]         if (!previous.traverseChildScopes) { [EOL]             return false; [EOL]         } [EOL]         traversalState.push(); [EOL]     } [EOL]     return true; [EOL] } <line_num>: 165,174
private void exitNode(Node node) { [EOL]     if (node.isFunction() || node.isScript()) { [EOL]         traversalState.pop(); [EOL]     } [EOL] } <line_num>: 176,180
public void visit(Node n) { [EOL]     Node currentVersionOfNode = n; [EOL]     boolean somethingChanged = false; [EOL]     do { [EOL]         somethingChanged = false; [EOL]         for (AbstractPeepholeOptimization optimization : peepholeOptimizations) { [EOL]             Node newVersionOfNode = optimization.optimizeSubtree(currentVersionOfNode); [EOL]             if (newVersionOfNode != currentVersionOfNode) { [EOL]                 somethingChanged = true; [EOL]                 currentVersionOfNode = newVersionOfNode; [EOL]             } [EOL]             if (currentVersionOfNode == null) { [EOL]                 return; [EOL]             } [EOL]         } [EOL]     } while (somethingChanged); [EOL] } <line_num>: 182,203
private void beginTraversal() { [EOL]     for (AbstractPeepholeOptimization optimization : peepholeOptimizations) { [EOL]         optimization.beginTraversal(compiler); [EOL]     } [EOL] } <line_num>: 209,213
private void endTraversal() { [EOL]     for (AbstractPeepholeOptimization optimization : peepholeOptimizations) { [EOL]         optimization.endTraversal(compiler); [EOL]     } [EOL] } <line_num>: 215,219
