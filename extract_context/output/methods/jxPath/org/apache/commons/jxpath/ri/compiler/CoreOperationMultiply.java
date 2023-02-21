public CoreOperationMultiply(Expression arg1, Expression arg2) { [EOL]     super(new Expression[] { arg1, arg2 }); [EOL] } <line_num>: 30,32
public Object computeValue(EvalContext context) { [EOL]     double l = InfoSetUtil.doubleValue(args[0].computeValue(context)); [EOL]     double r = InfoSetUtil.doubleValue(args[1].computeValue(context)); [EOL]     return new Double(l * r); [EOL] } <line_num>: 34,38
protected int getPrecedence() { [EOL]     return 5; [EOL] } <line_num>: 40,42
protected boolean isSymmetric() { [EOL]     return true; [EOL] } <line_num>: 44,46
public String getSymbol() { [EOL]     return "*"; [EOL] } <line_num>: 48,50
