 void startSourceMapping(Node node)
 void endSourceMapping(Node node)
 boolean continueProcessing()
 abstract char getLastChar()
 void addIdentifier(String identifier)
 abstract void append(String str)
 void appendBlockStart()
 void appendBlockEnd()
 void startNewLine()
 void maybeLineBreak()
 void maybeCutLine()
 void endLine()
 void notePreferredLineBreak()
 void beginBlock()
 void endBlock()
 void endBlock(boolean shouldEndLine)
 void listSeparator()
 void endStatement()
 void endStatement(boolean needSemiColon)
 void maybeEndStatement()
 void endFunction()
 void endFunction(boolean statementContext)
 void beginCaseBody()
 void endCaseBody()
 void add(String newcode)
 void appendOp(String op, boolean binOp)
 void addOp(String op, boolean binOp)
 void addNumber(double x)
 void addConstant(String newcode)
 static boolean isNegativeZero(double x)
 static boolean isWordChar(char ch)
 boolean shouldPreserveExtraBlocks()
 boolean breakAfterBlockFor(Node n, boolean statementContext)
 void endFile()
boolean statementNeedsEnded=Optional[false]
boolean statementStarted=Optional[false]
boolean sawFunction=Optional[false]
