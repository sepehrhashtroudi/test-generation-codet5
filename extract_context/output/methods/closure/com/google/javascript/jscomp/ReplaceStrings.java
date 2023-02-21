Config(String name, int parameter) { [EOL]     this.name = name; [EOL]     this.parameter = parameter; [EOL] } <line_num>: 82,85
Result(String original, String replacement) { [EOL]     this.original = original; [EOL]     this.replacement = replacement; [EOL] } <line_num>: 98,101
Location(String sourceFile, int line, int column) { [EOL]     this.sourceFile = sourceFile; [EOL]     this.line = line; [EOL]     this.column = column; [EOL] } <line_num>: 115,119
ReplaceStrings(AbstractCompiler compiler, String placeholderToken, List<String> functionsToInspect, Set<String> blacklisted, VariableMap previousMappings) { [EOL]     this.compiler = compiler; [EOL]     this.placeholderToken = placeholderToken.isEmpty() ? DEFAULT_PLACEHOLDER_TOKEN : placeholderToken; [EOL]     this.registry = compiler.getTypeRegistry(); [EOL]     Iterable<String> reservedNames = blacklisted; [EOL]     if (previousMappings != null) { [EOL]         Set<String> previous = previousMappings.getOriginalNameToNewNameMap().keySet(); [EOL]         reservedNames = Iterables.concat(blacklisted, previous); [EOL]         initMapping(previousMappings, blacklisted); [EOL]     } [EOL]     this.nameGenerator = createNameGenerator(reservedNames); [EOL]     parseConfiguration(functionsToInspect); [EOL] } <line_num>: 134,155
void addLocation(Node n) { [EOL]     replacementLocations.add(new Location(n.getSourceFileName(), n.getLineno(), n.getCharno())); [EOL] } <line_num>: 103,107
private void initMapping(VariableMap previousVarMap, Set<String> reservedNames) { [EOL]     Map<String, String> previous = previousVarMap.getOriginalNameToNewNameMap(); [EOL]     for (Map.Entry<String, String> entry : previous.entrySet()) { [EOL]         String key = entry.getKey(); [EOL]         if (!reservedNames.contains(key)) { [EOL]             String value = entry.getValue(); [EOL]             results.put(value, new Result(value, key)); [EOL]         } [EOL]     } [EOL] } <line_num>: 157,167
@Override [EOL] public boolean apply(Result result) { [EOL]     return !result.replacementLocations.isEmpty(); [EOL] } <line_num>: 170,175
List<Result> getResult() { [EOL]     return ImmutableList.copyOf(Iterables.filter(results.values(), USED_RESULTS)); [EOL] } <line_num>: 179,182
VariableMap getStringMap() { [EOL]     ImmutableMap.Builder<String, String> map = ImmutableMap.builder(); [EOL]     for (Result result : Iterables.filter(results.values(), USED_RESULTS)) { [EOL]         map.put(result.replacement, result.original); [EOL]     } [EOL]     VariableMap stringMap = new VariableMap(map.build()); [EOL]     return stringMap; [EOL] } <line_num>: 185,193
@Override [EOL] public void process(Node externs, Node root) { [EOL]     NodeTraversal.traverse(compiler, root, this); [EOL] } <line_num>: 195,198
@Override [EOL] public void visit(NodeTraversal t, Node n, Node parent) { [EOL]     switch(n.getType()) { [EOL]         case Token.NEW: [EOL]         case Token.CALL: [EOL]             Node calledFn = n.getFirstChild(); [EOL]             String name = calledFn.getQualifiedName(); [EOL]             if (name != null) { [EOL]                 Config config = findMatching(name); [EOL]                 if (config != null) { [EOL]                     doSubstitutions(t, config, n); [EOL]                     return; [EOL]                 } [EOL]             } [EOL]             if (NodeUtil.isGet(calledFn)) { [EOL]                 Node rhs = calledFn.getLastChild(); [EOL]                 if (rhs.isName() || rhs.isString()) { [EOL]                     String methodName = rhs.getString(); [EOL]                     Collection<String> classes = methods.get(methodName); [EOL]                     if (classes != null) { [EOL]                         Node lhs = calledFn.getFirstChild(); [EOL]                         if (lhs.getJSType() != null) { [EOL]                             JSType type = lhs.getJSType().restrictByNotNullOrUndefined(); [EOL]                             Config config = findMatchingClass(type, classes); [EOL]                             if (config != null) { [EOL]                                 doSubstitutions(t, config, n); [EOL]                                 return; [EOL]                             } [EOL]                         } [EOL]                     } [EOL]                 } [EOL]             } [EOL]             break; [EOL]     } [EOL] } <line_num>: 200,240
private Config findMatching(String name) { [EOL]     Config config = functions.get(name); [EOL]     if (config == null) { [EOL]         name = name.replace('$', '.'); [EOL]         config = functions.get(name); [EOL]     } [EOL]     return config; [EOL] } <line_num>: 246,253
private Config findMatchingClass(JSType callClassType, Collection<String> declarationNames) { [EOL]     if (!callClassType.isNoObjectType() && !callClassType.isUnknownType()) { [EOL]         for (String declarationName : declarationNames) { [EOL]             String className = getClassFromDeclarationName(declarationName); [EOL]             JSType methodClassType = registry.getType(className); [EOL]             if (methodClassType != null && callClassType.isSubtype(methodClassType)) { [EOL]                 return functions.get(declarationName); [EOL]             } [EOL]         } [EOL]     } [EOL]     return null; [EOL] } <line_num>: 259,272
private void doSubstitutions(NodeTraversal t, Config config, Node n) { [EOL]     Preconditions.checkState(n.isNew() || n.isCall()); [EOL]     if (config.parameter != Config.REPLACE_ALL_VALUE) { [EOL]         Node arg = n.getChildAtIndex(config.parameter); [EOL]         if (arg != null) { [EOL]             replaceExpression(t, arg, n); [EOL]         } [EOL]     } else { [EOL]         Node firstParam = n.getFirstChild().getNext(); [EOL]         for (Node arg = firstParam; arg != null; arg = arg.getNext()) { [EOL]             arg = replaceExpression(t, arg, n); [EOL]         } [EOL]     } [EOL] } <line_num>: 277,294
private Node replaceExpression(NodeTraversal t, Node expr, Node parent) { [EOL]     Node replacement; [EOL]     String key = null; [EOL]     String replacementString; [EOL]     switch(expr.getType()) { [EOL]         case Token.STRING: [EOL]             key = expr.getString(); [EOL]             replacementString = getReplacement(key); [EOL]             replacement = IR.string(replacementString); [EOL]             break; [EOL]         case Token.ADD: [EOL]             StringBuilder keyBuilder = new StringBuilder(); [EOL]             Node keyNode = IR.string(""); [EOL]             replacement = buildReplacement(expr, keyNode, keyBuilder); [EOL]             key = keyBuilder.toString(); [EOL]             replacementString = getReplacement(key); [EOL]             keyNode.setString(replacementString); [EOL]             break; [EOL]         case Token.NAME: [EOL]             Scope.Var var = t.getScope().getVar(expr.getString()); [EOL]             if (var != null && var.isConst()) { [EOL]                 Node value = var.getInitialValue(); [EOL]                 if (value != null && value.isString()) { [EOL]                     key = value.getString(); [EOL]                     replacementString = getReplacement(key); [EOL]                     replacement = IR.string(replacementString); [EOL]                     break; [EOL]                 } [EOL]             } [EOL]             return expr; [EOL]         default: [EOL]             return expr; [EOL]     } [EOL]     Preconditions.checkNotNull(key); [EOL]     Preconditions.checkNotNull(replacementString); [EOL]     recordReplacement(expr, key, replacementString); [EOL]     parent.replaceChild(expr, replacement); [EOL]     compiler.reportCodeChange(); [EOL]     return replacement; [EOL] } <line_num>: 305,349
private String getReplacement(String key) { [EOL]     Result result = results.get(key); [EOL]     if (result != null) { [EOL]         return result.replacement; [EOL]     } [EOL]     String replacement = nameGenerator.generateNextName(); [EOL]     result = new Result(key, replacement); [EOL]     results.put(key, result); [EOL]     return replacement; [EOL] } <line_num>: 354,364
private void recordReplacement(Node n, String key, String replacement) { [EOL]     Result result = results.get(key); [EOL]     Preconditions.checkState(result != null); [EOL]     result.addLocation(n); [EOL] } <line_num>: 369,374
private Node buildReplacement(Node expr, Node prefix, StringBuilder keyBuilder) { [EOL]     switch(expr.getType()) { [EOL]         case Token.ADD: [EOL]             Node left = expr.getFirstChild(); [EOL]             Node right = left.getNext(); [EOL]             prefix = buildReplacement(left, prefix, keyBuilder); [EOL]             return buildReplacement(right, prefix, keyBuilder); [EOL]         case Token.STRING: [EOL]             keyBuilder.append(expr.getString()); [EOL]             return prefix; [EOL]         default: [EOL]             keyBuilder.append(placeholderToken); [EOL]             prefix = IR.add(prefix, IR.string(placeholderToken)); [EOL]             return IR.add(prefix, expr.cloneTree()); [EOL]     } [EOL] } <line_num>: 389,405
private String getMethodFromDeclarationName(String fullDeclarationName) { [EOL]     String[] parts = fullDeclarationName.split("\\.prototype\\."); [EOL]     Preconditions.checkState(parts.length == 1 || parts.length == 2); [EOL]     if (parts.length == 2) { [EOL]         return parts[1]; [EOL]     } [EOL]     return null; [EOL] } <line_num>: 410,417
private String getClassFromDeclarationName(String fullDeclarationName) { [EOL]     String[] parts = fullDeclarationName.split("\\.prototype\\."); [EOL]     Preconditions.checkState(parts.length == 1 || parts.length == 2); [EOL]     if (parts.length == 2) { [EOL]         return parts[0]; [EOL]     } [EOL]     return null; [EOL] } <line_num>: 422,429
private void parseConfiguration(List<String> functionsToInspect) { [EOL]     for (String function : functionsToInspect) { [EOL]         Config config = parseConfiguration(function); [EOL]         functions.put(config.name, config); [EOL]         String method = getMethodFromDeclarationName(config.name); [EOL]         if (method != null) { [EOL]             methods.put(method, config.name); [EOL]         } [EOL]     } [EOL] } <line_num>: 435,445
private Config parseConfiguration(String function) { [EOL]     int first = function.indexOf('('); [EOL]     int last = function.indexOf(')'); [EOL]     Preconditions.checkState(first != -1 && last != -1); [EOL]     String name = function.substring(0, first); [EOL]     String params = function.substring(first + 1, last); [EOL]     int paramCount = 0; [EOL]     int replacementParameter = -1; [EOL]     String[] parts = params.split(","); [EOL]     for (String param : parts) { [EOL]         paramCount++; [EOL]         if (param.equals(REPLACE_ALL_MARKER)) { [EOL]             Preconditions.checkState(paramCount == 1 && parts.length == 1); [EOL]             replacementParameter = Config.REPLACE_ALL_VALUE; [EOL]         } else if (param.equals(REPLACE_ONE_MARKER)) { [EOL]             Preconditions.checkState(replacementParameter == -1); [EOL]             replacementParameter = paramCount; [EOL]         } else { [EOL]             Preconditions.checkState(param.isEmpty(), "Unknown marker", param); [EOL]         } [EOL]     } [EOL]     Preconditions.checkState(replacementParameter != -1); [EOL]     return new Config(name, replacementParameter); [EOL] } <line_num>: 456,487
private static NameGenerator createNameGenerator(Iterable<String> reserved) { [EOL]     final String namePrefix = ""; [EOL]     final char[] reservedChars = new char[0]; [EOL]     return new NameGenerator(ImmutableSet.copyOf(reserved), namePrefix, reservedChars); [EOL] } <line_num>: 493,498