protected JavaType(Class<?> raw, int additionalHash, Object valueHandler, Object typeHandler, boolean asStatic)
public abstract JavaType withTypeHandler(Object h)
public abstract JavaType withContentTypeHandler(Object h)
public abstract JavaType withValueHandler(Object h)
public abstract JavaType withContentValueHandler(Object h)
public abstract JavaType withStaticTyping()
public JavaType narrowBy(Class<?> subclass)
public JavaType forcedNarrowBy(Class<?> subclass)
public JavaType widenBy(Class<?> superclass)
protected abstract JavaType _narrow(Class<?> subclass)
protected JavaType _widen(Class<?> superclass)
public abstract JavaType narrowContentsBy(Class<?> contentClass)
public abstract JavaType widenContentsBy(Class<?> contentClass)
public final Class<?> getRawClass()
public final boolean hasRawClass(Class<?> clz)
public boolean isAbstract()
public boolean isConcrete()
public boolean isThrowable()
public boolean isArrayType()
public final boolean isEnumType()
public final boolean isInterface()
public final boolean isPrimitive()
public final boolean isFinal()
public abstract boolean isContainerType()
public boolean isCollectionLikeType()
public boolean isMapLikeType()
public final boolean useStaticType()
public boolean hasGenericTypes()
public JavaType getKeyType()
public JavaType getContentType()
public int containedTypeCount()
public JavaType containedType(int index)
public String containedTypeName(int index)
public T getValueHandler()
public T getTypeHandler()
public String getGenericSignature()
public abstract StringBuilder getGenericSignature(StringBuilder sb)
public String getErasedSignature()
public abstract StringBuilder getErasedSignature(StringBuilder sb)
protected void _assertSubclass(Class<?> subclass, Class<?> superClass)
public abstract String toString()
public abstract boolean equals(Object o)
public final int hashCode()
long serialVersionUID=Optional[6774285981275451126L]
Class<?> _class
int _hashCode
Object _valueHandler
Object _typeHandler
boolean _asStatic
