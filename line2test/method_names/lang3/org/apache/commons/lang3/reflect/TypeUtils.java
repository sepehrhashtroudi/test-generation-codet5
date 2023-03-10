public TypeUtils()
public static boolean isAssignable(final Type type, final Type toType)
private static boolean isAssignable(final Type type, final Type toType, final Map<TypeVariable<?>, Type> typeVarAssigns)
private static boolean isAssignable(final Type type, final Class<?> toClass)
private static boolean isAssignable(final Type type, final ParameterizedType toParameterizedType, final Map<TypeVariable<?>, Type> typeVarAssigns)
private static Type unrollVariableAssignments(TypeVariable<?> var, final Map<TypeVariable<?>, Type> typeVarAssigns)
private static boolean isAssignable(final Type type, final GenericArrayType toGenericArrayType, final Map<TypeVariable<?>, Type> typeVarAssigns)
private static boolean isAssignable(final Type type, final WildcardType toWildcardType, final Map<TypeVariable<?>, Type> typeVarAssigns)
private static boolean isAssignable(final Type type, final TypeVariable<?> toTypeVariable, final Map<TypeVariable<?>, Type> typeVarAssigns)
private static Type substituteTypeVariables(final Type type, final Map<TypeVariable<?>, Type> typeVarAssigns)
public static Map<TypeVariable<?>, Type> getTypeArguments(final ParameterizedType type)
public static Map<TypeVariable<?>, Type> getTypeArguments(final Type type, final Class<?> toClass)
private static Map<TypeVariable<?>, Type> getTypeArguments(final Type type, final Class<?> toClass, final Map<TypeVariable<?>, Type> subtypeVarAssigns)
private static Map<TypeVariable<?>, Type> getTypeArguments(final ParameterizedType parameterizedType, final Class<?> toClass, final Map<TypeVariable<?>, Type> subtypeVarAssigns)
private static Map<TypeVariable<?>, Type> getTypeArguments(Class<?> cls, final Class<?> toClass, final Map<TypeVariable<?>, Type> subtypeVarAssigns)
public static Map<TypeVariable<?>, Type> determineTypeArguments(final Class<?> cls, final ParameterizedType superType)
private static void mapTypeVariablesToArguments(final Class<T> cls, final ParameterizedType parameterizedType, final Map<TypeVariable<?>, Type> typeVarAssigns)
private static Type getClosestParentType(final Class<?> cls, final Class<?> superClass)
public static boolean isInstance(final Object value, final Type type)
public static Type[] normalizeUpperBounds(final Type[] bounds)
public static Type[] getImplicitBounds(final TypeVariable<?> typeVariable)
public static Type[] getImplicitUpperBounds(final WildcardType wildcardType)
public static Type[] getImplicitLowerBounds(final WildcardType wildcardType)
public static boolean typesSatisfyVariables(final Map<TypeVariable<?>, Type> typeVarAssigns)
private static Class<?> getRawType(final ParameterizedType parameterizedType)
public static Class<?> getRawType(final Type type, final Type assigningType)
public static boolean isArrayType(final Type type)
public static Type getArrayComponentType(final Type type)
