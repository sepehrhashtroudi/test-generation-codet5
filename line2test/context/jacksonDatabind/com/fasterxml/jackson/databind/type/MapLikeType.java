protected MapLikeType(Class<?> mapType, JavaType keyT, JavaType valueT, Object valueHandler, Object typeHandler, boolean asStatic)
public static MapLikeType construct(Class<?> rawType, JavaType keyT, JavaType valueT)
protected JavaType _narrow(Class<?> subclass)
public JavaType narrowContentsBy(Class<?> contentClass)
public JavaType widenContentsBy(Class<?> contentClass)
public JavaType narrowKey(Class<?> keySubclass)
public JavaType widenKey(Class<?> keySubclass)
public MapLikeType withTypeHandler(Object h)
public MapLikeType withContentTypeHandler(Object h)
public MapLikeType withValueHandler(Object h)
public MapLikeType withContentValueHandler(Object h)
public MapLikeType withStaticTyping()
protected String buildCanonicalName()
public boolean isContainerType()
public boolean isMapLikeType()
public JavaType getKeyType()
public JavaType getContentType()
public int containedTypeCount()
public JavaType containedType(int index)
public String containedTypeName(int index)
public StringBuilder getErasedSignature(StringBuilder sb)
public StringBuilder getGenericSignature(StringBuilder sb)
public MapLikeType withKeyTypeHandler(Object h)
public MapLikeType withKeyValueHandler(Object h)
public boolean isTrueMapType()
public String toString()
public boolean equals(Object o)
long serialVersionUID=Optional[416067702302823522L]
JavaType _keyType
JavaType _valueType
