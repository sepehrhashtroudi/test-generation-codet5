@SuppressWarnings("unchecked") [EOL] protected ObjectIdWriter(JavaType t, SerializedString propName, ObjectIdGenerator<?> gen, JsonSerializer<?> ser, boolean alwaysAsId) { [EOL]     idType = t; [EOL]     propertyName = propName; [EOL]     generator = gen; [EOL]     serializer = (JsonSerializer<Object>) ser; [EOL]     this.alwaysAsId = alwaysAsId; [EOL] } <line_num>: 49,58
public static ObjectIdWriter construct(JavaType idType, String propName, ObjectIdGenerator<?> generator, boolean alwaysAsId) { [EOL]     SerializedString serName = (propName == null) ? null : new SerializedString(propName); [EOL]     return new ObjectIdWriter(idType, serName, generator, null, alwaysAsId); [EOL] } <line_num>: 65,70
public ObjectIdWriter withSerializer(JsonSerializer<?> ser) { [EOL]     return new ObjectIdWriter(idType, propertyName, generator, ser, alwaysAsId); [EOL] } <line_num>: 72,74
public ObjectIdWriter withAlwaysAsId(boolean newState) { [EOL]     if (newState == alwaysAsId) { [EOL]         return this; [EOL]     } [EOL]     return new ObjectIdWriter(idType, propertyName, generator, serializer, newState); [EOL] } <line_num>: 79,84
