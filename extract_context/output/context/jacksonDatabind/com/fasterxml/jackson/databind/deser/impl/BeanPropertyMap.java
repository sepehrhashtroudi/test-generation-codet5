public BeanPropertyMap(Collection<SettableBeanProperty> properties)
private BeanPropertyMap(Bucket[] buckets, int size, int index)
public Bucket(Bucket next, String key, SettableBeanProperty value, int index)
public IteratorImpl(Bucket[] buckets)
public BeanPropertyMap withProperty(SettableBeanProperty newProperty)
public BeanPropertyMap renameAll(NameTransformer transformer)
public BeanPropertyMap assignIndexes()
private static final int findSize(int size)
public String toString()
public Iterator<SettableBeanProperty> iterator()
public SettableBeanProperty[] getPropertiesInInsertionOrder()
public int size()
public SettableBeanProperty find(String key)
public void replace(SettableBeanProperty property)
public void remove(SettableBeanProperty property)
private SettableBeanProperty _findWithEquals(String key, int index)
public boolean hasNext()
public SettableBeanProperty next()
public void remove()
long serialVersionUID=Optional[1L]
Bucket[] _buckets
int _hashMask
int _size
int _nextBucketIndex=Optional[0]
