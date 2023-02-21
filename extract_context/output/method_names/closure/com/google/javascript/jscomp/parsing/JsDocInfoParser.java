 JsDocInfoParser(JsDocTokenStream stream, Comment commentNode, Node associatedNode, Config config, ErrorReporter errorReporter)
public ExtractionInfo(String string, JsDocToken token)
public ExtendedTypeInfo(JSTypeExpression type, int lineno, int charno)
 void addParserWarning(String messageId, String messageArg, int lineno, int charno)
 void addParserWarning(String messageId, int lineno, int charno)
 void addTypeWarning(String messageId, String messageArg, int lineno, int charno)
 void addTypeWarning(String messageId, int lineno, int charno)
 void setFileLevelJsDocBuilder(Node.FileLevelJsDocBuilder fileLevelJsDocBuilder)
 void setFileOverviewJSDocInfo(JSDocInfo fileOverviewJSDocInfo)
private String getSourceName()
public static Node parseTypeString(String typeString)
 boolean parse()
private void checkExtendedTypes(List<ExtendedTypeInfo> extendedTypes)
private JsDocToken parseSuppressTag(JsDocToken token)
private JsDocToken parseModifiesTag(JsDocToken token)
private Node parseAndRecordTypeNode(JsDocToken token)
private Node parseAndRecordTypeNode(JsDocToken token, boolean matchingLC)
private Node parseAndRecordTypeNameNode(JsDocToken token, int lineno, int startCharno, boolean matchingLC)
private Node parseAndRecordParamTypeNode(JsDocToken token)
private Node parseAndRecordTypeNode(JsDocToken token, int lineno, int startCharno, boolean matchingLC, boolean onlyParseSimpleNames)
private String toString(JsDocToken token)
private JSTypeExpression createJSTypeExpression(Node n)
private ExtractionInfo extractSingleLineBlock()
private ExtractionInfo extractMultilineTextualBlock(JsDocToken token)
private ExtractionInfo extractMultilineTextualBlock(JsDocToken token, WhitespaceOption option)
private ExtractionInfo extractBlockComment(JsDocToken token)
private static String trimEnd(String s)
private Node parseTypeExpressionAnnotation(JsDocToken token)
private Node parseParamTypeExpressionAnnotation(JsDocToken token)
private Node parseTypeNameAnnotation(JsDocToken token)
private Node parseTopLevelTypeExpression(JsDocToken token)
private Node parseTypeExpressionList(JsDocToken token)
private Node parseTypeExpression(JsDocToken token)
private Node parseBasicTypeExpression(JsDocToken token)
private Node parseTypeName(JsDocToken token)
private Node parseFunctionType(JsDocToken token)
private Node parseParametersType(JsDocToken token)
private Node parseResultType(JsDocToken token)
private Node parseUnionType(JsDocToken token)
private Node parseUnionTypeWithAlternate(JsDocToken token, Node alternate)
private Node parseArrayType(JsDocToken token)
private Node parseRecordType(JsDocToken token)
private Node parseFieldTypeList(JsDocToken token)
private Node parseFieldType(JsDocToken token)
private Node parseFieldName(JsDocToken token)
private Node wrapNode(int type, Node n)
private Node newNode(int type)
private Node newStringNode(String s)
private Node newStringNode(String s, int lineno, int charno)
private Node createTemplateNode()
private Node reportTypeSyntaxWarning(String warning)
private Node reportGenericTypeSyntaxWarning()
private JsDocToken eatTokensUntilEOL()
private JsDocToken eatTokensUntilEOL(JsDocToken token)
private void restoreLookAhead(JsDocToken token)
private boolean match(JsDocToken token)
private boolean match(JsDocToken token1, JsDocToken token2)
private JsDocToken next()
private JsDocToken current()
private void skipEOLs()
private boolean hasParsedFileOverviewDocInfo()
 boolean hasParsedJSDocInfo()
 JSDocInfo retrieveAndResetParsedJSDocInfo()
 JSDocInfo getFileOverviewJSDocInfo()
private boolean lookAheadForTypeAnnotation()
