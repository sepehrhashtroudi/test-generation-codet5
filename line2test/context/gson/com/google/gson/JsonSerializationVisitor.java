 JsonSerializationVisitor(ObjectNavigatorFactory factory, boolean serializeNulls, ParameterizedTypeHandlerMap<JsonSerializer<?>> serializers, JsonSerializationContext context, MemoryRefStack ancestors)
public Object getTarget()
public void start(ObjectTypePair node)
public void end(ObjectTypePair node)
public void startVisitingObject(Object node)
public void visitArray(Object array, Type arrayType)
public void visitArrayField(FieldAttributes f, Type typeOfF, Object obj)
public void visitObjectField(FieldAttributes f, Type typeOfF, Object obj)
public void visitPrimitive(Object obj)
private void addAsChildOfObject(FieldAttributes f, ObjectTypePair fieldValuePair)
private void addChildAsElement(FieldAttributes f, JsonElement childElement)
private void addAsArrayElement(ObjectTypePair elementTypePair)
private JsonElement getJsonElementForChild(ObjectTypePair fieldValueTypePair)
public boolean visitUsingCustomHandler(ObjectTypePair objTypePair)
private JsonElement findAndInvokeCustomSerializer(ObjectTypePair objTypePair)
public boolean visitFieldUsingCustomHandler(FieldAttributes f, Type declaredTypeOfField, Object parent)
private void assignToRoot(JsonElement newRoot)
private boolean isFieldNull(FieldAttributes f, Object obj)
private Object getFieldValue(FieldAttributes f, Object obj)
public JsonElement getJsonElement()
ObjectNavigatorFactory factory
ParameterizedTypeHandlerMap<JsonSerializer<?>> serializers
boolean serializeNulls
JsonSerializationContext context
MemoryRefStack ancestors
JsonElement root
