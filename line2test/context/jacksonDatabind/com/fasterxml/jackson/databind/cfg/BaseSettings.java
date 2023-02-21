public BaseSettings(ClassIntrospector ci, AnnotationIntrospector ai, VisibilityChecker<?> vc, PropertyNamingStrategy pns, TypeFactory tf, TypeResolverBuilder<?> typer, DateFormat dateFormat, HandlerInstantiator hi, Locale locale, TimeZone tz, Base64Variant defaultBase64)
public BaseSettings withClassIntrospector(ClassIntrospector ci)
public BaseSettings withAnnotationIntrospector(AnnotationIntrospector ai)
public BaseSettings withInsertedAnnotationIntrospector(AnnotationIntrospector ai)
public BaseSettings withAppendedAnnotationIntrospector(AnnotationIntrospector ai)
public BaseSettings withVisibilityChecker(VisibilityChecker<?> vc)
public BaseSettings withVisibility(PropertyAccessor forMethod, JsonAutoDetect.Visibility visibility)
public BaseSettings withPropertyNamingStrategy(PropertyNamingStrategy pns)
public BaseSettings withTypeFactory(TypeFactory tf)
public BaseSettings withTypeResolverBuilder(TypeResolverBuilder<?> typer)
public BaseSettings withDateFormat(DateFormat df)
public BaseSettings withHandlerInstantiator(HandlerInstantiator hi)
public BaseSettings with(Locale l)
public BaseSettings with(TimeZone tz)
public BaseSettings with(Base64Variant base64)
public ClassIntrospector getClassIntrospector()
public AnnotationIntrospector getAnnotationIntrospector()
public VisibilityChecker<?> getVisibilityChecker()
public PropertyNamingStrategy getPropertyNamingStrategy()
public TypeFactory getTypeFactory()
public TypeResolverBuilder<?> getTypeResolverBuilder()
public DateFormat getDateFormat()
public HandlerInstantiator getHandlerInstantiator()
public Locale getLocale()
public TimeZone getTimeZone()
public Base64Variant getBase64Variant()
long serialVersionUID=Optional[4939673998947122190L]
ClassIntrospector _classIntrospector
AnnotationIntrospector _annotationIntrospector
VisibilityChecker<?> _visibilityChecker
PropertyNamingStrategy _propertyNamingStrategy
TypeFactory _typeFactory
TypeResolverBuilder<?> _typeResolverBuilder
DateFormat _dateFormat
HandlerInstantiator _handlerInstantiator
Locale _locale
TimeZone _timeZone
Base64Variant _defaultBase64
