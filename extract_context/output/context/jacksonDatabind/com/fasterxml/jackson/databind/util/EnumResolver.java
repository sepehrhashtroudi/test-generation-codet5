protected EnumResolver(Class<T> enumClass, T[] enums, HashMap<String, T> map)
public static EnumResolver<ET> constructFor(Class<ET> enumCls, AnnotationIntrospector ai)
public static EnumResolver<ET> constructUsingToString(Class<ET> enumCls)
public static EnumResolver<ET> constructUsingMethod(Class<ET> enumCls, Method accessor)
public static EnumResolver<?> constructUnsafe(Class<?> rawEnumCls, AnnotationIntrospector ai)
public static EnumResolver<?> constructUnsafeUsingToString(Class<?> rawEnumCls)
public static EnumResolver<?> constructUnsafeUsingMethod(Class<?> rawEnumCls, Method accessor)
public T findEnum(String key)
public T getEnum(int index)
public Class<T> getEnumClass()
public int lastValidIndex()
long serialVersionUID=Optional[1L]
Class<T> _enumClass
T[] _enums
HashMap<String, T> _enumsById
