private CodeGenerator(CodeConsumer consumer)
 CodeGenerator(CodeConsumer consumer, CompilerOptions options)
 static CodeGenerator forCostEstimation(CodeConsumer consumer)
public void tagAsStrict()
 void add(String str)
private void addIdentifier(String identifier)
 void add(Node n)
 void add(Node n, Context context)
private void unrollBinaryOperator(Node n, int op, String opStr, Context context, Context rhsContext, int leftPrecedence, int rightPrecedence)
 static boolean isSimpleNumber(String s)
 static double getSimpleNumber(String s)
private boolean isIndirectEval(Node n)
private void addNonEmptyStatement(Node n, Context context, boolean allowNonBlockChild)
private boolean isOneExactlyFunctionOrDo(Node n)
private void addExpr(Node n, int minPrecedence, Context context)
 void addList(Node firstInList)
 void addList(Node firstInList, boolean isArrayOrFunctionArgument)
 void addList(Node firstInList, boolean isArrayOrFunctionArgument, Context lhsContext)
 void addArrayList(Node firstInList)
 void addCaseBody(Node caseBody)
 void addAllSiblings(Node n)
private void addJsString(Node n)
private String jsString(String s, boolean useSlashV)
 String regexpEscape(String s, CharsetEncoder outputCharsetEncoder)
 String escapeToDoubleQuotedJsString(String s)
 String regexpEscape(String s)
private String strEscape(String s, char quote, String doublequoteEscape, String singlequoteEscape, String backslashEscape, CharsetEncoder outputCharsetEncoder, boolean useSlashV, boolean isRegexp)
 static String identifierEscape(String s)
private static int getNonEmptyChildCount(Node n, int maxCount)
private static Node getFirstNonEmptyChild(Node n)
private Context getContextForNonEmptyExpression(Context currentContext)
private Context getContextForNoInOperator(Context context)
private static void appendHexJavaScriptRepresentation(StringBuilder sb, char c)
private static void appendHexJavaScriptRepresentation(int codePoint, Appendable out) throws IOException
