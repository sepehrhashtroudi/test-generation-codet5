private IR()
public static Node empty()
public static Node function(Node name, Node params, Node body)
public static Node paramList()
public static Node paramList(Node param)
public static Node paramList(Node... params)
public static Node paramList(List<Node> params)
public static Node block()
public static Node block(Node stmt)
public static Node block(Node... stmts)
public static Node block(List<Node> stmts)
private static Node blockUnchecked(Node stmt)
public static Node script()
public static Node script(Node... stmts)
public static Node script(List<Node> stmts)
public static Node var(Node name, Node value)
public static Node var(Node name)
public static Node returnNode()
public static Node returnNode(Node expr)
public static Node throwNode(Node expr)
public static Node exprResult(Node expr)
public static Node ifNode(Node cond, Node then)
public static Node ifNode(Node cond, Node then, Node elseNode)
public static Node doNode(Node body, Node cond)
public static Node forIn(Node target, Node cond, Node body)
public static Node forNode(Node init, Node cond, Node incr, Node body)
public static Node switchNode(Node cond, Node... cases)
public static Node caseNode(Node expr, Node body)
public static Node defaultCase(Node body)
public static Node label(Node name, Node stmt)
public static Node labelName(String name)
public static Node tryFinally(Node tryBody, Node finallyBody)
public static Node tryCatch(Node tryBody, Node catchNode)
public static Node tryCatchFinally(Node tryBody, Node catchNode, Node finallyBody)
public static Node catchNode(Node expr, Node body)
public static Node breakNode()
public static Node breakNode(Node name)
public static Node continueNode()
public static Node continueNode(Node name)
public static Node call(Node target, Node... args)
public static Node newNode(Node target, Node... args)
public static Node name(String name)
public static Node getprop(Node target, Node prop)
public static Node getelem(Node target, Node elem)
public static Node assign(Node target, Node expr)
public static Node hook(Node cond, Node trueval, Node falseval)
public static Node comma(Node expr1, Node expr2)
public static Node and(Node expr1, Node expr2)
public static Node or(Node expr1, Node expr2)
public static Node not(Node expr1)
public static Node eq(Node expr1, Node expr2)
public static Node sheq(Node expr1, Node expr2)
public static Node voidNode(Node expr1)
public static Node neg(Node expr1)
public static Node pos(Node expr1)
public static Node add(Node expr1, Node expr2)
public static Node sub(Node expr1, Node expr2)
public static Node objectlit(Node... propdefs)
public static Node propdef(Node string, Node value)
public static Node arraylit(Node... exprs)
public static Node regexp(Node expr)
public static Node regexp(Node expr, Node flags)
public static Node string(String s)
public static Node stringKey(String s)
public static Node number(double d)
public static Node thisNode()
public static Node trueNode()
public static Node falseNode()
public static Node nullNode()
private static Node binaryOp(int token, Node expr1, Node expr2)
private static Node unaryOp(int token, Node expr)
private static boolean mayBeExpressionOrEmpty(Node n)
private static boolean isAssignmentTarget(Node n)
private static boolean mayBeStatementNoReturn(Node n)
private static boolean mayBeStatement(Node n)
private static boolean mayBeExpression(Node n)
