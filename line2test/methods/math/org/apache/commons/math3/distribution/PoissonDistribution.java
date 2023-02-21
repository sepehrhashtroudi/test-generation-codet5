public PoissonDistribution(double p) throws NotStrictlyPositiveException { [EOL]     this(p, DEFAULT_EPSILON, DEFAULT_MAX_ITERATIONS); [EOL] } <line_num>: 73,75
public PoissonDistribution(double p, double epsilon, int maxIterations) throws NotStrictlyPositiveException { [EOL]     this(new Well19937c(), p, epsilon, maxIterations); [EOL] } <line_num>: 88,91
public PoissonDistribution(RandomGenerator rng, double p, double epsilon, int maxIterations) throws NotStrictlyPositiveException { [EOL]     super(rng); [EOL]     if (p <= 0) { [EOL]         throw new NotStrictlyPositiveException(LocalizedFormats.MEAN, p); [EOL]     } [EOL]     mean = p; [EOL]     this.epsilon = epsilon; [EOL]     this.maxIterations = maxIterations; [EOL]     normal = new NormalDistribution(rng, p, FastMath.sqrt(p), NormalDistribution.DEFAULT_INVERSE_ABSOLUTE_ACCURACY); [EOL]     exponential = new ExponentialDistribution(rng, 1, ExponentialDistribution.DEFAULT_INVERSE_ABSOLUTE_ACCURACY); [EOL] } <line_num>: 105,124
public PoissonDistribution(double p, double epsilon) throws NotStrictlyPositiveException { [EOL]     this(p, epsilon, DEFAULT_MAX_ITERATIONS); [EOL] } <line_num>: 135,138
public PoissonDistribution(double p, int maxIterations) { [EOL]     this(p, DEFAULT_EPSILON, maxIterations); [EOL] } <line_num>: 149,151
public double getMean() { [EOL]     return mean; [EOL] } <line_num>: 158,160
public double probability(int x) { [EOL]     double ret; [EOL]     if (x < 0 || x == Integer.MAX_VALUE) { [EOL]         ret = 0.0; [EOL]     } else if (x == 0) { [EOL]         ret = FastMath.exp(-mean); [EOL]     } else { [EOL]         ret = FastMath.exp(-SaddlePointExpansion.getStirlingError(x) - SaddlePointExpansion.getDeviancePart(x, mean)) / FastMath.sqrt(MathUtils.TWO_PI * x); [EOL]     } [EOL]     return ret; [EOL] } <line_num>: 163,175
public double cumulativeProbability(int x) { [EOL]     if (x < 0) { [EOL]         return 0; [EOL]     } [EOL]     if (x == Integer.MAX_VALUE) { [EOL]         return 1; [EOL]     } [EOL]     return Gamma.regularizedGammaQ((double) x + 1, mean, epsilon, maxIterations); [EOL] } <line_num>: 178,187
public double normalApproximateProbability(int x) { [EOL]     return normal.cumulativeProbability(x + 0.5); [EOL] } <line_num>: 200,203
public double getNumericalMean() { [EOL]     return getMean(); [EOL] } <line_num>: 210,212
public double getNumericalVariance() { [EOL]     return getMean(); [EOL] } <line_num>: 219,221
public int getSupportLowerBound() { [EOL]     return 0; [EOL] } <line_num>: 230,232
public int getSupportUpperBound() { [EOL]     return Integer.MAX_VALUE; [EOL] } <line_num>: 244,246
public boolean isSupportConnected() { [EOL]     return true; [EOL] } <line_num>: 255,257
@Override [EOL] public int sample() { [EOL]     return (int) FastMath.min(nextPoisson(mean), Integer.MAX_VALUE); [EOL] } <line_num>: 281,284
private long nextPoisson(double meanPoisson) { [EOL]     final double pivot = 40.0d; [EOL]     if (meanPoisson < pivot) { [EOL]         double p = FastMath.exp(-meanPoisson); [EOL]         long n = 0; [EOL]         double r = 1.0d; [EOL]         double rnd = 1.0d; [EOL]         while (n < 1000 * meanPoisson) { [EOL]             rnd = random.nextDouble(); [EOL]             r = r * rnd; [EOL]             if (r >= p) { [EOL]                 n++; [EOL]             } else { [EOL]                 return n; [EOL]             } [EOL]         } [EOL]         return n; [EOL]     } else { [EOL]         final double lambda = FastMath.floor(meanPoisson); [EOL]         final double lambdaFractional = meanPoisson - lambda; [EOL]         final double logLambda = FastMath.log(lambda); [EOL]         final double logLambdaFactorial = CombinatoricsUtils.factorialLog((int) lambda); [EOL]         final long y2 = lambdaFractional < Double.MIN_VALUE ? 0 : nextPoisson(lambdaFractional); [EOL]         final double delta = FastMath.sqrt(lambda * FastMath.log(32 * lambda / FastMath.PI + 1)); [EOL]         final double halfDelta = delta / 2; [EOL]         final double twolpd = 2 * lambda + delta; [EOL]         final double a1 = FastMath.sqrt(FastMath.PI * twolpd) * FastMath.exp(1 / 8 * lambda); [EOL]         final double a2 = (twolpd / delta) * FastMath.exp(-delta * (1 + delta) / twolpd); [EOL]         final double aSum = a1 + a2 + 1; [EOL]         final double p1 = a1 / aSum; [EOL]         final double p2 = a2 / aSum; [EOL]         final double c1 = 1 / (8 * lambda); [EOL]         double x = 0; [EOL]         double y = 0; [EOL]         double v = 0; [EOL]         int a = 0; [EOL]         double t = 0; [EOL]         double qr = 0; [EOL]         double qa = 0; [EOL]         for (; ; ) { [EOL]             final double u = random.nextDouble(); [EOL]             if (u <= p1) { [EOL]                 final double n = random.nextGaussian(); [EOL]                 x = n * FastMath.sqrt(lambda + halfDelta) - 0.5d; [EOL]                 if (x > delta || x < -lambda) { [EOL]                     continue; [EOL]                 } [EOL]                 y = x < 0 ? FastMath.floor(x) : FastMath.ceil(x); [EOL]                 final double e = exponential.sample(); [EOL]                 v = -e - (n * n / 2) + c1; [EOL]             } else { [EOL]                 if (u > p1 + p2) { [EOL]                     y = lambda; [EOL]                     break; [EOL]                 } else { [EOL]                     x = delta + (twolpd / delta) * exponential.sample(); [EOL]                     y = FastMath.ceil(x); [EOL]                     v = -exponential.sample() - delta * (x + 1) / twolpd; [EOL]                 } [EOL]             } [EOL]             a = x < 0 ? 1 : 0; [EOL]             t = y * (y + 1) / (2 * lambda); [EOL]             if (v < -t && a == 0) { [EOL]                 y = lambda + y; [EOL]                 break; [EOL]             } [EOL]             qr = t * ((2 * y + 1) / (6 * lambda) - 1); [EOL]             qa = qr - (t * t) / (3 * (lambda + a * (y + 1))); [EOL]             if (v < qa) { [EOL]                 y = lambda + y; [EOL]                 break; [EOL]             } [EOL]             if (v > qr) { [EOL]                 continue; [EOL]             } [EOL]             if (v < y * logLambda - CombinatoricsUtils.factorialLog((int) (y + lambda)) + logLambdaFactorial) { [EOL]                 y = lambda + y; [EOL]                 break; [EOL]             } [EOL]         } [EOL]         return y2 + (long) y; [EOL]     } [EOL] } <line_num>: 290,374