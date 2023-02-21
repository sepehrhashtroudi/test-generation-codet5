public WeibullDistribution(double alpha, double beta) throws NotStrictlyPositiveException { [EOL]     this(alpha, beta, DEFAULT_INVERSE_ABSOLUTE_ACCURACY); [EOL] } <line_num>: 71,74
public WeibullDistribution(double alpha, double beta, double inverseCumAccuracy) { [EOL]     this(new Well19937c(), alpha, beta, inverseCumAccuracy); [EOL] } <line_num>: 89,92
public WeibullDistribution(RandomGenerator rng, double alpha, double beta, double inverseCumAccuracy) throws NotStrictlyPositiveException { [EOL]     super(rng); [EOL]     if (alpha <= 0) { [EOL]         throw new NotStrictlyPositiveException(LocalizedFormats.SHAPE, alpha); [EOL]     } [EOL]     if (beta <= 0) { [EOL]         throw new NotStrictlyPositiveException(LocalizedFormats.SCALE, beta); [EOL]     } [EOL]     scale = beta; [EOL]     shape = alpha; [EOL]     solverAbsoluteAccuracy = inverseCumAccuracy; [EOL] } <line_num>: 107,125
public double getShape() { [EOL]     return shape; [EOL] } <line_num>: 132,134
public double getScale() { [EOL]     return scale; [EOL] } <line_num>: 141,143
public double density(double x) { [EOL]     if (x < 0) { [EOL]         return 0; [EOL]     } [EOL]     final double xscale = x / scale; [EOL]     final double xscalepow = FastMath.pow(xscale, shape - 1); [EOL]     final double xscalepowshape = xscalepow * xscale; [EOL]     return (shape / scale) * xscalepow * FastMath.exp(-xscalepowshape); [EOL] } <line_num>: 146,162
public double cumulativeProbability(double x) { [EOL]     double ret; [EOL]     if (x <= 0.0) { [EOL]         ret = 0.0; [EOL]     } else { [EOL]         ret = 1.0 - FastMath.exp(-FastMath.pow(x / scale, shape)); [EOL]     } [EOL]     return ret; [EOL] } <line_num>: 165,173
@Override [EOL] public double inverseCumulativeProbability(double p) { [EOL]     double ret; [EOL]     if (p < 0.0 || p > 1.0) { [EOL]         throw new OutOfRangeException(p, 0.0, 1.0); [EOL]     } else if (p == 0) { [EOL]         ret = 0.0; [EOL]     } else if (p == 1) { [EOL]         ret = Double.POSITIVE_INFINITY; [EOL]     } else { [EOL]         ret = scale * FastMath.pow(-FastMath.log(1.0 - p), 1.0 / shape); [EOL]     } [EOL]     return ret; [EOL] } <line_num>: 181,194
@Override [EOL] protected double getSolverAbsoluteAccuracy() { [EOL]     return solverAbsoluteAccuracy; [EOL] } <line_num>: 203,206
public double getNumericalMean() { [EOL]     if (!numericalMeanIsCalculated) { [EOL]         numericalMean = calculateNumericalMean(); [EOL]         numericalMeanIsCalculated = true; [EOL]     } [EOL]     return numericalMean; [EOL] } <line_num>: 214,220
protected double calculateNumericalMean() { [EOL]     final double sh = getShape(); [EOL]     final double sc = getScale(); [EOL]     return sc * FastMath.exp(Gamma.logGamma(1 + (1 / sh))); [EOL] } <line_num>: 227,232
public double getNumericalVariance() { [EOL]     if (!numericalVarianceIsCalculated) { [EOL]         numericalVariance = calculateNumericalVariance(); [EOL]         numericalVarianceIsCalculated = true; [EOL]     } [EOL]     return numericalVariance; [EOL] } <line_num>: 240,246
protected double calculateNumericalVariance() { [EOL]     final double sh = getShape(); [EOL]     final double sc = getScale(); [EOL]     final double mn = getNumericalMean(); [EOL]     return (sc * sc) * FastMath.exp(Gamma.logGamma(1 + (2 / sh))) - (mn * mn); [EOL] } <line_num>: 253,260
public double getSupportLowerBound() { [EOL]     return 0; [EOL] } <line_num>: 269,271
public double getSupportUpperBound() { [EOL]     return Double.POSITIVE_INFINITY; [EOL] } <line_num>: 282,284
public boolean isSupportLowerBoundInclusive() { [EOL]     return true; [EOL] } <line_num>: 287,289
public boolean isSupportUpperBoundInclusive() { [EOL]     return false; [EOL] } <line_num>: 292,294
public boolean isSupportConnected() { [EOL]     return true; [EOL] } <line_num>: 303,305
