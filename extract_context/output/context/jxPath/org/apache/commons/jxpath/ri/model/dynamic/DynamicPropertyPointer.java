public DynamicPropertyPointer(NodePointer parent, DynamicPropertyHandler handler)
public boolean isContainer()
public int getPropertyCount()
public String[] getPropertyNames()
public String getPropertyName()
public void setPropertyName(String propertyName)
public int getPropertyIndex()
public void setPropertyIndex(int index)
public Object getBaseValue()
public Object getImmediateNode()
protected boolean isActualProperty()
public void setValue(Object value)
public NodePointer createPath(JXPathContext context)
public NodePointer createPath(JXPathContext context, Object value)
public void remove()
private void removeKey()
public String asPath()
private String escape(String string)
private AbstractFactory getAbstractFactory(JXPathContext context)
long serialVersionUID=Optional[-5720585681149150822L]
DynamicPropertyHandler handler
String name
String[] names
String requiredPropertyName
