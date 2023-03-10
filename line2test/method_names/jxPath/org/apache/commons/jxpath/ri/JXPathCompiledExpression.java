public JXPathCompiledExpression(String xpath, Expression expression)
protected String getXPath()
protected Expression getExpression()
public String toString()
public Object getValue(JXPathContext context)
public Object getValue(JXPathContext context, Class requiredType)
public void setValue(JXPathContext context, Object value)
public Pointer createPath(JXPathContext context)
public Pointer createPathAndSetValue(JXPathContext context, Object value)
public Iterator iterate(JXPathContext context)
public Pointer getPointer(JXPathContext context, String xpath)
public Iterator iteratePointers(JXPathContext context)
public void removePath(JXPathContext context)
public void removeAll(JXPathContext context)
