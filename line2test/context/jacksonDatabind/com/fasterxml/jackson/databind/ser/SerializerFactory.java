public abstract SerializerFactory withAdditionalSerializers(Serializers additional)
public abstract SerializerFactory withAdditionalKeySerializers(Serializers additional)
public abstract SerializerFactory withSerializerModifier(BeanSerializerModifier modifier)
public JsonSerializer<Object> createSerializer(SerializerProvider prov, JavaType baseType, BeanProperty property) throws JsonMappingException
public abstract JsonSerializer<Object> createSerializer(SerializerProvider prov, JavaType baseType) throws JsonMappingException
public abstract TypeSerializer createTypeSerializer(SerializationConfig config, JavaType baseType) throws JsonMappingException
public abstract JsonSerializer<Object> createKeySerializer(SerializationConfig config, JavaType baseType, JsonSerializer<Object> defaultImpl) throws JsonMappingException
public JsonSerializer<Object> createKeySerializer(SerializationConfig config, JavaType baseType) throws JsonMappingException
