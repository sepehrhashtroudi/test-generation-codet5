public SimpleBeanPropertyDefinition(AnnotatedMember member)
public SimpleBeanPropertyDefinition(AnnotatedMember member, String name)
private SimpleBeanPropertyDefinition(AnnotatedMember member, String name, AnnotationIntrospector intr)
public static SimpleBeanPropertyDefinition construct(MapperConfig<?> config, AnnotatedMember member)
public static SimpleBeanPropertyDefinition construct(MapperConfig<?> config, AnnotatedMember member, String name)
public SimpleBeanPropertyDefinition withName(String newName)
public String getName()
public String getInternalName()
public PropertyName getWrapperName()
public boolean isExplicitlyIncluded()
public boolean hasGetter()
public boolean hasSetter()
public boolean hasField()
public boolean hasConstructorParameter()
public AnnotatedMethod getGetter()
public AnnotatedMethod getSetter()
public AnnotatedField getField()
public AnnotatedParameter getConstructorParameter()
public AnnotatedMember getAccessor()
public AnnotatedMember getMutator()
public AnnotatedMember getPrimaryMember()
