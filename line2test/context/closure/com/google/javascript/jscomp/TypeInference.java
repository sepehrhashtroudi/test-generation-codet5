 TypeInference(AbstractCompiler compiler, ControlFlowGraph<Node> cfg, ReverseAbstractInterpreter reverseInterpreter, Scope functionScope, Map<String, AssertionFunctionSpec> assertionFunctionsMap)
 TemplateTypeReplacer(JSTypeRegistry registry, Map<TemplateType, JSType> replacements)
 BooleanOutcomePair(BooleanLiteralSet toBooleanOutcomes, BooleanLiteralSet booleanValues, FlowScope leftScope, FlowScope rightScope)
private void inferArguments(Scope functionScope)
 FlowScope createInitialEstimateLattice()
 FlowScope createEntryLattice()
 FlowScope flowThrough(Node n, FlowScope input)
 List<FlowScope> branchedFlowThrough(Node source, FlowScope input)
private FlowScope traverse(Node n, FlowScope scope)
private FlowScope traverseReturn(Node n, FlowScope scope)
private FlowScope traverseCatch(Node catchNode, FlowScope scope)
private FlowScope traverseAssign(Node n, FlowScope scope)
private void updateScopeForTypeChange(FlowScope scope, Node left, JSType leftType, JSType resultType)
private void ensurePropertyDefined(Node getprop, JSType rightType)
private void ensurePropertyDeclared(Node getprop)
private boolean ensurePropertyDeclaredHelper(Node getprop, ObjectType objectType)
private FlowScope traverseName(Node n, FlowScope scope)
private FlowScope traverseArrayLiteral(Node n, FlowScope scope)
private FlowScope traverseObjectLiteral(Node n, FlowScope scope)
private FlowScope traverseAdd(Node n, FlowScope scope)
private boolean isAddedAsNumber(JSType type)
private FlowScope traverseHook(Node n, FlowScope scope)
private FlowScope traverseCall(Node n, FlowScope scope)
private FlowScope tightenTypesAfterAssertions(FlowScope scope, Node callNode)
private FlowScope narrowScope(FlowScope scope, Node node, JSType narrowed)
private void backwardsInferenceFromCallSite(Node n, FunctionType fnType)
private void updateBind(Node n, FunctionType fnType)
private void updateTypeOfParameters(Node n, FunctionType fnType)
private Map<TemplateType, JSType> inferTemplateTypesFromParameters(FunctionType fnType, Node call)
private void maybeResolveTemplatedType(JSType paramType, JSType argType, Map<TemplateType, JSType> resolvedTypes)
private void maybeResolveTemplateTypeFromNodes(Iterable<Node> declParams, Iterable<Node> callParams, Map<TemplateType, JSType> resolvedTypes)
private void maybeResolveTemplateTypeFromNodes(Iterator<Node> declParams, Iterator<Node> callParams, Map<TemplateType, JSType> resolvedTypes)
private void resolvedTemplateType(Map<TemplateType, JSType> map, TemplateType template, JSType resolved)
public JSType caseTemplateType(TemplateType type)
private boolean inferTemplatedTypesForCall(Node n, FunctionType fnType)
private FlowScope traverseNew(Node n, FlowScope scope)
private BooleanOutcomePair traverseAnd(Node n, FlowScope scope)
private FlowScope traverseChildren(Node n, FlowScope scope)
private FlowScope traverseGetElem(Node n, FlowScope scope)
private FlowScope traverseGetProp(Node n, FlowScope scope)
private void inferPropertyTypesToMatchConstraint(JSType type, JSType constraint)
private FlowScope dereferencePointer(Node n, FlowScope scope)
private JSType getPropertyType(JSType objType, String propName, Node n, FlowScope scope)
private BooleanOutcomePair traverseOr(Node n, FlowScope scope)
private BooleanOutcomePair traverseShortCircuitingBinOp(Node n, FlowScope scope, boolean condition)
private BooleanOutcomePair traverseWithinShortCircuitingBinOp(Node n, FlowScope scope)
 BooleanOutcomePair getBooleanOutcomePair(BooleanOutcomePair left, BooleanOutcomePair right, boolean condition)
 static BooleanLiteralSet getBooleanOutcomes(BooleanLiteralSet left, BooleanLiteralSet right, boolean condition)
 FlowScope getJoinedFlowScope()
 FlowScope getOutcomeFlowScope(int nodeType, boolean outcome)
private BooleanOutcomePair newBooleanOutcomePair(JSType jsType, FlowScope flowScope)
private void redeclareSimpleVar(FlowScope scope, Node nameNode, JSType varType)
private boolean isUnflowable(Var v)
private JSType getJSType(Node n)
private JSType getNativeType(JSTypeNative typeId)
DiagnosticType FUNCTION_LITERAL_UNDEFINED_THIS=Optional[DiagnosticType.warning("JSC_FUNCTION_LITERAL_UNDEFINED_THIS", "Function literal argument refers to undefined this argument")]
AbstractCompiler compiler
JSTypeRegistry registry
ReverseAbstractInterpreter reverseInterpreter
Scope syntacticScope
FlowScope functionScope
FlowScope bottomScope
Map<String, AssertionFunctionSpec> assertionFunctionsMap
ObjectType unknownType
