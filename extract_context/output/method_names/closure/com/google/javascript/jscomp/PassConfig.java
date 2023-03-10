public PassConfig(CompilerOptions options)
 PassConfigDelegate(PassConfig delegate)
public State(Map<String, Integer> cssNames, Set<String> exportedNames, CrossModuleMethodMotion.IdGenerator crossModuleIdGenerator, VariableMap variableMap, VariableMap propertyMap, VariableMap anonymousFunctionNameMap, VariableMap stringMap, FunctionNames functionNames, String idGeneratorMap)
 void regenerateGlobalTypedScope(AbstractCompiler compiler, Node root)
 void clearTypedScope()
 void patchGlobalTypedScope(AbstractCompiler compiler, Node scriptRoot)
 MemoizedScopeCreator getTypedScopeCreator()
 Scope getTopScope()
protected abstract List<PassFactory> getChecks()
protected abstract List<PassFactory> getOptimizations()
 GraphvizGraph getPassGraph()
 final TypeInferencePass makeTypeInference(AbstractCompiler compiler)
 final InferJSDocInfo makeInferJsDocInfo(AbstractCompiler compiler)
 final TypeCheck makeTypeCheck(AbstractCompiler compiler)
 static final void addPassFactoryBefore(List<PassFactory> factoryList, PassFactory factory, String passName)
 static final void replacePassFactory(List<PassFactory> factoryList, PassFactory factory)
private static int findPassIndexByName(List<PassFactory> factoryList, String name)
 final PassConfig getBasePassConfig()
protected abstract State getIntermediateState()
protected abstract void setIntermediateState(State state)
protected List<PassFactory> getChecks()
protected List<PassFactory> getOptimizations()
 MemoizedScopeCreator getTypedScopeCreator()
 Scope getTopScope()
protected State getIntermediateState()
protected void setIntermediateState(State state)
