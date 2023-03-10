protected MinpackFunction(int m, double[] startParams, double theoreticalMinCost, double[] theoreticalMinParams)
public LinearFullRankFunction(int m, int n, double x0, double theoreticalStartCost, double theoreticalMinCost)
public LinearRank1Function(int m, int n, double x0, double theoreticalStartCost, double theoreticalMinCost)
public LinearRank1ZeroColsAndRowsFunction(int m, int n, double x0)
public RosenbrockFunction(double[] startParams, double theoreticalStartCost)
public HelicalValleyFunction(double[] startParams, double theoreticalStartCost)
public PowellSingularFunction(double[] startParams, double theoreticalStartCost)
public FreudensteinRothFunction(double[] startParams, double theoreticalStartCost, double theoreticalMinCost, double[] theoreticalMinParams)
public BardFunction(double x0, double theoreticalStartCost, double theoreticalMinCost, double[] theoreticalMinParams)
public KowalikOsborneFunction(double[] startParams, double theoreticalStartCost, double theoreticalMinCost, double[] theoreticalMinParams)
public MeyerFunction(double[] startParams, double theoreticalStartCost, double theoreticalMinCost, double[] theoreticalMinParams)
public WatsonFunction(int n, double x0, double theoreticalStartCost, double theoreticalMinCost, double[] theoreticalMinParams)
public Box3DimensionalFunction(int m, double[] startParams, double theoreticalStartCost)
public JennrichSampsonFunction(int m, double[] startParams, double theoreticalStartCost, double theoreticalMinCost, double[] theoreticalMinParams)
public BrownDennisFunction(int m, double[] startParams, double theoreticalStartCost, double theoreticalMinCost, double[] theoreticalMinParams)
public ChebyquadFunction(int n, int m, double factor, double theoreticalStartCost, double theoreticalMinCost, double[] theoreticalMinParams)
public BrownAlmostLinearFunction(int m, double factor, double theoreticalStartCost, double theoreticalMinCost, double[] theoreticalMinParams)
public Osborne1Function(double[] startParams, double theoreticalStartCost, double theoreticalMinCost, double[] theoreticalMinParams)
public Osborne2Function(double[] startParams, double theoreticalStartCost, double theoreticalMinCost, double[] theoreticalMinParams)
public void testMinpackLinearFullRank()
public void testMinpackLinearRank1()
public void testMinpackLinearRank1ZeroColsAndRows()
public void testMinpackRosenbrok()
public void testMinpackHelicalValley()
public void testMinpackPowellSingular()
public void testMinpackFreudensteinRoth()
public void testMinpackBard()
public void testMinpackKowalikOsborne()
public void testMinpackMeyer()
public void testMinpackWatson()
public void testMinpackBox3Dimensional()
public void testMinpackJennrichSampson()
public void testMinpackBrownDennis()
public void testMinpackChebyquad()
public void testMinpackBrownAlmostLinear()
public void testMinpackOsborne1()
public void testMinpackOsborne2()
private void minpackTest(MinpackFunction function, boolean exceptionExpected)
protected static double[] buildArray(int n, double x)
public double[] getTarget()
public double[] getWeight()
public double[] getStartPoint()
protected void setCostAccuracy(double costAccuracy)
protected void setParamsAccuracy(double paramsAccuracy)
public int getN()
public void checkTheoreticalMinCost(double rms)
public void checkTheoreticalMinParams(double[] params)
public double[] value(double[] point)
public MultivariateVectorFunction getModelFunction()
public double[][] value(double[] point)
public MultivariateMatrixFunction getModelFunctionJacobian()
public abstract double[][] computeJacobian(double[] variables)
public abstract double[] computeValue(double[] variables)
public double[][] computeJacobian(double[] variables)
public double[] computeValue(double[] variables)
public double[][] computeJacobian(double[] variables)
public double[] computeValue(double[] variables)
public double[][] computeJacobian(double[] variables)
public double[] computeValue(double[] variables)
public double[][] computeJacobian(double[] variables)
public double[] computeValue(double[] variables)
public double[][] computeJacobian(double[] variables)
public double[] computeValue(double[] variables)
public double[][] computeJacobian(double[] variables)
public double[] computeValue(double[] variables)
public double[][] computeJacobian(double[] variables)
public double[] computeValue(double[] variables)
public double[][] computeJacobian(double[] variables)
public double[] computeValue(double[] variables)
public double[][] computeJacobian(double[] variables)
public double[] computeValue(double[] variables)
public double[][] computeJacobian(double[] variables)
public double[] computeValue(double[] variables)
public double[][] computeJacobian(double[] variables)
public double[] computeValue(double[] variables)
public double[][] computeJacobian(double[] variables)
public double[] computeValue(double[] variables)
public double[][] computeJacobian(double[] variables)
public double[] computeValue(double[] variables)
public double[][] computeJacobian(double[] variables)
public double[] computeValue(double[] variables)
private static double[] buildChebyquadArray(int n, double factor)
public double[][] computeJacobian(double[] variables)
public double[] computeValue(double[] variables)
public double[][] computeJacobian(double[] variables)
public double[] computeValue(double[] variables)
public double[][] computeJacobian(double[] variables)
public double[] computeValue(double[] variables)
public double[][] computeJacobian(double[] variables)
public double[] computeValue(double[] variables)
