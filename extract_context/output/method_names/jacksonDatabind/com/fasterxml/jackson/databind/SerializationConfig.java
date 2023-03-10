public SerializationConfig(BaseSettings base, SubtypeResolver str, Map<ClassKey, Class<?>> mixins)
private SerializationConfig(SerializationConfig src, SubtypeResolver str)
private SerializationConfig(SerializationConfig src, int mapperFeatures, int serFeatures)
private SerializationConfig(SerializationConfig src, BaseSettings base)
private SerializationConfig(SerializationConfig src, FilterProvider filters)
private SerializationConfig(SerializationConfig src, Class<?> view)
private SerializationConfig(SerializationConfig src, JsonInclude.Include incl)
private SerializationConfig(SerializationConfig src, String rootName)
protected SerializationConfig(SerializationConfig src, Map<ClassKey, Class<?>> mixins)
public SerializationConfig with(MapperFeature... features)
public SerializationConfig without(MapperFeature... features)
public SerializationConfig with(AnnotationIntrospector ai)
public SerializationConfig withAppendedAnnotationIntrospector(AnnotationIntrospector ai)
public SerializationConfig withInsertedAnnotationIntrospector(AnnotationIntrospector ai)
public SerializationConfig with(ClassIntrospector ci)
public SerializationConfig with(DateFormat df)
public SerializationConfig with(HandlerInstantiator hi)
public SerializationConfig with(PropertyNamingStrategy pns)
public SerializationConfig withRootName(String rootName)
public SerializationConfig with(SubtypeResolver str)
public SerializationConfig with(TypeFactory tf)
public SerializationConfig with(TypeResolverBuilder<?> trb)
public SerializationConfig withView(Class<?> view)
public SerializationConfig with(VisibilityChecker<?> vc)
public SerializationConfig withVisibility(PropertyAccessor forMethod, JsonAutoDetect.Visibility visibility)
public SerializationConfig with(Locale l)
public SerializationConfig with(TimeZone tz)
public SerializationConfig with(Base64Variant base64)
private final SerializationConfig _withBase(BaseSettings newBase)
public SerializationConfig with(SerializationFeature feature)
public SerializationConfig with(SerializationFeature first, SerializationFeature... features)
public SerializationConfig withFeatures(SerializationFeature... features)
public SerializationConfig without(SerializationFeature feature)
public SerializationConfig without(SerializationFeature first, SerializationFeature... features)
public SerializationConfig withoutFeatures(SerializationFeature... features)
public SerializationConfig withFilters(FilterProvider filterProvider)
public SerializationConfig withSerializationInclusion(JsonInclude.Include incl)
public boolean useRootWrapping()
public AnnotationIntrospector getAnnotationIntrospector()
public BeanDescription introspectClassAnnotations(JavaType type)
public BeanDescription introspectDirectClassAnnotations(JavaType type)
public VisibilityChecker<?> getDefaultVisibilityChecker()
public final boolean isEnabled(SerializationFeature f)
public final int getSerializationFeatures()
public JsonInclude.Include getSerializationInclusion()
public FilterProvider getFilterProvider()
public T introspect(JavaType type)
public String toString()
