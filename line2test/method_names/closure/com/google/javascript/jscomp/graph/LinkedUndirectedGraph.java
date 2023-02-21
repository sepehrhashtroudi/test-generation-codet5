protected LinkedUndirectedGraph(boolean useNodeAnnotations, boolean useEdgeAnnotations)
 LinkedUndirectedGraphNode(N nodeValue)
 AnnotatedLinkedUndirectedGraphNode(N nodeValue)
 LinkedUndirectedGraphEdge(UndiGraphNode<N, E> nodeA, E edgeValue, UndiGraphNode<N, E> nodeB)
 AnnotatedLinkedUndirectedGraphEdge(UndiGraphNode<N, E> nodeA, E edgeValue, UndiGraphNode<N, E> nodeB)
public SubGraph<N, E> newSubGraph()
public static LinkedUndirectedGraph<N, E> createWithoutAnnotations()
public static LinkedUndirectedGraph<N, E> createWithNodeAnnotations()
public static LinkedUndirectedGraph<N, E> createWithEdgeAnnotations()
public static LinkedUndirectedGraph<N, E> create()
public void connect(N srcValue, E edgeValue, N destValue)
public void disconnect(N srcValue, N destValue)
public UndiGraphNode<N, E> createUndirectedGraphNode(N nodeValue)
public List<GraphNode<N, E>> getNeighborNodes(N value)
public Iterator<GraphNode<N, E>> getNeighborNodesIterator(N value)
public List<UndiGraphEdge<N, E>> getUndirectedGraphEdges(N n1, N n2)
public UndiGraphNode<N, E> getUndirectedGraphNode(N nodeValue)
public Collection<UndiGraphNode<N, E>> getUndirectedGraphNodes()
public GraphNode<N, E> createNode(N value)
public List<GraphEdge<N, E>> getEdges(N n1, N n2)
public GraphEdge<N, E> getFirstEdge(N n1, N n2)
public GraphNode<N, E> getNode(N value)
public boolean isConnected(N n1, N n2)
public boolean isConnected(N n1, E e, N n2)
private boolean isConnected(N n1, Predicate<E> edgePredicate, N n2)
public List<GraphvizEdge> getGraphvizEdges()
public String getName()
public List<GraphvizNode> getGraphvizNodes()
public boolean isDirected()
public Collection<GraphNode<N, E>> getNodes()
public List<GraphEdge<N, E>> getEdges()
public int getNodeDegree(N value)
public List<UndiGraphEdge<N, E>> getNeighborEdges()
public Iterator<UndiGraphEdge<N, E>> getNeighborEdgesIterator()
public A getAnnotation()
public void setAnnotation(Annotation data)
public N getValue()
public String getColor()
public String getId()
public String getLabel()
public Iterator<GraphNode<N, E>> neighborIterator()
public boolean hasNext()
public GraphNode<N, E> next()
public void remove()
public A getAnnotation()
public void setAnnotation(Annotation data)
public E getValue()
public GraphNode<N, E> getNodeA()
public GraphNode<N, E> getNodeB()
public A getAnnotation()
public void setAnnotation(Annotation data)
public String getColor()
public String getLabel()
public String getNode1Id()
public String getNode2Id()
public String toString()
public A getAnnotation()
public void setAnnotation(Annotation data)
