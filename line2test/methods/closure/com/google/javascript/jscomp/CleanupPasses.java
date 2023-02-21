public CleanupPasses(CompilerOptions options) { [EOL]     super(options); [EOL] } <line_num>: 40,42
public MemoizedScopeCleanupPass(AbstractCompiler compiler) { [EOL]     this.compiler = compiler; [EOL] } <line_num>: 106,108
@Override [EOL] protected List<PassFactory> getChecks() { [EOL]     List<PassFactory> checks = Lists.newArrayList(); [EOL]     checks.add(fieldCleanupPassFactory); [EOL]     checks.add(scopeCleanupPassFactory); [EOL]     checks.add(globalVarRefCleanupPassFactory); [EOL]     return checks; [EOL] } <line_num>: 44,51
@Override [EOL] protected State getIntermediateState() { [EOL]     return state; [EOL] } <line_num>: 53,56
@Override [EOL] protected List<PassFactory> getOptimizations() { [EOL]     return ImmutableList.of(); [EOL] } <line_num>: 58,61
@Override [EOL] protected void setIntermediateState(State state) { [EOL]     this.state = state; [EOL] } <line_num>: 63,66
@Override [EOL] protected HotSwapCompilerPass create(AbstractCompiler compiler) { [EOL]     return new FieldCleanupPass(compiler); [EOL] } <line_num>: 70,74
@Override [EOL] protected HotSwapCompilerPass create(AbstractCompiler compiler) { [EOL]     return new MemoizedScopeCleanupPass(compiler); [EOL] } <line_num>: 79,83
@Override [EOL] protected HotSwapCompilerPass create(AbstractCompiler compiler) { [EOL]     return new GlobalVarRefCleanupPass(compiler); [EOL] } <line_num>: 88,92
@Override [EOL] public void hotSwapScript(Node scriptRoot, Node originalRoot) { [EOL]     ScopeCreator creator = compiler.getTypedScopeCreator(); [EOL]     if (creator instanceof MemoizedScopeCreator) { [EOL]         MemoizedScopeCreator scopeCreator = (MemoizedScopeCreator) creator; [EOL]         String newSrc = scriptRoot.getSourceFileName(); [EOL]         for (Var var : scopeCreator.getAllSymbols()) { [EOL]             JSType type = var.getType(); [EOL]             if (type != null) { [EOL]                 FunctionType fnType = type.toMaybeFunctionType(); [EOL]                 if (fnType != null && newSrc.equals(NodeUtil.getSourceName(fnType.getSource()))) { [EOL]                     fnType.setSource(null); [EOL]                 } [EOL]             } [EOL]         } [EOL]         scopeCreator.removeScopesForScript(originalRoot.getSourceFileName()); [EOL]     } [EOL] } <line_num>: 110,128
@Override [EOL] public void process(Node externs, Node root) { [EOL] } <line_num>: 130,133
