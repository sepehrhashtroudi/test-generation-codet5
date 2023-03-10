protected ClassIntrospector()
public Class<?> findMixInClassFor(Class<?> cls)
public abstract BeanDescription forSerialization(SerializationConfig cfg, JavaType type, MixInResolver r)
public abstract BeanDescription forDeserialization(DeserializationConfig cfg, JavaType type, MixInResolver r)
public abstract BeanDescription forDeserializationWithBuilder(DeserializationConfig cfg, JavaType type, MixInResolver r)
public abstract BeanDescription forCreation(DeserializationConfig cfg, JavaType type, MixInResolver r)
public abstract BeanDescription forClassAnnotations(MapperConfig<?> cfg, JavaType type, MixInResolver r)
public abstract BeanDescription forDirectClassAnnotations(MapperConfig<?> cfg, JavaType type, MixInResolver r)
