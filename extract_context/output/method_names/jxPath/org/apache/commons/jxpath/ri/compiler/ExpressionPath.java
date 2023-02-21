public ExpressionPath(Expression expression, Expression[] predicates, Step[] steps)
public Expression getExpression()
public Expression[] getPredicates()
public boolean computeContextDependent()
public boolean isSimpleExpressionPath()
public String toString()
public Object compute(EvalContext context)
public Object computeValue(EvalContext context)
protected Object expressionPath(EvalContext evalContext, boolean firstMatch)
