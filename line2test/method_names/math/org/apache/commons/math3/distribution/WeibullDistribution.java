public WeibullDistribution(double alpha, double beta) throws NotStrictlyPositiveException
public WeibullDistribution(double alpha, double beta, double inverseCumAccuracy)
public WeibullDistribution(RandomGenerator rng, double alpha, double beta, double inverseCumAccuracy) throws NotStrictlyPositiveException
public double getShape()
public double getScale()
public double density(double x)
public double cumulativeProbability(double x)
public double inverseCumulativeProbability(double p)
protected double getSolverAbsoluteAccuracy()
public double getNumericalMean()
protected double calculateNumericalMean()
public double getNumericalVariance()
protected double calculateNumericalVariance()
public double getSupportLowerBound()
public double getSupportUpperBound()
public boolean isSupportLowerBoundInclusive()
public boolean isSupportUpperBoundInclusive()
public boolean isSupportConnected()
