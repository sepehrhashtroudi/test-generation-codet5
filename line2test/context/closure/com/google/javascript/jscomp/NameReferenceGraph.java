public NameReferenceGraph(AbstractCompiler compiler)
public Name(String qName, boolean isExtern)
public Reference(Node site, Node parent)
public Name defineNameIfNotExists(String name, boolean isExtern)
public List<Name> getReferencesAt(Node site)
public Collection<Definition> getDefinitionsReferencedAt(Node useSite)
public Name getSymbol(String name)
public GraphNode<Name, Reference> createNode(Name value)
public void connect(Name src, Reference ref, Name dest)
public JSType getType()
public void setType(JSType type)
public List<Definition> getDeclarations()
public void addAssignmentDeclaration(Node node)
public void addFunctionDeclaration(Node node)
public boolean isExtern()
public void markExported()
public boolean isExported()
public final void remove()
public boolean isAliased()
public void setAliased(boolean isAliased)
public boolean hasSideEffect()
public String getQualifiedName()
public String getPropertyName()
public boolean isCallable()
public boolean exposedToCallOrApply()
public void markExposedToCallOrApply()
public String toString()
public int hashCode()
public boolean canChangeSignature()
private boolean nameUsesArgumentsProperty()
public boolean isUnknown()
public void setUnknown(boolean isUnknown)
public JSModule getModule()
public void setModule(JSModule module)
 boolean isCall()
public Node getSite()
Multimap<Node, Name> referenceMap=Optional[HashMultimap.create()]
Map<String, Name> nameMap=Optional[Maps.newHashMap()]
Name UNKNOWN
Name MAIN
Name WINDOW
AbstractCompiler compiler
