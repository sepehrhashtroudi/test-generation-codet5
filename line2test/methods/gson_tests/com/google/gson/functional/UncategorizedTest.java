Derived1() { [EOL]     opType = OperationType.OP1; [EOL] } <line_num>: 95,95
Derived2() { [EOL]     opType = OperationType.OP2; [EOL] } <line_num>: 98,98
@Override [EOL] protected void setUp() throws Exception { [EOL]     super.setUp(); [EOL]     gson = new Gson(); [EOL] } <line_num>: 41,45
public void testInvalidJsonDeserializationFails() throws Exception { [EOL]     try { [EOL]         gson.fromJson("adfasdf1112,,,\":", BagOfPrimitives.class); [EOL]         fail("Bad JSON should throw a ParseException"); [EOL]     } catch (JsonParseException expected) { [EOL]     } [EOL]     try { [EOL]         gson.fromJson("{adfasdf1112,,,\":}", BagOfPrimitives.class); [EOL]         fail("Bad JSON should throw a ParseException"); [EOL]     } catch (JsonParseException expected) { [EOL]     } [EOL] } <line_num>: 47,57
public void testObjectEqualButNotSameSerialization() throws Exception { [EOL]     ClassOverridingEquals objA = new ClassOverridingEquals(); [EOL]     ClassOverridingEquals objB = new ClassOverridingEquals(); [EOL]     objB.ref = objA; [EOL]     String json = gson.toJson(objB); [EOL]     assertEquals(objB.getExpectedJson(), json); [EOL] } <line_num>: 59,65
public void testStaticFieldsAreNotSerialized() { [EOL]     BagOfPrimitives target = new BagOfPrimitives(); [EOL]     assertFalse(gson.toJson(target).contains("DEFAULT_VALUE")); [EOL] } <line_num>: 67,70
public void testReturningDerivedClassesDuringDeserialization() { [EOL]     Gson gson = new GsonBuilder().registerTypeAdapter(Base.class, new BaseTypeAdapter()).create(); [EOL]     String json = "{\"opType\":\"OP1\"}"; [EOL]     Base base = gson.fromJson(json, Base.class); [EOL]     assertTrue(base instanceof Derived1); [EOL]     assertEquals(OperationType.OP1, base.opType); [EOL]     json = "{\"opType\":\"OP2\"}"; [EOL]     base = gson.fromJson(json, Base.class); [EOL]     assertTrue(base instanceof Derived2); [EOL]     assertEquals(OperationType.OP2, base.opType); [EOL] } <line_num>: 77,88
public Base deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException { [EOL]     String opTypeStr = json.getAsJsonObject().get("opType").getAsString(); [EOL]     OperationType opType = OperationType.valueOf(opTypeStr); [EOL]     switch(opType) { [EOL]         case OP1: [EOL]             return new Derived1(); [EOL]         case OP2: [EOL]             return new Derived2(); [EOL]     } [EOL]     throw new JsonParseException("unknown type: " + json); [EOL] } <line_num>: 101,112