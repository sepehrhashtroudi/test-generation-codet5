public abstract BeanPropertyDefinition withName(String newName)
public abstract String getName()
public abstract String getInternalName()
public abstract PropertyName getWrapperName()
public abstract boolean isExplicitlyIncluded()
public boolean couldDeserialize()
public boolean couldSerialize()
public abstract boolean hasGetter()
public abstract boolean hasSetter()
public abstract boolean hasField()
public abstract boolean hasConstructorParameter()
public abstract AnnotatedMethod getGetter()
public abstract AnnotatedMethod getSetter()
public abstract AnnotatedField getField()
public abstract AnnotatedParameter getConstructorParameter()
public abstract AnnotatedMember getAccessor()
public abstract AnnotatedMember getMutator()
public AnnotatedMember getPrimaryMember()
public Class<?>[] findViews()
public AnnotationIntrospector.ReferenceProperty findReferenceType()
public boolean isTypeId()
public ObjectIdInfo findObjectIdInfo()
public boolean isRequired()
