abstract T processArrayLiteral(ArrayLiteral literalNode); <line_num>: 75,75
abstract T processAssignment(Assignment assignmentNode); <line_num>: 76,76
abstract T processAstRoot(AstRoot rootNode); <line_num>: 77,77
abstract T processBlock(Block blockNode); <line_num>: 78,78
abstract T processBreakStatement(BreakStatement statementNode); <line_num>: 79,79
abstract T processCatchClause(CatchClause clauseNode); <line_num>: 80,80
abstract T processConditionalExpression(ConditionalExpression exprNode); <line_num>: 81,81
abstract T processContinueStatement(ContinueStatement statementNode); <line_num>: 82,82
abstract T processDoLoop(DoLoop loopNode); <line_num>: 83,83
abstract T processElementGet(ElementGet getNode); <line_num>: 84,84
abstract T processEmptyExpression(EmptyExpression exprNode); <line_num>: 85,85
abstract T processEmptyStatement(EmptyStatement exprNode); <line_num>: 86,86
abstract T processExpressionStatement(ExpressionStatement statementNode); <line_num>: 87,87
abstract T processForInLoop(ForInLoop loopNode); <line_num>: 88,88
abstract T processForLoop(ForLoop loopNode); <line_num>: 89,89
abstract T processFunctionCall(FunctionCall callNode); <line_num>: 90,90
abstract T processFunctionNode(FunctionNode functionNode); <line_num>: 91,91
abstract T processIfStatement(IfStatement statementNode); <line_num>: 92,92
abstract T processInfixExpression(InfixExpression exprNode); <line_num>: 93,93
abstract T processKeywordLiteral(KeywordLiteral literalNode); <line_num>: 94,94
abstract T processLabel(Label labelNode); <line_num>: 95,95
abstract T processLabeledStatement(LabeledStatement statementNode); <line_num>: 96,96
abstract T processName(Name nameNode); <line_num>: 97,97
abstract T processNewExpression(NewExpression exprNode); <line_num>: 98,98
abstract T processNumberLiteral(NumberLiteral literalNode); <line_num>: 99,99
abstract T processObjectLiteral(ObjectLiteral literalNode); <line_num>: 100,100
abstract T processObjectProperty(ObjectProperty propertyNode); <line_num>: 101,101
abstract T processParenthesizedExpression(ParenthesizedExpression exprNode); <line_num>: 102,102
abstract T processPropertyGet(PropertyGet getNode); <line_num>: 103,103
abstract T processRegExpLiteral(RegExpLiteral literalNode); <line_num>: 104,104
abstract T processReturnStatement(ReturnStatement statementNode); <line_num>: 105,105
abstract T processScope(Scope scopeNode); <line_num>: 106,106
abstract T processStringLiteral(StringLiteral literalNode); <line_num>: 107,107
abstract T processSwitchCase(SwitchCase caseNode); <line_num>: 108,108
abstract T processSwitchStatement(SwitchStatement statementNode); <line_num>: 109,109
abstract T processThrowStatement(ThrowStatement statementNode); <line_num>: 110,110
abstract T processTryStatement(TryStatement statementNode); <line_num>: 111,111
abstract T processUnaryExpression(UnaryExpression exprNode); <line_num>: 112,112
abstract T processVariableDeclaration(VariableDeclaration declarationNode); <line_num>: 113,113
abstract T processVariableInitializer(VariableInitializer initializerNode); <line_num>: 114,114
abstract T processWhileLoop(WhileLoop loopNode); <line_num>: 115,115
abstract T processWithStatement(WithStatement statementNode); <line_num>: 116,116
abstract T processIllegalToken(AstNode node); <line_num>: 118,118
public T process(AstNode node) { [EOL]     switch(node.getType()) { [EOL]         case Token.ADD: [EOL]         case Token.AND: [EOL]         case Token.BITAND: [EOL]         case Token.BITOR: [EOL]         case Token.BITXOR: [EOL]         case Token.COMMA: [EOL]         case Token.DIV: [EOL]         case Token.EQ: [EOL]         case Token.GE: [EOL]         case Token.GT: [EOL]         case Token.IN: [EOL]         case Token.INSTANCEOF: [EOL]         case Token.LE: [EOL]         case Token.LSH: [EOL]         case Token.LT: [EOL]         case Token.MOD: [EOL]         case Token.MUL: [EOL]         case Token.NE: [EOL]         case Token.OR: [EOL]         case Token.RSH: [EOL]         case Token.SHEQ: [EOL]         case Token.SHNE: [EOL]         case Token.SUB: [EOL]         case Token.URSH: [EOL]             return processInfixExpression((InfixExpression) node); [EOL]         case Token.ARRAYLIT: [EOL]             return processArrayLiteral((ArrayLiteral) node); [EOL]         case Token.ASSIGN: [EOL]         case Token.ASSIGN_ADD: [EOL]         case Token.ASSIGN_BITAND: [EOL]         case Token.ASSIGN_BITOR: [EOL]         case Token.ASSIGN_BITXOR: [EOL]         case Token.ASSIGN_DIV: [EOL]         case Token.ASSIGN_LSH: [EOL]         case Token.ASSIGN_MOD: [EOL]         case Token.ASSIGN_MUL: [EOL]         case Token.ASSIGN_RSH: [EOL]         case Token.ASSIGN_SUB: [EOL]         case Token.ASSIGN_URSH: [EOL]             return processAssignment((Assignment) node); [EOL]         case Token.BITNOT: [EOL]         case Token.DEC: [EOL]         case Token.DELPROP: [EOL]         case Token.INC: [EOL]         case Token.NEG: [EOL]         case Token.NOT: [EOL]         case Token.POS: [EOL]         case Token.TYPEOF: [EOL]         case Token.VOID: [EOL]             return processUnaryExpression((UnaryExpression) node); [EOL]         case Token.BLOCK: [EOL]             if (node instanceof Block) { [EOL]                 return processBlock((Block) node); [EOL]             } else if (node instanceof Scope) { [EOL]                 return processScope((Scope) node); [EOL]             } else { [EOL]                 throw new IllegalStateException("Unexpected node type.  class: " + node.getClass() + " type: " + Token.typeToName(node.getType())); [EOL]             } [EOL]         case Token.BREAK: [EOL]             return processBreakStatement((BreakStatement) node); [EOL]         case Token.CALL: [EOL]             return processFunctionCall((FunctionCall) node); [EOL]         case Token.CASE: [EOL]         case Token.DEFAULT: [EOL]             return processSwitchCase((SwitchCase) node); [EOL]         case Token.CATCH: [EOL]             return processCatchClause((CatchClause) node); [EOL]         case Token.COLON: [EOL]             return processObjectProperty((ObjectProperty) node); [EOL]         case Token.CONTINUE: [EOL]             return processContinueStatement((ContinueStatement) node); [EOL]         case Token.DO: [EOL]             return processDoLoop((DoLoop) node); [EOL]         case Token.EMPTY: [EOL]             return (node instanceof EmptyExpression) ? processEmptyExpression((EmptyExpression) node) : processEmptyStatement((EmptyStatement) node); [EOL]         case Token.EXPR_RESULT: [EOL]         case Token.EXPR_VOID: [EOL]             if (node instanceof ExpressionStatement) { [EOL]                 return processExpressionStatement((ExpressionStatement) node); [EOL]             } else if (node instanceof LabeledStatement) { [EOL]                 return processLabeledStatement((LabeledStatement) node); [EOL]             } else { [EOL]                 throw new IllegalStateException("Unexpected node type.  class: " + node.getClass() + " type: " + Token.typeToName(node.getType())); [EOL]             } [EOL]         case Token.DEBUGGER: [EOL]         case Token.FALSE: [EOL]         case Token.NULL: [EOL]         case Token.THIS: [EOL]         case Token.TRUE: [EOL]             return processKeywordLiteral((KeywordLiteral) node); [EOL]         case Token.FOR: [EOL]             if (node instanceof ForInLoop) { [EOL]                 return processForInLoop((ForInLoop) node); [EOL]             } else if (node instanceof ForLoop) { [EOL]                 return processForLoop((ForLoop) node); [EOL]             } else { [EOL]                 throw new IllegalStateException("Unexpected node type.  class: " + node.getClass() + " type: " + Token.typeToName(node.getType())); [EOL]             } [EOL]         case Token.FUNCTION: [EOL]             return processFunctionNode((FunctionNode) node); [EOL]         case Token.GETELEM: [EOL]             return processElementGet((ElementGet) node); [EOL]         case Token.GETPROP: [EOL]             return processPropertyGet((PropertyGet) node); [EOL]         case Token.HOOK: [EOL]             return processConditionalExpression((ConditionalExpression) node); [EOL]         case Token.IF: [EOL]             return processIfStatement((IfStatement) node); [EOL]         case Token.LABEL: [EOL]             return processLabel((Label) node); [EOL]         case Token.LP: [EOL]             return processParenthesizedExpression((ParenthesizedExpression) node); [EOL]         case Token.NAME: [EOL]             return processName((Name) node); [EOL]         case Token.NEW: [EOL]             return processNewExpression((NewExpression) node); [EOL]         case Token.NUMBER: [EOL]             return processNumberLiteral((NumberLiteral) node); [EOL]         case Token.OBJECTLIT: [EOL]             return processObjectLiteral((ObjectLiteral) node); [EOL]         case Token.REGEXP: [EOL]             return processRegExpLiteral((RegExpLiteral) node); [EOL]         case Token.RETURN: [EOL]             return processReturnStatement((ReturnStatement) node); [EOL]         case Token.SCRIPT: [EOL]             return processAstRoot((AstRoot) node); [EOL]         case Token.STRING: [EOL]             return processStringLiteral((StringLiteral) node); [EOL]         case Token.SWITCH: [EOL]             return processSwitchStatement((SwitchStatement) node); [EOL]         case Token.THROW: [EOL]             return processThrowStatement((ThrowStatement) node); [EOL]         case Token.TRY: [EOL]             return processTryStatement((TryStatement) node); [EOL]         case Token.CONST: [EOL]         case Token.VAR: [EOL]             if (node instanceof VariableDeclaration) { [EOL]                 return processVariableDeclaration((VariableDeclaration) node); [EOL]             } else if (node instanceof VariableInitializer) { [EOL]                 return processVariableInitializer((VariableInitializer) node); [EOL]             } else { [EOL]                 throw new IllegalStateException("Unexpected node type.  class: " + node.getClass() + " type: " + Token.typeToName(node.getType())); [EOL]             } [EOL]         case Token.WHILE: [EOL]             return processWhileLoop((WhileLoop) node); [EOL]         case Token.WITH: [EOL]             return processWithStatement((WithStatement) node); [EOL]     } [EOL]     return processIllegalToken(node); [EOL] } <line_num>: 120,285