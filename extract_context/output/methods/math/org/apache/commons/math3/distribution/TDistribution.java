public TDistribution(double degreesOfFreedom) throws NotStrictlyPositiveException { [EOL]     this(degreesOfFreedom, DEFAULT_INVERSE_ABSOLUTE_ACCURACY); [EOL] } <line_num>: 53,56
public TDistribution(double degreesOfFreedom, double inverseCumAccuracy) throws NotStrictlyPositiveException { [EOL]     this(new Well19937c(), degreesOfFreedom, inverseCumAccuracy); [EOL] } <line_num>: 69,72
public TDistribution(RandomGenerator rng, double degreesOfFreedom, double inverseCumAccuracy) throws NotStrictlyPositiveException { [EOL]     super(rng); [EOL]     if (degreesOfFreedom <= 0) { [EOL]         throw new NotStrictlyPositiveException(LocalizedFormats.DEGREES_OF_FREEDOM, degreesOfFreedom); [EOL]     } [EOL]     this.degreesOfFreedom = degreesOfFreedom; [EOL]     solverAbsoluteAccuracy = inverseCumAccuracy; [EOL] } <line_num>: 85,97
public double getDegreesOfFreedom() { [EOL]     return degreesOfFreedom; [EOL] } <line_num>: 104,106
public double density(double x) { [EOL]     final double n = degreesOfFreedom; [EOL]     final double nPlus1Over2 = (n + 1) / 2; [EOL]     return FastMath.exp(Gamma.logGamma(nPlus1Over2) - 0.5 * (FastMath.log(FastMath.PI) + FastMath.log(n)) - Gamma.logGamma(n / 2) - nPlus1Over2 * FastMath.log(1 + x * x / n)); [EOL] } <line_num>: 109,117
public double cumulativeProbability(double x) { [EOL]     double ret; [EOL]     if (x == 0) { [EOL]         ret = 0.5; [EOL]     } else { [EOL]         double t = Beta.regularizedBeta(degreesOfFreedom / (degreesOfFreedom + (x * x)), 0.5 * degreesOfFreedom, 0.5); [EOL]         if (x < 0.0) { [EOL]             ret = 0.5 * t; [EOL]         } else { [EOL]             ret = 1.0 - 0.5 * t; [EOL]         } [EOL]     } [EOL]     return ret; [EOL] } <line_num>: 120,138
@Override [EOL] protected double getSolverAbsoluteAccuracy() { [EOL]     return solverAbsoluteAccuracy; [EOL] } <line_num>: 141,144
public double getNumericalMean() { [EOL]     final double df = getDegreesOfFreedom(); [EOL]     if (df > 1) { [EOL]         return 0; [EOL]     } [EOL]     return Double.NaN; [EOL] } <line_num>: 155,163
public double getNumericalVariance() { [EOL]     final double df = getDegreesOfFreedom(); [EOL]     if (df > 2) { [EOL]         return df / (df - 2); [EOL]     } [EOL]     if (df > 1 && df <= 2) { [EOL]         return Double.POSITIVE_INFINITY; [EOL]     } [EOL]     return Double.NaN; [EOL] } <line_num>: 176,188
public double getSupportLowerBound() { [EOL]     return Double.NEGATIVE_INFINITY; [EOL] } <line_num>: 199,201
public double getSupportUpperBound() { [EOL]     return Double.POSITIVE_INFINITY; [EOL] } <line_num>: 212,214
public boolean isSupportLowerBoundInclusive() { [EOL]     return false; [EOL] } <line_num>: 217,219
public boolean isSupportUpperBoundInclusive() { [EOL]     return false; [EOL] } <line_num>: 222,224
public boolean isSupportConnected() { [EOL]     return true; [EOL] } <line_num>: 233,235
