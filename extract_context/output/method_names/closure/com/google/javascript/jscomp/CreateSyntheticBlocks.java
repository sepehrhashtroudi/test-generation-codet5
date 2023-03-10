public Marker(Node startMarker, Node endMarker)
public CreateSyntheticBlocks(AbstractCompiler compiler, String startMarkerName, String endMarkerName)
public void process(Node externs, Node root)
private void addBlocks(Marker marker)
private void moveSiblingExclusive(Node src, Node dest, @Nullable Node start, @Nullable Node end)
private Node childAfter(Node parent, @Nullable Node siblingBefore)
private Node removeChildAfter(Node parent, @Nullable Node siblingBefore)
public void visit(NodeTraversal t, Node n, Node parent)
