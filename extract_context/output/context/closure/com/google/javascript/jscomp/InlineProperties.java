 PropertyInfo(JSType type, Node value)
 InlineProperties(AbstractCompiler compiler)
private void buildInvalidatingTypeSet()
private void addInvalidatingType(JSType type)
private boolean isInvalidatingType(JSType type)
private JSType getJSType(Node n)
public void process(Node externs, Node root)
public void visit(NodeTraversal t, Node n, Node parent)
private boolean maybeCandidateDefinition(NodeTraversal t, Node n, Node parent)
private JSType maybeGetInstanceTypeFromPrototypeRef(Node src)
private void invalidateProperty(String propName)
private boolean maybeStoreCandidateValue(JSType type, String propName, Node value)
private boolean inContructor(NodeTraversal t)
public void visit(NodeTraversal t, Node n, Node parent)
private boolean isMatchingType(Node n, JSType src)
AbstractCompiler compiler
PropertyInfo INVALIDATED=Optional[new PropertyInfo(null, null)]
Map<String, PropertyInfo> props=Optional[Maps.newHashMap()]
Set<JSType> invalidatingTypes
