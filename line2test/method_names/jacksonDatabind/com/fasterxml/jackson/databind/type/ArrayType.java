private ArrayType(JavaType componentType, Object emptyInstance, Object valueHandler, Object typeHandler, boolean asStatic)
public static ArrayType construct(JavaType componentType, Object valueHandler, Object typeHandler)
public ArrayType withTypeHandler(Object h)
public ArrayType withContentTypeHandler(Object h)
public ArrayType withValueHandler(Object h)
public ArrayType withContentValueHandler(Object h)
public ArrayType withStaticTyping()
protected String buildCanonicalName()
protected JavaType _narrow(Class<?> subclass)
public JavaType narrowContentsBy(Class<?> contentClass)
public JavaType widenContentsBy(Class<?> contentClass)
public boolean isArrayType()
public boolean isAbstract()
public boolean isConcrete()
public boolean hasGenericTypes()
public String containedTypeName(int index)
public boolean isContainerType()
public JavaType getContentType()
public int containedTypeCount()
public JavaType containedType(int index)
public StringBuilder getGenericSignature(StringBuilder sb)
public StringBuilder getErasedSignature(StringBuilder sb)
public String toString()
public boolean equals(Object o)
