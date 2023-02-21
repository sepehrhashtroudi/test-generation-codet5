 Config(String name, int parameter)
 Result(String original, String replacement)
 Location(String sourceFile, int line, int column)
 ReplaceStrings(AbstractCompiler compiler, String placeholderToken, List<String> functionsToInspect, Set<String> blacklisted, VariableMap previousMappings)
 void addLocation(Node n)
private void initMapping(VariableMap previousVarMap, Set<String> reservedNames)
public boolean apply(Result result)
 List<Result> getResult()
 VariableMap getStringMap()
public void process(Node externs, Node root)
public void visit(NodeTraversal t, Node n, Node parent)
private Config findMatching(String name)
private Config findMatchingClass(JSType callClassType, Collection<String> declarationNames)
private void doSubstitutions(NodeTraversal t, Config config, Node n)
private Node replaceExpression(NodeTraversal t, Node expr, Node parent)
private String getReplacement(String key)
private void recordReplacement(Node n, String key, String replacement)
private Node buildReplacement(Node expr, Node prefix, StringBuilder keyBuilder)
private String getMethodFromDeclarationName(String fullDeclarationName)
private String getClassFromDeclarationName(String fullDeclarationName)
private void parseConfiguration(List<String> functionsToInspect)
private Config parseConfiguration(String function)
private static NameGenerator createNameGenerator(Iterable<String> reserved)