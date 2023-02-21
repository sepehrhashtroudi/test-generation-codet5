public RiddersSolver() { [EOL]     this(DEFAULT_ABSOLUTE_ACCURACY); [EOL] } <line_num>: 42,44
public RiddersSolver(double absoluteAccuracy) { [EOL]     super(absoluteAccuracy); [EOL] } <line_num>: 50,52
public RiddersSolver(double relativeAccuracy, double absoluteAccuracy) { [EOL]     super(relativeAccuracy, absoluteAccuracy); [EOL] } <line_num>: 59,62
@Override [EOL] protected double doSolve() throws TooManyEvaluationsException, NoBracketingException { [EOL]     double min = getMin(); [EOL]     double max = getMax(); [EOL]     double x1 = min; [EOL]     double y1 = computeObjectiveValue(x1); [EOL]     double x2 = max; [EOL]     double y2 = computeObjectiveValue(x2); [EOL]     if (y1 == 0) { [EOL]         return min; [EOL]     } [EOL]     if (y2 == 0) { [EOL]         return max; [EOL]     } [EOL]     verifyBracketing(min, max); [EOL]     final double absoluteAccuracy = getAbsoluteAccuracy(); [EOL]     final double functionValueAccuracy = getFunctionValueAccuracy(); [EOL]     final double relativeAccuracy = getRelativeAccuracy(); [EOL]     double oldx = Double.POSITIVE_INFINITY; [EOL]     while (true) { [EOL]         final double x3 = 0.5 * (x1 + x2); [EOL]         final double y3 = computeObjectiveValue(x3); [EOL]         if (FastMath.abs(y3) <= functionValueAccuracy) { [EOL]             return x3; [EOL]         } [EOL]         final double delta = 1 - (y1 * y2) / (y3 * y3); [EOL]         final double correction = (FastMath.signum(y2) * FastMath.signum(y3)) * (x3 - x1) / FastMath.sqrt(delta); [EOL]         final double x = x3 - correction; [EOL]         final double y = computeObjectiveValue(x); [EOL]         final double tolerance = FastMath.max(relativeAccuracy * FastMath.abs(x), absoluteAccuracy); [EOL]         if (FastMath.abs(x - oldx) <= tolerance) { [EOL]             return x; [EOL]         } [EOL]         if (FastMath.abs(y) <= functionValueAccuracy) { [EOL]             return x; [EOL]         } [EOL]         if (correction > 0.0) { [EOL]             if (FastMath.signum(y1) + FastMath.signum(y) == 0.0) { [EOL]                 x2 = x; [EOL]                 y2 = y; [EOL]             } else { [EOL]                 x1 = x; [EOL]                 x2 = x3; [EOL]                 y1 = y; [EOL]                 y2 = y3; [EOL]             } [EOL]         } else { [EOL]             if (FastMath.signum(y2) + FastMath.signum(y) == 0.0) { [EOL]                 x1 = x; [EOL]                 y1 = y; [EOL]             } else { [EOL]                 x1 = x3; [EOL]                 x2 = x; [EOL]                 y1 = y3; [EOL]                 y2 = y; [EOL]             } [EOL]         } [EOL]         oldx = x; [EOL]     } [EOL] } <line_num>: 67,142
