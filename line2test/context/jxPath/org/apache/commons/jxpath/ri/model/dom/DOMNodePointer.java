public DOMNodePointer(Node node, Locale locale)
public DOMNodePointer(Node node, Locale locale, String id)
public DOMNodePointer(NodePointer parent, Node node)
public boolean testNode(NodeTest test)
public static boolean testNode(Node node, NodeTest test)
private static boolean equalStrings(String s1, String s2)
public QName getName()
public String getNamespaceURI()
public NodeIterator childIterator(NodeTest test, boolean reverse, NodePointer startWith)
public NodeIterator attributeIterator(QName name)
public NodePointer namespacePointer(String prefix)
public NodeIterator namespaceIterator()
public String getNamespaceURI(String prefix)
public String getDefaultNamespaceURI()
public Object getBaseValue()
public Object getImmediateNode()
public boolean isActual()
public boolean isCollection()
public int getLength()
public boolean isLeaf()
public boolean isLanguage(String lang)
protected String getLanguage()
public void setValue(Object value)
public NodePointer createChild(JXPathContext context, QName name, int index)
public NodePointer createChild(JXPathContext context, QName name, int index, Object value)
public NodePointer createAttribute(JXPathContext context, QName name)
public void remove()
public String asPath()
private String escape(String string)
private int getRelativePositionByName()
private int getRelativePositionOfElement()
private int getRelativePositionOfTextNode()
private int getRelativePositionOfPI(String target)
public int hashCode()
public boolean equals(Object object)
public static String getPrefix(Node node)
public static String getLocalName(Node node)
public static String getNamespaceURI(Node node)
public Object getValue()
private String stringValue(Node node)
public Pointer getPointerByID(JXPathContext context, String id)
private AbstractFactory getAbstractFactory(JXPathContext context)
public int compareChildNodePointers(NodePointer pointer1, NodePointer pointer2)
long serialVersionUID=Optional[-8751046933894857319L]
Node node
Map namespaces
String defaultNamespace
String id
String XML_NAMESPACE_URI=Optional["http://www.w3.org/XML/1998/namespace"]
String XMLNS_NAMESPACE_URI=Optional["http://www.w3.org/2000/xmlns/"]