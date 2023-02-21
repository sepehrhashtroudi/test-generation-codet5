public CreatorCollector(BeanDescription beanDesc, boolean canFixAccess) { [EOL]     _beanDesc = beanDesc; [EOL]     _canFixAccess = canFixAccess; [EOL] } <line_num>: 54,58
public ValueInstantiator constructValueInstantiator(DeserializationConfig config) { [EOL]     StdValueInstantiator inst = new StdValueInstantiator(config, _beanDesc.getType()); [EOL]     JavaType delegateType; [EOL]     if (_delegateCreator == null) { [EOL]         delegateType = null; [EOL]     } else { [EOL]         int ix = 0; [EOL]         if (_delegateArgs != null) { [EOL]             for (int i = 0, len = _delegateArgs.length; i < len; ++i) { [EOL]                 if (_delegateArgs[i] == null) { [EOL]                     ix = i; [EOL]                     break; [EOL]                 } [EOL]             } [EOL]         } [EOL]         TypeBindings bindings = _beanDesc.bindingsForBeanType(); [EOL]         delegateType = bindings.resolveType(_delegateCreator.getGenericParameterType(ix)); [EOL]     } [EOL]     inst.configureFromObjectSettings(_defaultConstructor, _delegateCreator, delegateType, _delegateArgs, _propertyBasedCreator, _propertyBasedArgs); [EOL]     inst.configureFromStringCreator(_stringCreator); [EOL]     inst.configureFromIntCreator(_intCreator); [EOL]     inst.configureFromLongCreator(_longCreator); [EOL]     inst.configureFromDoubleCreator(_doubleCreator); [EOL]     inst.configureFromBooleanCreator(_booleanCreator); [EOL]     inst.configureIncompleteParameter(_incompleteParameter); [EOL]     return inst; [EOL] } <line_num>: 60,93
@Deprecated [EOL] public void setDefaultConstructor(AnnotatedConstructor ctor) { [EOL]     _defaultConstructor = _fixAccess(ctor); [EOL] } <line_num>: 104,107
public void setDefaultCreator(AnnotatedWithParams creator) { [EOL]     if (creator instanceof AnnotatedConstructor) { [EOL]         setDefaultConstructor((AnnotatedConstructor) creator); [EOL]         return; [EOL]     } [EOL]     _defaultConstructor = _fixAccess(creator); [EOL] } <line_num>: 118,127
public void addStringCreator(AnnotatedWithParams creator) { [EOL]     _stringCreator = verifyNonDup(creator, _stringCreator, "String"); [EOL] } <line_num>: 129,131
public void addIntCreator(AnnotatedWithParams creator) { [EOL]     _intCreator = verifyNonDup(creator, _intCreator, "int"); [EOL] } <line_num>: 132,134
public void addLongCreator(AnnotatedWithParams creator) { [EOL]     _longCreator = verifyNonDup(creator, _longCreator, "long"); [EOL] } <line_num>: 135,137
public void addDoubleCreator(AnnotatedWithParams creator) { [EOL]     _doubleCreator = verifyNonDup(creator, _doubleCreator, "double"); [EOL] } <line_num>: 138,140
public void addBooleanCreator(AnnotatedWithParams creator) { [EOL]     _booleanCreator = verifyNonDup(creator, _booleanCreator, "boolean"); [EOL] } <line_num>: 141,143
public void addDelegatingCreator(AnnotatedWithParams creator, CreatorProperty[] injectables) { [EOL]     _delegateCreator = verifyNonDup(creator, _delegateCreator, "delegate"); [EOL]     _delegateArgs = injectables; [EOL] } <line_num>: 145,150
public void addPropertyCreator(AnnotatedWithParams creator, CreatorProperty[] properties) { [EOL]     _propertyBasedCreator = verifyNonDup(creator, _propertyBasedCreator, "property-based"); [EOL]     if (properties.length > 1) { [EOL]         HashMap<String, Integer> names = new HashMap<String, Integer>(); [EOL]         for (int i = 0, len = properties.length; i < len; ++i) { [EOL]             String name = properties[i].getName(); [EOL]             if (name.length() == 0 && properties[i].getInjectableValueId() != null) { [EOL]                 continue; [EOL]             } [EOL]             Integer old = names.put(name, Integer.valueOf(i)); [EOL]             if (old != null) { [EOL]                 throw new IllegalArgumentException("Duplicate creator property \"" + name + "\" (index " + old + " vs " + i + ")"); [EOL]             } [EOL]         } [EOL]     } [EOL]     _propertyBasedArgs = properties; [EOL] } <line_num>: 152,173
public void addIncompeteParameter(AnnotatedParameter parameter) { [EOL]     if (_incompleteParameter == null) { [EOL]         _incompleteParameter = parameter; [EOL]     } [EOL] } <line_num>: 175,179
public boolean hasDefaultCreator() { [EOL]     return _defaultConstructor != null; [EOL] } <line_num>: 190,192
private <T extends AnnotatedMember> T _fixAccess(T member) { [EOL]     if (member != null && _canFixAccess) { [EOL]         ClassUtil.checkAndFixAccess((Member) member.getAnnotated()); [EOL]     } [EOL]     return member; [EOL] } <line_num>: 200,206
protected AnnotatedWithParams verifyNonDup(AnnotatedWithParams newOne, AnnotatedWithParams oldOne, String type) { [EOL]     if (oldOne != null) { [EOL]         if (oldOne.getClass() == newOne.getClass()) { [EOL]             throw new IllegalArgumentException("Conflicting " + type + " creators: already had " + oldOne + ", encountered " + newOne); [EOL]         } [EOL]     } [EOL]     return _fixAccess(newOne); [EOL] } <line_num>: 208,218