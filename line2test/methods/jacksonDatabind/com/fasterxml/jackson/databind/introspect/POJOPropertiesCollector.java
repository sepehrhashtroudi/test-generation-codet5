protected POJOPropertiesCollector(MapperConfig<?> config, boolean forSerialization, JavaType type, AnnotatedClass classDef, String mutatorPrefix) { [EOL]     _config = config; [EOL]     _forSerialization = forSerialization; [EOL]     _type = type; [EOL]     _classDef = classDef; [EOL]     _mutatorPrefix = (mutatorPrefix == null) ? "set" : mutatorPrefix; [EOL]     _annotationIntrospector = config.isAnnotationProcessingEnabled() ? _config.getAnnotationIntrospector() : null; [EOL]     if (_annotationIntrospector == null) { [EOL]         _visibilityChecker = _config.getDefaultVisibilityChecker(); [EOL]     } else { [EOL]         _visibilityChecker = _annotationIntrospector.findAutoDetectVisibility(classDef, _config.getDefaultVisibilityChecker()); [EOL]     } [EOL] } <line_num>: 98,114
public MapperConfig<?> getConfig() { [EOL]     return _config; [EOL] } <line_num>: 122,124
public JavaType getType() { [EOL]     return _type; [EOL] } <line_num>: 126,128
public AnnotatedClass getClassDef() { [EOL]     return _classDef; [EOL] } <line_num>: 130,132
public AnnotationIntrospector getAnnotationIntrospector() { [EOL]     return _annotationIntrospector; [EOL] } <line_num>: 134,136
public List<BeanPropertyDefinition> getProperties() { [EOL]     return new ArrayList<BeanPropertyDefinition>(_properties.values()); [EOL] } <line_num>: 138,141
public Map<Object, AnnotatedMember> getInjectables() { [EOL]     return _injectables; [EOL] } <line_num>: 143,145
public AnnotatedMethod getJsonValueMethod() { [EOL]     if (_jsonValueGetters != null) { [EOL]         if (_jsonValueGetters.size() > 1) { [EOL]             reportProblem("Multiple value properties defined (" + _jsonValueGetters.get(0) + " vs " + _jsonValueGetters.get(1) + ")"); [EOL]         } [EOL]         return _jsonValueGetters.get(0); [EOL]     } [EOL]     return null; [EOL] } <line_num>: 147,159
public AnnotatedMember getAnyGetter() { [EOL]     if (_anyGetters != null) { [EOL]         if (_anyGetters.size() > 1) { [EOL]             reportProblem("Multiple 'any-getters' defined (" + _anyGetters.get(0) + " vs " + _anyGetters.get(1) + ")"); [EOL]         } [EOL]         return _anyGetters.getFirst(); [EOL]     } [EOL]     return null; [EOL] } <line_num>: 161,171
public AnnotatedMethod getAnySetterMethod() { [EOL]     if (_anySetters != null) { [EOL]         if (_anySetters.size() > 1) { [EOL]             reportProblem("Multiple 'any-setters' defined (" + _anySetters.get(0) + " vs " + _anySetters.get(1) + ")"); [EOL]         } [EOL]         return _anySetters.getFirst(); [EOL]     } [EOL]     return null; [EOL] } <line_num>: 173,183
public Set<String> getIgnoredPropertyNames() { [EOL]     return _ignoredPropertyNames; [EOL] } <line_num>: 185,187
public ObjectIdInfo getObjectIdInfo() { [EOL]     if (_annotationIntrospector == null) { [EOL]         return null; [EOL]     } [EOL]     ObjectIdInfo info = _annotationIntrospector.findObjectIdInfo(_classDef); [EOL]     if (info != null) { [EOL]         info = _annotationIntrospector.findObjectReferenceInfo(_classDef, info); [EOL]     } [EOL]     return info; [EOL] } <line_num>: 193,202
public Class<?> findPOJOBuilderClass() { [EOL]     return _annotationIntrospector.findPOJOBuilder(_classDef); [EOL] } <line_num>: 207,210
protected Map<String, POJOPropertyBuilder> getPropertyMap() { [EOL]     return _properties; [EOL] } <line_num>: 213,215
public POJOPropertiesCollector collect() { [EOL]     _properties.clear(); [EOL]     _addFields(); [EOL]     _addMethods(); [EOL]     _addCreators(); [EOL]     _addInjectables(); [EOL]     _removeUnwantedProperties(); [EOL]     _renameProperties(); [EOL]     PropertyNamingStrategy naming = _findNamingStrategy(); [EOL]     if (naming != null) { [EOL]         _renameUsing(naming); [EOL]     } [EOL]     for (POJOPropertyBuilder property : _properties.values()) { [EOL]         property.trimByVisibility(); [EOL]     } [EOL]     for (POJOPropertyBuilder property : _properties.values()) { [EOL]         property.mergeAnnotations(_forSerialization); [EOL]     } [EOL]     if (_config.isEnabled(MapperFeature.USE_WRAPPER_NAME_AS_PROPERTY_NAME)) { [EOL]         _renameWithWrappers(); [EOL]     } [EOL]     _sortProperties(); [EOL]     return this; [EOL] } <line_num>: 227,271
protected void _sortProperties() { [EOL]     AnnotationIntrospector intr = _annotationIntrospector; [EOL]     boolean sort; [EOL]     Boolean alpha = (intr == null) ? null : intr.findSerializationSortAlphabetically(_classDef); [EOL]     if (alpha == null) { [EOL]         sort = _config.shouldSortPropertiesAlphabetically(); [EOL]     } else { [EOL]         sort = alpha.booleanValue(); [EOL]     } [EOL]     String[] propertyOrder = (intr == null) ? null : intr.findSerializationPropertyOrder(_classDef); [EOL]     if (!sort && (_creatorProperties == null) && (propertyOrder == null)) { [EOL]         return; [EOL]     } [EOL]     int size = _properties.size(); [EOL]     Map<String, POJOPropertyBuilder> all; [EOL]     if (sort) { [EOL]         all = new TreeMap<String, POJOPropertyBuilder>(); [EOL]     } else { [EOL]         all = new LinkedHashMap<String, POJOPropertyBuilder>(size + size); [EOL]     } [EOL]     for (POJOPropertyBuilder prop : _properties.values()) { [EOL]         all.put(prop.getName(), prop); [EOL]     } [EOL]     Map<String, POJOPropertyBuilder> ordered = new LinkedHashMap<String, POJOPropertyBuilder>(size + size); [EOL]     if (propertyOrder != null) { [EOL]         for (String name : propertyOrder) { [EOL]             POJOPropertyBuilder w = all.get(name); [EOL]             if (w == null) { [EOL]                 for (POJOPropertyBuilder prop : _properties.values()) { [EOL]                     if (name.equals(prop.getInternalName())) { [EOL]                         w = prop; [EOL]                         name = prop.getName(); [EOL]                         break; [EOL]                     } [EOL]                 } [EOL]             } [EOL]             if (w != null) { [EOL]                 ordered.put(name, w); [EOL]             } [EOL]         } [EOL]     } [EOL]     if (_creatorProperties != null) { [EOL]         for (POJOPropertyBuilder prop : _creatorProperties) { [EOL]             ordered.put(prop.getName(), prop); [EOL]         } [EOL]     } [EOL]     ordered.putAll(all); [EOL]     _properties.clear(); [EOL]     _properties.putAll(ordered); [EOL] } <line_num>: 282,343
protected void _addFields() { [EOL]     final AnnotationIntrospector ai = _annotationIntrospector; [EOL]     final boolean pruneFinalFields = !_forSerialization && !_config.isEnabled(MapperFeature.ALLOW_FINAL_FIELDS_AS_MUTATORS); [EOL]     for (AnnotatedField f : _classDef.fields()) { [EOL]         String implName = f.getName(); [EOL]         String explName; [EOL]         if (ai == null) { [EOL]             explName = null; [EOL]         } else if (_forSerialization) { [EOL]             PropertyName pn = ai.findNameForSerialization(f); [EOL]             explName = (pn == null) ? null : pn.getSimpleName(); [EOL]         } else { [EOL]             PropertyName pn = ai.findNameForDeserialization(f); [EOL]             explName = (pn == null) ? null : pn.getSimpleName(); [EOL]         } [EOL]         if ("".equals(explName)) { [EOL]             explName = implName; [EOL]         } [EOL]         boolean visible = (explName != null); [EOL]         if (!visible) { [EOL]             visible = _visibilityChecker.isFieldVisible(f); [EOL]         } [EOL]         boolean ignored = (ai != null) && ai.hasIgnoreMarker(f); [EOL]         if (pruneFinalFields && (explName == null) && !ignored && Modifier.isFinal(f.getModifiers())) { [EOL]             continue; [EOL]         } [EOL]         _property(implName).addField(f, explName, visible, ignored); [EOL]     } [EOL] } <line_num>: 354,402
protected void _addCreators() { [EOL]     final AnnotationIntrospector ai = _annotationIntrospector; [EOL]     if (ai == null) { [EOL]         return; [EOL]     } [EOL]     for (AnnotatedConstructor ctor : _classDef.getConstructors()) { [EOL]         if (_creatorProperties == null) { [EOL]             _creatorProperties = new LinkedList<POJOPropertyBuilder>(); [EOL]         } [EOL]         for (int i = 0, len = ctor.getParameterCount(); i < len; ++i) { [EOL]             AnnotatedParameter param = ctor.getParameter(i); [EOL]             PropertyName pn = ai.findNameForDeserialization(param); [EOL]             String name = (pn == null) ? null : pn.getSimpleName(); [EOL]             if (name != null) { [EOL]                 POJOPropertyBuilder prop = _property(name); [EOL]                 prop.addCtor(param, name, true, false); [EOL]                 _creatorProperties.add(prop); [EOL]             } [EOL]         } [EOL]     } [EOL]     for (AnnotatedMethod factory : _classDef.getStaticMethods()) { [EOL]         if (_creatorProperties == null) { [EOL]             _creatorProperties = new LinkedList<POJOPropertyBuilder>(); [EOL]         } [EOL]         for (int i = 0, len = factory.getParameterCount(); i < len; ++i) { [EOL]             AnnotatedParameter param = factory.getParameter(i); [EOL]             PropertyName pn = ai.findNameForDeserialization(param); [EOL]             String name = (pn == null) ? null : pn.getSimpleName(); [EOL]             if (name != null) { [EOL]                 POJOPropertyBuilder prop = _property(name); [EOL]                 prop.addCtor(param, name, true, false); [EOL]                 _creatorProperties.add(prop); [EOL]             } [EOL]         } [EOL]     } [EOL] } <line_num>: 407,448
protected void _addMethods() { [EOL]     final AnnotationIntrospector ai = _annotationIntrospector; [EOL]     for (AnnotatedMethod m : _classDef.memberMethods()) { [EOL]         int argCount = m.getParameterCount(); [EOL]         if (argCount == 0) { [EOL]             _addGetterMethod(m, ai); [EOL]         } else if (argCount == 1) { [EOL]             _addSetterMethod(m, ai); [EOL]         } else if (argCount == 2) { [EOL]             if (ai != null && ai.hasAnySetterAnnotation(m)) { [EOL]                 if (_anySetters == null) { [EOL]                     _anySetters = new LinkedList<AnnotatedMethod>(); [EOL]                 } [EOL]                 _anySetters.add(m); [EOL]             } [EOL]         } [EOL]     } [EOL] } <line_num>: 453,477
protected void _addGetterMethod(AnnotatedMethod m, AnnotationIntrospector ai) { [EOL]     if (ai != null) { [EOL]         if (ai.hasAnyGetterAnnotation(m)) { [EOL]             if (_anyGetters == null) { [EOL]                 _anyGetters = new LinkedList<AnnotatedMember>(); [EOL]             } [EOL]             _anyGetters.add(m); [EOL]             return; [EOL]         } [EOL]         if (ai.hasAsValueAnnotation(m)) { [EOL]             if (_jsonValueGetters == null) { [EOL]                 _jsonValueGetters = new LinkedList<AnnotatedMethod>(); [EOL]             } [EOL]             _jsonValueGetters.add(m); [EOL]             return; [EOL]         } [EOL]     } [EOL]     String implName; [EOL]     boolean visible; [EOL]     PropertyName pn = (ai == null) ? null : ai.findNameForSerialization(m); [EOL]     String explName = (pn == null) ? null : pn.getSimpleName(); [EOL]     if (explName == null) { [EOL]         implName = BeanUtil.okNameForRegularGetter(m, m.getName()); [EOL]         if (implName == null) { [EOL]             implName = BeanUtil.okNameForIsGetter(m, m.getName()); [EOL]             if (implName == null) { [EOL]                 return; [EOL]             } [EOL]             visible = _visibilityChecker.isIsGetterVisible(m); [EOL]         } else { [EOL]             visible = _visibilityChecker.isGetterVisible(m); [EOL]         } [EOL]     } else { [EOL]         implName = BeanUtil.okNameForGetter(m); [EOL]         if (implName == null) { [EOL]             implName = m.getName(); [EOL]         } [EOL]         if (explName.length() == 0) { [EOL]             explName = implName; [EOL]         } [EOL]         visible = true; [EOL]     } [EOL]     boolean ignore = (ai == null) ? false : ai.hasIgnoreMarker(m); [EOL]     _property(implName).addGetter(m, explName, visible, ignore); [EOL] } <line_num>: 479,529
protected void _addSetterMethod(AnnotatedMethod m, AnnotationIntrospector ai) { [EOL]     String implName; [EOL]     boolean visible; [EOL]     PropertyName pn = (ai == null) ? null : ai.findNameForDeserialization(m); [EOL]     String explName = (pn == null) ? null : pn.getSimpleName(); [EOL]     if (explName == null) { [EOL]         implName = BeanUtil.okNameForMutator(m, _mutatorPrefix); [EOL]         if (implName == null) { [EOL]             return; [EOL]         } [EOL]         visible = _visibilityChecker.isSetterVisible(m); [EOL]     } else { [EOL]         implName = BeanUtil.okNameForMutator(m, _mutatorPrefix); [EOL]         if (implName == null) { [EOL]             implName = m.getName(); [EOL]         } [EOL]         if (explName.length() == 0) { [EOL]             explName = implName; [EOL]         } [EOL]         visible = true; [EOL]     } [EOL]     boolean ignore = (ai == null) ? false : ai.hasIgnoreMarker(m); [EOL]     _property(implName).addSetter(m, explName, visible, ignore); [EOL] } <line_num>: 531,557
protected void _addInjectables() { [EOL]     final AnnotationIntrospector ai = _annotationIntrospector; [EOL]     if (ai == null) { [EOL]         return; [EOL]     } [EOL]     for (AnnotatedField f : _classDef.fields()) { [EOL]         _doAddInjectable(ai.findInjectableValueId(f), f); [EOL]     } [EOL]     for (AnnotatedMethod m : _classDef.memberMethods()) { [EOL]         if (m.getParameterCount() != 1) { [EOL]             continue; [EOL]         } [EOL]         _doAddInjectable(ai.findInjectableValueId(m), m); [EOL]     } [EOL] } <line_num>: 559,580
protected void _doAddInjectable(Object id, AnnotatedMember m) { [EOL]     if (id == null) { [EOL]         return; [EOL]     } [EOL]     if (_injectables == null) { [EOL]         _injectables = new LinkedHashMap<Object, AnnotatedMember>(); [EOL]     } [EOL]     AnnotatedMember prev = _injectables.put(id, m); [EOL]     if (prev != null) { [EOL]         String type = (id == null) ? "[null]" : id.getClass().getName(); [EOL]         throw new IllegalArgumentException("Duplicate injectable value with id '" + String.valueOf(id) + "' (of type " + type + ")"); [EOL]     } [EOL] } <line_num>: 582,596
protected void _removeUnwantedProperties() { [EOL]     Iterator<Map.Entry<String, POJOPropertyBuilder>> it = _properties.entrySet().iterator(); [EOL]     final boolean forceNonVisibleRemoval = !_config.isEnabled(MapperFeature.INFER_PROPERTY_MUTATORS); [EOL]     while (it.hasNext()) { [EOL]         Map.Entry<String, POJOPropertyBuilder> entry = it.next(); [EOL]         POJOPropertyBuilder prop = entry.getValue(); [EOL]         if (!prop.anyVisible()) { [EOL]             it.remove(); [EOL]             continue; [EOL]         } [EOL]         if (prop.anyIgnorals()) { [EOL]             if (!prop.isExplicitlyIncluded()) { [EOL]                 it.remove(); [EOL]                 _addIgnored(prop.getName()); [EOL]                 continue; [EOL]             } [EOL]             prop.removeIgnored(); [EOL]             if (!_forSerialization && !prop.couldDeserialize()) { [EOL]                 _addIgnored(prop.getName()); [EOL]             } [EOL]         } [EOL]         prop.removeNonVisible(forceNonVisibleRemoval); [EOL]     } [EOL] } <line_num>: 608,639
private void _addIgnored(String name) { [EOL]     if (!_forSerialization) { [EOL]         if (_ignoredPropertyNames == null) { [EOL]             _ignoredPropertyNames = new HashSet<String>(); [EOL]         } [EOL]         _ignoredPropertyNames.add(name); [EOL]     } [EOL] } <line_num>: 641,649
protected void _renameProperties() { [EOL]     Iterator<Map.Entry<String, POJOPropertyBuilder>> it = _properties.entrySet().iterator(); [EOL]     LinkedList<POJOPropertyBuilder> renamed = null; [EOL]     while (it.hasNext()) { [EOL]         Map.Entry<String, POJOPropertyBuilder> entry = it.next(); [EOL]         POJOPropertyBuilder prop = entry.getValue(); [EOL]         String newName = prop.findNewName(); [EOL]         if (newName != null) { [EOL]             if (renamed == null) { [EOL]                 renamed = new LinkedList<POJOPropertyBuilder>(); [EOL]             } [EOL]             prop = prop.withName(newName); [EOL]             renamed.add(prop); [EOL]             it.remove(); [EOL]         } [EOL]     } [EOL]     if (renamed != null) { [EOL]         for (POJOPropertyBuilder prop : renamed) { [EOL]             String name = prop.getName(); [EOL]             POJOPropertyBuilder old = _properties.get(name); [EOL]             if (old == null) { [EOL]                 _properties.put(name, prop); [EOL]             } else { [EOL]                 old.addAll(prop); [EOL]             } [EOL]             if (_creatorProperties != null) { [EOL]                 for (int i = 0; i < _creatorProperties.size(); ++i) { [EOL]                     if (_creatorProperties.get(i).getInternalName() == prop.getInternalName()) { [EOL]                         _creatorProperties.set(i, prop); [EOL]                         break; [EOL]                     } [EOL]                 } [EOL]             } [EOL]         } [EOL]     } [EOL] } <line_num>: 657,698
protected void _renameUsing(PropertyNamingStrategy naming) { [EOL]     POJOPropertyBuilder[] props = _properties.values().toArray(new POJOPropertyBuilder[_properties.size()]); [EOL]     _properties.clear(); [EOL]     for (POJOPropertyBuilder prop : props) { [EOL]         String name = prop.getName(); [EOL]         if (_forSerialization) { [EOL]             if (prop.hasGetter()) { [EOL]                 name = naming.nameForGetterMethod(_config, prop.getGetter(), name); [EOL]             } else if (prop.hasField()) { [EOL]                 name = naming.nameForField(_config, prop.getField(), name); [EOL]             } [EOL]         } else { [EOL]             if (prop.hasSetter()) { [EOL]                 name = naming.nameForSetterMethod(_config, prop.getSetter(), name); [EOL]             } else if (prop.hasConstructorParameter()) { [EOL]                 name = naming.nameForConstructorParameter(_config, prop.getConstructorParameter(), name); [EOL]             } else if (prop.hasField()) { [EOL]                 name = naming.nameForField(_config, prop.getField(), name); [EOL]             } else if (prop.hasGetter()) { [EOL]                 name = naming.nameForGetterMethod(_config, prop.getGetter(), name); [EOL]             } [EOL]         } [EOL]         if (!name.equals(prop.getName())) { [EOL]             prop = prop.withName(name); [EOL]         } [EOL]         POJOPropertyBuilder old = _properties.get(name); [EOL]         if (old == null) { [EOL]             _properties.put(name, prop); [EOL]         } else { [EOL]             old.addAll(prop); [EOL]         } [EOL]     } [EOL] } <line_num>: 700,739
protected void _renameWithWrappers() { [EOL]     Iterator<Map.Entry<String, POJOPropertyBuilder>> it = _properties.entrySet().iterator(); [EOL]     LinkedList<POJOPropertyBuilder> renamed = null; [EOL]     while (it.hasNext()) { [EOL]         Map.Entry<String, POJOPropertyBuilder> entry = it.next(); [EOL]         POJOPropertyBuilder prop = entry.getValue(); [EOL]         AnnotatedMember member = prop.getPrimaryMember(); [EOL]         if (member == null) { [EOL]             continue; [EOL]         } [EOL]         PropertyName wrapperName = _annotationIntrospector.findWrapperName(member); [EOL]         if (wrapperName == null || !wrapperName.hasSimpleName()) { [EOL]             continue; [EOL]         } [EOL]         String name = wrapperName.getSimpleName(); [EOL]         if (!name.equals(prop.getName())) { [EOL]             if (renamed == null) { [EOL]                 renamed = new LinkedList<POJOPropertyBuilder>(); [EOL]             } [EOL]             prop = prop.withName(name); [EOL]             renamed.add(prop); [EOL]             it.remove(); [EOL]         } [EOL]     } [EOL]     if (renamed != null) { [EOL]         for (POJOPropertyBuilder prop : renamed) { [EOL]             String name = prop.getName(); [EOL]             POJOPropertyBuilder old = _properties.get(name); [EOL]             if (old == null) { [EOL]                 _properties.put(name, prop); [EOL]             } else { [EOL]                 old.addAll(prop); [EOL]             } [EOL]         } [EOL]     } [EOL] } <line_num>: 741,781
protected void reportProblem(String msg) { [EOL]     throw new IllegalArgumentException("Problem with definition of " + _classDef + ": " + msg); [EOL] } <line_num>: 790,792
protected POJOPropertyBuilder _property(String implName) { [EOL]     POJOPropertyBuilder prop = _properties.get(implName); [EOL]     if (prop == null) { [EOL]         prop = new POJOPropertyBuilder(implName, _annotationIntrospector, _forSerialization); [EOL]         _properties.put(implName, prop); [EOL]     } [EOL]     return prop; [EOL] } <line_num>: 794,803
private PropertyNamingStrategy _findNamingStrategy() { [EOL]     Object namingDef = (_annotationIntrospector == null) ? null : _annotationIntrospector.findNamingStrategy(_classDef); [EOL]     if (namingDef == null) { [EOL]         return _config.getPropertyNamingStrategy(); [EOL]     } [EOL]     if (namingDef instanceof PropertyNamingStrategy) { [EOL]         return (PropertyNamingStrategy) namingDef; [EOL]     } [EOL]     if (!(namingDef instanceof Class)) { [EOL]         throw new IllegalStateException("AnnotationIntrospector returned PropertyNamingStrategy definition of type " + namingDef.getClass().getName() + "; expected type PropertyNamingStrategy or Class<PropertyNamingStrategy> instead"); [EOL]     } [EOL]     Class<?> namingClass = (Class<?>) namingDef; [EOL]     if (!PropertyNamingStrategy.class.isAssignableFrom(namingClass)) { [EOL]         throw new IllegalStateException("AnnotationIntrospector returned Class " + namingClass.getName() + "; expected Class<PropertyNamingStrategy>"); [EOL]     } [EOL]     HandlerInstantiator hi = _config.getHandlerInstantiator(); [EOL]     if (hi != null) { [EOL]         PropertyNamingStrategy pns = hi.namingStrategyInstance(_config, _classDef, namingClass); [EOL]         if (pns != null) { [EOL]             return pns; [EOL]         } [EOL]     } [EOL]     return (PropertyNamingStrategy) ClassUtil.createInstance(namingClass, _config.canOverrideAccessModifiers()); [EOL] } <line_num>: 805,836
