public MullerSolver() { [EOL]     this(DEFAULT_ABSOLUTE_ACCURACY); [EOL] } <line_num>: 58,60
public MullerSolver(double absoluteAccuracy) { [EOL]     super(absoluteAccuracy); [EOL] } <line_num>: 66,68
public MullerSolver(double relativeAccuracy, double absoluteAccuracy) { [EOL]     super(relativeAccuracy, absoluteAccuracy); [EOL] } <line_num>: 75,78
@Override [EOL] protected double doSolve() throws TooManyEvaluationsException, NumberIsTooLargeException, NoBracketingException { [EOL]     final double min = getMin(); [EOL]     final double max = getMax(); [EOL]     final double initial = getStartValue(); [EOL]     final double functionValueAccuracy = getFunctionValueAccuracy(); [EOL]     verifySequence(min, initial, max); [EOL]     final double fMin = computeObjectiveValue(min); [EOL]     if (FastMath.abs(fMin) < functionValueAccuracy) { [EOL]         return min; [EOL]     } [EOL]     final double fMax = computeObjectiveValue(max); [EOL]     if (FastMath.abs(fMax) < functionValueAccuracy) { [EOL]         return max; [EOL]     } [EOL]     final double fInitial = computeObjectiveValue(initial); [EOL]     if (FastMath.abs(fInitial) < functionValueAccuracy) { [EOL]         return initial; [EOL]     } [EOL]     verifyBracketing(min, max); [EOL]     if (isBracketing(min, initial)) { [EOL]         return solve(min, initial, fMin, fInitial); [EOL]     } else { [EOL]         return solve(initial, max, fInitial, fMax); [EOL]     } [EOL] } <line_num>: 83,117
private double solve(double min, double max, double fMin, double fMax) throws TooManyEvaluationsException { [EOL]     final double relativeAccuracy = getRelativeAccuracy(); [EOL]     final double absoluteAccuracy = getAbsoluteAccuracy(); [EOL]     final double functionValueAccuracy = getFunctionValueAccuracy(); [EOL]     double x0 = min; [EOL]     double y0 = fMin; [EOL]     double x2 = max; [EOL]     double y2 = fMax; [EOL]     double x1 = 0.5 * (x0 + x2); [EOL]     double y1 = computeObjectiveValue(x1); [EOL]     double oldx = Double.POSITIVE_INFINITY; [EOL]     while (true) { [EOL]         final double d01 = (y1 - y0) / (x1 - x0); [EOL]         final double d12 = (y2 - y1) / (x2 - x1); [EOL]         final double d012 = (d12 - d01) / (x2 - x0); [EOL]         final double c1 = d01 + (x1 - x0) * d012; [EOL]         final double delta = c1 * c1 - 4 * y1 * d012; [EOL]         final double xplus = x1 + (-2.0 * y1) / (c1 + FastMath.sqrt(delta)); [EOL]         final double xminus = x1 + (-2.0 * y1) / (c1 - FastMath.sqrt(delta)); [EOL]         final double x = isSequence(x0, xplus, x2) ? xplus : xminus; [EOL]         final double y = computeObjectiveValue(x); [EOL]         final double tolerance = FastMath.max(relativeAccuracy * FastMath.abs(x), absoluteAccuracy); [EOL]         if (FastMath.abs(x - oldx) <= tolerance || FastMath.abs(y) <= functionValueAccuracy) { [EOL]             return x; [EOL]         } [EOL]         boolean bisect = (x < x1 && (x1 - x0) > 0.95 * (x2 - x0)) || (x > x1 && (x2 - x1) > 0.95 * (x2 - x0)) || (x == x1); [EOL]         if (!bisect) { [EOL]             x0 = x < x1 ? x0 : x1; [EOL]             y0 = x < x1 ? y0 : y1; [EOL]             x2 = x > x1 ? x2 : x1; [EOL]             y2 = x > x1 ? y2 : y1; [EOL]             x1 = x; [EOL]             y1 = y; [EOL]             oldx = x; [EOL]         } else { [EOL]             double xm = 0.5 * (x0 + x2); [EOL]             double ym = computeObjectiveValue(xm); [EOL]             if (FastMath.signum(y0) + FastMath.signum(ym) == 0.0) { [EOL]                 x2 = xm; [EOL]                 y2 = ym; [EOL]             } else { [EOL]                 x0 = xm; [EOL]                 y0 = ym; [EOL]             } [EOL]             x1 = 0.5 * (x0 + x2); [EOL]             y1 = computeObjectiveValue(x1); [EOL]             oldx = Double.POSITIVE_INFINITY; [EOL]         } [EOL]     } [EOL] } <line_num>: 130,202