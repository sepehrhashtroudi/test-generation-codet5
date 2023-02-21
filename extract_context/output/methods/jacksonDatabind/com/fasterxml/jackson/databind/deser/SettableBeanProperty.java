protected SettableBeanProperty(BeanPropertyDefinition propDef, JavaType type, TypeDeserializer typeDeser, Annotations contextAnnotations) { [EOL]     this(propDef.getName(), type, propDef.getWrapperName(), typeDeser, contextAnnotations, propDef.isRequired()); [EOL] } <line_num>: 120,125
@Deprecated [EOL] protected SettableBeanProperty(String propName, JavaType type, PropertyName wrapper, TypeDeserializer typeDeser, Annotations contextAnnotations) { [EOL]     this(propName, type, wrapper, typeDeser, contextAnnotations, false); [EOL] } <line_num>: 127,132
protected SettableBeanProperty(String propName, JavaType type, PropertyName wrapper, TypeDeserializer typeDeser, Annotations contextAnnotations, boolean isRequired) { [EOL]     if (propName == null || propName.length() == 0) { [EOL]         _propName = ""; [EOL]     } else { [EOL]         _propName = InternCache.instance.intern(propName); [EOL]     } [EOL]     _type = type; [EOL]     _wrapperName = wrapper; [EOL]     _isRequired = isRequired; [EOL]     _contextAnnotations = contextAnnotations; [EOL]     _viewMatcher = null; [EOL]     if (typeDeser != null) { [EOL]         typeDeser = typeDeser.forProperty(this); [EOL]     } [EOL]     _valueTypeDeserializer = typeDeser; [EOL]     _valueDeserializer = MISSING_VALUE_DESERIALIZER; [EOL] } <line_num>: 134,162
protected SettableBeanProperty(SettableBeanProperty src) { [EOL]     _propName = src._propName; [EOL]     _type = src._type; [EOL]     _wrapperName = src._wrapperName; [EOL]     _isRequired = src._isRequired; [EOL]     _contextAnnotations = src._contextAnnotations; [EOL]     _valueDeserializer = src._valueDeserializer; [EOL]     _valueTypeDeserializer = src._valueTypeDeserializer; [EOL]     _nullProvider = src._nullProvider; [EOL]     _managedReferenceName = src._managedReferenceName; [EOL]     _propertyIndex = src._propertyIndex; [EOL]     _viewMatcher = src._viewMatcher; [EOL] } <line_num>: 167,180
@SuppressWarnings("unchecked") [EOL] protected SettableBeanProperty(SettableBeanProperty src, JsonDeserializer<?> deser) { [EOL]     _propName = src._propName; [EOL]     _type = src._type; [EOL]     _wrapperName = src._wrapperName; [EOL]     _isRequired = src._isRequired; [EOL]     _contextAnnotations = src._contextAnnotations; [EOL]     _valueTypeDeserializer = src._valueTypeDeserializer; [EOL]     _managedReferenceName = src._managedReferenceName; [EOL]     _propertyIndex = src._propertyIndex; [EOL]     if (deser == null) { [EOL]         _nullProvider = null; [EOL]         _valueDeserializer = MISSING_VALUE_DESERIALIZER; [EOL]     } else { [EOL]         Object nvl = deser.getNullValue(); [EOL]         _nullProvider = (nvl == null) ? null : new NullProvider(_type, nvl); [EOL]         _valueDeserializer = (JsonDeserializer<Object>) deser; [EOL]     } [EOL]     _viewMatcher = src._viewMatcher; [EOL] } <line_num>: 185,206
protected SettableBeanProperty(SettableBeanProperty src, String newName) { [EOL]     _propName = newName; [EOL]     _type = src._type; [EOL]     _wrapperName = src._wrapperName; [EOL]     _isRequired = src._isRequired; [EOL]     _contextAnnotations = src._contextAnnotations; [EOL]     _valueDeserializer = src._valueDeserializer; [EOL]     _valueTypeDeserializer = src._valueTypeDeserializer; [EOL]     _nullProvider = src._nullProvider; [EOL]     _managedReferenceName = src._managedReferenceName; [EOL]     _propertyIndex = src._propertyIndex; [EOL]     _viewMatcher = src._viewMatcher; [EOL] } <line_num>: 211,224
public abstract SettableBeanProperty withValueDeserializer(JsonDeserializer<?> deser); <line_num>: 236,236
public abstract SettableBeanProperty withName(String newName); <line_num>: 248,248
public void setManagedReferenceName(String n) { [EOL]     _managedReferenceName = n; [EOL] } <line_num>: 250,252
public void setViews(Class<?>[] views) { [EOL]     if (views == null) { [EOL]         _viewMatcher = null; [EOL]     } else { [EOL]         _viewMatcher = ViewMatcher.construct(views); [EOL]     } [EOL] } <line_num>: 254,260
public void assignIndex(int index) { [EOL]     if (_propertyIndex != -1) { [EOL]         throw new IllegalStateException("Property '" + getName() + "' already had index (" + _propertyIndex + "), trying to assign " + index); [EOL]     } [EOL]     _propertyIndex = index; [EOL] } <line_num>: 265,270
@Override [EOL] public final String getName() { [EOL]     return _propName; [EOL] } <line_num>: 278,279
@Override [EOL] public boolean isRequired() { [EOL]     return _isRequired; [EOL] } <line_num>: 281,282
@Override [EOL] public JavaType getType() { [EOL]     return _type; [EOL] } <line_num>: 284,285
@Override [EOL] public PropertyName getWrapperName() { [EOL]     return _wrapperName; [EOL] } <line_num>: 287,290
@Override [EOL] public abstract <A extends Annotation> A getAnnotation(Class<A> acls); <line_num>: 292,293
@Override [EOL] public abstract AnnotatedMember getMember(); <line_num>: 295,296
@Override [EOL] public <A extends Annotation> A getContextAnnotation(Class<A> acls) { [EOL]     return _contextAnnotations.get(acls); [EOL] } <line_num>: 298,301
@Override [EOL] public void depositSchemaProperty(JsonObjectFormatVisitor objectVisitor) throws JsonMappingException { [EOL]     if (isRequired()) { [EOL]         objectVisitor.property(this); [EOL]     } else { [EOL]         objectVisitor.optionalProperty(this); [EOL]     } [EOL] } <line_num>: 303,312
protected final Class<?> getDeclaringClass() { [EOL]     return getMember().getDeclaringClass(); [EOL] } <line_num>: 320,322
public String getManagedReferenceName() { [EOL]     return _managedReferenceName; [EOL] } <line_num>: 324,324
public boolean hasValueDeserializer() { [EOL]     return (_valueDeserializer != null) && (_valueDeserializer != MISSING_VALUE_DESERIALIZER); [EOL] } <line_num>: 326,328
public boolean hasValueTypeDeserializer() { [EOL]     return (_valueTypeDeserializer != null); [EOL] } <line_num>: 330,330
public JsonDeserializer<Object> getValueDeserializer() { [EOL]     JsonDeserializer<Object> deser = _valueDeserializer; [EOL]     if (deser == MISSING_VALUE_DESERIALIZER) { [EOL]         return null; [EOL]     } [EOL]     return deser; [EOL] } <line_num>: 332,338
public TypeDeserializer getValueTypeDeserializer() { [EOL]     return _valueTypeDeserializer; [EOL] } <line_num>: 340,340
public boolean visibleInView(Class<?> activeView) { [EOL]     return (_viewMatcher == null) || _viewMatcher.isVisibleForView(activeView); [EOL] } <line_num>: 342,344
public boolean hasViews() { [EOL]     return _viewMatcher != null; [EOL] } <line_num>: 346,346
public int getPropertyIndex() { [EOL]     return _propertyIndex; [EOL] } <line_num>: 355,355
public int getCreatorIndex() { [EOL]     return -1; [EOL] } <line_num>: 363,363
public Object getInjectableValueId() { [EOL]     return null; [EOL] } <line_num>: 369,369
public abstract void deserializeAndSet(JsonParser jp, DeserializationContext ctxt, Object instance) throws IOException, JsonProcessingException; <line_num>: 384,386
public abstract Object deserializeSetAndReturn(JsonParser jp, DeserializationContext ctxt, Object instance) throws IOException, JsonProcessingException; <line_num>: 396,398
public abstract void set(Object instance, Object value) throws IOException; <line_num>: 408,409
public abstract Object setAndReturn(Object instance, Object value) throws IOException; <line_num>: 422,423
public final Object deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException { [EOL]     JsonToken t = jp.getCurrentToken(); [EOL]     if (t == JsonToken.VALUE_NULL) { [EOL]         return (_nullProvider == null) ? null : _nullProvider.nullValue(ctxt); [EOL]     } [EOL]     if (_valueTypeDeserializer != null) { [EOL]         return _valueDeserializer.deserializeWithType(jp, ctxt, _valueTypeDeserializer); [EOL]     } [EOL]     return _valueDeserializer.deserialize(jp, ctxt); [EOL] } <line_num>: 438,450
protected void _throwAsIOE(Exception e, Object value) throws IOException { [EOL]     if (e instanceof IllegalArgumentException) { [EOL]         String actType = (value == null) ? "[NULL]" : value.getClass().getName(); [EOL]         StringBuilder msg = new StringBuilder("Problem deserializing property '").append(getName()); [EOL]         msg.append("' (expected type: ").append(getType()); [EOL]         msg.append("; actual type: ").append(actType).append(")"); [EOL]         String origMsg = e.getMessage(); [EOL]         if (origMsg != null) { [EOL]             msg.append(", problem: ").append(origMsg); [EOL]         } else { [EOL]             msg.append(" (no error message provided)"); [EOL]         } [EOL]         throw new JsonMappingException(msg.toString(), null, e); [EOL]     } [EOL]     _throwAsIOE(e); [EOL] } <line_num>: 462,479
protected IOException _throwAsIOE(Exception e) throws IOException { [EOL]     if (e instanceof IOException) { [EOL]         throw (IOException) e; [EOL]     } [EOL]     if (e instanceof RuntimeException) { [EOL]         throw (RuntimeException) e; [EOL]     } [EOL]     Throwable th = e; [EOL]     while (th.getCause() != null) { [EOL]         th = th.getCause(); [EOL]     } [EOL]     throw new JsonMappingException(th.getMessage(), null, th); [EOL] } <line_num>: 481,496
@Override [EOL] public String toString() { [EOL]     return "[property '" + getName() + "']"; [EOL] } <line_num>: 498,498