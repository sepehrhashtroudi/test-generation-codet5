UserDefinedExclusionStrategy(Class<?> excludedThisClass) { [EOL]     this.excludedThisClass = excludedThisClass; [EOL] } <line_num>: 66,68
public void testAnonymousLocalClassesSerialization() throws Exception { [EOL]     LinkedList<ExclusionStrategy> strategies = new LinkedList<ExclusionStrategy>(); [EOL]     strategies.add(new SyntheticFieldExclusionStrategy(true)); [EOL]     strategies.add(new ModifierBasedExclusionStrategy(Modifier.TRANSIENT, Modifier.STATIC)); [EOL]     ExclusionStrategy exclusionStrategy = new DisjunctionExclusionStrategy(strategies); [EOL]     Gson gson = new Gson(exclusionStrategy, exclusionStrategy, Gson.DEFAULT_NAMING_POLICY, new MappedObjectConstructor(DefaultTypeAdapters.getDefaultInstanceCreators()), false, DefaultTypeAdapters.getDefaultSerializers(), DefaultTypeAdapters.getDefaultDeserializers(), Gson.DEFAULT_JSON_NON_EXECUTABLE, true, false); [EOL]     assertEquals("{}", gson.toJson(new ClassWithNoFields() { [EOL]     })); [EOL] } <line_num>: 37,50
public void testUserDefinedExclusionPolicies() throws Exception { [EOL]     Gson gson = new GsonBuilder().setExclusionStrategies(new UserDefinedExclusionStrategy(String.class)).create(); [EOL]     String json = gson.toJson(new TestTypes.StringWrapper("someValue")); [EOL]     assertEquals("{}", json); [EOL] } <line_num>: 54,61
public boolean shouldSkipClass(Class<?> clazz) { [EOL]     return excludedThisClass.equals(clazz); [EOL] } <line_num>: 70,72
public boolean shouldSkipField(FieldAttributes f) { [EOL]     return excludedThisClass.equals(f.getDeclaredClass()); [EOL] } <line_num>: 74,76
