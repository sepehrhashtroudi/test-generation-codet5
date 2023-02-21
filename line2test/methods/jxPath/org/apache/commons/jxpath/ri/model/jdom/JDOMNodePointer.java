public JDOMNodePointer(Object node, Locale locale) { [EOL]     super(null, locale); [EOL]     this.node = node; [EOL] } <line_num>: 61,64
public JDOMNodePointer(Object node, Locale locale, String id) { [EOL]     super(null, locale); [EOL]     this.node = node; [EOL]     this.id = id; [EOL] } <line_num>: 66,70
public JDOMNodePointer(NodePointer parent, Object node) { [EOL]     super(parent); [EOL]     this.node = node; [EOL] } <line_num>: 72,75
public NodeIterator childIterator(NodeTest test, boolean reverse, NodePointer startWith) { [EOL]     return new JDOMNodeIterator(this, test, reverse, startWith); [EOL] } <line_num>: 77,83
public NodeIterator attributeIterator(QName name) { [EOL]     return new JDOMAttributeIterator(this, name); [EOL] } <line_num>: 85,87
public NodeIterator namespaceIterator() { [EOL]     return new JDOMNamespaceIterator(this); [EOL] } <line_num>: 89,91
public NodePointer namespacePointer(String prefix) { [EOL]     return new JDOMNamespacePointer(this, prefix); [EOL] } <line_num>: 93,95
public String getNamespaceURI() { [EOL]     return getNamespaceURI(node); [EOL] } <line_num>: 97,99
private static String getNamespaceURI(Object node) { [EOL]     if (node instanceof Element) { [EOL]         Element element = (Element) node; [EOL]         String ns = element.getNamespaceURI(); [EOL]         if (ns != null && ns.equals("")) { [EOL]             ns = null; [EOL]         } [EOL]         return ns; [EOL]     } [EOL]     return null; [EOL] } <line_num>: 101,111
public String getNamespaceURI(String prefix) { [EOL]     if (node instanceof Document) { [EOL]         Element element = ((Document) node).getRootElement(); [EOL]         Namespace ns = element.getNamespace(prefix); [EOL]         if (ns != null) { [EOL]             return ns.getURI(); [EOL]         } [EOL]     } else if (node instanceof Element) { [EOL]         Element element = (Element) node; [EOL]         Namespace ns = element.getNamespace(prefix); [EOL]         if (ns != null) { [EOL]             return ns.getURI(); [EOL]         } [EOL]     } [EOL]     return null; [EOL] } <line_num>: 113,129
public int compareChildNodePointers(NodePointer pointer1, NodePointer pointer2) { [EOL]     Object node1 = pointer1.getBaseValue(); [EOL]     Object node2 = pointer2.getBaseValue(); [EOL]     if (node1 == node2) { [EOL]         return 0; [EOL]     } [EOL]     if ((node1 instanceof Attribute) && !(node2 instanceof Attribute)) { [EOL]         return -1; [EOL]     } else if (!(node1 instanceof Attribute) && (node2 instanceof Attribute)) { [EOL]         return 1; [EOL]     } else if ((node1 instanceof Attribute) && (node2 instanceof Attribute)) { [EOL]         List list = ((Element) getNode()).getAttributes(); [EOL]         int length = list.size(); [EOL]         for (int i = 0; i < length; i++) { [EOL]             Object n = list.get(i); [EOL]             if (n == node1) { [EOL]                 return -1; [EOL]             } else if (n == node2) { [EOL]                 return 1; [EOL]             } [EOL]         } [EOL]         return 0; [EOL]     } [EOL]     if (!(node instanceof Element)) { [EOL]         throw new RuntimeException("JXPath internal error: " + "compareChildNodes called for " + node); [EOL]     } [EOL]     List children = ((Element) node).getContent(); [EOL]     int length = children.size(); [EOL]     for (int i = 0; i < length; i++) { [EOL]         Object n = children.get(i); [EOL]         if (n == node1) { [EOL]             return -1; [EOL]         } else if (n == node2) { [EOL]             return 1; [EOL]         } [EOL]     } [EOL]     return 0; [EOL] } <line_num>: 131,184
public Object getBaseValue() { [EOL]     return node; [EOL] } <line_num>: 190,192
public boolean isCollection() { [EOL]     return false; [EOL] } <line_num>: 194,196
public int getLength() { [EOL]     return 1; [EOL] } <line_num>: 198,200
public boolean isLeaf() { [EOL]     if (node instanceof Element) { [EOL]         return ((Element) node).getContent().size() == 0; [EOL]     } else if (node instanceof Document) { [EOL]         return ((Document) node).getContent().size() == 0; [EOL]     } [EOL]     return true; [EOL] } <line_num>: 202,210
public QName getName() { [EOL]     String ns = null; [EOL]     String ln = null; [EOL]     if (node instanceof Element) { [EOL]         ns = ((Element) node).getNamespacePrefix(); [EOL]         if (ns != null && ns.equals("")) { [EOL]             ns = null; [EOL]         } [EOL]         ln = ((Element) node).getName(); [EOL]     } else if (node instanceof ProcessingInstruction) { [EOL]         ln = ((ProcessingInstruction) node).getTarget(); [EOL]     } [EOL]     return new QName(ns, ln); [EOL] } <line_num>: 215,229
public Object getImmediateNode() { [EOL]     return node; [EOL] } <line_num>: 234,236
public Object getValue() { [EOL]     if (node instanceof Element) { [EOL]         return ((Element) node).getTextTrim(); [EOL]     } else if (node instanceof Comment) { [EOL]         String text = ((Comment) node).getText(); [EOL]         if (text != null) { [EOL]             text = text.trim(); [EOL]         } [EOL]         return text; [EOL]     } else if (node instanceof Text) { [EOL]         return ((Text) node).getTextTrim(); [EOL]     } else if (node instanceof CDATA) { [EOL]         return ((CDATA) node).getTextTrim(); [EOL]     } else if (node instanceof ProcessingInstruction) { [EOL]         String text = ((ProcessingInstruction) node).getData(); [EOL]         if (text != null) { [EOL]             text = text.trim(); [EOL]         } [EOL]         return text; [EOL]     } [EOL]     return null; [EOL] } <line_num>: 238,263
public void setValue(Object value) { [EOL]     if (node instanceof Text) { [EOL]         String string = (String) TypeUtils.convert(value, String.class); [EOL]         if (string != null && !string.equals("")) { [EOL]             ((Text) node).setText(string); [EOL]         } else { [EOL]             nodeParent(node).removeContent((Text) node); [EOL]         } [EOL]     } else { [EOL]         Element element = (Element) node; [EOL]         element.getContent().clear(); [EOL]         if (value instanceof Element) { [EOL]             Element valueElement = (Element) value; [EOL]             addContent(valueElement.getContent()); [EOL]         } else if (value instanceof Document) { [EOL]             Document valueDocument = (Document) value; [EOL]             addContent(valueDocument.getContent()); [EOL]         } else if (value instanceof Text || value instanceof CDATA) { [EOL]             String string = ((Text) value).getText(); [EOL]             element.addContent(new Text(string)); [EOL]         } else if (value instanceof ProcessingInstruction) { [EOL]             ProcessingInstruction pi = (ProcessingInstruction) ((ProcessingInstruction) value).clone(); [EOL]             element.addContent(pi); [EOL]         } else if (value instanceof Comment) { [EOL]             Comment comment = (Comment) ((Comment) value).clone(); [EOL]             element.addContent(comment); [EOL]         } else { [EOL]             String string = (String) TypeUtils.convert(value, String.class); [EOL]             if (string != null && !string.equals("")) { [EOL]                 element.addContent(new Text(string)); [EOL]             } [EOL]         } [EOL]     } [EOL] } <line_num>: 265,308
private void addContent(List content) { [EOL]     Element element = (Element) node; [EOL]     int count = content.size(); [EOL]     for (int i = 0; i < count; i++) { [EOL]         Object child = content.get(i); [EOL]         if (child instanceof Element) { [EOL]             child = ((Element) child).clone(); [EOL]             element.addContent((Element) child); [EOL]         } else if (child instanceof Text) { [EOL]             child = ((Text) child).clone(); [EOL]             element.addContent((Text) child); [EOL]         } else if (node instanceof CDATA) { [EOL]             child = ((CDATA) child).clone(); [EOL]             element.addContent((CDATA) child); [EOL]         } else if (node instanceof ProcessingInstruction) { [EOL]             child = ((ProcessingInstruction) child).clone(); [EOL]             element.addContent((ProcessingInstruction) child); [EOL]         } else if (node instanceof Comment) { [EOL]             child = ((Comment) child).clone(); [EOL]             element.addContent((Comment) child); [EOL]         } [EOL]     } [EOL] } <line_num>: 310,337
public boolean testNode(NodeTest test) { [EOL]     return testNode(this, node, test); [EOL] } <line_num>: 339,341
public static boolean testNode(NodePointer pointer, Object node, NodeTest test) { [EOL]     if (test == null) { [EOL]         return true; [EOL]     } else if (test instanceof NodeNameTest) { [EOL]         if (!(node instanceof Element)) { [EOL]             return false; [EOL]         } [EOL]         NodeNameTest nodeNameTest = (NodeNameTest) test; [EOL]         QName testName = nodeNameTest.getNodeName(); [EOL]         String namespaceURI = nodeNameTest.getNamespaceURI(); [EOL]         boolean wildcard = nodeNameTest.isWildcard(); [EOL]         String testPrefix = testName.getPrefix(); [EOL]         if (wildcard && testPrefix == null) { [EOL]             return true; [EOL]         } [EOL]         if (wildcard || testName.getName().equals(JDOMNodePointer.getLocalName(node))) { [EOL]             String nodeNS = JDOMNodePointer.getNamespaceURI(node); [EOL]             return equalStrings(namespaceURI, nodeNS); [EOL]         } [EOL]     } else if (test instanceof NodeTypeTest) { [EOL]         switch(((NodeTypeTest) test).getNodeType()) { [EOL]             case Compiler.NODE_TYPE_NODE: [EOL]                 return (node instanceof Element) || (node instanceof Document); [EOL]             case Compiler.NODE_TYPE_TEXT: [EOL]                 return (node instanceof Text) || (node instanceof CDATA); [EOL]             case Compiler.NODE_TYPE_COMMENT: [EOL]                 return node instanceof Comment; [EOL]             case Compiler.NODE_TYPE_PI: [EOL]                 return node instanceof ProcessingInstruction; [EOL]         } [EOL]         return false; [EOL]     } else if (test instanceof ProcessingInstructionTest) { [EOL]         if (node instanceof ProcessingInstruction) { [EOL]             String testPI = ((ProcessingInstructionTest) test).getTarget(); [EOL]             String nodePI = ((ProcessingInstruction) node).getTarget(); [EOL]             return testPI.equals(nodePI); [EOL]         } [EOL]     } [EOL]     return false; [EOL] } <line_num>: 343,395
private static boolean equalStrings(String s1, String s2) { [EOL]     if (s1 == null && s2 != null) { [EOL]         return false; [EOL]     } [EOL]     if (s1 != null && s2 == null) { [EOL]         return false; [EOL]     } [EOL]     if (s1 != null && !s1.trim().equals(s2.trim())) { [EOL]         return false; [EOL]     } [EOL]     return true; [EOL] } <line_num>: 397,410
public static String getPrefix(Object node) { [EOL]     if (node instanceof Element) { [EOL]         String prefix = ((Element) node).getNamespacePrefix(); [EOL]         return (prefix == null || prefix.equals("")) ? null : prefix; [EOL]     } else if (node instanceof Attribute) { [EOL]         String prefix = ((Attribute) node).getNamespacePrefix(); [EOL]         return (prefix == null || prefix.equals("")) ? null : prefix; [EOL]     } [EOL]     return null; [EOL] } <line_num>: 412,422
public static String getLocalName(Object node) { [EOL]     if (node instanceof Element) { [EOL]         return ((Element) node).getName(); [EOL]     } else if (node instanceof Attribute) { [EOL]         return ((Attribute) node).getName(); [EOL]     } [EOL]     return null; [EOL] } <line_num>: 424,432
public boolean isLanguage(String lang) { [EOL]     String current = getLanguage(); [EOL]     if (current == null) { [EOL]         return super.isLanguage(lang); [EOL]     } [EOL]     return current.toUpperCase().startsWith(lang.toUpperCase()); [EOL] } <line_num>: 439,445
protected String getLanguage() { [EOL]     Object n = node; [EOL]     while (n != null) { [EOL]         if (n instanceof Element) { [EOL]             Element e = (Element) n; [EOL]             String attr = e.getAttributeValue("lang", Namespace.XML_NAMESPACE); [EOL]             if (attr != null && !attr.equals("")) { [EOL]                 return attr; [EOL]             } [EOL]         } [EOL]         n = nodeParent(n); [EOL]     } [EOL]     return null; [EOL] } <line_num>: 447,461
private Element nodeParent(Object node) { [EOL]     if (node instanceof Element) { [EOL]         Object parent = ((Element) node).getParent(); [EOL]         if (parent instanceof Element) { [EOL]             return (Element) parent; [EOL]         } [EOL]     } else if (node instanceof Text) { [EOL]         return (Element) ((Text) node).getParent(); [EOL]     } else if (node instanceof CDATA) { [EOL]         return (Element) ((CDATA) node).getParent(); [EOL]     } else if (node instanceof ProcessingInstruction) { [EOL]         return (Element) ((ProcessingInstruction) node).getParent(); [EOL]     } else if (node instanceof Comment) { [EOL]         return (Element) ((Comment) node).getParent(); [EOL]     } [EOL]     return null; [EOL] } <line_num>: 463,483
public NodePointer createChild(JXPathContext context, QName name, int index) { [EOL]     if (index == WHOLE_COLLECTION) { [EOL]         index = 0; [EOL]     } [EOL]     boolean success = getAbstractFactory(context).createObject(context, this, node, name.toString(), index); [EOL]     if (success) { [EOL]         NodeTest nodeTest; [EOL]         String prefix = name.getPrefix(); [EOL]         String namespaceURI = prefix != null ? context.getNamespaceURI(prefix) : context.getDefaultNamespaceURI(); [EOL]         nodeTest = new NodeNameTest(name, namespaceURI); [EOL]         NodeIterator it = childIterator(nodeTest, false, null); [EOL]         if (it != null && it.setPosition(index + 1)) { [EOL]             return it.getNodePointer(); [EOL]         } [EOL]     } [EOL]     throw new JXPathAbstractFactoryException("Factory could not create " + "a child node for path: " + asPath() + "/" + name + "[" + (index + 1) + "]"); [EOL] } <line_num>: 485,517
public NodePointer createChild(JXPathContext context, QName name, int index, Object value) { [EOL]     NodePointer ptr = createChild(context, name, index); [EOL]     ptr.setValue(value); [EOL]     return ptr; [EOL] } <line_num>: 519,525
public NodePointer createAttribute(JXPathContext context, QName name) { [EOL]     if (!(node instanceof Element)) { [EOL]         return super.createAttribute(context, name); [EOL]     } [EOL]     Element element = (Element) node; [EOL]     String prefix = name.getPrefix(); [EOL]     if (prefix != null) { [EOL]         Namespace ns = element.getNamespace(prefix); [EOL]         if (ns == null) { [EOL]             throw new JXPathException("Unknown namespace prefix: " + prefix); [EOL]         } [EOL]         Attribute attr = element.getAttribute(name.getName(), ns); [EOL]         if (attr == null) { [EOL]             element.setAttribute(name.getName(), "", ns); [EOL]         } [EOL]     } else { [EOL]         Attribute attr = element.getAttribute(name.getName()); [EOL]         if (attr == null) { [EOL]             element.setAttribute(name.getName(), ""); [EOL]         } [EOL]     } [EOL]     NodeIterator it = attributeIterator(name); [EOL]     it.setPosition(1); [EOL]     return it.getNodePointer(); [EOL] } <line_num>: 527,554
public void remove() { [EOL]     Element parent = nodeParent(node); [EOL]     if (parent == null) { [EOL]         throw new JXPathException("Cannot remove root JDOM node"); [EOL]     } [EOL]     parent.getContent().remove(node); [EOL] } <line_num>: 556,562
public String asPath() { [EOL]     if (id != null) { [EOL]         return "id('" + escape(id) + "')"; [EOL]     } [EOL]     StringBuffer buffer = new StringBuffer(); [EOL]     if (parent != null) { [EOL]         buffer.append(parent.asPath()); [EOL]     } [EOL]     if (node instanceof Element) { [EOL]         if (parent instanceof JDOMNodePointer) { [EOL]             if (buffer.length() == 0 || buffer.charAt(buffer.length() - 1) != '/') { [EOL]                 buffer.append('/'); [EOL]             } [EOL]             String nsURI = getNamespaceURI(); [EOL]             String ln = JDOMNodePointer.getLocalName(node); [EOL]             if (equalStrings(nsURI, getNamespaceResolver().getDefaultNamespaceURI())) { [EOL]                 buffer.append(ln); [EOL]                 buffer.append('['); [EOL]                 buffer.append(getRelativePositionByName()).append(']'); [EOL]             } else { [EOL]                 String prefix = getNamespaceResolver().getPrefix(nsURI); [EOL]                 if (prefix != null) { [EOL]                     buffer.append(prefix); [EOL]                     buffer.append(':'); [EOL]                     buffer.append(ln); [EOL]                     buffer.append('['); [EOL]                     buffer.append(getRelativePositionByName()); [EOL]                     buffer.append(']'); [EOL]                 } else { [EOL]                     buffer.append("node()"); [EOL]                     buffer.append('['); [EOL]                     buffer.append(getRelativePositionOfElement()); [EOL]                     buffer.append(']'); [EOL]                 } [EOL]             } [EOL]         } [EOL]     } else if (node instanceof Text || node instanceof CDATA) { [EOL]         buffer.append("/text()"); [EOL]         buffer.append('[').append(getRelativePositionOfTextNode()).append(']'); [EOL]     } else if (node instanceof ProcessingInstruction) { [EOL]         String target = ((ProcessingInstruction) node).getTarget(); [EOL]         buffer.append("/processing-instruction(\'").append(target).append("')"); [EOL]         buffer.append('[').append(getRelativePositionOfPI(target)).append(']'); [EOL]     } [EOL]     return buffer.toString(); [EOL] } <line_num>: 564,624
private String escape(String string) { [EOL]     int index = string.indexOf('\''); [EOL]     while (index != -1) { [EOL]         string = string.substring(0, index) + "&apos;" + string.substring(index + 1); [EOL]         index = string.indexOf('\''); [EOL]     } [EOL]     index = string.indexOf('\"'); [EOL]     while (index != -1) { [EOL]         string = string.substring(0, index) + "&quot;" + string.substring(index + 1); [EOL]         index = string.indexOf('\"'); [EOL]     } [EOL]     return string; [EOL] } <line_num>: 626,644
private int getRelativePositionByName() { [EOL]     if (node instanceof Element) { [EOL]         Object parent = ((Element) node).getParent(); [EOL]         if (!(parent instanceof Element)) { [EOL]             return 1; [EOL]         } [EOL]         List children = ((Element) parent).getContent(); [EOL]         int count = 0; [EOL]         String name = ((Element) node).getQualifiedName(); [EOL]         for (int i = 0; i < children.size(); i++) { [EOL]             Object child = children.get(i); [EOL]             if ((child instanceof Element) && ((Element) child).getQualifiedName().equals(name)) { [EOL]                 count++; [EOL]             } [EOL]             if (child == node) { [EOL]                 break; [EOL]             } [EOL]         } [EOL]         return count; [EOL]     } [EOL]     return 1; [EOL] } <line_num>: 646,669
private int getRelativePositionOfElement() { [EOL]     Object parent = ((Element) node).getParent(); [EOL]     if (parent == null) { [EOL]         return 1; [EOL]     } [EOL]     List children; [EOL]     if (parent instanceof Element) { [EOL]         children = ((Element) parent).getContent(); [EOL]     } else { [EOL]         children = ((Document) parent).getContent(); [EOL]     } [EOL]     int count = 0; [EOL]     for (int i = 0; i < children.size(); i++) { [EOL]         Object child = children.get(i); [EOL]         if (child instanceof Element) { [EOL]             count++; [EOL]         } [EOL]         if (child == node) { [EOL]             break; [EOL]         } [EOL]     } [EOL]     return count; [EOL] } <line_num>: 671,694
private int getRelativePositionOfTextNode() { [EOL]     Element parent; [EOL]     if (node instanceof Text) { [EOL]         parent = (Element) ((Text) node).getParent(); [EOL]     } else { [EOL]         parent = (Element) ((CDATA) node).getParent(); [EOL]     } [EOL]     if (parent == null) { [EOL]         return 1; [EOL]     } [EOL]     List children = parent.getContent(); [EOL]     int count = 0; [EOL]     for (int i = 0; i < children.size(); i++) { [EOL]         Object child = children.get(i); [EOL]         if (child instanceof Text || child instanceof CDATA) { [EOL]             count++; [EOL]         } [EOL]         if (child == node) { [EOL]             break; [EOL]         } [EOL]     } [EOL]     return count; [EOL] } <line_num>: 696,719
private int getRelativePositionOfPI(String target) { [EOL]     Element parent = (Element) ((ProcessingInstruction) node).getParent(); [EOL]     if (parent == null) { [EOL]         return 1; [EOL]     } [EOL]     List children = parent.getContent(); [EOL]     int count = 0; [EOL]     for (int i = 0; i < children.size(); i++) { [EOL]         Object child = children.get(i); [EOL]         if (child instanceof ProcessingInstruction && (target == null || target.equals(((ProcessingInstruction) child).getTarget()))) { [EOL]             count++; [EOL]         } [EOL]         if (child == node) { [EOL]             break; [EOL]         } [EOL]     } [EOL]     return count; [EOL] } <line_num>: 721,741
public int hashCode() { [EOL]     return System.identityHashCode(node); [EOL] } <line_num>: 743,745
public boolean equals(Object object) { [EOL]     if (object == this) { [EOL]         return true; [EOL]     } [EOL]     if (!(object instanceof JDOMNodePointer)) { [EOL]         return false; [EOL]     } [EOL]     JDOMNodePointer other = (JDOMNodePointer) object; [EOL]     return node == other.node; [EOL] } <line_num>: 747,758
private AbstractFactory getAbstractFactory(JXPathContext context) { [EOL]     AbstractFactory factory = context.getFactory(); [EOL]     if (factory == null) { [EOL]         throw new JXPathException("Factory is not set on the JXPathContext - cannot create path: " + asPath()); [EOL]     } [EOL]     return factory; [EOL] } <line_num>: 759,767