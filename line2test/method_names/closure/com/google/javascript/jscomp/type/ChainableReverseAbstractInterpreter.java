public ChainableReverseAbstractInterpreter(CodingConvention convention, JSTypeRegistry typeRegistry)
 RestrictByOneTypeOfResultVisitor(String value, boolean resultEqualsValue)
public ChainableReverseAbstractInterpreter append(ChainableReverseAbstractInterpreter lastLink)
public ChainableReverseAbstractInterpreter getFirst()
protected FlowScope firstPreciserScopeKnowingConditionOutcome(Node condition, FlowScope blindScope, boolean outcome)
protected FlowScope nextPreciserScopeKnowingConditionOutcome(Node condition, FlowScope blindScope, boolean outcome)
protected JSType getTypeIfRefinable(Node node, FlowScope scope)
protected void declareNameInScope(FlowScope scope, Node node, JSType type)
public JSType caseEnumElementType(EnumElementType enumElementType)
public JSType caseAllType()
public JSType caseNoObjectType()
public JSType caseNoType()
public JSType caseBooleanType()
public JSType caseFunctionType(FunctionType type)
public JSType caseNullType()
public JSType caseNumberType()
public JSType caseObjectType(ObjectType type)
public JSType caseStringType()
public JSType caseUnionType(UnionType type)
public JSType caseUnknownType()
public JSType caseVoidType()
public JSType caseParameterizedType(ParameterizedType type)
public JSType caseTemplateType(TemplateType templateType)
public JSType caseEnumElementType(EnumElementType enumElementType)
public JSType caseAllType()
public JSType caseNoObjectType()
public JSType caseNoType()
public JSType caseBooleanType()
public JSType caseFunctionType(FunctionType type)
public JSType caseNullType()
public JSType caseNumberType()
public JSType caseObjectType(ObjectType type)
public JSType caseStringType()
public JSType caseUnionType(UnionType type)
public JSType caseUnknownType()
public JSType caseVoidType()
public JSType caseParameterizedType(ParameterizedType type)
public JSType caseTemplateType(TemplateType templateType)
protected abstract JSType caseTopType(JSType topType)
public JSType caseAllType()
public JSType caseUnknownType()
public JSType caseUnionType(UnionType type)
public JSType caseNoType()
public JSType caseEnumElementType(EnumElementType enumElementType)
public JSType caseParameterizedType(ParameterizedType type)
public JSType caseTemplateType(TemplateType templateType)
public JSType caseNoObjectType()
public JSType caseBooleanType()
public JSType caseFunctionType(FunctionType type)
public JSType caseNullType()
public JSType caseNumberType()
public JSType caseObjectType(ObjectType type)
public JSType caseStringType()
public JSType caseVoidType()
protected JSType caseTopType(JSType topType)
public JSType caseNoObjectType()
public JSType caseBooleanType()
public JSType caseFunctionType(FunctionType type)
public JSType caseNullType()
public JSType caseNumberType()
public JSType caseObjectType(ObjectType type)
public JSType caseStringType()
public JSType caseVoidType()
private boolean matchesExpectation(String result)
protected JSType caseTopType(JSType topType)
public JSType caseNoObjectType()
public JSType caseBooleanType()
public JSType caseFunctionType(FunctionType type)
public JSType caseNullType()
public JSType caseNumberType()
public JSType caseObjectType(ObjectType type)
public JSType caseStringType()
public JSType caseVoidType()
protected final JSType getRestrictedWithoutUndefined(JSType type)
protected final JSType getRestrictedWithoutNull(JSType type)
 JSType getRestrictedByTypeOfResult(JSType type, String value, boolean resultEqualsValue)
 JSType getNativeType(JSTypeNative typeId)
private JSType getNativeTypeForTypeOf(String value)
