public POJOPropertyBuilder(String internalName, AnnotationIntrospector annotationIntrospector, boolean forSerialization)
public POJOPropertyBuilder(POJOPropertyBuilder src, String newName)
public Linked(T v, Linked<T> n, String explName, boolean visible, boolean ignored)
public POJOPropertyBuilder withName(String newName)
public int compareTo(POJOPropertyBuilder other)
public String getName()
public String getInternalName()
public PropertyName getWrapperName()
public boolean isExplicitlyIncluded()
public boolean hasGetter()
public boolean hasSetter()
public boolean hasField()
public boolean hasConstructorParameter()
public boolean couldSerialize()
public AnnotatedMethod getGetter()
public AnnotatedMethod getSetter()
public AnnotatedField getField()
public AnnotatedParameter getConstructorParameter()
public AnnotatedMember getAccessor()
public AnnotatedMember getMutator()
public AnnotatedMember getPrimaryMember()
public Class<?>[] withMember(AnnotatedMember member)
public Class<?>[] findViews()
public AnnotationIntrospector.ReferenceProperty withMember(AnnotatedMember member)
public AnnotationIntrospector.ReferenceProperty findReferenceType()
public Boolean withMember(AnnotatedMember member)
public boolean isTypeId()
public Boolean withMember(AnnotatedMember member)
public boolean isRequired()
public ObjectIdInfo withMember(AnnotatedMember member)
public ObjectIdInfo findObjectIdInfo()
public void addField(AnnotatedField a, String ename, boolean visible, boolean ignored)
public void addCtor(AnnotatedParameter a, String ename, boolean visible, boolean ignored)
public void addGetter(AnnotatedMethod a, String ename, boolean visible, boolean ignored)
public void addSetter(AnnotatedMethod a, String ename, boolean visible, boolean ignored)
public void addAll(POJOPropertyBuilder src)
private static Linked<T> merge(Linked<T> chain1, Linked<T> chain2)
public void removeIgnored()
public void removeNonVisible()
public void removeNonVisible(boolean force)
public void trimByVisibility()
public void mergeAnnotations(boolean forSerialization)
private AnnotationMap _mergeAnnotations(int index, Linked<? extends AnnotatedMember>... nodes)
private Linked<T> _removeIgnored(Linked<T> node)
private Linked<T> _removeNonVisible(Linked<T> node)
private Linked<T> _trimByVisibility(Linked<T> node)
private boolean _anyExplicitNames(Linked<T> n)
public boolean anyVisible()
private boolean _anyVisible(Linked<T> n)
public boolean anyIgnorals()
private boolean _anyIgnorals(Linked<T> n)
public String findNewName()
private Linked<? extends AnnotatedMember> findRenamed(Linked<? extends AnnotatedMember> node, Linked<? extends AnnotatedMember> renamed)
public String toString()
protected T fromMemberAnnotations(WithMember<T> func)
public T withMember(AnnotatedMember member)
public Linked<T> withValue(T newValue)
public Linked<T> withNext(Linked<T> newNext)
public Linked<T> withoutIgnored()
public Linked<T> withoutNonVisible()
private Linked<T> append(Linked<T> appendable)
public Linked<T> trimByVisibility()
public String toString()
