public PropertyBasedObjectIdGenerator(ObjectIdInfo oid, BeanPropertyWriter prop)
protected PropertyBasedObjectIdGenerator(Class<?> scope, BeanPropertyWriter prop)
public boolean canUseFor(ObjectIdGenerator<?> gen)
public Object generateId(Object forPojo)
public ObjectIdGenerator<Object> forScope(Class<?> scope)
public ObjectIdGenerator<Object> newForSerialization(Object context)
public com.fasterxml.jackson.annotation.ObjectIdGenerator.IdKey key(Object key)
