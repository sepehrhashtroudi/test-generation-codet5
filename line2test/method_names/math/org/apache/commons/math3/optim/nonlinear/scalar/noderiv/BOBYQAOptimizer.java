public BOBYQAOptimizer(int numberOfInterpolationPoints)
public BOBYQAOptimizer(int numberOfInterpolationPoints, double initialTrustRegionRadius, double stoppingTrustRegionRadius)
 PathIsExploredException()
protected PointValuePair doOptimize()
private double bobyqa(double[] lowerBound, double[] upperBound)
private double bobyqb(double[] lowerBound, double[] upperBound)
private double[] altmov(int knew, double adelt)
private void prelim(double[] lowerBound, double[] upperBound)
private double[] trsbox(double delta, ArrayRealVector gnew, ArrayRealVector xbdi, ArrayRealVector s, ArrayRealVector hs, ArrayRealVector hred)
private void update(double beta, double denom, int knew)
private void setup(double[] lowerBound, double[] upperBound)
private static String caller(int n)
private static void printState(int s)
private static void printMethod()