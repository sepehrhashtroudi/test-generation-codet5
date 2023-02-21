@Override [EOL] public void setUp() throws Exception { [EOL]     super.setUp(); [EOL]     B.addDependency(A); [EOL]     C.addDependency(A); [EOL]     D.addDependency(B); [EOL]     E.addDependency(B); [EOL]     E.addDependency(C); [EOL]     F.addDependency(A); [EOL]     F.addDependency(C); [EOL]     F.addDependency(E); [EOL]     graph = new JSModuleGraph(new JSModule[] { A, B, C, D, E, F }); [EOL]     compiler = new Compiler(); [EOL] } <line_num>: 48,61
public void testModuleDepth() { [EOL]     assertEquals("A should have depth 0", 0, A.getDepth()); [EOL]     assertEquals("B should have depth 1", 1, B.getDepth()); [EOL]     assertEquals("C should have depth 1", 1, C.getDepth()); [EOL]     assertEquals("D should have depth 2", 2, D.getDepth()); [EOL]     assertEquals("E should have depth 2", 2, E.getDepth()); [EOL]     assertEquals("F should have depth 3", 3, F.getDepth()); [EOL] } <line_num>: 63,70
public void testDeepestCommonDep() { [EOL]     assertDeepestCommonDep(null, A, A); [EOL]     assertDeepestCommonDep(null, A, B); [EOL]     assertDeepestCommonDep(null, A, C); [EOL]     assertDeepestCommonDep(null, A, D); [EOL]     assertDeepestCommonDep(null, A, E); [EOL]     assertDeepestCommonDep(null, A, F); [EOL]     assertDeepestCommonDep(A, B, B); [EOL]     assertDeepestCommonDep(A, B, C); [EOL]     assertDeepestCommonDep(A, B, D); [EOL]     assertDeepestCommonDep(A, B, E); [EOL]     assertDeepestCommonDep(A, B, F); [EOL]     assertDeepestCommonDep(A, C, C); [EOL]     assertDeepestCommonDep(A, C, D); [EOL]     assertDeepestCommonDep(A, C, E); [EOL]     assertDeepestCommonDep(A, C, F); [EOL]     assertDeepestCommonDep(B, D, D); [EOL]     assertDeepestCommonDep(B, D, E); [EOL]     assertDeepestCommonDep(B, D, F); [EOL]     assertDeepestCommonDep(C, E, E); [EOL]     assertDeepestCommonDep(C, E, F); [EOL]     assertDeepestCommonDep(E, F, F); [EOL] } <line_num>: 72,94
public void testDeepestCommonDepInclusive() { [EOL]     assertDeepestCommonDepInclusive(A, A, A); [EOL]     assertDeepestCommonDepInclusive(A, A, B); [EOL]     assertDeepestCommonDepInclusive(A, A, C); [EOL]     assertDeepestCommonDepInclusive(A, A, D); [EOL]     assertDeepestCommonDepInclusive(A, A, E); [EOL]     assertDeepestCommonDepInclusive(A, A, F); [EOL]     assertDeepestCommonDepInclusive(B, B, B); [EOL]     assertDeepestCommonDepInclusive(A, B, C); [EOL]     assertDeepestCommonDepInclusive(B, B, D); [EOL]     assertDeepestCommonDepInclusive(B, B, E); [EOL]     assertDeepestCommonDepInclusive(B, B, F); [EOL]     assertDeepestCommonDepInclusive(C, C, C); [EOL]     assertDeepestCommonDepInclusive(A, C, D); [EOL]     assertDeepestCommonDepInclusive(C, C, E); [EOL]     assertDeepestCommonDepInclusive(C, C, F); [EOL]     assertDeepestCommonDepInclusive(D, D, D); [EOL]     assertDeepestCommonDepInclusive(B, D, E); [EOL]     assertDeepestCommonDepInclusive(B, D, F); [EOL]     assertDeepestCommonDepInclusive(E, E, E); [EOL]     assertDeepestCommonDepInclusive(E, E, F); [EOL]     assertDeepestCommonDepInclusive(F, F, F); [EOL] } <line_num>: 96,118
public void testGetTransitiveDepsDeepestFirst() { [EOL]     assertTransitiveDepsDeepestFirst(A); [EOL]     assertTransitiveDepsDeepestFirst(B, A); [EOL]     assertTransitiveDepsDeepestFirst(C, A); [EOL]     assertTransitiveDepsDeepestFirst(D, B, A); [EOL]     assertTransitiveDepsDeepestFirst(E, C, B, A); [EOL]     assertTransitiveDepsDeepestFirst(F, E, C, B, A); [EOL] } <line_num>: 120,127
public void testCoalesceDuplicateFiles() { [EOL]     A.add(SourceFile.fromCode("a.js", "")); [EOL]     B.add(SourceFile.fromCode("a.js", "")); [EOL]     B.add(SourceFile.fromCode("b.js", "")); [EOL]     C.add(SourceFile.fromCode("b.js", "")); [EOL]     C.add(SourceFile.fromCode("c.js", "")); [EOL]     E.add(SourceFile.fromCode("c.js", "")); [EOL]     E.add(SourceFile.fromCode("d.js", "")); [EOL]     graph.coalesceDuplicateFiles(); [EOL]     assertEquals(2, A.getInputs().size()); [EOL]     assertEquals("a.js", A.getInputs().get(0).getName()); [EOL]     assertEquals("b.js", A.getInputs().get(1).getName()); [EOL]     assertEquals(0, B.getInputs().size()); [EOL]     assertEquals(1, C.getInputs().size()); [EOL]     assertEquals("c.js", C.getInputs().get(0).getName()); [EOL]     assertEquals(1, E.getInputs().size()); [EOL]     assertEquals("d.js", E.getInputs().get(0).getName()); [EOL] } <line_num>: 129,151
public void testManageDependencies1() throws Exception { [EOL]     List<CompilerInput> inputs = setUpManageDependenciesTest(); [EOL]     List<CompilerInput> results = graph.manageDependencies(ImmutableList.<String>of(), inputs); [EOL]     assertInputs(A, "a1", "a3"); [EOL]     assertInputs(B, "a2", "b2"); [EOL]     assertInputs(C); [EOL]     assertInputs(E, "c1", "e1", "e2"); [EOL]     assertEquals(Lists.newArrayList("a1", "a3", "a2", "b2", "c1", "e1", "e2"), sourceNames(results)); [EOL] } <line_num>: 153,166
public void testManageDependencies2() throws Exception { [EOL]     List<CompilerInput> inputs = setUpManageDependenciesTest(); [EOL]     List<CompilerInput> results = graph.manageDependencies(ImmutableList.<String>of("c2"), inputs); [EOL]     assertInputs(A, "a1", "a3"); [EOL]     assertInputs(B, "a2", "b2"); [EOL]     assertInputs(C, "c1", "c2"); [EOL]     assertInputs(E, "e1", "e2"); [EOL]     assertEquals(Lists.newArrayList("a1", "a3", "a2", "b2", "c1", "c2", "e1", "e2"), sourceNames(results)); [EOL] } <line_num>: 168,181
public void testManageDependencies3() throws Exception { [EOL]     List<CompilerInput> inputs = setUpManageDependenciesTest(); [EOL]     DependencyOptions depOptions = new DependencyOptions(); [EOL]     depOptions.setDependencySorting(true); [EOL]     depOptions.setDependencyPruning(true); [EOL]     depOptions.setMoocherDropping(true); [EOL]     depOptions.setEntryPoints(ImmutableList.<String>of("c2")); [EOL]     List<CompilerInput> results = graph.manageDependencies(depOptions, inputs); [EOL]     assertInputs(A); [EOL]     assertInputs(B); [EOL]     assertInputs(C, "a1", "c1", "c2"); [EOL]     assertInputs(E); [EOL]     assertEquals(Lists.newArrayList("a1", "c1", "c2"), sourceNames(results)); [EOL] } <line_num>: 183,203
public void testManageDependencies4() throws Exception { [EOL]     setUpManageDependenciesTest(); [EOL]     DependencyOptions depOptions = new DependencyOptions(); [EOL]     depOptions.setDependencySorting(true); [EOL]     List<CompilerInput> inputs = Lists.newArrayList(); [EOL]     inputs.addAll(E.getInputs()); [EOL]     inputs.addAll(B.getInputs()); [EOL]     inputs.addAll(A.getInputs()); [EOL]     inputs.addAll(C.getInputs()); [EOL]     List<CompilerInput> results = graph.manageDependencies(depOptions, inputs); [EOL]     assertInputs(A, "a1", "a2", "a3"); [EOL]     assertInputs(B, "b1", "b2"); [EOL]     assertInputs(C, "c1", "c2"); [EOL]     assertInputs(E, "e1", "e2"); [EOL]     assertEquals(Lists.newArrayList("a1", "a2", "a3", "b1", "b2", "c1", "c2", "e1", "e2"), sourceNames(results)); [EOL] } <line_num>: 205,230
public void testNoFiles() throws Exception { [EOL]     DependencyOptions depOptions = new DependencyOptions(); [EOL]     depOptions.setDependencySorting(true); [EOL]     List<CompilerInput> inputs = Lists.newArrayList(); [EOL]     List<CompilerInput> results = graph.manageDependencies(depOptions, inputs); [EOL]     assertTrue(results.isEmpty()); [EOL] } <line_num>: 232,240
public void testToJson() throws JSONException { [EOL]     JSONArray modules = graph.toJson(); [EOL]     assertEquals(6, modules.length()); [EOL]     for (int i = 0; i < modules.length(); i++) { [EOL]         JSONObject m = modules.getJSONObject(i); [EOL]         assertNotNull(m.getString("name")); [EOL]         assertNotNull(m.getJSONArray("dependencies")); [EOL]         assertNotNull(m.getJSONArray("transitive-dependencies")); [EOL]         assertNotNull(m.getJSONArray("inputs")); [EOL]     } [EOL]     JSONObject m = modules.getJSONObject(3); [EOL]     assertEquals("D", m.getString("name")); [EOL]     assertEquals("[\"B\"]", m.getJSONArray("dependencies").toString()); [EOL]     assertEquals(2, m.getJSONArray("transitive-dependencies").length()); [EOL]     assertEquals("[]", m.getJSONArray("inputs").toString()); [EOL] } <line_num>: 242,258
private List<CompilerInput> setUpManageDependenciesTest() { [EOL]     List<CompilerInput> inputs = Lists.newArrayList(); [EOL]     A.add(code("a1", provides("a1"), requires())); [EOL]     A.add(code("a2", provides("a2"), requires("a1"))); [EOL]     A.add(code("a3", provides(), requires("a1"))); [EOL]     B.add(code("b1", provides("b1"), requires("a2"))); [EOL]     B.add(code("b2", provides(), requires("a1", "a2"))); [EOL]     C.add(code("c1", provides("c1"), requires("a1"))); [EOL]     C.add(code("c2", provides("c2"), requires("c1"))); [EOL]     E.add(code("e1", provides(), requires("c1"))); [EOL]     E.add(code("e2", provides(), requires("c1"))); [EOL]     inputs.addAll(A.getInputs()); [EOL]     inputs.addAll(B.getInputs()); [EOL]     inputs.addAll(C.getInputs()); [EOL]     inputs.addAll(E.getInputs()); [EOL]     for (CompilerInput input : inputs) { [EOL]         input.setCompiler(compiler); [EOL]     } [EOL]     return inputs; [EOL] } <line_num>: 260,285
private void assertInputs(JSModule module, String... sourceNames) { [EOL]     List<CompilerInput> actualInputs = module.getInputs(); [EOL]     assertEquals(Lists.newArrayList(sourceNames), sourceNames(module.getInputs())); [EOL] } <line_num>: 287,293
private List<String> sourceNames(List<CompilerInput> inputs) { [EOL]     List<String> inputNames = Lists.newArrayList(); [EOL]     for (CompilerInput input : inputs) { [EOL]         inputNames.add(input.getName()); [EOL]     } [EOL]     return inputNames; [EOL] } <line_num>: 295,301
private SourceFile code(String sourceName, List<String> provides, List<String> requires) { [EOL]     String text = ""; [EOL]     for (String p : provides) { [EOL]         text += "goog.provide('" + p + "');\n"; [EOL]     } [EOL]     for (String r : requires) { [EOL]         text += "goog.require('" + r + "');\n"; [EOL]     } [EOL]     return SourceFile.fromCode(sourceName, text); [EOL] } <line_num>: 303,313
private List<String> provides(String... strings) { [EOL]     return Lists.newArrayList(strings); [EOL] } <line_num>: 315,317
private List<String> requires(String... strings) { [EOL]     return Lists.newArrayList(strings); [EOL] } <line_num>: 319,321
private void assertDeepestCommonDepInclusive(JSModule expected, JSModule m1, JSModule m2) { [EOL]     assertDeepestCommonDepOneWay(expected, m1, m2, true); [EOL]     assertDeepestCommonDepOneWay(expected, m2, m1, true); [EOL] } <line_num>: 323,327
private void assertDeepestCommonDep(JSModule expected, JSModule m1, JSModule m2) { [EOL]     assertDeepestCommonDepOneWay(expected, m1, m2, false); [EOL]     assertDeepestCommonDepOneWay(expected, m2, m1, false); [EOL] } <line_num>: 329,333
private void assertDeepestCommonDepOneWay(JSModule expected, JSModule m1, JSModule m2, boolean inclusive) { [EOL]     JSModule actual = inclusive ? graph.getDeepestCommonDependencyInclusive(m1, m2) : graph.getDeepestCommonDependency(m1, m2); [EOL]     if (actual != expected) { [EOL]         fail(String.format("Deepest common dep of %s and %s should be %s but was %s", m1.getName(), m2.getName(), expected == null ? "null" : expected.getName(), actual == null ? "null" : actual.getName())); [EOL]     } [EOL] } <line_num>: 335,347
private void assertTransitiveDepsDeepestFirst(JSModule m, JSModule... deps) { [EOL]     Iterable<JSModule> actual = graph.getTransitiveDepsDeepestFirst(m); [EOL]     assertEquals(Arrays.toString(deps), Arrays.toString(Iterables.toArray(actual, JSModule.class))); [EOL] } <line_num>: 349,353
