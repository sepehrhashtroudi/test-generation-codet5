 ControlFlowGraph(N entry, boolean nodeAnnotations, boolean edgeAnnotations)
public DiGraphNode<N, ControlFlowGraph.Branch> getImplicitReturn()
public DiGraphNode<N, ControlFlowGraph.Branch> getEntry()
public boolean isImplicitReturn(DiGraphNode<N, ControlFlowGraph.Branch> node)
public void connectToImplicitReturn(N srcValue, Branch edgeValue)
public Comparator<DiGraphNode<N, Branch>> getOptionalNodeComparator(boolean isForward)
public boolean isConditional()
public final boolean shouldTraverse(NodeTraversal nodeTraversal, Node n, Node parent)
public static boolean isEnteringNewCfgNode(Node n)
