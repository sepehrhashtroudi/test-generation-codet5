private NodeIterators()
 FunctionlessLocalScope(Node... ancestors)
private LocalVarMotion(Node nameNode, FunctionlessLocalScope iterator)
public boolean hasNext()
public Node next()
public void remove()
protected Node current()
protected Node currentParent()
 List<Node> currentAncestors()
 static LocalVarMotion forVar(Node name, Node var, Node block)
 static LocalVarMotion forAssign(Node name, Node assign, Node expr, Node block)
public boolean hasNext()
public Node next()
public void remove()
private void advanceLookAhead(boolean atStart)
