protected BeanDescription(JavaType type)
public JavaType getType()
public Class<?> getBeanClass()
public abstract AnnotatedClass getClassInfo()
public abstract ObjectIdInfo getObjectIdInfo()
public abstract boolean hasKnownClassAnnotations()
public abstract TypeBindings bindingsForBeanType()
public abstract JavaType resolveType(java.lang.reflect.Type jdkType)
public abstract Annotations getClassAnnotations()
public abstract List<BeanPropertyDefinition> findProperties()
public abstract Map<String, AnnotatedMember> findBackReferenceProperties()
public abstract Set<String> getIgnoredPropertyNames()
public abstract List<AnnotatedConstructor> getConstructors()
public abstract List<AnnotatedMethod> getFactoryMethods()
public abstract AnnotatedConstructor findDefaultConstructor()
public abstract Constructor<?> findSingleArgConstructor(Class<?>... argTypes)
public abstract Method findFactoryMethod(Class<?>... expArgTypes)
public abstract AnnotatedMember findAnyGetter()
public abstract AnnotatedMethod findAnySetter()
public abstract AnnotatedMethod findJsonValueMethod()
public abstract AnnotatedMethod findMethod(String name, Class<?>[] paramTypes)
public abstract JsonInclude.Include findSerializationInclusion(JsonInclude.Include defValue)
public abstract JsonFormat.Value findExpectedFormat(JsonFormat.Value defValue)
public abstract Converter<Object, Object> findSerializationConverter()
public abstract Converter<Object, Object> findDeserializationConverter()
public abstract Map<Object, AnnotatedMember> findInjectables()
public abstract Class<?> findPOJOBuilder()
public abstract JsonPOJOBuilder.Value findPOJOBuilderConfig()
public abstract Object instantiateBean(boolean fixAccess)
JavaType _type
