public Foo()
public Foo(int key, long value)
public StringHolder(String string)
public StringHolder(String part1, String part2)
private DataHolder()
public DataHolder(String data)
private DataHolderWrapper()
public DataHolderWrapper(DataHolder data)
protected void setUp() throws Exception
public JsonElement serialize(ClassWithCustomTypeConverter src, Type typeOfSrc, JsonSerializationContext context)
public void testCustomSerializers()
public ClassWithCustomTypeConverter deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
public void testCustomDeserializers()
public void disable_testCustomSerializersOfSelf()
public void disable_testCustomDeserializersOfSelf()
public JsonElement serialize(BagOfPrimitives src, Type typeOfSrc, JsonSerializationContext context)
public void testCustomNestedSerializers()
public BagOfPrimitives deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException
public void testCustomNestedDeserializers()
public JsonElement serialize(Base src, Type typeOfSrc, JsonSerializationContext context)
public void testCustomTypeAdapterDoesNotAppliesToSubClasses()
public JsonElement serialize(Base src, Type typeOfSrc, JsonSerializationContext context)
public void testCustomTypeAdapterAppliesToSubClassesSerializedAsBaseClass()
private Gson createGsonObjectWithFooTypeAdapter()
public Foo deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException
public JsonElement serialize(Foo src, Type typeOfSrc, JsonSerializationContext context)
public JsonElement serialize(Long src, Type typeOfSrc, JsonSerializationContext context)
public void testCustomSerializerForLong()
public Long deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException
public void testCustomDeserializerForLong()
public JsonElement serialize(byte[] src, Type typeOfSrc, JsonSerializationContext context)
public void testCustomByteArraySerializer()
public byte[] deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException
public void testCustomByteArrayDeserializerAndInstanceCreator()
public StringHolder createInstance(Type type)
public StringHolder deserialize(JsonElement src, Type type, JsonDeserializationContext context)
public JsonElement serialize(StringHolder src, Type typeOfSrc, JsonSerializationContext context)
public void testCustomAdapterInvokedForCollectionElementSerializationWithType()
public void testCustomAdapterInvokedForCollectionElementSerialization()
public void testCustomAdapterInvokedForCollectionElementDeserialization()
public void testCustomAdapterInvokedForMapElementSerializationWithType()
public void testCustomAdapterInvokedForMapElementSerialization()
public void testCustomAdapterInvokedForMapElementDeserialization()
public void testEnsureCustomSerializerNotInvokedForNullValues()
public void testEnsureCustomDeserializerNotInvokedForNullValues()
public JsonElement serialize(DataHolder src, Type typeOfSrc, JsonSerializationContext context)
public DataHolder deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException
GsonBuilder builder
