protected BaseMultivariateVectorMultiStartOptimizer(final BaseMultivariateVectorOptimizer<FUNC> optimizer, final int starts, final RandomVectorGenerator generator)
public PointVectorValuePair[] getOptima()
public int getMaxEvaluations()
public int getEvaluations()
public ConvergenceChecker<PointVectorValuePair> getConvergenceChecker()
public PointVectorValuePair optimize(int maxEval, final FUNC f, double[] target, double[] weights, double[] startPoint)
public int compare(final PointVectorValuePair o1, final PointVectorValuePair o2)
private double weightedResidual(final PointVectorValuePair pv)
private void sortPairs(final double[] target, final double[] weights)
