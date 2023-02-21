public TrapezoidIntegrator(final double relativeAccuracy, final double absoluteAccuracy, final int minimalIterationCount, final int maximalIterationCount) throws NotStrictlyPositiveException, NumberIsTooSmallException, NumberIsTooLargeException { [EOL]     super(relativeAccuracy, absoluteAccuracy, minimalIterationCount, maximalIterationCount); [EOL]     if (maximalIterationCount > TRAPEZOID_MAX_ITERATIONS_COUNT) { [EOL]         throw new NumberIsTooLargeException(maximalIterationCount, TRAPEZOID_MAX_ITERATIONS_COUNT, false); [EOL]     } [EOL] } <line_num>: 60,70
public TrapezoidIntegrator(final int minimalIterationCount, final int maximalIterationCount) throws NotStrictlyPositiveException, NumberIsTooSmallException, NumberIsTooLargeException { [EOL]     super(minimalIterationCount, maximalIterationCount); [EOL]     if (maximalIterationCount > TRAPEZOID_MAX_ITERATIONS_COUNT) { [EOL]         throw new NumberIsTooLargeException(maximalIterationCount, TRAPEZOID_MAX_ITERATIONS_COUNT, false); [EOL]     } [EOL] } <line_num>: 84,92
public TrapezoidIntegrator() { [EOL]     super(DEFAULT_MIN_ITERATIONS_COUNT, TRAPEZOID_MAX_ITERATIONS_COUNT); [EOL] } <line_num>: 98,100
double stage(final BaseAbstractUnivariateIntegrator baseIntegrator, final int n) throws TooManyEvaluationsException { [EOL]     if (n == 0) { [EOL]         final double max = baseIntegrator.getMax(); [EOL]         final double min = baseIntegrator.getMin(); [EOL]         s = 0.5 * (max - min) * (baseIntegrator.computeObjectiveValue(min) + baseIntegrator.computeObjectiveValue(max)); [EOL]         return s; [EOL]     } else { [EOL]         final long np = 1L << (n - 1); [EOL]         double sum = 0; [EOL]         final double max = baseIntegrator.getMax(); [EOL]         final double min = baseIntegrator.getMin(); [EOL]         final double spacing = (max - min) / np; [EOL]         double x = min + 0.5 * spacing; [EOL]         for (long i = 0; i < np; i++) { [EOL]             sum += baseIntegrator.computeObjectiveValue(x); [EOL]             x += spacing; [EOL]         } [EOL]         s = 0.5 * (s + sum * spacing); [EOL]         return s; [EOL]     } [EOL] } <line_num>: 117,143
@Override [EOL] protected double doIntegrate() throws MathIllegalArgumentException, TooManyEvaluationsException, MaxCountExceededException { [EOL]     double oldt = stage(this, 0); [EOL]     iterations.incrementCount(); [EOL]     while (true) { [EOL]         final int i = iterations.getCount(); [EOL]         final double t = stage(this, i); [EOL]         if (i >= getMinimalIterationCount()) { [EOL]             final double delta = FastMath.abs(t - oldt); [EOL]             final double rLimit = getRelativeAccuracy() * (FastMath.abs(oldt) + FastMath.abs(t)) * 0.5; [EOL]             if ((delta <= rLimit) || (delta <= getAbsoluteAccuracy())) { [EOL]                 return t; [EOL]             } [EOL]         } [EOL]         oldt = t; [EOL]         iterations.incrementCount(); [EOL]     } [EOL] } <line_num>: 146,167