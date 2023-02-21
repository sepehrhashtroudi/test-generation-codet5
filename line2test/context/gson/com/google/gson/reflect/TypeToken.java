protected TypeToken()
private TypeToken(Type type)
public SimpleTypeToken(Type type)
private static T nonNull(T o, String message)
 static Type getSuperclassTypeParameter(Class<?> subclass)
 static TypeToken<?> fromSuperclassTypeParameter(Class<?> subclass)
private static Class<?> getRawType(Type type)
public Class<? super T> getRawType()
public Type getType()
public boolean isAssignableFrom(Class<?> cls)
public boolean isAssignableFrom(Type from)
public boolean isAssignableFrom(TypeToken<?> token)
private static boolean isAssignableFrom(Type from, GenericArrayType to)
private static boolean isAssignableFrom(Type from, ParameterizedType to, Map<String, Type> typeVarMap)
private static boolean typeEquals(ParameterizedType from, ParameterizedType to, Map<String, Type> typeVarMap)
private static boolean matches(Type from, Type to, Map<String, Type> typeMap)
public int hashCode()
public boolean equals(Object o)
public String toString()
private static AssertionError buildUnexpectedTypeError(Type token, Class<?>... expected)
public static TypeToken<?> get(Type type)
public static TypeToken<T> get(Class<T> type)
Class<? super T> rawType
Type type