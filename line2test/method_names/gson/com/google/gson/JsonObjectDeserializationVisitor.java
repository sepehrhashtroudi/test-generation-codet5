 JsonObjectDeserializationVisitor(JsonElement json, Type type, ObjectNavigatorFactory factory, ObjectConstructor objectConstructor, ParameterizedTypeHandlerMap<JsonDeserializer<?>> deserializers, JsonDeserializationContext context)
protected T constructTarget()
public void startVisitingObject(Object node)
public void visitArray(Object array, Type componentType)
public void visitObjectField(FieldAttributes f, Type typeOfF, Object obj)
public void visitArrayField(FieldAttributes f, Type typeOfF, Object obj)
private String getFieldName(FieldAttributes f)
public boolean visitFieldUsingCustomHandler(FieldAttributes f, Type declaredTypeOfField, Object parent)
public void visitPrimitive(Object primitive)
