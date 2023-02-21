private Parser(String html, String baseUri, boolean isBodyFragment)
public static Document parse(String html, String baseUri)
public static Document parseBodyFragment(String bodyHtml, String baseUri)
private Document parse()
private void parseComment()
private void parseXmlDecl()
private void parseEndTag()
private void parseStartTag()
private Attribute parseAttribute()
private void parseTextNode()
private void parseCdata()
private Element addChildToParent(Element child, boolean isEmptyElement)
private boolean stackHasValidParent(Tag childTag)
private Element popStackToSuitableContainer(Tag tag)
private Element popStackToClose(Tag tag)
private Element last()
String SQ=Optional["'"]
String DQ=Optional["\""]
Tag htmlTag=Optional[Tag.valueOf("html")]
Tag headTag=Optional[Tag.valueOf("head")]
Tag bodyTag=Optional[Tag.valueOf("body")]
Tag titleTag=Optional[Tag.valueOf("title")]
Tag textareaTag=Optional[Tag.valueOf("textarea")]
LinkedList<Element> stack
TokenQueue tq
Document doc
String baseUri
