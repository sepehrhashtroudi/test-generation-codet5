@SuppressWarnings("unchecked") [EOL] protected ObjectIdReader(JavaType t, String propName, ObjectIdGenerator<?> gen, JsonDeserializer<?> deser, SettableBeanProperty idProp) { [EOL]     idType = t; [EOL]     propertyName = propName; [EOL]     generator = gen; [EOL]     deserializer = (JsonDeserializer<Object>) deser; [EOL]     idProperty = idProp; [EOL] } <line_num>: 40,49
public static ObjectIdReader construct(JavaType idType, String propName, ObjectIdGenerator<?> generator, JsonDeserializer<?> deser, SettableBeanProperty idProp) { [EOL]     return new ObjectIdReader(idType, propName, generator, deser, idProp); [EOL] } <line_num>: 56,61