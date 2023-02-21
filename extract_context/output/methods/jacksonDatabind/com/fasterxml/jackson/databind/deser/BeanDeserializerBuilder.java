public BeanDeserializerBuilder(BeanDescription beanDesc, DeserializationConfig config) { [EOL]     _beanDesc = beanDesc; [EOL]     _defaultViewInclusion = config.isEnabled(MapperFeature.DEFAULT_VIEW_INCLUSION); [EOL] } <line_num>: 97,102
protected BeanDeserializerBuilder(BeanDeserializerBuilder src) { [EOL]     _beanDesc = src._beanDesc; [EOL]     _defaultViewInclusion = src._defaultViewInclusion; [EOL]     _anySetter = src._anySetter; [EOL]     _ignoreAllUnknown = src._ignoreAllUnknown; [EOL]     _properties.putAll(src._properties); [EOL]     _backRefProperties = _copy(src._backRefProperties); [EOL]     _ignorableProps = src._ignorableProps; [EOL]     _valueInstantiator = src._valueInstantiator; [EOL]     _objectIdReader = src._objectIdReader; [EOL]     _buildMethod = src._buildMethod; [EOL]     _builderConfig = src._builderConfig; [EOL] } <line_num>: 108,126
private static HashMap<String, SettableBeanProperty> _copy(HashMap<String, SettableBeanProperty> src) { [EOL]     if (src == null) { [EOL]         return null; [EOL]     } [EOL]     return new HashMap<String, SettableBeanProperty>(src); [EOL] } <line_num>: 128,134
public void addOrReplaceProperty(SettableBeanProperty prop, boolean allowOverride) { [EOL]     _properties.put(prop.getName(), prop); [EOL] } <line_num>: 145,148
public void addProperty(SettableBeanProperty prop) { [EOL]     SettableBeanProperty old = _properties.put(prop.getName(), prop); [EOL]     if (old != null && old != prop) { [EOL]         throw new IllegalArgumentException("Duplicate property '" + prop.getName() + "' for " + _beanDesc.getType()); [EOL]     } [EOL] } <line_num>: 155,161
public void addBackReferenceProperty(String referenceName, SettableBeanProperty prop) { [EOL]     if (_backRefProperties == null) { [EOL]         _backRefProperties = new HashMap<String, SettableBeanProperty>(4); [EOL]     } [EOL]     _backRefProperties.put(referenceName, prop); [EOL]     if (_properties != null) { [EOL]         _properties.remove(prop.getName()); [EOL]     } [EOL] } <line_num>: 168,180
public void addInjectable(String propertyName, JavaType propertyType, Annotations contextAnnotations, AnnotatedMember member, Object valueId) { [EOL]     if (_injectables == null) { [EOL]         _injectables = new ArrayList<ValueInjector>(); [EOL]     } [EOL]     _injectables.add(new ValueInjector(propertyName, propertyType, contextAnnotations, member, valueId)); [EOL] } <line_num>: 182,191
public void addIgnorable(String propName) { [EOL]     if (_ignorableProps == null) { [EOL]         _ignorableProps = new HashSet<String>(); [EOL]     } [EOL]     _ignorableProps.add(propName); [EOL] } <line_num>: 197,203
public void addCreatorProperty(SettableBeanProperty prop) { [EOL]     addProperty(prop); [EOL] } <line_num>: 215,218
@Deprecated [EOL] public void addCreatorProperty(BeanPropertyDefinition propDef) { [EOL] } <line_num>: 223,227
public void setAnySetter(SettableAnyProperty s) { [EOL]     if (_anySetter != null && s != null) { [EOL]         throw new IllegalStateException("_anySetter already set to non-null"); [EOL]     } [EOL]     _anySetter = s; [EOL] } <line_num>: 229,235
public void setIgnoreUnknownProperties(boolean ignore) { [EOL]     _ignoreAllUnknown = ignore; [EOL] } <line_num>: 237,239
public void setValueInstantiator(ValueInstantiator inst) { [EOL]     _valueInstantiator = inst; [EOL] } <line_num>: 241,243
public void setObjectIdReader(ObjectIdReader r) { [EOL]     _objectIdReader = r; [EOL] } <line_num>: 245,247
public void setPOJOBuilder(AnnotatedMethod buildMethod, JsonPOJOBuilder.Value config) { [EOL]     _buildMethod = buildMethod; [EOL]     _builderConfig = config; [EOL] } <line_num>: 249,252
public Iterator<SettableBeanProperty> getProperties() { [EOL]     return _properties.values().iterator(); [EOL] } <line_num>: 268,270
public SettableBeanProperty findProperty(String propertyName) { [EOL]     return _properties.get(propertyName); [EOL] } <line_num>: 272,274
public boolean hasProperty(String propertyName) { [EOL]     return findProperty(propertyName) != null; [EOL] } <line_num>: 276,278
public SettableBeanProperty removeProperty(String name) { [EOL]     return _properties.remove(name); [EOL] } <line_num>: 280,282
public SettableAnyProperty getAnySetter() { [EOL]     return _anySetter; [EOL] } <line_num>: 284,286
public ValueInstantiator getValueInstantiator() { [EOL]     return _valueInstantiator; [EOL] } <line_num>: 288,290
public List<ValueInjector> getInjectables() { [EOL]     return _injectables; [EOL] } <line_num>: 292,294
public ObjectIdReader getObjectIdReader() { [EOL]     return _objectIdReader; [EOL] } <line_num>: 296,298
public AnnotatedMethod getBuildMethod() { [EOL]     return _buildMethod; [EOL] } <line_num>: 300,302
public JsonPOJOBuilder.Value getBuilderConfig() { [EOL]     return _builderConfig; [EOL] } <line_num>: 304,306
public JsonDeserializer<?> build() { [EOL]     Collection<SettableBeanProperty> props = _properties.values(); [EOL]     BeanPropertyMap propertyMap = new BeanPropertyMap(props); [EOL]     propertyMap.assignIndexes(); [EOL]     boolean anyViews = !_defaultViewInclusion; [EOL]     if (!anyViews) { [EOL]         for (SettableBeanProperty prop : props) { [EOL]             if (prop.hasViews()) { [EOL]                 anyViews = true; [EOL]                 break; [EOL]             } [EOL]         } [EOL]     } [EOL]     if (_objectIdReader != null) { [EOL]         ObjectIdValueProperty prop = new ObjectIdValueProperty(_objectIdReader, true); [EOL]         propertyMap = propertyMap.withProperty(prop); [EOL]     } [EOL]     return new BeanDeserializer(this, _beanDesc, propertyMap, _backRefProperties, _ignorableProps, _ignoreAllUnknown, anyViews); [EOL] } <line_num>: 321,354
public AbstractDeserializer buildAbstract() { [EOL]     return new AbstractDeserializer(this, _beanDesc, _backRefProperties); [EOL] } <line_num>: 363,366
public JsonDeserializer<?> buildBuilderBased(JavaType valueType, String expBuildMethodName) { [EOL]     if (_buildMethod == null) { [EOL]         throw new IllegalArgumentException("Builder class " + _beanDesc.getBeanClass().getName() + " does not have build method '" + expBuildMethodName + "()'"); [EOL]     } [EOL]     Class<?> rawBuildType = _buildMethod.getRawReturnType(); [EOL]     if (!valueType.getRawClass().isAssignableFrom(rawBuildType)) { [EOL]         throw new IllegalArgumentException("Build method '" + _buildMethod.getFullName() + " has bad return type (" + rawBuildType.getName() + "), not compatible with POJO type (" + valueType.getRawClass().getName() + ")"); [EOL]     } [EOL]     Collection<SettableBeanProperty> props = _properties.values(); [EOL]     BeanPropertyMap propertyMap = new BeanPropertyMap(props); [EOL]     propertyMap.assignIndexes(); [EOL]     boolean anyViews = !_defaultViewInclusion; [EOL]     if (!anyViews) { [EOL]         for (SettableBeanProperty prop : props) { [EOL]             if (prop.hasViews()) { [EOL]                 anyViews = true; [EOL]                 break; [EOL]             } [EOL]         } [EOL]     } [EOL]     if (_objectIdReader != null) { [EOL]         ObjectIdValueProperty prop = new ObjectIdValueProperty(_objectIdReader, true); [EOL]         propertyMap = propertyMap.withProperty(prop); [EOL]     } [EOL]     return new BuilderBasedDeserializer(this, _beanDesc, propertyMap, _backRefProperties, _ignorableProps, _ignoreAllUnknown, anyViews); [EOL] } <line_num>: 372,415