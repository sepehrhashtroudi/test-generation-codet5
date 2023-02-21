public FixedPointGraphTraversal(EdgeCallback<N, E> callback) { [EOL]     this.callback = callback; [EOL] } <line_num>: 53,55
public static <NODE, EDGE> FixedPointGraphTraversal<NODE, EDGE> newTraversal(EdgeCallback<NODE, EDGE> callback) { [EOL]     return new FixedPointGraphTraversal<NODE, EDGE>(callback); [EOL] } <line_num>: 60,63
public void computeFixedPoint(DiGraph<N, E> graph) { [EOL]     Set<N> nodes = Sets.newHashSet(); [EOL]     for (DiGraphNode<N, E> node : graph.getDirectedGraphNodes()) { [EOL]         nodes.add(node.getValue()); [EOL]     } [EOL]     computeFixedPoint(graph, nodes); [EOL] } <line_num>: 69,75
public void computeFixedPoint(DiGraph<N, E> graph, N entry) { [EOL]     Set<N> entrySet = Sets.newHashSet(); [EOL]     entrySet.add(entry); [EOL]     computeFixedPoint(graph, entrySet); [EOL] } <line_num>: 82,86
public void computeFixedPoint(DiGraph<N, E> graph, Set<N> entrySet) { [EOL]     int cycleCount = 0; [EOL]     long nodeCount = graph.getNodes().size(); [EOL]     long maxIterations = Math.max(nodeCount * nodeCount * nodeCount, 100); [EOL]     LinkedHashSet<DiGraphNode<N, E>> workSet = Sets.newLinkedHashSet(); [EOL]     for (N n : entrySet) { [EOL]         workSet.add(graph.getDirectedGraphNode(n)); [EOL]     } [EOL]     for (; !workSet.isEmpty() && cycleCount < maxIterations; cycleCount++) { [EOL]         DiGraphNode<N, E> source = workSet.iterator().next(); [EOL]         N sourceValue = source.getValue(); [EOL]         workSet.remove(source); [EOL]         List<DiGraphEdge<N, E>> outEdges = source.getOutEdges(); [EOL]         for (DiGraphEdge<N, E> edge : outEdges) { [EOL]             N destNode = edge.getDestination().getValue(); [EOL]             if (callback.traverseEdge(sourceValue, edge.getValue(), destNode)) { [EOL]                 workSet.add(edge.getDestination()); [EOL]             } [EOL]         } [EOL]     } [EOL]     Preconditions.checkState(cycleCount != maxIterations, NON_HALTING_ERROR_MSG); [EOL] } <line_num>: 93,128
boolean traverseEdge(Node source, Edge e, Node destination); <line_num>: 142,142
