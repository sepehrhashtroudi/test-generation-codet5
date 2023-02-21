protected TypeDeserializerBase(JavaType baseType, TypeIdResolver idRes, String typePropertyName, boolean typeIdVisible, Class<?> defaultImpl) { [EOL]     _baseType = baseType; [EOL]     _idResolver = idRes; [EOL]     _typePropertyName = typePropertyName; [EOL]     _typeIdVisible = typeIdVisible; [EOL]     _deserializers = new HashMap<String, JsonDeserializer<Object>>(); [EOL]     if (defaultImpl == null) { [EOL]         _defaultImpl = null; [EOL]     } else { [EOL]         _defaultImpl = baseType.forcedNarrowBy(defaultImpl); [EOL]     } [EOL]     _property = null; [EOL] } <line_num>: 69,88
protected TypeDeserializerBase(TypeDeserializerBase src, BeanProperty property) { [EOL]     _baseType = src._baseType; [EOL]     _idResolver = src._idResolver; [EOL]     _typePropertyName = src._typePropertyName; [EOL]     _typeIdVisible = src._typeIdVisible; [EOL]     _deserializers = src._deserializers; [EOL]     _defaultImpl = src._defaultImpl; [EOL]     _defaultImplDeserializer = src._defaultImplDeserializer; [EOL]     _property = property; [EOL] } <line_num>: 90,101
@Override [EOL] public abstract TypeDeserializer forProperty(BeanProperty prop); <line_num>: 103,104
@Override [EOL] public abstract JsonTypeInfo.As getTypeInclusion(); <line_num>: 112,113
public String baseTypeName() { [EOL]     return _baseType.getRawClass().getName(); [EOL] } <line_num>: 115,115
@Override [EOL] public final String getPropertyName() { [EOL]     return _typePropertyName; [EOL] } <line_num>: 117,118
@Override [EOL] public TypeIdResolver getTypeIdResolver() { [EOL]     return _idResolver; [EOL] } <line_num>: 120,121
@Override [EOL] public Class<?> getDefaultImpl() { [EOL]     return (_defaultImpl == null) ? null : _defaultImpl.getRawClass(); [EOL] } <line_num>: 123,126
@Override [EOL] public String toString() { [EOL]     StringBuilder sb = new StringBuilder(); [EOL]     sb.append('[').append(getClass().getName()); [EOL]     sb.append("; base-type:").append(_baseType); [EOL]     sb.append("; id-resolver: ").append(_idResolver); [EOL]     sb.append(']'); [EOL]     return sb.toString(); [EOL] } <line_num>: 128,137
protected final JsonDeserializer<Object> _findDeserializer(DeserializationContext ctxt, String typeId) throws IOException, JsonProcessingException { [EOL]     JsonDeserializer<Object> deser; [EOL]     synchronized (_deserializers) { [EOL]         deser = _deserializers.get(typeId); [EOL]         if (deser == null) { [EOL]             JavaType type = _idResolver.typeFromId(typeId); [EOL]             if (type == null) { [EOL]                 if (_defaultImpl == null) { [EOL]                     throw ctxt.unknownTypeException(_baseType, typeId); [EOL]                 } [EOL]                 deser = _findDefaultImplDeserializer(ctxt); [EOL]             } else { [EOL]                 if (_baseType != null && _baseType.getClass() == type.getClass()) { [EOL]                     type = _baseType.narrowBy(type.getRawClass()); [EOL]                 } [EOL]                 deser = ctxt.findContextualValueDeserializer(type, _property); [EOL]             } [EOL]             _deserializers.put(typeId, deser); [EOL]         } [EOL]     } [EOL]     return deser; [EOL] } <line_num>: 145,179
protected final JsonDeserializer<Object> _findDefaultImplDeserializer(DeserializationContext ctxt) throws IOException, JsonProcessingException { [EOL]     if (_defaultImpl == null) { [EOL]         if (!ctxt.isEnabled(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE)) { [EOL]             return NullifyingDeserializer.instance; [EOL]         } [EOL]         return null; [EOL]     } [EOL]     if (_defaultImpl.getRawClass() == NoClass.class) { [EOL]         return NullifyingDeserializer.instance; [EOL]     } [EOL]     synchronized (_defaultImpl) { [EOL]         if (_defaultImplDeserializer == null) { [EOL]             _defaultImplDeserializer = ctxt.findContextualValueDeserializer(_defaultImpl, _property); [EOL]         } [EOL]         return _defaultImplDeserializer; [EOL]     } [EOL] } <line_num>: 181,205