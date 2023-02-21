 FunctionType(JSTypeRegistry registry, String name, Node source, ArrowType arrowType, JSType typeOfThis, ImmutableList<String> templateKeys, boolean isConstructor, boolean nativeType)
private FunctionType(JSTypeRegistry registry, String name, Node source)
 static FunctionType forInterface(JSTypeRegistry registry, String name, Node source)
public boolean isInstanceType()
public boolean isConstructor()
public boolean isInterface()
public boolean isOrdinaryFunction()
public boolean makesStructs()
public boolean makesDicts()
public void setStruct()
public void setDict()
public FunctionType toMaybeFunctionType()
public boolean canBeCalled()
public boolean hasImplementedInterfaces()
public Iterable<Node> getParameters()
public Node getParametersNode()
public int getMinArguments()
public int getMaxArguments()
public JSType getReturnType()
public boolean isReturnTypeInferred()
 ArrowType getInternalArrowType()
public Property getSlot(String name)
public Set<String> getOwnPropertyNames()
public ObjectType getPrototype()
public void setPrototypeBasedOn(ObjectType baseType)
 void setPrototypeBasedOn(ObjectType baseType, Node propertyNode)
 boolean setPrototype(ObjectType prototype, Node propertyNode)
private boolean setPrototypeNoCheck(ObjectType prototype, Node propertyNode)
public Iterable<ObjectType> getAllImplementedInterfaces()
private void addRelatedInterfaces(ObjectType instance, Set<ObjectType> set)
public Iterable<ObjectType> getImplementedInterfaces()
public Iterable<ObjectType> getOwnImplementedInterfaces()
public void setImplementedInterfaces(List<ObjectType> implementedInterfaces)
public Iterable<ObjectType> getAllExtendedInterfaces()
private void addRelatedExtendedInterfaces(ObjectType instance, Set<ObjectType> set)
public Iterable<ObjectType> getExtendedInterfaces()
public int getExtendedInterfacesCount()
public void setExtendedInterfaces(List<ObjectType> extendedInterfaces) throws UnsupportedOperationException
public JSType getPropertyType(String name)
public FunctionType getBindReturnType(int argsToBind)
private FunctionType getCallOrBindSignature(boolean isCall)
 boolean defineProperty(String name, JSType type, boolean inferred, Node propertyNode)
 FunctionType supAndInfHelper(FunctionType that, boolean leastSuper)
private FunctionType tryMergeFunctionPiecewise(FunctionType other, boolean leastSuper)
public FunctionType getSuperClassConstructor()
public static ObjectType getTopDefiningInterface(ObjectType type, String propertyName)
public ObjectType getTopMostDefiningType(String propertyName)
 boolean checkFunctionEquivalenceHelper(FunctionType that, EquivalenceMethod eqMethod)
public int hashCode()
public boolean hasEqualCallType(FunctionType otherType)
 String toStringHelper(boolean forAnnotations)
private void appendArgString(StringBuilder b, Node p, boolean forAnnotations)
private void appendVarArgsString(StringBuilder builder, JSType paramType, boolean forAnnotations)
private void appendOptionalArgString(StringBuilder builder, JSType paramType, boolean forAnnotations)
public boolean isSubtype(JSType that)
public T visit(Visitor<T> visitor)
 T visit(RelationshipVisitor<T> visitor, JSType that)
public ObjectType getInstanceType()
 void setInstanceType(ObjectType instanceType)
public boolean hasInstanceType()
public JSType getTypeOfThis()
public Node getSource()
public void setSource(Node source)
private void addSubType(FunctionType subType)
public void clearCachedValues()
public List<FunctionType> getSubTypes()
public boolean hasCachedValues()
 JSType resolveInternal(ErrorReporter t, StaticScope<JSType> scope)
public String toDebugHashCodeString()
private String getDebugHashCodeStringOf(JSType type)
public FunctionType cloneWithoutArrowType()
public boolean hasAnyTemplateTypesInternal()
long serialVersionUID=Optional[1L]
ArrowType call
Property prototypeSlot
Kind kind
PropAccess propAccess
JSType typeOfThis
Node source
List<ObjectType> implementedInterfaces=Optional[ImmutableList.of()]
List<ObjectType> extendedInterfaces=Optional[ImmutableList.of()]
List<FunctionType> subTypes