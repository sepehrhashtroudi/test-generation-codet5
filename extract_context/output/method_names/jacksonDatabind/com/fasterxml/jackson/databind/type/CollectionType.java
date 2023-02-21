private CollectionType(Class<?> collT, JavaType elemT, Object valueHandler, Object typeHandler, boolean asStatic)
protected JavaType _narrow(Class<?> subclass)
public JavaType narrowContentsBy(Class<?> contentClass)
public JavaType widenContentsBy(Class<?> contentClass)
public static CollectionType construct(Class<?> rawType, JavaType elemT)
public CollectionType withTypeHandler(Object h)
public CollectionType withContentTypeHandler(Object h)
public CollectionType withValueHandler(Object h)
public CollectionType withContentValueHandler(Object h)
public CollectionType withStaticTyping()
public String toString()
