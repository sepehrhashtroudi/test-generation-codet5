public UnwrappingBeanPropertyWriter(BeanPropertyWriter base, NameTransformer unwrapper) { [EOL]     super(base); [EOL]     _nameTransformer = unwrapper; [EOL] } <line_num>: 32,35
private UnwrappingBeanPropertyWriter(UnwrappingBeanPropertyWriter base, NameTransformer transformer, SerializedString name) { [EOL]     super(base, name); [EOL]     _nameTransformer = transformer; [EOL] } <line_num>: 37,41
@Override [EOL] public UnwrappingBeanPropertyWriter rename(NameTransformer transformer) { [EOL]     String oldName = _name.getValue(); [EOL]     String newName = transformer.transform(oldName); [EOL]     transformer = NameTransformer.chainedTransformer(transformer, _nameTransformer); [EOL]     return new UnwrappingBeanPropertyWriter(this, transformer, new SerializedString(newName)); [EOL] } <line_num>: 43,53
@Override [EOL] public void serializeAsField(Object bean, JsonGenerator jgen, SerializerProvider prov) throws Exception { [EOL]     Object value = get(bean); [EOL]     if (value == null) { [EOL]         return; [EOL]     } [EOL]     JsonSerializer<Object> ser = _serializer; [EOL]     if (ser == null) { [EOL]         Class<?> cls = value.getClass(); [EOL]         PropertySerializerMap map = _dynamicSerializers; [EOL]         ser = map.serializerFor(cls); [EOL]         if (ser == null) { [EOL]             ser = _findAndAddDynamic(map, cls, prov); [EOL]         } [EOL]     } [EOL]     if (_suppressableValue != null) { [EOL]         if (MARKER_FOR_EMPTY == _suppressableValue) { [EOL]             if (ser.isEmpty(value)) { [EOL]                 return; [EOL]             } [EOL]         } else if (_suppressableValue.equals(value)) { [EOL]             return; [EOL]         } [EOL]     } [EOL]     if (value == bean) { [EOL]         _handleSelfReference(bean, ser); [EOL]     } [EOL]     if (!ser.isUnwrappingSerializer()) { [EOL]         jgen.writeFieldName(_name); [EOL]     } [EOL]     if (_typeSerializer == null) { [EOL]         ser.serialize(value, jgen, prov); [EOL]     } else { [EOL]         ser.serializeWithType(value, jgen, prov, _typeSerializer); [EOL]     } [EOL] } <line_num>: 61,104
@Override [EOL] public void assignSerializer(JsonSerializer<Object> ser) { [EOL]     super.assignSerializer(ser); [EOL]     if (_serializer != null) { [EOL]         NameTransformer t = _nameTransformer; [EOL]         if (_serializer.isUnwrappingSerializer()) { [EOL]             t = NameTransformer.chainedTransformer(t, ((UnwrappingBeanSerializer) _serializer)._nameTransformer); [EOL]         } [EOL]         _serializer = _serializer.unwrappingSerializer(t); [EOL]     } [EOL] } <line_num>: 107,118
@Override [EOL] protected JsonSerializer<Object> _findAndAddDynamic(PropertySerializerMap map, Class<?> type, SerializerProvider provider) throws JsonMappingException { [EOL]     JsonSerializer<Object> serializer; [EOL]     if (_nonTrivialBaseType != null) { [EOL]         JavaType subtype = provider.constructSpecializedType(_nonTrivialBaseType, type); [EOL]         serializer = provider.findValueSerializer(subtype, this); [EOL]     } else { [EOL]         serializer = provider.findValueSerializer(type, this); [EOL]     } [EOL]     NameTransformer t = _nameTransformer; [EOL]     if (serializer.isUnwrappingSerializer()) { [EOL]         t = NameTransformer.chainedTransformer(t, ((UnwrappingBeanSerializer) serializer)._nameTransformer); [EOL]     } [EOL]     serializer = serializer.unwrappingSerializer(t); [EOL]     _dynamicSerializers = _dynamicSerializers.newWith(type, serializer); [EOL]     return serializer; [EOL] } <line_num>: 121,140