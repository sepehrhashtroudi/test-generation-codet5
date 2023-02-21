CrossModuleMethodMotion(AbstractCompiler compiler, IdGenerator idGenerator, boolean canModifyExterns) { [EOL]     this.compiler = compiler; [EOL]     this.idGenerator = idGenerator; [EOL]     this.moduleGraph = compiler.getModuleGraph(); [EOL]     this.analyzer = new AnalyzePrototypeProperties(compiler, moduleGraph, canModifyExterns, false); [EOL] } <line_num>: 70,77
@Override [EOL] public void process(Node externRoot, Node root) { [EOL]     if (moduleGraph != null && moduleGraph.getModuleCount() > 1) { [EOL]         analyzer.process(externRoot, root); [EOL]         moveMethods(analyzer.getAllNameInfo()); [EOL]     } [EOL] } <line_num>: 79,87
private void moveMethods(Collection<NameInfo> allNameInfo) { [EOL]     boolean hasStubDeclaration = idGenerator.hasGeneratedAnyIds(); [EOL]     for (NameInfo nameInfo : allNameInfo) { [EOL]         if (!nameInfo.isReferenced()) { [EOL]             continue; [EOL]         } [EOL]         if (nameInfo.readsClosureVariables()) { [EOL]             continue; [EOL]         } [EOL]         JSModule deepestCommonModuleRef = nameInfo.getDeepestCommonModuleRef(); [EOL]         if (deepestCommonModuleRef == null) { [EOL]             compiler.report(JSError.make(NULL_COMMON_MODULE_ERROR)); [EOL]             continue; [EOL]         } [EOL]         Iterator<Symbol> declarations = nameInfo.getDeclarations().descendingIterator(); [EOL]         while (declarations.hasNext()) { [EOL]             Symbol symbol = declarations.next(); [EOL]             if (!(symbol instanceof Property)) { [EOL]                 continue; [EOL]             } [EOL]             Property prop = (Property) symbol; [EOL]             if (prop.getRootVar() == null || !prop.getRootVar().isGlobal()) { [EOL]                 continue; [EOL]             } [EOL]             Node value = prop.getValue(); [EOL]             if (moduleGraph.dependsOn(deepestCommonModuleRef, prop.getModule()) && value.isFunction()) { [EOL]                 Node valueParent = value.getParent(); [EOL]                 if (valueParent.isGetterDef() || valueParent.isSetterDef()) { [EOL]                     continue; [EOL]                 } [EOL]                 Node proto = prop.getPrototype(); [EOL]                 int stubId = idGenerator.newId(); [EOL]                 Node stubCall = IR.call(IR.name(STUB_METHOD_NAME), IR.number(stubId)).copyInformationFromForTree(value); [EOL]                 stubCall.putBooleanProp(Node.FREE_CALL, true); [EOL]                 valueParent.replaceChild(value, stubCall); [EOL]                 Node unstubParent = compiler.getNodeForCodeInsertion(deepestCommonModuleRef); [EOL]                 Node unstubCall = IR.call(IR.name(UNSTUB_METHOD_NAME), IR.number(stubId), value); [EOL]                 unstubCall.putBooleanProp(Node.FREE_CALL, true); [EOL]                 unstubParent.addChildToFront(IR.exprResult(IR.assign(IR.getprop(proto.cloneTree(), IR.string(nameInfo.name)), unstubCall)).copyInformationFromForTree(value)); [EOL]                 compiler.reportCodeChange(); [EOL]             } [EOL]         } [EOL]     } [EOL]     if (!hasStubDeclaration && idGenerator.hasGeneratedAnyIds()) { [EOL]         Node declarations = compiler.parseSyntheticCode(STUB_DECLARATIONS); [EOL]         compiler.getNodeForCodeInsertion(null).addChildrenToFront(declarations.removeChildren()); [EOL]     } [EOL] } <line_num>: 92,195
boolean hasGeneratedAnyIds() { [EOL]     return currentId != 0; [EOL] } <line_num>: 209,211
int newId() { [EOL]     return currentId++; [EOL] } <line_num>: 216,218