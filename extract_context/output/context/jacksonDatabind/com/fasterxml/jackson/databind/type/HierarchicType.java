public HierarchicType(Type type)
private HierarchicType(Type actualType, Class<?> rawClass, ParameterizedType genericType, HierarchicType superType, HierarchicType subType)
public HierarchicType deepCloneWithoutSubtype()
public void setSuperType(HierarchicType sup)
public final HierarchicType getSuperType()
public void setSubType(HierarchicType sub)
public final HierarchicType getSubType()
public final boolean isGeneric()
public final ParameterizedType asGeneric()
public final Class<?> getRawClass()
public String toString()
Type _actualType
Class<?> _rawClass
ParameterizedType _genericType
HierarchicType _superType
HierarchicType _subType
