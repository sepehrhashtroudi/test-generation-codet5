public IterativeLegendreGaussIntegrator(final int n, final double relativeAccuracy, final double absoluteAccuracy, final int minimalIterationCount, final int maximalIterationCount) throws NotStrictlyPositiveException, NumberIsTooSmallException { [EOL]     super(relativeAccuracy, absoluteAccuracy, minimalIterationCount, maximalIterationCount); [EOL]     if (n <= 0) { [EOL]         throw new NotStrictlyPositiveException(LocalizedFormats.NUMBER_OF_POINTS, n); [EOL]     } [EOL]     numberOfPoints = n; [EOL] } <line_num>: 69,80
public IterativeLegendreGaussIntegrator(final int n, final double relativeAccuracy, final double absoluteAccuracy) throws NotStrictlyPositiveException { [EOL]     this(n, relativeAccuracy, absoluteAccuracy, DEFAULT_MIN_ITERATIONS_COUNT, DEFAULT_MAX_ITERATIONS_COUNT); [EOL] } <line_num>: 90,96
public IterativeLegendreGaussIntegrator(final int n, final int minimalIterationCount, final int maximalIterationCount) throws NotStrictlyPositiveException, NumberIsTooSmallException { [EOL]     this(n, DEFAULT_RELATIVE_ACCURACY, DEFAULT_ABSOLUTE_ACCURACY, minimalIterationCount, maximalIterationCount); [EOL] } <line_num>: 110,116
@Override [EOL] protected double doIntegrate() throws MathIllegalArgumentException, TooManyEvaluationsException, MaxCountExceededException { [EOL]     double oldt = stage(1); [EOL]     int n = 2; [EOL]     while (true) { [EOL]         final double t = stage(n); [EOL]         final double delta = FastMath.abs(t - oldt); [EOL]         final double limit = FastMath.max(getAbsoluteAccuracy(), getRelativeAccuracy() * (FastMath.abs(oldt) + FastMath.abs(t)) * 0.5); [EOL]         if (iterations.getCount() + 1 >= getMinimalIterationCount() && delta <= limit) { [EOL]             return t; [EOL]         } [EOL]         final double ratio = FastMath.min(4, FastMath.pow(delta / limit, 0.5 / numberOfPoints)); [EOL]         n = FastMath.max((int) (ratio * n), n + 1); [EOL]         oldt = t; [EOL]         iterations.incrementCount(); [EOL]     } [EOL] } <line_num>: 119,148
public double value(double x) throws MathIllegalArgumentException, TooManyEvaluationsException { [EOL]     return computeObjectiveValue(x); [EOL] } <line_num>: 162,165
private double stage(final int n) throws TooManyEvaluationsException { [EOL]     final UnivariateFunction f = new UnivariateFunction() { [EOL]  [EOL]         public double value(double x) throws MathIllegalArgumentException, TooManyEvaluationsException { [EOL]             return computeObjectiveValue(x); [EOL]         } [EOL]     }; [EOL]     final double min = getMin(); [EOL]     final double max = getMax(); [EOL]     final double step = (max - min) / n; [EOL]     double sum = 0; [EOL]     for (int i = 0; i < n; i++) { [EOL]         final double a = min + i * step; [EOL]         final double b = a + step; [EOL]         final GaussIntegrator g = FACTORY.legendreHighPrecision(numberOfPoints, a, b); [EOL]         sum += g.integrate(f); [EOL]     } [EOL]     return sum; [EOL] } <line_num>: 158,182