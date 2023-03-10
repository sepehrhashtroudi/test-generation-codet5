protected LevenbergMarquardtOptimizer()
protected LevenbergMarquardtOptimizer(LevenbergMarquardtOptimizer other)
 InternalData(double[][] weightedJacobian, int[] permutation, int rank, double[] diagR, double[] jacNorm, double[] beta)
public static LevenbergMarquardtOptimizer create()
public LevenbergMarquardtOptimizer shallowCopy()
public LevenbergMarquardtOptimizer withInitialStepBoundFactor(double newInitialStepBoundFactor)
public LevenbergMarquardtOptimizer withCostRelativeTolerance(double newCostRelativeTolerance)
public LevenbergMarquardtOptimizer withParameterRelativeTolerance(double parameterRelativeTolerance)
public LevenbergMarquardtOptimizer withOrthoTolerance(double newOrthoTolerance)
public LevenbergMarquardtOptimizer withRankingThreshold(double rankingThreshold)
public double getInitialStepBoundFactor()
public double getCostRelativeTolerance()
public double getParameterRelativeTolerance()
public double getOrthoTolerance()
public double getRankingThreshold()
protected PointVectorValuePair doOptimize()
private void determineLMParameter(double[] qy, double delta, double[] diag, InternalData internalData, int solvedCols, double[] work1, double[] work2, double[] work3)
private void determineLMDirection(double[] qy, double[] diag, double[] lmDiag, InternalData internalData, int solvedCols, double[] work)
private InternalData qrDecomposition(RealMatrix jacobian, int solvedCols) throws ConvergenceException
private void qTy(double[] y, InternalData internalData)
